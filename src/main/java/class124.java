import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class124 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field2047 = 4;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[S")
    private short[] field2043 = new short[512];

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field2046 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    private int field2048 = 4;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public int field2051 = 4;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    private int field2044 = 4;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lgb;")
    public static class212 field2053 = new class212(30);

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field2055 = 0;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field2057 = 128;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lgb;")
    public static class212 field2054 = new class212(50);

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Ltl;")
    private static class59 field2059 = class85.method639("Close", 9588);

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Ltl;")
    public static class59 field2060 = field2059;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2056;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[S")
    private short[] field2045;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V", line = 14)
    public final void method917(int arg0, int arg1, int arg2, int arg3) {
        field2050++;
        if (arg1 <= 102) {
            this.method920(-115);
        }
        int[] var5 = new int[arg0];
        for (int var6 = 0; var6 < arg0; var6++) {
            var5[var6] = (var6 << 12) / arg0;
        }
        int[] var7 = new int[arg3];
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg3; var9++) {
            var7[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method510(204);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field2051; var14++) {
                        int var15 = this.field2045[var14] << 12;
                        int var16 = var8[var11] * var15 >> 12;
                        int var17 = this.field2044 * var15 >> 12;
                        int var18 = this.field2044 * var16;
                        int var19 = var7[var12] * var15 >> 12;
                        int var20 = this.field2047 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = var18 >> 12;
                        int var23 = this.field2048 * var15 >> 12;
                        int var24 = this.field2048 * var21;
                        int var25 = var18 & 0xFFF;
                        int var26 = class119.field1951[var25];
                        int var27 = this.field2047 * var19;
                        int var28 = var24 >> 12;
                        int var29 = var25 - 4096;
                        int var30 = var28 + 1;
                        int var31 = var24 & 0xFFF;
                        int var32 = var27 >> 12;
                        int var33;
                        if (var30 >= var23) {
                            var33 = 0;
                        } else {
                            var33 = var30 & 0xFF;
                        }
                        int var34 = var31 - 4096;
                        int var35 = var32 + 1;
                        int var36 = var28 & 0xFF;
                        int var37 = class119.field1951[var31];
                        int var38 = var22 + 1;
                        int var39 = var32 & 0xFF;
                        int var40;
                        if (var20 <= var35) {
                            var40 = 0;
                        } else {
                            var40 = var35 & 0xFF;
                        }
                        int var41 = var22 & 0xFF;
                        int var42 = var27 & 0xFFF;
                        int var43 = class119.field1951[var42];
                        short var44 = this.field2043[var41];
                        int var45;
                        if (var17 <= var38) {
                            var45 = 0;
                        } else {
                            var45 = var38 & 0xFF;
                        }
                        int var46 = var42 - 4096;
                        short var47 = this.field2043[var39 + var44];
                        short var48 = this.field2043[var40 + var44];
                        short var49 = this.field2043[var45];
                        short var50 = this.field2043[var39 + var49];
                        short var51 = this.field2043[var40 + var49];
                        int var52 = class27.method176(var42, false, var25, var31, this.field2043[var36 + var47]);
                        int var53 = class27.method176(var42, false, var25, var34, this.field2043[var33 + var47]);
                        int var54 = var52 + ((var53 - var52) * var37 >> 12);
                        int var55 = class27.method176(var46, false, var25, var31, this.field2043[var36 + var48]);
                        int var56 = class27.method176(var46, false, var25, var34, this.field2043[var33 + var48]);
                        int var57 = ((var56 - var55) * var37 >> 12) + var55;
                        int var58 = ((var57 - var54) * var43 >> 12) + var54;
                        int var59 = class27.method176(var42, false, var29, var31, this.field2043[var36 + var50]);
                        int var60 = class27.method176(var42, false, var29, var34, this.field2043[var33 + var50]);
                        int var61 = ((var60 - var59) * var37 >> 12) + var59;
                        int var62 = class27.method176(var46, false, var29, var31, this.field2043[var36 + var51]);
                        int var63 = class27.method176(var46, false, var29, var34, this.field2043[var33 + var51]);
                        int var64 = ((var63 - var62) * var37 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method513((byte) -95, ((var65 - var58) * var26 >> 12) + var58, var14);
                    }
                    this.method511(24170);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 184)
    public static void method918(int arg0) {
        field2059 = null;
        field2056 = null;
        if (arg0 == 0) {
            field2060 = null;
            field2053 = null;
            field2054 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIII)V", line = 287)
    public class124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2048 = arg2;
        this.field2046 = arg0;
        this.field2051 = arg1;
        this.field2044 = arg4;
        this.field2047 = arg3;
        this.method919(-117);
        this.method920(255);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 210)
    private final void method919(int arg0) {
        this.field2045 = new short[this.field2051];
        int var2 = 36 / ((42 - arg0) / 43);
        for (int var3 = 0; var3 < this.field2051; var3++) {
            this.field2045[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
        field2049++;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 238)
    private final void method920(int arg0) {
        field2058++;
        Random var2 = new Random((long) this.field2046);
        if (arg0 != 255) {
            this.field2043 = (short[]) null;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2043[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class215.method1496(var2, arg0 - 379, var5);
            short var7 = this.field2043[var6];
            this.field2043[var6] = this.field2043[var5];
            this.field2043[var5] = this.field2043[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public abstract void method511(int arg0);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public abstract void method510(int arg0);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V")
    public abstract void method513(byte arg0, int arg1, int arg2);
}

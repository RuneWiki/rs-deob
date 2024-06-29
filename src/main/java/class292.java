import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class292 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[S")
    private short[] field4013 = new short[512];

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    private int field4018 = 4;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public int field4017 = 4;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    private int field4012 = 0;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    private int field4015 = 4;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    private int field4010 = 4;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lhc;")
    public static class125 field4019;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[S")
    private short[] field4020;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method1788(byte arg0, int arg1) {
        field4014++;
        if (arg0 != 127) {
            field4019 = null;
        }
        class48.field566.method3754(arg1, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V", line = 22)
    private final void method1789(boolean arg0) {
        field4016++;
        if (arg0) {
            method1790((byte) -82);
        }
        Random var2 = new Random((long) this.field4012);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4013[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class351.method2023(var5, -112, var2);
            short var7 = this.field4013[var6];
            this.field4013[var6] = this.field4013[var5];
            this.field4013[var5] = this.field4013[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 65)
    public static void method1790(byte arg0) {
        field4019 = null;
        if (arg0 != 34) {
            field4019 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 76)
    private final void method1791(byte arg0) {
        this.field4020 = new short[this.field4017];
        field4009++;
        if (arg0 != 38) {
            this.method1080(-100);
        }
        for (int var2 = 0; var2 < this.field4017; var2++) {
            this.field4020[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBII)V", line = 98)
    public final void method1792(int arg0, byte arg1, int arg2, int arg3) {
        field4011++;
        if (arg1 != -124) {
            this.field4013 = null;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method1080(arg1 + 242);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4017; var14++) {
                        int var15 = this.field4020[var14] << 12;
                        int var16 = this.field4010 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field4015 * var15 >> 12;
                        int var21 = this.field4018 * var15 >> 12;
                        int var22 = this.field4015 * var18;
                        int var23 = this.field4010 * var19;
                        int var24 = this.field4018 * var17;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var29 >= var16) {
                            var33 = 0;
                        } else {
                            var33 = var29 & 0xFF;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var30 & 0xFF;
                        int var37;
                        if (var26 >= var20) {
                            var37 = 0;
                        } else {
                            var37 = var26 & 0xFF;
                        }
                        int var38;
                        if (var32 < var21) {
                            var38 = var32 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = class667.field9378[var39];
                        short var41 = this.field4013[var36];
                        int var42 = var34 - 4096;
                        int var43 = var39 - 4096;
                        int var44 = class667.field9378[var34];
                        int var45 = var35 - 4096;
                        short var46 = this.field4013[var38];
                        int var47 = class667.field9378[var35];
                        short var48 = this.field4013[var31 + var46];
                        short var49 = this.field4013[var31 + var41];
                        short var50 = this.field4013[var33 + var46];
                        short var51 = this.field4013[var33 + var41];
                        int var52 = class506.method2891(var35, this.field4013[var28 + var49], 120, var39, var34);
                        int var53 = class506.method2891(var45, this.field4013[var37 + var49], 52, var39, var34);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class506.method2891(var35, this.field4013[var28 + var51], -61, var39, var42);
                        int var56 = class506.method2891(var45, this.field4013[var37 + var51], 96, var39, var42);
                        int var57 = var55 + ((var56 - var55) * var47 >> 12);
                        int var58 = ((var57 - var54) * var44 >> 12) + var54;
                        int var59 = class506.method2891(var35, this.field4013[var28 + var48], -125, var43, var34);
                        int var60 = class506.method2891(var45, this.field4013[var37 + var48], 107, var43, var34);
                        int var61 = ((var60 - var59) * var47 >> 12) + var59;
                        int var62 = class506.method2891(var35, this.field4013[var28 + var50], 115, var43, var42);
                        int var63 = class506.method2891(var45, this.field4013[var37 + var50], 96, var43, var42);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var44 >> 12);
                        this.method1083(true, ((var65 - var58) * var40 >> 12) + var58, var14);
                    }
                    this.method1086(106);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIII)V", line = 290)
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4012 = arg0;
        this.field4010 = arg3;
        this.field4017 = arg1;
        this.field4018 = arg4;
        this.field4015 = arg2;
        this.method1791((byte) 38);
        this.method1789(false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public abstract void method1080(int arg0);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZII)V")
    public abstract void method1083(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public abstract void method1086(int arg0);
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class324 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    private int field4148 = 4;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    private int field4151 = 0;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    private int field4154 = 4;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
    private short[] field4152 = new short[512];

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public int field4155 = 4;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    private int field4158 = 4;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    public static int[] field4149 = new int[14];

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lad;")
    public static class11 field4156 = new class11(5);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[[I")
    public static int[][] field4159 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
    private short[] field4150;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 11)
    public static void method1925(byte arg0) {
        field4156 = null;
        int var1 = -88 % ((arg0 - 39) / 37);
        field4149 = null;
        field4159 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIII)V", line = 272)
    public class324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4158 = arg4;
        this.field4151 = arg0;
        this.field4155 = arg1;
        this.field4154 = arg3;
        this.field4148 = arg2;
        this.method1929((byte) -100);
        this.method1931(18);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIII)V", line = 26)
    public final void method1926(boolean arg0, int arg1, int arg2, int arg3) {
        field4153++;
        if (arg0) {
            this.field4150 = null;
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method1924(0);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field4155; var14++) {
                        int var15 = this.field4150[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = this.field4158 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field4148 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field4154 * var15 >> 12;
                        int var22 = this.field4154 * var18;
                        int var23 = this.field4158 * var16;
                        int var24 = this.field4148 * var20;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var21 > var29) {
                            var34 = var29 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var23 & 0xFFF;
                        int var36 = var31 & 0xFF;
                        int var37;
                        if (var32 >= var17) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38 = var22 & 0xFFF;
                        int var39;
                        if (var26 >= var19) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        int var40 = class92.field1283[var33];
                        short var41 = this.field4152[var36];
                        int var42 = class92.field1283[var38];
                        int var43 = class92.field1283[var35];
                        short var44 = this.field4152[var37];
                        int var45 = var33 - 4096;
                        int var46 = var38 - 4096;
                        int var47 = var35 - 4096;
                        short var48 = this.field4152[var30 + var44];
                        short var49 = this.field4152[var34 + var41];
                        short var50 = this.field4152[var30 + var41];
                        short var51 = this.field4152[var34 + var44];
                        int var52 = class28.method188(!arg0, var33, this.field4152[var27 + var50], var35, var38);
                        int var53 = class28.method188(true, var45, this.field4152[var39 + var50], var35, var38);
                        int var54 = var52 + ((var53 - var52) * var40 >> 12);
                        int var55 = class28.method188(true, var33, this.field4152[var27 + var49], var35, var46);
                        int var56 = class28.method188(true, var45, this.field4152[var39 + var49], var35, var46);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = class28.method188(true, var33, this.field4152[var27 + var48], var47, var38);
                        int var59 = ((var57 - var54) * var42 >> 12) + var54;
                        int var60 = class28.method188(true, var45, this.field4152[var39 + var48], var47, var38);
                        int var61 = ((var60 - var58) * var40 >> 12) + var58;
                        int var62 = class28.method188(true, var33, this.field4152[var27 + var51], var47, var46);
                        int var63 = class28.method188(true, var45, this.field4152[var39 + var51], var47, var46);
                        int var64 = var62 + ((var63 - var62) * var40 >> 12);
                        int var65 = ((var64 - var61) * var42 >> 12) + var61;
                        this.method1928(var14, 58, ((var65 - var59) * var43 >> 12) + var59);
                    }
                    this.method1930(-666423860);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 194)
    public static final void method1927(int arg0) {
        class353.field4530.method300(arg0 ^ 0x2800);
        field4147++;
        for (int var1 = arg0; var1 < 32; var1++) {
            class489.field7138[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class141.field1869[var2] = 0L;
        }
        class382.field5032 = 0;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V", line = 232)
    private final void method1929(byte arg0) {
        field4146++;
        this.field4150 = new short[this.field4155];
        for (int var2 = 0; var2 < this.field4155; var2++) {
            this.field4150[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 >= -85) {
            this.field4148 = -91;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 286)
    private final void method1931(int arg0) {
        field4157++;
        Random var2 = new Random((long) this.field4151);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4152[var3] = (short) var3;
        }
        int var4 = -28 % ((-arg0 - 65) / 46);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class179.method1160(Integer.MIN_VALUE, var2, var6);
            short var8 = this.field4152[var7];
            this.field4152[var7] = this.field4152[var6];
            this.field4152[var6] = this.field4152[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public abstract void method1924(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public abstract void method1928(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public abstract void method1930(int arg0);
}

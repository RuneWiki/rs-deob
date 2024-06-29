import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class101 extends class317 {

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    private int field1387 = 1;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    private int field1390 = 1;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "Lfm;")
    public static class53 field1392 = new class53(64);

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "Z")
    public static boolean field1395 = false;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "Z")
    public static boolean field1396 = false;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field1397 = 0;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "Lo;")
    public static class285 field1393;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            field1395 = false;
        }
        field1388++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -50);
        if (this.field4847.field2751) {
            int var4 = this.field1387 + this.field1387 + 1;
            int var5 = this.field1390 + this.field1390 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field1387; var9 <= this.field1387 + arg1; var9++) {
                int[] var10 = this.method2225((byte) 66, 0, class202.field2889 & var9);
                int[] var11 = new int[class326.field4933];
                int var12 = 0;
                for (int var13 = -this.field1390; var13 <= this.field1390; var13++) {
                    var12 += var10[var13 & class246.field3548];
                }
                int var14 = 0;
                while (var14 < class326.field4933) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[class246.field3548 & var14 - this.field1390];
                    var14++;
                    var12 = var10[class246.field3548 & this.field1390 + var14] + var15;
                }
                var8[this.field1387 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class326.field4933; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[[I", line = 97)
    public final int[][] method53(int arg0, int arg1) {
        field1389++;
        int[][] var3 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int var4 = this.field1387 - (-this.field1387 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field1390 + this.field1390 + 1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field1387; var9 <= (this.field1387 + arg1); var9++) {
                int[][] var10 = this.method2227(0, 13, var9 & class202.field2889);
                int[][] var11 = new int[3][class326.field4933];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[2];
                int[] var17 = var10[1];
                for (int var18 = -this.field1390; var18 <= this.field1390; var18++) {
                    int var19 = class246.field3548 & var18;
                    var14 += var17[var19];
                    var13 += var16[var19];
                    var12 += var15[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class326.field4933 > var23) {
                    var20[var23] = var8 * var12 >> 16;
                    var21[var23] = var8 * var14 >> 16;
                    var22[var23] = var8 * var13 >> 16;
                    int var24 = var23 - this.field1390 & class246.field3548;
                    var23++;
                    int var25 = var12 - var15[var24];
                    int var26 = var14 - var17[var24];
                    int var27 = var13 - var16[var24];
                    int var28 = this.field1390 + var23 & class246.field3548;
                    var14 = var17[var28] + var26;
                    var13 = var16[var28] + var27;
                    var12 = var15[var28] + var25;
                }
                var7[var9 + this.field1387 - arg1] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class326.field4933; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var7[var36];
                    var33 += var37[1][var32];
                    var35 += var37[2][var32];
                    var34 += var37[0][var32];
                }
                var29[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var33 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        int var38 = 111 % ((-arg0 - 31) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)V", line = 231)
    public static final void method736(byte arg0) {
        for (int var1 = 0; var1 < class252.field3614; var1++) {
            int var2 = class270.field4027[var1];
            class241 var3 = class169.field2306[var2];
            int var4 = class157.field2165.method2219(16448);
            if ((var4 & 0x40) != 0) {
                var4 += class157.field2165.method2219(16448) << 8;
            }
            class153.method1103(var2, false, var4, var3);
        }
        field1391++;
        if (arg0 != -8) {
            method736((byte) 46);
        }
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(B)V", line = 258)
    public static void method737(byte arg0) {
        field1393 = null;
        field1392 = null;
        if (arg0 >= -4) {
            field1393 = (class285) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lcg;II)V", line = 275)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field1386++;
        int var4 = 83 % ((-arg1 - 17) / 40);
        if (arg2 == 0) {
            this.field1390 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field1387 = arg0.method2219(16448);
        } else if (arg2 == 2) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 323)
    public class101() {
        super(1, false);
    }
}

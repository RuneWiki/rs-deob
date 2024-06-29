import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class505 extends class404 {

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
    private int field7630 = 1;

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "I")
    private int field7633 = 1;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!kr", name = "K", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "Lvl;")
    public static class11 field7629;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "Lro;")
    public static class2 field7628;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)[[I")
    public final int[][] method89(int arg0, int arg1) {
        ++field7625;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int var4 = this.field7633 + this.field7633 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7630 + 1 + this.field7630;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field7633; this.field7633 + arg1 >= var9; ++var9) {
                int[][] var19 = this.method2400(arg0 + -11871, var9 & class435.field6374, 0);
                int[][] var20 = new int[3][class431.field6348];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field7630; this.field7630 >= var27; ++var27) {
                    int var37 = var27 & class98.field1757;
                    var23 += var26[var37];
                    var21 += var24[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class431.field6348) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field7630 + var31 & class98.field1757;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = class98.field1757 & this.field7630 + var31;
                    var23 = var26[var36] + var34;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var33;
                }
                var8[-arg1 + this.field7633 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class431.field6348 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg0 != -1) {
            method3019(-112, 9, 41, 64, 26, 28, 30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class343.field5106 = arg0;
        class321.field4832 = arg6;
        class1.field4 = arg2;
        class394.field5747 = arg5;
        ++field7627;
        if (arg4 < 113) {
            field7626 = 90;
        }
        class251.field3840 = arg3;
        class367.field5394 = arg1;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
    public class505() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            field7629 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field5873 = arg1.method257((byte) 71) == 1;
                }
            } else {
                this.field7633 = arg1.method257((byte) 122);
            }
        } else {
            this.field7630 = arg1.method257((byte) 68);
        }
        ++field7632;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field7634;
        int[] var3 = super.field5870.method372(arg1, (byte) 86);
        if (arg0 > -47) {
            method3019(39, 26, 70, -56, -21, -68, -100);
        }
        if (super.field5870.field810) {
            int var4 = this.field7633 - -this.field7633 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7630 + 1 + this.field7630;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7633 + arg1; ~var9 >= ~(arg1 - -this.field7633); ++var9) {
                int[] var13 = this.method2394(0, (byte) 64, var9 & class435.field6374);
                int[] var14 = new int[class431.field6348];
                int var15 = 0;
                for (int var16 = -this.field7630; ~var16 >= ~this.field7630; ++var16) {
                    var15 += var13[var16 & class98.field1757];
                }
                int var17 = 0;
                while (var17 < class431.field6348) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class98.field1757 & -this.field7630 + var17];
                    ++var17;
                    var15 = var13[this.field7630 + var17 & class98.field1757] + var18;
                }
                var8[-arg1 + this.field7633 + var9] = var14;
            }
            for (int var10 = 0; ~var10 > ~class431.field6348; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
    public static void method3020(boolean arg0) {
        field7629 = null;
        field7628 = null;
        if (!arg0) {
            field7631 = -8;
        }
    }
}

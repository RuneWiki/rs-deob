import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class76 extends class386 {

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    private int field1121 = 1;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    private int field1120 = 1;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    public static int field1122 = 4;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field1118;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -21 % ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            int var5 = this.field1121 - -1 + this.field1121;
            int var6 = 65536 / var5;
            int var7 = this.field1120 + 1 - -this.field1120;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg0 - this.field1121; ~var10 >= ~(this.field1121 + arg0); ++var10) {
                int[] var14 = this.method2212((byte) 72, var10 & class206.field2474, 0);
                int[] var15 = new int[class599.field8643];
                int var16 = 0;
                for (int var17 = -this.field1120; ~this.field1120 <= ~var17; ++var17) {
                    var16 += var14[var17 & class276.field3782];
                }
                int var18 = 0;
                while (var18 < class599.field8643) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[class276.field3782 & -this.field1120 + var18];
                    ++var18;
                    var16 = var14[this.field1120 + var18 & class276.field3782] + var19;
                }
                var9[this.field1121 + var10 + -arg0] = var15;
            }
            for (int var11 = 0; var11 < class599.field8643; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
    public class76() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field1124;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (arg1 != 3) {
            this.method645(43, -100);
        }
        if (super.field5148.field2041) {
            int var4 = this.field1121 - -this.field1121 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1120 + this.field1120 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1121 + arg0; var9 <= this.field1121 + arg0; ++var9) {
                int[][] var19 = this.method2211(class206.field2474 & var9, 0, -102);
                int[][] var20 = new int[3][class599.field8643];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1120; ~var27 >= ~this.field1120; ++var27) {
                    int var37 = class276.field3782 & var27;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class599.field8643) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class276.field3782 & -this.field1120 + var31;
                    int var33 = var21 - var24[var32];
                    ++var31;
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = var31 - -this.field1120 & class276.field3782;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var35;
                }
                var8[-arg0 + this.field1121 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class599.field8643 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
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
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3) {
        ++field1119;
        class233 var4 = class7.method44(arg0, arg3, -1);
        var4.method1422(0);
        var4.field3116 = arg2;
        var4.field3114 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
    public static final void method649(boolean arg0) {
        ++field1117;
        if (!class149.field1828) {
            if (!class221.field2851.field4141) {
                class59.field936 += (12.0F - class59.field936) / 2.0F;
            } else {
                class393.field5309 = (float) (-16 & (int) class393.field5309 + 47);
            }
            class447.field6335 = true;
            class149.field1828 = arg0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field5145 = arg2.method2229(255) == 1;
                }
            } else {
                this.field1121 = arg2.method2229(255);
            }
        } else {
            this.field1120 = arg2.method2229(255);
        }
        if (arg1 <= 111) {
            field1122 = -128;
        }
        ++field1123;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class373 extends class436 {

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    private int field5325 = 1;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    private int field5322 = 1;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field5321 = 0;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static volatile int field5327 = 0;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5323 = "Please remove ";

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V", line = 4)
    public static void method2439(int arg0) {
        if (arg0 == 2) {
            field5323 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 16)
    public class373() {
        super(1, false);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IILeb;)V", line = 29)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field6256 = ~arg2.method2429(0) == -2;
                }
            } else {
                this.field5325 = arg2.method2429(0);
            }
        } else {
            this.field5322 = arg2.method2429(arg0 + -34);
        }
        if (arg0 != 34) {
            this.field5322 = 52;
        }
        ++field5324;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Leb;I)V", line = 81)
    public static final void method2440(class371 arg0, int arg1) {
        ++field5328;
        int var2 = arg0.method2433(-91);
        class1.field4 = new class250[var2];
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            class1.field4[var3] = new class250();
            class1.field4[var3].field3459 = arg0.method2433(-117);
            class1.field4[var3].field3461 = arg0.method2383(6941);
        }
        class36.field549 = arg0.method2433(-97);
        int var4 = -72 % ((-40 - arg1) / 47);
        class244.field3376 = arg0.method2433(-126);
        class184.field2578 = arg0.method2433(-44);
        class296.field4119 = new class31[class244.field3376 + 1 + -class36.field549];
        for (int var5 = 0; ~class184.field2578 < ~var5; ++var5) {
            int var6 = arg0.method2433(-68);
            class31 var7 = class296.field4119[var6] = new class31();
            var7.field2515 = arg0.method2429(0);
            var7.field2516 = arg0.method2413((byte) -30);
            var7.field481 = class36.field549 + var6;
            var7.field475 = arg0.method2383(6941);
            var7.field474 = arg0.method2383(6941);
        }
        class28.field442 = arg0.method2413((byte) -30);
        class196.field2722 = true;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(II)[[I", line = 128)
    public final int[][] method85(int arg0, int arg1) {
        ++field5320;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (arg0 != -13348) {
            this.field5322 = -85;
        }
        if (super.field6259.field3950) {
            int var4 = this.field5325 + this.field5325 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5322 + this.field5322 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field5325 + arg1; ~(this.field5325 + arg1) <= ~var9; ++var9) {
                int[][] var19 = this.method2731(class190.field2634 & var9, false, 0);
                int[][] var20 = new int[3][class43.field653];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5322; ~this.field5322 <= ~var27; ++var27) {
                    int var37 = class278.field3758 & var27;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class43.field653) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class278.field3758 & -this.field5322 + var31;
                    ++var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = this.field5322 + var31 & class278.field3758;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var8[var9 - arg1 + this.field5325] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class43.field653; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[I", line = 273)
    public final int[] method14(int arg0, int arg1) {
        ++field5326;
        int[] var3 = super.field6258.method2688((byte) -128, arg0);
        if (super.field6258.field6138) {
            int var4 = this.field5325 + this.field5325 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field5322 - -this.field5322 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5325 + arg0; var9 <= this.field5325 + arg0; ++var9) {
                int[] var13 = this.method2729(0, 0, var9 & class190.field2634);
                int[] var14 = new int[class43.field653];
                int var15 = 0;
                for (int var16 = -this.field5322; var16 <= this.field5322; ++var16) {
                    var15 += var13[class278.field3758 & var16];
                }
                int var17 = 0;
                while (var17 < class43.field653) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field5322 + var17 & class278.field3758];
                    ++var17;
                    var15 = var13[class278.field3758 & this.field5322 + var17] + var18;
                }
                var8[-arg0 + this.field5325 + var9] = var14;
            }
            for (int var10 = 0; class43.field653 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 != 18338) {
            this.method85(-63, -92);
        }
        return var3;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class409 extends class371 {

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    private int field5838 = 1;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    private int field5844 = 1;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field5843;

    static {
        new class487("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[[I", line = 3)
    public final int[][] method78(byte arg0, int arg1) {
        ++field5841;
        int[][] var3 = super.field5364.method3064(arg0 + -35, arg1);
        if (arg0 != 36) {
            this.field5844 = -21;
        }
        if (super.field5364.field7632) {
            int var4 = this.field5838 + this.field5838 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5844 - -this.field5844 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field5838 + arg1; ~(this.field5838 + arg1) <= ~var9; ++var9) {
                int[][] var19 = this.method2263((byte) -7, 0, var9 & class135.field1789);
                int[][] var20 = new int[3][class41.field455];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5844; this.field5844 >= var27; ++var27) {
                    int var37 = class343.field5013 & var27;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class41.field455 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field5844 + var31 & class343.field5013;
                    int var33 = var23 - var26[var32];
                    ++var31;
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = class343.field5013 & this.field5844 + var31;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var34;
                    var23 = var26[var36] + var33;
                }
                var8[var9 - -this.field5838 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class41.field455 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
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

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 136)
    public static final void method2434(int arg0) {
        class218.field3226 = 0;
        ++field5843;
        int var1 = (class239.field3493.field3464 >> 7) + class584.field8677;
        int var2 = (class239.field3493.field3463 >> 7) - -class424.field6061;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class218.field3226 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
            class218.field3226 = 1;
        }
        if (class218.field3226 == 1 && ~var1 <= -3140 && var1 <= 3199 && var2 >= 3008 && ~var2 >= -3063) {
            class218.field3226 = 0;
        }
        if (arg0 == 10406) {
            ;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(BI)[I", line = 162)
    public final int[] method79(byte arg0, int arg1) {
        ++field5837;
        int[] var3 = super.field5378.method1451(21, arg1);
        if (super.field5378.field3254) {
            int var4 = this.field5838 + this.field5838 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5844 + this.field5844 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5838 + arg1; ~var9 >= ~(this.field5838 + arg1); ++var9) {
                int[] var13 = this.method2260((byte) -42, class135.field1789 & var9, 0);
                int[] var14 = new int[class41.field455];
                int var15 = 0;
                for (int var16 = -this.field5844; this.field5844 >= var16; ++var16) {
                    var15 += var13[class343.field5013 & var16];
                }
                int var17 = 0;
                while (var17 < class41.field455) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class343.field5013 & -this.field5844 + var17];
                    ++var17;
                    var15 = var13[this.field5844 + var17 & class343.field5013] + var18;
                }
                var8[-arg1 + var9 - -this.field5838] = var14;
            }
            for (int var10 = 0; var10 < class41.field455; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg0 >= -80) {
            this.method81(9, (byte) 60, (class428) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLps;)V", line = 249)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = 103 % ((arg1 - -15) / 39);
        ++field5842;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field5360 = arg2.method2561((byte) -52) == 1;
                }
            } else {
                this.field5838 = arg2.method2561((byte) 117);
            }
        } else {
            this.field5844 = arg2.method2561((byte) 110);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;Lob;ILmaa;)V", line = 293)
    public static final void method2435(class167 arg0, class385 arg1, int arg2, class42 arg3) {
        ++field5836;
        class116 var4 = arg3.method225(48, arg0);
        if (var4 != null) {
            int var5 = var4.method718();
            if (~var5 > ~var4.method721()) {
                var5 = var4.method721();
            }
            byte var6 = 10;
            int var7 = arg1.field5634;
            int var8 = arg1.field5631;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg2 <= 15) {
                method2437(0);
            }
            if (arg3.field483 != null) {
                var9 = class63.field735.method1052(class180.field2774, (byte) 29, (class116[]) null, (int[]) null, arg3.field483);
                for (int var12 = 0; var12 < var9; ++var12) {
                    String var13 = class180.field2774[var12];
                    if (var9 + -1 > var12) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class576.field8507.method2685(var13);
                    if (var14 > var10) {
                        var10 = var14;
                    }
                }
                var11 = var9 * class576.field8507.method2681() - -(class576.field8507.method2687() / 2);
            }
            int var15 = var5 / 2 + arg1.field5634;
            int var16 = arg1.field5631;
            if (~var7 <= ~(class113.field1437 + var5)) {
                if (~(-var5 + class113.field1454) > ~var7) {
                    var15 = -(var10 / 2) + class113.field1454 - var5 / 2 + -var6 + -5;
                    var7 = -var5 + class113.field1454;
                }
            } else {
                var7 = class113.field1437;
                var15 = var5 / 2 - -(var10 / 2) - -5 + class113.field1437 + var6;
            }
            if (~(class113.field1440 - -var5) < ~var8) {
                var8 = class113.field1440;
                var16 = var5 / 2 + (class113.field1440 - -var6);
            } else if (~(-var5 + class113.field1450) > ~var8) {
                var16 = -(var5 / 2) - (var6 - -var11) + class113.field1450;
                var8 = -var5 + class113.field1450;
            }
            int var17 = 65535 & (int) (Math.atan2((double) (-arg1.field5634 + var7), (double) (var8 - arg1.field5631)) / 3.141592653589793D * 32767.0D);
            var4.method716((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg3.field483 != null) {
                var19 = var16;
                var18 = var15 - (var10 / 2 - -5);
                var20 = var10 + var18 + 10;
                var21 = var16 - (-(var9 * class576.field8507.method2681()) - 3);
                if (~arg3.field492 != -1) {
                    arg0.method1066((byte) 100, var16, arg3.field492, var18, var21 - var16, -var18 + var20);
                }
                if (~arg3.field481 != -1) {
                    arg0.method1067(var20 - var18, (byte) -55, arg3.field481, -var16 + var21, var16, var18);
                }
                for (int var22 = 0; ~var9 < ~var22; ++var22) {
                    String var23 = class180.field2774[var22];
                    if (var9 + -1 > var22) {
                        var23 = var23.substring(0, -4 + var23.length());
                    }
                    class576.field8507.method2686(arg0, var23, var15, var16, arg3.field512, true);
                    var16 += class576.field8507.method2681();
                }
            }
            if (~arg3.field511 != 0 || arg3.field483 != null) {
                int var24 = var5 >> 1;
                class328 var25 = new class328(arg1);
                var25.field4844 = var19;
                var25.field4840 = -var24 + var7;
                var25.field4841 = var7 + var24;
                var25.field4835 = var8 + var24;
                var25.field4847 = var8 - var24;
                var25.field4838 = var20;
                var25.field4843 = var18;
                var25.field4842 = var21;
                class34.field391.method2492(var25, (byte) -88);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 443)
    public class409() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V", line = 448)
    public static final void method2436(int arg0, int arg1, int arg2, int arg3) {
        class237.field3473 = new byte[arg1][arg2][arg0];
        if (arg3 <= 79) {
            method2436(18, 26, -128, 39);
        }
        ++field5839;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 478)
    public static final void method2437(int arg0) {
        ++field5840;
        if (class133.field1758 != null) {
            class133.field1758.method1061(101);
            class123.field1591 = null;
            class133.field1758 = null;
        }
        if (arg0 != 3053) {
            method2437(-7);
        }
    }
}

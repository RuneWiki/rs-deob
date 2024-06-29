import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class159 extends class170 {

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    private int field2811 = 1;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    private int field2805 = 1;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lqk;")
    public static class207 field2806 = class24.method212(255, "brillant3:");

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field2813 = 20;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lqk;")
    public static class207 field2804 = class24.method212(255, " loggt sich ein)3");

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "[I")
    public static int[] field2812 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "Lqk;")
    public static class207 field2808 = class24.method212(255, "(U(Y");

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "Lqk;")
    public static class207 field2819 = class24.method212(255, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field2818 = 0;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "Lkd;")
    public static class203 field2821;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lle;")
    public static class42 field2815;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "[Lmd;")
    public static class220[] field2809;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lpk;I)I")
    public static final int method1156(class99 arg0, int arg1) {
        if (arg1 != -1) {
            field2804 = null;
        }
        int var2 = 0;
        ++field2816;
        if (arg0.method723(class73.field1350, true)) {
            ++var2;
        }
        if (arg0.method723(class189.field3341, true)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        ++field2820;
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int var4 = this.field2805 + this.field2805 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2811 - -this.field2811 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field2805; ~(this.field2805 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method1223(0, -123, class233.field4294 & var9);
                int var20 = 0;
                int var21 = 0;
                int[][] var22 = new int[3][class88.field1595];
                int[] var23 = var19[0];
                int var24 = 0;
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2811; var27 <= this.field2811; ++var27) {
                    int var37 = class94.field1684 & var27;
                    var21 += var25[var37];
                    var20 += var23[var37];
                    var24 += var26[var37];
                }
                int[] var28 = var22[0];
                int[] var29 = var22[1];
                int[] var30 = var22[2];
                int var31 = 0;
                while (class88.field1595 > var31) {
                    var28[var31] = var7 * var20 >> 16;
                    var29[var31] = var7 * var21 >> 16;
                    var30[var31] = var7 * var24 >> 16;
                    int var32 = var31 - this.field2811 & class94.field1684;
                    ++var31;
                    int var33 = var20 - var23[var32];
                    int var34 = var24 - var26[var32];
                    int var35 = var21 - var25[var32];
                    int var36 = class94.field1684 & this.field2811 + var31;
                    var20 = var23[var36] + var33;
                    var21 = var25[var36] + var35;
                    var24 = var26[var36] + var34;
                }
                var8[this.field2805 + var9 - arg0] = var22;
            }
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class88.field1595; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[0][var13];
                    var15 += var18[1][var13];
                    var14 += var18[2][var13];
                }
                var11[var13] = var5 * var16 >> 16;
                var10[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var14 >> 16;
            }
        }
        if (arg1) {
            method1159((class220) null, -46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class159() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2814;
        int var7 = arg2 & 3;
        if ((1 & arg6) == 1) {
            int var8 = arg0;
            arg0 = arg5;
            arg5 = var8;
        }
        if (~var7 == -1) {
            return arg1;
        } else if (var7 == 1) {
            return 7 - arg3 + -arg0 + 1;
        } else {
            if (arg4 != 8175) {
                field2815 = null;
            }
            return var7 == 2 ? -arg1 + 7 - (arg5 + -1) : arg3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
    public static void method1158(byte arg0) {
        field2821 = null;
        field2806 = null;
        field2819 = null;
        field2808 = null;
        field2809 = null;
        int var1 = -36 % ((arg0 - -74) / 39);
        field2815 = null;
        field2804 = null;
        field2812 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field2822;
        if (arg1 == 5877) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field2998 = ~arg0.method1045((byte) 79) == -2;
                    }
                } else {
                    this.field2805 = arg0.method1045((byte) 120);
                }
            } else {
                this.field2811 = arg0.method1045((byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field2817;
        if (arg0 != -30) {
            method1158((byte) -126);
        }
        int[] var3 = super.field3001.method1538(108, arg1);
        if (super.field3001.field3835) {
            int var4 = this.field2805 + this.field2805 + 1;
            int var5 = this.field2811 + this.field2811 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2805 + arg1; ~(this.field2805 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method1226(0, class233.field4294 & var9, arg0 ^ -67);
                int[] var14 = new int[class88.field1595];
                int var15 = 0;
                for (int var16 = -this.field2811; ~this.field2811 <= ~var16; ++var16) {
                    var15 += var13[var16 & class94.field1684];
                }
                int var17 = 0;
                while (~class88.field1595 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field2811 + var17 & class94.field1684];
                    ++var17;
                    var15 = var13[class94.field1684 & this.field2811 + var17] + var18;
                }
                var8[-arg1 + var9 + this.field2805] = var14;
            }
            for (int var10 = 0; var10 < class88.field1595; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lmd;I)Lmd;")
    public static final class220 method1159(class220 arg0, int arg1) {
        ++field2807;
        if (arg1 != -1943270064) {
            method1157(-28, 122, 20, -2, -17, 100, 70);
        }
        if (~arg0.field4045 != 0) {
            return class233.method1667(arg0.field4045, 19);
        } else {
            int var2 = arg0.field3933 >>> 16;
            class269 var3 = new class269(class171.field3028);
            for (class47 var4 = (class47) var3.method1836(10868); var4 != null; var4 = (class47) var3.method1841(arg1 + 1943269953)) {
                if (var4.field934 == var2) {
                    return class233.method1667((int) var4.field3407, 60);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
    public static final void method1160(boolean arg0) {
        ++field2810;
        if (class70.field1245 == null) {
            if (class33.field659 == null) {
                if (arg0) {
                    method1159((class220) null, -35);
                }
                int var1 = class270.field4778;
                if (class256.field4588) {
                    if (var1 != 1) {
                        int var7 = class268.field4747;
                        int var8 = class20.field322;
                        if (~var8 > ~(class182.field3250 + -10) || class182.field3250 - -class132.field2279 + 10 < var8 || var7 < class17.field268 + -10 || ~var7 < ~(class214.field3806 + class17.field268 + 10)) {
                            class256.field4588 = false;
                            class245.method1725(class132.field2279, class214.field3806, class17.field268, 0, class182.field3250);
                        }
                    }
                    if (var1 != 1) {
                        return;
                    }
                    int var9 = class182.field3250;
                    int var10 = class17.field268;
                    int var11 = class132.field2279;
                    int var12 = class121.field2092;
                    int var13 = class47.field939;
                    int var14 = -1;
                    for (int var15 = 0; ~class268.field4751 < ~var15; ++var15) {
                        int var16;
                        if (class221.field4068) {
                            var16 = var10 - -35 - -((-var15 + class268.field4751 - 1) * 15);
                        } else {
                            var16 = (class268.field4751 + -1 + -var15) * 15 + var10 + 31;
                        }
                        if (var12 > var9 && var9 + var11 > var12 && ~var13 < ~(var16 - 13) && var16 + 3 > var13) {
                            var14 = var15;
                        }
                    }
                    if (~var14 != 0) {
                        class157.method1150(var14, (byte) 108);
                    }
                    class256.field4588 = false;
                    class245.method1725(class132.field2279, class214.field3806, class17.field268, 0, class182.field3250);
                } else {
                    if (var1 == 1 && class268.field4751 > 0) {
                        short var2 = class82.field1494[class268.field4751 + -1];
                        if (~var2 == -47 || ~var2 == -16 || var2 == 19 || ~var2 == -52 || var2 == 1 || var2 == 16 || ~var2 == -51 || ~var2 == -15 || var2 == 4 || var2 == 10 || var2 == 25 || var2 == 1005) {
                            int var3 = class85.field1551[class268.field4751 + -1];
                            int var4 = class199.field3505[class268.field4751 + -1];
                            class220 var5 = class233.method1667(var4, 107);
                            class117 var6 = client.method1112(var5);
                            if (var6.method834((byte) -102) || var6.method823((byte) 71)) {
                                class279.field4905 = 0;
                                class199.field3493 = false;
                                if (class70.field1245 != null) {
                                    class82.method614((byte) 68, class70.field1245);
                                }
                                class70.field1245 = class233.method1667(var4, 108);
                                class283.field4978 = var3;
                                class287.field5123 = class121.field2092;
                                class267.field4721 = class47.field939;
                                class82.method614((byte) 53, class70.field1245);
                                return;
                            }
                        }
                    }
                    if (var1 == 1 && (~class276.field4848 == -2 && class268.field4751 > 2 || class174.method1251(class268.field4751 + -1, 17412))) {
                        var1 = 2;
                    }
                    if (var1 == 2 && class268.field4751 > 0 || class272.field4796 == 1) {
                        class158.method1153(15);
                    }
                    if (~var1 == -2 && class268.field4751 > 0 || ~class272.field4796 == -3) {
                        class160.method1166((byte) 64);
                        return;
                    }
                }
            }
        }
    }
}

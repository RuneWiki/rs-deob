import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class191 extends class185 {

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "Lik;")
    public static class267 field2931 = new class267(20);

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2938 = "Face here";

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lbj;")
    public static class157 field2939;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "[Lbb;")
    private class92[] field2930;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIBI)V")
    public static final void method1195(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var5 = 0; ~class256.field3900 < ~var5; ++var5) {
            if (class160.field2460[var5] + class101.field1593[var5] > arg1 && arg0 + arg1 > class101.field1593[var5] && arg4 < class32.field471[var5] + class283.field4236[var5] && class283.field4236[var5] < arg4 - -arg2) {
                class1.field16[var5] = true;
            }
        }
        ++field2932;
        if (arg3 < 106) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lfl;Ljava/lang/String;B)I")
    public static final int method1196(class248 arg0, String arg1, byte arg2) {
        ++field2929;
        int var3 = arg0.field3748;
        if (arg2 != -86) {
            method1197(117, -79, 76, 52, -82, 63, -99, -64);
        }
        byte[] var4 = class242.method1530(arg1, arg2 + -12);
        arg0.method1598(32768, var4.length);
        arg0.field3748 += class246.field3684.method788(var4, arg0.field3723, 0, (byte) 123, arg0.field3748, var4.length);
        return arg0.field3748 - var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2937;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg3 * arg3;
        int var12 = -arg6 + arg3;
        int var13 = -arg6 + arg4;
        int var14 = arg4 * arg4;
        int var15 = var12 * var12;
        int var16 = var11 << 1;
        int var17 = var13 * var13;
        int var18 = var15 << 1;
        int var19 = var14 << 1;
        int var20 = var17 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var14 + var16;
        int var24 = -((var21 - 1) * var19) + var11;
        int var25 = -((arg5 + var22) * var20) + var15;
        int var26 = var14 << 2;
        int var27 = (1 - var22) * var17 - -var18;
        int var28 = var11 << 2;
        int var29 = var17 << 2;
        int var30 = var15 << 2;
        int var31 = var16 * 3;
        int var32 = (var21 + -3) * var19;
        int var33 = var18 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 + -1) * var26;
        int var37 = (var12 - 1) * var29;
        int var38 = var30;
        int[] var39 = class23.field284[arg0];
        class64.method429(var39, -arg4 + arg2, (byte) 85, arg7, arg2 - var13);
        class64.method429(var39, -var13 + arg2, (byte) 95, arg1, arg2 + var13);
        class64.method429(var39, arg2 + var13, (byte) 86, arg7, arg2 + arg4);
        while (~var9 < -1) {
            boolean var40 = ~var9 >= ~var12;
            --var9;
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var23 += var31;
                    var31 += var28;
                    ++var8;
                    var24 += var35;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                ++var8;
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            if (var40) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        ++var10;
                        var25 += var38;
                        var38 += var30;
                        var27 += var33;
                        var33 += var30;
                    }
                }
                if (~var25 > -1) {
                    var27 += var33;
                    var25 += var38;
                    var38 += var30;
                    var33 += var30;
                    ++var10;
                }
                var25 += -var34;
                var27 += -var37;
                var34 -= var29;
                var37 -= var29;
            }
            var36 -= var26;
            int var41 = -var9 + arg0;
            int var42 = arg0 + var9;
            var32 -= var26;
            int var43 = arg2 + var8;
            int var44 = -var8 + arg2;
            if (!var40) {
                class64.method429(class23.field284[var41], var44, (byte) 121, arg7, var43);
                class64.method429(class23.field284[var42], var44, (byte) 107, arg7, var43);
            } else {
                int var45 = arg2 - -var10;
                int var46 = -var10 + arg2;
                class64.method429(class23.field284[var41], var44, (byte) 83, arg7, var46);
                class64.method429(class23.field284[var41], var46, (byte) 88, arg1, var45);
                class64.method429(class23.field284[var41], var45, (byte) 95, arg7, var43);
                class64.method429(class23.field284[var42], var44, (byte) 92, arg7, var46);
                class64.method429(class23.field284[var42], var46, (byte) 122, arg1, var45);
                class64.method429(class23.field284[var42], var45, (byte) 81, arg7, var43);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([[IB)V")
    private final void method1198(int[][] arg0, byte arg1) {
        ++field2925;
        int var3 = class174.field2648;
        int var4 = class130.field1933;
        class84.method555(134, arg0);
        class45.method303(0, 0, class10.field133, class53.field873, (byte) -1);
        if (arg1 != 96) {
            field2931 = null;
        }
        if (this.field2930 != null) {
            for (int var5 = 0; var5 < this.field2930.length; ++var5) {
                class92 var6 = this.field2930[var5];
                int var7 = var6.field1457;
                int var8 = var6.field1454;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method49(var4, var3, true);
                    }
                } else if (var8 < 0) {
                    var6.method50(var3, var4, -7368);
                } else {
                    var6.method45(var4, (byte) 124, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(I)V")
    public static void method1199(int arg0) {
        field2931 = null;
        field2939 = null;
        field2938 = null;
        if (arg0 < 114) {
            method1197(65, -17, -106, -80, -38, -47, 27, 89);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLvb;)V")
    public static final void method1200(byte arg0, class61 arg1) {
        ++field2924;
        if (arg0 < 76) {
            field2939 = null;
        }
        for (class151 var2 = (class151) class264.field3988.method983(7); var2 != null; var2 = (class151) class264.field3988.method985((byte) 98)) {
            if (var2.field2191 == arg1) {
                if (var2.field2175 != null) {
                    class213.field3187.method378(var2.field2175);
                    var2.field2175 = null;
                }
                var2.method538(63);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field2936;
        if (arg2 != -6357) {
            method1202(36);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field2814 = arg1.method1593((byte) 27) == 1;
                return;
            }
        } else {
            this.field2930 = new class92[arg1.method1593((byte) 27)];
            for (int var4 = 0; ~var4 > ~this.field2930.length; ++var4) {
                int var5 = arg1.method1593((byte) 27);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field2930[var4] = class219.method1404(arg1, (byte) -102);
                            }
                        } else {
                            this.field2930[var4] = class126.method792(64, arg1);
                        }
                    } else {
                        this.field2930[var4] = class105.method664(-30385, arg1);
                    }
                } else {
                    this.field2930[var4] = class195.method1216((byte) 106, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lpf;B)V")
    public static final void method1201(class294 arg0, byte arg1) {
        ++field2927;
        class262.field3969 = arg0;
        if (arg1 > -2) {
            method1201((class294) null, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        ++field2935;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (!arg0) {
            method1200((byte) 6, (class61) null);
        }
        if (super.field2802.field1807) {
            int var4 = class174.field2648;
            int var5 = class130.field1933;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2802.method756(32416);
            this.method1198(var6, (byte) 96);
            for (int var8 = 0; class130.field1933 > var8; ++var8) {
                int[][] var9 = var7[var8];
                int[] var10 = var9[0];
                int[] var11 = var9[1];
                int[] var12 = var6[var8];
                int[] var13 = var9[2];
                for (int var14 = 0; ~class174.field2648 < ~var14; ++var14) {
                    int var15 = var12[var14];
                    var13[var14] = class94.method598(var15 << 4, 4080);
                    var11[var14] = class94.method598(65280, var15) >> 4;
                    var10[var14] = class94.method598(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "(I)I")
    public static final int method1202(int arg0) {
        class32.field467 = arg0;
        ++field2934;
        return class153.method924(-1);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            method1201((class294) null, (byte) 91);
        }
        ++field2926;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            this.method1198(super.field2804.method563((byte) -27), (byte) 96);
        }
        return var3;
    }
}

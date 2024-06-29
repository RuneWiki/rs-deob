import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class154 extends class12 {

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    private int field2756 = 819;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    private int field2760 = 1024;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    private int field2755 = 1024;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    private int field2764 = 1024;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    private int field2762 = 2048;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    private int field2770 = 0;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    private int field2752 = 409;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    private int field2767 = 0;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
    private int field2773 = 1024;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Ltg;")
    public static class184 field2753 = class135.method812("null", 3);

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Ltg;")
    public static class184 field2751 = class135.method812("cross", 3);

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "Ltg;")
    public static class184 field2759 = class135.method812("hel", 3);

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "[Ltg;")
    public static class184[] field2768 = new class184[100];

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    private int field2765;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 != 57) {
            this.field2773 = -105;
        }
        ++field2772;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)Lbh;")
    public static final class18 method931(boolean arg0) {
        if (class153.field2739 == null) {
            class153.field2739 = new class18();
        }
        if (!arg0) {
            return null;
        } else {
            ++field2758;
            return class153.field2739;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        int[] var3 = super.field224.method7((byte) -63, arg0);
        ++field2763;
        if (arg1 != 17) {
            method932(-95);
        }
        if (super.field224.field53) {
            int[][] var4 = super.field224.method6(11083);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class114.field2074 * this.field2752 >> 12;
            int var15 = class201.field3889 * this.field2762 >> 12;
            int var16 = class201.field3889 * this.field2773 >> 12;
            int var17 = class114.field2074 * this.field2756 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field2765 = class201.field3889 / 8 * this.field2755 >> 12;
                int var18 = 1 - -(class201.field3889 / var16);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2767);
                while (true) {
                    while (true) {
                        int var22 = class116.method712(var15 - var16, false, var21) + var16;
                        int var23 = class116.method712(var17 - var14, false, var21) + var14;
                        int var24 = var7 + var22;
                        if (class201.field3889 < var24) {
                            var24 = class201.field3889;
                            var22 = class201.field3889 - var7;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            var25 = var27[2];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class201.field3889;
                            }
                            if (class201.field3889 < var29) {
                                var29 -= class201.field3889;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && var30[1] >= var29) {
                                    if (var9 != var26) {
                                        int var31 = var5 + var7;
                                        if (var31 < 0) {
                                            var31 += class201.field3889;
                                        }
                                        if (~var31 < ~class201.field3889) {
                                            var31 -= class201.field3889;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var13];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var13];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (var36 == 0) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class201.field3889;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method937(var21, var4, var38 - -var6, var35, var25 - var35, var39 - var38, false);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var13 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (var23 + var25 <= class114.field2074) {
                            var10 = false;
                        } else {
                            var23 = class114.field2074 - var25;
                        }
                        if (class201.field3889 != var24) {
                            int[] var41 = var19[var12++];
                            var41[0] = var7;
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            this.method937(var21, var4, var7 + var8, var25, var23, var22, false);
                            var7 = var24;
                        } else {
                            this.method937(var21, var4, var7 - -var8, var25, var23, var22, false);
                            if (var10) {
                                return var3;
                            }
                            var11 = false;
                            var10 = true;
                            var6 = var8;
                            int[] var42 = var19[var12++];
                            int[][] var43 = var20;
                            var42[1] = var24;
                            var20 = var19;
                            var13 = var12;
                            var42[2] = var23 + var25;
                            var19 = var43;
                            var42[0] = var7;
                            var7 = 0;
                            var8 = class116.method712(class201.field3889, false, var21);
                            var12 = 0;
                            var9 = 0;
                            var5 = -var6 + var8;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class201.field3889 + var5;
                            }
                            if (~class201.field3889 > ~var44) {
                                var44 -= class201.field3889;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && var44 <= var45[1]) {
                                    break;
                                }
                                int var10000 = ~var13;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field2760 = arg0.method611(false);
                                        }
                                    } else {
                                        this.field2764 = arg0.method611(false);
                                    }
                                } else {
                                    this.field2770 = arg0.method588((byte) -123);
                                }
                            } else {
                                this.field2755 = arg0.method611(false);
                            }
                        } else {
                            this.field2756 = arg0.method611(false);
                        }
                    } else {
                        this.field2752 = arg0.method611(false);
                    }
                } else {
                    this.field2762 = arg0.method611(arg2);
                }
            } else {
                this.field2773 = arg0.method611(false);
            }
        } else {
            this.field2767 = arg0.method588((byte) -29);
        }
        if (arg2) {
            field2751 = null;
        }
        ++field2757;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static void method932(int arg0) {
        field2768 = null;
        field2751 = null;
        field2753 = null;
        field2759 = null;
        if (arg0 != -26109) {
            field2768 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)I")
    public static final int method933(int arg0, byte arg1) {
        ++field2771;
        int var2 = 0;
        if (~arg0 > -1 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 8;
            var2 += 8;
        }
        if (~arg0 <= -17) {
            var2 += 4;
            arg0 >>>= 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (arg1 != 81) {
            return -48;
        } else {
            if (arg0 >= 1) {
                arg0 >>>= 1;
                ++var2;
            }
            return arg0 + var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
    public static final void method934(int arg0, int arg1) {
        ++field2754;
        if (class164.method982(22401, arg1)) {
            class167[] var2 = class149.field2670[arg1];
            for (int var3 = 0; var3 < var2.length; ++var3) {
                class167 var4 = var2[var3];
                if (var4 != null) {
                    var4.field3043 = 0;
                    var4.field3092 = 0;
                }
            }
            if (arg0 > -21) {
                field2751 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)Lsc;")
    public static final class171 method935(int arg0) {
        class171 var1 = new class171();
        int var2 = -113 % ((-55 - arg0) / 54);
        var1.field3246 = class83.field1479[0];
        var1.field3252 = class177.field3387[0];
        var1.field3253 = class26.field472[0];
        var1.field3251 = class83.field1481;
        var1.field3248 = class110.field1980;
        var1.field3249 = class202.field3902[0];
        var1.field3250 = class184.field3535[0];
        ++field2766;
        var1.field3247 = class24.field436;
        class200.method1283((byte) 127);
        return var1;
    }

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V")
    public static final void method936(int arg0) {
        if (arg0 == 65536) {
            for (class7 var1 = (class7) class134.field2436.method57(arg0 ^ -85190); var1 != null; var1 = (class7) class134.field2436.method49(1)) {
                int var2 = var1.field119;
                if (class164.method982(22401, var2)) {
                    boolean var3 = true;
                    class167[] var4 = class149.field2670[var2];
                    for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                        if (var4[var5] != null) {
                            var3 = var4[var5].field3106;
                            break;
                        }
                    }
                    if (!var3) {
                        int var6 = (int) var1.field2393;
                        class167 var7 = class44.method255(var6, 10583);
                        if (var7 != null) {
                            class57.method305(-121, var7);
                        }
                    }
                }
            }
            ++field2761;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/util/Random;[[IIIIIZ)V")
    private final void method937(Random arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field2769;
        int var8 = ~this.field2760 >= -1 ? 4096 : -class116.method712(this.field2760, false, arg0) + 4096;
        int var9 = this.field2765 * this.field2764 >> 12;
        int var10 = this.field2765 + -(var9 > 0 ? class116.method712(var9, false, arg0) : 0);
        if (arg2 >= class201.field3889) {
            arg2 -= class201.field3889;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg5 <= 0) {
                return;
            }
            int var11 = arg5 / 2;
            int var12 = arg4 / 2;
            int var13 = var12 >= var10 ? var10 : var12;
            int var14 = ~var10 >= ~var11 ? var10 : var11;
            int var15 = arg2 + var14;
            int var16 = -(var14 * 2) + arg5;
            for (int var17 = 0; ~arg4 < ~var17; ++var17) {
                int[] var18 = arg1[arg3 + var17];
                if (~var17 > ~var13) {
                    int var19 = var8 * var17 / var13;
                    if (~this.field2770 != -1) {
                        for (int var20 = 0; ~var14 < ~var20; ++var20) {
                            int var21 = var8 * var20 / var14;
                            var18[class10.method61(arg2 + var20, class51.field937)] = var18[class10.method61(class51.field937, -var20 + arg5 + -1 + arg2)] = ~var19 < ~var21 ? var21 : var19;
                        }
                    } else {
                        for (int var22 = 0; var14 > var22; ++var22) {
                            int var24 = var8 * var22 / var14;
                            var18[class10.method61(class51.field937, arg2 + var22)] = var18[class10.method61(class51.field937, arg2 - 1 + arg5 + -var22)] = var19 * var24 >> 12;
                        }
                    }
                    if (var15 + var16 > class201.field3889) {
                        int var23 = -var15 + class201.field3889;
                        class93.method536(var18, var15, var23, var19);
                        class93.method536(var18, 0, -var23 + var16, var19);
                    } else {
                        class93.method536(var18, var15, var16, var19);
                    }
                } else {
                    int var25 = -var17 + arg4 + -1;
                    if (~var13 < ~var25) {
                        int var26 = var8 * var25 / var13;
                        if (~this.field2770 == -1) {
                            for (int var27 = 0; var14 > var27; ++var27) {
                                int var28 = var8 * var27 / var14;
                                var18[class10.method61(class51.field937, arg2 + var27)] = var18[class10.method61(-var27 + arg2 + -1 + arg5, class51.field937)] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var14 > var29; ++var29) {
                                int var31 = var8 * var29 / var14;
                                var18[class10.method61(arg2 + var29, class51.field937)] = var18[class10.method61(class51.field937, -var29 + -1 + arg5 + arg2)] = ~var31 > ~var26 ? var31 : var26;
                            }
                        }
                        if (var15 - -var16 > class201.field3889) {
                            int var30 = -var15 + class201.field3889;
                            class93.method536(var18, var15, var30, var26);
                            class93.method536(var18, 0, -var30 + var16, var26);
                        } else {
                            class93.method536(var18, var15, var16, var26);
                        }
                    } else {
                        for (int var32 = 0; var14 > var32; ++var32) {
                            var18[class10.method61(class51.field937, arg2 - -var32)] = var18[class10.method61(-var32 + -1 + arg2 + arg5, class51.field937)] = var8 * var32 / var14;
                        }
                        if (~class201.field3889 > ~(var15 + var16)) {
                            int var33 = class201.field3889 - var15;
                            class93.method536(var18, var15, var33, var8);
                            class93.method536(var18, 0, -var33 + var16, var8);
                        } else {
                            class93.method536(var18, var15, var16, var8);
                        }
                    }
                }
            }
        } else if (~class201.field3889 <= ~(arg2 + arg5)) {
            for (int var34 = 0; arg4 > var34; ++var34) {
                class93.method536(arg1[arg3 - -var34], arg2, arg5, var8);
            }
        } else {
            int var35 = -arg2 + class201.field3889;
            for (int var36 = 0; ~arg4 < ~var36; ++var36) {
                int[] var37 = arg1[arg3 - -var36];
                class93.method536(var37, arg2, var35, var8);
                class93.method536(var37, 0, arg5 - var35, var8);
            }
        }
        if (arg6) {
            this.method937((Random) null, (int[][]) null, -120, 78, 41, -103, true);
        }
    }
}

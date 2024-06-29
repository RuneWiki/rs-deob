import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class30 extends class142 {

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    private int field459 = 585;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lvb;")
    public static class192 field460 = new class192();

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Lme;")
    public static class114 field468 = new class114(8);

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "Lai;")
    public static class10 field470 = class44.method278("au", 114);

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field469 = 0;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "Lai;")
    private static class10 field474 = class44.method278("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 118);

    @OriginalMember(owner = "client!d", name = "db", descriptor = "Lai;")
    public static class10 field471 = field474;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Ljava/awt/Image;")
    public static Image field473;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "[I")
    public static int[] field472;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
    public static final boolean method196(int arg0, int arg1) {
        ++field467;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            if (arg1 != -3431) {
                method200(125, (byte) -87);
            }
            return arg0 < 129 || ~arg0 < -160;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)I")
    public static final int method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(1 & arg1) == -2) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        ++field464;
        int var8 = arg5 & 3;
        if (var8 == 0) {
            return arg6;
        } else if (~var8 == arg3) {
            return -arg0 - -1 + -arg4 + 7;
        } else {
            return ~var8 == -3 ? -arg2 - -1 + -arg6 + 7 : arg4;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 < -34) {
            if (arg1 == 0) {
                this.field459 = arg0.method762((byte) 118);
            }
            ++field465;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    public static void method198(int arg0) {
        field474 = null;
        field473 = null;
        field470 = null;
        field472 = null;
        field468 = null;
        field460 = null;
        int var1 = 91 / ((arg0 - -53) / 46);
        field471 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIII)V")
    public static final void method199(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field463;
        if (class159.field3054 != arg5 || ~class117.field2265 != ~arg4 || class104.field1956 != arg3 && class126.field2406) {
            class104.field1956 = arg3;
            if (!class126.field2406) {
                class104.field1956 = 0;
            }
            class117.field2265 = arg4;
            class159.field3054 = arg5;
            class111.method710(65, 25);
            class68.method444(-112, arg1, class130.field2460);
            int var6 = class200.field3767;
            int var7 = class2.field16;
            class2.field16 = arg5 * 8 + -48;
            class200.field3767 = arg4 * 8 - 48;
            int var8 = -var6 + class200.field3767;
            int var9 = class200.field3767;
            int var10 = -var7 + class2.field16;
            int var11 = class2.field16;
            for (int var12 = 0; ~var12 > -32769; ++var12) {
                class125 var28 = class168.field3249[var12];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field1099[var29] -= var10;
                        var28.field1106[var29] -= var8;
                    }
                    var28.field1097 -= var8 * 128;
                    var28.field1100 -= var10 * 128;
                }
            }
            for (int var13 = 0; var13 < 2048; ++var13) {
                class38 var26 = class2.field10[var13];
                if (var26 != null) {
                    for (int var27 = 0; var27 < 10; ++var27) {
                        var26.field1099[var27] -= var10;
                        var26.field1106[var27] -= var8;
                    }
                    var26.field1100 -= var10 * 128;
                    var26.field1097 -= var8 * 128;
                }
            }
            class42.field687 = arg3;
            class145.field2767.method429(arg2, false, arg0, (byte) -109);
            byte var14 = 0;
            byte var15 = 1;
            byte var16 = 104;
            byte var17 = 0;
            byte var18 = 104;
            if (var10 < 0) {
                var15 = -1;
                var14 = 103;
                var16 = -1;
            }
            byte var19 = 1;
            if (var8 < 0) {
                var17 = 103;
                var19 = -1;
                var18 = -1;
            }
            for (int var20 = var14; ~var16 != ~var20; var20 += var15) {
                for (int var22 = var17; ~var18 != ~var22; var22 += var19) {
                    int var23 = var10 + var20;
                    int var24 = var22 - -var8;
                    for (int var25 = 0; var25 < 4; ++var25) {
                        if (~var23 <= -1 && ~var24 <= -1 && ~var23 > -105 && ~var24 > -105) {
                            class33.field508[var25][var20][var22] = class33.field508[var25][var23][var24];
                        } else {
                            class33.field508[var25][var20][var22] = null;
                        }
                    }
                }
            }
            for (class171 var21 = (class171) class123.field2360.method1223(arg1); var21 != null; var21 = (class171) class123.field2360.method1226((byte) -57)) {
                var21.field3314 -= var8;
                var21.field3302 -= var10;
                if (var21.field3302 < 0 || var21.field3314 < 0 || ~var21.field3302 <= -105 || ~var21.field3314 <= -105) {
                    var21.method848(!arg1);
                }
            }
            if (class169.field3270 != 0) {
                class120.field2314 -= var8;
                class169.field3270 -= var10;
            }
            class135.field2540 = 0;
            class13.field220 = -1;
            class128.field2435 = false;
            class171.field3298.method1224((byte) 24);
            class125.field2392.method1224((byte) 24);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field458;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (arg0) {
            field472 = null;
        }
        if (super.field2683.field3516) {
            int var4 = class13.field212[arg1];
            for (int var5 = 0; ~var5 > ~class133.field2499; ++var5) {
                int var6 = class79.field1395[var5];
                if (var6 > this.field459 && var6 < -this.field459 + 4096 && ~var4 < ~(2048 - this.field459) && this.field459 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field459 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field459 + 2048) > ~var6 && 2048 - -this.field459 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field459;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field459);
                } else if (~this.field459 >= ~var4 && var4 <= -this.field459 + 4096) {
                    if (this.field459 <= var6 && ~(-this.field459 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field459 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field459;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field459 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
    public static final void method200(int arg0, byte arg1) {
        ++field461;
        if (arg0 >= 0) {
            int var2 = class75.field1308[arg0];
            int var3 = class148.field2848[arg0];
            int var4 = class130.field2472[arg0];
            int var5 = class36.field561[arg0];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            if (var2 == 35) {
                class36.field560.method577(class42.field687, var5, var3);
            }
            if (var2 == 57) {
                class38 var6 = class2.field10[var4];
                if (var6 != null) {
                    ++class185.field3526;
                    class84.method514(var6.field1099[0], 1, 0, 1, var6.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                    class95.field1754 = class5.field58;
                    class126.field2400 = 2;
                    class21.field323 = class172.field3330;
                    class83.field1451 = 0;
                    class76.field1323.method635((byte) -67, 79);
                    class76.field1323.method812(false, var4);
                }
            }
            if (~var2 == -39) {
                class139.method949(-1);
            }
            if (var2 == 42) {
                class76.field1323.method635((byte) -104, 149);
                ++class169.field3262;
                class76.field1323.method812(false, class163.field3131);
                class76.field1323.method791(var3, true);
                class76.field1323.method796(arg1 ^ 58, var5);
                class76.field1323.method793(93, var4);
                class76.field1323.method808(arg1 ^ -85, class45.field741);
                class120.field2309 = 0;
                class169.field3255 = class66.method432(var3, false);
                class129.field2446 = var5;
            }
            if (~var2 == -22) {
                ++class96.field1771;
                class76.field1323.method635((byte) -91, 97);
                class76.field1323.method786(var3, (byte) -102);
                class76.field1323.method793(108, var4);
                class76.field1323.method812(false, var5);
                class120.field2309 = 0;
                class169.field3255 = class66.method432(var3, false);
                class129.field2446 = var5;
            }
            if (var2 == 5) {
                ++class28.field417;
                boolean var7 = class84.method514(var5, 1, 0, 0, var3, 0, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                if (!var7) {
                    class84.method514(var5, 1, 0, 1, var3, 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                }
                class95.field1754 = class5.field58;
                class83.field1451 = 0;
                class21.field323 = class172.field3330;
                class126.field2400 = 2;
                class76.field1323.method635((byte) -111, 123);
                class76.field1323.method812(false, class163.field3131);
                class76.field1323.method768(var4, -80);
                class76.field1323.method808(-83, class45.field741);
                class76.field1323.method768(var3 - -class200.field3767, -60);
                class76.field1323.method812(false, class2.field16 + var5);
            }
            if (~var2 == -41) {
                class38 var9 = class2.field10[var4];
                if (var9 != null) {
                    class84.method514(var9.field1099[0], 1, 0, 1, var9.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                    class83.field1451 = 0;
                    class21.field323 = class172.field3330;
                    class95.field1754 = class5.field58;
                    ++class104.field1943;
                    class126.field2400 = 2;
                    class76.field1323.method635((byte) -43, 98);
                    class76.field1323.method812(false, var4);
                }
            }
            if (~var2 == -1008) {
                class21.field323 = class172.field3330;
                class83.field1451 = 0;
                class126.field2400 = 2;
                class95.field1754 = class5.field58;
                ++class107.field1981;
                class76.field1323.method635((byte) -89, 205);
                class76.field1323.method768(var4, -57);
            }
            if (~var2 == -42 && class137.field2569 == null) {
                class163.method1076(var5, var3, 254);
                class137.field2569 = class82.method507((byte) 118, var3, var5);
                class168.method1116(class137.field2569, -100);
            }
            if (var2 == 1004) {
                class200 var10 = class66.method432(var3, false);
                if (var10 != null && ~var10.field3905[var5] <= -100001) {
                    class6.method20(0, class67.method440(0, new class10[] { class119.method846(0, var10.field3905[var5]), class151.field2888, class104.method678(500, var4).field1718 }), (byte) 117, class10.field119);
                } else {
                    class76.field1323.method635((byte) -77, 205);
                    ++class107.field1981;
                    class76.field1323.method768(var4, -72);
                }
                class120.field2309 = 0;
                class169.field3255 = class66.method432(var3, false);
                class129.field2446 = var5;
            }
            if (var2 == 13) {
                class125 var11 = class168.field3249[var4];
                if (var11 != null) {
                    ++class140.field2641;
                    class84.method514(var11.field1099[0], 1, 0, 1, var11.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                    class83.field1451 = 0;
                    class21.field323 = class172.field3330;
                    class95.field1754 = class5.field58;
                    class126.field2400 = 2;
                    class76.field1323.method635((byte) -61, 67);
                    class76.field1323.method793(105, var4);
                }
            }
            if (~var2 == -24) {
                class38 var12 = class2.field10[var4];
                if (var12 != null) {
                    class84.method514(var12.field1099[0], arg1 ^ 103, 0, 1, var12.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                    class83.field1451 = 0;
                    class95.field1754 = class5.field58;
                    class126.field2400 = 2;
                    class21.field323 = class172.field3330;
                    class76.field1323.method635((byte) -55, 162);
                    ++class137.field2568;
                    class76.field1323.method793(arg1 + -1, var4);
                }
            }
            if (~var2 == -31) {
                class125 var13 = class168.field3249[var4];
                if (var13 != null) {
                    class84.method514(var13.field1099[0], 1, 0, 1, var13.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                    class83.field1451 = 0;
                    class126.field2400 = 2;
                    class21.field323 = class172.field3330;
                    ++class39.field657;
                    class95.field1754 = class5.field58;
                    class76.field1323.method635((byte) -95, 4);
                    class76.field1323.method812(false, class163.field3131);
                    class76.field1323.method786(class45.field741, (byte) -78);
                    class76.field1323.method812(false, var4);
                }
            }
            if (~var2 == -30) {
                boolean var14 = class84.method514(var5, 1, 0, 0, var3, 0, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                ++class7.field83;
                if (!var14) {
                    class84.method514(var5, 1, 0, 1, var3, 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                }
                class83.field1451 = 0;
                class95.field1754 = class5.field58;
                class126.field2400 = 2;
                class21.field323 = class172.field3330;
                class76.field1323.method635((byte) -92, 48);
                class76.field1323.method796(93, var4);
                class76.field1323.method796(46, class200.field3767 + var3);
                class76.field1323.method796(109, class2.field16 + var5);
            }
            if (var2 == 32) {
                ++class32.field491;
                class116.method828(var3, var4, (byte) 101, var5);
                class76.field1323.method635((byte) -76, 114);
                class76.field1323.method793(97, (536857561 & var4) >> 14);
                class76.field1323.method796(38, class200.field3767 + var3);
                class76.field1323.method793(arg1 ^ 15, class2.field16 + var5);
            }
            if (var2 == 47) {
                class200 var16 = class82.method507((byte) 124, var3, var5);
                if (var16 != null) {
                    class207.method1341((byte) 29);
                    class168.method1118(var5, (byte) -121, var3, class166.method1102((byte) 95, class203.method1318(arg1 ^ 102, var16)));
                    class135.field2539 = 0;
                    class3.field30 = class106.method688(var16, false);
                    if (class3.field30 == null) {
                        class3.field30 = class151.field2881;
                    }
                    if (var16.field3927) {
                        class33.field501 = class67.method440(0, new class10[] { var16.field3792, class74.field1265 });
                        return;
                    }
                    class33.field501 = class67.method440(0, new class10[] { class1.field3, var16.field3854, class74.field1265 });
                }
            } else {
                if (var2 == 19) {
                    class76.field1323.method635((byte) -88, 24);
                    class76.field1323.method793(arg1 ^ 58, var5);
                    ++class168.field3243;
                    class76.field1323.method791(var3, true);
                    class76.field1323.method808(-81, class45.field741);
                    class76.field1323.method793(110, class163.field3131);
                }
                if (~var2 == -21) {
                    class207.method1341((byte) 29);
                    class200 var17 = class66.method432(var3, false);
                    class185.field3520 = var3;
                    class135.field2539 = 1;
                    class184.field3506 = var5;
                    class40.field668 = var4;
                    class168.method1116(var17, -110);
                    class141.field2660 = class67.method440(0, new class10[] { class116.field2220, class104.method678(arg1 + 398, var4).field1718, class74.field1265 });
                    if (class141.field2660 == null) {
                        class141.field2660 = class39.field664;
                    }
                } else {
                    if (~var2 == -2) {
                        class38 var18 = class2.field10[var4];
                        if (var18 != null) {
                            ++class89.field1563;
                            class84.method514(var18.field1099[0], arg1 + -101, 0, 1, var18.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class95.field1754 = class5.field58;
                            class21.field323 = class172.field3330;
                            class126.field2400 = 2;
                            class83.field1451 = 0;
                            class76.field1323.method635((byte) -51, 204);
                            class76.field1323.method768(var4, -55);
                            class76.field1323.method812(false, class184.field3506);
                            class76.field1323.method796(arg1 ^ 70, class40.field668);
                            class76.field1323.method802((byte) 2, class185.field3520);
                        }
                    }
                    if (~var2 == -47) {
                        ++class152.field2923;
                        boolean var19 = class84.method514(var5, arg1 + -101, 0, 0, var3, 0, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        if (!var19) {
                            class84.method514(var5, 1, 0, 1, var3, 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        }
                        class126.field2400 = 2;
                        class21.field323 = class172.field3330;
                        class83.field1451 = 0;
                        class95.field1754 = class5.field58;
                        class76.field1323.method635((byte) -49, 68);
                        class76.field1323.method812(false, var3 - -class200.field3767);
                        class76.field1323.method793(arg1 + 7, class2.field16 + var5);
                        class76.field1323.method796(arg1 + 24, var4);
                    }
                    if (var2 == 25) {
                        ++class33.field496;
                        class116.method828(var3, var4, (byte) 92, var5);
                        class76.field1323.method635((byte) -101, 100);
                        class76.field1323.method768(var4 >> 14 & 32767, arg1 + -158);
                        class76.field1323.method768(class200.field3767 + var3, -86);
                        class76.field1323.method812(false, class2.field16 + var5);
                    }
                    if (var2 == 31) {
                        ++class97.field1790;
                        class76.field1323.method635((byte) -104, 71);
                        class76.field1323.method786(var3, (byte) -41);
                        class200 var21 = class66.method432(var3, false);
                        if (var21.field3924 != null && ~var21.field3924[0][0] == -6) {
                            int var22 = var21.field3924[0][1];
                            if (~class13.field215[var22] != ~var21.field3806[0]) {
                                class13.field215[var22] = var21.field3806[0];
                                class157.method1056((byte) -127, var22);
                            }
                        }
                    }
                    if (var2 == 49) {
                        class38 var23 = class2.field10[var4];
                        if (var23 != null) {
                            ++class185.field3524;
                            class84.method514(var23.field1099[0], 1, 0, 1, var23.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class126.field2400 = 2;
                            class21.field323 = class172.field3330;
                            class83.field1451 = 0;
                            class95.field1754 = class5.field58;
                            class76.field1323.method635((byte) -52, 143);
                            class76.field1323.method812(false, var4);
                        }
                    }
                    if (~var2 == -35) {
                        class38 var24 = class2.field10[var4];
                        if (var24 != null) {
                            class84.method514(var24.field1099[0], 1, 0, 1, var24.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class95.field1754 = class5.field58;
                            class126.field2400 = 2;
                            class21.field323 = class172.field3330;
                            class83.field1451 = 0;
                            class76.field1323.method635((byte) -46, 242);
                            ++class68.field1195;
                            class76.field1323.method793(104, var4);
                        }
                    }
                    if (~var2 == -18) {
                        ++class106.field1979;
                        class76.field1323.method635((byte) -57, 217);
                        class76.field1323.method768(var4, arg1 + -162);
                        class76.field1323.method796(119, var5);
                        class76.field1323.method802((byte) 2, var3);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 44) {
                        boolean var25 = true;
                        class200 var26 = class66.method432(var3, false);
                        if (~var26.field3865 < -1) {
                            var25 = class183.method1183(var26, 58);
                        }
                        if (var25) {
                            class76.field1323.method635((byte) -106, 71);
                            ++class97.field1790;
                            class76.field1323.method786(var3, (byte) -49);
                        }
                    }
                    if (var2 == 1006) {
                        ++class191.field3627;
                        class83.field1451 = 0;
                        class21.field323 = class172.field3330;
                        class126.field2400 = 2;
                        class95.field1754 = class5.field58;
                        class76.field1323.method635((byte) -105, 77);
                        class76.field1323.method768((var4 & 536857749) >> 14, arg1 ^ -44);
                    }
                    if (var2 == 43) {
                        ++class152.field2921;
                        class76.field1323.method635((byte) -83, 168);
                        class76.field1323.method812(false, var5);
                        class76.field1323.method802((byte) 2, var3);
                        class76.field1323.method793(105, var4);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 4) {
                        class116.method828(var3, var4, (byte) 125, var5);
                        ++class79.field1391;
                        class76.field1323.method635((byte) -95, 22);
                        class76.field1323.method768(class200.field3767 + var3, -121);
                        class76.field1323.method768(class2.field16 + var5, -59);
                        class76.field1323.method796(arg1 ^ 25, (var4 & 536859388) >> 14);
                    }
                    if (var2 == 8) {
                        ++class128.field2434;
                        class76.field1323.method635((byte) -128, 46);
                        class76.field1323.method768(var5, -102);
                        class76.field1323.method802((byte) 2, var3);
                        class76.field1323.method768(var4, arg1 ^ -92);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 58) {
                        ++class84.field1467;
                        boolean var27 = class84.method514(var5, 1, 0, 0, var3, 0, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        if (!var27) {
                            class84.method514(var5, 1, 0, 1, var3, 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        }
                        class83.field1451 = 0;
                        class21.field323 = class172.field3330;
                        class95.field1754 = class5.field58;
                        class126.field2400 = 2;
                        class76.field1323.method635((byte) -81, 180);
                        class76.field1323.method812(false, class2.field16 + var5);
                        class76.field1323.method796(38, var3 - -class200.field3767);
                        class76.field1323.method768(var4, -85);
                    }
                    if (var2 == 15) {
                        class76.field1323.method635((byte) -96, 101);
                        ++class120.field2316;
                        class76.field1323.method812(false, var4);
                        class76.field1323.method768(class40.field668, arg1 + -159);
                        class76.field1323.method791(var3, true);
                        class76.field1323.method808(-60, class185.field3520);
                        class76.field1323.method812(false, var5);
                        class76.field1323.method793(111, class184.field3506);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 33) {
                        class38 var29 = class2.field10[var4];
                        if (var29 != null) {
                            ++class35.field543;
                            class84.method514(var29.field1099[0], 1, 0, 1, var29.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class126.field2400 = 2;
                            class95.field1754 = class5.field58;
                            class83.field1451 = 0;
                            class21.field323 = class172.field3330;
                            class76.field1323.method635((byte) -54, 152);
                            class76.field1323.method796(arg1 ^ 116, var4);
                        }
                    }
                    if (~var2 == -11) {
                        ++class76.field1315;
                        class76.field1323.method635((byte) -62, 137);
                        class76.field1323.method796(33, var5);
                        class76.field1323.method808(-47, var3);
                        class76.field1323.method812(false, var4);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 24) {
                        class76.field1323.method635((byte) -44, 139);
                        ++class124.field2372;
                        class76.field1323.method796(84, var4);
                        class76.field1323.method808(-100, var3);
                        class76.field1323.method793(arg1 ^ 28, var5);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 45) {
                        ++class122.field2343;
                        class76.field1323.method635((byte) -77, 167);
                        class76.field1323.method796(35, var4);
                        class76.field1323.method786(var3, (byte) -60);
                        class76.field1323.method793(112, var5);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 7) {
                        class125 var30 = class168.field3249[var4];
                        if (var30 != null) {
                            class84.method514(var30.field1099[0], 1, 0, 1, var30.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class83.field1451 = 0;
                            class126.field2400 = 2;
                            class95.field1754 = class5.field58;
                            ++class111.field2051;
                            class21.field323 = class172.field3330;
                            class76.field1323.method635((byte) -114, 121);
                            class76.field1323.method812(false, var4);
                        }
                    }
                    if (var2 == 39) {
                        class38 var31 = class2.field10[var4];
                        if (var31 != null) {
                            class84.method514(var31.field1099[0], 1, 0, 1, var31.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            ++class74.field1267;
                            class21.field323 = class172.field3330;
                            class83.field1451 = 0;
                            class126.field2400 = 2;
                            class95.field1754 = class5.field58;
                            class76.field1323.method635((byte) -42, 85);
                            class76.field1323.method768(class163.field3131, -108);
                            class76.field1323.method768(var4, -52);
                            class76.field1323.method786(class45.field741, (byte) -110);
                        }
                    }
                    if (~var2 == -49) {
                        ++class163.field3129;
                        boolean var32 = class84.method514(var5, 1, 0, 0, var3, 0, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        if (!var32) {
                            class84.method514(var5, 1, 0, 1, var3, 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        }
                        class95.field1754 = class5.field58;
                        class21.field323 = class172.field3330;
                        class126.field2400 = 2;
                        class83.field1451 = 0;
                        class76.field1323.method635((byte) -75, 158);
                        class76.field1323.method768(var4, -123);
                        class76.field1323.method812(false, class200.field3767 + var3);
                        class76.field1323.method768(class2.field16 + var5, -77);
                    }
                    if (var2 == 18) {
                        ++class41.field678;
                        class76.field1323.method635((byte) -47, 208);
                        class76.field1323.method802((byte) 2, var3);
                        class76.field1323.method793(101, var5);
                        class76.field1323.method812(false, var4);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (~var2 == -4) {
                        class125 var34 = class168.field3249[var4];
                        if (var34 != null) {
                            ++class50.field888;
                            class84.method514(var34.field1099[0], 1, 0, 1, var34.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class83.field1451 = 0;
                            class21.field323 = class172.field3330;
                            class126.field2400 = 2;
                            class95.field1754 = class5.field58;
                            class76.field1323.method635((byte) -113, 102);
                            class76.field1323.method793(118, var4);
                        }
                    }
                    if (~var2 == -23) {
                        ++class10.field157;
                        class76.field1323.method635((byte) -56, 83);
                        class76.field1323.method796(127, var4);
                        class76.field1323.method796(36, var5);
                        class76.field1323.method808(-114, var3);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (var2 == 12) {
                        class76.field1323.method635((byte) -56, 175);
                        class76.field1323.method802((byte) 2, var3);
                        ++class176.field3376;
                        class76.field1323.method793(119, var5);
                        class76.field1323.method812(false, var4);
                        class120.field2309 = 0;
                        class169.field3255 = class66.method432(var3, false);
                        class129.field2446 = var5;
                    }
                    if (~var2 == -38) {
                        class125 var35 = class168.field3249[var4];
                        if (var35 != null) {
                            ++class192.field3635;
                            class84.method514(var35.field1099[0], 1, 0, 1, var35.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class126.field2400 = 2;
                            class83.field1451 = 0;
                            class95.field1754 = class5.field58;
                            class21.field323 = class172.field3330;
                            class76.field1323.method635((byte) -113, 25);
                            class76.field1323.method796(arg1 + 9, class184.field3506);
                            class76.field1323.method768(class40.field668, arg1 + -174);
                            class76.field1323.method768(var4, -85);
                            class76.field1323.method791(class185.field3520, true);
                        }
                    }
                    if (~var2 == -1002) {
                        class95.field1754 = class5.field58;
                        class126.field2400 = 2;
                        class83.field1451 = 0;
                        class21.field323 = class172.field3330;
                        class125 var36 = class168.field3249[var4];
                        if (var36 != null) {
                            class188 var37 = var36.field2386;
                            if (var37.field3596 != null) {
                                var37 = var37.method1208((byte) -109);
                            }
                            if (var37 != null) {
                                ++class79.field1394;
                                class76.field1323.method635((byte) -51, 54);
                                class76.field1323.method768(var37.field3595, -127);
                            }
                        }
                    }
                    if (var2 == 1003) {
                        ++class49.field866;
                        class116.method828(var3, var4, (byte) 104, var5);
                        class76.field1323.method635((byte) -74, 55);
                        class76.field1323.method796(63, (var4 & 536854620) >> 14);
                        class76.field1323.method796(35, var5 - -class2.field16);
                        class76.field1323.method812(false, class200.field3767 + var3);
                    }
                    if (var2 == 26) {
                        class38 var38 = class2.field10[var4];
                        if (var38 != null) {
                            ++class47.field811;
                            class84.method514(var38.field1099[0], 1, 0, 1, var38.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class95.field1754 = class5.field58;
                            class126.field2400 = 2;
                            class21.field323 = class172.field3330;
                            class83.field1451 = 0;
                            class76.field1323.method635((byte) -112, 177);
                            class76.field1323.method796(61, var4);
                        }
                    }
                    if (~var2 == -3) {
                        class125 var39 = class168.field3249[var4];
                        if (var39 != null) {
                            class84.method514(var39.field1099[0], 1, 0, 1, var39.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class95.field1754 = class5.field58;
                            class21.field323 = class172.field3330;
                            class126.field2400 = 2;
                            class83.field1451 = 0;
                            class76.field1323.method635((byte) -90, 150);
                            class76.field1323.method793(arg1 + 22, var4);
                            ++class130.field2463;
                        }
                    }
                    if (var2 == 16 && class116.method828(var3, var4, (byte) 117, var5)) {
                        ++class165.field3158;
                        class76.field1323.method635((byte) -70, 31);
                        class76.field1323.method793(arg1 + 21, (536870857 & var4) >> 14);
                        class76.field1323.method793(88, class200.field3767 + var3);
                        class76.field1323.method793(arg1 ^ 15, class2.field16 + var5);
                        class76.field1323.method793(120, class163.field3131);
                        class76.field1323.method791(class45.field741, true);
                    }
                    if (var2 == 6) {
                        class125 var40 = class168.field3249[var4];
                        if (var40 != null) {
                            ++class102.field1915;
                            class84.method514(var40.field1099[0], arg1 ^ 103, 0, 1, var40.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class83.field1451 = 0;
                            class95.field1754 = class5.field58;
                            class126.field2400 = 2;
                            class21.field323 = class172.field3330;
                            class76.field1323.method635((byte) -117, 86);
                            class76.field1323.method768(var4, -124);
                        }
                    }
                    if (var2 == 51) {
                        class116.method828(var3, var4, (byte) 89, var5);
                        class76.field1323.method635((byte) -60, 66);
                        ++class75.field1277;
                        class76.field1323.method793(107, class2.field16 + var5);
                        class76.field1323.method796(32, class200.field3767 + var3);
                        class76.field1323.method796(50, 32767 & var4 >> 14);
                    }
                    if (~var2 == -10 || var2 == 1002) {
                        class109.method701(class148.field2845[arg0], var5, 58, var4, var3);
                    }
                    if (~var2 == -29 && class116.method828(var3, var4, (byte) 106, var5)) {
                        class76.field1323.method635((byte) -108, 140);
                        class76.field1323.method768(class184.field3506, -64);
                        class76.field1323.method768(class200.field3767 + var3, arg1 ^ -60);
                        class76.field1323.method808(arg1 ^ -5, class185.field3520);
                        ++class42.field696;
                        class76.field1323.method793(113, class2.field16 + var5);
                        class76.field1323.method793(110, var4 >> 14 & 32767);
                        class76.field1323.method768(class40.field668, -60);
                    }
                    if (~var2 == -51) {
                        ++class97.field1790;
                        class76.field1323.method635((byte) -114, 71);
                        class76.field1323.method786(var3, (byte) -52);
                        class200 var41 = class66.method432(var3, false);
                        if (var41.field3924 != null && ~var41.field3924[0][0] == -6) {
                            int var42 = var41.field3924[0][1];
                            class13.field215[var42] = -class13.field215[var42] + 1;
                            class157.method1056((byte) -127, var42);
                        }
                    }
                    if (~var2 == -15) {
                        class38 var43 = class2.field10[var4];
                        if (var43 != null) {
                            ++class42.field686;
                            class84.method514(var43.field1099[0], 1, 0, 1, var43.field1106[0], 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                            class21.field323 = class172.field3330;
                            class95.field1754 = class5.field58;
                            class83.field1451 = 0;
                            class126.field2400 = 2;
                            class76.field1323.method635((byte) -83, 212);
                            class76.field1323.method793(109, var4);
                        }
                    }
                    if (arg1 != 102) {
                        field460 = null;
                    }
                    if (var2 == 11) {
                        ++class27.field408;
                        boolean var44 = class84.method514(var5, 1, 0, 0, var3, 0, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        if (!var44) {
                            class84.method514(var5, 1, 0, 1, var3, 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        }
                        class83.field1451 = 0;
                        class95.field1754 = class5.field58;
                        class21.field323 = class172.field3330;
                        class126.field2400 = 2;
                        class76.field1323.method635((byte) -95, 61);
                        class76.field1323.method793(124, var4);
                        class76.field1323.method812(false, var5 - -class2.field16);
                        class76.field1323.method796(arg1 ^ 19, class200.field3767 + var3);
                    }
                    if (var2 == 36) {
                        ++class77.field1348;
                        boolean var46 = class84.method514(var5, arg1 + -101, 0, 0, var3, 0, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        if (!var46) {
                            class84.method514(var5, 1, 0, 1, var3, 1, 2, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], false);
                        }
                        class83.field1451 = 0;
                        class126.field2400 = 2;
                        class21.field323 = class172.field3330;
                        class95.field1754 = class5.field58;
                        class76.field1323.method635((byte) -96, 38);
                        class76.field1323.method796(arg1 + -16, class184.field3506);
                        class76.field1323.method796(arg1 + 2, var4);
                        class76.field1323.method802((byte) 2, class185.field3520);
                        class76.field1323.method768(class2.field16 + var5, -122);
                        class76.field1323.method793(122, class200.field3767 + var3);
                        class76.field1323.method793(119, class40.field668);
                    }
                    if (class135.field2539 != 0) {
                        class135.field2539 = 0;
                        class168.method1116(class66.method432(class185.field3520, false), -118);
                    }
                    if (class32.field482) {
                        class207.method1341((byte) 29);
                    }
                    if (class169.field3255 != null && ~class120.field2309 == -1) {
                        class168.method1116(class169.field3255, -73);
                    }
                }
            }
        }
    }
}

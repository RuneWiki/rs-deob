import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class163 extends class33 {

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    private int field3011 = 2048;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    private int field3010 = 0;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    private int field3015 = 10;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lrd;")
    public static class173 field3023 = class133.method843("logo", 112);

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "Lrd;")
    private static class173 field3026 = class133.method843("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -86);

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lrd;")
    public static class173 field3019 = field3026;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "B")
    public static byte field3021;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "[I")
    private int[] field3006;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "[I")
    public static int[] field3013;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "[I")
    private int[] field3014;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[Ldh;")
    public static class39[] field3009;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        this.method1053(-74);
        ++field3007;
        if (arg0 != -1) {
            method1050(37);
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static final void method1050(int arg0) {
        ++field3022;
        int var1 = class158.field2955.method539(class202.field3918);
        for (int var2 = 0; ~var2 > ~class195.field3792; ++var2) {
            int var6 = class158.field2955.method539(class14.method129(var2, (byte) 115));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class30.field619 = class195.field3792 * 15 + 22;
        class167.field3223 = true;
        int var3 = class195.field3792 * 15 + 21;
        int var4 = class23.field493;
        var1 += 8;
        int var5 = -(var1 / 2) + class41.field849;
        if (var4 - -var3 > 503) {
            var4 = -var3 + 503;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class215.field4168 = var4;
        if (arg0 >= -106) {
            field3026 = null;
        }
        class51.field1047 = var1;
        if (~(var1 + var5) < -766) {
            var5 = 765 - var1;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        class64.field1270 = var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
    public static final void method1051(byte arg0, int arg1) {
        ++field3008;
        if (arg1 >= 0) {
            int var2 = class80.field1577[arg1];
            int var3 = class22.field492[arg1];
            int var4 = (int) class198.field3862[arg1];
            int var5 = class179.field3526[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            long var6 = class198.field3862[arg1];
            if (var5 == 3) {
                ++class153.field2894;
                class165.field3175.method1023(93, -21822);
                class165.field3175.method775(732495312, var3);
                class165 var8 = class103.method639(var3, true);
                if (var8.field3049 != null && ~var8.field3049[0][0] == -6) {
                    int var9 = var8.field3049[0][1];
                    if (class45.field913[var9] != var8.field3154[0]) {
                        class45.field913[var9] = var8.field3154[0];
                        class9.method59(var9, 4);
                    }
                }
            }
            if (~var5 == -20) {
                ++class104.field1935;
                boolean var10 = class30.method233(0, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                if (!var10) {
                    class30.method233(1, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                }
                class161.field2996 = 0;
                class31.field650 = class23.field493;
                class155.field2925 = 2;
                class20.field447 = class41.field849;
                class165.field3175.method1023(230, arg0 + -21729);
                class165.field3175.method778(var4, (byte) 74);
                class165.field3175.method778(class43.field874 + var3, (byte) 74);
                class165.field3175.method778(class108.field2024 + var2, (byte) 74);
            }
            if (var5 == 36) {
                class219.method1426(arg0 ^ -2, var6, var2, var3);
                class165.field3175.method1023(192, arg0 + -21729);
                class165.field3175.method778(class108.field2024 + var2, (byte) 74);
                ++class93.field1751;
                class165.field3175.method736((int) (var6 >>> 32) & Integer.MAX_VALUE, 126);
                class165.field3175.method762(var3 - -class43.field874, true);
            }
            if (~var5 == -5) {
                class212 var12 = class183.field3600[var4];
                if (var12 != null) {
                    class30.method233(1, var12.field2814[0], class175.field3447.field2814[0], var12.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    class155.field2925 = 2;
                    class20.field447 = class41.field849;
                    class31.field650 = class23.field493;
                    ++class19.field419;
                    class161.field2996 = 0;
                    class165.field3175.method1023(111, -21822);
                    class165.field3175.method769(var4, 126);
                }
            }
            if (var5 == 21) {
                class212 var13 = class183.field3600[var4];
                if (var13 != null) {
                    class30.method233(1, var13.field2814[0], class175.field3447.field2814[0], var13.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    class31.field650 = class23.field493;
                    class161.field2996 = 0;
                    class20.field447 = class41.field849;
                    ++class57.field1122;
                    class155.field2925 = 2;
                    class165.field3175.method1023(122, arg0 + -21729);
                    class165.field3175.method741(class131.field2475, (byte) 9);
                    class165.field3175.method736(var4, -111);
                    class165.field3175.method778(class42.field864, (byte) 74);
                }
            }
            if (var5 == 20) {
                ++class138.field2586;
                class219.method1426(65, var6, var2, var3);
                class165.field3175.method1023(199, -21822);
                class165.field3175.method769(class108.field2024 + var2, 126);
                class165.field3175.method762(var3 - -class43.field874, true);
                class165.field3175.method769(Integer.MAX_VALUE & (int) (var6 >>> 32), 126);
            }
            if (var5 == 16) {
                class197.method1310(-18);
            }
            if (var5 == 1006) {
                ++class77.field1499;
                class31.field650 = class23.field493;
                class155.field2925 = 2;
                class161.field2996 = 0;
                class20.field447 = class41.field849;
                class165.field3175.method1023(124, -21822);
                class165.field3175.method769(var4, 126);
            }
            if (var5 == 40) {
                ++class211.field4086;
                class165.field3175.method1023(142, -21822);
                class165.field3175.method762(var4, true);
                class165.field3175.method762(var2, true);
                class165.field3175.method773(-66, var3);
                class3.field21 = 0;
                class75.field1485 = class103.method639(var3, true);
                class214.field4160 = var2;
            }
            if (var5 == 17) {
                boolean var14 = class30.method233(0, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                ++class10.field172;
                if (!var14) {
                    class30.method233(1, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                }
                class161.field2996 = 0;
                class20.field447 = class41.field849;
                class155.field2925 = 2;
                class31.field650 = class23.field493;
                class165.field3175.method1023(129, -21822);
                class165.field3175.method762(var2 - -class108.field2024, true);
                class165.field3175.method769(class43.field874 + var3, 126);
                class165.field3175.method769(var4, arg0 ^ -35);
            }
            if (~var5 == -48) {
                boolean var16 = true;
                class165 var17 = class103.method639(var3, true);
                if (~var17.field3170 < -1) {
                    var16 = class204.method1358(var17, (byte) 120);
                }
                if (var16) {
                    ++class153.field2894;
                    class165.field3175.method1023(93, -21822);
                    class165.field3175.method775(732495312, var3);
                }
            }
            if (var5 == 11) {
                class120 var18 = client.field632[var4];
                if (var18 != null) {
                    ++class114.field2125;
                    class30.method233(1, var18.field2814[0], class175.field3447.field2814[0], var18.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    class31.field650 = class23.field493;
                    class161.field2996 = 0;
                    class155.field2925 = 2;
                    class20.field447 = class41.field849;
                    class165.field3175.method1023(242, -21822);
                    class165.field3175.method769(var4, 126);
                }
            }
            if (var5 == 12) {
                class120 var19 = client.field632[var4];
                if (var19 != null) {
                    class30.method233(1, var19.field2814[0], class175.field3447.field2814[0], var19.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    class155.field2925 = 2;
                    ++field3017;
                    class31.field650 = class23.field493;
                    class161.field2996 = 0;
                    class20.field447 = class41.field849;
                    class165.field3175.method1023(31, -21822);
                    class165.field3175.method769(var4, arg0 ^ -35);
                }
            }
            if (~var5 == -51) {
                class212 var20 = class183.field3600[var4];
                if (var20 != null) {
                    ++class40.field820;
                    class30.method233(1, var20.field2814[0], class175.field3447.field2814[0], var20.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    class161.field2996 = 0;
                    class31.field650 = class23.field493;
                    class155.field2925 = 2;
                    class20.field447 = class41.field849;
                    class165.field3175.method1023(97, -21822);
                    class165.field3175.method769(var4, arg0 + 219);
                }
            }
            if (var5 == 39) {
                ++class184.field3608;
                class165.field3175.method1023(19, arg0 + -21729);
                class165.field3175.method762(var4, true);
                class165.field3175.method778(var2, (byte) 74);
                class165.field3175.method741(var3, (byte) 9);
                class3.field21 = 0;
                class75.field1485 = class103.method639(var3, true);
                class214.field4160 = var2;
            }
            if (~var5 == -7) {
                class165 var21 = class29.method231(var3, var2, -1);
                if (var21 != null) {
                    class173.method1138(arg0 ^ 38);
                    class126.method805(var2, arg0 + 197, class123.method797(class78.method474(var21, 92), (byte) -73), var3);
                    class9.field166 = 0;
                    class48.field1023 = class5.method40(127, var21);
                    if (class48.field1023 == null) {
                        class48.field1023 = class3.field33;
                    }
                    if (!var21.field3108) {
                        class42.field868 = class173.method1158(-3, new class173[] { class144.field2693, var21.field3056, class159.field2970 });
                        return;
                    }
                    class42.field868 = class173.method1158(arg0 + 90, new class173[] { var21.field3109, class159.field2970 });
                }
            } else {
                if (~var5 == -36) {
                    boolean var22 = class30.method233(0, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                    ++class202.field3908;
                    if (!var22) {
                        class30.method233(1, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    }
                    class155.field2925 = 2;
                    class161.field2996 = 0;
                    class20.field447 = class41.field849;
                    class31.field650 = class23.field493;
                    class165.field3175.method1023(58, arg0 + -21729);
                    class165.field3175.method778(class108.field2024 + var2, (byte) 74);
                    class165.field3175.method762(class43.field874 + var3, true);
                    class165.field3175.method762(var4, true);
                }
                if (~var5 == -50) {
                    ++class67.field1308;
                    class165.field3175.method1023(56, -21822);
                    class165.field3175.method773(arg0 + 218, var3);
                    class165.field3175.method762(var2, true);
                    class165.field3175.method778(var4, (byte) 74);
                    class3.field21 = 0;
                    class75.field1485 = class103.method639(var3, true);
                    class214.field4160 = var2;
                }
                if (var5 == 58) {
                    class212 var24 = class183.field3600[var4];
                    if (var24 != null) {
                        ++class22.field480;
                        class30.method233(1, var24.field2814[0], class175.field3447.field2814[0], var24.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class20.field447 = class41.field849;
                        class155.field2925 = 2;
                        class161.field2996 = 0;
                        class31.field650 = class23.field493;
                        class165.field3175.method1023(243, -21822);
                        class165.field3175.method762(var4, true);
                        class165.field3175.method762(class98.field1793, true);
                        class165.field3175.method741(class144.field2692, (byte) 9);
                        class165.field3175.method736(class21.field468, -111);
                    }
                }
                if (~var5 == -46) {
                    class212 var25 = class183.field3600[var4];
                    if (var25 != null) {
                        ++class22.field474;
                        class30.method233(1, var25.field2814[0], class175.field3447.field2814[0], var25.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class31.field650 = class23.field493;
                        class155.field2925 = 2;
                        class161.field2996 = 0;
                        class20.field447 = class41.field849;
                        class165.field3175.method1023(198, -21822);
                        class165.field3175.method769(var4, arg0 + 219);
                    }
                }
                if (~var5 == -35) {
                    class212 var26 = class183.field3600[var4];
                    if (var26 != null) {
                        class30.method233(1, var26.field2814[0], class175.field3447.field2814[0], var26.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class20.field447 = class41.field849;
                        class155.field2925 = 2;
                        ++class188.field3670;
                        class31.field650 = class23.field493;
                        class161.field2996 = 0;
                        class165.field3175.method1023(211, -21822);
                        class165.field3175.method762(var4, true);
                    }
                }
                if (~var5 == -44) {
                    class120 var27 = client.field632[var4];
                    if (var27 != null) {
                        class30.method233(1, var27.field2814[0], class175.field3447.field2814[0], var27.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class155.field2925 = 2;
                        ++class41.field841;
                        class20.field447 = class41.field849;
                        class161.field2996 = 0;
                        class31.field650 = class23.field493;
                        class165.field3175.method1023(223, -21822);
                        class165.field3175.method736(var4, arg0 + 156);
                    }
                }
                if (~var5 == -43) {
                    class219.method1426(arg0 ^ -113, var6, var2, var3);
                    ++class131.field2474;
                    class165.field3175.method1023(105, arg0 ^ 21857);
                    class165.field3175.method769(class43.field874 + var3, 126);
                    class165.field3175.method736(Integer.MAX_VALUE & (int) (var6 >>> 32), -80);
                    class165.field3175.method762(var2 - -class108.field2024, true);
                }
                if (var5 == 9) {
                    class120 var28 = client.field632[var4];
                    if (var28 != null) {
                        ++class191.field3731;
                        class30.method233(1, var28.field2814[0], class175.field3447.field2814[0], var28.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class155.field2925 = 2;
                        class161.field2996 = 0;
                        class20.field447 = class41.field849;
                        class31.field650 = class23.field493;
                        class165.field3175.method1023(98, -21822);
                        class165.field3175.method736(var4, 79);
                    }
                }
                if (~var5 == -45) {
                    ++class97.field1776;
                    class165.field3175.method1023(46, -21822);
                    class165.field3175.method769(var2, arg0 ^ -35);
                    class165.field3175.method736(var4, 41);
                    class165.field3175.method741(var3, (byte) 9);
                    class3.field21 = 0;
                    class75.field1485 = class103.method639(var3, true);
                    class214.field4160 = var2;
                }
                if (~var5 == -16) {
                    class120 var29 = client.field632[var4];
                    if (var29 != null) {
                        class30.method233(1, var29.field2814[0], class175.field3447.field2814[0], var29.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        ++class151.field2874;
                        class31.field650 = class23.field493;
                        class20.field447 = class41.field849;
                        class155.field2925 = 2;
                        class161.field2996 = 0;
                        class165.field3175.method1023(114, -21822);
                        class165.field3175.method754((byte) -88, class144.field2692);
                        class165.field3175.method762(class98.field1793, true);
                        class165.field3175.method736(class21.field468, 73);
                        class165.field3175.method736(var4, arg0 ^ 42);
                    }
                }
                if (~var5 == -2) {
                    ++class134.field2533;
                    boolean var30 = class30.method233(0, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                    if (!var30) {
                        class30.method233(1, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    }
                    class155.field2925 = 2;
                    class161.field2996 = 0;
                    class31.field650 = class23.field493;
                    class20.field447 = class41.field849;
                    class165.field3175.method1023(113, -21822);
                    class165.field3175.method778(var3 - -class43.field874, (byte) 74);
                    class165.field3175.method762(class108.field2024 + var2, true);
                    class165.field3175.method736(var4, arg0 ^ -6);
                }
                if (~var5 == -30) {
                    class120 var32 = client.field632[var4];
                    if (var32 != null) {
                        ++class135.field2552;
                        class30.method233(1, var32.field2814[0], class175.field3447.field2814[0], var32.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class161.field2996 = 0;
                        class155.field2925 = 2;
                        class20.field447 = class41.field849;
                        class31.field650 = class23.field493;
                        class165.field3175.method1023(121, -21822);
                        class165.field3175.method736(var4, 69);
                    }
                }
                if (~var5 == -15) {
                    class120 var33 = client.field632[var4];
                    if (var33 != null) {
                        ++class41.field848;
                        class30.method233(1, var33.field2814[0], class175.field3447.field2814[0], var33.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class31.field650 = class23.field493;
                        class20.field447 = class41.field849;
                        class155.field2925 = 2;
                        class161.field2996 = 0;
                        class165.field3175.method1023(128, -21822);
                        class165.field3175.method762(class42.field864, true);
                        class165.field3175.method736(var4, 114);
                        class165.field3175.method775(arg0 + 732495405, class131.field2475);
                    }
                }
                if (var5 == 5) {
                    class165.field3175.method1023(178, arg0 ^ 21857);
                    class165.field3175.method736(var2, 112);
                    ++class10.field177;
                    class165.field3175.method778(var4, (byte) 74);
                    class165.field3175.method736(class42.field864, -108);
                    class165.field3175.method741(var3, (byte) 9);
                    class165.field3175.method775(732495312, class131.field2475);
                    class3.field21 = 0;
                    class75.field1485 = class103.method639(var3, true);
                    class214.field4160 = var2;
                }
                if (var5 == 48) {
                    ++class186.field3615;
                    boolean var34 = class30.method233(0, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                    if (!var34) {
                        class30.method233(1, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    }
                    class155.field2925 = 2;
                    class20.field447 = class41.field849;
                    class161.field2996 = 0;
                    class31.field650 = class23.field493;
                    class165.field3175.method1023(236, -21822);
                    class165.field3175.method778(class43.field874 + var3, (byte) 74);
                    class165.field3175.method736(class42.field864, -85);
                    class165.field3175.method762(class108.field2024 + var2, true);
                    class165.field3175.method762(var4, true);
                    class165.field3175.method775(732495312, class131.field2475);
                }
                if (var5 == 41) {
                    ++class4.field78;
                    class165.field3175.method1023(251, -21822);
                    class165.field3175.method773(74, var3);
                    class165.field3175.method769(var2, 126);
                    class165.field3175.method778(var4, (byte) 74);
                    class3.field21 = 0;
                    class75.field1485 = class103.method639(var3, true);
                    class214.field4160 = var2;
                }
                if (~var5 == -31) {
                    class182.method1235(class172.field3347, var2, var3);
                }
                if (var5 == 32) {
                    class165.field3175.method1023(93, -21822);
                    class165.field3175.method775(arg0 ^ -732495245, var3);
                    class165 var36 = class103.method639(var3, true);
                    ++class153.field2894;
                    if (var36.field3049 != null && ~var36.field3049[0][0] == -6) {
                        int var37 = var36.field3049[0][1];
                        class45.field913[var37] = 1 - class45.field913[var37];
                        class9.method59(var37, 4);
                    }
                }
                if (var5 == 46) {
                    ++class152.field2879;
                    boolean var38 = class30.method233(0, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                    if (!var38) {
                        class30.method233(1, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                    }
                    class161.field2996 = 0;
                    class20.field447 = class41.field849;
                    class31.field650 = class23.field493;
                    class155.field2925 = 2;
                    class165.field3175.method1023(119, -21822);
                    class165.field3175.method778(class98.field1793, (byte) 74);
                    class165.field3175.method736(class108.field2024 + var2, 84);
                    class165.field3175.method769(var4, 126);
                    class165.field3175.method741(class144.field2692, (byte) 9);
                    class165.field3175.method736(class43.field874 + var3, -93);
                    class165.field3175.method769(class21.field468, 126);
                }
                if (var5 == 18 || ~var5 == -1002) {
                    class207.method1369(var4, class21.field461[arg1], var2, (byte) -48, var3);
                }
                if (~var5 == -11 && class93.field1749 == null) {
                    class169.method1091(4698, var2, var3);
                    class93.field1749 = class29.method231(var3, var2, arg0 + 92);
                    class209.method1379(1, class93.field1749);
                }
                if (var5 == 37 && class219.method1426(arg0 + 173, var6, var2, var3)) {
                    ++class12.field195;
                    class165.field3175.method1023(249, -21822);
                    class165.field3175.method769(var2 - -class108.field2024, 126);
                    class165.field3175.method762(class43.field874 + var3, true);
                    class165.field3175.method778((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 74);
                    class165.field3175.method769(class42.field864, 126);
                    class165.field3175.method741(class131.field2475, (byte) 9);
                }
                if (var5 == 8) {
                    class212 var40 = class183.field3600[var4];
                    if (var40 != null) {
                        ++class15.field344;
                        class30.method233(1, var40.field2814[0], class175.field3447.field2814[0], var40.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class155.field2925 = 2;
                        class161.field2996 = 0;
                        class20.field447 = class41.field849;
                        class31.field650 = class23.field493;
                        class165.field3175.method1023(75, -21822);
                        class165.field3175.method778(var4, (byte) 74);
                    }
                }
                if (var5 == 26) {
                    class212 var41 = class183.field3600[var4];
                    if (var41 != null) {
                        class30.method233(1, var41.field2814[0], class175.field3447.field2814[0], var41.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class161.field2996 = 0;
                        class31.field650 = class23.field493;
                        class20.field447 = class41.field849;
                        ++class5.field121;
                        class155.field2925 = 2;
                        class165.field3175.method1023(134, arg0 + -21729);
                        class165.field3175.method769(var4, arg0 + 219);
                    }
                }
                if (var5 == 1004) {
                    class31.field650 = class23.field493;
                    class161.field2996 = 0;
                    class155.field2925 = 2;
                    class20.field447 = class41.field849;
                    class120 var42 = client.field632[var4];
                    if (var42 != null) {
                        class45 var43 = var42.field2215;
                        if (var43.field922 != null) {
                            var43 = var43.method318((byte) 92);
                        }
                        if (var43 != null) {
                            class165.field3175.method1023(152, -21822);
                            class165.field3175.method736(var43.field927, arg0 ^ -9);
                            ++class114.field2107;
                        }
                    }
                }
                if (~var5 == -3) {
                    ++class143.field2679;
                    class219.method1426(109, var6, var2, var3);
                    class165.field3175.method1023(164, arg0 ^ 21857);
                    class165.field3175.method736(var3 - -class43.field874, -93);
                    class165.field3175.method762(class108.field2024 + var2, true);
                    class165.field3175.method736(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 + 137);
                }
                if (var5 == 25) {
                    class212 var44 = class183.field3600[var4];
                    if (var44 != null) {
                        ++class10.field173;
                        class30.method233(1, var44.field2814[0], class175.field3447.field2814[0], var44.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class161.field2996 = 0;
                        class155.field2925 = 2;
                        class31.field650 = class23.field493;
                        class20.field447 = class41.field849;
                        class165.field3175.method1023(253, -21822);
                        class165.field3175.method762(var4, true);
                    }
                }
                if (var5 == 1003) {
                    ++class131.field2467;
                    class219.method1426(63, var6, var2, var3);
                    class165.field3175.method1023(103, -21822);
                    class165.field3175.method778((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 74);
                    class165.field3175.method762(var2 - -class108.field2024, true);
                    class165.field3175.method769(class43.field874 + var3, 126);
                }
                if (var5 == 24) {
                    class165.field3175.method1023(246, -21822);
                    class165.field3175.method769(var4, 126);
                    ++class52.field1068;
                    class165.field3175.method769(var2, 126);
                    class165.field3175.method754((byte) 116, var3);
                    class3.field21 = 0;
                    class75.field1485 = class103.method639(var3, true);
                    class214.field4160 = var2;
                }
                if (~var5 == -1003) {
                    class155.field2925 = 2;
                    class31.field650 = class23.field493;
                    class161.field2996 = 0;
                    ++class140.field2603;
                    class20.field447 = class41.field849;
                    class165.field3175.method1023(235, -21822);
                    class165.field3175.method762(var4, true);
                }
                if (var5 == 7) {
                    class165.field3175.method1023(68, -21822);
                    class165.field3175.method741(var3, (byte) 9);
                    ++class12.field194;
                    class165.field3175.method769(var2, 126);
                    class165.field3175.method762(var4, true);
                    class3.field21 = 0;
                    class75.field1485 = class103.method639(var3, true);
                    class214.field4160 = var2;
                }
                if (var5 == 57) {
                    class212 var45 = class183.field3600[var4];
                    if (var45 != null) {
                        ++class69.field1328;
                        class30.method233(1, var45.field2814[0], class175.field3447.field2814[0], var45.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        class161.field2996 = 0;
                        class31.field650 = class23.field493;
                        class20.field447 = class41.field849;
                        class155.field2925 = 2;
                        class165.field3175.method1023(163, -21822);
                        class165.field3175.method769(var4, 126);
                    }
                }
                if (var5 == 13) {
                    class173.method1138(arg0 + -35);
                    class165 var46 = class103.method639(var3, true);
                    class144.field2692 = var3;
                    class21.field468 = var2;
                    class9.field166 = 1;
                    class98.field1793 = var4;
                    class209.method1379(1, var46);
                    class150.field2849 = class173.method1158(-3, new class173[] { class214.field4151, class195.method1298(1639, var4).field399, class159.field2970 });
                    if (class150.field2849 == null) {
                        class150.field2849 = class157.field2953;
                    }
                } else {
                    if (var5 == 33) {
                        class165.field3175.method1023(150, -21822);
                        ++class92.field1735;
                        class165.field3175.method762(var2, true);
                        class165.field3175.method775(732495312, var3);
                        class165.field3175.method778(class42.field864, (byte) 74);
                        class165.field3175.method773(113, class131.field2475);
                    }
                    if (arg0 != -93) {
                        field3026 = null;
                    }
                    if (~var5 == -23) {
                        ++class203.field3945;
                        class165.field3175.method1023(137, arg0 ^ 21857);
                        class165.field3175.method769(var4, 126);
                        class165.field3175.method773(-71, var3);
                        class165.field3175.method762(var2, true);
                        class3.field21 = 0;
                        class75.field1485 = class103.method639(var3, true);
                        class214.field4160 = var2;
                    }
                    if (var5 == 1007) {
                        class165 var47 = class103.method639(var3, true);
                        if (var47 != null && ~var47.field3102[var2] <= -100001) {
                            class166.method1074(class208.field4049, 0, class173.method1158(-3, new class173[] { class93.method588(var47.field3102[var2], true), class121.field2232, class195.method1298(1639, var4).field399 }), -119);
                        } else {
                            ++class77.field1499;
                            class165.field3175.method1023(124, -21822);
                            class165.field3175.method769(var4, 126);
                        }
                        class3.field21 = 0;
                        class75.field1485 = class103.method639(var3, true);
                        class214.field4160 = var2;
                    }
                    if (~var5 == -24) {
                        ++class197.field3843;
                        class165.field3175.method1023(6, -21822);
                        class165.field3175.method769(var2, 126);
                        class165.field3175.method778(var4, (byte) 74);
                        class165.field3175.method773(-86, var3);
                        class3.field21 = 0;
                        class75.field1485 = class103.method639(var3, true);
                        class214.field4160 = var2;
                    }
                    if (~var5 == -32) {
                        class165.field3175.method1023(123, arg0 ^ 21857);
                        ++class166.field3196;
                        class165.field3175.method736(var4, 123);
                        class165.field3175.method762(class98.field1793, true);
                        class165.field3175.method769(class21.field468, arg0 + 219);
                        class165.field3175.method762(var2, true);
                        class165.field3175.method775(arg0 ^ -732495245, class144.field2692);
                        class165.field3175.method773(78, var3);
                        class3.field21 = 0;
                        class75.field1485 = class103.method639(var3, true);
                        class214.field4160 = var2;
                    }
                    if (~var5 == -39) {
                        ++class152.field2877;
                        boolean var48 = class30.method233(0, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                        if (!var48) {
                            class30.method233(1, var3, class175.field3447.field2814[0], var2, false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                        }
                        class20.field447 = class41.field849;
                        class31.field650 = class23.field493;
                        class161.field2996 = 0;
                        class155.field2925 = 2;
                        class165.field3175.method1023(8, arg0 + -21729);
                        class165.field3175.method769(class43.field874 + var3, 126);
                        class165.field3175.method778(class108.field2024 + var2, (byte) 74);
                        class165.field3175.method778(var4, (byte) 74);
                    }
                    if (~var5 == -29 && class219.method1426(93, var6, var2, var3)) {
                        ++class29.field600;
                        class165.field3175.method1023(168, -21822);
                        class165.field3175.method769(var3 - -class43.field874, 126);
                        class165.field3175.method736(class21.field468, -99);
                        class165.field3175.method736(Integer.MAX_VALUE & (int) (var6 >>> 32), -86);
                        class165.field3175.method762(class98.field1793, true);
                        class165.field3175.method778(var2 - -class108.field2024, (byte) 74);
                        class165.field3175.method754((byte) 114, class144.field2692);
                    }
                    if (var5 == 51) {
                        ++class195.field3803;
                        class165.field3175.method1023(95, arg0 ^ 21857);
                        class165.field3175.method736(var4, -108);
                        class165.field3175.method762(var2, true);
                        class165.field3175.method754((byte) -122, var3);
                        class3.field21 = 0;
                        class75.field1485 = class103.method639(var3, true);
                        class214.field4160 = var2;
                    }
                    if (class9.field166 != 0) {
                        class9.field166 = 0;
                        class209.method1379(1, class103.method639(class144.field2692, true));
                    }
                    if (class182.field3582) {
                        class173.method1138(-127);
                    }
                    if (class75.field1485 != null && ~class3.field21 == -1) {
                        class209.method1379(1, class75.field1485);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field3018;
        int var3 = -101 % ((-65 - arg1) / 60);
        int[] var4 = super.field718.method514(arg0, 122);
        if (super.field718.field1615) {
            int var5 = class105.field1937[arg0];
            if (~this.field3010 == -1) {
                short var6 = 0;
                for (int var7 = 0; ~this.field3015 < ~var7; ++var7) {
                    if (this.field3006[var7] <= var5 && var5 < this.field3006[var7 + 1]) {
                        if (this.field3014[var7] > var5) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class85.method554(var4, 0, class117.field2173, var6);
            } else {
                for (int var8 = 0; class117.field2173 > var8; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class138.field2585[var8];
                    int var12 = this.field3010;
                    if (~var12 != -2) {
                        if (~var12 != -3) {
                            if (~var12 == -4) {
                                var9 = 2048 - -(-var5 + var11 >> 1);
                            }
                        } else {
                            var9 = 2048 - -(var11 - -var5 - 4096 >> 1);
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; this.field3015 > var13; ++var13) {
                        if (var9 >= this.field3006[var13] && ~this.field3006[var13 + 1] < ~var9) {
                            if (this.field3014[var13] > var9) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var8] = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V")
    public static void method1052(int arg0) {
        field3019 = null;
        field3023 = null;
        field3009 = null;
        if (arg0 == 103) {
            field3026 = null;
            field3013 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3010 = arg2.method751((byte) -104);
                }
            } else {
                this.field3011 = arg2.method755((byte) -76);
            }
        } else {
            this.field3015 = arg2.method751((byte) -25);
        }
        if (arg1 > -99) {
            this.field3014 = null;
        }
        ++field3016;
    }

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V")
    private final void method1053(int arg0) {
        this.field3006 = new int[this.field3015 + 1];
        this.field3014 = new int[this.field3015 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field3015;
        ++field3012;
        int var4 = 34 % ((41 - arg0) / 32);
        int var5 = this.field3011 * var3 >> 12;
        for (int var6 = 0; this.field3015 > var6; ++var6) {
            this.field3006[var6] = var2;
            this.field3014[var6] = var2 + var5;
            var2 += var3;
        }
        this.field3006[this.field3015] = 4096;
        this.field3014[this.field3015] = 4096 - -this.field3014[0];
    }
}

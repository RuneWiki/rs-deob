import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class216 extends class231 {

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Z")
    public static boolean field3471 = false;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "Ljava/lang/String;")
    public String field3469;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Ljava/lang/String;")
    public String field3472;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "Z")
    public static boolean field3473;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1512(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++class130.field2085;
        ++field3467;
        class85.method465(105);
        if (!arg0) {
            class261.method1775(-23483, 0);
            class219.method1549(true, 0, false, (byte) -91);
            if (class195.field3115 != 0) {
                for (int var6 = 1; var6 <= 5; ++var6) {
                    class261.method1775(-23483, var6);
                    class219.method1549(false, var6, false, (byte) -86);
                    class219.method1549(false, var6, true, (byte) -58);
                }
            } else {
                for (int var7 = 1; ~var7 >= -6; ++var7) {
                    class219.method1549(false, var7, false, (byte) -50);
                    class219.method1549(false, var7, true, (byte) -51);
                    class261.method1775(-23483, var7);
                }
            }
        } else {
            class219.method1549(false, 0, false, (byte) -92);
        }
        if (!arg0) {
            class256.method1754(0);
        }
        class91.method496(false);
        if (~class283.field4513 != -2) {
            if (~class283.field4513 == -6) {
                class56.method317(arg2, 10);
            }
        } else {
            int var8 = (int) class238.field3933;
            if (~var8 > ~(class171.field2706 / 256)) {
                var8 = class171.field2706 / 256;
            }
            if (class272.field4341[4] && class9.field109[4] + 128 > var8) {
                var8 = class9.field109[4] + 128;
            }
            int var9 = (int) class226.field3639 - -class91.field1136 & 2047;
            class196.method1378(var8, class166.method1148(class244.field4011, class286.field4571.field3818, class286.field4571.field3820, (byte) -88) - 50, class200.field3172, var9, arg2, var8 * 3 + 600, class83.field1031, arg5 ^ 10041);
        }
        int var10 = class74.field932;
        int var11 = class252.field4114;
        int var12 = class242.field3986;
        int var13 = class36.field465;
        int var14 = class23.field311;
        for (int var15 = 0; ~var15 > -6; ++var15) {
            if (class272.field4341[var15]) {
                int var22 = (int) (Math.random() * (double) (class59.field762[var15] * 2 + 1) - (double) class59.field762[var15] + Math.sin((double) class28.field402[var15] / 100.0D * (double) class60.field765[var15]) * (double) class9.field109[var15]);
                if (~var15 == -4) {
                    class23.field311 = class23.field311 + var22 & 2047;
                }
                if (~var15 == -5) {
                    class242.field3986 += var22;
                    if (class242.field3986 < 128) {
                        class242.field3986 = 128;
                    }
                    if (class242.field3986 > 383) {
                        class242.field3986 = 383;
                    }
                }
                if (~var15 == -3) {
                    class36.field465 += var22;
                }
                if (var15 == 1) {
                    class252.field4114 += var22;
                }
                if (~var15 == -1) {
                    class74.field932 += var22;
                }
            }
        }
        class93.method519(46);
        if (arg5 == 9847) {
            class217.method1520(arg1, arg3, arg1 + arg4, arg2 + arg3);
            class174.method1194();
            if (class242.field3989 < 0) {
                class217.method1526(arg1, arg3, arg4, arg2, 0);
            } else {
                class257 var16 = class17.method89(class117.field1658, (byte) 56, class242.field3989, class141.field2243, class281.field4454);
                var16.method1760(class157.field2526, arg1, arg3, arg4, arg2, class242.field3986, class23.field311, 0);
            }
            if (!class262.field4250 && ~arg1 >= ~class98.field1297 && ~class98.field1297 > ~(arg1 - -arg4) && ~arg3 >= ~class273.field4369 && class273.field4369 < arg2 + arg3) {
                class222.field3577 = 0;
                int var17 = class148.field2326;
                class175.field2783 = true;
                int var18 = class239.field3942;
                int var19 = class59.field758;
                int var20 = class51.field665;
                class56.field716 = (var20 - var19) * (-arg3 + class273.field4369) / arg2 + var19;
                class210.field3355 = (-arg1 + class98.field1297) * (-var17 + var18) / arg4 + var17;
            } else {
                class175.field2783 = false;
                class222.field3577 = 0;
            }
            class51.method294((byte) -127);
            byte var21 = ~class147.method1014(arg5 ^ 9786) != -3 ? 1 : (byte) class130.field2085;
            class56.method318(class74.field932, class252.field4114, class36.field465, class242.field3986, class23.field311, class18.field218, class297.field4696, class71.field904, class242.field3988, class128.field2057, class92.field1163, class244.field4011 + 1, var21, class286.field4571.field3818 >> 7, class286.field4571.field3820 >> 7);
            class51.method294((byte) -127);
            class55.method311();
            class54.method306(arg2, arg3, arg1, arg4, 256, arg5 + -9894, 256);
            class44.method244(256, 256, arg3, arg4, (byte) 37, arg1, arg2);
            ((class119) class174.field2756).method778(class32.field427, (byte) 58);
            class187.method1303(arg3, arg4, arg1, (byte) -119, arg2);
            class23.field311 = var14;
            class36.field465 = var13;
            class252.field4114 = var11;
            class74.field932 = var10;
            class242.field3986 = var12;
            if (class121.field1711 && ~class35.field454.method512(0) == -1) {
                class121.field1711 = false;
            }
            if (class121.field1711) {
                class217.method1526(arg1, arg3, arg4, arg2, 0);
                class210.method1478(false, class62.field813, (byte) 122);
            }
            if (!arg0 && !class121.field1711 && !class262.field4250 && ~class98.field1297 <= ~arg1 && class98.field1297 < arg1 + arg4 && class273.field4369 >= arg3 && ~(arg2 + arg3) < ~class273.field4369) {
                class130.method886(arg1, arg2, -433, class98.field1297, arg4, arg3, class273.field4369);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V")
    public static final void method1513(int arg0, boolean arg1) {
        class233 var2 = class114.method746(arg0, 1228126432, 1);
        var2.method1653(arg1);
        ++field3475;
        if (arg1) {
            field3470 = 2;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V")
    public static final void method1514(boolean arg0) {
        class39.field483 = new class110(32);
        ++field3474;
        if (!arg0) {
            field3470 = -33;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Loj;IIIIII)V")
    public static final void method1515(class144 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3468;
        boolean var7 = true;
        boolean var8 = false;
        long var9 = 0L;
        if (~arg5 != -1) {
            if (~arg5 == -2) {
                var9 = class19.method108(arg6, arg4, arg2);
            } else if (arg5 == 2) {
                var9 = class286.method1929(arg6, arg4, arg2);
            } else if (~arg5 == -4) {
                var9 = class291.method1960(arg6, arg4, arg2);
            }
        } else {
            var9 = class62.method363(arg6, arg4, arg2);
        }
        int var11 = Integer.MAX_VALUE & (int) (var9 >>> 32);
        boolean var12 = false;
        class228 var13 = class256.method1749(var11, 0);
        int var14 = (3281637 & (int) var9) >> 20;
        if (arg3 < -91) {
            if (var13.method1628((byte) -120)) {
                class215.method1506(arg2, arg6, false, arg4, var13);
            }
            int var15 = (516353 & (int) var9) >> 14;
            if (~var9 != -1L) {
                if (~arg5 == -1) {
                    class289.method1945(arg6, arg4, arg2);
                    if (var13.field3676 != 0) {
                        arg0.method1004(!var13.field3704, var13.field3653, arg2, -120, arg4, var15, var14);
                    }
                } else if (~arg5 != -2) {
                    if (~arg5 != -3) {
                        if (~arg5 == -4) {
                            class70.method394(arg6, arg4, arg2);
                            if (~var13.field3676 == -2) {
                                arg0.method997(arg2, arg4, 125);
                            }
                        }
                    } else {
                        class156.method1099(arg6, arg4, arg2);
                        if (var13.field3676 != 0 && ~(var13.field3655 + arg4) > -105 && ~(arg2 - -var13.field3655) > -105 && ~(var13.field3714 + arg4) > -105 && arg2 - -var13.field3714 < 104) {
                            arg0.method1001(var13.field3714, arg4, var14, (byte) -48, var13.field3655, !var13.field3704, var13.field3653, arg2);
                        }
                    }
                } else {
                    class192.method1328(arg6, arg4, arg2);
                }
                if (var13.field3641 != null) {
                    class228 var20 = var13.method1629(-121);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)Lpi;")
    public final class191 method1516(byte arg0) {
        ++field3465;
        return arg0 != 30 ? null : class106.field1420[super.field3843];
    }
}

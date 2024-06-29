import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field538 = -1;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lu;")
    public static class135 field540 = class87.method676((byte) -96, "mod_icons");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lu;")
    private static class135 field542 = class87.method676((byte) -76, "Loading)3)3)3");

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lu;")
    public static class135 field539 = field542;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lgf;")
    public static class48 field543;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Ljb;")
    public static class64 field546;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
    public static final void method174(int arg0, int arg1, byte arg2) {
        int[] var3 = new int[4];
        field541++;
        if (arg2 != 108) {
            return;
        }
        int[] var4 = new int[4];
        var4[0] = arg1;
        var3[0] = arg0;
        int var5 = 1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class119.field2878[var6] != arg1) {
                var4[var5] = class119.field2878[var6];
                var3[var5] = class41.field962[var6];
                var5++;
            }
        }
        class41.field962 = var3;
        class119.field2878 = var4;
        class113.method923(class99.field2406.length - 1, (byte) -126, 0, class99.field2406, class119.field2878, class41.field962);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)V")
    public static final void method175(boolean arg0, int arg1) {
        if (class116.field2789.field173 >> 7 == class86.field2062 && class116.field2789.field172 >> 7 == class128.field3093) {
            class86.field2062 = 0;
        }
        field536++;
        int var2 = class14.field329;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            class145 var4;
            int var5;
            if (arg0) {
                var4 = class116.field2789;
                var5 = 33538048;
            } else {
                var4 = class131.field3166[class108.field2600[var3]];
                var5 = class108.field2600[var3] << 14;
            }
            if (var4 != null && var4.method45((byte) 55)) {
                var4.field3508 = false;
                if ((class100.field2422 && class14.field329 > 50 || class14.field329 > 200) && !arg0 && var4.field232 == var4.field159) {
                    var4.field3508 = true;
                }
                int var6 = var4.field173 >> 7;
                int var7 = var4.field172 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field3515 == null || class126.field2998 < var4.field3522 || class126.field2998 >= var4.field3521) {
                        if ((var4.field173 & 0x7F) == 64 && (var4.field172 & 0x7F) == 64) {
                            if (class65.field1624[var6][var7] == class69.field1704) {
                                continue;
                            }
                            class65.field1624[var6][var7] = class69.field1704;
                        }
                        var4.field3509 = class20.method148(var4.field173, var4.field172, class136.field3301, -2);
                        class100.field2418.method1018(class136.field3301, var4.field173, var4.field172, var4.field3509, 60, var4, var4.field230, var5, var4.field156);
                    } else {
                        var4.field3508 = false;
                        var4.field3509 = class20.method148(var4.field173, var4.field172, class136.field3301, -2);
                        class100.field2418.method1008(class136.field3301, var4.field173, var4.field172, var4.field3509, 60, var4, var4.field230, var5, var4.field3534, var4.field3518, var4.field3537, var4.field3519);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method176(int arg0) {
        field539 = null;
        field546 = null;
        field542 = null;
        field543 = null;
        field540 = null;
        if (arg0 != 14935) {
            method174(95, 55, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    private static final void method177(int arg0) {
        class94.field2269.method966(arg0 - 66);
        field544++;
        class99.field2397.method29(0, arg0);
        class51.method395();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lve;I)V")
    public static final void method178(class146 arg0, int arg1) {
        int var2 = arg0.field3601;
        field548++;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class63.field1573 == 0) {
                if (var2 == 1) {
                    arg0.field3660 = 0;
                    arg0.field3568 = class139.field3383;
                    return;
                }
                if (var2 == 2) {
                    arg0.field3660 = 0;
                    arg0.field3568 = class151.field3732;
                    return;
                }
            }
            if (class63.field1573 == 1) {
                if (var2 == 1) {
                    arg0.field3568 = class68.field1662;
                    arg0.field3660 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg0.field3568 = class151.field3717;
                    arg0.field3660 = 0;
                    return;
                }
                if (var2 == 3) {
                    arg0.field3568 = class14.field325;
                    arg0.field3660 = 0;
                    return;
                }
            }
            int var3 = class79.field1885;
            if (class63.field1573 != 2) {
                var3 = 0;
            }
            if (var2 <= 700) {
                var2--;
            } else {
                var2 -= 601;
            }
            if (var2 >= var3) {
                arg0.field3568 = class113.field2742;
                arg0.field3660 = 0;
            } else {
                arg0.field3568 = class23.field563[var2];
                arg0.field3660 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class79.field1885;
            if (class63.field1573 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field3568 = class113.field2742;
                arg0.field3660 = 0;
            } else {
                if (class94.field2281[var2] == 0) {
                    arg0.field3568 = class107.method867(arg1 + 2, new class135[] { class115.field2750, class80.field1911 });
                } else if (class94.field2281[var2] < 5000) {
                    if (class94.field2281[var2] == class52.field1240) {
                        arg0.field3568 = class107.method867(2, new class135[] { class85.field2017, class148.field3676, class68.method547(arg1 - 1, class94.field2281[var2]) });
                    } else {
                        arg0.field3568 = class107.method867(2, new class135[] { class25.field620, class148.field3676, class68.method547(-1, class94.field2281[var2]) });
                    }
                } else if (class94.field2281[var2] == class52.field1240) {
                    arg0.field3568 = class107.method867(2, new class135[] { class85.field2017, class76.field1797, class68.method547(-1, class94.field2281[var2] - 5000) });
                } else {
                    arg0.field3568 = class107.method867(arg1 + 2, new class135[] { class25.field620, class76.field1797, class68.method547(-1, class94.field2281[var2] + -5000) });
                }
                arg0.field3660 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class79.field1885;
            if (class63.field1573 != 2) {
                var5 = 0;
            }
            arg0.field3619 = var5 * 15 + 20;
            if (arg0.field3661 >= arg0.field3619) {
                arg0.field3619 = arg0.field3661 + 1;
            }
        } else {
            if (arg1 != 0) {
                method178(null, -127);
            }
            if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class63.field1573 == 0) {
                    arg0.field3568 = class40.field925;
                    arg0.field3660 = 0;
                } else if (var2 == 1 && class63.field1573 == 0) {
                    arg0.field3660 = 0;
                    arg0.field3568 = class151.field3732;
                } else {
                    int var6 = class119.field2844;
                    if (class63.field1573 == 0) {
                        var6 = 0;
                    }
                    if (var2 >= var6) {
                        arg0.field3568 = class113.field2742;
                        arg0.field3660 = 0;
                    } else {
                        arg0.field3568 = class131.method1054(false, class14.field340[var2]).method1088((byte) 56);
                        arg0.field3660 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg0.field3619 = class119.field2844 * 15 + 20;
                if (arg0.field3619 <= arg0.field3661) {
                    arg0.field3619 = arg0.field3661 + 1;
                }
            } else if (var2 == 324) {
                if (class151.field3731 == -1) {
                    class151.field3731 = arg0.field3658;
                    class117.field2818 = arg0.field3659;
                }
                if (class128.field3089.field594) {
                    arg0.field3658 = class151.field3731;
                } else {
                    arg0.field3658 = class117.field2818;
                }
            } else if (var2 == 325) {
                if (class151.field3731 == -1) {
                    class117.field2818 = arg0.field3659;
                    class151.field3731 = arg0.field3658;
                }
                if (class128.field3089.field594) {
                    arg0.field3658 = class117.field2818;
                } else {
                    arg0.field3658 = class151.field3731;
                }
            } else if (var2 == 327) {
                arg0.field3654 = 150;
                arg0.field3593 = (int) (Math.sin((double) class126.field2998 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3551 = 5;
                arg0.field3625 = 0;
            } else if (var2 == 328) {
                arg0.field3654 = 150;
                arg0.field3593 = (int) (Math.sin((double) class126.field2998 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3625 = 1;
                arg0.field3551 = 5;
            } else if (var2 == 600) {
                arg0.field3568 = class107.method867(2, new class135[] { class113.field2718, class5.field119 });
            } else if (var2 == 620) {
                if (class5.field128 < 1) {
                    arg0.field3568 = class113.field2742;
                } else if (class124.field2966) {
                    arg0.field3568 = class3.field76;
                    arg0.field3635 = 16711680;
                } else {
                    arg0.field3635 = 16777215;
                    arg0.field3568 = class109.field2641;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILud;ILpe;)V")
    public static final void method179(int arg0, class139 arg1, int arg2, class109 arg3) {
        field549++;
        class129 var4 = new class129();
        var4.field951 = arg0;
        var4.field3105 = arg3;
        var4.field3104 = arg2;
        var4.field3109 = arg1;
        class23 var5 = class23.field551;
        synchronized (class23.field551) {
            class23.field551.method185(var4, -27557);
        }
        class129.method1042(-127);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static final void method180(int arg0) {
        class37.method282(true);
        field537++;
        class126.field3004 = true;
        method177(0);
        if (class80.field1900 != -1) {
            boolean var2 = class101.method830(1, 0, 261, 190, 0, 0, class80.field1900);
            if (!var2) {
                class135.field3239 = true;
            }
        } else if (class21.field491[class49.field1167] != -1) {
            boolean var1 = class101.method830(1, 0, 261, 190, 0, 0, class21.field491[class49.field1167]);
            if (!var1) {
                class135.field3239 = true;
            }
        }
        if (class128.field3077 && class94.field2237 == 1) {
            if (class111.field2701 == 1) {
                class119.method947(0);
            } else {
                class60.method505(0);
            }
        }
        int var3 = -3 % ((10 - arg0) / 43);
        class83.method646(4);
    }
}

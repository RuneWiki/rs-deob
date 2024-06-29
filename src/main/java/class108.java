import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class108 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public int field1956 = -1;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lkb;")
    public static class93 field1957 = null;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lkb;")
    public static class93 field1961 = class76.method390(" ", 0);

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lkb;")
    public static class93 field1958 = class76.method390("Bitte starten Sie eine Mitgliedschaft", 0);

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field1970 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lgh;")
    public class64 field1962;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
    public static int[] field1955;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "[I")
    public int[] field1969;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "[Lkb;")
    public class93[] field1963;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
    public static final boolean method589(int arg0, int arg1) {
        field1968++;
        if (arg0 == 16) {
            return (arg1 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1961 = null;
        if (arg0 > -23) {
            field1970 = 65;
        }
        field1957 = null;
        field1955 = null;
        field1958 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILdd;I)V")
    public static final void method591(int arg0, int arg1, class34 arg2, int arg3) {
        field1966++;
        if ((arg3 & 0x20) != 0) {
            arg2.field2041 = class59.field942.method1035(255);
            if (arg2.field2041.method491((byte) -66, 0) == 126) {
                arg2.field2041 = arg2.field2041.method514(arg0 + 54, 1);
                class189.method1223(2, arg2.field550, arg0 ^ 0x8CB, arg2.field2041);
            } else if (class106.field1940 == arg2) {
                class189.method1223(2, arg2.field550, 2249, arg2.field2041);
            }
            arg2.field2068 = 150;
            arg2.field2026 = 0;
            arg2.field2051 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field2027 = class59.field942.method1086(arg0 + 88);
            arg2.field2035 = class59.field942.method1055((byte) -24);
            arg2.field2017 = class59.field942.method1068((byte) -126);
            arg2.field2023 = class59.field942.method1086(108);
            arg2.field2056 = class59.field942.method1034(81) + class21.field338;
            arg2.field2037 = class59.field942.method1034(arg0 ^ 0x46) + class21.field338;
            arg2.field2061 = class59.field942.method1055((byte) -24);
            arg2.field2050 = 0;
            arg2.field2060 = 1;
        }
        if ((arg3 & 0x10) != 0) {
            int var4 = class59.field942.method1034(110);
            int var5 = class59.field942.method1055((byte) -24);
            if (var4 == 65535) {
                var4 = -1;
            }
            class184.method1193(var5, 111, var4, arg2);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field2059 = class59.field942.method1071(arg0 ^ 0x6DC7);
            if (arg2.field2059 == 65535) {
                arg2.field2059 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var6 = class59.field942.method1086(115);
            int var7 = class59.field942.method1054(128);
            arg2.method605(var7, var6, class21.field338, true);
            arg2.field2057 = class21.field338 + 300;
            arg2.field2036 = class59.field942.method1086(107);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field2040 = class59.field942.method1034(arg0 ^ 0x41);
            int var8 = class59.field942.method1070(-2);
            arg2.field2052 = var8 >> 16;
            if (arg2.field2040 == 65535) {
                arg2.field2040 = -1;
            }
            arg2.field2058 = (var8 & 0xFFFF) + class21.field338;
            arg2.field2066 = 0;
            arg2.field2019 = 0;
            if (arg2.field2058 > class21.field338) {
                arg2.field2019 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var9 = class59.field942.method1037(16711680);
            int var10 = class59.field942.method1055((byte) -24);
            int var11 = class59.field942.method1054(128);
            int var12 = class59.field942.field3153;
            if (arg2.field550 != null && arg2.field560 != null) {
                long var13 = arg2.field550.method482(-89);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < class27.field424; var16++) {
                        if (class166.field3280[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && class174.field3446 == 0) {
                    class91.field1664.field3153 = 0;
                    class59.field942.method1073(0, true, class91.field1664.field3162, var11);
                    class91.field1664.field3153 = 0;
                    class93 var17 = class156.method1007(class148.method904(class91.field1664, 2).method498(false));
                    arg2.field2041 = var17.method513(53);
                    arg2.field2051 = var9 >> 8;
                    arg2.field2068 = 150;
                    arg2.field2026 = var9 & 0xFF;
                    if (var10 == 2 || var10 == 3) {
                        class189.method1223(1, class203.method1321(new class93[] { class178.field3537, arg2.field550 }, 120), 2249, var17);
                    } else if (var10 == 1) {
                        class189.method1223(1, class203.method1321(new class93[] { class169.field3363, arg2.field550 }, 127), arg0 ^ 0x8CB, var17);
                    } else {
                        class189.method1223(2, arg2.field550, 2249, var17);
                    }
                }
            }
            class59.field942.field3153 = var12 + var11;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field2053 = class59.field942.method1047(255);
            arg2.field2042 = class59.field942.method1034(115);
        }
        if ((arg3 & 0x8) != 0) {
            int var18 = class59.field942.method1055((byte) -24);
            byte[] var19 = new byte[var18];
            class158 var20 = new class158(var19);
            class59.field942.method1043(0, true, var19, var18);
            class131.field2485[arg1] = var20;
            arg2.method189((byte) -123, var20);
        }
        if ((arg3 & 0x400) != 0) {
            int var21 = class59.field942.method1068((byte) -56);
            int var22 = class59.field942.method1054(128);
            arg2.method605(var22, var21, class21.field338, true);
        }
        if (arg0 != 2) {
            field1957 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILkf;)V")
    public static final void method592(int arg0, class97 arg1) {
        field1964++;
        if (class157.field3105) {
            class104.method578(arg1, 0);
            return;
        }
        int var2 = 85 % ((73 - arg0) / 49);
        if (class144.field2798 == 1 && class88.field1592 >= 715 && class57.field928 >= 453) {
            class169.field3360 = !class169.field3360;
            if (class169.field3360) {
                class4.method22(true);
            } else {
                class46.method241(class148.field2863, (byte) -127, class172.field3419, 255, class63.field1000, false);
            }
        }
        if (class28.field455 == 5) {
            return;
        }
        class40.field671++;
        if (class28.field455 != 10) {
            return;
        }
        if (class57.field936 != 2 && class139.field2693 == 0) {
            if (class144.field2798 == 1) {
                byte var3 = 5;
                short var4 = 463;
                byte var5 = 100;
                byte var6 = 35;
                if (var3 <= class88.field1592 && var3 + var5 >= class88.field1592 && var4 <= class57.field928 && class57.field928 <= var4 + var6) {
                    class82.method422(0);
                    return;
                }
            }
            if (class61.field967 != null) {
                class82.method422(0);
            }
        }
        int var7 = class88.field1592;
        int var8 = class57.field928;
        int var9 = class144.field2798;
        if (class139.field2694 == 0) {
            short var10 = 302;
            boolean var11 = false;
            short var12 = 291;
            if (var9 == 1 && var10 - 75 <= var7 && var7 <= var10 + 75 && var12 - 20 <= var8 && var12 + 20 >= var8) {
                client.field498 = 0;
                class139.field2694 = 3;
            }
            if (class131.field2466 != 0) {
                while (class110.method597((byte) 122)) {
                    if (class2.field43 == 84) {
                        var11 = true;
                        break;
                    }
                }
            }
            short var13 = 462;
            if (var11 || var9 == 1 && var7 >= var13 - 75 && var7 <= var13 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                class148.field2849 = class176.field3477;
                class139.field2694 = 2;
                class148.field2856 = class176.field3463;
                client.field498 = 0;
                class148.field2845 = class192.field3741;
            }
        } else if (class139.field2694 == 2) {
            short var16 = 321;
            short var17 = 302;
            short var18 = 231;
            int var22 = var18 + 30;
            if (var9 == 1 && var8 >= var22 - 15 && var8 < var22) {
                client.field498 = 0;
            }
            var22 += 15;
            if (var9 == 1 && var8 >= var22 - 15 && var8 < var22) {
                client.field498 = 1;
            }
            var22 += 15;
            if (var9 == 1 && var17 - 75 <= var7 && var7 <= var17 + 75 && var8 >= var16 - 20 && var16 + 20 >= var8) {
                class148.field2862 = class148.field2862.method506(false).method505((byte) -99);
                if (class148.field2862.method510(22) == 0) {
                    class93.method521(class176.field3481, class176.field3503, class195.field3823, -9593);
                    return;
                }
                if (class148.field2850.method510(125) == 0) {
                    class93.method521(class176.field3486, class176.field3488, class69.field1285, -9593);
                    return;
                }
                class93.method521(class176.field3483, class176.field3495, class8.field130, -9593);
                class205.method1336(20, 20);
                return;
            }
            short var19 = 462;
            if (var9 == 1 && var7 >= var19 - 75 && var19 + 75 >= var7 && var8 >= var16 - 20 && var8 <= var16 + 20) {
                class148.field2850 = class148.field2863;
                class148.field2862 = class148.field2863;
                class139.field2694 = 0;
            }
            while (true) {
                boolean var20;
                label229: do {
                    while (class110.method597((byte) 71)) {
                        var20 = false;
                        for (int var21 = 0; var21 < class37.field627.method510(41); var21++) {
                            if (class89.field1653 == class37.field627.method491((byte) -104, var21)) {
                                var20 = true;
                                break;
                            }
                        }
                        if (client.field498 != 0) {
                            continue label229;
                        }
                        if (class2.field43 == 85 && class148.field2862.method510(103) > 0) {
                            class148.field2862 = class148.field2862.method497((byte) -113, class148.field2862.method510(108) - 1, 0);
                        }
                        if (class2.field43 == 84 || class2.field43 == 80) {
                            client.field498 = 1;
                        }
                        if (var20 && class148.field2862.method510(83) < 12) {
                            class148.field2862 = class148.field2862.method492(class89.field1653, false);
                        }
                    }
                    return;
                } while (client.field498 != 1);
                if (class2.field43 == 85 && class148.field2850.method510(113) > 0) {
                    class148.field2850 = class148.field2850.method497((byte) -126, class148.field2850.method510(124) - 1, 0);
                }
                if (class2.field43 == 84 || class2.field43 == 80) {
                    client.field498 = 0;
                }
                if (class131.field2466 != 0 && class2.field43 == 84) {
                    class148.field2862 = class148.field2862.method506(false).method505((byte) -89);
                    if (class148.field2862.method510(70) == 0) {
                        class93.method521(class176.field3481, class176.field3503, class195.field3823, -9593);
                        return;
                    }
                    if (class148.field2850.method510(38) == 0) {
                        class93.method521(class176.field3486, class176.field3488, class69.field1285, -9593);
                        return;
                    }
                    class93.method521(class176.field3483, class176.field3495, class8.field130, -9593);
                    class205.method1336(20, 20);
                    return;
                }
                if (var20 && class148.field2850.method510(39) < 20) {
                    class148.field2850 = class148.field2850.method492(class89.field1653, false);
                }
            }
        } else if (class139.field2694 == 3) {
            short var14 = 382;
            short var15 = 321;
            if (var9 == 1 && var7 >= var14 - 75 && var14 + 75 >= var7 && var8 >= var15 - 20 && var8 <= var15 + 20) {
                class139.field2694 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Lkb;")
    public static final class93 method593(int arg0, int arg1) {
        field1960++;
        class93 var2 = new class93();
        if (arg0 != -2) {
            field1965 = -92;
        }
        var2.field1726 = new byte[arg1];
        var2.field1701 = 0;
        return var2;
    }
}

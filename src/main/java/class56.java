import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lu;")
    private class134 field1465 = new class134();

    @OriginalMember(owner = "client!i", name = "x", descriptor = "Lua;")
    private class135 field1472 = new class135();

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "Lka;")
    private class70 field1474;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lwd;")
    public static class150 field1459 = class2.method9(true, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lwd;")
    public static class150 field1463 = class2.method9(true, "@lre@");

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lwd;")
    private static class150 field1462 = class2.method9(true, "Please contact customer support)3");

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lwd;")
    public static class150 field1457 = class2.method9(true, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lwd;")
    public static class150 field1451 = field1462;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lwd;")
    public static class150 field1456 = class2.method9(true, "(Y ");

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lwd;")
    public static class150 field1469 = class2.method9(true, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lwd;")
    public static class150 field1453 = class2.method9(true, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lkc;")
    public static class72 field1450;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[Lqd;")
    public static class114[] field1452;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (arg0 != 0) {
            field1463 = null;
        }
        while (true) {
            class134 var2 = this.field1472.method1002(-1);
            if (var2 == null) {
                this.field1473 = this.field1471;
                field1455++;
                return;
            }
            var2.method678((byte) -26);
            var2.method996(arg0 ^ 0xFFFFFFFD);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
    public static final boolean method432(int arg0, int arg1) {
        field1467++;
        if (arg0 <= 15) {
            field1450 = null;
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lu;JB)V")
    public final void method433(class134 arg0, long arg1, byte arg2) {
        if (this.field1473 == 0) {
            class134 var5 = this.field1472.method1002(-1);
            var5.method678((byte) -26);
            var5.method996(arg2 ^ 0x7B);
            if (this.field1465 == var5) {
                class134 var6 = this.field1472.method1002(-1);
                var6.method678((byte) -26);
                var6.method996(-3);
            }
        } else {
            this.field1473--;
        }
        field1464++;
        this.field1474.method541(arg0, arg1, false);
        this.field1472.method1005(91, arg0);
        if (arg2 != -122) {
            method434(-60, null);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILva;)V")
    public static final void method434(int arg0, class141 arg1) {
        int var2 = arg1.field3338;
        field1461++;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class106.field2387 == 0) {
                if (var2 == 1) {
                    arg1.field3400 = 0;
                    arg1.field3366 = class150.field3669;
                    return;
                }
                if (var2 == 2) {
                    arg1.field3400 = 0;
                    arg1.field3366 = class144.field3470;
                    return;
                }
            }
            if (class106.field2387 == 1) {
                if (var2 == 1) {
                    arg1.field3400 = 0;
                    arg1.field3366 = class20.field520;
                    return;
                }
                if (var2 == 2) {
                    arg1.field3400 = 0;
                    arg1.field3366 = class144.field3478;
                    return;
                }
                if (var2 == 3) {
                    arg1.field3400 = 0;
                    arg1.field3366 = class5.field104;
                    return;
                }
            }
            if (var2 <= 700) {
                var2--;
            } else {
                var2 -= 601;
            }
            int var3 = class50.field1347;
            if (class106.field2387 != 2) {
                var3 = 0;
            }
            if (var3 <= var2) {
                arg1.field3366 = class43.field1167;
                arg1.field3400 = 0;
            } else {
                arg1.field3366 = class146.field3537[var2];
                arg1.field3400 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class50.field1347;
            if (class106.field2387 != 2) {
                var4 = 0;
            }
            if (var4 <= var2) {
                arg1.field3366 = class43.field1167;
                arg1.field3400 = 0;
            } else {
                if (class30.field893[var2] == 0) {
                    arg1.field3366 = class111.method786((byte) -120, new class150[] { class133.field3139, class109.field2517 });
                } else if (class30.field893[var2] >= 5000) {
                    if (class30.field893[var2] == class128.field3028) {
                        arg1.field3366 = class111.method786((byte) -108, new class150[] { class99.field2280, class138.field3225, class29.method239(1000, class30.field893[var2] - 5000) });
                    } else {
                        arg1.field3366 = class111.method786((byte) -111, new class150[] { class138.field3244, class138.field3225, class29.method239(1000, class30.field893[var2] - 5000) });
                    }
                } else if (class30.field893[var2] == class128.field3028) {
                    arg1.field3366 = class111.method786((byte) -120, new class150[] { class99.field2280, class17.field460, class29.method239(1000, class30.field893[var2]) });
                } else {
                    arg1.field3366 = class111.method786((byte) 72, new class150[] { class138.field3244, class17.field460, class29.method239(1000, class30.field893[var2]) });
                }
                arg1.field3400 = 1;
            }
        } else if (arg0 == -3) {
            if (var2 == 203) {
                int var5 = class50.field1347;
                if (class106.field2387 != 2) {
                    var5 = 0;
                }
                arg1.field3382 = var5 * 15 + 20;
                if (arg1.field3326 >= arg1.field3382) {
                    arg1.field3382 = arg1.field3326 + 1;
                }
            } else if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class106.field2387 == 0) {
                    arg1.field3400 = 0;
                    arg1.field3366 = class18.field479;
                } else if (var2 == 1 && class106.field2387 == 0) {
                    arg1.field3400 = 0;
                    arg1.field3366 = class144.field3470;
                } else {
                    int var6 = class74.field1858;
                    if (class106.field2387 == 0) {
                        var6 = 0;
                    }
                    if (var2 >= var6) {
                        arg1.field3366 = class43.field1167;
                        arg1.field3400 = 0;
                    } else {
                        arg1.field3366 = class124.method940(class74.field1859[var2], 12391).method1175((byte) 71);
                        arg1.field3400 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg1.field3382 = class74.field1858 * 15 + 20;
                if (arg1.field3326 >= arg1.field3382) {
                    arg1.field3382 = arg1.field3326 + 1;
                }
            } else if (var2 == 324) {
                if (class14.field375 == -1) {
                    class14.field375 = arg1.field3342;
                    class138.field3243 = arg1.field3398;
                }
                if (class35.field975.field3648) {
                    arg1.field3342 = class14.field375;
                } else {
                    arg1.field3342 = class138.field3243;
                }
            } else if (var2 == 325) {
                if (class14.field375 == -1) {
                    class14.field375 = arg1.field3342;
                    class138.field3243 = arg1.field3398;
                }
                if (class35.field975.field3648) {
                    arg1.field3342 = class138.field3243;
                } else {
                    arg1.field3342 = class14.field375;
                }
            } else if (var2 == 327) {
                arg1.field3375 = 150;
                arg1.field3404 = (int) (Math.sin((double) class11.field280 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3319 = 0;
                arg1.field3318 = 5;
            } else if (var2 == 328) {
                arg1.field3375 = 150;
                arg1.field3404 = (int) (Math.sin((double) class11.field280 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3318 = 5;
                arg1.field3319 = 1;
            } else if (var2 == 600) {
                arg1.field3366 = class111.method786((byte) -124, new class150[] { class43.field1191, class126.field2914 });
            } else if (var2 == 620) {
                if (class66.field1689 < 1) {
                    arg1.field3366 = class43.field1167;
                } else if (class20.field504) {
                    arg1.field3412 = 16711680;
                    arg1.field3366 = class128.field3035;
                } else {
                    arg1.field3366 = class136.field3197;
                    arg1.field3412 = 16777215;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public static final void method435(int arg0, int arg1, int arg2, int arg3) {
        field1449++;
        class141 var4 = class70.method535(arg0, -64, arg3);
        if (var4 != null && var4.field3373 != null) {
            class43.method331(var4.field3373, arg1 - 126, null, 0, 0, 0, var4);
        }
        class90.field2095 = true;
        class47.field1260 = arg3;
        field1466 = arg2;
        class88.field2059 = arg0;
        if (arg1 != 1) {
            method436((byte) -64);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method436(byte arg0) {
        class134.field3157.method431(0);
        if (arg0 < 69) {
            method432(-49, -64);
        }
        field1454++;
        class26.field804.method431(0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static void method437(boolean arg0) {
        field1453 = null;
        field1462 = null;
        field1459 = null;
        field1457 = null;
        field1451 = null;
        if (arg0) {
            return;
        }
        field1450 = null;
        field1452 = null;
        field1469 = null;
        field1463 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)V")
    public final void method438(int arg0, long arg1) {
        class134 var4 = (class134) this.field1474.method534((byte) -121, arg1);
        if (var4 != null) {
            var4.method678((byte) -26);
            var4.method996(arg0 ^ 0xFFFFFED1);
            this.field1473++;
        }
        field1468++;
        if (arg0 != 300) {
            this.method431(-101);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lva;I)Z")
    public static final boolean method439(class141 arg0, int arg1) {
        field1458++;
        int var2 = arg0.field3338;
        if (class106.field2387 == 2) {
            if (var2 == 201) {
                class43.field1180 = class66.field1675;
                class61.field1551 = true;
                class46.field1251 = 0;
                class43.field1188 = class43.field1167;
                class40.field1067 = true;
                class70.field1775 = 1;
            }
            if (var2 == 202) {
                class46.field1251 = 0;
                class43.field1180 = class70.field1750;
                class43.field1188 = class43.field1167;
                class40.field1067 = true;
                class70.field1775 = 2;
                class61.field1551 = true;
            }
        }
        int var3 = 105 % ((arg1 - 1) / 63);
        if (var2 == 205) {
            class63.field1617 = 250;
            return true;
        }
        if (var2 == 501) {
            class46.field1251 = 0;
            class43.field1180 = class30.field897;
            class40.field1067 = true;
            class43.field1188 = class43.field1167;
            class70.field1775 = 4;
            class61.field1551 = true;
        }
        if (var2 == 502) {
            class43.field1188 = class43.field1167;
            class43.field1180 = class24.field681;
            class46.field1251 = 0;
            class70.field1775 = 5;
            class40.field1067 = true;
            class61.field1551 = true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var4 = var2 & 0x1;
            int var5 = (var2 - 300) / 2;
            class35.field975.method1160(-16, ~var4 == -2, var5);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var6 = var2 & 0x1;
            int var7 = (var2 - 314) / 2;
            class35.field975.method1157(var6 == 1, var7, (byte) 64);
        }
        if (var2 == 324) {
            class35.field975.method1159(true, false);
        }
        if (var2 == 325) {
            class35.field975.method1159(true, true);
        }
        if (var2 == 326) {
            class143.field3451.method965(true, 96);
            class47.field1268++;
            class35.field975.method1169((byte) 26, class143.field3451);
            return true;
        }
        if (var2 == 620) {
            class20.field504 = !class20.field504;
        }
        if (var2 >= 601 && var2 <= 613) {
            class70.method540((byte) 126);
            if (class43.field1191.method1174((byte) -122) > 0) {
                class143.field3451.method965(true, 162);
                class143.field3451.method1129(class43.field1191.method1198(1), false);
                class121.field2782++;
                class143.field3451.method1126(31159, var2 - 601);
                class143.field3451.method1126(31159, class20.field504 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)Lu;")
    public final class134 method440(long arg0, int arg1) {
        field1470++;
        class134 var4 = (class134) this.field1474.method534((byte) -103, arg0);
        if (var4 != null) {
            this.field1472.method1005(86, var4);
        }
        if (arg1 != 26976) {
            this.method431(-1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
    public class56(int arg0) {
        this.field1473 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1471 = arg0;
        this.field1474 = new class70(var2);
    }
}

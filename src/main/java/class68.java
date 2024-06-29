import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class68 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1493 = 3;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lae;")
    private static class6 field1494 = class64.method474(114, " from your ignore list first");

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1506 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lae;")
    public static class6 field1492 = field1494;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lae;")
    public static class6 field1509 = class64.method474(109, "Titelbild geladen)3");

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lae;")
    public static class6 field1503 = class64.method474(115, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lae;")
    public static class6 field1498 = class64.method474(108, "welle2:");

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Lae;")
    public static class6 field1514 = class64.method474(111, ":0");

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "J")
    public long field1501;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lvb;")
    public static class129 field1499;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lvb;")
    public static class129 field1507;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Lbf;")
    public static class14 field1508;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lla;")
    public class68 field1497;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lla;")
    public class68 field1502;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method492(boolean arg0) {
        field1512++;
        class6 var1 = null;
        for (int var2 = 0; var2 < class85.field2058; var2++) {
            if (class57.field1247[var2].method51(22938, class111.field2661) != -1) {
                var1 = class57.field1247[var2].method56(-58, class57.field1247[var2].method51(22938, class111.field2661));
                break;
            }
        }
        if (var1 == null) {
            class4.method20(118);
            return;
        }
        int var3 = class121.field2935;
        if (var3 < 0) {
            var3 = 0;
        }
        int var4 = class65.field1425;
        int var5 = class69.field1533;
        int var6 = class20.field407;
        int var7 = 6116423;
        if (var6 > 190) {
            var6 = 190;
        }
        class74.method579(var3, var4, var6, var5, var7);
        class74.method579(var3 + 1, var4 + 1, var6 - 2, 16, 0);
        class74.method582(var3 + 1, var4 + 18, var6 - 2, var5 + -19, 0);
        class56.field1229.method94(var1, var3 + 3, var4 - -14, var7, arg0);
        int var8 = class57.field1244;
        int var9 = class117.field2771;
        if (class67.field1473 == 0) {
            var9 -= 4;
            var8 -= 4;
        }
        if (class67.field1473 == 1) {
            var8 -= 205;
            var9 -= 553;
        }
        if (class67.field1473 == 2) {
            var8 -= 357;
            var9 -= 17;
        }
        for (int var10 = 0; var10 < class85.field2058; var10++) {
            int var11 = var4 + (class85.field2058 - var10 - 1) * 15 + 31;
            int var12 = 16777215;
            class6 var13 = class57.field1247[var10];
            if (var13.method55(var1, 0)) {
                var13 = var13.method30(0, -1, var13.method41(-8521) - var1.method41(-8521));
                if (var13.method55(class104.field2460, 0)) {
                    var13 = var13.method30(0, -1, var13.method41(-8521) - class104.field2460.method41(-8521));
                }
            }
            if (var3 < var9 && var3 + var6 > var9 && var11 - 13 < var8 && var11 + 3 > var8) {
                var12 = 16776960;
            }
            class56.field1229.method94(var13, var3 + 3, var11, var12, true);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V", line = 120)
    public static final void method493(int arg0, int arg1) {
        field1511++;
        class80.method688((byte) 127);
        int var2 = class122.method1007(arg0, arg1 ^ 0xFFFFFFAD).field2801;
        if (var2 == 0) {
            return;
        }
        int var3 = class133.field3245[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class29.method251(0.9D);
                ((class108) class29.field691).method915(0.9D, false);
            }
            if (var3 == 2) {
                class29.method251(0.8D);
                ((class108) class29.field691).method915(0.8D, false);
            }
            if (var3 == 3) {
                class29.method251(0.7D);
                ((class108) class29.field691).method915(0.7D, false);
            }
            if (var3 == 4) {
                class29.method251(0.6D);
                ((class108) class29.field691).method915(0.6D, false);
            }
            class133.method1089(arg1 + 123);
            class32.field772 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class76.field1795 != var4) {
                if (class76.field1795 == 0 && class138.field3360 != -1) {
                    class70.method510(arg1 ^ 0x23, 0, 0, false, class41.field913, var4, class138.field3360);
                    class21.field519 = 0;
                } else if (var4 == 0) {
                    class70.method511((byte) 94);
                    class21.field519 = 0;
                } else {
                    class89.method751(var4, 64);
                }
                class76.field1795 = var4;
            }
        }
        if (var2 == 6) {
            class135.field3300 = var3;
        }
        if (arg1 != 1) {
            field1498 = null;
        }
        if (var2 == 5) {
            class82.field2018 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class14.field301 = 127;
            }
            if (var3 == 1) {
                class14.field301 = 96;
            }
            if (var3 == 2) {
                class14.field301 = 64;
            }
            if (var3 == 3) {
                class14.field301 = 32;
            }
            if (var3 == 4) {
                class14.field301 = 0;
            }
        }
        if (var2 == 9) {
            client.field474 = var3;
        }
        if (var2 == 8) {
            class5.field67 = var3;
            class20.field427 = true;
        }
        if (var2 != 4) {
            return;
        }
        if (var3 == 0) {
            class64.field1406 = 127;
        }
        if (var3 == 1) {
            class64.field1406 = 96;
        }
        if (var3 == 2) {
            class64.field1406 = 64;
        }
        if (var3 == 3) {
            class64.field1406 = 32;
        }
        if (var3 == 4) {
            class64.field1406 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V", line = 275)
    public static void method494(boolean arg0) {
        if (arg0) {
            method497(92, 95, (byte) 49);
        }
        field1509 = null;
        field1508 = null;
        field1499 = null;
        field1498 = null;
        field1514 = null;
        field1507 = null;
        field1503 = null;
        field1492 = null;
        field1494 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V", line = 293)
    public static final void method495(int arg0, boolean arg1) {
        field1515++;
        class126.method1024(-92, arg0);
        if (!arg1) {
            method493(-88, -30);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 304)
    public static final void method496(int arg0) {
        field1495++;
        if (class54.field1188 != 0 || class100.field2341 != null) {
            return;
        }
        int var1 = class89.field2140;
        if (class117.field2783 && class52.field1170 >= 516 && class116.field2728 >= 160 && class52.field1170 <= 765 && class116.field2728 <= 205) {
            var1 = 0;
        }
        if (class125.field3052) {
            if (var1 != 1) {
                int var6 = class57.field1244;
                int var7 = class117.field2771;
                if (class67.field1473 == 0) {
                    var6 -= 4;
                    var7 -= 4;
                }
                if (class67.field1473 == 1) {
                    var6 -= 205;
                    var7 -= 553;
                }
                if (class67.field1473 == 2) {
                    var7 -= 17;
                    var6 -= 357;
                }
                if (class121.field2935 - 10 > var7 || class20.field407 + class121.field2935 + 10 < var7 || var6 < class65.field1425 - 10 || class69.field1533 + class65.field1425 + 10 < var6) {
                    class125.field3052 = false;
                    if (class67.field1473 == 1) {
                        class139.field3380 = true;
                    }
                    if (class67.field1473 == 2) {
                        class20.field427 = true;
                    }
                }
            }
            if (var1 == 1) {
                int var8 = class65.field1425;
                int var9 = class121.field2935;
                int var10 = class20.field407;
                int var11 = class52.field1170;
                int var12 = class116.field2728;
                int var13 = -1;
                if (class67.field1473 == 0) {
                    var12 -= 4;
                    var11 -= 4;
                }
                if (class67.field1473 == 1) {
                    var11 -= 553;
                    var12 -= 205;
                }
                if (class67.field1473 == 2) {
                    var12 -= 357;
                    var11 -= 17;
                }
                for (int var14 = 0; var14 < class85.field2058; var14++) {
                    int var15 = (class85.field2058 - var14 - 1) * 15 + var8 + 31;
                    if (var11 > var9 && var11 < var9 + var10 && var15 - 13 < var12 && var15 + 3 > var12) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class38.method332(var13, 1);
                }
                if (class67.field1473 == 2) {
                    class20.field427 = true;
                }
                class125.field3052 = false;
                if (class67.field1473 == 1) {
                    class139.field3380 = true;
                }
            }
        } else {
            if (var1 == 1 && class85.field2058 > 0) {
                int var2 = class61.field1333[class85.field2058 - 1];
                if (var2 == 35 || var2 == 30 || var2 == 26 || var2 == 25 || var2 == 49 || var2 == 28 || var2 == 16 || var2 == 54 || var2 == 32 || var2 == 19 || var2 == 23 || var2 == 1004) {
                    int var3 = class16.field329[class85.field2058 - 1];
                    int var4 = class79.field1929[class85.field2058 - 1];
                    class121 var5 = class67.method490((byte) 111, var4);
                    if (var5.method979((byte) 114) || var5.method999(0)) {
                        class12.field248 = false;
                        class121.field2891 = 0;
                        class138.field3358 = var4;
                        class34.field810 = class116.field2728;
                        class54.field1188 = 2;
                        if (var4 >> 16 == class103.field2449) {
                            class54.field1188 = 1;
                        }
                        if (var4 >> 16 == class102.field2410) {
                            class54.field1188 = 3;
                        }
                        class87.field2085 = var3;
                        class32.field789 = class52.field1170;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class82.field2018 == 1 || class57.method427(class85.field2058 - 1, (byte) -128)) && class85.field2058 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class85.field2058 > 0) {
                class38.method332(class85.field2058 - 1, 1);
            }
            if (var1 == 2 && class85.field2058 > 0) {
                class64.method475(701);
            }
        }
        int var16 = 29 % ((36 - arg0) / 45);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)I", line = 494)
    public static final int method497(int arg0, int arg1, byte arg2) {
        field1504++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 / 128;
        if (arg2 >= -111) {
            method493(55, -58);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 529)
    public final void method498(int arg0) {
        field1500++;
        if (this.field1497 == null) {
            return;
        }
        this.field1497.field1502 = this.field1502;
        if (arg0 >= 96) {
            this.field1502.field1497 = this.field1497;
            this.field1497 = null;
            this.field1502 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z", line = 550)
    public final boolean method499(int arg0) {
        if (arg0 < 117) {
            method492(false);
        }
        field1496++;
        return this.field1497 != null;
    }
}

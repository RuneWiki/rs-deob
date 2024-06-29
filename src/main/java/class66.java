import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lsc;")
    public class128 field1623 = new class128();

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lid;")
    public static class60 field1620 = class11.method72("Bitte versuchen Sie es erneut)3", (byte) -74);

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljd;")
    public static class66 field1614 = new class66();

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1632 = 127;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lid;")
    private static class60 field1633 = class11.method72("and choose the (Wcreate account(W", (byte) 125);

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1636 = 0;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lid;")
    public static class60 field1630 = field1633;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Lid;")
    public static class60 field1629 = class11.method72("Lade Konfiguration )2 ", (byte) 108);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lsc;")
    private class128 field1628;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Le;")
    public static class29 field1634;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Lsc;")
    public final class128 method495(boolean arg0) {
        field1613++;
        class128 var2 = this.field1628;
        if (this.field1623 == var2) {
            this.field1628 = null;
            return null;
        }
        if (!arg0) {
            field1610 = -39;
        }
        this.field1628 = var2.field2918;
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lsc;")
    public final class128 method496(int arg0) {
        field1616++;
        if (arg0 != 10153) {
            return null;
        }
        class128 var2 = this.field1623.field2920;
        if (this.field1623 == var2) {
            this.field1628 = null;
            return null;
        } else {
            this.field1628 = var2.field2920;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lsc;BLsc;)V")
    public final void method497(class128 arg0, byte arg1, class128 arg2) {
        if (arg2.field2918 != null) {
            arg2.method1009((byte) 116);
        }
        arg2.field2920 = arg0;
        field1626++;
        arg2.field2918 = arg0.field2918;
        arg2.field2918.field2920 = arg2;
        arg2.field2920.field2918 = arg2;
        if (arg1 >= -26) {
            this.method497(null, (byte) 14, null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1624++;
        if (arg9 != -3) {
            method509(null, -18, null, false);
        }
        class12 var10 = null;
        for (class12 var11 = (class12) class53.field1340.method496(10153); var11 != null; var11 = (class12) class53.field1340.method500(-1)) {
            if (var11.field223 == arg0 && var11.field201 == arg4 && var11.field225 == arg2 && var11.field207 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class12();
            var10.field223 = arg0;
            var10.field225 = arg2;
            var10.field207 = arg7;
            var10.field201 = arg4;
            class35.method268(var10, 32767);
            class53.field1340.method508(var10, (byte) 117);
        }
        var10.field218 = arg6;
        var10.field222 = arg8;
        var10.field199 = arg3;
        var10.field203 = arg5;
        var10.field220 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method499(byte arg0) {
        if (arg0 == -103) {
            field1621++;
            class16.field404 = new class86(32);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Lsc;")
    public final class128 method500(int arg0) {
        field1625++;
        class128 var2 = this.field1628;
        if (this.field1623 == var2) {
            this.field1628 = null;
            return null;
        }
        this.field1628 = var2.field2920;
        if (arg0 != -1) {
            field1632 = -5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static final void method501(int arg0) {
        class32.field752.method920((byte) 14);
        if (arg0 == 0) {
            field1618++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)Lsc;")
    public final class128 method502(int arg0) {
        if (arg0 >= -20) {
            field1629 = null;
        }
        field1612++;
        class128 var2 = this.field1623.field2920;
        if (this.field1623 == var2) {
            return null;
        } else {
            var2.method1009((byte) 126);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static final void method503(int arg0) {
        if (class125.field2872 > 0) {
            class125.field2872--;
        }
        field1627++;
        if (class44.field1161 > 1) {
            class44.field1161--;
        }
        if (class116.field2738) {
            class116.field2738 = false;
            class98.method775(68);
            return;
        }
        for (int var1 = 0; var1 < 100 && class141.method1100(0); var1++) {
        }
        if (class48.field1265 != 30) {
            return;
        }
        class155.method1185(71, class22.field519, 0);
        Object var2 = class53.field1339.field1582;
        synchronized (class53.field1339.field1582) {
            if (!class19.field463) {
                class53.field1339.field1585 = 0;
            } else if (class60.field1466 != 0 || class53.field1339.field1585 >= 40) {
                class22.field519.method1214(216, 0);
                class22.field519.method818(false, 0);
                int var3 = class22.field519.field2501;
                class13.field237++;
                int var4 = 0;
                for (int var5 = 0; var5 < class53.field1339.field1585 && class22.field519.field2501 - var3 < 240; var5++) {
                    int var6 = class53.field1339.field1584[var5];
                    var4++;
                    int var7 = class53.field1339.field1586[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class53.field1339.field1584[var5] == -1 && class53.field1339.field1586[var5] == -1) {
                        var7 = -1;
                        var8 = 524287;
                        var6 = -1;
                    }
                    if (class93.field2307 != var7 || class86.field2157 != var6) {
                        int var9 = var7 - class93.field2307;
                        class93.field2307 = var7;
                        int var10 = var6 - class86.field2157;
                        class86.field2157 = var6;
                        if (class103.field2495 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class22.field519.method811(true, (class103.field2495 << 12) + var10 + (var9 << 6));
                            class103.field2495 = 0;
                        } else if (class103.field2495 < 8) {
                            class22.field519.method839((byte) 86, (class103.field2495 << 19) + var8 + 8388608);
                            class103.field2495 = 0;
                        } else {
                            class22.field519.method819((class103.field2495 << 19) + var8 - 1073741824, (byte) 122);
                            class103.field2495 = 0;
                        }
                    } else if (class103.field2495 < 2047) {
                        class103.field2495++;
                    }
                }
                class22.field519.method844(115, class22.field519.field2501 - var3);
                if (class53.field1339.field1585 <= var4) {
                    class53.field1339.field1585 = 0;
                } else {
                    class53.field1339.field1585 -= var4;
                    for (int var11 = 0; var11 < class53.field1339.field1585; var11++) {
                        class53.field1339.field1586[var11] = class53.field1339.field1586[var4 + var11];
                        class53.field1339.field1584[var11] = class53.field1339.field1584[var4 + var11];
                    }
                }
            }
        }
        if (class60.field1466 != 0) {
            class32.field748++;
            int var12 = class139.field3174;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 502) {
                var12 = 502;
            }
            long var13 = (class45.field1195 - class81.field2019) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var15 = class140.field3185;
            byte var16 = 0;
            if (class60.field1466 == 2) {
                var16 = 1;
            }
            int var17 = (int) var13;
            class81.field2019 = class45.field1195;
            class22.field519.method1214(170, 0);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var18 = var12 * 765 + var15;
            class22.field519.method837((var16 << 19) + (var17 << 20) + var18, 8895);
        }
        if (class61.field1512[96] || class61.field1512[97] || class61.field1512[98] || class61.field1512[99]) {
            class124.field2867 = true;
        }
        if (class124.field2862 > 0) {
            class124.field2862--;
        }
        if (class124.field2867 && class124.field2862 <= 0) {
            class124.field2862 = 20;
            class124.field2867 = false;
            class22.field519.method1214(151, 0);
            class128.field2935++;
            class22.field519.method800(-10255, class47.field1248);
            class22.field519.method800(-10255, class157.field3590);
        }
        if (class158.field3621 && !class34.field792) {
            class34.field792 = true;
            class133.field3023++;
            class22.field519.method1214(26, 0);
            class22.field519.method818(false, 1);
        }
        if (!class158.field3621 && class34.field792) {
            class133.field3023++;
            class34.field792 = false;
            class22.field519.method1214(26, 0);
            class22.field519.method818(false, 0);
        }
        class148.method1122(0);
        if (class48.field1265 != 30) {
            return;
        }
        class98.method776(1);
        class103.method804((byte) 102);
        class42.field1119++;
        if (class42.field1119 > 750) {
            class98.method775(59);
            return;
        }
        class140.method1094(2047);
        class87.method722(-20);
        class11.method70(-118);
        if (class11.field196 != 0) {
            class10.field177 += 20;
            if (class10.field177 >= 400) {
                class11.field196 = 0;
            }
        }
        class75.field1802++;
        if (class157.field3611 != null) {
            class81.field2018++;
            if (class81.field2018 >= 15) {
                class12.method79(-30833, class157.field3611);
                class157.field3611 = null;
            }
        }
        if (class24.field594 != null) {
            class12.method79(-30833, class24.field594);
            if (class43.field1153 > class50.field1285 + 5 || class50.field1285 - 5 > class43.field1153 || class21.field494 > class28.field685 + 5 || class28.field685 - 5 > class21.field494) {
                class129.field2938 = true;
            }
            class75.field1797++;
            if (class28.field672 == 0) {
                if (class129.field2938 && class75.field1797 >= 5) {
                    if (class45.field1192 == class24.field594 && class60.field1475 != class157.field3597) {
                        class24.field576++;
                        class40 var19 = class24.field594;
                        byte var20 = 0;
                        if (class39.field932 == 1 && var19.field966 == 206) {
                            var20 = 1;
                        }
                        if (var19.field1053[class157.field3597] <= 0) {
                            var20 = 0;
                        }
                        if (class154.method1171(1030700721, class97.method770(var19, -1370253216))) {
                            int var21 = class60.field1475;
                            int var22 = class157.field3597;
                            var19.field1053[var22] = var19.field1053[var21];
                            var19.field993[var22] = var19.field993[var21];
                            var19.field1053[var21] = -1;
                            var19.field993[var21] = 0;
                        } else if (var20 == 1) {
                            int var23 = class60.field1475;
                            int var24 = class157.field3597;
                            while (var23 != var24) {
                                if (var23 > var24) {
                                    var19.method314(-101, var23, var23 - 1);
                                    var23--;
                                } else if (var23 < var24) {
                                    var19.method314(-72, var23, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var19.method314(-35, class60.field1475, class157.field3597);
                        }
                        class22.field519.method1214(143, 0);
                        class22.field519.method837(class24.field594.field1008, 8895);
                        class22.field519.method827(var20, true);
                        class22.field519.method800(-10255, class157.field3597);
                        class22.field519.method824(23656, class60.field1475);
                    }
                } else if ((class61.field1539 == 1 || class103.method842(1012065392, class80.field1956 - 1)) && class80.field1956 > 2) {
                    class12.method76(16215);
                } else if (class80.field1956 > 0) {
                    class139.method1085(true, class80.field1956 - 1);
                }
                class81.field2018 = 10;
                class24.field594 = null;
                class60.field1466 = 0;
            }
        }
        class133.field3037 = false;
        class10.field174 = null;
        class77.field1892 = 0;
        class40 var25 = class67.field1637;
        class40 var26 = class89.field2206;
        class67.field1637 = null;
        class89.field2206 = null;
        class131.field2983 = false;
        while (class22.method178((byte) 108) && class77.field1892 < 128) {
            class144.field3237[class77.field1892] = class136.field3095;
            class64.field1602[class77.field1892] = class152.field3414;
            class77.field1892++;
        }
        class107.method884(765, 0, 503, 0, 0, 89, class11.field187, 0);
        class78.field1921++;
        while (true) {
            class15 var27 = (class15) class50.field1278.method502(-61);
            if (var27 == null) {
                while (true) {
                    class15 var28 = (class15) class82.field2049.method502(-64);
                    if (var28 == null) {
                        while (true) {
                            class15 var29 = (class15) class139.field3164.method502(-52);
                            if (var29 == null) {
                                if (class154.field3474 != null) {
                                    class115.method919(117);
                                }
                                if (class76.field1820 != -1) {
                                    int var30 = class76.field1824;
                                    int var31 = class76.field1820;
                                    boolean var32 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 0, var31, true, 0, var30, -38, 0, 0);
                                    if (var32) {
                                        class121.field2792 = class139.field3174;
                                        class10.field177 = 0;
                                        class148.field3369 = class140.field3185;
                                        class11.field196 = 1;
                                    }
                                    class76.field1820 = -1;
                                }
                                class77.method627(1);
                                if (class67.field1637 != var25) {
                                    if (var25 != null) {
                                        class12.method79(-30833, var25);
                                    }
                                    if (class67.field1637 != null) {
                                        class12.method79(-30833, class67.field1637);
                                    }
                                }
                                if (class89.field2206 != var26 && class61.field1542 == class46.field1207) {
                                    if (var26 != null) {
                                        class12.method79(-30833, var26);
                                    }
                                    if (class89.field2206 != null) {
                                        class12.method79(-30833, class89.field2206);
                                    }
                                }
                                if (class89.field2206 == null) {
                                    if (class61.field1542 > 0) {
                                        class61.field1542--;
                                    }
                                } else if (class46.field1207 > class61.field1542) {
                                    class61.field1542++;
                                    if (class61.field1542 == class46.field1207) {
                                        class12.method79(-30833, class89.field2206);
                                    }
                                }
                                class87.method721((byte) -62);
                                if (class109.field2661) {
                                    class77.method623((byte) 109);
                                }
                                for (int var33 = 0; var33 < 5; var33++) {
                                    int var10002 = class129.field2940[var33]++;
                                }
                                int var34 = class137.method1067((byte) 94);
                                int var35 = class100.method785(-62);
                                if (var34 > 4500 && var35 > 4500) {
                                    class69.field1659++;
                                    class125.field2872 = 250;
                                    class10.method64(4000, 0);
                                    class22.field519.method1214(208, 0);
                                }
                                if (arg0 <= 6) {
                                    field1614 = null;
                                }
                                class25.field608++;
                                class136.field3086++;
                                if (class136.field3086 > 500) {
                                    class136.field3086 = 0;
                                    int var36 = (int) (Math.random() * 8.0D);
                                    if ((var36 & 0x2) == 2) {
                                        class141.field3224 += class5.field82;
                                    }
                                    if ((var36 & 0x4) == 4) {
                                        class28.field684 += class31.field723;
                                    }
                                    if ((var36 & 0x1) == 1) {
                                        class74.field1788 += class158.field3622;
                                    }
                                }
                                if (class28.field684 < -40) {
                                    class31.field723 = 1;
                                }
                                if (class74.field1788 < -50) {
                                    class158.field3622 = 2;
                                }
                                if (class25.field608 > 500) {
                                    class25.field608 = 0;
                                    int var37 = (int) (Math.random() * 8.0D);
                                    if ((var37 & 0x1) == 1) {
                                        class151.field3394 += class116.field2729;
                                    }
                                    if ((var37 & 0x2) == 2) {
                                        class145.field3271 += class100.field2425;
                                    }
                                }
                                if (class145.field3271 < -20) {
                                    class100.field2425 = 1;
                                }
                                if (class141.field3224 < -55) {
                                    class5.field82 = 2;
                                }
                                class16.field405++;
                                if (class145.field3271 > 10) {
                                    class100.field2425 = -1;
                                }
                                if (class28.field684 > 40) {
                                    class31.field723 = -1;
                                }
                                if (class141.field3224 > 55) {
                                    class5.field82 = -2;
                                }
                                if (class151.field3394 < -60) {
                                    class116.field2729 = 2;
                                }
                                if (class74.field1788 > 50) {
                                    class158.field3622 = -2;
                                }
                                if (class151.field3394 > 60) {
                                    class116.field2729 = -2;
                                }
                                if (class16.field405 > 50) {
                                    class8.field124++;
                                    class22.field519.method1214(240, 0);
                                }
                                try {
                                    if (class4.field73 == null || class22.field519.field2501 <= 0) {
                                        return;
                                    } else {
                                        class4.field73.method730(0, 0, class22.field519.field2498, class22.field519.field2501);
                                        class16.field405 = 0;
                                        class22.field519.field2501 = 0;
                                        return;
                                    }
                                } catch (IOException var38) {
                                    class98.method775(125);
                                    return;
                                }
                            }
                            class61.method467(false, var29);
                        }
                    }
                    class61.method467(false, var28);
                }
            }
            class61.method467(false, var27);
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Lsc;")
    public final class128 method504(int arg0) {
        if (arg0 != 4500) {
            method503(63);
        }
        field1609++;
        class128 var2 = this.field1623.field2918;
        if (this.field1623 == var2) {
            return null;
        } else {
            var2.method1009((byte) 104);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lsc;I)V")
    public final void method505(class128 arg0, int arg1) {
        field1631++;
        if (arg0.field2918 != null) {
            arg0.method1009((byte) 125);
        }
        arg0.field2918 = this.field1623;
        arg0.field2920 = this.field1623.field2920;
        arg0.field2918.field2920 = arg0;
        if (arg1 == 10) {
            arg0.field2920.field2918 = arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public final void method506(byte arg0) {
        if (arg0 != 4) {
            this.field1623 = null;
        }
        field1611++;
        while (true) {
            class128 var2 = this.field1623.field2920;
            if (this.field1623 == var2) {
                return;
            }
            var2.method1009((byte) 66);
        }
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public static void method507(int arg0) {
        field1633 = null;
        field1614 = null;
        field1630 = null;
        field1620 = null;
        field1629 = null;
        if (arg0 != -25064) {
            field1630 = null;
        }
        field1634 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lsc;B)V")
    public final void method508(class128 arg0, byte arg1) {
        if (arg0.field2918 != null) {
            arg0.method1009((byte) 107);
        }
        field1619++;
        arg0.field2918 = this.field1623.field2918;
        arg0.field2920 = this.field1623;
        arg0.field2918.field2920 = arg0;
        arg0.field2920.field2918 = arg0;
        if (arg1 < 86) {
            this.method497(null, (byte) 114, null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lic;ILpa;Z)V")
    public static final void method509(class59 arg0, int arg1, class105 arg2, boolean arg3) {
        field1622++;
        if (!arg3) {
            method499((byte) -16);
        }
        class98 var4 = new class98();
        var4.field2394 = arg2;
        var4.field2399 = 1;
        var4.field2407 = arg0;
        var4.field2929 = arg1;
        class66 var5 = class47.field1243;
        synchronized (class47.field1243) {
            class47.field1243.method508(var4, (byte) 101);
        }
        class157.method1210(false);
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Lsc;")
    public final class128 method510(int arg0) {
        class128 var2 = this.field1623.field2918;
        if (arg0 != 26325) {
            this.method508(null, (byte) -33);
        }
        field1617++;
        if (this.field1623 == var2) {
            this.field1628 = null;
            return null;
        } else {
            this.field1628 = var2.field2918;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class66() {
        this.field1623.field2918 = this.field1623;
        this.field1623.field2920 = this.field1623;
    }
}

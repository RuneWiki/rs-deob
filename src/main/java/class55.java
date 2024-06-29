import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 extends class11 {

    @OriginalMember(owner = "client!ja", name = "Lc", descriptor = "Z")
    public boolean field1420 = false;

    @OriginalMember(owner = "client!ja", name = "bd", descriptor = "I")
    public int field1436 = -1;

    @OriginalMember(owner = "client!ja", name = "Yc", descriptor = "I")
    public int field1433 = -1;

    @OriginalMember(owner = "client!ja", name = "kd", descriptor = "I")
    public int field1445 = 0;

    @OriginalMember(owner = "client!ja", name = "Nc", descriptor = "I")
    public int field1422 = 0;

    @OriginalMember(owner = "client!ja", name = "ld", descriptor = "I")
    public int field1446 = 0;

    @OriginalMember(owner = "client!ja", name = "ud", descriptor = "I")
    public int field1455 = 0;

    @OriginalMember(owner = "client!ja", name = "pd", descriptor = "I")
    public int field1450 = 0;

    @OriginalMember(owner = "client!ja", name = "Kc", descriptor = "Lv;")
    public static class122 field1419 = method425(-117, "Titelbild geladen)3");

    @OriginalMember(owner = "client!ja", name = "ed", descriptor = "Lv;")
    public static class122 field1439 = method425(-126, "blaugr\u001c1n:");

    @OriginalMember(owner = "client!ja", name = "Vc", descriptor = "Lv;")
    private static class122 field1430 = method425(-122, "Enter message to send to ");

    @OriginalMember(owner = "client!ja", name = "id", descriptor = "Lv;")
    public static class122 field1443 = method425(-116, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ja", name = "hd", descriptor = "Lv;")
    public static class122 field1442 = field1430;

    @OriginalMember(owner = "client!ja", name = "ad", descriptor = "I")
    public static int field1435 = -1;

    @OriginalMember(owner = "client!ja", name = "td", descriptor = "[[I")
    public static int[][] field1454 = new int[104][104];

    @OriginalMember(owner = "client!ja", name = "vd", descriptor = "Lv;")
    private static class122 field1456 = method425(-103, "Cancel");

    @OriginalMember(owner = "client!ja", name = "jd", descriptor = "Lv;")
    public static class122 field1444 = field1456;

    @OriginalMember(owner = "client!ja", name = "Ec", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ja", name = "Fc", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ja", name = "Gc", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ja", name = "Hc", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ja", name = "Ic", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ja", name = "Jc", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ja", name = "Mc", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!ja", name = "Oc", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!ja", name = "Pc", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ja", name = "Qc", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ja", name = "Rc", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ja", name = "Sc", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!ja", name = "Uc", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ja", name = "Wc", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!ja", name = "cd", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ja", name = "dd", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ja", name = "fd", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!ja", name = "gd", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ja", name = "md", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ja", name = "od", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!ja", name = "qd", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ja", name = "rd", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!ja", name = "Zc", descriptor = "J")
    public static long field1434;

    @OriginalMember(owner = "client!ja", name = "nd", descriptor = "Lv;")
    public class122 field1448;

    @OriginalMember(owner = "client!ja", name = "sd", descriptor = "Llb;")
    public class68 field1453;

    @OriginalMember(owner = "client!ja", name = "Xc", descriptor = "Lpb;")
    public class92 field1432;

    @OriginalMember(owner = "client!ja", name = "Tc", descriptor = "Z")
    public static boolean field1428;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "(I)V", line = 5)
    public static final void method420(int arg0) {
        ++field1413;
        try {
            Graphics var1 = class54.field1411.getGraphics();
            class54.field1397.method122(-126, var1, 550, 4);
        } catch (Exception var2) {
            class54.field1411.repaint();
        }
        if (arg0 > -25) {
            field1439 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(B)I", line = 29)
    public static final int method421(byte arg0) {
        int var1 = -79 / ((67 - arg0) / 58);
        ++field1441;
        return class70.field1830++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lrd;Lne;ZI)V", line = 71)
    public static final void method422(class106 arg0, class83 arg1, boolean arg2, int arg3) {
        ++field1447;
        byte[] var4 = null;
        class34 var5 = class54.field1409;
        synchronized (class54.field1409) {
            for (class95 var6 = (class95) class54.field1409.method311((byte) 74); var6 != null; var6 = (class95) class54.field1409.method302((byte) -66)) {
                if ((long) arg3 == var6.field644 && var6.field2445 == arg1 && var6.field2431 == 0) {
                    var4 = var6.field2441;
                    break;
                }
            }
        }
        if (!arg2) {
            method430((byte) 60);
        }
        if (var4 != null) {
            arg0.method820(arg3, 16711680, var4, true, arg1);
        } else {
            byte[] var7 = arg1.method673(arg3, (byte) 18);
            arg0.method820(arg3, 16711680, var7, true, arg1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZZ)V", line = 123)
    public static final void method423(boolean arg0, boolean arg1) {
        ++field1438;
        if (!arg1) {
            field1414 = 5;
        }
        if (class113.field2759 != null) {
            try {
                class64 var2 = new class64(4);
                var2.method523(255, !arg0 ? 3 : 2);
                var2.method511(-9943, 0);
                class113.field2759.method594((byte) 126, 0, var2.field1679, 4);
            } catch (IOException var4) {
                try {
                    class113.field2759.method586(96);
                } catch (Exception var3) {
                }
                ++class22.field588;
                class113.field2759 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)Llb;", line = 157)
    public final class68 method424(boolean arg0) {
        ++field1426;
        if (this.field1432 == null) {
            return null;
        } else {
            class89 var2 = ~super.field324 != 0 && ~super.field292 == -1 ? class51.method401(-30325, super.field324) : null;
            class89 var3 = super.field305 == -1 || this.field1420 || ~super.field305 == ~super.field297 && var2 != null ? null : class51.method401(-30325, super.field305);
            class68 var4 = this.field1432.method732(var3, -116, var2, super.field278, super.field301);
            if (var4 == null) {
                return null;
            } else {
                var4.method565();
                super.field300 = var4.field1548;
                if (!this.field1420 && super.field315 != -1 && super.field326 != -1) {
                    class68 var5 = class126.method999((byte) 88, super.field315).method868(super.field326, (byte) -63);
                    if (var5 != null) {
                        var5.method559(0, -super.field286, 0);
                        class68[] var6 = new class68[] { var4, var5 };
                        var4 = new class68(var6, 2, true);
                    }
                }
                if (!this.field1420 && this.field1453 != null) {
                    if (~class16.field396 <= ~this.field1422) {
                        this.field1453 = null;
                    }
                    if (~this.field1446 >= ~class16.field396 && ~class16.field396 > ~this.field1422) {
                        class68 var7 = this.field1453;
                        var7.method559(this.field1431 - super.field343, -this.field1425 + this.field1449, -super.field349 + this.field1423);
                        class68[] var8 = new class68[] { var4, var7 };
                        if (~super.field280 != -513) {
                            if (~super.field280 != -1025) {
                                if (super.field280 == 1536) {
                                    var7.method555();
                                }
                            } else {
                                var7.method555();
                                var7.method555();
                            }
                        } else {
                            var7.method555();
                            var7.method555();
                            var7.method555();
                        }
                        var4 = new class68(var8, 2, true);
                        if (~super.field280 == -513) {
                            var7.method555();
                        } else if (super.field280 == 1024) {
                            var7.method555();
                            var7.method555();
                        } else if (~super.field280 == -1537) {
                            var7.method555();
                            var7.method555();
                            var7.method555();
                        }
                        var7.method559(-this.field1431 + super.field343, -this.field1449 + this.field1425, -this.field1423 + super.field349);
                    }
                }
                var4.field1748 = true;
                return arg0 ? null : var4;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)Lv;", line = 257)
    public static final class122 method425(int arg0, String arg1) {
        ++field1437;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class122 var4 = new class122();
        if (arg0 >= -48) {
            return null;
        } else {
            var4.field2923 = new byte[var3];
            int var5 = 0;
            while (var3 > var5) {
                int var6 = var2[var5++] & 255;
                if (var6 <= 45 && var6 >= 40) {
                    if (~var5 <= ~var3) {
                        break;
                    }
                    int var7 = var2[var5++] & 255;
                    var4.field2923[var4.field2971++] = (byte) (var6 * 43 + var7 + -1720 + -48);
                } else {
                    var4.field2923[var4.field2971++] = (byte) var6;
                }
            }
            var4.method947(123);
            return var4.method953(false);
        }
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(I)Z", line = 299)
    public static final boolean method426(int arg0) {
        ++field1417;
        if (arg0 != 1) {
            method425(-11, (String) null);
        }
        return class66.field1697 != null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lfe;B)V", line = 310)
    public static final void method427(class36 arg0, byte arg1) {
        ++field1418;
        int var2 = arg0.field932;
        if (~var2 <= -2 && ~var2 >= -101 || var2 >= 701 && ~var2 >= -801) {
            if (~var2 == -2 && class40.field1012 == 0) {
                arg0.field937 = 0;
                arg0.field901 = class108.field2680;
            } else if (var2 == 1 && class40.field1012 == 1) {
                arg0.field901 = class115.field2816;
                arg0.field937 = 0;
            } else if (var2 == 2 && class40.field1012 != 2) {
                arg0.field937 = 0;
                arg0.field901 = class114.field2778;
            } else {
                if (var2 > 700) {
                    var2 -= 601;
                } else {
                    --var2;
                }
                int var3 = class30.field764;
                if (~class40.field1012 != -3) {
                    var3 = 0;
                }
                if (var3 <= var2) {
                    arg0.field901 = class51.field1287;
                    arg0.field937 = 0;
                } else {
                    arg0.field901 = class75.field2020[var2];
                    arg0.field937 = 1;
                }
            }
        } else if (~var2 <= -102 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (~var2 >= -801) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var4 = class30.field764;
            if (~class40.field1012 != -3) {
                var4 = 0;
            }
            if (~var4 >= ~var2) {
                arg0.field901 = class51.field1287;
                arg0.field937 = 0;
            } else {
                if (class69.field1824[var2] == 0) {
                    arg0.field901 = class59.method454(new class122[] { class74.field1999, class24.field653 }, 5176);
                } else if (class69.field1824[var2] >= 5000) {
                    if (class69.field1824[var2] != class106.field2637) {
                        arg0.field901 = class59.method454(new class122[] { class50.field1276, class119.field2887, class119.method914(class69.field1824[var2] + -5000, 10) }, 5176);
                    } else {
                        arg0.field901 = class59.method454(new class122[] { class75.field2010, class119.field2887, class119.method914(class69.field1824[var2] + -5000, 10) }, 5176);
                    }
                } else if (class69.field1824[var2] == class106.field2637) {
                    arg0.field901 = class59.method454(new class122[] { class75.field2010, class16.field410, class119.method914(class69.field1824[var2], 10) }, 5176);
                } else {
                    arg0.field901 = class59.method454(new class122[] { class50.field1276, class16.field410, class119.method914(class69.field1824[var2], 10) }, 5176);
                }
                arg0.field937 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class30.field764;
            if (class40.field1012 != 2) {
                var5 = 0;
            }
            arg0.field947 = var5 * 15 + 20;
            if (~arg0.field947 >= ~arg0.field955) {
                arg0.field947 = arg0.field955 - -1;
            }
        } else if (var2 >= 401 && ~var2 >= -501) {
            var2 -= 401;
            if (var2 == 0 && class40.field1012 == 0) {
                arg0.field937 = 0;
                arg0.field901 = class18.field430;
            } else if (var2 == 1 && ~class40.field1012 == -1) {
                arg0.field901 = class114.field2778;
                arg0.field937 = 0;
            } else {
                int var6 = class25.field683;
                if (class40.field1012 == 0) {
                    var6 = 0;
                }
                if (~var2 <= ~var6) {
                    arg0.field901 = class51.field1287;
                    arg0.field937 = 0;
                } else {
                    arg0.field901 = class24.method252(-29, class129.field3133[var2]).method939(15365);
                    arg0.field937 = 1;
                }
            }
        } else if (~var2 == -504) {
            arg0.field947 = class25.field683 * 15 + 20;
            if (arg0.field955 >= arg0.field947) {
                arg0.field947 = arg0.field955 + 1;
            }
        } else if (~var2 == -328) {
            arg0.field923 = 150;
            arg0.field893 = (int) (256.0D * Math.sin((double) class16.field396 / 40.0D)) & 2047;
            arg0.field959 = 0;
            arg0.field914 = 5;
        } else if (~var2 == -325) {
            if (class95.field2438 == -1) {
                class95.field2438 = arg0.field886;
                class84.field2189 = arg0.field880;
            }
            if (!class56.field1461.field2341) {
                arg0.field886 = class84.field2189;
            } else {
                arg0.field886 = class95.field2438;
            }
        } else if (var2 == 325) {
            if (class95.field2438 == -1) {
                class84.field2189 = arg0.field880;
                class95.field2438 = arg0.field886;
            }
            if (class56.field1461.field2341) {
                arg0.field886 = class84.field2189;
            } else {
                arg0.field886 = class95.field2438;
            }
        } else if (~var2 == -601) {
            arg0.field901 = class59.method454(new class122[] { class51.field1288, class63.field1609 }, 5176);
        } else {
            if (arg1 > -2) {
                method425(107, (String) null);
            }
            if (var2 == 620) {
                if (~class58.field1507 > -2) {
                    arg0.field901 = class51.field1287;
                } else if (!class61.field1566) {
                    arg0.field901 = class64.field1618;
                    arg0.field918 = 16777215;
                } else {
                    arg0.field901 = class74.field1989;
                    arg0.field918 = 16711680;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)Z", line = 555)
    public final boolean method112(byte arg0) {
        ++field1416;
        if (arg0 < 73) {
            method422((class106) null, (class83) null, false, 79);
        }
        return this.field1432 != null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lkd;B)V", line = 593)
    public final void method428(class64 arg0, byte arg1) {
        arg0.field1617 = 0;
        int var3 = -1;
        ++field1429;
        int[] var4 = new int[12];
        int var5 = arg0.method520(-123);
        this.field1433 = arg0.method482(0);
        this.field1436 = arg0.method482(0);
        this.field1445 = 0;
        if (arg1 >= -104) {
            method422((class106) null, (class83) null, false, 22);
        }
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method520(-119);
            if (var7 == 0) {
                var4[var6] = 0;
            } else {
                int var8 = arg0.method520(-111);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && ~var4[0] == -65536) {
                    var3 = arg0.method506((byte) -90);
                    break;
                }
                if (var4[var6] >= 512) {
                    int var12 = class5.method69(var4[var6] + -512, false).field270;
                    if (var12 != 0) {
                        this.field1445 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg0.method520(-113);
            if (var11 < 0 || ~class26.field700[var10].length >= ~var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field297 = arg0.method506((byte) -90);
        if (super.field297 == 65535) {
            super.field297 = -1;
        }
        super.field345 = arg0.method506((byte) -90);
        if (~super.field345 == -65536) {
            super.field345 = -1;
        }
        super.field279 = arg0.method506((byte) -90);
        if (~super.field279 == -65536) {
            super.field279 = -1;
        }
        super.field282 = arg0.method506((byte) -90);
        if (~super.field282 == -65536) {
            super.field282 = -1;
        }
        super.field340 = arg0.method506((byte) -90);
        if (~super.field340 == -65536) {
            super.field340 = -1;
        }
        super.field296 = arg0.method506((byte) -90);
        if (~super.field296 == -65536) {
            super.field296 = -1;
        }
        super.field325 = arg0.method506((byte) -90);
        if (super.field325 == 65535) {
            super.field325 = -1;
        }
        this.field1448 = class24.method252(-76, arg0.method510((byte) 121)).method939(15365);
        this.field1455 = arg0.method520(-109);
        this.field1450 = arg0.method506((byte) -90);
        if (this.field1432 == null) {
            this.field1432 = new class92();
        }
        this.field1432.method735(var9, var4, true, ~var5 == -2, var3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lv;IBLv;)V", line = 721)
    public static final void method429(class122 arg0, int arg1, byte arg2, class122 arg3) {
        if (~arg1 == -1 && class51.field1323 != -1) {
            class93.field2382 = 0;
            class74.field1995 = arg3;
        }
        if (class6.field155 == -1) {
            class103.field2558 = true;
        }
        if (arg2 == 48) {
            ++field1451;
            for (int var4 = 99; var4 > 0; --var4) {
                class67.field1734[var4] = class67.field1734[var4 + -1];
                class8.field195[var4] = class8.field195[var4 - 1];
                class8.field194[var4] = class8.field194[var4 + -1];
            }
            class67.field1734[0] = arg1;
            class8.field195[0] = arg0;
            class8.field194[0] = arg3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(B)V", line = 774)
    public static void method430(byte arg0) {
        field1430 = null;
        field1419 = null;
        field1442 = null;
        field1443 = null;
        field1456 = null;
        if (arg0 >= 95) {
            field1454 = null;
            field1439 = null;
            field1444 = null;
        }
    }
}

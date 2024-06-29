import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 extends class82 {

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "La;")
    public static class1 field419 = class113.method934(-11538, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "La;")
    public static class1 field415 = class113.method934(-11538, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!be", name = "tb", descriptor = "La;")
    public static class1 field432 = class113.method934(-11538, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!be", name = "rb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!be", name = "sb", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!be", name = "ub", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!be", name = "yb", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!be", name = "zb", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!be", name = "wb", descriptor = "Lia;")
    public class49 field435;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "Lka;")
    public class61 field425;

    @OriginalMember(owner = "client!be", name = "vb", descriptor = "Lka;")
    public class61 field434;

    @OriginalMember(owner = "client!be", name = "qb", descriptor = "[I")
    public int[] field429;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(IIB)V", line = 12)
    public static final void method242(int arg0, int arg1, byte arg2) {
        field430++;
        class35 var3 = class74.method689(0, arg1);
        int var4 = var3.field944;
        int var5 = var3.field934;
        int var6 = var3.field946;
        int var7 = -115 % ((arg2 - 46) / 57);
        int var8 = class4.field174[var6 - var4];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var4;
        class113.field2806[var5] = class76.method708(class132.method1034(class113.field2806[var5], ~var9), class132.method1034(var9, arg0 << var4));
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(La;I)Z", line = 46)
    public static final boolean method243(class1 arg0, int arg1) {
        field416++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class59.field1495; var2++) {
            if (arg0.method14(class119.field2954[var2], true)) {
                return true;
            }
        }
        if (arg1 != -32624) {
            field415 = null;
        }
        return arg0.method14(class104.field2624.field87, true);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 76)
    public static void method244(int arg0) {
        field419 = null;
        field432 = null;
        if (arg0 != -9019) {
            method243(null, -100);
        }
        field415 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BIB)I", line = 90)
    public static final int method245(byte[] arg0, int arg1, byte arg2) {
        field433++;
        return arg2 == -68 ? class133.method1047(true, 0, arg1, arg0) : -56;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lbd;ILa;La;)[Ljd;", line = 105)
    public static final class58[] method246(class11 arg0, int arg1, class1 arg2, class1 arg3) {
        field422++;
        if (arg1 != 0) {
            field432 = null;
        }
        int var4 = arg0.method229(0, arg2);
        int var5 = arg0.method225(arg1 ^ 0xFFFFFF97, var4, arg3);
        return class105.method884((byte) -3, var4, arg0, var5);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[IZI)V", line = 122)
    public static final void method247(int arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
        class37.field994.method1057((byte) 90);
        field423++;
        class8.field280.method330(0, 0);
        if (arg3) {
            if (arg2[arg0] != -1) {
                if (arg0 == 0) {
                    class109.field2734.method330(22, 10);
                }
                if (arg0 == 1) {
                    class64.field1601.method330(54, 8);
                }
                if (arg0 == 2) {
                    class64.field1601.method330(82, 8);
                }
                if (arg0 == 3) {
                    class75.field1874.method330(110, 8);
                }
                if (arg0 == 4) {
                    class106.field2689.method330(153, 8);
                }
                if (arg0 == 5) {
                    class106.field2689.method330(181, 8);
                }
                if (arg0 == 6) {
                    class57.field1460.method330(209, 9);
                }
            }
            if (arg2[0] != -1 && arg4 != 0) {
                class114.field2810[0].method330(29, 13);
            }
            if (arg2[1] != -1 && arg4 != 1) {
                class114.field2810[1].method330(53, 11);
            }
            if (arg2[2] != -1 && arg4 != 2) {
                class114.field2810[2].method330(82, 11);
            }
            if (arg2[3] != -1 && arg4 != 3) {
                class114.field2810[3].method330(115, 12);
            }
            if (arg2[4] != -1 && arg4 != 4) {
                class114.field2810[4].method330(153, 13);
            }
            if (arg2[5] != -1 && arg4 != 5) {
                class114.field2810[5].method330(180, 11);
            }
            if (arg2[6] != -1 && arg4 != 6) {
                class114.field2810[6].method330(208, 13);
            }
        }
        class62.field1556.method1057((byte) 90);
        class109.field2748.method330(0, 0);
        if (arg1 != 4) {
            method243(null, -128);
        }
        if (arg3) {
            if (arg2[arg0] != -1) {
                if (arg0 == 7) {
                    class128.field3137.method330(42, 0);
                }
                if (arg0 == 8) {
                    class48.field1257.method330(74, 0);
                }
                if (arg0 == 9) {
                    class48.field1257.method330(102, 0);
                }
                if (arg0 == 10) {
                    class60.field1527.method330(130, 1);
                }
                if (arg0 == 11) {
                    class24.field740.method330(173, 0);
                }
                if (arg0 == 12) {
                    class24.field740.method330(201, 0);
                }
                if (arg0 == 13) {
                    class39.field1075.method330(229, 0);
                }
            }
            if (arg2[8] != -1 && arg4 != 8) {
                class114.field2810[7].method330(74, 2);
            }
            if (arg2[9] != -1 && arg4 != 9) {
                class114.field2810[8].method330(102, 3);
            }
            if (arg2[10] != -1 && arg4 != 10) {
                class114.field2810[9].method330(137, 4);
            }
            if (arg2[11] != -1 && arg4 != 11) {
                class114.field2810[10].method330(174, 2);
            }
            if (arg2[12] != -1 && arg4 != 12) {
                class114.field2810[11].method330(201, 2);
            }
            if (arg2[13] != -1 && arg4 != 13) {
                class114.field2810[12].method330(226, 2);
            }
        }
        try {
            Graphics var5 = class122.field3052.getGraphics();
            class37.field994.method102(0, 516, var5, 160);
            class62.field1556.method102(0, 496, var5, 466);
        } catch (Exception var6) {
            class122.field3052.repaint();
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 269)
    public final void method248(int arg0) {
        int var2 = this.field421;
        int var3 = 37 % ((arg0 + 55) / 54);
        class49 var4 = this.field435.method518(-20);
        if (var4 == null) {
            this.field424 = 0;
            this.field436 = 0;
            this.field426 = 0;
            this.field429 = null;
            this.field421 = -1;
        } else {
            this.field424 = var4.field1287 * 128;
            this.field436 = var4.field1284;
            this.field426 = var4.field1327;
            this.field421 = var4.field1298;
            this.field429 = var4.field1308;
        }
        field428++;
        if (this.field421 != var2 && this.field425 != null) {
            class99.field2438.method136(this.field425);
            this.field425 = null;
        }
    }
}

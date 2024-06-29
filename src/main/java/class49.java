import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class49 extends class42 {

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "Lae;")
    public static class6 field1089 = class64.method474(114, "Angreifen");

    @OriginalMember(owner = "client!he", name = "lb", descriptor = "Lae;")
    public static class6 field1092 = class64.method474(126, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!he", name = "nb", descriptor = "I")
    public static int field1094 = -1;

    @OriginalMember(owner = "client!he", name = "kb", descriptor = "Lae;")
    public static class6 field1091 = class64.method474(103, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "[[I")
    public static int[][] field1083 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "Lae;")
    public static class6 field1085 = class64.method474(110, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!he", name = "pb", descriptor = "[Lv;")
    public static class131[] field1096 = new class131[4];

    @OriginalMember(owner = "client!he", name = "qb", descriptor = "[Lab;")
    public static class2[] field1097 = new class2[32768];

    @OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!he", name = "ub", descriptor = "Lae;")
    public static class6 field1101 = class64.method474(103, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!he", name = "wb", descriptor = "Lae;")
    public static class6 field1103 = class64.method474(108, "@or2@");

    @OriginalMember(owner = "client!he", name = "Bb", descriptor = "Lae;")
    public static class6 field1108 = class64.method474(122, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!he", name = "db", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!he", name = "mb", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!he", name = "ob", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!he", name = "sb", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!he", name = "tb", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!he", name = "xb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!he", name = "zb", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!he", name = "Ab", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!he", name = "vb", descriptor = "[I")
    public static int[] field1102;

    @OriginalMember(owner = "client!he", name = "yb", descriptor = "[I")
    public static int[] field1105;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 9)
    public static void method391(byte arg0) {
        field1101 = null;
        field1083 = null;
        field1103 = null;
        field1105 = null;
        field1097 = null;
        field1091 = null;
        if (arg0 != -6) {
            field1091 = null;
        }
        field1096 = null;
        field1089 = null;
        field1102 = null;
        field1085 = null;
        field1108 = null;
        field1092 = null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(Z)Lv;", line = 33)
    public final class131 method3(boolean arg0) {
        if (arg0) {
            field1090++;
            return class43.method356(-7, this.field1106).method217(this.field1099, true, (byte) -124);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lda;ZI)V", line = 67)
    public static final void method392(class21 arg0, boolean arg1, int arg2) {
        if (class95.field2262 != null) {
            try {
                class95.field2262.method207(-2158);
            } catch (Exception var8) {
            }
            class95.field2262 = null;
        }
        field1087++;
        class95.field2262 = arg0;
        class123.method1014(-125, arg1);
        if (arg2 < 9) {
            field1105 = null;
        }
        class129.field3115 = null;
        class52.field1172 = 0;
        class109.field2625.field1821 = 0;
        class73.field1669 = null;
        while (true) {
            class34 var3 = (class34) class8.field171.method270(1);
            if (var3 == null) {
                while (true) {
                    class34 var4 = (class34) class30.field731.method270(112);
                    if (var4 == null) {
                        if (class109.field2606 != 0) {
                            try {
                                class77 var5 = new class77(4);
                                var5.method641((byte) -28, 4);
                                var5.method641((byte) -28, class109.field2606);
                                var5.method667((byte) 97, 0);
                                class95.field2262.method211(-1, var5.field1858, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    class95.field2262.method207(-2158);
                                } catch (Exception var6) {
                                }
                                class130.field3156++;
                                class95.field2262 = null;
                            }
                        }
                        class69.field1522 = 0;
                        class116.field2739 = class5.method22(103);
                        return;
                    }
                    class56.field1224.method888(true, var4);
                    class59.field1283.method269(var4.field1501, var4, (byte) -127);
                    class70.field1548++;
                    class80.field1956--;
                }
            }
            class40.field888.method269(var3.field1501, var3, (byte) -58);
            class4.field33--;
            class51.field1151++;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lbf;IIZ)Lva;", line = 147)
    public static final class128 method393(class14 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field1094 = -114;
        }
        field1104++;
        return client.method197(arg2, arg1, (byte) 29, arg0) ? class116.method956(false) : null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILte;Lte;)Lte;", line = 176)
    public static final class121 method394(int arg0, int arg1, int arg2, class121 arg3, class121 arg4) {
        class121 var5 = class65.method478(arg4.field2960, arg0, arg4.field2984, class35.field828[arg4.field2960 >> 16], arg1, arg4.field2936, arg4.field2872, arg3, arg2, 0, -123, arg4.field2847);
        field1095++;
        if (var5 == null) {
            if (arg4.field2885 != null) {
                var5 = class65.method478(arg4.field2960, arg0, arg4.field2984, arg4.field2885, arg1, arg4.field2936, arg4.field2872, arg3, 0, 0, -114, arg4.field2847);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)I", line = 220)
    public static final int method395(int arg0, byte arg1, int arg2) {
        class136 var3 = (class136) class20.field389.method276((byte) -19, (long) arg2);
        field1100++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 80 / ((arg1 + 50) / 43);
            for (int var6 = 0; var6 < var3.field3311.length; var6++) {
                if (var3.field3312[var6] == arg0) {
                    var4 += var3.field3311[var6];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIB)I", line = 265)
    public static final int method396(int arg0, int arg1, byte arg2) {
        field1084++;
        if (arg2 != 122) {
            method393(null, 20, -27, true);
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }
}

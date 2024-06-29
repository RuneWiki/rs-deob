import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class70 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[B")
    public byte[] field1322 = new byte[18002];

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
    public int[] field1327 = new int[256];

    @OriginalMember(owner = "client!th", name = "r", descriptor = "[B")
    public byte[] field1333 = new byte[4096];

    @OriginalMember(owner = "client!th", name = "q", descriptor = "[Z")
    public boolean[] field1332 = new boolean[256];

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[Z")
    public boolean[] field1326 = new boolean[16];

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public int field1328 = 0;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "[I")
    public int[] field1334 = new int[6];

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[[I")
    public int[][] field1317 = new int[6][258];

    @OriginalMember(owner = "client!th", name = "B", descriptor = "[I")
    public int[] field1343 = new int[257];

    @OriginalMember(owner = "client!th", name = "u", descriptor = "[[I")
    public int[][] field1336 = new int[6][258];

    @OriginalMember(owner = "client!th", name = "v", descriptor = "[B")
    public byte[] field1337 = new byte[18002];

    @OriginalMember(owner = "client!th", name = "E", descriptor = "[I")
    public int[] field1346 = new int[16];

    @OriginalMember(owner = "client!th", name = "K", descriptor = "[[I")
    public int[][] field1352 = new int[6][258];

    @OriginalMember(owner = "client!th", name = "M", descriptor = "[[B")
    public byte[][] field1354 = new byte[6][258];

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public int field1340 = 0;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "[B")
    public byte[] field1353 = new byte[256];

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1350 = -1;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Ldg;")
    public static class276 field1321 = new class276(260);

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lvf;")
    public static class265 field1355 = class87.method582(-46, "Angreifen");

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Lvf;")
    public static class265 field1358 = class87.method582(-46, "niveau ");

    @OriginalMember(owner = "client!th", name = "S", descriptor = "Z")
    public static boolean field1360 = true;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Ldg;")
    public static class276 field1357 = new class276(100);

    @OriginalMember(owner = "client!th", name = "T", descriptor = "Lvf;")
    public static class265 field1361 = class87.method582(-46, "(U4");

    @OriginalMember(owner = "client!th", name = "w", descriptor = "B")
    public byte field1338;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[B")
    public byte[] field1324;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "[B")
    public byte[] field1349;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "[[S")
    public static short[][] field1356;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "[[[I")
    public static int[][][] field1345;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILgk;I)V")
    public static final void method495(int arg0, int arg1, class6 arg2, int arg3) {
        if (arg2.field79 == 0) {
            arg2.field204 = arg2.field216;
        } else if (arg2.field79 == 1) {
            arg2.field204 = (arg0 - arg2.field84) / 2 + arg2.field216;
        } else if (arg2.field79 == 2) {
            arg2.field204 = arg0 - arg2.field84 - arg2.field216;
        } else if (arg2.field79 == 3) {
            arg2.field204 = arg2.field216 * arg0 >> 14;
        } else if (arg2.field79 == 4) {
            arg2.field204 = (arg2.field216 * arg0 >> 14) + (arg0 - arg2.field84) / 2;
        } else {
            arg2.field204 = arg0 - arg2.field84 - (arg2.field216 * arg0 >> 14);
        }
        field1342++;
        if (arg2.field184 == 0) {
            arg2.field153 = arg2.field87;
        } else if (arg2.field184 == 1) {
            arg2.field153 = (arg1 - arg2.field89) / 2 + arg2.field87;
        } else if (arg2.field184 == 2) {
            arg2.field153 = arg1 - arg2.field89 - arg2.field87;
        } else if (arg2.field184 == 3) {
            arg2.field153 = arg2.field87 * arg1 >> 14;
        } else if (arg2.field184 == 4) {
            arg2.field153 = (arg2.field87 * arg1 >> 14) + (arg1 - arg2.field89) / 2;
        } else {
            arg2.field153 = arg1 - arg2.field89 - (arg2.field87 * arg1 >> 14);
        }
        if (class267.field4710 && (client.method1474(arg2) != 0 || arg2.field187 == 0)) {
            if (arg2.field153 < 0) {
                arg2.field153 = 0;
            } else if (arg1 < (arg2.field89 + arg2.field153)) {
                arg2.field153 = arg1 - arg2.field89;
            }
            if (arg2.field204 < 0) {
                arg2.field204 = 0;
            } else if (arg0 < (arg2.field84 + arg2.field204)) {
                arg2.field204 = arg0 - arg2.field84;
            }
        }
        if (arg3 != -26564) {
            method496(31, -108, false, 8);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZI)V")
    public static final void method496(int arg0, int arg1, boolean arg2, int arg3) {
        field1316++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class51.field1080 = arg2;
        class125.field2242 = arg1;
        class218.field3926 = arg0;
        if (arg3 != 2) {
            method495(107, -15, (class6) null, -19);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public static final void method497(int arg0, int arg1) {
        field1329++;
        if (class246.field4281 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class246.field4281 == 0) {
            class246.method1631(-103);
        }
        if (arg1 == 40) {
            class229.method1551(0);
        }
        if (arg0 < 69) {
            method499(-51);
        }
        if (arg1 != 40 && class253.field4347 != null) {
            class253.field4347.method990(4);
            class253.field4347 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class19.field499 = 1;
            class82.field1542 = 0;
            class211.field3792 = 0;
            class174.field3121 = 0;
            class65.field1264 = 1;
            class145.method1007(true, 179);
        }
        if (arg1 == 25 || arg1 == 10) {
            class56.method426(false);
        }
        if (arg1 == 5) {
            class100.method674(5992, class243.field4236);
        } else {
            class67.method481(19380);
        }
        boolean var3 = class246.field4281 == 5 || class246.field4281 == 10 || class246.field4281 == 28;
        if (var3 != var2) {
            if (var2) {
                class44.field980 = class201.field3584;
                if (class105.field1868 == 0) {
                    class123.method832(2, -106);
                } else {
                    class262.method1753(false, 0, 255, class201.field3584, 2, class14.field427, (byte) -12);
                }
                class130.field2281.method1712(false, (byte) 101);
            } else {
                class123.method832(2, -31);
                class130.field2281.method1712(true, (byte) 99);
            }
        }
        class246.field4281 = arg1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static final void method498(int arg0) {
        class217.field3915 = null;
        class43.field949 = null;
        class38.field867 = null;
        class140.field2605 = null;
        field1319++;
        class184.field3293 = null;
        if (arg0 != 823277998) {
            field1357 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static void method499(int arg0) {
        field1356 = null;
        field1358 = null;
        field1345 = null;
        field1361 = null;
        if (arg0 != 8000) {
            method499(36);
        }
        field1321 = null;
        field1355 = null;
        field1357 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Ltd;")
    private static class136 field1519 = class145.method1172("Invalid loginserver requested)3", 45);

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Ltd;")
    public static class136 field1521 = class145.method1172("Standort", 45);

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Ltd;")
    private static class136 field1525 = class145.method1172("Loading textures )2 ", 45);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Ltd;")
    public static class136 field1524 = class145.method1172("Fps:", 45);

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "[[I")
    public static int[][] field1534 = new int[104][104];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Ltd;")
    public static class136 field1516 = field1525;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Ltd;")
    private static class136 field1531 = class145.method1172("Continue", 45);

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Ltd;")
    private static class136 field1529 = class145.method1172("skill)2", 45);

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ltd;")
    public static class136 field1537 = class145.method1172("oder benutzen Sie eine andere Welt)3", 45);

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Ltd;")
    private static class136 field1539 = class145.method1172("Enter your username (V password)3", 45);

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Z")
    public static boolean field1523 = false;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ltd;")
    public static class136 field1517 = field1539;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Ltd;")
    public static class136 field1536 = class145.method1172("m-Ochte mit Ihnen handeln)3", 45);

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "[[[I")
    public static int[][][] field1538 = new int[4][13][13];

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Ltd;")
    public static class136 field1542 = class145.method1172("blinken3:", 45);

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
    public static int[] field1520 = new int[25];

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Ltd;")
    public static class136 field1544 = field1519;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Ltd;")
    public static class136 field1528 = field1529;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Ltd;")
    public static class136 field1540 = field1531;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lbb;")
    public static class10 field1530;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Luc;")
    public static class141 field1522;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lmd;")
    public static class87 field1543;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IJ)V")
    public static final void method530(int arg0, long arg1) {
        field1535++;
        if (arg1 == 0L) {
            return;
        }
        if (class89.field2104 >= 100) {
            class27.method236((byte) -38, class64.field1378, 0, class37.field871);
            return;
        }
        class136 var3 = class11.method74(arg0 - 8261, arg1).method1102(-1);
        for (int var4 = 0; var4 < class89.field2104; var4++) {
            if (class43.field988[var4] == arg1) {
                class27.method236((byte) -38, class79.method570(0, new class136[] { var3, class125.field2909 }), 0, class37.field871);
                return;
            }
        }
        for (int var5 = 0; var5 < class1.field14; var5++) {
            if (class11.field196[var5] == arg1) {
                class27.method236((byte) -38, class79.method570(0, new class136[] { class121.field2795, var3, class107.field2525 }), 0, class37.field871);
                return;
            }
        }
        if (var3.method1114(arg0, class24.field555.field249)) {
            class27.method236((byte) -38, class86.field2025, 0, class37.field871);
            return;
        }
        class151.field3449++;
        class43.field988[class89.field2104++] = arg1;
        class154.field3522 = class67.field1423;
        class15.field304.method867(92, true);
        class15.field304.method990(arg1, (byte) 106);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static final void method531(boolean arg0) {
        if (arg0) {
            field1544 = null;
        }
        class128.field3080.method1165((byte) -73);
        field1526++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method532(byte arg0) {
        if (arg0 <= 38) {
            field1542 = null;
        }
        field1518++;
        int var1 = class4.field70.method877(false, 8);
        if (class55.field1255 > var1) {
            for (int var2 = var1; var2 < class55.field1255; var2++) {
                class78.field1799[class149.field3433++] = class24.field564[var2];
            }
        }
        if (var1 > class55.field1255) {
            throw new RuntimeException("gppov1");
        }
        class55.field1255 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class24.field564[var3];
            class13 var5 = class154.field3518[var4];
            int var6 = class4.field70.method877(false, 1);
            if (var6 == 0) {
                class24.field564[class55.field1255++] = var4;
                var5.field3555 = class44.field1013;
            } else {
                int var7 = class4.field70.method877(false, 2);
                if (var7 == 0) {
                    class24.field564[class55.field1255++] = var4;
                    var5.field3555 = class44.field1013;
                    class108.field2532[class26.field591++] = var4;
                } else if (var7 == 1) {
                    class24.field564[class55.field1255++] = var4;
                    var5.field3555 = class44.field1013;
                    int var8 = class4.field70.method877(false, 3);
                    var5.method1214((byte) 126, false, var8);
                    int var9 = class4.field70.method877(false, 1);
                    if (var9 == 1) {
                        class108.field2532[class26.field591++] = var4;
                    }
                } else if (var7 == 2) {
                    class24.field564[class55.field1255++] = var4;
                    var5.field3555 = class44.field1013;
                    int var10 = class4.field70.method877(false, 3);
                    var5.method1214((byte) -124, true, var10);
                    int var11 = class4.field70.method877(false, 3);
                    var5.method1214((byte) 127, true, var11);
                    int var12 = class4.field70.method877(false, 1);
                    if (var12 == 1) {
                        class108.field2532[class26.field591++] = var4;
                    }
                } else if (var7 == 3) {
                    class78.field1799[class149.field3433++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static void method533(boolean arg0) {
        field1534 = null;
        field1517 = null;
        field1516 = null;
        field1542 = null;
        field1538 = null;
        if (!arg0) {
            field1516 = null;
        }
        field1525 = null;
        field1539 = null;
        field1522 = null;
        field1524 = null;
        field1530 = null;
        field1520 = null;
        field1528 = null;
        field1543 = null;
        field1540 = null;
        field1529 = null;
        field1521 = null;
        field1531 = null;
        field1544 = null;
        field1537 = null;
        field1536 = null;
        field1519 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
    public static final void method534(byte arg0, int arg1) {
        field1541++;
        if (class139.field3248 == arg1) {
            return;
        }
        if (arg0 != 73) {
            field1519 = null;
        }
        if (class139.field3248 == 0) {
            class110.method876((byte) 113);
        }
        if (arg1 == 20 || arg1 == 40) {
            class153.field3503 = 0;
            class31.field722 = 0;
            class96.field2275 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class125.field2906 != null) {
            class125.field2906.method144(1);
            class125.field2906 = null;
        }
        if (class139.field3248 == 25) {
            class113.field2622 = 0;
            class89.field2117 = 1;
            class64.field1384 = 1;
            class86.field2026 = 0;
            class35.field842 = 0;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class71.method528(class14.field279, (byte) 33, class143.field3328, class133.field3142);
        } else {
            class37.method313(2);
        }
        class139.field3248 = arg1;
    }
}

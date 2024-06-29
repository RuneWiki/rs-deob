import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 {

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lbe;")
    private class13 field1449 = new class13();

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "Lve;")
    private class151 field1474 = new class151();

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "Lwc;")
    private class156 field1476;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lec;")
    public static class32 field1442 = class73.method594("rect_debug=", true);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "J")
    public static volatile long field1444 = 0L;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lec;")
    public static class32 field1446 = class73.method594(")1p", true);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lec;")
    public static class32 field1456 = class73.method594("sl_arrows", true);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lec;")
    private static class32 field1454 = class73.method594("Loading sprites )2 ", true);

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1466 = -1;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lec;")
    public static class32 field1445 = class73.method594("Bitte entfernen Sie ", true);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "Lec;")
    public static class32 field1460 = field1454;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1461 = 50;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
    public static int[] field1465 = new int[field1461];

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[Lec;")
    public static class32[] field1453 = new class32[field1461];

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "[I")
    public static int[] field1471 = new int[field1461];

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "[I")
    public static int[] field1468 = new int[field1461];

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1470 = 0;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "[I")
    public static int[] field1458 = new int[field1461];

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
    public static int[] field1473 = new int[field1461];

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
    public static int[] field1447 = new int[field1461];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[I")
    public static int[] field1441 = new int[field1461];

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lwd;")
    public static class157 field1467 = new class157();

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Lec;")
    public static class32 field1477 = class73.method594("Sie haben gerade eine andere Welt verlassen)3", true);

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lf;")
    public static class36 field1448;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
    public static int[] field1443;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[[I")
    public static int[][] field1455;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public static final void method484(int arg0, int arg1, int arg2) {
        field1451++;
        if (class125.field2913 != 2) {
            return;
        }
        class136.method1033((class103.field2405 - class118.field2838 << 7) + client.field377, (byte) 121, (class145.field3301 - class72.field1701 << 7) + class137.field3196, class110.field2582 * 2);
        if (arg2 != 28) {
            method490((byte) 108);
        }
        if (class89.field2057 > -1 && class140.field3219 % 20 < 10) {
            class131.field3021[0].method370(arg0 + class89.field2057 - 12, arg1 - (-class130.field3003 + 28));
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JBLbe;)V")
    public final void method485(long arg0, byte arg1, class13 arg2) {
        if (arg1 >= -117) {
            return;
        }
        field1464++;
        if (this.field1472 == 0) {
            class13 var5 = this.field1474.method1175(103);
            var5.method1093(0);
            var5.method68(false);
            if (this.field1449 == var5) {
                class13 var6 = this.field1474.method1175(89);
                var6.method1093(0);
                var6.method68(false);
            }
        } else {
            this.field1472--;
        }
        this.field1476.method1203(true, arg0, arg2);
        this.field1474.method1173(arg2, 2048);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IJ)Lbe;")
    public final class13 method486(int arg0, long arg1) {
        field1462++;
        class13 var4 = (class13) this.field1476.method1198(arg1, (byte) -106);
        if (arg0 == -28825) {
            if (var4 != null) {
                this.field1474.method1173(var4, 2048);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JZ)V")
    public final void method487(long arg0, boolean arg1) {
        if (arg1) {
            field1441 = null;
        }
        field1452++;
        class13 var4 = (class13) this.field1476.method1198(arg0, (byte) -106);
        if (var4 != null) {
            var4.method1093(0);
            var4.method68(false);
            this.field1472++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method488(byte arg0) {
        field1457++;
        class82.field1915.method491(94);
        class48.field1126.method491(-124);
        if (arg0 <= -27) {
            class47.field1115.method491(-126);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method489(byte arg0) {
        field1456 = null;
        field1473 = null;
        field1448 = null;
        field1446 = null;
        field1455 = null;
        field1477 = null;
        field1441 = null;
        field1468 = null;
        field1443 = null;
        field1454 = null;
        field1453 = null;
        field1467 = null;
        field1445 = null;
        field1460 = null;
        field1447 = null;
        field1458 = null;
        field1471 = null;
        field1442 = null;
        field1465 = null;
        if (arg0 != 64) {
            field1456 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
    public static final void method490(byte arg0) {
        Object var1 = class92.field2105;
        synchronized (class92.field2105) {
            if (class146.field3325 != 0) {
                class146.field3325 = 1;
                try {
                    class92.field2105.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field1463++;
        if (arg0 != -11) {
            method484(-29, -50, -47);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method491(int arg0) {
        field1450++;
        while (true) {
            class13 var2 = this.field1474.method1175(125);
            if (var2 == null) {
                this.field1472 = this.field1475;
                int var3 = -87 % ((-arg0 - 27) / 48);
                return;
            }
            var2.method1093(0);
            var2.method68(false);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
    public class63(int arg0) {
        int var2 = 1;
        this.field1472 = arg0;
        this.field1475 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field1476 = new class156(var2);
    }
}

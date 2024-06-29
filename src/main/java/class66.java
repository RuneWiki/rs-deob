import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 implements class138 {

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lnd;")
    private class94 field1437 = new class94();

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    private int field1445 = 128;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private int field1452 = 0;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "D")
    private double field1444 = 1.0D;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lkb;")
    private class71 field1448;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[Lka;")
    private class70[] field1439;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Laf;")
    public static class7 field1427 = class48.method406(40, "::gc");

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "[Z")
    public static boolean[] field1440 = new boolean[5];

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Laf;")
    public static class7 field1442 = class48.method406(40, "leuchten2:");

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Laf;")
    private static class7 field1433 = class48.method406(40, "Loading sprites )2 ");

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Laf;")
    public static class7 field1432 = field1433;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Laf;")
    private static class7 field1447 = class48.method406(40, "K");

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Laf;")
    public static class7 field1451 = field1447;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Laf;")
    public static class7 field1438 = field1447;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Laf;")
    private static class7 field1457 = class48.method406(40, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Laf;")
    public static class7 field1453 = field1457;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lqc;")
    public static class114[] field1435;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        for (int var2 = 0; var2 < this.field1439.length; var2++) {
            if (this.field1439[var2] != null) {
                this.field1439[var2].method556();
            }
        }
        field1429++;
        if (arg0 <= -4) {
            this.field1437 = new class94();
            this.field1452 = this.field1458;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
    public static final void method528(int arg0, int arg1, int arg2, int arg3) {
        field1436++;
        class103 var4 = class19.method177(arg3, (byte) -80, arg2);
        if (arg1 != -5640) {
            method533(59, null);
        }
        if (var4 != null && var4.field2532 != null) {
            class39 var5 = new class39();
            var5.field967 = var4;
            var5.field962 = var4.field2532;
            class80.method675(-2001, var5);
        }
        class96.field2289 = arg3;
        class21.field534 = arg2;
        class50.field1206 = true;
        class9.field246 = arg0;
        class141.method1151(15569, var4);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)Z")
    public final boolean method529(int arg0, int arg1) {
        if (arg1 != 32454) {
            this.field1437 = null;
        }
        field1456++;
        return this.field1439[arg0].field1537;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ID)V")
    public final void method530(int arg0, double arg1) {
        this.field1444 = arg1;
        field1455++;
        if (arg0 > 68) {
            this.method527(-125);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
    public final int[] method531(int arg0, int arg1) {
        field1430++;
        if (arg0 != -30264) {
            return null;
        }
        class70 var3 = this.field1439[arg1];
        if (var3 != null) {
            if (var3.field1533 != null) {
                this.field1437.method767(var3, true);
                var3.field1528 = true;
                return var3.field1533;
            }
            boolean var4 = var3.method557(this.field1444, this.field1445, this.field1448);
            if (var4) {
                if (this.field1452 == 0) {
                    class70 var5 = (class70) this.field1437.method761((byte) -22);
                    var5.method556();
                } else {
                    this.field1452--;
                }
                this.field1437.method767(var3, true);
                var3.field1528 = true;
                return var3.field1533;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static final void method532(int arg0) {
        field1450++;
        if (arg0 != -18481) {
            method532(84);
        }
        while (true) {
            class94 var1 = class9.field240;
            class119 var2;
            synchronized (class9.field240) {
                var2 = (class119) class151.field3538.method768((byte) -11);
            }
            if (var2 == null) {
                return;
            }
            var2.field2825.method914(var2.field2824, (int) var2.field3261, false, var2.field2823, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILkb;)V")
    public static final void method533(int arg0, class71 arg1) {
        field1454++;
        int var2 = 21 / ((41 - arg0) / 45);
        class106.field2603 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)I")
    public static final int method534(int arg0, int arg1, byte arg2) {
        if (arg2 != -4) {
            method538((byte) 82);
        }
        field1428++;
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)Z")
    public final boolean method535(int arg0, byte arg1) {
        field1449++;
        if (arg1 > -50) {
            field1433 = null;
        }
        return this.field1445 == 64;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public final int method536(int arg0, int arg1) {
        field1434++;
        if (arg1 == 6995) {
            return this.field1439[arg0] == null ? 0 : this.field1439[arg0].field1527;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V")
    public final void method537(int arg0, int arg1) {
        if (arg1 != 5) {
            this.field1437 = null;
        }
        field1441++;
        for (int var3 = 0; var3 < this.field1439.length; var3++) {
            class70 var4 = this.field1439[var3];
            if (var4 != null && var4.field1532 != 0 && var4.field1528) {
                var4.method558(arg0);
                var4.field1528 = false;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lkb;Lkb;IDI)V")
    public class66(class71 arg0, class71 arg1, int arg2, double arg3, int arg4) {
        this.field1444 = arg3;
        this.field1445 = arg4;
        this.field1458 = arg2;
        this.field1452 = this.field1458;
        this.field1448 = arg1;
        int[] var7 = arg0.method574(57, 0);
        int var8 = var7.length;
        this.field1439 = new class70[arg0.method562((byte) -128, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class122 var10 = new class122(arg0.method572(0, false, var7[var9]));
            this.field1439[var7[var9]] = new class70(var10);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method538(byte arg0) {
        field1451 = null;
        field1442 = null;
        field1432 = null;
        field1457 = null;
        field1447 = null;
        field1435 = null;
        field1440 = null;
        field1427 = null;
        field1433 = null;
        field1438 = null;
        if (arg0 != -10) {
            method532(96);
        }
        field1453 = null;
    }
}

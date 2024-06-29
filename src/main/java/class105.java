import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class105 {

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "B")
    public byte field1477;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Ljw;")
    public class280 field1487;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1473 = -1;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lhfa;")
    public static class696 field1484 = new class696(14, 0);

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lhfa;")
    public static class696 field1489 = new class696(15, 4);

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lhfa;")
    public static class696 field1490 = new class696(16, -2);

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lhfa;")
    public static class696 field1491 = new class696(17, 0);

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lhfa;")
    public static class696 field1492 = new class696(18, -2);

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lhfa;")
    public static class696 field1493 = new class696(19, -2);

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Lhfa;")
    public static class696 field1494 = new class696(20, 6);

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lhfa;")
    public static class696 field1495 = new class696(21, 9);

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "Lhfa;")
    public static class696 field1496 = new class696(22, -2);

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Lhfa;")
    public static class696 field1497 = new class696(23, 4);

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lhfa;")
    public static class696 field1498 = new class696(24, -1);

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Lhfa;")
    public static class696 field1499 = new class696(26, 0);

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Lhfa;")
    public static class696 field1500 = new class696(27, 0);

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Lhfa;")
    public static class696 field1501 = new class696(28, -2);

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "[Lhfa;")
    private static class696[] field1502 = new class696[32];

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "F")
    public static float field1471;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "J")
    public static long field1474;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Liq;")
    public class149 field1485;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lmga;")
    public class29 field1483;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lpd;")
    public class531 field1481;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Ljda;")
    public class673 field1472;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    public static int[] field1478;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method773(int arg0) {
        field1490 = null;
        field1502 = null;
        field1500 = null;
        field1496 = null;
        field1497 = null;
        field1484 = null;
        field1478 = null;
        field1489 = null;
        field1501 = null;
        field1499 = null;
        field1493 = null;
        field1495 = null;
        field1491 = null;
        field1492 = null;
        field1498 = null;
        if (arg0 > -87) {
            field1500 = null;
        }
        field1494 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)Z")
    public final boolean method774(int arg0) {
        field1480++;
        if (arg0 == 21) {
            return this.field1477 == 2 || this.field1477 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(BIIIIIILjw;)V")
    public class105(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class280 arg7) {
        this.field1479 = arg6;
        this.field1477 = arg0;
        this.field1487 = arg7;
        this.field1475 = arg3;
        this.field1476 = arg5;
        this.field1486 = arg1;
        this.field1488 = arg2;
        this.field1482 = arg4;
    }

    static {
        class696[] var0 = class731.method4072(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1502[var0[var1].field9838] = var0[var1];
        }
    }
}

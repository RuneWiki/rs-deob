import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class107 {

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field1529 = 0;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lwm;")
    private static class152 field1522 = class157.method1048("Loaded fonts", 121);

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Z")
    public static boolean field1525 = false;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lwm;")
    public static class152 field1518 = field1522;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Lwm;")
    public static class152 field1527 = class157.method1048("Spieler kann nicht gefunden werden: ", 113);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lwm;")
    public static class152 field1533 = class157.method1048("(U3", 120);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lol;")
    public static class231 field1519 = new class231(8);

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lwm;")
    public static class152 field1535 = class157.method1048("Lade Texturen )2 ", 93);

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "F")
    public static float field1520;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[[B")
    public static byte[][] field1534;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILhi;Z)V", line = 5)
    private final void method709(int arg0, class291 arg1, boolean arg2) {
        if (arg0 == 5) {
            this.field1529 = arg1.method2021((byte) 74);
        }
        if (!arg2) {
            this.field1529 = 38;
        }
        field1531++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 22)
    public static final void method710(int arg0) {
        field1526++;
        class225.field3655 = new class231(32);
        if (arg0 != 1782206279) {
            method710(117);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)I", line = 47)
    public static final int method711(int arg0, int arg1, int arg2, int arg3) {
        field1521++;
        if (arg1 == arg3) {
            return arg3;
        }
        if (arg2 != 1643) {
            method714(-80, (byte) -74);
        }
        int var4 = 128 - arg0;
        int var5 = ((arg3 & -16711936) >>> 7) * var4 + ((arg1 >>> 7 & 0x1FE01FE) * arg0) & 0xFF00FF00;
        int var6 = (arg3 & 0xFF00FF) * var4 + ((arg1 & 0xFF00FF) * arg0) & 0xFF00FF00;
        return var5 + (var6 >> 7);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 71)
    public static void method712(boolean arg0) {
        field1534 = (byte[][]) null;
        field1527 = null;
        field1518 = null;
        field1522 = null;
        field1535 = null;
        if (arg0) {
            field1519 = null;
            field1533 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 96)
    public static final void method713(int arg0) {
        class241.field3947.method1619(11300);
        if (arg0 <= -126) {
            class228.field3733.method1619(11300);
            field1523++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I", line = 112)
    public static final int method714(int arg0, byte arg1) {
        if (arg1 != 100) {
            field1519 = (class231) null;
        }
        field1517++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILhi;)V", line = 148)
    public final void method715(int arg0, class291 arg1) {
        if (arg0 != 1157495591) {
            field1527 = (class152) null;
        }
        while (true) {
            int var3 = arg1.method2011(-47);
            if (var3 == 0) {
                field1528++;
                return;
            }
            this.method709(var3, arg1, true);
        }
    }
}

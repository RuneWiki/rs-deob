import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class94 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lp;")
    public static class280 field1518 = class18.method140((byte) -118, "mapfunction");

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lp;")
    public static class280 field1517 = class18.method140((byte) -123, "Annuler");

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1525 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lp;")
    public static class280 field1522 = class18.method140((byte) -121, "overlay2");

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Z")
    public static boolean field1527;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)V")
    public abstract void method601(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)V")
    public static final void method664(byte arg0, int arg1) {
        int var2 = 34 % ((arg0 + 4) / 47);
        field1529++;
        if (arg1 == -1 || !class262.field4636[arg1]) {
            return;
        }
        class45.field747.method1251(arg1, (byte) -95);
        if (class251.field4394[arg1] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class251.field4394[arg1].length; var4++) {
            if (class251.field4394[arg1][var4] != null) {
                if (class251.field4394[arg1][var4].field1879 == 2) {
                    var3 = false;
                } else {
                    class251.field4394[arg1][var4] = null;
                }
            }
        }
        if (var3) {
            class251.field4394[arg1] = null;
        }
        class262.field4636[arg1] = false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z")
    public static final boolean method665(int arg0, int arg1) {
        if (arg0 != 1) {
            field1527 = false;
        }
        field1519++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method666(int arg0) {
        field1518 = null;
        field1522 = null;
        if (arg0 != 4) {
            field1518 = null;
        }
        field1517 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V")
    public abstract void method597(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)V")
    public abstract void method602(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z")
    public static final boolean method667(int arg0, int arg1, int arg2) {
        if (arg2 != -16784) {
            return false;
        }
        field1526++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class130 var3 = class32.method277((byte) -77, arg1);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method902((byte) 75, arg0);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(III)V")
    public class94(int arg0, int arg1, int arg2) {
        this.field1521 = arg0;
        this.field1528 = arg2;
        this.field1520 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
    public static final void method668(int arg0, byte arg1) {
        class264.field4659 = 1000 / arg0;
        if (arg1 <= -112) {
            field1516++;
        }
    }
}

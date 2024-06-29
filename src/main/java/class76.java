import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lje;")
    public static class67 field1629 = class85.method592(255, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lje;")
    public static class67 field1635 = class85.method592(255, "Okay");

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Luf;")
    public static class145 field1634 = new class145(8);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lua;")
    public static class140 field1640;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lfd;")
    public static class40 field1628;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lg;")
    public static class43 field1632;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method540(byte arg0) {
        field1632 = null;
        if (arg0 < 5) {
            method542(-118, (byte) -111);
        }
        field1640 = null;
        field1635 = null;
        field1629 = null;
        field1628 = null;
        field1634 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    public static final void method541(int arg0, int arg1, int arg2, int arg3) {
        field1636++;
        if (class82.field1801 != 0 && arg2 != 0 && class86.field1903 < 50) {
            class59.field1174[class86.field1903] = arg1;
            class127.field2783[class86.field1903] = arg2;
            class129.field2845[class86.field1903] = arg0;
            class80.field1767[class86.field1903] = null;
            class145.field3352[class86.field1903] = 0;
            class86.field1903++;
        }
        if (arg3 != 26079) {
            field1629 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Z")
    public static final boolean method542(int arg0, byte arg1) {
        field1639++;
        if (arg1 == 88) {
            return (arg0 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)I")
    public static final int method543(int arg0, int arg1, boolean arg2) {
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        field1638++;
        if (!arg2) {
            field1640 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lva;")
    public static final class147 method544(int arg0, int arg1) {
        field1637++;
        class147 var2 = (class147) class4.field58.method764((long) arg1, 24182);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class61.field1214.method267((byte) -124, arg1, arg0);
        class147 var4 = new class147();
        if (var3 != null) {
            var4.method1134(new class91(var3), -123);
        }
        class4.field58.method765((long) arg1, var4, (byte) -85);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lje;")
    public static final class67 method545(int arg0, int arg1, int arg2) {
        field1630++;
        if (arg0 != 30439) {
            method544(90, -24);
        }
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return class82.field1819;
        } else if (var3 < -6) {
            return class83.field1840;
        } else if (var3 < -3) {
            return class4.field60;
        } else if (var3 < 0) {
            return class60.field1199;
        } else if (var3 > 9) {
            return class103.field2319;
        } else if (var3 > 6) {
            return class86.field1897;
        } else if (var3 > 3) {
            return class91.field1989;
        } else if (var3 > 0) {
            return class15.field271;
        } else {
            return class63.field1243;
        }
    }
}

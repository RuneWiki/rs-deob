import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class252 {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4055 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
    public static int[] field4053 = new int[32];

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lck;")
    public static class119 field4056 = class298.method1987((byte) 4, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lck;")
    public static class119 field4050 = class298.method1987((byte) 65, "m");

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lml;")
    public static class134 field4049;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lva;")
    public static class36 field4059;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[Lbe;")
    public static class81[] field4057;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lfj;BLck;)I", line = 5)
    public static final int method1621(class3 arg0, byte arg1, class119 arg2) {
        field4052++;
        if (arg1 < 84) {
            return 3;
        } else {
            int var3 = arg0.field44;
            arg0.method69(arg2.field1825, -20506);
            arg0.field44 += class210.field3358.method651(arg2.field1825, arg0.field101, 0, 255, arg2.field1838, arg0.field44);
            return arg0.field44 - var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Lng;", line = 27)
    public static final class68 method1622(int arg0, byte arg1) {
        field4051++;
        class68 var2 = (class68) class216.field3482.method487(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class53.field856.method261(-1, class70.method505(1260589739, arg0), class244.method1590(arg0, 1023));
        if (arg1 > -107) {
            return (class68) null;
        }
        class68 var4 = new class68();
        if (var3 != null) {
            var4.method498(new class3(var3), 26963);
        }
        class216.field3482.method488(var4, (byte) 84, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lvb;ZI)V", line = 54)
    public static final void method1623(class288 arg0, boolean arg1, int arg2) {
        int var3 = (int) arg0.field1218;
        int var4 = arg0.field4739;
        arg0.method552((byte) 12);
        field4058++;
        if (arg2 != 8848) {
            method1626(-54);
        }
        if (arg1) {
            class108.method699((byte) 103, var4);
        }
        class30.method227(-121984400, var4);
        class134 var5 = class20.method153(1, var3);
        if (var5 != null) {
            class26.method194(var5, arg2 ^ 0xFFFFDD04);
        }
        class104.field1612 = false;
        class272.field4474 = 0;
        class86.method577(class104.field1599, class257.field4128, class59.field949, (byte) 43, class67.field1035);
        if (class119.field1822 != -1) {
            class249.method1614(arg2 ^ 0xFFFFFAD6, 1, class119.field1822);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lfj;I)V", line = 87)
    public final void method1624(class3 arg0, int arg1) {
        int var3 = -30 / ((41 - arg1) / 59);
        field4060++;
        while (true) {
            int var4 = arg0.method64((byte) -84);
            if (var4 == 0) {
                return;
            }
            this.method1625((byte) -82, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLfj;I)V", line = 107)
    private final void method1625(byte arg0, class3 arg1, int arg2) {
        int var4 = -105 % ((arg0 + 2) / 62);
        field4054++;
        if (arg2 == 5) {
            this.field4055 = arg1.method63((byte) 1);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 121)
    public static void method1626(int arg0) {
        field4056 = null;
        field4049 = null;
        field4053 = null;
        field4050 = null;
        field4057 = null;
        if (arg0 != -26982) {
            method1623((class288) null, true, -66);
        }
        field4059 = null;
    }
}

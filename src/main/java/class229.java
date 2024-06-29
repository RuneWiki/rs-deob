import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class class229 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lnf;")
    public static class162 field3640 = new class162(64);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILql;)Lql;")
    public abstract class230 method1576(int arg0, class230 arg1);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
    public static final void method1577(int arg0, byte arg1) {
        field3639++;
        class191.field2989.method1166((byte) 23, arg0);
        class163.field2457.method1166((byte) 23, arg0);
        class136.field2043.method1166((byte) 23, arg0);
        if (arg1 <= 90) {
            field3643 = 97;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    public static final void method1578(int arg0, boolean arg1) {
        class255.field4080 = new int[104];
        class191.field2995 = new int[104];
        class184.field2913 = new int[104];
        class138.field2077 = arg0;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        field3638++;
        class292.field4526 = new byte[var2][104][104];
        class82.field1242 = new byte[var2][104][104];
        class200.field3100 = new int[104];
        class195.field3063 = new byte[var2][104][104];
        class202.field3125 = new int[5];
        class156.field2328 = new int[var2][105][105];
        class188.field2951 = new byte[var2][104][104];
        class15.field191 = new int[104];
        class247.field3927 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static final void method1579(boolean arg0) {
        field3641++;
        class191.field2989.method1169(arg0);
        class163.field2457.method1169(true);
        class136.field2043.method1169(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method1580(byte arg0) {
        if (arg0 < -50) {
            field3640 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)V")
    public static final void method1581(int arg0, byte arg1) {
        class166.field2509.method1166((byte) 23, arg0);
        field3642++;
        class128.field1913.method1166((byte) 23, arg0);
        if (arg1 != -40) {
            method1577(-81, (byte) -1);
        }
    }
}

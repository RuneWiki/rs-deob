import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class183 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field2493 = 0;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[S")
    public static short[] field2492 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "J")
    public long field2494;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lvc;")
    public class260 field2495;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lvc;")
    public class260 field2498;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Lvc;")
    public class260 field2501;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lud;")
    public static class280 field2497;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)V", line = 9)
    public static final void method1335(byte arg0, int arg1, int arg2) {
        field2500++;
        if (arg0 <= 75) {
            method1335((byte) 54, -28, 119);
        }
        int var3 = class101.field1319 * arg1 >> 8;
        if (arg2 == -1 && !class297.field4314) {
            class232.method1653(104);
        } else if (arg2 != -1 && (class84.field1082 != arg2 || !class196.method1414(113)) && var3 != 0 && !class297.field4314) {
            class206.method1496(0, class305.field4459, 2, (byte) -127, var3, arg2, false);
        }
        class84.field1082 = arg2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([BI)[B", line = 37)
    public static final byte[] method1336(byte[] arg0, int arg1) {
        int var2 = -88 % ((arg1 - 47) / 49);
        field2503++;
        int var3 = arg0.length;
        byte[] var4 = new byte[var3];
        class87.method635(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 53)
    public static void method1337(byte arg0) {
        if (arg0 != -91) {
            field2497 = (class280) null;
        }
        field2497 = null;
        field2492 = null;
    }
}

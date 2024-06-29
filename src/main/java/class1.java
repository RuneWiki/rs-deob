import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "Ll;")
    public static class21 field1 = class28.method185(-20839, "Furnace");

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Ll;")
    public static class21 field2 = class28.method185(-20839, "Makeover Mage");

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Ll;")
    public static class21 field3 = class28.method185(-20839, "Spinning Wheel");

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "Ll;")
    public static class21 field4 = class28.method185(-20839, "General Store");

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Ll;")
    public static class21 field6 = class28.method185(-20839, "Windmill");

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Ll;")
    public static class21 field7 = class28.method185(-20839, "Loom");

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "Ll;")
    public static class21 field5 = class28.method185(-20839, "Loading ");

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(JB)V", line = 47)
    public static final void method1(long arg0, byte arg1) {
        if (arg1 <= 37) {
            method1(40L, (byte) -124);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 68)
    public static final void method2(byte arg0) {
        if (class32.field380.toLowerCase().indexOf("microsoft") == -1) {
            PixMap.field224[44] = 71;
            PixMap.field224[45] = 26;
            PixMap.field224[46] = 72;
            PixMap.field224[47] = 73;
            PixMap.field224[59] = 57;
            PixMap.field224[61] = 27;
            PixMap.field224[91] = 42;
            PixMap.field224[92] = 74;
            PixMap.field224[93] = 43;
            if (class32.field367 == null) {
                PixMap.field224[192] = 58;
                PixMap.field224[222] = 59;
            } else {
                PixMap.field224[192] = 28;
                PixMap.field224[222] = 58;
                PixMap.field224[520] = 59;
            }
        } else {
            PixMap.field224[186] = 57;
            PixMap.field224[187] = 27;
            PixMap.field224[188] = 71;
            PixMap.field224[189] = 26;
            PixMap.field224[190] = 72;
            PixMap.field224[191] = 73;
            PixMap.field224[192] = 58;
            PixMap.field224[219] = 42;
            PixMap.field224[220] = 74;
            PixMap.field224[221] = 43;
            PixMap.field224[222] = 59;
            PixMap.field224[223] = 28;
        }
        int var1 = -28 % ((arg0 + 36) / 53);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 122)
    public static void method3(int arg0) {
        field4 = null;
        field7 = null;
        field6 = null;
        field5 = null;
        field3 = null;
        if (arg0 != 221) {
            method2((byte) 4);
        }
        field2 = null;
        field1 = null;
    }
}

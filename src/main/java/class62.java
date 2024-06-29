import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class62 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
    public static int[] field936 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    public static int[] field943 = new int[1024];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lcm;")
    public static class368 field939;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z")
    public static final boolean method548(boolean arg0) {
        field935++;
        return arg0 ? class280.field4130 : false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method549(int arg0) {
        if (class364.field5386.toLowerCase().indexOf("microsoft") == -1) {
            class245.field3445[61] = 27;
            class245.field3445[91] = 42;
            class245.field3445[47] = 73;
            class245.field3445[44] = 71;
            class245.field3445[59] = 57;
            class245.field3445[45] = 26;
            class245.field3445[93] = 43;
            if (class364.field5394 == null) {
                class245.field3445[222] = 59;
                class245.field3445[192] = 58;
            } else {
                class245.field3445[520] = 59;
                class245.field3445[222] = 58;
                class245.field3445[192] = 28;
            }
            class245.field3445[46] = 72;
            class245.field3445[92] = 74;
        } else {
            class245.field3445[191] = 73;
            class245.field3445[189] = 26;
            class245.field3445[219] = 42;
            class245.field3445[187] = 27;
            class245.field3445[222] = 59;
            class245.field3445[186] = 57;
            class245.field3445[192] = 58;
            class245.field3445[190] = 72;
            class245.field3445[188] = 71;
            class245.field3445[223] = 28;
            class245.field3445[221] = 43;
            class245.field3445[220] = 74;
        }
        if (arg0 != 25871) {
            field943 = null;
        }
        field941++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method550(int arg0, int arg1) {
        class222.field3067 = -1;
        field944++;
        class85.field1184 = arg0;
        class222.field3067 = arg1;
        class338.method2198((byte) 121);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method551(int arg0) {
        if (arg0 != -7324) {
            return;
        }
        field942++;
        if (class14.field226 <= 0) {
            class33.field526 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class222.field3064.length; var2++) {
            if (class222.field3064[var2].startsWith("--> ")) {
                var1++;
                if (class14.field226 == var1) {
                    class33.field526 = class222.field3064[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)I")
    public static final int method552(int arg0, int arg1, byte arg2) {
        if (arg2 != -39) {
            field939 = null;
        }
        field937++;
        int var3 = class415.method2620(arg1 - 1, arg0 + -1, false) - (-class415.method2620(arg1 + 1, arg0 - 1, false) - class415.method2620(arg1 - 1, arg0 + 1, false) - class415.method2620(arg1 + 1, arg0 + 1, false));
        int var4 = class415.method2620(arg1 - 1, arg0, false) + class415.method2620(arg1 + 1, arg0, false) - (-class415.method2620(arg1, arg0 - 1, false) - class415.method2620(arg1, arg0 + 1, false));
        int var5 = class415.method2620(arg1, arg0, false);
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method553(byte arg0) {
        field943 = null;
        field939 = null;
        field936 = null;
        int var1 = 49 / ((arg0 + 57) / 60);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIB)V")
    public static final void method554(int arg0, int arg1, byte arg2) {
        field938++;
        class440 var3 = class186.method1241(arg1, 12, (byte) 56);
        var3.method2756(-1369656528);
        if (arg2 != -32) {
            method548(false);
        }
        var3.field6375 = arg0;
    }
}

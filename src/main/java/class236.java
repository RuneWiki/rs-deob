import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class236 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field4211 = 0;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lhh;")
    public static class163 field4215 = class137.method1065("Konfig geladen)3", 17);

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
    public static int[] field4216 = new int[100];

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "[J")
    public static long[] field4214 = new long[1000];

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method1638(byte arg0) {
        field4216 = null;
        field4215 = null;
        field4214 = null;
        if (arg0 != -17) {
            method1640(82);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4210++;
        if (arg1 >= class127.field2465 && arg3 <= class252.field4407 && arg0 >= class182.field3344 && class201.field3593 >= arg2) {
            if (arg6 == 1) {
                class204.method1454((byte) -76, arg3, arg0, arg1, arg4, arg2);
            } else {
                class69.method487(arg3, arg6, arg1, arg4, arg0, -32327, arg2);
            }
        } else if (arg6 == 1) {
            class22.method147(arg4, arg0, 21, arg1, arg2, arg3);
        } else {
            class238.method1646((byte) -104, arg0, arg2, arg1, arg4, arg3, arg6);
        }
        if (arg5 != 10873) {
            method1639(70, 118, -8, 16, -24, -57, -74);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1640(int arg0) {
        if (class166.field3067.toLowerCase().indexOf("microsoft") == -1) {
            class32.field497[93] = 43;
            class32.field497[92] = 74;
            class32.field497[47] = 73;
            class32.field497[44] = 71;
            class32.field497[61] = 27;
            if (class166.field3064 == null) {
                class32.field497[192] = 58;
                class32.field497[222] = 59;
            } else {
                class32.field497[192] = 28;
                class32.field497[520] = 59;
                class32.field497[222] = 58;
            }
            class32.field497[46] = 72;
            class32.field497[45] = 26;
            class32.field497[91] = 42;
            class32.field497[59] = 57;
        } else {
            class32.field497[221] = 43;
            class32.field497[220] = 74;
            class32.field497[219] = 42;
            class32.field497[187] = 27;
            class32.field497[191] = 73;
            class32.field497[190] = 72;
            class32.field497[223] = 28;
            class32.field497[186] = 57;
            class32.field497[188] = 71;
            class32.field497[189] = 26;
            class32.field497[192] = 58;
            class32.field497[222] = 59;
        }
        field4212++;
        if (arg0 != 1) {
            field4216 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static final void method1641(int arg0) {
        if (arg0 != 26) {
            field4213 = 53;
        }
        class48.method345(false);
        System.gc();
        field4209++;
        class174.method1292(25, true);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class449 implements class292 {

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field6579 = 0;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[I")
    public static int[] field6574 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lps;")
    public static class394 field6580 = null;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 9)
    public static void method2818(int arg0) {
        field6574 = null;
        if (arg0 < -6) {
            field6580 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V", line = 23)
    public static final void method2819(int arg0, int arg1) {
        if (arg1 > -20) {
            field6579 = 81;
        }
        field6582++;
        class57.field782 = -1;
        class159.field2147 = 0;
        class129.field1785 = null;
        class178.field2358 = false;
        class159.field2146 = -1;
        class9.field151 = arg0;
        class375.field5452 = 1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([IIJI)Ljava/lang/String;", line = 47)
    public final String method1983(int[] arg0, int arg1, long arg2, int arg3) {
        if (arg1 != -24810) {
            return null;
        }
        field6576++;
        if (arg3 == 0) {
            class277 var6 = class418.method2675((byte) -125, arg0[0]);
            return var6.method1912(17, (int) arg2);
        } else if (arg3 == 1 || arg3 == 10) {
            class83 var7 = class9.method74((int) arg2, (byte) -58);
            return var7.field1193;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class418.method2675((byte) 118, arg0[0]).method1912(23, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V", line = 79)
    public static final void method2820(boolean arg0) {
        if (arg0) {
            field6581++;
            class138.field1902 = new class47();
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V", line = 99)
    public static final void method2821(int arg0, byte arg1) {
        if (arg1 == 40) {
            field6578++;
            class55.field735.method1142((byte) -90, arg0);
        }
    }
}

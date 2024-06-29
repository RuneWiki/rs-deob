import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class169 extends class59 {

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field2603 = 0;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2599 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field2606 = new String[100];

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2609 = "Loaded interfaces";

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "Lfe;")
    public static class231 field2608;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "Lvl;")
    public static class73 field2600;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Lvl;")
    public static class73 field2602;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "[I")
    public static int[] field2601;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
    public static void method1153(boolean arg0) {
        field2599 = null;
        field2608 = null;
        if (arg0) {
            method1155((String) null, -71, (String) null, -29, (String) null);
        }
        field2606 = null;
        field2601 = null;
        field2609 = null;
        field2602 = null;
        field2600 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLim;)V")
    public final void method1154(byte arg0, class170 arg1) {
        while (true) {
            int var3 = arg1.method1218(-112);
            if (var3 == 0) {
                if (arg0 > -28) {
                    this.method1154((byte) 103, (class170) null);
                }
                field2605++;
                return;
            }
            this.method1156(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1155(String arg0, int arg1, String arg2, int arg3, String arg4) {
        field2598++;
        if (arg1 != -3) {
            method1155((String) null, -3, (String) null, 16, (String) null);
        }
        class102.method686(arg4, arg2, (byte) -117, arg0, -1, arg3);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lim;IZ)V")
    private final void method1156(class170 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1153(false);
        }
        field2604++;
        if (arg1 == 2) {
            this.field2603 = arg0.method1186((byte) -69);
        }
    }
}

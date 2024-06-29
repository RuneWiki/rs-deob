import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class202 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lbw;")
    public static class20 field2840;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
    public static int[] field2842;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[[I")
    public static int[][] field2843;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ)Z", line = 5)
    public static final boolean method1407(int arg0, int arg1, boolean arg2) {
        field2839++;
        return arg2 ? false : (class277.method1755(arg0, true, arg1) | class310.method1996(arg0, 36, arg1) | class300.method1935(arg1, arg0, 101)) & class6.method58(false, arg0, arg1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1408(boolean arg0) {
        field2843 = null;
        field2840 = null;
        field2842 = null;
        if (!arg0) {
            field2843 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 30)
    public static final void method1409(String arg0, int arg1) {
        field2838++;
        if (class56.field758 == null) {
            return;
        }
        class179.method1287(false, class185.field2611);
        class487.field7137++;
        class75.field1006.method625(class142.method951(arg1 ^ 0x47, arg0), false);
        if (arg1 != -1) {
            method1407(-63, 22, true);
        }
        class75.field1006.method603(-76, arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V", line = 53)
    public static final void method1410(int arg0, byte arg1) {
        field2837++;
        class276.field3835 = -1;
        class501.field7487 = arg0;
        class276.field3835 = -1;
        class504.method3016((byte) 122);
        int var2 = -6 / ((arg1 + 67) / 36);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method1411(int arg0, int arg1, int arg2) {
        field2841++;
        if (arg1 >= -101) {
            method1410(4, (byte) 97);
        }
        return (arg0 & 0x400) != 0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class73 extends class359 {

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field821 = " is already on your friend list.";

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Z")
    public static boolean field820 = false;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(CB)Z", line = 4)
    public static final boolean method425(char arg0, byte arg1) {
        field818++;
        if (arg1 != -80) {
            return true;
        } else if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;)V", line = 26)
    public static final void method426(byte arg0, String arg1) {
        field822++;
        if (arg1.equals("")) {
            return;
        }
        class169.field2360.method809(252, -28022);
        class351.field5120++;
        if (arg0 != 77) {
            field821 = null;
        }
        class169.field2360.method1396(21375, class233.method1488(-19285, arg1));
        class169.field2360.method1359((byte) 0, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 46)
    public static void method427(boolean arg0) {
        if (arg0) {
            field821 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V", line = 67)
    public static final void method428(int arg0, byte arg1) {
        if (arg1 != -13) {
            method425((char) 65504, (byte) 8);
        }
        class388.field5690.method2054(82, arg0);
        field819++;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class58 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field866 = -1;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field867 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[S")
    public static short[] field870 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lir;")
    public static class185 field869;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 19)
    public static void method422(byte arg0) {
        field867 = null;
        field869 = null;
        field870 = null;
        if (arg0 < 4) {
            field866 = 126;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 39)
    public static final void method423(int arg0, int arg1) {
        class51 var2 = class431.field6263;
        synchronized (class431.field6263) {
            class431.field6263.method379(arg0, false);
        }
        field868++;
        class51 var3 = class370.field5462;
        synchronized (class370.field5462) {
            class370.field5462.method379(arg0, false);
        }
        if (arg1 != -23892) {
            method423(80, 4);
        }
    }
}

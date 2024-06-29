import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class160 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lmb;")
    public static class132 field2910 = class166.method1092("Null", 123);

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
    public static volatile boolean field2909 = true;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lmb;")
    public static class132 field2905 = class166.method1092("Lade Titelbild )2 ", 118);

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Lmb;")
    public static class132 field2911 = class166.method1092("Unerwartete Antwort vom Anmelde)2Server)3", 122);

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lmb;")
    public static class132 field2908 = class166.method1092("hint_mapedge", 118);

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lmb;")
    public static class132 field2914 = null;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method1036(byte arg0) {
        field2911 = null;
        field2908 = null;
        field2910 = null;
        field2905 = null;
        if (arg0 > 71) {
            field2914 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V")
    public static final void method1037(int arg0, boolean arg1) {
        field2903++;
        class10.method50((byte) -24);
        class236.field4286++;
        if (arg0 > class236.field4286 && !arg1) {
            return;
        }
        class236.field4286 = 0;
        if (class48.field820 || class166.field3027 == null) {
            return;
        }
        class64.field1054.method660(34, 3);
        class203.field3729++;
        try {
            class166.field3027.method419(-81, class64.field1054.field2157, 0, class64.field1054.field2133);
            class64.field1054.field2133 = 0;
        } catch (IOException var2) {
            class48.field820 = true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
    public static final int method1038(int arg0) {
        if (arg0 > -78) {
            field2912 = -7;
        }
        field2904++;
        return class1.field11;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class39 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
    public static boolean field853 = false;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lud;")
    public static class279 field854 = class130.method1024("Ablegen", 255);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lud;")
    public static class279 field858 = class130.method1024(" )2> <col=00ffff>", 255);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Z")
    public static boolean field857 = false;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lok;")
    public static class149 field859;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lt;")
    public static class251 field860;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILud;)V", line = 19)
    public static final void method347(byte arg0, int arg1, class279 arg2) {
        class104 var3 = class293.method2085(2, arg1, false);
        int var4 = 14 / ((arg0 - 68) / 52);
        var3.method879(0);
        field856++;
        var3.field1958 = arg2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 42)
    public static final void method348(byte arg0) {
        class171.field3092 = null;
        field855++;
        if (arg0 < 112) {
            field853 = false;
        }
        class112.field2057 = null;
        class229.field3982 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 55)
    public static void method349(byte arg0) {
        field854 = null;
        field858 = null;
        if (arg0 < 54) {
            field858 = (class279) null;
        }
        field860 = null;
        field859 = null;
    }
}

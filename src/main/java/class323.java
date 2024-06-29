import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class323 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Z")
    public static boolean field5638 = false;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lwm;")
    public static class152 field5639 = class157.method1048("Zugewiesener Speicher)3", 114);

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Lwm;")
    public static class152 field5643 = class157.method1048("Hierhin drehen", 106);

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5642 = 0;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5640 = 0;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "F")
    public static float field5646;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "[I")
    public static int[] field5644;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[[B")
    public static byte[][] field5637;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lah;Lah;I)V", line = 16)
    public static final void method2275(class205 arg0, class205 arg1, int arg2) {
        field5636++;
        class303.field5220 = class46.method317(class176.field2840, 0, arg1, -1, arg0);
        if (class217.field3516) {
            class149.field2316 = class254.method1767(0, class176.field2840, (byte) -108, arg1, arg0);
        } else {
            class149.field2316 = (class158) class303.field5220;
        }
        class305.field5238 = class46.method317(class80.field1118, 0, arg1, -1, arg0);
        if (arg2 > -114) {
            field5643 = (class152) null;
        }
        class316.field5485 = class46.method317(class169.field2654, 0, arg1, -1, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 51)
    public static void method2276(byte arg0) {
        field5637 = (byte[][]) null;
        field5644 = null;
        if (arg0 < -22) {
            field5639 = null;
            field5643 = null;
        }
    }
}

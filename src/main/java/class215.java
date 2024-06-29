import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class215 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Llu;")
    public static class610 field3167;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lfp;")
    public static class271 field3168;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lub;")
    public static class20 field3166;

    static {
        new class572(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field3167 = new class610(21, 7);
        field3168 = new class271(1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 4)
    public static void method1411(int arg0) {
        field3166 = null;
        field3167 = null;
        if (arg0 > -63) {
            field3165 = false;
        }
        field3168 = null;
    }
}

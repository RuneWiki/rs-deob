import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class193 extends class42 {

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "Lsg;")
    public class279 field2805;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "Z")
    public static boolean field2806 = false;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "[I")
    public static int[] field2808 = new int[13];

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "Lkj;")
    public static class405 field2804 = new class405("", 12);

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "Lbd;")
    public static class44 field2809 = new class44("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "[Luh;")
    public static class115[] field2810;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 6)
    public static void method1316(byte arg0) {
        field2809 = null;
        field2808 = null;
        if (arg0 == 14) {
            field2810 = null;
            field2804 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lsg;)V", line = 19)
    public class193(class279 arg0) {
        this.field2805 = arg0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method1317(boolean arg0) {
        if (arg0) {
            class461.field6675 = class277.field4137;
            class146.field2262 = class477.field6942;
        } else {
            class461.field6675 = class47.field898;
            class146.field2262 = class393.field5594;
        }
        class251.field3740 = class461.field6675.length;
    }
}

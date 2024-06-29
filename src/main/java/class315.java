import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class315 extends class42 {

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "J")
    public long field4687;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "Lbd;")
    public static class44 field4689 = new class44("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4692 = "";

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "[F")
    public static float[] field4690 = new float[4];

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "Lqv;")
    public static class316 field4691 = new class316(29, -1);

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V", line = 6)
    public class315() {
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(J)V", line = 8)
    public class315(long arg0) {
        this.field4687 = arg0;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 21)
    public static void method1995(byte arg0) {
        field4690 = null;
        if (arg0 >= -35) {
            method1995((byte) -58);
        }
        field4691 = null;
        field4692 = null;
        field4689 = null;
    }
}

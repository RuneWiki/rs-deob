import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class192 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lbi;")
    public static class104 field2846 = new class104(103, 12);

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "F")
    public static float field2844;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lpc;")
    public class192 field2841;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ltm;")
    public class423 field2845;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2842;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lpo;")
    public static final class258 method1200(int arg0) {
        if (arg0 >= -13) {
            field2844 = 0.05367799F;
        }
        field2843++;
        return class194.field2863;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method1201(byte arg0) {
        field2846 = null;
        if (arg0 != 19) {
            method1200(4);
        }
        field2842 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final void method1202(int arg0) {
        field2848++;
        if (arg0 != -26392) {
            method1200(110);
        }
        if (class427.field6458 >= 500) {
            return;
        }
        this.field2845 = null;
        this.field2849 = 0;
        this.field2841 = class286.field4504;
        class286.field4504 = this;
        class427.field6458++;
    }
}

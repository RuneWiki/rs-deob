import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 {

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "[S")
    public static short[] field769 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static final void method363(int arg0) {
        field768++;
        class17.field187.method2990((byte) -62);
        if (arg0 != -1) {
            method364(112);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public static void method364(int arg0) {
        if (arg0 < 3) {
            method363(-114);
        }
        field769 = null;
    }

    static {
        new class44("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }
}

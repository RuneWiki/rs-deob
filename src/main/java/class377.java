import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class377 extends class85 {

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public int field4898;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field4896 = 0;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Lhb;")
    public static class250 field4894 = new class250(14, -1);

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "Loi;")
    public static class169 field4899 = new class169("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
    public abstract boolean method1060(int arg0);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lbt;II)V")
    public static final void method2200(class88 arg0, int arg1, int arg2) {
        if (class459.field6418 != null) {
            try {
                class459.field6418.method1689(arg2 ^ 0xFFFFFF83, 0L);
                class459.field6418.method1688(arg0.field1223, arg1, 24, arg2 ^ 0xFFFFFFF8);
            } catch (Exception var3) {
            }
        }
        if (arg2 == -1) {
            field4897++;
        }
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)[Lvg;")
    public static final class55[] method2201(int arg0) {
        field4895++;
        if (arg0 != 24) {
            field4899 = null;
        }
        return new class55[] { class34.field541, class90.field1259, class287.field3664 };
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1061(byte arg0);

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V")
    public class377(int arg0) {
        this.field4898 = arg0;
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)V")
    public static void method2202(byte arg0) {
        field4899 = null;
        if (arg0 > -91) {
            method2201(-111);
        }
        field4894 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class408 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Ldv;")
    public static class566 field5785 = new class566(74, 3);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lej;")
    public static class104 field5786 = new class104("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Z")
    public static boolean field5783;

    @OriginalMember(owner = "client!bi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5782++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method2420(byte arg0) {
        field5784++;
        class143.field2208 = null;
        class210.field2962 = -1;
        if (arg0 > -91) {
            field5785 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method2421(int arg0) {
        if (arg0 < -43) {
            field5786 = null;
            field5785 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
    public class408(int arg0) {
        this.field5787 = arg0;
    }
}

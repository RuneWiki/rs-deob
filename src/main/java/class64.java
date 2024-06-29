import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class64 {

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field820 = 0;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lhga;")
    public static class158 field822 = new class158(87, 8);

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "Llca;")
    public static class598 field825 = null;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method697(byte arg0) {
        if (arg0 >= -5) {
            return true;
        } else {
            field823++;
            return class335.field5475 == this | class432.field6571 == this;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 27)
    public static final String method698(boolean arg0) {
        field824++;
        String var1 = "www";
        if (!arg0) {
            return null;
        }
        if (class660.field9192 == class299.field4674) {
            var1 = "www-wtrc";
        } else if (class660.field9192 == class354.field5658) {
            var1 = "www-wtqa";
        } else if (class660.field9192 == class133.field2182) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class98.field1592 != null) {
            var2 = "/p=" + class98.field1592;
        }
        return "http://" + var1 + "." + class99.field1647.field2741 + ".com/l=" + class135.field2206 + "/a=" + class611.field8698 + var2 + "/";
    }

    @OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;", line = 57)
    public final String toString() {
        field821++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V", line = 76)
    public static void method699(byte arg0) {
        if (arg0 == 15) {
            field822 = null;
        }
    }
}

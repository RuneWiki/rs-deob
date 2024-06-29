import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class214 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lvp;")
    public static class123 field3084 = new class123(3, 8);

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lko;")
    public static class348 field3087 = new class348();

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lmg;")
    public static class100 field3086;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Lqa;")
    public static class162 field3089;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "[[B")
    public static byte[][] field3090;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 11)
    public static void method1422(byte arg0) {
        field3084 = null;
        if (arg0 <= -9) {
            field3086 = null;
            field3090 = null;
            field3089 = null;
            field3087 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)[Lnk;", line = 28)
    public static final class500[] method1423(int arg0) {
        if (arg0 > -9) {
            return null;
        } else {
            field3085++;
            return new class500[] { class502.field7371, class246.field3571, class398.field5840, class472.field6945, class461.field6804, class152.field2334 };
        }
    }
}

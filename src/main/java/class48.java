import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field992 = 0;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lpe;")
    public static class109 field991 = class141.method1120(" )2> ", 0);

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lpe;")
    public static class109 field994 = class141.method1120("huffman", 0);

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lpe;")
    public static class109 field995 = class141.method1120("und loggen sich dann erneut ein)3", 0);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lpe;")
    public static class109 field988 = class141.method1120("<col=ffffff>", 0);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field989 = -1;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Ltc;")
    public static class135 field997 = new class135();

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field999 = 255;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field993;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method418(int arg0, int arg1) {
        field990++;
        class145 var2 = (class145) class25.field613.method505((byte) -46, (long) arg1);
        if (var2 != null) {
            var2.method101((byte) 97);
            if (arg0 <= 110) {
                field991 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method419(byte arg0) {
        field995 = null;
        field991 = null;
        field993 = null;
        field994 = null;
        field997 = null;
        field988 = null;
        if (arg0 > -114) {
            field991 = null;
        }
    }
}

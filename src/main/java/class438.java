import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class438 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field6408;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
    public static boolean field6406 = false;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6407 = 0;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6409 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lwt;")
    public static class194 field6410 = new class194("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field6411 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lcp;")
    public static class489 field6412 = new class489(0, -1);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!ph", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6405++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method2572(byte arg0) {
        field6409 = null;
        if (arg0 >= -113) {
            field6412 = null;
        }
        field6410 = null;
        field6412 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class438(String arg0, int arg1) {
        this.field6408 = arg1;
    }
}

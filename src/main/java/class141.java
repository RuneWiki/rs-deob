import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class141 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lhl;")
    public static class139 field2030 = new class139(64);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field2032;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Z")
    public static boolean field2034;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public static final void method952(boolean arg0) {
        if (!arg0) {
            field2032 = null;
        }
        field2035++;
        class61.field989.method944(65535);
        class195.field2945.method944(65535);
        class92.field1384.method944(65535);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
    public static void method953(boolean arg0) {
        if (!arg0) {
            field2034 = true;
        }
        field2032 = null;
        field2030 = null;
    }
}

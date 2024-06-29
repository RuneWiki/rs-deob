import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class381 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lcu;")
    public static class145 field5203 = new class145(36, 3);

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field5208 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5205;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Lcr;")
    public static final class403 method2261(int arg0, int arg1, int arg2) {
        field5204++;
        class403 var3 = class213.method1345((byte) 60, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field5420 == null || var3.field5420.length <= arg2) {
            return null;
        } else if (arg0 == -10673) {
            return var3.field5420[arg2];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method2262(int arg0) {
        if (arg0 <= 29) {
            field5206 = 25;
        }
        field5203 = null;
        field5205 = null;
    }
}

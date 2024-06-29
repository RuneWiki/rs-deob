import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class453 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field6298 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field6299;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field6300;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field6301;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field6295;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILaj;Ldr;IZIZ)V")
    public static final void method2692(int arg0, class333 arg1, class751 arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (!arg4) {
            method2692(-70, null, null, -57, false, 1, false);
        }
        field6302++;
        class543.method3091(arg6, arg3, arg5, arg0, arg1, (byte) -65);
        class633.field8849 = arg2;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method2693(byte arg0) {
        if (arg0 != 69) {
            field6296 = 74;
        }
        field6295 = null;
    }
}

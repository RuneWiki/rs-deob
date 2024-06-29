import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class434 extends class375 {

    @OriginalMember(owner = "client!maa", name = "w", descriptor = "Lii;")
    public class513 field6345;

    @OriginalMember(owner = "client!maa", name = "u", descriptor = "[I")
    public static int[] field6343 = new int[14];

    @OriginalMember(owner = "client!maa", name = "y", descriptor = "Z")
    public static boolean field6347 = true;

    @OriginalMember(owner = "client!maa", name = "x", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!maa", name = "v", descriptor = "Ln;")
    public static class17 field6344;

    @OriginalMember(owner = "client!maa", name = "t", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6342;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLvg;)V")
    public static final void method2582(byte arg0, class49 arg1) {
        if (arg1.field980 == 5 && arg1.field1023 != -1) {
            class200.method1329(class282.field4228, (byte) 7, arg1);
        }
        field6346++;
        if (arg0 != 14) {
            method2583((byte) 107);
        }
    }

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "(B)V")
    public static void method2583(byte arg0) {
        field6343 = null;
        if (arg0 != -47) {
            method2583((byte) 79);
        }
        field6342 = null;
        field6344 = null;
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lii;)V")
    public class434(class513 arg0) {
        this.field6345 = arg0;
    }
}

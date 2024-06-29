import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class234 {

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "Ltq;")
    public static class572 field2982 = new class572(8);

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Z")
    public static boolean field2983 = false;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "[I")
    public static int[] field2985 = new int[8];

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "Lvj;")
    public static class402 field2984 = new class402(2);

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2986 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)I")
    public static final int method1358(int arg0, int arg1) {
        if (arg1 != -25998) {
            field2984 = null;
        }
        field2981++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public static void method1359(int arg0) {
        field2984 = null;
        if (arg0 != 2) {
            method1359(60);
        }
        field2986 = null;
        field2982 = null;
        field2985 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lfw;I)Lfw;")
    public abstract class53 method1360(class53 arg0, int arg1);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lke;")
    public static final class545 method1361(Throwable arg0, String arg1) {
        field2980++;
        class545 var2;
        if (arg0 instanceof class545) {
            var2 = (class545) arg0;
            var2.field7804 = var2.field7804 + ' ' + arg1;
        } else {
            var2 = new class545(arg0, arg1);
        }
        return var2;
    }
}

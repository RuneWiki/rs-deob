import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class235 extends class326 {

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3733 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "[[B")
    public static byte[][] field3734 = new byte[1000][];

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3731;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 13)
    public static void method1622(int arg0) {
        field3731 = null;
        int var1 = -52 % ((arg0 - 52) / 61);
        field3733 = null;
        field3734 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I", line = 31)
    public static int method1623(int arg0, int arg1) {
        return arg0 & arg1;
    }
}

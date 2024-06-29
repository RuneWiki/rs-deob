import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class349 extends class71 {

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "Lkr;")
    public static class602 field4959 = new class602(38, 7);

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public static int field4961 = 0;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public int field4954;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "Z")
    public static boolean field4960;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "[I")
    public int[] field4956;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "[Lfd;")
    public static class298[] field4955;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIBLjava/awt/Canvas;)V")
    public abstract void method585(int arg0, int arg1, byte arg2, Canvas arg3);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
    public static void method2229(boolean arg0) {
        field4959 = null;
        field4955 = null;
        if (!arg0) {
            field4959 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
    public abstract void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Graphics arg6, int arg7);
}

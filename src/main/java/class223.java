import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public abstract class class223 extends class656 {

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "Lhda;")
    public static class752 field3164 = new class752(38, 2);

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
    public int field3166;

    @OriginalMember(owner = "client!rha", name = "n", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!rha", name = "m", descriptor = "Loga;")
    public static class477 field3167;

    @OriginalMember(owner = "client!rha", name = "k", descriptor = "[I")
    public int[] field3165;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public abstract void method245(Canvas arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZIIIIILjava/awt/Graphics;)V")
    public abstract void method244(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7);

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIB)V")
    public static final void method1427(int arg0, int arg1, byte arg2) {
        if (arg2 == 71) {
            class26.method246(arg1, arg0, arg2 - 69);
            field3168++;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
    public static void method1428(int arg0) {
        field3167 = null;
        field3164 = null;
        if (arg0 != 2) {
            method1427(-110, 58, (byte) 61);
        }
    }
}

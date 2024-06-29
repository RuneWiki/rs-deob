import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class558 extends class544 {

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Lrg;")
    public static class548 field8220 = new class548(80, -1);

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
    public static int[] field8222 = new int[8];

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "F")
    public static float field8223 = 0.0F;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field8218;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public int field8219;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[I")
    public int[] field8221;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public abstract void method227(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method226(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method3268(int arg0) {
        field8220 = null;
        field8222 = null;
        if (arg0 != 0) {
            method3268(-13);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)Z")
    public static final boolean method3269(int arg0, int arg1, int arg2) {
        if (arg0 <= 57) {
            return false;
        } else {
            field8217++;
            return (arg1 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public abstract void method229(boolean arg0, Canvas arg1);
}

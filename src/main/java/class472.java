import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class472 extends class337 {

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "J")
    public static long field6954 = -1L;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public int field6952;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field6953;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
    public int[] field6950;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public abstract void method964(byte arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public abstract void method963(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public abstract void method960(Canvas arg0, boolean arg1);
}

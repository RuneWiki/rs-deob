import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class class256 extends class337 {

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "Luw;")
    public static class208 field3470 = new class208(21, -1);

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "Luw;")
    public static class208 field3473 = new class208(10, -1);

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3475 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "[I")
    public int[] field3467;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "[[B")
    public static byte[][] field3474;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILjava/awt/Graphics;IIIII)V")
    public abstract void method1647(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public abstract void method1648(int arg0, int arg1, int arg2, Canvas arg3);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public static void method1649(int arg0) {
        field3470 = null;
        field3475 = null;
        if (arg0 < -20) {
            field3474 = null;
            field3473 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
    public static final boolean method1650(int arg0, int arg1, int arg2) {
        field3471++;
        if (arg0 != 262144) {
            field3475 = null;
        }
        return (arg2 & 0x40000) != 0 | class209.method1403(arg1, (byte) -98, arg2) || class336.method1940(arg2, arg0 ^ 0x42000, arg1);
    }
}

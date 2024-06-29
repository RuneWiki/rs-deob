import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class335 extends class66 {

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lnaa;")
    public static class64 field5475 = new class64();

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Z")
    public static volatile boolean field5479 = false;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Lhga;")
    public static class158 field5478 = new class158(35, 0);

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lvg;")
    public static class49 field5482 = new class49(4);

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Lhga;")
    public static class158 field5483 = new class158(113, -1);

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public int field5480;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "[I")
    public int[] field5477;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method1197(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method2315(int arg0) {
        if (arg0 < 100) {
            method2315(67);
        }
        field5478 = null;
        field5483 = null;
        field5482 = null;
        field5475 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public abstract void method1191(Graphics arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method1192(Canvas arg0, int arg1);
}

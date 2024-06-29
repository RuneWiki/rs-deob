import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class30 extends class659 {

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Z")
    public volatile boolean field295 = true;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Z")
    public static boolean field301 = false;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lmw;")
    public static class517 field296 = new class517(86, -1);

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Z")
    public boolean field297;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
    public boolean field298;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Luq;IBLd;ILjava/awt/Canvas;)Lha;", line = 3)
    public static final class66 method169(class172 arg0, int arg1, byte arg2, class161 arg3, int arg4, Canvas arg5) {
        field294++;
        int var6 = -59 / ((-arg2 - 58) / 35);
        int var7 = 0;
        int var8 = 0;
        if (arg5 != null) {
            Dimension var9 = arg5.getSize();
            var7 = var9.width;
            var8 = var9.height;
        }
        return class66.method522(-1, arg5, var8, arg1, arg4, arg0, var7, arg3);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 34)
    public static void method172(boolean arg0) {
        field296 = null;
        if (!arg0) {
            field293 = 35;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 56)
    public static final void method173(int arg0) {
        field300++;
        class685.field9171.method509(class183.field2406);
        if (arg0 == 21072) {
            class685.field9171.method436(class715.field9756, class163.field2174, class175.field2319, class434.field6261);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
    public abstract int method170(int arg0);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)[B")
    public abstract byte[] method171(byte arg0);
}

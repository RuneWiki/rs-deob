import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public abstract class class239 extends class333 {

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field2965 = -2;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "Lwp;")
    public static class452 field2969 = null;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "Lsea;")
    public static class319 field2967 = new class319();

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "[I")
    public int[] field2968;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1425(boolean arg0) {
        field2967 = null;
        if (arg0) {
            field2969 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public abstract void method1366(int arg0, Graphics arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method1369(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public abstract void method1368(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5);
}

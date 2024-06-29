import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class562 extends class389 {

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "Lpia;")
    public static class94 field8007 = new class94(36, 0);

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lwm;")
    public class562 field8004;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "Lwm;")
    public class562 field8006;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "[I")
    public static int[] field8003;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V", line = 3)
    public static final void method3276(int arg0) {
        field8005++;
        class731.method4077();
        if (arg0 <= 37) {
            method3277(-80, false, 76, null, null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZILd;Ljava/awt/Canvas;)Lha;", line = 15)
    public static final class58 method3277(int arg0, boolean arg1, int arg2, class150 arg3, Canvas arg4) {
        field8008++;
        if (arg1) {
            field8003 = null;
        }
        return new class692(arg4, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V", line = 28)
    public static void method3278(boolean arg0) {
        field8007 = null;
        field8003 = null;
        if (arg0) {
            method3277(62, true, -18, null, null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 44)
    public final void method3279(byte arg0) {
        if (arg0 <= 17) {
            this.field8006 = null;
        }
        field8002++;
        if (this.field8006 != null) {
            this.field8006.field8004 = this.field8004;
            this.field8004.field8006 = this.field8006;
            this.field8004 = null;
            this.field8006 = null;
        }
    }
}

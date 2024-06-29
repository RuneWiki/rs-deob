import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class249 extends class631 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[I")
    public static int[] field3355 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[Lhba;")
    public static class90[] field3357 = new class90[8];

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lpq;")
    public static class159 field3348;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lmca;")
    public static class500 field3352;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3351;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[Ld;")
    public static class176[] field3345;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Z", line = 12)
    public final boolean method135(int arg0) {
        field3360++;
        if (arg0 != 0) {
            this.method133(null, -65, null, -81, -24, 23, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ldga;I)Lhp;", line = 25)
    public static final class448 method1553(class138 arg0, int arg1) {
        field3344++;
        int var2 = arg0.method922((byte) -123);
        if (arg1 != 44) {
            field3345 = null;
        }
        return new class448(var2);
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V", line = 39)
    public static void method1554(int arg0) {
        field3355 = null;
        field3357 = null;
        field3351 = null;
        field3348 = null;
        field3345 = null;
        if (arg0 < 32) {
            field3355 = null;
        }
        field3352 = null;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V", line = 55)
    public final void method127(int arg0) {
        if (arg0 < 118) {
            this.method127(-48);
        }
        field3354++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V", line = 67)
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3349++;
        if (arg4 != -8763) {
            method1554(-102);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIII)V", line = 84)
    public class249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3343 = arg0;
        this.field3356 = arg6;
        this.field3350 = arg2;
        this.field3346 = arg4;
        this.field3358 = arg1;
        this.field3359 = arg5;
        this.field3347 = arg3;
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
    public abstract int method522(int arg0);
}

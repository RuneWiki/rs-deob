import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public abstract class class333 {

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "Lhda;")
    public static class752 field4732 = new class752(81, 6);

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public static int field4736 = 1;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "Ljava/applet/Applet;")
    public static Applet field4731;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)V", line = 8)
    public static void method2003(int arg0) {
        if (arg0 <= -53) {
            field4731 = null;
            field4732 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lrda;IIII)Lqd;", line = 33)
    public static final class452 method2004(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4735++;
        if (arg1 < 28) {
            field4734 = -79;
        }
        if (!arg0.field9062 && (!class538.method2993(arg4, -31218) || !class538.method2993(arg3, -31218))) {
            return arg0.field8986 ? new class452(arg0, 34037, arg2, arg4, arg3) : new class452(arg0, arg2, arg4, arg3, class737.method4119(arg4, (byte) -128), class737.method4119(arg3, (byte) -128));
        } else {
            return new class452(arg0, 3553, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "()V", line = 65)
    public static final void method2005() {
        class747.method4185(1, class225.field3201);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
    public abstract void method1713(int arg0);

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)V")
    public abstract void method1710(int arg0);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)V")
    public abstract void method1727(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)V")
    public abstract void method1705(int arg0);

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(III)V")
    public abstract void method1730(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "()Lofa;")
    public abstract class333 method1703();

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "(I)V")
    public abstract void method1700(int arg0);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III[I)V")
    public abstract void method1708(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "()V")
    public abstract void method1725();

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([I)V")
    public abstract void method1709(int[] arg0);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lofa;)V")
    public abstract void method1712(class333 arg0);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(III[I)V")
    public abstract void method1728(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "(I)V")
    public abstract void method1716(int arg0);

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "(I)V")
    public abstract void method1718(int arg0);

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(III[I)V")
    public abstract void method1723(int arg0, int arg1, int arg2, int[] arg3);
}

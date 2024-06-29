import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class334 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Lsf;")
    public static class526 field4252 = new class526("", 10);

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field4256 = 0;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "D")
    public static double field4251;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1925(int arg0) {
        if (arg0 == 9558) {
            field4252 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Canvas;Ld;III)Lha;")
    public static final class60 method1926(Canvas arg0, class153 arg1, int arg2, int arg3, int arg4) {
        field4250++;
        int var5 = 0 % ((arg4 - 42) / 41);
        return new class696(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -1) {
            return;
        }
        field4254++;
        if (class546.field7619 <= arg1 && arg1 <= class760.field10606) {
            int var5 = class720.method4025(class667.field9373, arg3, class225.field2994, 0);
            int var6 = class720.method4025(class667.field9373, arg2, class225.field2994, arg0 + 1);
            class694.method3889(var6, arg1, var5, -457000927, arg4);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)Ltw;")
    public static final class205 method1928(byte arg0) {
        field4253++;
        if (arg0 != 49) {
            method1926(null, null, -101, 9, 93);
        }
        try {
            return (class205) Class.forName("ga").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class439();
        }
    }
}

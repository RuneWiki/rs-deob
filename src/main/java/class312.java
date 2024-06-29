import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class312 extends class577 {

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field4448 = -1;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "Lde;")
    public static class556 field4449 = new class556();

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public int field4442;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public int field4444;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Lfba;")
    public class27 field4441;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljs;")
    public class349 field4445;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method1996(int arg0) {
        if (arg0 != -1) {
            method2000(80, 83, 39, 87, 22);
        }
        field4449 = null;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public static final void method1997(int arg0) {
        field4447++;
        if (class70.field838) {
            return;
        }
        class70.field838 = true;
        class571.field8063 += (-class571.field8063 - 24.0F) / 2.0F;
        if (arg0 != -342758856) {
            field4449 = null;
        }
        class532.field7692 = true;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(JII)Lgaa;")
    public static final class313 method1998(long arg0, int arg1, int arg2) {
        field4440++;
        class313 var4 = (class313) class305.field4394.method2242(arg0 | (long) arg1 << 56, arg2);
        if (var4 == null) {
            var4 = new class313(arg1, arg0);
            class305.field4394.method2241(31, var4.field8133, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public final void method1999(int arg0) {
        field4443++;
        if (arg0 != 13665) {
            field4448 = 101;
        }
        if (class689.field9593 < class161.field2562.length) {
            class161.field2562[class689.field9593++] = this;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
    public static final void method2000(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4446++;
        class313 var5 = method1998((long) arg0, 4, arg3);
        var5.method2001((byte) 78);
        var5.field4455 = arg1;
        var5.field4464 = arg2;
        var5.field4450 = arg4;
    }
}

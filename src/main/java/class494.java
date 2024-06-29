import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class494 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field7236 = 0;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field7234 = 0;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field7237 = 2048;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public int field7239 = 2048;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[Lo;")
    public static class24[] field7240;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[[S")
    public static short[][] field7241;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnn;I)V")
    public final void method2977(class289 arg0, int arg1) {
        field7238++;
        if (arg1 != -2) {
            this.field7239 = -42;
        }
        while (true) {
            int var3 = arg0.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method2978(var3, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILnn;I)V")
    private final void method2978(int arg0, class289 arg1, int arg2) {
        if (arg0 == 1) {
            this.field7234 = arg1.method1858(-3256);
        } else if (arg0 == 2) {
            this.field7239 = arg1.method1841((byte) 127);
        } else if (arg0 == 3) {
            this.field7237 = arg1.method1841((byte) -127);
        } else if (arg0 == 4) {
            this.field7236 = arg1.method1848((byte) 127);
        }
        if (arg2 == -1) {
            field7235++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method2979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7233++;
        if (arg0 >= class467.field6940 && arg4 <= class43.field600 && arg5 >= class372.field5455 && arg2 <= class216.field3415) {
            if (arg1 == 1) {
                class106.method906(arg4, arg0, arg3, arg2, arg5, -1);
            } else {
                class409.method2535(-7039, arg4, arg2, arg3, arg5, arg0, arg1);
            }
        } else if (arg1 == 1) {
            class529.method3138(arg3, arg4, arg2, arg5, arg0, (byte) -128);
        } else {
            class220.method1471((byte) -49, arg3, arg0, arg5, arg1, arg4, arg2);
        }
        if (arg6) {
            field7241 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method2980(int arg0) {
        field7240 = null;
        field7241 = null;
        if (arg0 != -4) {
            method2979(-31, -98, 86, 39, -83, -7, true);
        }
    }
}

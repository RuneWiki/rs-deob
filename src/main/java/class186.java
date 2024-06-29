import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class186 extends class530 {

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field2273 = -1;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "Z")
    public static boolean field2276 = true;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "[I")
    public static int[] field2274 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Lwd;")
    public static class248 field2279;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Lf;")
    public static class701 field2282;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    public static void method1156(int arg0) {
        if (arg0 == 0) {
            field2274 = null;
            field2279 = null;
            field2282 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)V")
    public static final void method1157(int arg0, byte arg1) {
        if (arg1 <= -69) {
            ++field2275;
            class233 var2 = class7.method44(arg0, 14, -1);
            var2.method1423(0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BF)V")
    public final void method1158(byte arg0, float arg1) {
        super.field7732 = arg1;
        ++field2281;
        if (arg0 <= 52) {
            field2274 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIF)V")
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZ)V")
    public final void method1159(int arg0, int arg1, int arg2, boolean arg3) {
        super.field7736 = arg2;
        ++field2280;
        super.field7734 = arg0;
        if (!arg3) {
            super.field7733 = arg1;
        }
    }
}

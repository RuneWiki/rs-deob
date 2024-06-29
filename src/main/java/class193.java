import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class193 extends class182 {

    @OriginalMember(owner = "client!js", name = "L", descriptor = "Lcr;")
    public static class362 field2500 = new class362();

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "[Leq;")
    public static class504[] field2499;

    static {
        new class296("", 76);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(IIIB)I", line = 5)
    public static final int method1251(int arg0, int arg1, int arg2, byte arg3) {
        ++field2496;
        int var4 = arg1 & 3;
        if (~var4 == -1) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (~var4 == -3) {
            return -arg0 + 7;
        } else {
            return arg3 >= -11 ? -69 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)V", line = 29)
    public final void method1205(int arg0, int arg1, int arg2, int arg3) {
        super.field2388 = arg0;
        super.field2383 = arg2;
        if (arg3 == Integer.MAX_VALUE) {
            super.field2382 = arg1;
            ++field2497;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)V", line = 45)
    public static void method1252(boolean arg0) {
        if (arg0) {
            method1252(false);
        }
        field2500 = null;
        field2499 = null;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIIIF)V", line = 58)
    public class193(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BF)V", line = 66)
    public final void method1196(byte arg0, float arg1) {
        super.field2381 = arg1;
        ++field2498;
        if (arg0 < 16) {
            field2500 = null;
        }
    }
}

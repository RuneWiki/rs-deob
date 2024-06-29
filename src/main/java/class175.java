import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class175 extends class432 {

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public static int field2497 = 100;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "Ljm;")
    public static class485 field2499 = new class485(28, 8);

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "[I")
    public static int[] field2502 = new int[4096];

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "Lss;")
    public static class295 field2501;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "Lof;")
    public static class438 field2498;

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIIIIF)V")
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V")
    public static void method1078(int arg0) {
        field2498 = null;
        field2501 = null;
        if (arg0 != -13248) {
            field2499 = null;
        }
        field2502 = null;
        field2499 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BIII)V")
    public final void method1079(byte arg0, int arg1, int arg2, int arg3) {
        super.field6284 = arg2;
        if (arg0 == 0) {
            super.field6286 = arg1;
            ++field2496;
            super.field6279 = arg3;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BF)V")
    public final void method1080(byte arg0, float arg1) {
        ++field2500;
        int var3 = 14 % ((-22 - arg0) / 40);
        super.field6287 = arg1;
    }
}

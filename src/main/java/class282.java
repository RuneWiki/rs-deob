import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class282 extends class515 {

    @OriginalMember(owner = "client!tia", name = "x", descriptor = "Lifa;")
    public static class450 field3277 = new class450();

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!tia", name = "w", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!tia", name = "y", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!tia", name = "A", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IF)V")
    public final void method545(int arg0, float arg1) {
        super.field7263 = arg1;
        if (arg0 != 0) {
            this.method545(42, 0.9268348F);
        }
        ++field3276;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(IIIIIF)V")
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(B)V")
    public static void method1623(byte arg0) {
        field3277 = null;
        int var1 = 2 % ((arg0 - 39) / 55);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BIII)V")
    public final void method544(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 25) {
            this.method545(-56, 1.6441035F);
        }
        super.field7259 = arg3;
        ++field3278;
        super.field7268 = arg1;
        super.field7255 = arg2;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)I")
    public static final int method1624(int arg0, int arg1) {
        if (arg1 != 20408) {
            method1624(126, -87);
        }
        ++field3280;
        return arg0 >>> 8;
    }
}

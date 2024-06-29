import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class466 extends class399 {

    @OriginalMember(owner = "client!qp", name = "S", descriptor = "Lsl;")
    public static class318 field6843 = new class318(67, 7);

    @OriginalMember(owner = "client!qp", name = "U", descriptor = "Lbg;")
    public static class324 field6845 = new class324(85, 6);

    @OriginalMember(owner = "client!qp", name = "R", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!qp", name = "T", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "Lga;")
    public static class277 field6841;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "Lla;")
    public static class314 field6840;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BIILuu;)V")
    public static final void method2788(byte arg0, int arg1, int arg2, class188 arg3) {
        field6842++;
        class10 var4 = arg3.method1320(0, class225.field3300);
        if (var4 == null) {
            return;
        }
        if (arg0 >= -84) {
            method2790(false);
        }
        class225.field3300.method380(arg1, arg2, arg1 + arg3.field2711, arg3.field2672 + arg2);
        if (class144.field2023 < 3) {
            class161.field2260.method109((float) arg3.field2711 / 2.0F + (float) arg1, (float) arg3.field2672 / 2.0F + (float) arg2, 4096, ((int) (-class328.field4588) & 0x3FFF) << 2, var4, arg1, arg2);
        } else {
            class225.field3300.method358(-16777216, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIILfd;)Lps;")
    public static final class63 method2789(int arg0, int arg1, int arg2, int arg3, int arg4, class365 arg5) {
        if (arg4 >= -96) {
            field6840 = null;
        }
        field6844++;
        if (!arg5.field5436 && (!class305.method1900(200, arg3) || !class305.method1900(200, arg1))) {
            return arg5.field5408 ? new class63(arg5, 34037, arg2, arg0, arg3, arg1, true) : new class63(arg5, arg2, arg0, arg3, arg1, class118.method934(arg3, 269173057), class118.method934(arg1, 269173057), true);
        } else {
            return new class63(arg5, 3553, arg2, arg0, arg3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
    public static void method2790(boolean arg0) {
        if (arg0) {
            method2788((byte) 102, -5, 105, null);
        }
        field6843 = null;
        field6845 = null;
        field6841 = null;
        field6840 = null;
    }
}

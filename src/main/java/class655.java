import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class655 extends class757 {

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field8444 = -2;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "Lrn;")
    public static class633 field8445 = new class633(60, 4);

    @OriginalMember(owner = "client!em", name = "M", descriptor = "Ltq;")
    public static class536 field8449 = new class536(30);

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "Lwm;")
    public static class30 field8450;

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIF)V", line = 4)
    public class655(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(FI)V", line = 7)
    public final void method10(float arg0, int arg1) {
        ++field8447;
        if (arg1 != 10) {
            field8445 = null;
        }
        super.field10325 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V", line = 24)
    public static void method3577(int arg0) {
        field8450 = null;
        field8445 = null;
        if (arg0 != 4) {
            field8450 = null;
        }
        field8449 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIBI)V", line = 36)
    public final void method6(int arg0, int arg1, byte arg2, int arg3) {
        super.field10314 = arg1;
        super.field10332 = arg0;
        if (arg2 >= -127) {
            method3577(82);
        }
        ++field8443;
        super.field10317 = arg3;
    }
}

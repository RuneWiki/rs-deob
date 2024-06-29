import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class227 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Llc;")
    public static class143 field4098 = class66.method374("mapscene", -1);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Llc;")
    public static class143 field4095 = class66.method374(":allyreq:", -1);

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4104 = 500;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4096 = -1;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lgf;")
    public static class7 field4099;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[[[B")
    public static byte[][][] field4101;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1550(int arg0) {
        field4098 = null;
        field4099 = null;
        field4101 = null;
        if (arg0 < 86) {
            field4104 = -92;
        }
        field4095 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public static final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -17089) {
            method1550(-107);
        }
        if (arg1 >= class188.field3398 && arg1 <= class239.field4321) {
            int var5 = class83.method476(true, class31.field481, arg0, class9.field173);
            int var6 = class83.method476(true, class31.field481, arg3, class9.field173);
            class139.method825(var5, false, arg1, var6, arg4);
        }
        field4097++;
    }
}

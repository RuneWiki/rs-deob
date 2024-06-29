import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class136 extends class670 {

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1497 = "";

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!qaa", name = "D", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!qaa", name = "F", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!qaa", name = "H", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FI)V")
    public final void method258(float arg0, int arg1) {
        super.field9332 = arg0;
        ++field1495;
        if (arg1 != -3989) {
            this.method257(36, 19, -50, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(B)V")
    public static void method764(byte arg0) {
        int var1 = -125 % ((-80 - arg0) / 32);
        field1497 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(IIIIIF)V")
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIB)V")
    public final void method257(int arg0, int arg1, int arg2, byte arg3) {
        super.field9336 = arg2;
        int var5 = -50 % ((arg3 - -11) / 61);
        super.field9338 = arg0;
        ++field1500;
        super.field9327 = arg1;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BILsp;)V")
    public static final void method765(byte arg0, int arg1, class677 arg2) {
        ++field1498;
        if (arg0 < 113) {
            field1496 = 39;
        }
        if (arg2.field9466 != null) {
            int var3 = arg2.field9466[arg1 + 1];
            if (~arg2.field9455 != ~var3) {
                arg2.field9455 = var3;
                arg2.field9424 = 0;
                arg2.field9442 = 0;
                arg2.field9421 = 1;
                arg2.field9516 = arg2.field9518;
                arg2.field9435 = 0;
                if (arg2.field9455 != -1) {
                    class635.method3570((byte) -79, class362.field4859 == arg2, arg2.field5179, class265.field3301.method3043(arg2.field9455, -8191), arg2.field5166, arg2.field5176, arg2.field9435);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIBII)V")
    public static final void method766(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class679.field9567 = arg4;
        if (arg2 != 98) {
            method765((byte) -94, 20, (class677) null);
        }
        class387.field5220 = arg3;
        class107.field1157 = arg0;
        ++field1499;
        class688.field9678 = arg1;
    }
}

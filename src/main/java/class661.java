import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class661 extends class123 {

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
    public static int field9200 = 0;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIIIIF)V")
    public class661(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILcu;)Z")
    public static final boolean method3717(int arg0, int arg1, class222 arg2) {
        class422.field5360.method606(arg2.field2968[arg0], arg2.field2971[arg0], arg2.field2974[arg0], class176.field2464);
        ++field9198;
        int var3 = class176.field2464[2];
        if (var3 < 50) {
            return false;
        } else {
            if (arg1 != -12702) {
                field9200 = -97;
            }
            arg2.field2965[arg0] = (short) (class176.field2464[0] * class307.field4056 / var3 + class52.field738);
            arg2.field2969[arg0] = (short) (class176.field2464[1] * class453.field5992 / var3 + class533.field7396);
            arg2.field2976[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
    public static final void method3718(int arg0, int arg1) {
        ++field9199;
        if (arg0 < 78) {
            method3719(-88, (byte) 36, 6, 109);
        }
        class679.field9483 = 1000000000L / (long) arg1;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(FI)V")
    public final void method941(float arg0, int arg1) {
        super.field1779 = arg0;
        if (arg1 != 34168) {
            this.method941(0.29252988F, 36);
        }
        ++field9196;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIBI)V")
    public final void method936(int arg0, int arg1, byte arg2, int arg3) {
        ++field9201;
        super.field1777 = arg3;
        super.field1774 = arg0;
        super.field1776 = arg1;
        if (arg2 < 54) {
            method3719(43, (byte) -115, 57, 29);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBII)I")
    public static final int method3719(int arg0, byte arg1, int arg2, int arg3) {
        ++field9197;
        int var4 = arg3 & 3;
        if (var4 == 0) {
            return arg2;
        } else if (~var4 == -2) {
            return arg0;
        } else if (var4 == 2) {
            return -arg2 + 7;
        } else {
            return arg1 > -51 ? 110 : -arg0 + 7;
        }
    }
}

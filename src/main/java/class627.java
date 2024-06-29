import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class627 extends class18 implements class558 {

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    private int field9102;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field9098;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(B)V")
    public final void method126(byte arg0) {
        if (arg0 != 33) {
            this.method2984((byte) -76);
        }
        ++field9095;
        super.field353.method1736(34962, this);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)V")
    public static void method3610(byte arg0) {
        if (arg0 == -75) {
            field9098 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)I")
    public final int method2987(int arg0) {
        if (arg0 <= 113) {
            this.method2988(-35, -48, (byte[]) null, 38);
        }
        ++field9097;
        return this.field9102;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)I")
    public final int method2985(int arg0) {
        ++field9094;
        return arg0 != 17831 ? -111 : super.field357;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[BI)V")
    public final void method2988(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field9100;
        this.method125(arg2, arg3, 68);
        this.field9102 = arg0;
        if (arg1 != -10884) {
            this.field9102 = -96;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)J")
    public final long method2984(byte arg0) {
        if (arg0 != 12) {
            this.method2987(67);
        }
        ++field9096;
        return 0L;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Z")
    public static final boolean method3611(int arg0, int arg1) {
        if (arg1 != -9602) {
            field9101 = -11;
        }
        ++field9099;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Luca;I[BIZ)V")
    public class627(class287 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field9102 = arg1;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Luca;ILjaclib/memory/Buffer;IZ)V")
    public class627(class287 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field9102 = arg1;
    }
}

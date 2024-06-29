import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class398 extends class38 implements class255 {

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    private int field5869;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field5866 = 0;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field5874 = 0;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
    public static final int method2379(int arg0, int arg1) {
        ++field5868;
        if (arg1 >= -54) {
            field5874 = -63;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public final void method296(int arg0) {
        if (arg0 == 1) {
            ++field5867;
            super.field584.method2875(this, -102);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lrl;I[BIZ)V")
    public class398(class487 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5869 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
    public final int method893(int arg0) {
        ++field5871;
        return arg0 != 14889 ? -72 : this.field5869;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
    public final int method892(int arg0) {
        if (arg0 != -9037) {
            this.method891(-10, -30, (byte[]) null, 78);
        }
        ++field5870;
        return super.field579;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)J")
    public final long method896(int arg0) {
        ++field5872;
        int var2 = -60 / ((arg0 - -13) / 35);
        return 0L;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BI)V")
    public final void method891(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method299(arg2, arg3, 0);
        if (arg1 != -4520) {
            this.method892(122);
        }
        ++field5873;
        this.field5869 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lis;IIII)V")
    public static final void method2380(class330 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class13.method100(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class282.field4031) {
            class13.method100(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class13.method100(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class98.field1339) {
            class13.method100(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class98.field1339) {
            class13.method100(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class282.field4031 && arg4 <= class98.field1339) {
            class13.method100(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class13.method100(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class282.field4031 && arg4 > 0) {
            class13.method100(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }
}

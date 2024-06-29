import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class594 extends class87 {

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
    public static int field7712 = 0;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)V")
    public final void method667(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -13470) {
            ++field7710;
            super.field1059 = arg2;
            super.field1061 = arg0;
            super.field1054 = arg1;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IIIIIF)V")
    public class594(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)Z")
    public static final boolean method3227(int arg0) {
        ++field7708;
        if (arg0 != -51) {
            field7712 = -61;
        }
        return !class702.method3952(arg0 ^ 108, "jaclib") ? false : class702.method3952(123, "hw3d");
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(FI)V")
    public final void method672(float arg0, int arg1) {
        super.field1063 = arg0;
        if (arg1 != 2683) {
            field7712 = 22;
        }
        ++field7713;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBIIII)V")
    public static final void method3228(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class411.field5711.field3887.method2432(true) != -1 && ~arg5 != -1 && ~class501.field6728 > -51 && ~arg2 != 0) {
            class503.field6751[class501.field6728++] = new class121((byte) 1, arg2, arg5, arg3, arg4, 0, arg0, (class256) null);
        }
        int var6 = -11 % ((arg1 - -23) / 35);
        ++field7709;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)J")
    public static final long method3229(int arg0, int arg1) {
        if (arg1 != -9320) {
            method3227(-32);
        }
        ++field7711;
        return (long) (arg0 + 11745) * 86400000L;
    }
}

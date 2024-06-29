import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class290 extends class683 implements class265 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lwh;")
    public static class546 field3835 = new class546(64);

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI[B)V")
    public final void method1241(int arg0, byte arg1, int arg2, byte[] arg3) {
        ++field3832;
        this.method3877(arg3, arg0);
        this.field3830 = arg2;
        if (arg1 != -23) {
            this.field3830 = -86;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
    public final int method1247(byte arg0) {
        ++field3833;
        if (arg0 != 116) {
            field3835 = null;
        }
        return this.field3830;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)J")
    public final long method1246(byte arg0) {
        if (arg0 >= -81) {
            return -122L;
        } else {
            ++field3831;
            return super.field9683.getAddress();
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lag;I[BI)V")
    public class290(class469 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3830 = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static void method1720(byte arg0) {
        if (arg0 > -25) {
            field3835 = null;
        }
        field3835 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)I")
    public final int method1244(byte arg0) {
        if (arg0 != 87) {
            return -64;
        } else {
            ++field3834;
            return 0;
        }
    }
}

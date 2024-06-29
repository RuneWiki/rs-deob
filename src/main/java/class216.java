import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class216 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3722 = -1;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3723 = 0;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method1525(int arg0, byte arg1) {
        field3724++;
        if (arg1 != -116) {
            field3722 = -113;
        }
        if (arg0 == 100 && class202.field3452 > 0) {
            byte[] var2 = class247.field4438[--class202.field3452];
            class247.field4438[class202.field3452] = null;
            return var2;
        } else if (arg0 == 5000 && class224.field3856 > 0) {
            byte[] var3 = class178.field2969[--class224.field3856];
            class178.field2969[class224.field3856] = null;
            return var3;
        } else if (arg0 == 30000 && class17.field236 > 0) {
            byte[] var4 = class159.field2653[--class17.field236];
            class159.field2653[class17.field236] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBLbe;ZLbe;ZI)I")
    public static final int method1526(int arg0, byte arg1, class17 arg2, boolean arg3, class17 arg4, boolean arg5, int arg6) {
        field3725++;
        int var7 = class170.method1137(false, arg2, arg4, arg5, arg0);
        if (var7 == 0) {
            if (arg1 <= 108) {
                method1526(-15, (byte) 25, (class17) null, true, (class17) null, true, -120);
            }
            if (arg6 == -1) {
                return 0;
            } else {
                int var8 = class170.method1137(false, arg2, arg4, arg3, arg6);
                return arg3 ? -var8 : var8;
            }
        } else if (arg5) {
            return -var7;
        } else {
            return var7;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class642 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BJ)I")
    public abstract int method1771(byte arg0, long arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public abstract void method1770(int arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)J")
    public abstract long method1772(byte arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IJ)I")
    public final int method3695(int arg0, long arg1) {
        field9265++;
        long var4 = this.method1773(-5866);
        if (arg0 == 0) {
            if (var4 > 0L) {
                class462.method2688(var4, (byte) 110);
            }
            return this.method1771((byte) -126, arg1);
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
    public static final void method3696(int arg0, int arg1, int arg2) {
        field9262++;
        if (class640.method3678(false, arg0) && arg1 == 0) {
            class420.method2381(class459.field6326[arg0], -119, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)J")
    public abstract long method1773(int arg0);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static final void method3697(int arg0) {
        if (arg0 != 7805) {
            return;
        }
        class582.method3388(arg0 - 7550);
        field9263++;
        class307.field3912 = null;
        class450.field6234 = null;
        class512.field7236 = null;
        class78.field914 = null;
        class69.field666 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILso;ILr;BI)V")
    public static final void method3698(int arg0, class398 arg1, int arg2, class157 arg3, byte arg4, int arg5) {
        field9266++;
        if (arg4 == 117 && arg3 != null) {
            arg1.method2287(arg0, arg3.method96(), arg3.method90(), arg3.method82(), arg5, arg3.method74(), arg2, (byte) 19, arg3.method60(), arg3.method71(), arg3.method73());
        }
    }
}

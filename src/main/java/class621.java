import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class621 {

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Lrs;")
    private class166 field8732;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "J")
    public long field8726;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "[I")
    public static int[] field8731 = new int[14];

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "Lcb;")
    public static class631 field8729 = new class631(29, -1);

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "Lla;")
    public static class422 field8730;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IFZIBIII)[I")
    public static final int[] method3529(int arg0, float arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field8725++;
        int[] var8 = new int[arg5];
        class387 var9 = new class387();
        var9.field5803 = arg0;
        var9.field5805 = arg3;
        var9.field5815 = arg6;
        var9.field5809 = arg2;
        var9.field5810 = arg7;
        var9.field5797 = (int) (arg1 * 4096.0F);
        var9.method65(97);
        int var10 = -95 % ((10 - arg4) / 46);
        class423.method2646(0, arg5, 1);
        var9.method2420(0, (byte) -35, var8);
        return var8;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public static void method3530(int arg0) {
        field8730 = null;
        field8731 = null;
        field8729 = null;
        if (arg0 != 12609) {
            method3529(-85, -1.02594F, false, 82, (byte) -71, 80, -63, -72);
        }
    }

    @OriginalMember(owner = "client!waa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8732.method1247(this.field8726, true);
        field8727++;
        super.finalize();
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lrs;JI)V")
    public class621(class166 arg0, long arg1, int arg2) {
        this.field8732 = arg0;
        this.field8726 = arg1;
    }
}

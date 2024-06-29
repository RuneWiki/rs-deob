import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class268 extends class145 implements class224 {

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    private int field3797;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field3794 = 0;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)J", line = 4)
    public final long method971(int arg0) {
        ++field3795;
        if (arg0 != 20055) {
            method1630(64);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(Z)V", line = 19)
    public final void method1019(boolean arg0) {
        super.field2159.method1769(this, arg0);
        ++field3800;
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)V", line = 31)
    public static final void method1629(int arg0) {
        class350.field5036.method1997(1);
        if (arg0 <= 124) {
            field3794 = -22;
        }
        ++field3793;
        class82.field1152.method1997(1);
        class104.field1403.method1997(1);
        class130.field1782.method1997(1);
        class84.field1166.method1997(1);
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)I", line = 48)
    public final int method967(int arg0) {
        if (arg0 != -5602) {
            this.method968(-19, (byte[]) null, -24, -119);
        }
        ++field3798;
        return super.field2160;
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)Z", line = 59)
    public static final boolean method1630(int arg0) {
        ++field3801;
        try {
            int var1 = -51 % ((arg0 - -77) / 40);
            if (~field3802 == -3) {
                if (class546.field7407 == null) {
                    class546.field7407 = class338.method2028(class7.field68, class674.field9486, class630.field8791);
                    if (class546.field7407 == null) {
                        return false;
                    }
                }
                if (class423.field5969 == null) {
                    class423.field5969 = new class177(class210.field3100, class42.field617);
                }
                if (class230.field3284.method2452(class433.field6134, class423.field5969, (byte) 75, 22050, class546.field7407)) {
                    class230.field3284.method2473(-110);
                    class230.field3284.method2459(class457.field6471, -1);
                    class230.field3284.method2480(class546.field7407, class222.field3213, (byte) 126);
                    class423.field5969 = null;
                    field3802 = 0;
                    class7.field68 = null;
                    class546.field7407 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class230.field3284.method2471(-22443);
            class423.field5969 = null;
            class7.field68 = null;
            class546.field7407 = null;
            field3802 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)V", line = 110)
    public final void method968(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field3799;
        this.method1020(35040, arg1, arg0);
        this.field3797 = arg3;
        if (arg2 != -1842) {
            field3802 = -65;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Len;I[BIZ)V", line = 123)
    public class268(class289 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3797 = arg1;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I", line = 138)
    public final int method965(int arg0) {
        ++field3796;
        int var2 = -44 % ((arg0 - 73) / 33);
        return this.field3797;
    }
}

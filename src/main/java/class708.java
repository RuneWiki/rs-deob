import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class708 extends class94 implements class60 {

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "I")
    private int field9928;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "Lcba;")
    public static class516 field9922 = new class516();

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "[F")
    public static float[] field9931 = new float[4];

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "Lff;")
    public static class9 field9924;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(Z)V")
    public static void method3901(boolean arg0) {
        if (!arg0) {
            field9922 = null;
            field9924 = null;
            field9931 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)I")
    public final int method491(byte arg0) {
        ++field9921;
        if (arg0 != -121) {
            this.method492(102);
        }
        return super.field1437;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)J")
    public final long method492(int arg0) {
        ++field9930;
        return arg0 >= -80 ? 76L : 0L;
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)V")
    public final void method741(int arg0) {
        super.field1438.method3611(this, 80);
        ++field9927;
        if (arg0 <= 80) {
            this.field9928 = 39;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIZ[B)V")
    public final void method490(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg2) {
            ++field9926;
            this.method739(arg1, arg3, -124);
            this.field9928 = arg0;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)I")
    public final int method493(boolean arg0) {
        ++field9925;
        if (arg0) {
            this.method741(-8);
        }
        return this.field9928;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lno;I[BIZ)V")
    public class708(class658 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9928 = arg1;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZZI)I")
    public static final int method3902(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field9923;
        class521 var4 = class265.method1620(arg3, arg2, arg1);
        if (var4 == null) {
            return -1;
        } else {
            return arg0 >= 0 && ~var4.field6961.length < ~arg0 ? var4.field6961[arg0] : -1;
        }
    }
}

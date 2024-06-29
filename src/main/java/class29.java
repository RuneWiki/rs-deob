import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class29 extends class649 {

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field284 = 1339;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "Ltm;")
    public static class334 field281 = new class334(108, 8);

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)I", line = 10)
    public final int method135(int arg0) {
        int var2 = -30 % ((-18 - arg0) / 50);
        ++field282;
        return 127;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 24)
    public final void method134(int arg0) {
        if (arg0 != 1) {
            field284 = 110;
        }
        ++field280;
        if (~super.field9223 > -1 && ~super.field9223 < -128) {
            super.field9223 = this.method135(arg0 ^ 46);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB)V", line = 37)
    public final void method129(int arg0, byte arg1) {
        if (arg1 > -120) {
            this.method129(-86, (byte) 93);
        }
        super.field9223 = arg0;
        ++field285;
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V", line = 48)
    public static void method154(int arg0) {
        if (arg0 < 63) {
            field277 = 11;
        }
        field281 = null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)I", line = 58)
    public final int method133(int arg0, int arg1) {
        ++field278;
        if (arg0 != 18648) {
            this.method155(50);
        }
        return 1;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(ILhs;)V", line = 73)
    public class29(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)I", line = 80)
    public final int method155(int arg0) {
        if (arg0 != 3) {
            field277 = -49;
        }
        ++field279;
        return super.field9223;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lhs;)V", line = 91)
    public class29(class358 arg0) {
        super(arg0);
    }
}

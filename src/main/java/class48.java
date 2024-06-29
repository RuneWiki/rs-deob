import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class48 extends class337 {

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "Ldn;")
    public static class438 field401;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 5)
    public final void method251(byte arg0) {
        super.field4382.method3093(false, (byte) 121);
        ++field403;
        if (arg0 > -21) {
            method255((byte) 57);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BZ)V", line = 22)
    public final void method252(byte arg0, boolean arg1) {
        super.field4382.method3093(true, (byte) -113);
        ++field406;
        if (arg0 <= 10) {
            field401 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IBLuu;)V", line = 33)
    public final void method253(int arg0, byte arg1, class238 arg2) {
        super.field4382.method3083((byte) 118, arg2);
        ++field399;
        if (arg1 == 93) {
            super.field4382.method3063(arg0, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(FFIBF)F", line = 45)
    public static final float method254(float arg0, float arg1, int arg2, byte arg3, float arg4) {
        ++field407;
        float[] var5 = class138.field1686[arg2];
        if (arg3 != 72) {
            method254(-0.9707081F, -0.70019525F, -51, (byte) -18, -0.17233899F);
        }
        return var5[2] * arg0 + var5[1] * arg4 + var5[0] * arg1;
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V", line = 59)
    public static void method255(byte arg0) {
        if (arg0 <= -68) {
            field401 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZI)V", line = 71)
    public final void method256(boolean arg0, int arg1) {
        ++field404;
        if (arg1 != 28300) {
            this.method251((byte) 96);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z", line = 82)
    public final boolean method257(byte arg0) {
        if (arg0 <= 115) {
            field402 = 37;
        }
        ++field405;
        return true;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZII)V", line = 93)
    public final void method258(boolean arg0, int arg1, int arg2) {
        ++field400;
        if (arg0) {
            field401 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lmh;)V", line = 103)
    public class48(class537 arg0) {
        super(arg0);
    }
}

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class653 extends class65 implements class125 {

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    private int field9213;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field9220 = 0;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "[I")
    public static int[] field9210 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9218 = new Rectangle[100];

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "Lrga;")
    public static class280 field9219 = new class280(46, 8);

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lqj;I[BIZ)V", line = 4)
    public class653(class548 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9213 = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IC)Z", line = 12)
    public static final boolean method3663(int arg0, char arg1) {
        ++field9221;
        if (arg0 >= -114) {
            return true;
        } else {
            return arg1 >= '0' && arg1 <= '9' || ~arg1 <= -66 && ~arg1 >= -91 || ~arg1 <= -98 && ~arg1 >= -123;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V", line = 28)
    public final void method389(byte arg0) {
        if (arg0 != -54) {
            field9210 = null;
        }
        ++field9211;
        super.field885.method3018(arg0 + -38, this);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I", line = 41)
    public final int method663(byte arg0) {
        ++field9217;
        if (arg0 != -17) {
            field9219 = null;
        }
        return this.field9213;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V", line = 53)
    public static void method3664(int arg0) {
        field9218 = null;
        field9219 = null;
        field9210 = null;
        if (arg0 > -19) {
            field9210 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)J", line = 66)
    public final long method662(int arg0) {
        if (arg0 != 13456) {
            field9210 = null;
        }
        ++field9214;
        return 0L;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III[B)V", line = 88)
    public final void method665(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 == 17816) {
            this.method388((byte) 126, arg3, arg2);
            ++field9216;
            this.field9213 = arg0;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I", line = 104)
    public final int method664(int arg0) {
        ++field9215;
        return arg0 != -22904 ? 93 : super.field886;
    }
}

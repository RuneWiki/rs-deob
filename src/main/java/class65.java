import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class65 extends class227 implements class632 {

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    private int field723;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "F")
    public static float field719 = 0.0F;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Ljava/lang/Object;")
    public static Object field721;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lad;I[BIZ)V")
    public class65(class362 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field723 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIB)V")
    public final void method447(int arg0, byte[] arg1, int arg2, byte arg3) {
        this.method1476(arg1, arg0, 0);
        ++field720;
        this.field723 = arg2;
        if (arg3 <= 97) {
            field719 = 0.29637292F;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
    public final int method448(int arg0) {
        ++field718;
        if (arg0 != -18785) {
            this.method450((byte) -79);
        }
        return this.field723;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public static void method449(int arg0) {
        if (arg0 != 0) {
            method449(-48);
        }
        field721 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lad;ILjaclib/memory/Buffer;IZ)V")
    public class65(class362 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field723 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)J")
    public final long method450(byte arg0) {
        ++field716;
        if (arg0 >= -22) {
            this.method451(-55);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 != 1102) {
            field719 = -1.0131834F;
        }
        super.field3185.method2279(this, -24529);
        ++field722;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
    public final int method452(int arg0) {
        ++field717;
        if (arg0 > -114) {
            this.field723 = 95;
        }
        return super.field3186;
    }
}

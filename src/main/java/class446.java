import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class446 extends class502 {

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field6134 = 0;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method2595(int arg0, byte arg1) {
        ++field6133;
        if (arg1 != -33) {
            return false;
        } else {
            return ~arg0 == -1 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)I", line = 15)
    public final int method2596(byte arg0) {
        if (arg0 < 49) {
            return -40;
        } else {
            ++field6130;
            return super.field6865;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Leka;)V", line = 27)
    public class446(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I", line = 30)
    public final int method55(int arg0) {
        ++field6128;
        if (arg0 != -2) {
            field6134 = 64;
        }
        return super.field6863.method2830((byte) 126) ? 1 : 0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I", line = 46)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method52(91, 23);
        }
        ++field6131;
        return 3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V", line = 63)
    public final void method58(boolean arg0) {
        super.field6865 = this.method55(-2);
        if (arg0) {
            ++field6132;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(ILeka;)V", line = 74)
    public class446(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(II)V", line = 77)
    public final void method52(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field6129;
            super.field6865 = arg0;
        }
    }
}

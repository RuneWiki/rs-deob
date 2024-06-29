import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class371 extends class502 {

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Lafa;")
    public static class365 field5051 = new class365();

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[Lnn;")
    public static class439[] field5052 = new class439[37];

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)V", line = 7)
    public final void method52(int arg0, int arg1) {
        super.field6865 = arg0;
        ++field5050;
        if (arg1 != 0) {
            field5052 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)I", line = 19)
    public final int method2258(byte arg0) {
        if (arg0 < 49) {
            this.method52(-17, 123);
        }
        ++field5046;
        return super.field6865;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I", line = 30)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 0) {
            field5051 = null;
        }
        ++field5049;
        return 1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 43)
    public final void method58(boolean arg0) {
        ++field5047;
        if (super.field6865 != 1 && super.field6865 != 0) {
            super.field6865 = this.method55(-2);
        }
        if (!arg0) {
            field5051 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I", line = 57)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            this.method55(87);
        }
        ++field5048;
        return 1;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V", line = 69)
    public static void method2259(byte arg0) {
        field5051 = null;
        if (arg0 <= -78) {
            field5052 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Leka;)V", line = 80)
    public class371(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(ILeka;)V", line = 85)
    public class371(int arg0, class492 arg1) {
        super(arg0, arg1);
    }
}

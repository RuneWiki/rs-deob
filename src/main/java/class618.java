import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class618 {

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Lmq;")
    public class618 field7829;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Lmq;")
    public class618 field7832;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)V")
    public final void method3306(boolean arg0) {
        field7830++;
        if (this.field7829 == null) {
            return;
        }
        this.field7829.field7832 = this.field7832;
        this.field7832.field7829 = this.field7829;
        if (!arg0) {
            this.field7829 = null;
            this.field7832 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
    public static final boolean method3307(int arg0, int arg1, int arg2) {
        if (arg2 != 32) {
            method3307(61, 103, -108);
        }
        field7833++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ[S)[S")
    public static final short[] method3308(int arg0, boolean arg1, short[] arg2) {
        field7831++;
        short[] var3 = new short[arg0];
        class642.method3473(arg2, 0, var3, 0, arg0);
        return arg1 ? null : var3;
    }
}

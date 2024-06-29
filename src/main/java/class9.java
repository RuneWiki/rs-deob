import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class9 extends class301 {

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "Z")
    public static boolean field74 = false;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "Lmw;")
    public static class687 field79 = new class687();

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field82 = 0;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field80;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)V", line = 7)
    public static void method21(byte arg0) {
        field80 = null;
        if (arg0 > 5) {
            field79 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)V", line = 18)
    public final void method22(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field79 = null;
        }
        ++field76;
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(B)V", line = 33)
    public static final void method23(byte arg0) {
        ++field77;
        int var1 = 11 % ((arg0 - -42) / 59);
        if (class485.field6252.field6942.method2278(false) == 0 && class711.field9393 != class309.field3877) {
            class166.method1057(class527.field6693, false, class742.field10047, 11, 107);
        } else {
            class215.method1421(class576.field7320, 0);
            if (class666.field8670 != class309.field3877) {
                class494.method2752((byte) 71);
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lck;)V", line = 55)
    public class9(class733 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V", line = 59)
    public final void method24(byte arg0) {
        if (arg0 >= -89) {
            this.method22(-91, 40, 40);
        }
        ++field85;
        super.field3803.method3938(false, -126);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z", line = 70)
    public final boolean method25(byte arg0) {
        if (arg0 < 7) {
            return false;
        } else {
            ++field84;
            return true;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(III)B", line = 81)
    public static final byte method26(int arg0, int arg1, int arg2) {
        ++field78;
        int var3 = 30 % ((44 - arg2) / 41);
        if (arg1 != 9) {
            return 0;
        } else {
            return (byte) (~(1 & arg0) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(IZ)V", line = 98)
    public final void method27(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method28((class128) null, -15, -101);
        }
        ++field83;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lwj;II)V", line = 109)
    public final void method28(class128 arg0, int arg1, int arg2) {
        ++field81;
        if (arg1 == 0) {
            super.field3803.method3975((byte) 121, arg0);
            super.field3803.method3979((byte) -116, arg2);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V", line = 125)
    public final void method29(int arg0, boolean arg1) {
        if (arg0 >= 18) {
            super.field3803.method3938(true, 41);
            ++field75;
        }
    }
}

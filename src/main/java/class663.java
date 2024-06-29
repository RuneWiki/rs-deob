import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class663 extends class619 {

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field9085;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field9086;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lwga;")
    public static class506 field9083 = new class506();

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lkha;")
    public static class687 field9080;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lgq;Lkfa;IIIIIIIIII)V")
    public class663(class761 arg0, class407 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9085 = arg10;
        this.field9086 = arg11;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3588(int arg0, String arg1) {
        if (arg0 != 0) {
            field9080 = null;
        }
        field9079++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method3589(int arg0) {
        field9083 = null;
        if (arg0 >= 123) {
            field9080 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lfu;")
    public static final class73 method3590(int arg0, int arg1, int arg2) {
        if (class495.field7002[arg0][arg1][arg2] == null) {
            boolean var3 = class495.field7002[0][arg1][arg2] != null && class495.field7002[0][arg1][arg2].field962 != null;
            if (var3 && arg0 >= class126.field1511 - 1) {
                return null;
            }
            class464.method2746(arg0, arg1, arg2);
        }
        return class495.field7002[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILgaa;)V")
    public static final void method3591(int arg0, class460 arg1) {
        if (arg0 == 16886) {
            if (class62.field843 == arg1.field6495) {
                class709.field9971[arg1.field6557] = true;
            }
            field9084++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILkha;)V")
    public static final void method3592(int arg0, class687 arg1) {
        class211.field2699 = arg1;
        if (arg0 == 22183) {
            field9082++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lqi;")
    public final class669 method271(boolean arg0) {
        field9081++;
        if (arg0) {
            method3589(60);
        }
        return class306.field3931;
    }
}

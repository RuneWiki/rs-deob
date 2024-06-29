import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class521 extends class618 {

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "[I")
    public int[] field7091;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "[I")
    public int[] field7089;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lem;")
    public static class206 field7083 = new class206(114, -1);

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "[I")
    public static int[] field7086 = new int[8];

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field7090 = 0;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "[I")
    public static int[] field7088 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "[Lf;")
    public static class702[] field7092;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Luea;")
    public static final class287 method2966(Throwable arg0, String arg1) {
        field7084++;
        class287 var2;
        if (arg0 instanceof class287) {
            var2 = (class287) arg0;
            var2.field3956 = var2.field3956 + ' ' + arg1;
        } else {
            var2 = new class287(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZI)V")
    public static final void method2967(boolean arg0, boolean arg1, int arg2) {
        field7085++;
        class373 var3 = class687.method3877(arg2, arg0, 90);
        if (var3 != null) {
            var3.method2340(121);
            if (!arg1) {
                field7093 = 47;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lsea;ILfa;)V")
    public static final void method2968(class648 arg0, int arg1, class212 arg2) {
        field7087++;
        if (arg1 == 16383) {
            class5.field43 = arg0;
            class84.field1249 = arg2;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public static void method2969(int arg0) {
        field7086 = null;
        field7088 = null;
        if (arg0 != 2047) {
            method2967(true, true, -111);
        }
        field7083 = null;
        field7092 = null;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(II[I[I)V")
    public class521(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field7091 = arg2;
        this.field7089 = arg3;
    }
}

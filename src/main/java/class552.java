import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class552 {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public int field7550;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public int field7553;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public int field7556;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public int field7558;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field7554 = 0;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field7557;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cp", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field7559;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "[[B")
    public static byte[][] field7552;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3096(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 8)
    public static void method3092(boolean arg0) {
        if (!arg0) {
            field7557 = -49;
        }
        field7552 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 18)
    public static final boolean method3093(String arg0, int arg1) {
        if (arg1 != 0) {
            field7554 = 11;
        }
        field7555++;
        return class419.method2431((byte) -8, field7559 == null ? (field7559 = method3096("ai")) : field7559, arg0);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Lcp;", line = 35)
    public final class552 method3094(int arg0, byte arg1) {
        field7549++;
        if (arg1 != 91) {
            this.field7556 = -65;
        }
        return new class552(this.field7553, arg0, this.field7550, this.field7556);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII)V", line = 48)
    public static final void method3095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7551++;
        if (arg0 < 46) {
            return;
        }
        if ((arg4 - arg6) >= class398.field5676 && (arg4 + arg6) <= class298.field3995 && (arg5 - arg6) >= class609.field8313 && class19.field169 >= arg5 + arg6) {
            class127.method766(arg1, arg4, arg2, arg5, arg6, 23539, arg3);
        } else {
            class665.method3696(arg1, arg5, (byte) -117, arg6, arg4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIII)V", line = 68)
    public class552(int arg0, int arg1, int arg2, int arg3) {
        this.field7550 = arg2;
        this.field7553 = arg0;
        this.field7556 = arg3;
        this.field7558 = arg1;
    }
}

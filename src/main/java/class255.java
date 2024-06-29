import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class255 extends class137 {

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "Lah;")
    public class116 field4245;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Ltl;")
    public static class59 field4228 = class85.method639("<col=ffffff> )4 ", 9588);

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4234 = 0;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Ltl;")
    private static class59 field4235 = class85.method639("purple:", 9588);

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field4239 = 0;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Ltl;")
    private static class59 field4227 = class85.method639(" from your friend list first)3", 9588);

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Ltl;")
    public static class59 field4232 = field4235;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Ltl;")
    public static class59 field4230 = class85.method639("<col=80ff00>", 9588);

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Ltl;")
    public static class59 field4231 = field4227;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "Z")
    public static boolean field4238 = false;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "Ltl;")
    public static class59 field4241 = null;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4242 = 0;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "Ltl;")
    public static class59 field4247 = field4235;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "Ltl;")
    private static class59 field4237 = class85.method639("glow2:", 9588);

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "Ltl;")
    public static class59 field4246 = field4237;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "Ltl;")
    public static class59 field4240 = field4237;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)Z", line = 11)
    public static final boolean method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V", line = 46)
    public static void method1777(byte arg0) {
        field4247 = null;
        field4227 = null;
        field4228 = null;
        if (arg0 != 97) {
            method1777((byte) 125);
        }
        field4237 = null;
        field4231 = null;
        field4246 = null;
        field4232 = null;
        field4230 = null;
        field4241 = null;
        field4235 = null;
        field4240 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 75)
    public static final void method1778(int arg0, int arg1) {
        field4243++;
        if (class253.method1764(arg0, 0)) {
            class312.method2154(class239.field3986[arg0], -1, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V", line = 114)
    public static final void method1779(int arg0) {
        if (arg0 != -12843) {
            field4235 = (class59) null;
        }
        field4229++;
        class94.field1459 = true;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lah;)V", line = 152)
    public class255(class116 arg0) {
        this.field4245 = arg0;
    }
}

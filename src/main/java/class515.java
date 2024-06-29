import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class515 {

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "Lqe;")
    public static class465 field7335 = new class465(107, 4);

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field7337 = 0;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field7338 = 0;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Leq;")
    public static class209 field7336;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BILvg;)V")
    public static final void method3069(byte arg0, int arg1, class52 arg2) {
        field7332++;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field898 > class605.field8787) {
            class7.method40(false, arg2);
        } else if (class605.field8787 > arg2.field962) {
            class204.method1426(false, false, arg2);
            var4 = class21.field266;
            var3 = class668.field9381;
        } else {
            class296.method1922(-12004, arg2);
        }
        if (arg2.field644 < 512 || arg2.field648 < 512 || arg2.field644 >= (class174.field2540 - 1) * 512 || (class716.field9999 * 512 - 512) <= arg2.field648) {
            arg2.field944 = -1;
            arg2.field962 = 0;
            arg2.field908 = -1;
            var3 = -1;
            arg2.field957 = -1;
            arg2.field898 = 0;
            arg2.field885 = null;
            var4 = 0;
            arg2.field644 = arg2.field991[0] * 512 + (arg2.method482(false) * 256);
            arg2.field648 = arg2.field995[0] * 512 + arg2.method482(false) * 256;
            arg2.method481(-97);
        }
        if (class468.field6748 == arg2 && (arg2.field644 < 6144 || arg2.field648 < 6144 || ((class174.field2540 - 12) * 512) <= arg2.field644 || arg2.field648 >= ((class716.field9999 - 12) * 512))) {
            arg2.field962 = 0;
            arg2.field885 = null;
            arg2.field944 = -1;
            arg2.field957 = -1;
            var4 = 0;
            var3 = -1;
            arg2.field898 = 0;
            arg2.field908 = -1;
            arg2.field644 = arg2.field991[0] * 512 + arg2.method482(false) * 256;
            arg2.field648 = arg2.field995[0] * 512 + arg2.method482(false) * 256;
            arg2.method481(-86);
        }
        int var5 = -89 % ((arg0 + 46) / 61);
        int var6 = class559.method3282((byte) 110, arg2);
        class652.method3683(arg2, 124);
        class11.method57(var6, true, var3, var4, arg2);
        class162.method1214(arg2, 0, var3);
        class239.method1609(true, arg2);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
    public static final boolean method3070(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field7337 = -90;
        }
        field7334++;
        return (arg1 & 0x40000) != 0 | class716.method3988(arg1, arg0, true) || class189.method1330(arg1, 21721, arg0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)Z")
    public static final boolean method3071(int arg0, byte arg1) {
        if (arg1 != 66) {
            method3070(105, 54, -70);
        }
        field7330++;
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3072(String arg0, int arg1) {
        field7333++;
        int var2 = -96 % ((arg1 + 3) / 61);
        if (class166.field2445.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class166.field2445.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class166.field2445.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method3073(int arg0) {
        if (arg0 == 512) {
            field7336 = null;
            field7335 = null;
        }
    }
}

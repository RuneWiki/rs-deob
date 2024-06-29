import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class164 extends class175 {

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "Z")
    public static boolean field2800 = false;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "J")
    public static long field2806;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "[I")
    public static int[] field2802;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[I")
    public static int[] field2805;

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Z)V")
    public static void method1143(boolean arg0) {
        field2802 = null;
        field2805 = null;
        if (!arg0) {
            method1145((byte) 88, -71);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2804++;
        if (arg5 != 130928) {
            return;
        }
        if (class177.field2953 <= arg9 && arg9 <= class224.field3773 && arg1 >= class177.field2953 && arg1 <= class224.field3773 && arg2 >= class177.field2953 && class224.field3773 >= arg2 && class177.field2953 <= arg4 && class224.field3773 >= arg4 && arg0 >= class100.field1855 && class97.field1816 >= arg0 && arg7 >= class100.field1855 && class97.field1816 >= arg7 && class100.field1855 <= arg6 && arg6 <= class97.field1816 && class100.field1855 <= arg3 && arg3 <= class97.field1816) {
            class43.method319(arg1, arg6, arg8, arg0, false, arg9, arg7, arg2, arg4, arg3);
        } else {
            class250.method1697(arg6, arg2, arg0, arg4, arg8, (byte) 118, arg7, arg9, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        field2801++;
        if (arg1 != -27746) {
            field2803 = -43;
        }
        return class129.field2272;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)I")
    public static final int method1145(byte arg0, int arg1) {
        field2799++;
        if (arg0 < 7) {
            field2800 = true;
        }
        return (arg1 & 0x1FF70) >> 11;
    }
}

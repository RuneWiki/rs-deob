import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class129 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "S")
    public static short field2038 = 1;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2042 = 0;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lne;")
    public static class172 field2037;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 7)
    public static void method955(boolean arg0) {
        field2037 = null;
        if (!arg0) {
            field2037 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V", line = 32)
    public class129(int arg0, int arg1) {
        this.field2036 = arg0;
        this.field2040 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V", line = 41)
    public static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg4) {
            class256.method1769(arg4, class277.field4414[arg0], (byte) 118, arg3, arg1);
        } else {
            class256.method1769(arg1, class277.field4414[arg0], (byte) 50, arg3, arg4);
        }
        field2039++;
        if (arg2 != 0) {
            method957(-123, -48, 57, -41, -49, -117, -113, 9);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIII)V", line = 69)
    public static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 1) {
            method957(109, 124, -39, -72, -79, 40, 58, -15);
        }
        field2043++;
        if (class406.field6033 <= arg3 && class185.field3005 >= arg4 && arg0 >= class99.field1378 && class396.field5925 >= arg5) {
            class429.method2658(arg1, arg2, arg3, arg5, arg0, arg4, (byte) -9, arg6);
        } else {
            class272.method1846(arg0, arg2, arg6, arg5, 116, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public abstract void method786(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()V")
    public abstract void method780();

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Las;IIIIZ)Z")
    public abstract boolean method782(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Las;IIIIZ)V")
    public abstract void method778(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method768(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lej;[I)V")
    public abstract void method772(class62 arg0, int[] arg1);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public abstract void method770(int arg0, int arg1);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)I")
    public abstract int method771(int arg0, int arg1);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method784(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I")
    public abstract int method779(int arg0, int arg1);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Las;IIIIZ)V")
    public abstract void method787(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method776(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILas;)Las;")
    public abstract class84 method777(int arg0, int arg1, class84 arg2);
}

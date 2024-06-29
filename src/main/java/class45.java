import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class45 extends class436 {

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "Ljava/lang/String;")
    public static String field680 = "wave:";

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "[[B")
    public static byte[][] field683 = new byte[1000][];

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static void method318(int arg0) {
        field680 = null;
        if (arg0 >= -37) {
            field683 = null;
        }
        field683 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)Z")
    public static final boolean method319(int arg0, int arg1, int arg2, int arg3) {
        if (!class326.method2050(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class431.method2709(var4 + 1, class249.field3456[arg0].method275(arg1, arg2) + arg3, var5 + 1) && class431.method2709(var4 + 128 - 1, class249.field3456[arg0].method275(arg1 + 1, arg2) + arg3, var5 + 1) && class431.method2709(var4 + 128 - 1, class249.field3456[arg0].method275(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class431.method2709(var4 + 1, class249.field3456[arg0].method275(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method320(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field682;
        if (class77.method545(true, arg3)) {
            client.method1102(class333.field4511[arg3], -1, arg4, arg9, arg6, arg2, arg8, arg5, arg7, arg0);
            if (arg1 != 68) {
                field683 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class45() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field681;
        if (arg1 != 18338) {
            method320(-61, (byte) -10, 22, 37, -11, -57, -55, 102, -51, -4);
        }
        int[] var3 = super.field6258.method2688((byte) -112, arg0);
        if (super.field6258.field6138) {
            class150.method1021(var3, 0, class43.field653, class32.field499[arg0]);
        }
        return var3;
    }
}

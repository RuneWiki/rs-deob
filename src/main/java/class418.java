import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class418 implements class325 {

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public int field6053;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "[I")
    public static int[] field6051 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "Lpn;")
    public static class742 field6055 = new class742();

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V", line = 10)
    public static void method2575(int arg0) {
        field6051 = null;
        field6055 = null;
        if (arg0 != 1) {
            field6051 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method2576(int arg0, int arg1, int arg2) {
        if (arg1 < 80) {
            method2575(17);
        }
        field6054++;
        if (class499.method2945(arg2, arg0, true)) {
            return class514.method3007(12644, arg2, arg0) | (arg0 & 0xB000) != 0 | class183.method1337(arg0, -128, arg2) ? true : (class444.method2671(arg2, arg0, -128) | class315.method2042(arg0, arg2, (byte) 92)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)I", line = 45)
    public static int method2577(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uw", name = "toString", descriptor = "()Ljava/lang/String;", line = 56)
    public final String toString() {
        field6052++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 64)
    public class418(String arg0, int arg1) {
        this.field6053 = arg1;
    }
}

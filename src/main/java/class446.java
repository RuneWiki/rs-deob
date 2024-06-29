import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class446 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lkr;")
    public static class602 field6190 = new class602(19, 2);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
    public static int[] field6192 = new int[1024];

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
    public static int[] field6193 = new int[8];

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I", line = 4)
    public final int method2721(int arg0) {
        if (arg0 != -26871) {
            field6190 = null;
        }
        field6188++;
        return this.field6189;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 15)
    public static void method2722(int arg0) {
        field6190 = null;
        if (arg0 == 1024) {
            field6192 = null;
            field6193 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "toString", descriptor = "()Ljava/lang/String;", line = 28)
    public final String toString() {
        field6187++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Object;III)[B", line = 43)
    public static final byte[] method2723(Object arg0, int arg1, int arg2, int arg3) {
        field6191++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class530.method3149(arg1, (byte) -57, var4, arg2);
        } else if (arg0 instanceof class483) {
            class483 var5 = (class483) arg0;
            return var5.method2940(6684, arg2, arg1);
        } else {
            int var6 = 41 / ((arg3 + 12) / 33);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 73)
    public class446(String arg0, int arg1) {
        this.field6189 = arg1;
    }
}

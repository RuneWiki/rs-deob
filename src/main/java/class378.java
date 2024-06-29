import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class378 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field5872;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljc;")
    public static class356 field5873 = new class356(8, 5);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lok;")
    public static class172 field5875;

    @OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field5876++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method2397(int arg0, int arg1, int arg2) {
        if (arg0 != -3469) {
            method2398(null, false, -36);
        }
        field5871++;
        return class460.method2743(arg1, (byte) -112, arg2) & class250.method1695(arg2, arg1, (byte) -49);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 25)
    public static final byte[] method2398(Object arg0, boolean arg1, int arg2) {
        field5874++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class7.method44(false, var3) : var3;
        } else if (arg0 instanceof class190) {
            class190 var4 = (class190) arg0;
            return var4.method1281((byte) 42);
        } else if (arg2 == -7350) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 66)
    public static void method2399(byte arg0) {
        int var1 = 39 % ((-arg0 - 4) / 50);
        field5873 = null;
        field5875 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 77)
    public class378(String arg0, int arg1) {
        this.field5872 = arg1;
    }
}

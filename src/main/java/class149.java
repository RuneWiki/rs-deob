import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class149 {

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
    public static int[] field2145 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Lbu;")
    public static class21 field2143 = new class21(83, 2);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ls", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field2147++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)Lfi;", line = 14)
    public static final class581 method1036(int arg0, byte arg1) {
        field2142++;
        class581 var2 = (class581) class188.field2897.method4039(0, (long) arg0);
        if (arg1 <= 110) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class520.field7346.method4339(0, 0, arg0);
            if (var3 == null || var3.length <= 1) {
                return null;
            }
            class581 var4;
            try {
                var4 = class273.method1759(var3, (byte) 123);
            } catch (Exception var6) {
                throw new RuntimeException(var6.getMessage() + " S: " + arg0);
            }
            class188.field2897.method4037(var4, (long) arg0, false);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I", line = 42)
    public final int method1037(byte arg0) {
        field2146++;
        if (arg0 != -79) {
            method1038(62);
        }
        return this.field2144;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 53)
    public static void method1038(int arg0) {
        field2145 = null;
        if (arg0 > -89) {
            field2145 = null;
        }
        field2143 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 74)
    public class149(String arg0, int arg1) {
        this.field2144 = arg1;
    }
}

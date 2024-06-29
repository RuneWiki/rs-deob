import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class638 {

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public int field8944;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    private int field8945;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "Lbt;")
    private class117 field8941;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public int field8938;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Ljv;")
    public static class638 field8940 = new class638(0, 3, class117.field1513);

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "Ljv;")
    public static class638 field8946 = new class638(1, 3, class117.field1513);

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "Ljv;")
    public static class638 field8947 = new class638(2, 4, class117.field1509);

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Ljv;")
    public static class638 field8948 = new class638(3, 1, class117.field1513);

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "Ljv;")
    public static class638 field8949 = new class638(4, 2, class117.field1513);

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "Ljv;")
    public static class638 field8950 = new class638(5, 3, class117.field1513);

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "Ljv;")
    public static class638 field8951 = new class638(6, 4, class117.field1513);

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field8952 = class517.method2798(-24420, 16);

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "Lrga;")
    public static class280 field8954 = new class280(83, -1);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "J")
    public static long field8955;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "[I")
    public static int[] field8956;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    public static void method3571(boolean arg0) {
        field8950 = null;
        field8948 = null;
        field8946 = null;
        field8949 = null;
        field8954 = null;
        field8951 = null;
        if (arg0) {
            field8940 = null;
            field8947 = null;
            field8956 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8943++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)Ljv;")
    public static final class638 method3572(int arg0, int arg1) {
        field8939++;
        if (arg1 != 31974) {
            return null;
        } else if (arg0 == 0) {
            return field8940;
        } else if (arg0 == 1) {
            return field8946;
        } else if (arg0 == 2) {
            return field8947;
        } else if (arg0 == 3) {
            return field8948;
        } else if (arg0 == 4) {
            return field8949;
        } else if (arg0 == 5) {
            return field8950;
        } else if (arg0 == 6) {
            return field8951;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)Z")
    public static final boolean method3573(int arg0, int arg1, int arg2) {
        field8942++;
        if (!class7.method55((byte) 85, arg2, arg1)) {
            return false;
        } else if (class512.method2767((byte) 46, arg2, arg1) | (arg1 & 0x9000) != 0 | class532.method2887(arg1, arg2, (byte) 36)) {
            return true;
        } else {
            if (arg0 != 3) {
                field8955 = 108L;
            }
            return (arg2 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | class177.method1122(arg2, -545, arg1) | class106.method600(arg2, arg1, -128));
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(IILbt;)V")
    private class638(int arg0, int arg1, class117 arg2) {
        this.field8944 = arg0;
        this.field8945 = arg1;
        this.field8941 = arg2;
        this.field8938 = this.field8941.field1505 * this.field8945;
        if (this.field8944 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lpl;IIIIZI)V")
    public static final void method3574(class612 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class316.field4061 = arg0;
        class436.field5443 = arg6;
        class149.field1920 = arg3;
        class235.field2946 = 1;
        class119.field1527 = arg1;
        class608.field8547 = arg4;
        field8936++;
        int var7 = 40 % ((arg2 + 41) / 49);
        class531.field7173 = arg5;
    }
}

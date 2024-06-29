import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class120 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lva;")
    public class497 field2024;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lva;")
    public class497 field2027;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Z")
    public boolean field2028;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Z")
    public boolean field2025;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Ljj;")
    public static class120 field2030 = new class120(0, class497.field6907, class497.field6907, 0, 1);

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Ljj;")
    public static class120 field2035 = new class120(1, class497.field6907, 2);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljj;")
    public static class120 field2036 = new class120(2, class497.field6907, class497.field6907, 2, 3);

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ljj;")
    public static class120 field2038 = new class120(3, class497.field6907, 3);

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Ljj;")
    public static class120 field2039 = new class120(4, class497.field6907, class497.field6907, 3, 4);

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Ljj;")
    public static class120 field2040 = new class120(5, class497.field6907, 4);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Ljj;")
    public static class120 field2041 = new class120(6, class497.field6907, 4);

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljj;")
    public static class120 field2042 = new class120(7, class497.field6907, class497.field6907, 4, 5);

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Ljj;")
    public static class120 field2043 = new class120(8, class497.field6907, class497.field6907, 5, 98, true, true);

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Ljj;")
    public static class120 field2044 = new class120(9, class497.field6907, 99);

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Ljj;")
    public static class120 field2045 = new class120(10, class497.field6907, 100);

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Ljj;")
    public static class120 field2046 = new class120(11, class497.field6908, class497.field6908, 0, 92, true, true);

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Ljj;")
    public static class120 field2047 = new class120(12, class497.field6908, class497.field6908, 92, 92);

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Ljj;")
    private static class120 field2048 = new class120(13, class497.field6908, class497.field6908, 92, 93);

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Ljj;")
    public static class120 field2049 = new class120(14, class497.field6908, class497.field6908, 94, 95);

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Ljj;")
    public static class120 field2050 = new class120(15, class497.field6908, class497.field6908, 96, 97);

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "Ljj;")
    public static class120 field2051 = new class120(16, class497.field6908, 97);

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "Ljj;")
    public static class120 field2052 = new class120(17, class497.field6908, 97);

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "Ljj;")
    public static class120 field2053 = new class120(18, class497.field6908, 100);

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "Ljj;")
    public static class120 field2054 = new class120(19, class497.field6908, 100);

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "Ljj;")
    public static class120 field2055 = new class120(20, class497.field6908, 100);

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "[I")
    public static int[] field2057 = new int[2];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILva;I)V", line = 5)
    private class120(int arg0, class497 arg1, int arg2) {
        this(arg0, arg1, arg1, arg2, arg2, true, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I", line = 9)
    public final int method1042(int arg0) {
        if (arg0 >= -109) {
            field2051 = null;
        }
        field2031++;
        return this.field2029;
    }

    @OriginalMember(owner = "client!jj", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field2034++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 28)
    public static void method1043(int arg0) {
        field2052 = null;
        field2044 = null;
        field2054 = null;
        field2050 = null;
        field2046 = null;
        field2039 = null;
        field2030 = null;
        field2038 = null;
        if (arg0 <= 42) {
            return;
        }
        field2051 = null;
        field2043 = null;
        field2055 = null;
        field2045 = null;
        field2036 = null;
        field2041 = null;
        field2035 = null;
        field2048 = null;
        field2057 = null;
        field2053 = null;
        field2042 = null;
        field2049 = null;
        field2040 = null;
        field2047 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Frame;Lwea;Z)V", line = 61)
    public static final void method1044(Frame arg0, class158 arg1, boolean arg2) {
        field2032++;
        while (true) {
            class622 var3 = arg1.method1222((byte) 89, arg0);
            while (var3.field8462 == 0) {
                class700.method3916((byte) -124, 10L);
            }
            if (var3.field8462 == 1) {
                arg0.setVisible(arg2);
                arg0.dispose();
                return;
            }
            class700.method3916((byte) 33, 100L);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILva;Lva;II)V", line = 87)
    private class120(int arg0, class497 arg1, class497 arg2, int arg3, int arg4) {
        this(arg0, arg1, arg2, arg3, arg4, true, false);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)[Ljj;", line = 96)
    public static final class120[] method1045(int arg0) {
        field2026++;
        int var1 = 108 / ((arg0 - 34) / 55);
        return new class120[] { field2030, field2035, field2036, field2038, field2039, field2040, field2041, field2042, field2043, field2044, field2045, field2046, field2047, field2048, field2049, field2050, field2051, field2052, field2053, field2054, field2055 };
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILva;Lva;IIZZ)V", line = 115)
    private class120(int arg0, class497 arg1, class497 arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        this.field2024 = arg1;
        this.field2033 = arg4;
        this.field2029 = arg0;
        this.field2037 = arg3;
        this.field2027 = arg2;
        this.field2028 = arg6;
        this.field2025 = arg5;
    }
}

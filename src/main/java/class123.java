import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class123 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lve;")
    public static class255 field2044 = null;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lve;")
    public static class255 field2047 = class87.method607(76, "<)4col> x");

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILtl;II)V", line = 4)
    public static final void method909(int arg0, class197 arg1, int arg2, int arg3) {
        field2049++;
        if (class300.field5110 != null || class156.field2651 || arg1 == null || class225.method1569(arg1, 126) == null) {
            return;
        }
        int var4 = 31 % ((35 - arg0) / 63);
        class300.field5110 = arg1;
        class30.field493 = class225.method1569(arg1, 124);
        class197.field3255 = arg3;
        class246.field4127 = 0;
        class16.field232 = arg2;
        class10.field138 = false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 30)
    public static void method910(int arg0) {
        if (arg0 != 0) {
            field2044 = (class255) null;
        }
        field2044 = null;
        field2047 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V", line = 41)
    public static final void method911(int arg0, byte arg1) {
        field2052++;
        class212.field3611.method562((byte) 79, arg0);
        if (arg1 < 71) {
            field2046 = 14;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IJ)V", line = 53)
    public static final void method912(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (arg0 == 0) {
            field2050++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 86)
    public static final Class method913(boolean arg0, String arg1) throws ClassNotFoundException {
        if (arg0) {
            method911(-38, (byte) 13);
        }
        field2053++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class245 extends class110 {

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3659 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field3665 = -1;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "J")
    public static long field3663 = 0L;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3661 = "glow1:";

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "[[I")
    public static int[][] field3658;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1726(boolean arg0) {
        field3659 = null;
        field3658 = (int[][]) null;
        field3661 = null;
        if (arg0) {
            method1727(12);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 25)
    public static final void method1727(int arg0) {
        int var1 = -35 / ((-arg0 - 6) / 56);
        field3660++;
        for (int var2 = 0; var2 < 5; var2++) {
            class41.field637[var2] = false;
        }
        class241.field3610 = 0;
        class73.field1112 = 1;
        class321.field5021 = -1;
        class294.field4620 = 0;
        class63.field918 = -1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 59)
    public static final Class method1728(boolean arg0, String arg1) throws ClassNotFoundException {
        field3664++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (!arg0) {
            return (Class) null;
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

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IJ)V", line = 101)
    public static final void method1729(int arg0, long arg1) {
        int var3 = 126 / ((arg0 - 67) / 53);
        field3666++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class303.method2156(false, arg1 - 1L);
            class303.method2156(false, 1L);
        } else {
            class303.method2156(false, arg1);
        }
    }
}

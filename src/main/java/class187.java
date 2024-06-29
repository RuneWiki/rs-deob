import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class187 extends class46 {

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2792 = -1;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2790 = "red:";

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lba;")
    public static class53 field2800 = new class53(64);

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "B")
    public byte field2798;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Ll;")
    public static class133 field2794;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Ljava/lang/String;")
    public String field2791;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Ljava/lang/String;")
    public String field2801;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 8)
    public static final void method1335(int arg0) {
        class241.field3846.method2176((byte) 117);
        class268.field4178.method2176((byte) -102);
        field2799++;
        int var1 = -82 % ((arg0 - 45) / 33);
        class281.field4342.method2176((byte) 97);
        class294.field4553.method2176((byte) -74);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 23)
    public static final Class method1336(int arg0, String arg1) throws ClassNotFoundException {
        field2797++;
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
        } else if (arg0 < 11) {
            return (Class) null;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V", line = 64)
    public static final void method1337(int arg0, boolean arg1) {
        field2804++;
        class241.field3846.method2175(arg0, -1401253017);
        class268.field4178.method2175(arg0, -1401253017);
        if (!arg1) {
            field2800 = (class53) null;
        }
        class281.field4342.method2175(arg0, -1401253017);
        class294.field4553.method2175(arg0, -1401253017);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)I", line = 78)
    public static final int method1338(boolean arg0) {
        if (arg0) {
            field2794 = (class133) null;
        }
        field2802++;
        return 6;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I", line = 103)
    public static final int method1339(int arg0, int arg1, int arg2) {
        field2795++;
        if (arg0 != 6) {
            method1339(79, 38, 73);
        }
        int var3 = arg1 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 120)
    public static void method1340(int arg0) {
        field2790 = null;
        if (arg0 != -1598287201) {
            field2792 = 81;
        }
        field2800 = null;
        field2794 = null;
    }
}

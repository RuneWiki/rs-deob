import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class122 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Z")
    public boolean field1834 = true;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
    public static boolean field1835 = true;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Lub;")
    public static class92 field1843;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method919(String arg0, byte arg1) throws ClassNotFoundException {
        field1836++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg1 != -75) {
            return null;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method920(int arg0, int arg1) {
        if (arg1 == -1) {
            field1839++;
            return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF1BDC) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public static final void method921(int arg0, int arg1) {
        field1842++;
        if (arg0 <= 75) {
            field1835 = false;
        }
        class254.field4063 = -1;
        class175.field2698 = arg1;
        class254.field4063 = -1;
        class195.method1395(28690);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JB)V")
    public static final void method922(long arg0, byte arg1) {
        if (arg1 > -91) {
            method921(79, -68);
        }
        field1838++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class73.method575((byte) -61, arg0 - 1L);
            class73.method575((byte) 124, 1L);
        } else {
            class73.method575((byte) -75, arg0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method923(int arg0) {
        if (arg0 != 0) {
            method920(68, 125);
        }
        field1843 = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1847 = arg5;
        this.field1845 = arg2;
        this.field1846 = arg1;
        this.field1837 = arg3;
        this.field1841 = arg4;
        this.field1844 = arg0;
        this.field1834 = arg6;
    }
}

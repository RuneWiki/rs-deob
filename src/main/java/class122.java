import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class122 extends RuntimeException {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljava/lang/String;")
    public String field1904;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1905;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field1900 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lna;")
    public static class26 field1903 = class69.method505("Hidden)2use", (byte) -124);

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[Lna;")
    public static class26[] field1906 = null;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1908 = 0;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1902 = -1;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[Lnc;")
    public static class145[] field1901 = new class145[4];

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1910;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIZI)V", line = 10)
    public static final void method839(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class56.field917 = arg1;
        field1911++;
        if (!arg4) {
            class158.field2466 = arg5;
            class141.field2159 = arg0;
            class92.field1524 = arg3;
            class4.field50 = arg2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I", line = 40)
    public static final int method840(byte arg0) {
        if (arg0 != -5) {
            field1910 = (String) null;
        }
        field1907++;
        return 6;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 49)
    public class122(Throwable arg0, String arg1) {
        this.field1904 = arg1;
        this.field1905 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I", line = 65)
    public static final int method841(int arg0, byte arg1) {
        field1909++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else if (arg1 == 59) {
            return arg0;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 97)
    public static void method842(boolean arg0) {
        field1900 = null;
        field1903 = null;
        field1901 = null;
        field1906 = null;
        if (arg0) {
            method841(-64, (byte) -87);
        }
        field1910 = null;
    }
}

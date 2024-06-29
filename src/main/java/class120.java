import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class120 {

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1827 = null;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field1837 = -1;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "F")
    public static float field1834;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Ll;")
    public static class133 field1831;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Ll;")
    public static class133 field1841;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[Ltb;")
    public static class220[] field1828;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ll;Ll;III)Lbf;", line = 8)
    public static final class329 method879(class133 arg0, class133 arg1, int arg2, int arg3, int arg4) {
        field1840++;
        if (arg3 != 12803) {
            method879((class133) null, (class133) null, 106, -52, 58);
        }
        return class181.method1296(false, arg0, arg2, arg4) ? class345.method2382(arg3 - 12804, arg1.method980(arg2, arg4, 5)) : null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 29)
    public static void method880(int arg0) {
        field1841 = null;
        field1828 = null;
        if (arg0 == 31379) {
            field1831 = null;
            field1827 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 64)
    public class120() {
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lfi;)V", line = 67)
    public class120(class120 arg0) {
        this.field1838 = arg0.field1838;
        this.field1829 = arg0.field1829;
        this.field1839 = arg0.field1839;
        this.field1826 = arg0.field1826;
    }
}

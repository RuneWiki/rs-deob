import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class135 extends class405 implements class224 {

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    private int field1906;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Z")
    public static boolean field1909 = false;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Ltc;")
    public static class320 field1905;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Lfk;")
    public static class598 field1907;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I", line = 5)
    public final int method965(int arg0) {
        ++field1910;
        int var2 = -53 / ((73 - arg0) / 33);
        return this.field1906;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method966(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method966(-71, 109, 97);
        }
        ++field1914;
        return (arg2 & 2048) != 0 | class295.method1846(arg2, arg1 ^ -21254, arg0) || class564.method3121(arg1 + -1, arg0, arg2);
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)I", line = 29)
    public final int method967(int arg0) {
        ++field1913;
        return arg0 != -5602 ? -102 : 0;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Len;I[BI)V", line = 49)
    public class135(class289 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1906 = arg1;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[BII)V", line = 63)
    public final void method968(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field1908;
        this.method2314(arg1, arg0);
        if (arg2 == -1842) {
            this.field1906 = arg3;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(III)Z", line = 76)
    public static final boolean method969(int arg0, int arg1, int arg2) {
        if (arg2 != -26881) {
            return true;
        } else {
            ++field1912;
            return ~(384 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 87)
    public static void method970(int arg0) {
        if (arg0 != 0) {
            method970(84);
        }
        field1905 = null;
        field1907 = null;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)J", line = 98)
    public final long method971(int arg0) {
        ++field1904;
        return arg0 != 20055 ? 49L : super.field5723.getAddress();
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class121 {

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Lkf;")
    public class256 field1931;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "B")
    public byte field1930;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Lct;")
    public class147 field1928;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Ltca;")
    public class174 field1926;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Lhr;")
    public class527 field1939;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Loo;")
    public class627 field1936;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIJZLwu;II)V")
    public static final void method974(int arg0, int arg1, int arg2, long arg3, boolean arg4, class376 arg5, int arg6, int arg7) {
        class307.field4417 = arg4;
        class172.field2631 = arg2;
        class577.field7577 = null;
        class506.field6765 = arg6;
        class524.field6961 = arg3;
        class556.field7305 = arg5;
        field1929++;
        class670.field9141 = 10000;
        class320.field4576 = 1;
        if (arg7 != 0) {
            field1937 = 19;
        }
        class175.field2641 = arg1;
        class65.field803 = arg0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z")
    public final boolean method975(int arg0) {
        if (arg0 == 4236) {
            field1932++;
            return this.field1930 == 2 || this.field1930 == 3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;)V")
    public static final void method976(boolean arg0, String arg1, byte arg2, String arg3) {
        class371.field5166 = arg3;
        class416.field5739 = arg1;
        if (arg2 != 16) {
            return;
        }
        field1925++;
        class499.field6721 = arg0;
        if (!class499.field6721 && class371.field5166.equals("") || class416.field5739.equals("")) {
            class484.method2735(3, (byte) -111);
            return;
        }
        class383.field5328 = false;
        if (class120.field1919 != 1) {
            class300.field4264 = -1;
            class283.field3999 = 0;
        }
        class484.method2735(-3, (byte) -111);
        class597.field7823 = 1;
        class347.field4876 = 0;
        class141.field2245 = 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZB)V")
    public static final void method977(boolean arg0, byte arg1) {
        field1927++;
        if (arg1 >= -122) {
            field1937 = 71;
        }
        for (class461 var2 = (class461) class496.field6692.method21(2); var2 != null; var2 = (class461) class496.field6692.method9(-127)) {
            if (var2.field6305 != null) {
                class603.field7927.method1612(var2.field6305);
                var2.field6305 = null;
            }
            if (var2.field6299 != null) {
                class603.field7927.method1612(var2.field6299);
                var2.field6299 = null;
            }
            var2.method3564(true);
        }
        if (!arg0) {
            return;
        }
        for (class461 var3 = (class461) class681.field9519.method21(2); var3 != null; var3 = (class461) class681.field9519.method9(-127)) {
            if (var3.field6305 != null) {
                class603.field7927.method1612(var3.field6305);
                var3.field6305 = null;
            }
            var3.method3564(true);
        }
        for (class461 var4 = (class461) class592.field7700.method2144(true); var4 != null; var4 = (class461) class592.field7700.method2146(false)) {
            if (var4.field6305 != null) {
                class603.field7927.method1612(var4.field6305);
                var4.field6305 = null;
            }
            var4.method3564(true);
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(BIIIIIILkf;)V")
    public class121(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class256 arg7) {
        this.field1931 = arg7;
        this.field1935 = arg6;
        this.field1933 = arg2;
        this.field1934 = arg3;
        this.field1938 = arg1;
        this.field1924 = arg4;
        this.field1930 = arg0;
        this.field1940 = arg5;
    }
}

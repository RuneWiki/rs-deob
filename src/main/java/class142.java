import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class142 extends RuntimeException {

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2095;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "Ljava/lang/String;")
    public String field2094;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "Lbu;")
    public static class21 field2098 = new class21(73, 6);

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "Lfba;")
    public static class27 field2100 = new class27(56, -1);

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "[I")
    public static int[] field2101 = new int[14];

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Lsha;")
    public static final class758 method1014(int arg0) {
        field2099++;
        if (arg0 > -65) {
            field2098 = null;
        }
        return class117.field1791;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        field2097++;
        if (class532.field7686 == null) {
            class452 var1 = new class452();
            byte[] var2 = var1.method2703(16, 47, 128, 128);
            class532.field7686 = class211.method1448(var2, false, 1908068769);
        }
        if (arg0 < -70 && class123.field1920 == null) {
            class670 var3 = new class670();
            byte[] var4 = var3.method3803(128, 16, 128, 116);
            class123.field1920 = class211.method1448(var4, false, 1908068769);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)V")
    public static final void method1016(int arg0, boolean arg1) {
        field2093++;
        class21.field353.method4080(true, class21.field353.field10075, 0);
        class21.field353.method4080(true, class21.field353.field10086, 0);
        class21.field353.method4080(true, class21.field353.field10058, 1);
        class21.field353.method4080(true, class21.field353.field10073, 1);
        class21.field353.method4080(true, class21.field353.field10067, 0);
        class21.field353.method4080(true, class21.field353.field10091, 0);
        class21.field353.method4080(true, class21.field353.field10089, 0);
        class21.field353.method4080(true, class21.field353.field10104, 0);
        class21.field353.method4080(true, class21.field353.field10064, 0);
        class21.field353.method4080(true, class21.field353.field10069, 0);
        class21.field353.method4080(true, class21.field353.field10062, 0);
        if (arg0 <= 37) {
            field2100 = null;
        }
        class21.field353.method4080(true, class21.field353.field10057, 0);
        class21.field353.method4080(true, class21.field353.field10080, 0);
        class21.field353.method4080(true, class21.field353.field10072, 0);
        class21.field353.method4080(true, class21.field353.field10096, 0);
        class21.field353.method4080(true, class21.field353.field10070, 0);
        class21.field353.method4080(true, class21.field353.field10102, 0);
        class21.field353.method4080(true, class21.field353.field10100, 0);
        class21.field353.method4080(true, class21.field353.field10090, 0);
        class318.method2060(true);
        class21.field353.method4080(true, class21.field353.field10087, 2);
        class21.field353.method4080(true, class21.field353.field10088, 1);
        class594.method3464(true);
        class37.method289((byte) 68);
        class446.field6088 = true;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIZZIILwia;)V")
    public static final void method1017(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, class791 arg6) {
        class90.field1011 = 1;
        class350.field4900 = arg5;
        class14.field279 = arg1;
        class665.field9257 = arg0;
        class741.field10208 = arg3;
        class161.field2559 = null;
        class353.field4975 = arg4;
        if (arg2) {
            method1018((byte) -96);
        }
        field2096++;
        class106.field1241 = arg6;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V")
    public static void method1018(byte arg0) {
        field2100 = null;
        field2098 = null;
        field2101 = null;
        if (arg0 < 97) {
            field2100 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class142(Throwable arg0, String arg1) {
        this.field2095 = arg0;
        this.field2094 = arg1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class166 extends class34 {

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Ldm;")
    public class23 field2933;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Lmf;")
    public static class174 field2935 = new class174(64);

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field2940 = 0;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "Lke;")
    private static class256 field2942 = class316.method2202("Loaded interfaces", 27626);

    @OriginalMember(owner = "client!je", name = "L", descriptor = "Lke;")
    private static class256 field2937 = class316.method2202("flash3:", 27626);

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Lke;")
    public static class256 field2943 = field2937;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "J")
    public static long field2938 = 0L;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "Lke;")
    public static class256 field2948 = field2937;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "Lke;")
    public static class256 field2944 = field2942;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Lng;")
    public static class138 field2939;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Lng;")
    public static class138 field2945;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "Lhj;")
    public static class243 field2949;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method1212(int arg0, int arg1) {
        if (arg1 >= -29) {
            field2944 = (class256) null;
        }
        field2936++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V", line = 24)
    public static void method1213(int arg0) {
        field2943 = null;
        field2939 = null;
        field2948 = null;
        field2944 = null;
        field2945 = null;
        field2949 = null;
        field2935 = null;
        if (arg0 >= -47) {
            field2938 = -69L;
        }
        field2942 = null;
        field2937 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V", line = 47)
    public static final void method1214(int arg0, int arg1) {
        class124.field2204[1] = (float) (class150.method1123(arg1, 65467) >> 8) / 255.0F;
        class124.field2204[2] = (float) class150.method1123(arg1, 255) / 255.0F;
        class124.field2204[0] = (float) class150.method1123(255, arg1 >> 16) / 255.0F;
        field2934++;
        class152.method1138(3, (byte) -100);
        class152.method1138(arg0, (byte) -100);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ldm;)V", line = 58)
    public class166(class23 arg0) {
        this.field2933 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lla;BI)Lke;", line = 76)
    public static final class256 method1215(class188 arg0, byte arg1, int arg2) {
        if (arg1 != 86) {
            field2940 = 125;
        }
        field2947++;
        if (!class157.method1170(client.method828(arg0), 1, arg2) && arg0.field3410 == null) {
            return null;
        } else if (arg0.field3341 == null || arg2 >= arg0.field3341.length || arg0.field3341[arg2] == null || arg0.field3341[arg2].method1768(false).method1799(127) == 0) {
            return class37.field654 ? class30.method214(new class256[] { class183.field3235, class305.method2125((byte) 42, arg2) }, 29784) : null;
        } else {
            return arg0.field3341[arg2];
        }
    }
}

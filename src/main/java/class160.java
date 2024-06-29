import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class160 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2447 = "wave:";

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[I")
    public static int[] field2450 = new int[5];

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2451 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2445 = "Please wait...";

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1078(int arg0) {
        field2450 = null;
        field2447 = null;
        if (arg0 != -1) {
            field2445 = null;
        }
        field2445 = null;
        field2451 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZILag;)V")
    public static final void method1079(boolean arg0, int arg1, class188 arg2) {
        field2446++;
        if (arg1 != 5) {
            return;
        }
        int var3 = arg2.field2997 == 0 ? arg2.field2922 : arg2.field2997;
        int var4 = arg2.field2900 == 0 ? arg2.field2928 : arg2.field2900;
        class79.method627(var4, var3, false, class261.field4006[arg2.field2977 >> 16], arg0, arg2.field2977);
        if (arg2.field2968 != null) {
            class79.method627(var4, var3, false, arg2.field2968, arg0, arg2.field2977);
        }
        class120 var5 = (class120) class13.field230.method1414(true, (long) arg2.field2977);
        if (var5 != null) {
            class134.method938(var5.field1852, var3, arg0, var4, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILuf;I)Lcg;")
    public static final class168 method1080(int arg0, int arg1, class176 arg2, int arg3) {
        field2449++;
        if (arg0 != 5) {
            field2451 = null;
        }
        return class261.method1750(arg2, arg1, arg3, (byte) 53) ? class186.method1254(0) : null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
    public static final void method1081(int arg0, int arg1) {
        int var2 = -85 / ((arg1 + 36) / 44);
        field2448++;
        class294.field4625.method1778(arg0, -32);
        class134.field2087.method1778(arg0, -33);
        class8.field176.method1778(arg0, -27);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class300 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[Lwp;")
    public static class288[] field4005 = new class288[5];

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4007;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "[Lc;")
    public static class436[] field4006;

    static {
        for (int var0 = 0; var0 < field4005.length; var0++) {
            field4005[var0] = new class288();
        }
        field4007 = new String[200];
        new class72(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 10)
    public static final String method1903(int arg0, boolean arg1, int arg2) {
        field4004++;
        if (arg1 && arg0 >= 0) {
            return arg2 == 1365 ? class241.method1537(10, arg1, -37, arg0) : null;
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 24)
    public static final int method1904(String arg0, int arg1) {
        field4002++;
        for (int var2 = 0; var2 < class148.field1733.length; var2++) {
            if (class148.field1733[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        int var3 = -27 % ((-arg1 - 17) / 34);
        return -1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILra;Lra;)V", line = 43)
    public static final void method1905(int arg0, class179 arg1, class179 arg2) {
        if (arg0 != 27417) {
            method1903(-96, false, -28);
        }
        if (arg2.field2089 != null) {
            arg2.method1123((byte) -31);
        }
        field4008++;
        arg2.field2089 = arg1;
        arg2.field2085 = arg1.field2085;
        arg2.field2089.field2085 = arg2;
        arg2.field2085.field2089 = arg2;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V", line = 61)
    public static void method1906(byte arg0) {
        field4006 = null;
        field4005 = null;
        field4007 = null;
        if (arg0 < 62) {
            field4006 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Z", line = 79)
    public static final boolean method1907(boolean arg0) {
        if (!arg0) {
            method1903(-106, true, -76);
        }
        field4003++;
        return class310.field4202;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;IIJLjava/lang/String;II)V", line = 92)
    public static final void method1908(int arg0, String arg1, int arg2, int arg3, long arg4, String arg5, int arg6, int arg7) {
        if (arg3 != 672) {
            field4007 = null;
        }
        field4001++;
        if (!class49.field574 && class57.field660 < 500) {
            int var9 = arg0 == -1 ? class46.field530 : arg0;
            class266 var10 = new class266(arg5, arg1, var9, arg7, arg4, arg6, arg2);
            class97.field1138.method1696(false, var10);
            class57.field660++;
        }
    }
}

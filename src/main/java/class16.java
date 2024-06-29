import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class120 {

    @OriginalMember(owner = "client!n", name = "o", descriptor = "J")
    public long field188;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Ljava/lang/String;")
    public static String field187 = "Loading world list data";

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Ljava/lang/String;")
    public static String field189 = "skill: ";

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Z")
    public static boolean field192 = true;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Ljava/lang/String;")
    public static String field194 = "Loaded interfaces";

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Ldl;")
    public static class123 field186;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
    public static int[] field195;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lbd;IILi;ILtg;IB)V")
    public static final void method113(class186 arg0, int arg1, int arg2, class56 arg3, int arg4, class181 arg5, int arg6, byte arg7) {
        field190++;
        if (arg7 != -49) {
            method115((byte) 87);
        }
        class190 var8 = new class190();
        var8.field3003 = arg6 * 128;
        var8.field2994 = arg1;
        var8.field2990 = arg2 * 128;
        if (arg5 != null) {
            var8.field3010 = arg5.field2801;
            var8.field3000 = arg5;
            var8.field3015 = arg5.field2865;
            int var9 = arg5.field2829;
            var8.field3001 = arg5.field2815;
            var8.field3018 = arg5.field2840;
            var8.field2999 = arg5.field2848 * 128;
            int var10 = arg5.field2813;
            if (arg4 == 1 || arg4 == 3) {
                var9 = arg5.field2813;
                var10 = arg5.field2829;
            }
            var8.field3007 = (arg2 + var10) * 128;
            var8.field3016 = (arg6 + var9) * 128;
            if (arg5.field2803 != null) {
                var8.field2995 = true;
                var8.method1332((byte) -100);
            }
            if (var8.field3015 != null) {
                var8.field3002 = (int) ((double) (var8.field3001 - var8.field3010) * Math.random()) + var8.field3010;
            }
            class205.field3207.method349(var8, true);
        } else if (arg3 != null) {
            var8.field2996 = arg3;
            class136 var11 = arg3.field793;
            if (var11.field1987 != null) {
                var8.field2995 = true;
                var11 = var11.method928(12);
            }
            if (var11 != null) {
                var8.field3016 = (var11.field2012 + arg6) * 128;
                var8.field3007 = (var11.field2012 + arg2) * 128;
                var8.field3018 = class258.method1773(arg3, arg7 ^ 0x4630);
                var8.field2999 = var11.field1994 * 128;
            }
            class54.field743.method349(var8, true);
        } else if (arg0 != null) {
            var8.field2991 = arg0;
            var8.field3016 = (arg0.method565((byte) 0) + arg6) * 128;
            var8.field3007 = (arg2 + arg0.method565((byte) 0)) * 128;
            var8.field3018 = class222.method1507(arg0, 0);
            var8.field2999 = arg0.field2925 * 128;
            class290.field4573.method662(0, var8, class162.method1116(arg0.field2912, (byte) 126));
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILdl;)V")
    public static final void method114(int arg0, class123 arg1) {
        class153.field2283 = arg1;
        if (arg0 != 128) {
            field195 = null;
        }
        field193++;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(J)V")
    public class16(long arg0) {
        this.field188 = arg0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method115(byte arg0) {
        field194 = null;
        field195 = null;
        if (arg0 == 103) {
            field187 = null;
            field186 = null;
            field189 = null;
        }
    }
}

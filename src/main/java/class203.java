import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class203 extends class257 {

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3235 = null;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3240 = "Attack";

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Lva;")
    public static class287 field3237 = new class287(0, 0);

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
    public static int[] field3242 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[I")
    public static int[] field3241 = new int[5];

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[S")
    public static short[] field3243 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field3246 = 0;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Ldk;")
    public static class251 field3244;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Ljava/lang/String;")
    public String field3232;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Ljava/lang/String;")
    public String field3236;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[[Z")
    public static boolean[][] field3245;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIILqk;IJIIII)Z")
    public static final boolean method1420(int arg0, int arg1, int arg2, int arg3, class2 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class263.method1768(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)J")
    public static final long method1421(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field2357; ++var4) {
                class179 var5 = var3.field2347[var4];
                if ((var5.field2933 >> 29 & 3L) == 2L && var5.field2931 == arg1 && var5.field2915 == arg2) {
                    return var5.field2933;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)Lad;")
    public final class5 method1422(int arg0) {
        if (arg0 >= -121) {
            return null;
        } else {
            ++field3239;
            return class17.field208[super.field4155];
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1423(int arg0, String arg1) {
        ++field3233;
        if (arg1 != null) {
            String var2 = class310.method2071(-28047, arg1);
            if (var2 != null) {
                if (arg0 != 1) {
                    field3242 = null;
                }
                for (int var3 = 0; ~var3 > ~class124.field1968; ++var3) {
                    String var4 = class310.method2071(arg0 + -28048, class258.field4165[var3]);
                    if (var4 != null && var4.equals(var2)) {
                        ++class119.field1903;
                        --class124.field1968;
                        for (int var5 = var3; class124.field1968 > var5; ++var5) {
                            class258.field4165[var5] = class258.field4165[var5 + 1];
                            class308.field4931[var5] = class308.field4931[var5 + 1];
                            class279.field4478[var5] = class279.field4478[var5 + 1];
                            class103.field1657[var5] = class103.field1657[var5 - -1];
                            class236.field3797[var5] = class236.field3797[var5 + 1];
                            class240.field3838[var5] = class240.field3838[var5 + 1];
                        }
                        class205.field3264 = class74.field1237;
                        class314.field5061.method828(107, 101);
                        class314.field5061.method1108(class230.method1551(arg1, (byte) -87), true);
                        class314.field5061.method1148((byte) -99, arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public static void method1424(byte arg0) {
        field3240 = null;
        field3241 = null;
        field3237 = null;
        field3245 = null;
        field3243 = null;
        field3244 = null;
        field3235 = null;
        field3242 = null;
        if (arg0 <= 76) {
            field3243 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZILoh;IZII)Lbl;")
    public static final class146 method1425(boolean arg0, int arg1, class264 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field3234;
        int var8 = (arg3 << 17) + (!arg0 ? 0 : 65536) + (arg1 << 19) + arg5;
        long var9 = (long) arg6 * 3147483667L + (long) var8 * 3849834839L;
        class146 var11 = (class146) class308.field4923.method1261(0, var9);
        if (var11 != null) {
            return var11;
        } else {
            class302.field4822 = false;
            class146 var12 = class88.method603(arg4, arg5, arg0, arg6, arg4, arg3, arg2, arg1, false);
            if (var12 != null && !class302.field4822) {
                class308.field4923.method1264(-1, var9, var12);
            }
            return var12;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class168 extends class249 {

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lmb;")
    public static class96 field2955 = class243.method1708("Suche nach Updates )2 ", (byte) 124);

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "[I")
    public static int[] field2958 = new int[25];

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Lmb;")
    private static class96 field2959 = class243.method1708("Please wait )2 attempting to reestablish)3", (byte) 96);

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Lmb;")
    public static class96 field2953 = field2959;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Lff;")
    public static class3 field2960;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public static final void method1209(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class163.field2893; var3++) {
            for (int var4 = 0; var4 < class264.field4614; var4++) {
                for (int var5 = 0; var5 < class17.field254; var5++) {
                    class187 var6 = class259.field4487[var3][var4][var5];
                    if (var6 != null) {
                        class19 var7 = var6.field3281;
                        if (var7 != null && var7.field311.method831()) {
                            class120.method928(var7.field311, var3, var4, var5, 1, 1);
                            if (var7.field303 != null && var7.field303.method831()) {
                                class120.method928(var7.field303, var3, var4, var5, 1, 1);
                                var7.field311.method832(var7.field303, 0, 0, 0, false);
                                var7.field303 = var7.field303.method829(arg0, arg1, arg2);
                            }
                            var7.field311 = var7.field311.method829(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3282; var8++) {
                            class70 var10 = var6.field3274[var8];
                            if (var10 != null && var10.field1214.method831()) {
                                class120.method928(var10.field1214, var3, var4, var5, var10.field1205 + 1 - var10.field1208, var10.field1211 - var10.field1204 + 1);
                                var10.field1214 = var10.field1214.method829(arg0, arg1, arg2);
                            }
                        }
                        class5 var9 = var6.field3279;
                        if (var9 != null && var9.field104.method831()) {
                            class146.method1080(var9.field104, var3, var4, var5);
                            var9.field104 = var9.field104.method829(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1210(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg6 - arg2 >= class9.field145 && class162.field2884 >= (arg2 + arg6) && client.field1994 <= (arg4 - arg2) && (arg4 + arg2) <= class9.field149) {
            class186.method1320(arg1, arg0, arg4, 30750, arg6, arg5, arg2);
        } else {
            class106.method789(30867, arg5, arg2, arg0, arg6, arg4, arg1);
        }
        field2957++;
        if (arg3) {
            field2953 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V")
    public static void method1211(boolean arg0) {
        field2959 = null;
        field2953 = null;
        field2955 = null;
        field2960 = null;
        field2958 = null;
        if (arg0) {
            field2955 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Z")
    public static final boolean method1212(int arg0, int arg1) {
        field2956++;
        if (arg1 == 8764) {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        } else {
            return false;
        }
    }
}

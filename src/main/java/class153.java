import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class153 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "J")
    public long field2358 = 0L;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lj;")
    public class7 field2373;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILsk;ZZIZI)Lbf;", line = 5)
    public static final class58 method1105(int arg0, int arg1, int arg2, class106 arg3, boolean arg4, boolean arg5, int arg6, boolean arg7, int arg8) {
        field2370++;
        class330 var9 = class285.method2054(arg8, 0);
        if (arg0 > 1 && var9.field5093 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field5134[var11] <= arg0 && var9.field5134[var11] != 0) {
                    var10 = var9.field5093[var11];
                }
            }
            if (var10 != -1) {
                var9 = class285.method2054(var10, 0);
            }
        }
        class250 var12 = var9.method2310(arg3, (byte) 49);
        if (var12 == null) {
            return null;
        }
        class220 var13 = null;
        if (var9.field5144 != -1) {
            var13 = (class220) method1105(10, 0, 1, arg3, false, true, 118, true, var9.field5150);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field5158 != -1) {
            var13 = (class220) method1105(arg0, arg1, arg2, arg3, false, true, 97, false, var9.field5130);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class59.field833;
        int var15 = class59.field827;
        int var16 = class59.field828;
        int[] var17 = new int[4];
        class59.method404(var17);
        class220 var18 = new class220(36, 32);
        class59.method401(var18.field3545, 36, 32);
        class170.method1250();
        class170.method1247(16, 16);
        if (arg6 < 93) {
            return (class58) null;
        }
        class170.field2816 = false;
        int var19 = var9.field5138;
        if (arg7) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class170.field2801[var9.field5089] * var19 >> 16;
        int var21 = class170.field2810[var9.field5089] * var19 >> 16;
        var12.method1171(0, var9.field5140, var9.field5133, var9.field5089, var9.field5125, var20 - (var12.method33() / 2 - var9.field5104), var21 - -var9.field5104, -1L);
        if (arg2 >= 1) {
            var18.method1561(1);
            if (arg2 >= 2) {
                var18.method1561(16777215);
            }
            class59.method401(var18.field3545, 36, 32);
        }
        if (arg1 != 0) {
            var18.method1566(arg1);
        }
        if (var9.field5144 != -1) {
            var13.method375(0, 0);
        } else if (var9.field5158 != -1) {
            class59.method401(var13.field3545, 36, 32);
            var18.method375(0, 0);
            var18 = var13;
        }
        if (arg4 && (var9.field5097 == 1 || arg0 != 1) && arg0 != -1) {
            class48.field667.method1808(class144.method1060((byte) 123, arg0), 0, 9, 16776960, 1);
        }
        class59.method401(var14, var15, var16);
        class59.method385(var17);
        class170.method1250();
        class170.field2816 = true;
        return class232.field3690 && !arg5 ? new class314(var18) : var18;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILqm;)I", line = 139)
    public static final int method1106(int arg0, class334 arg1) {
        field2364++;
        int var2 = arg1.field5218;
        if (arg0 != -2) {
            return 72;
        }
        class17 var3 = arg1.method1876((byte) 125);
        if (arg1.field4232 == var3.field200) {
            var2 = arg1.field5211;
        } else if (arg1.field4232 == var3.field229 || arg1.field4232 == var3.field210 || arg1.field4232 == var3.field217 || arg1.field4232 == var3.field202) {
            var2 = arg1.field5206;
        } else if (arg1.field4232 == var3.field224 || arg1.field4232 == var3.field208 || arg1.field4232 == var3.field218 || arg1.field4232 == var3.field199) {
            var2 = arg1.field5201;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 172)
    public static final String[] method1107(String[] arg0, int arg1) {
        field2363++;
        String[] var2 = new String[5];
        int var3 = -13 / ((4 - arg1) / 51);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = var4 + ": ";
            if (arg0 != null && arg0[var4] != null) {
                var2[var4] = var2[var4] + arg0[var4];
            }
        }
        return var2;
    }
}

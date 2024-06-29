import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class22 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field285 = new String[1000];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lve;")
    public static class233 field289;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field287++;
        if (class93.field1412 <= arg1 && arg2 <= class142.field2061 && arg4 >= class93.field1418 && class254.field3857 >= arg3) {
            if (arg0 == 1) {
                class161.method1078(arg1, arg2, arg6, -27138, arg3, arg4);
            } else {
                class243.method1583(arg6, arg3, arg4, (byte) 103, arg1, arg0, arg2);
            }
        } else if (arg0 == 1) {
            method163(arg1, arg6, arg4, arg2, false, arg3);
        } else {
            class113.method730(arg2, arg1, 96, arg0, arg4, arg3, arg6);
        }
        if (arg5 != 25) {
            method162(51, 93);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method162(int arg0, int arg1) {
        if (arg0 >= -98) {
            return null;
        } else {
            field288++;
            return arg1 < 999999999 ? Integer.toString(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZI)V")
    private static final void method163(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            field289 = null;
        }
        field286++;
        if (arg2 > class254.field3857 || arg5 < class93.field1418) {
            return;
        }
        boolean var6;
        if (class93.field1412 > arg0) {
            var6 = false;
            arg0 = class93.field1412;
        } else if (class142.field2061 < arg0) {
            var6 = false;
            arg0 = class142.field2061;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg3 < class93.field1412) {
            var7 = false;
            arg3 = class93.field1412;
        } else if (arg3 > class142.field2061) {
            arg3 = class142.field2061;
            var7 = false;
        } else {
            var7 = true;
        }
        if (arg2 >= class93.field1418) {
            class183.method1181(arg1, (byte) -69, arg3, class163.field2370[arg2++], arg0);
        } else {
            arg2 = class93.field1418;
        }
        if (arg5 <= class254.field3857) {
            class183.method1181(arg1, (byte) -69, arg3, class163.field2370[arg5--], arg0);
        } else {
            arg5 = class254.field3857;
        }
        if (var6 && var7) {
            for (int var8 = arg2; var8 <= arg5; var8++) {
                int[] var9 = class163.field2370[var8];
                var9[arg0] = var9[arg3] = arg1;
            }
        } else if (var6) {
            for (int var11 = arg2; var11 <= arg5; var11++) {
                class163.field2370[var11][arg0] = arg1;
            }
        } else if (var7) {
            for (int var10 = arg2; var10 <= arg5; var10++) {
                class163.field2370[var10][arg3] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method164(byte arg0, String arg1) {
        if (arg0 <= 39) {
            method165(49, false, -32);
        }
        int var2 = class251.method1656(arg1, -118);
        field290++;
        if (var2 != -1) {
            class218.method1404(class168.field2440.field1201[var2], 100, class168.field2440.field1200[var2]);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI)Lha;")
    public static final class267 method165(int arg0, boolean arg1, int arg2) {
        field284++;
        class267 var3 = class282.method1897(arg2, 118);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field4160 == null || arg0 >= var3.field4160.length) {
            return null;
        } else {
            if (arg1) {
                field289 = null;
            }
            return var3.field4160[arg0];
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method166(int arg0) {
        field289 = null;
        field285 = null;
        int var1 = 20 % ((-arg0 - 3) / 42);
    }
}

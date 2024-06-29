import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class23 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field280 = "Started 3d Library";

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lf;")
    public class226 field285;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lre;")
    public static class266 field281;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
    public int[] field279;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIBIII)V")
    public static final void method139(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (class230.field3302 >= arg1 && class286.field4431 <= arg3) {
            boolean var6;
            if (arg5 < class177.field2514) {
                arg5 = class177.field2514;
                var6 = false;
            } else if (arg5 <= class279.field4238) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class279.field4238;
            }
            boolean var7;
            if (class177.field2514 > arg4) {
                arg4 = class177.field2514;
                var7 = false;
            } else if (class279.field4238 < arg4) {
                var7 = false;
                arg4 = class279.field4238;
            } else {
                var7 = true;
            }
            if (class286.field4431 <= arg1) {
                class76.method463(arg5, 0, arg0, arg4, class268.field3919[arg1++]);
            } else {
                arg1 = class286.field4431;
            }
            if (arg3 > class230.field3302) {
                arg3 = class230.field3302;
            } else {
                class76.method463(arg5, 0, arg0, arg4, class268.field3919[arg3--]);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg3; var8++) {
                    int[] var9 = class268.field3919[var8];
                    var9[arg5] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg1; var11 <= arg3; var11++) {
                    class268.field3919[var11][arg5] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg1; var10 <= arg3; var10++) {
                    class268.field3919[var10][arg4] = arg0;
                }
            }
        }
        field282++;
        if (arg2 <= 10) {
            method142((byte) -108);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZIII)V")
    public static final void method140(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field284++;
        class121.field1725 = arg0;
        if (arg4 != 13015) {
            field278 = 76;
        }
        class117.field1653 = arg1;
        class133.field1929 = arg6;
        class293.field4637 = arg2;
        class243.field3546 = arg5;
        if (arg3 && class121.field1725 >= 100) {
            class204.field2902 = class293.field4637 * 128 + 64;
            class245.field3560 = class133.field1929 * 128 + 64;
            class225.field3172 = class4.method21(class204.field2902, class199.field2833, class245.field3560, (byte) 26) - class243.field3546;
        }
        class4.field61 = 2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method141(int arg0) {
        field280 = null;
        if (arg0 == 0) {
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static final void method142(byte arg0) {
        field276++;
        class243.field3544.method71(-125);
        if (arg0 != -95) {
            method143(54, (String) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method143(int arg0, String arg1) {
        field283++;
        if (arg0 != 22976) {
            method139(-54, -43, (byte) -6, 18, -121, 9);
        }
        for (int var2 = 0; var2 < class269.field3931.length; var2++) {
            if (class269.field3931[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}

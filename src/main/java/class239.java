import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class239 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ll;")
    public static class127 field3307;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[Lo;")
    public static class359[] field3301;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[[[Lwr;")
    public static class532[][][] field3306;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V", line = 4)
    private static final void method1455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3304++;
        if (arg2 != -2) {
            field3301 = null;
        }
        int var7 = arg1 - arg6;
        int var8 = arg5 + arg6;
        for (int var9 = arg5; var9 < var8; var9++) {
            class188.method1259(arg4, (byte) 27, arg0, arg3, class42.field626[var9]);
        }
        int var10 = arg4 + arg6;
        for (int var11 = arg1; var11 > var7; var11--) {
            class188.method1259(arg4, (byte) 27, arg0, arg3, class42.field626[var11]);
        }
        int var12 = arg0 - arg6;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class42.field626[var13];
            class188.method1259(arg4, (byte) 27, var10, arg3, var14);
            class188.method1259(var12, (byte) 27, arg0, arg3, var14);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIIII)V", line = 52)
    public static final void method1456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 >= class519.field7633 && class375.field5387 >= arg0 && arg5 >= class23.field320 && arg3 <= class233.field3241) {
            if (arg6 == 1) {
                class30.method221((byte) -82, arg5, arg2, arg0, arg4, arg3);
            } else {
                method1455(arg0, arg3, -2, arg2, arg4, arg5, arg6);
            }
        } else if (arg6 == 1) {
            class422.method2523(arg2, arg3, arg5, arg0, 438908784, arg4);
        } else {
            class528.method3125(arg5, arg4, arg0, arg3, arg1 - 65, arg6, arg2);
        }
        field3302++;
        if (arg1 != 1) {
            field3306 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 83)
    public static void method1457(int arg0) {
        field3306 = null;
        field3301 = null;
        if (arg0 != 1) {
            method1457(59);
        }
        field3307 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLat;I)I", line = 100)
    public static final int method1458(byte arg0, class444 arg1, int arg2) {
        field3305++;
        if (!client.method3067(arg1).method2552((byte) -49, arg2) && arg1.field6536 == null) {
            return -1;
        } else {
            if (arg0 != -82) {
                method1458((byte) -101, null, -49);
            }
            return arg1.field6403 == null || arg1.field6403.length <= arg2 ? -1 : arg1.field6403[arg2];
        }
    }
}

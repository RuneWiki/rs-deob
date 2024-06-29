import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class78 {

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "[S")
    private static short[] field1131 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!cja", name = "h", descriptor = "[S")
    private static short[] field1135 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!cja", name = "g", descriptor = "[S")
    private static short[] field1134 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "[S")
    private static short[] field1130 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!cja", name = "f", descriptor = "[[S")
    public static short[][] field1133 = new short[][] { field1134, field1130, field1131, field1135 };

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "F")
    public static float field1128;

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!cja", name = "j", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!cja", name = "i", descriptor = "Lfd;")
    public static class298 field1136;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(ZIFIZIIII)[[I")
    public static final int[][] method575(boolean arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field1132++;
        int[][] var9 = new int[arg3][arg8];
        class218 var10 = new class218();
        var10.field2849 = (int) (arg2 * 4096.0F);
        var10.field2847 = arg6;
        var10.field2844 = arg5;
        var10.field2843 = arg0;
        if (arg4) {
            method576(true);
        }
        var10.field2853 = arg7;
        var10.method184(-2);
        class495.method2999((byte) 51, arg8, arg3);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method1280(29, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Z)V")
    public static void method576(boolean arg0) {
        field1135 = null;
        if (!arg0) {
            return;
        }
        field1133 = null;
        field1130 = null;
        field1131 = null;
        field1136 = null;
        field1134 = null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I[BILjava/lang/String;)I")
    public static final int method577(int arg0, byte[] arg1, int arg2, String arg3) {
        field1137++;
        int var4 = arg2;
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class680.method3830(arg3.charAt(var6), arg0 ^ 0x58);
            int var8 = var6 + 1 < var5 ? class680.method3830(arg3.charAt(var6 + 1), -85) : -1;
            int var9 = var6 + 2 < var5 ? class680.method3830(arg3.charAt(var6 + 2), -84) : -1;
            int var10 = var6 + 3 >= var5 ? -1 : class680.method3830(arg3.charAt(var6 + 3), arg0 ^ 0x74);
            arg1[arg2++] = (byte) class678.method3817(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class678.method3817(class665.method3759(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class678.method3817(class665.method3759(var9 << 6, 192), var10);
        }
        if (arg0 != -3) {
            method575(true, -94, 2.188075F, 10, true, 103, -111, 121, 43);
        }
        return arg2 - var4;
    }
}

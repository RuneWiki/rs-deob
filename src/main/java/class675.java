import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class675 extends class381 {

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([[BILeda;)V", line = 6)
    public static final void method3770(byte[][] arg0, int arg1, class90 arg2) {
        field9542++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field3490; var4++) {
            class381.method2226((byte) -57);
            for (int var5 = 0; var5 < class34.field530 >> 3; var5++) {
                for (int var6 = 0; var6 < class34.field531 >> 3; var6++) {
                    int var7 = class242.field3381[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field3479 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFDC15) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class376.field5072.length; var13++) {
                                if (class376.field5072[var13] == var12 && arg0[var13] != null) {
                                    class335 var14 = new class335(arg0[var13]);
                                    arg2.method1535(var14, var8, var9, class591.field7820, 7, var10, var5 * 8, var6 * 8, var4, var11);
                                    arg2.method719(var4, class10.field197, var10, var6 * 8, var11, var9, var14, (byte) -93, var3[0] == -1 ? var3 : null, var5 * 8, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -2) {
            method3770(null, -68, null);
        }
        if (var3[0] != -1) {
            class111.field1784 = class152.field2405.method1004(var3[1], var3[0], true, var3[3], class328.field4518, var3[2]);
            class292.field4124 = var3[4];
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIFZIII)[[I", line = 95)
    public static final int[][] method3771(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field9540++;
        int[][] var9 = new int[arg0][arg6];
        class63 var10 = new class63();
        var10.field976 = arg5;
        var10.field963 = arg1;
        var10.field975 = arg7;
        var10.field972 = (int) ((float) arg2 * arg4);
        var10.field967 = arg8;
        var10.method10(12404);
        class665.method3734((byte) 16, arg6, arg0);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method506(var9[var11], arg2 - 35159, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Z", line = 124)
    public static final boolean method3772(int arg0) {
        if (arg0 == 20743) {
            field9541++;
            return class275.method1669(0, "jaclib") ? class275.method1669(0, "hw3d") : false;
        } else {
            return false;
        }
    }
}

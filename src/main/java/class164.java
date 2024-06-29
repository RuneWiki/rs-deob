import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class164 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Z")
    public static boolean field2233 = true;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field2235 = -1;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[[[I")
    public static int[][][] field2231;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 7)
    public static void method1108(byte arg0) {
        field2231 = null;
        if (arg0 != -56) {
            field2235 = 37;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIIBI)V", line = 18)
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg7 == arg9 && arg2 == arg3 && arg0 == arg1 && arg5 == arg6) {
            class39.method293(arg9, arg0, arg4, (byte) 97, arg2, arg6);
        } else {
            int var10 = arg9;
            int var11 = arg2;
            int var12 = arg9 * 3;
            int var13 = arg2 * 3;
            int var14 = arg7 * 3;
            int var15 = arg3 * 3;
            int var16 = arg1 * 3;
            int var17 = arg5 * 3;
            int var18 = arg0 + var14 - var16 - arg9;
            int var19 = arg6 - var17 - (-var15 - -arg2);
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg9 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg2;
                class39.method293(var10, var33, arg4, (byte) 77, var11, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg8 <= 39) {
            field2233 = true;
        }
        field2232++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Lbd;", line = 93)
    public static final class27 method1110(int arg0) {
        field2230++;
        if (class200.field2763 == null || class36.field555 == null) {
            return null;
        }
        if (arg0 != -24377) {
            method1108((byte) -16);
        }
        for (class27 var1 = (class27) class36.field555.method2305(-88); var1 != null; var1 = (class27) class36.field555.method2305(arg0 + 24279)) {
            class170 var2 = class174.method1160(-28930, var1.field462);
            if (var2 != null && var2.field2330 && var2.method1138(arg0 + 20254)) {
                return var1;
            }
        }
        return null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class339 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[S")
    public static short[] field4982 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Los;")
    public static class378 field4990;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[I")
    public static int[] field4983;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "[Z")
    public static boolean[] field4991;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method2240(byte arg0) {
        field4983 = null;
        field4991 = null;
        field4990 = null;
        int var1 = -14 / ((32 - arg0) / 58);
        field4982 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V")
    public static final void method2241(boolean arg0, byte arg1) {
        field4987++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class387.field5785;
        } else {
            var3 = class240.field3383;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var12 = null;
            byte[] var13 = var3[var5];
            int var14 = class106.field1417[var5] >> 8;
            int var15 = class106.field1417[var5] & 0xFF;
            int var16 = var14 * 64 - class184.field2482;
            int var17 = var15 * 64 - class38.field620;
            if (var13 != null) {
                class87.method540(99);
                var12 = class310.method1937(var16, class35.field574, arg0, (byte) 82, class184.field2482, var2, class119.field1605, var13, class38.field620, var17);
            }
            if (!arg0 && class93.field1276 / 8 == var14 && (class249.field3539 / 8) == var15) {
                if (var12 == null) {
                    class94.field1305 = null;
                } else {
                    class94.field1305 = class277.method1769(var12[0], var12[1], var12[3], (byte) 104, var12[2]);
                    class179.field2350 = var12[4];
                }
            }
        }
        int var6 = -116 % ((arg1 + 68) / 49);
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = (class106.field1417[var7] >> 8) * 64 - class184.field2482;
            int var9 = (class106.field1417[var7] & 0xFF) * 64 - class38.field620;
            byte[] var10 = var3[var7];
            if (var10 == null && class249.field3539 < 800) {
                class87.method540(-87);
                for (int var11 = 0; var11 < var2; var11++) {
                    class91.method565(64, var9, 64, -22467, var11, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)I")
    public static final int method2242(int arg0, int arg1, int arg2, int arg3) {
        field4981++;
        int var4 = ((arg3 & 0xFF00) * arg1 & 0xFF0000 | arg0 & (arg3 & 0xFF00FF) * arg1) >>> 8;
        int var5 = 255 - arg1;
        return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public static final void method2243(byte arg0) {
        for (int var1 = 0; var1 < class37.field606.length; var1++) {
            for (int var2 = 0; var2 < class37.field606[0].length; var2++) {
                for (int var3 = 0; var3 < class37.field606[0][0].length; var3++) {
                    class37.field606[var1][var2][var3] = 0;
                }
            }
        }
        field4986++;
        if (arg0 > -101) {
            method2240((byte) -4);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIIIILnr;[[[B)V")
    public static final void method2244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class437 arg11, byte[][][] arg12) {
        field4985++;
        if (arg0 == 0 || arg1 == 0) {
            return;
        }
        if (arg2 != 16711680) {
            method2243((byte) 101);
        }
        if (arg0 == 9) {
            arg0 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        if (arg0 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg0 = 1;
        }
        if (arg0 == 11) {
            arg0 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        arg11.method2065(arg7, arg8, arg9, arg4, arg10, arg5, arg12[arg0 - 1][arg3], arg1, arg6);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
    public static final int method2245(int arg0, int arg1) {
        field4988++;
        if (arg0 != -348018488) {
            method2245(-79, 14);
        }
        return arg1 >>> 8;
    }
}

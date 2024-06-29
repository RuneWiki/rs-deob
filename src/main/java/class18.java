import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class18 extends class73 {

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "[I")
    public int[] field286 = new int[] { -1 };

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "[I")
    public int[] field285 = new int[1];

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lli;")
    public static class185 field287 = class245.method1649("ondulation:", 126);

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lli;")
    public static class185 field289 = class245.method1649("um", -70);

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field288 = 0;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Lli;")
    public static class185 field297 = class245.method1649("clignotant2:", 124);

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field293 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field296 = 0;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "S")
    public static short field300 = 256;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lse;")
    public static class10 field290;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "[I")
    public static int[] field295;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZ)V")
    public static final void method126(byte arg0, boolean arg1) {
        field294++;
        byte[][] var2 = class149.field2815;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class141.field2640[var5] >> 8) * 64 - class77.field1339;
            int var12 = (class141.field2640[var5] & 0xFF) * 64 - class107.field1933;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class125.method907((byte) -21);
                class108.method763(class265.field4704 * 8 - 48, var11, (class103.field1868 - 6) * 8, arg1, var13, class165.field3090, var12, (byte) 121);
            }
        }
        if (arg0 >= -79) {
            return;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class141.field2640[var6] & 0xFF) * 64 - class107.field1933;
            int var8 = (class141.field2640[var6] >> 8) * 64 - class77.field1339;
            byte[] var9 = var2[var6];
            if (var9 == null && class265.field4704 < 800) {
                class125.method907((byte) -21);
                for (int var10 = 0; var10 < var3; var10++) {
                    class274.method1879(var8, var10, -1, 64, var7, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method127(byte arg0) {
        field290 = null;
        if (arg0 == 100) {
            field287 = null;
            field297 = null;
            field295 = null;
            field289 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lne;")
    public static final class199 method128(int arg0) {
        if (arg0 == 16) {
            field291++;
            return class121.field2210.length > class145.field2754 ? class121.field2210[class145.field2754++] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Z)Lda;")
    public static final class101 method129(boolean arg0) {
        field284++;
        int var1 = class55.field940[0] * class258.field4591[0];
        byte[] var2 = class174.field3182[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class211.field3842[class220.method1526(var2[var4], 255)];
        }
        class101 var5 = new class101(class87.field1716, class210.field3839, class145.field2766[0], class249.field4418[0], class55.field940[0], class258.field4591[0], var3);
        if (arg0) {
            field290 = null;
        }
        class269.method1827((byte) -122);
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class267 var20 = new class267(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class153.field2896[var21][arg1][arg2] == null) {
                    class153.field2896[var21][arg1][arg2] = new class198(var21, arg1, arg2);
                }
            }
            class153.field2896[arg0][arg1][arg2].field3648 = var20;
        } else if (arg3 == 1) {
            class267 var22 = new class267(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class153.field2896[var23][arg1][arg2] == null) {
                    class153.field2896[var23][arg1][arg2] = new class198(var23, arg1, arg2);
                }
            }
            class153.field2896[arg0][arg1][arg2].field3648 = var22;
        } else {
            class219 var24 = new class219(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class153.field2896[var25][arg1][arg2] == null) {
                    class153.field2896[var25][arg1][arg2] = new class198(var25, arg1, arg2);
                }
            }
            class153.field2896[arg0][arg1][arg2].field3633 = var24;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class175 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Lri;")
    public static class195[] field3156 = new class195[6];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field3161 = 255;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field3164 = 0;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lge;")
    public static class71 field3162 = new class71(100);

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lkh;")
    private static class117 field3168 = class224.method1450((byte) 112, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lkh;")
    public static class117 field3170 = field3168;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lkh;")
    public static class117 field3167 = field3168;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lvb;")
    public static class232 field3158;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[[[I")
    public static int[][][] field3166;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field3166 = null;
        if (arg0 >= -66) {
            field3166 = null;
        }
        field3156 = null;
        field3170 = null;
        field3158 = null;
        field3167 = null;
        field3168 = null;
        field3162 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1221(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3163++;
        if (arg5) {
            for (int var6 = arg4; var6 <= arg1; var6++) {
                class114.method762(arg3, 117, arg2, arg0, class167.field3030[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class169.method1193((byte) -103, arg4);
        int var7 = 0;
        field3165++;
        int var8 = arg4 - arg2;
        if (arg6 > var8) {
            var8 = 0;
        }
        int var9 = -arg4;
        int var10 = arg4;
        int var11 = -var8;
        int var12 = var8;
        int var13 = -1;
        int var14 = arg0 - var8;
        int[] var15 = class167.field3030[arg5];
        int var16 = -1;
        class114.method762(arg0 - arg4, arg6 + 99, var14, arg1, var15);
        int var17 = arg0 + var8;
        class114.method762(var14, 118, var17, arg3, var15);
        class114.method762(var17, 88, arg0 + arg4, arg1, var15);
        while (var10 > var7) {
            var13 += 2;
            var16 += 2;
            var9 += var16;
            var11 += var13;
            if (var11 >= 0 && var12 >= 1) {
                class61.field1230[var12] = var7;
                var12--;
                var11 -= var12 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var10 < var8) {
                    int[] var18 = class167.field3030[arg5 - var10];
                    int var19 = class61.field1230[var10];
                    int var20 = arg0 + var7;
                    int[] var21 = class167.field3030[arg5 + var10];
                    int var22 = arg0 - var7;
                    int var23 = arg0 + var19;
                    int var24 = arg0 - var19;
                    class114.method762(var22, 105, var24, arg1, var21);
                    class114.method762(var24, 91, var23, arg3, var21);
                    class114.method762(var23, 97, var20, arg1, var21);
                    class114.method762(var22, 114, var24, arg1, var18);
                    class114.method762(var24, arg6 + 91, var23, arg3, var18);
                    class114.method762(var23, arg6 + 74, var20, arg1, var18);
                } else {
                    int[] var25 = class167.field3030[arg5 + var10];
                    int var26 = arg0 + var7;
                    int var27 = arg0 - var7;
                    int[] var28 = class167.field3030[arg5 - var10];
                    class114.method762(var27, arg6 ^ 0x76, var26, arg1, var25);
                    class114.method762(var27, 110, var26, arg1, var28);
                }
            }
            int[] var29 = class167.field3030[arg5 + var7];
            int[] var30 = class167.field3030[arg5 - var7];
            int var31 = arg0 + var10;
            int var32 = arg0 - var10;
            if (var8 <= var7) {
                class114.method762(var32, 125, var31, arg1, var29);
                class114.method762(var32, arg6 + 105, var31, arg1, var30);
            } else {
                int var33 = var12 < var7 ? class61.field1230[var7] : var12;
                int var34 = arg0 - var33;
                int var35 = arg0 + var33;
                class114.method762(var32, 113, var34, arg1, var29);
                class114.method762(var34, 77, var35, arg3, var29);
                class114.method762(var35, arg6 ^ 0x75, var31, arg1, var29);
                class114.method762(var32, 120, var34, arg1, var30);
                class114.method762(var34, 83, var35, arg3, var30);
                class114.method762(var35, 109, var31, arg1, var30);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JZIB)Lkh;")
    public static final class117 method1223(long arg0, boolean arg1, int arg2, byte arg3) {
        field3159++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var5 = 1;
        long var6 = arg0 / (long) arg2;
        while (var6 != 0L) {
            var6 /= arg2;
            var5++;
        }
        int var8 = var5;
        if (arg3 != -96) {
            field3166 = null;
        }
        if (arg0 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg0 % (long) arg2);
            arg0 /= arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class117 var11 = new class117();
        var11.field2196 = var9;
        var11.field2213 = var8;
        return var11;
    }
}

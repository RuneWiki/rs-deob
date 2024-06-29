import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class613 {

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "[I")
    public static int[] field8313 = new int[2048];

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lor;")
    public static class668 field8311 = null;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "[I")
    public static int[] field8312 = new int[14];

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public static void method3381(int arg0) {
        field8311 = null;
        field8313 = null;
        field8312 = null;
        if (arg0 < 3) {
            field8312 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8309++;
        int var8 = class573.method3204(arg7, class523.field7178, 124915076, class495.field6845);
        int var9 = class573.method3204(arg2, class523.field7178, arg3 + 124915076, class495.field6845);
        int var10 = class573.method3204(arg0, class174.field2335, 124915076, class751.field10402);
        int var11 = class573.method3204(arg5, class174.field2335, 124915076, class751.field10402);
        int var12 = class573.method3204(arg4 + arg7, class523.field7178, 124915076, class495.field6845);
        int var13 = class573.method3204(arg2 - arg4, class523.field7178, 124915076, class495.field6845);
        for (int var14 = var8; var14 < var12; var14++) {
            class138.method1069(class785.field10808[var14], (byte) -127, var10, var11, arg1);
        }
        if (arg3 != 0) {
            field8311 = null;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class138.method1069(class785.field10808[var15], (byte) 110, var10, var11, arg1);
        }
        int var16 = class573.method3204(arg0 + arg4, class174.field2335, 124915076, class751.field10402);
        int var17 = class573.method3204(arg5 - arg4, class174.field2335, 124915076, class751.field10402);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class785.field10808[var18];
            class138.method1069(var19, (byte) 105, var10, var16, arg1);
            class138.method1069(var19, (byte) 119, var16, var17, arg6);
            class138.method1069(var19, (byte) -128, var17, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "([[BLdga;I)V")
    public static final void method3383(byte[][] arg0, class219 arg1, int arg2) {
        field8310++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        int var5 = 0;
        if (arg2 != 4128) {
            return;
        }
        while (var4 > var5) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class376 var11 = new class376(var10);
                int var12 = class186.field2487[var5] >> 8;
                int var13 = class186.field2487[var5] & 0xFF;
                int var14 = var12 * 64 - class121.field1765;
                int var15 = var13 * 64 - class230.field3147;
                class230.method1508((byte) -122);
                arg1.method1429(var11, class514.field7038, var14, class121.field1765, true, class230.field3147, var15);
                arg1.method1439(var15, var11, class379.field5542, (byte) -120, var14, var3);
                if (!arg1.field2895 && class474.field6604 / 8 == var12 && (class351.field5157 / 8) == var13 && var3[0] != -1) {
                    class296.field4302 = class457.field6339.method784(-18085, var3[2], class563.field7548, var3[3], var3[1], var3[0]);
                    class319.field4602 = var3[4];
                }
            }
            var5++;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class186.field2487[var6] >> 8) * 64 - class121.field1765;
            int var8 = (class186.field2487[var6] & 0xFF) * 64 - class230.field3147;
            byte[] var9 = arg0[var6];
            if (var9 == null && class351.field5157 < 800) {
                class230.method1508((byte) -96);
                arg1.method1423(var7, 64, 64, var8, false);
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BLjp;)Lgn;")
    public static final class731 method3384(byte arg0, class376 arg1) {
        field8314++;
        class651 var2 = class652.method3628(arg1, false);
        int var3 = arg1.method2359(-1);
        if (arg0 >= -46) {
            field8312 = null;
        }
        int var4 = arg1.method2359(-1);
        int var5 = arg1.method2359(-1);
        int var6 = arg1.method2359(-1);
        int var7 = arg1.method2359(-1);
        int var8 = arg1.method2359(-1);
        return new class731(var2.field9027, var2.field9024, var2.field9031, var2.field9028, var2.field9033, var2.field9025, var2.field9029, var2.field9034, var2.field9032, var3, var4, var5, var6, var7, var8);
    }
}

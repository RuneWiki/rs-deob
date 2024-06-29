import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class17 {

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    private int field296 = 0;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[Lhb;")
    private class67[] field292;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[[I")
    public static int[][] field275 = new int[5][5000];

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Led;")
    public static class43 field286 = class191.method1219("swe", false);

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Led;")
    private static class43 field281 = class191.method1219("FULL", false);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Led;")
    public static class43 field282 = field281;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Led;")
    public static class43 field283 = class191.method1219("Fps:", false);

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Led;")
    public static class43 field294 = class191.method1219("Hidden)2use", false);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "J")
    private long field295;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lga;")
    public static class58 field272;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lhb;")
    private class67 field279;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lhb;")
    private class67 field297;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field274;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
    public static int[] field288;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Led;I[SB)V")
    public static final void method74(int arg0, class43[] arg1, int arg2, short[] arg3, byte arg4) {
        if (arg2 < arg0) {
            int var5 = (arg2 + arg0) / 2;
            int var6 = arg2;
            class43 var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].method262(var7, -110) < (var9 & 0x1)) {
                    class43 var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method74(var6 - 1, arg1, arg2, arg3, (byte) 123);
            method74(arg0, arg1, var6 + 1, arg3, (byte) 122);
        }
        if (arg4 > 119) {
            field276++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JI)Lhb;")
    public final class67 method75(long arg0, int arg1) {
        field285++;
        int var4 = 37 % ((-arg1 - 30) / 36);
        this.field295 = arg0;
        class67 var5 = this.field292[(int) ((long) (this.field289 - 1) & arg0)];
        for (this.field279 = var5.field1356; this.field279 != var5; this.field279 = this.field279.field1356) {
            if (this.field279.field1353 == arg0) {
                class67 var6 = this.field279;
                this.field279 = this.field279.field1356;
                return var6;
            }
        }
        this.field279 = null;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lhb;")
    public final class67 method76(int arg0) {
        int var2 = 122 / ((arg0 + 59) / 62);
        field271++;
        this.field296 = 0;
        return this.method79((byte) 76);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static void method77(int arg0) {
        field274 = null;
        field281 = null;
        field283 = null;
        field272 = null;
        field294 = null;
        field282 = null;
        field286 = null;
        field275 = null;
        field288 = null;
        if (arg0 < 123) {
            method81(103, -99, 91, 43, 127, -114, -52);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B[Lhb;)I")
    public final int method78(byte arg0, class67[] arg1) {
        field291++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field289; var4++) {
            class67 var6 = this.field292[var4];
            for (class67 var7 = var6.field1356; var7 != var6; var7 = var7.field1356) {
                arg1[var3++] = var7;
            }
        }
        int var5 = -11 % ((-arg0 - 13) / 38);
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)Lhb;")
    public final class67 method79(byte arg0) {
        if (arg0 != 76) {
            field283 = null;
        }
        field280++;
        if (this.field296 > 0 && this.field292[this.field296 - 1] != this.field297) {
            class67 var2 = this.field297;
            this.field297 = var2.field1356;
            return var2;
        }
        while (this.field289 > this.field296) {
            class67 var3 = this.field292[this.field296++].field1356;
            if (this.field292[this.field296 - 1] != var3) {
                this.field297 = var3.field1356;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)[Lnb;")
    public static final class120[] method80(int arg0) {
        field287++;
        class120[] var1 = new class120[class122.field2452];
        for (int var2 = 0; var2 < class122.field2452; var2++) {
            class120 var4 = new class120();
            var4.field2390 = class79.field1567;
            var4.field2386 = class69.field1382;
            var4.field2391 = class114.field2220[var2];
            var4.field2392 = class66.field1328[var2];
            var4.field2387 = class30.field573[var2];
            var4.field2389 = class52.field1055[var2];
            int var5 = var4.field2389 * var4.field2387;
            byte[] var6 = class1.field1[var2];
            var4.field2388 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field2388[var7] = field274[class7.method38(var6[var7], 255)];
            }
            var1[var2] = var4;
        }
        int var3 = -76 / ((-arg0 - 57) / 52);
        class60.method382((byte) -95);
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)I")
    public static final int method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -1) {
            method74(37, null, -127, null, (byte) -115);
        }
        if ((arg3 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg2;
            arg2 = var7;
        }
        field273++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 1 + 7 - arg4 - arg5;
        } else {
            return 7 + 1 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILhb;J)V")
    public final void method82(int arg0, class67 arg1, long arg2) {
        if (arg1.field1343 != null) {
            arg1.method417(-57);
        }
        field284++;
        class67 var5 = this.field292[(int) (arg2 & (long) (this.field289 - 1))];
        arg1.field1353 = arg2;
        arg1.field1343 = var5.field1343;
        arg1.field1356 = var5;
        arg1.field1343.field1356 = arg1;
        int var6 = -28 / ((arg0 + 20) / 33);
        arg1.field1356.field1343 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
    public final int method83(int arg0) {
        if (arg0 != -30118) {
            this.method84(false);
        }
        int var2 = 0;
        field290++;
        for (int var3 = 0; var3 < this.field289; var3++) {
            class67 var4 = this.field292[var3];
            for (class67 var5 = var4.field1356; var5 != var4; var5 = var5.field1356) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Lhb;")
    public final class67 method84(boolean arg0) {
        field277++;
        if (this.field279 == null) {
            return null;
        }
        class67 var2 = this.field292[(int) (this.field295 & (long) (this.field289 - 1))];
        if (arg0) {
            return null;
        }
        while (this.field279 != var2) {
            if (this.field279.field1353 == this.field295) {
                class67 var3 = this.field279;
                this.field279 = this.field279.field1356;
                return var3;
            }
            this.field279 = this.field279.field1356;
        }
        this.field279 = null;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field292 = new class67[arg0];
        this.field289 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class67 var3 = this.field292[var2] = new class67();
            var3.field1356 = var3;
            var3.field1343 = var3;
        }
    }
}

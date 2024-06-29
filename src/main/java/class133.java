import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class133 extends class108 {

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "[I")
    public int[] field3241 = new int[] { -1 };

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "[I")
    public int[] field3244 = new int[1];

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lgd;")
    public static class40 field3237 = class14.method90(false, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3242 = 0;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lgd;")
    public static class40 field3245 = class14.method90(false, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Lgd;")
    public static class40 field3247 = class14.method90(false, "Handel akzeptieren");

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lgd;")
    public static class40 field3240 = class14.method90(false, "Menge eingeben:");

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Lgd;")
    private static class40 field3246 = class14.method90(false, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "[[I")
    public static int[][] field3243 = new int[104][104];

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[[B")
    public static byte[][] field3250 = new byte[1000][];

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field3249 = 3353893;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Lgd;")
    public static class40 field3251 = field3246;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lgd;")
    public static class40 field3254 = class14.method90(false, "Absender:");

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Lhe;")
    public static class47 field3238;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 5)
    public static void method1043(int arg0) {
        field3245 = null;
        field3250 = null;
        if (arg0 != -4) {
            return;
        }
        field3240 = null;
        field3254 = null;
        field3246 = null;
        field3243 = null;
        field3251 = null;
        field3238 = null;
        field3247 = null;
        field3237 = null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 25)
    public static final void method1044(int arg0) {
        int var1 = class13.field332.field838 + class34.field868;
        int var2 = class70.field1695 + class13.field332.field792;
        field3248++;
        if (class100.field2371 - var2 < -500 || class100.field2371 - var2 > 500 || class94.field2171 - var1 < -500 || class94.field2171 - var1 > 500) {
            class100.field2371 = var2;
            class94.field2171 = var1;
        }
        if (class100.field2371 != var2) {
            class100.field2371 += (var2 - class100.field2371) / 16;
        }
        int var3 = class100.field2371 >> 7;
        if (arg0 >= -90) {
            field3242 = -113;
        }
        int var4 = 0;
        if (class94.field2171 != var1) {
            class94.field2171 += (var1 - class94.field2171) / 16;
        }
        int var5 = class94.field2171 >> 7;
        if (class107.field2617[96]) {
            class9.field239 += (-class9.field239 - 24) / 2;
        } else if (class107.field2617[97]) {
            class9.field239 += (24 - class9.field239) / 2;
        } else {
            class9.field239 /= 2;
        }
        if (class107.field2617[98]) {
            class129.field3079 += (12 - class129.field3079) / 2;
        } else if (class107.field2617[99]) {
            class129.field3079 += (-class129.field3079 - 12) / 2;
        } else {
            class129.field3079 /= 2;
        }
        class2.field43 = class9.field239 / 2 + class2.field43 & 0x7FF;
        class16.field419 += class129.field3079 / 2;
        if (class16.field419 < 128) {
            class16.field419 = 128;
        }
        if (class16.field419 > 383) {
            class16.field419 = 383;
        }
        int var6 = class58.method439(class94.field2171, class100.field2371, false, class99.field2361);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class99.field2361;
                    if (var9 < 3 && (class112.field2716[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class89.field2021[var9][var7][var8];
                    if (var4 < var10) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class59.field1497 < var11) {
            class59.field1497 += (var11 - class59.field1497) / 24;
        } else if (var11 < class59.field1497) {
            class59.field1497 += (var11 - class59.field1497) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIBI)Lgd;", line = 148)
    public static final class40 method1045(boolean arg0, int arg1, byte arg2, int arg3) {
        field3252++;
        int var4 = 1;
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg1 /= arg3;
        }
        class40 var9 = new class40();
        var9.field950 = var6;
        if (arg2 <= 12) {
            field3250 = null;
        }
        var9.field948 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB[B)I", line = 276)
    public static final int method1046(int arg0, byte arg1, byte[] arg2) {
        field3236++;
        if (arg1 != -32) {
            field3250 = null;
        }
        return class59.method441(arg0, 1, arg2, 0);
    }
}

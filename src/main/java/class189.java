import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class189 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    private static int field3021 = -1;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    private static int field3024 = 0;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    private static int field3025 = 0;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    private static int field3022 = -1;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private static int field3023 = -1;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lma;")
    private static class5 field3026 = new class5();

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Z")
    private static boolean field3028 = true;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Z")
    private static boolean field3029 = true;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Z")
    private static boolean field3030 = false;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private static int field3032 = -1;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Z")
    private static boolean field3033 = false;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
    private static int[] field3031 = new int[2];

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    private static int field3036 = -1;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Z")
    private static boolean field3037 = false;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "Z")
    private static boolean field3035 = true;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    private static int field3034 = 0;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lmj;")
    private static class300 field3027;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()Z", line = 5)
    public static final boolean method1380() {
        return field3022 != -1 && field3027.method2059(1);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)Z", line = 9)
    public static final boolean method1381(int arg0, int arg1, int arg2, int arg3) {
        if (field3022 == -1 || field3026.method18(0)) {
            field3033 = false;
            return false;
        }
        field3025 = arg0;
        field3024 = arg1;
        boolean var4 = false;
        if (field3021 != arg2 || field3023 != arg3) {
            field3021 = arg2;
            field3023 = arg3;
            for (class287 var5 = field3026.method22((byte) 124); var5 != field3026.field50; var5 = var5.field4427) {
                ((class295) var5).method2062(field3021, field3023);
            }
            field3028 = true;
            field3035 = true;
        }
        GL var6 = class109.field1456;
        if (field3035) {
            if (field3036 != -1 && field3037 != field3030) {
                if (field3030) {
                    class313.method2180(field3036);
                } else {
                    class90.method649(field3036);
                }
                field3036 = -1;
            }
            if (field3036 == -1) {
                field3030 = field3037;
                if (field3030) {
                    field3036 = class313.method2187();
                } else {
                    field3036 = class90.method646();
                }
                field3029 = true;
            }
            if (field3030) {
                var6.glBindTexture(34037, field3036);
                class313.method2184(class313.field4898, class313.field4907, field3021, field3023, class313.field4907, class313.field4911, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field3036);
                var6.glRenderbufferStorageEXT(36161, 6402, field3021, field3023);
            }
            field3035 = false;
            var4 = true;
        }
        if (field3028) {
            var6.glBindTexture(34037, field3031[0]);
            class313.method2179(field3032, field3021, field3023);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field3034 > 1) {
                var6.glBindTexture(34037, field3031[1]);
                class313.method2179(field3032, field3021, field3023);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field3031[1]);
                class313.method2179(field3032, 0, 0);
            }
            field3028 = false;
            var4 = true;
        }
        class90.method651(field3022);
        if (field3029) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field3031[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field3034 > 1 ? field3031[1] : 0, 0);
            if (field3030) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field3036, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field3036);
            }
            var6.glDrawBuffer(36064);
            field3029 = false;
            var4 = true;
        }
        if (var4) {
            if (class90.method655()) {
                field3033 = true;
            } else {
                class90.method653();
                field3028 = true;
                field3035 = true;
                field3029 = true;
                field3033 = false;
            }
        }
        class109.method759(-field3025, field3024 + field3023 - class109.field1499);
        return field3033;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()V", line = 133)
    public static final void method1382() {
        if (field3027.method2059(1)) {
            method1385(field3027, false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "()V", line = 144)
    private static final void method1383() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class295 var4 = (class295) field3026.method22((byte) 124); var4 != null; var4 = (class295) field3026.method26((byte) -119)) {
            int var5 = var4.method2066();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method2063(0);
            var3 |= var4.method2054(1);
            var1 += var4.method2055(false);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class313.field4905 : class313.field4904;
        } else if (var0 == 1) {
            var6 = var2 ? class313.field4903 : class313.field4902;
        } else {
            var6 = var2 ? class313.field4900 : class313.field4899;
        }
        if (field3032 != var6) {
            field3032 = var6;
            field3028 = true;
        }
        int var7 = field3034 > 2 ? 2 : field3034;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field3028 = true;
            field3029 = true;
        }
        if (field3030 != var3) {
            field3037 = var3;
            field3035 = true;
        }
        field3034 = var1;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "()Z", line = 200)
    public static final boolean method1384() {
        return field3022 != -1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Log;Z)V", line = 203)
    private static final void method1385(class295 arg0, boolean arg1) {
        if (arg1) {
            arg0.method2061();
        }
        arg0.field4574 = false;
        arg0.method2028(13329);
        method1383();
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "()Z", line = 213)
    public static final boolean method1386() {
        if (method1380()) {
            return true;
        } else if (!method1389()) {
            return false;
        } else if (method1392(field3027)) {
            return true;
        } else {
            method1382();
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "()V", line = 228)
    public static final void method1387() {
        if (!class109.field1480 || !class109.field1470) {
            return;
        }
        GL var0 = class109.field1456;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field3031, 0);
            field3022 = class90.method654();
        }
        for (class287 var2 = field3026.method22((byte) 119); var2 != null; var2 = field3026.method26((byte) -114)) {
            class295 var3 = (class295) var2;
            if (!var3.method2057()) {
                var3.method2028(13329);
            }
        }
        if (field3027 == null) {
            field3027 = new class300();
        }
        if (!field3027.method2058() && !field3027.method2057()) {
            field3027.method2061();
        }
        method1383();
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "()V", line = 271)
    public static final void method1388() {
        if (field3022 != -1) {
            class90.method647(field3022);
            field3022 = -1;
            class109.field1456.glDeleteTextures(2, field3031, 0);
            field3031[0] = -1;
            field3031[1] = -1;
        }
        if (field3036 != -1) {
            if (field3030) {
                class313.method2180(field3036);
            } else {
                class90.method649(field3036);
            }
            field3036 = -1;
        }
        if (!field3026.method18(0)) {
            for (class287 var0 = field3026.method22((byte) 120); var0 != field3026.field50; var0 = var0.field4427) {
                ((class295) var0).method2061();
            }
        }
        if (field3027 != null && field3027.method2058()) {
            field3027.method2061();
        }
        field3028 = true;
        field3035 = true;
        field3029 = true;
        field3023 = -1;
        field3021 = -1;
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "()Z", line = 314)
    public static final boolean method1389() {
        return field3022 != -1 && field3027.method2058();
    }

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "()V", line = 321)
    public static final void method1390() {
        if (!field3033) {
            return;
        }
        GL var0 = class109.field1456;
        class109.method761();
        class122.method898();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class109.method768();
        int var1 = 0;
        int var2 = 1;
        class295 var4;
        for (class295 var3 = (class295) field3026.method22((byte) 126); var3 != null; var3 = var4) {
            var4 = (class295) field3026.method26((byte) -120);
            int var5 = var3.method2055(false);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method2065(var6, field3021, field3023, field3031[var1], field3036);
                if (var4 == null && var5 - 1 == var6) {
                    field3024 = class109.field1499 - field3024;
                    class109.method759(0, 0);
                    var0.glDrawBuffer(36064);
                    class90.method653();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field3025, field3024 - field3023);
                    var0.glTexCoord2f((float) field3021, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3025 + field3021, field3024 - field3023);
                    var0.glTexCoord2f((float) field3021, (float) field3023);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3025 + field3021, field3024);
                    var0.glTexCoord2f(0.0F, (float) field3023);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field3025, field3024);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field3021, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3021, 0);
                    var0.glTexCoord2f((float) field3021, (float) field3023);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3021, field3023);
                    var0.glTexCoord2f(0.0F, (float) field3023);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field3023);
                    var0.glEnd();
                }
                var3.method2060(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class109.method776();
    }

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "()V", line = 405)
    public static void method1391() {
        field3026 = null;
        field3031 = null;
        field3027 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Log;)Z", line = 413)
    private static final boolean method1392(class295 arg0) {
        if (field3022 != -1) {
            if (arg0.method2058() || arg0.method2057()) {
                if (field3021 != -1 && field3023 != -1) {
                    arg0.method2062(field3021, field3023);
                }
                arg0.field4574 = true;
                field3026.method19(arg0, -1058);
                method1383();
                return true;
            }
            arg0.method2061();
        }
        return false;
    }
}

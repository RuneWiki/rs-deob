import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class199 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    private static int field3263 = -1;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    private static int field3265 = -1;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    private static int field3264 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    private static int field3262 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    private static int field3266 = -1;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lqg;")
    private static class256 field3267 = new class256();

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    private static int field3269 = -1;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
    private static int[] field3268 = new int[2];

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
    private static boolean field3273 = true;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    private static int field3270 = -1;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
    private static boolean field3274 = false;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Z")
    private static boolean field3277 = false;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Z")
    private static boolean field3275 = false;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    private static int field3271 = 0;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Z")
    private static boolean field3276 = true;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Z")
    private static boolean field3278 = true;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lqb;")
    private static class110 field3272;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V", line = 4)
    public static final void method1450() {
        if (field3272.method1146(true)) {
            method1452(field3272, false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()Z", line = 9)
    public static final boolean method1451() {
        return field3263 != -1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lmg;Z)V", line = 12)
    private static final void method1452(class166 arg0, boolean arg1) {
        if (arg1) {
            arg0.method762();
        }
        arg0.field2687 = false;
        arg0.method465((byte) -122);
        method1456();
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()Z", line = 22)
    public static final boolean method1453() {
        return field3263 != -1 && field3272.method758();
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()Z", line = 27)
    public static final boolean method1454() {
        return field3263 != -1 && field3272.method1146(true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lmg;)Z", line = 30)
    private static final boolean method1455(class166 arg0) {
        if (field3263 != -1) {
            if (arg0.method758() || arg0.method760()) {
                if (field3266 != -1 && field3265 != -1) {
                    arg0.method763(field3266, field3265);
                }
                arg0.field2687 = true;
                field3267.method1815((byte) -126, arg0);
                method1456();
                return true;
            }
            arg0.method762();
        }
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V", line = 57)
    private static final void method1456() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class166 var4 = (class166) field3267.method1807((byte) 25); var4 != null; var4 = (class166) field3267.method1808(18051)) {
            int var5 = var4.method761();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1145((byte) 52);
            var3 |= var4.method1142(-106);
            var1 += var4.method1148(false);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class96.field1470 : class96.field1469;
        } else if (var0 == 1) {
            var6 = var2 ? class96.field1468 : class96.field1467;
        } else {
            var6 = var2 ? class96.field1465 : class96.field1464;
        }
        if (field3270 != var6) {
            field3270 = var6;
            field3273 = true;
        }
        int var7 = field3271 > 2 ? 2 : field3271;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field3273 = true;
            field3276 = true;
        }
        if (field3274 != var3) {
            field3277 = var3;
            field3278 = true;
        }
        field3271 = var1;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "()V", line = 112)
    public static final void method1457() {
        if (!field3275) {
            return;
        }
        GL var0 = class186.field2990;
        class186.method1278();
        class344.method2372();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class186.method1284();
        int var1 = 0;
        int var2 = 1;
        class166 var4;
        for (class166 var3 = (class166) field3267.method1807((byte) 96); var3 != null; var3 = var4) {
            var4 = (class166) field3267.method1808(18051);
            int var5 = var3.method1148(false);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method759(var6, field3266, field3265, field3268[var1], field3269);
                if (var4 == null && var5 - 1 == var6) {
                    field3264 = class186.field2980 - field3264;
                    class186.method1295(0, 0);
                    var0.glDrawBuffer(36064);
                    class345.method2390();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field3262, field3264 - field3265);
                    var0.glTexCoord2f((float) field3266, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3266 + field3262, field3264 - field3265);
                    var0.glTexCoord2f((float) field3266, (float) field3265);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3266 + field3262, field3264);
                    var0.glTexCoord2f(0.0F, (float) field3265);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field3262, field3264);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field3266, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3266, 0);
                    var0.glTexCoord2f((float) field3266, (float) field3265);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3266, field3265);
                    var0.glTexCoord2f(0.0F, (float) field3265);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field3265);
                    var0.glEnd();
                }
                var3.method764(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class186.method1289();
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "()V", line = 196)
    public static final void method1458() {
        if (!class186.field3004 || !class186.field3008) {
            return;
        }
        GL var0 = class186.field2990;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field3268, 0);
            field3263 = class345.method2387();
        }
        for (class71 var2 = field3267.method1807((byte) 70); var2 != null; var2 = field3267.method1808(18051)) {
            class166 var3 = (class166) var2;
            if (!var3.method760()) {
                var3.method465((byte) -122);
            }
        }
        if (field3272 == null) {
            field3272 = new class110();
        }
        if (!field3272.method758() && !field3272.method760()) {
            field3272.method762();
        }
        method1456();
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "()V", line = 241)
    public static void method1459() {
        field3267 = null;
        field3268 = null;
        field3272 = null;
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "()Z", line = 246)
    public static final boolean method1460() {
        if (method1454()) {
            return true;
        } else if (!method1453()) {
            return false;
        } else if (method1455(field3272)) {
            return true;
        } else {
            method1450();
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "()V", line = 271)
    public static final void method1461() {
        if (field3263 != -1) {
            class345.method2394(field3263);
            field3263 = -1;
            class186.field2990.glDeleteTextures(2, field3268, 0);
            field3268[0] = -1;
            field3268[1] = -1;
        }
        if (field3269 != -1) {
            if (field3274) {
                class96.method682(field3269);
            } else {
                class345.method2397(field3269);
            }
            field3269 = -1;
        }
        if (!field3267.method1805(false)) {
            for (class71 var0 = field3267.method1807((byte) 18); var0 != field3267.field4068; var0 = var0.field921) {
                ((class166) var0).method762();
            }
        }
        if (field3272 != null && field3272.method758()) {
            field3272.method762();
        }
        field3273 = true;
        field3278 = true;
        field3276 = true;
        field3265 = -1;
        field3266 = -1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)Z", line = 320)
    public static final boolean method1462(int arg0, int arg1, int arg2, int arg3) {
        if (field3263 == -1 || field3267.method1805(false)) {
            field3275 = false;
            return false;
        }
        field3262 = arg0;
        field3264 = arg1;
        boolean var4 = false;
        if (field3266 != arg2 || field3265 != arg3) {
            field3266 = arg2;
            field3265 = arg3;
            for (class71 var5 = field3267.method1807((byte) 113); var5 != field3267.field4068; var5 = var5.field921) {
                ((class166) var5).method763(field3266, field3265);
            }
            field3273 = true;
            field3278 = true;
        }
        GL var6 = class186.field2990;
        if (field3278) {
            if (field3269 != -1 && field3277 != field3274) {
                if (field3274) {
                    class96.method682(field3269);
                } else {
                    class345.method2397(field3269);
                }
                field3269 = -1;
            }
            if (field3269 == -1) {
                field3274 = field3277;
                if (field3274) {
                    field3269 = class96.method686();
                } else {
                    field3269 = class345.method2393();
                }
                field3276 = true;
            }
            if (field3274) {
                var6.glBindTexture(34037, field3269);
                class96.method685(class96.field1463, class96.field1472, field3266, field3265, class96.field1472, class96.field1476, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field3269);
                var6.glRenderbufferStorageEXT(36161, 6402, field3266, field3265);
            }
            field3278 = false;
            var4 = true;
        }
        if (field3273) {
            var6.glBindTexture(34037, field3268[0]);
            class96.method684(field3270, field3266, field3265);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field3271 > 1) {
                var6.glBindTexture(34037, field3268[1]);
                class96.method684(field3270, field3266, field3265);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field3268[1]);
                class96.method684(field3270, 0, 0);
            }
            field3273 = false;
            var4 = true;
        }
        class345.method2395(field3263);
        if (field3276) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field3268[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field3271 > 1 ? field3268[1] : 0, 0);
            if (field3274) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field3269, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field3269);
            }
            var6.glDrawBuffer(36064);
            field3276 = false;
            var4 = true;
        }
        if (var4) {
            if (class345.method2389()) {
                field3275 = true;
            } else {
                class345.method2390();
                field3273 = true;
                field3278 = true;
                field3276 = true;
                field3275 = false;
            }
        }
        class186.method1295(-field3262, field3265 + field3264 - class186.field2980);
        return field3275;
    }
}

import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class279 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    private static int field4296 = -1;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    private static int field4297 = -1;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    private static int field4299 = -1;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    private static int field4298 = 0;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    private static int field4300 = 0;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lnk;")
    private static class2 field4295 = new class2();

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    private static int field4302 = 0;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Z")
    private static boolean field4304 = false;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    private static int field4301 = -1;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    private static int field4303 = -1;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Z")
    private static boolean field4306 = false;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Z")
    private static boolean field4305 = true;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
    private static boolean field4307 = true;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
    private static boolean field4310 = false;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
    private static int[] field4308 = new int[2];

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Z")
    private static boolean field4309 = true;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Lsj;")
    private static class287 field4311;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 6)
    public static void method1833() {
        field4295 = null;
        field4308 = null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()Z", line = 13)
    public static final boolean method1834() {
        return field4296 != -1;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()V", line = 16)
    public static final void method1835() {
        if (!class333.field5142 || !class333.field5169) {
            return;
        }
        GL var0 = class333.field5160;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field4308, 0);
            field4296 = class127.method850();
        }
        for (class187 var2 = field4295.method10((byte) 47); var2 != null; var2 = field4295.method13((byte) -32)) {
            class156 var3 = (class156) var2;
            if (!var3.method1091()) {
                var3.method1284(0);
            }
        }
        if (field4311 == null) {
            field4311 = new class287();
        }
        if (!field4311.method1089() && !field4311.method1091()) {
            field4311.method1085();
        }
        method1843();
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()Z", line = 57)
    public static final boolean method1836() {
        return field4296 != -1 && field4311.method1090(0);
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "()Z", line = 60)
    public static final boolean method1837() {
        if (method1836()) {
            return true;
        } else if (!method1841()) {
            return false;
        } else if (method1839(field4311)) {
            return true;
        } else {
            method1838();
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "()V", line = 75)
    public static final void method1838() {
        if (field4311.method1090(0)) {
            method1844(field4311, false);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lpa;)Z", line = 80)
    private static final boolean method1839(class156 arg0) {
        if (field4296 != -1) {
            if (arg0.method1089() || arg0.method1091()) {
                if (field4299 != -1 && field4297 != -1) {
                    arg0.method1084(field4299, field4297);
                }
                arg0.field2443 = true;
                field4295.method7((byte) -51, arg0);
                method1843();
                return true;
            }
            arg0.method1085();
        }
        return false;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)Z", line = 105)
    public static final boolean method1840(int arg0, int arg1, int arg2, int arg3) {
        if (field4296 == -1 || field4295.method11(1)) {
            field4306 = false;
            return false;
        }
        field4298 = arg0;
        field4300 = arg1;
        boolean var4 = false;
        if (field4299 != arg2 || field4297 != arg3) {
            field4299 = arg2;
            field4297 = arg3;
            for (class187 var5 = field4295.method10((byte) 41); var5 != field4295.field11; var5 = var5.field2846) {
                ((class156) var5).method1084(field4299, field4297);
            }
            field4305 = true;
            field4307 = true;
        }
        GL var6 = class333.field5160;
        if (field4307) {
            if (field4301 != -1 && field4310 != field4304) {
                if (field4304) {
                    class32.method236(field4301);
                } else {
                    class127.method859(field4301);
                }
                field4301 = -1;
            }
            if (field4301 == -1) {
                field4304 = field4310;
                if (field4304) {
                    field4301 = class32.method241();
                } else {
                    field4301 = class127.method854();
                }
                field4309 = true;
            }
            if (field4304) {
                var6.glBindTexture(34037, field4301);
                class32.method235(class32.field395, class32.field404, field4299, field4297, class32.field404, class32.field408, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field4301);
                var6.glRenderbufferStorageEXT(36161, 6402, field4299, field4297);
            }
            field4307 = false;
            var4 = true;
        }
        if (field4305) {
            var6.glBindTexture(34037, field4308[0]);
            class32.method238(field4303, field4299, field4297);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field4302 > 1) {
                var6.glBindTexture(34037, field4308[1]);
                class32.method238(field4303, field4299, field4297);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field4308[1]);
                class32.method238(field4303, 0, 0);
            }
            field4305 = false;
            var4 = true;
        }
        class127.method857(field4296);
        if (field4309) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field4308[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field4302 > 1 ? field4308[1] : 0, 0);
            if (field4304) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field4301, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field4301);
            }
            var6.glDrawBuffer(36064);
            field4309 = false;
            var4 = true;
        }
        if (var4) {
            if (class127.method852()) {
                field4306 = true;
            } else {
                class127.method851();
                field4305 = true;
                field4307 = true;
                field4309 = true;
                field4306 = false;
            }
        }
        class333.method2284(-field4298, field4300 + field4297 - class333.field5182);
        return field4306;
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "()Z", line = 237)
    public static final boolean method1841() {
        return field4296 != -1 && field4311.method1089();
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "()V", line = 242)
    public static final void method1842() {
        if (!field4306) {
            return;
        }
        GL var0 = class333.field5160;
        class333.method2310();
        class238.method1629();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class333.method2290();
        int var1 = 0;
        int var2 = 1;
        class156 var4;
        for (class156 var3 = (class156) field4295.method10((byte) 109); var3 != null; var3 = var4) {
            var4 = (class156) field4295.method13((byte) -32);
            int var5 = var3.method1081(101);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method1092(var6, field4299, field4297, field4308[var1], field4301);
                if (var4 == null && var5 - 1 == var6) {
                    field4300 = class333.field5182 - field4300;
                    class333.method2284(0, 0);
                    var0.glDrawBuffer(36064);
                    class127.method851();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field4298, field4300 - field4297);
                    var0.glTexCoord2f((float) field4299, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field4299 + field4298, field4300 - field4297);
                    var0.glTexCoord2f((float) field4299, (float) field4297);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field4299 + field4298, field4300);
                    var0.glTexCoord2f(0.0F, (float) field4297);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field4298, field4300);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field4299, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field4299, 0);
                    var0.glTexCoord2f((float) field4299, (float) field4297);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field4299, field4297);
                    var0.glTexCoord2f(0.0F, (float) field4297);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field4297);
                    var0.glEnd();
                }
                var3.method1087(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class333.method2301();
    }

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "()V", line = 327)
    private static final void method1843() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class156 var4 = (class156) field4295.method10((byte) 64); var4 != null; var4 = (class156) field4295.method13((byte) -32)) {
            int var5 = var4.method1088();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1086(2500);
            var3 |= var4.method1082((byte) -82);
            var1 += var4.method1081(84);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class32.field402 : class32.field401;
        } else if (var0 == 1) {
            var6 = var2 ? class32.field400 : class32.field399;
        } else {
            var6 = var2 ? class32.field397 : class32.field396;
        }
        if (field4303 != var6) {
            field4303 = var6;
            field4305 = true;
        }
        int var7 = field4302 > 2 ? 2 : field4302;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field4305 = true;
            field4309 = true;
        }
        if (field4304 != var3) {
            field4310 = var3;
            field4307 = true;
        }
        field4302 = var1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lpa;Z)V", line = 382)
    private static final void method1844(class156 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1085();
        }
        arg0.field2443 = false;
        arg0.method1284(0);
        method1843();
    }

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "()V", line = 391)
    public static final void method1845() {
        if (field4296 != -1) {
            class127.method855(field4296);
            field4296 = -1;
            class333.field5160.glDeleteTextures(2, field4308, 0);
            field4308[0] = -1;
            field4308[1] = -1;
        }
        if (field4301 != -1) {
            if (field4304) {
                class32.method236(field4301);
            } else {
                class127.method859(field4301);
            }
            field4301 = -1;
        }
        if (!field4295.method11(1)) {
            for (class187 var0 = field4295.method10((byte) 56); var0 != field4295.field11; var0 = var0.field2846) {
                ((class156) var0).method1085();
            }
        }
        if (field4311 != null && field4311.method1089()) {
            field4311.method1085();
        }
        field4305 = true;
        field4307 = true;
        field4309 = true;
        field4297 = -1;
        field4299 = -1;
    }
}

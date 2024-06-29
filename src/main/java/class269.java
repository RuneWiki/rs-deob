import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class269 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private static int field4332 = -1;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private static int field4337 = -1;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    private static int field4336 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private static int field4335 = -1;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    private static int field4334 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lhh;")
    private static class169 field4333 = new class169();

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Z")
    private static boolean field4344 = false;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
    private static boolean field4345 = true;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    private static int[] field4343 = new int[2];

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    private static int field4342 = 0;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Z")
    private static boolean field4340 = false;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    private static int field4341 = -1;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Z")
    private static boolean field4348 = true;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private static int field4346 = -1;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Z")
    private static boolean field4338 = true;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
    private static boolean field4347 = false;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lnm;")
    private static class244 field4339;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V", line = 5)
    public static final void method1907() {
        if (!class232.field3692 || !class232.field3710) {
            return;
        }
        GL var0 = class232.field3716;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field4343, 0);
            field4335 = class299.method2136();
        }
        for (class165 var2 = field4333.method1240(3); var2 != null; var2 = field4333.method1235(false)) {
            class117 var3 = (class117) var2;
            if (!var3.method813()) {
                var3.method1212((byte) 69);
            }
        }
        if (field4339 == null) {
            field4339 = new class244();
        }
        if (!field4339.method807() && !field4339.method813()) {
            field4339.method806();
        }
        method1917();
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()Z", line = 49)
    public static final boolean method1908() {
        if (method1912()) {
            return true;
        } else if (!method1914()) {
            return false;
        } else if (method1915(field4339)) {
            return true;
        } else {
            method1909();
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V", line = 71)
    public static final void method1909() {
        if (field4339.method810(115)) {
            method1911(field4339, false);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()V", line = 77)
    public static final void method1910() {
        if (!field4340) {
            return;
        }
        GL var0 = class232.field3716;
        class232.method1652();
        class75.method508();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class232.method1673();
        int var1 = 0;
        int var2 = 1;
        class117 var4;
        for (class117 var3 = (class117) field4333.method1240(3); var3 != null; var3 = var4) {
            var4 = (class117) field4333.method1235(false);
            int var5 = var3.method812(23954888);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method803(var6, field4337, field4332, field4343[var1], field4346);
                if (var4 == null && var5 - 1 == var6) {
                    field4336 = class232.field3731 - field4336;
                    class232.method1650(0, 0);
                    var0.glDrawBuffer(36064);
                    class299.method2130();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field4334, field4336 - field4332);
                    var0.glTexCoord2f((float) field4337, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field4337 + field4334, field4336 - field4332);
                    var0.glTexCoord2f((float) field4337, (float) field4332);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field4337 + field4334, field4336);
                    var0.glTexCoord2f(0.0F, (float) field4332);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field4334, field4336);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field4337, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field4337, 0);
                    var0.glTexCoord2f((float) field4337, (float) field4332);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field4337, field4332);
                    var0.glTexCoord2f(0.0F, (float) field4332);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field4332);
                    var0.glEnd();
                }
                var3.method805(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class232.method1681();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsj;Z)V", line = 162)
    private static final void method1911(class117 arg0, boolean arg1) {
        if (arg1) {
            arg0.method806();
        }
        arg0.field1778 = false;
        arg0.method1212((byte) 111);
        method1917();
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "()Z", line = 170)
    public static final boolean method1912() {
        return field4335 != -1 && field4339.method810(26);
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "()V", line = 173)
    public static final void method1913() {
        if (field4335 != -1) {
            class299.method2127(field4335);
            field4335 = -1;
            class232.field3716.glDeleteTextures(2, field4343, 0);
            field4343[0] = -1;
            field4343[1] = -1;
        }
        if (field4346 != -1) {
            if (field4347) {
                class249.method1765(field4346);
            } else {
                class299.method2134(field4346);
            }
            field4346 = -1;
        }
        if (!field4333.method1230((byte) -66)) {
            for (class165 var0 = field4333.method1240(3); var0 != field4333.field2793; var0 = var0.field2747) {
                ((class117) var0).method806();
            }
        }
        if (field4339 != null && field4339.method807()) {
            field4339.method806();
        }
        field4338 = true;
        field4348 = true;
        field4345 = true;
        field4332 = -1;
        field4337 = -1;
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "()Z", line = 214)
    public static final boolean method1914() {
        return field4335 != -1 && field4339.method807();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsj;)Z", line = 223)
    private static final boolean method1915(class117 arg0) {
        if (field4335 != -1) {
            if (arg0.method807() || arg0.method813()) {
                if (field4337 != -1 && field4332 != -1) {
                    arg0.method808(field4337, field4332);
                }
                arg0.field1778 = true;
                field4333.method1232(125, arg0);
                method1917();
                return true;
            }
            arg0.method806();
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "()Z", line = 248)
    public static final boolean method1916() {
        return field4335 != -1;
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "()V", line = 252)
    private static final void method1917() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class117 var4 = (class117) field4333.method1240(3); var4 != null; var4 = (class117) field4333.method1235(false)) {
            int var5 = var4.method811();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method802(-65);
            var3 |= var4.method800(0);
            var1 += var4.method812(23954888);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class249.field3910 : class249.field3909;
        } else if (var0 == 1) {
            var6 = var2 ? class249.field3908 : class249.field3907;
        } else {
            var6 = var2 ? class249.field3905 : class249.field3904;
        }
        if (field4341 != var6) {
            field4341 = var6;
            field4338 = true;
        }
        int var7 = field4342 > 2 ? 2 : field4342;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field4338 = true;
            field4345 = true;
        }
        if (field4347 != var3) {
            field4344 = var3;
            field4348 = true;
        }
        field4342 = var1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z", line = 307)
    public static final boolean method1918(int arg0, int arg1, int arg2, int arg3) {
        if (field4335 == -1 || field4333.method1230((byte) 77)) {
            field4340 = false;
            return false;
        }
        field4334 = arg0;
        field4336 = arg1;
        boolean var4 = false;
        if (field4337 != arg2 || field4332 != arg3) {
            field4337 = arg2;
            field4332 = arg3;
            for (class165 var5 = field4333.method1240(3); var5 != field4333.field2793; var5 = var5.field2747) {
                ((class117) var5).method808(field4337, field4332);
            }
            field4338 = true;
            field4348 = true;
        }
        GL var6 = class232.field3716;
        if (field4348) {
            if (field4346 != -1 && field4347 != field4344) {
                if (field4347) {
                    class249.method1765(field4346);
                } else {
                    class299.method2134(field4346);
                }
                field4346 = -1;
            }
            if (field4346 == -1) {
                field4347 = field4344;
                if (field4347) {
                    field4346 = class249.method1770();
                } else {
                    field4346 = class299.method2128();
                }
                field4345 = true;
            }
            if (field4347) {
                var6.glBindTexture(34037, field4346);
                class249.method1771(class249.field3903, class249.field3912, field4337, field4332, class249.field3912, class249.field3916, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field4346);
                var6.glRenderbufferStorageEXT(36161, 6402, field4337, field4332);
            }
            field4348 = false;
            var4 = true;
        }
        if (field4338) {
            var6.glBindTexture(34037, field4343[0]);
            class249.method1766(field4341, field4337, field4332);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field4342 > 1) {
                var6.glBindTexture(34037, field4343[1]);
                class249.method1766(field4341, field4337, field4332);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field4343[1]);
                class249.method1766(field4341, 0, 0);
            }
            field4338 = false;
            var4 = true;
        }
        class299.method2129(field4335);
        if (field4345) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field4343[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field4342 > 1 ? field4343[1] : 0, 0);
            if (field4347) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field4346, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field4346);
            }
            var6.glDrawBuffer(36064);
            field4345 = false;
            var4 = true;
        }
        if (var4) {
            if (class299.method2133()) {
                field4340 = true;
            } else {
                class299.method2130();
                field4338 = true;
                field4348 = true;
                field4345 = true;
                field4340 = false;
            }
        }
        class232.method1650(-field4334, field4336 + field4332 - class232.field3731);
        return field4340;
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "()V", line = 432)
    public static void method1919() {
        field4333 = null;
        field4343 = null;
        field4339 = null;
    }
}

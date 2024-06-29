import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class16 {

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    private static int field239 = 0;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    private static int field237 = -1;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    private static int field238 = -1;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    private static int field236 = -1;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    private static int field240 = 0;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Lc;")
    private static class331 field241 = new class331();

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    private static int field242 = -1;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
    private static boolean field243 = false;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "Z")
    private static boolean field247 = true;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "[I")
    private static int[] field245 = new int[2];

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Z")
    private static boolean field244 = false;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    private static int field251 = 0;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Z")
    private static boolean field246 = true;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Z")
    private static boolean field252 = true;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    private static int field249 = -1;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "Z")
    private static boolean field250 = false;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "Lji;")
    private static class118 field248;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V", line = 5)
    public static final void method156() {
        if (field248.method215((byte) -79)) {
            method163(field248, false);
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "()V", line = 12)
    private static final void method157() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class21 var4 = (class21) field241.method2297(14204); var4 != null; var4 = (class21) field241.method2291(-76)) {
            int var5 = var4.method211();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method216((byte) -68);
            var3 |= var4.method218(-19842);
            var1 += var4.method214(0);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class3.field46 : class3.field45;
        } else if (var0 == 1) {
            var6 = var2 ? class3.field44 : class3.field43;
        } else {
            var6 = var2 ? class3.field41 : class3.field40;
        }
        if (field249 != var6) {
            field249 = var6;
            field252 = true;
        }
        int var7 = field251 > 2 ? 2 : field251;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field252 = true;
            field247 = true;
        }
        if (field250 != var3) {
            field243 = var3;
            field246 = true;
        }
        field251 = var1;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "()V", line = 69)
    public static final void method158() {
        if (!class43.field664 || !class43.field662) {
            return;
        }
        GL var0 = class43.field651;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field245, 0);
            field237 = class19.method188();
        }
        for (class320 var2 = field241.method2297(14204); var2 != null; var2 = field241.method2291(-112)) {
            class21 var3 = (class21) var2;
            if (!var3.method219()) {
                var3.method2195(-1);
            }
        }
        if (field248 == null) {
            field248 = new class118();
        }
        if (!field248.method209() && !field248.method219()) {
            field248.method206();
        }
        method157();
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "()Z", line = 114)
    public static final boolean method159() {
        return field237 != -1;
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "()V", line = 124)
    public static final void method160() {
        if (field237 != -1) {
            class19.method187(field237);
            field237 = -1;
            class43.field651.glDeleteTextures(2, field245, 0);
            field245[0] = -1;
            field245[1] = -1;
        }
        if (field242 != -1) {
            if (field250) {
                class3.method14(field242);
            } else {
                class19.method189(field242);
            }
            field242 = -1;
        }
        if (!field241.method2296(-54)) {
            for (class320 var0 = field241.method2297(14204); var0 != field241.field5269; var0 = var0.field5068) {
                ((class21) var0).method206();
            }
        }
        if (field248 != null && field248.method209()) {
            field248.method206();
        }
        field252 = true;
        field246 = true;
        field247 = true;
        field236 = -1;
        field238 = -1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)Z", line = 166)
    public static final boolean method161(int arg0, int arg1, int arg2, int arg3) {
        if (field237 == -1 || field241.method2296(-55)) {
            field244 = false;
            return false;
        }
        field239 = arg0;
        field240 = arg1;
        boolean var4 = false;
        if (field238 != arg2 || field236 != arg3) {
            field238 = arg2;
            field236 = arg3;
            for (class320 var5 = field241.method2297(14204); var5 != field241.field5269; var5 = var5.field5068) {
                ((class21) var5).method208(field238, field236);
            }
            field252 = true;
            field246 = true;
        }
        GL var6 = class43.field651;
        if (field246) {
            if (field242 != -1 && field250 != field243) {
                if (field250) {
                    class3.method14(field242);
                } else {
                    class19.method189(field242);
                }
                field242 = -1;
            }
            if (field242 == -1) {
                field250 = field243;
                if (field250) {
                    field242 = class3.method19();
                } else {
                    field242 = class19.method195();
                }
                field247 = true;
            }
            if (field250) {
                var6.glBindTexture(34037, field242);
                class3.method17(class3.field39, class3.field48, field238, field236, class3.field48, class3.field52, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field242);
                var6.glRenderbufferStorageEXT(36161, 6402, field238, field236);
            }
            field246 = false;
            var4 = true;
        }
        if (field252) {
            var6.glBindTexture(34037, field245[0]);
            class3.method15(field249, field238, field236);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field251 > 1) {
                var6.glBindTexture(34037, field245[1]);
                class3.method15(field249, field238, field236);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field245[1]);
                class3.method15(field249, 0, 0);
            }
            field252 = false;
            var4 = true;
        }
        class19.method196(field237);
        if (field247) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field245[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field251 > 1 ? field245[1] : 0, 0);
            if (field250) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field242, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field242);
            }
            var6.glDrawBuffer(36064);
            field247 = false;
            var4 = true;
        }
        if (var4) {
            if (class19.method197()) {
                field244 = true;
            } else {
                class19.method191();
                field252 = true;
                field246 = true;
                field247 = true;
                field244 = false;
            }
        }
        class43.method357(-field239, field240 + field236 - class43.field665);
        return field244;
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "()Z", line = 290)
    public static final boolean method162() {
        return field237 != -1 && field248.method209();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lrj;Z)V", line = 294)
    private static final void method163(class21 arg0, boolean arg1) {
        if (arg1) {
            arg0.method206();
        }
        arg0.field317 = false;
        arg0.method2195(-1);
        method157();
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "()Z", line = 305)
    public static final boolean method164() {
        return field237 != -1 && field248.method215((byte) -79);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lrj;)Z", line = 308)
    private static final boolean method165(class21 arg0) {
        if (field237 != -1) {
            if (arg0.method209() || arg0.method219()) {
                if (field238 != -1 && field236 != -1) {
                    arg0.method208(field238, field236);
                }
                arg0.field317 = true;
                field241.method2303((byte) -124, arg0);
                method157();
                return true;
            }
            arg0.method206();
        }
        return false;
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "()V", line = 334)
    public static void method166() {
        field241 = null;
        field245 = null;
        field248 = null;
    }

    @OriginalMember(owner = "client!un", name = "i", descriptor = "()V", line = 339)
    public static final void method167() {
        if (!field244) {
            return;
        }
        GL var0 = class43.field651;
        class43.method391();
        class169.method1335();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class43.method354();
        int var1 = 0;
        int var2 = 1;
        class21 var4;
        for (class21 var3 = (class21) field241.method2297(14204); var3 != null; var3 = var4) {
            var4 = (class21) field241.method2291(97);
            int var5 = var3.method214(0);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method213(var6, field238, field236, field245[var1], field242);
                if (var4 == null && var5 - 1 == var6) {
                    field240 = class43.field665 - field240;
                    class43.method357(0, 0);
                    var0.glDrawBuffer(36064);
                    class19.method191();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field239, field240 - field236);
                    var0.glTexCoord2f((float) field238, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field239 + field238, field240 - field236);
                    var0.glTexCoord2f((float) field238, (float) field236);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field239 + field238, field240);
                    var0.glTexCoord2f(0.0F, (float) field236);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field239, field240);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field238, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field238, 0);
                    var0.glTexCoord2f((float) field238, (float) field236);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field238, field236);
                    var0.glTexCoord2f(0.0F, (float) field236);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field236);
                    var0.glEnd();
                }
                var3.method204(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class43.method376();
    }

    @OriginalMember(owner = "client!un", name = "j", descriptor = "()Z", line = 426)
    public static final boolean method168() {
        if (method164()) {
            return true;
        } else if (!method162()) {
            return false;
        } else if (method165(field248)) {
            return true;
        } else {
            method156();
            return false;
        }
    }
}

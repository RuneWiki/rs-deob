import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class20 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    private static int field219 = 0;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    private static int field220 = -1;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    private static int field223 = -1;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    private static int field222 = 0;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    private static int field224 = -1;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "La;")
    private static class281 field221 = new class281();

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Z")
    private static boolean field225 = false;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Z")
    private static boolean field226 = true;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    private static int field231 = -1;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private static int field228 = 0;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Z")
    private static boolean field232 = true;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
    private static boolean field229 = true;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    private static int field235 = -1;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
    private static boolean field230 = false;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
    private static boolean field227 = false;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "[I")
    private static int[] field234 = new int[2];

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Ltl;")
    private static class282 field233;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()Z", line = 6)
    public static final boolean method152() {
        if (method162()) {
            return true;
        } else if (!method156()) {
            return false;
        } else if (method164(field233)) {
            return true;
        } else {
            method163();
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 22)
    private static final void method153() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class14 var4 = (class14) field221.method1954(-66); var4 != null; var4 = (class14) field221.method1950((byte) 119)) {
            int var5 = var4.method109();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method112((byte) 77);
            var3 |= var4.method106(0);
            var1 += var4.method115(10975);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class150.field2270 : class150.field2269;
        } else if (var0 == 1) {
            var6 = var2 ? class150.field2268 : class150.field2267;
        } else {
            var6 = var2 ? class150.field2265 : class150.field2264;
        }
        if (field231 != var6) {
            field231 = var6;
            field229 = true;
        }
        int var7 = field228 > 2 ? 2 : field228;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field229 = true;
            field226 = true;
        }
        if (field225 != var3) {
            field227 = var3;
            field232 = true;
        }
        field228 = var1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Luc;Z)V", line = 80)
    private static final void method154(class14 arg0, boolean arg1) {
        if (arg1) {
            arg0.method105();
        }
        arg0.field192 = false;
        arg0.method39(10717);
        method153();
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()Z", line = 88)
    public static final boolean method155() {
        return field223 != -1;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()Z", line = 94)
    public static final boolean method156() {
        return field223 != -1 && field233.method108();
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V", line = 97)
    public static final void method157() {
        if (field223 != -1) {
            class186.method1376(field223);
            field223 = -1;
            class73.field1051.glDeleteTextures(2, field234, 0);
            field234[0] = -1;
            field234[1] = -1;
        }
        if (field235 != -1) {
            if (field225) {
                class150.method1125(field235);
            } else {
                class186.method1380(field235);
            }
            field235 = -1;
        }
        if (!field221.method1942(-123)) {
            for (class5 var0 = field221.method1954(-66); var0 != field221.field4370; var0 = var0.field81) {
                ((class14) var0).method105();
            }
        }
        if (field233 != null && field233.method108()) {
            field233.method105();
        }
        field229 = true;
        field232 = true;
        field226 = true;
        field224 = -1;
        field220 = -1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)Z", line = 142)
    public static final boolean method158(int arg0, int arg1, int arg2, int arg3) {
        if (field223 == -1 || field221.method1942(-123)) {
            field230 = false;
            return false;
        }
        field219 = arg0;
        field222 = arg1;
        boolean var4 = false;
        if (field220 != arg2 || field224 != arg3) {
            field220 = arg2;
            field224 = arg3;
            for (class5 var5 = field221.method1954(-66); var5 != field221.field4370; var5 = var5.field81) {
                ((class14) var5).method113(field220, field224);
            }
            field229 = true;
            field232 = true;
        }
        GL var6 = class73.field1051;
        if (field232) {
            if (field235 != -1 && field227 != field225) {
                if (field225) {
                    class150.method1125(field235);
                } else {
                    class186.method1380(field235);
                }
                field235 = -1;
            }
            if (field235 == -1) {
                field225 = field227;
                if (field225) {
                    field235 = class150.method1124();
                } else {
                    field235 = class186.method1381();
                }
                field226 = true;
            }
            if (field225) {
                var6.glBindTexture(34037, field235);
                class150.method1126(class150.field2263, class150.field2272, field220, field224, class150.field2272, class150.field2276, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field235);
                var6.glRenderbufferStorageEXT(36161, 6402, field220, field224);
            }
            field232 = false;
            var4 = true;
        }
        if (field229) {
            var6.glBindTexture(34037, field234[0]);
            class150.method1127(field231, field220, field224);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field228 > 1) {
                var6.glBindTexture(34037, field234[1]);
                class150.method1127(field231, field220, field224);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field234[1]);
                class150.method1127(field231, 0, 0);
            }
            field229 = false;
            var4 = true;
        }
        class186.method1379(field223);
        if (field226) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field234[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field228 > 1 ? field234[1] : 0, 0);
            if (field225) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field235, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field235);
            }
            var6.glDrawBuffer(36064);
            field226 = false;
            var4 = true;
        }
        if (var4) {
            if (class186.method1378()) {
                field230 = true;
            } else {
                class186.method1377();
                field229 = true;
                field232 = true;
                field226 = true;
                field230 = false;
            }
        }
        class73.method543(-field219, field224 + field222 - class73.field1080);
        return field230;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "()V", line = 266)
    public static final void method159() {
        if (!class73.field1039 || !class73.field1060) {
            return;
        }
        GL var0 = class73.field1051;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field234, 0);
            field223 = class186.method1383();
        }
        for (class5 var2 = field221.method1954(-66); var2 != null; var2 = field221.method1950((byte) 109)) {
            class14 var3 = (class14) var2;
            if (!var3.method110()) {
                var3.method39(10717);
            }
        }
        if (field233 == null) {
            field233 = new class282();
        }
        if (!field233.method108() && !field233.method110()) {
            field233.method105();
        }
        method153();
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "()V", line = 307)
    public static void method160() {
        field221 = null;
        field234 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "()V", line = 313)
    public static final void method161() {
        if (!field230) {
            return;
        }
        GL var0 = class73.field1051;
        class73.method557();
        class175.method1314();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class73.method538();
        int var1 = 0;
        int var2 = 1;
        class14 var4;
        for (class14 var3 = (class14) field221.method1954(-66); var3 != null; var3 = var4) {
            var4 = (class14) field221.method1950((byte) 104);
            int var5 = var3.method115(10975);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method114(var6, field220, field224, field234[var1], field235);
                if (var4 == null && var5 - 1 == var6) {
                    field222 = class73.field1080 - field222;
                    class73.method543(0, 0);
                    var0.glDrawBuffer(36064);
                    class186.method1377();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field219, field222 - field224);
                    var0.glTexCoord2f((float) field220, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field220 + field219, field222 - field224);
                    var0.glTexCoord2f((float) field220, (float) field224);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field220 + field219, field222);
                    var0.glTexCoord2f(0.0F, (float) field224);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field219, field222);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field220, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field220, 0);
                    var0.glTexCoord2f((float) field220, (float) field224);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field220, field224);
                    var0.glTexCoord2f(0.0F, (float) field224);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field224);
                    var0.glEnd();
                }
                var3.method111(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class73.method525();
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "()Z", line = 400)
    public static final boolean method162() {
        return field223 != -1 && field233.method107(44);
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "()V", line = 410)
    public static final void method163() {
        if (field233.method107(67)) {
            method154(field233, false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Luc;)Z", line = 415)
    private static final boolean method164(class14 arg0) {
        if (field223 != -1) {
            if (arg0.method108() || arg0.method110()) {
                if (field220 != -1 && field224 != -1) {
                    arg0.method113(field220, field224);
                }
                arg0.field192 = true;
                field221.method1952(arg0, 120);
                method153();
                return true;
            }
            arg0.method105();
        }
        return false;
    }
}

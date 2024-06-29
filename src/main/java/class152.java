import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class152 {

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    private static int field2405 = 0;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private static int field2404 = 0;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    private static int field2406 = -1;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    private static int field2407 = -1;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    private static int field2402 = -1;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lgj;")
    private static class257 field2403 = new class257();

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Z")
    private static boolean field2410 = false;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Z")
    private static boolean field2408 = true;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Z")
    private static boolean field2412 = true;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Z")
    private static boolean field2409 = true;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    private static int field2413 = 0;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[I")
    private static int[] field2414 = new int[2];

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Z")
    private static boolean field2416 = false;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
    private static boolean field2415 = false;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    private static int field2418 = -1;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    private static int field2411 = -1;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Lec;")
    private static class47 field2417;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V", line = 7)
    public static void method1106() {
        field2403 = null;
        field2414 = null;
        field2417 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lpg;)Z", line = 15)
    private static final boolean method1107(class226 arg0) {
        if (field2406 != -1) {
            if (arg0.method292() || arg0.method291()) {
                if (field2407 != -1 && field2402 != -1) {
                    arg0.method294(field2407, field2402);
                }
                arg0.field3410 = true;
                field2403.method1814(arg0, true);
                method1108();
                return true;
            }
            arg0.method293();
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()V", line = 41)
    private static final void method1108() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class226 var4 = (class226) field2403.method1812(1); var4 != null; var4 = (class226) field2403.method1809(128)) {
            int var5 = var4.method290();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1567(-94);
            var3 |= var4.method1568(-75);
            var1 += var4.method1565(50);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class66.field799 : class66.field798;
        } else if (var0 == 1) {
            var6 = var2 ? class66.field797 : class66.field796;
        } else {
            var6 = var2 ? class66.field794 : class66.field793;
        }
        if (field2418 != var6) {
            field2418 = var6;
            field2412 = true;
        }
        int var7 = field2413 > 2 ? 2 : field2413;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field2412 = true;
            field2409 = true;
        }
        if (field2410 != var3) {
            field2415 = var3;
            field2408 = true;
        }
        field2413 = var1;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()V", line = 96)
    public static final void method1109() {
        if (field2406 != -1) {
            class204.method1425(field2406);
            field2406 = -1;
            class272.field4310.glDeleteTextures(2, field2414, 0);
            field2414[0] = -1;
            field2414[1] = -1;
        }
        if (field2411 != -1) {
            if (field2410) {
                class66.method401(field2411);
            } else {
                class204.method1428(field2411);
            }
            field2411 = -1;
        }
        if (!field2403.method1817((byte) 124)) {
            for (class188 var0 = field2403.method1812(1); var0 != field2403.field4061; var0 = var0.field2835) {
                ((class226) var0).method293();
            }
        }
        if (field2417 != null && field2417.method292()) {
            field2417.method293();
        }
        field2412 = true;
        field2408 = true;
        field2409 = true;
        field2402 = -1;
        field2407 = -1;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "()V", line = 137)
    public static final void method1110() {
        if (field2417.method1572(192)) {
            method1115(field2417, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "()V", line = 143)
    public static final void method1111() {
        if (!field2416) {
            return;
        }
        GL var0 = class272.field4310;
        class272.method1939();
        class239.method1656();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class272.method1922();
        int var1 = 0;
        int var2 = 1;
        class226 var4;
        for (class226 var3 = (class226) field2403.method1812(1); var3 != null; var3 = var4) {
            var4 = (class226) field2403.method1809(128);
            int var5 = var3.method1565(53);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method295(var6, field2407, field2402, field2414[var1], field2411);
                if (var4 == null && var5 - 1 == var6) {
                    field2404 = class272.field4311 - field2404;
                    class272.method1945(0, 0);
                    var0.glDrawBuffer(36064);
                    class204.method1432();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field2405, field2404 - field2402);
                    var0.glTexCoord2f((float) field2407, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field2407 + field2405, field2404 - field2402);
                    var0.glTexCoord2f((float) field2407, (float) field2402);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field2407 + field2405, field2404);
                    var0.glTexCoord2f(0.0F, (float) field2402);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field2405, field2404);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field2407, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field2407, 0);
                    var0.glTexCoord2f((float) field2407, (float) field2402);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field2407, field2402);
                    var0.glTexCoord2f(0.0F, (float) field2402);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field2402);
                    var0.glEnd();
                }
                var3.method296(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class272.method1942();
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "()Z", line = 227)
    public static final boolean method1112() {
        return field2406 != -1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)Z", line = 231)
    public static final boolean method1113(int arg0, int arg1, int arg2, int arg3) {
        if (field2406 == -1 || field2403.method1817((byte) 127)) {
            field2416 = false;
            return false;
        }
        field2405 = arg0;
        field2404 = arg1;
        boolean var4 = false;
        if (field2407 != arg2 || field2402 != arg3) {
            field2407 = arg2;
            field2402 = arg3;
            for (class188 var5 = field2403.method1812(1); var5 != field2403.field4061; var5 = var5.field2835) {
                ((class226) var5).method294(field2407, field2402);
            }
            field2412 = true;
            field2408 = true;
        }
        GL var6 = class272.field4310;
        if (field2408) {
            if (field2411 != -1 && field2415 != field2410) {
                if (field2410) {
                    class66.method401(field2411);
                } else {
                    class204.method1428(field2411);
                }
                field2411 = -1;
            }
            if (field2411 == -1) {
                field2410 = field2415;
                if (field2410) {
                    field2411 = class66.method403();
                } else {
                    field2411 = class204.method1430();
                }
                field2409 = true;
            }
            if (field2410) {
                var6.glBindTexture(34037, field2411);
                class66.method398(class66.field792, class66.field801, field2407, field2402, class66.field801, class66.field805, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field2411);
                var6.glRenderbufferStorageEXT(36161, 6402, field2407, field2402);
            }
            field2408 = false;
            var4 = true;
        }
        if (field2412) {
            var6.glBindTexture(34037, field2414[0]);
            class66.method404(field2418, field2407, field2402);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field2413 > 1) {
                var6.glBindTexture(34037, field2414[1]);
                class66.method404(field2418, field2407, field2402);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field2414[1]);
                class66.method404(field2418, 0, 0);
            }
            field2412 = false;
            var4 = true;
        }
        class204.method1429(field2406);
        if (field2409) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field2414[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field2413 > 1 ? field2414[1] : 0, 0);
            if (field2410) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field2411, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field2411);
            }
            var6.glDrawBuffer(36064);
            field2409 = false;
            var4 = true;
        }
        if (var4) {
            if (class204.method1427()) {
                field2416 = true;
            } else {
                class204.method1432();
                field2412 = true;
                field2408 = true;
                field2409 = true;
                field2416 = false;
            }
        }
        class272.method1945(-field2405, field2404 + field2402 - class272.field4311);
        return field2416;
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "()V", line = 362)
    public static final void method1114() {
        if (!class272.field4270 || !class272.field4273) {
            return;
        }
        GL var0 = class272.field4310;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field2414, 0);
            field2406 = class204.method1424();
        }
        for (class188 var2 = field2403.method1812(1); var2 != null; var2 = field2403.method1809(128)) {
            class226 var3 = (class226) var2;
            if (!var3.method291()) {
                var3.method1290(116);
            }
        }
        if (field2417 == null) {
            field2417 = new class47();
        }
        if (!field2417.method292() && !field2417.method291()) {
            field2417.method293();
        }
        method1108();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lpg;Z)V", line = 406)
    private static final void method1115(class226 arg0, boolean arg1) {
        if (arg1) {
            arg0.method293();
        }
        arg0.field3410 = false;
        arg0.method1290(102);
        method1108();
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "()Z", line = 417)
    public static final boolean method1116() {
        return field2406 != -1 && field2417.method1572(192);
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "()Z", line = 420)
    public static final boolean method1117() {
        return field2406 != -1 && field2417.method292();
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "()Z", line = 423)
    public static final boolean method1118() {
        if (method1116()) {
            return true;
        } else if (!method1117()) {
            return false;
        } else if (method1107(field2417)) {
            return true;
        } else {
            method1110();
            return false;
        }
    }
}

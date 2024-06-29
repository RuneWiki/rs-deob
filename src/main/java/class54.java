import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class54 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    private static int field822 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    private static int field820 = 0;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    private static int field821 = -1;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    private static int field819 = -1;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    private static int field824 = -1;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lwn;")
    private static class30 field823 = new class30();

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Z")
    private static boolean field825 = false;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Z")
    private static boolean field827 = false;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Z")
    private static boolean field826 = false;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    private static int field832 = -1;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    private static int field830 = 0;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Z")
    private static boolean field828 = true;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Z")
    private static boolean field835 = true;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    private static int field834 = -1;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Z")
    private static boolean field831 = true;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[I")
    private static int[] field833 = new int[2];

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lfl;")
    private static class240 field829;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lkg;)Z", line = 4)
    private static final boolean method453(class82 arg0) {
        if (field824 != -1) {
            if (arg0.method648() || arg0.method651()) {
                if (field821 != -1 && field819 != -1) {
                    arg0.method640(field821, field819);
                }
                arg0.field1280 = true;
                field823.method277(arg0, (byte) -119);
                method463();
                return true;
            }
            arg0.method637();
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 30)
    public static final void method454() {
        if (!field825) {
            return;
        }
        GL var0 = class162.field2654;
        class162.method1195();
        class114.method892();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class162.method1196();
        int var1 = 0;
        int var2 = 1;
        class82 var4;
        for (class82 var3 = (class82) field823.method268(-1); var3 != null; var3 = var4) {
            var4 = (class82) field823.method278(1);
            int var5 = var3.method652((byte) 69);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method643(var6, field821, field819, field833[var1], field834);
                if (var4 == null && var5 - 1 == var6) {
                    field822 = class162.field2618 - field822;
                    class162.method1216(0, 0);
                    var0.glDrawBuffer(36064);
                    class46.method398();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field820, field822 - field819);
                    var0.glTexCoord2f((float) field821, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field821 + field820, field822 - field819);
                    var0.glTexCoord2f((float) field821, (float) field819);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field821 + field820, field822);
                    var0.glTexCoord2f(0.0F, (float) field819);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field820, field822);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field821, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field821, 0);
                    var0.glTexCoord2f((float) field821, (float) field819);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field821, field819);
                    var0.glTexCoord2f(0.0F, (float) field819);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field819);
                    var0.glEnd();
                }
                var3.method653(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class162.method1203();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lkg;Z)V", line = 114)
    private static final void method455(class82 arg0, boolean arg1) {
        if (arg1) {
            arg0.method637();
        }
        arg0.field1280 = false;
        arg0.method489(false);
        method463();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)Z", line = 122)
    public static final boolean method456(int arg0, int arg1, int arg2, int arg3) {
        if (field824 == -1 || field823.method265((byte) 23)) {
            field825 = false;
            return false;
        }
        field820 = arg0;
        field822 = arg1;
        boolean var4 = false;
        if (field821 != arg2 || field819 != arg3) {
            field821 = arg2;
            field819 = arg3;
            for (class60 var5 = field823.method268(-1); var5 != field823.field481; var5 = var5.field891) {
                ((class82) var5).method640(field821, field819);
            }
            field831 = true;
            field835 = true;
        }
        GL var6 = class162.field2654;
        if (field835) {
            if (field834 != -1 && field827 != field826) {
                if (field826) {
                    class287.method2017(field834);
                } else {
                    class46.method400(field834);
                }
                field834 = -1;
            }
            if (field834 == -1) {
                field826 = field827;
                if (field826) {
                    field834 = class287.method2021();
                } else {
                    field834 = class46.method401();
                }
                field828 = true;
            }
            if (field826) {
                var6.glBindTexture(34037, field834);
                class287.method2019(class287.field4490, class287.field4499, field821, field819, class287.field4499, class287.field4503, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field834);
                var6.glRenderbufferStorageEXT(36161, 6402, field821, field819);
            }
            field835 = false;
            var4 = true;
        }
        if (field831) {
            var6.glBindTexture(34037, field833[0]);
            class287.method2015(field832, field821, field819);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field830 > 1) {
                var6.glBindTexture(34037, field833[1]);
                class287.method2015(field832, field821, field819);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field833[1]);
                class287.method2015(field832, 0, 0);
            }
            field831 = false;
            var4 = true;
        }
        class46.method397(field824);
        if (field828) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field833[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field830 > 1 ? field833[1] : 0, 0);
            if (field826) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field834, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field834);
            }
            var6.glDrawBuffer(36064);
            field828 = false;
            var4 = true;
        }
        if (var4) {
            if (class46.method392()) {
                field825 = true;
            } else {
                class46.method398();
                field831 = true;
                field835 = true;
                field828 = true;
                field825 = false;
            }
        }
        class162.method1216(-field820, field822 + field819 - class162.field2618);
        return field825;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()Z", line = 246)
    public static final boolean method457() {
        return field824 != -1 && field829.method648();
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "()Z", line = 249)
    public static final boolean method458() {
        if (method459()) {
            return true;
        } else if (!method457()) {
            return false;
        } else if (method453(field829)) {
            return true;
        } else {
            method462();
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "()Z", line = 266)
    public static final boolean method459() {
        return field824 != -1 && field829.method638(-110);
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "()V", line = 275)
    public static void method460() {
        field823 = null;
        field833 = null;
        field829 = null;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "()V", line = 280)
    public static final void method461() {
        if (field824 != -1) {
            class46.method402(field824);
            field824 = -1;
            class162.field2654.glDeleteTextures(2, field833, 0);
            field833[0] = -1;
            field833[1] = -1;
        }
        if (field834 != -1) {
            if (field826) {
                class287.method2017(field834);
            } else {
                class46.method400(field834);
            }
            field834 = -1;
        }
        if (!field823.method265((byte) 23)) {
            for (class60 var0 = field823.method268(-1); var0 != field823.field481; var0 = var0.field891) {
                ((class82) var0).method637();
            }
        }
        if (field829 != null && field829.method648()) {
            field829.method637();
        }
        field831 = true;
        field835 = true;
        field828 = true;
        field819 = -1;
        field821 = -1;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "()V", line = 322)
    public static final void method462() {
        if (field829.method638(104)) {
            method455(field829, false);
        }
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "()V", line = 336)
    private static final void method463() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class82 var4 = (class82) field823.method268(-1); var4 != null; var4 = (class82) field823.method278(1)) {
            int var5 = var4.method636();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method642(false);
            var3 |= var4.method647(127);
            var1 += var4.method652((byte) 69);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class287.field4497 : class287.field4496;
        } else if (var0 == 1) {
            var6 = var2 ? class287.field4495 : class287.field4494;
        } else {
            var6 = var2 ? class287.field4492 : class287.field4491;
        }
        if (field832 != var6) {
            field832 = var6;
            field831 = true;
        }
        int var7 = field830 > 2 ? 2 : field830;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field831 = true;
            field828 = true;
        }
        if (field826 != var3) {
            field827 = var3;
            field835 = true;
        }
        field830 = var1;
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "()V", line = 391)
    public static final void method464() {
        if (!class162.field2655 || !class162.field2642) {
            return;
        }
        GL var0 = class162.field2654;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field833, 0);
            field824 = class46.method394();
        }
        for (class60 var2 = field823.method268(-1); var2 != null; var2 = field823.method278(1)) {
            class82 var3 = (class82) var2;
            if (!var3.method651()) {
                var3.method489(false);
            }
        }
        if (field829 == null) {
            field829 = new class240();
        }
        if (!field829.method648() && !field829.method651()) {
            field829.method637();
        }
        method463();
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "()Z", line = 435)
    public static final boolean method465() {
        return field824 != -1;
    }
}

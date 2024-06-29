import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class46 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    private static int field571 = 0;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    private static int field572 = 0;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    private static int field574 = -1;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    private static int field573 = -1;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    private static int field575 = -1;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lll;")
    private static class54 field576 = new class54();

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Z")
    private static boolean field582 = false;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Z")
    private static boolean field578 = false;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Z")
    private static boolean field579 = false;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Z")
    private static boolean field580 = true;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
    private static boolean field577 = true;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
    private static int[] field584 = new int[2];

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    private static int field585 = -1;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Z")
    private static boolean field583 = true;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    private static int field581 = 0;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    private static int field586 = -1;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Ldd;")
    private static class110 field587;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V", line = 5)
    private static final void method326() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class323 var4 = (class323) field576.method413(1253231568); var4 != null; var4 = (class323) field576.method419(89)) {
            int var5 = var4.method783();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method2236(-66);
            var3 |= var4.method2237((byte) -12);
            var1 += var4.method2230((byte) -103);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class358.field5598 : class358.field5597;
        } else if (var0 == 1) {
            var6 = var2 ? class358.field5596 : class358.field5595;
        } else {
            var6 = var2 ? class358.field5593 : class358.field5592;
        }
        if (field585 != var6) {
            field585 = var6;
            field580 = true;
        }
        int var7 = field581 > 2 ? 2 : field581;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field580 = true;
            field583 = true;
        }
        if (field582 != var3) {
            field579 = var3;
            field577 = true;
        }
        field581 = var1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()Z", line = 60)
    public static final boolean method327() {
        if (method337()) {
            return true;
        } else if (!method333()) {
            return false;
        } else if (method331(field587)) {
            return true;
        } else {
            method329();
            return false;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()V", line = 75)
    public static final void method328() {
        if (!class47.field614 || !class47.field596) {
            return;
        }
        GL var0 = class47.field592;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field584, 0);
            field574 = class320.method2208();
        }
        for (class26 var2 = field576.method413(1253231568); var2 != null; var2 = field576.method419(5)) {
            class323 var3 = (class323) var2;
            if (!var3.method785()) {
                var3.method179((byte) 51);
            }
        }
        if (field587 == null) {
            field587 = new class110();
        }
        if (!field587.method782() && !field587.method785()) {
            field587.method781();
        }
        method326();
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()V", line = 117)
    public static final void method329() {
        if (field587.method2231(59)) {
            method332(field587, false);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)Z", line = 122)
    public static final boolean method330(int arg0, int arg1, int arg2, int arg3) {
        if (field574 == -1 || field576.method412(-29937)) {
            field578 = false;
            return false;
        }
        field572 = arg0;
        field571 = arg1;
        boolean var4 = false;
        if (field575 != arg2 || field573 != arg3) {
            field575 = arg2;
            field573 = arg3;
            for (class26 var5 = field576.method413(1253231568); var5 != field576.field704; var5 = var5.field301) {
                ((class323) var5).method780(field575, field573);
            }
            field580 = true;
            field577 = true;
        }
        GL var6 = class47.field592;
        if (field577) {
            if (field586 != -1 && field582 != field579) {
                if (field582) {
                    class358.method2487(field586);
                } else {
                    class320.method2212(field586);
                }
                field586 = -1;
            }
            if (field586 == -1) {
                field582 = field579;
                if (field582) {
                    field586 = class358.method2490();
                } else {
                    field586 = class320.method2205();
                }
                field583 = true;
            }
            if (field582) {
                var6.glBindTexture(34037, field586);
                class358.method2484(class358.field5591, class358.field5600, field575, field573, class358.field5600, class358.field5604, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field586);
                var6.glRenderbufferStorageEXT(36161, 6402, field575, field573);
            }
            field577 = false;
            var4 = true;
        }
        if (field580) {
            var6.glBindTexture(34037, field584[0]);
            class358.method2485(field585, field575, field573);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field581 > 1) {
                var6.glBindTexture(34037, field584[1]);
                class358.method2485(field585, field575, field573);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field584[1]);
                class358.method2485(field585, 0, 0);
            }
            field580 = false;
            var4 = true;
        }
        class320.method2214(field574);
        if (field583) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field584[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field581 > 1 ? field584[1] : 0, 0);
            if (field582) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field586, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field586);
            }
            var6.glDrawBuffer(36064);
            field583 = false;
            var4 = true;
        }
        if (var4) {
            if (class320.method2215()) {
                field578 = true;
            } else {
                class320.method2213();
                field580 = true;
                field577 = true;
                field583 = true;
                field578 = false;
            }
        }
        class47.method341(-field572, field573 + field571 - class47.field621);
        return field578;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lbc;)Z", line = 249)
    private static final boolean method331(class323 arg0) {
        if (field574 != -1) {
            if (arg0.method782() || arg0.method785()) {
                if (field575 != -1 && field573 != -1) {
                    arg0.method780(field575, field573);
                }
                arg0.field4738 = true;
                field576.method415((byte) -12, arg0);
                method326();
                return true;
            }
            arg0.method781();
        }
        return false;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lbc;Z)V", line = 278)
    private static final void method332(class323 arg0, boolean arg1) {
        if (arg1) {
            arg0.method781();
        }
        arg0.field4738 = false;
        arg0.method179((byte) 51);
        method326();
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "()Z", line = 292)
    public static final boolean method333() {
        return field574 != -1 && field587.method782();
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "()V", line = 295)
    public static void method334() {
        field576 = null;
        field584 = null;
        field587 = null;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "()Z", line = 300)
    public static final boolean method335() {
        return field574 != -1;
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "()V", line = 303)
    public static final void method336() {
        if (!field578) {
            return;
        }
        GL var0 = class47.field592;
        class47.method353();
        class129.method994();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class47.method346();
        int var1 = 0;
        int var2 = 1;
        class323 var4;
        for (class323 var3 = (class323) field576.method413(1253231568); var3 != null; var3 = var4) {
            var4 = (class323) field576.method419(110);
            int var5 = var3.method2230((byte) -103);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method779(var6, field575, field573, field584[var1], field586);
                if (var4 == null && var5 - 1 == var6) {
                    field571 = class47.field621 - field571;
                    class47.method341(0, 0);
                    var0.glDrawBuffer(36064);
                    class320.method2213();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field572, field571 - field573);
                    var0.glTexCoord2f((float) field575, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field575 + field572, field571 - field573);
                    var0.glTexCoord2f((float) field575, (float) field573);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field575 + field572, field571);
                    var0.glTexCoord2f(0.0F, (float) field573);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field572, field571);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field575, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field575, 0);
                    var0.glTexCoord2f((float) field575, (float) field573);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field575, field573);
                    var0.glTexCoord2f(0.0F, (float) field573);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field573);
                    var0.glEnd();
                }
                var3.method784(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class47.method348();
    }

    @OriginalMember(owner = "client!di", name = "i", descriptor = "()Z", line = 392)
    public static final boolean method337() {
        return field574 != -1 && field587.method2231(89);
    }

    @OriginalMember(owner = "client!di", name = "j", descriptor = "()V", line = 396)
    public static final void method338() {
        if (field574 != -1) {
            class320.method2209(field574);
            field574 = -1;
            class47.field592.glDeleteTextures(2, field584, 0);
            field584[0] = -1;
            field584[1] = -1;
        }
        if (field586 != -1) {
            if (field582) {
                class358.method2487(field586);
            } else {
                class320.method2212(field586);
            }
            field586 = -1;
        }
        if (!field576.method412(-29937)) {
            for (class26 var0 = field576.method413(1253231568); var0 != field576.field704; var0 = var0.field301) {
                ((class323) var0).method781();
            }
        }
        if (field587 != null && field587.method782()) {
            field587.method781();
        }
        field580 = true;
        field577 = true;
        field583 = true;
        field573 = -1;
        field575 = -1;
    }
}

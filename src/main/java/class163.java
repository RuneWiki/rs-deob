import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class163 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    private static int field2731 = -1;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    private static int field2733 = 0;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    private static int field2730 = 0;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    private static int field2734 = -1;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    private static int field2735 = -1;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Len;")
    private static class49 field2732 = new class49();

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Z")
    private static boolean field2741 = false;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    private static int field2739 = 0;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Z")
    private static boolean field2740 = false;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Z")
    private static boolean field2736 = true;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    private static int field2742 = -1;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "[I")
    private static int[] field2737 = new int[2];

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    private static int field2744 = -1;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Z")
    private static boolean field2743 = true;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "Z")
    private static boolean field2745 = false;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Z")
    private static boolean field2746 = true;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lwk;")
    private static class196 field2738;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V", line = 4)
    public static final void method1165() {
        if (!field2741) {
            return;
        }
        GL var0 = class241.field4012;
        class241.method1683();
        class337.method2374();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class241.method1689();
        int var1 = 0;
        int var2 = 1;
        class46 var4;
        for (class46 var3 = (class46) field2732.method431(0); var3 != null; var3 = var4) {
            var4 = (class46) field2732.method439(-28512);
            int var5 = var3.method389(1);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method385(var6, field2731, field2734, field2737[var1], field2742);
                if (var4 == null && var5 - 1 == var6) {
                    field2733 = class241.field3993 - field2733;
                    class241.method1711(0, 0);
                    var0.glDrawBuffer(36064);
                    class247.method1740();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field2730, field2733 - field2734);
                    var0.glTexCoord2f((float) field2731, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field2731 + field2730, field2733 - field2734);
                    var0.glTexCoord2f((float) field2731, (float) field2734);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field2731 + field2730, field2733);
                    var0.glTexCoord2f(0.0F, (float) field2734);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field2730, field2733);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field2731, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field2731, 0);
                    var0.glTexCoord2f((float) field2731, (float) field2734);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field2731, field2734);
                    var0.glTexCoord2f(0.0F, (float) field2734);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field2734);
                    var0.glEnd();
                }
                var3.method391(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class241.method1700();
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()Z", line = 88)
    public static final boolean method1166() {
        if (method1173()) {
            return true;
        } else if (!method1171()) {
            return false;
        } else if (method1170(field2738)) {
            return true;
        } else {
            method1176();
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()V", line = 104)
    private static final void method1167() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class46 var4 = (class46) field2732.method431(0); var4 != null; var4 = (class46) field2732.method439(-28512)) {
            int var5 = var4.method378();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method387((byte) 94);
            var3 |= var4.method384(true);
            var1 += var4.method389(1);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class62.field1203 : class62.field1202;
        } else if (var0 == 1) {
            var6 = var2 ? class62.field1201 : class62.field1200;
        } else {
            var6 = var2 ? class62.field1198 : class62.field1197;
        }
        if (field2744 != var6) {
            field2744 = var6;
            field2746 = true;
        }
        int var7 = field2739 > 2 ? 2 : field2739;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field2746 = true;
            field2743 = true;
        }
        if (field2740 != var3) {
            field2745 = var3;
            field2736 = true;
        }
        field2739 = var1;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "()V", line = 159)
    public static final void method1168() {
        if (!class241.field4036 || !class241.field3997) {
            return;
        }
        GL var0 = class241.field4012;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field2737, 0);
            field2735 = class247.method1738();
        }
        for (class70 var2 = field2732.method431(0); var2 != null; var2 = field2732.method439(-28512)) {
            class46 var3 = (class46) var2;
            if (!var3.method374()) {
                var3.method535(-2801);
            }
        }
        if (field2738 == null) {
            field2738 = new class196();
        }
        if (!field2738.method383() && !field2738.method374()) {
            field2738.method386();
        }
        method1167();
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "()Z", line = 201)
    public static final boolean method1169() {
        return field2735 != -1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnn;)Z", line = 205)
    private static final boolean method1170(class46 arg0) {
        if (field2735 != -1) {
            if (arg0.method383() || arg0.method374()) {
                if (field2731 != -1 && field2734 != -1) {
                    arg0.method388(field2731, field2734);
                }
                arg0.field924 = true;
                field2732.method437(arg0, (byte) 51);
                method1167();
                return true;
            }
            arg0.method386();
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "()Z", line = 230)
    public static final boolean method1171() {
        return field2735 != -1 && field2738.method383();
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "()V", line = 233)
    public static void method1172() {
        field2732 = null;
        field2737 = null;
        field2738 = null;
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "()Z", line = 239)
    public static final boolean method1173() {
        return field2735 != -1 && field2738.method390(-16923);
    }

    @OriginalMember(owner = "client!um", name = "i", descriptor = "()V", line = 242)
    public static final void method1174() {
        if (field2735 != -1) {
            class247.method1739(field2735);
            field2735 = -1;
            class241.field4012.glDeleteTextures(2, field2737, 0);
            field2737[0] = -1;
            field2737[1] = -1;
        }
        if (field2742 != -1) {
            if (field2740) {
                class62.method508(field2742);
            } else {
                class247.method1741(field2742);
            }
            field2742 = -1;
        }
        if (!field2732.method441(false)) {
            for (class70 var0 = field2732.method431(0); var0 != field2732.field1022; var0 = var0.field1290) {
                ((class46) var0).method386();
            }
        }
        if (field2738 != null && field2738.method383()) {
            field2738.method386();
        }
        field2746 = true;
        field2736 = true;
        field2743 = true;
        field2734 = -1;
        field2731 = -1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIII)Z", line = 285)
    public static final boolean method1175(int arg0, int arg1, int arg2, int arg3) {
        if (field2735 == -1 || field2732.method441(false)) {
            field2741 = false;
            return false;
        }
        field2730 = arg0;
        field2733 = arg1;
        boolean var4 = false;
        if (field2731 != arg2 || field2734 != arg3) {
            field2731 = arg2;
            field2734 = arg3;
            for (class70 var5 = field2732.method431(0); var5 != field2732.field1022; var5 = var5.field1290) {
                ((class46) var5).method388(field2731, field2734);
            }
            field2746 = true;
            field2736 = true;
        }
        GL var6 = class241.field4012;
        if (field2736) {
            if (field2742 != -1 && field2745 != field2740) {
                if (field2740) {
                    class62.method508(field2742);
                } else {
                    class247.method1741(field2742);
                }
                field2742 = -1;
            }
            if (field2742 == -1) {
                field2740 = field2745;
                if (field2740) {
                    field2742 = class62.method505();
                } else {
                    field2742 = class247.method1744();
                }
                field2743 = true;
            }
            if (field2740) {
                var6.glBindTexture(34037, field2742);
                class62.method504(class62.field1196, class62.field1205, field2731, field2734, class62.field1205, class62.field1209, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field2742);
                var6.glRenderbufferStorageEXT(36161, 6402, field2731, field2734);
            }
            field2736 = false;
            var4 = true;
        }
        if (field2746) {
            var6.glBindTexture(34037, field2737[0]);
            class62.method500(field2744, field2731, field2734);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field2739 > 1) {
                var6.glBindTexture(34037, field2737[1]);
                class62.method500(field2744, field2731, field2734);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field2737[1]);
                class62.method500(field2744, 0, 0);
            }
            field2746 = false;
            var4 = true;
        }
        class247.method1743(field2735);
        if (field2743) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field2737[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field2739 > 1 ? field2737[1] : 0, 0);
            if (field2740) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field2742, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field2742);
            }
            var6.glDrawBuffer(36064);
            field2743 = false;
            var4 = true;
        }
        if (var4) {
            if (class247.method1745()) {
                field2741 = true;
            } else {
                class247.method1740();
                field2746 = true;
                field2736 = true;
                field2743 = true;
                field2741 = false;
            }
        }
        class241.method1711(-field2730, field2734 + field2733 - class241.field3993);
        return field2741;
    }

    @OriginalMember(owner = "client!um", name = "j", descriptor = "()V", line = 414)
    public static final void method1176() {
        if (field2738.method390(-16923)) {
            method1177(field2738, false);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnn;Z)V", line = 429)
    private static final void method1177(class46 arg0, boolean arg1) {
        if (arg1) {
            arg0.method386();
        }
        arg0.field924 = false;
        arg0.method535(-2801);
        method1167();
    }
}

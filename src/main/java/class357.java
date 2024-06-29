import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class357 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    private static int field5676 = -1;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    private static int field5679 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    private static int field5678 = -1;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    private static int field5677 = 0;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    private static int field5680 = -1;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lfk;")
    private static class317 field5681 = new class317();

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Z")
    private static boolean field5684 = false;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Z")
    private static boolean field5686 = true;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Z")
    private static boolean field5687 = false;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
    private static boolean field5688 = false;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    private static int field5683 = 0;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[I")
    private static int[] field5690 = new int[2];

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    private static int field5691 = -1;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    private static int field5692 = -1;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Z")
    private static boolean field5689 = true;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Z")
    private static boolean field5682 = true;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lw;")
    private static class39 field5685;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lda;Z)V", line = 7)
    private static final void method2504(class165 arg0, boolean arg1) {
        if (arg1) {
            arg0.method386();
        }
        arg0.field2624 = false;
        arg0.method1357(947647010);
        method2516();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V", line = 17)
    public static final void method2505() {
        if (!field5684) {
            return;
        }
        GL var0 = class240.field3771;
        class240.method1780();
        class213.method1596();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class240.method1791();
        int var1 = 0;
        int var2 = 1;
        class165 var4;
        for (class165 var3 = (class165) field5681.method2244((byte) -127); var3 != null; var3 = var4) {
            var4 = (class165) field5681.method2241(-1);
            int var5 = var3.method1312(-110);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method387(var6, field5676, field5678, field5690[var1], field5692);
                if (var4 == null && var5 - 1 == var6) {
                    field5677 = class240.field3749 - field5677;
                    class240.method1797(0, 0);
                    var0.glDrawBuffer(36064);
                    class17.method177();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field5679, field5677 - field5678);
                    var0.glTexCoord2f((float) field5676, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field5679 + field5676, field5677 - field5678);
                    var0.glTexCoord2f((float) field5676, (float) field5678);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field5679 + field5676, field5677);
                    var0.glTexCoord2f(0.0F, (float) field5678);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field5679, field5677);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field5676, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field5676, 0);
                    var0.glTexCoord2f((float) field5676, (float) field5678);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field5676, field5678);
                    var0.glTexCoord2f(0.0F, (float) field5678);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field5678);
                    var0.glEnd();
                }
                var3.method383(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class240.method1803();
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()Z", line = 101)
    public static final boolean method2506() {
        return field5680 != -1 && field5685.method1317((byte) -127);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()Z", line = 105)
    public static final boolean method2507() {
        if (method2506()) {
            return true;
        } else if (!method2512()) {
            return false;
        } else if (method2515(field5685)) {
            return true;
        } else {
            method2510();
            return false;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()V", line = 120)
    public static final void method2508() {
        if (!class240.field3730 || !class240.field3761) {
            return;
        }
        GL var0 = class240.field3771;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field5690, 0);
            field5680 = class17.method179();
        }
        for (class172 var2 = field5681.method2244((byte) -125); var2 != null; var2 = field5681.method2241(-1)) {
            class165 var3 = (class165) var2;
            if (!var3.method388()) {
                var3.method1357(947647010);
            }
        }
        if (field5685 == null) {
            field5685 = new class39();
        }
        if (!field5685.method385() && !field5685.method388()) {
            field5685.method386();
        }
        method2516();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)Z", line = 164)
    public static final boolean method2509(int arg0, int arg1, int arg2, int arg3) {
        if (field5680 == -1 || field5681.method2230((byte) 119)) {
            field5684 = false;
            return false;
        }
        field5679 = arg0;
        field5677 = arg1;
        boolean var4 = false;
        if (field5676 != arg2 || field5678 != arg3) {
            field5676 = arg2;
            field5678 = arg3;
            for (class172 var5 = field5681.method2244((byte) -126); var5 != field5681.field4897; var5 = var5.field2737) {
                ((class165) var5).method384(field5676, field5678);
            }
            field5686 = true;
            field5689 = true;
        }
        GL var6 = class240.field3771;
        if (field5689) {
            if (field5692 != -1 && field5688 != field5687) {
                if (field5687) {
                    class183.method1415(field5692);
                } else {
                    class17.method174(field5692);
                }
                field5692 = -1;
            }
            if (field5692 == -1) {
                field5687 = field5688;
                if (field5687) {
                    field5692 = class183.method1413();
                } else {
                    field5692 = class17.method176();
                }
                field5682 = true;
            }
            if (field5687) {
                var6.glBindTexture(34037, field5692);
                class183.method1412(class183.field2870, class183.field2879, field5676, field5678, class183.field2879, class183.field2883, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field5692);
                var6.glRenderbufferStorageEXT(36161, 6402, field5676, field5678);
            }
            field5689 = false;
            var4 = true;
        }
        if (field5686) {
            var6.glBindTexture(34037, field5690[0]);
            class183.method1417(field5691, field5676, field5678);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field5683 > 1) {
                var6.glBindTexture(34037, field5690[1]);
                class183.method1417(field5691, field5676, field5678);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field5690[1]);
                class183.method1417(field5691, 0, 0);
            }
            field5686 = false;
            var4 = true;
        }
        class17.method181(field5680);
        if (field5682) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field5690[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field5683 > 1 ? field5690[1] : 0, 0);
            if (field5687) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field5692, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field5692);
            }
            var6.glDrawBuffer(36064);
            field5682 = false;
            var4 = true;
        }
        if (var4) {
            if (class17.method175()) {
                field5684 = true;
            } else {
                class17.method177();
                field5686 = true;
                field5689 = true;
                field5682 = true;
                field5684 = false;
            }
        }
        class240.method1797(-field5679, field5678 + field5677 - class240.field3749);
        return field5684;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V", line = 288)
    public static final void method2510() {
        if (field5685.method1317((byte) -83)) {
            method2504(field5685, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "()Z", line = 293)
    public static final boolean method2511() {
        return field5680 != -1;
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "()Z", line = 296)
    public static final boolean method2512() {
        return field5680 != -1 && field5685.method385();
    }

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "()V", line = 302)
    public static void method2513() {
        field5681 = null;
        field5690 = null;
        field5685 = null;
    }

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "()V", line = 308)
    public static final void method2514() {
        if (field5680 != -1) {
            class17.method173(field5680);
            field5680 = -1;
            class240.field3771.glDeleteTextures(2, field5690, 0);
            field5690[0] = -1;
            field5690[1] = -1;
        }
        if (field5692 != -1) {
            if (field5687) {
                class183.method1415(field5692);
            } else {
                class17.method174(field5692);
            }
            field5692 = -1;
        }
        if (!field5681.method2230((byte) 125)) {
            for (class172 var0 = field5681.method2244((byte) -127); var0 != field5681.field4897; var0 = var0.field2737) {
                ((class165) var0).method386();
            }
        }
        if (field5685 != null && field5685.method385()) {
            field5685.method386();
        }
        field5686 = true;
        field5689 = true;
        field5682 = true;
        field5678 = -1;
        field5676 = -1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lda;)Z", line = 352)
    private static final boolean method2515(class165 arg0) {
        if (field5680 != -1) {
            if (arg0.method385() || arg0.method388()) {
                if (field5676 != -1 && field5678 != -1) {
                    arg0.method384(field5676, field5678);
                }
                arg0.field2624 = true;
                field5681.method2245(arg0, 24);
                method2516();
                return true;
            }
            arg0.method386();
        }
        return false;
    }

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "()V", line = 414)
    private static final void method2516() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class165 var4 = (class165) field5681.method2244((byte) -126); var4 != null; var4 = (class165) field5681.method2241(-1)) {
            int var5 = var4.method389();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1314(1);
            var3 |= var4.method1313(2);
            var1 += var4.method1312(-111);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class183.field2877 : class183.field2876;
        } else if (var0 == 1) {
            var6 = var2 ? class183.field2875 : class183.field2874;
        } else {
            var6 = var2 ? class183.field2872 : class183.field2871;
        }
        if (field5691 != var6) {
            field5691 = var6;
            field5686 = true;
        }
        int var7 = field5683 > 2 ? 2 : field5683;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field5686 = true;
            field5682 = true;
        }
        if (field5687 != var3) {
            field5688 = var3;
            field5689 = true;
        }
        field5683 = var1;
    }
}

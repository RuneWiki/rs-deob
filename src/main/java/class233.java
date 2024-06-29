import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class233 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    private static int field3512 = 0;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private static int field3511 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    private static int field3510 = -1;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    private static int field3513 = -1;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    private static int field3515 = -1;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lbo;")
    private static class16 field3514 = new class16();

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Z")
    private static boolean field3518 = false;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Z")
    private static boolean field3517 = true;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private static int field3519 = -1;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Z")
    private static boolean field3521 = false;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Z")
    private static boolean field3520 = true;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
    private static boolean field3522 = false;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    private static int field3525 = 0;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private static int field3524 = -1;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[I")
    private static int[] field3523 = new int[2];

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Z")
    private static boolean field3526 = true;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lmi;")
    private static class13 field3516;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lna;)Z", line = 7)
    private static final boolean method1723(class146 arg0) {
        if (field3510 != -1) {
            if (arg0.method75() || arg0.method73()) {
                if (field3515 != -1 && field3513 != -1) {
                    arg0.method79(field3515, field3513);
                }
                arg0.field2110 = true;
                field3514.method106(arg0, -128);
                method1728();
                return true;
            }
            arg0.method74();
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()Z", line = 32)
    public static final boolean method1724() {
        if (method1731()) {
            return true;
        } else if (!method1725()) {
            return false;
        } else if (method1723(field3516)) {
            return true;
        } else {
            method1735();
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()Z", line = 47)
    public static final boolean method1725() {
        return field3510 != -1 && field3516.method75();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z", line = 51)
    public static final boolean method1726(int arg0, int arg1, int arg2, int arg3) {
        if (field3510 == -1 || field3514.method105(25459)) {
            field3518 = false;
            return false;
        }
        field3512 = arg0;
        field3511 = arg1;
        boolean var4 = false;
        if (field3515 != arg2 || field3513 != arg3) {
            field3515 = arg2;
            field3513 = arg3;
            for (class117 var5 = field3514.method93((byte) -97); var5 != field3514.field272; var5 = var5.field1659) {
                ((class146) var5).method79(field3515, field3513);
            }
            field3520 = true;
            field3526 = true;
        }
        GL var6 = class141.field2025;
        if (field3526) {
            if (field3524 != -1 && field3522 != field3521) {
                if (field3521) {
                    class254.method1862(field3524);
                } else {
                    class63.method519(field3524);
                }
                field3524 = -1;
            }
            if (field3524 == -1) {
                field3521 = field3522;
                if (field3521) {
                    field3524 = class254.method1867();
                } else {
                    field3524 = class63.method515();
                }
                field3517 = true;
            }
            if (field3521) {
                var6.glBindTexture(34037, field3524);
                class254.method1865(class254.field3788, class254.field3797, field3515, field3513, class254.field3797, class254.field3801, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field3524);
                var6.glRenderbufferStorageEXT(36161, 6402, field3515, field3513);
            }
            field3526 = false;
            var4 = true;
        }
        if (field3520) {
            var6.glBindTexture(34037, field3523[0]);
            class254.method1866(field3519, field3515, field3513);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field3525 > 1) {
                var6.glBindTexture(34037, field3523[1]);
                class254.method1866(field3519, field3515, field3513);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field3523[1]);
                class254.method1866(field3519, 0, 0);
            }
            field3520 = false;
            var4 = true;
        }
        class63.method510(field3510);
        if (field3517) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field3523[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field3525 > 1 ? field3523[1] : 0, 0);
            if (field3521) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field3524, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field3524);
            }
            var6.glDrawBuffer(36064);
            field3517 = false;
            var4 = true;
        }
        if (var4) {
            if (class63.method512()) {
                field3518 = true;
            } else {
                class63.method516();
                field3520 = true;
                field3526 = true;
                field3517 = true;
                field3518 = false;
            }
        }
        class141.method1015(-field3512, field3513 + field3511 - class141.field2044);
        return field3518;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()V", line = 175)
    public static final void method1727() {
        if (!field3518) {
            return;
        }
        GL var0 = class141.field2025;
        class141.method1001();
        class205.method1489();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class141.method1020();
        int var1 = 0;
        int var2 = 1;
        class146 var4;
        for (class146 var3 = (class146) field3514.method93((byte) -63); var3 != null; var3 = var4) {
            var4 = (class146) field3514.method97(-58);
            int var5 = var3.method1038((byte) 122);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method78(var6, field3515, field3513, field3523[var1], field3524);
                if (var4 == null && var5 - 1 == var6) {
                    field3511 = class141.field2044 - field3511;
                    class141.method1015(0, 0);
                    var0.glDrawBuffer(36064);
                    class63.method516();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field3512, field3511 - field3513);
                    var0.glTexCoord2f((float) field3515, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3515 + field3512, field3511 - field3513);
                    var0.glTexCoord2f((float) field3515, (float) field3513);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3515 + field3512, field3511);
                    var0.glTexCoord2f(0.0F, (float) field3513);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field3512, field3511);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field3515, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3515, 0);
                    var0.glTexCoord2f((float) field3515, (float) field3513);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3515, field3513);
                    var0.glTexCoord2f(0.0F, (float) field3513);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field3513);
                    var0.glEnd();
                }
                var3.method76(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class141.method1023();
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()V", line = 261)
    private static final void method1728() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class146 var4 = (class146) field3514.method93((byte) -49); var4 != null; var4 = (class146) field3514.method97(-120)) {
            int var5 = var4.method77();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1040(-1);
            var3 |= var4.method1039(100);
            var1 += var4.method1038((byte) 121);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class254.field3795 : class254.field3794;
        } else if (var0 == 1) {
            var6 = var2 ? class254.field3793 : class254.field3792;
        } else {
            var6 = var2 ? class254.field3790 : class254.field3789;
        }
        if (field3519 != var6) {
            field3519 = var6;
            field3520 = true;
        }
        int var7 = field3525 > 2 ? 2 : field3525;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field3520 = true;
            field3517 = true;
        }
        if (field3521 != var3) {
            field3522 = var3;
            field3526 = true;
        }
        field3525 = var1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lna;Z)V", line = 316)
    private static final void method1729(class146 arg0, boolean arg1) {
        if (arg1) {
            arg0.method74();
        }
        arg0.field2110 = false;
        arg0.method876(8);
        method1728();
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "()V", line = 324)
    public static final void method1730() {
        if (!class141.field2013 || !class141.field2049) {
            return;
        }
        GL var0 = class141.field2025;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field3523, 0);
            field3510 = class63.method509();
        }
        for (class117 var2 = field3514.method93((byte) -75); var2 != null; var2 = field3514.method97(-82)) {
            class146 var3 = (class146) var2;
            if (!var3.method73()) {
                var3.method876(8);
            }
        }
        if (field3516 == null) {
            field3516 = new class13();
        }
        if (!field3516.method75() && !field3516.method73()) {
            field3516.method74();
        }
        method1728();
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "()Z", line = 365)
    public static final boolean method1731() {
        return field3510 != -1 && field3516.method1041(-32197);
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "()V", line = 372)
    public static final void method1732() {
        if (field3510 != -1) {
            class63.method518(field3510);
            field3510 = -1;
            class141.field2025.glDeleteTextures(2, field3523, 0);
            field3523[0] = -1;
            field3523[1] = -1;
        }
        if (field3524 != -1) {
            if (field3521) {
                class254.method1862(field3524);
            } else {
                class63.method519(field3524);
            }
            field3524 = -1;
        }
        if (!field3514.method105(25459)) {
            for (class117 var0 = field3514.method93((byte) -88); var0 != field3514.field272; var0 = var0.field1659) {
                ((class146) var0).method74();
            }
        }
        if (field3516 != null && field3516.method75()) {
            field3516.method74();
        }
        field3520 = true;
        field3526 = true;
        field3517 = true;
        field3513 = -1;
        field3515 = -1;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "()Z", line = 415)
    public static final boolean method1733() {
        return field3510 != -1;
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "()V", line = 425)
    public static void method1734() {
        field3514 = null;
        field3523 = null;
        field3516 = null;
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "()V", line = 442)
    public static final void method1735() {
        if (field3516.method1041(-32197)) {
            method1729(field3516, false);
        }
    }
}

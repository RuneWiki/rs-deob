import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class277 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    private static int field4267 = -1;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    private static int field4265 = 0;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    private static int field4266 = -1;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    private static int field4269 = -1;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    private static int field4270 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lql;")
    private static class87 field4268 = new class87();

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Z")
    private static boolean field4273 = false;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
    private static boolean field4271 = true;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[I")
    private static int[] field4275 = new int[2];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Z")
    private static boolean field4277 = true;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Z")
    private static boolean field4274 = false;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private static int field4276 = 0;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    private static int field4279 = -1;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Z")
    private static boolean field4272 = false;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Z")
    private static boolean field4278 = true;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    private static int field4280 = -1;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Lta;")
    private static class287 field4281;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()Z", line = 4)
    public static final boolean method1895() {
        return field4266 != -1 && field4281.method1840(112);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Z", line = 10)
    public static final boolean method1896(int arg0, int arg1, int arg2, int arg3) {
        if (field4266 == -1 || field4268.method637(-94)) {
            field4274 = false;
            return false;
        }
        field4265 = arg0;
        field4270 = arg1;
        boolean var4 = false;
        if (field4269 != arg2 || field4267 != arg3) {
            field4269 = arg2;
            field4267 = arg3;
            for (class46 var5 = field4268.method636(-1); var5 != field4268.field1402; var5 = var5.field754) {
                ((class267) var5).method1838(field4269, field4267);
            }
            field4271 = true;
            field4277 = true;
        }
        GL var6 = class94.field1473;
        if (field4277) {
            if (field4279 != -1 && field4273 != field4272) {
                if (field4273) {
                    class114.method843(field4279);
                } else {
                    class151.method1047(field4279);
                }
                field4279 = -1;
            }
            if (field4279 == -1) {
                field4273 = field4272;
                if (field4273) {
                    field4279 = class114.method846();
                } else {
                    field4279 = class151.method1049();
                }
                field4278 = true;
            }
            if (field4273) {
                var6.glBindTexture(34037, field4279);
                class114.method850(class114.field1750, class114.field1759, field4269, field4267, class114.field1759, class114.field1763, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field4279);
                var6.glRenderbufferStorageEXT(36161, 6402, field4269, field4267);
            }
            field4277 = false;
            var4 = true;
        }
        if (field4271) {
            var6.glBindTexture(34037, field4275[0]);
            class114.method847(field4280, field4269, field4267);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field4276 > 1) {
                var6.glBindTexture(34037, field4275[1]);
                class114.method847(field4280, field4269, field4267);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field4275[1]);
                class114.method847(field4280, 0, 0);
            }
            field4271 = false;
            var4 = true;
        }
        class151.method1039(field4266);
        if (field4278) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field4275[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field4276 > 1 ? field4275[1] : 0, 0);
            if (field4273) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field4279, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field4279);
            }
            var6.glDrawBuffer(36064);
            field4278 = false;
            var4 = true;
        }
        if (var4) {
            if (class151.method1045()) {
                field4274 = true;
            } else {
                class151.method1042();
                field4271 = true;
                field4277 = true;
                field4278 = true;
                field4274 = false;
            }
        }
        class94.method701(-field4265, field4270 + field4267 - class94.field1513);
        return field4274;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljd;)Z", line = 134)
    private static final boolean method1897(class267 arg0) {
        if (field4266 != -1) {
            if (arg0.method1842() || arg0.method1843()) {
                if (field4269 != -1 && field4267 != -1) {
                    arg0.method1838(field4269, field4267);
                }
                arg0.field4164 = true;
                field4268.method632(-50, arg0);
                method1903();
                return true;
            }
            arg0.method1834();
        }
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljd;Z)V", line = 160)
    private static final void method1898(class267 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1834();
        }
        arg0.field4164 = false;
        arg0.method403(1);
        method1903();
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 168)
    public static final void method1899() {
        if (field4266 != -1) {
            class151.method1041(field4266);
            field4266 = -1;
            class94.field1473.glDeleteTextures(2, field4275, 0);
            field4275[0] = -1;
            field4275[1] = -1;
        }
        if (field4279 != -1) {
            if (field4273) {
                class114.method843(field4279);
            } else {
                class151.method1047(field4279);
            }
            field4279 = -1;
        }
        if (!field4268.method637(-108)) {
            for (class46 var0 = field4268.method636(-1); var0 != field4268.field1402; var0 = var0.field754) {
                ((class267) var0).method1834();
            }
        }
        if (field4281 != null && field4281.method1842()) {
            field4281.method1834();
        }
        field4271 = true;
        field4277 = true;
        field4278 = true;
        field4267 = -1;
        field4269 = -1;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()V", line = 209)
    public static final void method1900() {
        if (!field4274) {
            return;
        }
        GL var0 = class94.field1473;
        class94.method681();
        class167.method1191();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class94.method674();
        int var1 = 0;
        int var2 = 1;
        class267 var4;
        for (class267 var3 = (class267) field4268.method636(-1); var3 != null; var3 = var4) {
            var4 = (class267) field4268.method638(125);
            int var5 = var3.method1837(0);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method1836(var6, field4269, field4267, field4275[var1], field4279);
                if (var4 == null && var5 - 1 == var6) {
                    field4270 = class94.field1513 - field4270;
                    class94.method701(0, 0);
                    var0.glDrawBuffer(36064);
                    class151.method1042();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field4265, field4270 - field4267);
                    var0.glTexCoord2f((float) field4269, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field4269 + field4265, field4270 - field4267);
                    var0.glTexCoord2f((float) field4269, (float) field4267);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field4269 + field4265, field4270);
                    var0.glTexCoord2f(0.0F, (float) field4267);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field4265, field4270);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field4269, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field4269, 0);
                    var0.glTexCoord2f((float) field4269, (float) field4267);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field4269, field4267);
                    var0.glTexCoord2f(0.0F, (float) field4267);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field4267);
                    var0.glEnd();
                }
                var3.method1832(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class94.method683();
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()V", line = 293)
    public static final void method1901() {
        if (field4281.method1840(80)) {
            method1898(field4281, false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V", line = 300)
    public static final void method1902() {
        if (!class94.field1511 || !class94.field1518) {
            return;
        }
        GL var0 = class94.field1473;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field4275, 0);
            field4266 = class151.method1044();
        }
        for (class46 var2 = field4268.method636(-1); var2 != null; var2 = field4268.method638(76)) {
            class267 var3 = (class267) var2;
            if (!var3.method1843()) {
                var3.method403(1);
            }
        }
        if (field4281 == null) {
            field4281 = new class287();
        }
        if (!field4281.method1842() && !field4281.method1843()) {
            field4281.method1834();
        }
        method1903();
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "()V", line = 351)
    private static final void method1903() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class267 var4 = (class267) field4268.method636(-1); var4 != null; var4 = (class267) field4268.method638(109)) {
            int var5 = var4.method1839();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1841(1000);
            var3 |= var4.method1835((byte) -55);
            var1 += var4.method1837(0);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class114.field1757 : class114.field1756;
        } else if (var0 == 1) {
            var6 = var2 ? class114.field1755 : class114.field1754;
        } else {
            var6 = var2 ? class114.field1752 : class114.field1751;
        }
        if (field4280 != var6) {
            field4280 = var6;
            field4271 = true;
        }
        int var7 = field4276 > 2 ? 2 : field4276;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field4271 = true;
            field4278 = true;
        }
        if (field4273 != var3) {
            field4272 = var3;
            field4277 = true;
        }
        field4276 = var1;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "()V", line = 407)
    public static void method1904() {
        field4268 = null;
        field4275 = null;
        field4281 = null;
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "()Z", line = 423)
    public static final boolean method1905() {
        return field4266 != -1;
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "()Z", line = 426)
    public static final boolean method1906() {
        if (method1895()) {
            return true;
        } else if (!method1907()) {
            return false;
        } else if (method1897(field4281)) {
            return true;
        } else {
            method1901();
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "()Z", line = 441)
    public static final boolean method1907() {
        return field4266 != -1 && field4281.method1842();
    }
}

import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class309 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private static int field5026 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private static int field5025 = -1;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private static int field5024 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private static int field5027 = -1;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    private static int field5028 = -1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Ljo;")
    private static class150 field5023 = new class150();

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    private static int field5030 = -1;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    private static int field5033 = -1;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
    private static boolean field5031 = true;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
    private static int[] field5035 = new int[2];

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
    private static boolean field5034 = false;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
    private static boolean field5036 = true;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    private static int field5029 = 0;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
    private static boolean field5038 = false;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
    private static boolean field5032 = false;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
    private static boolean field5039 = true;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Lfc;")
    private static class114 field5037;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V", line = 10)
    private static final void method2152() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class185 var4 = (class185) field5023.method1081(95); var4 != null; var4 = (class185) field5023.method1083((byte) 113)) {
            int var5 = var4.method744();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1283(0);
            var3 |= var4.method1281((byte) -97);
            var1 += var4.method1282((byte) 115);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class200.field3076 : class200.field3075;
        } else if (var0 == 1) {
            var6 = var2 ? class200.field3074 : class200.field3073;
        } else {
            var6 = var2 ? class200.field3071 : class200.field3070;
        }
        if (field5030 != var6) {
            field5030 = var6;
            field5039 = true;
        }
        int var7 = field5029 > 2 ? 2 : field5029;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field5039 = true;
            field5031 = true;
        }
        if (field5034 != var3) {
            field5032 = var3;
            field5036 = true;
        }
        field5029 = var1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lje;)Z", line = 66)
    private static final boolean method2153(class185 arg0) {
        if (field5025 != -1) {
            if (arg0.method745() || arg0.method750()) {
                if (field5027 != -1 && field5028 != -1) {
                    arg0.method747(field5027, field5028);
                }
                arg0.field2873 = true;
                field5023.method1077(16711935, arg0);
                method2152();
                return true;
            }
            arg0.method748();
        }
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lje;Z)V", line = 91)
    private static final void method2154(class185 arg0, boolean arg1) {
        if (arg1) {
            arg0.method748();
        }
        arg0.field2873 = false;
        arg0.method1131(8);
        method2152();
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V", line = 99)
    public static void method2155() {
        field5023 = null;
        field5035 = null;
        field5037 = null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()Z", line = 105)
    public static final boolean method2156() {
        if (method2158()) {
            return true;
        } else if (!method2159()) {
            return false;
        } else if (method2153(field5037)) {
            return true;
        } else {
            method2164();
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()V", line = 120)
    public static final void method2157() {
        if (field5025 != -1) {
            class93.method618(field5025);
            field5025 = -1;
            class245.field3884.glDeleteTextures(2, field5035, 0);
            field5035[0] = -1;
            field5035[1] = -1;
        }
        if (field5033 != -1) {
            if (field5034) {
                class200.method1371(field5033);
            } else {
                class93.method615(field5033);
            }
            field5033 = -1;
        }
        if (!field5023.method1084(false)) {
            for (class159 var0 = field5023.method1081(106); var0 != field5023.field2418; var0 = var0.field2551) {
                ((class185) var0).method748();
            }
        }
        if (field5037 != null && field5037.method745()) {
            field5037.method748();
        }
        field5039 = true;
        field5036 = true;
        field5031 = true;
        field5028 = -1;
        field5027 = -1;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "()Z", line = 162)
    public static final boolean method2158() {
        return field5025 != -1 && field5037.method1277(-17255);
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "()Z", line = 168)
    public static final boolean method2159() {
        return field5025 != -1 && field5037.method745();
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "()V", line = 175)
    public static final void method2160() {
        if (!field5038) {
            return;
        }
        GL var0 = class245.field3884;
        class245.method1725();
        class335.method2379();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class245.method1713();
        int var1 = 0;
        int var2 = 1;
        class185 var4;
        for (class185 var3 = (class185) field5023.method1081(101); var3 != null; var3 = var4) {
            var4 = (class185) field5023.method1083((byte) 113);
            int var5 = var3.method1282((byte) 117);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method749(var6, field5027, field5028, field5035[var1], field5033);
                if (var4 == null && var5 - 1 == var6) {
                    field5024 = class245.field3862 - field5024;
                    class245.method1720(0, 0);
                    var0.glDrawBuffer(36064);
                    class93.method617();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field5026, field5024 - field5028);
                    var0.glTexCoord2f((float) field5027, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field5027 + field5026, field5024 - field5028);
                    var0.glTexCoord2f((float) field5027, (float) field5028);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field5027 + field5026, field5024);
                    var0.glTexCoord2f(0.0F, (float) field5028);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field5026, field5024);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field5027, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field5027, 0);
                    var0.glTexCoord2f((float) field5027, (float) field5028);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field5027, field5028);
                    var0.glTexCoord2f(0.0F, (float) field5028);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field5028);
                    var0.glEnd();
                }
                var3.method746(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class245.method1724();
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "()Z", line = 259)
    public static final boolean method2161() {
        return field5025 != -1;
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "()V", line = 262)
    public static final void method2162() {
        if (!class245.field3889 || !class245.field3854) {
            return;
        }
        GL var0 = class245.field3884;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field5035, 0);
            field5025 = class93.method620();
        }
        for (class159 var2 = field5023.method1081(6); var2 != null; var2 = field5023.method1083((byte) 113)) {
            class185 var3 = (class185) var2;
            if (!var3.method750()) {
                var3.method1131(8);
            }
        }
        if (field5037 == null) {
            field5037 = new class114();
        }
        if (!field5037.method745() && !field5037.method750()) {
            field5037.method748();
        }
        method2152();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)Z", line = 306)
    public static final boolean method2163(int arg0, int arg1, int arg2, int arg3) {
        if (field5025 == -1 || field5023.method1084(false)) {
            field5038 = false;
            return false;
        }
        field5026 = arg0;
        field5024 = arg1;
        boolean var4 = false;
        if (field5027 != arg2 || field5028 != arg3) {
            field5027 = arg2;
            field5028 = arg3;
            for (class159 var5 = field5023.method1081(99); var5 != field5023.field2418; var5 = var5.field2551) {
                ((class185) var5).method747(field5027, field5028);
            }
            field5039 = true;
            field5036 = true;
        }
        GL var6 = class245.field3884;
        if (field5036) {
            if (field5033 != -1 && field5034 != field5032) {
                if (field5034) {
                    class200.method1371(field5033);
                } else {
                    class93.method615(field5033);
                }
                field5033 = -1;
            }
            if (field5033 == -1) {
                field5034 = field5032;
                if (field5034) {
                    field5033 = class200.method1364();
                } else {
                    field5033 = class93.method613();
                }
                field5031 = true;
            }
            if (field5034) {
                var6.glBindTexture(34037, field5033);
                class200.method1367(class200.field3069, class200.field3078, field5027, field5028, class200.field3078, class200.field3082, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field5033);
                var6.glRenderbufferStorageEXT(36161, 6402, field5027, field5028);
            }
            field5036 = false;
            var4 = true;
        }
        if (field5039) {
            var6.glBindTexture(34037, field5035[0]);
            class200.method1370(field5030, field5027, field5028);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field5029 > 1) {
                var6.glBindTexture(34037, field5035[1]);
                class200.method1370(field5030, field5027, field5028);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field5035[1]);
                class200.method1370(field5030, 0, 0);
            }
            field5039 = false;
            var4 = true;
        }
        class93.method622(field5025);
        if (field5031) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field5035[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field5029 > 1 ? field5035[1] : 0, 0);
            if (field5034) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field5033, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field5033);
            }
            var6.glDrawBuffer(36064);
            field5031 = false;
            var4 = true;
        }
        if (var4) {
            if (class93.method616()) {
                field5038 = true;
            } else {
                class93.method617();
                field5039 = true;
                field5036 = true;
                field5031 = true;
                field5038 = false;
            }
        }
        class245.method1720(-field5026, field5028 + field5024 - class245.field3862);
        return field5038;
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "()V", line = 467)
    public static final void method2164() {
        if (field5037.method1277(-17255)) {
            method2154(field5037, false);
        }
    }
}

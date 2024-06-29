import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class195 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    private static int field3133 = -1;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    private static int field3135 = 0;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    private static int field3137 = 0;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    private static int field3134 = -1;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    private static int field3136 = -1;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lth;")
    private static class55 field3138 = new class55();

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    private static int field3141 = -1;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "[I")
    private static int[] field3143 = new int[2];

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    private static int field3139 = -1;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    private static int field3144 = 0;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Z")
    private static boolean field3142 = true;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "Z")
    private static boolean field3145 = true;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Z")
    private static boolean field3147 = false;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "Z")
    private static boolean field3148 = true;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "Z")
    private static boolean field3146 = false;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "Z")
    private static boolean field3149 = false;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Lge;")
    private static class10 field3140;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lmd;Z)V", line = 5)
    private static final void method1243(class123 arg0, boolean arg1) {
        if (arg1) {
            arg0.method88();
        }
        arg0.field2126 = false;
        arg0.method278((byte) -105);
        method1254();
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)Z", line = 13)
    public static final boolean method1244(int arg0, int arg1, int arg2, int arg3) {
        if (field3134 == -1 || field3138.method422((byte) -113)) {
            field3146 = false;
            return false;
        }
        field3135 = arg0;
        field3137 = arg1;
        boolean var4 = false;
        if (field3136 != arg2 || field3133 != arg3) {
            field3136 = arg2;
            field3133 = arg3;
            for (class35 var5 = field3138.method424(-79); var5 != field3138.field1102; var5 = var5.field701) {
                ((class123) var5).method91(field3136, field3133);
            }
            field3148 = true;
            field3145 = true;
        }
        GL var6 = class249.field3898;
        if (field3145) {
            if (field3141 != -1 && field3149 != field3147) {
                if (field3149) {
                    class105.method685(field3141);
                } else {
                    class273.method1834(field3141);
                }
                field3141 = -1;
            }
            if (field3141 == -1) {
                field3149 = field3147;
                if (field3149) {
                    field3141 = class105.method686();
                } else {
                    field3141 = class273.method1827();
                }
                field3142 = true;
            }
            if (field3149) {
                var6.glBindTexture(34037, field3141);
                class105.method687(class105.field1807, class105.field1816, field3136, field3133, class105.field1816, class105.field1820, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field3141);
                var6.glRenderbufferStorageEXT(36161, 6402, field3136, field3133);
            }
            field3145 = false;
            var4 = true;
        }
        if (field3148) {
            var6.glBindTexture(34037, field3143[0]);
            class105.method683(field3139, field3136, field3133);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field3144 > 1) {
                var6.glBindTexture(34037, field3143[1]);
                class105.method683(field3139, field3136, field3133);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field3143[1]);
                class105.method683(field3139, 0, 0);
            }
            field3148 = false;
            var4 = true;
        }
        class273.method1835(field3134);
        if (field3142) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field3143[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field3144 > 1 ? field3143[1] : 0, 0);
            if (field3149) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field3141, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field3141);
            }
            var6.glDrawBuffer(36064);
            field3142 = false;
            var4 = true;
        }
        if (var4) {
            if (class273.method1830()) {
                field3146 = true;
            } else {
                class273.method1828();
                field3148 = true;
                field3145 = true;
                field3142 = true;
                field3146 = false;
            }
        }
        class249.method1669(-field3135, field3137 + field3133 - class249.field3888);
        return field3146;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 137)
    public static final void method1245() {
        if (field3140.method798(30890)) {
            method1243(field3140, false);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()Z", line = 142)
    public static final boolean method1246() {
        return field3134 != -1 && field3140.method89();
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "()V", line = 145)
    public static final void method1247() {
        if (!field3146) {
            return;
        }
        GL var0 = class249.field3898;
        class249.method1679();
        class115.method753();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class249.method1650();
        int var1 = 0;
        int var2 = 1;
        class123 var4;
        for (class123 var3 = (class123) field3138.method424(-126); var3 != null; var3 = var4) {
            var4 = (class123) field3138.method425(-32547);
            int var5 = var3.method800(-128);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method92(var6, field3136, field3133, field3143[var1], field3141);
                if (var4 == null && var5 - 1 == var6) {
                    field3137 = class249.field3888 - field3137;
                    class249.method1669(0, 0);
                    var0.glDrawBuffer(36064);
                    class273.method1828();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field3135, field3137 - field3133);
                    var0.glTexCoord2f((float) field3136, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3136 + field3135, field3137 - field3133);
                    var0.glTexCoord2f((float) field3136, (float) field3133);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3136 + field3135, field3137);
                    var0.glTexCoord2f(0.0F, (float) field3133);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field3135, field3137);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field3136, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field3136, 0);
                    var0.glTexCoord2f((float) field3136, (float) field3133);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field3136, field3133);
                    var0.glTexCoord2f(0.0F, (float) field3133);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field3133);
                    var0.glEnd();
                }
                var3.method87(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class249.method1659();
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lmd;)Z", line = 231)
    private static final boolean method1248(class123 arg0) {
        if (field3134 != -1) {
            if (arg0.method89() || arg0.method86()) {
                if (field3136 != -1 && field3133 != -1) {
                    arg0.method91(field3136, field3133);
                }
                arg0.field2126 = true;
                field3138.method427((byte) -111, arg0);
                method1254();
                return true;
            }
            arg0.method88();
        }
        return false;
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "()Z", line = 256)
    public static final boolean method1249() {
        return field3134 != -1 && field3140.method798(30890);
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "()Z", line = 259)
    public static final boolean method1250() {
        return field3134 != -1;
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "()V", line = 263)
    public static void method1251() {
        field3138 = null;
        field3143 = null;
        field3140 = null;
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "()Z", line = 273)
    public static final boolean method1252() {
        if (method1249()) {
            return true;
        } else if (!method1246()) {
            return false;
        } else if (method1248(field3140)) {
            return true;
        } else {
            method1245();
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "()V", line = 293)
    public static final void method1253() {
        if (field3134 != -1) {
            class273.method1833(field3134);
            field3134 = -1;
            class249.field3898.glDeleteTextures(2, field3143, 0);
            field3143[0] = -1;
            field3143[1] = -1;
        }
        if (field3141 != -1) {
            if (field3149) {
                class105.method685(field3141);
            } else {
                class273.method1834(field3141);
            }
            field3141 = -1;
        }
        if (!field3138.method422((byte) -113)) {
            for (class35 var0 = field3138.method424(-66); var0 != field3138.field1102; var0 = var0.field701) {
                ((class123) var0).method88();
            }
        }
        if (field3140 != null && field3140.method89()) {
            field3140.method88();
        }
        field3148 = true;
        field3145 = true;
        field3142 = true;
        field3133 = -1;
        field3136 = -1;
    }

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "()V", line = 336)
    private static final void method1254() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class123 var4 = (class123) field3138.method424(-72); var4 != null; var4 = (class123) field3138.method425(-32547)) {
            int var5 = var4.method90();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method797(-1);
            var3 |= var4.method801(16);
            var1 += var4.method800(-126);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class105.field1814 : class105.field1813;
        } else if (var0 == 1) {
            var6 = var2 ? class105.field1812 : class105.field1811;
        } else {
            var6 = var2 ? class105.field1809 : class105.field1808;
        }
        if (field3139 != var6) {
            field3139 = var6;
            field3148 = true;
        }
        int var7 = field3144 > 2 ? 2 : field3144;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field3148 = true;
            field3142 = true;
        }
        if (field3149 != var3) {
            field3147 = var3;
            field3145 = true;
        }
        field3144 = var1;
    }

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "()V", line = 392)
    public static final void method1255() {
        if (!class249.field3913 || !class249.field3915) {
            return;
        }
        GL var0 = class249.field3898;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field3143, 0);
            field3134 = class273.method1832();
        }
        for (class35 var2 = field3138.method424(-117); var2 != null; var2 = field3138.method425(-32547)) {
            class123 var3 = (class123) var2;
            if (!var3.method86()) {
                var3.method278((byte) -105);
            }
        }
        if (field3140 == null) {
            field3140 = new class10();
        }
        if (!field3140.method89() && !field3140.method86()) {
            field3140.method88();
        }
        method1254();
    }
}

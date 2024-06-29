import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class68 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    private static int field1180 = 0;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    private static int field1183 = -1;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    private static int field1184 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    private static int field1181 = -1;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    private static int field1185 = -1;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lci;")
    private static class327 field1182 = new class327();

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Z")
    private static boolean field1186 = true;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    private static int field1188 = -1;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
    private static int[] field1189 = new int[2];

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    private static int field1191 = 0;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
    private static boolean field1187 = true;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
    private static boolean field1193 = false;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    private static int field1190 = -1;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Z")
    private static boolean field1194 = false;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Z")
    private static boolean field1196 = false;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "Z")
    private static boolean field1195 = true;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Luj;")
    private static class276 field1192;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V", line = 4)
    public static final void method574() {
        if (!field1194) {
            return;
        }
        GL var0 = class42.field627;
        class42.method307();
        class244.method1863();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class42.method279();
        int var1 = 0;
        int var2 = 1;
        class183 var4;
        for (class183 var3 = (class183) field1182.method2300((byte) 110); var3 != null; var3 = var4) {
            var4 = (class183) field1182.method2306(-23);
            int var5 = var3.method1441(5935);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method1437(var6, field1185, field1181, field1189[var1], field1188);
                if (var4 == null && var5 - 1 == var6) {
                    field1184 = class42.field622 - field1184;
                    class42.method305(0, 0);
                    var0.glDrawBuffer(36064);
                    class212.method1596();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field1180, field1184 - field1181);
                    var0.glTexCoord2f((float) field1185, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field1185 + field1180, field1184 - field1181);
                    var0.glTexCoord2f((float) field1185, (float) field1181);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field1185 + field1180, field1184);
                    var0.glTexCoord2f(0.0F, (float) field1181);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field1180, field1184);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field1185, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field1185, 0);
                    var0.glTexCoord2f((float) field1185, (float) field1181);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field1185, field1181);
                    var0.glTexCoord2f(0.0F, (float) field1181);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field1181);
                    var0.glEnd();
                }
                var3.method1449(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class42.method282();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)Z", line = 89)
    public static final boolean method575(int arg0, int arg1, int arg2, int arg3) {
        if (field1183 == -1 || field1182.method2308(125)) {
            field1194 = false;
            return false;
        }
        field1180 = arg0;
        field1184 = arg1;
        boolean var4 = false;
        if (field1185 != arg2 || field1181 != arg3) {
            field1185 = arg2;
            field1181 = arg3;
            for (class45 var5 = field1182.method2300((byte) 119); var5 != field1182.field5199; var5 = var5.field708) {
                ((class183) var5).method1439(field1185, field1181);
            }
            field1187 = true;
            field1186 = true;
        }
        GL var6 = class42.field627;
        if (field1186) {
            if (field1188 != -1 && field1196 != field1193) {
                if (field1193) {
                    class119.method937(field1188);
                } else {
                    class212.method1601(field1188);
                }
                field1188 = -1;
            }
            if (field1188 == -1) {
                field1193 = field1196;
                if (field1193) {
                    field1188 = class119.method939();
                } else {
                    field1188 = class212.method1603();
                }
                field1195 = true;
            }
            if (field1193) {
                var6.glBindTexture(34037, field1188);
                class119.method941(class119.field2004, class119.field2013, field1185, field1181, class119.field2013, class119.field2017, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field1188);
                var6.glRenderbufferStorageEXT(36161, 6402, field1185, field1181);
            }
            field1186 = false;
            var4 = true;
        }
        if (field1187) {
            var6.glBindTexture(34037, field1189[0]);
            class119.method933(field1190, field1185, field1181);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field1191 > 1) {
                var6.glBindTexture(34037, field1189[1]);
                class119.method933(field1190, field1185, field1181);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field1189[1]);
                class119.method933(field1190, 0, 0);
            }
            field1187 = false;
            var4 = true;
        }
        class212.method1604(field1183);
        if (field1195) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field1189[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field1191 > 1 ? field1189[1] : 0, 0);
            if (field1193) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field1188, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field1188);
            }
            var6.glDrawBuffer(36064);
            field1195 = false;
            var4 = true;
        }
        if (var4) {
            if (class212.method1600()) {
                field1194 = true;
            } else {
                class212.method1596();
                field1187 = true;
                field1186 = true;
                field1195 = true;
                field1194 = false;
            }
        }
        class42.method305(-field1180, field1184 + field1181 - class42.field622);
        return field1194;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lom;)Z", line = 217)
    private static final boolean method576(class183 arg0) {
        if (field1183 != -1) {
            if (arg0.method1447() || arg0.method1448()) {
                if (field1185 != -1 && field1181 != -1) {
                    arg0.method1439(field1185, field1181);
                }
                arg0.field2959 = true;
                field1182.method2302((byte) -32, arg0);
                method581();
                return true;
            }
            arg0.method1446();
        }
        return false;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lom;Z)V", line = 242)
    private static final void method577(class183 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1446();
        }
        arg0.field2959 = false;
        arg0.method330(15);
        method581();
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()Z", line = 251)
    public static final boolean method578() {
        return field1183 != -1 && field1192.method1438(23023);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()Z", line = 255)
    public static final boolean method579() {
        return field1183 != -1 && field1192.method1447();
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "()V", line = 259)
    public static void method580() {
        field1182 = null;
        field1189 = null;
        field1192 = null;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "()V", line = 267)
    private static final void method581() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class183 var4 = (class183) field1182.method2300((byte) 116); var4 != null; var4 = (class183) field1182.method2306(-23)) {
            int var5 = var4.method1445();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1442(-1);
            var3 |= var4.method1440(1);
            var1 += var4.method1441(5935);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class119.field2011 : class119.field2010;
        } else if (var0 == 1) {
            var6 = var2 ? class119.field2009 : class119.field2008;
        } else {
            var6 = var2 ? class119.field2006 : class119.field2005;
        }
        if (field1190 != var6) {
            field1190 = var6;
            field1187 = true;
        }
        int var7 = field1191 > 2 ? 2 : field1191;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field1187 = true;
            field1195 = true;
        }
        if (field1193 != var3) {
            field1196 = var3;
            field1186 = true;
        }
        field1191 = var1;
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "()Z", line = 322)
    public static final boolean method582() {
        return field1183 != -1;
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "()V", line = 326)
    public static final void method583() {
        if (field1183 != -1) {
            class212.method1594(field1183);
            field1183 = -1;
            class42.field627.glDeleteTextures(2, field1189, 0);
            field1189[0] = -1;
            field1189[1] = -1;
        }
        if (field1188 != -1) {
            if (field1193) {
                class119.method937(field1188);
            } else {
                class212.method1601(field1188);
            }
            field1188 = -1;
        }
        if (!field1182.method2308(59)) {
            for (class45 var0 = field1182.method2300((byte) 110); var0 != field1182.field5199; var0 = var0.field708) {
                ((class183) var0).method1446();
            }
        }
        if (field1192 != null && field1192.method1447()) {
            field1192.method1446();
        }
        field1187 = true;
        field1186 = true;
        field1195 = true;
        field1181 = -1;
        field1185 = -1;
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "()V", line = 371)
    public static final void method584() {
        if (field1192.method1438(23023)) {
            method577(field1192, false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "()V", line = 378)
    public static final void method585() {
        if (!class42.field606 || !class42.field619) {
            return;
        }
        GL var0 = class42.field627;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field1189, 0);
            field1183 = class212.method1599();
        }
        for (class45 var2 = field1182.method2300((byte) 111); var2 != null; var2 = field1182.method2306(-23)) {
            class183 var3 = (class183) var2;
            if (!var3.method1448()) {
                var3.method330(15);
            }
        }
        if (field1192 == null) {
            field1192 = new class276();
        }
        if (!field1192.method1447() && !field1192.method1448()) {
            field1192.method1446();
        }
        method581();
    }

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "()Z", line = 422)
    public static final boolean method586() {
        if (method578()) {
            return true;
        } else if (!method579()) {
            return false;
        } else if (method576(field1192)) {
            return true;
        } else {
            method584();
            return false;
        }
    }
}

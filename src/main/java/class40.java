import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class40 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    private static int field450 = 0;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    private static int field451 = -1;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    private static int field449 = -1;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    private static int field453 = -1;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    private static int field454 = 0;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lhi;")
    private static class192 field452 = new class192();

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
    private static int[] field455 = new int[2];

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Z")
    private static boolean field458 = false;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
    private static boolean field456 = true;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    private static int field459 = 0;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Z")
    private static boolean field457 = true;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Z")
    private static boolean field461 = true;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    private static int field463 = -1;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Z")
    private static boolean field462 = false;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    private static int field464 = -1;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "Z")
    private static boolean field465 = false;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Lqg;")
    private static class303 field460;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(La;)Z", line = 7)
    private static final boolean method239(class252 arg0) {
        if (field453 != -1) {
            if (arg0.method1711() || arg0.method1722()) {
                if (field451 != -1 && field449 != -1) {
                    arg0.method1721(field451, field449);
                }
                arg0.field3609 = true;
                field452.method1339((byte) 64, arg0);
                method244();
                return true;
            }
            arg0.method1725();
        }
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()Z", line = 36)
    public static final boolean method240() {
        return field453 != -1 && field460.method1712(-1);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(La;Z)V", line = 39)
    private static final void method241(class252 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1725();
        }
        arg0.field3609 = false;
        arg0.method1274((byte) -26);
        method244();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()V", line = 48)
    public static final void method242() {
        if (!class67.field903 || !class67.field923) {
            return;
        }
        GL var0 = class67.field899;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field455, 0);
            field453 = class105.method779();
        }
        for (class183 var2 = field452.method1335(1); var2 != null; var2 = field452.method1336(3)) {
            class252 var3 = (class252) var2;
            if (!var3.method1722()) {
                var3.method1274((byte) -26);
            }
        }
        if (field460 == null) {
            field460 = new class303();
        }
        if (!field460.method1711() && !field460.method1722()) {
            field460.method1725();
        }
        method244();
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()Z", line = 89)
    public static final boolean method243() {
        if (method240()) {
            return true;
        } else if (!method246()) {
            return false;
        } else if (method239(field460)) {
            return true;
        } else {
            method247();
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()V", line = 105)
    private static final void method244() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class252 var4 = (class252) field452.method1335(1); var4 != null; var4 = (class252) field452.method1336(3)) {
            int var5 = var4.method1718();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method1723((byte) -103);
            var3 |= var4.method1719(0);
            var1 += var4.method1717(-75);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class46.field565 : class46.field564;
        } else if (var0 == 1) {
            var6 = var2 ? class46.field563 : class46.field562;
        } else {
            var6 = var2 ? class46.field560 : class46.field559;
        }
        if (field464 != var6) {
            field464 = var6;
            field457 = true;
        }
        int var7 = field459 > 2 ? 2 : field459;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field457 = true;
            field461 = true;
        }
        if (field458 != var3) {
            field462 = var3;
            field456 = true;
        }
        field459 = var1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Z", line = 163)
    public static final boolean method245(int arg0, int arg1, int arg2, int arg3) {
        if (field453 == -1 || field452.method1349(-126)) {
            field465 = false;
            return false;
        }
        field454 = arg0;
        field450 = arg1;
        boolean var4 = false;
        if (field451 != arg2 || field449 != arg3) {
            field451 = arg2;
            field449 = arg3;
            for (class183 var5 = field452.method1335(1); var5 != field452.field2636; var5 = var5.field2523) {
                ((class252) var5).method1721(field451, field449);
            }
            field457 = true;
            field456 = true;
        }
        GL var6 = class67.field899;
        if (field456) {
            if (field463 != -1 && field462 != field458) {
                if (field458) {
                    class46.method292(field463);
                } else {
                    class105.method771(field463);
                }
                field463 = -1;
            }
            if (field463 == -1) {
                field458 = field462;
                if (field458) {
                    field463 = class46.method295();
                } else {
                    field463 = class105.method780();
                }
                field461 = true;
            }
            if (field458) {
                var6.glBindTexture(34037, field463);
                class46.method293(class46.field558, class46.field567, field451, field449, class46.field567, class46.field571, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field463);
                var6.glRenderbufferStorageEXT(36161, 6402, field451, field449);
            }
            field456 = false;
            var4 = true;
        }
        if (field457) {
            var6.glBindTexture(34037, field455[0]);
            class46.method298(field464, field451, field449);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field459 > 1) {
                var6.glBindTexture(34037, field455[1]);
                class46.method298(field464, field451, field449);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field455[1]);
                class46.method298(field464, 0, 0);
            }
            field457 = false;
            var4 = true;
        }
        class105.method772(field453);
        if (field461) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field455[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field459 > 1 ? field455[1] : 0, 0);
            if (field458) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field463, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field463);
            }
            var6.glDrawBuffer(36064);
            field461 = false;
            var4 = true;
        }
        if (var4) {
            if (class105.method775()) {
                field465 = true;
            } else {
                class105.method770();
                field457 = true;
                field456 = true;
                field461 = true;
                field465 = false;
            }
        }
        class67.method494(-field454, field450 + field449 - class67.field897);
        return field465;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "()Z", line = 287)
    public static final boolean method246() {
        return field453 != -1 && field460.method1711();
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "()V", line = 292)
    public static final void method247() {
        if (field460.method1712(-1)) {
            method241(field460, false);
        }
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "()V", line = 298)
    public static final void method248() {
        if (!field465) {
            return;
        }
        GL var0 = class67.field899;
        class67.method455();
        class102.method748();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class67.method475();
        int var1 = 0;
        int var2 = 1;
        class252 var4;
        for (class252 var3 = (class252) field452.method1335(1); var3 != null; var3 = var4) {
            var4 = (class252) field452.method1336(3);
            int var5 = var3.method1717(-101);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method1714(var6, field451, field449, field455[var1], field463);
                if (var4 == null && var5 - 1 == var6) {
                    field450 = class67.field897 - field450;
                    class67.method494(0, 0);
                    var0.glDrawBuffer(36064);
                    class105.method770();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field454, field450 - field449);
                    var0.glTexCoord2f((float) field451, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field454 + field451, field450 - field449);
                    var0.glTexCoord2f((float) field451, (float) field449);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field454 + field451, field450);
                    var0.glTexCoord2f(0.0F, (float) field449);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field454, field450);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field451, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field451, 0);
                    var0.glTexCoord2f((float) field451, (float) field449);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field451, field449);
                    var0.glTexCoord2f(0.0F, (float) field449);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field449);
                    var0.glEnd();
                }
                var3.method1710(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class67.method482();
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "()Z", line = 386)
    public static final boolean method249() {
        return field453 != -1;
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "()V", line = 390)
    public static void method250() {
        field452 = null;
        field455 = null;
        field460 = null;
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "()V", line = 431)
    public static final void method251() {
        if (field453 != -1) {
            class105.method776(field453);
            field453 = -1;
            class67.field899.glDeleteTextures(2, field455, 0);
            field455[0] = -1;
            field455[1] = -1;
        }
        if (field463 != -1) {
            if (field458) {
                class46.method292(field463);
            } else {
                class105.method771(field463);
            }
            field463 = -1;
        }
        if (!field452.method1349(38)) {
            for (class183 var0 = field452.method1335(1); var0 != field452.field2636; var0 = var0.field2523) {
                ((class252) var0).method1725();
            }
        }
        if (field460 != null && field460.method1711()) {
            field460.method1725();
        }
        field457 = true;
        field456 = true;
        field461 = true;
        field449 = -1;
        field451 = -1;
    }
}

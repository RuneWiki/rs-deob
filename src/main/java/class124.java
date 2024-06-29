import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class124 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    private static int field1711 = -1;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private static int field1715 = 0;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    private static int field1714 = -1;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    private static int field1713 = -1;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    private static int field1716 = 0;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lan;")
    private static class337 field1712 = new class337();

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
    private static int[] field1717 = new int[2];

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Z")
    private static boolean field1720 = false;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private static int field1718 = -1;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Z")
    private static boolean field1725 = false;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Z")
    private static boolean field1726 = true;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
    private static boolean field1719 = true;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    private static int field1723 = 0;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Z")
    private static boolean field1721 = false;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    private static int field1724 = -1;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Z")
    private static boolean field1727 = true;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Le;")
    private static class169 field1722;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()Z", line = 4)
    public static final boolean method828() {
        return field1711 != -1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lul;)Z", line = 9)
    private static final boolean method829(class49 arg0) {
        if (field1711 != -1) {
            if (arg0.method293() || arg0.method300()) {
                if (field1713 != -1 && field1714 != -1) {
                    arg0.method292(field1713, field1714);
                }
                arg0.field602 = true;
                field1712.method2325(arg0, (byte) 34);
                method839();
                return true;
            }
            arg0.method286();
        }
        return false;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V", line = 38)
    public static void method830() {
        field1712 = null;
        field1717 = null;
        field1722 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "()V", line = 47)
    public static final void method831() {
        if (!class250.field3794 || !class250.field3816) {
            return;
        }
        GL var0 = class250.field3818;
        int[] var1 = new int[1];
        var0.glGetIntegerv(36063, var1, 0);
        if (var1[0] >= 2) {
            var0.glGenTextures(2, field1717, 0);
            field1711 = class297.method2102();
        }
        for (class332 var2 = field1712.method2331((byte) 39); var2 != null; var2 = field1712.method2332(-86)) {
            class49 var3 = (class49) var2;
            if (!var3.method300()) {
                var3.method2285(true);
            }
        }
        if (field1722 == null) {
            field1722 = new class169();
        }
        if (!field1722.method293() && !field1722.method300()) {
            field1722.method286();
        }
        method839();
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "()Z", line = 88)
    public static final boolean method832() {
        return field1711 != -1 && field1722.method293();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)Z", line = 92)
    public static final boolean method833(int arg0, int arg1, int arg2, int arg3) {
        if (field1711 == -1 || field1712.method2326((byte) -10)) {
            field1725 = false;
            return false;
        }
        field1716 = arg0;
        field1715 = arg1;
        boolean var4 = false;
        if (field1713 != arg2 || field1714 != arg3) {
            field1713 = arg2;
            field1714 = arg3;
            for (class332 var5 = field1712.method2331((byte) 7); var5 != field1712.field5201; var5 = var5.field5073) {
                ((class49) var5).method292(field1713, field1714);
            }
            field1719 = true;
            field1727 = true;
        }
        GL var6 = class250.field3818;
        if (field1727) {
            if (field1718 != -1 && field1721 != field1720) {
                if (field1720) {
                    class209.method1442(field1718);
                } else {
                    class297.method2104(field1718);
                }
                field1718 = -1;
            }
            if (field1718 == -1) {
                field1720 = field1721;
                if (field1720) {
                    field1718 = class209.method1437();
                } else {
                    field1718 = class297.method2097();
                }
                field1726 = true;
            }
            if (field1720) {
                var6.glBindTexture(34037, field1718);
                class209.method1439(class209.field2959, class209.field2968, field1713, field1714, class209.field2968, class209.field2972, (byte[]) null);
            } else {
                var6.glBindRenderbufferEXT(36161, field1718);
                var6.glRenderbufferStorageEXT(36161, 6402, field1713, field1714);
            }
            field1727 = false;
            var4 = true;
        }
        if (field1719) {
            var6.glBindTexture(34037, field1717[0]);
            class209.method1438(field1724, field1713, field1714);
            var6.glTexParameteri(3553, 10241, 9729);
            var6.glTexParameteri(3553, 10240, 9729);
            if (field1723 > 1) {
                var6.glBindTexture(34037, field1717[1]);
                class209.method1438(field1724, field1713, field1714);
                var6.glTexParameteri(3553, 10241, 9729);
                var6.glTexParameteri(3553, 10240, 9729);
            } else {
                var6.glBindTexture(34037, field1717[1]);
                class209.method1438(field1724, 0, 0);
            }
            field1719 = false;
            var4 = true;
        }
        class297.method2101(field1711);
        if (field1726) {
            var6.glFramebufferTexture2DEXT(36160, 36064, 34037, field1717[0], 0);
            var6.glFramebufferTexture2DEXT(36160, 36065, 34037, field1723 > 1 ? field1717[1] : 0, 0);
            if (field1720) {
                var6.glFramebufferTexture2DEXT(36160, 36096, 34037, field1718, 0);
            } else {
                var6.glFramebufferRenderbufferEXT(36160, 36096, 36161, field1718);
            }
            var6.glDrawBuffer(36064);
            field1726 = false;
            var4 = true;
        }
        if (var4) {
            if (class297.method2099()) {
                field1725 = true;
            } else {
                class297.method2100();
                field1719 = true;
                field1727 = true;
                field1726 = true;
                field1725 = false;
            }
        }
        class250.method1804(-field1716, field1715 + field1714 - class250.field3820);
        return field1725;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "()Z", line = 216)
    public static final boolean method834() {
        if (method840()) {
            return true;
        } else if (!method832()) {
            return false;
        } else if (method829(field1722)) {
            return true;
        } else {
            method837();
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "()V", line = 231)
    public static final void method835() {
        if (!field1725) {
            return;
        }
        GL var0 = class250.field3818;
        class250.method1825();
        class306.method2143();
        var0.glDisable(3042);
        var0.glDisable(3008);
        class250.method1827();
        int var1 = 0;
        int var2 = 1;
        class49 var4;
        for (class49 var3 = (class49) field1712.method2331((byte) 123); var3 != null; var3 = var4) {
            var4 = (class49) field1712.method2332(-120);
            int var5 = var3.method288((byte) 124);
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method294(var6, field1713, field1714, field1717[var1], field1718);
                if (var4 == null && var5 - 1 == var6) {
                    field1715 = class250.field3820 - field1715;
                    class250.method1804(0, 0);
                    var0.glDrawBuffer(36064);
                    class297.method2100();
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(field1716, field1715 - field1714);
                    var0.glTexCoord2f((float) field1713, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field1716 + field1713, field1715 - field1714);
                    var0.glTexCoord2f((float) field1713, (float) field1714);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field1716 + field1713, field1715);
                    var0.glTexCoord2f(0.0F, (float) field1714);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(field1716, field1715);
                    var0.glEnd();
                } else {
                    var0.glDrawBuffer(var2 + 36064);
                    var0.glBegin(7);
                    var0.glTexCoord2f(0.0F, 0.0F);
                    var0.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var0.glVertex2i(0, 0);
                    var0.glTexCoord2f((float) field1713, 0.0F);
                    var0.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var0.glVertex2i(field1713, 0);
                    var0.glTexCoord2f((float) field1713, (float) field1714);
                    var0.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var0.glVertex2i(field1713, field1714);
                    var0.glTexCoord2f(0.0F, (float) field1714);
                    var0.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var0.glVertex2i(0, field1714);
                    var0.glEnd();
                }
                var3.method290(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        var0.glEnable(3008);
        var0.glEnable(3042);
        class250.method1791();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lul;Z)V", line = 317)
    private static final void method836(class49 arg0, boolean arg1) {
        if (arg1) {
            arg0.method286();
        }
        arg0.field602 = false;
        arg0.method2285(true);
        method839();
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "()V", line = 325)
    public static final void method837() {
        if (field1722.method296(true)) {
            method836(field1722, false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "()V", line = 331)
    public static final void method838() {
        if (field1711 != -1) {
            class297.method2098(field1711);
            field1711 = -1;
            class250.field3818.glDeleteTextures(2, field1717, 0);
            field1717[0] = -1;
            field1717[1] = -1;
        }
        if (field1718 != -1) {
            if (field1720) {
                class209.method1442(field1718);
            } else {
                class297.method2104(field1718);
            }
            field1718 = -1;
        }
        if (!field1712.method2326((byte) -10)) {
            for (class332 var0 = field1712.method2331((byte) 11); var0 != field1712.field5201; var0 = var0.field5073) {
                ((class49) var0).method286();
            }
        }
        if (field1722 != null && field1722.method293()) {
            field1722.method286();
        }
        field1719 = true;
        field1727 = true;
        field1726 = true;
        field1714 = -1;
        field1713 = -1;
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "()V", line = 380)
    private static final void method839() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = true;
        boolean var3 = false;
        for (class49 var4 = (class49) field1712.method2331((byte) 17); var4 != null; var4 = (class49) field1712.method2332(-70)) {
            int var5 = var4.method289();
            if (var5 > var0) {
                var0 = var5;
            }
            var2 |= var4.method299(1);
            var3 |= var4.method297(-109);
            var1 += var4.method288((byte) 95);
        }
        int var6;
        if (var0 == 2) {
            var6 = var2 ? class209.field2966 : class209.field2965;
        } else if (var0 == 1) {
            var6 = var2 ? class209.field2964 : class209.field2963;
        } else {
            var6 = var2 ? class209.field2961 : class209.field2960;
        }
        if (field1724 != var6) {
            field1724 = var6;
            field1719 = true;
        }
        int var7 = field1723 > 2 ? 2 : field1723;
        int var8 = var1 > 2 ? 2 : var1;
        if (var7 != var8) {
            field1719 = true;
            field1726 = true;
        }
        if (field1720 != var3) {
            field1721 = var3;
            field1727 = true;
        }
        field1723 = var1;
    }

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "()Z", line = 438)
    public static final boolean method840() {
        return field1711 != -1 && field1722.method296(true);
    }
}

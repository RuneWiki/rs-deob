import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class113 extends class263 {

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "Z")
    private boolean field1918 = false;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "Lkq;")
    private class403 field1916;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1909 = -1;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lrp;")
    public static class288 field1921;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIBIIIIIIIIII)V")
    public static final void method808(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field1913;
        if (class99.field1801 != null) {
            class135 var15;
            if (~arg13 <= -1) {
                int var14 = arg13 + -1;
                var15 = class195.field3085[var14];
            } else {
                int var16 = -arg13 - 1;
                if (~class507.field7667 != ~var16) {
                    var15 = class224.field3450[var16];
                } else {
                    var15 = class286.field4329;
                }
            }
            if (var15 != null) {
                class56 var17 = class128.field2070.method916((byte) -15, arg11);
                int var18;
                int var19;
                if (~arg8 != -2 && arg8 != 3) {
                    var18 = var17.field967;
                    var19 = var17.field915;
                } else {
                    var19 = var17.field967;
                    var18 = var17.field915;
                }
                int var20 = arg7 - -(var19 >> 1);
                int var21 = (var19 + 1 >> 1) + arg7;
                int var22 = (var18 >> 1) + arg9;
                int var23 = (var18 - -1 >> 1) + arg9;
                class343 var24 = class99.field1801[arg6];
                int var25 = var24.method318(var20, var22) + var24.method318(var21, var22) - (-var24.method318(var20, var23) + -var24.method318(var21, var23)) >> 2;
                class142 var26 = new class142();
                var26.field2300 = arg9;
                var26.field2297 = var15.field3217;
                var26.field2303 = arg1;
                var26.field2294 = arg8;
                var26.field2302 = class369.field5424 + arg10;
                var26.field2291 = arg11;
                if (arg5 > arg4) {
                    int var27 = arg5;
                    arg5 = arg4;
                    arg4 = var27;
                }
                var26.field2301 = class369.field5424 - -arg2;
                var26.field2295 = arg7;
                var26.field2307 = arg5 + arg7;
                var26.field2298 = arg4 + arg7;
                if (~arg12 < ~arg0) {
                    int var28 = arg12;
                    arg12 = arg0;
                    arg0 = var28;
                }
                var26.field2308 = (var26.field2295 << 7) + (var19 << 6);
                var26.field2304 = (var26.field2300 << 7) + (var18 << 6);
                if (arg3 != 79) {
                    field1921 = null;
                }
                var26.field2293 = arg0 + arg9;
                var26.field2299 = arg9 + arg12;
                var26.field2296 = var25;
                class86.field1443.method4(1, var26);
                var15.field2236 = var26;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Lod;")
    public static final class334 method809(int arg0) {
        ++field1919;
        if (arg0 != 5722) {
            return null;
        } else if (class492.field7477 != null && class292.field4451 != null) {
            for (class334 var1 = (class334) class292.field4451.method1525((byte) 45); var1 != null; var1 = (class334) class292.field4451.method1525((byte) 45)) {
                class173 var2 = class492.field7472.method1840((byte) 99, var1.field4985);
                if (var2 != null && var2.field2678 && var2.method1082(class492.field7466, 18358)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lce;IZ)V")
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        ++field1920;
        super.field3984.method2586(arg0, false);
        if (!arg2) {
            method810((byte) 16);
        }
        super.field3984.method2610(0, arg1);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method670(byte arg0) {
        if (arg0 == -94) {
            ++field1914;
            if (!this.field1918) {
                super.field3984.method2575((byte) -81, 5890, 770, 0);
            } else {
                this.field1916.method2392((byte) 0, '\u0001');
                super.field3984.method2582((byte) 124, 1);
                super.field3984.method2586((class194) null, false);
                super.field3984.method2582((byte) 118, 0);
            }
            super.field3984.method2624((byte) 107, 8448, 8448);
            this.field1918 = false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
    public final void method673(int arg0, int arg1, int arg2) {
        ++field1911;
        if (arg2 != 6908) {
            field1921 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V")
    public final void method666(int arg0, boolean arg1) {
        ++field1915;
        super.field3984.method2624((byte) 107, 7681, 8448);
        if (arg0 != -2560) {
            this.field1916 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lbl;)V")
    public class113(class442 arg0) {
        super(arg0);
        if (arg0.field6819) {
            this.field1916 = new class403(arg0, 2);
            this.field1916.method2390(0, -32245);
            super.field3984.method2582((byte) 18, 1);
            super.field3984.method2624((byte) 107, 7681, 34165);
            super.field3984.method2597(34168, (byte) -38, 770, 2);
            super.field3984.method2575((byte) -80, 34167, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3984.method2582((byte) 124, 0);
            this.field1916.method2391(-106);
            this.field1916.method2390(1, -32245);
            super.field3984.method2582((byte) 117, 1);
            super.field3984.method2624((byte) 107, 8448, 8448);
            super.field3984.method2597(34166, (byte) 81, 770, 2);
            super.field3984.method2575((byte) -75, 5890, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3984.method2582((byte) 127, 0);
            this.field1916.method2391(-68);
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public static void method810(byte arg0) {
        if (arg0 == 25) {
            field1921 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
    public final boolean method675(int arg0) {
        ++field1917;
        return arg0 <= -112;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FIFF)I")
    public static final int method811(float arg0, int arg1, float arg2, float arg3) {
        ++field1912;
        float var4 = !(arg3 < 0.0F) ? arg3 : -arg3;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        if (arg1 != -10296) {
            field1909 = 28;
        }
        float var6 = !(arg2 < 0.0F) ? arg2 : -arg2;
        if (var4 < var5 && var6 < var5) {
            return !(arg0 > 0.0F) ? 1 : 0;
        } else if (var4 < var6 && var5 < var6) {
            return arg2 > 0.0F ? 2 : 3;
        } else {
            return arg3 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZB)V")
    public final void method669(boolean arg0, byte arg1) {
        int var3 = 92 % ((24 - arg1) / 34);
        ++field1910;
        class304 var4 = super.field3984.method2606(0);
        if (this.field1916 != null && var4 != null && arg0) {
            this.field1916.method2392((byte) 0, '\u0000');
            super.field3984.method2582((byte) 121, 1);
            super.field3984.method2586(var4, false);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3984.field6820.method191(false), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field3984.method2582((byte) 122, 0);
            this.field1918 = true;
        } else {
            super.field3984.method2575((byte) -66, 34168, 770, 0);
        }
    }

    static {
        new class423("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field1921 = new class288(64);
    }
}

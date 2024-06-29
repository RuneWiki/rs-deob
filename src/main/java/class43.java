import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class43 extends class345 {

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "Llha;")
    private class626 field637;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "Lafa;")
    private class348 field634;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lvh;")
    private class363 field631;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lug;")
    public static class563 field636;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILcj;)V", line = 3)
    public final void method36(int arg0, int arg1, class695 arg2) {
        if (arg0 != 50560) {
            this.method36(10, -76, (class695) null);
        }
        ++field639;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V", line = 17)
    private final void method305(int arg0) {
        ++field642;
        this.field631 = new class363(super.field4357, 2);
        this.field631.method2097(0, -80);
        super.field4357.method2847(1, false);
        super.field4357.method2799(-27874, 7681, 260);
        super.field4357.method2775(34168, (byte) -88, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        if (arg0 <= 82) {
            method308(-12);
        }
        OpenGL.glEnable(3168);
        super.field4357.method2847(0, false);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field637.field8605) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field631.method2100(-102);
        this.field631.method2097(1, -67);
        super.field4357.method2847(1, false);
        super.field4357.method2799(-27874, 8448, 8448);
        super.field4357.method2775(5890, (byte) -88, 768, 0);
        OpenGL.glDisable(3168);
        super.field4357.method2847(0, false);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field637.field8605) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field631.method2100(114);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V", line = 63)
    public static final void method306(int arg0, int arg1) {
        class14 var2 = class197.field2689[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class14 var4 = class197.field2689[var3][arg0][arg1] = class197.field2689[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class621 var5 = var4.field289; var5 != null; var5 = var5.field8560) {
                    class556 var6 = var5.field8559;
                    if (var6.field7734 == arg0 && var6.field7746 == arg1) {
                        --var6.field5796;
                    }
                }
                if (var4.field279 != null) {
                    --var4.field279.field5796;
                }
                if (var4.field278 != null) {
                    --var4.field278.field5796;
                }
                if (var4.field283 != null) {
                    --var4.field283.field5796;
                }
                if (var4.field277 != null) {
                    --var4.field277.field5796;
                }
                if (var4.field290 != null) {
                    --var4.field290.field5796;
                }
            }
        }
        if (class197.field2689[0][arg0][arg1] == null) {
            class197.field2689[0][arg0][arg1] = new class14(0);
            class197.field2689[0][arg0][arg1].field288 = 1;
        }
        class197.field2689[0][arg0][arg1].field282 = var2;
        class197.field2689[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V", line = 118)
    public static void method307(int arg0) {
        field636 = null;
        if (arg0 > -45) {
            method308(-109);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZII)V", line = 131)
    public final void method37(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field636 = null;
        }
        ++field630;
        if ((arg2 & 1) != 1) {
            if (this.field637.field8605) {
                super.field4357.method2850(-97, this.field637.field8608);
                class475.field6396[0] = 0.0F;
                class475.field6396[1] = 0.0F;
                class475.field6396[2] = 0.0F;
                class475.field6396[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class475.field6396, 0);
            } else {
                super.field4357.method2850(-24, this.field637.field8607[0]);
            }
        } else if (this.field637.field8605) {
            super.field4357.method2850(82, this.field637.field8608);
            class475.field6396[0] = 0.0F;
            class475.field6396[1] = 0.0F;
            class475.field6396[2] = 0.0F;
            class475.field6396[3] = (float) (super.field4357.field6780 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, class475.field6396, 0);
        } else {
            int var4 = super.field4357.field6780 % 4000 * 16 / 4000;
            super.field4357.method2850(-44, this.field637.field8607[var4]);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z", line = 177)
    public final boolean method38(int arg0) {
        if (arg0 != 50560) {
            this.method38(103);
        }
        ++field635;
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V", line = 188)
    public final void method40(boolean arg0, int arg1) {
        if (arg1 == 50560) {
            ++field640;
            super.field4357.method2799(-27874, 260, 8448);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V", line = 199)
    public final void method34(boolean arg0, byte arg1) {
        ++field633;
        if (super.field4357.field6814 > 0) {
            float var3 = -0.5F / (float) super.field4357.field6814;
            super.field4357.method2847(1, false);
            class475.field6396[2] = var3;
            class475.field6396[1] = 0.0F;
            class475.field6396[3] = super.field4357.field6838 * var3 + 0.25F;
            class475.field6396[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class475.field6396, 0);
            OpenGL.glPopMatrix();
            super.field4357.method2790(false, 0.5F, (float) super.field4357.field6814);
            super.field4357.method2850(-29, this.field634);
            super.field4357.method2847(0, false);
        }
        this.field631.method2099('\u0000', arg1 ^ 45);
        if (arg1 != -82) {
            this.field634 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V", line = 233)
    public static final void method308(int arg0) {
        ++field641;
        if (class649.method3638((byte) 25)) {
            if (class404.field5114 == null) {
                class130.method967(2);
            }
            class573.field8046 = 0;
            class151.field2086 = true;
        }
        if (arg0 < 25) {
            field636 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILka;III)Lwg;", line = 259)
    public static final class428 method309(int arg0, class474 arg1, int arg2, int arg3, int arg4) {
        ++field632;
        if (arg1 == null) {
            return null;
        } else {
            if (arg4 >= -7) {
                field636 = null;
            }
            return new class428(arg3, arg0, arg2, arg1.method288(), arg1.method263(), arg1.method285(), arg1.method286(), arg1.method280(), arg1.method269(), arg1.method242());
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 276)
    public final void method41(byte arg0) {
        this.field631.method2099('\u0001', -124);
        ++field638;
        if (~super.field4357.field6814 < -1) {
            super.field4357.method2847(1, false);
            super.field4357.method2850(71, (class695) null);
            super.field4357.method2790(false, 1.0F, 0.0F);
            super.field4357.method2847(0, false);
        }
        super.field4357.method2799(-27874, 8448, 8448);
        int var2 = -119 / ((arg0 - 60) / 60);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lbi;Llha;)V", line = 299)
    public class43(class483 arg0, class626 arg1) {
        super(arg0);
        this.field637 = arg1;
        this.method305(96);
        this.field634 = new class348(super.field4357, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field634.method2045(-15179, false);
    }
}

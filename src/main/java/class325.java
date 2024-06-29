import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class325 extends class140 {

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Lwq;")
    private class146 field4476;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "Loda;")
    private class100 field4483;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "Lhm;")
    public static class188 field4478 = new class188();

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "Lh;")
    public static class572 field4486 = new class572("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Lwl;")
    private class348 field4474;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method148(boolean arg0, byte arg1) {
        if (super.field1984.field7784 > 0) {
            float var3 = -0.5F / (float) super.field1984.field7784;
            super.field1984.method3111(33984, 1);
            class369.field5087[2] = var3;
            class369.field5087[0] = 0.0F;
            class369.field5087[1] = 0.0F;
            class369.field5087[3] = super.field1984.field7785 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class369.field5087, 0);
            OpenGL.glPopMatrix();
            super.field1984.method3171(0.5F, true, (float) super.field1984.field7784);
            super.field1984.method3152(-2, this.field4483);
            super.field1984.method3111(33984, 0);
        }
        ++field4485;
        this.field4474.method2110('\u0000', (byte) -128);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (arg1 == -86) {
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V", line = 42)
    public final void method145(int arg0, boolean arg1) {
        ++field4482;
        super.field1984.method3183(260, -127, 8448);
        if (arg0 != -7) {
            this.method146(127, -16, (class228) null);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 57)
    public static final void method1951(byte arg0) {
        ++field4480;
        if (arg0 != 18) {
            method1953(30, (byte) -12);
        }
        for (class332 var1 = (class332) class306.field4198.method124((byte) 42); var1 != null; var1 = (class332) class306.field4198.method120(73)) {
            if (var1.field4589 > 0) {
                --var1.field4589;
            }
            if (var1.field4589 == 0) {
                if (~var1.field4582 > -1 || class146.method999(var1.field4586, 11352, var1.field4582)) {
                    class604.method3560(var1.field4588, var1.field4582, var1.field4590, 41, var1.field4585, var1.field4586, var1.field4593, var1.field4584, -1);
                    var1.method2457(-8422);
                }
            } else {
                if (~var1.field4592 < -1) {
                    --var1.field4592;
                }
                if (~var1.field4592 == -1 && ~var1.field4593 <= -2 && ~var1.field4584 <= -2 && ~var1.field4593 >= ~(class146.field2125 + -2) && var1.field4584 <= class410.field5609 + -2 && (var1.field4583 < 0 || class146.method999(var1.field4581, 11352, var1.field4583))) {
                    class604.method3560(var1.field4588, var1.field4583, var1.field4590, 38, var1.field4595, var1.field4581, var1.field4593, var1.field4584, -1);
                    var1.field4592 = -1;
                    if (~var1.field4583 == ~var1.field4582 && var1.field4582 == -1) {
                        var1.method2457(-8422);
                    } else if (~var1.field4583 == ~var1.field4582 && ~var1.field4595 == ~var1.field4585 && var1.field4586 == var1.field4581) {
                        var1.method2457(-8422);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V", line = 115)
    private final void method1952(boolean arg0) {
        ++field4481;
        this.field4474 = new class348(super.field1984, 2);
        this.field4474.method2113(0, 25033);
        super.field1984.method3111(33984, 1);
        super.field1984.method3183(7681, -125, 260);
        super.field1984.method3157(34168, 0, true, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field1984.method3111(33984, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4476.field2123) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4474.method2114(0);
        if (arg0) {
            field4486 = null;
        }
        this.field4474.method2113(1, 25033);
        super.field1984.method3111(33984, 1);
        super.field1984.method3183(8448, -124, 8448);
        super.field1984.method3157(5890, 0, true, 768);
        OpenGL.glDisable(3168);
        super.field1984.method3111(33984, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4476.field2123) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4474.method2114(0);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)V", line = 161)
    public final void method144(int arg0, int arg1, int arg2) {
        ++field4484;
        if (~(arg2 & 1) == -2) {
            if (this.field4476.field2123) {
                super.field1984.method3152(-2, this.field4476.field2122);
                class369.field5087[2] = 0.0F;
                class369.field5087[1] = 0.0F;
                class369.field5087[0] = 0.0F;
                class369.field5087[3] = (float) (super.field1984.field7747 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, class369.field5087, 0);
            } else {
                int var4 = super.field1984.field7747 % 4000 * 16 / 4000;
                super.field1984.method3152(-2, this.field4476.field2115[var4]);
            }
        } else if (!this.field4476.field2123) {
            super.field1984.method3152(arg1 ^ 4741, this.field4476.field2115[0]);
        } else {
            super.field1984.method3152(-2, this.field4476.field2122);
            class369.field5087[1] = 0.0F;
            class369.field5087[0] = 0.0F;
            class369.field5087[3] = 0.0F;
            class369.field5087[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class369.field5087, 0);
        }
        if (arg1 != -4741) {
            this.method148(true, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Z", line = 208)
    public final boolean method149(int arg0) {
        ++field4472;
        if (arg0 > -36) {
            method1953(72, (byte) 114);
        }
        return true;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)Z", line = 219)
    public static final boolean method1953(int arg0, byte arg1) {
        ++field4475;
        if (class438.field5854[arg0]) {
            return true;
        } else if (!class169.field2636.method1976(arg0, true)) {
            return false;
        } else {
            int var2 = class169.field2636.method1975(57, arg0);
            if (~var2 == -1) {
                class438.field5854[arg0] = true;
                return true;
            } else {
                if (class302.field4135[arg0] == null) {
                    class302.field4135[arg0] = new class162[var2];
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class302.field4135[arg0][var3] == null) {
                        byte[] var5 = class169.field2636.method1966(var3, arg0, true);
                        if (var5 != null) {
                            class162 var6 = class302.field4135[arg0][var3] = new class162();
                            var6.field2456 = (arg0 << 16) - -var3;
                            if (~var5[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var6.method1165(false, new class148(var5));
                        }
                    }
                }
                int var4 = 27 / ((arg1 - 30) / 43);
                class438.field5854[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII)Z", line = 274)
    public static final boolean method1954(boolean arg0, int arg1, int arg2) {
        ++field4477;
        if (!arg0) {
            return true;
        } else {
            return ~(arg2 & 384) != -1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lte;Lwq;)V", line = 285)
    public class325(class527 arg0, class146 arg1) {
        super(arg0);
        this.field4476 = arg1;
        this.method1952(false);
        this.field4483 = new class100(super.field1984, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4483.method763(false, false);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V", line = 298)
    public static void method1955(byte arg0) {
        field4486 = null;
        if (arg0 != 98) {
            method1955((byte) -82);
        }
        field4478 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILjl;)V", line = 309)
    public final void method146(int arg0, int arg1, class228 arg2) {
        if (arg0 == -7) {
            ++field4473;
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V", line = 321)
    public final void method143(int arg0) {
        if (arg0 != -7) {
            this.method1952(true);
        }
        ++field4479;
        this.field4474.method2110('\u0001', (byte) -126);
        if (~super.field1984.field7784 < -1) {
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(-2, (class228) null);
            super.field1984.method3171(1.0F, true, 0.0F);
            super.field1984.method3111(33984, 0);
        }
        super.field1984.method3183(8448, -125, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }
}

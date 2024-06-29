import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class497 extends class605 {

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lsda;")
    private class232 field7041;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lbu;")
    private class19 field7039;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "[C")
    public static char[] field7043 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "Lhg;")
    private class642 field7047;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZI)V", line = 3)
    public final void method47(int arg0, boolean arg1, int arg2) {
        ++field7037;
        if (~(1 & arg0) != -2) {
            if (this.field7041.field3609) {
                super.field8542.method1505(-2, this.field7041.field3619);
                class522.field7376[3] = 0.0F;
                class522.field7376[2] = 0.0F;
                class522.field7376[0] = 0.0F;
                class522.field7376[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class522.field7376, 0);
            } else {
                super.field8542.method1505(-2, this.field7041.field3613[0]);
            }
        } else if (this.field7041.field3609) {
            super.field8542.method1505(-2, this.field7041.field3619);
            class522.field7376[2] = 0.0F;
            class522.field7376[3] = (float) (super.field8542.field3405 % 4000) / 4000.0F;
            class522.field7376[0] = 0.0F;
            class522.field7376[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class522.field7376, 0);
        } else {
            int var4 = super.field8542.field3405 % 4000 * 16 / 4000;
            super.field8542.method1505(-2, this.field7041.field3613[var4]);
        }
        if (arg1) {
            method2872((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lok;Lsda;)V", line = 48)
    public class497(class228 arg0, class232 arg1) {
        super(arg0);
        this.field7041 = arg1;
        this.method2873(1);
        this.field7039 = new class19(super.field8542, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field7039.method222(false, -122);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZB)V", line = 63)
    public final void method46(boolean arg0, byte arg1) {
        super.field8542.method1527(1, 260, 8448);
        if (arg1 <= -16) {
            ++field7048;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 74)
    public final void method45(int arg0) {
        if (arg0 != 0) {
            this.field7039 = null;
        }
        this.field7047.method3574(73, '\u0001');
        ++field7038;
        if (~super.field8542.field3442 < -1) {
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, (class657) null);
            super.field8542.method1560(1.0F, (byte) -99, 0.0F);
            super.field8542.method1500(33984, 0);
        }
        super.field8542.method1527(arg0 ^ 1, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)Z", line = 98)
    public final boolean method48(boolean arg0) {
        ++field7042;
        if (arg0) {
            this.method46(true, (byte) 22);
        }
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIB)V", line = 112)
    public static final void method2871(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg0 <= class239.field3747 && class520.field7329 <= arg4) {
            boolean var6;
            if (~class15.field153 < ~arg1) {
                var6 = false;
                arg1 = class15.field153;
            } else if (class248.field3859 < arg1) {
                var6 = false;
                arg1 = class248.field3859;
            } else {
                var6 = true;
            }
            boolean var7;
            if (~arg2 > ~class15.field153) {
                arg2 = class15.field153;
                var7 = false;
            } else if (class248.field3859 < arg2) {
                var7 = false;
                arg2 = class248.field3859;
            } else {
                var7 = true;
            }
            if (class520.field7329 > arg0) {
                arg0 = class520.field7329;
            } else {
                class58.method623(arg3, arg2, 23309, class651.field9125[arg0++], arg1);
            }
            if (class239.field3747 >= arg4) {
                class58.method623(arg3, arg2, 23309, class651.field9125[arg4--], arg1);
            } else {
                arg4 = class239.field3747;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg4; ++var8) {
                    int[] var9 = class651.field9125[var8];
                    var9[arg1] = var9[arg2] = arg3;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg0; arg4 >= var10; ++var10) {
                        class651.field9125[var10][arg2] = arg3;
                    }
                }
            } else {
                for (int var11 = arg0; var11 <= arg4; ++var11) {
                    class651.field9125[var11][arg1] = arg3;
                }
            }
        }
        ++field7044;
        if (arg5 <= 111) {
            field7043 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 217)
    public static void method2872(byte arg0) {
        field7043 = null;
        if (arg0 != 36) {
            method2871(-120, 89, -106, -54, -110, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 228)
    private final void method2873(int arg0) {
        ++field7040;
        this.field7047 = new class642(super.field8542, 2);
        this.field7047.method3579((byte) -67, 0);
        super.field8542.method1500(arg0 ^ 33985, 1);
        super.field8542.method1527(arg0, 7681, 260);
        super.field8542.method1503(0, 34168, (byte) 2, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field8542.method1500(arg0 ^ 33985, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7041.field3609) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7047.method3577((byte) -113);
        this.field7047.method3579((byte) -75, 1);
        super.field8542.method1500(33984, 1);
        super.field8542.method1527(1, 8448, 8448);
        super.field8542.method1503(0, 5890, (byte) 2, 768);
        OpenGL.glDisable(3168);
        super.field8542.method1500(33984, 0);
        OpenGL.glTexEnvf(8960, 34163, (float) arg0);
        if (this.field7041.field3609) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7047.method3577((byte) -81);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V", line = 270)
    public final void method51(boolean arg0, int arg1) {
        if (~super.field8542.field3442 < -1) {
            float var3 = -0.5F / (float) super.field8542.field3442;
            super.field8542.method1500(33984, 1);
            class522.field7376[1] = 0.0F;
            class522.field7376[3] = super.field8542.field3490 * var3 + 0.25F;
            class522.field7376[0] = 0.0F;
            class522.field7376[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class522.field7376, 0);
            OpenGL.glPopMatrix();
            super.field8542.method1560(0.5F, (byte) -99, (float) super.field8542.field3442);
            super.field8542.method1505(-2, this.field7039);
            super.field8542.method1500(33984, 0);
        }
        ++field7045;
        this.field7047.method3574(119, '\u0000');
        if (arg1 <= -127) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILip;I)V", line = 307)
    public final void method43(int arg0, class657 arg1, int arg2) {
        if (arg2 != 0) {
            this.field7039 = null;
        }
        ++field7046;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V", line = 323)
    public static final void method2874() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class513.field7248.length; ++var1) {
                if (!class513.field7248[var1].method3055()) {
                    synchronized (class513.field7248[var1]) {
                        class513.field7248[var1].notify();
                    }
                    var0 = false;
                } else {
                    class298.field4460[var1] = class513.field7248[var1].method3056();
                }
            }
            if (var0) {
                class513.field7248[class513.field7248.length - 1].method3054();
                class73.method697(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class513.field7248.length - 1; ++var4) {
                        if (!class513.field7248[var4].method3055()) {
                            synchronized (class513.field7248[var4]) {
                                class513.field7248[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class513.field7248.length - 2; ++var6) {
                            class513.field7248[var6].method3054();
                        }
                        class73.method697(2);
                        while (!class513.field7248[0].method3055()) {
                            synchronized (class513.field7248[0]) {
                                class513.field7248[0].notify();
                            }
                            try {
                                class561.method3202(1L, (byte) -73);
                            } catch (Exception var9) {
                            }
                        }
                        class513.field7248[0].method3054();
                        return;
                    }
                    try {
                        class561.method3202(1L, (byte) -123);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class561.method3202(1L, (byte) -122);
            } catch (Exception var8) {
            }
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class209 extends class457 {

    @OriginalMember(owner = "client!en", name = "y", descriptor = "Z")
    private boolean field2914 = false;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "Z")
    private boolean field2901;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "[Lvg;")
    private class39[] field2909;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Z")
    public static boolean field2912;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "Lqp;")
    public static class466 field2907;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "[[I")
    public static int[][] field2918;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "Lrm;")
    public static class282 field2904;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "Lih;")
    private class492 field2911;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public final void method433(byte arg0) {
        ++field2916;
        if (arg0 != 8) {
            field2904 = null;
        }
        if (this.field2914) {
            if (!this.field2901) {
                super.field6706.method1950(-29847, 2);
                super.field6706.method1996(2, (class40) null);
            }
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(2, (class40) null);
            super.field6706.method1950(-29847, 0);
            this.field2911.method2881(0, '\u0001');
            this.field2914 = false;
        } else {
            super.field6706.method1973(5890, 0, 0, 770);
        }
        super.field6706.method1963(true, 8448, 8448);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lmk;II)V")
    public final void method431(class40 arg0, int arg1, int arg2) {
        if (arg1 != 384) {
            this.field2911 = null;
        }
        super.field6706.method1996(2, arg0);
        ++field2908;
        super.field6706.method1974(arg2, 4609);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[J[I)V")
    public static final void method1291(int arg0, long[] arg1, int[] arg2) {
        class299.method1751(arg1, arg2, (byte) 125, arg0, arg1.length - 1);
        ++field2920;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z")
    public final boolean method429(int arg0) {
        ++field2919;
        if (arg0 != 0) {
            this.method434(-20, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ)V")
    public final void method430(int arg0, int arg1, boolean arg2) {
        ++field2905;
        if (this.field2914) {
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(2, this.field2909[arg1 + -1]);
            super.field6706.method1950(-29847, 0);
        }
        if (arg2) {
            this.field2901 = false;
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
    private final void method1292(int arg0) {
        ++field2913;
        this.field2911 = new class492(super.field6706, 2);
        this.field2911.method2884(4864, 0);
        super.field6706.method1950(-29847, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        if (arg0 > 64) {
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (this.field2901) {
                super.field6706.method1963(true, 260, 7681);
                super.field6706.method1975(34176, 5890, 770, 0);
                super.field6706.method1973(34167, 0, 0, 770);
            } else {
                super.field6706.method1963(true, 7681, 8448);
                super.field6706.method1975(34176, 34168, 768, 0);
                super.field6706.method1950(-29847, 2);
                super.field6706.method1963(true, 260, 7681);
                super.field6706.method1975(34176, 34168, 768, 0);
                super.field6706.method1975(34176, 34168, 770, 1);
                super.field6706.method1973(34167, 0, 0, 770);
            }
            super.field6706.method1950(-29847, 0);
            this.field2911.method2883(-30137);
            this.field2911.method2884(4864, 1);
            super.field6706.method1950(-29847, 1);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field2901) {
                super.field6706.method1963(true, 8448, 8448);
                super.field6706.method1975(34176, 5890, 768, 0);
                super.field6706.method1973(5890, 0, 0, 770);
            } else {
                super.field6706.method1963(true, 8448, 8448);
                super.field6706.method1975(34176, 5890, 768, 0);
                super.field6706.method1950(-29847, 2);
                super.field6706.method1963(true, 8448, 8448);
                super.field6706.method1975(34176, 5890, 768, 0);
                super.field6706.method1975(34176, 34168, 768, 1);
                super.field6706.method1973(5890, 0, 0, 770);
            }
            super.field6706.method1950(-29847, 0);
            this.field2911.method2883(-30137);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V")
    public final void method435(boolean arg0, byte arg1) {
        super.field6706.method1963(true, 8448, 7681);
        ++field2915;
        if (arg1 <= 32) {
            field2904 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lef;)V")
    public class209(class338 arg0) {
        super(arg0);
        if (arg0.field4854) {
            this.field2901 = ~arg0.field4839 > -4;
            int var2 = this.field2901 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 != 1) {
                                if (var14 != 2) {
                                    if (~var14 != -4) {
                                        if (var14 == 4) {
                                            var15 = var11;
                                        } else {
                                            var15 = -var11;
                                        }
                                    } else {
                                        var15 = -var13;
                                    }
                                } else {
                                    var15 = var13;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field2909 = new class39[3];
            this.field2909[0] = new class39(super.field6706, 6406, 64, false, var4, 6406);
            this.field2909[1] = new class39(super.field6706, 6406, 64, false, var5, 6406);
            this.field2909[2] = new class39(super.field6706, 6406, 64, false, var3, 6406);
            this.method1292(92);
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
    public static void method1293(int arg0) {
        field2907 = null;
        field2918 = null;
        int var1 = 99 % ((arg0 - -73) / 43);
        field2904 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)V")
    public final void method434(int arg0, boolean arg1) {
        if (arg0 != 28037) {
            this.field2909 = null;
        }
        ++field2906;
        if (this.field2911 != null && arg1) {
            if (!this.field2901) {
                super.field6706.method1950(arg0 ^ -6420, 2);
                super.field6706.method1996(arg0 ^ 28039, super.field6706.field4852);
                super.field6706.method1950(arg0 + -57884, 0);
            }
            this.field2911.method2881(0, '\u0000');
            this.field2914 = true;
        } else {
            super.field6706.method1973(34168, 0, 0, 770);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Lji;BLef;)Lbt;")
    public static final class33 method1294(class432[] arg0, byte arg1, class338 arg2) {
        ++field2910;
        if (arg1 != 3) {
            method1293(-88);
        }
        for (int var3 = 0; var3 < arg0.length; ++var3) {
            if (arg0[var3] == null || arg0[var3].field6347 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; arg0.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field6347);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class173.field2564, 0);
        if (~class173.field2564[0] == -1) {
            if (class173.field2564[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class173.field2564, 1);
            if (~class173.field2564[1] < -2) {
                byte[] var7 = new byte[class173.field2564[1]];
                OpenGL.glGetInfoLogARB(var4, class173.field2564[1], class173.field2564, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class173.field2564[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field6347);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class33(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(III)Z")
    public static final boolean method1295(int arg0, int arg1, int arg2) {
        if (arg2 != 64) {
            return false;
        } else {
            ++field2917;
            return ~(2048 & arg0) != -1 | class483.method2836(arg0, -101, arg1) || class266.method1598(arg2 + -185, arg0, arg1);
        }
    }

    static {
        new class466("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field2912 = true;
        field2907 = new class466("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
        field2918 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
    }
}

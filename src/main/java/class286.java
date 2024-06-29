import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class286 extends class492 {

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    private int field4080 = -1;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    private int field4078 = -1;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "[I")
    public static int[] field4084 = new int[16];

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field4086;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "Lpi;")
    public static class342 field4087;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "Lku;")
    public static class254 field4081;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "[I")
    public static int[] field4071;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lvj;IIII)V")
    public class286(class303 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4076 = arg3;
        this.field4074 = arg4;
        super.field7283.method1990(this, 11864);
        OpenGL.glTexImage2Dub(super.field7272, 0, super.field7280, arg3, arg4, 0, class430.method2574(super.field7280, (byte) 15), 5121, (byte[]) null, 0);
        this.method2929((byte) -41, true);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lvj;IIIIZ[FI)V")
    public class286(class303 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4076 = arg3;
        this.field4074 = arg4;
        super.field7283.method1990(this, 11864);
        if (arg5 && ~super.field7272 != -34038) {
            class455.method2712(arg3, 0, arg7, arg4, arg6, arg2, arg1);
            this.method2930(-103, true);
        } else {
            OpenGL.glTexImage2Df(super.field7272, 0, super.field7280, this.field4076, this.field4074, 0, arg7, 5126, arg6, 0);
            this.method2930(-86, false);
        }
        this.method2929((byte) -94, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZBZ)V")
    public final void method1818(boolean arg0, byte arg1, boolean arg2) {
        if (~super.field7272 == -3554) {
            super.field7283.method1990(this, 11864);
            OpenGL.glTexParameteri(super.field7272, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field7272, 10243, !arg2 ? 33071 : 10497);
        }
        if (arg1 <= 104) {
            method1819(76, 102, (byte) 99, 0, -7, 45);
        }
        ++field4079;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIII)V")
    public static final void method1819(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field4073;
        int var6 = -arg1 + arg4;
        int var7 = -arg5 + arg0;
        if (~var7 != -1) {
            if (var6 == 0) {
                class64.method544(0, arg0, arg3, arg1, arg5);
            } else {
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                boolean var8 = var6 > var7;
                if (var8) {
                    int var9 = arg5;
                    int var10 = arg0;
                    arg5 = arg1;
                    arg0 = arg4;
                    arg1 = var9;
                    arg4 = var10;
                }
                if (~arg0 > ~arg5) {
                    int var11 = arg5;
                    int var12 = arg1;
                    arg5 = arg0;
                    arg1 = arg4;
                    arg0 = var11;
                    arg4 = var12;
                }
                int var13 = arg1;
                int var14 = -arg5 + arg0;
                if (arg2 < 51) {
                    field4071 = null;
                }
                int var15 = arg4 - arg1;
                int var16 = -(var14 >> 1);
                if (~var15 > -1) {
                    var15 = -var15;
                }
                int var17 = arg1 < arg4 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg5; ~var18 >= ~arg0; ++var18) {
                        class21.field430[var18][var13] = arg3;
                        var16 += var15;
                        if (~var16 < -1) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg5; arg0 >= var19; ++var19) {
                        class21.field430[var13][var19] = arg3;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class1.method2(arg1, arg5, arg3, arg4, (byte) 114);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lvj;IIIIZ[IZ)V")
    public class286(class303 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4076 = arg3;
        this.field4074 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - var10 + -1) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field7283.method1990(this, 11864);
        if (arg5 && super.field7272 != 34037) {
            class99.method740(super.field7272, super.field7283.field4539, -21467, this.field4074, this.field4076, arg6, super.field7280, 32993);
            this.method2930(-108, true);
        } else {
            OpenGL.glTexImage2Di(super.field7272, 0, super.field7280, this.field4076, this.field4074, 0, 32993, super.field7283.field4539, arg6, 0);
            this.method2930(-104, false);
        }
        this.method2929((byte) -70, true);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)V")
    public static void method1820(byte arg0) {
        field4084 = null;
        field4071 = null;
        int var1 = -17 % ((arg0 - 60) / 46);
        field4081 = null;
        field4087 = null;
        field4086 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIIIII[BII)V")
    public final void method1821(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        if (~arg4 == -1) {
            arg4 = arg1;
        }
        ++field4072;
        if (arg0) {
            int var11 = class370.method2318((byte) -89, arg8);
            int var12 = arg1 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg3 * var12];
            for (int var15 = 0; arg3 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg3 + -1) * var13 + arg9;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg7[var17++];
                }
            }
            arg7 = var14;
        }
        super.field7283.method1990(this, 11864);
        OpenGL.glPixelStorei(3317, 1);
        int var19 = -76 / ((arg2 - -53) / 41);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field7272, 0, arg5, arg6, arg1, arg3, arg8, 5121, arg7, arg9);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([IIIIIIZII)V")
    public final void method1822(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg4 != 10590) {
            this.method1821(false, 44, 90, -64, 10, -36, 20, (byte[]) null, 76, 35);
        }
        if (~arg1 == -1) {
            arg1 = arg5;
        }
        ++field4075;
        if (arg6) {
            int[] var10 = new int[arg5 * arg7];
            for (int var11 = 0; var11 < arg7; ++var11) {
                int var12 = arg5 * var11;
                int var13 = (arg7 + -1 + -var11) * arg1 + arg8;
                for (int var14 = 0; var14 < arg5; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        super.field7283.method1990(this, arg4 ^ 1798);
        if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field7272, 0, arg2, arg3, arg5, arg7, 32993, super.field7283.field4539, arg0, arg8);
        if (~arg1 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
    public final void method1823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4083;
        if (arg1 == -31950) {
            int var8 = super.field7283.field4387 - (arg4 - -arg3);
            super.field7283.method1990(this, arg1 + 43814);
            OpenGL.glCopyTexSubImage2D(super.field7272, 0, arg0, -arg5 + this.field4074 + -arg3, arg6, var8, arg2, arg3);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V")
    public final void method1824(int arg0, int arg1, int arg2, int arg3) {
        ++field4085;
        if (arg2 != -9550) {
            field4086 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field7272, super.field7277, arg3);
        this.field4080 = arg1;
        this.field4078 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lvj;IIIIZ[BIZ)V")
    public class286(class303 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4076 = arg3;
        this.field4074 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field7283.method1990(this, 11864);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field7272 != 34037) {
            class17.method116(0, arg6, arg4, arg3, arg7, arg1, arg2);
            this.method2930(-114, true);
        } else {
            OpenGL.glTexImage2Dub(super.field7272, 0, super.field7280, this.field4076, this.field4074, 0, arg7, 5121, arg6, 0);
            this.method2930(-125, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2929((byte) -106, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public final void method1055(byte arg0) {
        if (arg0 >= -52) {
            method1819(-125, -66, (byte) 60, 119, 101, -83);
        }
        ++field4077;
        OpenGL.glFramebufferTexture2DEXT(this.field4078, this.field4080, super.field7272, 0, 0);
        this.field4080 = -1;
        this.field4078 = -1;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lvj;IIIII)V")
    public class286(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4076 = arg4;
        this.field4074 = arg5;
        int var7 = -arg3 - arg5 + super.field7283.field4387;
        super.field7283.method1990(this, 11864);
        OpenGL.glCopyTexImage2D(super.field7272, 0, super.field7280, arg2, var7, arg4, arg5, 0);
        this.method2929((byte) -85, true);
    }

    static {
        new class342("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field4086 = Boolean.FALSE;
        field4087 = new class342("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class26 extends class221 {

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    private int field427 = -1;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    private int field429 = -1;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Lag;")
    public static class463 field436;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Lts;")
    public static class356 field431;

    static {
        new class194("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field436 = new class463("RC", 1);
        field437 = 0;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lrl;IIIIZ[BIZ)V", line = 4)
    public class26(class487 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field435 = arg3;
        this.field433 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3112.method2883(this, 121);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field3116 != 34037) {
            class162.method1023(arg7, arg4, arg3, arg2, arg6, 30, arg1);
            this.method1366(3, true);
        } else {
            OpenGL.glTexImage2Dub(super.field3116, 0, super.field3119, this.field435, this.field433, 0, arg7, 5121, arg6, 0);
            this.method1366(3, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1357(true, (byte) 102);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 58)
    public static void method223(int arg0) {
        field436 = null;
        if (arg0 != 0) {
            field431 = null;
        }
        field431 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lrl;IIIIZ[FI)V", line = 69)
    public class26(class487 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field435 = arg3;
        this.field433 = arg4;
        super.field3112.method2883(this, 49);
        if (arg5 && ~super.field3116 != -34038) {
            class210.method1296(arg4, arg1, arg6, arg3, arg7, arg2, 6618);
            this.method1366(3, true);
        } else {
            OpenGL.glTexImage2Df(super.field3116, 0, super.field3119, this.field435, this.field433, 0, arg7, 5126, arg6, 0);
            this.method1366(3, false);
        }
        this.method1357(true, (byte) 110);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 92)
    public final void method224(int arg0) {
        ++field426;
        OpenGL.glFramebufferTexture2DEXT(this.field427, this.field429, super.field3116, arg0, 0);
        this.field429 = -1;
        this.field427 = -1;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lrl;IIII)V", line = 139)
    public class26(class487 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field435 = arg3;
        this.field433 = arg4;
        super.field3112.method2883(this, -97);
        OpenGL.glTexImage2Dub(super.field3116, 0, super.field3119, arg3, arg4, 0, class195.method1221(-114, super.field3119), 5121, (byte[]) null, 0);
        this.method1357(true, (byte) 121);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lrl;IIIII)V", line = 222)
    public class26(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field433 = arg5;
        this.field435 = arg4;
        int var7 = super.field3112.field7191 - (arg3 + arg5);
        super.field3112.method2883(this, -117);
        OpenGL.glCopyTexImage2D(super.field3116, 0, super.field3119, arg2, var7, arg4, arg5, 0);
        this.method1357(true, (byte) 89);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lrl;IIIIZ[IZ)V", line = 306)
    public class26(class487 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field433 = arg4;
        this.field435 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 + -var10) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3112.method2883(this, -120);
        if (arg5 && super.field3116 != 34037) {
            class405.method2422(super.field3112.field7403, super.field3119, arg6, this.field435, this.field433, 74, 32993, super.field3116);
            this.method1366(3, true);
        } else {
            OpenGL.glTexImage2Di(super.field3116, 0, super.field3119, this.field435, this.field433, 0, 32993, super.field3112.field7403, arg6, 0);
            this.method1366(3, false);
        }
        this.method1357(true, (byte) 95);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BIIIIII)V", line = 110)
    public final void method225(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field432;
        if (arg0 != 56) {
            this.method228(false, true, 11);
        }
        int var8 = -arg4 + super.field3112.field7191 + -arg2;
        super.field3112.method2883(this, 92);
        OpenGL.glCopyTexSubImage2D(super.field3116, 0, arg1, this.field433 - arg2 - arg5, arg6, var8, arg3, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V", line = 126)
    public final void method226(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 19814) {
            field436 = null;
        }
        ++field430;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, super.field3116, super.field3131, arg1);
        this.field429 = arg2;
        this.field427 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIIIIII[BI)V", line = 162)
    public final void method227(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        ++field425;
        if (~arg9 == -1) {
            arg9 = arg4;
        }
        if (arg0) {
            int var11 = class90.method568(arg7, (byte) 101);
            int var12 = arg4 * var11;
            int var13 = arg9 * var11;
            byte[] var14 = new byte[arg1 * var12];
            for (int var15 = 0; arg1 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg1 + -1 + -var15) * var13 + arg3;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field3112.method2883(this, 77);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 != arg9) {
            OpenGL.glPixelStorei(3314, arg9);
        }
        OpenGL.glTexSubImage2Dub(super.field3116, 0, arg5, arg6, arg4, arg1, arg7, 5121, arg8, arg3);
        if (~arg4 != ~arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg2 != -3608) {
            this.field435 = 55;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZI)V", line = 236)
    public final void method228(boolean arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            ++field434;
            if (super.field3116 == 3553) {
                super.field3112.method2883(this, -118);
                OpenGL.glTexParameteri(super.field3116, 10242, arg0 ? 10497 : 33071);
                OpenGL.glTexParameteri(super.field3116, 10243, arg1 ? 10497 : 33071);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIIII[III)V", line = 253)
    public final void method229(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        if (~arg1 == -1) {
            arg1 = arg4;
        }
        int var10 = -34 / ((57 - arg3) / 62);
        ++field428;
        if (arg0) {
            int[] var11 = new int[arg4 * arg7];
            for (int var12 = 0; arg7 > var12; ++var12) {
                int var13 = arg4 * var12;
                int var14 = (arg7 + -1 - var12) * arg1 + arg5;
                for (int var15 = 0; ~var15 > ~arg4; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field3112.method2883(this, -125);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field3116, 0, arg8, arg2, arg4, arg7, 32993, super.field3112.field7403, arg6, arg5);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}

import jaggl.OpenGL;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class533 extends class36 {

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "I")
    private int field7336 = -1;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    private int field7332 = -1;

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public int field7334;

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "I")
    public int field7338;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
    public static int field7337 = 0;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lqo;IIII)V")
    public class533(class22 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field7334 = arg3;
        this.field7338 = arg4;
        super.field870.method256((byte) -111, this);
        OpenGL.glTexImage2Dub(super.field868, 0, super.field877, arg3, arg4, 0, class397.method2484(true, super.field877), 5121, (byte[]) null, 0);
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIII)V")
    public final void method3065(int arg0, int arg1, int arg2, int arg3) {
        ++field7328;
        if (arg2 != 0) {
            field7337 = -125;
        }
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field868, super.field878, arg1);
        this.field7336 = arg0;
        this.field7332 = arg3;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lqo;IIIIZ[FI)V")
    public class533(class22 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7334 = arg3;
        this.field7338 = arg4;
        super.field870.method256((byte) -91, this);
        if (arg5 && super.field868 != 34037) {
            class241.method1669(arg3, arg7, arg1, arg6, 0, arg4, arg2);
            this.method454(true, (byte) -123);
        } else {
            OpenGL.glTexImage2Df(super.field868, 0, super.field877, this.field7334, this.field7338, 0, arg7, 5126, arg6, 0);
            this.method454(false, (byte) -123);
        }
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZII[IIBIII)V")
    public final void method3066(boolean arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        ++field7330;
        if (arg8 == 0) {
            arg8 = arg6;
        }
        if (arg0) {
            int[] var10 = new int[arg1 * arg6];
            for (int var11 = 0; ~arg1 < ~var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (arg1 + -1 - var11) * arg8 + arg4;
                for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                    var10[var12++] = arg3[var13++];
                }
            }
            arg3 = var10;
        }
        super.field870.method256((byte) -80, this);
        if (arg6 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Di(super.field868, 0, arg7, arg2, arg6, arg1, 32993, super.field870.field634, arg3, arg4);
        if (~arg6 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg5 > -65) {
            this.field7334 = 101;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lqo;IIIIZ[IIIZ)V")
    public class533(class22 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7334 = arg3;
        this.field7338 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; arg4 > var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + -1 + arg4) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field870.method256((byte) -79, this);
        if (~super.field868 != -34038 && arg5 && ~arg7 == -1 && arg8 == 0) {
            class321.method2054(super.field868, super.field877, this.field7338, super.field870.field634, this.field7334, arg6, 32993, -103);
            this.method454(true, (byte) -123);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field868, 0, super.field877, this.field7334, this.field7338, 0, 32993, super.field870.field634, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method454(false, (byte) -123);
        }
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lqo;IIIIZ[BIZ)V")
    public class533(class22 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7334 = arg3;
        this.field7338 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field870.method256((byte) -84, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field868 != 34037) {
            class453.method2699(arg4, arg3, arg6, false, arg7, arg1, arg2);
            this.method454(true, (byte) -123);
        } else {
            OpenGL.glTexImage2Dub(super.field868, 0, super.field877, this.field7334, this.field7338, 0, arg7, 5121, arg6, 0);
            this.method454(false, (byte) -123);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZZI)V")
    public final void method3067(boolean arg0, boolean arg1, int arg2) {
        ++field7327;
        if (arg2 != 10243) {
            method3068(-20, 83, 1, -22, (byte) -31, 74, -57, 109, -102);
        }
        if (~super.field868 == -3554) {
            super.field870.method256((byte) -102, this);
            OpenGL.glTexParameteri(super.field868, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field868, 10243, !arg0 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method3068(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        class649.field8933[class85.field1531++] = new class546(arg5, arg7, arg8, arg0, arg0, arg8, arg3, arg1, arg1, arg3, arg2, arg2, arg6, arg6);
        ++field7335;
        if (arg4 != 0) {
            method3070();
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIBI)V")
    public final void method3069(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field7331;
        int var8 = -arg2 - arg1 + super.field870.field463;
        super.field870.method256((byte) -100, this);
        OpenGL.glCopyTexSubImage2D(super.field868, 0, arg0, -arg1 - (arg3 - this.field7338), arg4, var8, arg6, arg1);
        if (arg5 != -120) {
            this.method3067(true, true, -57);
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "()V")
    public static final void method3070() {
        class415.method2560(1, class510.field7094);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public final void method457(int arg0) {
        if (arg0 != -3022) {
            this.field7334 = 75;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field7336, this.field7332, super.field868, 0, 0);
        ++field7329;
        this.field7332 = -1;
        this.field7336 = -1;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "([BI)Lmi;")
    public static final class496 method3071(byte[] arg0, int arg1) {
        ++field7333;
        if (arg1 != -5901) {
            field7337 = 83;
        }
        if (arg0 == null) {
            throw new RuntimeException("");
        } else {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                    MediaTracker var3 = new MediaTracker(class334.field4684);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class334.field4684);
                    int var5 = var2.getHeight(class334.field4684);
                    if (!var3.isErrorAny() && var4 >= 0 && ~var5 <= -1) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class272.field3822.method621(var4, var6, (byte) 94, 0, var4, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIZIIII[BI)V")
    public final void method3072(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        if (arg4 == 0) {
            arg4 = arg2;
        }
        ++field7326;
        if (arg3) {
            int var11 = class468.method2755(arg6, -6409);
            int var12 = arg2 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg5 * var12];
            for (int var15 = 0; ~var15 > ~arg5; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg5 + -1 - var15) * var13 + arg9;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field870.method256((byte) -102, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field868, 0, arg0, arg1, arg2, arg5, arg6, 5121, arg8, arg9);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        int var19 = -17 % ((46 - arg7) / 59);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lqo;IIIII)V")
    public class533(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field7334 = arg4;
        this.field7338 = arg5;
        int var7 = -arg3 + -arg5 + super.field870.field463;
        super.field870.method256((byte) -111, this);
        OpenGL.glCopyTexImage2D(super.field868, 0, super.field877, arg2, var7, arg4, arg5, 0);
        this.method456(9728, true);
    }
}

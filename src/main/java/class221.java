import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class221 extends class692 {

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "Lan;")
    private class193 field3244;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "Lhu;")
    private class702 field3246;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "[F")
    private float[] field3250;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Lsi;")
    public static class769 field3243 = new class769(16);

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "F")
    private float field3245;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    private int field3238;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Lbfa;")
    private class264 field3242;

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Llea;Lan;)V", line = 4)
    public class221(class573 arg0, class193 arg1) {
        super(arg0);
        this.field3244 = arg1;
        if (super.field9753.field8279 && ~super.field9753.field8216 <= -3) {
            this.field3246 = class696.method3911(34336, (byte) 126, super.field9753, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field3246 != null) {
                int[][] var3 = class651.method3669(0, 4, 0.4F, 4, 64, false, 0, 3, 256);
                int[][] var4 = class651.method3669(8, 4, 0.4F, 4, 64, false, 0, 3, 256);
                this.field3250 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field3250[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3250[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1523(true);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZLjava/lang/String;III)V", line = 52)
    public static final void method1520(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
        ++field3249;
        if (arg3 != -65) {
            field3243 = null;
        }
        class505.method2957(arg1, (String) null, arg4, (byte) 126, arg2, false, arg0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZI)V", line = 69)
    public final void method1113(int arg0, boolean arg1, int arg2) {
        ++field3239;
        if (this.field3242 != null) {
            super.field9753.method3321(1, -19587);
            if ((arg0 & 128) == 0) {
                if ((1 & arg2) != 1) {
                    if (this.field3244.field2901) {
                        super.field9753.method3384(this.field3244.field2897, (byte) 81);
                    } else {
                        super.field9753.method3384(this.field3244.field2904[0], (byte) 106);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (this.field3244.field2901) {
                    super.field9753.method3384(this.field3244.field2897, (byte) 60);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3245, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field9753.field8133 % 4000 * 16 / 4000;
                    super.field9753.method3384(this.field3244.field2904[var4], (byte) 122);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field9753.method3384((class377) null, (byte) 118);
            }
            super.field9753.method3321(0, -19587);
            if ((arg0 & 64) == 0) {
                class148.field2386[0] = super.field9753.field8273 * super.field9753.field8243;
                class148.field2386[2] = super.field9753.field8243 * super.field9753.field8193;
                class148.field2386[1] = super.field9753.field8243 * super.field9753.field8202;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class148.field2386, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg0 & 3;
            if (arg1) {
                if (~var5 == -3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (~var5 == -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V", line = 139)
    public static void method1521(int arg0) {
        int var1 = -61 / ((arg0 - 57) / 32);
        field3243 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 157)
    public final void method1111(byte arg0) {
        ++field3248;
        if (this.field3242 != null) {
            this.field3242.method1700('\u0001', 3711);
            super.field9753.method3321(1, arg0 ^ -19697);
            if (arg0 != 114) {
                this.method1112(-10);
            }
            super.field9753.method3384((class377) null, (byte) 111);
            super.field9753.method3321(0, -19587);
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V", line = 176)
    public static final void method1522(int arg0) {
        ++field3240;
        class694 var1 = null;
        try {
            class746 var2 = class336.field4775.method907("2", true, -14087);
            if (arg0 != 34336) {
                field3243 = null;
            }
            while (var2.field10365 == 0) {
                class579.method3405(1L, arg0 + -34326);
            }
            if (~var2.field10365 == -2) {
                var1 = (class694) var2.field10371;
                byte[] var3 = new byte[(int) var1.method3896(-8486)];
                int var5;
                for (int var4 = 0; var3.length > var4; var4 += var5) {
                    var5 = var1.method3904(var4, var3.length + -var4, var3, 119);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class413.method2432(new class431(var3), -14470);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3900(114);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)V", line = 226)
    public final void method1118(boolean arg0, int arg1) {
        ++field3247;
        if (this.field3242 != null) {
            if (arg1 == -3826) {
                this.field3242.method1700('\u0000', 3711);
                super.field9753.method3321(1, -19587);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field9753.field8169.method1572(arg1 + 3701), 0);
                OpenGL.glMatrixMode(5888);
                super.field9753.method3321(0, -19587);
                if (super.field9753.field8133 != this.field3238) {
                    int var3 = super.field9753.field8133 % 5000 * 128 / 5000;
                    for (int var4 = 0; var4 < 64; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field3250, var3);
                        var3 += 2;
                    }
                    if (this.field3244.field2901) {
                        this.field3245 = (float) (super.field9753.field8133 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field3238 = super.field9753.field8133;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Z", line = 271)
    public final boolean method1112(int arg0) {
        if (arg0 >= -124) {
            this.field3246 = null;
        }
        ++field3241;
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V", line = 282)
    private final void method1523(boolean arg0) {
        ++field3251;
        this.field3242 = new class264(super.field9753, 2);
        this.field3242.method1704(0, -112);
        super.field9753.method3321(1, -19587);
        super.field9753.method3343(-16777216, 20710);
        super.field9753.method3359(260, 7681, arg0);
        super.field9753.method3374(0, 770, 34166, -127);
        super.field9753.method3321(0, -19587);
        OpenGL.glBindProgramARB(34336, this.field3246.field9841);
        OpenGL.glEnable(34336);
        this.field3242.method1701((byte) 71);
        this.field3242.method1704(1, -121);
        super.field9753.method3321(1, -19587);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field9753.method3375(0, (byte) 102);
        super.field9753.method3374(0, 770, 5890, -89);
        super.field9753.method3321(0, -19587);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3242.method1701((byte) 96);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILfga;I)V", line = 312)
    public final void method1119(int arg0, class377 arg1, int arg2) {
        ++field3253;
        super.field9753.method3384(arg1, (byte) 100);
        super.field9753.method3375(arg2, (byte) 102);
        if (arg0 < 48) {
            this.field3245 = 0.3074286F;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZB)V", line = 326)
    public final void method1117(boolean arg0, byte arg1) {
        ++field3252;
        if (arg1 != 57) {
            method1520(false, (String) null, -6, 42, -127);
        }
    }
}

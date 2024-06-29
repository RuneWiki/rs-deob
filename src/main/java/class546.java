import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class546 extends class398 {

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "Lal;")
    private class170 field8052;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "Llk;")
    private class569 field8057;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "[F")
    private float[] field8051;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "Lcq;")
    public static class273 field8058 = new class273(13, 0, 1, 0);

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "F")
    private float field8053;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    private int field8056;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "Lpl;")
    public static class215 field8061;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Lbq;")
    private class646 field8049;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z")
    public final boolean method87(int arg0) {
        if (arg0 != 3) {
            field8058 = null;
        }
        ++field8059;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBI)V")
    public final void method86(int arg0, byte arg1, int arg2) {
        ++field8055;
        if (this.field8049 != null) {
            super.field6009.method1745(true, 1);
            if ((arg2 & 128) != 0) {
                super.field6009.method1709((byte) -99, (class517) null);
            } else if (~(arg0 & 1) == -2) {
                if (this.field8052.field2403) {
                    super.field6009.method1709((byte) -73, this.field8052.field2405);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field8053, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field6009.field4020 % 4000 * 16 / 4000;
                    super.field6009.method1709((byte) -115, this.field8052.field2406[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (!this.field8052.field2403) {
                    super.field6009.method1709((byte) -61, this.field8052.field2406[0]);
                } else {
                    super.field6009.method1709((byte) -47, this.field8052.field2405);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field6009.method1745(true, 0);
            if ((arg2 & 64) == 0) {
                OpenGL.glGetFloatv(2899, class641.field9193, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class641.field9193, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg2 & 3;
            if (arg1 != 82) {
                this.field8049 = null;
            }
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V")
    public final void method92(int arg0) {
        ++field8050;
        if (this.field8049 != null) {
            if (arg0 == 512) {
                this.field8049.method3678('\u0001', arg0 ^ 638);
                super.field6009.method1745(true, 1);
                super.field6009.method1709((byte) -54, (class517) null);
                super.field6009.method1745(true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Luca;Lal;)V")
    public class546(class287 arg0, class170 arg1) {
        super(arg0);
        this.field8052 = arg1;
        if (super.field6009.field4140 && ~super.field6009.field4162 <= -3) {
            this.field8057 = class375.method2311(34336, super.field6009, -75, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field8057 != null) {
                int[][] var3 = class53.method317(256, 3, 0, -114, 0.4F, 4, false, 64, 4);
                int[][] var4 = class53.method317(256, 3, 8, -112, 0.4F, 4, false, 64, 4);
                int var5 = 0;
                this.field8051 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field8051[var5++] = (float) var7[var9] / 4096.0F;
                        this.field8051[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3198(24516);
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZ)V")
    public final void method94(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field8058 = null;
        }
        ++field8048;
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V")
    public static void method3197(int arg0) {
        field8061 = null;
        if (arg0 >= 77) {
            field8058 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)V")
    public final void method91(boolean arg0, int arg1) {
        ++field8062;
        if (this.field8049 != null) {
            this.field8049.method3678('\u0000', arg1 + 5284);
            super.field6009.method1745(true, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6009.field4058.method1284(true), 0);
            OpenGL.glMatrixMode(5888);
            super.field6009.method1745(true, 0);
            if (super.field6009.field4020 != this.field8056) {
                int var3 = super.field6009.field4020 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field8051, var3);
                    var3 += 2;
                }
                if (this.field8052.field2403) {
                    this.field8053 = (float) (super.field6009.field4020 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field8056 = super.field6009.field4020;
            }
            if (arg1 != -5191) {
                this.method93(-36, (class517) null, (byte) -28);
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
    private final void method3198(int arg0) {
        ++field8054;
        this.field8049 = new class646(super.field6009, 2);
        this.field8049.method3680(0, (byte) -127);
        super.field6009.method1745(true, 1);
        super.field6009.method1759(true, -16777216);
        super.field6009.method1701(260, arg0 + -24515, 7681);
        super.field6009.method1724((byte) 11, 770, 34166, 0);
        super.field6009.method1745(true, 0);
        OpenGL.glBindProgramARB(34336, this.field8057.field8289);
        OpenGL.glEnable(34336);
        if (arg0 == 24516) {
            this.field8049.method3679(-102);
            this.field8049.method3680(1, (byte) 98);
            super.field6009.method1745(true, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6009.method1751(0, 21575);
            super.field6009.method1724((byte) 11, 770, 5890, 0);
            super.field6009.method1745(true, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field8049.method3679(-71);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILvaa;B)V")
    public final void method93(int arg0, class517 arg1, byte arg2) {
        super.field6009.method1709((byte) -46, arg1);
        int var4 = 88 % ((arg2 - 76) / 41);
        ++field8060;
        super.field6009.method1751(arg0, 21575);
    }
}

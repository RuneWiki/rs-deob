import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class686 extends class184 {

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Lqr;")
    private class64 field9680;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Lpp;")
    private class390 field9665;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[F")
    private float[] field9673;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "[Leca;")
    public static class755[] field9667 = new class755[14];

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lcv;")
    public static class565 field9674 = new class565();

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "Lpu;")
    public static class559 field9676 = new class559(2, 4);

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "[I")
    public static int[] field9681 = new int[3];

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "F")
    private float field9670;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    private int field9679;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Leha;")
    private class89 field9677;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 7)
    public final void method702(boolean arg0) {
        ++field9678;
        if (this.field9677 != null) {
            this.field9677.method834((byte) 105, '\u0001');
            super.field2626.method3413(1, 33984);
            if (!arg0) {
                field9676 = null;
            }
            super.field2626.method3425((class87) null, 67);
            super.field2626.method3413(0, 33984);
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 24)
    private final void method3859(int arg0) {
        this.field9677 = new class89(super.field2626, 2);
        ++field9669;
        this.field9677.method836(4864, 0);
        super.field2626.method3413(1, 33984);
        super.field2626.method3461((byte) 116, -16777216);
        super.field2626.method3485(260, (byte) 89, 7681);
        super.field2626.method3453(7482, 34166, 0, 770);
        super.field2626.method3413(0, 33984);
        OpenGL.glBindProgramARB(34336, this.field9665.field5448);
        OpenGL.glEnable(34336);
        this.field9677.method832(99);
        if (arg0 > 61) {
            this.field9677.method836(4864, 1);
            super.field2626.method3413(1, 33984);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2626.method3417(0, 0);
            super.field2626.method3453(7482, 5890, 0, 770);
            super.field2626.method3413(0, 33984);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field9677.method832(99);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Liia;ZI)V", line = 56)
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        ++field9668;
        super.field2626.method3425(arg0, -95);
        if (arg1) {
            this.field9680 = null;
        }
        super.field2626.method3417(arg2, 0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)V", line = 69)
    public final void method704(boolean arg0, int arg1) {
        if (arg1 == -28981) {
            ++field9675;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZ)V", line = 79)
    public final void method705(int arg0, int arg1, boolean arg2) {
        ++field9666;
        if (this.field9677 != null) {
            super.field2626.method3413(1, 33984);
            if (arg2) {
                this.method698(-107);
            }
            if ((128 & arg1) == 0) {
                if (~(arg0 & 1) != -2) {
                    if (this.field9680.field1157) {
                        super.field2626.method3425(this.field9680.field1162, 124);
                    } else {
                        super.field2626.method3425(this.field9680.field1158[0], -114);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field9680.field1157) {
                    int var4 = super.field2626.field8544 % 4000 * 16 / 4000;
                    super.field2626.method3425(this.field9680.field1158[var4], -99);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field2626.method3425(this.field9680.field1162, -108);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field9670, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field2626.method3425((class87) null, 86);
            }
            super.field2626.method3413(0, 33984);
            if (~(64 & arg1) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class435.field6086[2] = super.field2626.field8643 * super.field2626.field8628;
                class435.field6086[0] = super.field2626.field8637 * super.field2626.field8628;
                class435.field6086[1] = super.field2626.field8663 * super.field2626.field8628;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class435.field6086, 0);
            }
            int var5 = arg1 & 3;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 149)
    public static void method3860(int arg0) {
        field9674 = null;
        if (arg0 != 0) {
            field9676 = null;
        }
        field9676 = null;
        field9667 = null;
        field9681 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V", line = 177)
    public final void method699(int arg0, boolean arg1) {
        ++field9672;
        if (this.field9677 != null) {
            this.field9677.method834((byte) 105, '\u0000');
            super.field2626.method3413(1, 33984);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2626.field8580.method4026(5963), 0);
            OpenGL.glMatrixMode(5888);
            if (arg0 > -54) {
                this.field9677 = null;
            }
            super.field2626.method3413(0, 33984);
            if (~super.field2626.field8544 != ~this.field9679) {
                int var3 = super.field2626.field8544 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field9673, var3);
                    var3 += 2;
                }
                if (!this.field9680.field1157) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field9670 = (float) (super.field2626.field8544 % 4000) / 4000.0F;
                }
                this.field9679 = super.field2626.field8544;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z", line = 223)
    public final boolean method698(int arg0) {
        ++field9671;
        if (arg0 != -20958) {
            field9676 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Loea;Lqr;)V", line = 235)
    public class686(class594 arg0, class64 arg1) {
        super(arg0);
        this.field9680 = arg1;
        if (super.field2626.field8652 && ~super.field2626.field8622 <= -3) {
            this.field9665 = class184.method1316(34336, 121, super.field2626, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field9665 != null) {
                int[][] var3 = class212.method1486(4, 0, 3, 256, 4, false, 0.4F, 64, true);
                int[][] var4 = class212.method1486(4, 8, 3, 256, 4, false, 0.4F, 64, true);
                int var5 = 0;
                this.field9673 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field9673[var5++] = (float) var7[var9] / 4096.0F;
                        this.field9673[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3859(69);
            }
        }
    }
}

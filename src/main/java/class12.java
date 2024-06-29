import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class193 {

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lpl;")
    private class462 field208;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lti;")
    private class306 field212;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[F")
    private float[] field216;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lup;")
    public static class181 field207 = new class181(0, 7);

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "[I")
    public static int[] field218 = new int[2048];

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Lbu;")
    private class17 field210;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 3)
    private final void method91(byte arg0) {
        ++field213;
        this.field210 = new class17(super.field2498, 2);
        this.field210.method152((byte) 63, 0);
        super.field2498.method2321(1, 25322);
        super.field2498.method2299((byte) -57, -16777216);
        super.field2498.method2271(-125, 260, 7681);
        super.field2498.method2289(770, 63, 0, 34166);
        if (arg0 != -32) {
            this.field217 = 10;
        }
        super.field2498.method2321(0, arg0 + 25354);
        OpenGL.glBindProgramARB(34336, this.field212.field3907);
        OpenGL.glEnable(34336);
        this.field210.method150((byte) 101);
        this.field210.method152((byte) 63, 1);
        super.field2498.method2321(1, arg0 + 25354);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2498.method2305(7681, 0);
        super.field2498.method2289(770, arg0 ^ -6, 0, 5890);
        super.field2498.method2321(0, 25322);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field210.method150((byte) 120);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 36)
    public final void method92(byte arg0) {
        ++field206;
        if (this.field210 != null) {
            this.field210.method149('\u0001', 4864);
            if (arg0 >= -56) {
                this.method92((byte) 7);
            }
            super.field2498.method2321(1, 25322);
            super.field2498.method2322((class119) null, 14);
            super.field2498.method2321(0, 25322);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z", line = 54)
    public final boolean method93(boolean arg0) {
        ++field209;
        if (arg0) {
            field207 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZZ)V", line = 65)
    public final void method94(boolean arg0, boolean arg1) {
        ++field204;
        if (this.field210 != null) {
            this.field210.method149('\u0000', 4864);
            super.field2498.method2321(1, 25322);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2498.field5589.method1427(43), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2498.method2321(0, 25322);
            if (super.field2498.field5503 != this.field217) {
                int var3 = super.field2498.field5503 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field216, var4);
                    var4 += 2;
                }
                if (!this.field208.field6613) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var6 = (float) (super.field2498.field5503 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                }
                this.field217 = super.field2498.field5503;
            }
            if (!arg0) {
                field218 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(ZZ)V", line = 121)
    public final void method95(boolean arg0, boolean arg1) {
        ++field214;
        if (!arg1) {
            this.method97((class119) null, -46, -62);
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lug;Lpl;)V", line = 133)
    public class12(class395 arg0, class462 arg1) {
        super(arg0);
        this.field208 = arg1;
        if (super.field2498.field5616 && ~super.field2498.field5575 <= -3) {
            this.field212 = class25.method204("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, super.field2498, -35);
            if (this.field212 != null) {
                int[][] var3 = class491.method2981(4, 64, 0, false, 0, 0.4F, 8, 3, 256);
                int[][] var4 = class491.method2981(4, 64, 8, false, 0, 0.4F, 8, 3, 256);
                int var5 = 0;
                this.field216 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field216[var5++] = (float) var7[var9] / 4096.0F;
                        this.field216[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method91((byte) -32);
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V", line = 186)
    public static void method96(byte arg0) {
        field218 = null;
        if (arg0 == 47) {
            field207 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lsq;II)V", line = 198)
    public final void method97(class119 arg0, int arg1, int arg2) {
        if (arg2 == 36) {
            ++field205;
            super.field2498.method2322(arg0, 14);
            super.field2498.method2305(arg2 + 7645, arg1);
        }
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)[Lup;", line = 213)
    public static final class181[] method98(byte arg0) {
        if (arg0 >= -80) {
            field207 = null;
        }
        ++field211;
        return new class181[] { field207, class222.field2800, class468.field6770, class5.field49, class522.field7560, class24.field351, class72.field929, class163.field2073, class226.field2877, class412.field5880, class390.field5242, class300.field3866, class474.field6867, class59.field770, class410.field5856 };
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZ)V", line = 227)
    public final void method99(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field215;
            if (this.field210 != null) {
                super.field2498.method2321(1, 25322);
                if ((arg0 & 128) == 0) {
                    if (this.field208.field6613) {
                        super.field2498.method2322(this.field208.field6609, 14);
                    } else {
                        int var4 = super.field2498.field5503 % 4000 * 16 / 4000;
                        super.field2498.method2322(this.field208.field6612[var4], 14);
                    }
                } else {
                    super.field2498.method2322((class119) null, 14);
                }
                super.field2498.method2321(0, 25322);
                if ((64 & arg0) == 0) {
                    OpenGL.glGetFloatv(2899, class380.field5003, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class380.field5003, 0);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                }
                int var5 = 3 & arg0;
                if (~var5 != -3) {
                    if (var5 == 3) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                    }
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }
}

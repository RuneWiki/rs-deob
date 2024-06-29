import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class314 extends class446 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lai;")
    private class428 field4725;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lhh;")
    private class86 field4727;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[F")
    private float[] field4730;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Ls;")
    public static class186 field4724 = new class186(18, 6);

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[I")
    public static int[] field4737 = new int[1000];

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "F")
    private float field4738;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ltm;")
    private class267 field4736;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lh;")
    public static class474 field4723;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZ)V")
    public final void method695(byte arg0, boolean arg1) {
        if (arg0 == -33) {
            ++field4732;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILac;)V")
    public final void method694(int arg0, int arg1, class381 arg2) {
        super.field6642.method381((byte) 28, arg2);
        ++field4728;
        super.field6642.method288((byte) -98, arg0);
        if (arg1 != 0) {
            this.method696(true, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    private final void method1989(int arg0) {
        ++field4726;
        this.field4736 = new class267(super.field6642, 2);
        this.field4736.method1699((byte) 88, 0);
        super.field6642.method392((byte) 106, 1);
        super.field6642.method339(-16777216, 30766);
        super.field6642.method426(260, 7681, -24610);
        super.field6642.method325(34166, 5126, 770, 0);
        super.field6642.method392((byte) 106, 0);
        OpenGL.glBindProgramARB(34336, this.field4727.field1765);
        OpenGL.glEnable(34336);
        this.field4736.method1700(arg0 + -7201);
        this.field4736.method1699((byte) 88, 1);
        super.field6642.method392((byte) 106, 1);
        OpenGL.glMatrixMode(5890);
        if (arg0 == 7203) {
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6642.method288((byte) -112, 0);
            super.field6642.method325(5890, 5126, 770, 0);
            super.field6642.method392((byte) 106, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field4736.method1700(2);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        ++field4735;
        if (this.field4736 != null) {
            super.field6642.method392((byte) 106, 1);
            if (~(128 & arg1) != arg0) {
                super.field6642.method381((byte) 28, (class381) null);
            } else if (~(1 & arg2) != -2) {
                if (!this.field4725.field6400) {
                    super.field6642.method381((byte) 28, this.field4725.field6401[0]);
                } else {
                    super.field6642.method381((byte) 28, this.field4725.field6403);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (this.field4725.field6400) {
                super.field6642.method381((byte) 28, this.field4725.field6403);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field4738, 0.0F, 0.0F, 1.0F);
            } else {
                int var4 = super.field6642.field806 % 4000 * 16 / 4000;
                super.field6642.method381((byte) 28, this.field4725.field6401[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field6642.method392((byte) 106, 0);
            if ((64 & arg1) == 0) {
                OpenGL.glGetFloatv(2899, class364.field5328, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class364.field5328, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg1 & 3;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 != -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
    public final boolean method691(byte arg0) {
        if (arg0 != -93) {
            return false;
        } else {
            ++field4733;
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public static void method1990(int arg0) {
        field4737 = null;
        field4724 = null;
        if (arg0 != 34336) {
            method1990(101);
        }
        field4723 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final void method688(int arg0) {
        ++field4729;
        if (this.field4736 != null) {
            if (arg0 <= 5) {
                field4723 = null;
            }
            this.field4736.method1702(-88, '\u0001');
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, (class381) null);
            super.field6642.method392((byte) 106, 0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZB)V")
    public final void method696(boolean arg0, byte arg1) {
        ++field4734;
        if (this.field4736 != null) {
            this.field4736.method1702(-107, '\u0000');
            super.field6642.method392((byte) 106, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6642.field860.method1585(arg1 ^ -90), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field6642.method392((byte) 106, 0);
            if (~super.field6642.field806 != ~this.field4731) {
                int var3 = super.field6642.field806 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field4730, var4);
                    var4 += 2;
                }
                if (!this.field4725.field6400) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field4738 = (float) (super.field6642.field806 % 4000) / 4000.0F;
                }
                this.field4731 = super.field6642.field806;
            }
            if (arg1 != 42) {
                this.method688(-67);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lda;Lai;)V")
    public class314(class44 arg0, class428 arg1) {
        super(arg0);
        this.field4725 = arg1;
        if (super.field6642.field844 && super.field6642.field843 >= 2) {
            this.field4727 = class368.method2255(super.field6642, (byte) -113, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336);
            if (this.field4727 != null) {
                int[][] var3 = class477.method2851(0, (byte) 27, 3, 0.4F, 8, 4, 64, false, 256);
                int[][] var4 = class477.method2851(8, (byte) 27, 3, 0.4F, 8, 4, 64, false, 256);
                this.field4730 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field4730[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4730[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1989(7203);
            }
        }
    }
}

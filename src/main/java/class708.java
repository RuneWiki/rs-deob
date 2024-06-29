import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class708 extends class497 {

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lmha;")
    private class438 field9921;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Ltd;")
    private class481 field9919;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "[F")
    private float[] field9927;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "F")
    private float field9924;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field9922;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lpba;")
    private class352 field9925;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Ldn;")
    public static class544 field9928;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final void method162(int arg0, int arg1, int arg2) {
        ++field9926;
        if (this.field9925 != null) {
            super.field6867.method1637(33984, 1);
            if (arg0 >= 122) {
                if (~(arg1 & 128) == -1) {
                    if ((arg2 & 1) != 1) {
                        if (this.field9921.field6164) {
                            super.field6867.method1653((byte) 111, this.field9921.field6166);
                        } else {
                            super.field6867.method1653((byte) 93, this.field9921.field6169[0]);
                        }
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else if (!this.field9921.field6164) {
                        int var4 = super.field6867.field3532 % 4000 * 16 / 4000;
                        super.field6867.method1653((byte) 85, this.field9921.field6169[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field6867.method1653((byte) 101, this.field9921.field6166);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field9924, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    super.field6867.method1653((byte) 117, (class7) null);
                }
                super.field6867.method1637(33984, 0);
                if (~(arg1 & 64) != -1) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    class48.field727[2] = super.field6867.field3657 * super.field6867.field3570;
                    class48.field727[1] = super.field6867.field3657 * super.field6867.field3643;
                    class48.field727[0] = super.field6867.field3657 * super.field6867.field3626;
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class48.field727, 0);
                }
                int var5 = 3 & arg1;
                if (var5 == 2) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (~var5 == -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ldia;Lmha;)V")
    public class708(class246 arg0, class438 arg1) {
        super(arg0);
        this.field9921 = arg1;
        if (super.field6867.field3671 && super.field6867.field3605 >= 2) {
            this.field9919 = class405.method2520(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", (byte) -65, super.field6867);
            if (this.field9919 != null) {
                int[][] var3 = class279.method1808(3, false, 0, 4, 256, 64, (byte) 114, 4, 0.4F);
                int[][] var4 = class279.method1808(3, false, 8, 4, 256, 64, (byte) 115, 4, 0.4F);
                this.field9927 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field9927[var5++] = (float) var7[var9] / 4096.0F;
                        this.field9927[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3965(0);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
    private final void method3965(int arg0) {
        this.field9925 = new class352(super.field6867, 2);
        ++field9916;
        this.field9925.method2218(0, false);
        super.field6867.method1637(33984, 1);
        super.field6867.method1591(-16777216, false);
        super.field6867.method1622(7681, 260, (byte) -62);
        super.field6867.method1657((byte) 90, 770, 0, 34166);
        super.field6867.method1637(33984, 0);
        OpenGL.glBindProgramARB(34336, this.field9919.field6662);
        OpenGL.glEnable(34336);
        this.field9925.method2220(27294);
        this.field9925.method2218(1, false);
        super.field6867.method1637(33984, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field6867.method1589(-4, 0);
        super.field6867.method1657((byte) 90, 770, 0, 5890);
        super.field6867.method1637(33984, 0);
        OpenGL.glBindProgramARB(34336, arg0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field9925.method2220(27294);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(ZZ)V")
    public final void method163(boolean arg0, boolean arg1) {
        ++field9923;
        if (this.field9925 != null) {
            this.field9925.method2219('\u0000', (byte) -89);
            super.field6867.method1637(33984, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6867.field3566.method983(arg1), 0);
            OpenGL.glMatrixMode(5888);
            super.field6867.method1637(33984, 0);
            if (~super.field6867.field3532 != ~this.field9922) {
                int var3 = super.field6867.field3532 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field9927, var3);
                    var3 += 2;
                }
                if (this.field9921.field6164) {
                    this.field9924 = (float) (super.field6867.field3532 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field9922 = super.field6867.field3532;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public static void method3966(int arg0) {
        if (arg0 <= -62) {
            field9928 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Z")
    public final boolean method157(int arg0) {
        ++field9917;
        if (arg0 != -6808) {
            this.method161(29);
        }
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
    public final void method164(int arg0, boolean arg1) {
        ++field9929;
        if (arg0 != 0) {
            this.method3965(-66);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public final void method161(int arg0) {
        ++field9918;
        if (this.field9925 != null) {
            this.field9925.method2219('\u0001', (byte) -89);
            super.field6867.method1637(33984, 1);
            if (arg0 == -1756) {
                super.field6867.method1653((byte) 113, (class7) null);
                super.field6867.method1637(33984, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILil;I)V")
    public final void method158(int arg0, class7 arg1, int arg2) {
        super.field6867.method1653((byte) 89, arg1);
        if (arg0 != 9) {
            this.method158(81, (class7) null, -119);
        }
        ++field9920;
        super.field6867.method1589(arg0 + -13, arg2);
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class651 extends class460 {

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "Lul;")
    private class440 field9188;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lru;")
    private class232 field9191;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "[F")
    private float[] field9193;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public static int field9196 = -1;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "F")
    public static float field9195;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "F")
    private float field9200;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    private int field9190;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "Luq;")
    private class458 field9201;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(III)V", line = 3)
    public final void method1170(int arg0, int arg1, int arg2) {
        ++field9192;
        if (this.field9201 != null) {
            super.field6621.method2308(arg2, -15115);
            if ((128 & arg1) != 0) {
                super.field6621.method2295((byte) 91, (class337) null);
            } else if (~(1 & arg0) == -2) {
                if (this.field9188.field6360) {
                    super.field6621.method2295((byte) 81, this.field9188.field6364);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field9200, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field6621.field5456 % 4000 * 16 / 4000;
                    super.field6621.method2295((byte) 64, this.field9188.field6370[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (this.field9188.field6360) {
                    super.field6621.method2295((byte) -104, this.field9188.field6364);
                } else {
                    super.field6621.method2295((byte) 53, this.field9188.field6370[0]);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field6621.method2308(0, -15115);
            if (~(arg1 & 64) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class322.field4456, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class322.field4456, 0);
            }
            int var5 = arg1 & 3;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjo;I)V", line = 68)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        super.field6621.method2295((byte) -116, arg1);
        int var4 = -65 % ((arg2 - 65) / 53);
        ++field9198;
        super.field6621.method2270(arg0, (byte) 110);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z", line = 80)
    public final boolean method1168(int arg0) {
        if (arg0 != 2048) {
            this.field9200 = 0.7155061F;
        }
        ++field9199;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lkfa;Lul;)V", line = 92)
    public class651(class382 arg0, class440 arg1) {
        super(arg0);
        this.field9188 = arg1;
        if (super.field6621.field5508 && super.field6621.field5545 >= 2) {
            this.field9191 = class618.method3492("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", (byte) -68, super.field6621, 34336);
            if (this.field9191 != null) {
                int[][] var3 = class430.method2521(4, 4, 256, (byte) 2, 0, 64, 3, false, 0.4F);
                int[][] var4 = class430.method2521(4, 4, 256, (byte) 2, 8, 64, 3, false, 0.4F);
                int var5 = 0;
                this.field9193 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field9193[var5++] = (float) var7[var9] / 4096.0F;
                        this.field9193[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3639(true);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V", line = 140)
    private final void method3639(boolean arg0) {
        ++field9189;
        this.field9201 = new class458(super.field6621, 2);
        this.field9201.method2656(0, (byte) 76);
        super.field6621.method2308(1, -15115);
        super.field6621.method2297((byte) -11, -16777216);
        super.field6621.method2328(260, -76, 7681);
        super.field6621.method2258(-52, 34166, 770, 0);
        super.field6621.method2308(0, -15115);
        OpenGL.glBindProgramARB(34336, this.field9191.field3447);
        OpenGL.glEnable(34336);
        this.field9201.method2657(0);
        this.field9201.method2656(1, (byte) 76);
        super.field6621.method2308(1, -15115);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field6621.method2270(0, (byte) 110);
        super.field6621.method2258(-122, 5890, 770, 0);
        super.field6621.method2308(0, -15115);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field9201.method2657(0);
        if (!arg0) {
            this.field9193 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 174)
    public final void method1174(byte arg0) {
        ++field9197;
        if (this.field9201 != null) {
            this.field9201.method2658(0, '\u0001');
            if (arg0 > -56) {
                field9195 = 0.48155215F;
            }
            super.field6621.method2308(1, -15115);
            super.field6621.method2295((byte) 82, (class337) null);
            super.field6621.method2308(0, -15115);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)V", line = 201)
    public final void method1175(boolean arg0, int arg1) {
        ++field9194;
        if (this.field9201 != null) {
            this.field9201.method2658(arg1, '\u0000');
            super.field6621.method2308(1, -15115);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6621.field5494.method1765(8797), 0);
            OpenGL.glMatrixMode(5888);
            super.field6621.method2308(0, -15115);
            if (super.field6621.field5456 != this.field9190) {
                int var3 = super.field6621.field5456 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field9193, var3);
                    var3 += 2;
                }
                if (!this.field9188.field6360) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field9200 = (float) (super.field6621.field5456 % 4000) / 4000.0F;
                }
                this.field9190 = super.field6621.field5456;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZ)V", line = 243)
    public final void method1177(byte arg0, boolean arg1) {
        ++field9202;
        int var3 = 52 % ((arg0 - -85) / 38);
    }
}

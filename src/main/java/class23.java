import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class23 extends class592 {

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Lpm;")
    private class553 field252;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lmt;")
    private class420 field248;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "[F")
    private float[] field246;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field243 = -1;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "F")
    private float field247;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Luj;")
    private class554 field249;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Z", line = 7)
    public final boolean method30(byte arg0) {
        ++field254;
        return arg0 >= -90 ? true : true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V", line = 21)
    public final void method32(int arg0, boolean arg1) {
        ++field250;
        if (this.field249 != null) {
            this.field249.method2973(arg0 + 26498, '\u0000');
            super.field8014.method3469(1, false);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field8014.field8635.method142(43), 0);
            if (arg0 != -1) {
                this.field246 = null;
            }
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field8014.method3469(0, false);
            if (~super.field8014.field8566 != ~this.field244) {
                int var3 = super.field8014.field8566 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field246, var4);
                    var4 += 2;
                }
                if (!this.field252.field7243) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field247 = (float) (super.field8014.field8566 % 4000) / 4000.0F;
                }
                this.field244 = super.field8014.field8566;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 69)
    private final void method121(int arg0) {
        this.field249 = new class554(super.field8014, 2);
        ++field241;
        this.field249.method2971(0, arg0 + 4863);
        super.field8014.method3469(arg0, false);
        super.field8014.method3421((byte) -29, -16777216);
        super.field8014.method3462(7681, -5882, 260);
        super.field8014.method3389((byte) 109, 770, 0, 34166);
        super.field8014.method3469(0, false);
        OpenGL.glBindProgramARB(34336, this.field248.field5439);
        OpenGL.glEnable(34336);
        this.field249.method2969((byte) -117);
        this.field249.method2971(1, 4864);
        super.field8014.method3469(1, false);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field8014.method3443(0, true);
        super.field8014.method3389((byte) 88, 770, 0, 5890);
        super.field8014.method3469(0, false);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field249.method2969((byte) 69);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)V", line = 98)
    public final void method33(boolean arg0, int arg1, int arg2) {
        ++field245;
        if (this.field249 != null) {
            super.field8014.method3469(1, arg0);
            if (~(128 & arg1) != -1) {
                super.field8014.method3388((class710) null, arg0);
            } else if (~(arg2 & 1) != -2) {
                if (this.field252.field7243) {
                    super.field8014.method3388(this.field252.field7236, false);
                } else {
                    super.field8014.method3388(this.field252.field7242[0], false);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (!this.field252.field7243) {
                int var4 = super.field8014.field8566 % 4000 * 16 / 4000;
                super.field8014.method3388(this.field252.field7242[var4], false);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                super.field8014.method3388(this.field252.field7236, false);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field247, 0.0F, 0.0F, 1.0F);
            }
            super.field8014.method3469(0, false);
            if ((64 & arg1) == 0) {
                OpenGL.glGetFloatv(2899, class519.field6794, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class519.field6794, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 3 & arg1;
            if (var5 != 2) {
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

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILgq;)V", line = 166)
    public final void method35(int arg0, int arg1, class710 arg2) {
        ++field251;
        super.field8014.method3388(arg2, false);
        if (arg1 != 458752) {
            this.method32(-38, true);
        }
        super.field8014.method3443(arg0, true);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lji;Lpm;)V", line = 184)
    public class23(class622 arg0, class553 arg1) {
        super(arg0);
        this.field252 = arg1;
        if (super.field8014.field8700 && super.field8014.field8672 >= 2) {
            this.field248 = class72.method578(super.field8014, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, 0);
            if (this.field248 != null) {
                int[][] var3 = class202.method1319(256, 0.4F, 8, 64, -116, 3, 0, false, 4);
                int[][] var4 = class202.method1319(256, 0.4F, 8, 64, 28, 3, 8, false, 4);
                int var5 = 0;
                this.field246 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field246[var5++] = (float) var7[var9] / 4096.0F;
                        this.field246[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method121(1);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 231)
    public final void method29(int arg0) {
        if (arg0 != -1640) {
            field243 = 79;
        }
        ++field242;
        if (this.field249 != null) {
            this.field249.method2973(arg0 ^ -25063, '\u0001');
            super.field8014.method3469(1, false);
            super.field8014.method3388((class710) null, false);
            super.field8014.method3469(0, false);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V", line = 249)
    public final void method27(boolean arg0, byte arg1) {
        if (arg1 >= -67) {
            this.method30((byte) -101);
        }
        ++field253;
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 extends class460 {

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "Ldk;")
    private class477 field284;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "Lfb;")
    private class631 field297;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "[F")
    private float[] field285;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "[I")
    public static int[] field286 = new int[5];

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "F")
    private float field294;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "Lqda;")
    private class93 field295;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        ++field289;
        if (this.field295 != null) {
            this.field295.method688((byte) 79, '\u0000');
            super.field5744.method3126(1, arg1 + 32400);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5744.field7670.method577(9), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5744.method3126(0, -85);
            if (super.field5744.field7595 != this.field298) {
                int var3 = super.field5744.field7595 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field285, var4);
                    var4 += 2;
                }
                if (this.field284.field5943) {
                    this.field294 = (float) (super.field5744.field7595 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field298 = super.field5744.field7595;
            }
            if (arg1 != -32460) {
                this.method18(-46, -110, (byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljaa;Ldk;)V")
    public class25(class576 arg0, class477 arg1) {
        super(arg0);
        this.field284 = arg1;
        if (super.field5744.field7626 && ~super.field5744.field7717 <= -3) {
            this.field297 = class197.method1158(34336, super.field5744, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", false);
            if (this.field297 != null) {
                int[][] var3 = class420.method2330(0, 8, 0.4F, 64, 117, 3, false, 256, 4);
                int[][] var4 = class420.method2330(8, 8, 0.4F, 64, 90, 3, false, 256, 4);
                this.field285 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field285[var5++] = (float) var7[var9] / 4096.0F;
                        this.field285[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method159((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        ++field287;
        if (arg0 <= 100) {
            this.method16(-8);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
    private final void method159(byte arg0) {
        ++field291;
        this.field295 = new class93(super.field5744, 2);
        this.field295.method684(0, (byte) -124);
        super.field5744.method3126(1, -103);
        super.field5744.method3111(-15361, -16777216);
        super.field5744.method3185(260, 7681, (byte) 115);
        super.field5744.method3127(0, 770, 34166, 17111);
        super.field5744.method3126(0, -71);
        OpenGL.glBindProgramARB(34336, this.field297.field8554);
        int var2 = -35 % ((37 - arg0) / 52);
        OpenGL.glEnable(34336);
        this.field295.method690(true);
        this.field295.method684(1, (byte) -128);
        super.field5744.method3126(1, -84);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field5744.method3134(-30, 0);
        super.field5744.method3127(0, 770, 5890, 17111);
        super.field5744.method3126(0, -128);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field295.method690(true);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method160(byte arg0, int arg1, String arg2) {
        ++field290;
        if (arg0 <= 22) {
            field286 = null;
        }
        class243 var3 = class546.method2926(arg1, 2, true);
        var3.method1457(27);
        var3.field3139 = arg2;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        ++field288;
        if (this.field295 != null) {
            this.field295.method688((byte) 80, '\u0001');
            super.field5744.method3126(1, -110);
            super.field5744.method3194((byte) 75, (class185) null);
            super.field5744.method3126(arg0, arg0 ^ -29);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        ++field292;
        super.field5744.method3194((byte) 75, arg2);
        super.field5744.method3134(106, arg0);
        int var4 = -96 % ((25 - arg1) / 59);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        if (arg0 != -24566) {
            return true;
        } else {
            ++field293;
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
    public static void method161(int arg0) {
        if (arg0 != -4) {
            field286 = null;
        }
        field286 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        ++field296;
        if (this.field295 != null) {
            super.field5744.method3126(1, -43);
            if ((128 & arg0) == 0) {
                if ((arg1 & 1) != 1) {
                    if (!this.field284.field5943) {
                        super.field5744.method3194((byte) 75, this.field284.field5937[0]);
                    } else {
                        super.field5744.method3194((byte) 75, this.field284.field5935);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (this.field284.field5943) {
                    super.field5744.method3194((byte) 75, this.field284.field5935);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field294, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field5744.field7595 % 4000 * 16 / 4000;
                    super.field5744.method3194((byte) 75, this.field284.field5937[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field5744.method3194((byte) 75, (class185) null);
            }
            super.field5744.method3126(0, -116);
            if ((64 & arg0) == 0) {
                OpenGL.glGetFloatv(2899, class216.field2528, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class216.field2528, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            if (arg2 < -110) {
                int var5 = arg0 & 3;
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
}

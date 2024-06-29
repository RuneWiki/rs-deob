import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class430 extends class83 {

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "Lud;")
    private class123 field6100;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "Lvk;")
    private class454 field6106;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "[F")
    private float[] field6104;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "Lwd;")
    public static class357 field6099 = new class357(1, 2, 2, 0);

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
    public static int field6109 = -1;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "F")
    private float field6105;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    private int field6103;

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "Leaa;")
    private class43 field6101;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "Lf;")
    public static class534 field6107;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method440(byte arg0) {
        if (arg0 >= -100) {
            this.field6105 = -0.69260097F;
        }
        ++field6110;
        return true;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZI)V", line = 14)
    public final void method439(boolean arg0, int arg1) {
        ++field6097;
        if (arg1 > -123) {
            this.field6104 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IILav;)V", line = 25)
    public final void method441(int arg0, int arg1, class325 arg2) {
        super.field855.method2396((byte) 36, arg2);
        ++field6102;
        super.field855.method2421(arg1, 1);
        if (arg0 != -29092) {
            this.field6105 = 0.23667705F;
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V", line = 37)
    public final void method438(int arg0) {
        ++field6098;
        if (this.field6101 != null) {
            this.field6101.method222('\u0001', (byte) -47);
            super.field855.method2431((byte) -52, 1);
            if (arg0 != 18610) {
                this.method433((byte) 119, false);
            }
            super.field855.method2396((byte) 36, (class325) null);
            super.field855.method2431((byte) -54, 0);
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lvj;Lud;)V", line = 58)
    public class430(class422 arg0, class123 arg1) {
        super(arg0);
        this.field6100 = arg1;
        if (super.field855.field5938 && ~super.field855.field5913 <= -3) {
            this.field6106 = class563.method3194((byte) 127, 34336, super.field855, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field6106 != null) {
                int[][] var3 = class247.method1455(3, 4, false, 64, 256, 4, 0, (byte) 90, 0.4F);
                int[][] var4 = class247.method1455(3, 4, false, 64, 256, 4, 8, (byte) 115, 0.4F);
                this.field6104 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field6104[var5++] = (float) var7[var9] / 4096.0F;
                        this.field6104[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2476(-21733);
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BZ)V", line = 105)
    public final void method433(byte arg0, boolean arg1) {
        if (arg0 == -48) {
            ++field6096;
            if (this.field6101 != null) {
                this.field6101.method222('\u0000', (byte) -71);
                super.field855.method2431((byte) -103, 1);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field855.field5857.method1128(-9586), 0);
                OpenGL.glMatrixMode(5888);
                super.field855.method2431((byte) -72, 0);
                if (super.field855.field5817 != this.field6103) {
                    int var3 = super.field855.field5817 % 5000 * 128 / 5000;
                    for (int var4 = 0; var4 < 64; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field6104, var3);
                        var3 += 2;
                    }
                    if (!this.field6100.field1373) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        this.field6105 = (float) (super.field855.field5817 % 4000) / 4000.0F;
                    }
                    this.field6103 = super.field855.field5817;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(FBFF)I", line = 151)
    public static final int method2475(float arg0, byte arg1, float arg2, float arg3) {
        if (arg1 > -71) {
            return 109;
        } else {
            ++field6108;
            float var4 = arg2 < 0.0F ? -arg2 : arg2;
            float var5 = !(arg3 < 0.0F) ? arg3 : -arg3;
            float var6 = !(arg0 < 0.0F) ? arg0 : -arg0;
            if (var5 > var4 && var6 < var5) {
                return !(arg3 > 0.0F) ? 1 : 0;
            } else if (var4 < var6 && var5 < var6) {
                return arg0 > 0.0F ? 2 : 3;
            } else {
                return !(arg2 > 0.0F) ? 5 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)V", line = 198)
    private final void method2476(int arg0) {
        this.field6101 = new class43(super.field855, 2);
        ++field6094;
        this.field6101.method219(arg0 ^ -2960, 0);
        super.field855.method2431((byte) -75, 1);
        super.field855.method2379(true, -16777216);
        super.field855.method2412((byte) -49, 260, 7681);
        super.field855.method2371(770, 0, -75, 34166);
        super.field855.method2431((byte) -75, 0);
        OpenGL.glBindProgramARB(34336, this.field6106.field6490);
        OpenGL.glEnable(34336);
        this.field6101.method223(1);
        this.field6101.method219(arg0 + 46160, 1);
        super.field855.method2431((byte) -93, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field855.method2421(0, 1);
        super.field855.method2371(770, 0, -101, 5890);
        super.field855.method2431((byte) -62, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        if (arg0 == -21733) {
            this.field6101.method223(arg0 + 21734);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V", line = 234)
    public final void method435(int arg0, int arg1, int arg2) {
        ++field6095;
        if (this.field6101 != null) {
            super.field855.method2431((byte) -65, 1);
            int var4 = -55 % ((arg2 - -60) / 33);
            if (~(128 & arg1) == -1) {
                if ((1 & arg0) == 1) {
                    if (this.field6100.field1373) {
                        super.field855.method2396((byte) 36, this.field6100.field1372);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field6105, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var5 = super.field855.field5817 % 4000 * 16 / 4000;
                        super.field855.method2396((byte) 36, this.field6100.field1374[var5]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (this.field6100.field1373) {
                        super.field855.method2396((byte) 36, this.field6100.field1372);
                    } else {
                        super.field855.method2396((byte) 36, this.field6100.field1374[0]);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field855.method2396((byte) 36, (class325) null);
            }
            super.field855.method2431((byte) -115, 0);
            if (~(arg1 & 64) == -1) {
                OpenGL.glGetFloatv(2899, class414.field5559, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class414.field5559, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var6 = arg1 & 3;
            if (~var6 != -3) {
                if (var6 != 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)V", line = 301)
    public static void method2477(int arg0) {
        field6099 = null;
        field6107 = null;
        if (arg0 != 64) {
            method2477(-76);
        }
    }
}

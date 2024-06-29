import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class349 extends class182 {

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lica;")
    private class215 field4646;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lpc;")
    private class35 field4647;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[F")
    private float[] field4645;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "F")
    private float field4642;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    private int field4643;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lcl;")
    private class75 field4650;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        if (arg0 != 26813) {
            this.field4645 = null;
        }
        ++field4644;
        if (this.field4650 != null) {
            this.field4650.method412('\u0001', -81);
            super.field2540.method2625(arg0 ^ 10229, 1);
            super.field2540.method2627(arg0 + -26709, (class262) null);
            super.field2540.method2625(20296, 0);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    private final void method2069(boolean arg0) {
        this.field4650 = new class75(super.field2540, 2);
        ++field4653;
        if (!arg0) {
            this.field4650 = null;
        }
        this.field4650.method414((byte) 126, 0);
        super.field2540.method2625(20296, 1);
        super.field2540.method2624((byte) 26, -16777216);
        super.field2540.method2669(7681, 51, 260);
        super.field2540.method2637(770, -513, 0, 34166);
        super.field2540.method2625(20296, 0);
        OpenGL.glBindProgramARB(34336, this.field4647.field498);
        OpenGL.glEnable(34336);
        this.field4650.method415(false);
        this.field4650.method414((byte) 126, 1);
        super.field2540.method2625(20296, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2540.method2650((byte) -118, 0);
        super.field2540.method2637(770, -513, 0, 5890);
        super.field2540.method2625(20296, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field4650.method415(false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILvfa;B)V")
    public final void method83(int arg0, class262 arg1, byte arg2) {
        if (arg2 > 87) {
            ++field4648;
            super.field2540.method2627(26, arg1);
            super.field2540.method2650((byte) -121, arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZ)V")
    public final void method84(boolean arg0, boolean arg1) {
        ++field4649;
        if (this.field4650 != null) {
            this.field4650.method412('\u0000', -119);
            super.field2540.method2625(20296, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2540.field6432.method360(1), 0);
            OpenGL.glMatrixMode(5888);
            if (!arg0) {
                this.method81(-16, 45, -4);
            }
            super.field2540.method2625(20296, 0);
            if (~super.field2540.field6393 != ~this.field4643) {
                int var3 = super.field2540.field6393 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field4645, var3);
                    var3 += 2;
                }
                if (this.field4646.field2829) {
                    this.field4642 = (float) (super.field2540.field6393 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field4643 = super.field2540.field6393;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIFIIII[FIFIFI)V")
    public static final void method2070(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, int arg10, float arg11, int arg12) {
        ++field4655;
        int var13 = arg0 - arg10;
        int var14 = arg8 - arg4;
        int var15 = arg1 - arg6;
        float var16 = arg7[2] * (float) var14 + arg7[0] * (float) var15 + arg7[1] * (float) var13;
        if (arg5 != -30816) {
            method2070(83, -125, -0.52391255F, -63, -104, -90, -122, (float[]) null, 82, 0.17866938F, -120, 0.64200044F, 101);
        }
        float var17 = arg7[5] * (float) var14 + arg7[4] * (float) var13 + arg7[3] * (float) var15;
        float var18 = arg7[8] * (float) var14 + arg7[7] * (float) var13 + arg7[6] * (float) var15;
        float var19;
        float var20;
        if (~arg12 != -1) {
            if (~arg12 == -2) {
                var19 = arg9 + var16 + 0.5F;
                var20 = arg11 + var18 + 0.5F;
            } else if (~arg12 == -3) {
                var20 = -var17 + arg2 + 0.5F;
                var19 = -var16 + arg9 + 0.5F;
            } else if (arg12 == 3) {
                var20 = -var17 + arg2 + 0.5F;
                var19 = arg9 + var16 + 0.5F;
            } else if (~arg12 != -5) {
                var20 = -var17 + arg2 + 0.5F;
                var19 = -var18 + arg11 + 0.5F;
            } else {
                var19 = arg11 + var18 + 0.5F;
                var20 = -var17 + arg2 + 0.5F;
            }
        } else {
            var19 = arg9 + var16 + 0.5F;
            var20 = -var18 + arg11 + 0.5F;
        }
        if (~arg3 == -2) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (~arg3 != -3) {
            if (arg3 == 3) {
                float var22 = var19;
                var19 = var20;
                var20 = -var22;
            }
        } else {
            var19 = -var19;
            var20 = -var20;
        }
        class156.field2186 = var19;
        class649.field8971 = var20;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lag;Lica;)V")
    public class349(class469 arg0, class215 arg1) {
        super(arg0);
        this.field4646 = arg1;
        if (super.field2540.field6492 && ~super.field2540.field6503 <= -3) {
            this.field4647 = class457.method2570(false, 34336, super.field2540, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field4647 != null) {
                int[][] var3 = class360.method2109(0.4F, 0, 4, -45, 3, 4, false, 256, 64);
                int[][] var4 = class360.method2109(0.4F, 8, 4, -96, 3, 4, false, 256, 64);
                this.field4645 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field4645[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4645[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2069(true);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)Z")
    public final boolean method77(byte arg0) {
        if (arg0 != -96) {
            return false;
        } else {
            ++field4641;
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
    public final void method79(boolean arg0, int arg1) {
        ++field4654;
        if (arg1 >= -21) {
            this.method2069(true);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method2071(int arg0) {
        class485.field6740 = -1;
        class28.field406 = null;
        ++field4651;
        if (arg0 == -31428) {
            ;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method81(int arg0, int arg1, int arg2) {
        ++field4652;
        if (arg0 == 2) {
            if (this.field4650 != null) {
                super.field2540.method2625(20296, 1);
                if ((arg2 & 128) != 0) {
                    super.field2540.method2627(112, (class262) null);
                } else if ((1 & arg1) == 1) {
                    if (!this.field4646.field2829) {
                        int var4 = super.field2540.field6393 % 4000 * 16 / 4000;
                        super.field2540.method2627(57, this.field4646.field2832[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field2540.method2627(82, this.field4646.field2831);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field4642, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (!this.field4646.field2829) {
                        super.field2540.method2627(92, this.field4646.field2832[0]);
                    } else {
                        super.field2540.method2627(55, this.field4646.field2831);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                super.field2540.method2625(20296, 0);
                if ((64 & arg2) != 0) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glGetFloatv(2899, class151.field2073, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class151.field2073, 0);
                }
                int var5 = arg2 & 3;
                if (~var5 == -3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (var5 == 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class599 extends class489 {

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Lfaa;")
    private class452 field8331;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lkn;")
    private class327 field8332;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[F")
    private float[] field8325;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "F")
    private float field8327;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    private int field8326;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lbp;")
    private class458 field8324;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLkp;I)V")
    public final void method12(byte arg0, class411 arg1, int arg2) {
        super.field6956.method2120(-1, arg1);
        ++field8318;
        super.field6956.method2153(103, arg2);
        if (arg0 > -66) {
            this.field8332 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        ++field8328;
        if (this.field8324 != null) {
            this.field8324.method2682('\u0001', 113);
            super.field6956.method2135(1, arg0 ^ -5027);
            super.field6956.method2120(-1, (class411) null);
            super.field6956.method2135(arg0, arg0 ^ -5027);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        if (arg0 <= 95) {
            this.field8332 = null;
        }
        ++field8323;
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    private final void method3303(boolean arg0) {
        this.field8324 = new class458(super.field6956, 2);
        ++field8329;
        this.field8324.method2686(0, (byte) -68);
        super.field6956.method2135(1, -5027);
        super.field6956.method2118(-16777216, -15182);
        super.field6956.method2165((byte) 74, 7681, 260);
        super.field6956.method2189(34166, true, 0, 770);
        super.field6956.method2135(0, -5027);
        OpenGL.glBindProgramARB(34336, this.field8332.field4177);
        OpenGL.glEnable(34336);
        this.field8324.method2685(0);
        if (arg0) {
            this.method6(11);
        }
        this.field8324.method2686(1, (byte) -48);
        super.field6956.method2135(1, -5027);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field6956.method2153(105, 0);
        super.field6956.method2189(5890, true, 0, 770);
        super.field6956.method2135(0, -5027);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field8324.method2685(0);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IZ)V")
    public final void method9(int arg0, boolean arg1) {
        if (arg0 != -5) {
            this.method12((byte) 39, (class411) null, -108);
        }
        ++field8321;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public final void method8(int arg0, int arg1, int arg2) {
        ++field8330;
        if (this.field8324 != null) {
            super.field6956.method2135(1, -5027);
            if ((128 & arg1) == 0) {
                if ((1 & arg0) != 1) {
                    if (!this.field8331.field6337) {
                        super.field6956.method2120(-1, this.field8331.field6334[0]);
                    } else {
                        super.field6956.method2120(-1, this.field8331.field6341);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field8331.field6337) {
                    int var4 = super.field6956.field4961 % 4000 * 16 / 4000;
                    super.field6956.method2120(arg2 ^ -41, this.field8331.field6334[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field6956.method2120(arg2 ^ -41, this.field8331.field6341);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field8327, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field6956.method2120(-1, (class411) null);
            }
            if (arg2 != 40) {
                this.field8326 = 94;
            }
            super.field6956.method2135(0, -5027);
            if (~(64 & arg1) == -1) {
                class680.field9232[1] = super.field6956.field5052 * super.field6956.field5019;
                class680.field9232[2] = super.field6956.field5052 * super.field6956.field5018;
                class680.field9232[0] = super.field6956.field5102 * super.field6956.field5052;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class680.field9232, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
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

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Leq;Lfaa;)V")
    public class599(class357 arg0, class452 arg1) {
        super(arg0);
        this.field8331 = arg1;
        if (super.field6956.field5077 && super.field6956.field5006 >= 2) {
            this.field8332 = class422.method2503(34336, (byte) 76, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field6956);
            if (this.field8332 != null) {
                int[][] var3 = class233.method1471(256, 4, false, 0.4F, 3, 0, 4, 64, false);
                int[][] var4 = class233.method1471(256, 4, false, 0.4F, 3, 8, 4, 64, false);
                int var5 = 0;
                this.field8325 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field8325[var5++] = (float) var7[var9] / 4096.0F;
                        this.field8325[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3303(false);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method3304(int arg0) {
        ++field8319;
        if (class198.field2542 == null) {
            class198.field2542 = new int[65536];
            double var1 = 0.03D * Math.random() - 0.015D + 0.7D;
            int var3 = 0;
            if (arg0 > -77) {
                method3304(-70);
            }
            while (var3 < 65536) {
                double var4 = (double) ((var3 & 64850) >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                double var8 = (double) (var3 & 127) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (!(var20 * 6.0D < 1.0D)) {
                        if (var20 * 2.0D < 1.0D) {
                            var10 = var16;
                        } else if (var20 * 3.0D < 2.0D) {
                            var10 = (var16 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                        } else {
                            var10 = var18;
                        }
                    } else {
                        var10 = (-var18 + var16) * 6.0D * var20 + var18;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (var16 - var18) * 6.0D * var4 + var18;
                    } else if (!(var4 * 2.0D < 1.0D)) {
                        if (!(var4 * 3.0D < 2.0D)) {
                            var12 = var18;
                        } else {
                            var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                        }
                    } else {
                        var12 = var16;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (var24 * 2.0D < 1.0D) {
                            var14 = var16;
                        } else if (!(var24 * 3.0D < 2.0D)) {
                            var14 = var18;
                        } else {
                            var14 = (-var18 + var16) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                        }
                    } else {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + (var33 << 8) - -var34;
                class198.field2542[var3] = var35;
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
    public final void method10(int arg0, boolean arg1) {
        ++field8322;
        if (this.field8324 != null) {
            this.field8324.method2682('\u0000', 109);
            int var3 = -38 % ((-43 - arg0) / 37);
            super.field6956.method2135(1, -5027);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6956.field4992.method3847(1), 0);
            OpenGL.glMatrixMode(5888);
            super.field6956.method2135(0, -5027);
            if (super.field6956.field4961 != this.field8326) {
                int var4 = super.field6956.field4961 % 5000 * 128 / 5000;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field8325, var4);
                    var4 += 2;
                }
                if (!this.field8331.field6337) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field8327 = (float) (super.field6956.field4961 % 4000) / 4000.0F;
                }
                this.field8326 = super.field6956.field4961;
            }
        }
    }
}

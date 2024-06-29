import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class347 extends class249 {

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "Ljga;")
    private class718 field5001;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "Lqi;")
    private class569 field5010;

    @OriginalMember(owner = "client!gha", name = "v", descriptor = "[F")
    private float[] field5017;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "Lada;")
    public static class164 field5004 = new class164();

    @OriginalMember(owner = "client!gha", name = "s", descriptor = "F")
    private float field5014;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!gha", name = "t", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!gha", name = "u", descriptor = "I")
    private int field5016;

    @OriginalMember(owner = "client!gha", name = "w", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!gha", name = "x", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!gha", name = "y", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "J")
    public static long field5009;

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "Ljr;")
    private class112 field5012;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZ)V")
    public final void method610(int arg0, boolean arg1) {
        ++field5006;
        if (this.field5012 != null) {
            this.field5012.method838('\u0000', true);
            super.field3613.method1024(arg0, (byte) -11);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3613.field2202.method3520((byte) -120), 0);
            OpenGL.glMatrixMode(5888);
            super.field3613.method1024(0, (byte) -11);
            if (~super.field3613.field2167 != ~this.field5016) {
                int var3 = super.field3613.field2167 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field5017, var3);
                    var3 += 2;
                }
                if (!this.field5001.field10085) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field5014 = (float) (super.field3613.field2167 % 4000) / 4000.0F;
                }
                this.field5016 = super.field3613.field2167;
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZZ)V")
    public final void method608(boolean arg0, boolean arg1) {
        ++field5008;
        if (!arg0) {
            field5020 = 82;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
    public static void method2190(byte arg0) {
        if (arg0 < 64) {
            method2190((byte) 7);
        }
        field5004 = null;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lme;ZI)V")
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        ++field5013;
        if (!arg1) {
            field5004 = null;
        }
        super.field3613.method1088(arg0, -27749);
        super.field3613.method1066(arg2, 260);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V")
    public final void method607(int arg0, int arg1, int arg2) {
        ++field5007;
        if (this.field5012 != null) {
            if (arg1 != -13582) {
                field5018 = -13;
            }
            super.field3613.method1024(1, (byte) -11);
            if ((128 & arg0) == 0) {
                if ((arg2 & 1) == 1) {
                    if (!this.field5001.field10085) {
                        int var4 = super.field3613.field2167 % 4000 * 16 / 4000;
                        super.field3613.method1088(this.field5001.field10091[var4], -27749);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field3613.method1088(this.field5001.field10092, -27749);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field5014, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (this.field5001.field10085) {
                        super.field3613.method1088(this.field5001.field10092, -27749);
                    } else {
                        super.field3613.method1088(this.field5001.field10091[0], -27749);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field3613.method1088((class195) null, -27749);
            }
            super.field3613.method1024(0, (byte) -11);
            if (~(64 & arg0) == -1) {
                class264.field3775[1] = super.field3613.field2279 * super.field3613.field2259;
                class264.field3775[0] = super.field3613.field2277 * super.field3613.field2259;
                class264.field3775[2] = super.field3613.field2259 * super.field3613.field2253;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class264.field3775, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg0 & 3;
            if (~var5 != -3) {
                if (~var5 != -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(III)V")
    public static final void method2191(int arg0, int arg1, int arg2) {
        class164.field2604 = arg2;
        if (arg0 != 0) {
            field5020 = 92;
        }
        ++field5015;
        class443.field6590 = arg1;
        if (~class22.field234 != -1) {
            if (~class22.field234 != -2) {
                if (~class22.field234 == -3) {
                    class589.field8349 = class164.field2604;
                    class519.field7421 = class443.field6590;
                    return;
                }
            } else {
                class627.field8770 = class164.field2604 / class437.field6477 + class9.field126 + 2;
                class73.field1021 = class443.field6590 / class634.field8902 + 2 + class656.field9195;
                class519.field7421 = class73.field1021 * class634.field8902;
                class589.field8349 = class627.field8770 * class437.field6477;
                class298.field4224 = -class443.field6590 + class519.field7421 >> 1;
                class250.field3617 = -class164.field2604 + class589.field8349 >> 1;
            }
        } else {
            class589.field8349 = class250.field3617 * 2 + class164.field2604;
            class519.field7421 = class443.field6590 - -(class298.field4224 * 2);
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)V")
    public final void method611(int arg0) {
        ++field5003;
        if (this.field5012 != null) {
            this.field5012.method838('\u0001', true);
            if (arg0 != 2) {
                this.method605(86);
            }
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088((class195) null, -27749);
            super.field3613.method1024(0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lwh;Ljga;)V")
    public class347(class148 arg0, class718 arg1) {
        super(arg0);
        this.field5001 = arg1;
        if (super.field3613.field2300 && super.field3613.field2239 >= 2) {
            this.field5010 = class228.method1538("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 71, 34336, super.field3613);
            if (this.field5010 != null) {
                int[][] var3 = class645.method3729(0, 4, 64, 3, false, false, 4, 256, 0.4F);
                int[][] var4 = class645.method3729(8, 4, 64, 3, false, false, 4, 256, 0.4F);
                int var5 = 0;
                this.field5017 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field5017[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5017[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2193((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lrg;B)Lkba;")
    public static final class107 method2192(class645 arg0, byte arg1) {
        ++field5011;
        class739 var2 = class600.method3490((byte) 126, arg0);
        if (arg1 <= 26) {
            field5020 = -66;
        }
        int var3 = arg0.method3720(-19541);
        int var4 = arg0.method3720(-19541);
        return new class107(var2.field10372, var2.field10360, var2.field10369, var2.field10365, var2.field10371, var2.field10364, var2.field10359, var2.field10368, var2.field10358, var3, var4);
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(B)V")
    private final void method2193(byte arg0) {
        ++field5019;
        this.field5012 = new class112(super.field3613, 2);
        this.field5012.method841(44, 0);
        super.field3613.method1024(1, (byte) -11);
        super.field3613.method1054(3, -16777216);
        super.field3613.method1043((byte) 90, 7681, 260);
        super.field3613.method1086(34166, 0, 770, 104);
        super.field3613.method1024(0, (byte) -11);
        OpenGL.glBindProgramARB(34336, this.field5010.field8063);
        OpenGL.glEnable(34336);
        this.field5012.method840(117);
        this.field5012.method841(-98, 1);
        super.field3613.method1024(1, (byte) -11);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (arg0 > -98) {
            method2192((class645) null, (byte) -110);
        }
        super.field3613.method1066(0, 260);
        super.field3613.method1086(5890, 0, 770, 71);
        super.field3613.method1024(0, (byte) -11);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field5012.method840(-107);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        ++field5002;
        if (arg0 != 2) {
            this.method611(-98);
        }
        return true;
    }
}

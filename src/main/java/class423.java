import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class423 extends class345 {

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "Llha;")
    private class626 field5379;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "Ljq;")
    private class514 field5381;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "[F")
    private float[] field5367;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "F")
    private float field5380;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    private int field5369;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "Lvh;")
    private class363 field5376;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method2354(int arg0, byte arg1) {
        ++field5375;
        if (class525.method3039(4, arg0)) {
            class288[] var2 = class218.field2938[arg0];
            if (arg1 != -58) {
                field5382 = -43;
            }
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class288 var4 = var2[var3];
                if (var4 != null) {
                    var4.field3616 = 1;
                    var4.field3748 = 0;
                    var4.field3776 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lbi;Llha;)V", line = 41)
    public class423(class483 arg0, class626 arg1) {
        super(arg0);
        this.field5379 = arg1;
        if (super.field4357.field6827 && super.field4357.field6890 >= 2) {
            this.field5381 = class22.method155("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 6672, 34336, super.field4357);
            if (this.field5381 != null) {
                int[][] var3 = class121.method928(64, false, 4, 256, 3, 0, 4, 0.4F, -2);
                int[][] var4 = class121.method928(64, false, 4, 256, 3, 8, 4, 0.4F, -2);
                this.field5367 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field5367[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5367[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2355(770);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 88)
    public final void method41(byte arg0) {
        ++field5372;
        if (this.field5376 != null) {
            this.field5376.method2099('\u0001', -118);
            int var2 = -67 / ((arg0 - 60) / 60);
            super.field4357.method2847(1, false);
            super.field4357.method2850(-79, (class695) null);
            super.field4357.method2847(0, false);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V", line = 106)
    public final void method40(boolean arg0, int arg1) {
        if (arg1 != 50560) {
            this.field5367 = null;
        }
        ++field5371;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZB)V", line = 116)
    public final void method34(boolean arg0, byte arg1) {
        ++field5377;
        if (this.field5376 != null) {
            if (arg1 != -82) {
                this.field5376 = null;
            }
            this.field5376.method2099('\u0000', -115);
            super.field4357.method2847(1, false);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field4357.field6811.method605(-117), 0);
            OpenGL.glMatrixMode(5888);
            super.field4357.method2847(0, false);
            if (super.field4357.field6780 != this.field5369) {
                int var3 = super.field4357.field6780 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field5367, var3);
                    var3 += 2;
                }
                if (!this.field5379.field8605) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field5380 = (float) (super.field4357.field6780 % 4000) / 4000.0F;
                }
                this.field5369 = super.field4357.field6780;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V", line = 163)
    private final void method2355(int arg0) {
        ++field5368;
        this.field5376 = new class363(super.field4357, 2);
        this.field5376.method2097(0, -86);
        super.field4357.method2847(1, false);
        super.field4357.method2822(16711680, -16777216);
        super.field4357.method2799(-27874, 260, 7681);
        super.field4357.method2788(770, 34166, false, 0);
        super.field4357.method2847(0, false);
        OpenGL.glBindProgramARB(34336, this.field5381.field7210);
        OpenGL.glEnable(34336);
        this.field5376.method2100(arg0 + -879);
        this.field5376.method2097(1, -106);
        super.field4357.method2847(1, false);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field4357.method2800(0, arg0 + -858);
        super.field4357.method2788(arg0, 5890, false, 0);
        super.field4357.method2847(0, false);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field5376.method2100(-95);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)I", line = 197)
    public static final int method2356(int arg0, int arg1) {
        ++field5374;
        int var2 = 0;
        if (arg0 < 0 || ~arg0 <= -65537) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (~arg0 <= -5) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (arg0 >= arg1) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZII)V", line = 243)
    public final void method37(boolean arg0, int arg1, int arg2) {
        ++field5373;
        if (this.field5376 != null) {
            super.field4357.method2847(1, false);
            if ((arg2 & 128) != 0) {
                super.field4357.method2850(111, (class695) null);
            } else if (~(1 & arg1) == -2) {
                if (!this.field5379.field8605) {
                    int var4 = super.field4357.field6780 % 4000 * 16 / 4000;
                    super.field4357.method2850(-89, this.field5379.field8607[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field4357.method2850(-31, this.field5379.field8608);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field5380, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (!this.field5379.field8605) {
                    super.field4357.method2850(-23, this.field5379.field8607[0]);
                } else {
                    super.field4357.method2850(98, this.field5379.field8608);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field4357.method2847(0, false);
            if ((64 & arg2) == 0) {
                class562.field7911[1] = super.field4357.field6899 * super.field4357.field6835;
                class562.field7911[2] = super.field4357.field6835 * super.field4357.field6816;
                class562.field7911[0] = super.field4357.field6892 * super.field4357.field6835;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class562.field7911, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            if (!arg0) {
                this.method41((byte) 27);
            }
            int var5 = arg2 & 3;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILcj;)V", line = 315)
    public final void method36(int arg0, int arg1, class695 arg2) {
        super.field4357.method2850(102, arg2);
        if (arg0 == 50560) {
            ++field5378;
            super.field4357.method2800(arg1, arg0 + -50532);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z", line = 329)
    public final boolean method38(int arg0) {
        if (arg0 != 50560) {
            return true;
        } else {
            ++field5370;
            return true;
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class428 extends class387 {

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "Llba;")
    private class550 field5899;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "Lrd;")
    private class341 field5911;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "[F")
    private float[] field5909;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "Lhda;")
    public static class752 field5898 = new class752(45, -2);

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
    public static int field5912 = 0;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "F")
    private float field5901;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "I")
    private int field5904;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "Lvi;")
    private class540 field5896;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BILiga;)V")
    public final void method638(byte arg0, int arg1, class460 arg2) {
        super.field5405.method3639(-2, arg2);
        ++field5903;
        if (arg0 < 53) {
            field5912 = -75;
        }
        super.field5405.method3631((byte) 124, arg1);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZB)V")
    public final void method640(boolean arg0, byte arg1) {
        ++field5906;
        if (this.field5896 != null) {
            if (arg1 >= 1) {
                this.field5896.method3013((byte) 45, '\u0000');
                super.field5405.method3630(true, 1);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field5405.field8984.method1786((byte) -111), 0);
                OpenGL.glMatrixMode(5888);
                super.field5405.method3630(true, 0);
                if (super.field5405.field8949 != this.field5904) {
                    int var3 = super.field5405.field8949 % 5000 * 128 / 5000;
                    for (int var4 = 0; var4 < 64; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field5909, var3);
                        var3 += 2;
                    }
                    if (this.field5899.field7264) {
                        this.field5901 = (float) (super.field5405.field8949 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field5904 = super.field5405.field8949;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        ++field5902;
        int var4 = -16 % ((74 - arg2) / 36);
        if (this.field5896 != null) {
            super.field5405.method3630(true, 1);
            if ((128 & arg0) == 0) {
                if (~(arg1 & 1) == -2) {
                    if (this.field5899.field7264) {
                        super.field5405.method3639(-2, this.field5899.field7265);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field5901, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var5 = super.field5405.field8949 % 4000 * 16 / 4000;
                        super.field5405.method3639(-2, this.field5899.field7266[var5]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (this.field5899.field7264) {
                        super.field5405.method3639(-2, this.field5899.field7265);
                    } else {
                        super.field5405.method3639(-2, this.field5899.field7266[0]);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field5405.method3639(-2, (class460) null);
            }
            super.field5405.method3630(true, 0);
            if (~(arg0 & 64) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class696.field9699[1] = super.field5405.field9027 * super.field5405.field9016;
                class696.field9699[0] = super.field5405.field9033 * super.field5405.field9027;
                class696.field9699[2] = super.field5405.field9042 * super.field5405.field9027;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class696.field9699, 0);
            }
            int var6 = 3 & arg0;
            if (var6 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var6 != -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(Z)V")
    public static final void method2469(boolean arg0) {
        ++field5900;
        for (class107 var1 = (class107) class1.field12.method2144(arg0); var1 != null; var1 = (class107) class1.field12.method2146(false)) {
            if (!var1.field1455) {
                class501.method2820(8718, var1.field1459);
            } else {
                var1.field1455 = false;
            }
        }
        if (!arg0) {
            method2473((byte) 1);
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lrda;Llba;)V")
    public class428(class663 arg0, class550 arg1) {
        super(arg0);
        this.field5899 = arg1;
        if (super.field5405.field9020 && ~super.field5405.field9037 <= -3) {
            this.field5911 = class325.method1962((byte) 85, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field5405, 34336);
            if (this.field5911 != null) {
                int[][] var3 = class435.method2499((byte) -81, 64, 4, false, 0.4F, 4, 3, 256, 0);
                int[][] var4 = class435.method2499((byte) -81, 64, 4, false, 0.4F, 4, 3, 256, 8);
                int var5 = 0;
                this.field5909 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field5909[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5909[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2471(true);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(Z)V")
    public static void method2470(boolean arg0) {
        if (arg0) {
            method2473((byte) -76);
        }
        field5898 = null;
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(Z)V")
    private final void method2471(boolean arg0) {
        ++field5910;
        this.field5896 = new class540(super.field5405, 2);
        this.field5896.method3012(-98, 0);
        super.field5405.method3630(arg0, 1);
        super.field5405.method3651(-62, -16777216);
        super.field5405.method3608(-38, 7681, 260);
        super.field5405.method3599(0, 770, (byte) 37, 34166);
        super.field5405.method3630(arg0, 0);
        OpenGL.glBindProgramARB(34336, this.field5911.field4814);
        OpenGL.glEnable(34336);
        this.field5896.method3015((byte) 26);
        this.field5896.method3012(-112, 1);
        super.field5405.method3630(true, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field5405.method3631((byte) 125, 0);
        super.field5405.method3599(0, 770, (byte) 37, 5890);
        super.field5405.method3630(arg0, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field5896.method3015((byte) 26);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)[Llu;")
    public static final class714[] method2472(byte arg0) {
        if (arg0 != 120) {
            field5898 = null;
        }
        ++field5897;
        return new class714[] { class290.field4142, class163.field2466, class276.field3851 };
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        if (arg0 != -16777216) {
            return false;
        } else {
            ++field5913;
            return true;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BZ)V")
    public final void method639(byte arg0, boolean arg1) {
        if (arg0 < -123) {
            ++field5907;
        }
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V")
    public static final void method2473(byte arg0) {
        int var1 = 0;
        if (arg0 != -89) {
            field5912 = -124;
        }
        while (var1 < class501.field6728) {
            class121 var2 = class503.field6751[var1];
            if (~var2.field1930 == -4) {
                if (var2.field1939 == null) {
                    var2.field1934 = Integer.MIN_VALUE;
                } else {
                    class603.field7927.method1612(var2.field1939);
                }
            }
            ++var1;
        }
        ++field5905;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V")
    public final void method644(boolean arg0) {
        ++field5908;
        if (this.field5896 != null) {
            this.field5896.method3013((byte) 77, '\u0001');
            super.field5405.method3630(!arg0, 1);
            if (arg0) {
                this.field5909 = null;
            }
            super.field5405.method3639(-2, (class460) null);
            super.field5405.method3630(true, 0);
        }
    }
}

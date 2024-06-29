import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class233 extends class27 {

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lud;")
    private class33 field3222;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lnj;")
    private class222 field3224;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[F")
    private float[] field3227;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field3216 = 0;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
    public static int[] field3217 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "F")
    private float field3221;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Lqm;")
    private class129 field3230;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lnfa;")
    public static class632 field3228;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1470(int arg0, int arg1, String[] arg2, int arg3) {
        ++field3225;
        if (arg3 == 0) {
            return "";
        } else {
            if (arg1 != 64) {
                field3216 = -8;
            }
            if (~arg3 == -2) {
                String var4 = arg2[arg0];
                return var4 == null ? "null" : var4.toString();
            } else {
                int var5 = arg0 + arg3;
                int var6 = 0;
                for (int var7 = arg0; ~var5 < ~var7; ++var7) {
                    String var11 = arg2[var7];
                    if (var11 == null) {
                        var6 += 4;
                    } else {
                        var6 += var11.length();
                    }
                }
                StringBuffer var8 = new StringBuffer(var6);
                for (int var9 = arg0; ~var9 > ~var5; ++var9) {
                    String var10 = arg2[var9];
                    if (var10 != null) {
                        var8.append(var10);
                    } else {
                        var8.append("null");
                    }
                }
                return var8.toString();
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V")
    public final void method263(boolean arg0, int arg1) {
        ++field3231;
        if (arg1 != 8) {
            field3216 = -106;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    private final void method1471(byte arg0) {
        this.field3230 = new class129(super.field337, 2);
        ++field3214;
        this.field3230.method919(0, 4864);
        super.field337.method3220(0, 1);
        super.field337.method3162(false, -16777216);
        super.field337.method3210(260, -99, 7681);
        super.field337.method3198(0, 34166, true, 770);
        super.field337.method3220(0, 0);
        OpenGL.glBindProgramARB(34336, this.field3224.field3101);
        int var2 = 28 % ((26 - arg0) / 62);
        OpenGL.glEnable(34336);
        this.field3230.method915((byte) 95);
        this.field3230.method919(1, 4864);
        super.field337.method3220(0, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field337.method3205(5123, 0);
        super.field337.method3198(0, 5890, true, 770);
        super.field337.method3220(0, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3230.method915((byte) 95);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Llj;Lud;)V")
    public class233(class565 arg0, class33 arg1) {
        super(arg0);
        this.field3222 = arg1;
        if (super.field337.field7951 && ~super.field337.field7919 <= -3) {
            this.field3224 = class393.method2296(100, super.field337, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336);
            if (this.field3224 != null) {
                int[][] var3 = class346.method2013(4, 0, 256, 4, false, 0.4F, 0, 3, 64);
                int[][] var4 = class346.method2013(4, 8, 256, 4, false, 0.4F, 0, 3, 64);
                this.field3227 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field3227[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3227[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1471((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Z")
    public final boolean method260(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field3226;
            return true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILvf;)V")
    public final void method257(int arg0, int arg1, class136 arg2) {
        ++field3229;
        if (arg1 != -10479) {
            this.method257(53, 49, (class136) null);
        }
        super.field337.method3206(arg2, (byte) 26);
        super.field337.method3205(5123, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public final void method261(int arg0, int arg1, int arg2) {
        ++field3219;
        if (this.field3230 != null) {
            super.field337.method3220(0, 1);
            if ((arg0 & 128) == 0) {
                if (~(arg1 & 1) == -2) {
                    if (this.field3222.field412) {
                        super.field337.method3206(this.field3222.field411, (byte) 26);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3221, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var4 = super.field337.field7834 % 4000 * 16 / 4000;
                        super.field337.method3206(this.field3222.field410[var4], (byte) 26);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (!this.field3222.field412) {
                        super.field337.method3206(this.field3222.field410[0], (byte) 26);
                    } else {
                        super.field337.method3206(this.field3222.field411, (byte) 26);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field337.method3206((class136) null, (byte) 26);
            }
            if (arg2 == 4) {
                super.field337.method3220(0, 0);
                if (~(64 & arg0) != -1) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glGetFloatv(2899, class402.field5639, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class402.field5639, 0);
                }
                int var5 = arg0 & 3;
                if (var5 == 2) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (var5 == 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)V")
    public final void method258(byte arg0, boolean arg1) {
        ++field3218;
        if (this.field3230 != null) {
            this.field3230.method918(1, '\u0000');
            super.field337.method3220(0, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field337.field7869.method3132(true), 0);
            OpenGL.glMatrixMode(5888);
            super.field337.method3220(0, 0);
            if (arg0 <= -80) {
                if (super.field337.field7834 != this.field3215) {
                    int var3 = super.field337.field7834 % 5000 * 128 / 5000;
                    for (int var4 = 0; ~var4 > -65; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field3227, var3);
                        var3 += 2;
                    }
                    if (!this.field3222.field412) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        this.field3221 = (float) (super.field337.field7834 % 4000) / 4000.0F;
                    }
                    this.field3215 = super.field337.field7834;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public static void method1472(boolean arg0) {
        field3228 = null;
        field3217 = null;
        if (!arg0) {
            field3216 = -111;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB[BI)[B")
    public static final byte[] method1473(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != 22) {
            return null;
        } else {
            ++field3223;
            byte[] var4 = new byte[arg0];
            class359.method2053(arg2, arg3, var4, 0, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public final void method256(byte arg0) {
        ++field3220;
        if (this.field3230 != null) {
            if (arg0 != 50) {
                this.field3230 = null;
            }
            this.field3230.method918(1, '\u0001');
            super.field337.method3220(0, 1);
            super.field337.method3206((class136) null, (byte) 26);
            super.field337.method3220(0, 0);
        }
    }
}

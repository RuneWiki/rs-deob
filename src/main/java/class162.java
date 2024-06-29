import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class162 extends class509 {

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lmm;")
    private class19 field2434;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lup;")
    private class280 field2437;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[F")
    private float[] field2436;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Ld;")
    public static class242 field2439 = new class242(5);

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lpu;")
    public static class179 field2450 = new class179("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "Lvg;")
    public static class56 field2452 = new class56(16);

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "F")
    private float field2435;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Lgw;")
    private class108 field2446;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Lo;")
    public static class363 field2454;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Z")
    public static boolean field2453;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 10)
    public final void method121(byte arg0) {
        ++field2438;
        if (this.field2446 != null) {
            this.field2446.method850(false, '\u0001');
            if (arg0 == 38) {
                super.field7409.method1756(1, arg0 ^ 69);
                super.field7409.method1749(25752, (class169) null);
                super.field7409.method1756(0, 121);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 28)
    private final void method1155(int arg0) {
        this.field2446 = new class108(super.field7409, 2);
        ++field2448;
        this.field2446.method848(0, true);
        super.field7409.method1756(1, arg0 ^ -5931);
        super.field7409.method1745(-16777216, 2);
        super.field7409.method1741(260, (byte) -17, 7681);
        super.field7409.method1778(34166, 770, arg0 ^ 5891, 0);
        super.field7409.method1756(0, -12);
        OpenGL.glBindProgramARB(34336, this.field2437.field4359);
        OpenGL.glEnable(34336);
        this.field2446.method851(124);
        this.field2446.method848(1, true);
        super.field7409.method1756(1, 106);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field7409.method1734(-53, 0);
        super.field7409.method1778(arg0, 770, arg0 ^ 5891, 0);
        super.field7409.method1756(0, 126);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field2446.method851(102);
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 59)
    public static void method1156(int arg0) {
        if (arg0 >= 42) {
            field2454 = null;
            field2439 = null;
            field2450 = null;
            field2452 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILin;)V", line = 72)
    public final void method125(byte arg0, int arg1, class169 arg2) {
        super.field7409.method1749(25752, arg2);
        if (arg0 < 9) {
            field2451 = -105;
        }
        ++field2440;
        super.field7409.method1734(-51, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V", line = 85)
    public final void method123(int arg0, int arg1, boolean arg2) {
        ++field2433;
        if (arg2) {
            field2439 = null;
        }
        if (this.field2446 != null) {
            super.field7409.method1756(1, 103);
            if ((128 & arg1) == 0) {
                if (~(arg0 & 1) != -2) {
                    if (!this.field2434.field212) {
                        super.field7409.method1749(25752, this.field2434.field213[0]);
                    } else {
                        super.field7409.method1749(25752, this.field2434.field210);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field2434.field212) {
                    int var4 = super.field7409.field3927 % 4000 * 16 / 4000;
                    super.field7409.method1749(25752, this.field2434.field213[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field7409.method1749(25752, this.field2434.field210);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2435, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field7409.method1749(25752, (class169) null);
            }
            super.field7409.method1756(0, -127);
            if ((64 & arg1) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class228.field3450, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class228.field3450, 0);
            }
            int var5 = arg1 & 3;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 == 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BZ)V", line = 155)
    public final void method128(byte arg0, boolean arg1) {
        if (arg0 <= 44) {
            field2451 = -7;
        }
        ++field2447;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILfh;I)Ljava/lang/String;", line = 168)
    public static final String method1157(int arg0, class194 arg1, int arg2) {
        ++field2445;
        try {
            int var3 = arg1.method1340(-57);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field2982 += class179.field2761.method1873(0, arg1.field2973, -1, var3, var4, arg1.field2982);
            if (arg2 > -81) {
                method1159((byte) -6);
            }
            return class355.method2267(0, var3, var4, (byte) -111);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Z", line = 197)
    public final boolean method124(int arg0) {
        ++field2441;
        if (arg0 != -32170) {
            this.method121((byte) -33);
        }
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILfi;)Ljava/lang/String;", line = 209)
    public static final String method1158(int arg0, int arg1, class38 arg2) {
        ++field2443;
        if (!client.method3078(arg2).method793(1, arg1) && arg2.field533 == null) {
            return null;
        } else if (arg2.field581 != null && ~arg2.field581.length < ~arg1 && arg2.field581[arg1] != null && ~arg2.field581[arg1].trim().length() != -1) {
            return arg0 != -9197 ? null : arg2.field581[arg1];
        } else {
            return class267.field4246 ? "Hidden-" + arg1 : null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V", line = 232)
    public final void method122(boolean arg0, int arg1) {
        ++field2449;
        if (this.field2446 != null) {
            this.field2446.method850(false, '\u0000');
            super.field7409.method1756(1, arg1 + 63);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7409.field3981.method2969(-1), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field7409.method1756(0, 106);
            if (super.field7409.field3927 != this.field2444) {
                int var3 = super.field7409.field3927 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2436, var4);
                    var4 += 2;
                }
                if (!this.field2434.field212) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field2435 = (float) (super.field7409.field3927 % 4000) / 4000.0F;
                }
                this.field2444 = super.field7409.field3927;
            }
            if (arg1 != 64) {
                field2439 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V", line = 282)
    public static final void method1159(byte arg0) {
        ++field2432;
        if (!class94.field1504) {
            if (!class40.field667.field4187) {
                class305.field4672 += (24.0F - class305.field4672) / 2.0F;
            } else {
                class434.field6466 = (float) ((int) class434.field6466 + 191 & -128);
            }
            class94.field1504 = true;
            int var1 = -69 % ((arg0 - -76) / 43);
            class397.field5861 = true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 310)
    public static final void method1160(int arg0) {
        class73.field1248.method517(class345.field5139, class401.field5915, class192.field2956);
        ++field2442;
        if (arg0 != 34336) {
            method1159((byte) 33);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ltt;Lmm;)V", line = 321)
    public class162(class249 arg0, class19 arg1) {
        super(arg0);
        this.field2434 = arg1;
        if (super.field7409.field4035 && super.field7409.field3996 >= 2) {
            this.field2437 = class484.method2930(34336, -8, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field7409);
            if (this.field2437 != null) {
                int[][] var3 = class80.method712(4, 64, 3, 0.4F, (byte) 103, 8, 256, 0, false);
                int[][] var4 = class80.method712(4, 64, 3, 0.4F, (byte) -32, 8, 256, 8, false);
                this.field2436 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field2436[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2436[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1155(5890);
            }
        }
    }
}

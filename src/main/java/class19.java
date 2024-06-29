import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 extends class363 {

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "Lqh;")
    private class48 field217;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "Ldd;")
    private class495 field209;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "[F")
    private float[] field206;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "Lbw;")
    private class483 field208;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V", line = 3)
    public final void method120(boolean arg0) {
        ++field211;
        if (this.field208 != null) {
            this.field208.method2863(arg0, '\u0001');
            super.field5564.method2176(1, 76);
            super.field5564.method2200((class446) null, (byte) 114);
            super.field5564.method2176(0, 110);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljk;IB)V", line = 19)
    public final void method121(class446 arg0, int arg1, byte arg2) {
        if (arg2 > -69) {
            method124(83, 11, false);
        }
        ++field213;
        super.field5564.method2200(arg0, (byte) 125);
        super.field5564.method2186(arg1, -79);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V", line = 31)
    public final void method122(boolean arg0, byte arg1) {
        ++field203;
        if (arg1 != 52) {
            this.method126(-117);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 42)
    private final void method123(byte arg0) {
        ++field202;
        this.field208 = new class483(super.field5564, 2);
        this.field208.method2869(0, -124);
        super.field5564.method2176(1, arg0 + 193);
        super.field5564.method2155(-16777216, 51);
        super.field5564.method2131(34162, 7681, 260);
        super.field5564.method2135(0, 34166, -66, 770);
        super.field5564.method2176(0, 119);
        OpenGL.glBindProgramARB(34336, this.field209.field7318);
        OpenGL.glEnable(34336);
        this.field208.method2870(1952872654);
        this.field208.method2869(1, -125);
        super.field5564.method2176(1, 113);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (arg0 == -92) {
            super.field5564.method2186(0, 120);
            super.field5564.method2135(0, 5890, -85, 770);
            super.field5564.method2176(0, arg0 ^ -54);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field208.method2870(1952872654);
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lod;Lqh;)V", line = 76)
    public class19(class349 arg0, class48 arg1) {
        super(arg0);
        this.field217 = arg1;
        if (super.field5564.field5279 && super.field5564.field5292 >= 2) {
            this.field209 = class303.method1907(super.field5564, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, (byte) 106);
            if (this.field209 != null) {
                int[][] var3 = class519.method3065(3, 8, 64, (byte) 119, 256, 0, 4, false, 0.4F);
                int[][] var4 = class519.method3065(3, 8, 64, (byte) 117, 256, 8, 4, false, 0.4F);
                int var5 = 0;
                this.field206 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field206[var5++] = (float) var7[var9] / 4096.0F;
                        this.field206[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method123((byte) -92);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 124)
    public static final String method124(int arg0, int arg1, boolean arg2) {
        ++field207;
        if (arg0 != 3) {
            field216 = -92;
        }
        return arg2 && ~arg1 <= -1 ? class343.method2103(10, arg1, arg0 ^ 3, arg2) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V", line = 141)
    public final void method125(boolean arg0, int arg1) {
        ++field204;
        if (this.field208 != null) {
            this.field208.method2863(false, '\u0000');
            super.field5564.method2176(1, 111);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5564.field5335.method1550((byte) 96), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (arg1 <= -69) {
                super.field5564.method2176(0, 51);
                if (super.field5564.field5228 != this.field214) {
                    int var3 = super.field5564.field5228 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; var5 < 64; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field206, var4);
                        var4 += 2;
                    }
                    if (this.field217.field778) {
                        float var6 = (float) (super.field5564.field5228 % 4000) / 4000.0F;
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field214 = super.field5564.field5228;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)Z", line = 190)
    public final boolean method126(int arg0) {
        ++field205;
        int var2 = 90 % ((arg0 - 37) / 48);
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(ZI)V", line = 204)
    public static final void method127(boolean arg0, int arg1) {
        while (true) {
            if (~class66.field1009.method1687(class352.field5395, 108) <= -16) {
                int var2 = class66.field1009.method1690((byte) 1, 15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (class193.field2821[var2] == null) {
                        class193.field2821[var2] = new class167();
                        class193.field2821[var2].field1942 = var2;
                        var3 = true;
                    }
                    class167 var4 = class193.field2821[var2];
                    class378.field5766[class402.field6044++] = var2;
                    var4.field1939 = class317.field4559;
                    if (var4.field2472 != null && var4.field2472.method2097(arg1 + -3424)) {
                        class497.method2980(0, var4);
                    }
                    int var5 = (-318767097 & class66.field1009.method1690((byte) 1, 3) - -4) << 11;
                    var4.method1160(class431.field6451.method1733(true, class66.field1009.method1690((byte) 1, 14)), 119);
                    int var6;
                    if (!arg0) {
                        var6 = class66.field1009.method1690((byte) 1, 5);
                        if (~var6 < -16) {
                            var6 -= 32;
                        }
                    } else {
                        var6 = class66.field1009.method1690((byte) 1, 8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    }
                    int var7 = class66.field1009.method1690((byte) 1, 1);
                    int var8;
                    if (!arg0) {
                        var8 = class66.field1009.method1690((byte) 1, 5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    } else {
                        var8 = class66.field1009.method1690((byte) 1, 8);
                        if (~var8 < -128) {
                            var8 -= 256;
                        }
                    }
                    int var9 = class66.field1009.method1690((byte) 1, 1);
                    if (var9 == 1) {
                        class303.field4274[class214.field3120++] = var2;
                    }
                    int var10 = class66.field1009.method1690((byte) 1, 2);
                    var4.method860((byte) 114, var4.field2472.field4881);
                    var4.field1986 = var4.field2472.field4918 << 3;
                    if (~var4.field1986 == -1) {
                        var4.method855(0, arg1 ^ 3546);
                    } else if (var3) {
                        var4.method855(var5, arg1 + -3542);
                    }
                    var4.method1162((byte) -25, class500.field7365.field1996[0] + var8, var4.method847(-1), class500.field7365.field1997[0] - -var6, ~var7 == -2, var10);
                    if (var4.field2472.method2097(109)) {
                        class102.method624((class519) null, (class239) null, 0, var4.field1996[0], var4, (byte) 19, var4.field1997[0], var4.field1768);
                    }
                    continue;
                }
            }
            ++field215;
            if (arg1 != 3544) {
                method124(45, -101, false);
            }
            class66.field1009.method1691(false);
            return;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V", line = 316)
    public final void method128(int arg0, int arg1, int arg2) {
        ++field212;
        if (this.field208 != null) {
            super.field5564.method2176(1, 60);
            if (~(128 & arg2) == -1) {
                if (!this.field217.field778) {
                    int var4 = super.field5564.field5228 % 4000 * 16 / 4000;
                    super.field5564.method2200(this.field217.field779[var4], (byte) 126);
                } else {
                    super.field5564.method2200(this.field217.field775, (byte) 126);
                }
            } else {
                super.field5564.method2200((class446) null, (byte) 127);
            }
            super.field5564.method2176(0, 75);
            if ((64 & arg2) == 0) {
                OpenGL.glGetFloatv(2899, class5.field72, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class5.field72, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            if (arg1 > -13) {
                method124(95, -72, false);
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

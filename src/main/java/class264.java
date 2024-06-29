import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class264 extends class141 {

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lpt;")
    private class376 field3983;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lj;")
    private class386 field3988;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "[F")
    private float[] field3992;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3984 = 0;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "F")
    private float field3994;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Luv;")
    private class250 field3986;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lei;II)V", line = 4)
    public final void method57(class120 arg0, int arg1, int arg2) {
        super.field2178.method285(false, arg0);
        if (arg2 <= 89) {
            this.field3987 = -128;
        }
        ++field3989;
        super.field2178.method249(arg1, -2);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V", line = 24)
    public final void method51(int arg0, boolean arg1) {
        ++field3991;
        if (this.field3986 != null) {
            this.field3986.method1625('\u0000', (byte) -36);
            super.field2178.method277(1, (byte) 50);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2178.field736.method3144((byte) -42), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (arg0 == -21897) {
                super.field2178.method277(0, (byte) 51);
                if (~super.field2178.field625 != ~this.field3987) {
                    int var3 = super.field2178.field625 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; var5 < 64; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field3992, var4);
                        var4 += 2;
                    }
                    if (this.field3983.field5415) {
                        this.field3994 = (float) (super.field2178.field625 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field3987 = super.field2178.field625;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V", line = 75)
    public final void method49(int arg0, int arg1, int arg2) {
        ++field3993;
        if (this.field3986 != null) {
            if (arg0 != 1400) {
                this.field3988 = null;
            }
            super.field2178.method277(1, (byte) 79);
            if (~(arg2 & 128) != -1) {
                super.field2178.method285(false, (class120) null);
            } else if (~(1 & arg1) == -2) {
                if (!this.field3983.field5415) {
                    int var4 = super.field2178.field625 % 4000 * 16 / 4000;
                    super.field2178.method285(false, this.field3983.field5418[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field2178.method285(false, this.field3983.field5411);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3994, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (this.field3983.field5415) {
                    super.field2178.method285(false, this.field3983.field5411);
                } else {
                    super.field2178.method285(false, this.field3983.field5418[0]);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field2178.method277(0, (byte) 127);
            if ((64 & arg2) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class79.field1294, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class79.field1294, 0);
            }
            int var5 = 3 & arg2;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)Z", line = 145)
    public final boolean method55(int arg0) {
        ++field3982;
        if (arg0 != 0) {
            this.field3992 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V", line = 156)
    public final void method53(boolean arg0, int arg1) {
        ++field3995;
        if (arg1 != 0) {
            this.field3986 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lbt;Lpt;)V", line = 167)
    public class264(class33 arg0, class376 arg1) {
        super(arg0);
        this.field3983 = arg1;
        if (super.field2178.field649 && super.field2178.field707 >= 2) {
            this.field3988 = class137.method995(super.field2178, (byte) -100, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field3988 != null) {
                int[][] var3 = class208.method1416(256, false, 0, 8, 0.4F, 4, -29719, 3, 64);
                int[][] var4 = class208.method1416(256, false, 8, 8, 0.4F, 4, -29719, 3, 64);
                this.field3992 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field3992[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3992[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1706(1);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 217)
    public final void method48(int arg0) {
        ++field3985;
        if (this.field3986 != null) {
            this.field3986.method1625('\u0001', (byte) -36);
            int var2 = -55 / ((arg0 - -51) / 45);
            super.field2178.method277(1, (byte) 96);
            super.field2178.method285(false, (class120) null);
            super.field2178.method277(0, (byte) 65);
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V", line = 239)
    private final void method1706(int arg0) {
        ++field3990;
        this.field3986 = new class250(super.field2178, 2);
        this.field3986.method1622(0, (byte) 69);
        super.field2178.method277(1, (byte) 55);
        super.field2178.method356(-16777216, 255);
        super.field2178.method275(260, 7681, 125);
        super.field2178.method200(34166, 0, 770, (byte) 114);
        super.field2178.method277(0, (byte) 83);
        OpenGL.glBindProgramARB(34336, this.field3988.field5504);
        OpenGL.glEnable(34336);
        this.field3986.method1624(-22853);
        this.field3986.method1622((char) arg0, (byte) 69);
        super.field2178.method277(1, (byte) 60);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2178.method249(0, ~arg0);
        super.field2178.method200(5890, 0, 770, (byte) 114);
        super.field2178.method277(0, (byte) 86);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3986.method1624(-22853);
    }
}

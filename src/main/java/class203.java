import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class203 extends class56 {

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "Lre;")
    private class222 field2856;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "Lvl;")
    private class240 field2851;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "[F")
    private float[] field2852;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "Lcm;")
    public static class449 field2858 = new class449(72, 2);

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "Lgs;")
    private class288 field2853;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(ZI)V")
    public final void method383(boolean arg0, int arg1) {
        ++field2849;
        if (this.field2853 != null) {
            this.field2853.method1866(13, '\u0000');
            super.field752.method1819(1, (byte) 117);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field752.field4122.method771(0), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field752.method1819(0, (byte) 105);
            if (arg1 >= -77) {
                field2858 = null;
            }
            if (super.field752.field4086 != this.field2845) {
                int var3 = super.field752.field4086 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2852, var4);
                    var4 += 2;
                }
                if (this.field2856.field3106) {
                    float var6 = (float) (super.field752.field4086 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field2845 = super.field752.field4086;
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)Z")
    public final boolean method377(byte arg0) {
        ++field2855;
        if (arg0 > -8) {
            this.method377((byte) 65);
        }
        return true;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
    public final void method382(int arg0, int arg1, int arg2) {
        ++field2847;
        if (this.field2853 != null) {
            super.field752.method1819(1, (byte) 119);
            if (~(128 & arg1) == -1) {
                if (this.field2856.field3106) {
                    super.field752.method1787(this.field2856.field3103, (byte) 121);
                } else {
                    int var4 = super.field752.field4086 % 4000 * 16 / 4000;
                    super.field752.method1787(this.field2856.field3104[var4], (byte) 121);
                }
            } else {
                super.field752.method1787((class14) null, (byte) 121);
            }
            super.field752.method1819(arg2, (byte) 115);
            if (~(64 & arg1) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class186.field2618, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class186.field2618, 0);
            }
            int var5 = 3 & arg1;
            if (~var5 != -3) {
                if (var5 != 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        ++field2857;
        if (this.field2853 != null) {
            this.field2853.method1866(13, '\u0001');
            super.field752.method1819(1, (byte) 96);
            super.field752.method1787((class14) null, (byte) 121);
            if (arg0 > -50) {
                this.field2856 = null;
            }
            super.field752.method1819(0, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field2858 = null;
        if (arg0 >= -67) {
            method1413(119, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILkv;)V")
    public final void method379(int arg0, int arg1, class14 arg2) {
        ++field2848;
        super.field752.method1787(arg2, (byte) 121);
        super.field752.method1794(arg0, 65);
        int var4 = -89 / ((81 - arg1) / 39);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
    public final void method380(boolean arg0, int arg1) {
        if (arg1 <= 42) {
            this.method1414((byte) -27);
        }
        ++field2846;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)I")
    public static final int method1413(int arg0, byte arg1) {
        if (arg1 >= -96) {
            field2859 = -124;
        }
        ++field2854;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V")
    private final void method1414(byte arg0) {
        this.field2853 = new class288(super.field752, 2);
        ++field2850;
        if (arg0 >= -33) {
            field2859 = -106;
        }
        this.field2853.method1864((byte) 79, 0);
        super.field752.method1819(1, (byte) 123);
        super.field752.method1792(-16777216, 6865);
        super.field752.method1776(-30, 7681, 260);
        super.field752.method1825((byte) 75, 0, 770, 34166);
        super.field752.method1819(0, (byte) 111);
        OpenGL.glBindProgramARB(34336, this.field2851.field3389);
        OpenGL.glEnable(34336);
        this.field2853.method1865(126);
        this.field2853.method1864((byte) 116, 1);
        super.field752.method1819(1, (byte) 94);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field752.method1794(0, 89);
        super.field752.method1825((byte) 92, 0, 770, 5890);
        super.field752.method1819(0, (byte) 108);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field2853.method1865(126);
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lbv;Lre;)V")
    public class203(class282 arg0, class222 arg1) {
        super(arg0);
        this.field2856 = arg1;
        if (super.field752.field4207 && ~super.field752.field4162 <= -3) {
            this.field2851 = class327.method2113(super.field752, (byte) -106, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field2851 != null) {
                int[][] var3 = class435.method2605(64, false, -66, 3, 0, 256, 8, 4, 0.4F);
                int[][] var4 = class435.method2605(64, false, 85, 3, 8, 256, 8, 4, 0.4F);
                this.field2852 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field2852[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2852[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1414((byte) -42);
            }
        }
    }
}

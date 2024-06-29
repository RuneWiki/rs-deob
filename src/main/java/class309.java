import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class309 extends class366 {

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "Lpe;")
    private class430 field4419;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Lub;")
    private class18 field4411;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "[F")
    private float[] field4423;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "[I")
    public static int[] field4412 = new int[14];

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Lcn;")
    private class356 field4418;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILgo;B)V", line = 6)
    public final void method6(int arg0, class440 arg1, byte arg2) {
        int var4 = 83 / ((31 - arg2) / 59);
        super.field5494.method2042(arg1, 0);
        ++field4420;
        super.field5494.method2068(arg0, 13134);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZ)V", line = 18)
    public final void method7(boolean arg0, boolean arg1) {
        ++field4415;
        if (!arg0) {
            this.field4411 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V", line = 33)
    public static void method1937(int arg0) {
        field4412 = null;
        if (arg0 != 0) {
            method1940(-61, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lqg;Lpe;)V", line = 46)
    public class309(class321 arg0, class430 arg1) {
        super(arg0);
        this.field4419 = arg1;
        if (super.field5494.field4810 && super.field5494.field4844 >= 2) {
            this.field4411 = class458.method2749("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 0, super.field5494, 34336);
            if (this.field4411 != null) {
                int[][] var3 = class452.method2715(64, 8, 0.4F, 0, 4, 256, 83, false, 3);
                int[][] var4 = class452.method2715(64, 8, 0.4F, 8, 4, 256, 38, false, 3);
                int var5 = 0;
                this.field4423 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field4423[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4423[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1939(34336);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILqf;)V", line = 99)
    public static final void method1938(int arg0, class477 arg1) {
        for (int var2 = arg0; var2 < class165.field2467; ++var2) {
            int var3 = class515.field7572[var2];
            class62 var4 = class390.field5783[var3];
            int var5 = arg1.method1918((byte) -35);
            if ((var5 & 2) != 0) {
                var5 += arg1.method1918((byte) 81) << 8;
            }
            if ((var5 & 8192) != 0) {
                var5 += arg1.method1918((byte) 95) << 16;
            }
            class530.method3144(var3, -76, var5, var4, arg1);
        }
        ++field4413;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V", line = 128)
    public final void method1(int arg0) {
        ++field4422;
        if (this.field4418 != null) {
            this.field4418.method2298('\u0001', 0);
            if (arg0 > 2) {
                super.field5494.method2030(1, (byte) -127);
                super.field5494.method2042((class440) null, 0);
                super.field5494.method2030(0, (byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V", line = 146)
    public final void method5(boolean arg0, int arg1) {
        ++field4410;
        int var3 = 17 % ((arg1 - 10) / 48);
        if (this.field4418 != null) {
            this.field4418.method2298('\u0000', 0);
            super.field5494.method2030(1, (byte) -124);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5494.field4820.method2526(75), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5494.method2030(0, (byte) 44);
            if (~super.field5494.field4781 != ~this.field4414) {
                int var4 = super.field5494.field4781 % 5120 * 128 / 5120;
                int var5 = var4 * 128;
                for (int var6 = 0; ~var6 > -65; ++var6) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var6, this.field4423, var5);
                    var5 += 2;
                }
                if (!this.field4419.field6264) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var7 = (float) (super.field5494.field4781 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var7, 0.0F, 0.0F, 1.0F);
                }
                this.field4414 = super.field5494.field4781;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V", line = 194)
    private final void method1939(int arg0) {
        ++field4421;
        this.field4418 = new class356(super.field5494, 2);
        this.field4418.method2295(0, (byte) 126);
        super.field5494.method2030(1, (byte) 11);
        super.field5494.method2009(-16777216, false);
        super.field5494.method2070(68, 7681, 260);
        super.field5494.method2034(0, 34166, 770, 8960);
        super.field5494.method2030(0, (byte) -125);
        OpenGL.glBindProgramARB(34336, this.field4411.field279);
        OpenGL.glEnable(34336);
        this.field4418.method2296(-86);
        this.field4418.method2295(1, (byte) 123);
        super.field5494.method2030(1, (byte) -121);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field5494.method2068(0, arg0 + -21202);
        super.field5494.method2034(0, 5890, 770, 8960);
        super.field5494.method2030(0, (byte) -121);
        OpenGL.glBindProgramARB(arg0, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field4418.method2296(117);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V", line = 224)
    public static final void method1940(int arg0, byte arg1) {
        class511.field7539 = -1;
        ++field4424;
        if (~arg0 != -38) {
            if (~arg0 == -51) {
                class2.field22 = 4.0F;
            } else if (arg0 == 75) {
                class2.field22 = 6.0F;
            } else if (arg0 != 100) {
                if (arg0 == 200) {
                    class2.field22 = 16.0F;
                }
            } else {
                class2.field22 = 8.0F;
            }
        } else {
            class2.field22 = 3.0F;
        }
        class511.field7539 = -1;
        if (arg1 >= -47) {
            field4412 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z", line = 255)
    public final boolean method9(int arg0) {
        if (arg0 <= 21) {
            method1938(-13, (class477) null);
        }
        ++field4417;
        return true;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIB)V", line = 266)
    public final void method8(int arg0, int arg1, byte arg2) {
        ++field4416;
        if (this.field4418 != null) {
            super.field5494.method2030(1, (byte) 23);
            if ((128 & arg1) == 0) {
                if (this.field4419.field6264) {
                    super.field5494.method2042(this.field4419.field6260, 0);
                } else {
                    int var4 = super.field5494.field4781 % 4000 * 16 / 4000;
                    super.field5494.method2042(this.field4419.field6266[var4], 0);
                }
            } else {
                super.field5494.method2042((class440) null, 0);
            }
            super.field5494.method2030(0, (byte) 40);
            if ((arg1 & 64) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class525.field7721, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class525.field7721, 0);
            }
            int var5 = 3 & arg1;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
            if (arg2 < 18) {
                method1938(10, (class477) null);
            }
        }
    }
}

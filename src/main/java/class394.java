import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class394 extends class297 {

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "Lri;")
    private class73 field5342;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "Lbm;")
    private class74 field5344;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "[F")
    private float[] field5343;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    private int field5335;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Liq;")
    private class429 field5330;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Lf;")
    public static class529 field5334;

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lbo;Lri;)V", line = 8)
    public class394(class511 arg0, class73 arg1) {
        super(arg0);
        this.field5342 = arg1;
        if (super.field3881.field7511 && super.field3881.field7522 >= 2) {
            this.field5344 = class530.method3119(super.field3881, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", false);
            if (this.field5344 != null) {
                int[][] var3 = class387.method2289(4, 8, false, 0, 0.4F, 4096, 256, 3, 64);
                int[][] var4 = class387.method2289(4, 8, false, 8, 0.4F, 4096, 256, 3, 64);
                int var5 = 0;
                this.field5343 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field5343[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5343[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2313((byte) -78);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZII)V", line = 55)
    public final void method245(boolean arg0, int arg1, int arg2) {
        ++field5332;
        if (this.field5330 != null) {
            super.field3881.method3003(1, 85);
            if ((arg2 & 128) == 0) {
                if (this.field5342.field1096) {
                    super.field3881.method2980(this.field5342.field1101, 110);
                } else {
                    int var4 = super.field3881.field7404 % 4000 * 16 / 4000;
                    super.field3881.method2980(this.field5342.field1097[var4], 121);
                }
            } else {
                super.field3881.method2980((class501) null, 125);
            }
            super.field3881.method3003(0, 22);
            if (!arg0) {
                this.field5335 = 126;
            }
            if ((64 & arg2) == 0) {
                OpenGL.glGetFloatv(2899, class118.field1724, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class118.field1724, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg2 & 3;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 == 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)Z", line = 105)
    public final boolean method240(boolean arg0) {
        ++field5331;
        if (arg0) {
            method2310((byte) -11, 80, -57);
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 116)
    public static void method2309(byte arg0) {
        if (arg0 > -76) {
            method2312(18, 97, 126);
        }
        field5334 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z", line = 128)
    public static final boolean method2310(byte arg0, int arg1, int arg2) {
        if (arg0 != -125) {
            method2311(116, 87);
        }
        ++field5339;
        return false;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V", line = 140)
    public static final void method2311(int arg0, int arg1) {
        if (arg1 == 4857) {
            ++field5333;
            class253 var2 = class332.method1911(arg0, (byte) 8, 1);
            var2.method1523((byte) -120);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)I", line = 155)
    public static final int method2312(int arg0, int arg1, int arg2) {
        ++field5340;
        int var3 = class296.method1732(arg1 - 1, arg0 ^ 109, arg2 + -1) - (-class296.method1732(arg1 + 1, 100, arg2 + -1) + -class296.method1732(arg1 + -1, arg0 + 110, arg2 - -1)) + class296.method1732(arg0 + arg1, 95, arg2 + 1);
        int var4 = class296.method1732(arg1 - 1, 126, arg2) - -class296.method1732(arg1 - -1, arg0 + 125, arg2) - -class296.method1732(arg1, 115, arg2 + -1) + class296.method1732(arg1, arg0 ^ 92, arg2 - -1);
        int var5 = class296.method1732(arg1, arg0 ^ 114, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)V", line = 170)
    public final void method244(int arg0, boolean arg1) {
        ++field5338;
        if (this.field5330 != null) {
            this.field5330.method2480('\u0000', ~arg0);
            super.field3881.method3003(1, 74);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3881.field7470.method984((byte) 107), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, (float) arg0);
            OpenGL.glMatrixMode(5888);
            super.field3881.method3003(0, 84);
            if (super.field3881.field7404 != this.field5335) {
                int var3 = super.field3881.field7404 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field5343, var4);
                    var4 += 2;
                }
                if (this.field5342.field1096) {
                    float var6 = (float) (super.field3881.field7404 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field5335 = super.field3881.field7404;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 219)
    public final void method246(int arg0) {
        if (arg0 != 6) {
            method2309((byte) -14);
        }
        ++field5337;
        if (this.field5330 != null) {
            this.field5330.method2480('\u0001', arg0 + -7);
            super.field3881.method3003(1, 75);
            super.field3881.method2980((class501) null, 120);
            super.field3881.method3003(0, arg0 + 32);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lnk;II)V", line = 237)
    public final void method248(class501 arg0, int arg1, int arg2) {
        super.field3881.method2980(arg0, 111);
        ++field5329;
        super.field3881.method2976((byte) 110, arg2);
        if (arg1 != 0) {
            field5336 = 10;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZI)V", line = 249)
    public final void method241(boolean arg0, int arg1) {
        ++field5345;
        if (arg1 != -30965) {
            field5341 = 27;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V", line = 260)
    private final void method2313(byte arg0) {
        this.field5330 = new class429(super.field3881, 2);
        ++field5328;
        this.field5330.method2482(0, -83);
        super.field3881.method3003(1, 30);
        super.field3881.method2986(-16777216, (byte) -58);
        super.field3881.method3002((byte) -57, 260, 7681);
        super.field3881.method2950((byte) -34, 770, 0, 34166);
        super.field3881.method3003(0, 107);
        OpenGL.glBindProgramARB(34336, this.field5344.field1117);
        OpenGL.glEnable(34336);
        this.field5330.method2479(-16981);
        this.field5330.method2482(1, arg0 ^ 126);
        super.field3881.method3003(1, arg0 + 163);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field3881.method2976((byte) 54, 0);
        super.field3881.method2950((byte) -34, 770, 0, 5890);
        if (arg0 != -78) {
            method2310((byte) 108, -75, -128);
        }
        super.field3881.method3003(0, 104);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field5330.method2479(arg0 ^ 16921);
    }
}

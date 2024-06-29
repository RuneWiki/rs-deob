import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class382 extends class702 {

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "Lwca;")
    private class628 field5099;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "Lqb;")
    private class204 field5105;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "[F")
    private float[] field5110;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field5103 = 0;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "F")
    private float field5107;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    private int field5111;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "Lqt;")
    private class588 field5112;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 5)
    public final void method1002(boolean arg0) {
        ++field5104;
        if (this.field5112 != null) {
            this.field5112.method3409((byte) 120, '\u0001');
            super.field9912.method2975(1, 97);
            super.field9912.method2932(arg0, (class197) null);
            super.field9912.method2975(0, 76);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZZ)V", line = 24)
    public final void method1000(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field5099 = null;
        }
        ++field5097;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lkga;Lwca;)V", line = 35)
    public class382(class506 arg0, class628 arg1) {
        super(arg0);
        this.field5099 = arg1;
        if (super.field9912.field7358 && super.field9912.field7319 >= 2) {
            this.field5105 = class567.method3325(34336, -8962, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field9912);
            if (this.field5105 != null) {
                int[][] var3 = class72.method641(0.4F, (byte) -124, false, 4, 3, 4, 64, 256, 0);
                int[][] var4 = class72.method641(0.4F, (byte) -108, false, 4, 3, 4, 64, 256, 8);
                this.field5110 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field5110[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5110[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2204((byte) -36);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)Z", line = 84)
    public final boolean method998(boolean arg0) {
        ++field5101;
        if (arg0) {
            this.method1005(false, -77);
        }
        return true;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljf;II)V", line = 95)
    public final void method1004(class197 arg0, int arg1, int arg2) {
        ++field5096;
        super.field9912.method2932(true, arg0);
        if (arg2 == 58) {
            super.field9912.method2985(arg1, arg2 + -27031);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V", line = 113)
    public final void method1001(int arg0, int arg1, int arg2) {
        ++field5108;
        if (this.field5112 != null) {
            super.field9912.method2975(1, 116);
            if (~(arg0 & 128) != -1) {
                super.field9912.method2932(true, (class197) null);
            } else if ((arg2 & 1) != 1) {
                if (!this.field5099.field9008) {
                    super.field9912.method2932(true, this.field5099.field9004[0]);
                } else {
                    super.field9912.method2932(true, this.field5099.field8998);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (this.field5099.field9008) {
                super.field9912.method2932(true, this.field5099.field8998);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field5107, 0.0F, 0.0F, 1.0F);
            } else {
                int var4 = super.field9912.field7264 % 4000 * 16 / 4000;
                super.field9912.method2932(true, this.field5099.field9004[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            int var5 = -29 % ((arg1 - 55) / 36);
            super.field9912.method2975(0, 122);
            if (~(64 & arg0) == -1) {
                OpenGL.glGetFloatv(2899, class573.field8408, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class573.field8408, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var6 = 3 & arg0;
            if (~var6 != -3) {
                if (var6 == 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILrda;[IB)V", line = 180)
    public static final void method2203(int arg0, class613 arg1, int[] arg2, byte arg3) {
        ++field5098;
        if (arg1.field2655 != null) {
            boolean var4 = true;
            for (int var5 = 0; ~arg1.field2655.length < ~var5; ++var5) {
                if (~arg1.field2655[var5] != ~arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field2637 != -1) {
                class282 var6 = class195.field2367.method3273(arg1.field2637, 0);
                int var7 = var6.field3828;
                if (var7 == 1) {
                    arg1.field2613 = 0;
                    arg1.field2662 = 0;
                    arg1.field2585 = 1;
                    arg1.field2596 = arg0;
                    arg1.field2665 = 0;
                    if (!arg1.field2597) {
                        class563.method3294((byte) -117, var6, arg1, arg1.field2613);
                    }
                }
                if (~var7 == -3) {
                    arg1.field2665 = 0;
                }
            }
        }
        boolean var8 = true;
        int var9 = 2 % ((arg3 - -23) / 48);
        for (int var10 = 0; ~arg2.length < ~var10; ++var10) {
            if (~arg2[var10] != 0) {
                var8 = false;
            }
            if (arg1.field2655 == null || ~arg1.field2655[var10] == 0 || ~class195.field2367.method3273(arg2[var10], 0).field3823 <= ~class195.field2367.method3273(arg1.field2655[var10], 0).field3823) {
                arg1.field2596 = arg0;
                arg1.field2655 = arg2;
                break;
            }
        }
        if (var8) {
            arg1.field2655 = arg2;
            arg1.field2596 = arg0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V", line = 268)
    public final void method1005(boolean arg0, int arg1) {
        ++field5109;
        if (this.field5112 != null) {
            this.field5112.method3409((byte) 126, '\u0000');
            super.field9912.method2975(1, 111);
            if (arg1 >= -102) {
                this.field5099 = null;
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9912.field7301.method3022(-111), 0);
            OpenGL.glMatrixMode(5888);
            super.field9912.method2975(0, 101);
            if (super.field9912.field7264 != this.field5111) {
                int var3 = super.field9912.field7264 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field5110, var3);
                    var3 += 2;
                }
                if (this.field5099.field9008) {
                    this.field5107 = (float) (super.field9912.field7264 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field5111 = super.field9912.field7264;
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V", line = 316)
    private final void method2204(byte arg0) {
        ++field5102;
        this.field5112 = new class588(super.field9912, 2);
        this.field5112.method3405(0, (byte) 121);
        super.field9912.method2975(1, arg0 + 156);
        super.field9912.method2997(-16777216, -51);
        super.field9912.method2948(260, 7681, (byte) 42);
        super.field9912.method2938(-127, 34166, 770, 0);
        super.field9912.method2975(0, 105);
        OpenGL.glBindProgramARB(34336, this.field5105.field2452);
        OpenGL.glEnable(34336);
        this.field5112.method3410(1);
        this.field5112.method3405(1, (byte) 120);
        super.field9912.method2975(1, 91);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field9912.method2985(0, -26973);
        super.field9912.method2938(-125, 5890, 770, 0);
        super.field9912.method2975(0, 101);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field5112.method3410(1);
        if (arg0 != -36) {
            this.field5099 = null;
        }
    }
}

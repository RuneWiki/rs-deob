import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class605 {

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Lsda;")
    private class232 field71;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "Ljea;")
    private class414 field74;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "[F")
    private float[] field78;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Ltf;")
    public static class264 field77 = new class264(7, 16);

    @OriginalMember(owner = "client!to", name = "h", descriptor = "F")
    private float field72;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lhg;")
    private class642 field69;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILip;I)V")
    public final void method43(int arg0, class657 arg1, int arg2) {
        super.field8542.method1505(-2, arg1);
        if (arg2 != 0) {
            this.field72 = 0.99291205F;
        }
        ++field79;
        super.field8542.method1497(arg0, (byte) -29);
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(ZB)V")
    public static final void method44(boolean arg0, byte arg1) {
        if (arg0 && class25.field336 != null) {
            class338.field4984 = class25.field336.field4830;
        } else {
            class338.field4984 = -1;
        }
        ++field76;
        class25.field336 = null;
        class569.field8030 = null;
        class658.field9235 = 0;
        class382.field5392 = null;
        class25.method306();
        class25.field346.method475(6);
        class371.field5299 = null;
        class80.field1360 = null;
        class425.field6167 = null;
        class319.field4698 = -1;
        class268.field4044 = null;
        class9.field89 = -1;
        class652.field9167 = null;
        class85.field1405 = null;
        class617.field8596 = null;
        class218.field3055 = null;
        class300.field4468 = null;
        class25.field342 = null;
        if (class25.field339 != null) {
            class25.field339.method813((byte) 81);
            class25.field339.method811(128, -102, 64);
        }
        if (class25.field337 != null) {
            class25.field337.method3068(34, 64, 64);
        }
        if (class25.field335 != null) {
            class25.field335.method2620(64, 0);
        }
        if (arg1 >= -22) {
            field82 = -89;
        }
        class31.field493.method588(64, -8);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        ++field70;
        if (this.field69 != null) {
            this.field69.method3574(118, '\u0001');
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, (class657) null);
            super.field8542.method1500(33984, arg0);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZB)V")
    public final void method46(boolean arg0, byte arg1) {
        if (arg1 <= -16) {
            ++field68;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZI)V")
    public final void method47(int arg0, boolean arg1, int arg2) {
        ++field73;
        if (this.field69 != null) {
            if (!arg1) {
                super.field8542.method1500(33984, 1);
                if ((arg0 & 128) != 0) {
                    super.field8542.method1505(-2, (class657) null);
                } else if (~(1 & arg2) != -2) {
                    if (!this.field71.field3609) {
                        super.field8542.method1505(-2, this.field71.field3613[0]);
                    } else {
                        super.field8542.method1505(-2, this.field71.field3619);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field71.field3609) {
                    int var4 = super.field8542.field3405 % 4000 * 16 / 4000;
                    super.field8542.method1505(-2, this.field71.field3613[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field8542.method1505(-2, this.field71.field3619);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field72, 0.0F, 0.0F, 1.0F);
                }
                super.field8542.method1500(33984, 0);
                if (~(64 & arg0) == -1) {
                    OpenGL.glGetFloatv(2899, class277.field4193, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class277.field4193, 0);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                }
                int var5 = 3 & arg0;
                if (~var5 == -3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (var5 != 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)Z")
    public final boolean method48(boolean arg0) {
        ++field80;
        if (arg0) {
            this.method47(-5, false, 102);
        }
        return true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIILft;)Ljava/awt/Frame;")
    public static final Frame method49(int arg0, int arg1, int arg2, int arg3, int arg4, class4 arg5) {
        ++field85;
        if (!arg5.method24((byte) -39)) {
            return null;
        } else {
            if (arg1 == 0) {
                class373[] var6 = class147.method1051(arg5, arg0 + -34242);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (var6[var8].field5319 == arg3 && ~var6[var8].field5318 == ~arg4 && (~arg2 == -1 || ~var6[var8].field5315 == ~arg2) && (!var7 || ~var6[var8].field5320 < ~arg1)) {
                        var7 = true;
                        arg1 = var6[var8].field5320;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class494 var9 = arg5.method16(arg3, arg4, arg1, 601653552, arg2);
            if (arg0 != 34336) {
                method49(-49, -125, 1, 42, 125, (class4) null);
            }
            while (~var9.field7024 == -1) {
                class561.method3202(10L, (byte) -30);
            }
            Frame var10 = (Frame) var9.field7019;
            if (var10 == null) {
                return null;
            } else if (~var9.field7024 == -3) {
                class182.method1227(arg5, -5245, var10);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static void method50(int arg0) {
        if (arg0 != 1) {
            method50(-43);
        }
        field77 = null;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lok;Lsda;)V")
    public class8(class228 arg0, class232 arg1) {
        super(arg0);
        this.field71 = arg1;
        if (super.field8542.field3489 && super.field8542.field3460 >= 2) {
            this.field74 = class588.method3326(super.field8542, (byte) -117, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field74 != null) {
                int[][] var3 = class39.method452(4, 4, 0.4F, 3, 256, 0, 64, false, 0);
                int[][] var4 = class39.method452(4, 4, 0.4F, 3, 256, 0, 64, false, 8);
                this.field78 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field78[var5++] = (float) var7[var9] / 4096.0F;
                        this.field78[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method52((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V")
    public final void method51(boolean arg0, int arg1) {
        if (arg1 < -127) {
            ++field75;
            if (this.field69 != null) {
                this.field69.method3574(100, '\u0000');
                super.field8542.method1500(33984, 1);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field8542.field3441.method3886(11230), 0);
                OpenGL.glMatrixMode(5888);
                super.field8542.method1500(33984, 0);
                if (~super.field8542.field3405 != ~this.field84) {
                    int var3 = super.field8542.field3405 % 5000 * 128 / 5000;
                    for (int var4 = 0; ~var4 > -65; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field78, var3);
                        var3 += 2;
                    }
                    if (!this.field71.field3609) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        this.field72 = (float) (super.field8542.field3405 % 4000) / 4000.0F;
                    }
                    this.field84 = super.field8542.field3405;
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    private final void method52(byte arg0) {
        ++field81;
        this.field69 = new class642(super.field8542, 2);
        this.field69.method3579((byte) -110, 0);
        super.field8542.method1500(33984, 1);
        if (arg0 >= 88) {
            super.field8542.method1520((byte) -71, -16777216);
            super.field8542.method1527(1, 260, 7681);
            super.field8542.method1574(34166, (byte) -128, 770, 0);
            super.field8542.method1500(33984, 0);
            OpenGL.glBindProgramARB(34336, this.field74.field6014);
            OpenGL.glEnable(34336);
            this.field69.method3577((byte) -57);
            this.field69.method3579((byte) -78, 1);
            super.field8542.method1500(33984, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field8542.method1497(0, (byte) -29);
            super.field8542.method1574(5890, (byte) -128, 770, 0);
            super.field8542.method1500(33984, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field69.method3577((byte) -74);
        }
    }
}

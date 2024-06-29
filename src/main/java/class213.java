import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class213 extends class283 {

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "Ldja;")
    private class311 field2549;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "Lne;")
    private class321 field2561;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "[F")
    private float[] field2563;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Lkba;")
    public static class108 field2550 = new class108();

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "F")
    private float field2558;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    private int field2557;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Lfo;")
    private class518 field2559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eq", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field2564;

    // $FF: synthetic method
    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1189(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lcu;ZI)V", line = 6)
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1187((Component) null, true, -76);
        }
        super.field3749.method3006(1, arg0);
        ++field2546;
        super.field3749.method3039(260, arg2);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method142(boolean arg0, int arg1) {
        ++field2556;
        if (arg1 != 255) {
            this.field2559 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z", line = 30)
    public final boolean method138(int arg0) {
        if (arg0 != 31565) {
            this.field2563 = null;
        }
        ++field2547;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZ)V", line = 43)
    public final void method141(boolean arg0, boolean arg1) {
        ++field2562;
        if (this.field2559 != null) {
            this.field2559.method2853('\u0000', arg0);
            super.field3749.method2988(1, 847872872);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3749.field7565.method1507(-110), 0);
            OpenGL.glMatrixMode(5888);
            super.field3749.method2988(0, 847872872);
            if (~super.field3749.field7532 != ~this.field2557) {
                int var3 = super.field3749.field7532 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field2563, var3);
                    var3 += 2;
                }
                if (this.field2549.field4207) {
                    this.field2558 = (float) (super.field3749.field7532 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field2557 = super.field3749.field7532;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V", line = 86)
    public final void method137(int arg0, int arg1, int arg2) {
        ++field2553;
        if (arg2 > -2) {
            this.method141(true, true);
        }
        if (this.field2559 != null) {
            super.field3749.method2988(1, 847872872);
            if ((128 & arg0) == 0) {
                if (~(1 & arg1) == -2) {
                    if (!this.field2549.field4207) {
                        int var4 = super.field3749.field7532 % 4000 * 16 / 4000;
                        super.field3749.method3006(1, this.field2549.field4206[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field3749.method3006(1, this.field2549.field4205);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2558, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (!this.field2549.field4207) {
                        super.field3749.method3006(1, this.field2549.field4206[0]);
                    } else {
                        super.field3749.method3006(1, this.field2549.field4205);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field3749.method3006(1, (class221) null);
            }
            super.field3749.method2988(0, 847872872);
            if (~(64 & arg0) == -1) {
                class476.field6585[0] = super.field3749.field7644 * super.field3749.field7624;
                class476.field6585[2] = super.field3749.field7669 * super.field3749.field7624;
                class476.field6585[1] = super.field3749.field7631 * super.field3749.field7624;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class476.field6585, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
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

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZIIII)V", line = 157)
    public static final void method1183(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~arg2 > -2) {
            arg2 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        ++field2548;
        int var6 = arg4 + -334;
        if (~var6 <= -1) {
            if (var6 > 100) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = (-class21.field141 + class638.field8852) * var6 / arg3 + class21.field141;
        if (class15.field114 <= var7) {
            if (var7 > class490.field6698) {
                var7 = class490.field6698;
            }
        } else {
            var7 = class15.field114;
        }
        int var8 = arg4 * var7 * 512 / (arg2 * 334);
        if (~var8 > ~class221.field2861) {
            short var9 = class221.field2861;
            var7 = arg2 * var9 * 334 / (arg4 * 512);
            if (class490.field6698 < var7) {
                var7 = class490.field6698;
                int var10 = arg4 * var7 * 512 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg1) {
                    class21.field142.method406();
                    class21.field142.method368(var11, arg4, arg0, -16777216, (byte) -66, arg5);
                    class21.field142.method368(var11, arg4, arg0, -16777216, (byte) -66, arg2 + arg5 + -var11);
                }
                arg5 += var11;
                arg2 -= var11 * 2;
            }
        } else if (class681.field9479 < var8) {
            short var12 = class681.field9479;
            var7 = arg2 * var12 * 334 / (arg4 * 512);
            if (~class15.field114 < ~var7) {
                var7 = class15.field114;
                int var13 = arg2 * var12 * 334 / (var7 * 512);
                int var14 = (arg4 - var13) / 2;
                if (arg1) {
                    class21.field142.method406();
                    class21.field142.method368(arg2, var14, arg0, -16777216, (byte) -66, arg5);
                    class21.field142.method368(arg2, var14, arg0 - -arg4 + -var14, -16777216, (byte) -66, arg5);
                }
                arg0 += var14;
                arg4 -= var14 * 2;
            }
        }
        class406.field5729 = (short) arg2;
        class443.field6174 = arg5;
        class716.field9987 = arg0;
        class374.field5204 = arg4 * var7 / 334;
        class97.field1276 = (short) arg4;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lac;Ldja;)V", line = 252)
    public class213(class541 arg0, class311 arg1) {
        super(arg0);
        this.field2549 = arg1;
        if (super.field3749.field7642 && ~super.field3749.field7621 <= -3) {
            this.field2561 = class320.method1914(0, super.field3749, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field2561 != null) {
                int[][] var3 = class232.method1380(3, 256, false, 64, 0.4F, 0, 4, (byte) -63, 4);
                int[][] var4 = class232.method1380(3, 256, false, 64, 0.4F, 8, 4, (byte) -63, 4);
                this.field2563 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field2563[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2563[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1184(13402);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V", line = 303)
    private final void method1184(int arg0) {
        this.field2559 = new class518(super.field3749, 2);
        ++field2554;
        this.field2559.method2852(0, -30389);
        super.field3749.method2988(1, 847872872);
        super.field3749.method3025(-16777216, arg0 + -13509);
        super.field3749.method3042(7681, arg0 + -4442, 260);
        super.field3749.method3029(770, 0, 34200, 34166);
        super.field3749.method2988(0, 847872872);
        OpenGL.glBindProgramARB(34336, this.field2561.field4312);
        OpenGL.glEnable(34336);
        this.field2559.method2851((byte) -56);
        this.field2559.method2852(1, arg0 + -43791);
        super.field3749.method2988(1, arg0 ^ 847886130);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 != 13402) {
            method1188((class166) null, (class166) null, (byte) -62);
        }
        OpenGL.glMatrixMode(5888);
        super.field3749.method3039(260, 0);
        super.field3749.method3029(770, 0, arg0 ^ 45506, 5890);
        super.field3749.method2988(0, 847872872);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field2559.method2851((byte) 60);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([[FB[[S)[[S", line = 337)
    public static final short[][] method1185(float[][] arg0, byte arg1, short[][] arg2) {
        ++field2551;
        if (arg1 != -78) {
            return null;
        } else {
            for (int var3 = 0; var3 < arg0.length; ++var3) {
                for (int var4 = 0; ~arg2[var3].length < ~var4; ++var4) {
                    arg2[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
                }
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V", line = 370)
    public static void method1186(int arg0) {
        if (arg0 >= 28) {
            field2550 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lsga;", line = 381)
    public static final class70 method1187(Component arg0, boolean arg1, int arg2) {
        ++field2545;
        try {
            if (arg2 != -16777216) {
                method1185((float[][]) null, (byte) -127, (short[][]) null);
            }
            Constructor var3 = Class.forName("fda").getDeclaredConstructor(field2564 != null ? field2564 : (field2564 = method1189("java.awt.Component")), Boolean.TYPE);
            return (class70) var3.newInstance(arg0, new Boolean(arg1));
        } catch (Throwable var4) {
            return new class425(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 405)
    public final void method144(byte arg0) {
        ++field2555;
        if (this.field2559 != null) {
            this.field2559.method2853('\u0001', false);
            if (arg0 <= 25) {
                this.method140((class221) null, false, 69);
            }
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, (class221) null);
            super.field3749.method2988(0, 847872872);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lpha;Lpha;B)V", line = 423)
    public static final void method1188(class166 arg0, class166 arg1, byte arg2) {
        if (arg0.field2079 != null) {
            arg0.method975((byte) 127);
        }
        ++field2560;
        if (arg2 != 27) {
            method1188((class166) null, (class166) null, (byte) 98);
        }
        arg0.field2079 = arg1.field2079;
        arg0.field2080 = arg1;
        arg0.field2079.field2080 = arg0;
        arg0.field2080.field2079 = arg0;
    }
}

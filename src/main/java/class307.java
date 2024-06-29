import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class307 extends class457 {

    @OriginalMember(owner = "client!os", name = "o", descriptor = "Lmc;")
    private class88 field4177;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "Lkm;")
    private class236 field4176;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "[F")
    private float[] field4180;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "J")
    public static long field4179 = -1L;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "Lqp;")
    public static class466 field4191 = new class466("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!os", name = "l", descriptor = "F")
    public static float field4174;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    private int field4175;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "Lbl;")
    public static class458 field4188;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "Lih;")
    private class492 field4183;

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lef;Lmc;)V", line = 5)
    public class307(class338 arg0, class88 arg1) {
        super(arg0);
        this.field4177 = arg1;
        if (super.field6706.field4821 && ~super.field6706.field4839 <= -3) {
            this.field4176 = class359.method2150("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 22908, 34336, super.field6706);
            if (this.field4176 != null) {
                int[][] var3 = class225.method1395(0.4F, 3, 64, 0, false, 4, 8, 198, 256);
                int[][] var4 = class225.method1395(0.4F, 3, 64, 8, false, 4, 8, 198, 256);
                int var5 = 0;
                this.field4180 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field4180[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4180[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1782(30975);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)V", line = 54)
    public final void method430(int arg0, int arg1, boolean arg2) {
        ++field4182;
        if (this.field4183 != null) {
            super.field6706.method1950(-29847, 1);
            if (~(128 & arg1) != -1) {
                super.field6706.method1996(2, (class40) null);
            } else if (this.field4177.field1289) {
                super.field6706.method1996(2, this.field4177.field1280);
            } else {
                int var4 = super.field6706.field4743 % 4000 * 16 / 4000;
                super.field6706.method1996(2, this.field4177.field1284[var4]);
            }
            super.field6706.method1950(-29847, 0);
            if (!arg2) {
                if (~(64 & arg1) == -1) {
                    OpenGL.glGetFloatv(2899, class6.field112, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class6.field112, 0);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                }
                int var5 = 3 & arg1;
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

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZB)V", line = 107)
    public final void method435(boolean arg0, byte arg1) {
        ++field4189;
        if (arg1 <= 32) {
            method1783((byte) -39, -86);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ICB)C", line = 117)
    public static final char method1780(int arg0, char arg1, byte arg2) {
        ++field4185;
        if (arg2 != -31) {
            field4188 = null;
        }
        if (~arg1 <= -193 && arg1 <= 255) {
            if (~arg1 <= -193 && arg1 <= 198) {
                return 'A';
            }
            if (~arg1 == -200) {
                return 'C';
            }
            if (~arg1 <= -201 && ~arg1 >= -204) {
                return 'E';
            }
            if (arg1 >= 204 && ~arg1 >= -208) {
                return 'I';
            }
            if (arg1 == 209 && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 210 && ~arg1 >= -215) {
                return 'O';
            }
            if (~arg1 <= -218 && arg1 <= 220) {
                return 'U';
            }
            if (~arg1 == -222) {
                return 'Y';
            }
            if (arg1 == 223) {
                return 's';
            }
            if (arg1 >= 224 && ~arg1 >= -231) {
                return 'a';
            }
            if (~arg1 == -232) {
                return 'c';
            }
            if (~arg1 <= -233 && arg1 <= 235) {
                return 'e';
            }
            if (~arg1 <= -237 && ~arg1 >= -240) {
                return 'i';
            }
            if (arg1 == 241 && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 242 && ~arg1 >= -247) {
                return 'o';
            }
            if (~arg1 <= -250 && arg1 <= 252) {
                return 'u';
            }
            if (~arg1 == -254 || arg1 == 255) {
                return 'y';
            }
        }
        if (arg1 == 338) {
            return 'O';
        } else if (~arg1 == -340) {
            return 'o';
        } else if (~arg1 == -377) {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 209)
    public final void method433(byte arg0) {
        ++field4181;
        if (this.field4183 != null) {
            this.field4183.method2881(arg0 + -8, '\u0001');
            super.field6706.method1950(-29847, 1);
            if (arg0 == 8) {
                super.field6706.method1996(arg0 + -6, (class40) null);
                super.field6706.method1950(-29847, 0);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lmk;II)V", line = 231)
    public final void method431(class40 arg0, int arg1, int arg2) {
        ++field4184;
        if (arg1 != 384) {
            method1784(5, -26, -18);
        }
        super.field6706.method1996(2, arg0);
        super.field6706.method1974(arg2, arg1 ^ 4993);
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V", line = 243)
    public static void method1781(int arg0) {
        field4188 = null;
        if (arg0 != 1) {
            method1783((byte) -9, -61);
        }
        field4191 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z", line = 255)
    public final boolean method429(int arg0) {
        ++field4192;
        if (arg0 != 0) {
            this.field4180 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V", line = 267)
    private final void method1782(int arg0) {
        this.field4183 = new class492(super.field6706, 2);
        ++field4187;
        this.field4183.method2884(arg0 + -26111, 0);
        super.field6706.method1950(-29847, 1);
        super.field6706.method1992(-16777216, (byte) 126);
        super.field6706.method1963(true, 260, 7681);
        super.field6706.method1973(34166, 0, 0, 770);
        super.field6706.method1950(-29847, 0);
        OpenGL.glBindProgramARB(34336, this.field4176.field3344);
        OpenGL.glEnable(34336);
        this.field4183.method2883(-30137);
        this.field4183.method2884(4864, 1);
        super.field6706.method1950(-29847, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field6706.method1974(0, 4609);
        if (arg0 != 30975) {
            this.field4180 = null;
        }
        super.field6706.method1973(5890, 0, 0, 770);
        super.field6706.method1950(-29847, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field4183.method2883(arg0 + -61112);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)I", line = 300)
    public static final int method1783(byte arg0, int arg1) {
        if (arg0 != 48) {
            field4179 = 99L;
        }
        ++field4190;
        return arg1 & 1023;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(III)Lhg;", line = 311)
    public static final class486 method1784(int arg0, int arg1, int arg2) {
        if (class89.field1305[arg0][arg1][arg2] == null) {
            boolean var3 = class89.field1305[0][arg1][arg2] != null && class89.field1305[0][arg1][arg2].field7112 != null;
            if (var3 && arg0 >= class253.field3523 - 1) {
                return null;
            }
            class19.method121(arg0, arg1, arg2);
        }
        return class89.field1305[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)Lrd;", line = 324)
    public static final class222 method1785(int arg0) {
        ++field4178;
        try {
            if (arg0 != 2899) {
                method1783((byte) -23, 73);
            }
            return (class222) Class.forName("sv").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V", line = 342)
    public final void method434(int arg0, boolean arg1) {
        ++field4186;
        if (this.field4183 != null) {
            this.field4183.method2881(arg0 ^ arg0, '\u0000');
            super.field6706.method1950(-29847, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6706.field4819.method1440((byte) -126), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field6706.method1950(-29847, 0);
            if (super.field6706.field4743 != this.field4175) {
                int var3 = super.field6706.field4743 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field4180, var4);
                    var4 += 2;
                }
                if (!this.field4177.field1289) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var6 = (float) (super.field6706.field4743 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                }
                this.field4175 = super.field6706.field4743;
            }
        }
    }
}

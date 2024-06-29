import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class289 extends class187 {

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lol;")
    private class301 field3990;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lwea;")
    private class168 field3980;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[F")
    private float[] field3981;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field3986 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field3991 = -1;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "F")
    private float field3987;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lcga;")
    private class509 field3988;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZB)V")
    public final void method168(boolean arg0, byte arg1) {
        ++field3984;
        if (this.field3988 != null) {
            this.field3988.method2906('\u0000', 88);
            super.field2885.method1002(1, -5172);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2885.field1970.method3962(-128), 0);
            OpenGL.glMatrixMode(5888);
            super.field2885.method1002(0, -5172);
            int var3 = -21 / ((arg1 - 36) / 48);
            if (~super.field2885.field1938 != ~this.field3985) {
                int var4 = super.field2885.field1938 % 5000 * 128 / 5000;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field3981, var4);
                    var4 += 2;
                }
                if (this.field3990.field4146) {
                    this.field3987 = (float) (super.field2885.field1938 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field3985 = super.field2885.field1938;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lha;Lkc;Lda;Ljava/lang/String;ZB)V")
    public static final void method1844(class66 arg0, class145 arg1, class67 arg2, String arg3, boolean arg4, byte arg5) {
        ++field3992;
        boolean var6 = !class245.field3481 || class760.method4208(false);
        if (var6) {
            if (class245.field3481 && var6) {
                class145 var12 = class312.field4254;
                class67 var13 = arg0.method476(var12, class439.field5949, true);
                int var14 = var12.method1166((byte) 111, 250, (class604[]) null, arg3);
                int var15 = var12.method1165((class604[]) null, var12.field2447, arg3, 0, 250);
                int var16 = class71.field1048.field745;
                int var17 = var16 - -4;
                int var18 = var17 * 2 + var14;
                int var19 = var17 * 2 + var15;
                if (~class570.field8130 < ~var18) {
                    var18 = class570.field8130;
                }
                if (~class22.field468 < ~var19) {
                    var19 = class22.field468;
                }
                int var20 = class608.field8487.method3006(0, class374.field5075, var18) - -class358.field4899;
                int var21 = class13.field200.method2837(2113, class412.field5635, var19) - -class725.field9967;
                if (class618.field8597) {
                    var20 += class146.method1175(arg5 + -29920);
                    var21 += class605.method3435((byte) -98);
                }
                arg0.method498(class433.field5888, false).method226(class334.field4514.field745 + var20, class334.field4514.field741 + var21, var18 - class334.field4514.field745 * 2, -(class334.field4514.field741 * 2) + var19, 1, 0, 0);
                arg0.method498(class334.field4514, true).method3430(var20, var21);
                class334.field4514.method363();
                arg0.method498(class334.field4514, true).method3430(-var16 + var18 + var20, var21);
                class334.field4514.method365();
                arg0.method498(class334.field4514, true).method3430(-var16 + var20 + var18, -var16 + var21 - -var19);
                class334.field4514.method363();
                arg0.method498(class334.field4514, true).method3430(var20, var19 + var21 + -var16);
                class334.field4514.method365();
                arg0.method498(class71.field1048, true).method3426(var20, var21 - -class334.field4514.field741, var16, -(class334.field4514.field741 * 2) + var19);
                class71.field1048.method374();
                arg0.method498(class71.field1048, true).method3426(var20 - -class334.field4514.field745, var21, var18 - class334.field4514.field745 * 2, var16);
                class71.field1048.method374();
                arg0.method498(class71.field1048, true).method3426(-var16 + var20 + var18, class334.field4514.field741 + var21, var16, var19 - class334.field4514.field741 * 2);
                class71.field1048.method374();
                arg0.method498(class71.field1048, true).method3426(class334.field4514.field745 + var20, var19 - var16 + var21, var18 - class334.field4514.field745 * 2, var16);
                class71.field1048.method374();
                var13.method599((byte) -2, arg3, var21 - -var17, 1, var18 - var17 * 2, (class514) null, 0, 0, 1, var19 - var17 * 2, 0, -1, (int[]) null, (class604[]) null, var17 + var20, class413.field5659 | -16777216);
                class735.method4081(var20, var21, var18, var19, (byte) -115);
            } else {
                int var7 = arg1.method1166((byte) 83, 250, (class604[]) null, arg3);
                int var8 = arg1.method1173(arg3, 250, 174, (class604[]) null) * 13;
                byte var9 = 4;
                int var10 = var9 + 6;
                int var11 = var9 + 6;
                arg0.method537(-var9 + var10, var11 - var9, var7 + var9 - -var9, var8 + var9 - -var9, -16777216, 0);
                arg0.method519(-var9 + var10, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -1, 0);
                arg2.method599((byte) -15, arg3, var11, 1, var7, (class514) null, 0, 0, 1, var8, 0, -1, (int[]) null, (class604[]) null, var10, -1);
                class735.method4081(-var9 + var10, -var9 + var11, var7 + var9 + var9, var8 - -var9 + var9, (byte) -99);
            }
            if (arg4) {
                try {
                    if (!class618.field8597) {
                        arg0.method483(-2);
                    } else {
                        class407.method2429(arg5 + -112);
                    }
                } catch (class789 var22) {
                }
            }
            if (arg5 != 11) {
                field3982 = -13;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lhk;Lol;)V")
    public class289(class111 arg0, class301 arg1) {
        super(arg0);
        this.field3990 = arg1;
        if (super.field2885.field2062 && ~super.field2885.field2059 <= -3) {
            this.field3980 = class127.method1089(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 3, super.field2885);
            if (this.field3980 != null) {
                int[][] var3 = class414.method2448(4, 124, 0.4F, false, 4, 3, 64, 0, 256);
                int[][] var4 = class414.method2448(4, 126, 0.4F, false, 4, 3, 64, 8, 256);
                int var5 = 0;
                this.field3981 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field3981[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3981[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1846((byte) 65);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
    public final void method172(int arg0, boolean arg1) {
        ++field3994;
        if (arg0 < 56) {
            field3986 = 127;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static final void method1845(int arg0) {
        class335.field4519 = -1;
        class434.field5905 = null;
        if (arg0 != 0) {
            method1847(-106, (String) null, 66);
        }
        class278.field3847 = -1;
        class290.field4002 = null;
        class449.field6157 = null;
        class666.field9267 = -1;
        ++field3979;
        class369.field5000 = null;
        class678.field9440 = -1;
        class240.field3416 = null;
        class687.field9555 = null;
        class282.field3918 = null;
        class313.field4273.method2272(arg0 ^ 68);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZI)V")
    public final void method170(int arg0, boolean arg1, int arg2) {
        ++field3995;
        if (this.field3988 != null) {
            super.field2885.method1002(1, -5172);
            if (arg1) {
                if (~(arg0 & 128) != -1) {
                    super.field2885.method939((class18) null, 8448);
                } else if ((arg2 & 1) != 1) {
                    if (!this.field3990.field4146) {
                        super.field2885.method939(this.field3990.field4139[0], 8448);
                    } else {
                        super.field2885.method939(this.field3990.field4142, 8448);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (this.field3990.field4146) {
                    super.field2885.method939(this.field3990.field4142, 8448);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3987, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field2885.field1938 % 4000 * 16 / 4000;
                    super.field2885.method939(this.field3990.field4139[var4], 8448);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                super.field2885.method1002(0, -5172);
                if ((arg0 & 64) == 0) {
                    class584.field8264[0] = super.field2885.field2014 * super.field2885.field1971;
                    class584.field8264[2] = super.field2885.field1990 * super.field2885.field1971;
                    class584.field8264[1] = super.field2885.field1977 * super.field2885.field1971;
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class584.field8264, 0);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                }
                int var5 = arg0 & 3;
                if (~var5 == -3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (~var5 != -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    private final void method1846(byte arg0) {
        ++field3983;
        this.field3988 = new class509(super.field2885, 2);
        this.field3988.method2902(0, 4864);
        super.field2885.method1002(1, -5172);
        super.field2885.method963(255, -16777216);
        super.field2885.method990(260, 7681, -29641);
        super.field2885.method980(0, 34166, true, 770);
        super.field2885.method1002(0, -5172);
        if (arg0 < 22) {
            field3991 = -25;
        }
        OpenGL.glBindProgramARB(34336, this.field3980.field2706);
        OpenGL.glEnable(34336);
        this.field3988.method2901(4);
        this.field3988.method2902(1, 4864);
        super.field2885.method1002(1, -5172);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2885.method999(true, 0);
        super.field2885.method980(0, 5890, true, 770);
        super.field2885.method1002(0, -5172);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3988.method2901(4);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1847(int arg0, String arg1, int arg2) {
        ++field3997;
        class281 var3 = class54.method395((byte) -53, (long) arg2, 2);
        int var4 = -4 % ((arg0 - 14) / 52);
        var3.method1821((byte) 116);
        var3.field3913 = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBLqk;)V")
    public final void method167(int arg0, byte arg1, class18 arg2) {
        ++field3989;
        super.field2885.method939(arg2, arg1 + 8574);
        super.field2885.method999(true, arg0);
        if (arg1 != -126) {
            this.field3980 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        ++field3996;
        if (this.field3988 != null) {
            this.field3988.method2906('\u0001', 82);
            super.field2885.method1002(1, -5172);
            super.field2885.method939((class18) null, 8448);
            if (!arg0) {
                this.method167(-22, (byte) -128, (class18) null);
            }
            super.field2885.method1002(0, -5172);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        if (arg0 != 20220) {
            return true;
        } else {
            ++field3993;
            return true;
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class459 extends class11 {

    @OriginalMember(owner = "client!iba", name = "u", descriptor = "Lme;")
    private class168 field6855;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "Ljm;")
    private class600 field6845;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "[F")
    private float[] field6849;

    @OriginalMember(owner = "client!iba", name = "s", descriptor = "I")
    public static int field6853 = 500;

    @OriginalMember(owner = "client!iba", name = "y", descriptor = "F")
    private float field6859;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "I")
    private int field6850;

    @OriginalMember(owner = "client!iba", name = "q", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!iba", name = "t", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!iba", name = "v", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!iba", name = "w", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!iba", name = "x", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "Lub;")
    private class19 field6847;

    @OriginalMember(owner = "client!iba", name = "r", descriptor = "Lkea;")
    public static class203 field6852;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        if (arg0 != 95) {
            this.method63(-95);
        }
        ++field6844;
        return true;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIILvi;IIIIII)Z")
    public static final boolean method2827(int arg0, int arg1, int arg2, int arg3, int arg4, class468 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field6854;
        int var12 = arg9;
        int var13 = arg2;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg9;
        int var17 = -var15 + arg2;
        class464.field6901[var14][var15] = 99;
        class223.field3137[var14][var15] = 0;
        if (arg1 != -31758) {
            method2828(44);
        }
        byte var18 = 0;
        class110.field1357[var18] = arg9;
        int var19 = 0;
        int var35 = var18 + 1;
        class448.field6691[var18] = arg2;
        int[][] var20 = arg5.field6941;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (~var35 == ~var19) {
                                    class52.field545 = var12;
                                    class327.field4721 = var13;
                                    return false;
                                }
                                var13 = class448.field6691[var19];
                                var12 = class110.field1357[var19];
                                var19 = 4095 & var19 + 1;
                                var21 = var12 - var16;
                                var22 = -var17 + var13;
                                var23 = var12 - arg5.field6949;
                                var24 = -arg5.field6943 + var13;
                                if (arg6 != -4) {
                                    if (~arg6 != 2) {
                                        if (~arg6 != 1) {
                                            if (~arg6 != 0) {
                                                if (arg6 != 0 && arg6 != 1 && arg6 != 2 && arg6 != 3 && arg6 != 9) {
                                                    if (arg5.method2872(arg0, (byte) -23, var13, var12, arg6, arg7, arg8, arg4)) {
                                                        class327.field4721 = var13;
                                                        class52.field545 = var12;
                                                        return true;
                                                    }
                                                } else if (arg5.method2873(arg6, arg1 + 31825, arg4, arg0, arg8, var13, var12, arg7)) {
                                                    class52.field545 = var12;
                                                    class327.field4721 = var13;
                                                    return true;
                                                }
                                            } else if (arg5.method2860(arg3, var13, (byte) 95, arg11, arg8, arg0, var12, arg10, arg7)) {
                                                class327.field4721 = var13;
                                                class52.field545 = var12;
                                                return true;
                                            }
                                        } else if (arg5.method2859(var12, arg7, arg11, arg10, arg8, arg0, var13, (byte) -70, arg3, arg7)) {
                                            class52.field545 = var12;
                                            class327.field4721 = var13;
                                            return true;
                                        }
                                    } else if (class170.method980(arg0, arg1 ^ -31752, arg7, var13, arg3, arg8, var12, arg11, arg7)) {
                                        class52.field545 = var12;
                                        class327.field4721 = var13;
                                        return true;
                                    }
                                } else if (arg0 == var12 && ~arg8 == ~var13) {
                                    class52.field545 = var12;
                                    class327.field4721 = var13;
                                    return true;
                                }
                                var26 = class223.field3137[var21][var22] + 1;
                                if (~var21 < -1 && class464.field6901[var21 + -1][var22] == 0 && ~(1134821376 & var20[var23 + -1][var24]) == -1 && ~(1310982144 & var20[var23 - 1][arg7 + var24 + -1]) == -1) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg7 + -1) {
                                            class110.field1357[var35] = var12 + -1;
                                            class448.field6691[var35] = var13;
                                            class464.field6901[var21 + -1][var22] = 2;
                                            var35 = 4095 & var35 + 1;
                                            class223.field3137[var21 + -1][var22] = var26;
                                            break;
                                        }
                                        if (~(1336147968 & var20[var23 - 1][var24 + var27]) != -1) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (-arg7 + 128 > var21 && class464.field6901[var21 + 1][var22] == 0 && ~(1625554944 & var20[arg7 + var23][var24]) == -1 && (2015625216 & var20[arg7 + var23][arg7 + -1 + var24]) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (~(arg7 - 1) >= ~var28) {
                                            class110.field1357[var35] = var12 + 1;
                                            class448.field6691[var35] = var13;
                                            class464.field6901[var21 + 1][var22] = 8;
                                            var35 = 4095 & var35 + 1;
                                            class223.field3137[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var24 - -var28] & 2028208128) != 0) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (var22 > 0 && class464.field6901[var21][var22 + -1] == 0 && (var20[var23][var24 + -1] & 1134821376) == 0 && ~(var20[arg7 + var23 + -1][var24 - 1] & 1625554944) == -1) {
                                    int var29 = 1;
                                    while (true) {
                                        if (~(arg7 - 1) >= ~var29) {
                                            class110.field1357[var35] = var12;
                                            class448.field6691[var35] = var13 + -1;
                                            class464.field6901[var21][var22 + -1] = 1;
                                            var35 = var35 + 1 & 4095;
                                            class223.field3137[var21][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((1675886592 & var20[var23 + var29][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~(128 - arg7) < ~var22 && class464.field6901[var21][var22 + 1] == 0 && ~(var20[var23][arg7 + var24] & 1310982144) == -1 && ~(var20[arg7 + -1 + var23][arg7 + var24] & 2015625216) == -1) {
                                    int var30 = 1;
                                    while (true) {
                                        if (~(arg7 + -1) >= ~var30) {
                                            class110.field1357[var35] = var12;
                                            class448.field6691[var35] = var13 + 1;
                                            var35 = var35 + 1 & 4095;
                                            class464.field6901[var21][var22 + 1] = 4;
                                            class223.field3137[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if (~(2116288512 & var20[var23 - -var30][arg7 + var24]) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (~var21 < -1 && var22 > 0 && ~class464.field6901[var21 + -1][var22 + -1] == -1 && (var20[var23 - 1][var24 + -1] & 1134821376) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg7 <= var31) {
                                            class110.field1357[var35] = var12 + -1;
                                            class448.field6691[var35] = var13 + -1;
                                            var35 = var35 - -1 & 4095;
                                            class464.field6901[var21 - 1][var22 + -1] = 3;
                                            class223.field3137[var21 - 1][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + -1][var24 + -1 + var31] & 1336147968) != 0 || (1675886592 & var20[var23 - 1 + var31][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (-arg7 + 128 > var21 && ~var22 < -1 && class464.field6901[var21 + 1][var22 + -1] == 0 && ~(1625554944 & var20[arg7 + var23][var24 + -1]) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg7 <= var32) {
                                            class110.field1357[var35] = var12 + 1;
                                            class448.field6691[var35] = var13 + -1;
                                            var35 = 4095 & var35 - -1;
                                            class464.field6901[var21 - -1][var22 + -1] = 9;
                                            class223.field3137[var21 + 1][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((2028208128 & var20[arg7 + var23][var24 + -1 + var32]) != 0 || (1675886592 & var20[var23 + var32][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (~var21 < -1 && -arg7 + 128 > var22 && ~class464.field6901[var21 + -1][var22 + 1] == -1 && (var20[var23 + -1][arg7 + var24] & 1310982144) == 0) {
                                    for (int var33 = 1; var33 < arg7; ++var33) {
                                        if (~(1336147968 & var20[var23 + -1][var24 + var33]) != -1 || ~(var20[var23 + -1 + var33][arg7 + var24] & 2116288512) != -1) {
                                            continue label263;
                                        }
                                    }
                                    class110.field1357[var35] = var12 + -1;
                                    class448.field6691[var35] = var13 - -1;
                                    class464.field6901[var21 - 1][var22 + 1] = 6;
                                    var35 = 4095 & var35 + 1;
                                    class223.field3137[var21 + -1][var22 - -1] = var26;
                                }
                            } while (var21 >= -arg7 + 128);
                        } while (~var22 <= ~(-arg7 + 128));
                    } while (class464.field6901[var21 - -1][var22 + 1] != 0);
                } while ((var20[arg7 + var23][arg7 + var24] & 2015625216) != 0);
                for (int var34 = 1; ~var34 > ~arg7; ++var34) {
                    if ((2116288512 & var20[var23 + var34][arg7 + var24]) != 0 || ~(var20[arg7 + var23][var24 + var34] & 2028208128) != -1) {
                        continue label286;
                    }
                }
                class110.field1357[var35] = var12 + 1;
                class448.field6691[var35] = var13 - -1;
                class464.field6901[var21 - -1][var22 + 1] = 12;
                var35 = 4095 & var35 - -1;
                class223.field3137[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIB)V")
    public final void method62(int arg0, int arg1, byte arg2) {
        ++field6857;
        if (this.field6847 != null) {
            super.field95.method2269((byte) 26, 1);
            if (arg2 < 124) {
                this.method2830((byte) 77);
            }
            if (~(128 & arg0) != -1) {
                super.field95.method2295(-54, (class507) null);
            } else if (~(1 & arg1) == -2) {
                if (this.field6855.field2048) {
                    super.field95.method2295(-78, this.field6855.field2057);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field6859, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field95.field5351 % 4000 * 16 / 4000;
                    super.field95.method2295(-90, this.field6855.field2054[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (this.field6855.field2048) {
                    super.field95.method2295(-67, this.field6855.field2057);
                } else {
                    super.field95.method2295(-61, this.field6855.field2054[0]);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field95.method2269((byte) -107, 0);
            if (~(arg0 & 64) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class460.field6868, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class460.field6868, 0);
            }
            int var5 = 3 & arg0;
            if (~var5 != -3) {
                if (var5 == 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public final void method63(int arg0) {
        int var2 = -84 / ((arg0 - -61) / 40);
        ++field6860;
        if (this.field6847 != null) {
            this.field6847.method122('\u0001', (byte) 91);
            super.field95.method2269((byte) 56, 1);
            super.field95.method2295(-113, (class507) null);
            super.field95.method2269((byte) 28, 0);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZZ)V")
    public final void method64(boolean arg0, boolean arg1) {
        if (!arg0) {
            method2829(false, -76);
        }
        ++field6848;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZ)V")
    public final void method67(int arg0, boolean arg1) {
        ++field6858;
        if (this.field6847 != null) {
            this.field6847.method122('\u0000', (byte) 117);
            super.field95.method2269((byte) 9, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field95.field5430.method2013(61), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field95.method2269((byte) 73, 0);
            if (arg0 < 115) {
                this.field6859 = 1.1413968F;
            }
            if (~super.field95.field5351 != ~this.field6850) {
                int var3 = super.field95.field5351 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field6849, var4);
                    var4 += 2;
                }
                if (this.field6855.field2048) {
                    this.field6859 = (float) (super.field95.field5351 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field6850 = super.field95.field5351;
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
    public static void method2828(int arg0) {
        field6852 = null;
        if (arg0 != 4000) {
            field6852 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2829(boolean arg0, int arg1) {
        ++field6846;
        if (!arg0) {
            method2828(-33);
        }
        return ~arg1 == -1 || arg1 == 2 || arg1 == 4;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IILpm;)V")
    public final void method65(int arg0, int arg1, class507 arg2) {
        super.field95.method2295(-68, arg2);
        ++field6856;
        super.field95.method2288(arg0, 7681);
        if (arg1 != -1) {
            this.field6850 = 126;
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)V")
    private final void method2830(byte arg0) {
        ++field6851;
        this.field6847 = new class19(super.field95, 2);
        this.field6847.method121((byte) -18, 0);
        super.field95.method2269((byte) 69, 1);
        super.field95.method2300((byte) -47, -16777216);
        super.field95.method2320(7681, 260, arg0 + -96);
        super.field95.method2333(770, 34166, 0, (byte) 103);
        super.field95.method2269((byte) -120, 0);
        OpenGL.glBindProgramARB(34336, this.field6845.field8766);
        OpenGL.glEnable(34336);
        this.field6847.method124(7);
        this.field6847.method121((byte) -18, 1);
        super.field95.method2269((byte) 18, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field95.method2288(0, 7681);
        super.field95.method2333(770, 5890, 0, (byte) 119);
        super.field95.method2269((byte) -94, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        if (arg0 != 96) {
            this.method65(96, 74, (class507) null);
        }
        this.field6847.method124(7);
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lad;Lme;)V")
    public class459(class362 arg0, class168 arg1) {
        super(arg0);
        this.field6855 = arg1;
        if (super.field95.field5467 && super.field95.field5418 >= 2) {
            this.field6845 = class455.method2811(super.field95, 34336, false, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field6845 != null) {
                int[][] var3 = class156.method904(4, 8, 0, 3, false, 0, 0.4F, 256, 64);
                int[][] var4 = class156.method904(4, 8, 0, 3, false, 8, 0.4F, 256, 64);
                int var5 = 0;
                this.field6849 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field6849[var5++] = (float) var7[var9] / 4096.0F;
                        this.field6849[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2830((byte) 96);
            }
        }
    }
}

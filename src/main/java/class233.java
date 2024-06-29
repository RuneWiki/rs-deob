import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class233 extends class16 {

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lum;")
    private class479 field2971;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lph;")
    private class587 field2968;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[F")
    private float[] field2965;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "[I")
    public static int[] field2975 = new int[250];

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2978 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "F")
    private float field2962;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lgq;")
    private class470 field2969;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[S")
    public static short[] field2959;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[[I")
    public static int[][] field2974;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBIIII)V", line = 3)
    public static final void method1352(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2979;
        class394.method2149(false, arg1);
        int var7 = 0;
        int var8 = -arg0 + arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (~class58.field602 >= ~arg6 && ~class501.field7217 <= ~arg6) {
            int[] var15 = class156.field1755[arg6];
            int var16 = class512.method2932((byte) -46, -arg1 + arg5, class163.field1942, class326.field4246);
            int var17 = class512.method2932((byte) -46, arg1 + arg5, class163.field1942, class326.field4246);
            int var18 = class512.method2932((byte) -46, arg5 - var8, class163.field1942, class326.field4246);
            int var19 = class512.method2932((byte) -46, arg5 + var8, class163.field1942, class326.field4246);
            class445.method2463(var16, 115, var18, arg3, var15);
            class445.method2463(var18, arg2 + 217, var19, arg4, var15);
            class445.method2463(var19, 93, var17, arg3, var15);
        }
        if (arg2 == -101) {
            while (var9 > var7) {
                var13 += 2;
                var14 += 2;
                var12 += var14;
                var10 += var13;
                if (var12 >= 0 && ~var11 <= -2) {
                    --var11;
                    class366.field4782[var11] = var7;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (~var10 <= -1) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = -var9 + arg6;
                    int var21 = arg6 + var9;
                    if (~class58.field602 >= ~var21 && ~class501.field7217 <= ~var20) {
                        if (~var9 <= ~var8) {
                            int var22 = class512.method2932((byte) -46, arg5 + var7, class163.field1942, class326.field4246);
                            int var23 = class512.method2932((byte) -46, -var7 + arg5, class163.field1942, class326.field4246);
                            if (class501.field7217 >= var21) {
                                class445.method2463(var23, 108, var22, arg3, class156.field1755[var21]);
                            }
                            if (~var20 <= ~class58.field602) {
                                class445.method2463(var23, 101, var22, arg3, class156.field1755[var20]);
                            }
                        } else {
                            int var24 = class366.field4782[var9];
                            int var25 = class512.method2932((byte) -46, arg5 + var7, class163.field1942, class326.field4246);
                            int var26 = class512.method2932((byte) -46, arg5 - var7, class163.field1942, class326.field4246);
                            int var27 = class512.method2932((byte) -46, arg5 + var24, class163.field1942, class326.field4246);
                            int var28 = class512.method2932((byte) -46, arg5 - var24, class163.field1942, class326.field4246);
                            if (var21 <= class501.field7217) {
                                int[] var29 = class156.field1755[var21];
                                class445.method2463(var26, 105, var28, arg3, var29);
                                class445.method2463(var28, 98, var27, arg4, var29);
                                class445.method2463(var27, 93, var25, arg3, var29);
                            }
                            if (var20 >= class58.field602) {
                                int[] var30 = class156.field1755[var20];
                                class445.method2463(var26, 101, var28, arg3, var30);
                                class445.method2463(var28, 120, var27, arg4, var30);
                                class445.method2463(var27, 93, var25, arg3, var30);
                            }
                        }
                    }
                }
                int var31 = -var7 + arg6;
                int var32 = arg6 + var7;
                if (~var32 <= ~class58.field602 && class501.field7217 >= var31) {
                    int var33 = arg5 + var9;
                    int var34 = -var9 + arg5;
                    if (~class326.field4246 >= ~var33 && var34 <= class163.field1942) {
                        int var35 = class512.method2932((byte) -46, var33, class163.field1942, class326.field4246);
                        int var36 = class512.method2932((byte) -46, var34, class163.field1942, class326.field4246);
                        if (var8 <= var7) {
                            if (class501.field7217 >= var32) {
                                class445.method2463(var36, 99, var35, arg3, class156.field1755[var32]);
                            }
                            if (class58.field602 <= var31) {
                                class445.method2463(var36, 120, var35, arg3, class156.field1755[var31]);
                            }
                        } else {
                            int var37 = var7 > var11 ? class366.field4782[var7] : var11;
                            int var38 = class512.method2932((byte) -46, arg5 + var37, class163.field1942, class326.field4246);
                            int var39 = class512.method2932((byte) -46, arg5 - var37, class163.field1942, class326.field4246);
                            if (var32 <= class501.field7217) {
                                int[] var40 = class156.field1755[var32];
                                class445.method2463(var36, 96, var39, arg3, var40);
                                class445.method2463(var39, 109, var38, arg4, var40);
                                class445.method2463(var38, 103, var35, arg3, var40);
                            }
                            if (var31 >= class58.field602) {
                                int[] var41 = class156.field1755[var31];
                                class445.method2463(var36, 113, var39, arg3, var41);
                                class445.method2463(var39, 120, var38, arg4, var41);
                                class445.method2463(var38, 93, var35, arg3, var41);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 187)
    public final void method48(byte arg0) {
        ++field2972;
        if (this.field2969 != null) {
            this.field2969.method2666('\u0001', (byte) 110);
            int var2 = 57 / ((-29 - arg0) / 51);
            super.field141.method2380(1, (byte) -77);
            super.field141.method2388((byte) 97, (class412) null);
            super.field141.method2380(0, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 205)
    public static final void method1353(int arg0) {
        if (arg0 > -5) {
            field2978 = -53;
        }
        for (int var1 = 0; ~class118.field1356 < ~var1; ++var1) {
            int var2 = class664.field9449[var1];
            class443 var3 = (class443) class392.field5223.method3234((byte) -76, (long) var2);
            if (var3 != null) {
                class625 var4 = var3.field6107;
                class368.method2014(var4, var4.field8855.field234, (byte) -50);
            }
        }
        ++field2966;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I", line = 235)
    public static final int method1354(int arg0, int arg1) {
        if (arg0 != 813637996) {
            return 62;
        } else {
            ++field2976;
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 + -61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)V", line = 252)
    public final void method46(byte arg0, boolean arg1) {
        ++field2973;
        if (arg0 != -61) {
            this.method46((byte) 7, false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 267)
    public static final void method1355(boolean arg0) {
        ++field2963;
        class518.field7399.method3170((byte) 117);
        class470.field6554.method3170((byte) 123);
        for (class208 var1 = (class208) class530.field7597.method3174((byte) 49); var1 != null; var1 = (class208) class530.field7597.method3168(false)) {
            int var18 = var1.field2527;
            if (~var18 > -1001) {
                var1.method1519((byte) 121);
                if (~var18 != -19 && ~var18 != -31 && var18 != 23 && var18 != 44 && ~var18 != -5 && var18 != 49 && ~var18 != -21) {
                    class518.field7399.method3164(var1, 256);
                } else {
                    class470.field6554.method3164(var1, 256);
                }
            }
        }
        class518.field7399.method3162(class530.field7597, (byte) -119);
        class470.field6554.method3162(class530.field7597, (byte) -117);
        if (class145.field1625 > 1) {
            if (class602.field8543 && class653.field9339.method1805((byte) -101, 81) && ~class145.field1625 < -3) {
                class122.field1377 = (class208) class530.field7597.field7992.field3404.field3404;
            } else {
                class122.field1377 = (class208) class530.field7597.field7992.field3404;
            }
        } else {
            class122.field1377 = null;
        }
        int var2 = -1;
        class460 var3 = (class460) class285.field3607.method3174((byte) 49);
        if (var3 != null) {
            var2 = var3.method787(4733);
        }
        if (arg0) {
            method1352(-22, -13, (byte) -8, -101, 102, -61, 88);
        }
        if (!class215.field2615) {
            if (~var2 == -1 && (~class438.field6096 == -2 && class145.field1625 > 2 || class546.method3093(6))) {
                var2 = 2;
            }
            if (~var2 == -3 && class145.field1625 > 0 && var3 != null) {
                if (class464.field6446 == null && ~class328.field4266 == -1) {
                    class330.method1864(var3.method785(-6), -116, var3.method786(22461));
                } else {
                    class35.field400 = 2;
                }
            }
            if (var2 == 0 && class145.field1625 > 0) {
                class567.method3203(67);
            }
            if (class464.field6446 == null && class328.field4266 == 0) {
                class676.field9587 = null;
                class35.field400 = 0;
                return;
            }
        } else {
            if (~var2 == 0) {
                int var4 = class407.field5419.method162(-26561);
                int var5 = class407.field5419.method161(31285);
                if (~var4 > ~(client.field3414 - 10) || class350.field4586 + 10 + client.field3414 < var4 || ~(class553.field7888 - 10) < ~var5 || ~var5 < ~(class553.field7888 + 10 + class70.field749)) {
                    class32.method171(124);
                }
            }
            if (var2 != 0) {
                return;
            }
            int var6 = client.field3414;
            int var7 = class553.field7888;
            int var8 = class350.field4586;
            int var9 = var3.method785(-6);
            int var10 = var3.method786(22461);
            int var11 = -1;
            for (int var12 = 0; ~var12 > ~class145.field1625; ++var12) {
                if (!class604.field8551) {
                    int var16 = (class145.field1625 - 1 - var12) * 16 + 31 + var7;
                    if (var9 > var6 && ~var9 > ~(var6 + var8) && ~(var16 + -13) > ~var10 && var16 + 3 > var10) {
                        var11 = var12;
                    }
                } else {
                    int var17 = var7 - -((-var12 + -1 + class145.field1625) * 16) + 33;
                    if (~var6 > ~var9 && var6 + var8 > var9 && ~(var17 + -13) > ~var10 && var10 < var17 + 4) {
                        var11 = var12;
                    }
                }
            }
            if (~var11 != 0) {
                int var13 = 0;
                class542 var14 = new class542(class530.field7597);
                for (class208 var15 = (class208) var14.method3080(31590); var15 != null; var15 = (class208) var14.method3075((byte) -92)) {
                    if (var11 == var13) {
                        class136.method760(var15, var10, var9, -89);
                    }
                    ++var13;
                }
            }
            class32.method171(75);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lap;Lum;)V", line = 436)
    public class233(class435 arg0, class479 arg1) {
        super(arg0);
        this.field2971 = arg1;
        if (super.field141.field5949 && ~super.field141.field5986 <= -3) {
            this.field2968 = class567.method3204(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 7758, super.field141);
            if (this.field2968 != null) {
                int[][] var3 = class253.method1451(0.4F, 0, false, (byte) 122, 4, 256, 64, 8, 3);
                int[][] var4 = class253.method1451(0.4F, 8, false, (byte) 83, 4, 256, 64, 8, 3);
                this.field2965 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field2965[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2965[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1357((byte) 52);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 486)
    public static void method1356(int arg0) {
        field2975 = null;
        field2959 = null;
        field2974 = null;
        if (arg0 >= -74) {
            method1352(-96, 61, (byte) 70, -87, -97, -73, 63);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILuda;)V", line = 500)
    public final void method44(int arg0, int arg1, class412 arg2) {
        if (arg1 != -1) {
            this.method42(9, -74, true);
        }
        super.field141.method2388((byte) -80, arg2);
        ++field2961;
        super.field141.method2396(arg0, arg1);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZB)V", line = 514)
    public final void method50(boolean arg0, byte arg1) {
        ++field2960;
        if (this.field2969 != null) {
            this.field2969.method2666('\u0000', (byte) 110);
            super.field141.method2380(1, (byte) -115);
            OpenGL.glMatrixMode(5890);
            if (arg1 == 42) {
                OpenGL.glLoadMatrixf(super.field141.field6011.method3342((byte) 92), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field141.method2380(0, (byte) -69);
                if (super.field141.field5926 != this.field2967) {
                    int var3 = super.field141.field5926 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; ~var5 > -65; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2965, var4);
                        var4 += 2;
                    }
                    if (this.field2971.field7036) {
                        this.field2962 = (float) (super.field141.field5926 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field2967 = super.field141.field5926;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z", line = 566)
    public final boolean method52(int arg0) {
        ++field2970;
        return arg0 == 12733;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V", line = 577)
    private final void method1357(byte arg0) {
        this.field2969 = new class470(super.field141, 2);
        ++field2977;
        this.field2969.method2667(0, -30923);
        super.field141.method2380(1, (byte) -73);
        super.field141.method2327(-28003, -16777216);
        super.field141.method2371(260, 7681, -114);
        super.field141.method2390(34166, true, 0, 770);
        super.field141.method2380(0, (byte) -115);
        OpenGL.glBindProgramARB(34336, this.field2968.field8337);
        if (arg0 == 52) {
            OpenGL.glEnable(34336);
            this.field2969.method2668(1);
            this.field2969.method2667(1, -30923);
            super.field141.method2380(1, (byte) -126);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field141.method2396(0, -1);
            super.field141.method2390(5890, true, 0, 770);
            super.field141.method2380(0, (byte) -71);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field2969.method2668(1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)V", line = 609)
    public final void method42(int arg0, int arg1, boolean arg2) {
        ++field2964;
        if (!arg2) {
            if (this.field2969 != null) {
                super.field141.method2380(1, (byte) -78);
                if (~(arg0 & 128) == -1) {
                    if ((arg1 & 1) != 1) {
                        if (this.field2971.field7036) {
                            super.field141.method2388((byte) -106, this.field2971.field7033);
                        } else {
                            super.field141.method2388((byte) -59, this.field2971.field7034[0]);
                        }
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else if (!this.field2971.field7036) {
                        int var4 = super.field141.field5926 % 4000 * 16 / 4000;
                        super.field141.method2388((byte) 122, this.field2971.field7034[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field141.method2388((byte) -71, this.field2971.field7033);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2962, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    super.field141.method2388((byte) -45, (class412) null);
                }
                super.field141.method2380(0, (byte) -110);
                if (~(64 & arg0) != -1) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glGetFloatv(2899, class17.field145, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class17.field145, 0);
                }
                int var5 = 3 & arg0;
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
}

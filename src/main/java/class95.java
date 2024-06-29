import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class95 extends class203 {

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "Lsa;")
    private class780 field1105;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "Lcca;")
    private class725 field1102;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "[F")
    private float[] field1117;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field1108 = -1;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "[[I")
    public static int[][] field1111 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "[I")
    public static int[] field1109 = new int[8];

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "F")
    private float field1114;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "Lup;")
    private class545 field1107;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cba", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field1121;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "[Ls;")
    public static class418[] field1115;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
    private final void method680(int arg0) {
        this.field1107 = new class545(super.field2843, 2);
        ++field1112;
        this.field1107.method3227(0, (byte) -125);
        super.field2843.method1262(arg0, 0);
        super.field2843.method1193(-16777216, 16711680);
        super.field2843.method1230(7681, 260, false);
        super.field2843.method1220(34166, 770, 34200, 0);
        super.field2843.method1262(0, arg0 + -1);
        OpenGL.glBindProgramARB(34336, this.field1102.field10037);
        OpenGL.glEnable(34336);
        this.field1107.method3225(79);
        this.field1107.method3227(1, (byte) -117);
        super.field2843.method1262(1, arg0 + -1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2843.method1263(0, 121);
        super.field2843.method1220(5890, 770, 34200, 0);
        super.field2843.method1262(0, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field1107.method3225(-78);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZB)V")
    public final void method681(boolean arg0, byte arg1) {
        if (arg1 >= 0) {
            ++field1101;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIZ)V")
    public final void method682(int arg0, int arg1, boolean arg2) {
        ++field1104;
        if (this.field1107 != null) {
            super.field2843.method1262(1, 0);
            if ((128 & arg1) != 0) {
                super.field2843.method1219((byte) 125, (class539) null);
            } else if ((arg0 & 1) == 1) {
                if (this.field1105.field10723) {
                    super.field2843.method1219((byte) 96, this.field1105.field10720);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field1114, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field2843.field2614 % 4000 * 16 / 4000;
                    super.field2843.method1219((byte) 105, this.field1105.field10718[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (!this.field1105.field10723) {
                    super.field2843.method1219((byte) 84, this.field1105.field10718[0]);
                } else {
                    super.field2843.method1219((byte) 98, this.field1105.field10720);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field2843.method1262(0, 0);
            if (arg2) {
                if (~(arg1 & 64) != -1) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    class670.field9382[2] = super.field2843.field2726 * super.field2843.field2683;
                    class670.field9382[1] = super.field2843.field2750 * super.field2843.field2726;
                    class670.field9382[0] = super.field2843.field2738 * super.field2843.field2726;
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class670.field9382, 0);
                }
                int var5 = arg1 & 3;
                if (~var5 != -3) {
                    if (~var5 == -4) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                    }
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZLwha;)V")
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        super.field2843.method1219((byte) 69, arg2);
        ++field1116;
        super.field2843.method1263(arg0, 92);
        if (arg1) {
            this.method686(104);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLha;I)Z")
    public static final boolean method684(byte arg0, class473 arg1, int arg2) {
        ++field1120;
        int var3 = (class741.field10208 - 104) / 2;
        int var4 = (class525.field7224 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~(var3 + 104) < ~var6; ++var6) {
            for (int var57 = var4; ~var57 > ~(var4 + 104); ++var57) {
                for (int var58 = arg2; var58 <= 3; ++var58) {
                    if (class421.method2541(var58, arg2, -1, var57, var6)) {
                        int var59 = var58;
                        if (class123.method865(var6, var57, 55)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class425.method2566(var59, var6, var57, 1);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class175.field2207 = arg1.method2815(var7, (byte) -39, 512, 512, 512, 0);
            class778.method4285((byte) 69);
            int var9 = (238 - (-((int) (20.0D * Math.random())) + 10) << 8) + ((238 - -((int) (20.0D * Math.random())) - 10 << 16) - 10 - (-((int) (Math.random() * 20.0D)) + -238)) | -16777216;
            int var10 = 238 - (-((int) (20.0D * Math.random())) - -10) << 16 | -16777216;
            if (arg0 != 112) {
                field1111 = null;
            }
            int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (8.0D * Math.random()) << 16 | (int) (8.0D * Math.random());
            boolean[][] var12 = new boolean[class253.field3752 + 1 - -2][class253.field3752 - -1 - -2];
            for (int var13 = var3; var3 + 104 > var13; var13 += class253.field3752) {
                for (int var36 = var4; ~(var4 + 104) < ~var36; var36 += class253.field3752) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (~var13 < -1) {
                        var37 += 4;
                        var39 = var13 - 1;
                    }
                    int var40 = var36;
                    if (~var36 < -1) {
                        var40 = var36 - 1;
                    }
                    int var41 = class253.field3752 + var13;
                    if (var41 < 104) {
                        ++var41;
                    }
                    int var42 = class253.field3752 + var36;
                    if (~var42 > -105) {
                        ++var42;
                        var38 += 4;
                    }
                    arg1.method225(0, 0, var37 - -(class253.field3752 * 4), var38 - -(class253.field3752 * 4));
                    arg1.method230(-16777216);
                    for (int var43 = arg2; var43 <= 3; ++var43) {
                        for (int var50 = 0; class253.field3752 >= var50; ++var50) {
                            for (int var56 = 0; ~var56 >= ~class253.field3752; ++var56) {
                                var12[var50][var56] = class421.method2541(var43, arg2, -1, var40 + var56, var39 - -var50);
                            }
                        }
                        field1115[var43].method1375(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class91.field1065) {
                            for (int var51 = -4; ~class253.field3752 < ~var51; ++var51) {
                                for (int var52 = -4; ~class253.field3752 < ~var52; ++var52) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 - -var52;
                                    if (var53 >= var3 && ~var54 <= ~var4 && class421.method2541(var43, arg2, -1, var54, var53)) {
                                        int var55 = var43;
                                        if (class123.method865(var53, var54, 104)) {
                                            var55 = var43 - 1;
                                        }
                                        if (~var55 <= -1) {
                                            class346.method2181(var51 * 4 + var37, var54, var9, (-var52 + class253.field3752) * 4 + var38 + -4, var10, var55, arg0 + -110, var53, arg1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class91.field1065) {
                        class739 var44 = client.field1305[arg2];
                        for (int var45 = 0; ~var45 > ~class253.field3752; ++var45) {
                            for (int var46 = 0; class253.field3752 > var46; ++var46) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field10184[var47 - var44.field10176][-var44.field10196 + var48];
                                if ((1076101120 & var49) != 0) {
                                    arg1.method2822(4, 4, var37 - -(var45 * 4), arg0 ^ 113, (-var46 + class253.field3752) * 4 + var38 + -4, -1713569622);
                                } else if ((var49 & 8388608) != 0) {
                                    arg1.method2816(4, (byte) -83, var45 * 4 + var37, (class253.field3752 - var46) * 4 + var38 + -4, -1713569622);
                                } else if (~(33554432 & var49) == -1) {
                                    if ((134217728 & var49) == 0) {
                                        if ((536870912 & var49) != 0) {
                                            arg1.method2811(var37 - -(var45 * 4), (class253.field3752 - var46) * 4 + var38 - 4, (byte) 126, 4, -1713569622);
                                        }
                                    } else {
                                        arg1.method2816(4, (byte) -83, var45 * 4 + var37, (class253.field3752 - var46) * 4 + var38 + -1, -1713569622);
                                    }
                                } else {
                                    arg1.method2811(var45 * 4 + var37 - -3, (-var46 + class253.field3752) * 4 - 4 + var38, (byte) -51, 4, -1713569622);
                                }
                            }
                        }
                    }
                    arg1.method233(var37, var38, class253.field3752 * 4, class253.field3752 * 4, var11, 2);
                    class175.field2207.method988((-var3 + var13) * 4 + 48, -(class253.field3752 * 4) + 464 + -((var36 - var4) * 4), class253.field3752 * 4, class253.field3752 * 4, var37, var38);
                }
            }
            arg1.method208();
            arg1.method230(-16777215);
            class23.method99(100);
            class181.field2288 = 0;
            class202.field2841.method1046((byte) -95);
            if (!class91.field1065) {
                for (int var14 = var3; var3 + 104 > var14; ++var14) {
                    for (int var20 = var4; var20 < var4 + 104; ++var20) {
                        for (int var21 = arg2; var21 <= arg2 + 1 && ~var21 >= -4; ++var21) {
                            if (class421.method2541(var21, arg2, -1, var20, var14)) {
                                class466 var22 = (class466) class349.method2197(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class466) class485.method2882(var21, var14, var20, field1121 != null ? field1121 : (field1121 = method689("oc")));
                                }
                                if (var22 == null) {
                                    var22 = (class466) class174.method1110(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class466) class371.method2310(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class286 var23 = class390.field5558.method3065(-123, var22.method760(-27640));
                                    if (!var23.field4195 || class14.field78) {
                                        int var24 = var23.field4209;
                                        if (var23.field4136 != null) {
                                            for (int var25 = 0; var25 < var23.field4136.length; ++var25) {
                                                if (var23.field4136[var25] != -1) {
                                                    class286 var26 = class390.field5558.method3065(-121, var23.field4136[var25]);
                                                    if (var26.field4209 >= 0) {
                                                        var24 = var26.field4209;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class547 var28 = class657.field9274.method514(var24, (byte) 90);
                                                if (var28 != null && var28.field7640) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = client.field1305[var21].field10184;
                                                int var32 = client.field1305[var21].field10176;
                                                int var33 = client.field1305[var21].field10196;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (~var35 == -1 && ~var29 < ~var3 && ~(var14 + -3) > ~var29 && ~(2883848 & var31[-var32 + -1 + var29][-var33 + var30]) == -1) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && ~(var3 + -1 + 104) < ~var29 && ~var29 > ~(var14 + 3) && (var31[var29 - (-1 - -var32)][-var33 + var30] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && var4 < var30 && var30 > var20 + -3 && ~(var31[-var32 + var29][var30 + -1 + -var33] & 2883842) == -1) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && ~var30 > ~(var4 + -1 - -104) && var30 < var20 + 3 && ~(2883872 & var31[-var32 + var29][var30 + 1 - var33]) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class130.field1682[class181.field2288] = var23.field4124;
                                            class49.field593[class181.field2288] = var29;
                                            class535.field7407[class181.field2288] = var30;
                                            ++class181.field2288;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class787.field10808 != null) {
                    class403.field5684.field4076 = 1;
                    class657.field9274.method518(64, 1024, (byte) -95);
                    for (int var15 = 0; class787.field10808.field10472 > var15; ++var15) {
                        int var16 = class787.field10808.field10469[var15];
                        if (var16 >> 28 == class724.field10031.field3467) {
                            int var17 = ((var16 & 268430858) >> 14) + -class444.field6151;
                            int var18 = (var16 & 16383) - class236.field3535;
                            if (~var17 <= -1 && ~class741.field10208 < ~var17 && ~var18 <= -1 && ~class525.field7224 < ~var18) {
                                class202.field2841.method1039(new class324(var15), 0);
                            } else {
                                class547 var19 = class657.field9274.method514(class787.field10808.field10468[var15], (byte) 121);
                                if (var19.field7626 != null && ~(var19.field7613 + var17) <= -1 && var19.field7601 + var17 < class741.field10208 && ~(var19.field7636 + var18) <= -1 && ~class525.field7224 < ~(var19.field7598 + var18)) {
                                    class202.field2841.method1039(new class324(var15), 0);
                                }
                            }
                        }
                    }
                    class657.field9274.method518(64, 128, (byte) -18);
                    class403.field5684.field4076 = 2;
                    class403.field5684.method1844((byte) 112);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lpq;Lsa;)V")
    public class95(class194 arg0, class780 arg1) {
        super(arg0);
        this.field1105 = arg1;
        if (super.field2843.field2737 && super.field2843.field2666 >= 2) {
            this.field1102 = class746.method4129("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", true, 34336, super.field2843);
            if (this.field1102 != null) {
                int[][] var3 = class325.method2058(0, 4, 256, 4, 0.4F, 64, -128, 3, false);
                int[][] var4 = class325.method2058(8, 4, 256, 4, 0.4F, 64, -116, 3, false);
                this.field1117 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field1117[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1117[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method680(1);
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
    public static void method685(byte arg0) {
        if (arg0 == 98) {
            field1111 = null;
            field1109 = null;
            field1115 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        if (arg0 <= 64) {
            this.method681(false, (byte) -112);
        }
        ++field1113;
        if (this.field1107 != null) {
            this.field1107.method3226(6, '\u0001');
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 88, (class539) null);
            super.field2843.method1262(0, 0);
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        ++field1118;
        return arg0 != -12 ? true : true;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BZ)V")
    public final void method688(byte arg0, boolean arg1) {
        ++field1119;
        if (this.field1107 != null) {
            this.field1107.method3226(6, '\u0000');
            super.field2843.method1262(1, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2843.field2646.method281(-27708), 0);
            OpenGL.glMatrixMode(5888);
            super.field2843.method1262(0, 0);
            if (arg0 <= -25) {
                if (super.field2843.field2614 != this.field1106) {
                    int var3 = super.field2843.field2614 % 5000 * 128 / 5000;
                    for (int var4 = 0; var4 < 64; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field1117, var3);
                        var3 += 2;
                    }
                    if (this.field1105.field10723) {
                        this.field1114 = (float) (super.field2843.field2614 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field1106 = super.field2843.field2614;
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method689(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

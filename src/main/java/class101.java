import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class101 extends class229 {

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Lgo;")
    private class442 field1379;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "Lmc;")
    private class87 field1383;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "[F")
    private float[] field1380;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "[Lqp;")
    public static class467[] field1376 = new class467[14];

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "Lwu;")
    private class250 field1387;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Lrs;")
    public static class462 field1373;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "[I")
    public static int[] field1378;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method17(boolean arg0, int arg1) {
        ++field1390;
        if (arg1 != -27632) {
            method671(false, 98);
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V", line = 15)
    public static void method666(int arg0) {
        field1373 = null;
        field1378 = null;
        if (arg0 != -26720) {
            method669(83, 21, false, -95, (class413) null, -58, 52, 89, -87, 17, -117);
        }
        field1376 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 27)
    public final void method19(int arg0) {
        if (arg0 != 262144) {
            this.method19(-48);
        }
        ++field1384;
        if (this.field1387 != null) {
            this.field1387.method1473(-2, '\u0001');
            super.field3194.method2398(1, (byte) 105);
            super.field3194.method2412((byte) 4, (class188) null);
            super.field3194.method2398(0, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lea;IIILss;Lf;ZI)V", line = 47)
    public static final void method667(class382 arg0, int arg1, int arg2, int arg3, class295 arg4, class529 arg5, boolean arg6, int arg7) {
        ++field1388;
        if (arg5 != null) {
            int var8;
            if (~class128.field1742 == -5) {
                var8 = 16383 & (int) class40.field553;
            } else {
                var8 = (int) class40.field553 + class22.field349 & 16383;
            }
            int var9 = 10 + Math.max(arg4.field4022 / 2, arg4.field3960 / 2);
            int var10 = arg2 * arg2 + arg3 * arg3;
            if (~var10 >= ~(var9 * var9)) {
                int var11 = class377.field5316[var8];
                if (arg6) {
                    method666(-49);
                }
                int var12 = class377.field5315[var8];
                if (class128.field1742 != 4) {
                    var12 = var12 * 256 / (class482.field7072 - -256);
                    var11 = var11 * 256 / (class482.field7072 - -256);
                }
                int var13 = arg2 * var12 + arg3 * var11 >> 15;
                int var14 = arg3 * var12 + -(arg2 * var11) >> 15;
                arg5.method122(arg4.field4022 / 2 + arg7 - -var13 - arg5.method126() / 2, arg4.field3960 / 2 + -var14 + arg1 + -(arg5.method121() / 2), arg0, arg7, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZ)V", line = 89)
    public final void method20(boolean arg0, boolean arg1) {
        if (!arg0) {
            field1378 = null;
        }
        ++field1382;
        if (this.field1387 != null) {
            this.field1387.method1473(-2, '\u0000');
            super.field3194.method2398(1, (byte) 118);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3194.field5990.method326(-5445), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field3194.method2398(0, (byte) 125);
            if (~super.field3194.field5863 != ~this.field1374) {
                int var3 = super.field3194.field5863 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field1380, var4);
                    var4 += 2;
                }
                if (!this.field1379.field6430) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var6 = (float) (super.field3194.field5863 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                }
                this.field1374 = super.field3194.field5863;
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 142)
    private final void method668(int arg0) {
        ++field1389;
        this.field1387 = new class250(super.field3194, 2);
        this.field1387.method1471(2, 0);
        super.field3194.method2398(1, (byte) -123);
        int var2 = -111 / ((-29 - arg0) / 57);
        super.field3194.method2408(-16777216, (byte) 85);
        super.field3194.method2383(260, 99, 7681);
        super.field3194.method2379(770, (byte) -105, 34166, 0);
        super.field3194.method2398(0, (byte) 110);
        OpenGL.glBindProgramARB(34336, this.field1383.field1200);
        OpenGL.glEnable(34336);
        this.field1387.method1475(17);
        this.field1387.method1471(2, 1);
        super.field3194.method2398(1, (byte) 103);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field3194.method2365(true, 0);
        super.field3194.method2379(770, (byte) -49, 5890, 0);
        super.field3194.method2398(0, (byte) 124);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field1387.method1475(17);
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(III)V", line = 173)
    public final void method12(int arg0, int arg1, int arg2) {
        ++field1377;
        if (this.field1387 != null) {
            super.field3194.method2398(1, (byte) 103);
            if (~(128 & arg0) != -1) {
                super.field3194.method2412((byte) 4, (class188) null);
            } else if (!this.field1379.field6430) {
                int var4 = super.field3194.field5863 % 4000 * 16 / 4000;
                super.field3194.method2412((byte) 4, this.field1379.field6431[var4]);
            } else {
                super.field3194.method2412((byte) 4, this.field1379.field6429);
            }
            int var5 = 15 / ((arg1 - 13) / 46);
            super.field3194.method2398(0, (byte) 113);
            if (~(64 & arg0) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class168.field2379, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class168.field2379, 0);
            }
            int var6 = 3 & arg0;
            if (~var6 != -3) {
                if (var6 != 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Z", line = 224)
    public final boolean method13(byte arg0) {
        if (arg0 <= 123) {
            return false;
        } else {
            ++field1385;
            return true;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIZILid;IIIIII)Z", line = 236)
    public static final boolean method669(int arg0, int arg1, boolean arg2, int arg3, class413 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1386;
        int var11 = arg0;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg0;
        class205.field2906[var13][var14] = 99;
        int var16 = -var14 + arg9;
        class472.field6894[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class175.field2502[var17] = arg0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class300.field4118[var10001] = arg9;
        int[][] var19 = arg4.field6067;
        while (var26 != var18) {
            var11 = class175.field2502[var18];
            var12 = class300.field4118[var18];
            var18 = 4095 & var18 - -1;
            int var20 = -var15 + var11;
            int var21 = var12 - var16;
            int var22 = var11 - arg4.field6053;
            int var23 = -arg4.field6063 + var12;
            if (~arg8 != 3) {
                if (arg8 != -3) {
                    if (arg8 != -2) {
                        if (~arg8 != 0) {
                            if (~arg8 != -1 && arg8 != 1 && ~arg8 != -3 && arg8 != 3 && ~arg8 != -10) {
                                if (arg4.method2468(2, var12, arg10, arg5, arg3, arg8, var11, 32)) {
                                    class100.field1372 = var11;
                                    class210.field2982 = var12;
                                    return true;
                                }
                            } else if (arg4.method2463(arg3, arg10, var11, -29353, arg8, var12, 2, arg5)) {
                                class100.field1372 = var11;
                                class210.field2982 = var12;
                                return true;
                            }
                        } else if (arg4.method2471(true, arg3, arg6, arg5, var11, arg7, var12, 2, arg1)) {
                            class100.field1372 = var11;
                            class210.field2982 = var12;
                            return true;
                        }
                    } else if (arg4.method2476(arg6, 2, var12, arg1, var11, 2, arg3, arg5, arg7, (byte) 117)) {
                        class210.field2982 = var12;
                        class100.field1372 = var11;
                        return true;
                    }
                } else if (class360.method2000(var11, 2, arg3, arg6, var12, (byte) -37, arg5, arg7, 2)) {
                    class100.field1372 = var11;
                    class210.field2982 = var12;
                    return true;
                }
            } else if (~arg5 == ~var11 && arg3 == var12) {
                class100.field1372 = var11;
                class210.field2982 = var12;
                return true;
            }
            int var25 = class472.field6894[var20][var21] - -1;
            if (var20 > 0 && ~class205.field2906[var20 + -1][var21] == -1 && (1134821376 & var19[var22 - 1][var23]) == 0 && (var19[var22 + -1][var23 + 1] & 1310982144) == 0) {
                class175.field2502[var26] = var11 + -1;
                class300.field4118[var26] = var12;
                var26 = var26 + 1 & 4095;
                class205.field2906[var20 + -1][var21] = 2;
                class472.field6894[var20 + -1][var21] = var25;
            }
            if (~var20 > -127 && class205.field2906[var20 + 1][var21] == 0 && (1625554944 & var19[var22 + 2][var23]) == 0 && (2015625216 & var19[var22 + 2][var23 + 1]) == 0) {
                class175.field2502[var26] = var11 + 1;
                class300.field4118[var26] = var12;
                var26 = var26 + 1 & 4095;
                class205.field2906[var20 + 1][var21] = 8;
                class472.field6894[var20 - -1][var21] = var25;
            }
            if (~var21 < -1 && class205.field2906[var20][var21 + -1] == 0 && ~(var19[var22][var23 - 1] & 1134821376) == -1 && (1625554944 & var19[var22 + 1][var23 + -1]) == 0) {
                class175.field2502[var26] = var11;
                class300.field4118[var26] = var12 + -1;
                class205.field2906[var20][var21 + -1] = 1;
                var26 = var26 - -1 & 4095;
                class472.field6894[var20][var21 + -1] = var25;
            }
            if (~var21 > -127 && ~class205.field2906[var20][var21 + 1] == -1 && ~(1310982144 & var19[var22][var23 - -2]) == -1 && (var19[var22 - -1][var23 + 2] & 2015625216) == 0) {
                class175.field2502[var26] = var11;
                class300.field4118[var26] = var12 + 1;
                class205.field2906[var20][var21 - -1] = 4;
                var26 = var26 + 1 & 4095;
                class472.field6894[var20][var21 + 1] = var25;
            }
            if (~var20 < -1 && var21 > 0 && class205.field2906[var20 + -1][var21 + -1] == 0 && ~(1336147968 & var19[var22 + -1][var23]) == -1 && (1134821376 & var19[var22 + -1][var23 + -1]) == 0 && ~(1675886592 & var19[var22][var23 + -1]) == -1) {
                class175.field2502[var26] = var11 + -1;
                class300.field4118[var26] = var12 + -1;
                class205.field2906[var20 + -1][var21 - 1] = 3;
                var26 = 4095 & var26 + 1;
                class472.field6894[var20 + -1][var21 - 1] = var25;
            }
            if (~var20 > -127 && ~var21 < -1 && class205.field2906[var20 + 1][var21 + -1] == 0 && ~(var19[var22 + 1][var23 + -1] & 1675886592) == -1 && ~(var19[var22 + 2][var23 + -1] & 1625554944) == -1 && ~(2028208128 & var19[var22 + 2][var23]) == -1) {
                class175.field2502[var26] = var11 - -1;
                class300.field4118[var26] = var12 + -1;
                var26 = var26 + 1 & 4095;
                class205.field2906[var20 + 1][var21 + -1] = 9;
                class472.field6894[var20 - -1][var21 + -1] = var25;
            }
            if (~var20 < -1 && ~var21 > -127 && ~class205.field2906[var20 + -1][var21 + 1] == -1 && (var19[var22 + -1][var23 + 1] & 1336147968) == 0 && (1310982144 & var19[var22 + -1][var23 - -2]) == 0 && (var19[var22][var23 + 2] & 2116288512) == 0) {
                class175.field2502[var26] = var11 + -1;
                class300.field4118[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class205.field2906[var20 + -1][var21 + 1] = 6;
                class472.field6894[var20 + -1][var21 + 1] = var25;
            }
            if (~var20 > -127 && ~var21 > -127 && ~class205.field2906[var20 + 1][var21 + 1] == -1 && ~(2116288512 & var19[var22 + 1][var23 + 2]) == -1 && ~(2015625216 & var19[var22 + 2][var23 + 2]) == -1 && ~(var19[var22 - -2][var23 + 1] & 2028208128) == -1) {
                class175.field2502[var26] = var11 - -1;
                class300.field4118[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class205.field2906[var20 + 1][var21 + 1] = 12;
                class472.field6894[var20 - -1][var21 + 1] = var25;
            }
        }
        class210.field2982 = var12;
        class100.field1372 = var11;
        if (arg2) {
            method669(50, -6, true, -40, (class413) null, -12, 116, 1, 92, -49, -100);
        }
        return false;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lht;Lgo;)V", line = 594)
    public class101(class410 arg0, class442 arg1) {
        super(arg0);
        this.field1379 = arg1;
        if (super.field3194.field5998 && super.field3194.field5885 >= 2) {
            this.field1383 = class8.method48(34336, super.field3194, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34933);
            if (this.field1383 != null) {
                int[][] var3 = class437.method2611(8, 64, 0, false, 4, 0.4F, 256, -76, 3);
                int[][] var4 = class437.method2611(8, 64, 8, false, 4, 0.4F, 256, -83, 3);
                int var5 = 0;
                this.field1380 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field1380[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1380[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method668(97);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 645)
    public static final void method670(boolean arg0) {
        if (!arg0) {
            field1373 = null;
        }
        ++field1375;
        class476.method2802(-634);
        class164.method1023(56, class437.field6374.field4266, 22050, 2);
        class476.field6960 = class320.method1810(class282.field3804, 0, class474.field6924, 0, 22050);
        class476.field6960.method1991(-27890, class241.field3335);
        class254.field3531 = class320.method1810(class282.field3804, 0, class474.field6924, 1, 2048);
        class254.field3531.method1991(-27890, class189.field2623);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILao;)V", line = 667)
    public final void method22(int arg0, int arg1, class188 arg2) {
        ++field1391;
        super.field3194.method2412((byte) 4, arg2);
        super.field3194.method2365(true, arg1);
        if (arg0 > -45) {
            this.method19(71);
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(ZI)V", line = 679)
    public static final void method671(boolean arg0, int arg1) {
        if (arg0 && class481.field7034 != null) {
            class294.field3922 = class481.field7034.field6290;
        } else {
            class294.field3922 = -1;
        }
        ++field1381;
        class374.field5277 = 0;
        class481.field7034 = null;
        class34.field488 = null;
        class496.field7297 = null;
        class481.method2843();
        class481.field7037.method3076((byte) -89);
        class152.field2135 = null;
        class54.field752 = null;
        class481.field7042 = null;
        class35.field500 = null;
        class356.field4865 = -1;
        field1373 = null;
        class352.field4804 = null;
        class451.field6507 = null;
        class380.field5363 = null;
        class33.field473 = null;
        class517.field7596 = -1;
        class356.field4873 = null;
        class481.field7031.method855((byte) -83);
        class481.field7026.method1563(0, 64, 64);
        class481.field7031.method852(arg1, 128, 73);
        class481.field7029.method2126(30, 64);
        class389.field5456.method1876(64, -76);
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class354 extends class605 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Z")
    private boolean field5083;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Ljea;")
    private class414 field5085;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Ljea;")
    private class414 field5097;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Ljea;")
    private class414 field5091;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "Ljea;")
    private class414 field5098;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lwn;")
    private class673 field5089;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "[I")
    public static int[] field5084 = new int[64];

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field5096;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field5101;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "Z")
    private boolean field5099;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "Z")
    private boolean field5100;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)V")
    public final void method51(boolean arg0, int arg1) {
        this.field5100 = arg0;
        ++field5096;
        super.field8542.method1500(33984, 1);
        if (arg1 <= -127) {
            super.field8542.method1505(-2, this.field5089);
            super.field8542.method1527(1, 34165, 7681);
            super.field8542.method1503(0, 34166, (byte) 2, 768);
            super.field8542.method1503(2, 5890, (byte) 2, 770);
            super.field8542.method1574(34168, (byte) -128, 770, 0);
            super.field8542.method1500(33984, 0);
            this.method2168((byte) 94);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (this.field5099) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5099 = false;
        }
        ++field5088;
        super.field8542.method1500(33984, 1);
        super.field8542.method1505(-2, (class657) null);
        super.field8542.method1527(1, 8448, 8448);
        super.field8542.method1503(0, 5890, (byte) 2, 768);
        super.field8542.method1503(2, 34166, (byte) 2, 770);
        super.field8542.method1574(5890, (byte) -128, 770, 0);
        super.field8542.method1500(33984, 0);
        super.field8542.method1503(0, 5890, (byte) 2, 768);
        super.field8542.method1574(5890, (byte) -128, 770, arg0);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public final void method2164(int arg0) {
        if (this.field5099) {
            int var2 = super.field8542.method115();
            int var3 = super.field8542.method110();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field8542.field3545, (float) super.field8542.field3509 / 255.0F);
            super.field8542.method1500(33984, 1);
            super.field8542.method1520((byte) -71, super.field8542.field3487);
            super.field8542.method1500(33984, 0);
        }
        if (arg0 < 117) {
            this.method51(true, 105);
        }
        ++field5095;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lok;)V")
    public class354(class228 arg0) {
        super(arg0);
        if (!super.field8542.field3489) {
            this.field5083 = false;
        } else {
            this.field5085 = class588.method3326(super.field8542, (byte) 52, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field5097 = class588.method3326(super.field8542, (byte) -96, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field5091 = class588.method3326(super.field8542, (byte) 55, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field5098 = class588.method3326(super.field8542, (byte) -112, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (!(this.field5098 != null & this.field5091 != null & this.field5097 != null & this.field5085 != null)) {
                this.field5083 = false;
            } else {
                this.field5089 = new class673(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field5089.method3736(-102, false, false);
                this.field5083 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Z")
    public final boolean method48(boolean arg0) {
        if (arg0) {
            this.field5091 = null;
        }
        ++field5092;
        return this.field5083;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILr;)Z")
    public static final boolean method2165(int arg0, int arg1, class166 arg2) {
        ++field5090;
        int var3 = (class199.field2812 + -104) / 2;
        int var4 = (class232.field3611 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; ++var6) {
            for (int var57 = var4; var57 < var4 + 104; ++var57) {
                for (int var58 = arg1; var58 <= 3; ++var58) {
                    if (class278.method1815(5, var58, var57, arg1, var6)) {
                        int var59 = var58;
                        if (class261.method1718(var57, arg0 ^ 5, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class254.method1694(var57, var59, var6, 13088);
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
            class99.field1552 = arg2.method209(var7, 0, 512, 512, 512);
            class345.method2144((byte) -110);
            int var9 = -10 - (-((int) (20.0D * Math.random())) + (-238 - ((int) (20.0D * Math.random()) + 228 << 8) - (-10 + (int) (20.0D * Math.random()) + 238 << 16))) | -16777216;
            int var10 = (896925440 | (int) (Math.random() * 20.0D) + 228) << 16;
            int var11 = (int) (8.0D * Math.random()) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
            boolean[][] var12 = new boolean[class185.field2593 + 1][class185.field2593 + 1];
            if (arg0 != 4) {
                method2167(69);
            }
            for (int var13 = var3; var13 < var3 + 104; var13 += class185.field2593) {
                for (int var36 = var4; var36 < var4 + 104; var36 += class185.field2593) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (~var13 < -1) {
                        var39 = var13 - 1;
                        var37 += 4;
                    }
                    int var40 = var36;
                    if (var36 > 0) {
                        var40 = var36 - 1;
                    }
                    int var41 = class185.field2593 + var13;
                    if (var41 < 104) {
                        ++var41;
                    }
                    int var42 = class185.field2593 + var36;
                    if (~var42 > -105) {
                        ++var42;
                        var38 += 4;
                    }
                    arg2.method168(0, 0, class185.field2593 * 4 + var37, var38 - -(class185.field2593 * 4));
                    arg2.method139(-16777216);
                    for (int var43 = arg1; ~var43 >= -4; ++var43) {
                        for (int var50 = 0; var50 <= class185.field2593; ++var50) {
                            for (int var56 = 0; var56 <= class185.field2593; ++var56) {
                                var12[var50][var56] = class278.method1815(arg0 + 1, var43, var40 + var56, arg1, var39 + var50);
                            }
                        }
                        class420.field6108[var43].method438(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class689.field9699) {
                            for (int var51 = -4; var51 < class185.field2593; ++var51) {
                                for (int var52 = -4; class185.field2593 > var52; ++var52) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 + var52;
                                    if (var53 >= var3 && ~var4 >= ~var54 && class278.method1815(5, var43, var54, arg1, var53)) {
                                        int var55 = var43;
                                        if (class261.method1718(var54, 1, var53)) {
                                            var55 = var43 - 1;
                                        }
                                        if (~var55 <= -1) {
                                            class544.method3083(arg2, var37 - -(var51 * 4), var55, var54, var53, (-var52 + class185.field2593) * 4 + -4 + var38, var9, 3, var10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class689.field9699) {
                        class674 var44 = class423.field6155[arg1];
                        for (int var45 = 0; ~class185.field2593 < ~var45; ++var45) {
                            for (int var46 = 0; var46 < class185.field2593; ++var46) {
                                int var47 = var13 - -var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field9532[-var44.field9541 + var47][-var44.field9538 + var48];
                                if (~(var49 & 1076101120) == -1) {
                                    if ((var49 & 8388608) == 0) {
                                        if (~(33554432 & var49) == -1) {
                                            if (~(134217728 & var49) == -1) {
                                                if ((536870912 & var49) != 0) {
                                                    arg2.method1155(4, arg0 ^ 12, var37 - -(var45 * 4), (-var46 + class185.field2593) * 4 + var38 + -4, -1713569622);
                                                }
                                            } else {
                                                arg2.method1147(-28854, (-var46 + class185.field2593) * 4 + -1 + var38, -1713569622, var45 * 4 + var37, 4);
                                            }
                                        } else {
                                            arg2.method1155(4, 8, var45 * 4 + var37 - -3, (-var46 + class185.field2593) * 4 + -4 + var38, -1713569622);
                                        }
                                    } else {
                                        arg2.method1147(-28854, var38 - -((-var46 + class185.field2593) * 4) + -4, -1713569622, var37 - -(var45 * 4), 4);
                                    }
                                } else {
                                    arg2.method1150(4, (-var46 + class185.field2593) * 4 + var38 + -4, var37 - -(var45 * 4), -1, -1713569622, 4);
                                }
                            }
                        }
                    }
                    arg2.method114(var37, var38, class185.field2593 * 4, class185.field2593 * 4, var11, 2);
                    class99.field1552.method942((-var3 + var13) * 4 + 48, 464 - class185.field2593 * 4 + -((-var4 + var36) * 4), class185.field2593 * 4, class185.field2593 * 4, var37, var38);
                }
            }
            arg2.method152();
            arg2.method139(-16777215);
            class158.method1100(-103);
            class205.field2890 = 0;
            class33.field521.method475(6);
            if (!class689.field9699) {
                for (int var14 = var3; var14 < var3 + 104; ++var14) {
                    for (int var20 = var4; var20 < var4 + 104; ++var20) {
                        for (int var21 = arg1; arg1 + 1 >= var21 && var21 <= 3; ++var21) {
                            if (class278.method1815(arg0 ^ 1, var21, var20, arg1, var14)) {
                                class614 var22 = (class614) class124.method946(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class614) class349.method2155(var21, var14, var20, field5101 != null ? field5101 : (field5101 = method2169("rda")));
                                }
                                if (var22 == null) {
                                    var22 = (class614) class149.method1061(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class614) class98.method797(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class550 var23 = class101.field1572.method2617((byte) -92, var22.method1179(true));
                                    if (!var23.field7749 || class267.field4035) {
                                        int var24 = var23.field7740;
                                        if (var23.field7781 != null) {
                                            for (int var25 = 0; ~var23.field7781.length < ~var25; ++var25) {
                                                if (var23.field7781[var25] != -1) {
                                                    class550 var26 = class101.field1572.method2617((byte) -100, var23.field7781[var25]);
                                                    if (~var26.field7740 <= -1) {
                                                        var24 = var26.field7740;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class588 var28 = class255.field3916.method812((byte) 112, var24);
                                                if (var28 != null && var28.field8263) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class423.field6155[var21].field9532;
                                                int var32 = class423.field6155[var21].field9541;
                                                int var33 = class423.field6155[var21].field9538;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (var35 == 0 && var3 < var29 && ~(var14 + -3) > ~var29 && (var31[var29 - 1 + -var32][-var33 + var30] & 2883848) == 0) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && ~var29 > ~(var3 - 1 + 104) && ~var29 > ~(var14 - -3) && (2883968 & var31[var29 + 1 - var32][var30 - var33]) == 0) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && var30 > var4 && var30 > var20 + -3 && ~(2883842 & var31[var29 - var32][-var33 + var30 - 1]) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && ~(var4 - -104 - 1) < ~var30 && var30 < var20 + 3 && (2883872 & var31[-var32 + var29][var30 + 1 + -var33]) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class307.field4552[class205.field2890] = var23.field7783;
                                            class638.field9008[class205.field2890] = var29;
                                            class21.field288[class205.field2890] = var30;
                                            ++class205.field2890;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class409.field5972 != null) {
                    class94.field1498.field7369 = 1;
                    class255.field3916.method811(1024, -70, 64);
                    for (int var15 = 0; class409.field5972.field8202 > var15; ++var15) {
                        int var16 = class409.field5972.field8203[var15];
                        if (~(var16 >> 28) == ~class648.field9106.field3019) {
                            int var17 = ((var16 & 268432544) >> 14) - class109.field1672;
                            int var18 = (var16 & 16383) + -class203.field2874;
                            if (~var17 <= -1 && ~class199.field2812 < ~var17 && var18 >= 0 && ~var18 > ~class232.field3611) {
                                class33.field521.method474(new class111(var15), 6);
                            } else {
                                class588 var19 = class255.field3916.method812((byte) -124, class409.field5972.field8200[var15]);
                                if (var19.field8243 != null && ~(var19.field8223 + var17) <= -1 && ~class199.field2812 < ~(var19.field8249 + var17) && var19.field8258 + var18 >= 0 && var19.field8264 + var18 < class232.field3611) {
                                    class33.field521.method474(new class111(var15), 6);
                                }
                            }
                        }
                    }
                    class255.field3916.method811(128, -70, 64);
                    class94.field1498.field7369 = 2;
                    class94.field1498.method2993(-1);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V")
    public static final void method2166(int arg0, int arg1, int arg2, int arg3) {
        ++field5082;
        if (arg2 > -28) {
            field5084 = null;
        }
        class248 var4 = class115.field1765[arg3][arg0];
        class667.method3692(var4 != null ? var4 : class439.field6403, arg1, false);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILip;I)V")
    public final void method43(int arg0, class657 arg1, int arg2) {
        ++field5087;
        if (arg1 == null) {
            super.field8542.method1505(-2, super.field8542.field3544);
            super.field8542.method1497(1, (byte) -29);
            super.field8542.method1503(0, 34168, (byte) 2, 768);
            super.field8542.method1574(34168, (byte) -128, 770, 0);
        } else {
            super.field8542.method1505(arg2 ^ -2, arg1);
            super.field8542.method1497(arg0, (byte) -29);
        }
        if (arg2 != 0) {
            this.method46(false, (byte) 65);
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
    public static void method2167(int arg0) {
        field5084 = null;
        if (arg0 != 134217728) {
            method2166(-54, 40, 101, 39);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)V")
    public final void method46(boolean arg0, byte arg1) {
        if (arg1 <= -16) {
            ++field5093;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public final void method2168(byte arg0) {
        ++field5086;
        class696 var2 = super.field8542.field3440;
        if (!this.field5100) {
            OpenGL.glBindProgramARB(34336, super.field8542.field3459 != Integer.MAX_VALUE ? this.field5091.field6014 : this.field5085.field6014);
        } else {
            OpenGL.glBindProgramARB(34336, super.field8542.field3459 != Integer.MAX_VALUE ? this.field5098.field6014 : this.field5097.field6014);
        }
        var2.method3890(-1.0F, 0.0F, class433.field6335, 0.0F, (float) super.field8542.field3459, (byte) 41);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class433.field6335[0], class433.field6335[1], class433.field6335[2], class433.field6335[3]);
        int var3 = 90 % ((arg0 - -35) / 49);
        OpenGL.glEnable(34336);
        this.field5099 = true;
        this.method2164(125);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZI)V")
    public final void method47(int arg0, boolean arg1, int arg2) {
        ++field5094;
        if (arg1) {
            this.method45(-119);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2169(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

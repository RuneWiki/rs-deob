import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class230 extends class86 {

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "Z")
    private boolean field3295;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "Lsh;")
    private class49 field3282;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "Lsh;")
    private class49 field3303;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "Lsh;")
    private class49 field3293;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Lsh;")
    private class49 field3281;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "[I")
    public static int[] field3290 = new int[100];

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public static int field3289 = 64;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "Z")
    public static boolean field3300 = false;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "Low;")
    public static class234 field3285;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "Llo;")
    public static class539 field3296;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Z")
    private boolean field3286;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "Z")
    private boolean field3299;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLlr;I)V")
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        if (!arg0) {
            this.method237(114);
        }
        ++field3297;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lkw;III)V")
    public static final void method1546(class166 arg0, int arg1, int arg2, int arg3) {
        long var4 = class411.field6251[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field2247 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field2245[arg0.field2247++] = class514.field7556[var8 - 1].field2518;
            var6 += 16L;
        }
        for (int var9 = arg0.field2247; var9 < 4; ++var9) {
            arg0.field2245[var9] = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public static void method1547(int arg0) {
        field3285 = null;
        field3296 = null;
        if (arg0 == 10148) {
            field3290 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZB)V")
    public final void method235(boolean arg0, byte arg1) {
        if (arg1 == 112) {
            ++field3298;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lnq;)V")
    public class230(class325 arg0) {
        super(arg0);
        if (!super.field1248.field5003) {
            this.field3295 = false;
        } else {
            this.field3282 = class474.method2827(34336, super.field1248, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3303 = class474.method2827(34336, super.field1248, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3293 = class474.method2827(34336, super.field1248, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3281 = class474.method2827(34336, super.field1248, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3295 = this.field3281 != null & this.field3293 != null & this.field3303 != null & this.field3282 != null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public final void method237(int arg0) {
        if (arg0 != 27670) {
            this.field3295 = false;
        }
        if (this.field3299) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3299 = false;
        }
        ++field3292;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1548(String arg0, int arg1) {
        ++field3284;
        if (class470.field7013 == null) {
            class293.method1877(-121);
        }
        int var2 = -31 % ((47 - arg1) / 61);
        String[] var3 = class61.method437(arg0, '\n', 243);
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            for (int var5 = class518.field7621; var5 > 0; --var5) {
                class470.field7013[var5] = class470.field7013[var5 - 1];
            }
            class470.field7013[0] = var3[var4];
            if (class518.field7621 < class470.field7013.length + -1) {
                if (~class251.field3496 < -1) {
                    ++class251.field3496;
                }
                ++class518.field7621;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)V")
    public final void method239(int arg0, byte arg1, int arg2) {
        int var4 = 28 % ((-50 - arg1) / 53);
        ++field3294;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZ)V")
    public final void method241(int arg0, boolean arg1) {
        this.field3286 = arg1;
        ++field3288;
        if (arg0 != 0) {
            this.method236(true, (class538) null, -113);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
    public static final void method1549(boolean arg0) {
        ++field3301;
        class195.field2614 = null;
        class521.method3097(class337.field5232, 0, -18540, 0, -1, class147.field1961, 0, 0, class107.field1525);
        if (class195.field2614 != null) {
            class457.method2773(class107.field1525, 0, 1, class269.field3744.field4058, class147.field1961, 0, class195.field2614, class491.field7252, class35.field519, -1412584499);
            class195.field2614 = null;
        }
        if (arg0) {
            method1548((String) null, -94);
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
    public final void method1550(int arg0) {
        ++field3302;
        class359.field5517[3] = (float) super.field1248.field5023;
        OpenGL.glTexGenfv(8192, 9474, class359.field5517, arg0);
        if (this.field3286) {
            OpenGL.glBindProgramARB(34336, super.field1248.field5023 == Integer.MAX_VALUE ? this.field3303.field695 : this.field3281.field695);
        } else {
            OpenGL.glBindProgramARB(34336, super.field1248.field5023 != Integer.MAX_VALUE ? this.field3293.field695 : this.field3282.field695);
        }
        OpenGL.glEnable(34336);
        this.field3299 = true;
        this.method1551(1);
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V")
    public final void method1551(int arg0) {
        if (arg0 != 1) {
            field3300 = false;
        }
        ++field3287;
        if (this.field3299) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field1248.field4969 + -1280), (float) (super.field1248.field4969 + -768), 1.0F / (float) super.field1248.field4924, (float) super.field1248.field4960 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)Z")
    public final boolean method238(byte arg0) {
        if (arg0 >= -2) {
            field3289 = 91;
        }
        ++field3283;
        return this.field3295;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILip;II)Lew;")
    public static final class346 method1552(int arg0, class508 arg1, int arg2, int arg3) {
        ++field3291;
        int var4 = arg2 << 8 | arg1.field7479;
        class346 var5 = (class346) class478.field7073.method2917(115, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class350.field5399.method1289(class350.field5399.method1292(var4, -70), 99);
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class346 var7 = class178.method1195(true, var6);
                    var7.field5337 = arg1;
                    class478.field7073.method2916(var7, (long) var4 << 16, -26941);
                    return var7;
                }
            } else {
                int var8 = arg3 + 65536 << 8 | arg1.field7479;
                class346 var9 = (class346) class478.field7073.method2917(arg0 ^ 2023956688, (long) var8 << 16);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class350.field5399.method1289(class350.field5399.method1292(var8, -99), arg0 + 2023956827);
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class346 var11 = class178.method1195(true, var10);
                            var11.field5337 = arg1;
                            class478.field7073.method2916(var11, (long) var8 << 16, -26941);
                            return var11;
                        }
                    } else {
                        if (arg0 != -2023956720) {
                            method1547(-59);
                        }
                        int var12 = 16776960 | arg1.field7479;
                        class346 var13 = (class346) class478.field7073.method2917(arg0 + 2023956609, (long) var12 << 16);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class350.field5399.method1289(class350.field5399.method1292(var12, -116), arg0 + 2023956831);
                            if (var14 != null) {
                                if (var14.length <= 1) {
                                    return null;
                                } else {
                                    class346 var15 = class178.method1195(true, var14);
                                    var15.field5337 = arg1;
                                    class478.field7073.method2916(var15, (long) var12 << 16, -26941);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }
}

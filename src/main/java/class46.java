import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class46 extends class610 {

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "Lafa;")
    private class314 field675;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "Lafa;")
    private class314 field679;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "Lafa;")
    private class314 field687;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "Lafa;")
    private class314 field673;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "Z")
    private boolean field670;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "Lcc;")
    public static class670 field682 = new class670("LOCAL", 4);

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "Z")
    public static boolean field689 = false;

    @OriginalMember(owner = "client!aea", name = "F", descriptor = "[J")
    public static long[] field692 = new long[32];

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "Luc;")
    public static class27 field688 = new class27(27, 16);

    @OriginalMember(owner = "client!aea", name = "I", descriptor = "[I")
    public static int[] field695 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "Lds;")
    public static class14 field686;

    @OriginalMember(owner = "client!aea", name = "H", descriptor = "Laca;")
    public static class667 field694;

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "Ltt;")
    public static class79 field693;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "Z")
    private boolean field674;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "Z")
    private boolean field677;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V", line = 3)
    public final void method252(int arg0) {
        if (arg0 != 31130) {
            field695 = null;
        }
        ++field683;
        if (this.field674) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field674 = false;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZLkw;Z)V", line = 23)
    public static final void method253(boolean arg0, class225 arg1, boolean arg2) {
        ++field678;
        if (~class315.field4697 > -401) {
            class161 var3 = arg1.field3245;
            if (var3.field2409 != null) {
                var3 = var3.method1114(class195.field2888, 0);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field2433) {
                String var4 = var3.field2469;
                if (var3.field2467 != 0) {
                    String var5 = class350.field5045 != class158.field2374 ? class9.field162.method42(class666.field9377, 19572) : class9.field164.method42(class666.field9377, 19572);
                    var4 = var4 + class198.method1341((byte) -10, var3.field2467, class253.field3576.field3948) + " (" + var5 + var3.field2467 + ")";
                }
                if (class457.field6455 && !arg0) {
                    class374 var6 = class36.field449 == -1 ? null : class324.field4784.method2171((byte) -80, class36.field449);
                    if (~(2 & class414.field5858) != -1 && (var6 == null || var3.method1123(class36.field449, -22002, var6.field5300) != var6.field5300)) {
                        class92.method678(class73.field1010 + " -> <col=ffff00>" + var4, 0, 44, -1, 0, (long) arg1.field6388, class561.field7575, true, class281.field3927, (byte) -74, false);
                        ++class124.field1720;
                    }
                }
                if (!arg0) {
                    String[] var7 = var3.field2439;
                    if (class451.field6291) {
                        var7 = class143.method1009(var7, (byte) -90);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (~var3.field2412 == -1 || !var7[var8].equalsIgnoreCase(class9.field157.method42(class666.field9377, 19572)))) {
                                byte var9 = 0;
                                int var10 = class258.field3691;
                                if (var8 == 0) {
                                    var9 = 11;
                                }
                                if (var8 == 1) {
                                    var9 = 19;
                                }
                                if (var8 == 2) {
                                    var9 = 2;
                                }
                                if (var8 == 3) {
                                    var9 = 25;
                                }
                                if (~var8 == -5) {
                                    var9 = 59;
                                }
                                if (var3.field2456 == var8) {
                                    var10 = var3.field2403;
                                }
                                if (var3.field2462 == var8) {
                                    var10 = var3.field2417;
                                }
                                class92.method678("<col=ffff00>" + var4, 0, var9, -1, 0, (long) arg1.field6388, var7[var8].equalsIgnoreCase(class9.field157.method42(class666.field9377, 19572)) ? var3.field2406 : var10, true, var7[var8], (byte) -74, false);
                                ++class123.field1699;
                            }
                        }
                    }
                    if (var3.field2412 == 1 && var7 != null) {
                        for (int var11 = 4; var11 >= 0; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class9.field157.method42(class666.field9377, 19572))) {
                                short var12 = 0;
                                if (~class253.field3576.field3948 > ~var3.field2467) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 11;
                                }
                                if (var11 == 1) {
                                    var13 = 19;
                                }
                                if (~var11 == -3) {
                                    var13 = 2;
                                }
                                if (~var11 == -4) {
                                    var13 = 25;
                                }
                                if (~var11 == -5) {
                                    var13 = 59;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                class92.method678("<col=ffff00>" + var4, 0, var13, -1, 0, (long) arg1.field6388, var3.field2406, true, var7[var11], (byte) -74, false);
                                ++class166.field2517;
                            }
                        }
                    }
                }
                class92.method678("<col=ffff00>" + var4, 0, 1004, -1, 0, (long) arg1.field6388, class299.field4461, arg2, class9.field156.method42(class666.field9377, 19572), (byte) -74, arg0);
                ++class116.field1547;
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZZ)V", line = 181)
    public final void method254(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method254(false, true);
        }
        ++field691;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IILit;)V", line = 194)
    public final void method255(int arg0, int arg1, class591 arg2) {
        if (arg0 == 256) {
            ++field681;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIZBLjava/lang/String;)V", line = 204)
    public static final void method256(int arg0, int arg1, boolean arg2, byte arg3, String arg4) {
        ++field671;
        class482.method2728(arg2, arg0, (byte) -50, arg4, arg1, (String) null, false);
        if (arg3 < 125) {
            field693 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZI)V", line = 216)
    public final void method257(boolean arg0, int arg1) {
        ++field685;
        this.field677 = arg0;
        if (arg1 > -19) {
            field686 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIB)V", line = 232)
    public final void method258(int arg0, int arg1, byte arg2) {
        ++field676;
        if (arg2 != 70) {
            this.method262(-126);
        }
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)V", line = 243)
    public static void method259(int arg0) {
        field692 = null;
        field694 = null;
        field688 = null;
        field695 = null;
        field686 = null;
        int var1 = -114 % ((9 - arg0) / 36);
        field682 = null;
        field693 = null;
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)V", line = 258)
    public final void method260(int arg0) {
        ++field680;
        class154.field2316[3] = (float) super.field8473.field4268;
        OpenGL.glTexGenfv(8192, 9474, class154.field2316, 0);
        if (this.field677) {
            OpenGL.glBindProgramARB(34336, ~super.field8473.field4268 != Integer.MIN_VALUE ? this.field673.field4662 : this.field679.field4662);
        } else {
            OpenGL.glBindProgramARB(34336, super.field8473.field4268 == Integer.MAX_VALUE ? this.field675.field4662 : this.field687.field4662);
        }
        OpenGL.glEnable(34336);
        int var2 = 55 % ((arg0 - -36) / 42);
        this.field674 = true;
        this.method261(117);
    }

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)V", line = 283)
    public final void method261(int arg0) {
        if (this.field674) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field8473.field4244 + -1280), (float) (super.field8473.field4244 + -768), 1.0F / (float) super.field8473.field4319, (float) super.field8473.field4317 / 255.0F);
        }
        ++field672;
        int var2 = 16 % (arg0 / 38);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Len;)V", line = 296)
    public class46(class289 arg0) {
        super(arg0);
        if (super.field8473.field4247) {
            this.field675 = class98.method763(34336, super.field8473, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field679 = class98.method763(34336, super.field8473, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field687 = class98.method763(34336, super.field8473, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field673 = class98.method763(34336, super.field8473, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field670 = this.field673 != null & this.field687 != null & this.field679 != null & this.field675 != null;
        } else {
            this.field670 = false;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Z", line = 315)
    public final boolean method262(int arg0) {
        ++field684;
        if (arg0 != -1) {
            method253(false, (class225) null, false);
        }
        return this.field670;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V", line = 327)
    public static final void method263(byte arg0) {
        ++field690;
        ++class318.field4716;
        if (arg0 != -80) {
            field689 = false;
        }
        class1.method5(1, class316.field4704);
        class288.field4014.method731(-2045573048, class384.field5379);
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 extends class460 {

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "Lfb;")
    private class631 field552;

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "Lfb;")
    private class631 field561;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "Lfb;")
    private class631 field564;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "Lfb;")
    private class631 field545;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "Z")
    private boolean field562;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "Lcga;")
    public static class449 field558 = new class449(23, 11);

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "Lhm;")
    public static class208 field565 = new class208(4);

    @OriginalMember(owner = "client!vba", name = "C", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "[I")
    public static int[] field566 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "Lpfa;")
    public static class275 field567;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "Z")
    private boolean field546;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "Z")
    private boolean field549;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "[Lxa;")
    public static class468[] field551;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V")
    public static void method242(int arg0) {
        if (arg0 >= -112) {
            method248(20, (byte) -36);
        }
        field558 = null;
        field565 = null;
        field551 = null;
        field567 = null;
        field566 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        if (arg0 >= 100) {
            ++field554;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V")
    public final void method243(boolean arg0) {
        class357.field4606[3] = (float) super.field5744.field7687;
        ++field568;
        OpenGL.glTexGenfv(8192, 9474, class357.field4606, 0);
        if (!this.field549) {
            OpenGL.glBindProgramARB(34336, super.field5744.field7687 != Integer.MAX_VALUE ? this.field564.field8554 : this.field552.field8554);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field5744.field7687 != Integer.MIN_VALUE ? this.field545.field8554 : this.field561.field8554);
        }
        if (!arg0) {
            OpenGL.glEnable(34336);
            this.field546 = true;
            this.method245(-9246);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IZI)Z")
    public static final boolean method244(int arg0, boolean arg1, int arg2) {
        ++field559;
        if (arg1) {
            return true;
        } else {
            return (arg2 & 2048) != 0;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        ++field560;
        int var4 = 56 / ((25 - arg1) / 59);
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)V")
    public final void method245(int arg0) {
        if (this.field546) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field5744.field7646 + -1280), (float) (super.field5744.field7646 + -768), 1.0F / (float) super.field5744.field7637, (float) super.field5744.field7658 / 255.0F);
        }
        ++field556;
        if (arg0 != -9246) {
            method246(-87, -96, -99, -98, -69);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        if (arg0 != 0) {
            this.method16(-89);
        }
        ++field557;
        if (this.field546) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field546 = false;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljaa;)V")
    public class38(class576 arg0) {
        super(arg0);
        if (super.field5744.field7626) {
            this.field552 = class197.method1158(34336, super.field5744, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", false);
            this.field561 = class197.method1158(34336, super.field5744, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", false);
            this.field564 = class197.method1158(34336, super.field5744, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", false);
            this.field545 = class197.method1158(34336, super.field5744, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", false);
            this.field562 = this.field561 != null & this.field552 != null & this.field564 != null & this.field545 != null;
        } else {
            this.field562 = false;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field547;
        if (arg4 == 2048) {
            int var5 = 0;
            int var6 = arg3;
            int var7 = -arg3;
            int var8 = -1;
            int var9 = class654.method3659(-7690, arg0 + arg3, class337.field4186, class292.field3700);
            int var10 = class654.method3659(arg4 + -9738, -arg3 + arg0, class337.field4186, class292.field3700);
            class390.method2223(var10, arg1, class30.field364[arg2], (byte) -81, var9);
            while (~var5 > ~var6) {
                var8 += 2;
                var7 += var8;
                if (~var7 < -1) {
                    --var6;
                    var7 -= var6 << 1;
                    int var11 = -var6 + arg2;
                    int var12 = arg2 + var6;
                    if (class125.field1524 <= var12 && class377.field4848 >= var11) {
                        int var13 = class654.method3659(-7690, arg0 + var5, class337.field4186, class292.field3700);
                        int var14 = class654.method3659(-7690, -var5 + arg0, class337.field4186, class292.field3700);
                        if (var12 <= class377.field4848) {
                            class390.method2223(var14, arg1, class30.field364[var12], (byte) -104, var13);
                        }
                        if (class125.field1524 <= var11) {
                            class390.method2223(var14, arg1, class30.field364[var11], (byte) -81, var13);
                        }
                    }
                }
                ++var5;
                int var15 = arg2 - var5;
                int var16 = arg2 + var5;
                if (~var16 <= ~class125.field1524 && class377.field4848 >= var15) {
                    int var17 = class654.method3659(-7690, arg0 + var6, class337.field4186, class292.field3700);
                    int var18 = class654.method3659(arg4 + -9738, -var6 + arg0, class337.field4186, class292.field3700);
                    if (class377.field4848 >= var16) {
                        class390.method2223(var18, arg1, class30.field364[var16], (byte) -89, var17);
                    }
                    if (~var15 <= ~class125.field1524) {
                        class390.method2223(var18, arg1, class30.field364[var15], (byte) -86, var17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method247(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field563;
        if (arg0 >= 1 && arg3 >= 1 && ~(class85.field1090 + -2) <= ~arg0 && arg3 <= class656.field8932 + -2) {
            int var9 = arg7;
            if (~arg7 > -4 && class407.method2284(-128, arg0, arg3)) {
                var9 = arg7 + 1;
            }
            if (!class611.field8310.method2744(class628.field8526, 4) && !class28.method174(arg3, -17783, arg0, class518.field6552, var9)) {
                return;
            }
            if (class407.field5237 == null) {
                return;
            }
            class639.field8665.method3250(class634.field8601[arg7], arg0, class309.field3898, arg7, arg3, (byte) -108, arg5);
            if (arg4 >= 0) {
                boolean var10 = class611.field8310.field8679;
                class611.field8310.field8679 = true;
                class639.field8665.method3248(arg8, false, arg6, arg0, arg2, arg4, arg7, class309.field3898, var9, arg3, class634.field8601[arg7]);
                class611.field8310.field8679 = var10;
            }
        }
        if (arg1 != -96) {
            method244(-113, false, -80);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IB)Z")
    public static final boolean method248(int arg0, byte arg1) {
        if (arg1 < 102) {
            return false;
        } else {
            ++field550;
            return arg0 == 3 || ~arg0 == -6 || arg0 == 6;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        this.field549 = arg0;
        ++field548;
        if (arg1 != -32460) {
            this.method243(false);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (arg2 <= -110) {
            ++field544;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)V")
    public static final void method249(int arg0, int arg1) {
        ++field553;
        if (arg1 == -10304) {
            class243 var2 = class546.method2926(arg0, 3, true);
            var2.method1455(true);
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        ++field555;
        if (arg0 != -24566) {
            field566 = null;
        }
        return this.field562;
    }
}

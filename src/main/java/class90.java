import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class90 extends class263 {

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Z")
    private boolean field1623;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Lan;")
    private class20 field1619;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Lan;")
    private class20 field1627;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Lan;")
    private class20 field1615;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Lan;")
    private class20 field1622;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lsk;")
    public static class423 field1612 = new class423("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "Lig;")
    public static class154 field1629;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Z")
    private boolean field1608;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "Z")
    private boolean field1628;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)Lmj;")
    public static final class447 method664(boolean arg0, int arg1) {
        ++field1626;
        class447 var2 = (class447) class113.field1921.method1752(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class355.field5294.method2715(arg1, 1, arg0);
            class447 var4 = new class447();
            var4.field6882 = arg1;
            if (var3 != null) {
                var4.method2669(new class40(var3), 0);
            }
            var4.method2675(113);
            if (~var4.field6883 == -3 && class129.field2071.method2409(arg0, (long) arg1) == null) {
                class129.field2071.method2413((long) arg1, -1, new class361(class378.field5537));
                class150.field2421[class378.field5537++] = var4;
            }
            class113.field1921.method1758(1, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lqh;BIII)V")
    public static final void method665(class47 arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field1624;
        int var5 = arg0.field2232[0];
        int var6 = arg0.field2239[0];
        if (var5 >= 0 && ~class150.field2422 < ~var5 && var6 >= 0 && var6 < class21.field272) {
            if (arg2 >= 0 && class150.field2422 > arg2 && ~arg4 <= -1 && class21.field272 > arg4) {
                int var7 = class418.method2449(0, var6, arg4, true, 0, var5, 0, arg0.method337(0), class377.field5498, 10, -4, class91.field1641[arg0.field3217], arg2, 0, class266.field4032);
                if (var7 >= 1) {
                    if (~var7 >= -4) {
                        int var8 = 0;
                        if (arg3 > 112) {
                            while (~var8 > ~(var7 + -1)) {
                                arg0.method338(arg1, (byte) -126, class266.field4032[var8], class377.field5498[var8]);
                                ++var8;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
    public final void method666(int arg0, boolean arg1) {
        ++field1625;
        if (arg0 != -2560) {
            this.method666(-78, false);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method667(boolean arg0) {
        field1629 = null;
        field1612 = null;
        if (!arg0) {
            method664(true, 77);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lh;III[Z)V")
    public static final void method668(class452 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class99.field1801 != class262.field3978) {
            int var5 = class201.field3195[arg1].method314(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class343 var7 = class201.field3195[var6];
                    if (var7 != null) {
                        var7.method299(arg0, arg2, var5 - var7.method314(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)V")
    public final void method669(boolean arg0, byte arg1) {
        int var3 = -121 / ((arg1 - 24) / 34);
        ++field1621;
        this.field1628 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public final void method670(byte arg0) {
        if (arg0 != -94) {
            this.method669(true, (byte) 80);
        }
        ++field1609;
        if (this.field1608) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1608 = false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lce;IZ)V")
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        ++field1616;
        if (!arg2) {
            this.method666(10, true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lbl;)V")
    public class90(class442 arg0) {
        super(arg0);
        if (!super.field3984.field6717) {
            this.field1623 = false;
        } else {
            this.field1619 = class488.method2936(super.field3984, 29, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336);
            this.field1627 = class488.method2936(super.field3984, -106, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336);
            this.field1615 = class488.method2936(super.field3984, 32, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336);
            this.field1622 = class488.method2936(super.field3984, -99, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336);
            this.field1623 = this.field1622 != null & this.field1615 != null & this.field1619 != null & this.field1627 != null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1618;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg4 == 34336) {
            int var12 = arg5 << 1;
            int var13 = (-var12 + 1) * var8 + var10;
            int var14 = -((var12 - 1) * var11) + var9;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) - -3) * var10;
            int var18 = ((arg5 << 1) + -3) * var11;
            int var19 = (var6 + 1) * var16;
            if (class248.field3808 <= arg2 && class478.field7310 >= arg2) {
                int var20 = class167.method1056(class320.field4818, (byte) -125, class355.field5296, arg0 + arg1);
                int var21 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, -arg0 + arg1);
                class78.method566(class69.field1212[arg2], var20, arg3, -7, var21);
            }
            int var22 = (arg5 - 1) * var15;
            while (var7 > 0) {
                if (~var13 > -1) {
                    while (~var13 > -1) {
                        var14 += var19;
                        var13 += var17;
                        var19 += var16;
                        var17 += var16;
                        ++var6;
                    }
                }
                if (~var14 > -1) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
                var14 += -var18;
                var13 += -var22;
                var18 -= var15;
                --var7;
                var22 -= var15;
                int var23 = -var7 + arg2;
                int var24 = arg2 - -var7;
                if (class248.field3808 <= var24 && ~class478.field7310 <= ~var23) {
                    int var25 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, arg1 - -var6);
                    int var26 = class167.method1056(class320.field4818, (byte) -123, class355.field5296, -var6 + arg1);
                    if (~class248.field3808 >= ~var23) {
                        class78.method566(class69.field1212[var23], var25, arg3, arg4 + -34343, var26);
                    }
                    if (~var24 >= ~class478.field7310) {
                        class78.method566(class69.field1212[var24], var25, arg3, -7, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
    public final void method673(int arg0, int arg1, int arg2) {
        ++field1613;
        if (arg2 != 6908) {
            this.method676((byte) 103);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public final void method674(int arg0) {
        ++field1610;
        class386.field5608[3] = (float) super.field3984.field6761;
        int var2 = -13 % ((arg0 - 52) / 34);
        OpenGL.glTexGenfv(8192, 9474, class386.field5608, 0);
        if (this.field1628) {
            OpenGL.glBindProgramARB(34336, ~super.field3984.field6761 == Integer.MIN_VALUE ? this.field1627.field259 : this.field1622.field259);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field3984.field6761 == Integer.MIN_VALUE ? this.field1619.field259 : this.field1615.field259);
        }
        OpenGL.glEnable(34336);
        this.field1608 = true;
        this.method676((byte) -122);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
    public final boolean method675(int arg0) {
        ++field1617;
        if (arg0 > -112) {
            method664(false, 26);
        }
        return this.field1623;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)V")
    public final void method676(byte arg0) {
        if (this.field1608) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field3984.field6799 + -1280), (float) (super.field3984.field6799 + -768), 1.0F / (float) super.field3984.field6823, (float) super.field3984.field6796 / 255.0F);
        }
        ++field1614;
        int var2 = -22 / ((-52 - arg0) / 44);
    }
}

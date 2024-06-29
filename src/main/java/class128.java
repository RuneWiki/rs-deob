import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class128 extends class11 {

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Ljm;")
    private class600 field1579;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Ljm;")
    private class600 field1584;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "Ljm;")
    private class600 field1591;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Ljm;")
    private class600 field1581;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Z")
    private boolean field1586;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[Lcba;")
    public static class478[] field1576;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    private boolean field1578;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Z")
    private boolean field1589;

    static {
        new class474("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1576 = new class478[128];
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lad;)V", line = 9)
    public class128(class362 arg0) {
        super(arg0);
        if (super.field95.field5467) {
            this.field1579 = class455.method2811(super.field95, 34336, false, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field1584 = class455.method2811(super.field95, 34336, false, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field1591 = class455.method2811(super.field95, 34336, false, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field1581 = class455.method2811(super.field95, 34336, false, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field1586 = this.field1581 != null & this.field1591 != null & this.field1584 != null & this.field1579 != null;
        } else {
            this.field1586 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIB)V", line = 28)
    public final void method62(int arg0, int arg1, byte arg2) {
        if (arg2 < 124) {
            this.method67(97, true);
        }
        ++field1580;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIBIIIIII)V", line = 43)
    public static final void method789(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1575;
        if (~arg1 <= -513 && arg0 >= 512 && ~arg1 >= ~((class90.field1032 - 2) * 512) && ~((class30.field349 - 2) * 512) <= ~arg0) {
            int var10 = -arg5 + class399.method2547(arg0, arg1, (byte) -126, arg9);
            class495.field7240.method2006(arg8, 0, 0);
            class413.field6264.method382(class495.field7240);
            class413.field6264.method364(arg1, var10, arg0, class547.field7831);
            class495.field7240.method2006(-arg8, 0, 0);
            class413.field6264.method382(class495.field7240);
            int var11 = -20 % ((arg3 - 5) / 51);
        } else {
            class547.field7831[0] = class547.field7831[1] = -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)Z", line = 67)
    public final boolean method68(byte arg0) {
        if (arg0 != 95) {
            this.field1584 = null;
        }
        ++field1582;
        return this.field1586;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILpm;)V", line = 83)
    public final void method65(int arg0, int arg1, class507 arg2) {
        ++field1585;
        if (arg1 != -1) {
            this.method67(-88, false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V", line = 94)
    public final void method790(int arg0) {
        if (this.field1578) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field95.field5377 - 1280), (float) (super.field95.field5377 + -768), 1.0F / (float) super.field95.field5451, (float) super.field95.field5379 / 255.0F);
        }
        if (arg0 == -19765) {
            ++field1588;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZ)V", line = 109)
    public final void method64(boolean arg0, boolean arg1) {
        ++field1590;
        if (!arg0) {
            this.method62(35, -16, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 122)
    public final void method63(int arg0) {
        if (this.field1578) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1578 = false;
        }
        ++field1577;
        int var2 = -25 % ((-61 - arg0) / 40);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIII)Z", line = 139)
    public static final boolean method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class571.method3315(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class465.field6917;
                int var7 = arg3 << class465.field6917;
                return class237.method1590(var6 + 1, class435.field6449[arg0].method259(arg1, arg3) + arg5, var7 + 1) && class237.method1590(class193.field2559 + var6 - 1, class435.field6449[arg0].method259(arg1 + 1, arg3) + arg5, var7 + 1) && class237.method1590(class193.field2559 + var6 - 1, class435.field6449[arg0].method259(arg1 + 1, arg3 + 1) + arg5, class193.field2559 + var7 - 1) && class237.method1590(var6 + 1, class435.field6449[arg0].method259(arg1, arg3 + 1) + arg5, class193.field2559 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class326.field4697[arg0][var8][var14] == -class348.field4982) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class465.field6917) + 1;
            int var10 = (arg3 << class465.field6917) + 2;
            int var11 = class435.field6449[arg0].method259(arg1, arg3) + arg5;
            if (!class237.method1590(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class465.field6917) - 1;
                if (!class237.method1590(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class465.field6917) - 1;
                    if (!class237.method1590(var9, var11, var13)) {
                        return false;
                    } else if (!class237.method1590(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 198)
    public static void method792(byte arg0) {
        field1576 = null;
        if (arg0 != -82) {
            field1576 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V", line = 211)
    public final void method67(int arg0, boolean arg1) {
        ++field1583;
        this.field1589 = arg1;
        if (arg0 < 115) {
            this.field1589 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V", line = 223)
    public final void method793(byte arg0) {
        class291.field4030[3] = (float) super.field95.field5476;
        ++field1587;
        OpenGL.glTexGenfv(8192, 9474, class291.field4030, 0);
        int var2 = 117 % ((26 - arg0) / 59);
        if (this.field1589) {
            OpenGL.glBindProgramARB(34336, super.field95.field5476 == Integer.MAX_VALUE ? this.field1584.field8766 : this.field1581.field8766);
        } else {
            OpenGL.glBindProgramARB(34336, super.field95.field5476 != Integer.MAX_VALUE ? this.field1591.field8766 : this.field1579.field8766);
        }
        OpenGL.glEnable(34336);
        this.field1578 = true;
        this.method790(-19765);
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class279 extends class465 {

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "Lm;")
    private class179 field3978;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "Lm;")
    private class179 field3972;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "Lm;")
    private class179 field3971;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Lm;")
    private class179 field3970;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "Z")
    private boolean field3976;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "Z")
    private boolean field3973;

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "Z")
    private boolean field3980;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BZ)V")
    public final void method214(byte arg0, boolean arg1) {
        if (arg0 == 99) {
            ++field3975;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IZ)V")
    public final void method210(int arg0, boolean arg1) {
        int var3 = -25 % ((arg0 - -30) / 38);
        ++field3981;
        this.field3980 = arg1;
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lno;)V")
    public class279(class658 arg0) {
        super(arg0);
        if (super.field6268.field9251) {
            this.field3978 = class364.method2150(99, 34336, super.field6268, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3972 = class364.method2150(91, 34336, super.field6268, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3971 = class364.method2150(61, 34336, super.field6268, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3970 = class364.method2150(69, 34336, super.field6268, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3976 = this.field3970 != null & this.field3971 != null & this.field3972 != null & this.field3978 != null;
        } else {
            this.field3976 = false;
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public final void method213(int arg0) {
        if (arg0 != 15495) {
            this.field3971 = null;
        }
        if (this.field3973) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3973 = false;
        }
        ++field3974;
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)Z")
    public final boolean method218(int arg0) {
        ++field3966;
        return arg0 <= 110 ? false : this.field3976;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
    public final void method215(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method212(-10, 101, (class367) null);
        }
        ++field3968;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lgba;IIILjava/lang/String;ILfa;IBLkga;ILta;)V")
    public static final void method1740(class625 arg0, int arg1, int arg2, int arg3, String arg4, int arg5, class217 arg6, int arg7, byte arg8, class511 arg9, int arg10, class200 arg11) {
        ++field3969;
        int var12;
        if (~class140.field2254 != -5) {
            var12 = 16383 & (int) class42.field602 + class588.field7795;
        } else {
            var12 = 16383 & (int) class42.field602;
        }
        int var13 = 10 + Math.max(arg0.field8350 / 2, arg0.field8361 / 2);
        if (arg8 < -87) {
            int var14 = arg5 * arg5 + arg10 * arg10;
            if (~(var13 * var13) <= ~var14) {
                int var15 = class126.field2116[var12];
                int var16 = class126.field2105[var12];
                if (class140.field2254 != 4) {
                    var15 = var15 * 256 / (class376.field5073 + 256);
                    var16 = var16 * 256 / (class376.field5073 - -256);
                }
                int var17 = arg5 * var16 + arg10 * var15 >> 14;
                int var18 = arg10 * var16 + -(arg5 * var15) >> 14;
                int var19 = arg9.method2841(arg4, (byte) 89, (class468[]) null, 100);
                int var20 = var17 - var19 / 2;
                int var21 = arg9.method2840(-114, 0, (class468[]) null, arg4, 100);
                if (~(-arg0.field8350) >= ~var20 && ~arg0.field8350 <= ~var20 && -arg0.field8361 <= var18 && ~var18 >= ~arg0.field8361) {
                    arg11.method1301(0, 0, arg3 - var21 + arg0.field8361 / 2 + -var18 + -arg2, (byte) 127, 50, 0, arg0.field8350 / 2 + arg1 + var20, arg4, arg1, (int[]) null, (class468[]) null, arg3, var19, arg7, 1, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILhf;)V")
    public final void method212(int arg0, int arg1, class367 arg2) {
        if (arg0 != 0) {
            this.method1741(-128);
        }
        ++field3967;
    }

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)V")
    public final void method1741(int arg0) {
        if (this.field3973) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field6268.field9303 + -1280), (float) (super.field6268.field9303 + -768), 1.0F / (float) super.field6268.field9300, (float) super.field6268.field9315 / 255.0F);
        }
        ++field3979;
        if (arg0 != 34336) {
            this.method210(96, true);
        }
    }

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "(I)V")
    public final void method1742(int arg0) {
        ++field3977;
        class304.field4219[3] = (float) super.field6268.field9297;
        OpenGL.glTexGenfv(8192, 9474, class304.field4219, 0);
        if (this.field3980) {
            OpenGL.glBindProgramARB(34336, super.field6268.field9297 != Integer.MAX_VALUE ? this.field3970.field2738 : this.field3972.field2738);
        } else {
            OpenGL.glBindProgramARB(34336, super.field6268.field9297 == Integer.MAX_VALUE ? this.field3978.field2738 : this.field3971.field2738);
        }
        OpenGL.glEnable(34336);
        this.field3973 = true;
        this.method1741(34336);
        if (arg0 > -53) {
            this.field3973 = false;
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class279 extends class297 {

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Z")
    private boolean field3673;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lbm;")
    private class74 field3661;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Lbm;")
    private class74 field3669;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lbm;")
    private class74 field3660;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lbm;")
    private class74 field3664;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3670 = 328;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lcu;")
    public static class145 field3665 = new class145(4, -1);

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Z")
    private boolean field3659;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Z")
    private boolean field3662;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZII)V")
    public final void method245(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field3658;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIZII)Z")
    public static final boolean method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        ++field3655;
        int var9 = class385.field5232.field6261[0];
        int var10 = class385.field5232.field6266[0];
        if (var9 >= 0 && class12.field251 > var9 && ~var10 <= -1 && ~class289.field3782 < ~var10) {
            if (~arg7 <= -1 && class12.field251 > arg7 && ~arg3 <= -1 && ~arg3 > ~class289.field3782) {
                int var11 = class290.method1705(arg8, arg5, arg4, arg3, var9, arg0, var10, class120.field1754[class385.field5232.field573], class270.field3545, class385.field5232.method2590(0), class59.field926, arg7, (byte) -76, arg2, arg6);
                if (~var11 > -2) {
                    return false;
                } else {
                    class11.field239 = class59.field926[arg1 + var11];
                    class497.field6888 = class270.field3545[var11 + -1];
                    class413.field5717 = false;
                    class56.method404(0);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V")
    public final void method244(int arg0, boolean arg1) {
        this.field3662 = arg1;
        ++field3654;
        if (arg0 != 0) {
            this.field3661 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public final void method1655(int arg0) {
        ++field3672;
        if (arg0 == 34820) {
            if (this.field3659) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field3881.field7433 + -1280), (float) (super.field3881.field7433 + -768), 1.0F / (float) super.field3881.field7458, (float) super.field3881.field7486 / 255.0F);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lnk;II)V")
    public final void method248(class501 arg0, int arg1, int arg2) {
        ++field3657;
        if (arg1 != 0) {
            this.field3660 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I")
    public static final int method1656(int arg0) {
        ++field3656;
        return arg0 != 2 ? 57 : 2;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lbo;)V")
    public class279(class511 arg0) {
        super(arg0);
        if (!super.field3881.field7511) {
            this.field3673 = false;
        } else {
            this.field3661 = class530.method3119(super.field3881, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", false);
            this.field3669 = class530.method3119(super.field3881, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", false);
            this.field3660 = class530.method3119(super.field3881, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", false);
            this.field3664 = class530.method3119(super.field3881, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", false);
            this.field3673 = this.field3669 != null & this.field3661 != null & this.field3660 != null & this.field3664 != null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Z")
    public final boolean method240(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field3667;
            return this.field3673;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 != 6) {
            this.method246(-109);
        }
        ++field3663;
        if (this.field3659) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
    public final void method241(boolean arg0, int arg1) {
        if (arg1 != -30965) {
            this.method248((class501) null, 84, 0);
        }
        ++field3666;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public final void method1657(int arg0) {
        ++field3671;
        class252.field3345[3] = (float) super.field3881.field7542;
        OpenGL.glTexGenfv(8192, 9474, class252.field3345, 0);
        if (this.field3662) {
            OpenGL.glBindProgramARB(34336, super.field3881.field7542 == Integer.MAX_VALUE ? this.field3669.field1117 : this.field3664.field1117);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field3881.field7542 == Integer.MIN_VALUE ? this.field3661.field1117 : this.field3660.field1117);
        }
        OpenGL.glEnable(34336);
        this.field3659 = true;
        this.method1655(34820);
        if (arg0 != 2) {
            this.field3669 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method1658(byte arg0) {
        if (arg0 < 123) {
            method1658((byte) 125);
        }
        field3665 = null;
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class280 extends class246 {

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Z")
    private boolean field3804;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Lud;")
    private class94 field3806;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Lud;")
    private class94 field3813;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lud;")
    private class94 field3807;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Lud;")
    private class94 field3801;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "Lks;")
    public static class23 field3811;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Z")
    private boolean field3803;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Z")
    private boolean field3818;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "[Lbf;")
    public static class182[] field3809;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method740(boolean arg0, int arg1) {
        ++field3802;
        if (arg1 != 26715) {
            this.field3818 = true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IC)Z", line = 16)
    public static final boolean method1619(int arg0, char arg1) {
        ++field3816;
        if (arg0 != 34336) {
            method1619(-80, '6');
        }
        return ~arg1 <= -49 && ~arg1 >= -58 || ~arg1 <= -66 && ~arg1 >= -91 || arg1 >= 'a' && ~arg1 >= -123;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 30)
    public static void method1620(int arg0) {
        if (arg0 >= -88) {
            field3809 = null;
        }
        field3811 = null;
        field3809 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZB)V", line = 42)
    public final void method743(boolean arg0, byte arg1) {
        ++field3805;
        this.field3803 = arg0;
        if (arg1 < 83) {
            this.field3813 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 57)
    public final void method1621(int arg0) {
        if (this.field3818) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field3361.field4785 + -1280), (float) (super.field3361.field4785 + -768), 1.0F / (float) super.field3361.field4858, (float) super.field3361.field4767 / 255.0F);
        }
        if (arg0 != 5654) {
            field3811 = null;
        }
        ++field3808;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lpg;)V", line = 75)
    public class280(class333 arg0) {
        super(arg0);
        if (!super.field3361.field4771) {
            this.field3804 = false;
        } else {
            this.field3806 = class147.method1057(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field3361);
            this.field3813 = class147.method1057(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field3361);
            this.field3807 = class147.method1057(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field3361);
            this.field3801 = class147.method1057(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field3361);
            this.field3804 = this.field3813 != null & this.field3806 != null & this.field3807 != null & this.field3801 != null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILfg;I)V", line = 93)
    public final void method742(int arg0, class128 arg1, int arg2) {
        ++field3810;
        if (arg0 != 4) {
            field3809 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 108)
    public final void method739(int arg0) {
        if (this.field3818) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3818 = false;
        }
        ++field3814;
        int var2 = -5 % ((-80 - arg0) / 32);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V", line = 125)
    public final void method744(byte arg0, int arg1, int arg2) {
        ++field3815;
        if (arg0 != 53) {
            field3809 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V", line = 135)
    public final void method1622(byte arg0) {
        ++field3817;
        class71.field1022[3] = (float) super.field3361.field4786;
        if (arg0 != -61) {
            this.method1622((byte) 7);
        }
        OpenGL.glTexGenfv(8192, 9474, class71.field1022, 0);
        if (!this.field3803) {
            OpenGL.glBindProgramARB(34336, ~super.field3361.field4786 == Integer.MIN_VALUE ? this.field3806.field1532 : this.field3807.field1532);
        } else {
            OpenGL.glBindProgramARB(34336, super.field3361.field4786 == Integer.MAX_VALUE ? this.field3813.field1532 : this.field3801.field1532);
        }
        OpenGL.glEnable(34336);
        this.field3818 = true;
        this.method1621(5654);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z", line = 162)
    public final boolean method738(byte arg0) {
        if (arg0 < 99) {
            return false;
        } else {
            ++field3812;
            return this.field3804;
        }
    }
}

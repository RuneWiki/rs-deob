import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class76 extends class118 {

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "Z")
    private boolean field883;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lku;")
    private class494 field871;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Lku;")
    private class494 field877;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lku;")
    private class494 field868;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lku;")
    private class494 field873;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Lgu;")
    public static class126 field879 = new class126();

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Lqp;")
    public static class586 field884 = new class586(111, 6);

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Lwca;")
    public static class311 field885 = null;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Z")
    private boolean field874;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Z")
    private boolean field881;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZ)V")
    public final void method439(byte arg0, boolean arg1) {
        if (arg0 == 56) {
            ++field878;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lbaa;IB)V")
    public final void method440(class541 arg0, int arg1, byte arg2) {
        ++field876;
        if (arg2 >= -17) {
            this.field881 = false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method441(int arg0) {
        ++field872;
        if (this.field881) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field881 = false;
        }
        int var2 = -29 % ((-58 - arg0) / 41);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
    public final void method442(boolean arg0, byte arg1) {
        if (arg1 > -101) {
            field879 = null;
        }
        this.field874 = arg0;
        ++field870;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method443(int arg0) {
        if (arg0 != 0) {
            method443(-40);
        }
        field879 = null;
        field884 = null;
        field885 = null;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public final void method444(int arg0) {
        ++field882;
        class343.field5009[3] = (float) super.field1544.field7028;
        OpenGL.glTexGenfv(8192, 9474, class343.field5009, 0);
        if (!this.field874) {
            OpenGL.glBindProgramARB(34336, super.field1544.field7028 == Integer.MAX_VALUE ? this.field871.field7452 : this.field868.field7452);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field1544.field7028 != Integer.MIN_VALUE ? this.field873.field7452 : this.field877.field7452);
        }
        OpenGL.glEnable(34336);
        this.field881 = true;
        if (arg0 >= 40) {
            this.method447((byte) -17);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)V")
    public final void method445(int arg0, byte arg1, int arg2) {
        ++field875;
        if (arg1 != 23) {
            this.method442(false, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Z")
    public final boolean method446(byte arg0) {
        ++field869;
        if (arg0 != 29) {
            this.method447((byte) 14);
        }
        return this.field883;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Los;)V")
    public class76(class468 arg0) {
        super(arg0);
        if (!super.field1544.field7092) {
            this.field883 = false;
        } else {
            this.field871 = class167.method1063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 74, super.field1544);
            this.field877 = class167.method1063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 123, super.field1544);
            this.field868 = class167.method1063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 69, super.field1544);
            this.field873 = class167.method1063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 29, super.field1544);
            this.field883 = this.field873 != null & this.field868 != null & this.field877 != null & this.field871 != null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public final void method447(byte arg0) {
        if (arg0 < -15) {
            ++field880;
            if (this.field881) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field1544.field7038 + -1280), (float) (super.field1544.field7038 + -768), 1.0F / (float) super.field1544.field7041, (float) super.field1544.field7040 / 255.0F);
            }
        }
    }
}

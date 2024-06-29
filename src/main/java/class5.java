import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class5 extends class374 {

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Z")
    private boolean field46;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lae;")
    private class30 field53;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Lae;")
    private class30 field52;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lae;")
    private class30 field55;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Lae;")
    private class30 field51;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Lkq;")
    public static class78 field47 = new class78("LOCAL", 4);

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Z")
    private boolean field40;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Z")
    private boolean field41;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static void method17(byte arg0) {
        field47 = null;
        int var1 = 37 / ((49 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLew;I)V")
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        if (arg0) {
            ++field43;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        if (arg1 > -2) {
            this.field41 = true;
        }
        ++field50;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public final void method20(int arg0, int arg1, int arg2) {
        ++field56;
        if (arg1 != -20857) {
            this.method22((byte) -52);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)Z")
    public final boolean method21(byte arg0) {
        ++field45;
        if (arg0 < 85) {
            this.method21((byte) 36);
        }
        return this.field46;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        ++field48;
        if (arg0 < 109) {
            field47 = null;
        }
        class446.field6593[3] = (float) super.field5646.field3795;
        OpenGL.glTexGenfv(8192, 9474, class446.field6593, 0);
        if (!this.field40) {
            OpenGL.glBindProgramARB(34336, super.field5646.field3795 == Integer.MAX_VALUE ? this.field53.field432 : this.field55.field432);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field5646.field3795 == Integer.MIN_VALUE ? this.field52.field432 : this.field51.field432);
        }
        OpenGL.glEnable(34336);
        this.field41 = true;
        this.method23(-1280);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public final void method23(int arg0) {
        if (arg0 != -1280) {
            this.method19(false, -110);
        }
        ++field42;
        if (this.field41) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field5646.field3817 + -1280), (float) (super.field5646.field3817 + -768), 1.0F / (float) super.field5646.field3730, (float) super.field5646.field3833 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lvd;)V")
    public class5(class258 arg0) {
        super(arg0);
        if (!super.field5646.field3755) {
            this.field46 = false;
        } else {
            this.field53 = class460.method2666("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 12, 34336, super.field5646);
            this.field52 = class460.method2666("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 12, 34336, super.field5646);
            this.field55 = class460.method2666("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 12, 34336, super.field5646);
            this.field51 = class460.method2666("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 12, 34336, super.field5646);
            this.field46 = this.field51 != null & this.field55 != null & this.field52 != null & this.field53 != null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        ++field54;
        if (this.field41) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field41 = false;
        }
        if (arg0 <= 74) {
            this.field41 = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)V")
    public final void method25(boolean arg0, boolean arg1) {
        ++field49;
        if (arg1) {
            this.field40 = arg0;
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class71 extends class229 {

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "Z")
    private boolean field1070;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Lmc;")
    private class87 field1062;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "Lmc;")
    private class87 field1068;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "Lmc;")
    private class87 field1063;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "Lmc;")
    private class87 field1073;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "[I")
    public static int[] field1066 = new int[14];

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "[Z")
    public static boolean[] field1071;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "F")
    public static float field1072;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Z")
    private boolean field1056;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "Z")
    private boolean field1060;

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lht;)V")
    public class71(class410 arg0) {
        super(arg0);
        if (!super.field3194.field5998) {
            this.field1070 = false;
        } else {
            this.field1062 = class8.method48(34336, super.field3194, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34933);
            this.field1068 = class8.method48(34336, super.field3194, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34933);
            this.field1063 = class8.method48(34336, super.field3194, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34933);
            this.field1073 = class8.method48(34336, super.field3194, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34933);
            this.field1070 = this.field1073 != null & this.field1068 != null & this.field1062 != null & this.field1063 != null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZ)V")
    public final void method20(boolean arg0, boolean arg1) {
        this.field1060 = arg1;
        if (!arg0) {
            this.method19(71);
        }
        ++field1065;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V")
    public final void method541(byte arg0) {
        ++field1069;
        if (this.field1056) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field3194.field5896 + -1280), (float) (super.field3194.field5896 - 768), 1.0F / (float) super.field3194.field5974, (float) super.field3194.field5957 / 255.0F);
        }
        if (arg0 > -10) {
            this.method12(64, 83, 72);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public final void method19(int arg0) {
        ++field1058;
        if (arg0 != 262144) {
            this.method22(111, 0, (class188) null);
        }
        if (this.field1056) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1056 = false;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILao;)V")
    public final void method22(int arg0, int arg1, class188 arg2) {
        if (arg0 < -45) {
            ++field1061;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)Z")
    public final boolean method13(byte arg0) {
        if (arg0 < 123) {
            this.method20(false, true);
        }
        ++field1067;
        return this.field1070;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public final void method542(int arg0) {
        ++field1064;
        class507.field7455[3] = (float) super.field3194.field5962;
        OpenGL.glTexGenfv(8192, 9474, class507.field7455, 0);
        if (arg0 != -25279) {
            this.field1068 = null;
        }
        if (!this.field1060) {
            OpenGL.glBindProgramARB(34336, super.field3194.field5962 == Integer.MAX_VALUE ? this.field1062.field1200 : this.field1063.field1200);
        } else {
            OpenGL.glBindProgramARB(34336, super.field3194.field5962 != Integer.MAX_VALUE ? this.field1073.field1200 : this.field1068.field1200);
        }
        OpenGL.glEnable(34336);
        this.field1056 = true;
        this.method541((byte) -18);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZI)V")
    public final void method17(boolean arg0, int arg1) {
        ++field1057;
        if (arg1 != -27632) {
            this.method19(35);
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(B)V")
    public static void method543(byte arg0) {
        field1066 = null;
        field1071 = null;
        int var1 = -44 % ((-68 - arg0) / 37);
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(III)V")
    public final void method12(int arg0, int arg1, int arg2) {
        ++field1059;
        int var4 = 103 % ((arg1 - 13) / 46);
    }

    static {
        new class19("", 76);
        field1071 = new boolean[8];
    }
}

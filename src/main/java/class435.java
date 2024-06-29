import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class435 extends class209 {

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "Z")
    private boolean field5917;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Lqj;")
    private class504 field5916;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lqj;")
    private class504 field5905;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Lqj;")
    private class504 field5910;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Lqj;")
    private class504 field5908;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "[F")
    public static float[] field5915 = new float[4];

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field5919 = 1;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field5921 = 0;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "F")
    public static float field5911;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Z")
    private boolean field5914;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
    private boolean field5920;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static void method2530(int arg0) {
        if (arg0 == -768) {
            field5915 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        if (!arg0) {
            this.field5910 = null;
        }
        ++field5907;
        return this.field5917;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public final void method2531(int arg0) {
        ++field5906;
        if (arg0 > -84) {
            this.field5916 = null;
        }
        class577.field8034[3] = (float) super.field2710.field4282;
        OpenGL.glTexGenfv(8192, 9474, class577.field8034, 0);
        if (!this.field5914) {
            OpenGL.glBindProgramARB(34336, super.field2710.field4282 == Integer.MAX_VALUE ? this.field5916.field7010 : this.field5910.field7010);
        } else {
            OpenGL.glBindProgramARB(34336, super.field2710.field4282 == Integer.MAX_VALUE ? this.field5905.field7010 : this.field5908.field7010);
        }
        OpenGL.glEnable(34336);
        this.field5920 = true;
        this.method2532(-768);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        if (arg2 > -75) {
            this.field5917 = false;
        }
        ++field5918;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Luq;)V")
    public class435(class313 arg0) {
        super(arg0);
        if (!super.field2710.field4281) {
            this.field5917 = false;
        } else {
            this.field5916 = class32.method186((byte) -96, super.field2710, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field5905 = class32.method186((byte) -89, super.field2710, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field5910 = class32.method186((byte) -108, super.field2710, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field5908 = class32.method186((byte) -86, super.field2710, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field5917 = this.field5908 != null & this.field5916 != null & this.field5905 != null & this.field5910 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
    public final void method2532(int arg0) {
        if (arg0 != -768) {
            this.method48(true, (byte) -116);
        }
        ++field5913;
        if (this.field5920) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field2710.field4246 + -1280), (float) (super.field2710.field4246 + -768), 1.0F / (float) super.field2710.field4278, (float) super.field2710.field4315 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field5905 = null;
        }
        ++field5909;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        if (arg1 <= 122) {
            this.method42(false);
        }
        ++field5912;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        this.field5914 = arg0;
        if (arg1 < 88) {
            this.field5908 = null;
        }
        ++field5904;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (this.field5920) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5920 = false;
        }
        ++field5922;
        if (arg0 != -1) {
            this.field5920 = true;
        }
    }
}

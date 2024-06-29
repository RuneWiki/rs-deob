import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class353 extends class446 {

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Z")
    private boolean field5205;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lhh;")
    private class86 field5212;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lhh;")
    private class86 field5204;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lhh;")
    private class86 field5203;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lhh;")
    private class86 field5201;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Los;")
    public static class309 field5211 = new class309("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field5217 = 0;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field5218 = -1;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lln;")
    public static class259 field5215 = new class259(0, 0);

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Z")
    private boolean field5207;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Z")
    private boolean field5213;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZB)V", line = 6)
    public final void method696(boolean arg0, byte arg1) {
        ++field5206;
        if (arg1 != 42) {
            field5217 = 25;
        }
        this.field5207 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 20)
    public static void method2184(byte arg0) {
        field5211 = null;
        int var1 = 0 % ((13 - arg0) / 55);
        field5215 = null;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 31)
    public final void method2185(int arg0) {
        ++field5202;
        class375.field5486[3] = (float) super.field6642.field829;
        OpenGL.glTexGenfv(8192, 9474, class375.field5486, 0);
        if (arg0 >= -97) {
            method2184((byte) 100);
        }
        if (!this.field5207) {
            OpenGL.glBindProgramARB(34336, ~super.field6642.field829 == Integer.MIN_VALUE ? this.field5212.field1765 : this.field5203.field1765);
        } else {
            OpenGL.glBindProgramARB(34336, super.field6642.field829 != Integer.MAX_VALUE ? this.field5201.field1765 : this.field5204.field1765);
        }
        OpenGL.glEnable(34336);
        this.field5213 = true;
        this.method2186(76);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)V", line = 55)
    public final void method695(byte arg0, boolean arg1) {
        if (arg0 != -33) {
            this.field5201 = null;
        }
        ++field5198;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 65)
    public final void method2186(int arg0) {
        if (this.field5213) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field6642.field865 + -1280), (float) (super.field6642.field865 + -768), 1.0F / (float) super.field6642.field876, (float) super.field6642.field894 / 255.0F);
        }
        if (arg0 > 46) {
            ++field5209;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lda;)V", line = 78)
    public class353(class44 arg0) {
        super(arg0);
        if (!super.field6642.field844) {
            this.field5205 = false;
        } else {
            this.field5212 = class368.method2255(super.field6642, (byte) -119, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336);
            this.field5204 = class368.method2255(super.field6642, (byte) -70, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336);
            this.field5203 = class368.method2255(super.field6642, (byte) 53, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336);
            this.field5201 = class368.method2255(super.field6642, (byte) -107, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336);
            this.field5205 = this.field5203 != null & this.field5204 != null & this.field5212 != null & this.field5201 != null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILac;)V", line = 97)
    public final void method694(int arg0, int arg1, class381 arg2) {
        ++field5208;
        if (arg1 != 0) {
            this.method688(-126);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Z", line = 110)
    public final boolean method691(byte arg0) {
        if (arg0 != -93) {
            return false;
        } else {
            ++field5210;
            return this.field5205;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 133)
    public final void method688(int arg0) {
        if (arg0 >= 5) {
            if (this.field5213) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field5213 = false;
            }
            ++field5199;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)Z", line = 151)
    public static final boolean method2187(int arg0, byte arg1, int arg2) {
        ++field5214;
        int var3 = 85 / ((22 - arg1) / 49);
        return ~(1024 & arg2) != -1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 161)
    public final void method689(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field5218 = 66;
        }
        ++field5200;
    }
}

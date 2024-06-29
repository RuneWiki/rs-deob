import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class152 extends class189 {

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "Lug;")
    private class401 field2187;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lug;")
    private class401 field2191;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lug;")
    private class401 field2181;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lug;")
    private class401 field2176;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Z")
    private boolean field2190;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Leh;")
    public static class246 field2189 = new class246(93, 4);

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2192 = new String[100];

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
    private boolean field2183;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Z")
    private boolean field2184;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lsv;IB)V", line = 3)
    public final void method51(class478 arg0, int arg1, byte arg2) {
        if (arg2 != -58) {
            this.field2181 = null;
        }
        ++field2180;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method47(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.method978(123);
        }
        ++field2178;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V", line = 26)
    public final void method52(byte arg0, int arg1, int arg2) {
        ++field2179;
        if (arg0 != 117) {
            method976(75);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 39)
    public final void method48(boolean arg0) {
        if (this.field2184) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2184 = false;
        }
        if (arg0) {
            ++field2177;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(ZI)V", line = 61)
    public final void method55(boolean arg0, int arg1) {
        this.field2183 = arg0;
        ++field2188;
        int var3 = 29 / ((arg1 - 36) / 46);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Z", line = 71)
    public final boolean method53(byte arg0) {
        int var2 = 23 % ((arg0 - -58) / 43);
        ++field2186;
        return this.field2190;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 87)
    public static void method976(int arg0) {
        field2192 = null;
        if (arg0 == 3) {
            field2189 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lih;)V", line = 100)
    public class152(class503 arg0) {
        super(arg0);
        if (super.field2702.field7351) {
            this.field2187 = class454.method2647("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field2702, 34336, (byte) 97);
            this.field2191 = class454.method2647("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field2702, 34336, (byte) -70);
            this.field2181 = class454.method2647("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field2702, 34336, (byte) 105);
            this.field2176 = class454.method2647("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field2702, 34336, (byte) -115);
            this.field2190 = this.field2176 != null & this.field2181 != null & this.field2187 != null & this.field2191 != null;
        } else {
            this.field2190 = false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 118)
    public final void method977(byte arg0) {
        if (arg0 != -62) {
            this.method52((byte) -6, 7, 94);
        }
        ++field2185;
        if (this.field2184) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field2702.field7355 + -1280), (float) (super.field2702.field7355 + -768), 1.0F / (float) super.field2702.field7403, (float) super.field2702.field7382 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 133)
    public final void method978(int arg0) {
        class147.field1960[arg0] = (float) super.field2702.field7409;
        ++field2182;
        OpenGL.glTexGenfv(8192, 9474, class147.field1960, 0);
        if (this.field2183) {
            OpenGL.glBindProgramARB(34336, super.field2702.field7409 == Integer.MAX_VALUE ? this.field2191.field5639 : this.field2176.field5639);
        } else {
            OpenGL.glBindProgramARB(34336, super.field2702.field7409 != Integer.MAX_VALUE ? this.field2181.field5639 : this.field2187.field5639);
        }
        OpenGL.glEnable(34336);
        this.field2184 = true;
        this.method977((byte) -62);
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class133 extends class56 {

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lvl;")
    private class240 field1924;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lvl;")
    private class240 field1923;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lvl;")
    private class240 field1928;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "Lvl;")
    private class240 field1925;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Z")
    private boolean field1914;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field1927 = 13156520;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Lcm;")
    public static class449 field1926 = new class449(2, 8);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Lfe;")
    public static class235 field1929;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
    private boolean field1917;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Z")
    private boolean field1922;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    public final void method380(boolean arg0, int arg1) {
        if (arg1 >= 42) {
            ++field1918;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        if (arg0 < -50) {
            if (this.field1922) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field1922 = false;
            }
            ++field1915;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZI)V")
    public final void method383(boolean arg0, int arg1) {
        ++field1913;
        this.field1917 = arg0;
        if (arg1 >= -77) {
            this.method381(32);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method859(int arg0) {
        ++field1921;
        class504.field7530[3] = (float) super.field752.field4148;
        OpenGL.glTexGenfv(8192, 9474, class504.field7530, arg0);
        if (!this.field1917) {
            OpenGL.glBindProgramARB(34336, super.field752.field4148 != Integer.MAX_VALUE ? this.field1928.field3389 : this.field1924.field3389);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field752.field4148 == Integer.MIN_VALUE ? this.field1923.field3389 : this.field1925.field3389);
        }
        OpenGL.glEnable(34336);
        this.field1922 = true;
        this.method860(-18534);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final void method860(int arg0) {
        if (this.field1922) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field752.field4160 + -1280), (float) (super.field752.field4160 + -768), 1.0F / (float) super.field752.field4195, (float) super.field752.field4193 / 255.0F);
        }
        ++field1920;
        if (arg0 != -18534) {
            this.method379(-104, -19, (class14) null);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lbv;)V")
    public class133(class282 arg0) {
        super(arg0);
        if (super.field752.field4207) {
            this.field1924 = class327.method2113(super.field752, (byte) -106, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field1923 = class327.method2113(super.field752, (byte) -106, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field1928 = class327.method2113(super.field752, (byte) -106, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field1925 = class327.method2113(super.field752, (byte) -106, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field1914 = this.field1925 != null & this.field1928 != null & this.field1924 != null & this.field1923 != null;
        } else {
            this.field1914 = false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z")
    public final boolean method377(byte arg0) {
        if (arg0 >= -8) {
            return false;
        } else {
            ++field1919;
            return this.field1914;
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    public static void method861(int arg0) {
        if (arg0 == 34336) {
            field1929 = null;
            field1926 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    public final void method382(int arg0, int arg1, int arg2) {
        ++field1912;
        if (arg2 != 0) {
            this.method860(19);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILkv;)V")
    public final void method379(int arg0, int arg1, class14 arg2) {
        int var4 = 121 % ((arg1 - 81) / 39);
        ++field1916;
    }
}

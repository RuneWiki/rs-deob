import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class346 extends class45 {

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Ltd;")
    private class315 field4813;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Ltd;")
    private class315 field4820;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Ltd;")
    private class315 field4808;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Ltd;")
    private class315 field4798;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Z")
    private boolean field4809;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[C")
    public static char[] field4804 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "[B")
    public static byte[] field4802 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "J")
    public static long field4815;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lmu;")
    public static class196 field4803;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Loj;")
    public static class258 field4814;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Z")
    private boolean field4810;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Z")
    private boolean field4812;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public final void method287(int arg0) {
        if (arg0 != 0) {
            this.field4813 = null;
        }
        if (this.field4812) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4812 = false;
        }
        ++field4806;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZB)V")
    public final void method279(boolean arg0, byte arg1) {
        if (arg1 <= 115) {
            this.method286(125, -84, -7);
        }
        ++field4807;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Liv;B)Lvq;")
    public static final class321 method2091(class65 arg0, byte arg1) {
        ++field4800;
        if (arg1 >= -109) {
            method2096(-123, 16, -120, -32);
        }
        class321 var2 = new class321();
        var2.field4522 = arg0.method623((byte) -84);
        var2.field4523 = class95.field1280.method2335(var2.field4522, (byte) -99);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lfd;)V")
    public class346(class365 arg0) {
        super(arg0);
        if (super.field506.field5361) {
            this.field4813 = class371.method2290(34336, (byte) 62, super.field506, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field4820 = class371.method2290(34336, (byte) 62, super.field506, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field4808 = class371.method2290(34336, (byte) 62, super.field506, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field4798 = class371.method2290(34336, (byte) 62, super.field506, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field4809 = this.field4813 != null & this.field4820 != null & this.field4808 != null & this.field4798 != null;
        } else {
            this.field4809 = false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V")
    public final void method281(int arg0, boolean arg1) {
        this.field4810 = arg1;
        ++field4816;
        if (arg0 != 0) {
            this.field4813 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public final void method2092(int arg0) {
        if (this.field4812) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field506.field5422 + -1280), (float) (super.field506.field5422 + -768), 1.0F / (float) super.field506.field5435, (float) super.field506.field5359 / 255.0F);
        }
        if (arg0 < 125) {
            this.field4808 = null;
        }
        ++field4801;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILkj;Z)V")
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        if (!arg2) {
            this.method2092(-86);
        }
        ++field4799;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public final void method2093(byte arg0) {
        ++field4811;
        class183.field2582[3] = (float) super.field506.field5340;
        if (arg0 == -41) {
            OpenGL.glTexGenfv(8192, 9474, class183.field2582, 0);
            if (this.field4810) {
                OpenGL.glBindProgramARB(34336, ~super.field506.field5340 != Integer.MIN_VALUE ? this.field4798.field4480 : this.field4820.field4480);
            } else {
                OpenGL.glBindProgramARB(34336, ~super.field506.field5340 == Integer.MIN_VALUE ? this.field4813.field4480 : this.field4808.field4480);
            }
            OpenGL.glEnable(34336);
            this.field4812 = true;
            this.method2092(127);
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public static void method2094(int arg0) {
        field4802 = null;
        field4804 = null;
        if (arg0 == -261) {
            field4803 = null;
            field4814 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public final void method286(int arg0, int arg1, int arg2) {
        if (arg1 <= 76) {
            field4815 = 84L;
        }
        ++field4818;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)V")
    public static final void method2095(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field2079 != null) {
                var3.field2079 = null;
            }
            if (var3.field2085 != null) {
                var3.field2085 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V")
    public static final void method2096(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 == -1) {
            ++class76.field1029;
            class32.method258(-128, class257.field3778);
        }
        ++field4817;
        if (arg2 == 1) {
            ++class114.field1599;
            class32.method258(-94, class242.field3577);
        }
        class472.field6970.method638(255, class229.field3360.method796(-95, 82) ? 1 : 0);
        class472.field6970.method611((byte) 67, arg0 - -class340.field4713);
        class472.field6970.method611((byte) 67, arg3 - -class476.field7013);
        if (arg1 >= -115) {
            field4819 = 98;
        }
        class98.field1317 = arg3;
        class74.field1012 = arg0;
        class233.field3421 = false;
        class490.method2944((byte) -31);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
    public final boolean method280(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field4821;
            return this.field4809;
        }
    }
}

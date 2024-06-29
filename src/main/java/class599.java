import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class599 extends class518 {

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "Lvl;")
    private class139 field8196;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "Lvl;")
    private class139 field8198;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "Lvl;")
    private class139 field8197;

    @OriginalMember(owner = "client!vw", name = "y", descriptor = "Lvl;")
    private class139 field8205;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "Z")
    private boolean field8193;

    @OriginalMember(owner = "client!vw", name = "x", descriptor = "[I")
    public static int[] field8204 = new int[1];

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!vw", name = "A", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "Z")
    private boolean field8194;

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "Z")
    private boolean field8201;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public final void method1137(int arg0) {
        ++field8207;
        if (arg0 == 6) {
            if (this.field8194) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field8194 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lpea;)V")
    public class599(class641 arg0) {
        super(arg0);
        if (super.field7145.field8987) {
            this.field8196 = class436.method2501(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field7145, false);
            this.field8198 = class436.method2501(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field7145, false);
            this.field8197 = class436.method2501(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field7145, false);
            this.field8205 = class436.method2501(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field7145, false);
            this.field8193 = this.field8196 != null & this.field8198 != null & this.field8197 != null & this.field8205 != null;
        } else {
            this.field8193 = false;
        }
    }

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "(I)V")
    public static void method3318(int arg0) {
        field8204 = null;
        if (arg0 != 34336) {
            method3318(-66);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZB)V")
    public final void method1139(boolean arg0, byte arg1) {
        if (arg1 == 127) {
            this.field8201 = arg0;
            ++field8206;
        }
    }

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "(I)V")
    public final void method3319(int arg0) {
        if (this.field8194) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field7145.field8977 + -1280), (float) (super.field7145.field8977 + -768), 1.0F / (float) super.field7145.field9081, (float) super.field7145.field9029 / 255.0F);
        }
        if (arg0 == 0) {
            ++field8202;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)I")
    public static int method3320(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(BLwq;I)V")
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        ++field8199;
        if (arg0 != 75) {
            field8204 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IZI)V")
    public final void method1134(int arg0, boolean arg1, int arg2) {
        ++field8200;
        if (arg1) {
            this.field8201 = true;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)Z")
    public final boolean method1131(boolean arg0) {
        if (arg0) {
            this.method1131(false);
        }
        ++field8191;
        return this.field8193;
    }

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "(I)V")
    public final void method3321(int arg0) {
        ++field8192;
        class622.field8466[3] = (float) super.field7145.field9043;
        OpenGL.glTexGenfv(8192, 9474, class622.field8466, 0);
        if (this.field8201) {
            OpenGL.glBindProgramARB(34336, ~super.field7145.field9043 == Integer.MIN_VALUE ? this.field8198.field1780 : this.field8205.field1780);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field7145.field9043 == Integer.MIN_VALUE ? this.field8196.field1780 : this.field8197.field1780);
        }
        OpenGL.glEnable(34336);
        this.field8194 = true;
        if (arg0 > 119) {
            this.method3319(0);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        if (arg1 < 79) {
            this.field8198 = null;
        }
        ++field8203;
    }

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)V")
    public static final void method3322(int arg0) {
        ++field8195;
        if (arg0 <= -38) {
            if (~class610.field8316 >= -1) {
                class427.field5933 = "";
            } else {
                int var1 = 0;
                for (int var2 = 0; ~var2 > ~class603.field8242.length; ++var2) {
                    if (class603.field8242[var2].startsWith("--> ")) {
                        ++var1;
                        if (class610.field8316 == var1) {
                            class427.field5933 = class603.field8242[var2].substring(4);
                            return;
                        }
                    }
                }
            }
        }
    }
}

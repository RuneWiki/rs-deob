import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class195 extends class125 {

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lik;")
    private class141 field2506;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Lik;")
    private class141 field2511;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lik;")
    private class141 field2508;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "Lik;")
    private class141 field2510;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Z")
    private boolean field2504;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[[I")
    public static int[][] field2503 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "[Lwc;")
    public static class49[] field2519 = new class49[5];

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Z")
    private boolean field2509;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "Z")
    private boolean field2521;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "[I")
    public static int[] field2507;

    static {
        for (int var0 = 0; var0 < field2519.length; ++var0) {
            field2519[var0] = new class49();
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 3)
    public final void method667(int arg0) {
        if (arg0 != -18112) {
            this.field2511 = null;
        }
        if (this.field2509) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2509 = false;
        }
        ++field2505;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(ZI)V", line = 25)
    public final void method665(boolean arg0, int arg1) {
        ++field2513;
        if (arg1 < 92) {
            method1118(-14);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z", line = 35)
    public final boolean method666(int arg0) {
        int var2 = -20 % ((arg0 - 11) / 63);
        ++field2514;
        return this.field2504;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILhe;I)V", line = 48)
    public final void method669(int arg0, class252 arg1, int arg2) {
        if (arg0 == 67) {
            ++field2512;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 58)
    public final void method662(int arg0, int arg1, int arg2) {
        if (arg0 >= -35) {
            this.field2510 = null;
        }
        ++field2523;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z", line = 72)
    public static final boolean method1115(int arg0, int arg1) {
        if (arg0 != -14) {
            return false;
        } else {
            ++field2516;
            if (~arg1 != -59 && arg1 != 30 && arg1 != 47 && ~arg1 != -14 && ~arg1 != -1010) {
                return ~arg1 == -21 || arg1 == 1002;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V", line = 96)
    public final void method1116(int arg0) {
        int var2 = 45 % ((arg0 - -83) / 38);
        ++field2522;
        if (this.field2509) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field1617.field5366 + -1280), (float) (super.field1617.field5366 + -768), 1.0F / (float) super.field1617.field5376, (float) super.field1617.field5445 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 108)
    public final void method1117(int arg0) {
        class242.field3206[3] = (float) super.field1617.field5365;
        ++field2515;
        OpenGL.glTexGenfv(8192, 9474, class242.field3206, 0);
        if (!this.field2521) {
            OpenGL.glBindProgramARB(34336, super.field1617.field5365 == Integer.MAX_VALUE ? this.field2506.field1871 : this.field2508.field1871);
        } else {
            OpenGL.glBindProgramARB(34336, super.field1617.field5365 != Integer.MAX_VALUE ? this.field2510.field1871 : this.field2511.field1871);
        }
        if (arg0 < 27) {
            this.field2510 = null;
        }
        OpenGL.glEnable(34336);
        this.field2509 = true;
        this.method1116(-33);
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 133)
    public static final void method1118(int arg0) {
        class111.field1481 = 0;
        class417.field6028 = -1;
        ++field2518;
        if (arg0 <= -34) {
            class234.field3122 = -1;
        }
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V", line = 146)
    public static final void method1119(int arg0) {
        ++field2520;
        class393.field5677 = null;
        class113.method684(0, 0, -1, 0, arg0, (byte) 71, class168.field2174, class430.field6244, class372.field5051);
        if (class393.field5677 != null) {
            class176.method1027(class49.field560, 0, class372.field5051, (byte) 124, class430.field6244, -1412584499, class393.field5677, class79.field969, 0, class474.field7033.field6642);
            class393.field5677 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)V", line = 161)
    public static void method1120(int arg0) {
        if (arg0 != -13825) {
            field2503 = null;
        }
        field2519 = null;
        field2507 = null;
        field2503 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V", line = 173)
    public final void method668(boolean arg0, int arg1) {
        ++field2517;
        if (arg1 == 0) {
            this.field2521 = arg0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lur;)V", line = 186)
    public class195(class377 arg0) {
        super(arg0);
        if (super.field1617.field5413) {
            this.field2506 = class213.method1362("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field1617, (byte) 60, 34336);
            this.field2511 = class213.method1362("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field1617, (byte) 60, 34336);
            this.field2508 = class213.method1362("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field1617, (byte) 60, 34336);
            this.field2510 = class213.method1362("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field1617, (byte) 60, 34336);
            this.field2504 = this.field2510 != null & this.field2506 != null & this.field2511 != null & this.field2508 != null;
        } else {
            this.field2504 = false;
        }
    }
}

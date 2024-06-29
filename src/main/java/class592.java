import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class592 extends class337 {

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "Z")
    private boolean field8591;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "Lnb;")
    private class250 field8604;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "Lnb;")
    private class250 field8596;

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "Lnb;")
    private class250 field8609;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "Lnb;")
    private class250 field8593;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "[F")
    public static float[] field8592 = new float[16];

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public static int field8588 = 100;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Lcea;")
    public static class180 field8587 = new class180("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    public static int field8606 = -1;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
    public static int field8608 = -1;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "F")
    public static float field8603;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "Loca;")
    public static class220 field8605;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "Z")
    private boolean field8597;

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "Z")
    private boolean field8602;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        if (this.field8597) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8597 = false;
        }
        ++field8600;
        if (arg0 >= -21) {
            field8608 = 78;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBLuu;)V")
    public final void method253(int arg0, byte arg1, class238 arg2) {
        if (arg1 != 93) {
            field8608 = -106;
        }
        ++field8590;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lmh;)V")
    public class592(class537 arg0) {
        super(arg0);
        if (!super.field4382.field7780) {
            this.field8591 = false;
        } else {
            this.field8604 = class401.method2297(super.field4382, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 0);
            this.field8596 = class401.method2297(super.field4382, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 0);
            this.field8609 = class401.method2297(super.field4382, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 0);
            this.field8593 = class401.method2297(super.field4382, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 0);
            this.field8591 = this.field8609 != null & this.field8604 != null & this.field8596 != null & this.field8593 != null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
    public final void method3436(boolean arg0) {
        ++field8607;
        if (this.field8597) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field4382.field7829 - 1280), (float) (super.field4382.field7829 + -768), 1.0F / (float) super.field4382.field7840, (float) super.field4382.field7853 / 255.0F);
        }
        if (arg0) {
            this.method251((byte) -32);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZI)V")
    public final void method256(boolean arg0, int arg1) {
        if (arg1 == 28300) {
            ++field8599;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        this.field8602 = arg1;
        if (arg0 <= 10) {
            this.method252((byte) 11, false);
        }
        ++field8594;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZII)V")
    public final void method258(boolean arg0, int arg1, int arg2) {
        ++field8595;
        if (arg0) {
            field8592 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(B)V")
    public final void method3437(byte arg0) {
        class252.field3262[3] = (float) super.field4382.field7835;
        ++field8589;
        OpenGL.glTexGenfv(8192, 9474, class252.field3262, 0);
        int var2 = 69 % ((66 - arg0) / 34);
        if (!this.field8602) {
            OpenGL.glBindProgramARB(34336, super.field4382.field7835 != Integer.MAX_VALUE ? this.field8609.field3226 : this.field8604.field3226);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field4382.field7835 == Integer.MIN_VALUE ? this.field8596.field3226 : this.field8593.field3226);
        }
        OpenGL.glEnable(34336);
        this.field8597 = true;
        this.method3436(false);
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
    public static void method3438(int arg0) {
        field8587 = null;
        field8592 = null;
        field8605 = null;
        if (arg0 != -11876) {
            field8587 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)Z")
    public final boolean method257(byte arg0) {
        if (arg0 < 115) {
            this.field8593 = null;
        }
        ++field8598;
        return this.field8591;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILpa;Let;IIIILha;)V")
    public static final void method3439(int arg0, class309 arg1, class509 arg2, int arg3, int arg4, int arg5, int arg6, class52 arg7) {
        ++field8601;
        if (arg7 != null) {
            int var8;
            if (~class617.field8931 == -5) {
                var8 = 16383 & (int) class558.field8223;
            } else {
                var8 = (int) class558.field8223 + class335.field4369 & 16383;
            }
            int var9 = 10 + Math.max(arg2.field7094 / 2, arg2.field7059 / 2);
            int var10 = arg5 * arg5 + arg6 * arg6;
            if (var10 <= var9 * var9) {
                if (arg0 != 16383) {
                    field8608 = 19;
                }
                int var11 = class442.field6100[var8];
                int var12 = class442.field6101[var8];
                if (~class617.field8931 != -5) {
                    var11 = var11 * 256 / (class194.field2354 - -256);
                    var12 = var12 * 256 / (class194.field2354 - -256);
                }
                int var13 = arg5 * var11 - -(arg6 * var12) >> 15;
                int var14 = arg5 * var12 + -(arg6 * var11) >> 15;
                arg7.method7(var13 + arg2.field7094 / 2 + (arg3 - arg7.method292() / 2), arg2.field7059 / 2 + (arg4 - (var14 + arg7.method286() / 2)), arg1, arg3, arg4);
            }
        }
    }
}

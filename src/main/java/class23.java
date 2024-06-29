import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class23 extends class369 {

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Lpl;")
    private class651 field711;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "Lpl;")
    private class651 field719;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Lpl;")
    private class651 field722;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Lpl;")
    private class651 field710;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
    private boolean field721;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Ltp;")
    private class533 field717;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "[I")
    public static int[] field712 = new int[1];

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Lkn;")
    public static class737 field724 = new class737(9, 19);

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "Z")
    private boolean field716;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "Z")
    private boolean field720;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field723;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 9)
    public final void method365(boolean arg0) {
        if (!arg0) {
            ++field715;
            class495 var2 = super.field5255.field588;
            if (!this.field720) {
                OpenGL.glBindProgramARB(34336, super.field5255.field610 == Integer.MAX_VALUE ? this.field711.field8946 : this.field722.field8946);
            } else {
                OpenGL.glBindProgramARB(34336, ~super.field5255.field610 != Integer.MIN_VALUE ? this.field710.field8946 : this.field719.field8946);
            }
            var2.method2909(true, 0.0F, 0.0F, -1.0F, (float) super.field5255.field610, class478.field6665);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class478.field6665[0], class478.field6665[1], class478.field6665[2], class478.field6665[3]);
            OpenGL.glEnable(34336);
            this.field716 = true;
            this.method370(34336);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZB)V", line = 35)
    public final void method366(boolean arg0, byte arg1) {
        int var3 = -82 / ((arg1 - -60) / 38);
        ++field713;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 48)
    public static void method367(byte arg0) {
        field723 = null;
        int var1 = 19 % ((arg0 - -67) / 59);
        field724 = null;
        field712 = null;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Z", line = 61)
    public final boolean method368(int arg0) {
        ++field725;
        return arg0 >= -5 ? false : this.field721;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZ)V", line = 72)
    public final void method369(boolean arg0, boolean arg1) {
        this.field720 = arg0;
        ++field714;
        super.field5255.method190(-15039, 1);
        super.field5255.method256((byte) -97, this.field717);
        super.field5255.method175(34165, (byte) 101, 7681);
        super.field5255.method239(34166, 768, (byte) -87, 0);
        super.field5255.method239(5890, 770, (byte) -87, 2);
        super.field5255.method274(arg1, 0, 770, 34168);
        super.field5255.method190(-15039, 0);
        this.method365(false);
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V", line = 88)
    public final void method370(int arg0) {
        if (arg0 == 34336) {
            if (this.field716) {
                int var2 = super.field5255.method186();
                int var3 = super.field5255.method323();
                float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
                float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5255.field670, (float) super.field5255.field631 / 255.0F);
                super.field5255.method190(-15039, 1);
                super.field5255.method358(super.field5255.field628, 122);
                super.field5255.method190(-15039, 0);
            }
            ++field707;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lqo;)V", line = 120)
    public class23(class22 arg0) {
        super(arg0);
        if (super.field5255.field663) {
            this.field711 = class578.method3326(34336, super.field5255, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", false);
            this.field719 = class578.method3326(34336, super.field5255, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", false);
            this.field722 = class578.method3326(34336, super.field5255, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", false);
            this.field710 = class578.method3326(34336, super.field5255, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", false);
            if (!(this.field710 != null & this.field711 != null & this.field719 != null & this.field722 != null)) {
                this.field721 = false;
            } else {
                this.field717 = new class533(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field717.method3067(false, false, 10243);
                this.field721 = true;
            }
        } else {
            this.field721 = false;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 147)
    public final void method371(int arg0) {
        if (arg0 > -75) {
            this.method365(true);
        }
        ++field709;
        if (this.field716) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field716 = false;
        }
        super.field5255.method190(-15039, 1);
        super.field5255.method256((byte) -97, (class36) null);
        super.field5255.method175(8448, (byte) -61, 8448);
        super.field5255.method239(5890, 768, (byte) -87, 0);
        super.field5255.method239(34166, 770, (byte) -87, 2);
        super.field5255.method274(false, 0, 770, 5890);
        super.field5255.method190(-15039, 0);
        if (this.field706) {
            super.field5255.method239(5890, 768, (byte) -87, 0);
            super.field5255.method274(false, 0, 770, 5890);
            this.field706 = false;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIB)V", line = 189)
    public final void method372(int arg0, int arg1, byte arg2) {
        ++field718;
        if (arg2 > -42) {
            this.method366(true, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lud;BI)V", line = 203)
    public final void method373(class36 arg0, byte arg1, int arg2) {
        if (arg0 == null) {
            if (!this.field706) {
                super.field5255.method256((byte) -114, super.field5255.field649);
                super.field5255.method237(0, 1);
                super.field5255.method239(34168, 768, (byte) -87, 0);
                super.field5255.method274(false, 0, 770, 34168);
                this.field706 = true;
            }
        } else {
            if (this.field706) {
                super.field5255.method239(5890, 768, (byte) -87, 0);
                super.field5255.method274(false, 0, 770, 5890);
                this.field706 = false;
            }
            super.field5255.method256((byte) -105, arg0);
            super.field5255.method237(0, arg2);
        }
        if (arg1 < -89) {
            ++field708;
        }
    }
}

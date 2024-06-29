import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class436 extends class106 {

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "Ltq;")
    private class442 field6510;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "Ltq;")
    private class442 field6513;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Ltq;")
    private class442 field6498;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "Ltq;")
    private class442 field6508;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Z")
    private boolean field6514;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "Z")
    public static boolean field6501 = false;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Z")
    public static boolean field6497 = false;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field6504 = new String[200];

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lua;")
    public static class470 field6494;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Z")
    private boolean field6499;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "Z")
    private boolean field6509;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLbu;II)Leu;")
    public static final class332 method2598(byte arg0, class17 arg1, int arg2, int arg3) {
        if (arg0 <= 49) {
            return null;
        } else {
            ++field6505;
            byte[] var4 = arg1.method114(arg2, arg3, 123);
            return var4 == null ? null : new class332(var4);
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
    public static void method2599(int arg0) {
        if (arg0 == 34336) {
            field6494 = null;
            field6504 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        if (arg0 != -22884) {
            field6497 = true;
        }
        ++field6506;
        return this.field6514;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILih;)V")
    public final void method346(int arg0, int arg1, class492 arg2) {
        ++field6495;
        if (arg0 != 128) {
            this.field6514 = false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V")
    public final void method2600(int arg0) {
        class410.field6146[3] = (float) super.field1770.field4565;
        ++field6503;
        OpenGL.glTexGenfv(arg0, 9474, class410.field6146, 0);
        if (!this.field6509) {
            OpenGL.glBindProgramARB(34336, ~super.field1770.field4565 != Integer.MIN_VALUE ? this.field6498.field6611 : this.field6510.field6611);
        } else {
            OpenGL.glBindProgramARB(34336, super.field1770.field4565 == Integer.MAX_VALUE ? this.field6513.field6611 : this.field6508.field6611);
        }
        OpenGL.glEnable(34336);
        this.field6499 = true;
        this.method2601(arg0 + -8295);
    }

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "(I)V")
    public final void method2601(int arg0) {
        if (this.field6499) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field1770.field4615 + -1280), (float) (super.field1770.field4615 + -768), 1.0F / (float) super.field1770.field4594, (float) super.field1770.field4590 / 255.0F);
        }
        ++field6511;
        if (arg0 > -26) {
            field6494 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)I")
    public static final int method2602(int arg0, int arg1) {
        if (arg1 != -2857) {
            return -29;
        } else {
            ++field6512;
            return arg0 & 127;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZB)V")
    public final void method344(boolean arg0, byte arg1) {
        ++field6507;
        if (arg1 < 102) {
            this.method346(-66, -53, (class492) null);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        if (this.field6499) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6499 = false;
        }
        if (arg0 != 3) {
            field6501 = true;
        }
        ++field6502;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lvj;)V")
    public class436(class303 arg0) {
        super(arg0);
        if (super.field1770.field4546) {
            this.field6510 = class210.method1418(super.field1770, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 88);
            this.field6513 = class210.method1418(super.field1770, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, -100);
            this.field6498 = class210.method1418(super.field1770, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 52);
            this.field6508 = class210.method1418(super.field1770, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, -120);
            this.field6514 = this.field6513 != null & this.field6510 != null & this.field6498 != null & this.field6508 != null;
        } else {
            this.field6514 = false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)V")
    public final void method347(int arg0, byte arg1, int arg2) {
        if (arg1 != 43) {
            field6501 = true;
        }
        ++field6500;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
    public final void method343(boolean arg0, int arg1) {
        ++field6496;
        this.field6509 = arg0;
        if (arg1 != 1) {
            this.method342(83);
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class379 extends class318 {

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "Lrm;")
    private class284 field5725;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Lrm;")
    private class284 field5728;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lrm;")
    private class284 field5717;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Lrm;")
    private class284 field5714;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Z")
    private boolean field5712;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Ltr;")
    public static class195 field5715 = new class195(10, 7);

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[F")
    public static float[] field5721 = new float[16384];

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[F")
    public static float[] field5727 = new float[16384];

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "F")
    public static float field5729;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Z")
    private boolean field5716;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Z")
    private boolean field5723;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field5721[var2] = (float) Math.sin((double) var2 * var0);
            field5727[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 4)
    public final void method2379(int arg0) {
        if (this.field5723) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field4800.field3138 - 1280), (float) (super.field4800.field3138 - 768), 1.0F / (float) super.field4800.field3059, (float) super.field4800.field3116 / 255.0F);
        }
        ++field5713;
        if (arg0 != 0) {
            field5715 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V", line = 17)
    public final void method722(int arg0, boolean arg1) {
        ++field5724;
        int var3 = 103 % ((arg0 - -23) / 46);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)Z", line = 27)
    public static final boolean method2380(int arg0, int arg1, int arg2) {
        if (arg2 != 16384) {
            return true;
        } else {
            ++field5710;
            return (arg0 & 24) != 0 | ~(544 & arg0) == -545;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lkd;)V", line = 38)
    public class379(class188 arg0) {
        super(arg0);
        if (super.field4800.field3074) {
            this.field5725 = class46.method473(34336, (byte) 87, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field4800);
            this.field5728 = class46.method473(34336, (byte) 60, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field4800);
            this.field5717 = class46.method473(34336, (byte) 53, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field4800);
            this.field5714 = class46.method473(34336, (byte) 15, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field4800);
            this.field5712 = this.field5717 != null & this.field5725 != null & this.field5728 != null & this.field5714 != null;
        } else {
            this.field5712 = false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 57)
    public static void method2381(boolean arg0) {
        if (!arg0) {
            field5715 = null;
        }
        field5715 = null;
        field5721 = null;
        field5727 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIILse;)V", line = 71)
    public static final void method2382(int arg0, int arg1, int arg2, class171 arg3) {
        class138 var4 = class297.method1929(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field2105 = arg3;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V", line = 78)
    public final void method2383(int arg0) {
        class358.field5313[3] = (float) super.field4800.field3098;
        ++field5719;
        OpenGL.glTexGenfv(8192, 9474, class358.field5313, 0);
        if (this.field5716) {
            OpenGL.glBindProgramARB(34336, ~super.field4800.field3098 != Integer.MIN_VALUE ? this.field5714.field4316 : this.field5728.field4316);
        } else {
            OpenGL.glBindProgramARB(34336, super.field4800.field3098 != Integer.MAX_VALUE ? this.field5717.field4316 : this.field5725.field4316);
        }
        if (arg0 != -23971) {
            this.method722(81, false);
        }
        OpenGL.glEnable(34336);
        this.field5723 = true;
        this.method2379(0);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z", line = 103)
    public final boolean method721(int arg0) {
        ++field5720;
        return arg0 != 0 ? false : this.field5712;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lav;IB)V", line = 117)
    public final void method715(class454 arg0, int arg1, byte arg2) {
        if (arg2 >= -108) {
            method2380(-62, -116, -73);
        }
        ++field5722;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V", line = 131)
    public final void method719(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field5714 = null;
        }
        ++field5711;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZZ)V", line = 141)
    public final void method718(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field5716 = arg0;
            ++field5726;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 161)
    public final void method723(byte arg0) {
        if (this.field5723) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5723 = false;
        }
        ++field5718;
        if (arg0 <= 91) {
            this.method715((class454) null, -17, (byte) -92);
        }
    }
}

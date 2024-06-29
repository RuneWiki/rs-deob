import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 extends class141 {

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Z")
    private boolean field92;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lj;")
    private class386 field85;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lj;")
    private class386 field102;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lj;")
    private class386 field87;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lj;")
    private class386 field104;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Z")
    public static boolean field88 = false;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[I")
    public static int[] field99 = new int[4096];

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lbd;")
    public static class44 field89 = new class44("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Z")
    private boolean field101;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Z")
    private boolean field103;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "[Lrc;")
    public static class383[] field100;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        ++field98;
        if (this.field103) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field103 = false;
        }
        int var2 = -54 / ((-51 - arg0) / 45);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lbt;)V")
    public class10(class33 arg0) {
        super(arg0);
        if (!super.field2178.field649) {
            this.field92 = false;
        } else {
            this.field85 = class137.method995(super.field2178, (byte) -87, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field102 = class137.method995(super.field2178, (byte) -116, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field87 = class137.method995(super.field2178, (byte) -104, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field104 = class137.method995(super.field2178, (byte) -114, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field92 = this.field104 != null & this.field85 != null & this.field102 != null & this.field87 != null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
    public final void method49(int arg0, int arg1, int arg2) {
        ++field97;
        if (arg0 != 1400) {
            this.field85 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        class492.field7130[3] = (float) super.field2178.field700;
        ++field91;
        OpenGL.glTexGenfv(8192, 9474, class492.field7130, 0);
        if (this.field101) {
            OpenGL.glBindProgramARB(34336, ~super.field2178.field700 != Integer.MIN_VALUE ? this.field104.field5504 : this.field102.field5504);
        } else {
            OpenGL.glBindProgramARB(34336, super.field2178.field700 != Integer.MAX_VALUE ? this.field87.field5504 : this.field85.field5504);
        }
        OpenGL.glEnable(34336);
        this.field103 = true;
        this.method56(false);
        if (arg0 < 41) {
            this.field102 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
    public final void method51(int arg0, boolean arg1) {
        ++field86;
        this.field101 = arg1;
        if (arg0 != -21897) {
            this.method48(-9);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method52(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5) {
        class267.method1716(99, arg4, arg3, arg5, arg0, (String) null, -1, arg2);
        ++field94;
        if (arg1 < 26) {
            method52((String) null, -110, -119, (String) null, (String) null, -54);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field90;
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static void method54(int arg0) {
        if (arg0 == -1) {
            field99 = null;
            field100 = null;
            field89 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field93;
            return this.field92;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public final void method56(boolean arg0) {
        if (arg0) {
            this.method53(false, 123);
        }
        ++field84;
        if (this.field103) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field2178.field683 + -1280), (float) (super.field2178.field683 - 768), 1.0F / (float) super.field2178.field718, (float) super.field2178.field759 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lei;II)V")
    public final void method57(class120 arg0, int arg1, int arg2) {
        ++field96;
        if (arg2 <= 89) {
            this.method53(false, 100);
        }
    }
}

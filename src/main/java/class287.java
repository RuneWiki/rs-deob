import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class287 extends class366 {

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Led;")
    private class655 field4568;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Led;")
    private class655 field4569;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Led;")
    private class655 field4553;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Led;")
    private class655 field4554;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lwh;")
    private class133 field4556;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Z")
    private boolean field4555;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lri;")
    public static class97 field4566;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
    private boolean field4552;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Z")
    private boolean field4561;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        this.field4552 = arg0;
        ++field4567;
        super.field5742.method834(true, 1);
        super.field5742.method856(false, this.field4556);
        super.field5742.method857(arg1 ^ 8960, 7681, 34165);
        super.field5742.method844(768, 34166, 0, (byte) -102);
        super.field5742.method844(770, 5890, 2, (byte) -102);
        super.field5742.method820(34168, 770, 0, 121);
        super.field5742.method834(true, arg1);
        this.method2036(false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZZ)V")
    public final void method1131(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method1133(true, -73);
        }
        ++field4564;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
    public final void method2036(boolean arg0) {
        ++field4560;
        class40 var2 = super.field5742.field1363;
        if (this.field4552) {
            OpenGL.glBindProgramARB(34336, super.field5742.field1395 != Integer.MAX_VALUE ? this.field4554.field9156 : this.field4569.field9156);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field5742.field1395 == Integer.MIN_VALUE ? this.field4568.field9156 : this.field4553.field9156);
        }
        if (arg0) {
            method2037(-30);
        }
        var2.method510(-1.0F, 0.0F, (float) super.field5742.field1395, class92.field1277, 4, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class92.field1277[0], class92.field1277[1], class92.field1277[2], class92.field1277[3]);
        OpenGL.glEnable(34336);
        this.field4561 = true;
        this.method2038(-114);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public static void method2037(int arg0) {
        if (arg0 > -88) {
            field4566 = null;
        }
        field4566 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILep;I)V")
    public final void method1130(int arg0, class386 arg1, int arg2) {
        if (arg0 != 1) {
            method2037(-74);
        }
        if (arg1 != null) {
            super.field5742.method856(false, arg1);
            super.field5742.method816(arg2, -119);
        } else {
            super.field5742.method856(false, super.field5742.field1393);
            super.field5742.method816(1, -127);
            super.field5742.method844(768, 34168, 0, (byte) -102);
            super.field5742.method820(34168, 770, 0, 121);
        }
        ++field4565;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public final void method1136(int arg0, int arg1, int arg2) {
        if (arg0 == -6561) {
            ++field4559;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
    public final boolean method1137(boolean arg0) {
        ++field4562;
        if (arg0) {
            this.field4555 = false;
        }
        return this.field4555;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method1132(int arg0) {
        ++field4557;
        if (this.field4561) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4561 = false;
        }
        super.field5742.method834(true, 1);
        super.field5742.method856(false, (class386) null);
        super.field5742.method857(8960, 8448, 8448);
        super.field5742.method844(768, 5890, 0, (byte) -102);
        super.field5742.method844(770, 34166, 2, (byte) -102);
        super.field5742.method820(5890, 770, 0, arg0 ^ 121);
        super.field5742.method834(true, 0);
        super.field5742.method844(768, 5890, 0, (byte) -102);
        super.field5742.method820(5890, 770, arg0, 121);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ler;)V")
    public class287(class92 arg0) {
        super(arg0);
        if (super.field5742.field1454) {
            this.field4568 = class375.method2466(34336, super.field5742, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field4569 = class375.method2466(34336, super.field5742, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field4553 = class375.method2466(34336, super.field5742, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field4554 = class375.method2466(34336, super.field5742, 0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (this.field4554 != null & this.field4568 != null & this.field4569 != null & this.field4553 != null) {
                this.field4556 = new class133(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field4556.method1158(false, false, (byte) 80);
                this.field4555 = true;
            } else {
                this.field4555 = false;
            }
        } else {
            this.field4555 = false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public final void method2038(int arg0) {
        if (this.field4561) {
            int var2 = super.field5742.method315();
            int var3 = super.field5742.method322();
            float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5742.field1464, (float) super.field5742.field1450 / 255.0F);
            super.field5742.method834(true, 1);
            super.field5742.method893(super.field5742.field1431, 126);
            super.field5742.method834(true, 0);
        }
        ++field4563;
        if (arg0 > -108) {
            this.field4561 = true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public static final void method2039(int arg0, int arg1) {
        ++field4558;
        if (~class20.field332 == arg1) {
            class252.field4036.method209(826987791, arg0);
        } else {
            class490.field7168 = arg0;
        }
    }
}

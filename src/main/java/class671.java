import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class671 extends class283 {

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "Z")
    private boolean field9564 = false;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "Z")
    private boolean field9556;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "Lft;")
    private class695 field9562;

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "Lft;")
    private class695 field9566;

    @OriginalMember(owner = "client!mea", name = "B", descriptor = "Lft;")
    private class695 field9569;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "Lft;")
    private class695 field9567;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "Lol;")
    private class246 field9553;

    @OriginalMember(owner = "client!mea", name = "C", descriptor = "I")
    public static int field9570 = 0;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "Lnca;")
    public static class627 field9558 = new class627("RC", 1);

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "Lgr;")
    public static class530 field9572 = new class530(50, 7);

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!mea", name = "D", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!mea", name = "F", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "Z")
    private boolean field9557;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "Z")
    private boolean field9561;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
    public final void method3823(boolean arg0) {
        ++field9559;
        class378 var2 = super.field3958.field5004;
        if (this.field9561) {
            OpenGL.glBindProgramARB(34336, ~super.field3958.field5084 != Integer.MIN_VALUE ? this.field9567.field9830 : this.field9566.field9830);
        } else {
            OpenGL.glBindProgramARB(34336, super.field3958.field5084 != Integer.MAX_VALUE ? this.field9569.field9830 : this.field9562.field9830);
        }
        var2.method2344(class80.field1143, 0.0F, (float) super.field3958.field5084, 125, 0.0F, -1.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class80.field1143[0], class80.field1143[1], class80.field1143[2], class80.field1143[3]);
        OpenGL.glEnable(34336);
        this.field9557 = arg0;
        this.method3824(0);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field9563;
        }
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)V")
    public final void method3824(int arg0) {
        ++field9568;
        if (arg0 != 0) {
            this.field9561 = false;
        }
        if (this.field9557) {
            int var2 = super.field3958.method227();
            int var3 = super.field3958.method387();
            float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3958.field5073, (float) super.field3958.field5072 / 255.0F);
            super.field3958.method2171(119, 1);
            super.field3958.method2123(super.field3958.field5075, 2);
            super.field3958.method2171(116, 0);
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lkw;)V")
    public class671(class346 arg0) {
        super(arg0);
        if (!super.field3958.field5009) {
            this.field9556 = false;
        } else {
            this.field9562 = class216.method1530(34336, super.field3958, true, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field9566 = class216.method1530(34336, super.field3958, true, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field9569 = class216.method1530(34336, super.field3958, true, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field9567 = class216.method1530(34336, super.field3958, true, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (this.field9567 != null & this.field9566 != null & this.field9562 != null & this.field9569 != null) {
                this.field9553 = new class246(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field9553.method1676(false, false, (byte) 86);
                this.field9556 = true;
            } else {
                this.field9556 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZI)V")
    public final void method73(boolean arg0, int arg1) {
        if (arg1 != 2) {
            field9573 = 70;
        }
        ++field9552;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        if (arg0 <= 96) {
            return true;
        } else {
            ++field9555;
            return this.field9556;
        }
    }

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)V")
    public static void method3825(int arg0) {
        field9558 = null;
        if (arg0 != -16327) {
            method3825(-48);
        }
        field9572 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/net/Socket;II)Loi;")
    public static final class694 method3826(Socket arg0, int arg1, int arg2) throws IOException {
        ++field9565;
        if (arg2 != 1) {
            field9570 = -65;
        }
        return new class226(arg0, arg1);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
    public final void method74(byte arg0) {
        ++field9554;
        if (this.field9557) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field9557 = false;
        }
        if (arg0 != 85) {
            this.field9557 = false;
        }
        super.field3958.method2171(arg0 ^ 45, 1);
        super.field3958.method2164(6, (class158) null);
        super.field3958.method2149(-11771, 8448, 8448);
        super.field3958.method2167(5890, 768, 10603, 0);
        super.field3958.method2167(34166, 770, 10603, 2);
        super.field3958.method2136(8960, 5890, 0, 770);
        super.field3958.method2171(118, 0);
        if (this.field9564) {
            super.field3958.method2167(5890, 768, 10603, 0);
            super.field3958.method2136(8960, 5890, 0, 770);
            this.field9564 = false;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lou;II)V")
    public final void method75(class158 arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            method3825(-44);
        }
        if (arg0 == null) {
            if (!this.field9564) {
                super.field3958.method2164(6, super.field3958.field5023);
                super.field3958.method2120(1, arg1 ^ 81);
                super.field3958.method2167(34168, 768, arg1 + 10601, 0);
                super.field3958.method2136(8960, 34168, 0, 770);
                this.field9564 = true;
            }
        } else {
            if (this.field9564) {
                super.field3958.method2167(5890, 768, 10603, 0);
                super.field3958.method2136(8960, 5890, 0, 770);
                this.field9564 = false;
            }
            super.field3958.method2164(6, arg0);
            super.field3958.method2120(arg2, arg1 + 46);
        }
        ++field9560;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        this.field9561 = arg1;
        ++field9550;
        super.field3958.method2171(123, 1);
        super.field3958.method2164(arg0 ^ -944, this.field9553);
        super.field3958.method2149(-11771, 7681, 34165);
        super.field3958.method2167(34166, 768, 10603, 0);
        super.field3958.method2167(5890, 770, 10603, 2);
        super.field3958.method2136(8960, 34168, 0, 770);
        super.field3958.method2171(117, 0);
        this.method3823(true);
        if (arg0 != -938) {
            this.method75((class158) null, -49, 110);
        }
    }

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)V")
    public static final void method3827(int arg0) {
        ++field9551;
        if (arg0 != -1) {
            field9558 = null;
        }
        class17.field163.method4013(-3);
        class412.field5871.method3031(arg0 ^ -17295);
        class57.field967.method3031(arg0 ^ -17295);
    }
}

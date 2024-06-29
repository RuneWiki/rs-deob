import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class378 extends class387 {

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "Z")
    private boolean field5274 = false;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Z")
    private boolean field5257;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "Lrd;")
    private class341 field5262;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "Lrd;")
    private class341 field5260;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Lrd;")
    private class341 field5261;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "Lrd;")
    private class341 field5265;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "Lsia;")
    private class737 field5263;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "Lhda;")
    public static class752 field5267 = new class752(3, -1);

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "Z")
    private boolean field5255;

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "Z")
    private boolean field5276;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
    public final void method2235(byte arg0) {
        if (this.field5255) {
            int var2 = super.field5405.method402();
            int var3 = super.field5405.method424();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5405.field9003, (float) super.field5405.field9029 / 255.0F);
            super.field5405.method3630(true, 1);
            super.field5405.method3651(-50, super.field5405.field9005);
            super.field5405.method3630(true, 0);
        }
        if (arg0 > -9) {
            field5267 = null;
        }
        ++field5259;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ldh;I)Z")
    public static final boolean method2236(class325 arg0, int arg1) {
        ++field5270;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field4638) {
            return false;
        } else {
            int var2 = 91 / ((62 - arg1) / 40);
            if (!arg0.method1968((byte) -14, class744.field10340)) {
                return false;
            } else if (class112.field1850.method2135((long) arg0.field4629, (byte) 31) != null) {
                return false;
            } else {
                return class8.field160.method2135((long) arg0.field4622, (byte) 31) == null;
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
    public final void method2237(byte arg0) {
        if (arg0 < -85) {
            ++field5256;
            class288 var2 = super.field5405.field8983;
            if (!this.field5276) {
                OpenGL.glBindProgramARB(34336, super.field5405.field9071 != Integer.MAX_VALUE ? this.field5261.field4814 : this.field5262.field4814);
            } else {
                OpenGL.glBindProgramARB(34336, super.field5405.field9071 != Integer.MAX_VALUE ? this.field5265.field4814 : this.field5260.field4814);
            }
            var2.method1785(0.0F, (float) super.field5405.field9071, -1.0F, 15082, 0.0F, class662.field8733);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class662.field8733[0], class662.field8733[1], class662.field8733[2], class662.field8733[3]);
            OpenGL.glEnable(34336);
            this.field5255 = true;
            this.method2235((byte) -86);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BZ)V")
    public final void method639(byte arg0, boolean arg1) {
        if (arg0 > -123) {
            this.field5276 = true;
        }
        ++field5271;
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(B)V")
    public static void method2238(byte arg0) {
        field5267 = null;
        if (arg0 >= -95) {
            method2239(-76, 33, -11);
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(III)Z")
    public static final boolean method2239(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field5267 = null;
        }
        ++field5258;
        return (arg0 & 1048832) != 0;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
    public final void method644(boolean arg0) {
        ++field5275;
        if (this.field5255) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5255 = false;
        }
        super.field5405.method3630(true, 1);
        super.field5405.method3639(-2, (class460) null);
        super.field5405.method3608(-63, 8448, 8448);
        super.field5405.method3661(768, 5890, 0, (byte) 4);
        super.field5405.method3661(770, 34166, 2, (byte) 4);
        super.field5405.method3599(0, 770, (byte) 37, 5890);
        super.field5405.method3630(true, 0);
        if (!arg0) {
            if (this.field5274) {
                super.field5405.method3661(768, 5890, 0, (byte) 4);
                super.field5405.method3599(0, 770, (byte) 37, 5890);
                this.field5274 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        if (arg0 != -16777216) {
            return false;
        } else {
            ++field5266;
            return this.field5257;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILd;ILjava/awt/Canvas;)Lha;")
    public static final class59 method2240(byte arg0, int arg1, class152 arg2, int arg3, Canvas arg4) {
        ++field5264;
        int var5 = -73 / ((arg0 - 12) / 60);
        return new class279(arg4, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(B)V")
    public static final void method2241(byte arg0) {
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class739.field10205[var1] = null;
        }
        if (arg0 < 7) {
            method2238((byte) 5);
        }
        ++field5269;
        class269.field3759 = 0;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lrda;)V")
    public class378(class663 arg0) {
        super(arg0);
        if (!super.field5405.field9020) {
            this.field5257 = false;
        } else {
            this.field5262 = class325.method1962((byte) 121, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field5405, 34336);
            this.field5260 = class325.method1962((byte) 93, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field5405, 34336);
            this.field5261 = class325.method1962((byte) 84, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field5405, 34336);
            this.field5265 = class325.method1962((byte) 122, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field5405, 34336);
            if (!(this.field5265 != null & this.field5261 != null & this.field5262 != null & this.field5260 != null)) {
                this.field5257 = false;
            } else {
                this.field5263 = new class737(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field5263.method4116((byte) -60, false, false);
                this.field5257 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILiga;)V")
    public final void method638(byte arg0, int arg1, class460 arg2) {
        ++field5273;
        if (arg2 == null) {
            if (!this.field5274) {
                super.field5405.method3639(-2, super.field5405.field9038);
                super.field5405.method3631((byte) 126, 1);
                super.field5405.method3661(768, 34168, 0, (byte) 4);
                super.field5405.method3599(0, 770, (byte) 37, 34168);
                this.field5274 = true;
            }
        } else {
            if (this.field5274) {
                super.field5405.method3661(768, 5890, 0, (byte) 4);
                super.field5405.method3599(0, 770, (byte) 37, 5890);
                this.field5274 = false;
            }
            super.field5405.method3639(-2, arg2);
            super.field5405.method3631((byte) 120, arg1);
        }
        if (arg0 < 53) {
            this.method640(true, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        ++field5268;
        int var4 = 77 / ((arg2 - 74) / 36);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZB)V")
    public final void method640(boolean arg0, byte arg1) {
        ++field5272;
        this.field5276 = arg0;
        super.field5405.method3630(true, 1);
        if (arg1 > 1) {
            super.field5405.method3639(-2, this.field5263);
            super.field5405.method3608(-54, 7681, 34165);
            super.field5405.method3661(768, 34166, 0, (byte) 4);
            super.field5405.method3661(770, 5890, 2, (byte) 4);
            super.field5405.method3599(0, 770, (byte) 37, 34168);
            super.field5405.method3630(true, 0);
            this.method2237((byte) -91);
        }
    }
}

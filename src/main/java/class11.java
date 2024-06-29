import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 extends class402 {

    @OriginalMember(owner = "client!sja", name = "s", descriptor = "Z")
    private boolean field204 = false;

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "Lvea;")
    private class290 field190;

    @OriginalMember(owner = "client!sja", name = "j", descriptor = "Lvea;")
    private class290 field195;

    @OriginalMember(owner = "client!sja", name = "k", descriptor = "Lvea;")
    private class290 field196;

    @OriginalMember(owner = "client!sja", name = "g", descriptor = "Lvea;")
    private class290 field192;

    @OriginalMember(owner = "client!sja", name = "q", descriptor = "Z")
    private boolean field202;

    @OriginalMember(owner = "client!sja", name = "f", descriptor = "Lld;")
    private class182 field191;

    @OriginalMember(owner = "client!sja", name = "h", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!sja", name = "i", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!sja", name = "l", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!sja", name = "m", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!sja", name = "n", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!sja", name = "o", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!sja", name = "p", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!sja", name = "r", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!sja", name = "u", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "Z")
    private boolean field189;

    @OriginalMember(owner = "client!sja", name = "t", descriptor = "Z")
    private boolean field205;

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(IZ)V")
    public final void method176(int arg0, boolean arg1) {
        this.field189 = arg1;
        ++field197;
        super.field5243.method3925((byte) 108, 1);
        super.field5243.method3936(false, this.field191);
        super.field5243.method3961(7681, 34165, 16127);
        super.field5243.method3903(34166, 0, 768, -114);
        super.field5243.method3903(5890, 2, 770, -121);
        super.field5243.method3931(0, 8960, 770, 34168);
        super.field5243.method3925((byte) 82, 0);
        if (arg0 > -32) {
            this.method183(-112, -9, -116);
        }
        this.method177(-122);
    }

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)V")
    public final void method177(int arg0) {
        ++field200;
        class446 var2 = super.field5243.field9760;
        if (this.field189) {
            OpenGL.glBindProgramARB(34336, ~super.field5243.field9797 != Integer.MIN_VALUE ? this.field192.field3496 : this.field195.field3496);
        } else {
            OpenGL.glBindProgramARB(34336, super.field5243.field9797 != Integer.MAX_VALUE ? this.field196.field3496 : this.field190.field3496);
        }
        var2.method2630(false, (float) super.field5243.field9797, -1.0F, 0.0F, 0.0F, class733.field10260);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class733.field10260[0], class733.field10260[1], class733.field10260[2], class733.field10260[3]);
        OpenGL.glEnable(34336);
        this.field205 = true;
        if (arg0 > -82) {
            this.method182(-78);
        }
        this.method182(-50);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        ++field198;
        if (arg0 >= -55) {
            this.field190 = null;
        }
        return this.field202;
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        ++field194;
        if (arg5 < 44) {
            method179(-39, -14, -51, 64, 101, (byte) 25, -115, -49, 116);
        }
        class382.field4860[class680.field9312++] = new class557(arg4, arg8, arg1, arg3, arg3, arg1, arg6, arg2, arg2, arg6, arg0, arg0, arg7, arg7);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(IBLfha;)V")
    public final void method180(int arg0, byte arg1, class400 arg2) {
        ++field199;
        if (arg2 == null) {
            if (!this.field204) {
                super.field5243.method3936(false, super.field5243.field9766);
                super.field5243.method3932(1, (byte) 97);
                super.field5243.method3903(34168, 0, 768, -106);
                super.field5243.method3931(0, 8960, 770, 34168);
                this.field204 = true;
            }
        } else {
            if (this.field204) {
                super.field5243.method3903(5890, 0, 768, -127);
                super.field5243.method3931(0, 8960, 770, 5890);
                this.field204 = false;
            }
            super.field5243.method3936(false, arg2);
            super.field5243.method3932(arg0, (byte) 70);
        }
        if (arg1 >= -103) {
            this.field189 = false;
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (this.field205) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field205 = false;
        }
        ++field206;
        super.field5243.method3925((byte) -94, 1);
        super.field5243.method3936(false, (class400) null);
        if (arg0 != -1) {
            this.method177(33);
        }
        super.field5243.method3961(8448, 8448, arg0 + 16128);
        super.field5243.method3903(5890, 0, 768, -125);
        super.field5243.method3903(34166, 2, 770, arg0 ^ 109);
        super.field5243.method3931(0, 8960, 770, 5890);
        super.field5243.method3925((byte) 53, 0);
        if (this.field204) {
            super.field5243.method3903(5890, 0, 768, -110);
            super.field5243.method3931(0, 8960, 770, 5890);
            this.field204 = false;
        }
    }

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "(I)V")
    public final void method182(int arg0) {
        ++field203;
        if (arg0 <= -22) {
            if (this.field205) {
                int var2 = super.field5243.method568();
                int var3 = super.field5243.method610();
                float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
                float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5243.field9805, (float) super.field5243.field9800 / 255.0F);
                super.field5243.method3925((byte) 31, 1);
                super.field5243.method3953(super.field5243.field9847, -123);
                super.field5243.method3925((byte) 65, 0);
            }
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(III)V")
    public final void method183(int arg0, int arg1, int arg2) {
        ++field193;
        if (arg0 != 64) {
            this.field191 = null;
        }
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lpc;)V")
    public class11(class700 arg0) {
        super(arg0);
        if (super.field5243.field9833) {
            this.field190 = class784.method4343("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 28932, super.field5243);
            this.field195 = class784.method4343("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 28932, super.field5243);
            this.field196 = class784.method4343("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 28932, super.field5243);
            this.field192 = class784.method4343("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 28932, super.field5243);
            if (!(this.field192 != null & this.field195 != null & this.field190 != null & this.field196 != null)) {
                this.field202 = false;
            } else {
                this.field191 = new class182(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field191.method1221(false, -1, false);
                this.field202 = true;
            }
        } else {
            this.field202 = false;
        }
    }

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "(IZ)V")
    public final void method184(int arg0, boolean arg1) {
        if (arg0 != 64) {
            method179(-90, -99, -86, 79, 66, (byte) -116, 103, 102, -45);
        }
        ++field201;
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class212 extends class497 {

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "Z")
    private boolean field2803 = false;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "Z")
    private boolean field2798;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Ltd;")
    private class481 field2793;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "Ltd;")
    private class481 field2806;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "Ltd;")
    private class481 field2796;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "Ltd;")
    private class481 field2805;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "Ltca;")
    private class184 field2811;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
    private boolean field2802;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "Z")
    private boolean field2807;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILil;I)V", line = 3)
    public final void method158(int arg0, class7 arg1, int arg2) {
        if (arg0 != 9) {
            this.method164(80, false);
        }
        ++field2792;
        if (arg1 != null) {
            if (this.field2803) {
                super.field6867.method1641(5890, 768, 0, 34192);
                super.field6867.method1657((byte) 90, 770, 0, 5890);
                this.field2803 = false;
            }
            super.field6867.method1653((byte) 109, arg1);
            super.field6867.method1589(-4, arg2);
        } else if (!this.field2803) {
            super.field6867.method1653((byte) 83, super.field6867.field3637);
            super.field6867.method1589(-4, 1);
            super.field6867.method1641(34168, 768, 0, arg0 ^ 34201);
            super.field6867.method1657((byte) 90, 770, 0, 34168);
            this.field2803 = true;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)V", line = 42)
    public static final void method1405(int arg0) {
        ++field2801;
        if (arg0 >= -36) {
            method1408(106, (class246) null, 31, -40, -96, 48);
        }
        class16 var1 = class94.method753(15, 13175, 0L);
        var1.method118(585134072);
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method157(int arg0) {
        if (arg0 != -6808) {
            this.method164(-113, true);
        }
        ++field2804;
        return this.field2798;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 67)
    public final void method1406(byte arg0) {
        int var2 = 39 / ((52 - arg0) / 56);
        if (this.field2807) {
            int var3 = super.field6867.method457();
            int var4 = super.field6867.method539();
            float var5 = (float) var3 + -((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - (float) (-var4 + var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var6, var5, 1.0F / (float) super.field6867.field3670, (float) super.field6867.field3656 / 255.0F);
            super.field6867.method1637(33984, 1);
            super.field6867.method1591(super.field6867.field3662, false);
            super.field6867.method1637(33984, 0);
        }
        ++field2799;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ldia;)V", line = 95)
    public class212(class246 arg0) {
        super(arg0);
        if (!super.field6867.field3671) {
            this.field2798 = false;
        } else {
            this.field2793 = class405.method2520(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", (byte) -76, super.field6867);
            this.field2806 = class405.method2520(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", (byte) -115, super.field6867);
            this.field2796 = class405.method2520(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", (byte) -26, super.field6867);
            this.field2805 = class405.method2520(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", (byte) -69, super.field6867);
            if (this.field2806 != null & this.field2793 != null & this.field2796 != null & this.field2805 != null) {
                this.field2811 = new class184(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field2811.method1274(false, false, 10242);
                this.field2798 = true;
            } else {
                this.field2798 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V", line = 122)
    public final void method1407(int arg0) {
        ++field2809;
        class118 var2 = super.field6867.field3565;
        if (!this.field2802) {
            OpenGL.glBindProgramARB(34336, ~super.field6867.field3632 != Integer.MIN_VALUE ? this.field2796.field6662 : this.field2793.field6662);
        } else {
            OpenGL.glBindProgramARB(34336, super.field6867.field3632 == Integer.MAX_VALUE ? this.field2806.field6662 : this.field2805.field6662);
        }
        var2.method971(-27186, class648.field9001, -1.0F, 0.0F, 0.0F, (float) super.field6867.field3632);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class648.field9001[0], class648.field9001[1], class648.field9001[2], class648.field9001[3]);
        if (arg0 == 928) {
            OpenGL.glEnable(34336);
            this.field2807 = true;
            this.method1406((byte) -77);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)V", line = 149)
    public final void method161(int arg0) {
        ++field2800;
        if (this.field2807) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2807 = false;
        }
        super.field6867.method1637(arg0 ^ -33308, 1);
        super.field6867.method1653((byte) 100, (class7) null);
        if (arg0 != -1756) {
            this.method1406((byte) -63);
        }
        super.field6867.method1622(8448, 8448, (byte) 124);
        super.field6867.method1641(5890, 768, 0, 34192);
        super.field6867.method1641(34166, 770, 2, 34192);
        super.field6867.method1657((byte) 90, 770, 0, 5890);
        super.field6867.method1637(arg0 + 35740, 0);
        if (this.field2803) {
            super.field6867.method1641(5890, 768, 0, 34192);
            super.field6867.method1657((byte) 90, 770, 0, 5890);
            this.field2803 = false;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V", line = 187)
    public final void method162(int arg0, int arg1, int arg2) {
        if (arg0 <= 122) {
            this.method164(-48, true);
        }
        ++field2795;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILdia;IIII)Lme;", line = 201)
    public static final class207 method1408(int arg0, class246 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 34037) {
            return null;
        } else {
            ++field2794;
            if (!arg1.field3609 && (!class117.method957(-6602, arg5) || !class117.method957(-6602, arg0))) {
                return arg1.field3653 ? new class207(arg1, 34037, arg3, arg4, arg5, arg0, true) : new class207(arg1, arg3, arg4, arg5, arg0, class719.method4014(arg5, (byte) -100), class719.method4014(arg0, (byte) -100), true);
            } else {
                return new class207(arg1, 3553, arg3, arg4, arg5, arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(ZZ)V", line = 220)
    public final void method163(boolean arg0, boolean arg1) {
        ++field2808;
        this.field2802 = arg0;
        super.field6867.method1637(33984, 1);
        super.field6867.method1653((byte) 96, this.field2811);
        if (arg1) {
            this.method164(-38, false);
        }
        super.field6867.method1622(7681, 34165, (byte) -108);
        super.field6867.method1641(34166, 768, 0, 34192);
        super.field6867.method1641(5890, 770, 2, 34192);
        super.field6867.method1657((byte) 90, 770, 0, 34168);
        super.field6867.method1637(33984, 0);
        this.method1407(928);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZ)V", line = 239)
    public final void method164(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field2811 = null;
        }
        ++field2797;
    }
}

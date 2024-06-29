import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class580 extends class187 {

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Z")
    private boolean field8220 = false;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lwea;")
    private class168 field8202;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lwea;")
    private class168 field8213;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Lwea;")
    private class168 field8208;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Lwea;")
    private class168 field8205;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Z")
    private boolean field8214;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "Lkf;")
    private class268 field8215;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Lbba;")
    public static class125 field8216 = new class125(128);

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Ll;")
    public static class20 field8199;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Z")
    private boolean field8209;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "Z")
    private boolean field8210;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[[[Z")
    public static boolean[][][] field8201;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method168(boolean arg0, byte arg1) {
        this.field8210 = arg0;
        ++field8211;
        int var3 = -123 / ((36 - arg1) / 48);
        super.field2885.method1002(1, -5172);
        super.field2885.method939(this.field8215, 8448);
        super.field2885.method990(34165, 7681, -29641);
        super.field2885.method988(34166, 6, 0, 768);
        super.field2885.method988(5890, 6, 2, 770);
        super.field2885.method980(0, 34168, true, 770);
        super.field2885.method1002(0, -5172);
        this.method3338(55);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([FFIIIIIII[FI)V", line = 23)
    public static final void method3336(float[] arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float[] arg9, int arg10) {
        int var11 = arg6 - arg8;
        ++field8203;
        int var12 = arg7 - arg2;
        int var13 = arg3 - arg4;
        float var14 = arg0[2] * (float) var12 + arg0[0] * (float) var13 + arg0[1] * (float) var11;
        float var15 = arg0[5] * (float) var12 + arg0[3] * (float) var13 + arg0[4] * (float) var11;
        float var16 = arg0[8] * (float) var12 + arg0[6] * (float) var13 + arg0[7] * (float) var11;
        if (arg10 != -24830) {
            method3340(-26);
        }
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
        float var19 = 0.5F + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg1;
        if (arg5 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg5 != 2) {
            if (~arg5 == -4) {
                float var21 = var18;
                var18 = var19;
                var19 = -var21;
            }
        } else {
            var19 = -var19;
            var18 = -var18;
        }
        arg9[1] = var19;
        arg9[0] = var18;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I", line = 80)
    public static final int method3337(int arg0, int arg1, int arg2, int arg3) {
        ++field8218;
        int var4 = (16711680 & (65280 & arg0) * arg2 | (16711935 & arg0) * arg2 & arg3) >>> 8;
        int var5 = 255 - arg2;
        return ((16711680 & (65280 & arg1) * var5 | (arg1 & 16711935) * var5 & -16711936) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBLqk;)V", line = 95)
    public final void method167(int arg0, byte arg1, class18 arg2) {
        if (arg1 == -126) {
            ++field8212;
            if (arg2 != null) {
                if (this.field8220) {
                    super.field2885.method988(5890, 6, 0, 768);
                    super.field2885.method980(0, 5890, true, 770);
                    this.field8220 = false;
                }
                super.field2885.method939(arg2, 8448);
                super.field2885.method999(true, arg0);
            } else if (!this.field8220) {
                super.field2885.method939(super.field2885.field1973, 8448);
                super.field2885.method999(true, 1);
                super.field2885.method988(34168, arg1 ^ -124, 0, 768);
                super.field2885.method980(0, 34168, true, 770);
                this.field8220 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 131)
    public final void method169(boolean arg0) {
        if (this.field8209) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8209 = false;
        }
        ++field8204;
        super.field2885.method1002(1, -5172);
        super.field2885.method939((class18) null, 8448);
        super.field2885.method990(8448, 8448, -29641);
        super.field2885.method988(5890, 6, 0, 768);
        super.field2885.method988(34166, 6, 2, 770);
        if (!arg0) {
            field8201 = null;
        }
        super.field2885.method980(0, 5890, arg0, 770);
        super.field2885.method1002(0, -5172);
        if (this.field8220) {
            super.field2885.method988(5890, 6, 0, 768);
            super.field2885.method980(0, 5890, true, 770);
            this.field8220 = false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Z", line = 164)
    public final boolean method171(int arg0) {
        if (arg0 != 20220) {
            this.field8202 = null;
        }
        ++field8206;
        return this.field8214;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 175)
    public final void method3338(int arg0) {
        ++field8207;
        class711 var2 = super.field2885.field1969;
        if (this.field8210) {
            OpenGL.glBindProgramARB(34336, ~super.field2885.field2081 == Integer.MIN_VALUE ? this.field8213.field2706 : this.field8205.field2706);
        } else {
            OpenGL.glBindProgramARB(34336, super.field2885.field2081 != Integer.MAX_VALUE ? this.field8208.field2706 : this.field8202.field2706);
        }
        var2.method3964(class302.field4151, 0.0F, -1.0F, 0.0F, (float) super.field2885.field2081, 2);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class302.field4151[0], class302.field4151[1], class302.field4151[2], class302.field4151[3]);
        OpenGL.glEnable(34336);
        this.field8209 = true;
        this.method3339(true);
        if (arg0 < 25) {
            this.field8208 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lhk;)V", line = 208)
    public class580(class111 arg0) {
        super(arg0);
        if (super.field2885.field2062) {
            this.field8202 = class127.method1089(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 3, super.field2885);
            this.field8213 = class127.method1089(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 3, super.field2885);
            this.field8208 = class127.method1089(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 3, super.field2885);
            this.field8205 = class127.method1089(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 3, super.field2885);
            if (!(this.field8202 != null & this.field8213 != null & this.field8208 != null & this.field8205 != null)) {
                this.field8214 = false;
            } else {
                this.field8215 = new class268(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field8215.method1742(102, false, false);
                this.field8214 = true;
            }
        } else {
            this.field8214 = false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V", line = 234)
    public final void method172(int arg0, boolean arg1) {
        if (arg0 < 56) {
            this.field8205 = null;
        }
        ++field8219;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V", line = 244)
    public final void method3339(boolean arg0) {
        ++field8200;
        if (this.field8209) {
            int var2 = super.field2885.method563();
            int var3 = super.field2885.method552();
            float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2885.field2019, (float) super.field2885.field2078 / 255.0F);
            super.field2885.method1002(1, -5172);
            super.field2885.method963(255, super.field2885.field2054);
            super.field2885.method1002(0, -5172);
        }
        if (!arg0) {
            this.method169(false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 271)
    public static void method3340(int arg0) {
        if (arg0 != -8050) {
            field8216 = null;
        }
        field8199 = null;
        field8201 = null;
        field8216 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)V", line = 291)
    public final void method170(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method172(24, true);
        }
        ++field8217;
    }
}

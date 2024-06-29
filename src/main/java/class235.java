import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class235 extends class702 {

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "Z")
    private boolean field3136;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "Lqb;")
    private class204 field3138;

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "Lqb;")
    private class204 field3142;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "Lqb;")
    private class204 field3134;

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "Lqb;")
    private class204 field3140;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Lsaa;")
    private class298 field3131;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!sda", name = "w", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!sda", name = "x", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!sda", name = "y", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "Z")
    private boolean field3133;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "Z")
    private boolean field3137;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)Z")
    public static final boolean method1428(int arg0, byte arg1) {
        if (arg1 > -118) {
            return false;
        } else {
            ++field3139;
            return ~arg0 == -5 || arg0 == 8 || ~arg0 == -12;
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lkga;)V")
    public class235(class506 arg0) {
        super(arg0);
        if (!super.field9912.field7358) {
            this.field3136 = false;
        } else {
            this.field3138 = class567.method3325(34336, -8962, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field9912);
            this.field3142 = class567.method3325(34336, -8962, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field9912);
            this.field3134 = class567.method3325(34336, -8962, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field9912);
            this.field3140 = class567.method3325(34336, -8962, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field9912);
            if (this.field3140 != null & this.field3134 != null & this.field3142 != null & this.field3138 != null) {
                this.field3131 = new class298(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field3131.method1767(false, false, 10242);
                this.field3136 = true;
            } else {
                this.field3136 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(Z)Z")
    public final boolean method998(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field3135;
            return this.field3136;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
    public final void method1001(int arg0, int arg1, int arg2) {
        ++field3141;
        int var4 = -61 % ((arg1 - 55) / 36);
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)V")
    public final void method1429(byte arg0) {
        int var2 = -109 / ((-59 - arg0) / 50);
        ++field3146;
        class510 var3 = super.field9912.field7300;
        if (!this.field3133) {
            OpenGL.glBindProgramARB(34336, ~super.field9912.field7403 != Integer.MIN_VALUE ? this.field3134.field2452 : this.field3138.field2452);
        } else {
            OpenGL.glBindProgramARB(34336, super.field9912.field7403 == Integer.MAX_VALUE ? this.field3142.field2452 : this.field3140.field2452);
        }
        var3.method3021(-1.0F, 0.0F, false, class137.field1733, (float) super.field9912.field7403, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class137.field1733[0], class137.field1733[1], class137.field1733[2], class137.field1733[3]);
        OpenGL.glEnable(34336);
        this.field3137 = true;
        this.method1430((byte) 121);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V")
    public final void method1002(boolean arg0) {
        if (this.field3137) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3137 = false;
        }
        ++field3143;
        super.field9912.method2975(1, 110);
        super.field9912.method2932(arg0, (class197) null);
        super.field9912.method2948(8448, 8448, (byte) -124);
        super.field9912.method2968(768, 0, (byte) -78, 5890);
        super.field9912.method2968(770, 2, (byte) -86, 34166);
        super.field9912.method2938(-124, 5890, 770, 0);
        super.field9912.method2975(0, 78);
        super.field9912.method2968(768, 0, (byte) 120, 5890);
        super.field9912.method2938(-124, 5890, 770, 0);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZZ)V")
    public final void method1000(boolean arg0, boolean arg1) {
        ++field3145;
        if (!arg0) {
            this.method1430((byte) -5);
        }
    }

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(B)V")
    public final void method1430(byte arg0) {
        if (this.field3137) {
            int var2 = super.field9912.method287();
            int var3 = super.field9912.method260();
            float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9912.field7329, (float) super.field9912.field7391 / 255.0F);
            super.field9912.method2975(1, 86);
            super.field9912.method2997(super.field9912.field7315, -103);
            super.field9912.method2975(0, 101);
        }
        int var6 = 97 / ((arg0 - 57) / 52);
        ++field3132;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZI)V")
    public final void method1005(boolean arg0, int arg1) {
        ++field3144;
        this.field3133 = arg0;
        super.field9912.method2975(1, 98);
        super.field9912.method2932(true, this.field3131);
        super.field9912.method2948(34165, 7681, (byte) 103);
        if (arg1 > -102) {
            this.method1001(91, -1, -122);
        }
        super.field9912.method2968(768, 0, (byte) -80, 34166);
        super.field9912.method2968(770, 2, (byte) 78, 5890);
        super.field9912.method2938(-127, 34168, 770, 0);
        super.field9912.method2975(0, 90);
        this.method1429((byte) -110);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljf;II)V")
    public final void method1004(class197 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            super.field9912.method2932(true, super.field9912.field7323);
            super.field9912.method2985(1, -26973);
            super.field9912.method2968(768, 0, (byte) 96, 34168);
            super.field9912.method2938(-125, 34168, 770, 0);
        } else {
            super.field9912.method2932(true, arg0);
            super.field9912.method2985(arg1, arg2 ^ -26983);
        }
        if (arg2 != 58) {
            method1428(-1, (byte) 109);
        }
        ++field3130;
    }
}

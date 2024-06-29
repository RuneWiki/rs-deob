import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class70 extends class249 {

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "Z")
    private boolean field1002 = false;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Z")
    private boolean field989;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Lqi;")
    private class569 field996;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Lqi;")
    private class569 field994;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "Lqi;")
    private class569 field995;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lqi;")
    private class569 field981;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Law;")
    private class76 field990;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[I")
    public static int[] field987 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field988 = -1;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "Z")
    private boolean field1001;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
    private boolean field984;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[[[I")
    public static int[][][] field986;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lme;ZI)V")
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method609(43);
        }
        ++field997;
        if (arg0 != null) {
            if (this.field1002) {
                super.field3613.method1052(5890, 34176, 0, 768);
                super.field3613.method1086(5890, 0, 770, 42);
                this.field1002 = false;
            }
            super.field3613.method1088(arg0, -27749);
            super.field3613.method1066(arg2, 260);
        } else if (!this.field1002) {
            super.field3613.method1088(super.field3613.field2219, -27749);
            super.field3613.method1066(1, 260);
            super.field3613.method1052(34168, 34176, 0, 768);
            super.field3613.method1086(34168, 0, 770, 114);
            this.field1002 = true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public final void method604(int arg0) {
        ++field982;
        class607 var2 = super.field3613.field2201;
        if (this.field1001) {
            OpenGL.glBindProgramARB(34336, ~super.field3613.field2294 != Integer.MIN_VALUE ? this.field981.field8063 : this.field994.field8063);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field3613.field2294 != Integer.MIN_VALUE ? this.field995.field8063 : this.field996.field8063);
        }
        var2.method3518((float) super.field3613.field2294, 16383, -1.0F, 0.0F, class29.field283, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class29.field283[0], class29.field283[1], class29.field283[2], class29.field283[3]);
        if (arg0 == -124) {
            OpenGL.glEnable(34336);
            this.field984 = true;
            this.method612(false);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        if (arg0 != 2) {
            this.field1001 = false;
        }
        ++field998;
        return this.field989;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lwh;)V")
    public class70(class148 arg0) {
        super(arg0);
        if (!super.field3613.field2300) {
            this.field989 = false;
        } else {
            this.field996 = class228.method1538("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 30, 34336, super.field3613);
            this.field994 = class228.method1538("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 120, 34336, super.field3613);
            this.field995 = class228.method1538("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -123, 34336, super.field3613);
            this.field981 = class228.method1538("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 40, 34336, super.field3613);
            if (this.field994 != null & this.field996 != null & this.field995 != null & this.field981 != null) {
                this.field990 = new class76(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field990.method636(false, 10497, false);
                this.field989 = true;
            } else {
                this.field989 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static final void method606(byte arg0) {
        if (~class9.field132 == -2 || class9.field132 == 3 || ~class9.field132 != ~class288.field4088 && (class9.field132 == 0 || ~class288.field4088 == -1)) {
            class441.field6552 = 0;
            class567.field8058 = 0;
            class497.field7067.method2289(1393);
        }
        ++field993;
        class288.field4088 = class9.field132;
        int var1 = -15 / ((arg0 - 14) / 41);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
    public final void method607(int arg0, int arg1, int arg2) {
        ++field983;
        if (arg1 != -13582) {
            this.method612(false);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZ)V")
    public final void method608(boolean arg0, boolean arg1) {
        ++field991;
        if (!arg0) {
            this.method604(56);
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public static void method609(int arg0) {
        field986 = null;
        if (arg0 != 32) {
            method606((byte) 73);
        }
        field987 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)V")
    public final void method610(int arg0, boolean arg1) {
        ++field992;
        this.field1001 = arg1;
        super.field3613.method1024(arg0, (byte) -11);
        super.field3613.method1088(this.field990, -27749);
        super.field3613.method1043((byte) 127, 7681, 34165);
        super.field3613.method1052(34166, 34176, 0, 768);
        super.field3613.method1052(5890, arg0 ^ 34177, 2, 770);
        super.field3613.method1086(34168, 0, 770, 50);
        super.field3613.method1024(0, (byte) -11);
        this.method604(arg0 + -125);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public final void method611(int arg0) {
        if (this.field984) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field984 = false;
        }
        ++field985;
        super.field3613.method1024(1, (byte) -11);
        super.field3613.method1088((class195) null, -27749);
        super.field3613.method1043((byte) 109, 8448, 8448);
        super.field3613.method1052(5890, 34176, 0, 768);
        super.field3613.method1052(34166, 34176, arg0, 770);
        super.field3613.method1086(5890, 0, 770, 48);
        super.field3613.method1024(0, (byte) -11);
        if (this.field1002) {
            super.field3613.method1052(5890, 34176, 0, 768);
            super.field3613.method1086(5890, 0, 770, 76);
            this.field1002 = false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public final void method612(boolean arg0) {
        if (this.field984) {
            int var2 = super.field3613.method514();
            int var3 = super.field3613.method457();
            float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3613.field2268, (float) super.field3613.field2240 / 255.0F);
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1054(3, super.field3613.field2226);
            super.field3613.method1024(0, (byte) -11);
        }
        ++field999;
        if (arg0) {
            this.field989 = true;
        }
    }
}

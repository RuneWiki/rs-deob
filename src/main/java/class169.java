import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class169 extends class345 {

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Z")
    private boolean field2346 = false;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Z")
    private boolean field2343;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Ljq;")
    private class514 field2348;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Ljq;")
    private class514 field2351;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Ljq;")
    private class514 field2350;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Ljq;")
    private class514 field2349;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Lbq;")
    private class293 field2355;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Lhg;")
    public static class693 field2358 = new class693(38, 11);

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "J")
    public static long field2347;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Lbia;")
    public static class501 field2359;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Z")
    private boolean field2340;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Z")
    private boolean field2342;

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lbi;)V")
    public class169(class483 arg0) {
        super(arg0);
        if (!super.field4357.field6827) {
            this.field2343 = false;
        } else {
            this.field2348 = class22.method155("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 6672, 34336, super.field4357);
            this.field2351 = class22.method155("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 6672, 34336, super.field4357);
            this.field2350 = class22.method155("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 6672, 34336, super.field4357);
            this.field2349 = class22.method155("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 6672, 34336, super.field4357);
            if (!(this.field2349 != null & this.field2350 != null & this.field2348 != null & this.field2351 != null)) {
                this.field2343 = false;
            } else {
                this.field2355 = new class293(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field2355.method1756(false, false, 75);
                this.field2343 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V")
    public final void method40(boolean arg0, int arg1) {
        if (arg1 != 50560) {
            method1180((byte) 61);
        }
        ++field2344;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public final void method1177(boolean arg0) {
        ++field2353;
        class65 var2 = super.field4357.field6810;
        if (!this.field2340) {
            OpenGL.glBindProgramARB(34336, super.field4357.field6909 != Integer.MAX_VALUE ? this.field2350.field7210 : this.field2348.field7210);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field4357.field6909 != Integer.MIN_VALUE ? this.field2349.field7210 : this.field2351.field7210);
        }
        var2.method607(-1.0F, (float) super.field4357.field6909, class72.field1010, true, 0.0F, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class72.field1010[0], class72.field1010[1], class72.field1010[2], class72.field1010[3]);
        OpenGL.glEnable(34336);
        this.field2342 = arg0;
        this.method1179(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZII)V")
    public final void method37(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1181((byte) -18);
        }
        ++field2341;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)V")
    public static final void method1178(int arg0, int arg1, int arg2) {
        ++field2345;
        class37 var3 = class636.method3571(13, arg0, -40);
        if (arg1 < 80) {
            method1181((byte) -128);
        }
        var3.method232(-3);
        var3.field579 = arg2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
    public final boolean method38(int arg0) {
        if (arg0 != 50560) {
            this.field2355 = null;
        }
        ++field2352;
        return this.field2343;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
    public final void method1179(boolean arg0) {
        if (this.field2342) {
            int var2 = super.field4357.method546();
            int var3 = super.field4357.method451();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field4357.field6846, (float) super.field4357.field6812 / 255.0F);
            super.field4357.method2847(1, !arg0);
            super.field4357.method2822(16711680, super.field4357.field6917);
            super.field4357.method2847(0, !arg0);
        }
        ++field2338;
        if (!arg0) {
            this.field2340 = false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILcj;)V")
    public final void method36(int arg0, int arg1, class695 arg2) {
        ++field2356;
        if (arg0 != 50560) {
            method1180((byte) -68);
        }
        if (arg2 == null) {
            if (!this.field2346) {
                super.field4357.method2850(81, super.field4357.field6873);
                super.field4357.method2800(1, arg0 + -50433);
                super.field4357.method2775(34168, (byte) -88, 768, 0);
                super.field4357.method2788(770, 34168, false, 0);
                this.field2346 = true;
                return;
            }
        } else {
            if (this.field2346) {
                super.field4357.method2775(5890, (byte) -88, 768, 0);
                super.field4357.method2788(770, 5890, false, 0);
                this.field2346 = false;
            }
            super.field4357.method2850(-62, arg2);
            super.field4357.method2800(arg1, -14);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field2354;
        if (this.field2342) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2342 = false;
        }
        super.field4357.method2847(1, false);
        super.field4357.method2850(118, (class695) null);
        super.field4357.method2799(-27874, 8448, 8448);
        int var2 = 40 % ((60 - arg0) / 60);
        super.field4357.method2775(5890, (byte) -88, 768, 0);
        super.field4357.method2775(34166, (byte) -88, 770, 2);
        super.field4357.method2788(770, 5890, false, 0);
        super.field4357.method2847(0, false);
        if (this.field2346) {
            super.field4357.method2775(5890, (byte) -88, 768, 0);
            super.field4357.method2788(770, 5890, false, 0);
            this.field2346 = false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static final void method1180(byte arg0) {
        ++field2339;
        if (arg0 != -15) {
            method1178(-83, -81, -1);
        }
        class37 var1 = class636.method3571(15, 0, -111);
        var1.method230(-26);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZB)V")
    public final void method34(boolean arg0, byte arg1) {
        this.field2340 = arg0;
        ++field2357;
        super.field4357.method2847(1, false);
        super.field4357.method2850(99, this.field2355);
        super.field4357.method2799(-27874, 34165, 7681);
        super.field4357.method2775(34166, (byte) -88, 768, 0);
        super.field4357.method2775(5890, (byte) -88, 770, 2);
        if (arg1 != -82) {
            this.field2350 = null;
        }
        super.field4357.method2788(770, 34168, false, 0);
        super.field4357.method2847(0, false);
        this.method1177(true);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public static void method1181(byte arg0) {
        if (arg0 != 55) {
            field2358 = null;
        }
        field2358 = null;
        field2359 = null;
    }
}

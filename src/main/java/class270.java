import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class270 extends class83 {

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Z")
    private boolean field3365;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Lvk;")
    private class454 field3364;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "Lvk;")
    private class454 field3366;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Lvk;")
    private class454 field3362;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lvk;")
    private class454 field3354;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lg;")
    private class555 field3353;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Z")
    private boolean field3356;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Z")
    private boolean field3359;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public final void method1586(boolean arg0) {
        ++field3358;
        class185 var2 = super.field855.field5856;
        if (!this.field3359) {
            OpenGL.glBindProgramARB(34336, super.field855.field5926 != Integer.MAX_VALUE ? this.field3362.field6490 : this.field3364.field6490);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field855.field5926 == Integer.MIN_VALUE ? this.field3366.field6490 : this.field3354.field6490);
        }
        var2.method1129((float) super.field855.field5926, 0.0F, 0.0F, 90, class489.field7108, -1.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class489.field7108[0], class489.field7108[1], class489.field7108[2], class489.field7108[3]);
        OpenGL.glEnable(34336);
        this.field3356 = true;
        if (arg0) {
            this.field3356 = true;
        }
        this.method1587(true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Z")
    public final boolean method440(byte arg0) {
        ++field3357;
        if (arg0 >= -100) {
            this.field3354 = null;
        }
        return this.field3365;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZ)V")
    public final void method433(byte arg0, boolean arg1) {
        this.field3359 = arg1;
        ++field3360;
        super.field855.method2431((byte) -68, 1);
        super.field855.method2396((byte) 36, this.field3353);
        super.field855.method2412((byte) -49, 34165, 7681);
        super.field855.method2428(768, 34166, 0, -4);
        super.field855.method2428(770, 5890, 2, -4);
        super.field855.method2371(770, 0, -75, 34168);
        super.field855.method2431((byte) -30, 0);
        if (arg0 != -48) {
            this.method438(23);
        }
        this.method1586(false);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
    public final void method1587(boolean arg0) {
        ++field3367;
        if (this.field3356) {
            int var2 = super.field855.method971();
            int var3 = super.field855.method966();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field855.field5872, (float) super.field855.field5887 / 255.0F);
            super.field855.method2431((byte) -30, 1);
            super.field855.method2379(true, super.field855.field5907);
            super.field855.method2431((byte) -96, 0);
        }
        if (!arg0) {
            this.method433((byte) -110, false);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (this.field3356) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3356 = false;
        }
        ++field3363;
        super.field855.method2431((byte) -53, 1);
        super.field855.method2396((byte) 36, (class325) null);
        super.field855.method2412((byte) -49, 8448, 8448);
        super.field855.method2428(768, 5890, 0, arg0 ^ -18610);
        if (arg0 == 18610) {
            super.field855.method2428(770, 34166, 2, -4);
            super.field855.method2371(770, 0, -102, 5890);
            super.field855.method2431((byte) -111, 0);
            super.field855.method2428(768, 5890, 0, arg0 + -18614);
            super.field855.method2371(770, 0, -52, 5890);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILav;)V")
    public final void method441(int arg0, int arg1, class325 arg2) {
        if (arg2 == null) {
            super.field855.method2396((byte) 36, super.field855.field5960);
            super.field855.method2421(1, arg0 ^ -29091);
            super.field855.method2428(768, 34168, 0, -4);
            super.field855.method2371(770, 0, arg0 ^ 29127, 34168);
        } else {
            super.field855.method2396((byte) 36, arg2);
            super.field855.method2421(arg1, 1);
        }
        ++field3352;
        if (arg0 != -29092) {
            this.method439(true, 98);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        int var4 = -58 / ((arg2 - -60) / 33);
        ++field3355;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILgk;Lr;II)V")
    public static final void method1588(int arg0, class616 arg1, class564 arg2, int arg3, int arg4) {
        ++field3361;
        class258.field3240.method3438(16);
        if (!class156.field1747) {
            if (arg0 <= -106) {
                for (class679 var5 = (class679) arg1.method3434((byte) 2); var5 != null; var5 = (class679) arg1.method3430(true)) {
                    class655 var6 = class482.field6927.method705(var5.field9562, -124);
                    if (class302.method1753((byte) -109, var6)) {
                        boolean var7 = class22.method103(arg3, arg4, var5, var6, arg2, -2);
                        if (var7) {
                            class282.method1653(var6, 107, arg2, var5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
    public final void method439(boolean arg0, int arg1) {
        if (arg1 > -123) {
            this.method441(-84, 97, (class325) null);
        }
        ++field3351;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lvj;)V")
    public class270(class422 arg0) {
        super(arg0);
        if (!super.field855.field5938) {
            this.field3365 = false;
        } else {
            this.field3364 = class563.method3194((byte) 126, 34336, super.field855, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3366 = class563.method3194((byte) -2, 34336, super.field855, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3362 = class563.method3194((byte) -115, 34336, super.field855, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3354 = class563.method3194((byte) -47, 34336, super.field855, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (this.field3354 != null & this.field3362 != null & this.field3364 != null & this.field3366 != null) {
                this.field3353 = new class555(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field3353.method3148(10243, false, false);
                this.field3365 = true;
            } else {
                this.field3365 = false;
            }
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class268 extends class27 {

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Lnj;")
    private class222 field3623;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "Lnj;")
    private class222 field3637;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Lnj;")
    private class222 field3629;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lnj;")
    private class222 field3621;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "Lcw;")
    private class164 field3627;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "Z")
    private boolean field3636;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Z")
    private boolean field3622;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "Z")
    private boolean field3635;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "[Lnw;")
    public static class543[] field3626;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjc;)V")
    public static final void method1629(int arg0, class404 arg1) {
        if (arg1.field5672 != null) {
            arg1.field5672.field5575 = 0;
        }
        int var2 = 89 / ((-40 - arg0) / 35);
        arg1.field5675 = false;
        ++field3618;
        for (class404 var3 = arg1.method1457(); var3 != null; var3 = arg1.method1466()) {
            method1629(75, var3);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
    public final boolean method260(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field3628;
            return this.field3636;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
    public final void method263(boolean arg0, int arg1) {
        if (arg1 == 8) {
            ++field3630;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BZ)V")
    public final void method258(byte arg0, boolean arg1) {
        this.field3622 = arg1;
        ++field3633;
        super.field337.method3220(0, 1);
        super.field337.method3206(this.field3627, (byte) 26);
        super.field337.method3210(34165, -83, 7681);
        super.field337.method3164(34166, 0, (byte) 90, 768);
        if (arg0 > -80) {
            this.field3621 = null;
        }
        super.field337.method3164(5890, 2, (byte) 101, 770);
        super.field337.method3198(0, 34168, true, 770);
        super.field337.method3220(0, 0);
        this.method1631(0);
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Llj;)V")
    public class268(class565 arg0) {
        super(arg0);
        if (super.field337.field7951) {
            this.field3623 = class393.method2296(114, super.field337, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336);
            this.field3637 = class393.method2296(84, super.field337, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336);
            this.field3629 = class393.method2296(77, super.field337, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336);
            this.field3621 = class393.method2296(-57, super.field337, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336);
            if (this.field3629 != null & this.field3637 != null & this.field3623 != null & this.field3621 != null) {
                this.field3627 = new class164(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field3627.method1151(false, 127, false);
                this.field3636 = true;
            } else {
                this.field3636 = false;
            }
        } else {
            this.field3636 = false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public final void method256(byte arg0) {
        if (this.field3635) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3635 = false;
        }
        ++field3619;
        super.field337.method3220(arg0 ^ 50, 1);
        super.field337.method3206((class136) null, (byte) 26);
        super.field337.method3210(8448, -86, 8448);
        super.field337.method3164(5890, 0, (byte) 111, 768);
        super.field337.method3164(34166, 2, (byte) 83, 770);
        if (arg0 == 50) {
            super.field337.method3198(0, 5890, true, 770);
            super.field337.method3220(arg0 + -50, 0);
            super.field337.method3164(5890, 0, (byte) 114, 768);
            super.field337.method3198(0, 5890, true, 770);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
    public static void method1630(byte arg0) {
        if (arg0 >= -109) {
            method1634((class605) null, (byte) 30);
        }
        field3626 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public final void method1631(int arg0) {
        ++field3624;
        class561 var2 = super.field337.field7868;
        if (!this.field3622) {
            OpenGL.glBindProgramARB(34336, ~super.field337.field7900 != Integer.MIN_VALUE ? this.field3629.field3101 : this.field3623.field3101);
        } else {
            OpenGL.glBindProgramARB(34336, super.field337.field7900 != Integer.MAX_VALUE ? this.field3621.field3101 : this.field3637.field3101);
        }
        var2.method3137((float) arg0, 73, class216.field3046, (float) super.field337.field7900, -1.0F, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class216.field3046[0], class216.field3046[1], class216.field3046[2], class216.field3046[3]);
        OpenGL.glEnable(34336);
        this.field3635 = true;
        this.method1633(-123);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILvf;)V")
    public final void method257(int arg0, int arg1, class136 arg2) {
        if (arg2 != null) {
            super.field337.method3206(arg2, (byte) 26);
            super.field337.method3205(5123, arg0);
        } else {
            super.field337.method3206(super.field337.field7893, (byte) 26);
            super.field337.method3205(5123, 1);
            super.field337.method3164(34168, 0, (byte) 116, 768);
            super.field337.method3198(0, 34168, true, 770);
        }
        ++field3625;
        if (arg1 != -10479) {
            this.field3635 = true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
    public final void method261(int arg0, int arg1, int arg2) {
        if (arg2 == 4) {
            ++field3631;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
    public static final void method1632(int arg0, Object[] arg1, int[] arg2) {
        int var3 = 24 % ((arg0 - 59) / 56);
        class206.method1335(0, arg1, 0, arg2, arg2.length + -1);
        ++field3632;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public final void method1633(int arg0) {
        ++field3620;
        if (arg0 > -119) {
            this.field3635 = true;
        }
        if (this.field3635) {
            int var2 = super.field337.method142();
            int var3 = super.field337.method133();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field337.field7946, (float) super.field337.field7939 / 255.0F);
            super.field337.method3220(0, 1);
            super.field337.method3162(false, super.field337.field7962);
            super.field337.method3220(0, 0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lrs;B)V")
    public static final void method1634(class605 arg0, byte arg1) {
        if (arg1 == -121) {
            class84.field1246 = arg0;
            ++field3634;
        }
    }
}

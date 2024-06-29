import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class361 extends class283 {

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Z")
    private boolean field4784 = false;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Lne;")
    private class321 field4780;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "Lne;")
    private class321 field4791;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "Lne;")
    private class321 field4785;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "Lne;")
    private class321 field4772;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
    private boolean field4773;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Laaa;")
    private class616 field4787;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field4776 = 0;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "[I")
    public static int[] field4774 = new int[8];

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Lvea;")
    public static class276 field4781 = new class276(0, 2, 2, 1);

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "[Lgv;")
    public static class83[] field4793 = new class83[2048];

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "Z")
    private boolean field4777;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Z")
    private boolean field4786;

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lac;)V")
    public class361(class541 arg0) {
        super(arg0);
        if (super.field3749.field7642) {
            this.field4780 = class320.method1914(0, super.field3749, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field4791 = class320.method1914(0, super.field3749, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field4785 = class320.method1914(0, super.field3749, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field4772 = class320.method1914(0, super.field3749, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (!(this.field4772 != null & this.field4785 != null & this.field4791 != null & this.field4780 != null)) {
                this.field4773 = false;
            } else {
                this.field4787 = new class616(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field4787.method3471(false, 10242, false);
                this.field4773 = true;
            }
        } else {
            this.field4773 = false;
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Z")
    public final boolean method138(int arg0) {
        if (arg0 != 31565) {
            this.field4777 = true;
        }
        ++field4782;
        return this.field4773;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        ++field4783;
        if (arg2 > -2) {
            this.method144((byte) -6);
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
    public static void method2070(int arg0) {
        field4774 = null;
        field4793 = null;
        if (arg0 == Integer.MAX_VALUE) {
            field4781 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V")
    public final void method2071(int arg0) {
        if (arg0 != -16661) {
            field4776 = 117;
        }
        if (this.field4786) {
            int var2 = super.field3749.method356();
            int var3 = super.field3749.method400();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3749.field7665, (float) super.field3749.field7664 / 255.0F);
            super.field3749.method2988(1, 847872872);
            super.field3749.method3025(super.field3749.field7634, -104);
            super.field3749.method2988(0, arg0 ^ -847889021);
        }
        ++field4788;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
    public final void method2072(byte arg0) {
        ++field4775;
        class253 var2 = super.field3749.field7564;
        if (!this.field4777) {
            OpenGL.glBindProgramARB(34336, super.field3749.field7573 == Integer.MAX_VALUE ? this.field4780.field4312 : this.field4785.field4312);
        } else {
            OpenGL.glBindProgramARB(34336, super.field3749.field7573 != Integer.MAX_VALUE ? this.field4772.field4312 : this.field4791.field4312);
        }
        var2.method1503(-29834, 0.0F, (float) super.field3749.field7573, 0.0F, -1.0F, class202.field2399);
        if (arg0 == 34) {
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class202.field2399[0], class202.field2399[1], class202.field2399[2], class202.field2399[3]);
            OpenGL.glEnable(34336);
            this.field4786 = true;
            this.method2071(-16661);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V")
    public final void method142(boolean arg0, int arg1) {
        ++field4789;
        if (arg1 != 255) {
            this.method140((class221) null, false, -47);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
    public final void method141(boolean arg0, boolean arg1) {
        ++field4792;
        this.field4777 = arg1;
        super.field3749.method2988(1, 847872872);
        super.field3749.method3006(1, this.field4787);
        if (arg0) {
            this.field4773 = false;
        }
        super.field3749.method3042(7681, 8960, 34165);
        super.field3749.method2983(0, 768, 108, 34166);
        super.field3749.method2983(2, 770, 113, 5890);
        super.field3749.method3029(770, 0, 34200, 34168);
        super.field3749.method2988(0, 847872872);
        this.method2072((byte) 34);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    public final void method144(byte arg0) {
        ++field4778;
        if (this.field4786) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4786 = false;
        }
        super.field3749.method2988(1, 847872872);
        super.field3749.method3006(1, (class221) null);
        super.field3749.method3042(8448, 8960, 8448);
        super.field3749.method2983(0, 768, -107, 5890);
        super.field3749.method2983(2, 770, 104, 34166);
        super.field3749.method3029(770, 0, 34200, 5890);
        if (arg0 <= 25) {
            field4776 = -23;
        }
        super.field3749.method2988(0, 847872872);
        if (this.field4784) {
            super.field3749.method2983(0, 768, 117, 5890);
            super.field3749.method3029(770, 0, 34200, 5890);
            this.field4784 = false;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZLjava/lang/String;IZ)V")
    public static final void method2073(boolean arg0, String arg1, int arg2, boolean arg3) {
        class482.method2712(57);
        ++field4779;
        class585.method3263(-24580);
        class638.method3592(28837);
        class88.method637((byte) 69, arg1, arg2, arg3);
        class375.method2202((byte) -34);
        class394.method2294((byte) -85, class21.field142);
        class352.method2044(class21.field142, (byte) -48);
        class274.method1640(class21.field142, (byte) -124, class97.field1282);
        class569.method3200(arg0);
        class461.method2565(class205.field2434, 0);
        class340.method2004(2);
        class216.method1201((byte) 115);
        if (~class713.field9949 == -4) {
            class237.method1429(4, false);
        } else if (~class713.field9949 != -8) {
            if (class713.field9949 == 10) {
                class237.method1429(11, false);
            } else {
                if (class713.field9949 == 1 || ~class713.field9949 == -3) {
                    class736.method4121((byte) -121);
                }
            }
        } else {
            class237.method1429(8, false);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lcu;ZI)V")
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        ++field4771;
        if (!arg1) {
            if (arg0 != null) {
                if (this.field4784) {
                    super.field3749.method2983(0, 768, 74, 5890);
                    super.field3749.method3029(770, 0, 34200, 5890);
                    this.field4784 = false;
                }
                super.field3749.method3006(1, arg0);
                super.field3749.method3039(260, arg2);
            } else if (!this.field4784) {
                super.field3749.method3006(1, super.field3749.field7569);
                super.field3749.method3039(260, 1);
                super.field3749.method2983(0, 768, -50, 34168);
                super.field3749.method3029(770, 0, 34200, 34168);
                this.field4784 = true;
            }
        }
    }
}

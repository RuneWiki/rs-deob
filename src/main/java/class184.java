import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class184 extends class509 {

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Z")
    private boolean field2823;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lup;")
    private class280 field2820;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lup;")
    private class280 field2826;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lup;")
    private class280 field2809;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Lup;")
    private class280 field2819;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[F")
    public static float[] field2822 = new float[4];

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
    public static int[] field2828 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lum;")
    public static class83 field2814;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Z")
    private boolean field2811;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Z")
    private boolean field2816;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ltt;)V", line = 3)
    public class184(class249 arg0) {
        super(arg0);
        if (!super.field7409.field4035) {
            this.field2823 = false;
        } else {
            this.field2820 = class484.method2930(34336, 126, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field7409);
            this.field2826 = class484.method2930(34336, 125, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field7409);
            this.field2809 = class484.method2930(34336, 34, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field7409);
            this.field2819 = class484.method2930(34336, -21, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field7409);
            this.field2823 = this.field2819 != null & this.field2809 != null & this.field2820 != null & this.field2826 != null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)I", line = 22)
    public static final int method1281(int arg0, int arg1) {
        return class101.field1543 != null ? class101.field1543[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z", line = 28)
    public final boolean method124(int arg0) {
        if (arg0 != -32170) {
            this.field2816 = false;
        }
        ++field2818;
        return this.field2823;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 41)
    public final void method1282(int arg0) {
        if (arg0 >= -105) {
            this.method128((byte) -82, true);
        }
        ++field2815;
        class250.field4081[3] = (float) super.field7409.field3964;
        OpenGL.glTexGenfv(8192, 9474, class250.field4081, 0);
        if (this.field2816) {
            OpenGL.glBindProgramARB(34336, super.field7409.field3964 != Integer.MAX_VALUE ? this.field2819.field4359 : this.field2826.field4359);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field7409.field3964 != Integer.MIN_VALUE ? this.field2809.field4359 : this.field2820.field4359);
        }
        OpenGL.glEnable(34336);
        this.field2811 = true;
        this.method1287((byte) -104);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I", line = 65)
    public static final int method1283(int arg0) {
        if (arg0 != -15689) {
            return -20;
        } else {
            ++field2807;
            return 6;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lfi;B)Lfi;", line = 79)
    public static final class38 method1284(class38 arg0, byte arg1) {
        ++field2810;
        if (~arg0.field600 != 0) {
            return class159.method1143(arg1 ^ 357225981, arg0.field600);
        } else {
            int var2 = arg0.field580 >>> 16;
            class1 var3 = new class1(class215.field3248);
            if (arg1 != -51) {
                method1286(-45);
            }
            for (class295 var4 = (class295) var3.method3(0); var4 != null; var4 = (class295) var3.method2((byte) -66)) {
                if (var4.field4546 == var2) {
                    return class159.method1143(-357225936, (int) var4.field1932);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)V", line = 111)
    public final void method128(byte arg0, boolean arg1) {
        ++field2812;
        if (arg0 <= 44) {
            this.field2826 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)I", line = 121)
    public static final int method1285(int arg0, byte arg1, int arg2) {
        ++field2827;
        int var3 = arg0 >> 31 & arg2 + -1;
        if (arg1 != 66) {
            method1283(-99);
        }
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V", line = 134)
    public final void method122(boolean arg0, int arg1) {
        if (arg1 != 64) {
            this.field2823 = false;
        }
        this.field2816 = arg0;
        ++field2813;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)[Lsc;", line = 148)
    public static final class270[] method1286(int arg0) {
        ++field2824;
        if (arg0 < 55) {
            method1281(30, -12);
        }
        return new class270[] { class87.field1429, class183.field2803, class130.field1929, class281.field4366, class23.field261, class487.field7123, class307.field4692, class76.field1291, class29.field309, class54.field830, class3.field39, class303.field4648, class307.field4693, client.field7548 };
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 159)
    public final void method1287(byte arg0) {
        if (this.field2811) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field7409.field4016 - 1280), (float) (super.field7409.field4016 + -768), 1.0F / (float) super.field7409.field4034, (float) super.field7409.field4008 / 255.0F);
        }
        ++field2808;
        if (arg0 > -80) {
            this.method121((byte) 125);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZ)V", line = 174)
    public final void method123(int arg0, int arg1, boolean arg2) {
        ++field2825;
        if (arg2) {
            method1286(109);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 186)
    public final void method121(byte arg0) {
        if (arg0 != 38) {
            this.method125((byte) 41, -111, (class169) null);
        }
        if (this.field2811) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2811 = false;
        }
        ++field2821;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILin;)V", line = 212)
    public final void method125(byte arg0, int arg1, class169 arg2) {
        if (arg0 < 9) {
            method1281(-92, 118);
        }
        ++field2817;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V", line = 223)
    public static void method1288(byte arg0) {
        if (arg0 <= 43) {
            field2814 = null;
        }
        field2822 = null;
        field2828 = null;
        field2814 = null;
    }
}

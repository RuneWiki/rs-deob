import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class554 extends class460 {

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "Lru;")
    private class232 field8109;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "Lru;")
    private class232 field8106;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "Lru;")
    private class232 field8096;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "Lru;")
    private class232 field8105;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "Z")
    private boolean field8112;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "Lil;")
    private class586 field8095;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "Luea;")
    public static class256 field8103;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "Lgw;")
    public static class73 field8108;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "Z")
    private boolean field8094;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "Z")
    private boolean field8099;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V", line = 6)
    public final void method3245(boolean arg0) {
        if (!arg0) {
            ++field8100;
            if (this.field8099) {
                int var2 = super.field6621.method746();
                int var3 = super.field6621.method820();
                float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
                float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field6621.field5583, (float) super.field6621.field5511 / 255.0F);
                super.field6621.method2308(1, -15115);
                super.field6621.method2297((byte) -30, super.field6621.field5555);
                super.field6621.method2308(0, -15115);
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V", line = 38)
    public final void method1174(byte arg0) {
        if (arg0 > -56) {
            this.field8109 = null;
        }
        if (this.field8099) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8099 = false;
        }
        ++field8098;
        super.field6621.method2308(1, -15115);
        super.field6621.method2295((byte) -110, (class337) null);
        super.field6621.method2328(8448, 57, 8448);
        super.field6621.method2262(5890, 0, 34176, 768);
        super.field6621.method2262(34166, 2, 34176, 770);
        super.field6621.method2258(-111, 5890, 770, 0);
        super.field6621.method2308(0, -15115);
        super.field6621.method2262(5890, 0, 34176, 768);
        super.field6621.method2258(-82, 5890, 770, 0);
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lkfa;)V", line = 67)
    public class554(class382 arg0) {
        super(arg0);
        if (super.field6621.field5508) {
            this.field8109 = class618.method3492("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", (byte) -68, super.field6621, 34336);
            this.field8106 = class618.method3492("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", (byte) -68, super.field6621, 34336);
            this.field8096 = class618.method3492("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", (byte) -68, super.field6621, 34336);
            this.field8105 = class618.method3492("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", (byte) -68, super.field6621, 34336);
            if (!(this.field8109 != null & this.field8106 != null & this.field8096 != null & this.field8105 != null)) {
                this.field8112 = false;
            } else {
                this.field8095 = new class586(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field8095.method3379((byte) 102, false, false);
                this.field8112 = true;
            }
        } else {
            this.field8112 = false;
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V", line = 97)
    public static void method3246(int arg0) {
        if (arg0 != 7681) {
            field8108 = null;
        }
        field8103 = null;
        field8108 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjo;I)V", line = 108)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        if (arg1 != null) {
            super.field6621.method2295((byte) -108, arg1);
            super.field6621.method2270(arg0, (byte) 110);
        } else {
            super.field6621.method2295((byte) -128, super.field6621.field5523);
            super.field6621.method2270(1, (byte) 110);
            super.field6621.method2262(34168, 0, 34176, 768);
            super.field6621.method2258(-109, 34168, 770, 0);
        }
        int var4 = -34 / ((arg2 - 65) / 53);
        ++field8097;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)V", line = 131)
    public final void method1170(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            this.field8106 = null;
        }
        ++field8111;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)Z", line = 144)
    public final boolean method1168(int arg0) {
        if (arg0 != 2048) {
            this.method3245(false);
        }
        ++field8104;
        return this.field8112;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BZ)V", line = 155)
    public final void method1177(byte arg0, boolean arg1) {
        int var3 = 122 % ((arg0 - -85) / 38);
        ++field8107;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V", line = 166)
    public final void method3247(byte arg0) {
        ++field8102;
        class286 var2 = super.field6621.field5493;
        if (this.field8094) {
            OpenGL.glBindProgramARB(34336, ~super.field6621.field5569 != Integer.MIN_VALUE ? this.field8105.field3447 : this.field8106.field3447);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field6621.field5569 != Integer.MIN_VALUE ? this.field8096.field3447 : this.field8109.field3447);
        }
        if (arg0 == -18) {
            var2.method1764(class134.field2169, (float) super.field6621.field5569, (byte) -75, 0.0F, -1.0F, 0.0F);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class134.field2169[0], class134.field2169[1], class134.field2169[2], class134.field2169[3]);
            OpenGL.glEnable(34336);
            this.field8099 = true;
            this.method3245(false);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V", line = 192)
    public final void method1175(boolean arg0, int arg1) {
        ++field8110;
        this.field8094 = arg0;
        super.field6621.method2308(1, arg1 ^ -15115);
        super.field6621.method2295((byte) -108, this.field8095);
        super.field6621.method2328(34165, -72, 7681);
        super.field6621.method2262(34166, 0, 34176, 768);
        super.field6621.method2262(5890, 2, 34176, 770);
        super.field6621.method2258(arg1 ^ -127, 34168, 770, 0);
        super.field6621.method2308(arg1, -15115);
        this.method3247((byte) -18);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/lang/String;)V", line = 209)
    public static final void method3248(int arg0, String arg1) {
        ++field8113;
        if (class41.field555 && ~(24 & class700.field9918) != -1) {
            boolean var2 = false;
            int var3 = class643.field9134;
            int[] var4 = class98.field1458;
            if (arg0 == -11648) {
                for (int var5 = 0; ~var5 > ~var3; ++var5) {
                    class270 var6 = class76.field1186[var4[var5]];
                    if (var6.field3848 != null && var6.field3848.equalsIgnoreCase(arg1) && (class103.field1708 == var6 && ~(class700.field9918 & 16) != -1 || var6 != null && (class700.field9918 & 8) != 0)) {
                        ++class451.field6499;
                        class699 var7 = class452.method2630(class699.field9897, class272.field3897, (byte) 126);
                        var7.field9908.method2700(class199.field3091, 0);
                        var7.field9908.method2745(class595.field8622, -1670631224);
                        var7.field9908.method2733(false, class395.field5705);
                        var7.field9908.method2697(27219, 0);
                        var7.field9908.method2700(var4[var5], arg0 ^ -11648);
                        class149.method1134(var7, true);
                        var2 = true;
                        class534.method3135(var6.field2459[0], 0, var6.method1108(arg0 + 11760), -84, var6.method1108(96), true, -2, 0, var6.field2454[0]);
                        break;
                    }
                }
                if (!var2) {
                    class300.method1846(4, class343.field4770.method2059(class238.field3511, true) + arg1, 0);
                }
                if (class41.field555) {
                    class372.method2220(arg0 ^ 32023);
                }
            }
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class92 extends class301 {

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Z")
    private boolean field1261 = false;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "Loca;")
    private class296 field1269;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Loca;")
    private class296 field1250;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "Loca;")
    private class296 field1270;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Loca;")
    private class296 field1255;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "Lgha;")
    private class520 field1264;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "Z")
    private boolean field1262;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field1254 = 0;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lrn;")
    public static class633 field1253 = new class633(20, 3);

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field1271 = 50;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1272 = new String[field1271];

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "[[I")
    public static int[][] field1275 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "[I")
    public static int[] field1273 = new int[field1271];

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "[I")
    public static int[] field1277 = new int[field1271];

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "[I")
    public static int[] field1274 = new int[field1271];

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "[I")
    public static int[] field1280 = new int[field1271];

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "[I")
    public static int[] field1276 = new int[field1271];

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "[I")
    public static int[] field1279 = new int[field1271];

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "Z")
    private boolean field1251;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "Z")
    private boolean field1260;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "[[B")
    public static byte[][] field1263;

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lck;)V")
    public class92(class733 arg0) {
        super(arg0);
        if (super.field3803.field9849) {
            this.field1269 = class416.method2407("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field3803, 34336, 34933);
            this.field1250 = class416.method2407("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field3803, 34336, 34933);
            this.field1270 = class416.method2407("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field3803, 34336, 34933);
            this.field1255 = class416.method2407("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field3803, 34336, 34933);
            if (this.field1269 != null & this.field1250 != null & this.field1270 != null & this.field1255 != null) {
                this.field1264 = new class520(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field1264.method2873(-26403, false, false);
                this.field1262 = true;
            } else {
                this.field1262 = false;
            }
        } else {
            this.field1262 = false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(IZ)V")
    public final void method27(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field1258;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
    public final void method24(byte arg0) {
        if (this.field1260) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1260 = false;
        }
        ++field1257;
        super.field3803.method3945(1, false);
        super.field3803.method3975((byte) 125, (class128) null);
        super.field3803.method3917(70, 8448, 8448);
        super.field3803.method3954(0, 768, 5890, (byte) 122);
        super.field3803.method3954(2, 770, 34166, (byte) 107);
        super.field3803.method3922(0, 1, 770, 5890);
        super.field3803.method3945(0, false);
        if (arg0 >= -89) {
            this.field1255 = null;
        }
        if (this.field1261) {
            super.field3803.method3954(0, 768, 5890, (byte) 121);
            super.field3803.method3922(0, 1, 770, 5890);
            this.field1261 = false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public final void method553(boolean arg0) {
        ++field1265;
        class75 var2 = super.field3803.field9839;
        if (this.field1251) {
            OpenGL.glBindProgramARB(34336, ~super.field3803.field9933 == Integer.MIN_VALUE ? this.field1250.field3755 : this.field1255.field3755);
        } else {
            OpenGL.glBindProgramARB(34336, super.field3803.field9933 != Integer.MAX_VALUE ? this.field1270.field3755 : this.field1269.field3755);
        }
        var2.method461(-1.0F, 1, 0.0F, class149.field1900, (float) super.field3803.field9933, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class149.field1900[0], class149.field1900[1], class149.field1900[2], class149.field1900[3]);
        OpenGL.glEnable(34336);
        this.field1260 = arg0;
        this.method555(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lwj;II)V")
    public final void method28(class128 arg0, int arg1, int arg2) {
        ++field1267;
        if (arg0 == null) {
            if (!this.field1261) {
                super.field3803.method3975((byte) 127, super.field3803.field9944);
                super.field3803.method3979((byte) -40, 1);
                super.field3803.method3954(0, 768, 34168, (byte) 108);
                super.field3803.method3922(0, arg1 + 1, 770, 34168);
                this.field1261 = true;
            }
        } else {
            if (this.field1261) {
                super.field3803.method3954(0, 768, 5890, (byte) 109);
                super.field3803.method3922(0, 1, 770, 5890);
                this.field1261 = false;
            }
            super.field3803.method3975((byte) 125, arg0);
            super.field3803.method3979((byte) 98, arg2);
        }
        if (arg1 != 0) {
            this.method25((byte) -35);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Z")
    public final boolean method25(byte arg0) {
        if (arg0 <= 7) {
            this.field1269 = null;
        }
        ++field1259;
        return this.field1262;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        ++field1252;
        if (arg2 != 0) {
            field1254 = -52;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)Z")
    public static final boolean method554(int arg0, byte arg1, int arg2) {
        if (arg1 < 15) {
            field1276 = null;
        }
        ++field1266;
        if (!class729.method3896(121, arg2, arg0)) {
            return false;
        } else {
            return class472.method2664(arg2, arg0, -8056) | (45056 & arg0) != 0 | class325.method1880(arg0, arg2, -2) ? true : (class120.method715(arg2, arg0, -92) | class755.method4098(65536, arg2, arg0)) & ~(arg2 & 55) == -1;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V")
    public final void method29(int arg0, boolean arg1) {
        ++field1278;
        if (arg0 <= 18) {
            this.method22(-14, -56, -21);
        }
        this.field1251 = arg1;
        super.field3803.method3945(1, false);
        super.field3803.method3975((byte) 121, this.field1264);
        super.field3803.method3917(37, 34165, 7681);
        super.field3803.method3954(0, 768, 34166, (byte) 116);
        super.field3803.method3954(2, 770, 5890, (byte) 117);
        super.field3803.method3922(0, 1, 770, 34168);
        super.field3803.method3945(0, false);
        this.method553(true);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)V")
    public final void method555(boolean arg0) {
        if (!arg0) {
            field1263 = null;
        }
        if (this.field1260) {
            int var2 = super.field3803.method985();
            int var3 = super.field3803.method951();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3803.field9852, (float) super.field3803.field9843 / 255.0F);
            super.field3803.method3945(1, false);
            super.field3803.method3921(super.field3803.field9856, 7077);
            super.field3803.method3945(0, false);
        }
        ++field1268;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
    public static final void method556(int arg0, byte arg1) {
        ++field1256;
        if (class561.field7133 == null) {
            class561.field7133 = new byte[4][class240.field3280][class276.field3602];
        }
        int var2 = 109 / ((arg0 - 44) / 43);
        for (int var3 = 0; ~var3 > -5; ++var3) {
            for (int var4 = 0; var4 < class240.field3280; ++var4) {
                for (int var5 = 0; class276.field3602 > var5; ++var5) {
                    class561.field7133[var3][var4][var5] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public static void method557(int arg0) {
        field1279 = null;
        if (arg0 != -13360) {
            method557(122);
        }
        field1272 = null;
        field1253 = null;
        field1277 = null;
        field1275 = null;
        field1273 = null;
        field1280 = null;
        field1263 = null;
        field1274 = null;
        field1276 = null;
    }
}

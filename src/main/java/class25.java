import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 extends class140 {

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "Lkh;")
    private class15 field252;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "Lkh;")
    private class15 field257;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "Lkh;")
    private class15 field251;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "Lkh;")
    private class15 field256;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "Z")
    private boolean field259;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "[I")
    public static int[] field244 = new int[5];

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "[I")
    public static int[] field240 = new int[2];

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "Lot;")
    public static class507 field261 = null;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Z")
    private boolean field248;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "Z")
    private boolean field250;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "[I")
    public static int[] field247;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "[[Z")
    public static boolean[][] field245;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILjl;)V", line = 3)
    public final void method146(int arg0, int arg1, class228 arg2) {
        ++field255;
        if (arg0 != -7) {
            this.field259 = true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILjava/awt/Component;ILlp;)Lgaa;", line = 22)
    public static final class248 method150(int arg0, int arg1, Component arg2, int arg3, class331 arg4) {
        ++field239;
        if (~class270.field3834 == -1) {
            throw new IllegalStateException();
        } else if (~arg0 <= -1 && ~arg0 > -3) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class248 var5 = (class248) Class.forName("bv").newInstance();
                var5.field3586 = arg3;
                var5.field3565 = new int[256 * (class103.field1505 ? 2 : 1)];
                var5.method1573(arg2);
                var5.field3579 = (arg3 & -1024) + 1024;
                if (var5.field3579 > 16384) {
                    var5.field3579 = 16384;
                }
                var5.method1574(var5.field3579);
                if (class418.field5653 > 0 && class101.field1468 == null) {
                    class101.field1468 = new class80();
                    class101.field1468.field1077 = arg4;
                    arg4.method2004(arg1 + -14978, class418.field5653, class101.field1468);
                }
                if (class101.field1468 != null) {
                    if (class101.field1468.field1078[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class101.field1468.field1078[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class327 var6 = new class327(arg4, arg0);
                    var6.field3586 = arg3;
                    var6.field3565 = new int[(!class103.field1505 ? 1 : 2) * 256];
                    var6.method1573(arg2);
                    var6.field3579 = arg1;
                    var6.method1574(var6.field3579);
                    if (class418.field5653 > 0 && class101.field1468 == null) {
                        class101.field1468 = new class80();
                        class101.field1468.field1077 = arg4;
                        arg4.method2004(1406, class418.field5653, class101.field1468);
                    }
                    if (class101.field1468 != null) {
                        if (class101.field1468.field1078[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class101.field1468.field1078[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class248();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 107)
    public static void method151(byte arg0) {
        if (arg0 < 111) {
            method151((byte) 77);
        }
        field244 = null;
        field245 = null;
        field240 = null;
        field247 = null;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lte;)V", line = 121)
    public class25(class527 arg0) {
        super(arg0);
        if (super.field1984.field7862) {
            this.field252 = class602.method3557(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", (byte) -15, super.field1984);
            this.field257 = class602.method3557(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", (byte) 119, super.field1984);
            this.field251 = class602.method3557(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", (byte) -38, super.field1984);
            this.field256 = class602.method3557(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", (byte) 125, super.field1984);
            this.field259 = this.field251 != null & this.field252 != null & this.field257 != null & this.field256 != null;
        } else {
            this.field259 = false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V", line = 139)
    public final void method144(int arg0, int arg1, int arg2) {
        ++field254;
        if (arg1 != -4741) {
            this.field259 = true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)V", line = 150)
    public final void method145(int arg0, boolean arg1) {
        if (arg0 == -7) {
            ++field258;
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V", line = 163)
    public final void method152(int arg0) {
        ++field242;
        class254.field3660[3] = (float) super.field1984.field7863;
        OpenGL.glTexGenfv(8192, 9474, class254.field3660, arg0);
        if (!this.field250) {
            OpenGL.glBindProgramARB(34336, ~super.field1984.field7863 != Integer.MIN_VALUE ? this.field251.field152 : this.field252.field152);
        } else {
            OpenGL.glBindProgramARB(34336, super.field1984.field7863 == Integer.MAX_VALUE ? this.field257.field152 : this.field256.field152);
        }
        OpenGL.glEnable(34336);
        this.field248 = true;
        this.method153(-16597);
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)V", line = 191)
    public final void method153(int arg0) {
        if (this.field248) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field1984.field7766 + -1280), (float) (super.field1984.field7766 - 768), 1.0F / (float) super.field1984.field7830, (float) super.field1984.field7837 / 255.0F);
        }
        ++field260;
        if (arg0 != -16597) {
            this.field252 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZB)V", line = 207)
    public final void method148(boolean arg0, byte arg1) {
        this.field250 = arg0;
        ++field243;
        if (arg1 != -86) {
            this.method153(13);
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 218)
    public final void method143(int arg0) {
        if (arg0 == -7) {
            ++field249;
            if (this.field248) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field248 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILfaa;)V", line = 240)
    public static final void method154(int arg0, class136 arg1) {
        ++field262;
        boolean var2 = false;
        if (class617.field9123 != arg1.field1857 && arg1.field1872 != -1 && ~arg1.field1882 == -1) {
            class78 var3 = class463.field6521.method2983(arg1.field1872, arg0 ^ -5589);
            if (var3.field1048 || ~(arg1.field1926 - -1) < ~var3.field1049[arg1.field1858]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = arg1.field1857 - arg1.field1874;
            int var5 = -arg1.field1874 + class617.field9123;
            int var6 = arg1.field1889 * 128 + arg1.method940(arg0 ^ -5565) * 64;
            int var7 = arg1.field1915 * 128 - -(64 * arg1.method940(-1));
            int var8 = arg1.field1928 * 128 + 64 * arg1.method940(-1);
            int var9 = arg1.field1853 * 128 + arg1.method940(-1) * 64;
            arg1.field8500 = ((-var5 + var4) * var7 + var5 * var9) / var4;
            arg1.field8496 = ((-var5 + var4) * var6 - -(var5 * var8)) / var4;
        }
        arg1.field1952 = 0;
        if (arg1.field1932 == 0) {
            arg1.method941(false, 8192, (byte) 66);
        }
        if (arg0 != 5564) {
            field244 = null;
        }
        if (arg1.field1932 == 1) {
            arg1.method941(false, 12288, (byte) 66);
        }
        if (~arg1.field1932 == -3) {
            arg1.method941(false, 0, (byte) 66);
        }
        if (~arg1.field1932 == -4) {
            arg1.method941(false, 4096, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V", line = 297)
    public static final void method155(int arg0) {
        if (class166.field2616 != null) {
            class166.field2616.method1372(arg0 + 5);
            class166.field2616 = null;
            class163.field2566 = null;
        }
        if (arg0 == -1) {
            ++field253;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)Z", line = 318)
    public final boolean method149(int arg0) {
        ++field246;
        if (arg0 > -36) {
            this.method146(7, -27, (class228) null);
        }
        return this.field259;
    }
}

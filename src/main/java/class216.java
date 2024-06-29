import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class216 extends class348 {

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Z")
    private boolean field3661;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Law;")
    private class390 field3658;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Law;")
    private class390 field3672;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Law;")
    private class390 field3665;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Law;")
    private class390 field3659;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "[I")
    public static int[] field3676 = new int[5];

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Ljava/awt/Frame;")
    public static Frame field3671;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Z")
    private boolean field3657;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "Z")
    private boolean field3664;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z")
    public static final boolean method1590(int arg0, int arg1, int arg2) {
        if (arg2 > -50) {
            field3676 = null;
        }
        ++field3662;
        if (!class409.field6204) {
            return false;
        } else {
            int var3 = arg1 >> 16;
            int var4 = arg1 & 65535;
            if (class433.field6540[var3] != null && class433.field6540[var3][var4] != null) {
                class437 var5 = class433.field6540[var3][var4];
                if (arg0 == -1 && ~var5.field6729 == -1) {
                    for (class140 var6 = (class140) class392.field5958.method2123(-62); var6 != null; var6 = (class140) class392.field5958.method2126((byte) 61)) {
                        if (var6.field1894 == 13 || var6.field1894 == 1012 || ~var6.field1894 == -6 || ~var6.field1894 == -60 || var6.field1894 == 8) {
                            for (class437 var7 = class255.method1747(var6.field1905, false); var7 != null; var7 = class49.method354(var7, (byte) -22)) {
                                if (var5.field6751 == var7.field6751) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class140 var8 = (class140) class392.field5958.method2123(-106); var8 != null; var8 = (class140) class392.field5958.method2126((byte) 61)) {
                        if (var8.field1897 == arg0 && var5.field6751 == var8.field1905 && (var8.field1894 == 13 || var8.field1894 == 1012 || var8.field1894 == 5 || var8.field1894 == 59 || var8.field1894 == 8)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        int var3 = -121 % ((-23 - arg1) / 41);
        ++field3668;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)Z")
    public static final boolean method1591(int arg0, int arg1, int arg2) {
        int var3 = class122.field1662[arg0][arg1][arg2];
        if (-class397.field5998 == var3) {
            return false;
        } else if (class397.field5998 == var3) {
            return true;
        } else {
            int var4 = arg1 << class56.field908;
            int var5 = arg2 << class56.field908;
            if (class31.method200(var4 + 1, class53.field732[arg0].method688(arg1, arg2), var5 + 1) && class31.method200(class42.field454 + var4 - 1, class53.field732[arg0].method688(arg1 + 1, arg2), var5 + 1) && class31.method200(class42.field454 + var4 - 1, class53.field732[arg0].method688(arg1 + 1, arg2 + 1), class42.field454 + var5 - 1) && class31.method200(var4 + 1, class53.field732[arg0].method688(arg1, arg2 + 1), class42.field454 + var5 - 1) && class31.method200(class376.field5781 + var4, class53.field732[arg0].method688(arg1, arg2), var5 + 1) && class31.method200(class42.field454 + var4 - 1, class53.field732[arg0].method688(arg1 + 1, arg2), class376.field5781 + var5) && class31.method200(class376.field5781 + var4, class53.field732[arg0].method688(arg1, arg2 + 1), class42.field454 + var5 - 1) && class31.method200(class42.field454 + var4 - 1, class53.field732[arg0].method688(arg1, arg2), class376.field5781 + var5) && class31.method200(class376.field5781 + var4, class53.field732[arg0].method688(arg1, arg2), class376.field5781 + var5)) {
                class122.field1662[arg0][arg1][arg2] = class397.field5998;
                return true;
            } else {
                class122.field1662[arg0][arg1][arg2] = -class397.field5998;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method1592(byte arg0) {
        field3676 = null;
        field3671 = null;
        if (arg0 >= -48) {
            field3676 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        ++field3673;
        if (arg2 >= -51) {
            method1590(-124, -78, 94);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lna;)V")
    public class216(class211 arg0) {
        super(arg0);
        if (!super.field5398.field3513) {
            this.field3661 = false;
        } else {
            this.field3658 = class52.method365(34336, super.field5398, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 0);
            this.field3672 = class52.method365(34336, super.field5398, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 0);
            this.field3665 = class52.method365(34336, super.field5398, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 0);
            this.field3659 = class52.method365(34336, super.field5398, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 0);
            this.field3661 = this.field3659 != null & this.field3665 != null & this.field3658 != null & this.field3672 != null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public final void method1593(int arg0) {
        class109.field1557[3] = (float) super.field5398.field3547;
        int var2 = -110 % ((arg0 - -44) / 49);
        ++field3674;
        OpenGL.glTexGenfv(8192, 9474, class109.field1557, 0);
        if (!this.field3664) {
            OpenGL.glBindProgramARB(34336, super.field5398.field3547 != Integer.MAX_VALUE ? this.field3665.field5932 : this.field3658.field5932);
        } else {
            OpenGL.glBindProgramARB(34336, super.field5398.field3547 != Integer.MAX_VALUE ? this.field3659.field5932 : this.field3672.field5932);
        }
        OpenGL.glEnable(34336);
        this.field3657 = true;
        this.method1594((byte) 100);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        if (arg1 >= -30) {
            this.field3658 = null;
        }
        ++field3670;
        this.field3664 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        if (arg0 != -233) {
            this.field3659 = null;
        }
        ++field3660;
        return this.field3661;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        ++field3666;
        int var4 = 32 / ((arg1 - -49) / 44);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        int var2 = -118 / ((61 - arg0) / 63);
        if (this.field3657) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3657 = false;
        }
        ++field3675;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public final void method1594(byte arg0) {
        ++field3663;
        if (arg0 <= 26) {
            this.method267(80);
        }
        if (this.field3657) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field5398.field3516 + -1280), (float) (super.field5398.field3516 - 768), 1.0F / (float) super.field5398.field3570, (float) super.field5398.field3541 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IJ)V")
    public static final void method1595(int arg0, long arg1) {
        ++field3667;
        int var3 = class433.field6538;
        if (~class290.field4578 != ~var3) {
            int var4 = -class290.field4578 + var3;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (~var4 >= -1) {
                if (~var5 == -1) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 != 0) {
                if (~var4 > ~var5) {
                    var5 = var4;
                }
            } else {
                var5 = 1;
            }
            class290.field4578 += var5;
        }
        int var6 = class5.field61;
        if (class254.field4115 != var6) {
            int var7 = -class254.field4115 + var6;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (~var8 == -1) {
                    var8 = -1;
                } else if (~var8 > ~var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class254.field4115 += var8;
        }
        if (!class141.field1911.field6082) {
            class135.field1824 += (float) arg1 * class131.field1781 / 40.0F * 8.0F;
            class388.field5918 += (float) arg1 * class376.field5767 / 40.0F * 8.0F;
        }
        if (arg0 == 0) {
            class62.method457(arg0 ^ 3047);
        }
    }
}

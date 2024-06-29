import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class137 extends class489 {

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "Z")
    private boolean field1637 = false;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "Lkn;")
    private class327 field1638;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "Lkn;")
    private class327 field1639;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Lkn;")
    private class327 field1621;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "Lkn;")
    private class327 field1634;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "Z")
    private boolean field1640;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "Lhga;")
    private class185 field1635;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field1636 = -1;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "[C")
    public static char[] field1626 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "Lbh;")
    public static class429 field1624;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Z")
    private boolean field1622;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Z")
    private boolean field1627;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public static void method852(int arg0) {
        field1624 = null;
        field1626 = null;
        if (arg0 != 0) {
            method856((class11) null, 106, -74, -59, -96);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLkp;I)V")
    public final void method12(byte arg0, class411 arg1, int arg2) {
        if (arg0 < -66) {
            ++field1631;
            if (arg1 == null) {
                if (!this.field1637) {
                    super.field6956.method2120(-1, super.field6956.field5037);
                    super.field6956.method2153(87, 1);
                    super.field6956.method2132(768, (byte) -20, 34168, 0);
                    super.field6956.method2189(34168, true, 0, 770);
                    this.field1637 = true;
                    return;
                }
            } else {
                if (this.field1637) {
                    super.field6956.method2132(768, (byte) -114, 5890, 0);
                    super.field6956.method2189(5890, true, 0, 770);
                    this.field1637 = false;
                }
                super.field6956.method2120(-1, arg1);
                super.field6956.method2153(81, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)Z")
    public static final boolean method853(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field1624 = null;
        }
        ++field1625;
        return ~(33 & arg1) != -1;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
    public final void method854(byte arg0) {
        ++field1630;
        class688 var2 = super.field6956.field4991;
        if (arg0 != -95) {
            field1626 = null;
        }
        if (!this.field1622) {
            OpenGL.glBindProgramARB(34336, super.field6956.field5030 == Integer.MAX_VALUE ? this.field1638.field4177 : this.field1621.field4177);
        } else {
            OpenGL.glBindProgramARB(34336, super.field6956.field5030 != Integer.MAX_VALUE ? this.field1634.field4177 : this.field1639.field4177);
        }
        var2.method3848((byte) 37, class397.field5517, 0.0F, 0.0F, (float) super.field6956.field5030, -1.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class397.field5517[0], class397.field5517[1], class397.field5517[2], class397.field5517[3]);
        OpenGL.glEnable(34336);
        this.field1627 = true;
        this.method855(arg0 + 26);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
    public final void method8(int arg0, int arg1, int arg2) {
        ++field1618;
        if (arg2 != 40) {
            method852(5);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Leq;)V")
    public class137(class357 arg0) {
        super(arg0);
        if (super.field6956.field5077) {
            this.field1638 = class422.method2503(34336, (byte) 123, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field6956);
            this.field1639 = class422.method2503(34336, (byte) 114, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field6956);
            this.field1621 = class422.method2503(34336, (byte) 78, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field6956);
            this.field1634 = class422.method2503(34336, (byte) 76, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field6956);
            if (!(this.field1621 != null & this.field1639 != null & this.field1638 != null & this.field1634 != null)) {
                this.field1640 = false;
            } else {
                this.field1635 = new class185(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field1635.method1188(10242, false, false);
                this.field1640 = true;
            }
        } else {
            this.field1640 = false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V")
    public final void method10(int arg0, boolean arg1) {
        int var3 = -71 % ((-43 - arg0) / 37);
        ++field1623;
        this.field1622 = arg1;
        super.field6956.method2135(1, -5027);
        super.field6956.method2120(-1, this.field1635);
        super.field6956.method2165((byte) 74, 7681, 34165);
        super.field6956.method2132(768, (byte) 125, 34166, 0);
        super.field6956.method2132(770, (byte) 113, 5890, 2);
        super.field6956.method2189(34168, true, 0, 770);
        super.field6956.method2135(0, -5027);
        this.method854((byte) -95);
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public final void method855(int arg0) {
        if (this.field1627) {
            int var2 = super.field6956.method108();
            int var3 = super.field6956.method147();
            float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field6956.field5072, (float) super.field6956.field5097 / 255.0F);
            super.field6956.method2135(1, -5027);
            super.field6956.method2118(super.field6956.field5091, -15182);
            super.field6956.method2135(0, -5027);
        }
        ++field1628;
        if (arg0 >= -57) {
            this.field1621 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(IZ)V")
    public final void method9(int arg0, boolean arg1) {
        if (arg0 == -5) {
            ++field1619;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        ++field1620;
        if (this.field1627) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1627 = false;
        }
        super.field6956.method2135(1, -5027);
        super.field6956.method2120(arg0 + -1, (class411) null);
        super.field6956.method2165((byte) 74, 8448, 8448);
        super.field6956.method2132(768, (byte) 113, 5890, arg0);
        super.field6956.method2132(770, (byte) -66, 34166, 2);
        super.field6956.method2189(5890, true, 0, 770);
        super.field6956.method2135(0, -5027);
        if (this.field1637) {
            super.field6956.method2132(768, (byte) 16, 5890, 0);
            super.field6956.method2189(5890, true, 0, 770);
            this.field1637 = false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Loo;IIII)V")
    public static final void method856(class11 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 34336) {
            method856((class11) null, 38, 108, 69, 60);
        }
        ++field1633;
        long var5 = (long) (arg2 | arg3 << 28 | arg4 << 14);
        class585 var7 = (class585) class497.field7028.method3248(var5, 0);
        if (var7 == null) {
            class585 var8 = new class585();
            class497.field7028.method3249(var5, var8, (byte) 98);
            var8.field8118.method3110(arg0, 1);
        } else {
            class167 var9 = class190.field2488.method3944(256, arg0.field127);
            int var10 = var9.field2186;
            if (var9.field2169 == 1) {
                var10 = (arg0.field122 + 1) * var10;
            }
            for (class11 var11 = (class11) var7.field8118.method3111(61); var11 != null; var11 = (class11) var7.field8118.method3116(-82)) {
                class167 var12 = class190.field2488.method3944(arg1 ^ 34592, var11.field127);
                int var13 = var12.field2186;
                if (var12.field2169 == 1) {
                    var13 = (var11.field122 + 1) * var13;
                }
                if (~var13 > ~var10) {
                    class58.method455(false, arg0, var11);
                    return;
                }
            }
            var7.field8118.method3110(arg0, arg1 + -34335);
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        if (arg0 <= 95) {
            return true;
        } else {
            ++field1629;
            return this.field1640;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)I")
    public static final int method857(int arg0, int arg1, byte arg2) {
        ++field1632;
        if (arg2 > -6) {
            return -121;
        } else {
            return ~arg1 != -2 && arg1 != 3 ? class462.field6698[arg0 & 3] : class328.field4184[3 & arg0];
        }
    }
}

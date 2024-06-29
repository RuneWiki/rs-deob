import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class15 extends class182 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lpc;")
    private class35 field186;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Lpc;")
    private class35 field209;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Lpc;")
    private class35 field197;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Lpc;")
    private class35 field205;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Z")
    private boolean field202;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Ldga;")
    private class441 field201;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Ltl;")
    public static class566 field192 = new class566();

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Lka;")
    public static class622 field198;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
    private boolean field194;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Z")
    private boolean field207;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZ)V", line = 4)
    public final void method84(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method77((byte) -120);
        }
        this.field207 = arg1;
        ++field206;
        super.field2540.method2625(20296, 1);
        super.field2540.method2627(27, this.field201);
        super.field2540.method2669(7681, 69, 34165);
        super.field2540.method2636(0, 768, 34166, -127);
        super.field2540.method2636(2, 770, 5890, -121);
        super.field2540.method2637(770, -513, 0, 34168);
        super.field2540.method2625(20296, 0);
        this.method95(-1);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 25)
    public final void method95(int arg0) {
        ++field204;
        class62 var2 = super.field2540.field6431;
        if (!this.field207) {
            OpenGL.glBindProgramARB(34336, super.field2540.field6458 != Integer.MAX_VALUE ? this.field197.field498 : this.field186.field498);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field2540.field6458 == Integer.MIN_VALUE ? this.field209.field498 : this.field205.field498);
        }
        var2.method362((float) arg0, (float) super.field2540.field6458, true, 0.0F, 0.0F, class651.field9081);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class651.field9081[0], class651.field9081[1], class651.field9081[2], class651.field9081[3]);
        OpenGL.glEnable(34336);
        this.field194 = true;
        this.method102(-111);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([[BILsca;)V", line = 56)
    public static final void method96(byte[][] arg0, int arg1, class235 arg2) {
        for (int var3 = 0; ~var3 > ~arg2.field1038; ++var3) {
            class276.method1656(arg1 ^ -919921645);
            for (int var4 = 0; class703.field9886 >> 3 > var4; ++var4) {
                for (int var5 = 0; class431.field5789 >> 3 > var5; ++var5) {
                    int var6 = class328.field4408[var3][var4][var5];
                    if (~var6 != 0) {
                        int var7 = (var6 & 62523003) >> 24;
                        if (!arg2.field1035 || var7 == 0) {
                            int var8 = (6 & var6) >> 1;
                            int var9 = (var6 & 16764828) >> 14;
                            int var10 = var6 >> 3 & 2047;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; ~var12 > ~class126.field1760.length; ++var12) {
                                if (class126.field1760[var12] == var11 && arg0[var12] != null) {
                                    arg2.method1455(class146.field1963, (var10 & 7) * 8, arg0[var12], class322.field4302, var5 * 8, (var9 & 7) * 8, var3, (byte) -109, var7, var4 * 8, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field187;
        if (arg1 != 62523003) {
            method96((byte[][]) null, -23, (class235) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I", line = 128)
    public static int method97(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Z", line = 136)
    public static final boolean method98(byte arg0, int arg1) {
        ++field203;
        if (arg0 <= 18) {
            field190 = 74;
        }
        return ~arg1 == -2 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 152)
    public static final void method99(boolean arg0) {
        ++class183.field2547;
        ++field195;
        class229 var1 = class97.method550(class71.field841, arg0, class407.field5360);
        var1.field2971.method915(-31914, 0);
        class307.method1805(var1, -14704);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 164)
    public static final boolean method100(String arg0, byte arg1) {
        ++field199;
        return arg1 > -71 ? true : class411.method2338(48, true, arg0, 10);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 177)
    public final void method82(int arg0) {
        ++field200;
        if (arg0 != 26813) {
            this.method102(17);
        }
        if (this.field194) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field194 = false;
        }
        super.field2540.method2625(20296, 1);
        super.field2540.method2627(74, (class262) null);
        super.field2540.method2669(8448, -106, 8448);
        super.field2540.method2636(0, 768, 5890, -115);
        super.field2540.method2636(2, 770, 34166, arg0 + -26931);
        super.field2540.method2637(770, -513, 0, 5890);
        super.field2540.method2625(arg0 ^ 10229, 0);
        super.field2540.method2636(0, 768, 5890, -124);
        super.field2540.method2637(770, -513, 0, 5890);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V", line = 207)
    public final void method81(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            method99(false);
        }
        ++field189;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lag;)V", line = 218)
    public class15(class469 arg0) {
        super(arg0);
        if (super.field2540.field6492) {
            this.field186 = class457.method2570(false, 34336, super.field2540, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field209 = class457.method2570(false, 34336, super.field2540, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field197 = class457.method2570(false, 34336, super.field2540, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field205 = class457.method2570(false, 34336, super.field2540, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (!(this.field205 != null & this.field186 != null & this.field209 != null & this.field197 != null)) {
                this.field202 = false;
            } else {
                this.field201 = new class441(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field201.method2495(false, false, (byte) -1);
                this.field202 = true;
            }
        } else {
            this.field202 = false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V", line = 247)
    public final void method79(boolean arg0, int arg1) {
        if (arg1 <= -21) {
            ++field191;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 257)
    public static void method101(int arg0) {
        field198 = null;
        field192 = null;
        if (arg0 < 108) {
            field198 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Z", line = 269)
    public final boolean method77(byte arg0) {
        if (arg0 != -96) {
            method98((byte) -101, -74);
        }
        ++field193;
        return this.field202;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 280)
    public final void method102(int arg0) {
        if (this.field194) {
            int var2 = super.field2540.method1108();
            int var3 = super.field2540.method1054();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2540.field6519, (float) super.field2540.field6488 / 255.0F);
            super.field2540.method2625(20296, 1);
            super.field2540.method2624((byte) 26, super.field2540.field6491);
            super.field2540.method2625(20296, 0);
        }
        if (arg0 >= -106) {
            this.field202 = true;
        }
        ++field188;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILvfa;B)V", line = 311)
    public final void method83(int arg0, class262 arg1, byte arg2) {
        ++field196;
        if (arg1 == null) {
            super.field2540.method2627(27, super.field2540.field6480);
            super.field2540.method2650((byte) -125, 1);
            super.field2540.method2636(0, 768, 34168, -103);
            super.field2540.method2637(770, -513, 0, 34168);
        } else {
            super.field2540.method2627(37, arg1);
            super.field2540.method2650((byte) -34, arg0);
        }
        if (arg2 <= 87) {
            this.method84(false, true);
        }
    }
}

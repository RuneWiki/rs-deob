import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class50 extends class682 {

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Z")
    private boolean field524 = false;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Z")
    private boolean field525;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "Lpi;")
    private class496 field542;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "Lpi;")
    private class496 field533;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "Lpi;")
    private class496 field540;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Lpi;")
    private class496 field532;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "Lwn;")
    private class720 field541;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Z")
    private boolean field526;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "Z")
    private boolean field543;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public final void method281(byte arg0) {
        ++field531;
        class624 var2 = super.field9647.field5950;
        if (this.field526) {
            OpenGL.glBindProgramARB(34336, super.field9647.field5959 != Integer.MAX_VALUE ? this.field532.field7008 : this.field533.field7008);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field9647.field5959 == Integer.MIN_VALUE ? this.field542.field7008 : this.field540.field7008);
        }
        var2.method3583(0.0F, 0.0F, class463.field6620, (float) super.field9647.field5959, (byte) 24, -1.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class463.field6620[0], class463.field6620[1], class463.field6620[2], class463.field6620[3]);
        OpenGL.glEnable(34336);
        if (arg0 != -28) {
            this.field526 = false;
        }
        this.field543 = true;
        this.method284((byte) -25);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(IBI)Z")
    public static final boolean method282(int arg0, byte arg1, int arg2) {
        ++field527;
        int var3 = -55 / ((arg1 - 59) / 32);
        return class60.method460(false, arg0, arg2) || class222.method1291(arg0, 94, arg2);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V")
    public static final void method283(boolean arg0) {
        ++field528;
        if (class327.field4245 != -1) {
            int var1 = class353.field4537.method694((byte) -75);
            int var2 = class353.field4537.method691((byte) -105);
            class73 var3 = (class73) class578.field8170.method1719(65280);
            if (var3 != null) {
                var1 = var3.method530(-1);
                var2 = var3.method535((byte) -25);
            }
            if (arg0) {
                int var4 = 0;
                int var5 = 0;
                if (class397.field5443) {
                    var4 = class389.method2400(57);
                    var5 = class752.method4192(1);
                }
                class737.method4112(class327.field4245, class476.field6777 + var5, var5, var5, var4, var4, var1 + var4, class705.field9926 + var4, var2, var1, (byte) -36, var2 + var5);
                if (class354.field4540 != null) {
                    class73.method531(var1 + var4, var2 + var5, 30514);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public final void method284(byte arg0) {
        ++field537;
        if (this.field543) {
            int var2 = super.field9647.method435();
            int var3 = super.field9647.method320();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9647.field6010, (float) super.field9647.field6056 / 255.0F);
            super.field9647.method2545(arg0 + 32911, 1);
            super.field9647.method2581((byte) -59, super.field9647.field6042);
            super.field9647.method2545(32886, 0);
        }
        if (arg0 != -25) {
            this.method285((byte) 41, true);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BZ)V")
    public final void method285(byte arg0, boolean arg1) {
        this.field526 = arg1;
        ++field529;
        super.field9647.method2545(32886, 1);
        super.field9647.method2621(-2, this.field541);
        if (arg0 != 52) {
            this.method292((class292) null, 5, 103);
        }
        super.field9647.method2558(34165, 0, 7681);
        super.field9647.method2626(8960, 768, 0, 34166);
        super.field9647.method2626(8960, 770, 2, 5890);
        super.field9647.method2630(34166, 0, 770, 34168);
        super.field9647.method2545(32886, 0);
        this.method281((byte) -28);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
    public final boolean method286(boolean arg0) {
        if (!arg0) {
            this.field542 = null;
        }
        ++field544;
        return this.field525;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V")
    public final void method287(int arg0, boolean arg1) {
        ++field536;
        if (arg0 <= 111) {
            this.field525 = false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field538;
        if (this.field543) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field543 = false;
        }
        super.field9647.method2545(arg0 + 32886, 1);
        super.field9647.method2621(arg0 ^ -2, (class292) null);
        super.field9647.method2558(8448, 0, 8448);
        super.field9647.method2626(8960, 768, 0, 5890);
        super.field9647.method2626(8960, 770, 2, 34166);
        super.field9647.method2630(arg0 + 34166, arg0, 770, 5890);
        super.field9647.method2545(32886, 0);
        if (this.field524) {
            super.field9647.method2626(8960, 768, 0, 5890);
            super.field9647.method2630(34166, 0, 770, 5890);
            this.field524 = false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lnv;)V")
    public class50(class417 arg0) {
        super(arg0);
        if (!super.field9647.field5978) {
            this.field525 = false;
        } else {
            this.field542 = class65.method487(super.field9647, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 17319);
            this.field533 = class65.method487(super.field9647, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 17319);
            this.field540 = class65.method487(super.field9647, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 17319);
            this.field532 = class65.method487(super.field9647, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 17319);
            if (!(this.field540 != null & this.field542 != null & this.field533 != null & this.field532 != null)) {
                this.field525 = false;
            } else {
                this.field541 = new class720(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field541.method4018(false, false, (byte) 125);
                this.field525 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBI)V")
    public final void method289(int arg0, byte arg1, int arg2) {
        if (arg1 < 72) {
            this.method284((byte) -2);
        }
        ++field530;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)Z")
    public static final boolean method290(boolean arg0, int arg1) {
        if (!arg0) {
            return true;
        } else {
            ++field523;
            return arg1 == 7 || ~arg1 == -10;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V")
    public static final void method291(int arg0, int arg1, int arg2, int arg3) {
        ++field534;
        int var4 = arg3 * class654.field9334.field9831.method1500(-123) >> 8;
        if (arg2 == -1 && !class533.field7714) {
            class703.method3944(115);
        } else if (arg2 != -1 && (~class326.field4223 != ~arg2 || !class435.method2715(15194)) && var4 != 0 && !class533.field7714) {
            class452.method2781(arg2, var4, 107, class464.field6622, arg1, 0, false);
            class703.method3949(46);
        }
        if (class326.field4223 != arg2) {
            class184.field2208 = null;
        }
        if (arg0 == -6666) {
            class326.field4223 = arg2;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ltha;II)V")
    public final void method292(class292 arg0, int arg1, int arg2) {
        ++field539;
        if (arg2 != -16997) {
            this.method287(-64, true);
        }
        if (arg0 != null) {
            if (this.field524) {
                super.field9647.method2626(8960, 768, 0, 5890);
                super.field9647.method2630(arg2 + 51163, 0, 770, 5890);
                this.field524 = false;
            }
            super.field9647.method2621(-2, arg0);
            super.field9647.method2573(arg1, false);
        } else if (!this.field524) {
            super.field9647.method2621(-2, super.field9647.field6008);
            super.field9647.method2573(1, false);
            super.field9647.method2626(8960, 768, 0, 34168);
            super.field9647.method2630(34166, 0, 770, 34168);
            this.field524 = true;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I")
    public static final int method293(byte arg0) {
        ++field535;
        if (~class477.field6803 == -1) {
            class374.field4780.method2181(new class701("jaclib"), arg0 ^ -58);
            if (class374.field4780.method2177((byte) 72).method278(true) != 100) {
                return 1;
            }
            if (!((class701) class374.field4780.method2177((byte) 20)).method3940(12)) {
                class30.field343.method2535(true);
            }
            class477.field6803 = 1;
        }
        if (~class477.field6803 == -2) {
            class463.field6621 = class374.method2176(-29825);
            class374.field4778.method2181(new class124(class472.field6758), arg0 ^ -58);
            class374.field4786.method2181(new class701("jaggl"), -10);
            class374.field4788.method2181(new class701("jagdx"), -10);
            class374.field4789.method2181(new class701("jagmisc"), -10);
            class374.field4790.method2181(new class701("sw3d"), -10);
            class374.field4791.method2181(new class701("hw3d"), -10);
            class374.field4792.method2181(new class701("jagtheora"), -10);
            class374.field4793.method2181(new class124(class179.field2100), -10);
            class374.field4794.method2181(new class124(class654.field9332), -10);
            class374.field4795.method2181(new class124(class65.field663), arg0 ^ -58);
            class374.field4796.method2181(new class124(class203.field2401), -10);
            class374.field4797.method2181(new class124(class378.field5181), -10);
            class374.field4798.method2181(new class124(class650.field9287), arg0 + -58);
            class374.field4799.method2181(new class124(class332.field4306), -10);
            class374.field4800.method2181(new class124(class745.field10405), arg0 + -58);
            class374.field4801.method2181(new class124(class199.field2350), -10);
            class374.field4802.method2181(new class124(class453.field6520), -10);
            class374.field4803.method2181(new class124(class384.field5352), -10);
            class374.field4804.method2181(new class124(class440.field6389), -10);
            class374.field4805.method2181(new class124(class177.field2084), -10);
            class374.field4806.method2181(new class124(class56.field567), -10);
            class374.field4807.method2181(new class581(class289.field3568, "huffman"), -10);
            class374.field4808.method2181(new class124(class688.field9715), -10);
            class374.field4809.method2181(new class124(class544.field7827), -10);
            class374.field4810.method2181(new class124(class330.field4275), -10);
            class374.field4811.method2181(new class659(class385.field5354, "details"), -10);
            for (int var1 = 0; ~class463.field6621.length < ~var1; ++var1) {
                if (class463.field6621[var1].method2177((byte) 120) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class374[] var3 = class463.field6621;
            for (int var4 = 0; var4 < var3.length; ++var4) {
                class374 var5 = var3[var4];
                int var6 = var5.method2180(-94);
                int var7 = var5.method2177((byte) 84).method278(true);
                var2 += var6 * var7 / 100;
            }
            class477.field6803 = 2;
            class572.field8139 = var2;
        }
        if (class463.field6621 == null) {
            return 100;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            class374[] var11 = class463.field6621;
            for (int var12 = 0; var11.length > var12; ++var12) {
                class374 var16 = var11[var12];
                int var17 = var16.method2180(126);
                int var18 = var16.method2177((byte) 85).method278(true);
                if (~var18 > -101) {
                    var10 = false;
                }
                var8 += var17;
                var9 += var17 * var18 / 100;
            }
            if (arg0 != 48) {
                return 11;
            } else {
                if (var10) {
                    if (!((class701) class374.field4789.method2177((byte) 109)).method3940(12)) {
                        class30.field343.method2539(arg0 + -32115);
                    }
                    if (!((class701) class374.field4792.method2177((byte) 31)).method3940(12)) {
                        class47.field512 = class30.field343.method2529(true);
                    }
                    class463.field6621 = null;
                }
                int var13 = var8 - class572.field8139;
                int var14 = var9 - class572.field8139;
                int var15 = ~var13 >= -1 ? 100 : var14 * 100 / var13;
                if (!var10 && var15 > 99) {
                    var15 = 99;
                }
                return var15;
            }
        }
    }
}

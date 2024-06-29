import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class469 extends class548 {

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "Z")
    private boolean field6634 = false;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "Z")
    private boolean field6629;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "Lie;")
    private class6 field6628;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "Lie;")
    private class6 field6630;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "Lie;")
    private class6 field6618;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "Lie;")
    private class6 field6620;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "Lrba;")
    private class456 field6616;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "Ljb;")
    public static class519 field6633 = new class519(47, 10);

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "[I")
    public static int[] field6635 = new int[1];

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6632;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "Z")
    private boolean field6614;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "Z")
    private boolean field6621;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
    public static void method2745(byte arg0) {
        field6632 = null;
        field6635 = null;
        if (arg0 <= 60) {
            field6635 = null;
        }
        field6633 = null;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
    public final void method2746(int arg0) {
        ++field6613;
        class584 var2 = super.field7571.field3550;
        if (!this.field6614) {
            OpenGL.glBindProgramARB(34336, super.field7571.field3620 == Integer.MAX_VALUE ? this.field6628.field41 : this.field6618.field41);
        } else {
            OpenGL.glBindProgramARB(34336, super.field7571.field3620 == Integer.MAX_VALUE ? this.field6630.field41 : this.field6620.field41);
        }
        var2.method3285(0.0F, 0, class311.field4405, 0.0F, (float) super.field7571.field3620, -1.0F);
        if (arg0 != 34820) {
            this.field6616 = null;
        }
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class311.field4405[0], class311.field4405[1], class311.field4405[2], class311.field4405[3]);
        OpenGL.glEnable(34336);
        this.field6621 = true;
        this.method2747((byte) -108);
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(B)V")
    public final void method2747(byte arg0) {
        ++field6622;
        if (this.field6621) {
            int var2 = super.field7571.method469();
            int var3 = super.field7571.method507();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7571.field3581, (float) super.field7571.field3648 / 255.0F);
            super.field7571.method1631(1, -121);
            super.field7571.method1624(5634, super.field7571.field3570);
            super.field7571.method1631(0, -107);
        }
        if (arg0 >= -101) {
            method2751(-35, 45, 104);
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Llf;)V")
    public class469(class250 arg0) {
        super(arg0);
        if (!super.field7571.field3636) {
            this.field6629 = false;
        } else {
            this.field6628 = class317.method2030(super.field7571, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, -15801);
            this.field6630 = class317.method2030(super.field7571, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, -15801);
            this.field6618 = class317.method2030(super.field7571, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, -15801);
            this.field6620 = class317.method2030(super.field7571, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, -15801);
            if (this.field6620 != null & this.field6630 != null & this.field6628 != null & this.field6618 != null) {
                this.field6616 = new class456(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field6616.method2708((byte) -126, false, false);
                this.field6629 = true;
            } else {
                this.field6629 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V")
    public static final void method2748(byte arg0) {
        class342.method2177(0);
        int var1 = 29 / ((arg0 - 86) / 40);
        ++field6636;
        class677.field9075 = false;
        class682.method3741(0, class625.field8477, class92.field1298, class677.field9082, class632.field8551);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)V")
    public final void method758(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field6615;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ldt;I)Ltw;")
    public static final class215 method2749(class254 arg0, int arg1) {
        ++field6619;
        class333 var2 = class206.method1349(arg0, 7402);
        int var3 = arg0.method1672(-16516);
        int var4 = -60 % ((9 - arg1) / 63);
        int var5 = arg0.method1672(-16516);
        int var6 = arg0.method1728((byte) 47);
        return new class215(var2.field4711, var2.field4715, var2.field4713, var2.field4709, var2.field4708, var2.field4710, var2.field4712, var2.field4706, var2.field4707, var3, var5, var6);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2750(byte arg0, String arg1) {
        ++field6626;
        return arg0 < 34 ? 87 : class101.method786(55, arg1, true, 10);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZZ)V")
    public final void method754(boolean arg0, boolean arg1) {
        this.field6614 = arg0;
        ++field6625;
        super.field7571.method1631(1, -87);
        super.field7571.method1595((byte) 78, this.field6616);
        super.field7571.method1630(34165, 7681, 112);
        super.field7571.method1600(17104, 34166, 0, 768);
        super.field7571.method1600(17104, 5890, 2, 770);
        super.field7571.method1581(770, 13112, 0, 34168);
        super.field7571.method1631(0, 90);
        if (arg1) {
            method2750((byte) -104, (String) null);
        }
        this.method2746(34820);
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(III)Z")
    public static final boolean method2751(int arg0, int arg1, int arg2) {
        ++field6631;
        if (arg0 != 0) {
            field6635 = null;
        }
        return ~(arg1 & 540800) != -1;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public final void method759(int arg0) {
        ++field6627;
        if (this.field6621) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6621 = false;
        }
        super.field7571.method1631(1, arg0 + -126);
        if (arg0 == 3) {
            super.field7571.method1595((byte) 100, (class205) null);
            super.field7571.method1630(8448, 8448, 124);
            super.field7571.method1600(17104, 5890, 0, 768);
            super.field7571.method1600(17104, 34166, 2, 770);
            super.field7571.method1581(770, 13112, 0, 5890);
            super.field7571.method1631(0, 37);
            if (this.field6634) {
                super.field7571.method1600(17104, 5890, 0, 768);
                super.field7571.method1581(770, 13112, 0, 5890);
                this.field6634 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z")
    public final boolean method756(boolean arg0) {
        ++field6623;
        return !arg0 ? false : this.field6629;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)V")
    public final void method753(int arg0, int arg1, int arg2) {
        ++field6624;
        if (arg2 != 14106) {
            this.field6630 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lru;II)V")
    public final void method760(class205 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            if (arg0 != null) {
                if (this.field6634) {
                    super.field7571.method1600(17104, 5890, 0, 768);
                    super.field7571.method1581(770, arg1 + 13113, 0, 5890);
                    this.field6634 = false;
                }
                super.field7571.method1595((byte) 71, arg0);
                super.field7571.method1601(25456, arg2);
            } else if (!this.field6634) {
                super.field7571.method1595((byte) 77, super.field7571.field3576);
                super.field7571.method1601(25456, 1);
                super.field7571.method1600(17104, 34168, 0, 768);
                super.field7571.method1581(770, 13112, 0, 34168);
                this.field6634 = true;
            }
            ++field6617;
        }
    }
}

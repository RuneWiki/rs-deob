import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class601 extends class190 {

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Z")
    private boolean field8495 = false;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Z")
    private boolean field8497;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lica;")
    private class391 field8508;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lica;")
    private class391 field8507;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lica;")
    private class391 field8494;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lica;")
    private class391 field8502;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lwo;")
    private class692 field8500;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Ljava/util/Random;")
    public static Random field8501 = new Random();

    @OriginalMember(owner = "client!de", name = "x", descriptor = "[I")
    public static int[] field8509 = new int[5];

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
    private boolean field8496;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Z")
    private boolean field8505;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILnba;I)V", line = 10)
    public final void method911(int arg0, class487 arg1, int arg2) {
        ++field8499;
        if (arg2 != 0) {
            field8501 = null;
        }
        if (arg1 != null) {
            if (this.field8495) {
                super.field3195.method1239(0, 5890, arg2 ^ 768, 768);
                super.field3195.method1264(5890, arg2 ^ 2, 0, 770);
                this.field8495 = false;
            }
            super.field3195.method1306(arg1, 106);
            super.field3195.method1334(0, arg0);
        } else if (!this.field8495) {
            super.field3195.method1306(super.field3195.field2823, arg2 ^ 98);
            super.field3195.method1334(0, 1);
            super.field3195.method1239(0, 34168, 768, 768);
            super.field3195.method1264(34168, 2, 0, 770);
            this.field8495 = true;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 45)
    public final void method3448(int arg0) {
        if (this.field8505) {
            int var2 = super.field3195.method377();
            int var3 = super.field3195.method294();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3195.field2853, (float) super.field3195.field2841 / 255.0F);
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1259(super.field3195.field2871, -18335);
            super.field3195.method1298(0, (byte) -124);
        }
        int var6 = 102 % ((63 - arg0) / 47);
        ++field8498;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 70)
    public final void method910(boolean arg0) {
        if (arg0) {
            this.field8496 = false;
        }
        if (this.field8505) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8505 = false;
        }
        ++field8493;
        super.field3195.method1298(1, (byte) -124);
        super.field3195.method1306((class487) null, 60);
        super.field3195.method1256(8448, -4, 8448);
        super.field3195.method1239(0, 5890, 768, 768);
        super.field3195.method1239(2, 34166, 768, 770);
        super.field3195.method1264(5890, 2, 0, 770);
        super.field3195.method1298(0, (byte) -124);
        if (this.field8495) {
            super.field3195.method1239(0, 5890, 768, 768);
            super.field3195.method1264(5890, 2, 0, 770);
            this.field8495 = false;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 109)
    public final void method3449(int arg0) {
        ++field8506;
        int var2 = -60 % ((54 - arg0) / 51);
        class174 var3 = super.field3195.field2790;
        if (!this.field8496) {
            OpenGL.glBindProgramARB(34336, ~super.field3195.field2877 != Integer.MIN_VALUE ? this.field8494.field5840 : this.field8508.field5840);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field3195.field2877 != Integer.MIN_VALUE ? this.field8502.field5840 : this.field8507.field5840);
        }
        var3.method1373(0.0F, 0.0F, class212.field3523, (byte) 121, -1.0F, (float) super.field3195.field2877);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class212.field3523[0], class212.field3523[1], class212.field3523[2], class212.field3523[3]);
        OpenGL.glEnable(34336);
        this.field8505 = true;
        this.method3448(-48);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z", line = 134)
    public final boolean method908(int arg0) {
        ++field8491;
        if (arg0 < 37) {
            method3450((byte[]) null, (byte) 84);
        }
        return this.field8497;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V", line = 145)
    public final void method909(int arg0, boolean arg1) {
        ++field8490;
        if (arg0 != 16450) {
            this.field8496 = false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BB)Z", line = 158)
    public static final boolean method3450(byte[] arg0, byte arg1) {
        ++field8492;
        class301 var2 = new class301(arg0);
        int var3 = var2.method1987(-62);
        if (~var3 != -3) {
            return false;
        } else {
            boolean var4 = ~var2.method1987(-93) == -2;
            if (var4) {
                class144.method1113(50, var2);
            }
            if (arg1 > -34) {
                return false;
            } else {
                class223.method1581(-1, var2);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 184)
    public static void method3451(int arg0) {
        field8509 = null;
        field8501 = null;
        if (arg0 <= 27) {
            field8501 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lrs;)V", line = 227)
    public class601(class166 arg0) {
        super(arg0);
        if (!super.field3195.field2892) {
            this.field8497 = false;
        } else {
            this.field8508 = class259.method1736(0, super.field3195, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field8507 = class259.method1736(0, super.field3195, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field8494 = class259.method1736(0, super.field3195, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field8502 = class259.method1736(0, super.field3195, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (!(this.field8494 != null & this.field8507 != null & this.field8508 != null & this.field8502 != null)) {
                this.field8497 = false;
            } else {
                this.field8500 = new class692(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field8500.method3862(false, false, -29630);
                this.field8497 = true;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V", line = 199)
    public final void method915(boolean arg0, int arg1) {
        ++field8503;
        this.field8496 = arg0;
        super.field3195.method1298(1, (byte) -124);
        super.field3195.method1306(this.field8500, 96);
        super.field3195.method1256(7681, -4, 34165);
        super.field3195.method1239(0, 34166, arg1 ^ 768, 768);
        super.field3195.method1239(2, 5890, arg1 + 768, 770);
        super.field3195.method1264(34168, 2, arg1, 770);
        super.field3195.method1298(0, (byte) -124);
        this.method3449(-13);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)V", line = 217)
    public final void method914(int arg0, int arg1, byte arg2) {
        ++field8504;
        if (arg2 != -122) {
            this.field8496 = false;
        }
    }
}

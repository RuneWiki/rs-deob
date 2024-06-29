import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class209 extends class531 {

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Z")
    private boolean field3240 = false;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "Lnk;")
    private class747 field3243;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lnk;")
    private class747 field3225;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Lnk;")
    private class747 field3238;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Lnk;")
    private class747 field3232;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Z")
    private boolean field3230;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Lkm;")
    private class373 field3233;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "Lmea;")
    public static class451 field3245 = null;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Z")
    public static boolean field3246 = false;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Z")
    private boolean field3229;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Z")
    private boolean field3235;

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lqfa;)V")
    public class209(class106 arg0) {
        super(arg0);
        if (super.field7676.field1565) {
            this.field3243 = class121.method920(false, 34336, super.field7676, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3225 = class121.method920(false, 34336, super.field7676, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3238 = class121.method920(false, 34336, super.field7676, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3232 = class121.method920(false, 34336, super.field7676, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (!(this.field3232 != null & this.field3225 != null & this.field3243 != null & this.field3238 != null)) {
                this.field3230 = false;
            } else {
                this.field3233 = new class373(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field3233.method2314(false, false, 0);
                this.field3230 = true;
            }
        } else {
            this.field3230 = false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(ZI)V")
    public final void method301(boolean arg0, int arg1) {
        ++field3242;
        this.field3229 = arg0;
        super.field7676.method813((byte) 103, 1);
        super.field7676.method808((byte) 34, this.field3233);
        super.field7676.method802(7681, 11762, 34165);
        super.field7676.method789(34166, 768, 0, (byte) 47);
        super.field7676.method789(5890, 770, 2, (byte) 47);
        super.field7676.method745(34168, 59, 770, 0);
        super.field7676.method813((byte) 103, 0);
        this.method1441((byte) -114);
        if (arg1 > -9) {
            this.field3233 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Z")
    public final boolean method304(int arg0) {
        if (arg0 <= 125) {
            this.field3229 = false;
        }
        ++field3239;
        return this.field3230;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method1441(byte arg0) {
        ++field3237;
        class630 var2 = super.field7676.field1471;
        int var3 = 14 / ((-59 - arg0) / 48);
        if (this.field3229) {
            OpenGL.glBindProgramARB(34336, ~super.field7676.field1505 == Integer.MIN_VALUE ? this.field3225.field10348 : this.field3232.field10348);
        } else {
            OpenGL.glBindProgramARB(34336, super.field7676.field1505 == Integer.MAX_VALUE ? this.field3243.field10348 : this.field3238.field10348);
        }
        var2.method3609(true, (float) super.field7676.field1505, 0.0F, 0.0F, -1.0F, class60.field737);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class60.field737[0], class60.field737[1], class60.field737[2], class60.field737[3]);
        OpenGL.glEnable(34336);
        this.field3235 = true;
        this.method1442(true);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
    public final void method309(boolean arg0, int arg1) {
        ++field3247;
        if (arg1 > -67) {
            this.field3232 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public final void method1442(boolean arg0) {
        if (this.field3235) {
            int var2 = super.field7676.method513();
            int var3 = super.field7676.method457();
            float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7676.field1522, (float) super.field7676.field1552 / 255.0F);
            super.field7676.method813((byte) 103, 1);
            super.field7676.method788(114, super.field7676.field1532);
            super.field7676.method813((byte) 103, 0);
        }
        ++field3231;
        if (!arg0) {
            this.method307(84, true, (class188) null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)V")
    public final void method311(byte arg0, int arg1, int arg2) {
        if (arg0 > -55) {
            method1445(-10);
        }
        ++field3226;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lwia;Ld;IBLjava/awt/Canvas;)Lha;")
    public static final class65 method1443(class791 arg0, class160 arg1, int arg2, byte arg3, Canvas arg4) {
        ++field3227;
        if (!class214.method1472(0)) {
            throw new RuntimeException("");
        } else if (!class581.method3402("jaggl", (byte) -18)) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class529 var8 = new class529(var5, arg4, var6, arg1, arg0, arg2);
                var8.method1177((byte) 60);
                if (arg3 <= 17) {
                    field3241 = 28;
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZLdca;)V")
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        if (arg1) {
            this.method309(false, 71);
        }
        if (arg2 == null) {
            if (!this.field3240) {
                super.field7676.method808((byte) 34, super.field7676.field1510);
                super.field7676.method795(1, 34023);
                super.field7676.method789(34168, 768, 0, (byte) 47);
                super.field7676.method745(34168, 37, 770, 0);
                this.field3240 = true;
            }
        } else {
            if (this.field3240) {
                super.field7676.method789(5890, 768, 0, (byte) 47);
                super.field7676.method745(5890, -121, 770, 0);
                this.field3240 = false;
            }
            super.field7676.method808((byte) 34, arg2);
            super.field7676.method795(arg0, 34023);
        }
        ++field3244;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method1444(byte arg0) {
        ++field3234;
        if (!class626.field8777 && class694.field9692 != null) {
            if (arg0 < 8) {
                field3245 = null;
            }
            return class694.field9692.field10329;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public static void method1445(int arg0) {
        int var1 = -71 / ((arg0 - -54) / 58);
        field3245 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public final void method300(int arg0) {
        if (this.field3235) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3235 = false;
        }
        ++field3228;
        super.field7676.method813((byte) 103, arg0);
        super.field7676.method808((byte) 34, (class188) null);
        super.field7676.method802(8448, arg0 ^ 11763, 8448);
        super.field7676.method789(5890, 768, 0, (byte) 47);
        super.field7676.method789(34166, 770, 2, (byte) 47);
        super.field7676.method745(5890, arg0 ^ 43, 770, 0);
        super.field7676.method813((byte) 103, 0);
        if (this.field3240) {
            super.field7676.method789(5890, 768, 0, (byte) 47);
            super.field7676.method745(5890, 111, 770, 0);
            this.field3240 = false;
        }
    }
}

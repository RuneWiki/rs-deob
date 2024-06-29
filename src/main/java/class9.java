import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class16 {

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Z")
    private boolean field81;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Lph;")
    private class587 field95;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Lph;")
    private class587 field91;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lph;")
    private class587 field82;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lph;")
    private class587 field90;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "F")
    public static float field87;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Lep;")
    public static class382 field92;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Z")
    private boolean field79;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Z")
    private boolean field85;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIZ)V")
    public final void method42(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field81 = false;
        }
        ++field94;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3) {
        class287 var4 = class97.field1074[arg0][arg1][arg2];
        if (var4 != null) {
            class599 var5 = var4.field3678;
            class599 var6 = var4.field3677;
            if (var5 != null) {
                var5.field8519 = var5.field8519 * arg3 / (16 << class8.field70 - 7);
                var5.field8518 = var5.field8518 * arg3 / (16 << class8.field70 - 7);
            }
            if (var6 != null) {
                var6.field8519 = var6.field8519 * arg3 / (16 << class8.field70 - 7);
                var6.field8518 = var6.field8518 * arg3 / (16 << class8.field70 - 7);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILuda;)V")
    public final void method44(int arg0, int arg1, class412 arg2) {
        ++field77;
        if (arg1 != -1) {
            this.method52(-53);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public static void method45(boolean arg0) {
        field92 = null;
        if (arg0) {
            method43(-109, -73, 94, -15);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BZ)V")
    public final void method46(byte arg0, boolean arg1) {
        ++field80;
        if (arg0 != -61) {
            this.field81 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lap;)V")
    public class9(class435 arg0) {
        super(arg0);
        if (!super.field141.field5949) {
            this.field81 = false;
        } else {
            this.field95 = class567.method3204(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 7758, super.field141);
            this.field91 = class567.method3204(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 7758, super.field141);
            this.field82 = class567.method3204(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 7758, super.field141);
            this.field90 = class567.method3204(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 7758, super.field141);
            this.field81 = this.field82 != null & this.field95 != null & this.field91 != null & this.field90 != null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([S[Ljava/lang/String;B)V")
    public static final void method47(short[] arg0, String[] arg1, byte arg2) {
        if (arg2 != -57) {
            method43(39, 4, -2, 46);
        }
        ++field76;
        class663.method3724(false, arg1.length + -1, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method48(byte arg0) {
        if (this.field85) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field85 = false;
        }
        int var2 = -94 / ((arg0 - -29) / 51);
        ++field86;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final void method49(int arg0) {
        ++field83;
        class221.field2785[3] = (float) super.field141.field6045;
        OpenGL.glTexGenfv(8192, 9474, class221.field2785, 0);
        if (!this.field79) {
            OpenGL.glBindProgramARB(34336, super.field141.field6045 == Integer.MAX_VALUE ? this.field95.field8337 : this.field82.field8337);
        } else {
            OpenGL.glBindProgramARB(34336, super.field141.field6045 != Integer.MAX_VALUE ? this.field90.field8337 : this.field91.field8337);
        }
        OpenGL.glEnable(arg0);
        this.field85 = true;
        this.method51((byte) 125);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZB)V")
    public final void method50(boolean arg0, byte arg1) {
        if (arg1 != 42) {
            field87 = -2.4896886F;
        }
        this.field79 = arg0;
        ++field88;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public final void method51(byte arg0) {
        if (arg0 >= 122) {
            if (this.field85) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field141.field6042 + -1280), (float) (super.field141.field6042 + -768), 1.0F / (float) super.field141.field6043, (float) super.field141.field6019 / 255.0F);
            }
            ++field78;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Z")
    public final boolean method52(int arg0) {
        if (arg0 != 12733) {
            method43(-71, 17, 118, 28);
        }
        ++field84;
        return this.field81;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method53(int arg0, long arg1) {
        ++field89;
        if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                if (arg0 != 34820) {
                    method47((short[]) null, (String[]) null, (byte) -116);
                }
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class255.field3268[(int) (-(arg1 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class8 extends class592 {

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lmt;")
    private class420 field79;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Lmt;")
    private class420 field83;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lmt;")
    private class420 field78;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lmt;")
    private class420 field76;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Z")
    private boolean field68;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "[Lwaa;")
    public static class160[] field85 = new class160[6];

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Z")
    private boolean field73;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Z")
    private boolean field75;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method27(boolean arg0, byte arg1) {
        if (arg1 >= -67) {
            this.field73 = true;
        }
        ++field81;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V", line = 14)
    public final void method28(byte arg0) {
        if (this.field75) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field8014.field8688 + -1280), (float) (super.field8014.field8688 - 768), 1.0F / (float) super.field8014.field8613, (float) super.field8014.field8634 / 255.0F);
        }
        ++field77;
        if (arg0 <= 60) {
            this.method33(false, 101, -7);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 27)
    public final void method29(int arg0) {
        if (this.field75) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field75 = false;
        }
        if (arg0 != -1640) {
            this.method29(13);
        }
        ++field80;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)Z", line = 46)
    public final boolean method30(byte arg0) {
        if (arg0 >= -90) {
            this.method33(false, 34, 7);
        }
        ++field72;
        return this.field68;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 62)
    public static void method31(int arg0) {
        field85 = null;
        if (arg0 != -4) {
            field85 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V", line = 73)
    public final void method32(int arg0, boolean arg1) {
        if (arg0 != -1) {
            this.field78 = null;
        }
        ++field82;
        this.field73 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZII)V", line = 86)
    public final void method33(boolean arg0, int arg1, int arg2) {
        ++field69;
        if (arg0) {
            this.method34(21);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 99)
    public final void method34(int arg0) {
        ++field71;
        class611.field8256[3] = (float) super.field8014.field8600;
        if (arg0 != 317) {
            this.field73 = false;
        }
        OpenGL.glTexGenfv(8192, 9474, class611.field8256, 0);
        if (this.field73) {
            OpenGL.glBindProgramARB(34336, ~super.field8014.field8600 == Integer.MIN_VALUE ? this.field83.field5439 : this.field76.field5439);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field8014.field8600 == Integer.MIN_VALUE ? this.field79.field5439 : this.field78.field5439);
        }
        OpenGL.glEnable(34336);
        this.field75 = true;
        this.method28((byte) 89);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILgq;)V", line = 125)
    public final void method35(int arg0, int arg1, class710 arg2) {
        ++field70;
        if (arg1 != 458752) {
            this.field83 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIB)V", line = 136)
    public static final void method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 <= 86) {
            field85 = null;
        }
        ++field84;
        if (~arg6 <= -2 && ~arg4 <= -2 && class611.field8258 + -2 >= arg6 && ~arg4 >= ~(class656.field9155 + -2)) {
            int var9 = arg7;
            if (~arg7 > -4 && class589.method3215(arg6, (byte) -52, arg4)) {
                var9 = arg7 + 1;
            }
            if (!class260.field3509.method1571(class364.field4697, -23572) && !class133.method969(var9, class517.field6768, 99, arg4, arg6)) {
                return;
            }
            if (class483.field6438 == null) {
                return;
            }
            class568.field7424.method745(-2, arg0, class520.field6799, arg6, arg4, class703.field9806[arg7], arg7);
            if (~arg2 <= -1) {
                boolean var10 = class260.field3509.field1267;
                class260.field3509.field1267 = true;
                class568.field7424.method746(arg6, var9, arg4, arg7, 123, class703.field9806[arg7], arg3, arg1, arg2, arg5, class520.field6799);
                class260.field3509.field1267 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lji;)V", line = 176)
    public class8(class622 arg0) {
        super(arg0);
        if (super.field8014.field8700) {
            this.field79 = class72.method578(super.field8014, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 0);
            this.field83 = class72.method578(super.field8014, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, 0);
            this.field78 = class72.method578(super.field8014, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 0);
            this.field76 = class72.method578(super.field8014, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, 0);
            this.field68 = this.field83 != null & this.field79 != null & this.field78 != null & this.field76 != null;
        } else {
            this.field68 = false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhga;", line = 196)
    public static final class172 method37(Throwable arg0, String arg1) {
        ++field74;
        class172 var2;
        if (arg0 instanceof class172) {
            var2 = (class172) arg0;
            var2.field2126 = var2.field2126 + ' ' + arg1;
        } else {
            var2 = new class172(arg0, arg1);
        }
        return var2;
    }
}

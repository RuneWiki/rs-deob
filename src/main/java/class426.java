import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class426 extends class190 {

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lrv;")
    private class284 field6234;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lrv;")
    private class284 field6224;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lrv;")
    private class284 field6230;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lrv;")
    private class284 field6233;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
    private boolean field6223;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Liu;")
    public static class517 field6226 = new class517(43, 7);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Z")
    private boolean field6221;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Z")
    private boolean field6225;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public final void method926(byte arg0) {
        if (arg0 > -102) {
            this.method926((byte) 92);
        }
        if (this.field6221) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6221 = false;
        }
        ++field6218;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public final void method2546(int arg0) {
        if (arg0 > 70) {
            ++field6229;
            if (this.field6221) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field2722.field1172 + -1280), (float) (super.field2722.field1172 - 768), 1.0F / (float) super.field2722.field1219, (float) super.field2722.field1261 / 255.0F);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljj;)V")
    public class426(class66 arg0) {
        super(arg0);
        if (super.field2722.field1263) {
            this.field6234 = class169.method1170(34336, super.field2722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -1);
            this.field6224 = class169.method1170(34336, super.field2722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -1);
            this.field6230 = class169.method1170(34336, super.field2722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -1);
            this.field6233 = class169.method1170(34336, super.field2722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -1);
            this.field6223 = this.field6230 != null & this.field6234 != null & this.field6224 != null & this.field6233 != null;
        } else {
            this.field6223 = false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
    public static final void method2547(byte arg0, int arg1) {
        ++field6231;
        if (arg0 != 4) {
            method2547((byte) -46, 43);
        }
        class443.field6475 = new int[arg1];
        class78.field1414 = new int[arg1];
        class321.field4652 = new int[arg1];
        class612.field8693 = new int[arg1];
        class493.field6923 = new int[arg1];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    public final void method921(boolean arg0, int arg1) {
        if (arg1 != 25747) {
            this.method925(64, -103, 60);
        }
        ++field6235;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    public final void method925(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field6221 = false;
        }
        ++field6227;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z")
    public final boolean method928(int arg0) {
        ++field6220;
        int var2 = 78 % ((arg0 - -7) / 57);
        return this.field6223;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public final void method2548(int arg0) {
        ++field6232;
        class512.field7093[3] = (float) super.field2722.field1189;
        OpenGL.glTexGenfv(8192, 9474, class512.field7093, arg0);
        if (this.field6225) {
            OpenGL.glBindProgramARB(34336, ~super.field2722.field1189 != Integer.MIN_VALUE ? this.field6233.field4140 : this.field6224.field4140);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field2722.field1189 == Integer.MIN_VALUE ? this.field6234.field4140 : this.field6230.field4140);
        }
        OpenGL.glEnable(34336);
        this.field6221 = true;
        this.method2546(96);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZB)V")
    public final void method919(boolean arg0, byte arg1) {
        int var3 = -5 % ((-55 - arg1) / 47);
        ++field6228;
        this.field6225 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static void method2549(int arg0) {
        field6226 = null;
        if (arg0 < 51) {
            method2547((byte) -90, 64);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILaba;I)V")
    public final void method927(int arg0, class222 arg1, int arg2) {
        if (arg2 != 20731) {
            this.method2548(-6);
        }
        ++field6222;
    }
}

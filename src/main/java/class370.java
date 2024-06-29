import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class370 extends class457 {

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lkm;")
    private class236 field5407;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Lkm;")
    private class236 field5409;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lkm;")
    private class236 field5404;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Lkm;")
    private class236 field5419;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Z")
    private boolean field5412;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Z")
    private boolean field5408;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Z")
    private boolean field5411;

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lef;)V", line = 4)
    public class370(class338 arg0) {
        super(arg0);
        if (super.field6706.field4821) {
            this.field5407 = class359.method2150("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 22908, 34336, super.field6706);
            this.field5409 = class359.method2150("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 22908, 34336, super.field6706);
            this.field5404 = class359.method2150("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 22908, 34336, super.field6706);
            this.field5419 = class359.method2150("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 22908, 34336, super.field6706);
            this.field5412 = this.field5407 != null & this.field5409 != null & this.field5404 != null & this.field5419 != null;
        } else {
            this.field5412 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 22)
    public final void method2221(int arg0) {
        ++field5410;
        class199.field2821[3] = (float) super.field6706.field4882;
        OpenGL.glTexGenfv(8192, 9474, class199.field2821, 0);
        if (arg0 == Integer.MAX_VALUE) {
            if (!this.field5408) {
                OpenGL.glBindProgramARB(34336, super.field6706.field4882 != Integer.MAX_VALUE ? this.field5404.field3344 : this.field5407.field3344);
            } else {
                OpenGL.glBindProgramARB(34336, super.field6706.field4882 != Integer.MAX_VALUE ? this.field5419.field3344 : this.field5409.field3344);
            }
            OpenGL.glEnable(34336);
            this.field5411 = true;
            this.method2224(-127);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZB)V", line = 47)
    public final void method435(boolean arg0, byte arg1) {
        ++field5413;
        if (arg1 <= 32) {
            this.field5412 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILem;)V", line = 57)
    public static final void method2222(int arg0, class150 arg1) {
        if (arg0 != 0) {
            method2222(51, (class150) null);
        }
        ++field5417;
        if (~class264.field3653 == ~arg1.field2270) {
            class463.field6801[arg1.field2317] = true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)V", line = 78)
    public static final void method2223(boolean arg0, int arg1) {
        class520.field7705 = 0;
        ++field5405;
        class225.field3203 = 0;
        class374.method2238((byte) 106);
        class201.method1254(arg0, 123);
        class117.method831(-3732);
        for (int var2 = 0; ~class520.field7705 < ~var2; ++var2) {
            int var4 = class138.field1960[var2];
            if (~class441.field6516 != ~class378.field5533[var4].field1027) {
                if (class378.field5533[var4].field7387.method643((byte) 115)) {
                    class347.method2052(class378.field5533[var4], (byte) 88);
                }
                class378.field5533[var4].method2939(62, (class79) null);
                class378.field5533[var4] = null;
            }
        }
        if (arg1 <= 6) {
            method2223(true, 80);
        }
        if (class422.field6187 != class179.field2631.field5719) {
            throw new RuntimeException("gnp1 pos:" + class179.field2631.field5719 + " psize:" + class422.field6187);
        } else {
            for (int var3 = 0; ~var3 > ~class275.field3772; ++var3) {
                if (class378.field5533[class65.field899[var3]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class275.field3772);
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V", line = 131)
    public final void method2224(int arg0) {
        ++field5416;
        if (this.field5411) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field6706.field4768 + -1280), (float) (super.field6706.field4768 - 768), 1.0F / (float) super.field6706.field4820, (float) super.field6706.field4786 / 255.0F);
        }
        if (arg0 > -123) {
            field5403 = 99;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Z", line = 145)
    public final boolean method429(int arg0) {
        if (arg0 != 0) {
            this.field5419 = null;
        }
        ++field5406;
        return this.field5412;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 157)
    public final void method433(byte arg0) {
        if (arg0 != 8) {
            this.method433((byte) 57);
        }
        if (this.field5411) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5411 = false;
        }
        ++field5414;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lmk;II)V", line = 177)
    public final void method431(class40 arg0, int arg1, int arg2) {
        ++field5415;
        if (arg1 != 384) {
            this.method434(24, true);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V", line = 191)
    public final void method434(int arg0, boolean arg1) {
        ++field5418;
        if (arg0 != 28037) {
            method2222(-64, (class150) null);
        }
        this.field5408 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)V", line = 206)
    public final void method430(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method434(-109, false);
        }
        ++field5420;
    }
}

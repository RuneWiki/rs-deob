import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class501 extends class648 {

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "Z")
    private boolean field6992;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lmv;")
    private class313 field6980;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Lmv;")
    private class313 field6982;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lmv;")
    private class313 field6986;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lmv;")
    private class313 field6985;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
    public static int[] field6974 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "[[S")
    public static short[][] field6989 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Z")
    private boolean field6977;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Z")
    private boolean field6990;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    public static final void method2901(int arg0, int arg1) {
        ++field6979;
        if (class377.method2232(121, arg0)) {
            int var2 = 2 / ((83 - arg1) / 42);
            class114[] var3 = class618.field8850[arg0];
            for (int var4 = 0; var4 < var3.length; ++var4) {
                class114 var5 = var3[var4];
                if (var5 != null) {
                    var5.field1838 = 0;
                    var5.field1891 = 1;
                    var5.field1804 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        if (arg0 != 17729) {
            method2901(-58, -33);
        }
        this.field6990 = arg1;
        ++field6981;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lgi;)V")
    public class501(class583 arg0) {
        super(arg0);
        if (!super.field9395.field8301) {
            this.field6992 = false;
        } else {
            this.field6980 = class568.method3230(0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, super.field9395);
            this.field6982 = class568.method3230(0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, super.field9395);
            this.field6986 = class568.method3230(0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, super.field9395);
            this.field6985 = class568.method3230(0, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, super.field9395);
            this.field6992 = this.field6985 != null & this.field6986 != null & this.field6982 != null & this.field6980 != null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(JJ)J")
    public static long method2902(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        if (arg0 >= -111) {
            method2907((byte) 84, -89);
        }
        ++field6988;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static final void method2903(byte arg0) {
        if (arg0 < 19) {
            field6974 = null;
        }
        ++field6976;
        class32 var1 = (class32) class623.field8998.method456((byte) -83);
        boolean var2 = class137.field2159 != null || ~class557.field7711 < -1;
        if (var2) {
            class147.field2265 = 1;
        }
        if (class304.field4149 && class316.field4245.method2691(81, 19521) && class210.field2958 > 2) {
            if (var2) {
                class296.field4056 = (class442) class448.field6352.field892.field2519.field2519;
            } else {
                class402.method2403((byte) 60, var1.method328((byte) -105), var1.method324(-5), (class442) class448.field6352.field892.field2519.field2519);
            }
        } else if (var2) {
            class296.field4056 = (class442) class448.field6352.field892.field2519;
        } else {
            class402.method2403((byte) 60, var1.method328((byte) -117), var1.method324(-5), (class442) class448.field6352.field892.field2519);
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
    public final void method2904(int arg0) {
        if (this.field6977) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field9395.field8323 + -1280), (float) (super.field9395.field8323 - 768), 1.0F / (float) super.field9395.field8255, (float) super.field9395.field8232 / 255.0F);
        }
        if (arg0 != -1280) {
            this.field6980 = null;
        }
        ++field6983;
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
    public final void method2905(int arg0) {
        class474.field6673[3] = (float) super.field9395.field8315;
        if (arg0 != 23697) {
            this.method946(-10);
        }
        ++field6987;
        OpenGL.glTexGenfv(8192, 9474, class474.field6673, 0);
        if (this.field6990) {
            OpenGL.glBindProgramARB(34336, super.field9395.field8315 != Integer.MAX_VALUE ? this.field6985.field4220 : this.field6982.field4220);
        } else {
            OpenGL.glBindProgramARB(34336, super.field9395.field8315 == Integer.MAX_VALUE ? this.field6980.field4220 : this.field6986.field4220);
        }
        OpenGL.glEnable(34336);
        this.field6977 = true;
        this.method2904(-1280);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        if (this.field6977) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6977 = false;
        }
        ++field6984;
        if (arg0 != 1) {
            this.field6990 = false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        if (arg0 <= 122) {
            this.field6990 = true;
        }
        ++field6991;
        return this.field6992;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V")
    public static void method2906(int arg0) {
        field6989 = null;
        field6974 = null;
        int var1 = -94 % ((arg0 - -28) / 42);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Z")
    public static final boolean method2907(byte arg0, int arg1) {
        ++field6975;
        if (arg0 <= 78) {
            method2901(-81, 107);
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        ++field6978;
        int var4 = -120 / ((arg2 - 30) / 56);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        if (arg0 != -30) {
            this.field6986 = null;
        }
        ++field6993;
    }
}

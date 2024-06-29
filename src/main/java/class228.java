import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class228 extends class261 {

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Lbh;")
    private class304 field3976;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "Lbh;")
    private class304 field3978;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "Lbh;")
    private class304 field3993;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "Lbh;")
    private class304 field3979;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "Z")
    private boolean field3980;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Ljc;")
    public static class356 field3985 = new class356(10, 2);

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "Z")
    public static boolean field3990 = false;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Z")
    private boolean field3975;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "Z")
    private boolean field3977;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method1020(boolean arg0, byte arg1) {
        this.field3975 = arg0;
        ++field3987;
        if (arg1 <= 23) {
            this.method1586(108);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILkk;)V", line = 16)
    public final void method1024(int arg0, int arg1, class179 arg2) {
        ++field3988;
        int var4 = 31 / ((arg1 - 21) / 36);
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V", line = 27)
    public static final void method1583(int arg0) {
        ++field3991;
        if (!class172.field2763) {
            int var1 = 69 % ((arg0 - 66) / 36);
            class299.field4804 = true;
            class172.field2763 = true;
            if (!class510.field7403.field5116) {
                class100.field1663 += (-24.0F - class100.field1663) / 2.0F;
            } else {
                class88.field1483 = (float) ((int) class88.field1483 - 65 & -128);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z", line = 52)
    public final boolean method1026(int arg0) {
        if (arg0 < 69) {
            field3985 = null;
        }
        ++field3986;
        return this.field3980;
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V", line = 65)
    public final void method1584(int arg0) {
        int var2 = -37 % ((arg0 - 52) / 44);
        ++field3983;
        if (this.field3977) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field4358.field3626 + -1280), (float) (super.field4358.field3626 + -768), 1.0F / (float) super.field4358.field3725, (float) super.field4358.field3730 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)V", line = 79)
    public static void method1585(int arg0) {
        field3985 = null;
        if (arg0 != 34336) {
            field3990 = false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V", line = 93)
    public final void method1022(int arg0, boolean arg1) {
        ++field3981;
        int var3 = -24 / ((arg0 - 87) / 37);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lih;)V", line = 105)
    public class228(class214 arg0) {
        super(arg0);
        if (super.field4358.field3684) {
            this.field3976 = class263.method1752(super.field4358, 19652, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3978 = class263.method1752(super.field4358, 19652, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field3993 = class263.method1752(super.field4358, 19652, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3979 = class263.method1752(super.field4358, 19652, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field3980 = this.field3979 != null & this.field3993 != null & this.field3976 != null & this.field3978 != null;
        } else {
            this.field3980 = false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V", line = 123)
    public final void method1021(int arg0, int arg1, int arg2) {
        ++field3984;
        int var4 = 83 / ((82 - arg1) / 41);
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V", line = 136)
    public final void method1023(int arg0) {
        ++field3982;
        if (this.field3977) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3977 = false;
        }
        if (arg0 != 5000) {
            field3990 = false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "(I)V", line = 161)
    public final void method1586(int arg0) {
        if (arg0 != -16998) {
            field3992 = -97;
        }
        ++field3989;
        class207.field3265[3] = (float) super.field4358.field3688;
        OpenGL.glTexGenfv(8192, 9474, class207.field3265, 0);
        if (this.field3975) {
            OpenGL.glBindProgramARB(34336, ~super.field4358.field3688 != Integer.MIN_VALUE ? this.field3979.field4864 : this.field3978.field4864);
        } else {
            OpenGL.glBindProgramARB(34336, super.field4358.field3688 != Integer.MAX_VALUE ? this.field3993.field4864 : this.field3976.field4864);
        }
        OpenGL.glEnable(34336);
        this.field3977 = true;
        this.method1584(-118);
    }
}

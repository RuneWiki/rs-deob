import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class482 extends class159 {

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
    private boolean field6718 = false;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "Z")
    private boolean field6729;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "Lam;")
    private class56 field6730;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Lam;")
    private class56 field6721;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "Lam;")
    private class56 field6733;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "Lam;")
    private class56 field6731;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Lfba;")
    private class350 field6715;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Z")
    private boolean field6719;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Z")
    private boolean field6722;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V", line = 3)
    public final void method369(byte arg0) {
        if (this.field6722) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6722 = false;
        }
        ++field6720;
        super.field2221.method3738((byte) -63, 1);
        super.field2221.method3681((class559) null, 0);
        if (arg0 > -59) {
            this.field6718 = true;
        }
        super.field2221.method3729((byte) 95, 8448, 8448);
        super.field2221.method3718(5890, 111, 768, 0);
        super.field2221.method3718(34166, 119, 770, 2);
        super.field2221.method3715(5890, 770, 0, (byte) -86);
        super.field2221.method3738((byte) -63, 0);
        if (this.field6718) {
            super.field2221.method3718(5890, 122, 768, 0);
            super.field2221.method3715(5890, 770, 0, (byte) -87);
            this.field6718 = false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 36)
    public static final void method2935(int arg0) {
        class224.field3014.method128((byte) -123);
        ++field6723;
        class103.field1419.method1551(108);
        class516.field7210.method2175((byte) 46);
        class570.field7875.setBackground(Color.black);
        if (arg0 == 27995) {
            class10.field88 = -1;
            class224.field3014 = class235.method1564(9, class570.field7875);
            class103.field1419 = class342.method2179((byte) 92, true, class570.field7875);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZII)V", line = 53)
    public final void method367(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field6727;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z", line = 69)
    public final boolean method372(boolean arg0) {
        ++field6724;
        if (!arg0) {
            this.field6719 = false;
        }
        return this.field6729;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lha;I)V", line = 80)
    public static final void method2936(class548 arg0, int arg1) {
        ++field6732;
        int var2 = 15 / ((-63 - arg1) / 60);
        if (~class570.field7877 != ~class388.field5601.field4408) {
            if (class137.field1948 != null) {
                if (class170.method1091(4, class388.field5601.field4408, arg0)) {
                    class570.field7877 = class388.field5601.field4408;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BZ)V", line = 100)
    public final void method370(byte arg0, boolean arg1) {
        if (arg0 <= 88) {
            this.method373(false, (byte) -18);
        }
        ++field6726;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lwu;II)V", line = 110)
    public final void method368(class559 arg0, int arg1, int arg2) {
        if (arg1 == 26264) {
            ++field6716;
            if (arg0 == null) {
                if (!this.field6718) {
                    super.field2221.method3681(super.field2221.field9082, 0);
                    super.field2221.method3720(-26014, 1);
                    super.field2221.method3718(34168, arg1 ^ 26352, 768, 0);
                    super.field2221.method3715(34168, 770, 0, (byte) -103);
                    this.field6718 = true;
                    return;
                }
            } else {
                if (this.field6718) {
                    super.field2221.method3718(5890, 124, 768, 0);
                    super.field2221.method3715(5890, 770, 0, (byte) -68);
                    this.field6718 = false;
                }
                super.field2221.method3681(arg0, 0);
                super.field2221.method3720(arg1 + -52278, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V", line = 148)
    public final void method2937(boolean arg0) {
        ++field6717;
        if (this.field6722) {
            int var2 = super.field2221.method1504();
            int var3 = super.field2221.method1426();
            float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2221.field9084, (float) super.field2221.field9049 / 255.0F);
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3752(super.field2221.field9069, (byte) -66);
            super.field2221.method3738((byte) -63, 0);
        }
        if (arg0) {
            this.method367(false, 6, -31);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ldw;)V", line = 180)
    public class482(class664 arg0) {
        super(arg0);
        if (!super.field2221.field9123) {
            this.field6729 = false;
        } else {
            this.field6730 = class644.method3597(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field2221, 101);
            this.field6721 = class644.method3597(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field2221, 105);
            this.field6733 = class644.method3597(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field2221, 127);
            this.field6731 = class644.method3597(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field2221, 99);
            if (this.field6731 != null & this.field6730 != null & this.field6721 != null & this.field6733 != null) {
                this.field6715 = new class350(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field6715.method2230(3314, false, false);
                this.field6729 = true;
            } else {
                this.field6729 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(Z)V", line = 209)
    public final void method2938(boolean arg0) {
        ++field6728;
        class480 var2 = super.field2221.field9042;
        if (this.field6719) {
            OpenGL.glBindProgramARB(34336, ~super.field2221.field9122 == Integer.MIN_VALUE ? this.field6721.field789 : this.field6731.field789);
        } else {
            OpenGL.glBindProgramARB(34336, super.field2221.field9122 == Integer.MAX_VALUE ? this.field6730.field789 : this.field6733.field789);
        }
        var2.method2925(0.0F, 0.0F, 1, (float) super.field2221.field9122, -1.0F, class333.field4711);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class333.field4711[0], class333.field4711[1], class333.field4711[2], class333.field4711[3]);
        OpenGL.glEnable(34336);
        this.field6722 = arg0;
        this.method2937(false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZB)V", line = 236)
    public final void method373(boolean arg0, byte arg1) {
        ++field6725;
        this.field6719 = arg0;
        super.field2221.method3738((byte) -63, 1);
        if (arg1 >= -109) {
            method2935(-74);
        }
        super.field2221.method3681(this.field6715, 0);
        super.field2221.method3729((byte) 95, 34165, 7681);
        super.field2221.method3718(34166, 105, 768, 0);
        super.field2221.method3718(5890, 122, 770, 2);
        super.field2221.method3715(34168, 770, 0, (byte) -87);
        super.field2221.method3738((byte) -63, 0);
        this.method2938(true);
    }
}

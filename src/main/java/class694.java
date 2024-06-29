import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class694 extends class312 {

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lkk;")
    private class175 field9771;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lkk;")
    private class175 field9768;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Lkk;")
    private class175 field9779;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Lkk;")
    private class175 field9786;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
    private boolean field9787;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "Ldb;")
    private class296 field9789;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field9774 = 0;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field9773 = 0;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lqfa;")
    public static class85 field9766 = new class85(48, 3);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Lfj;")
    public static class610 field9782;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Z")
    private boolean field9775;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Z")
    private boolean field9784;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        ++field9767;
        int var2 = -15 / ((25 - arg0) / 57);
        return this.field9787;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public final void method3883(byte arg0) {
        ++field9778;
        int var2 = 34 % ((-50 - arg0) / 41);
        if (this.field9784) {
            int var3 = super.field4632.method86();
            int var4 = super.field4632.method66();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 + -((float) (-var4 + var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var6, var5, 1.0F / (float) super.field4632.field285, (float) super.field4632.field266 / 255.0F);
            super.field4632.method125(1, 86);
            super.field4632.method22(super.field4632.field256, false);
            super.field4632.method125(0, 101);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        ++field9776;
        if (arg1 <= 102) {
            field9788 = 24;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLom;)V")
    public static final void method3884(boolean arg0, class344 arg1) {
        class138.field2456 = arg1;
        ++field9777;
        if (!arg0) {
            method3887(-57, -94, -93, 125);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
    public final void method3885(byte arg0) {
        ++field9790;
        class422 var2 = super.field4632.field248;
        int var3 = 86 / ((73 - arg0) / 50);
        if (this.field9775) {
            OpenGL.glBindProgramARB(34336, super.field4632.field298 == Integer.MAX_VALUE ? this.field9768.field2881 : this.field9786.field2881);
        } else {
            OpenGL.glBindProgramARB(34336, super.field4632.field298 != Integer.MAX_VALUE ? this.field9779.field2881 : this.field9771.field2881);
        }
        var2.method2574(class224.field3359, 0.0F, 0.0F, (float) super.field4632.field298, -1.0F, 2);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class224.field3359[0], class224.field3359[1], class224.field3359[2], class224.field3359[3]);
        OpenGL.glEnable(34336);
        this.field9784 = true;
        this.method3883((byte) 118);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static final void method3886(boolean arg0) {
        class412.method2511();
        if (!arg0) {
            field9774 = -56;
        }
        ++field9780;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        this.field9775 = arg0;
        ++field9783;
        super.field4632.method125(1, -88);
        super.field4632.method5(3845, this.field9789);
        super.field4632.method148(7681, 34165, (byte) -111);
        super.field4632.method10(0, 768, 34166, 34192);
        if (arg1) {
            this.method238(-70, -70, (byte) -124);
        }
        super.field4632.method10(2, 770, 5890, 34192);
        super.field4632.method135((byte) -104, 34168, 0, 770);
        super.field4632.method125(0, -26);
        this.method3885((byte) 124);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        ++field9772;
        int var4 = 59 / ((arg2 - 74) / 45);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
    public static final void method3887(int arg0, int arg1, int arg2, int arg3) {
        class517.field7301 = new byte[arg3][arg0][arg1];
        if (arg2 < -76) {
            ++field9770;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public static void method3888(boolean arg0) {
        field9766 = null;
        if (arg0) {
            field9782 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lus;)V")
    public class694(class1 arg0) {
        super(arg0);
        if (super.field4632.field263) {
            this.field9771 = class520.method3063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field4632, 34379, 34336);
            this.field9768 = class520.method3063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field4632, 34379, 34336);
            this.field9779 = class520.method3063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field4632, 34379, 34336);
            this.field9786 = class520.method3063("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field4632, 34379, 34336);
            if (!(this.field9786 != null & this.field9771 != null & this.field9768 != null & this.field9779 != null)) {
                this.field9787 = false;
            } else {
                this.field9789 = new class296(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field9789.method1971(false, -123, false);
                this.field9787 = true;
            }
        } else {
            this.field9787 = false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        if (this.field9784) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field9784 = false;
        }
        ++field9769;
        super.field4632.method125(1, arg0 + 9);
        super.field4632.method5(3845, (class487) null);
        super.field4632.method148(8448, 8448, (byte) -104);
        super.field4632.method10(0, 768, 5890, 34192);
        super.field4632.method10(2, 770, 34166, 34192);
        super.field4632.method135((byte) -93, 5890, 0, 770);
        super.field4632.method125(0, arg0 + 37);
        if (arg0 != -123) {
            this.method3885((byte) 30);
        }
        super.field4632.method10(0, 768, 5890, 34192);
        super.field4632.method135((byte) -73, 5890, 0, 770);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        if (arg2 == null) {
            super.field4632.method5(3845, super.field4632.field255);
            super.field4632.method133(1, (byte) -124);
            super.field4632.method10(0, 768, 34168, 34192);
            super.field4632.method135((byte) 62, 34168, 0, 770);
        } else {
            super.field4632.method5(3845, arg2);
            super.field4632.method133(arg0, (byte) -126);
        }
        ++field9781;
        if (arg1 > -78) {
            this.method3885((byte) -114);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
    public static final void method3889(int arg0, boolean arg1) {
        ++field9785;
        class418.method2539(false);
        if (class156.method1205(-11, class199.field3098)) {
            if (arg0 == 10432) {
                ++class6.field500;
                if (~class6.field500 <= -51 || arg1) {
                    class6.field500 = 0;
                    if (!class310.field4624 && class165.field2755 != null) {
                        ++class208.field3183;
                        class275 var2 = class185.method1355(0, class392.field5746, class395.field5772);
                        class140.method1141(var2, arg0 + 8889);
                        try {
                            class469.method2804(true);
                        } catch (IOException var3) {
                            class310.field4624 = true;
                        }
                    }
                    class418.method2539(false);
                }
            }
        }
    }
}

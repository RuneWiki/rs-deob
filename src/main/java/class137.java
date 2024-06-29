import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class137 extends class193 {

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Z")
    private boolean field1756;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lti;")
    private class306 field1759;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lti;")
    private class306 field1764;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lti;")
    private class306 field1761;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lti;")
    private class306 field1768;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[[Z")
    public static boolean[][] field1760 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
    private boolean field1766;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Z")
    private boolean field1769;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public final void method938(byte arg0) {
        ++field1770;
        if (arg0 >= 84) {
            if (this.field1769) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field2498.field5528 + -1280), (float) (super.field2498.field5528 + -768), 1.0F / (float) super.field2498.field5601, (float) super.field2498.field5620 / 255.0F);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Z")
    public final boolean method93(boolean arg0) {
        if (arg0) {
            this.field1766 = true;
        }
        ++field1762;
        return this.field1756;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
    public final void method939(byte arg0) {
        if (arg0 >= -84) {
            method941(true);
        }
        ++field1757;
        class478.field7005[3] = (float) super.field2498.field5617;
        OpenGL.glTexGenfv(8192, 9474, class478.field7005, 0);
        if (!this.field1766) {
            OpenGL.glBindProgramARB(34336, super.field2498.field5617 != Integer.MAX_VALUE ? this.field1761.field3907 : this.field1759.field3907);
        } else {
            OpenGL.glBindProgramARB(34336, super.field2498.field5617 == Integer.MAX_VALUE ? this.field1764.field3907 : this.field1768.field3907);
        }
        OpenGL.glEnable(34336);
        this.field1769 = true;
        this.method938((byte) 109);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(ZZ)V")
    public final void method95(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method93(true);
        }
        ++field1758;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        if (this.field1769) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1769 = false;
        }
        ++field1765;
        if (arg0 > -56) {
            field1760 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)Z")
    public static final boolean method940(byte arg0) {
        ++field1772;
        if (arg0 < 14) {
            return true;
        } else {
            try {
                return class264.method1572((byte) -85);
            } catch (IOException var4) {
                class253.method1525(-1860040276);
                return true;
            } catch (Exception var5) {
                String var2 = "T2 - " + (class85.field1068 != null ? class85.field1068.method2989(true) : -1) + "," + (class301.field3870 == null ? -1 : class301.field3870.method2989(true)) + "," + (class525.field7765 == null ? -1 : class525.field7765.method2989(true)) + " - " + class312.field3986 + "," + (class23.field336.field4944[0] + class441.field6317) + "," + (class23.field336.field4936[0] + class320.field4064) + " - ";
                for (int var3 = 0; ~class312.field3986 < ~var3 && var3 < 50; ++var3) {
                    var2 = var2 + class513.field7443.field6618[var3] + ",";
                }
                class461.method2719(var5, var2, 1);
                class461.method2721((byte) -76, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZZ)V")
    public final void method94(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field1768 = null;
        }
        this.field1766 = arg1;
        ++field1771;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
    public static void method941(boolean arg0) {
        field1760 = null;
        if (arg0) {
            method942(-52);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsq;II)V")
    public final void method97(class119 arg0, int arg1, int arg2) {
        if (arg2 == 36) {
            ++field1763;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lug;)V")
    public class137(class395 arg0) {
        super(arg0);
        if (!super.field2498.field5616) {
            this.field1756 = false;
        } else {
            this.field1759 = class25.method204("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, super.field2498, -115);
            this.field1764 = class25.method204("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, super.field2498, -81);
            this.field1761 = class25.method204("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, super.field2498, -104);
            this.field1768 = class25.method204("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, super.field2498, -108);
            this.field1756 = this.field1768 != null & this.field1761 != null & this.field1759 != null & this.field1764 != null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)V")
    public final void method99(int arg0, int arg1, boolean arg2) {
        ++field1767;
        if (arg2) {
            this.field1768 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Llf;")
    public static final class159 method942(int arg0) {
        ++field1755;
        int var1 = -51 / ((-61 - arg0) / 63);
        return class241.field3089;
    }
}

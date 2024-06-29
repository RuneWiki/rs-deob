import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class200 extends class675 {

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Z")
    private boolean field2928 = false;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
    private boolean field2927;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Liu;")
    private class602 field2934;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Liu;")
    private class602 field2935;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Liu;")
    private class602 field2924;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Liu;")
    private class602 field2936;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Lho;")
    private class158 field2929;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Ltga;")
    public static class64 field2940 = new class64(16);

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "Lke;")
    public static class622 field2941 = new class622(48, 5);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field2942;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kk", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field2943;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
    private boolean field2930;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Z")
    private boolean field2931;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)V")
    public static final void method1441(byte arg0) {
        ++field2939;
        int var1 = -106 / ((arg0 - -22) / 46);
        if (class27.field395.field8345) {
            class511.field7306 = 96;
        } else {
            try {
                Method var2 = (field2943 != null ? field2943 : (field2943 = method1445("java.lang.Runtime"))).getMethod("maxMemory");
                if (var2 != null) {
                    try {
                        Runtime var3 = Runtime.getRuntime();
                        Long var4 = (Long) var2.invoke(var3, (Object[]) null);
                        class511.field7306 = (int) (var4 / 1048576L) - -1;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public final void method1353(byte arg0) {
        if (arg0 == 52) {
            ++field2925;
            if (this.field2930) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field2930 = false;
            }
            super.field9618.method1825(1, arg0 ^ 90);
            super.field9618.method1840((class599) null, arg0 + 2153);
            super.field9618.method1835(false, 8448, 8448);
            super.field9618.method1842(768, -64, 0, 5890);
            super.field9618.method1842(770, arg0 ^ -97, 2, 34166);
            super.field9618.method1828((byte) -6, 5890, 770, 0);
            super.field9618.method1825(0, arg0 ^ 76);
            if (this.field2928) {
                super.field9618.method1842(768, -114, 0, 5890);
                super.field9618.method1828((byte) -35, 5890, 770, 0);
                this.field2928 = false;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method1442(int arg0) {
        ++field2937;
        class712 var2 = super.field9618.field4199;
        if (!this.field2931) {
            OpenGL.glBindProgramARB(34336, super.field9618.field4269 == Integer.MAX_VALUE ? this.field2934.field8483 : this.field2924.field8483);
        } else {
            OpenGL.glBindProgramARB(34336, super.field9618.field4269 == Integer.MAX_VALUE ? this.field2935.field8483 : this.field2936.field8483);
        }
        var2.method4031(-1.0F, (byte) -23, 0.0F, 0.0F, class671.field9410, (float) super.field9618.field4269);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class671.field9410[0], class671.field9410[1], class671.field9410[arg0], class671.field9410[3]);
        OpenGL.glEnable(34336);
        this.field2930 = true;
        this.method1444(-32708);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
    public final void method1351(int arg0, int arg1, int arg2) {
        if (arg1 != 8865) {
            field2941 = null;
        }
        ++field2926;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lkv;)V")
    public class200(class280 arg0) {
        super(arg0);
        if (!super.field9618.field4298) {
            this.field2927 = false;
        } else {
            this.field2934 = class738.method4135("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 65534, 34336, super.field9618);
            this.field2935 = class738.method4135("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 65534, 34336, super.field9618);
            this.field2924 = class738.method4135("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 65534, 34336, super.field9618);
            this.field2936 = class738.method4135("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 65534, 34336, super.field9618);
            if (this.field2936 != null & this.field2924 != null & this.field2934 != null & this.field2935 != null) {
                this.field2929 = new class158(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field2929.method1252(false, 3314, false);
                this.field2927 = true;
            } else {
                this.field2927 = false;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1443(int arg0) {
        field2941 = null;
        field2940 = null;
        if (arg0 != -1192) {
            field2942 = -116;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
    public final void method1354(boolean arg0, int arg1) {
        this.field2931 = arg0;
        if (arg1 != -24765) {
            this.method1444(18);
        }
        ++field2933;
        super.field9618.method1825(1, arg1 ^ -24779);
        super.field9618.method1840(this.field2929, arg1 ^ -26658);
        super.field9618.method1835(false, 34165, 7681);
        super.field9618.method1842(768, arg1 + 24862, 0, 34166);
        super.field9618.method1842(770, -80, 2, 5890);
        super.field9618.method1828((byte) -100, 34168, 770, 0);
        super.field9618.method1825(0, 110);
        this.method1442(2);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public final void method1444(int arg0) {
        if (this.field2930) {
            int var2 = super.field9618.method425();
            int var3 = super.field9618.method460();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9618.field4272, (float) super.field9618.field4233 / 255.0F);
            super.field9618.method1825(1, -83);
            super.field9618.method1877((byte) -83, super.field9618.field4279);
            super.field9618.method1825(0, 116);
        }
        if (arg0 != -32708) {
            this.field2929 = null;
        }
        ++field2922;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Z")
    public final boolean method1347(byte arg0) {
        if (arg0 <= 105) {
            return false;
        } else {
            ++field2932;
            return this.field2927;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lfia;IZ)V")
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        if (arg0 != null) {
            if (this.field2928) {
                super.field9618.method1842(768, -125, 0, 5890);
                super.field9618.method1828((byte) -58, 5890, 770, 0);
                this.field2928 = false;
            }
            super.field9618.method1840(arg0, 2205);
            super.field9618.method1889(false, arg1);
        } else if (!this.field2928) {
            super.field9618.method1840(super.field9618.field4235, 2205);
            super.field9618.method1889(!arg2, 1);
            super.field9618.method1842(768, -97, 0, 34168);
            super.field9618.method1828((byte) -40, 34168, 770, 0);
            this.field2928 = true;
        }
        ++field2938;
        if (!arg2) {
            this.method1350(true, true);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZZ)V")
    public final void method1350(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field2929 = null;
        }
        ++field2923;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1445(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

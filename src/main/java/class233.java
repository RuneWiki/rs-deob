import jaggl.OpenGL;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class233 extends class165 {

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "Z")
    private boolean field3236 = false;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Lsea;")
    private class282 field3231;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "Lsea;")
    private class282 field3237;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "Lsea;")
    private class282 field3239;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lsea;")
    private class282 field3225;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "Z")
    private boolean field3233;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Lfq;")
    private class204 field3234;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "Lqk;")
    public static class148 field3238 = new class148(68, -1);

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "Lju;")
    public static class102 field3243 = new class102(5, 11);

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "Z")
    public static boolean field3245 = false;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
    private boolean field3232;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "Z")
    private boolean field3244;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 4)
    public static final String method1492(String arg0, int arg1) {
        ++field3246;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; ~var5 < ~var6; ++var6) {
                    arg0 = arg0 + "*";
                }
            }
        }
        if (arg1 < 43) {
            return null;
        } else {
            return var2 == null ? arg0 : var2 + arg0;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V", line = 53)
    public final void method679(byte arg0) {
        if (this.field3244) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3244 = false;
        }
        if (arg0 > -97) {
            this.field3237 = null;
        }
        ++field3227;
        super.field2260.method2196(1, (byte) 89);
        super.field2260.method2154((class396) null, -2);
        super.field2260.method2207(8448, 8448, -25248);
        super.field2260.method2202(390803672, 768, 5890, 0);
        super.field2260.method2202(390803672, 770, 34166, 2);
        super.field2260.method2190(0, 770, true, 5890);
        super.field2260.method2196(0, (byte) 89);
        if (this.field3236) {
            super.field2260.method2202(390803672, 768, 5890, 0);
            super.field2260.method2190(0, 770, true, 5890);
            this.field3236 = false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)V", line = 88)
    public static void method1493(boolean arg0) {
        field3243 = null;
        if (!arg0) {
            method1492((String) null, 52);
        }
        field3238 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lep;)V", line = 104)
    public class233(class371 arg0) {
        super(arg0);
        if (super.field2260.field5054) {
            this.field3231 = class213.method1407(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field2260, 72);
            this.field3237 = class213.method1407(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.field2260, 110);
            this.field3239 = class213.method1407(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field2260, 21);
            this.field3225 = class213.method1407(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.field2260, 22);
            if (!(this.field3225 != null & this.field3237 != null & this.field3231 != null & this.field3239 != null)) {
                this.field3233 = false;
            } else {
                this.field3234 = new class204(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field3234.method1364(false, false, 10242);
                this.field3233 = true;
            }
        } else {
            this.field3233 = false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)V", line = 132)
    public final void method678(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method1494(-24);
        }
        ++field3230;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 144)
    public final void method1494(int arg0) {
        ++field3223;
        class437 var2 = super.field2260.field4983;
        if (!this.field3232) {
            OpenGL.glBindProgramARB(34336, ~super.field2260.field5049 != Integer.MIN_VALUE ? this.field3239.field3742 : this.field3231.field3742);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field2260.field5049 == Integer.MIN_VALUE ? this.field3237.field3742 : this.field3225.field3742);
        }
        var2.method2621(0.0F, -1.0F, (float) arg0, arg0, (float) super.field2260.field5049, class676.field9528);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class676.field9528[0], class676.field9528[1], class676.field9528[2], class676.field9528[3]);
        OpenGL.glEnable(34336);
        this.field3244 = true;
        this.method1496(-30565);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V", line = 170)
    public static final void method1495(byte arg0, Throwable arg1, String arg2) {
        ++field3240;
        int var3 = -68 / ((-25 - arg0) / 52);
        try {
            String var4 = "";
            if (arg1 != null) {
                var4 = class30.method222(arg1, (byte) 104);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var4 = var4 + " | ";
                }
                var4 = var4 + arg2;
            }
            class487.method2855(var4, -1);
            String var5 = class711.method3992(":", var4, "%3a", (byte) -120);
            String var6 = class711.method3992("@", var5, "%40", (byte) 127);
            String var7 = class711.method3992("&", var6, "%26", (byte) -101);
            String var8 = class711.method3992("#", var7, "%23", (byte) -75);
            if (class485.field6558 != null) {
                class436 var9 = class746.field10394.method3584((byte) -126, new URL(class485.field6558.getCodeBase(), "clienterror.ws?c=" + class693.field9694 + "&u=" + (class671.field9428 != null ? class671.field9428 : String.valueOf(class677.field9534)) + "&v1=" + class613.field8724 + "&v2=" + class613.field8723 + "&e=" + var8));
                while (~var9.field5975 == -1) {
                    class740.method4124(1L, 116);
                }
                if (var9.field5975 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field5973;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V", line = 226)
    public final void method1496(int arg0) {
        ++field3228;
        if (arg0 != -30565) {
            this.field3244 = false;
        }
        if (this.field3244) {
            int var2 = super.field2260.method2160();
            int var3 = super.field2260.method2230();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2260.field5089, (float) super.field2260.field5059 / 255.0F);
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2212((byte) -121, super.field2260.field5029);
            super.field2260.method2196(0, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIII)V", line = 253)
    public static final void method1497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= class490.field6592 && ~class116.field1628 <= ~arg6 && ~arg1 <= ~class675.field9512 && ~class395.field5484 <= ~arg4) {
            class200.method1354((byte) -118, arg0, arg2, arg7, arg6, arg4, arg1, arg5);
        } else {
            class667.method3822(arg4, arg7, Integer.MAX_VALUE, arg1, arg0, arg5, arg6, arg2);
        }
        if (arg3 == 11) {
            ++field3224;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBI)V", line = 272)
    public final void method675(int arg0, byte arg1, int arg2) {
        ++field3242;
        if (arg1 < 3) {
            this.method679((byte) -92);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z", line = 282)
    public final boolean method672(byte arg0) {
        if (arg0 < 11) {
            method1497(67, -24, 36, 42, 105, -63, 65, -60);
        }
        ++field3241;
        return this.field3233;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)V", line = 297)
    public final void method673(int arg0, boolean arg1) {
        ++field3226;
        this.field3232 = arg1;
        super.field2260.method2196(1, (byte) 89);
        super.field2260.method2154(this.field3234, -2);
        super.field2260.method2207(34165, 7681, -25248);
        super.field2260.method2202(390803672, 768, 34166, 0);
        super.field2260.method2202(390803672, 770, 5890, 2);
        super.field2260.method2190(0, 770, true, 34168);
        super.field2260.method2196(0, (byte) 89);
        this.method1494(0);
        if (arg0 > -115) {
            field3245 = false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 321)
    public static final String method1498(String arg0, int arg1) {
        ++field3229;
        if (!class66.field910.startsWith("win")) {
            if (!class66.field910.startsWith("linux")) {
                if (class66.field910.startsWith("mac")) {
                    return "lib" + arg0 + ".dylib";
                } else {
                    return arg1 <= 104 ? null : null;
                }
            } else {
                return "lib" + arg0 + ".so";
            }
        } else {
            return arg0 + ".dll";
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZLhl;)V", line = 349)
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        if (arg1) {
            if (arg2 != null) {
                if (this.field3236) {
                    super.field2260.method2202(390803672, 768, 5890, 0);
                    super.field2260.method2190(0, 770, arg1, 5890);
                    this.field3236 = false;
                }
                super.field2260.method2154(arg2, -2);
                super.field2260.method2208(arg0, 6406);
            } else if (!this.field3236) {
                super.field2260.method2154(super.field2260.field5056, -2);
                super.field2260.method2208(1, 6406);
                super.field2260.method2202(390803672, 768, 34168, 0);
                super.field2260.method2190(0, 770, true, 34168);
                this.field3236 = true;
            }
            ++field3235;
        }
    }
}

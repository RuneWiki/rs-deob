import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class347 extends class203 {

    @OriginalMember(owner = "client!lfa", name = "y", descriptor = "Z")
    private boolean field5062 = false;

    @OriginalMember(owner = "client!lfa", name = "r", descriptor = "Lcca;")
    private class725 field5055;

    @OriginalMember(owner = "client!lfa", name = "p", descriptor = "Lcca;")
    private class725 field5053;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "Lcca;")
    private class725 field5044;

    @OriginalMember(owner = "client!lfa", name = "s", descriptor = "Lcca;")
    private class725 field5056;

    @OriginalMember(owner = "client!lfa", name = "u", descriptor = "Lrq;")
    private class470 field5058;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "Z")
    private boolean field5048;

    @OriginalMember(owner = "client!lfa", name = "t", descriptor = "Loja;")
    public static class124 field5057 = new class124();

    @OriginalMember(owner = "client!lfa", name = "A", descriptor = "Laf;")
    public static class39 field5064 = new class39(4);

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!lfa", name = "q", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!lfa", name = "v", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!lfa", name = "w", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!lfa", name = "x", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "Z")
    private boolean field5047;

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "Z")
    private boolean field5063;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)V")
    public static void method2191(int arg0) {
        field5064 = null;
        if (arg0 != 4) {
            field5064 = null;
        }
        field5057 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZB)V")
    public final void method681(boolean arg0, byte arg1) {
        if (arg1 <= 0) {
            this.method682(117, -103, true);
        }
        ++field5049;
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        if (arg0 != -12) {
            method2192(82);
        }
        ++field5052;
        return this.field5048;
    }

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)V")
    public static final void method2192(int arg0) {
        ++field5059;
        if (arg0 < -120) {
            if (~class683.field9565 == -2 || ~class683.field9565 == -4 || class683.field9565 != class216.field2971 && (class683.field9565 == 0 || class216.field2971 == 0)) {
                class429.field5988 = 0;
                class744.field10275 = 0;
                class450.field6288.method3672(0);
            }
            class216.field2971 = class683.field9565;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lpq;)V")
    public class347(class194 arg0) {
        super(arg0);
        if (super.field2843.field2737) {
            this.field5055 = class746.method4129("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", true, 34336, super.field2843);
            this.field5053 = class746.method4129("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", true, 34336, super.field2843);
            this.field5044 = class746.method4129("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", true, 34336, super.field2843);
            this.field5056 = class746.method4129("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", true, 34336, super.field2843);
            if (this.field5056 != null & this.field5044 != null & this.field5053 != null & this.field5055 != null) {
                this.field5058 = new class470(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field5058.method2804(false, 10243, false);
                this.field5048 = true;
            } else {
                this.field5048 = false;
            }
        } else {
            this.field5048 = false;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V")
    public final void method2193(int arg0) {
        ++field5046;
        class35 var2 = super.field2843.field2645;
        if (this.field5047) {
            OpenGL.glBindProgramARB(34336, super.field2843.field2671 != Integer.MAX_VALUE ? this.field5056.field10037 : this.field5053.field10037);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field2843.field2671 != Integer.MIN_VALUE ? this.field5044.field10037 : this.field5055.field10037);
        }
        var2.method289((float) super.field2843.field2671, 0.0F, (float) arg0, -1.0F, class188.field2349, (byte) 48);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class188.field2349[0], class188.field2349[1], class188.field2349[2], class188.field2349[3]);
        OpenGL.glEnable(34336);
        this.field5063 = true;
        this.method2194(-10727);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        if (this.field5063) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5063 = false;
        }
        ++field5051;
        super.field2843.method1262(1, 0);
        if (arg0 <= 64) {
            this.field5053 = null;
        }
        super.field2843.method1219((byte) 86, (class539) null);
        super.field2843.method1230(8448, 8448, false);
        super.field2843.method1223(0, 85, 768, 5890);
        super.field2843.method1223(2, 113, 770, 34166);
        super.field2843.method1220(5890, 770, 34200, 0);
        super.field2843.method1262(0, 0);
        if (this.field5062) {
            super.field2843.method1223(0, 70, 768, 5890);
            super.field2843.method1220(5890, 770, 34200, 0);
            this.field5062 = false;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "(I)V")
    public final void method2194(int arg0) {
        if (this.field5063) {
            int var2 = super.field2843.method177();
            int var3 = super.field2843.method241();
            float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2843.field2720, (float) super.field2843.field2709 / 255.0F);
            super.field2843.method1262(1, arg0 + 10727);
            super.field2843.method1193(super.field2843.field2752, 16711680);
            super.field2843.method1262(0, 0);
        }
        ++field5045;
        if (arg0 != -10727) {
            field5057 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)V")
    public static final void method2195(int arg0) {
        ++field5054;
        if (arg0 != 7) {
            method2195(87);
        }
        for (int var1 = 0; ~class701.field9773 < ~var1; ++var1) {
            int var2 = class588.field8293[var1];
            class359 var3 = ((class685) class450.field6288.method3669(false, (long) var2)).field9573;
            int var4 = class315.field4517.method3013(arg0 + -133);
            if (~(8 & var4) != -1) {
                var4 += class315.field4517.method3013(arg0 ^ 113) << 8;
            }
            if ((var4 & 4096) != 0) {
                var4 += class315.field4517.method3013(arg0 ^ 122) << 16;
            }
            if ((2048 & var4) != 0) {
                int var5 = class315.field4517.method2982((byte) -101);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                for (int var8 = 0; var8 < var5; ++var8) {
                    int var9 = class315.field4517.method3042((byte) -100);
                    if (~(var9 & 49152) == -49153) {
                        int var10 = class315.field4517.method3006(false);
                        var6[var8] = class613.method3544(var9 << 16, var10);
                    } else {
                        var6[var8] = var9;
                    }
                    var7[var8] = class315.field4517.method3004((byte) -125);
                }
                var3.method3741(var7, 20724, var6);
            }
            if (~(2 & var4) != -1) {
                int var11 = class315.field4517.method3002(-1);
                if (~var11 == -65536) {
                    var11 = -1;
                }
                int var12 = class315.field4517.method2987(123);
                int var13 = class315.field4517.method3013(100);
                int var14 = 7 & var13;
                int var15 = 15 & var13 >> 3;
                if (var15 == 15) {
                    var15 = -1;
                }
                var3.method3750(var11, var14, (byte) -19, 0, var12, var15);
            }
            if (~(var4 & 16) != -1) {
                var3.field5173 = class315.field4517.method3002(-1);
                var3.field5160 = class315.field4517.method3006(false);
            }
            if ((var4 & 1) != 0) {
                int var16 = class315.field4517.method2982((byte) -101);
                if (~var16 < -1) {
                    for (int var17 = 0; var16 > var17; ++var17) {
                        int var18 = -1;
                        int var19 = -1;
                        int var20 = -1;
                        int var21 = class315.field4517.method3043(-31927);
                        if (var21 != 32767) {
                            if (~var21 == -32767) {
                                var21 = -1;
                            } else {
                                var19 = class315.field4517.method3043(arg0 ^ -31922);
                            }
                        } else {
                            var21 = class315.field4517.method3043(-31927);
                            var19 = class315.field4517.method3043(-31927);
                            var18 = class315.field4517.method3043(arg0 ^ -31922);
                            var20 = class315.field4517.method3043(-31927);
                        }
                        int var22 = class315.field4517.method3043(-31927);
                        int var23 = class315.field4517.method2976(78);
                        var3.method3739(var22, var19, class533.field7336, var18, var23, var20, arg0 ^ -8, var21);
                    }
                }
            }
            if (~(var4 & 131072) != -1) {
                var3.field5174 = class315.field4517.method3002(arg0 + -8);
                if (var3.field5174 == 65535) {
                    var3.field5174 = var3.field5172.field8889;
                }
            }
            if ((16384 & var4) != 0) {
                int var24 = var3.field5172.field8912.length;
                int var25 = 0;
                if (var3.field5172.field8919 != null) {
                    var25 = var3.field5172.field8919.length;
                }
                int var26 = 0;
                if (var3.field5172.field8920 != null) {
                    var26 = var3.field5172.field8920.length;
                }
                int var27 = class315.field4517.method3036((byte) -57);
                if (~(1 & var27) == -2) {
                    var3.field5168 = null;
                } else {
                    int[] var28 = null;
                    if (~(var27 & 2) == -3) {
                        var28 = new int[var24];
                        for (int var29 = 0; var29 < var24; ++var29) {
                            var28[var29] = class315.field4517.method3002(class475.method2835(arg0, -8));
                        }
                    }
                    short[] var30 = null;
                    if ((4 & var27) == 4) {
                        var30 = new short[var25];
                        for (int var31 = 0; var25 > var31; ++var31) {
                            var30[var31] = (short) class315.field4517.method3004((byte) -111);
                        }
                    }
                    short[] var32 = null;
                    if (~(8 & var27) == -9) {
                        var32 = new short[var26];
                        for (int var33 = 0; var26 > var33; ++var33) {
                            var32[var33] = (short) class315.field4517.method3006(false);
                        }
                    }
                    long var34 = (long) var2 | (long) (var3.field5162++) << 32;
                    var3.field5168 = new class201(var34, var28, var30, var32);
                }
            }
            if ((var4 & 1024) != 0) {
                int var36 = class315.field4517.method2982((byte) -101);
                int[] var37 = new int[var36];
                int[] var38 = new int[var36];
                int[] var39 = new int[var36];
                for (int var40 = 0; ~var40 > ~var36; ++var40) {
                    int var41 = class315.field4517.method3002(-1);
                    if (var41 == 65535) {
                        var41 = -1;
                    }
                    var37[var40] = var41;
                    var38[var40] = class315.field4517.method2976(arg0 + 80);
                    var39[var40] = class315.field4517.method3042((byte) -100);
                }
                class781.method4297(var38, 0, var39, var3, var37);
            }
            if ((32 & var4) != 0) {
                if (var3.field5172.method3646(true)) {
                    class632.method3625((byte) -119, var3);
                }
                var3.method2258(-120, class104.field1201.method4318(class315.field4517.method3042((byte) -100), -197));
                var3.method3742((byte) -55, var3.field5172.field8899);
                var3.field9118 = var3.field5172.field8907 << 3;
                if (var3.field5172.method3646(true)) {
                    class713.method4002(var3, (class286) null, var3.field9219[0], var3.field9214[0], (class723) null, 0, var3.field3467, false);
                }
            }
            if ((262144 & var4) != 0) {
                int var42 = var3.field5172.field8865.length;
                int var43 = 0;
                if (var3.field5172.field8919 != null) {
                    var43 = var3.field5172.field8919.length;
                }
                if (var3.field5172.field8920 != null) {
                    var43 = var3.field5172.field8920.length;
                }
                byte var44 = 0;
                int var45 = class315.field4517.method2982((byte) -101);
                if (~(var45 & 1) != -2) {
                    int[] var46 = null;
                    if ((var45 & 2) == 2) {
                        var46 = new int[var42];
                        for (int var47 = 0; ~var47 > ~var42; ++var47) {
                            var46[var47] = class315.field4517.method3002(-1);
                        }
                    }
                    short[] var48 = null;
                    if ((4 & var45) == 4) {
                        var48 = new short[var43];
                        for (int var49 = 0; ~var43 < ~var49; ++var49) {
                            var48[var49] = (short) class315.field4517.method3006(false);
                        }
                    }
                    short[] var50 = null;
                    if (~(8 & var45) == -9) {
                        var50 = new short[var44];
                        for (int var51 = 0; ~var51 > ~var44; ++var51) {
                            var50[var51] = (short) class315.field4517.method3042((byte) -100);
                        }
                    }
                    long var52 = (long) (var3.field5180++) << 32 | (long) var2;
                    new class201(var52, var46, var48, var50);
                }
            }
            if ((256 & var4) != 0) {
                var3.field9174 = class315.field4517.method3030(-25984);
                var3.field9149 = class315.field4517.method2989(-128);
                var3.field9130 = class315.field4517.method2989(-105);
                var3.field9145 = class315.field4517.method2989(-127);
                var3.field9183 = class315.field4517.method3006(false) - -class533.field7336;
                var3.field9206 = class315.field4517.method3042((byte) -100) + class533.field7336;
                var3.field9140 = class315.field4517.method2976(71);
                var3.field9215 = 1;
                var3.field9130 += var3.field9219[0];
                var3.field9216 = 0;
                var3.field9149 += var3.field9214[0];
                var3.field9145 += var3.field9214[0];
                var3.field9174 += var3.field9219[0];
            }
            if (~(65536 & var4) != -1) {
                int var54 = class315.field4517.method3002(arg0 + -8);
                int var55 = class315.field4517.method2975(-115);
                if (var54 == 65535) {
                    var54 = -1;
                }
                int var56 = class315.field4517.method2982((byte) -101);
                int var57 = var56 & 7;
                int var58 = (122 & var56) >> 3;
                if (var58 == 15) {
                    var58 = -1;
                }
                var3.method3750(var54, var57, (byte) 20, 2, var55, var58);
            }
            if ((32768 & var4) != 0) {
                int var59 = class315.field4517.method3002(-1);
                if (var59 == 65535) {
                    var59 = -1;
                }
                int var60 = class315.field4517.method2975(arg0 + -126);
                int var61 = class315.field4517.method3013(arg0 + 76);
                int var62 = 7 & var61;
                int var63 = (120 & var61) >> 3;
                if (var63 == 15) {
                    var63 = -1;
                }
                var3.method3750(var59, var62, (byte) 126, 1, var60, var63);
            }
            if ((8192 & var4) != 0) {
                int var64 = class315.field4517.method3002(-1);
                var3.field9163 = class315.field4517.method2976(56);
                var3.field9170 = class315.field4517.method3013(90);
                var3.field9197 = 32767 & var64;
                var3.field9201 = (var64 & 32768) != 0;
                var3.field9194 = var3.field9197 + var3.field9163 + class533.field7336;
            }
            if (~(64 & var4) != -1) {
                var3.field9137 = class315.field4517.method3004((byte) -120);
                if (~var3.field9137 == -65536) {
                    var3.field9137 = -1;
                }
            }
            if ((var4 & 4) != 0) {
                int[] var65 = new int[4];
                for (int var66 = 0; var66 < 4; ++var66) {
                    var65[var66] = class315.field4517.method3002(class475.method2835(arg0, -8));
                    if (~var65[var66] == -65536) {
                        var65[var66] = -1;
                    }
                }
                int var67 = class315.field4517.method3036((byte) -57);
                class745.method4124(var67, var65, var3, true);
            }
            if (~(128 & var4) != -1) {
                var3.field9204 = class315.field4517.method2993((byte) -125);
                var3.field9192 = 100;
            }
            if (~(var4 & 524288) != -1) {
                var3.field5165 = class315.field4517.method2993((byte) -24);
                if ("".equals(var3.field5165) || var3.field5165.equals(var3.field5172.field8898)) {
                    var3.field5165 = var3.field5172.field8898;
                }
            }
            if ((var4 & 512) != 0) {
                var3.field9153 = class315.field4517.method3030(-25984);
                var3.field9119 = class315.field4517.method3023(-22454);
                var3.field9200 = class315.field4517.method3023(-22454);
                var3.field9182 = (byte) class315.field4517.method2982((byte) -101);
                var3.field9124 = class533.field7336 + class315.field4517.method3004((byte) -106);
                var3.field9205 = class533.field7336 + class315.field4517.method3002(-1);
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BZ)V")
    public final void method688(byte arg0, boolean arg1) {
        ++field5061;
        if (arg0 <= -25) {
            this.field5047 = arg1;
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 106, this.field5058);
            super.field2843.method1230(7681, 34165, false);
            super.field2843.method1223(0, 70, 768, 34166);
            super.field2843.method1223(2, 99, 770, 5890);
            super.field2843.method1220(34168, 770, 34200, 0);
            super.field2843.method1262(0, 0);
            this.method2193(0);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIZ)V")
    public final void method682(int arg0, int arg1, boolean arg2) {
        ++field5060;
        if (!arg2) {
            field5064 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZLwha;)V")
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        if (!arg1) {
            if (arg2 != null) {
                if (this.field5062) {
                    super.field2843.method1223(0, 89, 768, 5890);
                    super.field2843.method1220(5890, 770, 34200, 0);
                    this.field5062 = false;
                }
                super.field2843.method1219((byte) 92, arg2);
                super.field2843.method1263(arg0, 97);
            } else if (!this.field5062) {
                super.field2843.method1219((byte) 74, super.field2843.field2733);
                super.field2843.method1263(1, 98);
                super.field2843.method1223(0, 56, 768, 34168);
                super.field2843.method1220(34168, 770, 34200, 0);
                this.field5062 = true;
            }
            ++field5050;
        }
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class67 extends class184 {

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Z")
    private boolean field1211 = false;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "Lpp;")
    private class390 field1218;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lpp;")
    private class390 field1209;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lpp;")
    private class390 field1208;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Lpp;")
    private class390 field1215;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Z")
    private boolean field1207;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Lme;")
    private class192 field1214;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[F")
    public static float[] field1206 = new float[4];

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "Lew;")
    public static class490 field1219;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Lth;")
    public static class593 field1223;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
    private boolean field1204;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Z")
    private boolean field1210;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z")
    public final boolean method698(int arg0) {
        ++field1220;
        if (arg0 != -20958) {
            this.field1218 = null;
        }
        return this.field1207;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public final void method699(int arg0, boolean arg1) {
        ++field1213;
        this.field1210 = arg1;
        super.field2626.method3413(1, 33984);
        super.field2626.method3425(this.field1214, -110);
        if (arg0 < -54) {
            super.field2626.method3485(34165, (byte) 81, 7681);
            super.field2626.method3464(0, 768, false, 34166);
            super.field2626.method3464(2, 770, false, 5890);
            super.field2626.method3453(7482, 34168, 0, 770);
            super.field2626.method3413(0, 33984);
            this.method708((byte) 46);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Liia;ZI)V")
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        if (arg0 != null) {
            if (this.field1211) {
                super.field2626.method3464(0, 768, false, 5890);
                super.field2626.method3453(7482, 5890, 0, 770);
                this.field1211 = false;
            }
            super.field2626.method3425(arg0, -68);
            super.field2626.method3417(arg2, 0);
        } else if (!this.field1211) {
            super.field2626.method3425(super.field2626.field8603, 97);
            super.field2626.method3417(1, 0);
            super.field2626.method3464(0, 768, false, 34168);
            super.field2626.method3453(7482, 34168, 0, 770);
            this.field1211 = true;
        }
        if (arg1) {
            field1219 = null;
        }
        ++field1212;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Loea;)V")
    public class67(class594 arg0) {
        super(arg0);
        if (super.field2626.field8652) {
            this.field1218 = class184.method1316(34336, 62, super.field2626, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field1209 = class184.method1316(34336, 126, super.field2626, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field1208 = class184.method1316(34336, 59, super.field2626, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field1215 = class184.method1316(34336, 118, super.field2626, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (!(this.field1218 != null & this.field1209 != null & this.field1208 != null & this.field1215 != null)) {
                this.field1207 = false;
            } else {
                this.field1214 = new class192(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field1214.method1346((byte) -125, false, false);
                this.field1207 = true;
            }
        } else {
            this.field1207 = false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public final void method701(byte arg0) {
        if (arg0 != 1) {
            field1206 = null;
        }
        ++field1216;
        if (this.field1204) {
            int var2 = super.field2626.method531();
            int var3 = super.field2626.method534();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2626.field8665, (float) super.field2626.field8629 / 255.0F);
            super.field2626.method3413(1, 33984);
            super.field2626.method3461((byte) 103, super.field2626.field8674);
            super.field2626.method3413(0, 33984);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public final void method702(boolean arg0) {
        if (this.field1204) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1204 = false;
        }
        ++field1205;
        super.field2626.method3413(1, 33984);
        super.field2626.method3425((class87) null, 104);
        super.field2626.method3485(8448, (byte) 96, 8448);
        super.field2626.method3464(0, 768, false, 5890);
        super.field2626.method3464(2, 770, !arg0, 34166);
        super.field2626.method3453(7482, 5890, 0, 770);
        super.field2626.method3413(0, 33984);
        if (!arg0) {
            this.method704(false, -107);
        }
        if (this.field1211) {
            super.field2626.method3464(0, 768, false, 5890);
            super.field2626.method3453(7482, 5890, 0, 770);
            this.field1211 = false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static void method703(int arg0) {
        if (arg0 != -2) {
            method703(-122);
        }
        field1219 = null;
        field1223 = null;
        field1206 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
    public final void method704(boolean arg0, int arg1) {
        ++field1217;
        if (arg1 != -28981) {
            this.field1218 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
    public final void method705(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field1211 = true;
        }
        ++field1203;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
    public static final void method706(byte arg0) {
        if (arg0 != -99) {
            method707((class43) null, (class36[]) null);
        }
        while (class644.field9146.method2683((byte) 111, class374.field5243) >= 15) {
            int var1 = class644.field9146.method2686(-9380, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class272 var3 = (class272) class758.field10539.method4203(true, (long) var1);
            if (var3 == null) {
                class84 var4 = new class84();
                var4.field931 = var1;
                var3 = new class272(var4);
                class758.field10539.method4211(var3, (byte) 42, (long) var1);
                var2 = true;
                class379.field5284[class130.field1948++] = var3;
            }
            class84 var5 = var3.field3885;
            class323.field4590[class152.field2290++] = var1;
            var5.field933 = class515.field7337;
            if (var5.field1523 != null && var5.field1523.method2928((byte) 94)) {
                class310.method2011(-103, var5);
            }
            int var6 = class644.field9146.method2686(-9380, 1);
            if (var6 == 1) {
                class239.field3370[class617.field8924++] = var1;
            }
            int var7 = class644.field9146.method2686(arg0 + -9281, 2);
            int var8 = class644.field9146.method2686(-9380, 5);
            if (~var8 < -16) {
                var8 -= 32;
            }
            int var9 = class644.field9146.method2686(-9380, 1);
            int var10 = (1692401671 & 4 + class644.field9146.method2686(-9380, 3)) << 11;
            int var11 = class644.field9146.method2686(-9380, 5);
            var5.method809(class134.field2102.method3038(class644.field9146.method2686(-9380, 14), (byte) 93), arg0 ^ 98);
            if (~var11 < -16) {
                var11 -= 32;
            }
            var5.method470(var5.field1523.field6911, 0);
            var5.field878 = var5.field1523.field6927 << 3;
            if (var2) {
                var5.method462(var10, true, -1);
            }
            var5.method805(var7, false, class468.field6748.field991[0] + var8, var5.method482(false), ~var9 == -2, class468.field6748.field995[0] - -var11);
            if (var5.field1523.method2928((byte) -121)) {
                class229.method1575(var5.field649, var5, (class414) null, (class349) null, 0, -1, var5.field995[0], var5.field991[0]);
            }
        }
        ++field1221;
        class644.field9146.method2684(true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lgs;[Lbh;)V")
    public static final void method707(class43 arg0, class36[] arg1) {
        if (class140.field2172) {
            int var2 = arg0.method407(arg1, 40);
            class497.field7089.method575(var2, arg1);
        }
        if (class4.field56 == class138.field2153) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class113) {
                var5 = ((class113) arg0).field1814;
                var6 = ((class113) arg0).field1820;
            } else {
                var5 = arg0.field644 >> class440.field6142;
                var6 = arg0.field648 >> class440.field6142;
            }
            class497.field7089.method596(class173.field2511[0].method1827(-3458, arg0.field644, arg0.field648), class388.method2421(var5, var6), class190.method1339(var5, var6), class696.method3914(var5, var6));
        }
        class304 var7 = arg0.method396((byte) 125, class497.field7089);
        if (var7 != null) {
            if (arg0.field654) {
                class243[] var8 = var7.field4298;
                for (int var9 = 0; var9 < var8.length; ++var9) {
                    class243 var10 = var8[var9];
                    if (var10.field3397) {
                        class6.method33(true, var10.field3402 + var10.field3399, var10.field3398 - var10.field3402, var10.field3400 - var10.field3402, var10.field3402 + var10.field3401);
                    }
                }
            }
            if (var7.field4296) {
                var7.field4297 = arg0;
                if (class190.field2741) {
                    class532 var11 = class62.field1128;
                    synchronized (class62.field1128) {
                        class62.field1128.method3130(79, var7);
                        return;
                    }
                }
                class62.field1128.method3130(103, var7);
                return;
            }
            class625.method3614(var7, -122);
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
    public final void method708(byte arg0) {
        ++field1222;
        class724 var2 = super.field2626.field8579;
        if (this.field1210) {
            OpenGL.glBindProgramARB(34336, super.field2626.field8585 != Integer.MAX_VALUE ? this.field1215.field5448 : this.field1209.field5448);
        } else {
            OpenGL.glBindProgramARB(34336, super.field2626.field8585 == Integer.MAX_VALUE ? this.field1218.field5448 : this.field1208.field5448);
        }
        var2.method4031((float) super.field2626.field8585, class714.field9974, 0.0F, (byte) -113, -1.0F, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class714.field9974[0], class714.field9974[1], class714.field9974[2], class714.field9974[3]);
        int var3 = 13 / ((-30 - arg0) / 39);
        OpenGL.glEnable(34336);
        this.field1204 = true;
        this.method701((byte) 1);
    }
}

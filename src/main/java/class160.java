import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class160 extends class398 {

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "Z")
    private boolean field2267;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "Llk;")
    private class569 field2260;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "Llk;")
    private class569 field2255;

    @OriginalMember(owner = "client!waa", name = "x", descriptor = "Llk;")
    private class569 field2273;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "Llk;")
    private class569 field2264;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "Laaa;")
    private class227 field2266;

    @OriginalMember(owner = "client!waa", name = "y", descriptor = "Lvg;")
    public static class622 field2274 = new class622(12, 1);

    @OriginalMember(owner = "client!waa", name = "A", descriptor = "Lcq;")
    public static class273 field2276 = new class273(4, 1, 1, 1);

    @OriginalMember(owner = "client!waa", name = "D", descriptor = "Lvg;")
    public static class622 field2279 = new class622(66, 0);

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!waa", name = "v", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!waa", name = "w", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!waa", name = "B", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!waa", name = "E", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "Lvg;")
    public static class622 field2275;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "Z")
    private boolean field2257;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "Z")
    private boolean field2269;

    @OriginalMember(owner = "client!waa", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field2278;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)V", line = 5)
    public static final void method1137(int arg0) {
        ++field2259;
        int var1 = class229.field3040 * 512 + 256;
        int var2 = class346.field5107 * 512 - -256;
        int var3 = class504.method2870((byte) -123, var2, var1, class49.field779) + -class50.field785;
        if (~class457.field6593 > -101) {
            if (var1 > class306.field4529) {
                class306.field4529 += (-class306.field4529 + var1) * class457.field6593 / 1000 + class546.field8063;
                if (var1 < class306.field4529) {
                    class306.field4529 = var1;
                }
            }
            if (~class306.field4529 < ~var1) {
                class306.field4529 -= (-var1 + class306.field4529) * class457.field6593 / 1000 + class546.field8063;
                if (~class306.field4529 > ~var1) {
                    class306.field4529 = var1;
                }
            }
            if (var3 > class533.field7839) {
                class533.field7839 += class546.field8063 - -((-class533.field7839 + var3) * class457.field6593 / 1000);
                if (class533.field7839 > var3) {
                    class533.field7839 = var3;
                }
            }
            if (class533.field7839 > var3) {
                class533.field7839 -= class546.field8063 - -((-var3 + class533.field7839) * class457.field6593 / 1000);
                if (~class533.field7839 > ~var3) {
                    class533.field7839 = var3;
                }
            }
            if (~var2 < ~class603.field8702) {
                class603.field8702 += (-class603.field8702 + var2) * class457.field6593 / 1000 + class546.field8063;
                if (~class603.field8702 < ~var2) {
                    class603.field8702 = var2;
                }
            }
            if (~var2 > ~class603.field8702) {
                class603.field8702 -= (-var2 + class603.field8702) * class457.field6593 / 1000 + class546.field8063;
                if (class603.field8702 < var2) {
                    class603.field8702 = var2;
                }
            }
        } else {
            class306.field4529 = class229.field3040 * 512 + 256;
            class603.field8702 = class346.field5107 * 512 - -256;
            class533.field7839 = class504.method2870((byte) -128, class603.field8702, class306.field4529, class49.field779) + -class50.field785;
        }
        int var4 = class119.field1780 * 512 - -256;
        int var5 = class478.field6845 * 512 + 256;
        int var6 = class504.method2870((byte) -128, var5, var4, class49.field779) - class109.field1626;
        int var7 = -class306.field4529 + var4;
        int var8 = var6 - class533.field7839;
        int var9 = -class603.field8702 + var5;
        if (arg0 != 1000) {
            field2277 = 80;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10));
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 16383;
        if (~var11 > -1025) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (~var11 < ~class246.field3255) {
            class246.field3255 += (-class246.field3255 + var11 >> 3) * class608.field8804 / 1000 + class115.field1731 << 3;
            if (~var11 > ~class246.field3255) {
                class246.field3255 = var11;
            }
        }
        if (class246.field3255 > var11) {
            class246.field3255 -= class115.field1731 - -((-var11 + class246.field3255 >> 3) * class608.field8804 / 1000) << 3;
            if (~class246.field3255 > ~var11) {
                class246.field3255 = var11;
            }
        }
        int var13 = -class481.field6886 + var12;
        if (~var13 < -8193) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class481.field6886 += class608.field8804 * var14 / 1000 + class115.field1731 << 3;
            class481.field6886 &= 16383;
        }
        if (var14 < 0) {
            class481.field6886 -= -var14 * class608.field8804 / 1000 + class115.field1731 << 3;
            class481.field6886 &= 16383;
        }
        int var15 = -class481.field6886 + var12;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class276.field3597 = 0;
        if (var15 < 0 && ~var14 < -1 || var15 > 0 && ~var14 > -1) {
            class481.field6886 = var12;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZI)V", line = 165)
    public final void method91(boolean arg0, int arg1) {
        ++field2261;
        this.field2257 = arg0;
        super.field6009.method1745(true, 1);
        super.field6009.method1709((byte) -92, this.field2266);
        super.field6009.method1701(34165, 1, 7681);
        super.field6009.method1755(34166, 34176, 768, 0);
        super.field6009.method1755(5890, 34176, 770, 2);
        super.field6009.method1724((byte) 11, 770, 34168, 0);
        super.field6009.method1745(true, 0);
        this.method1142((byte) -126);
        if (arg1 != -5191) {
            this.method86(45, (byte) -110, 49);
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V", line = 185)
    public static void method1138(byte arg0) {
        field2276 = null;
        int var1 = 17 / ((-42 - arg0) / 42);
        field2279 = null;
        field2278 = null;
        field2274 = null;
        field2275 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILjava/lang/String;)I", line = 198)
    public static final int method1139(int arg0, String arg1) {
        ++field2263;
        if (arg0 != -48) {
            return -103;
        } else {
            int var2 = arg1.length();
            int var3 = 0;
            for (int var4 = 0; var4 < var2; ++var4) {
                var3 = (var3 << 5) + -var3 + class91.method507((byte) 98, arg1.charAt(var4));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)Z", line = 220)
    public final boolean method87(int arg0) {
        if (arg0 != 3) {
            field2279 = null;
        }
        ++field2256;
        return this.field2267;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZ)V", line = 231)
    public final void method94(int arg0, boolean arg1) {
        ++field2272;
        if (arg0 != 0) {
            field2274 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(ZI)Z", line = 245)
    public static final boolean method1140(boolean arg0, int arg1) {
        ++field2271;
        if (~arg1 != -48 && ~arg1 != -14 && ~arg1 != -59 && arg1 != 16 && arg1 != 48) {
            if (~arg1 != -51 && arg1 != 1006) {
                if (arg0) {
                    method1140(true, 106);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;B)V", line = 264)
    public static final void method1141(class98 arg0, byte arg1) {
        ++field2254;
        if (class180.field2494 != class321.field4681.field7905) {
            if (class603.field8695 != null) {
                if (arg1 != 51) {
                    field2274 = null;
                }
                if (class373.method2297(arg0, class321.field4681.field7905, -28322)) {
                    class180.field2494 = class321.field4681.field7905;
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Luca;)V", line = 289)
    public class160(class287 arg0) {
        super(arg0);
        if (!super.field6009.field4140) {
            this.field2267 = false;
        } else {
            this.field2260 = class375.method2311(34336, super.field6009, -90, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field2255 = class375.method2311(34336, super.field6009, -36, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field2273 = class375.method2311(34336, super.field6009, -91, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field2264 = class375.method2311(34336, super.field6009, -62, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (this.field2264 != null & this.field2273 != null & this.field2255 != null & this.field2260 != null) {
                this.field2266 = new class227(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field2266.method1424(10242, false, false);
                this.field2267 = true;
            } else {
                this.field2267 = false;
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILvaa;B)V", line = 315)
    public final void method93(int arg0, class517 arg1, byte arg2) {
        int var4 = 58 / ((76 - arg2) / 41);
        if (arg1 != null) {
            super.field6009.method1709((byte) -59, arg1);
            super.field6009.method1751(arg0, 21575);
        } else {
            super.field6009.method1709((byte) -120, super.field6009.field4165);
            super.field6009.method1751(1, 21575);
            super.field6009.method1755(34168, 34176, 768, 0);
            super.field6009.method1724((byte) 11, 770, 34168, 0);
        }
        ++field2268;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)V", line = 340)
    public final void method1142(byte arg0) {
        ++field2280;
        class196 var2 = super.field6009.field4057;
        int var3 = 107 / ((-75 - arg0) / 51);
        if (this.field2257) {
            OpenGL.glBindProgramARB(34336, super.field6009.field4109 == Integer.MAX_VALUE ? this.field2255.field8289 : this.field2264.field8289);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field6009.field4109 != Integer.MIN_VALUE ? this.field2273.field8289 : this.field2260.field8289);
        }
        var2.method1285((float) super.field6009.field4109, 0.0F, -1.0F, class688.field9717, 0.0F, (byte) -92);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class688.field9717[0], class688.field9717[1], class688.field9717[2], class688.field9717[3]);
        OpenGL.glEnable(34336);
        this.field2269 = true;
        this.method1143(0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IBI)V", line = 368)
    public final void method86(int arg0, byte arg1, int arg2) {
        if (arg1 == 82) {
            ++field2265;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V", line = 378)
    public final void method92(int arg0) {
        if (this.field2269) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2269 = false;
        }
        ++field2258;
        super.field6009.method1745(true, 1);
        super.field6009.method1709((byte) -106, (class517) null);
        super.field6009.method1701(8448, 1, 8448);
        super.field6009.method1755(5890, arg0 + 33664, 768, 0);
        super.field6009.method1755(34166, 34176, 770, 2);
        super.field6009.method1724((byte) 11, 770, 5890, 0);
        super.field6009.method1745(true, 0);
        if (arg0 != 512) {
            this.method1143(-73);
        }
        super.field6009.method1755(5890, 34176, 768, 0);
        super.field6009.method1724((byte) 11, 770, 5890, 0);
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)V", line = 407)
    public final void method1143(int arg0) {
        if (arg0 != 0) {
            this.field2264 = null;
        }
        ++field2270;
        if (this.field2269) {
            int var2 = super.field6009.method608();
            int var3 = super.field6009.method668();
            float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field6009.field4083, (float) super.field6009.field4067 / 255.0F);
            super.field6009.method1745(true, 1);
            super.field6009.method1759(true, super.field6009.field4147);
            super.field6009.method1745(true, 0);
        }
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class22 extends class128 {

    @OriginalMember(owner = "client!be", name = "l", descriptor = "B")
    private byte field275 = 0;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field280 = 0;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    private int field272 = 0;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "B")
    private byte field296 = 0;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    private int field292 = 0;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Z")
    public boolean field277 = false;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    private int field291 = 0;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
    private int[] field294;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "[I")
    public int[] field306;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "[I")
    public int[] field301;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[I")
    public int[] field279;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
    private int[] field281;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "[S")
    private short[] field312;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "[Lrh;")
    public class117[] field287;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[Lhk;")
    public class45[] field282;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "[S")
    private short[] field305;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "[S")
    private short[] field313;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[S")
    private short[] field284;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[S")
    private short[] field276;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[F")
    private float[] field278;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "[F")
    private float[] field308;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[S")
    private short[] field283;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "[B")
    private byte[] field302;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[S")
    private short[] field288;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[S")
    private short[] field285;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "[S")
    private short[] field310;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "[S")
    private short[] field303;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[B")
    private byte[] field273;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[S")
    private short[] field270;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Ldj;")
    public class156 field286;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Lji;")
    public class291 field295;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Lji;")
    private class291 field298;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "Lji;")
    private class291 field307;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Lji;")
    private class291 field304;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "Lji;")
    private class291 field299;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "S")
    private short field271;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "S")
    private short field311;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "[S")
    private short[] field290;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
    private int[] field289;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "Lfh;")
    private static class313 field297 = new class313(10000);

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "Lbe;")
    private static class22 field314 = new class22();

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "Lbe;")
    private static class22 field317 = new class22();

    @OriginalMember(owner = "client!be", name = "db", descriptor = "Lbe;")
    private static class22 field318 = new class22();

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "Lbe;")
    private static class22 field319 = new class22();

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "Lbe;")
    private static class22 field320 = new class22();

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "Lbe;")
    private static class22 field321 = new class22();

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "Z")
    private static boolean field323 = false;

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "[I")
    private static int[] field329 = new int[1];

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "[I")
    private static int[] field324 = new int[1];

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "F")
    private static float field326;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "F")
    private static float field327;

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "F")
    private static float field328;

    @OriginalMember(owner = "client!be", name = "qb", descriptor = "F")
    private static float field331;

    @OriginalMember(owner = "client!be", name = "rb", descriptor = "F")
    private static float field332;

    @OriginalMember(owner = "client!be", name = "sb", descriptor = "F")
    private static float field333;

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "I")
    private static int field325;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "I")
    private static int field330;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "Lvj;")
    private class205 field300;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "Lic;")
    private class333 field309;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field315;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "[J")
    private static long[] field274;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "[[I")
    private int[][] field293;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "[[I")
    private int[][] field316;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 5)
    private static final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field333 = var18;
        field327 = var19;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZZZZZZ)V", line = 83)
    public final void method139(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field296 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field292 != 0) {
            if (arg6) {
                boolean var8 = !this.field298.field4822 && (arg1 || arg2 && !class322.field5287);
                this.method142(false, !this.field295.field4822 && arg0, var8, this.field307 != null && !this.field307.field4822 && arg2, !this.field304.field4822 && arg3);
                if (!this.field299.field4822 && arg4 && arg1) {
                    this.method193();
                }
            }
            if (arg0) {
                if (this.field295.field4822) {
                    if (!this.field286.field2516) {
                        this.method150();
                    }
                    this.field306 = null;
                    this.field301 = null;
                    this.field279 = null;
                    this.field290 = null;
                    this.field294 = null;
                } else {
                    this.field275 = (byte) (this.field275 | 0x1);
                }
            }
            if (arg1) {
                if (this.field298.field4822) {
                    this.field283 = null;
                    this.field302 = null;
                } else {
                    this.field275 = (byte) (this.field275 | 0x2);
                }
            }
            if (arg2 && class322.field5287) {
                if (this.field307.field4822) {
                    this.field305 = null;
                    this.field313 = null;
                    this.field284 = null;
                    this.field276 = null;
                } else {
                    this.field275 = (byte) (this.field275 | 0x4);
                }
            }
            if (arg3) {
                if (this.field304.field4822) {
                    this.field278 = null;
                    this.field308 = null;
                } else {
                    this.field275 = (byte) (this.field275 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field299.field4822 && this.field298.field4822) {
                    this.field288 = null;
                    this.field285 = null;
                    this.field310 = null;
                } else {
                    this.field275 = (byte) (this.field275 | 0x10);
                }
            }
            if (arg5) {
                this.field281 = null;
                this.field273 = null;
                this.field293 = (int[][]) null;
                this.field316 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(III)V", line = 180)
    public final void method140(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field280; var4++) {
            this.field306[var4] += arg0;
            this.field301[var4] += arg1;
            this.field279[var4] += arg2;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 194)
    public final void method141(int arg0) {
        if (this.field305 == null) {
            this.method149(arg0);
            return;
        }
        int var2 = class272.field4470[arg0];
        int var3 = class272.field4480[arg0];
        for (int var4 = 0; var4 < this.field280; var4++) {
            int var5 = this.field306[var4] * var3 + this.field279[var4] * var2 >> 16;
            this.field279[var4] = this.field279[var4] * var3 - this.field306[var4] * var2 >> 16;
            this.field306[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field292; var6++) {
            int var7 = this.field305[var6] * var3 + this.field284[var6] * var2 >> 16;
            this.field284[var6] = (short) (this.field284[var6] * var3 - this.field305[var6] * var2 >> 16);
            this.field305[var6] = (short) var7;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
        if (this.field307 != null) {
            this.field307.field4822 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZZZZ)V", line = 236)
    private final void method142(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field295.field4832 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field298.field4832 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field307.field4832 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field304.field4832 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field297.field5124.length < this.field292 * var6) {
            field297 = new class313((this.field292 + 100) * var6);
        } else {
            field297.field5137 = 0;
        }
        if (arg1) {
            if (class245.field3895) {
                for (int var7 = 0; var7 < this.field291; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field306[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field301[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field279[var7]);
                    int var11 = this.field294[var7];
                    int var12 = this.field294[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field290[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field297.field5137 = var6 * var14;
                        field297.method2222(var8, 255);
                        field297.method2222(var9, 255);
                        field297.method2222(var10, 255);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field291; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field306[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field301[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field279[var15]);
                    int var19 = this.field294[var15];
                    int var20 = this.field294[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field290[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field297.field5137 = var6 * var22;
                        field297.method2210((byte) 13, var16);
                        field297.method2210((byte) -127, var17);
                        field297.method2210((byte) 87, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class322.field5287) {
                for (int var42 = 0; var42 < this.field272; var42++) {
                    int var43 = method143(this.field283[var42], this.field303[var42], this.field271, this.field302[var42]);
                    field297.field5137 = this.field288[var42] * var6 + this.field298.field4832;
                    field297.method2222(var43, 255);
                    field297.field5137 = this.field285[var42] * var6 + this.field298.field4832;
                    field297.method2222(var43, 255);
                    field297.field5137 = this.field310[var42] * var6 + this.field298.field4832;
                    field297.method2222(var43, 255);
                }
            } else {
                int var23 = (int) class234.field3727[0];
                int var24 = (int) class234.field3727[1];
                int var25 = (int) class234.field3727[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field271 * 1.3F);
                int var28 = this.field311 * var26 >> 8;
                for (int var29 = 0; var29 < this.field272; var29++) {
                    short var30 = this.field288[var29];
                    short var31 = this.field276[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field284[var30] * var25 + this.field313[var30] * var24 + this.field305[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field284[var30] * var25 + this.field313[var30] * var24 + this.field305[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field276[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field285[var29];
                    short var34 = this.field276[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field284[var33] * var25 + this.field313[var33] * var24 + this.field305[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field284[var33] * var25 + this.field313[var33] * var24 + this.field305[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field276[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field310[var29];
                    short var37 = this.field276[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field284[var36] * var25 + this.field313[var36] * var24 + this.field305[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field284[var36] * var25 + this.field313[var36] * var24 + this.field305[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field276[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method143(this.field283[var29], this.field303[var29], var32, this.field302[var29]);
                    int var40 = method143(this.field283[var29], this.field303[var29], var35, this.field302[var29]);
                    int var41 = method143(this.field283[var29], this.field303[var29], var38, this.field302[var29]);
                    field297.field5137 = var6 * var30 + this.field298.field4832;
                    field297.method2222(var39, 255);
                    field297.field5137 = var6 * var33 + this.field298.field4832;
                    field297.method2222(var40, 255);
                    field297.field5137 = var6 * var36 + this.field298.field4832;
                    field297.method2222(var41, 255);
                }
                this.field305 = null;
                this.field313 = null;
                this.field284 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field311;
            float var45 = 3.0F / (float) (this.field311 / 2 + this.field311);
            field297.field5137 = this.field307.field4832;
            if (class245.field3895) {
                for (int var46 = 0; var46 < this.field292; var46++) {
                    short var47 = this.field276[var46];
                    if (var47 == 0) {
                        field297.method2252((float) this.field305[var46] * var45, false);
                        field297.method2252((float) this.field313[var46] * var45, false);
                        field297.method2252((float) this.field284[var46] * var45, false);
                    } else {
                        float var48 = var44 / (float) var47;
                        field297.method2252((float) this.field305[var46] * var48, false);
                        field297.method2252((float) this.field313[var46] * var48, false);
                        field297.method2252((float) this.field284[var46] * var48, false);
                    }
                    field297.field5137 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field292; var49++) {
                    short var50 = this.field276[var49];
                    if (var50 == 0) {
                        field297.method2219((float) this.field305[var49] * var45, (byte) -128);
                        field297.method2219((float) this.field313[var49] * var45, (byte) -127);
                        field297.method2219((float) this.field284[var49] * var45, (byte) -127);
                    } else {
                        float var51 = var44 / (float) var50;
                        field297.method2219((float) this.field305[var49] * var51, (byte) -127);
                        field297.method2219((float) this.field313[var49] * var51, (byte) -127);
                        field297.method2219((float) this.field284[var49] * var51, (byte) -126);
                    }
                    field297.field5137 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field297.field5137 = this.field304.field4832;
            if (class245.field3895) {
                for (int var52 = 0; var52 < this.field292; var52++) {
                    field297.method2252(this.field278[var52], false);
                    field297.method2252(this.field308[var52], false);
                    field297.field5137 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field292; var53++) {
                    field297.method2219(this.field278[var53], (byte) -128);
                    field297.method2219(this.field308[var53], (byte) -127);
                    field297.field5137 += var6 - 8;
                }
            }
        }
        field297.field5137 = this.field292 * var6;
        if (arg0) {
            if (class245.field3868) {
                ByteBuffer var54 = ByteBuffer.wrap(field297.field5124, 0, field297.field5137);
                if (this.field300 == null) {
                    this.field300 = new class205(true);
                    this.field300.method1396(var54);
                } else {
                    this.field300.method1395(var54);
                }
                if (arg1) {
                    this.field295.field4822 = true;
                    this.field295.field4824 = null;
                    this.field295.field4821 = this.field300;
                    this.field295.field4826 = var6;
                }
                if (arg2) {
                    this.field298.field4822 = true;
                    this.field298.field4824 = null;
                    this.field298.field4821 = this.field300;
                    this.field298.field4826 = var6;
                }
                if (arg3) {
                    this.field307.field4822 = true;
                    this.field307.field4824 = null;
                    this.field307.field4821 = this.field300;
                    this.field307.field4826 = var6;
                }
                if (arg4) {
                    this.field304.field4822 = true;
                    this.field304.field4824 = null;
                    this.field304.field4821 = this.field300;
                    this.field304.field4826 = var6;
                }
            } else {
                if (field315 == null || field315.capacity() < field297.field5137) {
                    field315 = ByteBuffer.allocateDirect(var6 * 100 + field297.field5137);
                } else {
                    field315.clear();
                }
                field315.put(field297.field5124, 0, field297.field5137);
                field315.flip();
                if (arg1) {
                    this.field295.field4822 = true;
                    this.field295.field4824 = field315;
                    this.field295.field4821 = null;
                    this.field295.field4826 = var6;
                }
                if (arg2) {
                    this.field298.field4822 = true;
                    this.field298.field4824 = field315;
                    this.field295.field4821 = null;
                    this.field298.field4826 = var6;
                }
                if (arg3) {
                    this.field307.field4822 = true;
                    this.field307.field4824 = field315;
                    this.field307.field4821 = null;
                    this.field307.field4826 = var6;
                }
                if (arg4) {
                    this.field304.field4822 = true;
                    this.field304.field4824 = field315;
                    this.field304.field4821 = null;
                    this.field304.field4826 = var6;
                }
            }
        } else if (class245.field3869) {
            class205 var55 = new class205();
            ByteBuffer var56 = ByteBuffer.wrap(field297.field5124, 0, field297.field5137);
            var55.method1396(var56);
            if (arg1) {
                this.field295.field4822 = true;
                this.field295.field4824 = null;
                this.field295.field4821 = var55;
                this.field295.field4826 = var6;
            }
            if (arg2) {
                this.field298.field4822 = true;
                this.field298.field4824 = null;
                this.field298.field4821 = var55;
                this.field298.field4826 = var6;
            }
            if (arg3) {
                this.field307.field4822 = true;
                this.field307.field4824 = null;
                this.field307.field4821 = var55;
                this.field307.field4826 = var6;
            }
            if (arg4) {
                this.field304.field4822 = true;
                this.field304.field4824 = null;
                this.field304.field4821 = var55;
                this.field304.field4826 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field297.field5137);
            var57.put(field297.field5124, 0, field297.field5137);
            var57.flip();
            if (arg1) {
                this.field295.field4822 = true;
                this.field295.field4824 = var57;
                this.field295.field4821 = null;
                this.field295.field4826 = var6;
            }
            if (arg2) {
                this.field298.field4822 = true;
                this.field298.field4824 = var57;
                this.field295.field4821 = null;
                this.field298.field4826 = var6;
            }
            if (arg3) {
                this.field307.field4822 = true;
                this.field307.field4824 = var57;
                this.field307.field4821 = null;
                this.field307.field4826 = var6;
            }
            if (arg4) {
                this.field304.field4822 = true;
                this.field304.field4824 = var57;
                this.field304.field4821 = null;
                this.field304.field4826 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ISIB)I", line = 765)
    private static final int method143(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class272.field4474[class67.method473(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class272.field4467.method412(103, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class272.field4467.method407(arg1 & 0xFFFF, (byte) 122);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!be", name = "j", descriptor = "()Z", line = 825)
    public final boolean method144() {
        if (this.field293 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field280; var1++) {
            this.field306[var1] <<= 0x4;
            this.field301[var1] <<= 0x4;
            this.field279[var1] <<= 0x4;
        }
        field322 = 0;
        field325 = 0;
        field330 = 0;
        return true;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(ZZZ)Lsm;", line = 847)
    public final class128 method145(boolean arg0, boolean arg1, boolean arg2) {
        return this.method194(arg0, arg1, arg2, field321, field320);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(FFF)I", line = 851)
    private static final int method146(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!be", name = "n", descriptor = "()V", line = 887)
    public final void method147() {
        if (this.field305 == null) {
            this.method171();
            return;
        }
        for (int var1 = 0; var1 < this.field280; var1++) {
            int var2 = this.field306[var1];
            this.field306[var1] = this.field279[var1];
            this.field279[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field292; var3++) {
            short var4 = this.field305[var3];
            this.field305[var3] = this.field284[var3];
            this.field284[var3] = (short) (-var4);
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
        if (this.field307 != null) {
            this.field307.field4822 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 4552)
    private class22() {
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lnb;IIZ)V", line = 4555)
    public class22(class135 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2122];
        this.field294 = new int[arg0.field2116 + 1];
        for (int var6 = 0; var6 < arg0.field2122; var6++) {
            if ((arg0.field2135 == null || arg0.field2135[var6] != 2) && (arg0.field2085 == null || arg0.field2085[var6] == -1 || !class272.field4467.method416(arg0.field2085[var6] & 0xFFFF, (byte) -31))) {
                var5[this.field272++] = var6;
                this.field294[arg0.field2102[var6]]++;
                this.field294[arg0.field2123[var6]]++;
                this.field294[arg0.field2098[var6]]++;
            }
        }
        long[] var7 = new long[this.field272];
        for (int var8 = 0; var8 < this.field272; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2085 != null) {
                var14 = arg0.field2085[var9];
                if (var14 != -1) {
                    var12 = class272.field4467.method399(var14 & 0xFFFF, 69);
                    var13 = class272.field4467.method406(-1, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field2093 != null && arg0.field2093[var9] != 0 || var14 != -1 && !class272.field4467.method402(true, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2114 != null) {
                var10 += arg0.field2114[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class306.method2140(var5, var7, 0);
        this.field280 = arg0.field2116;
        this.field291 = arg0.field2112;
        this.field306 = arg0.field2118;
        this.field301 = arg0.field2131;
        this.field279 = arg0.field2111;
        this.field281 = arg0.field2129;
        this.field312 = arg0.field2113;
        this.field287 = arg0.field2107;
        this.field282 = arg0.field2119;
        int var20 = this.field272 * 3;
        this.field305 = new short[var20];
        this.field313 = new short[var20];
        this.field284 = new short[var20];
        this.field276 = new short[var20];
        this.field278 = new float[var20];
        this.field308 = new float[var20];
        this.field283 = new short[this.field272];
        this.field302 = new byte[this.field272];
        this.field288 = new short[this.field272];
        this.field285 = new short[this.field272];
        this.field310 = new short[this.field272];
        this.field303 = new short[this.field272];
        if (arg0.field2097 != null) {
            this.field273 = new byte[this.field272];
        }
        if (arg0.field2127 != null) {
            this.field270 = new short[this.field272];
        }
        this.field286 = new class156();
        this.field295 = new class291();
        this.field298 = new class291();
        if (class322.field5287) {
            this.field307 = new class291();
        }
        this.field304 = new class291();
        this.field299 = new class291();
        this.field271 = (short) arg1;
        this.field311 = (short) arg2;
        this.field290 = new short[var20];
        field274 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field291; var22++) {
            int var23 = this.field294[var22];
            this.field294[var22] = var21;
            var21 += var23;
        }
        this.field294[this.field291] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2132 != null) {
            int var28 = arg0.field2126;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field272; var36++) {
                int var37 = var5[var36];
                if (arg0.field2132[var37] != -1) {
                    int var38 = arg0.field2132[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2102[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2123[var37];
                        } else {
                            var40 = arg0.field2098[var37];
                        }
                        int var41 = arg0.field2118[var40];
                        int var42 = arg0.field2131[var40];
                        int var43 = arg0.field2111[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2110[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2121[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2115[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2121[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2115[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2125[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2121[var44] / 1024.0F;
                        var49 = (float) arg0.field2115[var44] / 1024.0F;
                        var48 = (float) arg0.field2125[var44] / 1024.0F;
                    }
                    var27[var44] = method190(arg0.field2103[var44], arg0.field2095[var44], arg0.field2128[var44], arg0.field2134[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field272; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2088[var51] & 0xFFFF;
            short var53;
            if (arg0.field2085 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2085[var51];
            }
            int var54;
            if (arg0.field2132 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2132[var51];
            }
            int var55;
            if (arg0.field2093 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2093[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2110[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2102[var51];
                        int var67 = arg0.field2123[var51];
                        int var68 = arg0.field2098[var51];
                        short var69 = arg0.field2103[var54];
                        short var70 = arg0.field2095[var54];
                        short var71 = arg0.field2128[var54];
                        float var72 = (float) arg0.field2118[var69];
                        float var73 = (float) arg0.field2131[var69];
                        float var74 = (float) arg0.field2111[var69];
                        float var75 = (float) arg0.field2118[var70] - var72;
                        float var76 = (float) arg0.field2131[var70] - var73;
                        float var77 = (float) arg0.field2111[var70] - var74;
                        float var78 = (float) arg0.field2118[var71] - var72;
                        float var79 = (float) arg0.field2131[var71] - var73;
                        float var80 = (float) arg0.field2111[var71] - var74;
                        float var81 = (float) arg0.field2118[var66] - var72;
                        float var82 = (float) arg0.field2131[var66] - var73;
                        float var83 = (float) arg0.field2111[var66] - var74;
                        float var84 = (float) arg0.field2118[var67] - var72;
                        float var85 = (float) arg0.field2131[var67] - var73;
                        float var86 = (float) arg0.field2111[var67] - var74;
                        float var87 = (float) arg0.field2118[var68] - var72;
                        float var88 = (float) arg0.field2131[var68] - var73;
                        float var89 = (float) arg0.field2111[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2102[var51];
                        int var102 = arg0.field2123[var51];
                        int var103 = arg0.field2098[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2086[var54];
                        float var109 = (float) arg0.field2094[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2125[var54] & 0xFFFF) / 1024.0F;
                            method188(arg0.field2118[var101], arg0.field2131[var101], arg0.field2111[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field326;
                            var57 = field331;
                            method188(arg0.field2118[var102], arg0.field2131[var102], arg0.field2111[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field326;
                            var59 = field331;
                            method188(arg0.field2118[var103], arg0.field2131[var103], arg0.field2111[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field326;
                            var61 = field331;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2109[var54] / 256.0F;
                            float var113 = (float) arg0.field2089[var54] / 256.0F;
                            int var114 = arg0.field2118[var102] - arg0.field2118[var101];
                            int var115 = arg0.field2131[var102] - arg0.field2131[var101];
                            int var116 = arg0.field2111[var102] - arg0.field2111[var101];
                            int var117 = arg0.field2118[var103] - arg0.field2118[var101];
                            int var118 = arg0.field2131[var103] - arg0.field2131[var101];
                            int var119 = arg0.field2111[var103] - arg0.field2111[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2121[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2115[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2125[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method146(var126, var127, var128);
                            method138(arg0.field2118[var101], arg0.field2131[var101], arg0.field2111[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field333;
                            var57 = field327;
                            method138(arg0.field2118[var102], arg0.field2131[var102], arg0.field2111[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field333;
                            var59 = field327;
                            method138(arg0.field2118[var103], arg0.field2131[var103], arg0.field2111[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field333;
                            var61 = field327;
                        } else if (var65 == 3) {
                            method151(arg0.field2118[var101], arg0.field2131[var101], arg0.field2111[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field332;
                            var57 = field328;
                            method151(arg0.field2118[var102], arg0.field2131[var102], arg0.field2111[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field332;
                            var59 = field328;
                            method151(arg0.field2118[var103], arg0.field2131[var103], arg0.field2111[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field332;
                            var61 = field328;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method913();
            byte var129;
            if (arg0.field2135 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2135[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2102[var51];
                class30 var133 = arg0.field2105[var132];
                this.field288[var50] = this.method159(arg0, var132, var130, var133.field459, var133.field465, var133.field454, var133.field463, var56, var57);
                int var134 = arg0.field2123[var51];
                class30 var135 = arg0.field2105[var134];
                this.field285[var50] = this.method159(arg0, var134, (long) var62 + var130, var135.field459, var135.field465, var135.field454, var135.field463, var58, var59);
                int var136 = arg0.field2098[var51];
                class30 var137 = arg0.field2105[var136];
                this.field310[var50] = this.method159(arg0, var136, (long) var63 + var130, var137.field459, var137.field465, var137.field454, var137.field463, var60, var61);
            } else if (var129 == 1) {
                class104 var138 = arg0.field2120[var51];
                long var139 = (long) ((var54 << 2) + (var138.field1506 > 0 ? 1024 : 2048) + (var138.field1502 + 256 << 12) + (var138.field1504 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field288[var50] = this.method159(arg0, arg0.field2102[var51], var139, var138.field1506, var138.field1502, var138.field1504, 0, var56, var57);
                this.field285[var50] = this.method159(arg0, arg0.field2123[var51], (long) var62 + var139, var138.field1506, var138.field1502, var138.field1504, 0, var58, var59);
                this.field310[var50] = this.method159(arg0, arg0.field2098[var51], (long) var63 + var139, var138.field1506, var138.field1502, var138.field1504, 0, var60, var61);
            }
            if (arg0.field2085 == null) {
                this.field303[var50] = -1;
            } else {
                this.field303[var50] = arg0.field2085[var51];
            }
            if (this.field273 != null) {
                this.field273[var50] = (byte) arg0.field2097[var51];
            }
            this.field283[var50] = arg0.field2088[var51];
            if (arg0.field2093 != null) {
                this.field302[var50] = arg0.field2093[var51];
            }
            if (arg0.field2127 != null) {
                this.field270[var50] = arg0.field2127[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field272; var143++) {
            short var144 = this.field303[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field289 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field272; var147++) {
            short var148 = this.field303[var147];
            if (var146 != var148) {
                this.field289[var145++] = var147;
                var146 = var148;
            }
        }
        this.field289[var145] = this.field272;
        field274 = null;
        this.field305 = method173(this.field305, this.field292);
        this.field313 = method173(this.field313, this.field292);
        this.field284 = method173(this.field284, this.field292);
        this.field276 = method173(this.field276, this.field292);
        this.field278 = method195(this.field278, this.field292);
        this.field308 = method195(this.field308, this.field292);
    }

    @OriginalMember(owner = "client!be", name = "o", descriptor = "()I", line = 927)
    public final int method148() {
        return this.field271;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 931)
    public final void method149(int arg0) {
        int var2 = class272.field4470[arg0];
        int var3 = class272.field4480[arg0];
        for (int var4 = 0; var4 < this.field280; var4++) {
            int var5 = this.field306[var4] * var3 + this.field279[var4] * var2 >> 16;
            this.field279[var4] = this.field279[var4] * var3 - this.field306[var4] * var2 >> 16;
            this.field306[var4] = var5;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "p", descriptor = "()V", line = 951)
    private final void method150() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field291; var9++) {
            int var10 = this.field306[var9];
            int var11 = this.field301[var9];
            int var12 = this.field279[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field286.field2517 = (short) var1;
        this.field286.field2515 = (short) var4;
        this.field286.field2518 = (short) var2;
        this.field286.field2514 = (short) var5;
        this.field286.field2520 = (short) var3;
        this.field286.field2521 = (short) var6;
        this.field286.field2519 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field286.field2516 = true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII[FIF)V", line = 1020)
    private static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field332 = var16;
        field328 = var17;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V", line = 1064)
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field322 = 0;
            field325 = 0;
            field330 = 0;
            for (int var6 = 0; var6 < this.field280; var6++) {
                field322 += this.field306[var6];
                field325 += this.field301[var6];
                field330 += this.field279[var6];
                var5++;
            }
            if (var5 > 0) {
                field322 = field322 / var5 + arg1;
                field325 = field325 / var5 + arg2;
                field330 = field330 / var5 + arg3;
            } else {
                field322 = arg1;
                field325 = arg2;
                field330 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field280; var7++) {
                this.field306[var7] += arg1;
                this.field301[var7] += arg2;
                this.field279[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field280; var8++) {
                this.field306[var8] -= field322;
                this.field301[var8] -= field325;
                this.field279[var8] -= field330;
                if (arg3 != 0) {
                    int var9 = class272.field4470[arg3];
                    int var10 = class272.field4480[arg3];
                    int var11 = this.field306[var8] * var10 + this.field301[var8] * var9 + 32767 >> 16;
                    this.field301[var8] = this.field301[var8] * var10 + 32767 - this.field306[var8] * var9 >> 16;
                    this.field306[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class272.field4470[arg1];
                    int var13 = class272.field4480[arg1];
                    int var14 = this.field301[var8] * var13 + 32767 - this.field279[var8] * var12 >> 16;
                    this.field279[var8] = this.field301[var8] * var12 + this.field279[var8] * var13 + 32767 >> 16;
                    this.field301[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class272.field4470[arg2];
                    int var16 = class272.field4480[arg2];
                    int var17 = this.field306[var8] * var16 + this.field279[var8] * var15 + 32767 >> 16;
                    this.field279[var8] = this.field279[var8] * var16 + 32767 - this.field306[var8] * var15 >> 16;
                    this.field306[var8] = var17;
                }
                this.field306[var8] += field322;
                this.field301[var8] += field325;
                this.field279[var8] += field330;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field280; var18++) {
                this.field306[var18] -= field322;
                this.field301[var18] -= field325;
                this.field279[var18] -= field330;
                this.field306[var18] = this.field306[var18] * arg1 / 128;
                this.field301[var18] = this.field301[var18] * arg2 / 128;
                this.field279[var18] = this.field279[var18] * arg3 / 128;
                this.field306[var18] += field322;
                this.field301[var18] += field325;
                this.field279[var18] += field330;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field272; var19++) {
                int var20 = (this.field302[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field302[var19] = (byte) var20;
            }
            this.field298.field4822 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field272; var21++) {
                int var22 = this.field283[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field283[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field298.field4822 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "q", descriptor = "()V", line = 1259)
    public final void method153() {
        int var10002;
        if (this.field281 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field280; var3++) {
                int var4 = this.field281[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field293 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field293[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field280) {
                int var7 = this.field281[var6] & 0xFF;
                this.field293[var7][var1[var7]++] = var6++;
            }
            this.field281 = null;
        }
        if (this.field273 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field272; var10++) {
            int var11 = this.field273[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field316 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field316[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field272) {
            int var14 = this.field273[var13] & 0xFF;
            this.field316[var14][var8[var14]++] = var13++;
        }
        this.field273 = null;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()I", line = 1351)
    public final int method154() {
        if (!this.field286.field2516) {
            this.method150();
        }
        return this.field286.field2520;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[IIIIZ)V", line = 1360)
    public final void method155(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field322 = 0;
            field325 = 0;
            field330 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field293.length) {
                    int[] var14 = this.field293[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field322 += this.field306[var16];
                        field325 += this.field301[var16];
                        field330 += this.field279[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field322 = field322 / var11 + var8;
                field325 = field325 / var11 + var9;
                field330 = field330 / var11 + var10;
            } else {
                field322 = var8;
                field325 = var9;
                field330 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field293.length) {
                    int[] var22 = this.field293[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field306[var24] += var17;
                        this.field301[var24] += var18;
                        this.field279[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field293.length) {
                    int[] var27 = this.field293[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field306[var29] -= field322;
                        this.field301[var29] -= field325;
                        this.field279[var29] -= field330;
                        if (arg4 != 0) {
                            int var30 = class272.field4470[arg4];
                            int var31 = class272.field4480[arg4];
                            int var32 = this.field306[var29] * var31 + this.field301[var29] * var30 + 32767 >> 16;
                            this.field301[var29] = this.field301[var29] * var31 + 32767 - this.field306[var29] * var30 >> 16;
                            this.field306[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class272.field4470[arg2];
                            int var34 = class272.field4480[arg2];
                            int var35 = this.field301[var29] * var34 + 32767 - this.field279[var29] * var33 >> 16;
                            this.field279[var29] = this.field301[var29] * var33 + this.field279[var29] * var34 + 32767 >> 16;
                            this.field301[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class272.field4470[arg3];
                            int var37 = class272.field4480[arg3];
                            int var38 = this.field306[var29] * var37 + this.field279[var29] * var36 + 32767 >> 16;
                            this.field279[var29] = this.field279[var29] * var37 + 32767 - this.field306[var29] * var36 >> 16;
                            this.field306[var29] = var38;
                        }
                        this.field306[var29] += field322;
                        this.field301[var29] += field325;
                        this.field279[var29] += field330;
                    }
                }
            }
            if (arg5 && this.field305 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field293.length) {
                        int[] var41 = this.field293[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field294[var43];
                            int var45 = this.field294[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field290[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class272.field4470[arg4];
                                    int var49 = class272.field4480[arg4];
                                    int var50 = this.field313[var47] * var48 + this.field305[var47] * var49 + 32767 >> 16;
                                    this.field313[var47] = (short) (this.field313[var47] * var49 + 32767 - this.field305[var47] * var48 >> 16);
                                    this.field305[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class272.field4470[arg2];
                                    int var52 = class272.field4480[arg2];
                                    int var53 = this.field313[var47] * var52 + 32767 - this.field284[var47] * var51 >> 16;
                                    this.field284[var47] = (short) (this.field313[var47] * var51 + this.field284[var47] * var52 + 32767 >> 16);
                                    this.field313[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class272.field4470[arg3];
                                    int var55 = class272.field4480[arg3];
                                    int var56 = this.field305[var47] * var55 + this.field284[var47] * var54 + 32767 >> 16;
                                    this.field284[var47] = (short) (this.field284[var47] * var55 + 32767 - this.field305[var47] * var54 >> 16);
                                    this.field305[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field307 != null) {
                    this.field307.field4822 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field293.length) {
                    int[] var59 = this.field293[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field306[var61] -= field322;
                        this.field301[var61] -= field325;
                        this.field279[var61] -= field330;
                        this.field306[var61] = this.field306[var61] * arg2 >> 7;
                        this.field301[var61] = this.field301[var61] * arg3 >> 7;
                        this.field279[var61] = this.field279[var61] * arg4 >> 7;
                        this.field306[var61] += field322;
                        this.field301[var61] += field325;
                        this.field279[var61] += field330;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field316 != null && this.field302 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field316.length) {
                        int[] var64 = this.field316[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field302[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field302[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field298.field4822 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field316 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field316.length) {
                    int[] var70 = this.field316[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field283[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field283[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field298.field4822 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Lkm;", line = 1767)
    public final class162 method156(int arg0, int arg1, int arg2) {
        this.field277 = false;
        if (this.field309 != null) {
            this.field305 = this.field309.field5413;
            this.field313 = this.field309.field5415;
            this.field284 = this.field309.field5414;
            this.field276 = this.field309.field5416;
            this.field309 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!be", name = "r", descriptor = "()I", line = 1780)
    public final int method157() {
        return this.field311;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 1784)
    public final void method158(int arg0) {
        int var2 = class272.field4470[arg0];
        int var3 = class272.field4480[arg0];
        for (int var4 = 0; var4 < this.field280; var4++) {
            int var5 = this.field301[var4] * var3 - this.field279[var4] * var2 >> 16;
            this.field279[var4] = this.field301[var4] * var2 + this.field279[var4] * var3 >> 16;
            this.field301[var4] = var5;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lnb;IJIIIIFF)S", line = 1804)
    private final short method159(class135 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field294[arg1];
        int var12 = this.field294[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field290[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field274[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field290[var13] = (short) (this.field292 + 1);
        field274[var13] = arg2;
        this.field305[this.field292] = (short) arg3;
        this.field313[this.field292] = (short) arg4;
        this.field284[this.field292] = (short) arg5;
        this.field276[this.field292] = (short) arg6;
        this.field278[this.field292] = arg7;
        this.field308[this.field292] = arg8;
        return (short) (this.field292++);
    }

    @OriginalMember(owner = "client!be", name = "s", descriptor = "()V", line = 1841)
    private final void method160() {
        GL var1 = class245.field3884;
        if (this.field272 == 0) {
            return;
        }
        if (this.field296 != 0) {
            this.method142(true, !this.field295.field4822 && (this.field296 & 0x1) != 0, !this.field298.field4822 && (this.field296 & 0x2) != 0, this.field307 != null && !this.field307.field4822 && (this.field296 & 0x4) != 0, false);
        }
        this.method142(false, !this.field295.field4822, !this.field298.field4822, this.field307 != null && !this.field307.field4822, !this.field304.field4822);
        if (!this.field299.field4822) {
            this.method193();
        }
        if (this.field275 != 0) {
            if ((this.field275 & 0x1) != 0) {
                this.field306 = null;
                this.field301 = null;
                this.field279 = null;
                this.field290 = null;
                this.field294 = null;
            }
            if ((this.field275 & 0x2) != 0) {
                this.field283 = null;
                this.field302 = null;
            }
            if ((this.field275 & 0x4) != 0) {
                this.field305 = null;
                this.field313 = null;
                this.field284 = null;
                this.field276 = null;
            }
            if ((this.field275 & 0x8) != 0) {
                this.field278 = null;
                this.field308 = null;
            }
            if ((this.field275 & 0x10) != 0) {
                this.field288 = null;
                this.field285 = null;
                this.field310 = null;
            }
            this.field275 = 0;
        }
        class205 var2 = null;
        if (this.field295.field4821 != null) {
            this.field295.field4821.method1397();
            var2 = this.field295.field4821;
            var1.glVertexPointer(3, 5126, this.field295.field4826, (long) this.field295.field4832);
        }
        if (this.field298.field4821 != null) {
            if (this.field298.field4821 != var2) {
                this.field298.field4821.method1397();
                var2 = this.field298.field4821;
            }
            var1.glColorPointer(4, 5121, this.field298.field4826, (long) this.field298.field4832);
        }
        if (class322.field5287 && this.field307.field4821 != null) {
            if (this.field307.field4821 != var2) {
                this.field307.field4821.method1397();
                var2 = this.field307.field4821;
            }
            var1.glNormalPointer(5126, this.field307.field4826, (long) this.field307.field4832);
        }
        if (this.field304.field4821 != null) {
            if (this.field304.field4821 != var2) {
                this.field304.field4821.method1397();
                class205 var3 = this.field304.field4821;
            }
            var1.glTexCoordPointer(2, 5126, this.field304.field4826, (long) this.field304.field4832);
        }
        if (this.field299.field4821 != null) {
            this.field299.field4821.method1398();
        }
        if (this.field295.field4821 == null || this.field298.field4821 == null || class322.field5287 && this.field307.field4821 == null || this.field304.field4821 == null) {
            if (class245.field3869) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field295.field4821 == null) {
                this.field295.field4824.position(this.field295.field4832);
                var1.glVertexPointer(3, 5126, this.field295.field4826, this.field295.field4824);
            }
            if (this.field298.field4821 == null) {
                this.field298.field4824.position(this.field298.field4832);
                var1.glColorPointer(4, 5121, this.field298.field4826, this.field298.field4824);
            }
            if (class322.field5287 && this.field307.field4821 == null) {
                this.field307.field4824.position(this.field307.field4832);
                var1.glNormalPointer(5126, this.field307.field4826, this.field307.field4824);
            }
            if (this.field304.field4821 == null) {
                this.field304.field4824.position(this.field304.field4832);
                var1.glTexCoordPointer(2, 5126, this.field304.field4826, this.field304.field4824);
            }
        }
        if (this.field299.field4821 == null && class245.field3869) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field289.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field289[var5];
            int var7 = this.field289[var5 + 1];
            short var8 = this.field303[var6];
            if (var8 == -1) {
                class245.method1729(-1);
                class7.method53(0, 0, true);
            } else {
                class272.field4467.method400((byte) 111, var8 & 0xFFFF);
            }
            if (this.field299.field4821 == null) {
                this.field299.field4824.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field299.field4824);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "t", descriptor = "()V", line = 2012)
    public static final void method161() {
        field314 = new class22();
        field317 = new class22();
        field318 = new class22();
        field319 = new class22();
        field320 = new class22();
        field321 = new class22();
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V", line = 2023)
    public final void method162() {
        for (int var1 = 0; var1 < this.field280; var1++) {
            this.field306[var1] = this.field306[var1] + 7 >> 4;
            this.field301[var1] = this.field301[var1] + 7 >> 4;
            this.field279[var1] = this.field279[var1] + 7 >> 4;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(SS)V", line = 2039)
    public final void method163(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field272; var3++) {
            if (this.field283[var3] == arg0) {
                this.field283[var3] = arg1;
            }
        }
        this.field298.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()I", line = 2053)
    public final int method164() {
        if (!this.field286.field2516) {
            this.method150();
        }
        return this.field286.field2519;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIII)Z", line = 2059)
    private final boolean method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!be", name = "k", descriptor = "()V", line = 2076)
    public final void method166() {
        for (int var1 = 0; var1 < this.field280; var1++) {
            int var2 = this.field279[var1];
            this.field279[var1] = this.field306[var1];
            this.field306[var1] = -var2;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "m", descriptor = "()V", line = 2092)
    public final void method167() {
        for (int var1 = 0; var1 < this.field280; var1++) {
            this.field306[var1] = -this.field306[var1];
            this.field279[var1] = -this.field279[var1];
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "u", descriptor = "()V", line = 2106)
    public final void method168() {
        if (this.field305 == null) {
            this.method167();
            return;
        }
        for (int var1 = 0; var1 < this.field280; var1++) {
            this.field306[var1] = -this.field306[var1];
            this.field279[var1] = -this.field279[var1];
        }
        for (int var2 = 0; var2 < this.field292; var2++) {
            this.field305[var2] = (short) (-this.field305[var2]);
            this.field284[var2] = (short) (-this.field284[var2]);
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
        if (this.field307 != null) {
            this.field307.field4822 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V", line = 2141)
    public final void method169(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field280; var4++) {
            this.field306[var4] = this.field306[var4] * arg0 >> 7;
            this.field301[var4] = this.field301[var4] * arg1 >> 7;
            this.field279[var4] = this.field279[var4] * arg2 >> 7;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "v", descriptor = "()V", line = 2154)
    public static void method170() {
        field274 = null;
        field297 = null;
        field315 = null;
        field314 = null;
        field317 = null;
        field318 = null;
        field319 = null;
        field320 = null;
        field321 = null;
        field329 = null;
        field324 = null;
    }

    @OriginalMember(owner = "client!be", name = "i", descriptor = "()V", line = 2169)
    public final void method171() {
        for (int var1 = 0; var1 < this.field280; var1++) {
            int var2 = this.field306[var1];
            this.field306[var1] = this.field279[var1];
            this.field279[var1] = -var2;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(SS)V", line = 2186)
    public final void method172(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field272; var3++) {
            if (this.field303[var3] == arg0) {
                this.field303[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class272.field4467.method412(103, arg0 & 0xFFFF);
            var5 = class272.field4467.method407(arg0 & 0xFFFF, (byte) 118);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class272.field4467.method412(103, arg1 & 0xFFFF);
            var7 = class272.field4467.method407(arg1 & 0xFFFF, (byte) 120);
        }
        if (var4 != var6 || var5 != var7) {
            this.field298.field4822 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([SI)[S", line = 2221)
    private static final short[] method173(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class298.method2099(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "()I", line = 2227)
    public final int method174() {
        if (!this.field286.field2516) {
            this.method150();
        }
        return this.field286.field2517;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()Z", line = 2235)
    public final boolean method175() {
        return this.field277 && this.field306 != null && this.field305 != null;
    }

    @OriginalMember(owner = "client!be", name = "w", descriptor = "()V", line = 2240)
    public final void method176() {
        for (int var1 = 0; var1 < this.field280; var1++) {
            this.field279[var1] = -this.field279[var1];
        }
        if (this.field284 != null) {
            for (int var2 = 0; var2 < this.field292; var2++) {
                this.field284[var2] = (short) (-this.field284[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field272; var3++) {
            short var4 = this.field288[var3];
            this.field288[var3] = this.field310[var3];
            this.field310[var3] = var4;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
        if (this.field307 != null) {
            this.field307.field4822 = false;
        }
        this.field299.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 2276)
    public final void method177(int arg0) {
        this.field271 = (short) arg0;
        this.field298.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZZZZZZZZZZ)Lbe;", line = 2283)
    public final class22 method178(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class22 var12 = new class22();
        var12.field280 = this.field280;
        var12.field291 = this.field291;
        var12.field292 = this.field292;
        var12.field272 = this.field272;
        if (arg0) {
            var12.field306 = this.field306;
            var12.field279 = this.field279;
        } else {
            var12.field306 = class265.method1869(this.field306, true);
            var12.field279 = class265.method1869(this.field279, true);
        }
        if (arg1) {
            var12.field301 = this.field301;
        } else {
            var12.field301 = class265.method1869(this.field301, true);
        }
        if (arg0 && arg1) {
            var12.field295 = this.field295;
            var12.field286 = this.field286;
        } else {
            var12.field295 = new class291();
            var12.field286 = new class156();
        }
        if (arg2) {
            var12.field283 = this.field283;
        } else {
            var12.field283 = class157.method1122(1, this.field283);
        }
        if (arg3) {
            var12.field302 = this.field302;
        } else {
            var12.field302 = class32.method269(112, this.field302);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class322.field5287) {
            var12.field298 = new class291();
        } else {
            var12.field298 = this.field298;
        }
        if (arg5) {
            var12.field305 = this.field305;
            var12.field313 = this.field313;
            var12.field284 = this.field284;
            var12.field276 = this.field276;
        } else {
            var12.field305 = class157.method1122(1, this.field305);
            var12.field313 = class157.method1122(1, this.field313);
            var12.field284 = class157.method1122(1, this.field284);
            var12.field276 = class157.method1122(1, this.field276);
        }
        if (!class322.field5287) {
            var12.field307 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field307 = this.field307;
        } else {
            var12.field307 = new class291();
        }
        if (arg8) {
            var12.field278 = this.field278;
            var12.field308 = this.field308;
            var12.field304 = this.field304;
        } else {
            var12.field278 = class14.method104(this.field278, true);
            var12.field308 = class14.method104(this.field308, true);
            var12.field304 = new class291();
        }
        if (arg9) {
            var12.field288 = this.field288;
            var12.field285 = this.field285;
            var12.field310 = this.field310;
            var12.field299 = this.field299;
        } else {
            var12.field288 = class157.method1122(1, this.field288);
            var12.field285 = class157.method1122(1, this.field285);
            var12.field310 = class157.method1122(1, this.field310);
            var12.field299 = new class291();
        }
        if (arg10) {
            var12.field303 = this.field303;
        } else {
            var12.field303 = class157.method1122(1, this.field303);
        }
        var12.field281 = this.field281;
        var12.field293 = this.field293;
        var12.field273 = this.field273;
        var12.field316 = this.field316;
        var12.field289 = this.field289;
        var12.field290 = this.field290;
        var12.field294 = this.field294;
        var12.field271 = this.field271;
        var12.field311 = this.field311;
        var12.field287 = this.field287;
        var12.field282 = this.field282;
        var12.field312 = this.field312;
        var12.field270 = this.field270;
        return var12;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)V", line = 2425)
    public final void method179(int arg0) {
        this.field311 = (short) arg0;
        if (this.field307 != null) {
            this.field307.field4822 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIIJILdh;)V", line = 2437)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class145 arg10) {
        if (this.field292 == 0) {
            return;
        }
        if (!this.field286.field2516) {
            this.method150();
        }
        short var13 = this.field286.field2519;
        short var14 = this.field286.field2518;
        short var15 = this.field286.field2514;
        if (arg10 != null) {
            arg10.method1017(arg0, arg9, arg5, arg6, arg7);
        }
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class361.field5696) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class293.field4861) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class296.field4918) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class9.field110) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class272.field4470[arg0];
            var27 = class272.field4480[arg0];
        }
        if (arg8 > 0L && class295.field4900 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (client.field2074 >= var28 && client.field2074 <= var29 && class214.field3282 >= var30 && class214.field3282 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field286.field2517;
                short var37 = this.field286.field2515;
                short var38 = this.field286.field2520;
                short var39 = this.field286.field2521;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (client.field2074 >= var32 && client.field2074 <= var33 && class214.field3282 >= var34 && class214.field3282 <= var35) {
                    if (this.field1966) {
                        class41.field621[class297.field4925++] = arg8;
                    } else {
                        if (field329.length < this.field292) {
                            field329 = new int[this.field292];
                            field324 = new int[this.field292];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field291) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field272) {
                                        break label124;
                                    }
                                    short var80 = this.field288[var79];
                                    short var81 = this.field285[var79];
                                    short var82 = this.field310[var79];
                                    if (this.method165(client.field2074, class214.field3282, field324[var80], field324[var81], field324[var82], field329[var80], field329[var81], field329[var82])) {
                                        class41.field621[class297.field4925++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field306[var59];
                            int var61 = this.field301[var59];
                            int var62 = this.field279[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field294[var59];
                            int var76 = this.field294[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field290[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field329[var78] = var73;
                                field324[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class245.field3884;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method160();
        var83.glPopMatrix();
        if (arg10 != null) {
            arg10.method1032(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZZ)Lsm;", line = 2720)
    public final class128 method181(boolean arg0, boolean arg1, boolean arg2) {
        return this.method194(arg0, arg1, arg2, field317, field314);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIJ)V", line = 2724)
    public final void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field292 == 0) {
            return;
        }
        GL var10 = class245.field3884;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method160();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()I", line = 2747)
    public final int method183() {
        if (!this.field286.field2516) {
            this.method150();
        }
        return this.field286.field2521;
    }

    @OriginalMember(owner = "client!be", name = "x", descriptor = "()V", line = 2754)
    public final void method184() {
        if (this.field305 == null) {
            this.method166();
            return;
        }
        for (int var1 = 0; var1 < this.field280; var1++) {
            int var2 = this.field279[var1];
            this.field279[var1] = this.field306[var1];
            this.field306[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field292; var3++) {
            short var4 = this.field284[var3];
            this.field284[var3] = this.field305[var3];
            this.field305[var3] = (short) (-var4);
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
        if (this.field307 != null) {
            this.field307.field4822 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lkm;IIIZ)V", line = 2795)
    public final void method185(class162 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class22 var6 = (class22) arg0;
        if (this.field272 == 0 || var6.field272 == 0) {
            return;
        }
        int var7 = var6.field291;
        int[] var8 = var6.field306;
        int[] var9 = var6.field301;
        int[] var10 = var6.field279;
        short[] var11 = var6.field305;
        short[] var12 = var6.field313;
        short[] var13 = var6.field284;
        short[] var14 = var6.field276;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field309 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field309.field5413;
            var16 = this.field309.field5415;
            var17 = this.field309.field5414;
            var18 = this.field309.field5416;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field309 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field309.field5413;
            var20 = var6.field309.field5415;
            var21 = var6.field309.field5414;
            var22 = var6.field309.field5416;
        }
        int[] var23 = var6.field294;
        short[] var24 = var6.field290;
        if (!var6.field286.field2516) {
            var6.method150();
        }
        short var25 = var6.field286.field2518;
        short var26 = var6.field286.field2514;
        short var27 = var6.field286.field2517;
        short var28 = var6.field286.field2515;
        short var29 = var6.field286.field2520;
        short var30 = var6.field286.field2521;
        for (int var31 = 0; var31 < this.field291; var31++) {
            int var32 = this.field301[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field306[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field279[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field294[var31];
                        int var37 = this.field294[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field290[var38] - 1;
                            if (var35 == -1 || this.field276[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field309 = new class333();
                                            var15 = this.field309.field5413 = class157.method1122(1, this.field305);
                                            var16 = this.field309.field5415 = class157.method1122(1, this.field313);
                                            var17 = this.field309.field5414 = class157.method1122(1, this.field284);
                                            var18 = this.field309.field5416 = class157.method1122(1, this.field276);
                                        }
                                        if (var19 == null) {
                                            class333 var44 = var6.field309 = new class333();
                                            var19 = var44.field5413 = class157.method1122(1, var11);
                                            var20 = var44.field5415 = class157.method1122(1, var12);
                                            var21 = var44.field5414 = class157.method1122(1, var13);
                                            var22 = var44.field5416 = class157.method1122(1, var14);
                                        }
                                        short var45 = this.field305[var35];
                                        short var46 = this.field313[var35];
                                        short var47 = this.field284[var35];
                                        short var48 = this.field276[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field294[var31];
                                        int var58 = this.field294[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field290[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "l", descriptor = "()I", line = 3036)
    public final int method186() {
        if (!this.field286.field2516) {
            this.method150();
        }
        return this.field286.field2515;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 3043)
    public final void method187(int arg0) {
        int var2 = class272.field4470[arg0];
        int var3 = class272.field4480[arg0];
        for (int var4 = 0; var4 < this.field280; var4++) {
            int var5 = this.field306[var4] * var3 + this.field301[var4] * var2 >> 16;
            this.field301[var4] = this.field301[var4] * var3 - this.field306[var4] * var2 >> 16;
            this.field306[var4] = var5;
        }
        this.field286.field2516 = false;
        this.field295.field4822 = false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3068)
    private static final void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field326 = var16;
        field331 = var17;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILbe;[[I[[IIII)V", line = 3113)
    public final void method189(int arg0, int arg1, class22 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field286.field2516) {
            arg2.method150();
        }
        int var9 = arg2.field286.field2517 + arg5;
        int var10 = arg2.field286.field2515 + arg5;
        int var11 = arg2.field286.field2520 + arg7;
        int var12 = arg2.field286.field2521 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field291; var17++) {
                int var18 = this.field306[var17] + arg5;
                int var19 = this.field279[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field301[var17] = this.field301[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field286.field2518;
            for (int var28 = 0; var28 < this.field291; var28++) {
                int var29 = (this.field301[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field306[var28] + arg5;
                    int var31 = this.field279[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field301[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method837(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field286.field2514 - arg2.field286.field2518;
            for (int var42 = 0; var42 < this.field291; var42++) {
                int var43 = this.field306[var42] + arg5;
                int var44 = this.field279[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field301[var42] = var51 + this.field301[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field286.field2514 - arg2.field286.field2518;
            for (int var53 = 0; var53 < this.field291; var53++) {
                int var54 = this.field306[var53] + arg5;
                int var55 = this.field279[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field301[var53] = ((this.field301[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field295.field4822 = false;
        this.field286.field2516 = false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIFFF)[F", line = 3316)
    private static final float[] method190(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3388)
    public final void method191(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field322 = 0;
            field325 = 0;
            field330 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field293.length) {
                    int[] var16 = this.field293[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field312 == null || (arg6 & this.field312[var18]) != 0) {
                            field322 += this.field306[var18];
                            field325 += this.field301[var18];
                            field330 += this.field279[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field322 = field322 / var13 + var10;
                field325 = field325 / var13 + var11;
                field330 = field330 / var13 + var12;
                field323 = true;
            } else {
                field322 = var10;
                field325 = var11;
                field330 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field293.length) {
                    int[] var27 = this.field293[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field312 == null || (arg6 & this.field312[var29]) != 0) {
                            this.field306[var29] += var22;
                            this.field301[var29] += var23;
                            this.field279[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field293.length) {
                        int[] var92 = this.field293[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field312 == null || (arg6 & this.field312[var94]) != 0) {
                                this.field306[var94] -= field322;
                                this.field301[var94] -= field325;
                                this.field279[var94] -= field330;
                                if (arg4 != 0) {
                                    int var95 = class272.field4470[arg4];
                                    int var96 = class272.field4480[arg4];
                                    int var97 = this.field306[var94] * var96 + this.field301[var94] * var95 + 32767 >> 16;
                                    this.field301[var94] = this.field301[var94] * var96 + 32767 - this.field306[var94] * var95 >> 16;
                                    this.field306[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class272.field4470[arg2];
                                    int var99 = class272.field4480[arg2];
                                    int var100 = this.field301[var94] * var99 + 32767 - this.field279[var94] * var98 >> 16;
                                    this.field279[var94] = this.field301[var94] * var98 + this.field279[var94] * var99 + 32767 >> 16;
                                    this.field301[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class272.field4470[arg3];
                                    int var102 = class272.field4480[arg3];
                                    int var103 = this.field306[var94] * var102 + this.field279[var94] * var101 + 32767 >> 16;
                                    this.field279[var94] = this.field279[var94] * var102 + 32767 - this.field306[var94] * var101 >> 16;
                                    this.field306[var94] = var103;
                                }
                                this.field306[var94] += field322;
                                this.field301[var94] += field325;
                                this.field279[var94] += field330;
                            }
                        }
                    }
                }
                if (arg5 && this.field305 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field293.length) {
                            int[] var106 = this.field293[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field312 == null || (arg6 & this.field312[var108]) != 0) {
                                    int var109 = this.field294[var108];
                                    int var110 = this.field294[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field290[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class272.field4470[arg4];
                                            int var114 = class272.field4480[arg4];
                                            int var115 = this.field313[var112] * var113 + this.field305[var112] * var114 + 32767 >> 16;
                                            this.field313[var112] = (short) (this.field313[var112] * var114 + 32767 - this.field305[var112] * var113 >> 16);
                                            this.field305[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class272.field4470[arg2];
                                            int var117 = class272.field4480[arg2];
                                            int var118 = this.field313[var112] * var117 + 32767 - this.field284[var112] * var116 >> 16;
                                            this.field284[var112] = (short) (this.field313[var112] * var116 + this.field284[var112] * var117 + 32767 >> 16);
                                            this.field313[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class272.field4470[arg3];
                                            int var120 = class272.field4480[arg3];
                                            int var121 = this.field305[var112] * var120 + this.field284[var112] * var119 + 32767 >> 16;
                                            this.field284[var112] = (short) (this.field284[var112] * var120 + 32767 - this.field305[var112] * var119 >> 16);
                                            this.field305[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field307 != null) {
                        this.field307.field4822 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field323) {
                    int var36 = arg7[6] * field330 + arg7[0] * field322 + arg7[3] * field325 + 16384 >> 15;
                    int var37 = arg7[7] * field330 + arg7[1] * field322 + arg7[4] * field325 + 16384 >> 15;
                    int var38 = arg7[8] * field330 + arg7[2] * field322 + arg7[5] * field325 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field322 = var39;
                    field325 = var40;
                    field330 = var41;
                    field323 = false;
                }
                int[] var42 = new int[9];
                int var43 = class272.field4480[arg2] >> 1;
                int var44 = class272.field4470[arg2] >> 1;
                int var45 = class272.field4480[arg3] >> 1;
                int var46 = class272.field4470[arg3] >> 1;
                int var47 = class272.field4480[arg4] >> 1;
                int var48 = class272.field4470[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field330 + var42[0] * -field322 + var42[1] * -field325 + 16384 >> 15;
                int var52 = var42[5] * -field330 + var42[3] * -field322 + var42[4] * -field325 + 16384 >> 15;
                int var53 = var42[8] * -field330 + var42[6] * -field322 + var42[7] * -field325 + 16384 >> 15;
                int var54 = field322 + var51;
                int var55 = field325 + var52;
                int var56 = field330 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field293.length) {
                        int[] var81 = this.field293[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field312 == null || (arg6 & this.field312[var83]) != 0) {
                                int var84 = this.field279[var83] * var68[2] + this.field306[var83] * var68[0] + this.field301[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field279[var83] * var68[5] + this.field306[var83] * var68[3] + this.field301[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field279[var83] * var68[8] + this.field306[var83] * var68[6] + this.field301[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field306[var83] = var87;
                                this.field301[var83] = var88;
                                this.field279[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field293.length) {
                        int[] var174 = this.field293[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field312 == null || (arg6 & this.field312[var176]) != 0) {
                                this.field306[var176] -= field322;
                                this.field301[var176] -= field325;
                                this.field279[var176] -= field330;
                                this.field306[var176] = this.field306[var176] * arg2 >> 7;
                                this.field301[var176] = this.field301[var176] * arg3 >> 7;
                                this.field279[var176] = this.field279[var176] * arg4 >> 7;
                                this.field306[var176] += field322;
                                this.field301[var176] += field325;
                                this.field279[var176] += field330;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field323) {
                    int var128 = arg7[6] * field330 + arg7[0] * field322 + arg7[3] * field325 + 16384 >> 15;
                    int var129 = arg7[7] * field330 + arg7[1] * field322 + arg7[4] * field325 + 16384 >> 15;
                    int var130 = arg7[8] * field330 + arg7[2] * field322 + arg7[5] * field325 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field322 = var131;
                    field325 = var132;
                    field330 = var133;
                    field323 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field322 * var134 + 16384 >> 15;
                int var138 = -field325 * var135 + 16384 >> 15;
                int var139 = -field330 * var136 + 16384 >> 15;
                int var140 = field322 + var137;
                int var141 = field325 + var138;
                int var142 = field330 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field293.length) {
                        int[] var163 = this.field293[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field312 == null || (arg6 & this.field312[var165]) != 0) {
                                int var166 = this.field279[var165] * var150[2] + this.field306[var165] * var150[0] + this.field301[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field279[var165] * var150[5] + this.field306[var165] * var150[3] + this.field301[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field279[var165] * var150[8] + this.field306[var165] * var150[6] + this.field301[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field306[var165] = var169;
                                this.field301[var165] = var170;
                                this.field279[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field316 != null && this.field302 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field316.length) {
                        int[] var179 = this.field316[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field270 == null || (arg6 & this.field270[var181]) != 0) {
                                int var182 = (this.field302[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field302[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field298.field4822 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field316 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field316.length) {
                    int[] var185 = this.field316[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field270 == null || (arg6 & this.field270[var187]) != 0) {
                            int var188 = this.field283[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field283[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field298.field4822 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()I", line = 4179)
    public final int method192() {
        if (!this.field286.field2516) {
            this.method150();
        }
        return this.field286.field2518;
    }

    @OriginalMember(owner = "client!be", name = "y", descriptor = "()V", line = 4185)
    private final void method193() {
        if (field297.field5124.length < this.field272 * 12) {
            field297 = new class313((this.field272 + 100) * 12);
        } else {
            field297.field5137 = 0;
        }
        if (class245.field3895) {
            for (int var1 = 0; var1 < this.field272; var1++) {
                field297.method2222(this.field288[var1], 255);
                field297.method2222(this.field285[var1], 255);
                field297.method2222(this.field310[var1], 255);
            }
        } else {
            for (int var2 = 0; var2 < this.field272; var2++) {
                field297.method2210((byte) -111, this.field288[var2]);
                field297.method2210((byte) -126, this.field285[var2]);
                field297.method2210((byte) -26, this.field310[var2]);
            }
        }
        if (!class245.field3869) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field297.field5137);
            var5.put(field297.field5124, 0, field297.field5137);
            var5.flip();
            this.field299.field4822 = true;
            this.field299.field4824 = var5;
            this.field299.field4821 = null;
            return;
        }
        class205 var3 = new class205();
        ByteBuffer var4 = ByteBuffer.wrap(field297.field5124, 0, field297.field5137);
        var3.method1396(var4);
        this.field299.field4822 = true;
        this.field299.field4824 = null;
        this.field299.field4821 = var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZZLbe;Lbe;)Lsm;", line = 4251)
    private final class128 method194(boolean arg0, boolean arg1, boolean arg2, class22 arg3, class22 arg4) {
        arg3.field280 = this.field280;
        arg3.field291 = this.field291;
        arg3.field292 = this.field292;
        arg3.field272 = this.field272;
        arg3.field271 = this.field271;
        arg3.field311 = this.field311;
        arg3.field296 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field306 == null || arg3.field306.length < this.field280) {
            arg3.field306 = new int[this.field280 + 100];
            arg3.field301 = new int[this.field280 + 100];
            arg3.field279 = new int[this.field280 + 100];
        }
        for (int var6 = 0; var6 < this.field280; var6++) {
            arg3.field306[var6] = this.field306[var6];
            arg3.field301[var6] = this.field301[var6];
            arg3.field279[var6] = this.field279[var6];
        }
        if (arg3.field295 == null) {
            arg3.field295 = new class291();
        }
        arg3.field295.field4822 = false;
        if (arg3.field286 == null) {
            arg3.field286 = new class156();
        }
        arg3.field286.field2516 = false;
        if (arg0) {
            arg3.field302 = this.field302;
        } else {
            if (arg4.field302 == null || arg4.field302.length < this.field272) {
                arg4.field302 = new byte[this.field272 + 100];
            }
            arg3.field302 = arg4.field302;
            for (int var7 = 0; var7 < this.field272; var7++) {
                arg3.field302[var7] = this.field302[var7];
            }
        }
        if (arg1) {
            arg3.field283 = this.field283;
        } else {
            if (arg4.field283 == null || arg4.field283.length < this.field272) {
                arg4.field283 = new short[this.field272 + 100];
            }
            arg3.field283 = arg4.field283;
            for (int var8 = 0; var8 < this.field272; var8++) {
                arg3.field283[var8] = this.field283[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field298 = this.field298;
        } else {
            if (arg4.field298 == null) {
                arg4.field298 = new class291();
            }
            arg3.field298 = arg4.field298;
            arg3.field298.field4822 = false;
        }
        if (arg2 || this.field305 == null) {
            arg3.field305 = this.field305;
            arg3.field313 = this.field313;
            arg3.field284 = this.field284;
            arg3.field276 = this.field276;
            arg3.field307 = this.field307;
        } else {
            if (arg4.field305 == null || arg4.field305.length < this.field292) {
                arg4.field305 = new short[this.field292 + 100];
                arg4.field313 = new short[this.field292 + 100];
                arg4.field284 = new short[this.field292 + 100];
                arg4.field276 = new short[this.field292 + 100];
            }
            arg3.field305 = arg4.field305;
            arg3.field313 = arg4.field313;
            arg3.field284 = arg4.field284;
            arg3.field276 = arg4.field276;
            for (int var9 = 0; var9 < this.field292; var9++) {
                arg3.field305[var9] = this.field305[var9];
                arg3.field313[var9] = this.field313[var9];
                arg3.field284[var9] = this.field284[var9];
                arg3.field276[var9] = this.field276[var9];
            }
            if (class322.field5287) {
                if (arg4.field307 == null) {
                    arg4.field307 = new class291();
                }
                arg3.field307 = arg4.field307;
                arg3.field307.field4822 = false;
            } else {
                arg3.field307 = null;
            }
        }
        arg3.field278 = this.field278;
        arg3.field308 = this.field308;
        arg3.field281 = this.field281;
        arg3.field293 = this.field293;
        arg3.field288 = this.field288;
        arg3.field285 = this.field285;
        arg3.field310 = this.field310;
        arg3.field303 = this.field303;
        arg3.field273 = this.field273;
        arg3.field316 = this.field316;
        arg3.field304 = this.field304;
        arg3.field299 = this.field299;
        arg3.field289 = this.field289;
        arg3.field290 = this.field290;
        arg3.field294 = this.field294;
        arg3.field1966 = this.field1966;
        arg3.field312 = this.field312;
        arg3.field270 = this.field270;
        arg3.field287 = this.field287;
        arg3.field282 = this.field282;
        return arg3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([FI)[F", line = 4408)
    private static final float[] method195(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class298.method2107(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "()I", line = 4416)
    public final int method196() {
        if (!this.field286.field2516) {
            this.method150();
        }
        return this.field286.field2514;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lfo;)Lfo;", line = 4422)
    public final class239 method197(class239 arg0) {
        if (this.field292 == 0) {
            return null;
        }
        if (!this.field286.field2516) {
            this.method150();
        }
        int var2;
        int var3;
        if (class234.field3718 > 0) {
            var2 = this.field286.field2517 - (class234.field3718 * this.field286.field2514 >> 8) >> 3;
            var3 = this.field286.field2515 - (class234.field3718 * this.field286.field2518 >> 8) >> 3;
        } else {
            var2 = this.field286.field2517 - (class234.field3718 * this.field286.field2518 >> 8) >> 3;
            var3 = this.field286.field2515 - (class234.field3718 * this.field286.field2514 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class234.field3725 > 0) {
            var4 = this.field286.field2520 - (class234.field3725 * this.field286.field2514 >> 8) >> 3;
            var5 = this.field286.field2521 - (class234.field3725 * this.field286.field2518 >> 8) >> 3;
        } else {
            var4 = this.field286.field2520 - (class234.field3725 * this.field286.field2518 >> 8) >> 3;
            var5 = this.field286.field2521 - (class234.field3725 * this.field286.field2514 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class239 var8;
        if (arg0 == null || arg0.field3776.length < var6 * var7) {
            var8 = new class239(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field2917 = arg0.field2915 = var6;
            arg0.field2909 = arg0.field2913 = var7;
            arg0.method1674();
        }
        var8.field2907 = var2;
        var8.field2916 = var4;
        if (field329.length < this.field292) {
            field329 = new int[this.field292];
            field324 = new int[this.field292];
        }
        for (int var9 = 0; var9 < this.field291; var9++) {
            int var10 = (this.field306[var9] - (this.field301[var9] * class234.field3718 >> 8) >> 3) - var2;
            int var11 = (this.field279[var9] - (this.field301[var9] * class234.field3725 >> 8) >> 3) - var4;
            int var12 = this.field294[var9];
            int var13 = this.field294[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field290[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field329[var15] = var10;
                field324[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field272; var16++) {
            if (this.field302[var16] <= 128) {
                short var17 = this.field288[var16];
                short var18 = this.field285[var16];
                short var19 = this.field310[var16];
                int var20 = field329[var17];
                int var21 = field329[var18];
                int var22 = field329[var19];
                int var23 = field324[var17];
                int var24 = field324[var18];
                int var25 = field324[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class272.method1911(var8.field3776, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(ZZZ)Lsm;", line = 4545)
    public final class128 method198(boolean arg0, boolean arg1, boolean arg2) {
        return this.method194(arg0, arg1, arg2, field319, field318);
    }
}

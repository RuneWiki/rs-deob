import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class291 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Lnn;")
    public class291 field4253;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Lnn;")
    public class291 field4257;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public final void method1805(byte arg0) {
        field4254++;
        if (this.field4257 == null) {
            return;
        }
        this.field4257.field4253 = this.field4253;
        if (arg0 != 89) {
            method1806((byte) 19);
        }
        this.field4253.field4257 = this.field4257;
        this.field4253 = null;
        this.field4257 = null;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
    public static final void method1806(byte arg0) {
        field4256++;
        if (arg0 <= 58 || class538.field7872 != null) {
            return;
        }
        class538.field7872 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var10 = var8;
                    var11 = var16;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var10 = var16;
                    var9 = var8;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class538.field7872[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljg;ZI)V")
    public static final void method1807(class228 arg0, boolean arg1, int arg2) {
        field4251++;
        class98 var3 = arg0.method1406((byte) 113);
        if (arg0.field3369 == 0) {
            arg0.field3377 = 0;
            class149.field1975 = -1;
            class531.field7776 = 0;
            return;
        }
        if (~arg0.field3320 != arg2 && arg0.field3361 == 0) {
            class449 var4 = class62.field784.method2566(arg0.field3320, -19);
            if (arg0.field3376 > 0 && var4.field6272 == 0) {
                class149.field1975 = -1;
                arg0.field3377++;
                class531.field7776 = 0;
                return;
            }
            if (arg0.field3376 <= 0 && var4.field6262 == 0) {
                arg0.field3377++;
                class149.field1975 = -1;
                class531.field7776 = 0;
                return;
            }
        }
        if (arg0.field3275 != -1 && arg0.field3296 <= class390.field5481) {
            class508 var5 = class125.field1688.method2457(arg0.field3275, (byte) 87);
            if (var5.field7520 && var5.field7504 != -1) {
                class449 var6 = class62.field784.method2566(var5.field7504, -19);
                if (arg0.field3376 > 0 && var6.field6272 == 0) {
                    arg0.field3377++;
                    class149.field1975 = -1;
                    class531.field7776 = 0;
                    return;
                }
                if (arg0.field3376 <= 0 && var6.field6262 == 0) {
                    arg0.field3377++;
                    class149.field1975 = -1;
                    class531.field7776 = 0;
                    return;
                }
            }
        }
        if (arg0.field3275 != -1 && class390.field5481 >= arg0.field3296) {
            class508 var7 = class125.field1688.method2457(arg0.field3275, (byte) 87);
            if (var7.field7520 && var7.field7504 != -1) {
                class449 var8 = class62.field784.method2566(var7.field7504, arg2 - 19);
                if (arg0.field3376 > 0 && var8.field6272 == 0) {
                    arg0.field3377++;
                    class149.field1975 = -1;
                    class531.field7776 = 0;
                    return;
                }
                if (arg0.field3376 <= 0 && var8.field6262 == 0) {
                    class531.field7776 = 0;
                    arg0.field3377++;
                    class149.field1975 = -1;
                    return;
                }
            }
        }
        int var9 = arg0.field1896;
        int var10 = arg0.field1899;
        int var11 = arg0.field3368[arg0.field3369 - 1] * 128 + (arg0.method125((byte) -102) * 64);
        int var12 = arg0.field3378[arg0.field3369 - 1] * 128 + (arg0.method125((byte) -99) * 64);
        if (var9 < var11) {
            if (var12 > var10) {
                arg0.method1400(10240, true);
            } else if (var12 >= var10) {
                arg0.method1400(12288, true);
            } else {
                arg0.method1400(14336, true);
            }
        } else if (var11 < var9) {
            if (var10 < var12) {
                arg0.method1400(6144, true);
            } else if (var12 >= var10) {
                arg0.method1400(4096, true);
            } else {
                arg0.method1400(2048, true);
            }
        } else if (var12 > var10) {
            arg0.method1400(8192, true);
        } else if (var10 > var12) {
            arg0.method1400(0, true);
        }
        byte var13 = arg0.field3372[arg0.field3369 - 1];
        if (!arg1 && (var11 - var9) > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || var12 - var10 < -256) {
            arg0.field1899 = var12;
            arg0.field1896 = var11;
            arg0.method1408(arg0.field3292, false, arg2 ^ 0x3AF41C4F);
            if (arg0.field3376 > 0) {
                arg0.field3376--;
            }
            arg0.field3369--;
            class149.field1975 = -1;
            class531.field7776 = 0;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class429) {
            var15 = ((class429) arg0).field6055.field4684;
        }
        if (var15) {
            int var16 = arg0.field3292 - arg0.field3328.field2552;
            if (var16 != 0 && arg0.field3338 == -1 && arg0.field3313 != 0) {
                var14 = 2;
            }
            if (!arg1 && arg0.field3369 > 2) {
                var14 = 6;
            }
            if (!arg1 && arg0.field3369 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg1 && arg0.field3369 > 1) {
                var14 = 6;
            }
            if (!arg1 && arg0.field3369 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field3377 > 0 && arg0.field3369 > 1) {
            arg0.field3377--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class531.field7776 = 0;
        if (var3.field1310 != -1) {
            int var17 = var14 << 7;
            if (arg0.field3369 == 1) {
                int var18 = arg0.field3373 * arg0.field3373;
                int var19 = (arg0.field1896 <= var11 ? var11 - arg0.field1896 : arg0.field1896 - var11) << 7;
                int var20 = (arg0.field1899 <= var12 ? var12 - arg0.field1899 : -var12 + arg0.field1899) << 7;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field1310 * 2 * var21;
                if (var22 < var18) {
                    arg0.field3373 /= 2;
                } else if (var21 < var18 / 2) {
                    arg0.field3373 -= var3.field1310;
                    if (arg0.field3373 < 0) {
                        arg0.field3373 = 0;
                    }
                } else if (var17 > arg0.field3373) {
                    arg0.field3373 += var3.field1310;
                    if (var17 < arg0.field3373) {
                        arg0.field3373 = var17;
                    }
                }
            } else if (arg0.field3373 < var17) {
                arg0.field3373 += var3.field1310;
                if (arg0.field3373 > var17) {
                    arg0.field3373 = var17;
                }
            } else if (arg0.field3373 > 0) {
                arg0.field3373 -= var3.field1310;
                if (arg0.field3373 < 0) {
                    arg0.field3373 = 0;
                }
            }
            var14 = arg0.field3373 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class149.field1975 = -1;
        } else {
            if (var9 < var11) {
                class531.field7776 |= 0x4;
                arg0.field1896 += var14;
                if (var11 < arg0.field1896) {
                    arg0.field1896 = var11;
                }
            } else if (var9 > var11) {
                class531.field7776 |= 0x8;
                arg0.field1896 -= var14;
                if (arg0.field1896 < var11) {
                    arg0.field1896 = var11;
                }
            }
            if (var14 < 8) {
                class149.field1975 = var13;
            } else {
                class149.field1975 = 2;
            }
            if (var12 > var10) {
                class531.field7776 |= 0x1;
                arg0.field1899 += var14;
                if (var12 < arg0.field1899) {
                    arg0.field1899 = var12;
                }
            } else if (var10 > var12) {
                class531.field7776 |= 0x2;
                arg0.field1899 -= var14;
                if (var12 > arg0.field1899) {
                    arg0.field1899 = var12;
                }
            }
        }
        if (arg0.field1896 == var11 && arg0.field1899 == var12) {
            if (arg0.field3376 > 0) {
                arg0.field3376--;
            }
            arg0.field3369--;
        }
    }
}

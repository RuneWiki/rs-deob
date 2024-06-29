import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class29 {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Z")
    public static boolean field474 = true;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lma;")
    public static class5 field469 = class12.method119(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 55);

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    public static int[] field470 = new int[50];

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
    public static int[] field478 = new int[2];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lma;")
    public static class5 field468 = class12.method119("Lade)3)3)3", (byte) 103);

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lel;")
    public static class218 field477 = new class218();

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lni;")
    public static class202 field479;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Leb;")
    public static class253 field480;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Leb;B)V", line = 4)
    public static final void method205(class253 arg0, byte arg1) {
        if (class14.field259 == arg0.field4187) {
            class296.field4975[arg0.field4299] = true;
        }
        if (arg1 > 85) {
            field465++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIIZ)V", line = 25)
    public static final void method206(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        if (arg1 >= -88) {
            field479 = (class202) null;
        }
        int var7 = class16.field287 + ((class86.field1301 - class16.field287) * var6 / 100);
        if (class237.field3923 > var7) {
            var7 = class237.field3923;
        } else if (class282.field4784 < var7) {
            var7 = class282.field4784;
        }
        int var8 = var7 * 512 * arg2 / (arg3 * 334);
        if (var8 < class166.field2530) {
            short var9 = class166.field2530;
            var7 = arg3 * var9 * 334 / (arg2 * 512);
            if (class282.field4784 < var7) {
                var7 = class282.field4784;
                int var10 = arg2 * var7 * 512 / (var9 * 334);
                int var11 = (arg3 - var10) / 2;
                if (arg5) {
                    class124.method819();
                    class124.method826(arg0, arg4, var11, arg2, 0);
                    class124.method826(arg0 + arg3 - var11, arg4, var11, arg2, 0);
                }
                arg3 -= var11 * 2;
                arg0 += var11;
            }
        } else if (class107.field1599 < var8) {
            short var12 = class107.field1599;
            var7 = arg3 * var12 * 334 / (arg2 * 512);
            if (var7 < class237.field3923) {
                var7 = class237.field3923;
                int var13 = var12 * 334 * arg3 / (var7 * 512);
                int var14 = (arg2 - var13) / 2;
                if (arg5) {
                    class124.method819();
                    class124.method826(arg0, arg4, arg3, var14, 0);
                    class124.method826(arg0, arg2 + arg4 - var14, arg3, var14, 0);
                }
                arg2 -= var14 * 2;
                arg4 += var14;
            }
        }
        class103.field1543 = arg2 * var7 / 334;
        class156.field2333 = arg0;
        class244.field4052 = (short) arg2;
        class255.field4361 = (short) arg3;
        class267.field4598 = arg4;
        field473++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)I", line = 120)
    public static final int method207(int arg0, int arg1, byte arg2) {
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        field472++;
        if (arg2 > -40) {
            field479 = (class202) null;
        }
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 143)
    public static final void method208(int arg0, int arg1) {
        field476++;
        if (arg0 != -11561) {
            field470 = (int[]) null;
        }
        class61.field945.method1485(arg0 ^ 0xC5B, new class276(arg1));
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)I", line = 157)
    public static final int method209(int arg0, byte arg1) {
        field467++;
        if (arg1 <= 67) {
            method210((byte) -103);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 173)
    public static void method210(byte arg0) {
        field469 = null;
        field479 = null;
        field480 = null;
        int var1 = 121 % ((73 - arg0) / 50);
        field478 = null;
        field477 = null;
        field468 = null;
        field470 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIB)V", line = 200)
    public static final void method211(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -89) {
            field468 = (class5) null;
        }
        field471++;
        class253 var4 = class282.method1911(arg1, arg0, arg3 ^ 0x3EFC);
        if (var4 != null && var4.field4274 != null) {
            class256 var5 = new class256();
            var5.field4372 = var4.field4274;
            var5.field4382 = var4;
            class12.method122(var5, (byte) -57);
        }
        class218.field3528 = arg0;
        class157.field2347 = arg2;
        class114.field1698 = arg1;
        class265.field4539 = true;
        method205(var4, (byte) 93);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILii;)V", line = 245)
    public static final void method212(int arg0, class221 arg1) {
        int var2 = class16.field294 >> 2 << 10;
        field466++;
        int var3 = class105.field1559 >> 1;
        byte[][] var4 = new byte[class139.field2066][class97.field1460];
        while (arg1.field3617.length > arg1.field3610) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method1509(true) == 1) {
                var6 = arg1.method1509(true);
                var7 = arg1.method1509(true);
                var5 = true;
            }
            int var8 = arg1.method1509(true);
            int var9 = arg1.method1509(true);
            int var10 = var8 * 64 - class206.field3284;
            int var11 = class289.field4918 + class97.field1460 - (var9 * 64) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && var10 + 63 < class139.field2066 && var11 < class97.field1460) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= var6 * 8 && var12 < (var6 * 8 + 8) && var14 >= var7 * 8 && (var7 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg1.method1543(false);
                        }
                    }
                }
            } else if (var5) {
                arg1.field3610 += 64;
            } else {
                arg1.field3610 += 4096;
            }
        }
        if (arg0 != 789221) {
            method206(-40, (byte) 19, -107, 25, -21, false);
        }
        int var15 = class139.field2066;
        int var16 = class97.field1460;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class114 var26 = class260.method1802(var25 - 1, -32243);
                        var19[var23] += var26.field1692;
                        var17[var23] += var26.field1694;
                        var18[var23] += var26.field1696;
                        var20[var23] += var26.field1706;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class114 var29 = class260.method1802(var28 - 1, -32243);
                        var19[var23] -= var29.field1692;
                        var17[var23] -= var29.field1694;
                        var18[var23] -= var29.field1696;
                        var20[var23] -= var29.field1706;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class248.field4102[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var37 < var16) {
                        var35 += var18[var37];
                        var30 += var19[var37];
                        var32 += var17[var37];
                        var33 += var21[var37];
                        var34 += var20[var37];
                    }
                    if (var38 >= 0) {
                        var34 -= var20[var38];
                        var35 -= var18[var38];
                        var33 -= var21[var38];
                        var30 -= var19[var38];
                        var32 -= var17[var38];
                    }
                    if (var36 >= 0 && var33 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class88.method580(-127, var35 / var33, var32 / var33, var30 * 256 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class204.method1354(var22, 63) + (class204.method1354(63, var36) << 6)] = class229.field3791[class184.method1209(var42, 96, (byte) -104)];
                        } else if (var39 != null) {
                            var39[(class204.method1354(63, var36) << 6) + class204.method1354(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }
}

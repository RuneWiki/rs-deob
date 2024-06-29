import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class38 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lak;")
    public static class140 field538;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Llc;")
    public static class86 field535;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static final void method293(int arg0) {
        field537++;
        class50.field734.method1558(-43);
        if (arg0 == 15896) {
            class286.field4534.method1558(arg0 - 16015);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZIII)V")
    public static final void method294(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            field534 = 94;
        }
        class201 var5 = class94.method738(-66, arg3, 8);
        var5.method1477(0);
        var5.field3224 = arg4;
        field543++;
        var5.field3226 = arg0;
        var5.field3219 = arg2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public static final void method295(boolean arg0, int arg1) {
        class164 var2 = class276.field4431;
        synchronized (class276.field4431) {
            class293.field4650 = arg1;
        }
        field542++;
        if (!arg0) {
            method296(false, (class86) null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLlc;)V")
    public static final void method296(boolean arg0, class86 arg1) {
        field536++;
        class195.field3145 = class290.method1967(arg1, arg0, class69.field1023);
        class181.field2923 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class169.field2723[var2] & 0xFF00) >> 8);
            float var5 = (float) (class169.field2723[var2] >> 16 & 0xFF);
            int var6 = (class169.field2723[var2 + 1] & 0xFF00) >> 8;
            int var7 = class169.field2723[var2 + 1] >> 16 & 0xFF;
            float var8 = ((float) var7 - var5) / 64.0F;
            float var9 = ((float) var6 - var4) / 64.0F;
            float var10 = (float) (class169.field2723[var2] & 0xFF);
            int var11 = class169.field2723[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class181.field2923[var2 * 64 + var13] = class244.method1747(class244.method1747((int) var4 << 8, (int) var5 << 16), (int) var10);
                var10 += var12;
                var5 += var8;
                var4 += var9;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class181.field2923[var3] = class169.field2723[3];
        }
        class254.field4198 = new int[32768];
        class253.field4186 = new int[32768];
        class190.method1420((class4) null, -16);
        class220.field3527 = new int[32768];
        class92.field1387 = new int[32768];
        class169.field2728 = new class140(128, 254);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method297(byte arg0) {
        if (arg0 > 99) {
            field538 = null;
            field535 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILv;)V")
    public static final void method298(int arg0, class152 arg1) {
        int var2 = class36.field441 >> 1;
        field540++;
        int var3 = class123.field1795 >> 2 << 10;
        byte[][] var4 = new byte[class85.field1245][class52.field753];
        while (arg1.field2523.length > arg1.field2511) {
            int var34 = 0;
            boolean var35 = false;
            int var36 = 0;
            if (arg1.method1111(255) == 1) {
                var35 = true;
                var34 = arg1.method1111(255);
                var36 = arg1.method1111(255);
            }
            int var37 = arg1.method1111(255);
            int var38 = arg1.method1111(255);
            int var39 = var37 * 64 - class227.field3636;
            int var40 = class122.field1786 - (var38 * 64 - (class52.field753 - 1));
            if (var39 >= 0 && var40 - 63 >= 0 && var39 + 63 < class85.field1245 && var40 < class52.field753) {
                for (int var41 = 0; var41 < 64; var41++) {
                    byte[] var42 = var4[var39 + var41];
                    for (int var43 = 0; var43 < 64; var43++) {
                        if (!var35 || (var34 * 8) <= var41 && var41 < var34 * 8 + 8 && var43 >= (var36 * 8) && var43 < var36 * 8 + 8) {
                            var42[var40 - var43] = arg1.method1092((byte) -62);
                        }
                    }
                }
            } else if (var35) {
                arg1.field2511 += 64;
            } else {
                arg1.field2511 += 4096;
            }
        }
        int var5 = -82 % ((50 - arg0) / 58);
        int var6 = class85.field1245;
        int var7 = class52.field753;
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        int[] var10 = new int[var7];
        int[] var11 = new int[var7];
        int[] var12 = new int[var7];
        for (int var13 = -5; var13 < var6; var13++) {
            for (int var14 = 0; var14 < var7; var14++) {
                int var28 = var13 + 5;
                int var10002;
                if (var6 > var28) {
                    int var29 = var4[var28][var14] & 0xFF;
                    if (var29 > 0) {
                        class193 var30 = class297.method1995(1, var29 - 1);
                        var8[var14] += var30.field3100;
                        var9[var14] += var30.field3115;
                        var10[var14] += var30.field3114;
                        var11[var14] += var30.field3109;
                        var10002 = var12[var14]++;
                    }
                }
                int var31 = var13 - 5;
                if (var31 >= 0) {
                    int var32 = var4[var31][var14] & 0xFF;
                    if (var32 > 0) {
                        class193 var33 = class297.method1995(1, var32 - 1);
                        var8[var14] -= var33.field3100;
                        var9[var14] -= var33.field3115;
                        var10[var14] -= var33.field3114;
                        var11[var14] -= var33.field3109;
                        var10002 = var12[var14]--;
                    }
                }
            }
            if (var13 >= 0) {
                int var15 = 0;
                int[][] var16 = class24.field280[var13 >> 6];
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                for (int var21 = -5; var21 < var7; var21++) {
                    int var22 = var21 + 5;
                    int var23 = var21 - 5;
                    if (var7 > var22) {
                        var19 += var12[var22];
                        var20 += var10[var22];
                        var17 += var9[var22];
                        var18 += var11[var22];
                        var15 += var8[var22];
                    }
                    if (var23 >= 0) {
                        var18 -= var11[var23];
                        var19 -= var12[var23];
                        var17 -= var9[var23];
                        var15 -= var8[var23];
                        var20 -= var10[var23];
                    }
                    if (var21 >= 0 && var19 > 0) {
                        int[] var24 = var16[var21 >> 6];
                        int var25 = var18 == 0 ? 0 : class135.method973(var17 / var19, var20 / var19, var15 * 256 / var18, (byte) 117);
                        if (var4[var13][var21] != 0) {
                            int var26 = (var25 & 0x7F) + var2;
                            if (var26 < 0) {
                                var26 = 0;
                            } else if (var26 > 127) {
                                var26 = 127;
                            }
                            if (var24 == null) {
                                var24 = var16[var21 >> 6] = new int[4096];
                            }
                            int var27 = (var3 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                            var24[(class179.method1337(63, var21) << 6) + class179.method1337(63, var13)] = class47.field680[class193.method1434(-70, var27, 96)];
                        } else if (var24 != null) {
                            var24[class179.method1337(4032, var21 << 6) + class179.method1337(63, var13)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I")
    public static final int method299(int arg0, int arg1, int arg2, int arg3) {
        field539++;
        if ((class86.field1277[arg0][arg2][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class86.field1277[1][arg2][arg1] & 0x2) == 0) {
            if (arg3 != 32768) {
                method294(46, false, 10, -99, 48);
            }
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class38() {
        new class238();
    }
}

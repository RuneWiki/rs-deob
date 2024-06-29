import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class60 extends class64 {

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    private int field1391 = 4096;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    private int field1387 = 4096;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    private int field1386 = 4096;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "Ldh;")
    public static class36 field1393 = new class36(4096);

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "Ljava/lang/Object;")
    public static Object field1396 = new Object();

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "Lcd;")
    private static class23 field1403 = class54.method414("Loading fonts )2 ", -1);

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "Lcd;")
    public static class23 field1400 = class54.method414("<col=ffb000>", -1);

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "Lcd;")
    public static class23 field1404 = class54.method414("<)4col>", -1);

    @OriginalMember(owner = "client!gf", name = "lb", descriptor = "Lcd;")
    private static class23 field1406 = class54.method414("wishes to trade with you)3", -1);

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "Lcd;")
    public static class23 field1405 = field1403;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "Lcd;")
    public static class23 field1401 = field1406;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "Lpc;")
    public static class137 field1398;

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "[[[B")
    public static byte[][][] field1402;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        ++field1397;
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (!arg1) {
            this.field1391 = 17;
        }
        if (super.field1508.field2757) {
            int[][] var4 = this.method482(0, arg0, (byte) -123);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class168.field3367 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var12 == var14 && ~var12 == ~var13) {
                    var9[var11] = this.field1387 * var14 >> 12;
                    var8[var11] = this.field1391 * var12 >> 12;
                    var10[var11] = this.field1386 * var13 >> 12;
                } else {
                    var9[var11] = this.field1387;
                    var8[var11] = this.field1391;
                    var10[var11] = this.field1386;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
    public static void method454(boolean arg0) {
        field1404 = null;
        field1398 = null;
        field1403 = null;
        field1393 = null;
        if (arg0) {
            field1396 = null;
            field1400 = null;
            field1406 = null;
            field1405 = null;
            field1402 = null;
            field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)Lea;")
    public static final class38 method455(boolean arg0) {
        ++field1388;
        if (arg0) {
            return null;
        } else {
            class38 var1 = new class38();
            byte[] var2 = class129.field2698[0];
            var1.field784 = class194.field3836;
            var1.field783 = class15.field329[0];
            var1.field786 = class167.field3328;
            var1.field788 = class72.field1652[0];
            var1.field787 = class109.field2311[0];
            var1.field785 = class107.field2287[0];
            int var3 = var1.field788 * var1.field787;
            var1.field782 = new int[var3];
            for (int var4 = 0; var3 > var4; ++var4) {
                var1.field782[var4] = class133.field2756[class27.method198(var2[var4], 255)];
            }
            class175.method1101(-111);
            return var1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1389;
        if (arg2 == 17780) {
            int var6 = class205.field4041.method784(arg1, arg4, arg0);
            if (~var6 != -1) {
                int var7 = class205.field4041.method802(arg1, arg4, arg0, var6);
                int var8 = arg3;
                int var9 = 31 & var7;
                if (~var6 < -1) {
                    var8 = arg5;
                }
                int var10 = (227 & var7) >> 6;
                int[] var11 = class143.field2932.field782;
                int var12 = (536855183 & var6) >> 14;
                int var13 = (-(arg0 * 512) + 52736) * 4 + (24624 - -(arg4 * 4));
                class104 var14 = class65.method486(var12, (byte) -66);
                if (var14.field2247 == -1) {
                    if (~var9 == -1 || ~var9 == -3) {
                        if (var10 != 0) {
                            if (~var10 != -2) {
                                if (~var10 == -3) {
                                    var11[var13 + 3] = var8;
                                    var11[var13 + 3 + 512] = var8;
                                    var11[var13 + 1024 + 3] = var8;
                                    var11[var13 + 3 + 1536] = var8;
                                } else if (var10 == 3) {
                                    var11[var13 + 1536] = var8;
                                    var11[var13 - -1536 + 1] = var8;
                                    var11[var13 + 1538] = var8;
                                    var11[var13 + 1536 + 3] = var8;
                                }
                            } else {
                                var11[var13] = var8;
                                var11[var13 + 1] = var8;
                                var11[var13 + 2] = var8;
                                var11[var13 + 3] = var8;
                            }
                        } else {
                            var11[var13] = var8;
                            var11[var13 + 512] = var8;
                            var11[var13 + 1024] = var8;
                            var11[var13 - -1536] = var8;
                        }
                    }
                    if (var9 == 3) {
                        if (~var10 == -1) {
                            var11[var13] = var8;
                        } else if (~var10 == -2) {
                            var11[var13 + 3] = var8;
                        } else if (var10 == 2) {
                            var11[var13 + 1536 - -3] = var8;
                        } else if (var10 == 3) {
                            var11[var13 - -1536] = var8;
                        }
                    }
                    if (~var9 == -3) {
                        if (~var10 != -4) {
                            if (~var10 == -1) {
                                var11[var13] = var8;
                                var11[var13 - -1] = var8;
                                var11[var13 + 2] = var8;
                                var11[var13 + 3] = var8;
                            } else if (var10 != 1) {
                                if (~var10 == -3) {
                                    var11[var13 + 1536] = var8;
                                    var11[var13 + 1536 + 1] = var8;
                                    var11[var13 - -2 + 1536] = var8;
                                    var11[var13 - -3 + 1536] = var8;
                                }
                            } else {
                                var11[var13 + 3] = var8;
                                var11[var13 + 512 - -3] = var8;
                                var11[var13 - -3 + 1024] = var8;
                                var11[var13 + 1539] = var8;
                            }
                        } else {
                            var11[var13] = var8;
                            var11[var13 - -512] = var8;
                            var11[var13 + 1024] = var8;
                            var11[var13 + 1536] = var8;
                        }
                    }
                } else {
                    class130 var15 = class44.field919[var14.field2247];
                    if (var15 != null) {
                        int var16 = (var14.field2232 * 4 + -var15.field2706) / 2;
                        int var17 = (var14.field2205 * 4 + -var15.field2701) / 2;
                        var15.method836(arg4 * 4 + (48 - -var16), (-arg0 + 104 + -var14.field2205) * 4 + var17 + 48);
                    }
                }
            }
            int var18 = class205.field4041.method818(arg1, arg4, arg0);
            if (var18 != 0) {
                int var19 = class205.field4041.method802(arg1, arg4, arg0, var18);
                int var20 = 3 & var19 >> 6;
                int var21 = (536862969 & var18) >> 14;
                int var22 = 31 & var19;
                class104 var23 = class65.method486(var21, (byte) -66);
                if (var23.field2247 != -1) {
                    class130 var24 = class44.field919[var23.field2247];
                    if (var24 != null) {
                        int var25 = (var23.field2232 * 4 + -var24.field2706) / 2;
                        int var26 = (var23.field2205 * 4 - var24.field2701) / 2;
                        var24.method836(arg4 * 4 + var25 + 48, (104 - arg0 - var23.field2205) * 4 + 48 - -var26);
                    }
                } else if (var22 == 9) {
                    int var27 = 15658734;
                    int[] var28 = class143.field2932.field782;
                    if (~var18 < -1) {
                        var27 = 15597568;
                    }
                    int var29 = arg4 * 4 + 24624 - -((52736 - arg0 * 512) * 4);
                    if (~var20 != -1 && var20 != 2) {
                        var28[var29] = var27;
                        var28[var29 + 513] = var27;
                        var28[var29 - -1024 + 2] = var27;
                        var28[var29 + 1536 + 3] = var27;
                    } else {
                        var28[var29 + 1536] = var27;
                        var28[var29 + 1 - -1024] = var27;
                        var28[var29 + 514] = var27;
                        var28[var29 + 3] = var27;
                    }
                }
            }
            int var30 = class205.field4041.method783(arg1, arg4, arg0);
            if (~var30 != -1) {
                int var31 = (var30 & 536859351) >> 14;
                class104 var32 = class65.method486(var31, (byte) -66);
                if (~var32.field2247 != 0) {
                    class130 var33 = class44.field919[var32.field2247];
                    if (var33 != null) {
                        int var34 = (var32.field2205 * 4 - var33.field2701) / 2;
                        int var35 = (var32.field2232 * 4 + -var33.field2706) / 2;
                        var33.method836(48 - (-(arg4 * 4) - var35), 48 - -((-arg0 + 104 - var32.field2205) * 4) - -var34);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lke;IZIZI)V")
    public static final void method457(class94 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        ++field1390;
        if (class51.field1216 < 50) {
            if (arg0.field1977 != null && arg5 < arg0.field1977.length) {
                int var6 = arg0.field1977[arg5];
                if (var6 != 0) {
                    int var7 = var6 >> 8;
                    if (arg4) {
                        field1406 = null;
                    }
                    int var8 = (119 & var6) >> 4;
                    int var9 = 15 & var6;
                    if (~var9 == -1) {
                        if (arg2) {
                            class204.method1333(var8, 0, var7, false);
                        }
                    } else if (~class205.field4031 != -1) {
                        class62.field1441[class51.field1216] = var7;
                        int var10 = (arg3 - 64) / 128;
                        int var11 = (arg1 + -64) / 128;
                        class122.field2527[class51.field1216] = var8;
                        class29.field621[class51.field1216] = 0;
                        client.field572[class51.field1216] = null;
                        class117.field2441[class51.field1216] = (var10 << 8) + (var11 << 16) + var9;
                        ++class51.field1216;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field1392;
        int var4 = 75 / ((arg0 - 7) / 43);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1386 = arg2.method1197(-1);
                }
            } else {
                this.field1391 = arg2.method1197(-1);
            }
        } else {
            this.field1387 = arg2.method1197(-1);
        }
    }
}

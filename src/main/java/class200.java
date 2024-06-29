import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class200 extends class232 {

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    private int field3426 = 4096;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    private int field3437 = 0;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "Lhi;")
    public static class82 field3435 = class95.method664((byte) -116, "clignotant2:");

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Lhn;")
    public static class317 field3432 = new class317(20);

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Lhi;")
    public static class82 field3440 = class95.method664((byte) -122, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "[Z")
    public static boolean[] field3442 = new boolean[8];

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lmm;")
    public static class117 field3439 = new class117();

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field3444 = 0;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field3443 = 0;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V", line = 6)
    public static void method1401(int arg0) {
        field3432 = null;
        field3435 = null;
        field3442 = null;
        field3439 = null;
        field3440 = null;
        int var1 = -127 % ((23 - arg0) / 59);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[S)[S", line = 19)
    public static final short[] method1402(boolean arg0, short[] arg1) {
        field3438++;
        if (arg1 == null) {
            return null;
        }
        if (!arg0) {
            field3440 = (class82) null;
        }
        short[] var2 = new short[arg1.length];
        class190.method1326(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ID)V", line = 37)
    public static final void method1403(int arg0, double arg1) {
        if (class294.field4928 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class133.field2312[var3] = var4 <= 255 ? var4 : 255;
            }
            class294.field4928 = arg1;
        }
        if (arg0 >= -28) {
            field3442 = (boolean[]) null;
        }
        field3427++;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)V", line = 72)
    public static final void method1404(int arg0, int arg1, int arg2) {
        field3434++;
        class227 var3 = class215.method1531(arg0 - 7407, 12, arg2);
        if (arg0 == 7406) {
            var3.method1616(64);
            var3.field3923 = arg1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 91)
    public class200() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IB)[I", line = 95)
    public final int[] method80(int arg0, byte arg1) {
        field3431++;
        int var3 = 15 % ((arg1 + 31) / 55);
        int[] var4 = this.field4008.method131((byte) -73, arg0);
        if (this.field4008.field256) {
            int[] var5 = this.method1649(0, (byte) 52, arg0);
            for (int var6 = 0; var6 < class54.field858; var6++) {
                int var7 = var5[var6];
                var4[var6] = this.field3437 <= var7 && this.field3426 >= var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLme;I)V", line = 136)
    public static final void method1405(int arg0, byte arg1, class75 arg2, int arg3) {
        if (arg2.field1273 == 0) {
            arg2.field1151 = arg2.field1240;
        } else if (arg2.field1273 == 1) {
            arg2.field1151 = (arg0 - arg2.field1216) / 2 + arg2.field1240;
        } else if (arg2.field1273 == 2) {
            arg2.field1151 = arg0 - arg2.field1216 - arg2.field1240;
        } else if (arg2.field1273 == 3) {
            arg2.field1151 = arg2.field1240 * arg0 >> 14;
        } else if (arg2.field1273 == 4) {
            arg2.field1151 = (arg2.field1240 * arg0 >> 14) + (arg0 - arg2.field1216) / 2;
        } else {
            arg2.field1151 = arg0 - arg2.field1216 - (arg2.field1240 * arg0 >> 14);
        }
        if (arg1 != 44) {
            method1405(-111, (byte) -39, (class75) null, 107);
        }
        field3429++;
        if (arg2.field1193 == 0) {
            arg2.field1294 = arg2.field1290;
        } else if (arg2.field1193 == 1) {
            arg2.field1294 = (arg3 - arg2.field1205) / 2 + arg2.field1290;
        } else if (arg2.field1193 == 2) {
            arg2.field1294 = arg3 - arg2.field1205 - arg2.field1290;
        } else if (arg2.field1193 == 3) {
            arg2.field1294 = arg2.field1290 * arg3 >> 14;
        } else if (arg2.field1193 == 4) {
            arg2.field1294 = (arg2.field1290 * arg3 >> 14) + (arg3 - arg2.field1205) / 2;
        } else {
            arg2.field1294 = arg3 - arg2.field1205 - (arg2.field1290 * arg3 >> 14);
        }
        if (!class182.field3114 || !(client.method871(arg2) != 0 || arg2.field1184 == 0)) {
            return;
        }
        if (arg2.field1151 < 0) {
            arg2.field1151 = 0;
        } else if (arg0 < arg2.field1151 + arg2.field1216) {
            arg2.field1151 = arg0 - arg2.field1216;
        }
        if (arg2.field1294 < 0) {
            arg2.field1294 = 0;
        } else if ((arg2.field1294 + arg2.field1205) > arg3) {
            arg2.field1294 = arg3 - arg2.field1205;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lhi;ILhi;I)V", line = 209)
    public static final void method1406(class82 arg0, int arg1, class82 arg2, int arg3) {
        if (arg3 != 4) {
            method1402(false, (short[]) null);
        }
        field3430++;
        class62.method403(0, arg0, (class82) null, arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILbc;)V", line = 220)
    public static final void method1407(int arg0, class153 arg1) {
        field3433++;
        int var2 = class95.field1750 >> 2 << 10;
        if (arg0 != -1) {
            return;
        }
        int var3 = class232.field4010 >> 1;
        byte[][] var4 = new byte[class244.field4242][class157.field2719];
        while (arg1.field2611 < arg1.field2598.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method1082(-111) == 1) {
                var5 = true;
                var6 = arg1.method1082(arg0 ^ 0x58);
                var7 = arg1.method1082(-44);
            }
            int var8 = arg1.method1082(-91);
            int var9 = arg1.method1082(-123);
            int var10 = class157.field2719 + class17.field181 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class166.field2905;
            if (var11 >= 0 && var10 - 63 >= 0 && (var11 + 63) < class244.field4242 && class157.field2719 > var10) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && var6 * 8 + 8 > var12 && var14 >= (var7 * 8) && (var7 * 8 + 8) > var14) {
                            var13[var10 - var14] = arg1.method1104(-1);
                        }
                    }
                }
            } else if (var5) {
                arg1.field2611 += 64;
            } else {
                arg1.field2611 += 4096;
            }
        }
        int var15 = class244.field4242;
        int var16 = class157.field2719;
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
                        class124 var26 = class228.method1625(10415, var25 - 1);
                        var17[var23] += var26.field2179;
                        var19[var23] += var26.field2163;
                        var18[var23] += var26.field2167;
                        var20[var23] += var26.field2172;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class124 var29 = class228.method1625(10415, var28 - 1);
                        var17[var23] -= var29.field2179;
                        var19[var23] -= var29.field2163;
                        var18[var23] -= var29.field2167;
                        var20[var23] -= var29.field2172;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class161.field2815[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var16) {
                        var31 += var18[var37];
                        var33 += var20[var37];
                        var35 += var21[var37];
                        var32 += var19[var37];
                        var34 += var17[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var32 -= var19[var38];
                        var34 -= var17[var38];
                        var35 -= var21[var38];
                        var31 -= var18[var38];
                        var33 -= var20[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class289.method1999(var31 / var35, true, var34 * 256 / var33, var32 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 & 0x380) + ((var2 + var40 & 0xFC00) + var41);
                            var39[class277.method1935(var22, 63) + class277.method1935(var36 << 6, 4032)] = class102.field1805[class25.method162(var42, 96, -1)];
                        } else if (var39 != null) {
                            var39[class277.method1935(var36 << 6, 4032) + class277.method1935(63, var22)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLbc;)V", line = 454)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            field3443 = 40;
        }
        if (arg0 == 0) {
            this.field3437 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field3426 = arg2.method1090(false);
        }
        field3436++;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class81 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "B")
    private byte field1290;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1289 = "Loaded update list";

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lvf;")
    public static class60 field1302;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public static final int method605(int arg0, int arg1) {
        field1300++;
        if (arg1 != 6279) {
            method605(31, 15);
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLhc;)V")
    public static final void method606(byte arg0, class53 arg1) {
        if (arg0 != -73) {
            field1302 = null;
        }
        int var2 = class46.field624 >> 2 << 10;
        field1296++;
        int var3 = class46.field622 >> 1;
        byte[][] var4 = new byte[class46.field619][class46.field620];
        while (arg1.field735 < arg1.field758.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method366(arg0 ^ 0x4030) == 1) {
                var33 = true;
                var34 = arg1.method366(arg0 ^ 0x4030);
                var35 = arg1.method366(-16505);
            }
            int var36 = arg1.method366(-16505);
            int var37 = arg1.method366(arg0 ^ 0x4030);
            int var38 = var36 * 64 - class46.field623;
            int var39 = class46.field620 - ((var37 * 64) + 1 - class46.field621);
            if (var38 >= 0 && (var39 - 63) >= 0 && class46.field619 > (var38 + 63) && var39 < class46.field620) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || (var34 * 8) <= var40 && var40 < var34 * 8 + 8 && var42 >= (var35 * 8) && var35 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg1.method335((byte) 26);
                        }
                    }
                }
            } else if (var33) {
                arg1.field735 += 64;
            } else {
                arg1.field735 += 4096;
            }
        }
        int var5 = class46.field619;
        int var6 = class46.field620;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            if ((var12 & 0x1FF) == 0) {
                class73.method545(true, 30);
            }
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class269 var29 = class14.method98(arg0 ^ 0x57, var28 - 1);
                        var7[var13] += var29.field4322;
                        var8[var13] += var29.field4317;
                        var9[var13] += var29.field4316;
                        var10[var13] += var29.field4320;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class269 var32 = class14.method98(-32, var31 - 1);
                        var7[var13] -= var32.field4322;
                        var8[var13] -= var32.field4317;
                        var9[var13] -= var32.field4316;
                        var10[var13] -= var32.field4320;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class46.field631[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var21 < var6) {
                        var15 += var7[var21];
                        var17 += var9[var21];
                        var19 += var11[var21];
                        var18 += var10[var21];
                        var16 += var8[var21];
                    }
                    if (var22 >= 0) {
                        var18 -= var10[var22];
                        var16 -= var8[var22];
                        var15 -= var7[var22];
                        var17 -= var9[var22];
                        var19 -= var11[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class246.method1695(var16 / var19, var17 / var19, -124, var15 * 256 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[(class301.method2056(var20, 63) << 6) + class301.method2056(63, var12)] = class244.field3595[class292.method1988(var26, 96, -127)];
                        } else if (var23 != null) {
                            var23[class301.method2056(63, var12) + (class301.method2056(var20, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1289 = null;
        if (arg0 < -8) {
            field1302 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIZII)V")
    public static final void method608(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1294++;
        if (class309.method2092(91923, arg3)) {
            class186.method1329(-1, 0, class134.field2195[arg3], arg4, arg1, arg2);
            if (arg0) {
                field1302 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I")
    public final int method609(byte arg0) {
        if (arg0 < 62) {
            this.method610(-84);
        }
        field1293++;
        return (this.field1290 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I")
    public final int method610(int arg0) {
        field1295++;
        return arg0 >= -35 ? 44 : this.field1290 & 0x7;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class81() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIJB)Z")
    public static final boolean method611(int arg0, int arg1, long arg2, byte arg3) {
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = 118 / ((40 - arg3) / 37);
        field1297++;
        int var7 = ((int) arg2 & 0x344EF7) >> 20;
        int var8 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class93 var9 = class48.method297(false, var8);
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var10 = var9.field1557;
                var11 = var9.field1544;
            } else {
                var10 = var9.field1544;
                var11 = var9.field1557;
            }
            int var12 = var9.field1518;
            if (var7 != 0) {
                var12 = (var12 << var7 & 0xF) + (var12 >> 4 - var7);
            }
            class52.method314(false, var11, class213.field3139.field3686[0], arg0, var10, class213.field3139.field3761[0], 0, true, var12, arg1, 0);
        } else {
            class52.method314(false, 0, class213.field3139.field3686[0], arg0, 0, class213.field3139.field3761[0], var7, true, 0, arg1, var5 + 1);
        }
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lhc;)V")
    public class81(class53 arg0) {
        this.field1290 = arg0.method335((byte) 26);
        this.field1301 = arg0.method331(-113);
        this.field1291 = arg0.method340(-89);
        this.field1292 = arg0.method340(-99);
        this.field1298 = arg0.method340(-99);
        this.field1299 = arg0.method340(-80);
    }
}

import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 {

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lna;")
    private class79 field230 = null;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lna;")
    private class79 field228 = null;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    private int field247 = 65000;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lmc;")
    private static class75 field243 = class30.method234(true, "Public chat");

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[Lqa;")
    public static class97[] field231 = new class97[32768];

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lmc;")
    public static class75 field237 = class30.method234(true, "backtop1");

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lmc;")
    public static class75 field240 = class30.method234(true, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lmc;")
    public static class75 field234 = field243;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[Lmc;")
    public static class75[] field242 = new class75[200];

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lmc;")
    public static class75 field249 = class30.method234(true, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Lmc;")
    private static class75 field250 = class30.method234(true, "white:");

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lmc;")
    public static class75 field241 = field250;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lmb;")
    public static class74 field236;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Lp;")
    public static class90 field248;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[[B")
    public static byte[][] field232;

    @OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field239++;
        return "Cache:" + this.field233;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BBI)Z", line = 19)
    public final boolean method81(int arg0, byte[] arg1, byte arg2, int arg3) {
        field244++;
        if (arg2 != 106) {
            method84(-118);
        }
        class79 var5 = this.field230;
        synchronized (this.field230) {
            if (arg3 < 0 || arg3 > this.field247) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method85(arg0, true, arg2 - 619, arg3, arg1);
            if (!var6) {
                var6 = this.method85(arg0, false, -513, arg3, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILna;Lna;I)V", line = 509)
    public class12(int arg0, class79 arg1, class79 arg2, int arg3) {
        this.field228 = arg2;
        this.field230 = arg1;
        this.field233 = arg0;
        this.field247 = arg3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 54)
    public static void method82(int arg0) {
        field241 = null;
        field249 = null;
        field232 = null;
        field231 = null;
        field250 = null;
        field236 = null;
        field240 = null;
        field234 = null;
        field243 = null;
        field237 = null;
        if (arg0 == 43) {
            field242 = null;
            field248 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[B", line = 81)
    public final byte[] method83(int arg0, int arg1) {
        field229++;
        class79 var3 = this.field230;
        synchronized (this.field230) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field228.method676(false)) {
                    return null;
                }
                this.field228.method672((long) (arg1 * 6), 0);
                this.field228.method670(class94.field2368, -108, arg0, 6);
                int var5 = ((class94.field2368[4] & 0xFF) << 8) + (((class94.field2368[3] & 0xFF) << 16) + (class94.field2368[5] & 0xFF));
                int var6 = ((class94.field2368[0] & 0xFF) << 16) + (class94.field2368[1] << 8 & 0xFF00) + (class94.field2368[2] & 0xFF);
                if (var6 < 0 || var6 > this.field247) {
                    return null;
                } else if (var5 > 0 && this.field230.method676(false) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label70: while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var10;
                        this.field230.method672((long) (var5 * 520), 0);
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field230.method670(class94.field2368, -72, 0, var13 + 8);
                        int var14 = ((class94.field2368[0] & 0xFF) << 8) + (class94.field2368[1] & 0xFF);
                        int var15 = (class94.field2368[6] & 0xFF) + ((class94.field2368[4] & 0xFF) << 16) + ((class94.field2368[5] & 0xFF) << 8);
                        int var16 = class94.field2368[7] & 0xFF;
                        int var17 = ((class94.field2368[2] & 0xFF) << 8) + (class94.field2368[3] & 0xFF);
                        if (arg1 == var14 && var11 == var17 && this.field233 == var16) {
                            if (var15 >= 0 && (long) var15 <= this.field230.method676(false) / 520L) {
                                var11++;
                                var5 = var15;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var9[var10++] = class94.field2368[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 177)
    public static final void method84(int arg0) {
        field246++;
        int var1 = -1;
        if (class42.field1013 == 0 && class17.field332 == 0) {
            class72.field1825++;
            class85.method703(class90.field2200, 61, class16.field309, class24.field483, 0, 2, class45.field1104);
        }
        for (int var2 = 0; var2 < class93.field2353; var2++) {
            int var3 = class93.field2340[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class107.field2679.method193(class99.field2510, var4, var5, var3) >= 0) {
                    class59 var8 = class50.method387(arg0 - 26291, var7);
                    if (var8.field1484 != null) {
                        var8 = var8.method474(5234);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class42.field1013 == 1) {
                        class85.method703(var4, 108, class69.method586(new class75[] { class64.field1688, class117.field2891, var8.field1512 }, (byte) 53), class82.field2041, var3, 5, var5);
                        class131.field3190++;
                    } else if (class17.field332 != 1) {
                        class61.field1590++;
                        class75[] var9 = var8.field1514;
                        if (class127.field3106) {
                            var9 = class86.method717(var9, (byte) -73);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class82.field2038++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 41;
                                    }
                                    if (var10 == 1) {
                                        var11 = 44;
                                    }
                                    if (var10 == 2) {
                                        var11 = 7;
                                    }
                                    if (var10 == 3) {
                                        var11 = 13;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1003;
                                    }
                                    class85.method703(var4, -86, class69.method586(new class75[] { class40.field972, var8.field1512 }, (byte) 119), var9[var10], var3, var11, var5);
                                }
                            }
                        }
                        class85.method703(var4, 46, class69.method586(new class75[] { class40.field972, var8.field1512 }, (byte) 74), class90.field2213, var8.field1483 << 14, 1002, var5);
                    } else if ((class99.field2561 & 0x4) == 4) {
                        class65.field1714++;
                        class85.method703(var4, 44, class69.method586(new class75[] { class86.field2126, class117.field2891, var8.field1512 }, (byte) 65), class100.field2596, var3, 36, var5);
                    }
                }
                if (var6 == 1) {
                    class97 var12 = field231[var7];
                    if (var12.field2447.field767 == 1 && (var12.field1233 & 0x7F) == 64 && (var12.field1242 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class110.field2790; var13++) {
                            class97 var16 = field231[class118.field2929[var13]];
                            if (var16 != null && var12 != var16 && var16.field2447.field767 == 1 && var12.field1233 == var16.field1233 && var12.field1242 == var16.field1242) {
                                class110.method897(var4, var16.field2447, -125, class118.field2929[var13], var5);
                            }
                        }
                        for (int var14 = 0; var14 < class34.field783; var14++) {
                            class122 var15 = class40.field957[class84.field2081[var14]];
                            if (var15 != null && var12.field1233 == var15.field1233 && var12.field1242 == var15.field1242) {
                                class112.method910(var4, var15, (byte) 120, var5, class84.field2081[var14]);
                            }
                        }
                    }
                    class110.method897(var4, var12.field2447, -126, var7, var5);
                }
                if (var6 == 0) {
                    class122 var17 = class40.field957[var7];
                    if ((var17.field1233 & 0x7F) == 64 && (var17.field1242 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class110.field2790; var18++) {
                            class97 var21 = field231[class118.field2929[var18]];
                            if (var21 != null && var21.field2447.field767 == 1 && var17.field1233 == var21.field1233 && var17.field1242 == var21.field1242) {
                                class110.method897(var4, var21.field2447, -128, class118.field2929[var18], var5);
                            }
                        }
                        for (int var19 = 0; var19 < class34.field783; var19++) {
                            class122 var20 = class40.field957[class84.field2081[var19]];
                            if (var20 != null && var17 != var20 && var17.field1233 == var20.field1233 && var17.field1242 == var20.field1242) {
                                class112.method910(var4, var20, (byte) -67, var5, class84.field2081[var19]);
                            }
                        }
                    }
                    class112.method910(var4, var17, (byte) -80, var5, var7);
                }
                if (var6 == 3) {
                    class32 var22 = class112.field2847[class99.field2510][var4][var5];
                    if (var22 != null) {
                        for (class87 var23 = (class87) var22.method247(-29414); var23 != null; var23 = (class87) var22.method251(false)) {
                            class10 var24 = class43.method326(var23.field2153, 0);
                            if (class42.field1013 == 1) {
                                class74.field1837++;
                                class85.method703(var4, -91, class69.method586(new class75[] { class64.field1688, class85.field2093, var24.field204 }, (byte) 41), class82.field2041, var23.field2153, 43, var5);
                            } else if (class17.field332 != 1) {
                                class131.field3188++;
                                class75[] var25 = var24.field199;
                                if (class127.field3106) {
                                    var25 = class86.method717(var25, (byte) -89);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 10;
                                        }
                                        if (var26 == 1) {
                                            var27 = 1;
                                        }
                                        class70.field1786++;
                                        if (var26 == 2) {
                                            var27 = 27;
                                        }
                                        if (var26 == 3) {
                                            var27 = 48;
                                        }
                                        if (var26 == 4) {
                                            var27 = 30;
                                        }
                                        class85.method703(var4, -106, class69.method586(new class75[] { class35.field853, var24.field204 }, (byte) 73), var25[var26], var23.field2153, var27, var5);
                                    } else if (var26 == 2) {
                                        class50.field1260++;
                                        class85.method703(var4, -102, class69.method586(new class75[] { class35.field853, var24.field204 }, (byte) 48), class122.field2967, var23.field2153, 27, var5);
                                    }
                                }
                                class85.method703(var4, -108, class69.method586(new class75[] { class35.field853, var24.field204 }, (byte) 36), class90.field2213, var23.field2153, 1004, var5);
                            } else if ((class99.field2561 & 0x1) == 1) {
                                class15.field270++;
                                class85.method703(var4, -96, class69.method586(new class75[] { class86.field2126, class85.field2093, var24.field204 }, (byte) 109), class100.field2596, var23.field2153, 17, var5);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 17) {
            method82(64);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZII[B)Z", line = 525)
    private final boolean method85(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field238++;
        class79 var6 = this.field230;
        synchronized (this.field230) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field228.method676(false)) {
                        return false;
                    }
                    this.field228.method672((long) (arg0 * 6), 0);
                    this.field228.method670(class94.field2368, 104, 0, 6);
                    var8 = ((class94.field2368[4] & 0xFF) << 8) + ((class94.field2368[3] & 0xFF) << 16) + (class94.field2368[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field230.method676(false) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field230.method676(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class94.field2368[0] = (byte) (arg3 >> 16);
                class94.field2368[1] = (byte) (arg3 >> 8);
                int var10 = 0;
                int var11 = 0;
                class94.field2368[2] = (byte) arg3;
                class94.field2368[3] = (byte) (var8 >> 16);
                class94.field2368[4] = (byte) (var8 >> 8);
                class94.field2368[5] = (byte) var8;
                this.field228.method672((long) (arg0 * 6), 0);
                if (arg2 != -513) {
                    return true;
                }
                this.field228.method674(6, 0, class94.field2368, -1523);
                while (arg3 > var10) {
                    int var13 = 0;
                    if (arg1) {
                        label110: {
                            this.field230.method672((long) (var8 * 520), 0);
                            try {
                                this.field230.method670(class94.field2368, -49, 0, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class94.field2368[0] & 0xFF) << 8) + (class94.field2368[1] & 0xFF);
                            var13 = (class94.field2368[6] & 0xFF) + ((class94.field2368[5] & 0xFF) << 8) + ((class94.field2368[4] & 0xFF) << 16);
                            int var15 = ((class94.field2368[2] & 0xFF) << 8) + (class94.field2368[3] & 0xFF);
                            int var16 = class94.field2368[7] & 0xFF;
                            if (arg0 == var14 && var11 == var15 && this.field233 == var16) {
                                if (var13 >= 0 && this.field230.method676(false) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg3 - var10;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field230.method676(false) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        arg1 = false;
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if (arg3 - var10 <= 512) {
                        var13 = 0;
                    }
                    class94.field2368[0] = (byte) (arg0 >> 8);
                    class94.field2368[1] = (byte) arg0;
                    class94.field2368[2] = (byte) (var11 >> 8);
                    class94.field2368[3] = (byte) var11;
                    var11++;
                    class94.field2368[4] = (byte) (var13 >> 16);
                    class94.field2368[5] = (byte) (var13 >> 8);
                    class94.field2368[6] = (byte) var13;
                    class94.field2368[7] = (byte) this.field233;
                    this.field230.method672((long) (var8 * 520), arg2 + 513);
                    this.field230.method674(8, 0, class94.field2368, arg2 - 1010);
                    var8 = var13;
                    this.field230.method674(var19, var10, arg4, arg2 ^ 0x7F2);
                    var10 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }
}

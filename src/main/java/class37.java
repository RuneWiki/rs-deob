import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public int field685 = 0;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field695 = -1;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field691 = -1;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Z")
    public boolean field700 = true;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field694 = -1;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lpk;")
    public static class98 field690 = new class98();

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field701 = -1;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
    public static boolean field702 = false;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field704 = 7759444;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lka;")
    public static class245 field703;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lob;Z)V")
    public static final void method331(class128 arg0, boolean arg1) {
        field699++;
        if (arg0.field2270 == 0) {
            return;
        }
        if (arg0.field2280 != -1 && arg0.field2280 < 32768) {
            class109 var2 = class168.field2963[arg0.field2280];
            if (var2 != null) {
                int var3 = arg0.field2274 - var2.field2274;
                int var4 = arg0.field2300 - var2.field2300;
                if (var3 != 0 || var4 != 0) {
                    arg0.field2278 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2280 >= 32768) {
            int var5 = arg0.field2280 - 32768;
            if (class33.field615 == var5) {
                var5 = 2047;
            }
            class260 var6 = class230.field4011[var5];
            if (var6 != null) {
                int var7 = arg0.field2274 - var6.field2274;
                int var8 = arg0.field2300 - var6.field2300;
                if (var7 != 0 || var8 != 0) {
                    arg0.field2278 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2310 != 0 || arg0.field2236 != 0) && (arg0.field2287 == 0 || arg0.field2264 > 0)) {
            int var9 = arg0.field2274 + ((arg0.method1005(0) - 1) * 64 - (arg0.field2310 - class272.field4795 - class272.field4795) * 64);
            int var10 = arg0.field2300 + ((arg0.method1005(0) - 1) * 64 - (arg0.field2236 - class155.field2759 - class155.field2759) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.field2278 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field2310 = 0;
            arg0.field2236 = 0;
        }
        int var11 = arg0.field2278 - arg0.field2289 & 0x7FF;
        if (!arg1) {
            method332((byte) 94, (byte) 39);
        }
        if (var11 == 0) {
            arg0.field2265 = 0;
            return;
        }
        arg0.field2265++;
        if (var11 > 1024) {
            arg0.field2289 -= arg0.field2270;
            boolean var12 = true;
            if (var11 < arg0.field2270 || 2048 - arg0.field2270 < var11) {
                arg0.field2289 = arg0.field2278;
                var12 = false;
            }
            if (arg0.field2305 == arg0.field2282 && (arg0.field2265 > 25 || var12)) {
                if (arg0.field2291 == -1) {
                    arg0.field2282 = arg0.field2252;
                } else {
                    arg0.field2282 = arg0.field2291;
                }
            }
        } else {
            arg0.field2289 += arg0.field2270;
            boolean var13 = true;
            if (arg0.field2270 > var11 || 2048 - arg0.field2270 < var11) {
                arg0.field2289 = arg0.field2278;
                var13 = false;
            }
            if (arg0.field2305 == arg0.field2282 && (arg0.field2265 > 25 || var13)) {
                if (arg0.field2293 == -1) {
                    arg0.field2282 = arg0.field2252;
                } else {
                    arg0.field2282 = arg0.field2293;
                }
            }
        }
        arg0.field2289 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BB)V")
    public static final void method332(byte arg0, byte arg1) {
        field692++;
        if (class12.field176 == null) {
            class12.field176 = new byte[4][104][104];
        }
        if (arg0 != 49) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class12.field176[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I")
    public static final int method333(int arg0, int arg1, int arg2, int arg3) {
        field697++;
        if (class106.field1912 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        if (arg1 != 1637367879) {
            return -85;
        }
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class79.field1435[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg3 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var7) * class106.field1912[var6][var4][var5] + class106.field1912[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class106.field1912[var6][var4][var5 + 1] + class106.field1912[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method334(int arg0) {
        field703 = null;
        if (arg0 != 128) {
            method333(123, 124, -107, -47);
        }
        field690 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIZI)V")
    public static final void method335(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class44.field791 = 0L;
        int var5 = class55.method444((byte) 123);
        field693++;
        if (arg1 == 3 || var5 == 3) {
            arg3 = true;
        }
        boolean var6 = false;
        if (class129.field2330.startsWith("mac") && arg1 > 0) {
            arg3 = true;
        }
        if (var5 <= 0 != arg1 <= 0) {
            var6 = true;
        }
        if (arg3 && arg1 > 0) {
            var6 = true;
        }
        if (arg0 != 106) {
            field694 = -95;
        }
        class146.method1116(arg3, var5, var6, -73, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public static final void method336(int arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class91.field1646;
        field682++;
        int var4 = var3.length;
        if (arg0 != -1) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class13.field262[var5] >> 8) * 64 - class272.field4795;
            byte[] var12 = var3[var5];
            int var13 = (class13.field262[var5] & 0xFF) * 64 - class155.field2759;
            if (var12 != null) {
                class154.method1175(95);
                class255.method1787(var13, class231.field4014 * 8 - 48, var12, class112.field2007, (class273.field4809 - 6) * 8, (byte) -64, arg1, var11);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class13.field262[var6] >> 8) * 64 - class272.field4795;
            int var8 = (class13.field262[var6] & 0xFF) * 64 - class155.field2759;
            byte[] var9 = var3[var6];
            if (var9 == null && class231.field4014 < 800) {
                class154.method1175(95);
                for (int var10 = 0; var10 < var2; var10++) {
                    class153.method1174(64, 64, true, var8, var7, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILfk;I)V")
    public final void method337(int arg0, class14 arg1, int arg2) {
        field689++;
        if (arg0 != 4885) {
            method336(53, false);
        }
        while (true) {
            int var4 = arg1.method200(255);
            if (var4 == 0) {
                return;
            }
            this.method341(false, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method338(byte arg0) {
        field684++;
        class124.field2182.method1124(0);
        if (arg0 != 112) {
            method334(-85);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public static final void method339(int arg0, int arg1, int arg2) {
        field687++;
        if (class202.method1422(arg0, true)) {
            class229.method1576(class99.field1839[arg0], arg1, 255);
            if (arg2 != 3) {
                method339(64, 102, -73);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Leb;")
    public static final class230 method340(int arg0, byte arg1) {
        field686++;
        return arg1 == -26 ? class240.method1684(arg0, 10, false, -5) : null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZILfk;I)V")
    private final void method341(boolean arg0, int arg1, class14 arg2, int arg3) {
        if (arg0) {
            field705 = -73;
        }
        field688++;
        if (arg3 == 1) {
            this.field685 = class60.method511(-16711936, arg2.method190(-25267));
        } else if (arg3 == 2) {
            this.field695 = arg2.method200(255);
        } else if (arg3 == 3) {
            this.field695 = arg2.method161(4);
            if (this.field695 == 65535) {
                this.field695 = -1;
                return;
            }
        } else if (arg3 == 5) {
            this.field700 = false;
        } else if (arg3 == 7) {
            this.field691 = class60.method511(-16711936, arg2.method190(-25267));
            return;
        } else if (arg3 == 8) {
            class275.field4834 = arg1;
            return;
        } else {
            if (arg3 == 9) {
                arg2.method161(4);
            } else if (arg3 != 10) {
                if (arg3 == 11) {
                    arg2.method200(255);
                    return;
                }
                if (arg3 != 12) {
                    if (arg3 == 13) {
                        arg2.method190(-25267);
                    } else if (arg3 == 14) {
                        arg2.method200(255);
                        return;
                    }
                    return;
                }
            }
            return;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class250 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "B")
    private byte field4407;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lqe;")
    public static class42 field4413 = new class42(128);

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static volatile int field4418 = -1;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Z")
    public static boolean field4425 = true;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Lfd;")
    public static class229 field4427 = null;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
    public final int method1635(int arg0) {
        if (arg0 != 0) {
            method1642((byte) 34);
        }
        field4416++;
        return (this.field4407 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field4413 = null;
        field4427 = null;
        int var1 = 81 % ((arg0 + 42) / 60);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method1637(byte arg0) {
        if (class149.field2605[96]) {
            class37.field615 += (-class37.field615 - 24) / 2;
        } else if (class149.field2605[97]) {
            class37.field615 += (24 - class37.field615) / 2;
        } else {
            class37.field615 /= 2;
        }
        if (class149.field2605[98]) {
            class169.field2946 += (12 - class169.field2946) / 2;
        } else if (class149.field2605[99]) {
            class169.field2946 += (-class169.field2946 - 12) / 2;
        } else {
            class169.field2946 /= 2;
        }
        if (arg0 >= -79) {
            method1642((byte) -25);
        }
        class275.field4794 += class169.field2946 / 2;
        int var1 = class193.field3319 + class66.field1094.field1770;
        class169.field2938 += class37.field615 / 2;
        int var2 = class42.field724 + class66.field1094.field1758;
        if ((class192.field3308 - var1) < -500 || (class192.field3308 - var1) > 500 || (class182.field3124 - var2) < -500 || (class182.field3124 - var2) > 500) {
            class192.field3308 = var1;
            class182.field3124 = var2;
        }
        if (class182.field3124 != var2) {
            class182.field3124 += (var2 - class182.field3124) / 16;
        }
        if (class192.field3308 != var1) {
            class192.field3308 += (var1 - class192.field3308) / 16;
        }
        field4426++;
        class97.method688(32768);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)I")
    public final int method1638(int arg0) {
        field4408++;
        if (arg0 != 0) {
            method1637((byte) -113);
        }
        return this.field4407 & 0x7;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public static final void method1639(int arg0, int arg1, int arg2) {
        field4420++;
        class149.field2597.method526((byte) -127, 239);
        class174.field3018++;
        class149.field2597.method602(arg2, false);
        class149.field2597.method613((byte) -15, arg1);
        if (arg0 != -3175) {
            method1642((byte) 70);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(JI)V")
    public static final void method1640(long arg0, int arg1) {
        field4414++;
        int var3 = -26 % ((arg1 - 54) / 50);
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class109.method808(-1, arg0 - 1L);
            class109.method808(-1, 1L);
        } else {
            class109.method808(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lfe;IIIIIIZ)V")
    public static final void method1641(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1960.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1960[var9] - class123.field2205;
            int var23 = arg0.field1973[var9] - class80.field1317;
            int var24 = arg0.field1952[var9] - class265.field4617;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1966 != null) {
                class111.field1954[var9] = var25;
                class111.field1953[var9] = var28;
                class111.field1962[var9] = var29;
            }
            class111.field1968[var9] = (var25 << 9) / var29 + class223.field3765;
            class111.field1972[var9] = (var28 << 9) / var29 + class223.field3772;
        }
        class223.field3767 = 0;
        int var10 = arg0.field1958.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1958[var11];
            int var13 = arg0.field1967[var11];
            int var14 = arg0.field1959[var11];
            int var15 = class111.field1968[var12];
            int var16 = class111.field1968[var13];
            int var17 = class111.field1968[var14];
            int var18 = class111.field1972[var12];
            int var19 = class111.field1972[var13];
            int var20 = class111.field1972[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class69.field1111 && class155.method1098(class86.field1442 + class223.field3765, class87.field1469 + class223.field3772, var18, var19, var20, var15, var16, var17)) {
                    class30.field464 = arg5;
                    class193.field3321 = arg6;
                }
                if (!arg7) {
                    class223.field3762 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class223.field3776 || var16 > class223.field3776 || var17 > class223.field3776) {
                        class223.field3762 = true;
                    }
                    if (arg0.field1966 == null || arg0.field1966[var11] == -1) {
                        if (arg0.field1955[var11] != 12345678) {
                            class223.method1429(var18, var19, var20, var15, var16, var17, arg0.field1955[var11], arg0.field1969[var11], arg0.field1965[var11]);
                        }
                    } else if (!field4425) {
                        int var21 = class223.field3771.method74(arg0.field1966[var11], 65535);
                        class223.method1429(var18, var19, var20, var15, var16, var17, class267.method1754(var21, arg0.field1955[var11]), class267.method1754(var21, arg0.field1969[var11]), class267.method1754(var21, arg0.field1965[var11]));
                    } else if (arg0.field1961) {
                        class223.method1438(var18, var19, var20, var15, var16, var17, arg0.field1955[var11], arg0.field1969[var11], arg0.field1965[var11], class111.field1954[0], class111.field1954[1], class111.field1954[3], class111.field1953[0], class111.field1953[1], class111.field1953[3], class111.field1962[0], class111.field1962[1], class111.field1962[3], arg0.field1966[var11]);
                    } else {
                        class223.method1438(var18, var19, var20, var15, var16, var17, arg0.field1955[var11], arg0.field1969[var11], arg0.field1965[var11], class111.field1954[var12], class111.field1954[var13], class111.field1954[var14], class111.field1953[var12], class111.field1953[var13], class111.field1953[var14], class111.field1962[var12], class111.field1962[var13], class111.field1962[var14], arg0.field1966[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static final void method1642(byte arg0) {
        if (arg0 < 100) {
            method1639(-33, -45, -113);
        }
        if (class143.field2519 == null || class159.field2791 == null) {
            class159.field2791 = new int[256];
            class143.field2519 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class143.field2519[var1] = (int) (Math.sin(var2) * 4096.0D);
                class159.field2791[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field4410++;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public static final void method1643(int arg0) {
        field4409++;
        while (class196.field3351.method518((byte) 50, class59.field1000) >= 27) {
            int var1 = class196.field3351.method525((byte) -110, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class31.field478[var1] == null) {
                class31.field478[var1] = new class165();
                var2 = true;
            }
            class165 var3 = class31.field478[var1];
            class228.field3851[class181.field3118++] = var1;
            var3.field1739 = class35.field576;
            if (var3.field2873 != null && var3.field2873.method142(-1)) {
                class145.method1039(0, var3);
            }
            int var4 = class196.field3351.method525((byte) -120, 1);
            var3.field2873 = class30.method176(-3, class196.field3351.method525((byte) -127, 14));
            int var5 = class196.field3351.method525((byte) -36, 5);
            int var6 = class196.field3351.method525((byte) -124, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class196.field3351.method525((byte) -62, 1);
            if (var7 == 1) {
                class181.field3117[class184.field3154++] = var1;
            }
            int var8 = class116.field2065[class196.field3351.method525((byte) -114, 3)];
            if (var2) {
                var3.field1773 = var3.field1787 = var8;
            }
            var3.method744(arg0 - 7, var3.field2873.field399);
            var3.field1736 = var3.field2873.field363;
            var3.field1778 = var3.field2873.field351;
            var3.field1741 = var3.field2873.field375;
            var3.field1750 = var3.field2873.field361;
            var3.field1769 = var3.field2873.field365;
            var3.field1774 = var3.field2873.field377;
            if (var3.field1774 == 0) {
                var3.field1787 = 0;
            }
            var3.field1747 = var3.field2873.field359;
            var3.field1786 = var3.field2873.field404;
            var3.method751(class66.field1094.field1722[0] + var5, var3.method750((byte) -107), var4 == 1, (byte) 34, class66.field1094.field1752[0] + var6);
            if (var3.field2873.method142(-1)) {
                class234.method1525((class34) null, var3, 0, var3.field1722[0], var3.field1752[0], (class109) null, class159.field2790, (byte) -53);
            }
        }
        class196.field3351.method515((byte) -128);
        if (arg0 != 0) {
            method1637((byte) 125);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)Lda;")
    public static final class275 method1644(int arg0, byte arg1) {
        field4411++;
        if (arg1 != -115) {
            method1644(16, (byte) 87);
        }
        return class189.method1253(false, arg0, 30997, 10);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class250() {
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lij;)V")
    public class250(class85 arg0) {
        this.field4407 = arg0.method581(8);
        this.field4424 = arg0.method608(81);
        this.field4421 = arg0.method568(19845);
        this.field4423 = arg0.method568(19845);
        this.field4415 = arg0.method568(19845);
        this.field4412 = arg0.method568(19845);
    }
}

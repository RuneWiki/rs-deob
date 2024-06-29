import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 implements Runnable {

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Z")
    public boolean field1029 = true;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1023 = new Object();

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "[I")
    public int[] field1035 = new int[500];

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
    public int[] field1036 = new int[500];

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public int field1034 = 0;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lok;")
    public static class146 field1026 = class235.method1724(-12908, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "[I")
    public static int[] field1024 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1027 = -1;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lok;")
    public static class146 field1031 = class235.method1724(-12908, " <col=ffff00>");

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "J")
    public static long field1021;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[Lcj;")
    public static class311[] field1022;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 29)
    public static final void method462(byte arg0) {
        field1028++;
        int var1 = class145.field2423 * 128 + 64;
        int var2 = class227.field3787 * 128 + 64;
        int var3 = class19.method141(var2, class203.field3387, var1, 124) - class1.field2;
        if (class170.field2870 < 100) {
            if (var1 > class161.field2719) {
                class161.field2719 += class311.field5306 + ((var1 - class161.field2719) * class170.field2870 / 1000);
                if (var1 < class161.field2719) {
                    class161.field2719 = var1;
                }
            }
            if (var3 > class151.field2572) {
                class151.field2572 += (var3 - class151.field2572) * class170.field2870 / 1000 + class311.field5306;
                if (class151.field2572 > var3) {
                    class151.field2572 = var3;
                }
            }
            if (class107.field1742 < var2) {
                class107.field1742 += (var2 - class107.field1742) * class170.field2870 / 1000 + class311.field5306;
                if (var2 < class107.field1742) {
                    class107.field1742 = var2;
                }
            }
            if (class161.field2719 > var1) {
                class161.field2719 -= class311.field5306 + ((class161.field2719 - var1) * class170.field2870 / 1000);
                if (class161.field2719 < var1) {
                    class161.field2719 = var1;
                }
            }
            if (var2 < class107.field1742) {
                class107.field1742 -= class311.field5306 + ((class107.field1742 - var2) * class170.field2870 / 1000);
                if (class107.field1742 < var2) {
                    class107.field1742 = var2;
                }
            }
            if (var3 < class151.field2572) {
                class151.field2572 -= (class151.field2572 - var3) * class170.field2870 / 1000 + class311.field5306;
                if (class151.field2572 < var3) {
                    class151.field2572 = var3;
                }
            }
        } else {
            class161.field2719 = class145.field2423 * 128 + 64;
            class107.field1742 = class227.field3787 * 128 + 64;
            class151.field2572 = class19.method141(class107.field1742, class203.field3387, class161.field2719, 121) - class1.field2;
        }
        int var4 = class63.field1094 * 128 + 64;
        int var5 = class104.field1693 * 128 + 64;
        if (arg0 != 126) {
            return;
        }
        int var6 = class19.method141(var4, class203.field3387, var5, 117) - class9.field194;
        int var7 = var6 - class151.field2572;
        int var8 = var4 - class107.field1742;
        int var9 = var5 - class161.field2719;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        int var13 = var12 - class79.field1269;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class63.field1088 < var11) {
            class63.field1088 += (var11 - class63.field1088) * class122.field2004 / 1000 + class180.field3030;
            if (class63.field1088 > var11) {
                class63.field1088 = var11;
            }
        }
        if (class63.field1088 > var11) {
            class63.field1088 -= (class63.field1088 - var11) * class122.field2004 / 1000 + class180.field3030;
            if (class63.field1088 < var11) {
                class63.field1088 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class79.field1269 += class122.field2004 * var13 / 1000 + class180.field3030;
            class79.field1269 &= 0x7FF;
        }
        if (var13 < 0) {
            class79.field1269 -= -var13 * class122.field2004 / 1000 + class180.field3030;
            class79.field1269 &= 0x7FF;
        }
        int var14 = var12 - class79.field1269;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class79.field1269 = var12;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BJ)V", line = 178)
    public static final void method463(byte arg0, long arg1) {
        field1033++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class226.field3772; var3++) {
            if (class144.field2417[var3] == arg1) {
                class226.field3772--;
                class21.field400++;
                for (int var4 = var3; var4 < class226.field3772; var4++) {
                    class303.field5198[var4] = class303.field5198[var4 + 1];
                    class137.field2282[var4] = class137.field2282[var4 + 1];
                    class36.field666[var4] = class36.field666[var4 + 1];
                    class144.field2417[var4] = class144.field2417[var4 + 1];
                    class168.field2842[var4] = class168.field2842[var4 + 1];
                    class217.field3574[var4] = class217.field3574[var4 + 1];
                }
                class150.field2550 = class13.field253;
                class47.field820.method1656(12, 16);
                class47.field820.method359(arg1, 128);
                break;
            }
        }
        if (arg0 >= -123) {
            field1021 = -101L;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lkf;IIIIIIIZ)V", line = 226)
    public static final void method464(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class82.field1311;
        int var11;
        int var12 = var11 = (arg7 << 7) - class287.field4923;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class174.field2914[arg1][arg6][arg7] - class298.field5066;
        int var18 = class174.field2914[arg1][arg6 + 1][arg7] - class298.field5066;
        int var19 = class174.field2914[arg1][arg6 + 1][arg7 + 1] - class298.field5066;
        int var20 = class174.field2914[arg1][arg6][arg7 + 1] - class298.field5066;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class109.field1756;
        int var46 = (var24 << 9) / var25 + class109.field1744;
        int var47 = (var27 << 9) / var31 + class109.field1756;
        int var48 = (var30 << 9) / var31 + class109.field1744;
        int var49 = (var33 << 9) / var37 + class109.field1756;
        int var50 = (var36 << 9) / var37 + class109.field1744;
        int var51 = (var39 << 9) / var43 + class109.field1756;
        int var52 = (var42 << 9) / var43 + class109.field1744;
        class109.field1748 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class143.field2385 && class146.method1087(class113.field1834 + class109.field1756, class206.field3419 + class109.field1744, var50, var52, var48, var49, var51, var47)) {
                class157.field2652 = arg6;
                class313.field5337 = arg7;
            }
            if (!class271.field4640 && !arg8) {
                class109.field1755 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class109.field1758 || var51 > class109.field1758 || var47 > class109.field1758) {
                    class109.field1755 = true;
                }
                if (arg0.field3583 == -1) {
                    if (arg0.field3577 != 12345678) {
                        class109.method725(var50, var52, var48, var49, var51, var47, arg0.field3577, arg0.field3592, arg0.field3573);
                    }
                } else if (!class160.field2704) {
                    int var53 = class109.field1747.method833(false, arg0.field3583);
                    class109.method725(var50, var52, var48, var49, var51, var47, class114.method778(var53, arg0.field3577), class114.method778(var53, arg0.field3592), class114.method778(var53, arg0.field3573));
                } else if (arg0.field3578) {
                    class109.method744(var50, var52, var48, var49, var51, var47, arg0.field3577, arg0.field3592, arg0.field3573, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3583);
                } else {
                    class109.method744(var50, var52, var48, var49, var51, var47, arg0.field3577, arg0.field3592, arg0.field3573, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3583);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class143.field2385 && class146.method1087(class113.field1834 + class109.field1756, class206.field3419 + class109.field1744, var46, var48, var52, var45, var47, var51)) {
            class157.field2652 = arg6;
            class313.field5337 = arg7;
        }
        if (class271.field4640 || arg8) {
            return;
        }
        class109.field1755 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class109.field1758 || var47 > class109.field1758 || var51 > class109.field1758) {
            class109.field1755 = true;
        }
        if (arg0.field3583 == -1) {
            if (arg0.field3586 != 12345678) {
                class109.method725(var46, var48, var52, var45, var47, var51, arg0.field3586, arg0.field3573, arg0.field3592);
            }
        } else if (class160.field2704) {
            class109.method744(var46, var48, var52, var45, var47, var51, arg0.field3586, arg0.field3573, arg0.field3592, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3583);
        } else {
            int var54 = class109.field1747.method833(false, arg0.field3583);
            class109.method725(var46, var48, var52, var45, var47, var51, class114.method778(var54, arg0.field3586), class114.method778(var54, arg0.field3573), class114.method778(var54, arg0.field3592));
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 397)
    public static final void method465(int arg0) {
        for (int var1 = arg0; var1 < class158.field2670; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class112.field1791[var1];
            }
            class234 var3 = class75.field1215[var2];
            if (var3 != null) {
                class132.method981(var3, var3.method1717(0), (byte) 105);
            }
        }
        field1032++;
    }

    @OriginalMember(owner = "client!ja", name = "run", descriptor = "()V", line = 433)
    public final void run() {
        field1020++;
        while (this.field1029) {
            Object var1 = this.field1023;
            synchronized (this.field1023) {
                if (this.field1034 < 500) {
                    this.field1035[this.field1034] = class232.field3875;
                    this.field1036[this.field1034] = class316.field5368;
                    this.field1034++;
                }
            }
            class281.method2041((byte) 89, 50L);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZII)V", line = 456)
    public static final void method466(int arg0, boolean arg1, int arg2, int arg3) {
        class158 var4 = class206.method1564(arg2, 11, -128);
        var4.method1236(-13730);
        var4.field2672 = arg0;
        field1025++;
        if (!arg1) {
            field1027 = -104;
        }
        var4.field2663 = arg3;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 487)
    public static void method467(int arg0) {
        field1024 = null;
        if (arg0 == 3842) {
            field1026 = null;
            field1022 = null;
            field1031 = null;
        }
    }
}

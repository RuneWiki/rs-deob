import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class169 {

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Lvi;")
    private class560 field2111 = new class560(128);

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lpq;")
    private class159 field2107;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[I")
    public static int[] field2109 = new int[250];

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Lbc;")
    public static class607 field2113 = new class607(0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V", line = 6)
    public final void method1123(int arg0, int arg1) {
        if (arg1 > -43) {
            this.method1126(-78);
        }
        class560 var3 = this.field2111;
        synchronized (this.field2111) {
            this.field2111.method3129(arg0, 14583);
        }
        field2112++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BII)Z", line = 19)
    public static final boolean method1124(byte arg0, int arg1, int arg2) {
        field2108++;
        return arg0 > -44;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V", line = 31)
    public static final void method1125() {
        class528.field7314 = 0;
        label212: for (int var0 = 0; var0 < class573.field7940; var0++) {
            class218 var1 = class357.field5182[var0];
            if (class396.field5662 != null) {
                for (int var2 = 0; var2 < class396.field5662.length; var2++) {
                    if (class396.field5662[var2] != -1000000 && (var1.field2816 <= class396.field5662[var2] || var1.field2821 <= class396.field5662[var2]) && (var1.field2812 <= class304.field4089[var2] || var1.field2828 <= class304.field4089[var2]) && (var1.field2812 >= class477.field6451[var2] || var1.field2828 >= class477.field6451[var2]) && (var1.field2811 <= class120.field1553[var2] || var1.field2810 <= class120.field1553[var2]) && (var1.field2811 >= class547.field7484[var2] || var1.field2810 >= class547.field7484[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field2822 == 1) {
                int var3 = var1.field2823 + class351.field5123 - class297.field3975;
                if (var3 >= 0 && var3 <= class351.field5123 + class351.field5123) {
                    int var4 = var1.field2814 + class351.field5123 - class274.field3710;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class351.field5123 + class351.field5123) {
                        continue;
                    }
                    int var5 = var1.field2815 + class351.field5123 - class274.field3710;
                    if (var5 > class351.field5123 + class351.field5123) {
                        var5 = class351.field5123 + class351.field5123;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class554.field7580[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class294.field3946 - var1.field2812;
                        if (var7 > class309.field4143) {
                            var1.field2830 = 1;
                        } else {
                            if (var7 >= -class309.field4143) {
                                continue;
                            }
                            var1.field2830 = 2;
                            var7 = -var7;
                        }
                        var1.field2826 = (var1.field2811 - class99.field1212 << 8) / var7;
                        var1.field2819 = (var1.field2810 - class99.field1212 << 8) / var7;
                        var1.field2808 = (var1.field2816 - class377.field5415 << 8) / var7;
                        var1.field2825 = (var1.field2821 - class377.field5415 << 8) / var7;
                        class615.field8396[class528.field7314++] = var1;
                    }
                }
            } else if (var1.field2822 == 2) {
                int var8 = var1.field2814 + class351.field5123 - class274.field3710;
                if (var8 >= 0 && var8 <= class351.field5123 + class351.field5123) {
                    int var9 = var1.field2823 + class351.field5123 - class297.field3975;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class351.field5123 + class351.field5123) {
                        continue;
                    }
                    int var10 = var1.field2807 + class351.field5123 - class297.field3975;
                    if (var10 > class351.field5123 + class351.field5123) {
                        var10 = class351.field5123 + class351.field5123;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class554.field7580[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class99.field1212 - var1.field2811;
                        if (var12 > class309.field4143) {
                            var1.field2830 = 3;
                        } else {
                            if (var12 >= -class309.field4143) {
                                continue;
                            }
                            var1.field2830 = 4;
                            var12 = -var12;
                        }
                        var1.field2827 = (var1.field2812 - class294.field3946 << 8) / var12;
                        var1.field2813 = (var1.field2828 - class294.field3946 << 8) / var12;
                        var1.field2808 = (var1.field2816 - class377.field5415 << 8) / var12;
                        var1.field2825 = (var1.field2821 - class377.field5415 << 8) / var12;
                        class615.field8396[class528.field7314++] = var1;
                    }
                }
            } else if (var1.field2822 == 4) {
                int var13 = var1.field2816 - class377.field5415;
                if (var13 > class461.field6279) {
                    int var14 = var1.field2814 + class351.field5123 - class274.field3710;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class351.field5123 + class351.field5123) {
                        continue;
                    }
                    int var15 = var1.field2815 + class351.field5123 - class274.field3710;
                    if (var15 > class351.field5123 + class351.field5123) {
                        var15 = class351.field5123 + class351.field5123;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field2823 + class351.field5123 - class297.field3975;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class351.field5123 + class351.field5123) {
                        continue;
                    }
                    int var17 = var1.field2807 + class351.field5123 - class297.field3975;
                    if (var17 > class351.field5123 + class351.field5123) {
                        var17 = class351.field5123 + class351.field5123;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class554.field7580[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field2830 = 5;
                        var1.field2827 = (var1.field2812 - class294.field3946 << 8) / var13;
                        var1.field2813 = (var1.field2828 - class294.field3946 << 8) / var13;
                        var1.field2826 = (var1.field2811 - class99.field1212 << 8) / var13;
                        var1.field2819 = (var1.field2810 - class99.field1212 << 8) / var13;
                        class615.field8396[class528.field7314++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 282)
    public final void method1126(int arg0) {
        field2115++;
        class560 var2 = this.field2111;
        synchronized (this.field2111) {
            this.field2111.method3144(true);
        }
        if (arg0 != 29793) {
            field2116 = -26;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Leba;", line = 295)
    public final class235 method1127(int arg0, int arg1) {
        field2106++;
        class560 var3 = this.field2111;
        class235 var4;
        synchronized (this.field2111) {
            var4 = (class235) this.field2111.method3134((long) arg0, -41);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field2107;
        byte[] var6;
        synchronized (this.field2107) {
            var6 = this.field2107.method1087(1, arg0, arg1);
        }
        class235 var7 = new class235();
        if (var6 != null) {
            var7.method1453(-1, new class138(var6));
        }
        class560 var8 = this.field2111;
        synchronized (this.field2111) {
            this.field2111.method3130((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIIBI)V", line = 324)
    public static final void method1128(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -112) {
            return;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field2114++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class240.field3150 - class230.field3012) * var6 / 100 + class230.field3012;
        if (class641.field8862 > var7) {
            var7 = class641.field8862;
        } else if (class316.field4601 < var7) {
            var7 = class316.field4601;
        }
        int var8 = arg5 * var7 * 512 / (arg3 * 334);
        if (class207.field2705 > var8) {
            short var12 = class207.field2705;
            var7 = arg3 * 334 * var12 / (arg5 * 512);
            if (var7 > class316.field4601) {
                var7 = class316.field4601;
                int var13 = arg5 * var7 * 512 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg0) {
                    class9.field103.method1984();
                    class9.field103.method3811(arg2, var14, arg5, arg1, -16777216, 30);
                    class9.field103.method3811(arg2, var14, arg5, arg1 + arg3 - var14, -16777216, 53);
                }
                arg1 += var14;
                arg3 -= var14 * 2;
            }
        } else if (class502.field6773 < var8) {
            short var9 = class502.field6773;
            var7 = var9 * 334 * arg3 / (arg5 * 512);
            if (class641.field8862 > var7) {
                var7 = class641.field8862;
                int var10 = arg3 * var9 * 334 / (var7 * 512);
                int var11 = (arg5 - var10) / 2;
                if (arg0) {
                    class9.field103.method1984();
                    class9.field103.method3811(arg2, arg3, var11, arg1, -16777216, 89);
                    class9.field103.method3811(arg2 + arg5 - var11, arg3, var11, arg1, -16777216, 56);
                }
                arg5 -= var11 * 2;
                arg2 += var11;
            }
        }
        class313.field4507 = (short) arg3;
        class275.field3726 = arg2;
        class128.field1630 = arg5 * var7 / 334;
        class360.field5195 = (short) arg5;
        class407.field5737 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 419)
    public final void method1129(byte arg0) {
        field2110++;
        class560 var2 = this.field2111;
        synchronized (this.field2111) {
            this.field2111.method3142(false);
            if (arg0 != -109) {
                this.field2111 = null;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 438)
    public static void method1130(int arg0) {
        if (arg0 >= -91) {
            method1130(-22);
        }
        field2109 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 458)
    public class169(class484 arg0, int arg1, class159 arg2) {
        this.field2107 = arg2;
        this.field2107.method1076(1, 0);
    }
}

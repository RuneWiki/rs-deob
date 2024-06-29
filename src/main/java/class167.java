import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class167 extends class195 {

    @OriginalMember(owner = "client!lk", name = "cb", descriptor = "I")
    private int field2631 = 0;

    @OriginalMember(owner = "client!lk", name = "db", descriptor = "I")
    private int field2632 = 2000;

    @OriginalMember(owner = "client!lk", name = "eb", descriptor = "I")
    private int field2633 = 4096;

    @OriginalMember(owner = "client!lk", name = "jb", descriptor = "I")
    private int field2638 = 0;

    @OriginalMember(owner = "client!lk", name = "fb", descriptor = "I")
    private int field2634 = 16;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "Lck;")
    public static class119 field2624 = class298.method1987((byte) 12, "http:)4)4");

    @OriginalMember(owner = "client!lk", name = "ib", descriptor = "Z")
    public static boolean field2637 = false;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "Lpi;")
    public static class73 field2623 = new class73(64);

    @OriginalMember(owner = "client!lk", name = "mb", descriptor = "S")
    public static short field2641 = 256;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!lk", name = "bb", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!lk", name = "gb", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!lk", name = "hb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!lk", name = "kb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!lk", name = "lb", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 5)
    public final void method14(int arg0) {
        field2636++;
        class166.method1046((byte) 36);
        if (arg0 != 2048879374) {
            this.field2631 = -18;
        }
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V", line = 17)
    public static final void method1053(int arg0) {
        class57 var1 = class242.field3888;
        synchronized (class242.field3888) {
            class111.field1703 = class158.field2512;
            class120.field1887++;
            if (class119.field1833 >= 0) {
                while (class187.field2936 != class119.field1833) {
                    int var3 = class297.field4989[class187.field2936];
                    class187.field2936 = class187.field2936 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class289.field4760[var3] = true;
                    } else {
                        class289.field4760[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class289.field4760[var2] = false;
                }
                class119.field1833 = class187.field2936;
            }
            class158.field2512 = class44.field664;
        }
        if (arg0 == 1) {
            field2628++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)[F", line = 59)
    public static final float[] method1054(int arg0) {
        field2640++;
        if (arg0 != -23149) {
            field2637 = false;
        }
        float var1 = class178.method1135() + class178.method1137();
        int var2 = class178.method1139();
        class8.field160[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFF73) >> 8) / 255.0F;
        float var4 = (float) (var2 & 0xFF) / 255.0F;
        float var5 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class8.field160[2] = class86.field1304[2] * var4 * var6 * var1;
        class8.field160[1] = class86.field1304[1] * var3 * var6 * var1;
        class8.field160[0] = class86.field1304[0] * var5 * var6 * var1;
        return class8.field160;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V", line = 97)
    public static final void method1055(byte arg0) {
        for (int var1 = 0; var1 < class74.field1154; var1++) {
            int var10002 = class262.field4250[var1]--;
            if (class262.field4250[var1] >= -10) {
                class15 var3 = class249.field4023[var1];
                if (var3 == null) {
                    var3 = class15.method120(class168.field2652, class220.field3535[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class262.field4250[var1] += var3.method123();
                    class249.field4023[var1] = var3;
                }
                if (class262.field4250[var1] < 0) {
                    int var10;
                    if (class272.field4471[var1] == 0) {
                        var10 = class4.field120;
                    } else {
                        int var4 = (class272.field4471[var1] & 0xFF) * 128;
                        int var5 = class272.field4471[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class124.field1917.field4949;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class272.field4471[var1] & 0xFFF0) >> 8;
                        int var8 = var7 * 128 + 64 - class124.field1917.field4991;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class262.field4250[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class184.field2916 / var4;
                    }
                    if (var10 > 0) {
                        class34 var11 = var3.method122().method251(class176.field2811);
                        class239 var12 = class239.method1530(var11, 100, var10);
                        var12.method1527(class134.field2152[var1] - 1);
                        class230.field3721.method1420(var12);
                    }
                    class262.field4250[var1] = -100;
                }
            } else {
                class74.field1154--;
                for (int var2 = var1; var2 < class74.field1154; var2++) {
                    class220.field3535[var2] = class220.field3535[var2 + 1];
                    class249.field4023[var2] = class249.field4023[var2 + 1];
                    class134.field2152[var2] = class134.field2152[var2 + 1];
                    class262.field4250[var2] = class262.field4250[var2 + 1];
                    class272.field4471[var2] = class272.field4471[var2 + 1];
                }
                var1--;
            }
        }
        int var13 = 35 / ((arg0 - 41) / 57);
        if (class196.field3151 && !class181.method1155(-121)) {
            if (class78.field1205 != 0 && class250.field4042 != -1) {
                class55.method407(class250.field4042, false, class78.field1205, (byte) 127, 0, class11.field193);
            }
            class196.field3151 = false;
        } else if (class78.field1205 != 0 && class250.field4042 != -1 && !class181.method1155(-120)) {
            class6.field149.method966(0, 158);
            class6.field149.method26(class250.field4042, 99);
            class260.field4168++;
            class250.field4042 = -1;
        }
        field2635++;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 222)
    public class167() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)I", line = 240)
    public static final int method1056(boolean arg0, int arg1) {
        if (arg0) {
            field2625++;
            return arg1 & 0x7F;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lfj;II)V", line = 254)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            return;
        }
        if (arg2 == 0) {
            this.field2631 = arg0.method64((byte) 62);
        } else if (arg2 == 1) {
            this.field2632 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field2634 = arg0.method64((byte) -91);
        } else if (arg2 == 3) {
            this.field2638 = arg0.method63((byte) 1);
        } else if (arg2 == 4) {
            this.field2633 = arg0.method63((byte) 1);
        }
        field2630++;
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V", line = 314)
    public static void method1057(int arg0) {
        field2624 = null;
        if (arg0 == 2047) {
            field2623 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)[I", line = 326)
    public final int[] method11(int arg0, boolean arg1) {
        int[] var3 = this.field3106.method924(100, arg0);
        field2626++;
        if (arg1) {
            return (int[]) null;
        }
        if (this.field3106.field2260) {
            int var4 = this.field2633 >> 1;
            int[][] var5 = this.field3106.method920((byte) 106);
            Random var6 = new Random((long) this.field2631);
            for (int var7 = 0; var7 < this.field2632; var7++) {
                int var8 = this.field2633 <= 0 ? this.field2638 : this.field2638 - (var4 - class44.method342(this.field2633, var6, 0));
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class44.method342(class157.field2504, var6, 0);
                int var11 = class44.method342(class227.field3621, var6, 0);
                int var12 = var10 + (class237.field3802[var9] * this.field2634 >> 12);
                int var13 = (class67.field1045[var9] * this.field2634 >> 12) + var11;
                int var14 = var12 - var10;
                int var15 = var13 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var11;
                        int var20 = var10;
                        var11 = var13;
                        var13 = var19;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = 2048 / var22;
                    int var25 = var13 > var11 ? 1 : -1;
                    int var26 = -var22 / 2;
                    int var27 = 1024 - (class44.method342(4096, var6, 0) >> 2);
                    for (int var28 = var10; var28 < var12; var28++) {
                        var26 += var23;
                        int var29 = (var28 - var10) * var24 + var27 + 1024;
                        int var30 = var28 & class254.field4088;
                        int var31 = var21 & class59.field945;
                        if (var26 > 0) {
                            var21 += var25;
                            var26 += -var22;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)V", line = 457)
    public static final void method1058(int arg0, int arg1, int arg2) {
        field2639++;
        if (class272.field4474 < 2 && class198.field3171 == 0 && !class114.field1725) {
            return;
        }
        class119 var3;
        if (class198.field3171 == 1 && class272.field4474 < 2) {
            var3 = class170.method1074(new class119[] { class169.field2678, class50.field828, class283.field4673, class73.field1132 }, -91);
        } else if (class114.field1725 && class272.field4474 < 2) {
            var3 = class170.method1074(new class119[] { class227.field3633, class50.field828, class150.field2388, class73.field1132 }, -123);
        } else {
            var3 = class50.method388(-1, class272.field4474 - 1);
        }
        if (class272.field4474 > 2) {
            var3 = class170.method1074(new class119[] { var3, class261.field4189, class234.method1506(class272.field4474 - 2, (byte) -79), class39.field580 }, -87);
        }
        int var4 = class110.field1683.method1836(var3, arg0 + 4, arg2 + 15, 16777215, 0, class88.field1341, class67.field1048);
        class86.method577(arg0 + 4, 15, var4 + class110.field1683.method1833(var3), (byte) 43, arg2);
        if (arg1 != -27612) {
            field2624 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([Lml;IIIIIIIII)V", line = 493)
    public static final void method1059(class134[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class121.method804(arg4, arg1, arg7, arg6);
        if (arg3 != 18515) {
            field2637 = false;
        }
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class134 var11 = arg0[var10];
            if (var11 != null && (var11.field2024 == arg8 || arg8 == -1412584499 && class131.field2007 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class46.field681[class36.field499] = var11.field2021 + arg5;
                    class151.field2392[class36.field499] = var11.field2100 + arg2;
                    class164.field2586[class36.field499] = var11.field2180;
                    class139.field2235[class36.field499] = var11.field2057;
                    var12 = class36.field499++;
                } else {
                    var12 = arg9;
                }
                var11.field2132 = class1.field15;
                var11.field2143 = var12;
                if (!var11.field2097 || !client.method612(var11)) {
                    if (var11.field2068 > 0) {
                        class61.method449((byte) -90, var11);
                    }
                    int var13 = var11.field2021 + arg5;
                    int var14 = var11.field2100 + arg2;
                    int var15 = var11.field2139;
                    if (class106.field1626 && (client.method620(var11) != 0 || var11.field2135 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class131.field2007 == var11) {
                        if (arg8 != -1412584499 && !var11.field2176) {
                            class6.field141 = arg5;
                            class185.field2926 = arg0;
                            class283.field4676 = arg2;
                            continue;
                        }
                        if (class237.field3810 && class154.field2463) {
                            int var16 = class129.field1984;
                            int var17 = class65.field1024;
                            int var18 = var16 - class118.field1789;
                            if (class210.field3357 > var18) {
                                var18 = class210.field3357;
                            }
                            if (class210.field3357 + class288.field4742.field2180 < var11.field2180 + var18) {
                                var18 = class210.field3357 + class288.field4742.field2180 - var11.field2180;
                            }
                            var13 = var18;
                            int var19 = var17 - class250.field4038;
                            if (var19 < class142.field2269) {
                                var19 = class142.field2269;
                            }
                            if (class142.field2269 + class288.field4742.field2057 < var11.field2057 + var19) {
                                var19 = class142.field2269 + class288.field4742.field2057 - var11.field2057;
                            }
                            var14 = var19;
                        }
                        if (!var11.field2176) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field2135 == 2) {
                        var25 = arg6;
                        var24 = arg4;
                        var22 = arg7;
                        var23 = arg1;
                    } else {
                        int var20 = var11.field2180 + var13;
                        int var21 = var14 + var11.field2057;
                        if (var11.field2135 == 9) {
                            var21++;
                            var20++;
                        }
                        var22 = arg7 <= var20 ? arg7 : var20;
                        var23 = arg1 >= var14 ? arg1 : var14;
                        var24 = var13 <= arg4 ? arg4 : var13;
                        var25 = arg6 > var21 ? var21 : arg6;
                    }
                    if (!var11.field2097 || var22 > var24 && var23 < var25) {
                        if (var11.field2068 != 0) {
                            if (var11.field2068 == 1337 || var11.field2068 == 1403) {
                                class170.field2698 = var13;
                                class202.field3208 = var11;
                                class291.field4769 = var14;
                                class98.method658(var11.field2057, var14, var11.field2068 == 1403, var13, 0, var11.field2180);
                                class121.method804(arg4, arg1, arg7, arg6);
                                continue;
                            }
                            if (var11.field2068 == 1338) {
                                if (var11.method884(false)) {
                                    class50.method374(var12, var14, var13, (byte) 122, var11);
                                    class121.method804(arg4, arg1, arg7, arg6);
                                }
                                continue;
                            }
                            if (var11.field2068 == 1339) {
                                if (var11.method884(false)) {
                                    class67.method492(-125, var13, var14, var11, var12);
                                    class121.method804(arg4, arg1, arg7, arg6);
                                }
                                continue;
                            }
                            if (var11.field2068 == 1400) {
                                class10.method103(var11.field2057, 11755, var11.field2180, var14, var13);
                                class212.field3379[var12] = true;
                                class187.field2940[var12] = true;
                                class121.method804(arg4, arg1, arg7, arg6);
                                continue;
                            }
                            if (var11.field2068 == 1401) {
                                class86.method579(23909, var14, var11.field2057, var13, var11.field2180);
                                class212.field3379[var12] = true;
                                class187.field2940[var12] = true;
                                class121.method804(arg4, arg1, arg7, arg6);
                                continue;
                            }
                            if (var11.field2068 == 1402) {
                                continue;
                            }
                            if (var11.field2068 == 1404) {
                                class7.method88(var14, class110.field1683, 96, var11, var11.field2180, var13, var11.field2057, class281.field4639);
                                class212.field3379[var12] = true;
                                class187.field2940[var12] = true;
                                continue;
                            }
                            if (var11.field2068 == 1405) {
                                if (class106.field1618) {
                                    int var26 = var13 + var11.field2180;
                                    int var27 = var14 + 15;
                                    class8.field167.method1847(class170.method1074(new class119[] { class296.field4927, class234.method1506(class81.field1234, (byte) -79) }, arg3 - 18631), var26, var27, 16776960, -1);
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var116 = var27 + 15;
                                    int var30 = 16776960;
                                    if (var29 > 65536) {
                                        var30 = 16711680;
                                    }
                                    class8.field167.method1847(class170.method1074(new class119[] { class164.field2595, class234.method1506(var29, (byte) -79), class3.field65 }, -112), var26, var116, var30, -1);
                                    var27 = var116 + 15;
                                    int var31 = 16776960;
                                    int var32 = (class143.field2278 + class143.field2277 + class143.field2279) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class8.field167.method1847(class170.method1074(new class119[] { class153.field2439, class234.method1506(var32, (byte) -79), class3.field65 }, -96), var26, var27, var31, -1);
                                    var27 += 15;
                                    class212.field3379[var12] = true;
                                    class187.field2940[var12] = true;
                                }
                                continue;
                            }
                        }
                        int var33 = class129.field1984;
                        int var34 = class65.field1024;
                        if (var11.field2135 == 0 && var11.field2153 && var24 <= class129.field1984 && var23 <= class65.field1024 && class129.field1984 < var22 && var25 > class65.field1024 && !class104.field1612 && !class106.field1626) {
                            class88.field1355[0] = 1005;
                            class155.field2471[0] = class162.field2563;
                            class212.field3398[0] = class203.field3220;
                            class272.field4474 = 1;
                        }
                        if (!class104.field1612 && var33 >= var24 && var34 >= var23 && var22 > var33 && var34 < var25) {
                            class31.method232(var11, var33 - var13, -var14 + var34, (byte) -94);
                        }
                        if (var11.field2135 == 0) {
                            if (!var11.field2097 && client.method612(var11) && class93.field1439 != var11) {
                                continue;
                            }
                            if (!var11.field2097) {
                                if (var11.field2169 > var11.field2095 - var11.field2057) {
                                    var11.field2169 = var11.field2095 - var11.field2057;
                                }
                                if (var11.field2169 < 0) {
                                    var11.field2169 = 0;
                                }
                            }
                            method1059(arg0, var23, var14 - var11.field2169, 18515, var24, var13 - var11.field2173, var25, var22, var11.field2120, var12);
                            if (var11.field2061 != null) {
                                method1059(var11.field2061, var23, var14 - var11.field2169, 18515, var24, var13 - var11.field2173, var25, var22, var11.field2120, var12);
                            }
                            class288 var35 = (class288) class206.field3268.method1329((byte) 90, (long) var11.field2120);
                            if (var35 != null) {
                                if (var35.field4734 == 0 && class129.field1984 >= var24 && var23 <= class65.field1024 && class129.field1984 < var22 && class65.field1024 < var25 && !class104.field1612 && !class106.field1626) {
                                    class155.field2471[0] = class162.field2563;
                                    class212.field3398[0] = class203.field3220;
                                    class88.field1355[0] = 1005;
                                    class272.field4474 = 1;
                                }
                                class182.method1163(var24, false, var25, var35.field4739, var12, var23, var13, var22, var14);
                            }
                            class121.method804(arg4, arg1, arg7, arg6);
                        }
                        if (class108.field1657[var12] || class256.field4108 > 1) {
                            if (var11.field2135 == 0 && !var11.field2097 && var11.field2057 < var11.field2095) {
                                class37.method289(var11.field2057, var11.field2169, -32, var11.field2095, var13 + var11.field2180, var14);
                            }
                            if (var11.field2135 != 1) {
                                if (var11.field2135 == 2) {
                                    int var99 = 0;
                                    for (int var100 = 0; var100 < var11.field2089; var100++) {
                                        for (int var101 = 0; var101 < var11.field2141; var101++) {
                                            int var102 = (var11.field2168 + 32) * var101 + var13;
                                            int var103 = var14 + ((var11.field2149 + 32) * var100);
                                            if (var99 < 20) {
                                                var103 += var11.field2161[var99];
                                                var102 += var11.field2032[var99];
                                            }
                                            if (var11.field2042[var99] > 0) {
                                                boolean var105 = false;
                                                boolean var106 = false;
                                                int var107 = var11.field2042[var99] - 1;
                                                if ((var102 + 32) > arg4 && arg7 > var102 && arg1 < var103 + 32 && arg6 > var103 || class97.field1486 == var11 && class249.field4027 == var99) {
                                                    class88 var108;
                                                    if (class198.field3171 == 1 && class155.field2473 == var99 && class166.field2621 == var11.field2120) {
                                                        var108 = class241.method1569(114, var107, 2, var11.field2157, 0, var11.field2054[var99]);
                                                    } else {
                                                        var108 = class241.method1569(-114, var107, 1, var11.field2157, 3153952, var11.field2054[var99]);
                                                    }
                                                    if (class284.field4694) {
                                                        class212.field3379[var12] = true;
                                                    }
                                                    if (var108 == null) {
                                                        class26.method194(var11, arg3 ^ 0xFFFFB792);
                                                    } else if (class97.field1486 == var11 && class249.field4027 == var99) {
                                                        int var109 = class129.field1984 - class89.field1365;
                                                        int var110 = class65.field1024 - class14.field222;
                                                        if (var110 < 5 && var110 > -5) {
                                                            var110 = 0;
                                                        }
                                                        if (var109 < 5 && var109 > -5) {
                                                            var109 = 0;
                                                        }
                                                        if (class23.field353 < 5) {
                                                            var110 = 0;
                                                            var109 = 0;
                                                        }
                                                        var108.method145(var102 + var109, var103 - -var110, 128);
                                                        if (arg8 != -1) {
                                                            class134 var111 = arg0[arg8 & 0xFFFF];
                                                            int var112 = class121.field1895;
                                                            int var113 = class121.field1897;
                                                            if (var113 > (var103 + var110) && var111.field2169 > 0) {
                                                                int var114 = (var113 - var110 - var103) * class164.field2592 / 3;
                                                                if ((class164.field2592 * 10) < var114) {
                                                                    var114 = class164.field2592 * 10;
                                                                }
                                                                if (var114 > var111.field2169) {
                                                                    var114 = var111.field2169;
                                                                }
                                                                class14.field222 += var114;
                                                                var111.field2169 -= var114;
                                                                class26.method194(var111, arg3 ^ 0xFFFFB791);
                                                            }
                                                            if (var112 < (var103 + var110 + 32) && var111.field2095 - var111.field2057 > var111.field2169) {
                                                                int var115 = (var103 + var110 + 32 - var112) * class164.field2592 / 3;
                                                                if ((class164.field2592 * 10) < var115) {
                                                                    var115 = class164.field2592 * 10;
                                                                }
                                                                if ((var111.field2095 - var111.field2169 - var111.field2057) < var115) {
                                                                    var115 = var111.field2095 - var111.field2169 - var111.field2057;
                                                                }
                                                                class14.field222 -= var115;
                                                                var111.field2169 += var115;
                                                                class26.method194(var111, arg3 - 18643);
                                                            }
                                                        }
                                                    } else if (class212.field3377 == var11 && class255.field4101 == var99) {
                                                        var108.method145(var102, var103, 128);
                                                    } else {
                                                        var108.method139(var102, var103);
                                                    }
                                                }
                                            } else if (var11.field2020 != null && var99 < 20) {
                                                class88 var104 = var11.method890(var99, (byte) 125);
                                                if (var104 != null) {
                                                    var104.method139(var102, var103);
                                                } else if (class4.field119) {
                                                    class26.method194(var11, -79);
                                                }
                                            }
                                            var99++;
                                        }
                                    }
                                } else if (var11.field2135 == 3) {
                                    int var98;
                                    if (class87.method587((byte) -12, var11)) {
                                        var98 = var11.field2040;
                                        if (class93.field1439 == var11 && var11.field2155 != 0) {
                                            var98 = var11.field2155;
                                        }
                                    } else {
                                        var98 = var11.field2044;
                                        if (class93.field1439 == var11 && var11.field2109 != 0) {
                                            var98 = var11.field2109;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2182) {
                                            class121.method811(var13, var14, var11.field2180, var11.field2057, var98);
                                        } else {
                                            class121.method813(var13, var14, var11.field2180, var11.field2057, var98);
                                        }
                                    } else if (var11.field2182) {
                                        class121.method807(var13, var14, var11.field2180, var11.field2057, var98, 256 - (var15 & 0xFF));
                                    } else {
                                        class121.method810(var13, var14, var11.field2180, var11.field2057, var98, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2135 == 4) {
                                    class278 var36 = var11.method880(31659, class254.field4086);
                                    if (var36 != null) {
                                        class119 var37 = var11.field2019;
                                        int var38;
                                        if (class87.method587((byte) -12, var11)) {
                                            var38 = var11.field2040;
                                            if (class93.field1439 == var11 && var11.field2155 != 0) {
                                                var38 = var11.field2155;
                                            }
                                            if (var11.field2052.method776((byte) -106) > 0) {
                                                var37 = var11.field2052;
                                            }
                                        } else {
                                            var38 = var11.field2044;
                                            if (class93.field1439 == var11 && var11.field2109 != 0) {
                                                var38 = var11.field2109;
                                            }
                                        }
                                        if (var11.field2097 && var11.field2049 != -1) {
                                            class262 var39 = class205.method1296((byte) -84, var11.field2049);
                                            var37 = var39.field4212;
                                            if (var37 == null) {
                                                var37 = class32.field471;
                                            }
                                            if ((var39.field4201 == 1 || var11.field2072 != 1) && var11.field2072 != -1) {
                                                var37 = class170.method1074(new class119[] { class226.field3618, var37, class1.field17, class56.method416(var11.field2072, (byte) 116) }, -120);
                                            }
                                        }
                                        if (class191.field3064 == var11) {
                                            var37 = class71.field1107;
                                            var38 = var11.field2044;
                                        }
                                        if (!var11.field2097) {
                                            var37 = class53.method398(var37, var11, 0);
                                        }
                                        var36.method1846(var37, var13, var14, var11.field2180, var11.field2057, var38, var11.field2181 ? 0 : -1, var11.field2050, var11.field2078, var11.field2133);
                                    } else if (class4.field119) {
                                        class26.method194(var11, -93);
                                    }
                                } else if (var11.field2135 == 5) {
                                    if (var11.field2097) {
                                        class88 var84;
                                        if (var11.field2049 == -1) {
                                            var84 = var11.method889(1897326632, false);
                                        } else {
                                            var84 = class241.method1569(-93, var11.field2049, var11.field2110, var11.field2157, var11.field2146, var11.field2072);
                                        }
                                        if (var84 != null) {
                                            int var85 = var84.field1346;
                                            int var86 = var84.field1344;
                                            if (var11.field2112) {
                                                int var87 = (var11.field2057 + var86 - 1) / var86;
                                                int var88 = (var85 + var11.field2180 - 1) / var85;
                                                class121.method814(var13, var14, var11.field2180 + var13, var11.field2057 + var14);
                                                boolean var89 = class206.method1301(0, var84.field1347);
                                                boolean var90 = class206.method1301(0, var84.field1345);
                                                class160 var91 = (class160) var84;
                                                if (var89 && var90) {
                                                    if (var15 == 0) {
                                                        var91.method1021(var13, var14, var88, var87);
                                                    } else {
                                                        var91.method1026(var13, var14, 256 - (var15 & 0xFF), var88, var87);
                                                    }
                                                } else if (var89) {
                                                    for (int var95 = 0; var95 < var87; var95++) {
                                                        if (var15 == 0) {
                                                            var91.method1021(var13, var86 * var95 + var14, var88, 1);
                                                        } else {
                                                            var91.method1026(var13, var14 + (var86 * var95), -(var15 & 0xFF) + 256, var88, 1);
                                                        }
                                                    }
                                                } else if (var90) {
                                                    for (int var94 = 0; var94 < var88; var94++) {
                                                        if (var15 == 0) {
                                                            var91.method1021(var85 * var94 + var13, var14, 1, var87);
                                                        } else {
                                                            var91.method1026(var85 * var94 + var13, var14, 256 - (var15 & 0xFF), 1, var87);
                                                        }
                                                    }
                                                } else {
                                                    for (int var92 = 0; var92 < var88; var92++) {
                                                        for (int var93 = 0; var93 < var87; var93++) {
                                                            if (var15 == 0) {
                                                                var84.method139(var85 * var92 + var13, var14 - -(var86 * var93));
                                                            } else {
                                                                var84.method145(var13 + (var85 * var92), var14 - -(var86 * var93), 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                }
                                                class121.method804(arg4, arg1, arg7, arg6);
                                            } else {
                                                int var96 = var11.field2180 * 4096 / var85;
                                                if (var11.field2172 != 0) {
                                                    var84.method600((byte) -114, var11.field2172, var96, var14 + (var11.field2057 / 2), var11.field2180 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var84.method138(var13, var14, var11.field2180, var11.field2057, 256 - (var15 & 0xFF));
                                                } else if (var11.field2180 == var85 && var11.field2057 == var86) {
                                                    var84.method139(var13, var14);
                                                } else {
                                                    var84.method332(var13, var14, var11.field2180, var11.field2057);
                                                }
                                            }
                                        } else if (class4.field119) {
                                            class26.method194(var11, -124);
                                        }
                                    } else {
                                        class88 var97 = var11.method889(1897326632, class87.method587((byte) -12, var11));
                                        if (var97 != null) {
                                            var97.method139(var13, var14);
                                        } else if (class4.field119) {
                                            class26.method194(var11, -73);
                                        }
                                    }
                                } else if (var11.field2135 == 6) {
                                    int var40 = 0;
                                    class28 var41 = null;
                                    boolean var42 = class87.method587((byte) -12, var11);
                                    int var43;
                                    if (var42) {
                                        var43 = var11.field2086;
                                    } else {
                                        var43 = var11.field2113;
                                    }
                                    if (var11.field2049 != -1) {
                                        class262 var48 = class205.method1296((byte) -90, var11.field2049);
                                        if (var48 != null) {
                                            class262 var49 = var48.method1691(arg3 ^ 0xFFFFB7DE, var11.field2072);
                                            class56 var50 = var43 == -1 ? null : class276.method1818(-20682, var43);
                                            var41 = var49.method1695(var11.field2178, (byte) -35, 1, var50);
                                            if (var41 == null) {
                                                class26.method194(var11, -109);
                                            } else {
                                                var40 = -var41.method214() / 2;
                                            }
                                        }
                                    } else if (var11.field2126 == 5) {
                                        if (var11.field2171 == -1) {
                                            var41 = class82.field1254.method1663((class56) null, (class56) null, -1, -1, 3);
                                        } else {
                                            int var44 = var11.field2171 & 0x7FF;
                                            if (class262.field4259 == var44) {
                                                var44 = 2047;
                                            }
                                            class292 var45 = class23.field346[var44];
                                            class56 var46 = var43 == -1 ? null : class276.method1818(-20682, var43);
                                            if (var45 != null && ((int) var45.field4861.method786((byte) 112) << 11) == (var11.field2171 & 0xFFFFF800)) {
                                                var41 = var45.field4848.method1663(var46, (class56) null, 0, var11.field2178, 3);
                                            }
                                        }
                                    } else if (var43 == -1) {
                                        var41 = var11.method895(arg3 - 18453, class124.field1917.field4848, (class56) null, -1, var42);
                                        if (var41 == null && class4.field119) {
                                            class26.method194(var11, arg3 ^ 0xFFFFB7EA);
                                        }
                                    } else {
                                        class56 var47 = class276.method1818(arg3 - 39197, var43);
                                        var41 = var11.method895(127, class124.field1917.field4848, var47, var11.field2178, var42);
                                        if (var41 == null && class4.field119) {
                                            class26.method194(var11, -98);
                                        }
                                    }
                                    if (var41 != null) {
                                        int var51;
                                        if (var11.field2070 > 0) {
                                            var51 = (var11.field2180 << 8) / var11.field2070;
                                        } else {
                                            var51 = 256;
                                        }
                                        int var52;
                                        if (var11.field2158 <= 0) {
                                            var52 = 256;
                                        } else {
                                            var52 = (var11.field2057 << 8) / var11.field2158;
                                        }
                                        int var53 = (var11.field2125 * var51 >> 8) + var13 + (var11.field2180 / 2);
                                        int var54 = var14 - (-(var11.field2057 / 2) - (var11.field2041 * var52 >> 8));
                                        if (var11.field2087) {
                                            class264.method1735(var53, var54, var11.field2096, var11.field2165, var51, var52);
                                        } else {
                                            class264.method1723(var53, var54, var51, var52);
                                            class264.method1734((float) var11.field2136, (float) var11.field2165 * 1.5F);
                                        }
                                        class264.method1736();
                                        class264.method1726(true);
                                        class264.method1718(false);
                                        class94.method641(true);
                                        if (class132.field2010) {
                                            class121.method816();
                                            class264.method1728();
                                            class121.method804(arg4, arg1, arg7, arg6);
                                            class132.field2010 = false;
                                        }
                                        if (var11.field2075) {
                                            class264.method1725();
                                        }
                                        int var55 = class284.field4698[var11.field2170] * var11.field2096 >> 16;
                                        int var56 = class284.field4699[var11.field2170] * var11.field2096 >> 16;
                                        if (var11.field2097) {
                                            var41.method212(0, var11.field2123, var11.field2026, var11.field2170, var11.field2090, var40 + var11.field2084 + var55, var11.field2084 + var56);
                                        } else {
                                            var41.method212(0, var11.field2123, 0, var11.field2170, 0, var55, var56);
                                        }
                                        if (var11.field2075) {
                                            class264.method1739();
                                        }
                                    }
                                } else {
                                    if (var11.field2135 == 7) {
                                        class278 var57 = var11.method880(arg3 ^ 0x33F8, class254.field4086);
                                        if (var57 == null) {
                                            if (class4.field119) {
                                                class26.method194(var11, -98);
                                            }
                                            continue;
                                        }
                                        int var58 = 0;
                                        for (int var59 = 0; var59 < var11.field2089; var59++) {
                                            for (int var60 = 0; var60 < var11.field2141; var60++) {
                                                if (var11.field2042[var58] > 0) {
                                                    class262 var61 = class205.method1296((byte) -80, var11.field2042[var58] - 1);
                                                    class119 var62;
                                                    if (var61.field4201 != 1 && var11.field2054[var58] == 1) {
                                                        var62 = class170.method1074(new class119[] { class226.field3618, var61.field4212, class270.field4457 }, -87);
                                                    } else {
                                                        var62 = class170.method1074(new class119[] { class226.field3618, var61.field4212, class1.field17, class56.method416(var11.field2054[var58], (byte) 115) }, -83);
                                                    }
                                                    int var63 = (var11.field2149 + 12) * var59 + var14;
                                                    int var64 = (var11.field2168 + 115) * var60 + var13;
                                                    if (var11.field2050 == 0) {
                                                        var57.method1827(var62, var64, var63, var11.field2044, var11.field2181 ? 0 : -1);
                                                    } else if (var11.field2050 == 1) {
                                                        var57.method1835(var62, var64 + 57, var63, var11.field2044, var11.field2181 ? 0 : -1);
                                                    } else {
                                                        var57.method1847(var62, var64 + 115 - 1, var63, var11.field2044, var11.field2181 ? 0 : -1);
                                                    }
                                                }
                                                var58++;
                                            }
                                        }
                                    }
                                    if (var11.field2135 == 8 && class78.field1197 == var11 && class238.field3820 == class215.field3442) {
                                        int var65 = 0;
                                        int var66 = 0;
                                        class278 var67 = class8.field167;
                                        class119 var68 = var11.field2019;
                                        class119 var69 = class53.method398(var68, var11, 0);
                                        while (var69.method776((byte) -119) > 0) {
                                            int var70 = var69.method788(1, class119.field1840);
                                            class119 var71;
                                            if (var70 == -1) {
                                                var71 = var69;
                                                var69 = class203.field3220;
                                            } else {
                                                var71 = var69.method762(var70, 0, 0);
                                                var69 = var69.method769(arg3 ^ 0xFFFFB7F2, var70 + 4);
                                            }
                                            int var72 = var67.method1833(var71);
                                            if (var72 > var65) {
                                                var65 = var72;
                                            }
                                            var66 += var67.field4590 + 1;
                                        }
                                        int var73 = var14 + var11.field2057 + 5;
                                        var65 += 6;
                                        int var74 = var11.field2180 + var13 - (5 - -var65);
                                        var66 += 7;
                                        if (var13 + 5 > var74) {
                                            var74 = var13 + 5;
                                        }
                                        if (arg7 < var74 + var65) {
                                            var74 = arg7 - var65;
                                        }
                                        if (var73 + var66 > arg6) {
                                            var73 = arg6 - var66;
                                        }
                                        class121.method811(var74, var73, var65, var66, 16777120);
                                        class121.method813(var74, var73, var65, var66, 0);
                                        class119 var75 = var11.field2019;
                                        int var76 = var67.field4590 + var73 + 2;
                                        class119 var77 = class53.method398(var75, var11, 0);
                                        while (var77.method776((byte) -75) > 0) {
                                            int var78 = var77.method788(1, class119.field1840);
                                            class119 var79;
                                            if (var78 == -1) {
                                                var79 = var77;
                                                var77 = class203.field3220;
                                            } else {
                                                var79 = var77.method762(var78, 0, 0);
                                                var77 = var77.method769(-70, var78 + 4);
                                            }
                                            var67.method1827(var79, var74 + 3, var76, 0, -1);
                                            var76 += var67.field4590 + 1;
                                        }
                                    }
                                    if (var11.field2135 == 9) {
                                        int var80;
                                        int var81;
                                        int var82;
                                        int var83;
                                        if (var11.field2099) {
                                            var80 = var11.field2057 + var14;
                                            var83 = var13;
                                            var82 = var14;
                                            var81 = var13 + var11.field2180;
                                        } else {
                                            var80 = var14;
                                            var81 = var11.field2180 + var13;
                                            var82 = var11.field2057 + var14;
                                            var83 = var13;
                                        }
                                        if (var11.field2081 == 1) {
                                            class121.method808(var83, var80, var81, var82, var11.field2044);
                                        } else {
                                            class121.method812(var83, var80, var81, var82, var11.field2044, var11.field2081);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field2627++;
    }
}

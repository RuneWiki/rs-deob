import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class205 implements Runnable {

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Z")
    public boolean field3565 = true;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/lang/Object;")
    private Object field3562 = new Object();

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[I")
    private int[] field3569 = new int[500];

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[I")
    private int[] field3570 = new int[500];

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field3568 = 0;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[[[B")
    public static byte[][][] field3561 = new byte[4][104][104];

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field3566 = 1;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lqe;")
    public static class168 field3571 = class66.method448("Hidden)2", 52);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lgj;")
    public static class239 field3559;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method1329(int arg0) {
        if (class147.field2558 > 1) {
            class147.field2558--;
            class202.field3482 = field3566;
        }
        field3564++;
        if (class182.field3239 > 0) {
            class182.field3239--;
        }
        if (class120.field1974) {
            class120.field1974 = false;
            class230.method1489(128);
            return;
        }
        for (int var1 = 0; var1 < 100 && class91.method602(-51); var1++) {
        }
        if (arg0 < 117) {
            field3571 = null;
        }
        if (class254.field4403 != 30) {
            return;
        }
        class92.method612(177, -7, class87.field1348);
        Object var2 = class180.field3216.field3562;
        synchronized (class180.field3216.field3562) {
            if (!class152.field2644) {
                class180.field3216.field3568 = 0;
            } else if (class200.field3454 != 0 || class180.field3216.field3568 >= 40) {
                class87.field1348.method672(114, 238);
                class87.field1348.method768(0, 7295);
                int var3 = 0;
                int var4 = class87.field1348.field1821;
                for (int var5 = 0; class180.field3216.field3568 > var5 && class87.field1348.field1821 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class180.field3216.field3570[var5];
                    int var7 = class180.field3216.field3569[var5];
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class180.field3216.field3570[var5] == -1 && class180.field3216.field3569[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class243.field4223 != var7 || class27.field322 != var6) {
                        int var9 = var7 - class243.field4223;
                        class243.field4223 = var7;
                        int var10 = var6 - class27.field322;
                        class27.field322 = var6;
                        if (class34.field431 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class87.field1348.method753((class34.field431 << 12) + var10 + (var9 << 6), -242005080);
                            class34.field431 = 0;
                        } else if (class34.field431 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class87.field1348.method768(class34.field431 + 128, 7295);
                            var9 += 128;
                            var10 += 128;
                            class87.field1348.method753((var9 << 8) + var10, -242005080);
                            class34.field431 = 0;
                        } else if (class34.field431 < 32) {
                            class87.field1348.method768(class34.field431 + 192, 7295);
                            if (var8) {
                                class87.field1348.method770(Integer.MIN_VALUE, (byte) -10);
                            } else {
                                class87.field1348.method770(var7 | var6 << 16, (byte) -10);
                            }
                            class34.field431 = 0;
                        } else {
                            class87.field1348.method753(class34.field431 + 57344, -242005080);
                            if (var8) {
                                class87.field1348.method770(Integer.MIN_VALUE, (byte) -10);
                            } else {
                                class87.field1348.method770(var7 | var6 << 16, (byte) -10);
                            }
                            class34.field431 = 0;
                        }
                    } else if (class34.field431 < 2047) {
                        class34.field431++;
                    }
                }
                class14.field130++;
                class87.field1348.method729(class87.field1348.field1821 - var4, -112);
                if (var3 >= class180.field3216.field3568) {
                    class180.field3216.field3568 = 0;
                } else {
                    class180.field3216.field3568 -= var3;
                    for (int var11 = 0; var11 < class180.field3216.field3568; var11++) {
                        class180.field3216.field3569[var11] = class180.field3216.field3569[var3 + var11];
                        class180.field3216.field3570[var11] = class180.field3216.field3570[var3 + var11];
                    }
                }
            }
        }
        if (class200.field3454 != 0) {
            class165.field2807++;
            long var12 = (class182.field3240 - class213.field3678) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class213.field3678 = class182.field3240;
            int var14 = class9.field97;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class198.field3422;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (class200.field3454 == 2) {
                var16 = 1;
            }
            class87.field1348.method672(222, 238);
            int var17 = (int) var12;
            class87.field1348.method745(-1529536968, var15 | var14 << 16);
            class87.field1348.method726(var16 << 15 | var17, (byte) 85);
        }
        if (class108.field1737 > 0) {
            class108.field1737--;
        }
        if (class190.field3306[96] || class190.field3306[97] || class190.field3306[98] || class190.field3306[99]) {
            class181.field3221 = true;
        }
        if (class181.field3221 && class108.field1737 <= 0) {
            class229.field3886++;
            class181.field3221 = false;
            class108.field1737 = 20;
            class87.field1348.method672(157, 238);
            class87.field1348.method755(-127, class71.field1093);
            class87.field1348.method735((byte) 33, class103.field1665);
        }
        if (class25.field294 && !class139.field2460) {
            class139.field2460 = true;
            class145.field2526++;
            class87.field1348.method672(165, 238);
            class87.field1348.method768(1, 7295);
        }
        if (!class25.field294 && class139.field2460) {
            class145.field2526++;
            class139.field2460 = false;
            class87.field1348.method672(165, 238);
            class87.field1348.method768(0, 7295);
        }
        if (!class142.field2502) {
            class87.field1348.method672(40, 238);
            class88.field1362++;
            class87.field1348.method745(-1529536968, class158.method1033((byte) -12));
            class142.field2502 = true;
        }
        class170.method1129((byte) 30);
        if (class254.field4403 != 30) {
            return;
        }
        class181.method1198(-1);
        class175.method1159((byte) 70);
        class44.field578++;
        if (class44.field578 > 750) {
            class230.method1489(128);
            return;
        }
        class64.method434((byte) -53);
        class84.method558((byte) -99);
        class50.method352(20151);
        if (class122.field2021 != null) {
            class76.method513(1);
        }
        for (int var18 = class96.method635(115, true); var18 != -1; var18 = class96.method635(116, false)) {
            class19.method100(var18, 123);
            class109.field1750[class86.method571(31, class79.field1191++)] = var18;
        }
        for (class50 var19 = class73.method497(true); var19 != null; var19 = class73.method497(true)) {
            int var20 = var19.method346(122);
            int var21 = var19.method349((byte) 115);
            if (var20 == 1) {
                class131.field2315[var21] = var19.field677;
                class157.field2721[class86.method571(class221.field3795++, 31)] = var21;
            } else if (var20 == 2) {
                class1.field8[var21] = var19.field675;
                class77.field1147[class86.method571(class91.field1427++, 31)] = var21;
            }
        }
        class146.field2539++;
        if (class163.field2792 != 0) {
            class147.field2555 += 20;
            if (class147.field2555 >= 400) {
                class163.field2792 = 0;
            }
        }
        if (class8.field93 != null) {
            class133.field2331++;
            if (class133.field2331 >= 15) {
                class65.method443(class8.field93, 0);
                class8.field93 = null;
            }
        }
        if (class9.field109 != null) {
            class65.method443(class9.field109, 0);
            if (class146.field2550 > class185.field3271 + 5 || class185.field3271 - 5 > class146.field2550 || class165.field2817 + 5 < class161.field2765 || class161.field2765 < class165.field2817 - 5) {
                class92.field1456 = true;
            }
            class108.field1733++;
            if (class89.field1384 == 0) {
                if (class92.field1456 && class108.field1733 >= 5) {
                    if (class9.field109 == class8.field90 && class129.field2285 != class111.field1778) {
                        class129 var22 = class9.field109;
                        class58.field799++;
                        byte var23 = 0;
                        if (class56.field770 == 1 && var22.field2136 == 206) {
                            var23 = 1;
                        }
                        if (var22.field2156[class129.field2285] <= 0) {
                            var23 = 0;
                        }
                        if (class253.method1671(client.method266(var22), (byte) -127)) {
                            int var24 = class111.field1778;
                            int var25 = class129.field2285;
                            var22.field2156[var25] = var22.field2156[var24];
                            var22.field2221[var25] = var22.field2221[var24];
                            var22.field2156[var24] = -1;
                            var22.field2221[var24] = 0;
                        } else if (var23 == 1) {
                            int var26 = class111.field1778;
                            int var27 = class129.field2285;
                            while (var26 != var27) {
                                if (var26 > var27) {
                                    var22.method879(var26, false, var26 - 1);
                                    var26--;
                                } else if (var26 < var27) {
                                    var22.method879(var26, false, var26 + 1);
                                    var26++;
                                }
                            }
                        } else {
                            var22.method879(class111.field1778, false, class129.field2285);
                        }
                        class87.field1348.method672(247, 238);
                        class87.field1348.method764(0, var23);
                        class87.field1348.method753(class129.field2285, -242005080);
                        class87.field1348.method755(118, class111.field1778);
                        class87.field1348.method738(class9.field109.field2222, true);
                    }
                } else if ((class242.field4135 == 1 || class142.method972(4096, class109.field1748 - 1)) && class109.field1748 > 2) {
                    class123.method840(11340);
                } else if (class109.field1748 > 0) {
                    class65.method444(125, class109.field1748 - 1);
                }
                class9.field109 = null;
                class200.field3454 = 0;
                class133.field2331 = 10;
            }
        }
        class68.field952 = 0;
        class254.field4388 = false;
        class51.field697 = false;
        class38.field520 = null;
        class129 var28 = class129.field2217;
        class129.field2217 = null;
        class129 var29 = class98.field1550;
        class98.field1550 = null;
        while (class45.method299(19061) && class68.field952 < 128) {
            class139.field2465[class68.field952] = class124.field2046;
            class27.field332[class68.field952] = class78.field1182;
            class68.field952++;
        }
        class122.field2021 = null;
        if (class137.field2426 != -1) {
            class193.method1251(class223.field3837, class137.field2426, class42.field551, 0, -100, 0, 0, 0);
        }
        field3566++;
        while (true) {
            class147 var30;
            class129 var31;
            class129 var32;
            do {
                var30 = (class147) class86.field1335.method321((byte) 64);
                if (var30 == null) {
                    while (true) {
                        class147 var33;
                        class129 var34;
                        class129 var35;
                        do {
                            var33 = (class147) class118.field1937.method321((byte) -115);
                            if (var33 == null) {
                                while (true) {
                                    class147 var36;
                                    class129 var37;
                                    class129 var38;
                                    do {
                                        var36 = (class147) class54.field744.method321((byte) -127);
                                        if (var36 == null) {
                                            if (class208.field3617 && class122.field2021 == null) {
                                                class208.field3617 = false;
                                            }
                                            if (class240.field4106 != null) {
                                                class84.method559(true);
                                            }
                                            if (class4.field43 != -1) {
                                                int var39 = class4.field43;
                                                int var40 = class255.field4430;
                                                boolean var41 = class88.method585(0, 0, var39, 0, 0, 0, class7.field85.field206[0], true, class7.field85.field219[0], var40, (byte) 26, 0);
                                                class4.field43 = -1;
                                                if (var41) {
                                                    class57.field782 = class198.field3422;
                                                    class147.field2555 = 0;
                                                    class214.field3703 = class9.field97;
                                                    class163.field2792 = 1;
                                                }
                                            }
                                            class204.method1328((byte) -58);
                                            if (class129.field2217 != var28) {
                                                if (var28 != null) {
                                                    class65.method443(var28, 0);
                                                }
                                                if (class129.field2217 != null) {
                                                    class65.method443(class129.field2217, 0);
                                                }
                                            }
                                            if (class98.field1550 != var29 && class84.field1287 == class46.field590) {
                                                if (var29 != null) {
                                                    class65.method443(var29, 0);
                                                }
                                                if (class98.field1550 != null) {
                                                    class65.method443(class98.field1550, 0);
                                                }
                                            }
                                            if (class98.field1550 == null) {
                                                if (class84.field1287 > 0) {
                                                    class84.field1287--;
                                                }
                                            } else if (class46.field590 > class84.field1287) {
                                                class84.field1287++;
                                                if (class84.field1287 == class46.field590) {
                                                    class65.method443(class98.field1550, 0);
                                                }
                                            }
                                            if (class31.field379 == 1) {
                                                class29.method193((byte) -95);
                                            } else if (class31.field379 == 2) {
                                                class121.method825(-1);
                                            } else {
                                                class143.method975(-74);
                                            }
                                            for (int var42 = 0; var42 < 5; var42++) {
                                                int var10002 = class204.field3546[var42]++;
                                            }
                                            int var43 = class88.method583(-3);
                                            int var44 = class190.method1227(true);
                                            if (var43 > 4500 && var44 > 4500) {
                                                class182.field3239 = 250;
                                                class178.method1177((byte) -105, 4000);
                                                class87.field1348.method672(63, 238);
                                                class76.field1139++;
                                            }
                                            class213.field3694++;
                                            class74.field1129++;
                                            class117.field1908++;
                                            if (class117.field1908 > 500) {
                                                class117.field1908 = 0;
                                                int var45 = (int) (Math.random() * 8.0D);
                                                if ((var45 & 0x2) == 2) {
                                                    class254.field4399 += class158.field2732;
                                                }
                                                if ((var45 & 0x1) == 1) {
                                                    class21.field257 += class64.field897;
                                                }
                                                if ((var45 & 0x4) == 4) {
                                                    class55.field761 += class222.field3815;
                                                }
                                            }
                                            if (class213.field3694 > 500) {
                                                class213.field3694 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x2) == 2) {
                                                    class100.field1583 += class78.field1175;
                                                }
                                                if ((var46 & 0x1) == 1) {
                                                    class159.field2742 += class194.field3391;
                                                }
                                            }
                                            if (class254.field4399 < -55) {
                                                class158.field2732 = 2;
                                            }
                                            if (class159.field2742 < -60) {
                                                class194.field3391 = 2;
                                            }
                                            if (class254.field4399 > 55) {
                                                class158.field2732 = -2;
                                            }
                                            if (class55.field761 < -40) {
                                                class222.field3815 = 1;
                                            }
                                            if (class100.field1583 < -20) {
                                                class78.field1175 = 1;
                                            }
                                            if (class100.field1583 > 10) {
                                                class78.field1175 = -1;
                                            }
                                            if (class159.field2742 > 60) {
                                                class194.field3391 = -2;
                                            }
                                            if (class55.field761 > 40) {
                                                class222.field3815 = -1;
                                            }
                                            if (class21.field257 < -50) {
                                                class64.field897 = 2;
                                            }
                                            if (class21.field257 > 50) {
                                                class64.field897 = -2;
                                            }
                                            if (class74.field1129 > 50) {
                                                class121.field2014++;
                                                class87.field1348.method672(252, 238);
                                            }
                                            class142.method968((byte) 65);
                                            try {
                                                if (class169.field2953 != null && class87.field1348.field1821 > 0) {
                                                    class169.field2953.method1650(12398, 0, class87.field1348.field1780, class87.field1348.field1821);
                                                    class74.field1129 = 0;
                                                    class87.field1348.field1821 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var47) {
                                                class230.method1489(128);
                                                return;
                                            }
                                        }
                                        var37 = var36.field2552;
                                        if (var37.field2123 < 0) {
                                            break;
                                        }
                                        var38 = class257.method1713(var37.field2276, 126);
                                    } while (var38 == null || var38.field2263 == null || var38.field2263.length <= var37.field2123 || var38.field2263[var37.field2123] != var37);
                                    class82.method545(var36, (byte) 106);
                                }
                            }
                            var34 = var33.field2552;
                            if (var34.field2123 < 0) {
                                break;
                            }
                            var35 = class257.method1713(var34.field2276, 127);
                        } while (var35 == null || var35.field2263 == null || var35.field2263.length <= var34.field2123 || var35.field2263[var34.field2123] != var34);
                        class82.method545(var33, (byte) 106);
                    }
                }
                var31 = var30.field2552;
                if (var31.field2123 < 0) {
                    break;
                }
                var32 = class257.method1713(var31.field2276, 127);
            } while (var32 == null || var32.field2263 == null || var32.field2263.length <= var31.field2123 || var32.field2263[var31.field2123] != var31);
            class82.method545(var30, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
    public static final void method1330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3558++;
        int var6 = 0;
        class232.method1501(arg5, arg3 - arg0, (byte) -108, class241.field4117[arg4], arg0 + arg3);
        int var7 = arg0 * arg0;
        int var8 = var7 << 1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = arg2 << 1;
        int var12 = var7 << 2;
        int var13 = (1 - var11) * var7 + var10;
        int var14 = var9 - (var11 - 1) * var8;
        int var15 = arg2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = var9 << 2;
        int var18 = ((arg2 << 1) - 3) * var8;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg1 + arg2) * var12;
        while (var15 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var16;
                    var16 += var17;
                    var6++;
                    var19 += var17;
                }
            }
            var15--;
            int var21 = arg4 - var15;
            int var22 = arg4 + var15;
            if (var14 < 0) {
                var6++;
                var14 += var19;
                var19 += var17;
                var13 += var16;
                var16 += var17;
            }
            var14 += -var18;
            var13 += -var20;
            int var23 = arg3 + var6;
            var18 -= var12;
            var20 -= var12;
            int var24 = arg3 - var6;
            class232.method1501(arg5, var24, (byte) -108, class241.field4117[var21], var23);
            class232.method1501(arg5, var24, (byte) -108, class241.field4117[var22], var23);
        }
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3565) {
            Object var1 = this.field3562;
            synchronized (this.field3562) {
                if (this.field3568 < 500) {
                    this.field3569[this.field3568] = class146.field2550;
                    this.field3570[this.field3568] = class161.field2765;
                    this.field3568++;
                }
            }
            class38.method259(50L, 31644);
        }
        field3560++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method1331(byte arg0) {
        field3559 = null;
        field3561 = null;
        if (arg0 == -38) {
            field3571 = null;
        }
    }
}

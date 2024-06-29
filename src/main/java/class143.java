import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class143 extends class62 {

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Lhq;")
    public static class365 field1680 = new class365(64);

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "Z")
    public static boolean field1683 = false;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Lbe;")
    public static class131 field1684;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "Lmr;")
    public class143 field1677;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Lmr;")
    public class143 field1681;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public static final void method919(boolean arg0) {
        int var1 = 0;
        if (!arg0) {
            return;
        }
        while (class341.field4651 > var1) {
            int var2 = class332.field4530[var1];
            class298 var3 = class220.field2726[var2];
            int var4 = class215.field2658.method1563(-128);
            if ((var4 & 0x4) != 0) {
                var4 += class215.field2658.method1563(-128) << 8;
            }
            if ((var4 & 0x8) != 0) {
                int var5 = class215.field2658.method1569(arg0);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class215.field2658.method1549(48);
                boolean var7 = true;
                if (var5 != -1 && var3.field2467 != -1) {
                    if (var3.field2467 == var5) {
                        class167 var12 = class179.method1124((byte) -42, var5);
                        if (var12.field1937 && var12.field1935 != -1) {
                            class156 var13 = class430.method2621((byte) -50, var12.field1935);
                            int var14 = var13.field1804;
                            if (var14 == 0) {
                                var7 = false;
                            } else if (var14 == 1) {
                                var7 = true;
                            } else if (var14 == 2) {
                                var7 = false;
                                var3.field2398 = 0;
                            }
                        }
                    } else {
                        class167 var8 = class179.method1124((byte) -42, var5);
                        class167 var9 = class179.method1124((byte) -42, var3.field2467);
                        if (var8.field1935 != -1 && var9.field1935 != -1) {
                            class156 var10 = class430.method2621((byte) -92, var8.field1935);
                            class156 var11 = class430.method2621((byte) -42, var9.field1935);
                            if (var10.field1827 < var11.field1827) {
                                var7 = false;
                            }
                        }
                    }
                }
                if (var7) {
                    var3.field2417 = class106.field1273 + (var6 & 0xFFFF);
                    var3.field2404 = 1;
                    var3.field2464 = 0;
                    var3.field2430 = 0;
                    var3.field2416 = var6 >> 16;
                    var3.field2467 = var5;
                    if (var3.field2417 > class106.field1273) {
                        var3.field2464 = -1;
                    }
                    if (var3.field2467 != -1 && class106.field1273 == var3.field2417) {
                        int var15 = class179.method1124((byte) -42, var3.field2467).field1935;
                        if (var15 != -1) {
                            class156 var16 = class430.method2621((byte) -29, var15);
                            if (var16 != null && var16.field1821 != null) {
                                class325.method2038(var3.field1516, var3.field1514, false, var16, 0, (byte) -100);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field2399 = class215.field2658.method1551(88);
                if (var3.field2399 == 65535) {
                    var3.field2399 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var17 = class215.field2658.method1551(69);
                if (var17 == 65535) {
                    var17 = -1;
                }
                int var18 = class215.field2658.method1583(-128);
                class402.method2512(var17, (byte) -118, var18, var3);
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field3971.method1957(true)) {
                    class344.method2192(0, var3);
                }
                var3.method1888(class225.method1387(class215.field2658.method1569(arg0), (byte) 11), 8);
                var3.method1252(var3.field3971.field4106, 1);
                var3.field2421 = var3.field3971.field4127 << 3;
                if (var3.field3971.method1957(arg0)) {
                    class378.method2351(0, (class131) null, (byte) -6, (class446) null, var3, class43.field513, var3.field2480[0], var3.field2482[0]);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var19 = class215.field2658.method1551(99);
                var3.field2444 = class215.field2658.method1583(-128);
                var3.field2462 = class215.field2658.method1563(-128);
                var3.field2390 = (var19 & 0x8000) != 0;
                var3.field2461 = var19 & 0x7FFF;
                var3.field2424 = class106.field1273 + var3.field2461 + var3.field2444;
            }
            if ((var4 & 0x400) != 0) {
                int var20 = class215.field2658.method1572(-3);
                int[] var21 = new int[var20];
                int[] var22 = new int[var20];
                int[] var23 = new int[var20];
                for (int var24 = 0; var24 < var20; var24++) {
                    int var25 = class215.field2658.method1569(arg0);
                    if (var25 == 65535) {
                        var25 = -1;
                    }
                    var21[var24] = var25;
                    var22[var24] = class215.field2658.method1567(true);
                    var23[var24] = class215.field2658.method1587((byte) -102);
                }
                class402.method2507(var23, var21, var3, false, var22);
            }
            if ((var4 & 0x40) != 0) {
                int var26 = class215.field2658.method1559((byte) -49);
                int var27 = class215.field2658.method1567(true);
                var3.method1256(var26, class106.field1273, var27, 2);
                var3.field2422 = class106.field1273 + 300;
                var3.field2402 = class215.field2658.method1563(-128);
            }
            if ((var4 & 0x100) != 0) {
                var3.field2436 = class215.field2658.method1551(60);
                var3.field2389 = class215.field2658.method1569(true);
            }
            if ((var4 & 0x20) != 0) {
                var3.field2418 = class215.field2658.method1565(-76);
                var3.field2463 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var28 = class215.field2658.method1559((byte) -118);
                int var29 = class215.field2658.method1563(-128);
                var3.method1256(var28, class106.field1273, var29, 2);
            }
            var1++;
        }
        field1679++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public final void method920(byte arg0) {
        field1678++;
        if (this.field1681 == null) {
            return;
        }
        if (arg0 != -59) {
            field1683 = true;
        }
        this.field1681.field1677 = this.field1677;
        this.field1677.field1681 = this.field1681;
        this.field1677 = null;
        this.field1681 = null;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
    public static final void method921(int arg0) {
        field1682++;
        if (class40.field484 > 0) {
            class335.method2151(arg0 ^ 0x3815);
            return;
        }
        if (arg0 != 14445) {
            method922((byte) 55);
        }
        class278.field3600 = class181.field2107;
        class181.field2107 = null;
        class259.method1637(40, (byte) 79);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    public static void method922(byte arg0) {
        field1680 = null;
        field1684 = null;
        if (arg0 != -38) {
            field1684 = null;
        }
    }
}

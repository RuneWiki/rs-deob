import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class461 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lui;B)V")
    public static final void method2716(class451 arg0, byte arg1) {
        class17.field225 = arg0;
        field6507++;
        int var2 = 25 / ((-arg1 - 74) / 52);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static final void method2717(int arg0) {
        int var1 = 0;
        if (arg0 >= -87) {
            return;
        }
        while (var1 < class345.field5250) {
            int var2 = class381.field5651[var1];
            class349 var3 = class18.field241[var2];
            int var4 = class220.field3246.method2628(49152);
            if ((var4 & 0x8) != 0) {
                var4 += class220.field3246.method2628(49152) << 8;
            }
            if ((var4 & 0x400) != 0) {
                int var5 = class220.field3246.method2628(49152);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class220.field3246.method2598(15229);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class220.field3246.method2616((byte) 99);
                    var8[var9] = class220.field3246.method2598(15229);
                }
                class188.method1298(var7, -2, var6, var3, var8);
            }
            if ((var4 & 0x100) != 0) {
                var3.field5326 = class220.field3246.method2598(15229);
                var3.field5320 = class220.field3246.method2637(-4);
            }
            if ((var4 & 0x4) != 0) {
                int var11 = class220.field3246.method2635(18);
                int var12 = class220.field3246.method2628(49152);
                var3.method1925(var11, class452.field6418, var12, -12693);
                var3.field4630 = class452.field6418 + 300;
                var3.field4643 = class220.field3246.method2626(122);
            }
            if ((var4 & 0x2) != 0) {
                var3.field4635 = class220.field3246.method2585(77);
                if (var3.field4635 == 65535) {
                    var3.field4635 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var13 = class220.field3246.method2637(-4);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class220.field3246.method2620(-125);
                class305.method1904(var13, var3, -104, var14);
            }
            if ((var4 & 0x40) != 0) {
                int var15 = class220.field3246.method2635(91);
                int var16 = class220.field3246.method2616((byte) 116);
                var3.method1925(var15, class452.field6418, var16, -12693);
            }
            if ((var4 & 0x1) != 0) {
                int var17 = class220.field3246.method2637(-4);
                int var18 = class220.field3246.method2617(1538701744);
                if (var17 == 65535) {
                    var17 = -1;
                }
                boolean var19 = true;
                if (var17 != -1 && var3.field4618 != -1) {
                    if (var3.field4618 == var17) {
                        class188 var20 = class322.field4848.method951(var17, (byte) 117);
                        if (var20.field2861 && var20.field2862 != -1) {
                            class356 var21 = class170.field2423.method1586(var20.field2862, (byte) 36);
                            int var22 = var21.field5415;
                            if (var22 == 0) {
                                var19 = false;
                            } else if (var22 == 1) {
                                var19 = true;
                            } else if (var22 == 2) {
                                var3.field4642 = 0;
                                var19 = false;
                            }
                        }
                    } else {
                        class188 var23 = class322.field4848.method951(var17, (byte) 90);
                        class188 var24 = class322.field4848.method951(var3.field4618, (byte) 82);
                        if (var23.field2862 != -1 && var24.field2862 != -1) {
                            class356 var25 = class170.field2423.method1586(var23.field2862, (byte) 36);
                            class356 var26 = class170.field2423.method1586(var24.field2862, (byte) 36);
                            if (var26.field5419 > var25.field5419) {
                                var19 = false;
                            }
                        }
                    }
                }
                if (var19) {
                    var3.field4659 = 0;
                    var3.field4658 = 0;
                    var3.field4637 = (var18 & 0xFFFF) + class452.field6418;
                    var3.field4633 = var18 >> 16;
                    var3.field4618 = var17;
                    var3.field4608 = 1;
                    if (class452.field6418 < var3.field4637) {
                        var3.field4659 = -1;
                    }
                    if (var3.field4618 != -1 && class452.field6418 == var3.field4637) {
                        int var27 = class322.field4848.method951(var3.field4618, (byte) 110).field2862;
                        if (var27 != -1) {
                            class356 var28 = class170.field2423.method1586(var27, (byte) 36);
                            if (var28 != null && var28.field5389 != null) {
                                class210.method1416(0, var3.field4543, false, var3.field4545, var28, 15806, var3.field4538);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x200) != 0) {
                int var29 = class220.field3246.method2585(102);
                var3.field4665 = class220.field3246.method2626(-68);
                var3.field4639 = class220.field3246.method2626(119);
                var3.field4598 = (var29 & 0x8000) != 0;
                var3.field4664 = var29 & 0x7FFF;
                var3.field4623 = class452.field6418 + var3.field4664 + var3.field4665;
            }
            if ((var4 & 0x80) != 0) {
                var3.field4641 = class220.field3246.method2582((byte) -74);
                var3.field4605 = 100;
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field5309.method1779(96)) {
                    class439.method2556(false, var3);
                }
                var3.method2154(class448.field6339.method334(class220.field3246.method2585(76), (byte) 104), (byte) 48);
                var3.method1919(var3.field5309.field4147, (byte) -127);
                var3.field4621 = var3.field5309.field4131 << 3;
                if (var3.field5309.method1779(115)) {
                    class356.method2192((class271) null, (class257) null, var3.field4545, var3, 0, var3.field4674[0], var3.field4675[0], (byte) -80);
                }
            }
            var1++;
        }
        field6505++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static final void method2718(byte arg0) {
        field6506++;
        class151.field2117.method2401((byte) -114);
        int var1 = -64 / ((-arg0 - 18) / 36);
    }
}

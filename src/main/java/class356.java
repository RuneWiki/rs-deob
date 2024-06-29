import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class356 extends class272 {

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public int field4567 = -1;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    private int field4573 = 0;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "Z")
    private boolean field4568 = false;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public int field4566 = -1;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    public int field4584 = 0;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field4574 = 0;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "[I")
    public static int[] field4582 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lkg;")
    public static class275 field4575 = new class275(108, 4);

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "[I")
    public static int[] field4587 = new int[5];

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public int field4576;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIIII)V")
    public class356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)I")
    public final int method2066(byte arg0) {
        ++field4577;
        if (arg0 != -118) {
            field4574 = 51;
        }
        class639 var2 = class21.field381.method1583(arg0 ^ 38, this.field4569);
        int var3 = var2.field8835;
        if (~this.field4567 != 0) {
            class639 var4 = class21.field381.method1583(113, this.field4567);
            if (var3 < var4.field8835) {
                var3 = var4.field8835;
            }
        }
        if (~this.field4566 != 0) {
            class639 var5 = class21.field381.method1583(-101, this.field4566);
            if (var5.field8835 > var3) {
                var3 = var5.field8835;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lha;I)V")
    public final void method744(class60 arg0, int arg1) {
        if (arg1 != 0) {
            this.field4568 = true;
        }
        ++field4571;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        if (arg0 > -79) {
            this.method87((byte) -122);
        }
        ++field4572;
        return this.field4568;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
    public static final void method2067(int arg0, int arg1) {
        if (arg0 == 16804) {
            ++field4578;
            class37 var2 = class636.method3571(2, arg1, arg0 ^ -16774);
            var2.method230(arg0 ^ 16858);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2068(int arg0, byte arg1, int arg2) {
        int var3 = 15 / ((arg1 - 61) / 49);
        ++field4564;
        return ~(arg0 & 34) != -1;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lha;I)Ljk;")
    public final class635 method755(class60 arg0, int arg1) {
        ++field4570;
        class621 var3 = class236.method1480(super.field5796, super.field5801 >> class480.field6531, super.field5797 >> class480.field6531);
        if (var3 != null && var3.field8559.field7735) {
            int var4 = var3.field8559.method87((byte) 121);
            if (~this.field4584 != ~var4) {
                super.field5800 -= this.field4584;
                super.field5800 += var4;
                this.field4584 = var4;
            }
        }
        int var5 = 4 % ((-39 - arg1) / 55);
        class631 var6 = arg0.method531();
        var6.method595();
        if (var3 == null || !var3.field8559.field7735) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class282 var10 = class195.field2669[super.field5793];
            int var11 = this.field4573 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method1676(super.field5801 + var13, true, super.field5797 + var14);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method1676(super.field5801 + var16, true, super.field5797 + var17);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method1676(super.field5801 + var19, true, super.field5797 + var20);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method1676(super.field5801 + var22, true, super.field5797 + var23);
            int var25 = ~var15 > ~var18 ? var15 : var18;
            int var26 = var21 < var24 ? var21 : var24;
            int var27 = ~var18 > ~var24 ? var18 : var24;
            int var28 = var21 <= var15 ? var21 : var15;
            if (~var11 != -1) {
                int var29 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var25), (double) var11));
                if (~var29 != -1) {
                    var6.method601(var29);
                }
            }
            int var30 = var15 + var24;
            if (var11 != 0) {
                int var31 = (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var28), (double) var11)) & 16383;
                if (var31 != 0) {
                    var6.method608(-var31);
                }
            }
            if (var30 > var18 + var21) {
                var30 = var18 - -var21;
            }
            int var32 = (var30 >> 1) + -super.field5800;
            if (~var32 != -1) {
                var6.method600(0, var32, 0);
            }
        }
        var6.method600(super.field5801, super.field5800 + -10, super.field5797);
        class635 var33 = class510.method2982(true, 0, 3);
        this.field4573 = 0;
        this.field4568 = false;
        if (this.field4566 != -1) {
            class474 var34 = class21.field381.method1583(-20, this.field4566).method3586((class56) null, arg0, (class470) null, 0, 255, -1, this.field4576, 2048, 0);
            if (var34 != null) {
                if (!class232.field3053) {
                    var34.method250(var6, var33.field8760[2], 0);
                } else {
                    var34.method255(var6, var33.field8760[2], class286.field3600, 0);
                }
                this.field4568 |= var34.method287();
                this.field4573 = var34.method248();
            }
        }
        if (~this.field4567 != 0) {
            class474 var35 = class21.field381.method1583(-72, this.field4567).method3586((class56) null, arg0, (class470) null, 0, 255, -1, this.field4583, 2048, 0);
            if (var35 != null) {
                if (class232.field3053) {
                    var35.method255(var6, var33.field8760[1], class286.field3600, 0);
                } else {
                    var35.method250(var6, var33.field8760[1], 0);
                }
                this.field4568 |= var35.method287();
                if (~var35.method248() < ~this.field4573) {
                    this.field4573 = var35.method248();
                }
            }
        }
        class474 var36 = class21.field381.method1583(122, this.field4569).method3586((class56) null, arg0, (class470) null, 0, 255, -1, this.field4580, 2048, 0);
        if (var36 != null) {
            if (class232.field3053) {
                var36.method255(var6, var33.field8760[0], class286.field3600, 0);
            } else {
                var36.method250(var6, var33.field8760[0], 0);
            }
            this.field4568 |= var36.method287();
            if (~var36.method248() < ~this.field4573) {
                this.field4573 = var36.method248();
            }
        }
        return var33;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        ++field4563;
        if (arg0 != -69) {
            field4582 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static void method2069(byte arg0) {
        if (arg0 == -86) {
            field4587 = null;
            field4582 = null;
            field4575 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        if (arg0 >= -41) {
            this.field4566 = 122;
        }
        ++field4581;
        class631 var5 = arg2.method531();
        var5.method596(super.field5801, super.field5800 + -10, super.field5797);
        class639 var6 = class21.field381.method1583(125, this.field4569);
        class474 var7 = var6.method3586((class56) null, arg2, (class470) null, 0, 255, -1, this.field4580, 131072, 0);
        if (var7 != null && (!class232.field3053 ? var7.method258(arg1, arg3, var5, true, var6.field8835) : var7.method275(arg1, arg3, var5, true, var6.field8835, class286.field3600))) {
            return true;
        } else {
            if (~this.field4567 != 0) {
                class639 var8 = class21.field381.method1583(116, this.field4567);
                class474 var9 = var8.method3586((class56) null, arg2, (class470) null, 0, 255, -1, this.field4583, 131072, 0);
                if (var9 != null && (class232.field3053 ? var9.method275(arg1, arg3, var5, true, var8.field8835, class286.field3600) : var9.method258(arg1, arg3, var5, true, var8.field8835))) {
                    return true;
                }
            }
            if (~this.field4566 != 0) {
                class639 var10 = class21.field381.method1583(113, this.field4566);
                class474 var11 = var10.method3586((class56) null, arg2, (class470) null, 0, 255, -1, this.field4576, 131072, 0);
                if (var11 != null && (class232.field3053 ? var11.method275(arg1, arg3, var5, true, var10.field8835, class286.field3600) : var11.method258(arg1, arg3, var5, true, var10.field8835))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(ILha;)Lwg;")
    public final class428 method750(int arg0, class60 arg1) {
        ++field4565;
        if (arg0 >= -22) {
            this.method752((byte) -17, 80, (class60) null, -96);
        }
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)I")
    public final int method84(int arg0) {
        if (arg0 != 1027) {
            return -59;
        } else {
            ++field4585;
            return this.field4573;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)I")
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            this.method84(-45);
        }
        ++field4562;
        return -10;
    }

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "(I)V")
    public static final void method2070(int arg0) {
        ++field4579;
        if (class391.field4978 != 0 && class391.field4978 != 5) {
            try {
                short var1;
                if (~class69.field973 == -1) {
                    var1 = 250;
                } else {
                    var1 = 2000;
                }
                if (~var1 > ~(++class109.field1574)) {
                    if (class12.field143 != null) {
                        class12.field143.method2307(-1884375310);
                        class12.field143 = null;
                    }
                    if (~class69.field973 <= -4) {
                        class391.field4978 = 0;
                        class526.method3044(arg0 + -18103, -5);
                        return;
                    }
                    if (~class468.field6275 != -3) {
                        class345.field4358.method990(0);
                    } else {
                        class292.field3842.method990(0);
                    }
                    class109.field1574 = 0;
                    class391.field4978 = 1;
                    ++class69.field973;
                }
                if (arg0 != 18102) {
                    field4574 = 92;
                }
                if (class391.field4978 == 1) {
                    if (class468.field6275 == 2) {
                        class217.field2933 = class292.field3842.method992(31687, class162.field2227);
                    } else {
                        class217.field2933 = class345.field4358.method992(arg0 + 13585, class162.field2227);
                    }
                    class391.field4978 = 2;
                }
                if (~class391.field4978 == -3) {
                    if (~class217.field2933.field2538 == -3) {
                        throw new IOException();
                    }
                    if (class217.field2933.field2538 != 1) {
                        return;
                    }
                    class12.field143 = class594.method3367((Socket) class217.field2933.field2540, (byte) -51, 7500);
                    class217.field2933 = null;
                    class522.method3031(1603);
                    class589 var2 = class293.method1762(-6331);
                    var2.field8251.method2578(class262.field3298.field7471, -1221492240);
                    class737.method4107(var2, arg0 + -18095);
                    class402.method2242((byte) 18);
                    class391.field4978 = 3;
                }
                if (class391.field4978 == 3) {
                    if (!class12.field143.method2304(1, 86)) {
                        return;
                    }
                    class12.field143.method2305(arg0 ^ 21815, 1, class609.field8448.field6180, 0);
                    int var3 = 255 & class609.field8448.field6180[0];
                    if (~var3 != -1) {
                        class391.field4978 = 0;
                        class526.method3044(-1, var3);
                        class12.field143.method2307(arg0 ^ -1884360636);
                        class12.field143 = null;
                        class292.method1751((byte) -120);
                        return;
                    }
                    class609.field8448.field6193 = 0;
                    class461 var4 = new class461(518);
                    int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()) };
                    var4.method2578(10, -1221492240);
                    var4.method2568(var5[0], -535701016);
                    var4.method2568(var5[1], -535701016);
                    var4.method2568(var5[2], -535701016);
                    var4.method2568(var5[3], -535701016);
                    var4.method2586(arg0 + -43519, 0L);
                    var4.method2597(class721.field10041, (byte) 83);
                    var4.method2586(-25417, class1.field5);
                    var4.method2586(-25417, class244.field3162);
                    var4.method2599(-1, class501.field7097, class144.field2030);
                    class522.method3031(1603);
                    class589 var6 = class293.method1762(-6331);
                    class180 var7 = var6.field8251;
                    if (~class468.field6275 == -3) {
                        if (class27.field484 == 13) {
                            var7.method2578(class262.field3302.field7471, -1221492240);
                        } else {
                            var7.method2578(class262.field3300.field7471, arg0 ^ -1221474490);
                        }
                        var7.method2620(0, false);
                        int var8 = var7.field6193;
                        var7.method2568(638, arg0 + -535719118);
                        var7.method2614(3, 0, var4.field6180, var4.field6193);
                        int var9 = var7.field6193;
                        var7.method2597(class310.field4085, (byte) 63);
                        var7.method2578(class622.field8563, -1221492240);
                        var7.method2578(class120.method926(arg0 + -2610), -1221492240);
                        var7.method2620(field4586, false);
                        var7.method2620(class466.field6263, false);
                        var7.method2578(class748.field10451.field10409.method3020((byte) -44), arg0 ^ -1221474490);
                        class380.method2168(var7, (byte) -128);
                        var7.method2597(class722.field10043, (byte) 115);
                        var7.method2568(class313.field4096, -535701016);
                        class461 var10 = class748.field10451.method4144(arg0 ^ 18094);
                        var7.method2578(var10.field6193, arg0 ^ -1221474490);
                        var7.method2614(arg0 ^ 18101, 0, var10.field6180, var10.field6193);
                        class332.field4236 = true;
                        class461 var11 = new class461(class323.field4162.method132((byte) -119));
                        class323.field4162.method131(var11, (byte) 114);
                        var7.method2614(3, 0, var11.field6180, var11.field6180.length);
                        var7.method2620(class332.field4238, false);
                        var7.method2586(-25417, class721.field10032);
                        var7.method2578(class618.field8529 != null ? 1 : 0, -1221492240);
                        if (class618.field8529 != null) {
                            var7.method2597(class618.field8529, (byte) 125);
                        }
                        var7.method2578(class566.method3255((byte) -47, "jagtheora") ? 1 : 0, arg0 + -1221510342);
                        class694.method3886((byte) 26, var7);
                        var7.method2615(var5, var9, var7.field6193, -32768);
                        var7.method2602(-var8 + var7.field6193, (byte) 121);
                    } else {
                        var7.method2578(class262.field3303.field7471, -1221492240);
                        var7.method2620(0, false);
                        int var12 = var7.field6193;
                        var7.method2568(638, -535701016);
                        var7.method2614(3, 0, var4.field6180, var4.field6193);
                        int var13 = var7.field6193;
                        var7.method2597(class310.field4085, (byte) 90);
                        var7.method2578(class293.field3867.field1416, -1221492240);
                        var7.method2578(class243.field3143, -1221492240);
                        class380.method2168(var7, (byte) -119);
                        var7.method2597(class722.field10043, (byte) 101);
                        var7.method2568(class313.field4096, arg0 + -535719118);
                        class694.method3886((byte) 26, var7);
                        var7.method2615(var5, var13, var7.field6193, -32768);
                        var7.method2602(-var12 + var7.field6193, (byte) 71);
                    }
                    class737.method4107(var6, 7);
                    class402.method2242((byte) 18);
                    class760.field10605 = new class71(var5);
                    for (int var14 = 0; var14 < 4; ++var14) {
                        var5[var14] += 50;
                    }
                    class609.field8448.method1236(var5, 105);
                    class391.field4978 = 4;
                }
                if (class391.field4978 == 4) {
                    if (!class12.field143.method2304(1, -128)) {
                        return;
                    }
                    class12.field143.method2305(arg0 + -13109, 1, class609.field8448.field6180, 0);
                    int var15 = 255 & class609.field8448.field6180[0];
                    if (~var15 == -22) {
                        class391.field4978 = 7;
                    } else if (var15 != 29) {
                        if (~var15 == -2) {
                            class391.field4978 = 5;
                            class526.method3044(-1, var15);
                            return;
                        }
                        if (var15 != 2) {
                            if (~var15 != -16) {
                                if (var15 == 23 && class69.field973 < 3) {
                                    ++class69.field973;
                                    class391.field4978 = 1;
                                    class109.field1574 = 0;
                                    class12.field143.method2307(arg0 + -1884393412);
                                    class12.field143 = null;
                                    return;
                                }
                                class391.field4978 = 0;
                                class526.method3044(-1, var15);
                                class12.field143.method2307(-1884375310);
                                class12.field143 = null;
                                class292.method1751((byte) -92);
                                return;
                            }
                            class440.field5868 = -2;
                            class391.field4978 = 14;
                        } else {
                            class391.field4978 = 8;
                        }
                    } else {
                        class391.field4978 = 13;
                    }
                }
                if (~class391.field4978 == -7) {
                    class522.method3031(1603);
                    class589 var16 = class293.method1762(-6331);
                    class180 var17 = var16.field8251;
                    var17.method1231(class760.field10605, 8);
                    var17.method1233(class262.field3307.field7471, 17695);
                    class737.method4107(var16, 7);
                    class402.method2242((byte) 18);
                    class391.field4978 = 4;
                } else if (class391.field4978 == 7) {
                    if (class12.field143.method2304(1, arg0 ^ -18123)) {
                        class12.field143.method2305(4993, 1, class609.field8448.field6180, 0);
                        int var18 = 255 & class609.field8448.field6180[0];
                        class81.field1110 = var18 * 60 - -180;
                        class391.field4978 = 0;
                        class526.method3044(-1, 21);
                        class12.field143.method2307(-1884375310);
                        class12.field143 = null;
                        class292.method1751((byte) -108);
                    }
                } else if (class391.field4978 == 13) {
                    if (class12.field143.method2304(1, -115)) {
                        class12.field143.method2305(4993, 1, class609.field8448.field6180, 0);
                        class3.field27 = class609.field8448.field6180[0] & 255;
                        class391.field4978 = 0;
                        class526.method3044(-1, 29);
                        class12.field143.method2307(-1884375310);
                        class12.field143 = null;
                        class292.method1751((byte) -88);
                    }
                } else if (~class391.field4978 == -9) {
                    if (class12.field143.method2304(1, 70)) {
                        class12.field143.method2305(arg0 + -13109, 1, class609.field8448.field6180, 0);
                        class607.field8429 = class609.field8448.field6180[0] & 255;
                        class391.field4978 = 9;
                    }
                } else {
                    if (~class391.field4978 == -10) {
                        class180 var19 = class609.field8448;
                        if (~class468.field6275 == -3) {
                            if (!class12.field143.method2304(class607.field8429, 123)) {
                                return;
                            }
                            class12.field143.method2305(arg0 ^ 21815, class607.field8429, var19.field6180, 0);
                            var19.field6193 = 0;
                            class683.field9525 = var19.method2600((byte) -128);
                            class649.field9012 = var19.method2600((byte) -123);
                            class81.field1113 = ~var19.method2600((byte) -123) == -2;
                            class172.field2381 = ~var19.method2600((byte) -123) == -2;
                            class437.field5819 = ~var19.method2600((byte) -128) == -2;
                            class165.field2314 = var19.method2600((byte) -124) == 1;
                            class54.field755 = var19.method2566(arg0 ^ -18104);
                            class254.field3244 = ~var19.method2600((byte) -124) == -2;
                            class321.field4149 = var19.method2582(-1);
                            class258.field3268 = ~var19.method2600((byte) -123) == -2;
                            client.field3995.method3382(false, class258.field3268);
                            class21.field381.method1584(class258.field3268, (byte) 103);
                            class300.field3941.method3862(class258.field3268, (byte) 74);
                        } else {
                            if (!class12.field143.method2304(class607.field8429, arg0 ^ -18129)) {
                                return;
                            }
                            class12.field143.method2305(4993, class607.field8429, var19.field6180, 0);
                            var19.field6193 = 0;
                            class683.field9525 = var19.method2600((byte) -128);
                            class649.field9012 = var19.method2600((byte) -125);
                            class81.field1113 = ~var19.method2600((byte) -124) == -2;
                            class172.field2381 = ~var19.method2600((byte) -125) == -2;
                            class437.field5819 = ~var19.method2600((byte) -124) == -2;
                            class410.field5227 = var19.method2577(2);
                            class254.field3244 = ~class410.field5227 < -1;
                            class658.field9160 = var19.method2566(-2);
                            class571.field8043 = var19.method2566(-2);
                            class8.field101 = var19.method2566(-2);
                            class506.field7129 = var19.method2622(arg0 + -539582910);
                            class310.field4084 = class162.field2227.method2640(class506.field7129, (byte) -115);
                            class366.field4711 = var19.method2600((byte) -127);
                            class717.field9984 = var19.method2566(arg0 ^ -18104);
                            class39.field597 = var19.method2566(arg0 + -18104);
                            class273.field3426 = ~var19.method2600((byte) -126) == -2;
                            class380.field4847.field10062 = class380.field4847.field10064 = class126.field1806 = var19.method2625(-103);
                            class499.field7038 = var19.method2600((byte) -124);
                            class480.field6532 = var19.method2622(-539564808);
                            class366.field4724 = new class134();
                            class366.field4724.field1929 = var19.method2566(-2);
                            if (~class366.field4724.field1929 == -65536) {
                                class366.field4724.field1929 = -1;
                            }
                            class366.field4724.field1938 = var19.method2625(arg0 ^ -18136);
                            if (class7.field75 != class225.field2991) {
                                class366.field4724.field1933 = class366.field4724.field1929 + 40000;
                                class366.field4724.field1927 = class366.field4724.field1929 + 50000;
                            }
                            if (class225.field2991 != class16.field325 && (class292.field3842.method991(-1, class90.field1247) || class292.field3842.method991(-1, class476.field6434))) {
                                class353.method2062(arg0 + -18016);
                            }
                        }
                        if ((!class81.field1113 || class437.field5819) && !class254.field3244) {
                            try {
                                class568.method3263("unzap", class64.field900, false);
                            } catch (Throwable var24) {
                            }
                        } else {
                            try {
                                class568.method3263("zap", class64.field900, false);
                            } catch (Throwable var26) {
                                if (class382.field4855) {
                                    try {
                                        class64.field900.getAppletContext().showDocument(new URL(class64.field900.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var25) {
                                    }
                                }
                            }
                        }
                        if (class7.field75 == class225.field2991) {
                            try {
                                class568.method3263("loggedin", class64.field900, false);
                            } catch (Throwable var23) {
                            }
                        }
                        if (class468.field6275 != 2) {
                            class391.field4978 = 0;
                            class526.method3044(arg0 ^ -18103, 2);
                            class331.method1917(2);
                            class571.method3275(27461, 7);
                            class546.field7608 = null;
                            return;
                        }
                        class391.field4978 = 11;
                    }
                    if (class391.field4978 == 11) {
                        if (!class12.field143.method2304(3, 43)) {
                            return;
                        }
                        class12.field143.method2305(4993, 3, class609.field8448.field6180, 0);
                        class391.field4978 = 12;
                    }
                    if (class391.field4978 == 12) {
                        class180 var20 = class609.field8448;
                        var20.field6193 = 0;
                        if (var20.method1230(4156)) {
                            if (!class12.field143.method2304(1, -112)) {
                                return;
                            }
                            class12.field143.method2305(4993, 1, var20.field6180, 3);
                        }
                        class546.field7608 = client.method1815(46)[var20.method1238((byte) -14)];
                        class440.field5868 = var20.method2566(-2);
                        class391.field4978 = 10;
                    }
                    if (class391.field4978 == 10) {
                        if (class12.field143.method2304(class440.field5868, 82)) {
                            class12.field143.method2305(4993, class440.field5868, class609.field8448.field6180, 0);
                            class609.field8448.field6193 = 0;
                            int var21 = class440.field5868;
                            class391.field4978 = 0;
                            class526.method3044(arg0 ^ -18103, 2);
                            class650.method3644(0);
                            class547.method3165(class609.field8448, -653401060);
                            class21.field384 = -1;
                            if (class618.field8528 != class546.field7608) {
                                class272.method1608(-614084380);
                            } else {
                                class367.method2118(-81);
                            }
                            if (~class609.field8448.field6193 != ~var21) {
                                throw new RuntimeException("lswp pos:" + class609.field8448.field6193 + " psize:" + var21);
                            } else {
                                class546.field7608 = null;
                            }
                        }
                    } else if (class391.field4978 == 14) {
                        if (class440.field5868 == -2) {
                            if (!class12.field143.method2304(2, arg0 + -18205)) {
                                return;
                            }
                            class12.field143.method2305(4993, 2, class609.field8448.field6180, 0);
                            class609.field8448.field6193 = 0;
                            class440.field5868 = class609.field8448.method2566(-2);
                        }
                        if (class12.field143.method2304(class440.field5868, 27)) {
                            class12.field143.method2305(4993, class440.field5868, class609.field8448.field6180, 0);
                            class609.field8448.field6193 = 0;
                            class391.field4978 = 0;
                            int var22 = class440.field5868;
                            class526.method3044(arg0 ^ -18103, 15);
                            class424.method2431(true);
                            class547.method3165(class609.field8448, -653401060);
                            if (~class609.field8448.field6193 != ~var22) {
                                throw new RuntimeException("lswpr pos:" + class609.field8448.field6193 + " psize:" + var22);
                            } else {
                                class546.field7608 = null;
                            }
                        }
                    }
                }
            } catch (IOException var27) {
                if (class12.field143 != null) {
                    class12.field143.method2307(-1884375310);
                    class12.field143 = null;
                }
                if (~class69.field973 > -4) {
                    if (~class468.field6275 != -3) {
                        class345.field4358.method990(0);
                    } else {
                        class292.field3842.method990(0);
                    }
                    class391.field4978 = 1;
                    class109.field1574 = 0;
                    ++class69.field973;
                } else {
                    class391.field4978 = 0;
                    class526.method3044(-1, -4);
                    class292.method1751((byte) -44);
                }
            }
        }
    }
}

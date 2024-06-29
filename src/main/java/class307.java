import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class307 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field4768 = 128;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[I")
    public static int[] field4774 = new int[500];

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[Lv;")
    public static class75[] field4764 = new class75[14];

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "[I")
    public static int[] field4778 = new int[1000];

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[[[B")
    public static byte[][][] field4773;

    @OriginalMember(owner = "client!dk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4772++;
        if (class141.field2180 != null) {
            class279.field4303 = -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 19)
    public final void focusGained(FocusEvent arg0) {
        field4767++;
    }

    @OriginalMember(owner = "client!dk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 28)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class141.field2180 != null) {
            class137.field2166 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class137.field2164.length > var2) {
                var3 = class137.field2164[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class279.field4303 >= 0 && var3 >= 0) {
                class194.field2895[class279.field4303] = var3;
                class279.field4303 = class279.field4303 + 1 & 0x7F;
                if (class96.field1537 == class279.field4303) {
                    class279.field4303 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class195.field2919 + 1 & 0x7F;
                if (class19.field258 != var4) {
                    class226.field3591[class195.field2919] = var3;
                    class184.field2769[class195.field2919] = '\u0000';
                    class195.field2919 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4765++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 89)
    public static void method2096(byte arg0) {
        if (arg0 != 91) {
            method2097(7, false);
        }
        field4773 = (byte[][][]) null;
        field4778 = null;
        field4774 = null;
        field4764 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V", line = 106)
    public static final void method2097(int arg0, boolean arg1) {
        field4766++;
        class338 var2 = class195.method1391(12, (byte) -92, arg0);
        var2.method2347(true);
        if (arg1) {
            field4764 = (class75[]) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 124)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4777++;
        if (class141.field2180 != null) {
            class137.field2166 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class137.field2164.length > var2) {
                var3 = class137.field2164[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class279.field4303 >= 0 && var3 >= 0) {
                class194.field2895[class279.field4303] = ~var3;
                class279.field4303 = class279.field4303 + 1 & 0x7F;
                if (class96.field1537 == class279.field4303) {
                    class279.field4303 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 157)
    public static final void method2098(int arg0) {
        field4776++;
        if (class285.field4466 > 0) {
            class285.field4466--;
        }
        if (class278.field4290 > 1) {
            class259.field4062 = class291.field4524;
            class278.field4290--;
        }
        if (class158.field2379) {
            class158.field2379 = false;
            class233.method1640((byte) -100);
            return;
        }
        for (int var1 = 0; var1 < 100 && class268.method1852(24959); var1++) {
        }
        if (class131.field2052 != 30) {
            return;
        }
        class141.method1010(-17157, class106.field1642, 149);
        Object var2 = class20.field276.field271;
        synchronized (class20.field276.field271) {
            if (!class315.field4922) {
                class20.field276.field279 = 0;
            } else if (class171.field2604 != 0 || class20.field276.field279 >= 40) {
                class162.field2438++;
                int var3 = 0;
                class106.field1642.method753(-81, 137);
                class106.field1642.method1132((byte) 29, 0);
                int var4 = class106.field1642.field2532;
                for (int var5 = 0; var5 < class20.field276.field279 && (class106.field1642.field2532 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class20.field276.field280[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class20.field276.field278[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class20.field276.field280[var5] == -1 && class20.field276.field278[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class20.field274 != var7 || class213.field3251 != var6) {
                        int var9 = var7 - class20.field274;
                        int var10 = var6 - class213.field3251;
                        class213.field3251 = var6;
                        class20.field274 = var7;
                        if (class304.field4752 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class106.field1642.method1150((var9 << 6) + ((class304.field4752 << 12) + var10), arg0 ^ 0x25773A31);
                            class304.field4752 = 0;
                        } else if (class304.field4752 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class106.field1642.method1132((byte) 29, class304.field4752 + 128);
                            var9 += 128;
                            var10 += 128;
                            class106.field1642.method1150((var9 << 8) + var10, arg0 + -628554289);
                            class304.field4752 = 0;
                        } else if (class304.field4752 >= 32) {
                            class106.field1642.method1150(class304.field4752 + 57344, arg0 ^ 0x25773A31);
                            if (var8) {
                                class106.field1642.method1174((byte) -32, Integer.MIN_VALUE);
                            } else {
                                class106.field1642.method1174((byte) -32, var7 | var6 << 16);
                            }
                            class304.field4752 = 0;
                        } else {
                            class106.field1642.method1132((byte) 29, class304.field4752 + 192);
                            if (var8) {
                                class106.field1642.method1174((byte) -32, Integer.MIN_VALUE);
                            } else {
                                class106.field1642.method1174((byte) -32, var7 | var6 << 16);
                            }
                            class304.field4752 = 0;
                        }
                    } else if (class304.field4752 < 2047) {
                        class304.field4752++;
                    }
                }
                class106.field1642.method1141((byte) 113, class106.field1642.field2532 - var4);
                if (var3 < class20.field276.field279) {
                    class20.field276.field279 -= var3;
                    for (int var11 = 0; var11 < class20.field276.field279; var11++) {
                        class20.field276.field278[var11] = class20.field276.field278[var11 + var3];
                        class20.field276.field280[var11] = class20.field276.field280[var3 + var11];
                    }
                } else {
                    class20.field276.field279 = 0;
                }
            }
        }
        if (class171.field2604 != 0) {
            class309.field4798++;
            long var13 = (class194.field2901 - class295.field4560) / 50L;
            class295.field4560 = class194.field2901;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class205.field3084;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class47.field776;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            byte var18 = 0;
            if (class171.field2604 == 2) {
                var18 = 1;
            }
            class106.field1642.method753(123, 5);
            class106.field1642.method1149(var18 << 15 | var17, (byte) 106);
            class106.field1642.method1174((byte) -32, var15 | var16 << 16);
        }
        if (class108.field1699 > 0) {
            class108.field1699--;
        }
        if (class232.field3672 && class108.field1699 <= 0) {
            class232.field3672 = false;
            class320.field4989++;
            class108.field1699 = 20;
            class106.field1642.method753(-80, 122);
            class106.field1642.method1149((int) class259.field4063, (byte) 119);
            class106.field1642.method1149((int) class30.field443, (byte) -118);
        }
        if (class163.field2458 && !class199.field2976) {
            class32.field457++;
            class199.field2976 = true;
            class106.field1642.method753(15, 27);
            class106.field1642.method1132((byte) 29, 1);
        }
        if (!class163.field2458 && class199.field2976) {
            class32.field457++;
            class199.field2976 = false;
            class106.field1642.method753(-47, 27);
            class106.field1642.method1132((byte) 29, 0);
        }
        if (!class107.field1663) {
            class117.field1788++;
            class106.field1642.method753(-38, 187);
            class106.field1642.method1155(1949939600, class111.method825((byte) 122));
            class107.field1663 = true;
        }
        if (class298.field4599) {
            class298.field4599 = false;
        } else {
            class193.field2888 /= 2.0F;
        }
        if (class26.field399) {
            class26.field399 = false;
        } else {
            class121.field1846 /= 2.0F;
        }
        class33.method273(-103);
        if (class131.field2052 != 30) {
            return;
        }
        class106.method772(-28727);
        class161.method1097(28263);
        class207.method1473((byte) 18);
        class154.field2313++;
        if (class154.field2313 > 750) {
            class233.method1640((byte) -128);
            return;
        }
        class233.method1642(-106);
        class199.method1415(10106);
        class152.method1052(-1);
        if (class110.field1712 != null) {
            class301.method2054((byte) -39);
        }
        for (int var19 = class186.method1332(-11604, true); var19 != -1; var19 = class186.method1332(arg0 ^ 0xC55, false)) {
            class137.method992(true, var19);
            class39.field601[class270.method1860(31, class139.field2169++)] = var19;
        }
        for (class338 var20 = class5.method28(false); var20 != null; var20 = class5.method28(false)) {
            int var21 = var20.method2345(false);
            int var22 = var20.method2348(-45);
            if (var21 == 1) {
                class273.field4233[var22] = var20.field5279;
                class78.field1252[class270.method1860(31, class263.field4089++)] = var22;
            } else if (var21 == 2) {
                class47.field777[var22] = var20.field5293;
                class268.field4182[class270.method1860(class53.field890++, 31)] = var22;
            } else if (var21 == 3) {
                class220 var43 = class68.method524((byte) -81, var22);
                if (!var20.field5293.equals(var43.field3376)) {
                    var43.field3376 = var20.field5293;
                    class26.method241(3095, var43);
                }
            } else if (var21 == 4) {
                class220 var23 = class68.method524((byte) -83, var22);
                int var24 = var20.field5288;
                int var25 = var20.field5279;
                int var26 = var20.field5290;
                if (var23.field3372 != var25 || var23.field3466 != var24 || var23.field3397 != var26) {
                    var23.field3372 = var25;
                    var23.field3397 = var26;
                    var23.field3466 = var24;
                    class26.method241(3095, var23);
                }
            } else if (var21 == 5) {
                class220 var42 = class68.method524((byte) -94, var22);
                if (var20.field5279 != var42.field3406 || var20.field5279 == -1) {
                    var42.field3349 = 1;
                    var42.field3406 = var20.field5279;
                    var42.field3500 = 0;
                    var42.field3469 = 0;
                    class26.method241(3095, var42);
                }
            } else if (var21 == 6) {
                int var27 = var20.field5279;
                int var28 = (var27 & 0x3F8) >> 5;
                int var29 = (var27 & 0x7EBF) >> 10;
                int var30 = var27 & 0x1F;
                class220 var31 = class68.method524((byte) -82, var22);
                int var32 = (var30 << 3) + (var28 << 11) + (var29 << 19);
                if (var31.field3487 != var32) {
                    var31.field3487 = var32;
                    class26.method241(3095, var31);
                }
            } else if (var21 == 7) {
                class220 var40 = class68.method524((byte) -127, var22);
                boolean var41 = var20.field5279 == 1;
                if (var40.field3496 != var41) {
                    var40.field3496 = var41;
                    class26.method241(3095, var40);
                }
            } else if (var21 == 8) {
                class220 var39 = class68.method524((byte) -107, var22);
                if (var20.field5279 != var39.field3350 || var20.field5288 != var39.field3505 || var20.field5290 != var39.field3516) {
                    var39.field3505 = var20.field5288;
                    var39.field3350 = var20.field5279;
                    var39.field3516 = var20.field5290;
                    if (var39.field3378 != -1) {
                        if (var39.field3439 > 0) {
                            var39.field3516 = var39.field3516 * 32 / var39.field3439;
                        } else if (var39.field3405 > 0) {
                            var39.field3516 = var39.field3516 * 32 / var39.field3405;
                        }
                    }
                    class26.method241(3095, var39);
                }
            } else if (var21 == 9) {
                class220 var38 = class68.method524((byte) -98, var22);
                if (var20.field5279 != var38.field3378 || var20.field5288 != var38.field3452) {
                    var38.field3452 = var20.field5288;
                    var38.field3378 = var20.field5279;
                    class26.method241(3095, var38);
                }
            } else if (var21 == 10) {
                class220 var37 = class68.method524((byte) -104, var22);
                if (var20.field5279 != var37.field3453 || var20.field5288 != var37.field3446 || var20.field5290 != var37.field3513) {
                    var37.field3446 = var20.field5288;
                    var37.field3453 = var20.field5279;
                    var37.field3513 = var20.field5290;
                    class26.method241(3095, var37);
                }
            } else if (var21 == 11) {
                class220 var36 = class68.method524((byte) -119, var22);
                var36.field3361 = var36.field3435 = var20.field5279;
                var36.field3424 = 0;
                var36.field3464 = var36.field3444 = var20.field5288;
                var36.field3527 = 0;
                class26.method241(3095, var36);
            } else if (var21 == 12) {
                class220 var34 = class68.method524((byte) -99, var22);
                int var35 = var20.field5279;
                if (var34 != null && var34.field3468 == 0) {
                    if (var35 > (var34.field3465 - var34.field3458)) {
                        var35 = var34.field3465 - var34.field3458;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var34.field3426 != var35) {
                        var34.field3426 = var35;
                        class26.method241(arg0 + 11550, var34);
                    }
                }
            } else if (var21 == 13) {
                class220 var33 = class68.method524((byte) -92, var22);
                var33.field3491 = var20.field5279;
            }
        }
        if (class222.field3535 != 0) {
            class313.field4865 += 20;
            if (class313.field4865 >= 400) {
                class222.field3535 = 0;
            }
        }
        class34.field518++;
        if (arg0 != -8455) {
            field4778 = (int[]) null;
        }
        if (class132.field2083 != null) {
            class68.field1130++;
            if (class68.field1130 >= 15) {
                class26.method241(3095, class132.field2083);
                class132.field2083 = null;
            }
        }
        if (client.field718 != null) {
            class26.method241(3095, client.field718);
            if ((class150.field2273 + 5) < class119.field1815 || (class150.field2273 - 5) > class119.field1815 || (class134.field2142 + 5) < class253.field3984 || class134.field2142 - 5 > class253.field3984) {
                class224.field3551 = true;
            }
            class81.field1273++;
            if (class256.field4016 == 0) {
                if (class224.field3551 && class81.field1273 >= 5) {
                    if (client.field718 == class202.field3037 && class274.field4246 != class229.field3638) {
                        class222.field3536++;
                        class220 var44 = client.field718;
                        byte var45 = 0;
                        if (class48.field789 == 1 && var44.field3427 == 206) {
                            var45 = 1;
                        }
                        if (var44.field3428[class229.field3638] <= 0) {
                            var45 = 0;
                        }
                        if (client.method393(var44).method1082((byte) 124)) {
                            int var46 = class274.field4246;
                            int var47 = class229.field3638;
                            var44.field3428[var47] = var44.field3428[var46];
                            var44.field3409[var47] = var44.field3409[var46];
                            var44.field3428[var46] = -1;
                            var44.field3409[var46] = 0;
                        } else if (var45 == 1) {
                            int var48 = class274.field4246;
                            int var49 = class229.field3638;
                            while (var48 != var49) {
                                if (var49 < var48) {
                                    var44.method1552(-65536, var48 - 1, var48);
                                    var48--;
                                } else if (var48 < var49) {
                                    var44.method1552(arg0 ^ 0xDEF9, var48 + 1, var48);
                                    var48++;
                                }
                            }
                        } else {
                            var44.method1552(-65536, class229.field3638, class274.field4246);
                        }
                        class106.field1642.method753(122, 191);
                        class106.field1642.method1130(-120, class274.field4246);
                        class106.field1642.method1177(-18147, var45);
                        class106.field1642.method1130(-117, class229.field3638);
                        class106.field1642.method1182((byte) 28, client.field718.field3404);
                    }
                } else if ((class251.field3969 == 1 || class17.method139(class301.field4706 - 1, 19193)) && class301.field4706 > 2) {
                    class208.method1482(true);
                } else if (class301.field4706 > 0) {
                    class30.method256(116);
                }
                class171.field2604 = 0;
                client.field718 = null;
                class68.field1130 = 10;
            }
        }
        class312.field4844 = 0;
        class191.field2865 = null;
        class188.field2817 = false;
        class136.field2153 = false;
        class220 var50 = class12.field194;
        class12.field194 = null;
        class220 var51 = class162.field2441;
        class162.field2441 = null;
        while (class297.method2014(arg0 ^ 0x7512) && class312.field4844 < 128) {
            class242.field3872[class312.field4844] = class323.field5038;
            class292.field4542[class312.field4844] = class181.field2730;
            class312.field4844++;
        }
        class110.field1712 = null;
        if (class331.field5160 != -1) {
            class90.method651(class331.field5160, 0, -88, class188.field2816, 0, 0, class322.field5024, 0);
        }
        class291.field4524++;
        while (true) {
            class240 var52;
            class220 var53;
            class220 var54;
            do {
                var52 = (class240) class23.field376.method633(arg0 ^ 0x2106);
                if (var52 == null) {
                    while (true) {
                        class240 var55;
                        class220 var56;
                        class220 var57;
                        do {
                            var55 = (class240) class206.field3128.method633(-1);
                            if (var55 == null) {
                                while (true) {
                                    class240 var58;
                                    class220 var59;
                                    class220 var60;
                                    do {
                                        var58 = (class240) class26.field403.method633(-1);
                                        if (var58 == null) {
                                            if (class110.field1712 == null) {
                                                class146.field2238 = 0;
                                            }
                                            if (class222.field3537 != null) {
                                                class342.method2366(-3);
                                            }
                                            if (class52.field853 > 0 && class53.field902[82] && class53.field902[81] && class59.field946 != 0) {
                                                int var61 = class205.field3101 - class59.field946;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class110.method822(class98.field1566.field1910[0] + class213.field3249, var61, class98.field1566.field1938[0] + class342.field5328, false);
                                            }
                                            if (class52.field853 > 0 && class53.field902[82] && class53.field902[81]) {
                                                if (class143.field2222 != -1) {
                                                    class110.method822(class213.field3249 + class143.field2222, class205.field3101, class342.field5328 + class29.field428, false);
                                                }
                                                class251.field3964 = 0;
                                                class81.field1274 = 0;
                                            } else if (class81.field1274 == 2) {
                                                if (class143.field2222 != -1) {
                                                    class106.field1642.method753(-1, 47);
                                                    class106.field1642.method1149(class342.field5328 + class29.field428, (byte) -112);
                                                    class106.field1642.method1161(class52.field868, 128);
                                                    class29.field423++;
                                                    class106.field1642.method1174((byte) -32, class224.field3573);
                                                    class106.field1642.method1149(class213.field3249 + class143.field2222, (byte) -53);
                                                    class233.field3691 = class205.field3084;
                                                    class317.field4950 = class47.field776;
                                                    class313.field4865 = 0;
                                                    class222.field3535 = 1;
                                                }
                                                class81.field1274 = 0;
                                            } else if (class251.field3964 == 2) {
                                                if (class143.field2222 != -1) {
                                                    class106.field1642.method753(arg0 + 8400, 133);
                                                    class91.field1444++;
                                                    class106.field1642.method1130(-118, class213.field3249 + class143.field2222);
                                                    class106.field1642.method1149(class342.field5328 + class29.field428, (byte) 93);
                                                    class313.field4865 = 0;
                                                    class233.field3691 = class205.field3084;
                                                    class222.field3535 = 1;
                                                    class317.field4950 = class47.field776;
                                                }
                                                class251.field3964 = 0;
                                            } else if (class143.field2222 != -1 && class81.field1274 == 0 && class251.field3964 == 0) {
                                                class34.method282(82, (class143.field2222 << 1) + 1 - class98.field1566.method280(false) >> 1, 0, (class29.field428 << 1) + 1 - class98.field1566.method280(false) >> 1);
                                                class222.field3535 = 1;
                                                class313.field4865 = 0;
                                                class317.field4950 = class47.field776;
                                                class233.field3691 = class205.field3084;
                                            }
                                            class143.field2222 = -1;
                                            class1.method5(9092);
                                            if (class162.field2441 != var51) {
                                                if (var51 != null) {
                                                    class26.method241(3095, var51);
                                                }
                                                if (class162.field2441 != null) {
                                                    class26.method241(3095, class162.field2441);
                                                }
                                            }
                                            if (class12.field194 != var50 && class202.field3032 == class165.field2473) {
                                                if (var50 != null) {
                                                    class26.method241(3095, var50);
                                                }
                                                if (class12.field194 != null) {
                                                    class26.method241(3095, class12.field194);
                                                }
                                            }
                                            if (class12.field194 == null) {
                                                if (class202.field3032 > 0) {
                                                    class202.field3032--;
                                                }
                                            } else if (class165.field2473 > class202.field3032) {
                                                class202.field3032++;
                                                if (class202.field3032 == class165.field2473) {
                                                    class26.method241(3095, class12.field194);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class336.field5254[var62]++;
                                            }
                                            int var63 = class143.method1015(122);
                                            int var64 = class201.method1432((byte) -124);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class285.field4466 = 250;
                                                class299.method2040(14500, false);
                                                class16.field228++;
                                                class106.field1642.method753(-108, 166);
                                            }
                                            if (class139.field2171 != null && class139.field2171.field2956 == 1) {
                                                if (class139.field2171.field2959 != null) {
                                                    class231.method1629(class190.field2856, (byte) 127, class210.field3212);
                                                }
                                                class190.field2856 = null;
                                                class210.field3212 = false;
                                                class139.field2171 = null;
                                            }
                                            class178.field2688++;
                                            if (class178.field2688 > 500) {
                                                class178.field2688 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x4) == 4) {
                                                    class77.field1243 += class51.field834;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class83.field1290 += class309.field4802;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class297.field4577 += class37.field586;
                                                }
                                            }
                                            if (class297.field4577 < -50) {
                                                class37.field586 = 2;
                                            }
                                            class152.field2288++;
                                            if (class297.field4577 > 50) {
                                                class37.field586 = -2;
                                            }
                                            if (class77.field1243 < -40) {
                                                class51.field834 = 1;
                                            }
                                            class257.field4035++;
                                            if (class83.field1290 < -55) {
                                                class309.field4802 = 2;
                                            }
                                            if (class77.field1243 > 40) {
                                                class51.field834 = -1;
                                            }
                                            if (class83.field1290 > 55) {
                                                class309.field4802 = -2;
                                            }
                                            if (class257.field4035 > 500) {
                                                class257.field4035 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class254.field3995 += class289.field4508;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class345.field5354 += class344.field5339;
                                                }
                                            }
                                            if (class345.field5354 < -60) {
                                                class344.field5339 = 2;
                                            }
                                            if (class254.field3995 < -20) {
                                                class289.field4508 = 1;
                                            }
                                            if (class345.field5354 > 60) {
                                                class344.field5339 = -2;
                                            }
                                            if (class254.field3995 > 10) {
                                                class289.field4508 = -1;
                                            }
                                            if (class152.field2288 > 50) {
                                                class106.field1642.method753(-42, 245);
                                                class240.field3837++;
                                            }
                                            if (class134.field2141) {
                                                class107.method781((byte) -12);
                                                class134.field2141 = false;
                                            }
                                            try {
                                                if (class295.field4568 != null && class106.field1642.field2532 > 0) {
                                                    class295.field4568.method370(1, class106.field1642.field2500, 0, class106.field1642.field2532);
                                                    class152.field2288 = 0;
                                                    class106.field1642.field2532 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class233.method1640((byte) -78);
                                            }
                                            return;
                                        }
                                        var59 = var58.field3834;
                                        if (var59.field3383 < 0) {
                                            break;
                                        }
                                        var60 = class68.method524((byte) -103, var59.field3393);
                                    } while (var60 == null || var60.field3472 == null || var60.field3472.length <= var59.field3383 || var60.field3472[var59.field3383] != var59);
                                    class336.method2337(var58, (byte) -71);
                                }
                            }
                            var56 = var55.field3834;
                            if (var56.field3383 < 0) {
                                break;
                            }
                            var57 = class68.method524((byte) -99, var56.field3393);
                        } while (var57 == null || var57.field3472 == null || var57.field3472.length <= var56.field3383 || var57.field3472[var56.field3383] != var56);
                        class336.method2337(var55, (byte) -71);
                    }
                }
                var53 = var52.field3834;
                if (var53.field3383 < 0) {
                    break;
                }
                var54 = class68.method524((byte) -111, var53.field3393);
            } while (var54 == null || var54.field3472 == null || var54.field3472.length <= var53.field3383 || var54.field3472[var53.field3383] != var53);
            class336.method2337(var52, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V", line = 1155)
    public static final void method2099(int arg0, byte arg1) {
        class229.field3645[1] = (float) (class270.method1860(65414, arg0) >> 8) / 255.0F;
        class229.field3645[2] = (float) class270.method1860(255, arg0) / 255.0F;
        field4769++;
        class229.field3645[0] = (float) (class270.method1860(16714169, arg0) >> 16) / 255.0F;
        class128.method928(3, true);
        class128.method928(4, true);
        if (arg1 != 49) {
            field4778 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 1173)
    public final void keyTyped(KeyEvent arg0) {
        if (class141.field2180 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class116.method859(160, var2)) {
                int var3 = class195.field2919 + 1 & 0x7F;
                if (class19.field258 != var3) {
                    class226.field3591[class195.field2919] = -1;
                    class184.field2769[class195.field2919] = var2;
                    class195.field2919 = var3;
                }
            }
        }
        arg0.consume();
        field4775++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Lab;", line = 1210)
    public static final class280 method2100(byte arg0, int arg1) {
        field4771++;
        class280 var2 = (class280) class200.field3001.method2179(false, (long) arg1);
        if (arg0 != 0) {
            field4768 = 3;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class212.field3221.method980(29, arg1, arg0 ^ 0x5);
        class280 var4 = new class280();
        if (var3 != null) {
            var4.method1920(48, new class166(var3), arg1);
        }
        class200.field3001.method2173(var4, true, (long) arg1);
        return var4;
    }
}

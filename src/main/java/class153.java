import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class153 extends class2 {

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field2654 = 1;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Lqk;")
    public static class207 field2655 = class24.method212(255, ")3)3)3");

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field2663 = 10;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "D")
    public static double field2664 = -1.0D;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lpk;")
    public static class99 field2656;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
    public static final void method1097(int arg0, byte arg1) {
        field2666++;
        if (arg0 == -1 || !class98.method697(arg0, 4401)) {
            return;
        }
        class220[] var2 = class227.field4162[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class220 var4 = var2[var3];
            if (var4.field3883 != null) {
                class206 var5 = new class206();
                var5.field3614 = var4;
                var5.field3616 = var4.field3883;
                class10.method59(false, 2000000, var5);
            }
        }
        if (arg1 >= -12) {
            field2654 = -1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BJ)V")
    public static final void method1098(byte arg0, long arg1) {
        if (arg0 != 76) {
            method1101(93, (byte) -96);
        }
        field2658++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class174.method1249(false, arg1 - 1L);
            class174.method1249(false, 1L);
        } else {
            class174.method1249(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLv;)V")
    public static final void method1099(boolean arg0, class149 arg1) {
        field2659++;
        if (!arg0) {
            method1098((byte) -31, -18L);
        }
        while (true) {
            while (arg1.field2568.length > arg1.field2593) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1045((byte) -116) == 1) {
                    var2 = true;
                    var3 = arg1.method1045((byte) 92);
                    var4 = arg1.method1045((byte) 93);
                }
                int var5 = arg1.method1045((byte) 78);
                int var6 = arg1.method1045((byte) -24);
                int var7 = var5 * 64 - class198.field3473;
                int var8 = class111.field1932 + class70.field1253 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class197.field3463 && class70.field1253 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method1084((byte) 49);
                                if (var13 != 0) {
                                    if (class173.field3066[var10][var9] == null) {
                                        class173.field3066[var10][var9] = new byte[4096];
                                    }
                                    class173.field3066[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1084((byte) 49);
                                    if (class204.field3593[var10][var9] == null) {
                                        class204.field3593[var10][var9] = new byte[4096];
                                    }
                                    class204.field3593[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1084((byte) 49);
                        if (var16 != 0) {
                            arg1.field2593++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method1100(int arg0) {
        field2662++;
        int var1 = -48 / ((13 - arg0) / 48);
        if (class149.field2625 == 0 || class149.field2625 == 5) {
            return;
        }
        try {
            if ((++class198.field3472) > 2000) {
                if (class98.field1738 != null) {
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                }
                if (class123.field2131 >= 1) {
                    class149.field2625 = 0;
                    class92.field1640 = -5;
                    return;
                }
                class198.field3472 = 0;
                class149.field2625 = 1;
                if (class6.field93 == class223.field4076) {
                    class223.field4076 = class147.field2527;
                } else {
                    class223.field4076 = class6.field93;
                }
                class123.field2131++;
            }
            if (class149.field2625 == 1) {
                class270.field4775 = class20.field326.method1635(0, class223.field4076, class89.field1607);
                class149.field2625 = 2;
            }
            if (class149.field2625 == 2) {
                if (class270.field4775.field1696 == 2) {
                    throw new IOException();
                }
                if (class270.field4775.field1696 != 1) {
                    return;
                }
                class98.field1738 = new class127((Socket) class270.field4775.field1699, class20.field326);
                class270.field4775 = null;
                long var2 = class89.field1606 = class100.field1803.method1428(0);
                class261.field4645.field2593 = 0;
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class261.field4645.method1041(true, 14);
                class261.field4645.method1041(true, var4);
                class98.field1738.method894(0, class261.field4645.field2568, 2, -119);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(0);
                }
                int var5 = class98.field1738.method897(30000);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(0);
                }
                if (var5 != 0) {
                    class149.field2625 = 0;
                    class92.field1640 = var5;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                    return;
                }
                class149.field2625 = 3;
            }
            if (class149.field2625 == 3) {
                if (class98.field1738.method891(1) < 8) {
                    return;
                }
                int[] var6 = new int[4];
                class98.field1738.method889(class17.field262.field2568, (byte) -128, 8, 0);
                class17.field262.field2593 = 0;
                class8.field105 = class17.field262.method1043(false);
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[3] = (int) class8.field105;
                class261.field4645.field2593 = 0;
                var6[2] = (int) (class8.field105 >> 32);
                class261.field4645.method1041(true, 10);
                class261.field4645.method1068(var6[0], 107);
                class261.field4645.method1068(var6[1], 109);
                class261.field4645.method1068(var6[2], 119);
                class261.field4645.method1068(var6[3], 126);
                class261.field4645.method1048((byte) 75, class100.field1803.method1428(0));
                class261.field4645.method1040(true, class100.field1792);
                class261.field4645.method1071(class183.field3253, class80.field1462, 0);
                class45.field900.field2593 = 0;
                if (class250.field4524 == 40) {
                    class45.field900.method1041(true, 18);
                } else {
                    class45.field900.method1041(true, 16);
                }
                class45.field900.method1083(false, class261.field4645.field2593 + (class278.method1891((byte) -113, class121.field2093) + 159));
                class45.field900.method1068(529, 108);
                class45.field900.method1041(true, class8.field114);
                class45.field900.method1041(true, class213.field3774 ? 1 : 0);
                class45.field900.method1041(true, 0);
                class45.field900.method1041(true, class262.method1813(7));
                class45.field900.method1083(false, class31.field625);
                class45.field900.method1083(false, class244.field4428);
                class45.field900.method1041(true, class65.field1182);
                class85.method632(119, class45.field900);
                class45.field900.method1040(true, class121.field2093);
                class45.field900.method1068(class156.field2737, 108);
                class45.field900.method1068(class220.method1560((byte) 48), 111);
                class269.field4768 = true;
                class45.field900.method1083(false, class261.field4651);
                class45.field900.method1068(class131.field2266.method714((byte) -123), 120);
                class45.field900.method1068(class98.field1725.method714((byte) -85), 125);
                class45.field900.method1068(class155.field2724.method714((byte) -79), 112);
                class45.field900.method1068(class287.field5128.method714((byte) -128), 114);
                class45.field900.method1068(field2656.method714((byte) -88), 120);
                class45.field900.method1068(class13.field191.method714((byte) -124), 111);
                class45.field900.method1068(class56.field1050.method714((byte) -109), 125);
                class45.field900.method1068(class85.field1549.method714((byte) -88), 112);
                class45.field900.method1068(class101.field1832.method714((byte) -77), 115);
                class45.field900.method1068(class34.field671.method714((byte) -112), 121);
                class45.field900.method1068(class183.field3256.method714((byte) -116), 127);
                class45.field900.method1068(class88.field1594.method714((byte) -112), 116);
                class45.field900.method1068(class287.field5124.method714((byte) -81), 108);
                class45.field900.method1068(class151.field2647.method714((byte) -119), 109);
                class45.field900.method1068(class277.field4865.method714((byte) -100), 118);
                class45.field900.method1068(class206.field3605.method714((byte) -95), 111);
                class45.field900.method1068(class113.field1971.method714((byte) -107), 116);
                class45.field900.method1068(class99.field1773.method714((byte) -90), 121);
                class45.field900.method1068(class183.field3267.method714((byte) -101), 123);
                class45.field900.method1068(class176.field3184.method714((byte) -96), 119);
                class45.field900.method1068(class16.field254.method714((byte) -88), 121);
                class45.field900.method1068(class207.field3662.method714((byte) -86), 121);
                class45.field900.method1068(class221.field4067.method714((byte) -103), 111);
                class45.field900.method1068(class241.field4401.method714((byte) -113), 123);
                class45.field900.method1068(class10.field140.method714((byte) -94), 118);
                class45.field900.method1068(client.field2681.method714((byte) -85), 116);
                class45.field900.method1068(class165.field2910.method714((byte) -81), 122);
                class45.field900.method1068(class179.field3224.method714((byte) -120), 107);
                class45.field900.method1039((byte) 117, 0, class261.field4645.field2593, class261.field4645.field2568);
                class98.field1738.method894(0, class45.field900.field2568, class45.field900.field2593, -93);
                class261.field4645.method777(true, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class17.field262.method777(true, var6);
                class149.field2625 = 4;
            }
            if (class149.field2625 == 4) {
                if (class98.field1738.method891(1) < 1) {
                    return;
                }
                int var8 = class98.field1738.method897(30000);
                if (var8 == 21) {
                    class149.field2625 = 7;
                } else if (var8 == 29) {
                    class149.field2625 = 10;
                } else if (var8 == 1) {
                    class92.field1640 = var8;
                    class149.field2625 = 5;
                    return;
                } else if (var8 == 2) {
                    class149.field2625 = 8;
                } else if (var8 == 15) {
                    class149.field2625 = 0;
                    class92.field1640 = var8;
                    return;
                } else if (var8 == 23 && class123.field2131 < 1) {
                    class123.field2131++;
                    class198.field3472 = 0;
                    class149.field2625 = 1;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                    return;
                } else {
                    class92.field1640 = var8;
                    class149.field2625 = 0;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                    return;
                }
            }
            if (class149.field2625 == 6) {
                class261.field4645.field2593 = 0;
                class261.field4645.method767(17, (byte) 87);
                class98.field1738.method894(0, class261.field4645.field2568, class261.field4645.field2593, -58);
                class149.field2625 = 4;
            } else if (class149.field2625 == 7) {
                if (class98.field1738.method891(1) >= 1) {
                    class8.field111 = (class98.field1738.method897(30000) + 3) * 60;
                    class149.field2625 = 0;
                    class92.field1640 = 21;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                }
            } else if (class149.field2625 != 10) {
                if (class149.field2625 == 8) {
                    if (class98.field1738.method891(1) < 14) {
                        return;
                    }
                    class98.field1738.method889(class17.field262.field2568, (byte) -113, 14, 0);
                    class17.field262.field2593 = 0;
                    class123.field2134 = class17.field262.method1045((byte) -120);
                    class138.field2388 = class17.field262.method1045((byte) -112);
                    class8.field112 = class17.field262.method1045((byte) 89) == 1;
                    class78.field1427 = class17.field262.method1045((byte) 114) == 1;
                    class265.field4692 = class17.field262.method1045((byte) -114) == 1;
                    class92.field1638 = class17.field262.method1045((byte) -74) == 1;
                    class288.field5139 = class17.field262.method1045((byte) 98) == 1;
                    class19.field313 = class17.field262.method1050(1272006568);
                    class204.field3587 = class17.field262.method1045((byte) -82) == 1;
                    class16.field253 = class17.field262.method1045((byte) -72) == 1;
                    class191.method1327(class16.field253, 128);
                    class246.method1730(class16.field253, (byte) -108);
                    if (!class213.field3774) {
                        if ((!class8.field112 || class265.field4692) && !class204.field3587) {
                            try {
                                class138.field2391.method1465(63, class20.field326.field4207);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class195.field3434.method1465(63, class20.field326.field4207);
                            } catch (Throwable var10) {
                            }
                        }
                    }
                    class280.field4915 = class17.field262.method769(255);
                    class245.field4437 = class17.field262.method1050(1272006568);
                    class149.field2625 = 9;
                }
                if (class149.field2625 == 9 && class98.field1738.method891(1) >= class245.field4437) {
                    class17.field262.field2593 = 0;
                    class98.field1738.method889(class17.field262.field2568, (byte) 71, class245.field4437, 0);
                    class92.field1640 = 2;
                    class149.field2625 = 0;
                    class83.method622(false);
                    class89.field1602 = -1;
                    class113.method810(false, (byte) -97);
                    class280.field4915 = -1;
                }
            } else if (class98.field1738.method891(1) >= 1) {
                class138.field2396 = class98.field1738.method897(30000);
                class92.field1640 = 29;
                class149.field2625 = 0;
                class98.field1738.method888(true);
                class98.field1738 = null;
            }
        } catch (IOException var11) {
            if (class98.field1738 != null) {
                class98.field1738.method888(true);
                class98.field1738 = null;
            }
            if (class123.field2131 < 1) {
                class198.field3472 = 0;
                class123.field2131++;
                if (class6.field93 == class223.field4076) {
                    class223.field4076 = class147.field2527;
                } else {
                    class223.field4076 = class6.field93;
                }
                class149.field2625 = 1;
            } else {
                class149.field2625 = 0;
                class92.field1640 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)Z")
    public static final boolean method1101(int arg0, byte arg1) {
        field2657++;
        if (arg0 < 32) {
            return false;
        }
        if (arg1 < 11) {
            method1099(true, (class149) null);
        }
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field2655 = null;
        field2656 = null;
        if (arg0 != 63) {
            method1102(70);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method1103(boolean arg0) {
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class125.field2175[var1][var2] = 0;
            }
        }
        field2665++;
        if (!arg0) {
            method1100(36);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)I")
    public static final int method1104(boolean arg0, int arg1) {
        if (arg0) {
            field2663 = -21;
        }
        field2661++;
        return arg1 >>> 8;
    }
}

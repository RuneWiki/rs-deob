import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class262 extends class194 {

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field4644 = 0;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Ldl;")
    public static class31 field4641 = new class31(16);

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field4652 = 0;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lli;")
    public static class185 field4650 = class245.method1649(" <col=ffffff>", -112);

    @OriginalMember(owner = "client!c", name = "I", descriptor = "Lli;")
    private static class185 field4655 = class245.method1649("Connected to update server", 124);

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lli;")
    private static class185 field4656 = class245.method1649("Checking for updates )2 ", -39);

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Lli;")
    public static class185 field4654 = class245.method1649("floorshadows", 127);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lli;")
    public static class185 field4651 = field4655;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "J")
    public static long field4660 = 0L;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lli;")
    private static class185 field4648 = class245.method1649("Please wait)3)3)3", 124);

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lli;")
    public static class185 field4658 = field4648;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Lli;")
    public static class185 field4649 = field4656;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Lhi;")
    public static class250 field4653;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "[Ldd;")
    public static class211[] field4647;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
    public static final int method1789(int arg0) {
        if (arg0 != 10) {
            field4657 = 47;
        }
        field4642++;
        return class240.field4277.method81((byte) -71);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method1790(int arg0) {
        field4645++;
        if (class106.field1912 == 0 || class106.field1912 == 5) {
            return;
        }
        try {
            if (++class90.field1752 > 2000) {
                if (class125.field2252 != null) {
                    class125.field2252.method994((byte) -75);
                    class125.field2252 = null;
                }
                if (class212.field3899 >= 1) {
                    class106.field1912 = 0;
                    class195.field3588 = -5;
                    return;
                }
                if (class255.field4524 == class184.field3394) {
                    class255.field4524 = class21.field350;
                } else {
                    class255.field4524 = class184.field3394;
                }
                class106.field1912 = 1;
                class90.field1752 = 0;
                class212.field3899++;
            }
            if (class106.field1912 == 1) {
                class183.field3370 = class124.field2238.method1163((byte) -91, class255.field4524, class33.field545);
                class106.field1912 = 2;
            }
            int var1 = -34 % ((arg0 - 40) / 42);
            if (class106.field1912 == 2) {
                if (class183.field3370.field487 == 2) {
                    throw new IOException();
                }
                if (class183.field3370.field487 != 1) {
                    return;
                }
                class125.field2252 = new class138((Socket) class183.field3370.field486, class124.field2238);
                class183.field3370 = null;
                long var2 = class130.field2326 = class20.field332.method1327((byte) 101);
                class182.field3349.field2155 = 0;
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class182.field3349.method877((byte) 102, 14);
                class182.field3349.method877((byte) 98, var4);
                class125.field2252.method995(class182.field3349.field2115, 0, -111, 2);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 123);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 127);
                }
                int var5 = class125.field2252.method988((byte) -57);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 127);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 120);
                }
                if (var5 != 0) {
                    class106.field1912 = 0;
                    class195.field3588 = var5;
                    class125.field2252.method994((byte) -27);
                    class125.field2252 = null;
                    return;
                }
                class106.field1912 = 3;
            }
            if (class106.field1912 == 3) {
                if (class125.field2252.method991((byte) -65) < 8) {
                    return;
                }
                class125.field2252.method993(8, class142.field2669.field2115, 5623, 0);
                class142.field2669.field2155 = 0;
                class116.field2064 = class142.field2669.method862(false);
                int[] var6 = new int[4];
                class182.field3349.field2155 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[2] = (int) (class116.field2064 >> 32);
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[3] = (int) class116.field2064;
                class182.field3349.method877((byte) 108, 10);
                class182.field3349.method842(var6[0], -6596);
                class182.field3349.method842(var6[1], -6596);
                class182.field3349.method842(var6[2], -6596);
                class182.field3349.method842(var6[3], -6596);
                class182.field3349.method870(class20.field332.method1327((byte) 101), (byte) 122);
                class182.field3349.method855((byte) -102, class20.field317);
                class182.field3349.method861(class173.field3169, class37.field568, (byte) -66);
                class153.field2890.field2155 = 0;
                if (class80.field1399 == 40) {
                    class153.field2890.method877((byte) 109, 18);
                } else {
                    class153.field2890.method877((byte) 103, 16);
                }
                class153.field2890.method856(31133, class182.field3349.field2155 + class78.method507(255, class25.field420) + 159);
                class153.field2890.method842(527, -6596);
                class153.field2890.method877((byte) 123, class191.field3533);
                class153.field2890.method877((byte) 113, class221.field4019 ? 1 : 0);
                class153.field2890.method877((byte) 111, 0);
                class153.field2890.method877((byte) 120, class123.method898(true));
                class153.field2890.method856(31133, class204.field3738);
                class153.field2890.method856(31133, class148.field2796);
                class153.field2890.method877((byte) 116, class155.field2937);
                class225.method1559((byte) -10, class153.field2890);
                class153.field2890.method855((byte) -61, class25.field420);
                class153.field2890.method842(class119.field2175, -6596);
                class153.field2890.method842(class107.method755(false), -6596);
                class201.field3686 = true;
                class153.field2890.method856(31133, class179.field3300);
                class153.field2890.method842(class142.field2722.method1686((byte) 60), -6596);
                class153.field2890.method842(class203.field3712.method1686((byte) 123), -6596);
                class153.field2890.method842(class183.field3378.method1686((byte) 107), -6596);
                class153.field2890.method842(class225.field4117.method1686((byte) 114), -6596);
                class153.field2890.method842(class223.field4091.method1686((byte) -59), -6596);
                class153.field2890.method842(class24.field407.method1686((byte) -111), -6596);
                class153.field2890.method842(class181.field3325.method1686((byte) 56), -6596);
                class153.field2890.method842(class36.field560.method1686((byte) 98), -6596);
                class153.field2890.method842(class21.field365.method1686((byte) -83), -6596);
                class153.field2890.method842(class205.field3761.method1686((byte) 103), -6596);
                class153.field2890.method842(class161.field3045.method1686((byte) 122), -6596);
                class153.field2890.method842(class148.field2801.method1686((byte) 54), -6596);
                class153.field2890.method842(class187.field3465.method1686((byte) 93), -6596);
                class153.field2890.method842(class188.field3480.method1686((byte) 89), -6596);
                class153.field2890.method842(class37.field588.method1686((byte) -119), -6596);
                class153.field2890.method842(class271.field4812.method1686((byte) 64), -6596);
                class153.field2890.method842(class134.field2418.method1686((byte) 102), -6596);
                class153.field2890.method842(class107.field1931.method1686((byte) 63), -6596);
                class153.field2890.method842(class280.field4963.method1686((byte) 94), -6596);
                class153.field2890.method842(class134.field2408.method1686((byte) 71), -6596);
                class153.field2890.method842(class107.field1926.method1686((byte) 127), -6596);
                class153.field2890.method842(class274.field4861.method1686((byte) 107), -6596);
                class153.field2890.method842(class33.field550.method1686((byte) -36), -6596);
                class153.field2890.method842(class193.field3563.method1686((byte) -59), -6596);
                class153.field2890.method842(class269.field4756.method1686((byte) -120), -6596);
                class153.field2890.method842(class58.field1019.method1686((byte) -27), -6596);
                class153.field2890.method842(class245.field4359.method1686((byte) -22), -6596);
                class153.field2890.method842(class183.field3359.method1686((byte) 59), -6596);
                class153.field2890.method848(class182.field3349.field2115, 0, (byte) -99, class182.field3349.field2155);
                class125.field2252.method995(class153.field2890.field2115, 0, 45, class153.field2890.field2155);
                class182.field3349.method578(var6, 8);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class142.field2669.method578(var6, 8);
                class106.field1912 = 4;
            }
            if (class106.field1912 == 4) {
                if (class125.field2252.method991((byte) -98) < 1) {
                    return;
                }
                int var8 = class125.field2252.method988((byte) -57);
                if (var8 == 21) {
                    class106.field1912 = 7;
                } else if (var8 == 29) {
                    class106.field1912 = 10;
                } else if (var8 == 1) {
                    class106.field1912 = 5;
                    class195.field3588 = var8;
                    return;
                } else if (var8 == 2) {
                    class106.field1912 = 8;
                } else if (var8 == 15) {
                    class106.field1912 = 0;
                    class195.field3588 = var8;
                    return;
                } else if (var8 == 23 && class212.field3899 < 1) {
                    class106.field1912 = 1;
                    class212.field3899++;
                    class90.field1752 = 0;
                    class125.field2252.method994((byte) -29);
                    class125.field2252 = null;
                    return;
                } else {
                    class106.field1912 = 0;
                    class195.field3588 = var8;
                    class125.field2252.method994((byte) -87);
                    class125.field2252 = null;
                    return;
                }
            }
            if (class106.field1912 == 6) {
                class182.field3349.field2155 = 0;
                class182.field3349.method577(17, 0);
                class125.field2252.method995(class182.field3349.field2115, 0, -119, class182.field3349.field2155);
                class106.field1912 = 4;
            } else if (class106.field1912 == 7) {
                if (class125.field2252.method991((byte) -66) >= 1) {
                    class179.field3296 = class125.field2252.method988((byte) -57) * 60 + 180;
                    class195.field3588 = 21;
                    class106.field1912 = 0;
                    class125.field2252.method994((byte) -82);
                    class125.field2252 = null;
                }
            } else if (class106.field1912 != 10) {
                if (class106.field1912 == 8) {
                    if (class125.field2252.method991((byte) -43) < 14) {
                        return;
                    }
                    class125.field2252.method993(14, class142.field2669.field2115, 5623, 0);
                    class142.field2669.field2155 = 0;
                    class205.field3769 = class142.field2669.method867(false);
                    class79.field1376 = class142.field2669.method867(false);
                    class212.field3864 = class142.field2669.method867(false) == 1;
                    class118.field2142 = class142.field2669.method867(false) == 1;
                    class198.field3622 = class142.field2669.method867(false) == 1;
                    class275.field4880 = class142.field2669.method867(false) == 1;
                    class211.field3860 = class142.field2669.method867(false) == 1;
                    class249.field4421 = class142.field2669.method827(255);
                    class146.field2776 = class142.field2669.method867(false) == 1;
                    class137.field2565 = class142.field2669.method867(false) == 1;
                    class158.method1125(0, class137.field2565);
                    class81.method527(class137.field2565, 0);
                    if (!class221.field4019) {
                        if ((!class212.field3864 || class198.field3622) && !class146.field2776) {
                            try {
                                class193.field3567.method1315(102, class124.field2238.field3022);
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class84.field1661.method1315(-42, class124.field2238.field3022);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class280.field4950 = class142.field2669.method585(-90);
                    class217.field3976 = class142.field2669.method827(255);
                    class106.field1912 = 9;
                }
                if (class106.field1912 == 9 && class125.field2252.method991((byte) -104) >= class217.field3976) {
                    class142.field2669.field2155 = 0;
                    class125.field2252.method993(class217.field3976, class142.field2669.field2115, 5623, 0);
                    class195.field3588 = 2;
                    class106.field1912 = 0;
                    class282.method1922((byte) -106);
                    class103.field1868 = -1;
                    class88.method582(true, false);
                    class280.field4950 = -1;
                }
            } else if (class125.field2252.method991((byte) -61) >= 1) {
                class154.field2927 = class125.field2252.method988((byte) -57);
                class106.field1912 = 0;
                class195.field3588 = 29;
                class125.field2252.method994((byte) -126);
                class125.field2252 = null;
            }
        } catch (IOException var11) {
            if (class125.field2252 != null) {
                class125.field2252.method994((byte) -66);
                class125.field2252 = null;
            }
            if (class212.field3899 < 1) {
                class106.field1912 = 1;
                if (class255.field4524 == class184.field3394) {
                    class255.field4524 = class21.field350;
                } else {
                    class255.field4524 = class184.field3394;
                }
                class90.field1752 = 0;
                class212.field3899++;
            } else {
                class106.field1912 = 0;
                class195.field3588 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public static final void method1791(int arg0, int arg1) {
        field4643++;
        if (arg1 != 7330) {
            return;
        }
        class44.method267(114);
        class82.method543(false);
        int var2 = class183.method1288((byte) -122, arg0).field4845;
        if (var2 == 0) {
            return;
        }
        int var3 = class59.field1059[arg0];
        if (var2 == 6) {
            class151.field2870 = var3;
        }
        if (var2 == 9) {
            class27.field453 = var3;
        }
        if (var2 == 5) {
            class48.field784 = var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method1792(byte arg0) {
        field4651 = null;
        field4653 = null;
        field4656 = null;
        field4648 = null;
        field4658 = null;
        field4649 = null;
        field4647 = null;
        field4655 = null;
        field4650 = null;
        field4654 = null;
        if (arg0 > 103) {
            field4641 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Lhc;")
    public static final class146 method1793(int arg0, int arg1) {
        class146 var2 = (class146) class44.field695.method1615(-28166, (long) arg0);
        field4646++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class187.field3472.method1688(arg1 ^ arg1, arg0, 5);
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method1042((byte) 88, new class118(var3));
        }
        class44.field695.method1620(var4, (byte) 49, (long) arg0);
        return var4;
    }
}

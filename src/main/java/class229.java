import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class229 extends class243 {

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    private int field3995 = 4;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "I")
    private int field3993 = 4;

    @OriginalMember(owner = "client!vi", name = "jb", descriptor = "Lub;")
    public static class227 field3999 = class257.method1749("VOLL", 17263);

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "Lub;")
    public static class227 field3996 = class257.method1749("Ablegen", 17263);

    @OriginalMember(owner = "client!vi", name = "kb", descriptor = "Z")
    public static boolean field4000 = false;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "[Lfd;")
    public static class190[] field3994 = new class190[4];

    @OriginalMember(owner = "client!vi", name = "qb", descriptor = "Lub;")
    public static class227 field4006 = class257.method1749("loginscreen", 17263);

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!vi", name = "lb", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!vi", name = "mb", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!vi", name = "nb", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!vi", name = "ob", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!vi", name = "pb", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!vi", name = "rb", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!vi", name = "sb", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!vi", name = "tb", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!vi", name = "ub", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V")
    public static void method1542(byte arg0) {
        field3994 = null;
        field4006 = null;
        if (arg0 <= 84) {
            method1545((class138) null, -76);
        }
        field3999 = null;
        field3996 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = -71 / ((arg0 - -15) / 51);
        ++field4002;
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var5 = class212.field3586 / this.field3995;
            int var6 = class193.field3280 / this.field3993;
            int[] var7;
            if (~var6 >= -1) {
                var7 = this.method1614(0, 0, 120);
            } else {
                int var8 = arg1 % var6;
                var7 = this.method1614(0, class193.field3280 * var8 / var6, 80);
            }
            for (int var9 = 0; ~class212.field3586 < ~var9; ++var9) {
                if (~var5 >= -1) {
                    var4[var9] = var7[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var7[class212.field3586 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqa;)V")
    public static final void method1543(int arg0, class225 arg1) {
        if (arg0 != -10530) {
            field3994 = null;
        }
        class238 var2 = (class238) class223.field3790.method1298(arg0 ^ 10579, arg1.field3819.method1485(122));
        if (var2 != null) {
            var2.method1587(arg0 + 10530);
        } else {
            class187.method1188((class195) null, arg1.field78[0], arg0 ^ -9687, arg1, arg1.field49[0], 0, class64.field1171, (class45) null);
        }
        ++field4005;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field3992;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field3993 = arg0.method1471(255);
            }
        } else {
            this.field3995 = arg0.method1471(255);
        }
        if (arg1) {
            method1547((byte) -42, -68, 70);
        }
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
    public static final void method1544(int arg0) {
        if (class92.field1568 > 1) {
            class216.field3649 = class77.field1356;
            --class92.field1568;
        }
        ++field4010;
        if (~class100.field1753 < -1) {
            --class100.field1753;
        }
        if (class109.field2044) {
            class109.field2044 = false;
            class168.method1038(arg0 + -12123);
        } else {
            for (int var1 = 0; ~var1 > -101 && class98.method604((byte) 117); ++var1) {
            }
            if (class184.field3139 == 30) {
                class67.method420(class176.field2935, 26, 0);
                Object var2 = class252.field4362.field4177;
                synchronized (class252.field4362.field4177) {
                    if (!class195.field3317) {
                        class252.field4362.field4184 = 0;
                    } else if (class50.field885 != 0 || ~class252.field4362.field4184 <= -41) {
                        class176.field2935.method664((byte) -126, 85);
                        class176.field2935.method1443(0, 0);
                        int var3 = class176.field2935.field3879;
                        ++class56.field1025;
                        int var4 = 0;
                        for (int var5 = 0; ~var5 > ~class252.field4362.field4184 && ~(class176.field2935.field3879 - var3) > -241; ++var5) {
                            ++var4;
                            int var6 = class252.field4362.field4186[var5];
                            if (~var6 > -1) {
                                var6 = 0;
                            } else if (var6 > 65534) {
                                var6 = 65534;
                            }
                            boolean var7 = false;
                            int var8 = class252.field4362.field4185[var5];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (~var8 < -65535) {
                                var8 = 65534;
                            }
                            if (~class252.field4362.field4185[var5] == 0 && ~class252.field4362.field4186[var5] == 0) {
                                var8 = -1;
                                var6 = -1;
                                var7 = true;
                            }
                            if (class216.field3646 == var6 && class176.field2933 == var8) {
                                if (class132.field2303 < 2047) {
                                    ++class132.field2303;
                                }
                            } else {
                                int var9 = -class216.field3646 + var6;
                                class216.field3646 = var6;
                                int var10 = -class176.field2933 + var8;
                                class176.field2933 = var8;
                                if (~class132.field2303 > -9 && ~var9 <= 31 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                                    var9 += 32;
                                    var10 += 32;
                                    class176.field2935.method1451((class132.field2303 << 12) - -(var9 << 6) + var10, (byte) -119);
                                    class132.field2303 = 0;
                                } else if (class132.field2303 < 32 && ~var9 <= 127 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                                    var10 += 128;
                                    class176.field2935.method1443(class132.field2303 + 128, 0);
                                    var9 += 128;
                                    class176.field2935.method1451((var9 << 8) + var10, (byte) -122);
                                    class132.field2303 = 0;
                                } else if (~class132.field2303 > -33) {
                                    class176.field2935.method1443(class132.field2303 + 192, 0);
                                    if (var7) {
                                        class176.field2935.method1427(Integer.MIN_VALUE, (byte) -13);
                                    } else {
                                        class176.field2935.method1427(var8 << 16 | var6, (byte) -112);
                                    }
                                    class132.field2303 = 0;
                                } else {
                                    class176.field2935.method1451(class132.field2303 + 57344, (byte) -110);
                                    if (!var7) {
                                        class176.field2935.method1427(var8 << 16 | var6, (byte) -102);
                                    } else {
                                        class176.field2935.method1427(Integer.MIN_VALUE, (byte) -101);
                                    }
                                    class132.field2303 = 0;
                                }
                            }
                        }
                        class176.field2935.method1464(-var3 + class176.field2935.field3879, 0);
                        if (~class252.field4362.field4184 < ~var4) {
                            class252.field4362.field4184 -= var4;
                            for (int var11 = 0; ~var11 > ~class252.field4362.field4184; ++var11) {
                                class252.field4362.field4186[var11] = class252.field4362.field4186[var4 + var11];
                                class252.field4362.field4185[var11] = class252.field4362.field4185[var4 + var11];
                            }
                        } else {
                            class252.field4362.field4184 = 0;
                        }
                    }
                }
                if (~class50.field885 != -1) {
                    int var12 = class232.field4043;
                    ++class43.field721;
                    long var13 = (-class184.field3129 + class83.field1462) / 50L;
                    if (var12 >= 0) {
                        if (var12 > 65535) {
                            var12 = 65535;
                        }
                    } else {
                        var12 = 0;
                    }
                    if (~var13 < -32768L) {
                        var13 = 32767L;
                    }
                    class184.field3129 = class83.field1462;
                    int var15 = (int) var13;
                    byte var16 = 0;
                    if (class50.field885 == 2) {
                        var16 = 1;
                    }
                    int var17 = class81.field1403;
                    class176.field2935.method664((byte) 45, 94);
                    if (var17 >= 0) {
                        if (~var17 < -65536) {
                            var17 = 65535;
                        }
                    } else {
                        var17 = 0;
                    }
                    class176.field2935.method1427(var17 << 16 | var12, (byte) -100);
                    class176.field2935.method1451(var16 << 15 | var15, (byte) -110);
                }
                if (class213.field3595[96] || class213.field3595[97] || class213.field3595[98] || class213.field3595[99]) {
                    class29.field472 = true;
                }
                if (~class149.field2594 < -1) {
                    --class149.field2594;
                }
                if (class29.field472 && ~class149.field2594 >= -1) {
                    class149.field2594 = 20;
                    ++class228.field3985;
                    class29.field472 = false;
                    class176.field2935.method664((byte) -124, 1);
                    class176.field2935.method1476(class29.field476, -99);
                    class176.field2935.method1476(class24.field409, arg0 + -12130);
                }
                if (class65.field1194 && !class4.field44) {
                    class4.field44 = true;
                    class176.field2935.method664((byte) -99, 136);
                    ++class184.field3122;
                    class176.field2935.method1443(1, 0);
                }
                if (!class65.field1194 && class4.field44) {
                    class4.field44 = false;
                    class176.field2935.method664((byte) -112, 136);
                    class176.field2935.method1443(0, 0);
                    ++class184.field3122;
                }
                if (!class7.field152) {
                    class176.field2935.method664((byte) 77, 211);
                    ++class95.field1650;
                    class176.field2935.method1475(true, class116.method732((byte) -85));
                    class7.field152 = true;
                }
                class187.method1192(true);
                if (~class184.field3139 == -31) {
                    class253.method1713((byte) 103);
                    class188.method1198(arg0 + -17340);
                    ++class85.field1473;
                    if (~class85.field1473 < -751) {
                        class168.method1038(-54);
                    } else {
                        class20.method92(18407);
                        class184.method1175(58);
                        class109.method677(arg0 ^ 12085);
                        if (class178.field3029 != null) {
                            class218.method1375(-3);
                        }
                        for (int var18 = class29.method151(true, 113); ~var18 != 0; var18 = class29.method151(false, 116)) {
                            class225.method1417(var18, (byte) 117);
                            class76.field1326[class76.method446(31, class99.field1725++)] = var18;
                        }
                        for (class171 var19 = class251.method1677(arg0 + -11944); var19 != null; var19 = class251.method1677(121)) {
                            int var20 = var19.method1086((byte) 109);
                            int var21 = var19.method1091((byte) 119);
                            if (var20 == 1) {
                                class42.field692[var21] = var19.field2857;
                                class52.field921[class76.method446(class3.field39++, 31)] = var21;
                            } else if (var20 == 2) {
                                class149.field2604[var21] = var19.field2863;
                                class168.field2825[class76.method446(31, class26.field432++)] = var21;
                            }
                        }
                        ++class85.field1481;
                        if (~class14.field257 != -1) {
                            class193.field3288 += 20;
                            if (~class193.field3288 <= -401) {
                                class14.field257 = 0;
                            }
                        }
                        if (class77.field1349 != null) {
                            ++class193.field3296;
                            if (class193.field3296 >= 15) {
                                class198.method1268(119, class77.field1349);
                                class77.field1349 = null;
                            }
                        }
                        if (class212.field3588 != null) {
                            class198.method1268(arg0 ^ 12099, class212.field3588);
                            if (class95.field1641 + 5 < class100.field1752 || class95.field1641 + -5 > class100.field1752 || client.field1451 > class119.field2174 + 5 || ~(class119.field2174 + -5) < ~client.field1451) {
                                class167.field2788 = true;
                            }
                            ++class28.field453;
                            if (class122.field2197 == 0) {
                                if (class167.field2788 && class28.field453 >= 5) {
                                    if (class243.field4212 == class212.field3588 && ~class87.field1515 != ~class208.field3525) {
                                        class105 var22 = class212.field3588;
                                        ++class146.field2514;
                                        byte var23 = 0;
                                        if (~class115.field2113 == -2 && var22.field1975 == 206) {
                                            var23 = 1;
                                        }
                                        if (var22.field1865[class208.field3525] <= 0) {
                                            var23 = 0;
                                        }
                                        if (!class33.method176(client.method494(var22), arg0 + -12076)) {
                                            if (var23 == 1) {
                                                int var24 = class87.field1515;
                                                int var25 = class208.field3525;
                                                while (~var24 != ~var25) {
                                                    if (~var25 > ~var24) {
                                                        var22.method644(var24 - 1, (byte) -127, var24);
                                                        --var24;
                                                    } else if (var24 < var25) {
                                                        var22.method644(var24 + 1, (byte) -89, var24);
                                                        ++var24;
                                                    }
                                                }
                                            } else {
                                                var22.method644(class208.field3525, (byte) -123, class87.field1515);
                                            }
                                        } else {
                                            int var26 = class87.field1515;
                                            int var27 = class208.field3525;
                                            var22.field1865[var27] = var22.field1865[var26];
                                            var22.field1921[var27] = var22.field1921[var26];
                                            var22.field1865[var26] = -1;
                                            var22.field1921[var26] = 0;
                                        }
                                        class176.field2935.method664((byte) -116, 129);
                                        class176.field2935.method1443(var23, 0);
                                        class176.field2935.method1451(class87.field1515, (byte) -127);
                                        class176.field2935.method1468(class208.field3525, 0);
                                        class176.field2935.method1475(true, class212.field3588.field1861);
                                    }
                                } else if ((class241.field4191 == 1 || class186.method1187(class94.field1631 + -1, 27651)) && class94.field1631 > 2) {
                                    class105.method650(-6416);
                                } else if (~class94.field1631 < -1) {
                                    class80.method468(class94.field1631 + -1, (byte) 119);
                                }
                                class193.field3296 = 10;
                                class50.field885 = 0;
                                class212.field3588 = null;
                            }
                        }
                        field4000 = false;
                        class181.field3097 = 0;
                        class184.field3125 = false;
                        class255.field4475 = null;
                        class105 var28 = class132.field2297;
                        class132.field2297 = null;
                        class105 var29 = class141.field2427;
                        class141.field2427 = null;
                        while (class252.method1687(arg0 + -11942) && ~class181.field3097 > -129) {
                            class103.field1805[class181.field3097] = class99.field1721;
                            class241.field4194[class181.field3097] = class143.field2457;
                            ++class181.field3097;
                        }
                        class178.field3029 = null;
                        if (class116.field2131 != -1) {
                            class238.method1585(0, 0, class49.field867, class208.field3538, 90, 0, 0, class116.field2131);
                        }
                        ++class77.field1356;
                        while (true) {
                            class34 var30;
                            class105 var31;
                            class105 var32;
                            do {
                                var30 = (class34) class101.field1779.method1269((byte) -65);
                                if (var30 == null) {
                                    while (true) {
                                        class34 var33;
                                        class105 var34;
                                        class105 var35;
                                        do {
                                            var33 = (class34) class88.field1522.method1269((byte) 124);
                                            if (var33 == null) {
                                                while (true) {
                                                    class34 var36;
                                                    class105 var37;
                                                    class105 var38;
                                                    do {
                                                        var36 = (class34) class15.field281.method1269((byte) 124);
                                                        if (var36 == null) {
                                                            if (class115.field2109 && class178.field3029 == null) {
                                                                class115.field2109 = false;
                                                            }
                                                            if (class10.field194 != null) {
                                                                class7.method30(true);
                                                            }
                                                            if (~class8.field160 != 0) {
                                                                int var39 = class8.field160;
                                                                int var40 = class261.field4540;
                                                                boolean var41 = class117.method736(126, 0, 0, var39, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var40, 0, true, 0);
                                                                class8.field160 = -1;
                                                                if (var41) {
                                                                    class144.field2471 = class81.field1403;
                                                                    class14.field257 = 1;
                                                                    class177.field2966 = class232.field4043;
                                                                    class193.field3288 = 0;
                                                                }
                                                            }
                                                            class190.method1209((byte) -125);
                                                            if (class132.field2297 != var28) {
                                                                if (var28 != null) {
                                                                    class198.method1268(arg0 + -11948, var28);
                                                                }
                                                                if (class132.field2297 != null) {
                                                                    class198.method1268(arg0 + -11932, class132.field2297);
                                                                }
                                                            }
                                                            if (class141.field2427 != var29 && class260.field4534 == class25.field426) {
                                                                if (var29 != null) {
                                                                    class198.method1268(76, var29);
                                                                }
                                                                if (class141.field2427 != null) {
                                                                    class198.method1268(125, class141.field2427);
                                                                }
                                                            }
                                                            if (class141.field2427 != null) {
                                                                if (class25.field426 > class260.field4534) {
                                                                    ++class260.field4534;
                                                                    if (~class260.field4534 == ~class25.field426) {
                                                                        class198.method1268(103, class141.field2427);
                                                                    }
                                                                }
                                                            } else if (~class260.field4534 < -1) {
                                                                --class260.field4534;
                                                            }
                                                            if (client.field1447 != 1) {
                                                                if (client.field1447 == 2) {
                                                                    class172.method1100(arg0 + -13077);
                                                                } else {
                                                                    class130.method793((byte) 11);
                                                                }
                                                            } else {
                                                                class149.method944((byte) -36);
                                                            }
                                                            for (int var42 = 0; ~var42 > -6; ++var42) {
                                                                int var10002 = class89.field1544[var42]++;
                                                            }
                                                            int var43 = class218.method1373(arg0 ^ arg0);
                                                            int var44 = class45.method248(-128);
                                                            if (var43 > 4500 && ~var44 < -4501) {
                                                                class100.field1753 = 250;
                                                                class29.method153(123, 4000);
                                                                class176.field2935.method664((byte) -124, 96);
                                                                ++class193.field3293;
                                                            }
                                                            ++class42.field689;
                                                            ++class184.field3134;
                                                            if (class42.field689 > 500) {
                                                                class42.field689 = 0;
                                                                int var45 = (int) (Math.random() * 8.0D);
                                                                if (~(var45 & 1) == -2) {
                                                                    class185.field3144 += class19.field333;
                                                                }
                                                                if (~(4 & var45) == -5) {
                                                                    class47.field852 += class96.field1664;
                                                                }
                                                                if (~(var45 & 2) == -3) {
                                                                    class101.field1772 += class100.field1757;
                                                                }
                                                            }
                                                            if (class47.field852 < -40) {
                                                                class96.field1664 = 1;
                                                            }
                                                            if (~class101.field1772 > 54) {
                                                                class100.field1757 = 2;
                                                            }
                                                            if (class47.field852 > 40) {
                                                                class96.field1664 = -1;
                                                            }
                                                            ++class123.field2206;
                                                            if (~class101.field1772 < -56) {
                                                                class100.field1757 = -2;
                                                            }
                                                            if (~class123.field2206 < -501) {
                                                                class123.field2206 = 0;
                                                                int var46 = (int) (Math.random() * 8.0D);
                                                                if (~(var46 & 1) == -2) {
                                                                    class254.field4462 += class59.field1092;
                                                                }
                                                                if (~(var46 & 2) == -3) {
                                                                    class91.field1559 += class105.field1887;
                                                                }
                                                            }
                                                            if (class254.field4462 < -60) {
                                                                class59.field1092 = 2;
                                                            }
                                                            if (class254.field4462 > 60) {
                                                                class59.field1092 = -2;
                                                            }
                                                            if (class91.field1559 < -20) {
                                                                class105.field1887 = 1;
                                                            }
                                                            if (~class185.field3144 > 49) {
                                                                class19.field333 = 2;
                                                            }
                                                            if (class91.field1559 > 10) {
                                                                class105.field1887 = -1;
                                                            }
                                                            if (~class185.field3144 < -51) {
                                                                class19.field333 = -2;
                                                            }
                                                            if (~class184.field3134 < -51) {
                                                                class176.field2935.method664((byte) 112, 233);
                                                                ++class139.field2411;
                                                            }
                                                            class185.method1179(123);
                                                            try {
                                                                if (class9.field172 != null && ~class176.field2935.field3879 < -1) {
                                                                    class9.field172.method94(class176.field2935.field3879, (byte) -24, class176.field2935.field3901, 0);
                                                                    class184.field3134 = 0;
                                                                    class176.field2935.field3879 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var47) {
                                                                class168.method1038(arg0 ^ 12154);
                                                                return;
                                                            }
                                                        }
                                                        var37 = var36.field583;
                                                        if (var37.field1884 < 0) {
                                                            break;
                                                        }
                                                        var38 = class27.method137(var37.field1968, arg0 ^ -954495964);
                                                    } while (var38 == null || var38.field1956 == null || var38.field1956.length <= var37.field1884 || var38.field1956[var37.field1884] != var37);
                                                    class218.method1377(var36, false);
                                                }
                                            }
                                            var34 = var33.field583;
                                            if (~var34.field1884 > -1) {
                                                break;
                                            }
                                            var35 = class27.method137(var34.field1968, arg0 ^ -954495964);
                                        } while (var35 == null || var35.field1956 == null || ~var35.field1956.length >= ~var34.field1884 || var35.field1956[var34.field1884] != var34);
                                        class218.method1377(var33, false);
                                    }
                                }
                                var31 = var30.field583;
                                if (var31.field1884 < 0) {
                                    break;
                                }
                                var32 = class27.method137(var31.field1968, -954490064);
                            } while (var32 == null || var32.field1956 == null || ~var31.field1884 <= ~var32.field1956.length || var32.field1956[var31.field1884] != var31);
                            class218.method1377(var30, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ln;I)V")
    public static final void method1545(class138 arg0, int arg1) {
        class29.field478 = arg0;
        class161.field2714 = class29.field478.method875(arg1 + -15196, 4);
        ++field4008;
        if (arg1 != 15194) {
            method1548(71, -69);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII)V")
    public static final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4003;
        int var6 = arg2;
        int var7 = 0;
        int var8 = arg0 * arg0;
        int var9 = arg2 * arg2;
        if (arg5 > 53) {
            int var10 = var8 << 1;
            int var11 = var9 << 1;
            int var12 = arg2 << 1;
            int var13 = var9 - (var12 - 1) * var10;
            int var14 = ((var7 << 1) - -3) * var11;
            int var15 = var9 << 2;
            int var16 = ((arg2 << 1) + -3) * var10;
            if (arg1 >= class161.field2718 && arg1 <= class46.field817) {
                int var17 = class23.method111(arg0 + arg4, class125.field2234, class19.field331, 0);
                int var18 = class23.method111(arg4 - arg0, class125.field2234, class19.field331, 0);
                class246.method1644(arg3, class59.field1094[arg1], var17, var18, 1);
            }
            int var19 = (var7 - -1) * var15;
            int var20 = var8 << 2;
            int var21 = (arg2 + -1) * var20;
            int var22 = (-var12 + 1) * var8 - -var11;
            while (var6 > 0) {
                if (~var22 > -1) {
                    while (~var22 > -1) {
                        var22 += var14;
                        ++var7;
                        var13 += var19;
                        var14 += var15;
                        var19 += var15;
                    }
                }
                if (var13 < 0) {
                    ++var7;
                    var13 += var19;
                    var22 += var14;
                    var19 += var15;
                    var14 += var15;
                }
                var22 += -var21;
                var13 += -var16;
                var21 -= var20;
                --var6;
                int var23 = arg1 - var6;
                int var24 = arg1 + var6;
                var16 -= var20;
                if (~var24 <= ~class161.field2718 && var23 <= class46.field817) {
                    int var25 = class23.method111(arg4 + var7, class125.field2234, class19.field331, 0);
                    int var26 = class23.method111(-var7 + arg4, class125.field2234, class19.field331, 0);
                    if (~class161.field2718 >= ~var23) {
                        class246.method1644(arg3, class59.field1094[var23], var25, var26, 1);
                    }
                    if (~class46.field817 <= ~var24) {
                        class246.method1644(arg3, class59.field1094[var24], var25, var26, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)V")
    public static final void method1547(byte arg0, int arg1, int arg2) {
        ++field3989;
        if (arg0 < 79) {
            method1546(-81, -112, 112, -13, 107, -41);
        }
        class171 var3 = class184.method1170(arg2, 1, -198247328);
        var3.method1089(92);
        var3.field2857 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)V")
    public static final void method1548(int arg0, int arg1) {
        ++field4001;
        class171 var2 = class184.method1170(arg1, arg0, -198247328);
        var2.method1095((byte) 92);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field4009;
        int[][] var3 = super.field4213.method1406(arg1, arg0 + -230);
        if (super.field4213.field3771) {
            int var4 = class212.field3586 / this.field3995;
            int var5 = class193.field3280 / this.field3993;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1616(-1, class193.field3280 * var6 / var5, 0);
            } else {
                var7 = this.method1616(-1, 0, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[2];
            int[] var10 = var7[0];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class212.field3586; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class212.field3586 * var16 / var4;
                }
                var11[var14] = var10[var15];
                var12[var14] = var8[var15];
                var13[var14] = var9[var15];
            }
        }
        if (arg0 != 230) {
            field3994 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)V")
    public static final void method1549(int arg0) {
        class197.field3375.method1723(-4173);
        ++field4004;
        class171.field2866.method1723(-4173);
        if (arg0 >= -45) {
            method1549(-125);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[B)I")
    public static final int method1550(int arg0, int arg1, byte[] arg2) {
        if (arg1 != -29016) {
            field3990 = -128;
        }
        ++field3988;
        return class101.method622(arg0, arg1 + 30607, arg2, 0);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, false);
    }
}

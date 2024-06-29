import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class254 extends class288 {

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    private int field4054 = 4096;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    private int field4056 = 4096;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    private int field4066 = 4096;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Leg;")
    public static class272 field4053 = new class272(500);

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Z")
    public static volatile boolean field4065 = true;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Leg;")
    public static class272 field4067 = new class272(64);

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Lcb;")
    public static class255 field4068;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field4055;
        if (arg1 != -19) {
            field4065 = false;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field4054 = arg0.method1777(-64);
                }
            } else {
                this.field4066 = arg0.method1777(-110);
            }
        } else {
            this.field4056 = arg0.method1777(-40);
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public static void method1659(int arg0) {
        if (arg0 != 128) {
            method1659(57);
        }
        field4068 = null;
        field4053 = null;
        field4067 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field4052;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int[][] var4 = this.method1930(0, arg1, (byte) 22);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class186.field2986 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var13 == ~var14 && var12 == var13) {
                    var8[var11] = this.field4056 * var14 >> 12;
                    var10[var11] = this.field4066 * var13 >> 12;
                    var9[var11] = this.field4054 * var12 >> 12;
                } else {
                    var8[var11] = this.field4056;
                    var10[var11] = this.field4066;
                    var9[var11] = this.field4054;
                }
            }
        }
        if (arg0 != 1) {
            method1661(false, (byte) 33, false, 50);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZLeb;II)V")
    public static final void method1660(int arg0, boolean arg1, class103 arg2, int arg3, int arg4) {
        ++field4061;
        int var5 = arg2.field1691;
        if (~arg2.field1644 != -1) {
            if (~arg2.field1644 == -2) {
                arg2.field1691 = -arg2.field1597 + arg3;
            } else if (arg2.field1644 == 2) {
                arg2.field1691 = arg2.field1597 * arg3 >> 14;
            } else if (~arg2.field1644 == -4) {
                if (arg2.field1655 != 2) {
                    if (arg2.field1655 == 7) {
                        arg2.field1691 = arg2.field1597 * 115 - -((arg2.field1597 + -1) * arg2.field1569);
                    }
                } else {
                    arg2.field1691 = arg2.field1597 * 32 - -((arg2.field1597 - 1) * arg2.field1569);
                }
            }
        } else {
            arg2.field1691 = arg2.field1597;
        }
        int var6 = arg2.field1693;
        if (~arg2.field1584 != -1) {
            if (~arg2.field1584 != -2) {
                if (~arg2.field1584 != -3) {
                    if (~arg2.field1584 == -4) {
                        if (~arg2.field1655 == -3) {
                            arg2.field1693 = (arg2.field1626 + -1) * arg2.field1555 + arg2.field1626 * 32;
                        } else if (arg2.field1655 == 7) {
                            arg2.field1693 = arg2.field1626 * 12 - -((arg2.field1626 + -1) * arg2.field1555);
                        }
                    }
                } else {
                    arg2.field1693 = arg2.field1626 * arg0 >> 14;
                }
            } else {
                arg2.field1693 = -arg2.field1626 + arg0;
            }
        } else {
            arg2.field1693 = arg2.field1626;
        }
        if (arg2.field1644 == 4) {
            arg2.field1691 = arg2.field1693 * arg2.field1652 / arg2.field1673;
        }
        if (arg4 != -3) {
            field4063 = -39;
        }
        if (~arg2.field1584 == -5) {
            arg2.field1693 = arg2.field1691 * arg2.field1673 / arg2.field1652;
        }
        if (class178.field2891 && (~client.method1511(arg2).field350 != -1 || ~arg2.field1655 == -1)) {
            if (arg2.field1693 < 5 && ~arg2.field1691 > -6) {
                arg2.field1693 = 5;
                arg2.field1691 = 5;
            } else {
                if (arg2.field1693 <= 0) {
                    arg2.field1693 = 5;
                }
                if (arg2.field1691 <= 0) {
                    arg2.field1691 = 5;
                }
            }
        }
        if (arg2.field1716 == 1337) {
            class191.field3056 = arg2;
        }
        if (arg1 && arg2.field1586 != null) {
            if (~arg2.field1691 != ~var5 || ~arg2.field1693 != ~var6) {
                class173 var7 = new class173();
                var7.field2796 = arg2;
                var7.field2798 = arg2.field1586;
                class136.field2259.method363(102, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class254() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZBZI)V")
    private static final void method1661(boolean arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 > -63) {
            field4068 = null;
        }
        int var10002;
        for (int var4 = 0; ~var4 > ~class251.field4027; ++var4) {
            class275 var21 = class198.field3193[class134.field2250[var4]];
            if (var21 != null && var21.method376(-11127) && var21.field4439.method1799(0)) {
                int var22 = var21.method385((byte) 76);
                if (arg2) {
                    if (!var21.field4439.field4251) {
                        continue;
                    }
                } else if (var21.field4439.field4295 != arg0 || ~arg3 != -1 && ~arg3 != ~var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((127 & var21.field614) == 64 && (127 & var21.field613) == 64) {
                        int var29 = var21.field613 >> 7;
                        int var30 = var21.field614 >> 7;
                        if (~var30 <= -1 && ~var30 > -105 && ~var29 <= -1 && ~var29 > -105) {
                            var10002 = class161.field2616[var30][var29]++;
                        }
                    }
                } else if (((1 & var22) != 0 || ~(127 & var21.field614) == -1 && ~(127 & var21.field613) == -1) && (~(1 & var22) != -2 || ~(127 & var21.field614) == -65 && ~(var21.field613 & 127) == -65)) {
                    int var23 = var21.field614 - var22 * 64 >> 7;
                    int var24 = -(var22 * 64) + var21.field613 >> 7;
                    int var25 = var23 - -var21.method385((byte) 121);
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    int var26 = var24 + var21.method385((byte) 108);
                    if (~var24 > -1) {
                        var24 = 0;
                    }
                    if (~var26 < -105) {
                        var26 = 104;
                    }
                    for (int var27 = var23; var27 < var25; ++var27) {
                        for (int var28 = var24; var28 < var26; ++var28) {
                            var10002 = class161.field2616[var27][var28]++;
                        }
                    }
                }
            }
        }
        ++field4060;
        label201: for (int var5 = 0; ~var5 > ~class251.field4027; ++var5) {
            class275 var6 = class198.field3193[class134.field2250[var5]];
            long var7 = 536870912L | (long) class134.field2250[var5] << 32;
            if (var6 != null && var6.method376(-11127) && var6.field4439.method1799(0)) {
                int var9 = var6.method385((byte) 75);
                if (!arg2) {
                    if (var6.field4439.field4295 != arg0 || arg3 != 0 && arg3 != var9) {
                        continue;
                    }
                } else if (!var6.field4439.field4251) {
                    continue;
                }
                var6.field651 = true;
                if (var9 != 1) {
                    if (~(var9 & 1) == -1 && (var6.field614 & 127) == 0 && (127 & var6.field613) == 0 || ~(var9 & 1) == -2 && ~(127 & var6.field614) == -65 && (127 & var6.field613) == 64) {
                        int var10 = -(var9 * 64) + var6.field614 >> 7;
                        int var11 = var9 + var10;
                        int var12 = var6.field613 - var9 * 64 >> 7;
                        if (~var10 > -1) {
                            var10 = 0;
                        }
                        int var13 = var9 + var12;
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (~var12 > -1) {
                            var12 = 0;
                        }
                        if (~var13 < -105) {
                            var13 = 104;
                        }
                        boolean var14 = true;
                        for (int var15 = var10; var15 < var11; ++var15) {
                            for (int var18 = var12; ~var18 > ~var13; ++var18) {
                                if (class161.field2616[var15][var18] <= 1) {
                                    var14 = false;
                                    break;
                                }
                            }
                        }
                        if (var14) {
                            int var16 = var10;
                            while (true) {
                                if (~var16 <= ~var11) {
                                    continue label201;
                                }
                                for (int var17 = var12; var13 > var17; ++var17) {
                                    var10002 = class161.field2616[var16][var17]--;
                                }
                                ++var16;
                            }
                        }
                    }
                } else if (~(127 & var6.field614) == -65 && (var6.field613 & 127) == 64) {
                    int var19 = var6.field614 >> 7;
                    int var20 = var6.field613 >> 7;
                    if (~var19 > -1 || var19 >= 104 || var20 < 0 || ~var20 <= -105) {
                        continue;
                    }
                    if (~class161.field2616[var19][var20] < -2) {
                        var10002 = class161.field2616[var19][var20]--;
                        continue;
                    }
                }
                var6.field651 = false;
                if (!var6.field4439.field4282) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field643 = class220.method1461(var6.field614, class28.field336, var6.field613, 76);
                class147.method1004(class28.field336, var6.field614, var6.field613, var6.field643, (var9 + -1) * 64 + 60, var6, var6.field657, var7, var6.field616);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZII)V")
    public static final void method1662(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field4064;
        if (arg1 >= 91) {
            ++class23.field293;
            class290.method1942((byte) -67);
            if (!arg3) {
                class85.method608(true, 0);
                method1661(false, (byte) -116, true, 0);
                if (~class87.field1199 == -1) {
                    for (int var6 = 1; var6 <= 5; ++var6) {
                        method1661(false, (byte) -73, false, var6);
                        method1661(true, (byte) -99, false, var6);
                        class85.method608(true, var6);
                    }
                } else {
                    for (int var7 = 1; var7 <= 5; ++var7) {
                        class85.method608(true, var7);
                        method1661(false, (byte) -99, false, var7);
                        method1661(true, (byte) -75, false, var7);
                    }
                }
            } else {
                method1661(false, (byte) -111, false, 0);
            }
            if (!arg3) {
                class279.method1864(27726);
            }
            class150.method1015(0);
            if (class92.field1316 == 1) {
                int var8 = 2047 & (int) class121.field2039 - -class115.field1979;
                int var9 = (int) client.field3605;
                if (var9 < class138.field2280 / 256) {
                    var9 = class138.field2280 / 256;
                }
                if (class66.field944[4] && ~var9 > ~(class238.field3800[4] + 128)) {
                    var9 = class238.field3800[4] + 128;
                }
                class99.method708(class220.method1461(class197.field3179.field614, class28.field336, class197.field3179.field613, 24) - 50, var9 * 3 + 600, arg2, var8, class291.field4635, class140.field2296, var9, (byte) 3);
            } else if (class92.field1316 == 5) {
                class237.method1560((byte) -119, arg2);
            }
            int var10 = class44.field522;
            int var11 = class119.field2014;
            int var12 = class244.field3910;
            int var13 = class193.field3108;
            int var14 = class8.field119;
            for (int var15 = 0; ~var15 > -6; ++var15) {
                if (class66.field944[var15]) {
                    int var22 = (int) (Math.random() * (double) (class230.field3655[var15] * 2 - -1) - (double) class230.field3655[var15] + Math.sin((double) class164.field2666[var15] / 100.0D * (double) class196.field3162[var15]) * (double) class238.field3800[var15]);
                    if (var15 == 0) {
                        class44.field522 += var22;
                    }
                    if (var15 == 3) {
                        class244.field3910 = class244.field3910 - -var22 & 2047;
                    }
                    if (~var15 == -2) {
                        class193.field3108 += var22;
                    }
                    if (var15 == 2) {
                        class119.field2014 += var22;
                    }
                    if (~var15 == -5) {
                        class8.field119 += var22;
                        if (~class8.field119 > -129) {
                            class8.field119 = 128;
                        }
                        if (class8.field119 > 383) {
                            class8.field119 = 383;
                        }
                    }
                }
            }
            class283.method1895((byte) 83);
            class63.method494(arg5, arg0, arg4 + arg5, arg0 + arg2);
            class145.method997();
            if (class233.field3713 >= 0) {
                class190 var16 = class261.method1715((byte) -105, class233.field3713, class241.field3879, class230.field3661, class6.field70);
                var16.method1293(class236.field3778, arg5, arg0, arg4, arg2, class8.field119, class244.field3910, 0);
            } else {
                class63.method507(arg5, arg0, arg4, arg2, 0);
            }
            if (!class240.field3852 && ~class120.field2031 <= ~arg5 && ~(arg4 + arg5) < ~class120.field2031 && class104.field1752 >= arg0 && ~class104.field1752 > ~(arg0 - -arg2)) {
                class151.field2438 = true;
                int var17 = class246.field3953;
                class177.field2872 = 0;
                int var18 = class237.field3781;
                int var19 = class172.field2775;
                int var20 = class41.field490;
                class85.field1171 = (-arg0 + class104.field1752) * (-var18 + var20) / arg2 + var18;
                class154.field2488 = (-arg5 + class120.field2031) * (-var17 + var19) / arg4 - -var17;
            } else {
                class151.field2438 = false;
                class177.field2872 = 0;
            }
            class280.method1873((byte) -54);
            byte var21 = class220.method1463(0) != 2 ? 1 : (byte) class23.field293;
            class121.method849(class44.field522, class193.field3108, class119.field2014, class8.field119, class244.field3910, class243.field3894, class160.field2604, class164.field2664, class8.field110, class16.field186, class129.field2163, class28.field336 - -1, var21, class197.field3179.field614 >> 7, class197.field3179.field613 >> 7);
            class280.method1873((byte) -54);
            class184.method1261();
            class257.method1686(arg5, arg0, 256, arg2, -51, 256, arg4);
            class227.method1494(256, 256, (byte) 27, arg0, arg5, arg4, arg2);
            ((class185) class145.field2350).method1263(class221.field3524, 109);
            class57.method441(arg2, (byte) 93, arg4, arg0, arg5);
            class119.field2014 = var11;
            class244.field3910 = var12;
            class44.field522 = var10;
            class8.field119 = var14;
            class193.field3108 = var13;
            if (class9.field140 && class30.field374.method1393(256) == 0) {
                class9.field140 = false;
            }
            if (class9.field140) {
                class63.method507(arg5, arg0, arg4, arg2, 0);
                class157.method1059(0, class21.field256, false);
            }
            if (!arg3 && !class9.field140 && !class240.field3852 && arg5 <= class120.field2031 && arg4 + arg5 > class120.field2031 && class104.field1752 >= arg0 && ~(arg0 + arg2) < ~class104.field1752) {
                class26.method181(arg4, class120.field2031, arg5, 1, arg2, class104.field1752, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
    public static final void method1663(int arg0, int arg1) {
        class76.field1039.method1832(arg0, (byte) -110);
        class125.field2100.method1832(arg0, (byte) 107);
        if (arg1 != 9036) {
            field4068 = null;
        }
        ++field4057;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
    public static final void method1664(byte arg0) {
        class168.field2730.method1834(0);
        class263.field4165.method1834(0);
        ++field4058;
        if (arg0 >= -113) {
            field4063 = -28;
        }
    }
}

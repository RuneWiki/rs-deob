import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class687 extends class175 {

    @OriginalMember(owner = "client!jka", name = "H", descriptor = "I")
    public static int field9181 = 0;

    @OriginalMember(owner = "client!jka", name = "L", descriptor = "Lfga;")
    public static class269 field9184 = new class269();

    @OriginalMember(owner = "client!jka", name = "U", descriptor = "I")
    public static int field9192 = 52;

    @OriginalMember(owner = "client!jka", name = "T", descriptor = "Lmw;")
    public static class517 field9191 = new class517(84, -1);

    @OriginalMember(owner = "client!jka", name = "X", descriptor = "Ljb;")
    public static class519 field9195 = new class519(77, 4);

    @OriginalMember(owner = "client!jka", name = "E", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!jka", name = "G", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!jka", name = "I", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!jka", name = "J", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!jka", name = "N", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!jka", name = "O", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!jka", name = "P", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!jka", name = "Q", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!jka", name = "R", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!jka", name = "S", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!jka", name = "V", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!jka", name = "W", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!jka", name = "Y", descriptor = "Leb;")
    public static class651 field9196;

    @OriginalMember(owner = "client!jka", name = "g", descriptor = "(I)V")
    public static void method3764(int arg0) {
        field9191 = null;
        if (arg0 != 0) {
            field9184 = null;
        }
        field9195 = null;
        field9196 = null;
        field9184 = null;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field9193;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 >= -47) {
            this.method44(-103, (class254) null, true);
        }
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, arg0, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class598.field8136; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IILofa;I)V")
    public static final void method3765(int arg0, int arg1, class347 arg2, int arg3) {
        if (~arg2.field4886 == -1) {
            arg2.field4934 = arg2.field5032;
        } else if (~arg2.field4886 == -2) {
            arg2.field4934 = (-arg2.field4986 + arg3) / 2 + arg2.field5032;
        } else if (~arg2.field4886 == -3) {
            arg2.field4934 = -arg2.field5032 + arg3 - arg2.field4986;
        } else if (arg2.field4886 == 3) {
            arg2.field4934 = arg2.field5032 * arg3 >> 14;
        } else if (arg2.field4886 == 4) {
            arg2.field4934 = (arg2.field5032 * arg3 >> 14) + (-arg2.field4986 + arg3) / 2;
        } else {
            arg2.field4934 = -arg2.field4986 + arg3 + -(arg2.field5032 * arg3 >> 14);
        }
        if (~arg2.field4950 == -1) {
            arg2.field4887 = arg2.field5006;
        } else if (~arg2.field4950 != -2) {
            if (arg2.field4950 == 2) {
                arg2.field4887 = -arg2.field4940 + arg1 + -arg2.field5006;
            } else if (arg2.field4950 == 3) {
                arg2.field4887 = arg2.field5006 * arg1 >> 14;
            } else if (~arg2.field4950 == -5) {
                arg2.field4887 = (arg2.field5006 * arg1 >> 14) + (-arg2.field4940 + arg1) / 2;
            } else {
                arg2.field4887 = -arg2.field4940 + arg1 + -(arg2.field5006 * arg1 >> 14);
            }
        } else {
            arg2.field4887 = (-arg2.field4940 + arg1) / 2 + arg2.field5006;
        }
        if (arg0 >= 18) {
            ++field9183;
            if (class341.field4764) {
                if (~client.method2055(arg2).field4635 != -1 || arg2.field4884 == 0) {
                    if (arg2.field4934 >= 0) {
                        if (~arg3 > ~(arg2.field4934 - -arg2.field4986)) {
                            arg2.field4934 = arg3 - arg2.field4986;
                        }
                    } else {
                        arg2.field4934 = 0;
                    }
                    if (arg2.field4887 >= 0) {
                        if (arg1 < arg2.field4887 - -arg2.field4940) {
                            arg2.field4887 = arg1 - arg2.field4940;
                            return;
                        }
                    } else {
                        arg2.field4887 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jka", name = "h", descriptor = "(I)V")
    public static final void method3766(int arg0) {
        ++field9186;
        class99.field1446 = 0;
        int var1 = (class625.field8475.field2802 >> 9) + class120.field1625;
        if (arg0 != 3118) {
            method3765(56, 31, (class347) null, -42);
        }
        int var2 = (class625.field8475.field2810 >> 9) + class259.field3849;
        if (var1 >= 3053 && ~var1 >= -3157 && var2 >= 3056 && var2 <= 3136) {
            class99.field1446 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && ~var2 <= -9493 && ~var2 >= -9536) {
            class99.field1446 = 1;
        }
        if (class99.field1446 == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            class99.field1446 = 0;
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lha;Z)V")
    public static final void method3767(class66 arg0, boolean arg1) {
        ++field9185;
        class734.field9957 = class792.method4329(arg0, true, -39, class728.field9886);
        field9196 = class649.method3606(15, class728.field9886, arg0);
        class166.field2202 = class792.method4329(arg0, true, -114, class290.field4141);
        if (arg1) {
            method3764(3);
        }
        class355.field5157 = class649.method3606(102, class290.field4141, arg0);
        class88.field1251 = class792.method4329(arg0, true, -73, class125.field1720);
        class643.field8657 = class649.method3606(36, class125.field1720, arg0);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(II)V")
    public static final void method3768(int arg0, int arg1) {
        ++field9179;
        class778 var2 = class389.method2406(-126, (long) arg1, 1);
        var2.method4276(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field9182;
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int[] var4 = this.method1202(arg1, -1150480797, 0);
            for (int var5 = 0; var5 < class598.field8136; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!jka", name = "i", descriptor = "(I)V")
    public static final void method3769(int arg0) {
        ++field9188;
        if (~class733.field9917 != -1 && class733.field9917 != 5) {
            try {
                short var1;
                if (class624.field8417 != 0) {
                    var1 = 2000;
                } else {
                    var1 = 250;
                }
                if (++class528.field7308 > var1) {
                    if (class710.field9707 != null) {
                        class710.field9707.method138(arg0 ^ -123);
                        class710.field9707 = null;
                    }
                    if (class624.field8417 >= 3) {
                        class733.field9917 = 0;
                        class623.method3439(-5, 106);
                        return;
                    }
                    if (class159.field2142 == 2) {
                        class102.field1464.method3734(374);
                    } else {
                        class394.field5678.method3734(374);
                    }
                    class528.field7308 = 0;
                    ++class624.field8417;
                    class733.field9917 = 1;
                }
                if (~class733.field9917 == -2) {
                    if (class159.field2142 != 2) {
                        class501.field7032 = class394.field5678.method3736(class786.field10800, (byte) -10);
                    } else {
                        class501.field7032 = class102.field1464.method3736(class786.field10800, (byte) -10);
                    }
                    class733.field9917 = 2;
                }
                if (~class733.field9917 == -3) {
                    if (~class501.field7032.field8405 == -3) {
                        throw new IOException();
                    }
                    if (class501.field7032.field8405 != 1) {
                        return;
                    }
                    class710.field9707 = class608.method3384(arg0 ^ -25122, 15000, (Socket) class501.field7032.field8403);
                    class501.field7032 = null;
                    class220.method1405((byte) 127);
                    class43 var2 = class711.method3943((byte) 65);
                    var2.field457.method1725(class377.field5493.field5208, 125);
                    class409.method2457((byte) -100, var2);
                    class345.method2186((byte) 126);
                    class733.field9917 = 3;
                }
                if (class733.field9917 == 3) {
                    if (!class710.field9707.method133((byte) 77, 1)) {
                        return;
                    }
                    class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
                    int var3 = class560.field7678.field3789[0] & 255;
                    if (~var3 != -1) {
                        class733.field9917 = 0;
                        class623.method3439(var3, 68);
                        class710.field9707.method138(-36);
                        class710.field9707 = null;
                        class145.method1014(false);
                        return;
                    }
                    class560.field7678.field3725 = 0;
                    class254 var4 = new class254(518);
                    int[] var5 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()) };
                    var4.method1725(10, arg0 ^ 69);
                    var4.method1686(92, var5[0]);
                    var4.method1686(-53, var5[1]);
                    var4.method1686(42, var5[2]);
                    var4.method1686(85, var5[3]);
                    var4.method1670(63, 0L);
                    var4.method1678(class669.field8960, (byte) 80);
                    var4.method1670(arg0 ^ 86, class128.field1768);
                    var4.method1670(61, class628.field8513);
                    var4.method1727(class784.field10781, (byte) 59, class85.field1205);
                    class220.method1405((byte) 127);
                    class43 var6 = class711.method3943((byte) 121);
                    class459 var7 = var6.field457;
                    if (~class159.field2142 != -3) {
                        var7.method1725(class377.field5500.field5208, 31);
                        var7.method1733(0, arg0 ^ -32453);
                        int var8 = var7.field3725;
                        var7.method1686(64, 645);
                        var7.method1716(var4.field3789, var4.field3725, 0, true);
                        int var9 = var7.field3725;
                        var7.method1678(class115.field1558, (byte) 119);
                        var7.method1725(class426.field6204.field3879, 40);
                        var7.method1725(class55.field647, 115);
                        class139.method962(var7, 24);
                        var7.method1678(class33.field317, (byte) 89);
                        var7.method1686(80, class416.field6007);
                        class104.method796(var7, (byte) 39);
                        var7.method1717(var7.field3725, 16101, var5, var9);
                        var7.method1700(var7.field3725 - var8, 75);
                    } else {
                        if (class780.field10712 == 13) {
                            var7.method1725(class377.field5499.field5208, arg0 ^ 124);
                        } else {
                            var7.method1725(class377.field5497.field5208, 90);
                        }
                        var7.method1733(0, -32466);
                        int var10 = var7.field3725;
                        var7.method1686(-48, 645);
                        var7.method1716(var4.field3789, var4.field3725, 0, true);
                        int var11 = var7.field3725;
                        var7.method1678(class115.field1558, (byte) 112);
                        var7.method1725(class340.field4758, 54);
                        var7.method1725(class164.method1133(-15388), 84);
                        var7.method1733(class460.field6558, -32466);
                        var7.method1733(class693.field9222, -32466);
                        var7.method1725(class125.field1721.field5184.method335(43), 84);
                        class139.method962(var7, 24);
                        var7.method1678(class33.field317, (byte) 84);
                        var7.method1686(-82, class416.field6007);
                        class254 var12 = class125.field1721.method2251(false);
                        var7.method1725(var12.field3725, 73);
                        var7.method1716(var12.field3789, var12.field3725, 0, true);
                        class180.field2362 = true;
                        class254 var13 = new class254(class706.field9663.method4047(arg0 + -22));
                        class706.field9663.method4049((byte) 116, var13);
                        var7.method1716(var13.field3789, var13.field3789.length, 0, true);
                        var7.method1733(class442.field6364, arg0 ^ -32453);
                        var7.method1670(119, class786.field10799);
                        var7.method1725(class628.field8500 != null ? 1 : 0, 57);
                        if (class628.field8500 != null) {
                            var7.method1678(class628.field8500, (byte) 75);
                        }
                        var7.method1725(!class546.method3146("jagtheora", (byte) 30) ? 0 : 1, 100);
                        var7.method1725(class273.field3971 ? 1 : 0, 79);
                        class104.method796(var7, (byte) 39);
                        var7.method1717(var7.field3725, 16101, var5, var11);
                        var7.method1700(-var10 + var7.field3725, 61);
                    }
                    class409.method2457((byte) -100, var6);
                    class345.method2186((byte) 126);
                    class73.field983 = new class780(var5);
                    for (int var14 = 0; var14 < 4; ++var14) {
                        var5[var14] += 50;
                    }
                    class560.field7678.method2727(var5, 25618);
                    class733.field9917 = 4;
                }
                if (class733.field9917 == 4) {
                    if (!class710.field9707.method133((byte) 77, 1)) {
                        return;
                    }
                    class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
                    int var15 = class560.field7678.field3789[0] & 255;
                    if (~var15 == -22) {
                        class733.field9917 = 7;
                    } else if (var15 != 29) {
                        if (~var15 == -2) {
                            class733.field9917 = 5;
                            class623.method3439(var15, 81);
                            return;
                        }
                        if (var15 != 2) {
                            if (var15 != 15) {
                                if (~var15 == -24 && ~class624.field8417 > -4) {
                                    class528.field7308 = 0;
                                    class733.field9917 = 1;
                                    ++class624.field8417;
                                    class710.field9707.method138(-103);
                                    class710.field9707 = null;
                                    return;
                                }
                                class733.field9917 = 0;
                                class623.method3439(var15, 108);
                                class710.field9707.method138(-27);
                                class710.field9707 = null;
                                class145.method1014(false);
                                return;
                            }
                            class733.field9917 = 14;
                            class442.field6366 = -2;
                        } else {
                            class733.field9917 = 8;
                        }
                    } else {
                        class733.field9917 = 13;
                    }
                }
                if (~class733.field9917 == -7) {
                    class220.method1405((byte) 127);
                    class43 var16 = class711.method3943((byte) 16);
                    class459 var17 = var16.field457;
                    var17.method2716(class73.field983, -3551);
                    var17.method2723((byte) -92, class377.field5504.field5208);
                    class409.method2457((byte) -100, var16);
                    class345.method2186((byte) 127);
                    class733.field9917 = 4;
                } else if (class733.field9917 == 7) {
                    if (class710.field9707.method133((byte) 77, 1)) {
                        class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
                        int var18 = 255 & class560.field7678.field3789[0];
                        class733.field9917 = 0;
                        field9181 = var18 * 50;
                        class623.method3439(21, 109);
                        class710.field9707.method138(-27);
                        class710.field9707 = null;
                        class145.method1014(false);
                    }
                } else if (~class733.field9917 == -14) {
                    if (class710.field9707.method133((byte) 77, 1)) {
                        class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
                        class544.field7525 = class560.field7678.field3789[0] & 255;
                        class733.field9917 = 0;
                        class623.method3439(29, 68);
                        class710.field9707.method138(-78);
                        class710.field9707 = null;
                        class145.method1014(false);
                    }
                } else if (~class733.field9917 == -9) {
                    if (class710.field9707.method133((byte) 77, 1)) {
                        class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
                        class733.field9917 = 9;
                        class299.field4220 = 255 & class560.field7678.field3789[0];
                    }
                } else {
                    if (arg0 != 21) {
                        field9184 = null;
                    }
                    if (class733.field9917 == 9) {
                        class459 var19 = class560.field7678;
                        if (class159.field2142 == 2) {
                            if (!class710.field9707.method133((byte) 77, class299.field4220)) {
                                return;
                            }
                            class710.field9707.method135((byte) -74, class299.field4220, var19.field3789, 0);
                            var19.field3725 = 0;
                            class479.field6726 = var19.method1731((byte) 64);
                            class787.field10804 = var19.method1731((byte) 64);
                            class564.field7727 = ~var19.method1731((byte) 64) == -2;
                            class405.field5751 = var19.method1731((byte) 64) == 1;
                            class24.field247 = var19.method1731((byte) 64) == 1;
                            class704.field9640 = var19.method1731((byte) 64) == 1;
                            class349.field5065 = var19.method1728((byte) 125);
                            class254.field3755 = ~var19.method1731((byte) 64) == -2;
                            class754.field10208 = var19.method1689((byte) 117);
                            class86.field1212 = ~var19.method1731((byte) 64) == -2;
                            class210.field2705.method1368(class86.field1212, 30);
                            class16.field156.method2122(true, class86.field1212);
                            class107.field1507.method3582((byte) 103, class86.field1212);
                        } else {
                            if (!class710.field9707.method133((byte) 77, class299.field4220)) {
                                return;
                            }
                            class710.field9707.method135((byte) -74, class299.field4220, var19.field3789, 0);
                            var19.field3725 = 0;
                            class479.field6726 = var19.method1731((byte) 64);
                            class787.field10804 = var19.method1731((byte) 64);
                            class564.field7727 = var19.method1731((byte) 64) == 1;
                            class405.field5751 = ~var19.method1731((byte) 64) == -2;
                            class24.field247 = var19.method1731((byte) 64) == 1;
                            class778.field10686 = var19.method1723(21795);
                            class390.field5643 = class778.field10686 - class401.method2440(false) - var19.method1738(-1);
                            int var20 = var19.method1731((byte) 64);
                            class439.field6325 = ~(var20 & 2) != -1;
                            class254.field3755 = ~(1 & var20) != -1;
                            class148.field1993 = var19.method1672(-16516);
                            class250.field3454 = var19.method1728((byte) 48);
                            class505.field7091 = var19.method1728((byte) 49);
                            class292.field4159 = var19.method1728((byte) 119);
                            class4.field31 = var19.method1672(-16516);
                            class529.field7309 = class786.field10800.method1543((byte) -10, class4.field31);
                            class614.field8307 = var19.method1731((byte) 64);
                            class2.field23 = var19.method1728((byte) 21);
                            class689.field9215 = var19.method1728((byte) 127);
                            class408.field5764 = var19.method1731((byte) 64) == 1;
                            class625.field8475.field10367 = class625.field8475.field10354 = class399.field5717 = var19.method1705((byte) 85);
                            class92.field1292 = var19.method1731((byte) 64);
                            class409.field5790 = var19.method1672(-16516);
                            class401.field5727 = ~var19.method1731((byte) 64) == -2;
                            class571.field7776 = new class680();
                            class571.field7776.field9099 = var19.method1728((byte) 48);
                            if (class571.field7776.field9099 == 65535) {
                                class571.field7776.field9099 = -1;
                            }
                            class571.field7776.field9101 = var19.method1705((byte) 41);
                            if (class554.field7645 != class222.field2884) {
                                class571.field7776.field9102 = class571.field7776.field9099 + 40000;
                                class571.field7776.field9095 = class571.field7776.field9099 + 50000;
                            }
                            if (class554.field7645 != class135.field1836 && (class720.field9788 != class554.field7645 || class479.field6726 < 2) && (class102.field1464.method3738(-1, class356.field5196) || class102.field1464.method3738(-1, class168.field2215))) {
                                class503.method2939(false);
                            }
                        }
                        if ((!class564.field7727 || class24.field247) && !class254.field3755) {
                            try {
                                class376.method2358(class552.field7624, 3860, "unzap");
                            } catch (Throwable var26) {
                            }
                        } else {
                            try {
                                class376.method2358(class552.field7624, arg0 ^ 3841, "zap");
                            } catch (Throwable var27) {
                                if (class692.field9219) {
                                    try {
                                        class552.field7624.getAppletContext().showDocument(new URL(class552.field7624.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var25) {
                                    }
                                }
                            }
                        }
                        if (class554.field7645 == class222.field2884) {
                            try {
                                class376.method2358(class552.field7624, 3860, "loggedin");
                            } catch (Throwable var24) {
                            }
                        }
                        if (class159.field2142 != 2) {
                            class733.field9917 = 0;
                            class623.method3439(2, 98);
                            class784.method4302((byte) 115);
                            class170.method1148(7, -11239);
                            class571.field7775 = null;
                            return;
                        }
                        class733.field9917 = 11;
                    }
                    if (~class733.field9917 == -12) {
                        if (!class710.field9707.method133((byte) 77, 3)) {
                            return;
                        }
                        class710.field9707.method135((byte) -74, 3, class560.field7678.field3789, 0);
                        class733.field9917 = 12;
                    }
                    if (~class733.field9917 == -13) {
                        class459 var21 = class560.field7678;
                        var21.field3725 = 0;
                        if (var21.method2725((byte) -72)) {
                            if (!class710.field9707.method133((byte) 77, 1)) {
                                return;
                            }
                            class710.field9707.method135((byte) -74, 1, var21.field3789, 3);
                        }
                        class571.field7775 = class384.method2387(-21565)[var21.method2719((byte) -61)];
                        class442.field6366 = var21.method1728((byte) 26);
                        class733.field9917 = 10;
                    }
                    if (class733.field9917 == 10) {
                        if (class710.field9707.method133((byte) 77, class442.field6366)) {
                            class710.field9707.method135((byte) -74, class442.field6366, class560.field7678.field3789, 0);
                            class560.field7678.field3725 = 0;
                            int var22 = class442.field6366;
                            class733.field9917 = 0;
                            class623.method3439(2, arg0 + 101);
                            class415.method2503((byte) 83);
                            class647.method3593((byte) 94, class560.field7678);
                            class759.field10402 = -1;
                            if (class571.field7775 != class122.field1689) {
                                class657.method3650(100);
                            } else {
                                class192.method1270((byte) -53);
                            }
                            if (class560.field7678.field3725 != var22) {
                                throw new RuntimeException("lswp pos:" + class560.field7678.field3725 + " psize:" + var22);
                            } else {
                                class571.field7775 = null;
                            }
                        }
                    } else if (class733.field9917 == 14) {
                        if (class442.field6366 == -2) {
                            if (!class710.field9707.method133((byte) 77, 2)) {
                                return;
                            }
                            class710.field9707.method135((byte) -74, 2, class560.field7678.field3789, 0);
                            class560.field7678.field3725 = 0;
                            class442.field6366 = class560.field7678.method1728((byte) 25);
                        }
                        if (class710.field9707.method133((byte) 77, class442.field6366)) {
                            class710.field9707.method135((byte) -74, class442.field6366, class560.field7678.field3789, 0);
                            class560.field7678.field3725 = 0;
                            class733.field9917 = 0;
                            int var23 = class442.field6366;
                            class623.method3439(15, 118);
                            class716.method3962(true);
                            class647.method3593((byte) 94, class560.field7678);
                            if (class560.field7678.field3725 != var23) {
                                throw new RuntimeException("lswpr pos:" + class560.field7678.field3725 + " psize:" + var23);
                            } else {
                                class571.field7775 = null;
                            }
                        }
                    }
                }
            } catch (IOException var28) {
                if (class710.field9707 != null) {
                    class710.field9707.method138(-53);
                    class710.field9707 = null;
                }
                if (class624.field8417 < 3) {
                    if (class159.field2142 == 2) {
                        class102.field1464.method3734(arg0 + 353);
                    } else {
                        class394.field5678.method3734(374);
                    }
                    class528.field7308 = 0;
                    ++class624.field8417;
                    class733.field9917 = 1;
                } else {
                    class733.field9917 = 0;
                    class623.method3439(-4, 121);
                    class145.method1014(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "()V")
    public class687() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lnga;I)Llda;")
    public static final class511 method3770(class539 arg0, int arg1) {
        ++field9190;
        class511 var2;
        if (class68.field951 == null) {
            var2 = new class511();
        } else {
            var2 = class68.field951;
            class68.field951 = class68.field951.field7127;
            --class641.field8645;
            var2.field7127 = null;
        }
        var2.field7126 = arg0;
        if (arg1 >= -6) {
            field9196 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lgt;B)V")
    public static final void method3771(class480 arg0, byte arg1) {
        arg0.field6739 = null;
        if (arg1 != 67) {
            method3772((byte) 83);
        }
        ++field9187;
        if (~class779.field10697 > -21) {
            class485.field6774.method2188((byte) 31, arg0);
            ++class779.field10697;
        }
    }

    @OriginalMember(owner = "client!jka", name = "c", descriptor = "(B)Ljava/lang/String;")
    public static final String method3772(byte arg0) {
        ++field9180;
        String var1 = "www";
        if (arg0 != -107) {
            method3768(-64, 60);
        }
        if (class740.field10026 == class554.field7645) {
            var1 = "www-wtrc";
        } else if (class720.field9788 != class554.field7645) {
            if (class554.field7645 == class416.field6001) {
                var1 = "www-wtwip";
            }
        } else {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class33.field317 != null) {
            var2 = "/p=" + class33.field317;
        }
        return "http://" + var1 + "." + class426.field6204.field3876 + ".com/l=" + class55.field647 + "/a=" + class416.field6007 + var2 + "/";
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (~arg0 == -1) {
            super.field2305 = ~arg1.method1731((byte) 64) == -2;
        }
        ++field9189;
        if (arg2) {
            method3764(-34);
        }
    }
}

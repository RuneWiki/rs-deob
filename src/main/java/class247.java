import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class247 extends class68 {

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    private int field3789 = 32768;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field3781 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field3792 = -1;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lvd;")
    public static class4 field3784 = new class4(512);

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lfb;")
    public static class30 field3793 = new class30(0, 0);

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    public static int field3794 = 0;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "[I")
    public static int[] field3788;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class247() {
        super(3, false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field3786;
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    super.field926 = ~arg0.method1453((byte) -127) == -2;
                }
            } else {
                this.field3789 = arg0.method1445(false) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        class250.method1674(true);
        if (arg0 < -18) {
            ++field3785;
        }
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)V")
    public static void method1662(byte arg0) {
        if (arg0 <= -103) {
            field3793 = null;
            field3788 = null;
            field3784 = null;
            field3781 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
    public static final void method1663(byte arg0, int arg1) {
        ++field3783;
        if (~arg1 <= -1) {
            int var2 = class219.field3299[arg1];
            int var3 = class144.field2001[arg1];
            int var4 = class221.field3306[arg1];
            long var5 = class278.field4316[arg1];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            int var7 = (int) class278.field4316[arg1];
            if (var4 == 57) {
                class88 var8 = class154.field2133[var7];
                if (var8 != null) {
                    ++class256.field3918;
                    class281.field4347 = 2;
                    class21.field295 = 0;
                    class172.field2384 = class27.field344;
                    class74.field1038 = class81.field1112;
                    class281.field4359.method1864(161, (byte) -69);
                    class281.field4359.method1488(var7, -53);
                    class281.field4359.method1463(8, class93.field1306);
                    class281.field4359.method1487(false, !class138.field1928[82] ? 0 : 1);
                    class281.field4359.method1488(class144.field1998, -47);
                }
            }
            if (~var4 == -48) {
                ++class123.field1711;
                class281.field4359.method1864(253, (byte) -69);
                class281.field4359.method1470(393660232, var2);
                class281.field4359.method1436(var3, -118);
                class281.field4359.method1440(var7, (byte) -116);
                class124.field1743 = 0;
                class17.field183 = class67.method421(var3, arg0 ^ -110);
                class222.field3332 = var2;
            }
            if (~var4 == -6) {
                class140 var9 = class119.field1679[var7];
                if (var9 != null) {
                    class172.field2384 = class27.field344;
                    class21.field295 = 0;
                    class281.field4347 = 2;
                    ++class206.field2866;
                    class74.field1038 = class81.field1112;
                    class281.field4359.method1864(251, (byte) -69);
                    class281.field4359.method1477(class203.field2833, arg0 + 49);
                    class281.field4359.method1488(class156.field2172, -112);
                    class281.field4359.method1487(false, class138.field1928[82] ? 1 : 0);
                    class281.field4359.method1440(var7, (byte) -108);
                    class281.field4359.method1463(8, class76.field1061);
                }
            }
            if (~var4 == -1002) {
                ++class269.field4112;
                class172.field2384 = class27.field344;
                class281.field4347 = 2;
                class74.field1038 = class81.field1112;
                class21.field295 = 0;
                class281.field4359.method1864(193, (byte) -69);
                class281.field4359.method1440(var7, (byte) -96);
            }
            if (~var4 == -7) {
                class140 var10 = class119.field1679[var7];
                if (var10 != null) {
                    class74.field1038 = class81.field1112;
                    class281.field4347 = 2;
                    class21.field295 = 0;
                    class172.field2384 = class27.field344;
                    class281.field4359.method1864(88, (byte) -69);
                    class281.field4359.method1477(var7, -61);
                    class281.field4359.method1447(class138.field1928[82] ? 1 : 0, arg0 ^ -17363582);
                    ++class136.field1902;
                }
            }
            if (~var4 == -24) {
                ++class180.field2517;
                class281.field4359.method1864(191, (byte) -69);
                class281.field4359.method1436(var3, 114);
                class281.field4359.method1470(393660232, var7);
                class281.field4359.method1463(arg0 + 118, class93.field1306);
                class281.field4359.method1477(class144.field1998, -61);
                class281.field4359.method1488(var2, -58);
                class124.field1743 = 0;
                class17.field183 = class67.method421(var3, 0);
                class222.field3332 = var2;
            }
            if (~var4 == -11) {
                class281.field4347 = 2;
                class172.field2384 = class27.field344;
                class21.field295 = 0;
                class74.field1038 = class81.field1112;
                class281.field4359.method1864(234, (byte) -69);
                ++class124.field1740;
                class281.field4359.method1488(class216.field3255 + var3, arg0 + -17);
                class281.field4359.method1477(var2 - -class37.field565, arg0 ^ 81);
                class281.field4359.method1447(!class138.field1928[82] ? 0 : 1, arg0 + 17363582);
                class281.field4359.method1440(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -105);
            }
            if (var4 == 50) {
                class211 var11 = class168.method1099(0, var2, var3);
                if (var11 != null) {
                    class136.method923(arg0 + 61);
                    class203 var12 = client.method1040(var11);
                    class93.method607(var12.field2825, var11.field3048, var3, var12.method1290((byte) 109), -31990, var11.field3170, var2);
                    class141.field1963 = 0;
                    class168.field2332 = class29.method194(0, var11);
                    if (class168.field2332 == null) {
                        class168.field2332 = "Null";
                    }
                    if (!var11.field3011) {
                        class54.field791 = "<col=00ff00>" + var11.field3111 + "<col=ffffff>";
                        return;
                    }
                    class54.field791 = var11.field3107 + "<col=ffffff>";
                }
            } else {
                if (var4 == 30) {
                    class88 var13 = class154.field2133[var7];
                    if (var13 != null) {
                        class21.field295 = 0;
                        class281.field4347 = 2;
                        class172.field2384 = class27.field344;
                        class74.field1038 = class81.field1112;
                        ++class9.field82;
                        class281.field4359.method1864(0, (byte) -69);
                        class281.field4359.method1440(var7, (byte) -116);
                        class281.field4359.method1447(class138.field1928[82] ? 1 : 0, 17363472);
                    }
                }
                if (~var4 == -39) {
                    class281.field4359.method1864(68, (byte) -69);
                    class281.field4359.method1435(-91, var3);
                    ++class108.field1506;
                    class211 var14 = class67.method421(var3, arg0 + 110);
                    if (var14.field3019 != null && var14.field3019[0][0] == 5) {
                        int var15 = var14.field3019[0][1];
                        class120.field1688[var15] = -class120.field1688[var15] + 1;
                        class278.method1858(-8, var15);
                    }
                }
                if (var4 == 35) {
                    class281.field4359.method1864(105, (byte) -69);
                    class281.field4359.method1488(var2, arg0 ^ 11);
                    class281.field4359.method1489(65280, var3);
                    class281.field4359.method1470(arg0 ^ -393660198, var7);
                    class124.field1743 = 0;
                    ++class110.field1537;
                    class17.field183 = class67.method421(var3, 0);
                    class222.field3332 = var2;
                }
                if (~var4 == -15) {
                    class88 var16 = class154.field2133[var7];
                    if (var16 != null) {
                        class21.field295 = 0;
                        ++class216.field3258;
                        class172.field2384 = class27.field344;
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        class281.field4359.method1864(216, (byte) -69);
                        class281.field4359.method1447(!class138.field1928[82] ? 0 : 1, 17363472);
                        class281.field4359.method1470(393660232, var7);
                    }
                }
                if (~var4 == -43) {
                    class140 var17 = class119.field1679[var7];
                    if (var17 != null) {
                        ++class221.field3307;
                        class21.field295 = 0;
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        class172.field2384 = class27.field344;
                        class281.field4359.method1864(218, (byte) -69);
                        class281.field4359.method1488(var7, arg0 ^ 30);
                        class281.field4359.method1447(!class138.field1928[82] ? 0 : 1, 17363472);
                    }
                }
                if (var4 == 32) {
                    ++class241.field3691;
                    class281.field4347 = 2;
                    class74.field1038 = class81.field1112;
                    class172.field2384 = class27.field344;
                    class21.field295 = 0;
                    class281.field4359.method1864(13, (byte) -69);
                    class281.field4359.method1480(!class138.field1928[82] ? 0 : 1, (byte) -53);
                    class281.field4359.method1477(class216.field3255 + var3, -61);
                    class281.field4359.method1477(Integer.MAX_VALUE & (int) (var5 >>> 32), arg0 + 49);
                    class281.field4359.method1477(class37.field565 + var2, -61);
                }
                if (~var4 == -50) {
                    if (var7 == 0) {
                        class96.field1355 = 1;
                        class280.method1874(class295.field4642, var2, var3);
                    } else if (class229.field3470 > 0 && class138.field1928[82] && class138.field1928[81]) {
                        class273.method1824(class216.field3255 + var3, class37.field565 + var2, 50, class295.field4642);
                    } else {
                        ++class92.field1280;
                        class281.field4359.method1864(96, (byte) -69);
                        class281.field4359.method1470(393660232, class216.field3255 + var3);
                        class281.field4359.method1440(class37.field565 + var2, (byte) -99);
                    }
                }
                if (~var4 == -38) {
                    class140 var18 = class119.field1679[var7];
                    if (var18 != null) {
                        ++class17.field177;
                        class74.field1038 = class81.field1112;
                        class21.field295 = 0;
                        class281.field4347 = 2;
                        class172.field2384 = class27.field344;
                        class281.field4359.method1864(190, (byte) -69);
                        class281.field4359.method1470(393660232, var7);
                        class281.field4359.method1487(false, !class138.field1928[82] ? 0 : 1);
                    }
                }
                if (var4 == 43) {
                    if (var7 == 0) {
                        class54.field781 = 1;
                        class280.method1874(class295.field4642, var2, var3);
                    } else if (~var7 == -2) {
                        ++class27.field355;
                        class281.field4359.method1864(5, (byte) -69);
                        class281.field4359.method1477(class37.field565 + var2, -61);
                        class281.field4359.method1489(65280, class93.field1306);
                        class281.field4359.method1477(class216.field3255 + var3, arg0 ^ 81);
                        class281.field4359.method1488(class144.field1998, arg0 + 24);
                    }
                }
                if (var4 == 2) {
                    class74.field1038 = class81.field1112;
                    class21.field295 = 0;
                    ++class249.field3814;
                    class172.field2384 = class27.field344;
                    class281.field4347 = 2;
                    class281.field4359.method1864(237, (byte) -69);
                    class281.field4359.method1488(class216.field3255 + var3, -111);
                    class281.field4359.method1480(!class138.field1928[82] ? 0 : 1, (byte) -53);
                    class281.field4359.method1477(class37.field565 + var2, -61);
                    class281.field4359.method1488(Integer.MAX_VALUE & (int) (var5 >>> 32), arg0 ^ 23);
                }
                if (var4 == 12) {
                    class140 var19 = class119.field1679[var7];
                    if (var19 != null) {
                        class172.field2384 = class27.field344;
                        class74.field1038 = class81.field1112;
                        class281.field4347 = 2;
                        class21.field295 = 0;
                        ++class214.field3214;
                        class281.field4359.method1864(233, (byte) -69);
                        class281.field4359.method1470(393660232, var7);
                        class281.field4359.method1487(false, !class138.field1928[82] ? 0 : 1);
                    }
                }
                if (~var4 == -5) {
                    class88 var20 = class154.field2133[var7];
                    if (var20 != null) {
                        class21.field295 = 0;
                        class74.field1038 = class81.field1112;
                        ++class167.field2302;
                        class172.field2384 = class27.field344;
                        class281.field4347 = 2;
                        class281.field4359.method1864(12, (byte) -69);
                        class281.field4359.method1470(arg0 ^ -393660198, var7);
                        class281.field4359.method1480(class138.field1928[82] ? 1 : 0, (byte) -53);
                    }
                }
                if (~var4 == -46) {
                    class140 var21 = class119.field1679[var7];
                    if (var21 != null) {
                        class281.field4347 = 2;
                        class21.field295 = 0;
                        ++class53.field767;
                        class74.field1038 = class81.field1112;
                        class172.field2384 = class27.field344;
                        class281.field4359.method1864(217, (byte) -69);
                        class281.field4359.method1487(false, !class138.field1928[82] ? 0 : 1);
                        class281.field4359.method1440(var7, (byte) -121);
                    }
                }
                if (~var4 == -34) {
                    ++class108.field1506;
                    class281.field4359.method1864(68, (byte) -69);
                    class281.field4359.method1435(arg0 ^ 14, var3);
                    class211 var22 = class67.method421(var3, arg0 ^ -110);
                    if (var22.field3019 != null && ~var22.field3019[0][0] == -6) {
                        int var23 = var22.field3019[0][1];
                        if (class120.field1688[var23] != var22.field3117[0]) {
                            class120.field1688[var23] = var22.field3117[0];
                            class278.method1858(-8, var23);
                        }
                    }
                }
                if (var4 == 7) {
                    class297.method1985(-1);
                }
                if (~var4 == -1005) {
                    class281.field4347 = 2;
                    class21.field295 = 0;
                    class74.field1038 = class81.field1112;
                    class172.field2384 = class27.field344;
                    class281.field4359.method1864(242, (byte) -69);
                    class281.field4359.method1470(393660232, var7);
                    ++class50.field723;
                }
                if (~var4 == -2) {
                    ++class173.field2402;
                    class281.field4359.method1864(94, (byte) -69);
                    class281.field4359.method1470(arg0 ^ -393660198, var7);
                    class281.field4359.method1435(-102, var3);
                    class281.field4359.method1488(var2, -115);
                    class124.field1743 = 0;
                    class17.field183 = class67.method421(var3, 0);
                    class222.field3332 = var2;
                }
                if (var4 == 1003) {
                    class211 var24 = class67.method421(var3, 0);
                    if (var24 != null && var24.field3005[var2] >= 100000) {
                        class283.method1900("", var24.field3005[var2] + " x " + class73.method463(var7, -31104).field437, 0, true);
                    } else {
                        ++class50.field723;
                        class281.field4359.method1864(242, (byte) -69);
                        class281.field4359.method1470(393660232, var7);
                    }
                    class124.field1743 = 0;
                    class17.field183 = class67.method421(var3, 0);
                    class222.field3332 = var2;
                }
                if (var4 == 3) {
                    class281.field4359.method1864(175, (byte) -69);
                    ++class56.field801;
                    class281.field4359.method1488(var7, -59);
                    class281.field4359.method1489(65280, var3);
                    class281.field4359.method1488(var2, -50);
                    class124.field1743 = 0;
                    class17.field183 = class67.method421(var3, arg0 + 110);
                    class222.field3332 = var2;
                }
                if (~var4 == -16) {
                    class281.field4347 = 2;
                    ++class8.field74;
                    class21.field295 = 0;
                    class74.field1038 = class81.field1112;
                    class172.field2384 = class27.field344;
                    class281.field4359.method1864(224, (byte) -69);
                    class281.field4359.method1477(class156.field2172, -61);
                    class281.field4359.method1435(-118, class76.field1061);
                    class281.field4359.method1477(class216.field3255 + var3, -61);
                    class281.field4359.method1487(false, class138.field1928[82] ? 1 : 0);
                    class281.field4359.method1477(Integer.MAX_VALUE & (int) (var5 >>> 32), -61);
                    class281.field4359.method1488(class37.field565 + var2, -121);
                    class281.field4359.method1488(class203.field2833, -71);
                }
                if (~var4 == -30) {
                    class88 var25 = class154.field2133[var7];
                    if (var25 != null) {
                        class172.field2384 = class27.field344;
                        class74.field1038 = class81.field1112;
                        ++class234.field3536;
                        class281.field4347 = 2;
                        class21.field295 = 0;
                        class281.field4359.method1864(238, (byte) -69);
                        class281.field4359.method1487(false, !class138.field1928[82] ? 0 : 1);
                        class281.field4359.method1477(var7, -61);
                    }
                }
                if (var4 == 21) {
                    class140 var26 = class119.field1679[var7];
                    if (var26 != null) {
                        class21.field295 = 0;
                        class172.field2384 = class27.field344;
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        ++class225.field3425;
                        class281.field4359.method1864(249, (byte) -69);
                        class281.field4359.method1470(393660232, var7);
                        class281.field4359.method1470(393660232, class144.field1998);
                        class281.field4359.method1463(arg0 ^ -102, class93.field1306);
                        class281.field4359.method1447(!class138.field1928[82] ? 0 : 1, 17363472);
                    }
                }
                if (~var4 == -21) {
                    class74.field1038 = class81.field1112;
                    class172.field2384 = class27.field344;
                    class21.field295 = 0;
                    class281.field4347 = 2;
                    ++class193.field2665;
                    class281.field4359.method1864(143, (byte) -69);
                    class281.field4359.method1448((byte) -99, !class138.field1928[82] ? 0 : 1);
                    class281.field4359.method1440(var7, (byte) -111);
                    class281.field4359.method1488(class216.field3255 + var3, arg0 + 31);
                    class281.field4359.method1488(class37.field565 + var2, -119);
                }
                if (~var4 == -18) {
                    ++class231.field3503;
                    class281.field4359.method1864(182, (byte) -69);
                    class281.field4359.method1463(8, var3);
                    class281.field4359.method1477(var2, -61);
                    class281.field4359.method1477(var7, arg0 ^ 81);
                    class124.field1743 = 0;
                    class17.field183 = class67.method421(var3, 0);
                    class222.field3332 = var2;
                }
                if (~var4 == -59) {
                    class136.method923(-31);
                    class211 var27 = class67.method421(var3, arg0 + 110);
                    class156.field2172 = var2;
                    class76.field1061 = var3;
                    class141.field1963 = 1;
                    class203.field2833 = var7;
                    class236.method1583(var27, arg0 ^ -110);
                    class238.field3612 = "<col=ff9040>" + class73.method463(var7, -31104).field437 + "<col=ffffff>";
                    if (class238.field3612 == null) {
                        class238.field3612 = "null";
                    }
                } else {
                    if (~var4 == -35) {
                        ++class35.field537;
                        class21.field295 = 0;
                        class281.field4347 = 2;
                        class172.field2384 = class27.field344;
                        class74.field1038 = class81.field1112;
                        class281.field4359.method1864(121, (byte) -69);
                        class281.field4359.method1488(class216.field3255 + var3, -95);
                        class281.field4359.method1440((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -118);
                        class281.field4359.method1470(393660232, class37.field565 + var2);
                        class281.field4359.method1480(!class138.field1928[82] ? 0 : 1, (byte) -53);
                    }
                    if (~var4 == -14) {
                        class21.field295 = 0;
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        class172.field2384 = class27.field344;
                        ++class257.field3932;
                        class281.field4359.method1864(129, (byte) -69);
                        class281.field4359.method1440(var3 - -class216.field3255, (byte) -92);
                        class281.field4359.method1477(var7, -61);
                        class281.field4359.method1488(var2 - -class37.field565, -58);
                        class281.field4359.method1448((byte) 83, class138.field1928[82] ? 1 : 0);
                    }
                    if (var4 == 19) {
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        ++class140.field1949;
                        class172.field2384 = class27.field344;
                        class21.field295 = 0;
                        class281.field4359.method1864(111, (byte) -69);
                        class281.field4359.method1440(var2 - -class37.field565, (byte) -107);
                        class281.field4359.method1448((byte) 118, !class138.field1928[82] ? 0 : 1);
                        class281.field4359.method1440(var3 - -class216.field3255, (byte) -105);
                        class281.field4359.method1477(class144.field1998, -61);
                        class281.field4359.method1435(arg0 ^ 22, class93.field1306);
                        class281.field4359.method1477(var7, -61);
                    }
                    if (var4 == 9) {
                        if (~var7 != -1) {
                            if (~var7 == -2) {
                                if (~class229.field3470 < -1 && class138.field1928[82] && class138.field1928[81]) {
                                    class273.method1824(class216.field3255 + var3, class37.field565 - -var2, arg0 + 165, class295.field4642);
                                } else {
                                    class280.method1870(1, var2, var3, 115);
                                    class281.field4359.method1447(class287.field4550, arg0 + 17363582);
                                    class281.field4359.method1447(class12.field121, arg0 ^ -17363582);
                                    class281.field4359.method1470(393660232, (int) class68.field912);
                                    class281.field4359.method1447(57, 17363472);
                                    class281.field4359.method1447(class217.field3266, arg0 ^ -17363582);
                                    class281.field4359.method1447(class111.field1600, arg0 ^ -17363582);
                                    class281.field4359.method1447(89, 17363472);
                                    class281.field4359.method1470(393660232, class217.field3280.field4019);
                                    class281.field4359.method1470(393660232, class217.field3280.field4085);
                                    class281.field4359.method1447(class173.field2420, 17363472);
                                    class281.field4359.method1447(63, 17363472);
                                }
                            }
                        } else {
                            class280.method1874(class295.field4642, var2, var3);
                        }
                    }
                    if (var4 == 60) {
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        class21.field295 = 0;
                        class172.field2384 = class27.field344;
                        ++class283.field4386;
                        class281.field4359.method1864(135, (byte) -69);
                        class281.field4359.method1480(class138.field1928[82] ? 1 : 0, (byte) -53);
                        class281.field4359.method1463(8, class76.field1061);
                        class281.field4359.method1440(var7, (byte) -117);
                        class281.field4359.method1488(class37.field565 + var2, -118);
                        class281.field4359.method1488(class156.field2172, arg0 ^ 17);
                        class281.field4359.method1440(class216.field3255 + var3, (byte) -106);
                        class281.field4359.method1488(class203.field2833, -76);
                    }
                    if (var4 == 44) {
                        class281.field4359.method1864(110, (byte) -69);
                        class281.field4359.method1489(65280, var3);
                        ++class75.field1043;
                        class281.field4359.method1477(class156.field2172, -61);
                        class281.field4359.method1470(393660232, var2);
                        class281.field4359.method1470(393660232, var7);
                        class281.field4359.method1463(8, class76.field1061);
                        class281.field4359.method1470(393660232, class203.field2833);
                        class124.field1743 = 0;
                        class17.field183 = class67.method421(var3, arg0 + 110);
                        class222.field3332 = var2;
                    }
                    if (~var4 == -9) {
                        class88 var28 = class154.field2133[var7];
                        if (var28 != null) {
                            ++class1.field8;
                            class74.field1038 = class81.field1112;
                            class281.field4347 = 2;
                            class172.field2384 = class27.field344;
                            class21.field295 = 0;
                            class281.field4359.method1864(140, (byte) -69);
                            class281.field4359.method1487(false, !class138.field1928[82] ? 0 : 1);
                            class281.field4359.method1470(arg0 + 393660342, var7);
                        }
                    }
                    if (~var4 == -52) {
                        class88 var29 = class154.field2133[var7];
                        if (var29 != null) {
                            class281.field4347 = 2;
                            ++class102.field1426;
                            class74.field1038 = class81.field1112;
                            class21.field295 = 0;
                            class172.field2384 = class27.field344;
                            class281.field4359.method1864(183, (byte) -69);
                            class281.field4359.method1448((byte) 109, !class138.field1928[82] ? 0 : 1);
                            class281.field4359.method1488(var7, arg0 ^ 54);
                        }
                    }
                    if (var4 == 25) {
                        class281.field4359.method1864(134, (byte) -69);
                        class281.field4359.method1435(arg0 + 11, var3);
                        class281.field4359.method1477(var2, arg0 ^ 81);
                        ++class218.field3285;
                        class281.field4359.method1440(var7, (byte) -126);
                        class124.field1743 = 0;
                        class17.field183 = class67.method421(var3, 0);
                        class222.field3332 = var2;
                    }
                    if (~var4 == -23) {
                        ++class264.field3967;
                        class281.field4359.method1864(61, (byte) -69);
                        class281.field4359.method1470(393660232, class144.field1998);
                        class281.field4359.method1463(8, var3);
                        class281.field4359.method1489(65280, class93.field1306);
                        class281.field4359.method1488(var2, -66);
                    }
                    if (var4 == 46) {
                        ++class231.field3507;
                        class281.field4359.method1864(78, (byte) -69);
                        class281.field4359.method1463(8, var3);
                        class281.field4359.method1470(393660232, var2);
                        class281.field4359.method1477(var7, -61);
                        class124.field1743 = 0;
                        class17.field183 = class67.method421(var3, 0);
                        class222.field3332 = var2;
                    }
                    if (var4 == 1005) {
                        class21.field295 = 0;
                        class281.field4347 = 2;
                        class172.field2384 = class27.field344;
                        class74.field1038 = class81.field1112;
                        class140 var30 = class119.field1679[var7];
                        if (var30 != null) {
                            class284 var31 = var30.field1946;
                            if (var31.field4450 != null) {
                                var31 = var31.method1905((byte) -26);
                            }
                            if (var31 != null) {
                                ++class210.field3002;
                                class281.field4359.method1864(145, (byte) -69);
                                class281.field4359.method1477(var31.field4413, -61);
                            }
                        }
                    }
                    if (~var4 == -40) {
                        class88 var32 = class154.field2133[var7];
                        if (var32 != null) {
                            class172.field2384 = class27.field344;
                            class281.field4347 = 2;
                            class74.field1038 = class81.field1112;
                            class21.field295 = 0;
                            class281.field4359.method1864(104, (byte) -69);
                            ++class110.field1533;
                            class281.field4359.method1477(class203.field2833, -61);
                            class281.field4359.method1489(65280, class76.field1061);
                            class281.field4359.method1448((byte) -85, !class138.field1928[82] ? 0 : 1);
                            class281.field4359.method1488(class156.field2172, -67);
                            class281.field4359.method1470(393660232, var7);
                        }
                    }
                    if (~var4 == -41 || ~var4 == -1007) {
                        class176.method1157(var7, var3, var2, 6336, class41.field612[arg1]);
                    }
                    if (var4 == 48) {
                        class88 var33 = class154.field2133[var7];
                        if (var33 != null) {
                            ++class95.field1344;
                            class21.field295 = 0;
                            class281.field4347 = 2;
                            class172.field2384 = class27.field344;
                            class74.field1038 = class81.field1112;
                            class281.field4359.method1864(3, (byte) -69);
                            class281.field4359.method1480(!class138.field1928[82] ? 0 : 1, (byte) -53);
                            class281.field4359.method1488(var7, -110);
                        }
                    }
                    if (~var4 == -42) {
                        ++class203.field2829;
                        class281.field4359.method1864(128, (byte) -69);
                        class281.field4359.method1489(65280, var3);
                        class281.field4359.method1470(393660232, var7);
                        class281.field4359.method1477(var2, -61);
                        class124.field1743 = 0;
                        class17.field183 = class67.method421(var3, 0);
                        class222.field3332 = var2;
                    }
                    if (~var4 == -60) {
                        class172.field2384 = class27.field344;
                        class74.field1038 = class81.field1112;
                        class21.field295 = 0;
                        ++class170.field2361;
                        class281.field4347 = 2;
                        class281.field4359.method1864(53, (byte) -69);
                        class281.field4359.method1488((int) (var5 >>> 32) & Integer.MAX_VALUE, -82);
                        class281.field4359.method1470(393660232, var2 - -class37.field565);
                        class281.field4359.method1463(arg0 + 118, class93.field1306);
                        class281.field4359.method1440(class216.field3255 + var3, (byte) -102);
                        class281.field4359.method1487(false, !class138.field1928[82] ? 0 : 1);
                        class281.field4359.method1477(class144.field1998, -61);
                    }
                    if (var4 == 28) {
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        ++class189.field2608;
                        class21.field295 = 0;
                        class172.field2384 = class27.field344;
                        class281.field4359.method1864(10, (byte) -69);
                        class281.field4359.method1488(class216.field3255 + var3, arg0 ^ 11);
                        class281.field4359.method1488(class37.field565 + var2, arg0 ^ 31);
                        class281.field4359.method1487(false, class138.field1928[82] ? 1 : 0);
                        class281.field4359.method1470(arg0 ^ -393660198, var7);
                    }
                    if (~var4 == -32) {
                        class281.field4359.method1864(8, (byte) -69);
                        ++class203.field2823;
                        class281.field4359.method1470(393660232, var2);
                        class281.field4359.method1477(var7, -61);
                        class281.field4359.method1489(65280, var3);
                        class124.field1743 = 0;
                        class17.field183 = class67.method421(var3, 0);
                        class222.field3332 = var2;
                    }
                    if (var4 == 11) {
                        class21.field295 = 0;
                        ++class13.field126;
                        class281.field4347 = 2;
                        class74.field1038 = class81.field1112;
                        class172.field2384 = class27.field344;
                        class281.field4359.method1864(27, (byte) -69);
                        class281.field4359.method1440(class37.field565 + var2, (byte) -127);
                        class281.field4359.method1480(class138.field1928[82] ? 1 : 0, (byte) -53);
                        class281.field4359.method1477(var7, -61);
                        class281.field4359.method1488(var3 - -class216.field3255, -104);
                    }
                    if (~var4 == -17) {
                        class211 var34 = class67.method421(var3, arg0 ^ -110);
                        boolean var35 = true;
                        if (var34.field3062 > 0) {
                            var35 = class60.method375(arg0 + 66, var34);
                        }
                        if (var35) {
                            ++class108.field1506;
                            class281.field4359.method1864(68, (byte) -69);
                            class281.field4359.method1435(-99, var3);
                        }
                    }
                    if (~var4 == -25) {
                        class21.field295 = 0;
                        class281.field4347 = 2;
                        ++class92.field1278;
                        class74.field1038 = class81.field1112;
                        class172.field2384 = class27.field344;
                        class281.field4359.method1864(160, (byte) -69);
                        class281.field4359.method1470(393660232, class37.field565 + var2);
                        class281.field4359.method1470(393660232, var7);
                        class281.field4359.method1477(class216.field3255 + var3, -61);
                        class281.field4359.method1448((byte) 73, !class138.field1928[82] ? 0 : 1);
                    }
                    if (var4 == 26 && class233.field3524 == null) {
                        class1.method5((byte) -85, var2, var3);
                        class233.field3524 = class168.method1099(0, var2, var3);
                        class236.method1583(class233.field3524, 0);
                    }
                    if (var4 == 18) {
                        class88 var36 = class154.field2133[var7];
                        if (var36 != null) {
                            class281.field4347 = 2;
                            ++class140.field1954;
                            class172.field2384 = class27.field344;
                            class74.field1038 = class81.field1112;
                            class21.field295 = 0;
                            class281.field4359.method1864(199, (byte) -69);
                            class281.field4359.method1477(var7, -61);
                            class281.field4359.method1447(class138.field1928[82] ? 1 : 0, 17363472);
                        }
                    }
                    if (var4 == 1002) {
                        ++class167.field2298;
                        class21.field295 = 0;
                        class74.field1038 = class81.field1112;
                        class172.field2384 = class27.field344;
                        class281.field4347 = 2;
                        class281.field4359.method1864(188, (byte) -69);
                        class281.field4359.method1480(!class138.field1928[82] ? 0 : 1, (byte) -53);
                        class281.field4359.method1477((int) (var5 >>> 32) & Integer.MAX_VALUE, -61);
                        class281.field4359.method1470(393660232, class37.field565 + var2);
                        class281.field4359.method1440(class216.field3255 + var3, (byte) -111);
                    }
                    if (~var4 == -37) {
                        ++class282.field4369;
                        class281.field4359.method1864(219, (byte) -69);
                        class281.field4359.method1440(var7, (byte) -105);
                        class281.field4359.method1463(arg0 + 118, var3);
                        class281.field4359.method1488(var2, -94);
                        class124.field1743 = 0;
                        class17.field183 = class67.method421(var3, 0);
                        class222.field3332 = var2;
                    }
                    if (~class141.field1963 != -1) {
                        class141.field1963 = 0;
                        class236.method1583(class67.method421(class76.field1061, 0), 0);
                    }
                    if (arg0 != -110) {
                        field3793 = null;
                    }
                    if (class11.field113) {
                        class136.method923(-84);
                    }
                    if (class17.field183 != null && class124.field1743 == 0) {
                        class236.method1583(class17.field183, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        int var4 = 82 % ((arg1 - 63) / 61);
        ++field3787;
        if (super.field920.field374) {
            int[] var5 = this.method423(1, (byte) -54, arg0);
            int[] var6 = this.method423(2, (byte) -54, arg0);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class89.field1248 < ~var10; ++var10) {
                int var11 = var5[var10] * 255 >> 12 & 255;
                int var12 = var6[var10] * this.field3789 >> 12;
                int var13 = class160.field2245[var11] * var12 >> 12;
                int var14 = class54.field778[var11] * var12 >> 12;
                int var15 = class173.field2411 & (var14 >> 12) + var10;
                int var16 = class17.field184 & (var13 >> 12) + arg0;
                int[][] var17 = this.method429(0, var16, 2);
                var8[var10] = var17[0][var15];
                var7[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        int[] var3 = super.field917.method1920(arg0, true);
        if (arg1 >= -118) {
            this.method91(9, (byte) 1);
        }
        if (super.field917.field4474) {
            int[] var4 = this.method423(1, (byte) -54, arg0);
            int[] var5 = this.method423(2, (byte) -54, arg0);
            for (int var6 = 0; var6 < class89.field1248; ++var6) {
                int var7 = (var4[var6] & 4094) >> 4;
                int var8 = var5[var6] * this.field3789 >> 12;
                int var9 = class54.field778[var7] * var8 >> 12;
                int var10 = class160.field2245[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class173.field2411;
                int var12 = class17.field184 & arg0 - -(var10 >> 12);
                int[] var13 = this.method423(0, (byte) -54, var12);
                var3[var6] = var13[var11];
            }
        }
        ++field3791;
        return var3;
    }
}

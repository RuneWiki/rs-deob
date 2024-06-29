import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class71 extends class55 {

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public int field829 = -1;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public int field826 = 12800;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Z")
    public boolean field843 = true;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public int field846 = 12800;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public int field850 = 0;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public int field835 = -1;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    public int field851 = 0;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "Ljava/lang/String;")
    public String field838;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "Ljava/lang/String;")
    public String field852;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "Lbh;")
    public class234 field830;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "Lbh;")
    public static class234 field831 = new class234();

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "Lrc;")
    public static class9 field840 = new class9(64);

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Z")
    public final boolean method430(int arg0, int arg1, int arg2) {
        field844++;
        if (arg0 != 1) {
            this.field842 = 54;
        }
        for (class112 var4 = (class112) this.field830.method1532(arg0 - 77); var4 != null; var4 = (class112) this.field830.method1523(-109)) {
            if (var4.method693(arg2, arg1, (byte) 120)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V")
    public static void method431(byte arg0) {
        field840 = null;
        int var1 = 17 % ((arg0 + 41) / 50);
        field831 = null;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)Z")
    public static final boolean method432(int arg0) throws IOException {
        field823++;
        if (class117.field1637 == null) {
            return false;
        }
        int var1 = class117.field1637.method1202((byte) 75);
        if (var1 == 0) {
            return false;
        }
        if (class6.field79 == -1) {
            var1--;
            class117.field1637.method1205(class163.field2332.field3030, 1, false, 0);
            class163.field2332.field3021 = 0;
            class6.field79 = class163.field2332.method589(-109);
            class230.field3314 = class91.field1246[class6.field79];
        }
        if (class230.field3314 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class117.field1637.method1205(class163.field2332.field3030, 1, false, 0);
            class230.field3314 = class163.field2332.field3030[0] & 0xFF;
        }
        if (class230.field3314 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class117.field1637.method1205(class163.field2332.field3030, 2, false, 0);
            class163.field2332.field3021 = 0;
            var1 -= 2;
            class230.field3314 = class163.field2332.method1380(true);
        }
        if (class230.field3314 > var1) {
            return false;
        }
        class163.field2332.field3021 = 0;
        class117.field1637.method1205(class163.field2332.field3030, class230.field3314, false, 0);
        class129.field1869 = class294.field4651;
        class163.field2345 = 0;
        class294.field4651 = class196.field2798;
        class196.field2798 = class6.field79;
        if (class6.field79 == 60) {
            long var2 = class163.field2332.method1386((byte) -127);
            int var4 = class163.field2332.method1380(true);
            String var5 = class20.method123(32767, var4).method1460((byte) 111, class163.field2332);
            class21.method125(var5, class110.method686(var2, true), 19, (String) null, (byte) -86, var4);
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 228) {
            int var6 = class163.field2332.method1388(-1);
            int var7 = class163.field2332.method1362(5);
            if (class196.method1269(var6, true)) {
                class20.field241 = var7;
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 36) {
            int var8 = class163.field2332.method1358(arg0 + 17655);
            class82 var9 = class182.method1187((byte) -41, var8);
            for (int var10 = 0; var10 < var9.field1080.length; var10++) {
                var9.field1080[var10] = -1;
                var9.field1080[var10] = 0;
            }
            class255.method1632(16711680, var9);
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 103) {
            int var11 = class163.field2332.method1411(arg0 + 17852);
            int var12 = class163.field2332.method1400(false);
            int var13 = class163.field2332.method1358(arg0 + 17673);
            if (class196.method1269(var12, true)) {
                class166 var14 = (class166) class189.field2705.method1895((long) var13, -118);
                class166 var15 = (class166) class189.field2705.method1895((long) var11, -116);
                if (var15 != null) {
                    class252.method1619(var14 == null || var14.field2395 != var15.field2395, -119, var15);
                }
                if (var14 != null) {
                    var14.method1935(124);
                    class189.field2705.method1894(arg0 + 17596, var14, (long) var11);
                }
                class82 var16 = class182.method1187((byte) -41, var13);
                if (var16 != null) {
                    class255.method1632(arg0 ^ 0xFF00BB43, var16);
                }
                class82 var17 = class182.method1187((byte) -41, var11);
                if (var17 != null) {
                    class255.method1632(16711680, var17);
                    class54.method324((byte) 45, var17, true);
                }
                if (class123.field1776 != -1) {
                    class200.method1290(1, class123.field1776, 24826);
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 94) {
            class206.field2931 = class163.field2332.method1400(false) * 30;
            class6.field79 = -1;
            class118.field1679 = class176.field2500;
            return true;
        } else if (class6.field79 == 181) {
            long var18 = class163.field2332.method1386((byte) 1);
            long var20 = (long) class163.field2332.method1380(true);
            boolean var22 = false;
            long var23 = (long) class163.field2332.method1382(-45);
            long var25 = (var20 << 32) + var23;
            int var27 = class163.field2332.method1407(108);
            int var28 = 0;
            label1221: while (true) {
                if (var28 >= 100) {
                    if (var27 <= 1) {
                        if ((!class252.field3647 || class143.field2048) && !class44.field527) {
                            for (int var29 = 0; var29 < class185.field2675; var29++) {
                                if (class209.field2945[var29] == var18) {
                                    var22 = true;
                                    break label1221;
                                }
                            }
                        } else {
                            var22 = true;
                        }
                    }
                    break;
                }
                if (class230.field3307[var28] == var25) {
                    var22 = true;
                    break;
                }
                var28++;
            }
            if (!var22 && class246.field3572 == 0) {
                class230.field3307[class133.field1944] = var25;
                class133.field1944 = (class133.field1944 + 1) % 100;
                String var30 = class89.method532(class127.method832(true, class224.method1449(-108, class163.field2332)));
                if (var27 == 2 || var27 == 3) {
                    class225.method1455(var30, arg0 ^ 0xFFFFBB48, "<img=1>" + class110.method686(var18, true), 7);
                } else if (var27 == 1) {
                    class225.method1455(var30, -122, "<img=0>" + class110.method686(var18, true), 7);
                } else {
                    class225.method1455(var30, arg0 ^ 0xFFFFBB15, class110.method686(var18, true), 3);
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 34) {
            if (class230.field3314 == 0) {
                class230.field3305 = class150.field2190;
            } else {
                class230.field3305 = class163.field2332.method1352((byte) 116);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 61) {
            long var31 = class163.field2332.method1386((byte) 89);
            boolean var33 = false;
            long var34 = (long) class163.field2332.method1380(true);
            long var36 = (long) class163.field2332.method1382(-125);
            long var38 = (var34 << 32) + var36;
            int var40 = class163.field2332.method1407(105);
            int var41 = class163.field2332.method1380(true);
            int var42 = 0;
            label1237: while (true) {
                if (var42 >= 100) {
                    if (var40 <= 1) {
                        for (int var43 = 0; var43 < class185.field2675; var43++) {
                            if (class209.field2945[var43] == var31) {
                                var33 = true;
                                break label1237;
                            }
                        }
                    }
                    break;
                }
                if (class230.field3307[var42] == var38) {
                    var33 = true;
                    break;
                }
                var42++;
            }
            if (!var33 && class246.field3572 == 0) {
                class230.field3307[class133.field1944] = var38;
                class133.field1944 = (class133.field1944 + 1) % 100;
                String var44 = class20.method123(32767, var41).method1460((byte) 111, class163.field2332);
                if (var40 == 2) {
                    class21.method125(var44, "<img=1>" + class110.method686(var31, true), 18, (String) null, (byte) -86, var41);
                } else if (var40 == 1) {
                    class21.method125(var44, "<img=0>" + class110.method686(var31, true), 18, (String) null, (byte) -86, var41);
                } else {
                    class21.method125(var44, class110.method686(var31, true), 18, (String) null, (byte) -86, var41);
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 208) {
            if (class123.field1776 != -1) {
                class200.method1290(0, class123.field1776, arg0 + 42423);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 104) {
            for (int var45 = 0; var45 < class253.field3656.length; var45++) {
                if (class253.field3656[var45] != null) {
                    class253.field3656[var45].field4592 = -1;
                }
            }
            for (int var46 = 0; var46 < class20.field244.length; var46++) {
                if (class20.field244[var46] != null) {
                    class20.field244[var46].field4592 = -1;
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 204) {
            class15.method91(arg0 + 17688);
            int var47 = class163.field2332.method1362(5);
            int var48 = class163.field2332.method1358(45);
            int var49 = class163.field2332.method1392(arg0 ^ 0x44D2);
            class54.field637[var47] = var48;
            class283.field4312[var47] = var49;
            class124.field1786[var47] = 1;
            for (int var50 = 0; var50 < 98; var50++) {
                if (var48 >= class172.field2454[var50]) {
                    class124.field1786[var47] = var50 + 2;
                }
            }
            class127.field1816[class5.method26(class19.field230++, 31)] = var47;
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 243) {
            int var51 = class163.field2332.method1385(2);
            int var52 = class163.field2332.method1358(87);
            int var53 = class163.field2332.method1380(true);
            int var54 = class163.field2332.method1400(false);
            if (class196.method1269(var53, true)) {
                class279.method1832((var54 << 16) + var51, var52, -12654);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 213) {
            class280.method1836(true, false);
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 49) {
            int var55 = class163.field2332.method1407(114);
            int var56 = class163.field2332.method1385(2);
            int var57 = class163.field2332.method1380(true);
            class54 var58 = class20.field244[var56];
            if (var58 != null) {
                class52.method314(0, var55, var57, var58);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 179) {
            int var59 = class163.field2332.method1388(-1);
            if (var59 == 65535) {
                var59 = -1;
            }
            int var60 = class163.field2332.method1385(arg0 + 17599);
            int var61 = class163.field2332.method1412(true);
            if (class196.method1269(var60, true)) {
                class273.method1747(2, -1, var59, var61, (byte) 11);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 144) {
            int var62 = class163.field2332.method1400(false);
            int var63 = class163.field2332.method1400(false);
            int var64 = class163.field2332.method1358(arg0 + 17705);
            if (class196.method1269(var62, true)) {
                class101.method620(arg0 + 17721, var64, var63);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 5) {
            int var65 = class163.field2332.method1380(true);
            int var66 = class163.field2332.method1407(118);
            int var67 = class163.field2332.method1407(123);
            int var68 = class163.field2332.method1380(true);
            int var69 = class163.field2332.method1407(121);
            int var70 = class163.field2332.method1407(115);
            if (class196.method1269(var65, true)) {
                class54.method331(var68, var67, var69, var66, arg0 ^ 0xFFFFBB36, var70);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 226) {
            long var71 = class163.field2332.method1386((byte) 53);
            int var73 = class163.field2332.method1380(true);
            String var74 = "";
            int var75 = class163.field2332.method1407(arg0 + 17701);
            boolean var76 = true;
            if (var73 > 0) {
                var74 = class163.field2332.method1352((byte) 69);
            }
            if (var71 < 0L) {
                var71 &= Long.MAX_VALUE;
                var76 = false;
            }
            String var77 = class110.method686(var71, true);
            for (int var78 = 0; var78 < class144.field2064; var78++) {
                if (class267.field3844[var78] == var71) {
                    if (class143.field2046[var78] != var73) {
                        class143.field2046[var78] = var73;
                        if (var73 > 0) {
                            class225.method1455(var77 + class131.field1895, arg0 ^ 0x44C7, "", 5);
                        }
                        if (var73 == 0) {
                            class225.method1455(var77 + class55.field640, -10, "", 5);
                        }
                    }
                    var77 = null;
                    class59.field691[var78] = var74;
                    class274.field4102[var78] = var75;
                    class287.field4455[var78] = var76;
                    break;
                }
            }
            if (var77 != null && class144.field2064 < 200) {
                class267.field3844[class144.field2064] = var71;
                class82.field990[class144.field2064] = var77;
                class143.field2046[class144.field2064] = var73;
                class59.field691[class144.field2064] = var74;
                class274.field4102[class144.field2064] = var75;
                class287.field4455[class144.field2064] = var76;
                class144.field2064++;
            }
            class79.field934 = class176.field2500;
            int var79 = class144.field2064;
            boolean var80 = false;
            while (var79 > 0) {
                boolean var81 = true;
                var79--;
                for (int var82 = 0; var82 < var79; var82++) {
                    if (class143.field2046[var82] != class210.field2952 && class143.field2046[var82 + 1] == class210.field2952 || class143.field2046[var82] == 0 && class143.field2046[var82 + 1] != 0) {
                        var81 = false;
                        int var83 = class143.field2046[var82];
                        class143.field2046[var82] = class143.field2046[var82 + 1];
                        class143.field2046[var82 + 1] = var83;
                        String var84 = class59.field691[var82];
                        class59.field691[var82] = class59.field691[var82 + 1];
                        class59.field691[var82 + 1] = var84;
                        String var85 = class82.field990[var82];
                        class82.field990[var82] = class82.field990[var82 + 1];
                        class82.field990[var82 + 1] = var85;
                        long var86 = class267.field3844[var82];
                        class267.field3844[var82] = class267.field3844[var82 + 1];
                        class267.field3844[var82 + 1] = var86;
                        int var88 = class274.field4102[var82];
                        class274.field4102[var82] = class274.field4102[var82 + 1];
                        class274.field4102[var82 + 1] = var88;
                        boolean var89 = class287.field4455[var82];
                        class287.field4455[var82] = class287.field4455[var82 + 1];
                        class287.field4455[var82 + 1] = var89;
                    }
                }
                if (var81) {
                    break;
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 128) {
            class189.field2721 = class163.field2332.method1407(107);
            class66.field790 = class163.field2332.method1407(arg0 + 17719);
            class219.field3101 = class163.field2332.method1407(124);
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 235) {
            int var90 = class163.field2332.method1407(123);
            if (class163.field2332.method1407(110) == 0) {
                class95.field1268[var90] = new class88();
            } else {
                class163.field2332.field3021--;
                class95.field1268[var90] = new class88(class163.field2332);
            }
            class6.field79 = -1;
            class149.field2174 = class176.field2500;
            return true;
        } else if (class6.field79 == 238) {
            class168.method1105(2171);
            class15.method91(112);
            class6.field79 = -1;
            class203.field2895 += 32;
            return true;
        } else if (class6.field79 == 148) {
            class15.method91(arg0 + 17685);
            class103.field1399 = class163.field2332.method1357((byte) 50);
            class118.field1679 = class176.field2500;
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 0) {
            int var91 = class163.field2332.method1380(true);
            if (class196.method1269(var91, true)) {
                class7.method42(0);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 166) {
            long var92 = class163.field2332.method1386((byte) -127);
            class163.field2332.method1355(true);
            boolean var94 = false;
            long var95 = class163.field2332.method1386((byte) -125);
            long var97 = (long) class163.field2332.method1380(true);
            long var99 = (long) class163.field2332.method1382(-52);
            long var101 = (var97 << 32) + var99;
            int var103 = class163.field2332.method1407(112);
            int var104 = 0;
            label1296: while (true) {
                if (var104 >= 100) {
                    if (var103 <= 1) {
                        if ((!class252.field3647 || class143.field2048) && !class44.field527) {
                            for (int var105 = 0; var105 < class185.field2675; var105++) {
                                if (class209.field2945[var105] == var92) {
                                    var94 = true;
                                    break label1296;
                                }
                            }
                        } else {
                            var94 = true;
                        }
                    }
                    break;
                }
                if (class230.field3307[var104] == var101) {
                    var94 = true;
                    break;
                }
                var104++;
            }
            if (!var94 && class246.field3572 == 0) {
                class230.field3307[class133.field1944] = var101;
                class133.field1944 = (class133.field1944 + 1) % 100;
                String var106 = class89.method532(class127.method832(true, class224.method1449(-102, class163.field2332)));
                if (var103 == 2 || var103 == 3) {
                    class80.method478(class110.method686(var95, true), var106, "<img=1>" + class110.method686(var92, true), 9, 8);
                } else if (var103 == 1) {
                    class80.method478(class110.method686(var95, true), var106, "<img=0>" + class110.method686(var92, true), 9, 8);
                } else {
                    class80.method478(class110.method686(var95, true), var106, class110.method686(var92, true), 9, arg0 ^ 0xFFFFBB4B);
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 138) {
            int var107 = class163.field2332.method1369((byte) -126);
            int var108 = class163.field2332.method1385(2);
            int var109 = class163.field2332.method1411(255);
            if (class196.method1269(var108, true)) {
                class40.method251(var107, true, var109);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 98) {
            int var110 = class163.field2332.method1400(false);
            String var111 = class163.field2332.method1352((byte) -82);
            int var112 = class163.field2332.method1388(-1);
            if (class196.method1269(var112, true)) {
                class149.method984(var111, -58, var110);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 80) {
            class15.method91(118);
            class260.field3790 = class163.field2332.method1407(109);
            class118.field1679 = class176.field2500;
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 192) {
            int var113 = class163.field2332.method1358(93);
            int var114 = class163.field2332.method1380(true);
            if (var113 < -70000) {
                var114 += 32768;
            }
            class82 var115;
            if (var113 >= 0) {
                var115 = class182.method1187((byte) -41, var113);
            } else {
                var115 = null;
            }
            if (var115 != null) {
                for (int var116 = 0; var116 < var115.field1080.length; var116++) {
                    var115.field1080[var116] = 0;
                    var115.field1066[var116] = 0;
                }
            }
            class3.method16(true, var114);
            int var117 = class163.field2332.method1380(true);
            for (int var118 = 0; var118 < var117; var118++) {
                int var119 = class163.field2332.method1392(-44);
                if (var119 == 255) {
                    var119 = class163.field2332.method1402(false);
                }
                int var120 = class163.field2332.method1400(false);
                if (var115 != null && var118 < var115.field1080.length) {
                    var115.field1080[var118] = var120;
                    var115.field1066[var118] = var119;
                }
                class276.method1786(var114, var119, (byte) 118, var118, var120 - 1);
            }
            if (var115 != null) {
                class255.method1632(arg0 ^ 0xFF00BB43, var115);
            }
            class15.method91(86);
            class199.field2828[class5.method26(31, class203.field2876++)] = class5.method26(var114, 32767);
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 253) {
            int var121 = class163.field2332.method1407(arg0 + 17709);
            int var122 = class163.field2332.method1388(arg0 + 17596);
            int var123 = class163.field2332.method1388(-1);
            if (class196.method1269(var123, true)) {
                if (var121 == 2) {
                    class96.method574(arg0 ^ 0x4F89);
                }
                class123.field1776 = var122;
                class114.method737(var122, 5017);
                class268.method1717((byte) 8, false);
                method436((byte) 122, class123.field1776);
                for (int var124 = 0; var124 < 100; var124++) {
                    class129.field1862[var124] = true;
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 35) {
            int var125 = class163.field2332.method1380(true);
            int var126 = class163.field2332.method1385(2);
            int var127 = class163.field2332.method1385(arg0 ^ 0xFFFFBB41);
            if (class196.method1269(var126, true)) {
                class108.method679(var125, var127, -103);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 56) {
            boolean var128 = false;
            long var129 = class163.field2332.method1386((byte) 91);
            if ((Long.MIN_VALUE & var129) != 0L) {
                var128 = true;
            }
            int var131 = class163.field2332.method1380(true);
            byte var132 = class163.field2332.method1355(true);
            if (var128) {
                if (class34.field401 == 0) {
                    class6.field79 = -1;
                    return true;
                }
                boolean var138 = false;
                long var139 = var129 & Long.MAX_VALUE;
                int var141;
                for (var141 = 0; var141 < class34.field401 && (class38.field455[var141].field4489 != var139 || class38.field455[var141].field706 != var131); var141++) {
                }
                if (class34.field401 > var141) {
                    while (var141 < class34.field401 - 1) {
                        class38.field455[var141] = class38.field455[var141 + 1];
                        var141++;
                    }
                    class34.field401--;
                    class38.field455[class34.field401] = null;
                }
            } else {
                String var133 = class163.field2332.method1352((byte) 107);
                class60 var134 = new class60();
                var134.field4489 = var129;
                var134.field709 = class200.method1287(false, var134.field4489);
                var134.field706 = var131;
                var134.field717 = var132;
                var134.field714 = var133;
                int var135;
                for (var135 = class34.field401 - 1; var135 >= 0; var135--) {
                    int var136 = class38.field455[var135].field709.compareTo(var134.field709);
                    if (var136 == 0) {
                        class38.field455[var135].field706 = var131;
                        class38.field455[var135].field717 = var132;
                        class38.field455[var135].field714 = var133;
                        class161.field2315 = class176.field2500;
                        if (class296.field4680 == var129) {
                            class112.field1486 = var132;
                        }
                        class6.field79 = -1;
                        return true;
                    }
                    if (var136 < 0) {
                        break;
                    }
                }
                if (class38.field455.length <= class34.field401) {
                    class6.field79 = -1;
                    return true;
                }
                for (int var137 = class34.field401 - 1; var137 > var135; var137--) {
                    class38.field455[var137 + 1] = class38.field455[var137];
                }
                if (class34.field401 == 0) {
                    class38.field455 = new class60[100];
                }
                class38.field455[var135 + 1] = var134;
                if (class296.field4680 == var129) {
                    class112.field1486 = var132;
                }
                class34.field401++;
            }
            class161.field2315 = class176.field2500;
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 127) {
            String var142 = class163.field2332.method1352((byte) -98);
            if (var142.endsWith(":tradereq:")) {
                String var143 = var142.substring(0, var142.indexOf(":"));
                long var144 = class60.method370((byte) -8, var143);
                boolean var146 = false;
                for (int var147 = 0; var147 < class185.field2675; var147++) {
                    if (class209.field2945[var147] == var144) {
                        var146 = true;
                        break;
                    }
                }
                if (!var146 && class246.field3572 == 0) {
                    class225.method1455(class193.field2769, arg0 ^ 0x44B0, var143, 4);
                }
            } else if (var142.endsWith(":chalreq:")) {
                String var148 = var142.substring(0, var142.indexOf(":"));
                boolean var149 = false;
                long var150 = class60.method370((byte) -8, var148);
                for (int var152 = 0; var152 < class185.field2675; var152++) {
                    if (class209.field2945[var152] == var150) {
                        var149 = true;
                        break;
                    }
                }
                if (!var149 && class246.field3572 == 0) {
                    String var153 = var142.substring(var142.indexOf(":") + 1, var142.length() - 9);
                    class225.method1455(var153, arg0 ^ 0x44B4, var148, 8);
                }
            } else if (var142.endsWith(":assistreq:")) {
                boolean var154 = false;
                String var155 = var142.substring(0, var142.indexOf(":"));
                long var156 = class60.method370((byte) -8, var155);
                for (int var158 = 0; var158 < class185.field2675; var158++) {
                    if (class209.field2945[var158] == var156) {
                        var154 = true;
                        break;
                    }
                }
                if (!var154 && class246.field3572 == 0) {
                    class225.method1455("", arg0 + 17636, var155, 10);
                }
            } else if (var142.endsWith(":clan:")) {
                String var182 = var142.substring(0, var142.indexOf(":clan:"));
                class225.method1455(var182, -119, "", 11);
            } else if (var142.endsWith(":trade:")) {
                String var159 = var142.substring(0, var142.indexOf(":trade:"));
                if (class246.field3572 == 0) {
                    class225.method1455(var159, 113, "", 12);
                }
            } else if (var142.endsWith(":assist:")) {
                String var181 = var142.substring(0, var142.indexOf(":assist:"));
                if (class246.field3572 == 0) {
                    class225.method1455(var181, arg0 + 17481, "", 13);
                }
            } else if (var142.endsWith(":duelstake:")) {
                String var160 = var142.substring(0, var142.indexOf(":"));
                long var161 = class60.method370((byte) -8, var160);
                boolean var163 = false;
                for (int var164 = 0; var164 < class185.field2675; var164++) {
                    if (class209.field2945[var164] == var161) {
                        var163 = true;
                        break;
                    }
                }
                if (!var163 && class246.field3572 == 0) {
                    class225.method1455("", arg0 + 17477, var160, 14);
                }
            } else if (var142.endsWith(":duelfriend:")) {
                boolean var176 = false;
                String var177 = var142.substring(0, var142.indexOf(":"));
                long var178 = class60.method370((byte) -8, var177);
                for (int var180 = 0; var180 < class185.field2675; var180++) {
                    if (class209.field2945[var180] == var178) {
                        var176 = true;
                        break;
                    }
                }
                if (!var176 && class246.field3572 == 0) {
                    class225.method1455("", -119, var177, 15);
                }
            } else if (var142.endsWith(":clanreq:")) {
                String var165 = var142.substring(0, var142.indexOf(":"));
                boolean var166 = false;
                long var167 = class60.method370((byte) -8, var165);
                for (int var169 = 0; var169 < class185.field2675; var169++) {
                    if (class209.field2945[var169] == var167) {
                        var166 = true;
                        break;
                    }
                }
                if (!var166 && class246.field3572 == 0) {
                    class225.method1455("", 97, var165, 16);
                }
            } else if (var142.endsWith(":allyreq:")) {
                String var170 = var142.substring(0, var142.indexOf(":"));
                boolean var171 = false;
                long var172 = class60.method370((byte) -8, var170);
                for (int var174 = 0; var174 < class185.field2675; var174++) {
                    if (class209.field2945[var174] == var172) {
                        var171 = true;
                        break;
                    }
                }
                if (!var171 && class246.field3572 == 0) {
                    String var175 = var142.substring(var142.indexOf(":") + 1, var142.length() + -9);
                    class225.method1455(var175, -124, var170, 21);
                }
            } else {
                class225.method1455(var142, -127, "", 0);
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 251) {
            int var183 = class163.field2332.method1380(true);
            int var184 = class163.field2332.method1407(arg0 + 17722);
            int var185 = class163.field2332.method1407(118);
            int var186 = class163.field2332.method1407(118);
            int var187 = class163.field2332.method1407(112);
            int var188 = class163.field2332.method1380(true);
            if (class196.method1269(var183, true)) {
                class229.field3259[var184] = true;
                class57.field674[var184] = var185;
                class1.field16[var184] = var186;
                class223.field3153[var184] = var187;
                class167.field2411[var184] = var188;
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 154) {
            class145.field2141 = class163.field2332.method1369((byte) -124);
            class257.field3713 = class163.field2332.method1392(-59);
            for (int var189 = class145.field2141; var189 < (class145.field2141 + 8); var189++) {
                for (int var191 = class257.field3713; var191 < (class257.field3713 + 8); var191++) {
                    if (class80.field943[class199.field2833][var189][var191] != null) {
                        class80.field943[class199.field2833][var189][var191] = null;
                        class215.method1350(false, var189, var191);
                    }
                }
            }
            for (class206 var190 = (class206) class51.field578.method1532(-69); var190 != null; var190 = (class206) class51.field578.method1523(-99)) {
                if (class145.field2141 <= var190.field2925 && class145.field2141 + 8 > var190.field2925 && class257.field3713 <= var190.field2924 && var190.field2924 < (class257.field3713 + 8) && class199.field2833 == var190.field2918) {
                    var190.field2933 = 0;
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 141) {
            int var192 = class163.field2332.method1380(true);
            if (var192 == 65535) {
                var192 = -1;
            }
            int var193 = class163.field2332.method1407(126);
            int var194 = class163.field2332.method1380(true);
            int var195 = class163.field2332.method1407(114);
            class222.method1442(var194, var193, var195, -1, var192);
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 255) {
            int var196 = class163.field2332.method1358(120);
            int var197 = class163.field2332.method1380(true);
            class82 var198;
            if (var196 < 0) {
                var198 = null;
            } else {
                var198 = class182.method1187((byte) -41, var196);
            }
            if (var196 < -70000) {
                var197 += 32768;
            }
            while (class230.field3314 > class163.field2332.field3021) {
                int var199 = 0;
                int var200 = class163.field2332.method1378((byte) -121);
                int var201 = class163.field2332.method1380(true);
                if (var201 != 0) {
                    var199 = class163.field2332.method1407(109);
                    if (var199 == 255) {
                        var199 = class163.field2332.method1358(106);
                    }
                }
                if (var198 != null && var200 >= 0 && var198.field1080.length > var200) {
                    var198.field1080[var200] = var201;
                    var198.field1066[var200] = var199;
                }
                class276.method1786(var197, var199, (byte) 118, var200, var201 - 1);
            }
            if (var198 != null) {
                class255.method1632(16711680, var198);
            }
            class15.method91(93);
            class199.field2828[class5.method26(class203.field2876++, 31)] = class5.method26(var197, 32767);
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 211) {
            int var202 = class163.field2332.method1412(true);
            int var203 = class163.field2332.method1400(false);
            int var204 = class163.field2332.method1402(false);
            int var205 = class163.field2332.method1385(2);
            if (var205 == 65535) {
                var205 = -1;
            }
            if (class196.method1269(var203, true)) {
                class82 var206 = class182.method1187((byte) -41, var204);
                if (var206.field1126) {
                    class251.method1608(var205, var202, -26881, var204);
                    class229 var208 = class36.method224(var205, 71);
                    class230.method1507(var204, var208.field3279, (byte) -77, var208.field3271, var208.field3283);
                    class19.method114(var208.field3281, (byte) -79, var208.field3280, var204, var208.field3237);
                } else if (var205 == -1) {
                    class6.field79 = -1;
                    var206.field1098 = 0;
                    return true;
                } else {
                    class229 var207 = class36.method224(var205, 22);
                    var206.field1141 = var207.field3279;
                    var206.field974 = var205;
                    var206.field964 = var207.field3283;
                    var206.field1098 = 4;
                    var206.field1133 = var207.field3271 * 100 / var202;
                    class255.method1632(arg0 ^ 0xFF00BB43, var206);
                }
            }
            class6.field79 = -1;
            return true;
        } else if (class6.field79 == 189) {
            class6.field79 = -1;
            class292.field4626 = 0;
            return true;
        } else {
            if (arg0 != -17597) {
                method439(93);
            }
            if (class6.field79 == 124) {
                class163.field2332.field3021 += 28;
                if (class163.field2332.method1401(4)) {
                    class136.method886(class163.field2332, class163.field2332.field3021 - 28, arg0 ^ 0x44E6);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 136 || class6.field79 == 46 || class6.field79 == 140 || class6.field79 == 7 || class6.field79 == 111 || class6.field79 == 133 || class6.field79 == 247 || class6.field79 == 70 || class6.field79 == 41 || class6.field79 == 101 || class6.field79 == 159 || class6.field79 == 193 || class6.field79 == 197 || class6.field79 == 215) {
                class228.method1478(1221757028);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 198) {
                int var209 = class163.field2332.method1407(arg0 + 17717);
                int var210 = class163.field2332.method1392(-57);
                int var211 = class163.field2332.method1407(103);
                class199.field2833 = var211 >> 1;
                class177.field2507.method1561((var211 & 0x1) == 1, var209, (byte) -43, var210);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 37) {
                int var212 = class163.field2332.method1380(true);
                int var213 = class163.field2332.method1400(false);
                int var214 = class163.field2332.method1402(false);
                if (class196.method1269(var213, true)) {
                    class3.method17(var214, false, var212);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 10) {
                class230.field3306 = class163.field2332.method1407(arg0 ^ 0xFFFFBB33);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 82) {
                int var215 = class163.field2332.method1411(arg0 ^ 0xFFFFBBBC);
                int var216 = class163.field2332.method1400(false);
                class282.method1846(var215, var216, (byte) 1);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 23) {
                class185.field2675 = class230.field3314 / 8;
                for (int var217 = 0; var217 < class185.field2675; var217++) {
                    class209.field2945[var217] = class163.field2332.method1386((byte) -121);
                    class199.field2835[var217] = class52.method311(-31248, class209.field2945[var217]);
                    class260.field3781[var217] = false;
                }
                class6.field79 = -1;
                class79.field934 = class176.field2500;
                return true;
            } else if (class6.field79 == 115) {
                for (int var218 = 0; var218 < class164.field2358.length; var218++) {
                    if (class19.field224[var218] != class164.field2358[var218]) {
                        class164.field2358[var218] = class19.field224[var218];
                        class60.method372((byte) -114, var218);
                        class216.field3025[class5.method26(class203.field2895++, 31)] = var218;
                    }
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 30) {
                int var219 = class163.field2332.method1407(115);
                int var220 = var219 >> 5;
                int var221 = var219 & 0x1F;
                if (var221 == 0) {
                    class243.field3528[var220] = null;
                    class6.field79 = -1;
                    return true;
                }
                class287 var222 = new class287();
                var222.field4470 = var221;
                var222.field4470 = var219 & 0x3F;
                var222.field4466 = class163.field2332.method1407(arg0 ^ 0xFFFFBB3E);
                if (var222.field4466 >= 0 && var222.field4466 < class108.field1463.length) {
                    if (var222.field4470 == 1 || var222.field4470 == 10) {
                        var222.field4459 = class163.field2332.method1380(true);
                        class163.field2332.field3021 += 5;
                    } else if (var222.field4470 >= 2 && var222.field4470 <= 6) {
                        if (var222.field4470 == 2) {
                            var222.field4464 = 64;
                            var222.field4460 = 64;
                        }
                        if (var222.field4470 == 3) {
                            var222.field4464 = 0;
                            var222.field4460 = 64;
                        }
                        if (var222.field4470 == 4) {
                            var222.field4464 = 128;
                            var222.field4460 = 64;
                        }
                        if (var222.field4470 == 5) {
                            var222.field4460 = 0;
                            var222.field4464 = 64;
                        }
                        if (var222.field4470 == 6) {
                            var222.field4464 = 64;
                            var222.field4460 = 128;
                        }
                        var222.field4470 = 2;
                        var222.field4479 = class163.field2332.method1380(true);
                        var222.field4473 = class163.field2332.method1380(true);
                        var222.field4465 = class163.field2332.method1407(arg0 + 17712);
                        var222.field4468 = class163.field2332.method1380(true);
                    }
                    var222.field4472 = class163.field2332.method1380(true);
                    if (var222.field4472 == 65535) {
                        var222.field4472 = -1;
                    }
                    class243.field3528[var220] = var222;
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 83) {
                int var223 = class163.field2332.method1385(2);
                byte var224 = class163.field2332.method1393(arg0 - 7287);
                int var225 = class163.field2332.method1385(2);
                if (class196.method1269(var223, true)) {
                    class142.method921(18528, var224, var225);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 187) {
                int var226 = class163.field2332.method1411(arg0 + 17852);
                int var227 = class163.field2332.method1400(false);
                if (class196.method1269(var227, true)) {
                    int var228 = 0;
                    if (class177.field2507.field3468 != null) {
                        var228 = class177.field2507.field3468.method873((byte) 93);
                    }
                    class273.method1747(3, -1, var228, var226, (byte) 11);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 164) {
                int var229 = class163.field2332.method1358(arg0 ^ 0xFFFFBB12);
                int var230 = class163.field2332.method1385(2);
                class120.method783(var229, var230, 710);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 209) {
                int var231 = class163.field2332.method1358(arg0 ^ 0xFFFFBB0B);
                class84.field1159 = class115.field1592.method351(var231, (byte) 15);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 156) {
                class145.field2141 = class163.field2332.method1407(121);
                class257.field3713 = class163.field2332.method1392(-127);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 116) {
                int var232 = class163.field2332.method1380(true);
                int var233 = class163.field2332.method1358(71);
                if (class196.method1269(var232, true)) {
                    class166 var234 = (class166) class189.field2705.method1895((long) var233, -113);
                    if (var234 != null) {
                        class252.method1619(true, 126, var234);
                    }
                    if (class165.field2365 != null) {
                        class255.method1632(16711680, class165.field2365);
                        class165.field2365 = null;
                    }
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 130) {
                int var235 = class163.field2332.method1411(arg0 + 17852);
                int var236 = class163.field2332.method1385(2);
                String var237 = class163.field2332.method1352((byte) 62);
                if (class196.method1269(var236, true)) {
                    class221.method1441(115, var235, var237);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 91) {
                int var238 = class163.field2332.method1392(arg0 ^ 0x44D7);
                int var239 = class163.field2332.method1380(true);
                if (var239 == 65535) {
                    var239 = -1;
                }
                class42.method262(true, var239, var238);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 223) {
                int var240 = class163.field2332.method1391((byte) -117);
                int var241 = class163.field2332.method1380(true);
                int var242 = class163.field2332.method1362(5);
                if (var241 == 65535) {
                    var241 = -1;
                }
                class72.method444((byte) -68, var240, var242, var241);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 229) {
                byte[] var243 = new byte[class230.field3314];
                class163.field2332.method584(var243, 0, (byte) -4, class230.field3314);
                String var244 = class276.method1783(class230.field3314, var243, 0, (byte) 52);
                if (class202.field2858 == null && class56.field659 == 3 || !class56.field666.startsWith("win") || class227.field3204) {
                    class96.method575(true, var244, 1);
                } else {
                    class238.field3425 = true;
                    class171.field2445 = var244;
                    class226.field3186 = class115.field1592.method352(var244, 5557);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 51) {
                int var245 = class163.field2332.method1412(true);
                int var246 = class163.field2332.method1384(2);
                int var247 = class163.field2332.method1380(true);
                int var248 = class163.field2332.method1357((byte) 50);
                if (class196.method1269(var247, true)) {
                    class100.method608(var246, 256, var245, var248);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 151) {
                int var249 = class163.field2332.method1388(-1);
                int var250 = class163.field2332.method1380(true);
                int var251 = class163.field2332.method1411(255);
                int var252 = class163.field2332.method1380(true);
                if (var251 >> 30 != 0) {
                    int var253 = (var251 & 0x37AACDCB) >> 28;
                    int var254 = (var251 & 0x3FFF) - class166.field2383;
                    int var255 = ((var251 & 0xFFFC8CD) >> 14) - class110.field1473;
                    if (var255 >= 0 && var254 >= 0 && var255 < 104 && var254 < 104) {
                        int var256 = var254 * 128 + 64;
                        int var257 = var255 * 128 + 64;
                        class37 var258 = new class37(var249, var253, var257, var256, class4.method21(var256, var253, var257, (byte) 26) - var252, var250, class198.field2819);
                        class130.field1883.method1522(new class159(var258), -118);
                    }
                } else if (var251 >> 29 != 0) {
                    int var271 = var251 & 0xFFFF;
                    class54 var272 = class20.field244[var271];
                    if (var272 != null) {
                        if (var249 == 65535) {
                            var249 = -1;
                        }
                        boolean var273 = true;
                        if (var249 != -1 && var272.field4590 != -1) {
                            if (var272.field4590 == var249) {
                                class101 var278 = class189.method1246(var249, (byte) -46);
                                if (var278.field1381 && var278.field1382 != -1) {
                                    class274 var279 = class27.method165(var278.field1382, (byte) -128);
                                    int var280 = var279.field4090;
                                    if (var280 == 1) {
                                        var273 = false;
                                        var272.field4578 = 0;
                                        var272.field4507 = class198.field2819 + var250;
                                        var272.field4506 = 0;
                                        var272.field4556 = 0;
                                        var272.field4542 = 1;
                                        class270.method1730(var272.field4578, var272.field4563, var272.field4553, (byte) -115, var279, false);
                                    } else if (var280 == 2) {
                                        var273 = false;
                                        var272.field4565 = 0;
                                    }
                                }
                            } else {
                                class101 var274 = class189.method1246(var249, (byte) -82);
                                class101 var275 = class189.method1246(var272.field4590, (byte) -98);
                                if (var274.field1382 != -1 && var275.field1382 != -1) {
                                    class274 var276 = class27.method165(var274.field1382, (byte) 72);
                                    class274 var277 = class27.method165(var275.field1382, (byte) -109);
                                    if (var277.field4071 > var276.field4071) {
                                        var273 = false;
                                    }
                                }
                            }
                        }
                        if (var273) {
                            var272.field4578 = 0;
                            var272.field4526 = var252;
                            var272.field4556 = 0;
                            var272.field4590 = var249;
                            var272.field4507 = class198.field2819 + var250;
                            var272.field4542 = 1;
                            if (class198.field2819 < var272.field4507) {
                                var272.field4578 = -1;
                            }
                            if (var272.field4590 != -1 && class198.field2819 == var272.field4507) {
                                int var281 = class189.method1246(var272.field4590, (byte) -108).field1382;
                                if (var281 != -1) {
                                    class274 var282 = class27.method165(var281, (byte) 69);
                                    if (var282 != null && var282.field4072 != null) {
                                        class270.method1730(0, var272.field4563, var272.field4553, (byte) 89, var282, false);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var251 >> 28) != 0) {
                    int var259 = var251 & 0xFFFF;
                    class240 var260;
                    if (class33.field385 == var259) {
                        var260 = class177.field2507;
                    } else {
                        var260 = class253.field3656[var259];
                    }
                    if (var260 != null) {
                        if (var249 == 65535) {
                            var249 = -1;
                        }
                        boolean var261 = true;
                        if (var249 != -1 && var260.field4590 != -1) {
                            if (var260.field4590 == var249) {
                                class101 var262 = class189.method1246(var249, (byte) -79);
                                if (var262.field1381 && var262.field1382 != -1) {
                                    class274 var263 = class27.method165(var262.field1382, (byte) -116);
                                    int var264 = var263.field4090;
                                    if (var264 == 1) {
                                        var260.field4578 = 0;
                                        var260.field4556 = 0;
                                        var260.field4542 = 1;
                                        var261 = false;
                                        var260.field4507 = class198.field2819 + var250;
                                        var260.field4506 = 0;
                                        class270.method1730(var260.field4578, var260.field4563, var260.field4553, (byte) -119, var263, false);
                                    } else if (var264 == 2) {
                                        var261 = false;
                                        var260.field4565 = 0;
                                    }
                                }
                            } else {
                                class101 var265 = class189.method1246(var249, (byte) -32);
                                class101 var266 = class189.method1246(var260.field4590, (byte) -128);
                                if (var265.field1382 != -1 && var266.field1382 != -1) {
                                    class274 var267 = class27.method165(var265.field1382, (byte) -118);
                                    class274 var268 = class27.method165(var266.field1382, (byte) 111);
                                    if (var268.field4071 > var267.field4071) {
                                        var261 = false;
                                    }
                                }
                            }
                        }
                        if (var261) {
                            var260.field4578 = 0;
                            var260.field4542 = 1;
                            var260.field4556 = 0;
                            var260.field4590 = var249;
                            var260.field4507 = class198.field2819 + var250;
                            if (var260.field4590 == 65535) {
                                var260.field4590 = -1;
                            }
                            var260.field4526 = var252;
                            if (var260.field4507 > class198.field2819) {
                                var260.field4578 = -1;
                            }
                            if (var260.field4590 != -1 && class198.field2819 == var260.field4507) {
                                int var269 = class189.method1246(var260.field4590, (byte) -86).field1382;
                                if (var269 != -1) {
                                    class274 var270 = class27.method165(var269, (byte) 32);
                                    if (var270 != null && var270.field4072 != null) {
                                        class270.method1730(0, var260.field4563, var260.field4553, (byte) -120, var270, class177.field2507 == var260);
                                    }
                                }
                            }
                        }
                    }
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 47) {
                class259.field3776 = class163.field2332.method1407(118);
                class6.field79 = -1;
                class79.field934 = class176.field2500;
                return true;
            } else if (class6.field79 == 15) {
                long var283 = class163.field2332.method1386((byte) -121);
                class163.field2332.method1355(true);
                long var285 = class163.field2332.method1386((byte) 99);
                long var287 = (long) class163.field2332.method1380(true);
                long var289 = (long) class163.field2332.method1382(-90);
                int var291 = class163.field2332.method1407(arg0 + 17707);
                long var292 = (var287 << 32) + var289;
                int var294 = class163.field2332.method1380(true);
                boolean var295 = false;
                int var296 = 0;
                label1478: while (true) {
                    if (var296 >= 100) {
                        if (var291 <= 1) {
                            for (int var297 = 0; var297 < class185.field2675; var297++) {
                                if (class209.field2945[var297] == var283) {
                                    var295 = true;
                                    break label1478;
                                }
                            }
                        }
                        break;
                    }
                    if (class230.field3307[var296] == var292) {
                        var295 = true;
                        break;
                    }
                    var296++;
                }
                if (!var295 && class246.field3572 == 0) {
                    class230.field3307[class133.field1944] = var292;
                    class133.field1944 = (class133.field1944 + 1) % 100;
                    String var298 = class20.method123(32767, var294).method1460((byte) 111, class163.field2332);
                    if (var291 == 2 || var291 == 3) {
                        class21.method125(var298, "<img=1>" + class110.method686(var283, true), 20, class110.method686(var285, true), (byte) -86, var294);
                    } else if (var291 == 1) {
                        class21.method125(var298, "<img=0>" + class110.method686(var283, true), 20, class110.method686(var285, true), (byte) -86, var294);
                    } else {
                        class21.method125(var298, class110.method686(var283, true), 20, class110.method686(var285, true), (byte) -86, var294);
                    }
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 107) {
                int var299 = class163.field2332.method1388(arg0 ^ 0x44BC);
                if (var299 == 65535) {
                    var299 = -1;
                }
                int var300 = class163.field2332.method1358(113);
                int var301 = class163.field2332.method1400(false);
                int var302 = class163.field2332.method1400(false);
                int var303 = class163.field2332.method1388(-1);
                if (var302 == 65535) {
                    var302 = -1;
                }
                if (class196.method1269(var303, true)) {
                    for (int var304 = var302; var304 <= var299; var304++) {
                        long var305 = ((long) var300 << 32) + (long) var304;
                        class178 var307 = (class178) class68.field798.method1895(var305, arg0 ^ 0x44C1);
                        class178 var308;
                        if (var307 != null) {
                            var308 = new class178(var307.field2525, var301);
                            var307.method1935(109);
                        } else if (var304 == -1) {
                            var308 = new class178(class182.method1187((byte) -41, var300).field1008.field2525, var301);
                        } else {
                            var308 = new class178(0, var301);
                        }
                        class68.field798.method1894(-1, var308, var305);
                    }
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 99) {
                class257.field3713 = class163.field2332.method1369((byte) -126);
                class145.field2141 = class163.field2332.method1392(-109);
                while (class230.field3314 > class163.field2332.field3021) {
                    class6.field79 = class163.field2332.method1407(arg0 ^ 0xFFFFBB2C);
                    class228.method1478(1221757028);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 73) {
                int var309 = class163.field2332.method1380(true);
                class224.method1451(0, var309);
                class199.field2828[class5.method26(class203.field2876++, 31)] = class5.method26(32767, var309);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 38) {
                class221.method1436((byte) -122);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 137) {
                int var310 = class163.field2332.method1358(74);
                int var311 = class163.field2332.method1400(false);
                int var312 = class163.field2332.method1388(arg0 ^ 0x44BC);
                if (var312 == 65535) {
                    var312 = -1;
                }
                if (class196.method1269(var311, true)) {
                    class273.method1747(1, -1, var312, var310, (byte) 11);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 96) {
                class150.method991(-15809);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 131) {
                int var313 = class163.field2332.method1380(true);
                int var314 = class163.field2332.method1407(arg0 + 17717);
                if (var313 == 65535) {
                    var313 = -1;
                }
                int var315 = class163.field2332.method1369((byte) -122);
                String var316 = class163.field2332.method1352((byte) -101);
                if (var314 >= 1 && var314 <= 8) {
                    if (var316.equalsIgnoreCase("null")) {
                        var316 = null;
                    }
                    class211.field2968[var314 - 1] = var316;
                    class22.field272[var314 - 1] = var313;
                    class193.field2773[var314 - 1] = var315 == 0;
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 1) {
                int var317 = class163.field2332.method1407(126);
                int var318 = class163.field2332.method1388(arg0 ^ 0x44BC);
                int var319 = class163.field2332.method1380(true);
                int var320 = class163.field2332.method1402(false);
                if (class196.method1269(var318, true)) {
                    class166 var321 = (class166) class189.field2705.method1895((long) var320, arg0 ^ 0x44C2);
                    if (var321 != null) {
                        class252.method1619(var321.field2395 != var319, arg0 ^ 0xFFFFBB2F, var321);
                    }
                    class1.method4(var319, var320, arg0 + 47797, var317);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 89) {
                class287.method1929(false, class163.field2332.method1352((byte) -58));
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 201) {
                class180.method1172(class230.field3314, (byte) 44, class115.field1592, class163.field2332);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 63) {
                int var322 = class163.field2332.method1402(false);
                int var323 = class163.field2332.method1400(false);
                int var324 = class163.field2332.method1388(-1);
                int var325 = class163.field2332.method1380(true);
                int var326 = class163.field2332.method1380(true);
                if (class196.method1269(var326, true)) {
                    class273.method1747(7, var325, var323 << 16 | var324, var322, (byte) 11);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 79) {
                int var327 = class163.field2332.method1358(48);
                int var328 = class163.field2332.method1380(true);
                int var329 = class163.field2332.method1388(arg0 ^ 0x44BC);
                int var330 = class163.field2332.method1400(false);
                int var331 = class163.field2332.method1385(2);
                if (class196.method1269(var329, true)) {
                    class230.method1507(var327, var328, (byte) -29, var330, var331);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 176) {
                class161.field2315 = class176.field2500;
                long var332 = class163.field2332.method1386((byte) 4);
                if (var332 == 0L) {
                    class34.field401 = 0;
                    class66.field776 = null;
                    class38.field455 = null;
                    class6.field79 = -1;
                    class17.field211 = null;
                    return true;
                }
                long var334 = class163.field2332.method1386((byte) -123);
                class66.field776 = class200.method1287(false, var334);
                class17.field211 = class200.method1287(false, var332);
                class95.field1278 = class163.field2332.method1355(true);
                int var336 = class163.field2332.method1407(122);
                if (var336 == 255) {
                    class6.field79 = -1;
                    return true;
                }
                class60[] var337 = new class60[100];
                class34.field401 = var336;
                for (int var338 = 0; var338 < class34.field401; var338++) {
                    var337[var338] = new class60();
                    var337[var338].field4489 = class163.field2332.method1386((byte) -125);
                    var337[var338].field709 = class200.method1287(false, var337[var338].field4489);
                    var337[var338].field706 = class163.field2332.method1380(true);
                    var337[var338].field717 = class163.field2332.method1355(true);
                    var337[var338].field714 = class163.field2332.method1352((byte) -76);
                    if (class296.field4680 == var337[var338].field4489) {
                        class112.field1486 = var337[var338].field717;
                    }
                }
                boolean var339 = false;
                int var340 = class34.field401;
                while (var340 > 0) {
                    boolean var341 = true;
                    var340--;
                    for (int var342 = 0; var342 < var340; var342++) {
                        if (var337[var342].field709.compareTo(var337[var342 + 1].field709) > 0) {
                            var341 = false;
                            class60 var343 = var337[var342];
                            var337[var342] = var337[var342 + 1];
                            var337[var342 + 1] = var343;
                        }
                    }
                    if (var341) {
                        break;
                    }
                }
                class6.field79 = -1;
                class38.field455 = var337;
                return true;
            } else if (class6.field79 == 200) {
                int var344 = class163.field2332.method1380(true);
                int var345 = class163.field2332.method1407(109);
                int var346 = class163.field2332.method1407(108);
                int var347 = class163.field2332.method1380(true);
                int var348 = class163.field2332.method1407(106);
                int var349 = class163.field2332.method1407(120);
                if (class196.method1269(var344, true)) {
                    class23.method140(var349, var348, var346, true, 13015, var347, var345);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 174) {
                int var350 = class163.field2332.method1356(2);
                int var351 = class163.field2332.method1385(2);
                int var352 = class163.field2332.method1358(55);
                if (class196.method1269(var351, true)) {
                    class213.method1340(var352, var350, true);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 183) {
                int var353 = class163.field2332.method1400(false);
                byte var354 = class163.field2332.method1355(true);
                class282.method1846(var354, var353, (byte) 1);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 54) {
                class233.method1517((byte) 102);
                class6.field79 = -1;
                return false;
            } else if (class6.field79 == 126) {
                class280.method1836(false, false);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 143) {
                long var355 = class163.field2332.method1386((byte) 36);
                String var357 = class89.method532(class127.method832(true, class224.method1449(-96, class163.field2332)));
                class225.method1455(var357, 110, class110.method686(var355, true), 6);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 152) {
                int var358 = class163.field2332.method1380(true);
                if (var358 == 65535) {
                    var358 = -1;
                }
                int var359 = class163.field2332.method1369((byte) -126);
                int var360 = var359 >> 2;
                int var361 = class6.field85[var360];
                int var362 = var359 & 0x3;
                int var363 = class163.field2332.method1412(true);
                int var364 = var363 & 0x3FFF;
                int var365 = (var363 & 0x30BA4018) >> 28;
                int var366 = (var363 & 0xFFFF0E8) >> 14;
                int var367 = var364 - class166.field2383;
                int var368 = var366 - class110.field1473;
                class269.method1721(var365, var362, var361, var358, var360, var368, (byte) 66, var367);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 92) {
                int var369 = class163.field2332.method1400(false);
                int var370 = class163.field2332.method1380(true);
                String var371 = class163.field2332.method1352((byte) -41);
                if (class196.method1269(var370, true)) {
                    class149.method984(var371, -86, var369);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 123) {
                int var372 = class163.field2332.method1412(true);
                int var373 = class163.field2332.method1400(false);
                if (var373 == 65535) {
                    var373 = -1;
                }
                int var374 = class163.field2332.method1380(true);
                if (var374 == 65535) {
                    var374 = -1;
                }
                int var375 = class163.field2332.method1402(false);
                int var376 = class163.field2332.method1400(false);
                if (class196.method1269(var376, true)) {
                    for (int var377 = var374; var377 <= var373; var377++) {
                        long var378 = ((long) var375 << 32) + (long) var377;
                        class178 var380 = (class178) class68.field798.method1895(var378, -111);
                        class178 var381;
                        if (var380 != null) {
                            var381 = new class178(var372, var380.field2527);
                            var380.method1935(108);
                        } else if (var377 == -1) {
                            var381 = new class178(var372, class182.method1187((byte) -41, var375).field1008.field2527);
                        } else {
                            var381 = new class178(var372, -1);
                        }
                        class68.field798.method1894(-1, var381, var378);
                    }
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 21) {
                int var382 = class163.field2332.method1380(true);
                if (class196.method1269(var382, true)) {
                    class232.method1514(0);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 216) {
                int var383 = class163.field2332.method1385(arg0 + 17599);
                int var384 = class163.field2332.method1402(false);
                int var385 = class163.field2332.method1388(-1);
                if (class196.method1269(var383, true)) {
                    class142.method921(18528, var384, var385);
                }
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 26) {
                int var386 = class163.field2332.method1380(true);
                int var387 = class163.field2332.method1369((byte) -123);
                class120.method783(var387, var386, 710);
                class6.field79 = -1;
                return true;
            } else if (class6.field79 == 3) {
                int var388 = class163.field2332.method1380(true);
                String var389 = class163.field2332.method1352((byte) -80);
                Object[] var390 = new Object[var389.length() + 1];
                for (int var391 = var389.length() - 1; var391 >= 0; var391--) {
                    if (var389.charAt(var391) == 's') {
                        var390[var391 + 1] = class163.field2332.method1352((byte) -108);
                    } else {
                        var390[var391 + 1] = Integer.valueOf(class163.field2332.method1358(class165.method1085(arg0, -17540)));
                    }
                }
                var390[0] = Integer.valueOf(class163.field2332.method1358(125));
                if (class196.method1269(var388, true)) {
                    class11 var392 = new class11();
                    var392.field143 = var390;
                    class110.method684(var392, false);
                }
                class6.field79 = -1;
                return true;
            } else {
                class142.method918(-1, (Throwable) null, "T1 - " + class6.field79 + "," + class294.field4651 + "," + class129.field1869 + " - " + class230.field3314);
                class233.method1517((byte) -73);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public final void method433(int arg0) {
        this.field850 = 0;
        this.field846 = 12800;
        this.field851 = 0;
        if (arg0 <= 101) {
            this.method441(-110, 68, -55);
        }
        field839++;
        this.field826 = 12800;
        for (class112 var2 = (class112) this.field830.method1532(-96); var2 != null; var2 = (class112) this.field830.method1523(-54)) {
            if (var2.field1497 < this.field826) {
                this.field826 = var2.field1497;
            }
            if (this.field851 < var2.field1484) {
                this.field851 = var2.field1484;
            }
            if (this.field850 < var2.field1504) {
                this.field850 = var2.field1504;
            }
            if (this.field846 > var2.field1494) {
                this.field846 = var2.field1494;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)[I")
    public final int[] method434(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            method436((byte) -25, -102);
        }
        field825++;
        for (class112 var5 = (class112) this.field830.method1532(-117); var5 != null; var5 = (class112) this.field830.method1523(-83)) {
            if (var5.method697(0, arg3, arg0, arg1)) {
                return var5.method692(arg1, arg0, (byte) 15);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
    public static final void method435(boolean arg0, int arg1) {
        class110.field1475 = 0;
        class99.field1331 = -1;
        class188.field2692 = -1;
        class117.field1645 = null;
        class296.field4676 = 1;
        field845++;
        class177.field2517 = arg0;
        class226.field3176 = arg1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
    public static final void method436(byte arg0, int arg1) {
        field841++;
        if (arg1 == -1 || !class238.method1549((byte) -93, arg1)) {
            return;
        }
        class82[] var2 = class123.field1767[arg1];
        int var3 = -26 % ((-arg0 - 24) / 35);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class82 var5 = var2[var4];
            if (var5.field1005 != null) {
                class11 var6 = new class11();
                var6.field145 = var5;
                var6.field143 = var5.field1005;
                class16.method98(2000000, 45, var6);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZZ)V")
    public static final void method437(int arg0, int arg1, boolean arg2, boolean arg3) {
        field832++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class206.field2935 = arg0;
        class50.field571 = arg1;
        if (!arg3) {
            method438(94, 100, (byte) -33, -12, -111, 42);
        }
        class152.field2211 = arg2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIBIII)V")
    public static final void method438(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field849++;
        int var6 = arg0 - arg1;
        int var7 = arg5 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class164.method1077((byte) 68, arg3, arg1, arg0, arg4);
            }
        } else if (var6 == 0) {
            class139.method906(arg4, arg5, true, arg3, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                arg4 = arg1;
                int var10 = arg5;
                arg5 = arg0;
                arg0 = var10;
                arg1 = var9;
            }
            if (arg5 < arg4) {
                int var11 = arg4;
                arg4 = arg5;
                arg5 = var11;
                int var12 = arg1;
                arg1 = arg0;
                arg0 = var12;
            }
            int var13 = arg1;
            int var14 = arg5 - arg4;
            int var15 = arg0 - arg1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            if (arg2 != 79) {
                method439(111);
            }
            int var17 = arg1 < arg0 ? 1 : -1;
            if (var8) {
                for (int var18 = arg4; var18 <= arg5; var18++) {
                    var16 += var15;
                    class268.field3919[var18][var13] = arg3;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg5; var19++) {
                    class268.field3919[var13][var19] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)I")
    public static final int method439(int arg0) {
        if (arg0 != -1814797368) {
            method436((byte) -71, -90);
        }
        field828++;
        return ((class137.field1989 == 0 ? 0 : 1) << 21) + ((class254.field3663 == 0 ? 0 : 1) << 20) + (class188.field2698 << 17) + ((class3.field39 ? 1 : 0) << 8) + ((class165.field2370 ? 1 : 0) << 4) + (class204.field2906 & 0x7) + ((class14.field174 ? 1 : 0) << 16) + ((class287.field4461 ? 1 : 0) << 19) + (((class95.field1277 == 0 ? 0 : 1) << 22) - -(class162.method1070() << 23)) - (-((class269.field3936 ? 1 : 0) << 3) + -((class149.field2169 ? 1 : 0) << 5) + -((class94.field1258 ? 1 : 0) << 6) - ((class164.field2353 ? 1 : 0) << 7) + -((class234.field3375 ? 1 : 0) << 9) + -((class284.field4342 ? 1 : 0) << 10) - ((class99.field1347 & 0x3 << 11) - -((class91.field1241 ? 1 : 0) << 13) - -((class193.field2772 ? 1 : 0) << 15)));
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
    public static final void method440(byte arg0) {
        if (arg0 < 10) {
            method438(90, 12, (byte) -29, -82, -91, -86);
        }
        if (class35.field414 < class273.field4042) {
            class35.field414 = (float) ((double) class35.field414 / 30.0D + (double) class35.field414);
            if (class273.field4042 < class35.field414) {
                class35.field414 = class273.field4042;
            }
            class199.method1281(-1);
        } else if (class273.field4042 < class35.field414) {
            class35.field414 = (float) ((double) class35.field414 - (double) class35.field414 / 30.0D);
            if (class273.field4042 > class35.field414) {
                class35.field414 = class273.field4042;
            }
            class199.method1281(-1);
        }
        if (class274.field4103 != -1 && class294.field4647 != -1) {
            int var1 = class274.field4103 - class261.field3800;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class261.field3800 -= -var1;
            int var2 = class294.field4647 - class271.field3963;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class294.field4647 = -1;
                class274.field4103 = -1;
            }
            class271.field3963 -= -var2;
            class199.method1281(-1);
        }
        field824++;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(III)[I")
    public final int[] method441(int arg0, int arg1, int arg2) {
        if (arg0 < 12) {
            method438(20, -106, (byte) 48, -70, 39, -104);
        }
        field827++;
        for (class112 var4 = (class112) this.field830.method1532(-93); var4 != null; var4 = (class112) this.field830.method1523(-107)) {
            if (var4.method698(arg2, arg1, (byte) 125)) {
                return var4.method691((byte) 102, arg1, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)[I")
    public final int[] method442(int arg0, int arg1, int arg2) {
        field848++;
        class112 var4 = (class112) this.field830.method1532(arg2 ^ 0x3300);
        if (arg2 != -13135) {
            this.field850 = 49;
        }
        while (var4 != null) {
            if (var4.method693(arg0, arg1, (byte) 121)) {
                return var4.method692(arg1, arg0, (byte) 15);
            }
            var4 = (class112) this.field830.method1523(-125);
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class71(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field835 = arg4;
        this.field833 = arg3;
        this.field842 = arg0;
        this.field843 = arg5;
        this.field838 = arg1;
        this.field852 = arg2;
        this.field829 = arg6;
        if (this.field829 == 255) {
            this.field829 = 0;
        }
        this.field830 = new class234();
    }
}

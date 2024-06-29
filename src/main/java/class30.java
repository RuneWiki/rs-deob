import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 extends class96 {

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "[Lt;")
    public class113[] field846 = new class113[5];

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "[I")
    public int[] field831 = new int[5];

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    public int field859 = 0;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field825 = 78;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field839 = -1;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Lwb;")
    public static class130 field827 = class26.method212("Empf-=nger:", -32376);

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "Lwb;")
    public static class130 field853 = class26.method212("(U4", -32376);

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lwb;")
    public static class130 field856 = class26.method212(" )2> @whi@", -32376);

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "Lrc;")
    public class105 field843;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Lw;")
    public class128 field830;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "Lee;")
    public class30 field842;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Lfe;")
    public static class36 field824;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "Lib;")
    public class50 field850;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Ljd;")
    public class58 field836;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "Lk;")
    public static class60 field851;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Lka;")
    public class61 field829;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "Lle;")
    public class71 field848;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Z")
    public boolean field841;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "Z")
    public boolean field844;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Z")
    public boolean field852;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "[I")
    public static int[] field849;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 8)
    public static final void method242(int arg0) {
        try {
            if (arg0 != 14425) {
                method243(-18, 42, -41);
            }
            Graphics var1 = class84.field2003.getGraphics();
            class79.field1911.method187(4, var1, arg0 ^ 0xFFFFAF6F, 550);
        } catch (Exception var2) {
            class84.field2003.repaint();
        }
        field854++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method243(int arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        field826++;
        if (arg2 != -2661) {
            return true;
        }
        class109 var3 = class32.method256(arg2 + 2667, arg1);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method825(arg2 ^ 0xA29, arg0);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V", line = 55)
    public class30(int arg0, int arg1, int arg2) {
        this.field857 = arg2;
        this.field845 = arg1;
        this.field832 = this.field840 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwb;BLwb;Lwb;)V", line = 94)
    public static final void method244(class130 arg0, byte arg1, class130 arg2, class130 arg3) {
        if (arg1 >= 39) {
            field855++;
            class124.field3003 = arg3;
            class124.field3011 = arg0;
            class124.field3009 = arg2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 114)
    public static final void method245(int arg0) {
        field847++;
        if (class63.field1605 > 0) {
            class63.field1605--;
        }
        if (class36.field1078 > 1) {
            class36.field1078--;
        }
        if (class15.field421) {
            class15.field421 = false;
            class8.method64(-128);
            return;
        }
        for (int var1 = 0; var1 < 100 && class3.method15(true); var1++) {
        }
        if (class40.field1109 != 30 && class40.field1109 != 35) {
            return;
        }
        if (class33.field916 && class40.field1109 == 30) {
            class9.field296 = 0;
            class119.field2921 = 0;
            while (class59.method483(true)) {
            }
            for (int var2 = 0; var2 < class81.field1939.length; var2++) {
                class81.field1939[var2] = false;
            }
        }
        class8.method58((byte) -125, class14.field406, 10);
        Object var3 = class117.field2892.field310;
        synchronized (class117.field2892.field310) {
            if (!class32.field891) {
                class117.field2892.field318 = 0;
            } else if (class119.field2921 != 0 || class117.field2892.field318 >= 40) {
                class14.field406.method727(204, arg0 - 110);
                class14.field406.method330(-1, 0);
                class60.field1548++;
                int var4 = class14.field406.field1057;
                int var5 = 0;
                for (int var6 = 0; var6 < class117.field2892.field318 && class14.field406.field1057 - var4 < 240; var6++) {
                    var5++;
                    int var7 = class117.field2892.field316[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class117.field2892.field317[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class117.field2892.field316[var6] == -1 && class117.field2892.field317[var6] == -1) {
                        var7 = -1;
                        var8 = -1;
                        var9 = 524287;
                    }
                    if (class10.field343 != var8 || class75.field1890 != var7) {
                        int var10 = var7 - class75.field1890;
                        int var11 = var8 - class10.field343;
                        class75.field1890 = var7;
                        class10.field343 = var8;
                        if (class51.field1340 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class14.field406.method353((var11 << 6) + (class51.field1340 << 12) + var10, arg0 ^ 0xFFFF00FF);
                            class51.field1340 = 0;
                        } else if (class51.field1340 < 8) {
                            class14.field406.method339((class51.field1340 << 19) + var9 + 8388608, arg0 ^ 0xA84E3CF);
                            class51.field1340 = 0;
                        } else {
                            class14.field406.method325(-405801808, (class51.field1340 << 19) + var9 - 1073741824);
                            class51.field1340 = 0;
                        }
                    } else if (class51.field1340 < 2047) {
                        class51.field1340++;
                    }
                }
                class14.field406.method359(class14.field406.field1057 - var4, 7);
                if (var5 < class117.field2892.field318) {
                    class117.field2892.field318 -= var5;
                    for (int var12 = 0; var12 < class117.field2892.field318; var12++) {
                        class117.field2892.field317[var12] = class117.field2892.field317[var12 + var5];
                        class117.field2892.field316[var12] = class117.field2892.field316[var12 + var5];
                    }
                } else {
                    class117.field2892.field318 = 0;
                }
            }
        }
        if (~class119.field2921 != arg0) {
            class8.field285++;
            long var13 = (class4.field170 - class17.field480) / 50L;
            class17.field480 = class4.field170;
            int var15 = class105.field2558;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = class35.field988;
            byte var17 = 0;
            if (class119.field2921 == 2) {
                var17 = 1;
            }
            int var18 = (int) var13;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            class14.field406.method727(7, 80);
            int var19 = var16 * 765 + var15;
            class14.field406.method340((var17 << 19) + (var18 << 20) + var19, -65);
        }
        if (class2.field58 > 0) {
            class2.field58--;
        }
        if (class81.field1939[96] || class81.field1939[97] || class81.field1939[98] || class81.field1939[99]) {
            class64.field1640 = true;
        }
        if (class64.field1640 && class2.field58 <= 0) {
            class64.field1640 = false;
            class85.field2029++;
            class2.field58 = 20;
            class14.field406.method727(174, -86);
            class14.field406.method371(94, class72.field1850);
            class14.field406.method371(67, class3.field80);
        }
        if (class120.field2944 && !class9.field294) {
            class9.field294 = true;
            class45.field1229++;
            class14.field406.method727(212, arg0 ^ 0x74);
            class14.field406.method330(-1, 1);
        }
        if (!class120.field2944 && class9.field294) {
            class45.field1229++;
            class9.field294 = false;
            class14.field406.method727(212, 122);
            class14.field406.method330(-1, 0);
        }
        class17.method140(14);
        if (class40.field1109 != 30 && class40.field1109 != 35) {
            return;
        }
        class40.method392(true);
        class29.method238(19468);
        class130.field3101++;
        if (class130.field3101 > 750) {
            class8.method64(arg0 - 126);
            return;
        }
        class88.method655(-128);
        class8.method67(-101);
        class4.method26((byte) -128);
        if (class101.field2426 != 0) {
            class98.field2372 += 20;
            if (class98.field2372 >= 400) {
                class101.field2426 = 0;
            }
        }
        class31.field860++;
        if (class1.field12 != 0) {
            class40.field1139++;
            if (class40.field1139 >= 15) {
                if (class1.field12 == 2) {
                    class20.field585 = true;
                }
                if (class1.field12 == 3) {
                    class129.field3047 = true;
                }
                class1.field12 = 0;
            }
        }
        if (class46.field1246 != 0) {
            class15.field422++;
            if (class19.field568 + 5 < class18.field483 || class19.field568 - 5 > class18.field483 || class8.field276 + 5 < class101.field2429 || class101.field2429 < class8.field276 - 5) {
                class7.field247 = true;
            }
            if (class9.field296 == 0) {
                if (class46.field1246 == 2) {
                    class20.field585 = true;
                }
                if (class46.field1246 == 3) {
                    class129.field3047 = true;
                }
                class46.field1246 = 0;
                if (class7.field247 && class15.field422 >= 5) {
                    class8.field262 = -1;
                    class79.method607(-25634);
                    if (class95.field2309 == class8.field262 && class119.field2917 != class109.field2631) {
                        class18.field488++;
                        class3 var20 = class31.method248(arg0 ^ 0xFFFF0000, class95.field2309);
                        byte var21 = 0;
                        if (class45.field1224 == 1 && var20.field111 == 206) {
                            var21 = 1;
                        }
                        if (var20.field72[class119.field2917] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field108) {
                            int var24 = class119.field2917;
                            int var25 = class109.field2631;
                            var20.field72[var24] = var20.field72[var25];
                            var20.field140[var24] = var20.field140[var25];
                            var20.field72[var25] = -1;
                            var20.field140[var25] = 0;
                        } else if (var21 == 1) {
                            int var22 = class109.field2631;
                            int var23 = class119.field2917;
                            while (var22 != var23) {
                                if (var23 < var22) {
                                    var20.method16(17, var22, var22 - 1);
                                    var22--;
                                } else if (var23 > var22) {
                                    var20.method16(arg0 ^ 0xFFFFFFEE, var22, var22 + 1);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method16(arg0 + 18, class109.field2631, class119.field2917);
                        }
                        class14.field406.method727(188, -120);
                        class14.field406.method330(-1, var21);
                        class14.field406.method329(class119.field2917, 943423208);
                        class14.field406.method347(class109.field2631, -75);
                        class14.field406.method334(class95.field2309, -739021656);
                    }
                } else if ((class117.field2893 == 1 || class27.method220(arg0 ^ 0xFFFFFF83, class26.field757 - 1)) && class26.field757 > 2) {
                    class93.method695((byte) -113);
                } else if (class26.field757 > 0) {
                    class109.method828(true, class26.field757 - 1);
                }
                class40.field1139 = 10;
                class119.field2921 = 0;
            }
        }
        if (class34.field926 != -1) {
            int var26 = class34.field941;
            int var27 = class34.field926;
            boolean var28 = class18.method147(0, class42.field1179.field2107[0], 0, 0, 0, 0, true, 0, true, var27, class42.field1179.field2079[0], var26);
            class34.field926 = -1;
            if (var28) {
                class98.field2372 = 0;
                class101.field2426 = 1;
                class85.field2027 = class105.field2558;
                class20.field594 = class35.field988;
            }
        }
        if (class119.field2921 == 1 && class109.field2676 != null) {
            class109.field2676 = null;
            class129.field3047 = true;
            class119.field2921 = 0;
        }
        class35.method322((byte) -107);
        if (class112.field2768 == -1) {
            class20.method182((byte) -127);
            class75.method587(-31315);
            class113.method867(-124);
        }
        if (class79.field1924 == -1 && class83.field1962 == -1 && class52.field1364 == -1) {
            if (class37.field1087 > 0) {
                class37.field1087--;
            }
        } else if (class37.field1087 < class19.field566) {
            class37.field1087++;
            if (class37.field1087 == class19.field566) {
                if (class83.field1962 != -1) {
                    class20.field585 = true;
                }
                if (class79.field1924 != -1) {
                    class129.field3047 = true;
                }
            }
        }
        if (class9.field296 == 1 || class119.field2921 == 1) {
            class108.field2611++;
        }
        class36.method368(100);
        if (class40.field1140) {
            class69.method562(-15);
        }
        for (int var29 = 0; var29 < 5; var29++) {
            int var10002 = class128.field3027[var29]++;
        }
        class112.method859((byte) 96);
        int var30 = class93.method697(false);
        int var31 = class21.method194((byte) 28);
        if (var30 > 4500 && var31 > 4500) {
            class63.field1605 = 250;
            class61.field1573++;
            class2.method9(4000, (byte) -50);
            class14.field406.method727(145, arg0 ^ 0xFFFFFF8E);
        }
        class92.field2208++;
        class32.field895++;
        class128.field3036++;
        if (class128.field3036 > 500) {
            class128.field3036 = 0;
            int var32 = (int) (Math.random() * 8.0D);
            if ((var32 & 0x4) == 4) {
                class95.field2305 += class59.field1483;
            }
            if ((var32 & 0x2) == 2) {
                client.field547 += class105.field2544;
            }
            if ((var32 & 0x1) == 1) {
                class123.field2984 += class32.field892;
            }
        }
        if (client.field547 < -55) {
            class105.field2544 = 2;
        }
        if (client.field547 > 55) {
            class105.field2544 = -2;
        }
        if (class32.field895 > 500) {
            class32.field895 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class85.field2041 += class45.field1223;
            }
            if ((var33 & 0x2) == 2) {
                class115.field2825 += class84.field1982;
            }
        }
        if (class123.field2984 < -50) {
            class32.field892 = 2;
        }
        if (class123.field2984 > 50) {
            class32.field892 = -2;
        }
        if (class115.field2825 < -20) {
            class84.field1982 = 1;
        }
        if (class85.field2041 < -60) {
            class45.field1223 = 2;
        }
        if (class115.field2825 > 10) {
            class84.field1982 = -1;
        }
        if (class95.field2305 < -40) {
            class59.field1483 = 1;
        }
        if (class95.field2305 > 40) {
            class59.field1483 = -1;
        }
        if (class85.field2041 > 60) {
            class45.field1223 = -2;
        }
        if (class92.field2208 > 50) {
            class29.field811++;
            class14.field406.method727(196, 110);
        }
        try {
            if (class47.field1255 != null && class14.field406.field1057 > 0) {
                class47.field1255.method145(0, class14.field406.field1057, 0, class14.field406.field1067);
                class92.field2208 = 0;
                class14.field406.field1057 = 0;
            }
        } catch (IOException var34) {
            class8.method64(-112);
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 706)
    public static void method246(int arg0) {
        field849 = null;
        field851 = null;
        field827 = null;
        if (arg0 <= 86) {
            method243(122, -65, 100);
        }
        field853 = null;
        field824 = null;
        field856 = null;
    }
}

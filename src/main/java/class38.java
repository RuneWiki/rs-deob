import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class38 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lja;")
    public static class62 field883 = class30.method243(43, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    public static int[] field884 = new int[25];

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lja;")
    public static class62 field886 = class30.method243(43, "sl_flags");

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lo;")
    public static class100 field879 = new class100(5000);

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lja;")
    public static class62 field889 = class30.method243(43, "sch-Utteln:");

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lja;")
    private static class62 field890 = class30.method243(43, " from your ignore list first");

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lja;")
    public static class62 field892 = class30.method243(43, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lja;")
    public static class62 field891 = field890;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
    public static int[] field894 = new int[2048];

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lja;")
    public static class62 field895 = class30.method243(43, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lpd;")
    public static class108 field896;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lhe;")
    public static class54 field882;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field893;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[I")
    public static int[] field888;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
    public static final boolean method288(int arg0, int arg1) {
        if (arg0 != 5) {
            field889 = null;
        }
        field881++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lrc;")
    public static final class120 method289(int arg0, int arg1) {
        field885++;
        class120 var2 = (class120) class130.field2968.method129((long) arg0, 24838);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field3543.method867(13, 15, arg0);
        class120 var4 = new class120();
        if (arg1 != 2116) {
            method292(null, -27, (byte) -58);
        }
        var4.field2749 = arg0;
        if (var3 != null) {
            var4.method957((byte) -109, new class128(var3));
        }
        class130.field2968.method128((byte) -66, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method290(byte arg0) {
        field889 = null;
        field892 = null;
        field893 = null;
        field882 = null;
        field884 = null;
        field879 = null;
        field883 = null;
        field891 = null;
        field894 = null;
        field886 = null;
        field888 = null;
        field890 = null;
        int var1 = -60 % ((33 - arg0) / 56);
        field895 = null;
        field896 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method291(int arg0) {
        field880++;
        if (class85.field2048 == 0) {
            class119.field2703 = new class69(4, 104, 104, class7.field214);
            for (int var1 = 0; var1 < 4; var1++) {
                class131.field2991[var1] = new class155(104, 104);
            }
            class135.field3106 = new class58(512, 512);
            class7.field208 = class39.field910;
            class83.field2005 = 5;
            class85.field2048 = 20;
        } else if (class85.field2048 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class66.field1647[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class69.method567(var2, 500, 800, 512, 334);
            class85.field2048 = 30;
            class83.field2005 = 10;
            class7.field208 = class20.field466;
        } else if (class85.field2048 == 30) {
            class142.field3325 = class17.method118(true, false, 0, true, (byte) -90);
            class46.field1056 = class17.method118(true, false, 1, true, (byte) -90);
            class111.field2552 = class17.method118(true, true, 2, false, (byte) -90);
            class63.field1546 = class17.method118(true, false, 3, true, (byte) -90);
            class88.field2086 = class17.method118(true, false, 4, true, (byte) -90);
            class17.field399 = class17.method118(true, true, 5, true, (byte) -90);
            class31.field761 = class17.method118(false, true, 6, true, (byte) -90);
            class79.field1923 = class17.method118(true, false, 7, true, (byte) -90);
            class149.field3504 = class17.method118(true, false, 8, true, (byte) -90);
            class134.field3095 = class17.method118(true, false, 9, true, (byte) -90);
            class77.field1902 = class17.method118(true, false, 10, true, (byte) -90);
            class53.field1218 = class17.method118(true, false, 11, true, (byte) -90);
            class70.field1798 = class17.method118(true, false, 12, true, (byte) -90);
            class57.field1401 = class17.method118(true, true, 13, false, (byte) -90);
            class146.field3449 = class17.method118(false, false, 14, true, (byte) -90);
            class5.field107 = class17.method118(true, false, 15, true, (byte) -90);
            class83.field2005 = 20;
            class7.field208 = class57.field1395;
            class85.field2048 = 40;
        } else if (class85.field2048 == 40) {
            byte var7 = 0;
            int var8 = var7 + class142.field3325.method233(-49) * 4 / 100;
            int var9 = var8 + class46.field1056.method233(-46) * 4 / 100;
            int var10 = var9 + class111.field2552.method233(-71) * 2 / 100;
            int var11 = var10 + class63.field1546.method233(-88) * 2 / 100;
            int var12 = var11 + class88.field2086.method233(-89) * 6 / 100;
            int var13 = var12 + class17.field399.method233(-61) * 4 / 100;
            int var14 = var13 + class31.field761.method233(-125) * 2 / 100;
            int var15 = var14 + class79.field1923.method233(-82) * 60 / 100;
            int var16 = var15 + class149.field3504.method233(-62) * 2 / 100;
            int var17 = var16 + class134.field3095.method233(-68) * 2 / 100;
            int var18 = var17 + class77.field1902.method233(-90) * 2 / 100;
            int var19 = var18 + class53.field1218.method233(-80) * 2 / 100;
            int var20 = var19 + class70.field1798.method233(-45) * 2 / 100;
            int var21 = var20 + class57.field1401.method233(-55) * 2 / 100;
            int var22 = var21 + class146.field3449.method233(-72) * 2 / 100;
            int var23 = var22 + class5.field107.method233(-81) * 2 / 100;
            if (var23 == 100) {
                class7.field208 = class35.field839;
                class83.field2005 = 30;
                class85.field2048 = 45;
            } else {
                if (var23 != 0) {
                    class7.field208 = class70.method594(new class62[] { class13.field316, class31.method249(true, var23), class52.field1193 }, 1229);
                }
                class83.field2005 = 30;
            }
        } else if (class85.field2048 == 45) {
            class26.method206(2, (byte) 73, !class144.field3361, 22050);
            class5 var24 = new class5();
            var24.method45(arg0 ^ 0xFFFF9740, 128, 9);
            class85.field2036 = class94.method723(class9.field240, class148.field3481, (byte) -114, 0, 22050);
            class85.field2036.method393(var24, -7764);
            class77.method619(class146.field3449, class88.field2086, true, var24, class5.field107);
            class82.field1980 = class94.method723(class9.field240, class148.field3481, (byte) -114, 1, 2048);
            class98.field2293 = new class25();
            class82.field1980.method393(class98.field2293, -7764);
            class100.field2316 = new class85(22050, class144.field3371);
            class85.field2048 = 50;
            class7.field208 = class67.field1667;
            class83.field2005 = 35;
        } else if (class85.field2048 == 50) {
            int var25 = 0;
            if (class65.field1611 == null) {
                class65.field1611 = class97.method754(class83.field1991, class43.field1001, arg0 ^ 0x2C, class149.field3504);
            } else {
                var25++;
            }
            if (class86.field2067 == null) {
                class86.field2067 = class97.method754(class83.field1991, class122.field2801, arg0 ^ 0x64, class149.field3504);
            } else {
                var25++;
            }
            if (class70.field1789 == null) {
                class70.field1789 = class97.method754(class83.field1991, class27.field677, 72, class149.field3504);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class7.field208 = class70.method594(new class62[] { class67.field1678, class31.method249(true, var25 * 100 / 3), class52.field1193 }, 1229);
                class83.field2005 = 40;
            } else {
                class7.field208 = class45.field1022;
                class83.field2005 = 40;
                class85.field2048 = 60;
            }
        } else if (class85.field2048 == 60) {
            int var26 = class146.method1164(class77.field1902, class149.field3504, (byte) 56);
            int var27 = class86.method669(false);
            if (var27 > var26) {
                class7.field208 = class70.method594(new class62[] { class63.field1573, class31.method249(true, var26 * 100 / var27), class52.field1193 }, 1229);
                class83.field2005 = 50;
            } else {
                class7.field208 = class122.field2787;
                class83.field2005 = 50;
                class62.method473((byte) 94, 5);
                class85.field2048 = 70;
            }
        } else if (class85.field2048 != 70) {
            if (arg0 != 4) {
                field891 = null;
            }
            if (class85.field2048 == 80) {
                int var28 = 0;
                if (class121.field2772 == null) {
                    class121.field2772 = class110.method890(class83.field1991, class149.field3504, class63.field1576, arg0 + 1532);
                } else {
                    var28++;
                }
                if (class134.field3069 == null) {
                    class134.field3069 = class110.method890(class83.field1991, class149.field3504, class150.field3539, 1536);
                } else {
                    var28++;
                }
                if (class42.field960 == null) {
                    class42.field960 = class50.method348(class83.field1991, class45.field1020, class149.field3504, arg0 ^ 0x6);
                } else {
                    var28++;
                }
                if (class130.field2980 == null) {
                    class130.field2980 = class102.method819(class149.field3504, class83.field1991, class24.field602, 26425);
                } else {
                    var28++;
                }
                if (class9.field235 == null) {
                    class9.field235 = class102.method819(class149.field3504, class83.field1991, class118.field2688, 26425);
                } else {
                    var28++;
                }
                if (class10.field257 == null) {
                    class10.field257 = class102.method819(class149.field3504, class83.field1991, class67.field1673, arg0 ^ 0x673D);
                } else {
                    var28++;
                }
                if (class40.field928 == null) {
                    class40.field928 = class102.method819(class149.field3504, class83.field1991, class81.field1960, 26425);
                } else {
                    var28++;
                }
                if (class115.field2644 == null) {
                    class115.field2644 = class102.method819(class149.field3504, class83.field1991, class13.field317, arg0 ^ 0x673D);
                } else {
                    var28++;
                }
                if (class81.field1957 == null) {
                    class81.field1957 = class102.method819(class149.field3504, class83.field1991, class16.field382, 26425);
                } else {
                    var28++;
                }
                if (class110.field2522 == null) {
                    class110.field2522 = class102.method819(class149.field3504, class83.field1991, class149.field3521, 26425);
                } else {
                    var28++;
                }
                if (class3.field36 == null) {
                    class3.field36 = class102.method819(class149.field3504, class83.field1991, class17.field393, arg0 ^ 0x673D);
                } else {
                    var28++;
                }
                if (class67.field1674 == null) {
                    class67.field1674 = class50.method348(class83.field1991, class115.field2628, class149.field3504, 2);
                } else {
                    var28++;
                }
                if (class146.field3452 == null) {
                    class146.field3452 = class50.method348(class83.field1991, class119.field2733, class149.field3504, 2);
                } else {
                    var28++;
                }
                if (class130.field2974 == null) {
                    class130.field2974 = class93.method717(class149.field3504, class83.field1991, class72.field1825, -113);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class7.field208 = class70.method594(new class62[] { class50.field1151, class31.method249(true, var28 * 100 / 14), class52.field1193 }, arg0 + 1225);
                    class83.field2005 = 70;
                } else {
                    class89.field2117 = class146.field3452;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    class134.field3069.method418();
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 41.0D) - 20;
                    int var32 = (int) (Math.random() * 21.0D) - 10;
                    for (int var33 = 0; var33 < class130.field2980.length; var33++) {
                        class130.field2980[var33].method409(var29 + var31, var30 + var31, var31 + var32);
                    }
                    class42.field960[0].method933(var29 + var31, var30 + var31, var31 + var32);
                    class3.method10((byte) -119);
                    class85.field2048 = 90;
                    class83.field2005 = 70;
                    class7.field208 = class40.field937;
                }
            } else if (class85.field2048 == 90) {
                if (class134.field3095.method860(111)) {
                    class13 var34 = new class13(class134.field3095, class149.field3504, 20, 0.8D, class144.field3361 ? 64 : 128);
                    class66.method522(var34);
                    class66.method510(0.8D);
                    class83.field2005 = 90;
                    class85.field2048 = 110;
                    class7.field208 = class67.field1680;
                } else {
                    class7.field208 = class70.method594(new class62[] { class51.field1185, class31.method249(true, class134.field3095.method239(arg0 - 28034)), class52.field1193 }, 1229);
                    class83.field2005 = 90;
                }
            } else if (class85.field2048 == 110) {
                class124.field2837 = new class126();
                class148.field3481.method310(class124.field2837, 10, (byte) -1);
                class85.field2048 = 120;
                class7.field208 = class147.field3474;
                class83.field2005 = 94;
            } else if (class85.field2048 == 120) {
                if (class77.field1902.method879((byte) -20, class83.field1991, class150.field3536)) {
                    class70 var35 = new class70(class77.field1902.method870(class150.field3536, class83.field1991, true));
                    class22.method177(var35, 19316);
                    class7.field208 = class56.field1378;
                    class83.field2005 = 96;
                    class85.field2048 = 130;
                } else {
                    class7.field208 = class70.method594(new class62[] { class137.field3157, class5.field64 }, 1229);
                    class83.field2005 = 96;
                }
            } else if (class85.field2048 == 130) {
                if (!class63.field1546.method860(7)) {
                    class7.field208 = class70.method594(new class62[] { class42.field965, class31.method249(true, class63.field1546.method239(arg0 - 28034) * 4 / 5), class52.field1193 }, 1229);
                    class83.field2005 = 100;
                } else if (!class70.field1798.method860(100)) {
                    class7.field208 = class70.method594(new class62[] { class42.field965, class31.method249(true, class70.field1798.method239(-28030) / 6 + 80), class52.field1193 }, arg0 + 1225);
                    class83.field2005 = 100;
                } else if (class57.field1401.method860(123)) {
                    class85.field2048 = 140;
                    class7.field208 = class36.field856;
                    class83.field2005 = 100;
                } else {
                    class7.field208 = class70.method594(new class62[] { class42.field965, class31.method249(true, class57.field1401.method239(-28030) / 20 + 96), class52.field1193 }, 1229);
                    class83.field2005 = 100;
                }
            } else if (class85.field2048 == 140) {
                class62.method473((byte) 56, 10);
            }
        } else if (class111.field2552.method860(110)) {
            class131.method1059(class111.field2552, (byte) -92);
            class50.method351(8, class111.field2552);
            class54.method373(class111.field2552, -16998, class79.field1923);
            class111.method897(class144.field3361, class111.field2552, class79.field1923, 1);
            class153.method1191(class79.field1923, class111.field2552, true);
            class39.method296(true, class121.field2768, class111.field2552, class65.field1611, class79.field1923);
            class32.method250(class142.field3325, class46.field1056, class111.field2552, 0);
            class56.method387(class111.field2552, -7, class79.field1923);
            class132.method1062(class111.field2552, -736);
            class40.method300(class111.field2552, 13);
            class150.method1182(arg0 ^ 0xFF00FB, class79.field1923, class63.field1546, class149.field3504);
            class28.method227(class111.field2552, (byte) -105);
            class51.method356(0, class111.field2552);
            class85.field2048 = 80;
            class83.field2005 = 60;
            class7.field208 = class53.field1220;
        } else {
            class7.field208 = class70.method594(new class62[] { class54.field1338, class31.method249(true, class111.field2552.method239(-28030)), class52.field1193 }, 1229);
            class83.field2005 = 60;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lea;IB)V")
    public static final void method292(class29 arg0, int arg1, byte arg2) {
        if (arg2 > -2) {
            field888 = null;
        }
        field887++;
        if (class60.field1476 == null) {
            class85.method661(0, 255, 255, null, true, (byte) 0, -15);
            class29.field707[arg1] = arg0;
        } else {
            class60.field1476.field2873 = arg1 * 8 + 5;
            int var3 = class60.field1476.method1037(18834);
            int var4 = class60.field1476.method1037(18834);
            arg0.method240(true, var3, var4);
        }
    }
}

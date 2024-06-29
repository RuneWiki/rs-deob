import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class26 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lmb;")
    public static class132 field413 = class166.method1092("Bitte versuchen Sie es in ", 116);

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field425 = -1;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "J")
    public long field414;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lmf;")
    public class136 field411;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lmf;")
    public class136 field412;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lmf;")
    public class136 field423;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lpb;")
    public static class165 field422;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILii;)Lmb;")
    public static final class132 method191(int arg0, class96 arg1) {
        field417++;
        if (class8.method38(arg0 ^ 0xFFFFAFA4, class170.method1113(arg1, (byte) -50)) == 0) {
            return null;
        }
        if (arg0 != 20532) {
            method193(25, 66);
        }
        if (arg1.field1720 == null || arg1.field1720.method870((byte) -55).method902((byte) -4) == 0) {
            return class191.field3555 ? class185.field3427 : null;
        } else {
            return arg1.field1720;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lmb;")
    public static final class132 method192(int arg0, byte arg1) {
        class132 var2 = class132.method889(arg0, (byte) 105);
        for (int var3 = var2.method902((byte) -4) - 3; var3 > 0; var3 -= 3) {
            var2 = class187.method1197(new class132[] { var2.method886(arg1 + 14, 0, var3), class27.field440, var2.method873((byte) 58, var3) }, arg1 - 59);
        }
        if (arg1 != -15) {
            method196(-109);
        }
        field420++;
        if (var2.method902((byte) -4) > 9) {
            return class187.method1197(new class132[] { class39.field635, var2.method886(-1, 0, var2.method902((byte) -4) - 8), class139.field2614, class21.field304, var2, class235.field4235 }, -112);
        } else if (var2.method902((byte) -4) > 6) {
            return class187.method1197(new class132[] { class77.field1328, var2.method886(arg1 ^ 0xE, 0, var2.method902((byte) -4) - 4), class243.field4441, class21.field304, var2, class235.field4235 }, -103);
        } else {
            return class187.method1197(new class132[] { class12.field164, var2, class60.field1018 }, -94);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
    public static final boolean method193(int arg0, int arg1) {
        field418++;
        if (arg0 > -5) {
            field413 = null;
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZZIIZ)Lvi;")
    public static final class233 method194(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field419++;
        class243 var8 = class58.method389(0, arg2);
        if (arg1 > 1 && var8.field4412 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field4400[var10] && var8.field4400[var10] != 0) {
                    var9 = var8.field4412[var10];
                }
            }
            if (var9 != -1) {
                var8 = class58.method389(0, var9);
            }
        }
        class242 var11 = var8.method1558(128);
        if (var11 == null) {
            return null;
        }
        class233 var12 = null;
        if (~var8.field4423 != arg5) {
            var12 = method194(1, 10, var8.field4406, false, true, 0, 0, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4428 != -1) {
            var12 = method194(arg0, arg1, var8.field4451, false, true, 0, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class239.field4308;
        int var14 = class239.field4313;
        int var15 = class239.field4314;
        int[] var16 = new int[4];
        class239.method1520(var16);
        class18 var17 = new class18(36, 32);
        class239.method1533(var17.field263, 36, 32);
        class239.method1515();
        class50.method336();
        class50.method332(16, 16);
        class50.field845 = false;
        if (var8.field4428 != -1) {
            var12.method103(0, 0);
        }
        int var18 = var8.field4435;
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class50.field851[var8.field4431] * var18 >> 16;
        int var20 = class50.field853[var8.field4431] * var18 >> 16;
        var11.method1388(0, var8.field4413, var8.field4392, var8.field4431, var8.field4393, var20 + var8.field4424 - var11.method55() / 2, var19 - -var8.field4424);
        if (var8.field4428 == -1) {
            if (arg0 >= 1) {
                var17.method96(1);
            }
            if (arg0 >= 2) {
                var17.method96(16777215);
            }
            if (arg6 != 0) {
                var17.method105(arg6);
            }
        }
        class239.method1533(var17.field263, 36, 32);
        if (var8.field4423 != -1) {
            var12.method103(0, 0);
        }
        if (arg3 && (var8.field4427 == 1 || arg1 != 1) && arg1 != -1) {
            class10.field117.method670(class89.method556(arg5 ^ 0xFFFFFFA4, arg1), 0, 9, 16776960, 1);
        }
        class239.method1533(var13, var14, var15);
        class239.method1530(var16);
        class50.method336();
        class50.field845 = true;
        return var17;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
    public static final void method195(int arg0, int arg1) {
        field415++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class162.field2940[arg1];
        long var3 = class165.field2971[arg1];
        int var5 = (int) class165.field2971[arg1];
        int var6 = class31.field488[arg1];
        int var7 = class111.field2097[arg1];
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 22 || var6 == 1003) {
            class238.method1508(var2, 571, var5, var7, class95.field1679[arg1]);
        }
        if (var6 == 58) {
            class47.field805++;
            class64.field1054.method660(226, 3);
            class64.field1054.method726((byte) -15, var7);
            class96 var8 = class158.method1029((byte) -94, var7);
            if (var8.field1787 != null && var8.field1787[0][0] == 5) {
                int var9 = var8.field1787[0][1];
                if (class77.field1315[var9] != var8.field1689[0]) {
                    class77.field1315[var9] = var8.field1689[0];
                    class16.method85(var9, (byte) 37);
                }
            }
        }
        if (var6 == 12) {
            class159 var10 = class68.field1120[var5];
            if (var10 != null) {
                class61.field1028++;
                class37.method265(1, 0, class210.field3854.field703[0], false, 72, 0, 1, var10.field703[0], 2, var10.field676[0], 0, class210.field3854.field676[0]);
                class89.field1565 = class48.field826;
                class125.field2321 = class189.field3501;
                class194.field3612 = 0;
                class149.field2734 = 2;
                class64.field1054.method660(229, 3);
                class64.field1054.method741(-81, var5);
            }
        }
        if (var6 == 1005) {
            class149.field2734 = 2;
            class194.field3612 = 0;
            class86.field1495++;
            class125.field2321 = class189.field3501;
            class89.field1565 = class48.field826;
            class64.field1054.method660(140, 3);
            class64.field1054.method764(var5, 10432);
        }
        if (var6 == 1006) {
            class19.field277++;
            class149.field2734 = 2;
            class89.field1565 = class48.field826;
            class194.field3612 = 0;
            class125.field2321 = class189.field3501;
            class64.field1054.method660(175, 3);
            class64.field1054.method741(-112, var5);
        }
        if (var6 == 51) {
            class43.field766++;
            boolean var11 = class37.method265(0, 0, class210.field3854.field703[0], false, -72, 0, 0, var2, 2, var7, 0, class210.field3854.field676[0]);
            if (!var11) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -106, 0, 1, var2, 2, var7, 0, class210.field3854.field676[0]);
            }
            class194.field3612 = 0;
            class125.field2321 = class189.field3501;
            class89.field1565 = class48.field826;
            class149.field2734 = 2;
            class64.field1054.method660(163, 3);
            class64.field1054.method760(var7 + class168.field3082, (byte) -78);
            class64.field1054.method715(42, var2 + class129.field2389);
            class64.field1054.method764(var5, 10432);
        }
        if (var6 == 46) {
            class159 var13 = class68.field1120[var5];
            if (var13 != null) {
                class17.field246++;
                class37.method265(1, 0, class210.field3854.field703[0], false, -105, 0, 1, var13.field703[0], 2, var13.field676[0], 0, class210.field3854.field676[0]);
                class89.field1565 = class48.field826;
                class149.field2734 = 2;
                class125.field2321 = class189.field3501;
                class194.field3612 = 0;
                class64.field1054.method660(76, 3);
                class64.field1054.method764(var5, 10432);
            }
        }
        if (var6 == 25) {
            class94.field1648++;
            class64.field1054.method660(223, 3);
            class64.field1054.method715(33, var5);
            class64.field1054.method760(var2, (byte) -67);
            class64.field1054.method752((byte) 61, var7);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -126, var7);
            class16.field235 = var2;
        }
        if (var6 == 26) {
            class65 var14 = class11.field145[var5];
            if (var14 != null) {
                class150.field2746++;
                class37.method265(1, 0, class210.field3854.field703[0], false, 76, 0, 1, var14.field703[0], 2, var14.field676[0], 0, class210.field3854.field676[0]);
                class125.field2321 = class189.field3501;
                class194.field3612 = 0;
                class89.field1565 = class48.field826;
                class149.field2734 = 2;
                class64.field1054.method660(86, 3);
                class64.field1054.method741(59, var5);
            }
        }
        if (var6 == 1001) {
            class96 var15 = class158.method1029((byte) -97, var7);
            if (var15 == null || var15.field1722[var2] < 100000) {
                class64.field1054.method660(140, 3);
                class64.field1054.method764(var5, 10432);
                class86.field1495++;
            } else {
                class169.method1108(-67, class187.method1197(new class132[] { class132.method889(var15.field1722[var2], (byte) 94), class134.field2531, class58.method389(0, var5).field4399 }, -71), 0, class75.field1247);
            }
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -120, var7);
            class16.field235 = var2;
        }
        if (var6 == 40) {
            class65 var16 = class11.field145[var5];
            if (var16 != null) {
                class173.field3227++;
                class37.method265(1, 0, class210.field3854.field703[0], false, 62, 0, 1, var16.field703[0], 2, var16.field676[0], 0, class210.field3854.field676[0]);
                class149.field2734 = 2;
                class125.field2321 = class189.field3501;
                class194.field3612 = 0;
                class89.field1565 = class48.field826;
                class64.field1054.method660(174, 3);
                class64.field1054.method741(100, var5);
            }
        }
        if (var6 == 16) {
            class159 var17 = class68.field1120[var5];
            if (var17 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -84, 0, 1, var17.field703[0], 2, var17.field676[0], 0, class210.field3854.field676[0]);
                class125.field2321 = class189.field3501;
                class194.field3612 = 0;
                class147.field2716++;
                class89.field1565 = class48.field826;
                class149.field2734 = 2;
                class64.field1054.method660(95, 3);
                class64.field1054.method741(58, class69.field1160);
                class64.field1054.method715(72, var5);
                class64.field1054.method741(-117, class67.field1111);
                class64.field1054.method725(class112.field2179, -24475);
            }
        }
        if (var6 == 23) {
            class115.field2196++;
            class64.field1054.method660(206, 3);
            class64.field1054.method715(95, var2);
            class64.field1054.method761(class166.field3033, -416174544);
            class64.field1054.method752((byte) 61, var7);
            class64.field1054.method760(var5, (byte) -93);
            class64.field1054.method741(96, class231.field4172);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -121, var7);
            class16.field235 = var2;
        }
        if (var6 == 19) {
            class65.field1076++;
            class64.field1054.method660(13, 3);
            class64.field1054.method726((byte) 117, var7);
            class64.field1054.method741(97, var2);
            class64.field1054.method741(-103, var5);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -125, var7);
            class16.field235 = var2;
        }
        if (var6 == 48) {
            class159 var18 = class68.field1120[var5];
            if (var18 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -76, 0, 1, var18.field703[0], 2, var18.field676[0], 0, class210.field3854.field676[0]);
                class89.field1565 = class48.field826;
                class125.field2321 = class189.field3501;
                class149.field2734 = 2;
                class194.field3612 = 0;
                class88.field1541++;
                class64.field1054.method660(142, 3);
                class64.field1054.method715(66, var5);
            }
        }
        if (var6 == 31) {
            class96 var19 = class102.method631((byte) 72, var2, var7);
            if (var19 != null) {
                class130.method857(1);
                class111.method704(var2, false, class8.method38(-121, class170.method1113(var19, (byte) -50)), var7);
                class106.field1984 = 0;
                class138.field2589 = method191(20532, var19);
                if (class138.field2589 == null) {
                    class138.field2589 = class160.field2910;
                }
                if (!var19.field1766) {
                    class160.field2914 = class187.method1197(new class132[] { class196.field3639, var19.field1828, class123.field2312 }, -79);
                    return;
                }
                class160.field2914 = class187.method1197(new class132[] { var19.field1738, class123.field2312 }, -76);
            }
            return;
        }
        if (var6 == 41) {
            class65 var20 = class11.field145[var5];
            if (var20 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -118, 0, 1, var20.field703[0], 2, var20.field676[0], 0, class210.field3854.field676[0]);
                class194.field3612 = 0;
                class89.field1565 = class48.field826;
                class125.field2321 = class189.field3501;
                class149.field2734 = 2;
                class45.field779++;
                class64.field1054.method660(3, 3);
                class64.field1054.method726((byte) -15, class112.field2179);
                class64.field1054.method715(51, class69.field1160);
                class64.field1054.method764(class67.field1111, 10432);
                class64.field1054.method764(var5, 10432);
            }
        }
        if (var6 == 3 && class169.field3115 == null) {
            class61.method397(var7, 184, var2);
            class169.field3115 = class102.method631((byte) 72, var2, var7);
            class183.method1174(class169.field3115, 16235);
        }
        if (var6 == 7) {
            class65 var21 = class11.field145[var5];
            if (var21 != null) {
                class181.field3318++;
                class37.method265(1, 0, class210.field3854.field703[0], false, -85, 0, 1, var21.field703[0], 2, var21.field676[0], 0, class210.field3854.field676[0]);
                class125.field2321 = class189.field3501;
                class149.field2734 = 2;
                class194.field3612 = 0;
                class89.field1565 = class48.field826;
                class64.field1054.method660(173, 3);
                class64.field1054.method715(58, var5);
                class64.field1054.method752((byte) 61, class166.field3033);
                class64.field1054.method760(class231.field4172, (byte) -89);
            }
        }
        if (var6 == 39) {
            class159 var22 = class68.field1120[var5];
            if (var22 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 57, 0, 1, var22.field703[0], 2, var22.field676[0], 0, class210.field3854.field676[0]);
                class235.field4243++;
                class125.field2321 = class189.field3501;
                class149.field2734 = 2;
                class194.field3612 = 0;
                class89.field1565 = class48.field826;
                class64.field1054.method660(178, 3);
                class64.field1054.method752((byte) 61, class166.field3033);
                class64.field1054.method760(class231.field4172, (byte) -37);
                class64.field1054.method741(-124, var5);
            }
        }
        if (var6 == 8) {
            class167.field3051++;
            boolean var23 = class37.method265(0, 0, class210.field3854.field703[0], false, -78, 0, 0, var2, 2, var7, 0, class210.field3854.field676[0]);
            if (!var23) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 124, 0, 1, var2, 2, var7, 0, class210.field3854.field676[0]);
            }
            class89.field1565 = class48.field826;
            class149.field2734 = 2;
            class125.field2321 = class189.field3501;
            class194.field3612 = 0;
            class64.field1054.method660(116, 3);
            class64.field1054.method715(126, var5);
            class64.field1054.method760(class129.field2389 + var2, (byte) -118);
            class64.field1054.method715(20, class168.field3082 + var7);
        }
        if (var6 == 18) {
            class65 var25 = class11.field145[var5];
            if (var25 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -80, 0, 1, var25.field703[0], 2, var25.field676[0], 0, class210.field3854.field676[0]);
                class89.field1565 = class48.field826;
                class194.field3612 = 0;
                class149.field2734 = 2;
                class125.field2321 = class189.field3501;
                class52.field876++;
                class64.field1054.method660(20, 3);
                class64.field1054.method764(var5, 10432);
            }
        }
        if (var6 == 29) {
            boolean var26 = class37.method265(0, 0, class210.field3854.field703[0], false, -66, 0, 0, var2, 2, var7, 0, class210.field3854.field676[0]);
            class17.field253++;
            if (!var26) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -92, 0, 1, var2, 2, var7, 0, class210.field3854.field676[0]);
            }
            class149.field2734 = 2;
            class194.field3612 = 0;
            class89.field1565 = class48.field826;
            class125.field2321 = class189.field3501;
            class64.field1054.method660(45, 3);
            class64.field1054.method760(class129.field2389 + var2, (byte) -73);
            class64.field1054.method741(-101, class168.field3082 + var7);
            class64.field1054.method764(var5, 10432);
        }
        if (var6 == 10) {
            class159 var28 = class68.field1120[var5];
            if (var28 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -82, 0, 1, var28.field703[0], 2, var28.field676[0], 0, class210.field3854.field676[0]);
                class194.field3612 = 0;
                class149.field2734 = 2;
                class89.field1565 = class48.field826;
                class158.field2860++;
                class125.field2321 = class189.field3501;
                class64.field1054.method660(131, 3);
                class64.field1054.method764(var5, 10432);
            }
        }
        if (var6 == 13) {
            class159 var29 = class68.field1120[var5];
            if (var29 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 88, 0, 1, var29.field703[0], 2, var29.field676[0], 0, class210.field3854.field676[0]);
                class170.field3165++;
                class125.field2321 = class189.field3501;
                class89.field1565 = class48.field826;
                class194.field3612 = 0;
                class149.field2734 = 2;
                class64.field1054.method660(26, 3);
                class64.field1054.method760(var5, (byte) -24);
            }
        }
        if (var6 == 20) {
            class65 var30 = class11.field145[var5];
            if (var30 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 76, 0, 1, var30.field703[0], 2, var30.field676[0], 0, class210.field3854.field676[0]);
                class149.field2734 = 2;
                class89.field1565 = class48.field826;
                class125.field2321 = class189.field3501;
                class194.field3612 = 0;
                class1.field2++;
                class64.field1054.method660(237, 3);
                class64.field1054.method715(56, var5);
            }
        }
        if (var6 == 35) {
            class141.field2634++;
            class64.field1054.method660(170, 3);
            class64.field1054.method725(var7, -24475);
            class64.field1054.method715(102, var5);
            class64.field1054.method741(-83, var2);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -119, var7);
            class16.field235 = var2;
        }
        if (var6 == 2 && class119.method794(var2, (byte) -24, var3, var7)) {
            class100.field1886++;
            class64.field1054.method660(120, 3);
            class64.field1054.method760(class69.field1160, (byte) -124);
            class64.field1054.method752((byte) 61, class112.field2179);
            class64.field1054.method741(91, var2 + class129.field2389);
            class64.field1054.method715(127, class67.field1111);
            class64.field1054.method764((int) (var3 >>> 32) & Integer.MAX_VALUE, 10432);
            class64.field1054.method715(106, class168.field3082 + var7);
        }
        if (var6 == 6) {
            class64.field1054.method660(43, 3);
            class46.field792++;
            class64.field1054.method715(54, var2);
            class64.field1054.method715(40, var5);
            class64.field1054.method752((byte) 61, var7);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -99, var7);
            class16.field235 = var2;
        }
        if (var6 == 38) {
            class237.field4292++;
            boolean var31 = class37.method265(0, 0, class210.field3854.field703[0], false, -104, 0, 0, var2, 2, var7, 0, class210.field3854.field676[0]);
            if (!var31) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -119, 0, 1, var2, 2, var7, 0, class210.field3854.field676[0]);
            }
            class89.field1565 = class48.field826;
            class149.field2734 = 2;
            class194.field3612 = 0;
            class125.field2321 = class189.field3501;
            class64.field1054.method660(160, 3);
            class64.field1054.method764(var7 + class168.field3082, 10432);
            class64.field1054.method760(class69.field1160, (byte) -43);
            class64.field1054.method761(class112.field2179, -416174544);
            class64.field1054.method715(120, class67.field1111);
            class64.field1054.method741(-81, class129.field2389 + var2);
            class64.field1054.method741(-89, var5);
        }
        if (var6 == 34) {
            class64.field1054.method660(203, 3);
            class64.field1054.method726((byte) -68, var7);
            class64.field1054.method760(var5, (byte) -69);
            class64.field1054.method715(121, var2);
            class172.field3214++;
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -117, var7);
            class16.field235 = var2;
        }
        if (var6 == 21) {
            class159 var33 = class68.field1120[var5];
            if (var33 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 95, 0, 1, var33.field703[0], 2, var33.field676[0], 0, class210.field3854.field676[0]);
                class125.field2321 = class189.field3501;
                class149.field2734 = 2;
                class89.field1565 = class48.field826;
                class151.field2764++;
                class194.field3612 = 0;
                class64.field1054.method660(146, 3);
                class64.field1054.method760(var5, (byte) -47);
            }
        }
        if (var6 == 24) {
            class65 var34 = class11.field145[var5];
            if (var34 != null) {
                class61.field1034++;
                class37.method265(1, 0, class210.field3854.field703[0], false, -108, 0, 1, var34.field703[0], 2, var34.field676[0], 0, class210.field3854.field676[0]);
                class89.field1565 = class48.field826;
                class194.field3612 = 0;
                class125.field2321 = class189.field3501;
                class149.field2734 = 2;
                class64.field1054.method660(213, 3);
                class64.field1054.method764(var5, 10432);
            }
        }
        if (var6 == 28) {
            class64.field1054.method660(242, 3);
            class64.field1054.method764(var2, 10432);
            class89.field1552++;
            class64.field1054.method715(37, class67.field1111);
            class64.field1054.method741(-88, class69.field1160);
            class64.field1054.method725(var7, -24475);
            class64.field1054.method761(class112.field2179, -416174544);
            class64.field1054.method715(112, var5);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -107, var7);
            class16.field235 = var2;
        }
        if (var6 == 44) {
            class119.method794(var2, (byte) -24, var3, var7);
            class64.field1054.method660(190, 3);
            class25.field408++;
            class64.field1054.method741(47, class168.field3082 + var7);
            class64.field1054.method715(93, Integer.MAX_VALUE & (int) (var3 >>> 32));
            class64.field1054.method741(57, var2 + class129.field2389);
        }
        if (var6 == 11) {
            class200.method1262(-3727);
        }
        if (var6 == 9) {
            class64.field1054.method660(31, 3);
            class111.field2102++;
            class64.field1054.method760(var5, (byte) -72);
            class64.field1054.method760(var2, (byte) -115);
            class64.field1054.method725(var7, -24475);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -108, var7);
            class16.field235 = var2;
        }
        if (var6 == 4) {
            class71.field1194++;
            class64.field1054.method660(24, 3);
            class64.field1054.method725(var7, -24475);
            class64.field1054.method764(var5, 10432);
            class64.field1054.method741(-92, var2);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -93, var7);
            class16.field235 = var2;
        }
        if (var6 == 30) {
            class159 var35 = class68.field1120[var5];
            if (var35 != null) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 82, 0, 1, var35.field703[0], 2, var35.field676[0], 0, class210.field3854.field676[0]);
                class125.field2321 = class189.field3501;
                class149.field2734 = 2;
                class89.field1565 = class48.field826;
                class240.field4315++;
                class194.field3612 = 0;
                class64.field1054.method660(109, 3);
                class64.field1054.method741(51, var5);
            }
        }
        if (var6 == 42) {
            class130.method857(1);
            class96 var36 = class158.method1029((byte) -101, var7);
            class69.field1160 = var5;
            class106.field1984 = 1;
            class112.field2179 = var7;
            class67.field1111 = var2;
            class183.method1174(var36, 16235);
            class170.field3177 = class187.method1197(new class132[] { class236.field4259, class58.method389(0, var5).field4399, class123.field2312 }, -75);
            if (class170.field3177 == null) {
                class170.field3177 = class100.field1878;
            }
            return;
        }
        if (var6 == 1) {
            class64.field1054.method660(247, 3);
            class56.field949++;
            class64.field1054.method764(var5, 10432);
            class64.field1054.method741(120, var2);
            class64.field1054.method752((byte) 61, var7);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -101, var7);
            class16.field235 = var2;
        }
        if (var6 == 33 && class119.method794(var2, (byte) -24, var3, var7)) {
            class214.field3911++;
            class64.field1054.method660(153, 3);
            class64.field1054.method760(class129.field2389 + var2, (byte) -5);
            class64.field1054.method725(class166.field3033, -24475);
            class64.field1054.method764(Integer.MAX_VALUE & (int) (var3 >>> 32), 10432);
            class64.field1054.method764(class231.field4172, 10432);
            class64.field1054.method764(var7 + class168.field3082, 10432);
        }
        int var37 = -3 / ((9 - arg0) / 62);
        if (var6 == 57) {
            class116.field2231++;
            class64.field1054.method660(2, 3);
            class64.field1054.method715(110, var5);
            class64.field1054.method761(var7, -416174544);
            class64.field1054.method760(var2, (byte) -97);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -109, var7);
            class16.field235 = var2;
        }
        if (var6 == 43) {
            class28.field450++;
            boolean var38 = class37.method265(0, 0, class210.field3854.field703[0], false, -77, 0, 0, var2, 2, var7, 0, class210.field3854.field676[0]);
            if (!var38) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -92, 0, 1, var2, 2, var7, 0, class210.field3854.field676[0]);
            }
            class194.field3612 = 0;
            class89.field1565 = class48.field826;
            class149.field2734 = 2;
            class125.field2321 = class189.field3501;
            class64.field1054.method660(57, 3);
            class64.field1054.method715(90, var5);
            class64.field1054.method715(85, class129.field2389 + var2);
            class64.field1054.method715(119, var7 + class168.field3082);
        }
        if (var6 == 1002) {
            class194.field3612 = 0;
            class89.field1565 = class48.field826;
            class149.field2734 = 2;
            class125.field2321 = class189.field3501;
            class65 var40 = class11.field145[var5];
            if (var40 != null) {
                class185 var41 = var40.field1072;
                if (var41.field3394 != null) {
                    var41 = var41.method1188(21);
                }
                if (var41 != null) {
                    class64.field1054.method660(191, 3);
                    class231.field4154++;
                    class64.field1054.method741(92, var41.field3431);
                }
            }
        }
        if (var6 == 32) {
            class119.method794(var2, (byte) -24, var3, var7);
            class64.field1054.method660(121, 3);
            class14.field176++;
            class64.field1054.method715(88, class129.field2389 + var2);
            class64.field1054.method760(var7 + class168.field3082, (byte) -42);
            class64.field1054.method715(125, (int) (var3 >>> 32) & Integer.MAX_VALUE);
        }
        if (var6 == 17) {
            class64.field1054.method660(99, 3);
            class64.field1054.method741(112, class231.field4172);
            class64.field1054.method760(var2, (byte) -125);
            class64.field1054.method725(var7, -24475);
            class194.field3616++;
            class64.field1054.method761(class166.field3033, -416174544);
        }
        if (var6 == 1004) {
            class119.method794(var2, (byte) -24, var3, var7);
            class225.field4070++;
            class64.field1054.method660(110, 3);
            class64.field1054.method760(class168.field3082 + var7, (byte) -75);
            class64.field1054.method715(27, var2 + class129.field2389);
            class64.field1054.method760((int) (var3 >>> 32) & Integer.MAX_VALUE, (byte) -46);
        }
        if (var6 == 15) {
            class2.field33++;
            class119.method794(var2, (byte) -24, var3, var7);
            class64.field1054.method660(38, 3);
            class64.field1054.method760(class168.field3082 + var7, (byte) -63);
            class64.field1054.method741(96, Integer.MAX_VALUE & (int) (var3 >>> 32));
            class64.field1054.method741(-114, var2 + class129.field2389);
        }
        if (var6 == 47) {
            class1.field3++;
            class119.method794(var2, (byte) -24, var3, var7);
            class64.field1054.method660(230, 3);
            class64.field1054.method760(class168.field3082 + var7, (byte) -125);
            class64.field1054.method715(56, (int) (var3 >>> 32) & Integer.MAX_VALUE);
            class64.field1054.method760(var2 + class129.field2389, (byte) -86);
        }
        if (var6 == 49) {
            class19.method127(class139.field2615, var2, var7);
        }
        if (var6 == 5) {
            class6.field64++;
            class64.field1054.method660(28, 3);
            class64.field1054.method715(61, var5);
            class64.field1054.method760(var2, (byte) -56);
            class64.field1054.method761(var7, -416174544);
            class222.field4043 = 0;
            class91.field1612 = class158.method1029((byte) -97, var7);
            class16.field235 = var2;
        }
        if (var6 == 50) {
            class208.field3782++;
            boolean var42 = class37.method265(0, 0, class210.field3854.field703[0], false, 110, 0, 0, var2, 2, var7, 0, class210.field3854.field676[0]);
            if (!var42) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 59, 0, 1, var2, 2, var7, 0, class210.field3854.field676[0]);
            }
            class125.field2321 = class189.field3501;
            class194.field3612 = 0;
            class149.field2734 = 2;
            class89.field1565 = class48.field826;
            class64.field1054.method660(204, 3);
            class64.field1054.method741(113, class129.field2389 + var2);
            class64.field1054.method741(-88, var5);
            class64.field1054.method764(var7 + class168.field3082, 10432);
        }
        if (var6 == 37) {
            field428++;
            boolean var44 = class37.method265(0, 0, class210.field3854.field703[0], false, 85, 0, 0, var2, 2, var7, 0, class210.field3854.field676[0]);
            if (!var44) {
                class37.method265(1, 0, class210.field3854.field703[0], false, -103, 0, 1, var2, 2, var7, 0, class210.field3854.field676[0]);
            }
            class89.field1565 = class48.field826;
            class125.field2321 = class189.field3501;
            class194.field3612 = 0;
            class149.field2734 = 2;
            class64.field1054.method660(49, 3);
            class64.field1054.method715(95, class231.field4172);
            class64.field1054.method725(class166.field3033, -24475);
            class64.field1054.method764(class129.field2389 + var2, 10432);
            class64.field1054.method715(47, var5);
            class64.field1054.method760(class168.field3082 + var7, (byte) -96);
        }
        if (var6 == 36) {
            class47.field805++;
            class64.field1054.method660(226, 3);
            class64.field1054.method726((byte) -53, var7);
            class96 var46 = class158.method1029((byte) -116, var7);
            if (var46.field1787 != null && var46.field1787[0][0] == 5) {
                int var47 = var46.field1787[0][1];
                class77.field1315[var47] = 1 - class77.field1315[var47];
                class16.method85(var47, (byte) 37);
            }
        }
        if (var6 == 45) {
            class159 var48 = class68.field1120[var5];
            if (var48 != null) {
                class63.field1051++;
                class37.method265(1, 0, class210.field3854.field703[0], false, 96, 0, 1, var48.field703[0], 2, var48.field676[0], 0, class210.field3854.field676[0]);
                class89.field1565 = class48.field826;
                class125.field2321 = class189.field3501;
                class194.field3612 = 0;
                class149.field2734 = 2;
                class64.field1054.method660(103, 3);
                class64.field1054.method741(-104, var5);
            }
        }
        if (var6 == 14) {
            boolean var49 = true;
            class96 var50 = class158.method1029((byte) -118, var7);
            if (var50.field1805 > 0) {
                var49 = class108.method692(-108, var50);
            }
            if (var49) {
                class64.field1054.method660(226, 3);
                class64.field1054.method726((byte) 105, var7);
                class47.field805++;
            }
        }
        if (class106.field1984 != 0) {
            class106.field1984 = 0;
            class183.method1174(class158.method1029((byte) -116, class112.field2179), 16235);
        }
        if (class10.field116) {
            class130.method857(1);
        }
        if (class91.field1612 != null && class222.field4043 == 0) {
            class183.method1174(class91.field1612, 16235);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method196(int arg0) {
        if (arg0 == 0) {
            field427++;
            class158.field2863.method778((byte) 99);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method197(boolean arg0) {
        field422 = null;
        field413 = null;
        if (!arg0) {
            field422 = null;
        }
    }
}

import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class46 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lfe;")
    public static class229 field628 = new class229(new byte[5000]);

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Lbe;")
    private static class283 field635 = class153.method941(126, "blinken2:");

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Ltf;")
    public static class242 field632 = new class242(64);

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lbe;")
    private static class283 field636 = class153.method941(127, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lbe;")
    private static class283 field639 = class153.method941(125, "flash2:");

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lbe;")
    public static class283 field638 = field639;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Lbe;")
    public static class283 field640 = field639;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lek;")
    public static class172 field623;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method267(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class164.field2713; var3++) {
            class116 var4 = class77.field1350[var3];
            if (var4.field1972 == 1) {
                int var5 = var4.field1955 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1965 * var5 >> 8) + var4.field1956;
                    int var7 = (var4.field1958 * var5 >> 8) + var4.field1973;
                    int var8 = (var4.field1971 * var5 >> 8) + var4.field1954;
                    int var9 = (var4.field1966 * var5 >> 8) + var4.field1953;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1972 == 2) {
                int var10 = arg0 - var4.field1955;
                if (var10 > 0) {
                    int var11 = (var4.field1965 * var10 >> 8) + var4.field1956;
                    int var12 = (var4.field1958 * var10 >> 8) + var4.field1973;
                    int var13 = (var4.field1971 * var10 >> 8) + var4.field1954;
                    int var14 = (var4.field1966 * var10 >> 8) + var4.field1953;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1972 == 3) {
                int var15 = var4.field1956 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1952 * var15 >> 8) + var4.field1955;
                    int var17 = (var4.field1964 * var15 >> 8) + var4.field1960;
                    int var18 = (var4.field1971 * var15 >> 8) + var4.field1954;
                    int var19 = (var4.field1966 * var15 >> 8) + var4.field1953;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1972 == 4) {
                int var20 = arg2 - var4.field1956;
                if (var20 > 0) {
                    int var21 = (var4.field1952 * var20 >> 8) + var4.field1955;
                    int var22 = (var4.field1964 * var20 >> 8) + var4.field1960;
                    int var23 = (var4.field1971 * var20 >> 8) + var4.field1954;
                    int var24 = (var4.field1966 * var20 >> 8) + var4.field1953;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1972 == 5) {
                int var25 = arg1 - var4.field1954;
                if (var25 > 0) {
                    int var26 = (var4.field1952 * var25 >> 8) + var4.field1955;
                    int var27 = (var4.field1964 * var25 >> 8) + var4.field1960;
                    int var28 = (var4.field1965 * var25 >> 8) + var4.field1956;
                    int var29 = (var4.field1958 * var25 >> 8) + var4.field1973;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lkg;ZIIB)V", line = 137)
    public static final void method268(class69 arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        int var5 = arg0.field1069;
        if (arg0.field1139 == 0) {
            arg0.field1069 = arg0.field1087;
        } else if (arg0.field1139 == 1) {
            arg0.field1069 = arg3 - arg0.field1087;
        } else if (arg0.field1139 == 2) {
            arg0.field1069 = arg0.field1087 * arg3 >> 14;
        } else if (arg0.field1139 == 3) {
            if (arg0.field1143 == 2) {
                arg0.field1069 = (arg0.field1087 - 1) * arg0.field1000 + arg0.field1087 * 32;
            } else if (arg0.field1143 == 7) {
                arg0.field1069 = arg0.field1087 * 115 + ((arg0.field1087 - 1) * arg0.field1000);
            }
        }
        field630++;
        int var6 = arg0.field1085;
        if (arg0.field1026 == 0) {
            arg0.field1085 = arg0.field996;
        } else if (arg0.field1026 == 1) {
            arg0.field1085 = arg2 - arg0.field996;
        } else if (arg0.field1026 == 2) {
            arg0.field1085 = arg0.field996 * arg2 >> 14;
        } else if (arg0.field1026 == 3) {
            if (arg0.field1143 == 2) {
                arg0.field1085 = (arg0.field996 - 1) * arg0.field1037 + arg0.field996 * 32;
            } else if (arg0.field1143 == 7) {
                arg0.field1085 = arg0.field996 * 12 + ((arg0.field996 - 1) * arg0.field1037);
            }
        }
        if (arg0.field1139 == 4) {
            arg0.field1069 = arg0.field972 * arg0.field1085 / arg0.field1090;
        }
        if (arg0.field1026 == 4) {
            arg0.field1085 = arg0.field1090 * arg0.field1069 / arg0.field972;
        }
        if (class297.field5037 && (client.method1601(arg0) != 0 || arg0.field1143 == 0)) {
            if (arg0.field1085 < 5 && arg0.field1069 < 5) {
                arg0.field1085 = 5;
                arg0.field1069 = 5;
            } else {
                if (arg0.field1069 <= 0) {
                    arg0.field1069 = 5;
                }
                if (arg0.field1085 <= 0) {
                    arg0.field1085 = 5;
                }
            }
        }
        if (arg0.field975 == 1337) {
            class282.field4777 = arg0;
        }
        if (arg1 && arg0.field1031 != null && (arg0.field1069 != var5 || arg0.field1085 != var6)) {
            class231 var7 = new class231();
            var7.field3919 = arg0.field1031;
            var7.field3912 = arg0;
            class254.field4294.method1809(var7, (byte) -126);
        }
        int var8 = 97 % ((arg4 + 32) / 46);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIBI)V", line = 239)
    public static final void method269(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 108) {
            method267(104, -103, -127);
        }
        if (arg0 <= arg2) {
            class114.method742(30197, arg0, class97.field1636[arg4], arg2, arg1);
        } else {
            class114.method742(30197, arg2, class97.field1636[arg4], arg0, arg1);
        }
        field624++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 277)
    public static final void method270(int arg0) {
        field627++;
        if (!class103.field1760) {
            return;
        }
        int var1 = -88 / ((76 - arg0) / 45);
        class69 var2 = class225.method1480((byte) 122, class175.field3023, class143.field2373);
        if (var2 != null && var2.field1068 != null) {
            class231 var3 = new class231();
            var3.field3912 = var2;
            var3.field3919 = var2.field1068;
            class194.method1253(var3, 21258);
        }
        class103.field1760 = false;
        class272.method1834(var2, 0);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 313)
    public static void method271(int arg0) {
        field623 = null;
        field639 = null;
        field640 = null;
        field635 = null;
        field628 = null;
        field638 = null;
        if (arg0 >= -96) {
            method267(-48, -76, -102);
        }
        field636 = null;
        field632 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Lpe;", line = 353)
    public static final class94 method272(int arg0, byte arg1) {
        if (arg1 != 70) {
            return (class94) null;
        }
        field620++;
        class94 var2 = (class94) field632.method1629(86, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class166.field2766.method1107(class223.method1463(-962460278, arg0), class34.method222(arg0, (byte) 37), 124);
        class94 var4 = new class94();
        if (var3 != null) {
            var4.method605(new class229(var3), arg1 - 198);
        }
        field632.method1630(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 395)
    public static final void method273(int arg0) {
        class121.field2025 = class272.field4575;
        class2.field15 = class261.field4442;
        class203.field3476 = class55.field765;
        class186.field3198 = class55.field759;
        class140.field2330 = class306.field5248;
        class149.field2428 = class223.field3753;
        class60.field823 = class137.field2282;
        class68.field969 = class133.field2237;
        class257.field4333 = class38.field545;
        class24.field365 = class243.field4104;
        class306.field5260 = class264.field4492;
        class112.field1887 = class94.field1592;
        class154.field2533 = class164.field2704;
        class243.field4110 = class23.field351;
        class216.field3667 = class196.field3338;
        class269.field4536 = class23.field353;
        class89.field1508 = class195.field3329;
        class166.field2764 = class203.field3482;
        class74.field1289 = class125.field2075;
        if (arg0 != -6) {
            field639 = (class283) null;
        }
        class215.field3650 = class81.field1375;
        class282.field4763 = class194.field3311;
        class278.field4654 = class54.field746;
        class294.field4969 = class197.field3359;
        class200.field3424 = class31.field470;
        class37.field540 = class239.field4047;
        class12.field109 = class103.field1756;
        class256.field4314 = class187.field3212;
        class203.field3472 = class222.field3738;
        class180.field3103 = class85.field1441;
        class66.field923 = class49.field681;
        class222.field3730 = class40.field569;
        class225.field3776 = class202.field3456;
        class16.field191 = class64.field883;
        class23.field346 = class170.field2853;
        class236.field3952 = class99.field1676;
        class237.field3967 = class305.field5208;
        class45.field611 = field636;
        class297.field5032 = class126.field2086;
        class13.field137 = class200.field3429;
        class96.field1610 = class231.field3928;
        class217.field3688 = class97.field1648;
        class92.field1562 = class14.field148;
        class104.field1777 = class121.field2027;
        class123.field2054 = class123.field2053;
        class6.field65 = class143.field2371;
        class227.field3820 = class288.field4901;
        class247.field4228 = class90.field1519;
        class307.field5271 = class118.field1989;
        class172.field2898 = class92.field1551;
        class174.field3010 = class111.field1882;
        class71.field1221 = class125.field2074;
        class154.field2527 = class278.field4652;
        class298.field5042 = class25.field373;
        class184.field3176 = class37.field537;
        class110.field1871 = class15.field162;
        class307.field5273 = class260.field4425;
        class237.field3976 = class305.field5208;
        class301.field5076 = class91.field1543;
        class27.field419 = class125.field2073;
        field640 = field635;
        class14.field149 = class305.field5232;
        class290.field4909 = class277.field4637;
        class58.field793 = class302.field5103;
        class137.field2286 = class177.field3036;
        class60.field824 = class259.field4405;
        class306.field5235 = class172.field2935;
        class104.field1764 = class2.field23;
        class202.field3445 = class111.field1881;
        class82.field1387 = class297.field5031;
        class75.field1312 = class14.field143;
        class177.field3047 = class279.field4655;
        class20.field293 = class138.field2300;
        class180.field3093 = class249.field4245;
        class99.field1687 = class126.field2090;
        class22.field337 = class113.field1907;
        class222.field3734 = class40.field569;
        class53.field713 = class160.field2615;
        class256.field4331 = class70.field1216;
        class168.field2818 = class196.field3352;
        class295.field5009 = class227.field3829;
        class202.field3457 = class237.field3979;
        class194.field3310 = client.field4011;
        field618++;
        class2.field21 = class143.field2370;
        class64.field886 = class16.field180;
        class261.field4439 = class229.field3873;
        class248.field4234 = class13.field128;
        class263.field4471 = class63.field875;
        class40.field562 = class126.field2089;
        class301.field5075 = class295.field5012;
        class247.field4202 = class85.field1440;
        class216.field3664 = class196.field3338;
        class225.field3768 = class227.field3812;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 734)
    public static final void method274(int arg0) {
        field621++;
        int var1 = class262.field4462.method617((byte) -21, 8);
        if (class297.field5033 > var1) {
            for (int var2 = var1; var2 < class297.field5033; var2++) {
                class15.field170[class103.field1740++] = class162.field2666[var2];
            }
        }
        if (class297.field5033 < var1) {
            throw new RuntimeException("gppov1");
        }
        class297.field5033 = 0;
        if (arg0 != 2) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class162.field2666[var3];
            class191 var5 = class149.field2436[var4];
            int var6 = class262.field4462.method617((byte) -21, 1);
            if (var6 == 0) {
                class162.field2666[class297.field5033++] = var4;
                var5.field1186 = class75.field1309;
            } else {
                int var7 = class262.field4462.method617((byte) -21, 2);
                if (var7 == 0) {
                    class162.field2666[class297.field5033++] = var4;
                    var5.field1186 = class75.field1309;
                    class26.field393[class69.field1015++] = var4;
                } else if (var7 == 1) {
                    class162.field2666[class297.field5033++] = var4;
                    var5.field1186 = class75.field1309;
                    int var8 = class262.field4462.method617((byte) -21, 3);
                    var5.method461(false, -63, var8);
                    int var9 = class262.field4462.method617((byte) -21, 1);
                    if (var9 == 1) {
                        class26.field393[class69.field1015++] = var4;
                    }
                } else if (var7 == 2) {
                    class162.field2666[class297.field5033++] = var4;
                    var5.field1186 = class75.field1309;
                    int var10 = class262.field4462.method617((byte) -21, 3);
                    var5.method461(true, -104, var10);
                    int var11 = class262.field4462.method617((byte) -21, 3);
                    var5.method461(true, -110, var11);
                    int var12 = class262.field4462.method617((byte) -21, 1);
                    if (var12 == 1) {
                        class26.field393[class69.field1015++] = var4;
                    }
                } else if (var7 == 3) {
                    class15.field170[class103.field1740++] = var4;
                }
            }
        }
    }
}

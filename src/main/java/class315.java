import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class315 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lwa;")
    private class279 field4930 = new class279();

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field4923 = -1;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field4922 = 0;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4933 = null;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lwa;")
    private class279 field4934;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Lwa;", line = 4)
    public final class279 method2192(byte arg0) {
        if (arg0 >= -30) {
            method2195(-33);
        }
        class279 var2 = this.field4934;
        field4927++;
        if (this.field4930 == var2) {
            this.field4934 = null;
            return null;
        } else {
            this.field4934 = var2.field4299;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 25)
    public static final void method2193(int arg0) {
        field4920++;
        if (arg0 != 16711680) {
            method2201(58, 74, -4, (byte) 52, -9);
        }
        class194.field3088.method1355(false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIIZII)V", line = 43)
    public static final void method2194(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1) {
            class109.method739();
        }
        field4926++;
        if (class134.field1966 != null && (arg3 != 3 || class202.field3214 != arg2 || class180.field2926 != arg6)) {
            class144.method1070(class42.field581, -29642, class134.field1966);
            class134.field1966 = null;
        }
        if (arg3 == 3 && class134.field1966 == null) {
            class134.field1966 = class340.method2358(arg6, (byte) 23, arg2, 0, class42.field581, 0);
            if (class134.field1966 != null) {
                class180.field2926 = arg6;
                class202.field3214 = arg2;
                class135.method985(class42.field581, -128);
            }
        }
        if (arg3 == 3 && class134.field1966 == null) {
            method2194(-1, true, -1, class232.field3630, true, arg5, -1);
            return;
        }
        Container var7;
        if (class134.field1966 != null) {
            var7 = class134.field1966;
        } else if (class184.field2976 == null) {
            var7 = class42.field581.field2181;
        } else {
            var7 = class184.field2976;
        }
        class287.field4434 = var7.getSize().width;
        class333.field5181 = var7.getSize().height;
        if (class184.field2976 == var7) {
            Insets var8 = class184.field2976.getInsets();
            class287.field4434 -= var8.right + var8.left;
            class333.field5181 -= var8.top + var8.bottom;
        }
        if (arg3 >= 2) {
            class127.field1841 = class287.field4434;
            class95.field1258 = class333.field5181;
            class200.field3208 = 0;
            class333.field5186 = 0;
        } else {
            class127.field1841 = 765;
            class333.field5186 = (class287.field4434 - 765) / 2;
            class95.field1258 = 503;
            class200.field3208 = 0;
        }
        if (arg4) {
            class225.method1655(class116.field1615, (byte) 3);
            class139.method1033(990923265, class116.field1615);
            if (class205.field3248 != null) {
                class205.field3248.method524(class116.field1615, 64);
            }
            class96.field1266.method478(0);
            class241.method1721(arg0 ^ 0xFFFFFFB0, class116.field1615);
            class183.method1342(class116.field1615, arg0 + 8913);
            if (class205.field3248 != null) {
                class205.field3248.method522(class116.field1615, (byte) 110);
            }
        } else {
            if (class109.field1458) {
                class109.method742(class127.field1841, class95.field1258);
            }
            class116.field1615.setSize(class127.field1841, class95.field1258);
            if (class184.field2976 == var7) {
                Insets var9 = class184.field2976.getInsets();
                class116.field1615.setLocation(class333.field5186 + var9.left, class200.field3208 + var9.top);
            } else {
                class116.field1615.setLocation(class333.field5186, class200.field3208);
            }
        }
        if (arg3 == 0 && arg5 > 0) {
            class109.method747(class116.field1615);
        }
        if (arg1 && arg3 > 0) {
            class116.field1615.setIgnoreRepaint(true);
            if (!class33.field485) {
                class139.method1035();
                class42.field583 = null;
                class42.field583 = class29.method261(0, class116.field1615, class95.field1258, class127.field1841);
                class280.method1968();
                if (class105.field1388 == 5) {
                    class192.method1418(class270.field4197, true, arg0 - 9741);
                } else {
                    class36.method312((byte) 73, false, class126.field1819);
                }
                try {
                    Graphics var10 = class116.field1615.getGraphics();
                    class42.field583.method515(var10, 0, 0, arg0 - 109);
                } catch (Exception var14) {
                }
                class271.method1915((byte) -83);
                if (arg5 == 0) {
                    class42.field583 = class29.method261(0, class116.field1615, 503, 765);
                } else {
                    class42.field583 = null;
                }
                class114 var12 = class42.field581.method1016((byte) 114, class96.field1266.getClass());
                while (var12.field1595 == 0) {
                    class272.method1918((byte) 22, 100L);
                }
                if (var12.field1595 == 1) {
                    class33.field485 = true;
                }
            }
            if (class33.field485) {
                class109.method777(class116.field1615, class196.field3127 * 2);
            }
        }
        if (!class109.field1458 && arg3 > 0) {
            method2194(-1, true, -1, 0, true, arg5, -1);
            return;
        }
        if (~arg3 < arg0 && arg5 == 0) {
            class246.field3842.setPriority(5);
            class42.field583 = null;
            class53.method380();
            ((class57) class31.field466).method466((byte) 106, 200);
            if (class220.field3482) {
                class31.method297(0.7F);
            }
            if (class215.field3396 == null) {
                class215.field3396 = new class254[13][13];
            }
            class176.method1304(4, 104, 104);
            class8.method118(104, 104);
            class210.method1533(false);
        } else if (arg3 == 0 && arg5 > 0) {
            class246.field3842.setPriority(1);
            class42.field583 = class29.method261(arg0 + 1, class116.field1615, 503, 765);
            class53.method416();
            class151.method1103();
            ((class57) class31.field466).method466((byte) 81, 20);
            if (class220.field3482) {
                if (class326.field5123 == 1) {
                    class31.method297(0.9F);
                }
                if (class326.field5123 == 2) {
                    class31.method297(0.8F);
                }
                if (class326.field5123 == 3) {
                    class31.method297(0.7F);
                }
                if (class326.field5123 == 4) {
                    class31.method297(0.6F);
                }
            }
            class247.method1785();
            class210.method1533(false);
        }
        class130.field1927 = !class154.method1119((byte) 16);
        if (arg1) {
            class200.method1475(0);
        }
        if (arg3 < 2) {
            class9.field172 = false;
        } else {
            class9.field172 = true;
        }
        if (class147.field2321 != -1) {
            class197.method1462(true, (byte) -50);
        }
        if (class275.field4247 != null && (class105.field1388 == 30 || class105.field1388 == 25)) {
            class131.method967(arg0 + 17257);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class231.field3607[var13] = true;
        }
        class256.field4051 = true;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 276)
    public static void method2195(int arg0) {
        field4933 = null;
        if (arg0 >= -44) {
            method2200((byte) 83);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Lwa;", line = 289)
    public final class279 method2196(byte arg0) {
        field4925++;
        class279 var2 = this.field4930.field4299;
        if (arg0 != -36) {
            field4923 = -103;
        }
        if (this.field4930 == var2) {
            return null;
        } else {
            var2.method1960(arg0 ^ 0x6BC7);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLwa;)V", line = 308)
    public final void method2197(byte arg0, class279 arg1) {
        if (arg1.field4295 != null) {
            arg1.method1960(-27621);
        }
        field4932++;
        arg1.field4299 = this.field4930;
        arg1.field4295 = this.field4930.field4295;
        arg1.field4295.field4299 = arg1;
        if (arg0 != -105) {
            method2201(-98, 40, -83, (byte) 44, -97);
        }
        arg1.field4299.field4295 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)Lwa;", line = 327)
    public final class279 method2198(int arg0) {
        field4929++;
        class279 var2 = this.field4930.field4299;
        if (this.field4930 == var2) {
            this.field4934 = null;
            return null;
        } else if (arg0 == 200) {
            this.field4934 = var2.field4299;
            return var2;
        } else {
            return (class279) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 363)
    public final void method2199(int arg0) {
        while (true) {
            class279 var2 = this.field4930.field4299;
            if (this.field4930 == var2) {
                this.field4934 = null;
                field4921++;
                if (arg0 != -2288) {
                    this.method2199(2);
                }
                return;
            }
            var2.method1960(-27621);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 387)
    public static final void method2200(byte arg0) {
        field4931++;
        if (arg0 != 0) {
            return;
        }
        class224.field3558 = null;
        class281.method1986(0, -1, 0, (byte) 93, class147.field2321, class95.field1258, 0, 0, class127.field1841);
        if (class224.field3558 != null) {
            class311.method2173(class224.field3558, 0, class127.field1841, class130.field1929.field2054, 53, -1412584499, class95.field1258, class232.field3625, class233.field3635, 0);
            class224.field3558 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIBI)I", line = 407)
    public static final int method2201(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class24.field367) {
            arg2 = 1000000;
            class24.field367 = false;
        }
        field4924++;
        class254 var5 = class215.field3396[arg4][arg0];
        float var6 = ((float) arg1 * 0.1F + 0.7F) * var5.field4020;
        float var7 = var5.field4028;
        float var8 = var5.field4024;
        int var9 = var5.field4012;
        int var10 = var5.field4014;
        if (arg3 != 118) {
            field4922 = 18;
        }
        class88 var11 = var5.field4021;
        int var12 = var5.field4022;
        if (!class198.field3163) {
            var12 = 0;
        }
        float var13 = var5.field4013;
        float var14 = var5.field4023;
        float var15 = var5.field4009;
        if (class234.field3662 != var10 || class48.field627 != var6 || class156.field2421 != var7 || class95.field1263 != var8 || class221.field3503 != var9 || class144.field2276 != var12 || class317.field5020 != var11 || class194.field3103 != var13 || class220.field3492 != var15 || class271.field4205 != var14) {
            class240.field3748 = class60.field882;
            class62.field916 = class84.field1149;
            class206.field3270 = class158.field2455;
            class101.field1340 = class25.field382;
            class62.field912 = class7.field142;
            class202.field3226 = class117.field1629;
            class129.field1890 = class32.field471;
            class308.field4799 = class154.field2382;
            class71.field986 = class249.field3929;
            class71.field980 = class110.field1521;
            if (class146.field2314 == null || class71.field980 == class146.field2314) {
                class146.field2314 = new class88();
            }
            class317.field5020 = var11;
            class194.field3103 = var13;
            class144.field2276 = var12;
            class271.field4205 = var14;
            class156.field2421 = var7;
            class95.field1263 = var8;
            class234.field3662 = var10;
            class92.field1225 = 0;
            class221.field3503 = var9;
            class220.field3492 = var15;
            class48.field627 = var6;
        }
        if (class92.field1225 < 65536) {
            class92.field1225 += arg2 * 250;
            if (class92.field1225 >= 65536) {
                class60.field882 = class221.field3503;
                class7.field142 = class220.field3492;
                class158.field2455 = class234.field3662;
                class32.field471 = class156.field2421;
                class84.field1149 = class194.field3103;
                class117.field1629 = class48.field627;
                class154.field2382 = class144.field2276;
                class25.field382 = class95.field1263;
                class92.field1225 = 65536;
                class110.field1521 = class317.field5020;
                class71.field980 = null;
                class249.field3929 = class271.field4205;
            } else {
                int var16 = 65536 - class92.field1225 >> 8;
                int var17 = class92.field1225 >> 8;
                class60.field882 = ((class240.field3748 & 0xFF00FF) * var16 + (class221.field3503 & 0xFF00FF) * var17 & 0xFF00FF00) + ((class240.field3748 & 0xFF00) * var16 + (class221.field3503 & 0xFF00) * var17 & 0xFF0000) >> 8;
                class154.field2382 = class308.field4799 * var16 + (class144.field2276 * var17) >> 8;
                class158.field2455 = ((class234.field3662 & 0xFF00) * var17 + (class206.field3270 & 0xFF00) * var16 & 0xFF0000) + ((class234.field3662 & 0xFF00FF) * var17 + (class206.field3270 & 0xFF00FF) * var16 & 0xFF00FF00) >> 8;
                float var18 = (float) (65536 - class92.field1225) / 65536.0F;
                float var19 = (float) class92.field1225 / 65536.0F;
                class84.field1149 = class62.field916 * var18 + class194.field3103 * var19;
                class249.field3929 = class71.field986 * var18 + class271.field4205 * var19;
                class117.field1629 = class48.field627 * var19 + class202.field3226 * var18;
                class32.field471 = class156.field2421 * var19 + class129.field1890 * var18;
                class7.field142 = class62.field912 * var18 + class220.field3492 * var19;
                class25.field382 = class95.field1263 * var19 + class101.field1340 * var18;
                if (class71.field980 != class317.field5020) {
                    if (class71.field980 == null || class317.field5020 == null) {
                        class110.field1521 = null;
                    } else {
                        class110.field1521 = class146.field2314.method637(class71.field980, class317.field5020, (float) class92.field1225 / 65536.0F);
                    }
                }
            }
        }
        return class60.field882;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)I", line = 539)
    public final int method2202(int arg0) {
        int var2 = arg0;
        field4928++;
        for (class279 var3 = this.field4930.field4299; var3 != this.field4930; var3 = var3.field4299) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 562)
    public class315() {
        this.field4930.field4295 = this.field4930;
        this.field4930.field4299 = this.field4930;
    }
}

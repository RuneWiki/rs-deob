import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class282 extends class266 {

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "[Lbb;")
    public class128[] field4772;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Lma;")
    private static class5 field4776 = class12.method119("Loaded update list", (byte) 124);

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Lma;")
    public static class5 field4773 = field4776;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Lbf;")
    public static class209 field4780 = new class209(4096);

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "Lma;")
    public static class5 field4782 = class12.method119(":tradereq:", (byte) 110);

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "Lma;")
    private static class5 field4783 = class12.method119("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", (byte) 110);

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "[I")
    public static int[] field4785 = new int[32];

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field4788 = 0;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "S")
    public static short field4784 = 32767;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "Lma;")
    public static class5 field4792 = class12.method119("underlay", (byte) 61);

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lma;")
    public static class5 field4793 = field4783;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field4794 = 0;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "Lfl;")
    public static class299 field4791;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "[I")
    public static int[] field4781;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "[I")
    public static int[] field4790;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V", line = 5)
    public static final void method1906(int arg0, int arg1) {
        field4777++;
        Container var2;
        if (class207.field3291 != null) {
            var2 = class207.field3291;
        } else if (class81.field1263 == null) {
            var2 = class267.field4597.field2262;
        } else {
            var2 = class81.field1263;
        }
        class48.field739 = var2.getSize().width;
        class239.field3977 = var2.getSize().height;
        if (class81.field1263 == var2) {
            Insets var3 = class81.field1263.getInsets();
            class239.field3977 -= var3.top + var3.bottom;
            class48.field739 -= var3.right + var3.left;
        }
        if (!class116.field1731 && class207.field3291 == null) {
            class255.field4362 = 765;
            class288.field4880 = (class48.field739 - 765) / 2;
            class60.field932 = class10.field157;
            class156.field2314 = 503;
        } else {
            class288.field4880 = 0;
            class255.field4362 = class48.field739;
            class156.field2314 = class239.field3977 - class10.field157;
            class60.field932 = class10.field157;
        }
        class45.method338(class255.field4362, class156.field2314);
        class147.field2141.setSize(class255.field4362, class156.field2314);
        if (class81.field1263 == var2) {
            Insets var4 = class81.field1263.getInsets();
            class147.field2141.setLocation(class288.field4880 + var4.left, class60.field932 + var4.top);
        } else {
            class147.field2141.setLocation(class288.field4880, class60.field932);
        }
        if (class255.field4354 != -1) {
            class237.method1676(true, 0);
        }
        class265.method1821((byte) 90);
        if (class154.field2268.startsWith("mac")) {
            class171.field2626 = (long) arg1 + class212.method1404((byte) -105);
        }
        class279.field4731 = class212.method1404((byte) -104) + ((long) arg1);
        if (arg1 == 0 && class47.field725 != null && (class5.field58 == 30 || class5.field58 == 25)) {
            class80.method551(-6);
        }
        if (arg0 > -26) {
            field4791 = (class299) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIILkl;I)Lkl;", line = 82)
    public static final class34 method1907(int arg0, int arg1, int arg2, int arg3, int arg4, class34 arg5, int arg6) {
        int var7 = -35 % ((arg2 + 56) / 54);
        field4775++;
        long var8 = (long) arg3;
        class34 var10 = (class34) class101.field1509.method521(var8, (byte) 80);
        if (var10 == null) {
            class183 var11 = class183.method1202(class151.field2201, arg3, 0);
            if (var11 == null) {
                return null;
            }
            var10 = var11.method1198(64, 768, -50, -10, -50);
            class101.field1509.method519((byte) -95, var10, var8);
        }
        int var12 = arg5.method232();
        int var13 = arg5.method236();
        int var14 = arg5.method237();
        int var15 = arg5.method249();
        class34 var16 = var10.method241(true, true);
        if (arg1 != 0) {
            var16.method245(arg1);
        }
        class160 var17 = (class160) var16;
        if (class20.method161(arg0 + var14, arg4 + var12, 1, class276.field4701) != arg6 || class20.method161(arg0 + var15, arg4 + var13, 1, class276.field4701) != arg6) {
            for (int var18 = 0; var18 < var17.field2417; var18++) {
                var17.field2423[var18] += class20.method161(var17.field2418[var18] + arg0, var17.field2399[var18] + arg4, 1, class276.field4701) - arg6;
            }
            var17.field2431.field1180 = false;
            var17.field2408.field1229 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 144)
    public static final void method1908(int arg0) {
        field4768++;
        for (int var1 = arg0; var1 < class287.field4838; var1++) {
            int var2 = class156.field2320[var1];
            class91 var3 = class267.field4593[var2];
            int var4 = class200.field3184.method1509(true);
            if ((var4 & 0x1) != 0) {
                var4 += class200.field3184.method1509(true) << 8;
            }
            class97.method623(var2, false, var3, var4);
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V", line = 175)
    public static void method1909(int arg0) {
        field4782 = null;
        field4773 = null;
        field4791 = null;
        field4783 = null;
        field4780 = null;
        field4781 = null;
        field4793 = null;
        field4776 = null;
        if (arg0 != 25) {
            method1906(-77, 53);
        }
        field4792 = null;
        field4790 = null;
        field4785 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLwi;III)V", line = 200)
    public static final void method1910(boolean arg0, class185 arg1, int arg2, int arg3, int arg4) {
        field4774++;
        if (arg0) {
            method1907(-125, 6, 79, -61, -127, (class34) null, -80);
        }
        for (class150 var5 = (class150) class274.field4660.method1475(14); var5 != null; var5 = (class150) class274.field4660.method1486(38)) {
            if (var5.field2170 == arg4 && arg2 * 128 == var5.field2177 && (arg3 * 128) == var5.field2171 && var5.field2158.field2893 == arg1.field2893) {
                if (var5.field2163 != null) {
                    class235.field3889.method277(var5.field2163);
                    var5.field2163 = null;
                }
                if (var5.field2178 != null) {
                    class235.field3889.method277(var5.field2178);
                    var5.field2178 = null;
                }
                var5.method1997(-27381);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)Leb;", line = 248)
    public static final class253 method1911(int arg0, int arg1, int arg2) {
        field4771++;
        class253 var3 = class172.method1140(arg0, arg2 ^ 0x3ED8);
        if (arg2 != -16037) {
            method1906(31, -71);
        }
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field4275 == null || arg1 >= var3.field4275.length) {
            return null;
        } else {
            return var3.field4275[arg1];
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(III)Ltl;", line = 270)
    public static final class250 method1912(int arg0, int arg1, int arg2) {
        if (arg0 != 384132640) {
            return (class250) null;
        }
        class250 var3 = (class250) class164.field2496.method1372(false, (long) arg1 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class250(arg2, arg1);
            class164.field2496.method1376(var3.field5004, -1, var3);
        }
        field4779++;
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lni;Lni;IZ)V", line = 290)
    public class282(class202 arg0, class202 arg1, int arg2, boolean arg3) {
        class218 var5 = new class218();
        int var6 = arg0.method1326((byte) -108, arg2);
        this.field4772 = new class128[var6];
        int[] var7 = arg0.method1325((byte) -53, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1342(68, arg2, var7[var8]);
            class14 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class14 var12 = (class14) var5.method1475(14); var12 != null; var12 = (class14) var5.method1486(38)) {
                if (var12.field258 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1328((byte) -47, var11, 0);
                } else {
                    var13 = arg1.method1328((byte) -47, 0, var11);
                }
                var10 = new class14(var11, var13);
                var5.method1485(-8564, var10);
            }
            this.field4772[var7[var8]] = new class128(var9, var10);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILkb;Lkb;IIIIJ)V", line = 348)
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, class280 arg4, class280 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class133 var12 = new class133();
        var12.field1980 = arg10;
        var12.field1973 = arg1 * 128 + 64;
        var12.field1972 = arg2 * 128 + 64;
        var12.field1978 = arg3;
        var12.field1971 = arg4;
        var12.field1977 = arg5;
        var12.field1975 = arg6;
        var12.field1984 = arg7;
        var12.field1974 = arg8;
        var12.field1976 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class43.field646[var13][arg1][arg2] == null) {
                class43.field646[var13][arg1][arg2] = new class198(var13, arg1, arg2);
            }
        }
        class43.field646[arg0][arg1][arg2].field3144 = var12;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I", line = 376)
    public static final int method1914(int arg0, byte arg1) {
        field4778++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 - 71;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return arg1 + 52 - 48;
        } else if (arg1 == 43) {
            return 62;
        } else if (arg1 == 42) {
            return 62;
        } else {
            if (arg0 != -29861) {
                field4791 = (class299) null;
            }
            if (arg1 == 47) {
                return 63;
            } else if (arg1 == 45) {
                return 63;
            } else {
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(BI)Z", line = 416)
    public final boolean method1915(byte arg0, int arg1) {
        int var3 = -82 / ((-arg0 - 22) / 56);
        field4787++;
        return this.field4772[arg1].field1916;
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V", line = 425)
    public static final void method1916(int arg0) {
        field4769++;
        int var1 = (class239.field3970 >> 10) + (class193.field3017 >> 3);
        int var2 = (class74.field1158 >> 3) + (class303.field5108 >> 10);
        byte var3 = 8;
        byte var4 = 0;
        byte var5 = 18;
        class48.field755 = new int[var5];
        class103.field1541 = new byte[var5][];
        class105.field1562 = new byte[var5][];
        class41.field628 = new int[var5];
        if (arg0 != 97) {
            return;
        }
        class161.field2465 = new byte[var5][];
        field4790 = new int[var5];
        class288.field4877 = new byte[var5][];
        class72.field1134 = new int[var5][4];
        class189.field2964 = new int[var5];
        class146.field2117 = new int[var5];
        class294.field4958 = new int[var5];
        class111.field1657 = new byte[var5][];
        int var6 = 0;
        for (int var7 = (var1 - 6) / 8; var7 <= ((var1 + 6) / 8); var7++) {
            for (int var8 = (var2 - 6) / 8; var8 <= ((var2 + 6) / 8); var8++) {
                int var9 = (var7 << 8) + var8;
                class294.field4958[var6] = var9;
                class189.field2964[var6] = class86.field1302.method1346((byte) -114, class288.method1940((byte) 120, new class5[] { class129.field1934, class175.method1148(var7, false), class271.field4643, class175.method1148(var8, false) }));
                class48.field755[var6] = class86.field1302.method1346((byte) 90, class288.method1940((byte) 113, new class5[] { class235.field3890, class175.method1148(var7, false), class271.field4643, class175.method1148(var8, false) }));
                class146.field2117[var6] = class86.field1302.method1346((byte) 114, class288.method1940((byte) 70, new class5[] { class193.field3010, class175.method1148(var7, false), class271.field4643, class175.method1148(var8, false) }));
                class41.field628[var6] = class86.field1302.method1346((byte) 67, class288.method1940((byte) 127, new class5[] { class261.field4451, class175.method1148(var7, false), class271.field4643, class175.method1148(var8, false) }));
                field4790[var6] = class86.field1302.method1346((byte) 38, class288.method1940((byte) 89, new class5[] { class35.field534, class175.method1148(var7, false), class271.field4643, class175.method1148(var8, false) }));
                if (class146.field2117[var6] == -1) {
                    class189.field2964[var6] = -1;
                    class48.field755[var6] = -1;
                    class41.field628[var6] = -1;
                    field4790[var6] = -1;
                }
                var6++;
            }
        }
        byte var10 = 8;
        class226.method1598(var1, var2, var3, true, var10, arg0 - 32866, var4);
    }
}

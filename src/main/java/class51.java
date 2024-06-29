import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class51 {

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lwa;")
    public static class75 field837 = class66.method560("www", false);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lwa;")
    public static class75 field833 = class66.method560("Lade)3)3)3", false);

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "Lwa;")
    public static class75 field849 = class66.method560("Verbindung abgebrochen)3", false);

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "[[I")
    public static int[][] field844 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field853 = -1;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Lwa;")
    private static class75 field856 = class66.method560("slide:", false);

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Lwa;")
    public static class75 field854 = field856;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lwa;")
    public static class75 field834 = field856;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lie;")
    public static class80 field842;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[[[I")
    public static int[][][] field847;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 9)
    public static final void method372(byte arg0) {
        field840++;
        if (class299.field5120 != null || class270.field4675 != null) {
            return;
        }
        if (arg0 >= -67) {
            method377((class267) null, (class267) null, -91);
        }
        int var1 = class87.field1435;
        if (class153.field2625) {
            if (var1 != 1) {
                int var2 = class66.field1135;
                int var3 = class26.field351;
                if (var2 < class188.field3135 - 10 || var2 > class188.field3135 + class269.field4653 + 10 || var3 < (class59.field985 - 10) || var3 > (class270.field4677 + class59.field985 + 10)) {
                    class153.field2625 = false;
                    class177.method1306(class59.field985, class269.field4653, class188.field3135, class270.field4677, (byte) -106);
                }
            }
            if (var1 == 1) {
                int var4 = class59.field985;
                int var5 = class271.field4685;
                int var6 = class188.field3135;
                int var7 = class39.field595;
                int var8 = class269.field4653;
                int var9 = -1;
                for (int var10 = 0; var10 < class126.field2188; var10++) {
                    int var11 = (class126.field2188 - var10 - 1) * 15 + var4 + 31;
                    if (var6 < var7 && (var6 + var8) > var7 && (var11 - 13) < var5 && var5 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class279.method1991(var9, (byte) 54);
                }
                class153.field2625 = false;
                class177.method1306(class59.field985, class269.field4653, class188.field3135, class270.field4677, (byte) -106);
            }
            return;
        }
        if (var1 == 1 && class126.field2188 > 0) {
            short var12 = class99.field1646[class126.field2188 - 1];
            if (var12 == 29 || var12 == 20 || var12 == 18 || var12 == 14 || var12 == 40 || var12 == 7 || var12 == 24 || var12 == 11 || var12 == 33 || var12 == 32 || var12 == 38 || var12 == 1002) {
                int var13 = class16.field216[class126.field2188 - 1];
                int var14 = class171.field2884[class126.field2188 - 1];
                class262 var15 = method374(121, var13);
                if (class303.method2089(client.method1734(var15), 0) || class16.method93((byte) -40, client.method1734(var15))) {
                    class87.field1444 = false;
                    class170.field2860 = 0;
                    if (class299.field5120 != null) {
                        class291.method2027(class299.field5120, 14580);
                    }
                    class299.field5120 = method374(113, var13);
                    class90.field1483 = class271.field4685;
                    class272.field4701 = var14;
                    class266.field4588 = class39.field595;
                    class291.method2027(class299.field5120, 14580);
                    return;
                }
            }
        }
        if (var1 == 1 && (class275.field4735 == 1 && class126.field2188 > 2 || class10.method48(class126.field2188 - 1, true))) {
            var1 = 2;
        }
        if (var1 == 2 && class126.field2188 > 0 || class285.field4915 == 1) {
            class35.method235(true);
        }
        if (var1 == 1 && class126.field2188 > 0 || class285.field4915 == 2) {
            class19.method127(11078);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lcb;III)Lcm;", line = 133)
    public static final class181 method373(class267 arg0, int arg1, int arg2, int arg3) {
        field841++;
        if (class281.method1994(arg2, (byte) -7, arg1, arg0)) {
            if (arg3 != -24887) {
                field856 = (class75) null;
            }
            return class28.method193((byte) -66);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lre;", line = 149)
    public static final class262 method374(int arg0, int arg1) {
        int var2 = 20 / ((arg0 - 50) / 48);
        field852++;
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class249.field4198[var3] == null || class249.field4198[var3][var4] == null) {
            boolean var5 = method375(var3, -127);
            if (!var5) {
                return null;
            }
        }
        return class249.field4198[var3][var4];
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)Z", line = 185)
    public static final boolean method375(int arg0, int arg1) {
        field850++;
        if (class218.field3721[arg0]) {
            return true;
        } else if (class198.field3331.method1905((byte) -110, arg0)) {
            int var2 = class198.field3331.method1914(-123, arg0);
            if (var2 == 0) {
                class218.field3721[arg0] = true;
                return true;
            }
            if (class249.field4198[arg0] == null) {
                class249.field4198[arg0] = new class262[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class249.field4198[arg0][var3] == null) {
                    byte[] var4 = class198.field3331.method1911(arg0, var3, -109);
                    if (var4 != null) {
                        class249.field4198[arg0][var3] = new class262();
                        class249.field4198[arg0][var3].field4418 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class249.field4198[arg0][var3].method1874((byte) 127, new class60(var4));
                        } else {
                            class249.field4198[arg0][var3].method1871(false, new class60(var4));
                        }
                    }
                }
            }
            if (arg1 > -109) {
                field844 = (int[][]) ((int[][]) null);
            }
            class218.field3721[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 241)
    public static final void method376(byte arg0) {
        if (arg0 <= 21) {
            return;
        }
        field832++;
        try {
            if (class16.field202 == null) {
                class16.field202 = new class138(class210.field3585, class66.method562((byte) 121, new class75[] { class152.method1164(true), class136.field2331 }).method646(108));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class16.field202 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lcb;Lcb;I)V", line = 262)
    public static final void method377(class267 arg0, class267 arg1, int arg2) {
        class66.field1138 = arg0;
        if (arg2 < 110) {
            method374(104, 95);
        }
        class19.field244 = arg1;
        field836++;
        class158.field2718 = class19.field244.method1914(-37, 3);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)V", line = 295)
    public static final void method378(int arg0, int arg1) {
        class242 var2 = class271.field4681[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class242 var4 = class271.field4681[var3][arg0][arg1] = class271.field4681[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4087--;
                for (int var5 = 0; var5 < var4.field4086; var5++) {
                    class285 var6 = var4.field4083[var5];
                    if ((var6.field4914 >> 29 & 0x3L) == 2L && var6.field4907 == arg0 && var6.field4895 == arg1) {
                        var6.field4904--;
                    }
                }
            }
        }
        if (class271.field4681[0][arg0][arg1] == null) {
            class271.field4681[0][arg0][arg1] = new class242(0, arg0, arg1);
        }
        class271.field4681[0][arg0][arg1].field4088 = var2;
        class271.field4681[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 332)
    public static void method379(int arg0) {
        field842 = null;
        field849 = null;
        int var1 = 123 / ((-arg0 - 13) / 49);
        field834 = null;
        field833 = null;
        field837 = null;
        field856 = null;
        field854 = null;
        field844 = (int[][]) null;
        field847 = (int[][][]) null;
    }
}

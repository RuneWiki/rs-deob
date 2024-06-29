import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class127 {

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public int field3197 = 0;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field3191 = 0;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lpd;")
    public static class94 field3183 = class28.method249(42, "(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "J")
    public static long field3196 = 0L;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    public static int[] field3200 = new int[2000];

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Lpd;")
    private static class94 field3201 = class28.method249(-123, "Report abuse");

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lpd;")
    public static class94 field3194 = field3201;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lvc;")
    public static class128 field3186 = new class128(64);

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lpd;")
    private static class94 field3208 = class28.method249(-62, "Loaded wordpack");

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Lpd;")
    public static class94 field3207 = field3208;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field3209 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Lbe;")
    public class12 field3203;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "[[[B")
    public static byte[][][] field3206;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILme;)Z", line = 22)
    public static final boolean method1002(int arg0, class77 arg1) {
        field3202++;
        int var2 = arg1.field1896;
        if (class52.field1303 == 2) {
            if (var2 == 201) {
                class8.field226 = class8.field230;
                class110.field2741 = 0;
                class79.field1995 = true;
                class8.field227 = class126.field3173;
                class73.field1781 = true;
                class90.field2328 = 1;
            }
            if (var2 == 202) {
                class90.field2328 = 2;
                class73.field1781 = true;
                class79.field1995 = true;
                class110.field2741 = 0;
                class8.field227 = class64.field1592;
                class8.field226 = class8.field230;
            }
        }
        if (var2 == 205) {
            class64.field1595 = 250;
            return true;
        } else if (arg0 == 2) {
            if (var2 == 501) {
                class90.field2328 = 4;
                class79.field1995 = true;
                class110.field2741 = 0;
                class8.field227 = class6.field113;
                class73.field1781 = true;
                class8.field226 = class8.field230;
            }
            if (var2 == 502) {
                class90.field2328 = 5;
                class8.field227 = class50.field1250;
                class79.field1995 = true;
                class73.field1781 = true;
                class110.field2741 = 0;
                class8.field226 = class8.field230;
            }
            if (var2 >= 300 && var2 <= 313) {
                int var3 = (var2 - 300) / 2;
                int var4 = var2 & 0x1;
                class52.field1304.method522(-3053, var3, var4 == 1);
            }
            if (var2 >= 314 && var2 <= 323) {
                int var5 = (var2 - 314) / 2;
                int var6 = var2 & 0x1;
                class52.field1304.method524(var6 == 1, var5, -1);
            }
            if (var2 == 324) {
                class52.field1304.method523((byte) -11, false);
            }
            if (var2 == 325) {
                class52.field1304.method523((byte) -11, true);
            }
            if (var2 == 326) {
                class105.field2616++;
                class107.field2670.method326(113, -101);
                class52.field1304.method512(-122, class107.field2670);
                return true;
            }
            if (var2 == 620) {
                class122.field3100 = !class122.field3100;
            }
            if (var2 >= 601 && var2 <= 613) {
                class1.method1((byte) -120);
                if (class8.field236.method710(-123) > 0) {
                    class57.field1431++;
                    class107.field2670.method326(254, -107);
                    class107.field2670.method965(-75, class8.field236.method709((byte) 59));
                    class107.field2670.method916(-2, var2 - 601);
                    class107.field2670.method916(-2, class122.field3100 ? 1 : 0);
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 141)
    public static void method1003(int arg0) {
        field3208 = null;
        field3206 = null;
        field3207 = null;
        field3201 = null;
        field3183 = null;
        if (arg0 != 326) {
            field3183 = null;
        }
        field3186 = null;
        field3194 = null;
        field3200 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(JI)V", line = 162)
    public static final void method1004(long arg0, int arg1) {
        field3188++;
        int var3 = 7 / ((arg1 - 41) / 43);
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class92.method681((byte) 81, arg0 - 1L);
            class92.method681((byte) 48, 1L);
        } else {
            class92.method681((byte) 67, arg0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 197)
    public static final void method1005(int arg0) {
        field3198++;
        if (class4.field94 == 0) {
            return;
        }
        class16 var1 = class112.field2835;
        int var2 = 0;
        if (arg0 != -3) {
            method1004(123L, 91);
        }
        if (class12.field312 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class55.field1410[var3] != null) {
                int var4 = class82.field2110[var3];
                class94 var5 = class42.field1067[var3];
                byte var6 = 0;
                if (var5 != null && var5.method686(arg0 ^ 0x64, class17.field445)) {
                    var6 = 1;
                    var5 = var5.method687(5, -123);
                }
                if (var5 != null && var5.method686(-99, class46.field1122)) {
                    var6 = 2;
                    var5 = var5.method687(5, -123);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class102.field2569 == 0 || class102.field2569 == 1 && class2.method9(false, var5))) {
                    int var7 = 329 - var2 * 13;
                    var2++;
                    byte var8 = 4;
                    var1.method115(class20.field533, var8, var7, 0);
                    var1.method115(class20.field533, var8, var7 - 1, 65535);
                    int var9 = var8 + var1.method118(class20.field533);
                    int var10 = var9 + var1.method122(32);
                    if (var6 == 1) {
                        class89.field2308[0].method33(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class89.field2308[1].method33(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method115(class4.method20(new class94[] { var5, class77.field1929, class55.field1410[var3] }, true), var10, var7, 0);
                    var1.method115(class4.method20(new class94[] { var5, class77.field1929, class55.field1410[var3] }, true), var10, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class102.field2569 < 2) {
                    int var11 = 329 - var2 * 13;
                    var1.method115(class55.field1410[var3], 4, var11, 0);
                    var1.method115(class55.field1410[var3], 4, var11 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class102.field2569 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method115(class4.method20(new class94[] { class101.field2552, class76.field1859, var5, class77.field1929, class55.field1410[var3] }, true), 4, var12, 0);
                    var1.method115(class4.method20(new class94[] { class101.field2552, class76.field1859, var5, class77.field1929, class55.field1410[var3] }, true), 4, var12 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IJ)V", line = 325)
    public static final void method1006(int arg0, long arg1) {
        field3193++;
        if (arg1 == 0L) {
            return;
        }
        if (class77.field1963 >= 100 && class110.field2730 != 1 || class77.field1963 >= 200) {
            class41.method311(0, class8.field230, (byte) 68, class113.field2841);
            return;
        }
        class94 var3 = class120.method900(arg1, 0).method707(-14211);
        for (int var4 = 0; var4 < class77.field1963; var4++) {
            if (class10.field265[var4] == arg1) {
                class41.method311(0, class8.field230, (byte) 69, class4.method20(new class94[] { var3, class21.field589 }, true));
                return;
            }
        }
        for (int var5 = 0; var5 < class89.field2322; var5++) {
            if (class79.field2009[var5] == arg1) {
                class41.method311(0, class8.field230, (byte) 78, class4.method20(new class94[] { class92.field2358, var3, class86.field2166 }, true));
                return;
            }
        }
        if (var3.method689((byte) 59, class80.field2044.field2295)) {
            return;
        }
        class120.field3008[class77.field1963] = var3;
        class20.field560++;
        class10.field265[class77.field1963] = arg1;
        class72.field1723[class77.field1963] = 0;
        class77.field1963++;
        class135.field3323 = true;
        class107.field2670.method326(179, -120);
        class107.field2670.method965(-122, arg1);
        if (arg0 < 6) {
            field3200 = null;
        }
    }
}

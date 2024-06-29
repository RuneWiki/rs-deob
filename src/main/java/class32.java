import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    public static int[] field670 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lv;")
    private static class146 field665 = class159.method1226((byte) -37, "red:");

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lv;")
    public static class146 field673 = class159.method1226((byte) -37, "Schlie-8en");

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lv;")
    public static class146 field676 = field665;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lv;")
    public static class146 field669 = field665;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lv;")
    public static class146 field677 = class159.method1226((byte) -37, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[J")
    public static long[] field678 = new long[100];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "J")
    public long field679;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lec;")
    public class32 field664;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lec;")
    public class32 field674;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[Ltb;")
    public static class134[] field672;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
    public static final void method214(int arg0, int arg1, int arg2, int arg3) {
        class25.method160((byte) 43);
        if (arg3 != 4) {
            field671 = 114;
        }
        class56.method387(arg2, arg1, arg2 + class77.field1854.field3280, class77.field1854.field3287 + arg1);
        if (class74.field1747 == 2 || class74.field1747 == 5) {
            class56.method375(arg2 + 25, arg1 + 5, 0, class150.field3463, class110.field2612);
        } else {
            int var4 = class72.field1692 + class18.field296 & 0x7FF;
            int var5 = class116.field2696.field757 / 32 + 48;
            int var6 = 464 - class116.field2696.field790 / 32;
            class124.field2879.method441(arg2 + 25, arg1 + 5, 146, 151, var5, var6, var4, field667 + 256, class150.field3463, class110.field2612);
            for (int var7 = 0; var7 < class121.field2815; var7++) {
                int var37 = class79.field1953[var7] * 4 + 2 - class116.field2696.field757 / 32;
                int var38 = class124.field2884[var7] * 4 + 2 - class116.field2696.field790 / 32;
                class26.method170(arg2, var37, arg1, 5, var38, class38.field840[var7]);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class152 var34 = class148.field3434[class148.field3428][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class116.field2696.field757 / 32;
                        int var36 = var33 * 4 + 2 - class116.field2696.field790 / 32;
                        class26.method170(arg2, var35, arg1, arg3 + 1, var36, class42.field969[0]);
                    }
                }
            }
            for (int var9 = 0; var9 < class91.field2171; var9++) {
                class38 var29 = class34.field735[class57.field1271[var9]];
                if (var29 != null && var29.method235(-84)) {
                    class79 var30 = var29.field849;
                    if (var30 != null && var30.field1935 != null) {
                        var30 = var30.method603(false);
                    }
                    if (var30 != null && var30.field1909 && var30.field1911) {
                        int var31 = var29.field757 / 32 - class116.field2696.field757 / 32;
                        int var32 = var29.field790 / 32 - class116.field2696.field790 / 32;
                        class26.method170(arg2, var31, arg1, 5, var32, class42.field969[1]);
                    }
                }
            }
            for (int var10 = 0; var10 < class126.field2925; var10++) {
                class67 var21 = class125.field2902[class136.field3080[var10]];
                if (var21 != null && var21.method235(-103)) {
                    int var22 = var21.field757 / 32 - class116.field2696.field757 / 32;
                    int var23 = var21.field790 / 32 - class116.field2696.field790 / 32;
                    boolean var24 = false;
                    long var25 = var21.field1506.method1101(122);
                    for (int var27 = 0; var27 < class124.field2892; var27++) {
                        if (class120.field2776[var27] == var25 && class100.field2433[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class116.field2696.field1516 != 0 && var21.field1516 != 0 && class116.field2696.field1516 == var21.field1516) {
                        var28 = true;
                    }
                    if (var24) {
                        class26.method170(arg2, var22, arg1, 5, var23, class42.field969[3]);
                    } else if (var28) {
                        class26.method170(arg2, var22, arg1, arg3 ^ 0x1, var23, class42.field969[4]);
                    } else {
                        class26.method170(arg2, var22, arg1, 5, var23, class42.field969[2]);
                    }
                }
            }
            if (class41.field934 != 0 && class94.field2229 % 20 < 10) {
                if (class41.field934 == 1 && class157.field3615 >= 0 && class157.field3615 < class34.field735.length) {
                    class38 var11 = class34.field735[class157.field3615];
                    if (var11 != null) {
                        int var12 = var11.field757 / 32 - class116.field2696.field757 / 32;
                        int var13 = var11.field790 / 32 - class116.field2696.field790 / 32;
                        class110.method869(var13, class31.field661[1], arg2, true, var12, arg1);
                    }
                }
                if (class41.field934 == 2) {
                    int var14 = (class82.field2006 - class63.field1429) * 4 + 2 - class116.field2696.field757 / 32;
                    int var15 = (class82.field2002 - class76.field1814) * 4 + 2 - class116.field2696.field790 / 32;
                    class110.method869(var15, class31.field661[1], arg2, true, var14, arg1);
                }
                if (class41.field934 == 10 && class78.field1895 >= 0 && class125.field2902.length > class78.field1895) {
                    class67 var16 = class125.field2902[class78.field1895];
                    if (var16 != null) {
                        int var17 = var16.field790 / 32 - class116.field2696.field790 / 32;
                        int var18 = var16.field757 / 32 - class116.field2696.field757 / 32;
                        class110.method869(var17, class31.field661[1], arg2, true, var18, arg1);
                    }
                }
            }
            if (class63.field1421 != 0) {
                int var19 = class63.field1421 * 4 + 2 - class116.field2696.field757 / 32;
                int var20 = class110.field2608 * 4 + 2 - class116.field2696.field790 / 32;
                class26.method170(arg2, var19, arg1, 5, var20, class31.field661[0]);
            }
            class56.method382(arg2 + 93 + 4, arg1 + -4 - -82, 3, 3, 16777215);
        }
        field675++;
        if (class74.field1747 >= 3) {
            class56.method375(arg2, arg1, 0, class24.field387, class79.field1941);
        } else {
            class141.field3234.method441(arg2, arg1, 33, 33, 25, 25, class72.field1692, 256, class24.field387, class79.field1941);
        }
        if (class26.field567[arg0]) {
            class77.field1854.method1065(arg2, arg1);
        }
        class157.field3627[arg0] = true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method215(int arg0) {
        field677 = null;
        field676 = null;
        field669 = null;
        field678 = null;
        field665 = null;
        if (arg0 != 11411) {
            field672 = null;
        }
        field670 = null;
        field672 = null;
        field673 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static final void method216(int arg0) {
        for (int var1 = 0; var1 < class91.field2171; var1++) {
            int var2 = class57.field1271[var1];
            class38 var3 = class34.field735[var2];
            if (var3 != null) {
                class71.method510(true, var3, var3.field849.field1922);
            }
        }
        if (arg0 == 93) {
            field666++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public final void method217(int arg0) {
        field668++;
        if (this.field674 != null && arg0 == -1264) {
            this.field674.field664 = this.field664;
            this.field664.field674 = this.field674;
            this.field664 = null;
            this.field674 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Z")
    public final boolean method218(int arg0) {
        field663++;
        if (arg0 < 102) {
            return false;
        } else {
            return this.field674 != null;
        }
    }
}

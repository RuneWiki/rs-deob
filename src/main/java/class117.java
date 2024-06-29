import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class117 extends class34 {

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Z")
    private boolean field1764 = true;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "Z")
    private boolean field1766 = true;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "[I")
    public static int[] field1762 = new int[200];

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1763 = "Loading world list data";

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "[I")
    public static int[] field1759 = new int[2000];

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field1765 = 5063219;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1769 = "Drop";

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
    public static boolean field1767;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BJ)V")
    public static final void method828(byte arg0, long arg1) {
        ++field1770;
        if (class133.field1954 != 1 && class133.field1954 != 5) {
            if (~class133.field1954 != -3) {
                class103.method753(2);
            } else {
                class124.method870((byte) -98);
            }
        } else {
            class71.method554(arg1, (byte) -103);
        }
        if (!class66.field1093) {
            class179.field2614[0] = class240.field3737;
            if (class85.field1305 != 0) {
                class101.field1470 = class220.field3435;
                class102.field1490 = class281.field4314;
            } else if (class295.field4482 != 0) {
                class102.field1490 = class157.field2303;
                class101.field1470 = class87.field1317;
            } else {
                class102.field1490 = class12.field172;
                class101.field1470 = class105.field1542;
            }
            class186.field2708[0] = class181.field2642;
            class51.field826 = 1;
            class280.field4297[0] = "";
            class265.field4147[0] = 1007;
        }
        if (~class184.field2677 != 0) {
            class160.method1080(36, class184.field2677);
        }
        for (int var3 = 0; ~class123.field1818 < ~var3; ++var3) {
            if (class17.field315[var3]) {
                class285.field4371[var3] = true;
            }
            class92.field1391[var3] = class17.field315[var3];
            class17.field315[var3] = false;
        }
        if (arg0 > 23) {
            class124.field1842 = class120.field1794;
            class154.field2252 = null;
            class208.field3115 = -1;
            class239.field3679 = -1;
            class64.field1066 = null;
            if (~class184.field2677 != 0) {
                class123.field1818 = 0;
                class149.method1012(-31601);
            }
            class72.method561();
            class56.method471((byte) 74);
            if (!class66.field1093) {
                if (class64.field1066 != null) {
                    class107.method777(class127.field1869, class167.field2461, -105, class64.field1066);
                } else if (class239.field3679 != -1) {
                    class107.method777(class239.field3679, class208.field3115, 106, (class297) null);
                }
            } else if (!class197.field2979) {
                class154.method1045(true);
            } else {
                class108.method782((byte) 105);
            }
            int var4 = class66.field1093 ? -1 : class281.method1868((byte) 103);
            if (~var4 == 0) {
                var4 = class240.field3725;
            }
            class292.method1931(var4, (byte) -16);
            if (class16.field290 == 1) {
                class16.field290 = 2;
            }
            if (~class42.field746 == -2) {
                class42.field746 = 2;
            }
            if (class275.field4250 == 3) {
                for (int var5 = 0; ~class123.field1818 < ~var5; ++var5) {
                    if (class92.field1391[var5]) {
                        class72.method573(class150.field2189[var5], class188.field2802[var5], class247.field3848[var5], class166.field2453[var5], 16711935, 128);
                    } else if (class285.field4371[var5]) {
                        class72.method573(class150.field2189[var5], class188.field2802[var5], class247.field3848[var5], class166.field2453[var5], 16711680, 128);
                    }
                }
            }
            class8.method69(1, class185.field2687.field455, class260.field3986, class185.field2687.field425, class177.field2599);
            class177.field2599 = 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field604 = arg2.method407(255) == 1;
                }
            } else {
                this.field1766 = arg2.method407(arg0 ^ 249) == 1;
            }
        } else {
            this.field1764 = ~arg2.method407(255) == -2;
        }
        if (arg0 != 6) {
            method830(42);
        }
        ++field1768;
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public static final void method829(int arg0) {
        ++field1760;
        int var1 = -1;
        if (arg0 <= -65) {
            while (class266.field4155 > var1) {
                int var2;
                if (~var1 != 0) {
                    var2 = class205.field3068[var1];
                } else {
                    var2 = 2047;
                }
                class224 var3 = class166.field2438[var2];
                if (var3 != null) {
                    class183.method1201(var3.method168(-83), var3, false);
                }
                ++var1;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            this.field1766 = false;
        }
        ++field1771;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int[] var4 = this.method230(!this.field1766 ? arg1 : class201.field3014 - arg1, -15337, 0);
            if (!this.field1764) {
                class41.method338(var4, 0, var3, 0, class226.field3527);
            } else {
                for (int var5 = 0; class226.field3527 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class167.field2457];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
    public static void method830(int arg0) {
        field1763 = null;
        field1759 = null;
        field1762 = null;
        int var1 = 34 / ((arg0 - -13) / 59);
        field1769 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field1772;
        int var3 = -28 / ((-54 - arg0) / 44);
        int[][] var4 = super.field618.method91(-119, arg1);
        if (super.field618.field211) {
            int[][] var5 = this.method231(!this.field1766 ? arg1 : -arg1 + class201.field3014, (byte) 84, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[2];
            int[] var11 = var4[2];
            if (!this.field1764) {
                for (int var12 = 0; class226.field3527 > var12; ++var12) {
                    var8[var12] = var6[var12];
                    var9[var12] = var7[var12];
                    var11[var12] = var10[var12];
                }
            } else {
                for (int var13 = 0; class226.field3527 > var13; ++var13) {
                    var8[var13] = var6[-var13 + class167.field2457];
                    var9[var13] = var7[-var13 + class167.field2457];
                    var11[var13] = var10[class167.field2457 - var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class117() {
        super(1, false);
    }
}

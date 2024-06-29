import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class79 extends class97 {

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "[I")
    private int[] field2096 = new int[6];

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    private int field2106 = 0;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    private int field2097 = 0;

    @OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
    private int field2113 = 128;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    private int field2098 = 128;

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
    public int field2110 = -1;

    @OriginalMember(owner = "client!nb", name = "lb", descriptor = "I")
    private int field2116 = 0;

    @OriginalMember(owner = "client!nb", name = "ob", descriptor = "[I")
    private int[] field2119 = new int[6];

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    public static int field2102 = 500;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "Z")
    public static boolean field2107 = false;

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "Lke;")
    private static class65 field2111 = class1.method17("M", -123);

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "Lke;")
    public static class65 field2104 = field2111;

    @OriginalMember(owner = "client!nb", name = "nb", descriptor = "Lke;")
    private static class65 field2118 = class1.method17("Choose Option", -126);

    @OriginalMember(owner = "client!nb", name = "pb", descriptor = "Lke;")
    private static class65 field2120 = class1.method17("Please wait )2 attempting to reestablish", -121);

    @OriginalMember(owner = "client!nb", name = "hb", descriptor = "Lke;")
    public static class65 field2112 = field2118;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "Lke;")
    public static class65 field2105 = field2120;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!nb", name = "jb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!nb", name = "kb", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!nb", name = "mb", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V", line = 5)
    public static void method692(int arg0) {
        field2111 = null;
        field2104 = null;
        if (arg0 != 40) {
            method693(16);
        }
        field2118 = null;
        field2105 = null;
        field2120 = null;
        field2112 = null;
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V", line = 22)
    public static final void method693(int arg0) {
        class98.field2530.method834(5875);
        if (arg0 < -17) {
            field2114++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lg;B)V", line = 47)
    public final void method694(class39 arg0, byte arg1) {
        field2117++;
        if (arg1 != 44) {
            return;
        }
        while (true) {
            int var3 = arg0.method334(arg1 ^ 0x5E);
            if (var3 == 0) {
                return;
            }
            this.method697(var3, arg0, 104);
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)[Luc;", line = 95)
    public static final class119[] method695(byte arg0) {
        field2099++;
        if (arg0 != -91) {
            method695((byte) 93);
        }
        class119[] var1 = new class119[class111.field2737];
        for (int var2 = 0; var2 < class111.field2737; var2++) {
            class119 var3 = var1[var2] = new class119();
            var3.field2951 = class88.field2348;
            var3.field2950 = class65.field1747;
            var3.field2948 = class99.field2582[var2];
            var3.field2953 = class12.field254[var2];
            var3.field2954 = class113.field2832[var2];
            var3.field2949 = class35.field891[var2];
            var3.field2952 = class53.field1366;
            var3.field2947 = class58.field1561[var2];
        }
        class104.method860(false);
        return var1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Lga;", line = 159)
    public final class37 method696(byte arg0, int arg1) {
        field2109++;
        class37 var3 = (class37) class50.field1274.method833((byte) -53, (long) this.field2103);
        if (arg0 < 69) {
            this.field2119 = null;
        }
        if (var3 == null) {
            var3 = class37.method297(class90.field2379, this.field2108, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2096[0] != 0) {
                    var3.method291(this.field2096[var4], this.field2119[var4]);
                }
            }
            var3.method268();
            var3.method287(this.field2106 + 64, this.field2116 + 850, -30, -50, -30, true);
            class50.field1274.method836((long) this.field2103, var3, true);
        }
        class37 var5;
        if (this.field2110 == -1 || arg1 == -1) {
            var5 = var3.method288(true);
        } else {
            var5 = class80.method702(111, this.field2110).method8(arg1, var3, (byte) 127);
        }
        if (this.field2113 != 128 || this.field2098 != 128) {
            var5.method289(this.field2113, this.field2098, this.field2113);
        }
        if (this.field2097 != 0) {
            if (this.field2097 == 90) {
                var5.method269();
            }
            if (this.field2097 == 180) {
                var5.method269();
                var5.method269();
            }
            if (this.field2097 == 270) {
                var5.method269();
                var5.method269();
                var5.method269();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILg;I)V", line = 227)
    private final void method697(int arg0, class39 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2108 = arg1.method326(255);
        } else if (arg0 == 2) {
            this.field2110 = arg1.method326(255);
        } else if (arg0 == 4) {
            this.field2113 = arg1.method326(255);
        } else if (arg0 == 5) {
            this.field2098 = arg1.method326(255);
        } else if (arg0 == 6) {
            this.field2097 = arg1.method326(255);
        } else if (arg0 == 7) {
            this.field2106 = arg1.method334(126);
        } else if (arg0 == 8) {
            this.field2116 = arg1.method334(122);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2096[arg0 - 40] = arg1.method326(255);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2119[arg0 - 50] = arg1.method326(255);
        }
        field2100++;
        int var4 = -65 / ((-arg2 - 30) / 34);
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(B)V", line = 274)
    public static final void method698(byte arg0) {
        class58.field1575.method639(true);
        field2115++;
        int var1 = class58.field1575.method649(118, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class58.field1575.method649(96, 2);
        int var3 = -113 / ((arg0 + 32) / 47);
        if (var2 == 0) {
            class46.field1211[class75.field2019++] = 2047;
        } else if (var2 == 1) {
            int var4 = class58.field1575.method649(85, 3);
            class32.field833.method366(var4, false, false);
            int var5 = class58.field1575.method649(59, 1);
            if (var5 == 1) {
                class46.field1211[class75.field2019++] = 2047;
            }
        } else if (var2 == 2) {
            int var6 = class58.field1575.method649(44, 3);
            class32.field833.method366(var6, false, true);
            int var7 = class58.field1575.method649(85, 3);
            class32.field833.method366(var7, false, true);
            int var8 = class58.field1575.method649(106, 1);
            if (var8 == 1) {
                class46.field1211[class75.field2019++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class58.field1575.method649(90, 1);
            if (var9 == 1) {
                class46.field1211[class75.field2019++] = 2047;
            }
            class19.field462 = class58.field1575.method649(46, 2);
            int var10 = class58.field1575.method649(108, 7);
            int var11 = class58.field1575.method649(117, 1);
            int var12 = class58.field1575.method649(114, 7);
            class32.field833.method362(var11 == 1, var10, (byte) 77, var12);
        }
    }
}

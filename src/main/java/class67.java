import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class67 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field948 = 0;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lqj;")
    public static class196 field954 = class80.method502("<br>", -48);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field956 = 0;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lqj;")
    public static class196 field955 = class80.method502("Hidden)2use", -48);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lqj;")
    public static class196 field953 = class80.method502("<col=00ff80>", -48);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lqj;")
    public static class196 field958 = class80.method502(":duelfriend:", -48);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method428(int arg0) {
        field955 = null;
        field954 = null;
        field958 = null;
        if (arg0 == -11777) {
            field953 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)V")
    public static final void method429(boolean arg0, int arg1) {
        field957++;
        int var2 = class252.field4451;
        if (class102.field1477.field2081 >> 7 == class12.field133 && class102.field1477.field2085 >> 7 == class80.field1151) {
            class12.field133 = 0;
        }
        if (arg0) {
            var2 = 1;
        }
        if (arg1 != 22380) {
            field954 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class134 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class102.field1477;
            } else {
                var6 = class247.field4397[class14.field153[var3]];
                var4 = (long) class14.field153[var3] << 32;
            }
            if (var6 != null && var6.method811(-10)) {
                var6.field1929 = false;
                if ((class203.field3661 && class252.field4451 > 200 || class252.field4451 > 50) && !arg0 && var6.field2091 == var6.field2063) {
                    var6.field1929 = true;
                }
                int var7 = var6.field2081 >> 7;
                int var8 = var6.field2085 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field1931 == null || var6.field1909 > class171.field2879 || var6.field1940 <= class171.field2879) {
                        if ((var6.field2081 & 0x7F) == 64 && (var6.field2085 & 0x7F) == 64) {
                            if (class109.field1558[var7][var8] == class163.field2640) {
                                continue;
                            }
                            class109.field1558[var7][var8] = class163.field2640;
                        }
                        var6.field2054 = class74.method470(var6.field2085, class27.field335, 103, var6.field2081);
                        class87.method543(class27.field335, var6.field2081, var6.field2085, var6.field2054, 60, var6, var6.field2096, var4, var6.field2069);
                    } else {
                        var6.field1929 = false;
                        var6.field2054 = class74.method470(var6.field2085, class27.field335, 103, var6.field2081);
                        class224.method1520(class27.field335, var6.field2081, var6.field2085, var6.field2054, var6, var6.field2096, var4, var6.field1922, var6.field1920, var6.field1921, var6.field1918);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method430(byte arg0) {
        field949++;
        if (arg0 != 75) {
            method434((byte) -11, null, null);
        }
        class73.field1057++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILdj;I)V")
    public static final void method431(int arg0, class137 arg1, int arg2) {
        if (class171.field2879 < arg1.field2089) {
            class183.method1196(arg1, 0);
        } else if (class171.field2879 > arg1.field2060) {
            class210.method1457(false, arg1);
        } else {
            class169.method1103((byte) 15, arg1);
        }
        field959++;
        if (arg1.field2081 < 128 || arg1.field2085 < 128 || arg1.field2081 >= 13184 || arg1.field2085 >= 13184) {
            arg1.field2060 = 0;
            arg1.field2085 = arg1.field2046[0] * 128 + arg1.field2049 * 64;
            arg1.field2081 = arg1.field2102[0] * 128 + arg1.field2049 * 64;
            arg1.field2086 = -1;
            arg1.field2089 = 0;
            arg1.field2113 = -1;
            arg1.method857(false);
        }
        if (class102.field1477 == arg1 && (arg1.field2081 < 1536 || arg1.field2085 < 1536 || arg1.field2081 >= 11776 || arg1.field2085 >= 11776)) {
            arg1.field2085 = arg1.field2046[0] * 128 + arg1.field2049 * 64;
            arg1.field2086 = -1;
            arg1.field2081 = arg1.field2102[0] * 128 + arg1.field2049 * 64;
            arg1.field2113 = -1;
            arg1.field2089 = 0;
            arg1.field2060 = 0;
            arg1.method857(false);
        }
        class175.method1142((byte) 104, arg1);
        if (arg0 <= 110) {
            field956 = 77;
        }
        class209.method1451(arg1, -1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public static final int method432(int arg0, int arg1) {
        field952++;
        if (arg1 != -1856356953) {
            method430((byte) -76);
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)J")
    public static final long method433(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        return var3 == null || var3.field830 == null ? 0L : var3.field830.field73;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLbk;Lbk;)V")
    public static final void method434(byte arg0, class136 arg1, class136 arg2) {
        field951++;
        class76.field1097 = class144.method897(0, arg2, -8686, arg1, class189.field3310);
        class80.field1152 = (class184) class76.field1097;
        class226.field4045 = class144.method897(0, arg2, -8686, arg1, class108.field1547);
        class23.field292 = class144.method897(0, arg2, -8686, arg1, class214.field3829);
        if (arg0 != -103) {
            field950 = 66;
        }
    }
}

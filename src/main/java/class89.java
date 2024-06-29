import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 extends class63 {

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "Lnd;")
    public class94 field2067 = new class94();

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "La;")
    public class1 field2076 = new class1();

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Lkd;")
    private class73 field2055;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Laf;")
    public static class7 field2056 = class48.method406(40, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Laf;")
    private static class7 field2058 = class48.method406(40, "glow2:");

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Laf;")
    public static class7 field2063 = field2058;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field2073 = 0;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field2075 = -1;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Laf;")
    public static class7 field2072 = field2058;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "Lbd;")
    public static class12 field2068 = new class12(4096);

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "Laf;")
    private static class7 field2077 = class48.method406(40, "New User");

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "Laf;")
    public static class7 field2079 = class48.method406(40, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field2078 = 0;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "Laf;")
    public static class7 field2080 = field2077;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    public static int field2081 = -1;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    public static int field2083 = 0;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Laf;")
    public static class7 field2084 = class48.method406(40, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "[I")
    public static int[] field2061;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "[I")
    public static int[] field2074;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()I")
    public final int method5() {
        field2059++;
        return 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([III)V")
    public final void method12(int[] arg0, int arg1, int arg2) {
        field2069++;
        this.field2076.method12(arg0, arg1, arg2);
        for (class83 var4 = (class83) this.field2067.method758(255); var4 != null; var4 = (class83) this.field2067.method766(-70)) {
            if (!this.field2055.method619(-38, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1935) {
                        this.method731(-116, arg0, var5 + var6, var6, var5, var4);
                        var4.field1935 -= var5;
                        break;
                    }
                    this.method731(-101, arg0, var5 + var6, var6, var4.field1935, var4);
                    var6 += var4.field1935;
                    var5 -= var4.field1935;
                } while (!this.field2055.method628(arg0, var4, var6, (byte) -77, var5));
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static final void method729(int arg0) {
        if (!class78.field1817) {
            class147.field3473[0] = 1003;
            class147.field3449[0] = class79.field1842;
            class84.field1977[0] = class52.field1243;
            class19.field449 = 1;
        }
        if (class9.field250 != -1) {
            class145.method1173(class9.field250, (byte) 11);
        }
        for (int var1 = 0; var1 < class83.field1951; var1++) {
            if (class2.field9[var1]) {
                class133.field3114[var1] = true;
            }
            class73.field1653[var1] = class2.field9[var1];
            class2.field9[var1] = false;
        }
        if (arg0 >= -29) {
            method733(-17);
        }
        class101.field2395 = class155.field3611;
        field2070++;
        class9.field253 = null;
        class19.field511 = -1;
        field2075 = -1;
        if (class9.field250 != -1) {
            class83.field1951 = 0;
            class67.method539(0, 765, 0, 503, 0, class9.field250, 0, -1, 0);
        }
        class101.method829(-2991);
        if (class78.field1817) {
            class127.method1052(-117);
        } else if (field2075 != -1) {
            class75.method648(field2075, class19.field511, -112);
        }
        if (class126.field3007 == 3) {
            class33.method302();
            for (int var2 = 0; var2 < class83.field1951; var2++) {
                if (class73.field1653[var2]) {
                    class33.method303(class86.field2002[var2], class96.field2294[var2], class105.field2579[var2], class28.field730[var2], 16711935, 128);
                } else if (class133.field3114[var2]) {
                    class33.method303(class86.field2002[var2], class96.field2294[var2], class105.field2579[var2], class28.field730[var2], 16711680, 128);
                }
            }
        }
        class22.method221(class8.field186, class21.field531.field505, class21.field531.field491, (byte) -122, class108.field2646);
        class108.field2646 = 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILof;)V")
    public static final void method730(int arg0, class103 arg1) {
        int var2 = arg1.field2512;
        field2065++;
        if (var2 == 324) {
            if (class50.field1192 == -1) {
                class23.field632 = arg1.field2511;
                class50.field1192 = arg1.field2489;
            }
            if (class116.field2759.field3246) {
                arg1.field2489 = class50.field1192;
            } else {
                arg1.field2489 = class23.field632;
            }
            return;
        }
        if (arg0 != 31348) {
            field2080 = null;
        }
        if (var2 == 325) {
            if (class50.field1192 == -1) {
                class23.field632 = arg1.field2511;
                class50.field1192 = arg1.field2489;
            }
            if (class116.field2759.field3246) {
                arg1.field2489 = class23.field632;
            } else {
                arg1.field2489 = class50.field1192;
            }
        } else if (var2 == 327) {
            arg1.field2431 = 150;
            arg1.field2548 = (int) (Math.sin((double) class155.field3611 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2563 = 0;
            arg1.field2535 = 5;
        } else if (var2 == 328) {
            arg1.field2431 = 150;
            arg1.field2548 = (int) (Math.sin((double) class155.field3611 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2563 = 1;
            arg1.field2535 = 5;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()Lja;")
    public final class63 method7() {
        field2053++;
        class83 var1 = (class83) this.field2067.method758(255);
        if (var1 == null) {
            return null;
        } else if (var1.field1939 == null) {
            return this.method4();
        } else {
            return var1.field1939;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()Lja;")
    public final class63 method4() {
        field2062++;
        class83 var1;
        do {
            var1 = (class83) this.field2067.method766(-67);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1939 == null);
        return var1.field1939;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[IIIILm;)V")
    private final void method731(int arg0, int[] arg1, int arg2, int arg3, int arg4, class83 arg5) {
        if ((this.field2055.field1662[arg5.field1963] & 0x4) != 0 && arg5.field1969 < 0) {
            int var7 = this.field2055.field1658[arg5.field1963] / class48.field1164;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field1937) / var7;
                if (var8 > arg4) {
                    arg5.field1937 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg5.field1939.method12(arg1, arg3, var8);
                arg3 += var8;
                arg5.field1937 += var7 * var8 - 1048576;
                int var9 = class48.field1164 / 100;
                class59 var10 = arg5.field1939;
                int var11 = 262144 / var7;
                if (var9 > var11) {
                    var9 = var11;
                }
                if (this.field2055.field1703[arg5.field1963] == 0) {
                    arg5.field1939 = class59.method496(arg5.field1936, var10.method500(), var10.method476(), var10.method486());
                } else {
                    arg5.field1939 = class59.method496(arg5.field1936, var10.method500(), 0, var10.method486());
                    this.field2055.method623(arg5.field1954.field256[arg5.field1974] < 0, arg5, 8);
                    arg5.field1939.method491(var9, var10.method476());
                }
                if (arg5.field1954.field256[arg5.field1974] < 0) {
                    arg5.field1939.method490(-1);
                }
                var10.method495(var9);
                var10.method12(arg1, arg3, arg2 - arg3);
                if (var10.method488()) {
                    this.field2076.method3(var10);
                }
            }
        }
        field2057++;
        arg5.field1939.method12(arg1, arg3, arg4);
        if (arg0 > -73) {
            this.method7();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILm;)V")
    private final void method732(int arg0, int arg1, class83 arg2) {
        field2066++;
        if (~(this.field2055.field1662[arg2.field1963] & 0x4) != arg1 && arg2.field1969 < 0) {
            int var4 = this.field2055.field1658[arg2.field1963] / class48.field1164;
            int var5 = (var4 + 1048575 - arg2.field1937) / var4;
            arg2.field1937 = arg2.field1937 + arg0 * var4 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field2055.field1703[arg2.field1963] == 0) {
                    arg2.field1939 = class59.method496(arg2.field1936, arg2.field1939.method500(), arg2.field1939.method476(), arg2.field1939.method486());
                } else {
                    arg2.field1939 = class59.method496(arg2.field1936, arg2.field1939.method500(), 0, arg2.field1939.method486());
                    this.field2055.method623(arg2.field1954.field256[arg2.field1974] < 0, arg2, 8);
                }
                if (arg2.field1954.field256[arg2.field1974] < 0) {
                    arg2.field1939.method490(-1);
                }
                arg0 = arg2.field1937 / var4;
            }
        }
        arg2.field1939.method6(arg0);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
    public static void method733(int arg0) {
        field2058 = null;
        field2077 = null;
        field2084 = null;
        field2072 = null;
        field2080 = null;
        int var1 = -110 % ((arg0 - 61) / 50);
        field2061 = null;
        field2063 = null;
        field2074 = null;
        field2068 = null;
        field2079 = null;
        field2056 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(BI)Z")
    public static final boolean method734(byte arg0, int arg1) {
        field2064++;
        int var2 = 49 % ((37 - arg0) / 35);
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method6(int arg0) {
        this.field2076.method6(arg0);
        field2054++;
        for (class83 var2 = (class83) this.field2067.method758(255); var2 != null; var2 = (class83) this.field2067.method766(-109)) {
            if (!this.field2055.method619(-38, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1935 >= var3) {
                        this.method732(var3, -1, var2);
                        var2.field1935 -= var3;
                        break;
                    }
                    this.method732(var2.field1935, -1, var2);
                    var3 -= var2.field1935;
                } while (!this.field2055.method628(null, var2, 0, (byte) -73, var3));
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lkd;)V")
    public class89(class73 arg0) {
        this.field2055 = arg0;
    }
}

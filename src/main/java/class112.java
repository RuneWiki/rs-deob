import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class112 {

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    private int field2094 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[Ln;")
    private class129[] field2072;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
    public static int[] field2081 = new int[128];

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lrd;")
    private static class173 field2076 = class133.method843("white:", -124);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lrd;")
    public static class173 field2075 = field2076;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2079 = 0;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lrd;")
    public static class173 field2093 = field2076;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "J")
    private long field2089;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lmb;")
    public static class121 field2080;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Ln;")
    private class129 field2091;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Ln;")
    private class129 field2095;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ldh;")
    public static class39 field2085;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
    public static int[] field2074;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(JLn;Z)V")
    public final void method675(long arg0, class129 arg1, boolean arg2) {
        if (arg1.field2447 != null) {
            arg1.method824((byte) -123);
        }
        field2073++;
        if (arg2) {
            field2085 = null;
        }
        class129 var5 = this.field2072[(int) ((long) (this.field2084 - 1) & arg0)];
        arg1.field2437 = arg0;
        arg1.field2447 = var5.field2447;
        arg1.field2434 = var5;
        arg1.field2447.field2434 = arg1;
        arg1.field2434.field2447 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Ln;")
    public final class129 method676(byte arg0) {
        field2092++;
        if (this.field2091 == null) {
            return null;
        }
        class129 var2 = this.field2072[(int) ((long) (this.field2084 - 1) & this.field2089)];
        while (this.field2091 != var2) {
            if (this.field2091.field2437 == this.field2089) {
                class129 var3 = this.field2091;
                this.field2091 = this.field2091.field2434;
                return var3;
            }
            this.field2091 = this.field2091.field2434;
        }
        this.field2091 = null;
        return arg0 == -41 ? null : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)Ln;")
    public final class129 method677(int arg0, long arg1) {
        field2086++;
        this.field2089 = arg1;
        class129 var4 = this.field2072[(int) ((long) (this.field2084 - 1) & arg1)];
        this.field2091 = var4.field2434;
        if (arg0 != -2755) {
            return null;
        }
        while (this.field2091 != var4) {
            if (this.field2091.field2437 == arg1) {
                class129 var5 = this.field2091;
                this.field2091 = this.field2091.field2434;
                return var5;
            }
            this.field2091 = this.field2091.field2434;
        }
        this.field2091 = null;
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Ln;")
    public final class129 method678(boolean arg0) {
        field2082++;
        if (this.field2094 > 0 && this.field2072[this.field2094 - 1] != this.field2095) {
            class129 var2 = this.field2095;
            this.field2095 = var2.field2434;
            return var2;
        }
        while (this.field2094 < this.field2084) {
            class129 var3 = this.field2072[this.field2094++].field2434;
            if (this.field2072[this.field2094 - 1] != var3) {
                this.field2095 = var3.field2434;
                return var3;
            }
        }
        if (arg0) {
            field2075 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method679(int arg0, int arg1) {
        field2088++;
        if (class55.field1097 == 0) {
            class21.field467.method110(false, arg0);
        } else {
            class28.field570 = arg0;
        }
        if (arg1 != -15842) {
            method679(80, 18);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[Ln;)I")
    public final int method680(int arg0, class129[] arg1) {
        field2077++;
        if (arg0 >= -113) {
            field2081 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2084; var4++) {
            class129 var5 = this.field2072[var4];
            for (class129 var6 = var5.field2434; var6 != var5; var6 = var6.field2434) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public final int method681(int arg0) {
        field2078++;
        if (arg0 > -35) {
            this.field2072 = null;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2084; var3++) {
            class129 var4 = this.field2072[var3];
            class129 var5 = var4.field2434;
            while (var4 != var5) {
                var5 = var5.field2434;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public static void method682(byte arg0) {
        field2085 = null;
        field2075 = null;
        field2074 = null;
        field2093 = null;
        field2081 = null;
        if (arg0 != 95) {
            method683((byte) -47);
        }
        field2076 = null;
        field2080 = null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static final void method683(byte arg0) {
        field2087++;
        if (class177.field3470 != null || (arg0 < 63 || class71.field1376 != null)) {
            return;
        }
        int var1 = class120.field2208;
        if (class167.field3223) {
            if (var1 != 1) {
                int var2 = class4.field72;
                int var3 = class214.field4154;
                if (class64.field1270 - 10 > var3 || class64.field1270 + class51.field1047 + 10 < var3 || var2 < class215.field4168 - 10 || var2 > class215.field4168 + class30.field619 + 10) {
                    class167.field3223 = false;
                    class100.method616(class215.field4168, 0, class64.field1270, class51.field1047, class30.field619);
                }
            }
            if (var1 == 1) {
                int var4 = class64.field1270;
                int var5 = class215.field4168;
                int var6 = class51.field1047;
                int var7 = class41.field849;
                int var8 = class23.field493;
                int var9 = -1;
                for (int var10 = 0; var10 < class195.field3792; var10++) {
                    int var11 = var5 + (class195.field3792 - var10 - 1) * 15 + 31;
                    if (var7 > var4 && var4 + var6 > var7 && var8 > var11 - 13 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class163.method1051((byte) -93, var9);
                }
                class167.field3223 = false;
                class100.method616(class215.field4168, 0, class64.field1270, class51.field1047, class30.field619);
                return;
            }
            return;
        }
        if (var1 == 1 && class195.field3792 > 0) {
            short var12 = class179.field3526[class195.field3792 - 1];
            if (var12 == 49 || var12 == 22 || var12 == 24 || var12 == 41 || var12 == 7 || var12 == 23 || var12 == 51 || var12 == 39 || var12 == 44 || var12 == 40 || var12 == 13 || var12 == 1007) {
                int var13 = class80.field1577[class195.field3792 - 1];
                int var14 = class22.field492[class195.field3792 - 1];
                class165 var15 = class103.method639(var14, true);
                if (class117.method711((byte) 71, class78.method474(var15, 90)) || class190.method1267(class78.method474(var15, 125), (byte) -119)) {
                    class205.field4018 = false;
                    class178.field3508 = 0;
                    if (class177.field3470 != null) {
                        class209.method1379(1, class177.field3470);
                    }
                    class177.field3470 = class103.method639(var14, true);
                    class172.field3328 = var13;
                    class176.field3460 = class41.field849;
                    class197.field3836 = class23.field493;
                    class209.method1379(1, class177.field3470);
                    return;
                }
            }
        }
        if (var1 == 1 && (class48.field1019 == 1 && class195.field3792 > 2 || class84.method550(class195.field3792 - 1, 2000))) {
            var1 = 2;
        }
        if (var1 == 1 && class195.field3792 > 0) {
            class163.method1051((byte) -93, class195.field3792 - 1);
        }
        if (var1 != 2 || class195.field3792 <= 0) {
            return;
        }
        class163.method1050(-127);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
    public class112(int arg0) {
        this.field2072 = new class129[arg0];
        this.field2084 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class129 var3 = this.field2072[var2] = new class129();
            var3.field2447 = var3;
            var3.field2434 = var3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Ln;")
    public final class129 method684(byte arg0) {
        field2083++;
        this.field2094 = 0;
        if (arg0 != -76) {
            this.field2094 = -37;
        }
        return this.method678(false);
    }
}

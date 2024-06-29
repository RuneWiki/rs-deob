import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class327 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lvt;")
    private class516 field5140 = new class516();

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    private int field5146;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    private int field5159;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lbu;")
    private class407 field5156;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Lui;")
    public static class378 field5150 = new class378("LOCAL", 4);

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Llo;")
    public static class306 field5153 = new class306("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Lor;")
    public static class301 field5160;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[Lo;")
    public static class138[] field5154;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/Object;Lmb;II)V")
    private final void method2051(Object arg0, class288 arg1, int arg2, int arg3) {
        field5157++;
        if (this.field5159 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method2052(arg1, 1);
        this.field5146 -= arg3;
        while (this.field5146 < 0) {
            class105 var6 = (class105) this.field5140.method3054(-29948);
            this.method2057(2949, var6);
        }
        class509 var5 = new class509(arg1, arg0, arg3);
        this.field5156.method2517(var5, arg1.method1048((byte) -2), (byte) -107);
        this.field5140.method3050(var5, 2);
        var5.field4496 = arg2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lmb;I)V")
    private final void method2052(class288 arg0, int arg1) {
        if (arg1 != 1) {
            this.method2063((byte) -71, null, null);
        }
        field5149++;
        long var3 = arg0.method1048((byte) -2);
        for (class105 var5 = (class105) this.field5156.method2516(var3, -1); var5 != null; var5 = (class105) this.field5156.method2526(-128)) {
            if (var5.field1784.method1050(-11064, arg0)) {
                this.method2057(2949, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method2053(boolean arg0) {
        field5154 = null;
        field5153 = null;
        if (!arg0) {
            field5160 = null;
            field5150 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lec;B)V")
    public static final void method2054(class68 arg0, byte arg1) {
        field5158++;
        int var2 = -67 % ((44 - arg1) / 59);
        class68 var3 = class272.method1810(true, arg0);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class358.field5581;
            var5 = class49.field825;
        } else {
            var4 = var3.field1009;
            var5 = var3.field1081;
        }
        class509.method2994(arg0, true, false, var4, var5);
        class117.method939(arg0, false, var4, var5);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public final void method2055(int arg0) {
        int var2 = 99 / ((-arg0 - 53) / 50);
        this.field5140.method3049(2);
        field5144++;
        this.field5156.method2525(0);
        this.field5146 = this.field5159;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)I")
    public final int method2056(int arg0) {
        if (arg0 != 14414) {
            this.method2062(-108);
        }
        field5143++;
        return this.field5146;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILuh;)V")
    private final void method2057(int arg0, class105 arg1) {
        if (arg1 != null) {
            arg1.method1821((byte) -89);
            arg1.method1799((byte) 124);
            this.field5146 += arg1.field1783;
        }
        field5155++;
        if (arg0 != 2949) {
            method2053(true);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2058(int arg0, String arg1, int arg2) {
        field5148++;
        class266 var3 = class308.method1961(true, arg0, arg2);
        var3.method1781((byte) 95);
        var3.field4452 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public static final int method2059(int arg0, int arg1) {
        return class495.field7234 == null ? 0 : class495.field7234[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I")
    public final int method2060(byte arg0) {
        field5141++;
        return arg0 == -117 ? this.field5159 : 100;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILmb;)Ljava/lang/Object;")
    public final Object method2061(int arg0, class288 arg1) {
        field5152++;
        long var3 = arg1.method1048((byte) -2);
        for (class105 var5 = (class105) this.field5156.method2516(var3, -1); var5 != null; var5 = (class105) this.field5156.method2526(-108)) {
            if (var5.field1784.method1050(-11064, arg1)) {
                Object var6 = var5.method361(-14111);
                if (var6 != null) {
                    if (var5.method360(false)) {
                        class509 var7 = new class509(arg1, var6, var5.field1783);
                        this.field5156.method2517(var7, var5.field4542, (byte) -117);
                        this.field5140.method3050(var7, 2);
                        var7.field4496 = 0L;
                        var5.method1821((byte) 46);
                        var5.method1799((byte) 93);
                    } else {
                        this.field5140.method3050(var5, arg0 + 2);
                        var5.field4496 = 0L;
                    }
                    return var6;
                }
                var5.method1821((byte) 77);
                var5.method1799((byte) -33);
                this.field5146 += var5.field1783;
            }
        }
        if (arg0 != 0) {
            this.field5140 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public final void method2062(int arg0) {
        if (arg0 != 0) {
            this.method2051(null, null, -120, -109);
        }
        for (class105 var2 = (class105) this.field5140.method3056(arg0 ^ 0x7E); var2 != null; var2 = (class105) this.field5140.method3053(-125)) {
            if (var2.method360(false)) {
                var2.method1821((byte) 57);
                var2.method1799((byte) -85);
                this.field5146 += var2.field1783;
            }
        }
        field5145++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLmb;Ljava/lang/Object;)V")
    public final void method2063(byte arg0, class288 arg1, Object arg2) {
        if (arg0 < 118) {
            this.method2064(-18, 83);
        }
        field5147++;
        this.method2051(arg2, arg1, 0, 1);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
    public final void method2064(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        if (class358.field5577 != null) {
            for (class105 var3 = (class105) this.field5140.method3056(127); var3 != null; var3 = (class105) this.field5140.method3053(-90)) {
                if (var3.method360(false)) {
                    if (var3.method361(arg1 - 14111) == null) {
                        var3.method1821((byte) -101);
                        var3.method1799((byte) 127);
                        this.field5146 += var3.field1783;
                    }
                } else if (((long) arg0) < (++var3.field4496)) {
                    class105 var4 = class358.field5577.method2337(-5800, var3);
                    this.field5156.method2517(var4, var3.field4542, (byte) -108);
                    class396.method2479(var3, var4, 88);
                    var3.method1821((byte) 103);
                    var3.method1799((byte) -99);
                }
            }
        }
        field5151++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILia;)V")
    public static final void method2065(int arg0, class23 arg1) {
        field5142++;
        if ((arg1.field302.length - arg1.field301) < 1) {
            return;
        }
        int var2 = arg1.method126((byte) -109);
        if (var2 < 0 || var2 > 1 || arg0 < ~(arg1.field302.length - arg1.field301)) {
            return;
        }
        int var3 = arg1.method132(100);
        if ((var3 * 6) > (arg1.field302.length - arg1.field301)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method132(72);
            int var6 = arg1.method143(arg0 ^ 0xC9F);
            if (class77.field1320.length > var5 && class328.field5178[var5] && (class175.field2778.method2073(var5, arg0 + 102).field6460 != '1' || var6 >= -1 && var6 <= 1)) {
                class77.field1320[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
    public class327(int arg0) {
        this.field5146 = arg0;
        this.field5159 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5156 = new class407(var2);
    }
}

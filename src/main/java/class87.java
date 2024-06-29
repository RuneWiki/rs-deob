import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class87 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lok;")
    public static class146 field1380 = class235.method1724(-12908, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[Lok;")
    public static class146[] field1388 = new class146[100];

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lok;")
    public static class146 field1387 = class235.method1724(-12908, " )2> ");

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lok;")
    public static class146 field1391 = class235.method1724(-12908, "Texturen geladen)3");

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lhd;")
    public static class117 field1381 = new class117(64);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
    public static int[] field1386;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V", line = 22)
    public static final void method602(int arg0, int arg1, int arg2, int arg3) {
        field1389++;
        class146 var4 = class112.method758(-5, new class146[] { class305.field5224, class82.method585(14744, arg0), class232.field3881, class82.method585(14744, arg1 >> 6), class232.field3881, class82.method585(14744, arg3 >> 6), class232.field3881, class82.method585(14744, arg1 & 0x3F), class232.field3881, class82.method585(14744, arg3 & 0x3F) });
        int var5 = -11 % ((arg2 + 17) / 48);
        var4.method1102((byte) -126);
        class266.method1936((byte) -75, var4);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Lr;I)V", line = 42)
    public static final void method603(int arg0, class264[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class264 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4536 == 0) {
                    if (var4.field4402 != null) {
                        method603(64, var4.field4402, arg2);
                    }
                    class142 var5 = (class142) class135.field2266.method810((byte) -98, (long) var4.field4461);
                    if (var5 != null) {
                        class35.method254((byte) -84, var5.field2370, arg2);
                    }
                }
                if (arg2 == 0 && var4.field4491 != null) {
                    class124 var6 = new class124();
                    var6.field2031 = var4.field4491;
                    var6.field2039 = var4;
                    class43.method297(3335, var6);
                }
                if (arg2 == 1 && var4.field4390 != null) {
                    if (var4.field4417 >= 0) {
                        class264 var7 = class98.method680(var4.field4461, false);
                        if (var7 == null || var7.field4402 == null || var4.field4417 >= var7.field4402.length || var7.field4402[var4.field4417] != var4) {
                            continue;
                        }
                    }
                    class124 var8 = new class124();
                    var8.field2031 = var4.field4390;
                    var8.field2039 = var4;
                    class43.method297(3335, var8);
                }
            }
        }
        field1385++;
        if (arg0 != 64) {
            field1387 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Loj;I)V", line = 121)
    public static final void method604(class318 arg0, int arg1) {
        field1382++;
        int var2 = arg0.field5414 - class203.field3385;
        int var3 = arg0.field5382 * 128 + arg0.method1717(0) * 64;
        int var4 = arg0.field5425 * 128 + (arg0.method1717(arg1 ^ arg1) * 64);
        if (arg0.field5396 == 0) {
            arg0.field5421 = 1024;
        }
        arg0.field5404 = 0;
        if (arg0.field5396 == 1) {
            arg0.field5421 = 1536;
        }
        if (arg0.field5396 == 2) {
            arg0.field5421 = 0;
        }
        arg0.field5409 += (var3 - arg0.field5409) / var2;
        arg0.field5380 += (var4 - arg0.field5380) / var2;
        if (arg0.field5396 == 3) {
            arg0.field5421 = 512;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lkd;", line = 153)
    public static final class72 method605(int arg0, int arg1) {
        field1383++;
        class72 var2 = (class72) class58.field1017.method799((byte) 52, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 63) {
            field1387 = (class146) null;
        }
        class72 var3 = class98.method684(class182.field3047, false, class265.field4558, arg1, 0);
        if (var3 != null) {
            class58.field1017.method797(var3, 0, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 175)
    public static void method606(boolean arg0) {
        field1380 = null;
        field1387 = null;
        field1381 = null;
        if (arg0) {
            field1386 = null;
            field1391 = null;
            field1388 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Lhm;", line = 203)
    public static final class19 method607(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class19 var4 = var3.field223;
            var3.field223 = null;
            return var4;
        }
    }
}

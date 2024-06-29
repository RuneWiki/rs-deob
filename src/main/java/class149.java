import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class149 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public int field2527 = -1;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Loh;")
    private static class258 field2534 = class153.method1046("Unable to find ", 92);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Loh;")
    public static class258 field2530 = field2534;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2533 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[[[I")
    public static int[][][] field2529;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)Luf;", line = 9)
    public static final class212 method1022(int arg0, boolean arg1) {
        field2536++;
        class212 var2 = (class212) class243.field4214.method1159((byte) 126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field1639.method1453(class229.method1528((byte) -31, arg0), (byte) -56, class51.method414(arg0, (byte) 88));
        if (arg1) {
            return (class212) null;
        }
        class212 var4 = new class212();
        var4.field3645 = arg0;
        if (var3 != null) {
            var4.method1416(new class235(var3), -15795);
        }
        class243.field4214.method1163(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I", line = 37)
    public static final int method1023(int arg0, int arg1, int arg2) {
        field2526++;
        if (arg1 != 30221) {
            field2534 = (class258) null;
        }
        class238 var3 = (class238) class287.field4943.method986((long) arg0, 0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field4160.length) {
            return var3.field4160[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V", line = 61)
    public static final void method1024(boolean arg0, int arg1) {
        if (arg1 < 100) {
            return;
        }
        for (int var2 = 0; var2 < class226.field3895; var2++) {
            class107 var3 = class16.field214[class92.field1616[var2]];
            long var4 = (long) class92.field1616[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method453((byte) -67) && var3.field1906.field2599 == arg0 && var3.field1906.method1037(16879)) {
                int var6 = var3.field912 >> 7;
                int var7 = var3.field934 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method447(18123) == 1 && (var3.field912 & 0x7F) == 64 && (var3.field934 & 0x7F) == 64) {
                        if (class60.field1000[var6][var7] == class61.field1035) {
                            continue;
                        }
                        class60.field1000[var6][var7] = class61.field1035;
                    }
                    if (!var3.field1906.field2542) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field908 = class228.method1525(true, class272.field4704, var3.field934, var3.field912);
                    class317.method2181(class272.field4704, var3.field912, var3.field934, var3.field908, (var3.method447(18123) - 1) * 64 + 60, var3, var3.field923, var4, var3.field932);
                }
            }
        }
        field2537++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 117)
    public static void method1025(byte arg0) {
        field2530 = null;
        field2529 = (int[][][]) null;
        field2534 = null;
        int var1 = 24 / ((arg0 + 55) / 46);
    }
}

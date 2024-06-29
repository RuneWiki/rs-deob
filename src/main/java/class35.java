import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class35 {

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[B")
    public byte[] field545 = new byte[18002];

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field541 = 0;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[[I")
    public int[][] field539 = new int[6][258];

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
    public int[] field557 = new int[16];

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[[B")
    public byte[][] field537 = new byte[6][258];

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public int field563 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[B")
    public byte[] field533 = new byte[256];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[Z")
    public boolean[] field544 = new boolean[16];

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[B")
    public byte[] field558 = new byte[4096];

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[[I")
    public int[][] field549 = new int[6][258];

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "[I")
    public int[] field564 = new int[257];

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
    public int[] field538 = new int[6];

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "[[I")
    public int[][] field559 = new int[6][258];

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "[B")
    public byte[] field565 = new byte[18002];

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "[Z")
    public boolean[] field570 = new boolean[256];

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "[I")
    public int[] field572 = new int[256];

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lma;")
    public static class5 field534 = class12.method119("ul", (byte) 103);

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field535 = 0;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "B")
    public byte field553;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "F")
    public static float field550;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Luf;")
    public static class175 field551;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lni;")
    public static class202 field552;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[B")
    public byte[] field540;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "[B")
    public byte[] field555;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 49)
    public static void method253(int arg0) {
        field534 = null;
        field551 = null;
        field552 = null;
        if (arg0 < 113) {
            method254(-69, -17, 20, 10, -39);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V", line = 73)
    public static final void method254(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field554++;
        if (class294.field4956 <= arg1 && class101.field1505 >= arg1) {
            int var5 = class76.method533(class57.field899, arg4, true, class301.field5073);
            int var6 = class76.method533(class57.field899, arg3, true, class301.field5073);
            class175.method1147(var6, -86, arg1, var5, arg2);
        }
        if (arg0 != -9878) {
            method255(-15);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 121)
    public static final void method255(int arg0) {
        if (arg0 != -34) {
            field551 = (class175) null;
        }
        field548++;
        if (class300.field5066 != null || class174.field2664 != null) {
            return;
        }
        int var1 = class139.field2059;
        if (class251.field4162) {
            if (var1 != 1) {
                int var6 = class271.field4636;
                int var7 = class18.field308;
                if (var6 < (class18.field307 - 10) || class18.field307 + class209.field3323 + 10 < var6 || class261.field4462 - 10 > var7 || (class261.field4462 + class86.field1305 + 10) < var7) {
                    class251.field4162 = false;
                    class84.method566(-101, class86.field1305, class261.field4462, class18.field307, class209.field3323);
                }
            }
            if (var1 == 1) {
                int var8 = class18.field307;
                int var9 = class261.field4462;
                int var10 = class209.field3323;
                int var11 = class104.field1545;
                int var12 = class289.field4915;
                int var13 = -1;
                for (int var14 = 0; var14 < class282.field4794; var14++) {
                    int var15 = (class282.field4794 - var14 - 1) * 15 + var9 + 31;
                    if (var8 < var11 && (var8 + var10) > var11 && var12 > var15 - 13 && (var15 + 3) > var12) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class90.method593(var13, 0);
                }
                class251.field4162 = false;
                class84.method566(arg0 - 56, class86.field1305, class261.field4462, class18.field307, class209.field3323);
            }
            return;
        }
        if (var1 == 1 && class282.field4794 > 0) {
            short var2 = class104.field1554[class282.field4794 - 1];
            if (var2 == 48 || var2 == 33 || var2 == 1 || var2 == 36 || var2 == 39 || var2 == 37 || var2 == 45 || var2 == 16 || var2 == 17 || var2 == 26 || var2 == 24 || var2 == 1001) {
                int var3 = class240.field3989[class282.field4794 - 1];
                int var4 = class294.field4963[class282.field4794 - 1];
                class253 var5 = class172.method1140(var3, 74);
                if (class279.method1891((byte) -95, client.method767(var5)) || class297.method2005((byte) -97, client.method767(var5))) {
                    class294.field4965 = 0;
                    class284.field4808 = false;
                    if (class300.field5066 != null) {
                        class29.method205(class300.field5066, (byte) 107);
                    }
                    class300.field5066 = class172.method1140(var3, arg0 + 57);
                    class152.field2204 = var4;
                    class72.field1131 = class104.field1545;
                    class158.field2383 = class289.field4915;
                    class29.method205(class300.field5066, (byte) 86);
                    return;
                }
            }
        }
        if (var1 == 1 && (class18.field317 == 1 && class282.field4794 > 2 || class287.method1935(class282.field4794 - 1, 1005))) {
            var1 = 2;
        }
        if (var1 == 2 && class282.field4794 > 0 || class179.field2721 == 1) {
            class5.method52((byte) -105);
        }
        if (var1 == 1 && class282.field4794 > 0 || class179.field2721 == 2) {
            class268.method1848(0);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V", line = 250)
    public static final void method256(int arg0) {
        field542++;
        class186 var1 = (class186) class127.field1905.method1475(14);
        if (arg0 != 16556) {
            method253(22);
        }
        while (var1 != null) {
            if (var1.field2919 > 0) {
                var1.field2919--;
            }
            if (var1.field2919 != 0) {
                if (var1.field2916 > 0) {
                    var1.field2916--;
                }
                if (var1.field2916 == 0 && var1.field2923 >= 1 && var1.field2918 >= 1 && var1.field2923 <= 102 && var1.field2918 <= 102 && (var1.field2927 < 0 || class212.method1403(var1.field2927, var1.field2928, false))) {
                    class186.method1229(var1.field2918, var1.field2914, var1.field2928, var1.field2920, var1.field2929, 94, var1.field2927, var1.field2923);
                    var1.field2916 = -1;
                    if (var1.field2927 == var1.field2915 && var1.field2915 == -1) {
                        var1.method1997(-27381);
                    } else if (var1.field2927 == var1.field2915 && var1.field2925 == var1.field2914 && var1.field2928 == var1.field2922) {
                        var1.method1997(-27381);
                    }
                }
            } else if (var1.field2915 < 0 || class212.method1403(var1.field2915, var1.field2922, false)) {
                class186.method1229(var1.field2918, var1.field2925, var1.field2922, var1.field2920, var1.field2929, arg0 ^ 0x40F4, var1.field2915, var1.field2923);
                var1.method1997(arg0 ^ 0xFFFFD5A7);
            }
            var1 = (class186) class127.field1905.method1486(38);
        }
    }
}

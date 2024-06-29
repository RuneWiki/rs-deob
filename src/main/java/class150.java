import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class150 {

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "J")
    public long field3139 = 0L;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Ldd;")
    private static class35 field3122 = class180.method1196((byte) 126, "Close");

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "[I")
    public static int[] field3140 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Ldd;")
    public static class35 field3131 = field3122;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "[[I")
    public static int[][] field3134 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Ldd;")
    public static class35 field3127 = class180.method1196((byte) -13, "au");

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Ldd;")
    public static class35 field3133 = class180.method1196((byte) -106, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Llc;")
    public class110 field3121;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Llc;")
    public class110 field3137;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(JZ)V")
    public static final void method1019(long arg0, boolean arg1) {
        field3141++;
        if (arg0 == 0L) {
            return;
        }
        if (!arg1) {
            method1022(51, 97, -45, -85, -77, -52, -126, 53);
        }
        for (int var3 = 0; var3 < class25.field505; var3++) {
            if (class167.field3373[var3] == arg0) {
                class25.field505--;
                class143.field3005++;
                for (int var4 = var3; var4 < class25.field505; var4++) {
                    class39.field871[var4] = class39.field871[var4 + 1];
                    class181.field3691[var4] = class181.field3691[var4 + 1];
                    class67.field1567[var4] = class67.field1567[var4 + 1];
                    class167.field3373[var4] = class167.field3373[var4 + 1];
                    class44.field957[var4] = class44.field957[var4 + 1];
                }
                class100.field2208 = class13.field232;
                class1.field11.method659(161, true);
                class1.field11.method239((byte) 86, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[BI)Ldd;")
    public static final class35 method1020(int arg0, int arg1, byte[] arg2, int arg3) {
        field3129++;
        class35 var4 = new class35();
        var4.field730 = new byte[arg1];
        var4.field758 = 0;
        if (arg3 <= 50) {
            field3131 = null;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field730[var4.field758++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method1021(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        int var1 = -71 % ((arg0 - 56) / 43);
        field3130++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class79 var8 = new class79();
        var8.field1835 = arg2 / 128;
        var8.field1850 = arg3 / 128;
        var8.field1832 = arg4 / 128;
        var8.field1839 = arg5 / 128;
        var8.field1841 = arg1;
        var8.field1842 = arg2;
        var8.field1829 = arg3;
        var8.field1846 = arg4;
        var8.field1845 = arg5;
        var8.field1836 = arg6;
        var8.field1828 = arg7;
        class137.field2932[arg0][class137.field2923[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static void method1023(boolean arg0) {
        field3122 = null;
        field3133 = null;
        field3127 = null;
        if (!arg0) {
            field3128 = -90;
        }
        field3131 = null;
        field3140 = null;
        field3134 = null;
    }
}

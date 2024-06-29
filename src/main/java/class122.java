import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class122 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[I")
    public static int[] field2974 = new int[5];

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lhb;")
    public static class44 field2982 = class102.method810("Abbrechen", -28606);

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lhb;")
    private static class44 field2988 = class102.method810("Hide", -28606);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lhb;")
    public static class44 field2979 = field2988;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Lhb;")
    public static class44 field2991 = class102.method810("Musik)2Engine vorbereitet)3", -28606);

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lhb;")
    public static class44 field2987 = class102.method810("Fertigkeit)2", -28606);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lqa;")
    public class97 field2978;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lqa;")
    public class97 field2985;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Lqa;")
    public class97 field2992;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field2976;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZJ)V", line = 20)
    public static final void method936(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0) {
                field2981 = 91;
            }
        } catch (InterruptedException var3) {
        }
        field2986++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I", line = 34)
    public static final int method937(int arg0, int arg1, int arg2) {
        int var3 = class2.method20(true, arg2 - 1, arg0 - 1) + class2.method20(true, arg2 + 1, arg0 - 1) + class2.method20(true, arg2 - 1, arg0 + 1) + class2.method20(true, arg2 + 1, arg0 + 1);
        field2989++;
        if (arg1 != 60) {
            method937(40, -59, 27);
        }
        int var4 = class2.method20(true, arg2 - 1, arg0) + class2.method20(true, arg2 + 1, arg0) + class2.method20(true, arg2, arg0 - 1) + class2.method20(true, arg2, arg0 + 1);
        int var5 = class2.method20(true, arg2, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 51)
    public static final void method938(byte arg0) {
        class27 var1 = (class27) class44.field1123.method443((byte) -111);
        int var2 = 48 % ((-arg0 - 72) / 48);
        while (var1 != null) {
            if (class79.field1993 != var1.field635 || var1.field609 < class2.field73) {
                var1.method948(-111);
            } else if (class2.field73 >= var1.field622) {
                if (var1.field636 > 0) {
                    class46 var3 = class116.field2845[var1.field636 - 1];
                    if (var3 != null && var3.field1384 >= 0 && var3.field1384 < 13312 && var3.field1371 >= 0 && var3.field1371 < 13312) {
                        var1.method224(var3.field1371, class2.field73, class55.method507(var3.field1371, var1.field635, var3.field1384, -1) - var1.field634, (byte) 89, var3.field1384);
                    }
                }
                if (var1.field636 < 0) {
                    int var4 = -var1.field636 - 1;
                    class103 var5;
                    if (class62.field1569 == var4) {
                        var5 = class72.field1820;
                    } else {
                        var5 = class82.field2110[var4];
                    }
                    if (var5 != null && var5.field1384 >= 0 && var5.field1384 < 13312 && var5.field1371 >= 0 && var5.field1371 < 13312) {
                        var1.method224(var5.field1371, class2.field73, class55.method507(var5.field1371, var1.field635, var5.field1384, -1) - var1.field634, (byte) 126, var5.field1384);
                    }
                }
                var1.method226(class44.field1124, 0);
                class89.field2283.method259(class79.field1993, (int) var1.field642, (int) var1.field647, (int) var1.field648, 60, var1, var1.field649, -1, false);
            }
            var1 = (class27) class44.field1123.method434(true);
        }
        field2983++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILtd;)I", line = 109)
    public static final int method939(int arg0, class116 arg1) {
        field2980++;
        int var2 = 0;
        if (arg0 >= -62) {
            return -127;
        }
        if (arg1.method885(-14809, class40.field907, class121.field2967)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class94.field2393)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class111.field2759)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class36.field868)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class55.field1399)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class118.field2908)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class86.field2212)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class102.field2587)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class62.field1579)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class46.field1136)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class131.field3189)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class90.field2295)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class41.field949)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class131.field3196)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class85.field2182)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class103.field2620)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class110.field2758)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, class80.field2020)) {
            var2++;
        }
        if (arg1.method885(-14809, class40.field907, client.field383)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 191)
    public static void method940(int arg0) {
        field2982 = null;
        field2987 = null;
        field2991 = null;
        field2976 = null;
        if (arg0 != 12510) {
            method936(false, -31L);
        }
        field2974 = null;
        field2979 = null;
        field2988 = null;
    }
}

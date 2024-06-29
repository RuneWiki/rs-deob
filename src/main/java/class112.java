import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class112 extends class202 {

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "Ll;")
    public class158 field2109;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Z")
    public static boolean field2099 = false;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "Loh;")
    public static class263 field2105 = class253.method1681(-121, "<)4col> x");

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field2107 = 0;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "Loh;")
    public static class263 field2100 = class253.method1681(-121, "hitbar_default");

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field2108 = 1;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "Loh;")
    public static class263 field2111 = class253.method1681(-128, "Lade)3)3)3");

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "[[I")
    public static int[][] field2103;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "[[[I")
    public static int[][][] field2102;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBII)I")
    public static final int method735(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2104++;
        int var5 = 65536 - class270.field4762[arg4 * 1024 / arg1] >> 1;
        if (arg2 < 75) {
            field2101 = 75;
        }
        return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static void method736(int arg0) {
        field2105 = null;
        field2100 = null;
        field2102 = null;
        field2103 = null;
        field2111 = null;
        if (arg0 != 0) {
            method737(true, false);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V")
    public static final void method737(boolean arg0, boolean arg1) {
        field2106++;
        if (class229.field4018.field4688 >> 7 == class105.field1988 && class229.field4018.field4705 >> 7 == class194.field3465) {
            class105.field1988 = 0;
        }
        int var2 = class41.field911;
        if (arg1) {
            return;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class137 var4;
            long var5;
            if (arg0) {
                var4 = class229.field4018;
                var5 = 8791798054912L;
            } else {
                var4 = class151.field2725[class249.field4354[var3]];
                var5 = (long) class249.field4354[var3] << 32;
            }
            if (var4 != null && var4.method633((byte) 98)) {
                var4.field2514 = false;
                if ((class159.field2896 && class41.field911 > 200 || class41.field911 > 50) && !arg0 && var4.field4687 == var4.field4652) {
                    var4.field2514 = true;
                }
                int var7 = var4.field4688 >> 7;
                int var8 = var4.field4705 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field2502 == null || var4.field2519 > class228.field4012 || class228.field4012 >= var4.field2535) {
                        if (var4.method898(107) == 1 && (var4.field4688 & 0x7F) == 64 && (var4.field4705 & 0x7F) == 64) {
                            if (class36.field833[var7][var8] == class150.field2711) {
                                continue;
                            }
                            class36.field833[var7][var8] = class150.field2711;
                        }
                        var4.field4719 = class120.method781(class12.field321, var4.field4688, false, var4.field4705);
                        class146.method963(class12.field321, var4.field4688, var4.field4705, var4.field4719, (var4.method898(61) * 64 - 64) + 60, var4, var4.field4700, var5, var4.field4666);
                    } else {
                        var4.field2514 = false;
                        var4.field4719 = class120.method781(class12.field321, var4.field4688, false, var4.field4705);
                        class223.method1517(class12.field321, var4.field4688, var4.field4705, var4.field4719, var4, var4.field4700, var5, var4.field2516, var4.field2531, var4.field2507, var4.field2539);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ll;)V")
    public class112(class158 arg0) {
        this.field2109 = arg0;
    }
}

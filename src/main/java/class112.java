import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class112 {

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[Z")
    public static boolean[] field1742 = new boolean[8];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lbf;")
    public static class329 field1736;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1738;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 7)
    public static void method830(int arg0) {
        field1736 = null;
        if (arg0 != -16216) {
            field1742 = (boolean[]) null;
        }
        field1742 = null;
        field1738 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Lhe;", line = 21)
    public static final class265 method831(int arg0, boolean arg1) {
        field1743++;
        class265 var2 = (class265) class251.field3968.method2179(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class315.field4888.method980(class47.method411(arg0, 71), class186.method1333(true, arg0), 5);
        class265 var4 = new class265();
        var4.field4129 = arg0;
        if (var3 != null) {
            var4.method1808(new class166(var3), false);
        }
        class251.field3968.method2173(var4, arg1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 46)
    public static final int method832(boolean arg0, String arg1) {
        if (arg0) {
            method830(-75);
        }
        field1735++;
        return class76.method556(arg1, true, 10, 29695);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 60)
    public static final void method833(int arg0, int arg1) {
        if (arg1 != 2048) {
            field1738 = (FontMetrics) null;
        }
        int var2 = class337.field5278;
        field1741++;
        int var3 = class258.field4052;
        int var4 = class194.field2897;
        int var5 = class265.field4116;
        int var6 = (int) class30.field443;
        if ((class182.field2743 / 256) > var6) {
            var6 = class182.field2743 / 256;
        }
        int var7 = class218.field3323;
        int var8 = (int) class259.field4063 + class77.field1243 & 0x7FF;
        if (class267.field4166[4] && class220.field3514[4] + 128 > var6) {
            var6 = class220.field3514[4] + 128;
        }
        class226.method1600(-19326, var6 * 3 + 600, var8, class320.method2181(class98.field1566.field1905, class98.field1566.field1868, -103, class205.field3101) - 50, class106.field1647, class239.field3807, var6, arg0);
        if (class337.field5278 == var2 && class258.field4052 == var3 && class265.field4116 == var5 && class194.field2897 == var4 && class218.field3323 == var7) {
            class178.field2692 = 1;
            return;
        }
        class300.field4687 = 10;
        class276.field4264 = 10;
        class30.field442 = 10;
        class1.field14 = 10;
        if (var4 < class194.field2897) {
            var4 += (class194.field2897 - var4) * class300.field4687 / 1000 + class30.field442;
            if (var4 < class194.field2897) {
                class194.field2897 = var4;
            }
        }
        if (class258.field4052 > var3) {
            var3 += (class258.field4052 - var3) * class276.field4264 / 1000 + class1.field14;
            if (class258.field4052 > var3) {
                class258.field4052 = var3;
            }
        }
        if (var3 > class258.field4052) {
            int var9 = var3 - ((var3 - class258.field4052) * class276.field4264 / 1000 + class1.field14);
            if (class258.field4052 < var9) {
                class258.field4052 = var9;
            }
        }
        if (class265.field4116 > var5) {
            var5 += (class265.field4116 - var5) * class276.field4264 / 1000 + class1.field14;
            if (class265.field4116 > var5) {
                class265.field4116 = var5;
            }
        }
        if (class337.field5278 > var2) {
            var2 += (class337.field5278 - var2) * class276.field4264 / 1000 + class1.field14;
            if (class337.field5278 > var2) {
                class337.field5278 = var2;
            }
        }
        if (class194.field2897 < var4) {
            int var10 = var4 - ((var4 - class194.field2897) * class300.field4687 / 1000 + class30.field442);
            if (var10 > class194.field2897) {
                class194.field2897 = var10;
            }
        }
        if (class337.field5278 < var2) {
            int var11 = var2 - ((var2 - class337.field5278) * class276.field4264 / 1000 + class1.field14);
            if (var11 > class337.field5278) {
                class337.field5278 = var11;
            }
        }
        int var12 = class218.field3323 - var7;
        if (var5 > class265.field4116) {
            int var13 = var5 - ((var5 - class265.field4116) * class276.field4264 / 1000 + class1.field14);
            if (var13 > class265.field4116) {
                class265.field4116 = var13;
            }
        }
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            int var14 = class300.field4687 * var12 / 1000 + class30.field442 + var7;
            var7 = var14 & 0x7FF;
        }
        if (var12 < 0) {
            int var15 = var7 - (-var12 * class300.field4687 / 1000 + class30.field442);
            var7 = var15 & 0x7FF;
        }
        int var16 = class218.field3323 - var7;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var12 <= 0 || var16 > 0 && var12 < 0) {
            class218.field3323 = var7;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V", line = 206)
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 4) {
            field1742 = (boolean[]) null;
        }
        field1739++;
        if (class206.field3170 <= arg2 && class12.field184 >= arg2) {
            int var5 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg4);
            int var6 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg0);
            class30.method258(arg1, (byte) 40, var6, arg2, var5);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)[Lwj;", line = 226)
    public static final class270[] method835(byte arg0) {
        field1740++;
        class270[] var1 = new class270[class290.field4519];
        if (arg0 != -92) {
            method834(-106, 84, -11, 71, -5);
        }
        for (int var2 = 0; var2 < class290.field4519; var2++) {
            int var3 = class75.field1215[var2] * class73.field1201[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class306.field4757[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class63.field1002[class270.method1860(var5[var6], 255)];
            }
            if (class94.field1516) {
                var1[var2] = new class86(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], var4);
            } else {
                var1[var2] = new class249(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], var4);
            }
        }
        class7.method56((byte) 59);
        return var1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBZILl;I)V", line = 277)
    public static final void method836(int arg0, int arg1, byte arg2, boolean arg3, int arg4, class133 arg5, int arg6) {
        class50.field803 = arg5;
        class165.field2479 = arg4;
        field1744++;
        class1.field5 = arg0;
        class150.field2266 = arg3;
        class50.field801 = arg6;
        class225.field3583 = 1;
        class48.field781 = arg1;
        if (arg2 < 35) {
            field1736 = (class329) null;
        }
    }
}

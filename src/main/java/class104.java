import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class104 {

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "J")
    public long field1814 = 0L;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljf;")
    public static class229 field1801 = class212.method1457((byte) 64, "cyan:");

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Ljf;")
    public static class229 field1815 = class212.method1457((byte) 82, " GMT");

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Ljf;")
    public static class229 field1817 = class212.method1457((byte) 90, "null");

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lhg;")
    public class174 field1806;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Lth;")
    public static class86 field1816;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Z")
    public static boolean field1796;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lsm;")
    public static class159[] field1797;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "[Ljf;")
    public static class229[] field1813;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)V", line = 10)
    public static final void method698(boolean arg0, int arg1) {
        class56.field992 = new int[104];
        class287.field4915 = 99;
        field1809++;
        class160.field2717 = new int[104];
        class279.field4779 = new int[104];
        if (arg1 < 5) {
            method700((byte) -6, (int[][]) ((int[][]) null));
        }
        class169.field2914 = new int[104];
        class100.field1766 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class217.field3735 = new byte[var2][104][104];
        class220.field3760 = new int[var2][105][105];
        class236.field4084 = new byte[var2][104][104];
        class70.field1334 = new byte[var2][105][105];
        class115.field2083 = new byte[var2][104][104];
        class260.field4515 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIILhg;IZJ)Z", line = 46)
    public static final boolean method699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class174 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class242.field4270 == class132.field2328;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class170.field2971 || var16 >= class10.field119) {
                    return false;
                }
                class125 var17 = class312.field5246[arg0][var15][var16];
                if (var17 != null && var17.field2201 >= 5) {
                    return false;
                }
            }
        }
        class104 var18 = new class104();
        var18.field1814 = arg11;
        var18.field1804 = arg0;
        var18.field1811 = arg5;
        var18.field1793 = arg6;
        var18.field1795 = arg7;
        var18.field1806 = arg8;
        var18.field1798 = arg9;
        var18.field1800 = arg1;
        var18.field1791 = arg2;
        var18.field1802 = arg1 + arg3 - 1;
        var18.field1812 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class312.field5246[var22][var19][var20] == null) {
                        class312.field5246[var22][var19][var20] = new class125(var22, var19, var20);
                    }
                }
                class125 var23 = class312.field5246[arg0][var19][var20];
                var23.field2204[var23.field2201] = var18;
                var23.field2208[var23.field2201] = var21;
                var23.field2194 |= var21;
                var23.field2201++;
                if (var13 && class299.field5095[var19][var20] != 0) {
                    var14 = class299.field5095[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class299.field5095[var24][var25] == 0) {
                        class299.field5095[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class115.field2072[class303.field5153++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B[[I)V", line = 165)
    public static final void method700(byte arg0, int[][] arg1) {
        field1799++;
        if (arg0 == -38) {
            class173.field3021 = arg1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)J", line = 199)
    public static final long method701(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        return var3 == null || var3.field2198 == null ? 0L : var3.field2198.field2860;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)V", line = 207)
    public static final void method702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1794++;
        if (arg7 != 27789) {
            return;
        }
        for (int var9 = 0; var9 < class124.field2183.field5616; var9++) {
            int var10 = class124.field2183.field5625[var9] - class290.field4953;
            int var11 = class254.field4432 + class127.field2269 - class124.field2183.field5622[var9] - 1;
            int var12 = arg0 + ((arg4 - arg0) * (var10 - arg1) / (arg3 - arg1));
            int var13 = class124.field2183.method2252(false, var9);
            int var14 = (arg5 - arg6) * (var11 - arg8) / (arg2 - arg8) + arg6;
            int var15 = 16777215;
            class103 var16 = null;
            if (var13 == 0) {
                if ((double) class235.field4060 == 3.0D) {
                    var16 = class84.field1615;
                }
                if ((double) class235.field4060 == 4.0D) {
                    var16 = class8.field84;
                }
                if ((double) class235.field4060 == 6.0D) {
                    var16 = class156.field2672;
                }
                if ((double) class235.field4060 == 8.0D) {
                    var16 = class241.field4253;
                }
            }
            if (var13 == 1) {
                if ((double) class235.field4060 == 3.0D) {
                    var16 = class156.field2672;
                }
                if ((double) class235.field4060 == 4.0D) {
                    var16 = class241.field4253;
                }
                if ((double) class235.field4060 == 6.0D) {
                    var16 = class66.field1124;
                }
                if ((double) class235.field4060 == 8.0D) {
                    var16 = class167.field2872;
                }
            }
            if (var13 == 2) {
                var15 = 16755200;
                if ((double) class235.field4060 == 3.0D) {
                    var16 = class66.field1124;
                }
                if ((double) class235.field4060 == 4.0D) {
                    var16 = class167.field2872;
                }
                if ((double) class235.field4060 == 6.0D) {
                    var16 = class173.field3030;
                }
                if ((double) class235.field4060 == 8.0D) {
                    var16 = class137.field2377;
                }
            }
            if (class124.field2183.field5621[var9] != -1) {
                var15 = class124.field2183.field5621[var9];
            }
            if (var16 != null) {
                class229[] var17 = new class229[class124.field2183.field5618[var9].method1643((byte) 40, 60) + 1];
                class211.field3636.method958(class124.field2183.field5618[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var14 - (var18 - 1) * var16.method696() / 2;
                int var20 = var19 + var16.method693() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class229 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method1639((byte) -20, var17[var21].method1626(-80) - 4, 0);
                    var16.method690(var22, var12, var20, var15, true);
                    var20 += var16.method696();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIZII)V", line = 322)
    public static final void method703(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg0) {
            field1810++;
            if (class192.method1314(arg3, -31)) {
                class238.method1705(arg4, 0, -1, class23.field423[arg3], arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 338)
    public static void method704(int arg0) {
        field1813 = null;
        field1797 = null;
        int var1 = -86 % ((arg0 + 35) / 37);
        field1815 = null;
        field1816 = null;
        field1817 = null;
        field1801 = null;
    }
}

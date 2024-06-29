import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class108 extends class134 {

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    private int field1765;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    private int field1764;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    private int field1770;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1763 = new String[1000];

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field1784 = new String[200];

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field1785 = new String[100];

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Laj;")
    public static class151 field1768;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field1776;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "[[Z")
    public static boolean[][] field1781;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field1763 = null;
        field1785 = null;
        field1776 = null;
        if (arg0 > -92) {
            field1784 = null;
        }
        field1768 = null;
        field1784 = null;
        field1781 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIII)Z")
    public final boolean method805(byte arg0, int arg1, int arg2, int arg3) {
        field1767++;
        if (arg0 != 3) {
            this.field1770 = 88;
        }
        return this.field1770 == arg1 && this.field1764 <= arg3 && this.field1782 >= arg3 && arg2 >= this.field1765 && this.field1774 >= arg2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[I)V")
    public final void method806(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[arg2] = this.field1764 + arg1 - this.field1772;
        field1780++;
        arg3[2] = arg0 + this.field1765 - this.field1766;
        arg3[0] = this.field1770;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZI)Z")
    public final boolean method807(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method807(36, false, 104);
        }
        field1761++;
        return arg0 >= this.field1772 && arg0 <= this.field1769 && arg2 >= this.field1766 && arg2 <= this.field1779;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIB)V")
    public static final void method808(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 0;
        class134.method996(0, arg0 + arg2, arg0 - arg2, arg4, class41.field630[arg3]);
        field1778++;
        int var7 = arg1 * arg1;
        int var8 = var7 << 1;
        int var9 = arg1;
        int var10 = arg1 << 1;
        int var11 = arg2 * arg2;
        int var12 = var11 << 1;
        int var13 = var7 << 2;
        int var14 = var11 << 2;
        int var15 = (1 - var10) * var11 + var8;
        if (arg5 < 102) {
            method812(-15, 8, -44);
        }
        int var16 = ((var6 << 1) + 3) * var8;
        int var17 = var7 - (var10 - 1) * var12;
        int var18 = ((arg1 << 1) - 3) * var12;
        int var19 = (arg1 - 1) * var14;
        int var20 = (var6 + 1) * var13;
        while (var9 > 0) {
            var9--;
            int var21 = arg3 + var9;
            int var22 = arg3 - var9;
            if (var15 < 0) {
                while (var15 < 0) {
                    var17 += var20;
                    var20 += var13;
                    var15 += var16;
                    var16 += var13;
                    var6++;
                }
            }
            if (var17 < 0) {
                var15 += var16;
                var16 += var13;
                var17 += var20;
                var6++;
                var20 += var13;
            }
            var17 += -var18;
            var15 += -var19;
            int var23 = arg0 - var6;
            var18 -= var14;
            int var24 = arg0 + var6;
            var19 -= var14;
            class134.method996(0, var24, var23, arg4, class41.field630[var22]);
            class134.method996(0, var24, var23, arg4, class41.field630[var21]);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[II)V")
    public final void method809(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 == 5782) {
            arg2[1] = this.field1772 + arg1 - this.field1764;
            arg2[2] = arg3 - (this.field1765 - this.field1766);
            arg2[0] = this.field1775;
            field1773++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIIIZIII)V")
    public static final void method810(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1786++;
        if (!arg4 && class263.field4395 == arg1 && class260.field4363 == arg2 && class73.field1286 == arg7 || class136.method1011(false)) {
            return;
        }
        class260.field4363 = arg2;
        class73.field1286 = arg7;
        class263.field4395 = arg1;
        if (class136.method1011(false)) {
            class73.field1286 = 0;
        }
        if (arg0) {
            class240.method1719(28, 31136);
        } else {
            class240.method1719(25, 31136);
        }
        class44.method260(true, class5.field127, (byte) 33);
        int var8 = class26.field462;
        int var9 = class78.field1313;
        class78.field1313 = (arg2 - 6) * 8;
        class26.field462 = (arg1 - 6) * 8;
        class90.field1487 = class148.method1098(class263.field4395 * 8, class260.field4363 * 8);
        class196.field3165 = null;
        int var10 = class26.field462 - var8;
        int var11 = class26.field462;
        int var12 = class78.field1313 - var9;
        int var13 = class78.field1313;
        if (arg0) {
            class303.field4932 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class307 var33 = class57.field1002[var17];
                if (var33 != null) {
                    var33.field715 -= var10 * 128;
                    var33.field771 -= var12 * 128;
                    if (var33.field715 >= 0 && var33.field715 <= 13184 && var33.field771 >= 0 && var33.field771 <= 13184) {
                        for (int var34 = 0; var34 < 10; var34++) {
                            var33.field711[var34] -= var10;
                            var33.field717[var34] -= var12;
                        }
                        class186.field2972[class303.field4932++] = var17;
                    } else {
                        class57.field1002[var17].method2078(50, (class54) null);
                        class57.field1002[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class307 var15 = class57.field1002[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field711[var16] -= var10;
                        var15.field717[var16] -= var12;
                    }
                    var15.field715 -= var10 * 128;
                    var15.field771 -= var12 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class123 var31 = class15.field300[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field711[var32] -= var10;
                    var31.field717[var32] -= var12;
                }
                var31.field715 -= var10 * 128;
                var31.field771 -= var12 * 128;
            }
        }
        class182.field2898 = arg7;
        class16.field314.method919(arg5, arg6, false, false);
        byte var19 = 104;
        if (arg3 >= -45) {
            field1785 = null;
        }
        byte var20 = 1;
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 0;
        if (var10 < 0) {
            var19 = -1;
            var23 = 103;
            var20 = -1;
        }
        byte var24 = 1;
        if (var12 < 0) {
            var24 = -1;
            var21 = 103;
            var22 = -1;
        }
        for (int var25 = var23; var25 != var19; var25 += var20) {
            for (int var27 = var21; var27 != var22; var27 += var24) {
                int var28 = var10 + var25;
                int var29 = var27 + var12;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class125.field2101[var30][var25][var27] = class125.field2101[var30][var28][var29];
                    } else {
                        class125.field2101[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class248 var26 = (class248) class21.field387.method309(0); var26 != null; var26 = (class248) class21.field387.method312((byte) -82)) {
            var26.field4132 -= var10;
            var26.field4146 -= var12;
            if (var26.field4132 < 0 || var26.field4146 < 0 || var26.field4132 >= 104 || var26.field4146 >= 104) {
                var26.method993(32);
            }
        }
        if (class133.field2194 != 0) {
            class133.field2194 -= var10;
            class163.field2661 -= var12;
        }
        class295.field4841 = 0;
        if (arg0) {
            class49.field840 -= var12;
            class223.field3737 -= var10;
            class233.field3939 -= var12;
            class76.field1302 -= var12 * 128;
            class107.field1758 -= var10 * 128;
            class208.field3522 -= var10;
        } else if (class169.field2739 == 4) {
            class138.field2264 -= var10 * 128;
            class54.field958 -= var12 * 128;
            class127.field2115 -= var10 * 128;
            class100.field1592 -= var12 * 128;
        } else {
            class169.field2739 = 1;
        }
        class110.method822((byte) -115);
        class181.field2881.method317(70);
        class258.field4343.method317(20);
        class139.method1029();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)Z")
    public final boolean method811(int arg0, byte arg1, int arg2) {
        field1777++;
        if (arg1 < 22) {
            return false;
        } else {
            return arg2 >= this.field1764 && arg2 <= this.field1782 && this.field1765 <= arg0 && arg0 <= this.field1774;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Loh;")
    public static final class184 method812(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2800;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIIIIBZ)V")
    public static final void method813(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field1783++;
        int var7 = -117 / ((arg5 + 1) / 63);
        if (arg3 >= arg1) {
            return;
        }
        int var8 = arg3;
        int var9 = (arg3 + arg1) / 2;
        class208 var10 = class201.field3241[var9];
        class201.field3241[var9] = class201.field3241[arg1];
        class201.field3241[arg1] = var10;
        for (int var11 = arg3; var11 < arg1; var11++) {
            if (class250.method1826(class201.field3241[var11], arg2, arg4, var10, arg6, arg0, -1) <= 0) {
                class208 var12 = class201.field3241[var11];
                class201.field3241[var11] = class201.field3241[var8];
                class201.field3241[var8++] = var12;
            }
        }
        class201.field3241[arg1] = class201.field3241[var8];
        class201.field3241[var8] = var10;
        method813(arg0, var8 - 1, arg2, arg3, arg4, (byte) 107, arg6);
        method813(arg0, arg1, arg2, var8 + 1, arg4, (byte) 118, arg6);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1772 = arg6;
        this.field1765 = arg3;
        this.field1764 = arg2;
        this.field1782 = arg4;
        this.field1779 = arg9;
        this.field1770 = arg0;
        this.field1766 = arg7;
        this.field1769 = arg8;
        this.field1774 = arg5;
        this.field1775 = arg1;
    }
}

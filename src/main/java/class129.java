import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class129 extends class170 {

    @OriginalMember(owner = "client!ck", name = "jb", descriptor = "Z")
    public boolean field2150 = false;

    @OriginalMember(owner = "client!ck", name = "nb", descriptor = "Lcd;")
    private class209 field2154;

    @OriginalMember(owner = "client!ck", name = "lb", descriptor = "Z")
    private boolean field2152;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "Z")
    private boolean field2131;

    @OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
    private int field2149;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    private int field2142;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "Lsc;")
    private static class181 field2135 = class149.method967(255, "Nov");

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "Lsc;")
    private static class181 field2144 = class149.method967(255, "Jun");

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "Lsc;")
    private static class181 field2145 = class149.method967(255, "Jan");

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lsc;")
    private static class181 field2139 = class149.method967(255, "Sep");

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "Lsc;")
    private static class181 field2146 = class149.method967(255, "May");

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "Lsc;")
    public static class181 field2138 = class149.method967(255, "Konfig geladen)3");

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "[Lmj;")
    public static class178[] field2140 = new class178[32768];

    @OriginalMember(owner = "client!ck", name = "qb", descriptor = "Lsc;")
    private static class181 field2157 = class149.method967(255, "Jul");

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Lsc;")
    private static class181 field2127 = class149.method967(255, "Aug");

    @OriginalMember(owner = "client!ck", name = "rb", descriptor = "Lsc;")
    private static class181 field2158 = class149.method967(255, "Feb");

    @OriginalMember(owner = "client!ck", name = "ob", descriptor = "Lsc;")
    private static class181 field2155 = class149.method967(255, "Oct");

    @OriginalMember(owner = "client!ck", name = "sb", descriptor = "Lsc;")
    private static class181 field2159 = class149.method967(255, "Mar");

    @OriginalMember(owner = "client!ck", name = "kb", descriptor = "Lsc;")
    private static class181 field2151 = class149.method967(255, "Apr");

    @OriginalMember(owner = "client!ck", name = "pb", descriptor = "Lsc;")
    private static class181 field2156 = class149.method967(255, "Dec");

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "[Lsc;")
    public static class181[] field2143 = new class181[] { field2145, field2158, field2159, field2151, field2146, field2144, field2157, field2127, field2139, field2155, field2135, field2156 };

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "F")
    private float field2129;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ck", name = "mb", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "[I")
    public static int[] field2128;

    @OriginalMember(owner = "client!ck", name = "hb", descriptor = "[I")
    private int[] field2148;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILwf;Ljb;Z)[I")
    public final int[] method829(int arg0, class204 arg1, class11 arg2, boolean arg3) {
        field2133++;
        int var5 = 109 % ((11 - arg0) / 56);
        if (this.field2154.method1390(false, arg2, arg1)) {
            int var6 = arg3 ? 64 : 128;
            return this.field2154.method1388(arg2, -32162268, this.field2131, var6, arg1, 1.0D, var6, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lu;IIIIIIIZ)V")
    public static final void method830(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class146.field2391;
        int var11;
        int var12 = var11 = (arg7 << 7) - class45.field699;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class31.field505[arg1][arg6][arg7] - class264.field4601;
        int var18 = class31.field505[arg1][arg6 + 1][arg7] - class264.field4601;
        int var19 = class31.field505[arg1][arg6 + 1][arg7 + 1] - class264.field4601;
        int var20 = class31.field505[arg1][arg6][arg7 + 1] - class264.field4601;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class72.field1146;
        int var46 = (var24 << 9) / var25 + class72.field1141;
        int var47 = (var27 << 9) / var31 + class72.field1146;
        int var48 = (var30 << 9) / var31 + class72.field1141;
        int var49 = (var33 << 9) / var37 + class72.field1146;
        int var50 = (var36 << 9) / var37 + class72.field1141;
        int var51 = (var39 << 9) / var43 + class72.field1146;
        int var52 = (var42 << 9) / var43 + class72.field1141;
        class72.field1142 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class149.field2499 && class84.method570(class72.field1146 + class12.field249, class72.field1141 + class38.field585, var50, var52, var48, var49, var51, var47)) {
                class194.field3389 = arg6;
                class123.field2024 = arg7;
            }
            if (!arg8) {
                class72.field1152 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class72.field1158 || var51 > class72.field1158 || var47 > class72.field1158) {
                    class72.field1152 = true;
                }
                if (arg0.field1710 == -1) {
                    if (arg0.field1708 != 12345678) {
                        class72.method500(var50, var52, var48, var49, var51, var47, arg0.field1708, arg0.field1707, arg0.field1699);
                    }
                } else if (!class73.field1166) {
                    int var53 = class72.field1157.method948(65535, arg0.field1710);
                    class72.method500(var50, var52, var48, var49, var51, var47, class140.method897(var53, arg0.field1708), class140.method897(var53, arg0.field1707), class140.method897(var53, arg0.field1699));
                } else if (arg0.field1709) {
                    class72.method492(var50, var52, var48, var49, var51, var47, arg0.field1708, arg0.field1707, arg0.field1699, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1710);
                } else {
                    class72.method492(var50, var52, var48, var49, var51, var47, arg0.field1708, arg0.field1707, arg0.field1699, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1710);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class149.field2499 && class84.method570(class72.field1146 + class12.field249, class72.field1141 + class38.field585, var46, var48, var52, var45, var47, var51)) {
            class194.field3389 = arg6;
            class123.field2024 = arg7;
        }
        if (arg8) {
            return;
        }
        class72.field1152 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class72.field1158 || var47 > class72.field1158 || var51 > class72.field1158) {
            class72.field1152 = true;
        }
        if (arg0.field1710 != -1) {
            if (class73.field1166) {
                class72.method492(var46, var48, var52, var45, var47, var51, arg0.field1705, arg0.field1699, arg0.field1707, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1710);
                return;
            }
            int var54 = class72.field1157.method948(65535, arg0.field1710);
            class72.method500(var46, var48, var52, var45, var47, var51, class140.method897(var54, arg0.field1705), class140.method897(var54, arg0.field1699), class140.method897(var54, arg0.field1707));
        } else if (arg0.field1705 != 12345678) {
            class72.method500(var46, var48, var52, var45, var47, var51, arg0.field1705, arg0.field1699, arg0.field1707);
            return;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    public static void method831(byte arg0) {
        field2159 = null;
        field2127 = null;
        field2128 = null;
        field2156 = null;
        field2139 = null;
        if (arg0 <= 73) {
            field2140 = null;
        }
        field2158 = null;
        field2144 = null;
        field2143 = null;
        field2140 = null;
        field2145 = null;
        field2157 = null;
        field2146 = null;
        field2138 = null;
        field2151 = null;
        field2155 = null;
        field2135 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)V")
    public final void method832(int arg0, int arg1) {
        field2153++;
        if (arg1 != 0) {
            field2151 = null;
        }
        if (this.field2148 == null || this.field2142 == 0 && this.field2149 == 0) {
            return;
        }
        if (class222.field3847 == null || class222.field3847.length < this.field2148.length) {
            class222.field3847 = new int[this.field2148.length];
        }
        int var3 = this.field2148.length;
        int var4 = this.field2149 * arg0;
        int var5 = this.field2148.length == 4096 ? 64 : 128;
        int var6 = arg0 * var5 * this.field2142;
        int var7 = var5 - 1;
        int var8 = var3 - 1;
        for (int var9 = 0; var9 < var3; var9 += var5) {
            int var11 = var8 & var9 + var6;
            for (int var12 = 0; var12 < var5; var12++) {
                int var13 = var11 + (var7 & var4 + var12);
                int var14 = var9 + var12;
                class222.field3847[var14] = this.field2148[var13];
            }
        }
        int[] var10 = this.field2148;
        this.field2148 = class222.field3847;
        class222.field3847 = var10;
    }

    @OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field2130++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljb;ILwf;)Z")
    public final boolean method833(class11 arg0, int arg1, class204 arg2) {
        field2141++;
        if (arg1 >= -105) {
            field2138 = null;
        }
        return this.field2154.method1390(false, arg0, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZFLjb;Lwf;Z)[I")
    public final int[] method834(boolean arg0, float arg1, class11 arg2, class204 arg3, boolean arg4) {
        if (arg4) {
            field2159 = null;
        }
        field2132++;
        if (this.field2148 == null || this.field2129 != arg1) {
            if (!this.field2154.method1390(false, arg2, arg3)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field2148 = this.field2154.method1388(arg2, -32162268, this.field2131, var6, arg3, (double) arg1, var6, true);
            this.field2129 = arg1;
            if (this.field2152) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6 * var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 * var6;
                int var16 = var6 - 1;
                for (int var17 = 2; var17 >= 0; var17--) {
                    for (int var34 = var16; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field2148[var12];
                        var9[var34] += class5.method43(16746954, var35) >> 16;
                        var10[var34] += class5.method43(255, var35 >> 8);
                        var7[var34] += class5.method43(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var15;
                    }
                }
                int var18 = var6 - 1;
                int var19 = var15;
                for (int var20 = var18; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var24 += var7[var21];
                        var23 += var10[var21];
                        var25 += var9[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var27 = var16; var27 >= 0; var27--) {
                        int var31 = var25 / 9;
                        int var32 = var23 / 9;
                        int var33 = var24 / 9;
                        var21--;
                        var22--;
                        var19--;
                        var8[var19] = class185.method1291(class185.method1291(var32 << 8, var31 << 16), var33);
                        var24 += var7[var21] - var7[var22];
                        var23 += var10[var21] - var10[var22];
                        var25 += var9[var21] - var9[var22];
                        if (var22 == 0) {
                            var22 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var16; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field2148[var12];
                        var13--;
                        int var30 = this.field2148[var13];
                        var9[var28] += class5.method43(255, var29 >> 16) - (class5.method43(16730213, var30) >> 16);
                        var10[var28] += (class5.method43(var29, 65311) >> 8) - (class5.method43(65490, var30) >> 8);
                        var7[var28] += -class5.method43(255, var30) + class5.method43(var29, 255);
                    }
                    if (var12 == 0) {
                        var12 = var15;
                    }
                    if (var13 == 0) {
                        var13 = var15;
                    }
                }
                this.field2148 = var8;
            }
        }
        return this.field2148;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lvf;)V")
    public class129(class230 arg0) {
        this.field2154 = new class209(arg0);
        this.field2152 = arg0.method1516((byte) 82) == 1;
        this.field2131 = arg0.method1516((byte) 82) == 1;
        arg0.method1516((byte) 82);
        arg0.method1516((byte) 82);
        int var2 = arg0.method1516((byte) 82) & 0x3;
        this.field2149 = arg0.method1563(-255688184);
        this.field2142 = arg0.method1563(-255688184);
        arg0.method1516((byte) 82);
        arg0.method1516((byte) 82);
    }
}

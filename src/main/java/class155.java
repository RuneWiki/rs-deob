import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class155 {

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lsf;")
    public static class108 field2789 = class140.method973(255, "");

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field2790 = 0;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lof;")
    public static class242 field2792 = new class242(16);

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field2797 = -1;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lt;")
    public class257 field2781;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lik;")
    public static class262 field2796;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lma;")
    public class290 field2788;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field2780;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[I")
    public static int[] field2795;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1079(int arg0, int arg1) {
        if (arg0 != 0) {
            method1081(-121, (class262) null);
        }
        field2784++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)I", line = 18)
    public static final int method1080(int arg0, int arg1) {
        if (arg1 != 23236) {
            field2798 = 20;
        }
        field2786++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILik;)V", line = 33)
    public static final void method1081(int arg0, class262 arg1) {
        if (arg0 == -1) {
            field2791++;
            class184.field3374 = arg1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIBIIII)V", line = 49)
    public static final void method1082(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2782++;
        int var7 = arg5 - arg3;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg5;
        if (arg2 > -15) {
            field2790 = -40;
        }
        class52.method369(arg5, (byte) 88);
        int var10 = arg5;
        int var11 = -var7;
        int var12 = -1;
        int var13 = -1;
        int var14 = var7;
        if (arg4 >= class266.field4677 && arg4 <= class166.field2984) {
            int[] var15 = class106.field1839[arg4];
            int var16 = class174.method1236(class260.field4593, arg6 - arg5, class79.field1202, -6219);
            int var17 = class174.method1236(class260.field4593, arg6 + arg5, class79.field1202, -6219);
            int var18 = class174.method1236(class260.field4593, arg6 - var7, class79.field1202, -6219);
            int var19 = class174.method1236(class260.field4593, arg6 + var7, class79.field1202, -6219);
            class209.method1452(var18, var15, 7, var16, arg0);
            class209.method1452(var19, var15, 7, var18, arg1);
            class209.method1452(var17, var15, 7, var19, arg0);
        }
        while (var10 > var8) {
            var12 += 2;
            var9 += var12;
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && var14 >= 1) {
                var14--;
                var11 -= var14 << 1;
                class8.field100[var14] = var8;
            }
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                int var20 = arg4 + var10;
                int var21 = arg4 - var10;
                if (var20 >= class266.field4677 && var21 <= class166.field2984) {
                    if (var10 < var7) {
                        int var22 = class8.field100[var10];
                        int var23 = class174.method1236(class260.field4593, arg6 + var8, class79.field1202, -6219);
                        int var24 = class174.method1236(class260.field4593, arg6 - var8, class79.field1202, -6219);
                        int var25 = class174.method1236(class260.field4593, arg6 + var22, class79.field1202, -6219);
                        int var26 = class174.method1236(class260.field4593, arg6 - var22, class79.field1202, -6219);
                        if (class166.field2984 >= var20) {
                            int[] var27 = class106.field1839[var20];
                            class209.method1452(var26, var27, 7, var24, arg0);
                            class209.method1452(var25, var27, 7, var26, arg1);
                            class209.method1452(var23, var27, 7, var25, arg0);
                        }
                        if (class266.field4677 <= var21) {
                            int[] var28 = class106.field1839[var21];
                            class209.method1452(var26, var28, 7, var24, arg0);
                            class209.method1452(var25, var28, 7, var26, arg1);
                            class209.method1452(var23, var28, 7, var25, arg0);
                        }
                    } else {
                        int var29 = class174.method1236(class260.field4593, arg6 + var8, class79.field1202, -6219);
                        int var30 = class174.method1236(class260.field4593, arg6 - var8, class79.field1202, -6219);
                        if (var20 <= class166.field2984) {
                            class209.method1452(var29, class106.field1839[var20], 7, var30, arg0);
                        }
                        if (var21 >= class266.field4677) {
                            class209.method1452(var29, class106.field1839[var21], 7, var30, arg0);
                        }
                    }
                }
            }
            int var31 = arg4 + var8;
            int var32 = arg4 - var8;
            if (var31 >= class266.field4677 && var32 <= class166.field2984) {
                int var33 = arg6 + var10;
                int var34 = arg6 - var10;
                if (class260.field4593 <= var33 && class79.field1202 >= var34) {
                    int var35 = class174.method1236(class260.field4593, var33, class79.field1202, -6219);
                    int var36 = class174.method1236(class260.field4593, var34, class79.field1202, -6219);
                    if (var8 >= var7) {
                        if (var31 <= class166.field2984) {
                            class209.method1452(var35, class106.field1839[var31], 7, var36, arg0);
                        }
                        if (class266.field4677 <= var32) {
                            class209.method1452(var35, class106.field1839[var32], 7, var36, arg0);
                        }
                    } else {
                        int var37 = var14 < var8 ? class8.field100[var8] : var14;
                        int var38 = class174.method1236(class260.field4593, arg6 + var37, class79.field1202, -6219);
                        int var39 = class174.method1236(class260.field4593, arg6 - var37, class79.field1202, -6219);
                        if (var31 <= class166.field2984) {
                            int[] var40 = class106.field1839[var31];
                            class209.method1452(var39, var40, 7, var36, arg0);
                            class209.method1452(var38, var40, 7, var39, arg1);
                            class209.method1452(var35, var40, 7, var38, arg0);
                        }
                        if (var32 >= class266.field4677) {
                            int[] var41 = class106.field1839[var32];
                            class209.method1452(var39, var41, 7, var36, arg0);
                            class209.method1452(var38, var41, 7, var39, arg1);
                            class209.method1452(var35, var41, 7, var38, arg0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V", line = 235)
    public static final void method1083(int arg0, byte arg1) {
        if (class305.field5312 == 0) {
            class324.field5531.method1182(true, arg0);
        } else {
            class269.field4724 = arg0;
        }
        if (arg1 < 85) {
            method1080(-49, -25);
        }
        field2783++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)Lsf;", line = 253)
    public static final class108 method1084(int arg0, boolean arg1) {
        field2787++;
        if (arg1) {
            return (class108) null;
        } else if (arg0 > 0 && arg0 <= 255) {
            class108 var2 = new class108();
            var2.field1870 = 1;
            var2.field1884 = new byte[1];
            var2.field1884[0] = (byte) arg0;
            return var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 277)
    public static void method1085(int arg0) {
        field2780 = null;
        field2792 = null;
        if (arg0 >= -5) {
            field2789 = (class108) null;
        }
        field2795 = null;
        field2789 = null;
        field2796 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[Lca;B)V", line = 296)
    public static final void method1086(int arg0, class98[] arg1, byte arg2) {
        field2794++;
        int var3 = -68 / ((arg2 + 70) / 56);
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class98 var5 = arg1[var4];
            if (var5 != null && var5.field1611 == arg0 && (!var5.field1640 || !client.method1817(var5))) {
                if (var5.field1677 == 0) {
                    if (!var5.field1640 && client.method1817(var5) && class60.field967 != var5) {
                        continue;
                    }
                    method1086(var5.field1649, arg1, (byte) 107);
                    if (var5.field1636 != null) {
                        method1086(var5.field1649, var5.field1636, (byte) 4);
                    }
                    class158 var6 = (class158) class191.field3456.method1676((long) var5.field1649, (byte) -72);
                    if (var6 != null) {
                        class167.method1167((byte) -127, var6.field2845);
                    }
                }
                if (var5.field1677 == 6) {
                    if (var5.field1580 != -1 || var5.field1629 != -1) {
                        boolean var7 = class288.method2057(var5, (byte) 118);
                        int var8;
                        if (var7) {
                            var8 = var5.field1629;
                        } else {
                            var8 = var5.field1580;
                        }
                        if (var8 != -1) {
                            class272 var9 = class149.method1063(var8, -18767);
                            if (var9 != null) {
                                var5.field1713 += class195.field3534;
                                while (var5.field1713 > var9.field4764[var5.field1675]) {
                                    var5.field1713 -= var9.field4764[var5.field1675];
                                    var5.field1675++;
                                    if (var9.field4774.length <= var5.field1675) {
                                        var5.field1675 -= var9.field4765;
                                        if (var5.field1675 < 0 || var5.field1675 >= var9.field4774.length) {
                                            var5.field1675 = 0;
                                        }
                                    }
                                    class195.method1388(-82, var5);
                                }
                            }
                        }
                    }
                    if (var5.field1633 != 0 && !var5.field1640) {
                        int var10 = var5.field1633 << 16 >> 16;
                        int var11 = var5.field1633 >> 16;
                        int var12 = class195.field3534 * var11;
                        int var13 = class195.field3534 * var10;
                        var5.field1672 = var5.field1672 + var12 & 0x7FF;
                        var5.field1708 = var5.field1708 + var13 & 0x7FF;
                        class195.method1388(-82, var5);
                    }
                }
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class297 {

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[B")
    public static byte[] field4996 = new byte[520];

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lma;")
    private static class5 field4995 = class12.method119("M", (byte) 81);

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "Lma;")
    public static class5 field4999 = field4995;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "Lma;")
    public static class5 field5001 = field4995;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "J")
    public long field5004;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "Lql;")
    public class297 field4998;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Lql;")
    public class297 field5005;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 7)
    public final void method1997(int arg0) {
        if (arg0 != -27381) {
            return;
        }
        field5003++;
        if (this.field4998 != null) {
            this.field4998.field5005 = this.field5005;
            this.field5005.field4998 = this.field4998;
            this.field4998 = null;
            this.field5005 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 31)
    public static final void method1998(int arg0) {
        field5000++;
        int var1 = class61.field945.method1473(0);
        if (var1 == 0) {
            return;
        }
        class147.field2127.method1389((byte) -90, 10);
        class147.field2127.method1542(arg0 + 1957, 0);
        int var2 = class147.field2127.field3610;
        class251.field4156++;
        if (arg0 != -2035) {
            return;
        }
        class276 var3 = (class276) class61.field945.method1481(true);
        class147.field2127.method1539(var3.field4703, false);
        int var4 = var3.field4703;
        int var5 = 0;
        class276 var6;
        while ((var6 = (class276) class61.field945.method1481(true)) != null) {
            if (var5 < 255 && (var4 + 1) == var6.field4703) {
                var5++;
            } else {
                class147.field2127.method1542(-75, var5);
                var5 = 0;
                class147.field2127.method1539(var6.field4703, false);
            }
            var4 = var6.field4703;
        }
        class147.field2127.method1542(-110, var5);
        class147.field2127.method1546(class147.field2127.field3610 - var2, -13204);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)Lpd;", line = 75)
    public static final class100 method1999(int arg0, int arg1, int arg2) {
        field5002++;
        for (class100 var3 = (class100) class280.field4746.method1475(14); var3 != null; var3 = (class100) class280.field4746.method1486(38)) {
            if (var3.field1498 && var3.method638((byte) -125, arg1, arg2)) {
                return var3;
            }
        }
        if (arg0 != 15316) {
            field4996 = (byte[]) null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([[FIII[[II[[IIZIILwh;[[FI[[FIFI)I", line = 97)
    public static final int method2000(float[][] arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, int[][] arg6, int arg7, boolean arg8, int arg9, int arg10, class56 arg11, float[][] arg12, int arg13, float[][] arg14, int arg15, float arg16, int arg17) {
        field5006++;
        if (arg15 == 1) {
            int var19 = arg3;
            arg3 = arg7;
            arg7 = 128 - var19;
        } else if (arg15 == 2) {
            arg3 = 128 - arg3;
            arg7 = 128 - arg7;
        } else if (arg15 == 3) {
            int var18 = arg3;
            arg3 = 128 - arg7;
            arg7 = var18;
        }
        float var20;
        int var21;
        float var22;
        float var23;
        if (arg3 == 0 && arg7 == 0) {
            var20 = arg12[arg13][arg10];
            var21 = arg5;
            var22 = arg0[arg13][arg10];
            var23 = arg14[arg13][arg10];
        } else if (arg3 == 128 && arg7 == 0) {
            var23 = arg14[arg13 + 1][arg10];
            var22 = arg0[arg13 + 1][arg10];
            var20 = arg12[arg13 + 1][arg10];
            var21 = arg1;
        } else if (arg3 == 128 && arg7 == 128) {
            var21 = arg17;
            var23 = arg14[arg13 + 1][arg10 + 1];
            var22 = arg0[arg13 + 1][arg10 + 1];
            var20 = arg12[arg13 + 1][arg10 + 1];
        } else if (arg3 == 0 && arg7 == 128) {
            var23 = arg14[arg13][arg10 + 1];
            var22 = arg0[arg13][arg10 + 1];
            var20 = arg12[arg13][arg10 + 1];
            var21 = arg9;
        } else {
            float var24 = arg14[arg13][arg10];
            float var25 = arg0[arg13][arg10];
            float var26 = (float) arg7 / 128.0F;
            float var27 = (float) arg3 / 128.0F;
            float var28 = (arg0[arg13 + 1][arg10] - var25) * var27 + var25;
            float var29 = arg12[arg13][arg10];
            float var30 = arg14[arg13][arg10 + 1];
            float var31 = (arg14[arg13 + 1][arg10] - var24) * var27 + var24;
            float var32 = arg12[arg13][arg10 + 1];
            float var33 = (arg12[arg13 + 1][arg10 + 1] - var32) * var27 + var32;
            float var34 = (arg12[arg13 + 1][arg10] - var29) * var27 + var29;
            var20 = (var33 - var34) * var26 + var34;
            float var35 = arg0[arg13][arg10 + 1];
            float var36 = (arg0[arg13 + 1][arg10 + 1] - var35) * var27 + var35;
            var22 = (var36 - var28) * var26 + var28;
            float var37 = (arg14[arg13 + 1][arg10 + 1] - var30) * var27 + var30;
            var23 = (var37 - var31) * var26 + var31;
            int var38 = class85.method569(arg1, (byte) -71, arg3, arg5);
            int var39 = class85.method569(arg17, (byte) -71, arg3, arg9);
            var21 = class85.method569(var39, (byte) -71, arg7, var38);
        }
        int var40 = (arg13 << 7) + arg3;
        if (arg2 == 1) {
            int var41 = (arg10 << 7) + arg7;
            int var42 = class216.method1459(arg13, arg7, (byte) 117, arg10, arg3, arg6);
            return arg11.method424(var40, var42, var41, var22, var20, var23, arg8 ? var21 & 0xFFFFFF00 : var21, arg4 == null ? 0.0F : (float) (var42 - class216.method1459(arg13, arg7, (byte) 119, arg10, arg3, arg4)) / arg16);
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZII)I", line = 209)
    public static final int method2001(boolean arg0, int arg1, int arg2) {
        field4994++;
        if (arg0) {
            field4999 = (class5) null;
        }
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(JZ)V", line = 245)
    public static final void method2002(long arg0, boolean arg1) {
        field4989++;
        class147.field2127.field3610 = 0;
        class147.field2127.method1542(-105, 171);
        class147.field2127.method1548(arg1, arg0);
        class142.field2084 = -3;
        class257.field4394 = 0;
        class241.field4019 = 0;
        class208.field3303 = 1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIII)V", line = 270)
    public static final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= class57.field899 && class301.field5073 >= arg5 && arg2 >= class294.field4956 && class101.field1505 >= arg1) {
            class197.method1301(arg3, arg1, arg4, 115, arg7, arg0, arg5, arg2);
        } else {
            class169.method1123(arg0, arg2, arg1, arg5, arg4, arg7, arg3, 126);
        }
        field4991++;
        if (arg6 != -6376) {
            method2008((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)Z", line = 300)
    public final boolean method2004(boolean arg0) {
        field4997++;
        if (!arg0) {
            this.method1997(-111);
        }
        return this.field4998 != null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)Z", line = 315)
    public static final boolean method2005(byte arg0, int arg1) {
        field4990++;
        int var2 = -119 % ((arg0 + 29) / 58);
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZII[Lmc;[B)V", line = 327)
    public static final void method2006(int arg0, boolean arg1, int arg2, int arg3, class50[] arg4, byte[] arg5) {
        field4992++;
        if (arg2 <= 91) {
            method1998(59);
        }
        class221 var6 = new class221(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1549((byte) -43);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1507(-45);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var6.method1509(true);
                int var13 = (var9 & 0xFE7) >> 6;
                int var14 = var9 >> 12;
                int var15 = var12 >> 2;
                int var16 = arg0 + var13;
                int var17 = var12 & 0x3;
                int var18 = arg3 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class50 var19 = null;
                    if (!arg1) {
                        int var20 = var14;
                        if ((class18.field321[1][var16][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class303.method2054(var19, var15, var7, var16, arg1, var14, var14, 426775073, var17, !arg1, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 402)
    public static void method2007(byte arg0) {
        field4996 = null;
        field5001 = null;
        if (arg0 >= -99) {
            method2008((byte) 86);
        }
        field4999 = null;
        field4995 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V", line = 419)
    public static final void method2008(byte arg0) {
        if (arg0 != -96) {
            field4996 = (byte[]) null;
        }
        class11.field170 = class195.method1279(8, 35, (byte) 104, 8, true, 4, 2048, 0.4F);
        field4993++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lkb;IIIII)V", line = 432)
    public static final void method2009(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class168.field2570 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class115.field1721) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class179.field2708 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class198 var14 = class43.field646[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class208.field3304[var11][var12 + 1][var13] + class208.field3304[var11][var12][var13] + class208.field3304[var11][var12][var13 + 1] + class208.field3304[var11][var12 + 1][var13 + 1]) / 4 - (class208.field3304[arg1][arg2 + 1][arg3] + class208.field3304[arg1][arg2][arg3] + class208.field3304[arg1][arg2][arg3 + 1] + class208.field3304[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class89 var16 = var14.field3149;
                                    if (var16 != null) {
                                        if (var16.field1337.method1059()) {
                                            arg0.method1026(var16.field1337, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1326 != null && var16.field1326.method1059()) {
                                            arg0.method1026(var16.field1326, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3162; var17++) {
                                        class107 var18 = var14.field3166[var17];
                                        if (var18 != null && var18.field1589.method1059() && (var18.field1597 == var12 || var7 == var12) && (var18.field1595 == var13 || var9 == var13)) {
                                            int var19 = var18.field1587 + 1 - var18.field1597;
                                            int var20 = var18.field1598 + 1 - var18.field1595;
                                            arg0.method1026(var18.field1589, (var18.field1597 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1595 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}

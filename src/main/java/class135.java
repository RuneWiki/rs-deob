import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class135 extends class203 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Lmh;")
    public static class62 field2196 = class201.method1405(true, "showVideoAd");

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 14) {
            this.field2205 = -41;
        }
        field2206++;
        int var6 = this.field2199 << 3;
        int var7 = this.field2205 << 3;
        int var8 = (arg4 << 4) + (var6 & 0xF);
        int var9 = (arg2 << 4) + (var7 & 0xF);
        this.method632(var7, var6, var9, var8, arg0, arg1);
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 40)
    public static void method1019(int arg0) {
        field2196 = null;
        if (arg0 >= -89) {
            method1028(17, -114, -23, -118, -72);
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V", line = 53)
    public static final void method1020(int arg0) {
        class113.field1878 = null;
        class183.field2931 = null;
        class15.field132 = null;
        if (arg0 > -76) {
            field2196 = (class62) null;
        }
        class184.field2940 = null;
        class235.field4048 = null;
        class42.field645 = (byte[][]) null;
        field2204++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z[B)Llf;", line = 71)
    public static final class299 method1021(boolean arg0, byte[] arg1) {
        field2201++;
        if (arg1 == null) {
            return null;
        } else if (arg0) {
            return (class299) null;
        } else {
            class211 var2 = new class211(arg1, class183.field2931, class113.field1878, class15.field132, class184.field2940, class42.field645);
            method1020(-84);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)I", line = 91)
    public static final int method1022(byte arg0) {
        if (arg0 != -39) {
            method1022((byte) 97);
        }
        field2203++;
        return ((class114.field1902 == 0 ? 0 : 1) << 22) + ((class218.field3770 ? 1 : 0) << 19) + (class301.field5179 & 0x3 << 11) + ((class158.field2547 ? 1 : 0) << 10) + ((class74.field1157 ? 1 : 0) << 7) + (((class306.field5262 ? 1 : 0) << 6) + ((class44.field662 & 0x7) - -((class150.field2361 ? 1 : 0) << 3)) - (-((class113.field1877 ? 1 : 0) << 4) - ((class276.field4733 ? 1 : 0) << 5))) + ((class52.field756 ? 1 : 0) << 16) + ((class100.field1650 == 0 ? 0 : 1) << 21) - (-((class92.field1499 ? 1 : 0) << 8) + -((class170.field2777 ? 1 : 0) << 9)) - (-((client.field5162 ? 1 : 0) << 13) - ((class72.field1107 ? 1 : 0) << 15)) - (-(class97.field1596 & 0x3 << 17) - ((class169.field2744 == 0 ? 0 : 1) << 20));
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIILab;)Lab;", line = 104)
    public static final class138 method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6) {
        if (arg5 != -50) {
            return (class138) null;
        }
        long var7 = (long) arg2;
        field2198++;
        class138 var9 = (class138) class1.field2.method1396(0, var7);
        if (var9 == null) {
            class76 var10 = class76.method582(class218.field3753, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method580(64, 768, -50, -10, -50);
            class1.field2.method1397(var7, var9, true);
        }
        int var11 = arg6.method504();
        int var12 = arg6.method503();
        int var13 = arg6.method479();
        int var14 = arg6.method478();
        class138 var15 = var9.method482(true, true);
        if (arg1 != 0) {
            var15.method500(arg1);
        }
        class213 var16 = (class213) var15;
        if (arg0 != class165.method1186((byte) -58, arg3 + var13, arg4 - -var11, class7.field85) || arg0 != class165.method1186((byte) -58, arg3 + var14, arg4 - -var12, class7.field85)) {
            for (int var17 = 0; var17 < var16.field3590; var17++) {
                var16.field3587[var17] += class165.method1186((byte) -58, var16.field3583[var17] + arg3, var16.field3581[var17] + arg4, class7.field85) - arg0;
            }
            var16.field3588.field2532 = false;
            var16.field3618.field4367 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(III)V", line = 163)
    public static final void method1024(int arg0, int arg1, int arg2) {
        int var3 = -48 % ((arg1 + 51) / 36);
        field2200++;
        if (arg0 == 4 && !class72.field1107) {
            arg2 = 2;
            arg0 = 2;
        }
        if (class174.field2804 != arg0) {
            if (class195.field3304) {
                return;
            }
            if (class174.field2804 != 0) {
                class163.field2647[class174.field2804].method384();
            }
            if (arg0 != 0) {
                class95 var4 = class163.field2647[arg0];
                var4.method387();
                var4.method385(arg2);
            }
            class174.field2804 = arg0;
            class32.field437 = arg2;
        } else if (arg0 != 0 && class32.field437 != arg2) {
            class163.field2647[arg0].method385(arg2);
            class32.field437 = arg2;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZZLhi;Lhi;)Lqd;", line = 209)
    public static final class170 method1025(int arg0, boolean arg1, boolean arg2, class26 arg3, class26 arg4) {
        field2192++;
        boolean var5 = arg2;
        int[] var6 = arg3.method142(68, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method135(var6[var7], (byte) -82, arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg4.method135(var9, (byte) -82, 0);
                } else {
                    var10 = arg4.method135(0, (byte) -82, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class170(arg3, arg4, arg0, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIIIIZZ)Lwj;", line = 259)
    public static final class135 method1026(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field2197++;
        class37 var8 = class189.method1320(0, arg2);
        if (arg3 > 1 && var8.field527 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg3 >= var8.field519[var10] && var8.field519[var10] != 0) {
                    var9 = var8.field527[var10];
                }
            }
            if (var9 != -1) {
                var8 = class189.method1320(0, var9);
            }
        }
        class67 var11 = var8.method242((byte) 47);
        if (var11 == null) {
            return null;
        }
        class82 var12 = null;
        if (var8.field509 != -1) {
            var12 = (class82) method1026(true, 124, var8.field576, 10, 0, 1, true, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field556 != -1) {
            var12 = (class82) method1026(false, -59, var8.field546, arg3, arg4, arg5, true, false);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class280.field4787;
        int var14 = class280.field4792;
        int[] var15 = class280.field4795;
        int[] var16 = new int[4];
        class280.method1908(var16);
        class82 var17 = new class82(36, 32);
        class280.method1914(var17.field1363, 36, 32);
        class23.method108();
        class23.method121(16, 16);
        int var18 = var8.field544;
        if (arg0) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg5 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class23.field257 = false;
        int var19 = class23.field245[var8.field545] * var18 >> 16;
        int var20 = class23.field254[var8.field545] * var18 >> 16;
        var11.method483(0, var8.field504, var8.field559, var8.field545, var8.field516, (var19 + var8.field525) - (var11.method278() / 2), var8.field525 + var20);
        if (arg5 >= 1) {
            var17.method631(1);
            if (arg5 >= 2) {
                var17.method631(16777215);
            }
            class280.method1914(var17.field1363, 36, 32);
        }
        if (arg4 != 0) {
            var17.method639(arg4);
        }
        if (var8.field509 != -1) {
            var12.method305(0, 0);
        } else if (var8.field556 != -1) {
            class280.method1914(var12.field1363, 36, 32);
            var17.method305(0, 0);
            var17 = var12;
        }
        if (arg7 && (var8.field528 == 1 || arg3 != 1) && arg3 != -1) {
            class43.field659.method2021(class137.method1041(true, arg3), 0, 9, 16776960, 1);
        }
        class280.method1914(var15, var13, var14);
        class280.method1904(var16);
        int var21 = 35 % ((arg1 - 64) / 59);
        class23.method108();
        class23.field257 = true;
        return arg6 ? var17 : new class257(var17);
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(B)[Lwj;", line = 394)
    public static final class135[] method1027(byte arg0) {
        if (arg0 > -19) {
            field2196 = (class62) null;
        }
        class135[] var1 = new class135[class12.field100];
        for (int var2 = 0; var2 < class12.field100; var2++) {
            int var3 = class184.field2940[var2] * class15.field132[var2];
            byte[] var4 = class42.field645[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class235.field4048[class234.method1648(255, var4[var6])];
            }
            var1[var2] = new class257(class41.field626, class189.field3005, class183.field2931[var2], class113.field1878[var2], class15.field132[var2], class184.field2940[var2], var5);
        }
        method1020(-87);
        field2195++;
        return var1;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(IIIII)V", line = 439)
    public static final void method1028(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 9464) {
            method1019(50);
        }
        int var5 = 0;
        int var6 = arg2;
        field2194++;
        int var7 = -1;
        int var8 = -arg2;
        int var9 = class4.method17(class176.field2819, arg4 ^ 0xFFFFE420, class52.field755, arg0 + arg2);
        int var10 = class4.method17(class176.field2819, -16168, class52.field755, arg0 - arg2);
        class271.method1861(arg1, true, class282.field4817[arg3], var9, var10);
        while (var5 < var6) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var6--;
                int var11 = arg3 - var6;
                var8 -= var6 << 1;
                int var12 = arg3 + var6;
                if (var12 >= class99.field1630 && var11 <= class81.field1348) {
                    int var13 = class4.method17(class176.field2819, -16168, class52.field755, arg0 + var5);
                    int var14 = class4.method17(class176.field2819, -16168, class52.field755, arg0 - var5);
                    if (var12 <= class81.field1348) {
                        class271.method1861(arg1, true, class282.field4817[var12], var13, var14);
                    }
                    if (class99.field1630 <= var11) {
                        class271.method1861(arg1, true, class282.field4817[var11], var13, var14);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class99.field1630 && class81.field1348 >= var15) {
                int var17 = class4.method17(class176.field2819, -16168, class52.field755, arg0 + var6);
                int var18 = class4.method17(class176.field2819, arg4 - 25632, class52.field755, arg0 - var6);
                if (var16 <= class81.field1348) {
                    class271.method1861(arg1, true, class282.field4817[var16], var17, var18);
                }
                if (class99.field1630 <= var15) {
                    class271.method1861(arg1, true, class282.field4817[var15], var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIIIII)V", line = 523)
    public static final void method1029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class271.method1861(arg5, true, class282.field4817[arg1], arg2 + arg4, -arg4 + arg2);
        if (arg3 > -20) {
            method1027((byte) 29);
        }
        field2208++;
        int var6 = arg0;
        int var7 = 0;
        int var8 = arg4 * arg4;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = arg0 << 1;
        int var12 = var8 << 1;
        int var13 = ((arg0 << 1) - 3) * var12;
        int var14 = var8 << 2;
        int var15 = (1 - var11) * var8 + var10;
        int var16 = (arg0 - 1) * var14;
        int var17 = var9 - (var11 - 1) * var12;
        int var18 = ((var7 << 1) + 3) * var10;
        int var19 = var9 << 2;
        int var20 = (var7 + 1) * var19;
        while (var6 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var7++;
                    var15 += var18;
                    var17 += var20;
                    var18 += var19;
                    var20 += var19;
                }
            }
            if (var17 < 0) {
                var17 += var20;
                var15 += var18;
                var18 += var19;
                var7++;
                var20 += var19;
            }
            var17 += -var13;
            var13 -= var14;
            var15 += -var16;
            var6--;
            var16 -= var14;
            int var21 = arg1 + var6;
            int var22 = arg1 - var6;
            int var23 = arg2 + var7;
            int var24 = arg2 - var7;
            class271.method1861(arg5, true, class282.field4817[var22], var23, var24);
            class271.method1861(arg5, true, class282.field4817[var21], var23, var24);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
    public abstract void method638(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
    public abstract void method304(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)V")
    public abstract void method642(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V")
    public abstract void method305(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIIII)V")
    public abstract void method637(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIII)V")
    public abstract void method644(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}

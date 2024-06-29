import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class294 extends class279 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public int field4550 = 12800;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Z")
    public boolean field4554 = true;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public int field4557 = -1;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public int field4553 = -1;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public int field4558 = 12800;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public int field4565 = 0;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public int field4556 = 0;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Ljava/lang/String;")
    public String field4546;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "Ljava/lang/String;")
    public String field4569;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Lma;")
    public class5 field4545;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field4555 = 0;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "F")
    public static float field4562;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 7)
    public final void method2044(byte arg0) {
        this.field4558 = 12800;
        this.field4556 = 0;
        this.field4565 = 0;
        field4551++;
        this.field4550 = 12800;
        for (class213 var2 = (class213) this.field4545.method22((byte) 121); var2 != null; var2 = (class213) this.field4545.method26((byte) -116)) {
            if (this.field4550 > var2.field3360) {
                this.field4550 = var2.field3360;
            }
            if (var2.field3365 < this.field4558) {
                this.field4558 = var2.field3365;
            }
            if (var2.field3364 > this.field4556) {
                this.field4556 = var2.field3364;
            }
            if (this.field4565 < var2.field3370) {
                this.field4565 = var2.field3370;
            }
        }
        if (arg0 >= -82) {
            method2048((byte) 28, -48, -87);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V", line = 44)
    public static final void method2045(byte arg0) {
        field4560++;
        if (class147.field2321 != -1) {
            class211.method1538(true, class147.field2321);
        }
        for (int var1 = 0; var1 < class310.field4829; var1++) {
            if (class231.field3607[var1]) {
                class97.field1277[var1] = true;
            }
            class124.field1771[var1] = class231.field3607[var1];
            class231.field3607[var1] = false;
        }
        class139.field2213 = -1;
        if (arg0 <= 14) {
            return;
        }
        class18.field287 = null;
        if (class109.field1458) {
            class230.field3601 = true;
        }
        class43.field586 = class229.field3595;
        class220.field3476 = -1;
        if (class147.field2321 != -1) {
            class310.field4829 = 0;
            class315.method2200((byte) 0);
        }
        if (class109.field1458) {
            class122.method898();
        } else {
            class280.method1980();
        }
        class153.field2373 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z", line = 96)
    public final boolean method2046(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return false;
        }
        field4547++;
        for (class213 var4 = (class213) this.field4545.method22((byte) 125); var4 != null; var4 = (class213) this.field4545.method26((byte) -126)) {
            if (var4.method1550(arg2, arg1, arg0 + 111)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 125)
    public static final String method2047(int arg0, byte arg1) {
        field4544++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg1 >= -20) {
            return (String) null;
        } else if (arg0 >= 10000000) {
            return "<col=00ff80>" + arg0 / 1000000 + class310.field4831 + "</col>";
        } else {
            return "<col=ffffff>" + arg0 / 1000 + class70.field973 + "</col>";
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 639)
    public class294(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4554 = arg5;
        this.field4546 = arg2;
        this.field4569 = arg1;
        this.field4557 = arg4;
        this.field4559 = arg0;
        this.field4568 = arg3;
        this.field4553 = arg6;
        if (this.field4553 == 255) {
            this.field4553 = 0;
        }
        this.field4545 = new class5();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)Lcd;", line = 154)
    public static final class136 method2048(byte arg0, int arg1, int arg2) {
        field4561++;
        if (arg0 < 77) {
            return (class136) null;
        }
        class136 var3 = class14.method140(arg1, 1036508464);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2062 == null || arg2 >= var3.field2062.length) {
            return null;
        } else {
            return var3.field2062[arg2];
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)[I", line = 174)
    public final int[] method2049(int arg0, int arg1, int arg2, int arg3) {
        field4564++;
        for (class213 var5 = (class213) this.field4545.method22((byte) 119); var5 != null; var5 = (class213) this.field4545.method26((byte) -122)) {
            if (var5.method1554(arg2, arg0, (byte) 122, arg1)) {
                return var5.method1552(97, arg0, arg2);
            }
        }
        if (arg3 != 24540) {
            field4563 = 122;
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(III)[I", line = 199)
    public final int[] method2050(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            method2047(-127, (byte) -106);
        }
        field4567++;
        for (class213 var4 = (class213) this.field4545.method22((byte) 122); var4 != null; var4 = (class213) this.field4545.method26((byte) -118)) {
            if (var4.method1550(arg0, arg1, 108)) {
                return var4.method1552(126, arg0, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILcd;II)V", line = 227)
    public static final void method2051(int arg0, class136 arg1, int arg2, int arg3) {
        field4552++;
        if (arg1.field2031 == 1) {
            class342.method2368("", arg1.field2043, 0, (byte) -68, -1, (short) 31, 0L, arg1.field2069);
            class235.field3683++;
        }
        if (arg1.field2031 == 2 && !class56.field783) {
            String var4 = class128.method939(arg1, (byte) -120);
            if (var4 != null) {
                class66.field947++;
                class342.method2368("<col=00ff00>" + arg1.field2173, var4, -1, (byte) -68, -1, (short) 12, 0L, arg1.field2069);
            }
        }
        if (arg1.field2031 == 3) {
            class158.field2448++;
            class342.method2368("", class271.field4208, 0, (byte) -68, -1, (short) 42, 0L, arg1.field2069);
        }
        if (arg1.field2031 == 4) {
            class342.method2368("", arg1.field2043, 0, (byte) -68, -1, (short) 14, 0L, arg1.field2069);
            class235.field3690++;
        }
        if (arg1.field2031 == 5) {
            class342.method2368("", arg1.field2043, 0, (byte) -68, -1, (short) 13, 0L, arg1.field2069);
            class52.field657++;
        }
        if (arg1.field2031 == 6 && class237.field3723 == null) {
            class342.method2368("", arg1.field2043, -1, (byte) -68, -1, (short) 59, 0L, arg1.field2069);
            class185.field3001++;
        }
        if (arg1.field2063 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field2104; var6++) {
                for (int var7 = 0; var7 < arg1.field2048; var7++) {
                    int var8 = (arg1.field2074 + 32) * var7;
                    int var9 = (arg1.field2071 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field2032[var5];
                        var9 += arg1.field1990[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg0 && var8 + 32 > arg2 && (var9 + 32) > arg0) {
                        class145.field2287 = var5;
                        class18.field287 = arg1;
                        if (arg1.field2146[var5] > 0) {
                            class127 var10 = client.method953(arg1);
                            class316 var11 = class149.method1092((byte) -104, arg1.field2146[var5] - 1);
                            if (class244.field3811 == 1 && var10.method929(121)) {
                                if (class251.field3956 != arg1.field2069 || class229.field3591 != var5) {
                                    class342.method2368(class78.field1054 + " -> <col=ff9040>" + var11.field4988, class24.field366, var5, (byte) -68, -1, (short) 50, (long) var11.field4952, arg1.field2069);
                                    class6.field103++;
                                }
                            } else if (class56.field783 && var10.method929(arg3 + 3081)) {
                                class58 var12 = class171.field2825 == -1 ? null : class246.method1769(class171.field2825, (byte) -116);
                                if ((class301.field4631 & 0x10) != 0 && (var12 == null || var11.method2214(var12.field826, class171.field2825, -67) != var12.field826)) {
                                    class342.method2368(class249.field3931 + " -> <col=ff9040>" + var11.field4988, class133.field1957, var5, (byte) -68, class33.field488, (short) 33, (long) var11.field4952, arg1.field2069);
                                    class1.field9++;
                                }
                            } else {
                                class179.field2909++;
                                String[] var13 = var11.field4968;
                                if (class150.field2345) {
                                    var13 = class251.method1798(false, var13);
                                }
                                if (var10.method929(127)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 1;
                                            } else {
                                                var15 = 43;
                                            }
                                            class131.field1932++;
                                            class342.method2368("<col=ff9040>" + var11.field4988, var13[var14], var5, (byte) -68, -1, var15, (long) var11.field4952, arg1.field2069);
                                        }
                                    }
                                }
                                if (var10.method922(arg3 + 1473499283)) {
                                    class141.field2245++;
                                    class342.method2368("<col=ff9040>" + var11.field4988, class24.field366, var5, (byte) -68, class3.field32, (short) 17, (long) var11.field4952, arg1.field2069);
                                }
                                if (var10.method929(arg3 + 3062) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class182.field2960++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 28;
                                            }
                                            if (var16 == 1) {
                                                var17 = 20;
                                            }
                                            if (var16 == 2) {
                                                var17 = 24;
                                            }
                                            class342.method2368("<col=ff9040>" + var11.field4988, var13[var16], var5, (byte) -68, -1, var17, (long) var11.field4952, arg1.field2069);
                                        }
                                    }
                                }
                                String[] var18 = arg1.field2101;
                                if (class150.field2345) {
                                    var18 = class251.method1798(false, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            class175.field2867++;
                                            if (var19 == 0) {
                                                var20 = 58;
                                            }
                                            if (var19 == 1) {
                                                var20 = 51;
                                            }
                                            if (var19 == 2) {
                                                var20 = 46;
                                            }
                                            if (var19 == 3) {
                                                var20 = 3;
                                            }
                                            if (var19 == 4) {
                                                var20 = 26;
                                            }
                                            class342.method2368("<col=ff9040>" + var11.field4988, var18[var19], var5, (byte) -68, -1, var20, (long) var11.field4952, arg1.field2069);
                                        }
                                    }
                                }
                                class342.method2368("<col=ff9040>" + var11.field4988, class328.field5145, var5, (byte) -68, class123.field1767, (short) 1002, (long) var11.field4952, arg1.field2069);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg3 != -2964) {
            method2045((byte) 86);
        }
        if (!arg1.field2164) {
            return;
        }
        if (!class56.field783) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class205.method1511(arg1, 1557676176, var21);
                if (var22 != null) {
                    class41.field563++;
                    class342.method2368(arg1.field2035, var22, arg1.field2086, (byte) -68, class116.method819(var21, -1, arg1), (short) 1006, (long) (var21 + 1), arg1.field2069);
                }
            }
            String var23 = class128.method939(arg1, (byte) -123);
            if (var23 != null) {
                class342.method2368(arg1.field2035, var23, arg1.field2086, (byte) -68, -1, (short) 12, 0L, arg1.field2069);
                class66.field947++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class205.method1511(arg1, 1557676176, var24);
                if (var25 != null) {
                    class342.method2368(arg1.field2035, var25, arg1.field2086, (byte) -68, class116.method819(var24, -1, arg1), (short) 18, (long) (var24 + 1), arg1.field2069);
                    class41.field563++;
                }
            }
            if (client.method953(arg1).method928(102)) {
                if (arg1.field2097 == null) {
                    class342.method2368("", class317.field5022, arg1.field2086, (byte) -68, -1, (short) 59, 0L, arg1.field2069);
                } else {
                    class342.method2368("", arg1.field2097, arg1.field2086, (byte) -68, -1, (short) 59, 0L, arg1.field2069);
                }
                class185.field3001++;
            }
        } else if (client.method953(arg1).method932(arg3 ^ 0xFFFFF46C) && (class301.field4631 & 0x20) != 0) {
            class342.method2368(class249.field3931 + " -> " + arg1.field2035, class133.field1957, arg1.field2086, (byte) -68, class33.field488, (short) 39, 0L, arg1.field2069);
            class193.field3079++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIII)V", line = 546)
    public static final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4543++;
        class319.field5044 = arg1;
        class135.field1987 = arg0;
        class14.field236 = arg4;
        if (arg2 != -4) {
            method2048((byte) -1, 87, -85);
        }
        class6.field122 = arg3;
        class126.field1816 = arg5;
        if (class14.field236 >= 100) {
            int var6 = class135.field1987 * 128 + 64;
            int var7 = class6.field122 * 128 + 64;
            int var8 = class320.method2245((byte) -48, var7, class154.field2392, var6) - class126.field1816;
            int var9 = var7 - class317.field5018;
            int var10 = var6 - class295.field4572;
            int var11 = var8 - class43.field588;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class293.field4536 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class185.field2999 = (int) (Math.atan2((double) var10, (double) var9) * -325.949D) & 0x7FF;
            if (class293.field4536 < 128) {
                class293.field4536 = 128;
            }
            if (class293.field4536 > 383) {
                class293.field4536 = 383;
            }
        }
        class166.field2715 = 2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBI)[I", line = 601)
    public final int[] method2053(int arg0, byte arg1, int arg2) {
        field4549++;
        if (arg1 <= 116) {
            field4555 = -48;
        }
        for (class213 var4 = (class213) this.field4545.method22((byte) 127); var4 != null; var4 = (class213) this.field4545.method26((byte) -113)) {
            if (var4.method1556(arg2, 8, arg0)) {
                return var4.method1551(arg0, true, arg2);
            }
        }
        return null;
    }
}

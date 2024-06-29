import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class106 {

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lwb;")
    public static class130 field2570 = class26.method212("huffman", -32376);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lwb;")
    public static class130 field2564 = class26.method212("scape main", -32376);

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lwb;")
    private static class130 field2575 = class26.method212("You need a members account to login to this world)3", -32376);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lwb;")
    public static class130 field2563 = field2575;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lwb;")
    private static class130 field2581 = class26.method212("Drop", -32376);

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lwb;")
    private static class130 field2584 = class26.method212("wave:", -32376);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lwb;")
    public static class130 field2562 = field2584;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lwb;")
    public static class130 field2573 = field2581;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Lie;")
    public static class53 field2579 = new class53();

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "Lwb;")
    public static class130 field2585 = class26.method212("Lade Wordpack )2 ", -32376);

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lwb;")
    private static class130 field2586 = class26.method212("button near the top of that page)3", -32376);

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lwb;")
    public static class130 field2587 = field2586;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lqd;")
    public static class100 field2569;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lec;")
    public static class28 field2566;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public static int[] field2567;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "[I")
    public static int[] field2578;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZIIIIIIII)V", line = 9)
    public static final void method798(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (!arg2) {
            method798(79, 48, true, -23, 27, -95, 14, 91, 87, 20, -7);
        }
        field2577++;
        if (!class52.method446(arg3, (byte) -116) || (arg10 > arg4 || arg6 > arg5 || arg4 >= arg1 || arg5 >= arg0)) {
            return;
        }
        class3[] var11 = class105.field2549[arg3];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class3 var13 = var11[var12];
            if (var13 != null && var13.field74 == arg9) {
                int var14 = var13.field145 + arg10;
                int var15 = arg6 + var13.field90 - arg8;
                if (var13.field110 == 8 && var14 <= arg4 && var15 <= arg5 && var13.field81 + var14 > arg4 && var13.field94 + var15 > arg5) {
                    class69.field1783 = var12;
                }
                if ((var13.field129 >= 0 || var13.field149 != 0) && arg4 >= var14 && var15 <= arg5 && arg4 < var14 + var13.field81 && var13.field94 + var15 > arg5) {
                    if (var13.field129 < 0) {
                        class92.field2214 = var12;
                    } else {
                        class92.field2214 = var13.field129;
                    }
                }
                if (var13.field110 != 0) {
                    if (var13.field79 == 1 && var14 <= arg4 && arg5 >= var15 && var13.field81 + var14 > arg4 && var13.field94 + var15 > arg5) {
                        boolean var16 = false;
                        if (var13.field111 != 0) {
                            var16 = class63.method522((byte) -112, var13);
                        }
                        if (!var16) {
                            class53.method450((arg3 << 16) + var12, 0, var13.field100, class9.field295, 22, 0, -127);
                            class124.field3006++;
                        }
                    }
                    if (var13.field79 == 2 && class42.field1182 == 0 && arg4 >= var14 && var15 <= arg5 && var13.field81 + var14 > arg4 && var15 + var13.field94 > arg5) {
                        class128.field3033++;
                        class53.method450((arg3 << 16) + var12, 0, var13.field89, class15.method114(new class130[] { class53.field1399, var13.field98 }, -20349), 20, 0, -127);
                    }
                    if (var13.field79 == 3 && var14 <= arg4 && var15 <= arg5 && var13.field81 + var14 > arg4 && var15 + var13.field94 > arg5) {
                        byte var17;
                        if (arg7 == 3) {
                            var17 = 54;
                        } else {
                            var17 = 21;
                        }
                        class53.method450((arg3 << 16) + var12, 0, class109.field2643, class9.field295, var17, 0, -121);
                        class68.field1765++;
                    }
                    if (var13.field79 == 4 && arg4 >= var14 && arg5 >= var15 && var14 + var13.field81 > arg4 && arg5 < var13.field94 + var15) {
                        class53.method450((arg3 << 16) + var12, 0, var13.field100, class9.field295, 29, 0, -108);
                        class96.field2318++;
                    }
                    if (var13.field79 == 5 && arg4 >= var14 && arg5 >= var15 && var13.field81 + var14 > arg4 && arg5 < var15 + var13.field94) {
                        class29.field800++;
                        class53.method450((arg3 << 16) + var12, 0, var13.field100, class9.field295, 33, 0, -121);
                    }
                    if (var13.field79 == 6 && class101.field2414 == -1 && var14 <= arg4 && arg5 >= var15 && arg4 < var13.field81 + var14 && arg5 < var13.field94 + var15) {
                        class53.method450((arg3 << 16) + var12, 0, var13.field100, class9.field295, 40, 0, -127);
                        class51.field1338++;
                    }
                    if (var13.field110 == 2) {
                        int var18 = 0;
                        for (int var19 = 0; var19 < var13.field94; var19++) {
                            for (int var20 = 0; var20 < var13.field81; var20++) {
                                int var21 = var15 + (var13.field95 + 32) * var19;
                                int var22 = (var13.field102 + 32) * var20 + var14;
                                if (var18 < 20) {
                                    var21 += var13.field104[var18];
                                    var22 += var13.field127[var18];
                                }
                                if (arg4 >= var22 && arg5 >= var21 && arg4 < var22 + 32 && var21 + 32 > arg5) {
                                    class8.field262 = (arg3 << 16) + var12;
                                    class119.field2917 = var18;
                                    if (var13.field72[var18] > 0) {
                                        class67 var23 = class84.method630((byte) 11, var13.field72[var18] - 1);
                                        if (class95.field2306 == 1 && var13.field97) {
                                            if ((arg3 << 16) + var12 != class94.field2285 || class90.field2191 != var18) {
                                                class92.field2209++;
                                                class53.method450((arg3 << 16) + var12, var23.field1717, class23.field679, class15.method114(new class130[] { class116.field2860, class6.field207, var23.field1688 }, -20349), 19, var18, -121);
                                            }
                                        } else if (class42.field1182 != 1 || !var13.field97) {
                                            class43.field1197++;
                                            class130[] var24 = var23.field1694;
                                            if (class63.field1601) {
                                                var24 = class93.method688((byte) 54, var24);
                                            }
                                            if (var13.field97) {
                                                for (int var25 = 4; var25 >= 3; var25--) {
                                                    if (var24 != null && var24[var25] != null) {
                                                        class93.field2241++;
                                                        byte var26;
                                                        if (var25 == 3) {
                                                            var26 = 10;
                                                        } else {
                                                            var26 = 50;
                                                        }
                                                        class53.method450((arg3 << 16) + var12, var23.field1717, var24[var25], class15.method114(new class130[] { class48.field1290, var23.field1688 }, -20349), var26, var18, -120);
                                                    } else if (var25 == 4) {
                                                        class15.field437++;
                                                        class53.method450((arg3 << 16) + var12, var23.field1717, field2573, class15.method114(new class130[] { class48.field1290, var23.field1688 }, -20349), 50, var18, -111);
                                                    }
                                                }
                                            }
                                            if (var13.field136) {
                                                class53.method450((arg3 << 16) + var12, var23.field1717, class23.field679, class15.method114(new class130[] { class48.field1290, var23.field1688 }, -20349), 37, var18, -126);
                                                class128.field3030++;
                                            }
                                            if (var13.field97 && var24 != null) {
                                                for (int var27 = 2; var27 >= 0; var27--) {
                                                    if (var24[var27] != null) {
                                                        class97.field2359++;
                                                        byte var28 = 0;
                                                        if (var27 == 0) {
                                                            var28 = 8;
                                                        }
                                                        if (var27 == 1) {
                                                            var28 = 18;
                                                        }
                                                        if (var27 == 2) {
                                                            var28 = 5;
                                                        }
                                                        class53.method450((arg3 << 16) + var12, var23.field1717, var24[var27], class15.method114(new class130[] { class48.field1290, var23.field1688 }, -20349), var28, var18, -109);
                                                    }
                                                }
                                            }
                                            class130[] var29 = var13.field116;
                                            if (class63.field1601) {
                                                var29 = class93.method688((byte) 54, var29);
                                            }
                                            if (var29 != null) {
                                                for (int var30 = 4; var30 >= 0; var30--) {
                                                    if (var29[var30] != null) {
                                                        byte var31 = 0;
                                                        class124.field3007++;
                                                        if (var30 == 0) {
                                                            var31 = 38;
                                                        }
                                                        if (var30 == 1) {
                                                            var31 = 2;
                                                        }
                                                        if (var30 == 2) {
                                                            var31 = 56;
                                                        }
                                                        if (var30 == 3) {
                                                            var31 = 43;
                                                        }
                                                        if (var30 == 4) {
                                                            var31 = 17;
                                                        }
                                                        class53.method450((arg3 << 16) + var12, var23.field1717, var29[var30], class15.method114(new class130[] { class48.field1290, var23.field1688 }, -20349), var31, var18, -120);
                                                    }
                                                }
                                            }
                                            class53.method450((arg3 << 16) + var12, var23.field1717, class101.field2419, class15.method114(new class130[] { class48.field1290, var23.field1688 }, -20349), 1002, var18, -116);
                                        } else if ((class45.field1231 & 0x10) == 16) {
                                            class98.field2367++;
                                            class53.method450((arg3 << 16) + var12, var23.field1717, class95.field2303, class15.method114(new class130[] { class32.field883, class6.field207, var23.field1688 }, -20349), 41, var18, -122);
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                } else if (!var13.field75 || class132.method1014(arg7, 1, var12) || class10.field325) {
                    method798(var13.field94 + var15, var14 - -var13.field81, true, arg3, arg4, arg5, var15, arg7, var13.field130, var12, var14);
                    if (var13.field70 > var13.field94) {
                        class24.method207(arg4, var15, arg5, var13.field70, var13.field94, var13.field81 + var14, arg7, (byte) -30, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfe;II)Lwb;", line = 357)
    public static final class130 method799(class36 arg0, int arg1, int arg2) {
        field2582++;
        if (arg2 != -17817) {
            return null;
        }
        try {
            class130 var3 = new class130();
            var3.field3079 = arg0.method331(84);
            if (var3.field3079 > arg1) {
                var3.field3079 = arg1;
            }
            var3.field3081 = new byte[var3.field3079];
            arg0.field1057 += class88.field2103.method4(arg2 ^ 0x45A6, var3.field3079, var3.field3081, arg0.field1057, 0, arg0.field1067);
            return var3;
        } catch (Exception var4) {
            return class92.field2205;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lk;ILk;)I", line = 385)
    public static final int method800(class60 arg0, int arg1, class60 arg2) {
        if (arg1 != 4) {
            method798(-73, -121, true, -59, 48, 72, 71, -81, 72, 62, 66);
        }
        field2583++;
        int var3 = 0;
        if (arg2.method510(class124.field3010, -1, class119.field2913)) {
            var3++;
        }
        if (arg0.method510(class124.field3010, -1, class48.field1284)) {
            var3++;
        }
        if (arg0.method510(class124.field3010, -1, class111.field2743)) {
            var3++;
        }
        if (arg0.method510(class124.field3010, arg1 - 5, class84.field2007)) {
            var3++;
        }
        if (arg0.method510(class124.field3010, -1, class85.field2022)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 426)
    public static final void method801(boolean arg0) {
        field2568++;
        if (!arg0 && class81.field1934 != null) {
            class81.field1934.method573();
            class81.field1934 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z", line = 446)
    public static final boolean method802(int arg0, int arg1) {
        field2572++;
        if (arg1 >= -41) {
            return true;
        } else if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lwb;ILwb;Lk;)[Lqd;", line = 470)
    public static final class100[] method803(class130 arg0, int arg1, class130 arg2, class60 arg3) {
        field2565++;
        if (arg1 != -17910) {
            field2567 = null;
        }
        int var4 = arg3.method507(arg0, -1);
        int var5 = arg3.method502(arg2, false, var4);
        return class79.method606(arg3, var4, var5, -21844);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V", line = 505)
    public static void method804(boolean arg0) {
        field2566 = null;
        field2587 = null;
        field2581 = null;
        field2573 = null;
        field2562 = null;
        field2578 = null;
        field2563 = null;
        field2579 = null;
        field2564 = null;
        field2575 = null;
        field2567 = null;
        if (!arg0) {
            method804(false);
        }
        field2586 = null;
        field2585 = null;
        field2570 = null;
        field2569 = null;
        field2584 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 537)
    public static final Class method805(int arg0, String arg1) throws ClassNotFoundException {
        field2571++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg0 != 16519) {
                field2586 = null;
            }
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZII)I")
    public abstract int method82(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public abstract void method83(byte arg0);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public abstract void method84(int arg0);
}

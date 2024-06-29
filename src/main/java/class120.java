import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class120 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lka;")
    public static class408 field1820 = new class408(64);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Ljm;")
    public static class162 field1824 = new class162();

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)V", line = 16)
    public static final void method931(int arg0, boolean arg1) {
        if (arg0 <= 79) {
            return;
        }
        field1822++;
        int[] var2 = null;
        byte[][] var3;
        byte var4;
        if (arg1) {
            var4 = 1;
            var3 = class134.field2008;
        } else {
            var3 = class115.field1750;
            var4 = 4;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            class140.method1025(255);
            for (int var6 = 0; var6 < class11.field107 >> 3; var6++) {
                for (int var7 = 0; var7 < class264.field3620 >> 3; var7++) {
                    boolean var8 = false;
                    int var9 = class22.field274[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFCA07) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class171.field2413.length; var15++) {
                                if (class171.field2413[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class428.method2639(class354.field4765, arg1, var7 * 8, var13, (byte) 107, var6 * 8, var10, class403.field5567, var5, var3[var15], var11, var12);
                                    var8 = true;
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class14.method80(var7 * 8, var5, -1, var6 * 8, 8, 8);
                    }
                }
            }
        }
        if (var2 == null) {
            class399.field5537 = null;
        } else {
            class399.field5537 = class248.method1609(var2[1], (byte) 36, var2[2], var2[0], var2[3]);
            class253.field3516 = var2[4];
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z", line = 130)
    public static final boolean method932(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class447.field6344; var3++) {
            class186 var4 = class273.field3723[var3];
            if (var4.field2693 == 1) {
                int var5 = var4.field2691 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2685 * var5 >> 8) + var4.field2688;
                    int var7 = (var4.field2687 * var5 >> 8) + var4.field2681;
                    int var8 = (var4.field2676 * var5 >> 8) + var4.field2674;
                    int var9 = (var4.field2679 * var5 >> 8) + var4.field2677;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2693 == 2) {
                int var10 = arg0 - var4.field2691;
                if (var10 > 0) {
                    int var11 = (var4.field2685 * var10 >> 8) + var4.field2688;
                    int var12 = (var4.field2687 * var10 >> 8) + var4.field2681;
                    int var13 = (var4.field2676 * var10 >> 8) + var4.field2674;
                    int var14 = (var4.field2679 * var10 >> 8) + var4.field2677;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2693 == 3) {
                int var15 = var4.field2688 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2683 * var15 >> 8) + var4.field2691;
                    int var17 = (var4.field2696 * var15 >> 8) + var4.field2689;
                    int var18 = (var4.field2676 * var15 >> 8) + var4.field2674;
                    int var19 = (var4.field2679 * var15 >> 8) + var4.field2677;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2693 == 4) {
                int var20 = arg2 - var4.field2688;
                if (var20 > 0) {
                    int var21 = (var4.field2683 * var20 >> 8) + var4.field2691;
                    int var22 = (var4.field2696 * var20 >> 8) + var4.field2689;
                    int var23 = (var4.field2676 * var20 >> 8) + var4.field2674;
                    int var24 = (var4.field2679 * var20 >> 8) + var4.field2677;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2693 == 5) {
                int var25 = arg1 - var4.field2674;
                if (var25 > 0) {
                    int var26 = (var4.field2683 * var25 >> 8) + var4.field2691;
                    int var27 = (var4.field2696 * var25 >> 8) + var4.field2689;
                    int var28 = (var4.field2685 * var25 >> 8) + var4.field2688;
                    int var29 = (var4.field2687 * var25 >> 8) + var4.field2681;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 254)
    public static final void method933(byte arg0) {
        field1817++;
        while (class75.field1068.method1145(8, class213.field2982) >= 27) {
            int var1 = class75.field1068.method1146((byte) -80, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class428.field5951[var1] == null) {
                class428.field5951[var1] = new class419();
                class428.field5951[var1].field2622 = var1;
                var2 = true;
            }
            class419 var3 = class428.field5951[var1];
            class228.field3187[class53.field674++] = var1;
            var3.field2575 = class246.field3467;
            if (var3.field5807 != null && var3.field5807.method1517((byte) -69)) {
                class294.method1790(var3, (byte) -65);
            }
            int var4 = class75.field1068.method1146((byte) -100, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class75.field1068.method1146((byte) -99, 3) + 4 << 11 & 0x3D29;
            int var6 = class75.field1068.method1146((byte) -101, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class75.field1068.method1146((byte) -67, 1);
            if (var7 == 1) {
                class251.field3505[class418.field5783++] = var1;
            }
            var3.method2586(class11.method57(-14758, class75.field1068.method1146((byte) -78, 14)), -8);
            int var8 = class75.field1068.method1146((byte) -91, 1);
            var3.method1291(var3.field5807.field3278, false);
            var3.field2629 = var3.field5807.field3268 << 3;
            if (var3.field2629 == 0) {
                var3.method1290(0, 0);
            } else if (var2) {
                var3.method1290(var5, 0);
            }
            var3.method1280(var3.method1285(-114), 120, var8 == 1, class359.field4970.field2662[0] + var4, class359.field4970.field2659[0] + var6, class343.field4623);
            if (var3.field5807.method1517((byte) 127)) {
                class48.method392((class447) null, -6024, 0, var3.field2659[0], (class423) null, var3, var3.field2662[0], class343.field4623);
            }
        }
        class75.field1068.method1147((byte) -76);
        if (arg0 > -12) {
            method932(-109, 48, 97);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILne;)V", line = 332)
    public static final void method934(int arg0, class76 arg1) {
        field1823++;
        if (arg0 >= -95) {
            return;
        }
        class331 var2 = null;
        try {
            class285 var3 = arg1.method599(-126);
            while (var3.field3875 == 0) {
                class328.method1999(0, 1L);
            }
            if (var3.field3875 == 1) {
                var2 = (class331) var3.field3871;
                class366 var4 = class111.method848((byte) -2);
                var2.method2008(0, true, var4.field5048, var4.field5076);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method2009(-97);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 371)
    public static final void method935(byte arg0) {
        class75.field1068.method1150(arg0 ^ 0xFFFFFFAD);
        field1819++;
        int var1 = class75.field1068.method1146((byte) -94, 8);
        if (var1 < class53.field674) {
            for (int var2 = var1; var2 < class53.field674; var2++) {
                class405.field5609[class453.field6503++] = class228.field3187[var2];
            }
        }
        if (var1 > class53.field674) {
            throw new RuntimeException("gnpov1");
        }
        class53.field674 = 0;
        if (arg0 != -62) {
            field1824 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class228.field3187[var3];
            class419 var5 = class428.field5951[var4];
            int var6 = class75.field1068.method1146((byte) -119, 1);
            if (var6 == 0) {
                class228.field3187[class53.field674++] = var4;
                var5.field2575 = class246.field3467;
            } else {
                int var7 = class75.field1068.method1146((byte) -90, 2);
                if (var7 == 0) {
                    class228.field3187[class53.field674++] = var4;
                    var5.field2575 = class246.field3467;
                    class251.field3505[class418.field5783++] = var4;
                } else if (var7 == 1) {
                    class228.field3187[class53.field674++] = var4;
                    var5.field2575 = class246.field3467;
                    int var8 = class75.field1068.method1146((byte) -116, 3);
                    var5.method2583(1, var8, 0);
                    int var9 = class75.field1068.method1146((byte) -99, 1);
                    if (var9 == 1) {
                        class251.field3505[class418.field5783++] = var4;
                    }
                } else if (var7 == 2) {
                    class228.field3187[class53.field674++] = var4;
                    var5.field2575 = class246.field3467;
                    if (class75.field1068.method1146((byte) -72, 1) == 1) {
                        int var11 = class75.field1068.method1146((byte) -98, 3);
                        var5.method2583(2, var11, arg0 + 62);
                        int var12 = class75.field1068.method1146((byte) -101, 3);
                        var5.method2583(2, var12, 0);
                    } else {
                        int var10 = class75.field1068.method1146((byte) -122, 3);
                        var5.method2583(0, var10, 0);
                    }
                    int var13 = class75.field1068.method1146((byte) -105, 1);
                    if (var13 == 1) {
                        class251.field3505[class418.field5783++] = var4;
                    }
                } else if (var7 == 3) {
                    class405.field5609[class453.field6503++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 484)
    public static void method936(int arg0) {
        field1820 = null;
        field1824 = null;
        if (arg0 != 4207) {
            method934(111, (class76) null);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 501)
    public static final Object method937(boolean arg0, int arg1, byte[] arg2) {
        field1818++;
        if (arg1 <= 62) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class277.field3771) {
                try {
                    class253 var3 = (class253) Class.forName("tp").getDeclaredConstructor().newInstance();
                    var3.method1318(arg2, 3257);
                    return var3;
                } catch (Throwable var4) {
                    class277.field3771 = true;
                }
            }
            return arg0 ? class447.method2778(true, arg2) : arg2;
        }
    }
}

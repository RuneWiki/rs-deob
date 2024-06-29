import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class192 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lim;")
    public class183 field2636 = new class183();

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2642 = "Loaded fonts";

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Lkm;")
    public static class133 field2640;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lim;")
    private class183 field2644;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Lim;", line = 4)
    public final class183 method1335(int arg0) {
        field2634++;
        if (arg0 != 1) {
            method1340(-122, -5);
        }
        class183 var2 = this.field2636.field2523;
        if (this.field2636 == var2) {
            this.field2644 = null;
            return null;
        } else {
            this.field2644 = var2.field2523;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Lim;", line = 29)
    public final class183 method1336(int arg0) {
        if (arg0 != 3) {
            method1337(-121, 36);
        }
        class183 var2 = this.field2644;
        field2639++;
        if (this.field2636 == var2) {
            this.field2644 = null;
            return null;
        } else {
            this.field2644 = var2.field2523;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Z", line = 52)
    public static final boolean method1337(int arg0, int arg1) {
        byte var2 = 0;
        field2643++;
        int var3 = arg0;
        if (class134.field1850 == null) {
            if (class67.field908 || class256.field3699 == null) {
                class134.field1850 = new class178(512, 512);
            } else {
                class134.field1850 = (class178) class256.field3699;
            }
            int[] var4 = class134.field1850.field2403;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = arg0 + 1; var7 < 103 - var3; var7++) {
                int var8 = (var3 + 103 - var7) * 4 * 512 + 24628;
                for (int var9 = var2 + 1; var9 < (104 - var2 - 1); var9++) {
                    if ((class240.field3406[arg1][var9][var7] & 0x18) == 0) {
                        class76.method559(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class240.field3406[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class76.method559(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class333.field5021 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class317.method2222(class251.field3603, var2 + var10, var3 + var11);
                    if (var12 != 0L) {
                        class302 var14 = class153.method1106(Integer.MAX_VALUE & (int) (var12 >>> 32), (byte) -112);
                        int var15 = var14.field4529;
                        if (var14.field4519 != null) {
                            for (int var16 = 0; var16 < var14.field4519.length; var16++) {
                                if (var14.field4519[var16] != -1) {
                                    class302 var17 = class153.method1106(var14.field4519[var16], (byte) -59);
                                    if (var17.field4529 >= 0) {
                                        var15 = var17.field4529;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var3 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class312.field4714[class251.field3603].field988;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > (var10 - 3) && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < var10 + 3 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > var11 - 3 && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class130.field1790[class333.field5021] = var14.field4549;
                            class221.field3173[class333.field5021] = var18 - var2;
                            class208.field3000[class333.field5021] = var19 - var3;
                            class333.field5021++;
                        }
                    }
                }
            }
        }
        int var23 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (10 - (((int) (Math.random() * 20.0D) - 10) + 238 << 8) - ((int) (Math.random() * 20.0D)) - 238);
        class134.field1850.method1226();
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class240.field3406[arg1][var2 + var26][var3 + var25] & 0x18) == 0 && !class194.method1357(var24, -3, var23, var3, var2, var26, arg1, var25)) {
                    if (class67.field908) {
                        class38.field429 = null;
                    } else {
                        class272.field4079.method1111((byte) 119);
                    }
                    return false;
                }
                if (arg1 < 3 && (class240.field3406[arg1 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class194.method1357(var24, arg0 - 3, var23, var3, var2, var26, arg1 + 1, var25)) {
                    if (class67.field908) {
                        class38.field429 = null;
                    } else {
                        class272.field4079.method1111((byte) 123);
                    }
                    return false;
                }
            }
        }
        if (class67.field908) {
            int[] var27 = class134.field1850.field2403;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class256.field3699 = new class328(class134.field1850);
        } else {
            class256.field3699 = class134.field1850;
        }
        if (class67.field908) {
            class38.field429 = null;
        } else {
            class272.field4079.method1111((byte) 121);
        }
        class134.field1850 = null;
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Lim;", line = 288)
    public final class183 method1338(int arg0) {
        field2635++;
        class183 var2 = this.field2636.field2518;
        if (this.field2636 == var2) {
            this.field2644 = null;
            return null;
        } else {
            this.field2644 = var2.field2518;
            return arg0 == -1 ? var2 : (class183) null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLim;)V", line = 309)
    public final void method1339(byte arg0, class183 arg1) {
        int var3 = 123 % ((-arg0 - 51) / 54);
        field2638++;
        if (arg1.field2518 != null) {
            arg1.method1274((byte) -26);
        }
        arg1.field2518 = this.field2636.field2518;
        arg1.field2523 = this.field2636;
        arg1.field2518.field2523 = arg1;
        arg1.field2523.field2518 = arg1;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)Lge;", line = 325)
    public static final class221 method1340(int arg0, int arg1) {
        field2633++;
        class221 var2 = (class221) class82.field1187.method365((long) arg0, 35);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class20.field260.method955(arg0, 0, -21853);
        if (arg1 != 39) {
            method1344(113L, 85);
        }
        if (var3 == null) {
            return null;
        }
        class221 var4 = new class221();
        class316 var5 = new class316(var3);
        var5.field4777 = var5.field4798.length - 2;
        int var6 = var5.method2220((byte) 104);
        int var7 = var5.field4798.length - var6 - 12 - 2;
        var5.field4777 = var7;
        int var8 = var5.method2172((byte) 71);
        var4.field3170 = var5.method2220((byte) 48);
        var4.field3171 = var5.method2220((byte) 107);
        var4.field3175 = var5.method2220((byte) 105);
        var4.field3178 = var5.method2220((byte) 81);
        int var9 = var5.method2219(16448);
        if (var9 > 0) {
            var4.field3169 = new class17[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2220((byte) 112);
                class17 var12 = new class17(class110.method804(var11, (byte) 72));
                var4.field3169[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method2172((byte) 71);
                    int var14 = var5.method2172((byte) 71);
                    var12.method120((long) var13, new class336(var14), arg1 ^ 0xFFFFA69A);
                }
            }
        }
        var5.field4777 = 0;
        int var15 = 0;
        var4.field3168 = var5.method2208((byte) 121);
        var4.field3176 = new String[var8];
        var4.field3174 = new int[var8];
        var4.field3166 = new int[var8];
        while (var7 > var5.field4777) {
            int var16 = var5.method2220((byte) 99);
            if (var16 == 3) {
                var4.field3176[var15] = var5.method2158(-872702056).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3174[var15] = var5.method2219(client.method823(arg1, 16487));
            } else {
                var4.field3174[var15] = var5.method2172((byte) 71);
            }
            var4.field3166[var15++] = var16;
        }
        class82.field1187.method369(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V", line = 417)
    public static void method1341(int arg0) {
        field2642 = null;
        field2640 = null;
        int var1 = -123 / ((14 - arg0) / 35);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIB)V", line = 430)
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != -8) {
            method1346(false, -89L);
        }
        if (arg2 >= 0 && arg3 >= 0 && arg2 < 103 && arg3 < 103) {
            if (arg1 == 0) {
                class7 var8 = class190.method1333(arg0, arg2, arg3);
                if (var8 != null) {
                    int var9 = (int) (var8.field69 >>> 32) & Integer.MAX_VALUE;
                    if (arg4 == 2) {
                        var8.field57 = new class301(var9, 2, arg6 + 4, arg0, arg2, arg3, arg5, false, var8.field57);
                        var8.field55 = new class301(var9, 2, arg6 + 1 & 0x3, arg0, arg2, arg3, arg5, false, var8.field55);
                    } else {
                        var8.field57 = new class301(var9, arg4, arg6, arg0, arg2, arg3, arg5, false, var8.field57);
                    }
                }
            }
            if (arg1 == 1) {
                class269 var10 = class7.method40(arg0, arg2, arg3);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3992 >>> 32);
                    if (arg4 == 4 || arg4 == 5) {
                        var10.field3987 = new class301(var11, 4, arg6, arg0, arg2, arg3, arg5, false, var10.field3987);
                    } else if (arg4 == 6) {
                        var10.field3987 = new class301(var11, 4, arg6 + 4, arg0, arg2, arg3, arg5, false, var10.field3987);
                    } else if (arg4 == 7) {
                        var10.field3987 = new class301(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg2, arg3, arg5, false, var10.field3987);
                    } else if (arg4 == 8) {
                        var10.field3987 = new class301(var11, 4, arg6 + 4, arg0, arg2, arg3, arg5, false, var10.field3987);
                        var10.field3995 = new class301(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg2, arg3, arg5, false, var10.field3995);
                    }
                }
            }
            if (arg1 == 2) {
                class280 var12 = class52.method360(arg0, arg2, arg3);
                if (arg4 == 11) {
                    arg4 = 10;
                }
                if (var12 != null) {
                    var12.field4199 = new class301(Integer.MAX_VALUE & (int) (var12.field4203 >>> 32), arg4, arg6, arg0, arg2, arg3, arg5, false, var12.field4199);
                }
            }
            if (arg1 == 3) {
                class306 var13 = class344.method2380(arg0, arg2, arg3);
                if (var13 != null) {
                    var13.field4586 = new class301(Integer.MAX_VALUE & (int) (var13.field4580 >>> 32), 22, arg6, arg0, arg2, arg3, arg5, false, var13.field4586);
                }
            }
        }
        field2637++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lim;I)V", line = 522)
    public final void method1343(class183 arg0, int arg1) {
        if (arg1 > -4) {
            return;
        }
        if (arg0.field2518 != null) {
            arg0.method1274((byte) -26);
        }
        arg0.field2518 = this.field2636;
        arg0.field2523 = this.field2636.field2523;
        arg0.field2518.field2523 = arg0;
        arg0.field2523.field2518 = arg0;
        field2631++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)V", line = 552)
    public static final void method1344(long arg0, int arg1) {
        if (arg1 != 4032) {
            method1347(69, false, 21, true);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        field2628++;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V", line = 569)
    public final void method1345(int arg0) {
        field2629++;
        if (arg0 >= -30) {
            return;
        }
        while (true) {
            class183 var2 = this.field2636.field2523;
            if (this.field2636 == var2) {
                this.field2644 = null;
                return;
            }
            var2.method1274((byte) -26);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZJ)V", line = 590)
    public static final void method1346(boolean arg0, long arg1) {
        field2641++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0) {
            field2640 = (class133) null;
        }
        for (int var3 = 0; var3 < class44.field535; var3++) {
            if (class89.field1254[var3] == arg1) {
                class44.field535--;
                class124.field1677++;
                for (int var4 = var3; var4 < class44.field535; var4++) {
                    class207.field2986[var4] = class207.field2986[var4 + 1];
                    class344.field5271[var4] = class344.field5271[var4 + 1];
                    class290.field4325[var4] = class290.field4325[var4 + 1];
                    class89.field1254[var4] = class89.field1254[var4 + 1];
                    class21.field275[var4] = class21.field275[var4 + 1];
                    class30.field370[var4] = class30.field370[var4 + 1];
                }
                class201.field2856 = class185.field2549;
                class90.field1264.method2238(205, (byte) -128);
                class90.field1264.method2202(arg1, -127);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZ)Ljava/lang/String;", line = 636)
    public static final String method1347(int arg0, boolean arg1, int arg2, boolean arg3) {
        field2630++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 && arg0 >= 0) {
            int var4 = 2;
            int var5 = arg0 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg2;
                int var9 = var8 - (arg0 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            if (arg1) {
                return (String) null;
            } else {
                return new String(var6);
            }
        } else {
            return Integer.toString(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Lim;", line = 687)
    public final class183 method1348(int arg0) {
        field2632++;
        class183 var2 = this.field2644;
        if (arg0 > -24) {
            field2640 = (class133) null;
        }
        if (this.field2636 == var2) {
            this.field2644 = null;
            return null;
        } else {
            this.field2644 = var2.field2518;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 746)
    public class192() {
        this.field2636.field2518 = this.field2636;
        this.field2636.field2523 = this.field2636;
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)Z", line = 720)
    public final boolean method1349(int arg0) {
        int var2 = -84 % ((-arg0 - 62) / 58);
        field2626++;
        return this.field2636.field2523 == this.field2636;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Lim;", line = 730)
    public final class183 method1350(byte arg0) {
        field2627++;
        class183 var2 = this.field2636.field2523;
        if (this.field2636 == var2) {
            return null;
        }
        if (arg0 >= -124) {
            method1346(true, -34L);
        }
        var2.method1274((byte) -26);
        return var2;
    }
}

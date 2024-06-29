import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class54 extends class317 {

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "[I")
    public static int[] field723 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "[S")
    public static short[] field722 = new short[500];

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field731 = 0;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    public static int field735 = 0;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "Lkm;")
    public static class133 field719;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Lkm;")
    public static class133 field724;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "[Ltn;")
    private class240[] field733;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method140(int arg0, int arg1) {
        field730++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -119);
        if (arg0 != 542) {
            method375((class316) null, true);
        }
        if (this.field4847.field2751) {
            this.method374(82, this.field4847.method1388(-126));
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V", line = 27)
    public static final void method370(int arg0) {
        class306.field4589.method717((byte) 36);
        field732++;
        if (arg0 < 109) {
            field719 = (class133) null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)V", line = 38)
    public static final void method371(int arg0, int arg1) {
        class139.method1004(class139.field1905, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        field727++;
        class139.method1003(-50.0F, (float) arg0, -50.0F);
        class139.method1008(class139.field1907, 0, false);
        class139.method1002();
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V", line = 50)
    public static final void method372(int arg0) {
        field721++;
        if (arg0 != -13313) {
            field724 = (class133) null;
        }
        for (class134 var1 = (class134) class159.field2178.method1335(arg0 ^ 0xFFFFCBFE); var1 != null; var1 = (class134) class159.field2178.method1336(arg0 + 13316)) {
            class16 var2 = var1.field1853;
            if (class251.field3603 != var2.field180 || var2.field213 < class329.field4966) {
                var1.method1274((byte) -26);
            } else if (class329.field4966 >= var2.field201) {
                if (var2.field202 > 0) {
                    class329 var3 = class42.field484[var2.field202 - 1];
                    if (var3 != null && var3.field3745 >= 0 && var3.field3745 < 13312 && var3.field3679 >= 0 && var3.field3679 < 13312) {
                        var2.method103(class135.method985(var3.field3679, var2.field180, var3.field3745, (byte) -103) - var2.field215, var3.field3679, var3.field3745, 2, class329.field4966);
                    }
                }
                if (var2.field202 < 0) {
                    int var4 = -var2.field202 - 1;
                    class241 var5;
                    if (class306.field4593 == var4) {
                        var5 = class173.field2356;
                    } else {
                        var5 = class169.field2306[var4];
                    }
                    if (var5 != null && var5.field3745 >= 0 && var5.field3745 < 13312 && var5.field3679 >= 0 && var5.field3679 < 13312) {
                        var2.method103(class135.method985(var5.field3679, var2.field180, var5.field3745, (byte) -119) - var2.field215, var5.field3679, var5.field3745, 2, class329.field4966);
                    }
                }
                var2.method101(class287.field4278, arg0 - 670);
                class126.method913(class251.field3603, (int) var2.field204, (int) var2.field217, (int) var2.field186, 60, var2, var2.field187, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V", line = 106)
    public static void method373(int arg0) {
        field724 = null;
        if (arg0 >= -123) {
            field719 = (class133) null;
        }
        field722 = null;
        field719 = null;
        field723 = null;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 119)
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I)V", line = 135)
    private final void method374(int arg0, int[][] arg1) {
        field734++;
        int var3 = class326.field4933;
        int var4 = class340.field5109;
        class208.method1467(arg1, 1);
        class286.method1961(0, class202.field2889, class246.field3548, 0, (byte) -111);
        if (arg0 <= 75 || this.field733 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field733.length; var5++) {
            class240 var6 = this.field733[var5];
            int var7 = var6.field3400;
            int var8 = var6.field3401;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method501(-4621, var3, var4);
                }
            } else if (var8 < 0) {
                var6.method495(var4, var3, 24998);
            } else {
                var6.method499(var4, 6893, var3);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[[I", line = 188)
    public final int[][] method53(int arg0, int arg1) {
        field728++;
        int var3 = -115 % ((arg0 + 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int var5 = class326.field4933;
            int var6 = class340.field5109;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field4840.method1623((byte) 54);
            this.method374(119, var7);
            for (int var9 = 0; var9 < class340.field5109; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; var15 < class326.field4933; var15++) {
                    int var16 = var10[var15];
                    var14[var15] = class47.method303(255, var16) << 4;
                    var13[var15] = class47.method303(var16, 65280) >> 4;
                    var12[var15] = class47.method303(16711680, var16) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lcg;Z)V", line = 244)
    public static final void method375(class316 arg0, boolean arg1) {
        field725++;
        if (arg0.field4798.length - arg0.field4777 < 1) {
            return;
        }
        int var2 = arg0.method2219(16448);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg0.field4798.length - arg0.field4777) {
            return;
        }
        class297.field4401 = arg0.method2219(16448);
        if (class297.field4401 < 1) {
            class297.field4401 = 1;
        } else if (class297.field4401 > 4) {
            class297.field4401 = 4;
        }
        class151.method1102((byte) -127, arg0.method2219(16448) == 1);
        class70.field953 = arg0.method2219(16448) == 1;
        class183.field2517 = arg0.method2219(16448) == 1;
        class218.field3118 = arg0.method2219(16448) == 1;
        class99.field1354 = arg0.method2219(16448) == 1;
        class119.field1610 = arg0.method2219(16448) == 1;
        class185.field2558 = arg0.method2219(16448) == 1;
        class342.field5117 = arg0.method2219(16448) == 1;
        class216.field3091 = arg0.method2219(16448);
        if (class216.field3091 > 2) {
            class216.field3091 = 2;
        }
        if (var2 < 2) {
            class314.field4736 = arg0.method2219(16448) == 1;
            arg0.method2219(16448);
        } else {
            class314.field4736 = arg0.method2219(16448) == 1;
        }
        class131.field1793 = arg0.method2219(16448) == 1;
        class287.field4256 = arg0.method2219(16448) == 1;
        class135.field1866 = arg0.method2219(16448);
        if (class135.field1866 > 2) {
            class135.field1866 = 2;
        }
        class239.field3394 = class135.field1866;
        class72.field1000 = arg0.method2219(16448) == 1;
        class45.field553 = arg0.method2219(16448);
        if (class45.field553 > 127) {
            class45.field553 = 127;
        }
        class83.field1199 = arg0.method2219(16448);
        class224.field3233 = arg0.method2219(16448);
        if (class224.field3233 > 127) {
            class224.field3233 = 127;
        }
        if (var2 >= 1) {
            class253.field3625 = arg0.method2220((byte) 40);
            class61.field810 = arg0.method2220((byte) 98);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method2219(16448);
        }
        if (var2 >= 4) {
            int var4 = arg0.method2219(16448);
            if (class78.field1137 < 96) {
                var4 = 0;
            }
            class265.method1802(var4);
        }
        if (var2 >= 5) {
            class269.field3999 = arg0.method2172((byte) 71);
        }
        if (var2 >= 6) {
            class162.field2230 = arg0.method2219(16448);
        }
        if (!arg1) {
            return;
        }
        if (var2 >= 7) {
            class334.field5045 = arg0.method2219(16448) == 1;
        }
        if (var2 >= 8) {
            class98.field1340 = arg0.method2219(16448) == 1;
        }
        if (var2 >= 9) {
            class96.field1297 = arg0.method2219(16448);
        }
        if (var2 >= 10) {
            class204.field2911 = arg0.method2219(16448) != 0;
        }
        if (var2 >= 11) {
            class296.field4389 = arg0.method2219(16448) != 0;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lcg;II)V", line = 413)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field729++;
        int var4 = 77 / ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field733 = new class240[arg0.method2219(16448)];
            for (int var5 = 0; var5 < this.field733.length; var5++) {
                int var6 = arg0.method2219(16448);
                if (var6 == 0) {
                    this.field733[var5] = class37.method208((byte) -34, arg0);
                } else if (var6 == 1) {
                    this.field733[var5] = class124.method892(arg0, (byte) 14);
                } else if (var6 == 2) {
                    this.field733[var5] = class315.method2149(arg0, 91);
                } else if (var6 == 3) {
                    this.field733[var5] = class35.method201(0, arg0);
                }
            }
        } else if (arg2 == 1) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIIIII)V", line = 489)
    public static final void method376(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field720++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = arg3 - arg4;
        int var11 = 0;
        int var12 = arg7 - arg4;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var10 * var10;
        int var16 = var13 << 1;
        int var17 = var12 * var12;
        int var18 = var14 << 1;
        int var19 = var17 << 1;
        int var20 = var12 << 1;
        int var21 = var15 << 1;
        int var22 = arg7 << 1;
        int var23 = (1 - var22) * var14 + var16;
        int var24 = var13 - ((var22 - 1) * var18);
        int var25 = var14 << 2;
        int var26 = (1 - var20) * var15 + var19;
        int var27 = var17 - ((var20 - 1) * var21);
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = (var22 - 3) * var18;
        int var31 = var16 * 3;
        int var32 = (var20 - 3) * var21;
        int var33 = var28;
        if (!arg0) {
            return;
        }
        int var34 = var17 << 2;
        int var35 = var19 * 3;
        int var36 = (arg7 - 1) * var25;
        int var37 = (var12 - 1) * var29;
        int var38 = var34;
        if (arg6 >= class101.field1397 && class44.field536 >= arg6) {
            int[] var39 = class126.field1723[arg6];
            int var40 = class185.method1299(arg2 - arg3, (byte) 116, class259.field3813, class206.field2952);
            int var41 = class185.method1299(arg2 + arg3, (byte) 110, class259.field3813, class206.field2952);
            int var42 = class185.method1299(arg2 - var10, (byte) 106, class259.field3813, class206.field2952);
            int var43 = class185.method1299(arg2 + var10, (byte) 125, class259.field3813, class206.field2952);
            class190.method1329(var39, var42, arg5, (byte) -102, var40);
            class190.method1329(var39, var43, arg1, (byte) -100, var42);
            class190.method1329(var39, var41, arg5, (byte) -104, var43);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var33;
                    var8++;
                    var23 += var31;
                    var33 += var28;
                    var31 += var28;
                }
            }
            boolean var44 = var9 <= var12;
            if (var24 < 0) {
                var8++;
                var23 += var31;
                var31 += var28;
                var24 += var33;
                var33 += var28;
            }
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var27 += var38;
                        var11++;
                        var26 += var35;
                        var38 += var34;
                        var35 += var34;
                    }
                }
                if (var27 < 0) {
                    var11++;
                    var27 += var38;
                    var26 += var35;
                    var38 += var34;
                    var35 += var34;
                }
                var26 += -var37;
                var37 -= var29;
                var27 += -var32;
                var32 -= var29;
            }
            var9--;
            int var45 = arg6 - var9;
            var24 += -var30;
            var23 += -var36;
            var36 -= var25;
            int var46 = arg6 + var9;
            if (var46 >= class101.field1397 && class44.field536 >= var45) {
                int var47 = class185.method1299(arg2 + var8, (byte) 123, class259.field3813, class206.field2952);
                int var48 = class185.method1299(arg2 - var8, (byte) 109, class259.field3813, class206.field2952);
                if (var44) {
                    int var49 = class185.method1299(arg2 + var11, (byte) 107, class259.field3813, class206.field2952);
                    int var50 = class185.method1299(arg2 - var11, (byte) 110, class259.field3813, class206.field2952);
                    if (var45 >= class101.field1397) {
                        int[] var51 = class126.field1723[var45];
                        class190.method1329(var51, var50, arg5, (byte) -115, var48);
                        class190.method1329(var51, var49, arg1, (byte) -126, var50);
                        class190.method1329(var51, var47, arg5, (byte) -97, var49);
                    }
                    if (class44.field536 >= var46) {
                        int[] var52 = class126.field1723[var46];
                        class190.method1329(var52, var50, arg5, (byte) -82, var48);
                        class190.method1329(var52, var49, arg1, (byte) -120, var50);
                        class190.method1329(var52, var47, arg5, (byte) -125, var49);
                    }
                } else {
                    if (class101.field1397 <= var45) {
                        class190.method1329(class126.field1723[var45], var47, arg5, (byte) -122, var48);
                    }
                    if (var46 <= class44.field536) {
                        class190.method1329(class126.field1723[var46], var47, arg5, (byte) -116, var48);
                    }
                }
            }
            var30 -= var25;
        }
    }
}

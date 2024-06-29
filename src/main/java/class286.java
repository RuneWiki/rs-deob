import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class286 extends class373 {

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "[Lsh;")
    public static class497[] field3868 = new class497[100];

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "[I")
    public static int[] field3869 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "F")
    public static float field3872;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method1714(byte arg0) {
        if (arg0 >= -81) {
            method1717(true, 70, -90, -2, -85);
        }
        field3869 = null;
        field3868 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLpq;)V")
    public static final void method1715(byte arg0, class159 arg1) {
        class213.field2765 = arg1.method1090("p11_full", (byte) 101);
        field3870++;
        if (arg0 < 22) {
            method1714((byte) 24);
        }
        class627.field8529 = arg1.method1090("p12_full", (byte) 8);
        class290.field3886 = arg1.method1090("b12_full", (byte) -112);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLqe;)V")
    public static final void method1716(byte arg0, class122 arg1) {
        field3873++;
        int var2 = 0;
        arg1.method745(8);
        for (int var3 = 0; var3 < class654.field9256; var3++) {
            int var15 = class123.field1595[var3];
            if ((class268.field3675[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class268.field3675[var15] = (byte) class288.method1722(class268.field3675[var15], 2);
                } else {
                    int var16 = arg1.method752(0, 1);
                    if (var16 == 0) {
                        var2 = class653.method3618(arg1, 7);
                        class268.field3675[var15] = (byte) class288.method1722(class268.field3675[var15], 2);
                    } else {
                        class554.method3112(2, arg1, var15);
                    }
                }
            }
        }
        arg1.method751(-111);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method745(8);
        for (int var4 = 0; var4 < class654.field9256; var4++) {
            int var13 = class123.field1595[var4];
            if ((class268.field3675[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class268.field3675[var13] = (byte) class288.method1722(class268.field3675[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method752(0, 1);
                    if (var14 == 0) {
                        var2 = class653.method3618(arg1, 7);
                        class268.field3675[var13] = (byte) class288.method1722(class268.field3675[var13], 2);
                    } else {
                        class554.method3112(2, arg1, var13);
                    }
                }
            }
        }
        arg1.method751(-119);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method745(8);
        for (int var5 = 0; var5 < class9.field81; var5++) {
            int var11 = class547.field7486[var5];
            if ((class268.field3675[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class268.field3675[var11] = (byte) class288.method1722(class268.field3675[var11], 2);
                } else {
                    int var12 = arg1.method752(0, 1);
                    if (var12 == 0) {
                        var2 = class653.method3618(arg1, 7);
                        class268.field3675[var11] = (byte) class288.method1722(class268.field3675[var11], 2);
                    } else if (class566.method3199(var11, arg1, 2)) {
                        class268.field3675[var11] = (byte) class288.method1722(class268.field3675[var11], 2);
                    }
                }
            }
        }
        arg1.method751(-120);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method745(8);
        for (int var6 = 0; var6 < class9.field81; var6++) {
            int var9 = class547.field7486[var6];
            if ((class268.field3675[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class268.field3675[var9] = (byte) class288.method1722(class268.field3675[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method752(0, 1);
                    if (var10 == 0) {
                        var2 = class653.method3618(arg1, 7);
                        class268.field3675[var9] = (byte) class288.method1722(class268.field3675[var9], 2);
                    } else if (class566.method3199(var9, arg1, 2)) {
                        class268.field3675[var9] = (byte) class288.method1722(class268.field3675[var9], 2);
                    }
                }
            }
        }
        arg1.method751(-105);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class9.field81 = 0;
        class654.field9256 = 0;
        if (arg0 <= 54) {
            method1714((byte) -44);
        }
        for (int var7 = 1; var7 < 2048; var7++) {
            class268.field3675[var7] = (byte) (class268.field3675[var7] >> 1);
            class519 var8 = class292.field3912[var7];
            if (var8 == null) {
                class547.field7486[class9.field81++] = var7;
            } else {
                class123.field1595[class654.field9256++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIIII)V")
    public static final void method1717(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3871++;
        if (!arg0 && class690.field9747 == arg4 && class179.field2235 == arg2 && class432.field5993 == class160.field2028 || class72.field935.method1861(class161.field2038, -100)) {
            return;
        }
        class690.field9747 = arg4;
        class160.field2028 = class432.field5993;
        class179.field2235 = arg2;
        if (class72.field935.method1861(class161.field2038, -94)) {
            class160.field2028 = 0;
        }
        class676.method3739(-22149, arg3);
        class82.method463(class243.field3176.method1491(class350.field5121, (byte) 126), class395.field5658, 79, true);
        int var5 = class253.field3490;
        class253.field3490 = (class690.field9747 - (class588.field8082 >> 4)) * 8;
        int var6 = class186.field2280;
        int var7 = -96 / ((arg1 + 80) / 37);
        class186.field2280 = (class179.field2235 - (class12.field113 >> 4)) * 8;
        class19.field179 = class561.method3146(class690.field9747 * 8, class179.field2235 * 8);
        class204.field2673 = null;
        int var8 = class253.field3490 - var5;
        int var9 = class186.field2280 - var6;
        if (arg3 == 11) {
            for (int var10 = 0; var10 < class327.field4786; var10++) {
                class637 var11 = class42.field541[var10];
                if (var11 != null) {
                    class676 var12 = var11.field8702;
                    for (int var13 = 0; var13 < 10; var13++) {
                        var12.field526[var13] -= var8;
                        var12.field516[var13] -= var9;
                    }
                    var12.field3917 -= var9 * 512;
                    var12.field3929 -= var8 * 512;
                }
            }
        } else {
            boolean var14 = false;
            class306.field4106 = 0;
            int var15 = (class588.field8082 - 1) * 512;
            int var16 = class12.field113 * 512 - 512;
            for (int var17 = 0; var17 < class327.field4786; var17++) {
                class637 var30 = class42.field541[var17];
                if (var30 != null) {
                    class676 var31 = var30.field8702;
                    var31.field3929 -= var8 * 512;
                    var31.field3917 -= var9 * 512;
                    if (var31.field3929 >= 0 && var15 >= var31.field3929 && var31.field3917 >= 0 && var16 >= var31.field3917) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field526[var33] -= var8;
                            var31.field516[var33] -= var9;
                            if (var31.field526[var33] < 0 || var31.field526[var33] >= class588.field8082 || var31.field516[var33] < 0 || var31.field516[var33] >= class12.field113) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class690.field9742[class306.field4106++] = var31.field463;
                        } else {
                            var31.method3740(null, -30929);
                            var14 = true;
                            var30.method175(30604);
                        }
                    } else {
                        var31.method3740(null, -30929);
                        var30.method175(30604);
                        var14 = true;
                    }
                }
            }
            if (var14) {
                class327.field4786 = class77.field955.method2505(-5643);
                class77.field955.method2500(23557, class42.field541);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class519 var28 = class292.field3912[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field526[var29] -= var8;
                    var28.field516[var29] -= var9;
                }
                var28.field3917 -= var9 * 512;
                var28.field3929 -= var8 * 512;
            }
        }
        class90[] var19 = class249.field3357;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class90 var27 = var19[var20];
            if (var27 != null) {
                var27.field1098 -= var8 * 512;
                var27.field1105 -= var9 * 512;
            }
        }
        for (class192 var21 = (class192) class234.field3049.method374((byte) 76); var21 != null; var21 = (class192) class234.field3049.method372(-20740)) {
            var21.field2487 -= var9;
            var21.field2493 -= var8;
            if (class429.field5954 != 4 && (var21.field2493 < 0 || var21.field2487 < 0 || var21.field2493 >= class588.field8082 || var21.field2487 >= class12.field113)) {
                var21.method175(30604);
            }
        }
        if (class429.field5954 != 4) {
            for (class397 var22 = (class397) class645.field9141.method2499(-20); var22 != null; var22 = (class397) class645.field9141.method2503(0)) {
                int var23 = (int) (var22.field272 & 0x3FFFL);
                int var24 = var23 - class253.field3490;
                int var25 = (int) (var22.field272 >> 14 & 0x3FFFL);
                int var26 = var25 - class186.field2280;
                if (var24 < 0 || var26 < 0 || class588.field8082 <= var24 || class12.field113 <= var26) {
                    var22.method175(30604);
                }
            }
        }
        if (class436.field6025 != 0) {
            class436.field6025 -= var8;
            class251.field3388 -= var9;
        }
        class65.method392(50);
        if (arg3 != 11) {
            class132.field1679 -= var8 * 512;
            class18.field164 -= var8;
            class329.field4827 -= var9;
            class471.field6379 -= var9 * 512;
            class495.field6699 -= var9;
            class321.field4715 -= var8;
            if (Math.abs(var8) > class588.field8082 || Math.abs(var9) > class12.field113) {
                class399.method2358((byte) 67);
            }
        } else if (class42.field546 == 4) {
            class294.field3939 -= var8 * 512;
            class86.field1068 -= var9 * 512;
            class397.field5667 -= var9 * 512;
            class243.field3277 -= var8 * 512;
        } else {
            class42.field546 = 1;
        }
        class559.method3125(888113385);
        class578.method3254(true);
        class28.field278.method365(-1);
        class283.field3823.method365(-1);
        class565.field7805.method2225(29483);
        class489.method2721(-126);
    }
}

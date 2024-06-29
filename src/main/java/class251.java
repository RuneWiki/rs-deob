import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class251 {

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lka;")
    private class473 field3436 = new class473(64);

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lka;")
    public class473 field3438 = new class473(64);

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Ldk;")
    public class421 field3431;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Ldk;")
    private class421 field3437;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
    public static int[] field3435 = new int[1000];

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lrb;")
    public static class283 field3429 = new class283(80, -1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    public final void method1494(int arg0, boolean arg1) {
        if (!arg1) {
            field3429 = null;
        }
        field3427++;
        class473 var3 = this.field3436;
        synchronized (this.field3436) {
            this.field3436.method2779(14896, arg0);
        }
        class473 var4 = this.field3438;
        synchronized (this.field3438) {
            this.field3438.method2779(14896, arg0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3425++;
        if (arg2 != 3641) {
            method1502(-99, 19, (byte) -28, -110, 3);
        }
        if (!class523.method3109((byte) -65, arg9)) {
            return;
        }
        if (class302.field4121[arg9] == null) {
            client.method3065(class505.field7387[arg9], -1, arg5, arg8, arg0, arg1, arg6, arg3, arg7, arg4);
        } else {
            client.method3065(class302.field4121[arg9], -1, arg5, arg8, arg0, arg1, arg6, arg3, arg7, arg4);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lmv;")
    public final class523 method1496(byte arg0, int arg1) {
        field3426++;
        class473 var3 = this.field3436;
        class523 var4;
        synchronized (this.field3436) {
            var4 = (class523) this.field3436.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field3437;
        byte[] var6;
        synchronized (this.field3437) {
            var6 = this.field3437.method2512(34, (byte) -93, arg1);
        }
        class523 var7 = new class523();
        var7.field7656 = this;
        if (var6 != null) {
            var7.method3113(new class319(var6), (byte) -127);
        }
        class473 var8 = this.field3436;
        synchronized (this.field3436) {
            if (arg0 <= 117) {
                return null;
            } else {
                this.field3436.method2777(-1025, var7, (long) arg1);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method1497(byte arg0) {
        if (arg0 >= -75) {
            field3429 = null;
        }
        field3435 = null;
        field3429 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method1498(int arg0) {
        field3433++;
        class473 var2 = this.field3436;
        synchronized (this.field3436) {
            this.field3436.method2774((byte) -20);
        }
        class473 var3 = this.field3438;
        synchronized (this.field3438) {
            this.field3438.method2774((byte) 115);
        }
        if (arg0 != 0) {
            this.field3436 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public final void method1499(int arg0, int arg1, int arg2) {
        int var4 = 45 % ((-arg2 - 71) / 35);
        this.field3436 = new class473(arg1);
        field3432++;
        this.field3438 = new class473(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public final void method1500(byte arg0) {
        field3428++;
        class473 var2 = this.field3436;
        synchronized (this.field3436) {
            this.field3436.method2764(-769);
        }
        class473 var3 = this.field3438;
        synchronized (this.field3438) {
            this.field3438.method2764(-769);
            if (arg0 < 72) {
                this.method1494(-13, true);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class295.field3991 = arg0;
        class117.field1845 = 0x1 << class295.field3991;
        class392.field5656 = class117.field1845 >> 1;
        class97.field1554 = (int) Math.sqrt((double) (class392.field5656 * class392.field5656 + class392.field5656 * class392.field5656));
        class382.field5488 = class117.field1845 >> 2;
        class445.field6552 = class117.field1845;
        class124.field1916 = arg2;
        class177.field2664 = arg3;
        class282.field3832 = arg4;
        class134.field2046 = new class532[arg1][class124.field1916][class177.field2664];
        class348.field5000 = new class11[arg1];
        if (arg5) {
            class436.field6304 = new int[class124.field1916][class177.field2664];
            class34.field526 = new byte[class124.field1916][class177.field2664];
            class92.field1512 = new short[class124.field1916][class177.field2664];
            class239.field3306 = new class532[1][class124.field1916][class177.field2664];
            class36.field554 = new class11[1];
        } else {
            class436.field6304 = null;
            class34.field526 = null;
            class92.field1512 = null;
            class239.field3306 = null;
            class36.field554 = null;
        }
        if (arg6) {
            class118.field1853 = new long[arg1][arg2][arg3];
            class231.field3229 = new class433[65535];
            class159.field2417 = new boolean[65535];
            class384.field5507 = 0;
        } else {
            class118.field1853 = null;
            class231.field3229 = null;
            class159.field2417 = null;
            class384.field5507 = 0;
        }
        class438.method2590(false);
        class280.field3809 = new class182[1000];
        class349.field5072 = 0;
        class274.field3725 = new class182[1000];
        class113.field1823 = 0;
        class496.field7269 = new int[arg1][class124.field1916 + 1][class177.field2664 + 1];
        class140.field2099 = new class434[5000];
        class265.field3572 = 0;
        class223.field3153 = new boolean[class282.field3832 + class282.field3832 + 1][class282.field3832 + class282.field3832 + 1];
        class18.field280 = new boolean[class282.field3832 + class282.field3832 + 2][class282.field3832 + class282.field3832 + 2];
        class295.field3992 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBII)V")
    public static final void method1502(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (class374 var5 = (class374) class398.field5713.method3137(0); var5 != null; var5 = (class374) class398.field5713.method3132(arg2 ^ 0xFFFFFF98)) {
            class292.method1692(arg4, arg0, arg1, var5, arg3, (byte) -1);
        }
        field3434++;
        for (class374 var6 = (class374) class265.field3566.method3137(0); var6 != null; var6 = (class374) class265.field3566.method3132(0)) {
            byte var11 = 1;
            class495 var12 = var6.field5360.method108(true);
            if (var6.field5360.field247) {
                var11 = 0;
            } else if (var6.field5360.field186 == var12.field7176 || var6.field5360.field186 == var12.field7202 || var6.field5360.field186 == var12.field7172 || var6.field5360.field186 == var12.field7173) {
                var11 = 2;
            } else if (var6.field5360.field186 == var12.field7206 || var6.field5360.field186 == var12.field7186 || var6.field5360.field186 == var12.field7190 || var6.field5360.field186 == var12.field7165) {
                var11 = 3;
            }
            if (var6.field5381 != var11) {
                int var13 = class7.method45(20215, var6.field5360);
                if (var6.field5361 != var13) {
                    if (var6.field5367 != null) {
                        class290.field3924.method298(var6.field5367);
                        var6.field5367 = null;
                    }
                    var6.field5361 = var13;
                }
                var6.field5381 = var11;
            }
            var6.field5370 = var6.field5360.field6284;
            var6.field5380 = var6.field5360.field6284 + (var6.field5360.method116(8569) << 6);
            var6.field5382 = var6.field5360.field6287;
            var6.field5365 = var6.field5360.field6287 + (var6.field5360.method116(arg2 ^ 0xFFFFDEE1) << 6);
            class292.method1692(arg4, arg0, arg1, var6, arg3, (byte) -1);
        }
        class374 var7 = (class374) class481.field6955.method1588(24);
        if (arg2 != -104) {
            field3429 = null;
        }
        while (var7 != null) {
            byte var8 = 1;
            class495 var9 = var7.field5364.method108(true);
            if (var7.field5364.field247) {
                var8 = 0;
            } else if (var7.field5364.field186 == var9.field7176 || var7.field5364.field186 == var9.field7202 || var7.field5364.field186 == var9.field7172 || var7.field5364.field186 == var9.field7173) {
                var8 = 2;
            } else if (var7.field5364.field186 == var9.field7206 || var7.field5364.field186 == var9.field7186 || var7.field5364.field186 == var9.field7190 || var7.field5364.field186 == var9.field7165) {
                var8 = 3;
            }
            if (var7.field5381 != var8) {
                int var10 = class273.method1598(var7.field5364, (byte) 120);
                if (var7.field5361 != var10) {
                    if (var7.field5367 != null) {
                        class290.field3924.method298(var7.field5367);
                        var7.field5367 = null;
                    }
                    var7.field5361 = var10;
                }
                var7.field5381 = var8;
            }
            var7.field5370 = var7.field5364.field6284;
            var7.field5380 = var7.field5364.field6284 + (var7.field5364.method116(8569) << 6);
            var7.field5382 = var7.field5364.field6287;
            var7.field5365 = var7.field5364.field6287 + (var7.field5364.method116(8569) << 6);
            class292.method1692(arg4, arg0, arg1, var7, arg3, (byte) -1);
            var7 = (class374) class481.field6955.method1582(-108);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static final void method1503(boolean arg0) {
        field3430++;
        if (!arg0) {
            field3435 = null;
        }
        if (class76.field1075.method1108(2, class195.field2849) != 2) {
            return;
        }
        byte var1 = (byte) (class367.field5267 - 4 & 0xFF);
        int var2 = class367.field5267 % class9.field111;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class192.field2809; var16++) {
                class398.field5712[var3][var2][var16] = var1;
            }
        }
        if (class366.field5260 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class109.field1770[var4] = -1000000;
            class292.field3953[var4] = 1000000;
            class437.field6310[var4] = 0;
            class278.field3785[var4] = 1000000;
            class325.field4447[var4] = 0;
        }
        if (class247.field3363 != 1) {
            int var15 = class123.method893(class108.field1747, class118.field1848, (byte) -13, class366.field5260);
            if ((var15 - class159.field2421) >= 800 || (class27.field379[class366.field5260][class118.field1848 >> 7][class108.field1747 >> 7] & 0x4) == 0) {
                return;
            }
            class390.method2312(false, 9568256, class108.field1747 >> 7, 1, class118.field1848 >> 7, class103.field1632);
            return;
        }
        if ((class27.field379[class366.field5260][class81.field1158.field6284 >> 7][class81.field1158.field6287 >> 7] & 0x4) != 0) {
            class390.method2312(false, 9568256, class81.field1158.field6287 >> 7, 0, class81.field1158.field6284 >> 7, class103.field1632);
        }
        if (class153.field2357 >= 2560) {
            return;
        }
        int var5 = class118.field1848 >> 7;
        int var6 = class108.field1747 >> 7;
        int var7 = class81.field1158.field6284 >> 7;
        int var8 = class81.field1158.field6287 >> 7;
        int var9;
        if (var5 >= var7) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && -class9.field111 < var9 && class9.field111 > var9 && -class192.field2809 < var10 && var10 < class192.field2809) {
            if (var9 <= var10) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class27.field379[class366.field5260][var5][var6] & 0x4) != 0) {
                        class390.method2312(false, 9568256, var6, 1, var5, class103.field1632);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var7 > var5) {
                            var5++;
                        } else if (var7 < var5) {
                            var5--;
                        }
                        if ((class27.field379[class366.field5260][var5][var6] & 0x4) != 0) {
                            class390.method2312(false, 9568256, var6, 1, var5, class103.field1632);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var5 > var7) {
                    var5--;
                }
                if ((class27.field379[class366.field5260][var5][var6] & 0x4) != 0) {
                    class390.method2312(false, 9568256, var6, 1, var5, class103.field1632);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    var14 -= 65536;
                    if ((class27.field379[class366.field5260][var5][var6] & 0x4) != 0) {
                        class390.method2312(false, 9568256, var6, 1, var5, class103.field1632);
                        return;
                    }
                }
            }
            return;
        }
        class187.method1255(null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class110.field1775 + "," + class399.field5727, -82);
        return;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lad;ILdk;Ldk;)V")
    public class251(class12 arg0, int arg1, class421 arg2, class421 arg3) {
        this.field3431 = arg3;
        this.field3437 = arg2;
        this.field3437.method2509(0, 34);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class216 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lqk;")
    private class202 field3830 = new class202();

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lji;")
    private class40 field3845 = new class40();

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    private int field3843;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    private int field3846;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lti;")
    private class5 field3842;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Loh;")
    public static class263 field3829 = class253.method1681(-128, "blinken3:");

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
    public static int[] field3835 = new int[100];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Loh;")
    public static class263 field3831 = class253.method1681(-121, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[Lui;")
    public static class220[] field3832 = new class220[27];

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Loh;")
    public static class263 field3833 = class253.method1681(-125, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
    public static boolean field3844 = true;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Loh;")
    private static class263 field3841 = class253.method1681(-121, " is already on your friend list)3");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Loh;")
    public static class263 field3825 = field3841;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lfj;")
    public final class241 method1461(int arg0) {
        if (arg0 == 64) {
            field3827++;
            return this.field3842.method38(arg0 + 24108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3836++;
        int var6 = arg4 - arg1;
        int var7 = -71 % ((arg0 + 56) / 56);
        int var8 = arg2 - arg5;
        if (var8 == 0) {
            if (var6 != 0) {
                class168.method1117((byte) -89, arg1, arg4, arg5, arg3);
            }
        } else if (var6 == 0) {
            class29.method190(arg3, arg1, 3, arg5, arg2);
        } else {
            if (var8 < 0) {
                var8 = -var8;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var9 = var8 < var6;
            if (var9) {
                int var10 = arg2;
                int var11 = arg5;
                arg5 = arg1;
                arg1 = var11;
                arg2 = arg4;
                arg4 = var10;
            }
            if (arg2 < arg5) {
                int var12 = arg1;
                int var13 = arg5;
                arg1 = arg4;
                arg5 = arg2;
                arg4 = var12;
                arg2 = var13;
            }
            int var14 = arg1;
            int var15 = arg2 - arg5;
            int var16 = arg4 > arg1 ? 1 : -1;
            int var17 = arg4 - arg1;
            if (var17 < 0) {
                var17 = -var17;
            }
            int var18 = -(var15 >> 1);
            if (var9) {
                for (int var20 = arg5; var20 <= arg2; var20++) {
                    class38.field870[var20][var14] = arg3;
                    var18 += var17;
                    if (var18 > 0) {
                        var14 += var16;
                        var18 -= var15;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg2; var19++) {
                    class38.field870[var14][var19] = arg3;
                    var18 += var17;
                    if (var18 > 0) {
                        var18 -= var15;
                        var14 += var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZJ)V")
    public static final void method1463(boolean arg0, long arg1) {
        field3828++;
        try {
            if (!arg0) {
                field3841 = null;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BJ)Lqk;")
    public final class202 method1464(byte arg0, long arg1) {
        field3838++;
        class202 var4 = (class202) this.field3842.method31(-32665, arg1);
        if (arg0 != 41) {
            field3829 = null;
        }
        if (var4 != null) {
            this.field3845.method253(var4, (byte) 13);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1465(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0) {
            method1471(-51);
        }
        field3826++;
        int var7 = class98.method672(-257, class276.field4831, arg4, class11.field249);
        int var8 = class98.method672(-257, class276.field4831, arg6, class11.field249);
        int var9 = class98.method672(-257, class198.field3587, arg2, class51.field1099);
        int var10 = class98.method672(-257, class198.field3587, arg1, class51.field1099);
        int var11 = class98.method672(-257, class276.field4831, arg3 + arg4, class11.field249);
        int var12 = class98.method672(-257, class276.field4831, arg6 - arg3, class11.field249);
        for (int var13 = var7; var13 < var11; var13++) {
            class191.method1255(var9, arg5, var10, 109, class38.field870[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class191.method1255(var9, arg5, var10, 120, class38.field870[var14]);
        }
        int var15 = class98.method672(-257, class198.field3587, arg2 + arg3, class51.field1099);
        int var16 = class98.method672(-257, class198.field3587, arg1 - arg3, class51.field1099);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class38.field870[var17];
            class191.method1255(var9, arg5, var15, 69, var18);
            class191.method1255(var16, arg5, var10, 82, var18);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1466(byte arg0) {
        for (class266 var1 = (class266) class212.field3797.method38(24172); var1 != null; var1 = (class266) class212.field3797.method36(-124)) {
            int var2 = var1.field4641;
            if (class166.method1090((byte) -125, var2)) {
                boolean var3 = true;
                class21[] var4 = class164.field2974[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field573;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4226;
                    class21 var7 = class8.method55(65535, var6);
                    if (var7 != null) {
                        class220.method1508(var7, (byte) -92);
                    }
                }
            }
        }
        if (arg0 >= -27) {
            method1465(true, 90, -98, 121, -13, 76, -126);
        }
        field3839++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIILnj;Lnj;IIJ)V")
    public static final void method1467(int arg0, int arg1, int arg2, int arg3, class139 arg4, class139 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class22 var10 = new class22();
        var10.field646 = arg8;
        var10.field632 = arg1 * 128 + 64;
        var10.field648 = arg2 * 128 + 64;
        var10.field634 = arg3;
        var10.field633 = arg4;
        var10.field641 = arg5;
        var10.field645 = arg6;
        var10.field636 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class18.field417[var11][arg1][arg2] == null) {
                class18.field417[var11][arg1][arg2] = new class2(var11, arg1, arg2);
            }
        }
        class18.field417[arg0][arg1][arg2].field43 = var10;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lfj;")
    public final class241 method1468(int arg0) {
        field3840++;
        int var2 = 125 % ((-arg0 - 9) / 34);
        return this.field3842.method36(-127);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
    public static final boolean method1469(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class196.field3568; var3++) {
            class253 var4 = class14.field354[var3];
            if (var4.field4408 == 1) {
                int var5 = var4.field4389 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4399 * var5 >> 8) + var4.field4391;
                    int var7 = (var4.field4411 * var5 >> 8) + var4.field4388;
                    int var8 = (var4.field4401 * var5 >> 8) + var4.field4410;
                    int var9 = (var4.field4409 * var5 >> 8) + var4.field4394;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4408 == 2) {
                int var10 = arg0 - var4.field4389;
                if (var10 > 0) {
                    int var11 = (var4.field4399 * var10 >> 8) + var4.field4391;
                    int var12 = (var4.field4411 * var10 >> 8) + var4.field4388;
                    int var13 = (var4.field4401 * var10 >> 8) + var4.field4410;
                    int var14 = (var4.field4409 * var10 >> 8) + var4.field4394;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4408 == 3) {
                int var15 = var4.field4391 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4405 * var15 >> 8) + var4.field4389;
                    int var17 = (var4.field4413 * var15 >> 8) + var4.field4402;
                    int var18 = (var4.field4401 * var15 >> 8) + var4.field4410;
                    int var19 = (var4.field4409 * var15 >> 8) + var4.field4394;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4408 == 4) {
                int var20 = arg2 - var4.field4391;
                if (var20 > 0) {
                    int var21 = (var4.field4405 * var20 >> 8) + var4.field4389;
                    int var22 = (var4.field4413 * var20 >> 8) + var4.field4402;
                    int var23 = (var4.field4401 * var20 >> 8) + var4.field4410;
                    int var24 = (var4.field4409 * var20 >> 8) + var4.field4394;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4408 == 5) {
                int var25 = arg1 - var4.field4410;
                if (var25 > 0) {
                    int var26 = (var4.field4405 * var25 >> 8) + var4.field4389;
                    int var27 = (var4.field4413 * var25 >> 8) + var4.field4402;
                    int var28 = (var4.field4399 * var25 >> 8) + var4.field4391;
                    int var29 = (var4.field4411 * var25 >> 8) + var4.field4388;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public final void method1470(byte arg0) {
        field3834++;
        this.field3845.method257(true);
        if (arg0 != 45) {
            this.field3830 = null;
        }
        this.field3842.method29(43);
        this.field3830 = new class202();
        this.field3846 = this.field3843;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field3829 = null;
        field3835 = null;
        field3831 = null;
        field3841 = null;
        field3825 = null;
        if (arg0 != 8) {
            field3833 = null;
        }
        field3833 = null;
        field3832 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BJLqk;)V")
    public final void method1472(byte arg0, long arg1, class202 arg2) {
        if (this.field3846 == 0) {
            class202 var5 = this.field3845.method255(arg0 ^ 0xFFFFFFE3);
            var5.method1614(arg0 - 1204826897);
            var5.method1401((byte) 27);
            if (this.field3830 == var5) {
                class202 var6 = this.field3845.method255(0);
                var6.method1614(-1204826926);
                var6.method1401((byte) 27);
            }
        } else {
            this.field3846--;
        }
        this.field3842.method33(arg2, arg1, -110);
        this.field3845.method253(arg2, (byte) 13);
        if (arg0 == -29) {
            field3837++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class216(int arg0) {
        this.field3843 = arg0;
        this.field3846 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3842 = new class5(var2);
    }
}

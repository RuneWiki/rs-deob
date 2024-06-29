import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class148 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Z")
    public static boolean field2581 = false;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lda;")
    public static class275 field2583 = class255.method1672(101, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[Lda;")
    public static class275[] field2585 = new class275[200];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[Ltj;")
    public static class270[] field2582 = new class270[0];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lda;")
    public static class275 field2588 = class255.method1672(96, "Nehmen");

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lma;")
    public static class105 field2578;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Llg;")
    public static class266 field2576;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class215.field3655.field1059; var9++) {
            int var10 = class215.field3655.field1068[var9] - class18.field255;
            int var11 = class5.field67 - (class215.field3655.field1069[var9] + -class106.field1841) - 1;
            int var12 = (var10 - arg7) * (arg3 - arg2) / (arg4 - arg7) + arg2;
            int var13 = (arg1 - arg0) * (var11 - arg6) / (arg5 - arg6) + arg0;
            int var14 = 16777215;
            int var15 = class215.field3655.method443((byte) 37, var9);
            class274 var16 = null;
            if (var15 == 0) {
                if ((double) class153.field2683 == 3.0D) {
                    var16 = class91.field1545;
                }
                if ((double) class153.field2683 == 4.0D) {
                    var16 = class108.field1879;
                }
                if ((double) class153.field2683 == 6.0D) {
                    var16 = class11.field165;
                }
                if ((double) class153.field2683 == 8.0D) {
                    var16 = class162.field2831;
                }
            }
            if (var15 == 1) {
                if ((double) class153.field2683 == 3.0D) {
                    var16 = class11.field165;
                }
                if ((double) class153.field2683 == 4.0D) {
                    var16 = class162.field2831;
                }
                if ((double) class153.field2683 == 6.0D) {
                    var16 = class251.field4445;
                }
                if ((double) class153.field2683 == 8.0D) {
                    var16 = class48.field803;
                }
            }
            if (var15 == 2) {
                if ((double) class153.field2683 == 3.0D) {
                    var16 = class251.field4445;
                }
                var14 = 16755200;
                if ((double) class153.field2683 == 4.0D) {
                    var16 = class48.field803;
                }
                if ((double) class153.field2683 == 6.0D) {
                    var16 = class229.field3933;
                }
                if ((double) class153.field2683 == 8.0D) {
                    var16 = class200.field3417;
                }
            }
            if (class215.field3655.field1063[var9] != -1) {
                var14 = class215.field3655.field1063[var9];
            }
            if (var16 != null) {
                class275[] var17 = new class275[class215.field3655.field1061[var9].method1837(true, 60) + 1];
                class5.field73.method134(class215.field3655.field1061[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - (var18 - 1) * var16.method1807() / 2;
                int var20 = var19 + var16.method1802() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class275 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method1815(0, var17[var21].method1838(3) - 4, 0);
                    var16.method1798(var22, var12, var20, var14, true);
                    var20 += var16.method1807();
                }
            }
        }
        if (arg8 != -1) {
            method1049(109);
        }
        field2586++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
    public static final int method1049(int arg0) {
        field2577++;
        return arg0 == 254 ? class36.field591 : 101;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ldj;B)V")
    public static final void method1050(class104 arg0, byte arg1) {
        field2579++;
        if (arg0.field1774 == 0) {
            return;
        }
        if (arg0.field1735 != -1 && arg0.field1735 < 32768) {
            class165 var2 = class31.field478[arg0.field1735];
            if (var2 != null) {
                int var3 = arg0.field1758 - var2.field1758;
                int var4 = arg0.field1770 - var2.field1770;
                if (var4 != 0 || var3 != 0) {
                    arg0.field1773 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1735 >= 32768) {
            int var5 = arg0.field1735 - 32768;
            if (class11.field167 == var5) {
                var5 = 2047;
            }
            class109 var6 = class16.field238[var5];
            if (var6 != null) {
                int var7 = arg0.field1758 - var6.field1758;
                int var8 = arg0.field1770 - var6.field1770;
                if (var8 != 0 || var7 != 0) {
                    arg0.field1773 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 != -31) {
            method1055((byte) -18, true, -116, (class270) null, true, 57, (class270) null);
        }
        if ((arg0.field1742 != 0 || arg0.field1751 != 0) && (arg0.field1791 == 0 || arg0.field1763 > 0)) {
            int var9 = arg0.field1770 - (-(arg0.method750((byte) -106) * 64) - -((-class16.field237 + -class16.field237 + arg0.field1742) * 64)) - 64;
            int var10 = arg0.field1758 + (arg0.method750((byte) -111) - 1) * 64 - ((-class234.field4083 + arg0.field1751 - class234.field4083) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.field1773 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1742 = 0;
            arg0.field1751 = 0;
        }
        int var11 = arg0.field1773 - arg0.field1787 & 0x7FF;
        if (var11 == 0) {
            arg0.field1738 = 0;
            return;
        }
        arg0.field1738++;
        if (var11 > 1024) {
            arg0.field1787 -= arg0.field1774;
            boolean var12 = true;
            if (var11 < arg0.field1774 || var11 > (2048 - arg0.field1774)) {
                arg0.field1787 = arg0.field1773;
                var12 = false;
            }
            if (arg0.field1788 == arg0.field1736 && (arg0.field1738 > 25 || var12)) {
                if (arg0.field1786 == -1) {
                    arg0.field1788 = arg0.field1778;
                } else {
                    arg0.field1788 = arg0.field1786;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field1787 += arg0.field1774;
            if (var11 < arg0.field1774 || 2048 - arg0.field1774 < var11) {
                arg0.field1787 = arg0.field1773;
                var13 = false;
            }
            if (arg0.field1788 == arg0.field1736 && (arg0.field1738 > 25 || var13)) {
                if (arg0.field1750 == -1) {
                    arg0.field1788 = arg0.field1778;
                } else {
                    arg0.field1788 = arg0.field1750;
                }
            }
        }
        arg0.field1787 &= 0x7FF;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIIIIIII)V")
    public static final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg1 - arg5;
        field2584++;
        int var10 = arg2 - arg7;
        int var11 = (arg0 - arg3 << 16) / var10;
        int var12 = (arg6 - arg4 << 16) / var9;
        class44.method265(arg1, arg5, arg4, var12, var11, arg8 - 109, arg3, 0, arg7, arg8, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2580++;
        if ((arg1 - arg2) >= class246.field4355 && arg1 + arg2 <= class96.field1632 && (arg3 - arg2) >= class149.field2603 && class141.field2493 >= arg2 + arg3) {
            class204.method1330(arg0, arg4, arg2, (byte) 116, arg1, arg3, arg6);
        } else {
            class72.method470((byte) 95, arg1, arg0, arg6, arg2, arg4, arg3);
        }
        if (arg5 != 10183) {
            method1054(27L, -123);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method1053(boolean arg0) {
        field2588 = null;
        field2582 = null;
        field2578 = null;
        if (arg0) {
            field2576 = null;
            field2585 = null;
            field2583 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)V")
    public static final void method1054(long arg0, int arg1) {
        class149.field2597.field1392 = 0;
        class149.field2597.method575((byte) 126, 254);
        class149.field2597.method560(arg0, -71);
        class79.field1300 = 1;
        field2587++;
        class52.field872 = 0;
        class179.field3082 = 0;
        class175.field3030 = -3;
        if (arg1 > -118) {
            field2588 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZILtj;ZILtj;)I")
    public static final int method1055(byte arg0, boolean arg1, int arg2, class270 arg3, boolean arg4, int arg5, class270 arg6) {
        field2589++;
        int var7 = class55.method351(arg3, arg0 - 1466660013, arg4, arg6, arg2);
        if (var7 == 0) {
            if (arg0 != -108) {
                method1054(-28L, -100);
            }
            if (arg5 == -1) {
                return 0;
            } else {
                int var8 = class55.method351(arg3, -1466660121, arg1, arg6, arg5);
                return arg1 ? -var8 : var8;
            }
        } else if (arg4) {
            return -var7;
        } else {
            return var7;
        }
    }
}

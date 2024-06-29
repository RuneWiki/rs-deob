import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class36 {

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lb;")
    public class12 field834 = new class12();

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lkh;")
    private static class117 field821 = class224.method1450((byte) 121, "Examine");

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lkh;")
    public static class117 field830 = class224.method1450((byte) 119, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lkh;")
    private static class117 field831 = class224.method1450((byte) 126, "New User");

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lkh;")
    public static class117 field828 = field821;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lkh;")
    public static class117 field826 = field831;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lkh;")
    public static class117 field841 = class224.method1450((byte) 116, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Ljh;")
    public static class106 field825 = new class106();

    @OriginalMember(owner = "client!db", name = "w", descriptor = "[I")
    public static int[] field843 = new int[100];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Lb;")
    private class12 field842;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method313(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class7.field108[var12][var31] = 0;
                class44.field965[var12][var31] = 99999999;
            }
        }
        class7.field108[arg8][arg6] = 99;
        field832++;
        class44.field965[arg8][arg6] = 0;
        int var13 = arg8;
        int var14 = arg6;
        boolean var15 = false;
        int var16 = 0;
        byte var17 = 0;
        class24.field602[var17] = arg8;
        int var32 = var17 + 1;
        class240.field4336[var17] = arg6;
        int[][] var18 = class173.field3123[class203.field3675].field45;
        while (var16 != var32) {
            var14 = class240.field4336[var16];
            var13 = class24.field602[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg1 == var13 && arg4 == var14) {
                var15 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class173.field3123[class203.field3675].method11(arg4, arg2, var14, arg5 - 1, var13, 2, (byte) 72, arg1)) {
                    var15 = true;
                    break;
                }
                if (arg5 < 10 && class173.field3123[class203.field3675].method27(-52, var13, 2, arg5 - 1, arg4, var14, arg2, arg1)) {
                    var15 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg11 != 0 && class173.field3123[class203.field3675].method22(-106, arg11, 2, arg4, var14, arg1, arg10, arg7, var13)) {
                var15 = true;
                break;
            }
            int var30 = class44.field965[var13][var14] + 1;
            if (var13 > 0 && class7.field108[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class24.field602[var32] = var13 - 1;
                class240.field4336[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var13 - 1][var14] = 2;
                class44.field965[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class7.field108[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class24.field602[var32] = var13 + 1;
                class240.field4336[var32] = var14;
                class7.field108[var13 + 1][var14] = 8;
                class44.field965[var13 + 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class7.field108[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class24.field602[var32] = var13;
                class240.field4336[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var13][var14 - 1] = 1;
                class44.field965[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class7.field108[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class24.field602[var32] = var13;
                class240.field4336[var32] = var14 + 1;
                class7.field108[var13][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class44.field965[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class7.field108[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class24.field602[var32] = var13 - 1;
                class240.field4336[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var13 - 1][var14 - 1] = 3;
                class44.field965[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class7.field108[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class24.field602[var32] = var13 + 1;
                class240.field4336[var32] = var14 - 1;
                class7.field108[var13 + 1][var14 - 1] = 9;
                class44.field965[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 102 && class7.field108[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class24.field602[var32] = var13 - 1;
                class240.field4336[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var13 - 1][var14 + 1] = 6;
                class44.field965[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class7.field108[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class24.field602[var32] = var13 + 1;
                class240.field4336[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var13 + 1][var14 + 1] = 12;
                class44.field965[var13 + 1][var14 + 1] = var30;
            }
        }
        class216.field3931 = 0;
        if (!var15) {
            if (!arg0) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg1 - var21; var22 <= arg1 + var21; var22++) {
                for (int var23 = arg4 - var21; var23 <= arg4 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class44.field965[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg1) {
                            var24 = arg1 - var22;
                        } else if (arg1 + arg7 - 1 < var22) {
                            var24 = var22 + 1 - arg7 - arg1;
                        }
                        int var25 = 0;
                        if (var23 < arg4) {
                            var25 = arg4 - var23;
                        } else if (arg11 + arg4 - 1 < var23) {
                            var25 = var23 + 1 - arg4 - arg11;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && var19 > class44.field965[var22][var23]) {
                            var20 = var26;
                            var13 = var22;
                            var19 = class44.field965[var22][var23];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg6 == var14) {
                return false;
            }
            class216.field3931 = 1;
        }
        byte var27 = 0;
        class24.field602[var27] = var13;
        int var33 = var27 + 1;
        class240.field4336[var27] = var14;
        int var28;
        int var29 = var28 = class7.field108[var13][var14];
        while (arg8 != var13 || arg6 != var14) {
            if (var28 != var29) {
                class24.field602[var33] = var13;
                var28 = var29;
                class240.field4336[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class7.field108[var13][var14];
        }
        if (var33 > 0) {
            class103.method692(arg3, class240.field4336, 82, var33, class24.field602);
            return true;
        } else if (arg3 == arg9) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lb;")
    public final class12 method314(byte arg0) {
        class12 var2 = this.field834.field382;
        field839++;
        if (this.field834 == var2) {
            this.field842 = null;
            return null;
        } else if (arg0 == -26) {
            this.field842 = var2.field382;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lb;Lb;Z)V")
    public final void method315(class12 arg0, class12 arg1, boolean arg2) {
        if (arg2) {
            method319(27, 122L);
        }
        if (arg0.field393 != null) {
            arg0.method123((byte) -126);
        }
        arg0.field382 = arg1;
        arg0.field393 = arg1.field393;
        field824++;
        arg0.field393.field382 = arg0;
        arg0.field382.field393 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[Lkh;)Lkh;")
    public static final class117 method316(byte arg0, class117[] arg1) {
        field827++;
        if (arg0 != -34) {
            return null;
        } else if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class90.method630(arg1.length, 0, -109, arg1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method317(int arg0) {
        field828 = null;
        field843 = null;
        field830 = null;
        field825 = null;
        field841 = null;
        field831 = null;
        field821 = null;
        field826 = null;
        if (arg0 != -1) {
            field825 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lb;")
    public final class12 method318(int arg0) {
        field838++;
        class12 var2 = this.field834.field393;
        if (this.field834 == var2) {
            this.field842 = null;
            return null;
        }
        if (arg0 > -33) {
            method313(false, -19, -78, 51, -66, -75, 26, 125, -30, 91, 65, -87);
        }
        this.field842 = var2.field393;
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)V")
    public static final void method319(int arg0, long arg1) {
        field835++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 1) {
            method319(-102, 51L);
        }
        for (int var3 = 0; var3 < class151.field2744; var3++) {
            if (class32.field751[var3] == arg1) {
                class125.field2337++;
                class151.field2744--;
                for (int var4 = var3; var4 < class151.field2744; var4++) {
                    class68.field1301[var4] = class68.field1301[var4 + 1];
                    class99.field1813[var4] = class99.field1813[var4 + 1];
                    class190.field3384[var4] = class190.field3384[var4 + 1];
                    class32.field751[var4] = class32.field751[var4 + 1];
                    class239.field4330[var4] = class239.field4330[var4 + 1];
                    class148.field2706[var4] = class148.field2706[var4 + 1];
                }
                class204.field3688 = class194.field3470;
                class105.field1911.method400(121, 8);
                class105.field1911.method1000((byte) 69, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lb;")
    public final class12 method320(int arg0) {
        field840++;
        if (arg0 != 0) {
            this.method315(null, null, false);
        }
        class12 var2 = this.field842;
        if (this.field834 == var2) {
            this.field842 = null;
            return null;
        } else {
            this.field842 = var2.field382;
            return var2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
    public static final int method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field823++;
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        if (arg3 != 19661112) {
            field821 = null;
        }
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg5 - arg2;
        } else {
            return 8 - arg4 - arg6;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Lb;")
    public final class12 method322(byte arg0) {
        field833++;
        class12 var2 = this.field842;
        if (this.field834 == var2) {
            this.field842 = null;
            return null;
        }
        this.field842 = var2.field393;
        if (arg0 != -105) {
            this.method318(-84);
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILb;)V")
    public final void method323(int arg0, class12 arg1) {
        field822++;
        if (arg1.field393 != null) {
            arg1.method123((byte) -126);
        }
        if (arg0 < -47) {
            arg1.field382 = this.field834.field382;
            arg1.field393 = this.field834;
            arg1.field393.field382 = arg1;
            arg1.field382.field393 = arg1;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public final void method324(int arg0) {
        field837++;
        if (arg0 > -76) {
            return;
        }
        while (true) {
            class12 var2 = this.field834.field382;
            if (this.field834 == var2) {
                return;
            }
            var2.method123((byte) -126);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(ILb;)V")
    public final void method325(int arg0, class12 arg1) {
        field836++;
        if (arg1.field393 != null) {
            arg1.method123((byte) -126);
        }
        if (arg0 > 108) {
            arg1.field393 = this.field834.field393;
            arg1.field382 = this.field834;
            arg1.field393.field382 = arg1;
            arg1.field382.field393 = arg1;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Lb;")
    public final class12 method326(int arg0) {
        class12 var2 = this.field834.field382;
        if (arg0 > -92) {
            this.method314((byte) -46);
        }
        field829++;
        if (this.field834 == var2) {
            return null;
        } else {
            var2.method123((byte) -126);
            return var2;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class36() {
        this.field834.field382 = this.field834;
        this.field834.field393 = this.field834;
    }
}

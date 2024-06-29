import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class195 extends class87 {

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    private int field2874 = -1;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "Z")
    public static boolean field2864 = false;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Lpi;")
    public static class201 field2878 = new class201(64);

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "Lmh;")
    public static class263 field2880 = null;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "Ljava/awt/Frame;")
    public static Frame field2881;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Z")
    public static boolean field2873;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "[I")
    public int[] field2870;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lmh;Z)Lmh;")
    public static final class263 method1377(class263 arg0, boolean arg1) {
        if (arg1) {
            field2881 = null;
        }
        ++field2879;
        if (arg0.field4202 != -1) {
            return class144.method1078(arg0.field4202, 8534);
        } else {
            int var2 = arg0.field4083 >>> 16;
            class196 var3 = new class196(class251.field3793);
            for (class133 var4 = (class133) var3.method1388(-83); var4 != null; var4 = (class133) var3.method1384(-20333)) {
                if (~var4.field2187 == ~var2) {
                    return class144.method1078((int) var4.field4008, 8534);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            this.field2868 = 60;
        }
        ++field2872;
        if (~arg1 == -1) {
            this.field2874 = arg0.method331(-46);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lcc;IIIIIIIZ)V")
    public static final void method1378(class304 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class159.field2479;
        int var11;
        int var12 = var11 = (arg7 << 7) - class141.field2281;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class103.field1792[arg1][arg6][arg7] - class282.field4540;
        int var18 = class103.field1792[arg1][arg6 + 1][arg7] - class282.field4540;
        int var19 = class103.field1792[arg1][arg6 + 1][arg7 + 1] - class282.field4540;
        int var20 = class103.field1792[arg1][arg6][arg7 + 1] - class282.field4540;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class244.field3591;
                        int var46 = (var24 << 9) / var25 + class244.field3598;
                        int var47 = (var27 << 9) / var31 + class244.field3591;
                        int var48 = (var30 << 9) / var31 + class244.field3598;
                        int var49 = (var33 << 9) / var37 + class244.field3591;
                        int var50 = (var36 << 9) / var37 + class244.field3598;
                        int var51 = (var39 << 9) / var43 + class244.field3591;
                        int var52 = (var42 << 9) / var43 + class244.field3598;
                        class244.field3602 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class32.field404 && class229.method1595(class255.field3853 + class244.field3591, class244.field3598 + class232.field3407, var50, var52, var48, var49, var51, var47)) {
                                class147.field2370 = arg6;
                                class302.field4889 = arg7;
                            }
                            if (!arg8) {
                                class244.field3594 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class244.field3586 || var51 > class244.field3586 || var47 > class244.field3586) {
                                    class244.field3594 = true;
                                }
                                if (arg0.field4922 == -1) {
                                    if (arg0.field4912 != 12345678) {
                                        class244.method1681(var50, var52, var48, var49, var51, var47, arg0.field4912, arg0.field4921, arg0.field4913);
                                    }
                                } else if (class69.field1112) {
                                    if (arg0.field4920) {
                                        class244.method1671(var50, var52, var48, var49, var51, var47, arg0.field4912, arg0.field4921, arg0.field4913, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4922);
                                    } else {
                                        class244.method1671(var50, var52, var48, var49, var51, var47, arg0.field4912, arg0.field4921, arg0.field4913, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4922);
                                    }
                                } else {
                                    int var53 = class244.field3600.method531(arg0.field4922, -8362);
                                    class244.method1681(var50, var52, var48, var49, var51, var47, class8.method43(var53, arg0.field4912), class8.method43(var53, arg0.field4921), class8.method43(var53, arg0.field4913));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class32.field404 && class229.method1595(class255.field3853 + class244.field3591, class244.field3598 + class232.field3407, var46, var48, var52, var45, var47, var51)) {
                                class147.field2370 = arg6;
                                class302.field4889 = arg7;
                            }
                            if (!arg8) {
                                class244.field3594 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class244.field3586 || var47 > class244.field3586 || var51 > class244.field3586) {
                                    class244.field3594 = true;
                                }
                                if (arg0.field4922 == -1) {
                                    if (arg0.field4915 != 12345678) {
                                        class244.method1681(var46, var48, var52, var45, var47, var51, arg0.field4915, arg0.field4913, arg0.field4921);
                                        return;
                                    }
                                } else {
                                    if (class69.field1112) {
                                        class244.method1671(var46, var48, var52, var45, var47, var51, arg0.field4915, arg0.field4913, arg0.field4921, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4922);
                                        return;
                                    }
                                    int var54 = class244.field3600.method531(arg0.field4922, -8362);
                                    class244.method1681(var46, var48, var52, var45, var47, var51, class8.method43(var54, arg0.field4915), class8.method43(var54, arg0.field4913), class8.method43(var54, arg0.field4921));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)I")
    public final int method640(int arg0) {
        ++field2867;
        if (arg0 < 59) {
            method1379((byte) -98);
        }
        return this.field2874;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[[I")
    public int[][] method143(int arg0, int arg1) {
        ++field2865;
        if (arg1 != 6) {
            method1383(28, (class270) null);
        }
        int[][] var3 = super.field1390.method1902(arg1 + -122, arg0);
        if (super.field1390.field4428 && this.method1380(10661)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class123.field2045 == this.field2877 ? arg0 : this.field2877 * arg0 / class123.field2045) * this.field2868;
            if (class206.field3032 == this.field2868) {
                for (int var8 = 0; ~var8 > ~class206.field3032; ++var8) {
                    int var9 = this.field2870[var7++];
                    var6[var8] = class301.method2056(255, var9) << 4;
                    var5[var8] = class301.method2056(4080, var9 >> 4);
                    var4[var8] = class301.method2056(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class206.field3032; ++var10) {
                    int var11 = this.field2868 * var10 / class206.field3032;
                    int var12 = this.field2870[var7 - -var11];
                    var6[var10] = class301.method2056(255, var12) << 4;
                    var5[var10] = class301.method2056(65280, var12) >> 4;
                    var4[var10] = class301.method2056(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)Lhc;")
    public static final class53 method1379(byte arg0) {
        ++field2871;
        class53 var1 = new class53(34);
        var1.method360(11, 25759);
        var1.method360(class240.field3525, 25759);
        var1.method360(class79.field1277 ? 1 : 0, 25759);
        var1.method360(class51.field705 ? 1 : 0, 25759);
        var1.method360(class225.field3308 ? 1 : 0, 25759);
        if (arg0 >= -57) {
            return null;
        } else {
            var1.method360(!class56.field817 ? 0 : 1, 25759);
            var1.method360(class207.field3054 ? 1 : 0, 25759);
            var1.method360(class229.field3368 ? 1 : 0, 25759);
            var1.method360(class69.field1112 ? 1 : 0, 25759);
            var1.method360(class22.field247 ? 1 : 0, 25759);
            var1.method360(class74.field1173, 25759);
            var1.method360(!class47.field658 ? 0 : 1, 25759);
            var1.method360(!class294.field4688 ? 0 : 1, 25759);
            var1.method360(!class243.field3577 ? 0 : 1, 25759);
            var1.method360(class77.field1218, 25759);
            var1.method360(!class281.field4536 ? 0 : 1, 25759);
            var1.method360(class208.field3085, 25759);
            var1.method360(class99.field1688, 25759);
            var1.method360(class171.field2582, 25759);
            var1.method376(class79.field1278, false);
            var1.method376(class149.field2388, false);
            var1.method360(class88.method664(), 25759);
            var1.method385(class210.field3109, 455748840);
            var1.method360(class64.field969, 25759);
            var1.method360(!class69.field1110 ? 0 : 1, 25759);
            var1.method360(class299.field4829 ? 1 : 0, 25759);
            var1.method360(class265.field4245, 25759);
            var1.method360(class306.field4942 ? 1 : 0, 25759);
            var1.method360(class32.field398 ? 1 : 0, 25759);
            return var1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)Z")
    public final boolean method1380(int arg0) {
        ++field2869;
        if (this.field2870 != null) {
            return true;
        } else if (this.field2874 >= 0) {
            class148 var2 = class212.field3118 >= 0 ? class309.method2093(class179.field2671, this.field2874, 23048, class212.field3118) : class299.method2036(this.field2874, class179.field2671, false);
            var2.method1095();
            this.field2877 = var2.field1586;
            this.field2870 = var2.field2375;
            this.field2868 = var2.field1585;
            return true;
        } else {
            if (arg0 != 10661) {
                this.field2877 = -101;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBC)I")
    public static final int method1381(int arg0, byte arg1, char arg2) {
        ++field2866;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        int var4 = -51 % ((-13 - arg1) / 32);
        if (arg2 == 241 && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public final void method645(byte arg0) {
        super.method645((byte) -33);
        if (arg0 > -10) {
            this.method645((byte) 30);
        }
        ++field2876;
        this.field2870 = null;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V")
    public static void method1382(byte arg0) {
        field2878 = null;
        field2880 = null;
        if (arg0 <= -122) {
            field2881 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILlc;)V")
    public static final void method1383(int arg0, class270 arg1) {
        ++field2875;
        if (arg0 != 1762) {
            method1383(-33, (class270) null);
        }
    }
}

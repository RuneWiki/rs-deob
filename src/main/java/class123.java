import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class123 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1662 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1666 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lkm;")
    public static class133 field1669;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lkm;")
    public static class133 field1670;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Ldc;")
    public static class75 field1661;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[I")
    public static int[] field1668;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V", line = 8)
    public static final void method884(int arg0, int arg1, int arg2) {
        if (arg1 == 8) {
            arg1 = 4;
        }
        field1665++;
        if (arg1 == 4 && !class131.field1793) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class202.field2895 != arg1) {
            if (class310.field4686) {
                return;
            }
            if (class202.field2895 != 0) {
                class257.field3786[class202.field2895].method30();
            }
            if (arg1 != 0) {
                class177 var3 = class257.field3786[arg1];
                var3.method26();
                var3.method29(arg0);
            }
            class288.field4284 = arg0;
            class202.field2895 = arg1;
        } else if (arg1 != 0 && class288.field4284 != arg0) {
            class257.field3786[arg1].method29(arg0);
            class288.field4284 = arg0;
        }
        int var4 = 119 % ((arg2 - 80) / 46);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lkm;I)V", line = 61)
    public static final void method885(class133 arg0, int arg1) {
        field1659++;
        if (class275.field4130) {
            return;
        }
        if (class67.field908) {
            class102.method749();
        } else {
            class38.method232();
        }
        class290.field4336 = class235.method1620(arg0, (byte) -96, class234.field3313);
        int var2 = class64.field836;
        int var3 = var2 * 956 / 503;
        class290.field4336.method837((class187.field2592 - var3) / 2, 0, var3, var2);
        class103.field1405 = class300.method2036(arg1 + 31449, arg0, class119.field1607);
        class103.field1405.method8(class187.field2592 / 2 - (class103.field1405.field28 / arg1), 18);
        class275.field4130 = true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILin;III)V", line = 85)
    public static final void method886(int arg0, class344 arg1, int arg2, int arg3, int arg4) {
        if (class67.field908) {
            class102.method753(arg2, arg4, arg1.field5334 + arg2, arg1.field5293 + arg4);
        }
        if (arg0 < 59) {
            field1669 = (class133) null;
        }
        if (class72.field996 >= 3) {
            if (class67.field908) {
                class170 var5 = arg1.method2370(true, false);
                if (var5 != null) {
                    var5.method840(arg2, arg4);
                }
            } else {
                class38.method212(arg2, arg4, 0, arg1.field5283, arg1.field5202);
            }
        } else if (class67.field908) {
            ((class328) class241.field3438).method2292(arg2, arg4, arg1.field5334, arg1.field5293, class241.field3438.field2323 / 2, class241.field3438.field2317 / 2, (int) class89.field1257, 256, (class328) arg1.method2370(true, false));
        } else {
            ((class178) class241.field3438).method839(arg2, arg4, arg1.field5334, arg1.field5293, class241.field3438.field2323 / 2, class241.field3438.field2317 / 2, (int) class89.field1257, 256, arg1.field5283, arg1.field5202);
        }
        class304.field4571[arg3] = true;
        field1660++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 126)
    public static final void method887(int arg0) {
        if (arg0 != 13718) {
            field1662 = (String) null;
        }
        field1658++;
        int var1 = class8.field79;
        int var2 = class183.field2524;
        int var3 = class312.field4704;
        byte var4 = 20;
        int var5 = class218.field3131 - 3;
        if (class294.field4371 == null || class61.field809 == null) {
            if (class204.field2948.method961(class333.field5030, (byte) -128) && class204.field2948.method961(class230.field3260, (byte) -128)) {
                class294.field4371 = class157.method1139(0, class333.field5030, class204.field2948, 127);
                class61.field809 = class157.method1139(0, class230.field3260, class204.field2948, arg0 ^ 0xFFFFCA26);
                if (class67.field908) {
                    if ((class294.field4371 instanceof class114)) {
                        class294.field4371 = new class225((class178) class294.field4371);
                    } else {
                        class294.field4371 = new class328((class178) class294.field4371);
                    }
                    if (class61.field809 instanceof class114) {
                        class61.field809 = new class225((class178) class61.field809);
                    } else {
                        class61.field809 = new class328((class178) class61.field809);
                    }
                }
            } else if (class67.field908) {
                class102.method745(var1, var3, var2, var4, class199.field2842, 256 - class246.field3552);
            } else {
                class38.method231(var1, var3, var2, var4, class199.field2842, 256 - class246.field3552);
            }
        }
        if (class294.field4371 != null && class61.field809 != null) {
            int var6 = (var2 - (class61.field809.field2323 * 2)) / class294.field4371.field2323;
            for (int var7 = 0; var7 < var6; var7++) {
                class294.field4371.method840(class294.field4371.field2323 * var7 + var1 + class61.field809.field2323, var3);
            }
            class61.field809.method840(var1, var3);
            class61.field809.method841(var1 + var2 - class61.field809.field2323, var3);
        }
        class204.field2946.method1911(class291.field4342, var1 + 3, var3 - -14, class187.field2588, -1);
        if (class67.field908) {
            class102.method745(var1, var3 + var4, var2, var5 - var4, class199.field2842, 256 - class246.field3552);
        } else {
            class38.method231(var1, var3 + var4, var2, var5 - var4, class199.field2842, 256 - class246.field3552);
        }
        int var8 = class206.field2962;
        int var9 = class282.field4220;
        for (int var10 = 0; var10 < class204.field2938; var10++) {
            int var11 = (class204.field2938 - var10 - 1) * 15 + var3 + var4 + 13;
            if (var1 < var8 && var8 < (var1 + var2) && (var11 - 13) < var9 && var9 < (var11 + 3)) {
                if (class67.field908) {
                    class102.method745(var1, var11 - 12, var2, 15, class270.field4009, 256 - class151.field2100);
                } else {
                    class38.method231(var1, var11 - 12, var2, 15, class270.field4009, 256 - class151.field2100);
                }
            }
        }
        if ((class213.field3076 == null || class249.field3576 == null || class163.field2241 == null) && class204.field2948.method961(class332.field4996, (byte) -128) && class204.field2948.method961(class304.field4573, (byte) -128) && class204.field2948.method961(class132.field1802, (byte) -128)) {
            class213.field3076 = class157.method1139(0, class332.field4996, class204.field2948, arg0 - 13606);
            class249.field3576 = class157.method1139(0, class304.field4573, class204.field2948, 75);
            class163.field2241 = class157.method1139(0, class132.field1802, class204.field2948, -93);
            if (class67.field908) {
                if (class213.field3076 instanceof class114) {
                    class213.field3076 = new class225((class178) class213.field3076);
                } else {
                    class213.field3076 = new class328((class178) class213.field3076);
                }
                if (class249.field3576 instanceof class114) {
                    class249.field3576 = new class225((class178) class249.field3576);
                } else {
                    class249.field3576 = new class328((class178) class249.field3576);
                }
                if (class163.field2241 instanceof class114) {
                    class163.field2241 = new class225((class178) class163.field2241);
                } else {
                    class163.field2241 = new class328((class178) class163.field2241);
                }
            }
        }
        if (class213.field3076 != null && class249.field3576 != null && class163.field2241 != null) {
            int var12 = (var2 - (class163.field2241.field2323 * 2)) / class213.field3076.field2323;
            for (int var13 = 0; var13 < var12; var13++) {
                class213.field3076.method840(class213.field3076.field2323 * var13 + class163.field2241.field2323 + var1, var3 + var5 + -class213.field3076.field2317);
            }
            int var14 = (var5 - class163.field2241.field2317 - var4) / class249.field3576.field2317;
            for (int var15 = 0; var15 < var14; var15++) {
                class249.field3576.method840(var1, class249.field3576.field2317 * var15 + var3 + var4);
                class249.field3576.method841(var1 + var2 - class249.field3576.field2323, class249.field3576.field2317 * var15 + var4 + var3);
            }
            class163.field2241.method840(var1, var5 + var3 - class163.field2241.field2317);
            class163.field2241.method841(var1 + var2 - class163.field2241.field2323, -class163.field2241.field2317 + var3 + var5);
        }
        for (int var16 = 0; var16 < class204.field2938; var16++) {
            int var17 = var3 + var4 + ((class204.field2938 + -1 + -var16) * 15) + 13;
            int var18 = class187.field2588;
            if (var8 > var1 && var8 < var1 + var2 && var17 - 13 < var9 && var9 < (var17 + 3)) {
                var18 = class157.field2171;
            }
            class204.field2946.method1911(class51.method353(122, var16), var1 + 3, var17, var18, 0);
        }
        class279.method1934(class312.field4704, -126, class218.field3131, class8.field79, class183.field2524);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 305)
    public static void method888(int arg0) {
        field1662 = null;
        field1669 = null;
        field1670 = null;
        field1661 = null;
        if (arg0 == 20986) {
            field1668 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 322)
    public static final void method889(byte arg0) {
        if (arg0 < -7) {
            class326.field4932.method724(0);
            class251.field3600.method724(0);
            class306.field4591.method724(0);
            field1663++;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 339)
    public static final String method890(byte arg0, int arg1) {
        field1667++;
        if (arg0 != 72) {
            method889((byte) -86);
        }
        return arg1 < 999999999 ? Integer.toString(arg1) : "*";
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V", line = 356)
    public static final void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1664++;
        if (class269.method1854((byte) -112, arg3)) {
            client.method824(class241.field3419[arg3], -1, arg5, arg2, arg6, arg0, arg7, arg4);
            int var8 = -15 / ((-arg1 - 60) / 34);
        }
    }
}

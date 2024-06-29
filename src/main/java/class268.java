import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class268 extends class88 {

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field4760 = 0;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field4763 = 0;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field4767 = 20;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field4773 = 0;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "[Lhj;")
    public static class69[] field4764 = new class69[8];

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field4775 = 0;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public int field4765;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public int field4776;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "Lma;")
    public static class183 field4766;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[Lqb;")
    public static class56[] field4769;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static final void method1842(byte arg0) {
        field4774++;
        if (arg0 != 42) {
            field4769 = null;
        }
        int var1 = class51.field911.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class51.field911[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class110.field2098; var4++) {
                    if (class245.field4486[var2] == class151.field2793[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class151.field2793[class110.field2098] = class245.field4486[var2];
                    var3 = class110.field2098++;
                }
                class128 var5 = new class128(class51.field911[var2]);
                int var6 = 0;
                while (class51.field911[var2].length > var5.field2379 && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method912(103);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class245.field4486[var2] >> 8) * 64 + var10 - class242.field4441;
                    int var13 = (class245.field4486[var2] & 0xFF) * 64 + var11 - class220.field3962;
                    class186 var14 = class62.method386((byte) 95, var5.method912(arg0 - 125));
                    if (class131.field2428[var7] == null && (var14.field3406 & 0x1) > 0 && class97.field1811 == var9 && var12 >= 0 && (var14.field3359 + var12) < 104 && var13 >= 0 && var14.field3359 + var13 < 104) {
                        class131.field2428[var7] = new class38();
                        class38 var15 = class131.field2428[var7];
                        class245.field4490[class46.field659++] = var7;
                        var15.field4041 = class180.field3272;
                        var15.field517 = var14;
                        var15.method1578(var15.field517.field3359, (byte) 73);
                        var15.field4049 = var15.field517.field3383;
                        var15.field3982 = var15.field517.field3353;
                        var15.field4026 = var15.field517.field3350;
                        var15.field4045 = var15.field517.field3361;
                        var15.field4054 = var15.field517.field3374;
                        var15.field3999 = var15.field517.field3401;
                        var15.field3984 = var15.field517.field3398;
                        if (var15.field3984 == 0) {
                            var15.field4003 = 0;
                        }
                        var15.field4018 = var15.field517.field3408;
                        var15.method1574(true, var13, var12, var15.method813(15963), 57);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public static final void method1843(int arg0, int arg1, int arg2) {
        if (arg2 < 92) {
            method1846(false, -87);
        }
        if (class81.field1554 != 0 && arg0 != -1) {
            class83.method616(false, class212.field3845, (byte) 27, arg0, 0, class81.field1554);
            class119.field2251 = true;
        }
        field4771++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lhj;")
    public static final class69 method1844(int arg0, int arg1) {
        field4770++;
        class69 var2 = class98.method727(arg0 + 14352, arg1);
        if (arg0 != -14581) {
            return null;
        }
        for (int var3 = var2.method441((byte) 73) - 3; var3 > 0; var3 -= 3) {
            var2 = class9.method42(-112, new class69[] { var2.method485(var3, 0, (byte) -20), class215.field3894, var2.method478(-96, var3) });
        }
        if (var2.method441((byte) 73) > 9) {
            return class9.method42(arg0 + 14462, new class69[] { class223.field4071, var2.method485(var2.method441((byte) 73) + -8, 0, (byte) -20), class271.field4802, class229.field4198, var2, class128.field2390 });
        } else if (var2.method441((byte) 73) > 6) {
            return class9.method42(arg0 + 14699, new class69[] { class217.field3921, var2.method485(var2.method441((byte) 73) + -4, 0, (byte) -20), client.field2824, class229.field4198, var2, class128.field2390 });
        } else {
            return class9.method42(arg0 + 14470, new class69[] { class34.field478, var2, class242.field4439 });
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static void method1845(int arg0) {
        field4766 = null;
        field4764 = null;
        if (arg0 < 106) {
            field4772 = 22;
        }
        field4769 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)V")
    public static final void method1846(boolean arg0, int arg1) {
        field4768++;
        if (arg1 != 1) {
            field4775 = 55;
        }
        for (class175 var2 = (class175) class59.field1067.method1724(arg1 + 254); var2 != null; var2 = (class175) class59.field1067.method1726(124)) {
            if (var2.field3197 != null) {
                class54.field959.method1788(var2.field3197);
                var2.field3197 = null;
            }
            if (var2.field3203 != null) {
                class54.field959.method1788(var2.field3203);
                var2.field3203 = null;
            }
            var2.method632(arg1 ^ 0xFFFFDF99);
        }
        if (!arg0) {
            return;
        }
        for (class175 var3 = (class175) class94.field1751.method1724(255); var3 != null; var3 = (class175) class94.field1751.method1726(arg1 ^ 0x6B)) {
            if (var3.field3197 != null) {
                class54.field959.method1788(var3.field3197);
                var3.field3197 = null;
            }
            var3.method632(-8296);
        }
        for (class175 var4 = (class175) class208.field3780.method768((byte) 28); var4 != null; var4 = (class175) class208.field3780.method760(arg1 - 15726)) {
            if (var4.field3197 != null) {
                class54.field959.method1788(var4.field3197);
                var4.field3197 = null;
            }
            var4.method632(arg1 - 8297);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)I")
    public static final int method1847(int arg0, int arg1, int arg2, int arg3) {
        field4758++;
        int var4 = arg1 & 0x3;
        if (arg3 != 0) {
            field4766 = null;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}

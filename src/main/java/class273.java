import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class273 {

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lmc;")
    private class197 field4829 = new class197();

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    private int field4831;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    private int field4821;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lbg;")
    private class237 field4819;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Loa;")
    public static class99 field4822 = class99.method658(-119, 160);

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Loa;")
    public static class99 field4834 = class221.method1463(2844, "http:)4)4");

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[[[B")
    public static byte[][][] field4825;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V")
    public final void method1809(int arg0, byte arg1) {
        int var3 = 33 % ((45 - arg1) / 34);
        field4820++;
        if (class150.field2634 == null) {
            return;
        }
        for (class194 var4 = (class194) this.field4829.method1325(86); var4 != null; var4 = (class194) this.field4829.method1326(-123)) {
            if (var4.method53((byte) 67)) {
                if (var4.method52((byte) -55) == null) {
                    var4.method828((byte) -85);
                    var4.method1346(122);
                    this.field4821++;
                }
            } else if ((++var4.field3476) > ((long) arg0)) {
                class194 var5 = class150.field2634.method722(var4, 123);
                this.field4819.method1544((byte) -66, var4.field2187, var5);
                class97.method646(var5, 30796, var4);
                var4.method828((byte) 124);
                var4.method1346(126);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IJ)V")
    public final void method1810(int arg0, long arg1) {
        field4827++;
        if (arg0 >= -101) {
            return;
        }
        class194 var4 = (class194) this.field4819.method1550(true, arg1);
        if (var4 != null) {
            var4.method828((byte) 123);
            var4.method1346(124);
            this.field4821++;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1811(long arg0, int arg1) {
        field4818++;
        class194 var4 = (class194) this.field4819.method1550(true, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method52((byte) 103);
        int var6 = 94 / ((arg1 + 17) / 35);
        if (var5 == null) {
            var4.method828((byte) 122);
            var4.method1346(125);
            this.field4821++;
            return null;
        }
        if (var4.method53((byte) 67)) {
            class205 var7 = new class205(var5);
            this.field4819.method1544((byte) -79, var4.field2187, var7);
            this.field4829.method1323(-27664, var7);
            var7.field3476 = 0L;
            var4.method828((byte) -50);
            var4.method1346(-117);
        } else {
            this.field4829.method1323(-27664, var4);
            var4.field3476 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method1812(int arg0) {
        this.field4829.method1322(false);
        field4826++;
        this.field4819.method1551((byte) 14);
        this.field4821 = this.field4831;
        if (arg0 > -70) {
            field4822 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public final void method1813(int arg0) {
        for (class194 var2 = (class194) this.field4829.method1325(118); var2 != null; var2 = (class194) this.field4829.method1326(arg0 ^ 0x30)) {
            if (var2.method53((byte) 67)) {
                var2.method828((byte) -49);
                var2.method1346(16);
                this.field4821++;
            }
        }
        if (arg0 != -1) {
            this.method1812(97);
        }
        field4816++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
    public final int method1814(byte arg0) {
        int var2 = 0;
        for (class194 var3 = (class194) this.field4829.method1325(-74); var3 != null; var3 = (class194) this.field4829.method1326(arg0 - 105)) {
            if (!var3.method53((byte) 67)) {
                var2++;
            }
        }
        if (arg0 == 23) {
            field4817++;
            return var2;
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public static void method1815(byte arg0) {
        field4822 = null;
        field4825 = null;
        field4834 = null;
        if (arg0 <= 105) {
            method1816((class78) null, 67, -86, 6, -98, 55, -28, -105, false);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lph;IIIIIIIZ)V")
    public static final void method1816(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class260.field4540;
        int var11;
        int var12 = var11 = (arg7 << 7) - class163.field2869;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class189.field3337[arg1][arg6][arg7] - class240.field4154;
        int var18 = class189.field3337[arg1][arg6 + 1][arg7] - class240.field4154;
        int var19 = class189.field3337[arg1][arg6 + 1][arg7 + 1] - class240.field4154;
        int var20 = class189.field3337[arg1][arg6][arg7 + 1] - class240.field4154;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class134.field2337;
        int var46 = (var24 << 9) / var25 + class134.field2347;
        int var47 = (var27 << 9) / var31 + class134.field2337;
        int var48 = (var30 << 9) / var31 + class134.field2347;
        int var49 = (var33 << 9) / var37 + class134.field2337;
        int var50 = (var36 << 9) / var37 + class134.field2347;
        int var51 = (var39 << 9) / var43 + class134.field2337;
        int var52 = (var42 << 9) / var43 + class134.field2347;
        class134.field2334 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class281.field4917 && class244.method1581(class134.field2337 + class100.field1718, class196.field3413 + class134.field2347, var50, var52, var48, var49, var51, var47)) {
                class206.field3570 = arg6;
                class261.field4598 = arg7;
            }
            if (!arg8) {
                class134.field2340 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class134.field2345 || var51 > class134.field2345 || var47 > class134.field2345) {
                    class134.field2340 = true;
                }
                if (arg0.field1378 == -1) {
                    if (arg0.field1389 != 12345678) {
                        class134.method911(var50, var52, var48, var49, var51, var47, arg0.field1389, arg0.field1376, arg0.field1387);
                    }
                } else if (!class186.field3294) {
                    int var53 = class134.field2338.method836(arg0.field1378, 11775);
                    class134.method911(var50, var52, var48, var49, var51, var47, class165.method1110(var53, arg0.field1389), class165.method1110(var53, arg0.field1376), class165.method1110(var53, arg0.field1387));
                } else if (arg0.field1384) {
                    class134.method901(var50, var52, var48, var49, var51, var47, arg0.field1389, arg0.field1376, arg0.field1387, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1378);
                } else {
                    class134.method901(var50, var52, var48, var49, var51, var47, arg0.field1389, arg0.field1376, arg0.field1387, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1378);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class281.field4917 && class244.method1581(class134.field2337 + class100.field1718, class196.field3413 + class134.field2347, var46, var48, var52, var45, var47, var51)) {
            class206.field3570 = arg6;
            class261.field4598 = arg7;
        }
        if (arg8) {
            return;
        }
        class134.field2340 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class134.field2345 || var47 > class134.field2345 || var51 > class134.field2345) {
            class134.field2340 = true;
        }
        if (arg0.field1378 != -1) {
            if (class186.field3294) {
                class134.method901(var46, var48, var52, var45, var47, var51, arg0.field1382, arg0.field1387, arg0.field1376, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1378);
                return;
            }
            int var54 = class134.field2338.method836(arg0.field1378, 11775);
            class134.method911(var46, var48, var52, var45, var47, var51, class165.method1110(var54, arg0.field1382), class165.method1110(var54, arg0.field1387), class165.method1110(var54, arg0.field1376));
        } else if (arg0.field1382 != 12345678) {
            class134.method911(var46, var48, var52, var45, var47, var51, arg0.field1382, arg0.field1387, arg0.field1376);
            return;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
    public class273(int arg0) {
        this.field4831 = arg0;
        this.field4821 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4819 = new class237(var2);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method1817(long arg0, int arg1, Object arg2) {
        field4824++;
        this.method1810(-106, arg0);
        if (this.field4821 == 0) {
            class194 var5 = (class194) this.field4829.method1329((byte) 52);
            var5.method828((byte) 121);
            var5.method1346(-37);
        } else {
            this.field4821--;
        }
        class205 var6 = new class205(arg2);
        if (arg1 == 16) {
            this.field4819.method1544((byte) 106, arg0, var6);
            this.field4829.method1323(-27664, var6);
            var6.field3476 = 0L;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
    public static final void method1818(int arg0, boolean arg1) {
        field4833++;
        class152.field2671 = arg1;
        class78.field1377 = !class139.method951(436421925);
        if (arg0 >= -110) {
            method1816((class78) null, 40, -48, 124, 111, -10, 23, 92, false);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLtg;)V")
    public static final void method1819(byte arg0, class182 arg1) {
        class248.field4278 = arg1;
        field4832++;
        if (arg0 != -16) {
            field4834 = null;
        }
    }
}

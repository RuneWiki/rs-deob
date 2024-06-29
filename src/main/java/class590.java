import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class590 {

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public int field8542 = 16777215;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public int field8552 = 8;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "[I")
    public static int[] field8557 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "Lmq;")
    public static class472 field8545 = new class472(10);

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    public static int field8558 = 64;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public int field8547;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public int field8548;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public int field8549;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    public int field8555;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public int field8556;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Lrm;")
    public static class377 field8544;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Z")
    public boolean field8551;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3423(int arg0) {
        field8546++;
        for (int var1 = 0; var1 < class244.field3334; var1++) {
            class68 var3 = class465.field6487[var1];
            boolean var4 = false;
            if (var3.field1046 == null) {
                var3.field1041--;
                if (var3.field1041 >= (var3.method623(-1) ? -1500 : -10)) {
                    if (var3.field1047 == 1 && var3.field1054 == null) {
                        var3.field1054 = class319.method1858(class538.field7834, var3.field1043, 0);
                        if (var3.field1054 == null) {
                            continue;
                        }
                        var3.field1041 += var3.field1054.method1859();
                    } else if (var3.method623(-1) && (var3.field1040 == null || var3.field1042 == null)) {
                        if (var3.field1040 == null) {
                            var3.field1040 = class476.method2795(class166.field2040, var3.field1043);
                        }
                        if (var3.field1040 == null) {
                            continue;
                        }
                        if (var3.field1042 == null) {
                            var3.field1042 = var3.field1040.method2798(new int[] { 22050 });
                            if (var3.field1042 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field1041 < 0) {
                        short var5 = 8192;
                        int var7;
                        if (var3.field1049 == 0) {
                            var7 = (var3.field1047 == 3 ? class221.field2851.field4176 : class221.field2851.field4155) * var3.field1039 >> 2;
                        } else {
                            int var6 = var3.field1049 >> 24 & 0x3;
                            if (class206.field2472.field532 == var6) {
                                int var8 = (var3.field1049 & 0xFF) << 9;
                                int var9 = class206.field2472.method1284((byte) -124) << 8;
                                int var10 = var3.field1049 >> 16 & 0xFF;
                                int var11 = (var10 << 9) + var9 - (-256 - -class206.field2472.field530);
                                int var12 = var3.field1049 >> 8 & 0xFF;
                                int var13 = (var12 << 9) + var9 + 256 - class206.field2472.field531;
                                int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                if (var8 < var14) {
                                    var3.field1041 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var7 = class221.field2851.field4134 * var3.field1039 * (var8 - var14) / var8 >> 2;
                                if (var3.field1053 != null && var3.field1053 instanceof class43) {
                                    class43 var15 = (class43) var3.field1053;
                                    short var16 = var15.field768;
                                    short var17 = var15.field769;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class387 var18 = null;
                            if (var3.field1047 == 1) {
                                var18 = var3.field1054.method1860().method2215(class678.field9726);
                            } else if (var3.method623(-1)) {
                                var18 = var3.field1042;
                            }
                            class360 var19 = var3.field1046 = class360.method2044(var18, var3.field1048, var7, var5);
                            var19.method2036(var3.field1044 - 1);
                            class399.field5624.method1802(var19);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field1046.method3047(32)) {
                var4 = true;
            }
            if (var4) {
                class244.field3334--;
                for (int var20 = var1; var20 < class244.field3334; var20++) {
                    class465.field6487[var20] = class465.field6487[var20 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -512) {
            method3423(-127);
        }
        if (class621.field8895 && !class501.method2913(61)) {
            if (class221.field2851.field4158 != 0 && class584.field8487 != -1) {
                if (class548.field7961 == null) {
                    class521.method3088(class221.field2851.field4158, arg0 ^ 0x1B7, false, class275.field3764, class584.field8487, 0);
                } else {
                    class589.method3417(class548.field7961, class221.field2851.field4158, 26, 0, class275.field3764, false, class584.field8487);
                }
            }
            class548.field7961 = null;
            class621.field8895 = false;
        } else if (class221.field2851.field4158 != 0 && class584.field8487 != -1 && !class501.method2913(63)) {
            class37.field694++;
            class543 var2 = class299.method1780(class84.field1196, class596.field8610, 52);
            var2.field7872.method2233((byte) 74, class584.field8487);
            class511.method3028(7482, var2);
            class584.field8487 = -1;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLio;ZIIILio;)I", line = 211)
    public static final int method3424(boolean arg0, class404 arg1, boolean arg2, int arg3, int arg4, int arg5, class404 arg6) {
        field8550++;
        int var7 = class627.method3605((byte) 110, arg1, arg0, arg3, arg6);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            if (arg5 < 111) {
                method3424(false, null, true, -58, 124, 40, null);
            }
            int var8 = class627.method3605((byte) 110, arg1, arg2, arg4, arg6);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lun;II)V", line = 249)
    private final void method3425(class389 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field8552 = arg0.method2260(-99);
        } else if (arg2 == 2) {
            this.field8551 = true;
        } else if (arg2 == 3) {
            this.field8555 = arg0.method2270((byte) 71);
            this.field8547 = arg0.method2270((byte) 71);
            this.field8548 = arg0.method2270((byte) 71);
        } else if (arg2 == 4) {
            this.field8549 = arg0.method2229(255);
        } else if (arg2 == 5) {
            this.field8556 = arg0.method2260(-123);
        } else if (arg2 == 6) {
            this.field8542 = arg0.method2258(-3);
        }
        int var4 = 46 % ((62 - arg1) / 39);
        field8543++;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Lmt;", line = 295)
    public static final class364 method3426(byte arg0) {
        int var1 = 9 % ((-arg0 - 64) / 50);
        field8553++;
        return class601.field8666;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILun;)V", line = 305)
    public final void method3427(int arg0, class389 arg1) {
        if (arg0 != 0) {
            this.field8547 = -101;
        }
        field8554++;
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                return;
            }
            this.method3425(arg1, 121, var3);
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)V", line = 336)
    public static void method3428(byte arg0) {
        field8557 = null;
        field8544 = null;
        if (arg0 >= -66) {
            method3424(false, null, true, 93, -26, -42, null);
        }
        field8545 = null;
    }
}

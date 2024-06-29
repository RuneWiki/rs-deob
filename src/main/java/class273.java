import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class273 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[Lwa;")
    private class279[] field4227;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4228 = "red:";

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 7)
    public static void method1920(byte arg0) {
        int var1 = -89 % ((arg0 + 38) / 63);
        field4228 = null;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I)V", line = 23)
    public class273(int arg0) {
        this.field4227 = new class279[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class279 var3 = this.field4227[var2] = new class279();
            var3.field4299 = var3;
            var3.field4295 = var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 52)
    public static final void method1921(int arg0) {
        field4232++;
        if (arg0 != 11) {
            field4228 = (String) null;
        }
        class9.field169.method1355(false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILvl;)V", line = 64)
    public static final void method1922(int arg0, class6 arg1) {
        field4226++;
        if ((arg1.field115.length - arg1.field111) < 1) {
            return;
        }
        int var2 = arg1.method58(-288140008);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field115.length - arg1.field111) {
            return;
        }
        class326.field5123 = arg1.method58(-288140008);
        if (class326.field5123 < 1) {
            class326.field5123 = 1;
        } else if (class326.field5123 > 4) {
            class326.field5123 = 4;
        }
        class80.method590(true, arg1.method58(-288140008) == 1);
        class317.field5019 = arg1.method58(-288140008) == 1;
        class99.field1334 = arg1.method58(-288140008) == 1;
        class206.field3280 = arg1.method58(arg0 - 288155576) == 1;
        class187.field3018 = arg1.method58(-288140008) == 1;
        class47.field622 = arg1.method58(arg0 ^ 0xEED369C8) == 1;
        class14.field240 = arg1.method58(-288140008) == 1;
        class95.field1259 = arg1.method58(-288140008) == 1;
        if (arg0 != 15568) {
            method1920((byte) -68);
        }
        class27.field399 = arg1.method58(-288140008);
        if (class27.field399 > 2) {
            class27.field399 = 2;
        }
        if (var2 < 2) {
            class220.field3482 = arg1.method58(arg0 ^ 0xEED369C8) == 1;
            arg1.method58(arg0 - 288155576);
        } else {
            class220.field3482 = arg1.method58(arg0 ^ 0xEED369C8) == 1;
        }
        class71.field985 = arg1.method58(-288140008) == 1;
        class198.field3163 = arg1.method58(-288140008) == 1;
        class48.field635 = arg1.method58(-288140008);
        if (class48.field635 > 2) {
            class48.field635 = 2;
        }
        class196.field3127 = class48.field635;
        class86.field1164 = arg1.method58(arg0 - 288155576) == 1;
        class144.field2277 = arg1.method58(-288140008);
        if (class144.field2277 > 127) {
            class144.field2277 = 127;
        }
        class204.field3233 = arg1.method58(-288140008);
        class10.field183 = arg1.method58(-288140008);
        if (class10.field183 > 127) {
            class10.field183 = 127;
        }
        if (var2 >= 1) {
            class202.field3214 = arg1.method39((byte) 49);
            class180.field2926 = arg1.method39((byte) 73);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method58(-288140008);
        }
        if (var2 >= 4) {
            int var4 = arg1.method58(arg0 ^ 0xEED369C8);
            if (class234.field3641 < 96) {
                var4 = 0;
            }
            class151.method1105(var4);
        }
        if (var2 >= 5) {
            class332.field5180 = arg1.method73((byte) 19);
        }
        if (var2 >= 6) {
            class232.field3630 = arg1.method58(-288140008);
        }
        if (var2 >= 7) {
            class36.field523 = arg1.method58(-288140008) == 1;
        }
        if (var2 >= 8) {
            class82.field1124 = arg1.method58(arg0 - 288155576) == 1;
        }
        if (var2 >= 9) {
            class101.field1351 = arg1.method58(-288140008);
        }
        if (var2 >= 10) {
            class163.field2648 = arg1.method58(-288140008) != 0;
        }
        if (var2 >= 11) {
            class245.field3828 = arg1.method58(-288140008) != 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 227)
    public static final void method1923(int arg0) {
        field4230++;
        if (arg0 != -8522) {
            method1923(11);
        }
        class269.field4182 = new class136[class57.field795.method1810(0)][];
        class34.field505 = new boolean[class57.field795.method1810(0)];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V", line = 244)
    public static final void method1924(int arg0, int arg1) {
        class34 var2 = class91.method656(arg0, -2, 5);
        field4233++;
        if (arg1 != 32) {
            method1923(-37);
        }
        var2.method306(13);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLmc;IIIZZBI)Luj;", line = 264)
    public static final class169 method1925(boolean arg0, class55 arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, byte arg7, int arg8) {
        field4229++;
        class316 var9 = class149.method1092((byte) -104, arg8);
        if (arg4 > 1 && var9.field4972 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field4999[var11] && var9.field4999[var11] != 0) {
                    var10 = var9.field4972[var11];
                }
            }
            if (var10 != -1) {
                var9 = class149.method1092((byte) -104, var10);
            }
        }
        class53 var12 = var9.method2212(23231, arg1);
        if (var12 == null) {
            return null;
        }
        class190 var13 = null;
        if (var9.field4996 != -1) {
            var13 = (class190) method1925(true, arg1, 1, 0, 10, false, true, (byte) -67, var9.field4958);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field4947 != -1) {
            var13 = (class190) method1925(true, arg1, arg2, arg3, arg4, false, false, (byte) 100, var9.field4956);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class280.field4310;
        int var15 = class280.field4307;
        int var16 = class280.field4303;
        int[] var17 = new int[4];
        class280.method1966(var17);
        class190 var18 = new class190(36, 32);
        class280.method1983(var18.field3038, 36, 32);
        class31.method277();
        class31.method291(16, 16);
        int var19 = var9.field4989;
        if (arg6) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class31.field459 = false;
        int var20 = class31.field467[var9.field5002] * var19 >> 16;
        int var21 = class31.field451[var9.field5002] * var19 >> 16;
        var12.method402(0, var9.field5007, var9.field4965, var9.field5002, var9.field5001, (var20 + var9.field5009) - (var12.method397() / 2), var9.field5009 + var21, -1L);
        if (arg2 >= 1) {
            var18.method1397(1);
            if (arg2 >= 2) {
                var18.method1397(16777215);
            }
            class280.method1983(var18.field3038, 36, 32);
        }
        if (arg3 != 0) {
            var18.method1398(arg3);
        }
        if (var9.field4996 != -1) {
            var13.method1273(0, 0);
        } else if (var9.field4947 != -1) {
            class280.method1983(var13.field3038, 36, 32);
            var18.method1273(0, 0);
            var18 = var13;
        }
        if (arg5 && (var9.field4981 == 1 || arg4 != 1) && arg4 != -1) {
            class232.field3615.method2252(class294.method2047(arg4, (byte) -72), 0, 9, 16776960, 1);
        }
        class280.method1983(var14, var16, var15);
        int var22 = -80 / ((arg7 - 34) / 62);
        class280.method1984(var17);
        class31.method277();
        class31.field459 = true;
        return class109.field1458 && !arg0 ? new class239(var18) : var18;
    }
}

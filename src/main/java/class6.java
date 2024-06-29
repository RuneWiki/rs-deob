import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class6 extends class125 implements class518 {

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "Lpe;")
    public class461 field73;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Z")
    private boolean field67;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLza;)V")
    public final void method26(byte arg0, class491 arg1) {
        ++field61;
        this.field73.method2748((byte) 120, arg1);
        if (arg0 != 111) {
            this.field67 = true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field76;
        class530 var5 = this.field73.method2746(super.field2172, (byte) -122, arg0, 131072, false, super.field2170, false);
        if (var5 == null) {
            return false;
        } else {
            class202 var6 = arg0.method820();
            if (arg1 < 121) {
                this.method36(false);
            }
            var6.method1246(super.field2172, super.field2180, super.field2170);
            return var5.method776(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
    public final int method28(byte arg0) {
        ++field68;
        if (arg0 != -118) {
            this.field67 = false;
        }
        return this.field73.field6843;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I")
    public final int method29(int arg0) {
        ++field65;
        int var2 = -11 % ((40 - arg0) / 52);
        return this.field73.field6856;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lza;Z)V")
    public static final void method30(class491 arg0, boolean arg1) {
        ++field71;
        if ((~class480.field7080 <= -3 || class508.field7386) && class164.field2598 == null) {
            if (!arg1) {
                method30((class491) null, false);
            }
            String var2;
            if (class508.field7386 && ~class480.field7080 > -3) {
                var2 = class460.field6823 + class251.field4293.method1954(class300.field4813, -30366) + class15.field179 + " ->";
            } else if (class529.field7782 && class468.field6955.method1369(81, 26) && ~class480.field7080 < -3) {
                var2 = class209.method1367((class162) class108.field1934.field6207.field4530.field4530, (byte) 86);
            } else {
                class162 var3 = (class162) class108.field1934.field6207.field4530;
                var2 = class209.method1367(var3, (byte) 119);
                int[] var4 = null;
                if (class420.method2579(var3.field2576, (byte) 111)) {
                    var4 = class20.field218.method2221((int) var3.field2578, -1).field1732;
                } else if (~var3.field2585 != 0) {
                    var4 = class20.field218.method2221(var3.field2585, -1).field1732;
                } else if (!class63.method416(var3.field2576, true)) {
                    if (class479.method2823(var3.field2576, -30256)) {
                        Object var5 = null;
                        class39 var6;
                        if (var3.field2576 == 1011) {
                            var6 = class61.field928.method791((int) var3.field2578, true);
                        } else {
                            var6 = class61.field928.method791((int) (2147483647L & var3.field2578 >>> 32), arg1);
                        }
                        if (var6.field575 != null) {
                            var6 = var6.method296(-1008, class327.field5160);
                        }
                        if (var6 != null) {
                            var4 = var6.field632;
                        }
                    }
                } else {
                    class505 var7 = (class505) class147.field2396.method2516((long) ((int) var3.field2578), -1);
                    if (var7 != null) {
                        class265 var8 = var7.field7355;
                        class510 var9 = var8.field4430;
                        if (var9.field7448 != null) {
                            var9 = var9.method3000(1, class327.field5160);
                        }
                        if (var9 != null) {
                            var4 = var9.field7476;
                        }
                    }
                }
                if (var4 != null) {
                    var2 = var2 + class367.method2331(-55, var4);
                }
            }
            if (~class480.field7080 < -3) {
                var2 = var2 + "<col=ffffff> / " + (class480.field7080 + -2) + class337.field5293.method1954(class300.field4813, -30366);
            }
            if (class386.field5956 == null) {
                if (class108.field1935 != null && class271.field4501 == class251.field4283) {
                    int var10 = class127.field2188.method1909(class328.field5180, class38.field567, 16777215, class155.field2513 + 4, class140.field2329 - -16, class315.field4961, -116, var2, class491.field7177, 0);
                    class358.method2298(class140.field2329, class84.field1467.method2085((byte) -95, var2) - -var10, (byte) -122, 16, class155.field2513 + 4);
                    return;
                }
            } else {
                class296 var11 = class386.field5956.method438(-1, arg0);
                if (var11 == null) {
                    var11 = class127.field2188;
                }
                var11.method1907(var2, class206.field3264, class386.field5956.field1155, (byte) -107, class386.field5956.field1125, class386.field5956.field1024, class386.field5956.field1081, class386.field5956.field1009, class315.field4961, class214.field3405, class38.field567, class515.field7624, class328.field5180, class491.field7177, class386.field5956.field1161);
                class358.method2298(class206.field3264[1], class206.field3264[2], (byte) -128, class206.field3264[3], class206.field3264[0]);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public final void method31(int arg0) {
        ++field56;
        int var2 = -127 % ((arg0 - 57) / 48);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILza;I)Le;")
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        int var4 = 71 / ((-24 - arg2) / 60);
        ++field64;
        return this.field73.method2746(0, (byte) -121, arg1, arg0, false, 0, false);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        ++field58;
        int var2 = 124 % ((arg0 - 8) / 45);
        return this.field73.method2751(-78);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILza;)V")
    public final void method34(int arg0, class491 arg1) {
        this.field73.method2750(arg1, (byte) 121);
        if (arg0 == 25747) {
            ++field59;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Z)V")
    public static final void method35(boolean arg0) {
        ++field75;
        class146.field2388 = null;
        if (arg0) {
            class191.field2977 = false;
            class408.method2530(17234);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
    public final void method36(boolean arg0) {
        if (arg0) {
            this.field67 = true;
        }
        ++field72;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILco;ILmo;Lza;Lit;BI)V")
    public static final void method37(int arg0, class445 arg1, int arg2, class366 arg3, class491 arg4, class514 arg5, byte arg6, int arg7) {
        ++field70;
        int var8 = arg3.field5695 + -5 - arg0 / 2;
        int var9 = arg2 + 2;
        if (arg1.field6648 != 0) {
            arg4.method2864(var9, (byte) 13, arg0 - -10, var8, arg7 * arg5.method3045() + arg2 + -var9 + 1, arg1.field6648);
        }
        if (~arg1.field6655 != -1) {
            arg4.method2859(arg0 + 10, arg1.field6655, -41, arg5.method3045() * arg7 + (-var9 + arg2 - -1), var9, var8);
        }
        int var10 = arg1.field6624;
        if (arg3.field5697 && arg1.field6632 != -1) {
            var10 = arg1.field6632;
        }
        if (arg6 <= -78) {
            for (int var11 = 0; ~arg7 < ~var11; ++var11) {
                String var12 = class165.field2607[var11];
                if (~var11 > ~(arg7 - 1)) {
                    var12 = var12.substring(0, var12.length() - 4);
                }
                arg5.method3041(arg4, var12, arg3.field5695, arg2, var10, true);
                arg2 += arg5.method3045();
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lza;Lp;IIIIIZII)V")
    public class6(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field649, arg1.field664, arg1.field603);
        this.field73 = new class461(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field67 = ~arg1.field618 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
    public final int method38(int arg0) {
        ++field77;
        return arg0 != 5638 ? -68 : this.field73.field6842;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILza;IILvl;Z)V")
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        ++field63;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILza;)Lsr;")
    public final class430 method40(int arg0, class491 arg1) {
        ++field55;
        class530 var3 = this.field73.method2746(super.field2172, (byte) -125, arg1, 2048, true, super.field2170, false);
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = arg1.method820();
            var4.method1246(super.field2172, super.field2180, super.field2170);
            class430 var5 = null;
            if (this.field67) {
                var5 = class21.method111((byte) -96, 1);
            }
            if (this.field73.field6824 == null) {
                var3.method736(var4, var5 == null ? null : var5.field6447[0], 0);
            } else {
                class66 var6 = this.field73.field6824.method964();
                arg1.method853(var3, var6, var4, var5 != null ? var5.field6447[0] : null, 0);
            }
            if (arg0 >= -24) {
                this.field73 = null;
            }
            int var7 = super.field2172 >> 7;
            int var8 = super.field2170 >> 7;
            this.field73.method2744(arg1, var8, var7, var3, var7, var8, -1, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method41(int arg0, String arg1) {
        ++field62;
        class60.field917 = arg1;
        if (class419.field6342.field7203 != null) {
            try {
                String var2 = class419.field6342.field7203.getParameter("cookieprefix");
                String var3 = class419.field6342.field7203.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg1.length() == -1) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class53.method374((byte) -126, 94608000000L + class19.method91((byte) 98)) + "; Max-Age=" + 94608000L;
                }
                class456.method2734((byte) -114, class419.field6342.field7203, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable var7) {
            }
            int var6 = -94 / ((73 - arg0) / 52);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        ++field57;
        if (arg0) {
            this.method40(86, (class491) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(BLza;)V")
    public final void method43(byte arg0, class491 arg1) {
        ++field60;
        class530 var3 = this.field73.method2746(super.field2172, (byte) -115, arg1, 262144, true, super.field2170, true);
        if (arg0 != 35) {
            field66 = 5;
        }
        if (var3 != null) {
            int var4 = super.field2172 >> 7;
            int var5 = super.field2170 >> 7;
            this.field73.method2744(arg1, var5, var4, var3, var4, var5, -1, false);
        }
    }
}

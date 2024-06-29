import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class434 extends class678 {

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Lii;")
    public class515 field6277;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field6280;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static final void method2635(int arg0) {
        class544.field7588 = null;
        class628.field9056 = false;
        field6278++;
        class557.field7892 = null;
        if (arg0 != 5801) {
            field6280 = null;
        }
        class5.field470 = null;
        class167.field2770 = null;
        class537.field7511 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIBJI)Ljava/lang/String;")
    public static final String method2636(boolean arg0, int arg1, byte arg2, long arg3, int arg4) {
        field6279++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 != -32) {
            method2639(-62);
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lii;)V")
    public class434(class515 arg0) {
        this.field6277 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    public static void method2637(int arg0) {
        field6280 = null;
        if (arg0 != -4) {
            method2636(false, 122, (byte) -73, 8L, -34);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZLan;)V")
    public static final void method2638(int arg0, boolean arg1, class22 arg2) {
        field6275++;
        if (class481.field6904 >= 400) {
            return;
        }
        class334 var3 = arg2.field880;
        if (var3.field4984 != null) {
            var3 = var3.method2150(class113.field2038, -32224);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field4944) {
            return;
        }
        String var4 = var3.field4968;
        if (~var3.field4947 != arg0) {
            String var5 = class78.field1573 == class49.field1167 ? class265.field3905.method1733(255, class140.field2466) : class265.field3903.method1733(255, class140.field2466);
            var4 = var4 + class498.method2975(class532.field7456.field8661, (byte) 105, var3.field4947) + " (" + var5 + var3.field4947 + ")";
        }
        if (class65.field1435 && !arg1) {
            class445 var6 = class200.field3105 == -1 ? null : client.field4124.method980(-95, class200.field3105);
            if ((class489.field7001 & 0x2) != 0 && (var6 == null || var3.method2155(class200.field3105, var6.field6413, 84) != var6.field6413)) {
                class371.field5511++;
                class631.method3604(20, 0, -1, (long) arg2.field8728, class578.field8409, 0, (byte) -114, true, class177.field2892 + " -> <col=ffff00>" + var4, class97.field1726, false);
            }
        }
        if (!arg1) {
            String[] var7 = var3.field4956;
            if (class598.field8573) {
                var7 = class433.method2634(var7, -126);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field4951 == 0 || !var7[var8].equalsIgnoreCase(class265.field3898.method1733(arg0 + 256, class140.field2466)))) {
                        byte var9 = 0;
                        int var10 = class419.field6041;
                        if (var8 == 0) {
                            var9 = 22;
                        }
                        if (var8 == 1) {
                            var9 = 60;
                        }
                        if (var8 == 2) {
                            var9 = 48;
                        }
                        if (var8 == 3) {
                            var9 = 59;
                        }
                        if (var3.field4966 == var8) {
                            var10 = var3.field5009;
                        }
                        if (var8 == 4) {
                            var9 = 25;
                        }
                        if (var3.field4943 == var8) {
                            var10 = var3.field4969;
                        }
                        class399.field5807++;
                        class631.method3604(var9, 0, -1, (long) arg2.field8728, var7[var8], 0, (byte) -91, true, "<col=ffff00>" + var4, var7[var8].equalsIgnoreCase(class265.field3898.method1733(255, class140.field2466)) ? var3.field5010 : var10, false);
                    }
                }
            }
            if (var3.field4951 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class265.field3898.method1733(arg0 + 256, class140.field2466))) {
                        short var12 = 0;
                        if (var3.field4947 > class532.field7456.field8661) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 22;
                        }
                        if (var11 == 1) {
                            var13 = 60;
                        }
                        if (var11 == 2) {
                            var13 = 48;
                        }
                        if (var11 == 3) {
                            var13 = 59;
                        }
                        if (var11 == 4) {
                            var13 = 25;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class211.field3230++;
                        class631.method3604(var13, 0, -1, (long) arg2.field8728, var7[var11], 0, (byte) -69, true, "<col=ffff00>" + var4, var3.field5010, false);
                    }
                }
            }
        }
        class164.field2746++;
        class631.method3604(1011, 0, -1, (long) arg2.field8728, class265.field3897.method1733(255, class140.field2466), 0, (byte) -101, true, "<col=ffff00>" + var4, class699.field9841, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
    public static final void method2639(int arg0) {
        class114.field2042.method2600((byte) -114);
        field6276++;
        class512.field7234.method3021(-28912);
        class33.field963.method3021(-28912);
        if (arg0 != -401) {
            field6280 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class195 {

    @OriginalMember(owner = "client!br", name = "i", descriptor = "Ltb;")
    private class450 field2450 = new class450(64);

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Lpl;")
    private class612 field2449;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2446 = null;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Lwp;")
    public static class453 field2451 = new class453(65, -1);

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Ltb;")
    public static class450 field2452 = new class450(8);

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Z")
    public static boolean field2454 = true;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field2453 = -2;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "Lq;")
    public static class491 field2455;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 5)
    public final void method1173(byte arg0) {
        field2443++;
        class450 var2 = this.field2450;
        synchronized (this.field2450) {
            int var3 = -106 % ((arg0 + 64) / 42);
            this.field2450.method2412((byte) -121);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILvb;Lr;ILww;I)Z", line = 17)
    public static final boolean method1174(int arg0, class316 arg1, class566 arg2, int arg3, class647 arg4, int arg5) {
        field2447++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field9130 != null) {
            var7 = (arg4.field9113 + arg1.field4055 - class656.field9272) * (class656.field9257 - class656.field9261) / (class656.field9253 - class656.field9272) + class656.field9261;
            var9 = class656.field9269 - ((arg4.field9092 + arg1.field4056 - class656.field9271) * (class656.field9269 - class656.field9258) / (class656.field9263 - class656.field9271));
            var8 = class656.field9269 - ((arg1.field4056 + arg4.field9091 - class656.field9271) * (class656.field9269 - class656.field9258) / (class656.field9263 - class656.field9271));
            var6 = (arg1.field4055 + arg4.field9131 - class656.field9272) * (class656.field9257 - class656.field9261) / (class656.field9253 - class656.field9272) + class656.field9261;
        }
        class536 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field9127 != -1) {
            if (arg1.field4054 && arg4.field9107 != -1) {
                var10 = arg4.method3619(75, arg2, true);
            } else {
                var10 = arg4.method3619(arg0 + 92, arg2, false);
            }
            if (var10 != null) {
                var11 = arg1.field4058 - (var10.method160() + 1 >> 1);
                var12 = arg1.field4058 + (var10.method160() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var13 = arg1.field4053 - (var10.method166() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg1.field4053 + (var10.method166() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class543 var15 = null;
        int var16 = arg0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field9106 != null) {
            var15 = class25.method172(1, arg4.field9094);
            if (var15 != null) {
                var16 = class383.field4835.method3272(arg4.field9106, class497.field6554, ~arg0, null, null);
                int var23 = arg1.field4053;
                if (var10 == null) {
                    var17 = var23 - var15.method2933() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method166() >> 1) + (var15.method2932() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class497.field6554[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2934(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg1.field4058 - (var18 / 2 - arg3);
                var20 = arg1.field4058 - (-(var18 / 2) - arg3);
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg5 + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = var15.method2932() * var16 + var17 + arg5;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class656.field9261 > var7 || class656.field9257 < var6 || class656.field9258 > var9 || class656.field9269 < var8) {
            return true;
        }
        if (arg4.field9130 != null) {
            int[] var27 = new int[arg4.field9130.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg4.field9130[var28 * 2] + arg1.field4055;
                int var31 = arg4.field9130[var28 * 2 + 1] + arg1.field4056;
                var27[var28 * 2] = (var30 - class656.field9272) * (class656.field9257 - class656.field9261) / (class656.field9253 - class656.field9272) + class656.field9261;
                var27[var28 * 2 + 1] = class656.field9269 - ((var31 - class656.field9271) * (class656.field9269 - class656.field9258) / (class656.field9263 - class656.field9271));
            }
            class614.method3380(arg2, var27, arg4.field9132);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg2.method3113(1, var27[var29 * 2 + 1], arg4.field9133, var27[var29 * 2 + 2 + 1], var27[var29 * 2], var27[var29 * 2 + 2]);
            }
            arg2.method3113(1, var27[var27.length - 1], arg4.field9133, var27[1], var27[var27.length - 2], var27[0]);
        }
        if (var10 != null) {
            if (class590.field8287 > 0 && (class382.field4823 != -1 && class382.field4823 == arg1.field4057 || class550.field7645 != -1 && class550.field7645 == arg4.field9118)) {
                int var32;
                if (class673.field9471 > 50) {
                    var32 = 200 - (class673.field9471 * 2);
                } else {
                    var32 = class673.field9471 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method3117(arg0 + 9, var33, arg1.field4058, arg1.field4053, var10.method167() / 2 + 7);
                arg2.method3117(arg0 + 115, var33, arg1.field4058, arg1.field4053, var10.method167() / 2 + 5);
                arg2.method3117(-7, var33, arg1.field4058, arg1.field4053, var10.method167() / 2 + 3);
                arg2.method3117(arg0 ^ 0x65, var33, arg1.field4058, arg1.field4053, var10.method167() / 2 + 1);
                arg2.method3117(102, var33, arg1.field4058, arg1.field4053, var10.method167() / 2);
            }
            var10.method2902(arg1.field4058 - (var10.method160() >> 1), arg1.field4053 - (var10.method166() >> 1));
        }
        if (arg4.field9106 != null && var15 != null) {
            class403.method2144(var16, arg4, var15, arg2, var17, var18, arg1, 0);
        }
        if (arg4.field9127 != -1 || arg4.field9106 != null) {
            class381 var34 = new class381(arg1);
            var34.field4805 = var21;
            var34.field4810 = var12;
            var34.field4811 = var11;
            var34.field4812 = var14;
            var34.field4814 = var13;
            var34.field4813 = var22;
            var34.field4816 = var20;
            var34.field4809 = var19;
            class373.field4705.method239(var34, (byte) 93);
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V", line = 230)
    public final void method1175(int arg0, int arg1) {
        field2445++;
        class450 var3 = this.field2450;
        synchronized (this.field2450) {
            this.field2450.method2411(true, arg1);
        }
        if (arg0 != -18944) {
            this.method1178(true);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)Ldf;", line = 246)
    public final class599 method1176(boolean arg0, int arg1) {
        field2448++;
        class450 var3 = this.field2450;
        class599 var4;
        synchronized (this.field2450) {
            var4 = (class599) this.field2450.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field2449;
        byte[] var7;
        synchronized (this.field2449) {
            if (!arg0) {
                return null;
            }
            var7 = this.field2449.method3365(arg1, 61, 31);
        }
        class599 var8 = new class599();
        if (var7 != null) {
            var8.method3291(new class630(var7), -16042);
        }
        class450 var9 = this.field2450;
        synchronized (this.field2450) {
            this.field2450.method2409((long) arg1, var8, 1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 280)
    public static void method1177(int arg0) {
        field2446 = null;
        field2452 = null;
        field2455 = null;
        field2451 = null;
        if (arg0 != -1) {
            field2452 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 293)
    public final void method1178(boolean arg0) {
        field2442++;
        class450 var2 = this.field2450;
        synchronized (this.field2450) {
            if (arg0) {
                this.field2450.method2406(18385);
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)V", line = 306)
    public static final void method1179(int arg0, int arg1, int arg2, int arg3) {
        field2444++;
        int var4 = class145.field1879 + arg3;
        int var5 = class630.field8817 + arg1;
        if (class270.field3423 == null || arg3 < 0 || arg1 < 0 || class431.field5395 <= arg3 || arg1 >= class452.field5802 || !class301.field3698.method135(class651.field9191, 108) && class376.field4748.field6470 != arg2) {
            return;
        }
        long var6 = (long) (var4 | arg2 << 28 | var5 << 14);
        class650 var8 = (class650) class533.field7185.method399(-32748, var6);
        if (var8 == null) {
            class550.method3037(arg2, arg3, arg1);
            return;
        }
        class288 var9 = (class288) var8.field9177.method237(arg0 - 1632);
        if (var9 == null) {
            class550.method3037(arg2, arg3, arg1);
            return;
        }
        if (arg0 != 1736) {
            field2455 = null;
        }
        class433 var10 = (class433) class550.method3037(arg2, arg3, arg1);
        if (var10 == null) {
            var10 = new class433(arg3 << 9, class491.field6485[arg2].method1562(arg1, (byte) 51, arg3), arg1 << 9, arg2, arg2);
        } else {
            var10.field5425 = var10.field5424 = -1;
        }
        var10.field5428 = var9.field3585;
        var10.field5410 = var9.field3586;
        label61: while (true) {
            class288 var11 = (class288) var8.field9177.method245((byte) 61);
            if (var11 == null) {
                break;
            }
            if (var10.field5410 != var11.field3586) {
                var10.field5425 = var11.field3586;
                var10.field5431 = var11.field3585;
                while (true) {
                    class288 var12 = (class288) var8.field9177.method245((byte) 55);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field5410 != var12.field3586 && var10.field5425 != var12.field3586) {
                        var10.field5424 = var12.field3586;
                        var10.field5416 = var12.field3585;
                    }
                }
            }
        }
        int var13 = class467.method2469((arg3 << 9) + 256, arg2, -20214, (arg1 << 9) + 256);
        var10.field6470 = (byte) arg2;
        var10.field5412 = 0;
        var10.field6456 = (byte) arg2;
        var10.field6458 = var13;
        var10.field6461 = arg3 << 9;
        var10.field6464 = arg1 << 9;
        if (class3.method22(arg1, arg3, arg0 ^ 0x1082)) {
            var10.field6456++;
        }
        class655.method3667(arg2, arg3, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 418)
    public class195(class112 arg0, int arg1, class612 arg2) {
        this.field2449 = arg2;
        this.field2449.method3349(31, true);
    }
}

import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class391 {

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5860 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field5859 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5853;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Lqr;", line = 3)
    public static final class15 method2551(int arg0, byte arg1) {
        field5861++;
        class24 var2 = class353.field5183;
        class15 var3;
        synchronized (class353.field5183) {
            var3 = (class15) class353.field5183.method209(120, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class72.field977.method1472(class23.method195((byte) 60, arg0), class229.method1422(arg0, 1381872556), 0);
        if (arg1 >= -86) {
            field5859 = 95;
        }
        class15 var5 = new class15();
        var5.field148 = arg0;
        if (var4 != null) {
            var5.method104(256, new class265(var4));
        }
        var5.method106(107);
        class24 var6 = class353.field5183;
        synchronized (class353.field5183) {
            class353.field5183.method202(true, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lil;[BZ)V", line = 35)
    public final void method2552(class265 arg0, byte[] arg1, boolean arg2) {
        field5856++;
        if (!arg2) {
            field5859 = 126;
        }
        if (arg0.field3879[arg0.field3915] != 31 || arg0.field3879[arg0.field3915 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5853 == null) {
            this.field5853 = new Inflater(true);
        }
        try {
            this.field5853.setInput(arg0.field3879, arg0.field3915 + 10, -10 - arg0.field3915 - (8 - arg0.field3879.length));
            this.field5853.inflate(arg1);
        } catch (Exception var4) {
            this.field5853.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5853.reset();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 63)
    public static final void method2553(byte arg0) {
        field5862++;
        class160 var1 = (class160) class374.field5634.method978((byte) -56);
        int var2 = -55 / ((arg0 - 30) / 39);
        while (var1 != null) {
            class193.method1206(var1, 20);
            var1 = (class160) class374.field5634.method978((byte) 125);
        }
        client.method1579();
        client.method1573();
        client.method1562();
        client.method1571();
        client.method1575();
        client.method1577();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILqj;I)Lfi;", line = 89)
    public static final class165 method2554(int arg0, class238 arg1, int arg2) {
        field5864++;
        if (arg2 >= -96) {
            method2555(-7, false);
        }
        byte[] var3 = arg1.method1466(arg0, -123);
        return var3 == null ? null : new class165(var3);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 112)
    public class391() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Lpd;", line = 117)
    public static final class85 method2555(int arg0, boolean arg1) {
        field5855++;
        class85 var2 = (class85) class157.field2061.method2319(-12, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class307.field4396.method1472(arg0, 11, 0);
        class85 var4 = new class85();
        if (var3 != null) {
            var4.method529(new class265(var3), (byte) 114);
        }
        class157.field2061.method2318(var4, false, (long) arg0);
        if (!arg1) {
            method2551(-127, (byte) -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V", line = 148)
    public static final void method2556(byte arg0) {
        field5857++;
        class403.method2616((long) class50.field698, -117, class35.field574);
        if (class404.field6020 != -1) {
            class336.method2231((byte) 45, class404.field6020);
        }
        if (arg0 < 56) {
            field5859 = 104;
        }
        for (int var1 = 0; var1 < class442.field6463; var1++) {
            if (class85.field1178[var1]) {
                class159.field2084[var1] = true;
            }
            class234.field3286[var1] = class85.field1178[var1];
            class85.field1178[var1] = false;
        }
        class394.field5913 = class50.field698;
        if (class35.field574.method2112()) {
            class411.field6154 = true;
        }
        class363.field5308 = null;
        if (class404.field6020 != -1) {
            class442.field6463 = 0;
            class74.method455((byte) -128);
        }
        class35.field574.method2034();
        class285.method1808(class45.field674, 1);
        class175.field2280 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V", line = 199)
    public static final void method2557(int arg0, int arg1, byte arg2) {
        class328.field4707 = new class24(arg1);
        field5854++;
        class16.field177 = new class24(arg0);
        if (arg2 != 0) {
            field5859 = 30;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 211)
    public static final void method2558(int arg0) {
        class82.field1154 = -1;
        class70.field967 = -1;
        class169.field2214 = 0;
        field5863++;
        if (arg0 != -1322) {
            field5859 = 22;
        }
        class187.field2545 = -1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 228)
    public static void method2559(boolean arg0) {
        if (arg0) {
            field5859 = -97;
        }
        field5860 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V", line = 240)
    private class391(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZILnr;BILbi;IIIIIIZ)V", line = 253)
    public static final void method2560(boolean arg0, int arg1, class437 arg2, byte arg3, int arg4, class138 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        field5858++;
        if (!class116.method810((byte) 121) && !class226.method1404(arg8, true, arg10, arg7, class431.field6368)) {
            return;
        }
        if (class168.field2203 > arg7) {
            class168.field2203 = arg7;
        }
        class404 var13 = class165.method1020(arg1, -51);
        if (class265.field3854 == 1 && var13.field6017) {
            return;
        }
        int var14;
        int var15;
        if (arg9 == 1 || arg9 == 3) {
            var15 = var13.field6014;
            var14 = var13.field6048;
        } else {
            var14 = var13.field6014;
            var15 = var13.field6048;
        }
        if (arg3 != -91) {
            method2557(-76, 43, (byte) -100);
        }
        int var16;
        int var17;
        if (class324.field4652 < (arg8 + var15)) {
            var16 = arg8;
            var17 = arg8 + 1;
        } else {
            var16 = (var15 >> 1) + arg8;
            var17 = (var15 + 1 >> 1) + arg8;
        }
        int var18;
        int var19;
        if (class336.field4964 < arg10 + var14) {
            var18 = arg10;
            var19 = arg10 + 1;
        } else {
            var19 = (var14 + 1 >> 1) + arg10;
            var18 = (var14 >> 1) + arg10;
        }
        class337 var20 = class88.field1226[arg4];
        int var21 = var20.method781(var16, var18) + var20.method781(var17, var18) + (var20.method781(var16, var19) - -var20.method781(var17, var19)) >> 2;
        int var22 = (arg8 << 7) + (var15 << 6);
        int var23 = (arg10 << 7) + (var14 << 6);
        boolean var24 = arg0 && !arg12 && var13.field6019;
        if (var13.method2635(0)) {
            class280.method1794((class194) null, arg9, arg10, (class129) null, false, arg7, var13, arg8);
        }
        boolean var25 = arg11 == -1 && var13.field6064 == -1 && var13.field6003 == null && var13.field5999 == null && !var13.field6006;
        if (class232.field3276 && var13.field6036 != 1) {
            return;
        }
        if (arg6 == 22) {
            if (class258.field3768 || var13.field6009 != 0 || var13.field6039 == 1 || var13.field5997) {
                class381 var27;
                if (var25) {
                    class19 var26 = new class19(arg2, var13, arg4, var22, var21, var23, arg12, arg9, var24);
                    var27 = var26;
                    if (var26.method146((byte) 115)) {
                        var26.method154(arg3 + 25601, arg2);
                    }
                } else {
                    var27 = new class157(arg2, var13, arg9, arg7, arg4, var22, var21, var23, arg12, arg11);
                }
                class390.method2550(arg7, arg8, arg10, var27);
                if (var13.field6039 == 1 && arg5 != null) {
                    arg5.method928(arg8, arg10, -32323);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class347 var65 = null;
            int var67;
            class361 var68;
            if (var25) {
                class347 var66 = new class347(arg2, var13, arg7, arg4, var22, var21, var23, arg12, arg8, arg8 + var15 - 1, arg10, var14 + arg10 - 1, arg6, arg9, var24);
                var67 = var66.method2314((byte) 122);
                var65 = var66;
                var68 = var66;
            } else {
                var67 = 15;
                var68 = new class316(arg2, var13, arg6, arg9, arg7, arg4, var22, var21, var23, arg12, arg8, arg8 + var15 - 1, arg10, arg10 + var14 - 1, arg11);
            }
            if (class84.method524(var68, false)) {
                if (var65 != null && var65.method146((byte) 124)) {
                    var65.method154(arg3 ^ 0xFFFF9C03, arg2);
                }
                if (var13.field6010 && arg0) {
                    if (var67 > 30) {
                        var67 = 30;
                    }
                    for (int var69 = 0; var69 <= var15; var69++) {
                        for (int var70 = 0; var70 <= var14; var70++) {
                            var20.method791(arg8 + var69, arg10 + var70, var67);
                        }
                    }
                }
            }
            if (var13.field6039 != 0 && arg5 != null) {
                arg5.method913(var15, var13.field6037, var14, arg8, arg10, (byte) -112, !var13.field6070);
            }
        } else if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
            class361 var28;
            if (var25) {
                class347 var29 = new class347(arg2, var13, arg7, arg4, var22, var21, var23, arg12, arg8, arg8 - (1 - var15), arg10, arg10 + var14 - 1, arg6, arg9, var24);
                var28 = var29;
                if (var29.method146((byte) 119)) {
                    var29.method154(arg3 + 25601, arg2);
                }
            } else {
                var28 = new class316(arg2, var13, arg6, arg9, arg7, arg4, var22, var21, var23, arg12, arg8, var15 + arg8 - 1, arg10, arg10 + var14 - 1, arg11);
            }
            class84.method524(var28, false);
            if (arg0 && !arg12 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0 && var13.field6036 != 0) {
                class451.field6578[arg7][arg8][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10], 4);
            }
            if (var13.field6039 != 0 && arg5 != null) {
                arg5.method913(var15, var13.field6037, var14, arg8, arg10, (byte) -125, !var13.field6070);
            }
        } else if (arg6 == 0) {
            class349 var31;
            if (var25) {
                class273 var30 = new class273(arg2, var13, arg4, var22, var21, var23, arg12, arg6, arg9, var24);
                if (var30.method146((byte) 124)) {
                    var30.method154(25510, arg2);
                }
                var31 = var30;
            } else {
                var31 = new class155(arg2, var13, 0, arg9, arg7, arg4, var22, var21, var23, arg12, arg11);
            }
            class337.method2238(arg7, arg8, arg10, var31, (class349) null);
            if (arg0) {
                if (arg9 == 0) {
                    if (var13.field6010) {
                        var20.method791(arg8, arg10, 50);
                        var20.method791(arg8, arg10 + 1, 50);
                    }
                    if (var13.field6036 == 1 && !arg12) {
                        class451.field6578[arg7][arg8][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10], 1);
                    }
                } else if (arg9 == 1) {
                    if (var13.field6010) {
                        var20.method791(arg8, arg10 + 1, 50);
                        var20.method791(arg8 + 1, arg10 - -1, 50);
                    }
                    if (var13.field6036 == 1 && !arg12) {
                        class451.field6578[arg7][arg8][arg10 + 1] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10 + 1], 2);
                    }
                } else if (arg9 == 2) {
                    if (var13.field6010) {
                        var20.method791(arg8 + 1, arg10, 50);
                        var20.method791(arg8 + 1, arg10 + 1, 50);
                    }
                    if (var13.field6036 == 1 && !arg12) {
                        class451.field6578[arg7][arg8 + 1][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8 + 1][arg10], 1);
                    }
                } else if (arg9 == 3) {
                    if (var13.field6010) {
                        var20.method791(arg8, arg10, 50);
                        var20.method791(arg8 + 1, arg10, 50);
                    }
                    if (var13.field6036 == 1 && !arg12) {
                        class451.field6578[arg7][arg8][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10], 2);
                    }
                }
            }
            if (var13.field6039 != 0 && arg5 != null) {
                arg5.method914(!var13.field6070, var13.field6037, (byte) 124, arg8, arg9, arg6, arg10);
            }
            if (var13.field6016 != 16) {
                class205.method1295(arg7, arg8, arg10, var13.field6016);
            }
        } else if (arg6 == 1) {
            class349 var33;
            if (var25) {
                class273 var32 = new class273(arg2, var13, arg4, var22, var21, var23, arg12, arg6, arg9, var24);
                if (var32.method146((byte) 111)) {
                    var32.method154(25510, arg2);
                }
                var33 = var32;
            } else {
                var33 = new class155(arg2, var13, 1, arg9, arg7, arg4, var22, var21, var23, arg12, arg11);
            }
            class337.method2238(arg7, arg8, arg10, var33, (class349) null);
            if (var13.field6010 && arg0) {
                if (arg9 == 0) {
                    var20.method791(arg8, arg10 + 1, 50);
                } else if (arg9 == 1) {
                    var20.method791(arg8 + 1, arg10 - -1, 50);
                } else if (arg9 == 2) {
                    var20.method791(arg8 + 1, arg10, 50);
                } else if (arg9 == 3) {
                    var20.method791(arg8, arg10, 50);
                }
            }
            if (var13.field6039 != 0 && arg5 != null) {
                arg5.method914(!var13.field6070, var13.field6037, (byte) 124, arg8, arg9, arg6, arg10);
            }
        } else if (arg6 == 2) {
            int var34 = arg9 + 1 & 0x3;
            class349 var37;
            class349 var38;
            if (var25) {
                class273 var35 = new class273(arg2, var13, arg4, var22, var21, var23, arg12, arg6, arg9 + 4, var24);
                class273 var36 = new class273(arg2, var13, arg4, var22, var21, var23, arg12, arg6, var34, var24);
                if (var35.method146((byte) 107)) {
                    var35.method154(25510, arg2);
                }
                var37 = var35;
                var38 = var36;
                if (var36.method146((byte) 114)) {
                    var36.method154(25510, arg2);
                }
            } else {
                var37 = new class155(arg2, var13, 2, arg9 + 4, arg7, arg4, var22, var21, var23, arg12, arg11);
                var38 = new class155(arg2, var13, 2, var34, arg7, arg4, var22, var21, var23, arg12, arg11);
            }
            class337.method2238(arg7, arg8, arg10, var37, var38);
            if (var13.field6036 == 1 && arg0 && !arg12) {
                if (arg9 == 0) {
                    class451.field6578[arg7][arg8][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10], 1);
                    class451.field6578[arg7][arg8][arg10 + 1] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10 + 1], 2);
                } else if (arg9 == 1) {
                    class451.field6578[arg7][arg8][arg10 + 1] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10 + 1], 2);
                    class451.field6578[arg7][arg8 + 1][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8 + 1][arg10], 1);
                } else if (arg9 == 2) {
                    class451.field6578[arg7][arg8 + 1][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8 + 1][arg10], 1);
                    class451.field6578[arg7][arg8][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10], 2);
                } else if (arg9 == 3) {
                    class451.field6578[arg7][arg8][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10], 2);
                    class451.field6578[arg7][arg8][arg10] = (byte) class128.method871(class451.field6578[arg7][arg8][arg10], 1);
                }
            }
            if (var13.field6039 != 0 && arg5 != null) {
                arg5.method914(!var13.field6070, var13.field6037, (byte) 124, arg8, arg9, arg6, arg10);
            }
            if (var13.field6016 != 16) {
                class205.method1295(arg7, arg8, arg10, var13.field6016);
            }
        } else if (arg6 == 3) {
            class349 var40;
            if (var25) {
                class273 var39 = new class273(arg2, var13, arg4, var22, var21, var23, arg12, arg6, arg9, var24);
                if (var39.method146((byte) 126)) {
                    var39.method154(25510, arg2);
                }
                var40 = var39;
            } else {
                var40 = new class155(arg2, var13, 3, arg9, arg7, arg4, var22, var21, var23, arg12, arg11);
            }
            class337.method2238(arg7, arg8, arg10, var40, (class349) null);
            if (var13.field6010 && arg0) {
                if (arg9 == 0) {
                    var20.method791(arg8, arg10 + 1, 50);
                } else if (arg9 == 1) {
                    var20.method791(arg8 + 1, arg10 + 1, 50);
                } else if (arg9 == 2) {
                    var20.method791(arg8 + 1, arg10, 50);
                } else if (arg9 == 3) {
                    var20.method791(arg8, arg10, 50);
                }
            }
            if (var13.field6039 != 0 && arg5 != null) {
                arg5.method914(!var13.field6070, var13.field6037, (byte) 127, arg8, arg9, arg6, arg10);
            }
        } else if (arg6 == 9) {
            class361 var42;
            if (var25) {
                class347 var41 = new class347(arg2, var13, arg7, arg4, var22, var21, var23, arg12, arg8, arg8, arg10, arg10, arg6, arg9, var24);
                if (var41.method146((byte) 123)) {
                    var41.method154(25510, arg2);
                }
                var42 = var41;
            } else {
                var42 = new class316(arg2, var13, arg6, arg9, arg7, arg4, var22, var21, var23, arg12, arg8, var15 + arg8 - 1, arg10, arg10 + var14 - 1, arg11);
            }
            class84.method524(var42, false);
            if (var13.field6039 != 0 && arg5 != null) {
                arg5.method913(var15, var13.field6037, var14, arg8, arg10, (byte) -124, !var13.field6070);
            }
            if (var13.field6016 != 16) {
                class205.method1295(arg7, arg8, arg10, var13.field6016);
            }
        } else if (arg6 == 4) {
            class164 var44;
            if (var25) {
                class309 var43 = new class309(arg2, var13, arg4, var22, var21, var23, arg12, 0, 0, 0, arg6, arg9);
                if (var43.method146((byte) 126)) {
                    var43.method154(25510, arg2);
                }
                var44 = var43;
            } else {
                var44 = new class37(arg2, var13, arg6, arg9, arg7, arg4, var22, var21, var23, arg12, 0, 0, 0, arg11);
            }
            class188.method1171(arg7, arg8, arg10, var44, (class164) null);
        } else if (arg6 == 5) {
            int var45 = 16;
            class351 var46 = (class351) class87.method539(arg7, arg8, arg10);
            if (var46 != null) {
                var45 = class165.method1020(var46.method150((byte) -120), 125).field6016;
            }
            class164 var48;
            if (var25) {
                class309 var47 = new class309(arg2, var13, arg4, var22, var21, var23, arg12, 0, class8.field80[arg9] * var45, class33.field550[arg9] * var45, arg6, arg9);
                if (var47.method146((byte) 123)) {
                    var47.method154(25510, arg2);
                }
                var48 = var47;
            } else {
                var48 = new class37(arg2, var13, arg6, arg9, arg7, arg4, var22, var21, var23, arg12, 0, class8.field80[arg9] * var45, class33.field550[arg9] * var45, arg11);
            }
            class188.method1171(arg7, arg8, arg10, var48, (class164) null);
        } else if (arg6 == 6) {
            int var49 = 8;
            class351 var50 = (class351) class87.method539(arg7, arg8, arg10);
            if (var50 != null) {
                var49 = class165.method1020(var50.method150((byte) -126), arg3 ^ 0xFFFFFFD6).field6016 / 2;
            }
            class164 var52;
            if (var25) {
                class309 var51 = new class309(arg2, var13, arg4, var22, var21, var23, arg12, arg9, class8.field80[arg9] * var49, class33.field550[arg9] * var49, arg6, arg9 + 4);
                if (var51.method146((byte) 120)) {
                    var51.method154(arg3 ^ 0xFFFF9C03, arg2);
                }
                var52 = var51;
            } else {
                var52 = new class37(arg2, var13, arg6, arg9 + 4, arg7, arg4, var22, var21, var23, arg12, arg9, class387.field5786[arg9] * var49, class65.field931[arg9] * var49, arg11);
            }
            class188.method1171(arg7, arg8, arg10, var52, (class164) null);
        } else if (arg6 == 7) {
            int var53 = arg9 + 2 & 0x3;
            class164 var54;
            if (var25) {
                class309 var55 = new class309(arg2, var13, arg4, var22, var21, var23, arg12, var53, 0, 0, arg6, var53 + 4);
                if (var55.method146((byte) 127)) {
                    var55.method154(25510, arg2);
                }
                var54 = var55;
            } else {
                var54 = new class37(arg2, var13, arg6, var53 + 4, arg7, arg4, var22, var21, var23, arg12, var53, 0, 0, arg11);
            }
            class188.method1171(arg7, arg8, arg10, var54, (class164) null);
        } else if (arg6 == 8) {
            int var56 = arg9 + 2 & 0x3;
            int var57 = 8;
            class351 var58 = (class351) class87.method539(arg7, arg8, arg10);
            if (var58 != null) {
                var57 = class165.method1020(var58.method150((byte) -113), -100).field6016 / 2;
            }
            class164 var61;
            class164 var62;
            if (var25) {
                class309 var63 = new class309(arg2, var13, arg4, var22, var21, var23, arg12, arg9, class387.field5786[arg9] * var57, class65.field931[arg9] * var57, arg6, arg9 + 4);
                class309 var64 = new class309(arg2, var13, arg4, var22, var21, var23, arg12, arg9, 0, 0, arg6, var56 + 4);
                if (var63.method146((byte) 115)) {
                    var63.method154(25510, arg2);
                }
                if (var64.method146((byte) 117)) {
                    var64.method154(25510, arg2);
                }
                var62 = var64;
                var61 = var63;
            } else {
                class37 var59 = new class37(arg2, var13, arg6, arg9 + 4, arg7, arg4, var22, var21, var23, arg12, arg9, class387.field5786[arg9] * var57, class65.field931[arg9] * var57, arg11);
                class37 var60 = new class37(arg2, var13, arg6, var56 + 4, arg7, arg4, var22, var21, var23, arg12, arg9, 0, 0, arg11);
                var61 = var59;
                var62 = var60;
            }
            class188.method1171(arg7, arg8, arg10, var61, var62);
        }
    }
}

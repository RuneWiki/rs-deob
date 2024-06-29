import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lp;")
    private static class280 field287 = class18.method140((byte) -125, "flash2:");

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lp;")
    public static class280 field285 = field287;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lp;")
    public static class280 field291 = field287;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field290;

    // $FF: synthetic field
    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field292;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[Lp;")
    public static class280[] field288;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static final void method117(byte arg0) {
        field282++;
        try {
            Method var1 = (field292 == null ? (field292 = method123("java.lang.Runtime")) : field292).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class142.field2494 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 < 0) {
            field284 = 94;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method118(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field290++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = arg4 - arg2;
        int var11 = arg4 * arg4;
        int var12 = arg7 - arg2;
        int var13 = arg7 * arg7;
        int var14 = 0;
        int var15 = var10 * var10;
        int var16 = var12 * var12;
        int var17 = var11 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = -15 / ((71 - arg1) / 50);
        int var21 = var16 << 1;
        int var22 = arg4 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = var11 - ((var22 - 1) * var18);
        int var25 = var10 << 1;
        int var26 = (1 - var25) * var16 + var19;
        int var27 = var15 - (var25 - 1) * var21;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var11 << 2;
        int var31 = var15 << 2;
        int var32 = var17 * 3;
        int var33 = (var22 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = var30;
        int var36 = (arg4 - 1) * var28;
        int var37 = (var25 - 3) * var21;
        int var38 = var31;
        if (arg3 >= class36.field654 && arg3 <= class249.field4360) {
            int[] var39 = class91.field1484[arg3];
            int var40 = class76.method564(class89.field1440, -111, arg5 - arg7, class12.field249);
            int var41 = class76.method564(class89.field1440, -116, arg5 + arg7, class12.field249);
            int var42 = class76.method564(class89.field1440, -122, arg5 - var12, class12.field249);
            int var43 = class76.method564(class89.field1440, -120, arg5 + var12, class12.field249);
            class162.method1151(var42, arg6, 3, var40, var39);
            class162.method1151(var43, arg0, -98, var42, var39);
            class162.method1151(var41, arg6, -80, var43, var39);
        }
        int var44 = (var10 - 1) * var29;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var32;
                    var24 += var35;
                    var32 += var30;
                    var35 += var30;
                }
            }
            if (var24 < 0) {
                var23 += var32;
                var24 += var35;
                var35 += var30;
                var8++;
                var32 += var30;
            }
            var24 += -var33;
            var33 -= var28;
            var23 += -var36;
            var36 -= var28;
            boolean var45 = var9 <= var10;
            if (var45) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var26 += var34;
                        var14++;
                        var34 += var31;
                        var27 += var38;
                        var38 += var31;
                    }
                }
                if (var27 < 0) {
                    var14++;
                    var27 += var38;
                    var38 += var31;
                    var26 += var34;
                    var34 += var31;
                }
                var26 += -var44;
                var27 += -var37;
                var37 -= var29;
                var44 -= var29;
            }
            var9--;
            int var46 = arg3 - var9;
            int var47 = arg3 + var9;
            if (var47 >= class36.field654 && var46 <= class249.field4360) {
                int var48 = class76.method564(class89.field1440, -119, arg5 + var8, class12.field249);
                int var49 = class76.method564(class89.field1440, -120, arg5 - var8, class12.field249);
                if (var45) {
                    int var50 = class76.method564(class89.field1440, -113, arg5 + var14, class12.field249);
                    int var51 = class76.method564(class89.field1440, -115, arg5 - var14, class12.field249);
                    if (class36.field654 <= var46) {
                        int[] var52 = class91.field1484[var46];
                        class162.method1151(var51, arg6, 14, var49, var52);
                        class162.method1151(var50, arg0, 118, var51, var52);
                        class162.method1151(var48, arg6, 127, var50, var52);
                    }
                    if (class249.field4360 >= var47) {
                        int[] var53 = class91.field1484[var47];
                        class162.method1151(var51, arg6, 116, var49, var53);
                        class162.method1151(var50, arg0, 106, var51, var53);
                        class162.method1151(var48, arg6, -107, var50, var53);
                    }
                } else {
                    if (class36.field654 <= var46) {
                        class162.method1151(var48, arg6, -67, var49, class91.field1484[var46]);
                    }
                    if (class249.field4360 >= var47) {
                        class162.method1151(var48, arg6, 119, var49, class91.field1484[var47]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ltg;I)V")
    public static final void method119(class180 arg0, int arg1) {
        class259.field4586 = arg0.method1234((byte) -88, class262.field4632);
        class51.field837 = arg0.method1234((byte) -88, class62.field1024);
        field289++;
        class106.field1762 = arg0.method1234((byte) -88, class123.field2163);
        class38.field680 = arg0.method1234((byte) -88, class182.field3173);
        class86.field1405 = arg0.method1234((byte) -88, class94.field1518);
        class264.field4651 = arg0.method1234((byte) -88, class14.field279);
        class266.field4674 = arg0.method1234((byte) -88, class266.field4680);
        client.field2699 = arg0.method1234((byte) -88, class282.field4966);
        class182.field3206 = arg0.method1234((byte) -88, class117.field2107);
        class18.field336 = arg0.method1234((byte) -88, class27.field510);
        class98.field1590 = arg0.method1234((byte) -88, class1.field14);
        class86.field1424 = arg0.method1234((byte) -88, class126.field2207);
        class93.field1508 = arg0.method1234((byte) -88, class182.field3177);
        class152.field2638 = arg0.method1234((byte) -88, class32.field598);
        class78.field1272 = arg0.method1234((byte) -88, class241.field4226);
        if (arg1 <= -84) {
            class255.field4452 = arg0.method1234((byte) -88, class46.field761);
            class6.field125 = arg0.method1234((byte) -88, class34.field631);
            class176.field3069 = arg0.method1234((byte) -88, class60.field973);
            class92.field1504 = arg0.method1234((byte) -88, class40.field688);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lp;I)I")
    public static final int method120(class280 arg0, int arg1) {
        field286++;
        if (arg1 != 7818) {
            return 26;
        } else if (class14.field280 == null || arg0.method1889(arg1 - 7819) == 0) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class14.field280.field3241; var2++) {
                if (class14.field280.field3238[var2].method1894(class178.field3104, class32.field600, (byte) -17).method1892(arg0, 85)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field283++;
        class262.field4624[0].method62(arg2, arg3);
        int var6 = (arg5 - 32) * arg5 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg4 / (arg0 - arg5);
        class262.field4624[1].method62(arg2, arg3 + arg5 - 16);
        class151.method1057(arg2, arg3 + 16, 16, arg5 - 32, class140.field2434);
        class151.method1057(arg2, var7 + arg3 + 16, 16, var6, class175.field3030);
        if (arg1 != 3748) {
            field287 = null;
        }
        class151.method1067(arg2, arg3 + var7 + 16, var6, class142.field2471);
        class151.method1067(arg2 + 1, arg3 + 16 + var7, var6, class142.field2471);
        class151.method1050(arg2, arg3 + var7 + 16, 16, class142.field2471);
        class151.method1050(arg2, var7 + arg3 + 17, 16, class142.field2471);
        class151.method1067(arg2 + 15, var7 + 16 + arg3, var6, class260.field4603);
        class151.method1067(arg2 + 14, var7 + 17 + arg3, var6 - 1, class260.field4603);
        class151.method1050(arg2, arg3 + var6 + var7 + 15, 16, class260.field4603);
        class151.method1050(arg2 + 1, arg3 - -var7 + var6 + 14, 15, class260.field4603);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method122(int arg0) {
        field291 = null;
        field288 = null;
        field285 = null;
        if (arg0 >= -51) {
            field285 = null;
        }
        field287 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class15() {
        new class36();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method123(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

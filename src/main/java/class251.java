import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class251 implements class24 {

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Z")
    public static boolean field3994 = true;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    public static int[] field3993 = new int[500];

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Z")
    public static boolean field3998 = false;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBII)V")
    public static final void method1668(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class94.field1462 = class159.field2574 * arg1 / arg4;
        class80.field1326 = -1;
        client.field4564 = -1;
        class22.field343 = class31.field524 * arg3 / arg0;
        field3996++;
        if (arg2 != -6) {
            field3998 = true;
        }
        class11.method72(false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
    public static final void method1669(String arg0, String arg1, int arg2, byte arg3) {
        class155.field2534 = arg2;
        field4000++;
        class58.field1003 = arg0;
        class160.field2617 = arg1;
        if (class160.field2617.equals("") || class58.field1003.equals("")) {
            class106.field1615 = 3;
        } else if (class295.field4680 == -1) {
            class27.field466 = 0;
            class106.field1615 = -3;
            class97.field1510 = 1;
            class94.field1466 = 0;
            class136 var4 = new class136(128);
            var4.method966((byte) 90, 10);
            var4.method1029((int) (Math.random() * 9.9999999E7D), 15430);
            var4.method967((byte) -8, class260.method1739(false, class160.field2617));
            var4.method1029((int) (Math.random() * 9.9999999E7D), 15430);
            var4.method1028(14630, class58.field1003);
            if (arg3 <= 43) {
                method1668(9, 52, (byte) -20, 42, -91);
            }
            var4.method1029((int) (Math.random() * 9.9999999E7D), 15430);
            var4.method985(class145.field2387, (byte) 68, class189.field3103);
            class87.field1405.field2231 = 0;
            class87.field1405.method966((byte) 67, 24);
            class87.field1405.method966((byte) 93, var4.field2231 + 2);
            class87.field1405.method971(3792, 538);
            class87.field1405.method965(0, var4.field2263, var4.field2231, 98);
        } else {
            class199.method1350((byte) -107);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method1670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg1 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg2;
            arg2 = var8;
        }
        field3992++;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 7 + 1 - arg5 - arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg2;
        } else {
            if (arg6 != -121) {
                method1671(-63);
            }
            return arg5;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method1671(int arg0) {
        if (arg0 == 2) {
            field3993 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lci;IIIII)V")
    public static final void method1672(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class102.field1557 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class129.field2127) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class130.field2161 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class129 var14 = class26.field455[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class21.field327[var11][var12 + 1][var13] + class21.field327[var11][var12][var13] + class21.field327[var11][var12][var13 + 1] + class21.field327[var11][var12 + 1][var13 + 1]) / 4 - (class21.field327[arg1][arg2 + 1][arg3] + class21.field327[arg1][arg2][arg3] + class21.field327[arg1][arg2][arg3 + 1] + class21.field327[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class128 var16 = var14.field2144;
                                    if (var16 != null) {
                                        if (var16.field2117.method468()) {
                                            arg0.method465(var16.field2117, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2105 != null && var16.field2105.method468()) {
                                            arg0.method465(var16.field2105, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2142; var17++) {
                                        class190 var18 = var14.field2131[var17];
                                        if (var18 != null && var18.field3119.method468() && (var18.field3115 == var12 || var7 == var12) && (var18.field3110 == var13 || var9 == var13)) {
                                            int var19 = var18.field3114 + 1 - var18.field3115;
                                            int var20 = var18.field3108 + 1 - var18.field3110;
                                            arg0.method465(var18.field3119, (var18.field3115 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3110 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public final String method192(int[] arg0, int arg1, int arg2, long arg3) {
        field3995++;
        if (arg1 == 0) {
            class293 var6 = class71.method553(arg0[0], -110);
            return var6.method1954((int) arg3, -125);
        } else if (arg1 == 1 || arg1 == 10) {
            class67 var7 = class190.method1314((int) arg3, (byte) 68);
            return var7.field1155;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class71.method553(arg0[0], -120).method1954((int) arg3, -111);
        } else {
            if (arg2 != 4412) {
                field3997 = 78;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lsb;ILsb;)V")
    public static final void method1673(class124 arg0, int arg1, class124 arg2) {
        class113.field1738 = arg2;
        if (arg1 != 1) {
            method1668(-74, 63, (byte) 6, 75, 105);
        }
        class92.field1458 = arg0;
        field3991++;
    }
}

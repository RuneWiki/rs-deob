import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class264 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field4442 = -1;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Z")
    public static boolean field4446 = false;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Lmh;")
    public static class62 field4454 = class201.method1405(true, ")2");

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Lmh;")
    public static class62 field4449 = class201.method1405(true, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public int field4443;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public int field4452;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "J")
    public long field4456;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Ljm;")
    public class123 field4444;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "Ljm;")
    public class123 field4445;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Ljm;")
    public class123 field4455;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[Lwj;")
    public static class135[] field4451;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1821(boolean arg0) {
        field4454 = null;
        field4451 = null;
        if (!arg0) {
            field4449 = (class62) null;
        }
        field4449 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Llf;Llf;Lsg;BIIII)V", line = 41)
    public static final void method1822(class299 arg0, class299 arg1, class191 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4450++;
        class24.field266 = arg5;
        class209.field3542 = arg4;
        class141.field2270 = arg2;
        if (arg3 > -28) {
            method1823((class164) null);
        }
        class36.field497 = arg6;
        class72.field1103 = arg7;
        if (class53.field779 != null) {
            return;
        }
        class208.field3527 = true;
        if (class159.field2559 == null) {
            class159.field2559 = class236.method1669(0, -103, class53.field781, class162.field2631);
        }
        if (class105.field1713 == null) {
            class105.field1713 = class43.method287(0, class53.field781, (byte) 80, class262.field4407);
        }
        if (class269.field4570 == null) {
            class269.field4570 = class43.method287(0, class53.field781, (byte) 80, class287.field4900);
        }
        if (class221.field3806 == null) {
            class221.field3806 = class43.method287(0, class53.field781, (byte) 80, class19.field180);
        }
        int var8 = class72.field1103 / 5;
        int var9 = class72.field1103 / 5 * 4;
        class311.method2113(class36.field497, class209.field3542, class72.field1103, class24.field266, 0, 168);
        class311.method2120(class36.field497, class209.field3542, var8, 23, 12425273, 9135624);
        class311.method2120(class36.field497 + var8, class209.field3542, var9, 23, 5197647, 2697513);
        arg0.method2018(class301.field5185, class36.field497 + (var8 / 2), class209.field3542 + 15, 0, -1);
        if (class221.field3806 != null) {
            class221.field3806[1].method124(class36.field497 + var8 + 2, class209.field3542 - -1);
            arg1.method2021(class156.field2520, class36.field497 + var8 + 12, class209.field3542 + 10, 16777215, -1);
            class221.field3806[0].method124(var8 + class36.field497 + 2, class209.field3542 - -12);
            arg1.method2021(class176.field2820, class36.field497 + var8 + 12, class209.field3542 + 21, 16777215, -1);
        }
        if (class269.field4570 != null) {
            int var10 = var8 + class36.field497 + 140;
            if (class256.field4329[0] == 0 && class94.field1551[0] == 0) {
                class269.field4570[2].method124(var10, class209.field3542 + 4);
            } else {
                class269.field4570[0].method124(var10, class209.field3542 + 4);
            }
            if (class256.field4329[0] == 0 && class94.field1551[0] == 1) {
                class269.field4570[3].method124(var10 + 15, class209.field3542 + 4);
            } else {
                class269.field4570[1].method124(var10 + 15, class209.field3542 + 4);
            }
            arg0.method2021(class134.field2181, var10 + 32, class209.field3542 + 17, 16777215, -1);
            int var11 = class36.field497 + var8 + 250;
            if (class256.field4329[0] == 1 && class94.field1551[0] == 0) {
                class269.field4570[2].method124(var11, class209.field3542 + 4);
            } else {
                class269.field4570[0].method124(var11, class209.field3542 + 4);
            }
            if (class256.field4329[0] == 1 && class94.field1551[0] == 1) {
                class269.field4570[3].method124(var11 + 15, class209.field3542 + 4);
            } else {
                class269.field4570[1].method124(var11 + 15, class209.field3542 - -4);
            }
            arg0.method2021(class21.field226, var11 + 32, class209.field3542 + 17, 16777215, -1);
            int var12 = class36.field497 - (-var8 - 360);
            if (class256.field4329[0] == 2 && class94.field1551[0] == 0) {
                class269.field4570[2].method124(var12, class209.field3542 + 4);
            } else {
                class269.field4570[0].method124(var12, class209.field3542 + 4);
            }
            if (class256.field4329[0] == 2 && class94.field1551[0] == 1) {
                class269.field4570[3].method124(var12 + 15, class209.field3542 + 4);
            } else {
                class269.field4570[1].method124(var12 + 15, class209.field3542 + 4);
            }
            arg0.method2021(class200.field3383, var12 + 32, class209.field3542 + 17, 16777215, -1);
            int var13 = class36.field497 + var8 + 470;
            if (class256.field4329[0] == 3 && class94.field1551[0] == 0) {
                class269.field4570[2].method124(var13, class209.field3542 + 4);
            } else {
                class269.field4570[0].method124(var13, class209.field3542 + 4);
            }
            if (class256.field4329[0] == 3 && class94.field1551[0] == 1) {
                class269.field4570[3].method124(var13 + 15, class209.field3542 + 4);
            } else {
                class269.field4570[1].method124(var13 + 15, class209.field3542 + 4);
            }
            arg0.method2021(class53.field775, var13 + 32, class209.field3542 + 17, 16777215, -1);
        }
        class311.method2117(class72.field1103 - 68, class209.field3542 + 4, 58, 16, 0);
        class133.field2166 = -1;
        if (class159.field2559 == null) {
            return;
        }
        byte var14 = 88;
        int var15 = class72.field1103 / (var14 + 1);
        byte var16 = 19;
        int var17 = (class24.field266 - 23) / (var16 + 1);
        int var18;
        int var19;
        do {
            var18 = var17;
            var19 = var15;
            if (class8.field86 <= (var15 - 1) * var17) {
                var15--;
            }
            if (((var17 - 1) * var15) >= class8.field86) {
                var17--;
            }
            if (class8.field86 <= (var17 - 1) * var15) {
                var17--;
            }
        } while (var17 != var18 || var15 != var19);
        int var20 = (class72.field1103 - (var14 * var15)) / (var15 + 1);
        if (var20 > 5) {
            var20 = 5;
        }
        int var21 = (class24.field266 - var16 * var17 - 23) / (var17 + 1);
        if (var21 > 5) {
            var21 = 5;
        }
        int var22 = (class24.field266 - (var16 * var17) - (var17 - 1) * var21 - 23) / 2;
        int var23 = (class72.field1103 - (var14 * var15) - ((var15 + -1) * var20)) / 2;
        int var24 = var22 + 23;
        int var25 = var23;
        int var26 = 0;
        for (int var27 = 0; var27 < class8.field86; var27++) {
            class193 var28 = class20.field215[var27];
            class62 var29 = class42.method284(var28.field3239, -128);
            boolean var30 = true;
            if (var28.field3239 == -1) {
                var30 = false;
                var29 = class70.field1069;
            } else if (var28.field3239 > 1980) {
                var29 = class100.field1645;
                var30 = false;
            }
            if (class275.field4725 >= var25 && class221.field3795 >= var24 && class275.field4725 < (var14 + var25) && class221.field3795 < (var16 + var24) && var30) {
                class133.field2166 = var27;
                class159.field2559[var28.field3242 ? 1 : 0].method638(class36.field497 + var25, class209.field3542 + var24, 128, 16777215);
            } else {
                class159.field2559[var28.field3242 ? 1 : 0].method305(class36.field497 + var25, class209.field3542 + var24);
            }
            if (class105.field1713 != null) {
                class105.field1713[var28.field3250 + (var28.field3242 ? class105.field1713.length / 2 : 0)].method124(class36.field497 + var25 + 29, class209.field3542 + var24);
            }
            arg0.method2018(class42.method284(var28.field3252, -125), class36.field497 + var25 + 15, var16 / 2 + 5 + var24 + class209.field3542, 0, -1);
            arg1.method2018(var29, class36.field497 + var25 + 60, var16 / 2 + 5 + class209.field3542 + var24, 268435455, -1);
            var24 += var16 + var21;
            int var10000 = ~var17;
            var26++;
            if (var10000 >= ~var26) {
                var24 = var22 + 23;
                var25 += var14 + var20;
                var26 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lsc;)V", line = 263)
    public static final void method1823(class164 arg0) {
        for (int var1 = arg0.field2651; var1 <= arg0.field2661; var1++) {
            for (int var2 = arg0.field2670; var2 <= arg0.field2657; var2++) {
                class166 var3 = class256.field4320[arg0.field2660][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2724; var4++) {
                        if (var3.field2713[var4] == arg0) {
                            var3.field2724--;
                            for (int var5 = var4; var5 < var3.field2724; var5++) {
                                var3.field2713[var5] = var3.field2713[var5 + 1];
                                var3.field2726[var5] = var3.field2726[var5 + 1];
                            }
                            var3.field2713[var3.field2724] = null;
                            break;
                        }
                    }
                    var3.field2715 = 0;
                    for (int var6 = 0; var6 < var3.field2724; var6++) {
                        var3.field2715 |= var3.field2726[var6];
                    }
                }
            }
        }
    }
}

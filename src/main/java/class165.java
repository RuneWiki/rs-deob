import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class165 {

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2709 = "Close";

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static volatile int field2704 = 0;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
    public static boolean field2711 = false;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field2708 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lug;")
    public static class185 field2703;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ldl;III)V")
    public static final void method1107(class46 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 10) {
            return;
        }
        field2702++;
        if (class275.field4399 < 2 && class183.field2976 == 0 && !class76.field1241) {
            return;
        }
        String var4 = class253.method1678(arg3 ^ 0x56);
        if (arg0 == null) {
            int var6 = class290.field4636.method1631(var4, arg1 + 4, arg2 - -15, 16777215, 0, class67.field1119, class184.field2995);
            class264.method1750(15, class290.field4636.method1622(var4) + var6, arg1 + 4, arg2, (byte) -58);
            return;
        }
        class244 var5 = arg0.method291(arg3 ^ 0x9, class189.field3076);
        if (var5 == null) {
            var5 = class290.field4636;
        }
        var5.method1627(var4, arg1, arg2, arg0.field701, arg0.field715, arg0.field679, arg0.field703, arg0.field662, arg0.field781, class67.field1119, class184.field2995, class90.field1595);
        class264.method1750(class90.field1595[3], class90.field1595[2], class90.field1595[0], class90.field1595[1], (byte) 120);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method1108(byte arg0) {
        int var1 = 15 / ((88 - arg0) / 37);
        class24.field376.method53(true);
        field2710++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method1109(String arg0, String arg1, int arg2, int arg3) {
        field2700++;
        class102.field1792 = arg3;
        class54.field940 = arg0;
        class122.field2142 = arg1;
        if (class54.field940.equals("") || class122.field2142.equals("")) {
            class6.field73 = 3;
        } else if (class146.field2489 == -1) {
            class95.field1646 = 0;
            class6.field73 = -3;
            class52.field917 = 1;
            class176.field2895 = 0;
            class101 var4 = new class101(128);
            var4.method682(10, 22555);
            var4.method698(arg2 - 74, (int) (Math.random() * 9.9999999E7D));
            var4.method640(21691, class103.method702(true, class54.field940));
            var4.method698(-67, (int) (Math.random() * 9.9999999E7D));
            var4.method645(class122.field2142, (byte) 119);
            var4.method698(103, (int) (Math.random() * 9.9999999E7D));
            var4.method675(class262.field4267, class136.field2371, -2585);
            class168.field2778.field1762 = 0;
            class168.field2778.method682(24, arg2 + 22555);
            class168.field2778.method682(var4.field1762 + 2, 22555);
            class168.field2778.method639(539, 15267);
            class168.field2778.method678((byte) 0, var4.field1730, var4.field1762, arg2);
        } else {
            class204.method1347(1);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZIIIIIIIIII)V")
    public static final void method1110(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg8 != 5) {
            field2701 = 89;
        }
        field2712++;
        int var12 = arg10 - arg5;
        int var13 = arg3 - arg7;
        int var14 = 983040 / arg9;
        int var15 = -1;
        if (class196.field3161 > 0) {
            if (class168.field2787 > 10) {
                var15 = (10 + 10 - class168.field2787) * 5;
            } else {
                var15 = class168.field2787 * 5;
            }
        }
        int var16 = 983040 / arg0;
        for (int var17 = -var14; var17 < var12 + var14; var17++) {
            int var19 = arg9 * var17 + arg11 >> 16;
            int var20 = arg11 + ((var17 + 1) * arg9) >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var22 = arg2 + var19;
                int var10000 = arg2 + var20;
                int var24 = var17 + arg5 >> 6;
                if (var24 >= 0 && var24 <= class30.field447.length - 1) {
                    int[][] var25 = class30.field447[var24];
                    for (int var26 = -var16; var26 < (var13 + var16); var26++) {
                        int var27 = arg0 * var26 + arg6 >> 16;
                        int var28 = (var26 + 1) * arg0 + arg6 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            var10000 = arg4 + var28;
                            int var31 = arg4 + var27;
                            int var32 = arg7 + var26 >> 6;
                            if (var32 >= 0 && var25.length - 1 >= var32 && var25[var32] != null) {
                                int var33 = (var26 + arg7 & 0x3F << 6) + (arg5 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class206 var35 = class10.method64(arg8 ^ 0x45, var34 - 1);
                                    if (!class217.field3659[var35.field3393]) {
                                        if (var15 != -1 && class203.field3324 == var35.field3393) {
                                            class25 var36 = new class25();
                                            var36.field385 = var35.field3393;
                                            var36.field389 = var31;
                                            var36.field390 = var22;
                                            class106.field1893.method374(-1, var36);
                                        } else {
                                            class7.field85[var35.field3393].method447(var22 - 7, var31 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class25 var18 = (class25) class106.field1893.method379(6347); var18 != null; var18 = (class25) class106.field1893.method378(-86)) {
            class283.method1848(var18.field390, var18.field389, 15, 16776960, var15);
            class283.method1848(var18.field390, var18.field389, 13, 16776960, var15);
            class283.method1848(var18.field390, var18.field389, 11, 16776960, var15);
            class283.method1848(var18.field390, var18.field389, 9, 16776960, var15);
            class7.field85[var18.field385].method447(var18.field390 - 7, var18.field389 + -7);
        }
        class106.field1893.method377(116);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public static final void method1111(int arg0, int arg1, int arg2) {
        field2706++;
        class55 var3 = class62.method395(13, arg0, (byte) -66);
        var3.method340((byte) -110);
        var3.field947 = arg2;
        if (arg1 != 24) {
            method1108((byte) -68);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static final void method1112(boolean arg0) {
        field2707++;
        class71.field1163++;
        if (!arg0) {
            method1107((class46) null, -87, 88, -94);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public static void method1113(byte arg0) {
        if (arg0 == -19) {
            field2709 = null;
            field2703 = null;
        }
    }
}

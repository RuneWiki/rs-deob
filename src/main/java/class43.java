import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class43 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field644 = 0;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lma;")
    public static class5 field649 = class12.method119("k", (byte) 115);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[I")
    public static int[] field650;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[[[Lek;")
    public static class198[][][] field646;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIILkb;JZ)V", line = 29)
    public static final void method299(int arg0, int arg1, int arg2, int arg3, class280 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class51 var8 = new class51();
        var8.field809 = arg4;
        var8.field812 = arg1 * 128 + 64;
        var8.field810 = arg2 * 128 + 64;
        var8.field811 = arg3;
        var8.field813 = arg5;
        var8.field815 = arg6;
        if (field646[arg0][arg1][arg2] == null) {
            field646[arg0][arg1][arg2] = new class198(arg0, arg1, arg2);
        }
        field646[arg0][arg1][arg2].field3158 = var8;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILni;I)Lfi;", line = 50)
    public static final class222 method300(int arg0, class202 arg1, int arg2) {
        field651++;
        if (class67.method486(arg2, (byte) 125, arg1)) {
            if (arg0 != 0) {
                field650 = (int[]) null;
            }
            return class119.method796((byte) 26);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lma;", line = 87)
    public static final class5 method301(int arg0, int arg1) {
        class5 var2 = class175.method1148(arg1, false);
        if (arg0 != 18343) {
            field644 = -10;
        }
        for (int var3 = var2.method36(30673) - 3; var3 > 0; var3 -= 3) {
            var2 = class288.method1940((byte) 67, new class5[] { var2.method76(0, 0, var3), class90.field1343, var2.method78(-24938, var3) });
        }
        field648++;
        if (var2.method36(30673) <= 9) {
            return var2.method36(30673) > 6 ? class288.method1940((byte) 61, new class5[] { class76.field1199, var2.method76(0, 0, var2.method36(30673) - 4), class189.field2962, class90.field1346, var2, class252.field4181 }) : class288.method1940((byte) 115, new class5[] { class111.field1655, var2, class271.field4642 });
        } else {
            return class288.method1940((byte) 125, new class5[] { class287.field4832, var2.method76(arg0 ^ 0x47A7, 0, var2.method36(30673) - 8), class297.field4999, class90.field1346, var2, class252.field4181 });
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V", line = 126)
    public static final void method302(int arg0, int arg1) {
        int var2 = 112 / ((arg0 + 10) / 60);
        field647++;
        class241.field4004.method517(false, arg1);
        class179.field2712.method517(false, arg1);
        class23.field404.method517(false, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILfl;Lfl;IIILeb;)V", line = 139)
    public static final void method303(int arg0, int arg1, class299 arg2, class299 arg3, int arg4, int arg5, int arg6, class253 arg7) {
        class260.field4434 = arg7;
        field645++;
        class198.field3150 = arg1;
        class176.field2685 = arg4;
        class60.field934 = arg6;
        class259.field4421 = arg5;
        if (class164.field2511 != null) {
            return;
        }
        class23.field402 = true;
        if (class260.field4439 == null) {
            class260.field4439 = class193.method1268(class206.field3285, (byte) -79, 0, class172.field2653);
        }
        if (class249.field4122 == null) {
            class249.field4122 = class241.method1702((byte) -119, class119.field1801, 0, class206.field3285);
        }
        if (class93.field1422 == null) {
            class93.field1422 = class241.method1702((byte) -119, class50.field777, 0, class206.field3285);
        }
        if (class31.field485 == null) {
            class31.field485 = class241.method1702((byte) -119, class59.field920, 0, class206.field3285);
        }
        int var8 = class60.field934 / 5;
        if (arg0 != 1) {
            method302(-115, 75);
        }
        int var9 = class60.field934 / 5 * 4;
        class124.method830(class176.field2685, class198.field3150, class60.field934, class259.field4421, 0, 168);
        class124.method831(class176.field2685, class198.field3150, var8, 23, 12425273, 9135624);
        class124.method831(class176.field2685 + var8, class198.field3150, var9, 23, 5197647, 2697513);
        arg2.method2019(class194.field3020, var8 / 2 + class176.field2685, class198.field3150 - -15, 0, -1);
        if (class31.field485 != null) {
            class31.field485[1].method525(class176.field2685 + var8 + 2, class198.field3150 + 1);
            arg3.method2032(class301.field5091, class176.field2685 + var8 + 12, class198.field3150 - -10, 16777215, -1);
            class31.field485[0].method525(class176.field2685 + var8 + 2, class198.field3150 + 12);
            arg3.method2032(class239.field3975, class176.field2685 - (-var8 - 12), class198.field3150 - -21, 16777215, -1);
        }
        if (class93.field1422 != null) {
            int var10 = class176.field2685 + var8 + 140;
            if (class166.field2535[0] == 0 && class267.field4596[0] == 0) {
                class93.field1422[2].method525(var10, class198.field3150 + 4);
            } else {
                class93.field1422[0].method525(var10, class198.field3150 + 4);
            }
            if (class166.field2535[0] == 0 && class267.field4596[0] == 1) {
                class93.field1422[3].method525(var10 + 15, class198.field3150 + 4);
            } else {
                class93.field1422[1].method525(var10 + 15, class198.field3150 - -4);
            }
            arg2.method2032(class240.field3992, var10 + 32, class198.field3150 + 17, 16777215, -1);
            int var11 = class176.field2685 + var8 + 250;
            if (class166.field2535[0] == 1 && class267.field4596[0] == 0) {
                class93.field1422[2].method525(var11, class198.field3150 + 4);
            } else {
                class93.field1422[0].method525(var11, class198.field3150 + 4);
            }
            if (class166.field2535[0] == 1 && class267.field4596[0] == 1) {
                class93.field1422[3].method525(var11 + 15, class198.field3150 + 4);
            } else {
                class93.field1422[1].method525(var11 + 15, class198.field3150 - -4);
            }
            arg2.method2032(class79.field1232, var11 + 32, class198.field3150 - -17, 16777215, -1);
            int var12 = class176.field2685 + var8 + 360;
            if (class166.field2535[0] == 2 && class267.field4596[0] == 0) {
                class93.field1422[2].method525(var12, class198.field3150 + 4);
            } else {
                class93.field1422[0].method525(var12, class198.field3150 + 4);
            }
            if (class166.field2535[0] == 2 && class267.field4596[0] == 1) {
                class93.field1422[3].method525(var12 + 15, class198.field3150 - -4);
            } else {
                class93.field1422[1].method525(var12 + 15, class198.field3150 - -4);
            }
            arg2.method2032(class221.field3594, var12 + 32, class198.field3150 + 17, 16777215, -1);
            int var13 = class176.field2685 + var8 + 470;
            if (class166.field2535[0] == 3 && class267.field4596[0] == 0) {
                class93.field1422[2].method525(var13, class198.field3150 + 4);
            } else {
                class93.field1422[0].method525(var13, class198.field3150 + 4);
            }
            if (class166.field2535[0] == 3 && class267.field4596[0] == 1) {
                class93.field1422[3].method525(var13 + 15, class198.field3150 + 4);
            } else {
                class93.field1422[1].method525(var13 + 15, class198.field3150 + 4);
            }
            arg2.method2032(class31.field483, var13 + 32, class198.field3150 + 17, 16777215, -1);
        }
        class124.method826(class60.field934 - 68, class198.field3150 + 4, 58, 16, 0);
        class211.field3363 = -1;
        if (class260.field4439 == null) {
            return;
        }
        byte var14 = 88;
        byte var15 = 19;
        int var16 = (class259.field4421 - 23) / (var15 + 1);
        int var17 = class60.field934 / (var14 + 1);
        int var18;
        int var19;
        do {
            var18 = var17;
            if (((var17 - 1) * var16) >= class241.field4023) {
                var17--;
            }
            var19 = var16;
            if (class241.field4023 <= ((var16 - 1) * var17)) {
                var16--;
            }
            if (class241.field4023 <= ((var16 - 1) * var17)) {
                var16--;
            }
        } while (var16 != var19 || var17 != var18);
        int var20 = (class60.field934 - (var14 * var17)) / (var17 + 1);
        if (var20 > 5) {
            var20 = 5;
        }
        int var21 = (class259.field4421 - (var15 * var16) - 23) / (var16 + 1);
        if (var21 > 5) {
            var21 = 5;
        }
        int var22 = (class60.field934 - (var14 * var17) - (var17 - 1) * var20) / 2;
        int var23 = (class259.field4421 - (var15 * var16) - ((var16 + -1) * var21) - 23) / 2;
        int var24 = var23 + 23;
        int var25 = var22;
        int var26 = 0;
        for (int var27 = 0; var27 < class241.field4023; var27++) {
            class303 var28 = class266.field4549[var27];
            boolean var29 = true;
            class5 var30 = class175.method1148(var28.field5118, false);
            if (var28.field5118 == -1) {
                var29 = false;
                var30 = class97.field1452;
            } else if (var28.field5118 > 1980) {
                var30 = class241.field3999;
                var29 = false;
            }
            if (class271.field4636 >= var25 && var24 <= class18.field308 && class271.field4636 < (var14 + var25) && class18.field308 < var24 + var15 && var29) {
                class211.field3363 = var27;
                class260.field4439[var28.field5117 ? 1 : 0].method724(class176.field2685 + var25, class198.field3150 + var24, 128, 16777215);
            } else {
                class260.field4439[var28.field5117 ? 1 : 0].method213(class176.field2685 + var25, class198.field3150 + var24);
            }
            if (class249.field4122 != null) {
                class249.field4122[(var28.field5117 ? class249.field4122.length / 2 : 0) + var28.field5112].method525(class176.field2685 + var25 + 29, class198.field3150 + var24);
            }
            arg2.method2019(class175.method1148(var28.field5100, false), class176.field2685 + var25 + 15, var15 / 2 + class198.field3150 + var24 + 5, 0, -1);
            arg3.method2019(var30, var25 + class176.field2685 + 60, var24 - -5 + var15 / 2 + class198.field3150, 268435455, -1);
            var24 += var15 + var21;
            int var10000 = ~var16;
            var26++;
            if (var10000 >= ~var26) {
                var24 = var23 + 23;
                var26 = 0;
                var25 += var20 + var14;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 358)
    public static void method304(int arg0) {
        field646 = (class198[][][]) null;
        field650 = null;
        field649 = null;
        if (arg0 != 9) {
            method299(-59, 105, -57, -123, (class280) null, 117L, true);
        }
    }
}

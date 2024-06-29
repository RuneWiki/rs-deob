import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class306 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field4884 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[Lbl;")
    public static class146[] field4889;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method2044(int arg0) {
        if (arg0 != 4096) {
            field4884 = -22;
        }
        field4889 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
    public static final int method2045(int arg0) {
        if (arg0 != -18104) {
            method2046((byte) -78, -29, 75, -101, 65, -84, -115, -7);
        }
        field4888++;
        return class298.field4759 && class100.field1627[81] && class83.field1384 > 2 ? class177.field2904[class83.field1384 - 2] : class177.field2904[class83.field1384 - 1];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2046(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= -82) {
            method2044(78);
        }
        field4886++;
        if (arg6 < 1 || arg7 < 1 || arg6 > 102 || arg7 > 102) {
            return;
        }
        if (!class129.method918(false) && (class301.field4818[0][arg6][arg7] & 0x2) == 0) {
            int var8 = arg1;
            if ((class301.field4818[arg1][arg6][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class287.field4606 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class301.field4818[1][arg6][arg7] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class131.method925(arg6, arg4, var9, arg7, arg1, class131.field2065[arg1], (byte) -99);
        if (arg3 < 0) {
            return;
        }
        boolean var10 = class100.field1609;
        class100.field1609 = true;
        class137.method957(arg2, false, arg6, arg3, arg5, false, var9, (byte) 3, arg7, class131.field2065[arg1], arg1);
        class100.field1609 = var10;
        return;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Led;Ljh;I)V")
    public static final void method2047(class50 arg0, class269 arg1, int arg2) {
        field4885++;
        class260 var3 = arg0.method353(0);
        if (var3 == null) {
            return;
        }
        int var4 = var3.field3603;
        int var5 = arg1.field4327;
        int var6 = arg1.field4335;
        if (var3.field3605 > var3.field3603) {
            var4 = var3.field3605;
        }
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (arg0.field819 != null) {
            var7 = class78.field1311.method633(arg0.field819, (int[]) null, class72.field1216);
            for (int var10 = 0; var10 < var7; var10++) {
                String var11 = class72.field1216[var10];
                if ((var7 - 1) > var10) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class59.field968.method983(var11);
                if (var12 > var9) {
                    var9 = var12;
                }
            }
            var8 = (var7 - 1) * class59.field968.method989() + class59.field968.method982() / 2;
        }
        int var13 = arg1.field4327;
        if (var5 < class275.field4420 + var4) {
            var13 = var9 / 2 + var4 / 2 + (class275.field4420 - -var4) + 5;
            var5 = class275.field4420 + var4;
        } else if (var5 > class275.field4423 - var4) {
            var5 = class275.field4423 - var4;
            var13 = class275.field4423 - (var4 / 2) - (var9 / 2) - var4 - 5;
        }
        int var14 = arg1.field4335 - (var8 / 2);
        if (class275.field4424 + var4 > var6) {
            var6 = class275.field4424 + var4;
            var14 = var4 / 2 + class275.field4424 + var4 + class59.field968.method989();
        } else if (var6 > (class275.field4434 - var4)) {
            var14 = class275.field4434 - var4 / 2 - var4 - var8;
            var6 = class275.field4434 - var4;
        }
        int var15 = var4 >> 1;
        int var16 = -2;
        int var17 = (int) (Math.atan2((double) (var5 - arg1.field4327), (double) (var6 - arg1.field4335)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        if (arg2 < 51) {
            field4884 = 42;
        }
        var3.method1751(var3.field3597 << 3, var3.field3601 << 3, (var5 << 4) + var15, (var6 << 4) + var15, var17, 4096);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        if (arg0.field819 != null) {
            var19 = var14 - class59.field968.method982() - 3;
            var16 = var13 - (var9 / 2) - 5;
            var20 = var19 + class59.field968.method989() * var7;
            var18 = var9 + var16 + 10;
            if (arg0.field827 != 0) {
                class127.method881(var16, var19, var18 - var16, var20 - var19, arg0.field827, arg0.field827 >>> 24);
            }
            if (arg0.field846 != 0) {
                class127.method895(var16, var19, var18 - var16, -var19 + var20, arg0.field846, arg0.field846 >>> 24);
            }
            for (int var21 = 0; var21 < var7; var21++) {
                String var22 = class72.field1216[var21];
                if (var21 < var7 - 1) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class59.field968.method981(var22, var13, var14, arg0.field821, true);
                var14 += class59.field968.method989();
            }
        }
        if (var5 - var15 >= class269.field4344 || (var5 + var15) <= class269.field4344 || var6 - var15 >= class77.field1281 || (var6 + var15) <= class77.field1281 && var16 >= class269.field4344 || class269.field4344 >= var18 || class77.field1281 <= var19 || class77.field1281 >= var20) {
            return;
        }
        if (arg0.field833[4] != null) {
            class266.method1789(arg0.field844, 0, 0, arg0.field833[4], (long) arg1.field4333, -1, -7, (short) 1006);
        }
        if (arg0.field833[3] != null) {
            class266.method1789(arg0.field844, 0, 0, arg0.field833[3], (long) arg1.field4333, -1, -12, (short) 1012);
        }
        if (arg0.field833[2] != null) {
            class266.method1789(arg0.field844, 0, 0, arg0.field833[2], (long) arg1.field4333, -1, -46, (short) 1009);
        }
        if (arg0.field833[1] != null) {
            class266.method1789(arg0.field844, 0, 0, arg0.field833[1], (long) arg1.field4333, -1, -82, (short) 1010);
        }
        if (arg0.field833[0] != null) {
            class266.method1789(arg0.field844, 0, 0, arg0.field833[0], (long) arg1.field4333, -1, 116, (short) 1011);
            return;
        }
    }
}

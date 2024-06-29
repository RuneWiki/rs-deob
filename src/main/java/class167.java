import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class167 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Ljk;")
    public static class76 field2678 = new class76();

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 11)
    public static final int method1160(int arg0, KeyEvent arg1) {
        field2679++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return arg0 <= 110 ? 51 : var2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILj;)Lhl;", line = 32)
    public static final class140 method1161(int arg0, class153 arg1) {
        if (arg0 != 0) {
            field2678 = (class76) null;
        }
        field2677++;
        return new class140(arg1.method1081((byte) -99), arg1.method1081((byte) -108), arg1.method1081((byte) 120), arg1.method1081((byte) -64), arg1.method1088(arg0 - 30917), arg1.method1042((byte) 87));
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[B", line = 44)
    public static final synchronized byte[] method1162(int arg0, int arg1) {
        field2680++;
        if (arg0 == 100 && class166.field2668 > 0) {
            byte[] var2 = class144.field2214[--class166.field2668];
            class144.field2214[class166.field2668] = null;
            return var2;
        } else if (arg0 == 5000 && class28.field360 > 0) {
            byte[] var3 = class237.field3787[--class28.field360];
            class237.field3787[class28.field360] = null;
            return var3;
        } else if (arg0 == 30000 && class188.field2988 > 0) {
            byte[] var4 = class67.field881[--class188.field2988];
            class67.field881[class188.field2988] = null;
            return var4;
        } else {
            int var5 = 104 % ((66 - arg1) / 57);
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)V", line = 79)
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class94 var7 = new class94();
        var7.field1493 = arg1 / 128;
        var7.field1485 = arg2 / 128;
        var7.field1486 = arg3 / 128;
        var7.field1494 = arg4 / 128;
        var7.field1483 = arg0;
        var7.field1496 = arg1;
        var7.field1489 = arg2;
        var7.field1488 = arg3;
        var7.field1487 = arg4;
        var7.field1500 = arg5;
        var7.field1503 = arg6;
        class240.field3900[class288.field4856++] = var7;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 98)
    public static void method1164(byte arg0) {
        if (arg0 > 101) {
            field2678 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ldk;B)V", line = 124)
    public static final void method1165(class241 arg0, byte arg1) {
        int var2 = 0 % ((arg1 + 5) / 48);
        class122.field1899 = arg0;
        field2675++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)V", line = 134)
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2681++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg7 - arg3;
        int var12 = arg7 * arg7;
        int var13 = arg5 * arg5;
        int var14 = arg5 - arg3;
        int var15 = var14 * var14;
        int var16 = var11 * var11;
        if (arg2 != 11550) {
            field2678 = (class76) null;
        }
        int var17 = var12 << 1;
        int var18 = arg5 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = var13 << 1;
        int var22 = (1 - var18) * var12 + var21;
        int var23 = var13 - ((var18 - 1) * var17);
        int var24 = var14 << 1;
        int var25 = (1 - var24) * var16 + var20;
        int var26 = var15 - ((var24 - 1) * var19);
        int var27 = var12 << 2;
        int var28 = var16 << 2;
        int var29 = var15 << 2;
        int var30 = var21 * 3;
        int var31 = (var18 - 3) * var17;
        int var32 = var13 << 2;
        int var33 = var20 * 3;
        int var34 = var32;
        int var35 = (arg5 - 1) * var27;
        int var36 = (var24 - 3) * var19;
        int var37 = (var14 - 1) * var28;
        int var38 = var29;
        if (arg4 >= class9.field112 && arg4 <= class44.field538) {
            int[] var39 = class284.field4810[arg4];
            int var40 = class54.method301(class65.field874, arg0 - arg7, class150.field2331, 119);
            int var41 = class54.method301(class65.field874, arg0 + arg7, class150.field2331, 67);
            int var42 = class54.method301(class65.field874, arg0 - var11, class150.field2331, arg2 - 11448);
            int var43 = class54.method301(class65.field874, arg0 + var11, class150.field2331, 75);
            class133.method925(arg2 + 3128, var40, arg6, var42, var39);
            class133.method925(14678, var42, arg1, var43, var39);
            class133.method925(14678, var43, arg6, var41, var39);
        }
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var23 += var34;
                    var8++;
                    var34 += var32;
                    var22 += var30;
                    var30 += var32;
                }
            }
            if (var23 < 0) {
                var22 += var30;
                var23 += var34;
                var8++;
                var34 += var32;
                var30 += var32;
            }
            boolean var44 = var14 >= var9;
            var9--;
            var23 += -var31;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var26 += var38;
                        var25 += var33;
                        var38 += var29;
                        var33 += var29;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var38;
                    var25 += var33;
                    var33 += var29;
                    var38 += var29;
                }
                var26 += -var36;
                var25 += -var37;
                var37 -= var28;
                var36 -= var28;
            }
            var31 -= var27;
            var22 += -var35;
            int var45 = arg4 - var9;
            int var46 = arg4 + var9;
            if (var46 >= class9.field112 && var45 <= class44.field538) {
                int var47 = class54.method301(class65.field874, arg0 + var8, class150.field2331, -67);
                int var48 = class54.method301(class65.field874, arg0 - var8, class150.field2331, 113);
                if (var44) {
                    int var49 = class54.method301(class65.field874, arg0 + var10, class150.field2331, 84);
                    int var50 = class54.method301(class65.field874, arg0 - var10, class150.field2331, -61);
                    if (class9.field112 <= var45) {
                        int[] var51 = class284.field4810[var45];
                        class133.method925(arg2 + 3128, var48, arg6, var50, var51);
                        class133.method925(14678, var50, arg1, var49, var51);
                        class133.method925(14678, var49, arg6, var47, var51);
                    }
                    if (var46 <= class44.field538) {
                        int[] var52 = class284.field4810[var46];
                        class133.method925(arg2 ^ 0x1448, var48, arg6, var50, var52);
                        class133.method925(14678, var50, arg1, var49, var52);
                        class133.method925(arg2 ^ 0x1448, var49, arg6, var47, var52);
                    }
                } else {
                    if (class9.field112 <= var45) {
                        class133.method925(14678, var48, arg6, var47, class284.field4810[var45]);
                    }
                    if (class44.field538 >= var46) {
                        class133.method925(14678, var48, arg6, var47, class284.field4810[var46]);
                    }
                }
            }
            var35 -= var27;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class33 extends class148 {

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "S")
    public static short field508 = 320;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Z")
    public static boolean field509;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILag;IIBIII)V")
    public static final void method218(int arg0, class211 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field504++;
        int var8 = arg2 * arg2 + arg7 * arg7;
        if (var8 > arg5) {
            return;
        }
        if (arg4 > -63) {
            field509 = false;
        }
        int var9 = Math.min(arg1.field3430 / 2, arg1.field3394 / 2);
        if (var8 <= var9 * var9) {
            class99.method676(arg6, arg7, class241.field3845[arg3], arg0, 26670, arg1, arg2);
            return;
        }
        var9 -= 10;
        int var10;
        if (class120.field1919 == 4) {
            var10 = (int) class90.field1456 & 0x7FF;
        } else {
            var10 = (int) class90.field1456 + class173.field2831 & 0x7FF;
        }
        int var11 = class302.field4824[var10];
        int var12 = class302.field4823[var10];
        if (class120.field1919 != 4) {
            var11 = var11 * 256 / (class292.field4687 + 256);
            var12 = var12 * 256 / (class292.field4687 + 256);
        }
        int var13 = arg2 * var12 + arg7 * var11 >> 16;
        int var14 = arg2 * var11 - arg7 * var12 >> 16;
        double var15 = Math.atan2((double) var13, (double) var14);
        int var17 = (int) ((double) var9 * Math.sin(var15));
        int var18 = (int) ((double) var9 * Math.cos(var15));
        ((class232) class78.field1312[arg3]).method1396(arg1.field3430 / 2 + arg6 + var17 - 10, arg1.field3394 / 2 + arg0 - (var18 + 10), 20, 20, 15, 15, var15, 256);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method219(boolean arg0, int arg1) {
        field505++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class192.field3103[arg1];
        if (arg0) {
            field509 = true;
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILnb;Lnb;)V")
    public static final void method220(int arg0, class137 arg1, class137 arg2) {
        if (arg2.field2163 != null) {
            arg2.method956(256);
        }
        field506++;
        arg2.field2173 = arg1.field2173;
        if (arg0 > 124) {
            arg2.field2163 = arg1;
            arg2.field2163.field2173 = arg2;
            arg2.field2173.field2163 = arg2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method221(int arg0) {
        class86.field1418 = 0;
        if (arg0 != -26373) {
            return;
        }
        class130.field2033 = false;
        class237.field3804 = 0;
        class178.field2908 = 0;
        field510++;
        class53.field883 = 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field507++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg6 - arg1;
        int var12 = arg6 * arg6;
        int var13 = arg7 - arg1;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 << 1;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = arg7 << 1;
        int var20 = (1 - var19) * var12 + var17;
        int var21 = var13 << 1;
        int var22 = var13 * var13;
        int var23 = var14 - ((var19 - 1) * var16);
        int var24 = var12 << 2;
        int var25 = var22 - (var21 - 1) * var18;
        int var26 = var22 << 1;
        int var27 = (1 - var21) * var15 + var26;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var22 << 2;
        int var31 = (var19 - 3) * var16;
        int var32 = var26 * 3;
        int var33 = var17 * 3;
        int var34 = (var21 - 3) * var18;
        int var35 = var28;
        if (arg0 != 2000) {
            method220(-86, (class137) null, (class137) null);
        }
        int var36 = (arg7 - 1) * var24;
        int var37 = (var13 - 1) * var29;
        int var38 = var30;
        if (arg5 >= class85.field1409 && class234.field3774 >= arg5) {
            int[] var39 = class204.field3253[arg5];
            int var40 = class123.method866(class82.field1374, arg4 - arg6, (byte) 65, class259.field4188);
            int var41 = class123.method866(class82.field1374, arg4 + arg6, (byte) 75, class259.field4188);
            int var42 = class123.method866(class82.field1374, arg4 - var11, (byte) -88, class259.field4188);
            int var43 = class123.method866(class82.field1374, arg4 + var11, (byte) 110, class259.field4188);
            class73.method494(arg3, var39, 4028, var42, var40);
            class73.method494(arg2, var39, arg0 + 2028, var43, var42);
            class73.method494(arg3, var39, arg0 + 2028, var41, var43);
        }
        while (var9 > 0) {
            if (var20 < 0) {
                while (var20 < 0) {
                    var23 += var35;
                    var8++;
                    var20 += var33;
                    var33 += var28;
                    var35 += var28;
                }
            }
            if (var23 < 0) {
                var8++;
                var20 += var33;
                var23 += var35;
                var33 += var28;
                var35 += var28;
            }
            boolean var44 = var13 >= var9;
            var20 += -var36;
            if (var44) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var10++;
                        var27 += var32;
                        var25 += var38;
                        var38 += var30;
                        var32 += var30;
                    }
                }
                if (var25 < 0) {
                    var10++;
                    var25 += var38;
                    var38 += var30;
                    var27 += var32;
                    var32 += var30;
                }
                var25 += -var34;
                var27 += -var37;
                var34 -= var29;
                var37 -= var29;
            }
            var9--;
            var23 += -var31;
            var36 -= var24;
            var31 -= var24;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (class85.field1409 <= var46 && class234.field3774 >= var45) {
                int var47 = class123.method866(class82.field1374, arg4 + var8, (byte) -87, class259.field4188);
                int var48 = class123.method866(class82.field1374, arg4 - var8, (byte) -76, class259.field4188);
                if (var44) {
                    int var49 = class123.method866(class82.field1374, arg4 + var10, (byte) -120, class259.field4188);
                    int var50 = class123.method866(class82.field1374, arg4 - var10, (byte) 81, class259.field4188);
                    if (var45 >= class85.field1409) {
                        int[] var51 = class204.field3253[var45];
                        class73.method494(arg3, var51, arg0 + 2028, var50, var48);
                        class73.method494(arg2, var51, 4028, var49, var50);
                        class73.method494(arg3, var51, arg0 ^ 0x86C, var47, var49);
                    }
                    if (class234.field3774 >= var46) {
                        int[] var52 = class204.field3253[var46];
                        class73.method494(arg3, var52, 4028, var50, var48);
                        class73.method494(arg2, var52, arg0 ^ 0x86C, var49, var50);
                        class73.method494(arg3, var52, 4028, var47, var49);
                    }
                } else {
                    if (var45 >= class85.field1409) {
                        class73.method494(arg3, class204.field3253[var45], 4028, var47, var48);
                    }
                    if (class234.field3774 >= var46) {
                        class73.method494(arg3, class204.field3253[var46], 4028, var47, var48);
                    }
                }
            }
        }
    }
}

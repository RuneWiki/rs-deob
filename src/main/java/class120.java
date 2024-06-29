import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class120 extends class198 {

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field1624 = 0;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1623 = 0;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "S")
    public static short field1630 = 320;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Z")
    public static boolean field1626;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[Lvj;")
    public static class256[] field1622;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public static final void method733(int arg0, int arg1, int arg2) {
        field1627++;
        class276 var3 = class264.method1816((byte) -101, arg1, 12);
        if (arg2 < 14) {
            method733(-37, 45, 59);
        }
        var3.method1876((byte) -118);
        var3.field3986 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)I")
    public static final int method734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            return 106;
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        field1618++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 - (arg0 + arg6 - 1);
        } else {
            return 7 + 1 - arg2 - arg4;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLak;Lvq;Lmq;)V")
    public static final void method735(byte arg0, class194 arg1, class269 arg2, class297 arg3) {
        field1631++;
        class256 var4 = arg3.method2004(-1989296707, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method87();
        if (var5 < var4.method80()) {
            var5 = var4.method80();
        }
        byte var6 = 10;
        int var7 = arg1.field2791;
        if (arg0 != 85) {
            return;
        }
        int var8 = arg1.field2792;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field4310 != null) {
            var9 = class423.field6036.method1310((int[]) null, class410.field5885, (class256[]) null, arg3.field4310, true);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class410.field5885[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class206.field2915.method2508(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class206.field2915.method2506() + class206.field2915.method2509() / 2;
        }
        int var15 = var5 / 2 + arg1.field2791;
        int var16 = arg1.field2792;
        if (class176.field2482 + var5 > var7) {
            var15 = var10 / 2 + var5 / 2 + class176.field2482 + var6 + 5;
            var7 = class176.field2482;
        } else if ((class176.field2479 - var5) < var7) {
            var15 = class176.field2479 - (var5 / 2) - (var10 / 2) - var6 - 5;
            var7 = class176.field2479 - var5;
        }
        if (class176.field2474 + var5 > var8) {
            var8 = class176.field2474;
            var16 = var6 + (var5 / 2) + class176.field2474;
        } else if ((class176.field2481 - var5) < var8) {
            var16 = class176.field2481 - (var5 / 2) - var6 - var11;
            var8 = class176.field2481 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field2791), (double) (var8 - arg1.field2792)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method1776((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field4310 != null) {
            var19 = var16;
            var18 = var15 - var10 / 2 - 5;
            var21 = var16 + var9 * class206.field2915.method2506() + 3;
            var20 = var10 + var18 + 10;
            if (arg3.field4322 != 0) {
                arg2.method1832(var18, arg3.field4322, var20 - var18, 1, var16, var21 - var16);
            }
            if (arg3.field4296 != 0) {
                arg2.method1837(var16, var21 - var16, var20 - var18, arg3.field4296, (byte) -106, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class410.field5885[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class206.field2915.method2510(arg2, var23, var15, var16, arg3.field4316, true);
                var16 += class206.field2915.method2506();
            }
        }
        if (arg3.field4307 == -1 && arg3.field4310 == null) {
            return;
        }
        class249 var24 = new class249(arg1);
        int var25 = var5 >> 1;
        var24.field3714 = var20;
        var24.field3710 = var18;
        var24.field3719 = var19;
        var24.field3717 = var7 - var25;
        var24.field3715 = var7 + var25;
        var24.field3708 = var21;
        var24.field3713 = var8 + var25;
        var24.field3718 = var8 - var25;
        class301.field4388.method2756(124, var24);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lvq;Lkm;III)V")
    public static final void method736(class269 arg0, class198 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class394.field5548) {
            class74 var5 = class385.field5449[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field969 != null && var5.field969.method610(-439)) {
                arg1.method611(arg0, true, var5.field969, 0, 128, (byte) 77, 0);
            }
        }
        if (arg4 < class394.field5548) {
            class74 var6 = class385.field5449[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field969 != null && var6.field969.method610(-439)) {
                arg1.method611(arg0, true, var6.field969, 128, 0, (byte) 53, 0);
            }
        }
        if (arg3 < class394.field5548 && arg4 < class407.field5751) {
            class74 var7 = class385.field5449[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field969 != null && var7.field969.method610(-439)) {
                arg1.method611(arg0, true, var7.field969, 128, 128, (byte) -109, 0);
            }
        }
        if (arg3 < class394.field5548 && arg4 > 0) {
            class74 var8 = class385.field5449[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field969 != null && var8.field969.method610(-439)) {
                arg1.method611(arg0, true, var8.field969, -128, 128, (byte) -55, 0);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public static void method737(byte arg0) {
        if (arg0 != 51) {
            field1620 = -91;
        }
        field1622 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IIII)V")
    public class120(int arg0, int arg1, int arg2, int arg3) {
        this.field1629 = arg2;
        this.field1628 = arg3;
        this.field1621 = arg1;
        this.field1619 = arg0;
    }
}

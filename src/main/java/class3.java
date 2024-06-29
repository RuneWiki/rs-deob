import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Z")
    public static boolean field27 = false;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lqfa;")
    public static class98 field29 = new class98(33, -2);

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "J")
    public static long field32 = 0L;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field33;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method10(byte arg0) {
        field29 = null;
        field33 = null;
        if (arg0 != -68) {
            method13(null, (byte) 118, null);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field25++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        if (arg6 != -1587516607) {
            return;
        }
        int var11 = arg5 - arg7;
        int var12 = arg2 - arg7;
        int var13 = arg5 * arg5;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class143.field2050 <= arg1 && arg1 <= class461.field6495) {
            int[] var39 = class445.field6320[arg1];
            int var40 = class24.method150(arg0 - arg5, class71.field960, false, class549.field7665);
            int var41 = class24.method150(arg0 + arg5, class71.field960, false, class549.field7665);
            int var42 = class24.method150(arg0 - var11, class71.field960, false, class549.field7665);
            int var43 = class24.method150(arg0 + var11, class71.field960, false, class549.field7665);
            class643.method3557(var40, var39, (byte) 74, arg3, var42);
            class643.method3557(var42, var39, (byte) 70, arg4, var43);
            class643.method3557(var43, var39, (byte) 67, arg3, var41);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (class143.field2050 <= var46 && var45 <= class461.field6495) {
                int var47 = class24.method150(arg0 + var8, class71.field960, false, class549.field7665);
                int var48 = class24.method150(arg0 - var8, class71.field960, false, class549.field7665);
                if (var44) {
                    int var49 = class24.method150(arg0 + var10, class71.field960, false, class549.field7665);
                    int var50 = class24.method150(arg0 - var10, class71.field960, false, class549.field7665);
                    if (var45 >= class143.field2050) {
                        int[] var51 = class445.field6320[var45];
                        class643.method3557(var48, var51, (byte) 57, arg3, var50);
                        class643.method3557(var50, var51, (byte) 106, arg4, var49);
                        class643.method3557(var49, var51, (byte) 99, arg3, var47);
                    }
                    if (class461.field6495 >= var46) {
                        int[] var52 = class445.field6320[var46];
                        class643.method3557(var48, var52, (byte) 78, arg3, var50);
                        class643.method3557(var50, var52, (byte) 80, arg4, var49);
                        class643.method3557(var49, var52, (byte) 121, arg3, var47);
                    }
                } else {
                    if (var45 >= class143.field2050) {
                        class643.method3557(var48, class445.field6320[var45], (byte) 102, arg3, var47);
                    }
                    if (var46 <= class461.field6495) {
                        class643.method3557(var48, class445.field6320[var46], (byte) 95, arg3, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)I")
    public final int method12(int arg0, int arg1, int arg2) {
        field24++;
        int var4 = arg0 >= class446.field6323 ? arg0 : class446.field6323;
        if (class728.field10183 == this) {
            return 0;
        }
        if (arg2 > -62) {
            field29 = null;
        }
        if (class48.field563 == this) {
            return var4 - arg1;
        } else if (class347.field4912 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lvc;BLjava/awt/Frame;)V")
    public static final void method13(class316 arg0, byte arg1, Frame arg2) {
        while (true) {
            class249 var3 = arg0.method2054(arg2, -108);
            while (var3.field3310 == 0) {
                class756.method4205(10L, arg1 ^ 0xFFFFFF98);
            }
            if (var3.field3310 == 1) {
                field31++;
                arg2.setVisible(false);
                arg2.dispose();
                if (arg1 != -104) {
                    field32 = 85L;
                    return;
                }
                return;
            }
            class756.method4205(100L, 0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(III)V")
    public static final void method14(int arg0, int arg1, int arg2) {
        field28++;
        if (arg1 <= 100) {
            return;
        }
        int var3 = class119.field1441.method992(class71.field920.method588((byte) 95, class549.field7669), (byte) -99);
        int var5;
        if (class600.field8427) {
            for (class508 var7 = (class508) class455.field6429.method4000((byte) -7); var7 != null; var7 = (class508) class455.field6429.method4002(-58)) {
                int var10;
                if (var7.field7268 == 1) {
                    var10 = class392.method2465(4, (class37) var7.field7267.field9891.field8206);
                } else {
                    var10 = class493.method2948(var7, (byte) -83);
                }
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            class225.field3039 = class350.field4958 * 16 + (class273.field3903 ? 26 : 22);
            var3 += 8;
            var5 = class350.field4958 * 16 + 21;
        } else {
            for (class37 var4 = (class37) class215.field2820.method2765(-12261); var4 != null; var4 = (class37) class215.field2820.method2759(-15361)) {
                int var6 = class392.method2465(4, var4);
                if (var3 < var6) {
                    var3 = var6;
                }
            }
            var5 = class25.field341 * 16 + 21;
            class225.field3039 = (class273.field3903 ? 26 : 22) + class25.field341 * 16;
            var3 += 8;
        }
        int var8 = arg2 - (var3 / 2);
        if (var3 + var8 > class446.field6323) {
            var8 = class446.field6323 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if (arg0 + var5 > class172.field2348) {
            var9 = class172.field2348 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class208.field2732 = var8;
        class436.field6192 = true;
        class470.field6668 = var3;
        class652.field8959 = var9;
    }

    @OriginalMember(owner = "client!dp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field26++;
        throw new IllegalStateException();
    }
}

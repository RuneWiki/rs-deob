import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class99 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Luh;")
    public static class242 field1783 = class164.method1078(7);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1785 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[I")
    public static int[] field1786 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lvg;")
    public static class230 field1787;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
    public static int[] field1784;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1784 = null;
        field1786 = null;
        if (arg0 != -18000) {
            field1785 = -3;
        }
        field1783 = null;
        field1787 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method584(int arg0) {
        class123.field2161 = arg0;
        for (int var1 = 0; var1 < class36.field621; var1++) {
            for (int var2 = 0; var2 < class56.field1091; var2++) {
                if (class7.field122[arg0][var1][var2] == null) {
                    class7.field122[arg0][var1][var2] = new class120(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1779++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg5 - arg7;
        int var12 = arg0 - arg7;
        int var13 = arg0 * arg0;
        int var14 = var13 << 1;
        int var15 = arg5 * arg5;
        int var16 = var11 * var11;
        int var17 = var15 << 1;
        int var18 = var12 * var12;
        int var19 = var16 << 1;
        int var20 = var18 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = var13 - ((var21 - 1) * var17);
        int var24 = (1 - var21) * var15 + var14;
        int var25 = var18 - (var22 - 1) * var19;
        int var26 = (1 - var22) * var16 + var20;
        int var27 = var15 << 2;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var18 << 2;
        int var31 = var14 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = var20 * 3;
        int var34 = (var22 - 3) * var19;
        int var35 = var28;
        int var36 = var30;
        int var37 = (arg0 - 1) * var27;
        int var38 = (arg3 + var12) * var29;
        int[] var39 = class15.field268[arg6];
        class289.method1927(var39, arg4, arg2 - arg5, -104, -var11 + arg2);
        class289.method1927(var39, arg1, arg2 - var11, -99, arg2 + var11);
        class289.method1927(var39, arg4, arg2 + var11, -118, arg2 + arg5);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var25 += var36;
                        var26 += var33;
                        var36 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var25 < 0) {
                    var26 += var33;
                    var33 += var30;
                    var25 += var36;
                    var36 += var30;
                    var10++;
                }
                var26 += -var38;
                var25 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var8++;
                    var24 += var31;
                    var23 += var35;
                    var35 += var28;
                    var31 += var28;
                }
            }
            var9--;
            int var41 = arg6 - var9;
            int var42 = arg6 + var9;
            if (var23 < 0) {
                var23 += var35;
                var8++;
                var24 += var31;
                var35 += var28;
                var31 += var28;
            }
            int var43 = arg2 + var8;
            var23 += -var32;
            int var44 = arg2 - var8;
            var24 += -var37;
            var32 -= var27;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class289.method1927(class15.field268[var41], arg4, var44, -94, var46);
                class289.method1927(class15.field268[var41], arg1, var46, -108, var45);
                class289.method1927(class15.field268[var41], arg4, var45, -96, var43);
                class289.method1927(class15.field268[var42], arg4, var44, -109, var46);
                class289.method1927(class15.field268[var42], arg1, var46, arg3 - 70, var45);
                class289.method1927(class15.field268[var42], arg4, var45, -92, var43);
            } else {
                class289.method1927(class15.field268[var41], arg4, var44, -77, var43);
                class289.method1927(class15.field268[var42], arg4, var44, -71, var43);
            }
            var37 -= var27;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
    public static final boolean method586(int arg0, byte arg1) {
        if (arg1 <= 13) {
            field1783 = null;
        }
        field1780++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)I")
    public static final int method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg6;
            arg6 = var8;
        }
        field1781++;
        if (var7 == 0) {
            return arg5;
        } else if (arg0 == var7) {
            return arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg3;
        } else {
            return 1 + 7 - arg6 - arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgf;Lgf;I)V")
    public static final void method588(class7 arg0, class7 arg1, int arg2) {
        class264.field4756 = arg1;
        field1782++;
        if (arg2 == 23450) {
            class88.field1601 = arg0;
            class16.field288 = class88.field1601.method60(-106, 3);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class505 {

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public int field7146 = 8;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public int field7139 = 16777215;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public int field7141;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public int field7144;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    public int field7148;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public int field7150;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public int field7151;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "Z")
    public boolean field7143;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
    public static final void method3027(int arg0) throws class677 {
        field7140++;
        if (class727.field10184 == 1) {
            class434.field5738.method5(class168.field2025, class533.field7512);
        } else {
            class434.field5738.method5(0, 0);
        }
        int var1 = -122 % ((arg0 - 12) / 56);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Les;B)V")
    public final void method3028(class403 arg0, byte arg1) {
        if (arg1 <= 34) {
            return;
        }
        while (true) {
            int var3 = arg0.method2396((byte) 26);
            if (var3 == 0) {
                field7145++;
                return;
            }
            this.method3031(arg0, -5, var3);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7149++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg3 - arg2;
        int var12 = arg5 - arg2;
        int var13 = arg3 * arg3;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        if (arg7 != -1682589791) {
            return;
        }
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class187.field2268 <= arg0 && arg0 <= class461.field6480) {
            int[] var39 = class4.field49[arg0];
            int var40 = class155.method1103(class471.field6572, arg4 - arg3, false, class223.field2604);
            int var41 = class155.method1103(class471.field6572, arg3 + arg4, false, class223.field2604);
            int var42 = class155.method1103(class471.field6572, arg4 - var11, false, class223.field2604);
            int var43 = class155.method1103(class471.field6572, arg4 + var11, false, class223.field2604);
            class455.method2755(arg1, var39, (byte) 71, var42, var40);
            class455.method2755(arg6, var39, (byte) 106, var43, var42);
            class455.method2755(arg1, var39, (byte) 99, var41, var43);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var46 >= class187.field2268 && class461.field6480 >= var45) {
                int var47 = class155.method1103(class471.field6572, arg4 + var8, false, class223.field2604);
                int var48 = class155.method1103(class471.field6572, arg4 - var8, false, class223.field2604);
                if (var44) {
                    int var49 = class155.method1103(class471.field6572, arg4 + var10, false, class223.field2604);
                    int var50 = class155.method1103(class471.field6572, arg4 - var10, false, class223.field2604);
                    if (var45 >= class187.field2268) {
                        int[] var51 = class4.field49[var45];
                        class455.method2755(arg1, var51, (byte) 88, var50, var48);
                        class455.method2755(arg6, var51, (byte) 29, var49, var50);
                        class455.method2755(arg1, var51, (byte) 57, var47, var49);
                    }
                    if (var46 <= class461.field6480) {
                        int[] var52 = class4.field49[var46];
                        class455.method2755(arg1, var52, (byte) 98, var50, var48);
                        class455.method2755(arg6, var52, (byte) 51, var49, var50);
                        class455.method2755(arg1, var52, (byte) 100, var47, var49);
                    }
                } else {
                    if (var45 >= class187.field2268) {
                        class455.method2755(arg1, class4.field49[var45], (byte) 101, var47, var48);
                    }
                    if (class461.field6480 >= var46) {
                        class455.method2755(arg1, class4.field49[var46], (byte) 112, var47, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)Z")
    public static final boolean method3030(byte arg0) {
        if (arg0 != 125) {
            method3029(-109, 37, -15, -117, -74, 21, -52, 73);
        }
        field7142++;
        return class761.field10523;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Les;II)V")
    private final void method3031(class403 arg0, int arg1, int arg2) {
        if (arg1 != -5) {
            return;
        }
        field7147++;
        if (arg2 == 1) {
            this.field7146 = arg0.method2390((byte) 91);
        } else if (arg2 == 2) {
            this.field7143 = true;
        } else if (arg2 == 3) {
            this.field7144 = arg0.method2365(true);
            this.field7150 = arg0.method2365(true);
            this.field7151 = arg0.method2365(true);
        } else if (arg2 == 4) {
            this.field7141 = arg0.method2396((byte) 19);
        } else if (arg2 == 5) {
            this.field7148 = arg0.method2390((byte) 111);
        } else if (arg2 == 6) {
            this.field7139 = arg0.method2358(arg1 ^ 0xFFFFFF9E);
            return;
        }
    }
}

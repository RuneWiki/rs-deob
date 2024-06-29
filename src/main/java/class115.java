import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class115 extends class253 {

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    private int field1734;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1729 = " more options";

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1733 = 0;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Z")
    public static boolean field1744 = false;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIII)V")
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1731 = arg1;
        this.field1735 = arg2;
        this.field1738 = arg3;
        this.field1734 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        if (arg1 >= -47) {
            method726((class273) null, (class273) null, (byte) -115);
        }
        ++field1745;
        int var4 = this.field1734 * arg2 >> 12;
        int var5 = this.field1735 * arg2 >> 12;
        int var6 = this.field1731 * arg0 >> 12;
        int var7 = this.field1738 * arg0 >> 12;
        class8.method41(super.field4014, var5, var7, var4, -16021, var6, super.field4005);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1732;
        int var8 = 0;
        int var9 = arg3;
        int var10 = arg6 * arg6;
        int var11 = arg3 - arg4;
        int var12 = arg6 - arg4;
        int var13 = 0;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var10 << 1;
        if (arg5 < -69) {
            int var19 = arg3 << 1;
            int var20 = var16 << 1;
            int var21 = var11 << 1;
            int var22 = (-var19 + 1) * var10 - -var17;
            int var23 = (-var21 + 1) * var15 + var20;
            int var24 = var14 << 2;
            int var25 = var15 << 1;
            int var26 = var15 << 2;
            int var27 = -((var19 + -1) * var18) + var14;
            int var28 = var16 << 2;
            int var29 = -((var21 + -1) * var25) + var16;
            int var30 = var10 << 2;
            int var31 = var17 * 3;
            int var32 = (var19 + -3) * var18;
            int var33 = var20 * 3;
            int var34 = var24;
            int var35 = (arg3 - 1) * var30;
            int var36 = (var11 + -1) * var26;
            int var37 = var28;
            int var38 = (var21 + -3) * var25;
            if (~arg2 <= ~class63.field941 && class75.field1180 >= arg2) {
                int[] var39 = class130.field2005[arg2];
                int var40 = class245.method1720(class53.field711, -53, arg1 - arg6, class87.field1356);
                int var41 = class245.method1720(class53.field711, -114, arg1 + arg6, class87.field1356);
                int var42 = class245.method1720(class53.field711, -46, -var12 + arg1, class87.field1356);
                int var43 = class245.method1720(class53.field711, -118, arg1 + var12, class87.field1356);
                class71.method451(arg7, true, var42, var40, var39);
                class71.method451(arg0, true, var43, var42, var39);
                class71.method451(arg7, true, var41, var43, var39);
            }
            while (~var9 < -1) {
                if (~var22 > -1) {
                    while (~var22 > -1) {
                        var27 += var34;
                        var34 += var24;
                        var22 += var31;
                        ++var8;
                        var31 += var24;
                    }
                }
                boolean var44 = ~var9 >= ~var11;
                if (var44) {
                    if (~var23 > -1) {
                        while (var23 < 0) {
                            var29 += var37;
                            var37 += var28;
                            ++var13;
                            var23 += var33;
                            var33 += var28;
                        }
                    }
                    if (~var29 > -1) {
                        var23 += var33;
                        ++var13;
                        var29 += var37;
                        var37 += var28;
                        var33 += var28;
                    }
                    var29 += -var38;
                    var38 -= var26;
                    var23 += -var36;
                    var36 -= var26;
                }
                --var9;
                if (var27 < 0) {
                    ++var8;
                    var22 += var31;
                    var31 += var24;
                    var27 += var34;
                    var34 += var24;
                }
                int var45 = arg2 - var9;
                int var46 = arg2 + var9;
                var22 += -var35;
                var27 += -var32;
                var32 -= var30;
                var35 -= var30;
                if (~class63.field941 >= ~var46 && ~class75.field1180 <= ~var45) {
                    int var47 = class245.method1720(class53.field711, -44, arg1 + var8, class87.field1356);
                    int var48 = class245.method1720(class53.field711, -56, -var8 + arg1, class87.field1356);
                    if (var44) {
                        int var49 = class245.method1720(class53.field711, -37, arg1 + var13, class87.field1356);
                        int var50 = class245.method1720(class53.field711, -44, -var13 + arg1, class87.field1356);
                        if (~var45 <= ~class63.field941) {
                            int[] var51 = class130.field2005[var45];
                            class71.method451(arg7, true, var50, var48, var51);
                            class71.method451(arg0, true, var49, var50, var51);
                            class71.method451(arg7, true, var47, var49, var51);
                        }
                        if (~class75.field1180 <= ~var46) {
                            int[] var52 = class130.field2005[var46];
                            class71.method451(arg7, true, var50, var48, var52);
                            class71.method451(arg0, true, var49, var50, var52);
                            class71.method451(arg7, true, var47, var49, var52);
                        }
                    } else {
                        if (class63.field941 <= var45) {
                            class71.method451(arg7, true, var47, var48, class130.field2005[var45]);
                        }
                        if (class75.field1180 >= var46) {
                            class71.method451(arg7, true, var47, var48, class130.field2005[var46]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)V")
    public final void method40(int arg0, byte arg1, int arg2) {
        if (arg1 == -14) {
            int var4 = this.field1734 * arg2 >> 12;
            ++field1739;
            int var5 = this.field1735 * arg2 >> 12;
            int var6 = this.field1738 * arg0 >> 12;
            int var7 = this.field1731 * arg0 >> 12;
            class59.method371(var7, (byte) -126, var5, var6, super.field4005, super.field4010, var4, super.field4014);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static void method723(int arg0) {
        field1729 = null;
        if (arg0 >= -38) {
            field1742 = 106;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Lte;")
    public static final class80 method724(byte arg0, int arg1) {
        ++field1736;
        class80 var2 = (class80) class294.field4843.method1343(59, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 >= -6) {
                field1733 = 38;
            }
            byte[] var3 = class119.field1835.method1877(0, arg1, (byte) 46);
            if (var3 != null && var3.length > 1) {
                class80 var4 = class197.method1363((byte) -64, var3);
                class294.field4843.method1337(var4, (long) arg1, -1);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZI)V")
    public final void method44(int arg0, boolean arg1, int arg2) {
        int var4 = this.field1735 * arg2 >> 12;
        int var5 = this.field1734 * arg2 >> 12;
        ++field1741;
        if (arg1) {
            this.method47(-124, 10, -49);
        }
        int var6 = this.field1738 * arg0 >> 12;
        int var7 = this.field1731 * arg0 >> 12;
        class214.method1501(super.field4010, var6, var7, var5, var4, -98);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)I")
    public static final int method725(byte arg0) {
        int var1 = -100 % ((25 - arg0) / 50);
        ++field1737;
        return 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lfa;Lfa;B)V")
    public static final void method726(class273 arg0, class273 arg1, byte arg2) {
        ++field1730;
        if (arg2 <= -29) {
            class44.field604 = arg1;
            class273.field4496 = arg0;
            class44.field604.method1890(true, 36);
        }
    }
}

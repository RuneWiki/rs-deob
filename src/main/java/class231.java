import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class231 extends class573 {

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
    private int field3469 = 585;

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "Z")
    public static boolean field3466 = false;

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V")
    public static final void method1564(byte arg0) {
        ++field3468;
        class319.field4694.method1222((byte) -100);
        class465.field6606.method1222((byte) -92);
        for (class300 var1 = (class300) class126.field2292.method1224(-2); var1 != null; var1 = (class300) class126.field2292.method1232(-2)) {
            int var18 = var1.field4465;
            if (~var18 > -1001) {
                var1.method2588(300);
                if (var18 != 51 && var18 != 6 && var18 != 20 && ~var18 != -45 && ~var18 != -13 && var18 != 5 && ~var18 != -58) {
                    class319.field4694.method1229(var1, (byte) 120);
                } else {
                    class465.field6606.method1229(var1, (byte) 120);
                }
            }
        }
        class319.field4694.method1230(class126.field2292, false);
        if (arg0 > -109) {
            method1565(15, -16, (byte[]) null, -103, 99, -119);
        }
        class465.field6606.method1230(class126.field2292, false);
        if (class481.field6904 > 1) {
            if (class66.field1450 && class486.field6965.method2194(81, (byte) 112) && ~class481.field6904 < -3) {
                class650.field9374 = (class300) class126.field2292.field2700.field6139.field6139;
            } else {
                class650.field9374 = (class300) class126.field2292.field2700.field6139;
            }
        } else {
            class650.field9374 = null;
        }
        int var2 = -1;
        class441 var3 = (class441) class488.field6985.method1224(-2);
        if (var3 != null) {
            var2 = var3.method1094(true);
        }
        if (class308.field4551) {
            if (~var2 == 0) {
                int var4 = class410.field5945.method1931(-23081);
                int var5 = class410.field5945.method1936(126);
                if (var4 < class640.field9206 + -10 || var4 > class640.field9206 + class134.field2391 + 10 || ~var5 > ~(class43.field1086 - 10) || ~var5 < ~(class337.field5033 + 10 + class43.field1086)) {
                    class679.method3819(38);
                }
            }
            if (var2 == 0) {
                int var6 = class640.field9206;
                int var7 = class43.field1086;
                int var8 = class134.field2391;
                int var9 = var3.method1092(-128);
                int var10 = var3.method1093(5);
                int var11 = -1;
                for (int var12 = 0; ~var12 > ~class481.field6904; ++var12) {
                    if (!class163.field2740) {
                        int var16 = (class481.field6904 - 1 + -var12) * 16 + var7 + 31;
                        if (var6 < var9 && var9 < var6 + var8 && ~(var16 + -13) > ~var10 && ~(var16 + 3) < ~var10) {
                            var11 = var12;
                        }
                    } else {
                        int var17 = (class481.field6904 - 1 + -var12) * 16 + var7 + 33;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var17 + -13 && var10 < var17 - -4) {
                            var11 = var12;
                        }
                    }
                }
                if (var11 != -1) {
                    int var13 = 0;
                    class74 var14 = new class74(class126.field2292);
                    for (class300 var15 = (class300) var14.method795((byte) -112); var15 != null; var15 = (class300) var14.method797(303)) {
                        if (~var11 == ~var13) {
                            class602.method3443(var10, (byte) 105, var9, var15);
                        }
                        ++var13;
                    }
                }
                class679.method3819(102);
                return;
            }
        } else {
            if (var2 == 0 && (class75.field1532 == 1 && class481.field6904 > 2 || class662.method3769((byte) 94))) {
                var2 = 2;
            }
            if (~var2 == -3 && class481.field6904 > 0 && var3 != null) {
                if (class44.field1094 == null && class386.field5665 == 0) {
                    class623.method3551(var3.method1092(-128), 117, var3.method1093(5));
                } else {
                    class455.field6492 = 2;
                }
            }
            if (~var2 == -1 && ~class481.field6904 < -1) {
                class244.method1619(81);
            }
            if (class44.field1094 != null || ~class386.field5665 != -1) {
                return;
            }
            class455.field6492 = 0;
            class509.field7215 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field3467;
        int[] var3 = super.field8321.method3164(arg0, -110);
        if (arg1 != 1) {
            field3466 = false;
        }
        if (super.field8321.field7825) {
            int var4 = class230.field3460[arg0];
            for (int var5 = 0; class540.field7555 > var5; ++var5) {
                int var6 = class51.field1194[var5];
                if (this.field3469 < var6 && var6 < 4096 - this.field3469 && var4 > -this.field3469 + 2048 && this.field3469 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3469 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field3469 + 2048) > ~var6 && ~var6 > ~(this.field3469 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3469;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3469 + 2048);
                } else if (var4 >= this.field3469 && -this.field3469 + 4096 >= var4) {
                    if (~var6 <= ~this.field3469 && ~(-this.field3469 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3469 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field3469;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3469 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field3469 = arg0.method723((byte) -25);
        }
        ++field3464;
        if (arg2 != 3) {
            this.method619(17, -88);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[BIII)V")
    public static final void method1565(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        ++field3465;
        if (~arg5 > ~arg4) {
            int var6 = -arg5 + arg4 >> 2;
            int var7 = arg1 + arg5;
            while (true) {
                --var6;
                if (var6 < 0) {
                    int var8 = 3 & -arg5 + arg4;
                    if (arg0 != 0) {
                        method1565(65, -44, (byte[]) null, 51, 1, -122);
                    }
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            return;
                        }
                        arg2[var7++] = 1;
                    }
                }
                arg2[var7++] = 1;
                arg2[var7++] = 1;
                arg2[var7++] = 1;
                arg2[var7++] = 1;
            }
        }
    }
}

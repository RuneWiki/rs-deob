import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class215 extends class237 {

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Z")
    public boolean field3453;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[Lgh;")
    public class215[] field3443;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field3455 = -1;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "[I")
    public static int[] field3444 = new int[14];

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field3460 = 0;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Lij;")
    public class162 field3461;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lph;")
    public class256 field3445;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)[I")
    public final int[] method1503(int arg0, int arg1, int arg2) {
        field3450++;
        if (arg0 != -1) {
            method1508((class137) null, 81);
        }
        return this.field3443[arg1].field3453 ? this.field3443[arg1].method47(arg2, arg0 ^ 0xFFFFFF00) : this.field3443[arg1].method46(-1, arg2)[0];
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)[[I")
    public final int[][] method1504(int arg0, int arg1, int arg2) {
        field3451++;
        if (arg0 >= -81) {
            this.method1504(16, 108, 15);
        }
        if (this.field3443[arg1].field3453) {
            int[] var4 = this.field3443[arg1].method47(arg2, 255);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3443[arg1].method46(-1, arg2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILpd;)V")
    public void method45(int arg0, int arg1, class96 arg2) {
        field3452++;
        if (arg0 != 1521146348) {
            field3455 = 123;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public void method1417(int arg0) {
        if (arg0 != 128) {
            this.method45(-80, 112, (class96) null);
        }
        field3459++;
        if (this.field3453) {
            this.field3445.method1756(true);
            this.field3445 = null;
        } else {
            this.field3461.method1124(0);
            this.field3461 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)I")
    public int method1416(int arg0) {
        if (arg0 != -5782) {
            field3460 = -18;
        }
        field3448++;
        return -1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BII)V")
    public final void method1505(byte arg0, int arg1, int arg2) {
        field3449++;
        int var4 = this.field3458 == 255 ? arg2 : this.field3458;
        if (this.field3453) {
            this.field3445 = new class256(var4, arg2, arg1);
        } else {
            this.field3461 = new class162(var4, arg2, arg1);
        }
        if (arg0 != -58) {
            this.field3458 = -125;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)[I")
    public int[] method47(int arg0, int arg1) {
        field3442++;
        if (arg1 != 255) {
            this.field3458 = -90;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZILv;)V")
    public static final void method1506(int arg0, int arg1, boolean arg2, int arg3, class228 arg4) {
        if (arg2) {
            return;
        }
        field3456++;
        for (class210 var5 = (class210) class224.field3608.method1802(43); var5 != null; var5 = (class210) class224.field3608.method1815(0)) {
            if (var5.field3364 == arg1 && arg3 * 128 == var5.field3366 && (arg0 * 128) == var5.field3362 && var5.field3368.field3697 == arg4.field3697) {
                if (var5.field3353 != null) {
                    class191.field3082.method1951(var5.field3353);
                    var5.field3353 = null;
                }
                if (var5.field3377 != null) {
                    class191.field3082.method1951(var5.field3377);
                    var5.field3377 = null;
                }
                var5.method1673(14510);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public void method331(byte arg0) {
        if (arg0 != -49) {
            field3455 = 32;
        }
        field3439++;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)[[I")
    public int[][] method46(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field3445 = null;
        }
        field3454++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1507(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3462++;
        int var6 = 0;
        int var7 = arg3 * arg3;
        int var8 = arg3;
        int var9 = arg2 * arg2;
        int var10 = var7 << 1;
        if (arg4 != 109) {
            method1510(85);
        }
        int var11 = var9 << 1;
        int var12 = arg3 << 1;
        int var13 = var7 - ((var12 - 1) * var11);
        int var14 = var9 << 2;
        int var15 = (1 - var12) * var9 + var10;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = (var6 + 1) * var16;
        int var19 = (arg3 - 1) * var14;
        int var20 = ((arg3 << 1) - 3) * var11;
        if (arg5 >= class117.field1656 && arg5 <= class132.field2105) {
            int var21 = class256.method1750(arg4 ^ 0x38, arg0 + arg2, class116.field1653, class114.field1634);
            int var22 = class256.method1750(95, arg0 - arg2, class116.field1653, class114.field1634);
            class78.method433(var21, var22, class14.field186[arg5], arg1, (byte) 123);
        }
        while (var8 > 0) {
            var8--;
            int var23 = arg5 + var8;
            if (var15 < 0) {
                while (var15 < 0) {
                    var13 += var18;
                    var18 += var16;
                    var6++;
                    var15 += var17;
                    var17 += var16;
                }
            }
            if (var13 < 0) {
                var6++;
                var13 += var18;
                var15 += var17;
                var17 += var16;
                var18 += var16;
            }
            int var24 = arg5 - var8;
            var13 += -var20;
            if (class117.field1656 <= var23 && class132.field2105 >= var24) {
                int var25 = class256.method1750(75, arg0 + var6, class116.field1653, class114.field1634);
                int var26 = class256.method1750(57, arg0 - var6, class116.field1653, class114.field1634);
                if (var24 >= class117.field1656) {
                    class78.method433(var25, var26, class14.field186[var24], arg1, (byte) 123);
                }
                if (class132.field2105 >= var23) {
                    class78.method433(var25, var26, class14.field186[var23], arg1, (byte) 123);
                }
            }
            var15 += -var19;
            var20 -= var14;
            var19 -= var14;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Leh;I)V")
    public static final void method1508(class137 arg0, int arg1) {
        int var2 = 18 % ((arg1 - 56) / 56);
        field3440++;
        class265.field4271 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)I")
    public int method1509(byte arg0) {
        field3447++;
        return arg0 == 121 ? -1 : 17;
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    public static void method1510(int arg0) {
        if (arg0 != 0) {
            field3457 = -22;
        }
        field3444 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IZ)V")
    public class215(int arg0, boolean arg1) {
        this.field3453 = arg1;
        this.field3443 = new class215[arg0];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lgl;ILgl;)V")
    public static final void method1511(class237 arg0, int arg1, class237 arg2) {
        if (arg2.field3922 != null) {
            arg2.method1673(14510);
        }
        field3441++;
        arg2.field3922 = arg0.field3922;
        arg2.field3914 = arg0;
        arg2.field3922.field3914 = arg2;
        if (arg1 > 123) {
            arg2.field3914.field3922 = arg2;
        }
    }
}

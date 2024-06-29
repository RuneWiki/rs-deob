import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class216 extends class273 {

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    private int field3452 = 0;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "I")
    private int field3463 = 8192;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    private int field3460 = 4096;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    private int field3454 = 12288;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    private int field3456 = 0;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    private int field3461 = 2048;

    @OriginalMember(owner = "client!kl", name = "db", descriptor = "I")
    private int field3471 = 2048;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3458 = "scroll:";

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "I")
    public static int field3464 = -1;

    @OriginalMember(owner = "client!kl", name = "cb", descriptor = "I")
    public static int field3470 = 0;

    @OriginalMember(owner = "client!kl", name = "bb", descriptor = "I")
    public static int field3469 = 0;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "C")
    public static char field3457;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!kl", name = "Z", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!kl", name = "ab", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!kl", name = "eb", descriptor = "Lkj;")
    public static class114 field3472;

    @OriginalMember(owner = "client!kl", name = "fb", descriptor = "Lsb;")
    public static class124 field3473;

    @OriginalMember(owner = "client!kl", name = "gb", descriptor = "[[B")
    public static byte[][] field3474;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(III)Z")
    private final boolean method1431(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg2) * this.field3454 >> 12;
        ++field3467;
        int var5 = class223.field3561[(var4 * 255 & 1048088) >> 12];
        if (arg1 > -122) {
            field3464 = -51;
        }
        int var6 = (var5 << 12) / this.field3454;
        int var7 = (var6 << 12) / this.field3463;
        int var8 = this.field3460 * var7 >> 12;
        return ~(arg0 - arg2) > ~var8 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V")
    public static void method1432(int arg0) {
        if (arg0 != 2048) {
            field3470 = 84;
        }
        field3473 = null;
        field3474 = null;
        field3458 = null;
        field3472 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field3459;
        int[] var3 = super.field4359.method387((byte) 127, arg1);
        if (arg0) {
            this.method2((class136) null, -44, 15);
        }
        if (super.field4359.field833) {
            int var4 = class255.field4068[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class26.field458; ++var5) {
                int var6 = class265.field4234[var5] + -2048;
                int var7 = this.field3461 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = this.field3452 + var4;
                int var10 = var9 < -2048 ? var9 - -4096 : var9;
                int var11 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var12 = var10 <= 2048 ? var10 : var10 + -4096;
                int var13 = this.field3456 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field3471 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 - -4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1434(-70, var11, var12) && !this.method1431(var18, -127, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(Z)V")
    public static final void method1433(boolean arg0) {
        class154 var1 = class210.field3374;
        synchronized (class210.field3374) {
            ++class165.field2689;
            field3469 = class132.field2190;
            class269.field4311 = class29.field504;
            class165.field2719 = class189.field3079;
            if (arg0) {
                method1435(96, -77, -107, 78, true);
            }
            class230.field3666 = class297.field4696;
            class269.field4320 = class58.field1010;
            class111.field1707 = class247.field3879;
            class13.field174 = class52.field939;
            class297.field4696 = 0;
        }
        ++field3466;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(III)Z")
    private final boolean method1434(int arg0, int arg1, int arg2) {
        int var4 = 68 % ((14 - arg0) / 43);
        ++field3468;
        int var5 = (-arg1 + arg2) * this.field3454 >> 12;
        int var6 = class223.field3561[(1045590 & var5 * 255) >> 12];
        int var7 = (var6 << 12) / this.field3454;
        int var8 = (var7 << 12) / this.field3463;
        int var9 = this.field3460 * var8 >> 12;
        return var9 > arg1 + arg2 && ~(-var9) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class216() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        class155.method1117(-65);
        if (arg0 >= -94) {
            this.field3463 = -63;
        }
        ++field3462;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field3463 = arg0.method996(65280);
                                }
                            } else {
                                this.field3460 = arg0.method996(65280);
                            }
                        } else {
                            this.field3454 = arg0.method996(arg2 + 65275);
                        }
                    } else {
                        this.field3471 = arg0.method996(arg2 ^ 65285);
                    }
                } else {
                    this.field3456 = arg0.method996(65280);
                }
            } else {
                this.field3452 = arg0.method996(arg2 + 65275);
            }
        } else {
            this.field3461 = arg0.method996(arg2 ^ 65285);
        }
        if (arg2 != 5) {
            this.method4(true, 59);
        }
        ++field3455;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIZ)Lhd;")
    public static final class121 method1435(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3453;
        long var5 = (65535L & (long) arg0) << 32 | (65535L & (long) arg2) << 48 | (long) arg1 << 16 & 65535L << 16 | 65535L & (long) arg3;
        class121 var7 = (class121) class3.field42.method1155(var5, !arg4);
        if (var7 != null) {
            return var7;
        } else {
            class103[] var8 = null;
            if (arg4) {
                return null;
            } else {
                class234 var9 = class184.method1286((byte) -125, arg3);
                if (var9.field3717 != null) {
                    var8 = new class103[var9.field3717.length];
                    for (int var10 = 0; var10 < var8.length; ++var10) {
                        class205 var11 = class246.method1633(30, var9.field3717[var10]);
                        var8[var10] = new class103(var11.field3291, var11.field3293, var11.field3299, var11.field3302, var11.field3303, var11.field3298, var11.field3301, var11.field3304);
                    }
                }
                class121 var12 = new class121(var9.field3718, var8, var9.field3705, arg2, arg0, arg1);
                class3.field42.method1161(var12, (byte) -119, var5);
                return var12;
            }
        }
    }
}

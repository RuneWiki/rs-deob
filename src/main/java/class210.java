import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class210 extends class273 {

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    private int field3365 = 32768;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3366 = "Loading world list data";

    @OriginalMember(owner = "client!h", name = "N", descriptor = "S")
    public static short field3369 = 1;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "La;")
    public static class154 field3374 = new class154();

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3375 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class210() {
        super(3, false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILti;)V")
    public static final void method1398(int arg0, int arg1, int arg2, class139 arg3) {
        ++field3377;
        if (arg3.field2816 == arg2 && ~arg2 != 0) {
            class77 var4 = class28.method246(-84, arg2);
            int var5 = var4.field1270;
            if (var5 == 1) {
                arg3.field2903 = 0;
                arg3.field2888 = 0;
                arg3.field2886 = 1;
                arg3.field2826 = 0;
                arg3.field2885 = arg1;
                class124.method916(arg3.field2887, arg3.field2849, 477628496, false, var4, arg3.field2903);
            }
            if (var5 == 2) {
                arg3.field2888 = 0;
            }
        } else if (~arg2 == 0 || arg3.field2816 == -1 || ~class28.method246(-73, arg2).field1257 <= ~class28.method246(95, arg3.field2816).field1257) {
            arg3.field2886 = 1;
            arg3.field2826 = 0;
            arg3.field2885 = arg1;
            arg3.field2903 = 0;
            arg3.field2816 = arg2;
            arg3.field2888 = 0;
            arg3.field2883 = arg3.field2843;
            if (arg3.field2816 != -1) {
                class124.method916(arg3.field2887, arg3.field2849, 477628496, false, class28.method246(76, arg3.field2816), arg3.field2903);
            }
        }
        int var6 = 20 / ((-53 - arg0) / 50);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field3370;
        if (arg0) {
            field3374 = null;
        }
        int[] var3 = super.field4359.method387((byte) 110, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 1, (byte) -45);
            int[] var5 = this.method1850(arg1, 2, (byte) -126);
            for (int var6 = 0; ~var6 > ~class26.field458; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field3365 >> 12;
                int var9 = class223.field3561[var7] * var8 >> 12;
                int var10 = class116.field1957[var7] * var8 >> 12;
                int var11 = class145.field2392 & (var10 >> 12) + arg1;
                int var12 = (var9 >> 12) + var6 & client.field4573;
                int[] var13 = this.method1850(var11, 0, (byte) -127);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            method1398(45, -98, 63, (class139) null);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4358 = ~arg0.method1012(4) == -2;
            }
        } else {
            this.field3365 = arg0.method996(arg2 + 65275) << 4;
        }
        ++field3367;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1399(int arg0, int arg1, int arg2, int arg3) {
        if (!class279.method1873(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class21.field327[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class282.field4477) {
                        if (!class285.method1912(var4, var6, var5)) {
                            return false;
                        }
                        if (!class285.method1912(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class285.method1912(var4, var7, var5)) {
                            return false;
                        }
                        if (!class285.method1912(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class285.method1912(var4, var8, var5)) {
                        return false;
                    }
                    if (!class285.method1912(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class271.field4346) {
                        if (!class285.method1912(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class285.method1912(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class285.method1912(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class285.method1912(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class285.method1912(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class285.method1912(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class282.field4477) {
                        if (!class285.method1912(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class285.method1912(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class285.method1912(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class285.method1912(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class285.method1912(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class285.method1912(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class271.field4346) {
                        if (!class285.method1912(var4, var6, var5)) {
                            return false;
                        }
                        if (!class285.method1912(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class285.method1912(var4, var7, var5)) {
                            return false;
                        }
                        if (!class285.method1912(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class285.method1912(var4, var8, var5)) {
                        return false;
                    }
                    if (!class285.method1912(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class285.method1912(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class285.method1912(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class285.method1912(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class285.method1912(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class285.method1912(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
    public static void method1400(boolean arg0) {
        if (arg0) {
            method1399(-122, 65, -61, -89);
        }
        field3374 = null;
        field3375 = null;
        field3366 = null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V")
    public static final void method1401(byte arg0) {
        ++field3372;
        if (!class156.field2546) {
            if (arg0 < 53) {
                field3369 = 1;
            }
            class10.field141 = true;
            if (class256.field4075) {
                class161.field2619 = (float) (-16 & (int) class161.field2619 + 47);
            } else {
                class296.field4687 += (12.0F - class296.field4687) / 2.0F;
            }
            class156.field2546 = true;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 <= 122) {
            this.method4(true, -12);
        }
        ++field3376;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int[] var4 = this.method1850(arg1, 1, (byte) -20);
            int[] var5 = this.method1850(arg1, 2, (byte) 21);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            for (int var9 = 0; ~class26.field458 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1047513) >> 12;
                int var11 = var5[var9] * this.field3365 >> 12;
                int var12 = class223.field3561[var10] * var11 >> 12;
                int var13 = class116.field1957[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & client.field4573;
                int var15 = class145.field2392 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1853(0, var15, (byte) 8);
                var8[var9] = var16[0][var14];
                var6[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field3371;
        if (arg0 <= -94) {
            class155.method1117(-100);
        }
    }
}

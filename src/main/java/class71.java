import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class71 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[I")
    public static int[] field1031 = new int[50];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljd;")
    public static class91 field1024;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
    public int[] field1033;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[Lh;")
    public static class294[] field1027;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V")
    public static final void method444(int arg0, byte arg1) {
        class36 var2 = class161.method1067(2, arg0, (byte) 81);
        int var3 = -42 % ((arg1 - 18) / 48);
        var2.method220(120);
        field1028++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIILma;)V")
    private final void method445(int arg0, int arg1, int arg2, class202 arg3) {
        field1026++;
        if (~arg0 == arg1) {
            this.field1032 = arg3.method1419(104);
        } else if (arg0 == 2) {
            this.field1033 = new int[arg3.method1420((byte) 0)];
            for (int var5 = 0; var5 < this.field1033.length; var5++) {
                this.field1033[var5] = arg3.method1419(85);
            }
        } else if (arg0 == 3) {
            this.field1025 = arg3.method1420((byte) 0);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method446(int arg0) {
        field1027 = null;
        field1024 = null;
        if (arg0 != -10412) {
            method448(49, (class254) null, -10);
        }
        field1031 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIB)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        method451(arg0, true, arg1 + arg3, -arg1 + arg3, class130.field2005[arg2]);
        field1035++;
        int var5 = 0;
        if (arg4 > -122) {
            method448(104, (class254) null, 62);
        }
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                int var9 = arg3 + var5;
                var6--;
                int var10 = arg3 - var5;
                int[] var11 = class130.field2005[arg2 - var6];
                var7 -= var6 << 1;
                int[] var12 = class130.field2005[arg2 + var6];
                method451(arg0, true, var9, var10, var12);
                method451(arg0, true, var9, var10, var11);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class130.field2005[arg2 - var5];
            int[] var16 = class130.field2005[arg2 + var5];
            method451(arg0, true, var13, var14, var16);
            method451(arg0, true, var13, var14, var15);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILkk;I)I")
    public static final int method448(int arg0, class254 arg1, int arg2) {
        field1029++;
        if (!client.method1085(arg1).method1647((byte) -43, arg0) && arg1.field4032 == null) {
            return -1;
        } else {
            if (arg2 <= 55) {
                field1024 = null;
            }
            return arg1.field4062 == null || arg0 >= arg1.field4062.length ? -1 : arg1.field4062[arg0];
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
    public static final int method449(int arg0, int arg1) {
        field1023++;
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = 62 % ((arg0 - 60) / 49);
        int var5 = (arg1 * var2 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)V")
    public static final void method450(int arg0, long arg1) {
        int var3 = class274.field4531;
        if (arg0 <= 22) {
            return;
        }
        if (!class74.field1123) {
            class79.field1255 += (float) arg1 * class295.field4847 / 40.0F;
            class202.field3253 += (float) arg1 * class292.field4822 / 40.0F;
        }
        field1022++;
        int var4 = class49.field677;
        if (class302.field4946 != var3) {
            int var5 = var3 - class302.field4946;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class302.field4946 += var6;
        }
        if (class118.field1804 != var4) {
            int var7 = var4 - class118.field1804;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class118.field1804 += var8;
        }
        class130.method862((byte) -105);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZII[I)V")
    public static final void method451(int arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        field1036++;
        arg3--;
        if (!arg1) {
            return;
        }
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg4[var7] = arg0;
            int var8 = var7 + 1;
            arg4[var8] = arg0;
            int var9 = var8 + 1;
            arg4[var9] = arg0;
            int var10 = var9 + 1;
            arg4[var10] = arg0;
            int var11 = var10 + 1;
            arg4[var11] = arg0;
            int var12 = var11 + 1;
            arg4[var12] = arg0;
            int var13 = var12 + 1;
            arg4[var13] = arg0;
            arg3 = var13 + 1;
            arg4[arg3] = arg0;
        }
        while (arg3 < var6) {
            arg3++;
            arg4[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lma;II)V")
    public final void method452(class202 arg0, int arg1, int arg2) {
        field1030++;
        while (true) {
            int var4 = arg0.method1420((byte) 0);
            if (var4 == 0) {
                if (arg2 == -1) {
                    return;
                } else {
                    field1027 = null;
                    return;
                }
            }
            this.method445(var4, -2, arg1, arg0);
        }
    }
}

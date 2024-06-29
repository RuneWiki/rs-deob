import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class189 extends class102 {

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    private int field3520 = 12288;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    private int field3512 = 0;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    private int field3525 = 8192;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    private int field3519 = 4096;

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
    private int field3528 = 2048;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    private int field3524 = 0;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
    private int field3526 = 2048;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lqe;")
    public static class179 field3507 = class206.method1380("Bitte entfernen Sie ", (byte) -126);

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "Lqe;")
    private static class179 field3515 = class206.method1380("No reply from loginserver)3", (byte) 39);

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lqe;")
    public static class179 field3517 = field3515;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "Lqe;")
    private static class179 field3516 = class206.method1380("Cancel", (byte) -127);

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Lqe;")
    public static class179 field3518 = class206.method1380("RuneScape wurde aktualisiert(Q", (byte) -128);

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "Z")
    public static boolean field3523 = false;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "[J")
    public static long[] field3521 = new long[32];

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Lqe;")
    public static class179 field3509 = field3516;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field3510;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3525 = arg0.method1252(2);
                                }
                            } else {
                                this.field3519 = arg0.method1252(2);
                            }
                        } else {
                            this.field3520 = arg0.method1252(2);
                        }
                    } else {
                        this.field3526 = arg0.method1252(2);
                    }
                } else {
                    this.field3512 = arg0.method1252(2);
                }
            } else {
                this.field3524 = arg0.method1252(2);
            }
        } else {
            this.field3528 = arg0.method1252(2);
        }
        if (arg2) {
            method1272(-68, 30, 92);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(III)Z")
    public static final boolean method1272(int arg0, int arg1, int arg2) {
        ++field3514;
        if (arg0 != 4096) {
            field3521 = null;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        class134 var3 = class114.method735((byte) -77, arg2);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method858(arg1, (byte) -122);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public static void method1273(int arg0) {
        field3507 = null;
        field3518 = null;
        field3521 = null;
        field3509 = null;
        if (arg0 == 25976) {
            field3516 = null;
            field3515 = null;
            field3517 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field3513;
        if (arg0 == 14005) {
            class56.method390(arg0 + -14006);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field3508;
        if (!arg0) {
            this.field3520 = -27;
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = class94.field1769[arg1] - 2048;
            for (int var5 = 0; ~var5 > ~class155.field2796; ++var5) {
                int var6 = class124.field2292[var5] + -2048;
                int var7 = this.field3524 + var4;
                int var8 = this.field3528 + var6;
                int var9 = this.field3526 + var4;
                int var10 = var8 >= -2048 ? var8 : var8 + 4096;
                int var11 = var9 >= -2048 ? var9 : var9 + 4096;
                int var12 = ~var10 >= -2049 ? var10 : var10 - 4096;
                int var13 = var11 > 2048 ? var11 + -4096 : var11;
                int var14 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var15 = this.field3512 + var6;
                int var16 = ~var15 > 2047 ? var15 + 4096 : var15;
                int var17 = var16 <= 2048 ? var16 : var16 + -4096;
                int var18 = ~var14 < -2049 ? var14 + -4096 : var14;
                var3[var5] = !this.method1275(var18, var12, 255) && !this.method1274(var13, -119, var17) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(III)Z")
    private final boolean method1274(int arg0, int arg1, int arg2) {
        ++field3511;
        int var4 = (arg0 - -arg2) * this.field3520 >> 12;
        int var5 = class229.field4243[(var4 * 255 & 1046376) >> 12];
        int var6 = (var5 << 12) / this.field3520;
        if (arg1 > -83) {
            field3509 = null;
        }
        int var7 = (var6 << 12) / this.field3525;
        int var8 = this.field3519 * var7 >> 12;
        return ~(-arg2 + arg0) > ~var8 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(III)Z")
    private final boolean method1275(int arg0, int arg1, int arg2) {
        ++field3522;
        int var4 = (-arg1 + arg0) * this.field3520 >> 12;
        int var5 = class229.field4243[var4 * 255 >> 12 & arg2];
        int var6 = (var5 << 12) / this.field3520;
        int var7 = (var6 << 12) / this.field3525;
        int var8 = this.field3519 * var7 >> 12;
        return var8 > arg0 + arg1 && -var8 < arg0 + arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBLqe;Lqe;)V")
    public static final void method1276(int arg0, byte arg1, class179 arg2, class179 arg3) {
        if (arg1 != 1) {
            field3518 = null;
        }
        class58.method394(arg2, arg0, arg1 + -1, (class179) null, arg3, -1);
        ++field3527;
    }
}

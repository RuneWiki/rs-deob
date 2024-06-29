import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class122 extends class37 {

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    private int field2681 = 2048;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    private int field2670 = 4096;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    private int field2680 = 12288;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    private int field2685 = 0;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    private int field2687 = 2048;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    private int field2692 = 8192;

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
    private int field2694 = 0;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Lfd;")
    public static class55 field2676 = null;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "Ldd;")
    private static class35 field2679 = class180.method1196((byte) 127, "Loaded sprites");

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "Z")
    public static boolean field2671 = true;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "Ldd;")
    public static class35 field2684 = class180.method1196((byte) 126, "sl_arrows");

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "Ldd;")
    public static class35 field2669 = field2679;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    public static int field2690 = 0;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "[I")
    public static int[] field2675 = new int[5];

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "Ldd;")
    private static class35 field2693 = class180.method1196((byte) 126, "flash3:");

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "Ldd;")
    public static class35 field2689 = field2693;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Ldd;")
    public static class35 field2688 = field2693;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!mf", name = "pb", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!mf", name = "qb", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Lae;")
    public static class6 field2673;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lag;")
    public static class8 field2691;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        ++field2672;
        if (arg0) {
            this.method1(-39, 100, (class26) null);
        }
        class75.method591(4096);
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public static void method867(int arg0) {
        field2689 = null;
        field2676 = null;
        field2688 = null;
        field2673 = null;
        field2675 = null;
        field2679 = null;
        field2669 = null;
        if (arg0 == -1841) {
            field2684 = null;
            field2693 = null;
            field2691 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)Z")
    private final boolean method868(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field2680 >> 12;
        ++field2674;
        int var5 = class3.field43[(var4 * 255 & 1045971) >> 12];
        int var6 = (var5 << 12) / this.field2680;
        int var7 = (var6 << 12) / this.field2692;
        int var8 = this.field2670 * var7 >> 12;
        if (arg2 != -530039060) {
            return false;
        } else {
            return ~var8 < ~(-arg0 + arg1) && -var8 < arg1 - arg0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 != 75) {
            return null;
        } else {
            int[] var3 = super.field816.method1189((byte) 33, arg1);
            if (super.field816.field3661) {
                int var4 = class22.field450[arg1] - 2048;
                for (int var5 = 0; ~class72.field1719 < ~var5; ++var5) {
                    int var6 = class118.field2622[var5] + -2048;
                    int var7 = this.field2681 + var6;
                    int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                    int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                    int var10 = var4 - -this.field2685;
                    int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                    int var12 = ~var11 >= -2049 ? var11 : var11 - 4096;
                    int var13 = this.field2694 + var6;
                    int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                    int var15 = this.field2687 + var4;
                    int var16 = var15 >= -2048 ? var15 : var15 + 4096;
                    int var17 = ~var16 >= -2049 ? var16 : var16 + -4096;
                    int var18 = ~var14 >= -2049 ? var14 : var14 + -4096;
                    var3[var5] = !this.method870(var12, var9, -24918) && !this.method868(var18, var17, -530039060) ? 0 : 4096;
                }
            }
            ++field2686;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)Ldd;")
    public static final class35 method869(long arg0, int arg1) {
        if (arg1 != 0) {
            method867(72);
        }
        ++field2678;
        return class193.method1265(10, arg1 + -73, arg0, false);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(III)Z")
    private final boolean method870(int arg0, int arg1, int arg2) {
        ++field2696;
        int var4 = (arg0 - arg1) * this.field2680 >> 12;
        int var5 = class3.field43[255 & var4 * 255 >> 12];
        if (arg2 != -24918) {
            this.field2681 = 7;
        }
        int var6 = (var5 << 12) / this.field2680;
        int var7 = (var6 << 12) / this.field2692;
        int var8 = this.field2670 * var7 >> 12;
        return var8 > arg0 + arg1 && arg1 - -arg0 > -var8;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method871(int arg0, byte[] arg1) {
        ++field2683;
        int var2 = arg1.length;
        if (arg0 >= -26) {
            return null;
        } else {
            byte[] var3 = new byte[var2];
            class156.method1048(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field2695;
        if (arg1 != 1) {
            field2669 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field2692 = arg2.method256((byte) -78);
                                }
                            } else {
                                this.field2670 = arg2.method256((byte) -78);
                            }
                        } else {
                            this.field2680 = arg2.method256((byte) -78);
                        }
                    } else {
                        this.field2687 = arg2.method256((byte) -78);
                    }
                } else {
                    this.field2694 = arg2.method256((byte) -78);
                }
            } else {
                this.field2685 = arg2.method256((byte) -78);
            }
        } else {
            this.field2681 = arg2.method256((byte) -78);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILce;Ldd;)I")
    public static final int method872(int arg0, class26 arg1, class35 arg2) {
        if (arg0 != 14260) {
            return -90;
        } else {
            int var3 = arg1.field527;
            arg1.method244(-6539, arg2.field758);
            ++field2682;
            arg1.field527 += class125.field2734.method528(0, arg1.field527, true, arg2.field758, arg2.field730, arg1.field529);
            return -var3 + arg1.field527;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, true);
    }
}

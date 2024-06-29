import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class134 extends class34 {

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    private int field2033 = 12288;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    private int field2032 = 2048;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    private int field2034 = 4096;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    private int field2036 = 2048;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    private int field2042 = 0;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    private int field2043 = 8192;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    private int field2038 = 0;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "Lka;")
    public static class473 field2044 = new class473(260);

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "[I")
    public static int[] field2047 = new int[1];

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "Lrb;")
    public static class283 field2048 = new class283(83, 8);

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "Ljava/lang/Object;")
    public static Object field2049;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "[[[Lwr;")
    public static class532[][][] field2046;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V", line = 4)
    public final void method146(byte arg0) {
        if (arg0 <= -84) {
            class114.method856(90);
            ++field2031;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)Z", line = 18)
    private final boolean method969(byte arg0, int arg1, int arg2) {
        ++field2035;
        int var4 = (arg2 - -arg1) * this.field2033 >> 12;
        if (arg0 < 105) {
            this.method970(34, 44, -24);
        }
        int var5 = class135.field2057[(var4 * 255 & 1048269) >> 12];
        int var6 = (var5 << 12) / this.field2033;
        int var7 = (var6 << 12) / this.field2043;
        int var8 = this.field2034 * var7 >> 12;
        return var8 > arg2 - arg1 && -arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lsv;II)V", line = 37)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field2045;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field2043 = arg0.method1844(-116);
                                }
                            } else {
                                this.field2034 = arg0.method1844(-103);
                            }
                        } else {
                            this.field2033 = arg0.method1844(-107);
                        }
                    } else {
                        this.field2032 = arg0.method1844(-108);
                    }
                } else {
                    this.field2038 = arg0.method1844(-101);
                }
            } else {
                this.field2042 = arg0.method1844(-109);
            }
        } else {
            this.field2036 = arg0.method1844(-107);
        }
        if (arg1 <= 16) {
            field2047 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 114)
    public class134() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(III)Z", line = 118)
    private final boolean method970(int arg0, int arg1, int arg2) {
        ++field2037;
        int var4 = (-arg1 + arg0) * this.field2033 >> 12;
        int var5 = class135.field2057[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2033;
        int var7 = (var6 << 12) / this.field2043;
        int var8 = this.field2034 * var7 >> 12;
        if (arg2 != 116072140) {
            return false;
        } else {
            return var8 > arg0 + arg1 && ~(arg0 + arg1) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljm;Z)V", line = 139)
    public static final void method971(class209 arg0, boolean arg1) {
        ++field2039;
        for (class374 var2 = (class374) class265.field3566.method3137(0); var2 != null; var2 = (class374) class265.field3566.method3132(0)) {
            if (var2.field5360 == arg0) {
                if (var2.field5367 != null) {
                    class290.field3924.method298(var2.field5367);
                    var2.field5367 = null;
                }
                var2.method2791((byte) 112);
                return;
            }
        }
        if (!arg1) {
            field2047 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)[I", line = 175)
    public final int[] method64(int arg0, byte arg1) {
        ++field2041;
        int[] var3 = super.field537.method1780(arg0, (byte) 42);
        if (super.field537.field4191) {
            int var4 = class284.field3856[arg0] + -2048;
            for (int var5 = 0; var5 < class383.field5502; ++var5) {
                int var6 = class91.field1463[var5] + -2048;
                int var7 = this.field2036 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field2042 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field2038 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field2032 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method970(var12, var9, 116072140) && !this.method969((byte) 110, var15, var18) ? 0 : 4096;
            }
        }
        int var19 = -58 / (-arg1 / 50);
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V", line = 237)
    public static void method972(byte arg0) {
        if (arg0 >= 14) {
            field2048 = null;
            field2044 = null;
            field2049 = null;
            field2046 = null;
            field2047 = null;
        }
    }
}

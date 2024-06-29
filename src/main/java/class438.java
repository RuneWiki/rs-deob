import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class438 extends class297 {

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
    private int field6236 = 0;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    private int field6239 = 2048;

    @OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
    private int field6246 = 4096;

    @OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
    private int field6248 = 0;

    @OriginalMember(owner = "client!rp", name = "V", descriptor = "I")
    private int field6249 = 12288;

    @OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
    private int field6247 = 8192;

    @OriginalMember(owner = "client!rp", name = "X", descriptor = "I")
    private int field6251 = 2048;

    @OriginalMember(owner = "client!rp", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field6245 = new String[100];

    @OriginalMember(owner = "client!rp", name = "Q", descriptor = "Lad;")
    public static class426 field6244 = new class426(5, 1);

    @OriginalMember(owner = "client!rp", name = "W", descriptor = "I")
    public static int field6250 = 0;

    @OriginalMember(owner = "client!rp", name = "Z", descriptor = "[J")
    public static long[] field6253 = new long[256];

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!rp", name = "Y", descriptor = "I")
    public static int field6252;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((1L & var1) == 1L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field6253[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)[I", line = 4)
    public final int[] method15(int arg0, int arg1) {
        ++field6237;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            this.method2647(-114, -119, -89);
        }
        if (super.field4165.field266) {
            int var4 = class620.field8445[arg0] + -2048;
            for (int var5 = 0; ~class525.field7275 < ~var5; ++var5) {
                int var6 = class733.field9899[var5] + -2048;
                int var7 = var6 - -this.field6239;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field6248 + var4;
                int var11 = var10 < -2048 ? var10 - -4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 - 4096;
                int var13 = var6 - -this.field6236;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field6251 + var4;
                int var17 = var16 < -2048 ? var16 - -4096 : var16;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method2647(var12, 9619, var9) && !this.method2644(var18, -7981, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V", line = 57)
    public final void method711(int arg0) {
        ++field6242;
        if (arg0 <= 108) {
            this.method15(69, 74);
        }
        class45.method545(26188);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V", line = 237)
    public class438() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(III)Z", line = 73)
    private final boolean method2644(int arg0, int arg1, int arg2) {
        ++field6243;
        int var4 = (arg0 + arg2) * this.field6249 >> 12;
        int var5 = class551.field7593[(var4 * 255 & 1048367) >> 12];
        if (arg1 != -7981) {
            this.field6236 = -52;
        }
        int var6 = (var5 << 12) / this.field6249;
        int var7 = (var6 << 12) / this.field6247;
        int var8 = this.field6246 * var7 >> 12;
        return var8 > -arg2 + arg0 && ~(-var8) > ~(-arg2 + arg0);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V", line = 92)
    public static void method2645(byte arg0) {
        field6253 = null;
        field6245 = null;
        field6244 = null;
        int var1 = 69 % ((19 - arg0) / 41);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lcea;II)V", line = 104)
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field6238;
        if (arg2 != 31015) {
            this.method15(72, 12);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field6247 = arg0.method1478(842397944);
                                }
                            } else {
                                this.field6246 = arg0.method1478(842397944);
                            }
                        } else {
                            this.field6249 = arg0.method1478(842397944);
                        }
                    } else {
                        this.field6251 = arg0.method1478(842397944);
                    }
                } else {
                    this.field6236 = arg0.method1478(842397944);
                }
            } else {
                this.field6248 = arg0.method1478(842397944);
            }
        } else {
            this.field6239 = arg0.method1478(842397944);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLse;II)J", line = 185)
    public static final long method2646(byte arg0, class258 arg1, int arg2, int arg3) {
        ++field6240;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class99 var8 = class76.field1366.method1680(0, arg1.method589(-107));
        long var9 = (long) (arg1.method594(-14) << 14 | arg3 | arg2 << 7 | arg1.method588(-32228) << 20 | 1073741824);
        if (var8.field1709 == 0) {
            var9 |= var6;
        }
        if (~var8.field1730 == -2) {
            var9 |= var4;
        }
        int var11 = 57 % ((-24 - arg0) / 57);
        return var9 | (long) arg1.method589(-102) << 32;
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(III)Z", line = 213)
    private final boolean method2647(int arg0, int arg1, int arg2) {
        if (arg1 != 9619) {
            return true;
        } else {
            ++field6241;
            int var4 = (arg0 - arg2) * this.field6249 >> 12;
            int var5 = class551.field7593[(1045808 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field6249;
            int var7 = (var6 << 12) / this.field6247;
            int var8 = this.field6246 * var7 >> 12;
            return ~(arg2 - -arg0) > ~var8 && ~(arg0 + arg2) < ~(-var8);
        }
    }
}

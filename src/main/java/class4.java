import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class166 {

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    private int field18 = 2048;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field17 = 12288;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    private int field28 = 8192;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    private int field21 = 4096;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    private int field29 = 2048;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    private int field27 = 0;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "I")
    public static int field32 = -1;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
    public static int field31 = -1;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "Lhj;")
    private static class69 field30 = class181.method1318(" more options", (byte) -113);

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "Lhj;")
    public static class69 field26 = field30;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "Lhj;")
    public static class69 field35 = class181.method1318("sl_flags", (byte) -111);

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "Lc;")
    public static class103 field25 = new class103(32);

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
    public static final void method15(byte arg0) {
        ++field15;
        class5.field42.method1713(102);
        if (arg0 != 60) {
            method22((byte) 22);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field19;
        int var2 = 87 % ((arg0 - 58) / 50);
        class243.method1728(-109);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(III)V")
    public static final void method17(int arg0, int arg1, int arg2) {
        class209 var3 = class50.method293(1, arg0);
        ++field20;
        int var4 = var3.field3815;
        int var5 = var3.field3810;
        int var6 = var3.field3800;
        int var7 = class202.field3647[-var5 + var6];
        if (~arg2 > -1 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = -89 / ((-22 - arg1) / 38);
        int var9 = var7 << var5;
        class50.method282(var4, 100, class258.field4629[var4] & ~var9 | var9 & arg2 << var5);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field28 = arg1.method912(arg0 + -30);
                                }
                            } else {
                                this.field21 = arg1.method912(50);
                            }
                        } else {
                            this.field17 = arg1.method912(-117);
                        }
                    } else {
                        this.field18 = arg1.method912(-113);
                    }
                } else {
                    this.field22 = arg1.method912(-100);
                }
            } else {
                this.field27 = arg1.method912(-128);
            }
        } else {
            this.field29 = arg1.method912(78);
        }
        if (arg0 != 96) {
            this.method21((byte) -76, 73, -33);
        }
        ++field34;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILnc;Z)Lkc;")
    public static final class264 method19(int arg0, class83 arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field24;
            return !class240.method1702(-128, arg1, arg0) ? null : class155.method1177((byte) 121);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field33;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int var4 = class13.field187[arg0] + -2048;
            for (int var5 = 0; ~class253.field4565 < ~var5; ++var5) {
                int var6 = class24.field347[var5] + -2048;
                int var7 = this.field22 + var6;
                int var8 = var4 - -this.field27;
                int var9 = this.field29 + var6;
                int var10 = this.field18 + var4;
                int var11 = var9 >= -2048 ? var9 : var9 + 4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = var7 >= -2048 ? var7 : var7 + 4096;
                int var14 = var10 < -2048 ? var10 + 4096 : var10;
                int var15 = ~var14 >= -2049 ? var14 : var14 - 4096;
                int var16 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var17 = var16 <= 2048 ? var16 : var16 + -4096;
                int var18 = var13 > 2048 ? var13 + -4096 : var13;
                var3[var5] = !this.method21((byte) -53, var12, var17) && !this.method23(var15, -2048, var18) ? 0 : 4096;
            }
        }
        if (arg1 != 8388607) {
            field26 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z")
    private final boolean method21(byte arg0, int arg1, int arg2) {
        int var4 = (-arg1 + arg2) * this.field17 >> 12;
        ++field23;
        int var5 = class244.field4476[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field17;
        int var7 = (var6 << 12) / this.field28;
        if (arg0 >= 0) {
            this.field18 = -86;
        }
        int var8 = this.field21 * var7 >> 12;
        return ~var8 < ~(arg1 + arg2) && ~(arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    public static void method22(byte arg0) {
        field25 = null;
        field30 = null;
        field35 = null;
        if (arg0 == 62) {
            field26 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(III)Z")
    private final boolean method23(int arg0, int arg1, int arg2) {
        ++field16;
        int var4 = (arg0 + arg2) * this.field17 >> 12;
        int var5 = class244.field4476[var4 * 255 >> 12 & 255];
        if (arg1 != -2048) {
            this.field17 = 79;
        }
        int var6 = (var5 << 12) / this.field17;
        int var7 = (var6 << 12) / this.field28;
        int var8 = this.field21 * var7 >> 12;
        return arg0 - arg2 < var8 && -var8 < arg0 - arg2;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class140 extends class252 {

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "I")
    private int field2423 = 2048;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    private int field2425 = 3072;

    @OriginalMember(owner = "client!w", name = "ib", descriptor = "I")
    private int field2430 = 1024;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "Ljd;")
    public static class85 field2415 = class221.method1499("Gegenstand f-Ur Mitglieder", (byte) -114);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
    public static int[] field2416 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!w", name = "hb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "[I")
    public static int[] field2426;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field2419;
        if (arg1 != -55) {
            return null;
        } else {
            int[] var3 = super.field4356.method868(arg0, (byte) -108);
            if (super.field4356.field2258) {
                int[] var4 = this.method1742((byte) 8, 0, arg0);
                for (int var5 = 0; class5.field63 > var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field2423 >> 12) + this.field2430;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field2427;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (arg1 != -123) {
            this.method88((class247) null, 121, (byte) 60);
        }
        if (super.field4350.field338) {
            int[][] var4 = this.method1737(0, 3, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class5.field63 < ~var11; ++var11) {
                var8[var11] = this.field2430 - -(var5[var11] * this.field2423 >> 12);
                var9[var11] = (var6[var11] * this.field2423 >> 12) + this.field2430;
                var10[var11] = (var7[var11] * this.field2423 >> 12) + this.field2430;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILge;I)Lc;")
    public static final class103 method918(int arg0, int arg1, class68 arg2, int arg3) {
        if (arg1 != 1183811244) {
            return null;
        } else {
            ++field2428;
            return !class253.method1750(arg3, arg2, (byte) 114, arg0) ? null : class222.method1506(true);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg2 == -99) {
            ++field2424;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        super.field4338 = arg0.method1711((byte) -67) == 1;
                    }
                } else {
                    this.field2425 = arg0.method1694((byte) -100);
                }
            } else {
                this.field2430 = arg0.method1694((byte) -100);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2416 = null;
        field2415 = null;
        if (arg0 < -101) {
            field2426 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
    public static final void method920(int arg0, int arg1, int arg2) {
        if (class5.field63 != arg1) {
            class105.field1838 = new int[arg1];
            for (int var3 = 0; ~var3 > ~arg1; ++var3) {
                class105.field1838[var3] = (var3 << 12) / arg1;
            }
            class123.field2180 = ~arg1 == -65 ? 2048 : 4096;
            class5.field63 = arg1;
            class67.field1233 = arg1 + -1;
        }
        ++field2417;
        if (~field2422 != ~arg2) {
            if (~class5.field63 != ~arg2) {
                class39.field622 = new int[arg2];
                for (int var4 = 0; ~var4 > ~arg2; ++var4) {
                    class39.field622[var4] = (var4 << 12) / arg2;
                }
            } else {
                class39.field622 = class105.field1838;
            }
            field2422 = arg2;
            class25.field360 = arg2 + -1;
        }
        if (arg0 >= -5) {
            method918(102, -40, (class68) null, -116);
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        this.field2423 = -this.field2430 + this.field2425;
        if (arg0 != 3906) {
            method918(26, 21, (class68) null, -84);
        }
        ++field2420;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public static final void method921(byte arg0) {
        class68.field1268.method1262(17244);
        ++field2429;
        if (arg0 != -89) {
            field2416 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBII)I")
    public static final int method922(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        ++field2421;
        if (var4 == 0) {
            return arg0;
        } else if (~var4 == -2) {
            return 7 - arg3;
        } else if (~var4 == -3) {
            return -arg0 + 7;
        } else {
            int var5 = 125 % ((29 - arg1) / 61);
            return arg3;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class106 extends class160 {

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    private int field1758 = 0;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    private int field1765 = 0;

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "I")
    private int field1772 = 0;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "[J")
    public static long[] field1766 = new long[100];

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "[Z")
    public static boolean[] field1764 = new boolean[112];

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    private int field1767;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    private int field1769;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "I")
    private int field1773;

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "Z")
    public static boolean field1774;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "[I")
    public static int[] field1759;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "[[[B")
    public static byte[][][] field1755;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
    private final void method758(int arg0, int arg1, int arg2, int arg3) {
        ++field1770;
        if (arg2 != 20480) {
            this.method762(99, -6, -112, 83);
        }
        int var5 = ~arg0 > ~arg3 ? arg0 : arg3;
        int var6 = arg1 >= var5 ? var5 : arg1;
        int var7 = ~arg3 <= ~arg0 ? arg3 : arg0;
        int var8 = ~arg1 >= ~var7 ? var7 : arg1;
        this.field1769 = (var6 + var8) / 2;
        int var9 = var8 - var6;
        if (var9 <= 0) {
            this.field1773 = 0;
        } else {
            int var10 = (var8 - arg0 << 12) / var9;
            int var11 = (-arg3 + var8 << 12) / var9;
            int var12 = (-arg1 + var8 << 12) / var9;
            if (arg0 != var8) {
                if (arg3 != var8) {
                    this.field1773 = ~arg0 == ~var6 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field1773 = ~arg1 == ~var6 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field1773 = arg3 != var6 ? 4096 - var11 : 20480 - -var12;
            }
            this.field1773 /= 6;
        }
        if (~this.field1769 < -1 && ~this.field1769 > -4097) {
            this.field1761 = (var9 << 12) / (~this.field1769 >= -2049 ? this.field1769 * 2 : 8192 - this.field1769 * 2);
        } else {
            this.field1761 = 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)V")
    public static final void method759(int arg0, int arg1) {
        class250.field4038 = -1;
        if (arg1 != -7091) {
            method759(-32, 90);
        }
        class250.field4038 = -1;
        if (~arg0 != -38) {
            if (arg0 == 50) {
                class155.field2412 = 4.0F;
            } else if (arg0 == 75) {
                class155.field2412 = 6.0F;
            } else if (~arg0 != -101) {
                if (arg0 == 200) {
                    class155.field2412 = 16.0F;
                }
            } else {
                class155.field2412 = 8.0F;
            }
        } else {
            class155.field2412 = 3.0F;
        }
        ++field1760;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public static void method760(int arg0) {
        field1759 = null;
        if (arg0 == 4096) {
            field1764 = null;
            field1755 = null;
            field1766 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(B)I")
    public static final int method761(byte arg0) {
        ++field1768;
        if (arg0 != -14) {
            method759(12, -121);
        }
        return 6;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)V")
    private final void method762(int arg0, int arg1, int arg2, int arg3) {
        ++field1763;
        if (arg0 != 2) {
            field1754 = 43;
        }
        int var5 = ~arg2 < -2049 ? arg2 + arg3 + -(arg2 * arg3 >> 12) : (arg3 + 4096) * arg2 >> 12;
        if (~var5 < -1) {
            int var6 = arg1 * 6;
            int var7 = arg2 + arg2 - var5;
            int var8 = var6 >> 12;
            int var10 = -(var8 << 12) + var6;
            int var11 = (-var7 + var5 << 12) / var5;
            int var12 = var5 * var11 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var8 == 0) {
                this.field1756 = var5;
                this.field1775 = var14;
                this.field1767 = var7;
                return;
            }
            if (~var8 == -2) {
                this.field1767 = var7;
                this.field1775 = var5;
                this.field1756 = var15;
                return;
            }
            if (~var8 == -3) {
                this.field1775 = var5;
                this.field1756 = var7;
                this.field1767 = var14;
                return;
            }
            if (~var8 == -4) {
                this.field1767 = var5;
                this.field1756 = var7;
                this.field1775 = var15;
                return;
            }
            if (var8 == 4) {
                this.field1756 = var14;
                this.field1775 = var7;
                this.field1767 = var5;
                return;
            }
            if (var8 == 5) {
                this.field1775 = var7;
                this.field1767 = var15;
                this.field1756 = var5;
                return;
            }
        } else {
            this.field1756 = this.field1775 = this.field1767 = arg2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field1757;
        if (!arg1) {
            field1771 = 83;
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[][] var4 = this.method1079(arg0, 119, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class240.field3896 > var11; ++var11) {
                this.method758(var5[var11], var7[var11], 20480, var6[var11]);
                this.field1769 += this.field1765;
                for (this.field1773 += this.field1758; this.field1773 < 0; this.field1773 += 4096) {
                }
                this.field1761 += this.field1772;
                while (~this.field1773 < -4097) {
                    this.field1773 -= 4096;
                }
                if (~this.field1769 > -1) {
                    this.field1769 = 0;
                }
                if (~this.field1761 > -1) {
                    this.field1761 = 0;
                }
                if (this.field1761 > 4096) {
                    this.field1761 = 4096;
                }
                if (this.field1769 > 4096) {
                    this.field1769 = 4096;
                }
                this.method762(2, this.field1773, this.field1769, this.field1761);
                var8[var11] = this.field1756;
                var9[var11] = this.field1775;
                var10[var11] = this.field1767;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1765 = (arg0.method656(-252) << 12) / 100;
                }
            } else {
                this.field1772 = (arg0.method656(-252) << 12) / 100;
            }
        } else {
            this.field1758 = arg0.method649(-2);
        }
        ++field1762;
        if (arg1 < 11) {
            this.field1761 = 70;
        }
    }
}

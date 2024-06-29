import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class158 extends class76 {

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    private int field2760 = 4;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    private int field2755 = 0;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
    private int field2767 = 4;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "[B")
    private byte[] field2768 = new byte[512];

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    private int field2758 = 4;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    private int field2762 = 1638;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "Z")
    private boolean field2769 = true;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "Lie;")
    public static class117 field2761 = new class117(4);

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "[I")
    public static int[] field2772 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "Lia;")
    public static class257 field2773 = class28.method234(97, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "Lia;")
    private static class257 field2776 = class28.method234(101, " from your ignore list first)3");

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "Lia;")
    public static class257 field2777 = field2776;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lsc;")
    public static class56 field2774 = new class56(4096);

    @OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
    public static int field2781 = 0;

    @OriginalMember(owner = "client!ee", name = "xb", descriptor = "[I")
    public static int[] field2780 = new int[64];

    @OriginalMember(owner = "client!ee", name = "Ab", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ee", name = "vb", descriptor = "Lld;")
    public static class51 field2778;

    @OriginalMember(owner = "client!ee", name = "zb", descriptor = "[I")
    public static int[] field2782;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "[S")
    private short[] field2764;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "[S")
    private short[] field2766;

    @OriginalMember(owner = "client!ee", name = "wb", descriptor = "[[[B")
    public static byte[][][] field2779;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)I")
    private final int method1099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -123) {
            return 32;
        } else {
            ++field2770;
            int var8 = arg3 - 4096;
            int var9 = arg6 >> 12;
            int var10 = var9 + 1;
            if (~var10 <= ~arg2) {
                var10 = 0;
            }
            int var11 = var10 & 255;
            int var12 = var9 & 255;
            int var13 = arg6 & 4095;
            int var14 = var13 - 4096;
            int var15 = this.field2768[arg5 + var12] & 3;
            int var16;
            if (~var15 >= -2) {
                var16 = ~var15 != -1 ? arg3 - var13 : arg3 + var13;
            } else {
                var16 = ~var15 == -3 ? -arg3 + var13 : -var13 - arg3;
            }
            int var17 = class42.field851[var13];
            int var18 = this.field2768[var11 - -arg5] & 3;
            int var19;
            if (var18 > 1) {
                var19 = ~var18 != -3 ? -arg3 + -var14 : -arg3 + var14;
            } else {
                var19 = ~var18 == -1 ? arg3 + var14 : -var14 + arg3;
            }
            int var20 = ((-var16 + var19) * var17 >> 12) + var16;
            int var21 = this.field2768[arg0 + var12] & 3;
            int var22;
            if (~var21 >= -2) {
                var22 = var21 == 0 ? var8 + var13 : -var13 + var8;
            } else {
                var22 = var21 == 2 ? -var8 + var13 : -var13 - var8;
            }
            int var23 = 3 & this.field2768[arg0 + var11];
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 == -1 ? var8 + var14 : -var14 + var8;
            } else {
                var24 = ~var23 == -3 ? -var8 + var14 : -var8 + -var14;
            }
            int var25 = ((var24 - var22) * var17 >> 12) + var22;
            return ((-var20 + var25) * arg4 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        ++field2759;
        this.field2768 = class34.method291(this.field2755, 255);
        this.method1100(0);
        for (int var2 = this.field2758 + -1; var2 >= 1; --var2) {
            short var3 = this.field2766[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field2758;
        }
        if (arg0 != 111) {
            this.method209((byte) -30);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 < -86) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (~arg2 == -7) {
                                        this.field2760 = arg0.method1051((byte) -123);
                                    }
                                } else {
                                    this.field2767 = arg0.method1051((byte) -106);
                                }
                            } else {
                                this.field2755 = arg0.method1051((byte) 119);
                            }
                        } else {
                            this.field2767 = this.field2760 = arg0.method1051((byte) -91);
                        }
                    } else {
                        this.field2762 = arg0.method1075(-7903);
                        if (~this.field2762 > -1) {
                            this.field2766 = new short[this.field2758];
                            for (int var5 = 0; this.field2758 > var5; ++var5) {
                                this.field2766[var5] = (short) arg0.method1075(-7903);
                            }
                        }
                    }
                } else {
                    this.field2758 = arg0.method1051((byte) -127);
                }
            } else {
                this.field2769 = ~arg0.method1051((byte) 91) == -2;
            }
            ++field2756;
        }
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
    private final void method1100(int arg0) {
        if (arg0 != 0) {
            this.method169(54, 121);
        }
        if (~this.field2762 < -1) {
            this.field2764 = new short[this.field2758];
            this.field2766 = new short[this.field2758];
            for (int var2 = 0; this.field2758 > var2; ++var2) {
                this.field2766[var2] = (short) ((int) (Math.pow((double) ((float) this.field2762 / 4096.0F), (double) var2) * 4096.0D));
                this.field2764[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2766 != null && ~this.field2766.length == ~this.field2758) {
            this.field2764 = new short[this.field2758];
            for (int var3 = 0; var3 < this.field2758; ++var3) {
                this.field2764[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field2763;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)I")
    public static final int method1101(boolean arg0, int arg1, int arg2) {
        ++field2771;
        if (arg0) {
            return 44;
        } else {
            class260 var3 = (class260) class174.field2965.method434((byte) -93, (long) arg1);
            if (var3 == null) {
                return -1;
            } else {
                return ~arg2 <= -1 && ~arg2 > ~var3.field4512.length ? var3.field4512[arg2] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I)V")
    private final void method1102(int arg0, int arg1, int[] arg2) {
        ++field2775;
        if (arg1 != -22578) {
            field2783 = 15;
        }
        int var4 = class10.field197[arg0] * this.field2760;
        if (~this.field2758 == -2) {
            int var5 = this.field2764[0] << 12;
            int var6 = this.field2767 * var5 >> 12;
            int var7 = var4 * var5 >> 12;
            int var8 = this.field2760 * var5 >> 12;
            int var9 = var7 >> 12;
            int var10 = var9 + 1;
            short var11 = this.field2766[0];
            int var12 = var7 & 4095;
            if (var10 >= var8) {
                var10 = 0;
            }
            int var13 = 255 & this.field2768[255 & var9];
            int var14 = this.field2768[255 & var10] & 255;
            int var15 = class42.field851[var12];
            if (!this.field2769) {
                for (int var16 = 0; class96.field1807 > var16; ++var16) {
                    int var17 = class137.field2457[var16] * this.field2767;
                    int var18 = this.method1099(var14, -125, var6, var12, var15, var13, var5 * var17 >> 12);
                    arg2[var16] = var11 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class96.field1807 > var19; ++var19) {
                    int var20 = class137.field2457[var19] * this.field2767;
                    int var21 = this.method1099(var14, arg1 + 22453, var6, var12, var15, var13, var5 * var20 >> 12);
                    int var22 = var11 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field2766[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field2764[0] << 12;
                int var25 = this.field2760 * var24 >> 12;
                int var26 = this.field2767 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var27 & 4095;
                int var30 = this.field2768[var28 & 255] & 255;
                int var31 = class42.field851[var29];
                int var32 = var28 + 1;
                if (var25 <= var32) {
                    var32 = 0;
                }
                int var33 = 255 & this.field2768[var32 & 255];
                for (int var34 = 0; ~var34 > ~class96.field1807; ++var34) {
                    int var54 = class137.field2457[var34] * this.field2767;
                    int var55 = this.method1099(var33, -125, var26, var29, var31, var30, var24 * var54 >> 12);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; this.field2758 > var35; ++var35) {
                short var36 = this.field2766[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field2764[var35] << 12;
                    int var38 = this.field2767 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field2760 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var39 & 4095;
                    int var44 = 255 & this.field2768[var41 & 255];
                    int var45 = class42.field851[var43];
                    if (~var42 <= ~var40) {
                        var42 = 0;
                    }
                    int var46 = 255 & this.field2768[var42 & 255];
                    if (this.field2769 && ~(this.field2758 + -1) == ~var35) {
                        for (int var47 = 0; ~var47 > ~class96.field1807; ++var47) {
                            int var48 = class137.field2457[var47] * this.field2767;
                            int var49 = this.method1099(var46, -126, var38, var43, var45, var44, var37 * var48 >> 12);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class96.field1807; ++var51) {
                            int var52 = class137.field2457[var51] * this.field2767;
                            int var53 = this.method1099(var46, arg1 ^ 22604, var38, var43, var45, var44, var37 * var52 >> 12);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
    public static void method1103(byte arg0) {
        field2778 = null;
        if (arg0 >= -46) {
            field2773 = null;
        }
        field2774 = null;
        field2773 = null;
        field2782 = null;
        field2772 = null;
        field2776 = null;
        field2761 = null;
        field2777 = null;
        field2780 = null;
        field2779 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2765;
        int var6 = arg2;
        int var7 = arg5;
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = arg5 << 1;
        int var12 = var8 << 1;
        int var13 = var8 << 2;
        int var14 = -((var11 + -1) * var12) + var9;
        int var15 = (-var11 + 1) * var8 - -var10;
        int var16 = var9 << 2;
        int var17 = ((arg2 << 1) + 3) * var10;
        int var18 = (arg2 + 1) * var16;
        int var19 = (arg5 + -1) * var13;
        int var20 = ((arg5 << 1) + -3) * var12;
        if (class40.field834 <= arg1 && arg1 <= class255.field4371) {
            int var21 = class34.method290(class145.field2540, arg3 + arg4, class123.field2211, arg2 + -256);
            int var22 = class34.method290(class145.field2540, -arg4 + arg3, class123.field2211, -256);
            class94.method692(class185.field3220[arg1], (byte) -123, var22, arg0, var21);
        }
        while (var7 > 0) {
            --var7;
            int var23 = -var7 + arg1;
            int var24 = arg1 + var7;
            if (var15 < 0) {
                while (~var15 > -1) {
                    var14 += var18;
                    var18 += var16;
                    ++var6;
                    var15 += var17;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var18;
                ++var6;
                var15 += var17;
                var18 += var16;
                var17 += var16;
            }
            var15 += -var19;
            var19 -= var13;
            if (~class40.field834 >= ~var24 && ~var23 >= ~class255.field4371) {
                int var25 = class34.method290(class145.field2540, arg3 + var6, class123.field2211, -256);
                int var26 = class34.method290(class145.field2540, -var6 + arg3, class123.field2211, -256);
                if (var23 >= class40.field834) {
                    class94.method692(class185.field3220[var23], (byte) 66, var26, arg0, var25);
                }
                if (class255.field4371 >= var24) {
                    class94.method692(class185.field3220[var24], (byte) -124, var26, arg0, var25);
                }
            }
            var14 += -var20;
            var20 -= var13;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2757;
        if (arg0 != -9351) {
            this.method1102(25, 52, (int[]) null);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            this.method1102(arg1, arg0 + -13227, var3);
        }
        return var3;
    }
}

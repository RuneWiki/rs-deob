import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class273 extends class98 {

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "I")
    private int field3866 = 0;

    @OriginalMember(owner = "client!cq", name = "V", descriptor = "I")
    private int field3870 = 0;

    @OriginalMember(owner = "client!cq", name = "T", descriptor = "I")
    private int field3868 = 0;

    @OriginalMember(owner = "client!cq", name = "cb", descriptor = "[C")
    public static char[] field3877 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!cq", name = "Z", descriptor = "[I")
    public static int[] field3874 = new int[2];

    @OriginalMember(owner = "client!cq", name = "X", descriptor = "Lwq;")
    public static class92 field3872 = new class92();

    @OriginalMember(owner = "client!cq", name = "eb", descriptor = "Llg;")
    public static class237 field3879 = new class237(128);

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    private int field3862;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "I")
    private int field3869;

    @OriginalMember(owner = "client!cq", name = "W", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!cq", name = "Y", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!cq", name = "ab", descriptor = "I")
    private int field3875;

    @OriginalMember(owner = "client!cq", name = "bb", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!cq", name = "db", descriptor = "I")
    private int field3878;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method194(int arg0, int arg1) {
        ++field3867;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[][] var4 = this.method546(arg0, (byte) 33, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class268.field3811; ++var11) {
                this.method1802((byte) -31, var6[var11], var5[var11], var7[var11]);
                this.field3878 += this.field3870;
                this.field3860 += this.field3866;
                this.field3863 += this.field3868;
                while (this.field3860 < 0) {
                    this.field3860 += 4096;
                }
                while (this.field3860 > 4096) {
                    this.field3860 -= 4096;
                }
                if (~this.field3878 > -1) {
                    this.field3878 = 0;
                }
                if (this.field3878 > 4096) {
                    this.field3878 = 4096;
                }
                if (~this.field3863 > -1) {
                    this.field3863 = 0;
                }
                if (this.field3863 > 4096) {
                    this.field3863 = 4096;
                }
                this.method1804(this.field3860, -103, this.field3878, this.field3863);
                var8[var11] = this.field3869;
                var9[var11] = this.field3862;
                var10[var11] = this.field3875;
            }
        }
        int var12 = 48 / ((60 - arg1) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V", line = 79)
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lol;IIII)V", line = 82)
    public static final void method1799(class156 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class48.method276(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class415.field5953) {
            class48.method276(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class48.method276(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class299.field4190) {
            class48.method276(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class299.field4190) {
            class48.method276(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class415.field5953 && arg4 <= class299.field4190) {
            class48.method276(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class48.method276(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class415.field5953 && arg4 > 0) {
            class48.method276(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(B)V", line = 136)
    public static final void method1800(byte arg0) {
        ++field3876;
        class297.field4154.method1618(0);
        if (arg0 != -9) {
            method1801(-72, (String[]) null, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILdg;I)V", line = 147)
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field3871;
        if (arg2 != 0) {
            field3879 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3868 = (arg1.method1589(false) << 12) / 100;
                }
            } else {
                this.field3870 = (arg1.method1589(false) << 12) / 100;
            }
        } else {
            this.field3866 = arg1.method1613(90);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[Ljava/lang/String;[S)V", line = 206)
    public static final void method1801(int arg0, String[] arg1, short[] arg2) {
        ++field3861;
        if (arg0 == 8240) {
            class330.method2127((byte) 86, arg1, arg1.length + -1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIII)V", line = 220)
    private final void method1802(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -31) {
            ++field3865;
            int var5 = arg1 >= arg2 ? arg1 : arg2;
            int var6 = var5 >= arg3 ? var5 : arg3;
            int var7 = ~arg1 >= ~arg2 ? arg1 : arg2;
            int var8 = ~arg3 <= ~var7 ? var7 : arg3;
            int var9 = -var8 + var6;
            this.field3863 = (var6 + var8) / 2;
            if (this.field3863 > 0 && this.field3863 < 4096) {
                this.field3878 = (var9 << 12) / (this.field3863 > 2048 ? 8192 - this.field3863 * 2 : this.field3863 * 2);
            } else {
                this.field3878 = 0;
            }
            if (var9 <= 0) {
                this.field3860 = 0;
            } else {
                int var10 = (-arg2 + var6 << 12) / var9;
                int var11 = (-arg1 + var6 << 12) / var9;
                int var12 = (-arg3 + var6 << 12) / var9;
                if (~arg2 != ~var6) {
                    if (arg1 == var6) {
                        this.field3860 = ~arg3 != ~var8 ? -var12 + 12288 : var10 + 4096;
                    } else {
                        this.field3860 = ~arg2 != ~var8 ? 20480 - var10 : 12288 - -var11;
                    }
                } else {
                    this.field3860 = arg1 != var8 ? 4096 - var11 : var12 + 20480;
                }
                this.field3860 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V", line = 274)
    public static void method1803(int arg0) {
        field3874 = null;
        field3879 = null;
        field3872 = null;
        field3877 = null;
        if (arg0 != 13156) {
            field3879 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)V", line = 290)
    private final void method1804(int arg0, int arg1, int arg2, int arg3) {
        ++field3864;
        int var5 = -53 % ((-61 - arg1) / 41);
        int var6 = ~arg3 < -2049 ? arg3 - ((arg2 * arg3 >> 12) + -arg2) : (arg2 + 4096) * arg3 >> 12;
        if (~var6 < -1) {
            int var7 = arg0 * 6;
            int var8 = arg3 + arg3 - var6;
            int var9 = (var6 - var8 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = var6 - var14;
            if (var10 == 0) {
                this.field3862 = var15;
                this.field3875 = var8;
                this.field3869 = var6;
                return;
            }
            if (var10 == 1) {
                this.field3869 = var16;
                this.field3875 = var8;
                this.field3862 = var6;
                return;
            }
            if (var10 == 2) {
                this.field3862 = var6;
                this.field3869 = var8;
                this.field3875 = var15;
                return;
            }
            if (var10 == 3) {
                this.field3875 = var6;
                this.field3862 = var16;
                this.field3869 = var8;
                return;
            }
            if (~var10 == -5) {
                this.field3869 = var15;
                this.field3875 = var6;
                this.field3862 = var8;
                return;
            }
            if (~var10 == -6) {
                this.field3875 = var16;
                this.field3869 = var6;
                this.field3862 = var8;
                return;
            }
        } else {
            this.field3869 = this.field3862 = this.field3875 = arg3;
        }
    }
}

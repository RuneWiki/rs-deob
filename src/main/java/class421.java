import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class421 extends class11 {

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field6161 = 0;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    private int field6174 = 0;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    private int field6173 = 0;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "[I")
    public static int[] field6159 = new int[2048];

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field6177 = 0;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "[J")
    public static long[] field6164 = new long[100];

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    private int field6156;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    private int field6157;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    private int field6158;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field6163;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    private int field6168;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    private int field6171;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Lhi;")
    public static class138 field6166;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "Lbf;")
    public static class373 field6170;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "Lbm;")
    public static class75 field6172;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "[[Lem;")
    public static class150[][] field6175;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(Z)V", line = 4)
    public static final void method2507(boolean arg0) {
        ++class448.field6596;
        class491.method2878((byte) 92, class12.field180);
        ++field6176;
        class481.field7027.method2302(-4, class50.method445(-8));
        if (!arg0) {
            class481.field7027.method2355(1686288168, class117.field1754);
            class481.field7027.method2355(1686288168, class27.field359);
            class481.field7027.method2302(-4, class20.field269.field7670);
        }
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)Z", line = 25)
    public static final boolean method2508(int arg0) {
        if (arg0 <= 82) {
            method2507(false);
        }
        ++field6162;
        return class274.field3764 > 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[[I", line = 42)
    public final int[][] method41(int arg0, int arg1) {
        ++field6160;
        int var3 = -126 % ((arg0 - -75) / 49);
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var5 = this.method49(arg1, 0, 115);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class90.field1316 > var12; ++var12) {
                this.method2511(var8[var12], var6[var12], (byte) 123, var7[var12]);
                this.field6156 += this.field6161;
                this.field6171 += this.field6174;
                this.field6157 += this.field6173;
                while (this.field6171 < 0) {
                    this.field6171 += 4096;
                }
                while (~this.field6171 < -4097) {
                    this.field6171 -= 4096;
                }
                if (~this.field6156 > -1) {
                    this.field6156 = 0;
                }
                if (~this.field6157 > -1) {
                    this.field6157 = 0;
                }
                if (this.field6156 > 4096) {
                    this.field6156 = 4096;
                }
                if (~this.field6157 < -4097) {
                    this.field6157 = 4096;
                }
                this.method2510((byte) 27, this.field6157, this.field6171, this.field6156);
                var9[var12] = this.field6158;
                var10[var12] = this.field6163;
                var11[var12] = this.field6168;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 113)
    public class421() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 125)
    public static void method2509(byte arg0) {
        if (arg0 < -82) {
            field6175 = null;
            field6166 = null;
            field6159 = null;
            field6164 = null;
            field6170 = null;
            field6172 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIII)V", line = 142)
    private final void method2510(byte arg0, int arg1, int arg2, int arg3) {
        ++field6167;
        int var5 = ~arg1 >= -2049 ? (arg3 + 4096) * arg1 >> 12 : arg1 - -arg3 + -(arg1 * arg3 >> 12);
        if (arg0 == 27) {
            if (var5 > 0) {
                int var6 = arg2 * 6;
                int var7 = arg1 - -arg1 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 - -var13;
                int var15 = -var13 + var5;
                if (var9 == 0) {
                    this.field6168 = var7;
                    this.field6158 = var5;
                    this.field6163 = var14;
                    return;
                }
                if (var9 == 1) {
                    this.field6168 = var7;
                    this.field6163 = var5;
                    this.field6158 = var15;
                    return;
                }
                if (var9 == 2) {
                    this.field6158 = var7;
                    this.field6168 = var14;
                    this.field6163 = var5;
                    return;
                }
                if (~var9 == -4) {
                    this.field6168 = var5;
                    this.field6158 = var7;
                    this.field6163 = var15;
                    return;
                }
                if (var9 == 4) {
                    this.field6163 = var7;
                    this.field6158 = var14;
                    this.field6168 = var5;
                    return;
                }
                if (var9 == 5) {
                    this.field6168 = var15;
                    this.field6163 = var7;
                    this.field6158 = var5;
                    return;
                }
            } else {
                this.field6158 = this.field6163 = this.field6168 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBI)V", line = 250)
    private final void method2511(int arg0, int arg1, byte arg2, int arg3) {
        ++field6169;
        int var5 = ~arg1 >= ~arg3 ? arg3 : arg1;
        int var6 = var5 >= arg0 ? var5 : arg0;
        int var7 = ~arg1 > ~arg3 ? arg1 : arg3;
        int var8 = ~arg0 > ~var7 ? arg0 : var7;
        this.field6157 = (var6 + var8) / 2;
        if (arg2 <= 119) {
            field6172 = null;
        }
        int var9 = -var8 + var6;
        if (this.field6157 > 0 && this.field6157 < 4096) {
            this.field6156 = (var9 << 12) / (this.field6157 > 2048 ? -(this.field6157 * 2) + 8192 : this.field6157 * 2);
        } else {
            this.field6156 = 0;
        }
        if (~var9 >= -1) {
            this.field6171 = 0;
        } else {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (arg1 == var6) {
                this.field6171 = ~arg3 != ~var8 ? -var11 + 4096 : var12 + 20480;
            } else if (arg3 == var6) {
                this.field6171 = ~arg0 == ~var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field6171 = arg1 == var8 ? 12288 - -var11 : -var10 + 20480;
            }
            this.field6171 /= 6;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lsi;II)V", line = 314)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field6178;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field6173 = (arg0.method2337(-1) << 12) / 100;
                }
            } else {
                this.field6161 = (arg0.method2337(-1) << 12) / 100;
            }
        } else {
            this.field6174 = arg0.method2311((byte) -3);
        }
        if (arg1 > -40) {
            this.method2510((byte) 126, 12, 123, -35);
        }
    }
}

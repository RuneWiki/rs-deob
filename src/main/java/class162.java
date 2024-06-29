import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class162 extends class12 {

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    private int field2914 = 0;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    private int field2927 = 0;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    private int field2913 = 0;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "Ltg;")
    private static class184 field2920 = class135.method812("as it was used to break our rules)3", 3);

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field2915 = 0;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Ltg;")
    public static class184 field2918 = field2920;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "Ltg;")
    public static class184 field2925 = class135.method812("Cabbage", 3);

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "[I")
    public static int[] field2912 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Z")
    public static volatile boolean field2924 = true;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    private int field2917;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    private int field2922;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    private int field2931;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "[S")
    public static short[] field2929;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
    private final void method975(int arg0, int arg1, int arg2, int arg3) {
        ++field2921;
        if (arg0 != 6355) {
            method976((byte) -122);
        }
        int var5 = ~arg1 >= -2049 ? (arg3 + 4096) * arg1 >> 12 : arg3 - (arg1 * arg3 >> 12) + arg1;
        if (var5 <= 0) {
            this.field2930 = this.field2917 = this.field2911 = arg1;
        } else {
            int var6 = arg2 * 6;
            int var7 = arg1 - var5 + arg1;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field2917 = var7;
                                    this.field2911 = var15;
                                    this.field2930 = var5;
                                }
                            } else {
                                this.field2930 = var14;
                                this.field2911 = var5;
                                this.field2917 = var7;
                            }
                        } else {
                            this.field2930 = var7;
                            this.field2917 = var15;
                            this.field2911 = var5;
                        }
                    } else {
                        this.field2911 = var14;
                        this.field2917 = var5;
                        this.field2930 = var7;
                    }
                } else {
                    this.field2930 = var15;
                    this.field2917 = var5;
                    this.field2911 = var7;
                }
            } else {
                this.field2930 = var5;
                this.field2917 = var14;
                this.field2911 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field2928;
        int[][] var3 = super.field232.method673(arg0, 79);
        int var4 = 61 / ((arg1 - -58) / 34);
        if (super.field232.field1962) {
            int[][] var5 = this.method76(arg0, 6218, 0);
            int[] var6 = var5[1];
            int[] var7 = var3[1];
            int[] var8 = var5[2];
            int[] var9 = var5[0];
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            for (int var12 = 0; class201.field3889 > var12; ++var12) {
                this.method977(var8[var12], var6[var12], (byte) 73, var9[var12]);
                this.field2926 += this.field2913;
                this.field2922 += this.field2927;
                if (~this.field2926 > -1) {
                    this.field2926 = 0;
                }
                while (this.field2922 < 0) {
                    this.field2922 += 4096;
                }
                if (this.field2926 > 4096) {
                    this.field2926 = 4096;
                }
                while (this.field2922 > 4096) {
                    this.field2922 -= 4096;
                }
                this.field2931 += this.field2914;
                if (~this.field2931 > -1) {
                    this.field2931 = 0;
                }
                if (this.field2931 > 4096) {
                    this.field2931 = 4096;
                }
                this.method975(6355, this.field2931, this.field2922, this.field2926);
                var10[var12] = this.field2930;
                var7[var12] = this.field2917;
                var11[var12] = this.field2911;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method976(byte arg0) {
        field2912 = null;
        field2918 = null;
        field2920 = null;
        field2929 = null;
        field2925 = null;
        if (arg0 != 89) {
            field2912 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field2919;
        if (!arg2) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field2914 = (arg0.method591(65280) << 12) / 100;
                    }
                } else {
                    this.field2913 = (arg0.method591(65280) << 12) / 100;
                }
            } else {
                this.field2927 = arg0.method584((byte) -102);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIBI)V")
    private final void method977(int arg0, int arg1, byte arg2, int arg3) {
        ++field2916;
        int var5 = arg1 >= arg3 ? arg1 : arg3;
        int var6 = ~arg0 < ~var5 ? arg0 : var5;
        if (arg2 != 73) {
            field2929 = null;
        }
        int var7 = arg1 > arg3 ? arg3 : arg1;
        int var8 = ~var7 < ~arg0 ? arg0 : var7;
        this.field2931 = (var8 - -var6) / 2;
        int var9 = -var8 + var6;
        if (~var9 < -1) {
            if (~this.field2931 < -1 && ~this.field2931 > -4097) {
                this.field2926 = (var9 << 12) / (~this.field2931 < -2049 ? 8192 - this.field2931 * 2 : this.field2931 * 2);
            }
            int var10 = (var6 - arg3 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (~arg3 == ~var6) {
                this.field2922 = ~arg1 != ~var8 ? -var12 + 4096 : var11 + 20480;
            } else if (~arg1 != ~var6) {
                this.field2922 = arg3 == var8 ? var12 + 12288 : -var10 + 20480;
            } else {
                this.field2922 = arg0 != var8 ? 12288 - var11 : var10 + 4096;
            }
            this.field2922 /= 6;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class162() {
        super(1, false);
    }
}

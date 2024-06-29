import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class159 extends class33 {

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    private int field2974 = 4096;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    private int field2981 = 0;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "Lrd;")
    public static class173 field2971 = class133.method843("Das ist eine Mitglieder)2Welt(Q", 65);

    @OriginalMember(owner = "client!q", name = "R", descriptor = "[Lrd;")
    public static class173[] field2972 = new class173[200];

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "[I")
    public static int[] field2979 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!q", name = "P", descriptor = "Lrd;")
    public static class173 field2970 = class133.method843("<col=ffffff>", -68);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Llc;")
    public static class112 field2977;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "La;")
    public static class1 field2976;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILdd;IJIIII)Z")
    public static final boolean method1041(int arg0, int arg1, int arg2, int arg3, class35 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class177.method1184(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZII)I")
    public static final int method1042(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return 42;
        } else {
            int var3 = arg1 - -(arg2 * 57);
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            ++field2978;
            return 255 & var5 >> 19;
        }
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
    public static void method1043(int arg0) {
        field2976 = null;
        field2972 = null;
        field2971 = null;
        if (arg0 != 255) {
            field2979 = null;
        }
        field2977 = null;
        field2970 = null;
        field2979 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBLjava/util/Random;)I")
    public static final int method1044(int arg0, byte arg1, Random arg2) {
        ++field2968;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class11.method68(false, arg0)) {
            return (int) ((long) arg0 * (4294967295L & (long) arg2.nextInt()) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg0)) + Integer.MIN_VALUE;
            if (arg1 <= 81) {
                return 44;
            } else {
                int var4;
                do {
                    var4 = arg2.nextInt();
                } while (~var4 <= ~var3);
                return class15.method147(arg0, var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        if (arg0 < 112) {
            method1044(84, (byte) -8, (Random) null);
        }
        int[][] var3 = super.field731.method1340(77, arg1);
        ++field2973;
        if (super.field731.field3925) {
            int[][] var4 = this.method259(0, -9, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class117.field2173 < ~var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (~this.field2981 >= ~var12) {
                    if (~var12 < ~this.field2974) {
                        var8[var11] = this.field2974;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field2981;
                }
                if (var13 < this.field2981) {
                    var9[var11] = this.field2981;
                } else if (this.field2974 < var13) {
                    var9[var11] = this.field2974;
                } else {
                    var9[var11] = var13;
                }
                if (var14 < this.field2981) {
                    var10[var11] = this.field2981;
                } else if (this.field2974 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field2974;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class159() {
        super(1, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1045(int arg0, int arg1, int arg2, long arg3) {
        class105 var5 = class208.field4055[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1959 != null && var5.field1959.field1997 == arg3) {
            return true;
        } else if (var5.field1957 != null && var5.field1957.field4178 == arg3) {
            return true;
        } else if (var5.field1954 != null && var5.field1954.field487 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1972; ++var6) {
                if (var5.field1948[var6].field123 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int[] var3 = super.field718.method514(arg0, 124);
        ++field2980;
        int var4 = -39 / ((arg1 - -65) / 60);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, -112, 0);
            for (int var6 = 0; class117.field2173 > var6; ++var6) {
                int var7 = var5[var6];
                if (~var7 > ~this.field2981) {
                    var3[var6] = this.field2981;
                } else if (~this.field2974 <= ~var7) {
                    var3[var6] = var7;
                } else {
                    var3[var6] = this.field2974;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 < -99) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        super.field729 = ~arg2.method751((byte) 127) == -2;
                    }
                } else {
                    this.field2974 = arg2.method755((byte) -36);
                }
            } else {
                this.field2981 = arg2.method755((byte) -88);
            }
            ++field2967;
        }
    }
}

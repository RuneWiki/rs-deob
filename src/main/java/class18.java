import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class18 extends class124 {

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    private int field242 = 4096;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    private int field246 = 4096;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    private int field250 = 4096;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "[I")
    public static int[] field247 = new int[2048];

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Lwe;")
    public static class147 field241 = new class147(50);

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "Le;")
    public static class191 field252 = class54.method368("k", 2047);

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Lng;")
    public static class121 field238;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (arg2) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field246 = arg1.method1593(arg2);
                    }
                } else {
                    this.field250 = arg1.method1593(arg2);
                }
            } else {
                this.field242 = arg1.method1593(arg2);
            }
            ++field243;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        if (arg1 != -7) {
            field244 = 118;
        }
        int[][] var3 = super.field2053.method1775((byte) -100, arg0);
        ++field245;
        if (super.field2053.field4558) {
            int[][] var4 = this.method843((byte) -115, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class64.field1132; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var7[var11] = this.field242 * var12 >> 12;
                    var8[var11] = this.field250 * var13 >> 12;
                    var10[var11] = this.field246 * var14 >> 12;
                } else {
                    var7[var11] = this.field242;
                    var8[var11] = this.field250;
                    var10[var11] = this.field246;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lng;IZI)[Lc;")
    public static final class60[] method138(class121 arg0, int arg1, boolean arg2, int arg3) {
        ++field236;
        return !class121.method796(arg2, arg3, arg1, arg0) ? null : class53.method362(9568256);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method139(int arg0, int arg1) {
        ++field251;
        if (class127.method858(arg0, -123)) {
            class33[] var2 = class242.field4325[arg0];
            for (int var3 = 0; var2.length > var3; ++var3) {
                class33 var4 = var2[var3];
                if (var4 != null) {
                    var4.field557 = 0;
                    var4.field479 = 0;
                }
            }
            if (arg1 != 2) {
                method138((class121) null, 16, true, -8);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lng;Lng;Z)V")
    public static final void method140(class121 arg0, class121 arg1, boolean arg2) {
        class133.field2231 = arg0;
        class271.field4782 = arg1;
        if (arg2) {
            field238 = null;
        }
        ++field248;
        class143.field2379 = class133.field2231.method805((byte) 33, 3);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class18() {
        super(1, false);
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
    public static void method141(int arg0) {
        field252 = null;
        if (arg0 < 33) {
            field244 = -108;
        }
        field238 = null;
        field247 = null;
        field241 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZJ)V")
    public static final void method142(boolean arg0, long arg1) {
        ++field237;
        if (arg1 > 0L) {
            if (!arg0) {
                method140((class121) null, (class121) null, true);
            }
            if (arg1 % 10L == 0L) {
                class235.method1657(1955713648, arg1 + -1L);
                class235.method1657(1955713648, 1L);
            } else {
                class235.method1657(1955713648, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)I")
    public static final int method143(int arg0, int arg1) {
        ++field240;
        return arg0 != 25046 ? 45 : arg1 >> 18 & 7;
    }
}

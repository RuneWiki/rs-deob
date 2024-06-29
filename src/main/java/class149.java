import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class149 extends class398 {

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    private int field2043 = 2048;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    private int field2047 = 0;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    private int field2046 = 10;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "J")
    public static long field2039 = 0L;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Llm;")
    public static class347 field2040;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[I")
    private int[] field2048;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "[I")
    private int[] field2049;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class149() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        this.method944(0);
        ++field2044;
        if (arg0 != 16) {
            field2040 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field2042;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2047 = arg0.method1348(arg2 + 13026);
                }
            } else {
                this.field2043 = arg0.method1343(255);
            }
        } else {
            this.field2046 = arg0.method1348(arg2 ^ 13084);
        }
        if (arg2 != -13132) {
            this.field2048 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public static void method942(boolean arg0) {
        field2040 = null;
        if (arg0) {
            method942(true);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        if (arg1 != 0) {
            field2039 = -114L;
        }
        ++field2045;
        int[] var3 = super.field5927.method305(arg0, (byte) 110);
        if (super.field5927.field591) {
            int var4 = class84.field1206[arg0];
            if (~this.field2047 != -1) {
                for (int var5 = 0; ~class140.field1922 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class375.field5448[var5];
                    int var9 = this.field2047;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var8 - 4096 - -var4 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field2046; ++var10) {
                        if (this.field2048[var10] <= var6 && var6 < this.field2048[var10 + 1]) {
                            if (this.field2049[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field2046 < ~var12; ++var12) {
                    if (~this.field2048[var12] >= ~var4 && ~this.field2048[var12 - -1] < ~var4) {
                        if (this.field2049[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class60.method420(var3, 0, class140.field1922, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public static final void method943(int arg0) {
        for (int var1 = 0; ~var1 > ~class103.field1430.length; ++var1) {
            for (int var2 = 0; var2 < class103.field1430[0].length; ++var2) {
                for (int var3 = 0; ~var3 > ~class103.field1430[0][0].length; ++var3) {
                    class103.field1430[var1][var2][var3] = 0;
                }
            }
        }
        if (arg0 < 76) {
            method942(false);
        }
        ++field2050;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    private final void method944(int arg0) {
        ++field2038;
        this.field2049 = new int[this.field2046 + 1];
        this.field2048 = new int[this.field2046 + 1];
        int var2 = arg0;
        int var3 = 4096 / this.field2046;
        int var4 = this.field2043 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2046; ++var5) {
            this.field2048[var5] = var2;
            this.field2049[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2048[this.field2046] = 4096;
        this.field2049[this.field2046] = this.field2049[0] + 4096;
    }
}

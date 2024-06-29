import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class138 extends class456 {

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    private int field1977 = 2048;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    private int field1983 = 0;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    private int field1980 = 10;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "Ltl;")
    public static class400 field1986 = new class400(8);

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Lui;")
    public static class451 field1984;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "Ltq;")
    public static class63 field1976;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "[I")
    private int[] field1979;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "[I")
    private int[] field1982;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "[[[Lke;")
    public static class337[][][] field1990;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method33(int arg0, int arg1) {
        ++field1981;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            this.method210(-120, (byte) -65, (class446) null);
        }
        if (super.field6466.field6153) {
            int var4 = class14.field206[arg1];
            if (~this.field1983 != -1) {
                for (int var5 = 0; ~class156.field2169 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class288.field4397[var5];
                    int var9 = this.field1983;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field1980; ++var10) {
                        if (~var6 <= ~this.field1982[var10] && this.field1982[var10 + 1] > var6) {
                            if (var6 < this.field1979[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field1980; ++var12) {
                    if (this.field1982[var12] <= var4 && ~this.field1982[var12 + 1] < ~var4) {
                        if (~this.field1979[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class149.method1010(var3, 0, class156.field2169, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 181)
    public class138() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBLre;)V", line = 132)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.field1979 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1983 = arg2.method2628(49152);
                }
            } else {
                this.field1977 = arg2.method2631(2530);
            }
        } else {
            this.field1980 = arg2.method2628(49152);
        }
        ++field1988;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 188)
    public final void method653(boolean arg0) {
        if (!arg0) {
            this.field1983 = -121;
        }
        this.method962(4096);
        ++field1985;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V", line = 200)
    public static final void method961(int arg0, int arg1, int arg2) {
        ++field1989;
        class186 var3 = class275.method1789(arg2, (byte) 123, 6);
        if (arg1 != 4096) {
            method961(-79, -92, 51);
        }
        var3.method1285(0);
        var3.field2829 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V", line = 218)
    private final void method962(int arg0) {
        ++field1978;
        this.field1979 = new int[this.field1980 + 1];
        int var2 = 0;
        this.field1982 = new int[this.field1980 + 1];
        int var3 = arg0 / this.field1980;
        int var4 = this.field1977 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field1980; ++var5) {
            this.field1982[var5] = var2;
            this.field1979[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1982[this.field1980] = 4096;
        this.field1979[this.field1980] = 4096 - -this.field1979[0];
    }

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(I)V", line = 248)
    public static void method963(int arg0) {
        field1976 = null;
        field1984 = null;
        field1990 = null;
        if (arg0 > -91) {
            method963(35);
        }
        field1986 = null;
    }
}

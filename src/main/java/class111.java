import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class111 extends class222 {

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    private int field1969 = 2048;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    private int field1972 = 10;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    private int field1977 = 0;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "Lsb;")
    public static class98 field1968 = class47.method368(" <col=00ff80>", 0);

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "Lsb;")
    public static class98 field1980 = class47.method368("_", 0);

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "J")
    public static long field1970;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "[I")
    private int[] field1974;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
    private int[] field1976;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1981;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int var4 = class214.field3639[arg1];
            if (this.field1977 != 0) {
                for (int var5 = 0; ~var5 > ~class13.field253; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class261.field4577[var5];
                    int var9 = this.field1977;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (-4096 - -var4 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field1972 < ~var10; ++var10) {
                        if (~var6 <= ~this.field1976[var10] && ~this.field1976[var10 - -1] < ~var6) {
                            if (~var6 > ~this.field1974[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field1972; ++var12) {
                    if (this.field1976[var12] <= var4 && this.field1976[var12 - -1] > var4) {
                        if (var4 < this.field1974[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class66.method465(var3, 0, class13.field253, var11);
            }
        }
        if (arg0 <= 35) {
            field1975 = 45;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static final void method836(int arg0) {
        ++field1979;
        class103.field1836.method13((byte) -114);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class140.field2475[var1] = 0L;
        }
        if (arg0 < 14) {
            field1980 = null;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class250.field4385[var2] = 0L;
        }
        class184.field3164 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method837(-39);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1977 = arg0.method1446(5350);
                }
            } else {
                this.field1969 = arg0.method1487(72);
            }
        } else {
            this.field1972 = arg0.method1446(5350);
        }
        ++field1982;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    private final void method837(int arg0) {
        this.field1974 = new int[this.field1972 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1972;
        ++field1984;
        int var4 = this.field1969 * var3 >> 12;
        this.field1976 = new int[this.field1972 + 1];
        int var5 = 123 % ((-30 - arg0) / 49);
        for (int var6 = 0; ~this.field1972 < ~var6; ++var6) {
            this.field1976[var6] = var2;
            this.field1974[var6] = var2 - -var4;
            var2 += var3;
        }
        this.field1976[this.field1972] = 4096;
        this.field1974[this.field1972] = 4096 - -this.field1974[0];
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V")
    public static void method838(byte arg0) {
        if (arg0 >= -19) {
            field1970 = 126L;
        }
        field1968 = null;
        field1980 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field1971;
        this.method837(84);
        int var2 = 1 / ((arg0 - 57) / 51);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(III)V")
    public static final void method839(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1980 = null;
        }
        class68.field1086[arg2] = arg0;
        class211 var3 = (class211) class85.field1505.method1511((byte) -125, (long) arg2);
        ++field1983;
        if (var3 != null) {
            if (var3.field3608 != 4611686018427387905L) {
                var3.field3608 = 4611686018427387904L | class164.method1183((byte) 80) + 500L;
                return;
            }
        } else {
            class211 var4 = new class211(4611686018427387905L);
            class85.field1505.method1513((long) arg2, var4, -1);
        }
    }
}

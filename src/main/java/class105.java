import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class105 extends class260 {

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    private int field1979 = 4096;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    private int field1985 = 0;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "Loh;")
    public static class263 field1983 = class253.method1681(-127, "<col=00ffff>");

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "[J")
    public static long[] field1980 = new long[1000];

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Llb;")
    public static class127 field1984 = new class127(64);

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field1988 = 0;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lmk;")
    public static class100 field1987 = new class100();

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "[I")
    public static int[] field1977;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "[Lw;")
    public static class141[] field1981;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(ZI)V")
    public static final void method706(boolean arg0, int arg1) {
        ++field1974;
        class103 var2 = (class103) class184.field3327.method31(-32665, (long) arg1);
        if (arg0) {
            field1977 = null;
        }
        if (var2 != null) {
            for (int var3 = 0; var2.field1964.length > var3; ++var3) {
                var2.field1964[var3] = -1;
                var2.field1951[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method707(int arg0) {
        field1987 = null;
        field1984 = null;
        field1980 = null;
        if (arg0 == -64) {
            field1983 = null;
            field1981 = null;
            field1977 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZIIBII)V")
    public static final void method708(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field1978;
        class239.field4166 = arg5;
        int var7 = 37 % ((-26 - arg4) / 52);
        class130.field2382 = arg6;
        class101.field1923 = arg0;
        class30.field750 = arg3;
        class41.field913 = arg2;
        if (arg1 && class101.field1923 >= 100) {
            class127.field2357 = class130.field2382 * 128 + 64;
            class152.field2738 = class239.field4166 * 128 - -64;
            class87.field1750 = class120.method781(class12.field321, class127.field2357, false, class152.field2738) - class41.field913;
        }
        class89.field1772 = 2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 != 5701) {
            method707(7);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4505 = ~arg2.method1301(-8317) == -2;
                }
            } else {
                this.field1979 = arg2.method1294((byte) 3);
            }
        } else {
            this.field1985 = arg2.method1294((byte) 3);
        }
        ++field1986;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            field1977 = null;
        }
        ++field1976;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0, 0, false);
            for (int var5 = 0; var5 < class49.field1052; ++var5) {
                int var6 = var4[var5];
                if (~this.field1985 < ~var6) {
                    var3[var5] = this.field1985;
                } else if (~this.field1979 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1979;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class105() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field1975;
        if (arg1 != 5) {
            field1980 = null;
        }
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346) {
            int[][] var4 = this.method1712((byte) 119, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class49.field1052; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (~this.field1985 < ~var12) {
                    var8[var11] = this.field1985;
                } else if (var12 <= this.field1979) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field1979;
                }
                if (this.field1985 <= var13) {
                    if (var13 > this.field1979) {
                        var9[var11] = this.field1979;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field1985;
                }
                if (this.field1985 > var14) {
                    var10[var11] = this.field1985;
                } else if (var14 <= this.field1979) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field1979;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILue;Z)Loe;")
    public static final class140 method709(int arg0, int arg1, class86 arg2, boolean arg3) {
        if (!arg3) {
            field1988 = 83;
        }
        ++field1982;
        return !class254.method1687(arg1, (byte) -91, arg2, arg0) ? null : class19.method136((byte) -23);
    }
}

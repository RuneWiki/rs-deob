import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class221 extends class89 {

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    private int field3883 = 0;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    private int field3882 = 4096;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field3880 = 0;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "Lha;")
    public static class46 field3885 = class271.method1828("(Y", -46);

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "[Lha;")
    public static class46[] field3891 = new class46[100];

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field3892 = 0;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "[I")
    public static int[] field3895 = new int[25];

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "Lha;")
    public static class46 field3888 = class271.method1828("::fpson", -46);

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "Lpi;")
    public static class181 field3890;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public static final void method1529(int arg0) {
        if (arg0 == 0) {
            ++field3889;
            if (~class20.field267 == -3) {
                if (class197.field3517 == class124.field2291 && class53.field916 == class250.field4420) {
                    class20.field267 = 0;
                    class202.method1434(class242.field4290 + -1, true);
                    return;
                }
            } else {
                if (~class197.field3517 != ~class100.field1850 || ~class250.field4420 != ~class143.field2607) {
                    class124.field2291 = class100.field1850;
                    class20.field267 = 2;
                    class53.field916 = class143.field2607;
                    return;
                }
                class20.field267 = 0;
                class202.method1434(class242.field4290 + -1, true);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class221() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lha;Z)Lha;")
    public static final class46 method1530(class46 arg0, boolean arg1) {
        ++field3884;
        int var2 = class178.method1273((byte) 55, arg0);
        if (~var2 == 0) {
            return class103.field1873;
        } else {
            if (arg1) {
                field3888 = null;
            }
            return class163.field2914.field4232[var2].method324(0, class103.field1864, class16.field229);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -102 % ((arg1 - 51) / 44);
        ++field3894;
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int[] var5 = this.method685(-71, arg0, 0);
            for (int var6 = 0; var6 < class241.field4284; ++var6) {
                int var7 = var5[var6];
                if (~var7 > ~this.field3883) {
                    var4[var6] = this.field3883;
                } else if (this.field3882 >= var7) {
                    var4[var6] = var7;
                } else {
                    var4[var6] = this.field3882;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        ++field3893;
        if (arg1 != -641641492) {
            method1530((class46) null, true);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1683 = ~arg0.method558(1) == -2;
                }
            } else {
                this.field3882 = arg0.method545((byte) -96);
            }
        } else {
            this.field3883 = arg0.method545((byte) 121);
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3888 = null;
        field3895 = null;
        field3890 = null;
        field3885 = null;
        field3891 = null;
        if (arg0 != -11009) {
            field3886 = -75;
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public static final void method1532(int arg0) {
        class207.field3713.method83(25216);
        if (arg0 != -25463) {
            field3895 = null;
        }
        ++field3881;
        class240.field4266.method83(25216);
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)I")
    public static final int method1533(int arg0) {
        if (arg0 != 24454) {
            method1529(61);
        }
        ++field3896;
        return 0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            field3895 = null;
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int[][] var4 = this.method689((byte) 95, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class241.field4284; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field3883) {
                    if (~var12 < ~this.field3882) {
                        var8[var11] = this.field3882;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field3883;
                }
                if (~this.field3883 < ~var13) {
                    var9[var11] = this.field3883;
                } else if (this.field3882 >= var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field3882;
                }
                if (~var14 > ~this.field3883) {
                    var10[var11] = this.field3883;
                } else if (var14 <= this.field3882) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field3882;
                }
            }
        }
        ++field3887;
        return var3;
    }
}

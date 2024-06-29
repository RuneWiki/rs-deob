import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class116 extends class748 {

    @OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
    private int field1619 = 4096;

    @OriginalMember(owner = "client!wea", name = "Q", descriptor = "I")
    private int field1626 = 0;

    @OriginalMember(owner = "client!wea", name = "O", descriptor = "Lefa;")
    public static class528 field1624 = new class528();

    @OriginalMember(owner = "client!wea", name = "P", descriptor = "Lvfa;")
    public static class92 field1625 = new class92();

    @OriginalMember(owner = "client!wea", name = "S", descriptor = "I")
    public static int field1628 = 100;

    @OriginalMember(owner = "client!wea", name = "R", descriptor = "Lju;")
    public static class102 field1627 = new class102(44, 1);

    @OriginalMember(owner = "client!wea", name = "H", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!wea", name = "I", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!wea", name = "L", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!wea", name = "M", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!wea", name = "N", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method445(int arg0, int arg1) {
        ++field1623;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field10420.field1979) {
                int[][] var4 = this.method4159(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class424.field5889 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~this.field1626 >= ~var12) {
                        if (~this.field1619 <= ~var12) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field1619;
                        }
                    } else {
                        var8[var11] = this.field1626;
                    }
                    if (~this.field1626 < ~var13) {
                        var9[var11] = this.field1626;
                    } else if (~this.field1619 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field1619;
                    }
                    if (var14 >= this.field1626) {
                        if (~this.field1619 > ~var14) {
                            var10[var11] = this.field1619;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field1626;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lpaa;I)V", line = 82)
    public static final void method764(class712 arg0, int arg1) {
        if (arg1 != -1176833464) {
            field1627 = null;
        }
        ++field1620;
        if (~class217.field3073 == ~arg0.field9959) {
            class142.field1966[arg0.field10016] = true;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[I", line = 97)
    public final int[] method25(int arg0, int arg1) {
        ++field1617;
        if (arg1 != 255) {
            field1625 = null;
        }
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int[] var4 = this.method4157(0, (byte) -114, arg0);
            for (int var5 = 0; ~class424.field5889 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field1626 >= ~var6) {
                    if (this.field1619 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field1619;
                    }
                } else {
                    var3[var5] = this.field1626;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZLvj;)V", line = 140)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field10414 = ~arg2.method194((byte) 119) == -2;
                }
            } else {
                this.field1619 = arg2.method193(2);
            }
        } else {
            this.field1626 = arg2.method193(2);
        }
        if (arg1) {
            field1624 = null;
        }
        ++field1618;
    }

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "(I)Lqc;", line = 185)
    public static final class379 method765(int arg0) {
        if (arg0 != -10241) {
            return null;
        } else {
            ++field1622;
            return class336.field4314;
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V", line = 217)
    public class116() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(II)I", line = 200)
    public static final int method766(int arg0, int arg1) {
        ++field1621;
        if (arg0 != -25922) {
            field1627 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "(II)I", line = 214)
    public static final int method767(int arg0, int arg1) {
        return class589.field8454 != null ? class589.field8454[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "(B)V", line = 220)
    public static void method768(byte arg0) {
        field1627 = null;
        field1625 = null;
        field1624 = null;
        if (arg0 <= 122) {
            field1624 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIII)V", line = 233)
    public static final void method769(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class589.field8454 != null) {
            class589.field8454[arg0][arg1] = -16777216 | arg2;
        }
        if (class326.field4198 != null) {
            class326.field4198[arg0][arg1] = (short) arg3;
        }
        if (class111.field1590 != null) {
            class111.field1590[arg0][arg1] = (byte) arg4;
        }
    }
}

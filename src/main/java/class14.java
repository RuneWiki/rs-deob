import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class264 {

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    private int field172 = 10;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    private int field179 = 2048;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    private int field182 = 0;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field168 = -1;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "Lcf;")
    public static class93 field177 = class147.method1066("Benutzen", -48);

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "Lcf;")
    public static class93 field178 = class147.method1066("Liste der Welten geladen", -48);

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "Lhg;")
    public static class177 field184;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "[I")
    private int[] field174;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "[I")
    private int[] field180;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public static void method59(byte arg0) {
        field177 = null;
        field184 = null;
        if (arg0 <= -66) {
            field178 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBI)Lcf;")
    public static final class93 method60(int arg0, byte arg1, int arg2) {
        ++field173;
        int var3 = -arg0 + arg2;
        if (~var3 > 8) {
            return class105.field1819;
        } else if (var3 < -6) {
            return class15.field209;
        } else {
            int var4 = 14 / ((arg1 - 4) / 51);
            if (var3 < -3) {
                return class163.field2874;
            } else if (var3 < 0) {
                return class170.field2999;
            } else if (~var3 < -10) {
                return class167.field2941;
            } else if (~var3 < -7) {
                return class231.field4129;
            } else if (var3 > 3) {
                return class103.field1797;
            } else {
                return var3 > 0 ? class127.field2245 : class141.field2457;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lhg;ILhg;)V")
    public static final void method61(class177 arg0, int arg1, class177 arg2) {
        class146.field2582 = arg0;
        class8.field105 = arg2;
        if (arg1 != 26061) {
            method61((class177) null, 115, (class177) null);
        }
        ++field176;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static final void method62(int arg0) {
        ++field183;
        class212.field3887.method294(0);
        class120.field2131.method294(0);
        if (arg0 <= 110) {
            field177 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)V")
    private final void method63(int arg0) {
        this.field180 = new int[this.field172 + 1];
        ++field185;
        if (arg0 != 1923441676) {
            method65(-51, -69);
        }
        int var2 = 0;
        int var3 = 4096 / this.field172;
        int var4 = this.field179 * var3 >> 12;
        this.field174 = new int[this.field172 + 1];
        for (int var5 = 0; ~this.field172 < ~var5; ++var5) {
            this.field180[var5] = var2;
            this.field174[var5] = var2 + var4;
            var2 += var3;
        }
        this.field180[this.field172] = 4096;
        this.field174[this.field172] = this.field174[0] + 4096;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field186;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field182 = arg2.method1907(16832);
                }
            } else {
                this.field179 = arg2.method1891(-113);
            }
        } else {
            this.field172 = arg2.method1907(16832);
        }
        if (arg0 <= 11) {
            field178 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field171;
        int[] var3 = super.field4716.method532((byte) 86, arg0);
        if (super.field4716.field1424) {
            int var4 = class67.field1220[arg0];
            if (~this.field182 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field172; ++var6) {
                    if (~var4 <= ~this.field180[var6] && this.field180[var6 + 1] > var4) {
                        if (~this.field174[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class107.method773(var3, 0, class176.field3060, var5);
            } else {
                for (int var7 = 0; var7 < class176.field3060; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class144.field2497[var7];
                    int var11 = this.field182;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field172; ++var12) {
                        if (~var8 <= ~this.field180[var12] && var8 < this.field180[var12 + 1]) {
                            if (~var8 > ~this.field174[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (arg1 > -83) {
            method59((byte) 52);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 == -3) {
            this.method63(1923441676);
            ++field175;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public static final void method65(int arg0, int arg1) {
        ++field181;
        if (arg0 != 2) {
            field177 = null;
        }
        class249 var2 = (class249) class282.field5069.method135((long) arg1, true);
        if (var2 != null) {
            var2.method1544((byte) -35);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class200 {

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    private int field197 = -1;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "Lid;")
    public static class149 field193 = class60.method382(" )2> ", (byte) 79);

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field203 = 0;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "Lid;")
    public static class149 field200 = class60.method382("headicons_pk", (byte) 39);

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    public static int field208 = -1;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "Lal;")
    public static class230 field209;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "[I")
    private int[] field199;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "[[Laj;")
    public static class47[][] field206;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public final void method88(byte arg0) {
        int var2 = -99 % ((-21 - arg0) / 49);
        ++field201;
        super.method88((byte) 49);
        this.field199 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            this.method88((byte) 82);
        }
        ++field210;
        int[][] var3 = super.field3632.method965(arg1, 82);
        if (super.field3632.field2550 && this.method91(-118)) {
            int[] var4 = var3[0];
            int var5 = (~class276.field4934 == ~this.field205 ? arg1 : this.field205 * arg1 / class276.field4934) * this.field196;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class137.field2515 != this.field196) {
                for (int var8 = 0; var8 < class137.field2515; ++var8) {
                    int var9 = this.field196 * var8 / class137.field2515;
                    int var10 = this.field199[var5 + var9];
                    var7[var8] = class136.method953(var10 << 4, 4080);
                    var6[var8] = class136.method953(var10, 65280) >> 4;
                    var4[var8] = class136.method953(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; class137.field2515 > var11; ++var11) {
                    int var12 = this.field199[var5++];
                    var7[var11] = class136.method953(var12 << 4, 4080);
                    var6[var11] = class136.method953(var12, 65280) >> 4;
                    var4[var11] = class136.method953(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)I")
    public final int method89(int arg0) {
        if (arg0 != -1) {
            return 11;
        } else {
            ++field207;
            return this.field197;
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
    public static void method90(int arg0) {
        field209 = null;
        if (arg0 != -1) {
            method90(-12);
        }
        field200 = null;
        field193 = null;
        field206 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method24(false, -59);
        }
        if (~arg2 == -1) {
            this.field197 = arg0.method485(-2386);
        }
        ++field202;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)Z")
    private final boolean method91(int arg0) {
        ++field195;
        if (this.field199 != null) {
            return true;
        } else if (~this.field197 <= -1) {
            int var2 = class137.field2515;
            int var3 = class276.field4934;
            int var4 = class233.field4097.method118(this.field197, 0) ? 64 : 128;
            this.field199 = class233.field4097.method120(117, this.field197);
            this.field196 = var4;
            this.field205 = var4;
            class35.method197(103, var2, var3);
            return this.field199 != null;
        } else {
            return arg0 > -107 ? false : false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[Laj;)V")
    public static final void method92(int arg0, int arg1, class47[] arg2) {
        ++field194;
        if (arg1 != -1970) {
            field209 = null;
        }
        for (int var3 = 0; ~arg2.length < ~var3; ++var3) {
            class47 var4 = arg2[var3];
            if (var4 != null && var4.field707 == arg0 && (!var4.field718 || !client.method1107(var4))) {
                if (var4.field760 == 0) {
                    if (!var4.field718 && client.method1107(var4) && class176.field3224 != var4) {
                        continue;
                    }
                    method92(var4.field834, -1970, arg2);
                    if (var4.field761 != null) {
                        method92(var4.field834, -1970, var4.field761);
                    }
                    class3 var5 = (class3) class34.field499.method639((byte) -105, (long) var4.field834);
                    if (var5 != null) {
                        class276.method1907(arg1 + 1974, var5.field42);
                    }
                }
                if (var4.field760 == 6) {
                    if (~var4.field807 != 0 || var4.field866 != -1) {
                        boolean var6 = class65.method405(var4, (byte) -74);
                        int var7;
                        if (!var6) {
                            var7 = var4.field807;
                        } else {
                            var7 = var4.field866;
                        }
                        if (~var7 != 0) {
                            class164 var8 = class69.method436(var7, arg1 ^ 1966);
                            if (var8 != null) {
                                var4.field831 += class149.field2683;
                                while (var8.field3060[var4.field790] < var4.field831) {
                                    var4.field831 -= var8.field3060[var4.field790];
                                    ++var4.field790;
                                    if (var4.field790 >= var8.field3035.length) {
                                        var4.field790 -= var8.field3061;
                                        if (~var4.field790 > -1 || var8.field3035.length <= var4.field790) {
                                            var4.field790 = 0;
                                        }
                                    }
                                    var4.field736 = var4.field790 + 1;
                                    if (~var4.field736 <= ~var8.field3035.length) {
                                        var4.field736 -= var8.field3061;
                                        if (var4.field736 < 0 || ~var8.field3035.length >= ~var4.field736) {
                                            var4.field736 = -1;
                                        }
                                    }
                                    class182.method1267(var4, 106);
                                }
                            }
                        }
                    }
                    if (~var4.field735 != -1 && !var4.field718) {
                        int var9 = var4.field735 >> 16;
                        int var10 = var4.field735 << 16 >> 16;
                        int var11 = class149.field2683 * var10;
                        int var12 = class149.field2683 * var9;
                        var4.field863 = var4.field863 + var12 & 2047;
                        var4.field697 = var4.field697 + var11 & 2047;
                        class182.method1267(var4, 96);
                    }
                }
            }
        }
    }
}

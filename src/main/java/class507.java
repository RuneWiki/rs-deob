import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class507 extends class12 implements class721 {

    @OriginalMember(owner = "client!bda", name = "U", descriptor = "Z")
    private boolean field7222 = false;

    @OriginalMember(owner = "client!bda", name = "Y", descriptor = "Lqea;")
    public class128 field7226;

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "Z")
    private boolean field7214;

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!bda", name = "O", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!bda", name = "Q", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!bda", name = "R", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!bda", name = "S", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!bda", name = "T", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!bda", name = "V", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!bda", name = "W", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!bda", name = "X", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!bda", name = "Z", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!bda", name = "ab", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!bda", name = "bb", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!bda", name = "cb", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!bda", name = "db", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!bda", name = "eb", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!bda", name = "gb", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!bda", name = "hb", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!bda", name = "fb", descriptor = "Lria;")
    private class286 field7233;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        ++field7215;
        return arg0 != 88;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILha;)V")
    public final void method318(int arg0, class60 arg1) {
        this.field7226.method905(28, arg1);
        int var3 = 74 / ((8 - arg0) / 57);
        ++field7234;
    }

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "(B)I")
    public final int method313(byte arg0) {
        ++field7224;
        if (arg0 != 3) {
            this.method309((byte) -1);
        }
        return this.field7226.method899(116);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILvs;ZILha;II)V")
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        if (arg0 != 8616) {
            this.field7214 = false;
        }
        ++field7228;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(I)V")
    public final void method741(int arg0) {
        if (arg0 >= -93) {
            this.method310((class60) null, (byte) -112);
        }
        ++field7229;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)I")
    public final int method309(byte arg0) {
        if (arg0 > -16) {
            return -85;
        } else {
            ++field7217;
            return this.field7226.field1697;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lfe;Z)V")
    public final void method3007(class572 arg0, boolean arg1) {
        ++field7220;
        this.field7226.method896(arg0, 6706);
        if (!arg1) {
            this.field7226 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I")
    public final int method317(int arg0) {
        if (arg0 < 112) {
            return 88;
        } else {
            ++field7235;
            return this.field7226.field1709;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Lha;B)Lc;")
    public final class187 method319(class60 arg0, byte arg1) {
        ++field7230;
        class473 var3 = this.field7226.method903(arg0, 2048, 124, false, true);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -121 % ((arg1 - -25) / 60);
            class738 var5 = arg0.method442();
            var5.method774(super.field8423, super.field8421, super.field8428);
            class187 var6 = class650.method3774(123, this.field7214, 1);
            int var7 = super.field8423 >> 9;
            int var8 = super.field8428 >> 9;
            this.field7226.method906(var8, true, var8, var5, -104, arg0, var7, var3, var7);
            if (!class418.field6258) {
                var3.method265(var5, var6.field2851[0], 0);
            } else {
                var3.method235(var5, var6.field2851[0], class188.field2859, 0);
            }
            if (this.field7226.field1690 != null) {
                class624 var9 = this.field7226.field1690.method3603();
                if (class418.field6258) {
                    arg0.method505(var9, class188.field2859);
                } else {
                    arg0.method523(var9);
                }
            }
            this.field7222 = var3.method275() || this.field7226.field1690 != null;
            if (this.field7233 == null) {
                this.field7233 = class60.method527(var3, super.field8428, super.field8423, super.field8421, -22060);
            } else {
                class240.method1604(super.field8428, var3, super.field8421, true, this.field7233, super.field8423);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)I")
    public final int method327(int arg0) {
        if (arg0 >= -116) {
            this.method317(-32);
        }
        ++field7213;
        return this.field7226.field1696;
    }

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        int var2 = -127 % ((-33 - arg0) / 42);
        ++field7227;
        return this.field7222;
    }

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "(B)Z")
    public final boolean method320(byte arg0) {
        ++field7221;
        return arg0 != 84;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lha;I)Lria;")
    public final class286 method325(class60 arg0, int arg1) {
        if (arg1 != 92160000) {
            return null;
        } else {
            ++field7231;
            return this.field7233;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z")
    public final boolean method321(byte arg0) {
        ++field7219;
        if (arg0 > -125) {
            this.field7214 = true;
        }
        return this.field7226.method900(125);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
    public final void method316(byte arg0) {
        ++field7216;
        if (arg0 != -66) {
            this.field7233 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "(B)I")
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            return -8;
        } else {
            ++field7225;
            return this.field7226.method898(64);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lha;Z)V")
    public final void method314(class60 arg0, boolean arg1) {
        if (arg1) {
            this.method737(43, (class593) null, true, 114, (class60) null, -58, 77);
        }
        ++field7223;
        class473 var3 = this.field7226.method903(arg0, 262144, 110, true, true);
        if (var3 != null) {
            int var4 = super.field8423 >> 9;
            int var5 = super.field8428 >> 9;
            class738 var6 = arg0.method442();
            var6.method774(super.field8423, super.field8421, super.field8428);
            this.field7226.method906(var5, false, var5, var6, -101, arg0, var4, var3, var4);
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZIII)V")
    public class507(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class245.method1635(arg8, arg9, 55));
        this.field7226 = new class128(arg0, arg1, arg8, arg9, super.field8429, arg3, this, arg7, arg10);
        this.field7214 = ~arg1.field3113 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBLha;I)Z")
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field7218;
        if (arg1 >= -44) {
            return false;
        } else {
            class473 var5 = this.field7226.method903(arg2, 131072, 93, false, false);
            if (var5 == null) {
                return false;
            } else {
                class738 var6 = arg2.method442();
                var6.method774(super.field8423, super.field8421, super.field8428);
                return class418.field6258 ? var5.method283(arg0, arg3, var6, false, 0, class188.field2859) : var5.method277(arg0, arg3, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lha;B)V")
    public final void method310(class60 arg0, byte arg1) {
        this.field7226.method907(arg1 ^ -12854, arg0);
        if (arg1 != -88) {
            this.method329((byte) 95);
        }
        ++field7232;
    }
}

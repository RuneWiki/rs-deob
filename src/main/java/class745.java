import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class745 extends class343 implements class721 {

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Z")
    private boolean field10429 = false;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "Lqea;")
    public class128 field10432;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "Z")
    private boolean field10441;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field10436 = -1;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field10425;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field10426;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field10433;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field10438;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "Lria;")
    private class286 field10447;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 6)
    public final void method316(byte arg0) {
        if (arg0 == -66) {
            ++field10431;
        }
    }

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "(B)Z", line = 19)
    public final boolean method329(byte arg0) {
        ++field10445;
        int var2 = 126 % ((arg0 - -33) / 42);
        return this.field10429;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILha;)V", line = 31)
    public final void method318(int arg0, class60 arg1) {
        this.field10432.method905(21, arg1);
        ++field10444;
        int var3 = -66 / ((arg0 - 8) / 57);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V", line = 42)
    public final void method741(int arg0) {
        if (arg0 <= -93) {
            ++field10438;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Z", line = 54)
    public final boolean method738(byte arg0) {
        if (arg0 != 88) {
            return false;
        } else {
            ++field10443;
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I", line = 66)
    public final int method327(int arg0) {
        if (arg0 >= -116) {
            this.field10441 = true;
        }
        ++field10425;
        return this.field10432.field1696;
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(B)Z", line = 79)
    public final boolean method320(byte arg0) {
        ++field10426;
        if (arg0 != 84) {
            this.method320((byte) -74);
        }
        return false;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZII)V", line = 91)
    public class745(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field3083);
        this.field10432 = new class128(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field10441 = ~arg1.field3113 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(B)I", line = 100)
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            return 125;
        } else {
            ++field10440;
            return this.field10432.method898(49);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLfe;)V", line = 111)
    public final void method4166(boolean arg0, class572 arg1) {
        ++field10424;
        if (!arg0) {
            this.field10432 = null;
        }
        this.field10432.method896(arg1, 6706);
    }

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "(B)I", line = 123)
    public final int method313(byte arg0) {
        if (arg0 != 3) {
            this.field10441 = false;
        }
        ++field10442;
        return this.field10432.method899(112);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lha;B)Lc;", line = 144)
    public final class187 method319(class60 arg0, byte arg1) {
        ++field10430;
        class473 var3 = this.field10432.method903(arg0, 2048, 96, false, true);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -14 / ((-25 - arg1) / 60);
            class738 var5 = arg0.method442();
            var5.method774(super.field8423, super.field8421, super.field8428);
            class187 var6 = class650.method3774(97, this.field10441, 1);
            int var7 = super.field8423 >> 9;
            int var8 = super.field8428 >> 9;
            this.field10432.method906(var8, true, var8, var5, -74, arg0, var7, var3, var7);
            if (class418.field6258) {
                var3.method235(var5, var6.field2851[0], class188.field2859, 0);
            } else {
                var3.method265(var5, var6.field2851[0], 0);
            }
            if (this.field10432.field1690 != null) {
                class624 var9 = this.field10432.field1690.method3603();
                if (!class418.field6258) {
                    arg0.method523(var9);
                } else {
                    arg0.method505(var9, class188.field2859);
                }
            }
            this.field10429 = var3.method275() || this.field10432.field1690 != null;
            if (this.field10447 == null) {
                this.field10447 = class60.method527(var3, super.field8428, super.field8423, super.field8421, -22060);
            } else {
                class240.method1604(super.field8428, var3, super.field8421, true, this.field10447, super.field8423);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I", line = 194)
    public final int method317(int arg0) {
        if (arg0 <= 112) {
            this.method329((byte) 101);
        }
        ++field10435;
        return this.field10432.field1709;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lha;B)V", line = 205)
    public final void method310(class60 arg0, byte arg1) {
        if (arg1 == -88) {
            ++field10434;
            this.field10432.method907(12898, arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLha;I)Z", line = 222)
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field10448;
        class473 var5 = this.field10432.method903(arg2, 131072, 107, false, false);
        if (var5 == null) {
            return false;
        } else {
            class738 var6 = arg2.method442();
            var6.method774(super.field8423, super.field8421, super.field8428);
            if (arg1 >= -44) {
                return false;
            } else {
                return !class418.field6258 ? var5.method277(arg0, arg3, var6, false, 0) : var5.method283(arg0, arg3, var6, false, 0, class188.field2859);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lha;Z)V", line = 242)
    public final void method314(class60 arg0, boolean arg1) {
        ++field10446;
        class473 var3 = this.field10432.method903(arg0, 262144, 122, true, true);
        if (arg1) {
            this.field10432 = null;
        }
        if (var3 != null) {
            int var4 = super.field8423 >> 9;
            int var5 = super.field8428 >> 9;
            class738 var6 = arg0.method442();
            var6.method774(super.field8423, super.field8421, super.field8428);
            this.field10432.method906(var5, false, var5, var6, -25, arg0, var4, var3, var4);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)Z", line = 267)
    public static final boolean method4167(byte arg0, int arg1, int arg2) {
        ++field10437;
        if (arg0 != -37) {
            field10436 = -23;
        }
        return ~(65536 & arg2) != -1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)Z", line = 279)
    public final boolean method321(byte arg0) {
        if (arg0 >= -125) {
            return true;
        } else {
            ++field10427;
            return this.field10432.method900(119);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lha;I)Lria;", line = 291)
    public final class286 method325(class60 arg0, int arg1) {
        ++field10439;
        if (arg1 != 92160000) {
            this.field10429 = false;
        }
        return this.field10447;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)I", line = 302)
    public final int method309(byte arg0) {
        ++field10433;
        if (arg0 >= -16) {
            this.field10447 = null;
        }
        return this.field10432.field1697;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILvs;ZILha;II)V", line = 314)
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        if (arg0 != 8616) {
            this.field10429 = true;
        }
        ++field10428;
        throw new IllegalStateException();
    }
}

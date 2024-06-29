import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class280 implements class392 {

    @OriginalMember(owner = "client!ft", name = "hb", descriptor = "Z")
    private boolean field38 = false;

    @OriginalMember(owner = "client!ft", name = "fb", descriptor = "Lek;")
    public class535 field36;

    @OriginalMember(owner = "client!ft", name = "W", descriptor = "Z")
    private boolean field27;

    @OriginalMember(owner = "client!ft", name = "ib", descriptor = "Lml;")
    public static class410 field39 = new class410("", 12);

    @OriginalMember(owner = "client!ft", name = "ob", descriptor = "I")
    public static int field45 = 2;

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ft", name = "V", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ft", name = "X", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "Y", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "Z", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ft", name = "ab", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ft", name = "bb", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ft", name = "cb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ft", name = "db", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ft", name = "eb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ft", name = "gb", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ft", name = "jb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ft", name = "kb", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ft", name = "lb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ft", name = "mb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ft", name = "pb", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ft", name = "nb", descriptor = "Lel;")
    private class574 field44;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)I")
    public final int method17(int arg0) {
        if (arg0 != -2132) {
            return -103;
        } else {
            ++field24;
            return this.field36.field7293;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
    public final int method18(int arg0) {
        ++field46;
        if (arg0 != -10908) {
            this.method32((byte) -71, (class65) null);
        }
        return this.field36.field7283;
    }

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)Z")
    public final boolean method19(int arg0) {
        ++field30;
        if (arg0 > -87) {
            this.method31(-79);
        }
        return false;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lha;I)V")
    public final void method20(class65 arg0, int arg1) {
        if (arg1 != -4947) {
            field39 = null;
        }
        ++field34;
        this.field36.method3066((byte) -124, arg0);
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZIIIII)V")
    public class4(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field36 = new class535(arg0, arg1, arg10, arg11, super.field2250, arg3, this, arg7, arg12);
        this.field27 = ~arg1.field7933 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        ++field40;
        if (arg0 != 0) {
            this.method28(98);
        }
        return this.field38;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILha;)Ldfa;")
    public final class176 method22(int arg0, class65 arg1) {
        ++field43;
        class500 var3 = this.field36.method3054(true, arg1, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class303 var4 = arg1.method450();
            var4.method981(super.field4132 + super.field2257, super.field2246, super.field4134 + super.field2259);
            if (arg0 != -10) {
                this.method28(-127);
            }
            class176 var5 = class567.method3167(this.field27, arg0 + 10, 1);
            int var6 = super.field2257 >> 9;
            int var7 = super.field2259 >> 9;
            this.field36.method3061(arg1, true, var6, var7, var7, var6, var4, var3, (byte) 92);
            if (class200.field2658) {
                var3.method300(var4, var5.field2345[0], class330.field4773, 0);
            } else {
                var3.method292(var4, var5.field2345[0], 0);
            }
            if (this.field36.field7277 != null) {
                class515 var8 = this.field36.field7277.method3671();
                if (!class200.field2658) {
                    arg1.method524(var8);
                } else {
                    arg1.method532(var8, class330.field4773);
                }
            }
            this.field38 = var3.method326() || this.field36.field7277 != null;
            if (this.field44 == null) {
                this.field44 = class321.method2038(-23545, var3, super.field2259, super.field2257, super.field2246);
            } else {
                class419.method2584(var3, this.field44, super.field2246, super.field2259, super.field2257, arg0 ^ -9);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(Z)V")
    public static void method23(boolean arg0) {
        if (!arg0) {
            field39 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "(I)I")
    public final int method24(int arg0) {
        ++field37;
        if (arg0 != 748449288) {
            this.field36 = null;
        }
        return this.field36.method3056((byte) -122);
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public final void method25(int arg0) {
        if (arg0 != 14667) {
            field39 = null;
        }
        ++field32;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILhj;)V")
    public final void method26(int arg0, class596 arg1) {
        int var3 = -103 % ((arg0 - -45) / 34);
        ++field35;
        this.field36.method3060(-1090, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lha;B)Lel;")
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            this.field36 = null;
        }
        ++field25;
        return this.field44;
    }

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "(I)I")
    public final int method28(int arg0) {
        ++field26;
        if (arg0 != -13878) {
            this.method22(42, (class65) null);
        }
        return this.field36.method3057((byte) 111);
    }

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "(I)[Lmm;")
    public static final class295[] method29(int arg0) {
        ++field28;
        if (arg0 > -114) {
            field39 = null;
        }
        return new class295[] { class628.field8782, class628.field8787, class628.field8788, class628.field8789, class628.field8790, class628.field8791, class628.field8792, class628.field8793, class628.field8794, class628.field8795, class628.field8796, class628.field8797, class628.field8798 };
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        ++field41;
        return arg0 <= 59 ? true : this.field36.method3065(-1);
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)I")
    public final int method31(int arg0) {
        ++field33;
        if (arg0 != -23356) {
            this.field36 = null;
        }
        return this.field36.field7278;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLha;)V")
    public final void method32(byte arg0, class65 arg1) {
        ++field29;
        class500 var3 = this.field36.method3054(true, arg1, true, 262144, false);
        if (var3 != null) {
            int var4 = super.field2257 >> 9;
            int var5 = super.field2259 >> 9;
            class303 var6 = arg1.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            this.field36.method3061(arg1, false, var4, var5, var5, var4, var6, var3, (byte) 109);
        }
        if (arg0 <= 69) {
            this.field44 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        if (arg0 != 4161) {
            this.field27 = false;
        }
        ++field31;
        class500 var5 = this.field36.method3054(true, arg3, false, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class303 var6 = arg3.method450();
            var6.method981(super.field4132 + super.field2257, super.field2246, super.field4134 + super.field2259);
            return class200.field2658 ? var5.method311(arg2, arg1, var6, false, 0, class330.field4773) : var5.method291(arg2, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lha;I)V")
    public final void method34(class65 arg0, int arg1) {
        this.field36.method3063(13959, arg0);
        if (arg1 != -4351) {
            this.field44 = null;
        }
        ++field42;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class557 extends class444 implements class706 {

    @OriginalMember(owner = "client!nda", name = "hb", descriptor = "Z")
    private boolean field7826;

    @OriginalMember(owner = "client!nda", name = "Y", descriptor = "Z")
    private boolean field7817;

    @OriginalMember(owner = "client!nda", name = "db", descriptor = "B")
    private byte field7822;

    @OriginalMember(owner = "client!nda", name = "rb", descriptor = "B")
    private byte field7836;

    @OriginalMember(owner = "client!nda", name = "W", descriptor = "Z")
    private boolean field7815;

    @OriginalMember(owner = "client!nda", name = "bb", descriptor = "S")
    private short field7820;

    @OriginalMember(owner = "client!nda", name = "ab", descriptor = "Z")
    private boolean field7819;

    @OriginalMember(owner = "client!nda", name = "N", descriptor = "Lr;")
    private class180 field7807;

    @OriginalMember(owner = "client!nda", name = "cb", descriptor = "Lka;")
    public class471 field7821;

    @OriginalMember(owner = "client!nda", name = "R", descriptor = "Lpw;")
    public static class705 field7810 = new class705();

    @OriginalMember(owner = "client!nda", name = "jb", descriptor = "I")
    public static int field7828 = 0;

    @OriginalMember(owner = "client!nda", name = "J", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!nda", name = "L", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!nda", name = "M", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!nda", name = "P", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!nda", name = "Q", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!nda", name = "S", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!nda", name = "U", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!nda", name = "V", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!nda", name = "X", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!nda", name = "Z", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!nda", name = "eb", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!nda", name = "fb", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!nda", name = "gb", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!nda", name = "ib", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!nda", name = "kb", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!nda", name = "lb", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!nda", name = "mb", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!nda", name = "nb", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!nda", name = "pb", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!nda", name = "qb", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!nda", name = "T", descriptor = "Lch;")
    public static class463 field7812;

    @OriginalMember(owner = "client!nda", name = "ob", descriptor = "Lkj;")
    private class566 field7833;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 3)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        if (arg5 != 22501) {
            this.field7817 = false;
        }
        ++field7805;
        if (arg4 instanceof class557) {
            class557 var8 = (class557) arg4;
            if (this.field7821 != null && var8.field7821 != null) {
                this.field7821.method237(var8.field7821, arg6, arg2, arg3, arg0);
            }
        } else {
            if (arg4 instanceof class417) {
                class417 var9 = (class417) arg4;
                if (this.field7821 != null && var9.field5882 != null) {
                    this.field7821.method237(var9.field5882, arg6, arg2, arg3, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BLha;)V", line = 36)
    public final void method753(byte arg0, class58 arg1) {
        ++field7813;
        int var3 = -36 % ((18 - arg0) / 40);
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)I", line = 47)
    public final int method868(byte arg0) {
        ++field7806;
        if (arg0 != -10) {
            this.method752((class58) null, 46, -114, -10);
        }
        return this.field7822;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lha;ZZI)Lqha;", line = 61)
    private final class102 method3213(class58 arg0, boolean arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field7820 = -108;
        }
        ++field7825;
        class10 var5 = class612.field8588.method558((byte) 111, 65535 & this.field7820);
        class278 var6;
        class278 var7;
        if (this.field7815) {
            var6 = class588.field8292[0];
            var7 = class135.field1969[super.field1258];
        } else {
            var7 = class588.field8292[super.field1258];
            if (~super.field1258 > -4) {
                var6 = class588.field8292[super.field1258 - -1];
            } else {
                var6 = null;
            }
        }
        return var5.method71(-111, super.field1255, var7, var6, arg1, this.field7836, super.field1264, super.field1250, arg0, arg3, this.field7822);
    }

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "(I)V", line = 92)
    public final void method614(int arg0) {
        ++field7816;
        if (arg0 != 26062) {
            this.field7815 = true;
        }
        this.field7826 = false;
        if (this.field7821 != null) {
            this.field7821.method242(-65537 & this.field7821.method228());
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILha;)Lka;", line = 109)
    private final class471 method3214(int arg0, int arg1, class58 arg2) {
        if (arg1 >= -73) {
            return null;
        } else {
            ++field7834;
            if (this.field7821 != null && ~arg2.method466(this.field7821.method228(), arg0) == -1) {
                return this.field7821;
            } else {
                class102 var4 = this.method3213(arg2, false, true, arg0);
                return var4 == null ? null : var4.field1213;
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lha;B)V", line = 135)
    public final void method864(class58 arg0, byte arg1) {
        ++field7824;
        if (arg1 != -73) {
            this.field7826 = true;
        }
        Object var3 = null;
        class180 var5;
        if (this.field7807 == null && this.field7819) {
            class102 var4 = this.method3213(arg0, true, true, 262144);
            var5 = var4 != null ? var4.field1214 : null;
        } else {
            var5 = this.field7807;
            this.field7807 = null;
        }
        if (var5 != null) {
            class412.method2537(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lha;III)Z", line = 162)
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field7831;
        class471 var5 = this.method3214(131072, -86, arg0);
        if (var5 != null) {
            class513 var6 = arg0.method439();
            var6.method339(super.field1264, super.field1255, super.field1250);
            return !class180.field2409 ? var5.method233(arg3, arg2, var6, false, 0) : var5.method229(arg3, arg2, var6, false, 0, class516.field7361);
        } else {
            return arg1 != 0 ? false : false;
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(ILha;)Lkj;", line = 183)
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.field7821 = null;
        }
        ++field7829;
        if (this.field7833 == null) {
            this.field7833 = class654.method3596(super.field1255, this.method3214(0, -105, arg1), super.field1264, super.field1250, (byte) 14);
        }
        return this.field7833;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(BLha;)Lml;", line = 199)
    public final class387 method755(byte arg0, class58 arg1) {
        ++field7808;
        if (this.field7821 == null) {
            return null;
        } else {
            if (arg0 != -127) {
                this.field7826 = false;
            }
            class513 var3 = arg1.method439();
            var3.method339(super.field1264, super.field1255, super.field1250);
            class387 var4 = class65.method544(this.field7817, 1, 24824);
            if (!class180.field2409) {
                this.field7821.method221(var3, var4.field5482[0], 0);
            } else {
                this.field7821.method262(var3, var4.field5482[0], class516.field7361, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILha;)V", line = 226)
    public final void method860(int arg0, class58 arg1) {
        ++field7818;
        Object var3 = null;
        if (arg0 <= 15) {
            field7828 = -71;
        }
        class180 var5;
        if (this.field7807 == null && this.field7819) {
            class102 var4 = this.method3213(arg1, true, true, 262144);
            var5 = var4 == null ? null : var4.field1214;
        } else {
            var5 = this.field7807;
            this.field7807 = null;
        }
        if (var5 != null) {
            class583.method3312(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)I", line = 257)
    public final int method865(int arg0) {
        ++field7827;
        if (arg0 != 30374) {
            field7810 = null;
        }
        return this.field7836;
    }

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "(I)V", line = 268)
    public static void method3215(int arg0) {
        field7812 = null;
        if (arg0 >= -97) {
            field7828 = -96;
        }
        field7810 = null;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(B)I", line = 280)
    public final int method861(byte arg0) {
        if (arg0 != -17) {
            this.field7821 = null;
        }
        ++field7803;
        return this.field7820 & 65535;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)Z", line = 292)
    public final boolean method867(byte arg0) {
        if (arg0 < 82) {
            return true;
        } else {
            ++field7830;
            return this.field7819;
        }
    }

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "(I)I", line = 304)
    public final int method749(int arg0) {
        if (arg0 != 32767) {
            return 40;
        } else {
            ++field7804;
            return this.field7821 == null ? 0 : this.field7821.method253();
        }
    }

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "(I)Z", line = 316)
    public final boolean method746(int arg0) {
        ++field7823;
        if (arg0 >= -106) {
            this.field7820 = 122;
        }
        if (this.field7821 == null) {
            return true;
        } else {
            return !this.field7821.method243();
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZIIZ)V", line = 331)
    public class557(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class408.method2523(-30231, arg8, arg9));
        this.field7826 = arg10;
        this.field7817 = arg1.field207 != 0 && !arg7;
        this.field7822 = (byte) arg8;
        super.field1264 = arg4;
        super.field1250 = arg6;
        this.field7836 = (byte) arg9;
        this.field7815 = arg7;
        this.field7820 = (short) arg1.field236;
        this.field7819 = arg0.method487() && arg1.field177 && !this.field7815 && ~field7812.field6542.method1222(false) != -1;
        int var12 = 2048;
        if (this.field7826) {
            var12 |= 65536;
        }
        class102 var13 = this.method3213(arg0, this.field7819, true, var12);
        if (var13 != null) {
            this.field7807 = var13.field1214;
            this.field7821 = var13.field1213;
            if (this.field7826) {
                this.field7821 = this.field7821.method226((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "(B)I", line = 371)
    public final int method750(byte arg0) {
        if (arg0 != 14) {
            this.method755((byte) 56, (class58) null);
        }
        ++field7811;
        return this.field7821 != null ? this.field7821.method218() : 0;
    }

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "(B)V", line = 383)
    public final void method866(byte arg0) {
        if (arg0 != -62) {
            field7812 = null;
        }
        if (this.field7821 != null) {
            this.field7821.method230();
        }
        ++field7809;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)Z", line = 406)
    public final boolean method751(boolean arg0) {
        ++field7835;
        if (arg0) {
            this.method749(-127);
        }
        return this.field7821 != null ? this.field7821.method224() : false;
    }

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "(I)Z", line = 422)
    public final boolean method621(int arg0) {
        ++field7814;
        if (arg0 >= -103) {
            field7812 = null;
        }
        return this.field7826;
    }
}

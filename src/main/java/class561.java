import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class561 extends class744 implements class722 {

    @OriginalMember(owner = "client!tv", name = "db", descriptor = "B")
    private byte field7940;

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "B")
    private byte field7922;

    @OriginalMember(owner = "client!tv", name = "kb", descriptor = "Z")
    private boolean field7947;

    @OriginalMember(owner = "client!tv", name = "eb", descriptor = "S")
    private short field7941;

    @OriginalMember(owner = "client!tv", name = "Q", descriptor = "Z")
    private boolean field7927;

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "Z")
    private boolean field7925;

    @OriginalMember(owner = "client!tv", name = "ib", descriptor = "Lka;")
    private class472 field7945;

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "Lr;")
    private class184 field7921;

    @OriginalMember(owner = "client!tv", name = "R", descriptor = "Lue;")
    public static class234 field7928 = null;

    @OriginalMember(owner = "client!tv", name = "U", descriptor = "Z")
    public static boolean field7931 = true;

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!tv", name = "P", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!tv", name = "S", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!tv", name = "T", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!tv", name = "V", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!tv", name = "W", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!tv", name = "X", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!tv", name = "Z", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!tv", name = "bb", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!tv", name = "cb", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!tv", name = "fb", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!tv", name = "gb", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!tv", name = "hb", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!tv", name = "jb", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!tv", name = "lb", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!tv", name = "mb", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!tv", name = "nb", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!tv", name = "ob", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!tv", name = "pb", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!tv", name = "ab", descriptor = "Loia;")
    private class90 field7937;

    @OriginalMember(owner = "client!tv", name = "Y", descriptor = "[Llr;")
    public static class752[] field7935;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I", line = 4)
    public final int method685(int arg0) {
        ++field7929;
        if (arg0 != 4657) {
            this.method136((class60) null, 86);
        }
        return this.field7922;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILha;BI)Z", line = 16)
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        ++field7934;
        class472 var5 = this.method3165(0, 131072, arg1);
        if (arg2 < 59) {
            this.field7921 = null;
        }
        if (var5 != null) {
            class10 var6 = arg1.method410();
            var6.method33(super.field2170, super.field2178, super.field2165);
            return !class670.field9312 ? var5.method206(arg0, arg3, var6, false, 0) : var5.method196(arg0, arg3, var6, false, 0, class661.field9249);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIIIBI)V", line = 42)
    public static final void method3163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        ++field7930;
        if (class382.method2244(arg3, 68)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = -10 / ((arg7 - 50) / 37);
            int var15 = 0;
            if (class247.field3206) {
                var12 = class590.field8236;
                var15 = class724.field10114;
                var13 = class130.field1683;
                var10 = class504.field6851;
                var11 = class234.field3049;
                class724.field10114 = 1;
            }
            if (class607.field8483[arg3] == null) {
                class507.method2821(-1, true, arg5, arg8, arg2, arg1, class357.field4742[arg3], arg6, arg0, ~arg1 > -1, arg4);
            } else {
                class507.method2821(-1, true, arg5, arg8, arg2, arg1, class607.field8483[arg3], arg6, arg0, arg1 < 0, arg4);
            }
            if (class247.field3206) {
                if (arg1 >= 0 && class724.field10114 == 2) {
                    class207.method1157(class130.field1683, class234.field3049, false, class504.field6851, class590.field8236);
                }
                class724.field10114 = var15;
                class234.field3049 = var11;
                class130.field1683 = var13;
                class504.field6851 = var10;
                class590.field8236 = var12;
            }
        } else if (~arg1 != 0) {
            class24.field186[arg1] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class24.field186[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lha;I)V", line = 114)
    public final void method679(class60 arg0, int arg1) {
        ++field7951;
        Object var3 = null;
        class184 var5;
        if (this.field7921 == null && this.field7925) {
            class696 var4 = this.method3164(262144, 0, true, arg0);
            var5 = var4 == null ? null : var4.field9720;
        } else {
            var5 = this.field7921;
            this.field7921 = null;
        }
        if (var5 != null) {
            class432.method2467(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
        }
        if (arg1 != 24447) {
            method3166(-28, 5, -60);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z", line = 142)
    public final boolean method682(boolean arg0) {
        ++field7926;
        if (!arg0) {
            this.field7940 = -120;
        }
        return this.field7925;
    }

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)Z", line = 154)
    public final boolean method126(int arg0) {
        if (arg0 != 6540) {
            field7935 = null;
        }
        ++field7924;
        return this.field7945 != null ? this.field7945.method219() : false;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V", line = 171)
    public final void method681(byte arg0) {
        if (this.field7945 != null) {
            this.field7945.method240();
        }
        if (arg0 == -96) {
            ++field7920;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZLha;)Lsfa;", line = 185)
    private final class696 method3164(int arg0, int arg1, boolean arg2, class60 arg3) {
        ++field7950;
        class685 var5 = class707.field9894.method4109(this.field7941 & 65535, (byte) 119);
        if (arg1 != 0) {
            return null;
        } else {
            class281 var6;
            class281 var7;
            if (!this.field7947) {
                var6 = class86.field1182[super.field2167];
                if (~super.field2167 <= -4) {
                    var7 = null;
                } else {
                    var7 = class86.field1182[super.field2167 + 1];
                }
            } else {
                var6 = class143.field1850[super.field2167];
                var7 = class86.field1182[0];
            }
            return var5.method3874(super.field2165, false, var7, this.field7922, super.field2178, arg2, super.field2170, arg0, (class150) null, var6, arg3, this.field7940);
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)Z", line = 215)
    public final boolean method123(int arg0) {
        int var2 = 10 / ((arg0 - -76) / 47);
        ++field7946;
        if (this.field7945 != null) {
            return !this.field7945.method204();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Lha;I)Lbd;", line = 233)
    public final class62 method127(class60 arg0, int arg1) {
        ++field7943;
        if (this.field7945 == null) {
            return null;
        } else {
            class10 var3 = arg0.method410();
            if (arg1 > -12) {
                this.field7945 = null;
            }
            var3.method33(super.field2170 - -super.field10345, super.field2178, super.field10340 + super.field2165);
            class62 var4 = class413.method2384(1, (byte) -47, this.field7927);
            if (class670.field9312) {
                this.field7945.method243(var3, var4.field678[0], class661.field9249, 0);
            } else {
                this.field7945.method230(var3, var4.field678[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)I", line = 261)
    public final int method686(byte arg0) {
        ++field7936;
        if (arg0 != 20) {
            field7923 = -124;
        }
        return this.field7940;
    }

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "(I)I", line = 275)
    public final int method132(int arg0) {
        ++field7933;
        if (arg0 != 0) {
            return 33;
        } else {
            return this.field7945 == null ? 0 : this.field7945.method234();
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLha;)Loia;", line = 289)
    public final class90 method134(byte arg0, class60 arg1) {
        ++field7949;
        if (arg0 != -53) {
            field7931 = true;
        }
        if (this.field7937 == null) {
            this.field7937 = class185.method1041(super.field2178, super.field2170, this.method3165(0, 0, arg1), super.field2165, 4);
        }
        return this.field7937;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lha;Lvha;IIIIIZIIII)V", line = 309)
    public class561(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field2170 = arg4;
        super.field2165 = arg6;
        this.field7940 = (byte) arg10;
        this.field7922 = (byte) arg11;
        this.field7947 = arg7;
        this.field7941 = (short) arg1.field9541;
        this.field7927 = arg1.field9610 != 0 && !arg7;
        this.field7925 = arg0.method381() && arg1.field9540 && !this.field7947 && class11.field68.field5545.method61((byte) 120) != 0;
        class696 var13 = this.method3164(2048, 0, this.field7925, arg0);
        if (var13 != null) {
            this.field7945 = var13.field9718;
            this.field7921 = var13.field9720;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I", line = 332)
    public final int method680(int arg0) {
        ++field7952;
        if (arg0 != 30472) {
            field7923 = 40;
        }
        return this.field7941 & 65535;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILha;)V", line = 347)
    public final void method678(int arg0, class60 arg1) {
        ++field7939;
        Object var3 = null;
        if (arg0 != -25163) {
            this.method686((byte) 113);
        }
        class184 var5;
        if (this.field7921 == null && this.field7925) {
            class696 var4 = this.method3164(262144, 0, true, arg1);
            var5 = var4 != null ? var4.field9720 : null;
        } else {
            var5 = this.field7921;
            this.field7921 = null;
        }
        if (var5 != null) {
            class65.method500(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILha;)Lka;", line = 375)
    private final class472 method3165(int arg0, int arg1, class60 arg2) {
        ++field7938;
        if (this.field7945 != null && arg2.method396(this.field7945.method225(), arg1) == 0) {
            return this.field7945;
        } else {
            class696 var4 = this.method3164(arg1, arg0, false, arg2);
            return var4 == null ? null : var4.field9718;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)Z", line = 393)
    public static final boolean method3166(int arg0, int arg1, int arg2) {
        ++field7932;
        if (arg0 != -27984) {
            method3168((class716) null, false, 3);
        }
        return ~(2048 & arg2) != -1 && ~(55 & arg1) != -1;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(Lha;I)V", line = 404)
    public final void method136(class60 arg0, int arg1) {
        int var3 = 14 / ((arg1 - 53) / 46);
        ++field7948;
    }

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "(I)V", line = 416)
    public static void method3167(int arg0) {
        if (arg0 != 0) {
            field7935 = null;
        }
        field7935 = null;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)I", line = 426)
    public final int method128(boolean arg0) {
        ++field7942;
        if (arg0) {
            this.field7940 = 100;
        }
        return this.field7945 == null ? 0 : this.field7945.method212();
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljga;ZI)V", line = 437)
    public static final void method3168(class716 arg0, boolean arg1, int arg2) {
        ++field7944;
        if (arg2 != 28643) {
            method3163(41, -106, -106, 7, 104, 23, 118, (byte) 62, 77);
        }
        class566.field7989.method498(0, arg0);
        if (arg1) {
            class24.method97(class647.field9003, -25233, arg0, class566.field7989, class303.field4094, class556.field7844);
        }
    }
}

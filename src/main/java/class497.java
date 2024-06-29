import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class497 extends class208 implements class226 {

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "S")
    private short field6814;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "Z")
    private boolean field6831;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "B")
    private byte field6826;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "Z")
    private boolean field6816;

    @OriginalMember(owner = "client!kb", name = "sb", descriptor = "Z")
    private boolean field6836;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "B")
    private byte field6824;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "Z")
    private boolean field6830;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lka;")
    public class233 field6817;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "Lr;")
    private class115 field6813;

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "Z")
    public static boolean field6832 = false;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "[Lsk;")
    public static class495[] field6812 = new class495[14];

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!kb", name = "pb", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!kb", name = "qb", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!kb", name = "rb", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!kb", name = "tb", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!kb", name = "ub", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!kb", name = "wb", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!kb", name = "xb", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!kb", name = "yb", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!kb", name = "zb", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!kb", name = "vb", descriptor = "Lmg;")
    private class248 field6839;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lha;I)Luh;", line = 7)
    public final class162 method204(class475 arg0, int arg1) {
        ++field6825;
        if (this.field6817 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                this.method2907(-50);
            }
            class765 var3 = arg0.method457();
            var3.method1568(super.field10347, super.field10358, super.field10350);
            class162 var4 = class527.method3085(1, this.field6836, 0);
            if (!class765.field10581) {
                this.field6817.method575(var3, var4.field2500[0], 0);
            } else {
                this.field6817.method546(var3, var4.field2500[0], class349.field4956, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)I", line = 38)
    public final int method1173(boolean arg0) {
        ++field6822;
        if (!arg0) {
            return 10;
        } else {
            return this.field6817 == null ? 0 : this.field6817.method544();
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V", line = 49)
    public final void method196(int arg0) {
        ++field6821;
        this.field6831 = false;
        if (arg0 != -10382) {
            this.field6816 = false;
        }
        if (this.field6817 != null) {
            this.field6817.method523(-65537 & this.field6817.method591());
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIILha;)Z", line = 67)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        int var5 = -121 % ((arg0 - 51) / 51);
        ++field6827;
        class233 var6 = this.method2910(arg3, (byte) 106, 131072);
        if (var6 != null) {
            class765 var7 = arg3.method457();
            var7.method1568(super.field10347, super.field10358, super.field10350);
            return class765.field10581 ? var6.method584(arg1, arg2, var7, false, 0, class349.field4956) : var6.method589(arg1, arg2, var7, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILha;)V", line = 93)
    public final void method192(int arg0, class475 arg1) {
        if (arg0 > 2) {
            ++field6838;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 106)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        if (arg0 == -24659) {
            if (!(arg4 instanceof class352)) {
                if (arg4 instanceof class497) {
                    class497 var8 = (class497) arg4;
                    if (this.field6817 != null && var8.field6817 != null) {
                        this.field6817.method559(var8.field6817, arg1, arg6, arg2, arg5);
                    }
                }
            } else {
                class352 var9 = (class352) arg4;
                if (this.field6817 != null && var9.field4981 != null) {
                    this.field6817.method559(var9.field4981, arg1, arg6, arg2, arg5);
                }
            }
            ++field6818;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z", line = 138)
    public final boolean method1164(byte arg0) {
        ++field6829;
        if (arg0 != 4) {
            this.field6836 = false;
        }
        return this.field6830;
    }

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "(I)I", line = 154)
    public final int method2907(int arg0) {
        if (arg0 != 15) {
            return 52;
        } else {
            ++field6841;
            return this.field6817 != null ? this.field6817.method547() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZILha;B)Liu;", line = 165)
    private final class529 method2908(boolean arg0, int arg1, class475 arg2, byte arg3) {
        ++field6820;
        if (arg3 != 51) {
            this.method1173(false);
        }
        class416 var5 = class312.field4418.method369((byte) 124, 65535 & this.field6814);
        class419 var6;
        class419 var7;
        if (!this.field6816) {
            if (super.field10349 < 3) {
                var6 = class495.field6799[super.field10349 + 1];
            } else {
                var6 = null;
            }
            var7 = class495.field6799[super.field10349];
        } else {
            var7 = class454.field6207[super.field10349];
            var6 = class495.field6799[0];
        }
        return var5.method2447(-106, ~this.field6826 != -12 ? this.field6824 : 4 - -this.field6824, ~this.field6826 != -12 ? this.field6826 : 10, super.field10350, arg1, arg0, super.field10358, var6, (class685) null, super.field10347, arg2, var7);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)Z", line = 197)
    public final boolean method197(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field6833;
            return this.field6831;
        }
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(B)V", line = 208)
    public static void method2909(byte arg0) {
        if (arg0 != 46) {
            field6812 = null;
        }
        field6812 = null;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)I", line = 219)
    public final int method1167(int arg0) {
        if (arg0 <= 75) {
            return 15;
        } else {
            ++field6819;
            return this.field6817 != null ? this.field6817.method534() : 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I", line = 232)
    public final int method1166(int arg0) {
        ++field6811;
        int var2 = -39 % ((14 - arg0) / 62);
        return this.field6826;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lha;BI)Lka;", line = 244)
    private final class233 method2910(class475 arg0, byte arg1, int arg2) {
        ++field6823;
        if (this.field6817 != null && arg0.method497(this.field6817.method591(), arg2) == 0) {
            return this.field6817;
        } else if (arg1 < 78) {
            return null;
        } else {
            class529 var4 = this.method2908(false, arg2, arg0, (byte) 51);
            return var4 != null ? var4.field7375 : null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 266)
    public final void method1172(byte arg0) {
        if (arg0 < 72) {
            this.field6816 = true;
        }
        if (this.field6817 != null) {
            this.field6817.method583();
        }
        ++field6834;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)I", line = 280)
    public final int method1174(byte arg0) {
        int var2 = 38 / ((-63 - arg0) / 47);
        ++field6840;
        return this.field6824;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I", line = 290)
    public final int method1165(byte arg0) {
        ++field6837;
        if (arg0 <= 89) {
            this.field6826 = -79;
        }
        return 65535 & this.field6814;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Z", line = 301)
    public final boolean method1170(int arg0) {
        if (arg0 != 16383) {
            method2909((byte) 72);
        }
        ++field6835;
        if (this.field6817 != null) {
            return !this.field6817.method587();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILha;)V", line = 315)
    public final void method1169(int arg0, class475 arg1) {
        ++field6828;
        Object var3 = null;
        class115 var5;
        if (this.field6813 == null && this.field6830) {
            class529 var4 = this.method2908(true, 262144, arg1, (byte) 51);
            var5 = var4 != null ? var4.field7377 : null;
        } else {
            var5 = this.field6813;
            this.field6813 = null;
        }
        if (arg0 == -10526) {
            if (var5 != null) {
                class632.method3610(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZIIIIIIZ)V", line = 342)
    public class497(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5727 == 1, class509.method2975(arg12, (byte) 127, arg13));
        this.field6814 = (short) arg1.field5746;
        this.field6831 = arg14;
        this.field6826 = (byte) arg12;
        this.field6816 = arg7;
        this.field6836 = ~arg1.field5754 != -1 && !arg7;
        super.field10349 = (byte) arg3;
        this.field6824 = (byte) arg13;
        this.field6830 = arg0.method500() && arg1.field5770 && !this.field6816 && class420.field5820.field9457.method3741(17539) != 0;
        int var16 = 2048;
        if (this.field6831) {
            var16 |= 65536;
        }
        class529 var17 = this.method2908(this.field6830, var16, arg0, (byte) 51);
        if (var17 != null) {
            this.field6817 = var17.field7375;
            this.field6813 = var17.field7377;
            if (this.field6831) {
                this.field6817 = this.field6817.method585((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(BLha;)Lmg;", line = 375)
    public final class248 method205(byte arg0, class475 arg1) {
        if (this.field6839 == null) {
            this.field6839 = class229.method1563(super.field10350, super.field10358, (byte) -110, this.method2910(arg1, (byte) 86, 0), super.field10347);
        }
        if (arg0 != 45) {
            this.method196(-94);
        }
        ++field6815;
        return this.field6839;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILha;)V", line = 390)
    public final void method1163(int arg0, class475 arg1) {
        ++field6843;
        Object var3 = null;
        class115 var5;
        if (this.field6813 == null && this.field6830) {
            class529 var4 = this.method2908(true, 262144, arg1, (byte) 51);
            var5 = var4 != null ? var4.field7377 : null;
        } else {
            var5 = this.field6813;
            this.field6813 = null;
        }
        if (arg0 == 18030) {
            if (var5 != null) {
                class460.method2686(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)Z", line = 421)
    public final boolean method1175(byte arg0) {
        if (arg0 <= 38) {
            this.field6824 = -18;
        }
        ++field6842;
        return this.field6817 != null ? this.field6817.method558() : false;
    }
}

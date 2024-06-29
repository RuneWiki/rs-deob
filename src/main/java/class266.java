import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class266 extends class338 implements class226 {

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "Z")
    private boolean field3754 = false;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "Lnb;")
    public class356 field3757;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "Z")
    private boolean field3751;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
    public static int field3762 = 0;

    @OriginalMember(owner = "client!fi", name = "lb", descriptor = "Lmca;")
    public static class41 field3765 = new class41("game4", 3);

    @OriginalMember(owner = "client!fi", name = "qb", descriptor = "[I")
    public static int[] field3770 = new int[3];

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!fi", name = "kb", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!fi", name = "mb", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!fi", name = "nb", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!fi", name = "ob", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!fi", name = "pb", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "Lmg;")
    private class248 field3755;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)I", line = 4)
    public final int method1173(boolean arg0) {
        if (!arg0) {
            return 86;
        } else {
            ++field3756;
            return this.field3757.method2159(-107);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILpe;)V", line = 19)
    public final void method1711(int arg0, class685 arg1) {
        ++field3759;
        this.field3757.method2153(arg1, true);
        if (arg0 != 0) {
            this.method197(true);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILha;)V", line = 30)
    public final void method1163(int arg0, class475 arg1) {
        this.field3757.method2158(arg1, arg0 + -27182);
        if (arg0 == 18030) {
            ++field3764;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lha;I)Luh;", line = 44)
    public final class162 method204(class475 arg0, int arg1) {
        ++field3769;
        class233 var3 = this.field3757.method2152(true, arg0, arg1 ^ 120, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class765 var4 = arg0.method457();
            var4.method1568(super.field10347, super.field10358, super.field10350);
            class162 var5 = class527.method3085(1, this.field3751, 0);
            if (arg1 != -1) {
                field3762 = -106;
            }
            int var6 = super.field10347 >> 9;
            int var7 = super.field10350 >> 9;
            this.field3757.method2148(var7, (byte) 111, var6, var4, var3, var7, true, arg0, var6);
            if (!class765.field10581) {
                var3.method575(var4, var5.field2500[0], 0);
            } else {
                var3.method546(var4, var5.field2500[0], class349.field4956, 0);
            }
            if (this.field3757.field5071 != null) {
                class667 var8 = this.field3757.field5071.method1346();
                if (!class765.field10581) {
                    arg0.method455(var8);
                } else {
                    arg0.method429(var8, class349.field4956);
                }
            }
            this.field3754 = var3.method558() || this.field3757.field5071 != null;
            if (this.field3755 != null) {
                class182.method1319(super.field10350, super.field10347, super.field10358, this.field3755, var3, (byte) 117);
            } else {
                this.field3755 = class229.method1563(super.field10350, super.field10358, (byte) -114, var3, super.field10347);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIILha;)Z", line = 96)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field3760;
        class233 var5 = this.field3757.method2152(false, arg3, -119, 131072, false);
        int var6 = 75 % ((51 - arg0) / 51);
        if (var5 == null) {
            return false;
        } else {
            class765 var7 = arg3.method457();
            var7.method1568(super.field10347, super.field10358, super.field10350);
            return class765.field10581 ? var5.method584(arg1, arg2, var7, false, 0, class349.field4956) : var5.method589(arg1, arg2, var7, false, 0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)I", line = 114)
    public final int method1167(int arg0) {
        ++field3758;
        if (arg0 <= 75) {
            field3765 = null;
        }
        return this.field3757.method2147(80);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(BLha;)Lmg;", line = 127)
    public final class248 method205(byte arg0, class475 arg1) {
        if (arg0 != 45) {
            this.method1163(-53, (class475) null);
        }
        ++field3744;
        return this.field3755;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 138)
    public final void method196(int arg0) {
        ++field3753;
        if (arg0 != -10382) {
            this.method194(-55, -112, -75, (class475) null, (class745) null, true, -12);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V", line = 149)
    public static final void method1712(int arg0) {
        if (arg0 != -26261) {
            method1713(-13);
        }
        ++field3746;
        class169.field2563.method2881((byte) -103);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V", line = 160)
    public final void method1172(byte arg0) {
        ++field3745;
        if (arg0 <= 72) {
            this.field3754 = true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZIII)V", line = 170)
    public class266(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class352.method2137(arg8, (byte) -76, arg9));
        this.field3757 = new class356(arg0, arg1, arg8, arg9, super.field10361, arg3, this, arg7, arg10);
        this.field3751 = arg1.field5754 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "(I)V", line = 179)
    public static void method1713(int arg0) {
        int var1 = 36 % ((72 - arg0) / 50);
        field3770 = null;
        field3765 = null;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(ILha;)V", line = 190)
    public final void method192(int arg0, class475 arg1) {
        ++field3767;
        if (arg0 > 2) {
            class233 var3 = this.field3757.method2152(true, arg1, -128, 262144, true);
            if (var3 != null) {
                int var4 = super.field10347 >> 9;
                int var5 = super.field10350 >> 9;
                class765 var6 = arg1.method457();
                var6.method1568(super.field10347, super.field10358, super.field10350);
                this.field3757.method2148(var5, (byte) 111, var4, var6, var3, var5, false, arg1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)Z", line = 223)
    public final boolean method197(boolean arg0) {
        ++field3768;
        if (!arg0) {
            this.method1165((byte) 69);
        }
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Z", line = 234)
    public final boolean method1164(byte arg0) {
        ++field3747;
        if (arg0 != 4) {
            this.method1164((byte) -74);
        }
        return this.field3757.method2155((byte) -126);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)I", line = 246)
    public final int method1174(byte arg0) {
        int var2 = -12 % ((-63 - arg0) / 47);
        ++field3748;
        return this.field3757.field5040;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(ILha;)V", line = 262)
    public final void method1169(int arg0, class475 arg1) {
        this.field3757.method2157(arg1, (byte) 87);
        if (arg0 != -10526) {
            this.method1174((byte) -97);
        }
        ++field3763;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z", line = 280)
    public final boolean method1170(int arg0) {
        if (arg0 != 16383) {
            this.method1165((byte) -1);
        }
        ++field3761;
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I", line = 294)
    public final int method1166(int arg0) {
        ++field3750;
        int var2 = 39 % ((arg0 - 14) / 62);
        return this.field3757.field5067;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(B)Z", line = 305)
    public final boolean method1175(byte arg0) {
        ++field3766;
        if (arg0 < 38) {
            method1713(-86);
        }
        return this.field3754;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 316)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        ++field3752;
        if (arg0 == -24659) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I", line = 331)
    public final int method1165(byte arg0) {
        ++field3749;
        return arg0 < 89 ? 97 : this.field3757.field5054;
    }
}

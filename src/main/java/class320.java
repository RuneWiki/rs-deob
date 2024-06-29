import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class320 extends class686 implements class394 {

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "S")
    private short field4434;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "Z")
    private boolean field4424;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "B")
    private byte field4411;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Z")
    private boolean field4421;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "Z")
    private boolean field4431;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "Z")
    private boolean field4433;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "Lda;")
    private class397 field4423;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "Lha;")
    private class427 field4430;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Leh;")
    private class203 field4420;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)Z", line = 5)
    public final boolean method630(int arg0) {
        ++field4427;
        int var2 = -11 / ((arg0 - -59) / 44);
        return this.field4423 != null ? this.field4423.method449() : false;
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Z", line = 20)
    public final boolean method592(int arg0) {
        if (arg0 != -15258) {
            this.method631(112, (class98) null);
        }
        ++field4408;
        return this.field4421;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)Z", line = 31)
    public final boolean method908(boolean arg0) {
        ++field4417;
        return arg0 ? true : this.field4433;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I", line = 43)
    public final int method903(int arg0) {
        if (arg0 < 76) {
            return -11;
        } else {
            ++field4422;
            return 65535 & this.field4434;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lvj;IZLr;IIB)V", line = 56)
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        ++field4429;
        if (arg0 instanceof class320) {
            class320 var8 = (class320) arg0;
            if (this.field4423 != null && var8.field4423 != null) {
                this.field4423.method466(var8.field4423, arg1, arg4, arg5, arg2);
            }
        }
        if (arg6 < 22) {
            field4407 = -88;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lr;Lnf;IIIIIZIZ)V", line = 75)
    public class320(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field1906);
        this.field4434 = (short) arg1.field1953;
        this.field4424 = ~arg1.field1903 != -1 && !arg7;
        this.field4411 = (byte) arg8;
        this.field4421 = arg9;
        this.field4431 = arg7;
        super.field3155 = arg4;
        super.field3154 = arg6;
        this.field4433 = arg0.method742() && arg1.field1964 && !this.field4431 && ~class525.field7713.method2484(class76.field1182, false) != -1;
        int var11 = 2048;
        if (this.field4421) {
            var11 |= 65536;
        }
        class75 var12 = this.method1915(-84, var11, arg0, this.field4433);
        if (var12 != null) {
            this.field4423 = var12.field1179;
            this.field4430 = var12.field1178;
            if (this.field4421) {
                this.field4423 = this.field4423.method475((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I", line = 108)
    public final int method904(int arg0) {
        if (arg0 != -15140) {
            this.field4421 = true;
        }
        ++field4414;
        return this.field4411;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILr;)Leh;", line = 120)
    public final class203 method631(int arg0, class98 arg1) {
        if (arg0 != 1) {
            this.method1916(-34, (class98) null, (byte) -77);
        }
        ++field4419;
        if (this.field4420 == null) {
            this.field4420 = class420.method2486(super.field3155, super.field3160, super.field3154, this.method1916(0, arg1, (byte) 79), 22672);
        }
        return this.field4420;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 140)
    public final void method902(int arg0) {
        if (arg0 == 27906) {
            ++field4415;
            if (this.field4423 != null) {
                this.field4423.method444();
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(ILr;)V", line = 155)
    public final void method625(int arg0, class98 arg1) {
        ++field4413;
        if (arg0 < 67) {
            this.field4431 = false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lr;B)V", line = 169)
    public final void method911(class98 arg0, byte arg1) {
        ++field4406;
        if (arg1 != 31) {
            this.method903(13);
        }
        Object var3 = null;
        class427 var5;
        if (this.field4430 == null && this.field4433) {
            class75 var4 = this.method1915(-58, 262144, arg0, true);
            var5 = var4 == null ? null : var4.field1178;
        } else {
            var5 = this.field4430;
            this.field4430 = null;
        }
        if (var5 != null) {
            class123.method986(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lr;I)Lej;", line = 198)
    public final class690 method627(class98 arg0, int arg1) {
        ++field4418;
        if (this.field4423 == null) {
            return null;
        } else {
            class152 var3 = arg0.method777();
            var3.method166(super.field3155, super.field3160, super.field3154);
            class690 var4 = null;
            if (arg1 != -7927) {
                return null;
            } else {
                if (this.field4424) {
                    var4 = class101.method849(-5, 1);
                }
                if (!class372.field5162) {
                    this.field4423.method460(var3, var4 == null ? null : var4.field9788[0], 0);
                } else {
                    this.field4423.method448(var3, var4 == null ? null : var4.field9788[0], class450.field6494, 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)Z", line = 229)
    public final boolean method633(boolean arg0) {
        if (!arg0) {
            this.method903(54);
        }
        ++field4416;
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILr;B)Z", line = 240)
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        int var5 = 88 % ((-75 - arg3) / 40);
        ++field4404;
        class397 var6 = this.method1916(131072, arg2, (byte) 126);
        if (var6 != null) {
            class152 var7 = arg2.method777();
            var7.method166(super.field3155, super.field3160, super.field3154);
            return class372.field5162 ? var6.method482(arg0, arg1, var7, false, class450.field6494) : var6.method469(arg0, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I", line = 266)
    public final int method907(boolean arg0) {
        ++field4432;
        if (arg0) {
            field4409 = -51;
        }
        return 22;
    }

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "(I)V", line = 277)
    public final void method585(int arg0) {
        this.field4421 = false;
        if (arg0 != 96) {
            this.method912(31, (class98) null);
        }
        ++field4410;
        if (this.field4423 != null) {
            this.field4423.method438(-65537 & this.field4423.method468());
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILr;Z)Lfj;", line = 294)
    private final class75 method1915(int arg0, int arg1, class98 arg2, boolean arg3) {
        ++field4425;
        class119 var5 = class14.field224.method2834(0, 65535 & this.field4434);
        class682 var6;
        class682 var7;
        if (this.field4431) {
            var6 = class340.field4723[super.field3163];
            var7 = class621.field8841[0];
        } else {
            var6 = class621.field8841[super.field3163];
            if (super.field3163 < 3) {
                var7 = class621.field8841[super.field3163 - -1];
            } else {
                var7 = null;
            }
        }
        if (arg0 > -41) {
            this.method907(true);
        }
        return var5.method960(126, var7, super.field3160, this.field4411, arg2, 22, super.field3155, var6, arg1, arg3, super.field3154);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILr;)V", line = 324)
    public final void method912(int arg0, class98 arg1) {
        if (arg0 != 20280) {
            this.method1916(24, (class98) null, (byte) 109);
        }
        ++field4405;
        Object var3 = null;
        class427 var5;
        if (this.field4430 == null && this.field4433) {
            class75 var4 = this.method1915(-58, 262144, arg1, true);
            var5 = var4 != null ? var4.field1178 : null;
        } else {
            var5 = this.field4430;
            this.field4430 = null;
        }
        if (var5 != null) {
            class68.method564(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILr;B)Lda;", line = 353)
    private final class397 method1916(int arg0, class98 arg1, byte arg2) {
        ++field4428;
        if (this.field4423 != null && ~arg1.method754(this.field4423.method468(), arg0) == -1) {
            return this.field4423;
        } else if (arg2 <= 72) {
            return null;
        } else {
            class75 var4 = this.method1915(-48, arg0, arg1, false);
            return var4 == null ? null : var4.field1179;
        }
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)I", line = 376)
    public final int method626(int arg0) {
        ++field4412;
        if (arg0 != -32768) {
            this.method630(55);
        }
        return this.field4423 == null ? 0 : this.field4423.method478();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I", line = 387)
    public final int method634(byte arg0) {
        if (arg0 > -102) {
            this.method902(-39);
        }
        ++field4426;
        return this.field4423 != null ? this.field4423.method434() : 0;
    }
}

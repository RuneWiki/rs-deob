import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class326 extends class208 {

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "Z")
    public boolean field4611 = false;

    @OriginalMember(owner = "client!ko", name = "gb", descriptor = "Z")
    private boolean field4624 = true;

    @OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
    private int field4616 = 0;

    @OriginalMember(owner = "client!ko", name = "nb", descriptor = "I")
    private int field4631 = 0;

    @OriginalMember(owner = "client!ko", name = "jb", descriptor = "I")
    private int field4627 = -1;

    @OriginalMember(owner = "client!ko", name = "ib", descriptor = "I")
    private int field4626 = 0;

    @OriginalMember(owner = "client!ko", name = "ub", descriptor = "I")
    private int field4638 = 0;

    @OriginalMember(owner = "client!ko", name = "wb", descriptor = "I")
    private int field4640 = 0;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!ko", name = "eb", descriptor = "I")
    private int field4622;

    @OriginalMember(owner = "client!ko", name = "mb", descriptor = "Lje;")
    private class98 field4630;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ko", name = "X", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ko", name = "Z", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ko", name = "ab", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ko", name = "bb", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ko", name = "cb", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ko", name = "db", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ko", name = "fb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ko", name = "hb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ko", name = "kb", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ko", name = "lb", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ko", name = "ob", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ko", name = "pb", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ko", name = "qb", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ko", name = "rb", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ko", name = "sb", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ko", name = "tb", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ko", name = "vb", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ko", name = "yb", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ko", name = "xb", descriptor = "Leea;")
    private class187 field4641;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V", line = 5)
    public final void method196(int arg0) {
        ++field4620;
        if (arg0 != -10382) {
            method1978((String) null, false);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I", line = 16)
    public final int method1173(boolean arg0) {
        if (!arg0) {
            this.field4631 = -99;
        }
        ++field4639;
        return this.field4638;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 30)
    public class326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field4626 = arg12;
        this.field4614 = arg2 - -arg1;
        this.field4622 = arg0;
        class113 var14 = class620.field8760.method1832(-98, this.field4622);
        int var15 = var14.field1628;
        if (var15 == -1) {
            this.field4611 = true;
        } else {
            this.field4630 = class168.field2552.method3287(85, var15);
            this.field4611 = false;
        }
        if (~this.field4614 == ~arg2) {
            class324.method1958(this.field4630, (byte) 42, this, this.field4631);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 55)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        ++field4633;
        if (arg0 != -24659) {
            method1983(-107, 46, 115, -21, -17, -46);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 66)
    public static final String method1978(String arg0, boolean arg1) {
        ++field4628;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        if (arg1) {
            field4634 = 126;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; ++var6) {
            char var7 = arg0.charAt(var6);
            if (var7 != '<') {
                if (~var7 == -63) {
                    var5.append("<gt>");
                } else {
                    var5.append(var7);
                }
            } else {
                var5.append("<lt>");
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)I", line = 121)
    public final int method1167(int arg0) {
        if (arg0 <= 75) {
            this.field4626 = -79;
        }
        ++field4642;
        return this.field4616;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZIIII)V", line = 134)
    public static final void method1979(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            class780[] var7 = class55.field870;
            for (int var8 = 0; var7.length > var8; ++var8) {
                class780 var9 = var7[var8];
                if (var9 != null && var9.field10692 == 2) {
                    class483.method2852(var9.field10687, var9.field10694, arg3 >> 1, arg4, (byte) 69, arg6, var9.field10688, arg0 >> 1, var9.field10696 * 2);
                    if (class27.field292[0] > -1 && ~(class594.field8494 % 20) > -11) {
                        class85 var10 = class491.field6736[var9.field10689];
                        int var11 = class27.field292[0] + arg1 + -12;
                        int var12 = class27.field292[1] + arg5 + -28;
                        var10.method759(var11, var12);
                        class528.method3090(3985, var12 - -var10.method14(), var12, var11, var10.method11() + var11);
                    }
                }
            }
            ++field4618;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lha;Ldm;Lka;Z)V", line = 174)
    private final void method1980(class475 arg0, class765 arg1, class233 arg2, boolean arg3) {
        ++field4636;
        arg2.method582(arg1);
        class335[] var5 = arg2.method590();
        class740[] var6 = arg2.method588();
        if (!arg3) {
            this.field4616 = 45;
        }
        if ((this.field4641 == null || this.field4641.field2814) && (var5 != null || var6 != null)) {
            this.field4641 = class187.method1349(class594.field8494, true);
        }
        if (this.field4641 != null) {
            this.field4641.method1347(arg0, (long) class594.field8494, var5, var6, false);
            this.field4641.method1355(super.field10361, super.field3027, super.field3030, super.field3035, super.field3038);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 203)
    public final void method1981(int arg0) {
        if (this.field4641 != null) {
            this.field4641.method1344();
        }
        if (arg0 == 19716) {
            ++field4635;
        }
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(B)Z", line = 219)
    public final boolean method1175(byte arg0) {
        if (arg0 < 38) {
            method1983(93, -39, 57, -78, -73, -19);
        }
        ++field4629;
        return this.field4624;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lha;III)Lka;", line = 230)
    private final class233 method1982(class475 arg0, int arg1, int arg2, int arg3) {
        ++field4612;
        class113 var5 = class620.field8760.method1832(arg3 ^ -120, arg1);
        class419 var6 = class495.field6799[super.field10361];
        class419 var7 = super.field10349 >= 3 ? null : class495.field6799[super.field10349 - -1];
        if (arg3 != 0) {
            this.method194(83, -2, -66, (class475) null, (class745) null, true, -36);
        }
        return this.field4611 ? var5.method939(arg0, super.field10347, var6, true, 122, super.field10350, arg2, class168.field2552, super.field10358, 0, var7, -1, -1) : var5.method939(arg0, super.field10347, var6, true, 124, super.field10350, arg2, class168.field2552, super.field10358, this.field4640, var7, this.field4631, this.field4627);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(BLha;)Lmg;", line = 253)
    public final class248 method205(byte arg0, class475 arg1) {
        ++field4619;
        if (arg0 != 45) {
            field4634 = -52;
        }
        return null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIII)V", line = 264)
    public static final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4625;
        if (arg5 < -62) {
            if (~class698.field9801 <= ~arg0 && ~class515.field7102 >= ~arg4) {
                boolean var6;
                if (arg2 < class742.field10301) {
                    arg2 = class742.field10301;
                    var6 = false;
                } else if (class435.field6058 >= arg2) {
                    var6 = true;
                } else {
                    arg2 = class435.field6058;
                    var6 = false;
                }
                boolean var7;
                if (~class742.field10301 >= ~arg1) {
                    if (arg1 <= class435.field6058) {
                        var7 = true;
                    } else {
                        var7 = false;
                        arg1 = class435.field6058;
                    }
                } else {
                    arg1 = class742.field10301;
                    var7 = false;
                }
                if (class515.field7102 <= arg0) {
                    class379.method2284(arg2, arg1, class74.field1144[arg0++], arg3, 2);
                } else {
                    arg0 = class515.field7102;
                }
                if (~class698.field9801 > ~arg4) {
                    arg4 = class698.field9801;
                } else {
                    class379.method2284(arg2, arg1, class74.field1144[arg4--], arg3, 2);
                }
                if (var6 && var7) {
                    for (int var8 = arg0; ~arg4 <= ~var8; ++var8) {
                        int[] var9 = class74.field1144[var8];
                        var9[arg2] = var9[arg1] = arg3;
                    }
                    return;
                }
                if (var6) {
                    for (int var10 = arg0; ~arg4 <= ~var10; ++var10) {
                        class74.field1144[var10][arg2] = arg3;
                    }
                    return;
                }
                if (var7) {
                    for (int var11 = arg0; var11 <= arg4; ++var11) {
                        class74.field1144[var11][arg1] = arg3;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "finalize", descriptor = "()V", line = 374)
    protected final void finalize() {
        ++field4637;
        if (this.field4641 != null) {
            this.field4641.method1344();
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIILha;)Z", line = 385)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field4632;
        int var5 = 106 % ((51 - arg0) / 51);
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)V", line = 395)
    public final void method1984(byte arg0, int arg1) {
        ++field4615;
        if (arg0 > -102) {
            method1978((String) null, false);
        }
        if (!this.field4611) {
            this.field4640 += arg1;
            while (~this.field4640 < ~this.field4630.field1388[this.field4631]) {
                this.field4640 -= this.field4630.field1388[this.field4631];
                ++this.field4631;
                if (this.field4631 >= this.field4630.field1402.length) {
                    this.field4611 = true;
                    break;
                }
            }
            if (!this.field4611) {
                class324.method1958(this.field4630, (byte) 42, this, this.field4631);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lha;I)Luh;", line = 425)
    public final class162 method204(class475 arg0, int arg1) {
        ++field4617;
        class233 var3 = this.method1982(arg0, this.field4622, 2048 | (this.field4626 == 0 ? 0 : 5), 0);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field4626 != arg1) {
                var3.method599(this.field4626 * 2048);
            }
            class765 var4 = arg0.method457();
            var4.method1568(super.field10347, super.field10358, super.field10350);
            this.method1980(arg0, var4, var3, true);
            class162 var5 = class527.method3085(1, false, 0);
            if (!class765.field10581) {
                var3.method575(var4, var5.field2500[0], 0);
            } else {
                var3.method546(var4, var5.field2500[0], class349.field4956, 0);
            }
            if (this.field4641 != null) {
                class667 var6 = this.field4641.method1346();
                if (class765.field10581) {
                    arg0.method429(var6, class349.field4956);
                } else {
                    arg0.method455(var6);
                }
            }
            this.field4624 = var3.method558();
            this.field4616 = var3.method534();
            this.field4638 = var3.method544();
            return var5;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(Z)Z", line = 477)
    public final boolean method197(boolean arg0) {
        ++field4621;
        return !arg0;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)Z", line = 489)
    public final boolean method1170(int arg0) {
        ++field4613;
        return arg0 != 16383;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(ILha;)V", line = 503)
    public final void method192(int arg0, class475 arg1) {
        ++field4623;
        class233 var3 = this.method1982(arg1, this.field4622, 0, 0);
        if (arg0 <= 2) {
            this.field4627 = 60;
        }
        if (var3 != null) {
            class765 var4 = arg1.method457();
            var4.method1568(super.field10347, super.field10358, super.field10350);
            this.method1980(arg1, var4, var3, true);
        }
    }
}

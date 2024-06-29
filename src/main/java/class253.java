import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class253 extends class46 implements class9 {

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Z")
    private boolean field3625;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "Z")
    private boolean field3639;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "B")
    private byte field3630;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Z")
    private boolean field3638;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "S")
    private short field3622;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "B")
    private byte field3623;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Z")
    private boolean field3614;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lmm;")
    private class152 field3643;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Lbk;")
    private class210 field3626;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3613 = null;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3616;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V", line = 8)
    public static final void method1708(int arg0) {
        class45.field541.method1618(arg0 + -22);
        ++field3631;
        if (arg0 != 22) {
            field3627 = -9;
        }
        class71.field820.method1618(arg0 + -22);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILae;II)Z", line = 20)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field3633;
        class210 var5 = this.method1709(arg1, 65536, false);
        if (var5 != null) {
            class18 var6 = arg1.method649();
            var6.method116(super.field560, super.field549, super.field562);
            return var5.method1382(arg0, arg3, var6, false);
        } else {
            return arg2 != 4835;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLae;)Ljg;", line = 48)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field3617;
        if (this.field3626 == null) {
            return null;
        } else {
            if (arg0 != -120) {
                this.method51(-116);
            }
            class18 var3 = arg1.method649();
            var3.method116(super.field560, super.field549, super.field562);
            class186 var4 = null;
            if (this.field3625) {
                var4 = class348.method2229(1, 21534);
            }
            this.field3626.method1416(var3, var4 == null ? null : var4.field2704[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lae;IZ)Lbk;", line = 75)
    private final class210 method1709(class134 arg0, int arg1, boolean arg2) {
        ++field3629;
        if (this.field3626 != null && ~arg0.method689(this.field3626.method1410(), arg1) == -1) {
            return this.field3626;
        } else {
            class371 var4 = this.method1712(arg0, (byte) -86, arg2, arg1);
            return var4 != null ? var4.field5233 : null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V", line = 100)
    public final void method51(int arg0) {
        ++field3640;
        this.field3639 = false;
        if (this.field3626 != null) {
            this.field3626.method1387(this.field3626.method1410() & -32769);
        }
        if (arg0 != 6) {
            field3627 = 37;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILae;)V", line = 116)
    public final void method72(int arg0, class134 arg1) {
        ++field3618;
        Object var3 = null;
        class152 var5;
        if (this.field3643 == null && this.field3614) {
            class371 var4 = this.method1712(arg1, (byte) -86, true, 131072);
            var5 = var4 != null ? var4.field5235 : null;
        } else {
            var5 = this.field3643;
            this.field3643 = null;
        }
        int var6 = 36 % (-arg0 / 55);
        if (var5 != null) {
            class258.method1733(var5, this.field3623, super.field560, super.field562, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I", line = 145)
    public final int method71(byte arg0) {
        if (arg0 >= -36) {
            return 106;
        } else {
            ++field3641;
            return this.field3622 & 65535;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I", line = 160)
    public final int method68(int arg0) {
        if (arg0 < 118) {
            return -85;
        } else {
            ++field3628;
            return this.field3630;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lae;ZI)Lbk;", line = 171)
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        ++field3634;
        if (!arg1) {
            this.method68(-66);
        }
        return this.method1709(arg0, arg2, false);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Z", line = 185)
    public final boolean method67(int arg0) {
        ++field3621;
        if (arg0 != -3673) {
            this.method54(false);
        }
        return this.field3614;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 198)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        if (arg4 instanceof class253) {
            class253 var8 = (class253) arg4;
            if (this.field3626 != null && var8.field3626 != null) {
                this.field3626.method1421(var8.field3626, arg3, arg2, arg5, arg0);
            }
        }
        int var9 = -94 % ((arg1 - -16) / 62);
        ++field3619;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lae;B)V", line = 218)
    public final void method64(class134 arg0, byte arg1) {
        ++field3624;
        if (arg1 > -50) {
            this.field3639 = false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)Z", line = 228)
    public static final boolean method1710(int arg0, int arg1) {
        ++field3637;
        if (arg1 != -32769) {
            return false;
        } else {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 239)
    public final void method65(int arg0) {
        ++field3615;
        if (this.field3626 != null) {
            this.field3626.method1409();
        }
        if (arg0 != 17184) {
            this.field3630 = 123;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V", line = 253)
    public static void method1711(byte arg0) {
        field3613 = null;
        field3616 = null;
        if (arg0 > -55) {
            method1711((byte) 42);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lae;I)V", line = 266)
    public final void method66(class134 arg0, int arg1) {
        ++field3620;
        Object var3 = null;
        class152 var5;
        if (this.field3643 == null && this.field3614) {
            class371 var4 = this.method1712(arg0, (byte) -86, true, 131072);
            var5 = var4 != null ? var4.field5235 : null;
        } else {
            var5 = this.field3643;
            this.field3643 = null;
        }
        if (var5 != null) {
            class122.method778(var5, this.field3623, super.field560, super.field562, (boolean[]) null);
        }
        if (arg1 != 4257) {
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Z", line = 293)
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            method1710(-11, 103);
        }
        ++field3632;
        return this.field3639;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)I", line = 304)
    public final int method69(int arg0) {
        ++field3636;
        if (arg0 != -5944) {
            this.field3623 = -6;
        }
        return 22;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lae;Ljh;IIIIZIZ)V", line = 315)
    public class253(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field996, arg1.field1059);
        this.field3625 = ~arg1.field998 != -1 && !arg6;
        this.field3639 = arg8;
        this.field3630 = (byte) arg7;
        this.field3638 = arg6;
        this.field3622 = (short) arg1.field1026;
        super.field560 = (short) arg3;
        super.field562 = (short) arg5;
        this.field3623 = (byte) arg2;
        this.field3614 = arg0.method615() && arg1.field995 && !this.field3638 && ~class141.field1739 != -1;
        int var10 = 1024;
        if (this.field3639) {
            var10 |= 32768;
        }
        class371 var11 = this.method1712(arg0, (byte) -86, this.field3614, var10);
        if (var11 != null) {
            this.field3643 = var11.field5235;
            this.field3626 = var11.field5233;
            if (this.field3639) {
                this.field3626 = this.field3626.method1411((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lae;BZI)Lsk;", line = 349)
    private final class371 method1712(class134 arg0, byte arg1, boolean arg2, int arg3) {
        ++field3635;
        class88 var5 = class374.method2382(65535 & this.field3622, false);
        class327 var6;
        class327 var7;
        if (this.field3638) {
            var6 = class98.field1191[0];
            var7 = class399.field5693[this.field3623];
        } else {
            var7 = class98.field1191[this.field3623];
            if (~this.field3623 > -4) {
                var6 = class98.field1191[this.field3623 + 1];
            } else {
                var6 = null;
            }
        }
        return arg1 != -86 ? null : var5.method482(this.field3630, arg2, var7, arg0, 22, super.field560, super.field562, super.field549, -122, arg3, var6);
    }
}

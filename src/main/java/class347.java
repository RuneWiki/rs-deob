import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class347 extends class447 implements class193 {

    @OriginalMember(owner = "client!v", name = "V", descriptor = "B")
    private byte field4743;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "B")
    private byte field4749;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "S")
    private short field4736;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "B")
    private byte field4742;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Z")
    private boolean field4738;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "Z")
    private boolean field4760;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "Z")
    private boolean field4753;

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "Z")
    private boolean field4763;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "Lmj;")
    public class394 field4764;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "Lmc;")
    private class69 field4758;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4732 = "";

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field4737 = 0;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "[[I")
    public static int[][] field4756 = new int[128][128];

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field4748 = 0;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "[Ljava/lang/String;")
    public static String[] field4757 = new String[100];

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V", line = 4)
    public static void method2197(byte arg0) {
        field4732 = null;
        if (arg0 == 3) {
            field4757 = null;
            field4756 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Z", line = 16)
    public final boolean method683(byte arg0) {
        int var2 = -51 % ((arg0 - 47) / 47);
        ++field4747;
        return this.field4760;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)I", line = 27)
    public final int method2198(int arg0) {
        ++field4735;
        if (arg0 != 29201) {
            field4748 = -14;
        }
        return this.field4764 == null ? 15 : this.field4764.method1462() / 4;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZILuo;I)Lvg;", line = 38)
    private final class33 method2199(boolean arg0, int arg1, class345 arg2, int arg3) {
        ++field4739;
        class64 var5 = class375.method2395((byte) 96, this.field4736 & 65535);
        if (arg1 < 28) {
            return null;
        } else {
            class242 var6;
            class242 var7;
            if (this.field4738) {
                var6 = class418.field5939[0];
                var7 = class214.field2979[this.field4749];
            } else {
                var7 = class418.field5939[this.field4749];
                if (this.field4749 >= 3) {
                    var6 = null;
                } else {
                    var6 = class418.field5939[this.field4749 + 1];
                }
            }
            return var5.method497(arg2, this.field4743 == 11 ? 4 - -this.field4742 : this.field4742, super.field6262, this.field4743 != 11 ? this.field4743 : 10, var7, (byte) -11, super.field6270, var6, super.field6266, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILuo;)V", line = 68)
    public final void method676(int arg0, class345 arg1) {
        ++field4734;
        Object var3 = null;
        class69 var5;
        if (this.field4758 == null && this.field4763) {
            class33 var4 = this.method2199(true, 104, arg1, 131072);
            var5 = var4 != null ? var4.field520 : null;
        } else {
            var5 = this.field4758;
            this.field4758 = null;
        }
        if (var5 != null) {
            class423.method2681(var5, this.field4749, super.field6262, super.field6266, (boolean[]) null);
        }
        if (arg0 >= -58) {
            field4748 = -94;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILuo;I)Z", line = 99)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field4745;
        class394 var5 = this.method2201(arg2, -101, 65536);
        if (var5 != null) {
            class417 var6 = arg2.method84();
            var6.method702(super.field6262, super.field6270, super.field6266);
            return var5.method1465(arg3, arg0, var6, false);
        } else {
            return arg1 != -20759 ? false : false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLuo;)Laj;", line = 126)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field4762;
        if (this.field4764 == null) {
            return null;
        } else {
            class417 var3 = arg1.method84();
            var3.method702(super.field6262, super.field6270, super.field6266);
            class170 var4 = null;
            if (this.field4753) {
                var4 = class175.method1152((byte) 72, 1);
            }
            if (!arg0) {
                return null;
            } else {
                this.field4764.method1416(var3, var4 == null ? null : var4.field2333[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I", line = 160)
    public final int method672(int arg0) {
        if (arg0 != 17011) {
            return 93;
        } else {
            ++field4730;
            return this.field4742;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V", line = 172)
    public final void method674(byte arg0) {
        ++field4752;
        this.field4760 = false;
        if (arg0 != -1) {
            this.field4738 = true;
        }
        if (this.field4764 != null) {
            this.field4764.method1453(this.field4764.method1424() & -32769);
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)I", line = 188)
    public final int method915(byte arg0) {
        int var2 = -115 / ((34 - arg0) / 56);
        ++field4729;
        return this.field4764 == null ? 0 : this.field4764.method1443();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Luo;I)V", line = 199)
    public final void method677(class345 arg0, int arg1) {
        if (arg1 < 33) {
            field4737 = 83;
        }
        ++field4741;
        Object var3 = null;
        class69 var5;
        if (this.field4758 == null && this.field4763) {
            class33 var4 = this.method2199(true, 60, arg0, 131072);
            var5 = var4 == null ? null : var4.field520;
        } else {
            var5 = this.field4758;
            this.field4758 = null;
        }
        if (var5 != null) {
            class91.method648(var5, this.field4749, super.field6262, super.field6266, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILuo;I)Lmj;", line = 230)
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        ++field4744;
        if (arg2 != -9380) {
            this.method676(-16, (class345) null);
        }
        return this.method2201(arg1, -54, arg0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 241)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 != -126) {
            field4737 = -102;
        }
        ++field4759;
        if (!(arg4 instanceof class95)) {
            if (arg4 instanceof class347) {
                class347 var8 = (class347) arg4;
                if (this.field4764 != null && var8.field4764 != null) {
                    this.field4764.method1454(var8.field4764, arg3, arg2, arg0, arg6);
                    return;
                }
            }
        } else {
            class95 var9 = (class95) arg4;
            if (this.field4764 == null || var9.field1333 == null) {
                return;
            }
            this.field4764.method1454(var9.field1333, arg3, arg2, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Luo;Lgm;IIIIIZIIIIIIZ)V", line = 279)
    public class347(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field944 == -2, class212.method1395(arg12, arg13, (byte) 86));
        this.field4743 = (byte) arg12;
        this.field4749 = (byte) arg3;
        this.field4736 = (short) arg1.field916;
        this.field4742 = (byte) arg13;
        this.field4738 = arg7;
        this.field4760 = arg14;
        this.field4753 = arg1.field922 != 0 && !arg7;
        this.field4763 = arg0.method125() && arg1.field939 && !this.field4738 && class327.field4508 != 0;
        int var16 = 1024;
        if (this.field4760) {
            var16 |= 32768;
        }
        class33 var17 = this.method2199(this.field4763, 65, arg0, var16);
        if (var17 != null) {
            this.field4764 = var17.field516;
            this.field4758 = var17.field520;
            if (this.field4760) {
                this.field4764 = this.field4764.method1430((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Luo;I)V", line = 316)
    public final void method678(class345 arg0, int arg1) {
        if (arg1 == -22948) {
            ++field4750;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I", line = 326)
    public final int method689(byte arg0) {
        ++field4733;
        return arg0 != -83 ? 10 : 65535 & this.field4736;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 341)
    public static final void method2200(int arg0) {
        int var1 = -116 / ((30 - arg0) / 39);
        ++field4754;
        class248.field3509.method905((byte) 46);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)I", line = 352)
    public final int method684(int arg0) {
        if (arg0 != -13726) {
            return -50;
        } else {
            ++field4755;
            return this.field4743;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 370)
    public final void method680(int arg0) {
        ++field4740;
        if (this.field4764 != null) {
            this.field4764.method1467();
        }
        if (arg0 != -24686) {
            this.method677((class345) null, -14);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)Z", line = 386)
    public final boolean method691(byte arg0) {
        ++field4746;
        if (arg0 != -72) {
            this.field4749 = -62;
        }
        return this.field4763;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Luo;II)Lmj;", line = 398)
    private final class394 method2201(class345 arg0, int arg1, int arg2) {
        ++field4751;
        if (this.field4764 != null && ~arg0.method139(this.field4764.method1424(), arg2) == -1) {
            return this.field4764;
        } else {
            class33 var4 = this.method2199(false, 121, arg0, arg2);
            if (arg1 >= -10) {
                return null;
            } else {
                return var4 != null ? var4.field516 : null;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)I", line = 427)
    public static final int method2202(int arg0) {
        ++field4761;
        if (arg0 >= -27) {
            method2202(81);
        }
        return 15;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class53 extends class113 {

    @OriginalMember(owner = "client!gda", name = "O", descriptor = "I")
    private int field997 = 0;

    @OriginalMember(owner = "client!gda", name = "R", descriptor = "I")
    private int field1000 = -1;

    @OriginalMember(owner = "client!gda", name = "W", descriptor = "I")
    private int field1005 = 0;

    @OriginalMember(owner = "client!gda", name = "ib", descriptor = "Z")
    private boolean field1017 = true;

    @OriginalMember(owner = "client!gda", name = "kb", descriptor = "I")
    private int field1019 = 0;

    @OriginalMember(owner = "client!gda", name = "pb", descriptor = "I")
    private int field1024 = 0;

    @OriginalMember(owner = "client!gda", name = "cb", descriptor = "I")
    private int field1011 = 0;

    @OriginalMember(owner = "client!gda", name = "fb", descriptor = "Z")
    public boolean field1014 = false;

    @OriginalMember(owner = "client!gda", name = "jb", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!gda", name = "Q", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!gda", name = "X", descriptor = "Lhn;")
    private class718 field1006;

    @OriginalMember(owner = "client!gda", name = "S", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!gda", name = "T", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!gda", name = "U", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!gda", name = "V", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!gda", name = "Y", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!gda", name = "Z", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!gda", name = "ab", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!gda", name = "bb", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!gda", name = "eb", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!gda", name = "gb", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!gda", name = "hb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!gda", name = "lb", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!gda", name = "mb", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!gda", name = "nb", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!gda", name = "ob", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!gda", name = "qb", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gda", name = "N", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gda", name = "P", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!gda", name = "db", descriptor = "Lf;")
    private class753 field1012;

    @OriginalMember(owner = "client!gda", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        ++field1023;
        if (this.field1012 != null) {
            this.field1012.method4179();
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method484(boolean arg0) {
        class148.method1147(1);
        ++field1021;
        if (!arg0) {
            method484(false);
        }
        class200.field2876 = false;
    }

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)V", line = 38)
    public final void method400(int arg0) {
        if (arg0 >= 33) {
            ++field1002;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "(B)Z", line = 50)
    public final boolean method399(byte arg0) {
        if (arg0 != 38) {
            this.field1014 = false;
        }
        ++field996;
        return this.field1017;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lha;IZI)Z", line = 61)
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.method396((byte) -56, (class58) null);
        }
        ++field1013;
        return false;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 286)
    public class53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1005 = arg12;
        this.field1018 = arg1 + arg2;
        this.field999 = arg0;
        class164 var14 = class638.field9104.method3753(109, this.field999);
        int var15 = var14.field2427;
        if (~var15 != 0) {
            this.field1006 = class698.field9806.method851(var15, -2);
            this.field1014 = false;
        } else {
            this.field1014 = true;
        }
        if (this.field1018 == arg2) {
            class749.method4165(this.field1019, (byte) 106, this.field1006, this);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lkd;Lka;Lha;I)V", line = 77)
    private final void method485(class280 arg0, class469 arg1, class58 arg2, int arg3) {
        arg1.method354(arg0);
        ++field1015;
        if (arg3 != -3) {
            this.method396((byte) 10, (class58) null);
        }
        class675[] var5 = arg1.method334();
        class206[] var6 = arg1.method336();
        if ((this.field1012 == null || this.field1012.field10494) && (var5 != null || var6 != null)) {
            this.field1012 = class753.method4187(class605.field8787, true);
        }
        if (this.field1012 != null) {
            this.field1012.method4183(arg2, (long) class605.field8787, var5, var6, false);
            this.field1012.method4176(super.field649, super.field1814, super.field1818, super.field1820, super.field1810);
        }
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(BLha;)V", line = 107)
    public final void method401(byte arg0, class58 arg1) {
        if (arg0 != -39) {
            this.field1024 = -77;
        }
        ++field1022;
        class469 var3 = this.method489((byte) -87, this.field999, arg1, 0);
        if (var3 != null) {
            class280 var4 = arg1.method530();
            var4.method157(super.field644, super.field651, super.field648);
            this.method485(var4, var3, arg1, -3);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)V", line = 131)
    public final void method486(int arg0, int arg1) {
        ++field1009;
        if (!this.field1014) {
            this.field1024 += arg1;
            if (arg0 != -843) {
                this.field1005 = 5;
            }
            while (this.field1006.field10048[this.field1019] < this.field1024) {
                this.field1024 -= this.field1006.field10048[this.field1019];
                ++this.field1019;
                if (~this.field1019 <= ~this.field1006.field10053.length) {
                    this.field1014 = true;
                    break;
                }
            }
            if (!this.field1014) {
                class749.method4165(this.field1019, (byte) 102, this.field1006, this);
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZI)Z", line = 160)
    public static final boolean method487(boolean arg0, int arg1) {
        if (arg0) {
            method484(true);
        }
        ++field1016;
        return arg1 == 0 || arg1 == 1 || ~arg1 == -3;
    }

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "(I)I", line = 171)
    public final int method404(int arg0) {
        if (arg0 != 65535) {
            this.finalize();
        }
        ++field1010;
        return this.field1011;
    }

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(B)Z", line = 182)
    public final boolean method395(byte arg0) {
        if (arg0 != 84) {
            return false;
        } else {
            ++field998;
            return false;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lha;Z)Ltb;", line = 196)
    public final class397 method397(class58 arg0, boolean arg1) {
        if (arg1) {
            this.field1000 = 66;
        }
        ++field1001;
        return null;
    }

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "(B)Z", line = 211)
    public final boolean method402(byte arg0) {
        if (arg0 <= 28) {
            return true;
        } else {
            ++field1004;
            return false;
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(BLha;)Lvw;", line = 226)
    public final class304 method396(byte arg0, class58 arg1) {
        ++field1025;
        class469 var3 = this.method489((byte) -87, this.field999, arg1, (this.field1005 == 0 ? 0 : 5) | 2048);
        if (var3 == null) {
            return null;
        } else {
            if (this.field1005 != 0) {
                var3.method360(this.field1005 * 2048);
            }
            class280 var4 = arg1.method530();
            var4.method157(super.field644, super.field651, super.field648);
            this.method485(var4, var3, arg1, -3);
            class304 var5 = class359.method2239(1, false, (byte) 123);
            if (!class339.field4781) {
                var3.method329(var4, var5.field4298[0], 0);
            } else {
                var3.method343(var4, var5.field4298[0], class220.field3129, 0);
            }
            if (this.field1012 != null) {
                class624 var6 = this.field1012.method4185();
                if (!class339.field4781) {
                    arg1.method593(var6);
                } else {
                    arg1.method643(var6, class220.field3129);
                }
            }
            if (arg0 < 3) {
                return null;
            } else {
                this.field1017 = var3.method332();
                this.field1011 = var3.method338();
                this.field997 = var3.method324();
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V", line = 272)
    public final void method488(int arg0) {
        if (arg0 != -4877) {
            this.field1012 = null;
        }
        if (this.field1012 != null) {
            this.field1012.method4179();
        }
        ++field1008;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BILha;I)Lka;", line = 317)
    private final class469 method489(byte arg0, int arg1, class58 arg2, int arg3) {
        ++field1020;
        if (arg0 != -87) {
            this.method486(97, -40);
        }
        class164 var5 = class638.field9104.method3753(-54, arg1);
        class278 var6 = class173.field2511[super.field649];
        class278 var7 = ~super.field659 <= -4 ? null : class173.field2511[super.field659 + 1];
        return !this.field1014 ? var5.method1224(this.field1024, -13, this.field1019, this.field1000, super.field644, arg3, super.field651, super.field648, class698.field9806, var7, true, arg2, var6) : var5.method1224(0, arg0 + 74, -1, -1, super.field644, arg3, super.field651, super.field648, class698.field9806, var7, true, arg2, var6);
    }

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)I", line = 341)
    public final int method393(byte arg0) {
        ++field1007;
        return arg0 != -83 ? 127 : this.field997;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BILha;Lgs;ZII)V", line = 359)
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 < -5) {
            ++field1003;
            throw new IllegalStateException();
        }
    }
}

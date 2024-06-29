import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class657 extends class319 {

    @OriginalMember(owner = "client!pda", name = "bb", descriptor = "I")
    private int field9080 = 0;

    @OriginalMember(owner = "client!pda", name = "ub", descriptor = "I")
    private int field9099 = 0;

    @OriginalMember(owner = "client!pda", name = "wb", descriptor = "Z")
    public boolean field9101 = false;

    @OriginalMember(owner = "client!pda", name = "vb", descriptor = "I")
    private int field9100 = 0;

    @OriginalMember(owner = "client!pda", name = "mb", descriptor = "I")
    private int field9091 = 0;

    @OriginalMember(owner = "client!pda", name = "gb", descriptor = "I")
    private int field9085 = -1;

    @OriginalMember(owner = "client!pda", name = "fb", descriptor = "I")
    private int field9084 = 0;

    @OriginalMember(owner = "client!pda", name = "tb", descriptor = "Z")
    private boolean field9098 = true;

    @OriginalMember(owner = "client!pda", name = "cb", descriptor = "I")
    private int field9081;

    @OriginalMember(owner = "client!pda", name = "hb", descriptor = "I")
    public int field9086;

    @OriginalMember(owner = "client!pda", name = "nb", descriptor = "Lvq;")
    private class489 field9092;

    @OriginalMember(owner = "client!pda", name = "Y", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!pda", name = "Z", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!pda", name = "ab", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!pda", name = "eb", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!pda", name = "ib", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!pda", name = "jb", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!pda", name = "kb", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!pda", name = "lb", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!pda", name = "ob", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!pda", name = "pb", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!pda", name = "qb", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!pda", name = "rb", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!pda", name = "sb", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!pda", name = "xb", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!pda", name = "yb", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!pda", name = "zb", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!pda", name = "Ab", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!pda", name = "db", descriptor = "Lsp;")
    private class663 field9082;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "(I)I", line = 3)
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            this.field9084 = -55;
        }
        ++field9087;
        return this.field9091;
    }

    @OriginalMember(owner = "client!pda", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() {
        if (this.field9082 != null) {
            this.field9082.method3669();
        }
        ++field9078;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lha;Lwea;ZIIII)V", line = 31)
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= -16) {
            this.field9092 = null;
        }
        ++field9103;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "(I)V", line = 46)
    public final void method66(int arg0) {
        if (arg0 != -13514) {
            this.method28(51);
        }
        ++field9083;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lha;IZI)Lka;", line = 57)
    private final class500 method3643(class65 arg0, int arg1, boolean arg2, int arg3) {
        ++field9104;
        class608 var5 = class784.field10798.method3973((byte) 123, arg3);
        class296 var6 = class412.field5933[super.field2250];
        if (arg2) {
            return null;
        } else {
            class296 var7 = ~super.field2244 <= -4 ? null : class412.field5933[super.field2244 + 1];
            return !this.field9101 ? var5.method3363((byte) 118, true, super.field2246, arg1, this.field9100, super.field2257, this.field9085, this.field9084, class6.field65, var6, super.field2259, var7, arg0) : var5.method3363((byte) -89, true, super.field2246, arg1, 0, super.field2257, -1, -1, class6.field65, var6, super.field2259, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(Z)V", line = 77)
    public final void method3644(boolean arg0) {
        ++field9097;
        if (!arg0) {
            this.method3645(64, (byte) -97);
        }
        if (this.field9082 != null) {
            this.field9082.method3669();
        }
    }

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "(I)Z", line = 91)
    public final boolean method59(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field9102;
            return false;
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 218)
    public class657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field9099 = arg12;
        this.field9081 = arg0;
        this.field9086 = arg1 + arg2;
        class608 var14 = class784.field10798.method3973((byte) 83, this.field9081);
        int var15 = var14.field8277;
        if (var15 == -1) {
            this.field9101 = true;
        } else {
            this.field9092 = class6.field65.method1034(var15, 0);
            this.field9101 = false;
        }
        if (this.field9086 == arg2) {
            class586.method3259(this, 0, this.field9092, this.field9084);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIILha;)Z", line = 106)
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        if (arg0 != 4161) {
            return false;
        } else {
            ++field9093;
            return false;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILha;)Ldfa;", line = 118)
    public final class176 method22(int arg0, class65 arg1) {
        ++field9089;
        class500 var3 = this.method3643(arg1, (~this.field9099 != -1 ? 5 : 0) | 2048, false, this.field9081);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -10) {
                this.method3645(-7, (byte) -83);
            }
            if (this.field9099 != 0) {
                var3.method329(this.field9099 * 2048);
            }
            class303 var4 = arg1.method450();
            var4.method981(super.field2257, super.field2246, super.field2259);
            this.method3646(-128, var3, var4, arg1);
            class176 var5 = class567.method3167(false, 0, 1);
            if (class200.field2658) {
                var3.method300(var4, var5.field2345[0], class330.field4773, 0);
            } else {
                var3.method292(var4, var5.field2345[0], 0);
            }
            if (this.field9082 != null) {
                class515 var6 = this.field9082.method3671();
                if (!class200.field2658) {
                    arg1.method524(var6);
                } else {
                    arg1.method532(var6, class330.field4773);
                }
            }
            this.field9098 = var3.method326();
            this.field9080 = var3.method335();
            this.field9091 = var3.method339();
            return var5;
        }
    }

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "(I)Z", line = 170)
    public final boolean method19(int arg0) {
        if (arg0 >= -87) {
            this.field9080 = 7;
        }
        ++field9095;
        return false;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IB)V", line = 187)
    public final void method3645(int arg0, byte arg1) {
        ++field9094;
        if (arg1 < -42) {
            if (!this.field9101) {
                this.field9100 += arg0;
                while (~this.field9092.field6773[this.field9084] > ~this.field9100) {
                    this.field9100 -= this.field9092.field6773[this.field9084];
                    ++this.field9084;
                    if (~this.field9092.field6775.length >= ~this.field9084) {
                        this.field9101 = true;
                        break;
                    }
                }
                if (!this.field9101) {
                    class586.method3259(this, 0, this.field9092, this.field9084);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "(I)Z", line = 244)
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            this.field9080 = 26;
        }
        ++field9088;
        return this.field9098;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(BLha;)V", line = 255)
    public final void method32(byte arg0, class65 arg1) {
        ++field9105;
        if (arg0 < 69) {
            this.method3645(83, (byte) -113);
        }
        class500 var3 = this.method3643(arg1, 0, false, this.field9081);
        if (var3 != null) {
            class303 var4 = arg1.method450();
            var4.method981(super.field2257, super.field2246, super.field2259);
            this.method3646(-122, var3, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lha;B)Lel;", line = 279)
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            return null;
        } else {
            ++field9096;
            return null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILka;Luu;Lha;)V", line = 298)
    private final void method3646(int arg0, class500 arg1, class303 arg2, class65 arg3) {
        ++field9090;
        int var5 = -29 / ((-66 - arg0) / 54);
        arg1.method296(arg2);
        class577[] var6 = arg1.method341();
        class263[] var7 = arg1.method308();
        if ((this.field9082 == null || this.field9082.field9163) && (var6 != null || var7 != null)) {
            this.field9082 = class663.method3670(class100.field1401, true);
        }
        if (this.field9082 != null) {
            this.field9082.method3664(arg3, (long) class100.field1401, var6, var7, false);
            this.field9082.method3668(super.field2250, super.field4600, super.field4595, super.field4590, super.field4585);
        }
    }

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "(I)I", line = 325)
    public final int method24(int arg0) {
        ++field9079;
        return arg0 != 748449288 ? 63 : this.field9080;
    }
}

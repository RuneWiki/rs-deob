import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class592 extends class293 implements class289 {

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "B")
    private byte field8099;

    @OriginalMember(owner = "client!qt", name = "R", descriptor = "S")
    private short field8120;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "Z")
    private boolean field8112;

    @OriginalMember(owner = "client!qt", name = "K", descriptor = "Z")
    private boolean field8113;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "B")
    private byte field8105;

    @OriginalMember(owner = "client!qt", name = "L", descriptor = "B")
    private byte field8114;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "Z")
    private boolean field8098;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "Z")
    private boolean field8101;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "Lw;")
    private class451 field8103;

    @OriginalMember(owner = "client!qt", name = "V", descriptor = "Lba;")
    public class629 field8124;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!qt", name = "M", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!qt", name = "O", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!qt", name = "P", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!qt", name = "Q", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!qt", name = "S", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!qt", name = "T", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!qt", name = "U", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!qt", name = "W", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!qt", name = "X", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!qt", name = "Y", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "Lvg;")
    private class162 field8097;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "Ljs;")
    public static class346 field8107;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(IILoa;)Lba;", line = 3)
    private final class629 method3294(int arg0, int arg1, class689 arg2) {
        ++field8111;
        if (this.field8124 != null && ~arg2.method2007(this.field8124.method688(), arg1) == -1) {
            return this.field8124;
        } else if (arg0 != 31848) {
            return null;
        } else {
            class72 var4 = this.method3297(false, 131072, arg1, arg2);
            return var4 != null ? var4.field934 : null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "(I)I", line = 28)
    public final int method1738(int arg0) {
        if (arg0 != 3891) {
            return 121;
        } else {
            ++field8121;
            return this.field8124 == null ? 0 : this.field8124.method686();
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILoa;)V", line = 39)
    public final void method131(int arg0, class689 arg1) {
        if (arg0 != -20929) {
            field8107 = null;
        }
        ++field8104;
        Object var3 = null;
        class451 var5;
        if (this.field8103 == null && this.field8101) {
            class72 var4 = this.method3297(true, 131072, 262144, arg1);
            var5 = var4 != null ? var4.field932 : null;
        } else {
            var5 = this.field8103;
            this.field8103 = null;
        }
        if (var5 != null) {
            class477.method2673(var5, this.field8105, super.field3929, super.field3917, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V", line = 66)
    public final void method127(int arg0) {
        ++field8100;
        this.field8112 = false;
        if (arg0 > 118) {
            if (this.field8124 != null) {
                this.field8124.method655(this.field8124.method688() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(Z)I", line = 81)
    public final int method3295(boolean arg0) {
        if (!arg0) {
            this.method126(105);
        }
        ++field8127;
        return this.field8124 == null ? 15 : this.field8124.method683() / 4;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)I", line = 94)
    public final int method126(int arg0) {
        if (arg0 != 20377) {
            method3296((byte) -3);
        }
        ++field8119;
        return this.field8099;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Loa;Luca;IIIIIZIIIIIIZ)V", line = 106)
    public class592(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field3415 == -2, class564.method3178(arg13, arg12, 1));
        this.field8099 = (byte) arg13;
        this.field8120 = (short) arg1.field3456;
        this.field8112 = arg14;
        this.field8113 = arg1.field3453 != 0 && !arg7;
        this.field8105 = (byte) arg3;
        this.field8114 = (byte) arg12;
        this.field8098 = arg7;
        this.field8101 = arg0.method1976() && arg1.field3413 && !this.field8098 && class72.field935.method2693(class161.field2038, (byte) 91) != 0;
        int var16 = 2048;
        if (this.field8112) {
            var16 |= 65536;
        }
        class72 var17 = this.method3297(this.field8101, 131072, var16, arg0);
        if (var17 != null) {
            this.field8103 = var17.field932;
            this.field8124 = var17.field934;
            if (this.field8112) {
                this.field8124 = this.field8124.method659((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V", line = 142)
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 != -8763) {
            this.method127(-51);
        }
        if (arg0 instanceof class636) {
            class636 var8 = (class636) arg0;
            if (this.field8124 != null && var8.field8678 != null) {
                this.field8124.method646(var8.field8678, arg3, arg1, arg5, arg6);
            }
        } else if (arg0 instanceof class592) {
            class592 var9 = (class592) arg0;
            if (this.field8124 != null && var9.field8124 != null) {
                this.field8124.method646(var9.field8124, arg3, arg1, arg5, arg6);
            }
        }
        ++field8116;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLoa;)Lvg;", line = 174)
    public final class162 method134(byte arg0, class689 arg1) {
        if (this.field8097 == null) {
            this.field8097 = class440.method2525(255, this.method3294(31848, 0, arg1), super.field3929, super.field3930, super.field3917);
        }
        ++field8115;
        return arg0 <= 121 ? null : this.field8097;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)Z", line = 189)
    public final boolean method122(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field8106;
            return this.field8101;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(ILoa;)V", line = 202)
    public final void method129(int arg0, class689 arg1) {
        ++field8118;
        if (arg0 != 27921) {
            this.method128((byte) 52);
        }
        Object var3 = null;
        class451 var5;
        if (this.field8103 == null && this.field8101) {
            class72 var4 = this.method3297(true, 131072, 262144, arg1);
            var5 = var4 != null ? var4.field932 : null;
        } else {
            var5 = this.field8103;
            this.field8103 = null;
        }
        if (var5 != null) {
            class105.method564(var5, this.field8105, super.field3929, super.field3917, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)V", line = 231)
    public static void method3296(byte arg0) {
        int var1 = 80 % ((64 - arg0) / 56);
        field8107 = null;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(Z)V", line = 243)
    public final void method132(boolean arg0) {
        if (!arg0) {
            this.field8124 = null;
        }
        if (this.field8124 != null) {
            this.field8124.method647();
        }
        ++field8110;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIILoa;)Ltaa;", line = 258)
    private final class72 method3297(boolean arg0, int arg1, int arg2, class689 arg3) {
        ++field8102;
        class252 var5 = class578.field7980.method1746(this.field8120 & 65535, (byte) 119);
        if (arg1 != 131072) {
            this.field8097 = null;
        }
        class176 var6;
        class176 var7;
        if (!this.field8098) {
            var6 = class249.field3345[this.field8105];
            if (~this.field8105 > -4) {
                var7 = class249.field3345[this.field8105 - -1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class185.field2270[this.field8105];
            var7 = class249.field3345[0];
        }
        return var5.method1564(var6, this.field8114 != 11 ? this.field8114 : 10, super.field3929, ~this.field8114 == -12 ? this.field8099 + 4 : this.field8099, 31302, arg3, super.field3917, arg0, super.field3930, var7, arg2);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I", line = 293)
    public final int method128(byte arg0) {
        ++field8096;
        return arg0 <= 35 ? -5 : this.field8114;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILoa;)Lba;", line = 308)
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        if (arg1 != 17925) {
            this.method1738(94);
        }
        ++field8117;
        return this.method3294(31848, arg0, arg2);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Loa;B)Llt;", line = 321)
    public final class95 method136(class689 arg0, byte arg1) {
        ++field8126;
        if (this.field8124 == null) {
            return null;
        } else {
            class111 var3 = arg0.method1972();
            if (arg1 >= -47) {
                return null;
            } else {
                var3.method609(super.field3929, super.field3930, super.field3917);
                class95 var4 = null;
                if (this.field8113) {
                    var4 = class429.method2472(1, (byte) -113);
                }
                this.field8124.method665(var3, var4 != null ? var4.field1175[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I", line = 346)
    public final int method130(int arg0) {
        ++field8108;
        if (arg0 != -5582) {
            this.field8113 = false;
        }
        return 65535 & this.field8120;
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)Z", line = 357)
    public final boolean method135(int arg0) {
        ++field8109;
        if (arg0 != 0) {
            this.field8114 = 127;
        }
        return this.field8112;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIILoa;)Z", line = 368)
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field8122;
        class629 var5 = this.method3294(31848, 131072, arg3);
        if (arg2 < 117) {
            this.field8103 = null;
        }
        if (var5 != null) {
            class111 var6 = arg3.method1972();
            var6.method609(super.field3929, super.field3930, super.field3917);
            return var5.method695(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(BLoa;)V", line = 395)
    public final void method123(byte arg0, class689 arg1) {
        if (arg0 <= 91) {
            this.field8124 = null;
        }
        ++field8125;
    }
}

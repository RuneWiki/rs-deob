import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class284 extends class210 {

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "Z")
    public boolean field3879 = false;

    @OriginalMember(owner = "client!aj", name = "hb", descriptor = "I")
    private int field3896 = 0;

    @OriginalMember(owner = "client!aj", name = "kb", descriptor = "I")
    private int field3899 = 0;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "Z")
    private boolean field3891 = false;

    @OriginalMember(owner = "client!aj", name = "qb", descriptor = "I")
    private int field3905 = -1;

    @OriginalMember(owner = "client!aj", name = "tb", descriptor = "I")
    private int field3908 = 0;

    @OriginalMember(owner = "client!aj", name = "pb", descriptor = "I")
    private int field3904 = 0;

    @OriginalMember(owner = "client!aj", name = "ub", descriptor = "I")
    private int field3909 = 0;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "Lks;")
    private class403 field3895;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field3883 = 0;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "[[Ljava/lang/String;")
    public static String[][] field3888 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!aj", name = "ib", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!aj", name = "lb", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!aj", name = "mb", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!aj", name = "ob", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!aj", name = "rb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!aj", name = "vb", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!aj", name = "wb", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!aj", name = "nb", descriptor = "Loa;")
    private class646 field3902;

    @OriginalMember(owner = "client!aj", name = "sb", descriptor = "Lwn;")
    public static class674 field3907;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method1746(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3911;
        if (arg3 >= 2 && ~arg3 >= -37) {
            if (arg1 && arg2 >= 0) {
                int var4 = 2;
                int var5 = arg2 / arg3;
                if (arg0 != 48) {
                    method1747(115, (byte[]) null, (byte[][]) null, (int[]) null, (int[]) null, 1, (byte[][]) null, 25);
                }
                while (~var5 != -1) {
                    var5 /= arg3;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 + -1; var7 > 0; --var7) {
                    int var8 = arg2;
                    arg2 /= arg3;
                    int var9 = -(arg2 * arg3) + var8;
                    if (~var9 > -11) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg3);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)Z")
    public final boolean method209(byte arg0) {
        ++field3906;
        int var2 = -23 % ((31 - arg0) / 42);
        return this.field3891;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[B[[B[I[II[[BI)I")
    public static final int method1747(int arg0, byte[] arg1, byte[][] arg2, int[] arg3, int[] arg4, int arg5, byte[][] arg6, int arg7) {
        ++field3880;
        int var8 = arg4[arg5];
        int var9 = var8 - -arg3[arg5];
        int var10 = arg4[arg7];
        int var11 = var10 - -arg3[arg7];
        int var12 = var8;
        if (~var10 < ~var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var9 < ~var11) {
            var13 = var11;
        }
        if (arg0 != -14696) {
            method1750((byte) -3);
        }
        int var14 = arg1[arg5] & 255;
        if (var14 > (255 & arg1[arg7])) {
            var14 = 255 & arg1[arg7];
        }
        byte[] var15 = arg6[arg5];
        byte[] var16 = arg2[arg7];
        int var17 = -var8 + var12;
        int var18 = -var10 + var12;
        for (int var19 = var12; var13 > var19; ++var19) {
            int var20 = var15[var17++] - -var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILr;I)Lda;")
    private final class55 method1748(int arg0, int arg1, class166 arg2, int arg3) {
        ++field3900;
        class157 var5 = class430.field5994.method1993(arg3, arg0 ^ 64);
        if (arg0 != 0) {
            field3883 = 53;
        }
        class37 var6 = class497.field6766[super.field4053];
        class37 var7 = ~super.field4050 <= -4 ? null : class497.field6766[super.field4050 + 1];
        return this.field3879 ? var5.method1115(var7, super.field4052, -1, 0, super.field4042, var6, arg1, true, arg2, class192.field2727, -1, (byte) 2, super.field4047) : var5.method1115(var7, super.field4052, this.field3905, this.field3908, super.field4042, var6, arg1, true, arg2, class192.field2727, this.field3909, (byte) 2, super.field4047);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public final void method1749(int arg0, int arg1) {
        ++field3901;
        if (!this.field3879) {
            if (arg1 != 0) {
                this.method217(108);
            }
            this.field3908 += arg0;
            while (~this.field3908 < ~this.field3895.field5646[this.field3909]) {
                this.field3908 -= this.field3895.field5646[this.field3909];
                ++this.field3909;
                if (~this.field3895.field5667.length >= ~this.field3909) {
                    this.field3879 = true;
                    break;
                }
            }
            if (!this.field3879) {
                class234.method1476(this, this.field3895, this.field3909, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        if (arg1 != 0) {
            this.method224(-17, 67, 113, (class166) null);
        }
        ++field3884;
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static void method1750(byte arg0) {
        field3888 = null;
        field3907 = null;
        if (arg0 >= -83) {
            field3883 = 24;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lvv;IIZLr;II)V")
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        if (arg6 == 0) {
            ++field3903;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3881;
        if (this.field3902 != null) {
            this.field3902.method3604();
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        ++field3887;
        class55 var3 = this.method1748(0, 2048 | (this.field3896 == 0 ? 0 : 5), arg0, this.field3889);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field3896 != -1) {
                var3.method444(this.field3896 * 2048);
            }
            class392 var4 = arg0.method166();
            var4.method689(super.field4042, super.field4052, super.field4047);
            this.method1751(var4, var3, (byte) -61, arg0);
            if (arg1 != -5) {
                return null;
            } else {
                if (!class340.field4563) {
                    var3.method465(var4, (class551) null, 0);
                } else {
                    var3.method453(var4, (class551) null, class22.field250, 0);
                }
                if (this.field3902 != null) {
                    class472 var5 = this.field3902.method3598();
                    if (class340.field4563) {
                        arg0.method167(var5, class22.field250);
                    } else {
                        arg0.method163(var5);
                    }
                }
                this.field3891 = var3.method430();
                this.field3904 = var3.method463();
                this.field3899 = var3.method426();
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field3892 = arg1 + arg2;
        this.field3896 = arg12;
        this.field3889 = arg0;
        class157 var14 = class430.field5994.method1993(this.field3889, 64);
        int var15 = var14.field2290;
        if (~var15 != 0) {
            this.field3895 = class192.field2727.method3090(-105, var15);
            this.field3879 = false;
        } else {
            this.field3879 = true;
        }
        if (this.field3892 == arg2) {
            class234.method1476(this, this.field3895, this.field3909, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lq;Lda;BLr;)V")
    private final void method1751(class392 arg0, class55 arg1, byte arg2, class166 arg3) {
        ++field3882;
        if (arg2 != -61) {
            field3888 = null;
        }
        arg1.method460(arg0);
        class369[] var5 = arg1.method451();
        class357[] var6 = arg1.method429();
        if ((this.field3902 == null || this.field3902.field8923) && (var5 != null || var6 != null)) {
            this.field3902 = class646.method3603(class186.field2697, true);
        }
        if (this.field3902 != null) {
            this.field3902.method3601(arg3, (long) class186.field2697, var5, var6, false);
            this.field3902.method3610(super.field4053, super.field2972, super.field2973, super.field2963, super.field2969);
        }
    }

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)V")
    public final void method227(int arg0) {
        if (arg0 >= -115) {
            this.method215(117);
        }
        ++field3898;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
    public final int method226(int arg0) {
        ++field3897;
        if (arg0 != 6329) {
            this.field3902 = null;
        }
        return this.field3899;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        int var3 = 118 % ((arg0 - 81) / 43);
        ++field3894;
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method1752(int arg0) {
        ++field3886;
        if (arg0 != 2048) {
            this.field3899 = -95;
        }
        if (this.field3902 != null) {
            this.field3902.method3604();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field3893;
        if (arg1) {
            class55 var3 = this.method1748(0, 0, arg0, this.field3889);
            if (var3 != null) {
                class392 var4 = arg0.method166();
                var4.method689(super.field4042, super.field4052, super.field4047);
                this.method1751(var4, var3, (byte) -61, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)Z")
    public final boolean method216(boolean arg0) {
        ++field3885;
        if (!arg0) {
            this.field3889 = 126;
        }
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        if (arg0 <= 49) {
            this.field3905 = 127;
        }
        ++field3910;
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
    public final int method217(int arg0) {
        ++field3890;
        if (arg0 <= 29) {
            this.field3904 = 52;
        }
        return this.field3904;
    }
}

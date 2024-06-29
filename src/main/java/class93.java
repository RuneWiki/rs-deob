import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class93 extends class249 implements class289 {

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "Z")
    private boolean field1161;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "B")
    private byte field1147;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "S")
    private short field1140;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "B")
    private byte field1158;

    @OriginalMember(owner = "client!hs", name = "X", descriptor = "B")
    private byte field1167;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "Z")
    private boolean field1148;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "Z")
    private boolean field1142;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "Lw;")
    private class451 field1151;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "Lba;")
    private class629 field1156;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Lgj;")
    public static class334 field1141 = new class334();

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!hs", name = "T", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hs", name = "U", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!hs", name = "V", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hs", name = "W", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hs", name = "Y", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "Lpq;")
    public static class159 field1162;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "Lvg;")
    private class162 field1157;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "[[B")
    public static byte[][] field1153;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
    public final int method130(int arg0) {
        if (arg0 != -5582) {
            return 63;
        } else {
            ++field1168;
            return this.field1140 & 65535;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        ++field1149;
        if (this.field1156 != null) {
            this.field1156.method647();
        }
        if (!arg0) {
            this.method131(-31, (class689) null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILoa;)V")
    public final void method131(int arg0, class689 arg1) {
        ++field1159;
        Object var3 = null;
        if (arg0 == -20929) {
            class451 var5;
            if (this.field1151 == null && this.field1142) {
                class72 var4 = this.method520(arg1, 17868, 262144, true);
                var5 = var4 == null ? null : var4.field932;
            } else {
                var5 = this.field1151;
                this.field1151 = null;
            }
            if (var5 != null) {
                class477.method2673(var5, this.field1167, super.field3343, super.field3350, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(ILoa;)V")
    public final void method129(int arg0, class689 arg1) {
        ++field1152;
        if (arg0 != 27921) {
            this.field1142 = false;
        }
        Object var3 = null;
        class451 var5;
        if (this.field1151 == null && this.field1142) {
            class72 var4 = this.method520(arg1, arg0 + -10053, 262144, true);
            var5 = var4 != null ? var4.field932 : null;
        } else {
            var5 = this.field1151;
            this.field1151 = null;
        }
        if (var5 != null) {
            class105.method564(var5, this.field1167, super.field3343, super.field3350, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        if (arg0 != 20377) {
            this.field1142 = true;
        }
        ++field1165;
        return this.field1147;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
    public static void method518(byte arg0) {
        field1153 = null;
        if (arg0 != -20) {
            method523(105, (byte[]) null, (byte) -61, 3);
        }
        field1141 = null;
        field1162 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        ++field1144;
        if (~arg5 <= -513 && ~arg8 <= -513 && arg5 <= class588.field8082 * 512 + -1024 && arg8 <= (class12.field113 + -2) * 512) {
            int var10 = class394.method2340(arg5, -1, arg4, arg8) + -arg2;
            class488.field6582.method595(arg0, 0, 0);
            class9.field103.method1887(class488.field6582);
            class9.field103.method1891(arg5, var10, arg8, class558.field7608);
            class488.field6582.method595(-arg0, 0, 0);
            class9.field103.method1887(class488.field6582);
            int var11 = -67 / ((13 - arg9) / 42);
        } else {
            class558.field7608[0] = class558.field7608[1] = -1;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
    public final int method128(byte arg0) {
        if (arg0 < 35) {
            this.method137(-45, 116, -107, (class689) null);
        }
        ++field1139;
        return this.field1158;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILoa;)Lba;")
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        ++field1160;
        return arg1 != 17925 ? null : this.method521(arg0, (byte) 63, arg2);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Z")
    public final boolean method122(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field1163;
            return this.field1142;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Loa;IIZ)Ltaa;")
    private final class72 method520(class689 arg0, int arg1, int arg2, boolean arg3) {
        ++field1146;
        class252 var5 = class578.field7980.method1746(65535 & this.field1140, (byte) 99);
        if (arg1 != 17868) {
            field1141 = null;
        }
        class176 var6;
        class176 var7;
        if (!this.field1148) {
            var6 = class249.field3345[this.field1167];
            if (~this.field1167 <= -4) {
                var7 = null;
            } else {
                var7 = class249.field3345[this.field1167 + 1];
            }
        } else {
            var7 = class249.field3345[0];
            var6 = class185.field2270[this.field1167];
        }
        return var5.method1564(var6, this.field1158, super.field3343, this.field1147, 31302, arg0, super.field3350, arg3, super.field3358, var7, arg2);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBLoa;)Lba;")
    private final class629 method521(int arg0, byte arg1, class689 arg2) {
        if (arg1 != 63) {
            this.field1142 = false;
        }
        ++field1155;
        if (this.field1156 != null && ~arg2.method2007(this.field1156.method688(), arg0) == -1) {
            return this.field1156;
        } else {
            class72 var4 = this.method520(arg2, arg1 ^ 17907, arg0, false);
            return var4 != null ? var4.field934 : null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Loa;Luca;IIIIZIIIII)V")
    public class93(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class35.method209(12231, arg10, arg11));
        this.field1161 = arg1.field3453 != 0 && !arg6;
        super.field3350 = arg5;
        super.field3343 = arg3;
        this.field1147 = (byte) arg11;
        this.field1140 = (short) arg1.field3456;
        this.field1158 = (byte) arg10;
        this.field1167 = (byte) arg2;
        this.field1148 = arg6;
        this.field1142 = arg0.method1976() && arg1.field3413 && !this.field1148 && class72.field935.method2693(class161.field2038, (byte) 91) != 0;
        class72 var13 = this.method520(arg0, 17868, 2048, this.field1142);
        if (var13 != null) {
            this.field1151 = var13.field932;
            this.field1156 = var13.field934;
        }
    }

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "(I)I")
    public final int method522(int arg0) {
        ++field1166;
        if (arg0 >= -95) {
            return 9;
        } else {
            return this.field1156 != null ? this.field1156.method686() : 0;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(BLoa;)V")
    public final void method123(byte arg0, class689 arg1) {
        ++field1145;
        if (arg0 < 91) {
            this.field1167 = 11;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLoa;)Lvg;")
    public final class162 method134(byte arg0, class689 arg1) {
        if (arg0 <= 121) {
            this.method137(-78, -81, -63, (class689) null);
        }
        if (this.field1157 == null) {
            this.field1157 = class440.method2525(255, this.method521(0, (byte) 63, arg1), super.field3343, super.field3358, super.field3350);
        }
        ++field1143;
        return this.field1157;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field1164;
        class629 var5 = this.method521(131072, (byte) 63, arg3);
        if (var5 != null) {
            class111 var6 = arg3.method1972();
            var6.method609(super.field3343, super.field3358, super.field3350);
            return var5.method695(arg0, arg1, var6, false);
        } else {
            return arg2 < 117 ? false : false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Loa;B)Llt;")
    public final class95 method136(class689 arg0, byte arg1) {
        if (arg1 > -47) {
            return null;
        } else {
            ++field1150;
            if (this.field1156 == null) {
                return null;
            } else {
                class111 var3 = arg0.method1972();
                var3.method609(super.field3346 + super.field3343, super.field3358, super.field3359 + super.field3350);
                class95 var4 = null;
                if (this.field1161) {
                    var4 = class429.method2472(1, (byte) -97);
                }
                this.field1156.method665(var3, var4 != null ? var4.field1175[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[BBI)Ljava/lang/String;")
    public static final String method523(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field1154;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg2 != -114) {
            field1153 = null;
        }
        for (int var6 = 0; ~arg0 < ~var6; ++var6) {
            int var7 = 255 & arg1[arg3 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class274.field3712[var7 - 128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}

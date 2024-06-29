import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class54 extends class402 implements class425 {

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Z")
    private boolean field1168;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "B")
    private byte field1154;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "B")
    private byte field1163;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Z")
    private boolean field1142;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "B")
    private byte field1161;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "S")
    private short field1173;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Z")
    private boolean field1169;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Z")
    private boolean field1156;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Le;")
    public class374 field1159;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Li;")
    private class31 field1152;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Lbj;")
    public static class162 field1155 = new class162(82, 7);

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "[Ljv;")
    public static class57[] field1172 = new class57[14];

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZBLza;)Lrn;", line = 4)
    private final class177 method503(int arg0, boolean arg1, byte arg2, class288 arg3) {
        ++field1147;
        if (arg2 <= 122) {
            this.method225(true);
        }
        class306 var5 = class123.field2142.method1530((byte) -117, 65535 & this.field1173);
        class38 var6;
        class38 var7;
        if (!this.field1168) {
            var6 = class531.field7727[this.field1161];
            if (this.field1161 < 3) {
                var7 = class531.field7727[this.field1161 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class293.field4481[this.field1161];
            var7 = class531.field7727[0];
        }
        return var5.method1956(arg1, ~this.field1154 != -12 ? this.field1163 : 4 - -this.field1163, super.field6073, super.field6078, super.field6083, arg0, var6, (byte) -10, arg3, this.field1154 == 11 ? 10 : this.field1154, var7);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILza;I)Le;", line = 35)
    public final class374 method234(int arg0, class288 arg1, int arg2) {
        ++field1150;
        if (arg0 <= 99) {
            method504(false, (class425) null);
        }
        return this.method506(arg2, arg1, (byte) -75);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBILvs;Lza;ZI)V", line = 52)
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (arg1 != 93) {
            method508(89, 119L);
        }
        ++field1164;
        if (!(arg3 instanceof class190)) {
            if (arg3 instanceof class54) {
                class54 var8 = (class54) arg3;
                if (this.field1159 != null && var8.field1159 != null) {
                    this.field1159.method741(var8.field1159, arg2, arg0, arg6, arg5);
                    return;
                }
            }
        } else {
            class190 var9 = (class190) arg3;
            if (this.field1159 == null || var9.field3047 == null) {
                return;
            }
            this.field1159.method741(var9.field3047, arg2, arg0, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I", line = 85)
    public final int method224(int arg0) {
        ++field1145;
        return arg0 != -10848 ? 5 : 65535 & this.field1173;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lza;Z)V", line = 99)
    public final void method232(class288 arg0, boolean arg1) {
        if (!arg1) {
            this.method233((class288) null, 123);
        }
        ++field1158;
        Object var3 = null;
        class31 var5;
        if (this.field1152 == null && this.field1156) {
            class177 var4 = this.method503(262144, true, (byte) 124, arg0);
            var5 = var4 != null ? var4.field2871 : null;
        } else {
            var5 = this.field1152;
            this.field1152 = null;
        }
        if (var5 != null) {
            class1.method10(var5, this.field1161, super.field6073, super.field6078, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLrj;)Z", line = 127)
    public static final boolean method504(boolean arg0, class425 arg1) {
        if (arg0) {
            return false;
        } else {
            ++field1143;
            class306 var2 = class123.field2142.method1530((byte) -38, arg1.method224(-10848));
            if (var2.field4597 == -1) {
                return true;
            } else {
                class113 var3 = class160.field2586.method2134(var2.field4597, (byte) 84);
                return var3.field2040 == -1 ? true : var3.method942((byte) -69);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Z", line = 149)
    public final boolean method228(int arg0) {
        if (arg0 != 1396) {
            return true;
        } else {
            ++field1144;
            return this.field1156;
        }
    }

    @OriginalMember(owner = "client!u", name = "j", descriptor = "(I)I", line = 160)
    public final int method505(int arg0) {
        if (arg0 != 262144) {
            this.field1159 = null;
        }
        ++field1146;
        return this.field1159 != null ? this.field1159.method722() / 4 : 15;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILza;B)Le;", line = 171)
    private final class374 method506(int arg0, class288 arg1, byte arg2) {
        ++field1166;
        if (this.field1159 != null && ~arg1.method394(this.field1159.method768(), arg0) == -1) {
            return this.field1159;
        } else if (arg2 != -75) {
            return null;
        } else {
            class177 var4 = this.method503(arg0, false, (byte) 127, arg1);
            return var4 != null ? var4.field2866 : null;
        }
    }

    @OriginalMember(owner = "client!u", name = "k", descriptor = "(I)V", line = 193)
    public static void method507(int arg0) {
        if (arg0 >= -92) {
            field1155 = null;
        }
        field1172 = null;
        field1155 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 204)
    public final void method229(int arg0) {
        ++field1162;
        if (arg0 == -4715) {
            if (this.field1159 != null) {
                this.field1159.method718();
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I", line = 227)
    public final int method231(int arg0) {
        if (arg0 <= 7) {
            field1172 = null;
        }
        ++field1170;
        return this.field1163;
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)I", line = 239)
    public final int method8(int arg0) {
        ++field1171;
        if (arg0 != 0) {
            return -47;
        } else {
            return this.field1159 != null ? this.field1159.method736() : 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IJ)V", line = 250)
    public static final void method508(int arg0, long arg1) {
        ++field1165;
        if (class518.field7511 != null) {
            if (class510.field7435 != 1 && ~class510.field7435 != -6) {
                if (class510.field7435 == 4) {
                    class204.method1393(0, arg1);
                }
            } else {
                class416.method2552((byte) 101, arg1);
            }
        }
        client.method1358(class262.field4006, (byte) -99, (long) class62.field1268);
        if (~class155.field2523 != 0) {
            class242.method1584(class155.field2523, false);
        }
        for (int var3 = 0; var3 < class108.field1986; ++var3) {
            if (class486.field7167[var3]) {
                class188.field3023[var3] = true;
            }
            class420.field6338[var3] = class486.field7167[var3];
            class486.field7167[var3] = false;
        }
        class186.field2987 = class62.field1268;
        if (class262.field4006.method421()) {
            class196.field3151 = true;
        }
        if (class155.field2523 != -1) {
            class108.field1986 = 0;
            class85.method793(true);
        }
        class262.field4006.method321();
        class223.method1485(class262.field4006, false);
        int var4 = class445.method2665(4);
        if (var4 == -1) {
            var4 = class271.field4116;
        }
        if (var4 == -1) {
            var4 = class3.field67;
        }
        class124.method989(var4, (byte) -55);
        class458.method2731(-125, class15.field266.field6078, class15.field266.field6084, class5.field97, class15.field266.field6073);
        class5.field97 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLza;II)Z", line = 313)
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field1160;
        class374 var5 = this.method506(131072, arg1, (byte) -75);
        if (var5 != null) {
            class124 var6 = arg1.method364();
            var6.method835(super.field6073, super.field6083, super.field6078);
            return var5.method763(arg3, arg2, var6, false);
        } else {
            if (arg0) {
                this.method231(-26);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Z", line = 339)
    public final boolean method19(byte arg0) {
        if (arg0 <= 121) {
            return true;
        } else {
            ++field1148;
            return this.field1169;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lza;I)Lnd;", line = 350)
    public final class385 method15(class288 arg0, int arg1) {
        ++field1157;
        if (arg1 != 2) {
            return null;
        } else if (this.field1159 == null) {
            return null;
        } else {
            class124 var3 = arg0.method364();
            var3.method835(super.field6073, super.field6083, super.field6078);
            class385 var4 = null;
            if (this.field1142) {
                var4 = class497.method3001(1, false);
            }
            this.field1159.method723(var3, var4 != null ? var4.field5620[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I", line = 376)
    public final int method225(boolean arg0) {
        ++field1151;
        return arg0 ? -114 : this.field1154;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V", line = 387)
    public final void method12(int arg0) {
        this.field1169 = false;
        int var2 = -48 / ((-35 - arg0) / 44);
        ++field1167;
        if (this.field1159 != null) {
            this.field1159.method732(this.field1159.method768() & -65537);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lza;I)V", line = 403)
    public final void method233(class288 arg0, int arg1) {
        ++field1149;
        Object var3 = null;
        class31 var5;
        if (this.field1152 == null && this.field1156) {
            class177 var4 = this.method503(262144, true, (byte) 127, arg0);
            var5 = var4 == null ? null : var4.field2871;
        } else {
            var5 = this.field1152;
            this.field1152 = null;
        }
        if (arg1 != 13367) {
            this.field1169 = false;
        }
        if (var5 != null) {
            class523.method3094(var5, this.field1161, super.field6073, super.field6078, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lza;Ljc;IIIIIZIIIIIIZ)V", line = 432)
    public class54(class288 arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4602 == 1, class507.method3040((byte) 17, arg12, arg13));
        this.field1168 = arg7;
        this.field1154 = (byte) arg12;
        this.field1163 = (byte) arg13;
        this.field1142 = ~arg1.field4587 != -1 && !arg7;
        this.field1161 = (byte) arg3;
        this.field1173 = (short) arg1.field4626;
        this.field1169 = arg14;
        this.field1156 = arg0.method309() && arg1.field4637 && !this.field1168 && class186.field2990.method1130(class133.field2236, 121) != 0;
        int var16 = 2048;
        if (this.field1169) {
            var16 |= 65536;
        }
        class177 var17 = this.method503(var16, this.field1156, (byte) 126, arg0);
        if (var17 != null) {
            this.field1159 = var17.field2866;
            this.field1152 = var17.field2871;
            if (this.field1169) {
                this.field1159 = this.field1159.method746((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLza;)V", line = 466)
    public final void method9(byte arg0, class288 arg1) {
        ++field1153;
        if (arg0 >= -98) {
            this.field1152 = null;
        }
    }
}

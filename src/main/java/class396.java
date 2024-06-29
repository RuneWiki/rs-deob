import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class396 extends class620 implements class274 {

    @OriginalMember(owner = "client!dn", name = "db", descriptor = "Z")
    private boolean field5225 = false;

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "Lhw;")
    public class638 field5216;

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "Z")
    private boolean field5217;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!dn", name = "W", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!dn", name = "X", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!dn", name = "Y", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!dn", name = "Z", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!dn", name = "ab", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!dn", name = "bb", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!dn", name = "cb", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!dn", name = "fb", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!dn", name = "gb", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!dn", name = "hb", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "Lid;")
    private class486 field5208;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(ILha;)Lpi;", line = 4)
    public final class266 method187(int arg0, class570 arg1) {
        ++field5213;
        class299 var3 = this.field5216.method3440(7, 2048, true, arg1, false);
        if (var3 == null) {
            return null;
        } else {
            class465 var4 = arg1.method948();
            var4.method449(super.field2896, super.field2892, super.field2900);
            class266 var5 = class689.method3680((byte) -15, this.field5217, 1);
            this.field5216.method3438(super.field7850, var3, arg0 + 29573, true, super.field7852, var4, arg1, super.field7849, super.field7844);
            if (!class653.field8360) {
                var3.method1297(var4, var5.field3533[0], 0);
            } else {
                var3.method1292(var4, var5.field3533[0], class628.field7974, 0);
            }
            if (this.field5216.field8126 != null) {
                class705 var6 = this.field5216.field8126.method2844();
                if (class653.field8360) {
                    arg1.method980(var6, class628.field7974);
                } else {
                    arg1.method912(var6);
                }
            }
            this.field5225 = var3.method1272() || this.field5216.field8126 != null;
            if (arg0 != -29562) {
                return null;
            } else {
                if (this.field5208 != null) {
                    class345.method1997(this.field5208, var3, super.field2900, super.field2896, super.field2892, (byte) 113);
                } else {
                    this.field5208 = class77.method476(super.field2892, super.field2900, var3, super.field2896, arg0 + 29567);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)I", line = 50)
    public final int method747(int arg0) {
        ++field5226;
        if (arg0 != 15258) {
            this.field5225 = false;
        }
        return this.field5216.method3443(-1);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z", line = 63)
    public final boolean method1008(byte arg0) {
        ++field5227;
        if (arg0 > -51) {
            this.field5225 = true;
        }
        return this.field5216.method3444(-2026);
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z", line = 80)
    public final boolean method743(byte arg0) {
        ++field5212;
        if (arg0 > -76) {
            this.field5225 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I", line = 93)
    public final int method1013(byte arg0) {
        ++field5220;
        int var2 = 41 / ((arg0 - 76) / 36);
        return this.field5216.field8116;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I", line = 103)
    public final int method1010(int arg0) {
        if (arg0 != -6546) {
            return 32;
        } else {
            ++field5229;
            return this.field5216.field8121;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLha;)V", line = 116)
    public final void method1015(byte arg0, class570 arg1) {
        if (arg0 <= -71) {
            this.field5216.method3441(arg1, 1);
            ++field5222;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 128)
    public final void method185(int arg0) {
        ++field5210;
        if (arg0 != 0) {
            this.field5225 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lmea;I)V", line = 141)
    public final void method2294(class702 arg0, int arg1) {
        this.field5216.method3442(arg0, (byte) -39);
        if (arg1 != 1) {
            this.field5216 = null;
        }
        ++field5219;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILha;I)Z", line = 153)
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        ++field5218;
        class299 var5 = this.field5216.method3440(7, 131072, false, arg2, false);
        if (var5 == null) {
            return false;
        } else {
            int var6 = -59 / ((-23 - arg3) / 37);
            class465 var7 = arg2.method948();
            var7.method449(super.field2896, super.field2892, super.field2900);
            return class653.field8360 ? var5.method1233(arg0, arg1, var7, false, 0, class628.field7974) : var5.method1264(arg0, arg1, var7, false, 0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)I", line = 171)
    public final int method745(byte arg0) {
        if (arg0 > -85) {
            return 29;
        } else {
            ++field5211;
            return this.field5216.method3437(0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z", line = 182)
    public final boolean method171(int arg0) {
        ++field5228;
        if (arg0 > -80) {
            this.method745((byte) -12);
        }
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)I", line = 196)
    public final int method1007(boolean arg0) {
        if (!arg0) {
            this.field5216 = null;
        }
        ++field5209;
        return this.field5216.field8100;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIBLlq;Lha;II)V", line = 209)
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        ++field5207;
        if (arg2 != -126) {
            this.method170(21, (class570) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lha;I)V", line = 220)
    public final void method182(class570 arg0, int arg1) {
        ++field5223;
        if (arg1 > -87) {
            this.method174(true, -56, (byte) 87, (class210) null, (class570) null, -120, 59);
        }
        class299 var3 = this.field5216.method3440(7, 262144, true, arg0, true);
        if (var3 != null) {
            class465 var4 = arg0.method948();
            var4.method449(super.field2896, super.field2892, super.field2900);
            this.field5216.method3438(super.field7850, var3, 11, false, super.field7852, var4, arg0, super.field7849, super.field7844);
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lha;Lih;IIIIIZIIIIIII)V", line = 241)
    public class396(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field10520 == -2, class784.method4299((byte) -106, arg12, arg13));
        this.field5216 = new class638(arg0, arg1, arg12, arg13, super.field2895, arg3, this, arg7, arg14);
        this.field5217 = arg1.field10488 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V", line = 251)
    public final void method1012(byte arg0) {
        if (arg0 < 115) {
            this.field5225 = false;
        }
        ++field5215;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(Z)Z", line = 261)
    public final boolean method738(boolean arg0) {
        ++field5214;
        return !arg0 ? true : this.field5225;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(ILha;)Lid;", line = 279)
    public final class486 method170(int arg0, class570 arg1) {
        ++field5224;
        int var3 = 39 / ((-9 - arg0) / 63);
        return this.field5208;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILha;)V", line = 293)
    public final void method1014(int arg0, class570 arg1) {
        if (arg0 != -7908) {
            this.field5208 = null;
        }
        this.field5216.method3439(arg1, -5887);
        ++field5221;
    }
}

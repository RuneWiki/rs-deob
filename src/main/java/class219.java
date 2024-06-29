import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class219 extends class721 implements class274 {

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "Z")
    private boolean field2971 = false;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lhw;")
    public class638 field2986;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "Z")
    private boolean field2981;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lwv;")
    public static class246 field2988;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "Lid;")
    private class486 field2980;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z", line = 6)
    public final boolean method743(byte arg0) {
        ++field2994;
        if (arg0 >= -76) {
            this.method171(-28);
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lha;I)V", line = 19)
    public final void method182(class570 arg0, int arg1) {
        ++field2989;
        if (arg1 >= -87) {
            this.method187(110, (class570) null);
        }
        class299 var3 = this.field2986.method3440(7, 262144, true, arg0, true);
        if (var3 != null) {
            int var4 = super.field2896 >> 9;
            int var5 = super.field2900 >> 9;
            class465 var6 = arg0.method948();
            var6.method449(super.field2896, super.field2892, super.field2900);
            this.field2986.method3438(var5, var3, 11, false, var4, var6, arg0, var4, var5);
        }
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "(B)V", line = 45)
    public static void method1433(byte arg0) {
        if (arg0 >= -28) {
            method1434(89, false);
        }
        field2988 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIBLlq;Lha;II)V", line = 55)
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        ++field2992;
        if (arg2 != -126) {
            this.method187(56, (class570) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Z", line = 66)
    public final boolean method171(int arg0) {
        if (arg0 > -80) {
            return false;
        } else {
            ++field2995;
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(ILha;)Lpi;", line = 77)
    public final class266 method187(int arg0, class570 arg1) {
        ++field2975;
        class299 var3 = this.field2986.method3440(7, 2048, true, arg1, false);
        if (var3 == null) {
            return null;
        } else {
            class465 var4 = arg1.method948();
            var4.method449(super.field2896, super.field2892, super.field2900);
            class266 var5 = class689.method3680((byte) -15, this.field2981, 1);
            int var6 = super.field2896 >> 9;
            if (arg0 != -29562) {
                return null;
            } else {
                int var7 = super.field2900 >> 9;
                this.field2986.method3438(var7, var3, arg0 + 29573, true, var6, var4, arg1, var6, var7);
                if (!class653.field8360) {
                    var3.method1297(var4, var5.field3533[0], 0);
                } else {
                    var3.method1292(var4, var5.field3533[0], class628.field7974, 0);
                }
                if (this.field2986.field8126 != null) {
                    class705 var8 = this.field2986.field8126.method2844();
                    if (!class653.field8360) {
                        arg1.method912(var8);
                    } else {
                        arg1.method980(var8, class628.field7974);
                    }
                }
                this.field2971 = var3.method1272() || this.field2986.field8126 != null;
                if (this.field2980 == null) {
                    this.field2980 = class77.method476(super.field2892, super.field2900, var3, super.field2896, 5);
                } else {
                    class345.method1997(this.field2980, var3, super.field2900, super.field2896, super.field2892, (byte) 121);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLha;)V", line = 127)
    public final void method1015(byte arg0, class570 arg1) {
        if (arg0 >= -71) {
            this.method1435((class702) null, (byte) 16);
        }
        this.field2986.method3441(arg1, 1);
        ++field2974;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I", line = 140)
    public final int method1007(boolean arg0) {
        ++field2976;
        return !arg0 ? 17 : this.field2986.field8100;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lha;Lih;IIIIIZIII)V", line = 151)
    public class219(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class67.method389(false, arg9, arg8));
        this.field2986 = new class638(arg0, arg1, arg8, arg9, super.field2895, arg3, this, arg7, arg10);
        this.field2981 = ~arg1.field10488 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)I", line = 160)
    public final int method747(int arg0) {
        if (arg0 != 15258) {
            this.method182((class570) null, 124);
        }
        ++field2987;
        return this.field2986.method3443(-1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V", line = 174)
    public static final void method1434(int arg0, boolean arg1) {
        class568.field7181 = new int[arg0];
        if (arg1) {
            method1433((byte) -113);
        }
        ++field2985;
        class380.field4654 = new int[arg0];
        class246.field3369 = new int[arg0];
        class765.field10411 = new int[arg0];
        class416.field5489 = new int[arg0];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I", line = 193)
    public final int method1010(int arg0) {
        ++field2978;
        return arg0 != -6546 ? -61 : this.field2986.field8121;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)Z", line = 205)
    public final boolean method738(boolean arg0) {
        if (!arg0) {
            this.field2980 = null;
        }
        ++field2982;
        return this.field2971;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lmea;B)V", line = 216)
    public final void method1435(class702 arg0, byte arg1) {
        ++field2977;
        this.field2986.method3442(arg0, (byte) -39);
        if (arg1 != 6) {
            this.method179(16, -123, (class570) null, 35);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V", line = 229)
    public final void method1012(byte arg0) {
        if (arg0 >= 115) {
            ++field2983;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 241)
    public final void method185(int arg0) {
        if (arg0 != 0) {
            this.field2980 = null;
        }
        ++field2972;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILha;)V", line = 255)
    public final void method1014(int arg0, class570 arg1) {
        if (arg0 == -7908) {
            this.field2986.method3439(arg1, -5887);
            ++field2984;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)I", line = 266)
    public final int method1013(byte arg0) {
        ++field2990;
        int var2 = -36 % ((76 - arg0) / 36);
        return this.field2986.field8116;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)I", line = 277)
    public final int method745(byte arg0) {
        ++field2973;
        if (arg0 > -85) {
            this.field2980 = null;
        }
        return this.field2986.method3437(0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILha;I)Z", line = 290)
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        ++field2993;
        class299 var5 = this.field2986.method3440(7, 131072, false, arg2, false);
        if (var5 == null) {
            return false;
        } else {
            int var6 = -102 / ((arg3 - -23) / 37);
            class465 var7 = arg2.method948();
            var7.method449(super.field2896, super.field2892, super.field2900);
            return !class653.field8360 ? var5.method1264(arg0, arg1, var7, false, 0) : var5.method1233(arg0, arg1, var7, false, 0, class628.field7974);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(ILha;)Lid;", line = 309)
    public final class486 method170(int arg0, class570 arg1) {
        ++field2979;
        int var3 = -90 / ((arg0 - -9) / 63);
        return this.field2980;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z", line = 323)
    public final boolean method1008(byte arg0) {
        ++field2991;
        if (arg0 >= -51) {
            field2988 = null;
        }
        return this.field2986.method3444(-2026);
    }
}

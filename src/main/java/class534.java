import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class534 extends class719 implements class722 {

    @OriginalMember(owner = "client!tp", name = "db", descriptor = "Z")
    private boolean field7245 = false;

    @OriginalMember(owner = "client!tp", name = "jb", descriptor = "Lvo;")
    public class43 field7251;

    @OriginalMember(owner = "client!tp", name = "ab", descriptor = "Z")
    private boolean field7242;

    @OriginalMember(owner = "client!tp", name = "ib", descriptor = "F")
    public static float field7250 = 1.0F;

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!tp", name = "R", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!tp", name = "S", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!tp", name = "T", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!tp", name = "U", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!tp", name = "V", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!tp", name = "W", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!tp", name = "X", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!tp", name = "Y", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!tp", name = "Z", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!tp", name = "cb", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!tp", name = "fb", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!tp", name = "gb", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!tp", name = "hb", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!tp", name = "kb", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!tp", name = "bb", descriptor = "Loia;")
    private class90 field7243;

    @OriginalMember(owner = "client!tp", name = "eb", descriptor = "[Z")
    public static boolean[] field7246;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILha;BI)Z")
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        ++field7244;
        class472 var5 = this.field7251.method264(-1, false, 131072, arg1, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 <= 59) {
                this.field7242 = false;
            }
            class10 var6 = arg1.method410();
            var6.method33(super.field2170, super.field2178, super.field2165);
            return !class670.field9312 ? var5.method206(arg0, arg3, var6, false, 0) : var5.method196(arg0, arg3, var6, false, 0, class661.field9249);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILha;)V")
    public final void method678(int arg0, class60 arg1) {
        ++field7232;
        if (arg0 != -25163) {
            this.method126(-89);
        }
        this.field7251.method261((byte) -72, arg1);
    }

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        if (arg0 != 6540) {
            return false;
        } else {
            ++field7234;
            return this.field7245;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lgg;BZILha;II)V")
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        int var8 = 6 / ((15 - arg1) / 55);
        ++field7249;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLha;)Loia;")
    public final class90 method134(byte arg0, class60 arg1) {
        ++field7236;
        if (arg0 != -53) {
            this.field7245 = false;
        }
        return this.field7243;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)I")
    public final int method680(int arg0) {
        if (arg0 != 30472) {
            return -48;
        } else {
            ++field7229;
            return this.field7251.field460;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lha;Lvha;IIIIIZIII)V")
    public class534(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class669.method3765(arg9, (byte) -101, arg8));
        this.field7251 = new class43(arg0, arg1, arg8, arg9, super.field2175, arg3, this, arg7, arg10);
        this.field7242 = ~arg1.field9610 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(Lha;I)V")
    public final void method136(class60 arg0, int arg1) {
        int var3 = -21 % ((53 - arg1) / 46);
        ++field7237;
        class472 var4 = this.field7251.method264(-1, true, 262144, arg0, true);
        if (var4 != null) {
            int var5 = super.field2170 >> 9;
            int var6 = super.field2165 >> 9;
            class10 var7 = arg0.method410();
            var7.method33(super.field2170, super.field2178, super.field2165);
            this.field7251.method262(var4, var5, var6, var7, false, var5, arg0, false, var6);
        }
    }

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "(B)V")
    public final void method150(byte arg0) {
        ++field7228;
        if (arg0 != -73) {
            field7250 = 1.3506109F;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Z")
    public final boolean method682(boolean arg0) {
        if (!arg0) {
            this.method132(-31);
        }
        ++field7230;
        return this.field7251.method265(35);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)I")
    public final int method685(int arg0) {
        ++field7235;
        return arg0 != 4657 ? -76 : this.field7251.field471;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(Z)I")
    public final int method128(boolean arg0) {
        ++field7233;
        return arg0 ? -32 : this.field7251.method270((byte) -102);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILmg;)V")
    public final void method2947(int arg0, class150 arg1) {
        this.field7251.method268(arg1, arg0 ^ -2169);
        if (arg0 != 2048) {
            this.field7243 = null;
        }
        ++field7252;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lha;I)V")
    public final void method679(class60 arg0, int arg1) {
        this.field7251.method259(arg0, arg1 + -24343);
        ++field7247;
        if (arg1 != 24447) {
            this.method162((class176) null, (byte) 16, true, -102, (class60) null, 75, -43);
        }
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)Z")
    public final boolean method123(int arg0) {
        int var2 = 122 % ((-76 - arg0) / 47);
        ++field7231;
        return false;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)I")
    public final int method686(byte arg0) {
        if (arg0 != 20) {
            this.field7243 = null;
        }
        ++field7248;
        return this.field7251.field439;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
    public final void method681(byte arg0) {
        if (arg0 == -96) {
            ++field7241;
        }
    }

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "(I)I")
    public final int method132(int arg0) {
        ++field7238;
        if (arg0 != 0) {
            this.method679((class60) null, 53);
        }
        return this.field7251.method266((byte) 127);
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(B)Z")
    public final boolean method157(byte arg0) {
        ++field7240;
        if (arg0 > -70) {
            this.method681((byte) 39);
        }
        return false;
    }

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "(B)V")
    public static void method2948(byte arg0) {
        field7246 = null;
        if (arg0 < 19) {
            method2948((byte) 70);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(Lha;I)Lbd;")
    public final class62 method127(class60 arg0, int arg1) {
        ++field7239;
        class472 var3 = this.field7251.method264(-1, false, 2048, arg0, true);
        if (var3 == null) {
            return null;
        } else {
            class10 var4 = arg0.method410();
            var4.method33(super.field2170, super.field2178, super.field2165);
            class62 var5 = class413.method2384(1, (byte) -47, this.field7242);
            int var6 = super.field2170 >> 9;
            int var7 = super.field2165 >> 9;
            this.field7251.method262(var3, var6, var7, var4, true, var6, arg0, false, var7);
            if (class670.field9312) {
                var3.method243(var4, var5.field678[0], class661.field9249, 0);
            } else {
                var3.method230(var4, var5.field678[0], 0);
            }
            if (arg1 > -12) {
                field7250 = 0.4871182F;
            }
            if (this.field7251.field474 != null) {
                class583 var8 = this.field7251.field474.method3116();
                if (!class670.field9312) {
                    arg0.method452(var8);
                } else {
                    arg0.method397(var8, class661.field9249);
                }
            }
            this.field7245 = var3.method219() || this.field7251.field474 != null;
            if (this.field7243 == null) {
                this.field7243 = class185.method1041(super.field2178, super.field2170, var3, super.field2165, 4);
            } else {
                class412.method2379(super.field2178, super.field2170, 18, super.field2165, var3, this.field7243);
            }
            return var5;
        }
    }
}

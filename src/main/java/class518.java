import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class518 extends class6 implements class392 {

    @OriginalMember(owner = "client!np", name = "ob", descriptor = "Z")
    private boolean field7092 = false;

    @OriginalMember(owner = "client!np", name = "jb", descriptor = "Lek;")
    public class535 field7087;

    @OriginalMember(owner = "client!np", name = "Y", descriptor = "Z")
    private boolean field7076;

    @OriginalMember(owner = "client!np", name = "Q", descriptor = "[I")
    public static int[] field7068 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!np", name = "R", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!np", name = "S", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!np", name = "T", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!np", name = "U", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!np", name = "V", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!np", name = "W", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!np", name = "X", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!np", name = "Z", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!np", name = "ab", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!np", name = "bb", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!np", name = "cb", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!np", name = "db", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!np", name = "fb", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!np", name = "gb", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!np", name = "hb", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!np", name = "ib", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!np", name = "kb", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!np", name = "lb", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!np", name = "mb", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!np", name = "nb", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!np", name = "pb", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!np", name = "qb", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!np", name = "eb", descriptor = "Lel;")
    private class574 field7082;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I", line = 4)
    public final int method17(int arg0) {
        if (arg0 != -2132) {
            return -16;
        } else {
            ++field7094;
            return this.field7087.field7293;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lha;B)Lel;", line = 20)
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            method3001(76);
        }
        ++field7073;
        return this.field7082;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lha;Lwea;ZIIII)V", line = 32)
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= -16) {
            this.field7092 = false;
        }
        ++field7086;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Lha;I)V", line = 43)
    public final void method20(class65 arg0, int arg1) {
        this.field7087.method3066((byte) -121, arg0);
        if (arg1 == -4947) {
            ++field7078;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lib;I)Z", line = 54)
    public static final boolean method3000(class164 arg0, int arg1) {
        if (arg1 != -12764) {
            return true;
        } else {
            ++field7077;
            return class739.field10203 == arg0 || class469.field6504 == arg0 || class165.field2232 == arg0 || class176.field2349 == arg0 || class447.field6265 == arg0;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I", line = 66)
    public final int method18(int arg0) {
        ++field7079;
        if (arg0 != -10908) {
            this.method21(-61);
        }
        return this.field7087.field7283;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I", line = 78)
    public final int method31(int arg0) {
        if (arg0 != -23356) {
            return -41;
        } else {
            ++field7089;
            return this.field7087.field7278;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIILha;)Z", line = 89)
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        ++field7088;
        class500 var5 = this.field7087.method3054(true, arg3, false, 131072, false);
        if (var5 == null) {
            return false;
        } else if (arg0 != 4161) {
            return true;
        } else {
            class303 var6 = arg3.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            return class200.field2658 ? var5.method311(arg2, arg1, var6, false, 0, class330.field4773) : var5.method291(arg2, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)Z", line = 110)
    public final boolean method30(int arg0) {
        if (arg0 <= 59) {
            this.method20((class65) null, 59);
        }
        ++field7083;
        return this.field7087.method3065(-1);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILha;)Ldfa;", line = 122)
    public final class176 method22(int arg0, class65 arg1) {
        ++field7091;
        class500 var3 = this.field7087.method3054(true, arg1, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class303 var4 = arg1.method450();
            var4.method981(super.field2257, super.field2246, super.field2259);
            class176 var5 = class567.method3167(this.field7076, 0, 1);
            if (arg0 != -10) {
                return null;
            } else {
                int var6 = super.field2257 >> 9;
                int var7 = super.field2259 >> 9;
                this.field7087.method3061(arg1, true, var6, var7, var7, var6, var4, var3, (byte) 86);
                if (class200.field2658) {
                    var3.method300(var4, var5.field2345[0], class330.field4773, 0);
                } else {
                    var3.method292(var4, var5.field2345[0], 0);
                }
                if (this.field7087.field7277 != null) {
                    class515 var8 = this.field7087.field7277.method3671();
                    if (class200.field2658) {
                        arg1.method532(var8, class330.field4773);
                    } else {
                        arg1.method524(var8);
                    }
                }
                this.field7092 = var3.method326() || this.field7087.field7277 != null;
                if (this.field7082 == null) {
                    this.field7082 = class321.method2038(-23545, var3, super.field2259, super.field2257, super.field2246);
                } else {
                    class419.method2584(var3, this.field7082, super.field2246, super.field2259, super.field2257, arg0 ^ -9);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "k", descriptor = "(I)Z", line = 175)
    public final boolean method21(int arg0) {
        ++field7090;
        return arg0 != 0 ? false : this.field7092;
    }

    @OriginalMember(owner = "client!np", name = "j", descriptor = "(I)V", line = 186)
    public final void method66(int arg0) {
        ++field7085;
        if (arg0 != -13514) {
            field7072 = 26;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLha;)V", line = 198)
    public final void method32(byte arg0, class65 arg1) {
        ++field7069;
        if (arg0 <= 69) {
            this.field7076 = true;
        }
        class500 var3 = this.field7087.method3054(true, arg1, true, 262144, true);
        if (var3 != null) {
            int var4 = super.field2257 >> 9;
            int var5 = super.field2259 >> 9;
            class303 var6 = arg1.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            this.field7087.method3061(arg1, false, var4, var5, var5, var4, var6, var3, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!np", name = "m", descriptor = "(I)I", line = 223)
    public final int method24(int arg0) {
        if (arg0 != 748449288) {
            method3001(-108);
        }
        ++field7071;
        return this.field7087.method3056((byte) -116);
    }

    @OriginalMember(owner = "client!np", name = "n", descriptor = "(I)Z", line = 235)
    public final boolean method59(int arg0) {
        if (arg0 != -1) {
            this.method18(-21);
        }
        ++field7070;
        return false;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lha;I)V", line = 246)
    public final void method34(class65 arg0, int arg1) {
        this.field7087.method3063(arg1 ^ -9850, arg0);
        if (arg1 != -4351) {
            this.method22(60, (class65) null);
        }
        ++field7081;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V", line = 258)
    public final void method25(int arg0) {
        ++field7074;
        if (arg0 != 14667) {
            field7068 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "q", descriptor = "(I)V", line = 275)
    public static void method3001(int arg0) {
        int var1 = 86 % ((arg0 - 9) / 54);
        field7068 = null;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZII)V", line = 286)
    public class518(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field7868);
        this.field7087 = new class535(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field7076 = ~arg1.field7933 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!np", name = "h", descriptor = "(I)Z", line = 296)
    public final boolean method19(int arg0) {
        if (arg0 > -87) {
            this.field7092 = true;
        }
        ++field7084;
        return false;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lhj;Z)V", line = 308)
    public final void method3002(class596 arg0, boolean arg1) {
        if (!arg1) {
            ++field7075;
            this.field7087.method3060(-1090, arg0);
        }
    }

    @OriginalMember(owner = "client!np", name = "l", descriptor = "(I)I", line = 319)
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            this.field7076 = false;
        }
        ++field7080;
        return this.field7087.method3057((byte) 117);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lsaa;III)V", line = 330)
    public static final void method3003(class347 arg0, int arg1, int arg2, int arg3) {
        int var4 = -94 / ((arg3 - -18) / 60);
        ++field7093;
        class73.field1031[arg1][arg2] = arg0;
    }
}

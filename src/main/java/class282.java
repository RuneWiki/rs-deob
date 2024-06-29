import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class282 extends class319 implements class392 {

    @OriginalMember(owner = "client!wja", name = "qb", descriptor = "Z")
    private boolean field4169 = false;

    @OriginalMember(owner = "client!wja", name = "fb", descriptor = "Lek;")
    public class535 field4158;

    @OriginalMember(owner = "client!wja", name = "db", descriptor = "Z")
    private boolean field4156;

    @OriginalMember(owner = "client!wja", name = "Y", descriptor = "F")
    public static float field4151 = 1024.0F;

    @OriginalMember(owner = "client!wja", name = "eb", descriptor = "F")
    public static float field4157 = 0.0F;

    @OriginalMember(owner = "client!wja", name = "Z", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!wja", name = "ab", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!wja", name = "bb", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!wja", name = "cb", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!wja", name = "gb", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!wja", name = "hb", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!wja", name = "ib", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!wja", name = "jb", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!wja", name = "kb", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!wja", name = "mb", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!wja", name = "nb", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!wja", name = "ob", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!wja", name = "pb", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!wja", name = "rb", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!wja", name = "sb", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!wja", name = "tb", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!wja", name = "ub", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!wja", name = "vb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!wja", name = "wb", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!wja", name = "lb", descriptor = "Lel;")
    private class574 field4164;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lha;Lwea;ZIIII)V", line = 8)
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4152;
        if (arg3 <= -16) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wja", name = "n", descriptor = "(I)Z", line = 19)
    public final boolean method59(int arg0) {
        ++field4174;
        if (arg0 != -1) {
            this.method25(-39);
        }
        return false;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)I", line = 30)
    public final int method18(int arg0) {
        ++field4175;
        return arg0 != -10908 ? 104 : this.field4158.field7283;
    }

    @OriginalMember(owner = "client!wja", name = "k", descriptor = "(I)Z", line = 43)
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field4155;
            return this.field4169;
        }
    }

    @OriginalMember(owner = "client!wja", name = "l", descriptor = "(I)I", line = 56)
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            return -33;
        } else {
            ++field4162;
            return this.field4158.method3057((byte) 110);
        }
    }

    @OriginalMember(owner = "client!wja", name = "d", descriptor = "(I)Z", line = 68)
    public final boolean method30(int arg0) {
        ++field4161;
        return arg0 < 59 ? true : this.field4158.method3065(-1);
    }

    @OriginalMember(owner = "client!wja", name = "e", descriptor = "(I)I", line = 83)
    public final int method31(int arg0) {
        ++field4165;
        if (arg0 != -23356) {
            this.field4164 = null;
        }
        return this.field4158.field7278;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lha;B)Lel;", line = 94)
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            this.method27((class65) null, (byte) -116);
        }
        ++field4153;
        return this.field4164;
    }

    @OriginalMember(owner = "client!wja", name = "j", descriptor = "(I)V", line = 106)
    public final void method66(int arg0) {
        if (arg0 != -13514) {
            field4151 = 0.17539486F;
        }
        ++field4173;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(ILha;)Ldfa;", line = 118)
    public final class176 method22(int arg0, class65 arg1) {
        ++field4154;
        class500 var3 = this.field4158.method3054(true, arg1, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -10) {
                this.field4158 = null;
            }
            class303 var4 = arg1.method450();
            var4.method981(super.field2257, super.field2246, super.field2259);
            class176 var5 = class567.method3167(this.field4156, arg0 + 10, 1);
            this.field4158.method3061(arg1, true, super.field4595, super.field4585, super.field4590, super.field4600, var4, var3, (byte) 91);
            if (!class200.field2658) {
                var3.method292(var4, var5.field2345[0], 0);
            } else {
                var3.method300(var4, var5.field2345[0], class330.field4773, 0);
            }
            if (this.field4158.field7277 != null) {
                class515 var6 = this.field4158.field7277.method3671();
                if (!class200.field2658) {
                    arg1.method524(var6);
                } else {
                    arg1.method532(var6, class330.field4773);
                }
            }
            this.field4169 = var3.method326() || this.field4158.field7277 != null;
            if (this.field4164 != null) {
                class419.method2584(var3, this.field4164, super.field2246, super.field2259, super.field2257, 1);
            } else {
                this.field4164 = class321.method2038(arg0 + -23535, var3, super.field2259, super.field2257, super.field2246);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(Lha;I)V", line = 172)
    public final void method20(class65 arg0, int arg1) {
        if (arg1 != -4947) {
            this.field4164 = null;
        }
        ++field4159;
        this.field4158.method3066((byte) -119, arg0);
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lha;I)V", line = 183)
    public final void method34(class65 arg0, int arg1) {
        if (arg1 != -4351) {
            this.method25(87);
        }
        ++field4168;
        this.field4158.method3063(arg1 + 18310, arg0);
    }

    @OriginalMember(owner = "client!wja", name = "h", descriptor = "(I)Z", line = 196)
    public final boolean method19(int arg0) {
        ++field4167;
        if (arg0 > -87) {
            this.field4156 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(BLha;)V", line = 207)
    public final void method32(byte arg0, class65 arg1) {
        if (arg0 <= 69) {
            field4151 = 0.9856351F;
        }
        ++field4166;
        class500 var3 = this.field4158.method3054(true, arg1, true, 262144, true);
        if (var3 != null) {
            class303 var4 = arg1.method450();
            var4.method981(super.field2257, super.field2246, super.field2259);
            this.field4158.method3061(arg1, false, super.field4595, super.field4585, super.field4590, super.field4600, var4, var3, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZIIIIIII)V", line = 233)
    public class282(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field7897 == -2, class526.method3033(arg13, (byte) 110, arg12));
        this.field4158 = new class535(arg0, arg1, arg12, arg13, super.field2250, arg3, this, arg7, arg14);
        this.field4156 = ~arg1.field7933 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lhj;I)V", line = 248)
    public final void method1814(class596 arg0, int arg1) {
        if (arg1 > -94) {
            this.field4156 = false;
        }
        ++field4172;
        this.field4158.method3060(-1090, arg0);
    }

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)V", line = 259)
    public final void method25(int arg0) {
        if (arg0 != 14667) {
            this.field4169 = false;
        }
        ++field4171;
    }

    @OriginalMember(owner = "client!wja", name = "m", descriptor = "(I)I", line = 269)
    public final int method24(int arg0) {
        ++field4163;
        if (arg0 != 748449288) {
            this.field4158 = null;
        }
        return this.field4158.method3056((byte) -118);
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIILha;)Z", line = 281)
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        ++field4170;
        class500 var5 = this.field4158.method3054(true, arg3, false, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class303 var6 = arg3.method450();
            if (arg0 != 4161) {
                this.method25(123);
            }
            var6.method981(super.field2257, super.field2246, super.field2259);
            return class200.field2658 ? var5.method311(arg2, arg1, var6, false, 0, class330.field4773) : var5.method291(arg2, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)I", line = 301)
    public final int method17(int arg0) {
        ++field4160;
        return arg0 != -2132 ? 29 : this.field4158.field7293;
    }
}

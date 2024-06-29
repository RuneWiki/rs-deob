import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class507 extends class212 {

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lej;")
    public static class124 field7050 = new class124(0, 0);

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field7055 = 1337;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "F")
    public static float field7057;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ILdh;)V", line = 3)
    public class507(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZIBIII)V", line = 8)
    public static final void method2976(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 > -85) {
            method2978(-14, 70, 13, -100);
        }
        ++field7052;
        if (~(arg2 ? class693.field9368.field4412.method820(-32350) : class693.field9368.field4469.method820(-32350)) != -1 && arg5 != 0 && ~class649.field8920 > -51 && arg0 != -1) {
            class429.field6148[class649.field8920++] = new class456((byte) (!arg2 ? 2 : 3), arg0, arg5, arg7, arg1, arg3, arg6, (class404) null);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 27)
    public final void method418(boolean arg0) {
        ++field7053;
        if (arg0) {
            this.method419(-34, -61);
        }
        if (~super.field3006 > -1 || ~super.field3006 < -5) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 41)
    public static final void method2977(int arg0) {
        ++field7047;
        class564.method3271(class272.field3822, (byte) 105, (long) class641.field8810);
        if (arg0 != 85) {
            field7055 = -99;
        }
        if (class184.field2784 != -1) {
            class165.method1246(class184.field2784, (byte) 118);
        }
        for (int var1 = 0; ~var1 > ~class697.field9413; ++var1) {
            if (class286.field3995[var1]) {
                class521.field7232[var1] = true;
            }
            class195.field2885[var1] = class286.field3995[var1];
            class286.field3995[var1] = false;
        }
        class273.field3844 = class641.field8810;
        if (class184.field2784 != -1) {
            class697.field9413 = 0;
            class526.method3044(false);
        }
        class272.field3822.method305();
        class336.method2127((byte) 77, class272.field3822);
        int var2 = class724.method4015(3112);
        if (~var2 == 0) {
            var2 = class130.field2184;
        }
        if (var2 == -1) {
            var2 = class421.field6075;
        }
        class529.method3057(0, var2);
        class322.field4464 = 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 91)
    public final void method419(int arg0, int arg1) {
        ++field7051;
        super.field3006 = arg1;
        int var3 = -17 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIII)I", line = 102)
    public static final int method2978(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 56 / ((arg0 - 74) / 43);
        ++field7059;
        if ((8 & class607.field8331[arg1][arg3][arg2]) != 0) {
            return 0;
        } else {
            return ~arg1 < -1 && (2 & class607.field8331[1][arg3][arg2]) != 0 ? arg1 + -1 : arg1;
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 122)
    public static void method2979(int arg0) {
        field7050 = null;
        if (arg0 != -15596) {
            method2979(-92);
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)I", line = 135)
    public final int method2980(int arg0) {
        ++field7054;
        if (arg0 != -32350) {
            method2979(18);
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I", line = 148)
    public final int method417(int arg0, int arg1) {
        ++field7048;
        if (arg0 != 3) {
            this.method422(-95);
        }
        return 1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(CII)C", line = 162)
    public static final char method2981(char arg0, int arg1, int arg2) {
        ++field7058;
        if (arg0 >= 192 && arg0 <= 255) {
            if (arg0 >= 192 && ~arg0 >= -199) {
                return 'A';
            }
            if (~arg0 == -200) {
                return 'C';
            }
            if (arg0 >= 200 && arg0 <= 203) {
                return 'E';
            }
            if (~arg0 <= -205 && arg0 <= 207) {
                return 'I';
            }
            if (~arg0 <= -211 && arg0 <= 214) {
                return 'O';
            }
            if (~arg0 <= -218 && ~arg0 >= -221) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (arg0 == 223) {
                return 's';
            }
            if (~arg0 <= -225 && ~arg0 >= -231) {
                return 'a';
            }
            if (arg0 == 231) {
                return 'c';
            }
            if (~arg0 <= -233 && arg0 <= 235) {
                return 'e';
            }
            if (arg0 >= 236 && arg0 <= 239) {
                return 'i';
            }
            if (arg0 >= 242 && arg0 <= 246) {
                return 'o';
            }
            if (arg0 >= 249 && ~arg0 >= -253) {
                return 'u';
            }
            if (arg0 == 253 || arg0 == 255) {
                return 'y';
            }
        }
        if (arg2 != 105) {
            field7050 = null;
        }
        if (~arg0 == -339) {
            return 'O';
        } else if (arg0 == 339) {
            return 'o';
        } else if (arg0 == 376) {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BILin;)Loea;", line = 249)
    public static final class597 method2982(byte arg0, int arg1, class91 arg2) {
        ++field7056;
        if (arg0 >= -24) {
            return null;
        } else {
            byte[] var3 = arg2.method868((byte) 73, arg1);
            return var3 == null ? null : new class597(var3);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I", line = 266)
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            return 118;
        } else {
            ++field7049;
            return 3;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ldh;)V", line = 278)
    public class507(class322 arg0) {
        super(arg0);
    }
}

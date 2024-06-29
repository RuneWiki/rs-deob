import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class515 extends class530 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        ++field7183;
        return arg0 != 0 ? 51 : 2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (super.field7418.field5129.method1633((byte) 107) && super.field7419 == 2) {
            super.field7419 = 1;
        }
        ++field7190;
        if (!arg0) {
            field7186 = 15;
        }
        if (super.field7419 < 0 || ~super.field7419 < -3) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ILah;)V")
    public class515(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lfj;")
    public static final class656 method3068(int arg0) {
        ++field7185;
        if (arg0 != 253) {
            field7186 = 34;
        }
        class656 var1 = (class656) class492.field6800.method1952(-49);
        if (var1 != null) {
            --class654.field9228;
            return var1;
        } else {
            return new class656();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lha;II)Lcw;")
    public static final class21 method3069(class545 arg0, int arg1, int arg2) {
        ++field7192;
        class192 var3 = (class192) class63.field842.method1381(true, (long) arg1);
        if (arg2 != -253) {
            method3069((class545) null, -66, 77);
        }
        if (var3 != null) {
            class424 var4 = var3.field2791.method3848(true);
            var3.field2783 = true;
            if (var4 != null) {
                return var4.method2587(arg0, 92);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBC)C")
    public static final char method3070(int arg0, byte arg1, char arg2) {
        ++field7191;
        if (~arg2 <= -193 && arg2 <= 255) {
            if (arg2 >= 192 && arg2 <= 198) {
                return 'A';
            }
            if (~arg2 == -200) {
                return 'C';
            }
            if (~arg2 <= -201 && arg2 <= 203) {
                return 'E';
            }
            if (~arg2 <= -205 && ~arg2 >= -208) {
                return 'I';
            }
            if (~arg2 <= -211 && ~arg2 >= -215) {
                return 'O';
            }
            if (~arg2 <= -218 && ~arg2 >= -221) {
                return 'U';
            }
            if (~arg2 == -222) {
                return 'Y';
            }
            if (arg2 == 223) {
                return 's';
            }
            if (~arg2 <= -225 && ~arg2 >= -231) {
                return 'a';
            }
            if (arg2 == 231) {
                return 'c';
            }
            if (~arg2 <= -233 && arg2 <= 235) {
                return 'e';
            }
            if (~arg2 <= -237 && ~arg2 >= -240) {
                return 'i';
            }
            if (arg2 >= 242 && ~arg2 >= -247) {
                return 'o';
            }
            if (arg2 >= 249 && ~arg2 >= -253) {
                return 'u';
            }
            if (arg2 == 253 || ~arg2 == -256) {
                return 'y';
            }
        }
        if (arg2 == 338) {
            return 'O';
        } else if (arg2 == 339) {
            return 'o';
        } else if (~arg2 == -377) {
            return 'Y';
        } else {
            int var3 = -120 / ((arg1 - -42) / 40);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        if (arg1 <= -38) {
            super.field7419 = arg0;
            ++field7184;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field7187;
        int var3 = 85 / ((63 - arg1) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)I")
    public final int method3071(int arg0) {
        ++field7189;
        if (arg0 != 0) {
            field7188 = 66;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lah;)V")
    public class515(class374 arg0) {
        super(arg0);
    }
}

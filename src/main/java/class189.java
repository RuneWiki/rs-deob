import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class189 extends class264 {

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field2820 = -1;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lmfa;)V")
    public class189(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field2821;
        if (arg0 != 112) {
            this.method666((byte) 50, -12);
        }
        return !class185.method1379(super.field3731.field9002.method2258((byte) -69), 111) ? 3 : 1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZC)C")
    public static final char method1396(boolean arg0, char arg1) {
        if (!arg0) {
            field2820 = 113;
        }
        ++field2827;
        if (~arg1 != -33 && ~arg1 != -161 && ~arg1 != -96 && arg1 != '-') {
            if (arg1 != '[' && ~arg1 != -94 && arg1 != '#') {
                if (~arg1 != -225 && ~arg1 != -226 && ~arg1 != -227 && arg1 != 228 && ~arg1 != -228 && ~arg1 != -193 && ~arg1 != -194 && ~arg1 != -195 && arg1 != 196 && ~arg1 != -196) {
                    if (arg1 != 232 && ~arg1 != -234 && arg1 != 234 && ~arg1 != -236 && arg1 != 200 && ~arg1 != -202 && ~arg1 != -203 && ~arg1 != -204) {
                        if (~arg1 != -238 && ~arg1 != -239 && ~arg1 != -240 && ~arg1 != -206 && ~arg1 != -207 && arg1 != 207) {
                            if (~arg1 != -243 && arg1 != 243 && arg1 != 244 && arg1 != 246 && arg1 != 245 && arg1 != 210 && arg1 != 211 && arg1 != 212 && arg1 != 214 && arg1 != 213) {
                                if (~arg1 != -250 && ~arg1 != -251 && arg1 != 251 && ~arg1 != -253 && ~arg1 != -218 && arg1 != 218 && arg1 != 219 && arg1 != 220) {
                                    if (arg1 != 231 && ~arg1 != -200) {
                                        if (~arg1 != -256 && ~arg1 != -377) {
                                            if (arg1 != 241 && ~arg1 != -210) {
                                                return ~arg1 == -224 ? 'b' : Character.toLowerCase(arg1);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg1;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            field2820 = 75;
        }
        ++field2825;
        return 0;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)Z")
    public final boolean method1397(int arg0) {
        ++field2823;
        if (!class185.method1379(super.field3731.field9002.method2258((byte) -121), 114)) {
            return false;
        } else {
            if (arg0 != 14996) {
                field2820 = -11;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)V")
    public static final void method1398(byte arg0) {
        ++field2822;
        int[] var1 = new int[class526.field7490.field8812];
        int var2 = 0;
        for (int var3 = 0; var3 < class526.field7490.field8812; ++var3) {
            class501 var5 = class526.field7490.method3567(var3, true);
            if (~var5.field7100 <= -1 || var5.field7103 >= 0) {
                var1[var2++] = var3;
            }
        }
        class784.field10779 = new int[var2];
        for (int var4 = 0; var4 < var2; ++var4) {
            class784.field10779[var4] = var1[var4];
        }
        if (arg0 > -44) {
            method1398((byte) 90);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(ILmfa;)V")
    public class189(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)I")
    public final int method1399(byte arg0) {
        ++field2826;
        if (arg0 >= -31) {
            method1398((byte) -54);
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field2824;
        int var2 = -93 % ((1 - arg0) / 41);
        if (super.field3731.field9002.method2259(-1) && !class185.method1379(super.field3731.field9002.method2258((byte) -105), 121)) {
            super.field3733 = 0;
        }
        if (~super.field3733 > -1 || ~super.field3733 < -3) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        ++field2828;
        if (arg0 > -114) {
            field2820 = 16;
        }
    }
}

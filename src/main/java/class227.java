import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class227 extends class166 {

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "Lta;")
    public static class241 field4133 = new class241(4);

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Lhj;")
    public static class69 field4140 = class181.method1318(" )2> <col=00ffff>", (byte) -124);

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field4138 = 0;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lhj;")
    private static class69 field4142 = class181.method1318("", (byte) -117);

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "Z")
    public static boolean field4141 = false;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field4143 = 0;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lhj;")
    public static class69 field4144 = field4142;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lhj;")
    public static class69 field4145 = class181.method1318("Versteckt", (byte) -108);

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "Ld;")
    public static class225 field4139;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLtk;I)Lhj;")
    public static final class69 method1621(boolean arg0, class50 arg1, int arg2) {
        ++field4137;
        if (!class8.method36(client.method1141(arg1), 97, arg2) && arg1.field777 == null) {
            return null;
        } else {
            if (arg0) {
                method1624((byte) -19);
            }
            if (arg1.field742 != null && arg1.field742.length > arg2 && arg1.field742[arg2] != null && ~arg1.field742[arg2].method442(-67).method441((byte) 73) != -1) {
                return arg1.field742[arg2];
            } else {
                return class88.field1684 ? class9.method42(-78, new class69[] { class258.field4638, class98.method727(-229, arg2) }) : null;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int var4 = class13.field187[arg0];
            for (int var5 = 0; var5 < class253.field4565; ++var5) {
                var3[var5] = this.method1625(class24.field347[var5], var4, arg1 + -8400398) % 4096;
            }
        }
        ++field4136;
        if (arg1 != 8388607) {
            field4145 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lkk;I)V")
    public static final void method1622(class222 arg0, int arg1) {
        ++field4134;
        arg0.field3996 = arg0.field3982;
        if (~arg0.field4021 == -1) {
            arg0.field4011 = 0;
        } else {
            if (~arg0.field4010 != 0 && arg0.field4006 == 0) {
                class159 var2 = class211.method1521(-121, arg0.field4010);
                if (arg0.field4009 > 0 && var2.field2965 == 0) {
                    ++arg0.field4011;
                    return;
                }
                if (arg0.field4009 <= 0 && ~var2.field2970 == -1) {
                    ++arg0.field4011;
                    return;
                }
            }
            int var3 = arg0.field3985;
            int var4 = arg0.field4005;
            int var5 = arg0.field3998[arg0.field4021 + -1] * 128 - -(arg0.method813(arg1 + 15964) * 64);
            int var6 = arg0.field4046[arg0.field4021 + arg1] * 128 + 64 * arg0.method813(15963);
            if (~(-var3 + var5) >= -257 && -var3 + var5 >= -256 && ~(-var4 + var6) >= -257 && var6 - var4 >= -256) {
                if (var3 >= var5) {
                    if (~var5 <= ~var3) {
                        if (var6 <= var4) {
                            if (~var4 < ~var6) {
                                arg0.field4052 = 0;
                            }
                        } else {
                            arg0.field4052 = 1024;
                        }
                    } else if (~var4 <= ~var6) {
                        if (var4 <= var6) {
                            arg0.field4052 = 512;
                        } else {
                            arg0.field4052 = 256;
                        }
                    } else {
                        arg0.field4052 = 768;
                    }
                } else if (~var6 >= ~var4) {
                    if (~var6 > ~var4) {
                        arg0.field4052 = 1792;
                    } else {
                        arg0.field4052 = 1536;
                    }
                } else {
                    arg0.field4052 = 1280;
                }
                int var7 = 4;
                int var8 = arg0.field4026;
                boolean var9 = true;
                int var10 = -arg0.field4003 + arg0.field4052 & 2047;
                if (var10 > 1024) {
                    var10 -= 2048;
                }
                if (var10 >= -256 && var10 <= 256) {
                    var8 = arg0.field3999;
                } else if (var10 >= 256 && ~var10 > -769) {
                    var8 = arg0.field4049;
                } else if (~var10 <= 767 && var10 <= -256) {
                    var8 = arg0.field4045;
                }
                if (var8 == -1) {
                    var8 = arg0.field3999;
                }
                arg0.field3996 = var8;
                if (arg0 instanceof class38) {
                    var9 = ((class38) arg0).field517.field3387;
                }
                if (!var9) {
                    if (~arg0.field4021 < -2) {
                        var7 = 6;
                    }
                    if (~arg0.field4021 < -3) {
                        var7 = 8;
                    }
                    if (arg0.field4011 > 0 && arg0.field4021 > 1) {
                        --arg0.field4011;
                        var7 = 8;
                    }
                } else {
                    if (arg0.field4052 != arg0.field4003 && arg0.field4025 == -1 && ~arg0.field3984 != -1) {
                        var7 = 2;
                    }
                    if (~arg0.field4021 < -3) {
                        var7 = 6;
                    }
                    if (~arg0.field4021 < -4) {
                        var7 = 8;
                    }
                    if (arg0.field4011 > 0 && ~arg0.field4021 < -2) {
                        var7 = 8;
                        --arg0.field4011;
                    }
                }
                if (arg0.field4019[arg0.field4021 - 1]) {
                    var7 <<= 1;
                }
                if (var7 >= 8 && ~arg0.field3999 == ~arg0.field3996 && arg0.field3988 != -1) {
                    arg0.field3996 = arg0.field3988;
                }
                if (var6 <= var4) {
                    if (var6 < var4) {
                        arg0.field4005 -= var7;
                        if (~arg0.field4005 > ~var6) {
                            arg0.field4005 = var6;
                        }
                    }
                } else {
                    arg0.field4005 += var7;
                    if (~arg0.field4005 < ~var6) {
                        arg0.field4005 = var6;
                    }
                }
                if (~var5 >= ~var3) {
                    if (var5 < var3) {
                        arg0.field3985 -= var7;
                        if (~arg0.field3985 > ~var5) {
                            arg0.field3985 = var5;
                        }
                    }
                } else {
                    arg0.field3985 += var7;
                    if (~arg0.field3985 < ~var5) {
                        arg0.field3985 = var5;
                    }
                }
                if (arg0.field3985 == var5 && ~arg0.field4005 == ~var6) {
                    --arg0.field4021;
                    if (arg0.field4009 > 0) {
                        --arg0.field4009;
                        return;
                    }
                }
            } else {
                arg0.field3985 = var5;
                arg0.field4005 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILok;)I")
    public static final int method1623(int arg0, class38 arg1) {
        ++field4135;
        class186 var2 = arg1.field517;
        if (arg0 > -124) {
            return -50;
        } else {
            if (var2.field3375 != null) {
                var2 = var2.method1358((byte) -36);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field3382;
            if (arg1.field3996 != arg1.field3982) {
                if (~arg1.field3996 == ~arg1.field3988) {
                    var3 = var2.field3343;
                }
            } else {
                var3 = var2.field3396;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public static void method1624(byte arg0) {
        field4142 = null;
        field4140 = null;
        field4144 = null;
        field4145 = null;
        field4139 = null;
        field4133 = null;
        if (arg0 < 70) {
            method1623(15, (class38) null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(III)I")
    private final int method1625(int arg0, int arg1, int arg2) {
        ++field4132;
        int var4 = arg0 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        return arg2 != -11791 ? -78 : 4096 - ((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
    }
}

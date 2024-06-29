import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class615 extends class212 {

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)V", line = 3)
    public final void method419(int arg0, int arg1) {
        super.field3006 = arg1;
        ++field8395;
        int var3 = -40 / ((arg0 - 82) / 35);
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)I", line = 13)
    public final int method3484(int arg0) {
        if (arg0 != -32350) {
            field8404 = 39;
        }
        ++field8402;
        return super.field3006;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIZI)V", line = 28)
    public static final void method3485(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field8393;
        if (class722.method4007(arg2, (byte) 84)) {
            class101.method942(false, arg1, arg4, arg3, arg0, class396.field5798[arg2]);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ldh;)V", line = 40)
    public class615(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)I", line = 45)
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            field8404 = -72;
        }
        ++field8400;
        return 0;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(ILdh;)V", line = 57)
    public class615(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)Z", line = 60)
    public final boolean method3486(int arg0) {
        if (arg0 <= 85) {
            return true;
        } else {
            ++field8394;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIIII)V", line = 73)
    public static final void method3487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -128) {
            method3487(-6, -95, 101, -81, 56, 14, -29, -19);
        }
        ++field8401;
        int var8 = -arg5 + arg1;
        int var9 = arg2 + arg5;
        for (int var10 = arg2; var10 < var9; ++var10) {
            class47.method550(-27, arg3, class691.field9345[var10], arg7, arg0);
        }
        int var11 = -arg5 + arg3;
        int var12 = arg5 + arg7;
        for (int var13 = arg1; var8 < var13; --var13) {
            class47.method550(arg6 + 101, arg3, class691.field9345[var13], arg7, arg0);
        }
        for (int var14 = var9; ~var8 <= ~var14; ++var14) {
            int[] var15 = class691.field9345[var14];
            class47.method550(-27, var12, var15, arg7, arg0);
            class47.method550(-27, var11, var15, var12, arg4);
            class47.method550(-27, arg3, var15, var11, arg0);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)V", line = 118)
    public static final void method3488(int arg0) {
        ++field8396;
        class19 var1 = (class19) class494.field6832.method1269(arg0 ^ 5);
        boolean var2 = class591.field8071 != null || ~class13.field237 < -1;
        int var3 = var1.method143((byte) -128);
        int var4 = var1.method146(119);
        if (var2) {
            class86.field1547 = 1;
        }
        if (!var2) {
            class11.method67((byte) 109, class693.field9372, var4, var3);
        } else {
            class290.field4063 = class693.field9372;
        }
        if (arg0 != 1) {
            method3491(-88, (class59) null, (byte) -126, false);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BI)Z", line = 144)
    public static final boolean method3489(byte arg0, int arg1) {
        ++field8398;
        int var2 = arg0 & 255;
        if (~var2 == -1) {
            return false;
        } else {
            return arg1 < ~var2 || ~var2 <= -161 || ~class211.field3001[var2 + -128] != -1;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V", line = 166)
    public final void method418(boolean arg0) {
        ++field8397;
        if (this.method3492(arg0)) {
            if (super.field3004.field4468.method1100((byte) -97) && !class256.method1738((byte) -94, super.field3004.field4468.method1099(-32350))) {
                super.field3006 = 1;
            }
            if (~super.field3004.field4451.method3495(-32350) == -2) {
                super.field3006 = 1;
            }
        }
        if (~super.field3006 == -4) {
            super.field3006 = 2;
        }
        if (arg0) {
            this.method418(true);
        }
        if (~super.field3006 > -1 || ~super.field3006 < -4) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BI)V", line = 197)
    public static final void method3490(byte arg0, int arg1) {
        ++field8403;
        if (arg0 != -78) {
            method3489((byte) 80, -38);
        }
        class594 var2 = class692.method3869(arg1, (byte) 105, 11);
        var2.method3383(-16058);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)I", line = 210)
    public final int method417(int arg0, int arg1) {
        ++field8399;
        if (class112.method985(arg1, 29)) {
            if (super.field3004.field4468.method1100((byte) -97) && !class256.method1738((byte) -113, super.field3004.field4468.method1099(-32350))) {
                return 3;
            }
            if (~super.field3004.field4451.method3495(-32350) == -2) {
                return 3;
            }
        }
        if (arg0 == arg1) {
            return 3;
        } else {
            return class112.method985(arg1, arg0 ^ 86) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILha;BZ)Lel;", line = 239)
    public static final class547 method3491(int arg0, class59 arg1, byte arg2, boolean arg3) {
        ++field8392;
        if (~arg0 == 0) {
            return null;
        } else {
            if (class669.field9118 != null) {
                for (int var4 = 0; var4 < class669.field9118.length; ++var4) {
                    if (~class669.field9118[var4] == ~arg0) {
                        return class538.field7445[var4];
                    }
                }
            }
            class547 var5 = (class547) class344.field4819.method992((long) arg0, -92);
            if (var5 != null) {
                if (arg3 && var5.field7538 == null) {
                    class597 var6 = class507.method2982((byte) -76, arg0, class281.field3935);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field7538 = var6;
                }
                return var5;
            } else {
                int var7 = -118 / ((-33 - arg2) / 44);
                class267[] var8 = class267.method1782(class428.field6143, arg0);
                if (var8 == null) {
                    return null;
                } else {
                    class597 var9 = class507.method2982((byte) -39, arg0, class281.field3935);
                    if (var9 == null) {
                        return null;
                    } else {
                        class547 var10;
                        if (!arg3) {
                            var10 = new class547(arg1.method216(var9, var8, true));
                        } else {
                            var10 = new class547(arg1.method216(var9, var8, true), var9);
                        }
                        class344.field4819.method991(var10, (long) arg0, (byte) -109);
                        return var10;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)Z", line = 304)
    public final boolean method3492(boolean arg0) {
        if (arg0) {
            field8404 = -86;
        }
        ++field8391;
        return class112.method985(super.field3006, 29);
    }
}

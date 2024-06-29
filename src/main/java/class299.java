import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class299 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBLtc;IIII)V", line = 9)
    public static final void method2062(int arg0, byte arg1, class268 arg2, int arg3, int arg4, int arg5, int arg6) {
        class80.method571(arg2.field4280, arg5, arg3, arg0, 25757, arg6, arg2.field4311, arg4);
        field4848++;
        int var7 = 80 % ((-arg1 - 15) / 36);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLmh;)V", line = 19)
    public static final void method2063(byte arg0, class65 arg1) {
        if (arg0 > 126) {
            field4844++;
            class259.field4139 = arg1;
            class275.field4509 = class259.field4139.method481(17377, 4);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 33)
    public static final void method2064(byte arg0) {
        field4846++;
        if (!class75.method553(arg0 + 23935) && class55.field807 != class5.field58) {
            class272.method1924(class235.field3766, class55.field807, class62.field913.field4341[0], (byte) 60, false, class62.field913.field4306[0], class133.field1990);
            return;
        }
        if (class55.field807 != class289.field4701) {
            class289.field4701 = class55.field807;
            class306.method2111((byte) -100, class55.field807);
            class265.method1874(107);
        }
        if (arg0 != 52) {
            field4841 = -56;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ltc;I)V", line = 66)
    public static final void method2065(class268 arg0, int arg1) {
        field4842++;
        arg0.field4331 = false;
        if (arg0.field4333 != -1) {
            class205 var2 = class285.method2000(arg0.field4333, 4442);
            if (var2 == null || var2.field3323 == null) {
                arg0.field4333 = -1;
            } else {
                arg0.field4293++;
                if (arg0.field4334 < var2.field3323.length && var2.field3331[arg0.field4334] < arg0.field4293) {
                    arg0.field4334++;
                    arg0.field4293 = 1;
                    class148.method1026(arg0.field4311, arg0.field4334, arg0.field4280, var2, arg1 - 14868, class62.field913 == arg0);
                }
                if (var2.field3323.length <= arg0.field4334) {
                    arg0.field4293 = 0;
                    arg0.field4334 = 0;
                    class148.method1026(arg0.field4311, arg0.field4334, arg0.field4280, var2, -127, class62.field913 == arg0);
                }
            }
        }
        if (arg0.field4289 != -1 && class18.field234 >= arg0.field4279) {
            int var3 = class5.method15(arg0.field4289, false).field3545;
            if (var3 == -1) {
                arg0.field4289 = -1;
            } else {
                class205 var4 = class285.method2000(var3, 4442);
                if (var4 == null || var4.field3323 == null) {
                    arg0.field4289 = -1;
                } else {
                    if (arg0.field4320 < 0) {
                        arg0.field4320 = 0;
                        class148.method1026(arg0.field4311, 0, arg0.field4280, var4, arg1 ^ 0x3A35, class62.field913 == arg0);
                    }
                    arg0.field4330++;
                    if (var4.field3323.length > arg0.field4320 && var4.field3331[arg0.field4320] < arg0.field4330) {
                        arg0.field4320++;
                        arg0.field4330 = 1;
                        class148.method1026(arg0.field4311, arg0.field4320, arg0.field4280, var4, arg1 - 14824, class62.field913 == arg0);
                    }
                    if (var4.field3323.length <= arg0.field4320) {
                        arg0.field4289 = -1;
                    }
                }
            }
        }
        if (arg1 != 14875) {
            return;
        }
        if (arg0.field4300 != -1 && arg0.field4292 <= 1) {
            class205 var5 = class285.method2000(arg0.field4300, 4442);
            if (var5.field3310 == 1 && arg0.field4295 > 0 && class18.field234 >= arg0.field4303 && arg0.field4315 < class18.field234) {
                arg0.field4292 = 1;
                return;
            }
        }
        if (arg0.field4300 != -1 && arg0.field4292 == 0) {
            class205 var6 = class285.method2000(arg0.field4300, 4442);
            if (var6 == null || var6.field3323 == null) {
                arg0.field4300 = -1;
            } else {
                arg0.field4288++;
                if (var6.field3323.length > arg0.field4338 && var6.field3331[arg0.field4338] < arg0.field4288) {
                    arg0.field4288 = 1;
                    arg0.field4338++;
                    class148.method1026(arg0.field4311, arg0.field4338, arg0.field4280, var6, 123, class62.field913 == arg0);
                }
                if (var6.field3323.length <= arg0.field4338) {
                    arg0.field4312++;
                    arg0.field4338 -= var6.field3306;
                    if (arg0.field4312 >= var6.field3332) {
                        arg0.field4300 = -1;
                    } else if (arg0.field4338 >= 0 && var6.field3323.length > arg0.field4338) {
                        class148.method1026(arg0.field4311, arg0.field4338, arg0.field4280, var6, -113, class62.field913 == arg0);
                    } else {
                        arg0.field4300 = -1;
                    }
                }
                arg0.field4331 = var6.field3329;
            }
        }
        if (arg0.field4292 > 0) {
            arg0.field4292--;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lmh;BLmh;)V", line = 207)
    public static final void method2066(class65 arg0, byte arg1, class65 arg2) {
        if (arg1 > 0) {
            field4843 = 36;
        }
        field4847++;
        class232.field3666 = arg2;
        class107.field1514 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I", line = 219)
    public static final int method2067(int arg0, int arg1) {
        if (arg0 > -104) {
            method2063((byte) 112, (class65) null);
        }
        field4840++;
        return arg1 & 0xFF;
    }
}

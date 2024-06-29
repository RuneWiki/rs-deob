import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class637 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V", line = 3)
    public static final void method3627(int arg0, int arg1) {
        if (arg1 == -3) {
            class549.field7632 = arg0;
            field8995++;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZII)Z", line = 15)
    public static final boolean method3628(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method3627(96, 15);
        }
        field8996++;
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILfm;III)V", line = 26)
    public static final void method3629(int arg0, class281 arg1, int arg2, int arg3, int arg4) {
        field8994++;
        if (arg2 != 0) {
            method3628(true, 81, 75);
        }
        class31 var5 = arg1.method1783(true);
        int var6 = arg1.field4076 - arg1.field4067.field4287 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg1.field4119 > 25) {
                if (arg4 < 0 && var5.field353 != -1) {
                    arg1.field4109 = false;
                    arg1.field4040 = var5.field353;
                } else if (arg4 <= 0 || var5.field357 == -1) {
                    arg1.field4040 = var5.field338;
                } else {
                    arg1.field4040 = var5.field357;
                }
                arg1.field4109 = false;
            } else if (!arg1.field4109 || !var5.method260(arg1.field4040, arg2 + 23916)) {
                arg1.field4040 = var5.method257(88);
                arg1.field4109 = arg1.field4040 != -1;
            }
        } else if (arg1.field4054 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class216.field3151[arg0] - arg1.field4067.field4287 & 0x3FFF;
            arg1.field4109 = false;
            if (arg3 == 2 && var5.field388 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field385 != -1) {
                    arg1.field4040 = var5.field385;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field355 != -1) {
                    arg1.field4040 = var5.field355;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field347 == -1) {
                    arg1.field4040 = var5.field388;
                } else {
                    arg1.field4040 = var5.field347;
                }
            } else if (arg3 == 0 && var5.field344 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field359 != -1) {
                    arg1.field4040 = var5.field359;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field341 != -1) {
                    arg1.field4040 = var5.field341;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field368 == -1) {
                    arg1.field4040 = var5.field344;
                } else {
                    arg1.field4040 = var5.field368;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field371 != -1) {
                arg1.field4040 = var5.field371;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field365 != -1) {
                arg1.field4040 = var5.field365;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field337 == -1) {
                arg1.field4040 = var5.field338;
            } else {
                arg1.field4040 = var5.field337;
            }
        } else if (var6 == 0 && arg1.field4119 <= 25) {
            if (arg3 == 2 && var5.field388 != -1) {
                arg1.field4040 = var5.field388;
            } else if (arg3 == 0 && var5.field344 != -1) {
                arg1.field4040 = var5.field344;
            } else {
                arg1.field4040 = var5.field338;
            }
            arg1.field4109 = false;
        } else {
            if (arg3 == 2 && var5.field388 != -1) {
                if (arg4 < 0 && var5.field367 != -1) {
                    arg1.field4040 = var5.field367;
                } else if (arg4 <= 0 || var5.field389 == -1) {
                    arg1.field4040 = var5.field388;
                } else {
                    arg1.field4040 = var5.field389;
                }
            } else if (arg3 == 0 && var5.field344 != -1) {
                if (arg4 < 0 && var5.field346 != -1) {
                    arg1.field4040 = var5.field346;
                } else if (arg4 <= 0 || var5.field374 == -1) {
                    arg1.field4040 = var5.field344;
                } else {
                    arg1.field4040 = var5.field374;
                }
            } else if (arg4 < 0 && var5.field386 != -1) {
                arg1.field4040 = var5.field386;
            } else if (arg4 <= 0 || var5.field349 == -1) {
                arg1.field4040 = var5.field338;
            } else {
                arg1.field4040 = var5.field349;
            }
            arg1.field4109 = false;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1476(byte arg0);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1478(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([BB)V")
    public abstract void method1477(byte[] arg0, byte arg1);
}

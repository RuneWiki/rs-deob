import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class393 extends class130 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lsb;")
    public static class222 field5735;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method2470(int arg0) {
        field5734++;
        if (arg0 <= 34) {
            method2470(-121);
        }
        if (class390.field5713) {
            return;
        }
        if (class40.field667.field4187) {
            class353.field5236 = ((int) class353.field5236 + 47 & 0xFFFFFFF0);
        } else {
            class301.field4616 += (12.0F - class301.field4616) / 2.0F;
        }
        class390.field5713 = true;
        class397.field5861 = true;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method2471(int arg0) {
        field5735 = null;
        if (arg0 != 18409) {
            method2473(50);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lfh;Z)Ljava/lang/String;")
    public static final String method2472(class194 arg0, boolean arg1) {
        field5733++;
        return arg1 ? null : class162.method1157(32767, arg0, -99);
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static final void method2473(int arg0) {
        class51.field785.method360(-96);
        if (arg0 != 0) {
            field5735 = null;
        }
        field5736++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIIILwl;)V")
    public static final void method2474(byte arg0, int arg1, int arg2, int arg3, class521 arg4) {
        field5732++;
        class477 var5 = arg4.method3101(-1);
        int var6 = arg4.field7612 - arg4.field7592.field4337 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg4.field7601 > 25) {
                arg4.field7596 = false;
                if (arg3 < 0 && var5.field7026 != -1) {
                    arg4.field7590 = var5.field7026;
                } else if (arg3 <= 0 || var5.field7000 == -1) {
                    arg4.field7590 = var5.field6979;
                } else {
                    arg4.field7590 = var5.field7000;
                }
            } else if (!arg4.field7596 || !var5.method2884(41, arg4.field7590)) {
                arg4.field7590 = var5.method2880(-127);
                arg4.field7596 = arg4.field7590 != -1;
            }
        } else if (arg4.field7624 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class213.field3245[arg1] - arg4.field7592.field4337 & 0x3FFF;
            if (arg2 == 2 && var5.field6978 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6997 != -1) {
                    arg4.field7590 = var5.field6997;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7019 != -1) {
                    arg4.field7590 = var5.field7019;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6983 == -1) {
                    arg4.field7590 = var5.field6978;
                } else {
                    arg4.field7590 = var5.field6983;
                }
            } else if (arg2 == 0 && var5.field6975 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6981 != -1) {
                    arg4.field7590 = var5.field6981;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7004 != -1) {
                    arg4.field7590 = var5.field7004;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7017 == -1) {
                    arg4.field7590 = var5.field6975;
                } else {
                    arg4.field7590 = var5.field7017;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field7009 != -1) {
                arg4.field7590 = var5.field7009;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field7018 != -1) {
                arg4.field7590 = var5.field7018;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6977 == -1) {
                arg4.field7590 = var5.field6979;
            } else {
                arg4.field7590 = var5.field6977;
            }
            arg4.field7596 = false;
        } else if (var6 == 0 && arg4.field7601 <= 25) {
            if (arg2 == 2 && var5.field6978 != -1) {
                arg4.field7590 = var5.field6978;
            } else if (arg2 == 0 && var5.field6975 != -1) {
                arg4.field7590 = var5.field6975;
            } else {
                arg4.field7590 = var5.field6979;
            }
            arg4.field7596 = false;
        } else {
            arg4.field7596 = false;
            if (arg2 == 2 && var5.field6978 != -1) {
                if (arg3 < 0 && var5.field6998 != -1) {
                    arg4.field7590 = var5.field6998;
                } else if (arg3 <= 0 || var5.field6986 == -1) {
                    arg4.field7590 = var5.field6978;
                } else {
                    arg4.field7590 = var5.field6986;
                }
            } else if (arg2 == 0 && var5.field6975 != -1) {
                if (arg3 < 0 && var5.field6987 != -1) {
                    arg4.field7590 = var5.field6987;
                } else if (arg3 <= 0 || var5.field7016 == -1) {
                    arg4.field7590 = var5.field6975;
                } else {
                    arg4.field7590 = var5.field7016;
                }
            } else if (arg3 < 0 && var5.field7013 != -1) {
                arg4.field7590 = var5.field7013;
            } else if (arg3 <= 0 || var5.field6994 == -1) {
                arg4.field7590 = var5.field6979;
            } else {
                arg4.field7590 = var5.field6994;
            }
        }
        if (arg0 <= 95) {
            method2474((byte) 113, 70, -82, -37, null);
        }
    }

    static {
        new class179("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }
}

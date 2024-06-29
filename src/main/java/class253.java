import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class253 {

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4030 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field4036 = 0;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field4034 = 0;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "[I")
    public static int[] field4035 = new int[500];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field4029;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1720(int arg0) {
        int var1 = 0;
        if (arg0 != 22023) {
            return;
        }
        while (var1 < 100) {
            class275.field4352[var1] = true;
            var1++;
        }
        field4025++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Lui;")
    public static final class229 method1721(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class229 var4 = var3.field2133;
            var3.field2133 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static void method1722(int arg0) {
        field4030 = null;
        if (arg0 != 0) {
            field4033 = 52;
        }
        field4035 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIILik;IJIIII)Z")
    public static final boolean method1723(int arg0, int arg1, int arg2, int arg3, class260 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class221.method1511(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public static final void method1724(int arg0, int arg1) {
        class66.field1086.method476(false, arg1);
        if (arg0 != 0) {
            method1726(true, 4, 5, (class22[]) null, 23, 124, -52, 21, -53, (byte[]) null, -1);
        }
        field4028++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1725(boolean arg0, char arg1) {
        field4031++;
        if (arg0) {
            method1724(53, 34);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII[Lwd;IIIII[BI)V")
    public static final void method1726(boolean arg0, int arg1, int arg2, class22[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        if (arg7 != 4) {
            return;
        }
        field4027++;
        if (!arg0) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg6 + var11 > 0 && arg6 + var11 < 103 && (arg1 + var12) > 0 && (arg1 + var12) < 103) {
                        arg3[arg10].field371[arg6 + var11][arg1 + var12] = class202.method1393(arg3[arg10].field371[arg6 + var11][arg1 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg0) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class221 var14 = new class221(arg9);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg4 == var15 && arg2 <= var35 && var35 < (arg2 + 8) && var36 >= arg8 && var36 < arg8 + 8) {
                        class13.method106(arg0, arg10, var14, 0, arg1 + class162.method1121(var36 & 0x7, arg5, 104, var35 & 0x7), (byte) 113, arg5, 0, class204.method1401(var35 & 0x7, var36 & 0x7, arg5, (byte) -85) + arg6);
                    } else {
                        class13.method106(arg0, 0, var14, 0, -1, (byte) 87, 0, 0, -1);
                    }
                }
            }
        }
        boolean var16 = false;
        while (var14.field3655 < var14.field3653.length) {
            int var17 = var14.method1517((byte) -96);
            if (var17 != 129) {
                var14.field3655--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var14.method1535((byte) -72);
                if (var19 == 0) {
                    if (arg4 >= var18) {
                        int var20 = arg6;
                        int var21 = arg6 + 7;
                        int var22 = arg1 + 7;
                        int var23 = arg1;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 >= 104) {
                            var21 = 104;
                        }
                        if (arg1 < 0) {
                            var23 = 0;
                        } else if (arg1 >= 104) {
                            var23 = 104;
                        }
                        if (arg6 < 0) {
                            var20 = 0;
                        } else if (arg6 >= 104) {
                            var20 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 >= 104) {
                            var22 = 104;
                        }
                        while (var20 < var21) {
                            while (var22 > var23) {
                                class206.field3311[arg10][var20][var23] = 0;
                                var23++;
                            }
                            var20++;
                        }
                    }
                } else if (var19 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var14.method1535((byte) -123);
                            if (var18 <= arg4) {
                                for (int var27 = var24; var27 < var24 + 4; var27++) {
                                    for (int var28 = var25; var28 < var25 + 4; var28++) {
                                        if (arg2 <= var27 && var27 < arg2 + 8 && arg8 <= var28 && (arg8 + 8) > arg8) {
                                            int var29 = class204.method1401(var27 & 0x7, var28 & 0x7, arg5, (byte) -73) + arg6;
                                            int var30 = arg1 + class162.method1121(var28 & 0x7, arg5, 119, var27 & 0x7);
                                            if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                                class206.field3311[arg10][var29][var30] = var26;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        int var31 = arg6 + 7;
        int var32 = arg1 + 7;
        for (int var33 = arg6; var33 < var31; var33++) {
            for (int var34 = arg1; var34 < var32; var34++) {
                class206.field3311[arg10][var33][var34] = 0;
            }
        }
    }
}

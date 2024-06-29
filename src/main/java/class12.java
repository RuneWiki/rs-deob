import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Loa;")
    public static class99 field105 = class221.method1463(2844, "gleiten:");

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Loa;")
    public static class99 field106 = class221.method1463(2844, "<col=00ff00>");

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Loa;")
    public static class99 field107 = class221.method1463(2844, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Ll;")
    public static class161 field110;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[B[Lob;IIIIIZI)V")
    public static final void method79(int arg0, int arg1, byte[] arg2, class131[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field111++;
        byte var11;
        if (arg9) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg9) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg4 + var12) > 0 && (arg4 + var12) < 103 && arg5 + var13 > 0 && (arg5 + var13) < 103) {
                        arg3[arg1].field2272[arg4 + var12][arg5 + var13] = class71.method502(arg3[arg1].field2272[arg4 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class261 var14 = new class261(arg2);
        if (arg6 != 4) {
            return;
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg7 == var15 && var35 >= arg8 && var35 < (arg8 + 8) && var36 >= arg10 && arg10 + 8 > var36) {
                        class220.method1461(arg1, arg9, var14, arg4 + class111.method766((byte) 71, var35 & 0x7, arg0, var36 & 0x7), 0, 0, arg0, (byte) 108, class128.method848(var36 & 0x7, var35 & 0x7, (byte) -114, arg0) + arg5);
                    } else {
                        class220.method1461(0, arg9, var14, -1, 0, 0, 0, (byte) 117, -1);
                    }
                }
            }
        }
        boolean var16 = false;
        while (var14.field4619.length > var14.field4587) {
            int var17 = var14.method1693((byte) 55);
            if (var17 != 129) {
                var14.field4587--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var14.method1706(10819);
                if (var19 == 0) {
                    if (var18 <= arg7) {
                        int var20 = arg4;
                        if (arg4 < 0) {
                            var20 = 0;
                        } else if (arg4 >= 104) {
                            var20 = 104;
                        }
                        int var21 = arg4 + 7;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 >= 104) {
                            var21 = 104;
                        }
                        int var22 = arg5;
                        if (arg5 < 0) {
                            var22 = 0;
                        } else if (arg5 >= 104) {
                            var22 = 104;
                        }
                        int var23 = arg5 + 7;
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        while (var20 < var21) {
                            while (var23 > var22) {
                                class223.field3871[arg1][var20][var22] = 0;
                                var22++;
                            }
                            var20++;
                        }
                    }
                } else if (var19 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var14.method1706(10819);
                            if (var18 <= arg7) {
                                int var27 = var24;
                                while ((var24 + 4) > var27) {
                                    int var28 = var25;
                                    while (var28 < (var25 + 4)) {
                                        if (var27 >= arg8 && var27 < (arg8 + 8) && var28 >= arg10 && (arg10 + 8) > arg10) {
                                            int var29 = arg4 + class111.method766((byte) 71, var27 & 0x7, arg0, var28 & 0x7);
                                            int var30 = arg5 + class128.method848(var28 & 0x7, var27 & 0x7, (byte) -78, arg0);
                                            if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                                class223.field3871[arg1][var29][var30] = var26;
                                            }
                                        }
                                        var25++;
                                    }
                                    var24++;
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
        int var31 = arg5 + 7;
        int var32 = arg4 + 7;
        for (int var33 = arg4; var33 < var32; var33++) {
            for (int var34 = arg5; var34 < var31; var34++) {
                class223.field3871[arg1][var33][var34] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)I")
    public static final int method80(byte arg0) {
        field104++;
        return arg0 > -61 ? 115 : 2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)I")
    public static final int method81(byte arg0, int arg1) {
        int var2 = 23 / ((arg0 - 40) / 33);
        field103++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static final void method82(boolean arg0) {
        if (arg0) {
            class128.field2236 = class107.field1925;
            class189.field3337 = class64.field1079;
        } else {
            class128.field2236 = class288.field5054;
            class189.field3337 = class112.field2025;
        }
        class13.field128 = class128.field2236.length;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    public static void method83(byte arg0) {
        field110 = null;
        field107 = null;
        field105 = null;
        if (arg0 != -43) {
            method84((byte) 0, true, (Object) null);
        }
        field106 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
    public static final byte[] method84(byte arg0, boolean arg1, Object arg2) {
        field108++;
        if (arg0 > -86) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class9.method66(var3, (byte) 47) : var3;
        } else if (arg2 instanceof class185) {
            class185 var4 = (class185) arg2;
            return var4.method1271(255);
        } else {
            throw new IllegalArgumentException();
        }
    }
}

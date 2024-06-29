import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class class419 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Lsd;")
    public static class63 field6078 = new class63(9, 0, 4, 1);

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field6083 = 0;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Lao;")
    public static class191 field6081 = new class191(86, 5);

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "Lqh;")
    public static class50 field6085 = new class50(8);

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "Lwq;")
    public static class115 field6086 = new class115(5, 7);

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "Lho;")
    public static class103 field6087 = new class103(66, 3);

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "Z")
    public static boolean field6089 = true;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field6090 = -50;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field6088;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ot", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field6091;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(BLza;)Luc;")
    public abstract class23 method50(byte arg0, class287 arg1);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILza;BI)Z")
    public abstract boolean method37(int arg0, class287 arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)Z")
    public abstract boolean method41(byte arg0);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
    public static final void method2587(boolean arg0) {
        if (arg0) {
            field6078 = null;
        }
        field6077++;
        class299 var1 = (class299) class333.field4405.method970(12);
        boolean var2 = class188.field2436 != null || class453.field6781 > 0;
        if (var2) {
            class488.field7161 = 1;
        }
        if (class59.field690 && class413.field5893.method1472(28251, 81) && class391.field5656 > 2) {
            if (var2) {
                class249.field3317 = (class36) class69.field806.field2165.field6345.field6345;
            } else {
                class76.method442(var1.method1755(3), 0, (class36) class69.field806.field2165.field6345.field6345, var1.method1760(1));
            }
        } else if (var2) {
            class249.field3317 = (class36) class69.field806.field2165.field6345;
        } else {
            class76.method442(var1.method1755(3), 0, (class36) class69.field806.field2165.field6345, var1.method1760(1));
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6082++;
        if (arg2 != 3) {
            method2590(77, -69, -74, 86, -78, -20, -37, 77);
        }
        if (arg0 == arg5 && arg3 == arg4 && arg7 == arg8 && arg1 == arg6) {
            class442.method2720(arg6, arg7, arg5, arg9, arg4, 1);
            return;
        }
        int var10 = arg5;
        int var11 = arg4;
        int var12 = arg5 * 3;
        int var13 = arg4 * 3;
        int var14 = arg0 * 3;
        int var15 = arg3 * 3;
        int var16 = arg8 * 3;
        int var17 = arg1 * 3;
        int var18 = arg7 - var16 - (-var14 - -arg5);
        int var19 = var15 + arg6 - var17 - arg4;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg5;
            int var34 = (var28 + var30 + var32 >> 12) + arg4;
            class442.method2720(var34, var33, var10, arg9, var11, 1);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)V")
    public static final void method2589(boolean arg0) {
        field6079++;
        for (class440 var1 = (class440) class317.field4240.method285(34); var1 != null; var1 = (class440) class317.field4240.method285(34)) {
            class266.method1630((byte) 126, var1);
        }
        int var2;
        int var3;
        if (class319.field4256.method1738(0, class20.field183)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class253.field3369;
            var3 = class253.field3369;
        }
        client.method1258();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1251();
            client.method1254(var4);
            client.method1248(var4);
        }
        if (!arg0) {
            method2587(false);
        }
        client.method1250();
        client.method1265();
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(BLza;)V")
    public abstract void method36(byte arg0, class287 arg1);

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)V")
    public abstract void method42(byte arg0);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -12) {
            field6083 = 1;
        }
        field6084++;
        if (arg7 < 0 || arg4 < 0 || class308.field4128 - 1 <= arg7 || arg4 >= class426.field6200 - 1) {
            return;
        }
        if (class186.field2421 == null) {
            return;
        }
        if (arg1 == 0) {
            class448 var8 = (class448) class48.method279(arg0, arg7, arg4);
            class448 var9 = (class448) class529.method3137(arg0, arg7, arg4);
            if (var8 != null && arg3 != 2) {
                if (var8 instanceof class7) {
                    ((class7) var8).field84.method2540((byte) 93, arg5);
                } else {
                    class178.method1032(arg5, var8.method46(35), arg7, -99, arg1, arg3, arg2, arg0, arg4);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class7)) {
                    class178.method1032(arg5, var9.method46(39), arg7, -55, arg1, arg3, arg2, arg0, arg4);
                    return;
                }
                ((class7) var9).field84.method2540((byte) 116, arg5);
                return;
            }
            return;
        }
        if (arg1 == 1) {
            class448 var10 = (class448) class107.method663(arg0, arg7, arg4);
            if (var10 != null) {
                if (!(var10 instanceof class226)) {
                    int var11 = var10.method46(108);
                    if (arg3 != 4 && arg3 != 5) {
                        if (arg3 != 6) {
                            if (arg3 == 7) {
                                class178.method1032(arg5, var11, arg7, -104, arg1, 4, (arg2 + 2 & 0x3) + 4, arg0, arg4);
                            } else if (arg3 == 8) {
                                class178.method1032(arg5, var11, arg7, -36, arg1, 4, arg2 + 4, arg0, arg4);
                                class178.method1032(arg5, var11, arg7, arg6 ^ 0xD, arg1, 4, (arg2 + 2 & 0x3) + 4, arg0, arg4);
                                return;
                            }
                            return;
                        }
                        class178.method1032(arg5, var11, arg7, arg6 ^ 0x36, arg1, 4, arg2 + 4, arg0, arg4);
                        return;
                    }
                    class178.method1032(arg5, var11, arg7, arg6 - 61, arg1, 4, arg2, arg0, arg4);
                    return;
                }
                ((class226) var10).field3031.method2540((byte) 118, arg5);
                return;
            }
            return;
        }
        if (arg1 != 2) {
            if (arg1 == 3) {
                class448 var12 = (class448) class434.method2671(arg0, arg7, arg4);
                if (var12 != null) {
                    if (var12 instanceof class515) {
                        ((class515) var12).field7501.method2540((byte) 110, arg5);
                        return;
                    }
                    class178.method1032(arg5, var12.method46(123), arg7, -47, arg1, arg3, arg2, arg0, arg4);
                    return;
                }
            }
            return;
        }
        class448 var13 = (class448) class365.method2172(arg0, arg7, arg4, field6091 == null ? (field6091 = method2593("mh")) : field6091);
        if (var13 == null) {
            return;
        }
        if (arg3 == 11) {
            arg3 = 10;
        }
        if (var13 instanceof class185) {
            ((class185) var13).field2412.method2540((byte) 109, arg5);
            return;
        }
        class178.method1032(arg5, var13.method46(52), arg7, -16, arg1, arg3, arg2, arg0, arg4);
        return;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIZILot;Lza;)V")
    public abstract void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6);

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
    public static void method2591(int arg0) {
        field6085 = null;
        field6078 = null;
        field6081 = null;
        field6086 = null;
        field6087 = null;
        if (arg0 != 4) {
            field6078 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(B)V")
    public static final void method2592(byte arg0) {
        int var1 = 117 / ((arg0 + 65) / 44);
        field6080++;
        if (class328.field4360 == 5) {
            class328.field4360 = 6;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2593(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

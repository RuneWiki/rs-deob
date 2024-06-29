import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class79 extends class235 {

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "[I")
    public static int[] field1076 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "Lwe;")
    public static class24 field1080 = new class24(64);

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
    public static int[] field1085;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "[Lul;")
    public static class306[] field1086;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "[[[B")
    public static byte[][][] field1084;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZII)I")
    public static final int method497(boolean arg0, int arg1, int arg2) {
        field1079++;
        class363 var3 = (class363) class157.field2069.method954(53, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (!arg0) {
                method498(false, 115, true, 106, 54, true, (class265) null, -113, 46, -25, 20, -9);
            }
            while (var5 < var3.field5312.length) {
                if (var3.field5302[var5] == arg1) {
                    var4 += var3.field5312[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZIZIIZLil;IIIII)V")
    public static final void method498(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, class265 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 == 1) {
            arg8 = 1;
        } else if (arg4 == 2) {
            arg8 = 1;
            arg9 = 1;
        } else if (arg4 == 3) {
            arg9 = 1;
        }
        if (arg2) {
            field1086 = null;
        }
        field1083++;
        if (arg3 < 0 || class324.field4652 <= arg3 || arg10 < 0 || class336.field4964 <= arg10) {
            while (true) {
                int var14 = arg6.method1697(-118);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg6.method1697(-28);
                    return;
                }
                if (var14 <= 49) {
                    arg6.method1697(-43);
                }
            }
        }
        if (!arg0 && !arg5) {
            class37.field606[arg7][arg3][arg10] = 0;
        }
        while (true) {
            int var12 = arg6.method1697(-24);
            if (var12 == 0) {
                if (arg0) {
                    class128.field1703[0][arg3 + arg9][arg8 + arg10] = class198.field2829[0].method781(arg3 + arg9, arg8 + arg10);
                    return;
                } else if (arg7 == 0) {
                    class128.field1703[0][arg3 + arg9][arg10 + arg8] = -class106.method732(arg1 + 556238, (byte) -115, arg11 + 932731) * 8;
                    return;
                } else {
                    class128.field1703[arg7][arg3 + arg9][arg10 + arg8] = class128.field1703[arg7 - 1][arg3 + arg9][arg8 + arg10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg6.method1697(-124);
                if (!arg0) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg7 == 0) {
                        class128.field1703[0][arg3 + arg9][arg8 + arg10] = -var13 * 8;
                        return;
                    }
                    class128.field1703[arg7][arg3 + arg9][arg8 + arg10] = class128.field1703[arg7 - 1][arg3 + arg9][arg8 + arg10] - (var13 * 8);
                    return;
                }
                class128.field1703[0][arg3 + arg9][arg8 + arg10] = class198.field2829[0].method781(arg3 + arg9, arg8 + arg10) + (var13 * 8);
                return;
            }
            if (var12 <= 49) {
                if (arg5) {
                    arg6.method1697(-77);
                } else {
                    class327.field4702[arg7][arg3][arg10] = arg6.method1708((byte) 127);
                    field1084[arg7][arg3][arg10] = (byte) ((var12 - 2) / 4);
                    class40.field639[arg7][arg3][arg10] = (byte) class401.method2606(3, var12 + arg4 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg0 && !arg5) {
                    class37.field606[arg7][arg3][arg10] = (byte) (var12 - 49);
                }
            } else if (!arg5) {
                class300.field4296[arg7][arg3][arg10] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    public static void method499(byte arg0) {
        field1080 = null;
        field1076 = null;
        field1086 = null;
        field1085 = null;
        field1084 = null;
        if (arg0 != -79) {
            method498(true, 101, true, -80, 81, true, (class265) null, -91, 22, 6, -127, 118);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method500(String arg0, byte arg1) {
        if (arg1 == -38) {
            field1081++;
            return class278.method1776(true, 10, arg0, 0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)I")
    public static final int method501(byte arg0) {
        field1077++;
        if ((double) class76.field1026 == 3.0D) {
            return 37;
        } else if ((double) class76.field1026 == 4.0D) {
            return 50;
        } else if ((double) class76.field1026 == 6.0D) {
            return 75;
        } else {
            if (arg0 >= -58) {
                method500((String) null, (byte) 34);
            }
            return (double) class76.field1026 == 8.0D ? 100 : 200;
        }
    }
}

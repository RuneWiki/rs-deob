import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class305 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field4879 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lag;")
    public static class211 field4878;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "[Lla;")
    public static class185[] field4883;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILwd;)Ldd;")
    public static final class77 method2038(int arg0, int arg1, class162 arg2) {
        field4877++;
        class77 var3 = new class77(arg1, arg2.method1152(-90), arg2.method1152(-92), arg2.method1157(65280), arg2.method1157(65280), arg2.method1133((byte) 53) == 1, arg2.method1133((byte) 53));
        if (arg0 < 118) {
            method2041((byte) 95);
        }
        int var4 = arg2.method1133((byte) 53);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field1278.method1646(true, new class201(arg2.method1133((byte) 53), arg2.method1133((byte) 53), arg2.method1142(-18970), arg2.method1142(-18970), arg2.method1142(-18970), arg2.method1142(-18970), arg2.method1142(-18970), arg2.method1142(-18970), arg2.method1142(-18970), arg2.method1142(-18970)));
        }
        var3.method523(12800);
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2039(String arg0, int arg1) {
        field4881++;
        String var2 = class4.method24(class178.method1303(arg0, -128), 0);
        if (arg1 != 24667) {
            method2042(false, (byte[]) null, 125);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BS)Z")
    public static final boolean method2040(byte arg0, short arg1) {
        field4880++;
        if (arg1 == 29 || arg1 == 18 || arg1 == 22 || arg1 == 51 || arg1 == 36 || arg1 == 58 || arg1 == 16 || arg1 == 39) {
            return true;
        } else if (arg1 == 12 || arg1 == 9 || arg1 == 1002 || arg1 == 1005) {
            return true;
        } else {
            if (arg0 != -26) {
                method2042(true, (byte[]) null, 2);
            }
            if (arg1 == 34 || arg1 == 43 || arg1 == 13 || arg1 == 28 || arg1 == 40) {
                return true;
            } else {
                return arg1 == 26 || arg1 == 49 || arg1 == 6 || arg1 == 15 || arg1 == 35 || arg1 == 25;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method2041(byte arg0) {
        field4883 = null;
        int var1 = 114 % ((-arg0 - 43) / 47);
        field4878 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method2042(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 <= 14) {
            return null;
        }
        field4882++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class193.field3138) {
            try {
                class143 var3 = (class143) Class.forName("kd").getDeclaredConstructor().newInstance();
                var3.method1004(arg1, -1);
                return var3;
            } catch (Throwable var4) {
                class193.field3138 = true;
            }
        }
        return arg0 ? class19.method96(arg1, 0) : arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method2043(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg6 >= 0 && arg2 >= 0 && arg6 < 103 && arg2 < 103) {
            if (arg1 == 0) {
                class209 var8 = class281.method1885(arg0, arg6, arg2);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3313 >>> 32);
                    if (arg3 == 2) {
                        var8.field3305 = new class81(var9, 2, arg7 + 4, arg0, arg6, arg2, arg4, false, var8.field3305);
                        var8.field3316 = new class81(var9, 2, arg7 + 1 & 0x3, arg0, arg6, arg2, arg4, false, var8.field3316);
                    } else {
                        var8.field3305 = new class81(var9, arg3, arg7, arg0, arg6, arg2, arg4, false, var8.field3305);
                    }
                }
            }
            if (arg1 == 1) {
                class259 var10 = class129.method919(arg0, arg6, arg2);
                if (var10 != null) {
                    int var11 = (int) (var10.field4185 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field4174 = new class81(var11, 4, arg7, arg0, arg6, arg2, arg4, false, var10.field4174);
                    } else if (arg3 == 6) {
                        var10.field4174 = new class81(var11, 4, arg7 + 4, arg0, arg6, arg2, arg4, false, var10.field4174);
                    } else if (arg3 == 7) {
                        var10.field4174 = new class81(var11, 4, (arg7 + 2 & 0x3) + 4, arg0, arg6, arg2, arg4, false, var10.field4174);
                    } else if (arg3 == 8) {
                        var10.field4174 = new class81(var11, 4, arg7 + 4, arg0, arg6, arg2, arg4, false, var10.field4174);
                        var10.field4186 = new class81(var11, 4, (arg7 + 2 & 0x3) + 4, arg0, arg6, arg2, arg4, false, var10.field4186);
                    }
                }
            }
            if (arg1 == 2) {
                class179 var12 = class159.method1098(arg0, arg6, arg2);
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (var12 != null) {
                    var12.field2932 = new class81((int) (var12.field2933 >>> 32) & Integer.MAX_VALUE, arg3, arg7, arg0, arg6, arg2, arg4, false, var12.field2932);
                }
            }
            if (arg1 == 3) {
                class188 var13 = class99.method675(arg0, arg6, arg2);
                if (var13 != null) {
                    var13.field3057 = new class81((int) (var13.field3050 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg0, arg6, arg2, arg4, false, var13.field3057);
                }
            }
        }
        if (!arg5) {
            field4876++;
        }
    }
}

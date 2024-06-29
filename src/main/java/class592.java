import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class592 extends class298 {

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public int field8418 = -1;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public int field8417;

    // $FF: synthetic field
    @OriginalMember(owner = "client!g", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field8419;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Ljava/lang/String;")
    public String field8412;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Ljava/lang/String;")
    public String field8416;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)Lmo;")
    public final class731 method3474(byte arg0) {
        int var2 = 96 % ((70 - arg0) / 44);
        ++field8414;
        return class340.field4682[super.field4073];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lla;Lla;Lla;Lla;I)V")
    public static final void method3475(class423 arg0, class423 arg1, class423 arg2, class423 arg3, int arg4) {
        ++field8415;
        if (arg4 != -3017) {
            method3476(-48, 17, -47, -21, true, (class543) null, 56, 26, -127);
        }
        class192.field2733 = arg3;
        class433.field6204 = arg1;
        class316.field4267 = arg2;
        class600.field8524 = new class146[class316.field4267.method2623(arg4 ^ 3016)][];
        class542.field7863 = new boolean[class316.field4267.method2623(-1)];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIZLha;III)V")
    public static final void method3476(int arg0, int arg1, int arg2, int arg3, boolean arg4, class543 arg5, int arg6, int arg7, int arg8) {
        ++field8411;
        class324 var9 = (class324) class256.method1707(arg6, arg3, arg0);
        if (var9 != null) {
            class482 var10 = class375.field5421.method2680(var9.method601((byte) 88), (byte) 87);
            int var11 = var9.method606(-73) & 3;
            int var12 = var9.method604((byte) 94);
            if (var10.field6880 == -1) {
                int var13 = arg1;
                if (var10.field6903 > 0) {
                    var13 = arg2;
                }
                if (~var12 == -1 || ~var12 == -3) {
                    if (var11 == 0) {
                        arg5.method3258(var13, arg7, 4, 34, arg8);
                    } else if (~var11 != -2) {
                        if (var11 == 2) {
                            arg5.method3258(var13, arg7, 4, 102, arg8 + 3);
                        } else if (var11 == 3) {
                            arg5.method3260(arg7 + 3, 4, -81, arg8, var13);
                        }
                    } else {
                        arg5.method3260(arg7, 4, -54, arg8, var13);
                    }
                }
                if (~var12 == -4) {
                    if (~var11 != -1) {
                        if (var11 != 1) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    arg5.method3263((byte) -99, arg8, 1, 1, arg7 - -3, var13);
                                }
                            } else {
                                arg5.method3263((byte) -118, arg8 + 3, 1, 1, arg7 - -3, var13);
                            }
                        } else {
                            arg5.method3263((byte) -124, arg8 + 3, 1, 1, arg7, var13);
                        }
                    } else {
                        arg5.method3263((byte) -121, arg8, 1, 1, arg7, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg5.method3260(arg7, 4, -113, arg8, var13);
                    } else if (~var11 == -2) {
                        arg5.method3258(var13, arg7, 4, 84, arg8 + 3);
                    } else if (~var11 != -3) {
                        if (~var11 == -4) {
                            arg5.method3258(var13, arg7, 4, 97, arg8);
                        }
                    } else {
                        arg5.method3260(arg7 + 3, 4, -119, arg8, var13);
                    }
                }
            } else {
                class375.method2329(var11, var10, arg5, (byte) 59, arg7, arg8);
            }
        }
        if (arg4) {
            class324 var14 = (class324) class360.method2277(arg6, arg3, arg0, field8419 != null ? field8419 : (field8419 = method3477("as")));
            if (var14 != null) {
                class482 var15 = class375.field5421.method2680(var14.method601((byte) 116), (byte) 108);
                int var16 = var14.method606(-43) & 3;
                int var17 = var14.method604((byte) 94);
                if (~var15.field6880 == 0) {
                    if (~var17 == -10) {
                        int var18 = -1118482;
                        if (var15.field6903 > 0) {
                            var18 = -1179648;
                        }
                        if (~var16 != -1 && var16 != 2) {
                            arg5.method3259((byte) -124, arg7 + 3, var18, arg8, arg8 - -3, arg7);
                        } else {
                            arg5.method3259((byte) -124, arg7, var18, arg8, arg8 - -3, arg7 + 3);
                        }
                    }
                } else {
                    class375.method2329(var16, var15, arg5, (byte) 59, arg7, arg8);
                }
            }
            class324 var19 = (class324) class388.method2384(arg6, arg3, arg0);
            if (var19 != null) {
                class482 var20 = class375.field5421.method2680(var19.method601((byte) 124), (byte) 125);
                int var21 = 3 & var19.method606(-67);
                if (~var20.field6880 != 0) {
                    class375.method2329(var21, var20, arg5, (byte) 59, arg7, arg8);
                    return;
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3477(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

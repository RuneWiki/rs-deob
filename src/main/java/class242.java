import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class242 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "S")
    public static short field3232 = 1;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lcr;")
    public static class189 field3238 = new class189(50);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field3237;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field3239;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ls;I)Ls;")
    public abstract class380 method1452(class380 arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lva;II)Lel;")
    public static final class328 method1453(class55 arg0, int arg1, int arg2) {
        field3235++;
        class328 var3;
        if (class259.field3786 == null) {
            var3 = new class328();
        } else {
            var3 = class259.field3786;
            class259.field3786 = class259.field3786.field4783;
            class324.field4755--;
            var3.field4783 = null;
        }
        var3.field4785 = arg0;
        var3.field4781 = arg1;
        return arg2 >= -23 ? null : var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3236++;
        if (arg7 >= 0 && arg6 >= 0 && class192.field2574 - 1 > arg7 && (class364.field5262 - 1) > arg6) {
            if (class213.field2852 == null) {
                return;
            }
            if (arg0 == 0) {
                class425 var12 = (class425) class40.method292(arg1, arg7, arg6);
                class425 var13 = (class425) class161.method993(arg1, arg7, arg6);
                if (var12 != null && arg3 != 2) {
                    if (var12 instanceof class268) {
                        ((class268) var12).field3880.method2292(arg2, (byte) 80);
                    } else {
                        class254.method1551(arg1, arg2, arg3, arg0, var12.method121(-15123), arg7, -4, arg6, arg4);
                    }
                }
                if (var13 != null) {
                    if ((var13 instanceof class268)) {
                        ((class268) var13).field3880.method2292(arg2, (byte) 97);
                    } else {
                        class254.method1551(arg1, arg2, arg3, arg0, var13.method121(-15123), arg7, -4, arg6, arg4);
                    }
                }
            } else if (arg0 == 1) {
                class425 var8 = (class425) class376.method2434(arg1, arg7, arg6);
                if (var8 != null) {
                    if (var8 instanceof class317) {
                        ((class317) var8).field4626.method2292(arg2, (byte) 62);
                    } else {
                        int var9 = var8.method121(-15123);
                        if (arg3 == 4 || arg3 == 5) {
                            class254.method1551(arg1, arg2, 4, arg0, var9, arg7, -4, arg6, arg4);
                        } else if (arg3 == 6) {
                            class254.method1551(arg1, arg2, 4, arg0, var9, arg7, -4, arg6, arg4 + 4);
                        } else if (arg3 == 7) {
                            class254.method1551(arg1, arg2, 4, arg0, var9, arg7, arg5 ^ 0x4420, arg6, (arg4 + 2 & 0x3) + 4);
                        } else if (arg3 == 8) {
                            class254.method1551(arg1, arg2, 4, arg0, var9, arg7, arg5 ^ 0x4420, arg6, arg4 + 4);
                            class254.method1551(arg1, arg2, 4, arg0, var9, arg7, -4, arg6, (arg4 + 2 & 0x3) + 4);
                        }
                    }
                }
            } else if (arg0 == 2) {
                class425 var11 = (class425) class243.method1460(arg1, arg7, arg6, field3239 == null ? (field3239 = method1457("jb")) : field3239);
                if (var11 != null) {
                    if (arg3 == 11) {
                        arg3 = 10;
                    }
                    if ((var11 instanceof class62)) {
                        ((class62) var11).field824.method2292(arg2, (byte) 121);
                    } else {
                        class254.method1551(arg1, arg2, arg3, arg0, var11.method121(-15123), arg7, -4, arg6, arg4);
                    }
                }
            } else if (arg0 == 3) {
                class425 var10 = (class425) class130.method823(arg1, arg7, arg6);
                if (var10 != null) {
                    if (var10 instanceof class164) {
                        ((class164) var10).field2193.method2292(arg2, (byte) 36);
                    } else {
                        class254.method1551(arg1, arg2, arg3, arg0, var10.method121(-15123), arg7, -4, arg6, arg4);
                    }
                }
            }
        }
        if (arg5 != -17444) {
            method1455(-71);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method1455(int arg0) {
        field3238 = null;
        if (arg0 != -4) {
            field3233 = 89;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)I")
    public static final int method1456(boolean arg0, int arg1) {
        field3237++;
        if (arg1 != 0) {
            field3234 = 103;
        }
        long var2 = class114.method735(arg1 ^ 0x7E);
        for (class416 var4 = arg0 ? (class416) class312.field4570.method389(0) : (class416) class312.field4570.method388(arg1); var4 != null; var4 = (class416) class312.field4570.method388(arg1)) {
            if (var2 > (var4.field6108 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field6108 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field640;
                    class191.field2561[var5] = class4.field41[var5];
                    var4.method322(arg1 ^ 0xB);
                    return var5;
                }
                var4.method322(11);
            }
        }
        return -1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1457(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

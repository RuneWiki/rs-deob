import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class208 extends class256 {

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Lbe;")
    public static class28 field3720 = new class28(5000);

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "Lid;")
    public static class149 field3729 = class60.method382("(U2", (byte) 113);

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field3730 = 0;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "Lid;")
    public class149 field3723;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "Lid;")
    public class149 field3728;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qk", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field3731;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static final void method1415(int arg0) {
        try {
            Method var1 = (field3731 != null ? field3731 : (field3731 = method1421("java.lang.Runtime"))).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class77.field1447 = 1 + (int) (var3 / 1048576L);
                } catch (Throwable var4) {
                }
            }
            if (arg0 <= 21) {
                method1418(90);
            }
        } catch (Exception var5) {
        }
        ++field3722;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3718;
        if (arg0 != 2047) {
            field3729 = null;
        }
        if (arg1 >= 0 && arg4 >= 0 && ~arg1 > -104 && ~arg4 > -104) {
            if (arg7 == 0) {
                class125 var8 = class143.method991(arg6, arg1, arg4);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2200 >>> 32);
                    if (arg5 != 2) {
                        var8.field2203 = new class287(var9, arg5, arg2, arg6, arg1, arg4, arg3, false, var8.field2203);
                    } else {
                        var8.field2203 = new class287(var9, 2, arg2 + 4, arg6, arg1, arg4, arg3, false, var8.field2203);
                        var8.field2197 = new class287(var9, 2, arg2 + 1 & 3, arg6, arg1, arg4, arg3, false, var8.field2197);
                    }
                }
            }
            if (arg7 == 1) {
                class158 var10 = class96.method695(arg6, arg1, arg4);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field2903 >>> 32);
                    if (~arg5 != -5 && ~arg5 != -6) {
                        if (arg5 != 6) {
                            if (arg5 == 7) {
                                var10.field2911 = new class287(var11, 4, (3 & arg2 + 2) - -4, arg6, arg1, arg4, arg3, false, var10.field2911);
                            } else if (arg5 == 8) {
                                var10.field2911 = new class287(var11, 4, arg2 + 4, arg6, arg1, arg4, arg3, false, var10.field2911);
                                var10.field2913 = new class287(var11, 4, (arg2 + 2 & 3) - -4, arg6, arg1, arg4, arg3, false, var10.field2913);
                            }
                        } else {
                            var10.field2911 = new class287(var11, 4, arg2 + 4, arg6, arg1, arg4, arg3, false, var10.field2911);
                        }
                    } else {
                        var10.field2911 = new class287(var11, 4, arg2, arg6, arg1, arg4, arg3, false, var10.field2911);
                    }
                }
            }
            if (~arg7 == -3) {
                class23 var12 = class151.method1077(arg6, arg1, arg4);
                if (~arg5 == -12) {
                    arg5 = 10;
                }
                if (var12 != null) {
                    var12.field343 = new class287(Integer.MAX_VALUE & (int) (var12.field338 >>> 32), arg5, arg2, arg6, arg1, arg4, arg3, false, var12.field343);
                }
            }
            if (arg7 == 3) {
                class100 var13 = class75.method544(arg6, arg1, arg4);
                if (var13 != null) {
                    var13.field1764 = new class287((int) (var13.field1765 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg6, arg1, arg4, arg3, false, var13.field1764);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)Loa;")
    public final class99 method1417(int arg0) {
        ++field3725;
        return arg0 != 2047 ? null : class61.field1096[super.field4477];
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
    public static void method1418(int arg0) {
        if (arg0 >= 18) {
            field3729 = null;
            field3720 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        ++field3724;
        if (arg0 <= 59) {
            field3729 = null;
        }
        class11.field150.method155(-85);
        int var1 = class11.field150.method154((byte) 9, 1);
        if (~var1 != -1) {
            int var2 = class11.field150.method154((byte) 9, 2);
            if (~var2 == -1) {
                class255.field4462[class162.field3013++] = 2047;
            } else if (var2 == 1) {
                int var3 = class11.field150.method154((byte) 9, 3);
                class77.field1449.method928(var3, 1, 3);
                int var4 = class11.field150.method154((byte) 9, 1);
                if (var4 == 1) {
                    class255.field4462[class162.field3013++] = 2047;
                }
            } else if (var2 == 2) {
                if (class11.field150.method154((byte) 9, 1) == 1) {
                    int var5 = class11.field150.method154((byte) 9, 3);
                    class77.field1449.method928(var5, 2, 3);
                    int var6 = class11.field150.method154((byte) 9, 3);
                    class77.field1449.method928(var6, 2, 3);
                } else {
                    int var7 = class11.field150.method154((byte) 9, 3);
                    class77.field1449.method928(var7, 0, 3);
                }
                int var8 = class11.field150.method154((byte) 9, 1);
                if (var8 == 1) {
                    class255.field4462[class162.field3013++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class11.field150.method154((byte) 9, 7);
                int var10 = class11.field150.method154((byte) 9, 1);
                class277.field4948 = class11.field150.method154((byte) 9, 2);
                int var11 = class11.field150.method154((byte) 9, 1);
                if (~var11 == -2) {
                    class255.field4462[class162.field3013++] = 2047;
                }
                int var12 = class11.field150.method154((byte) 9, 7);
                class77.field1449.method888(var10 == 1, var9, var12, 14508);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(Z)V")
    public static final void method1420(boolean arg0) {
        if (!(class11.field156 < class199.field3616)) {
            if (class11.field156 > class199.field3616) {
                class11.field156 = (float) ((double) class11.field156 - (double) class11.field156 / 30.0D);
                if (class199.field3616 > class11.field156) {
                    class11.field156 = class199.field3616;
                }
                class197.method1346(98);
            }
        } else {
            class11.field156 = (float) ((double) class11.field156 / 30.0D + (double) class11.field156);
            if (class199.field3616 < class11.field156) {
                class11.field156 = class199.field3616;
            }
            class197.method1346(98);
        }
        if (~class65.field1159 != 0 && class129.field2285 != -1) {
            int var1 = -class106.field1840 + class65.field1159;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 4;
            }
            class106.field1840 += var1;
            int var2 = -class163.field3019 + class129.field2285;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 4;
            }
            class163.field3019 += var2;
            if (var1 == 0 && ~var2 == -1) {
                class65.field1159 = -1;
                class129.field2285 = -1;
            }
            class197.method1346(98);
        }
        ++field3726;
        if (!arg0) {
            field3727 = 113;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1421(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class294 extends class29 {

    @OriginalMember(owner = "client!di", name = "S", descriptor = "Z")
    public boolean field4281 = true;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field4274 = 0;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field4277 = -1;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "[I")
    public static int[] field4276 = new int[13];

    @OriginalMember(owner = "client!di", name = "P", descriptor = "C")
    private char field4278;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "Lct;")
    public static class104 field4279;

    // $FF: synthetic field
    @OriginalMember(owner = "client!di", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field4282;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Ljava/lang/String;")
    public String field4273;

    // $FF: synthetic method
    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1958(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lat;ZI)V", line = 4)
    private final void method1951(class256 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4269 = -121;
        }
        field4271++;
        if (arg2 == 1) {
            this.field4278 = class141.method934((byte) 108, arg0.method1728((byte) 96));
        } else if (arg2 == 2) {
            this.field4270 = arg0.method1746(20972);
            return;
        } else if (arg2 == 4) {
            this.field4281 = false;
            return;
        } else if (arg2 == 5) {
            this.field4273 = arg0.method1715(true);
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILat;)V", line = 32)
    public final void method1952(int arg0, class256 arg1) {
        field4266++;
        while (true) {
            int var3 = arg1.method1738((byte) 113);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.field4278 = (char) 65466;
                    return;
                }
            }
            this.method1951(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)Z", line = 56)
    public final boolean method1953(byte arg0) {
        field4267++;
        if (arg0 != 88) {
            field4277 = 71;
        }
        return this.field4278 == 's';
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)I", line = 79)
    public static final int method1954(int arg0, int arg1) {
        field4272++;
        if (arg0 != 3) {
            method1956(-127, 84, 77, -119, 86, 96, -60, 76);
        }
        class296 var2 = class99.method653(arg1, -123);
        int var3 = var2.field4311;
        int var4 = var2.field4314;
        int var5 = var2.field4312;
        int var6 = class32.field442[var5 - var4];
        return var6 & class31.field426[var3] >> var4;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V", line = 101)
    public static final void method1955(byte arg0) {
        if (arg0 >= -10) {
            field4269 = -19;
        }
        field4280++;
        class125 var1 = class56.method428(0, 15, -3636);
        var1.method847(62);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V", line = 123)
    public static final void method1956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4268++;
        if (arg7 >= 0 && arg2 >= 0 && arg7 < class195.field2745 - 1 && arg2 < class78.field984 - 1) {
            if (class178.field2530 == null) {
                return;
            }
            if (arg1 == 0) {
                class438 var8 = (class438) class319.method2098(arg0, arg7, arg2);
                class438 var9 = (class438) class163.method1081(arg0, arg7, arg2);
                if (var8 != null && arg4 != 2) {
                    if (var8 instanceof class4) {
                        ((class4) var8).field53.method2727(10, arg6);
                    } else {
                        class359.method2284(arg0, arg2, var8.method9((byte) 103), arg7, (byte) -12, arg1, arg6, arg5, arg4);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class4)) {
                        ((class4) var9).field53.method2727(10, arg6);
                    } else {
                        class359.method2284(arg0, arg2, var9.method9((byte) 110), arg7, (byte) -12, arg1, arg6, arg5, arg4);
                    }
                }
            } else if (arg1 == 1) {
                class438 var10 = (class438) class77.method538(arg0, arg7, arg2);
                if (var10 != null) {
                    if ((var10 instanceof class1)) {
                        ((class1) var10).field21.method2727(10, arg6);
                    } else {
                        int var11 = var10.method9((byte) 112);
                        if (arg4 == 4 || arg4 == 5) {
                            class359.method2284(arg0, arg2, var11, arg7, (byte) -12, arg1, arg6, arg5, 4);
                        } else if (arg4 == 6) {
                            class359.method2284(arg0, arg2, var11, arg7, (byte) -12, arg1, arg6, arg5 + 4, 4);
                        } else if (arg4 == 7) {
                            class359.method2284(arg0, arg2, var11, arg7, (byte) -12, arg1, arg6, (arg5 + 2 & 0x3) + 4, 4);
                        } else if (arg4 == 8) {
                            class359.method2284(arg0, arg2, var11, arg7, (byte) -12, arg1, arg6, arg5 + 4, 4);
                            class359.method2284(arg0, arg2, var11, arg7, (byte) -12, arg1, arg6, (arg5 + 2 & 0x3) + 4, 4);
                        }
                    }
                }
            } else if (arg1 == 2) {
                class438 var12 = (class438) class188.method1287(arg0, arg7, arg2, field4282 == null ? (field4282 = method1958("jb")) : field4282);
                if (var12 != null) {
                    if (arg4 == 11) {
                        arg4 = 10;
                    }
                    if (var12 instanceof class455) {
                        ((class455) var12).field6722.method2727(10, arg6);
                    } else {
                        class359.method2284(arg0, arg2, var12.method9((byte) 114), arg7, (byte) -12, arg1, arg6, arg5, arg4);
                    }
                }
            } else if (arg1 == 3) {
                class438 var13 = (class438) class137.method913(arg0, arg7, arg2);
                if (var13 != null) {
                    if ((var13 instanceof class267)) {
                        ((class267) var13).field3959.method2727(10, arg6);
                    } else {
                        class359.method2284(arg0, arg2, var13.method9((byte) 114), arg7, (byte) -12, arg1, arg6, arg5, arg4);
                    }
                }
            }
        }
        if (arg3 != -1475) {
            field4274 = 100;
        }
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 246)
    public static void method1957(int arg0) {
        if (arg0 != 13) {
            method1955((byte) -11);
        }
        field4279 = null;
        field4276 = null;
    }
}

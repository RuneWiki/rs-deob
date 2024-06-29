import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class517 {

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field7393 = 0;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field7392;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field7394;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2951(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Loa;IILq;III[[[B[I[I[I[I[IIBIIZ)V", line = 4)
    public static final void method2948(class635 arg0, int arg1, int arg2, class389 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class618.field8703 = arg0;
        class555.field7906 = arg1;
        class112.field1307 = arg3;
        class603.field8547 = class618.field8703.method352() > 0;
        class325.field4238 = arg4 >> class8.field70;
        class75.field789 = arg6 >> class8.field70;
        class461.field6410 = arg4;
        class351.field4599 = arg6;
        class46.field504 = arg5;
        class650.field9307 = class325.field4238 - class658.field9390;
        if (class650.field9307 < 0) {
            class88.field937 = -class650.field9307;
            class650.field9307 = 0;
        } else {
            class88.field937 = 0;
        }
        class147.field1649 = class75.field789 - class658.field9390;
        if (class147.field1649 < 0) {
            class438.field6091 = -class147.field1649;
            class147.field1649 = 0;
        } else {
            class438.field6091 = 0;
        }
        class648.field9178 = class658.field9390 + class325.field4238;
        if (class648.field9178 > class181.field2222) {
            class648.field9178 = class181.field2222;
        }
        class585.field8323 = class75.field789 + class658.field9390;
        if (class585.field8323 > class272.field3451) {
            class585.field8323 = class272.field3451;
        }
        for (int var18 = 0; var18 < class658.field9390 + class658.field9390 + 2; var18++) {
            for (int var23 = 0; var23 < class658.field9390 + class658.field9390 + 2; var23++) {
                int var24 = class325.field4238 + var18 - class658.field9390;
                int var25 = class75.field789 + var23 - class658.field9390;
                if (var24 >= 0 && var25 >= 0 && var24 < class181.field2222 && var25 < class272.field3451) {
                    int var26 = var24 << class8.field70;
                    int var27 = var25 << class8.field70;
                    int var28 = class275.field3477[class275.field3477.length - 1].method253(var24, var25) - (0x3E8 << class8.field70 - 7);
                    int var29 = class591.field8415 == null ? class275.field3477[0].method253(var24, var25) + class463.field6445 : class591.field8415[0].method253(var24, var25) + class463.field6445;
                    class321.field4164[var18][var23] = class618.field8703.method357(var26, var28, var27, var26, var29, var27);
                } else {
                    class321.field4164[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class658.field9390 + class658.field9390 + 1; var19++) {
            for (int var22 = 0; var22 < class658.field9390 + class658.field9390 + 1; var22++) {
                class581.field8258[var19][var22] = class321.field4164[var19][var22] || class321.field4164[var19 + 1][var22] || class321.field4164[var19][var22 + 1] || class321.field4164[var19 + 1][var22 + 1];
            }
        }
        class177.field2162 = arg8;
        class598.field8504 = arg9;
        class587.field8340 = arg10;
        class583.field8298 = arg11;
        class36.field409 = arg12;
        class690.method3828();
        class352.method1951(true, class618.field8703);
        for (class231 var20 = (class231) class435.field5854.method93((byte) 59); var20 != null; var20 = (class231) class435.field5854.method92(0)) {
            var20.method1374((byte) -122);
            class505.method2909(var20, (byte) 123);
        }
        if (class603.field8547) {
            for (int var21 = 0; var21 < class112.field1296; var21++) {
                class256.field3279[var21].method1429(arg17, arg1, false);
            }
        }
        if (arg2 > 1) {
            class618.field8703.method322(0);
            if (class81.field859 == null || class81.field859 instanceof class471) {
                class81.field859 = new class496();
            }
        } else if (class81.field859 == null || class81.field859 instanceof class496) {
            class81.field859 = new class471();
        }
        class81.field859.method1407(arg2, 3);
        class81.field859.method1412((byte) -43);
        if (class631.field8958 != null) {
            class488.method2821(true);
            class81.field859.method1413(-8076, 22);
            class447.method2475(arg2, null, 0, (byte) 0, arg15, arg16);
            class81.field859.method1412((byte) -117);
            class81.field859.method1413(-8076, 23);
            class488.method2821(false);
        }
        class447.method2475(arg2, arg7, arg13, arg14, arg15, arg16);
        class81.field859.method1412((byte) -119);
        class81.field859.method1405(-123);
        class81.field859.method1412((byte) 70);
        if (arg2 > 1) {
            class618.field8703.method288(0);
        }
        class618.field8703.method355(0, null);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLrs;)V", line = 163)
    public static final void method2949(byte arg0, class595 arg1) {
        if (arg0 != 75) {
            method2950(-25, true, null, -51, null);
        }
        field7390++;
        if (class97.field1074 == null) {
            return;
        }
        class670 var2 = null;
        if (arg1.field8447 == 0) {
            var2 = (class670) class480.method2801(arg1.field8443, arg1.field8445, arg1.field8448);
        }
        if (arg1.field8447 == 1) {
            var2 = (class670) class248.method1430(arg1.field8443, arg1.field8445, arg1.field8448);
        }
        if (arg1.field8447 == 2) {
            var2 = (class670) class396.method2163(arg1.field8443, arg1.field8445, arg1.field8448, field7394 == null ? (field7394 = method2951("ql")) : field7394);
        }
        if (arg1.field8447 == 3) {
            var2 = (class670) class606.method3380(arg1.field8443, arg1.field8445, arg1.field8448);
        }
        if (var2 == null) {
            arg1.field8441 = -1;
            arg1.field8442 = 0;
            arg1.field8436 = 0;
        } else {
            arg1.field8441 = var2.method444((byte) 96);
            arg1.field8442 = var2.method447((byte) -91);
            arg1.field8436 = var2.method443((byte) 40);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZLgi;ILgi;)I", line = 206)
    public static final int method2950(int arg0, boolean arg1, class620 arg2, int arg3, class620 arg4) {
        field7391++;
        if (arg3 == 1) {
            int var5 = arg2.field7627;
            int var6 = arg4.field7627;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class644.method3613(arg2.method3480((byte) 126).field8833, 0, arg4.method3480((byte) 72).field8833, class226.field2899);
        } else {
            if (arg0 != 1000) {
                field7393 = 93;
            }
            if (arg3 == 3) {
                if (arg2.field8718.equals("-")) {
                    if (arg4.field8718.equals("-")) {
                        return 0;
                    } else if (arg1) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (arg4.field8718.equals("-")) {
                    return arg1 ? 1 : -1;
                } else {
                    return class644.method3613(arg2.field8718, arg0 - 1000, arg4.field8718, class226.field2899);
                }
            } else if (arg3 == 4) {
                if (arg2.method3036((byte) 16)) {
                    return arg4.method3036((byte) 16) ? 0 : 1;
                } else if (arg4.method3036((byte) 16)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 5) {
                if (arg2.method3035(0)) {
                    return arg4.method3035(0) ? 0 : 1;
                } else if (arg4.method3035(arg0 ^ 0x3E8)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg2.method3033(-116)) {
                    return arg4.method3033(-108) ? 0 : 1;
                } else if (arg4.method3033(6)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 7) {
                if (arg2.method3037(-1)) {
                    return arg4.method3037(arg0 - 1001) ? 0 : 1;
                } else if (arg4.method3037(-1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg2.field8719;
                int var8 = arg4.field8719;
                if (arg1) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg2.field8720 - arg4.field8720;
            }
        }
    }
}

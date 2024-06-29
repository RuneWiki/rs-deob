import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class485 extends class145 {

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7131 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Ls;")
    public static class186 field7137 = new class186(83, 12);

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field7136;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field7138;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIII)I")
    public static final int method2904(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            method2908((byte) -104, -89, -45, -115);
        }
        field7134++;
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        return (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
    public static final void method2905(byte arg0) {
        field7132++;
        if (arg0 < 19) {
            method2905((byte) 39);
        }
        for (class436 var1 = (class436) class143.field2417.method1892(118); var1 != null; var1 = (class436) class143.field2417.method1893((byte) -2)) {
            if (class518.field7511 == null) {
                var1.method1676(true);
            } else if (class62.field1268 >= var1.field6486) {
                int var2 = class87.field1784[var1.field6488];
                if (var2 == 0) {
                    class50 var3 = class211.method1435(var1.field6477, var1.field6480, var1.field6487);
                    if (var3 instanceof class237) {
                        class124.method986(var1.field6477, var1.field6480, var1.field6487);
                        class237 var4 = (class237) var3;
                        if (var4.field3664 != null) {
                            class325.method2069(var1.field6477, var1.field6480, var1.field6487, var4.field3664, null);
                        }
                    }
                } else if (var2 == 1) {
                    class210 var5 = class498.method3008(var1.field6477, var1.field6480, var1.field6487);
                    if (var5 instanceof class33) {
                        class268.method1703(var1.field6477, var1.field6480, var1.field6487);
                        class33 var6 = (class33) var5;
                        if (var6.field511 != null) {
                            class385.method2361(var1.field6477, var1.field6480, var1.field6487, var6.field511, null);
                        }
                    }
                } else if (var2 == 2) {
                    class402 var9 = class479.method2859(var1.field6477, var1.field6480, var1.field6487, field7138 == null ? (field7138 = method2910("rj")) : field7138);
                    if (var9 instanceof class110) {
                        class106.method911(var1.field6477, var1.field6480, var1.field6487, field7138 == null ? (field7138 = method2910("rj")) : field7138);
                        class110 var10 = (class110) var9;
                        if (var10.field2018 != null) {
                            class234.method1538(var10.field2018, false);
                        }
                    }
                } else if (var2 == 3) {
                    class311 var7 = class296.method1911(var1.field6477, var1.field6480, var1.field6487);
                    if (var7 instanceof class65) {
                        class146.method1081(var1.field6477, var1.field6480, var1.field6487);
                        class65 var8 = (class65) var7;
                        if (var8.field1320 != null) {
                            class146.method1079(var1.field6477, var1.field6480, var1.field6487, var8.field1320);
                        }
                    }
                }
                var1.method1676(true);
            } else if (class62.field1268 == var1.field6479) {
                int var11 = class87.field1784[var1.field6488];
                if (var11 == 0) {
                    class50 var12 = class211.method1435(var1.field6477, var1.field6480, var1.field6487);
                    if (var12 instanceof class237) {
                        var1.method1676(true);
                    } else if (class359.method2210(var1.field6477, var1.field6480, var1.field6487) == null) {
                        class237 var13 = new class237(var1.field6488, var1.field6481, var1.field6491, var1.field6482, var1.field6478, var12);
                        class325.method2069(var1.field6477, var1.field6480, var1.field6487, var13, null);
                    } else {
                        var1.method1676(true);
                    }
                } else if (var11 == 1) {
                    class210 var21 = class498.method3008(var1.field6477, var1.field6480, var1.field6487);
                    if (var21 instanceof class33) {
                        var1.method1676(true);
                    } else if (class335.method2109(var1.field6477, var1.field6480, var1.field6487) == null) {
                        class33 var22 = new class33(var1.field6488, var1.field6481, var1.field6491, var1.field6482, var1.field6478, var21);
                        class385.method2361(var1.field6477, var1.field6480, var1.field6487, var22, null);
                    } else {
                        var1.method1676(true);
                    }
                } else if (var11 == 2) {
                    class402 var14 = class479.method2859(var1.field6477, var1.field6480, var1.field6487, field7138 == null ? (field7138 = method2910("rj")) : field7138);
                    if (var14 instanceof class110) {
                        var1.method1676(true);
                    } else {
                        class106.method911(var1.field6477, var1.field6480, var1.field6487, field7138 == null ? (field7138 = method2910("rj")) : field7138);
                        class306 var15 = class123.field2142.method1530((byte) -39, var1.field6485);
                        int var16;
                        int var17;
                        if (var1.field6481 == 1 || var1.field6481 == 3) {
                            var16 = var15.field4601;
                            var17 = var15.field4595;
                        } else {
                            var16 = var15.field4595;
                            var17 = var15.field4601;
                        }
                        class110 var18 = new class110(var1.field6488, var1.field6481, var1.field6477, var1.field6491, var1.field6482, var1.field6478, var1.field6480, var1.field6480 + var17 - 1, var1.field6487, var1.field6487 + var16 - 1, var14);
                        class234.method1538(var18, false);
                    }
                } else if (var11 == 3) {
                    class311 var19 = class296.method1911(var1.field6477, var1.field6480, var1.field6487);
                    if (var19 instanceof class65) {
                        var1.method1676(true);
                    } else {
                        class65 var20 = new class65(var1.field6491, var1.field6482, var1.field6478, var19);
                        class146.method1079(var1.field6477, var1.field6480, var1.field6487, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
    public static final int method2906(byte arg0, int arg1) {
        field7133++;
        return arg0 == -25 ? arg1 & 0x3FF : -17;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIZBII)V")
    public static final void method2907(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        class309.field4689 = arg2;
        class195.field3138 = arg5;
        class239.field3715 = arg6;
        class422.field6356 = arg0;
        field7136++;
        class268.field4063 = arg1;
        if (arg4 != 53) {
            return;
        }
        if (arg3 && class422.field6356 >= 100) {
            class432.field6435 = class239.field3715 * 128 + 64;
            class509.field7427 = class268.field4063 * 128 + 64;
            class428.field6406 = class483.method2899(class211.field3371, class509.field7427, class432.field6435, false) - class195.field3138;
        }
        class510.field7435 = 2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIII)I")
    public static final int method2908(byte arg0, int arg1, int arg2, int arg3) {
        field7135++;
        int var4 = 255 - arg3;
        if (arg0 > -51) {
            field7131 = null;
        }
        int var5 = ((arg1 & 0xFF00) * arg3 & 0xFF0000 | (arg1 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method2909(int arg0) {
        field7131 = null;
        if (arg0 != 1) {
            method2908((byte) 26, 125, 89, -68);
        }
        field7137 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2910(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class78 {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field1100 = -1;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 6)
    public static final boolean method532(int arg0, String arg1) {
        field1099++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 < 60) {
            method533((byte) -99);
        }
        for (int var2 = 0; var2 < class61.field875; var2++) {
            if (arg1.equalsIgnoreCase(class61.field858[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class191.field3129.field5216)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 35)
    public static final void method533(byte arg0) {
        field1095++;
        if (class8.field124) {
            return;
        }
        if (class57.field803) {
            class330.field5090 = (float) ((int) class330.field5090 - 65 & 0xFFFFFF80);
        } else {
            class64.field931 += (-class64.field931 - 24.0F) / 2.0F;
        }
        if (arg0 != -121) {
            field1096 = 16;
        }
        class33.field444 = true;
        class8.field124 = true;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 62)
    public static final void method534(int arg0) {
        if (arg0 != 15141) {
            field1096 = -1;
        }
        class327 var1 = (class327) class273.field4399.method1240(3);
        field1097++;
        while (var1 != null) {
            if (var1.field5062 > 0) {
                var1.field5062--;
            }
            if (var1.field5062 != 0) {
                if (var1.field5048 > 0) {
                    var1.field5048--;
                }
                if (var1.field5048 == 0 && var1.field5060 >= 1 && var1.field5046 >= 1 && var1.field5060 <= 102 && var1.field5046 <= 102 && (var1.field5055 < 0 || class155.method1111((byte) -69, var1.field5055, var1.field5056))) {
                    class145.method1076(var1.field5046, var1.field5055, var1.field5051, var1.field5058, (byte) 45, var1.field5060, var1.field5056, var1.field5045);
                    var1.field5048 = -1;
                    if (var1.field5055 == var1.field5052 && var1.field5052 == -1) {
                        var1.method1212((byte) 78);
                    } else if (var1.field5055 == var1.field5052 && var1.field5059 == var1.field5045 && var1.field5065 == var1.field5056) {
                        var1.method1212((byte) 90);
                    }
                }
            } else if (var1.field5052 < 0 || class155.method1111((byte) -69, var1.field5052, var1.field5065)) {
                class145.method1076(var1.field5046, var1.field5052, var1.field5051, var1.field5058, (byte) 121, var1.field5060, var1.field5065, var1.field5059);
                var1.method1212((byte) 106);
            }
            var1 = (class327) class273.field4399.method1235(false);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIBI)V", line = 120)
    public static final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg0 >= 0 && arg2 >= 0 && arg0 < 103 && arg2 < 103) {
            if (arg7 == 0) {
                class225 var8 = class296.method2114(arg5, arg0, arg2);
                if (var8 != null) {
                    int var9 = (int) (var8.field3595 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 2) {
                        var8.field3599 = new class175(var9, 2, arg4 + 4, arg5, arg0, arg2, arg3, false, var8.field3599);
                        var8.field3594 = new class175(var9, 2, arg4 + 1 & 0x3, arg5, arg0, arg2, arg3, false, var8.field3594);
                    } else {
                        var8.field3599 = new class175(var9, arg1, arg4, arg5, arg0, arg2, arg3, false, var8.field3599);
                    }
                }
            }
            if (arg7 == 1) {
                class38 var10 = class224.method1591(arg5, arg0, arg2);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field488 >>> 32);
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field485 = new class175(var11, 4, arg4, arg5, arg0, arg2, arg3, false, var10.field485);
                    } else if (arg1 == 6) {
                        var10.field485 = new class175(var11, 4, arg4 + 4, arg5, arg0, arg2, arg3, false, var10.field485);
                    } else if (arg1 == 7) {
                        var10.field485 = new class175(var11, 4, (arg4 + 2 & 0x3) + 4, arg5, arg0, arg2, arg3, false, var10.field485);
                    } else if (arg1 == 8) {
                        var10.field485 = new class175(var11, 4, arg4 + 4, arg5, arg0, arg2, arg3, false, var10.field485);
                        var10.field494 = new class175(var11, 4, (arg4 + 2 & 0x3) + 4, arg5, arg0, arg2, arg3, false, var10.field494);
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class153 var12 = class61.method411(arg5, arg0, arg2);
                if (var12 != null) {
                    var12.field2373 = new class175(Integer.MAX_VALUE & (int) (var12.field2358 >>> 32), arg1, arg4, arg5, arg0, arg2, arg3, false, var12.field2373);
                }
            }
            if (arg7 == 3) {
                class113 var13 = class178.method1340(arg5, arg0, arg2);
                if (var13 != null) {
                    var13.field1728 = new class175(Integer.MAX_VALUE & (int) (var13.field1729 >>> 32), 22, arg4, arg5, arg0, arg2, arg3, false, var13.field1728);
                }
            }
        }
        field1098++;
        if (arg6 != -97) {
            field1096 = -87;
        }
    }
}

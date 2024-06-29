import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class95 extends Canvas {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field1205;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1211 = "Prepared sound engine";

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Leh;")
    public static class137 field1208;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILpd;)Lrd;")
    public static final class126 method528(int arg0, class96 arg1) {
        field1206++;
        int var2 = 85 % ((19 - arg0) / 37);
        return new class126(arg1.method564(-88), arg1.method564(-128), arg1.method564(-95), arg1.method564(-80), arg1.method598(-1235752501), arg1.method598(-1235752501), arg1.method584(255));
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class95(Component arg0) {
        this.field1205 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method529(int arg0) {
        if (arg0 != 74) {
            method528(-9, (class96) null);
        }
        field1213++;
        if (class48.field611.toLowerCase().indexOf("microsoft") != -1) {
            class271.field4334[219] = 42;
            class271.field4334[188] = 71;
            class271.field4334[186] = 57;
            class271.field4334[189] = 26;
            class271.field4334[220] = 74;
            class271.field4334[190] = 72;
            class271.field4334[191] = 73;
            class271.field4334[192] = 58;
            class271.field4334[223] = 28;
            class271.field4334[222] = 59;
            class271.field4334[221] = 43;
            class271.field4334[187] = 27;
            return;
        }
        class271.field4334[46] = 72;
        class271.field4334[92] = 74;
        class271.field4334[44] = 71;
        if (class48.field619 == null) {
            class271.field4334[192] = 58;
            class271.field4334[222] = 59;
        } else {
            class271.field4334[222] = 58;
            class271.field4334[192] = 28;
            class271.field4334[520] = 59;
        }
        class271.field4334[47] = 73;
        class271.field4334[91] = 42;
        class271.field4334[93] = 43;
        class271.field4334[45] = 26;
        class271.field4334[59] = 57;
        class271.field4334[61] = 27;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZIIIILwl;Lq;IIIIBI)Lwl;")
    public static final class158 method530(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class158 arg6, class165 arg7, int arg8, int arg9, int arg10, int arg11, byte arg12, int arg13) {
        field1204++;
        long var14 = ((long) arg11 << 48) + ((long) arg10 << 32) + (long) ((arg3 << 16) + (arg13 - -(arg9 << 24)));
        class158 var16 = (class158) class136.field2155.method1693(var14, 84);
        if (var16 == null) {
            byte var17;
            if (arg13 == 1) {
                var17 = 9;
            } else if (arg13 == 2) {
                var17 = 12;
            } else if (arg13 == 3) {
                var17 = 15;
            } else if (arg13 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class205 var20 = new class205(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int var21 = var20.method1433(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class174.field2753[var33] * var30 + arg4 >> 16;
                    int var35 = arg5 + (class174.field2759[var33] * var31) >> 16;
                    var22[var23][var32] = var20.method1433(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                short var27 = (short) (((arg10 & 0x7F) * var26 + (arg11 & 0x7F) * var25 & 0x7F00) + ((arg10 & 0x380) * var26 + (arg11 & 0x380) * var25 & 0x38000) + ((arg10 & 0xFC00) * var26 + (arg11 & 0xFC00) * var25 & 0xFC0000) >> 8);
                byte var28 = (byte) (arg3 * var26 + arg9 * var25 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1447(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method1447(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method1447(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method1421(64, 768, -50, -10, -50);
            class136.field2155.method1694(true, var14, var16);
        }
        if (arg12 != -128) {
            return null;
        }
        int var36 = arg13 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg6.method841();
        if (arg1) {
            if (arg8 > 640 && arg8 < 1408) {
                var40 = var36 + 128;
            }
            if (arg8 > 1152 && arg8 < 1920) {
                var39 = var36 + 128;
            }
            if (arg8 > 1664 || arg8 < 384) {
                var37 -= 128;
            }
            if (arg8 > 128 && arg8 < 896) {
                var38 -= 128;
            }
        }
        if (var38 > var41) {
            var41 = var38;
        }
        int var42 = arg6.method836();
        if (var39 < var42) {
            var42 = var39;
        }
        class39 var43 = null;
        int var44 = arg6.method851();
        int var45 = arg6.method823();
        if (var45 > var40) {
            var45 = var40;
        }
        if (var37 > var44) {
            var44 = var37;
        }
        if (arg7 != null) {
            int var46 = arg7.field2624[arg0];
            var43 = class19.method105(var46 >> 16, false);
            arg0 = var46 & 0xFFFF;
        }
        class158 var47;
        if (var43 == null) {
            var47 = var16.method821(true, true, true);
            var47.method849((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method838((var41 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method821(!var43.method215(arg0, -22272), !var43.method213(27, arg0), true);
            var47.method849((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method838((var41 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method1103(var43, arg0);
        }
        if (arg8 != 0) {
            var47.method850(arg8);
        }
        class125 var48 = (class125) var47;
        if (class166.method1148(class244.field4011, arg4 + var41, arg5 + var44, (byte) 88) != arg2 || arg2 != class166.method1148(class244.field4011, arg4 + var42, arg5 + var45, (byte) 76)) {
            for (int var49 = 0; var49 < var48.field1938; var49++) {
                var48.field1957[var49] += class166.method1148(class244.field4011, var48.field1952[var49] + arg4, var48.field1965[var49] + arg5, (byte) 81) - arg2;
            }
            var48.field1972 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public static final void method531(int arg0, int arg1) {
        if (arg0 != 128) {
            field1208 = null;
        }
        field1202++;
        if (class283.field4519 == null || class283.field4519.length < arg1) {
            class283.field4519 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!se", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1205.paint(arg0);
        field1214++;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static void method532(int arg0) {
        field1208 = null;
        field1211 = null;
        if (arg0 != 17936) {
            method530(2, false, 54, -97, -118, 22, (class158) null, (class165) null, 21, -25, 116, -53, (byte) -36, 30);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLeh;Leh;)V")
    public static final void method533(byte arg0, class137 arg1, class137 arg2) {
        class57.field732 = arg2;
        field1200++;
        class80.field994 = arg1;
        if (arg0 != -68) {
            method528(111, (class96) null);
        }
    }

    @OriginalMember(owner = "client!se", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1212++;
        this.field1205.update(arg0);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
    public static final int method534(int arg0) {
        field1209++;
        return arg0 == 128 ? 6 : 14;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
    public static final void method535(int arg0, int arg1) {
        field1203++;
        class3.field29.method1695(arg1, arg0 ^ arg0);
    }
}

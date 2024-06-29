import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class115 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1760 = 255;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Llm;")
    public static class210 field1764;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIBIIILnj;Lof;IZ)Lnj;", line = 7)
    public static final class100 method790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class100 arg10, class272 arg11, int arg12, boolean arg13) {
        field1763++;
        long var14 = ((long) arg1 << 48) + ((long) arg7 << 32) + (long) ((arg9 << 24) + arg3 - -(arg0 << 16));
        class100 var16 = (class100) class246.field3666.method2180(var14, (byte) 31);
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class119 var19 = new class119((var17 * var18) + 1, var17 * var18 * 2 + -var17, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int var21 = var19.method870(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var20[var23];
                int var25 = var20[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg8 + (class148.field2239[var27] * var25) >> 16;
                    int var29 = class148.field2229[var27] * var24 + arg5 >> 16;
                    var22[var23][var26] = var19.method870(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                short var33 = (short) (((arg1 & 0x380) * var31 + (arg7 & 0x380) * var32 & 0x38000) + ((arg1 & 0x7F) * var31 + (arg7 & 0x7F) * var32 & 0x7F00) + ((arg1 & 0xFC00) * var31 + (arg7 & 0xFC00) * var32 & 0xFC0000) >> 8);
                byte var34 = (byte) (arg0 * var32 + arg9 * var31 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method855(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var33, var34);
                    } else {
                        var19.method855(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var19.method855(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var19.method853(64, 768, -50, -10, -50);
            class246.field3666.method2175(var14, var16, -74);
        }
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = arg10.method497();
        if (arg6 != 119) {
            return (class100) null;
        }
        int var40 = var36;
        int var41 = var36;
        if (arg13) {
            if (arg4 > 1152 && arg4 < 1920) {
                var40 = var36 + 128;
            }
            if (arg4 > 1664 || arg4 < 384) {
                var37 -= 128;
            }
            if (arg4 > 640 && arg4 < 1408) {
                var41 = var36 + 128;
            }
            if (arg4 > 128 && arg4 < 896) {
                var38 -= 128;
            }
        }
        if (var39 < var38) {
            var39 = var38;
        }
        int var42 = arg10.method494();
        if (var42 > var40) {
            var42 = var40;
        }
        class134 var43 = null;
        int var44 = arg10.method502();
        if (var44 < var37) {
            var44 = var37;
        }
        int var45 = arg10.method515();
        if (var41 < var45) {
            var45 = var41;
        }
        if (arg11 != null) {
            int var46 = arg11.field4160[arg12];
            var43 = class149.method1076(var46 >> 16, 1);
            arg12 = var46 & 0xFFFF;
        }
        class100 var47;
        if (var43 == null) {
            var47 = var16.method510(true, true, true);
            var47.method507((var42 - var39) / 2, 128, (var45 - var44) / 2);
            var47.method508((var39 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method510(!var43.method984(arg12, (byte) -24), !var43.method985(arg12, 2), true);
            var47.method507((var42 - var39) / 2, 128, (var45 - var44) / 2);
            var47.method508((var39 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method709(var43, arg12);
        }
        if (arg4 != 0) {
            var47.method512(arg4);
        }
        if (class117.field1817) {
            class83 var50 = (class83) var47;
            if (class74.method473(arg5 + var44, arg8 - -var39, 64, class180.field2697) != arg2 || class74.method473(arg5 + var45, arg8 + var42, 64, class180.field2697) != arg2) {
                for (int var51 = 0; var51 < var50.field1180; var51++) {
                    var50.field1165[var51] += class74.method473(var50.field1168[var51] + arg5, var50.field1191[var51] + arg8, 64, class180.field2697) - arg2;
                }
                var50.field1184.field3720 = false;
                var50.field1162.field3559 = false;
            }
        } else {
            class77 var48 = (class77) var47;
            if (arg2 != class74.method473(arg5 + var44, arg8 + var39, 64, class180.field2697) || arg2 != class74.method473(arg5 + var45, arg8 + var42, 64, class180.field2697)) {
                for (int var49 = 0; var49 < var48.field1009; var49++) {
                    var48.field1004[var49] += class74.method473(var48.field1012[var49] + arg5, var48.field1027[var49] - -arg8, 64, class180.field2697) - arg2;
                }
                var48.field1003 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 240)
    public static void method791(int arg0) {
        if (arg0 == 128) {
            field1764 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 265)
    public static final String method792(long arg0, byte arg1) {
        field1759++;
        class91.field1357.setTime(new Date(arg0));
        if (arg1 != -26) {
            method790(19, 99, -20, 77, -21, -66, (byte) 58, -34, -16, -75, (class100) null, (class272) null, -27, true);
        }
        int var3 = class91.field1357.get(7);
        int var4 = class91.field1357.get(5);
        int var5 = class91.field1357.get(2);
        int var6 = class91.field1357.get(1);
        int var7 = class91.field1357.get(11);
        int var8 = class91.field1357.get(12);
        int var9 = class91.field1357.get(13);
        return class287.field4342[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class316.field4776[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}

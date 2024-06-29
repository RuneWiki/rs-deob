import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class64 {

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field1222 = 0;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lij;")
    public static class50 field1226 = class78.method578(121, "scape main");

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[S")
    public static short[] field1227;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILwg;IIIIIIIZLig;III)Lwg;")
    public static final class98 method496(int arg0, class98 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class186 arg10, int arg11, int arg12, int arg13) {
        if (arg4 >= -88) {
            method497(79);
        }
        field1221++;
        long var14 = ((long) arg12 << 48) + (long) ((arg7 << 16) + (arg3 + (arg5 << 24))) + ((long) arg6 << 32);
        class98 var16 = (class98) class205.field3395.method764((byte) 70, var14);
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
            int[] var19 = new int[] { 64, 96, 128 };
            class202 var20 = new class202(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int var21 = var20.method1347(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class13.field313[var33] * var31 + arg8 >> 16;
                    int var35 = class13.field311[var33] * var30 + arg0 >> 16;
                    var22[var23][var32] = var20.method1347(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg6 & 0xFC00) * var26 + (arg12 & 0xFC00) * var25 & 0xFC0000) + ((arg6 & 0x7F) * var26 + (arg12 & 0x7F) * var25 & 0x7F00) + ((arg6 & 0x380) * var26 + (arg12 & 0x380) * var25 & 0x38000) >> 8);
                byte var28 = (byte) (arg5 * var25 + arg7 * var26 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1355(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method1355(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method1355(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method1362(64, 768, -50, -10, -50);
            class205.field3395.method765((byte) -126, var16, var14);
        }
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg9) {
            if (arg2 > 640 && arg2 < 1408) {
                var40 = var36 + 128;
            }
            if (arg2 > 1152 && arg2 < 1920) {
                var39 = var36 + 128;
            }
            if (arg2 > 128 && arg2 < 896) {
                var38 -= 128;
            }
            if (arg2 > 1664 || arg2 < 384) {
                var37 -= 128;
            }
        }
        int var41 = arg1.method754();
        if (var38 > var41) {
            var41 = var38;
        }
        int var42 = arg1.method745();
        if (var42 > var39) {
            var42 = var39;
        }
        int var43 = arg1.method750();
        class227 var44 = null;
        int var45 = arg1.method739();
        if (var43 < var37) {
            var43 = var37;
        }
        if (arg10 != null) {
            int var46 = arg10.field3043[arg13];
            var44 = class19.method144(-15731, var46 >> 16);
            arg13 = var46 & 0xFFFF;
        }
        if (var40 < var45) {
            var45 = var40;
        }
        class98 var47;
        if (var44 == null) {
            var47 = var16.method737(true, true);
            var47.method746((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method753((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method737(!var44.method1551(2, arg13), true);
            var47.method746((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method753((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method741(var44, arg13);
        }
        if (arg2 != 0) {
            var47.method744(arg2);
        }
        class149 var48 = (class149) var47;
        if (arg11 != class187.method1260((byte) 19, arg8 + var41, arg0 + var43, class201.field3312) || class187.method1260((byte) 73, arg8 + var42, arg0 + var45, class201.field3312) != arg11) {
            for (int var49 = 0; var49 < var48.field2568; var49++) {
                var48.field2556[var49] += class187.method1260((byte) 25, var48.field2553[var49] + arg8, var48.field2570[var49] + arg0, class201.field3312) - arg11;
            }
            var48.field2579 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method497(int arg0) {
        if (arg0 != -1686) {
            method503(60, 111);
        }
        field1227 = null;
        field1226 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILda;)[Lea;")
    public static final class67[] method498(int arg0, int arg1, int arg2, class22 arg3) {
        if (arg1 != 64) {
            field1222 = 106;
        }
        field1217++;
        return class79.method581((byte) -118, arg2, arg3, arg0) ? class239.method1625(20479) : null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Lud;")
    public static final class139 method499(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1235;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method500(int arg0, int arg1) {
        field1228++;
        class173.field2882.method770(true, arg0);
        int var2 = 1 / ((69 - arg1) / 34);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
    public abstract void method275(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILda;)Loe;")
    public static final class207 method501(int arg0, int arg1, class22 arg2) {
        field1218++;
        if (class182.method1237((byte) 43, arg0, arg2)) {
            if (arg1 != 0) {
                field1226 = null;
            }
            return class217.method1437((byte) -108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(III)V")
    public abstract void method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)Lij;")
    public static final class50 method502(int arg0, int arg1) {
        if (arg1 <= 33) {
            field1226 = null;
        }
        field1216++;
        class50 var2 = class78.method579(arg0, -26225);
        for (int var3 = var2.method396(1) - 3; var3 > 0; var3 -= 3) {
            var2 = class80.method589(new class50[] { var2.method363(0, var3, 0), class16.field358, var2.method397(64, var3) }, 28743);
        }
        if (var2.method396(1) > 9) {
            return class80.method589(new class50[] { class167.field2828, var2.method363(0, var2.method396(1) - 8, 0), class6.field70, class121.field2130, var2, class121.field2127 }, 28743);
        } else if (var2.method396(1) > 6) {
            return class80.method589(new class50[] { class78.field1448, var2.method363(0, var2.method396(1) - 4, 0), class1.field12, class121.field2130, var2, class121.field2127 }, 28743);
        } else {
            return class80.method589(new class50[] { class71.field1369, var2, class192.field3195 }, 28743);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
    public abstract void method276(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)Lua;")
    public static final class240 method503(int arg0, int arg1) {
        field1220++;
        class240 var2 = (class240) class63.field1209.method912((long) arg0, (byte) 100);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class155.field2706.method190((byte) -102, arg0, arg1);
        class240 var4 = new class240();
        if (var3 != null) {
            var4.method1638(new class217(var3), 4334);
        }
        class63.field1209.method913(var4, 105, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method504(byte arg0) {
        if (arg0 > -28) {
            field1222 = 115;
        }
        field1225++;
        if (!class174.method1198(0) && class93.field1746 != class201.field3312) {
            class245.method1669(class201.field3312, class31.field619, false, class239.field4067.field3980[0], class20.field422, -6748, class239.field4067.field3978[0]);
        } else if (class201.field3312 != class177.field2957) {
            class177.field2957 = class201.field3312;
            class129.method920(class201.field3312, -127);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(III)V")
    public class64(int arg0, int arg1, int arg2) {
        this.field1223 = arg2;
        this.field1219 = arg1;
        this.field1224 = arg0;
    }
}

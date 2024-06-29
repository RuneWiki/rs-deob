import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class72 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ldf;")
    private static class51 field1150 = class46.method233("Loading fonts )2 ", 100);

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Ldf;")
    public static class51 field1147 = field1150;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lja;")
    public static class55 field1146;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[[[I")
    public static int[][][] field1151;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)V")
    public static final void method499(int arg0, byte arg1, int arg2) {
        field1149++;
        for (int var3 = 0; var3 < class240.field4172; var3++) {
            class95 var4 = class115.method847(var3, 113);
            if (var4 != null) {
                int var5 = var4.field1566;
                if (var5 >= 0 && !class73.field1166.method469(var5, 64)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field1576 >= 0) {
                    int var10 = var4.field1576;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg2 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class73.field1161[class52.method333(96, var12, (byte) -19)];
                } else if (var5 >= 0) {
                    var6 = class73.field1161[class52.method333(96, class73.field1166.method460(-1765, var5), (byte) -117)];
                } else if (var4.field1574 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field1574;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class73.field1161[class52.method333(96, var9, (byte) 70)];
                }
                class172.field2808[var3 + 1] = var6;
            }
        }
        if (arg1 <= 0) {
            field1150 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static final void method500(int arg0) {
        field1143++;
        class28.field400.method1350((byte) 112);
        class261.field4557.method1350((byte) 125);
        class221.field3832.method1350((byte) 112);
        if (arg0 != -270164696) {
            method506(false, -53, 4, -74, -112, -123, -5, (class151) null, 96, -63, 75, (class65) null, -35, 103);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Lmb;")
    public static final class151 method501(int arg0, byte arg1) {
        field1142++;
        if (arg1 <= 9) {
            return null;
        }
        class151 var2 = (class151) class151.field2519.method1357((byte) 70, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class171.field2798.method828(class43.method220(841577095, arg0), (byte) 114, class233.method1620(arg0, 67));
        class151 var4 = new class151();
        if (var3 != null) {
            var4.method1088(new class121(var3), false);
        }
        var4.method1079(-1);
        class151.field2519.method1351(var4, 2, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method502(byte[] arg0, byte arg1, boolean arg2) {
        if (arg1 >= -75) {
            method506(false, -26, -127, -90, -123, 83, 76, (class151) null, -116, -3, -11, (class65) null, 18, 3);
        }
        field1148++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class44.field709) {
            try {
                class26 var3 = (class26) Class.forName("si").getDeclaredConstructor().newInstance();
                var3.method137(207, arg0);
                return var3;
            } catch (Throwable var4) {
                class44.field709 = true;
            }
        }
        return arg2 ? class221.method1516(arg0, 13087) : arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
    public static final void method503(int arg0, int arg1, int arg2, int arg3) {
        class97 var4 = class27.field395[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class195 var5 = var4.field1616;
        if (var5 != null) {
            var5.field3272 = var5.field3272 * arg3 / 16;
            var5.field3251 = var5.field3251 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILu;)V")
    public static final void method504(int arg0, class111 arg1) {
        class70.field1125 = arg1;
        field1144++;
        if (arg0 != 30727) {
            field1146 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method505(int arg0) {
        field1146 = null;
        field1147 = null;
        field1151 = null;
        field1150 = null;
        if (arg0 >= -104) {
            field1145 = -99;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIIIIIILmb;IIILtb;II)Ltb;")
    public static final class65 method506(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class151 arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        long var14 = ((long) arg1 << 32) + ((long) arg9 << 48) + (long) ((arg2 << 24) + (arg13 << 16) + arg12);
        class65 var16 = (class65) class261.field4561.method1357((byte) 58, var14);
        if (var16 == null) {
            byte var17;
            if (arg12 == 1) {
                var17 = 9;
            } else if (arg12 == 2) {
                var17 = 12;
            } else if (arg12 == 3) {
                var17 = 15;
            } else if (arg12 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class178 var20 = new class178(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int var21 = var20.method1263(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg10 + (class73.field1155[var33] * var30) >> 16;
                    int var35 = class73.field1167[var33] * var31 + arg8 >> 16;
                    var22[var23][var32] = var20.method1263(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg2 * var25 + arg13 * var26 >> 8);
                short var28 = (short) (((arg1 & 0x7F) * var26 + (arg9 & 0x7F) * var25 & 0x7F00) + ((arg1 & 0x380) * var26 + (arg9 & 0x380) * var25 & 0x38000) + ((arg1 & 0xFC00) * var26 + (arg9 & 0xFC00) * var25 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1274(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1274(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1274(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1246(64, 768, -50, -10, -50);
            class261.field4561.method1351(var16, arg5, var14);
        }
        field1141++;
        int var36 = arg12 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg11.method443();
        if (arg0) {
            if (arg6 > 128 && arg6 < 896) {
                var38 -= 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var39 = var36 + 128;
            }
            if (arg6 > 640 && arg6 < 1408) {
                var40 = var36 + 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var37 -= 128;
            }
        }
        int var42 = arg11.method435();
        if (var41 < var38) {
            var41 = var38;
        }
        int var43 = arg11.method452();
        if (var42 > var39) {
            var42 = var39;
        }
        if (var43 < var37) {
            var43 = var37;
        }
        int var44 = arg11.method440();
        if (var44 > var40) {
            var44 = var40;
        }
        class130 var45 = null;
        if (arg7 != null) {
            int var46 = arg7.field2539[arg3];
            var45 = class11.method58(var46 >> 16, (byte) -115);
            arg3 = var46 & 0xFFFF;
        }
        class65 var47;
        if (var45 == null) {
            var47 = var16.method449(true, true);
            var47.method441((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method448((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method449(!var45.method959(arg3, arg5 - 2), true);
            var47.method441((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method448((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method450(var45, arg3);
        }
        if (arg6 != 0) {
            var47.method437(arg6);
        }
        if (arg5 != 2) {
            method505(113);
        }
        class137 var48 = (class137) var47;
        if (arg4 != class207.method1424(class257.field4496, arg10 + var41, (byte) 103, arg8 + var43) || class207.method1424(class257.field4496, arg10 + var42, (byte) 34, arg8 + var44) != arg4) {
            for (int var49 = 0; var49 < var48.field2272; var49++) {
                var48.field2280[var49] += class207.method1424(class257.field4496, var48.field2263[var49] + arg10, (byte) 18, var48.field2292[var49] + arg8) - arg4;
            }
            var48.field2269 = false;
        }
        return var47;
    }
}

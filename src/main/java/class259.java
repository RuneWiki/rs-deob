import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class259 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3750 = 0;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lbaa;")
    public static class130 field3747 = new class130(8);

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field3752 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Luu;")
    public static class237 field3748;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public abstract void method118(byte arg0);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIILpia;IIILka;IIILha;I)Lka;")
    public static final class284 method1752(int arg0, int arg1, int arg2, int arg3, class57 arg4, int arg5, int arg6, int arg7, class284 arg8, int arg9, int arg10, int arg11, class548 arg12, int arg13) {
        field3746++;
        if (arg8 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg4 != null) {
            int var15 = var14 | arg4.method409(arg6, false, -1, 0);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg13 << 48) + ((long) arg7 << 32) + (long) ((arg1 << 16) + (arg10 << 24) + arg9);
        class690 var18 = class63.field980;
        class284 var19;
        synchronized (class63.field980) {
            var19 = (class284) class63.field980.method3898((byte) -42, var16);
        }
        if (var19 == null || arg12.method1484(var19.method1703(), var14) != 0) {
            if (var19 != null) {
                var14 = arg12.method1390(var14, var19.method1703());
            }
            byte var20;
            if (arg9 == 1) {
                var20 = 9;
            } else if (arg9 == 2) {
                var20 = 12;
            } else if (arg9 == 3) {
                var20 = 15;
            } else if (arg9 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class133 var23 = new class133((var20 * var21) + 1, var20 * 2 * var21 + -var20, 0);
            int var24 = var23.method836(0, 0, (byte) -48, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class24.field312[var30] * var27 >> 14;
                    int var32 = class24.field308[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method836(var32, var31, (byte) -48, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg1 * var35 + arg10 * var34 >> 8);
                short var37 = (short) (((arg7 & 0xFC00) * var35 + (arg13 & 0xFC00) * var34 & 0xFC0000) + ((arg7 & 0x7F) * var35 + (arg13 & 0x7F) * var34 & 0x7F00) + ((arg7 & 0x380) * var35 + (arg13 & 0x380) * var34 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method840(-115, var24, (byte) 1, var37, (byte) -1, var25[0][(var38 + 1) % var20], var36, (short) -1, var25[0][var38]);
                    } else {
                        var23.method840(-99, var25[var33 - 1][var38], (byte) 1, var37, (byte) -1, var25[var33 - 1][(var38 + 1) % var20], var36, (short) -1, var25[var33][(var38 + 1) % var20]);
                        var23.method840(-84, var25[var33 - 1][var38], (byte) 1, var37, (byte) -1, var25[var33][(var38 + 1) % var20], var36, (short) -1, var25[var33][var38]);
                    }
                }
            }
            var19 = arg12.method1463(var23, var14, class248.field3650, 64, 768);
            class690 var39 = class63.field980;
            synchronized (class63.field980) {
                class63.field980.method3899(121, var19, var16);
            }
        }
        int var40 = arg8.method1678();
        int var41 = arg8.method1655();
        int var42 = 36 / ((-arg5 - 51) / 33);
        int var43 = arg8.method1693();
        int var44 = arg8.method1666();
        class526 var45 = null;
        if (arg4 != null) {
            int var46 = arg4.field821[arg6];
            var45 = class607.field8188.method2996(var46 >> 16, (byte) -122);
            arg6 = var46 & 0xFFFF;
        }
        class284 var47;
        if (var45 == null) {
            var47 = var19.method1659((byte) 3, var14, true);
            var47.method1663(var41 - var40 >> 1, 128, var44 - var43 >> 1);
            var47.method1672(var40 + var41 >> 1, 0, var43 + var44 >> 1);
        } else {
            var47 = var19.method1659((byte) 3, var14, true);
            var47.method1663(var41 - var40 >> 1, 128, var44 - var43 >> 1);
            var47.method1672(var40 + var41 >> 1, 0, var43 + var44 >> 1);
            var47.method1884(arg6, var45, 0);
        }
        if (arg11 != 0) {
            var47.method1694(arg11);
        }
        if (arg0 != 0) {
            var47.method1690(arg0);
        }
        if (arg2 != 0) {
            var47.method1672(0, arg2, 0);
        }
        return var47;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Z")
    public abstract boolean method129(int arg0, int arg1);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public abstract void method128(byte arg0);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1753(int arg0) {
        field3747 = null;
        if (arg0 == 16515072) {
            field3748 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLha;)V")
    public static final void method1754(byte arg0, class548 arg1) {
        field3751++;
        if (!(class284.field4103 >= 2 || class160.field2235) || class731.field10159 != null) {
            return;
        }
        String var2;
        if (class160.field2235 && class284.field4103 < 2) {
            var2 = class488.field6817 + class155.field2151.method978(class120.field1576, (byte) -115) + class468.field6500 + " ->";
        } else if (class46.field584 && class224.field3014.method129(81, 99) && class284.field4103 > 2) {
            var2 = class286.method1898(class655.field8752, (byte) 126);
        } else {
            class558 var3 = class655.field8752;
            if (var3 == null) {
                return;
            }
            var2 = class286.method1898(var3, (byte) 121);
            int[] var4 = null;
            if (class158.method994(var3.field7754, -128)) {
                var4 = class291.field4179.method1313((int) var3.field7762, true).field9306;
            } else if (var3.field7761 != -1) {
                var4 = class291.field4179.method1313(var3.field7761, true).field9306;
            } else if (class131.method825(501, var3.field7754)) {
                class234 var7 = (class234) class372.field5245.method812(116, (long) ((int) var3.field7762));
                if (var7 != null) {
                    class679 var8 = var7.field3471;
                    class123 var9 = var8.field9436;
                    if (var9.field1700 != null) {
                        var9 = var9.method773(class124.field1712, false);
                    }
                    if (var9 != null) {
                        var4 = var9.field1703;
                    }
                }
            } else if (class669.method3774(var3.field7754, 0)) {
                Object var5 = null;
                class220 var6;
                if (var3.field7754 == 1009) {
                    var6 = class20.field192.method716(6, (int) var3.field7762);
                } else {
                    var6 = class20.field192.method716(6, (int) (var3.field7762 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field2966 != null) {
                    var6 = var6.method1297(class124.field1712, 21559);
                }
                if (var6 != null) {
                    var4 = var6.field2877;
                }
            }
            if (var4 != null) {
                var2 = var2 + class90.method619(false, var4);
            }
        }
        int var10 = 80 / ((-arg0 - 61) / 36);
        if (class284.field4103 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class284.field4103 - 2) + class155.field2144.method978(class120.field1576, (byte) -121);
        }
        if (class99.field1380 != null) {
            class402 var12 = class99.field1380.method4197(arg1, true);
            if (var12 == null) {
                var12 = class758.field10575;
            }
            var12.method2518(class519.field7245, class99.field1380.field10393, class220.field2935, class99.field1380.field10501, 659053272, var2, class99.field1380.field10388, class280.field4067, class328.field4609, class11.field91, class748.field10298, class99.field1380.field10517, class99.field1380.field10444, class719.field10005, class99.field1380.field10495);
            class282.method1882((byte) 34, class748.field10298[3], class748.field10298[1], class748.field10298[2], class748.field10298[0]);
        } else if (class147.field2054 != null && class540.field7508 == class289.field4140) {
            int var11 = class758.field10575.method2511(class519.field7245, class719.field10005, class550.field7652 + 16, 31, class77.field1117 + 4, 0, class220.field2935, class11.field91, 16777215, var2);
            class282.method1882((byte) 34, 16, class550.field7652, var11 + class535.field7417.method1133(106, var2), class77.field1117 + 4);
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lup;")
    public abstract class241 method121(int arg0);
}

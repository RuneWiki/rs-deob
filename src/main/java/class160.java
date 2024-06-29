import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class160 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lso;")
    public class127 field2463;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Z")
    public static boolean field2464 = true;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2470++;
        if (arg4 >= -17) {
            return;
        }
        class168.field2579 = -1;
        class311.field4880 = -1;
        float var5 = (float) class336.field5350 / (float) class336.field5356;
        int var6 = arg1;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg3 - (arg1 - var6) / 2;
        int var9 = arg0 - (arg2 - var7) / 2;
        class315.field4950 = class336.field5356 * var8 / var6;
        class63.field752 = class336.field5350 * var9 / var7;
        class349.method2424((byte) 123);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BC)Z", line = 32)
    public static final boolean method1159(byte arg0, char arg1) {
        field2466++;
        int var2 = 76 / ((-arg0 - 80) / 40);
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()V", line = 42)
    public static final void method1160() {
        if (class236.field3634 != null) {
            for (int var0 = 0; var0 < class236.field3634.length; var0++) {
                for (int var1 = 0; var1 < class236.field3633; var1++) {
                    for (int var2 = 0; var2 < class293.field4607; var2++) {
                        class236.field3634[var0][var1][var2] = null;
                    }
                }
            }
        }
        class62.field748 = (class175[][]) null;
        if (class6.field76 != null) {
            for (int var3 = 0; var3 < class6.field76.length; var3++) {
                for (int var4 = 0; var4 < class236.field3633; var4++) {
                    for (int var5 = 0; var5 < class293.field4607; var5++) {
                        class6.field76[var3][var4][var5] = null;
                    }
                }
            }
        }
        class120.field1669 = (class175[][]) null;
        class135.field2026 = 0;
        if (class123.field1700 != null) {
            for (int var6 = 0; var6 < class135.field2026; var6++) {
                class123.field1700[var6] = null;
            }
        }
        if (class342.field5422 != null) {
            for (int var7 = 0; var7 < class214.field3253; var7++) {
                class342.field5422[var7] = null;
            }
            class214.field3253 = 0;
        }
        if (class301.field4699 != null) {
            for (int var8 = 0; var8 < class301.field4699.length; var8++) {
                class301.field4699[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[F", line = 158)
    public static final float[] method1161(int arg0, int arg1) {
        field2462++;
        float var2 = class26.method195() + class26.method193();
        int var3 = class26.method191();
        if (arg1 != 20523) {
            field2464 = false;
        }
        class140.field2112[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFFD625) >> 16) / 255.0F;
        float var5 = (float) ((var3 & 0xFF7F) >> 8) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class140.field2112[2] = var6 * ((float) class261.method1840(arg0, 255) / 255.0F) * var7 * var2;
        class140.field2112[0] = var2 * var4 * ((float) (class261.method1840(arg0, 16749973) >> 16) / 255.0F) * var7;
        class140.field2112[1] = var2 * (float) (class261.method1840(65445, arg0) >> 8) / 255.0F * var5 * var7;
        return class140.field2112;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lrj;B)V", line = 187)
    public static final void method1162(class22 arg0, byte arg1) {
        class81 var2 = null;
        field2460++;
        try {
            class153 var3 = arg0.method167("runescape", 7);
            while (var3.field2419 == 0) {
                class19.method140(1L, 16711680);
            }
            if (var3.field2419 == 1) {
                var2 = (class81) var3.field2421;
                class143 var4 = class250.method1778((byte) -114);
                var2.method528(var4.field2260, var4.field2295, 0, (byte) 69);
            }
            if (arg1 > -124) {
                field2464 = true;
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method532((byte) 124);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIILro;IIZLbf;)Lbf;", line = 224)
    public static final class362 method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class111 arg9, int arg10, int arg11, boolean arg12, class362 arg13) {
        long var14 = ((long) arg1 << 48) + ((long) arg10 << 32) + (long) ((arg0 << 16) + (arg4 - -(arg2 << 24)));
        field2461++;
        class362 var16 = (class362) class344.field5462.method380(arg3, var14);
        if (var16 == null) {
            byte var17;
            if (arg4 == 1) {
                var17 = 9;
            } else if (arg4 == 2) {
                var17 = 12;
            } else if (arg4 == 3) {
                var17 = 15;
            } else if (arg4 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            int[][] var20 = new int[var18][var17];
            class193 var21 = new class193((var17 * var18) + 1, var17 * var18 * 2 + -var17, 0);
            int var22 = var21.method1338(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class104.field1435[var27] * var25 + arg11 >> 16;
                    int var29 = arg7 + (class104.field1426[var27] * var24) >> 16;
                    var20[var23][var26] = var21.method1338(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                short var33 = (short) (((arg1 & 0x7F) * var31 + (arg10 & 0x7F) * var32 & 0x7F00) + ((arg1 & 0xFC00) * var31 + (arg10 & 0xFC00) * var32 & 0xFC0000) + ((arg1 & 0x380) * var31 + (arg10 & 0x380) * var32 & 0x38000) >> 8);
                byte var34 = (byte) (arg0 * var32 + arg2 * var31 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var21.method1325(var22, var20[0][(var35 + 1) % var17], var20[0][var35], (byte) 1, var33, var34);
                    } else {
                        var21.method1325(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var17], var20[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var21.method1325(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var17], var20[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var21.method1324(64, 768, -50, -10, -50);
            class344.field5462.method377(var14, var16, -1);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg12) {
            if (arg8 > 1664 || arg8 < 384) {
                var38 -= 128;
            }
            if (arg8 > 128 && arg8 < 896) {
                var37 -= 128;
            }
            if (arg8 > 1152 && arg8 < 1920) {
                var39 = var36 + 128;
            }
            if (arg8 > 640 && arg8 < 1408) {
                var40 = var36 + 128;
            }
        }
        int var41 = arg13.method811();
        int var42 = arg13.method813();
        int var43 = arg13.method830();
        if (var38 > var43) {
            var43 = var38;
        }
        if (var41 < var37) {
            var41 = var37;
        }
        if (var42 > var39) {
            var42 = var39;
        }
        int var44 = arg13.method803();
        if (var40 < var44) {
            var44 = var40;
        }
        class293 var45 = null;
        if (arg9 != null) {
            int var46 = arg9.field1533[arg5];
            var45 = class352.method2437(-924, var46 >> 16);
            arg5 = var46 & 0xFFFF;
        }
        class362 var47;
        if (var45 == null) {
            var47 = var16.method797(true, true, true);
            var47.method831((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method854((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method797(!var45.method2091(-63, arg5), !var45.method2088(arg5, (byte) 39), true);
            var47.method831((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method854((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method2525(var45, arg5);
        }
        if (arg8 != 0) {
            var47.method839(arg8);
        }
        if (class272.field4317) {
            class124 var50 = (class124) var47;
            if (class14.method80(arg11 + var43, class219.field3290, arg7 + var41, (byte) -126) != arg6 || arg6 != class14.method80(arg11 + var44, class219.field3290, arg7 + var42, (byte) -126)) {
                for (int var51 = 0; var51 < var50.field1730; var51++) {
                    var50.field1723[var51] += class14.method80(var50.field1708[var51] + arg11, class219.field3290, var50.field1741[var51] + arg7, (byte) -126) - arg6;
                }
                var50.field1720.field881 = false;
                var50.field1743.field1326 = false;
            }
        } else {
            class133 var48 = (class133) var47;
            if (class14.method80(arg11 + var43, class219.field3290, arg7 + var41, (byte) -126) != arg6 || arg6 != class14.method80(arg11 + var44, class219.field3290, arg7 + var42, (byte) -126)) {
                for (int var49 = 0; var49 < var48.field1930; var49++) {
                    var48.field1923[var49] += class14.method80(var48.field1928[var49] + arg11, class219.field3290, var48.field1924[var49] + arg7, (byte) -126) - arg6;
                }
                var48.field1941 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIII)V", line = 450)
    public class160(int arg0, int arg1, int arg2, int arg3) {
        class127 var5 = class28.method210(true, arg0);
        this.field2469 = arg2;
        this.field2467 = arg1;
        this.field2465 = arg3;
        if (class272.field4317 || var5.field1826 == -1) {
            this.field2463 = var5;
        } else {
            this.field2463 = class28.method210(true, var5.field1826);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lso;III)V", line = 466)
    public class160(class127 arg0, int arg1, int arg2, int arg3) {
        this.field2463 = arg0;
        this.field2467 = arg1;
        this.field2465 = arg3;
        this.field2469 = arg2;
    }
}

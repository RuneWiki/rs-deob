import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class159 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field2715 = new Object();

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lsc;")
    private static class181 field2723 = class149.method967(255, "Unable to find ");

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lsc;")
    public static class181 field2724 = class149.method967(255, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lsc;")
    public static class181 field2725 = field2723;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lre;")
    public static class78 field2722 = new class78(5000);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Ljb;")
    public static class11 field2728;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1064(int arg0) {
        field2728 = null;
        field2725 = null;
        field2715 = null;
        field2723 = null;
        if (arg0 != -1) {
            method1071(83);
        }
        field2724 = null;
        field2722 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjb;IZ)Lpd;")
    public static final class48 method1065(int arg0, class11 arg1, int arg2, boolean arg3) {
        field2720++;
        if (arg3) {
            return null;
        } else if (class242.method1646(arg2, (byte) -64, arg1, arg0)) {
            return class211.method1398((byte) -45);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1066(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        field2726++;
        byte[] var3 = new byte[var2];
        class252.method1718(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZIIIIIIII)Z")
    public static final boolean method1067(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class256.field4485[var13][var40] = 0;
                class183.field3216[var13][var40] = 99999999;
            }
        }
        class256.field4485[arg12][arg0] = 99;
        class183.field3216[arg12][arg0] = 0;
        field2716++;
        int var14 = arg12;
        int var15 = arg0;
        byte var16 = 0;
        boolean var17 = false;
        int var18 = 0;
        class94.field1510[var16] = arg12;
        int var41 = var16 + 1;
        class26.field456[var16] = arg0;
        int[][] var19 = class109.field1784[class38.field581].field142;
        label372: while (var41 != var18) {
            var14 = class94.field1510[var18];
            var15 = class26.field456[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg6 == var14 && arg3 == var15) {
                var17 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class109.field1784[class38.field581].method70(var14, false, arg8, var15, arg7 - 1, arg6, arg3, arg5)) {
                    var17 = true;
                    break;
                }
                if (arg7 < 10 && class109.field1784[class38.field581].method60(arg8, var15, var14, arg3, arg6, arg5, arg11 ^ 0x7E, arg7 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg9 != 0 && class109.field1784[class38.field581].method72(arg6, arg3, arg2, arg5, -30832, arg1, arg9, var15, var14)) {
                var17 = true;
                break;
            }
            int var31 = class183.field3216[var14][var15] + 1;
            if (var14 > 0 && class256.field4485[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg5 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg5 - 1) {
                        class94.field1510[var41] = var14 - 1;
                        class26.field456[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class256.field4485[var14 - 1][var15] = 2;
                        class183.field3216[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class256.field4485[var14 + 1][var15] == 0 && (var19[var14 + arg5][var15] & 0x12C0183) == 0 && (var19[arg5 + var14][arg5 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if ((arg5 - 1) <= var33) {
                        class94.field1510[var41] = var14 + 1;
                        class26.field456[var41] = var15;
                        class256.field4485[var14 + 1][var15] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class183.field3216[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 + arg5][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class256.field4485[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - (1 - arg5)][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg5 - 1 <= var34) {
                        class94.field1510[var41] = var14;
                        class26.field456[var41] = var15 - 1;
                        class256.field4485[var14][var15 - 1] = 1;
                        class183.field3216[var14][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class256.field4485[var14][var15 + 1] == 0 && (var19[var14][var15 + arg5] & 0x12C0138) == 0 && (var19[var14 + arg5 - 1][arg5 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= (arg5 - 1)) {
                        class94.field1510[var41] = var14;
                        class26.field456[var41] = var15 + 1;
                        class256.field4485[var14][var15 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class183.field3216[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg5 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class256.field4485[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg5 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg5 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg5 - 1)) {
                        class94.field1510[var41] = var14 - 1;
                        class26.field456[var41] = var15 - 1;
                        class256.field4485[var14 - 1][var15 - 1] = 3;
                        class183.field3216[var14 - 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class256.field4485[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg5][var15 - 1] & 0x12C0183) == 0 && (var19[arg5 + var14][var15 + arg5 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg5 - 1 <= var37) {
                        class94.field1510[var41] = var14 + 1;
                        class26.field456[var41] = var15 - 1;
                        class256.field4485[var14 + 1][var15 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class183.field3216[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[arg5 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var37 + var14 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class256.field4485[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg5 + var15] & 0x12C0138) == 0 && (var19[var14][arg5 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (arg5 - 1 <= var38) {
                        class94.field1510[var41] = var14 - 1;
                        class26.field456[var41] = var15 + 1;
                        class256.field4485[var14 - 1][var15 + 1] = 6;
                        class183.field3216[var14 - 1][var15 + 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][arg5 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class256.field4485[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg5 + var15] & 0x12C0138) == 0 && (var19[arg5 + var14][arg5 + var15] & 0x12C01E0) == 0 && (var19[arg5 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg5 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][arg5 + var15] & 0x12C01F8) != 0 || (var19[arg5 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class94.field1510[var41] = var14 + 1;
                class26.field456[var41] = var15 + 1;
                class256.field4485[var14 + 1][var15 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class183.field3216[var14 + 1][var15 + 1] = var31;
            }
        }
        class253.field4412 = 0;
        if (arg11 != 4) {
            return false;
        }
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg6 - var22; var23 <= (arg6 + var22); var23++) {
                for (int var24 = arg3 - var22; var24 <= (arg3 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class183.field3216[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg3) {
                            var26 = arg3 - var24;
                        } else if ((arg3 - (1 - arg9)) < var24) {
                            var26 = var24 - (arg9 - 1) - arg3;
                        }
                        if (var23 < arg6) {
                            var25 = arg6 - var23;
                        } else if (var23 > (arg6 + arg1 - 1)) {
                            var25 = var23 - (arg6 - (1 - arg1));
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && var20 > class183.field3216[var23][var24]) {
                            var15 = var24;
                            var21 = var27;
                            var14 = var23;
                            var20 = class183.field3216[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg12 == var14 && arg0 == var15) {
                return false;
            }
            class253.field4412 = 1;
        }
        byte var28 = 0;
        class94.field1510[var28] = var14;
        int var42 = var28 + 1;
        class26.field456[var28] = var15;
        int var29;
        int var30 = var29 = class256.field4485[var14][var15];
        while (arg12 != var14 || arg0 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class94.field1510[var42] = var14;
                class26.field456[var42++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class256.field4485[var14][var15];
        }
        if (var42 > 0) {
            class203.method1360(var42, arg10, 117);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
    public static final boolean method1068(byte arg0) throws IOException {
        field2717++;
        if (class216.field3713 == null) {
            return false;
        } else if (arg0 == -67) {
            int var1 = class216.field3713.method315((byte) -120);
            if (var1 == 0) {
                return false;
            }
            if (class100.field1680 == -1) {
                var1--;
                class216.field3713.method316(0, (byte) 127, class76.field1223.field3977, 1);
                class76.field1223.field3933 = 0;
                class100.field1680 = class76.field1223.method544(true);
                class108.field1772 = class22.field394[class100.field1680];
            }
            if (class108.field1772 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class216.field3713.method316(0, (byte) -121, class76.field1223.field3977, 1);
                class108.field1772 = class76.field1223.field3977[0] & 0xFF;
            }
            if (class108.field1772 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class216.field3713.method316(0, (byte) -60, class76.field1223.field3977, 2);
                class76.field1223.field3933 = 0;
                class108.field1772 = class76.field1223.method1535(2);
            }
            if (var1 < class108.field1772) {
                return false;
            }
            class76.field1223.field3933 = 0;
            class216.field3713.method316(0, (byte) 102, class76.field1223.field3977, class108.field1772);
            class52.field812 = class182.field3211;
            class203.field3506 = 0;
            class182.field3211 = class138.field2259;
            class138.field2259 = class100.field1680;
            if (class100.field1680 == 194) {
                int var2 = class76.field1223.method1529(-32494);
                class228 var3 = (class228) class165.field2807.method1424(true, (long) var2);
                if (var3 != null) {
                    class69.method479(var3, arg0 ^ 0x231B, true);
                }
                if (class210.field3608 != null) {
                    class218.method1453((byte) -100, class210.field3608);
                    class210.field3608 = null;
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 63) {
                class12.field250 = class76.field1223.method1516((byte) 82);
                class7.field122 = class247.field4318;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 146) {
                class181 var4 = class76.field1223.method1549(arg0 + 130);
                int var5 = class76.field1223.method1566((byte) -68);
                class175 var6 = class52.method394(var5, false);
                if (!var4.method1202(var6.field3053, -4557)) {
                    var6.field3053 = var4;
                    class218.method1453((byte) -110, var6);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 117) {
                int var7 = class76.field1223.method1558((byte) 114);
                int var8 = class76.field1223.method1554(0);
                int var9 = class76.field1223.method1531((byte) -43);
                class44.method300(var8, arg0 + 67);
                class174.method1158(-8210, var7, var9);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 211) {
                int var10 = class76.field1223.method1566((byte) -68);
                int var11 = class76.field1223.method1523(-14661);
                int var12 = class76.field1223.method1541((byte) 125);
                class175 var13 = class52.method394(var10, false);
                var13.field2954 = 0;
                var13.field3036 = var13.field3002 = var12;
                var13.field3040 = 0;
                var13.field2929 = var13.field2993 = var11;
                class218.method1453((byte) -111, var13);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 161) {
                class181 var14 = class76.field1223.method1549(68);
                Object[] var15 = new Object[var14.method1226(-458531486) + 1];
                for (int var16 = var14.method1226(-458531486) - 1; var16 >= 0; var16--) {
                    if (var14.method1217(var16, true) == 115) {
                        var15[var16 + 1] = class76.field1223.method1549(65);
                    } else {
                        var15[var16 + 1] = Integer.valueOf(class76.field1223.method1529(-32494));
                    }
                }
                var15[0] = Integer.valueOf(class76.field1223.method1529(-32494));
                class94 var17 = new class94();
                var17.field1489 = var15;
                class27.method225(var17, (byte) 120);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 164) {
                int var18 = class76.field1223.method1552((byte) 86);
                int var19 = class76.field1223.method1548(-100001);
                if (var19 == 65535) {
                    var19 = -1;
                }
                class175 var20 = class52.method394(var18, false);
                if (var20.field3017 != 1 || var20.field2966 != var19) {
                    var20.field3017 = 1;
                    var20.field2966 = var19;
                    class218.method1453((byte) -119, var20);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 215) {
                int var21 = class76.field1223.method1535(arg0 ^ 0xFFFFFFBF);
                int var22 = class76.field1223.method1516((byte) 82);
                int var23 = class76.field1223.method1548(-100001);
                class44.method300(var21, arg0 ^ 0xFFFFFFBD);
                class174.method1158(-8210, var23, var22);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 66) {
                int var24 = class76.field1223.method1531((byte) -43);
                int var25 = class76.field1223.method1548(-100001);
                class175 var26 = class52.method394(var24, false);
                if (var26 != null && var26.field3069 == 0) {
                    if (var26.field3033 - var26.field3041 < var25) {
                        var25 = var26.field3033 - var26.field3041;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var26.field2946 != var25) {
                        var26.field2946 = var25;
                        class218.method1453((byte) -87, var26);
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 128) {
                int var27 = class76.field1223.method1552((byte) 86);
                int var28 = class76.field1223.method1535(2);
                class115.method759(var27, var28, -105);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 135) {
                if (class243.field4227 != -1) {
                    class51.method380(0, arg0 + 68, class243.field4227);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 204) {
                class179.method1192(127, class76.field1223.method1549(51));
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 88) {
                class145.method938(true);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 4) {
                class182.method1250((byte) 16);
                class20.method188(29);
                class111.field1821 += 32;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 99) {
                boolean var29 = class76.field1223.method1539(-24286) == 1;
                int var30 = class76.field1223.method1529(arg0 - 32427);
                class175 var31 = class52.method394(var30, false);
                if (var31.field2944 != var29) {
                    var31.field2944 = var29;
                    class218.method1453((byte) -103, var31);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 127) {
                int var32 = class76.field1223.method1543(arg0 ^ 0xFFFFFF42);
                int var33 = class76.field1223.method1548(-100001);
                int var34 = class76.field1223.method1548(-100001);
                class178 var35 = class129.field2140[var33];
                if (var35 != null) {
                    class160.method1074(var35, (byte) -127, var32, var34);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 125) {
                long var36 = class76.field1223.method1514(22128);
                class181 var38 = class245.method1657(class261.method1774(true, class76.field1223).method1218(-32));
                class202.method1357(var38, 6, (byte) -101, class19.method184(arg0 ^ 0x694B, var36).method1223((byte) -57));
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 94) {
                int var39 = class76.field1223.method1516((byte) 82);
                int var40 = class76.field1223.method1516((byte) 82);
                int var41 = class76.field1223.method1535(2);
                int var42 = class76.field1223.method1516((byte) 82);
                int var43 = class76.field1223.method1516((byte) 82);
                class74.method515(true, var42, var39, var40, arg0 ^ 0xFFFFFFEF, var41, var43);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 81) {
                int var44 = class76.field1223.method1516((byte) 82);
                class203 var45 = new class203();
                int var46 = var44 >> 6;
                var45.field3503 = var44 & 0x3F;
                var45.field3488 = class76.field1223.method1516((byte) 82);
                if (var45.field3488 >= 0 && var45.field3488 < class18.field318.length) {
                    if (var45.field3503 == 1 || var45.field3503 == 10) {
                        var45.field3496 = class76.field1223.method1535(2);
                        class76.field1223.field3933 += 3;
                    } else if (var45.field3503 >= 2 && var45.field3503 <= 6) {
                        if (var45.field3503 == 2) {
                            var45.field3482 = 64;
                            var45.field3492 = 64;
                        }
                        if (var45.field3503 == 3) {
                            var45.field3492 = 64;
                            var45.field3482 = 0;
                        }
                        if (var45.field3503 == 4) {
                            var45.field3492 = 64;
                            var45.field3482 = 128;
                        }
                        if (var45.field3503 == 5) {
                            var45.field3482 = 64;
                            var45.field3492 = 0;
                        }
                        if (var45.field3503 == 6) {
                            var45.field3492 = 128;
                            var45.field3482 = 64;
                        }
                        var45.field3503 = 2;
                        var45.field3495 = class76.field1223.method1535(arg0 + 69);
                        var45.field3484 = class76.field1223.method1535(arg0 + 69);
                        var45.field3499 = class76.field1223.method1516((byte) 82);
                    }
                    var45.field3491 = class76.field1223.method1535(2);
                    if (var45.field3491 == 65535) {
                        var45.field3491 = -1;
                    }
                    class74.field1187[var46] = var45;
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 142) {
                int var47 = class76.field1223.method1516((byte) 82);
                int var48 = class76.field1223.method1516((byte) 82);
                int var49 = class76.field1223.method1535(2);
                int var50 = class76.field1223.method1516((byte) 82);
                int var51 = class76.field1223.method1516((byte) 82);
                class210.method1392(var50, var47, var49, var51, var48, -1845493760);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 177) {
                class168.field2829 = class247.field4318;
                long var52 = class76.field1223.method1514(arg0 + 22195);
                if (var52 == 0L) {
                    class127.field2104 = 0;
                    class97.field1564 = null;
                    class190.field3362 = null;
                    class100.field1680 = -1;
                    class61.field933 = null;
                    return true;
                }
                long var54 = class76.field1223.method1514(22128);
                class97.field1564 = class19.method184(-26890, var54);
                class190.field3362 = class19.method184(-26890, var52);
                class218.field3739 = class76.field1223.method1563(-255688184);
                int var56 = class76.field1223.method1516((byte) 82);
                if (var56 == 255) {
                    class100.field1680 = -1;
                    return true;
                }
                class127.field2104 = var56;
                class243[] var57 = new class243[100];
                for (int var58 = 0; var58 < class127.field2104; var58++) {
                    var57[var58] = new class243();
                    var57[var58].field606 = class76.field1223.method1514(22128);
                    var57[var58].field4219 = class19.method184(-26890, var57[var58].field606);
                    var57[var58].field4216 = class76.field1223.method1535(2);
                    var57[var58].field4218 = class76.field1223.method1563(arg0 - 255688117);
                    var57[var58].field4222 = class76.field1223.method1549(125);
                    if (class137.field2250 == var57[var58].field606) {
                        class152.field2530 = var57[var58].field4218;
                    }
                }
                boolean var59 = false;
                int var60 = class127.field2104;
                while (var60 > 0) {
                    boolean var61 = true;
                    var60--;
                    for (int var62 = 0; var62 < var60; var62++) {
                        if (var57[var62].field4219.method1209(100, var57[var62 + 1].field4219) > 0) {
                            var61 = false;
                            class243 var63 = var57[var62];
                            var57[var62] = var57[var62 + 1];
                            var57[var62 + 1] = var63;
                        }
                    }
                    if (var61) {
                        break;
                    }
                }
                class100.field1680 = -1;
                class61.field933 = var57;
                return true;
            } else if (class100.field1680 == 120) {
                class20.method188(arg0 ^ 0xFFFFFFFD);
                class55.field848 = class76.field1223.method1516((byte) 82);
                class100.field1680 = -1;
                class55.field851 = class247.field4318;
                return true;
            } else if (class100.field1680 == 40) {
                int var64 = class76.field1223.method1558((byte) -122);
                int var65 = class76.field1223.method1529(-32494);
                class162.method1084(var65, var64, -43);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 23) {
                int var66 = class76.field1223.method1529(-32494);
                int var67 = class76.field1223.method1535(arg0 ^ 0xFFFFFFBF);
                class175 var68;
                if (var66 < 0) {
                    var68 = null;
                } else {
                    var68 = class52.method394(var66, false);
                }
                if (var68 != null) {
                    for (int var69 = 0; var69 < var68.field3065.length; var69++) {
                        var68.field3065[var69] = 0;
                        var68.field2935[var69] = 0;
                    }
                }
                if (var66 < -70000) {
                    var67 += 32768;
                }
                class229.method1499(0, var67);
                int var70 = class76.field1223.method1535(arg0 ^ 0xFFFFFFBF);
                for (int var71 = 0; var71 < var70; var71++) {
                    int var72 = class76.field1223.method1513(-12137);
                    if (var72 == 255) {
                        var72 = class76.field1223.method1531((byte) -43);
                    }
                    int var73 = class76.field1223.method1548(arg0 ^ 0x186E2);
                    if (var68 != null && var71 < var68.field3065.length) {
                        var68.field3065[var71] = var73;
                        var68.field2935[var71] = var72;
                    }
                    class132.method850(var67, (byte) -105, var73 - 1, var71, var72);
                }
                if (var68 != null) {
                    class218.method1453((byte) -86, var68);
                }
                class20.method188(107);
                class236.field4110[class5.method43(class190.field3361++, 31)] = class5.method43(var67, 32767);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 92) {
                class102.field1701 = class76.field1223.method1554(0) * 30;
                class55.field851 = class247.field4318;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 100) {
                int var74 = class76.field1223.method1516((byte) 82);
                int var75 = class76.field1223.method1548(arg0 ^ 0x186E2);
                class115.method759(var74, var75, -128);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 207) {
                class109.field1781 = class76.field1223.method1516((byte) 82);
                class123.field2018 = class76.field1223.method1516((byte) 82);
                class221.field3819 = class76.field1223.method1516((byte) 82);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 0) {
                byte[] var76 = new byte[class108.field1772];
                class76.field1223.method551(0, -1011838301, var76, class108.field1772);
                class145.method944((byte) -108, true, class1.method9(0, arg0 ^ 0x42, class108.field1772, var76));
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 35) {
                class178.method1188(true);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 118) {
                class217.method1435(class76.field1223, 25764);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 45) {
                int var77 = class76.field1223.method1548(-100001);
                int var78 = class76.field1223.method1531((byte) -43);
                int var79 = class76.field1223.method1548(-100001);
                int var80 = class76.field1223.method1558((byte) 119);
                if ((var78 >> 30) != 0) {
                    int var85 = (var78 & 0x30E4F86F) >> 28;
                    int var86 = ((var78 & 0xFFFC616) >> 14) - class253.field4420;
                    int var87 = (var78 & 0x3FFF) - class222.field3844;
                    if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                        int var88 = var86 * 128 + 64;
                        int var89 = var87 * 128 + 64;
                        class21 var90 = new class21(var79, var85, var88, var89, class232.method1606(var85, (byte) -61, var89, var88) - var77, var80, class237.field4125);
                        class172.field2883.method1689(new class55(var90), 125);
                    }
                } else if ((var78 >> 29) != 0) {
                    int var81 = var78 & 0xFFFF;
                    class178 var82 = class129.field2140[var81];
                    if (var82 != null) {
                        var82.field2673 = 0;
                        var82.field2679 = var77;
                        var82.field2687 = 0;
                        var82.field2682 = var79;
                        var82.field2662 = class237.field4125 + var80;
                        if (var82.field2682 == 65535) {
                            var82.field2682 = -1;
                        }
                        if (var82.field2662 > class237.field4125) {
                            var82.field2673 = -1;
                        }
                    }
                } else if ((var78 >> 28) != 0) {
                    int var83 = var78 & 0xFFFF;
                    class116 var84;
                    if (class199.field3452 == var83) {
                        var84 = class258.field4507;
                    } else {
                        var84 = class39.field602[var83];
                    }
                    if (var84 != null) {
                        var84.field2682 = var79;
                        var84.field2687 = 0;
                        var84.field2662 = class237.field4125 + var80;
                        var84.field2679 = var77;
                        var84.field2673 = 0;
                        if (class237.field4125 < var84.field2662) {
                            var84.field2673 = -1;
                        }
                        if (var84.field2682 == 65535) {
                            var84.field2682 = -1;
                        }
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 223) {
                int var91 = class76.field1223.method1558((byte) 99);
                class181 var92 = class76.field1223.method1549(21);
                int var93 = class76.field1223.method1558((byte) 87);
                class44.method300(var91, arg0 + 67);
                class155.method1037(arg0 ^ 0xFFFFFFBD, var92, var93);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 140) {
                class221.field3815 = class108.field1772 / 8;
                for (int var94 = 0; var94 < class221.field3815; var94++) {
                    class256.field4483[var94] = class76.field1223.method1514(22128);
                    class218.field3755[var94] = class19.method184(-26890, class256.field4483[var94]);
                }
                class100.field1680 = -1;
                class7.field122 = class247.field4318;
                return true;
            } else if (class100.field1680 == 246) {
                class259.field4523 = class76.field1223.method1543(arg0 + 322);
                class213.field3670 = class76.field1223.method1539(-24286);
                while (class76.field1223.field3933 < class108.field1772) {
                    class100.field1680 = class76.field1223.method1516((byte) 82);
                    class177.method1184(arg0 + 28429);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 154) {
                int var95 = class76.field1223.method1535(2);
                class37.method268(var95, 126);
                class236.field4110[class5.method43(31, class190.field3361++)] = class5.method43(32767, var95);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 222) {
                int var96 = class76.field1223.method1516((byte) 82);
                if (class76.field1223.method1516((byte) 82) == 0) {
                    class69.field1112[var96] = new class19();
                } else {
                    class76.field1223.field3933--;
                    class69.field1112[var96] = new class19(class76.field1223);
                }
                class8.field159 = class247.field4318;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 116) {
                int var97 = class76.field1223.method1515(-101);
                int var98 = class76.field1223.method1529(-32494);
                class175 var99 = class52.method394(var98, false);
                if (var99.field3063 != var97 || var97 == -1) {
                    var99.field2998 = 0;
                    var99.field3038 = 0;
                    var99.field3063 = var97;
                    class218.method1453((byte) -74, var99);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 27) {
                class181 var100 = class76.field1223.method1549(26);
                if (var100.method1212(0, class207.field3553)) {
                    class181 var101 = var100.method1235(0, 119, var100.method1220((byte) -97, class1.field14));
                    long var102 = var101.method1197(-108);
                    boolean var104 = false;
                    for (int var105 = 0; var105 < class221.field3815; var105++) {
                        if (class256.field4483[var105] == var102) {
                            var104 = true;
                            break;
                        }
                    }
                    if (!var104 && class145.field2362 == 0) {
                        class202.method1357(class169.field2840, 4, (byte) -114, var101);
                    }
                } else if (var100.method1212(0, class178.field3123)) {
                    class181 var106 = var100.method1235(0, 56, var100.method1220((byte) -80, class1.field14));
                    long var107 = var106.method1197(arg0 - 47);
                    boolean var109 = false;
                    for (int var110 = 0; var110 < class221.field3815; var110++) {
                        if (class256.field4483[var110] == var107) {
                            var109 = true;
                            break;
                        }
                    }
                    if (!var109 && class145.field2362 == 0) {
                        class181 var111 = var100.method1235(var100.method1220((byte) -122, class1.field14) + 1, 99, var100.method1226(-458531486) - 9);
                        class202.method1357(var111, 8, (byte) -124, var106);
                    }
                } else if (var100.method1212(0, class70.field1119)) {
                    class181 var130 = var100.method1235(0, arg0 ^ 0xFFFFFFFE, var100.method1220((byte) -68, class1.field14));
                    long var131 = var130.method1197(arg0 ^ 0x3A);
                    boolean var133 = false;
                    for (int var134 = 0; var134 < class221.field3815; var134++) {
                        if (class256.field4483[var134] == var131) {
                            var133 = true;
                            break;
                        }
                    }
                    if (!var133 && class145.field2362 == 0) {
                        class202.method1357(class241.field4187, 10, (byte) -98, var130);
                    }
                } else if (var100.method1212(0, class253.field4411)) {
                    class181 var129 = var100.method1235(0, 61, var100.method1220((byte) -61, class253.field4411));
                    class202.method1357(var129, 11, (byte) -122, class241.field4187);
                } else if (var100.method1212(0, class64.field1023)) {
                    class181 var112 = var100.method1235(0, arg0 ^ 0xFFFFFF80, var100.method1220((byte) -60, class64.field1023));
                    if (class145.field2362 == 0) {
                        class202.method1357(var112, 12, (byte) -111, class241.field4187);
                    }
                } else if (var100.method1212(arg0 ^ 0xFFFFFFBD, class157.field2680)) {
                    class181 var128 = var100.method1235(0, 104, var100.method1220((byte) -108, class157.field2680));
                    if (class145.field2362 == 0) {
                        class202.method1357(var128, 13, (byte) -103, class241.field4187);
                    }
                } else if (var100.method1212(arg0 ^ 0xFFFFFFBD, class187.field3309)) {
                    class181 var123 = var100.method1235(0, arg0 ^ 0xFFFFFFCC, var100.method1220((byte) -97, class1.field14));
                    long var124 = var123.method1197(arg0 ^ 0x3A);
                    boolean var126 = false;
                    for (int var127 = 0; var127 < class221.field3815; var127++) {
                        if (class256.field4483[var127] == var124) {
                            var126 = true;
                            break;
                        }
                    }
                    if (!var126 && class145.field2362 == 0) {
                        class202.method1357(class241.field4187, 14, (byte) -128, var123);
                    }
                } else if (var100.method1212(0, class76.field1228)) {
                    class181 var118 = var100.method1235(0, 63, var100.method1220((byte) -71, class1.field14));
                    long var119 = var118.method1197(-128);
                    boolean var121 = false;
                    for (int var122 = 0; var122 < class221.field3815; var122++) {
                        if (class256.field4483[var122] == var119) {
                            var121 = true;
                            break;
                        }
                    }
                    if (!var121 && class145.field2362 == 0) {
                        class202.method1357(class241.field4187, 15, (byte) -99, var118);
                    }
                } else if (var100.method1212(0, class239.field4155)) {
                    class181 var113 = var100.method1235(0, 116, var100.method1220((byte) -110, class1.field14));
                    long var114 = var113.method1197(-124);
                    boolean var116 = false;
                    for (int var117 = 0; var117 < class221.field3815; var117++) {
                        if (class256.field4483[var117] == var114) {
                            var116 = true;
                            break;
                        }
                    }
                    if (!var116 && class145.field2362 == 0) {
                        class202.method1357(class241.field4187, 16, (byte) -122, var113);
                    }
                } else {
                    class202.method1357(var100, 0, (byte) -125, class241.field4187);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 183) {
                class259.field4523 = class76.field1223.method1539(-24286);
                class213.field3670 = class76.field1223.method1513(-12137);
                for (int var135 = class259.field4523; var135 < class259.field4523 + 8; var135++) {
                    for (int var137 = class213.field3670; var137 < (class213.field3670 + 8); var137++) {
                        if (class132.field2183[class38.field581][var135][var137] != null) {
                            class132.field2183[class38.field581][var135][var137] = null;
                            class78.method550(var135, true, var137);
                        }
                    }
                }
                for (class121 var136 = (class121) class257.field4495.method1686((byte) -83); var136 != null; var136 = (class121) class257.field4495.method1683(140)) {
                    if (class259.field4523 <= var136.field1981 && var136.field1981 < class259.field4523 + 8 && class213.field3670 <= var136.field1986 && (class213.field3670 + 8) > var136.field1986 && class38.field581 == var136.field1983) {
                        var136.field1984 = 0;
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 216) {
                class181 var138 = class76.field1223.method1549(115);
                int var139 = class76.field1223.method1539(arg0 ^ 0x5E9F);
                int var140 = class76.field1223.method1516((byte) 82);
                if (var139 >= 1 && var139 <= 8) {
                    if (var138.method1227(30093, class120.field1952)) {
                        var138 = null;
                    }
                    class114.field1852[var139 - 1] = var138;
                    class262.field4575[var139 - 1] = var140 == 0;
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 104) {
                long var141 = class76.field1223.method1514(arg0 ^ 0xFFFFA9CD);
                int var143 = class76.field1223.method1535(arg0 + 69);
                boolean var144 = true;
                int var145 = class76.field1223.method1516((byte) 82);
                if (var141 < 0L) {
                    var144 = false;
                    var141 &= Long.MAX_VALUE;
                }
                class181 var146 = class241.field4187;
                if (var143 > 0) {
                    var146 = class76.field1223.method1549(arg0 + 88);
                }
                class181 var147 = class19.method184(-26890, var141).method1223((byte) -57);
                for (int var148 = 0; var148 < class149.field2483; var148++) {
                    if (class182.field3213[var148] == var141) {
                        if (class140.field2272[var148] != var143) {
                            class140.field2272[var148] = var143;
                            if (var143 > 0) {
                                class202.method1357(class175.method1164(new class181[] { var147, class157.field2643 }, (byte) 123), 5, (byte) -121, class241.field4187);
                            }
                            if (var143 == 0) {
                                class202.method1357(class175.method1164(new class181[] { var147, class169.field2846 }, (byte) 125), 5, (byte) -117, class241.field4187);
                            }
                        }
                        var147 = null;
                        class175.field2947[var148] = var146;
                        class190.field3352[var148] = var145;
                        class248.field4331[var148] = var144;
                        break;
                    }
                }
                if (var147 != null && class149.field2483 < 200) {
                    class182.field3213[class149.field2483] = var141;
                    class5.field100[class149.field2483] = var147;
                    class140.field2272[class149.field2483] = var143;
                    class175.field2947[class149.field2483] = var146;
                    class190.field3352[class149.field2483] = var145;
                    class248.field4331[class149.field2483] = var144;
                    class149.field2483++;
                }
                class7.field122 = class247.field4318;
                boolean var149 = false;
                int var150 = class149.field2483;
                while (var150 > 0) {
                    boolean var151 = true;
                    var150--;
                    for (int var152 = 0; var152 < var150; var152++) {
                        if (class140.field2272[var152] != class62.field947 && class140.field2272[var152 + 1] == class62.field947 || class140.field2272[var152] == 0 && class140.field2272[var152 + 1] != 0) {
                            int var153 = class140.field2272[var152];
                            class140.field2272[var152] = class140.field2272[var152 + 1];
                            class140.field2272[var152 + 1] = var153;
                            class181 var154 = class175.field2947[var152];
                            var151 = false;
                            class175.field2947[var152] = class175.field2947[var152 + 1];
                            class175.field2947[var152 + 1] = var154;
                            class181 var155 = class5.field100[var152];
                            class5.field100[var152] = class5.field100[var152 + 1];
                            class5.field100[var152 + 1] = var155;
                            long var156 = class182.field3213[var152];
                            class182.field3213[var152] = class182.field3213[var152 + 1];
                            class182.field3213[var152 + 1] = var156;
                            int var158 = class190.field3352[var152];
                            class190.field3352[var152] = class190.field3352[var152 + 1];
                            class190.field3352[var152 + 1] = var158;
                            boolean var159 = class248.field4331[var152];
                            class248.field4331[var152] = class248.field4331[var152 + 1];
                            class248.field4331[var152 + 1] = var159;
                        }
                    }
                    if (var151) {
                        break;
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 108) {
                long var160 = class76.field1223.method1514(22128);
                int var162 = class76.field1223.method1535(arg0 + 69);
                class181 var163 = class188.method1301(var162, (byte) 79).method1490(-121, class76.field1223);
                class221.method1467((class181) null, class19.method184(-26890, var160).method1223((byte) -57), -6700, var163, 19, var162);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 129) {
                long var164 = class76.field1223.method1514(22128);
                class76.field1223.method1563(-255688184);
                long var166 = class76.field1223.method1514(22128);
                long var168 = (long) class76.field1223.method1535(2);
                long var170 = (long) class76.field1223.method1508(true);
                int var172 = class76.field1223.method1516((byte) 82);
                int var173 = class76.field1223.method1535(arg0 + 69);
                boolean var174 = false;
                long var175 = (var168 << 32) + var170;
                int var177 = 0;
                label1187: while (true) {
                    if (var177 >= 100) {
                        if (var172 <= 1) {
                            for (int var178 = 0; var178 < class221.field3815; var178++) {
                                if (class256.field4483[var178] == var164) {
                                    var174 = true;
                                    break label1187;
                                }
                            }
                        }
                        break;
                    }
                    if (class149.field2494[var177] == var175) {
                        var174 = true;
                        break;
                    }
                    var177++;
                }
                if (!var174 && class145.field2362 == 0) {
                    class149.field2494[class129.field2147] = var175;
                    class129.field2147 = (class129.field2147 + 1) % 100;
                    class181 var179 = class188.method1301(var173, (byte) 79).method1490(-112, class76.field1223);
                    if (var172 == 2 || var172 == 3) {
                        class221.method1467(class19.method184(-26890, var166).method1223((byte) -57), class175.method1164(new class181[] { class170.field2860, class19.method184(-26890, var164).method1223((byte) -57) }, (byte) 124), arg0 - 6633, var179, 20, var173);
                    } else if (var172 == 1) {
                        class221.method1467(class19.method184(-26890, var166).method1223((byte) -57), class175.method1164(new class181[] { class86.field1368, class19.method184(-26890, var164).method1223((byte) -57) }, (byte) 127), -6700, var179, 20, var173);
                    } else {
                        class221.method1467(class19.method184(arg0 - 26823, var166).method1223((byte) -57), class19.method184(-26890, var164).method1223((byte) -57), -6700, var179, 20, var173);
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 67) {
                int var180 = class76.field1223.method1543(255);
                int var181 = class76.field1223.method1554(0);
                if (var180 == 2) {
                    class94.method623((byte) 28);
                }
                class243.field4227 = var181;
                class115.method762(0, var181);
                class165.method1101(arg0 + 75, false);
                class230.method1512((byte) -121, class243.field4227);
                for (int var182 = 0; var182 < 100; var182++) {
                    class61.field943[var182] = true;
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 208) {
                int var183 = class76.field1223.method1558((byte) 115);
                int var184 = (var183 & 0x7FAA) >> 10;
                int var185 = class76.field1223.method1529(-32494);
                int var186 = var183 & 0x1F;
                class175 var187 = class52.method394(var185, false);
                int var188 = var183 >> 5 & 0x1F;
                int var189 = (var184 << 19) - (-(var188 << 11) - (var186 << 3));
                if (var187.field2969 != var189) {
                    var187.field2969 = var189;
                    class218.method1453((byte) -98, var187);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 169) {
                int var190 = class76.field1223.method1516((byte) 82);
                int var191 = class76.field1223.method1535(2);
                int var192 = class76.field1223.method1552((byte) 86);
                class228 var193 = (class228) class165.field2807.method1424(true, (long) var192);
                if (var193 != null) {
                    class69.method479(var193, arg0 ^ 0x231B, var193.field3913 != var191);
                }
                class265.method1800(var192, var190, var191, -1);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 95) {
                int var194 = class76.field1223.method1529(-32494);
                int var195 = class76.field1223.method1529(arg0 ^ 0x7EAF);
                class228 var196 = (class228) class165.field2807.method1424(true, (long) var194);
                class228 var197 = (class228) class165.field2807.method1424(true, (long) var195);
                if (var197 != null) {
                    class69.method479(var197, -9050, var196 == null || var196.field3913 != var197.field3913);
                }
                if (var196 != null) {
                    var196.method290((byte) -48);
                    class165.field2807.method1422((long) var195, var196, -1);
                }
                class175 var198 = class52.method394(var194, false);
                if (var198 != null) {
                    class218.method1453((byte) -89, var198);
                }
                class175 var199 = class52.method394(var195, false);
                if (var199 != null) {
                    class218.method1453((byte) -93, var199);
                    class66.method469(var199, true, 268100240);
                }
                if (class243.field4227 != -1) {
                    class51.method380(1, 1, class243.field4227);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 2) {
                long var200 = class76.field1223.method1514(22128);
                class76.field1223.method1563(arg0 ^ 0xF3D7DB5);
                long var202 = class76.field1223.method1514(22128);
                long var204 = (long) class76.field1223.method1535(2);
                long var206 = (long) class76.field1223.method1508(true);
                int var208 = class76.field1223.method1516((byte) 82);
                long var209 = (var204 << 32) + var206;
                boolean var211 = false;
                int var212 = 0;
                label1233: while (true) {
                    if (var212 >= 100) {
                        if (var208 <= 1) {
                            if (class116.field1914 == 1 || class11.field241 == 1) {
                                var211 = true;
                            } else {
                                for (int var213 = 0; var213 < class221.field3815; var213++) {
                                    if (class256.field4483[var213] == var200) {
                                        var211 = true;
                                        break label1233;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class149.field2494[var212] == var209) {
                        var211 = true;
                        break;
                    }
                    var212++;
                }
                if (!var211 && class145.field2362 == 0) {
                    class149.field2494[class129.field2147] = var209;
                    class129.field2147 = (class129.field2147 + 1) % 100;
                    class181 var214 = class245.method1657(class261.method1774(true, class76.field1223).method1218(arg0 + 35));
                    if (var208 == 2 || var208 == 3) {
                        class256.method1742(var214, -125, 9, class175.method1164(new class181[] { class170.field2860, class19.method184(-26890, var200).method1223((byte) -57) }, (byte) 123), class19.method184(-26890, var202).method1223((byte) -57));
                    } else if (var208 == 1) {
                        class256.method1742(var214, -109, 9, class175.method1164(new class181[] { class86.field1368, class19.method184(-26890, var200).method1223((byte) -57) }, (byte) 127), class19.method184(arg0 - 26823, var202).method1223((byte) -57));
                    } else {
                        class256.method1742(var214, -112, 9, class19.method184(arg0 ^ 0x694B, var200).method1223((byte) -57), class19.method184(-26890, var202).method1223((byte) -57));
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 98) {
                class207.method1376((byte) 106);
                class100.field1680 = -1;
                return false;
            } else if (class100.field1680 == 192) {
                class25.field439 = class76.field1223.method1516((byte) 82);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 227) {
                int var215 = class76.field1223.method1516((byte) 82);
                int var216 = class76.field1223.method1543(arg0 + 322);
                int var217 = class76.field1223.method1516((byte) 82);
                class38.field581 = var215 >> 1;
                class258.field4507.method1051(var217, (var215 & 0x1) == 1, var216, -6882);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 56 || class100.field1680 == 151 || class100.field1680 == 60 || class100.field1680 == 11 || class100.field1680 == 110 || class100.field1680 == 197 || class100.field1680 == 28 || class100.field1680 == 93 || class100.field1680 == 80 || class100.field1680 == 232 || class100.field1680 == 61 || class100.field1680 == 182) {
                class177.method1184(28362);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 83) {
                byte var218 = class76.field1223.method1521(-102);
                int var219 = class76.field1223.method1535(arg0 ^ 0xFFFFFFBF);
                class162.method1084(var218, var219, arg0 + 15);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 203) {
                long var220 = class76.field1223.method1514(22128);
                long var222 = (long) class76.field1223.method1535(2);
                long var224 = (long) class76.field1223.method1508(true);
                boolean var226 = false;
                long var227 = (var222 << 32) + var224;
                int var229 = class76.field1223.method1516((byte) 82);
                int var230 = class76.field1223.method1535(2);
                int var231 = 0;
                label1249: while (true) {
                    if (var231 >= 100) {
                        if (var229 <= 1) {
                            for (int var232 = 0; var232 < class221.field3815; var232++) {
                                if (class256.field4483[var232] == var220) {
                                    var226 = true;
                                    break label1249;
                                }
                            }
                        }
                        break;
                    }
                    if (class149.field2494[var231] == var227) {
                        var226 = true;
                        break;
                    }
                    var231++;
                }
                if (!var226 && class145.field2362 == 0) {
                    class149.field2494[class129.field2147] = var227;
                    class129.field2147 = (class129.field2147 + 1) % 100;
                    class181 var233 = class188.method1301(var230, (byte) 79).method1490(-122, class76.field1223);
                    if (var229 == 2) {
                        class221.method1467((class181) null, class175.method1164(new class181[] { class170.field2860, class19.method184(-26890, var220).method1223((byte) -57) }, (byte) 125), -6700, var233, 18, var230);
                    } else if (var229 == 1) {
                        class221.method1467((class181) null, class175.method1164(new class181[] { class86.field1368, class19.method184(arg0 - 26823, var220).method1223((byte) -57) }, (byte) 127), arg0 - 6633, var233, 18, var230);
                    } else {
                        class221.method1467((class181) null, class19.method184(-26890, var220).method1223((byte) -57), -6700, var233, 18, var230);
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 221) {
                class181 var234 = class76.field1223.method1549(114);
                int var235 = class76.field1223.method1535(2);
                int var236 = class76.field1223.method1548(-100001);
                class44.method300(var235, 0);
                class155.method1037(0, var234, var236);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 138) {
                int var237 = class76.field1223.method1566((byte) -68);
                int var238 = class76.field1223.method1558((byte) 70);
                class175 var239 = class52.method394(var237, false);
                if (var238 == 65535) {
                    var238 = -1;
                }
                if (var239.field3017 != 2 || var239.field2966 != var238) {
                    var239.field3017 = 2;
                    var239.field2966 = var238;
                    class218.method1453((byte) -108, var239);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 10) {
                long var240 = class76.field1223.method1514(22128);
                boolean var242 = false;
                long var243 = (long) class76.field1223.method1535(2);
                long var245 = (long) class76.field1223.method1508(true);
                long var247 = (var243 << 32) + var245;
                int var249 = class76.field1223.method1516((byte) 82);
                int var250 = 0;
                label1284: while (true) {
                    if (var250 >= 100) {
                        if (var249 <= 1) {
                            if (class116.field1914 == 1 || class11.field241 == 1) {
                                var242 = true;
                            } else {
                                for (int var251 = 0; var251 < class221.field3815; var251++) {
                                    if (class256.field4483[var251] == var240) {
                                        var242 = true;
                                        break label1284;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class149.field2494[var250] == var247) {
                        var242 = true;
                        break;
                    }
                    var250++;
                }
                if (!var242 && class145.field2362 == 0) {
                    class149.field2494[class129.field2147] = var247;
                    class129.field2147 = (class129.field2147 + 1) % 100;
                    class181 var252 = class245.method1657(class261.method1774(true, class76.field1223).method1218(arg0 ^ 0x5D));
                    if (var249 == 2 || var249 == 3) {
                        class202.method1357(var252, 7, (byte) -105, class175.method1164(new class181[] { class170.field2860, class19.method184(-26890, var240).method1223((byte) -57) }, (byte) 123));
                    } else if (var249 == 1) {
                        class202.method1357(var252, 7, (byte) -128, class175.method1164(new class181[] { class86.field1368, class19.method184(-26890, var240).method1223((byte) -57) }, (byte) 126));
                    } else {
                        class202.method1357(var252, 3, (byte) -100, class19.method184(-26890, var240).method1223((byte) -57));
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 65) {
                int var253 = class76.field1223.method1516((byte) 82);
                int var254 = class76.field1223.method1516((byte) 82);
                int var255 = class76.field1223.method1516((byte) 82);
                int var256 = class76.field1223.method1516((byte) 82);
                int var257 = class76.field1223.method1535(arg0 + 69);
                class18.field327[var253] = true;
                class207.field3556[var253] = var254;
                class221.field3824[var253] = var255;
                class8.field153[var253] = var256;
                class257.field4502[var253] = var257;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 119) {
                class69.method480(true, true);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 71) {
                int var258 = class76.field1223.method1535(2);
                if (var258 == 65535) {
                    var258 = -1;
                }
                class145.method947(var258, true);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 126) {
                int var259 = class76.field1223.method1556(9464);
                int var260 = class76.field1223.method1535(2);
                if (var260 == 65535) {
                    var260 = -1;
                }
                class77.method532(var259, 6848, var260);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 19) {
                class20.method188(arg0 ^ 0xFFFFFFCE);
                int var261 = class76.field1223.method1529(-32494);
                int var262 = class76.field1223.method1516((byte) 82);
                int var263 = class76.field1223.method1539(-24286);
                class242.field4209[var263] = var261;
                class184.field3265[var263] = var262;
                class123.field2022[var263] = 1;
                for (int var264 = 0; var264 < 98; var264++) {
                    if (class172.field2885[var264] <= var261) {
                        class123.field2022[var263] = var264 + 2;
                    }
                }
                class80.field1292[class5.method43(31, class257.field4491++)] = var263;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 32) {
                int var265 = class76.field1223.method1552((byte) 86);
                class131.field2174 = class224.field3870.method911(var265, (byte) -83);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 242) {
                int var266 = class76.field1223.method1531((byte) -43);
                class175 var267 = class52.method394(var266, false);
                for (int var268 = 0; var268 < var267.field3065.length; var268++) {
                    var267.field3065[var268] = -1;
                    var267.field3065[var268] = 0;
                }
                class218.method1453((byte) -107, var267);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 240) {
                int var269 = class76.field1223.field3933 + class108.field1772;
                int var270 = class76.field1223.method1535(2);
                int var271 = class76.field1223.method1535(2);
                if (class243.field4227 != var270) {
                    class243.field4227 = var270;
                    class115.method762(0, class243.field4227);
                    class165.method1101(8, false);
                    class230.method1512((byte) -122, class243.field4227);
                    for (int var272 = 0; var272 < 100; var272++) {
                        class61.field943[var272] = true;
                    }
                }
                while (var271-- > 0) {
                    int var281 = class76.field1223.method1529(arg0 ^ 0x7EAF);
                    int var282 = class76.field1223.method1535(2);
                    int var283 = class76.field1223.method1516((byte) 82);
                    class228 var284 = (class228) class165.field2807.method1424(true, (long) var281);
                    if (var284 != null && var284.field3913 != var282) {
                        class69.method479(var284, -9050, true);
                        var284 = null;
                    }
                    if (var284 == null) {
                        var284 = class265.method1800(var281, var283, var282, -1);
                    }
                    var284.field3910 = true;
                }
                for (class228 var273 = (class228) class165.field2807.method1418(0); var273 != null; var273 = (class228) class165.field2807.method1421(false)) {
                    if (var273.field3910) {
                        var273.field3910 = false;
                    } else {
                        class69.method479(var273, -9050, true);
                    }
                }
                class219.field3773.method1420(5125);
                while (class76.field1223.field3933 < var269) {
                    int var274 = class76.field1223.method1529(-32494);
                    int var275 = class76.field1223.method1535(2);
                    int var276 = class76.field1223.method1535(2);
                    int var277 = class76.field1223.method1529(-32494);
                    for (int var278 = var275; var278 <= var276; var278++) {
                        long var279 = ((long) var274 << 32) + (long) var278;
                        class219.field3773.method1422(var279, new class124(var277), arg0 + 66);
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 230) {
                class44.method298((byte) 111);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 234) {
                class37.method273(class224.field3870, (byte) -27, class76.field1223, class108.field1772);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 5) {
                int var285 = class76.field1223.method1566((byte) -68);
                class175 var286 = class52.method394(var285, false);
                var286.field3017 = 3;
                var286.field2966 = class258.field4507.field1905.method1140((byte) 111);
                class218.method1453((byte) -128, var286);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 201) {
                int var287 = class76.field1223.method1529(-32494);
                int var288 = class76.field1223.method1535(2);
                if (var287 < -70000) {
                    var288 += 32768;
                }
                class175 var289;
                if (var287 < 0) {
                    var289 = null;
                } else {
                    var289 = class52.method394(var287, false);
                }
                while (class76.field1223.field3933 < class108.field1772) {
                    int var290 = class76.field1223.method1517(false);
                    int var291 = class76.field1223.method1535(2);
                    int var292 = 0;
                    if (var291 != 0) {
                        var292 = class76.field1223.method1516((byte) 82);
                        if (var292 == 255) {
                            var292 = class76.field1223.method1529(-32494);
                        }
                    }
                    if (var289 != null && var290 >= 0 && var289.field3065.length > var290) {
                        var289.field3065[var290] = var291;
                        var289.field2935[var290] = var292;
                    }
                    class132.method850(var288, (byte) -105, var291 - 1, var290, var292);
                }
                if (var289 != null) {
                    class218.method1453((byte) -80, var289);
                }
                class20.method188(84);
                class236.field4110[class5.method43(31, class190.field3361++)] = class5.method43(var288, 32767);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 255) {
                long var293 = class76.field1223.method1514(arg0 ^ 0xFFFFA9CD);
                int var295 = class76.field1223.method1535(arg0 + 69);
                boolean var296 = false;
                if ((var293 & Long.MIN_VALUE) != 0L) {
                    var296 = true;
                }
                byte var297 = class76.field1223.method1563(-255688184);
                if (var296) {
                    if (class127.field2104 == 0) {
                        class100.field1680 = -1;
                        return true;
                    }
                    boolean var303 = false;
                    long var304 = var293 & Long.MAX_VALUE;
                    int var306;
                    for (var306 = 0; class127.field2104 > var306 && (class61.field933[var306].field606 != var304 || class61.field933[var306].field4216 != var295); var306++) {
                    }
                    if (class127.field2104 > var306) {
                        while (var306 < (class127.field2104 - 1)) {
                            class61.field933[var306] = class61.field933[var306 + 1];
                            var306++;
                        }
                        class127.field2104--;
                        class61.field933[class127.field2104] = null;
                    }
                } else {
                    class181 var298 = class76.field1223.method1549(67);
                    class243 var299 = new class243();
                    var299.field606 = var293;
                    var299.field4219 = class19.method184(arg0 ^ 0x694B, var299.field606);
                    var299.field4218 = var297;
                    var299.field4216 = var295;
                    var299.field4222 = var298;
                    int var300;
                    for (var300 = class127.field2104 - 1; var300 >= 0; var300--) {
                        int var301 = class61.field933[var300].field4219.method1209(118, var299.field4219);
                        if (var301 == 0) {
                            class61.field933[var300].field4216 = var295;
                            class61.field933[var300].field4218 = var297;
                            class61.field933[var300].field4222 = var298;
                            if (class137.field2250 == var293) {
                                class152.field2530 = var297;
                            }
                            class100.field1680 = -1;
                            class168.field2829 = class247.field4318;
                            return true;
                        }
                        if (var301 < 0) {
                            break;
                        }
                    }
                    if (class127.field2104 >= class61.field933.length) {
                        class100.field1680 = -1;
                        return true;
                    }
                    for (int var302 = class127.field2104 - 1; var302 > var300; var302--) {
                        class61.field933[var302 + 1] = class61.field933[var302];
                    }
                    if (class127.field2104 == 0) {
                        class61.field933 = new class243[100];
                    }
                    class61.field933[var300 + 1] = var299;
                    class127.field2104++;
                    if (class137.field2250 == var293) {
                        class152.field2530 = var297;
                    }
                }
                class168.field2829 = class247.field4318;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 76) {
                for (int var307 = 0; var307 < class196.field3426.length; var307++) {
                    if (class196.field3426[var307] != class107.field1751[var307]) {
                        class196.field3426[var307] = class107.field1751[var307];
                        class99.method659(var307, (byte) -99);
                        class253.field4413[class5.method43(class111.field1821++, 31)] = var307;
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 87) {
                class213.field3670 = class76.field1223.method1543(255);
                class259.field4523 = class76.field1223.method1539(-24286);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 238) {
                for (int var308 = 0; var308 < class39.field602.length; var308++) {
                    if (class39.field602[var308] != null) {
                        class39.field602[var308].field2685 = -1;
                    }
                }
                for (int var309 = 0; var309 < class129.field2140.length; var309++) {
                    if (class129.field2140[var309] != null) {
                        class129.field2140[var309].field2685 = -1;
                    }
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 189) {
                if (class108.field1772 == 0) {
                    class161.field2744 = class176.field3087;
                } else {
                    class161.field2744 = class76.field1223.method1549(78);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 235) {
                class210.field3612 = 0;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 112) {
                int var310 = class76.field1223.method1513(-12137);
                int var311 = var310 >> 2;
                int var312 = class199.field3448[var311];
                int var313 = class76.field1223.method1558((byte) -59);
                if (var313 == 65535) {
                    var313 = -1;
                }
                int var314 = var310 & 0x3;
                int var315 = class76.field1223.method1566((byte) -68);
                int var316 = (var315 & 0x385EAA57) >> 28;
                int var317 = var315 >> 14 & 0x3FFF;
                int var318 = var317 - class253.field4420;
                int var319 = var315 & 0x3FFF;
                int var320 = var319 - class222.field3844;
                class76.method530(var311, 957, var312, var314, var316, var313, var320, var318);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 46) {
                int var321 = class76.field1223.method1535(arg0 + 69);
                int var322 = class76.field1223.method1566((byte) -68);
                int var323 = class76.field1223.method1535(2);
                class175 var324 = class52.method394(var322, false);
                var324.field3000 = (var323 << 16) + var321;
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 214) {
                int var325 = class76.field1223.method1535(2);
                int var326 = class76.field1223.method1516((byte) 82);
                int var327 = class76.field1223.method1535(2);
                if (var325 == 65535) {
                    var325 = -1;
                }
                class45.method302((byte) 48, var325, var327, var326);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 31) {
                int var328 = class76.field1223.method1531((byte) -43);
                int var329 = class76.field1223.method1554(0);
                int var330 = class76.field1223.method1529(arg0 - 32427);
                if (var329 == 65535) {
                    var329 = -1;
                }
                int var331 = class76.field1223.method1548(-100001);
                if (var331 == 65535) {
                    var331 = -1;
                }
                for (int var332 = var331; var332 <= var329; var332++) {
                    long var333 = ((long) var330 << 32) + (long) var332;
                    class41 var335 = class219.field3773.method1424(true, var333);
                    if (var335 != null) {
                        var335.method290((byte) -48);
                    }
                    class219.field3773.method1422(var333, new class124(var328), -1);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 196) {
                class20.method188(arg0 + 149);
                class75.field1201 = class76.field1223.method1515(arg0 ^ 0x55);
                class100.field1680 = -1;
                class55.field851 = class247.field4318;
                return true;
            } else if (class100.field1680 == 96) {
                class69.method480(false, true);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 22) {
                int var336 = class76.field1223.method1548(-100001);
                int var337 = class76.field1223.method1535(2);
                class113.field1845 = var337;
                class214.field3682 = var336;
                class236.method1616((byte) 57);
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 157) {
                int var338 = class76.field1223.method1531((byte) -43);
                int var339 = class76.field1223.method1554(0);
                if (var339 == 65535) {
                    var339 = -1;
                }
                int var340 = class76.field1223.method1529(arg0 ^ 0x7EAF);
                class175 var341 = class52.method394(var340, false);
                if (var341.field2972) {
                    var341.field2975 = var339;
                    var341.field3075 = var338;
                    class99 var343 = class237.method1620(arg0 - 29472, var339);
                    var341.field2931 = var343.field1636;
                    var341.field3048 = var343.field1593;
                    var341.field2927 = var343.field1614;
                    if (var341.field3031 > 0) {
                        var341.field2927 = var341.field2927 * 32 / var341.field3031;
                    } else if (var341.field3072 > 0) {
                        var341.field2927 = var341.field2927 * 32 / var341.field3072;
                    }
                    var341.field2963 = var343.field1664;
                    var341.field3004 = var343.field1655;
                    var341.field2967 = var343.field1627;
                    class218.method1453((byte) -103, var341);
                } else if (var339 == -1) {
                    class100.field1680 = -1;
                    var341.field3017 = 0;
                    return true;
                } else {
                    class99 var342 = class237.method1620(-29539, var339);
                    var341.field2927 = var342.field1614 * 100 / var338;
                    var341.field3048 = var342.field1593;
                    var341.field3017 = 4;
                    var341.field2967 = var342.field1627;
                    var341.field2966 = var339;
                    class218.method1453((byte) -84, var341);
                }
                class100.field1680 = -1;
                return true;
            } else if (class100.field1680 == 153) {
                int var344 = class76.field1223.method1535(arg0 ^ 0xFFFFFFBF);
                int var345 = class76.field1223.method1529(-32494);
                int var346 = class76.field1223.method1554(0);
                int var347 = class76.field1223.method1554(0);
                class175 var348 = class52.method394(var345, false);
                if (var348.field2967 != var347 || var348.field3048 != var344 || var348.field2927 != var346) {
                    var348.field3048 = var344;
                    var348.field2927 = var346;
                    var348.field2967 = var347;
                    class218.method1453((byte) -104, var348);
                }
                class100.field1680 = -1;
                return true;
            } else {
                class83.method565((Throwable) null, "T1 - " + class100.field1680 + "," + class182.field3211 + "," + class52.field812 + " - " + class108.field1772, 120);
                class207.method1376((byte) -85);
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Lgk;")
    public static final class106 method1069(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3810;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljb;I)V")
    public static final void method1070(class11 arg0, int arg1) {
        field2718++;
        if (arg1 != 1) {
            field2723 = null;
        }
        class246.field4292 = arg0.method107(class228.field3917, -29);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static final void method1071(int arg0) {
        class61.field924.method13((byte) 75);
        field2721++;
        if (arg0 != 0) {
            method1067(103, -28, -5, -60, true, -71, -73, 93, 6, 95, 97, 82, -44);
        }
    }
}

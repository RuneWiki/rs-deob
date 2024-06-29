import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class276 extends InputStream {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4394 = 0;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "J")
    public static volatile long field4396 = 0L;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lic;")
    public static class160 field4397 = new class160(50);

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4399 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([Ljava/lang/String;Z[S)V")
    public static final void method1862(String[] arg0, boolean arg1, short[] arg2) {
        class92.method699(arg2, 0, arg0.length - 1, (byte) -119, arg0);
        if (!arg1) {
            field4396 = -104L;
        }
        field4391++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field4400++;
        class114 var5 = class129.method939(arg2, 36, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field1921 != null) {
            class196 var6 = new class196();
            var6.field3205 = var5.field1921;
            var6.field3217 = arg1;
            var6.field3202 = arg4;
            var6.field3213 = var5;
            class129.method938(120, var6);
        }
        boolean var7 = true;
        if (var5.field1929 > 0) {
            var7 = class43.method373(var5, 23142);
        }
        if (!var7 || !client.method1916(var5).method1680(arg1 - 1, true)) {
            return;
        }
        if (arg1 == 1) {
            class206.field3317++;
            class87.field1405.method607(54, (byte) 70);
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 2) {
            class75.field1234++;
            class87.field1405.method607(125, (byte) 59);
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 3) {
            class87.field1405.method607(203, (byte) 124);
            class206.field3320++;
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 4) {
            class87.field1405.method607(168, (byte) 106);
            class9.field120++;
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 5) {
            class87.field1405.method607(170, (byte) 86);
            class250.field3980++;
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 6) {
            class87.field1405.method607(225, (byte) 94);
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
            class170.field2773++;
        }
        if (arg1 == 7) {
            class228.field3629++;
            class87.field1405.method607(126, (byte) 72);
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 8) {
            class87.field1405.method607(64, (byte) 81);
            class87.field1405.method1029(arg2, 15430);
            class191.field3131++;
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 9) {
            class36.field614++;
            class87.field1405.method607(71, (byte) 121);
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        if (arg1 == 10) {
            class126.field2090++;
            class87.field1405.method607(1, (byte) 114);
            class87.field1405.method1029(arg2, 15430);
            class87.field1405.method971(3792, arg3);
        }
        int var8 = -70 % ((arg0 + 48) / 39);
    }

    @OriginalMember(owner = "client!fj", name = "read", descriptor = "()I")
    public final int read() {
        field4392++;
        class234.method1550(-28773, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lbd;BZIZZIII)Lbf;")
    public static final class102 method1864(class81 arg0, byte arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field4393++;
        class67 var9 = class190.method1314(arg3, (byte) 68);
        if (arg8 > 1 && var9.field1105 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field1104[var11] <= arg8 && var9.field1104[var11] != 0) {
                    var10 = var9.field1105[var11];
                }
            }
            if (var10 != -1) {
                var9 = class190.method1314(var10, (byte) 68);
            }
        }
        class41 var12 = var9.method518(arg0, -96);
        if (var12 == null) {
            return null;
        }
        class17 var13 = null;
        if (var9.field1108 != -1) {
            var13 = (class17) method1864(arg0, (byte) 118, true, var9.field1114, true, false, 0, 1, 10);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1156 != -1) {
            var13 = (class17) method1864(arg0, (byte) 115, true, var9.field1101, false, false, arg6, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class63.field1049;
        int var15 = class63.field1054;
        int[] var16 = class63.field1048;
        int[] var17 = new int[4];
        class63.method489(var17);
        class17 var18 = new class17(36, 32);
        class63.method484(var18.field244, 36, 32);
        class95.method713();
        class95.method720(16, 16);
        class95.field1481 = false;
        int var19 = var9.field1141;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg7 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1482[var9.field1123] * var19 >> 16;
        int var21 = class95.field1475[var9.field1123] * var19 >> 16;
        var12.method362(0, var9.field1124, var9.field1091, var9.field1123, var9.field1102, var20 + var9.field1133 - (var12.method99() / 2), var9.field1133 + var21, -1L);
        if (arg7 >= 1) {
            var18.method128(1);
            if (arg7 >= 2) {
                var18.method128(16777215);
            }
            class63.method484(var18.field244, 36, 32);
        }
        if (arg6 != 0) {
            var18.method122(arg6);
        }
        if (var9.field1108 != -1) {
            var13.method124(0, 0);
        } else if (var9.field1156 != -1) {
            class63.method484(var13.field244, 36, 32);
            var18.method124(0, 0);
            var18 = var13;
        }
        if (arg5 && (var9.field1152 == 1 || arg8 != 1) && arg8 != -1) {
            class254.field4047.method578(class89.method688(1000000, arg8), 0, 9, 16776960, 1);
        }
        if (arg1 <= 111) {
            method1866(-104, 125, (class129[][][]) null, false, 71, -27);
        }
        class63.method484(var16, var14, var15);
        class63.method478(var17);
        class95.method713();
        class95.field1481 = true;
        return var18;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method1865(int arg0) {
        if (arg0 < -61) {
            field4397 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[[[Lnb;ZII)Z")
    public static final boolean method1866(int arg0, int arg1, class129[][][] arg2, boolean arg3, int arg4, int arg5) {
        field4395++;
        byte var6 = arg3 ? 1 : (byte) (class265.field4236 & 0xFF);
        if (class229.field3656[class92.field1448][arg4][arg0] == var6) {
            return false;
        } else if ((class43.field790[class92.field1448][arg4][arg0] & 0x4) == 0) {
            return false;
        } else if (arg1 > -124) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class60.field1024[var7] = arg4;
            int var31 = var7 + 1;
            class150.field2464[var7] = arg0;
            class229.field3656[class92.field1448][arg4][arg0] = var6;
            while (var31 != var8) {
                int var9 = class60.field1024[var8] & 0xFFFF;
                int var10 = (class60.field1024[var8] & 0xFFD281) >> 16;
                int var11 = class150.field2464[var8] & 0xFFFF;
                boolean var12 = false;
                int var13 = class150.field2464[var8] >> 16 & 0xFF;
                int var14 = class60.field1024[var8] >> 24 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                if ((class43.field790[class92.field1448][var9][var11] & 0x4) == 0) {
                    var12 = true;
                }
                boolean var15 = false;
                label229: for (int var16 = class92.field1448 + 1; var16 <= 3; var16++) {
                    if ((class43.field790[var16][var9][var11] & 0x8) == 0) {
                        if (var12 && arg2[var16][var9][var11] != null) {
                            if (arg2[var16][var9][var11].field2144 != null) {
                                int var19 = class249.method1662(-33, var10);
                                if (arg2[var16][var9][var11].field2144.field2121 == var19 || arg2[var16][var9][var11].field2144.field2108 == var19) {
                                    continue;
                                }
                                if (var14 != 0) {
                                    int var20 = class249.method1662(-122, var14);
                                    if (arg2[var16][var9][var11].field2144.field2121 == var20 || arg2[var16][var9][var11].field2144.field2108 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class249.method1662(-123, var13);
                                    if (arg2[var16][var9][var11].field2144.field2121 == var21 || arg2[var16][var9][var11].field2144.field2108 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var9][var11].field2131 != null) {
                                for (int var22 = 0; var22 < arg2[var16][var9][var11].field2142; var22++) {
                                    int var23 = (int) (arg2[var16][var9][var11].field2131[var22].field3118 >> 14 & 0x3FL);
                                    int var24 = (int) (arg2[var16][var9][var11].field2131[var22].field3118 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var24 << 6 | var23;
                                    if (var10 == var25 || var14 != 0 && var14 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class129 var26 = arg2[var16][var9][var11];
                        if (var26 != null && var26.field2142 > 0) {
                            for (int var27 = 0; var27 < var26.field2142; var27++) {
                                class190 var28 = var26.field2131[var27];
                                if (var28.field3115 != var28.field3114 || var28.field3110 != var28.field3108) {
                                    for (int var29 = var28.field3115; var29 <= var28.field3114; var29++) {
                                        for (int var30 = var28.field3110; var30 <= var28.field3108; var30++) {
                                            class229.field3656[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class229.field3656[var16][var9][var11] = var6;
                    }
                }
                if (var15) {
                    if (class25.field423[arg5] < class21.field327[class92.field1448 + 1][var9][var11]) {
                        class25.field423[arg5] = class21.field327[class92.field1448 + 1][var9][var11];
                    }
                    int var17 = var9 << 7;
                    if (class19.field299[arg5] > var17) {
                        class19.field299[arg5] = var17;
                    } else if (var17 > class266.field4246[arg5]) {
                        class266.field4246[arg5] = var17;
                    }
                    int var18 = var11 << 7;
                    if (class281.field4457[arg5] > var18) {
                        class281.field4457[arg5] = var18;
                    } else if (var18 > class167.field2752[arg5]) {
                        class167.field2752[arg5] = var18;
                    }
                }
                if (!var12) {
                    if (var9 >= 1 && class229.field3656[class92.field1448][var9 - 1][var11] != var6) {
                        class60.field1024[var31] = class140.method1045(-754974720, class140.method1045(1179648, var9 - 1));
                        class150.field2464[var31] = class140.method1045(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class229.field3656[class92.field1448][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class229.field3656[class92.field1448][var9 - 1][var11] != var6 && (class43.field790[class92.field1448][var9][var11] & 0x4) == 0 && (class43.field790[class92.field1448][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class60.field1024[var31] = class140.method1045(1375731712, class140.method1045(var9 - 1, 1179648));
                            class150.field2464[var31] = class140.method1045(1245184, var11);
                            class229.field3656[class92.field1448][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class229.field3656[class92.field1448][var9][var11] != var6) {
                            class60.field1024[var31] = class140.method1045(318767104, class140.method1045(var9, 5373952));
                            class150.field2464[var31] = class140.method1045(5439488, var11);
                            class229.field3656[class92.field1448][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class229.field3656[class92.field1448][var9 + 1][var11] != var6 && (class43.field790[class92.field1448][var9][var11] & 0x4) == 0 && (class43.field790[class92.field1448][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class60.field1024[var31] = class140.method1045(class140.method1045(5373952, var9 + 1), -1845493760);
                            class150.field2464[var31] = class140.method1045(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class229.field3656[class92.field1448][var9 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if (var9 + 1 < 104 && class229.field3656[class92.field1448][var9 + 1][var11] != var6) {
                        class60.field1024[var31] = class140.method1045(class140.method1045(var9 + 1, 9568256), 1392508928);
                        class150.field2464[var31] = class140.method1045(9633792, var11);
                        class229.field3656[class92.field1448][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var9 - 1 >= 0 && class229.field3656[class92.field1448][var9 - 1][var11] != var6 && (class43.field790[class92.field1448][var9][var11] & 0x4) == 0 && (class43.field790[class92.field1448][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class60.field1024[var31] = class140.method1045(class140.method1045(var9 - 1, 13762560), 301989888);
                            class150.field2464[var31] = class140.method1045(13828096, var11);
                            class229.field3656[class92.field1448][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class229.field3656[class92.field1448][var9][var11] != var6) {
                            class60.field1024[var31] = class140.method1045(-1828716544, class140.method1045(var9, 13762560));
                            class150.field2464[var31] = class140.method1045(var11, 13828096);
                            class229.field3656[class92.field1448][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class229.field3656[class92.field1448][var9 + 1][var11] != var6 && (class43.field790[class92.field1448][var9][var11] & 0x4) == 0 && (class43.field790[class92.field1448][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class60.field1024[var31] = class140.method1045(class140.method1045(9568256, var9 + 1), -771751936);
                            class150.field2464[var31] = class140.method1045(var11, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class229.field3656[class92.field1448][var9 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class25.field423[arg5] != -1000000) {
                class25.field423[arg5] += 10;
                class19.field299[arg5] -= 50;
                class266.field4246[arg5] += 50;
                class167.field2752[arg5] += 50;
                class281.field4457[arg5] -= 50;
            }
            return true;
        }
    }
}

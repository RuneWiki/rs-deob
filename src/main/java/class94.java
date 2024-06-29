import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class94 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1370 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Z")
    public static boolean field1379 = false;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lqj;")
    public static class196 field1378 = class80.method502("Ausw-=hlen", -48);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[Z")
    public static boolean[] field1375;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method578(int arg0) {
        field1378 = null;
        if (arg0 != 10620) {
            field1375 = null;
        }
        field1370 = null;
        field1375 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZ)I")
    public static final int method579(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return -90;
        }
        field1376++;
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V")
    public static final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1373++;
        class98.field1419 = 0;
        for (int var7 = arg1; var7 < class252.field4451 + class63.field863; var7++) {
            class137 var23;
            if (var7 == -1) {
                var23 = class102.field1477;
            } else if (var7 < class252.field4451) {
                var23 = class247.field4397[class14.field153[var7]];
            } else {
                var23 = class153.field2482[class188.field3295[var7 - class252.field4451]];
            }
            if (var23 != null && var23.method811(126)) {
                if (var23 instanceof class164) {
                    class111 var24 = ((class164) var23).field2648;
                    if (var24.field1591 != null) {
                        var24 = var24.method659(52);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class252.field4451) {
                    class111 var25 = ((class164) var23).field2648;
                    if (var25.field1591 != null) {
                        var25 = var25.method659(57);
                    }
                    if (var25.field1607 >= 0 && var25.field1607 < class159.field2555.length) {
                        class168.method1100(arg3 >> 1, arg5, false, var23, arg6, var23.method854(-120) + 15, arg0 >> 1);
                        if (class72.field1031 > -1) {
                            class159.field2555[var25.field1607].method221(class72.field1031 + arg4 - 12, arg2 + -30 - -class58.field779);
                        }
                    }
                    class70[] var26 = class214.field3834;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        class70 var28 = var26[var27];
                        if (var28 != null && var28.field983 == 1 && class188.field3295[var7 - class252.field4451] == var28.field994 && class171.field2879 % 20 < 10) {
                            class168.method1100(arg3 >> 1, arg5, false, var23, arg6, var23.method854(-119) + 15, arg0 >> 1);
                            if (class72.field1031 > -1) {
                                class258.field4520[var28.field993].method221(arg4 + class72.field1031 - 12, arg2 + -28 + class58.field779);
                            }
                        }
                    }
                } else {
                    class134 var29 = (class134) var23;
                    int var30 = 30;
                    if (var29.field1904 != -1 || var29.field1935 != -1) {
                        class168.method1100(arg3 >> 1, arg5, false, var23, arg6, var23.method854(arg1 ^ 0x7E) + 15, arg0 >> 1);
                        if (class72.field1031 > -1) {
                            if (var29.field1904 != -1) {
                                class212.field3804[var29.field1904].method221(arg4 + class72.field1031 - 12, arg2 - (-class58.field779 - -var30));
                                var30 += 25;
                            }
                            if (var29.field1935 != -1) {
                                class159.field2555[var29.field1935].method221(arg4 + class72.field1031 - 12, -var30 + arg2 - -class58.field779);
                                var30 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class70[] var31 = class214.field3834;
                        for (int var32 = 0; var32 < var31.length; var32++) {
                            class70 var33 = var31[var32];
                            if (var33 != null && var33.field983 == 10 && class14.field153[var7] == var33.field994) {
                                class168.method1100(arg3 >> 1, arg5, false, var23, arg6, var23.method854(-120) + 15, arg0 >> 1);
                                if (class72.field1031 > -1) {
                                    class258.field4520[var33.field993].method221(class72.field1031 + arg4 - 12, arg2 - -class58.field779 + -var30);
                                }
                            }
                        }
                    }
                }
                if (var23.field2051 != null && (var7 >= class252.field4451 || class103.field1492 == 0 || class103.field1492 == 3 || class103.field1492 == 1 && class196.method1314(126, ((class134) var23).field1924))) {
                    class168.method1100(arg3 >> 1, arg5, false, var23, arg6, var23.method854(arg1 ^ 0x7A), arg0 >> 1);
                    if (class72.field1031 > -1 && class98.field1419 < class232.field4126) {
                        class232.field4139[class98.field1419] = class23.field292.method1240(var23.field2051) / 2;
                        class232.field4143[class98.field1419] = class23.field292.field3319;
                        class232.field4148[class98.field1419] = class72.field1031;
                        class232.field4146[class98.field1419] = class58.field779;
                        class232.field4136[class98.field1419] = var23.field2087;
                        class232.field4132[class98.field1419] = var23.field2068;
                        class232.field4141[class98.field1419] = var23.field2095;
                        class232.field4130[class98.field1419] = var23.field2051;
                        class98.field1419++;
                    }
                }
                if (class171.field2879 < var23.field2110) {
                    class168.method1100(arg3 >> 1, arg5, false, var23, arg6, var23.method854(-121) + 15, arg0 >> 1);
                    if (class72.field1031 > -1) {
                        class55.method295(class72.field1031 + arg4 - 15, class58.field779 + -3 + arg2, var23.field2099, 5, 65280);
                        class55.method295(var23.field2099 + arg4 + class72.field1031 - 15, class58.field779 + arg2 + -3, 30 - var23.field2099, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    if (class171.field2879 < var23.field2094[var34]) {
                        class168.method1100(arg3 >> 1, arg5, false, var23, arg6, var23.method854(arg1 ^ 0x78) / 2, arg0 >> 1);
                        if (class72.field1031 > -1) {
                            if (var34 == 1) {
                                class58.field779 -= 20;
                            }
                            if (var34 == 2) {
                                class72.field1031 -= 15;
                                class58.field779 -= 10;
                            }
                            if (var34 == 3) {
                                class58.field779 -= 10;
                                class72.field1031 += 15;
                            }
                            class88.field1296[var23.field2080[var34]].method221(arg4 + class72.field1031 - 12, class58.field779 + arg2 + -12);
                            class76.field1097.method1249(class163.method1029(var23.field2088[var34], false), class72.field1031 + arg4 - 1, arg2 + 3 - -class58.field779, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class98.field1419; var8++) {
            int var9 = class232.field4148[var8];
            int var10 = class232.field4146[var8];
            int var11 = class232.field4139[var8];
            int var12 = class232.field4143[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (var10 + 2 > class232.field4146[var22] + -class232.field4143[var22] && class232.field4146[var22] + 2 > -var12 + var10 && var9 - var11 < class232.field4148[var22] + class232.field4139[var22] && class232.field4148[var22] - class232.field4139[var22] < var9 - -var11 && class232.field4146[var22] - class232.field4143[var22] < var10) {
                        var13 = true;
                        var10 = class232.field4146[var22] - class232.field4143[var22];
                    }
                }
            }
            class72.field1031 = class232.field4148[var8];
            class58.field779 = class232.field4146[var8] = var10;
            class196 var14 = class232.field4130[var8];
            if (class198.field3519 == 0) {
                int var15 = 16776960;
                if (class232.field4136[var8] < 6) {
                    var15 = class224.field4015[class232.field4136[var8]];
                }
                if (class232.field4136[var8] == 6) {
                    var15 = class163.field2640 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class232.field4136[var8] == 7) {
                    var15 = class163.field2640 % 20 >= 10 ? 65535 : 255;
                }
                if (class232.field4136[var8] == 8) {
                    var15 = class163.field2640 % 20 < 10 ? 45056 : 8454016;
                }
                if (class232.field4136[var8] == 9) {
                    int var16 = 150 - class232.field4141[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class232.field4136[var8] == 10) {
                    int var17 = 150 - class232.field4141[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16384000 + 16711935 - var17 * 327680;
                    } else if (var17 < 150) {
                        var15 = (var17 - 100) * 327680 + 255 + 500 - var17 * 5;
                    }
                }
                if (class232.field4136[var8] == 11) {
                    int var18 = 150 - class232.field4141[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 + 65280 - 16384250;
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class232.field4132[var8] == 0) {
                    class23.field292.method1249(var14, class72.field1031 + arg4, arg2 - -class58.field779, var15, 0);
                }
                if (class232.field4132[var8] == 1) {
                    class23.field292.method1260(var14, class72.field1031 + arg4, class58.field779 + arg2, var15, 0, class163.field2640);
                }
                if (class232.field4132[var8] == 2) {
                    class23.field292.method1252(var14, class72.field1031 + arg4, class58.field779 + arg2, var15, 0, class163.field2640);
                }
                if (class232.field4132[var8] == 3) {
                    class23.field292.method1242(var14, class72.field1031 + arg4, class58.field779 + arg2, var15, 0, class163.field2640, 150 - class232.field4141[var8]);
                }
                if (class232.field4132[var8] == 4) {
                    int var19 = (150 - class232.field4141[var8]) * (class23.field292.method1240(var14) - -100) / 150;
                    class55.method286(arg4 + class72.field1031 - 50, arg2, class72.field1031 + arg4 + 50, arg2 + arg3);
                    class23.field292.method1241(var14, class72.field1031 + arg4 + 50 - var19, arg2 - -class58.field779, var15, 0);
                    class55.method296(arg4, arg2, arg0 + arg4, arg2 + arg3);
                }
                if (class232.field4132[var8] == 5) {
                    int var20 = 150 - class232.field4141[var8];
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class55.method286(arg4, class58.field779 + arg2 - class23.field292.field3319 - 1, arg0 + arg4, class58.field779 + arg2 + 5);
                    class23.field292.method1249(var14, class72.field1031 + arg4, arg2 - -class58.field779 + var21, var15, 0);
                    class55.method296(arg4, arg2, arg0 + arg4, arg2 + arg3);
                }
            } else {
                class23.field292.method1249(var14, class72.field1031 + arg4, class58.field779 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lsf;")
    public static final class218 method581(int arg0, int arg1) {
        if (arg0 != 2083334977) {
            method581(107, -92);
        }
        field1371++;
        class218 var2 = (class218) class28.field348.method1537((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        class218 var3 = class154.method981(false, class122.field1743, class91.field1334, arg1, (byte) 51);
        if (var3 != null) {
            class28.field348.method1532(true, (long) arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIB)Lqj;")
    public static final class196 method582(int arg0, int arg1, byte arg2) {
        field1372++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class24.field303;
        } else if (var3 < -6) {
            return class98.field1423;
        } else if (var3 < -3) {
            return class231.field4119;
        } else if (var3 < 0) {
            return class159.field2557;
        } else {
            if (arg2 != -2) {
                method583(-27);
            }
            if (var3 > 9) {
                return class52.field644;
            } else if (var3 > 6) {
                return class200.field3557;
            } else if (var3 > 3) {
                return class34.field412;
            } else if (var3 > 0) {
                return class66.field942;
            } else {
                return class71.field1005;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)[Lub;")
    public static final class43[] method583(int arg0) {
        field1377++;
        class43[] var1 = new class43[class76.field1102];
        for (int var2 = 0; var2 < class76.field1102; var2++) {
            int var3 = class77.field1126[var2] * class31.field392[var2];
            byte[] var4 = class203.field3645[var2];
            if (field1375[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class30.field385[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class1.method6(class65.method409(var8[var9], 255) << 24, class84.field1237[class65.method409(var4[var9], 255)]);
                }
                var1[var2] = new class207(class149.field2391, class92.field1347, class234.field4169[var2], class240.field4261[var2], class77.field1126[var2], class31.field392[var2], var7);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class84.field1237[class65.method409(255, var4[var6])];
                }
                var1[var2] = new class233(class149.field2391, class92.field1347, class234.field4169[var2], class240.field4261[var2], class77.field1126[var2], class31.field392[var2], var5);
            }
        }
        if (arg0 != 255) {
            method578(51);
        }
        class168.method1099(false);
        return var1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BIIIIII)V")
    public static final void method584(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -92) {
            return;
        }
        field1374++;
        int var7 = 0;
        class70[] var8 = class214.field3834;
        while (var8.length > var7) {
            class70 var9 = var8[var7];
            if (var9 != null && var9.field983 == 2) {
                class137.method853(arg1 >> 1, var9.field984 * 2, arg2 >> 1, arg3, (var9.field982 - class178.field3011 << 7) + var9.field991, (byte) -94, arg6, (var9.field987 - class106.field1523 << 7) + var9.field976);
                if (class72.field1031 > -1 && class171.field2879 % 20 < 10) {
                    class258.field4520[var9.field993].method221(arg5 + class72.field1031 - 12, class58.field779 + arg4 + -28);
                }
            }
            var7++;
        }
    }
}

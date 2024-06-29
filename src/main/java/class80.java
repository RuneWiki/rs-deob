import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class80 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lqj;")
    private static class196 field1149 = method502("Please wait )2 attempting to reestablish)3", -48);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lqj;")
    private static class196 field1148 = method502("Use", -48);

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field1154 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lqj;")
    public static class196 field1153 = field1149;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lqj;")
    public static class196 field1150 = field1148;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lec;")
    public static class178 field1159;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lcj;")
    public static class184 field1152;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[Lec;I)V")
    public static final void method497(int arg0, class178[] arg1, int arg2) {
        if (arg0 != 1180) {
            field1152 = null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class178 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3123 == 0) {
                    if (var4.field3087 != null) {
                        method497(arg0, var4.field3087, arg2);
                    }
                    class63 var5 = (class63) class101.field1445.method1551(arg0 + 31588, (long) var4.field3117);
                    if (var5 != null) {
                        class17.method92(arg0 ^ 0x482, var5.field864, arg2);
                    }
                }
                if (arg2 == 0 && var4.field3091 != null) {
                    class157 var6 = new class157();
                    var6.field2534 = var4.field3091;
                    var6.field2526 = var4;
                    class88.method550(var6, -80);
                }
                if (arg2 == 1 && var4.field3022 != null) {
                    if (var4.field3062 >= 0) {
                        class178 var7 = class201.method1356(var4.field3117, (byte) -125);
                        if (var7 == null || var7.field3087 == null || var4.field3062 >= var7.field3087.length || var7.field3087[var4.field3062] != var4) {
                            continue;
                        }
                    }
                    class157 var8 = new class157();
                    var8.field2534 = var4.field3022;
                    var8.field2526 = var4;
                    class88.method550(var8, arg0 - 1260);
                }
            }
        }
        field1156++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static final void method498(boolean arg0) {
        field1157++;
        class53.field663.method1529(382);
        class157.field2536.method135(65);
        if (!arg0) {
            field1148 = null;
        }
        class84.field1230.method1529(382);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method499(byte arg0) {
        field1153 = null;
        field1150 = null;
        field1159 = null;
        if (arg0 == -107) {
            field1149 = null;
            field1152 = null;
            field1148 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static final void method500(byte arg0) {
        field1155++;
        class44.field511 = null;
        if (arg0 != 114) {
            method505(-44, -69, 112, 61, 110, 69, 1, -114, -33, 119);
        }
        class243.field4335 = null;
        class64.field887 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z")
    public static final boolean method501(int arg0, int arg1) {
        if (arg0 != 17722) {
            method501(-98, 22);
        }
        field1146++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)Lqj;")
    public static final class196 method502(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field1158++;
        if (arg1 != -48) {
            method497(60, null, -15);
        }
        int var3 = var2.length;
        class196 var4 = new class196();
        var4.field3448 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3448[var4.field3459++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field3448[var4.field3459++] = (byte) var6;
            }
        }
        var4.method1310(arg1 + 48);
        return var4.method1325((byte) 61);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[[[Lid;IBI)V")
    public static final void method503(int arg0, class61[][][] arg1, int arg2, byte arg3, int arg4) {
        field1147++;
        if (arg3 <= 110) {
            method499((byte) 78);
        }
        byte var5 = (byte) (class163.field2640 & 0xFF);
        if (class224.field4008[class27.field335][arg2][arg0] == var5) {
            return;
        }
        byte var6 = 0;
        class30.field375[var6] = arg2;
        int var30 = var6 + 1;
        class172.field2892[var6] = arg0;
        int var7 = 0;
        class224.field4008[class27.field335][arg2][arg0] = var5;
        while (var30 != var7) {
            int var8 = class30.field375[var7] >> 16 & 0xFF;
            int var9 = class30.field375[var7] & 0xFFFF;
            int var10 = class30.field375[var7] >> 24 & 0xFF;
            int var11 = class172.field2892[var7] & 0xFFFF;
            boolean var12 = false;
            if ((class88.field1300[class27.field335][var9][var11] & 0x4) == 0) {
                var12 = true;
            }
            int var13 = class172.field2892[var7] >> 16 & 0xFF;
            var7 = var7 + 1 & 0xFFF;
            boolean var14 = false;
            label220: for (int var15 = class27.field335 + 1; var15 <= 3; var15++) {
                if ((class88.field1300[var15][var9][var11] & 0x8) == 0) {
                    if (var12 && arg1[var15][var9][var11] != null) {
                        if (arg1[var15][var9][var11].field829 != null) {
                            int var18 = class67.method432(var8, -1856356953);
                            if (arg1[var15][var9][var11].field829.field3985 == var18 || arg1[var15][var9][var11].field829.field3982 == var18) {
                                continue;
                            }
                            if (var10 != 0) {
                                int var19 = class67.method432(var10, -1856356953);
                                if (arg1[var15][var9][var11].field829.field3985 == var19 || arg1[var15][var9][var11].field829.field3982 == var19) {
                                    continue;
                                }
                            }
                            if (var13 != 0) {
                                int var20 = class67.method432(var13, -1856356953);
                                if (arg1[var15][var9][var11].field829.field3985 == var20 || arg1[var15][var9][var11].field829.field3982 == var20) {
                                    continue;
                                }
                            }
                        }
                        if (arg1[var15][var9][var11].field823 != null) {
                            for (int var21 = 0; var21 < arg1[var15][var9][var11].field836; var21++) {
                                int var22 = (int) (arg1[var15][var9][var11].field823[var21].field3554 >> 14 & 0x3FL);
                                if (var22 == 21) {
                                    var22 = 19;
                                }
                                int var23 = (int) (arg1[var15][var9][var11].field823[var21].field3554 >> 20 & 0x3L);
                                int var24 = var22 | var23 << 6;
                                if (var8 == var24 || var10 != 0 && var10 == var24 || var13 != 0 && var13 == var24) {
                                    continue label220;
                                }
                            }
                        }
                    }
                    class61 var25 = arg1[var15][var9][var11];
                    if (var25 != null && var25.field836 > 0) {
                        for (int var26 = 0; var26 < var25.field836; var26++) {
                            class200 var27 = var25.field823[var26];
                            if (var27.field3549 != var27.field3539 || var27.field3556 != var27.field3548) {
                                for (int var28 = var27.field3549; var28 <= var27.field3539; var28++) {
                                    for (int var29 = var27.field3548; var29 <= var27.field3556; var29++) {
                                        class224.field4008[var15][var28][var29] = var5;
                                    }
                                }
                            }
                        }
                    }
                    var14 = true;
                    class224.field4008[var15][var9][var11] = var5;
                }
            }
            if (var14) {
                int var16 = var9 << 7;
                if (class21.field269[arg4] < class42.field480[class27.field335 + 1][var9][var11]) {
                    class21.field269[arg4] = class42.field480[class27.field335 + 1][var9][var11];
                }
                if (class224.field4014[arg4] > var16) {
                    class224.field4014[arg4] = var16;
                } else if (var16 > class230.field4094[arg4]) {
                    class230.field4094[arg4] = var16;
                }
                int var17 = var11 << 7;
                if (class237.field4214[arg4] > var17) {
                    class237.field4214[arg4] = var17;
                } else if (var17 > class76.field1100[arg4]) {
                    class76.field1100[arg4] = var17;
                }
            }
            if (!var12) {
                if (var9 >= 1 && class224.field4008[class27.field335][var9 - 1][var11] != var5) {
                    class30.field375[var30] = class1.method6(-754974720, class1.method6(1179648, var9 - 1));
                    class172.field2892[var30] = class1.method6(var11, 1245184);
                    class224.field4008[class27.field335][var9 - 1][var11] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var11++;
                if (var11 < 104) {
                    if (var9 - 1 >= 0 && class224.field4008[class27.field335][var9 - 1][var11] != var5 && (class88.field1300[class27.field335][var9][var11] & 0x4) == 0 && (class88.field1300[class27.field335][var9 - 1][var11 - 1] & 0x4) == 0) {
                        class30.field375[var30] = class1.method6(1375731712, class1.method6(1179648, var9 - 1));
                        class172.field2892[var30] = class1.method6(var11, 1245184);
                        class224.field4008[class27.field335][var9 - 1][var11] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if (class224.field4008[class27.field335][var9][var11] != var5) {
                        class30.field375[var30] = class1.method6(318767104, class1.method6(5373952, var9));
                        class172.field2892[var30] = class1.method6(var11, 5439488);
                        var30 = var30 + 1 & 0xFFF;
                        class224.field4008[class27.field335][var9][var11] = var5;
                    }
                    if (var9 + 1 < 104 && class224.field4008[class27.field335][var9 + 1][var11] != var5 && (class88.field1300[class27.field335][var9][var11] & 0x4) == 0 && (class88.field1300[class27.field335][var9 + 1][var11 - 1] & 0x4) == 0) {
                        class30.field375[var30] = class1.method6(class1.method6(var9 + 1, 5373952), -1845493760);
                        class172.field2892[var30] = class1.method6(5439488, var11);
                        class224.field4008[class27.field335][var9 + 1][var11] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                }
                var11--;
                if (var9 + 1 < 104 && class224.field4008[class27.field335][var9 + 1][var11] != var5) {
                    class30.field375[var30] = class1.method6(class1.method6(9568256, var9 + 1), 1392508928);
                    class172.field2892[var30] = class1.method6(9633792, var11);
                    class224.field4008[class27.field335][var9 + 1][var11] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var11--;
                if (var11 >= 0) {
                    if (var9 - 1 >= 0 && class224.field4008[class27.field335][var9 - 1][var11] != var5 && (class88.field1300[class27.field335][var9][var11] & 0x4) == 0 && (class88.field1300[class27.field335][var9 - 1][var11 + 1] & 0x4) == 0) {
                        class30.field375[var30] = class1.method6(class1.method6(13762560, var9 - 1), 301989888);
                        class172.field2892[var30] = class1.method6(13828096, var11);
                        var30 = var30 + 1 & 0xFFF;
                        class224.field4008[class27.field335][var9 - 1][var11] = var5;
                    }
                    if (class224.field4008[class27.field335][var9][var11] != var5) {
                        class30.field375[var30] = class1.method6(class1.method6(13762560, var9), -1828716544);
                        class172.field2892[var30] = class1.method6(13828096, var11);
                        class224.field4008[class27.field335][var9][var11] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if (var9 + 1 < 104 && class224.field4008[class27.field335][var9 + 1][var11] != var5 && (class88.field1300[class27.field335][var9][var11] & 0x4) == 0 && (class88.field1300[class27.field335][var9 + 1][var11 + 1] & 0x4) == 0) {
                        class30.field375[var30] = class1.method6(-771751936, class1.method6(var9 + 1, 9568256));
                        class172.field2892[var30] = class1.method6(9633792, var11);
                        class224.field4008[class27.field335][var9 + 1][var11] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                }
            }
        }
        if (class21.field269[arg4] == -1000000) {
            return;
        }
        class21.field269[arg4] += 10;
        class224.field4014[arg4] -= 50;
        class230.field4094[arg4] += 50;
        class76.field1100[arg4] += 50;
        class237.field4214[arg4] -= 50;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method504(int arg0) {
        for (int var1 = 0; var1 < class219.field3933; var1++) {
            int var10002 = class146.field2300[var1]--;
            if (class146.field2300[var1] >= -10) {
                class115 var3 = class11.field130[var1];
                if (var3 == null) {
                    var3 = class115.method701(class230.field4091, class82.field1182[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class146.field2300[var1] += var3.method703();
                    class11.field130[var1] = var3;
                }
                if (class146.field2300[var1] < 0) {
                    int var4;
                    if (class210.field3785[var1] == 0) {
                        var4 = class189.field3315;
                    } else {
                        int var5 = class210.field3785[var1] >> 16 & 0xFF;
                        int var6 = (class210.field3785[var1] & 0xFF) * 128;
                        int var7 = var5 * 128 + 64 - class102.field1477.field2081;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class210.field3785[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class102.field1477.field2085;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var6 < var10) {
                            class146.field2300[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var6 - var10) * class70.field977 / var6;
                    }
                    if (var4 > 0) {
                        class89 var11 = var3.method702().method552(class96.field1411);
                        class239 var12 = class239.method1615(var11, 100, var4);
                        var12.method1611(class129.field1835[var1] - 1);
                        class161.field2589.method697(var12);
                    }
                    class146.field2300[var1] = -100;
                }
            } else {
                class219.field3933--;
                for (int var2 = var1; var2 < class219.field3933; var2++) {
                    class82.field1182[var2] = class82.field1182[var2 + 1];
                    class11.field130[var2] = class11.field130[var2 + 1];
                    class129.field1835[var2] = class129.field1835[var2 + 1];
                    class146.field2300[var2] = class146.field2300[var2 + 1];
                    class210.field3785[var2] = class210.field3785[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 4095) {
            method500((byte) 11);
        }
        field1160++;
        if (class102.field1476 && !class65.method414(false)) {
            if (class211.field3801 != 0 && class238.field4235 != -1) {
                class171.method1118(0, false, class238.field4235, class62.field847, class211.field3801, (byte) 114);
            }
            class102.field1476 = false;
        } else if (class211.field3801 != 0 && class238.field4235 != -1 && !class65.method414(false)) {
            class44.field520.method1173(34, 14592);
            class125.field1778++;
            class44.field520.method355((byte) -76, class238.field4235);
            class238.field4235 = -1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg5 && arg0 == arg8 && arg1 == arg7 && arg2 == arg3) {
            class243.method1657(arg0, arg6, arg5, arg1, arg3, true);
        } else {
            int var10 = arg5;
            int var11 = arg5 * 3;
            int var12 = arg0;
            int var13 = arg7 * 3;
            int var14 = arg8 * 3;
            int var15 = arg4 * 3;
            int var16 = arg0 * 3;
            int var17 = arg2 * 3;
            int var18 = var13 + var11 - var15 - var15;
            int var19 = var15 + arg1 - var13 - arg5;
            int var20 = var14 + arg3 - var17 - arg0;
            int var21 = var17 + var16 - var14 - var14;
            int var22 = var14 - var16;
            int var23 = var15 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var19 * var27;
                int var29 = var20 * var27;
                int var30 = var18 * var26;
                int var31 = var22 * var24;
                int var32 = var21 * var26;
                int var33 = var23 * var24;
                int var34 = (var29 + var31 + var32 >> 12) + arg0;
                int var35 = (var28 + var30 + var33 >> 12) + arg5;
                class243.method1657(var12, arg6, var10, var35, var34, true);
                var10 = var35;
                var12 = var34;
            }
        }
        field1161++;
        int var25 = -74 % ((arg9 - 40) / 59);
    }
}

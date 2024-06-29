import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class356 extends class261 {

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Ls;")
    public static class186 field5235;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lla;")
    public static class317 field5232;

    static {
        new class309("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field5235 = new class186(95, -2);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method2195(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class292.field4473; var3++) {
            class519 var4 = class488.field7187[var3];
            if (var4.field7546 == 1) {
                int var5 = var4.field7545 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field7551 * var5 >> 8) + var4.field7535;
                    int var7 = (var4.field7547 * var5 >> 8) + var4.field7534;
                    int var8 = (var4.field7544 * var5 >> 8) + var4.field7549;
                    int var9 = (var4.field7552 * var5 >> 8) + var4.field7555;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field7546 == 2) {
                int var10 = arg0 - var4.field7545;
                if (var10 > 0) {
                    int var11 = (var4.field7551 * var10 >> 8) + var4.field7535;
                    int var12 = (var4.field7547 * var10 >> 8) + var4.field7534;
                    int var13 = (var4.field7544 * var10 >> 8) + var4.field7549;
                    int var14 = (var4.field7552 * var10 >> 8) + var4.field7555;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field7546 == 3) {
                int var15 = var4.field7535 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field7556 * var15 >> 8) + var4.field7545;
                    int var17 = (var4.field7548 * var15 >> 8) + var4.field7536;
                    int var18 = (var4.field7544 * var15 >> 8) + var4.field7549;
                    int var19 = (var4.field7552 * var15 >> 8) + var4.field7555;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field7546 == 4) {
                int var20 = arg2 - var4.field7535;
                if (var20 > 0) {
                    int var21 = (var4.field7556 * var20 >> 8) + var4.field7545;
                    int var22 = (var4.field7548 * var20 >> 8) + var4.field7536;
                    int var23 = (var4.field7544 * var20 >> 8) + var4.field7549;
                    int var24 = (var4.field7552 * var20 >> 8) + var4.field7555;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field7546 == 5) {
                int var25 = arg1 - var4.field7549;
                if (var25 > 0) {
                    int var26 = (var4.field7556 * var25 >> 8) + var4.field7545;
                    int var27 = (var4.field7548 * var25 >> 8) + var4.field7536;
                    int var28 = (var4.field7551 * var25 >> 8) + var4.field7535;
                    int var29 = (var4.field7547 * var25 >> 8) + var4.field7534;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZIIIIIII)V", line = 132)
    public static final void method2196(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2) {
            method2199((byte) 68);
        }
        field5233++;
        if (arg5 == arg7 && arg4 == arg9 && arg1 == arg6 && arg0 == arg8) {
            class474.method2832(arg5, false, arg1, arg9, arg0, arg3);
            return;
        }
        int var10 = arg5;
        int var11 = arg9;
        int var12 = arg5 * 3;
        int var13 = arg9 * 3;
        int var14 = arg7 * 3;
        int var15 = arg4 * 3;
        int var16 = arg6 * 3;
        int var17 = arg8 * 3;
        int var18 = arg1 + var14 - var16 - arg5;
        int var19 = var15 + arg0 - arg9 - var17;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg5;
            int var34 = (var28 + var30 + var32 >> 12) + arg9;
            class474.method2832(var10, false, var33, var11, var34, arg3);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V", line = 222)
    public static final void method2197(int arg0) {
        field5231++;
        class506.field7382 = class219.field3446.method1858(-3256);
        int var1 = class219.field3446.method1858(arg0 - 26793);
        int var2 = class219.field3446.method1841((byte) -117);
        boolean var3 = class219.field3446.method1858(-3256) == 1;
        int var4 = class219.field3446.method1876((byte) -124);
        class427.method2584((byte) -65);
        class496.method2995(var1, false);
        class219.field3446.method268(arg0 - 53245);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class339.field5099 >> 3); var20++) {
                for (int var21 = 0; var21 < (class484.field7129 >> 3); var21++) {
                    int var22 = class219.field3446.method261(1, 0);
                    if (var22 == 1) {
                        class162.field2598[var5][var20][var21] = class219.field3446.method261(26, arg0 - 23537);
                    } else {
                        class162.field2598[var5][var20][var21] = -1;
                    }
                }
            }
        }
        if (arg0 != 23537) {
            method2199((byte) 74);
        }
        class219.field3446.method264(120);
        int var6 = (class234.field3606 - class219.field3446.field4399) / 16;
        class321.field4905 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class321.field4905[var7][var19] = class219.field3446.method1815((byte) -110);
            }
        }
        class299.field4526 = new byte[var6][];
        class383.field5600 = new int[var6];
        class533.field7730 = new byte[var6][];
        class96.field1883 = new byte[var6][];
        class236.field3639 = new int[var6];
        class87.field1782 = null;
        class58.field1227 = new int[var6];
        class204.field3272 = new int[var6];
        class77.field1551 = new int[var6];
        class386.field5634 = new byte[var6][];
        class110.field2006 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class339.field5099 >> 3; var10++) {
                for (int var11 = 0; var11 < (class484.field7129 >> 3); var11++) {
                    int var12 = class162.field2598[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class58.field1227[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class58.field1227[var8] = var15;
                            int var17 = (var15 & 0xFFF9) >> 8;
                            int var18 = var15 & 0xFF;
                            class77.field1551[var8] = class361.field5290.method2735("m" + var17 + "_" + var18, 111);
                            class236.field3639[var8] = class361.field5290.method2735("l" + var17 + "_" + var18, arg0 - 23428);
                            class204.field3272[var8] = class361.field5290.method2735("um" + var17 + "_" + var18, arg0 - 23435);
                            class383.field5600[var8] = class361.field5290.method2735("ul" + var17 + "_" + var18, -90);
                            var8++;
                        }
                    }
                }
            }
        }
        class379.method2333(var3, 10, arg0 ^ 0x5BF0, var4, var2);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 372)
    public static final String method2198(int arg0, long arg1) {
        field5234++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 != 10601) {
                return null;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class363.field5310[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V", line = 412)
    public static void method2199(byte arg0) {
        if (arg0 <= -93) {
            field5235 = null;
            field5232 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
    public abstract int method52(int arg0);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)I")
    public abstract int method54(boolean arg0);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
    public abstract int method50(int arg0);

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)J")
    public abstract long method53(int arg0);
}

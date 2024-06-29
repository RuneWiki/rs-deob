import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class20 {

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "J")
    public static long field842 = 0L;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lrb;")
    public static class120 field845 = new class120(64);

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "Lsc;")
    public static class128 field852 = class129.method1017(false, "Registrierter Benutzer");

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "Lrb;")
    public static class120 field854 = new class120(30);

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Lsc;")
    public static class128 field856 = class129.method1017(false, "p11_full");

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "Lsc;")
    public static class128 field859 = class129.method1017(false, "(U2");

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field860 = -1;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "Lsb;")
    public static class127 field858 = new class127(32);

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Lsc;")
    public static class128 field862 = class129.method1017(false, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Lgd;")
    public class46 field853;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lgd;")
    public class46 field855;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Lh;")
    public static class49 field861;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "[I")
    public static int[] field848;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[B)Lsc;")
    public static final class128 method337(int arg0, int arg1, int arg2, byte[] arg3) {
        field850++;
        class128 var4 = new class128();
        var4.field2893 = new byte[arg2];
        var4.field2920 = 0;
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field2893[var4.field2920++] = arg3[var5];
            }
        }
        if (arg0 == 1000) {
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lhe;")
    public static final class54 method338(int arg0, int arg1) {
        field847++;
        int var2 = arg0 >> 16;
        int var3 = -75 / ((arg1 + 16) / 50);
        int var4 = arg0 & 0xFFFF;
        if (class123.field2791[var2] == null || class123.field2791[var2][var4] == null) {
            boolean var5 = class65.method488((byte) 120, var2);
            if (!var5) {
                return null;
            }
        }
        return class123.field2791[var2][var4];
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method339(int arg0) {
        field844++;
        if (arg0 <= 60) {
            method341(null, -28);
        }
        if (this.field855 != null) {
            this.field855.field853 = this.field853;
            this.field853.field855 = this.field855;
            this.field855 = null;
            this.field853 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lsf;IILsf;Z)Lpd;")
    public static final class108 method340(class131 arg0, int arg1, int arg2, class131 arg3, boolean arg4) {
        field846++;
        int var5 = -90 / ((-arg1 - 50) / 39);
        int[] var6 = arg0.method1043(arg2, -87);
        boolean var7 = true;
        for (int var8 = 0; var8 < var6.length; var8++) {
            byte[] var9 = arg0.method1024(var6[var8], arg2, true);
            if (var9 == null) {
                var7 = false;
            } else {
                int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
                byte[] var11;
                if (arg4) {
                    var11 = arg3.method1024(var10, 0, true);
                } else {
                    var11 = arg3.method1024(0, var10, true);
                }
                if (var11 == null) {
                    var7 = false;
                }
            }
        }
        if (!var7) {
            return null;
        }
        try {
            return new class108(arg0, arg3, arg2, arg4);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lcc;I)V")
    public static final void method341(class18 arg0, int arg1) {
        field843++;
        Object[] var2 = arg0.field321;
        int var3 = (Integer) var2[0];
        class106 var4 = class2.method6((byte) -118, var3);
        if (var4 == null) {
            return;
        }
        class143.field3339 = 0;
        int var5 = -1;
        int var6 = 0;
        int[] var7 = var4.field2427;
        int var8 = 0;
        int[] var9 = var4.field2430;
        byte var10 = -1;
        try {
            class67.field1508 = new int[var4.field2412];
            if (arg1 == -2601) {
                int var11 = 0;
                class105.field2379 = new class128[var4.field2411];
                int var12 = 0;
                for (int var13 = 1; var13 < var2.length; var13++) {
                    if (var2[var13] instanceof Integer) {
                        int var15 = (Integer) var2[var13];
                        if (var15 == -2147483647) {
                            var15 = arg0.field338;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg0.field326;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg0.field314 == null ? -1 : arg0.field314.field1117;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg0.field315;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg0.field314 == null ? -1 : arg0.field314.field1162;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg0.field324 == null ? -1 : arg0.field324.field1117;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg0.field324 == null ? -1 : arg0.field324.field1162;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg0.field313;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg0.field327;
                        }
                        class67.field1508[var11++] = var15;
                    } else if (var2[var13] instanceof class128) {
                        class128 var14 = (class128) var2[var13];
                        if (var14.method991(-1, class65.field1456)) {
                            var14 = arg0.field331;
                        }
                        class105.field2379[var12++] = var14;
                    }
                }
                int var16 = 0;
                label1983: while (true) {
                    var16++;
                    if (var16 > 200000) {
                        throw new RuntimeException("slow");
                    }
                    var5++;
                    int var271 = var7[var5];
                    if (var271 < 100) {
                        if (var271 == 0) {
                            class142.field3327[var8++] = var9[var5];
                            continue;
                        }
                        if (var271 == 1) {
                            int var17 = var9[var5];
                            class142.field3327[var8++] = class126.field2849[var17];
                            continue;
                        }
                        if (var271 == 2) {
                            int var18 = var9[var5];
                            var8--;
                            class126.field2849[var18] = class142.field3327[var8];
                            continue;
                        }
                        if (var271 == 3) {
                            class99.field2294[var6++] = var4.field2407[var5];
                            continue;
                        }
                        if (var271 == 6) {
                            var5 += var9[var5];
                            continue;
                        }
                        if (var271 == 7) {
                            var8 -= 2;
                            if (class142.field3327[var8 + 1] != class142.field3327[var8]) {
                                var5 += var9[var5];
                            }
                            continue;
                        }
                        if (var271 == 8) {
                            var8 -= 2;
                            if (class142.field3327[var8 + 1] == class142.field3327[var8]) {
                                var5 += var9[var5];
                            }
                            continue;
                        }
                        if (var271 == 9) {
                            var8 -= 2;
                            if (class142.field3327[var8 + 1] > class142.field3327[var8]) {
                                var5 += var9[var5];
                            }
                            continue;
                        }
                        if (var271 == 10) {
                            var8 -= 2;
                            if (class142.field3327[var8] > class142.field3327[var8 + 1]) {
                                var5 += var9[var5];
                            }
                            continue;
                        }
                        if (var271 == 21) {
                            if (class143.field3339 == 0) {
                                return;
                            }
                            class154 var19 = class110.field2482[--class143.field3339];
                            class105.field2379 = var19.field3533;
                            var5 = var19.field3557;
                            var4 = var19.field3551;
                            var7 = var4.field2427;
                            var9 = var4.field2430;
                            class67.field1508 = var19.field3550;
                            continue;
                        }
                        if (var271 == 25) {
                            int var20 = var9[var5];
                            class142.field3327[var8++] = class66.method494(var20, 104);
                            continue;
                        }
                        if (var271 == 27) {
                            int var21 = var9[var5];
                            var8--;
                            class154.method1220(class142.field3327[var8], (byte) 102, var21);
                            continue;
                        }
                        if (var271 == 31) {
                            var8 -= 2;
                            if (class142.field3327[var8] <= class142.field3327[var8 + 1]) {
                                var5 += var9[var5];
                            }
                            continue;
                        }
                        if (var271 == 32) {
                            var8 -= 2;
                            if (class142.field3327[var8] >= class142.field3327[var8 + 1]) {
                                var5 += var9[var5];
                            }
                            continue;
                        }
                        if (var271 == 33) {
                            class142.field3327[var8++] = class67.field1508[var9[var5]];
                            continue;
                        }
                        int var10001;
                        if (var271 == 34) {
                            var10001 = var9[var5];
                            var8--;
                            class67.field1508[var10001] = class142.field3327[var8];
                            continue;
                        }
                        if (var271 == 35) {
                            class99.field2294[var6++] = class105.field2379[var9[var5]];
                            continue;
                        }
                        if (var271 == 36) {
                            var10001 = var9[var5];
                            var6--;
                            class105.field2379[var10001] = class99.field2294[var6];
                            continue;
                        }
                        if (var271 == 37) {
                            int var22 = var9[var5];
                            var6 -= var22;
                            class128 var23 = class70.method524(class99.field2294, var6, var22, 86);
                            class99.field2294[var6++] = var23;
                            continue;
                        }
                        if (var271 == 38) {
                            var8--;
                            continue;
                        }
                        if (var271 == 39) {
                            var6--;
                            continue;
                        }
                        if (var271 == 40) {
                            int var24 = var9[var5];
                            class106 var25 = class2.method6((byte) -118, var24);
                            int[] var26 = new int[var25.field2412];
                            class128[] var27 = new class128[var25.field2411];
                            for (int var28 = 0; var28 < var25.field2424; var28++) {
                                var26[var28] = class142.field3327[var8 + var28 - var25.field2424];
                            }
                            for (int var29 = 0; var29 < var25.field2410; var29++) {
                                var27[var29] = class99.field2294[var6 + var29 - var25.field2410];
                            }
                            var6 -= var25.field2410;
                            var8 -= var25.field2424;
                            class154 var30 = new class154();
                            var30.field3533 = class105.field2379;
                            var30.field3551 = var4;
                            var30.field3557 = var5;
                            var30.field3550 = class67.field1508;
                            var4 = var25;
                            var5 = -1;
                            class110.field2482[class143.field3339++] = var30;
                            var9 = var25.field2430;
                            class67.field1508 = var26;
                            class105.field2379 = var27;
                            var7 = var25.field2427;
                            continue;
                        }
                        if (var271 == 42) {
                            class142.field3327[var8++] = class14.field277[var9[var5]];
                            continue;
                        }
                        if (var271 == 43) {
                            var10001 = var9[var5];
                            var8--;
                            class14.field277[var10001] = class142.field3327[var8];
                            continue;
                        }
                        if (var271 == 44) {
                            int var31 = var9[var5] >> 16;
                            var8--;
                            int var32 = class142.field3327[var8];
                            int var33 = var9[var5] & 0xFFFF;
                            if (var32 >= 0 && var32 <= 5000) {
                                byte var34 = -1;
                                class93.field2147[var31] = var32;
                                if (var33 == 105) {
                                    var34 = 0;
                                }
                                int var35 = 0;
                                while (true) {
                                    if (var32 <= var35) {
                                        continue label1983;
                                    }
                                    class19.field339[var31][var35] = var34;
                                    var35++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var271 == 45) {
                            int var36 = var9[var5];
                            var8--;
                            int var37 = class142.field3327[var8];
                            if (var37 >= 0 && class93.field2147[var36] > var37) {
                                class142.field3327[var8++] = class19.field339[var36][var37];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var271 == 46) {
                            var8 -= 2;
                            int var38 = var9[var5];
                            int var39 = class142.field3327[var8];
                            if (var39 >= 0 && class93.field2147[var38] > var39) {
                                class19.field339[var38][var39] = class142.field3327[var8 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var271 == 47) {
                            class128 var40 = class99.field2288[var9[var5]];
                            if (var40 == null) {
                                var40 = class131.field3041;
                            }
                            class99.field2294[var6++] = var40;
                            continue;
                        }
                        if (var271 == 48) {
                            var10001 = var9[var5];
                            var6--;
                            class99.field2288[var10001] = class99.field2294[var6];
                            continue;
                        }
                    }
                    boolean var41;
                    if (var9[var5] == 1) {
                        var41 = true;
                    } else {
                        var41 = false;
                    }
                    if (var271 < 1000) {
                        if (var271 == 100) {
                            var8 -= 3;
                            int var253 = class142.field3327[var8 + 1];
                            int var254 = class142.field3327[var8 + 2];
                            int var255 = class142.field3327[var8];
                            if (var253 == 0) {
                                throw new RuntimeException();
                            }
                            class54 var256 = method338(var255, -107);
                            if (var256.field1100 == null) {
                                var256.field1100 = new class54[var254 + 1];
                            }
                            if (var256.field1100.length <= var254) {
                                class54[] var257 = new class54[var254 + 1];
                                for (int var258 = 0; var258 < var256.field1100.length; var258++) {
                                    var257[var258] = var256.field1100[var258];
                                }
                                var256.field1100 = var257;
                            }
                            if (var254 > 0 && var256.field1100[var254 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var254 - 1));
                            }
                            class54 var259 = new class54();
                            var259.field1162 = var254;
                            var259.field1137 = var253;
                            var259.field1175 = var259.field1117 = var256.field1117;
                            var259.field1146 = true;
                            var256.field1100[var254] = var259;
                            if (var41) {
                                class144.field3358 = var259;
                            } else {
                                class155.field3564 = var259;
                            }
                            class89.method696(var256, 1);
                            continue;
                        }
                        if (var271 == 101) {
                            class54 var260 = var41 ? class144.field3358 : class155.field3564;
                            class54 var261 = method338(var260.field1117, arg1 + 2715);
                            var261.field1100[var260.field1162] = null;
                            class89.method696(var261, 1);
                            continue;
                        }
                        if (var271 == 102) {
                            var8--;
                            class54 var262 = method338(class142.field3327[var8], arg1 ^ 0xFFFFF5B8);
                            var262.field1100 = null;
                            class89.method696(var262, 1);
                            continue;
                        }
                        if (var271 == 200) {
                            var8 -= 2;
                            int var263 = class142.field3327[var8];
                            int var264 = class142.field3327[var8 + 1];
                            class54 var265 = class152.method1210(var263, false, var264);
                            if (var265 != null && var264 != -1) {
                                class142.field3327[var8++] = 1;
                                if (var41) {
                                    class144.field3358 = var265;
                                } else {
                                    class155.field3564 = var265;
                                }
                                continue;
                            }
                            class142.field3327[var8++] = 0;
                            continue;
                        }
                    } else if (var271 >= 1000 && var271 < 1100 || var271 >= 2000 && var271 < 2100) {
                        class54 var251;
                        if (var271 < 2000) {
                            var251 = var41 ? class144.field3358 : class155.field3564;
                        } else {
                            var271 -= 1000;
                            var8--;
                            var251 = method338(class142.field3327[var8], arg1 ^ 0xFFFFF590);
                        }
                        if (var271 == 1000) {
                            var8 -= 2;
                            var251.field1110 = class142.field3327[var8];
                            var251.field1194 = class142.field3327[var8 + 1];
                            class89.method696(var251, 1);
                            continue;
                        }
                        if (var271 == 1001) {
                            var8 -= 2;
                            var251.field1154 = class142.field3327[var8];
                            var251.field1111 = class142.field3327[var8 + 1];
                            class89.method696(var251, 1);
                            continue;
                        }
                        if (var271 == 1003) {
                            var8--;
                            boolean var252 = class142.field3327[var8] == 1;
                            if (var252 != var251.field1141) {
                                var251.field1141 = var252;
                                class89.method696(var251, 1);
                            }
                            continue;
                        }
                    } else if (var271 >= 1100 && var271 < 1200 || var271 >= 2100 && var271 < 2200) {
                        class54 var248;
                        if (var271 < 2000) {
                            var248 = var41 ? class144.field3358 : class155.field3564;
                        } else {
                            var271 -= 1000;
                            var8--;
                            var248 = method338(class142.field3327[var8], -106);
                        }
                        if (var271 == 1100) {
                            var8 -= 2;
                            var248.field1157 = class142.field3327[var8];
                            if (var248.field1170 - var248.field1154 < var248.field1157) {
                                var248.field1157 = var248.field1170 - var248.field1154;
                            }
                            if (var248.field1157 < 0) {
                                var248.field1157 = 0;
                            }
                            var248.field1211 = class142.field3327[var8 + 1];
                            if (var248.field1127 - var248.field1111 < var248.field1211) {
                                var248.field1211 = var248.field1127 - var248.field1111;
                            }
                            if (var248.field1211 < 0) {
                                var248.field1211 = 0;
                            }
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1101) {
                            var8--;
                            var248.field1082 = class142.field3327[var8];
                            class89.method696(var248, arg1 + 2602);
                            continue;
                        }
                        if (var271 == 1102) {
                            var8--;
                            var248.field1109 = class142.field3327[var8] == 1;
                            class89.method696(var248, arg1 ^ 0xFFFFF5D6);
                            continue;
                        }
                        if (var271 == 1103) {
                            var8--;
                            var248.field1120 = class142.field3327[var8];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1104) {
                            var8--;
                            var248.field1131 = class142.field3327[var8];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1105) {
                            var8--;
                            var248.field1202 = class142.field3327[var8];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1106) {
                            var8--;
                            var248.field1126 = class142.field3327[var8];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1107) {
                            var8--;
                            var248.field1103 = class142.field3327[var8] == 1;
                            class89.method696(var248, arg1 ^ 0xFFFFF5D6);
                            continue;
                        }
                        if (var271 == 1108) {
                            var248.field1179 = 1;
                            var8--;
                            var248.field1093 = class142.field3327[var8];
                            class89.method696(var248, arg1 ^ 0xFFFFF5D6);
                            continue;
                        }
                        if (var271 == 1109) {
                            var8 -= 6;
                            var248.field1156 = class142.field3327[var8];
                            var248.field1160 = class142.field3327[var8 + 1];
                            var248.field1217 = class142.field3327[var8 + 2];
                            var248.field1128 = class142.field3327[var8 + 3];
                            var248.field1185 = class142.field3327[var8 + 4];
                            var248.field1173 = class142.field3327[var8 + 5];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1110) {
                            var8--;
                            int var249 = class142.field3327[var8];
                            if (var248.field1140 != var249) {
                                var248.field1140 = var249;
                                var248.field1182 = 0;
                                var248.field1151 = 0;
                                class89.method696(var248, 1);
                            }
                            continue;
                        }
                        if (var271 == 1111) {
                            var8--;
                            var248.field1158 = class142.field3327[var8] == 1;
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1112) {
                            var6--;
                            class128 var250 = class99.field2294[var6];
                            if (!var250.method991(-1, var248.field1165)) {
                                var248.field1165 = var250;
                                class89.method696(var248, arg1 + 2602);
                            }
                            continue;
                        }
                        if (var271 == 1113) {
                            var8--;
                            var248.field1088 = class142.field3327[var8];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1114) {
                            var8 -= 3;
                            var248.field1190 = class142.field3327[var8];
                            var248.field1180 = class142.field3327[var8 + 1];
                            var248.field1136 = class142.field3327[var8 + 2];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1115) {
                            var8--;
                            var248.field1163 = class142.field3327[var8] == 1;
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1116) {
                            var8--;
                            var248.field1209 = class142.field3327[var8];
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1117) {
                            var8--;
                            var248.field1148 = class142.field3327[var8];
                            class89.method696(var248, arg1 + 2602);
                            continue;
                        }
                        if (var271 == 1118) {
                            var8--;
                            var248.field1132 = class142.field3327[var8] == 1;
                            class89.method696(var248, arg1 + 2602);
                            continue;
                        }
                        if (var271 == 1119) {
                            var8--;
                            var248.field1097 = class142.field3327[var8] == 1;
                            class89.method696(var248, 1);
                            continue;
                        }
                        if (var271 == 1120) {
                            var8 -= 2;
                            var248.field1170 = class142.field3327[var8];
                            var248.field1127 = class142.field3327[var8 + 1];
                            class89.method696(var248, 1);
                            continue;
                        }
                    } else if (var271 >= 1200 && var271 < 1300 || var271 >= 2200 && var271 < 2300) {
                        class54 var244;
                        if (var271 >= 2000) {
                            var8--;
                            var244 = method338(class142.field3327[var8], -111);
                            var271 -= 1000;
                        } else {
                            var244 = var41 ? class144.field3358 : class155.field3564;
                        }
                        class89.method696(var244, arg1 ^ 0xFFFFF5D6);
                        if (var271 == 1200) {
                            var8 -= 2;
                            int var245 = class142.field3327[var8 + 1];
                            int var246 = class142.field3327[var8];
                            var244.field1214 = var246;
                            var244.field1196 = var245;
                            class64 var247 = class27.method230((byte) -44, var246);
                            var244.field1128 = var247.field1379;
                            var244.field1173 = var247.field1417;
                            var244.field1217 = var247.field1391;
                            if (var244.field1154 > 0) {
                                var244.field1173 = var244.field1173 * 32 / var244.field1154;
                            }
                            var244.field1160 = var247.field1368;
                            var244.field1185 = var247.field1423;
                            var244.field1156 = var247.field1410;
                            continue;
                        }
                        if (var271 == 1201) {
                            var244.field1179 = 2;
                            var8--;
                            var244.field1093 = class142.field3327[var8];
                            continue;
                        }
                        if (var271 == 1202) {
                            var244.field1179 = 3;
                            var244.field1093 = class151.field3473.field1043.method531((byte) -100);
                            continue;
                        }
                    } else if ((var271 < 1300 || var271 >= 1400) && (var271 < 2300 || var271 >= 2400)) {
                        if (var271 >= 1400 && var271 < 1500 || var271 >= 2400 && var271 < 2500) {
                            class54 var237;
                            if (var271 >= 2000) {
                                var8--;
                                var237 = method338(class142.field3327[var8], arg1 ^ 0xFFFFF590);
                                var271 -= 1000;
                            } else {
                                var237 = var41 ? class144.field3358 : class155.field3564;
                            }
                            var6--;
                            class128 var238 = class99.field2294[var6];
                            int[] var239 = null;
                            if (var238.method1014(arg1 ^ 0xA20) > 0 && var238.method981(false, var238.method1014(-9) - 1) == 89) {
                                var8--;
                                int var240 = class142.field3327[var8];
                                if (var240 > 0) {
                                    var239 = new int[var240];
                                    while (var240-- > 0) {
                                        var8--;
                                        var239[var240] = class142.field3327[var8];
                                    }
                                }
                                var238 = var238.method974(0, (byte) -11, var238.method1014(-9) - 1);
                            }
                            Object[] var241 = new Object[var238.method1014(-9) + 1];
                            for (int var242 = var241.length - 1; var242 >= 1; var242--) {
                                if (var238.method981(false, var242 - 1) == 115) {
                                    var6--;
                                    var241[var242] = class99.field2294[var6];
                                } else {
                                    var8--;
                                    var241[var242] = Integer.valueOf(class142.field3327[var8]);
                                }
                            }
                            var8--;
                            int var243 = class142.field3327[var8];
                            if (var243 == -1) {
                                var241 = null;
                            } else {
                                var241[0] = Integer.valueOf(var243);
                            }
                            if (var271 == 1423) {
                                var237.field1150 = var241;
                            }
                            if (var271 == 1410) {
                                var237.field1176 = var241;
                            }
                            if (var271 == 1408) {
                                var237.field1081 = var241;
                            }
                            if (var271 == 1412) {
                                var237.field1121 = var241;
                            }
                            if (var271 == 1400) {
                                var237.field1094 = var241;
                            }
                            if (var271 == 1419) {
                                var237.field1086 = var241;
                            }
                            if (var271 == 1416) {
                                var237.field1199 = var241;
                            }
                            if (var271 == 1404) {
                                var237.field1169 = var241;
                            }
                            if (var271 == 1407) {
                                var237.field1177 = var239;
                                var237.field1178 = var241;
                            }
                            if (var271 == 1411) {
                                var237.field1210 = var241;
                            }
                            if (var271 == 1405) {
                                var237.field1114 = var241;
                            }
                            if (var271 == 1421) {
                                var237.field1161 = var241;
                            }
                            if (var271 == 1403) {
                                var237.field1197 = var241;
                            }
                            if (var271 == 1415) {
                                var237.field1085 = var239;
                                var237.field1153 = var241;
                            }
                            if (var271 == 1402) {
                                var237.field1172 = var241;
                            }
                            if (var271 == 1409) {
                                var237.field1113 = var241;
                            }
                            if (var271 == 1420) {
                                var237.field1107 = var241;
                            }
                            if (var271 == 1401) {
                                var237.field1189 = var241;
                            }
                            if (var271 == 1424) {
                                var237.field1201 = var241;
                            }
                            if (var271 == 1418) {
                                var237.field1133 = var241;
                            }
                            if (var271 == 1422) {
                                var237.field1187 = var241;
                            }
                            if (var271 == 1414) {
                                var237.field1125 = var239;
                                var237.field1155 = var241;
                            }
                            if (var271 == 1417) {
                                var237.field1167 = var241;
                            }
                            var237.field1138 = true;
                            if (var271 == 1406) {
                                var237.field1159 = var241;
                            }
                            continue;
                        }
                        if (var271 < 1600) {
                            class54 var236 = var41 ? class144.field3358 : class155.field3564;
                            if (var271 == 1500) {
                                class142.field3327[var8++] = var236.field1110;
                                continue;
                            }
                            if (var271 == 1501) {
                                class142.field3327[var8++] = var236.field1194;
                                continue;
                            }
                            if (var271 == 1502) {
                                class142.field3327[var8++] = var236.field1154;
                                continue;
                            }
                            if (var271 == 1503) {
                                class142.field3327[var8++] = var236.field1111;
                                continue;
                            }
                            if (var271 == 1504) {
                                class142.field3327[var8++] = var236.field1141 ? 1 : 0;
                                continue;
                            }
                            if (var271 == 1505) {
                                class142.field3327[var8++] = var236.field1175;
                                continue;
                            }
                        } else if (var271 < 1700) {
                            class54 var46 = var41 ? class144.field3358 : class155.field3564;
                            if (var271 == 1600) {
                                class142.field3327[var8++] = var46.field1157;
                                continue;
                            }
                            if (var271 == 1601) {
                                class142.field3327[var8++] = var46.field1211;
                                continue;
                            }
                            if (var271 == 1602) {
                                class99.field2294[var6++] = var46.field1165;
                                continue;
                            }
                            if (var271 == 1603) {
                                class142.field3327[var8++] = var46.field1170;
                                continue;
                            }
                            if (var271 == 1604) {
                                class142.field3327[var8++] = var46.field1127;
                                continue;
                            }
                            if (var271 == 1605) {
                                class142.field3327[var8++] = var46.field1173;
                                continue;
                            }
                            if (var271 == 1606) {
                                class142.field3327[var8++] = var46.field1217;
                                continue;
                            }
                            if (var271 == 1607) {
                                class142.field3327[var8++] = var46.field1185;
                                continue;
                            }
                            if (var271 == 1608) {
                                class142.field3327[var8++] = var46.field1128;
                                continue;
                            }
                        } else if (var271 < 1800) {
                            class54 var47 = var41 ? class144.field3358 : class155.field3564;
                            if (var271 == 1700) {
                                class142.field3327[var8++] = var47.field1214;
                                continue;
                            }
                            if (var271 == 1701) {
                                if (var47.field1214 == -1) {
                                    class142.field3327[var8++] = 0;
                                } else {
                                    class142.field3327[var8++] = var47.field1196;
                                }
                                continue;
                            }
                            if (var271 == 1702) {
                                class142.field3327[var8++] = var47.field1162;
                                continue;
                            }
                        } else if (var271 < 1900) {
                            class54 var48 = var41 ? class144.field3358 : class155.field3564;
                            if (var271 == 1800) {
                                class142.field3327[var8++] = class7.method34(class77.method561(arg1 + 2670, var48), class29.method238(arg1, -24238));
                                continue;
                            }
                            if (var271 == 1801) {
                                var8--;
                                int var49 = class142.field3327[var8];
                                int var272 = var49 - 1;
                                if (var48.field1134 != null && var48.field1134.length > var272 && var48.field1134[var272] != null) {
                                    class99.field2294[var6++] = var48.field1134[var272];
                                    continue;
                                }
                                class99.field2294[var6++] = class20.field374;
                                continue;
                            }
                            if (var271 == 1802) {
                                if (var48.field1145 == null) {
                                    class99.field2294[var6++] = class20.field374;
                                } else {
                                    class99.field2294[var6++] = var48.field1145;
                                }
                                continue;
                            }
                        } else if (var271 < 2600) {
                            var8--;
                            class54 var50 = method338(class142.field3327[var8], -95);
                            if (var271 == 2500) {
                                class142.field3327[var8++] = var50.field1110;
                                continue;
                            }
                            if (var271 == 2501) {
                                class142.field3327[var8++] = var50.field1194;
                                continue;
                            }
                            if (var271 == 2502) {
                                class142.field3327[var8++] = var50.field1154;
                                continue;
                            }
                            if (var271 == 2503) {
                                class142.field3327[var8++] = var50.field1111;
                                continue;
                            }
                            if (var271 == 2504) {
                                class142.field3327[var8++] = var50.field1141 ? 1 : 0;
                                continue;
                            }
                            if (var271 == 2505) {
                                class142.field3327[var8++] = var50.field1175;
                                continue;
                            }
                        } else if (var271 < 2700) {
                            var8--;
                            class54 var235 = method338(class142.field3327[var8], arg1 + 2535);
                            if (var271 == 2600) {
                                class142.field3327[var8++] = var235.field1157;
                                continue;
                            }
                            if (var271 == 2601) {
                                class142.field3327[var8++] = var235.field1211;
                                continue;
                            }
                            if (var271 == 2602) {
                                class99.field2294[var6++] = var235.field1165;
                                continue;
                            }
                            if (var271 == 2603) {
                                class142.field3327[var8++] = var235.field1170;
                                continue;
                            }
                            if (var271 == 2604) {
                                class142.field3327[var8++] = var235.field1127;
                                continue;
                            }
                            if (var271 == 2605) {
                                class142.field3327[var8++] = var235.field1173;
                                continue;
                            }
                            if (var271 == 2606) {
                                class142.field3327[var8++] = var235.field1217;
                                continue;
                            }
                            if (var271 == 2607) {
                                class142.field3327[var8++] = var235.field1185;
                                continue;
                            }
                            if (var271 == 2608) {
                                class142.field3327[var8++] = var235.field1128;
                                continue;
                            }
                        } else if (var271 < 2800) {
                            if (var271 == 2700) {
                                var8--;
                                class54 var51 = method338(class142.field3327[var8], -85);
                                class142.field3327[var8++] = var51.field1214;
                                continue;
                            }
                            if (var271 == 2701) {
                                var8--;
                                class54 var52 = method338(class142.field3327[var8], -90);
                                if (var52.field1214 == -1) {
                                    class142.field3327[var8++] = 0;
                                } else {
                                    class142.field3327[var8++] = var52.field1196;
                                }
                                continue;
                            }
                            if (var271 == 2702) {
                                var8--;
                                int var53 = class142.field3327[var8];
                                class143 var54 = (class143) class66.field1492.method969((long) var53, -62);
                                if (var54 == null) {
                                    class142.field3327[var8++] = 0;
                                } else {
                                    class142.field3327[var8++] = 1;
                                }
                                continue;
                            }
                        } else if (var271 < 2900) {
                            var8--;
                            class54 var55 = method338(class142.field3327[var8], arg1 + 2675);
                            if (var271 == 2800) {
                                class142.field3327[var8++] = class7.method34(class77.method561(arg1 + 2712, var55), class29.method238(arg1, -24238));
                                continue;
                            }
                            if (var271 == 2801) {
                                var8--;
                                int var56 = class142.field3327[var8];
                                int var273 = var56 - 1;
                                if (var55.field1134 != null && var55.field1134.length > var273 && var55.field1134[var273] != null) {
                                    class99.field2294[var6++] = var55.field1134[var273];
                                    continue;
                                }
                                class99.field2294[var6++] = class20.field374;
                                continue;
                            }
                            if (var271 == 2802) {
                                if (var55.field1145 == null) {
                                    class99.field2294[var6++] = class20.field374;
                                } else {
                                    class99.field2294[var6++] = var55.field1145;
                                }
                                continue;
                            }
                        } else if (var271 < 3200) {
                            if (var271 == 3100) {
                                var6--;
                                class128 var221 = class99.field2294[var6];
                                class126.method958(0, 1, class20.field374, var221);
                                continue;
                            }
                            if (var271 == 3101) {
                                var8 -= 2;
                                class137.method1121(class142.field3327[var8], class142.field3327[var8 + 1], arg1 + 2601, class151.field3473);
                                continue;
                            }
                            if (var271 == 3103) {
                                class104.method779(0);
                                continue;
                            }
                            if (var271 == 3104) {
                                class115.field2579++;
                                int var222 = 0;
                                var6--;
                                class128 var223 = class99.field2294[var6];
                                if (var223.method993((byte) 46)) {
                                    var222 = var223.method1007((byte) 119);
                                }
                                class152.field3502.method507(arg1 + 2515, 59);
                                class152.field3502.method649(arg1 + 2485, var222);
                                continue;
                            }
                            if (var271 == 3105) {
                                field849++;
                                var6--;
                                class128 var224 = class99.field2294[var6];
                                class152.field3502.method507(61, 210);
                                class152.field3502.method651(arg1 ^ 0x3FC9B427, var224.method973(-91));
                                continue;
                            }
                            if (var271 == 3106) {
                                var6--;
                                class128 var225 = class99.field2294[var6];
                                class152.field3502.method507(61, 103);
                                class159.field3651++;
                                class152.field3502.method653(var225.method1014(-9) + 1, 0);
                                class152.field3502.method644(arg1 ^ 0x8ADFD61C, var225);
                                continue;
                            }
                            if (var271 == 3107) {
                                var6--;
                                class128 var226 = class99.field2294[var6];
                                var8--;
                                int var227 = class142.field3327[var8];
                                class151.method1198(var226, var227, 256);
                                continue;
                            }
                            if (var271 == 3108) {
                                var8 -= 3;
                                int var228 = class142.field3327[var8];
                                int var229 = class142.field3327[var8 + 1];
                                int var230 = class142.field3327[var8 + 2];
                                class54 var231 = method338(var230, 91);
                                class71.method530(var231, var229, 3, var228);
                                continue;
                            }
                            if (var271 == 3109) {
                                var8 -= 2;
                                int var232 = class142.field3327[var8];
                                int var233 = class142.field3327[var8 + 1];
                                class54 var234 = var41 ? class144.field3358 : class155.field3564;
                                class71.method530(var234, var233, arg1 ^ 0xFFFFF5D4, var232);
                                continue;
                            }
                        } else if (var271 < 3300) {
                            if (var271 == 3200) {
                                var8 -= 3;
                                class144.method1168(class142.field3327[var8 + 1], -1, class142.field3327[var8 + 2], class142.field3327[var8]);
                                continue;
                            }
                            if (var271 == 3201) {
                                var8--;
                                class102.method769(class142.field3327[var8], true);
                                continue;
                            }
                            if (var271 == 3202) {
                                var8 -= 2;
                                class153.method1212(class142.field3327[var8 + 1], class142.field3327[var8], -13393);
                                continue;
                            }
                        } else if (var271 < 3400) {
                            if (var271 == 3300) {
                                class142.field3327[var8++] = class29.field554;
                                continue;
                            }
                            if (var271 == 3301) {
                                var8 -= 2;
                                int var199 = class142.field3327[var8];
                                int var200 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = class62.method463(1, var199, var200);
                                continue;
                            }
                            if (var271 == 3302) {
                                var8 -= 2;
                                int var201 = class142.field3327[var8 + 1];
                                int var202 = class142.field3327[var8];
                                class142.field3327[var8++] = class69.method519(var201, var202, (byte) 104);
                                continue;
                            }
                            if (var271 == 3303) {
                                var8 -= 2;
                                int var203 = class142.field3327[var8];
                                int var204 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = class9.method74(29212, var204, var203);
                                continue;
                            }
                            if (var271 == 3304) {
                                var8--;
                                int var205 = class142.field3327[var8];
                                class142.field3327[var8++] = class44.method319(var205, 104).field179;
                                continue;
                            }
                            if (var271 == 3305) {
                                var8--;
                                int var206 = class142.field3327[var8];
                                class142.field3327[var8++] = class6.field75[var206];
                                continue;
                            }
                            if (var271 == 3306) {
                                var8--;
                                int var207 = class142.field3327[var8];
                                class142.field3327[var8++] = class64.field1372[var207];
                                continue;
                            }
                            if (var271 == 3307) {
                                var8--;
                                int var208 = class142.field3327[var8];
                                class142.field3327[var8++] = class152.field3509[var208];
                                continue;
                            }
                            if (var271 == 3308) {
                                int var209 = (class151.field3473.field975 >> 7) + class62.field1325;
                                int var210 = class29.field553;
                                int var211 = (class151.field3473.field987 >> 7) + class66.field1482;
                                class142.field3327[var8++] = (var209 << 14) + (var210 << 28) + var211;
                                continue;
                            }
                            if (var271 == 3309) {
                                var8--;
                                int var212 = class142.field3327[var8];
                                class142.field3327[var8++] = class25.method224(var212, 268429742) >> 14;
                                continue;
                            }
                            if (var271 == 3310) {
                                var8--;
                                int var213 = class142.field3327[var8];
                                class142.field3327[var8++] = var213 >> 28;
                                continue;
                            }
                            if (var271 == 3311) {
                                var8--;
                                int var214 = class142.field3327[var8];
                                class142.field3327[var8++] = class25.method224(16383, var214);
                                continue;
                            }
                            if (var271 == 3312) {
                                class142.field3327[var8++] = class40.field740 ? 1 : 0;
                                continue;
                            }
                            if (var271 == 3313) {
                                var8 -= 2;
                                int var215 = class142.field3327[var8] + 32768;
                                int var216 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = class62.method463(1, var215, var216);
                                continue;
                            }
                            if (var271 == 3314) {
                                var8 -= 2;
                                int var217 = class142.field3327[var8 + 1];
                                int var218 = class142.field3327[var8] + 32768;
                                class142.field3327[var8++] = class69.method519(var217, var218, (byte) 104);
                                continue;
                            }
                            if (var271 == 3315) {
                                var8 -= 2;
                                int var219 = class142.field3327[var8 + 1];
                                int var220 = class142.field3327[var8] + 32768;
                                class142.field3327[var8++] = class9.method74(29212, var219, var220);
                                continue;
                            }
                            if (var271 == 3316) {
                                if (class41.field756 >= 2) {
                                    class142.field3327[var8++] = class41.field756;
                                } else {
                                    class142.field3327[var8++] = 0;
                                }
                                continue;
                            }
                            if (var271 == 3317) {
                                class142.field3327[var8++] = class63.field1359;
                                continue;
                            }
                            if (var271 == 3318) {
                                class142.field3327[var8++] = class142.field3335;
                                continue;
                            }
                            if (var271 == 3321) {
                                class142.field3327[var8++] = class1.field13;
                                continue;
                            }
                            if (var271 == 3322) {
                                class142.field3327[var8++] = class152.field3506;
                                continue;
                            }
                            if (var271 == 3323) {
                                if (class41.field756 == 1) {
                                    class142.field3327[var8++] = 1;
                                } else {
                                    class142.field3327[var8++] = 0;
                                }
                                continue;
                            }
                        } else if (var271 < 3500) {
                            if (var271 == 3400) {
                                var8 -= 2;
                                int var189 = class142.field3327[var8];
                                int var190 = class142.field3327[var8 + 1];
                                class93 var191 = class14.method145(false, var189);
                                for (int var192 = 0; var192 < var191.field2126; var192++) {
                                    if (var191.field2144[var192] == var190) {
                                        class99.field2294[var6++] = var191.field2135[var192];
                                        var191 = null;
                                        break;
                                    }
                                }
                                if (var191 != null) {
                                    class99.field2294[var6++] = var191.field2140;
                                }
                                continue;
                            }
                            if (var271 == 3408) {
                                var8 -= 4;
                                int var193 = class142.field3327[var8];
                                int var194 = class142.field3327[var8 + 2];
                                int var195 = class142.field3327[var8 + 1];
                                int var196 = class142.field3327[var8 + 3];
                                class93 var197 = class14.method145(false, var194);
                                if (var197.field2122 == var193 && var197.field2141 == var195) {
                                    for (int var198 = 0; var198 < var197.field2126; var198++) {
                                        if (var197.field2144[var198] == var196) {
                                            if (var195 == 115) {
                                                class99.field2294[var6++] = var197.field2135[var198];
                                            } else {
                                                class142.field3327[var8++] = var197.field2125[var198];
                                            }
                                            var197 = null;
                                            break;
                                        }
                                    }
                                    if (var197 != null) {
                                        if (var195 == 115) {
                                            class99.field2294[var6++] = var197.field2140;
                                        } else {
                                            class142.field3327[var8++] = var197.field2143;
                                        }
                                    }
                                    continue;
                                }
                                if (var195 == 115) {
                                    class99.field2294[var6++] = class131.field3041;
                                } else {
                                    class142.field3327[var8++] = 0;
                                }
                                continue;
                            }
                        } else if (var271 < 3700) {
                            if (var271 == 3600) {
                                if (class36.field703 == 0) {
                                    class142.field3327[var8++] = -2;
                                } else if (class36.field703 == 1) {
                                    class142.field3327[var8++] = -1;
                                } else {
                                    class142.field3327[var8++] = class35.field675;
                                }
                                continue;
                            }
                            if (var271 == 3601) {
                                var8--;
                                int var57 = class142.field3327[var8];
                                if (class36.field703 == 2 && class35.field675 > var57) {
                                    class99.field2294[var6++] = class111.field2502[var57];
                                    continue;
                                }
                                class99.field2294[var6++] = class20.field374;
                                continue;
                            }
                            if (var271 == 3602) {
                                var8--;
                                int var58 = class142.field3327[var8];
                                if (class36.field703 == 2 && class35.field675 > var58) {
                                    class142.field3327[var8++] = class12.field200[var58];
                                    continue;
                                }
                                class142.field3327[var8++] = 0;
                                continue;
                            }
                            if (var271 == 3603) {
                                var8--;
                                int var59 = class142.field3327[var8];
                                if (class36.field703 == 2 && class35.field675 > var59) {
                                    class142.field3327[var8++] = class11.field188[var59];
                                    continue;
                                }
                                class142.field3327[var8++] = 0;
                                continue;
                            }
                            if (var271 == 3604) {
                                var6--;
                                class128 var60 = class99.field2294[var6];
                                var8--;
                                int var61 = class142.field3327[var8];
                                class9.method70(var61, var60, false);
                                continue;
                            }
                            if (var271 == 3605) {
                                var6--;
                                class128 var62 = class99.field2294[var6];
                                class25.method225((byte) 115, var62.method973(-91));
                                continue;
                            }
                            if (var271 == 3606) {
                                var6--;
                                class128 var63 = class99.field2294[var6];
                                class70.method525(var63.method973(-91), true);
                                continue;
                            }
                            if (var271 == 3607) {
                                var6--;
                                class128 var64 = class99.field2294[var6];
                                class100.method762(false, var64.method973(-91));
                                continue;
                            }
                            if (var271 == 3608) {
                                var6--;
                                class128 var65 = class99.field2294[var6];
                                class105.method784((byte) -76, var65.method973(-91));
                                continue;
                            }
                            if (var271 == 3609) {
                                var6--;
                                class128 var66 = class99.field2294[var6];
                                if (var66.method996(class142.field3338, false) || var66.method996(class20.field373, false)) {
                                    var66 = var66.method998((byte) 47, 7);
                                }
                                class142.field3327[var8++] = class75.method559(arg1 + 2704, var66) ? 1 : 0;
                                continue;
                            }
                            if (var271 == 3611) {
                                if (class116.field2612 == null) {
                                    class99.field2294[var6++] = class20.field374;
                                } else {
                                    class99.field2294[var6++] = class116.field2612.method987(class29.method238(arg1, -2615));
                                }
                                continue;
                            }
                            if (var271 == 3612) {
                                if (class116.field2612 == null) {
                                    class142.field3327[var8++] = 0;
                                } else {
                                    class142.field3327[var8++] = class102.field2326;
                                }
                                continue;
                            }
                            if (var271 == 3613) {
                                var8--;
                                int var67 = class142.field3327[var8];
                                if (class116.field2612 != null && class102.field2326 > var67) {
                                    class99.field2294[var6++] = class5.field45[var67].field1355.method987(35);
                                    continue;
                                }
                                class99.field2294[var6++] = class20.field374;
                                continue;
                            }
                            if (var271 == 3614) {
                                var8--;
                                int var68 = class142.field3327[var8];
                                if (class116.field2612 != null && var68 < class102.field2326) {
                                    class142.field3327[var8++] = class5.field45[var68].field1345;
                                    continue;
                                }
                                class142.field3327[var8++] = 0;
                                continue;
                            }
                            if (var271 == 3615) {
                                var8--;
                                int var69 = class142.field3327[var8];
                                if (class116.field2612 != null && var69 < class102.field2326) {
                                    class142.field3327[var8++] = class5.field45[var69].field1344;
                                    continue;
                                }
                                class142.field3327[var8++] = 0;
                                continue;
                            }
                            if (var271 == 3616) {
                                class142.field3327[var8++] = class90.field2053;
                                continue;
                            }
                            if (var271 == 3617) {
                                var6--;
                                class128 var70 = class99.field2294[var6];
                                class132.method1049(var70, 84);
                                continue;
                            }
                            if (var271 == 3618) {
                                class142.field3327[var8++] = class157.field3612;
                                continue;
                            }
                            if (var271 == 3619) {
                                var6--;
                                class128 var71 = class99.field2294[var6];
                                class82.method606(var71.method973(arg1 ^ 0xA72), (byte) 1);
                                continue;
                            }
                            if (var271 == 3620) {
                                class94.method744(arg1 + 2601);
                                continue;
                            }
                            if (var271 == 3621) {
                                if (class36.field703 == 0) {
                                    class142.field3327[var8++] = -1;
                                } else {
                                    class142.field3327[var8++] = class151.field3476;
                                }
                                continue;
                            }
                            if (var271 == 3622) {
                                var8--;
                                int var72 = class142.field3327[var8];
                                if (class36.field703 != 0 && class151.field3476 > var72) {
                                    class99.field2294[var6++] = class129.method1018(class51.field1033[var72], 82).method987(31);
                                    continue;
                                }
                                class99.field2294[var6++] = class20.field374;
                                continue;
                            }
                            if (var271 == 3623) {
                                var6--;
                                class128 var73 = class99.field2294[var6];
                                if (var73.method996(class142.field3338, false) || var73.method996(class20.field373, false)) {
                                    var73 = var73.method998((byte) 42, 7);
                                }
                                class142.field3327[var8++] = class42.method300(var73, -22613) ? 1 : 0;
                                continue;
                            }
                            if (var271 == 3624) {
                                var8--;
                                int var74 = class142.field3327[var8];
                                if (class5.field45 != null && var74 < class102.field2326 && class5.field45[var74].field1355.method1010(1, class151.field3473.field1050)) {
                                    class142.field3327[var8++] = 1;
                                    continue;
                                }
                                class142.field3327[var8++] = 0;
                                continue;
                            }
                            if (var271 == 3625) {
                                if (class141.field3310 == null) {
                                    class99.field2294[var6++] = class20.field374;
                                } else {
                                    class99.field2294[var6++] = class141.field3310.method987(80);
                                }
                                continue;
                            }
                        } else if (var271 < 4100) {
                            if (var271 == 4000) {
                                var8 -= 2;
                                int var156 = class142.field3327[var8];
                                int var157 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = var156 + var157;
                                continue;
                            }
                            if (var271 == 4001) {
                                var8 -= 2;
                                int var158 = class142.field3327[var8];
                                int var159 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = var158 - var159;
                                continue;
                            }
                            if (var271 == 4002) {
                                var8 -= 2;
                                int var160 = class142.field3327[var8];
                                int var161 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = var160 * var161;
                                continue;
                            }
                            if (var271 == 4003) {
                                var8 -= 2;
                                int var162 = class142.field3327[var8 + 1];
                                int var163 = class142.field3327[var8];
                                class142.field3327[var8++] = var163 / var162;
                                continue;
                            }
                            if (var271 == 4004) {
                                var8--;
                                int var164 = class142.field3327[var8];
                                class142.field3327[var8++] = (int) (Math.random() * (double) var164);
                                continue;
                            }
                            if (var271 == 4005) {
                                var8--;
                                int var165 = class142.field3327[var8];
                                class142.field3327[var8++] = (int) ((double) (var165 + 1) * Math.random());
                                continue;
                            }
                            if (var271 == 4006) {
                                var8 -= 5;
                                int var166 = class142.field3327[var8];
                                int var167 = class142.field3327[var8 + 1];
                                int var168 = class142.field3327[var8 + 2];
                                int var169 = class142.field3327[var8 + 4];
                                int var170 = class142.field3327[var8 + 3];
                                class142.field3327[var8++] = (var167 - var166) * (-var168 + var169) / (var170 - var168) + var166;
                                continue;
                            }
                            if (var271 == 4007) {
                                var8 -= 2;
                                int var171 = class142.field3327[var8];
                                int var172 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = var171 * var172 / 100 + var171;
                                continue;
                            }
                            if (var271 == 4008) {
                                var8 -= 2;
                                int var173 = class142.field3327[var8 + 1];
                                int var174 = class142.field3327[var8];
                                class142.field3327[var8++] = class97.method751(var174, 0x1 << var173);
                                continue;
                            }
                            if (var271 == 4009) {
                                var8 -= 2;
                                int var175 = class142.field3327[var8];
                                int var176 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = class25.method224(-(0x1 << var176) - 1, var175);
                                continue;
                            }
                            if (var271 == 4010) {
                                var8 -= 2;
                                int var177 = class142.field3327[var8];
                                int var178 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = class25.method224(var177, 0x1 << var178) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var271 == 4011) {
                                var8 -= 2;
                                int var179 = class142.field3327[var8];
                                int var180 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = var179 % var180;
                                continue;
                            }
                            if (var271 == 4012) {
                                var8 -= 2;
                                int var181 = class142.field3327[var8];
                                int var182 = class142.field3327[var8 + 1];
                                if (var181 == 0) {
                                    class142.field3327[var8++] = 0;
                                } else {
                                    class142.field3327[var8++] = (int) Math.pow((double) var181, (double) var182);
                                }
                                continue;
                            }
                            if (var271 == 4013) {
                                var8 -= 2;
                                int var183 = class142.field3327[var8];
                                int var184 = class142.field3327[var8 + 1];
                                if (var183 == 0) {
                                    class142.field3327[var8++] = 0;
                                } else if (var184 == 0) {
                                    class142.field3327[var8++] = Integer.MAX_VALUE;
                                } else {
                                    class142.field3327[var8++] = (int) Math.pow((double) var183, 1.0D / (double) var184);
                                }
                                continue;
                            }
                            if (var271 == 4014) {
                                var8 -= 2;
                                int var185 = class142.field3327[var8];
                                int var186 = class142.field3327[var8 + 1];
                                class142.field3327[var8++] = class25.method224(var185, var186);
                                continue;
                            }
                            if (var271 == 4015) {
                                var8 -= 2;
                                int var187 = class142.field3327[var8 + 1];
                                int var188 = class142.field3327[var8];
                                class142.field3327[var8++] = class97.method751(var188, var187);
                                continue;
                            }
                        } else if (var271 < 4200) {
                            if (var271 == 4100) {
                                var8--;
                                int var75 = class142.field3327[var8];
                                var6--;
                                class128 var76 = class99.field2294[var6];
                                class99.field2294[var6++] = class51.method395(new class128[] { var76, class111.method857(var75, (byte) 116) }, false);
                                continue;
                            }
                            if (var271 == 4101) {
                                var6 -= 2;
                                class128 var77 = class99.field2294[var6];
                                class128 var78 = class99.field2294[var6 + 1];
                                class99.field2294[var6++] = class51.method395(new class128[] { var77, var78 }, false);
                                continue;
                            }
                            if (var271 == 4102) {
                                var8--;
                                int var79 = class142.field3327[var8];
                                var6--;
                                class128 var80 = class99.field2294[var6];
                                class99.field2294[var6++] = class51.method395(new class128[] { var80, class53.method409(true, var79, -124) }, false);
                                continue;
                            }
                            if (var271 == 4103) {
                                var6--;
                                class128 var81 = class99.field2294[var6];
                                class99.field2294[var6++] = var81.method990(-1616);
                                continue;
                            }
                            if (var271 == 4104) {
                                var8--;
                                int var82 = class142.field3327[var8];
                                long var83 = (long) var82 * 86400000L + 1014768000000L;
                                class14.field276.setTime(new Date(var83));
                                int var85 = class14.field276.get(5);
                                int var86 = class14.field276.get(2);
                                int var87 = class14.field276.get(1);
                                class99.field2294[var6++] = class51.method395(new class128[] { class111.method857(var85, (byte) -73), class97.field2263, client.field421[var86], class97.field2263, class111.method857(var87, (byte) 107) }, false);
                                continue;
                            }
                            if (var271 == 4105) {
                                var6 -= 2;
                                class128 var88 = class99.field2294[var6];
                                class128 var89 = class99.field2294[var6 + 1];
                                if (class151.field3473.field1043 != null && class151.field3473.field1043.field1603) {
                                    class99.field2294[var6++] = var89;
                                    continue;
                                }
                                class99.field2294[var6++] = var88;
                                continue;
                            }
                            if (var271 == 4106) {
                                var8--;
                                int var90 = class142.field3327[var8];
                                class99.field2294[var6++] = class111.method857(var90, (byte) 110);
                                continue;
                            }
                            if (var271 == 4107) {
                                var6 -= 2;
                                class142.field3327[var8++] = class99.field2294[var6].method999((byte) -57, class99.field2294[var6 + 1]);
                                continue;
                            }
                            if (var271 == 4108) {
                                var8 -= 2;
                                var6--;
                                class128 var91 = class99.field2294[var6];
                                int var92 = class142.field3327[var8];
                                int var93 = class142.field3327[var8 + 1];
                                byte[] var94 = class92.field2080.method1023(0, var93, (byte) -35);
                                class48 var95 = new class48(var94);
                                class142.field3327[var8++] = var95.method1069(var91, var92);
                                continue;
                            }
                            if (var271 == 4109) {
                                var8 -= 2;
                                var6--;
                                class128 var96 = class99.field2294[var6];
                                int var97 = class142.field3327[var8 + 1];
                                int var98 = class142.field3327[var8];
                                byte[] var99 = class92.field2080.method1023(0, var97, (byte) -35);
                                class48 var100 = new class48(var99);
                                class142.field3327[var8++] = var100.method1063(var96, var98);
                                continue;
                            }
                            if (var271 == 4110) {
                                var6 -= 2;
                                class128 var101 = class99.field2294[var6 + 1];
                                class128 var102 = class99.field2294[var6];
                                var8--;
                                if (class142.field3327[var8] == 1) {
                                    class99.field2294[var6++] = var102;
                                } else {
                                    class99.field2294[var6++] = var101;
                                }
                                continue;
                            }
                            if (var271 == 4111) {
                                var6--;
                                class128 var103 = class99.field2294[var6];
                                class99.field2294[var6++] = class133.method1061(var103);
                                continue;
                            }
                            if (var271 == 4112) {
                                var8--;
                                int var104 = class142.field3327[var8];
                                var6--;
                                class128 var105 = class99.field2294[var6];
                                class99.field2294[var6++] = var105.method1004(false, var104);
                                continue;
                            }
                            if (var271 == 4113) {
                                var8--;
                                int var106 = class142.field3327[var8];
                                class142.field3327[var8++] = class36.method260((byte) -61, var106) ? 1 : 0;
                                continue;
                            }
                            if (var271 == 4114) {
                                var8--;
                                int var107 = class142.field3327[var8];
                                class142.field3327[var8++] = class18.method163(-117, var107) ? 1 : 0;
                                continue;
                            }
                            if (var271 == 4115) {
                                var8--;
                                int var108 = class142.field3327[var8];
                                class142.field3327[var8++] = class62.method464(var108, false) ? 1 : 0;
                                continue;
                            }
                            if (var271 == 4116) {
                                var8--;
                                int var109 = class142.field3327[var8];
                                class142.field3327[var8++] = class75.method560(var109, -49) ? 1 : 0;
                                continue;
                            }
                            if (var271 == 4117) {
                                var6--;
                                class128 var110 = class99.field2294[var6];
                                if (var110 == null) {
                                    class142.field3327[var8++] = 0;
                                } else {
                                    class142.field3327[var8++] = var110.method1014(-9);
                                }
                                continue;
                            }
                            if (var271 == 4118) {
                                var8 -= 2;
                                var6--;
                                class128 var111 = class99.field2294[var6];
                                int var112 = class142.field3327[var8];
                                int var113 = class142.field3327[var8 + 1];
                                class99.field2294[var6++] = var111.method974(var112, (byte) -11, var113);
                                continue;
                            }
                            if (var271 == 4119) {
                                var6--;
                                class128 var114 = class99.field2294[var6];
                                class128 var115 = class53.method408(var114.method1014(-9), -107);
                                boolean var116 = false;
                                for (int var117 = 0; var117 < var114.method1014(-9); var117++) {
                                    int var118 = var114.method981(false, var117);
                                    if (var118 == 60) {
                                        var116 = true;
                                    } else if (var118 == 62) {
                                        var116 = false;
                                    } else if (!var116) {
                                        var115.method972(1, var118);
                                    }
                                }
                                var115.method982((byte) 80);
                                class99.field2294[var6++] = var115;
                                continue;
                            }
                            if (var271 == 4120) {
                                var6--;
                                class128 var119 = class99.field2294[var6];
                                var8--;
                                int var120 = class142.field3327[var8];
                                class142.field3327[var8++] = var119.method979(-58, var120);
                                continue;
                            }
                        } else if (var271 < 4300) {
                            if (var271 == 4200) {
                                var8--;
                                int var121 = class142.field3327[var8];
                                class99.field2294[var6++] = class27.method230((byte) -44, var121).field1378;
                                continue;
                            }
                            if (var271 == 4201) {
                                var8 -= 2;
                                int var122 = class142.field3327[var8 + 1];
                                int var123 = class142.field3327[var8];
                                class64 var124 = class27.method230((byte) -44, var123);
                                if (var122 >= 1 && var122 <= 5 && var124.field1364[var122 - 1] != null) {
                                    class99.field2294[var6++] = var124.field1364[var122 - 1];
                                    continue;
                                }
                                class99.field2294[var6++] = class20.field374;
                                continue;
                            }
                            if (var271 == 4202) {
                                var8 -= 2;
                                int var125 = class142.field3327[var8];
                                int var126 = class142.field3327[var8 + 1];
                                class64 var127 = class27.method230((byte) -44, var125);
                                if (var126 >= 1 && var126 <= 5 && var127.field1407[var126 - 1] != null) {
                                    class99.field2294[var6++] = var127.field1407[var126 - 1];
                                    continue;
                                }
                                class99.field2294[var6++] = class20.field374;
                                continue;
                            }
                            if (var271 == 4203) {
                                var8--;
                                int var128 = class142.field3327[var8];
                                class142.field3327[var8++] = class27.method230((byte) -44, var128).field1390;
                                continue;
                            }
                            if (var271 == 4204) {
                                var8--;
                                int var129 = class142.field3327[var8];
                                class142.field3327[var8++] = class27.method230((byte) -44, var129).field1381 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var271 == 4205) {
                                var8--;
                                int var130 = class142.field3327[var8];
                                class64 var131 = class27.method230((byte) -44, var130);
                                if (var131.field1371 == -1 && var131.field1403 >= 0) {
                                    class142.field3327[var8++] = var131.field1403;
                                    continue;
                                }
                                class142.field3327[var8++] = var130;
                                continue;
                            }
                            if (var271 == 4206) {
                                var8--;
                                int var132 = class142.field3327[var8];
                                class64 var133 = class27.method230((byte) -44, var132);
                                if (var133.field1371 >= 0 && var133.field1403 >= 0) {
                                    class142.field3327[var8++] = var133.field1403;
                                    continue;
                                }
                                class142.field3327[var8++] = var132;
                                continue;
                            }
                            if (var271 == 4207) {
                                var8--;
                                int var134 = class142.field3327[var8];
                                class142.field3327[var8++] = class27.method230((byte) -44, var134).field1375 ? 1 : 0;
                                continue;
                            }
                        } else if (var271 < 5100) {
                            if (var271 == 5000) {
                                class142.field3327[var8++] = class19.field349;
                                continue;
                            }
                            if (var271 == 5001) {
                                var8 -= 3;
                                class19.field349 = class142.field3327[var8];
                                class126.field2850 = class142.field3327[var8 + 1];
                                class123.field2788 = class142.field3327[var8 + 2];
                                class99.field2279++;
                                class152.field3502.method507(94, 250);
                                class152.field3502.method653(class19.field349, arg1 ^ 0xFFFFF5D7);
                                class152.field3502.method653(class126.field2850, 0);
                                class152.field3502.method653(class123.field2788, 0);
                                continue;
                            }
                            if (var271 == 5002) {
                                var8 -= 2;
                                class72.field1614++;
                                int var135 = class142.field3327[var8 + 1];
                                var6--;
                                class128 var136 = class99.field2294[var6];
                                int var137 = class142.field3327[var8];
                                class152.field3502.method507(arg1 + 2511, 217);
                                class152.field3502.method651(-1070186000, var136.method973(-91));
                                class152.field3502.method653(var137 - 1, arg1 ^ 0xFFFFF5D7);
                                class152.field3502.method653(var135, 0);
                                continue;
                            }
                            if (var271 == 5003) {
                                var8--;
                                int var138 = class142.field3327[var8];
                                class128 var139 = null;
                                if (var138 < 100) {
                                    var139 = class67.field1515[var138];
                                }
                                if (var139 == null) {
                                    var139 = class20.field374;
                                }
                                class99.field2294[var6++] = var139;
                                continue;
                            }
                            if (var271 == 5004) {
                                int var140 = -1;
                                var8--;
                                int var141 = class142.field3327[var8];
                                if (var141 < 100 && class67.field1515[var141] != null) {
                                    var140 = class72.field1608[var141];
                                }
                                class142.field3327[var8++] = var140;
                                continue;
                            }
                            if (var271 == 5005) {
                                class142.field3327[var8++] = class126.field2850;
                                continue;
                            }
                            if (var271 == 5008) {
                                var6--;
                                class128 var142 = class99.field2294[var6];
                                if (var142.method996(class69.field1537, false)) {
                                    class121.method923(1, var142);
                                } else {
                                    class92.field2102++;
                                    class128 var143 = var142.method990(-1616);
                                    byte var144 = 0;
                                    byte var145 = 0;
                                    if (var143.method996(class67.field1513, false)) {
                                        var142 = var142.method998((byte) 20, class67.field1513.method1014(-9));
                                        var144 = 0;
                                    } else if (var143.method996(class41.field770, false)) {
                                        var144 = 1;
                                        var142 = var142.method998((byte) 103, class41.field770.method1014(-9));
                                    } else if (var143.method996(class159.field3662, false)) {
                                        var144 = 2;
                                        var142 = var142.method998((byte) 34, class159.field3662.method1014(-9));
                                    } else if (var143.method996(class128.field2955, false)) {
                                        var144 = 3;
                                        var142 = var142.method998((byte) 41, class128.field2955.method1014(-9));
                                    } else if (var143.method996(class128.field2889, false)) {
                                        var144 = 4;
                                        var142 = var142.method998((byte) 70, class128.field2889.method1014(arg1 + 2592));
                                    } else if (var143.method996(class155.field3568, false)) {
                                        var142 = var142.method998((byte) 109, class155.field3568.method1014(-9));
                                        var144 = 5;
                                    } else if (var143.method996(class90.field2062, false)) {
                                        var144 = 6;
                                        var142 = var142.method998((byte) 52, class90.field2062.method1014(-9));
                                    } else if (var143.method996(class147.field3409, false)) {
                                        var142 = var142.method998((byte) 39, class147.field3409.method1014(-9));
                                        var144 = 7;
                                    } else if (var143.method996(class35.field677, false)) {
                                        var144 = 8;
                                        var142 = var142.method998((byte) 26, class35.field677.method1014(-9));
                                    } else if (var143.method996(class30.field593, false)) {
                                        var142 = var142.method998((byte) 125, class30.field593.method1014(-9));
                                        var144 = 9;
                                    } else if (var143.method996(class42.field787, false)) {
                                        var144 = 10;
                                        var142 = var142.method998((byte) 60, class42.field787.method1014(-9));
                                    } else if (var143.method996(class70.field1574, false)) {
                                        var142 = var142.method998((byte) 102, class70.field1574.method1014(-9));
                                        var144 = 11;
                                    } else if (class154.field3535 != 0) {
                                        if (var143.method996(class67.field1496, false)) {
                                            var144 = 0;
                                            var142 = var142.method998((byte) 80, class67.field1496.method1014(-9));
                                        } else if (var143.method996(class41.field759, false)) {
                                            var142 = var142.method998((byte) 25, class41.field759.method1014(-9));
                                            var144 = 1;
                                        } else if (var143.method996(class159.field3663, false)) {
                                            var144 = 2;
                                            var142 = var142.method998((byte) 37, class159.field3663.method1014(-9));
                                        } else if (var143.method996(class128.field2902, false)) {
                                            var144 = 3;
                                            var142 = var142.method998((byte) 52, class128.field2902.method1014(arg1 ^ 0xA20));
                                        } else if (var143.method996(class128.field2907, false)) {
                                            var144 = 4;
                                            var142 = var142.method998((byte) 58, class128.field2907.method1014(-9));
                                        } else if (var143.method996(class155.field3565, false)) {
                                            var142 = var142.method998((byte) 41, class155.field3565.method1014(-9));
                                            var144 = 5;
                                        } else if (var143.method996(class90.field2064, false)) {
                                            var144 = 6;
                                            var142 = var142.method998((byte) 18, class90.field2064.method1014(arg1 ^ 0xA20));
                                        } else if (var143.method996(class147.field3404, false)) {
                                            var142 = var142.method998((byte) 75, class147.field3404.method1014(-9));
                                            var144 = 7;
                                        } else if (var143.method996(class35.field674, false)) {
                                            var144 = 8;
                                            var142 = var142.method998((byte) 87, class35.field674.method1014(-9));
                                        } else if (var143.method996(class30.field582, false)) {
                                            var144 = 9;
                                            var142 = var142.method998((byte) 32, class30.field582.method1014(arg1 + 2592));
                                        } else if (var143.method996(class42.field789, false)) {
                                            var142 = var142.method998((byte) 45, class42.field789.method1014(-9));
                                            var144 = 10;
                                        } else if (var143.method996(class70.field1569, false)) {
                                            var144 = 11;
                                            var142 = var142.method998((byte) 59, class70.field1569.method1014(arg1 + 2592));
                                        }
                                    }
                                    class128 var146 = var142.method990(arg1 ^ 0xC67);
                                    if (var146.method996(class157.field3605, false)) {
                                        var145 = 1;
                                        var142 = var142.method998((byte) 90, class157.field3605.method1014(-9));
                                    } else if (var146.method996(class87.field1991, false)) {
                                        var145 = 2;
                                        var142 = var142.method998((byte) 69, class87.field1991.method1014(-9));
                                    } else if (var146.method996(class30.field599, false)) {
                                        var145 = 3;
                                        var142 = var142.method998((byte) 62, class30.field599.method1014(arg1 + 2592));
                                    } else if (var146.method996(class125.field2820, false)) {
                                        var142 = var142.method998((byte) 125, class125.field2820.method1014(arg1 ^ 0xA20));
                                        var145 = 4;
                                    } else if (var146.method996(class159.field3658, false)) {
                                        var142 = var142.method998((byte) 63, class159.field3658.method1014(-9));
                                        var145 = 5;
                                    } else if (class154.field3535 != 0) {
                                        if (var146.method996(class157.field3598, false)) {
                                            var145 = 1;
                                            var142 = var142.method998((byte) 64, class157.field3598.method1014(-9));
                                        } else if (var146.method996(class87.field1978, false)) {
                                            var142 = var142.method998((byte) 101, class87.field1978.method1014(-9));
                                            var145 = 2;
                                        } else if (var146.method996(class30.field604, false)) {
                                            var142 = var142.method998((byte) 63, class30.field604.method1014(-9));
                                            var145 = 3;
                                        } else if (var146.method996(class125.field2817, false)) {
                                            var142 = var142.method998((byte) 93, class125.field2817.method1014(-9));
                                            var145 = 4;
                                        } else if (var146.method996(class159.field3654, false)) {
                                            var145 = 5;
                                            var142 = var142.method998((byte) 46, class159.field3654.method1014(arg1 ^ 0xA20));
                                        }
                                    }
                                    class152.field3502.method507(127, 191);
                                    class152.field3502.method653(0, arg1 + 2601);
                                    int var147 = class152.field3502.field1924;
                                    class152.field3502.method653(var144, arg1 ^ 0xFFFFF5D7);
                                    class152.field3502.method653(var145, 0);
                                    class66.method493(var142, class152.field3502, (byte) 114);
                                    class152.field3502.method647(class152.field3502.field1924 - var147, -26);
                                }
                                continue;
                            }
                            if (var271 == 5009) {
                                class111.field2495++;
                                var6 -= 2;
                                class128 var148 = class99.field2294[var6 + 1];
                                class128 var149 = class99.field2294[var6];
                                class152.field3502.method507(-101, 138);
                                class152.field3502.method653(0, 0);
                                int var150 = class152.field3502.field1924;
                                class152.field3502.method651(-1070186000, var149.method973(-91));
                                class66.method493(var148, class152.field3502, (byte) 111);
                                class152.field3502.method647(class152.field3502.field1924 - var150, 126);
                                continue;
                            }
                            if (var271 == 5010) {
                                var8--;
                                int var151 = class142.field3327[var8];
                                class128 var152 = null;
                                if (var151 < 100) {
                                    var152 = class37.field709[var151];
                                }
                                if (var152 == null) {
                                    var152 = class20.field374;
                                }
                                class99.field2294[var6++] = var152;
                                continue;
                            }
                            if (var271 == 5011) {
                                var8--;
                                int var153 = class142.field3327[var8];
                                class128 var154 = null;
                                if (var153 < 100) {
                                    var154 = class103.field2348[var153];
                                }
                                if (var154 == null) {
                                    var154 = class20.field374;
                                }
                                class99.field2294[var6++] = var154;
                                continue;
                            }
                            if (var271 == 5015) {
                                class128 var155;
                                if (class151.field3473 == null || class151.field3473.field1050 == null) {
                                    var155 = class132.field3090;
                                } else {
                                    var155 = class151.field3473.field1050;
                                }
                                class99.field2294[var6++] = var155;
                                continue;
                            }
                            if (var271 == 5016) {
                                class142.field3327[var8++] = class123.field2788;
                                continue;
                            }
                            if (var271 == 5017) {
                                class142.field3327[var8++] = class79.field1784;
                                continue;
                            }
                        }
                    } else {
                        class54 var42;
                        if (var271 >= 2000) {
                            var8--;
                            var42 = method338(class142.field3327[var8], -70);
                            var271 -= 1000;
                        } else {
                            var42 = var41 ? class144.field3358 : class155.field3564;
                        }
                        if (var271 == 1300) {
                            var8--;
                            int var43 = class142.field3327[var8] - 1;
                            if (var43 >= 0 && var43 <= 9) {
                                var6--;
                                var42.method415(class99.field2294[var6], -29, var43);
                                continue;
                            }
                            var6--;
                            continue;
                        }
                        if (var271 == 1301) {
                            var8 -= 2;
                            int var44 = class142.field3327[var8];
                            int var45 = class142.field3327[var8 + 1];
                            var42.field1130 = class152.method1210(var44, false, var45);
                            continue;
                        }
                        if (var271 == 1302) {
                            var8--;
                            var42.field1164 = class142.field3327[var8] == 1;
                            continue;
                        }
                        if (var271 == 1303) {
                            var8--;
                            var42.field1207 = class142.field3327[var8];
                            continue;
                        }
                        if (var271 == 1304) {
                            var8--;
                            var42.field1135 = class142.field3327[var8];
                            continue;
                        }
                        if (var271 == 1305) {
                            var6--;
                            var42.field1145 = class99.field2294[var6];
                            continue;
                        }
                        if (var271 == 1306) {
                            var6--;
                            var42.field1139 = class99.field2294[var6];
                            continue;
                        }
                        if (var271 == 1307) {
                            var42.field1134 = null;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var270) {
            if (var4.field2429 == null) {
                if (class151.field3484 != 0) {
                    class126.method958(0, arg1 + 2602, class20.field374, class117.field2661);
                }
                class116.method895(-1, var270, "CS2 - scr:" + var4.field365 + " op:" + var10);
            } else {
                class128 var267 = class53.method408(30, arg1 ^ 0xA5A);
                var267.method992(class66.field1479, -34).method992(var4.field2429, -34);
                for (int var268 = class143.field3339 - 1; var268 >= 0; var268--) {
                    var267.method992(class151.field3489, -34).method992(class110.field2482[var268].field3551.field2429, -34);
                }
                if (var10 == 40) {
                    int var269 = var9[var5];
                    var267.method992(class154.field3559, -34).method992(class111.method857(var269, (byte) 113), -34);
                }
                if (class151.field3484 != 0) {
                    class126.method958(0, 1, class20.field374, class51.method395(new class128[] { class63.field1349, var4.field2429 }, false));
                }
                class116.method895(-1, var270, "CS2 - scr:" + var4.field365 + " op:" + var10 + new String(var267.method977((byte) -110)));
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public static void method342(byte arg0) {
        field852 = null;
        if (arg0 != 43) {
            field852 = null;
        }
        field856 = null;
        field845 = null;
        field859 = null;
        field862 = null;
        field854 = null;
        field848 = null;
        field861 = null;
        field858 = null;
    }
}

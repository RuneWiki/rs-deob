import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class class105 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public int field1182 = 4;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "[S")
    private short[] field1185 = new short[512];

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    private int field1186 = 4;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    private int field1200 = 0;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    private int field1196 = 4;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    private int field1195 = 4;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field1190 = 0;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "Ltc;")
    public static class196 field1192;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "Lra;")
    public static class57 field1199;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "[S")
    private short[] field1197;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZJIII)Ljava/lang/String;", line = 4)
    public static final String method562(boolean arg0, long arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 45) {
            method569(37);
        }
        field1189++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V", line = 84)
    public static void method563(boolean arg0) {
        field1192 = null;
        field1199 = null;
        if (arg0) {
            field1190 = 13;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III[II)V", line = 95)
    public static final void method564(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field1188++;
        arg1--;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        if (arg2 != 0) {
            field1192 = null;
        }
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg3[var6] = arg0;
            int var7 = var6 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            arg1 = var12 + 1;
            arg3[arg1] = arg0;
        }
        while (arg1 < var13) {
            arg1++;
            arg3[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 124)
    private final void method565(byte arg0) {
        this.field1197 = new short[this.field1182];
        field1198++;
        int var2 = 0;
        int var3 = -71 / ((1 - arg0) / 42);
        while (var2 < this.field1182) {
            this.field1197[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILbq;)V", line = 144)
    public static final void method566(int arg0, class159 arg1) {
        field1183++;
        if (arg1 == null || class32.field301.field2358 == arg1) {
            return;
        }
        if (arg0 != 1) {
            method567((byte) -24);
        }
        int var2 = arg1.field2266;
        int var3 = arg1.field2249;
        int var4 = arg1.field2257;
        int var5 = (int) arg1.field2259;
        long var6 = arg1.field2259;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (var4 == 41) {
            class428.method2664(-1);
            class119 var8 = class179.method1170(var3, 818041328);
            class373.field5443 = var2;
            class3.field49 = var3;
            class423.field6070 = 1;
            class50.field575 = var5;
            class101.method543((byte) -101, var8);
            class318.field4526 = "<col=ff9040>" + class392.method2498(var5, -113).field3527 + "<col=ffffff>";
            if (class318.field4526 == null) {
                class318.field4526 = "null";
            }
            return;
        }
        if (var4 == 58) {
            class133 var9 = class375.field5473[var5];
            if (var9 != null) {
                class130.field1803 = class302.field4326;
                class94.field1038 = 2;
                class433.field6281++;
                class420.field6040 = class124.field1643;
                field1194 = 0;
                class169.field2360.method809(210, -28022);
                class169.field2360.method1361((byte) -124, class3.field49);
                class169.field2360.method1390(true, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1354(class50.field575, arg0 + 110);
                class169.field2360.method1380(var5, (byte) -8);
                class169.field2360.method1371(class373.field5443, 29594);
                class138.method824(class390.field5715.field6350[0], var9.field6350[0], var9.method786((byte) 70), -2, var9.method786((byte) 70), true, 0, (byte) 124, 0, class390.field5715.field6351[0], var9.field6351[0]);
            }
        }
        if (var4 == 29) {
            class119 var10 = class179.method1170(var3, arg0 ^ 0x30C251F1);
            boolean var11 = true;
            if (var10.field1538 > 0) {
                var11 = class192.method1227(var10, 112);
            }
            if (var11) {
                class169.field2360.method809(163, arg0 - 28023);
                class236.field3219++;
                class169.field2360.method1361((byte) -118, var3);
            }
        }
        if (var4 == 60) {
            class16.field170++;
            class169.field2360.method809(33, -28022);
            class169.field2360.method1361((byte) -118, var3);
            class169.field2360.method1380(class24.field243, (byte) -8);
            class169.field2360.method1386((byte) 124, class199.field2715);
            class169.field2360.method1357((byte) 90, var2);
            class169.field2360.method1371(var5, arg0 ^ 0x739B);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 59) {
            if (class56.field642 > 0 && class256.field3447[82] && class256.field3447[81]) {
                class153.method920((byte) -84, class217.field2975 + var3, class410.field5931, class40.field427 + var2);
            } else {
                class298.method1883(var5, arg0 ^ 0x3, var2, var3);
                if (var5 == 1) {
                    class169.field2360.method1396(21375, -1);
                    class169.field2360.method1396(21375, -1);
                    class169.field2360.method1380((int) class276.field3893, (byte) -8);
                    class169.field2360.method1396(21375, 57);
                    class169.field2360.method1396(arg0 + 21374, class260.field3585);
                    class169.field2360.method1396(21375, class164.field2288);
                    class169.field2360.method1396(21375, 89);
                    class169.field2360.method1380(class390.field5715.field1304, (byte) -8);
                    class169.field2360.method1380(class390.field5715.field1311, (byte) -8);
                    class169.field2360.method1396(21375, 63);
                } else {
                    class94.field1038 = 1;
                    class130.field1803 = class302.field4326;
                    field1194 = 0;
                    class420.field6040 = class124.field1643;
                }
                class138.method824(class390.field5715.field6350[0], var3, 1, -4, 1, true, 0, (byte) 50, 0, class390.field5715.field6351[0], var2);
            }
        }
        if (var4 == 44) {
            class124.field1644++;
            class169.field2360.method809(173, -28022);
            class169.field2360.method1361((byte) -126, var3);
            class169.field2360.method1354(var2, 112);
            class169.field2360.method1371(var5, 29594);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 18) {
            class94.field1038 = 2;
            class400.field5816++;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            field1194 = 0;
            class169.field2360.method809(135, -28022);
            class169.field2360.method1380(class40.field427 + var2, (byte) -8);
            class169.field2360.method1380(class217.field2975 + var3, (byte) -8);
            class169.field2360.method1354(var5, 127);
            class169.field2360.method1357((byte) 90, class24.field243);
            class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1358(class199.field2715, -126);
            class2.method11(var3, var2, 17585);
        }
        if (var4 == 9) {
            class133 var12 = class375.field5473[var5];
            if (var12 != null) {
                class130.field1803 = class302.field4326;
                field1194 = 0;
                class94.field1038 = 2;
                class181.field2481++;
                class420.field6040 = class124.field1643;
                class169.field2360.method809(205, -28022);
                class169.field2360.method1371(var5, 29594);
                class169.field2360.method1345(arg0 ^ 0x1, class256.field3447[82] ? 1 : 0);
                class138.method824(class390.field5715.field6350[0], var12.field6350[0], var12.method786((byte) 70), -2, var12.method786((byte) 70), true, 0, (byte) -105, 0, class390.field5715.field6351[0], var12.field6351[0]);
            }
        }
        if (var4 == 57) {
            class308.field4409++;
            class169.field2360.method809(195, arg0 ^ 0xFFFF928B);
            class169.field2360.method1361((byte) -118, var3);
            class169.field2360.method1380(var5, (byte) -8);
            class169.field2360.method1357((byte) 90, var2);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 15) {
            class358 var13 = class81.field917[var5];
            if (var13 != null) {
                field1194 = 0;
                class130.field1803 = class302.field4326;
                class94.field1038 = 2;
                class420.field6040 = class124.field1643;
                class226.field3083++;
                class169.field2360.method809(221, -28022);
                class169.field2360.method1383(class256.field3447[82] ? 1 : 0, (byte) 18);
                class169.field2360.method1354(var5, arg0 ^ 0x68);
                class138.method824(class390.field5715.field6350[0], var13.field6350[0], var13.method786((byte) 70), -2, var13.method786((byte) 70), true, 0, (byte) -107, 0, class390.field5715.field6351[0], var13.field6351[0]);
            }
        }
        if (var4 == 48 || var4 == 1004) {
            class134.method801(arg1.field2252, (byte) -31, var5, var3, var2);
        }
        if (var4 == 34) {
            class362.field5279++;
            class169.field2360.method809(194, -28022);
            class169.field2360.method1361((byte) -121, var3);
            class169.field2360.method1371(var2, 29594);
            class169.field2360.method1357((byte) 90, var5);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, arg0 + 818041327);
            class2.field29 = var2;
        }
        if (var4 == 45) {
            class133 var14 = class375.field5473[var5];
            if (var14 != null) {
                field1194 = 0;
                class94.field1038 = 2;
                class130.field1803 = class302.field4326;
                class420.field6040 = class124.field1643;
                class119.field1490++;
                class169.field2360.method809(144, arg0 - 28023);
                class169.field2360.method1396(21375, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1371(var5, 29594);
                class138.method824(class390.field5715.field6350[0], var14.field6350[0], var14.method786((byte) 70), -2, var14.method786((byte) 70), true, 0, (byte) -125, 0, class390.field5715.field6351[0], var14.field6351[0]);
            }
        }
        if (var4 == 10) {
            class420.field6040 = class124.field1643;
            class94.field1038 = 2;
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class93.field1026++;
            class169.field2360.method809(243, -28022);
            class169.field2360.method1357((byte) 90, var5);
            class169.field2360.method1380(class217.field2975 + var3, (byte) -8);
            class169.field2360.method1371(class40.field427 + var2, 29594);
            class169.field2360.method1390(true, class256.field3447[82] ? 1 : 0);
            class2.method11(var3, var2, 17585);
        }
        if (var4 == 14) {
            class130.field1803 = class302.field4326;
            field1194 = 0;
            class198.field2704++;
            class420.field6040 = class124.field1643;
            class94.field1038 = 2;
            class169.field2360.method809(214, -28022);
            class169.field2360.method1354(var5, 104);
            class169.field2360.method1371(var3 + class217.field2975, 29594);
            class169.field2360.method1396(arg0 ^ 0x537E, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1380(class40.field427 + var2, (byte) -8);
            class2.method11(var3, var2, 17585);
        }
        if (var4 == 1012) {
            class119 var15 = class179.method1170(var3, 818041328);
            if (var15 == null || var15.field1592[var2] < 100000) {
                class169.field2360.method809(167, arg0 - 28023);
                class25.field246++;
                class169.field2360.method1357((byte) 90, var5);
            } else {
                class413.method2589(var15.field1592[var2] + " x " + class392.method2498(var5, -127).field3527, 0);
            }
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, arg0 ^ 0x30C251F1);
            class2.field29 = var2;
        }
        if (var4 == 47) {
            class169.field2360.method809(164, -28022);
            class12.field131++;
            class169.field2360.method1361((byte) -127, var3);
            class169.field2360.method1380(class50.field575, (byte) -8);
            class169.field2360.method1380(class373.field5443, (byte) -8);
            class169.field2360.method1386((byte) 62, class3.field49);
            class169.field2360.method1357((byte) 90, var2);
            class169.field2360.method1371(var5, 29594);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 24) {
            class94.field1038 = 2;
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            class211.field2879++;
            class169.field2360.method809(90, arg0 - 28023);
            class169.field2360.method1383(class256.field3447[82] ? 1 : 0, (byte) 18);
            class169.field2360.method1357((byte) 90, var2 + class40.field427);
            class169.field2360.method1354(Integer.MAX_VALUE & (int) (var6 >>> 32), 125);
            class169.field2360.method1380(class217.field2975 + var3, (byte) -8);
            class179.method1172(var2, var6, var3, 0);
        }
        if (var4 == 1011 || var4 == 1010 || var4 == 1008 || var4 == 1003 || var4 == 1006) {
            class222.method1445((byte) 42, var2, var5, var4);
        }
        if (var4 == 49) {
            class169.field2360.method809(73, arg0 - 28023);
            class267.field3749++;
            class169.field2360.method1361((byte) -120, var3);
            class169.field2360.method1357((byte) 90, var2);
            class169.field2360.method1354(var5, 127);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, arg0 + 818041327);
            class2.field29 = var2;
        }
        if (var4 == 6) {
            class358 var16 = class81.field917[var5];
            if (var16 != null) {
                class324.field4573++;
                class420.field6040 = class124.field1643;
                class94.field1038 = 2;
                field1194 = 0;
                class130.field1803 = class302.field4326;
                class169.field2360.method809(250, arg0 ^ 0xFFFF928B);
                class169.field2360.method1396(arg0 ^ 0x537E, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1380(var5, (byte) -8);
                class138.method824(class390.field5715.field6350[0], var16.field6350[0], var16.method786((byte) 70), -2, var16.method786((byte) 70), true, 0, (byte) -100, 0, class390.field5715.field6351[0], var16.field6351[0]);
            }
        }
        if (var4 == 19) {
            class169.field2360.method809(102, arg0 ^ 0xFFFF928B);
            class93.field1029++;
            class169.field2360.method1361((byte) -126, var3);
            class169.field2360.method1380(var2, (byte) -8);
            class169.field2360.method1357((byte) 90, var5);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 1007) {
            class94.field1038 = 2;
            class25.field246++;
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            class169.field2360.method809(167, -28022);
            class169.field2360.method1357((byte) 90, var5);
        }
        if (var4 == 4) {
            field1194 = 0;
            class169.field2363++;
            class94.field1038 = 2;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            class169.field2360.method809(41, arg0 ^ 0xFFFF928B);
            class169.field2360.method1371(class373.field5443, arg0 ^ 0x739B);
            class169.field2360.method1380(class50.field575, (byte) -8);
            class169.field2360.method1390(true, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1371((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 + 29593);
            class169.field2360.method1335(class3.field49, arg0 ^ 0xFFFFA20E);
            class169.field2360.method1380(var3 + class217.field2975, (byte) -8);
            class169.field2360.method1357((byte) 90, class40.field427 + var2);
            class179.method1172(var2, var6, var3, 0);
        }
        if (var4 == 5) {
            class173.field2406++;
            class169.field2360.method809(129, arg0 ^ 0xFFFF928B);
            class169.field2360.method1361((byte) -119, var3);
            class169.field2360.method1380(class24.field243, (byte) -8);
            class169.field2360.method1380(var2, (byte) -8);
            class169.field2360.method1335(class199.field2715, -24049);
        }
        if (var4 == 25) {
            class133 var17 = class375.field5473[var5];
            if (var17 != null) {
                class176.field2440++;
                field1194 = 0;
                class130.field1803 = class302.field4326;
                class94.field1038 = 2;
                class420.field6040 = class124.field1643;
                class169.field2360.method809(218, -28022);
                class169.field2360.method1396(21375, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1371(var5, 29594);
                class138.method824(class390.field5715.field6350[0], var17.field6350[0], var17.method786((byte) 70), -2, var17.method786((byte) 70), true, 0, (byte) -101, 0, class390.field5715.field6351[0], var17.field6351[0]);
            }
        }
        if (var4 == 11) {
            class169.field2360.method809(143, -28022);
            class42.field511++;
            class169.field2360.method1361((byte) -126, var3);
            class169.field2360.method1354(var5, 113);
            class169.field2360.method1354(var2, 126);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, arg0 ^ 0x30C251F1);
            class2.field29 = var2;
        }
        if (var4 == 40) {
            class133 var18 = class375.field5473[var5];
            if (var18 != null) {
                class420.field6040 = class124.field1643;
                class94.field1038 = 2;
                class171.field2397++;
                class130.field1803 = class302.field4326;
                field1194 = 0;
                class169.field2360.method809(157, -28022);
                class169.field2360.method1390(true, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1357((byte) 90, var5);
                class138.method824(class390.field5715.field6350[0], var18.field6350[0], var18.method786((byte) 70), -2, var18.method786((byte) 70), true, 0, (byte) -127, 0, class390.field5715.field6351[0], var18.field6351[0]);
            }
        }
        if (var4 == 36) {
            class133 var19 = class375.field5473[var5];
            if (var19 != null) {
                class97.field1086++;
                class94.field1038 = 2;
                class420.field6040 = class124.field1643;
                class130.field1803 = class302.field4326;
                field1194 = 0;
                class169.field2360.method809(114, -28022);
                class169.field2360.method1380(var5, (byte) -8);
                class169.field2360.method1396(arg0 + 21374, class256.field3447[82] ? 1 : 0);
                class138.method824(class390.field5715.field6350[0], var19.field6350[0], var19.method786((byte) 70), -2, var19.method786((byte) 70), true, 0, (byte) -123, 0, class390.field5715.field6351[0], var19.field6351[0]);
            }
        }
        if (var4 == 16) {
            class266.field3720++;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            field1194 = 0;
            class94.field1038 = 2;
            class169.field2360.method809(161, -28022);
            class169.field2360.method1371(var5, 29594);
            class169.field2360.method1383(class256.field3447[82] ? 1 : 0, (byte) 18);
            class169.field2360.method1371(class40.field427 + var2, arg0 ^ 0x739B);
            class169.field2360.method1354(class217.field2975 + var3, arg0 + 104);
            class2.method11(var3, var2, 17585);
        }
        if (var4 == 33) {
            class94.field1038 = 2;
            class420.field6040 = class124.field1643;
            class130.field1803 = class302.field4326;
            class56.field637++;
            field1194 = 0;
            class169.field2360.method809(244, -28022);
            class169.field2360.method1361((byte) -122, class199.field2715);
            class169.field2360.method1354(var3 + class217.field2975, arg0 ^ 0x79);
            class169.field2360.method1357((byte) 90, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class169.field2360.method1396(arg0 + 21374, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1380(class24.field243, (byte) -8);
            class169.field2360.method1357((byte) 90, var2 + class40.field427);
            class179.method1172(var2, var6, var3, 0);
        }
        if (var4 == 21) {
            if (class56.field642 > 0 && class256.field3447[82] && class256.field3447[81]) {
                class153.method920((byte) -84, class217.field2975 + var3, class410.field5931, class40.field427 + var2);
            } else {
                class334.field4912++;
                field1194 = 0;
                class94.field1038 = 1;
                class420.field6040 = class124.field1643;
                class130.field1803 = class302.field4326;
                class169.field2360.method809(8, -28022);
                class169.field2360.method1380(class217.field2975 + var3, (byte) -8);
                class169.field2360.method1357((byte) 90, class40.field427 + var2);
            }
        }
        if (var4 == 8) {
            class119 var20 = class354.method2262(-128, var2, var3);
            if (var20 != null) {
                class428.method2664(-1);
                class3 var21 = client.method1076(var20);
                class383.method2455((byte) -5, var20.field1473, var21.method27(arg0 - 6937), var20.field1514, var2, var21.field36, var3);
                class423.field6070 = 0;
                class110.field1275 = class181.method1176(var20, arg0 - 1);
                if (var20.field1475) {
                    class75.field825 = var20.field1488 + "<col=ffffff>";
                } else {
                    class75.field825 = "<col=00ff00>" + var20.field1476 + "<col=ffffff>";
                }
                if (class110.field1275 == null) {
                    class110.field1275 = "Null";
                }
            }
            return;
        }
        if (var4 == 42) {
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            class94.field1038 = 2;
            class242.field3284++;
            class169.field2360.method809(84, -28022);
            class169.field2360.method1354((int) (var6 >>> 32) & Integer.MAX_VALUE, 122);
            class169.field2360.method1380(class217.field2975 + var3, (byte) -8);
            class169.field2360.method1396(21375, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1354(class40.field427 + var2, 107);
            class179.method1172(var2, var6, var3, 0);
        }
        if (var4 == 39) {
            class358 var22 = class81.field917[var5];
            if (var22 != null) {
                class130.field1803 = class302.field4326;
                field1194 = 0;
                class385.field5632++;
                class420.field6040 = class124.field1643;
                class94.field1038 = 2;
                class169.field2360.method809(28, -28022);
                class169.field2360.method1396(21375, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1357((byte) 90, var5);
                class169.field2360.method1354(class50.field575, 108);
                class169.field2360.method1358(class3.field49, -128);
                class169.field2360.method1357((byte) 90, class373.field5443);
                class138.method824(class390.field5715.field6350[0], var22.field6350[0], var22.method786((byte) 70), -2, var22.method786((byte) 70), true, 0, (byte) -127, 0, class390.field5715.field6351[0], var22.field6351[0]);
            }
        }
        if (var4 == 17) {
            class133 var23 = class375.field5473[var5];
            if (var23 != null) {
                class130.field1803 = class302.field4326;
                class94.field1038 = 2;
                class426.field6174++;
                class420.field6040 = class124.field1643;
                field1194 = 0;
                class169.field2360.method809(124, -28022);
                class169.field2360.method1380(var5, (byte) -8);
                class169.field2360.method1383(class256.field3447[82] ? 1 : 0, (byte) 18);
                class138.method824(class390.field5715.field6350[0], var23.field6350[0], var23.method786((byte) 70), -2, var23.method786((byte) 70), true, 0, (byte) -127, 0, class390.field5715.field6351[0], var23.field6351[0]);
            }
        }
        if (var4 == 37) {
            class169.field2360.method809(163, -28022);
            class236.field3219++;
            class169.field2360.method1361((byte) -123, var3);
            class119 var24 = class179.method1170(var3, 818041328);
            if (var24.field1582 != null && var24.field1582[0][0] == 5) {
                int var25 = var24.field1582[0][1];
                if (class283.field3972[var25] != var24.field1603[0]) {
                    class283.field3972[var25] = var24.field1603[0];
                    class388.method2477(var25, arg0 + 3503);
                }
            }
        }
        if (var4 == 1) {
            field1194 = 0;
            class420.field6040 = class124.field1643;
            class130.field1803 = class302.field4326;
            class94.field1038 = 1;
            class153.field2151++;
            class169.field2360.method809(77, -28022);
            class169.field2360.method1357((byte) 90, class40.field427 + var2);
            class169.field2360.method1354(class217.field2975 + var3, arg0 ^ 0x71);
            class169.field2360.method1354(class24.field243, 117);
            class169.field2360.method1386((byte) 100, class199.field2715);
            class138.method824(class390.field5715.field6350[0], var3, 1, -4, 1, true, 0, (byte) 122, 0, class390.field5715.field6351[0], var2);
        }
        if (var4 == 23) {
            class169.field2360.method809(118, -28022);
            class20.field207++;
            class169.field2360.method1361((byte) -126, var3);
            class169.field2360.method1380(var5, (byte) -8);
            class169.field2360.method1354(var2, 127);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, arg0 + 818041327);
            class2.field29 = var2;
        }
        if (var4 == 13) {
            class358 var26 = class81.field917[var5];
            if (var26 != null) {
                class130.field1803 = class302.field4326;
                class94.field1038 = 2;
                field1194 = 0;
                class57.field679++;
                class420.field6040 = class124.field1643;
                class169.field2360.method809(150, -28022);
                class169.field2360.method1345(arg0 ^ 0x1, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1354(var5, 105);
                class138.method824(class390.field5715.field6350[0], var26.field6350[0], var26.method786((byte) 70), -2, var26.method786((byte) 70), true, 0, (byte) -105, 0, class390.field5715.field6351[0], var26.field6351[0]);
            }
        }
        if (var4 == 12) {
            class358 var27 = class81.field917[var5];
            if (var27 != null) {
                field1194 = 0;
                class420.field6040 = class124.field1643;
                class411.field5937++;
                class130.field1803 = class302.field4326;
                class94.field1038 = 2;
                class169.field2360.method809(227, -28022);
                class169.field2360.method1335(class199.field2715, -24049);
                class169.field2360.method1357((byte) 90, var5);
                class169.field2360.method1383(class256.field3447[82] ? 1 : 0, (byte) 18);
                class169.field2360.method1354(class24.field243, arg0 + 111);
                class138.method824(class390.field5715.field6350[0], var27.field6350[0], var27.method786((byte) 70), -2, var27.method786((byte) 70), true, 0, (byte) -127, 0, class390.field5715.field6351[0], var27.field6351[0]);
            }
        }
        if (var4 == 38) {
            class133 var28 = class375.field5473[var5];
            if (var28 != null) {
                class130.field1803 = class302.field4326;
                class94.field1038 = 2;
                class417.field5994++;
                class420.field6040 = class124.field1643;
                field1194 = 0;
                class169.field2360.method809(115, -28022);
                class169.field2360.method1380(var5, (byte) -8);
                class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
                class138.method824(class390.field5715.field6350[0], var28.field6350[0], var28.method786((byte) 70), -2, var28.method786((byte) 70), true, 0, (byte) -112, 0, class390.field5715.field6351[0], var28.field6351[0]);
            }
        }
        if (var4 == 30) {
            class236.field3219++;
            class169.field2360.method809(163, -28022);
            class169.field2360.method1361((byte) -125, var3);
            class119 var29 = class179.method1170(var3, 818041328);
            if (var29.field1582 != null && var29.field1582[0][0] == 5) {
                int var30 = var29.field1582[0][1];
                class283.field3972[var30] = 1 - class283.field3972[var30];
                class388.method2477(var30, 3504);
            }
        }
        if (var4 == 1005) {
            field1194 = 0;
            class420.field6040 = class124.field1643;
            class94.field1038 = 2;
            class96.field1069++;
            class130.field1803 = class302.field4326;
            class169.field2360.method809(34, arg0 ^ 0xFFFF928B);
            class169.field2360.method1371((int) (var6 >>> 32) & Integer.MAX_VALUE, 29594);
            class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1380(var3 + class217.field2975, (byte) -8);
            class169.field2360.method1380(class40.field427 + var2, (byte) -8);
            class179.method1172(var2, var6, var3, arg0 ^ 0x1);
        }
        if (var4 == 1002) {
            class420.field6040 = class124.field1643;
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class222.field3041++;
            class94.field1038 = 2;
            class169.field2360.method809(162, -28022);
            class169.field2360.method1354(var5, arg0 ^ 0x6B);
        }
        if (var4 == 46) {
            class358 var31 = class81.field917[var5];
            if (var31 != null) {
                class130.field1803 = class302.field4326;
                class373.field5450++;
                class420.field6040 = class124.field1643;
                class94.field1038 = 2;
                field1194 = 0;
                class169.field2360.method809(228, -28022);
                class169.field2360.method1380(var5, (byte) -8);
                class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
                class138.method824(class390.field5715.field6350[0], var31.field6350[0], var31.method786((byte) 70), -2, var31.method786((byte) 70), true, 0, (byte) 60, 0, class390.field5715.field6351[0], var31.field6351[0]);
            }
        }
        if (var4 == 32) {
            field1194 = 0;
            class248.field3362++;
            class130.field1803 = class302.field4326;
            class94.field1038 = 2;
            class420.field6040 = class124.field1643;
            class169.field2360.method809(49, -28022);
            class169.field2360.method1380(class40.field427 + var2, (byte) -8);
            class169.field2360.method1371((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 + 29593);
            class169.field2360.method1357((byte) 90, class217.field2975 + var3);
            class169.field2360.method1390(true, class256.field3447[82] ? 1 : 0);
            class179.method1172(var2, var6, var3, 0);
        }
        if (var4 == 7) {
            class130.field1803 = class302.field4326;
            class94.field1038 = 2;
            field1194 = 0;
            class112.field1297++;
            class420.field6040 = class124.field1643;
            class169.field2360.method809(123, arg0 - 28023);
            class169.field2360.method1345(arg0 ^ 0x1, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1354(Integer.MAX_VALUE & (int) (var6 >>> 32), 114);
            class169.field2360.method1380(var2 + class40.field427, (byte) -8);
            class169.field2360.method1354(class217.field2975 + var3, arg0 ^ 0x6F);
            class179.method1172(var2, var6, var3, 0);
        }
        if (var4 == 22) {
            class169.field2360.method809(207, -28022);
            class261.field3609++;
            class169.field2360.method1361((byte) -128, var3);
            class169.field2360.method1380(var2, (byte) -8);
            class169.field2360.method1371(var5, 29594);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 51) {
            class358 var32 = class81.field917[var5];
            if (var32 != null) {
                class420.field6040 = class124.field1643;
                class157.field2230++;
                class94.field1038 = 2;
                class130.field1803 = class302.field4326;
                field1194 = 0;
                class169.field2360.method809(133, -28022);
                class169.field2360.method1354(var5, 124);
                class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
                class138.method824(class390.field5715.field6350[0], var32.field6350[0], var32.method786((byte) 70), -2, var32.method786((byte) 70), true, 0, (byte) 86, 0, class390.field5715.field6351[0], var32.field6351[0]);
            }
        }
        if (var4 == 31) {
            class133 var33 = class375.field5473[var5];
            if (var33 != null) {
                class94.field1038 = 2;
                class130.field1803 = class302.field4326;
                class420.field6040 = class124.field1643;
                class67.field757++;
                field1194 = 0;
                class169.field2360.method809(148, -28022);
                class169.field2360.method1354(class24.field243, 123);
                class169.field2360.method1335(class199.field2715, -24049);
                class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
                class169.field2360.method1380(var5, (byte) -8);
                class138.method824(class390.field5715.field6350[0], var33.field6350[0], var33.method786((byte) 70), -2, var33.method786((byte) 70), true, 0, (byte) -113, 0, class390.field5715.field6351[0], var33.field6351[0]);
            }
        }
        if (var4 == 1009) {
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            class94.field1038 = 2;
            class358 var34 = class81.field917[var5];
            if (var34 != null) {
                class335 var35 = var34.field5229;
                if (var35.field4984 != null) {
                    var35 = var35.method2162(arg0 ^ 0x1);
                }
                if (var35 != null) {
                    class102.field1163++;
                    class169.field2360.method809(220, -28022);
                    class169.field2360.method1380(var35.field4979, (byte) -8);
                }
            }
        }
        if (var4 == 43) {
            class94.field1038 = 2;
            class130.field1803 = class302.field4326;
            field1194 = 0;
            class242.field3276++;
            class420.field6040 = class124.field1643;
            class169.field2360.method809(131, -28022);
            class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1386((byte) 108, class3.field49);
            class169.field2360.method1354(class217.field2975 + var3, 114);
            class169.field2360.method1354(class50.field575, 117);
            class169.field2360.method1371(class40.field427 + var2, 29594);
            class169.field2360.method1354(class373.field5443, arg0 + 105);
            class169.field2360.method1357((byte) 90, var5);
            class2.method11(var3, var2, 17585);
        }
        if (var4 == 20 && class344.field5061 == null) {
            class314.method1962(var3, (byte) 109, var2);
            class344.field5061 = class354.method2262(arg0 - 129, var2, var3);
            class101.method543((byte) 74, class344.field5061);
        }
        if (var4 == 3) {
            class133 var36 = class375.field5473[var5];
            if (var36 != null) {
                class130.field1803 = class302.field4326;
                class137.field1942++;
                class420.field6040 = class124.field1643;
                class94.field1038 = 2;
                field1194 = 0;
                class169.field2360.method809(57, -28022);
                class169.field2360.method1380(var5, (byte) -8);
                class169.field2360.method1396(21375, class256.field3447[82] ? 1 : 0);
                class138.method824(class390.field5715.field6350[0], var36.field6350[0], var36.method786((byte) 70), -2, var36.method786((byte) 70), true, 0, (byte) -121, 0, class390.field5715.field6351[0], var36.field6351[0]);
            }
        }
        if (var4 == 2) {
            class110.field1276++;
            class169.field2360.method809(178, -28022);
            class169.field2360.method1361((byte) -128, var3);
            class169.field2360.method1357((byte) 90, var5);
            class169.field2360.method1354(var2, arg0 + 106);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 50) {
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class94.field1038 = 2;
            class420.field6040 = class124.field1643;
            class153.field2149++;
            class169.field2360.method809(25, -28022);
            class169.field2360.method1354(var5, arg0 ^ 0x73);
            class169.field2360.method1383(class256.field3447[82] ? 1 : 0, (byte) 18);
            class169.field2360.method1354(class40.field427 + var2, 119);
            class169.field2360.method1371(class217.field2975 + var3, 29594);
            class2.method11(var3, var2, 17585);
        }
        if (var4 == 26) {
            class248.field3366++;
            class169.field2360.method809(71, -28022);
            class169.field2360.method1361((byte) -128, var3);
            class169.field2360.method1371(var5, 29594);
            class169.field2360.method1354(var2, arg0 ^ 0x7A);
            class256.field3439 = 0;
            class96.field1071 = class179.method1170(var3, 818041328);
            class2.field29 = var2;
        }
        if (var4 == 28) {
            class233.method1482(false, 21571);
        }
        if (var4 == 35) {
            class246.field3343++;
            field1194 = 0;
            class130.field1803 = class302.field4326;
            class420.field6040 = class124.field1643;
            class94.field1038 = 2;
            class169.field2360.method809(153, -28022);
            class169.field2360.method1396(21375, class256.field3447[82] ? 1 : 0);
            class169.field2360.method1371(var2 + class40.field427, arg0 ^ 0x739B);
            class169.field2360.method1380(class217.field2975 + var3, (byte) -8);
            class169.field2360.method1357((byte) 90, var5);
            class2.method11(var3, var2, 17585);
        }
        if (class423.field6070 != 0) {
            class423.field6070 = 0;
            class101.method543((byte) -89, class179.method1170(class3.field49, 818041328));
        }
        if (class271.field3842) {
            class428.method2664(-1);
        }
        if (class96.field1071 != null && class256.field3439 == 0) {
            class101.method543((byte) -102, class96.field1071);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V", line = 1205)
    public static final void method567(byte arg0) {
        if (arg0 != 3) {
            method563(false);
        }
        field1184++;
        if (class206.field2803) {
            return;
        }
        class206.field2803 = true;
        class404.field5889 = true;
        if (class291.field4173) {
            class276.field3893 = (float) ((int) class276.field3893 - 65 & 0xFFFFFF80);
        } else {
            class8.field107 += (-class8.field107 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 1232)
    public static final void method569(int arg0) {
        if (arg0 != 2659) {
            return;
        }
        class193.method1236(4079, false);
        field1187++;
        if (class211.field2882 >= 0 && class211.field2882 != 0) {
            client.method1065((byte) -77, class211.field2882);
            class211.field2882 = -1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIII)V", line = 1501)
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1196 = arg4;
        this.field1182 = arg1;
        this.field1200 = arg0;
        this.field1186 = arg2;
        this.field1195 = arg3;
        this.method565((byte) 116);
        this.method571((byte) -115);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V", line = 1258)
    private final void method571(byte arg0) {
        field1201++;
        Random var2 = new Random((long) this.field1200);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1185[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var6 = 255 - var4;
            int var7 = class239.method1529(var6, (byte) -96, var2);
            short var8 = this.field1185[var7];
            this.field1185[var7] = this.field1185[var6];
            this.field1185[var6] = this.field1185[var6 + 256] = var8;
        }
        int var5 = -105 / ((arg0 + 59) / 52);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII)V", line = 1330)
    public final void method573(int arg0, int arg1, int arg2, int arg3) {
        field1193++;
        if (arg0 != 1) {
            field1199 = null;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method568(82);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field1182; var14++) {
                        int var15 = this.field1197[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field1196 * var15 >> 12;
                        int var19 = this.field1186 * var15 >> 12;
                        int var20 = this.field1195 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field1195 * var16;
                        int var23 = this.field1186 * var17;
                        int var24 = this.field1196 * var21;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var26 < var19) {
                            var34 = var26 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35;
                        if (var20 > var29) {
                            var35 = var29 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var18 > var32) {
                            var38 = var32 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var31 & 0xFF;
                        int var40 = var36 - 4096;
                        short var41 = this.field1185[var38];
                        int var42 = class108.field1246[var33];
                        int var43 = var37 - 4096;
                        short var44 = this.field1185[var39];
                        int var45 = var33 - 4096;
                        int var46 = class108.field1246[var36];
                        int var47 = class108.field1246[var37];
                        short var48 = this.field1185[var30 + var44];
                        short var49 = this.field1185[var35 + var41];
                        short var50 = this.field1185[var30 + var41];
                        short var51 = this.field1185[var35 + var44];
                        int var52 = class442.method2740(this.field1185[var27 + var48], true, var33, var36, var37);
                        int var53 = class442.method2740(this.field1185[var34 + var48], true, var33, var36, var43);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class442.method2740(this.field1185[var27 + var51], true, var33, var40, var37);
                        int var56 = class442.method2740(this.field1185[var34 + var51], true, var33, var40, var43);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = ((var57 - var54) * var46 >> 12) + var54;
                        int var59 = class442.method2740(this.field1185[var27 + var50], true, var45, var36, var37);
                        int var60 = class442.method2740(this.field1185[var34 + var50], true, var45, var36, var43);
                        int var61 = var59 + ((var60 - var59) * var47 >> 12);
                        int var62 = class442.method2740(this.field1185[var27 + var49], true, var45, var40, var37);
                        int var63 = class442.method2740(this.field1185[var34 + var49], true, var45, var40, var43);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method570(var14, ((var65 - var58) * var42 >> 12) + var58, (byte) -81);
                    }
                    this.method572(102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public abstract void method568(int arg0);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB)V")
    public abstract void method570(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public abstract void method572(int arg0);
}

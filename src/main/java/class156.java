import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class156 extends class51 {

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public int field2655 = 0;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "[S")
    public static short[] field2654 = new short[256];

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILf;I)V", line = 6)
    public static final void method1111(int arg0, class331 arg1, int arg2) {
        field2656++;
        Object[] var3 = arg1.field5635;
        int var4 = (Integer) var3[0];
        class40 var5 = class216.method1539(var4, (byte) 89);
        if (var5 == null) {
            return;
        }
        class86.field1542 = 0;
        if (arg0 != -16646) {
            field2654 = (short[]) null;
        }
        int[] var6 = var5.field703;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field689;
        int var10 = 0;
        byte var11 = -1;
        try {
            class163.field2817 = new int[var5.field688];
            int var12 = 0;
            class205.field3589 = new class82[var5.field691];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field5648;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field5638;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field5649 == null ? -1 : arg1.field5649.field1172;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field5632;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field5649 == null ? -1 : arg1.field5649.field1238;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field5646 == null ? -1 : arg1.field5646.field1172;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field5646 == null ? -1 : arg1.field5646.field1238;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field5644;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field5636;
                    }
                    class163.field2817[var13++] = var16;
                } else if (var3[var14] instanceof class82) {
                    class82 var15 = (class82) var3[var14];
                    if (var15.method534(-29, class78.field1333)) {
                        var15 = arg1.field5630;
                    }
                    class205.field3589[var12++] = var15;
                }
            }
            int var17 = 0;
            label4123: while (true) {
                var17++;
                if (var17 > arg2) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var498 = var6[var8];
                if (var498 < 100) {
                    if (var498 == 0) {
                        class25.field341[var10++] = var9[var8];
                        continue;
                    }
                    if (var498 == 1) {
                        int var18 = var9[var8];
                        class25.field341[var10++] = class312.field5398[var18];
                        continue;
                    }
                    if (var498 == 2) {
                        int var19 = var9[var8];
                        var10--;
                        class327.method2241(var19, class25.field341[var10], arg0 ^ 0xFFFFBEA9);
                        continue;
                    }
                    if (var498 == 3) {
                        class110.field1970[var7++] = var5.field693[var8];
                        continue;
                    }
                    if (var498 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var498 == 7) {
                        var10 -= 2;
                        if (class25.field341[var10 + 1] != class25.field341[var10]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var498 == 8) {
                        var10 -= 2;
                        if (class25.field341[var10 + 1] == class25.field341[var10]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var498 == 9) {
                        var10 -= 2;
                        if (class25.field341[var10 + 1] > class25.field341[var10]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var498 == 10) {
                        var10 -= 2;
                        if (class25.field341[var10] > class25.field341[var10 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var498 == 21) {
                        if (class86.field1542 == 0) {
                            return;
                        }
                        class100 var20 = class300.field5111[--class86.field1542];
                        class205.field3589 = var20.field1801;
                        class163.field2817 = var20.field1794;
                        var8 = var20.field1800;
                        var5 = var20.field1792;
                        var6 = var5.field703;
                        var9 = var5.field689;
                        continue;
                    }
                    if (var498 == 25) {
                        int var21 = var9[var8];
                        class25.field341[var10++] = class161.method1169(var21, class143.method974(arg0, -16646));
                        continue;
                    }
                    if (var498 == 27) {
                        int var22 = var9[var8];
                        var10--;
                        class134.method919(var22, (byte) -19, class25.field341[var10]);
                        continue;
                    }
                    if (var498 == 31) {
                        var10 -= 2;
                        if (class25.field341[var10 + 1] >= class25.field341[var10]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var498 == 32) {
                        var10 -= 2;
                        if (class25.field341[var10 + 1] <= class25.field341[var10]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var498 == 33) {
                        class25.field341[var10++] = class163.field2817[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var498 == 34) {
                        var10001 = var9[var8];
                        var10--;
                        class163.field2817[var10001] = class25.field341[var10];
                        continue;
                    }
                    if (var498 == 35) {
                        class110.field1970[var7++] = class205.field3589[var9[var8]];
                        continue;
                    }
                    if (var498 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class205.field3589[var10001] = class110.field1970[var7];
                        continue;
                    }
                    if (var498 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        class82 var24 = class222.method1596(true, var7, class110.field1970, var23);
                        class110.field1970[var7++] = var24;
                        continue;
                    }
                    if (var498 == 38) {
                        var10--;
                        continue;
                    }
                    if (var498 == 39) {
                        var7--;
                        continue;
                    }
                    if (var498 == 40) {
                        int var25 = var9[var8];
                        class40 var26 = class216.method1539(var25, (byte) 89);
                        class82[] var27 = new class82[var26.field691];
                        int[] var28 = new int[var26.field688];
                        for (int var29 = 0; var29 < var26.field707; var29++) {
                            var28[var29] = class25.field341[var10 + var29 - var26.field707];
                        }
                        for (int var30 = 0; var30 < var26.field698; var30++) {
                            var27[var30] = class110.field1970[var7 + var30 - var26.field698];
                        }
                        var7 -= var26.field698;
                        var10 -= var26.field707;
                        class100 var31 = new class100();
                        var31.field1800 = var8;
                        var31.field1792 = var5;
                        var31.field1801 = class205.field3589;
                        var31.field1794 = class163.field2817;
                        if (class300.field5111.length <= class86.field1542) {
                            throw new RuntimeException();
                        }
                        class300.field5111[class86.field1542++] = var31;
                        var5 = var26;
                        var6 = var26.field703;
                        var8 = -1;
                        var9 = var26.field689;
                        class163.field2817 = var28;
                        class205.field3589 = var27;
                        continue;
                    }
                    if (var498 == 42) {
                        class25.field341[var10++] = class247.field4282[var9[var8]];
                        continue;
                    }
                    if (var498 == 43) {
                        int var32 = var9[var8];
                        var10--;
                        class247.field4282[var32] = class25.field341[var10];
                        class130.method904(var32, (byte) -12);
                        continue;
                    }
                    if (var498 == 44) {
                        int var33 = var9[var8] >> 16;
                        int var34 = var9[var8] & 0xFFFF;
                        var10--;
                        int var35 = class25.field341[var10];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            class219.field3800[var33] = var35;
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4123;
                                }
                                class250.field4309[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 45) {
                        var10--;
                        int var38 = class25.field341[var10];
                        int var39 = var9[var8];
                        if (var38 >= 0 && var38 < class219.field3800[var39]) {
                            class25.field341[var10++] = class250.field4309[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 46) {
                        var10 -= 2;
                        int var40 = class25.field341[var10];
                        int var41 = var9[var8];
                        if (var40 >= 0 && var40 < class219.field3800[var41]) {
                            class250.field4309[var41][var40] = class25.field341[var10 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 47) {
                        class82 var42 = class123.field2149[var9[var8]];
                        if (var42 == null) {
                            var42 = class177.field3047;
                        }
                        class110.field1970[var7++] = var42;
                        continue;
                    }
                    if (var498 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class123.field2149[var43] = class110.field1970[var7];
                        class37.method291(var43, 0);
                        continue;
                    }
                    if (var498 == 51) {
                        class79 var44 = var5.field706[var9[var8]];
                        var10--;
                        class259 var45 = (class259) var44.method507((long) class25.field341[var10], arg0 + 602441958);
                        if (var45 != null) {
                            var8 += var45.field4431;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var498 < 300) {
                    if (var498 == 100) {
                        var10 -= 3;
                        int var477 = class25.field341[var10];
                        int var478 = class25.field341[var10 + 1];
                        int var479 = class25.field341[var10 + 2];
                        if (var478 == 0) {
                            throw new RuntimeException();
                        }
                        class75 var480 = class282.method1965(var477, (byte) 6);
                        if (var480.field1274 == null) {
                            var480.field1274 = new class75[var479 + 1];
                        }
                        if (var479 >= var480.field1274.length) {
                            class75[] var481 = new class75[var479 + 1];
                            for (int var482 = 0; var482 < var480.field1274.length; var482++) {
                                var481[var482] = var480.field1274[var482];
                            }
                            var480.field1274 = var481;
                        }
                        if (var479 > 0 && var480.field1274[var479 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var479 - 1));
                        }
                        class75 var483 = new class75();
                        var483.field1238 = var479;
                        var483.field1280 = var483.field1172 = var480.field1172;
                        var483.field1136 = true;
                        var483.field1184 = var478;
                        var480.field1274[var479] = var483;
                        if (var46) {
                            class221.field3832 = var483;
                        } else {
                            class21.field286 = var483;
                        }
                        class138.method937(var480, 16);
                        continue;
                    }
                    if (var498 == 101) {
                        class75 var484 = var46 ? class221.field3832 : class21.field286;
                        if (var484.field1238 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class75 var485 = class282.method1965(var484.field1172, (byte) 6);
                        var485.field1274[var484.field1238] = null;
                        class138.method937(var485, 16);
                        continue;
                    }
                    if (var498 == 102) {
                        var10--;
                        class75 var486 = class282.method1965(class25.field341[var10], (byte) 6);
                        var486.field1274 = null;
                        class138.method937(var486, arg0 ^ 0xFFFFBEEA);
                        continue;
                    }
                    if (var498 == 200) {
                        var10 -= 2;
                        int var487 = class25.field341[var10];
                        int var488 = class25.field341[var10 + 1];
                        class75 var489 = class257.method1840(false, var487, var488);
                        if (var489 != null && var488 != -1) {
                            class25.field341[var10++] = 1;
                            if (var46) {
                                class221.field3832 = var489;
                            } else {
                                class21.field286 = var489;
                            }
                            continue;
                        }
                        class25.field341[var10++] = 0;
                        continue;
                    }
                    if (var498 == 201) {
                        var10--;
                        int var490 = class25.field341[var10];
                        class75 var491 = class282.method1965(var490, (byte) 6);
                        if (var491 == null) {
                            class25.field341[var10++] = 0;
                        } else {
                            class25.field341[var10++] = 1;
                            if (var46) {
                                class221.field3832 = var491;
                            } else {
                                class21.field286 = var491;
                            }
                        }
                        continue;
                    }
                } else if (var498 < 500) {
                    if (var498 == 403) {
                        var10 -= 2;
                        int var47 = class25.field341[var10];
                        if (var47 >= 7) {
                            var47 -= 7;
                        }
                        int var48 = class25.field341[var10 + 1];
                        class168.field2932.field1404.method1390(var48, var47, (byte) -41);
                        continue;
                    }
                    if (var498 == 404) {
                        var10 -= 2;
                        int var49 = class25.field341[var10];
                        int var50 = class25.field341[var10 + 1];
                        class168.field2932.field1404.method1391(var50, var49, (byte) -100);
                        continue;
                    }
                    if (var498 == 410) {
                        var10--;
                        boolean var51 = class25.field341[var10] != 0;
                        class168.field2932.field1404.method1389(var51, (byte) -127);
                        continue;
                    }
                } else if (var498 >= 1000 && var498 < 1100 || var498 >= 2000 && var498 < 2100) {
                    class75 var52;
                    if (var498 < 2000) {
                        var52 = var46 ? class221.field3832 : class21.field286;
                    } else {
                        var10--;
                        var52 = class282.method1965(class25.field341[var10], (byte) 6);
                        var498 -= 1000;
                    }
                    if (var498 == 1000) {
                        var10 -= 4;
                        var52.field1240 = class25.field341[var10];
                        var52.field1290 = class25.field341[var10 + 1];
                        int var53 = class25.field341[var10 + 2];
                        if (var53 < 0) {
                            var53 = 0;
                        } else if (var53 > 5) {
                            var53 = 5;
                        }
                        int var54 = class25.field341[var10 + 3];
                        if (var54 < 0) {
                            var54 = 0;
                        } else if (var54 > 5) {
                            var54 = 5;
                        }
                        var52.field1273 = (byte) var53;
                        var52.field1193 = (byte) var54;
                        class138.method937(var52, 16);
                        class257.method1839(var52, -1);
                        if (var52.field1238 == -1) {
                            class163.method1174(-13965, var52.field1172);
                        }
                        continue;
                    }
                    if (var498 == 1001) {
                        var10 -= 4;
                        var52.field1298 = class25.field341[var10];
                        var52.field1297 = class25.field341[var10 + 1];
                        var52.field1257 = 0;
                        var52.field1206 = 0;
                        int var55 = class25.field341[var10 + 2];
                        if (var55 < 0) {
                            var55 = 0;
                        } else if (var55 > 4) {
                            var55 = 4;
                        }
                        int var56 = class25.field341[var10 + 3];
                        if (var56 < 0) {
                            var56 = 0;
                        } else if (var56 > 4) {
                            var56 = 4;
                        }
                        var52.field1173 = (byte) var55;
                        var52.field1143 = (byte) var56;
                        class138.method937(var52, arg0 ^ 0xFFFFBEEA);
                        class257.method1839(var52, -1);
                        if (var52.field1184 == 0) {
                            class177.method1253((byte) -55, var52, false);
                        }
                        continue;
                    }
                    if (var498 == 1003) {
                        var10--;
                        boolean var57 = class25.field341[var10] == 1;
                        if (var57 != var52.field1281) {
                            var52.field1281 = var57;
                            class138.method937(var52, 16);
                        }
                        if (var52.field1238 == -1) {
                            class187.method1296(var52.field1172, (byte) -109);
                        }
                        continue;
                    }
                    if (var498 == 1004) {
                        var10 -= 2;
                        var52.field1153 = class25.field341[var10];
                        var52.field1263 = class25.field341[var10 + 1];
                        class138.method937(var52, 16);
                        class257.method1839(var52, arg0 + 16645);
                        if (var52.field1184 == 0) {
                            class177.method1253((byte) -55, var52, false);
                        }
                        continue;
                    }
                } else if (var498 >= 1100 && var498 < 1200 || var498 >= 2100 && var498 < 2200) {
                    class75 var474;
                    if (var498 < 2000) {
                        var474 = var46 ? class221.field3832 : class21.field286;
                    } else {
                        var498 -= 1000;
                        var10--;
                        var474 = class282.method1965(class25.field341[var10], (byte) 6);
                    }
                    if (var498 == 1100) {
                        var10 -= 2;
                        var474.field1146 = class25.field341[var10];
                        if (var474.field1220 - var474.field1216 < var474.field1146) {
                            var474.field1146 = var474.field1220 - var474.field1216;
                        }
                        if (var474.field1146 < 0) {
                            var474.field1146 = 0;
                        }
                        var474.field1188 = class25.field341[var10 + 1];
                        if (var474.field1224 - var474.field1205 < var474.field1188) {
                            var474.field1188 = var474.field1224 - var474.field1205;
                        }
                        if (var474.field1188 < 0) {
                            var474.field1188 = 0;
                        }
                        class138.method937(var474, 16);
                        if (var474.field1238 == -1) {
                            class4.method28(var474.field1172, -127);
                        }
                        continue;
                    }
                    if (var498 == 1101) {
                        var10--;
                        var474.field1288 = class25.field341[var10];
                        class138.method937(var474, 16);
                        if (var474.field1238 == -1) {
                            class201.method1414(50, var474.field1172);
                        }
                        continue;
                    }
                    if (var498 == 1102) {
                        var10--;
                        var474.field1304 = class25.field341[var10] == 1;
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1103) {
                        var10--;
                        var474.field1269 = class25.field341[var10];
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1104) {
                        var10--;
                        var474.field1182 = class25.field341[var10];
                        class138.method937(var474, arg0 ^ 0xFFFFBEEA);
                        continue;
                    }
                    if (var498 == 1105) {
                        var10--;
                        var474.field1150 = class25.field341[var10];
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1106) {
                        var10--;
                        var474.field1155 = class25.field341[var10];
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1107) {
                        var10--;
                        var474.field1259 = class25.field341[var10] == 1;
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1108) {
                        var474.field1180 = 1;
                        var10--;
                        var474.field1164 = class25.field341[var10];
                        class138.method937(var474, arg0 + 16662);
                        if (var474.field1238 == -1) {
                            class60.method397(var474.field1172, 14704);
                        }
                        continue;
                    }
                    if (var498 == 1109) {
                        var10 -= 6;
                        var474.field1249 = class25.field341[var10];
                        var474.field1171 = class25.field341[var10 + 1];
                        var474.field1299 = class25.field341[var10 + 2];
                        var474.field1167 = class25.field341[var10 + 3];
                        var474.field1286 = class25.field341[var10 + 4];
                        var474.field1186 = class25.field341[var10 + 5];
                        class138.method937(var474, 16);
                        if (var474.field1238 == -1) {
                            class285.method1977(var474.field1172, (byte) -104);
                            class159.method1149((byte) -108, var474.field1172);
                        }
                        continue;
                    }
                    if (var498 == 1110) {
                        var10--;
                        int var475 = class25.field341[var10];
                        if (var474.field1235 != var475) {
                            var474.field1139 = 0;
                            var474.field1202 = 0;
                            var474.field1235 = var475;
                            class138.method937(var474, arg0 ^ 0xFFFFBEEA);
                        }
                        if (var474.field1238 == -1) {
                            class286.method1989(-1477916752, var474.field1172);
                        }
                        continue;
                    }
                    if (var498 == 1111) {
                        var10--;
                        var474.field1251 = class25.field341[var10] == 1;
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1112) {
                        var7--;
                        class82 var476 = class110.field1970[var7];
                        if (!var476.method534(arg0 ^ 0x4159, var474.field1276)) {
                            var474.field1276 = var476;
                            class138.method937(var474, 16);
                        }
                        if (var474.field1238 == -1) {
                            class253.method1819((byte) 127, var474.field1172);
                        }
                        continue;
                    }
                    if (var498 == 1113) {
                        var10--;
                        var474.field1250 = class25.field341[var10];
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1114) {
                        var10 -= 3;
                        var474.field1203 = class25.field341[var10];
                        var474.field1236 = class25.field341[var10 + 1];
                        var474.field1232 = class25.field341[var10 + 2];
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1115) {
                        var10--;
                        var474.field1233 = class25.field341[var10] == 1;
                        class138.method937(var474, arg0 ^ 0xFFFFBEEA);
                        continue;
                    }
                    if (var498 == 1116) {
                        var10--;
                        var474.field1201 = class25.field341[var10];
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1117) {
                        var10--;
                        var474.field1229 = class25.field341[var10];
                        class138.method937(var474, arg0 ^ 0xFFFFBEEA);
                        continue;
                    }
                    if (var498 == 1118) {
                        var10--;
                        var474.field1162 = class25.field341[var10] == 1;
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1119) {
                        var10--;
                        var474.field1227 = class25.field341[var10] == 1;
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1120) {
                        var10 -= 2;
                        var474.field1220 = class25.field341[var10];
                        var474.field1224 = class25.field341[var10 + 1];
                        class138.method937(var474, 16);
                        if (var474.field1184 == 0) {
                            class177.method1253((byte) -55, var474, false);
                        }
                        continue;
                    }
                    if (var498 == 1121) {
                        var10 -= 2;
                        var474.field1283 = (short) class25.field341[var10];
                        var474.field1239 = (short) class25.field341[var10 + 1];
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1122) {
                        var10--;
                        var474.field1228 = class25.field341[var10] == 1;
                        class138.method937(var474, 16);
                        continue;
                    }
                    if (var498 == 1123) {
                        var10--;
                        var474.field1186 = class25.field341[var10];
                        class138.method937(var474, 16);
                        if (var474.field1238 == -1) {
                            class285.method1977(var474.field1172, (byte) -104);
                        }
                        continue;
                    }
                } else if (var498 >= 1200 && var498 < 1300 || var498 >= 2200 && var498 < 2300) {
                    class75 var470;
                    if (var498 < 2000) {
                        var470 = var46 ? class221.field3832 : class21.field286;
                    } else {
                        var498 -= 1000;
                        var10--;
                        var470 = class282.method1965(class25.field341[var10], (byte) 6);
                    }
                    class138.method937(var470, 16);
                    if (var498 == 1200 || var498 == 1205) {
                        var10 -= 2;
                        int var471 = class25.field341[var10];
                        int var472 = class25.field341[var10 + 1];
                        if (var470.field1238 == -1) {
                            class282.method1960(var470.field1172, arg0 ^ 0xFFFFBEF3);
                            class285.method1977(var470.field1172, (byte) -118);
                            class159.method1149((byte) -107, var470.field1172);
                        }
                        if (var471 == -1) {
                            var470.field1164 = -1;
                            var470.field1180 = 1;
                            var470.field1262 = -1;
                        } else {
                            var470.field1262 = var471;
                            var470.field1244 = var472;
                            class312 var473 = class273.method1912(var471, -122);
                            if (var498 == 1205) {
                                var470.field1264 = false;
                            } else {
                                var470.field1264 = true;
                            }
                            var470.field1249 = var473.field5386;
                            var470.field1167 = var473.field5389;
                            var470.field1171 = var473.field5377;
                            var470.field1286 = var473.field5343;
                            var470.field1299 = var473.field5360;
                            var470.field1186 = var473.field5363;
                            if (var470.field1257 > 0) {
                                var470.field1186 = var470.field1186 * 32 / var470.field1257;
                            } else if (var470.field1298 > 0) {
                                var470.field1186 = var470.field1186 * 32 / var470.field1298;
                            }
                        }
                        continue;
                    }
                    if (var498 == 1201) {
                        var470.field1180 = 2;
                        var10--;
                        var470.field1164 = class25.field341[var10];
                        if (var470.field1238 == -1) {
                            class60.method397(var470.field1172, 14704);
                        }
                        continue;
                    }
                    if (var498 == 1202) {
                        var470.field1180 = 3;
                        var470.field1164 = class168.field2932.field1404.method1393(-1651847158);
                        if (var470.field1238 == -1) {
                            class60.method397(var470.field1172, 14704);
                        }
                        continue;
                    }
                    if (var498 == 1203) {
                        var470.field1180 = 6;
                        var10--;
                        var470.field1164 = class25.field341[var10];
                        if (var470.field1238 == -1) {
                            class60.method397(var470.field1172, 14704);
                        }
                        continue;
                    }
                    if (var498 == 1204) {
                        var470.field1180 = 5;
                        var10--;
                        var470.field1164 = class25.field341[var10];
                        if (var470.field1238 == -1) {
                            class60.method397(var470.field1172, 14704);
                        }
                        continue;
                    }
                } else if (var498 >= 1300 && var498 < 1400 || var498 >= 2300 && var498 < 2400) {
                    class75 var58;
                    if (var498 < 2000) {
                        var58 = var46 ? class221.field3832 : class21.field286;
                    } else {
                        var498 -= 1000;
                        var10--;
                        var58 = class282.method1965(class25.field341[var10], (byte) 6);
                    }
                    if (var498 == 1300) {
                        var10--;
                        int var59 = class25.field341[var10] - 1;
                        if (var59 >= 0 && var59 <= 9) {
                            var7--;
                            var58.method474(var59, class110.field1970[var7], arg0 ^ 0xFFFFB426);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var498 == 1301) {
                        var10 -= 2;
                        int var60 = class25.field341[var10];
                        int var61 = class25.field341[var10 + 1];
                        var58.field1157 = class257.method1840(false, var60, var61);
                        continue;
                    }
                    if (var498 == 1302) {
                        var10--;
                        var58.field1284 = class25.field341[var10] == 1;
                        continue;
                    }
                    if (var498 == 1303) {
                        var10--;
                        var58.field1237 = class25.field341[var10];
                        continue;
                    }
                    if (var498 == 1304) {
                        var10--;
                        var58.field1142 = class25.field341[var10];
                        continue;
                    }
                    if (var498 == 1305) {
                        var7--;
                        var58.field1187 = class110.field1970[var7];
                        continue;
                    }
                    if (var498 == 1306) {
                        var7--;
                        var58.field1168 = class110.field1970[var7];
                        continue;
                    }
                    if (var498 == 1307) {
                        var58.field1291 = null;
                        continue;
                    }
                } else {
                    if (var498 >= 1400 && var498 < 1500 || var498 >= 2400 && var498 < 2500) {
                        class75 var463;
                        if (var498 < 2000) {
                            var463 = var46 ? class221.field3832 : class21.field286;
                        } else {
                            var498 -= 1000;
                            var10--;
                            var463 = class282.method1965(class25.field341[var10], (byte) 6);
                        }
                        int[] var464 = null;
                        var7--;
                        class82 var465 = class110.field1970[var7];
                        if (var465.method535(true) > 0 && var465.method551(var465.method535(true) - 1, (byte) -116) == 89) {
                            var10--;
                            int var466 = class25.field341[var10];
                            if (var466 > 0) {
                                var464 = new int[var466];
                                while ((var466--) > 0) {
                                    var10--;
                                    var464[var466] = class25.field341[var10];
                                }
                            }
                            var465 = var465.method573(0, 73, var465.method535(true) - 1);
                        }
                        Object[] var467 = new Object[var465.method535(true) + 1];
                        for (int var468 = var467.length - 1; var468 >= 1; var468--) {
                            if (var465.method551(var468 - 1, (byte) -116) == 115) {
                                var7--;
                                var467[var468] = class110.field1970[var7];
                            } else {
                                var10--;
                                var467[var468] = Integer.valueOf(class25.field341[var10]);
                            }
                        }
                        var10--;
                        int var469 = class25.field341[var10];
                        if (var469 == -1) {
                            var467 = null;
                        } else {
                            var467[0] = Integer.valueOf(var469);
                        }
                        var463.field1218 = true;
                        if (var498 == 1400) {
                            var463.field1222 = var467;
                        } else if (var498 == 1401) {
                            var463.field1145 = var467;
                        } else if (var498 == 1402) {
                            var463.field1277 = var467;
                        } else if (var498 == 1403) {
                            var463.field1189 = var467;
                        } else if (var498 == 1404) {
                            var463.field1197 = var467;
                        } else if (var498 == 1405) {
                            var463.field1252 = var467;
                        } else if (var498 == 1406) {
                            var463.field1287 = var467;
                        } else if (var498 == 1407) {
                            var463.field1241 = var467;
                            var463.field1156 = var464;
                        } else if (var498 == 1408) {
                            var463.field1200 = var467;
                        } else if (var498 == 1409) {
                            var463.field1163 = var467;
                        } else if (var498 == 1410) {
                            var463.field1194 = var467;
                        } else if (var498 == 1411) {
                            var463.field1271 = var467;
                        } else if (var498 == 1412) {
                            var463.field1204 = var467;
                        } else if (var498 == 1414) {
                            var463.field1191 = var467;
                            var463.field1296 = var464;
                        } else if (var498 == 1415) {
                            var463.field1219 = var467;
                            var463.field1242 = var464;
                        } else if (var498 == 1416) {
                            var463.field1231 = var467;
                        } else if (var498 == 1417) {
                            var463.field1181 = var467;
                        } else if (var498 == 1418) {
                            var463.field1246 = var467;
                        } else if (var498 == 1419) {
                            var463.field1215 = var467;
                        } else if (var498 == 1420) {
                            var463.field1208 = var467;
                        } else if (var498 == 1421) {
                            var463.field1185 = var467;
                        } else if (var498 == 1422) {
                            var463.field1175 = var467;
                        } else if (var498 == 1423) {
                            var463.field1243 = var467;
                        } else if (var498 == 1424) {
                            var463.field1253 = var467;
                        } else if (var498 == 1425) {
                            var463.field1266 = var467;
                        } else if (var498 == 1426) {
                            var463.field1214 = var467;
                        } else if (var498 == 1427) {
                            var463.field1302 = var467;
                        } else if (var498 == 1428) {
                            var463.field1254 = var464;
                            var463.field1178 = var467;
                        } else if (var498 == 1429) {
                            var463.field1161 = var464;
                            var463.field1149 = var467;
                        }
                        continue;
                    }
                    if (var498 < 1600) {
                        class75 var462 = var46 ? class221.field3832 : class21.field286;
                        if (var498 == 1500) {
                            class25.field341[var10++] = var462.field1151;
                            continue;
                        }
                        if (var498 == 1501) {
                            class25.field341[var10++] = var462.field1294;
                            continue;
                        }
                        if (var498 == 1502) {
                            class25.field341[var10++] = var462.field1216;
                            continue;
                        }
                        if (var498 == 1503) {
                            class25.field341[var10++] = var462.field1205;
                            continue;
                        }
                        if (var498 == 1504) {
                            class25.field341[var10++] = var462.field1281 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 1505) {
                            class25.field341[var10++] = var462.field1280;
                            continue;
                        }
                    } else if (var498 < 1700) {
                        class75 var461 = var46 ? class221.field3832 : class21.field286;
                        if (var498 == 1600) {
                            class25.field341[var10++] = var461.field1146;
                            continue;
                        }
                        if (var498 == 1601) {
                            class25.field341[var10++] = var461.field1188;
                            continue;
                        }
                        if (var498 == 1602) {
                            class110.field1970[var7++] = var461.field1276;
                            continue;
                        }
                        if (var498 == 1603) {
                            class25.field341[var10++] = var461.field1220;
                            continue;
                        }
                        if (var498 == 1604) {
                            class25.field341[var10++] = var461.field1224;
                            continue;
                        }
                        if (var498 == 1605) {
                            class25.field341[var10++] = var461.field1186;
                            continue;
                        }
                        if (var498 == 1606) {
                            class25.field341[var10++] = var461.field1299;
                            continue;
                        }
                        if (var498 == 1607) {
                            class25.field341[var10++] = var461.field1286;
                            continue;
                        }
                        if (var498 == 1608) {
                            class25.field341[var10++] = var461.field1167;
                            continue;
                        }
                        if (var498 == 1609) {
                            class25.field341[var10++] = var461.field1269;
                            continue;
                        }
                        if (var498 == 1610) {
                            class25.field341[var10++] = var461.field1249;
                            continue;
                        }
                        if (var498 == 1611) {
                            class25.field341[var10++] = var461.field1171;
                            continue;
                        }
                    } else if (var498 < 1800) {
                        class75 var62 = var46 ? class221.field3832 : class21.field286;
                        if (var498 == 1700) {
                            class25.field341[var10++] = var62.field1262;
                            continue;
                        }
                        if (var498 == 1701) {
                            if (var62.field1262 == -1) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var62.field1244;
                            }
                            continue;
                        }
                        if (var498 == 1702) {
                            class25.field341[var10++] = var62.field1238;
                            continue;
                        }
                    } else if (var498 < 1900) {
                        class75 var459 = var46 ? class221.field3832 : class21.field286;
                        if (var498 == 1800) {
                            class25.field341[var10++] = class53.method374(class143.method974(arg0, 16755), client.method871(var459));
                            continue;
                        }
                        if (var498 == 1801) {
                            var10--;
                            int var460 = class25.field341[var10];
                            int var500 = var460 - 1;
                            if (var459.field1291 != null && var500 < var459.field1291.length && var459.field1291[var500] != null) {
                                class110.field1970[var7++] = var459.field1291[var500];
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 1802) {
                            if (var459.field1187 == null) {
                                class110.field1970[var7++] = class262.field4484;
                            } else {
                                class110.field1970[var7++] = var459.field1187;
                            }
                            continue;
                        }
                    } else if (var498 < 2600) {
                        var10--;
                        class75 var458 = class282.method1965(class25.field341[var10], (byte) 6);
                        if (var498 == 2500) {
                            class25.field341[var10++] = var458.field1151;
                            continue;
                        }
                        if (var498 == 2501) {
                            class25.field341[var10++] = var458.field1294;
                            continue;
                        }
                        if (var498 == 2502) {
                            class25.field341[var10++] = var458.field1216;
                            continue;
                        }
                        if (var498 == 2503) {
                            class25.field341[var10++] = var458.field1205;
                            continue;
                        }
                        if (var498 == 2504) {
                            class25.field341[var10++] = var458.field1281 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 2505) {
                            class25.field341[var10++] = var458.field1280;
                            continue;
                        }
                    } else if (var498 < 2700) {
                        var10--;
                        class75 var63 = class282.method1965(class25.field341[var10], (byte) 6);
                        if (var498 == 2600) {
                            class25.field341[var10++] = var63.field1146;
                            continue;
                        }
                        if (var498 == 2601) {
                            class25.field341[var10++] = var63.field1188;
                            continue;
                        }
                        if (var498 == 2602) {
                            class110.field1970[var7++] = var63.field1276;
                            continue;
                        }
                        if (var498 == 2603) {
                            class25.field341[var10++] = var63.field1220;
                            continue;
                        }
                        if (var498 == 2604) {
                            class25.field341[var10++] = var63.field1224;
                            continue;
                        }
                        if (var498 == 2605) {
                            class25.field341[var10++] = var63.field1186;
                            continue;
                        }
                        if (var498 == 2606) {
                            class25.field341[var10++] = var63.field1299;
                            continue;
                        }
                        if (var498 == 2607) {
                            class25.field341[var10++] = var63.field1286;
                            continue;
                        }
                        if (var498 == 2608) {
                            class25.field341[var10++] = var63.field1167;
                            continue;
                        }
                        if (var498 == 2609) {
                            class25.field341[var10++] = var63.field1269;
                            continue;
                        }
                        if (var498 == 2610) {
                            class25.field341[var10++] = var63.field1249;
                            continue;
                        }
                        if (var498 == 2611) {
                            class25.field341[var10++] = var63.field1171;
                            continue;
                        }
                    } else if (var498 < 2800) {
                        if (var498 == 2700) {
                            var10--;
                            class75 var448 = class282.method1965(class25.field341[var10], (byte) 6);
                            class25.field341[var10++] = var448.field1262;
                            continue;
                        }
                        if (var498 == 2701) {
                            var10--;
                            class75 var449 = class282.method1965(class25.field341[var10], (byte) 6);
                            if (var449.field1262 == -1) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var449.field1244;
                            }
                            continue;
                        }
                        if (var498 == 2702) {
                            var10--;
                            int var450 = class25.field341[var10];
                            class146 var451 = (class146) class191.field3195.method507((long) var450, 602425312);
                            if (var451 == null) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = 1;
                            }
                            continue;
                        }
                        if (var498 == 2703) {
                            var10--;
                            class75 var452 = class282.method1965(class25.field341[var10], (byte) 6);
                            if (var452.field1274 == null) {
                                class25.field341[var10++] = 0;
                                continue;
                            }
                            int var453 = var452.field1274.length;
                            for (int var454 = 0; var454 < var452.field1274.length; var454++) {
                                if (var452.field1274[var454] == null) {
                                    var453 = var454;
                                    break;
                                }
                            }
                            class25.field341[var10++] = var453;
                            continue;
                        }
                        if (var498 == 2704 || var498 == 2705) {
                            var10 -= 2;
                            int var455 = class25.field341[var10];
                            int var456 = class25.field341[var10 + 1];
                            class146 var457 = (class146) class191.field3195.method507((long) var455, 602425312);
                            if (var457 != null && var457.field2474 == var456) {
                                class25.field341[var10++] = 1;
                            } else {
                                class25.field341[var10++] = 0;
                            }
                            continue;
                        }
                    } else if (var498 < 2900) {
                        var10--;
                        class75 var64 = class282.method1965(class25.field341[var10], (byte) 6);
                        if (var498 == 2800) {
                            class25.field341[var10++] = class53.method374(-105, client.method871(var64));
                            continue;
                        }
                        if (var498 == 2801) {
                            var10--;
                            int var65 = class25.field341[var10];
                            int var499 = var65 - 1;
                            if (var64.field1291 != null && var499 < var64.field1291.length && var64.field1291[var499] != null) {
                                class110.field1970[var7++] = var64.field1291[var499];
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 2802) {
                            if (var64.field1187 == null) {
                                class110.field1970[var7++] = class262.field4484;
                            } else {
                                class110.field1970[var7++] = var64.field1187;
                            }
                            continue;
                        }
                    } else if (var498 < 3200) {
                        if (var498 == 3100) {
                            var7--;
                            class82 var66 = class110.field1970[var7];
                            class200.method1406(class262.field4484, 0, var66, arg0 + 16650);
                            continue;
                        }
                        if (var498 == 3101) {
                            var10 -= 2;
                            class260.method1857(class168.field2932, class25.field341[var10], class25.field341[var10 + 1], true);
                            continue;
                        }
                        if (var498 == 3103) {
                            class104.method719(true);
                            continue;
                        }
                        if (var498 == 3104) {
                            class171.field2956++;
                            var7--;
                            class82 var67 = class110.field1970[var7];
                            int var68 = 0;
                            if (var67.method545((byte) 109)) {
                                var68 = var67.method540((byte) -114);
                            }
                            class61.field957.method1504(137, -1);
                            class61.field957.method1065(arg0 ^ 0xF557D6AA, var68);
                            continue;
                        }
                        if (var498 == 3105) {
                            var7--;
                            class82 var69 = class110.field1970[var7];
                            class61.field957.method1504(225, arg0 + 16645);
                            class61.field957.method1057((byte) 43, var69.method568(22476));
                            class275.field4637++;
                            continue;
                        }
                        if (var498 == 3106) {
                            class141.field2425++;
                            var7--;
                            class82 var70 = class110.field1970[var7];
                            class61.field957.method1504(30, arg0 ^ 0x4105);
                            class61.field957.method1075(var70.method535(true) + 1, -1);
                            class61.field957.method1098((byte) 56, var70);
                            continue;
                        }
                        if (var498 == 3107) {
                            var10--;
                            int var71 = class25.field341[var10];
                            var7--;
                            class82 var72 = class110.field1970[var7];
                            class134.method920(var72, 107, var71);
                            continue;
                        }
                        if (var498 == 3108) {
                            var10 -= 3;
                            int var73 = class25.field341[var10];
                            int var74 = class25.field341[var10 + 2];
                            int var75 = class25.field341[var10 + 1];
                            class75 var76 = class282.method1965(var74, (byte) 6);
                            class201.method1415((byte) -78, var76, var75, var73);
                            continue;
                        }
                        if (var498 == 3109) {
                            var10 -= 2;
                            int var77 = class25.field341[var10 + 1];
                            int var78 = class25.field341[var10];
                            class75 var79 = var46 ? class221.field3832 : class21.field286;
                            class201.method1415((byte) -78, var79, var77, var78);
                            continue;
                        }
                        if (var498 == 3110) {
                            var10--;
                            int var80 = class25.field341[var10];
                            class61.field957.method1504(88, arg0 ^ 0x4105);
                            class290.field4871++;
                            class61.field957.method1102((byte) -38, var80);
                            continue;
                        }
                    } else if (var498 < 3300) {
                        if (var498 == 3200) {
                            var10 -= 3;
                            class222.method1588((byte) 85, class25.field341[var10 + 2], class25.field341[var10 + 1], class25.field341[var10]);
                            continue;
                        }
                        if (var498 == 3201) {
                            var10--;
                            class203.method1426(class25.field341[var10], true);
                            continue;
                        }
                        if (var498 == 3202) {
                            var10 -= 2;
                            class5.method30(class25.field341[var10], class25.field341[var10 + 1], 1);
                            continue;
                        }
                    } else if (var498 < 3400) {
                        if (var498 == 3300) {
                            class25.field341[var10++] = class212.field3708;
                            continue;
                        }
                        if (var498 == 3301) {
                            var10 -= 2;
                            int var421 = class25.field341[var10];
                            int var422 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class253.method1816(var422, var421, -120);
                            continue;
                        }
                        if (var498 == 3302) {
                            var10 -= 2;
                            int var423 = class25.field341[var10];
                            int var424 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class28.method173(var424, var423, class143.method974(arg0, -16642));
                            continue;
                        }
                        if (var498 == 3303) {
                            var10 -= 2;
                            int var425 = class25.field341[var10];
                            int var426 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class293.method2015(arg0 + 16735, var426, var425);
                            continue;
                        }
                        if (var498 == 3304) {
                            var10--;
                            int var427 = class25.field341[var10];
                            class25.field341[var10++] = class234.method1666(var427, true).field2655;
                            continue;
                        }
                        if (var498 == 3305) {
                            var10--;
                            int var428 = class25.field341[var10];
                            class25.field341[var10++] = class331.field5631[var428];
                            continue;
                        }
                        if (var498 == 3306) {
                            var10--;
                            int var429 = class25.field341[var10];
                            class25.field341[var10++] = class22.field296[var429];
                            continue;
                        }
                        if (var498 == 3307) {
                            var10--;
                            int var430 = class25.field341[var10];
                            class25.field341[var10++] = class208.field3645[var430];
                            continue;
                        }
                        if (var498 == 3308) {
                            int var431 = class297.field5058;
                            int var432 = (class168.field2932.field1685 >> 7) + class230.field3976;
                            int var433 = (class168.field2932.field1689 >> 7) + class226.field3916;
                            class25.field341[var10++] = (var431 << 28) + (var432 << 14) + var433;
                            continue;
                        }
                        if (var498 == 3309) {
                            var10--;
                            int var434 = class25.field341[var10];
                            class25.field341[var10++] = class277.method1935(16383, var434 >> 14);
                            continue;
                        }
                        if (var498 == 3310) {
                            var10--;
                            int var435 = class25.field341[var10];
                            class25.field341[var10++] = var435 >> 28;
                            continue;
                        }
                        if (var498 == 3311) {
                            var10--;
                            int var436 = class25.field341[var10];
                            class25.field341[var10++] = class277.method1935(var436, 16383);
                            continue;
                        }
                        if (var498 == 3312) {
                            class25.field341[var10++] = class323.field5547 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3313) {
                            var10 -= 2;
                            int var437 = class25.field341[var10 + 1];
                            int var438 = class25.field341[var10] + 32768;
                            class25.field341[var10++] = class253.method1816(var437, var438, -97);
                            continue;
                        }
                        if (var498 == 3314) {
                            var10 -= 2;
                            int var439 = class25.field341[var10] + 32768;
                            int var440 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class28.method173(var440, var439, 4);
                            continue;
                        }
                        if (var498 == 3315) {
                            var10 -= 2;
                            int var441 = class25.field341[var10] + 32768;
                            int var442 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class293.method2015(124, var442, var441);
                            continue;
                        }
                        if (var498 == 3316) {
                            if (class323.field5545 < 2) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = class323.field5545;
                            }
                            continue;
                        }
                        if (var498 == 3317) {
                            class25.field341[var10++] = class238.field4134;
                            continue;
                        }
                        if (var498 == 3318) {
                            class25.field341[var10++] = class47.field786;
                            continue;
                        }
                        if (var498 == 3321) {
                            class25.field341[var10++] = class235.field4091;
                            continue;
                        }
                        if (var498 == 3322) {
                            class25.field341[var10++] = class325.field5580;
                            continue;
                        }
                        if (var498 == 3323) {
                            if (class69.field1066 >= 5 && class69.field1066 <= 9) {
                                class25.field341[var10++] = 1;
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3324) {
                            if (class69.field1066 >= 5 && class69.field1066 <= 9) {
                                class25.field341[var10++] = class69.field1066;
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3325) {
                            class25.field341[var10++] = class86.field1534 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3326) {
                            class25.field341[var10++] = class168.field2932.field1407;
                            continue;
                        }
                        if (var498 == 3327) {
                            class25.field341[var10++] = class168.field2932.field1404.field3401 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3328) {
                            class25.field341[var10++] = class82.field1462 && !class317.field5437 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3329) {
                            class25.field341[var10++] = class289.field4864 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3330) {
                            var10--;
                            int var443 = class25.field341[var10];
                            class25.field341[var10++] = class298.method2063(24841, var443);
                            continue;
                        }
                        if (var498 == 3331) {
                            var10 -= 2;
                            int var444 = class25.field341[var10];
                            int var445 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class222.method1583(false, var444, arg0 + 16521, var445);
                            continue;
                        }
                        if (var498 == 3332) {
                            var10 -= 2;
                            int var446 = class25.field341[var10];
                            int var447 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class222.method1583(true, var446, -124, var447);
                            continue;
                        }
                        if (var498 == 3333) {
                            class25.field341[var10++] = class233.field4042;
                            continue;
                        }
                        if (var498 == 3335) {
                            class25.field341[var10++] = class53.field856;
                            continue;
                        }
                    } else if (var498 < 3500) {
                        if (var498 == 3400) {
                            var10 -= 2;
                            int var404 = class25.field341[var10];
                            int var405 = class25.field341[var10 + 1];
                            class37 var406 = class205.method1472((byte) 20, var404);
                            if (var406.field610 != 115) {
                            }
                            class110.field1970[var7++] = var406.method294(var405, 125);
                            continue;
                        }
                        if (var498 == 3408) {
                            var10 -= 4;
                            int var407 = class25.field341[var10 + 2];
                            int var408 = class25.field341[var10 + 1];
                            int var409 = class25.field341[var10];
                            int var410 = class25.field341[var10 + 3];
                            class37 var411 = class205.method1472((byte) 20, var407);
                            if (var411.field604 == var409 && var411.field610 == var408) {
                                if (var408 == 115) {
                                    class110.field1970[var7++] = var411.method294(var410, class143.method974(arg0, -16761));
                                } else {
                                    class25.field341[var10++] = var411.method288(1, var410);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var498 == 3409) {
                            var10 -= 3;
                            int var412 = class25.field341[var10];
                            int var413 = class25.field341[var10 + 1];
                            int var414 = class25.field341[var10 + 2];
                            if (var413 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class37 var415 = class205.method1472((byte) 20, var413);
                            if (var415.field610 != var412) {
                                throw new RuntimeException("C3409-1");
                            }
                            class25.field341[var10++] = var415.method287(true, var414) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3410) {
                            var10--;
                            int var416 = class25.field341[var10];
                            var7--;
                            class82 var417 = class110.field1970[var7];
                            if (var416 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class37 var418 = class205.method1472((byte) 20, var416);
                            if (var418.field610 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class25.field341[var10++] = var418.method286(-22922, var417) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3411) {
                            var10--;
                            int var419 = class25.field341[var10];
                            class37 var420 = class205.method1472((byte) 20, var419);
                            class25.field341[var10++] = var420.field619.method500(-5);
                            continue;
                        }
                    } else if (var498 < 3700) {
                        if (var498 == 3600) {
                            if (class89.field1592 == 0) {
                                class25.field341[var10++] = -2;
                            } else if (class89.field1592 == 1) {
                                class25.field341[var10++] = -1;
                            } else {
                                class25.field341[var10++] = class90.field1632;
                            }
                            continue;
                        }
                        if (var498 == 3601) {
                            var10--;
                            int var81 = class25.field341[var10];
                            if (class89.field1592 == 2 && class90.field1632 > var81) {
                                class110.field1970[var7++] = class222.field3882[var81];
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 3602) {
                            var10--;
                            int var82 = class25.field341[var10];
                            if (class89.field1592 == 2 && var82 < class90.field1632) {
                                class25.field341[var10++] = class139.field2386[var82];
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3603) {
                            var10--;
                            int var83 = class25.field341[var10];
                            if (class89.field1592 == 2 && class90.field1632 > var83) {
                                class25.field341[var10++] = class317.field5436[var83];
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3604) {
                            var7--;
                            class82 var84 = class110.field1970[var7];
                            var10--;
                            int var85 = class25.field341[var10];
                            class212.method1526(var85, var84, true);
                            continue;
                        }
                        if (var498 == 3605) {
                            var7--;
                            class82 var86 = class110.field1970[var7];
                            class241.method1729(115, var86.method568(arg0 ^ 0xFFFFE936));
                            continue;
                        }
                        if (var498 == 3606) {
                            var7--;
                            class82 var87 = class110.field1970[var7];
                            class212.method1527(122, var87.method568(22476));
                            continue;
                        }
                        if (var498 == 3607) {
                            var7--;
                            class82 var88 = class110.field1970[var7];
                            class152.method1043(var88.method568(22476), true);
                            continue;
                        }
                        if (var498 == 3608) {
                            var7--;
                            class82 var89 = class110.field1970[var7];
                            class243.method1747(-81, var89.method568(arg0 + 39122));
                            continue;
                        }
                        if (var498 == 3609) {
                            var7--;
                            class82 var90 = class110.field1970[var7];
                            if (var90.method541(class191.field3207, arg0 + 16646) || var90.method541(class250.field4307, 0)) {
                                var90 = var90.method558((byte) -66, 7);
                            }
                            class25.field341[var10++] = class245.method1756(var90, (byte) -123) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3610) {
                            var10--;
                            int var91 = class25.field341[var10];
                            if (class89.field1592 == 2 && class90.field1632 > var91) {
                                class110.field1970[var7++] = class198.field3390[var91];
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 3611) {
                            if (class255.field4384 == null) {
                                class110.field1970[var7++] = class262.field4484;
                            } else {
                                class110.field1970[var7++] = class255.field4384.method553((byte) -83);
                            }
                            continue;
                        }
                        if (var498 == 3612) {
                            if (class255.field4384 == null) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = class80.field1363;
                            }
                            continue;
                        }
                        if (var498 == 3613) {
                            var10--;
                            int var92 = class25.field341[var10];
                            if (class255.field4384 != null && class80.field1363 > var92) {
                                class110.field1970[var7++] = class157.field2662[var92].field2211.method553((byte) -83);
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 3614) {
                            var10--;
                            int var93 = class25.field341[var10];
                            if (class255.field4384 != null && var93 < class80.field1363) {
                                class25.field341[var10++] = class157.field2662[var93].field2209;
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3615) {
                            var10--;
                            int var94 = class25.field341[var10];
                            if (class255.field4384 != null && var94 < class80.field1363) {
                                class25.field341[var10++] = class157.field2662[var94].field2219;
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3616) {
                            class25.field341[var10++] = class256.field4403;
                            continue;
                        }
                        if (var498 == 3617) {
                            var7--;
                            class82 var95 = class110.field1970[var7];
                            class193.method1341(arg0 ^ 0xFFFFBEB9, var95);
                            continue;
                        }
                        if (var498 == 3618) {
                            class25.field341[var10++] = class38.field638;
                            continue;
                        }
                        if (var498 == 3619) {
                            var7--;
                            class82 var96 = class110.field1970[var7];
                            class260.method1856(var96.method568(22476), (byte) -101);
                            continue;
                        }
                        if (var498 == 3620) {
                            class68.method427(arg0 ^ 0x417B);
                            continue;
                        }
                        if (var498 == 3621) {
                            if (class89.field1592 == 0) {
                                class25.field341[var10++] = -1;
                            } else {
                                class25.field341[var10++] = class171.field2964;
                            }
                            continue;
                        }
                        if (var498 == 3622) {
                            var10--;
                            int var97 = class25.field341[var10];
                            if (class89.field1592 != 0 && class171.field2964 > var97) {
                                class110.field1970[var7++] = class56.method388(class144.field2458[var97], 0).method553((byte) -105);
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 3623) {
                            var7--;
                            class82 var98 = class110.field1970[var7];
                            if (var98.method541(class191.field3207, 0) || var98.method541(class250.field4307, 0)) {
                                var98 = var98.method558((byte) -66, 7);
                            }
                            class25.field341[var10++] = class254.method1822(var98, -24378) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3624) {
                            var10--;
                            int var99 = class25.field341[var10];
                            if (class157.field2662 != null && class80.field1363 > var99 && class157.field2662[var99].field2211.method543(class168.field2932.field1409, (byte) -76)) {
                                class25.field341[var10++] = 1;
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3625) {
                            if (class106.field1888 == null) {
                                class110.field1970[var7++] = class262.field4484;
                            } else {
                                class110.field1970[var7++] = class106.field1888.method553((byte) -90);
                            }
                            continue;
                        }
                        if (var498 == 3626) {
                            var10--;
                            int var100 = class25.field341[var10];
                            if (class255.field4384 != null && var100 < class80.field1363) {
                                class110.field1970[var7++] = class157.field2662[var100].field2213;
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 3627) {
                            var10--;
                            int var101 = class25.field341[var10];
                            if (class89.field1592 == 2 && var101 >= 0 && class90.field1632 > var101) {
                                class25.field341[var10++] = class160.field2780[var101] ? 1 : 0;
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 3628) {
                            var7--;
                            class82 var102 = class110.field1970[var7];
                            if (var102.method541(class191.field3207, 0) || var102.method541(class250.field4307, 0)) {
                                var102 = var102.method558((byte) -66, 7);
                            }
                            class25.field341[var10++] = class217.method1546(1, var102);
                            continue;
                        }
                        if (var498 == 3629) {
                            class25.field341[var10++] = class273.field4608;
                            continue;
                        }
                    } else if (var498 < 4000) {
                        if (var498 == 3903) {
                            var10--;
                            int var390 = class25.field341[var10];
                            class25.field341[var10++] = class29.field394[var390].method730((byte) 97);
                            continue;
                        }
                        if (var498 == 3904) {
                            var10--;
                            int var391 = class25.field341[var10];
                            class25.field341[var10++] = class29.field394[var391].field1885;
                            continue;
                        }
                        if (var498 == 3905) {
                            var10--;
                            int var392 = class25.field341[var10];
                            class25.field341[var10++] = class29.field394[var392].field1881;
                            continue;
                        }
                        if (var498 == 3906) {
                            var10--;
                            int var393 = class25.field341[var10];
                            class25.field341[var10++] = class29.field394[var393].field1875;
                            continue;
                        }
                        if (var498 == 3907) {
                            var10--;
                            int var394 = class25.field341[var10];
                            class25.field341[var10++] = class29.field394[var394].field1879;
                            continue;
                        }
                        if (var498 == 3908) {
                            var10--;
                            int var395 = class25.field341[var10];
                            class25.field341[var10++] = class29.field394[var395].field1887;
                            continue;
                        }
                        if (var498 == 3910) {
                            var10--;
                            int var396 = class25.field341[var10];
                            int var397 = class29.field394[var396].method729((byte) 53);
                            class25.field341[var10++] = var397 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3911) {
                            var10--;
                            int var398 = class25.field341[var10];
                            int var399 = class29.field394[var398].method729((byte) -119);
                            class25.field341[var10++] = var399 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3912) {
                            var10--;
                            int var400 = class25.field341[var10];
                            int var401 = class29.field394[var400].method729((byte) -5);
                            class25.field341[var10++] = var401 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3913) {
                            var10--;
                            int var402 = class25.field341[var10];
                            int var403 = class29.field394[var402].method729((byte) -108);
                            class25.field341[var10++] = var403 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var498 < 4100) {
                        if (var498 == 4000) {
                            var10 -= 2;
                            int var103 = class25.field341[var10];
                            int var104 = class25.field341[var10 + 1];
                            class25.field341[var10++] = var103 + var104;
                            continue;
                        }
                        if (var498 == 4001) {
                            var10 -= 2;
                            int var105 = class25.field341[var10];
                            int var106 = class25.field341[var10 + 1];
                            class25.field341[var10++] = var105 - var106;
                            continue;
                        }
                        if (var498 == 4002) {
                            var10 -= 2;
                            int var107 = class25.field341[var10];
                            int var108 = class25.field341[var10 + 1];
                            class25.field341[var10++] = var107 * var108;
                            continue;
                        }
                        if (var498 == 4003) {
                            var10 -= 2;
                            int var109 = class25.field341[var10];
                            int var110 = class25.field341[var10 + 1];
                            class25.field341[var10++] = var109 / var110;
                            continue;
                        }
                        if (var498 == 4004) {
                            var10--;
                            int var111 = class25.field341[var10];
                            class25.field341[var10++] = (int) (Math.random() * (double) var111);
                            continue;
                        }
                        if (var498 == 4005) {
                            var10--;
                            int var112 = class25.field341[var10];
                            class25.field341[var10++] = (int) ((double) (var112 + 1) * Math.random());
                            continue;
                        }
                        if (var498 == 4006) {
                            var10 -= 5;
                            int var113 = class25.field341[var10 + 2];
                            int var114 = class25.field341[var10 + 3];
                            int var115 = class25.field341[var10 + 1];
                            int var116 = class25.field341[var10];
                            int var117 = class25.field341[var10 + 4];
                            class25.field341[var10++] = (var117 - var113) * (var115 - var116) / (var114 - var113) + var116;
                            continue;
                        }
                        if (var498 == 4007) {
                            var10 -= 2;
                            long var118 = (long) class25.field341[var10 + 1];
                            long var120 = (long) class25.field341[var10];
                            class25.field341[var10++] = (int) (var120 + (var118 * var120 / 100L));
                            continue;
                        }
                        if (var498 == 4008) {
                            var10 -= 2;
                            int var122 = class25.field341[var10];
                            int var123 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class98.method674(0x1 << var123, var122);
                            continue;
                        }
                        if (var498 == 4009) {
                            var10 -= 2;
                            int var124 = class25.field341[var10 + 1];
                            int var125 = class25.field341[var10];
                            class25.field341[var10++] = class277.method1935(var125, -(0x1 << var124) - 1);
                            continue;
                        }
                        if (var498 == 4010) {
                            var10 -= 2;
                            int var126 = class25.field341[var10 + 1];
                            int var127 = class25.field341[var10];
                            class25.field341[var10++] = class277.method1935(0x1 << var126, var127) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var498 == 4011) {
                            var10 -= 2;
                            int var128 = class25.field341[var10];
                            int var129 = class25.field341[var10 + 1];
                            class25.field341[var10++] = var128 % var129;
                            continue;
                        }
                        if (var498 == 4012) {
                            var10 -= 2;
                            int var130 = class25.field341[var10 + 1];
                            int var131 = class25.field341[var10];
                            if (var131 == 0) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = (int) Math.pow((double) var131, (double) var130);
                            }
                            continue;
                        }
                        if (var498 == 4013) {
                            var10 -= 2;
                            int var132 = class25.field341[var10 + 1];
                            int var133 = class25.field341[var10];
                            if (var133 == 0) {
                                class25.field341[var10++] = 0;
                            } else if (var132 == 0) {
                                class25.field341[var10++] = Integer.MAX_VALUE;
                            } else {
                                class25.field341[var10++] = (int) Math.pow((double) var133, 1.0D / (double) var132);
                            }
                            continue;
                        }
                        if (var498 == 4014) {
                            var10 -= 2;
                            int var134 = class25.field341[var10];
                            int var135 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class277.method1935(var135, var134);
                            continue;
                        }
                        if (var498 == 4015) {
                            var10 -= 2;
                            int var136 = class25.field341[var10 + 1];
                            int var137 = class25.field341[var10];
                            class25.field341[var10++] = class98.method674(var136, var137);
                            continue;
                        }
                        if (var498 == 4016) {
                            var10 -= 2;
                            int var138 = class25.field341[var10];
                            int var139 = class25.field341[var10 + 1];
                            class25.field341[var10++] = var138 >= var139 ? var139 : var138;
                            continue;
                        }
                        if (var498 == 4017) {
                            var10 -= 2;
                            int var140 = class25.field341[var10];
                            int var141 = class25.field341[var10 + 1];
                            class25.field341[var10++] = var140 > var141 ? var140 : var141;
                            continue;
                        }
                        if (var498 == 4018) {
                            var10 -= 3;
                            long var142 = (long) class25.field341[var10];
                            long var144 = (long) class25.field341[var10 + 1];
                            long var146 = (long) class25.field341[var10 + 2];
                            class25.field341[var10++] = (int) (var142 * var146 / var144);
                            continue;
                        }
                    } else if (var498 < 4200) {
                        if (var498 == 4100) {
                            var10--;
                            int var148 = class25.field341[var10];
                            var7--;
                            class82 var149 = class110.field1970[var7];
                            class110.field1970[var7++] = class29.method182(class143.method974(arg0, 22163), new class82[] { var149, class327.method2240((byte) -74, var148) });
                            continue;
                        }
                        if (var498 == 4101) {
                            var7 -= 2;
                            class82 var150 = class110.field1970[var7 + 1];
                            class82 var151 = class110.field1970[var7];
                            class110.field1970[var7++] = class29.method182(-6039, new class82[] { var151, var150 });
                            continue;
                        }
                        if (var498 == 4102) {
                            var7--;
                            class82 var152 = class110.field1970[var7];
                            var10--;
                            int var153 = class25.field341[var10];
                            class110.field1970[var7++] = class29.method182(-6039, new class82[] { var152, class129.method899(var153, (byte) 115, true) });
                            continue;
                        }
                        if (var498 == 4103) {
                            var7--;
                            class82 var154 = class110.field1970[var7];
                            class110.field1970[var7++] = var154.method538((byte) -80);
                            continue;
                        }
                        if (var498 == 4104) {
                            var10--;
                            int var155 = class25.field341[var10];
                            long var156 = (long) var155 * 86400000L + 1014768000000L;
                            class137.field2359.setTime(new Date(var156));
                            int var158 = class137.field2359.get(5);
                            int var159 = class137.field2359.get(2);
                            int var160 = class137.field2359.get(1);
                            class110.field1970[var7++] = class29.method182(arg0 + 10607, new class82[] { class327.method2240((byte) -74, var158), class63.field983, class264.field4505[var159], class63.field983, class327.method2240((byte) -74, var160) });
                            continue;
                        }
                        if (var498 == 4105) {
                            var7 -= 2;
                            class82 var161 = class110.field1970[var7 + 1];
                            class82 var162 = class110.field1970[var7];
                            if (class168.field2932.field1404 != null && class168.field2932.field1404.field3401) {
                                class110.field1970[var7++] = var161;
                                continue;
                            }
                            class110.field1970[var7++] = var162;
                            continue;
                        }
                        if (var498 == 4106) {
                            var10--;
                            int var163 = class25.field341[var10];
                            class110.field1970[var7++] = class327.method2240((byte) -74, var163);
                            continue;
                        }
                        if (var498 == 4107) {
                            var7 -= 2;
                            class25.field341[var10++] = class110.field1970[var7].method561(class110.field1970[var7 + 1], true);
                            continue;
                        }
                        if (var498 == 4108) {
                            var10 -= 2;
                            int var164 = class25.field341[var10 + 1];
                            int var165 = class25.field341[var10];
                            var7--;
                            class82 var166 = class110.field1970[var7];
                            byte[] var167 = class62.field976.method1577(var164, 0, -29569);
                            class145 var168 = new class145(var167);
                            var168.method118(class193.field3278, (int[]) null);
                            class25.field341[var10++] = var168.method128(var166, var165);
                            continue;
                        }
                        if (var498 == 4109) {
                            var10 -= 2;
                            int var169 = class25.field341[var10 + 1];
                            int var170 = class25.field341[var10];
                            var7--;
                            class82 var171 = class110.field1970[var7];
                            byte[] var172 = class62.field976.method1577(var169, 0, -29569);
                            class145 var173 = new class145(var172);
                            var173.method118(class193.field3278, (int[]) null);
                            class25.field341[var10++] = var173.method107(var171, var170);
                            continue;
                        }
                        if (var498 == 4110) {
                            var7 -= 2;
                            class82 var174 = class110.field1970[var7];
                            class82 var175 = class110.field1970[var7 + 1];
                            var10--;
                            if (class25.field341[var10] == 1) {
                                class110.field1970[var7++] = var174;
                            } else {
                                class110.field1970[var7++] = var175;
                            }
                            continue;
                        }
                        if (var498 == 4111) {
                            var7--;
                            class82 var176 = class110.field1970[var7];
                            class110.field1970[var7++] = class18.method121(var176);
                            continue;
                        }
                        if (var498 == 4112) {
                            var7--;
                            class82 var177 = class110.field1970[var7];
                            var10--;
                            int var178 = class25.field341[var10];
                            if (var178 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class110.field1970[var7++] = var177.method544(class143.method974(arg0, -27365), var178);
                            continue;
                        }
                        if (var498 == 4113) {
                            var10--;
                            int var179 = class25.field341[var10];
                            class25.field341[var10++] = class296.method2044(class143.method974(arg0, 16743), var179) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4114) {
                            var10--;
                            int var180 = class25.field341[var10];
                            class25.field341[var10++] = class127.method895((byte) 110, var180) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4115) {
                            var10--;
                            int var181 = class25.field341[var10];
                            class25.field341[var10++] = class160.method1155(var181, 127) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4116) {
                            var10--;
                            int var182 = class25.field341[var10];
                            class25.field341[var10++] = class212.method1525(var182, 0) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4117) {
                            var7--;
                            class82 var183 = class110.field1970[var7];
                            if (var183 == null) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var183.method535(true);
                            }
                            continue;
                        }
                        if (var498 == 4118) {
                            var10 -= 2;
                            var7--;
                            class82 var184 = class110.field1970[var7];
                            int var185 = class25.field341[var10];
                            int var186 = class25.field341[var10 + 1];
                            class110.field1970[var7++] = var184.method573(var185, class143.method974(arg0, -16747), var186);
                            continue;
                        }
                        if (var498 == 4119) {
                            var7--;
                            class82 var187 = class110.field1970[var7];
                            class82 var188 = class253.method1820(var187.method535(true), 0);
                            boolean var189 = false;
                            for (int var190 = 0; var190 < var187.method535(true); var190++) {
                                int var191 = var187.method551(var190, (byte) -116);
                                if (var191 == 60) {
                                    var189 = true;
                                } else if (var191 == 62) {
                                    var189 = false;
                                } else if (!var189) {
                                    var188.method570(114, var191);
                                }
                            }
                            var188.method576(true);
                            class110.field1970[var7++] = var188;
                            continue;
                        }
                        if (var498 == 4120) {
                            var10 -= 2;
                            int var192 = class25.field341[var10 + 1];
                            int var193 = class25.field341[var10];
                            var7--;
                            class82 var194 = class110.field1970[var7];
                            class25.field341[var10++] = var194.method574(1722, var193, var192);
                            continue;
                        }
                        if (var498 == 4121) {
                            var7 -= 2;
                            class82 var195 = class110.field1970[var7];
                            class82 var196 = class110.field1970[var7 + 1];
                            var10--;
                            int var197 = class25.field341[var10];
                            class25.field341[var10++] = var195.method571(var196, var197, class143.method974(arg0, 16562));
                            continue;
                        }
                        if (var498 == 4122) {
                            var10--;
                            int var198 = class25.field341[var10];
                            class25.field341[var10++] = class98.method678(-10, var198);
                            continue;
                        }
                        if (var498 == 4123) {
                            var10--;
                            int var199 = class25.field341[var10];
                            class25.field341[var10++] = class45.method332(var199, 23);
                            continue;
                        }
                    } else if (var498 < 4300) {
                        if (var498 == 4200) {
                            var10--;
                            int var200 = class25.field341[var10];
                            class110.field1970[var7++] = class273.method1912(var200, arg0 + 16520).field5364;
                            continue;
                        }
                        if (var498 == 4201) {
                            var10 -= 2;
                            int var201 = class25.field341[var10];
                            int var202 = class25.field341[var10 + 1];
                            class312 var203 = class273.method1912(var201, -127);
                            if (var202 >= 1 && var202 <= 5 && var203.field5396[var202 - 1] != null) {
                                class110.field1970[var7++] = var203.field5396[var202 - 1];
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 4202) {
                            var10 -= 2;
                            int var204 = class25.field341[var10 + 1];
                            int var205 = class25.field341[var10];
                            class312 var206 = class273.method1912(var205, -57);
                            if (var204 >= 1 && var204 <= 5 && var206.field5344[var204 - 1] != null) {
                                class110.field1970[var7++] = var206.field5344[var204 - 1];
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 4203) {
                            var10--;
                            int var207 = class25.field341[var10];
                            class25.field341[var10++] = class273.method1912(var207, -67).field5373;
                            continue;
                        }
                        if (var498 == 4204) {
                            var10--;
                            int var208 = class25.field341[var10];
                            class25.field341[var10++] = class273.method1912(var208, -108).field5357 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4205) {
                            var10--;
                            int var209 = class25.field341[var10];
                            class312 var210 = class273.method1912(var209, -94);
                            if (var210.field5370 == -1 && var210.field5339 >= 0) {
                                class25.field341[var10++] = var210.field5339;
                                continue;
                            }
                            class25.field341[var10++] = var209;
                            continue;
                        }
                        if (var498 == 4206) {
                            var10--;
                            int var211 = class25.field341[var10];
                            class312 var212 = class273.method1912(var211, arg0 ^ 0x4134);
                            if (var212.field5370 >= 0 && var212.field5339 >= 0) {
                                class25.field341[var10++] = var212.field5339;
                                continue;
                            }
                            class25.field341[var10++] = var211;
                            continue;
                        }
                        if (var498 == 4207) {
                            var10--;
                            int var213 = class25.field341[var10];
                            class25.field341[var10++] = class273.method1912(var213, -79).field5340 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4208) {
                            var10 -= 2;
                            int var214 = class25.field341[var10 + 1];
                            int var215 = class25.field341[var10];
                            class211 var216 = class297.method2058(arg0 ^ 0xFFFFF0FB, var214);
                            if (var216.method1519(arg0 + 16680)) {
                                class110.field1970[var7++] = class273.method1912(var215, -66).method2141(var216.field3701, var214, arg0 + 13475);
                            } else {
                                class25.field341[var10++] = class273.method1912(var215, class143.method974(arg0, 16737)).method2151(var214, (byte) 113, var216.field3695);
                            }
                            continue;
                        }
                        if (var498 == 4210) {
                            var7--;
                            class82 var217 = class110.field1970[var7];
                            var10--;
                            int var218 = class25.field341[var10];
                            class191.method1332(var218 == 1, -110, var217);
                            class25.field341[var10++] = class184.field3131;
                            continue;
                        }
                        if (var498 == 4211) {
                            if (class105.field1872 != null && class184.field3131 > class254.field4380) {
                                class25.field341[var10++] = class277.method1935(class105.field1872[class254.field4380++], 65535);
                                continue;
                            }
                            class25.field341[var10++] = -1;
                            continue;
                        }
                        if (var498 == 4212) {
                            class254.field4380 = 0;
                            continue;
                        }
                    } else if (var498 < 4400) {
                        if (var498 == 4300) {
                            var10 -= 2;
                            int var380 = class25.field341[var10];
                            int var381 = class25.field341[var10 + 1];
                            class211 var382 = class297.method2058(19969, var381);
                            if (var382.method1519(83)) {
                                class110.field1970[var7++] = class222.method1574(true, var380).method1655(var382.field3701, var381, -1);
                            } else {
                                class25.field341[var10++] = class222.method1574(true, var380).method1653(var381, var382.field3695, -18);
                            }
                            continue;
                        }
                        if (var498 == 4301) {
                            var10--;
                            int var383 = class25.field341[var10];
                            class25.field341[var10++] = class222.method1574(true, var383).field4038;
                            continue;
                        }
                        if (var498 == 4302) {
                            var10--;
                            int var384 = class25.field341[var10];
                            class25.field341[var10++] = class222.method1574(true, var384).field4018;
                            continue;
                        }
                        if (var498 == 4303) {
                            var10--;
                            int var385 = class25.field341[var10];
                            class25.field341[var10++] = class222.method1574(true, var385).field4037;
                            continue;
                        }
                        if (var498 == 4304) {
                            var10--;
                            int var386 = class25.field341[var10];
                            class25.field341[var10++] = class222.method1574(true, var386).field4067;
                            continue;
                        }
                        if (var498 == 4305) {
                            var10--;
                            int var387 = class25.field341[var10];
                            class25.field341[var10++] = class222.method1574(true, var387).field4059;
                            continue;
                        }
                        if (var498 == 4306) {
                            var10--;
                            int var388 = class25.field341[var10];
                            class25.field341[var10++] = class222.method1574(true, var388).field4072;
                            continue;
                        }
                        if (var498 == 4307) {
                            var10--;
                            int var389 = class25.field341[var10];
                            class25.field341[var10++] = class222.method1574(true, var389).field4035;
                            continue;
                        }
                    } else if (var498 < 4500) {
                        if (var498 == 4400) {
                            var10 -= 2;
                            int var219 = class25.field341[var10 + 1];
                            int var220 = class25.field341[var10];
                            class211 var221 = class297.method2058(19969, var219);
                            if (var221.method1519(59)) {
                                class110.field1970[var7++] = class99.method682(var220, (byte) -107).method1121(var221.field3701, var219, 768);
                            } else {
                                class25.field341[var10++] = class99.method682(var220, (byte) -100).method1122(class143.method974(arg0, 16646), var219, var221.field3695);
                            }
                            continue;
                        }
                    } else if (var498 < 4600) {
                        if (var498 == 4500) {
                            var10 -= 2;
                            int var222 = class25.field341[var10];
                            int var223 = class25.field341[var10 + 1];
                            class211 var224 = class297.method2058(arg0 ^ 0xFFFFF0FB, var223);
                            if (var224.method1519(35)) {
                                class110.field1970[var7++] = class64.method411(var222, 3).method1293(var224.field3701, arg0 + 16733, var223);
                            } else {
                                class25.field341[var10++] = class64.method411(var222, 3).method1287(var223, class143.method974(arg0, -1667), var224.field3695);
                            }
                            continue;
                        }
                    } else if (var498 < 5100) {
                        if (var498 == 5000) {
                            class25.field341[var10++] = class60.field943;
                            continue;
                        }
                        if (var498 == 5001) {
                            class69.field1073++;
                            var10 -= 3;
                            class60.field943 = class25.field341[var10];
                            class77.field1318 = class25.field341[var10 + 1];
                            class91.field1638 = class25.field341[var10 + 2];
                            class61.field957.method1504(254, -1);
                            class61.field957.method1075(class60.field943, -1);
                            class61.field957.method1075(class77.field1318, -1);
                            class61.field957.method1075(class91.field1638, -1);
                            continue;
                        }
                        if (var498 == 5002) {
                            var10 -= 2;
                            class43.field756++;
                            var7--;
                            class82 var315 = class110.field1970[var7];
                            int var316 = class25.field341[var10 + 1];
                            int var317 = class25.field341[var10];
                            class61.field957.method1504(11, -1);
                            class61.field957.method1057((byte) 43, var315.method568(22476));
                            class61.field957.method1075(var317 - 1, -1);
                            class61.field957.method1075(var316, arg0 ^ 0x4105);
                            continue;
                        }
                        if (var498 == 5003) {
                            var10--;
                            int var318 = class25.field341[var10];
                            class82 var319 = null;
                            if (var318 < 100) {
                                var319 = class62.field973[var318];
                            }
                            if (var319 == null) {
                                var319 = class262.field4484;
                            }
                            class110.field1970[var7++] = var319;
                            continue;
                        }
                        if (var498 == 5004) {
                            var10--;
                            int var320 = class25.field341[var10];
                            int var321 = -1;
                            if (var320 < 100 && class62.field973[var320] != null) {
                                var321 = class87.field1560[var320];
                            }
                            class25.field341[var10++] = var321;
                            continue;
                        }
                        if (var498 == 5005) {
                            class25.field341[var10++] = class77.field1318;
                            continue;
                        }
                        if (var498 == 5008) {
                            var7--;
                            class82 var322 = class110.field1970[var7];
                            if (!var322.method541(class111.field2010, 0)) {
                                if (class323.field5545 == 0 && (class82.field1462 && !class317.field5437 || class289.field4864)) {
                                    continue;
                                }
                                class82 var323 = var322.method538((byte) -80);
                                class164.field2862++;
                                byte var324 = 0;
                                if (var323.method541(class330.field5626, arg0 ^ 0xFFFFBEFA)) {
                                    var322 = var322.method558((byte) -66, class330.field5626.method535(true));
                                    var324 = 0;
                                } else if (var323.method541(class224.field3893, 0)) {
                                    var324 = 1;
                                    var322 = var322.method558((byte) -66, class224.field3893.method535(true));
                                } else if (var323.method541(class24.field332, 0)) {
                                    var322 = var322.method558((byte) -66, class24.field332.method535(true));
                                    var324 = 2;
                                } else if (var323.method541(class133.field2305, 0)) {
                                    var324 = 3;
                                    var322 = var322.method558((byte) -66, class133.field2305.method535(true));
                                } else if (var323.method541(class281.field4724, 0)) {
                                    var324 = 4;
                                    var322 = var322.method558((byte) -66, class281.field4724.method535(true));
                                } else if (var323.method541(class264.field4503, 0)) {
                                    var324 = 5;
                                    var322 = var322.method558((byte) -66, class264.field4503.method535(true));
                                } else if (var323.method541(class218.field3786, 0)) {
                                    var322 = var322.method558((byte) -66, class218.field3786.method535(true));
                                    var324 = 6;
                                } else if (var323.method541(class224.field3886, 0)) {
                                    var324 = 7;
                                    var322 = var322.method558((byte) -66, class224.field3886.method535(true));
                                } else if (var323.method541(class19.field234, 0)) {
                                    var322 = var322.method558((byte) -66, class19.field234.method535(true));
                                    var324 = 8;
                                } else if (var323.method541(class95.field1753, 0)) {
                                    var324 = 9;
                                    var322 = var322.method558((byte) -66, class95.field1753.method535(true));
                                } else if (var323.method541(class50.field816, 0)) {
                                    var324 = 10;
                                    var322 = var322.method558((byte) -66, class50.field816.method535(true));
                                } else if (var323.method541(class36.field600, 0)) {
                                    var324 = 11;
                                    var322 = var322.method558((byte) -66, class36.field600.method535(true));
                                } else if (class53.field856 != 0) {
                                    if (var323.method541(class330.field5629, 0)) {
                                        var324 = 0;
                                        var322 = var322.method558((byte) -66, class330.field5629.method535(true));
                                    } else if (var323.method541(class224.field3894, 0)) {
                                        var324 = 1;
                                        var322 = var322.method558((byte) -66, class224.field3894.method535(true));
                                    } else if (var323.method541(class24.field330, 0)) {
                                        var322 = var322.method558((byte) -66, class24.field330.method535(true));
                                        var324 = 2;
                                    } else if (var323.method541(class133.field2302, 0)) {
                                        var322 = var322.method558((byte) -66, class133.field2302.method535(true));
                                        var324 = 3;
                                    } else if (var323.method541(class281.field4725, 0)) {
                                        var324 = 4;
                                        var322 = var322.method558((byte) -66, class281.field4725.method535(true));
                                    } else if (var323.method541(class264.field4507, arg0 + 16646)) {
                                        var324 = 5;
                                        var322 = var322.method558((byte) -66, class264.field4507.method535(true));
                                    } else if (var323.method541(class218.field3787, arg0 + 16646)) {
                                        var322 = var322.method558((byte) -66, class218.field3787.method535(true));
                                        var324 = 6;
                                    } else if (var323.method541(class224.field3896, 0)) {
                                        var324 = 7;
                                        var322 = var322.method558((byte) -66, class224.field3896.method535(true));
                                    } else if (var323.method541(class19.field232, 0)) {
                                        var322 = var322.method558((byte) -66, class19.field232.method535(true));
                                        var324 = 8;
                                    } else if (var323.method541(class95.field1733, arg0 ^ 0xFFFFBEFA)) {
                                        var324 = 9;
                                        var322 = var322.method558((byte) -66, class95.field1733.method535(true));
                                    } else if (var323.method541(class50.field811, arg0 ^ 0xFFFFBEFA)) {
                                        var324 = 10;
                                        var322 = var322.method558((byte) -66, class50.field811.method535(true));
                                    } else if (var323.method541(class36.field596, 0)) {
                                        var322 = var322.method558((byte) -66, class36.field596.method535(true));
                                        var324 = 11;
                                    }
                                }
                                byte var325 = 0;
                                class82 var326 = var322.method538((byte) -80);
                                if (var326.method541(class279.field4696, 0)) {
                                    var322 = var322.method558((byte) -66, class279.field4696.method535(true));
                                    var325 = 1;
                                } else if (var326.method541(class221.field3825, 0)) {
                                    var325 = 2;
                                    var322 = var322.method558((byte) -66, class221.field3825.method535(true));
                                } else if (var326.method541(class237.field4108, arg0 + 16646)) {
                                    var325 = 3;
                                    var322 = var322.method558((byte) -66, class237.field4108.method535(true));
                                } else if (var326.method541(class112.field2025, 0)) {
                                    var322 = var322.method558((byte) -66, class112.field2025.method535(true));
                                    var325 = 4;
                                } else if (var326.method541(class152.field2567, 0)) {
                                    var325 = 5;
                                    var322 = var322.method558((byte) -66, class152.field2567.method535(true));
                                } else if (class53.field856 != 0) {
                                    if (var326.method541(class279.field4673, 0)) {
                                        var322 = var322.method558((byte) -66, class279.field4673.method535(true));
                                        var325 = 1;
                                    } else if (var326.method541(class221.field3831, 0)) {
                                        var322 = var322.method558((byte) -66, class221.field3831.method535(true));
                                        var325 = 2;
                                    } else if (var326.method541(class237.field4119, 0)) {
                                        var322 = var322.method558((byte) -66, class237.field4119.method535(true));
                                        var325 = 3;
                                    } else if (var326.method541(class112.field2014, 0)) {
                                        var322 = var322.method558((byte) -66, class112.field2014.method535(true));
                                        var325 = 4;
                                    } else if (var326.method541(class152.field2569, 0)) {
                                        var325 = 5;
                                        var322 = var322.method558((byte) -66, class152.field2569.method535(true));
                                    }
                                }
                                class61.field957.method1504(12, arg0 + 16645);
                                class61.field957.method1075(0, -1);
                                int var327 = class61.field957.field2611;
                                class61.field957.method1075(var324, arg0 ^ 0x4105);
                                class61.field957.method1075(var325, arg0 ^ 0x4105);
                                class152.method1044(class61.field957, var322, arg0 ^ 0xFFFFBEFA);
                                class61.field957.method1073(-1, class61.field957.field2611 - var327);
                                continue;
                            }
                            class160.method1162(var322, arg0 + 16749);
                            continue;
                        }
                        if (var498 == 5009) {
                            var7 -= 2;
                            class82 var328 = class110.field1970[var7 + 1];
                            class82 var329 = class110.field1970[var7];
                            if (class323.field5545 != 0 || (!class82.field1462 || class317.field5437) && !class289.field4864) {
                                class61.field957.method1504(62, arg0 ^ 0x4105);
                                class61.field957.method1075(0, arg0 ^ 0x4105);
                                int var330 = class61.field957.field2611;
                                class61.field957.method1057((byte) 43, var329.method568(22476));
                                class180.field3075++;
                                class152.method1044(class61.field957, var328, 0);
                                class61.field957.method1073(-1, class61.field957.field2611 - var330);
                            }
                            continue;
                        }
                        if (var498 == 5010) {
                            var10--;
                            int var331 = class25.field341[var10];
                            class82 var332 = null;
                            if (var331 < 100) {
                                var332 = class247.field4278[var331];
                            }
                            if (var332 == null) {
                                var332 = class262.field4484;
                            }
                            class110.field1970[var7++] = var332;
                            continue;
                        }
                        if (var498 == 5011) {
                            var10--;
                            int var333 = class25.field341[var10];
                            class82 var334 = null;
                            if (var333 < 100) {
                                var334 = class237.field4126[var333];
                            }
                            if (var334 == null) {
                                var334 = class262.field4484;
                            }
                            class110.field1970[var7++] = var334;
                            continue;
                        }
                        if (var498 == 5012) {
                            var10--;
                            int var335 = class25.field341[var10];
                            int var336 = -1;
                            if (var335 < 100) {
                                var336 = class191.field3203[var335];
                            }
                            class25.field341[var10++] = var336;
                            continue;
                        }
                        if (var498 == 5015) {
                            class82 var337;
                            if (class168.field2932 == null || class168.field2932.field1409 == null) {
                                var337 = class129.field2248;
                            } else {
                                var337 = class168.field2932.method517(false);
                            }
                            class110.field1970[var7++] = var337;
                            continue;
                        }
                        if (var498 == 5016) {
                            class25.field341[var10++] = class91.field1638;
                            continue;
                        }
                        if (var498 == 5017) {
                            class25.field341[var10++] = class314.field5416;
                            continue;
                        }
                        if (var498 == 5050) {
                            var10--;
                            int var338 = class25.field341[var10];
                            class110.field1970[var7++] = class136.method927(var338, (byte) -96).field3571;
                            continue;
                        }
                        if (var498 == 5051) {
                            var10--;
                            int var339 = class25.field341[var10];
                            class204 var340 = class136.method927(var339, (byte) -91);
                            if (var340.field3577 == null) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var340.field3577.length;
                            }
                            continue;
                        }
                        if (var498 == 5052) {
                            var10 -= 2;
                            int var341 = class25.field341[var10 + 1];
                            int var342 = class25.field341[var10];
                            class204 var343 = class136.method927(var342, (byte) -98);
                            int var344 = var343.field3577[var341];
                            class25.field341[var10++] = var344;
                            continue;
                        }
                        if (var498 == 5053) {
                            var10--;
                            int var345 = class25.field341[var10];
                            class204 var346 = class136.method927(var345, (byte) -105);
                            if (var346.field3580 == null) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var346.field3580.length;
                            }
                            continue;
                        }
                        if (var498 == 5054) {
                            var10 -= 2;
                            int var347 = class25.field341[var10 + 1];
                            int var348 = class25.field341[var10];
                            class25.field341[var10++] = class136.method927(var348, (byte) -108).field3580[var347];
                            continue;
                        }
                        if (var498 == 5055) {
                            var10--;
                            int var349 = class25.field341[var10];
                            class110.field1970[var7++] = class280.method1951(var349, 26029).method1348(class143.method974(arg0, 16743));
                            continue;
                        }
                        if (var498 == 5056) {
                            var10--;
                            int var350 = class25.field341[var10];
                            class194 var351 = class280.method1951(var350, 26029);
                            if (var351.field3296 == null) {
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var351.field3296.length;
                            }
                            continue;
                        }
                        if (var498 == 5057) {
                            var10 -= 2;
                            int var352 = class25.field341[var10 + 1];
                            int var353 = class25.field341[var10];
                            class25.field341[var10++] = class280.method1951(var353, arg0 + 42675).field3296[var352];
                            continue;
                        }
                        if (var498 == 5058) {
                            class66.field1031 = new class23();
                            var10--;
                            class66.field1031.field320 = class25.field341[var10];
                            class66.field1031.field318 = class280.method1951(class66.field1031.field320, 26029);
                            class66.field1031.field321 = new int[class66.field1031.field318.method1356(0)];
                            continue;
                        }
                        if (var498 == 5059) {
                            class35.field557++;
                            class61.field957.method1504(97, -1);
                            class61.field957.method1075(0, -1);
                            int var354 = class61.field957.field2611;
                            class61.field957.method1075(0, -1);
                            class61.field957.method1102((byte) -13, class66.field1031.field320);
                            class66.field1031.field318.method1353(class66.field1031.field321, class61.field957, (byte) 92);
                            class61.field957.method1073(-1, class61.field957.field2611 - var354);
                            continue;
                        }
                        if (var498 == 5060) {
                            var7--;
                            class82 var355 = class110.field1970[var7];
                            class61.field957.method1504(156, arg0 + 16645);
                            class205.field3584++;
                            class61.field957.method1075(0, -1);
                            int var356 = class61.field957.field2611;
                            class61.field957.method1057((byte) 43, var355.method568(arg0 ^ 0xFFFFE936));
                            class61.field957.method1102((byte) -78, class66.field1031.field320);
                            class66.field1031.field318.method1353(class66.field1031.field321, class61.field957, (byte) -125);
                            class61.field957.method1073(arg0 ^ 0x4105, class61.field957.field2611 - var356);
                            continue;
                        }
                        if (var498 == 5061) {
                            class35.field557++;
                            class61.field957.method1504(97, -1);
                            class61.field957.method1075(0, -1);
                            int var357 = class61.field957.field2611;
                            class61.field957.method1075(1, -1);
                            class61.field957.method1102((byte) -91, class66.field1031.field320);
                            class66.field1031.field318.method1353(class66.field1031.field321, class61.field957, (byte) 87);
                            class61.field957.method1073(-1, class61.field957.field2611 - var357);
                            continue;
                        }
                        if (var498 == 5062) {
                            var10 -= 2;
                            int var358 = class25.field341[var10 + 1];
                            int var359 = class25.field341[var10];
                            class25.field341[var10++] = class136.method927(var359, (byte) -101).field3576[var358];
                            continue;
                        }
                        if (var498 == 5063) {
                            var10 -= 2;
                            int var360 = class25.field341[var10];
                            int var361 = class25.field341[var10 + 1];
                            class25.field341[var10++] = class136.method927(var360, (byte) -101).field3568[var361];
                            continue;
                        }
                        if (var498 == 5064) {
                            var10 -= 2;
                            int var362 = class25.field341[var10];
                            int var363 = class25.field341[var10 + 1];
                            if (var363 == -1) {
                                class25.field341[var10++] = -1;
                            } else {
                                class25.field341[var10++] = class136.method927(var362, (byte) -124).method1466(-113, var363);
                            }
                            continue;
                        }
                        if (var498 == 5065) {
                            var10 -= 2;
                            int var364 = class25.field341[var10];
                            int var365 = class25.field341[var10 + 1];
                            if (var365 == -1) {
                                class25.field341[var10++] = -1;
                            } else {
                                class25.field341[var10++] = class136.method927(var364, (byte) -112).method1461(var365, 106);
                            }
                            continue;
                        }
                        if (var498 == 5066) {
                            var10--;
                            int var366 = class25.field341[var10];
                            class25.field341[var10++] = class280.method1951(var366, 26029).method1356(arg0 + 16646);
                            continue;
                        }
                        if (var498 == 5067) {
                            var10 -= 2;
                            int var367 = class25.field341[var10];
                            int var368 = class25.field341[var10 + 1];
                            int var369 = class280.method1951(var367, 26029).method1352((byte) 74, var368);
                            class25.field341[var10++] = var369;
                            continue;
                        }
                        if (var498 == 5068) {
                            var10 -= 2;
                            int var370 = class25.field341[var10];
                            int var371 = class25.field341[var10 + 1];
                            class66.field1031.field321[var370] = var371;
                            continue;
                        }
                        if (var498 == 5069) {
                            var10 -= 2;
                            int var372 = class25.field341[var10];
                            int var373 = class25.field341[var10 + 1];
                            class66.field1031.field321[var372] = var373;
                            continue;
                        }
                        if (var498 == 5070) {
                            var10 -= 3;
                            int var374 = class25.field341[var10];
                            int var375 = class25.field341[var10 + 1];
                            int var376 = class25.field341[var10 + 2];
                            class194 var377 = class280.method1951(var374, 26029);
                            if (var377.method1352((byte) -119, var375) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class25.field341[var10++] = var377.method1355(var375, var376, (byte) -95);
                            continue;
                        }
                        if (var498 == 5071) {
                            var10--;
                            boolean var378 = class25.field341[var10] == 1;
                            var7--;
                            class82 var379 = class110.field1970[var7];
                            class119.method809(var378, (byte) 115, var379);
                            class25.field341[var10++] = class184.field3131;
                            continue;
                        }
                        if (var498 == 5072) {
                            if (class105.field1872 != null && class254.field4380 < class184.field3131) {
                                class25.field341[var10++] = class277.method1935(65535, class105.field1872[class254.field4380++]);
                                continue;
                            }
                            class25.field341[var10++] = -1;
                            continue;
                        }
                        if (var498 == 5073) {
                            class254.field4380 = 0;
                            continue;
                        }
                    } else if (var498 < 5200) {
                        if (var498 == 5100) {
                            if (class19.field235[86]) {
                                class25.field341[var10++] = 1;
                            } else {
                                class25.field341[var10++] = 0;
                            }
                            continue;
                        }
                        if (var498 == 5101) {
                            if (class19.field235[82]) {
                                class25.field341[var10++] = 1;
                            } else {
                                class25.field341[var10++] = 0;
                            }
                            continue;
                        }
                        if (var498 == 5102) {
                            if (class19.field235[81]) {
                                class25.field341[var10++] = 1;
                            } else {
                                class25.field341[var10++] = 0;
                            }
                            continue;
                        }
                    } else if (var498 < 5300) {
                        if (var498 == 5200) {
                            var10--;
                            class277.method1934((byte) -91, class25.field341[var10]);
                            continue;
                        }
                        if (var498 == 5201) {
                            class25.field341[var10++] = class273.method1909(arg0 - 9712);
                            continue;
                        }
                        if (var498 == 5202) {
                            var10--;
                            class297.method2055(class25.field341[var10], 50);
                            continue;
                        }
                        if (var498 == 5203) {
                            var7--;
                            class260.method1858(class110.field1970[var7], (byte) -86);
                            continue;
                        }
                        if (var498 == 5204) {
                            class110.field1970[var7 - 1] = class280.method1952(-1, class110.field1970[var7 - 1]);
                            continue;
                        }
                        if (var498 == 5205) {
                            var7--;
                            class308.method2128(true, class110.field1970[var7]);
                            continue;
                        }
                        if (var498 == 5206) {
                            var10--;
                            int var225 = class25.field341[var10];
                            class109 var226 = class39.method308(arg0 + 16646, var225 & 0x3FFF, (var225 & 0xFFFEF52) >> 14);
                            if (var226 == null) {
                                class110.field1970[var7++] = class262.field4484;
                            } else {
                                class110.field1970[var7++] = var226.field1955;
                            }
                            continue;
                        }
                        if (var498 == 5207) {
                            var7--;
                            class109 var227 = class309.method2129(class110.field1970[var7], 38);
                            if (var227 != null && var227.field1940 != null) {
                                class110.field1970[var7++] = var227.field1940;
                                continue;
                            }
                            class110.field1970[var7++] = class262.field4484;
                            continue;
                        }
                        if (var498 == 5208) {
                            class25.field341[var10++] = class324.field5567;
                            class25.field341[var10++] = class255.field4386;
                            continue;
                        }
                        if (var498 == 5209) {
                            class25.field341[var10++] = class82.field1445 + class166.field2905;
                            class25.field341[var10++] = class17.field181 + class157.field2719 - (1 - -class315.field5426);
                            continue;
                        }
                        if (var498 == 5210) {
                            class109 var228 = class72.method454(10844);
                            if (var228 == null) {
                                class25.field341[var10++] = 0;
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var228.field1939 * 64;
                                class25.field341[var10++] = var228.field1936 * 64;
                            }
                            continue;
                        }
                        if (var498 == 5211) {
                            class109 var229 = class72.method454(10844);
                            if (var229 == null) {
                                class25.field341[var10++] = 0;
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var229.field1942 - var229.field1957;
                                class25.field341[var10++] = var229.field1947 - var229.field1948;
                            }
                            continue;
                        }
                        if (var498 == 5212) {
                            int var230 = class263.method1874((byte) 87);
                            int var231 = 0;
                            class82 var232;
                            if (var230 == -1) {
                                var232 = class262.field4484;
                            } else {
                                var232 = class297.field5057.field4308[var230];
                                var231 = class297.field5057.method1798(var230, 33);
                            }
                            class82 var233 = var232.method547(false, class55.field886, class19.field239);
                            class110.field1970[var7++] = var233;
                            class25.field341[var10++] = var231;
                            continue;
                        }
                        if (var498 == 5213) {
                            int var234 = class197.method1380((byte) 94);
                            int var235 = 0;
                            class82 var236;
                            if (var234 == -1) {
                                var236 = class262.field4484;
                            } else {
                                var236 = class297.field5057.field4308[var234];
                                var235 = class297.field5057.method1798(var234, 33);
                            }
                            class82 var237 = var236.method547(false, class55.field886, class19.field239);
                            class110.field1970[var7++] = var237;
                            class25.field341[var10++] = var235;
                            continue;
                        }
                        if (var498 == 5214) {
                            var10--;
                            int var238 = class25.field341[var10];
                            class90.method642(var238 & 0x3FFF, -114, var238 >> 14 & 0x3FFF);
                            continue;
                        }
                    } else if (var498 < 5400) {
                        if (var498 == 5300) {
                            var10 -= 2;
                            int var239 = class25.field341[var10 + 1];
                            int var240 = class25.field341[var10];
                            class129.method898(false, (byte) 86, var240, var239, 3);
                            class25.field341[var10++] = class48.field795 == null ? 0 : 1;
                            continue;
                        }
                        if (var498 == 5301) {
                            if (class48.field795 != null) {
                                class129.method898(false, (byte) 124, -1, -1, class261.field4470);
                            }
                            continue;
                        }
                        if (var498 == 5302) {
                            class324[] var241 = class62.method405((byte) -15);
                            class25.field341[var10++] = var241.length;
                            continue;
                        }
                        if (var498 == 5303) {
                            var10--;
                            int var242 = class25.field341[var10];
                            class324[] var243 = class62.method405((byte) -15);
                            class25.field341[var10++] = var243[var242].field5563;
                            class25.field341[var10++] = var243[var242].field5562;
                            continue;
                        }
                        if (var498 == 5305) {
                            int var244 = -1;
                            int var245 = class112.field2033;
                            int var246 = class93.field1660;
                            class324[] var247 = class62.method405((byte) -15);
                            for (int var248 = 0; var248 < var247.length; var248++) {
                                class324 var249 = var247[var248];
                                if (var249.field5563 == var246 && var249.field5562 == var245) {
                                    var244 = var248;
                                    break;
                                }
                            }
                            class25.field341[var10++] = var244;
                            continue;
                        }
                        if (var498 == 5306) {
                            class25.field341[var10++] = class284.method1972((byte) 49);
                            continue;
                        }
                        if (var498 == 5307) {
                            var10--;
                            int var250 = class25.field341[var10];
                            if (var250 < 0 || var250 > 2) {
                                var250 = 0;
                            }
                            class129.method898(false, (byte) 89, -1, -1, var250);
                            continue;
                        }
                        if (var498 == 5308) {
                            class25.field341[var10++] = class261.field4470;
                            continue;
                        }
                        if (var498 == 5309) {
                            var10--;
                            int var251 = class25.field341[var10];
                            if (var251 < 0 || var251 > 2) {
                                var251 = 0;
                            }
                            class261.field4470 = var251;
                            class15.method82(true, class55.field881);
                            continue;
                        }
                    } else if (var498 < 5500) {
                        if (var498 == 5400) {
                            var7 -= 2;
                            class35.field556++;
                            class82 var293 = class110.field1970[var7 + 1];
                            class82 var294 = class110.field1970[var7];
                            var10--;
                            int var295 = class25.field341[var10];
                            class61.field957.method1504(69, -1);
                            class61.field957.method1075(class201.method1413(var294, (byte) -95) + class201.method1413(var293, (byte) -93) + 1, -1);
                            class61.field957.method1098((byte) 56, var294);
                            class61.field957.method1098((byte) 56, var293);
                            class61.field957.method1075(var295, -1);
                            continue;
                        }
                        if (var498 == 5401) {
                            var10 -= 2;
                            class124.field2178[class25.field341[var10]] = (short) class40.method311(class143.method974(arg0, -16390), class25.field341[var10 + 1]);
                            class256.method1835(101);
                            class323.method2229(true);
                            class72.method456(true);
                            class82.method539(arg0 + 16625);
                            class302.method2081((byte) -9);
                            continue;
                        }
                        if (var498 == 5405) {
                            var10 -= 2;
                            int var296 = class25.field341[var10];
                            int var297 = class25.field341[var10 + 1];
                            if (var296 >= 0 && var296 < 2) {
                                class61.field962[var296] = new int[var297 << 1][4];
                            }
                            continue;
                        }
                        if (var498 == 5406) {
                            var10 -= 7;
                            int var298 = class25.field341[var10 + 1] << 1;
                            int var299 = class25.field341[var10];
                            int var300 = class25.field341[var10 + 2];
                            int var301 = class25.field341[var10 + 5];
                            int var302 = class25.field341[var10 + 4];
                            int var303 = class25.field341[var10 + 3];
                            int var304 = class25.field341[var10 + 6];
                            if (var299 >= 0 && var299 < 2 && class61.field962[var299] != null && var298 >= 0 && class61.field962[var299].length > var298) {
                                class61.field962[var299][var298] = new int[] { class277.method1935(var300 >> 14, 16383) * 128, var303, class277.method1935(var300, 16383) * 128, var304 };
                                class61.field962[var299][var298 + 1] = new int[] { class277.method1935(var302 >> 14, 16383) * 128, var301, class277.method1935(var302, 16383) * 128 };
                            }
                            continue;
                        }
                        if (var498 == 5407) {
                            var10--;
                            int var305 = class61.field962[class25.field341[var10]].length >> 1;
                            class25.field341[var10++] = var305;
                            continue;
                        }
                        if (var498 == 5411) {
                            if (class48.field795 != null) {
                                class129.method898(false, (byte) 113, -1, -1, class261.field4470);
                            }
                            if (class261.field4468 == null) {
                                client.method867(class291.method2009(23939), -3576, false);
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var498 == 5419) {
                            class82 var306 = class262.field4484;
                            if (class75.field1300 != null) {
                                var306 = class331.method2259(arg0 ^ 0xFFFFBE05, class75.field1300.field5123);
                                try {
                                    if (class75.field1300.field5122 != null) {
                                        byte[] var307 = ((String) class75.field1300.field5122).getBytes("ISO-8859-1");
                                        var306 = class14.method78(var307.length, -109, 0, var307);
                                    }
                                } catch (UnsupportedEncodingException var496) {
                                }
                            }
                            class110.field1970[var7++] = var306;
                            continue;
                        }
                        if (var498 == 5420) {
                            class25.field341[var10++] = class120.field2113 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 5421) {
                            if (class48.field795 != null) {
                                class129.method898(false, (byte) 99, -1, -1, class261.field4470);
                            }
                            var7--;
                            class82 var309 = class110.field1970[var7];
                            var10--;
                            boolean var310 = class25.field341[var10] == 1;
                            class82 var311 = class29.method182(-6039, new class82[] { class291.method2009(23939), var309 });
                            if (class261.field4468 == null && (!var310 || class120.field2113 == 3 || !class120.field2119.startsWith("win") || class208.field3655)) {
                                client.method867(var311, -3576, var310);
                                continue;
                            }
                            class207.field3619 = var310;
                            class15.field127 = var311;
                            class300.field5099 = class55.field881.method828((byte) -109, new String(var311.method552(false), "ISO-8859-1"));
                            continue;
                        }
                        if (var498 == 5422) {
                            var7 -= 2;
                            class82 var312 = class110.field1970[var7];
                            var10--;
                            int var313 = class25.field341[var10];
                            class82 var314 = class110.field1970[var7 + 1];
                            if (var312.method535(true) > 0) {
                                if (class3.field21 == null) {
                                    class3.field21 = new class82[class144.field2462[class22.field307]];
                                }
                                class3.field21[var313] = var312;
                            }
                            if (var314.method535(true) > 0) {
                                if (class298.field5064 == null) {
                                    class298.field5064 = new class82[class144.field2462[class22.field307]];
                                }
                                class298.field5064[var313] = var314;
                            }
                            continue;
                        }
                        if (var498 == 5423) {
                            var7--;
                            class110.field1970[var7].method526((byte) 78);
                            continue;
                        }
                    } else if (var498 < 5600) {
                        if (var498 == 5500) {
                            var10 -= 4;
                            int var252 = class25.field341[var10 + 1];
                            int var253 = class25.field341[var10];
                            int var254 = class25.field341[var10 + 2];
                            int var255 = class25.field341[var10 + 3];
                            class150.method1035(-75, (var253 >> 14 & 0x3FFF) - class230.field3976, var252, false, var255, (var253 & 0x3FFF) - class226.field3916, var254);
                            continue;
                        }
                        if (var498 == 5501) {
                            var10 -= 4;
                            int var256 = class25.field341[var10 + 1];
                            int var257 = class25.field341[var10 + 2];
                            int var258 = class25.field341[var10 + 3];
                            int var259 = class25.field341[var10];
                            class285.method1980(var256, (var259 & 0x3FFF) - class226.field3916, var257, var258, ((var259 & 0xFFFF74F) >> 14) - class230.field3976, 128);
                            continue;
                        }
                        if (var498 == 5502) {
                            var10 -= 6;
                            int var260 = class25.field341[var10];
                            if (var260 >= 2) {
                                throw new RuntimeException();
                            }
                            class28.field369 = var260;
                            int var261 = class25.field341[var10 + 1];
                            if ((class61.field962[class28.field369].length >> 1) <= (var261 + 1)) {
                                throw new RuntimeException();
                            }
                            class164.field2876 = 0;
                            class22.field308 = var261;
                            class294.field4930 = class25.field341[var10 + 2];
                            class289.field4850 = class25.field341[var10 + 3];
                            int var262 = class25.field341[var10 + 4];
                            if (var262 >= 2) {
                                throw new RuntimeException();
                            }
                            class224.field3895 = var262;
                            int var263 = class25.field341[var10 + 5];
                            if (class61.field962[class224.field3895].length >> 1 <= var263 + 1) {
                                throw new RuntimeException();
                            }
                            class273.field4602 = 3;
                            class146.field2473 = var263;
                            continue;
                        }
                        if (var498 == 5503) {
                            class39.method306((byte) -90);
                            continue;
                        }
                        if (var498 == 5504) {
                            var10 -= 2;
                            class226.field3915 = class25.field341[var10];
                            class219.field3804 = class25.field341[var10 + 1];
                            class109.method748(73);
                            continue;
                        }
                        if (var498 == 5505) {
                            class25.field341[var10++] = class226.field3915;
                            continue;
                        }
                        if (var498 == 5506) {
                            class25.field341[var10++] = class219.field3804;
                            continue;
                        }
                    } else if (var498 < 5700) {
                        if (var498 == 5600) {
                            var7 -= 2;
                            class82 var264 = class110.field1970[var7];
                            class82 var265 = class110.field1970[var7 + 1];
                            var10--;
                            int var266 = class25.field341[var10];
                            if (class61.field959 == 10 && class285.field4791 == 0 && class80.field1362 == 0 && class191.field3188 == 0 && class209.field3674 == 0) {
                                class29.method180(var264, var266, var265, 23284);
                            }
                            continue;
                        }
                        if (var498 == 5601) {
                            class205.method1470((byte) -85);
                            continue;
                        }
                        if (var498 == 5602) {
                            if (class80.field1362 == 0) {
                                class95.field1735 = -2;
                            }
                            continue;
                        }
                        if (var498 == 5603) {
                            var10 -= 4;
                            if (class61.field959 == 10 && class285.field4791 == 0 && class80.field1362 == 0 && class191.field3188 == 0 && class209.field3674 == 0) {
                                class164.method1187(class25.field341[var10 + 1], arg0 + 16379, class25.field341[var10 - -2], class25.field341[var10], class25.field341[var10 + 3]);
                            }
                            continue;
                        }
                        if (var498 == 5604) {
                            var7--;
                            if (class61.field959 == 10 && class285.field4791 == 0 && class80.field1362 == 0 && class191.field3188 == 0 && class209.field3674 == 0) {
                                class195.method1359(0, class110.field1970[var7].method568(arg0 + 39122));
                            }
                            continue;
                        }
                        if (var498 == 5605) {
                            var10 -= 4;
                            var7 -= 2;
                            if (class61.field959 == 10 && class285.field4791 == 0 && class80.field1362 == 0 && class191.field3188 == 0 && class209.field3674 == 0) {
                                class33.method256((byte) -98, class110.field1970[var7 + 1], class25.field341[var10 + 1], class25.field341[var10], class110.field1970[var7].method568(22476), class25.field341[var10 + 2], class25.field341[var10 + 3]);
                            }
                            continue;
                        }
                        if (var498 == 5606) {
                            if (class191.field3188 == 0) {
                                class19.field240 = -2;
                            }
                            continue;
                        }
                        if (var498 == 5607) {
                            class25.field341[var10++] = class95.field1735;
                            continue;
                        }
                        if (var498 == 5608) {
                            class25.field341[var10++] = class324.field5572;
                            continue;
                        }
                        if (var498 == 5609) {
                            class25.field341[var10++] = class19.field240;
                            continue;
                        }
                        if (var498 == 5610) {
                            for (int var267 = 0; var267 < 5; var267++) {
                                class110.field1970[var7++] = class66.field1032.length <= var267 ? class262.field4484 : class66.field1032[var267].method553((byte) -79);
                            }
                            class66.field1032 = null;
                            continue;
                        }
                        if (var498 == 5611) {
                            class25.field341[var10++] = class233.field4023;
                            continue;
                        }
                    } else if (var498 < 6100) {
                        if (var498 == 6001) {
                            var10--;
                            int var285 = class25.field341[var10];
                            if (var285 < 1) {
                                var285 = 1;
                            }
                            if (var285 > 4) {
                                var285 = 4;
                            }
                            class112.field2032 = var285;
                            if (!class147.field2485 || !class75.field1303) {
                                if (class112.field2032 == 1) {
                                    class102.method706(0.9F);
                                }
                                if (class112.field2032 == 2) {
                                    class102.method706(0.8F);
                                }
                                if (class112.field2032 == 3) {
                                    class102.method706(0.7F);
                                }
                                if (class112.field2032 == 4) {
                                    class102.method706(0.6F);
                                }
                            }
                            if (class147.field2485) {
                                class317.method2171(true);
                                if (!class75.field1303) {
                                    class40.method312(-5513);
                                }
                            }
                            class323.method2229(true);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6002) {
                            var10--;
                            class137.method933(class25.field341[var10] == 1, true);
                            class308.method2125((byte) 124);
                            class40.method312(-5513);
                            class43.method325(18916);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6003) {
                            var10--;
                            class77.field1320 = class25.field341[var10] == 1;
                            class43.method325(18916);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6005) {
                            var10--;
                            class256.field4409 = class25.field341[var10] == 1;
                            class40.method312(-5513);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6006) {
                            var10--;
                            class198.field3384 = class25.field341[var10] == 1;
                            ((class89) class102.field1821).method629(!class198.field3384, arg0 ^ 0xFFFFBE7A);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6007) {
                            var10--;
                            class244.field4232 = class25.field341[var10] == 1;
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6008) {
                            var10--;
                            class133.field2295 = class25.field341[var10] == 1;
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6009) {
                            var10--;
                            class113.field2040 = class25.field341[var10] == 1;
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6010) {
                            var10--;
                            class208.field3641 = class25.field341[var10] == 1;
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6011) {
                            var10--;
                            int var286 = class25.field341[var10];
                            if (var286 < 0 || var286 > 2) {
                                var286 = 0;
                            }
                            class33.field504 = var286;
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6012) {
                            if (class147.field2485) {
                                class171.method1211(0, 0, false);
                            }
                            var10--;
                            class75.field1303 = class25.field341[var10] == 1;
                            if (class147.field2485 && class75.field1303) {
                                class102.method706(0.7F);
                            } else {
                                if (class112.field2032 == 1) {
                                    class102.method706(0.9F);
                                }
                                if (class112.field2032 == 2) {
                                    class102.method706(0.8F);
                                }
                                if (class112.field2032 == 3) {
                                    class102.method706(0.7F);
                                }
                                if (class112.field2032 == 4) {
                                    class102.method706(0.6F);
                                }
                            }
                            class40.method312(-5513);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6014) {
                            var10--;
                            class126.field2220 = class25.field341[var10] == 1;
                            if (class147.field2485) {
                                class40.method312(arg0 ^ 0x548D);
                            }
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6015) {
                            var10--;
                            class52.field839 = class25.field341[var10] == 1;
                            if (class147.field2485) {
                                class317.method2171(true);
                            }
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6016) {
                            var10--;
                            int var287 = class25.field341[var10];
                            if (var287 < 0 || var287 > 2) {
                                var287 = 0;
                            }
                            if (class147.field2485) {
                                class144.field2454 = true;
                            }
                            class146.field2467 = var287;
                            continue;
                        }
                        if (var498 == 6017) {
                            var10--;
                            class308.field5238 = class25.field341[var10] == 1;
                            class219.method1550(arg0 + 16710);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6018) {
                            var10--;
                            int var288 = class25.field341[var10];
                            if (var288 < 0) {
                                var288 = 0;
                            }
                            if (var288 > 127) {
                                var288 = 127;
                            }
                            class134.field2321 = var288;
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6019) {
                            var10--;
                            int var289 = class25.field341[var10];
                            if (var289 < 0) {
                                var289 = 0;
                            }
                            if (var289 > 255) {
                                var289 = 255;
                            }
                            if (class284.field4771 != var289) {
                                if (class284.field4771 == 0 && class35.field569 != -1) {
                                    class87.method614(var289, false, 0, class35.field569, (byte) -27, class33.field484);
                                    class66.field1027 = false;
                                } else if (var289 == 0) {
                                    class241.method1731(arg0 + 16774);
                                    class66.field1027 = false;
                                } else {
                                    class211.method1517(0, var289);
                                }
                                class284.field4771 = var289;
                            }
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6020) {
                            var10--;
                            int var290 = class25.field341[var10];
                            if (var290 < 0) {
                                var290 = 0;
                            }
                            if (var290 > 127) {
                                var290 = 127;
                            }
                            class138.field2373 = var290;
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6021) {
                            var10--;
                            class91.field1639 = class25.field341[var10] == 1;
                            class43.method325(18916);
                            continue;
                        }
                        if (var498 == 6023) {
                            var10--;
                            int var291 = class25.field341[var10];
                            if (var291 < 0) {
                                var291 = 0;
                            }
                            if (var291 > 2) {
                                var291 = 2;
                            }
                            class295.method2024(var291);
                            class15.method82(true, class55.field881);
                            class16.field149 = false;
                            continue;
                        }
                        if (var498 == 6024) {
                            var10--;
                            int var292 = class25.field341[var10];
                            if (var292 < 0 || var292 > 2) {
                                var292 = 0;
                            }
                            class61.field960 = var292;
                            class15.method82(true, class55.field881);
                            continue;
                        }
                    } else if (var498 < 6200) {
                        if (var498 == 6101) {
                            class25.field341[var10++] = class112.field2032;
                            continue;
                        }
                        if (var498 == 6102) {
                            class25.field341[var10++] = class123.method841(false) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6103) {
                            class25.field341[var10++] = class77.field1320 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6105) {
                            class25.field341[var10++] = class256.field4409 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6106) {
                            class25.field341[var10++] = class198.field3384 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6107) {
                            class25.field341[var10++] = class244.field4232 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6108) {
                            class25.field341[var10++] = class133.field2295 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6109) {
                            class25.field341[var10++] = class113.field2040 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6110) {
                            class25.field341[var10++] = class208.field3641 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6111) {
                            class25.field341[var10++] = class33.field504;
                            continue;
                        }
                        if (var498 == 6112) {
                            class25.field341[var10++] = class75.field1303 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6114) {
                            class25.field341[var10++] = class126.field2220 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6115) {
                            class25.field341[var10++] = class52.field839 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6116) {
                            class25.field341[var10++] = class146.field2467;
                            continue;
                        }
                        if (var498 == 6117) {
                            class25.field341[var10++] = class308.field5238 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6118) {
                            class25.field341[var10++] = class134.field2321;
                            continue;
                        }
                        if (var498 == 6119) {
                            class25.field341[var10++] = class284.field4771;
                            continue;
                        }
                        if (var498 == 6120) {
                            class25.field341[var10++] = class138.field2373;
                            continue;
                        }
                        if (var498 == 6121) {
                            if (class147.field2485) {
                                class25.field341[var10++] = class147.field2509 ? 1 : 0;
                            } else {
                                class25.field341[var10++] = 0;
                            }
                            continue;
                        }
                        if (var498 == 6123) {
                            class25.field341[var10++] = class295.method2031();
                            continue;
                        }
                        if (var498 == 6124) {
                            class25.field341[var10++] = class61.field960;
                            continue;
                        }
                    } else if (var498 < 6300) {
                        if (var498 == 6200) {
                            var10 -= 2;
                            class13.field95 = (short) class25.field341[var10];
                            if (class13.field95 <= 0) {
                                class13.field95 = 256;
                            }
                            class13.field98 = (short) class25.field341[var10 + 1];
                            if (class13.field98 <= 0) {
                                class13.field98 = 205;
                            }
                            continue;
                        }
                        if (var498 == 6201) {
                            var10 -= 2;
                            class143.field2441 = (short) class25.field341[var10];
                            if (class143.field2441 <= 0) {
                                class143.field2441 = 256;
                            }
                            class294.field4931 = (short) class25.field341[var10 + 1];
                            if (class294.field4931 <= 0) {
                                class294.field4931 = 320;
                            }
                            continue;
                        }
                        if (var498 == 6202) {
                            var10 -= 4;
                            class111.field2006 = (short) class25.field341[var10];
                            if (class111.field2006 <= 0) {
                                class111.field2006 = 1;
                            }
                            class88.field1569 = (short) class25.field341[var10 + 1];
                            if (class88.field1569 <= 0) {
                                class88.field1569 = 32767;
                            } else if (class88.field1569 < class111.field2006) {
                                class88.field1569 = class111.field2006;
                            }
                            class134.field2319 = (short) class25.field341[var10 + 2];
                            if (class134.field2319 <= 0) {
                                class134.field2319 = 1;
                            }
                            class271.field4573 = (short) class25.field341[var10 + 3];
                            if (class271.field4573 <= 0) {
                                class271.field4573 = 32767;
                            } else if (class271.field4573 < class134.field2319) {
                                class271.field4573 = class134.field2319;
                            }
                            continue;
                        }
                        if (var498 == 6203) {
                            class14.method79(class81.field1382.field1216, 0, false, class81.field1382.field1205, arg0 + 16582, 0);
                            class25.field341[var10++] = class307.field5224;
                            class25.field341[var10++] = class15.field124;
                            continue;
                        }
                        if (var498 == 6204) {
                            class25.field341[var10++] = class143.field2441;
                            class25.field341[var10++] = class294.field4931;
                            continue;
                        }
                        if (var498 == 6205) {
                            class25.field341[var10++] = class13.field95;
                            class25.field341[var10++] = class13.field98;
                            continue;
                        }
                    } else if (var498 < 6400) {
                        if (var498 == 6300) {
                            class25.field341[var10++] = (int) (class57.method391(19211) / 60000L);
                            continue;
                        }
                        if (var498 == 6301) {
                            class25.field341[var10++] = (int) (class57.method391(19211) / 86400000L) - 11745;
                            continue;
                        }
                        if (var498 == 6302) {
                            var10 -= 3;
                            int var280 = class25.field341[var10];
                            int var281 = class25.field341[var10 + 1];
                            int var282 = class25.field341[var10 + 2];
                            class137.field2359.clear();
                            class137.field2359.set(11, 12);
                            class137.field2359.set(var282, var281, var280);
                            class25.field341[var10++] = (int) (class137.field2359.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var498 == 6303) {
                            class137.field2359.clear();
                            class137.field2359.setTime(new Date(class57.method391(19211)));
                            class25.field341[var10++] = class137.field2359.get(1);
                            continue;
                        }
                        if (var498 == 6304) {
                            var10--;
                            int var283 = class25.field341[var10];
                            boolean var284 = true;
                            if (var283 < 0) {
                                var284 = (var283 + 1) % 4 == 0;
                            } else if (var283 < 1582) {
                                var284 = var283 % 4 == 0;
                            } else if ((var283 % 4) != 0) {
                                var284 = false;
                            } else if (var283 % 100 != 0) {
                                var284 = true;
                            } else if ((var283 % 400) != 0) {
                                var284 = false;
                            }
                            class25.field341[var10++] = var284 ? 1 : 0;
                            continue;
                        }
                    } else if (var498 < 6500) {
                        if (var498 == 6405) {
                            class25.field341[var10++] = class157.method1126(-126) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 6406) {
                            class25.field341[var10++] = class328.method2246((byte) 108) ? 1 : 0;
                            continue;
                        }
                    } else if (var498 < 6600) {
                        if (var498 == 6500) {
                            if (class61.field959 == 10 && class285.field4791 == 0 && class80.field1362 == 0 && class191.field3188 == 0) {
                                class25.field341[var10++] = class277.method1930((byte) -57) == -1 ? 0 : 1;
                                continue;
                            }
                            class25.field341[var10++] = 1;
                            continue;
                        }
                        if (var498 == 6501) {
                            class67 var268 = class131.method909((byte) -95);
                            if (var268 == null) {
                                class25.field341[var10++] = -1;
                                class25.field341[var10++] = 0;
                                class110.field1970[var7++] = class262.field4484;
                                class25.field341[var10++] = 0;
                                class110.field1970[var7++] = class262.field4484;
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var268.field1041;
                                class25.field341[var10++] = var268.field3587;
                                class110.field1970[var7++] = var268.field1043;
                                class180 var269 = var268.method425(arg0 ^ 0x4142);
                                class25.field341[var10++] = var269.field3077;
                                class110.field1970[var7++] = var269.field3069;
                                class25.field341[var10++] = var268.field3582;
                            }
                            continue;
                        }
                        if (var498 == 6502) {
                            class67 var270 = class231.method1637(-110);
                            if (var270 == null) {
                                class25.field341[var10++] = -1;
                                class25.field341[var10++] = 0;
                                class110.field1970[var7++] = class262.field4484;
                                class25.field341[var10++] = 0;
                                class110.field1970[var7++] = class262.field4484;
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var270.field1041;
                                class25.field341[var10++] = var270.field3587;
                                class110.field1970[var7++] = var270.field1043;
                                class180 var271 = var270.method425(arg0 ^ 0x4175);
                                class25.field341[var10++] = var271.field3077;
                                class110.field1970[var7++] = var271.field3069;
                                class25.field341[var10++] = var270.field3582;
                            }
                            continue;
                        }
                        if (var498 == 6503) {
                            var10--;
                            int var272 = class25.field341[var10];
                            if (class61.field959 == 10 && class285.field4791 == 0 && class80.field1362 == 0 && class191.field3188 == 0) {
                                class25.field341[var10++] = class273.method1910(var272, (byte) 78) ? 1 : 0;
                                continue;
                            }
                            class25.field341[var10++] = 0;
                            continue;
                        }
                        if (var498 == 6504) {
                            var10--;
                            class123.field2155 = class25.field341[var10];
                            class15.method82(true, class55.field881);
                            continue;
                        }
                        if (var498 == 6505) {
                            class25.field341[var10++] = class123.field2155;
                            continue;
                        }
                        if (var498 == 6506) {
                            var10--;
                            int var273 = class25.field341[var10];
                            class67 var274 = class44.method329(arg0 ^ 0xFFFFB229, var273);
                            if (var274 == null) {
                                class25.field341[var10++] = -1;
                                class110.field1970[var7++] = class262.field4484;
                                class25.field341[var10++] = 0;
                                class110.field1970[var7++] = class262.field4484;
                                class25.field341[var10++] = 0;
                            } else {
                                class25.field341[var10++] = var274.field3587;
                                class110.field1970[var7++] = var274.field1043;
                                class180 var275 = var274.method425(102);
                                class25.field341[var10++] = var275.field3077;
                                class110.field1970[var7++] = var275.field3069;
                                class25.field341[var10++] = var274.field3582;
                            }
                            continue;
                        }
                        if (var498 == 6507) {
                            var10 -= 4;
                            boolean var276 = class25.field341[var10 + 1] == 1;
                            int var277 = class25.field341[var10 + 2];
                            int var278 = class25.field341[var10];
                            boolean var279 = class25.field341[var10 + 3] == 1;
                            class51.method362(var279, var278, var276, var277, (byte) -71);
                            continue;
                        }
                    } else if (var498 < 6700) {
                        if (var498 == 6600) {
                            var10--;
                            class300.field5098 = class25.field341[var10] == 1;
                            class15.method82(true, class55.field881);
                            continue;
                        }
                        if (var498 == 6601) {
                            class25.field341[var10++] = class300.field5098 ? 1 : 0;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var497) {
            if (var5.field704 == null) {
                if (class91.field1640 != 0) {
                    class200.method1406(class262.field4484, 0, class194.field3292, 4);
                }
                class48.method348(-2, "CS2 - scr:" + var5.field2418 + " op:" + var11, var497);
            } else {
                class82 var493 = class253.method1820(30, 0);
                var493.method525((byte) -95, class149.field2535).method525((byte) -127, var5.field704);
                for (int var494 = class86.field1542 - 1; var494 >= 0; var494--) {
                    var493.method525((byte) -29, class235.field4093).method525((byte) -28, class300.field5111[var494].field1792.field704);
                }
                if (var11 == 40) {
                    int var495 = var9[var8];
                    var493.method525((byte) -44, class177.field3048).method525((byte) -35, class327.method2240((byte) -74, var495));
                }
                if (class91.field1640 != 0) {
                    class200.method1406(class262.field4484, 0, class29.method182(-6039, new class82[] { class117.field2068, var5.field704 }), 4);
                }
                class48.method348(arg0 ^ 0x4104, "CS2 - scr:" + var5.field2418 + " op:" + var11 + new String(var493.method552(false)), var497);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V", line = 6088)
    public static void method1112(int arg0) {
        if (arg0 >= -100) {
            field2654 = (short[]) null;
        }
        field2654 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLum;Lum;)V", line = 6101)
    public static final void method1113(boolean arg0, class222 arg1, class222 arg2) {
        field2657++;
        class21.field283 = class196.method1377(class21.field290, arg1, 0, -513, arg2);
        if (!arg0) {
            field2654 = (short[]) null;
        }
        if (class147.field2485) {
            class250.field4311 = class259.method1847(0, 4, class21.field290, arg2, arg1);
        } else {
            class250.field4311 = (class145) class21.field283;
        }
        class138.field2364 = class196.method1377(class87.field1556, arg1, 0, -513, arg2);
        class253.field4354 = class196.method1377(class21.field280, arg1, 0, -513, arg2);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLbc;)V", line = 6120)
    public final void method1114(byte arg0, class153 arg1) {
        int var3 = -121 % ((arg0 - 21) / 58);
        field2658++;
        while (true) {
            int var4 = arg1.method1082(-49);
            if (var4 == 0) {
                return;
            }
            this.method1116(var4, false, arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([J[Ljava/lang/Object;B)V", line = 6140)
    public static final void method1115(long[] arg0, Object[] arg1, byte arg2) {
        int var3 = 27 / ((arg2 - 31) / 44);
        class159.method1153(0, arg1, arg0, arg0.length - 1, (byte) 114);
        field2653++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZLbc;)V", line = 6158)
    private final void method1116(int arg0, boolean arg1, class153 arg2) {
        field2659++;
        if (arg1) {
            method1115((long[]) null, (Object[]) null, (byte) -106);
        }
        if (arg0 == 2) {
            this.field2655 = arg2.method1090(false);
        }
    }
}

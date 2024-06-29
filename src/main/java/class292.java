import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public abstract class class292 {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "Lof;")
    public static class446 field4264 = new class446(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field4263;

    static {
        new class446("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLqw;II)V", line = 7)
    public static final void method1864(byte arg0, class54 arg1, int arg2, int arg3) {
        field4262++;
        if (arg1 == null || class131.field1769.field906 == arg1) {
            return;
        }
        int var4 = 98 / ((arg0 + 33) / 38);
        int var5 = arg1.field762;
        int var6 = arg1.field754;
        int var7 = arg1.field764;
        int var8 = (int) arg1.field758;
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        long var9 = arg1.field758;
        if (var7 == 1012) {
            class418.field6370 = 2;
            class194.field2595 = 0;
            class173.field2326++;
            class484.field7137 = arg2;
            class156.field2036 = arg3;
            class424.method2582(class119.field1632, -1);
            class538.field7879.method1114((int) (var9 >>> 32) & Integer.MAX_VALUE, 113);
            class538.field7879.method1114(class331.field5162 + var5, 107);
            class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -78);
            class538.field7879.method1084(-3577, var6 + class328.field5099);
            class211.method1449(var5, var6, (byte) -46, var9);
        }
        if (var7 == 16) {
            class24 var11 = (class24) class406.field6158.method1747((long) var8, false);
            if (var11 != null) {
                class194.field2595 = 0;
                class156.field2036 = arg3;
                class17 var12 = var11.field348;
                class418.field6370 = 2;
                class64.field911++;
                class484.field7137 = arg2;
                class424.method2582(class367.field5620, -1);
                class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
                class538.field7879.method1097(-3, var8);
                class203.method1373(0, var12.field3915[0], var12.method637((byte) -98), -2, 0, var12.method637((byte) -128), true, var12.field3917[0], (byte) 11);
            }
        }
        if (var7 == 23) {
            class24 var13 = (class24) class406.field6158.method1747((long) var8, false);
            if (var13 != null) {
                class194.field2595 = 0;
                class257.field3545++;
                class156.field2036 = arg3;
                class418.field6370 = 2;
                class484.field7137 = arg2;
                class17 var14 = var13.field348;
                class424.method2582(class515.field7559, -1);
                class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
                class538.field7879.method1084(-3577, var8);
                class203.method1373(0, var14.field3915[0], var14.method637((byte) -97), -2, 0, var14.method637((byte) -107), true, var14.field3917[0], (byte) 11);
            }
        }
        if (var7 == 8) {
            if (class257.field3562 > 0 && class35.field515.method1970(true, 82) && class35.field515.method1970(true, 81)) {
                class72.method501((byte) 121, class331.field5162 + var5, class328.field5099 + var6, class56.field800.field1866);
            } else {
                class380.method2380(var6, var5, (byte) -37, var8);
                if (var8 == 1) {
                    class538.field7879.method1072((byte) 102, -1);
                    class538.field7879.method1072((byte) 102, -1);
                    class538.field7879.method1114((int) class53.field744, 101);
                    class538.field7879.method1072((byte) 102, 57);
                    class538.field7879.method1072((byte) 102, class303.field4433);
                    class538.field7879.method1072((byte) 102, class514.field7549);
                    class538.field7879.method1072((byte) 102, 89);
                    class538.field7879.method1114(class56.field800.field1867, 124);
                    class538.field7879.method1114(class56.field800.field1862, 124);
                    class538.field7879.method1072((byte) 102, 63);
                } else {
                    class156.field2036 = arg3;
                    class418.field6370 = 1;
                    class484.field7137 = arg2;
                    class194.field2595 = 0;
                }
                class203.method1373(0, var6, 1, -4, 0, 1, true, var5, (byte) 11);
            }
        }
        if (var7 == 12) {
            class194.field2595 = 0;
            class92.field1363++;
            class484.field7137 = arg2;
            class418.field6370 = 2;
            class156.field2036 = arg3;
            class424.method2582(class233.field3313, -1);
            class538.field7879.method1114(class331.field5162 + var5, 108);
            class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
            class538.field7879.method1114(Integer.MAX_VALUE & (int) (var9 >>> 32), 111);
            class538.field7879.method1068(29, var6 + class328.field5099);
            class211.method1449(var5, var6, (byte) -77, var9);
        }
        if (var7 == 10) {
            class282 var15 = class178.method1197(var5, var6, 31);
            if (var15 != null) {
                class306.method1922(-1);
                class445 var16 = client.method1348(var15);
                class136.method917(-116, var16.method2699(1661101682), var15, var16.field6681);
                class468.field7001 = class470.method2819((byte) 126, var15);
                if (class468.field7001 == null) {
                    class468.field7001 = "Null";
                }
                class466.field6947 = var15.field4116 + "<col=ffffff>";
            }
            return;
        }
        if (var7 == 6) {
            class96 var17 = class241.field3398[var8];
            if (var17 != null) {
                class156.field2036 = arg3;
                class484.field7137 = arg2;
                class194.field2595 = 0;
                class418.field6370 = 2;
                class180.field2430++;
                class424.method2582(class425.field6471, -1);
                class538.field7879.method1084(-3577, var8);
                class538.field7879.method1075(128, class35.field515.method1970(true, 82) ? 1 : 0);
                class203.method1373(0, var17.field3915[0], var17.method637((byte) -27), -2, 0, var17.method637((byte) 78), true, var17.field3917[0], (byte) 11);
            }
        }
        if (var7 == 21) {
            class96 var18 = class241.field3398[var8];
            if (var18 != null) {
                class310.field4512++;
                class194.field2595 = 0;
                class418.field6370 = 2;
                class484.field7137 = arg2;
                class156.field2036 = arg3;
                class424.method2582(class389.field5947, -1);
                class538.field7879.method1097(-3, var8);
                class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
                class203.method1373(0, var18.field3915[0], var18.method637((byte) 39), -2, 0, var18.method637((byte) 31), true, var18.field3917[0], (byte) 11);
            }
        }
        if (var7 == 46) {
            class96 var19 = class241.field3398[var8];
            if (var19 != null) {
                class484.field7137 = arg2;
                class53.field743++;
                class194.field2595 = 0;
                class418.field6370 = 2;
                class156.field2036 = arg3;
                class424.method2582(class33.field491, -1);
                class538.field7879.method1097(-3, var8);
                class538.field7879.method1075(128, class35.field515.method1970(true, 82) ? 1 : 0);
                class203.method1373(0, var19.field3915[0], var19.method637((byte) -28), -2, 0, var19.method637((byte) -107), true, var19.field3917[0], (byte) 11);
            }
        }
        if (var7 == 3) {
            class96 var20 = class241.field3398[var8];
            if (var20 != null) {
                class484.field7137 = arg2;
                class156.field2036 = arg3;
                class418.field6370 = 2;
                class492.field7265++;
                class194.field2595 = 0;
                class424.method2582(class245.field3441, -1);
                class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -80);
                class538.field7879.method1068(74, var8);
                class203.method1373(0, var20.field3915[0], var20.method637((byte) -108), -2, 0, var20.method637((byte) -113), true, var20.field3917[0], (byte) 11);
            }
        }
        if (var7 == 17) {
            class418.field6370 = 2;
            class194.field2595 = 0;
            class484.field7137 = arg2;
            class156.field2036 = arg3;
            class141.field1881++;
            class424.method2582(class365.field5601, -1);
            class538.field7879.method1084(-3577, var8);
            class538.field7879.method1114(class328.field5099 + var6, 117);
            class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -89);
            class538.field7879.method1068(114, class331.field5162 + var5);
            class420.method2570(var6, var5, true);
        }
        if (var7 == 19) {
            class96 var21 = class241.field3398[var8];
            if (var21 != null) {
                class432.field6572++;
                class194.field2595 = 0;
                class418.field6370 = 2;
                class484.field7137 = arg2;
                class156.field2036 = arg3;
                class424.method2582(class95.field1382, -1);
                class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
                class538.field7879.method1114(var8, 112);
                class203.method1373(0, var21.field3915[0], var21.method637((byte) -123), -2, 0, var21.method637((byte) -108), true, var21.field3917[0], (byte) 11);
            }
        }
        if (var7 == 59) {
            class96 var22 = class241.field3398[var8];
            if (var22 != null) {
                class394.field6024++;
                class484.field7137 = arg2;
                class156.field2036 = arg3;
                class418.field6370 = 2;
                class194.field2595 = 0;
                class424.method2582(class535.field7861, -1);
                class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -66);
                class538.field7879.method1084(-3577, var8);
                class203.method1373(0, var22.field3915[0], var22.method637((byte) 90), -2, 0, var22.method637((byte) -106), true, var22.field3917[0], (byte) 11);
            }
        }
        if (var7 == 49) {
            class96 var23 = class241.field3398[var8];
            if (var23 != null) {
                class156.field2036 = arg3;
                class418.field6370 = 2;
                class360.field5523++;
                class194.field2595 = 0;
                class484.field7137 = arg2;
                class424.method2582(class321.field4654, -1);
                class538.field7879.method1075(128, class35.field515.method1970(true, 82) ? 1 : 0);
                class538.field7879.method1068(52, var8);
                class203.method1373(0, var23.field3915[0], var23.method637((byte) -121), -2, 0, var23.method637((byte) 114), true, var23.field3917[0], (byte) 11);
            }
        }
        if (var7 == 45 || var7 == 1006) {
            class257.method1654(var6, arg1.field752, (byte) 106, var8, var5);
        }
        if (var7 == 48) {
            class418.field6370 = 2;
            class511.field7501++;
            class194.field2595 = 0;
            class156.field2036 = arg3;
            class484.field7137 = arg2;
            class424.method2582(class355.field5490, -1);
            class538.field7879.method1114(var8, 100);
            class538.field7879.method1084(-3577, var5 + class331.field5162);
            class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -66);
            class538.field7879.method1084(-3577, class328.field5099 + var6);
            class420.method2570(var6, var5, true);
        }
        if (var7 == 30) {
            class194.field2595 = 0;
            class418.field6370 = 2;
            class484.field7137 = arg2;
            class222.field3089++;
            class156.field2036 = arg3;
            class424.method2582(class74.field1054, -1);
            class538.field7879.method1075(128, class35.field515.method1970(true, 82) ? 1 : 0);
            class538.field7879.method1097(-3, var6 + class328.field5099);
            class538.field7879.method1097(-3, var8);
            class538.field7879.method1114(class331.field5162 + var5, 93);
            class420.method2570(var6, var5, true);
        }
        if (var7 == 44) {
            class24 var24 = (class24) class406.field6158.method1747((long) var8, false);
            if (var24 != null) {
                class323.field4677++;
                class484.field7137 = arg2;
                class17 var25 = var24.field348;
                class418.field6370 = 2;
                class194.field2595 = 0;
                class156.field2036 = arg3;
                class424.method2582(class311.field4541, -1);
                class538.field7879.method1097(-3, class497.field7333);
                class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -97);
                class538.field7879.method1068(32, var8);
                class538.field7879.method1062((byte) -39, class63.field894);
                class538.field7879.method1068(89, class361.field5539);
                class203.method1373(0, var25.field3915[0], var25.method637((byte) 46), -2, 0, var25.method637((byte) 62), true, var25.field3917[0], (byte) 11);
            }
        }
        if (var7 == 58) {
            class282 var26 = class178.method1197(var5, var6, 30);
            if (var26 != null) {
                class519.method3093(var26, false);
            }
        }
        if (var7 == 1003) {
            class156.field2036 = arg3;
            class418.field6370 = 2;
            class194.field2595 = 0;
            class365.field5596++;
            class484.field7137 = arg2;
            class424.method2582(class354.field5480, -1);
            class538.field7879.method1114(var8, 106);
        }
        if (var7 == 20) {
            class70.field974++;
            class418.field6370 = 2;
            class156.field2036 = arg3;
            class484.field7137 = arg2;
            class194.field2595 = 0;
            class424.method2582(class150.field1967, -1);
            class538.field7879.method1068(109, class361.field5539);
            class538.field7879.method1097(-3, class56.field800.field3882);
            class538.field7879.method1075(128, class35.field515.method1970(true, 82) ? 1 : 0);
            class538.field7879.method1096((byte) 19, class63.field894);
            class538.field7879.method1068(33, class497.field7333);
        }
        if (var7 == 1010 || var7 == 1004 || var7 == 1001 || var7 == 1008 || var7 == 1011) {
            class94.method629(var8, var5, var7, true);
        }
        if (var7 == 18) {
            class290.field4237++;
            class156.field2036 = arg3;
            class194.field2595 = 0;
            class418.field6370 = 2;
            class484.field7137 = arg2;
            class424.method2582(class134.field1803, -1);
            class538.field7879.method1114(class328.field5099 + var6, 95);
            class538.field7879.method1068(41, var5 + class331.field5162);
            class538.field7879.method1097(-3, (int) (var9 >>> 32) & Integer.MAX_VALUE);
            class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
            class211.method1449(var5, var6, (byte) -99, var9);
        }
        if (var7 == 22) {
            class24 var27 = (class24) class406.field6158.method1747((long) var8, false);
            if (var27 != null) {
                class156.field2036 = arg3;
                class480.field7083++;
                class418.field6370 = 2;
                class484.field7137 = arg2;
                class194.field2595 = 0;
                class17 var28 = var27.field348;
                class424.method2582(class468.field7003, -1);
                class538.field7879.method1097(-3, var8);
                class538.field7879.method1061(class35.field515.method1970(true, 82) ? 1 : 0, false);
                class203.method1373(0, var28.field3915[0], var28.method637((byte) 100), -2, 0, var28.method637((byte) -118), true, var28.field3917[0], (byte) 11);
            }
        }
        if (var7 == 57) {
            class24 var29 = (class24) class406.field6158.method1747((long) var8, false);
            if (var29 != null) {
                class352.field5436++;
                class17 var30 = var29.field348;
                class156.field2036 = arg3;
                class194.field2595 = 0;
                class418.field6370 = 2;
                class484.field7137 = arg2;
                class424.method2582(class131.field1750, -1);
                class538.field7879.method1114(var8, 89);
                class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
                class203.method1373(0, var30.field3915[0], var30.method637((byte) 30), -2, 0, var30.method637((byte) -110), true, var30.field3917[0], (byte) 11);
            }
        }
        if (var7 == 2) {
            class24 var31 = (class24) class406.field6158.method1747((long) var8, false);
            if (var31 != null) {
                class366.field5608++;
                class156.field2036 = arg3;
                class484.field7137 = arg2;
                class17 var32 = var31.field348;
                class418.field6370 = 2;
                class194.field2595 = 0;
                class424.method2582(class478.field7077, -1);
                class538.field7879.method1084(-3577, var8);
                class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -73);
                class203.method1373(0, var32.field3915[0], var32.method637((byte) -120), -2, 0, var32.method637((byte) -111), true, var32.field3917[0], (byte) 11);
            }
        }
        if (var7 == 60 && class201.field2705 == null) {
            class206.method1391((byte) 9, var5, var6);
            class201.field2705 = class178.method1197(var5, var6, 102);
            class206.method1385(2, class201.field2705);
        }
        if (var7 == 9) {
            if (class257.field3562 > 0 && class35.field515.method1970(true, 82) && class35.field515.method1970(true, 81)) {
                class72.method501((byte) -75, class331.field5162 + var5, class328.field5099 + var6, class56.field800.field1866);
            } else {
                class418.field6370 = 1;
                class484.field7137 = arg2;
                class412.field6266++;
                class194.field2595 = 0;
                class156.field2036 = arg3;
                class424.method2582(class62.field890, -1);
                class538.field7879.method1084(-3577, class328.field5099 + var6);
                class538.field7879.method1068(123, class331.field5162 + var5);
            }
        }
        if (var7 == 5) {
            class373.field5675++;
            class484.field7137 = arg2;
            class418.field6370 = 2;
            class156.field2036 = arg3;
            class194.field2595 = 0;
            class424.method2582(class459.field6866, -1);
            class538.field7879.method1084(-3577, var5 + class331.field5162);
            class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -50);
            class538.field7879.method1097(-3, var8);
            class538.field7879.method1097(-3, class328.field5099 + var6);
            class420.method2570(var6, var5, true);
        }
        if (var7 == 15) {
            class96 var33 = class241.field3398[var8];
            if (var33 != null) {
                class423.field6447++;
                class484.field7137 = arg2;
                class418.field6370 = 2;
                class194.field2595 = 0;
                class156.field2036 = arg3;
                class424.method2582(class14.field262, -1);
                class538.field7879.method1097(-3, var8);
                class538.field7879.method1072((byte) 102, class35.field515.method1970(true, 82) ? 1 : 0);
                class203.method1373(0, var33.field3915[0], var33.method637((byte) 34), -2, 0, var33.method637((byte) -125), true, var33.field3917[0], (byte) 11);
            }
        }
        if (var7 == 13) {
            class156.field2036 = arg3;
            class418.field6370 = 2;
            class432.field6571++;
            class484.field7137 = arg2;
            class194.field2595 = 0;
            class424.method2582(class425.field6479, -1);
            class538.field7879.method1114(Integer.MAX_VALUE & (int) (var9 >>> 32), 87);
            class538.field7879.method1061(class35.field515.method1970(true, 82) ? 1 : 0, false);
            class538.field7879.method1097(-3, var6 + class328.field5099);
            class538.field7879.method1114(class331.field5162 + var5, 125);
            class211.method1449(var5, var6, (byte) -60, var9);
        }
        if (var7 == 51) {
            class156.field2036 = arg3;
            class194.field2595 = 0;
            class484.field7137 = arg2;
            class194.field2587++;
            class418.field6370 = 2;
            class424.method2582(class411.field6256, -1);
            class538.field7879.method1097(-3, Integer.MAX_VALUE & (int) (var9 >>> 32));
            class538.field7879.method1084(-3577, var5 + class331.field5162);
            class538.field7879.method1084(-3577, var6 + class328.field5099);
            class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -60);
            class211.method1449(var5, var6, (byte) -108, var9);
        }
        if (var7 == 1002) {
            class156.field2036 = arg3;
            class418.field6370 = 2;
            class484.field7137 = arg2;
            class194.field2595 = 0;
            class24 var34 = (class24) class406.field6158.method1747((long) var8, false);
            if (var34 != null) {
                class17 var35 = var34.field348;
                class258 var36 = var35.field274;
                if (var36.field3627 != null) {
                    var36 = var36.method1660(class288.field4208, (byte) 74);
                }
                if (var36 != null) {
                    class312.field4564++;
                    class424.method2582(class62.field888, -1);
                    class538.field7879.method1114(var36.field3631, 122);
                }
            }
        }
        if (var7 == 50) {
            class484.field7137 = arg2;
            class418.field6370 = 1;
            class156.field2036 = arg3;
            class41.field591++;
            class194.field2595 = 0;
            class424.method2582(class433.field6582, -1);
            class538.field7879.method1084(-3577, class328.field5099 + var6);
            class538.field7879.method1084(-3577, class497.field7333);
            class538.field7879.method1114(class361.field5539, 118);
            class538.field7879.method1114(class331.field5162 + var5, 103);
            class538.field7879.method1062((byte) -39, class63.field894);
            class203.method1373(0, var6, 1, -4, 0, 1, true, var5, (byte) 11);
        }
        if (var7 == 47) {
            class73.field1007++;
            class156.field2036 = arg3;
            class418.field6370 = 2;
            class484.field7137 = arg2;
            class194.field2595 = 0;
            class424.method2582(class167.field2253, -1);
            class538.field7879.method1075(128, class35.field515.method1970(true, 82) ? 1 : 0);
            class538.field7879.method1114(var5 + class331.field5162, 98);
            class538.field7879.method1068(43, class361.field5539);
            class538.field7879.method1097(-3, var6 + class328.field5099);
            class538.field7879.method1114(var8, 115);
            class538.field7879.method1096((byte) 29, class63.field894);
            class538.field7879.method1068(32, class497.field7333);
            class420.method2570(var6, var5, true);
        }
        if (var7 == 11) {
            class156.field2036 = arg3;
            class194.field2595 = 0;
            class418.field6370 = 2;
            class484.field7137 = arg2;
            class225.field3119++;
            class424.method2582(class434.field6588, -1);
            class538.field7879.method1068(77, class328.field5099 + var6);
            class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -76);
            class538.field7879.method1068(38, class331.field5162 + var5);
            class538.field7879.method1097(-3, var8);
            class420.method2570(var6, var5, true);
        }
        if (var7 == 4) {
            class96 var37 = class241.field3398[var8];
            if (var37 != null) {
                class194.field2595 = 0;
                class70.field974++;
                class418.field6370 = 2;
                class156.field2036 = arg3;
                class484.field7137 = arg2;
                class424.method2582(class150.field1967, -1);
                class538.field7879.method1068(81, class361.field5539);
                class538.field7879.method1097(-3, var8);
                class538.field7879.method1075(128, class35.field515.method1970(true, 82) ? 1 : 0);
                class538.field7879.method1096((byte) 119, class63.field894);
                class538.field7879.method1068(118, class497.field7333);
                class203.method1373(0, var37.field3915[0], var37.method637((byte) 93), -2, 0, var37.method637((byte) -16), true, var37.field3917[0], (byte) 11);
            }
        }
        if (var7 == 25) {
            class370.field5639++;
            class418.field6370 = 2;
            class156.field2036 = arg3;
            class194.field2595 = 0;
            class484.field7137 = arg2;
            class424.method2582(class187.field2511, -1);
            class538.field7879.method1084(-3577, class361.field5539);
            class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, -111);
            class538.field7879.method1084(-3577, Integer.MAX_VALUE & (int) (var9 >>> 32));
            class538.field7879.method1114(class328.field5099 + var6, 92);
            class538.field7879.method1068(87, var5 + class331.field5162);
            class538.field7879.method1073(326170192, class63.field894);
            class538.field7879.method1068(110, class497.field7333);
            class211.method1449(var5, var6, (byte) -101, var9);
        }
        if (var7 == 1007) {
            class194.field2595 = 0;
            class516.field7578++;
            class418.field6370 = 2;
            class156.field2036 = arg3;
            class484.field7137 = arg2;
            class424.method2582(class99.field1452, -1);
            class538.field7879.method1114(var8, 87);
        }
        if (class44.field641) {
            class306.method1922(-1);
        }
        if (class269.field3742 != null && class491.field7251 == 0) {
            class206.method1385(2, class269.field3742);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 746)
    public static final void method1865(byte arg0) {
        class77.field1118 = -1;
        if (arg0 <= 68) {
            field4264 = null;
        }
        class207.field2819 = 0;
        class309.field4501 = -1;
        field4263++;
        class75.field1103 = -1;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 763)
    public static void method1866(int arg0) {
        if (arg0 == 8839) {
            field4264 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lme;I)Lme;")
    public abstract class132 method1319(class132 arg0, int arg1);
}

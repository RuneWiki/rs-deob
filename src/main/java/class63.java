import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 {

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lhb;")
    private class44 field1592 = new class44();

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "La;")
    private static class1 field1569 = class113.method934(-11538, "Loading game screen )2 ");

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "La;")
    public static class1 field1575 = class113.method934(-11538, ")2");

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "La;")
    private static class1 field1585 = class113.method934(-11538, "Offline");

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "La;")
    public static class1 field1570 = class113.method934(-11538, "invback");

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "La;")
    public static class1 field1584 = class113.method934(-11538, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "La;")
    public static class1 field1579 = class113.method934(-11538, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field1590 = 0;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "La;")
    public static class1 field1596 = field1585;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "[I")
    public static int[] field1598 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "La;")
    private static class1 field1594 = class113.method934(-11538, "Take");

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "La;")
    public static class1 field1597 = field1594;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "La;")
    public static class1 field1600 = field1569;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lbd;")
    public static class11 field1586;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[Ljd;")
    public static class58[] field1581;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lhb;", line = 4)
    public final class44 method600(int arg0) {
        if (arg0 != 536857847) {
            field1569 = null;
        }
        field1588++;
        class44 var2 = this.field1592.field1160;
        if (this.field1592 == var2) {
            return null;
        } else {
            var2.method470(arg0 ^ 0x1FFFCCF7);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILhb;)V", line = 23)
    public final void method601(int arg0, class44 arg1) {
        field1573++;
        if (arg1.field1165 != null) {
            arg1.method470(0);
        }
        arg1.field1160 = this.field1592;
        arg1.field1165 = this.field1592.field1165;
        arg1.field1165.field1160 = arg1;
        arg1.field1160.field1165 = arg1;
        if (arg0 <= 97) {
            method610(null, 14, false, 78, 114, 98, -51, -54);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 48)
    private static final void method602(byte arg0) {
        class97.field2402++;
        class116.method960(0, true);
        class115.method953(true, -15537);
        field1571++;
        class116.method960(0, false);
        class115.method953(false, -15537);
        class48.method505((byte) 61);
        class121.method993(true);
        if (!class81.field2046) {
            int var1 = class131.field3207;
            if (class57.field1462 / 256 > var1) {
                var1 = class57.field1462 / 256;
            }
            int var2 = class113.field2800 + class112.field2769 & 0x7FF;
            if (class19.field633[4] && class64.field1602[4] + 128 > var1) {
                var1 = class64.field1602[4] + 128;
            }
            class99.method851(var1, class46.field1196, class78.method715((byte) -123, class2.field76, class104.field2624.field1975, class104.field2624.field1966) - 50, var2, class74.field1842, -1, var1 * 3 + 600);
        }
        int var3;
        if (class81.field2046) {
            var3 = class16.method274(256);
        } else {
            var3 = class19.method299((byte) -107);
        }
        int var4 = class23.field710;
        int var5 = class4.field185;
        int var6 = class70.field1751;
        int var7 = class53.field1403;
        int var8 = class46.field1202;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class19.field633[var9]) {
                int var10 = (int) ((double) (class14.field472[var9] * 2 + 1) * Math.random() + Math.sin((double) class113.field2785[var9] / 100.0D * (double) class38.field1020[var9]) * (double) class64.field1602[var9] - (double) class14.field472[var9]);
                if (var9 == 1) {
                    class70.field1751 += var10;
                }
                if (var9 == 0) {
                    class23.field710 += var10;
                }
                if (var9 == 2) {
                    class46.field1202 += var10;
                }
                if (var9 == 4) {
                    class53.field1403 += var10;
                    if (class53.field1403 < 128) {
                        class53.field1403 = 128;
                    }
                    if (class53.field1403 > 383) {
                        class53.field1403 = 383;
                    }
                }
                if (var9 == 3) {
                    class4.field185 = class4.field185 + var10 & 0x7FF;
                }
            }
        }
        class131.method1031((byte) 74);
        class91.field2242 = class102.field2571 - 4;
        class91.field2251 = true;
        class91.field2273 = class24.field742 - 4;
        class91.field2264 = 0;
        class111.method923();
        class130.field3186.method54(class23.field710, class70.field1751, class46.field1202, class53.field1403, class4.field185, var3);
        class130.field3186.method61();
        class72.method674((byte) -28);
        class60.method581((byte) -67);
        ((class75) class27.field772).method700((byte) 6, class9.field322);
        class107.method894(-15454);
        if (class39.field1070 && method617((byte) -41, false, true) == 0) {
            class39.field1070 = false;
        }
        if (class39.field1070) {
            class131.method1031((byte) -125);
            class111.method923();
            class103.method875(0, class133.field3255, false, null);
        }
        class2.method45(110);
        class23.field710 = var4;
        class46.field1202 = var8;
        class4.field185 = var5;
        class53.field1403 = var7;
        class70.field1751 = var6;
        if (arg0 >= -98) {
            method604(-36, 10, 23, 0, 3, -27);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V", line = 168)
    public static final void method603(byte arg0) {
        field1576++;
        class80.field2030 = 0;
        class31.field842 = 0;
        class80.method731(true);
        class66.method636((byte) -5);
        class74.method691((byte) 108);
        class97.method840(-1);
        for (int var1 = 0; var1 < class31.field842; var1++) {
            int var3 = class11.field376[var1];
            if (class82.field2066 != class80.field2033[var3].field2011) {
                class80.field2033[var3] = null;
            }
        }
        if (class100.field2550 != class15.field489.field268) {
            throw new RuntimeException("gpp1 pos:" + class15.field489.field268 + " psize:" + class100.field2550);
        }
        int var2 = 0;
        if (arg0 < 50) {
            field1586 = null;
        }
        while (class118.field2942 > var2) {
            if (class80.field2033[class112.field2761[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class118.field2942);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V", line = 216)
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg4 - 32) * arg4 / arg2;
        class11.field366[arg0].method330(arg3, arg5);
        class11.field366[1].method330(arg3, arg5 + arg4 - 16);
        field1589++;
        class111.method916(arg3, arg5 + 16, 16, arg4 - 32, class108.field2718);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg1 / (arg2 - arg4);
        class111.method916(arg3, arg5 + var7 + 16, 16, var6, class15.field496);
        class111.method928(arg3, arg5 + var7 + 16, var6, class132.field3229);
        class111.method928(arg3 + 1, arg5 + var7 + 16, var6, class132.field3229);
        class111.method919(arg3, arg5 + var7 + 16, 16, class132.field3229);
        class111.method919(arg3, arg5 + var7 + 17, 16, class132.field3229);
        class111.method928(arg3 + 15, arg5 - -16 - -var7, var6, class109.field2737);
        class111.method928(arg3 + 14, var7 + 17 + arg5, var6 - 1, class109.field2737);
        class111.method919(arg3, arg5 + var7 + var6 + 15, 16, class109.field2737);
        class111.method919(arg3 + 1, arg5 - -var7 + var6 + 14, 15, class109.field2737);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 243)
    public static void method605(int arg0) {
        field1579 = null;
        if (arg0 != -333) {
            return;
        }
        field1581 = null;
        field1594 = null;
        field1586 = null;
        field1570 = null;
        field1585 = null;
        field1584 = null;
        field1600 = null;
        field1597 = null;
        field1598 = null;
        field1596 = null;
        field1575 = null;
        field1569 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lbd;ILbd;)V", line = 265)
    public static final void method606(class11 arg0, int arg1, class11 arg2) {
        class113.field2802 = arg2;
        field1582++;
        class133.field3247 = arg0;
        if (arg1 != -10978) {
            method614(-3);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 277)
    public static final void method607(int arg0, int arg1) {
        field1599++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class37.field995[arg1];
        int var3 = class117.field2928[arg1];
        int var4 = class79.field1935[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class72.field1773[arg1];
        if (class114.field2814 != 0 && var4 != 1005) {
            class114.field2814 = 0;
            class105.field2640 = true;
        }
        if (var4 == 37) {
            class72.field1776++;
            class70.field1729.method416(11453, 21);
            class70.field1729.method171(class118.field2952, 71);
            class70.field1729.method180(-2030879560, var3);
            class70.field1729.method151(var5, -126);
            class70.field1729.method151(var2, -121);
            class19.field657 = 2;
            class105.field2652 = var2;
            class43.field1155 = 0;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            class67.field1682 = var3;
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 38) {
            boolean var6 = class60.method579(0, 0, class104.field2624.field1965[0], var2, (byte) 105, 0, false, 0, 0, class104.field2624.field2012[0], var3, 2);
            class134.field3292++;
            if (!var6) {
                class60.method579(1, 0, class104.field2624.field1965[0], var2, (byte) 92, 0, false, 0, 1, class104.field2624.field2012[0], var3, 2);
            }
            class34.field895 = 0;
            class16.field524 = class1.field14;
            class119.field2970 = class112.field2765;
            class92.field2298 = 2;
            class70.field1729.method416(11453, 190);
            class70.field1729.method155(var2 + class28.field807, -114);
            class70.field1729.method151(var5, -128);
            class70.field1729.method151(class53.field1411 + var3, -122);
        }
        if (var4 == 1004) {
            class16.field524 = class1.field14;
            class67.field1685++;
            class119.field2970 = class112.field2765;
            class92.field2298 = 2;
            class34.field895 = 0;
            class70.field1729.method416(11453, 148);
            class70.field1729.method163(14912, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 27) {
            class47.method493(var2, var5, (byte) -79, var3);
            class70.field1729.method416(11453, 229);
            class57.field1470++;
            class70.field1729.method163(14912, class28.field807 + var2);
            class70.field1729.method163(14912, var5 >> 14 & 0x7FFF);
            class70.field1729.method163(14912, class53.field1411 + var3);
        }
        if (var4 == 1) {
            class2 var8 = class80.field2033[var5];
            if (var8 != null) {
                class35.field931++;
                class60.method579(1, 0, class104.field2624.field1965[0], var8.field1965[0], (byte) 112, 0, false, 0, 1, class104.field2624.field2012[0], var8.field2012[0], 2);
                class119.field2970 = class112.field2765;
                class34.field895 = 0;
                class92.field2298 = 2;
                class16.field524 = class1.field14;
                class70.field1729.method416(11453, 221);
                class70.field1729.method164(class118.field2952, (byte) 109);
                class70.field1729.method163(14912, var5);
            }
        }
        if (var4 == 26 || var4 == 46) {
            class1 var9 = class102.field2589[arg1];
            int var10 = var9.method11(class53.field1396, 32);
            if (var10 != -1) {
                class1 var11 = var9.method1((byte) 95, var10 + 5).method40(false);
                class1 var12 = var11.method13(57).method36(-4305);
                boolean var13 = false;
                for (int var14 = 0; var14 < class118.field2942; var14++) {
                    class2 var15 = class80.field2033[class112.field2761[var14]];
                    if (var15 != null && var15.field87 != null && var15.field87.method14(var12, true)) {
                        var13 = true;
                        class60.method579(1, 0, class104.field2624.field1965[0], var15.field1965[0], (byte) 114, 0, false, 0, 1, class104.field2624.field2012[0], var15.field2012[0], 2);
                        if (var4 == 26) {
                            class70.field1729.method416(11453, 96);
                            class70.field1729.method170(class112.field2761[var14], -128);
                            class66.field1655++;
                        }
                        if (var4 == 46) {
                            class70.field1729.method416(11453, 68);
                            class70.field1729.method163(14912, class112.field2761[var14]);
                            class105.field2646++;
                        }
                        break;
                    }
                }
                if (!var13) {
                    class89.method761(90, 0, class116.method959(-46, new class1[] { class23.field719, var12 }), class132.field3237);
                }
            }
        }
        if (var4 == 55) {
            class70.field1729.method416(11453, 26);
            class70.field1729.method170(var2, -128);
            class70.field1729.method171(var3, 91);
            class31.field828++;
            class70.field1729.method170(var5, -128);
            class67.field1682 = var3;
            class43.field1155 = 0;
            class105.field2652 = var2;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 53) {
            class70.field1729.method416(11453, 38);
            class100.field2443++;
            class70.field1729.method170(var5, -128);
            class70.field1729.method163(14912, var2);
            class70.field1729.method164(var3, (byte) 108);
            class105.field2652 = var2;
            class19.field657 = 2;
            class43.field1155 = 0;
            class67.field1682 = var3;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 57) {
            class70.field1729.method416(11453, 64);
            class121.field3025++;
            class70.field1729.method183(75, var3);
            class100 var16 = class134.method1056(var3, (byte) -93);
            if (var16.field2557 != null && var16.field2557[0][0] == 5) {
                int var17 = var16.field2557[0][1];
                if (class113.field2806[var17] != var16.field2502[0]) {
                    class113.field2806[var17] = var16.field2502[0];
                    class45.method478(-1, var17);
                    class39.field1056 = true;
                }
            }
        }
        if (var4 == 52) {
            class70.field1729.method416(11453, 240);
            client.field581++;
            class70.field1729.method155(var2, -29);
            class70.field1729.method163(14912, var5);
            class70.field1729.method180(-2030879560, var3);
            class105.field2652 = var2;
            class67.field1682 = var3;
            class43.field1155 = 0;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 10) {
            class2 var18 = class80.field2033[var5];
            if (var18 != null) {
                class60.method579(1, 0, class104.field2624.field1965[0], var18.field1965[0], (byte) 109, 0, false, 0, 1, class104.field2624.field2012[0], var18.field2012[0], 2);
                class119.field2970 = class112.field2765;
                class105.field2646++;
                class92.field2298 = 2;
                class16.field524 = class1.field14;
                class34.field895 = 0;
                class70.field1729.method416(11453, 68);
                class70.field1729.method163(14912, var5);
            }
        }
        if (var4 == 14) {
            class2 var19 = class80.field2033[var5];
            if (var19 != null) {
                class66.field1655++;
                class60.method579(1, 0, class104.field2624.field1965[0], var19.field1965[0], (byte) 92, 0, false, 0, 1, class104.field2624.field2012[0], var19.field2012[0], 2);
                class34.field895 = 0;
                class92.field2298 = 2;
                class16.field524 = class1.field14;
                class119.field2970 = class112.field2765;
                class70.field1729.method416(11453, 96);
                class70.field1729.method170(var5, -128);
            }
        }
        if (var4 == 1001) {
            class119.field2970 = class112.field2765;
            class92.field2298 = 2;
            class16.field524 = class1.field14;
            class34.field895 = 0;
            class130 var20 = class120.field2995[var5];
            if (var20 != null) {
                class42 var21 = var20.field3185;
                if (var21.field1137 != null) {
                    var21 = var21.method458(-1);
                }
                if (var21 != null) {
                    class70.field1729.method416(11453, 247);
                    class70.field1729.method155(var21.field1138, -26);
                    client.field606++;
                }
            }
        }
        if (var4 == 22) {
            class2 var22 = class80.field2033[var5];
            if (var22 != null) {
                class60.method579(1, 0, class104.field2624.field1965[0], var22.field1965[0], (byte) 94, 0, false, 0, 1, class104.field2624.field2012[0], var22.field2012[0], 2);
                class119.field2970 = class112.field2765;
                class46.field1207++;
                class92.field2298 = 2;
                class16.field524 = class1.field14;
                class34.field895 = 0;
                class70.field1729.method416(11453, 110);
                class70.field1729.method155(var5, -70);
                class70.field1729.method164(class39.field1076, (byte) 115);
                class70.field1729.method151(class99.field2440, 18);
                class70.field1729.method151(class92.field2284, -127);
            }
        }
        if (var4 == 19) {
            class99.field2440 = var5;
            class92.field2284 = var2;
            class39.field1076 = var3;
            class14.field476 = 1;
            class130.field3180 = class116.method959(78, new class1[] { class93.field2337, class89.method763(var5, 10).field2830, class53.field1396 });
            client.field595 = 0;
            if (class130.field3180 == null) {
                class130.field3180 = class64.field1634;
            }
            class39.field1056 = true;
            return;
        }
        if (var4 == 15) {
            class54.field1416++;
            boolean var23 = class60.method579(0, 0, class104.field2624.field1965[0], var2, (byte) 102, 0, false, 0, 0, class104.field2624.field2012[0], var3, 2);
            if (!var23) {
                class60.method579(1, 0, class104.field2624.field1965[0], var2, (byte) 117, 0, false, 0, 1, class104.field2624.field2012[0], var3, 2);
            }
            class34.field895 = 0;
            class92.field2298 = 2;
            class16.field524 = class1.field14;
            class119.field2970 = class112.field2765;
            class70.field1729.method416(11453, 168);
            class70.field1729.method163(14912, var5);
            class70.field1729.method170(class28.field807 + var2, -128);
            class70.field1729.method164(class118.field2952, (byte) 108);
            class70.field1729.method151(class53.field1411 + var3, 124);
        }
        if (var4 == 23) {
            class121.field3025++;
            class70.field1729.method416(11453, 64);
            class70.field1729.method183(40, var3);
            class100 var25 = class134.method1056(var3, (byte) -68);
            if (var25.field2557 != null && var25.field2557[0][0] == 5) {
                int var26 = var25.field2557[0][1];
                class113.field2806[var26] = 1 - class113.field2806[var26];
                class45.method478(-1, var26);
                class39.field1056 = true;
            }
        }
        if (var4 == 48) {
            class70.field1729.method416(11453, 147);
            class70.field1729.method170(var5, -128);
            class70.field1729.method163(14912, var2);
            class70.field1729.method171(var3, 107);
            class19.field657 = 2;
            class105.field2652 = var2;
            class67.field1682 = var3;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
            class130.field3195++;
            class43.field1155 = 0;
        }
        if (var4 == 18) {
            class1 var27 = class102.field2589[arg1];
            int var28 = var27.method11(class53.field1396, 32);
            if (var28 != -1) {
                long var29 = var27.method1((byte) 95, var28 + 5).method40(false).method9((byte) 107);
                int var31 = -1;
                for (int var32 = 0; var32 < class59.field1495; var32++) {
                    if (class117.field2932[var32] == var29) {
                        var31 = var32;
                        break;
                    }
                }
                if (var31 != -1 && class73.field1791[var31] > 0) {
                    class78.field1927 = 3;
                    class105.field2640 = true;
                    class114.field2814 = 0;
                    class132.field3235 = class132.field3237;
                    class37.field1002 = true;
                    class36.field959 = class117.field2932[var31];
                    class132.field3233 = class116.method959(58, new class1[] { class75.field1876, class119.field2954[var31] });
                }
            }
        }
        if (var4 == 1003) {
            class34.field895 = 0;
            class92.field2298 = 2;
            class16.field524 = class1.field14;
            class46.field1194++;
            class119.field2970 = class112.field2765;
            class70.field1729.method416(11453, 151);
            class70.field1729.method155(var5, -48);
        }
        if (var4 == 1002) {
            class47.method493(var2, var5, (byte) -11, var3);
            class44.field1167++;
            class70.field1729.method416(11453, 62);
            class70.field1729.method151(var5 >> 14 & 0x7FFF, 39);
            class70.field1729.method163(14912, var3 + class53.field1411);
            class70.field1729.method155(class28.field807 + var2, -48);
        }
        if (var4 == 30) {
            class130 var33 = class120.field2995[var5];
            if (var33 != null) {
                class127.field3122++;
                class60.method579(1, 0, class104.field2624.field1965[0], var33.field1965[0], (byte) 107, 0, false, 0, 1, class104.field2624.field2012[0], var33.field2012[0], 2);
                class34.field895 = 0;
                class119.field2970 = class112.field2765;
                class16.field524 = class1.field14;
                class92.field2298 = 2;
                class70.field1729.method416(11453, 57);
                class70.field1729.method151(var5, 89);
            }
        }
        if (var4 == 49) {
            class130 var34 = class120.field2995[var5];
            if (var34 != null) {
                class60.method579(1, 0, class104.field2624.field1965[0], var34.field1965[0], (byte) 112, 0, false, 0, 1, class104.field2624.field2012[0], var34.field2012[0], 2);
                class75.field1849++;
                class119.field2970 = class112.field2765;
                class16.field524 = class1.field14;
                class34.field895 = 0;
                class92.field2298 = 2;
                class70.field1729.method416(11453, 208);
                class70.field1729.method170(var5, -128);
                class70.field1729.method170(class99.field2440, -128);
                class70.field1729.method155(class92.field2284, -109);
                class70.field1729.method183(113, class39.field1076);
            }
        }
        if (var4 == 29) {
            class47.method493(var2, var5, (byte) -77, var3);
            class70.field1729.method416(11453, 164);
            class70.field1729.method155(class28.field807 + var2, -86);
            class46.field1214++;
            class70.field1729.method155(class53.field1411 + var3, -59);
            class70.field1729.method155(var5 >> 14 & 0x7FFF, -62);
        }
        if (var4 == 5 && class47.method493(var2, var5, (byte) -104, var3)) {
            class44.field1163++;
            class70.field1729.method416(11453, 24);
            class70.field1729.method155(class53.field1411 + var3, -81);
            class70.field1729.method170(class99.field2440, -128);
            class70.field1729.method163(14912, var5 >> 14 & 0x7FFF);
            class70.field1729.method155(class92.field2284, -58);
            class70.field1729.method164(class39.field1076, (byte) 115);
            class70.field1729.method155(class28.field807 + var2, -26);
        }
        if (var4 == 34) {
            class130 var35 = class120.field2995[var5];
            if (var35 != null) {
                class92.field2283++;
                class60.method579(1, 0, class104.field2624.field1965[0], var35.field1965[0], (byte) 126, 0, false, 0, 1, class104.field2624.field2012[0], var35.field2012[0], 2);
                class34.field895 = 0;
                class92.field2298 = 2;
                class119.field2970 = class112.field2765;
                class16.field524 = class1.field14;
                class70.field1729.method416(11453, 0);
                class70.field1729.method170(var5, -128);
            }
        }
        if (var4 == 56) {
            class70.field1729.method416(11453, 40);
            class70.field1729.method155(var5, -52);
            class74.field1796++;
            class70.field1729.method155(var2, -112);
            class70.field1729.method171(var3, 121);
            class70.field1729.method171(class39.field1076, 73);
            class70.field1729.method163(14912, class99.field2440);
            class70.field1729.method170(class92.field2284, -128);
            class67.field1682 = var3;
            class43.field1155 = 0;
            class105.field2652 = var2;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 33) {
            class100 var36 = class134.method1056(var3, (byte) -105);
            class39.field1056 = true;
            client.field595 = 1;
            class60.field1526 = var36.field2473;
            class115.field2849 = var36.field2511;
            class14.field476 = 0;
            class118.field2952 = var3;
            class52.field1387 = class116.method959(-80, new class1[] { class102.field2567, var36.field2518, class53.field1396 });
            if (class115.field2849 == 16) {
                class95.field2367 = true;
                class9.field331 = 3;
                class39.field1056 = true;
            }
            return;
        }
        if (var4 == 1007) {
            class100 var37 = class134.method1056(var3, (byte) -59);
            if (var37 != null && var37.field2522 != null && var2 != -1) {
                var37 = var37.field2522[var2];
            }
            if (var37 == null || var37.field2543 < 100000) {
                class70.field1729.method416(11453, 151);
                class70.field1729.method155(var5, -69);
                class46.field1194++;
            } else {
                class89.method761(83, 0, class116.method959(127, new class1[] { class48.method504(var37.field2543, -1), class131.field3206, class89.method763(var5, 10).field2830 }), class132.field3237);
            }
        }
        if (var4 == 42) {
            class100 var38 = class134.method1056(var3, (byte) -62);
            boolean var39 = true;
            if (var38.field2448 > 0) {
                var39 = class9.method191((byte) 88, var38);
            }
            if (var39) {
                class70.field1729.method416(11453, 64);
                class70.field1729.method183(127, var3);
                class121.field3025++;
            }
        }
        if (var4 == 31) {
            class70.field1729.method416(11453, 163);
            class105.field2655++;
            class70.field1729.method155(var2, -96);
            class70.field1729.method155(var5, -42);
            class70.field1729.method183(89, var3);
            class105.field2652 = var2;
            class19.field657 = 2;
            class67.field1682 = var3;
            class43.field1155 = 0;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 12) {
            class130 var40 = class120.field2995[var5];
            if (var40 != null) {
                class60.method579(1, 0, class104.field2624.field1965[0], var40.field1965[0], (byte) 113, 0, false, 0, 1, class104.field2624.field2012[0], var40.field2012[0], 2);
                class119.field2970 = class112.field2765;
                class16.field524 = class1.field14;
                class35.field945++;
                class34.field895 = 0;
                class92.field2298 = 2;
                class70.field1729.method416(11453, 63);
                class70.field1729.method155(var5, -18);
            }
        }
        if (var4 == 2) {
            class59.field1496++;
            boolean var41 = class60.method579(0, 0, class104.field2624.field1965[0], var2, (byte) 108, 0, false, 0, 0, class104.field2624.field2012[0], var3, 2);
            if (!var41) {
                class60.method579(1, 0, class104.field2624.field1965[0], var2, (byte) 114, 0, false, 0, 1, class104.field2624.field2012[0], var3, 2);
            }
            class92.field2298 = 2;
            class34.field895 = 0;
            class119.field2970 = class112.field2765;
            class16.field524 = class1.field14;
            class70.field1729.method416(11453, 244);
            class70.field1729.method163(14912, var2 + class28.field807);
            class70.field1729.method170(class53.field1411 + var3, -128);
            class70.field1729.method151(var5, 13);
        }
        if (var4 == 3) {
            boolean var43 = class60.method579(0, 0, class104.field2624.field1965[0], var2, (byte) 117, 0, false, 0, 0, class104.field2624.field2012[0], var3, 2);
            if (!var43) {
                class60.method579(1, 0, class104.field2624.field1965[0], var2, (byte) 100, 0, false, 0, 1, class104.field2624.field2012[0], var3, 2);
            }
            class34.field895 = 0;
            class119.field2970 = class112.field2765;
            class120.field2974++;
            class92.field2298 = 2;
            class16.field524 = class1.field14;
            class70.field1729.method416(11453, 85);
            class70.field1729.method170(class53.field1411 + var3, -128);
            class70.field1729.method170(var5, -128);
            class70.field1729.method163(14912, class28.field807 + var2);
        }
        if (var4 == 21) {
            class130 var45 = class120.field2995[var5];
            if (var45 != null) {
                class16.field517++;
                class60.method579(1, 0, class104.field2624.field1965[0], var45.field1965[0], (byte) 112, 0, false, 0, 1, class104.field2624.field2012[0], var45.field2012[0], 2);
                class119.field2970 = class112.field2765;
                class16.field524 = class1.field14;
                class34.field895 = 0;
                class92.field2298 = 2;
                class70.field1729.method416(11453, 253);
                class70.field1729.method151(var5, -128);
                class70.field1729.method164(class118.field2952, (byte) 96);
            }
        }
        if (var4 == 45 || var4 == 51 || var4 == 13 || var4 == 35) {
            class1 var46 = class102.field2589[arg1];
            int var47 = var46.method11(class53.field1396, 32);
            if (var47 != -1) {
                long var48 = var46.method1((byte) 95, var47 + 5).method40(false).method9((byte) 96);
                if (var4 == 45) {
                    class76.method706(var48, (byte) -104);
                }
                if (var4 == 51) {
                    class31.method384(24686, var48);
                }
                if (var4 == 13) {
                    class64.method627(var48, 121);
                }
                if (var4 == 35) {
                    class57.method547(0, var48);
                }
            }
        }
        if (var4 == 44) {
            class2 var50 = class80.field2033[var5];
            if (var50 != null) {
                class103.field2594++;
                class60.method579(1, 0, class104.field2624.field1965[0], var50.field1965[0], (byte) 94, 0, false, 0, 1, class104.field2624.field2012[0], var50.field2012[0], 2);
                class92.field2298 = 2;
                class34.field895 = 0;
                class119.field2970 = class112.field2765;
                class16.field524 = class1.field14;
                class70.field1729.method416(11453, 220);
                class70.field1729.method151(var5, -121);
            }
        }
        if (arg0 < 51) {
            field1581 = null;
        }
        if (var4 == 7) {
            if (class6.field225) {
                class130.field3186.method77(var2 - 4, var3 + -4);
            } else {
                class130.field3186.method77(class112.field2765 - 4, class1.field14 + -4);
            }
        }
        if (var4 == 1006) {
            class100 var51 = class134.method1056(var3, (byte) -111);
            if (var51 == null || var51.field2519[var2] < 100000) {
                class46.field1194++;
                class70.field1729.method416(11453, 151);
                class70.field1729.method155(var5, -73);
            } else {
                class89.method761(103, 0, class116.method959(-49, new class1[] { class48.method504(var51.field2519[var2], -1), class131.field3206, class89.method763(var5, 10).field2830 }), class132.field3237);
            }
            class105.field2652 = var2;
            class43.field1155 = 0;
            class67.field1682 = var3;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 17) {
            class47.method493(var2, var5, (byte) -104, var3);
            class42.field1101++;
            class70.field1729.method416(11453, 183);
            class70.field1729.method170(var3 + class53.field1411, -128);
            class70.field1729.method151(var5 >> 14 & 0x7FFF, -126);
            class70.field1729.method170(var2 + class28.field807, -128);
        }
        if (var4 == 50) {
            class72.method676(var2, var5, var3, -121);
        }
        if (var4 == 40) {
            class108.method898(class98.field2424, -14222);
            class98.field2424 = -1;
            class105.field2640 = true;
        }
        if (var4 == 32 && class47.method493(var2, var5, (byte) -27, var3)) {
            class70.field1729.method416(11453, 225);
            class70.field1729.method151(var5 >> 14 & 0x7FFF, 74);
            class70.field1729.method155(var3 + class53.field1411, -61);
            class8.field269++;
            class70.field1729.method164(class118.field2952, (byte) 118);
            class70.field1729.method163(14912, class28.field807 + var2);
        }
        if (var4 == 25) {
            class93.field2330++;
            class70.field1729.method416(11453, 228);
            class70.field1729.method163(14912, var5);
            class70.field1729.method171(var3, 100);
            class70.field1729.method163(14912, var2);
            class43.field1155 = 0;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
            class67.field1682 = var3;
            class105.field2652 = var2;
        }
        if (var4 == 11) {
            class49.field1335++;
            class70.field1729.method416(11453, 29);
            class70.field1729.method164(var3, (byte) 116);
            class70.field1729.method170(var2, -128);
            class70.field1729.method163(14912, var5);
            class105.field2652 = var2;
            class67.field1682 = var3;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
            class43.field1155 = 0;
        }
        if (var4 == 41) {
            class2 var52 = class80.field2033[var5];
            if (var52 != null) {
                class60.method579(1, 0, class104.field2624.field1965[0], var52.field1965[0], (byte) 117, 0, false, 0, 1, class104.field2624.field2012[0], var52.field2012[0], 2);
                class92.field2298 = 2;
                class16.field524 = class1.field14;
                class119.field2970 = class112.field2765;
                class34.field895 = 0;
                class70.field1729.method416(11453, 187);
                class70.field1729.method155(var5, -72);
                class86.field2157++;
            }
        }
        if (var4 == 28) {
            class1 var53 = class102.field2589[arg1];
            int var54 = var53.method11(class53.field1396, 32);
            if (var54 != -1) {
                if (class132.field3230 == -1) {
                    class36.method414(95);
                    if (class74.field1847 != -1) {
                        class132.field3220 = var53.method1((byte) 95, var54 + 5).method40(false);
                        class132.field3218 = class132.field3230 = class74.field1847;
                        class133.field3271 = false;
                    }
                } else {
                    class89.method761(72, 0, class78.field1924, class132.field3237);
                }
            }
        }
        if (var4 == 8) {
            boolean var55 = class60.method579(0, 0, class104.field2624.field1965[0], var2, (byte) 119, 0, false, 0, 0, class104.field2624.field2012[0], var3, 2);
            class53.field1401++;
            if (!var55) {
                class60.method579(1, 0, class104.field2624.field1965[0], var2, (byte) 118, 0, false, 0, 1, class104.field2624.field2012[0], var3, 2);
            }
            class119.field2970 = class112.field2765;
            class34.field895 = 0;
            class92.field2298 = 2;
            class16.field524 = class1.field14;
            class70.field1729.method416(11453, 65);
            class70.field1729.method170(var5, -128);
            class70.field1729.method170(var3 + class53.field1411, -128);
            class70.field1729.method163(14912, class28.field807 + var2);
        }
        if (var4 == 9) {
            class36.method414(106);
        }
        if (var4 == 54 && class120.field3001 == -1) {
            class36.method415(0, var3, -9225);
            class120.field3001 = var3;
        }
        if (var4 == 43) {
            class70.field1729.method416(11453, 98);
            class50.field1348++;
            class70.field1729.method151(var2, -123);
            class70.field1729.method164(var3, (byte) 103);
            class70.field1729.method151(var5, 100);
            class43.field1155 = 0;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            class105.field2652 = var2;
            class67.field1682 = var3;
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 36) {
            class36.field961++;
            boolean var57 = class60.method579(0, 0, class104.field2624.field1965[0], var2, (byte) 126, 0, false, 0, 0, class104.field2624.field2012[0], var3, 2);
            if (!var57) {
                class60.method579(1, 0, class104.field2624.field1965[0], var2, (byte) 105, 0, false, 0, 1, class104.field2624.field2012[0], var3, 2);
            }
            class16.field524 = class1.field14;
            class92.field2298 = 2;
            class34.field895 = 0;
            class119.field2970 = class112.field2765;
            class70.field1729.method416(11453, 27);
            class70.field1729.method151(class28.field807 + var2, -124);
            class70.field1729.method170(var5, -128);
            class70.field1729.method170(class53.field1411 + var3, -128);
        }
        if (var4 == 39) {
            class2 var59 = class80.field2033[var5];
            if (var59 != null) {
                class102.field2569++;
                class60.method579(1, 0, class104.field2624.field1965[0], var59.field1965[0], (byte) 97, 0, false, 0, 1, class104.field2624.field2012[0], var59.field2012[0], 2);
                class34.field895 = 0;
                class119.field2970 = class112.field2765;
                class92.field2298 = 2;
                class16.field524 = class1.field14;
                class70.field1729.method416(11453, 211);
                class70.field1729.method163(14912, var5);
            }
        }
        if (var4 == 24) {
            class106.field2669++;
            class70.field1729.method416(11453, 124);
            class70.field1729.method151(var2, -123);
            class70.field1729.method171(var3, 81);
            class70.field1729.method151(var5, -126);
            class67.field1682 = var3;
            class43.field1155 = 0;
            class105.field2652 = var2;
            class19.field657 = 2;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 16) {
            class108.field2709++;
            class47.method493(var2, var5, (byte) -47, var3);
            class70.field1729.method416(11453, 30);
            class70.field1729.method170(var5 >> 14 & 0x7FFF, -128);
            class70.field1729.method170(class53.field1411 + var3, -128);
            class70.field1729.method155(class28.field807 + var2, -128);
        }
        if (var4 == 20) {
            class130 var60 = class120.field2995[var5];
            if (var60 != null) {
                class60.method579(1, 0, class104.field2624.field1965[0], var60.field1965[0], (byte) 122, 0, false, 0, 1, class104.field2624.field2012[0], var60.field2012[0], 2);
                class92.field2298 = 2;
                class119.field2970 = class112.field2765;
                class16.field524 = class1.field14;
                class34.field895 = 0;
                class70.field1729.method416(11453, 153);
                class50.field1358++;
                class70.field1729.method163(14912, var5);
            }
        }
        if (var4 == 47) {
            class47.field1237++;
            boolean var61 = class60.method579(0, 0, class104.field2624.field1965[0], var2, (byte) 120, 0, false, 0, 0, class104.field2624.field2012[0], var3, 2);
            if (!var61) {
                class60.method579(1, 0, class104.field2624.field1965[0], var2, (byte) 103, 0, false, 0, 1, class104.field2624.field2012[0], var3, 2);
            }
            class119.field2970 = class112.field2765;
            class16.field524 = class1.field14;
            class34.field895 = 0;
            class92.field2298 = 2;
            class70.field1729.method416(11453, 172);
            class70.field1729.method170(class28.field807 + var2, -128);
            class70.field1729.method151(class92.field2284, -128);
            class70.field1729.method170(var5, -128);
            class70.field1729.method180(-2030879560, class39.field1076);
            class70.field1729.method163(14912, class53.field1411 + var3);
            class70.field1729.method163(14912, class99.field2440);
        }
        if (var4 == 6) {
            class70.field1729.method416(11453, 102);
            class70.field1729.method171(var3, 112);
            class70.field1729.method155(var2, -46);
            class70.field1729.method151(var5, 24);
            class22.field696++;
            class105.field2652 = var2;
            class43.field1155 = 0;
            class19.field657 = 2;
            class67.field1682 = var3;
            if (var3 >> 16 == class132.field3230) {
                class19.field657 = 1;
            }
            if (var3 >> 16 == class86.field2169) {
                class19.field657 = 3;
            }
        }
        if (var4 == 4) {
            class130 var63 = class120.field2995[var5];
            if (var63 != null) {
                class119.field2955++;
                class60.method579(1, 0, class104.field2624.field1965[0], var63.field1965[0], (byte) 98, 0, false, 0, 1, class104.field2624.field2012[0], var63.field2012[0], 2);
                class92.field2298 = 2;
                class119.field2970 = class112.field2765;
                class34.field895 = 0;
                class16.field524 = class1.field14;
                class70.field1729.method416(11453, 116);
                class70.field1729.method163(14912, var5);
            }
        }
        if (class14.field476 != 0) {
            class14.field476 = 0;
            class39.field1056 = true;
        }
        if (client.field595 != 0) {
            class39.field1056 = true;
            client.field595 = 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(La;La;Lbd;B)Le;", line = 1459)
    public static final class25 method608(class1 arg0, class1 arg1, class11 arg2, byte arg3) {
        field1577++;
        if (arg3 != -64) {
            field1584 = null;
        }
        int var4 = arg2.method229(0, arg0);
        int var5 = arg2.method225(arg3 ^ 0xFFFFFF81, var4, arg1);
        return method612(arg2, (byte) -42, var5, var4);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIIIIII)V", line = 1481)
    public static final void method609(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1591++;
        if (!class134.method1055(arg4, arg0 + 2)) {
            return;
        }
        if (arg0 != 125) {
            method604(-24, -60, 59, -118, 65, 12);
        }
        class64.method621(arg5, arg3, 0, arg2, arg6, -1, 1, class117.field2925[arg4], arg1, 0);
        if (class17.field549 == null) {
            return;
        }
        class100 var7 = class17.field549;
        class100 var8 = class127.method1012(-1598852880, var7);
        if (var8 == null) {
            return;
        }
        int[] var9 = class24.method326(var8, (byte) 97);
        int[] var10 = class24.method326(var7, (byte) 110);
        int var11 = var10[1] + class102.field2571 - var9[1] - class97.field2395;
        int var12 = var10[0] + class24.field742 - var9[0] - class12.field420;
        if (var11 < 0) {
            var11 = 0;
        }
        if (var8.field2452 < var7.field2452 + var11) {
            var11 = var8.field2452 - var7.field2452;
        }
        if (var12 < 0) {
            var12 = 0;
        }
        if (var8.field2501 < var7.field2501 + var12) {
            var12 = var8.field2501 - var7.field2501;
        }
        if (class17.field549.field2478 != null && (arg2 & 0x200) != 0) {
            class86.method757(var7.field2478, 0, var11, var7, var12, false);
        }
        if (class28.field802 != 0 || (arg2 & 0x400) == 0) {
            return;
        }
        if (class17.field549.field2504 != null) {
            class86.method757(var7.field2504, 0, var11, var7, var12, false);
        }
        class17.field549 = null;
        return;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([Lqd;IZIIIII)Lqd;", line = 1556)
    public static final class100 method610(class100[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1572++;
        if (arg0 == null) {
            return null;
        }
        class100 var8 = null;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null && var10.field2457 == arg4) {
                int var11 = var10.field2505 + arg3;
                int var12 = var10.field2465 + arg5;
                if (var12 <= arg6 && var11 <= arg1 && var10.field2501 + var12 > arg6 && arg1 < var11 + var10.field2452 && !var10.field2559) {
                    if (var10.field2498 < 0 && arg2 || var10.field2498 >= 0 && !arg2) {
                        var8 = var10;
                    }
                    if (var10.field2492 == 0) {
                        class100 var13 = method610(arg0, arg1, arg2, var10.field2505 - var10.field2540, var9, var10.field2465 - var10.field2555, arg6, 398);
                        if (var13 != null) {
                            var8 = var13;
                        }
                        if (arg2 && var10.field2522 != null) {
                            class100 var14 = method610(var10.field2522, arg1, arg2, var10.field2505 - var10.field2540, var10.field2498, var10.field2465 - var10.field2555, arg6, 398);
                            if (var14 != null) {
                                var8 = var14;
                            }
                        }
                    }
                }
            }
        }
        if (arg7 != 398) {
            field1597 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lhb;", line = 1631)
    public final class44 method611(int arg0) {
        if (arg0 >= -73) {
            field1570 = null;
        }
        field1568++;
        class44 var2 = this.field1592.field1160;
        return this.field1592 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lbd;BII)Le;", line = 1658)
    private static final class25 method612(class11 arg0, byte arg1, int arg2, int arg3) {
        int var4 = 106 % ((arg1 - 66) / 53);
        field1587++;
        return class105.method888(arg2, arg3, arg0, -3844) ? class44.method469(0) : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZ)V", line = 1671)
    public static final void method613(byte arg0, boolean arg1) {
        if (arg0 != -34) {
            method617((byte) 123, true, false);
        }
        class45.field1181++;
        field1595++;
        if (class45.field1181 < 50 && !arg1) {
            return;
        }
        class45.field1181 = 0;
        if (class78.field1922 || class57.field1453 == null) {
            return;
        }
        class70.field1729.method416(arg0 + 11487, 13);
        try {
            class57.field1453.method1019(class70.field1729.field268, (byte) -19, 0, class70.field1729.field285);
            class70.field1729.field268 = 0;
        } catch (IOException var2) {
            class78.field1922 = true;
        }
        class99.field2428++;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V", line = 1704)
    public static final void method614(int arg0) {
        field1578++;
        if (class97.field2405) {
            class97.field2405 = false;
            class115.method946(arg0 ^ 0xFFFFB1D6);
            class95.field2367 = true;
            class105.field2640 = true;
            class39.field1056 = true;
            class15.field505 = true;
        }
        method602((byte) -114);
        if (class6.field225 && class19.field641 == 1) {
            class39.field1056 = true;
        }
        if (class66.field1651 != -1) {
            boolean var1 = class128.method1015(29378, class66.field1651);
            if (var1) {
                class39.field1056 = true;
            }
        }
        if (class19.field657 == 2) {
            class39.field1056 = true;
        }
        if (class32.field858 == 2) {
            class39.field1056 = true;
        }
        if (class39.field1056) {
            class39.field1056 = false;
            class86.method758(-29);
        }
        if (class86.field2169 == -1) {
            class23.field705.field2540 = class122.field3055 - class49.field1342 - 77;
            if (class24.field742 > 448 && class24.field742 < 560 && class102.field2571 > 332) {
                class9.method193(77, class102.field2571 - 357, class24.field742 + -17, class122.field3055, (byte) 114, class23.field705, 463, -1, 0);
            }
            int var2 = class122.field3055 - class23.field705.field2540 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class122.field3055 - 77) {
                var2 = class122.field3055 - 77;
            }
            if (class49.field1342 != var2) {
                class49.field1342 = var2;
                class105.field2640 = true;
            }
        }
        if (class86.field2169 == -1 && class114.field2814 == 3) {
            class23.field705.field2540 = class53.field1393;
            int var3 = class93.field2333 * 14 + 7;
            if (class24.field742 > 448 && class24.field742 < 560 && class102.field2571 > 332) {
                class9.method193(77, class102.field2571 - 357, class24.field742 + -17, var3, (byte) -128, class23.field705, 463, -1, 0);
            }
            int var4 = class23.field705.field2540;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class53.field1393 != var4) {
                class53.field1393 = var4;
                class105.field2640 = true;
            }
        }
        if (arg0 != -20197) {
            return;
        }
        if (class86.field2169 != -1) {
            boolean var5 = class128.method1015(29378, class86.field2169);
            if (var5) {
                class105.field2640 = true;
            }
        }
        if (class19.field657 == 3) {
            class105.field2640 = true;
        }
        if (class32.field858 == 3) {
            class105.field2640 = true;
        }
        if (class64.field1608 != null) {
            class105.field2640 = true;
        }
        if (class6.field225 && class19.field641 == 2) {
            class105.field2640 = true;
        }
        if (class105.field2640) {
            class105.field2640 = false;
            class113.method935(true);
        }
        class78.method720(true);
        if (class103.field2610 != -1) {
            class95.field2367 = true;
        }
        if (class95.field2367) {
            if (class103.field2610 != -1 && class9.field331 == class103.field2610) {
                class103.field2610 = -1;
                class70.field1729.method416(arg0 ^ 0xFFFF9DA6, 44);
                class109.field2730++;
                class70.field1729.method142(class9.field331, (byte) -128);
            }
            class95.field2367 = false;
            class22.field688 = true;
            class12.method247(class9.field331, 4, class97.field2400, class66.field1651 == -1, class82.field2066 % 20 >= 10 ? class103.field2610 : -1);
        }
        if (class15.field505) {
            class22.field688 = true;
            class15.field505 = false;
            class105.method883(class115.field2831, arg0 ^ 0x4E81, class106.field2687, class6.field237, class75.field1867);
        }
        class102.method869(class104.field2624.field1975, -118, class2.field76, class9.field322, class104.field2624.field1966);
        class9.field322 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V", line = 1873)
    public static final void method615(int arg0, int arg1) {
        field1583++;
        if (arg1 == -3) {
            class72.method681(class82.field2096, class105.field2637, class32.field866, (byte) -121);
        } else if (arg1 == -2) {
            class72.method681(class82.field2074, class82.field2109, class46.field1221, (byte) 93);
        } else if (arg1 == -1) {
            class72.method681(class82.field2089, class72.field1781, class32.field862, (byte) 115);
        } else if (arg1 == 3) {
            class72.method681(class82.field2081, class82.field2114, class39.field1077, (byte) -65);
        } else if (arg1 == 4) {
            class72.method681(class82.field2116, class129.field3175, class15.field498, (byte) -33);
        } else if (arg1 == 5) {
            class72.method681(class82.field2106, class45.field1176, class2.field95, (byte) -101);
        } else if (arg1 == 6) {
            class72.method681(class82.field2070, class46.field1219, class131.field3208, (byte) 112);
        } else if (arg1 == 7) {
            class72.method681(class82.field2093, class112.field2766, class123.field3075, (byte) 105);
        } else if (arg1 == 8) {
            class72.method681(class82.field2077, class85.field2138, class4.field184, (byte) -76);
        } else if (arg1 == 9) {
            class72.method681(class82.field2082, class80.field2015, class59.field1485, (byte) 104);
        } else if (arg1 == 10) {
            class72.method681(class82.field2092, class85.field2143, class95.field2385, (byte) 87);
        } else if (arg1 == 11) {
            class72.method681(class82.field2083, class85.field2142, class57.field1466, (byte) 110);
        } else if (arg1 == 12) {
            class72.method681(class82.field2071, class127.field3130, class35.field933, (byte) 115);
        } else if (arg1 == 13) {
            class72.method681(class82.field2112, class59.field1501, class32.field851, (byte) -53);
        } else if (arg1 == 14) {
            class72.method681(class82.field2069, class17.field540, class42.field1112, (byte) -68);
        } else if (arg1 == 16) {
            class72.method681(class82.field2064, class8.field304, class38.field1044, (byte) -29);
        } else if (arg1 == 17) {
            class72.method681(class82.field2099, class102.field2583, class121.field3004, (byte) -85);
        } else if (arg1 == 18) {
            class72.method681(class82.field2103, client.field603, class74.field1810, (byte) 96);
        } else if (arg1 == 20) {
            class72.method681(class82.field2084, class108.field2717, class32.field856, (byte) 126);
        } else if (arg1 == 22) {
            class72.method681(class82.field2095, class34.field901, class11.field409, (byte) -123);
        } else if (arg1 == 23) {
            class72.method681(class82.field2097, class79.field1933, class42.field1121, (byte) -128);
        } else if (arg1 == 24) {
            class72.method681(class82.field2094, class118.field2951, class9.field316, (byte) 117);
        } else if (arg1 == 25) {
            class72.method681(class82.field2113, class14.field453, class32.field859, (byte) -84);
        } else if (arg1 == 26) {
            class72.method681(class82.field2100, class38.field1025, class31.field837, (byte) 103);
        } else if (arg1 == 27) {
            class72.method681(class82.field2085, class82.field2065, class127.field3131, (byte) 103);
        } else {
            class72.method681(class82.field2086, class42.field1143, class32.field863, (byte) 123);
        }
        if (arg0 != 5) {
            field1569 = null;
        }
        class34.method400(10, -83);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLhb;)V", line = 1986)
    public final void method616(boolean arg0, class44 arg1) {
        if (arg1.field1165 != null) {
            arg1.method470(0);
        }
        field1580++;
        arg1.field1160 = this.field1592.field1160;
        arg1.field1165 = this.field1592;
        arg1.field1165.field1160 = arg1;
        if (!arg0) {
            method609((byte) -126, -26, -36, -4, -38, 92, -45);
        }
        arg1.field1160.field1165 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZZ)I", line = 2005)
    private static final int method617(byte arg0, boolean arg1, boolean arg2) {
        field1574++;
        int var3 = 0;
        if (arg2) {
            var3 += class31.field846 + class134.field3288;
        }
        if (arg0 != -41) {
            field1581 = null;
        }
        if (arg1) {
            var3 += class85.field2147 + class48.field1262;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 2052)
    public class63() {
        this.field1592.field1165 = this.field1592;
        this.field1592.field1160 = this.field1592;
    }
}

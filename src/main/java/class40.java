import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 extends class97 {

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[[[I")
    public static int[][][] field1052 = new int[4][13][13];

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[Z")
    public static boolean[] field1053 = new boolean[5];

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "[I")
    public static int[] field1059 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Li;")
    public static class56 field1055 = new class56(64);

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Lwd;")
    public static class150 field1061 = class2.method9(true, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lwd;")
    private static class150 field1062 = class2.method9(true, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field1060 = 0;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "Lwd;")
    public static class150 field1063 = field1062;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Z")
    public static boolean field1067 = false;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Lwd;")
    public class150 field1054;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lce;")
    public static class20 field1068;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Lff;")
    public static class42 field1066;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Ljava/awt/Frame;")
    public static Frame field1064;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILva;I)I")
    public static final int method288(int arg0, class141 arg1, int arg2) {
        field1057++;
        if (arg1.field3346 == null || arg2 >= arg1.field3346.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field3346[arg2];
            int var4 = 0;
            if (arg0 > -56) {
                field1063 = null;
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class134.field3163[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class112.field2592[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class8.field170[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class141 var12 = class146.method1097(var11, true);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class4.method26((byte) 99, var13).field591 || class47.field1264)) {
                        for (int var14 = 0; var14 < var12.field3341.length; var14++) {
                            if (var13 + 1 == var12.field3341[var14]) {
                                var8 += var12.field3334[var14];
                            }
                        }
                    }
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 5) {
                    var8 = class16.field423[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class107.field2427[class112.field2592[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class16.field423[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 8) {
                    var8 = class46.field1244.field2540;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class144.field3505[var15]) {
                            var8 += class112.field2592[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class141 var18 = class146.method1097(var17, true);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class4.method26((byte) 88, var19).field591 || class47.field1264)) {
                        for (int var20 = 0; var20 < var18.field3341.length; var20++) {
                            if (var19 + 1 == var18.field3341[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class143.field3460;
                }
                if (var7 == 12) {
                    var8 = class63.field1619;
                }
                if (var7 == 13) {
                    int var21 = class16.field423[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class86.method618(10, var23);
                }
                if (var7 == 18) {
                    var8 = (class46.field1244.field3000 >> 7) + class66.field1686;
                }
                if (var7 == 19) {
                    var8 = (class46.field1244.field2939 >> 7) + class77.field1905;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)V")
    public static final void method289(boolean arg0, boolean arg1) {
        if (arg0) {
            return;
        }
        field1056++;
        class41.method294(-2607);
        class12.field286++;
        if (class12.field286 < 50 && !arg1) {
            return;
        }
        class12.field286 = 0;
        if (class101.field2310 || class49.field1292 == null) {
            return;
        }
        class138.field3237++;
        class143.field3451.method965(!arg0, 251);
        try {
            class49.field1292.method122(0, class143.field3451.field3592, (byte) 4, class143.field3451.field3601);
            class143.field3451.field3601 = 0;
        } catch (IOException var2) {
            class101.field2310 = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
    public static final boolean method290(int arg0) {
        field1050++;
        if (class49.field1292 == null) {
            return false;
        }
        try {
            int var1 = class49.field1292.method125(-16059);
            if (var1 == 0) {
                return false;
            }
            if (class11.field277 == -1) {
                var1--;
                class49.field1292.method123(0, class121.field2783.field3592, 1, 0);
                class121.field2783.field3601 = 0;
                class11.field277 = class121.field2783.method975(106);
                class76.field1870 = class69.field1743[class11.field277];
            }
            if (class76.field1870 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class49.field1292.method123(0, class121.field2783.field3592, 1, 0);
                var1--;
                class76.field1870 = class121.field2783.field3592[0] & 0xFF;
            }
            if (class76.field1870 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class49.field1292.method123(0, class121.field2783.field3592, 2, 0);
                class121.field2783.field3601 = 0;
                class76.field1870 = class121.field2783.method1140(-1);
                var1 -= 2;
            }
            if (class76.field1870 > var1) {
                return false;
            }
            class121.field2783.field3601 = 0;
            class49.field1292.method123(0, class121.field2783.field3592, class76.field1870, 0);
            class105.field2369 = class10.field234;
            class10.field234 = class94.field2193;
            class73.field1839 = 0;
            class94.field2193 = class11.field277;
            if (class11.field277 == 112) {
                for (int var2 = 0; var2 < class141.field3356; var2++) {
                    class105 var3 = class15.method110(var2, 16);
                    if (var3 != null && var3.field2377 == 0) {
                        class121.field2795[var2] = 0;
                        class16.field423[var2] = 0;
                    }
                }
                class11.field277 = -1;
                class82.field1972 = true;
                class128.field3024 = class11.field280;
                if (class29.field882 != -1) {
                    field1067 = true;
                }
                return true;
            }
            if (class11.field277 == 40) {
                int var4 = class121.field2783.method1145((byte) 58);
                int var5 = class121.field2783.method1136(arg0 + 4831);
                class141 var6 = class146.method1097(var4, true);
                class11.field277 = -1;
                var6.field3319 = var5;
                var6.field3318 = 1;
                return true;
            }
            if (class11.field277 == 98) {
                class106.field2387 = class121.field2783.method1137(255);
                class82.field1972 = true;
                class128.field3024 = class11.field280;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 153) {
                class128.method968(false, arg0 ^ 0x12C8);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 14) {
                long var7 = class121.field2783.method1149(1539013024);
                class150 var9 = class147.method1099(class121.field2783, (byte) -102).method1185(125);
                class3.method16(99, 6, var9, class124.method940(var7, arg0 ^ 0xFFFFDD03).method1175((byte) 71));
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 13) {
                class42.field1105 = class121.field2783.method1137(255);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 188) {
                int var10 = class121.field2783.method1146(0);
                int var11 = class121.field2783.method1127(122);
                class150 var12 = class121.field2783.method1154((byte) 89);
                if (var11 >= 1 && var11 <= 5) {
                    if (var12.method1181(true, class49.field1320)) {
                        var12 = null;
                    }
                    class76.field1865[var11 - 1] = var12;
                    class1.field3[var11 - 1] = var10 == 0;
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 17) {
                class144.method1083((byte) -82);
                class11.field277 = -1;
                return false;
            }
            if (class11.field277 == 93) {
                class43.field1187 = class121.field2783.method1154((byte) 75);
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, arg0 + 4766);
                    class66.field1688 = -1;
                }
                class61.field1551 = false;
                field1067 = true;
                class11.field277 = -1;
                class43.field1189 = class43.field1167;
                class46.field1251 = 4;
                return true;
            }
            if (class11.field277 == 65) {
                int var13 = class121.field2783.method1108(false);
                int var14 = class121.field2783.method1113(26939);
                if (var14 == 65535) {
                    var14 = -1;
                }
                if (class42.field1111[var13] == var14) {
                    class11.method73((byte) 123, class42.field1111[var13]);
                } else {
                    class68.method520(class42.field1111[var13], 2);
                    class42.field1111[var13] = var14;
                }
                class66.field1685 = true;
                class82.field1972 = true;
                class18.method129(class42.field1111[var13], 0);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 219) {
                class24.field707 = class121.field2783.method1127(111);
                class12.field291 = class121.field2783.method1108(false);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 195) {
                for (int var15 = 0; var15 < class137.field3217.length; var15++) {
                    if (class137.field3217[var15] != null) {
                        class137.field3217[var15].field3005 = -1;
                    }
                }
                for (int var16 = 0; var16 < class37.field1013.length; var16++) {
                    if (class37.field1013[var16] != null) {
                        class37.field1013[var16].field3005 = -1;
                    }
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 61) {
                class65.field1647 = class121.field2783.method1140(-1) * 30;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 108) {
                int var17 = class121.field2783.method1137(255);
                int var18 = class121.field2783.method1137(arg0 ^ 0xFFFFED9B);
                int var19 = class121.field2783.method1137(arg0 ^ 0xFFFFED9B);
                int var20 = class121.field2783.method1137(255);
                field1053[var17] = true;
                class131.field3086[var17] = var18;
                class97.field2233[var17] = var19;
                class125.field2901[var17] = var20;
                class11.field282[var17] = 0;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 89) {
                boolean var21 = class121.field2783.method1146(0) == 1;
                int var22 = class121.field2783.method1153((byte) -82);
                class141 var23 = class146.method1097(var22, true);
                class11.field277 = -1;
                var23.field3348 = var21;
                return true;
            }
            if (class11.field277 == 20) {
                class150 var24 = class121.field2783.method1154((byte) 96);
                if (var24.method1189(-84, class145.field3514)) {
                    class150 var25 = var24.method1202(0, var24.method1200(class43.field1199, 29903), 0);
                    long var26 = var25.method1198(1);
                    boolean var28 = false;
                    for (int var29 = 0; var29 < class74.field1858; var29++) {
                        if (class74.field1859[var29] == var26) {
                            var28 = true;
                            break;
                        }
                    }
                    if (!var28 && class68.field1724 == 0) {
                        class3.method16(arg0 + 4863, 4, class37.field1010, var25);
                    }
                } else if (var24.method1189(arg0 + 4679, class49.field1302)) {
                    class150 var30 = var24.method1202(0, var24.method1200(class43.field1199, arg0 ^ 0xFFFF99AB), arg0 ^ 0xFFFFED64);
                    boolean var31 = false;
                    long var32 = var30.method1198(1);
                    for (int var34 = 0; var34 < class74.field1858; var34++) {
                        if (class74.field1859[var34] == var32) {
                            var31 = true;
                            break;
                        }
                    }
                    if (!var31 && class68.field1724 == 0) {
                        class3.method16(99, 8, class30.field890, var30);
                    }
                } else if (var24.method1189(-79, class128.field3041)) {
                    boolean var35 = false;
                    class150 var36 = var24.method1202(0, var24.method1200(class43.field1199, arg0 ^ 0xFFFF99AB), 0);
                    long var37 = var36.method1198(arg0 ^ 0xFFFFED65);
                    for (int var39 = 0; var39 < class74.field1858; var39++) {
                        if (class74.field1859[var39] == var37) {
                            var35 = true;
                            break;
                        }
                    }
                    if (!var35 && class68.field1724 == 0) {
                        class150 var40 = var24.method1202(var24.method1200(class43.field1199, 29903) + 1, var24.method1174((byte) -116) + -9, 0);
                        class3.method16(99, 8, var40, var36);
                    }
                } else {
                    class3.method16(99, 0, var24, class43.field1167);
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 70) {
                class134.field3156 = class121.field2783.method1140(-1);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 35) {
                int var41 = class121.field2783.method1113(26939);
                if (var41 == 65535) {
                    var41 = -1;
                }
                class69.method525(-1, var41);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 25) {
                int var42 = class121.field2783.method1119(false);
                int var43 = class121.field2783.method1136(102);
                if (var43 == 65535) {
                    var43 = -1;
                }
                class105.method722(var42, arg0 ^ 0x12C7, var43);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 26) {
                class73.method555(arg0 ^ 0xFFFFED33);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 97) {
                int var44 = class121.field2783.method1147(-1);
                int var45 = class121.field2783.method1145((byte) 58);
                if (var44 == 65535) {
                    var44 = -1;
                }
                int var46 = class121.field2783.method1123((byte) -110);
                long var47 = ((long) var46 << 32) + (long) var44;
                class97 var49 = class2.field25.method534((byte) -89, var47);
                if (var49 != null) {
                    var49.method678((byte) -26);
                }
                class2.field25.method541(new class86(var45), var47, false);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 74) {
                for (int var50 = 0; var50 < class16.field423.length; var50++) {
                    if (class16.field423[var50] != class121.field2795[var50]) {
                        class16.field423[var50] = class121.field2795[var50];
                        class107.method740(var50, arg0 + 4655);
                        class82.field1972 = true;
                    }
                }
                class11.field277 = -1;
                class128.field3024 = class11.field280;
                return true;
            }
            if (class11.field277 == 54) {
                int var51 = class121.field2783.method1153((byte) -82);
                int var52 = class121.field2783.method1143((byte) -100);
                int var53 = class121.field2783.method1105(-40);
                class141 var54 = class146.method1097(var51, true);
                var54.field3353 = var54.field3406 + var52;
                var54.field3304 = var54.field3360 + var53;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 9) {
                int var55 = class121.field2783.method1147(-1);
                byte var56 = class121.field2783.method1134(124);
                class121.field2795[var55] = var56;
                if (class16.field423[var55] != var56) {
                    class16.field423[var55] = var56;
                    class107.method740(var55, arg0 ^ 0x12A3);
                    class82.field1972 = true;
                    if (class29.field882 != -1) {
                        field1067 = true;
                    }
                }
                class128.field3024 = class11.field280;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 250) {
                int var57 = class121.field2783.method1123((byte) -110);
                class141 var58 = class146.method1097(var57, true);
                for (int var59 = 0; var59 < var58.field3341.length; var59++) {
                    var58.field3341[var59] = -1;
                    var58.field3341[var59] = 0;
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 160) {
                class73.method553(class76.field1870, class121.field2783, class10.field243, -4);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 211) {
                class74.field1858 = class76.field1870 / 8;
                for (int var60 = 0; var60 < class74.field1858; var60++) {
                    class74.field1859[var60] = class121.field2783.method1149(class11.method69(arg0, -1539009340));
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 186) {
                long var61 = class121.field2783.method1149(arg0 ^ 0xA44494C4);
                int var63 = class121.field2783.method1140(-1);
                int var64 = class121.field2783.method1137(arg0 ^ 0xFFFFED9B);
                class150 var65 = class124.method940(var61, arg0 ^ 0xFFFFDD03).method1175((byte) 71);
                for (int var66 = 0; var66 < class50.field1347; var66++) {
                    if (class3.field61[var66] == var61) {
                        if (class30.field893[var66] != var63) {
                            class30.field893[var66] = var63;
                            class82.field1972 = true;
                            if (var63 > 0) {
                                class3.method16(99, 5, class111.method786((byte) -124, new class150[] { var65, class104.field2347 }), class43.field1167);
                            }
                            if (var63 == 0) {
                                class3.method16(arg0 + 4863, 5, class111.method786((byte) -116, new class150[] { var65, class119.field2747 }), class43.field1167);
                            }
                        }
                        var65 = null;
                        class141.field3392[var66] = var64;
                        break;
                    }
                }
                boolean var67 = false;
                if (var65 != null && class50.field1347 < 200) {
                    class3.field61[class50.field1347] = var61;
                    class146.field3537[class50.field1347] = var65;
                    class30.field893[class50.field1347] = var63;
                    class141.field3392[class50.field1347] = var64;
                    class82.field1972 = true;
                    class128.field3024 = class11.field280;
                    class50.field1347++;
                }
                while (!var67) {
                    var67 = true;
                    for (int var68 = 0; var68 < class50.field1347 - 1; var68++) {
                        if (class30.field893[var68] != class128.field3028 && class30.field893[var68 + 1] == class128.field3028 || class30.field893[var68] == 0 && class30.field893[var68 + 1] != 0) {
                            var67 = false;
                            int var69 = class30.field893[var68];
                            class30.field893[var68] = class30.field893[var68 + 1];
                            class30.field893[var68 + 1] = var69;
                            class150 var70 = class146.field3537[var68];
                            class146.field3537[var68] = class146.field3537[var68 + 1];
                            class146.field3537[var68 + 1] = var70;
                            long var71 = class3.field61[var68];
                            class3.field61[var68] = class3.field61[var68 + 1];
                            class3.field61[var68 + 1] = var71;
                            int var73 = class141.field3392[var68];
                            class141.field3392[var68] = class141.field3392[var68 + 1];
                            class141.field3392[var68 + 1] = var73;
                            class82.field1972 = true;
                        }
                    }
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 254) {
                int var74 = class121.field2783.method1127(109);
                int var75 = class121.field2783.method1146(0);
                int var76 = class121.field2783.method1108(false);
                class17.field466 = var76 >> 1;
                class46.field1244.method957(var75, 24, var74, (var76 & 0x1) == 1);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 21) {
                class82.field1972 = true;
                int var77 = class121.field2783.method1104(true);
                int var78 = class121.field2783.method1140(-1);
                class141 var79;
                if (var77 < 0) {
                    var79 = null;
                } else {
                    var79 = class146.method1097(var77, true);
                }
                if (var77 < -70000) {
                    var78 += 32768;
                }
                while (class76.field1870 > class121.field2783.field3601) {
                    int var80 = class121.field2783.method1144(-127);
                    int var81 = 0;
                    int var82 = class121.field2783.method1140(-1);
                    if (var82 != 0) {
                        var81 = class121.field2783.method1137(255);
                        if (var81 == 255) {
                            var81 = class121.field2783.method1104(true);
                        }
                    }
                    if (var79 != null && var80 >= 0 && var80 < var79.field3341.length) {
                        var79.field3341[var80] = var82;
                        var79.field3334[var80] = var81;
                    }
                    class127.method955((byte) 84, var80, var81, var82 - 1, var78);
                }
                class38.field1045 = class11.field280;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 27) {
                class150 var83 = class121.field2783.method1154((byte) 123);
                int var84 = class121.field2783.method1104(true);
                class141 var85 = class146.method1097(var84, true);
                var85.field3366 = var83;
                if (var84 >> 16 == class42.field1111[class24.field695]) {
                    class82.field1972 = true;
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 136) {
                int var86 = class121.field2783.method1104(true);
                int var87 = class121.field2783.method1143((byte) -100);
                class141 var88 = class146.method1097(var86, true);
                class11.field277 = -1;
                if (var88.field3306 != var87 || var87 == -1) {
                    var88.field3410 = 0;
                    var88.field3306 = var87;
                    var88.field3328 = 0;
                }
                return true;
            }
            if (class11.field277 == 184) {
                class135.field3183 = class121.field2783.method1137(arg0 ^ 0xFFFFED9B);
                class6.field151 = class121.field2783.method1137(255);
                class134.field3149 = class121.field2783.method1137(255);
                field1067 = true;
                class16.field418 = true;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 232) {
                class24.field695 = class121.field2783.method1108(false);
                class11.field277 = -1;
                class82.field1972 = true;
                class66.field1685 = true;
                return true;
            }
            if (arg0 != -4764) {
                field1064 = null;
            }
            if (class11.field277 == 220) {
                int var89 = class121.field2783.method1147(-1);
                int var90 = class121.field2783.method1147(arg0 ^ 0x129B);
                int var91 = class121.field2783.method1123((byte) -110);
                int var92 = class121.field2783.method1136(119);
                class141 var93 = class146.method1097(var91, true);
                var93.field3404 = var90;
                class11.field277 = -1;
                var93.field3307 = var89;
                var93.field3375 = var92;
                return true;
            }
            if (class11.field277 == 111) {
                if (class118.field2702 != -1) {
                    class68.method520(class118.field2702, 2);
                    class66.field1685 = true;
                    class118.field2702 = -1;
                    class82.field1972 = true;
                }
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, arg0 + 4766);
                    class66.field1688 = -1;
                    field1067 = true;
                }
                if (class108.field2450 != -1) {
                    class68.method520(class108.field2450, 2);
                    class108.field2450 = -1;
                    class11.method66(30, false);
                }
                if (class144.field3476 != -1) {
                    class68.method520(class144.field3476, arg0 ^ 0xFFFFED66);
                    class144.field3476 = -1;
                }
                if (class107.field2436 != -1) {
                    class68.method520(class107.field2436, 2);
                    class107.field2436 = -1;
                }
                class11.field277 = -1;
                if (class46.field1251 != 0) {
                    class46.field1251 = 0;
                    field1067 = true;
                }
                class147.field3559 = -1;
                return true;
            }
            if (class11.field277 == 24) {
                int var94 = class121.field2783.method1136(arg0 + 4811);
                int var95 = class121.field2783.method1123((byte) -110);
                int var96 = class121.field2783.method1140(-1);
                class141 var97 = class146.method1097(var95, true);
                var97.field3301 = (var94 << 16) + var96;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 107) {
                int var98 = class121.field2783.method1143((byte) -100);
                if (var98 >= 0) {
                    class16.method115(var98, -125);
                }
                if (class78.field1916 != var98) {
                    class68.method520(class78.field1916, 2);
                    class78.field1916 = var98;
                }
                class18.method129(class78.field1916, 0);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 126 || class11.field277 == 148 || class11.field277 == 43 || class11.field277 == 100 || class11.field277 == 196 || class11.field277 == 142 || class11.field277 == 116 || class11.field277 == 60 || class11.field277 == 10 || class11.field277 == 127 || class11.field277 == 236) {
                class128.method966(-31521);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 217) {
                int var99 = class121.field2783.method1140(-1);
                int var100 = class121.field2783.method1137(255);
                int var101 = class121.field2783.method1140(arg0 ^ 0x129B);
                class63.method503(var101, var100, var99, (byte) -42);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 16) {
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, 2);
                    class66.field1688 = -1;
                }
                class46.field1251 = 2;
                class61.field1551 = false;
                field1067 = true;
                class11.field277 = -1;
                class43.field1189 = class43.field1167;
                return true;
            }
            if (class11.field277 == 137) {
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, arg0 + 4766);
                    class66.field1688 = -1;
                }
                class43.field1189 = class43.field1167;
                field1067 = true;
                class46.field1251 = 1;
                class11.field277 = -1;
                class61.field1551 = false;
                return true;
            }
            if (class11.field277 == 190) {
                int var102 = class121.field2783.method1153((byte) -82);
                int var103 = class121.field2783.method1136(90);
                int var104 = var103 >> 10 & 0x1F;
                int var105 = var103 & 0x1F;
                int var106 = var103 >> 5 & 0x1F;
                class141 var107 = class146.method1097(var102, true);
                var107.field3412 = (var105 << 3) + (var104 << 19) + (var106 << 11);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 152) {
                class150 var108 = class121.field2783.method1154((byte) 83);
                Object[] var109 = new Object[var108.method1174((byte) -126) + 1];
                for (int var110 = var108.method1174((byte) -116) - 1; var110 >= 0; var110--) {
                    if (var108.method1206(var110, -27473) == 115) {
                        var109[var110 + 1] = class121.field2783.method1154((byte) -97);
                    } else {
                        var109[var110 + 1] = Integer.valueOf(class121.field2783.method1104(true));
                    }
                }
                var109[0] = Integer.valueOf(class121.field2783.method1104(true));
                class43.method331(var109, -119, null, 0, 0, 0, null);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 212) {
                class135.field3175 = class121.field2783.method1137(255);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 121) {
                class128.method968(true, arg0 ^ 0x12FA);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 73) {
                int var111 = class121.field2783.method1147(-1);
                class16.method115(var111, -120);
                if (class118.field2702 != -1) {
                    class68.method520(class118.field2702, arg0 ^ 0xFFFFED66);
                    class118.field2702 = -1;
                    class66.field1685 = true;
                    class82.field1972 = true;
                }
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, 2);
                    class66.field1688 = -1;
                    field1067 = true;
                }
                if (class108.field2450 != -1) {
                    class68.method520(class108.field2450, arg0 ^ 0xFFFFED66);
                    class108.field2450 = -1;
                    class11.method66(30, false);
                }
                if (class144.field3476 != -1) {
                    class68.method520(class144.field3476, 2);
                    class144.field3476 = -1;
                }
                if (class107.field2436 == var111) {
                    class11.method73((byte) 121, class107.field2436);
                } else {
                    class68.method520(class107.field2436, 2);
                    class107.field2436 = var111;
                }
                class147.field3559 = -1;
                if (class46.field1251 != 0) {
                    field1067 = true;
                    class46.field1251 = 0;
                }
                class18.method129(class107.field2436, 0);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 199) {
                int var112 = class121.field2783.method1104(true);
                class22.field647 = class10.field243.method1023(24392, var112);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 166) {
                class24.field707 = class121.field2783.method1137(255);
                class12.field291 = class121.field2783.method1137(arg0 + 5019);
                while (class121.field2783.field3601 < class76.field1870) {
                    class11.field277 = class121.field2783.method1137(255);
                    class128.method966(arg0 ^ 0x69BB);
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 51) {
                class50.field1357 = true;
                class43.field1190 = class121.field2783.method1137(255);
                class133.field3131 = class121.field2783.method1137(255);
                class96.field2217 = class121.field2783.method1140(-1);
                class66.field1681 = class121.field2783.method1137(255);
                class131.field3091 = class121.field2783.method1137(255);
                if (class131.field3091 >= 100) {
                    int var113 = class43.field1190 * 128 + 64;
                    int var114 = class133.field3131 * 128 + 64;
                    int var115 = class25.method205(var113, class17.field466, -23287, var114) - class96.field2217;
                    int var116 = var115 - class130.field3061;
                    int var117 = var114 - class46.field1248;
                    int var118 = var113 - class61.field1591;
                    int var119 = (int) Math.sqrt((double) (var117 * var117 + var118 * var118));
                    class97.field2230 = (int) (Math.atan2((double) var116, (double) var119) * 325.949D) & 0x7FF;
                    class95.field2199 = (int) (Math.atan2((double) var118, (double) var117) * -325.949D) & 0x7FF;
                    if (class97.field2230 < 128) {
                        class97.field2230 = 128;
                    }
                    if (class97.field2230 > 383) {
                        class97.field2230 = 383;
                    }
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 149) {
                int var120 = class121.field2783.method1145((byte) 58);
                int var121 = class121.field2783.method1145((byte) 58);
                int var122 = class121.field2783.method1136(113);
                if (var122 == 65535) {
                    var122 = -1;
                }
                class141 var123 = class146.method1097(var121, true);
                if (var123.field3370) {
                    var123.field3350 = var120;
                    var123.field3296 = var122;
                    class21 var125 = class4.method26((byte) 94, var122);
                    var123.field3375 = var125.field542;
                    var123.field3404 = var125.field579;
                    var123.field3386 = var125.field601;
                    var123.field3325 = var125.field603;
                    var123.field3307 = var125.field543;
                    if (var123.field3321 > 0) {
                        var123.field3307 = var123.field3307 * 32 / var123.field3321;
                    }
                    var123.field3393 = var125.field547;
                    class77.method569(arg0 ^ 0xFFFFD055, var123);
                } else if (var122 == -1) {
                    class11.field277 = -1;
                    var123.field3318 = 0;
                    return true;
                } else {
                    class21 var124 = class4.method26((byte) 120, var122);
                    var123.field3375 = var124.field542;
                    var123.field3404 = var124.field579;
                    var123.field3307 = var124.field543 * 100 / var120;
                    var123.field3318 = 4;
                    var123.field3319 = var122;
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 122) {
                if (class24.field695 == 12) {
                    class82.field1972 = true;
                }
                class143.field3460 = class121.field2783.method1137(255);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 83) {
                long var126 = class121.field2783.method1149(1539013024);
                long var128 = (long) class121.field2783.method1140(arg0 + 4763);
                long var130 = (long) class121.field2783.method1152((byte) -45);
                int var132 = class121.field2783.method1137(255);
                long var133 = (var128 << 32) + var130;
                boolean var135 = false;
                for (int var136 = 0; var136 < 100; var136++) {
                    if (class126.field2926[var136] == var133) {
                        var135 = true;
                        break;
                    }
                }
                if (var132 <= 1) {
                    for (int var137 = 0; var137 < class74.field1858; var137++) {
                        if (class74.field1859[var137] == var126) {
                            var135 = true;
                            break;
                        }
                    }
                }
                if (!var135 && class68.field1724 == 0) {
                    class126.field2926[class74.field1848] = var133;
                    class74.field1848 = (class74.field1848 + 1) % 100;
                    class150 var138 = class147.method1099(class121.field2783, (byte) -45).method1185(-118);
                    if (var132 == 2 || var132 == 3) {
                        class3.method16(99, 7, var138, class111.method786((byte) -107, new class150[] { class4.field81, class124.method940(var126, 12391).method1175((byte) 71) }));
                    } else if (var132 == 1) {
                        class3.method16(99, 7, var138, class111.method786((byte) 89, new class150[] { class109.field2521, class124.method940(var126, 12391).method1175((byte) 71) }));
                    } else {
                        class3.method16(99, 3, var138, class124.method940(var126, 12391).method1175((byte) 71));
                    }
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 208) {
                int var139 = class121.field2783.method1140(-1);
                int var140 = class121.field2783.method1145((byte) 58);
                class141 var141 = class146.method1097(var140, true);
                if (var141 != null && var141.field3354 == 0) {
                    if (var141.field3382 - var141.field3326 < var139) {
                        var139 = var141.field3382 - var141.field3326;
                    }
                    if (var139 < 0) {
                        var139 = 0;
                    }
                    var141.field3309 = var139;
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 150) {
                int var142 = class121.field2783.method1140(arg0 + 4763);
                int var143 = class121.field2783.method1140(arg0 + 4763);
                class16.method115(var142, -122);
                if (var143 != -1) {
                    class16.method115(var143, -119);
                }
                if (class107.field2436 != -1) {
                    class68.method520(class107.field2436, 2);
                    class107.field2436 = -1;
                }
                if (class118.field2702 != -1) {
                    class68.method520(class118.field2702, arg0 ^ 0xFFFFED66);
                    class118.field2702 = -1;
                }
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, 2);
                    class66.field1688 = -1;
                }
                if (class108.field2450 == var142) {
                    class11.method73((byte) 124, class108.field2450);
                } else {
                    class68.method520(class108.field2450, arg0 ^ 0xFFFFED66);
                    class108.field2450 = var142;
                    class11.method66(35, false);
                }
                if (class144.field3476 == var142) {
                    class11.method73((byte) 126, class144.field3476);
                } else {
                    class68.method520(class144.field3476, arg0 + 4766);
                    class144.field3476 = var143;
                }
                class147.field3559 = -1;
                class46.field1251 = 0;
                class18.method129(class108.field2450, 0);
                class18.method129(class144.field3476, 0);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 104) {
                int var144 = class121.field2783.method1113(26939);
                class37.method278(var144, arg0 + 4697);
                class11.field277 = -1;
                class38.field1045 = class11.field280;
                return true;
            }
            if (class11.field277 == 1) {
                class12.field291 = class121.field2783.method1146(arg0 ^ 0xFFFFED64);
                class24.field707 = class121.field2783.method1127(115);
                for (int var145 = class24.field707; var145 < class24.field707 + 8; var145++) {
                    for (int var146 = class12.field291; var146 < class12.field291 + 8; var146++) {
                        if (class50.field1339[class17.field466][var145][var146] != null) {
                            class50.field1339[class17.field466][var145][var146] = null;
                            class103.method701(var145, var146, arg0 ^ 0x12BD);
                        }
                    }
                }
                for (class54 var147 = (class54) class107.field2432.method702((byte) -126); var147 != null; var147 = (class54) class107.field2432.method698(-1610612736)) {
                    if (var147.field1429 >= class24.field707 && class24.field707 + 8 > var147.field1429 && class12.field291 <= var147.field1414 && class12.field291 + 8 > var147.field1414 && class17.field466 == var147.field1422) {
                        var147.field1425 = 0;
                    }
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 46) {
                class133.field3122 = class121.field2783.method1127(119);
                if (class24.field695 == class133.field3122) {
                    class82.field1972 = true;
                    if (class133.field3122 == 3) {
                        class24.field695 = 1;
                    } else {
                        class24.field695 = 3;
                    }
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 145) {
                int var148 = class121.field2783.method1153((byte) -82);
                int var149 = class121.field2783.method1147(arg0 ^ 0x129B);
                class121.field2795[var149] = var148;
                if (class16.field423[var149] != var148) {
                    class16.field423[var149] = var148;
                    class107.method740(var149, -52);
                    if (class29.field882 != -1) {
                        field1067 = true;
                    }
                    class82.field1972 = true;
                }
                class11.field277 = -1;
                class128.field3024 = class11.field280;
                return true;
            }
            if (class11.field277 == 38) {
                int var150 = class121.field2783.method1123((byte) -110);
                int var151 = class121.field2783.method1136(103);
                class141 var152 = class146.method1097(var150, true);
                var152.field3318 = 2;
                var152.field3319 = var151;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 120) {
                int var153 = class121.field2783.method1113(26939);
                class16.method115(var153, arg0 + 4640);
                if (class118.field2702 != -1) {
                    class68.method520(class118.field2702, 2);
                    class66.field1685 = true;
                    class82.field1972 = true;
                    class118.field2702 = -1;
                }
                if (class108.field2450 != -1) {
                    class68.method520(class108.field2450, arg0 ^ 0xFFFFED66);
                    class108.field2450 = -1;
                    class11.method66(30, false);
                }
                if (class144.field3476 != -1) {
                    class68.method520(class144.field3476, 2);
                    class144.field3476 = -1;
                }
                if (class107.field2436 != -1) {
                    class68.method520(class107.field2436, 2);
                    class107.field2436 = -1;
                }
                if (class66.field1688 == var153) {
                    class11.method73((byte) 123, class66.field1688);
                } else {
                    class68.method520(class66.field1688, arg0 ^ 0xFFFFED66);
                    class66.field1688 = var153;
                }
                class147.field3559 = -1;
                class18.method129(class66.field1688, 0);
                field1067 = true;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 29) {
                class42.method299(-1);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 244) {
                int var154 = class121.field2783.method1140(arg0 + 4763);
                class16.method115(var154, -119);
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, arg0 ^ 0xFFFFED66);
                    field1067 = true;
                    class66.field1688 = -1;
                }
                if (class108.field2450 != -1) {
                    class68.method520(class108.field2450, 2);
                    class108.field2450 = -1;
                    class11.method66(30, false);
                }
                if (class144.field3476 != -1) {
                    class68.method520(class144.field3476, 2);
                    class144.field3476 = -1;
                }
                if (class107.field2436 != -1) {
                    class68.method520(class107.field2436, arg0 ^ 0xFFFFED66);
                    class107.field2436 = -1;
                }
                if (class118.field2702 == var154) {
                    class11.method73((byte) 122, class118.field2702);
                } else {
                    class68.method520(class118.field2702, 2);
                    class118.field2702 = var154;
                }
                if (class46.field1251 != 0) {
                    field1067 = true;
                    class46.field1251 = 0;
                }
                class82.field1972 = true;
                class147.field3559 = -1;
                class66.field1685 = true;
                class18.method129(class118.field2702, 0);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 139) {
                class50.field1357 = true;
                class63.field1633 = class121.field2783.method1137(255);
                class80.field1934 = class121.field2783.method1137(255);
                class25.field776 = class121.field2783.method1140(-1);
                class146.field3540 = class121.field2783.method1137(255);
                class50.field1366 = class121.field2783.method1137(255);
                if (class50.field1366 >= 100) {
                    class61.field1591 = class63.field1633 * 128 + 64;
                    class46.field1248 = class80.field1934 * 128 + 64;
                    class130.field3061 = class25.method205(class61.field1591, class17.field466, -23287, class46.field1248) - class25.field776;
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 146) {
                if (class24.field695 == 12) {
                    class82.field1972 = true;
                }
                class63.field1619 = class121.field2783.method1141((byte) -6);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 198) {
                class82.field1972 = true;
                int var155 = class121.field2783.method1104(true);
                int var156 = class121.field2783.method1140(-1);
                if (var155 < -70000) {
                    var156 += 32768;
                }
                class141 var157;
                if (var155 < 0) {
                    var157 = null;
                } else {
                    var157 = class146.method1097(var155, true);
                }
                if (var157 != null) {
                    for (int var158 = 0; var158 < var157.field3341.length; var158++) {
                        var157.field3341[var158] = 0;
                        var157.field3334[var158] = 0;
                    }
                }
                class142.method1072(var156, (byte) 42);
                int var159 = class121.field2783.method1140(-1);
                for (int var160 = 0; var160 < var159; var160++) {
                    int var161 = class121.field2783.method1127(arg0 + 4888);
                    if (var161 == 255) {
                        var161 = class121.field2783.method1145((byte) 58);
                    }
                    int var162 = class121.field2783.method1147(-1);
                    if (var157 != null && var160 < var157.field3341.length) {
                        var157.field3341[var160] = var162;
                        var157.field3334[var160] = var161;
                    }
                    class127.method955((byte) 84, var160, var161, var162 - 1, var156);
                }
                class38.field1045 = class11.field280;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 79) {
                class101.field2292 = class121.field2783.method1137(255);
                if (class101.field2292 == 1) {
                    class29.field879 = class121.field2783.method1140(arg0 + 4763);
                }
                if (class101.field2292 >= 2 && class101.field2292 <= 6) {
                    if (class101.field2292 == 2) {
                        class144.field3483 = 64;
                        class32.field943 = 64;
                    }
                    if (class101.field2292 == 3) {
                        class144.field3483 = 64;
                        class32.field943 = 0;
                    }
                    if (class101.field2292 == 4) {
                        class144.field3483 = 64;
                        class32.field943 = 128;
                    }
                    if (class101.field2292 == 5) {
                        class32.field943 = 64;
                        class144.field3483 = 0;
                    }
                    if (class101.field2292 == 6) {
                        class32.field943 = 64;
                        class144.field3483 = 128;
                    }
                    class101.field2292 = 2;
                    class112.field2595 = class121.field2783.method1140(-1);
                    class131.field3093 = class121.field2783.method1140(arg0 + 4763);
                    class105.field2384 = class121.field2783.method1137(255);
                }
                if (class101.field2292 == 10) {
                    class98.field2249 = class121.field2783.method1140(-1);
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 76) {
                int var163 = class121.field2783.method1136(62);
                int var164 = class121.field2783.method1140(-1);
                if (class66.field1688 != -1) {
                    class68.method520(class66.field1688, 2);
                    field1067 = true;
                    class66.field1688 = -1;
                }
                if (class108.field2450 != -1) {
                    class68.method520(class108.field2450, 2);
                    class108.field2450 = -1;
                    class11.method66(30, false);
                }
                if (class144.field3476 != -1) {
                    class68.method520(class144.field3476, 2);
                    class144.field3476 = -1;
                }
                if (class107.field2436 == var164) {
                    class11.method73((byte) 127, class107.field2436);
                } else {
                    class68.method520(class107.field2436, arg0 ^ 0xFFFFED66);
                    class107.field2436 = var164;
                }
                if (class118.field2702 == var163) {
                    class11.method73((byte) 122, class118.field2702);
                } else {
                    class68.method520(class118.field2702, arg0 + 4766);
                    class118.field2702 = var163;
                }
                class66.field1685 = true;
                class82.field1972 = true;
                class147.field3559 = -1;
                if (class46.field1251 != 0) {
                    field1067 = true;
                    class46.field1251 = 0;
                }
                class18.method129(class107.field2436, 0);
                class18.method129(class118.field2702, arg0 ^ 0xFFFFED64);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 194) {
                class50.field1357 = false;
                for (int var165 = 0; var165 < 5; var165++) {
                    field1053[var165] = false;
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 163) {
                long var166 = class121.field2783.method1149(1539013024);
                byte var168 = class121.field2783.method1124(arg0 + 4772);
                long var169 = class121.field2783.method1149(arg0 + 1539017788);
                long var171 = (long) class121.field2783.method1140(-1);
                long var173 = (long) class121.field2783.method1152((byte) -53);
                int var175 = class121.field2783.method1137(arg0 ^ 0xFFFFED9B);
                long var176 = (var171 << 32) + var173;
                boolean var178 = false;
                for (int var179 = 0; var179 < 100; var179++) {
                    if (class126.field2926[var179] == var176) {
                        var178 = true;
                        break;
                    }
                }
                if (var175 <= 1) {
                    for (int var180 = 0; var180 < class74.field1858; var180++) {
                        if (class74.field1859[var180] == var166) {
                            var178 = true;
                            break;
                        }
                    }
                }
                if (!var178 && class68.field1724 == 0) {
                    class126.field2926[class74.field1848] = var176;
                    class74.field1848 = (class74.field1848 + 1) % 100;
                    class150 var181 = class147.method1099(class121.field2783, (byte) -79).method1185(126);
                    class150 var182 = class111.method786((byte) 44, new class150[] { class147.field3556, class124.method940(var169, 12391), class21.field545, class29.method239(1000, var168), class56.field1456 });
                    if (var175 == 2 || var175 == 3) {
                        class3.method16(99, 7, var181, class111.method786((byte) -123, new class150[] { var182, class4.field81, class124.method940(var166, 12391).method1175((byte) 71) }));
                    } else if (var175 == 1) {
                        class3.method16(99, 7, var181, class111.method786((byte) 19, new class150[] { var182, class109.field2521, class124.method940(var166, arg0 ^ 0xFFFFDD03).method1175((byte) 71) }));
                    } else {
                        class3.method16(arg0 + 4863, 3, var181, class111.method786((byte) 26, new class150[] { var182, class124.method940(var166, 12391).method1175((byte) 71) }));
                    }
                }
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 110) {
                class82.field1972 = true;
                int var183 = class121.field2783.method1104(true);
                int var184 = class121.field2783.method1137(255);
                int var185 = class121.field2783.method1127(125);
                class8.field170[var184] = var183;
                class134.field3163[var184] = var185;
                class112.field2592[var184] = 1;
                for (int var186 = 0; var186 < 98; var186++) {
                    if (class107.field2427[var186] <= var183) {
                        class112.field2592[var184] = var186 + 2;
                    }
                }
                class118.field2700 = class11.field280;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 105) {
                class142.field3442 = 0;
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 192) {
                int var187 = class121.field2783.method1143((byte) -100);
                if (class29.field882 != var187) {
                    class68.method520(class29.field882, 2);
                    class29.field882 = var187;
                }
                field1067 = true;
                class18.method129(class29.field882, 0);
                class11.field277 = -1;
                return true;
            }
            if (class11.field277 == 134) {
                int var188 = class121.field2783.method1153((byte) -82);
                class141 var189 = class146.method1097(var188, true);
                var189.field3318 = 3;
                var189.field3319 = class46.field1244.field2562.method1162(-4513);
                class11.field277 = -1;
                return true;
            }
            class61.method467("T1 - " + class11.field277 + "," + class10.field234 + "," + class105.field2369 + " - " + class76.field1870, (byte) -62, null);
            class144.method1083((byte) -119);
        } catch (IOException var193) {
            class131.method988(arg0 ^ 0x12E6);
        } catch (Exception var194) {
            String var191 = "T2 - " + class11.field277 + "," + class10.field234 + "," + class105.field2369 + " - " + class76.field1870 + "," + (class46.field1244.field2963[0] + class66.field1686) + "," + (class46.field1244.field2934[0] + class77.field1905) + " - ";
            for (int var192 = 0; class76.field1870 > var192 && var192 < 50; var192++) {
                var191 = var191 + class121.field2783.field3592[var192] + ",";
            }
            class61.method467(var191, (byte) -71, var194);
            class144.method1083((byte) -108);
        }
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public static void method291(int arg0) {
        field1068 = null;
        field1055 = null;
        field1063 = null;
        field1061 = null;
        field1059 = null;
        field1053 = null;
        field1052 = null;
        if (arg0 != 19306) {
            method290(34);
        }
        field1062 = null;
        field1066 = null;
        field1064 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lse;II)V")
    public static final void method292(class127 arg0, int arg1, int arg2) {
        class92.method652((byte) -11, arg0.field3000, arg2, arg0.field2939);
        if (arg1 != 11705) {
            field1062 = null;
        }
        field1058++;
    }
}

import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class45 extends class67 {

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
    public int field1128 = 99;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    public int field1125 = 5;

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
    public int field1134 = -1;

    @OriginalMember(owner = "client!h", name = "sb", descriptor = "I")
    public int field1142 = -1;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "I")
    public int field1127 = -1;

    @OriginalMember(owner = "client!h", name = "Bb", descriptor = "I")
    public int field1151 = -1;

    @OriginalMember(owner = "client!h", name = "Ab", descriptor = "Z")
    public boolean field1150 = false;

    @OriginalMember(owner = "client!h", name = "Ib", descriptor = "I")
    public int field1158 = -1;

    @OriginalMember(owner = "client!h", name = "Jb", descriptor = "I")
    public int field1159 = 2;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "Lgd;")
    private static class40 field1130 = class14.method90(false, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "Lgd;")
    private static class40 field1129 = class14.method90(false, "Loading title screen )2 ");

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "Z")
    public static boolean field1124 = false;

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "Lgd;")
    public static class40 field1141 = class14.method90(false, ":");

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "[I")
    public static int[] field1122 = new int[500];

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "Lgd;")
    public static class40 field1139 = field1130;

    @OriginalMember(owner = "client!h", name = "vb", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "Lgd;")
    public static class40 field1133 = field1129;

    @OriginalMember(owner = "client!h", name = "Cb", descriptor = "Lgd;")
    public static class40 field1152 = class14.method90(false, "mapfunction");

    @OriginalMember(owner = "client!h", name = "Lb", descriptor = "Lgd;")
    private static class40 field1161 = class14.method90(false, "slide:");

    @OriginalMember(owner = "client!h", name = "tb", descriptor = "Lgd;")
    public static class40 field1143 = field1161;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!h", name = "ub", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!h", name = "wb", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!h", name = "xb", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!h", name = "zb", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!h", name = "Db", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!h", name = "Eb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!h", name = "Gb", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!h", name = "Hb", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!h", name = "Kb", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!h", name = "Mb", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "Lrc;")
    public static class104 field1138;

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "Lmb;")
    public static class73 field1137;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "[I")
    public int[] field1123;

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "[I")
    private int[] field1136;

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "[I")
    public static int[] field1140;

    @OriginalMember(owner = "client!h", name = "yb", descriptor = "[I")
    private int[] field1148;

    @OriginalMember(owner = "client!h", name = "Fb", descriptor = "[I")
    public int[] field1155;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "[Lhd;")
    public static class46[] field1126;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 3)
    public static void method308(byte arg0) {
        field1143 = null;
        int var1 = -98 % ((arg0 - 71) / 40);
        field1152 = null;
        field1141 = null;
        field1129 = null;
        field1130 = null;
        field1126 = null;
        field1140 = null;
        field1137 = null;
        field1161 = null;
        field1122 = null;
        field1139 = null;
        field1138 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILqb;I)Lqb;", line = 28)
    public final class97 method309(int arg0, int arg1, class97 arg2, int arg3) {
        field1160++;
        int var5 = this.field1155[arg0];
        class131 var6 = class48.method374(-20328, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method668(true);
        }
        int var8 = arg1 & 0x3;
        if (arg3 != -14994) {
            method310(-114);
        }
        class97 var9 = arg2.method668(!var6.method1037((byte) 26, var7));
        if (var8 == 1) {
            var9.method673();
        } else if (var8 == 2) {
            var9.method658();
        } else if (var8 == 3) {
            var9.method679();
        }
        var9.method652(var6, var7);
        if (var8 == 1) {
            var9.method679();
        } else if (var8 == 2) {
            var9.method658();
        } else if (var8 == 3) {
            var9.method673();
        }
        return var9;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 83)
    public static final void method310(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1149++;
        while (true) {
            label289: do {
                while (class24.method143(507)) {
                    if (class131.field3169 != -1 && class66.field1627 == class131.field3169) {
                        if (class137.field3334 == 85 && class125.field2958.method255(-10) > 0) {
                            class125.field2958 = class125.field2958.method242(0, -12448, class125.field2958.method255(-10) - 1);
                        }
                        continue label289;
                    }
                    if (class87.field1957) {
                        if (class137.field3334 == 85 && class125.field2969.method255(-10) > 0) {
                            class125.field2969 = class125.field2969.method242(0, arg0 ^ 0x309F, class125.field2969.method255(-10) - 1);
                            class122.field2880 = true;
                        }
                        if (class83.method553(12683, class14.field400) && class125.field2969.method255(-10) < 80) {
                            class125.field2969 = class125.field2969.method275(class14.field400, (byte) -102);
                            class122.field2880 = true;
                        }
                        if (class137.field3334 == 84) {
                            class87.field1957 = false;
                            class122.field2880 = true;
                            if (client.field473 == 1) {
                                long var1 = class125.field2969.method246(-126);
                                class82.method547(var1, -81);
                            }
                            if (client.field473 == 2 && class7.field181 > 0) {
                                long var3 = class125.field2969.method246(76);
                                class74.method506(-41, var3);
                            }
                            if (client.field473 == 3 && class125.field2969.method255(arg0 ^ 0x9) > 0) {
                                class92.field2094.method290((byte) 0, 79);
                                class92.field2094.method756(0, 1);
                                int var5 = class92.field2094.field2563;
                                class92.field2094.method793(class83.field1874, false);
                                class50.field1266++;
                                class70.method489(~arg0, class92.field2094, class125.field2969);
                                class92.field2094.method766(class92.field2094.field2563 - var5, arg0 ^ 0xFFFFFF85);
                                if (class94.field2163 == 2) {
                                    class131.field3175++;
                                    class90.field2030 = true;
                                    class94.field2163 = 1;
                                    class92.field2094.method290((byte) 0, 96);
                                    class92.field2094.method756(class1.field23, 1);
                                    class92.field2094.method756(class94.field2163, arg0 + 2);
                                    class92.field2094.method756(class76.field1765, 1);
                                }
                            }
                            if (client.field473 == 4 && class42.field1065 < 100) {
                                long var6 = class125.field2969.method246(-45);
                                class24.method145((byte) 121, var6);
                            }
                            if (client.field473 == 5 && class42.field1065 > 0) {
                                long var8 = class125.field2969.method246(61);
                                class23.method136(var8, (byte) -110);
                            }
                        }
                    } else if (class53.field1347 == 1) {
                        if (class137.field3334 == 85 && class125.field2965.method255(-10) > 0) {
                            class125.field2965 = class125.field2965.method242(0, -12448, class125.field2965.method255(-10) - 1);
                            class122.field2880 = true;
                        }
                        if (class103.method737(class14.field400, (byte) -72) && class125.field2965.method255(-10) < 10) {
                            class125.field2965 = class125.field2965.method275(class14.field400, (byte) -107);
                            class122.field2880 = true;
                        }
                        if (class137.field3334 == 84) {
                            if (class125.field2965.method255(-10) > 0) {
                                class52.field1330++;
                                int var18 = 0;
                                if (class125.field2965.method274(70)) {
                                    var18 = class125.field2965.method239(10505);
                                }
                                class92.field2094.method290((byte) 0, 111);
                                class92.field2094.method761(var18, -23644);
                            }
                            class122.field2880 = true;
                            class53.field1347 = 0;
                        }
                    } else if (class53.field1347 == 2) {
                        if (class137.field3334 == 85 && class125.field2965.method255(arg0 - 9) > 0) {
                            class125.field2965 = class125.field2965.method242(0, -12448, class125.field2965.method255(-10) - 1);
                            class122.field2880 = true;
                        }
                        if ((class76.method513(-22491, class14.field400) || class14.field400 == 32) && class125.field2965.method255(-10) < 12) {
                            class125.field2965 = class125.field2965.method275(class14.field400, (byte) -100);
                            class122.field2880 = true;
                        }
                        if (class137.field3334 == 84) {
                            if (class125.field2965.method255(-10) > 0) {
                                class18.field442++;
                                class92.field2094.method290((byte) 0, 225);
                                class92.field2094.method793(class125.field2965.method246(57), false);
                            }
                            class122.field2880 = true;
                            class53.field1347 = 0;
                        }
                    } else if (class53.field1347 == 3) {
                        if (class137.field3334 == 85 && class125.field2965.method255(-10) > 0) {
                            class125.field2965 = class125.field2965.method242(0, -12448, class125.field2965.method255(-10) - 1);
                            class122.field2880 = true;
                        }
                        if (class83.method553(12683, class14.field400) && class125.field2965.method255(arg0 ^ 0x9) < 40) {
                            class125.field2965 = class125.field2965.method275(class14.field400, (byte) -127);
                            class122.field2880 = true;
                        }
                    } else if (class108.field2624 == -1 && class94.field2161 == -1) {
                        if (class137.field3334 == 85 && class125.field2976.method255(-10) > 0) {
                            class125.field2976 = class125.field2976.method242(0, arg0 - 12447, class125.field2976.method255(-10) + -1);
                            class122.field2880 = true;
                        }
                        if (class83.method553(12683, class14.field400) && class125.field2976.method255(arg0 ^ 0x9) < 80) {
                            class125.field2976 = class125.field2976.method275(class14.field400, (byte) -124);
                            class122.field2880 = true;
                        }
                        if (class137.field3334 == 84 && class125.field2976.method255(-10) > 0) {
                            if (class107.field2610 == 2) {
                                if (class125.field2976.method269(class7.field177, -62)) {
                                    class4.method27((byte) -123);
                                }
                                if (class125.field2976.method269(class18.field445, -62)) {
                                    class122.field2871 = true;
                                }
                                if (class125.field2976.method269(class10.field245, arg0 ^ 0x3D)) {
                                    class122.field2871 = false;
                                }
                                if (class125.field2976.method269(class137.field3341, -62)) {
                                    for (int var10 = 0; var10 < 4; var10++) {
                                        for (int var11 = 1; var11 < 103; var11++) {
                                            for (int var12 = 1; var12 < 103; var12++) {
                                                class54.field1392[var10].field2367[var11][var12] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class125.field2976.method269(class115.field2767, -62) && class50.field1283 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class125.field2976.method269(class29.field616, arg0 - 61)) {
                                    class98.field2334 = true;
                                }
                            }
                            if (class125.field2976.method276(36, class88.field2000)) {
                                class48.field1204++;
                                class92.field2094.method290((byte) 0, 220);
                                class92.field2094.method756(class125.field2976.method255(-10) - 1, 1);
                                class92.field2094.method789(true, class125.field2976.method240(-28427, 2));
                            } else {
                                class107.field2614++;
                                byte var13 = 0;
                                class40 var14 = class125.field2976.method267(114);
                                if (var14.method276(36, class16.field425)) {
                                    var13 = 0;
                                    class125.field2976 = class125.field2976.method240(-28427, class16.field425.method255(-10));
                                } else if (var14.method276(36, class65.field1591)) {
                                    var13 = 1;
                                    class125.field2976 = class125.field2976.method240(-28427, class65.field1591.method255(arg0 ^ 0x9));
                                } else if (var14.method276(36, class7.field188)) {
                                    class125.field2976 = class125.field2976.method240(arg0 ^ 0x6F0A, class7.field188.method255(-10));
                                    var13 = 2;
                                } else if (var14.method276(36, class98.field2320)) {
                                    var13 = 3;
                                    class125.field2976 = class125.field2976.method240(-28427, class98.field2320.method255(-10));
                                } else if (var14.method276(arg0 ^ 0xFFFFFFDB, class14.field371)) {
                                    var13 = 4;
                                    class125.field2976 = class125.field2976.method240(-28427, class14.field371.method255(-10));
                                } else if (var14.method276(36, class130.field3149)) {
                                    class125.field2976 = class125.field2976.method240(-28427, class130.field3149.method255(-10));
                                    var13 = 5;
                                } else if (var14.method276(36, class35.field886)) {
                                    class125.field2976 = class125.field2976.method240(-28427, class35.field886.method255(arg0 - 9));
                                    var13 = 6;
                                } else if (var14.method276(36, class126.field3015)) {
                                    var13 = 7;
                                    class125.field2976 = class125.field2976.method240(arg0 - 28426, class126.field3015.method255(-10));
                                } else if (var14.method276(36, class56.field1456)) {
                                    var13 = 8;
                                    class125.field2976 = class125.field2976.method240(arg0 ^ 0x6F0A, class56.field1456.method255(-10));
                                } else if (var14.method276(36, class43.field1091)) {
                                    var13 = 9;
                                    class125.field2976 = class125.field2976.method240(-28427, class43.field1091.method255(-10));
                                } else if (var14.method276(arg0 + 37, class11.field295)) {
                                    var13 = 10;
                                    class125.field2976 = class125.field2976.method240(arg0 ^ 0x6F0A, class11.field295.method255(-10));
                                } else if (var14.method276(36, class54.field1386)) {
                                    class125.field2976 = class125.field2976.method240(arg0 - 28426, class54.field1386.method255(-10));
                                    var13 = 11;
                                }
                                byte var15 = 0;
                                class40 var16 = class125.field2976.method267(110);
                                if (var16.method276(arg0 ^ 0xFFFFFFDB, class4.field100)) {
                                    var15 = 1;
                                    class125.field2976 = class125.field2976.method240(-28427, class4.field100.method255(arg0 ^ 0x9));
                                } else if (var16.method276(arg0 ^ 0xFFFFFFDB, class136.field3316)) {
                                    var15 = 2;
                                    class125.field2976 = class125.field2976.method240(-28427, class136.field3316.method255(arg0 ^ 0x9));
                                } else if (var16.method276(36, class56.field1450)) {
                                    class125.field2976 = class125.field2976.method240(-28427, class56.field1450.method255(arg0 ^ 0x9));
                                    var15 = 3;
                                } else if (var16.method276(arg0 ^ 0xFFFFFFDB, class86.field1914)) {
                                    var15 = 4;
                                    class125.field2976 = class125.field2976.method240(-28427, class86.field1914.method255(-10));
                                } else if (var16.method276(arg0 + 37, field1143)) {
                                    var15 = 5;
                                    class125.field2976 = class125.field2976.method240(-28427, field1143.method255(-10));
                                }
                                class92.field2094.method290((byte) 0, 161);
                                class92.field2094.method756(0, 1);
                                int var17 = class92.field2094.field2563;
                                class92.field2094.method756(var13, 1);
                                class92.field2094.method756(var15, 1);
                                class70.method489(0, class92.field2094, class125.field2976);
                                class92.field2094.method766(class92.field2094.field2563 - var17, 122);
                                if (class1.field23 == 2) {
                                    class1.field23 = 3;
                                    class90.field2030 = true;
                                    class131.field3175++;
                                    class92.field2094.method290((byte) 0, 96);
                                    class92.field2094.method756(class1.field23, 1);
                                    class92.field2094.method756(class94.field2163, arg0 ^ 0xFFFFFFFE);
                                    class92.field2094.method756(class76.field1765, 1);
                                }
                            }
                            class122.field2880 = true;
                            class125.field2976 = class125.field2966;
                        }
                    }
                }
                return;
            } while (!class76.method513(-22491, class14.field400) && class14.field400 != 32);
            if (class125.field2958.method255(-10) < 12) {
                class125.field2958 = class125.field2958.method275(class14.field400, (byte) -116);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwe;ZI)V", line = 575)
    public static final void method311(class137 arg0, boolean arg1, int arg2) {
        field1157++;
        if (class16.field416 != null) {
            try {
                class16.field416.method1079(true);
            } catch (Exception var8) {
            }
            class16.field416 = null;
        }
        class16.field416 = arg0;
        class110.method858(1, arg1);
        class10.field251 = 0;
        class129.field3080 = null;
        field1138 = null;
        class113.field2739.field2563 = 0;
        while (true) {
            class85 var3 = (class85) class38.field939.method139(114);
            if (var3 == null) {
                while (true) {
                    class85 var4 = (class85) class35.field899.method139(116);
                    if (var4 == null) {
                        if (class129.field3082 != 0) {
                            try {
                                class104 var5 = new class104(4);
                                var5.method756(4, arg2 ^ 0x3);
                                var5.method756(class129.field3082, 1);
                                var5.method768(0, arg2 + 123);
                                class16.field416.method1086(0, var5.field2554, 4, (byte) 122);
                            } catch (IOException var7) {
                                try {
                                    class16.field416.method1079(true);
                                } catch (Exception var6) {
                                }
                                class16.field416 = null;
                                class112.field2713++;
                            }
                        }
                        client.field471 = 0;
                        class58.field1486 = class98.method683(arg2 ^ arg2);
                        return;
                    }
                    class91.field2054.method509(var4, -81);
                    class128.field3027.method144(var4, var4.field2647, 17348);
                    class104.field2506++;
                    class50.field1264--;
                }
            }
            class35.field898.method144(var3, var3.field2647, arg2 + 17346);
            class110.field2678--;
            class61.field1516++;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/lang/Object;IILee;II)V", line = 662)
    public static final void method312(Object[] arg0, int arg1, int arg2, class30 arg3, int arg4, int arg5) {
        int var6 = (Integer) arg0[0];
        field1154++;
        class107 var7 = class86.method562(var6, (byte) 126);
        if (var7 == null) {
            return;
        }
        int var8 = 0;
        int var9 = 0;
        if (arg4 < 47) {
            method312(null, -10, 44, null, 95, 37);
        }
        int var10 = -1;
        boolean var11 = true;
        int[] var12 = var7.field2597;
        int[] var13 = var7.field2609;
        try {
            int var14 = 0;
            int var15 = 0;
            class51.field1308 = new int[var7.field2602];
            class85.field1893 = new class40[var7.field2613];
            for (int var16 = 1; var16 < arg0.length; var16++) {
                if (arg0[var16] instanceof Integer) {
                    int var17 = (Integer) arg0[var16];
                    if (var17 == -2147483647) {
                        var17 = arg2;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg1;
                    }
                    if (var17 == -2147483645) {
                        if (arg3.field704 < 0) {
                            var17 = arg3.field722;
                        } else {
                            var17 = arg3.field704;
                        }
                    }
                    if (var17 == -2147483644) {
                        var17 = arg5;
                    }
                    if (var17 == -2147483643) {
                        if (arg3.field704 >= 0) {
                            var17 = -1;
                        } else {
                            var17 = arg3.field704 & 0x7FFF;
                        }
                    }
                    class51.field1308[var14++] = var17;
                } else if (arg0[var16] instanceof class40) {
                    class85.field1893[var15++] = (class40) arg0[var16];
                }
            }
            label1186: while (true) {
                var10++;
                int var18 = var13[var10];
                if (var18 < 100) {
                    if (var18 == 0) {
                        class65.field1589[var8++] = var12[var10];
                        continue;
                    }
                    if (var18 == 1) {
                        int var19 = var12[var10];
                        class65.field1589[var8++] = class48.field1209[var19];
                        continue;
                    }
                    if (var18 == 2) {
                        int var20 = var12[var10];
                        var8--;
                        class48.field1209[var20] = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 3) {
                        class135.field3308[var9++] = var7.field2620[var10];
                        continue;
                    }
                    if (var18 == 6) {
                        var10 += var12[var10];
                        continue;
                    }
                    if (var18 == 7) {
                        var8 -= 2;
                        if (class65.field1589[var8 + 1] != class65.field1589[var8]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var18 == 8) {
                        var8 -= 2;
                        if (class65.field1589[var8 + 1] == class65.field1589[var8]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var18 == 9) {
                        var8 -= 2;
                        if (class65.field1589[var8] < class65.field1589[var8 + 1]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var18 == 10) {
                        var8 -= 2;
                        if (class65.field1589[var8] > class65.field1589[var8 + 1]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var18 == 21) {
                        if (class53.field1338 == 0) {
                            return;
                        }
                        class106 var21 = class38.field943[--class53.field1338];
                        var10 = var21.field2576;
                        var7 = var21.field2583;
                        class85.field1893 = var21.field2596;
                        var12 = var7.field2597;
                        class51.field1308 = var21.field2590;
                        var13 = var7.field2609;
                        continue;
                    }
                    if (var18 == 25) {
                        int var22 = var12[var10];
                        class65.field1589[var8++] = class4.method29((byte) -90, var22);
                        continue;
                    }
                    if (var18 == 27) {
                        int var23 = var12[var10];
                        var8--;
                        class24.method141(var23, class65.field1589[var8], -122);
                        continue;
                    }
                    if (var18 == 31) {
                        var8 -= 2;
                        if (class65.field1589[var8] <= class65.field1589[var8 + 1]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var18 == 32) {
                        var8 -= 2;
                        if (class65.field1589[var8 + 1] <= class65.field1589[var8]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var18 == 33) {
                        class65.field1589[var8++] = class51.field1308[var12[var10]];
                        continue;
                    }
                    int var10001;
                    if (var18 == 34) {
                        var10001 = var12[var10];
                        var8--;
                        class51.field1308[var10001] = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 35) {
                        class135.field3308[var9++] = class85.field1893[var12[var10]];
                        continue;
                    }
                    if (var18 == 36) {
                        var10001 = var12[var10];
                        var9--;
                        class85.field1893[var10001] = class135.field3308[var9];
                        continue;
                    }
                    if (var18 == 37) {
                        int var24 = var12[var10];
                        var9 -= var24;
                        class40 var25 = class131.method1038((byte) 59, var9, var24, class135.field3308);
                        class135.field3308[var9++] = var25;
                        continue;
                    }
                    if (var18 == 38) {
                        var8--;
                        continue;
                    }
                    if (var18 == 39) {
                        var9--;
                        continue;
                    }
                    if (var18 == 40) {
                        int var26 = var12[var10];
                        class107 var27 = class86.method562(var26, (byte) 122);
                        int[] var28 = new int[var27.field2602];
                        class40[] var29 = new class40[var27.field2613];
                        for (int var30 = 0; var30 < var27.field2616; var30++) {
                            var28[var30] = class65.field1589[var8 + var30 - var27.field2616];
                        }
                        for (int var31 = 0; var31 < var27.field2607; var31++) {
                            var29[var31] = class135.field3308[var9 + var31 - var27.field2607];
                        }
                        var9 -= var27.field2607;
                        var8 -= var27.field2616;
                        class106 var32 = new class106();
                        var32.field2590 = class51.field1308;
                        var32.field2576 = var10;
                        var10 = -1;
                        var32.field2596 = class85.field1893;
                        var32.field2583 = var7;
                        class38.field943[class53.field1338++] = var32;
                        class85.field1893 = var29;
                        var7 = var27;
                        var13 = var27.field2609;
                        class51.field1308 = var28;
                        var12 = var27.field2597;
                        continue;
                    }
                    if (var18 == 42) {
                        class65.field1589[var8++] = class58.field1485[var12[var10]];
                        continue;
                    }
                    if (var18 == 43) {
                        var10001 = var12[var10];
                        var8--;
                        class58.field1485[var10001] = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 44) {
                        int var33 = var12[var10] & 0xFFFF;
                        int var34 = var12[var10] >> 16;
                        var8--;
                        int var35 = class65.field1589[var8];
                        if (var35 >= 0 && var35 <= 5000) {
                            class126.field2987[var34] = var35;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label1186;
                                }
                                class122.field2875[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var18 == 45) {
                        var8--;
                        int var38 = class65.field1589[var8];
                        int var39 = var12[var10];
                        if (var38 >= 0 && var38 < class126.field2987[var39]) {
                            class65.field1589[var8++] = class122.field2875[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var18 == 46) {
                        var8 -= 2;
                        int var40 = var12[var10];
                        int var41 = class65.field1589[var8];
                        if (var41 >= 0 && class126.field2987[var40] > var41) {
                            class122.field2875[var40][var41] = class65.field1589[var8 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var42;
                if (var12[var10] == 1) {
                    var42 = true;
                } else {
                    var42 = false;
                }
                if (var18 < 1000) {
                    if (var18 == 100) {
                        var8 -= 3;
                        int var176 = class65.field1589[var8 + 1];
                        int var177 = class65.field1589[var8];
                        int var178 = class65.field1589[var8 + 2];
                        class30 var179 = class14.method86(var177, false);
                        if (var179.field745 == null) {
                            var179.field745 = new class30[var178 + 1];
                        }
                        if (var178 >= var179.field745.length) {
                            class30[] var180 = new class30[var178 + 1];
                            for (int var181 = 0; var181 < var179.field745.length; var181++) {
                                var180[var181] = var179.field745[var181];
                            }
                            var179.field745 = var180;
                        }
                        class30 var182 = new class30();
                        var182.field722 = var179.field704;
                        var182.field644 = true;
                        var182.field704 = Integer.MIN_VALUE + ((var179.field704 & 0xFFFF) << 15) + var178;
                        var182.field660 = var176;
                        var179.field745[var178] = var182;
                        if (var42) {
                            class88.field1999 = var182;
                        } else {
                            class60.field1505 = var182;
                        }
                        class113.method876(var179, -25);
                        continue;
                    }
                    if (var18 == 101) {
                        class30 var183 = var42 ? class88.field1999 : class60.field1505;
                        class30 var184 = class14.method86(var183.field722, false);
                        var184.field745[class101.method709(var183.field704, 32767)] = null;
                        class113.method876(var184, -25);
                        continue;
                    }
                    if (var18 == 102) {
                        var8--;
                        class30 var185 = class14.method86(class65.field1589[var8], false);
                        var185.field745 = null;
                        class113.method876(var185, -25);
                        continue;
                    }
                } else if (var18 >= 1000 && var18 < 1100 || !(var18 < 2000 || var18 >= 2100)) {
                    class30 var43;
                    if (var18 >= 2000) {
                        var8--;
                        var43 = class14.method86(class65.field1589[var8], false);
                        var18 -= 1000;
                    } else {
                        var43 = var42 ? class88.field1999 : class60.field1505;
                    }
                    class113.method876(var43, -25);
                    if (var18 == 1000) {
                        var8 -= 2;
                        var43.field683 = class65.field1589[var8];
                        var43.field688 = class65.field1589[var8 + 1];
                        continue;
                    }
                    if (var18 == 1001) {
                        var8 -= 2;
                        var43.field700 = class65.field1589[var8];
                        var43.field684 = class65.field1589[var8 + 1];
                        continue;
                    }
                    if (var18 == 1003) {
                        var8--;
                        var43.field638 = class65.field1589[var8] == 1;
                        continue;
                    }
                    if (var18 == 1004) {
                        var8--;
                        var43.field655 = class65.field1589[var8] == 1;
                        continue;
                    }
                } else if (var18 >= 1100 && var18 < 1200 || var18 >= 2100 && var18 < 2200) {
                    class30 var44;
                    if (var18 < 2000) {
                        var44 = var42 ? class88.field1999 : class60.field1505;
                    } else {
                        var18 -= 1000;
                        var8--;
                        var44 = class14.method86(class65.field1589[var8], false);
                    }
                    class113.method876(var44, -25);
                    if (var18 == 1100) {
                        var8 -= 2;
                        var44.field718 = class65.field1589[var8];
                        var44.field697 = class65.field1589[var8 + 1];
                        continue;
                    }
                    if (var18 == 1101) {
                        var8--;
                        var44.field654 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1102) {
                        var8--;
                        var44.field720 = class65.field1589[var8] == 1;
                        continue;
                    }
                    if (var18 == 1103) {
                        var8--;
                        var44.field724 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1104) {
                        var8--;
                        var44.field648 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1105) {
                        var8--;
                        var44.field677 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1106) {
                        var8--;
                        var44.field686 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1107) {
                        var8--;
                        var44.field698 = class65.field1589[var8] == 1;
                        continue;
                    }
                    if (var18 == 1108) {
                        var44.field647 = 1;
                        var8--;
                        var44.field701 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1109) {
                        var8 -= 6;
                        var44.field680 = class65.field1589[var8];
                        var44.field730 = class65.field1589[var8 + 1];
                        var44.field658 = class65.field1589[var8 + 2];
                        var44.field646 = class65.field1589[var8 + 3];
                        var44.field746 = class65.field1589[var8 + 4];
                        var44.field645 = class65.field1589[var8 + 5];
                        continue;
                    }
                    if (var18 == 1110) {
                        var8--;
                        var44.field749 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1111) {
                        var8--;
                        var44.field665 = class65.field1589[var8] == 1;
                        continue;
                    }
                    if (var18 == 1112) {
                        var9--;
                        var44.field726 = class135.field3308[var9];
                        continue;
                    }
                    if (var18 == 1113) {
                        var8--;
                        var44.field682 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1114) {
                        var8 -= 3;
                        var44.field643 = class65.field1589[var8];
                        var44.field715 = class65.field1589[var8 + 1];
                        var44.field727 = class65.field1589[var8 + 2];
                        continue;
                    }
                    if (var18 == 1115) {
                        var8--;
                        var44.field717 = class65.field1589[var8] == 1;
                        continue;
                    }
                    if (var18 == 1116) {
                        var8--;
                        var44.field662 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1117) {
                        var8--;
                        var44.field652 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1118) {
                        var8--;
                        var44.field679 = class65.field1589[var8] == 1;
                        continue;
                    }
                    if (var18 == 1119) {
                        var8--;
                        var44.field671 = class65.field1589[var8] == 1;
                        continue;
                    }
                } else if (var18 >= 1200 && var18 < 1300 || !(var18 < 2200 || var18 >= 2300)) {
                    class30 var45;
                    if (var18 >= 2000) {
                        var8--;
                        var45 = class14.method86(class65.field1589[var8], false);
                        var18 -= 1000;
                    } else {
                        var45 = var42 ? class88.field1999 : class60.field1505;
                    }
                    class113.method876(var45, -25);
                    if (var18 == 1200) {
                        var8 -= 2;
                        int var46 = class65.field1589[var8];
                        int var47 = class65.field1589[var8 + 1];
                        var45.field753 = var47;
                        var45.field675 = var46;
                        continue;
                    }
                    if (var18 == 1201) {
                        var45.field647 = 2;
                        var8--;
                        var45.field701 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1202) {
                        var45.field647 = 3;
                        var45.field701 = class13.field332.field2217.method861((byte) -90);
                        continue;
                    }
                    if (var18 == 1203) {
                        class30 var48 = var42 ? class60.field1505 : class88.field1999;
                        var45.field758 = var48.field704;
                        continue;
                    }
                } else if (var18 >= 1300 && var18 < 1400 || !(var18 < 2300 || var18 >= 2400)) {
                    class30 var168;
                    if (var18 >= 2000) {
                        var8--;
                        var168 = class14.method86(class65.field1589[var8], false);
                        var18 -= 1000;
                    } else {
                        var168 = var42 ? class88.field1999 : class60.field1505;
                    }
                    if (var18 >= 1300 && var18 <= 1309 || var18 >= 1314 && var18 <= 1318 || var18 == 1320 || var18 == 1324) {
                        var9--;
                        class40 var169 = class135.field3308[var9];
                        Object[] var170 = new Object[var169.method255(-10) + 1];
                        for (int var171 = var170.length - 1; var171 >= 1; var171--) {
                            if (var169.method249((byte) -66, var171 - 1) == 115) {
                                var9--;
                                var170[var171] = class135.field3308[var9];
                            } else {
                                var8--;
                                var170[var171] = Integer.valueOf(class65.field1589[var8]);
                            }
                        }
                        var8--;
                        var170[0] = Integer.valueOf(class65.field1589[var8]);
                        if (var18 == 1324) {
                            var168.field703 = var170;
                        }
                        if (var18 == 1315) {
                            var168.field731 = var170;
                        }
                        if (var18 == 1307) {
                            var168.field650 = var170;
                        }
                        if (var18 == 1301) {
                            var168.field667 = var170;
                        }
                        if (var18 == 1309) {
                            var168.field723 = var170;
                        }
                        if (var18 == 1305) {
                            var168.field659 = var170;
                        }
                        if (var18 == 1306) {
                            var168.field739 = var170;
                        }
                        if (var18 == 1314) {
                            var168.field735 = var170;
                        }
                        if (var18 == 1302) {
                            var168.field760 = var170;
                        }
                        if (var18 == 1308) {
                            var168.field641 = var170;
                        }
                        if (var18 == 1317) {
                            var168.field755 = var170;
                        }
                        if (var18 == 1316) {
                            var168.field740 = var170;
                        }
                        if (var18 == 1304) {
                            var168.field721 = var170;
                        }
                        if (var18 == 1320) {
                            var168.field699 = var170;
                        }
                        if (var18 == 1303) {
                            var168.field736 = var170;
                        }
                        if (var18 == 1318) {
                            var168.field707 = var170;
                        }
                        continue;
                    }
                    if (var18 == 1310) {
                        var8--;
                        int var172 = class65.field1589[var8] - 1;
                        if (var172 >= 0 && var172 <= 9) {
                            if (var168.field743 == null || var168.field743.length <= var172) {
                                class40[] var173 = new class40[var172 + 1];
                                if (var168.field743 != null) {
                                    for (int var174 = 0; var174 < var168.field743.length; var174++) {
                                        var173[var174] = var168.field743[var174];
                                    }
                                }
                                var168.field743 = var173;
                            }
                            var9--;
                            class40 var175 = class135.field3308[var9];
                            if (var175.method255(-10) == 0) {
                                var175 = null;
                            }
                            var168.field743[var172] = var175;
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var18 == 1311) {
                        var8--;
                        var168.field758 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1312) {
                        var8--;
                        var168.field649 = class65.field1589[var8] == 1;
                        continue;
                    }
                    if (var18 == 1313) {
                        var8--;
                        var168.field657 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1319) {
                        var8--;
                        var168.field669 = class65.field1589[var8];
                        continue;
                    }
                    if (var18 == 1321) {
                        class91.method613(2);
                        var8--;
                        class107.field2618 = class65.field1589[var8];
                        var9--;
                        class2.field39 = class135.field3308[var9];
                        class4.field76 = client.method114(true, new class40[] { var168.field668, class29.field621 });
                        class137.field3344 = 0;
                        class110.field2682 = 1;
                        if (var168.field704 < 0) {
                            class126.field2990 = var168.field722;
                            class58.field1477 = var168.field704 & 0x7FFF;
                        } else {
                            class126.field2990 = var168.field704;
                            class58.field1477 = -1;
                        }
                        field1124 = true;
                        continue;
                    }
                    if (var18 == 1322) {
                        var9--;
                        var168.field668 = class135.field3308[var9];
                        continue;
                    }
                    if (var18 == 1323) {
                        var8--;
                        var168.field666 = class65.field1589[var8] == 1;
                        continue;
                    }
                } else if (var18 < 1500) {
                    if (var18 == 1400) {
                        var8 -= 2;
                        int var155 = class65.field1589[var8];
                        int var156 = class65.field1589[var8 + 1];
                        class30 var157 = class14.method86(var155, false);
                        if (var157.field745 != null && var156 < var157.field745.length && var157.field745[var156] != null) {
                            class65.field1589[var8++] = 1;
                            if (var42) {
                                class88.field1999 = var157.field745[var156];
                            } else {
                                class60.field1505 = var157.field745[var156];
                            }
                            continue;
                        }
                        class65.field1589[var8++] = 0;
                        continue;
                    }
                    if (var18 == 1401) {
                        var8 -= 4;
                        int var158 = class65.field1589[var8];
                        int var159 = class65.field1589[var8 + 2];
                        int var160 = class65.field1589[var8 + 1];
                        boolean var161 = class65.field1589[var8 + 3] == 1;
                        class30 var162 = class77.method519(var161, var159, -1, class129.field3093[var158], var160, 0, true, -728, 0);
                        if (var162 == null) {
                            class65.field1589[var8++] = 0;
                        } else {
                            class65.field1589[var8++] = 1;
                            if (var42) {
                                class88.field1999 = var162;
                            } else {
                                class60.field1505 = var162;
                            }
                        }
                        continue;
                    }
                    if (var18 == 1402) {
                        var8 -= 4;
                        class30 var163 = class14.method86(class65.field1589[var8], false);
                        int var164 = class65.field1589[var8 + 2];
                        int var165 = class65.field1589[var8 + 1];
                        boolean var166 = class65.field1589[var8 + 3] == 1;
                        class30 var167 = class77.method519(var166, var164, var163.field704, var163.field745, var165, var163.field697, true, -728, var163.field718);
                        if (var167 == null) {
                            class65.field1589[var8++] = 0;
                        } else {
                            class65.field1589[var8++] = 1;
                            if (var42) {
                                class88.field1999 = var167;
                            } else {
                                class60.field1505 = var167;
                            }
                        }
                        continue;
                    }
                } else if (var18 < 1600) {
                    class30 var49 = var42 ? class88.field1999 : class60.field1505;
                    if (var18 == 1500) {
                        class65.field1589[var8++] = var49.field683;
                        continue;
                    }
                    if (var18 == 1501) {
                        class65.field1589[var8++] = var49.field688;
                        continue;
                    }
                    if (var18 == 1502) {
                        class65.field1589[var8++] = var49.field700;
                        continue;
                    }
                    if (var18 == 1503) {
                        class65.field1589[var8++] = var49.field684;
                        continue;
                    }
                    if (var18 == 1504) {
                        class65.field1589[var8++] = var49.field638 ? 1 : 0;
                        continue;
                    }
                    if (var18 == 1505) {
                        class65.field1589[var8++] = var49.field722;
                        continue;
                    }
                } else if (var18 < 1700) {
                    class30 var154 = var42 ? class88.field1999 : class60.field1505;
                    if (var18 == 1600) {
                        class65.field1589[var8++] = var154.field718;
                        continue;
                    }
                    if (var18 == 1601) {
                        class65.field1589[var8++] = var154.field697;
                        continue;
                    }
                    if (var18 == 1602) {
                        class135.field3308[var9++] = var154.field726;
                        continue;
                    }
                } else if (var18 < 1800) {
                    class30 var50 = var42 ? class88.field1999 : class60.field1505;
                    if (var18 == 1700) {
                        class65.field1589[var8++] = var50.field675;
                        continue;
                    }
                    if (var18 == 1701) {
                        if (var50.field675 == -1) {
                            class65.field1589[var8++] = 0;
                        } else {
                            class65.field1589[var8++] = var50.field753;
                        }
                        continue;
                    }
                    if (var18 == 1702) {
                        class65.field1589[var8++] = class101.method709(var50.field704, 32767);
                        continue;
                    }
                } else if (var18 < 2500) {
                    if (var18 == 2401) {
                        var8 -= 4;
                        int var144 = class65.field1589[var8];
                        int var145 = class65.field1589[var8 + 1];
                        int var146 = class65.field1589[var8 + 2];
                        boolean var147 = class65.field1589[var8 + 3] == 1;
                        class30 var148 = class77.method519(var147, var146, -1, class129.field3093[var144], var145, 0, false, -728, 0);
                        if (var148 == null) {
                            class65.field1589[var8++] = -1;
                        } else {
                            class65.field1589[var8++] = var148.field704;
                        }
                        continue;
                    }
                    if (var18 == 2402) {
                        var8 -= 4;
                        class30 var149 = class14.method86(class65.field1589[var8], false);
                        int var150 = class65.field1589[var8 + 1];
                        int var151 = class65.field1589[var8 + 2];
                        boolean var152 = class65.field1589[var8 + 3] == 1;
                        class30 var153 = class77.method519(var152, var151, var149.field704, class129.field3093[var149.field704 >> 16], var150, var149.field697, false, -728, var149.field718);
                        if (var153 == null) {
                            class65.field1589[var8++] = -1;
                        } else {
                            class65.field1589[var8++] = var153.field704;
                        }
                        continue;
                    }
                } else if (var18 < 2600) {
                    var8--;
                    class30 var51 = class14.method86(class65.field1589[var8], false);
                    if (var18 == 2500) {
                        class65.field1589[var8++] = var51.field683;
                        continue;
                    }
                    if (var18 == 2501) {
                        class65.field1589[var8++] = var51.field688;
                        continue;
                    }
                    if (var18 == 2502) {
                        class65.field1589[var8++] = var51.field700;
                        continue;
                    }
                    if (var18 == 2503) {
                        class65.field1589[var8++] = var51.field684;
                        continue;
                    }
                    if (var18 == 2504) {
                        class65.field1589[var8++] = var51.field638 ? 1 : 0;
                        continue;
                    }
                    if (var18 == 2505) {
                        class65.field1589[var8++] = var51.field722;
                        continue;
                    }
                } else if (var18 < 2700) {
                    var8--;
                    class30 var52 = class14.method86(class65.field1589[var8], false);
                    if (var18 == 2600) {
                        class65.field1589[var8++] = var52.field718;
                        continue;
                    }
                    if (var18 == 2601) {
                        class65.field1589[var8++] = var52.field697;
                        continue;
                    }
                    if (var18 == 2602) {
                        class135.field3308[var9++] = var52.field726;
                        continue;
                    }
                } else if (var18 < 2800) {
                    var8--;
                    class30 var53 = class14.method86(class65.field1589[var8], false);
                    if (var18 == 2700) {
                        class65.field1589[var8++] = var53.field675;
                        continue;
                    }
                    if (var18 == 2701) {
                        if (var53.field675 == -1) {
                            class65.field1589[var8++] = 0;
                        } else {
                            class65.field1589[var8++] = var53.field753;
                        }
                        continue;
                    }
                } else if (var18 < 3100) {
                    if (var18 == 3000) {
                        var8--;
                        int var138 = class65.field1589[var8];
                        if (class56.field1447 == -1) {
                            class48.method372(var138, -1, 123);
                            class56.field1447 = var138;
                        }
                        continue;
                    }
                    if (var18 == 3001) {
                        var8 -= 2;
                        int var139 = class65.field1589[var8 + 1];
                        int var140 = class65.field1589[var8];
                        class66.method477(true, var139, -1, var140);
                        continue;
                    }
                    if (var18 == 3002) {
                        class30 var141 = var42 ? class88.field1999 : class60.field1505;
                        if (class56.field1447 == -1) {
                            class48.method372(var141.field722, var141.field704 & 0x7FFF, 72);
                            class56.field1447 = var141.field704;
                        }
                        continue;
                    }
                    if (var18 == 3003) {
                        class30 var142 = var42 ? class88.field1999 : class60.field1505;
                        var8--;
                        int var143 = class65.field1589[var8];
                        class66.method477(true, var143, var142.field704 & 0x7FFF, var142.field722);
                        continue;
                    }
                } else if (var18 < 3200) {
                    if (var18 == 3100) {
                        var9--;
                        class40 var54 = class135.field3308[var9];
                        class77.method521(class38.field942, var54, false, 0);
                        continue;
                    }
                    if (var18 == 3101) {
                        var8 -= 2;
                        class61.method449(class65.field1589[var8 + 1], class13.field332, (byte) -22, class65.field1589[var8]);
                        continue;
                    }
                    if (var18 == 3102) {
                        var8--;
                        int var55 = class65.field1589[var8];
                        if (var55 >= 0 && var55 < class107.field2604.length && class107.field2604[var55] != -1) {
                            field1124 = true;
                            class126.field3014 = var55;
                            class79.field1820 = true;
                        }
                        continue;
                    }
                    if (var18 == 3103) {
                        class50.method390((byte) -127);
                        continue;
                    }
                } else if (var18 < 3300) {
                    if (var18 == 3200) {
                        var8 -= 3;
                        class118.method907(class65.field1589[var8], class65.field1589[var8 + 1], class65.field1589[var8 + 2], 127);
                        continue;
                    }
                    if (var18 == 3201) {
                        var8--;
                        class101.method712((byte) -106, class65.field1589[var8]);
                        continue;
                    }
                    if (var18 == 3202) {
                        var8 -= 2;
                        class136.method1071(0, class65.field1589[var8 + 1], class65.field1589[var8]);
                        continue;
                    }
                } else if (var18 < 3400) {
                    if (var18 == 3300) {
                        class65.field1589[var8++] = class10.field242;
                        continue;
                    }
                    if (var18 == 3301) {
                        var8 -= 2;
                        int var129 = class65.field1589[var8];
                        int var130 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = class11.method61(var129, 8476, var130);
                        continue;
                    }
                    if (var18 == 3302) {
                        var8 -= 2;
                        int var131 = class65.field1589[var8];
                        int var132 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = class87.method574(-51, var131, var132);
                        continue;
                    }
                    if (var18 == 3303) {
                        var8 -= 2;
                        int var133 = class65.field1589[var8];
                        int var134 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = class125.method997(var133, 0, var134);
                        continue;
                    }
                    if (var18 == 3304) {
                        var8--;
                        int var135 = class65.field1589[var8];
                        class65.field1589[var8++] = class1.method8(1000, var135).field1789;
                        continue;
                    }
                    if (var18 == 3305) {
                        var8--;
                        int var136 = class65.field1589[var8];
                        class65.field1589[var8++] = class131.field3188[var136];
                        continue;
                    }
                    if (var18 == 3306) {
                        var8--;
                        int var137 = class65.field1589[var8];
                        class65.field1589[var8++] = class77.field1783[var137];
                        continue;
                    }
                } else if (var18 < 4100) {
                    if (var18 == 4000) {
                        var8 -= 2;
                        int var56 = class65.field1589[var8];
                        int var57 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = var56 + var57;
                        continue;
                    }
                    if (var18 == 4001) {
                        var8 -= 2;
                        int var58 = class65.field1589[var8];
                        int var59 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = var58 - var59;
                        continue;
                    }
                    if (var18 == 4002) {
                        var8 -= 2;
                        int var60 = class65.field1589[var8];
                        int var61 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = var60 * var61;
                        continue;
                    }
                    if (var18 == 4003) {
                        var8 -= 2;
                        int var62 = class65.field1589[var8 + 1];
                        int var63 = class65.field1589[var8];
                        class65.field1589[var8++] = var63 / var62;
                        continue;
                    }
                    if (var18 == 4004) {
                        var8--;
                        int var64 = class65.field1589[var8];
                        class65.field1589[var8++] = (int) ((double) var64 * Math.random());
                        continue;
                    }
                    if (var18 == 4005) {
                        var8--;
                        int var65 = class65.field1589[var8];
                        class65.field1589[var8++] = (int) (Math.random() * (double) (var65 + 1));
                        continue;
                    }
                    if (var18 == 4006) {
                        var8 -= 5;
                        int var66 = class65.field1589[var8];
                        int var67 = class65.field1589[var8 + 1];
                        int var68 = class65.field1589[var8 + 2];
                        int var69 = class65.field1589[var8 + 3];
                        int var70 = class65.field1589[var8 + 4];
                        class65.field1589[var8++] = (var67 - var66) * (-var68 + var70) / (var69 - var68) + var66;
                        continue;
                    }
                    if (var18 == 4007) {
                        var8 -= 2;
                        int var71 = class65.field1589[var8 + 1];
                        int var72 = class65.field1589[var8];
                        class65.field1589[var8++] = var72 + var71 * var72 / 100;
                        continue;
                    }
                    if (var18 == 4008) {
                        var8 -= 2;
                        int var73 = class65.field1589[var8];
                        int var74 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = class43.method294(0x1 << var74, var73);
                        continue;
                    }
                    if (var18 == 4009) {
                        var8 -= 2;
                        int var75 = class65.field1589[var8 + 1];
                        int var76 = class65.field1589[var8];
                        class65.field1589[var8++] = class101.method709(-(0x1 << var75) - 1, var76);
                        continue;
                    }
                    if (var18 == 4010) {
                        var8 -= 2;
                        int var77 = class65.field1589[var8 + 1];
                        int var78 = class65.field1589[var8];
                        class65.field1589[var8++] = class101.method709(0x1 << var77, var78) == 0 ? 0 : 1;
                        continue;
                    }
                    if (var18 == 4011) {
                        var8 -= 2;
                        int var79 = class65.field1589[var8 + 1];
                        int var80 = class65.field1589[var8];
                        class65.field1589[var8++] = var80 % var79;
                        continue;
                    }
                    if (var18 == 4012) {
                        var8 -= 2;
                        int var81 = class65.field1589[var8];
                        int var82 = class65.field1589[var8 + 1];
                        if (var81 == 0) {
                            class65.field1589[var8++] = 0;
                        } else {
                            class65.field1589[var8++] = (int) Math.pow((double) var81, (double) var82);
                        }
                        continue;
                    }
                    if (var18 == 4013) {
                        var8 -= 2;
                        int var83 = class65.field1589[var8 + 1];
                        int var84 = class65.field1589[var8];
                        if (var84 == 0) {
                            class65.field1589[var8++] = 0;
                        } else if (var83 == 0) {
                            class65.field1589[var8++] = Integer.MAX_VALUE;
                        } else {
                            class65.field1589[var8++] = (int) Math.pow((double) var84, 1.0D / (double) var83);
                        }
                        continue;
                    }
                    if (var18 == 4014) {
                        var8 -= 2;
                        int var85 = class65.field1589[var8];
                        int var86 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = class101.method709(var86, var85);
                        continue;
                    }
                    if (var18 == 4015) {
                        var8 -= 2;
                        int var87 = class65.field1589[var8];
                        int var88 = class65.field1589[var8 + 1];
                        class65.field1589[var8++] = class43.method294(var87, var88);
                        continue;
                    }
                } else if (var18 < 4200) {
                    if (var18 == 4100) {
                        var9--;
                        class40 var89 = class135.field3308[var9];
                        var8--;
                        int var90 = class65.field1589[var8];
                        class135.field3308[var9++] = client.method114(true, new class40[] { var89, class21.method121(23444, var90) });
                        continue;
                    }
                    if (var18 == 4101) {
                        var9 -= 2;
                        class40 var91 = class135.field3308[var9];
                        class40 var92 = class135.field3308[var9 + 1];
                        class135.field3308[var9++] = client.method114(true, new class40[] { var91, var92 });
                        continue;
                    }
                    if (var18 == 4102) {
                        var9--;
                        class40 var93 = class135.field3308[var9];
                        var8--;
                        int var94 = class65.field1589[var8];
                        class135.field3308[var9++] = client.method114(true, new class40[] { var93, class11.method62(var94, 10, true) });
                        continue;
                    }
                    if (var18 == 4103) {
                        var9--;
                        class40 var95 = class135.field3308[var9];
                        class135.field3308[var9++] = var95.method267(109);
                        continue;
                    }
                    if (var18 == 4104) {
                        var8--;
                        int var96 = class65.field1589[var8];
                        long var97 = (long) var96 * 86400000L + 1014768000000L;
                        class87.field1972.setTime(new Date(var97));
                        int var99 = class87.field1972.get(5);
                        int var100 = class87.field1972.get(2);
                        int var101 = class87.field1972.get(1);
                        class135.field3308[var9++] = client.method114(true, new class40[] { class21.method121(23444, var99), class49.field1247, class76.field1744[var100], class49.field1247, class21.method121(23444, var101) });
                        continue;
                    }
                    if (var18 == 4105) {
                        var9 -= 2;
                        class40 var102 = class135.field3308[var9 + 1];
                        class40 var103 = class135.field3308[var9];
                        if (class13.field332.field2217 != null && class13.field332.field2217.field2710) {
                            class135.field3308[var9++] = var102;
                            continue;
                        }
                        class135.field3308[var9++] = var103;
                        continue;
                    }
                    if (var18 == 4106) {
                        var8--;
                        int var104 = class65.field1589[var8];
                        class135.field3308[var9++] = class21.method121(23444, var104);
                        continue;
                    }
                    if (var18 == 4107) {
                        var9 -= 2;
                        class65.field1589[var8++] = class135.field3308[var9].method273(class135.field3308[var9 + 1], 1);
                        continue;
                    }
                    if (var18 == 4108) {
                        var8 -= 2;
                        var9--;
                        class40 var105 = class135.field3308[var9];
                        int var106 = class65.field1589[var8];
                        int var107 = class65.field1589[var8 + 1];
                        byte[] var108 = class90.field2042.method731(0, var107, (byte) -125);
                        class47 var109 = new class47(var108);
                        class65.field1589[var8++] = var109.method347(var105, var106);
                        continue;
                    }
                    if (var18 == 4109) {
                        var8 -= 2;
                        var9--;
                        class40 var110 = class135.field3308[var9];
                        int var111 = class65.field1589[var8];
                        int var112 = class65.field1589[var8 + 1];
                        byte[] var113 = class90.field2042.method731(0, var112, (byte) -102);
                        class47 var114 = new class47(var113);
                        class65.field1589[var8++] = var114.method356(var110, var111);
                        continue;
                    }
                } else if (var18 < 4300) {
                    if (var18 == 4200) {
                        var8--;
                        int var115 = class65.field1589[var8];
                        class135.field3308[var9++] = class132.method1041(var115, 123).field114;
                        continue;
                    }
                    if (var18 == 4201) {
                        var8 -= 2;
                        int var116 = class65.field1589[var8];
                        int var117 = class65.field1589[var8 + 1];
                        class4 var118 = class132.method1041(var116, 30);
                        if (var117 >= 1 && var117 <= 5 && var118.field80[var117 - 1] != null) {
                            class135.field3308[var9++] = var118.field80[var117 - 1];
                            continue;
                        }
                        class135.field3308[var9++] = class38.field942;
                        continue;
                    }
                    if (var18 == 4202) {
                        var8 -= 2;
                        int var119 = class65.field1589[var8 + 1];
                        int var120 = class65.field1589[var8];
                        class4 var121 = class132.method1041(var120, 101);
                        if (var119 >= 1 && var119 <= 5 && var121.field139[var119 - 1] != null) {
                            class135.field3308[var9++] = var121.field139[var119 - 1];
                            continue;
                        }
                        class135.field3308[var9++] = class38.field942;
                        continue;
                    }
                    if (var18 == 4203) {
                        var8--;
                        int var122 = class65.field1589[var8];
                        class65.field1589[var8++] = class132.method1041(var122, 37).field106;
                        continue;
                    }
                    if (var18 == 4204) {
                        var8--;
                        int var123 = class65.field1589[var8];
                        class65.field1589[var8++] = class132.method1041(var123, 30).field99 == 1 ? 1 : 0;
                        continue;
                    }
                    if (var18 == 4205) {
                        var8--;
                        int var124 = class65.field1589[var8];
                        class4 var125 = class132.method1041(var124, 20);
                        if (var125.field87 == -1 && var125.field107 >= 0) {
                            class65.field1589[var8++] = var125.field107;
                            continue;
                        }
                        class65.field1589[var8++] = var124;
                        continue;
                    }
                    if (var18 == 4206) {
                        var8--;
                        int var126 = class65.field1589[var8];
                        class4 var127 = class132.method1041(var126, 116);
                        if (var127.field87 >= 0 && var127.field107 >= 0) {
                            class65.field1589[var8++] = var127.field107;
                            continue;
                        }
                        class65.field1589[var8++] = var126;
                        continue;
                    }
                    if (var18 == 4207) {
                        var8--;
                        int var128 = class65.field1589[var8];
                        class65.field1589[var8++] = class132.method1041(var128, 77).field101 ? 1 : 0;
                        continue;
                    }
                }
                return;
            }
        } catch (Exception var186) {
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLh;ILqb;I)Lqb;", line = 2577)
    public final class97 method313(byte arg0, class45 arg1, int arg2, class97 arg3, int arg4) {
        int var6 = this.field1155[arg2];
        field1147++;
        class131 var7 = class48.method374(-20328, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method314(arg3, arg4, 1);
        }
        int var9 = arg1.field1155[arg4];
        class131 var10 = class48.method374(-20328, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (arg0 != 21) {
            this.method315(29);
        }
        if (var10 == null) {
            class97 var12 = arg3.method668(!var7.method1037((byte) 26, var8));
            var12.method652(var7, var8);
            return var12;
        } else {
            class97 var13 = arg3.method668(!var7.method1037((byte) 26, var8) & !var10.method1037((byte) 26, var11));
            var13.method667(var7, var8, var10, var11, this.field1136);
            return var13;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lqb;II)Lqb;", line = 2612)
    public final class97 method314(class97 arg0, int arg1, int arg2) {
        int var4 = this.field1155[arg1];
        field1132++;
        if (arg2 != 1) {
            return null;
        }
        class131 var5 = class48.method374(-20328, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method668(true);
        } else {
            class97 var7 = arg0.method668(!var5.method1037((byte) 26, var6));
            var7.method652(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 2634)
    public final void method315(int arg0) {
        if (this.field1127 == -1) {
            if (this.field1136 == null) {
                this.field1127 = 0;
            } else {
                this.field1127 = 2;
            }
        }
        if (arg0 != -7767) {
            this.field1128 = 18;
        }
        if (this.field1158 == -1) {
            if (this.field1136 == null) {
                this.field1158 = 0;
            } else {
                this.field1158 = 2;
            }
        }
        field1162++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILqb;B)Lqb;", line = 2678)
    public final class97 method316(int arg0, class97 arg1, byte arg2) {
        field1146++;
        int var4 = this.field1155[arg0];
        class131 var5 = class48.method374(-20328, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method668(true);
        }
        if (arg2 >= -50) {
            field1139 = null;
        }
        class131 var7 = null;
        int var8 = 0;
        if (this.field1148 != null && arg0 < this.field1148.length) {
            int var9 = this.field1148[arg0];
            var7 = class48.method374(-20328, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class97 var11 = arg1.method668(!var5.method1037((byte) 26, var6));
            var11.method652(var5, var6);
            return var11;
        } else {
            class97 var10 = arg1.method668(!var5.method1037((byte) 26, var6) & !var7.method1037((byte) 26, var8));
            var10.method652(var5, var6);
            var10.method652(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lrc;BI)V", line = 2735)
    private final void method317(class104 arg0, byte arg1, int arg2) {
        if (arg1 <= 73) {
            return;
        }
        if (arg2 == 1) {
            int var9 = arg0.method798((byte) -72);
            this.field1123 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1123[var10] = arg0.method797(-7916);
            }
            this.field1155 = new int[var9];
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1155[var11] = arg0.method797(-7916);
            }
            for (int var12 = 0; var12 < var9; var12++) {
                this.field1155[var12] += arg0.method797(-7916) << 16;
            }
        } else if (arg2 == 2) {
            this.field1142 = arg0.method797(-7916);
        } else if (arg2 == 3) {
            int var4 = arg0.method798((byte) -100);
            this.field1136 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1136[var5] = arg0.method798((byte) -101);
            }
            this.field1136[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field1150 = true;
        } else if (arg2 == 5) {
            this.field1125 = arg0.method798((byte) -53);
        } else if (arg2 == 6) {
            this.field1151 = arg0.method797(-7916);
        } else if (arg2 == 7) {
            this.field1134 = arg0.method797(-7916);
        } else if (arg2 == 8) {
            this.field1128 = arg0.method798((byte) -128);
        } else if (arg2 == 9) {
            this.field1127 = arg0.method798((byte) -58);
        } else if (arg2 == 10) {
            this.field1158 = arg0.method798((byte) -84);
        } else if (arg2 == 11) {
            this.field1159 = arg0.method798((byte) -45);
        } else if (arg2 == 12) {
            int var6 = arg0.method798((byte) -56);
            this.field1148 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1148[var7] = arg0.method797(-7916);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field1148[var8] += arg0.method797(-7916) << 16;
            }
        }
        field1153++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILrc;)V", line = 2867)
    public final void method318(int arg0, class104 arg1) {
        field1156++;
        if (arg0 != 0) {
            field1145 = -112;
        }
        while (true) {
            int var3 = arg1.method798((byte) -100);
            if (var3 == 0) {
                return;
            }
            this.method317(arg1, (byte) 124, var3);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lqb;IZ)Lqb;", line = 2914)
    public final class97 method319(class97 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return null;
        }
        field1131++;
        int var4 = this.field1155[arg1];
        class131 var5 = class48.method374(-20328, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method676(true);
        } else {
            class97 var7 = arg0.method676(!var5.method1037((byte) 26, var6));
            var7.method652(var5, var6);
            return var7;
        }
    }
}

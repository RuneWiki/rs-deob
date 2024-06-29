import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 extends class134 {

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public int field1281 = -1;

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
    public int field1306 = -1;

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
    public int field1297 = -1;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "I")
    public int field1295 = 2;

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
    public int field1305 = 99;

    @OriginalMember(owner = "client!h", name = "wb", descriptor = "Z")
    public boolean field1314 = false;

    @OriginalMember(owner = "client!h", name = "Ab", descriptor = "I")
    public int field1318 = -1;

    @OriginalMember(owner = "client!h", name = "zb", descriptor = "I")
    public int field1317 = 5;

    @OriginalMember(owner = "client!h", name = "Eb", descriptor = "I")
    public int field1322 = -1;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Lwd;")
    private static class150 field1287 = class2.method9(true, "Unable to connect)3");

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Lwd;")
    public static class150 field1286 = field1287;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "Lwd;")
    public static class150 field1290 = field1287;

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "Lwd;")
    public static class150 field1302 = class2.method9(true, ":duelreq:");

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "Lwd;")
    public static class150 field1303 = class2.method9(true, "sl_stars");

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "[I")
    public static int[] field1293 = new int[1000];

    @OriginalMember(owner = "client!h", name = "tb", descriptor = "Lwd;")
    private static class150 field1311 = class2.method9(true, "Service unavailable)3");

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "Lwd;")
    public static class150 field1296 = class2.method9(true, "Entfernen");

    @OriginalMember(owner = "client!h", name = "Cb", descriptor = "Lwd;")
    public static class150 field1320 = class2.method9(true, "null");

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "Lwd;")
    public static class150 field1300 = field1311;

    @OriginalMember(owner = "client!h", name = "Fb", descriptor = "I")
    public static int field1323 = -1;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!h", name = "vb", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!h", name = "xb", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!h", name = "Bb", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!h", name = "Db", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!h", name = "Gb", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!h", name = "ub", descriptor = "Lpd;")
    public static class108 field1312;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "Lcb;")
    public static class17 field1292;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "[I")
    public int[] field1288;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "[I")
    public int[] field1298;

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "[I")
    private int[] field1307;

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "[I")
    public int[] field1308;

    @OriginalMember(owner = "client!h", name = "sb", descriptor = "[I")
    private int[] field1310;

    @OriginalMember(owner = "client!h", name = "yb", descriptor = "[Lva;")
    public static class141[] field1316;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILwb;)V")
    public final void method359(int arg0, class148 arg1) {
        field1282++;
        while (true) {
            int var3 = arg1.method1137(255);
            if (var3 == 0) {
                if (arg0 == -28578) {
                    return;
                } else {
                    field1293 = null;
                    return;
                }
            }
            this.method360(arg1, arg0 + 57859, var3);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwb;II)V")
    private final void method360(class148 arg0, int arg1, int arg2) {
        if (arg1 != 29281) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg0.method1137(255);
            this.field1298 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1298[var5] = arg0.method1140(-1);
            }
            this.field1308 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1308[var6] = arg0.method1140(-1);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1308[var7] += arg0.method1140(-1) << 16;
            }
        } else if (arg2 == 2) {
            this.field1306 = arg0.method1140(-1);
        } else if (arg2 == 3) {
            int var8 = arg0.method1137(arg1 ^ 0x729E);
            this.field1310 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1310[var9] = arg0.method1137(255);
            }
            this.field1310[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field1314 = true;
        } else if (arg2 == 5) {
            this.field1317 = arg0.method1137(arg1 - 29026);
        } else if (arg2 == 6) {
            this.field1318 = arg0.method1140(-1);
        } else if (arg2 == 7) {
            this.field1281 = arg0.method1140(-1);
        } else if (arg2 == 8) {
            this.field1305 = arg0.method1137(255);
        } else if (arg2 == 9) {
            this.field1297 = arg0.method1137(255);
        } else if (arg2 == 10) {
            this.field1322 = arg0.method1137(255);
        } else if (arg2 == 11) {
            this.field1295 = arg0.method1137(255);
        } else if (arg2 == 12) {
            int var12 = arg0.method1137(255);
            this.field1307 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1307[var13] = arg0.method1140(-1);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field1307[var14] += arg0.method1140(-1) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method1137(255);
            this.field1288 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1288[var11] = arg0.method1152((byte) -53);
            }
        }
        field1304++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbe;III)Lbe;")
    public final class13 method361(class13 arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 74) {
            return null;
        }
        field1291++;
        int var5 = this.field1308[arg3];
        class133 var6 = class5.method35(var5 >> 16, 0);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method94(true);
        }
        int var8 = arg2 & 0x3;
        class13 var9 = arg0.method94(!var6.method995(var7, (byte) 6));
        if (var8 == 1) {
            var9.method93();
        } else if (var8 == 2) {
            var9.method90();
        } else if (var8 == 3) {
            var9.method98();
        }
        var9.method102(var6, var7);
        if (var8 == 1) {
            var9.method98();
        } else if (var8 == 2) {
            var9.method90();
        } else if (var8 == 3) {
            var9.method93();
        }
        return var9;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public final void method362(int arg0) {
        if (this.field1322 == -1) {
            if (this.field1310 == null) {
                this.field1322 = 0;
            } else {
                this.field1322 = 2;
            }
        }
        if (this.field1297 == -1) {
            if (this.field1310 == null) {
                this.field1297 = 0;
            } else {
                this.field1297 = 2;
            }
        }
        if (arg0 != -31093) {
            method365(-33);
        }
        field1315++;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
    public static final void method363(boolean arg0) {
        class54.field1415++;
        field1309++;
        class133.method991(0, true);
        class70.method542(true, -75);
        class133.method991(0, false);
        class70.method542(false, -127);
        class21.method157((byte) -78);
        class41.method296(-87);
        if (!class50.field1357) {
            int var1 = class88.field2073;
            if (var1 < class63.field1620 / 256) {
                var1 = class63.field1620 / 256;
            }
            if (class40.field1053[4] && class97.field2233[4] + 128 > var1) {
                var1 = class97.field2233[4] + 128;
            }
            int var2 = class88.field2061 + class147.field3568 & 0x7FF;
            class28.method235(var1 * 3 + 600, class25.method205(class46.field1244.field3000, class17.field466, -23287, class46.field1244.field2939) + -50, var2, var1, -104, class80.field1951, class6.field157);
        }
        int var3;
        if (class50.field1357) {
            var3 = class134.method998((byte) -72);
        } else {
            var3 = class6.method36(20385);
        }
        int var4 = class46.field1248;
        int var5 = class130.field3061;
        int var6 = class61.field1591;
        int var7 = class95.field2199;
        int var8 = class97.field2230;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class40.field1053[var9]) {
                int var10 = (int) (Math.random() * (double) (class131.field3086[var9] * 2 + 1) + Math.sin((double) class125.field2901[var9] / 100.0D * (double) class11.field282[var9]) * (double) class97.field2233[var9] - (double) class131.field3086[var9]);
                if (var9 == 2) {
                    class46.field1248 += var10;
                }
                if (var9 == 1) {
                    class130.field3061 += var10;
                }
                if (var9 == 3) {
                    class95.field2199 = class95.field2199 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class61.field1591 += var10;
                }
                if (var9 == 4) {
                    class97.field2230 += var10;
                    if (class97.field2230 < 128) {
                        class97.field2230 = 128;
                    }
                    if (class97.field2230 > 383) {
                        class97.field2230 = 383;
                    }
                }
            }
        }
        client.method179(-27652);
        class13.field353 = class113.field2602 - 4;
        class13.field367 = arg0;
        class13.field344 = class111.field2557 - 4;
        class13.field338 = 0;
        class41.method294(-2607);
        class120.method878();
        class41.method294(-2607);
        class111.field2548.method893(class61.field1591, class130.field3061, class46.field1248, class97.field2230, class95.field2199, var3);
        class41.method294(-2607);
        class111.field2548.method890();
        class149.method1168(-41);
        class142.method1073(115);
        ((class43) class60.field1532).method337(class128.field3030, (byte) 65);
        class8.method47((byte) -42);
        if (class3.field55 && class101.method689((byte) 83, false, true) == 0) {
            class3.field55 = false;
        }
        if (class3.field55) {
            client.method179(-27652);
            class120.method878();
            class24.method195(!arg0, class103.field2331, null, false);
        }
        class41.method294(-2607);
        class12.method77(4);
        class46.field1248 = var4;
        class95.field2199 = var7;
        class130.field3061 = var5;
        class61.field1591 = var6;
        class97.field2230 = var8;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILbe;)Lbe;")
    public final class13 method364(int arg0, int arg1, class13 arg2) {
        field1321++;
        int var4 = this.field1308[arg1];
        class133 var5 = class5.method35(var4 >> 16, 0);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method94(true);
        }
        if (arg0 != 1) {
            method363(true);
        }
        class133 var7 = null;
        int var8 = 0;
        if (this.field1307 != null && this.field1307.length > arg1) {
            int var9 = this.field1307[arg1];
            var7 = class5.method35(var9 >> 16, 0);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class13 var11 = arg2.method94(!var5.method995(var6, (byte) 6));
            var11.method102(var5, var6);
            return var11;
        } else {
            class13 var10 = arg2.method94(!var5.method995(var6, (byte) 6) & !var7.method995(var8, (byte) 6));
            var10.method102(var5, var6);
            var10.method102(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public static final void method365(int arg0) {
        if (arg0 != 24369) {
            field1285 = -13;
        }
        class136.field3191 = 99;
        class94.field2189 = new int[4][105][105];
        class83.field2009 = new int[104];
        class145.field3521 = new int[104];
        field1319++;
        class1.field6 = new int[104];
        class37.field1022 = new byte[4][104][104];
        class58.field1495 = new int[105][105];
        class128.field3040 = new int[104];
        class21.field595 = new int[104];
        class111.field2559 = new byte[4][104][104];
        class11.field281 = new byte[4][104][104];
        class118.field2738 = new byte[4][105][105];
        class43.field1195 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbe;BI)Lbe;")
    public final class13 method366(class13 arg0, byte arg1, int arg2) {
        int var4 = -89 % ((arg1 - 28) / 41);
        int var5 = this.field1308[arg2];
        class133 var6 = class5.method35(var5 >> 16, 0);
        field1283++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method94(true);
        } else {
            class13 var8 = arg0.method94(!var6.method995(var7, (byte) 6));
            var8.method102(var6, var7);
            return var8;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbe;IB)Lbe;")
    public final class13 method367(class13 arg0, int arg1, byte arg2) {
        field1313++;
        int var4 = this.field1308[arg1];
        class133 var5 = class5.method35(var4 >> 16, 0);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method86(true);
        } else {
            int var7 = -77 / ((arg2 - 50) / 53);
            class13 var8 = arg0.method86(!var5.method995(var6, (byte) 6));
            var8.method102(var5, var6);
            return var8;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILva;)Lva;")
    public static final class141 method368(int arg0, class141 arg1) {
        int var2 = class1.method5(class124.method942(arg1, true), 1);
        field1284++;
        if (var2 == 0) {
            return null;
        }
        if (arg0 != -5380) {
            field1311 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class146.method1097(arg1.field3298, true);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public static void method369(int arg0) {
        field1287 = null;
        field1292 = null;
        field1320 = null;
        field1290 = null;
        field1300 = null;
        field1296 = null;
        field1302 = null;
        if (arg0 != 0) {
            field1311 = null;
        }
        field1303 = null;
        field1311 = null;
        field1286 = null;
        field1293 = null;
        field1312 = null;
        field1316 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILbe;ILh;)Lbe;")
    public final class13 method370(int arg0, int arg1, class13 arg2, int arg3, class49 arg4) {
        field1289++;
        int var6 = this.field1308[arg3];
        class133 var7 = class5.method35(var6 >> 16, 0);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method366(arg2, (byte) -28, arg0);
        }
        int var9 = arg4.field1308[arg0];
        class133 var10 = class5.method35(var9 >> 16, 0);
        int var11 = var9 & 0xFFFF;
        if (arg1 != 19814) {
            return null;
        } else if (var10 == null) {
            class13 var12 = arg2.method94(!var7.method995(var8, (byte) 6));
            var12.method102(var7, var8);
            return var12;
        } else {
            class13 var13 = arg2.method94(!var7.method995(var8, (byte) 6) & !var10.method995(var11, (byte) 6));
            var13.method103(var7, var8, var10, var11, this.field1310);
            return var13;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILv;Lv;)V")
    public static final void method371(int arg0, class140 arg1, class140 arg2) {
        if (class126.field2925 == null) {
            class126.field2925 = class112.method794(class94.field2178, class66.field1677, 8, class76.field1875);
        }
        if (class149.field3655 == null) {
            class149.field3655 = class43.method335(class94.field2178, 28257, class66.field1677, class69.field1729);
        }
        field1294++;
        if (class32.field937 == null) {
            class32.field937 = class43.method335(class94.field2178, arg0 + 28256, class66.field1677, class21.field576);
        }
        if (class109.field2524 == null) {
            class109.field2524 = class43.method335(class94.field2178, 28257, class66.field1677, field1303);
        }
        class120.method872(0, 23, 765, 480, 0);
        if (arg0 != 1) {
            method371(-62, null, null);
        }
        class120.method875(0, 0, 125, 23, 12425273, 9135624);
        class120.method875(125, 0, 640, 23, 5197647, 2697513);
        arg1.method1052(class118.field2734, 62, 15, 0);
        if (class109.field2524 != null) {
            class109.field2524[1].method803(140, 1);
            arg2.method1053(class143.field3464, 152, 10, 16777215);
            class109.field2524[0].method803(140, 12);
            arg2.method1053(class125.field2898, 152, 21, 16777215);
        }
        if (class32.field937 != null) {
            short var3 = 280;
            if (class146.field3524[0] == 0 && class95.field2198[0] == 0) {
                class32.field937[2].method803(var3, 4);
            } else {
                class32.field937[0].method803(var3, 4);
            }
            short var4 = 390;
            if (class146.field3524[0] == 0 && class95.field2198[0] == 1) {
                class32.field937[3].method803(var3 + 15, 4);
            } else {
                class32.field937[1].method803(var3 + 15, 4);
            }
            arg1.method1053(class17.field461, var3 + 32, 17, 16777215);
            if (class146.field3524[0] == 1 && class95.field2198[0] == 0) {
                class32.field937[2].method803(var4, 4);
            } else {
                class32.field937[0].method803(var4, 4);
            }
            short var5 = 500;
            if (class146.field3524[0] == 1 && class95.field2198[0] == 1) {
                class32.field937[3].method803(var4 + 15, 4);
            } else {
                class32.field937[1].method803(var4 + 15, 4);
            }
            short var6 = 610;
            arg1.method1053(class148.field3610, var4 + 32, 17, 16777215);
            if (class146.field3524[0] == 2 && class95.field2198[0] == 0) {
                class32.field937[2].method803(var5, 4);
            } else {
                class32.field937[0].method803(var5, 4);
            }
            if (class146.field3524[0] == 2 && class95.field2198[0] == 1) {
                class32.field937[3].method803(var5 + 15, 4);
            } else {
                class32.field937[1].method803(var5 + 15, 4);
            }
            arg1.method1053(class113.field2646, var5 + 32, 17, 16777215);
            if (class146.field3524[0] == 3 && class95.field2198[0] == 0) {
                class32.field937[2].method803(var6, 4);
            } else {
                class32.field937[0].method803(var6, 4);
            }
            if (class146.field3524[0] == 3 && class95.field2198[0] == 1) {
                class32.field937[3].method803(var6 + 15, 4);
            } else {
                class32.field937[1].method803(var6 + 15, 4);
            }
            arg1.method1053(class83.field2010, var6 + 32, 17, 16777215);
        }
        class120.method872(708, 4, 50, 16, 0);
        arg2.method1052(class83.field2006, 733, 16, 16777215);
        class121.field2796 = -1;
        if (class126.field2925 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 765 / (var7 + 1);
            int var10 = 480 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if (class2.field24 <= (var9 - 1) * var10) {
                    var9--;
                }
                if (class2.field24 <= (var10 - 1) * var9) {
                    var10--;
                }
                if ((var10 - 1) * var9 >= class2.field24) {
                    var10--;
                }
            } while (var10 != var11 || var9 != var12);
            int var13 = (765 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (480 - var8 * var10) / (var10 + 1);
            int var15 = (765 - (var9 - 1) * var13 - var7 * var9) / 2;
            if (var14 > 5) {
                var14 = 5;
            }
            int var16 = (480 - (var10 - 1) * var14 - var8 * var10) / 2;
            int var17 = var16 + 23;
            int var18 = var15;
            int var19 = 0;
            for (int var20 = 0; var20 < class2.field24; var20++) {
                class90 var21 = class128.field3047[var20];
                class150 var22 = class29.method239(arg0 + 999, var21.field2091);
                boolean var23 = true;
                if (var21.field2091 == -1) {
                    var22 = class127.field2940;
                    var23 = false;
                } else if (var21.field2091 > 1980) {
                    var22 = class16.field428;
                    var23 = false;
                }
                if (var18 <= class111.field2557 && var17 <= class113.field2602 && class111.field2557 < var18 + var7 && var8 + var17 > class113.field2602 && var23) {
                    class121.field2796 = var20;
                    class126.field2925[var21.field2087 ? 1 : 0].method413(var18, var17, 128, 16777215);
                } else {
                    class126.field2925[var21.field2087 ? 1 : 0].method410(var18, var17);
                }
                if (class149.field3655 != null) {
                    class149.field3655[var21.field2088 + (var21.field2087 ? 8 : 0)].method803(var18 + 29, var17);
                }
                arg1.method1052(class29.method239(1000, var21.field2086), var18 + 15, var8 / 2 + var17 + 5, 0);
                arg2.method1052(var22, var18 + 60, var8 / 2 + var17 + 5, 268435455);
                var17 += var8 + var14;
                var19++;
                if (var19 >= var10) {
                    var19 = 0;
                    var18 += var7 + var13;
                    var17 = var16 + 23;
                }
            }
        }
        try {
            Graphics var24 = class142.field3439.getGraphics();
            class21.field583.method287(var24, true, 0, 0);
        } catch (Exception var25) {
            class142.field3439.repaint();
        }
    }
}

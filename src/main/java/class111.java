import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class111 extends class470 {

    @OriginalMember(owner = "client!vp", name = "ab", descriptor = "Z")
    private boolean field1345 = true;

    @OriginalMember(owner = "client!vp", name = "tb", descriptor = "I")
    private int field1364 = 0;

    @OriginalMember(owner = "client!vp", name = "yb", descriptor = "Z")
    private boolean field1369 = false;

    @OriginalMember(owner = "client!vp", name = "Q", descriptor = "Z")
    private boolean field1335 = false;

    @OriginalMember(owner = "client!vp", name = "hb", descriptor = "I")
    private int field1352 = 0;

    @OriginalMember(owner = "client!vp", name = "fc", descriptor = "I")
    private int field1402 = 0;

    @OriginalMember(owner = "client!vp", name = "P", descriptor = "I")
    private int field1334 = 0;

    @OriginalMember(owner = "client!vp", name = "yc", descriptor = "I")
    private int field1421 = 0;

    @OriginalMember(owner = "client!vp", name = "sb", descriptor = "Lag;")
    private class469 field1363;

    @OriginalMember(owner = "client!vp", name = "pc", descriptor = "Lfe;")
    private class199 field1412;

    @OriginalMember(owner = "client!vp", name = "cc", descriptor = "Lfe;")
    private class199 field1399;

    @OriginalMember(owner = "client!vp", name = "vb", descriptor = "Lfe;")
    private class199 field1366;

    @OriginalMember(owner = "client!vp", name = "Wb", descriptor = "Lfe;")
    private class199 field1393;

    @OriginalMember(owner = "client!vp", name = "uc", descriptor = "Lpaa;")
    private class342 field1417;

    @OriginalMember(owner = "client!vp", name = "Ab", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client!vp", name = "bc", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!vp", name = "Rb", descriptor = "[I")
    private int[] field1388;

    @OriginalMember(owner = "client!vp", name = "rb", descriptor = "[I")
    private int[] field1362;

    @OriginalMember(owner = "client!vp", name = "kc", descriptor = "[S")
    private short[] field1407;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "[I")
    private int[] field1313;

    @OriginalMember(owner = "client!vp", name = "zb", descriptor = "[I")
    private int[] field1370;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "[Lmp;")
    private class140[] field1311;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "[Lfk;")
    private class118[] field1308;

    @OriginalMember(owner = "client!vp", name = "bb", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!vp", name = "V", descriptor = "[Lcn;")
    private class21[] field1340;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "[Len;")
    private class474[] field1317;

    @OriginalMember(owner = "client!vp", name = "mc", descriptor = "[B")
    private byte[] field1409;

    @OriginalMember(owner = "client!vp", name = "xb", descriptor = "[S")
    private short[] field1368;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "S")
    private short field1315;

    @OriginalMember(owner = "client!vp", name = "gb", descriptor = "[S")
    private short[] field1351;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "S")
    private short field1330;

    @OriginalMember(owner = "client!vp", name = "eb", descriptor = "[S")
    private short[] field1349;

    @OriginalMember(owner = "client!vp", name = "dc", descriptor = "[S")
    private short[] field1400;

    @OriginalMember(owner = "client!vp", name = "Gb", descriptor = "[S")
    private short[] field1377;

    @OriginalMember(owner = "client!vp", name = "lc", descriptor = "[S")
    private short[] field1408;

    @OriginalMember(owner = "client!vp", name = "Zb", descriptor = "[F")
    private float[] field1396;

    @OriginalMember(owner = "client!vp", name = "ob", descriptor = "[B")
    private byte[] field1359;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "[F")
    private float[] field1307;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "[S")
    private short[] field1329;

    @OriginalMember(owner = "client!vp", name = "ec", descriptor = "[S")
    private short[] field1401;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "[S")
    private short[] field1326;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "[S")
    private short[] field1320;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "[I")
    private int[] field1319;

    @OriginalMember(owner = "client!vp", name = "Db", descriptor = "[[I")
    private int[][] field1374;

    @OriginalMember(owner = "client!vp", name = "sc", descriptor = "[[I")
    private int[][] field1415;

    @OriginalMember(owner = "client!vp", name = "nc", descriptor = "[[I")
    private int[][] field1410;

    @OriginalMember(owner = "client!vp", name = "rc", descriptor = "Ljw;")
    public static class259 field1414 = new class259(5, 7);

    @OriginalMember(owner = "client!vp", name = "zc", descriptor = "[I")
    public static int[] field1422 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vp", name = "S", descriptor = "B")
    private byte field1337;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!vp", name = "O", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!vp", name = "R", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!vp", name = "T", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!vp", name = "W", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!vp", name = "X", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!vp", name = "Y", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!vp", name = "cb", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!vp", name = "db", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!vp", name = "fb", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!vp", name = "kb", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!vp", name = "lb", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!vp", name = "mb", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!vp", name = "nb", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!vp", name = "pb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!vp", name = "qb", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!vp", name = "ub", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!vp", name = "wb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!vp", name = "Bb", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!vp", name = "Cb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!vp", name = "Fb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!vp", name = "Hb", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!vp", name = "Ib", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!vp", name = "Jb", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!vp", name = "Kb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!vp", name = "Lb", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!vp", name = "Mb", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!vp", name = "Nb", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!vp", name = "Ob", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!vp", name = "Pb", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!vp", name = "Qb", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!vp", name = "Tb", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!vp", name = "Ub", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!vp", name = "Vb", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!vp", name = "Xb", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!vp", name = "ac", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!vp", name = "gc", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!vp", name = "hc", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!vp", name = "jc", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!vp", name = "oc", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!vp", name = "qc", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!vp", name = "tc", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!vp", name = "vc", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!vp", name = "wc", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!vp", name = "xc", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!vp", name = "Bc", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!vp", name = "Ac", descriptor = "Lvh;")
    private class265 field1423;

    @OriginalMember(owner = "client!vp", name = "Sb", descriptor = "Leca;")
    private class413 field1389;

    @OriginalMember(owner = "client!vp", name = "ic", descriptor = "Lcw;")
    private class511 field1405;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "S")
    private short field1309;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "S")
    private short field1314;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "S")
    private short field1322;

    @OriginalMember(owner = "client!vp", name = "Z", descriptor = "S")
    private short field1344;

    @OriginalMember(owner = "client!vp", name = "ib", descriptor = "S")
    private short field1353;

    @OriginalMember(owner = "client!vp", name = "jb", descriptor = "S")
    private short field1354;

    @OriginalMember(owner = "client!vp", name = "Eb", descriptor = "S")
    private short field1375;

    @OriginalMember(owner = "client!vp", name = "Yb", descriptor = "S")
    private short field1395;

    @OriginalMember(owner = "client!vp", name = "U", descriptor = "Z")
    public static boolean field1339;

    @OriginalMember(owner = "client!vp", name = "SA", descriptor = "(I)V", line = 3)
    public final void method602(int arg0) {
        field1382++;
        this.field1371 = arg0;
        this.field1345 = true;
        if (this.field1389 != null && (this.field1371 & 0x10000) == 0) {
            this.field1400 = this.field1389.field5415;
            this.field1409 = this.field1389.field5417;
            this.field1401 = this.field1389.field5418;
            this.field1368 = this.field1389.field5413;
            this.field1389 = null;
        }
        this.method630(114);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILq;ZI)Z", line = 26)
    public final boolean method603(int arg0, int arg1, class487 arg2, boolean arg3, int arg4) {
        field1336++;
        return this.method659(arg3, arg0, arg1, -24946, arg4, arg2);
    }

    @OriginalMember(owner = "client!vp", name = "PA", descriptor = "()I", line = 34)
    public final int method604() {
        field1391++;
        return this.field1371;
    }

    @OriginalMember(owner = "client!vp", name = "oa", descriptor = "(III)V", line = 47)
    public final void method605(int arg0, int arg1, int arg2) {
        field1386++;
        for (int var4 = 0; var4 < this.field1352; var4++) {
            if (arg0 != 0) {
                this.field1362[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1370[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1313[var4] += arg2;
            }
        }
        this.field1335 = false;
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "()V", line = 85)
    public final void method606() {
        field1419++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V", line = 94)
    private final void method607(boolean arg0, int arg1) {
        field1328++;
        boolean var3 = this.field1393 != null && this.field1393.field2697 == null;
        boolean var4 = this.field1366 != null && this.field1366.field2697 == null;
        boolean var5 = this.field1412 != null && this.field1412.field2697 == null;
        boolean var6 = this.field1399 != null && this.field1399.field2697 == null;
        if (arg0) {
            var6 &= (this.field1337 & 0x8) != 0;
            var3 &= (this.field1337 & 0x2) != 0;
            var4 &= (this.field1337 & 0x4) != 0;
            var5 &= (this.field1337 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != 6) {
            field1414 = null;
        }
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field1363.field6523.field2199.length >= (this.field1402 * var7)) {
            this.field1363.field6523.field2219 = 0;
        } else {
            this.field1363.field6523 = new class210((this.field1402 + 100) * var7);
        }
        class210 var12 = this.field1363.field6523;
        if (var5) {
            if (this.field1363.field6466) {
                for (int var21 = 0; var21 < this.field1352; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field1362[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field1370[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field1313[var21]);
                    int var25 = this.field1388[var21];
                    int var26 = this.field1388[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field1349[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field2219 = var7 * var28;
                        var12.method958(arg1 - 6, var22);
                        var12.method958(arg1 - 6, var23);
                        var12.method958(0, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field1352; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field1362[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field1370[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field1313[var13]);
                    int var17 = this.field1388[var13];
                    int var18 = this.field1388[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field1349[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field2219 = var7 * var20;
                        var12.method922((byte) -101, var14);
                        var12.method922((byte) -101, var15);
                        var12.method922((byte) -101, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1366 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field1389 == null) {
                    var29 = this.field1409;
                    var30 = this.field1400;
                    var31 = this.field1401;
                    var32 = this.field1368;
                } else {
                    var32 = this.field1389.field5413;
                    var31 = this.field1389.field5418;
                    var29 = this.field1389.field5417;
                    var30 = this.field1389.field5415;
                }
                float var33 = this.field1363.field6448[0];
                float var34 = this.field1363.field6448[1];
                float var35 = this.field1363.field6448[2];
                float var36 = this.field1363.field6497;
                float var37 = this.field1363.field6510 * 768.0F / (float) this.field1330;
                float var38 = this.field1363.field6504 * 768.0F / (float) this.field1330;
                for (int var39 = 0; var39 < this.field1421; var39++) {
                    int var40 = this.method641(this.field1315, (byte) -11, this.field1359[var39], this.field1326[var39], this.field1320[var39]);
                    float var41 = (float) (var40 >> 16 & 0xFF) * this.field1363.field6494;
                    float var42 = (float) (var40 >> 8 & 0xFF) * this.field1363.field6439;
                    float var43 = (float) (var40 >>> 24) * this.field1363.field6498;
                    short var44 = this.field1408[var39];
                    short var45 = (short) var29[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var44] * var35 + (float) var30[var44] * var33 + (float) var32[var44] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var44] * var35 + (float) var30[var44] * var33 + (float) var32[var44] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + var46 * (var46 < 0.0F ? var38 : var37);
                    int var48 = (int) (var43 * var47);
                    int var49 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field2219 = var7 * var44 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method915(arg1 ^ 0xFFFF8350, var48);
                    var12.method915(-31914, var49);
                    var12.method915(arg1 ^ 0xFFFF8350, var50);
                    var12.method915(arg1 - 31920, 255 - (this.field1359[var39] & 0xFF));
                    short var51 = this.field1329[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var36 + ((var53 < 0.0F) ? var38 : var37) * var53;
                    int var55 = (int) (var43 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var41 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var42 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field2219 = var7 * var51 + var9;
                    var12.method915(-31914, var55);
                    var12.method915(arg1 ^ 0xFFFF8350, var56);
                    var12.method915(-31914, var57);
                    var12.method915(-31914, 255 - (this.field1359[var39] & 0xFF));
                    short var58 = this.field1351[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = ((var60 < 0.0F) ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var43 * var61);
                    int var63 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var42 * var61);
                    var12.field2219 = var9 + (var7 * var58);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method915(-31914, var62);
                    var12.method915(-31914, var63);
                    var12.method915(arg1 - 31920, var64);
                    var12.method915(arg1 ^ 0xFFFF8350, 255 - (this.field1359[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field1421; var65++) {
                    int var66 = this.method641(this.field1315, (byte) -11, this.field1359[var65], this.field1326[var65], this.field1320[var65]);
                    var12.field2219 = this.field1408[var65] * var7 + var9;
                    var12.method958(0, var66);
                    var12.field2219 = this.field1329[var65] * var7 + var9;
                    var12.method958(0, var66);
                    var12.field2219 = this.field1351[var65] * var7 + var9;
                    var12.method958(0, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field1389 == null) {
                var69 = this.field1400;
                var68 = this.field1401;
                var70 = this.field1409;
                var67 = this.field1368;
            } else {
                var67 = this.field1389.field5413;
                var68 = this.field1389.field5418;
                var69 = this.field1389.field5415;
                var70 = this.field1389.field5417;
            }
            float var71 = 3.0F / (float) this.field1330;
            var12.field2219 = var10;
            float var72 = 3.0F / (float) (this.field1330 / 2 + this.field1330);
            if (this.field1363.field6466) {
                for (int var76 = 0; var76 < this.field1402; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1334(arg1 + 917876554, (float) var69[var76] * var72);
                        var12.method1334(917876560, (float) var67[var76] * var72);
                        var12.method1334(917876560, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1334(917876560, (float) var69[var76] * var78);
                        var12.method1334(arg1 + 917876554, (float) var67[var76] * var78);
                        var12.method1334(917876560, (float) var68[var76] * var78);
                    }
                    var12.field2219 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field1402; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1332((byte) -13, (float) var69[var73] * var72);
                        var12.method1332((byte) -13, (float) var67[var73] * var72);
                        var12.method1332((byte) -13, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1332((byte) -13, (float) var69[var73] * var75);
                        var12.method1332((byte) -13, (float) var67[var73] * var75);
                        var12.method1332((byte) -13, (float) var68[var73] * var75);
                    }
                    var12.field2219 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field2219 = var11;
            if (this.field1363.field6466) {
                for (int var80 = 0; var80 < this.field1402; var80++) {
                    var12.method1334(arg1 + 917876554, this.field1307[var80]);
                    var12.method1334(917876560, this.field1396[var80]);
                    var12.field2219 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field1402; var79++) {
                    var12.method1332((byte) -13, this.field1307[var79]);
                    var12.method1332((byte) -13, this.field1396[var79]);
                    var12.field2219 += var7 - 8;
                }
            }
        }
        var12.field2219 = this.field1402 * var7;
        class511 var81;
        if (arg0) {
            if (this.field1405 == null) {
                this.field1405 = this.field1363.method2658(var12.field2199, (byte) -124, var12.field2219, true, var7);
            } else {
                this.field1405.method1557((byte) 46, var12.field2219, var12.field2199, var7);
            }
            var81 = this.field1405;
            this.field1337 = 0;
        } else {
            var81 = this.field1363.method2658(var12.field2199, (byte) -125, var12.field2219, false, var7);
            this.field1345 = true;
        }
        if (var5) {
            this.field1412.field2698 = var8;
            this.field1412.field2697 = var81;
        }
        if (var6) {
            this.field1399.field2697 = var81;
            this.field1399.field2698 = var11;
        }
        if (var3) {
            this.field1393.field2697 = var81;
            this.field1393.field2698 = var9;
        }
        if (var4) {
            this.field1366.field2697 = var81;
            this.field1366.field2698 = var10;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 614)
    public static void method608(byte arg0) {
        field1414 = null;
        if (arg0 == -107) {
            field1422 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 630)
    private final void method609(int arg0) {
        field1332++;
        if (this.field1317 != null) {
            class62 var2 = this.field1363.field6391;
            this.field1363.method2702(2);
            this.field1363.method1091(false);
            this.field1363.method2703(false, 31);
            this.field1363.method2677(this.field1363.field6535, null, 17560, null, this.field1363.field6469);
            for (int var3 = 0; var3 < this.field1346; var3++) {
                class474 var4 = this.field1317[var3];
                class21 var5 = this.field1340[var3];
                if (!var4.field6602 || !this.field1363.method1098()) {
                    float var6 = (float) (this.field1362[var4.field6601] + this.field1362[var4.field6596] + this.field1362[var4.field6595]) * 0.3333333F;
                    float var7 = (float) (this.field1370[var4.field6601] + this.field1370[var4.field6596] + this.field1370[var4.field6595]) * 0.3333333F;
                    float var8 = (float) (this.field1313[var4.field6596] + this.field1313[var4.field6595] + this.field1313[var4.field6601]) * 0.3333333F;
                    float var9 = class648.field8952 * var8 + class34.field487 * var6 + class293.field3901 * var7 + class60.field753;
                    float var10 = class354.field4727 * var8 + class547.field7484 * var6 + class118.field1508 * var7 + class541.field7419;
                    float var11 = class308.field4137 * var8 + class602.field8407 * var7 + class37.field503 * var6 + class381.field5040;
                    var2.method355((float) var5.field261 - var10, (float) var4.field6598 + -var11, var5.field265, (float) var5.field266 + var9, var4.field6594 * var5.field269 >> 7, var4.field6597 * var5.field271 >> 7, 8);
                    this.field1363.method2663(467844120, var2);
                    int var12 = var5.field267;
                    OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                    this.field1363.method2693(var4.field6603, 15210);
                    this.field1363.method2644(var4.field6606, (byte) 79);
                    this.field1363.method2691(34842, 4, 7, 0);
                }
            }
            this.field1363.method1091(true);
            this.field1363.method2651(110);
        }
        if (arg0 <= 55) {
            this.field1417 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lq;)V", line = 689)
    public final void method610(class487 arg0) {
        field1357++;
        class62 var2 = (class62) arg0;
        if (this.field1311 != null) {
            for (int var3 = 0; var3 < this.field1311.length; var3++) {
                class140 var4 = this.field1311[var3];
                class140 var5 = var4;
                if (var4.field1891 != null) {
                    var5 = var4.field1891;
                }
                var5.field1895 = (int) ((float) this.field1313[var4.field1908] * var2.field783 + (float) this.field1370[var4.field1908] * var2.field770 + (float) this.field1362[var4.field1908] * var2.field771 + var2.field769);
                var5.field1887 = (int) ((float) this.field1313[var4.field1908] * var2.field789 + (float) this.field1370[var4.field1908] * var2.field767 + (float) this.field1362[var4.field1908] * var2.field772 + var2.field792);
                var5.field1906 = (int) ((float) this.field1313[var4.field1908] * var2.field795 + (float) this.field1370[var4.field1908] * var2.field775 + (float) this.field1362[var4.field1908] * var2.field790 + var2.field791);
                var5.field1889 = (int) ((float) this.field1313[var4.field1904] * var2.field783 + (float) this.field1370[var4.field1904] * var2.field770 + (float) this.field1362[var4.field1904] * var2.field771 + var2.field769);
                var5.field1897 = (int) ((float) this.field1313[var4.field1904] * var2.field789 + (float) this.field1370[var4.field1904] * var2.field767 + (float) this.field1362[var4.field1904] * var2.field772 + var2.field792);
                var5.field1896 = (int) ((float) this.field1313[var4.field1904] * var2.field795 + (float) this.field1370[var4.field1904] * var2.field775 + (float) this.field1362[var4.field1904] * var2.field790 + var2.field791);
                var5.field1893 = (int) ((float) this.field1313[var4.field1894] * var2.field783 + (float) this.field1370[var4.field1894] * var2.field770 + (float) this.field1362[var4.field1894] * var2.field771 + var2.field769);
                var5.field1892 = (int) ((float) this.field1313[var4.field1894] * var2.field789 + (float) this.field1370[var4.field1894] * var2.field767 + (float) this.field1362[var4.field1894] * var2.field772 + var2.field792);
                var5.field1905 = (int) ((float) this.field1313[var4.field1894] * var2.field795 + (float) this.field1370[var4.field1894] * var2.field775 + (float) this.field1362[var4.field1894] * var2.field790 + var2.field791);
            }
        }
        if (this.field1308 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field1308.length; var6++) {
            class118 var7 = this.field1308[var6];
            class118 var8 = var7;
            if (var7.field1499 != null) {
                var8 = var7.field1499;
            }
            if (var7.field1494 == null) {
                var7.field1494 = var2.method345();
            } else {
                var7.field1494.method344(var2);
            }
            var8.field1501 = (int) ((float) this.field1313[var7.field1504] * var2.field783 + (float) this.field1370[var7.field1504] * var2.field770 + (float) this.field1362[var7.field1504] * var2.field771 + var2.field769);
            var8.field1506 = (int) ((float) this.field1313[var7.field1504] * var2.field789 + (float) this.field1370[var7.field1504] * var2.field767 + (float) this.field1362[var7.field1504] * var2.field772 + var2.field792);
            var8.field1503 = (int) ((float) this.field1313[var7.field1504] * var2.field795 + (float) this.field1370[var7.field1504] * var2.field775 + (float) this.field1362[var7.field1504] * var2.field790 + var2.field791);
        }
    }

    @OriginalMember(owner = "client!vp", name = "R", descriptor = "(III)V", line = 758)
    public final void method611(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1352; var4++) {
            if (arg0 != 128) {
                this.field1362[var4] = this.field1362[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1370[var4] = this.field1370[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1313[var4] = this.field1313[var4] * arg2 >> 7;
            }
        }
        field1394++;
        this.field1335 = false;
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "(I)V", line = 791)
    public final void method612(int arg0) {
        field1392++;
        int var2 = class240.field3176[arg0];
        int var3 = class240.field3177[arg0];
        for (int var4 = 0; var4 < this.field1352; var4++) {
            int var5 = this.field1313[var4] * var2 + (this.field1362[var4] * var3) >> 14;
            this.field1313[var4] = this.field1313[var4] * var3 - (this.field1362[var4] * var2) >> 14;
            this.field1362[var4] = var5;
        }
        this.field1335 = false;
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "()I", line = 827)
    public final int method613() {
        if (!this.field1335) {
            this.method622(-27300);
        }
        field1318++;
        return this.field1314;
    }

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "(I[IIIIZI[I)V", line = 838)
    public final void method614(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1347++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class123.field1617 = 0;
            int var13 = 0;
            class9.field80 = 0;
            class75.field892 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field1374.length > var15) {
                    int[] var16 = this.field1374[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1407 == null || (this.field1407[var18] & arg6) != 0) {
                            class9.field80 += this.field1362[var18];
                            class75.field892 += this.field1370[var18];
                            var13++;
                            class123.field1617 += this.field1313[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class346.field4623 = true;
                class123.field1617 = class123.field1617 / var13 + var12;
                class9.field80 = class9.field80 / var13 + var11;
                class75.field892 = class75.field892 / var13 + var10;
            } else {
                class9.field80 = var11;
                class123.field1617 = var12;
                class75.field892 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + (arg7[5] * arg4 - -8192) >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field1374.length > var26) {
                    int[] var27 = this.field1374[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1407 == null || (arg6 & this.field1407[var29]) != 0) {
                            this.field1362[var29] += var23;
                            this.field1370[var29] += var24;
                            this.field1313[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field1374.length) {
                        int[] var50 = this.field1374[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field1407 == null || (arg6 & this.field1407[var52]) != 0) {
                                this.field1362[var52] -= class9.field80;
                                this.field1370[var52] -= class75.field892;
                                this.field1313[var52] -= class123.field1617;
                                if (arg4 != 0) {
                                    int var53 = class240.field3176[arg4];
                                    int var54 = class240.field3177[arg4];
                                    int var55 = this.field1370[var52] * var53 + this.field1362[var52] * var54 + 16383 >> 14;
                                    this.field1370[var52] = this.field1370[var52] * var54 + 16383 - (this.field1362[var52] * var53) >> 14;
                                    this.field1362[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class240.field3176[arg2];
                                    int var57 = class240.field3177[arg2];
                                    int var58 = this.field1370[var52] * var57 + 16383 - (this.field1313[var52] * var56) >> 14;
                                    this.field1313[var52] = this.field1370[var52] * var56 - (-(this.field1313[var52] * var57) - 16383) >> 14;
                                    this.field1370[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class240.field3176[arg3];
                                    int var60 = class240.field3177[arg3];
                                    int var61 = this.field1362[var52] * var60 + (this.field1313[var52] * var59 + 16383) >> 14;
                                    this.field1313[var52] = this.field1313[var52] * var60 + 16383 - (this.field1362[var52] * var59) >> 14;
                                    this.field1362[var52] = var61;
                                }
                                this.field1362[var52] += class9.field80;
                                this.field1370[var52] += class75.field892;
                                this.field1313[var52] += class123.field1617;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field1374.length) {
                            int[] var33 = this.field1374[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field1407 == null || (this.field1407[var35] & arg6) != 0) {
                                    int var36 = this.field1388[var35];
                                    int var37 = this.field1388[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field1349[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class240.field3176[arg4];
                                            int var41 = class240.field3177[arg4];
                                            int var42 = this.field1368[var39] * var40 + this.field1400[var39] * var41 + 16383 >> 14;
                                            this.field1368[var39] = (short) (this.field1368[var39] * var41 + 16383 - (this.field1400[var39] * var40) >> 14);
                                            this.field1400[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class240.field3176[arg2];
                                            int var44 = class240.field3177[arg2];
                                            int var45 = this.field1368[var39] * var44 + 16383 - (this.field1401[var39] * var43) >> 14;
                                            this.field1401[var39] = (short) (this.field1401[var39] * var44 + this.field1368[var39] * var43 + 16383 >> 14);
                                            this.field1368[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class240.field3176[arg3];
                                            int var47 = class240.field3177[arg3];
                                            int var48 = this.field1401[var39] * var46 + this.field1400[var39] * var47 + 16383 >> 14;
                                            this.field1401[var39] = (short) (this.field1401[var39] * var47 + 16383 - (this.field1400[var39] * var46) >> 14);
                                            this.field1400[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1366 == null && this.field1393 != null) {
                        this.field1393.field2697 = null;
                    }
                    if (this.field1366 != null) {
                        this.field1366.field2697 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class346.field4623) {
                    int var68 = arg7[0] * class9.field80 + arg7[3] * class75.field892 + (arg7[6] * class123.field1617 - -8192) >> 14;
                    int var69 = arg7[4] * class75.field892 + arg7[7] * class123.field1617 + arg7[1] * class9.field80 + 8192 >> 14;
                    int var70 = var65 + var68;
                    int var71 = var66 + var69;
                    int var72 = arg7[8] * class123.field1617 + arg7[2] * class9.field80 + arg7[5] * class75.field892 + 8192 >> 14;
                    class9.field80 = var70;
                    int var73 = var67 + var72;
                    class75.field892 = var71;
                    class346.field4623 = false;
                    class123.field1617 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class240.field3177[arg2];
                int var76 = class240.field3176[arg2];
                int var77 = class240.field3177[arg3];
                int var78 = class240.field3176[arg3];
                int var79 = class240.field3177[arg4];
                int var80 = class240.field3176[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[5] = -var76;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[0] = var77 * var79 + (var78 * var82) + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[1] = var78 * var81 + -var77 * var80 + 8192 >> 14;
                int var83 = var74[2] * -class123.field1617 + var74[0] * -class9.field80 + (var74[1] * -class75.field892) + 8192 >> 14;
                int var84 = var74[4] * -class75.field892 + var74[3] * -class9.field80 + (var74[5] * -class123.field1617) + 8192 >> 14;
                int var85 = var74[8] * -class123.field1617 + var74[6] * -class9.field80 + (var74[7] * -class75.field892) + 8192 >> 14;
                int var86 = var83 + class9.field80;
                int var87 = var84 + class75.field892;
                int var88 = class123.field1617 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[1] * var66 + var74[0] * var65 + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[4] * var66 + var74[3] * var65 + 8192 >> 14;
                int var93 = var74[8] * var67 + var74[6] * var65 + var74[7] * var66 + 8192 >> 14;
                int var94 = var86 + var91;
                int var95 = var87 + var92;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[0] * var94 + (arg7[1] * var95) + 8192 >> 14;
                int var100 = arg7[4] * var95 + (arg7[3] * var94 + (arg7[5] * var96)) + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = arg7[8] * var96 + arg7[7] * var95 + arg7[6] * var94 + 8192 >> 14;
                int var103 = var63 + var100;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field1374.length) {
                        int[] var107 = this.field1374[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field1407 == null || (arg6 & this.field1407[var109]) != 0) {
                                int var110 = this.field1313[var109] * var97[2] + this.field1370[var109] * var97[1] + this.field1362[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field1362[var109] * var97[3] + this.field1313[var109] * var97[5] + (this.field1370[var109] * var97[4]) + 8192 >> 14;
                                int var112 = this.field1370[var109] * var97[7] + this.field1362[var109] * var97[6] + this.field1313[var109] * var97[8] + 8192 >> 14;
                                int var113 = var101 + var110;
                                int var114 = var103 + var111;
                                int var115 = var104 + var112;
                                this.field1362[var109] = var113;
                                this.field1370[var109] = var114;
                                this.field1313[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field1374.length > var123) {
                        int[] var124 = this.field1374[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field1407 == null || (this.field1407[var126] & arg6) != 0) {
                                this.field1362[var126] -= class9.field80;
                                this.field1370[var126] -= class75.field892;
                                this.field1313[var126] -= class123.field1617;
                                this.field1362[var126] = this.field1362[var126] * arg2 >> 7;
                                this.field1370[var126] = this.field1370[var126] * arg3 >> 7;
                                this.field1313[var126] = this.field1313[var126] * arg4 >> 7;
                                this.field1362[var126] += class9.field80;
                                this.field1370[var126] += class75.field892;
                                this.field1313[var126] += class123.field1617;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class346.field4623) {
                    int var133 = arg7[0] * class9.field80 - (-(arg7[3] * class75.field892) - arg7[6] * class123.field1617 - 8192) >> 14;
                    int var134 = arg7[1] * class9.field80 + arg7[7] * class123.field1617 + arg7[4] * class75.field892 + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[8] * class123.field1617 + arg7[2] * class9.field80 + arg7[5] * class75.field892 + 8192 >> 14;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class9.field80 = var135;
                    class75.field892 = var137;
                    class123.field1617 = var138;
                    class346.field4623 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class9.field80 * var139 + 8192 >> 14;
                int var143 = -class75.field892 * var140 + 8192 >> 14;
                int var144 = -class123.field1617 * var141 + 8192 >> 14;
                int var145 = class9.field80 + var142;
                int var146 = class75.field892 + var143;
                int var147 = var144 + class123.field1617;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var145 + var149;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var146 + var150;
                int var154 = var147 + var152;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[0] * var151 + 8192 - (-(arg7[1] * var153) - (arg7[2] * var154)) >> 14;
                int var158 = arg7[3] * var151 + 8192 - (-(arg7[4] * var153) - arg7[5] * var154) >> 14;
                int var159 = arg7[8] * var154 + arg7[6] * var151 + arg7[7] * var153 + 8192 >> 14;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field1374.length) {
                        int[] var165 = this.field1374[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field1407 == null || (this.field1407[var167] & arg6) != 0) {
                                int var168 = this.field1370[var167] * var155[1] + this.field1362[var167] * var155[0] + this.field1313[var167] * var155[2] + 8192 >> 14;
                                int var169 = this.field1370[var167] * var155[4] + this.field1313[var167] * var155[5] + this.field1362[var167] * var155[3] + 8192 >> 14;
                                int var170 = var161 + var168;
                                int var171 = var160 + var169;
                                int var172 = this.field1362[var167] * var155[6] + (this.field1313[var167] * var155[8]) + this.field1370[var167] * var155[7] + 8192 >> 14;
                                int var173 = var162 + var172;
                                this.field1362[var167] = var170;
                                this.field1370[var167] = var171;
                                this.field1313[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1410 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field1410.length) {
                        int[] var182 = this.field1410[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1377 == null || (arg6 & this.field1377[var184]) != 0) {
                                int var185 = (this.field1359[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1359[var184] = (byte) var185;
                                if (this.field1393 != null) {
                                    this.field1393.field2697 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1317 != null) {
                    for (int var178 = 0; var178 < this.field1346; var178++) {
                        class474 var179 = this.field1317[var178];
                        class21 var180 = this.field1340[var178];
                        var180.field267 = var180.field267 & 0xFFFFFF | 255 - (this.field1359[var179.field6604] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1410 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field1410.length) {
                        int[] var191 = this.field1410[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1377 == null || (arg6 & this.field1377[var193]) != 0) {
                                int var194 = this.field1320[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3B3) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = var195 + arg2 & 0x3F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1320[var193] = (short) class665.method3789(var200, class665.method3789(var197 << 7, var199 << 10));
                                if (this.field1393 != null) {
                                    this.field1393.field2697 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1317 != null) {
                    for (int var187 = 0; var187 < this.field1346; var187++) {
                        class474 var188 = this.field1317[var187];
                        class21 var189 = this.field1340[var187];
                        var189.field267 = class104.field1240[this.field1320[var188.field6604] & 0xFFFF] & 0xFFFFFF | var189.field267 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1415 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field1415.length > var202) {
                        int[] var203 = this.field1415[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class21 var205 = this.field1340[var203[var204]];
                            var205.field261 += arg3;
                            var205.field266 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1415 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field1415.length) {
                        int[] var208 = this.field1415[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class21 var210 = this.field1340[var208[var209]];
                            var210.field269 = var210.field269 * arg2 >> 7;
                            var210.field271 = var210.field271 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1415 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field1415.length) {
                    int[] var213 = this.field1415[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class21 var215 = this.field1340[var213[var214]];
                        var215.field265 = var215.field265 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "()Z", line = 1823)
    public final boolean method615() {
        field1342++;
        if (this.field1326 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1326.length; var1++) {
            if (this.field1326[var1] != -1 && !this.field1363.field7682.method2961(true, this.field1326[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vp", name = "W", descriptor = "(I)V", line = 1848)
    public final void method616(int arg0) {
        field1416++;
        int var2 = class240.field3176[arg0];
        int var3 = class240.field3177[arg0];
        for (int var4 = 0; var4 < this.field1352; var4++) {
            int var5 = this.field1370[var4] * var2 + this.field1362[var4] * var3 >> 14;
            this.field1370[var4] = this.field1370[var4] * var3 - (this.field1362[var4] * var2) >> 14;
            this.field1362[var4] = var5;
        }
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
        this.field1335 = false;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lda;IIIZ)V", line = 1877)
    public final void method617(class470 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1373++;
        class111 var6 = (class111) arg0;
        if (this.field1421 == 0 || var6.field1421 == 0) {
            return;
        }
        int var7 = var6.field1352;
        int[] var8 = var6.field1362;
        int[] var9 = var6.field1370;
        int[] var10 = var6.field1313;
        short[] var11 = var6.field1400;
        short[] var12 = var6.field1368;
        short[] var13 = var6.field1401;
        byte[] var14 = var6.field1409;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1389 == null) {
            var16 = null;
            var15 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1389.field5417;
            var16 = this.field1389.field5418;
            var17 = this.field1389.field5415;
            var18 = this.field1389.field5413;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1389 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field1389.field5415;
            var19 = var6.field1389.field5417;
            var22 = var6.field1389.field5413;
            var20 = var6.field1389.field5418;
        }
        int[] var23 = var6.field1388;
        short[] var24 = var6.field1349;
        if (!var6.field1335) {
            var6.method622(-27300);
        }
        short var25 = var6.field1314;
        short var26 = var6.field1344;
        short var27 = var6.field1354;
        short var28 = var6.field1375;
        short var29 = var6.field1309;
        short var30 = var6.field1353;
        for (int var31 = 0; var31 < this.field1352; var31++) {
            int var32 = this.field1370[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field1362[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field1313[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1388[var31];
                        int var37 = this.field1388[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1349[var38] - 1;
                            if (var35 == -1 || this.field1409[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39 + 1];
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var41; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var17 == null) {
                                            this.field1389 = new class413();
                                            var17 = this.field1389.field5415 = class487.method2797(this.field1400, false);
                                            var18 = this.field1389.field5413 = class487.method2797(this.field1368, false);
                                            var16 = this.field1389.field5418 = class487.method2797(this.field1401, false);
                                            var15 = this.field1389.field5417 = class564.method3131(this.field1409, (byte) -128);
                                        }
                                        if (var21 == null) {
                                            class413 var44 = var6.field1389 = new class413();
                                            var21 = var44.field5415 = class487.method2797(var11, false);
                                            var22 = var44.field5413 = class487.method2797(var12, false);
                                            var20 = var44.field5418 = class487.method2797(var13, false);
                                            var19 = var44.field5417 = class564.method3131(var14, (byte) -92);
                                        }
                                        short var45 = this.field1400[var35];
                                        short var46 = this.field1368[var35];
                                        short var47 = this.field1401[var35];
                                        int var48 = var23[var39 + 1];
                                        int var49 = var23[var39];
                                        byte var50 = this.field1409[var35];
                                        for (int var51 = var49; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var19[var52] += var50;
                                            }
                                        }
                                        int var53 = this.field1388[var31];
                                        int var54 = this.field1388[var31 + 1];
                                        short var55 = var11[var40];
                                        short var56 = var13[var40];
                                        byte var57 = var14[var40];
                                        short var58 = var12[var40];
                                        for (int var59 = var53; var59 < var54; var59++) {
                                            int var60 = this.field1349[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var55;
                                                var18[var60] += var58;
                                                var16[var60] += var56;
                                                var15[var60] += var57;
                                            }
                                        }
                                        if (this.field1366 == null && this.field1393 != null) {
                                            this.field1393.field2697 = null;
                                        }
                                        if (this.field1366 != null) {
                                            this.field1366.field2697 = null;
                                        }
                                        if (var6.field1366 == null && var6.field1393 != null) {
                                            var6.field1393.field2697 = null;
                                        }
                                        if (var6.field1366 != null) {
                                            var6.field1366.field2697 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILcca;IFIFIIJ)S", line = 2143)
    private final short method618(int arg0, int arg1, class250 arg2, int arg3, float arg4, int arg5, float arg6, int arg7, int arg8, long arg9) {
        field1316++;
        int var12 = this.field1388[arg1];
        int var13 = this.field1388[arg1 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field1349[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class256.field3357[var15] == arg9) {
                return (short) (var16 - 1);
            }
        }
        this.field1349[var14] = (short) (this.field1402 + 1);
        class256.field3357[var14] = arg9;
        if (arg0 > -98) {
            return 38;
        }
        this.field1400[this.field1402] = (short) arg8;
        this.field1368[this.field1402] = (short) arg7;
        this.field1401[this.field1402] = (short) arg5;
        this.field1409[this.field1402] = (byte) arg3;
        this.field1307[this.field1402] = arg6;
        this.field1396[this.field1402] = arg4;
        return (short) (this.field1402++);
    }

    @OriginalMember(owner = "client!vp", name = "WA", descriptor = "(IIII)V", line = 2189)
    public final void method619(int arg0, int arg1, int arg2, int arg3) {
        field1387++;
        if (arg0 == 0) {
            class9.field80 = 0;
            class123.field1617 = 0;
            class75.field892 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1352; var6++) {
                class9.field80 += this.field1362[var6];
                class75.field892 += this.field1370[var6];
                class123.field1617 += this.field1313[var6];
                var5++;
            }
            if (var5 <= 0) {
                class123.field1617 = arg3;
                class9.field80 = arg1;
                class75.field892 = arg2;
            } else {
                class75.field892 = class75.field892 / var5 + arg2;
                class9.field80 = class9.field80 / var5 + arg1;
                class123.field1617 = class123.field1617 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1352; var7++) {
                this.field1362[var7] += arg1;
                this.field1370[var7] += arg2;
                this.field1313[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1352; var8++) {
                this.field1362[var8] -= class9.field80;
                this.field1370[var8] -= class75.field892;
                this.field1313[var8] -= class123.field1617;
                if (arg3 != 0) {
                    int var9 = class240.field3176[arg3];
                    int var10 = class240.field3177[arg3];
                    int var11 = this.field1370[var8] * var9 + this.field1362[var8] * var10 + 16383 >> 14;
                    this.field1370[var8] = this.field1370[var8] * var10 + 16383 - (this.field1362[var8] * var9) >> 14;
                    this.field1362[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class240.field3176[arg1];
                    int var13 = class240.field3177[arg1];
                    int var14 = this.field1370[var8] * var13 + 16383 - (this.field1313[var8] * var12) >> 14;
                    this.field1313[var8] = this.field1370[var8] * var12 + (this.field1313[var8] * var13 + 16383) >> 14;
                    this.field1370[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class240.field3176[arg2];
                    int var16 = class240.field3177[arg2];
                    int var17 = this.field1362[var8] * var16 + this.field1313[var8] * var15 + 16383 >> 14;
                    this.field1313[var8] = this.field1313[var8] * var16 + 16383 - (this.field1362[var8] * var15) >> 14;
                    this.field1362[var8] = var17;
                }
                this.field1362[var8] += class9.field80;
                this.field1370[var8] += class75.field892;
                this.field1313[var8] += class123.field1617;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1352; var18++) {
                this.field1362[var18] -= class9.field80;
                this.field1370[var18] -= class75.field892;
                this.field1313[var18] -= class123.field1617;
                this.field1362[var18] = this.field1362[var18] * arg1 / 128;
                this.field1370[var18] = this.field1370[var18] * arg2 / 128;
                this.field1313[var18] = this.field1313[var18] * arg3 / 128;
                this.field1362[var18] += class9.field80;
                this.field1370[var18] += class75.field892;
                this.field1313[var18] += class123.field1617;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1421; var19++) {
                int var23 = (this.field1359[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1359[var19] = (byte) var23;
            }
            if (this.field1393 != null) {
                this.field1393.field2697 = null;
            }
            if (this.field1317 != null) {
                for (int var20 = 0; var20 < this.field1346; var20++) {
                    class474 var21 = this.field1317[var20];
                    class21 var22 = this.field1340[var20];
                    var22.field267 = var22.field267 & 0xFFFFFF | 255 - (this.field1359[var21.field6604] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1421; var24++) {
                int var28 = this.field1320[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = var29 + arg1 & 0x3F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field1320[var24] = (short) class665.method3789(class665.method3789(var31 << 7, var33 << 10), var34);
            }
            if (this.field1393 != null) {
                this.field1393.field2697 = null;
            }
            if (this.field1317 != null) {
                for (int var25 = 0; var25 < this.field1346; var25++) {
                    class474 var26 = this.field1317[var25];
                    class21 var27 = this.field1340[var25];
                    var27.field267 = var27.field267 & 0xFF000000 | class104.field1240[this.field1320[var26.field6604] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1346; var35++) {
                class21 var36 = this.field1340[var35];
                var36.field261 += arg2;
                var36.field266 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1346; var37++) {
                class21 var38 = this.field1340[var37];
                var38.field271 = var38.field271 * arg2 >> 7;
                var38.field269 = var38.field269 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1346; var39++) {
                class21 var40 = this.field1340[var39];
                var40.field265 = var40.field265 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "()V", line = 2499)
    public final void method620() {
        field1376++;
    }

    @OriginalMember(owner = "client!vp", name = "RA", descriptor = "()I", line = 2519)
    public final int method621() {
        field1310++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        return this.field1322;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 2530)
    private final void method622(int arg0) {
        field1413++;
        int var2 = 32767;
        if (arg0 != -27300) {
            this.field1423 = null;
        }
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1352; var10++) {
            int var11 = this.field1362[var10];
            int var12 = this.field1370[var10];
            int var13 = this.field1313[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field1344 = (short) var6;
        this.field1314 = (short) var3;
        this.field1309 = (short) var4;
        this.field1375 = (short) var5;
        this.field1354 = (short) var2;
        this.field1353 = (short) var7;
        this.field1395 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field1322 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field1335 = true;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lbd;B)V", line = 2615)
    private final void method623(class187 arg0, byte arg1) {
        field1367++;
        if (this.field1363.field6543.length < this.field1402) {
            this.field1363.field6545 = new int[this.field1402];
            this.field1363.field6543 = new int[this.field1402];
        }
        if (arg1 >= -72) {
            this.field1349 = null;
        }
        int[] var3 = this.field1363.field6543;
        int[] var4 = this.field1363.field6545;
        for (int var5 = 0; var5 < this.field1352; var5++) {
            int var16 = (this.field1362[var5] - (this.field1370[var5] * this.field1363.field6526 >> 8) >> this.field1363.field6396) - arg0.field2605;
            int var17 = (this.field1313[var5] - (this.field1370[var5] * this.field1363.field6513 >> 8) >> this.field1363.field6396) - arg0.field2602;
            int var18 = this.field1388[var5];
            int var19 = this.field1388[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field1349[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field1364; var6++) {
            if (this.field1359 == null || this.field1359[var6] <= 128) {
                short var7 = this.field1408[var6];
                short var8 = this.field1329[var6];
                short var9 = this.field1351[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method1239(var14, var13, var11, var10, var15, (byte) -112, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "DA", descriptor = "(SS)V", line = 2711)
    public final void method624(short arg0, short arg1) {
        field1383++;
        class522 var3 = this.field1363.field7682;
        for (int var4 = 0; var4 < this.field1421; var4++) {
            if (this.field1326[var4] == arg0) {
                this.field1326[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class105 var7 = var3.method2959(94, arg0 & 0xFFFF);
            var6 = var7.field1263;
            var5 = var7.field1244;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class105 var10 = var3.method2959(64, arg1 & 0xFFFF);
            var9 = var10.field1263;
            var8 = var10.field1244;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field1317 != null) {
            for (int var11 = 0; var11 < this.field1346; var11++) {
                class474 var12 = this.field1317[var11];
                class21 var13 = this.field1340[var11];
                var13.field267 = class104.field1240[this.field1320[var12.field6604] & 0xFFFF] & 0xFFFFFF | var13.field267 & 0xFF000000;
            }
        }
        if (this.field1393 != null) {
            this.field1393.field2697 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lq;Lbc;I)V", line = 2785)
    public final void method625(class487 arg0, class667 arg1, int arg2) {
        field1384++;
        if (this.field1402 == 0) {
            return;
        }
        class62 var4 = this.field1363.field6428;
        if (!this.field1335) {
            this.method622(-27300);
        }
        class62 var5 = (class62) arg0;
        class602.field8407 = var4.field795 * var5.field775 + var4.field790 * var5.field770 + var4.field775 * var5.field767;
        class381.field5040 = var4.field795 * var5.field791 + var4.field790 * var5.field769 + var4.field775 * var5.field792 + var4.field791;
        float var6 = (float) this.field1314 * class602.field8407 + class381.field5040;
        float var7 = (float) this.field1344 * class602.field8407 + class381.field5040;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) this.field1395 + var6;
            var8 = (float) (-this.field1395) + var7;
        } else {
            var8 = var6 - (float) this.field1395;
            var9 = (float) this.field1395 + var7;
        }
        if ((var8 >= this.field1363.field6501) || (var9 <= (float) this.field1363.field6440)) {
            return;
        }
        class60.field753 = var4.field783 * var5.field791 + var4.field771 * var5.field769 + var4.field770 * var5.field792 + var4.field769;
        class293.field3901 = var4.field783 * var5.field775 + var4.field771 * var5.field770 + var4.field770 * var5.field767;
        float var10 = (float) this.field1314 * class293.field3901 + class60.field753;
        float var11 = (float) this.field1344 * class293.field3901 + class60.field753;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) (-this.field1395) + var11) * (float) this.field1363.field6451;
            var13 = ((float) this.field1395 + var10) * (float) this.field1363.field6451;
        } else {
            var12 = (var10 - (float) this.field1395) * (float) this.field1363.field6451;
            var13 = ((float) this.field1395 + var11) * (float) this.field1363.field6451;
        }
        if ((var12 / var9 >= this.field1363.field6467) || (this.field1363.field6479 >= var13 / var9)) {
            return;
        }
        class118.field1508 = var4.field789 * var5.field775 + var4.field772 * var5.field770 + var4.field767 * var5.field767;
        class541.field7419 = var4.field789 * var5.field791 + var4.field772 * var5.field769 + var4.field767 * var5.field792 + var4.field792;
        float var14 = (float) this.field1314 * class118.field1508 + class541.field7419;
        float var15 = (float) this.field1344 * class118.field1508 + class541.field7419;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) this.field1395 + var14) * (float) this.field1363.field6500;
            var17 = (var15 - (float) this.field1395) * (float) this.field1363.field6500;
        } else {
            var16 = ((float) this.field1395 + var15) * (float) this.field1363.field6500;
            var17 = (var14 - (float) this.field1395) * (float) this.field1363.field6500;
        }
        if ((var17 / var9 >= this.field1363.field6444) || (this.field1363.field6536 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field1317 != null) {
            class37.field503 = var4.field795 * var5.field790 + var4.field790 * var5.field771 + var4.field775 * var5.field772;
            class34.field487 = var4.field783 * var5.field790 + var4.field771 * var5.field771 + var4.field770 * var5.field772;
            class547.field7484 = var4.field789 * var5.field790 + var4.field772 * var5.field771 + var4.field767 * var5.field772;
            class308.field4137 = var4.field795 * var5.field795 + var4.field790 * var5.field783 + var4.field775 * var5.field789;
            class648.field8952 = var4.field783 * var5.field795 + var4.field771 * var5.field783 + var4.field770 * var5.field789;
            class354.field4727 = var4.field789 * var5.field795 + var4.field772 * var5.field783 + var4.field767 * var5.field789;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1375 + this.field1354 >> 1;
            int var21 = this.field1309 + this.field1353 >> 1;
            int var22 = (int) ((float) var21 * class648.field8952 + (float) this.field1314 * class293.field3901 + (float) var20 * class34.field487 + class60.field753);
            int var23 = (int) ((float) var21 * class354.field4727 + (float) this.field1314 * class118.field1508 + (float) var20 * class547.field7484 + class541.field7419);
            int var24 = (int) ((float) var21 * class308.field4137 + (float) this.field1314 * class602.field8407 + (float) var20 * class37.field503 + class381.field5040);
            if (this.field1363.field6440 > var24) {
                var18 = true;
            } else {
                arg1.field9485 = this.field1363.field6451 * var22 / var24 + this.field1363.field6495;
                arg1.field9482 = this.field1363.field6500 * var23 / var24 + this.field1363.field6508;
            }
            int var25 = (int) ((float) var21 * class648.field8952 + (float) this.field1344 * class293.field3901 + (float) var20 * class34.field487 + class60.field753);
            int var26 = (int) ((float) var21 * class354.field4727 + (float) this.field1344 * class118.field1508 + (float) var20 * class547.field7484 + class541.field7419);
            int var27 = (int) ((float) var21 * class308.field4137 + (float) this.field1344 * class602.field8407 + (float) var20 * class37.field503 + class381.field5040);
            if (this.field1363.field6440 <= var27) {
                arg1.field9486 = this.field1363.field6495 + (this.field1363.field6451 * var25 / var27);
                arg1.field9483 = this.field1363.field6500 * var26 / var27 + this.field1363.field6508;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field1363.field6440 > var24 && this.field1363.field6440 > var27) {
                    var19 = false;
                } else if (var24 < this.field1363.field6440) {
                    int var28 = (var27 - this.field1363.field6440 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field9485 = this.field1363.field6495 + (this.field1363.field6451 * var29 / this.field1363.field6440);
                    arg1.field9482 = this.field1363.field6500 * var30 / this.field1363.field6440 + this.field1363.field6508;
                } else if (var27 < this.field1363.field6440) {
                    int var31 = (var24 - this.field1363.field6440 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field9485 = this.field1363.field6451 * var32 / this.field1363.field6440 + this.field1363.field6495;
                    arg1.field9482 = this.field1363.field6500 * var33 / this.field1363.field6440 + this.field1363.field6508;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field9484 = (this.field1395 + var22) * this.field1363.field6451 / var24 + this.field1363.field6495 - arg1.field9485;
                } else {
                    arg1.field9484 = this.field1363.field6495 + ((this.field1395 + var25) * this.field1363.field6451 / var27) - arg1.field9486;
                }
                arg1.field9487 = true;
            }
        }
        this.field1363.method2665(70);
        this.field1363.method2632(var5, (byte) -62);
        this.method629(125);
        this.field1363.method2651(85);
        this.method609(115);
    }

    @OriginalMember(owner = "client!vp", name = "TA", descriptor = "()I", line = 2986)
    public final int method626() {
        field1331++;
        return this.field1315;
    }

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "()I", line = 2995)
    public final int method627() {
        field1403++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        return this.field1344;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "()[Lfk;", line = 3007)
    public final class118[] method628() {
        field1338++;
        return this.field1308;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V", line = 3016)
    private final void method629(int arg0) {
        field1341++;
        if (this.field1364 == 0) {
            return;
        }
        if (this.field1337 != 0) {
            this.method607(true, 6);
        }
        this.method607(false, 6);
        if (this.field1417 != null) {
            if (this.field1417.field4583 == null) {
                this.method632(false, (this.field1337 & 0x10) != 0);
            }
            if (this.field1417.field4583 != null) {
                this.field1363.method2703(this.field1366 != null, 39);
                this.field1363.method2677(this.field1412, this.field1366, 17560, this.field1393, this.field1399);
                int var2 = this.field1319.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1319[var3];
                    int var5 = this.field1319[var3 + 1];
                    int var6 = this.field1326[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1363.method2646(var6, -1, this.field1366 != null);
                    this.field1363.method2674(var4 * 3, 4, this.field1417.field4583, 8704, (var5 - var4) * 3);
                }
            }
        }
        int var7 = -68 % ((arg0 - 15) / 58);
        this.method630(108);
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V", line = 3076)
    private final void method630(int arg0) {
        field1355++;
        if (!this.field1345) {
            return;
        }
        this.field1345 = false;
        if (this.field1311 == null && this.field1308 == null && this.field1317 == null) {
            if (this.field1362 != null && !class309.method1820(this.field1371, this.field1398, 25442)) {
                if (this.field1412 != null && this.field1412.field2697 == null) {
                    this.field1345 = true;
                } else {
                    if (!this.field1335) {
                        this.method622(-27300);
                    }
                    this.field1362 = null;
                }
            }
            if (this.field1370 != null && !class508.method2885(this.field1398, (byte) -117, this.field1371)) {
                if (this.field1412 != null && this.field1412.field2697 == null) {
                    this.field1345 = true;
                } else {
                    if (!this.field1335) {
                        this.method622(-27300);
                    }
                    this.field1370 = null;
                }
            }
            if (this.field1313 != null && !class326.method1901(this.field1371, this.field1398, -1087)) {
                if (this.field1412 != null && this.field1412.field2697 == null) {
                    this.field1345 = true;
                } else {
                    if (!this.field1335) {
                        this.method622(-27300);
                    }
                    this.field1313 = null;
                }
            }
        }
        if (this.field1349 != null && this.field1362 == null && this.field1370 == null && this.field1313 == null) {
            this.field1388 = null;
            this.field1349 = null;
        }
        if (this.field1409 != null && !class30.method188(105, this.field1371, this.field1398)) {
            if (this.field1366 == null) {
                if (this.field1393 != null && this.field1393.field2697 == null) {
                    this.field1345 = true;
                } else {
                    this.field1409 = null;
                    this.field1400 = this.field1368 = this.field1401 = null;
                }
            } else if (this.field1366.field2697 == null) {
                this.field1345 = true;
            } else {
                this.field1409 = null;
                this.field1400 = this.field1368 = this.field1401 = null;
            }
        }
        if (this.field1320 != null && !class512.method2899(this.field1398, true, this.field1371)) {
            if (this.field1393 != null && this.field1393.field2697 == null) {
                this.field1345 = true;
            } else {
                this.field1320 = null;
            }
        }
        if (this.field1359 != null && !class43.method228(this.field1398, this.field1371, 7)) {
            if (this.field1393 != null && this.field1393.field2697 == null) {
                this.field1345 = true;
            } else {
                this.field1359 = null;
            }
        }
        if (arg0 <= 105) {
            this.method624((short) -15, (short) -82);
        }
        if (this.field1307 != null && !class317.method1848(this.field1371, (byte) 97, this.field1398)) {
            if (this.field1399 != null && this.field1399.field2697 == null) {
                this.field1345 = true;
            } else {
                this.field1307 = this.field1396 = null;
            }
        }
        if (this.field1326 != null && !class281.method1670(false, this.field1371, this.field1398)) {
            if (this.field1393 != null && this.field1393.field2697 == null) {
                this.field1345 = true;
            } else {
                this.field1326 = null;
            }
        }
        if (this.field1408 != null && !class172.method1170(this.field1398, -1, this.field1371)) {
            if ((this.field1417 == null || this.field1417.field4583 != null) && (this.field1393 == null || this.field1393.field2697 != null)) {
                this.field1408 = this.field1329 = this.field1351 = null;
            } else {
                this.field1345 = true;
            }
        }
        if (this.field1410 != null && !class505.method2877(125, this.field1371, this.field1398)) {
            this.field1410 = null;
            this.field1377 = null;
        }
        if (this.field1374 != null && !class470.method2707(this.field1371, this.field1398, 117)) {
            this.field1407 = null;
            this.field1374 = null;
        }
        if (this.field1415 != null && !class669.method3799(this.field1398, this.field1371, -117)) {
            this.field1415 = null;
        }
        if (this.field1319 != null && (this.field1371 & 0x800) == 0 && (this.field1371 & 0x40000) == 0) {
            this.field1319 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "T", descriptor = "(I)V", line = 3252)
    public final void method631(int arg0) {
        field1406++;
        if (this.field1393 != null) {
            this.field1393.field2697 = null;
        }
        this.field1315 = (short) arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZZ)V", line = 3266)
    private final void method632(boolean arg0, boolean arg1) {
        field1411++;
        if ((this.field1364 * 6) <= this.field1363.field6523.field2199.length) {
            this.field1363.field6523.field2219 = 0;
        } else {
            this.field1363.field6523 = new class210(this.field1364 * 6 + 600);
        }
        class210 var3 = this.field1363.field6523;
        if (arg0) {
            this.method644(-15);
        }
        if (this.field1363.field6466) {
            for (int var4 = 0; var4 < this.field1364; var4++) {
                var3.method918(24551, this.field1408[var4]);
                var3.method918(24551, this.field1329[var4]);
                var3.method918(24551, this.field1351[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1364; var5++) {
                var3.method913(this.field1408[var5], true);
                var3.method913(this.field1329[var5], true);
                var3.method913(this.field1351[var5], true);
            }
        }
        if (var3.field2219 == 0) {
            return;
        }
        if (arg1) {
            if (this.field1423 == null) {
                this.field1423 = this.field1363.method2654(true, var3.field2219, (byte) -112, var3.field2199, 5123);
            } else {
                this.field1423.method1241(var3.field2219, (byte) -23, 5123, var3.field2199);
            }
            this.field1417.field4583 = this.field1423;
        } else {
            this.field1417.field4583 = this.field1363.method2654(false, var3.field2219, (byte) -112, var3.field2199, 5123);
        }
        if (!arg1) {
            this.field1345 = true;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)I", line = 3330)
    public static final int method633(int arg0) {
        field1418++;
        if (arg0 != -11241) {
            field1422 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()V", line = 3341)
    public final void method634() {
        field1381++;
        if (this.field1402 <= 0 || this.field1364 <= 0) {
            return;
        }
        this.method607(false, 6);
        if ((this.field1337 & 0x10) == 0 && this.field1417.field4583 == null) {
            this.method632(false, false);
        }
        this.method630(120);
    }

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "()V", line = 3357)
    public final void method635() {
        field1361++;
        for (int var1 = 0; var1 < this.field1334; var1++) {
            this.field1362[var1] = this.field1362[var1] + 7 >> 4;
            this.field1370[var1] = this.field1370[var1] + 7 >> 4;
            this.field1313[var1] = this.field1313[var1] + 7 >> 4;
        }
        this.field1335 = false;
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lag;)V", line = 5673)
    public class111(class469 arg0) {
        this.field1363 = arg0;
        this.field1412 = new class199(null, 5126, 3, 0);
        this.field1399 = new class199(null, 5126, 2, 0);
        this.field1366 = new class199(null, 5126, 3, 0);
        this.field1393 = new class199(null, 5121, 4, 0);
        this.field1417 = new class342();
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lag;Lcca;IIII)V", line = 5685)
    public class111(class469 arg0, class250 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1371 = arg2;
        this.field1398 = arg5;
        this.field1363 = arg0;
        if (class436.method2467(arg5, arg2, false)) {
            this.field1412 = new class199(null, 5126, 3, 0);
        }
        if (class592.method3280(arg2, (byte) -116, arg5)) {
            this.field1399 = new class199(null, 5126, 2, 0);
        }
        if (class615.method3403(false, arg5, arg2)) {
            this.field1366 = new class199(null, 5126, 3, 0);
        }
        if (class450.method2532(arg5, (byte) -116, arg2)) {
            this.field1393 = new class199(null, 5121, 4, 0);
        }
        if (class554.method3096(arg2, -9381, arg5)) {
            this.field1417 = new class342();
        }
        class522 var7 = arg0.field7682;
        int[] var8 = new int[arg1.field3283];
        this.field1388 = new int[arg1.field3293 + 1];
        for (int var9 = 0; var9 < arg1.field3283; var9++) {
            if ((arg1.field3272 == null || arg1.field3272[var9] != 2) && (arg1.field3292 == null || arg1.field3292[var9] == -1 || !var7.method2959(99, arg1.field3292[var9] & 0xFFFF).field1256)) {
                var8[this.field1421++] = var9;
                this.field1388[arg1.field3296[var9]]++;
                this.field1388[arg1.field3250[var9]]++;
                this.field1388[arg1.field3257[var9]]++;
            }
        }
        this.field1364 = this.field1421;
        long[] var10 = new long[this.field1421];
        boolean var11 = (this.field1371 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field1421; var12++) {
            int var180 = var8[var12];
            class105 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field3275 != null) {
                for (int var186 = 0; var186 < arg1.field3275.length; var186++) {
                    class254 var187 = arg1.field3275[var186];
                    if (var187.field3327 == var180) {
                        class383 var188 = class355.method2090((byte) 81, var187.field3322);
                        if (var188.field5065) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field1364--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field3292 != null) {
                var189 = arg1.field3292[var180];
                if (var189 != -1) {
                    var181 = var7.method2959(85, var189 & 0xFFFF);
                    var184 = var181.field1255;
                    var185 = var181.field1246;
                }
            }
            boolean var190 = arg1.field3246 != null && arg1.field3246[var180] != 0 || var181 != null && var181.field1253 | !var181.field1250;
            if ((var11 || var190) && arg1.field3274 != null) {
                var182 += arg1.field3274[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + ((long) var194);
            this.field1369 |= var190;
        }
        class377.method2154(var10, var8, true);
        this.field1362 = arg1.field3254;
        this.field1334 = arg1.field3284;
        this.field1407 = arg1.field3265;
        this.field1313 = arg1.field3289;
        this.field1370 = arg1.field3247;
        this.field1352 = arg1.field3293;
        class177[] var13 = new class177[this.field1352];
        this.field1311 = arg1.field3248;
        this.field1308 = arg1.field3252;
        if (arg1.field3275 != null) {
            this.field1346 = arg1.field3275.length;
            this.field1340 = new class21[this.field1346];
            this.field1317 = new class474[this.field1346];
            for (int var14 = 0; var14 < this.field1346; var14++) {
                class254 var15 = arg1.field3275[var14];
                class383 var16 = class355.method2090((byte) 115, var15.field3322);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1421; var18++) {
                    if (var8[var18] == var15.field3327) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class104.field1240[arg1.field3280[var15.field3327] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3246 == null ? 0 : arg1.field3246[var15.field3327]) << 24;
                this.field1317[var14] = new class474(var17, arg1.field3296[var15.field3327], arg1.field3250[var15.field3327], arg1.field3257[var15.field3327], var16.field5055, var16.field5054, var16.field5060, var16.field5063, var16.field5061, var16.field5065, var16.field5058, var15.field3328);
                this.field1340[var14] = new class21(var20);
            }
        }
        int var21 = this.field1421 * 3;
        this.field1409 = new byte[var21];
        this.field1368 = new short[var21];
        this.field1315 = (short) arg3;
        this.field1351 = new short[this.field1421];
        this.field1330 = (short) arg4;
        this.field1349 = new short[var21];
        this.field1400 = new short[var21];
        if (arg1.field3270 != null) {
            this.field1377 = new short[this.field1421];
        }
        this.field1408 = new short[this.field1421];
        this.field1396 = new float[var21];
        this.field1359 = new byte[this.field1421];
        this.field1307 = new float[var21];
        this.field1329 = new short[this.field1421];
        class256.field3357 = new long[var21];
        this.field1401 = new short[var21];
        this.field1326 = new short[this.field1421];
        this.field1320 = new short[this.field1421];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field3293; var23++) {
            int var179 = this.field1388[var23];
            this.field1388[var23] = var22;
            var13[var23] = new class177();
            var22 += var179;
        }
        this.field1388[arg1.field3293] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field3276 != null) {
            int var28 = arg1.field3266;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var26 = new int[var28];
            for (int var36 = 0; var36 < this.field1421; var36++) {
                int var43 = var8[var36];
                if (arg1.field3276[var43] != -1) {
                    int var44 = arg1.field3276[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field3296[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field3250[var43];
                        } else {
                            var46 = arg1.field3257[var43];
                        }
                        int var47 = arg1.field3254[var46];
                        int var48 = arg1.field3247[var46];
                        int var49 = arg1.field3289[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            var24 = new int[var28];
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field3256[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field3286[var37];
                        if (var42 == 0) {
                            var41 = 1.0F;
                            var40 = 1.0F;
                        } else if (var42 > 0) {
                            var41 = (float) var42 / 1024.0F;
                            var40 = 1.0F;
                        } else {
                            var40 = (float) (-var42) / 1024.0F;
                            var41 = 1.0F;
                        }
                        var39 = 64.0F / (float) arg1.field3295[var37];
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field3245[var37];
                        var40 = 64.0F / (float) arg1.field3286[var37];
                        var39 = 64.0F / (float) arg1.field3295[var37];
                    } else {
                        var39 = (float) arg1.field3295[var37] / 1024.0F;
                        var40 = (float) arg1.field3286[var37] / 1024.0F;
                        var41 = (float) arg1.field3245[var37] / 1024.0F;
                    }
                    var27[var37] = class361.method2114(arg1.field3269[var37], class15.method97(255, arg1.field3290[var37]), var39, var40, var41, true, arg1.field3288[var37], arg1.field3253[var37]);
                }
            }
        }
        class245[] var50 = new class245[arg1.field3283];
        for (int var51 = 0; var51 < arg1.field3283; var51++) {
            short var158 = arg1.field3296[var51];
            short var159 = arg1.field3250[var51];
            short var160 = arg1.field3257[var51];
            int var161 = this.field1362[var159] - this.field1362[var158];
            int var162 = this.field1370[var159] - this.field1370[var158];
            int var163 = this.field1313[var159] - this.field1313[var158];
            int var164 = this.field1362[var160] - this.field1362[var158];
            int var165 = this.field1370[var160] - this.field1370[var158];
            int var166 = this.field1313[var160] - this.field1313[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - var162 * var164;
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field3272 == null ? 0 : arg1.field3272[var51];
            if (var174 == 0) {
                class177 var176 = var13[var158];
                var176.field2491++;
                var176.field2492 += var172;
                var176.field2498 += var173;
                var176.field2495 += var171;
                class177 var177 = var13[var159];
                var177.field2491++;
                var177.field2498 += var173;
                var177.field2492 += var172;
                var177.field2495 += var171;
                class177 var178 = var13[var160];
                var178.field2491++;
                var178.field2495 += var171;
                var178.field2492 += var172;
                var178.field2498 += var173;
            } else if (var174 == 1) {
                class245 var175 = var50[var51] = new class245();
                var175.field3208 = var173;
                var175.field3210 = var171;
                var175.field3204 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field1421; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field3280[var68] & 0xFFFF;
            short var70;
            if (arg1.field3292 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field3292[var68];
            }
            int var71;
            if (arg1.field3276 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field3276[var68];
            }
            int var72;
            if (arg1.field3246 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field3246[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var80 = 2;
                    var77 = 0.0F;
                    var75 = 1.0F;
                    var73 = 0.0F;
                    var74 = 1.0F;
                    var79 = 1;
                    var78 = 0.0F;
                    var76 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field3256[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field3296[var68];
                        short var112 = arg1.field3250[var68];
                        short var113 = arg1.field3257[var68];
                        short var114 = arg1.field3269[var71];
                        short var115 = arg1.field3288[var71];
                        short var116 = arg1.field3253[var71];
                        float var117 = (float) arg1.field3254[var114];
                        float var118 = (float) arg1.field3247[var114];
                        float var119 = (float) arg1.field3289[var114];
                        float var120 = (float) arg1.field3254[var115] - var117;
                        float var121 = (float) arg1.field3247[var115] - var118;
                        float var122 = (float) arg1.field3289[var115] - var119;
                        float var123 = (float) arg1.field3254[var116] - var117;
                        float var124 = (float) arg1.field3247[var116] - var118;
                        float var125 = (float) arg1.field3289[var116] - var119;
                        float var126 = (float) arg1.field3254[var111] - var117;
                        float var127 = (float) arg1.field3247[var111] - var118;
                        float var128 = (float) arg1.field3289[var111] - var119;
                        float var129 = (float) arg1.field3254[var112] - var117;
                        float var130 = (float) arg1.field3247[var112] - var118;
                        float var131 = (float) arg1.field3289[var112] - var119;
                        float var132 = (float) arg1.field3254[var113] - var117;
                        float var133 = (float) arg1.field3247[var113] - var118;
                        float var134 = (float) arg1.field3289[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        float var142 = var122 * var135 - var120 * var137;
                        float var143 = var120 * var136 - (var121 * var135);
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var143 + var123 * var144 + var124 * var142);
                        var76 = (var131 * var143 + var129 * var144 + var130 * var142) * var145;
                        var74 = (var128 * var143 + var126 * var144 + var127 * var142) * var145;
                        var78 = (var134 * var143 + var132 * var144 + var133 * var142) * var145;
                    } else {
                        short var83 = arg1.field3296[var68];
                        short var84 = arg1.field3250[var68];
                        short var85 = arg1.field3257[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field3263[var71];
                        float var91 = (float) arg1.field3264[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field3245[var71] / 1024.0F;
                            class295.method1744(var92, var90, var89, var88, arg1.field3247[var83], var87, var86, var91, arg1.field3289[var83], arg1.field3254[var83], 6);
                            var73 = class253.field3320;
                            var74 = class680.field9652;
                            class295.method1744(var92, var90, var89, var88, arg1.field3247[var84], var87, var86, var91, arg1.field3289[var84], arg1.field3254[var84], 6);
                            var75 = class253.field3320;
                            var76 = class680.field9652;
                            class295.method1744(var92, var90, var89, var88, arg1.field3247[var85], var87, var86, var91, arg1.field3289[var85], arg1.field3254[var85], 6);
                            var77 = class253.field3320;
                            var78 = class680.field9652;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > var93) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var93 < var73 - var75) {
                                    var75 += var92;
                                    var79 = 2;
                                }
                                if (var93 < var77 - var73) {
                                    var77 -= var92;
                                    var80 = 1;
                                } else if (var93 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                            } else {
                                if ((var78 - var74 > var93)) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var74 - var78 > var93) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                                if (var93 < var76 - var74) {
                                    var76 -= var92;
                                    var79 = 1;
                                } else if (var74 - var76 > var93) {
                                    var79 = 2;
                                    var76 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field3298[var71] / 256.0F;
                            float var95 = (float) arg1.field3249[var71] / 256.0F;
                            int var96 = arg1.field3254[var84] - arg1.field3254[var83];
                            int var97 = arg1.field3247[var84] - arg1.field3247[var83];
                            int var98 = arg1.field3289[var84] - arg1.field3289[var83];
                            int var99 = arg1.field3254[var85] - arg1.field3254[var83];
                            int var100 = arg1.field3247[var85] - arg1.field3247[var83];
                            int var101 = arg1.field3289[var85] - arg1.field3289[var83];
                            int var102 = var97 * var101 - (var98 * var100);
                            int var103 = var98 * var99 - var96 * var101;
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field3286[var71];
                            float var106 = 64.0F / (float) arg1.field3295[var71];
                            float var107 = 64.0F / (float) arg1.field3245[var71];
                            float var108 = (var89[2] * (float) var104 + var89[0] * (float) var102 + var89[1] * (float) var103) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[4] * (float) var103 + var89[3] * (float) var102) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class464.method2589(var110, var108, 5, var109);
                            class110.method597(var86, arg1.field3289[var83], 12, var91, var94, var89, var87, var81, arg1.field3247[var83], arg1.field3254[var83], var88, var95, var90);
                            var73 = class131.field1807;
                            var74 = class294.field3904;
                            class110.method597(var86, arg1.field3289[var84], 12, var91, var94, var89, var87, var81, arg1.field3247[var84], arg1.field3254[var84], var88, var95, var90);
                            var76 = class294.field3904;
                            var75 = class131.field1807;
                            class110.method597(var86, arg1.field3289[var85], 12, var91, var94, var89, var87, var81, arg1.field3247[var85], arg1.field3254[var85], var88, var95, var90);
                            var78 = class294.field3904;
                            var77 = class131.field1807;
                        } else if (var82 == 3) {
                            class487.method2798(11999, var89, var87, arg1.field3247[var83], arg1.field3254[var83], arg1.field3289[var83], var86, var90, var88, var91);
                            var74 = class242.field3192;
                            var73 = class113.field1448;
                            class487.method2798(11999, var89, var87, arg1.field3247[var84], arg1.field3254[var84], arg1.field3289[var84], var86, var90, var88, var91);
                            var76 = class242.field3192;
                            var75 = class113.field1448;
                            class487.method2798(11999, var89, var87, arg1.field3247[var85], arg1.field3254[var85], arg1.field3289[var85], var86, var90, var88, var91);
                            var77 = class113.field1448;
                            var78 = class242.field3192;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field3272 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field3272[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var152 = arg1.field3296[var68];
                short var153 = arg1.field3250[var68];
                short var154 = arg1.field3257[var68];
                class177 var155 = var13[var152];
                this.field1408[var52] = this.method618(-107, var152, arg1, var155.field2491, var74, var155.field2492, var73, var155.field2498, var155.field2495, var150);
                class177 var156 = var13[var153];
                this.field1329[var52] = this.method618(-106, var153, arg1, var156.field2491, var76, var156.field2492, var75, var156.field2498, var156.field2495, (long) var79 + var150);
                class177 var157 = var13[var154];
                this.field1351[var52] = this.method618(-125, var154, arg1, var157.field2491, var78, var157.field2492, var77, var157.field2498, var157.field2495, (long) var80 + var150);
            } else if (var146 == 1) {
                class245 var147 = var50[var68];
                long var148 = (long) ((var147.field3204 + 256 << 22) + (var71 << 2) + (var147.field3210 <= 0 ? 2048 : 1024) + (var147.field3208 + 256 << 12)) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field1408[var52] = this.method618(-127, arg1.field3296[var68], arg1, 0, var74, var147.field3204, var73, var147.field3208, var147.field3210, var148);
                this.field1329[var52] = this.method618(-126, arg1.field3250[var68], arg1, 0, var76, var147.field3204, var75, var147.field3208, var147.field3210, (long) var79 + var148);
                this.field1351[var52] = this.method618(-110, arg1.field3257[var68], arg1, 0, var78, var147.field3204, var77, var147.field3208, var147.field3210, (long) var80 + var148);
            }
            if (arg1.field3292 == null) {
                this.field1326[var52] = -1;
            } else {
                this.field1326[var52] = arg1.field3292[var68];
            }
            if (arg1.field3246 != null) {
                this.field1359[var52] = arg1.field3246[var68];
            }
            if (arg1.field3270 != null) {
                this.field1377[var52] = arg1.field3270[var68];
            }
            this.field1320[var52] = arg1.field3280[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field1364; var55++) {
            short var67 = this.field1326[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field1319 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field1364; var58++) {
            short var66 = this.field1326[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field1319[var56++] = var58;
            }
        }
        this.field1319[var56] = this.field1364;
        class256.field3357 = null;
        this.field1400 = class461.method2578(this.field1400, 3, this.field1402);
        this.field1368 = class461.method2578(this.field1368, 3, this.field1402);
        this.field1401 = class461.method2578(this.field1401, 3, this.field1402);
        this.field1409 = class255.method1543(this.field1409, this.field1402, 3);
        this.field1307 = class468.method2611(false, this.field1307, this.field1402);
        this.field1396 = class468.method2611(false, this.field1396, this.field1402);
        if (arg1.field3277 != null && class470.method2707(arg2, this.field1398, 118)) {
            this.field1374 = arg1.method1516(true, false);
        }
        if (arg1.field3275 != null && class669.method3799(this.field1398, arg2, -105)) {
            this.field1415 = arg1.method1514(-1);
        }
        if (arg1.field3258 != null && class505.method2877(76, arg2, this.field1398)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field1421; var61++) {
                int var65 = arg1.field3258[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field1410 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field1410[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field1421; var63++) {
                int var64 = arg1.field3258[var8[var63]];
                if (var64 >= 0) {
                    this.field1410[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "()I", line = 3384)
    public final int method636() {
        field1327++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        return this.field1395;
    }

    @OriginalMember(owner = "client!vp", name = "FA", descriptor = "()V", line = 3396)
    public final void method637() {
        for (int var1 = 0; var1 < this.field1352; var1++) {
            this.field1313[var1] = -this.field1313[var1];
        }
        field1358++;
        for (int var2 = 0; var2 < this.field1402; var2++) {
            this.field1401[var2] = (short) (-this.field1401[var2]);
        }
        for (int var3 = 0; var3 < this.field1421; var3++) {
            short var4 = this.field1408[var3];
            this.field1408[var3] = this.field1351[var3];
            this.field1351[var3] = var4;
        }
        if (this.field1366 == null && this.field1393 != null) {
            this.field1393.field2697 = null;
        }
        if (this.field1366 != null) {
            this.field1366.field2697 = null;
        }
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
        if (this.field1417 != null) {
            this.field1417.field4583 = null;
        }
        this.field1335 = false;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(SS)V", line = 3446)
    public final void method638(short arg0, short arg1) {
        field1348++;
        for (int var3 = 0; var3 < this.field1421; var3++) {
            if (this.field1320[var3] == arg0) {
                this.field1320[var3] = arg1;
            }
        }
        if (this.field1317 != null) {
            for (int var4 = 0; var4 < this.field1346; var4++) {
                class474 var5 = this.field1317[var4];
                class21 var6 = this.field1340[var4];
                var6.field267 = var6.field267 & 0xFF000000 | class104.field1240[this.field1320[var5.field6604] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1393 != null) {
            this.field1393.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIZLvp;ZLvp;)Lda;", line = 3491)
    private final class470 method639(boolean arg0, int arg1, boolean arg2, class111 arg3, boolean arg4, class111 arg5) {
        arg5.field1337 = 0;
        arg5.field1421 = this.field1421;
        arg5.field1364 = this.field1364;
        arg5.field1371 = arg1;
        arg5.field1352 = this.field1352;
        if ((arg1 & 0x100) == 0) {
            arg5.field1369 = this.field1369;
        } else {
            arg5.field1369 = true;
        }
        arg5.field1315 = this.field1315;
        arg5.field1346 = this.field1346;
        arg5.field1330 = this.field1330;
        field1323++;
        arg5.field1398 = this.field1398;
        arg5.field1402 = this.field1402;
        arg5.field1334 = this.field1334;
        boolean var7 = class583.method3216(arg1, (byte) 109, this.field1398);
        boolean var8 = class339.method1983(arg4, arg1, this.field1398);
        boolean var9 = class215.method1366(this.field1398, (byte) 68, arg1);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg5.field1362 = this.field1362;
            } else if (arg3.field1362 == null || arg3.field1362.length < this.field1334) {
                arg5.field1362 = arg3.field1362 = new int[this.field1334];
            } else {
                arg5.field1362 = arg3.field1362;
            }
            if (!var8) {
                arg5.field1370 = this.field1370;
            } else if (arg3.field1370 == null || this.field1334 > arg3.field1370.length) {
                arg5.field1370 = arg3.field1370 = new int[this.field1334];
            } else {
                arg5.field1370 = arg3.field1370;
            }
            if (!var9) {
                arg5.field1313 = this.field1313;
            } else if (arg3.field1313 == null || this.field1334 > arg3.field1313.length) {
                arg5.field1313 = arg3.field1313 = new int[this.field1334];
            } else {
                arg5.field1313 = arg3.field1313;
            }
            for (int var11 = 0; var11 < this.field1334; var11++) {
                if (var7) {
                    arg5.field1362[var11] = this.field1362[var11];
                }
                if (var8) {
                    arg5.field1370[var11] = this.field1370[var11];
                }
                if (var9) {
                    arg5.field1313[var11] = this.field1313[var11];
                }
            }
        } else {
            arg5.field1362 = this.field1362;
            arg5.field1313 = this.field1313;
            arg5.field1370 = this.field1370;
        }
        if (class400.method2291(6410, arg1, this.field1398)) {
            if (arg2) {
                arg5.field1337 = (byte) (arg5.field1337 | 0x1);
            }
            arg5.field1412 = arg3.field1412;
            arg5.field1412.field2698 = this.field1412.field2698;
            arg5.field1412.field2697 = this.field1412.field2697;
        } else if (class436.method2467(this.field1398, arg1, false)) {
            arg5.field1412 = this.field1412;
        } else {
            arg5.field1412 = null;
        }
        if (class615.method3401(arg1, this.field1398, -28443)) {
            if (arg3.field1320 == null || arg3.field1320.length < this.field1421) {
                arg5.field1320 = arg3.field1320 = new short[this.field1421];
            } else {
                arg5.field1320 = arg3.field1320;
            }
            for (int var12 = 0; var12 < this.field1421; var12++) {
                arg5.field1320[var12] = this.field1320[var12];
            }
        } else {
            arg5.field1320 = this.field1320;
        }
        if (class670.method3805(arg1, this.field1398, (byte) 119)) {
            if (arg3.field1359 == null || arg3.field1359.length < this.field1421) {
                arg5.field1359 = arg3.field1359 = new byte[this.field1421];
            } else {
                arg5.field1359 = arg3.field1359;
            }
            for (int var13 = 0; var13 < this.field1421; var13++) {
                arg5.field1359[var13] = this.field1359[var13];
            }
        } else {
            arg5.field1359 = this.field1359;
        }
        if (class229.method1421(arg1, this.field1398, -1)) {
            if (arg2) {
                arg5.field1337 = (byte) (arg5.field1337 | 0x2);
            }
            arg5.field1393 = arg3.field1393;
            arg5.field1393.field2697 = this.field1393.field2697;
            arg5.field1393.field2698 = this.field1393.field2698;
        } else if (class450.method2532(this.field1398, (byte) 26, arg1)) {
            arg5.field1393 = this.field1393;
        } else {
            arg5.field1393 = null;
        }
        if (class299.method1764((byte) -120, this.field1398, arg1)) {
            if (arg3.field1400 == null || arg3.field1400.length < this.field1402) {
                int var14 = this.field1402;
                arg5.field1401 = arg3.field1401 = new short[var14];
                arg5.field1368 = arg3.field1368 = new short[var14];
                arg5.field1400 = arg3.field1400 = new short[var14];
            } else {
                arg5.field1401 = arg3.field1401;
                arg5.field1400 = arg3.field1400;
                arg5.field1368 = arg3.field1368;
            }
            if (this.field1389 == null) {
                for (int var15 = 0; var15 < this.field1402; var15++) {
                    arg5.field1400[var15] = this.field1400[var15];
                    arg5.field1368[var15] = this.field1368[var15];
                    arg5.field1401[var15] = this.field1401[var15];
                }
            } else {
                if (arg3.field1389 == null) {
                    arg3.field1389 = new class413();
                }
                class413 var16 = arg5.field1389 = arg3.field1389;
                if (var16.field5415 == null || this.field1402 > var16.field5415.length) {
                    int var17 = this.field1402;
                    var16.field5413 = new short[var17];
                    var16.field5418 = new short[var17];
                    var16.field5415 = new short[var17];
                    var16.field5417 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field1402; var18++) {
                    arg5.field1400[var18] = this.field1400[var18];
                    arg5.field1368[var18] = this.field1368[var18];
                    arg5.field1401[var18] = this.field1401[var18];
                    var16.field5415[var18] = this.field1389.field5415[var18];
                    var16.field5413[var18] = this.field1389.field5413[var18];
                    var16.field5418[var18] = this.field1389.field5418[var18];
                    var16.field5417[var18] = this.field1389.field5417[var18];
                }
            }
            arg5.field1409 = this.field1409;
        } else {
            arg5.field1400 = this.field1400;
            arg5.field1368 = this.field1368;
            arg5.field1389 = this.field1389;
            arg5.field1409 = this.field1409;
            arg5.field1401 = this.field1401;
        }
        if (class692.method3903(-1, arg1, this.field1398)) {
            if (arg2) {
                arg5.field1337 = (byte) (arg5.field1337 | 0x4);
            }
            arg5.field1366 = arg3.field1366;
            arg5.field1366.field2698 = this.field1366.field2698;
            arg5.field1366.field2697 = this.field1366.field2697;
        } else if (class615.method3403(false, this.field1398, arg1)) {
            arg5.field1366 = this.field1366;
        } else {
            arg5.field1366 = null;
        }
        if (class193.method1263(101, arg1, this.field1398)) {
            if (arg3.field1307 == null || this.field1421 > arg3.field1307.length) {
                int var19 = this.field1402;
                arg5.field1396 = arg3.field1396 = new float[var19];
                arg5.field1307 = arg3.field1307 = new float[var19];
            } else {
                arg5.field1396 = arg3.field1396;
                arg5.field1307 = arg3.field1307;
            }
            for (int var20 = 0; var20 < this.field1402; var20++) {
                arg5.field1307[var20] = this.field1307[var20];
                arg5.field1396[var20] = this.field1396[var20];
            }
        } else {
            arg5.field1307 = this.field1307;
            arg5.field1396 = this.field1396;
        }
        if (class703.method3947((byte) 46, arg1, this.field1398)) {
            if (arg2) {
                arg5.field1337 = (byte) (arg5.field1337 | 0x8);
            }
            arg5.field1399 = arg3.field1399;
            arg5.field1399.field2697 = this.field1399.field2697;
            arg5.field1399.field2698 = this.field1399.field2698;
        } else if (class592.method3280(arg1, (byte) -125, this.field1398)) {
            arg5.field1399 = this.field1399;
        } else {
            arg5.field1399 = null;
        }
        if (class322.method1873(this.field1398, arg1, (byte) -33)) {
            if (arg3.field1408 == null || arg3.field1408.length < this.field1421) {
                int var21 = this.field1421;
                arg5.field1408 = arg3.field1408 = new short[var21];
                arg5.field1329 = arg3.field1329 = new short[var21];
                arg5.field1351 = arg3.field1351 = new short[var21];
            } else {
                arg5.field1329 = arg3.field1329;
                arg5.field1408 = arg3.field1408;
                arg5.field1351 = arg3.field1351;
            }
            for (int var22 = 0; var22 < this.field1421; var22++) {
                arg5.field1408[var22] = this.field1408[var22];
                arg5.field1329[var22] = this.field1329[var22];
                arg5.field1351[var22] = this.field1351[var22];
            }
        } else {
            arg5.field1351 = this.field1351;
            arg5.field1408 = this.field1408;
            arg5.field1329 = this.field1329;
        }
        if (class524.method2974(this.field1398, arg1, -14006)) {
            arg5.field1417 = arg3.field1417;
            if (arg2) {
                arg5.field1337 = (byte) (arg5.field1337 | 0x10);
            }
            arg5.field1417.field4583 = this.field1417.field4583;
        } else if (class554.method3096(arg1, -9381, this.field1398)) {
            arg5.field1417 = this.field1417;
        } else {
            arg5.field1417 = null;
        }
        if (class216.method1376((byte) 81, arg1, this.field1398)) {
            if (arg3.field1326 == null || this.field1421 > arg3.field1326.length) {
                int var23 = this.field1421;
                arg5.field1326 = arg3.field1326 = new short[var23];
            } else {
                arg5.field1326 = arg3.field1326;
            }
            for (int var24 = 0; var24 < this.field1421; var24++) {
                arg5.field1326[var24] = this.field1326[var24];
            }
        } else {
            arg5.field1326 = this.field1326;
        }
        if (!class540.method3032(arg1, this.field1398, 21637)) {
            arg5.field1340 = this.field1340;
        } else if (arg3.field1340 == null || this.field1346 > arg3.field1340.length) {
            int var26 = this.field1346;
            arg5.field1340 = arg3.field1340 = new class21[var26];
            for (int var27 = 0; var27 < this.field1346; var27++) {
                arg5.field1340[var27] = this.field1340[var27].method133((byte) 118);
            }
        } else {
            arg5.field1340 = arg3.field1340;
            for (int var25 = 0; var25 < this.field1346; var25++) {
                arg5.field1340[var25].method132(this.field1340[var25], (byte) 61);
            }
        }
        arg5.field1374 = this.field1374;
        arg5.field1415 = this.field1415;
        arg5.field1317 = this.field1317;
        arg5.field1308 = this.field1308;
        arg5.field1407 = this.field1407;
        arg5.field1349 = this.field1349;
        arg5.field1410 = this.field1410;
        arg5.field1319 = this.field1319;
        arg5.field1388 = this.field1388;
        arg5.field1311 = this.field1311;
        arg5.field1377 = this.field1377;
        if (this.field1335) {
            arg5.field1335 = true;
            arg5.field1353 = this.field1353;
            arg5.field1344 = this.field1344;
            arg5.field1354 = this.field1354;
            arg5.field1322 = this.field1322;
            arg5.field1314 = this.field1314;
            arg5.field1395 = this.field1395;
            arg5.field1375 = this.field1375;
            arg5.field1309 = this.field1309;
        } else {
            arg5.field1335 = false;
        }
        return arg5;
    }

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "()Z", line = 3959)
    public final boolean method640() {
        field1325++;
        if (this.field1374 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1334; var1++) {
            this.field1362[var1] <<= 0x4;
            this.field1370[var1] <<= 0x4;
            this.field1313[var1] <<= 0x4;
        }
        class75.field892 = 0;
        class9.field80 = 0;
        class123.field1617 = 0;
        return true;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBBSI)I", line = 3990)
    private final int method641(int arg0, byte arg1, byte arg2, short arg3, int arg4) {
        if (arg1 != -11) {
            return 1;
        }
        field1378++;
        int var6 = class104.field1240[class424.method2403(arg0, (byte) 16, arg4)];
        if (arg3 != -1) {
            class105 var7 = this.field1363.field7682.method2959(arg1 ^ 0xFFFFFFB0, arg3 & 0xFFFF);
            int var8 = var7.field1244 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg0 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field1263 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF00F7) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + (255 - (arg2 & 0xFF));
    }

    @OriginalMember(owner = "client!vp", name = "na", descriptor = "()I", line = 4069)
    public final int method642() {
        field1420++;
        return this.field1330;
    }

    @OriginalMember(owner = "client!vp", name = "MA", descriptor = "(I)V", line = 4081)
    public final void method643(int arg0) {
        field1321++;
        int var2 = class240.field3176[arg0];
        int var3 = class240.field3177[arg0];
        for (int var4 = 0; var4 < this.field1352; var4++) {
            int var5 = this.field1370[var4] * var3 - (this.field1313[var4] * var2) >> 14;
            this.field1313[var4] = this.field1370[var4] * var2 + this.field1313[var4] * var3 >> 14;
            this.field1370[var4] = var5;
        }
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
        this.field1335 = false;
    }

    @OriginalMember(owner = "client!vp", name = "fa", descriptor = "(I)V", line = 4117)
    public final void method644(int arg0) {
        field1379++;
        int var2 = class240.field3176[arg0];
        int var3 = class240.field3177[arg0];
        for (int var4 = 0; var4 < this.field1352; var4++) {
            int var7 = this.field1313[var4] * var2 + (this.field1362[var4] * var3) >> 14;
            this.field1313[var4] = this.field1313[var4] * var3 - this.field1362[var4] * var2 >> 14;
            this.field1362[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1402; var5++) {
            int var6 = this.field1401[var5] * var2 + (this.field1400[var5] * var3) >> 14;
            this.field1401[var5] = (short) (this.field1401[var5] * var3 - (this.field1400[var5] * var2) >> 14);
            this.field1400[var5] = (short) var6;
        }
        if (this.field1366 == null && this.field1393 != null) {
            this.field1393.field2697 = null;
        }
        if (this.field1366 != null) {
            this.field1366.field2697 = null;
        }
        this.field1335 = false;
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "ba", descriptor = "(IILi;Li;III)V", line = 4168)
    public final void method645(int arg0, int arg1, class270 arg2, class270 arg3, int arg4, int arg5, int arg6) {
        field1350++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        int var8 = this.field1354 + arg4;
        int var9 = this.field1375 + arg4;
        int var10 = this.field1309 + arg6;
        int var11 = this.field1353 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3524 <= var9 + arg2.field3527 >> arg2.field3530 || var10 < 0 || arg2.field3525 <= arg2.field3527 + var11 >> arg2.field3530) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || var9 + arg3.field3527 >> arg3.field3530 >= arg3.field3524 || var10 < 0 || arg3.field3525 <= arg3.field3527 + var11 >> arg3.field3530) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3530;
            int var13 = arg2.field3527 + var9 - 1 >> arg2.field3530;
            int var14 = var10 >> arg2.field3530;
            int var15 = var11 - (1 - arg2.field3527) >> arg2.field3530;
            if (arg2.method1611(var12, true, var14) == arg5 && arg2.method1611(var13, true, var14) == arg5 && arg2.method1611(var12, true, var15) == arg5 && arg2.method1611(var13, true, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field1352; var32++) {
                this.field1370[var32] = this.field1370[var32] + arg2.method1609(this.field1362[var32] + arg4, this.field1313[var32] + arg6, 2) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field1314;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field1352; var17++) {
                int var18 = (this.field1370[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field1370[var17] -= -((arg1 - var18) * (arg2.method1609(this.field1362[var17] + arg4, this.field1313[var17] + arg6, -126) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFF4C) >> 8) * 4;
            int var30 = (arg1 >> 16 & 0xFF) << 6;
            int var31 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var28 >> 1)) < 0 || (arg4 + (var28 >> 1) + arg2.field3527) >= (arg2.field3524 << arg2.field3530) || (arg6 - (var29 >> 1)) < 0 || ((var29 >> 1) + arg6 + arg2.field3527) >= (arg2.field3525 << arg2.field3530)) {
                return;
            }
            this.method2711(var29, arg2, arg6, 23452, var30, arg5, arg4, var28, var31);
        } else if (arg0 == 4) {
            int var19 = this.field1344 - this.field1314;
            for (int var20 = 0; var20 < this.field1352; var20++) {
                this.field1370[var20] = this.field1370[var20] + var19 + arg3.method1609(this.field1362[var20] - -arg4, this.field1313[var20] + arg6, 108) - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field1344 - this.field1314;
            for (int var22 = 0; var22 < this.field1352; var22++) {
                int var23 = this.field1362[var22] + arg4;
                int var24 = this.field1313[var22] + arg6;
                int var25 = arg2.method1609(var23, var24, -125);
                int var26 = arg3.method1609(var23, var24, -123);
                int var27 = var25 - var26 - arg1;
                this.field1370[var22] = ((this.field1370[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        if (this.field1412 != null) {
            this.field1412.field2697 = null;
        }
        this.field1335 = false;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[IIIIIZ)V", line = 4321)
    public final void method646(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1372++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            class75.field892 = 0;
            int var12 = 0;
            class123.field1617 = 0;
            class9.field80 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1374.length > var14) {
                    int[] var15 = this.field1374[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class9.field80 += this.field1362[var17];
                        class75.field892 += this.field1370[var17];
                        class123.field1617 += this.field1313[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class9.field80 = var10;
                class123.field1617 = var9;
                class75.field892 = var11;
            } else {
                class75.field892 = class75.field892 / var12 + var11;
                class9.field80 = class9.field80 / var12 + var10;
                class123.field1617 = class123.field1617 / var12 + var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1374.length > var22) {
                    int[] var23 = this.field1374[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1362[var25] += var18;
                        this.field1370[var25] += var20;
                        this.field1313[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field1374.length > var45) {
                    int[] var46 = this.field1374[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1362[var59] -= class9.field80;
                            this.field1370[var59] -= class75.field892;
                            this.field1313[var59] -= class123.field1617;
                            if (arg4 != 0) {
                                int var60 = class240.field3176[arg4];
                                int var61 = class240.field3177[arg4];
                                int var62 = this.field1370[var59] * var60 + this.field1362[var59] * var61 + 16383 >> 14;
                                this.field1370[var59] = this.field1370[var59] * var61 - (this.field1362[var59] * var60 - 16383) >> 14;
                                this.field1362[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class240.field3176[arg2];
                                int var64 = class240.field3177[arg2];
                                int var65 = this.field1370[var59] * var64 + 16383 - this.field1313[var59] * var63 >> 14;
                                this.field1313[var59] = this.field1370[var59] * var63 + this.field1313[var59] * var64 + 16383 >> 14;
                                this.field1370[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class240.field3176[arg3];
                                int var67 = class240.field3177[arg3];
                                int var68 = this.field1362[var59] * var67 + this.field1313[var59] * var66 + 16383 >> 14;
                                this.field1313[var59] = this.field1313[var59] * var67 + 16383 - this.field1362[var59] * var66 >> 14;
                                this.field1362[var59] = var68;
                            }
                            this.field1362[var59] += class9.field80;
                            this.field1370[var59] += class75.field892;
                            this.field1313[var59] += class123.field1617;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1362[var48] -= class9.field80;
                            this.field1370[var48] -= class75.field892;
                            this.field1313[var48] -= class123.field1617;
                            if (arg2 != 0) {
                                int var49 = class240.field3176[arg2];
                                int var50 = class240.field3177[arg2];
                                int var51 = this.field1370[var48] * var50 + 16383 - (this.field1313[var48] * var49) >> 14;
                                this.field1313[var48] = this.field1370[var48] * var49 + this.field1313[var48] * var50 + 16383 >> 14;
                                this.field1370[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class240.field3176[arg4];
                                int var53 = class240.field3177[arg4];
                                int var54 = this.field1370[var48] * var52 + (this.field1362[var48] * var53) + 16383 >> 14;
                                this.field1370[var48] = this.field1370[var48] * var53 + 16383 - (this.field1362[var48] * var52) >> 14;
                                this.field1362[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class240.field3176[arg3];
                                int var56 = class240.field3177[arg3];
                                int var57 = this.field1362[var48] * var56 + (this.field1313[var48] * var55 + 16383) >> 14;
                                this.field1313[var48] = this.field1313[var48] * var56 + 16383 - (this.field1362[var48] * var55) >> 14;
                                this.field1362[var48] = var57;
                            }
                            this.field1362[var48] += class9.field80;
                            this.field1370[var48] += class75.field892;
                            this.field1313[var48] += class123.field1617;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field1374.length > var28) {
                        int[] var29 = this.field1374[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1388[var31];
                            int var33 = this.field1388[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1349[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class240.field3176[arg4];
                                    int var37 = class240.field3177[arg4];
                                    int var38 = this.field1368[var35] * var36 + (this.field1400[var35] * var37) + 16383 >> 14;
                                    this.field1368[var35] = (short) (this.field1368[var35] * var37 + 16383 - (this.field1400[var35] * var36) >> 14);
                                    this.field1400[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class240.field3176[arg2];
                                    int var40 = class240.field3177[arg2];
                                    int var41 = this.field1368[var35] * var40 + 16383 - (this.field1401[var35] * var39) >> 14;
                                    this.field1401[var35] = (short) (this.field1401[var35] * var40 + this.field1368[var35] * var39 + 16383 >> 14);
                                    this.field1368[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class240.field3176[arg3];
                                    int var43 = class240.field3177[arg3];
                                    int var44 = this.field1401[var35] * var42 + (this.field1400[var35] * var43 + 16383) >> 14;
                                    this.field1401[var35] = (short) (this.field1401[var35] * var43 + 16383 - (this.field1400[var35] * var42) >> 14);
                                    this.field1400[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1366 == null && this.field1393 != null) {
                    this.field1393.field2697 = null;
                }
                if (this.field1366 != null) {
                    this.field1366.field2697 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field1374.length) {
                    int[] var71 = this.field1374[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1362[var73] -= class9.field80;
                        this.field1370[var73] -= class75.field892;
                        this.field1313[var73] -= class123.field1617;
                        this.field1362[var73] = this.field1362[var73] * arg2 >> 7;
                        this.field1370[var73] = this.field1370[var73] * arg3 >> 7;
                        this.field1313[var73] = this.field1313[var73] * arg4 >> 7;
                        this.field1362[var73] += class9.field80;
                        this.field1370[var73] += class75.field892;
                        this.field1313[var73] += class123.field1617;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1410 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field1410.length) {
                        int[] var79 = this.field1410[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1359[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1359[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1393 != null) {
                            this.field1393.field2697 = null;
                        }
                    }
                }
                if (this.field1317 != null) {
                    for (int var75 = 0; var75 < this.field1346; var75++) {
                        class474 var76 = this.field1317[var75];
                        class21 var77 = this.field1340[var75];
                        var77.field267 = 255 - (this.field1359[var76.field6604] & 0xFF) << 24 | var77.field267 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1410 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field1410.length) {
                        int[] var88 = this.field1410[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1320[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3DD) >> 7;
                            int var94 = var92 + arg2 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field1320[var90] = (short) class665.method3789(var97, class665.method3789(var95 << 7, var94 << 10));
                        }
                        if (var88.length > 0 && this.field1393 != null) {
                            this.field1393.field2697 = null;
                        }
                    }
                }
                if (this.field1317 != null) {
                    for (int var84 = 0; var84 < this.field1346; var84++) {
                        class474 var85 = this.field1317[var84];
                        class21 var86 = this.field1340[var84];
                        var86.field267 = class104.field1240[this.field1320[var85.field6604] & 0xFFFF] & 0xFFFFFF | var86.field267 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1415 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field1415.length) {
                        int[] var100 = this.field1415[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class21 var102 = this.field1340[var100[var101]];
                            var102.field266 += arg2;
                            var102.field261 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1415 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field1415.length) {
                        int[] var105 = this.field1415[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class21 var107 = this.field1340[var105[var106]];
                            var107.field271 = var107.field271 * arg3 >> 7;
                            var107.field269 = var107.field269 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1415 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field1415.length > var109) {
                    int[] var110 = this.field1415[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class21 var112 = this.field1340[var110[var111]];
                        var112.field265 = var112.field265 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "()I", line = 4974)
    public final int method647() {
        field1343++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        return this.field1375;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lq;Lbc;II)V", line = 4991)
    public final void method648(class487 arg0, class667 arg1, int arg2, int arg3) {
        field1380++;
        if (this.field1402 == 0) {
            return;
        }
        class62 var5 = this.field1363.field6428;
        if (!this.field1335) {
            this.method622(-27300);
        }
        class62 var6 = (class62) arg0;
        class381.field5040 = var5.field795 * var6.field791 + var5.field790 * var6.field769 + var5.field775 * var6.field792 + var5.field791;
        class602.field8407 = var5.field795 * var6.field775 + var5.field790 * var6.field770 + var5.field775 * var6.field767;
        float var7 = (float) this.field1314 * class602.field8407 + class381.field5040;
        float var8 = (float) this.field1344 * class602.field8407 + class381.field5040;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field1395 + var7;
            var10 = var8 - (float) this.field1395;
        } else {
            var9 = (float) this.field1395 + var8;
            var10 = var7 - (float) this.field1395;
        }
        if ((var10 >= this.field1363.field6476) || ((float) this.field1363.field6440 >= var9)) {
            return;
        }
        class60.field753 = var5.field783 * var6.field791 + var5.field771 * var6.field769 + var5.field770 * var6.field792 + var5.field769;
        class293.field3901 = var5.field783 * var6.field775 + var5.field771 * var6.field770 + var5.field770 * var6.field767;
        float var11 = (float) this.field1314 * class293.field3901 + class60.field753;
        float var12 = (float) this.field1344 * class293.field3901 + class60.field753;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field1395 + var11) * (float) this.field1363.field6451;
            var14 = (var12 - (float) this.field1395) * (float) this.field1363.field6451;
        } else {
            var13 = ((float) this.field1395 + var12) * (float) this.field1363.field6451;
            var14 = (var11 - (float) this.field1395) * (float) this.field1363.field6451;
        }
        if ((this.field1363.field6467 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field1363.field6479)) {
            return;
        }
        class118.field1508 = var5.field789 * var6.field775 + var5.field772 * var6.field770 + var5.field767 * var6.field767;
        class541.field7419 = var5.field789 * var6.field791 + var5.field772 * var6.field769 + var5.field767 * var6.field792 + var5.field792;
        float var15 = (float) this.field1314 * class118.field1508 + class541.field7419;
        float var16 = (float) this.field1344 * class118.field1508 + class541.field7419;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = (var16 - (float) this.field1395) * (float) this.field1363.field6500;
            var18 = ((float) this.field1395 + var15) * (float) this.field1363.field6500;
        } else {
            var18 = ((float) this.field1395 + var16) * (float) this.field1363.field6500;
            var17 = (var15 - (float) this.field1395) * (float) this.field1363.field6500;
        }
        if ((this.field1363.field6444 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field1363.field6536)) {
            return;
        }
        if (arg1 != null || this.field1317 != null) {
            class308.field4137 = var5.field795 * var6.field795 + var5.field790 * var6.field783 + var5.field775 * var6.field789;
            class354.field4727 = var5.field789 * var6.field795 + var5.field772 * var6.field783 + var5.field767 * var6.field789;
            class37.field503 = var5.field795 * var6.field790 + var5.field790 * var6.field771 + var5.field775 * var6.field772;
            class547.field7484 = var5.field789 * var6.field790 + var5.field772 * var6.field771 + var5.field767 * var6.field772;
            class34.field487 = var5.field783 * var6.field790 + var5.field771 * var6.field771 + var5.field770 * var6.field772;
            class648.field8952 = var5.field783 * var6.field795 + var5.field771 * var6.field783 + var5.field770 * var6.field789;
        }
        if (arg1 != null) {
            int var19 = this.field1375 + this.field1354 >> 1;
            int var20 = this.field1309 + this.field1353 >> 1;
            int var21 = (int) ((float) var20 * class648.field8952 + (float) this.field1314 * class293.field3901 + (float) var19 * class34.field487 + class60.field753);
            int var22 = (int) ((float) var20 * class354.field4727 + (float) this.field1314 * class118.field1508 + (float) var19 * class547.field7484 + class541.field7419);
            int var23 = (int) ((float) var20 * class308.field4137 + (float) this.field1314 * class602.field8407 + (float) var19 * class37.field503 + class381.field5040);
            int var24 = (int) ((float) var20 * class648.field8952 + (float) this.field1344 * class293.field3901 + (float) var19 * class34.field487 + class60.field753);
            int var25 = (int) ((float) var20 * class354.field4727 + (float) this.field1344 * class118.field1508 + (float) var19 * class547.field7484 + class541.field7419);
            arg1.field9486 = this.field1363.field6451 * var24 / arg2 + this.field1363.field6495;
            int var26 = (int) ((float) var20 * class308.field4137 + (float) this.field1344 * class602.field8407 + (float) var19 * class37.field503 + class381.field5040);
            arg1.field9482 = this.field1363.field6500 * var22 / arg2 + this.field1363.field6508;
            arg1.field9483 = this.field1363.field6508 + (this.field1363.field6500 * var25 / arg2);
            arg1.field9485 = this.field1363.field6495 + (this.field1363.field6451 * var21 / arg2);
            if (var23 >= this.field1363.field6440 || var26 >= this.field1363.field6440) {
                arg1.field9484 = this.field1363.field6495 + ((this.field1395 + var21) * this.field1363.field6451 / arg2) - arg1.field9485;
                arg1.field9487 = true;
            }
        }
        this.field1363.method2628((float) arg2, 4);
        this.field1363.method2660(16);
        this.field1363.method2632(var6, (byte) -65);
        this.method629(117);
        this.field1363.method2651(95);
        this.method609(65);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BIZ)Lda;", line = 5143)
    public final class470 method649(byte arg0, int arg1, boolean arg2) {
        field1333++;
        class111 var4;
        class111 var5;
        if (arg0 == 1) {
            var4 = this.field1363.field6528;
            var5 = this.field1363.field6434;
        } else if (arg0 == 2) {
            var5 = this.field1363.field6443;
            var4 = this.field1363.field6520;
        } else if (arg0 == 3) {
            var5 = this.field1363.field6449;
            var4 = this.field1363.field6511;
        } else if (arg0 == 4) {
            var4 = this.field1363.field6441;
            var5 = this.field1363.field6529;
        } else if (arg0 == 5) {
            var4 = this.field1363.field6505;
            var5 = this.field1363.field6485;
        } else {
            var5 = var4 = new class111(this.field1363);
        }
        return this.method639(arg2, arg1, arg0 != 0, var4, true, var5);
    }

    @OriginalMember(owner = "client!vp", name = "KA", descriptor = "()I", line = 5191)
    public final int method650() {
        field1397++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        return this.field1354;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)V", line = 5203)
    public final void method651(int arg0, int arg1, int arg2, int arg3) {
        field1356++;
        for (int var5 = 0; var5 < this.field1421; var5++) {
            int var9 = this.field1320[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field1320[var5] = (short) class665.method3789(var12, class665.method3789(var11 << 7, var10 << 10));
        }
        if (this.field1317 != null) {
            for (int var6 = 0; var6 < this.field1346; var6++) {
                class474 var7 = this.field1317[var6];
                class21 var8 = this.field1340[var6];
                var8.field267 = var8.field267 & 0xFF000000 | class104.field1240[this.field1320[var7.field6604] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1393 != null) {
            this.field1393.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()[Lmp;", line = 5260)
    public final class140[] method652() {
        field1324++;
        return this.field1311;
    }

    @OriginalMember(owner = "client!vp", name = "ga", descriptor = "(I)V", line = 5268)
    public final void method653(int arg0) {
        this.field1330 = (short) arg0;
        if (this.field1393 != null) {
            this.field1393.field2697 = null;
        }
        field1306++;
        if (this.field1366 != null) {
            this.field1366.field2697 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "S", descriptor = "(Lha;)Lha;", line = 5293)
    public final class117 method654(class117 arg0) {
        field1404++;
        if (this.field1402 == 0) {
            return null;
        }
        if (!this.field1335) {
            this.method622(-27300);
        }
        int var2;
        int var3;
        if (this.field1363.field6526 <= 0) {
            var2 = this.field1354 - (this.field1363.field6526 * this.field1314 >> 8) >> this.field1363.field6396;
            var3 = this.field1375 - (this.field1363.field6526 * this.field1344 >> 8) >> this.field1363.field6396;
        } else {
            var2 = this.field1354 - (this.field1363.field6526 * this.field1344 >> 8) >> this.field1363.field6396;
            var3 = this.field1375 - (this.field1363.field6526 * this.field1314 >> 8) >> this.field1363.field6396;
        }
        int var4;
        int var5;
        if (this.field1363.field6513 <= 0) {
            var4 = this.field1309 - (this.field1363.field6513 * this.field1314 >> 8) >> this.field1363.field6396;
            var5 = this.field1353 - (this.field1363.field6513 * this.field1344 >> 8) >> this.field1363.field6396;
        } else {
            var4 = this.field1309 - (this.field1363.field6513 * this.field1344 >> 8) >> this.field1363.field6396;
            var5 = this.field1353 - (this.field1363.field6513 * this.field1314 >> 8) >> this.field1363.field6396;
        }
        int var6 = var3 - (var2 - 1);
        int var7 = var5 + 1 - var4;
        class187 var8 = (class187) arg0;
        class187 var9;
        if (var8 != null && var8.method1238(false, var6, var7)) {
            var9 = var8;
            var8.method1240((byte) -71);
        } else {
            var9 = new class187(this.field1363, var6, var7);
        }
        var9.method1237(var4, (byte) -117, var3, var2, var5);
        this.method623(var9, (byte) -90);
        return var9;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILq;Z)Z", line = 5359)
    public final boolean method655(int arg0, int arg1, class487 arg2, boolean arg3) {
        field1385++;
        return this.method659(arg3, arg0, arg1, -24946, -1, arg2);
    }

    @OriginalMember(owner = "client!vp", name = "OA", descriptor = "()I", line = 5367)
    public final int method656() {
        field1424++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        return this.field1309;
    }

    @OriginalMember(owner = "client!vp", name = "LA", descriptor = "()Z", line = 5382)
    public final boolean method657() {
        field1365++;
        return this.field1369;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBIIIIIII)Z", line = 5393)
    private final boolean method658(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 > -120) {
            return true;
        }
        field1360++;
        if (arg7 < arg4 && arg5 > arg7 && arg7 < arg6) {
            return false;
        } else if (arg4 < arg7 && arg7 > arg5 && arg7 > arg6) {
            return false;
        } else if (arg8 > arg0 && arg0 < arg3 && arg2 > arg0) {
            return false;
        } else {
            return arg0 <= arg8 || arg3 >= arg0 || arg2 >= arg0;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIIIILq;)Z", line = 5420)
    private final boolean method659(boolean arg0, int arg1, int arg2, int arg3, int arg4, class487 arg5) {
        field1390++;
        class62 var7 = (class62) arg5;
        class62 var8 = this.field1363.field6428;
        float var9 = var7.field791 * var8.field783 + var7.field792 * var8.field770 + var7.field769 * var8.field771 + var8.field769;
        float var10 = var7.field791 * var8.field789 + var7.field792 * var8.field767 + var7.field769 * var8.field772 + var8.field792;
        class118.field1508 = var7.field775 * var8.field789 + var7.field770 * var8.field772 + var7.field767 * var8.field767;
        class34.field487 = var7.field790 * var8.field783 + var7.field772 * var8.field770 + var7.field771 * var8.field771;
        float var11 = var7.field791 * var8.field795 + var7.field792 * var8.field775 + var7.field769 * var8.field790 + var8.field791;
        class648.field8952 = var7.field795 * var8.field783 + var7.field789 * var8.field770 + var7.field783 * var8.field771;
        class602.field8407 = var7.field775 * var8.field795 + var7.field770 * var8.field790 + var7.field767 * var8.field775;
        class37.field503 = var7.field790 * var8.field795 + var7.field772 * var8.field775 + var7.field771 * var8.field790;
        if (arg3 != -24946) {
            return true;
        }
        class354.field4727 = var7.field795 * var8.field789 + var7.field789 * var8.field767 + var7.field783 * var8.field772;
        class293.field3901 = var7.field775 * var8.field783 + var7.field770 * var8.field771 + var7.field767 * var8.field770;
        class547.field7484 = var7.field790 * var8.field789 + var7.field772 * var8.field767 + var7.field771 * var8.field772;
        class308.field4137 = var7.field795 * var8.field795 + var7.field789 * var8.field775 + var7.field783 * var8.field790;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field1363.field6451;
        int var18 = this.field1363.field6500;
        if (!this.field1335) {
            this.method622(-27300);
        }
        class248.field3217[0] = this.field1354;
        class220.field2870[0] = this.field1314;
        class339.field4568[0] = this.field1309;
        class248.field3217[1] = this.field1375;
        class220.field2870[1] = this.field1314;
        class339.field4568[1] = this.field1309;
        class248.field3217[2] = this.field1354;
        class220.field2870[2] = this.field1344;
        class248.field3217[3] = this.field1375;
        class339.field4568[2] = this.field1309;
        class220.field2870[3] = this.field1344;
        class248.field3217[4] = this.field1354;
        class339.field4568[3] = this.field1309;
        class220.field2870[4] = this.field1314;
        class339.field4568[4] = this.field1353;
        class248.field3217[5] = this.field1375;
        class220.field2870[5] = this.field1314;
        class339.field4568[5] = this.field1353;
        class248.field3217[6] = this.field1354;
        class220.field2870[6] = this.field1344;
        class248.field3217[7] = this.field1375;
        class339.field4568[6] = this.field1353;
        class220.field2870[7] = this.field1344;
        class339.field4568[7] = this.field1353;
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class220.field2870[var19];
            float var41 = (float) class339.field4568[var19];
            float var42 = (float) class248.field3217[var19];
            float var43 = class648.field8952 * var41 + class34.field487 * var42 + class293.field3901 * var40 + var9;
            float var44 = class354.field4727 * var41 + class547.field7484 * var42 + class118.field1508 * var40 + var10;
            float var45 = class308.field4137 * var41 + class602.field8407 * var40 + class37.field503 * var42 + var11;
            if (var45 >= (float) this.field1363.field6440) {
                if (arg4 > 0) {
                    var45 = arg4;
                }
                float var46 = (float) var17 * var43 / var45 + (float) this.field1363.field6495;
                float var47 = (float) var18 * var44 / var45 + (float) this.field1363.field6508;
                if (var14 < var46) {
                    var14 = var46;
                }
                if (var13 > var46) {
                    var13 = var46;
                }
                var12 = true;
                if (var47 > var16) {
                    var16 = var47;
                }
                if (var15 > var47) {
                    var15 = var47;
                }
            }
        }
        if (var12 && (float) arg1 > var13 && var14 > (float) arg1 && var15 < (float) arg2 && (float) arg2 < var16) {
            if (arg0) {
                return true;
            }
            if (this.field1363.field6543.length < this.field1402) {
                this.field1363.field6545 = new int[this.field1402];
                this.field1363.field6543 = new int[this.field1402];
            }
            int[] var20 = this.field1363.field6543;
            int[] var21 = this.field1363.field6545;
            for (int var22 = 0; var22 < this.field1352; var22++) {
                float var24 = (float) this.field1362[var22];
                float var25 = (float) this.field1313[var22];
                float var26 = (float) this.field1370[var22];
                float var27 = class354.field4727 * var25 + class547.field7484 * var24 + class118.field1508 * var26 + var10;
                float var28 = class308.field4137 * var25 + class602.field8407 * var26 + class37.field503 * var24 + var11;
                float var29 = class648.field8952 * var25 + class34.field487 * var24 + class293.field3901 * var26 + var9;
                if (var28 >= (float) this.field1363.field6440) {
                    if (arg4 > 0) {
                        var28 = arg4;
                    }
                    int var30 = (int) ((float) var17 * var29 / var28 + (float) this.field1363.field6495);
                    int var31 = (int) ((float) var18 * var27 / var28 + (float) this.field1363.field6508);
                    int var32 = this.field1388[var22];
                    int var33 = this.field1388[var22 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field1349[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        var20[var35] = var30;
                        var21[var35] = var31;
                    }
                } else {
                    int var36 = this.field1388[var22];
                    int var37 = this.field1388[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field1349[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[this.field1349[var38] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field1421; var23++) {
                if (var20[this.field1408[var23]] != -999999 && var20[this.field1329[var23]] != -999999 && var20[this.field1351[var23]] != -999999 && this.method658(arg1, (byte) -125, var20[this.field1351[var23]], var20[this.field1329[var23]], var21[this.field1408[var23]], var21[this.field1329[var23]], var21[this.field1351[var23]], arg2, var20[this.field1408[var23]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vp", name = "za", descriptor = "()I", line = 5643)
    public final int method660() {
        field1312++;
        if (!this.field1335) {
            this.method622(-27300);
        }
        return this.field1353;
    }
}

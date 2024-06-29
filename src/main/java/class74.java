import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class74 extends class469 {

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    private int field1307 = 0;

    @OriginalMember(owner = "client!gea", name = "X", descriptor = "Z")
    private boolean field1331 = false;

    @OriginalMember(owner = "client!gea", name = "qb", descriptor = "I")
    private int field1350 = 0;

    @OriginalMember(owner = "client!gea", name = "fb", descriptor = "I")
    private int field1339 = 0;

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
    private int field1316 = 0;

    @OriginalMember(owner = "client!gea", name = "U", descriptor = "Z")
    private boolean field1328 = false;

    @OriginalMember(owner = "client!gea", name = "Ob", descriptor = "I")
    private int field1374 = 0;

    @OriginalMember(owner = "client!gea", name = "Tb", descriptor = "Z")
    private boolean field1379 = true;

    @OriginalMember(owner = "client!gea", name = "oc", descriptor = "Z")
    private boolean field1400 = false;

    @OriginalMember(owner = "client!gea", name = "db", descriptor = "Loea;")
    private class594 field1337;

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "Ldda;")
    private class379 field1313;

    @OriginalMember(owner = "client!gea", name = "lc", descriptor = "Ldda;")
    private class379 field1397;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "Ldda;")
    private class379 field1317;

    @OriginalMember(owner = "client!gea", name = "bb", descriptor = "Ldda;")
    private class379 field1335;

    @OriginalMember(owner = "client!gea", name = "L", descriptor = "Lie;")
    private class6 field1319;

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client!gea", name = "Sb", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client!gea", name = "Kb", descriptor = "[I")
    private int[] field1370;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "[I")
    private int[] field1306;

    @OriginalMember(owner = "client!gea", name = "Ub", descriptor = "[I")
    private int[] field1380;

    @OriginalMember(owner = "client!gea", name = "Pb", descriptor = "[S")
    private short[] field1375;

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "[I")
    private int[] field1291;

    @OriginalMember(owner = "client!gea", name = "rc", descriptor = "[Lgi;")
    private class675[] field1403;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "[Luga;")
    private class206[] field1305;

    @OriginalMember(owner = "client!gea", name = "yb", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client!gea", name = "ec", descriptor = "[Lpe;")
    private class606[] field1390;

    @OriginalMember(owner = "client!gea", name = "ub", descriptor = "[Ljv;")
    private class79[] field1354;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "[S")
    private short[] field1294;

    @OriginalMember(owner = "client!gea", name = "ob", descriptor = "[S")
    private short[] field1348;

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "[F")
    private float[] field1310;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "[S")
    private short[] field1299;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "[S")
    private short[] field1297;

    @OriginalMember(owner = "client!gea", name = "Hb", descriptor = "[S")
    private short[] field1367;

    @OriginalMember(owner = "client!gea", name = "Y", descriptor = "S")
    private short field1332;

    @OriginalMember(owner = "client!gea", name = "wc", descriptor = "S")
    private short field1408;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "[S")
    private short[] field1318;

    @OriginalMember(owner = "client!gea", name = "Zb", descriptor = "[B")
    private byte[] field1385;

    @OriginalMember(owner = "client!gea", name = "vc", descriptor = "[S")
    private short[] field1407;

    @OriginalMember(owner = "client!gea", name = "vb", descriptor = "[F")
    private float[] field1355;

    @OriginalMember(owner = "client!gea", name = "uc", descriptor = "[S")
    private short[] field1406;

    @OriginalMember(owner = "client!gea", name = "eb", descriptor = "[B")
    private byte[] field1338;

    @OriginalMember(owner = "client!gea", name = "Mb", descriptor = "[S")
    private short[] field1372;

    @OriginalMember(owner = "client!gea", name = "ic", descriptor = "[S")
    private short[] field1394;

    @OriginalMember(owner = "client!gea", name = "Ab", descriptor = "[I")
    private int[] field1360;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "[[I")
    private int[][] field1311;

    @OriginalMember(owner = "client!gea", name = "B", descriptor = "[[I")
    private int[][] field1309;

    @OriginalMember(owner = "client!gea", name = "sb", descriptor = "[[I")
    private int[][] field1352;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "B")
    private byte field1301;

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!gea", name = "M", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!gea", name = "O", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!gea", name = "P", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!gea", name = "Q", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!gea", name = "S", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!gea", name = "T", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gea", name = "V", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!gea", name = "W", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!gea", name = "Z", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!gea", name = "cb", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!gea", name = "hb", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!gea", name = "ib", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!gea", name = "kb", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!gea", name = "lb", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!gea", name = "mb", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!gea", name = "nb", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!gea", name = "pb", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gea", name = "rb", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gea", name = "tb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gea", name = "wb", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!gea", name = "xb", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!gea", name = "zb", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!gea", name = "Bb", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!gea", name = "Cb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!gea", name = "Db", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!gea", name = "Eb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!gea", name = "Fb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!gea", name = "Ib", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!gea", name = "Jb", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!gea", name = "Lb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!gea", name = "Nb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!gea", name = "Qb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!gea", name = "Rb", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!gea", name = "Wb", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!gea", name = "Xb", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!gea", name = "Yb", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!gea", name = "ac", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!gea", name = "bc", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!gea", name = "cc", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!gea", name = "dc", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!gea", name = "fc", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!gea", name = "gc", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!gea", name = "hc", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!gea", name = "jc", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!gea", name = "kc", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!gea", name = "mc", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!gea", name = "qc", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!gea", name = "tc", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!gea", name = "xc", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!gea", name = "Vb", descriptor = "Leh;")
    private class360 field1381;

    @OriginalMember(owner = "client!gea", name = "Gb", descriptor = "Ltda;")
    private class635 field1366;

    @OriginalMember(owner = "client!gea", name = "sc", descriptor = "Lff;")
    private class9 field1404;

    @OriginalMember(owner = "client!gea", name = "A", descriptor = "S")
    private short field1308;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "S")
    private short field1312;

    @OriginalMember(owner = "client!gea", name = "R", descriptor = "S")
    private short field1325;

    @OriginalMember(owner = "client!gea", name = "ab", descriptor = "S")
    private short field1334;

    @OriginalMember(owner = "client!gea", name = "gb", descriptor = "S")
    private short field1340;

    @OriginalMember(owner = "client!gea", name = "jb", descriptor = "S")
    private short field1343;

    @OriginalMember(owner = "client!gea", name = "nc", descriptor = "S")
    private short field1399;

    @OriginalMember(owner = "client!gea", name = "pc", descriptor = "S")
    private short field1401;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I[IIIIIZ)V", line = 3)
    public final void method311(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1359++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            class515.field7331 = 0;
            int var12 = 0;
            class735.field10352 = 0;
            class399.field5584 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1311.length) {
                    int[] var15 = this.field1311[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class515.field7331 += this.field1380[var17];
                        class735.field10352 += this.field1306[var17];
                        class399.field5584 += this.field1291[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class399.field5584 = var9;
                class735.field10352 = var11;
                class515.field7331 = var10;
            } else {
                class735.field10352 = class735.field10352 / var12 + var11;
                class399.field5584 = class399.field5584 / var12 + var9;
                class515.field7331 = class515.field7331 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1311.length > var22) {
                    int[] var23 = this.field1311[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1380[var25] += var18;
                        this.field1306[var25] += var20;
                        this.field1291[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field1311.length) {
                    int[] var46 = this.field1311[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1380[var48] -= class515.field7331;
                            this.field1306[var48] -= class735.field10352;
                            this.field1291[var48] -= class399.field5584;
                            if (arg4 != 0) {
                                int var49 = class316.field4487[arg4];
                                int var50 = class316.field4490[arg4];
                                int var51 = this.field1306[var48] * var49 + (this.field1380[var48] * var50) + 16383 >> 14;
                                this.field1306[var48] = this.field1306[var48] * var50 + 16383 - (this.field1380[var48] * var49) >> 14;
                                this.field1380[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class316.field4487[arg2];
                                int var53 = class316.field4490[arg2];
                                int var54 = this.field1306[var48] * var53 + 16383 - (this.field1291[var48] * var52) >> 14;
                                this.field1291[var48] = this.field1291[var48] * var53 + (this.field1306[var48] * var52 + 16383) >> 14;
                                this.field1306[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class316.field4487[arg3];
                                int var56 = class316.field4490[arg3];
                                int var57 = this.field1291[var48] * var55 + this.field1380[var48] * var56 + 16383 >> 14;
                                this.field1291[var48] = this.field1291[var48] * var56 + 16383 - (this.field1380[var48] * var55) >> 14;
                                this.field1380[var48] = var57;
                            }
                            this.field1380[var48] += class515.field7331;
                            this.field1306[var48] += class735.field10352;
                            this.field1291[var48] += class399.field5584;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1380[var59] -= class515.field7331;
                            this.field1306[var59] -= class735.field10352;
                            this.field1291[var59] -= class399.field5584;
                            if (arg2 != 0) {
                                int var60 = class316.field4487[arg2];
                                int var61 = class316.field4490[arg2];
                                int var62 = this.field1306[var59] * var61 + 16383 - (this.field1291[var59] * var60) >> 14;
                                this.field1291[var59] = this.field1306[var59] * var60 + (this.field1291[var59] * var61) + 16383 >> 14;
                                this.field1306[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class316.field4487[arg4];
                                int var64 = class316.field4490[arg4];
                                int var65 = this.field1380[var59] * var64 + this.field1306[var59] * var63 + 16383 >> 14;
                                this.field1306[var59] = this.field1306[var59] * var64 + 16383 - (this.field1380[var59] * var63) >> 14;
                                this.field1380[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class316.field4487[arg3];
                                int var67 = class316.field4490[arg3];
                                int var68 = this.field1380[var59] * var67 + this.field1291[var59] * var66 + 16383 >> 14;
                                this.field1291[var59] = this.field1291[var59] * var67 + 16383 - (this.field1380[var59] * var66) >> 14;
                                this.field1380[var59] = var68;
                            }
                            this.field1380[var59] += class515.field7331;
                            this.field1306[var59] += class735.field10352;
                            this.field1291[var59] += class399.field5584;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field1311.length > var28) {
                        int[] var29 = this.field1311[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1370[var31];
                            int var33 = this.field1370[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1406[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class316.field4487[arg4];
                                    int var37 = class316.field4490[arg4];
                                    int var38 = this.field1407[var35] * var36 + this.field1348[var35] * var37 + 16383 >> 14;
                                    this.field1407[var35] = (short) (this.field1407[var35] * var37 + 16383 - (this.field1348[var35] * var36) >> 14);
                                    this.field1348[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class316.field4487[arg2];
                                    int var40 = class316.field4490[arg2];
                                    int var41 = this.field1407[var35] * var40 + 16383 - (this.field1294[var35] * var39) >> 14;
                                    this.field1294[var35] = (short) (this.field1407[var35] * var39 + this.field1294[var35] * var40 + 16383 >> 14);
                                    this.field1407[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class316.field4487[arg3];
                                    int var43 = class316.field4490[arg3];
                                    int var44 = this.field1348[var35] * var43 + this.field1294[var35] * var42 + 16383 >> 14;
                                    this.field1294[var35] = (short) (this.field1294[var35] * var43 + 16383 - (this.field1348[var35] * var42) >> 14);
                                    this.field1348[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1317 == null && this.field1335 != null) {
                    this.field1335.field5288 = null;
                }
                if (this.field1317 != null) {
                    this.field1317.field5288 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field1311.length > var70) {
                    int[] var71 = this.field1311[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1380[var73] -= class515.field7331;
                        this.field1306[var73] -= class735.field10352;
                        this.field1291[var73] -= class399.field5584;
                        this.field1380[var73] = this.field1380[var73] * arg2 >> 7;
                        this.field1306[var73] = this.field1306[var73] * arg3 >> 7;
                        this.field1291[var73] = this.field1291[var73] * arg4 >> 7;
                        this.field1380[var73] += class515.field7331;
                        this.field1306[var73] += class735.field10352;
                        this.field1291[var73] += class399.field5584;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1352 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field1352.length) {
                        int[] var79 = this.field1352[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1338[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1338[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1335 != null) {
                            this.field1335.field5288 = null;
                        }
                    }
                }
                if (this.field1354 != null) {
                    for (int var75 = 0; var75 < this.field1358; var75++) {
                        class79 var76 = this.field1354[var75];
                        class606 var77 = this.field1390[var75];
                        var77.field8799 = var77.field8799 & 0xFFFFFF | 255 - (this.field1338[var76.field1474] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1352 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field1352.length > var87) {
                        int[] var88 = this.field1352[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1297[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFEFA) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field1297[var90] = (short) class164.method1221(var97, class164.method1221(var95 << 7, var94 << 10));
                        }
                        if (var88.length > 0 && this.field1335 != null) {
                            this.field1335.field5288 = null;
                        }
                    }
                }
                if (this.field1354 != null) {
                    for (int var84 = 0; var84 < this.field1358; var84++) {
                        class79 var85 = this.field1354[var84];
                        class606 var86 = this.field1390[var84];
                        var86.field8799 = var86.field8799 & 0xFF000000 | class412.field5695[this.field1297[var85.field1474] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1309 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field1309.length) {
                        int[] var100 = this.field1309[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class606 var102 = this.field1390[var100[var101]];
                            var102.field8802 += arg2;
                            var102.field8806 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1309 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field1309.length > var104) {
                        int[] var105 = this.field1309[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class606 var107 = this.field1390[var105[var106]];
                            var107.field8794 = var107.field8794 * arg3 >> 7;
                            var107.field8804 = var107.field8804 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1309 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field1309.length) {
                    int[] var110 = this.field1309[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class606 var112 = this.field1390[var110[var111]];
                        var112.field8800 = var112.field8800 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "()V", line = 653)
    public final void method342() {
        field1361++;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBISI)I", line = 662)
    private final int method738(int arg0, byte arg1, int arg2, short arg3, int arg4) {
        field1384++;
        int var6 = class412.field5695[class102.method894((byte) -47, arg4, arg2)];
        if (arg3 != -1) {
            class546 var7 = this.field1337.field1084.method1154(-115, arg3 & 0xFFFF);
            int var8 = var7.field7707 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 <= 127) {
                    var9 = arg4 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field7696 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var13 << 8 & 0xFF001D) - (-(var15 >> 8) - (var14 & 0xFF00));
            }
        }
        if (arg0 != -16067) {
            this.field1355 = null;
        }
        return (var6 << 8) + 255 - (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "()[Luga;", line = 732)
    public final class206[] method336() {
        field1347++;
        return this.field1305;
    }

    @OriginalMember(owner = "client!gea", name = "HA", descriptor = "()I", line = 745)
    public final int method312() {
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        field1395++;
        return this.field1343;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V", line = 764)
    private final void method739(boolean arg0) {
        field1295++;
        if (this.field1316 == 0) {
            return;
        }
        if (this.field1301 != 0) {
            this.method747(true, true);
        }
        this.method747(false, arg0);
        if (this.field1319 != null) {
            if (this.field1319.field106 == null) {
                this.method744((this.field1301 & 0x10) != 0, !arg0);
            }
            if (this.field1319.field106 != null) {
                this.field1337.method3463(this.field1317 != null, (byte) 3);
                this.field1337.method3409(this.field1313, this.field1317, this.field1335, this.field1397, (byte) 124);
                int var2 = this.field1360.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1360[var3];
                    int var5 = this.field1360[var3 + 1];
                    int var6 = this.field1299[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1337.method3451(var6, this.field1317 != null, -29464);
                    this.field1337.method3420((byte) -106, (var5 - var4) * 3, this.field1319.field106, var4 * 3, 4);
                }
            }
        }
        this.method743(45);
    }

    @OriginalMember(owner = "client!gea", name = "EA", descriptor = "()I", line = 818)
    public final int method353() {
        field1391++;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        return this.field1308;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILkd;ZII)Z", line = 830)
    public final boolean method318(int arg0, int arg1, class280 arg2, boolean arg3, int arg4, int arg5) {
        field1362++;
        return this.method749(arg4, arg0, arg1, arg5, (byte) 87, arg3, arg2);
    }

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "()Z", line = 839)
    public final boolean method332() {
        field1409++;
        return this.field1331;
    }

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "(III)V", line = 847)
    public final void method349(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1350; var4++) {
            if (arg0 != 0) {
                this.field1380[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1306[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1291[var4] += arg2;
            }
        }
        field1321++;
        this.field1328 = false;
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "()V", line = 880)
    public final void method313() {
        field1336++;
    }

    @OriginalMember(owner = "client!gea", name = "LA", descriptor = "(I)V", line = 890)
    public final void method337(int arg0) {
        if (this.field1335 != null) {
            this.field1335.field5288 = null;
        }
        field1344++;
        this.field1332 = (short) arg0;
        if (this.field1317 != null) {
            this.field1317.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZZLgea;ILgea;)Lka;", line = 908)
    private final class469 method740(boolean arg0, boolean arg1, boolean arg2, class74 arg3, int arg4, class74 arg5) {
        arg5.field1408 = this.field1408;
        arg5.field1301 = 0;
        arg5.field1316 = this.field1316;
        arg5.field1339 = this.field1339;
        arg5.field1332 = this.field1332;
        arg5.field1378 = this.field1378;
        arg5.field1350 = this.field1350;
        arg5.field1374 = this.field1374;
        arg5.field1358 = this.field1358;
        arg5.field1307 = this.field1307;
        if ((arg4 & 0x100) == 0) {
            arg5.field1331 = this.field1331;
        } else {
            arg5.field1331 = true;
        }
        arg5.field1400 = this.field1400;
        field1356++;
        arg5.field1314 = arg4;
        boolean var7 = class494.method2973(92, this.field1378, arg4);
        boolean var8 = class206.method1433(arg4, (byte) -125, this.field1378);
        boolean var9 = class32.method208(arg4, this.field1378, (byte) -19);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg5.field1380 = this.field1380;
            } else if (arg3.field1380 == null || arg3.field1380.length < this.field1307) {
                arg5.field1380 = arg3.field1380 = new int[this.field1307];
            } else {
                arg5.field1380 = arg3.field1380;
            }
            if (!var8) {
                arg5.field1306 = this.field1306;
            } else if (arg3.field1306 == null || arg3.field1306.length < this.field1307) {
                arg5.field1306 = arg3.field1306 = new int[this.field1307];
            } else {
                arg5.field1306 = arg3.field1306;
            }
            if (!var9) {
                arg5.field1291 = this.field1291;
            } else if (arg3.field1291 == null || arg3.field1291.length < this.field1307) {
                arg5.field1291 = arg3.field1291 = new int[this.field1307];
            } else {
                arg5.field1291 = arg3.field1291;
            }
            for (int var11 = 0; var11 < this.field1307; var11++) {
                if (var7) {
                    arg5.field1380[var11] = this.field1380[var11];
                }
                if (var8) {
                    arg5.field1306[var11] = this.field1306[var11];
                }
                if (var9) {
                    arg5.field1291[var11] = this.field1291[var11];
                }
            }
        } else {
            arg5.field1306 = this.field1306;
            arg5.field1291 = this.field1291;
            arg5.field1380 = this.field1380;
        }
        if (class260.method1772(114, this.field1378, arg4)) {
            arg5.field1313 = arg3.field1313;
            if (arg2) {
                arg5.field1301 = (byte) (arg5.field1301 | 0x1);
            }
            arg5.field1313.field5288 = this.field1313.field5288;
            arg5.field1313.field5286 = this.field1313.field5286;
        } else if (class264.method1779(arg4, this.field1378, false)) {
            arg5.field1313 = this.field1313;
        } else {
            arg5.field1313 = null;
        }
        if (class115.method946(arg4, this.field1378, 101)) {
            if (arg3.field1297 == null || this.field1339 > arg3.field1297.length) {
                arg5.field1297 = arg3.field1297 = new short[this.field1339];
            } else {
                arg5.field1297 = arg3.field1297;
            }
            for (int var12 = 0; var12 < this.field1339; var12++) {
                arg5.field1297[var12] = this.field1297[var12];
            }
        } else {
            arg5.field1297 = this.field1297;
        }
        if (class609.method3516(arg4, this.field1378, (byte) 70)) {
            if (arg3.field1338 == null || this.field1339 > arg3.field1338.length) {
                arg5.field1338 = arg3.field1338 = new byte[this.field1339];
            } else {
                arg5.field1338 = arg3.field1338;
            }
            for (int var13 = 0; var13 < this.field1339; var13++) {
                arg5.field1338[var13] = this.field1338[var13];
            }
        } else {
            arg5.field1338 = this.field1338;
        }
        if (class554.method3244(-1, this.field1378, arg4)) {
            if (arg2) {
                arg5.field1301 = (byte) (arg5.field1301 | 0x2);
            }
            arg5.field1335 = arg3.field1335;
            arg5.field1335.field5286 = this.field1335.field5286;
            arg5.field1335.field5288 = this.field1335.field5288;
        } else if (class731.method4073(2048, arg4, this.field1378)) {
            arg5.field1335 = this.field1335;
        } else {
            arg5.field1335 = null;
        }
        if (class618.method3580(544, this.field1378, arg4)) {
            if (arg3.field1348 == null || arg3.field1348.length < this.field1374) {
                int var14 = this.field1374;
                arg5.field1407 = arg3.field1407 = new short[var14];
                arg5.field1348 = arg3.field1348 = new short[var14];
                arg5.field1294 = arg3.field1294 = new short[var14];
            } else {
                arg5.field1407 = arg3.field1407;
                arg5.field1348 = arg3.field1348;
                arg5.field1294 = arg3.field1294;
            }
            if (this.field1381 == null) {
                for (int var15 = 0; var15 < this.field1374; var15++) {
                    arg5.field1348[var15] = this.field1348[var15];
                    arg5.field1407[var15] = this.field1407[var15];
                    arg5.field1294[var15] = this.field1294[var15];
                }
            } else {
                if (arg3.field1381 == null) {
                    arg3.field1381 = new class360();
                }
                class360 var16 = arg5.field1381 = arg3.field1381;
                if (var16.field5057 == null || var16.field5057.length < this.field1374) {
                    int var17 = this.field1374;
                    var16.field5057 = new short[var17];
                    var16.field5053 = new short[var17];
                    var16.field5049 = new byte[var17];
                    var16.field5054 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field1374; var18++) {
                    arg5.field1348[var18] = this.field1348[var18];
                    arg5.field1407[var18] = this.field1407[var18];
                    arg5.field1294[var18] = this.field1294[var18];
                    var16.field5057[var18] = this.field1381.field5057[var18];
                    var16.field5054[var18] = this.field1381.field5054[var18];
                    var16.field5053[var18] = this.field1381.field5053[var18];
                    var16.field5049[var18] = this.field1381.field5049[var18];
                }
            }
            arg5.field1385 = this.field1385;
        } else {
            arg5.field1385 = this.field1385;
            arg5.field1294 = this.field1294;
            arg5.field1348 = this.field1348;
            arg5.field1381 = this.field1381;
            arg5.field1407 = this.field1407;
        }
        if (class452.method2694(arg4, this.field1378, !arg0)) {
            arg5.field1317 = arg3.field1317;
            if (arg2) {
                arg5.field1301 = (byte) (arg5.field1301 | 0x4);
            }
            arg5.field1317.field5286 = this.field1317.field5286;
            arg5.field1317.field5288 = this.field1317.field5288;
        } else if (class436.method2628(119, this.field1378, arg4)) {
            arg5.field1317 = this.field1317;
        } else {
            arg5.field1317 = null;
        }
        if (class500.method3004(105, arg4, this.field1378)) {
            if (arg3.field1355 == null || arg3.field1355.length < this.field1339) {
                int var19 = this.field1374;
                arg5.field1310 = arg3.field1310 = new float[var19];
                arg5.field1355 = arg3.field1355 = new float[var19];
            } else {
                arg5.field1310 = arg3.field1310;
                arg5.field1355 = arg3.field1355;
            }
            for (int var20 = 0; var20 < this.field1374; var20++) {
                arg5.field1355[var20] = this.field1355[var20];
                arg5.field1310[var20] = this.field1310[var20];
            }
        } else {
            arg5.field1355 = this.field1355;
            arg5.field1310 = this.field1310;
        }
        if (class725.method4034(arg4, this.field1378, arg0)) {
            if (arg2) {
                arg5.field1301 = (byte) (arg5.field1301 | 0x8);
            }
            arg5.field1397 = arg3.field1397;
            arg5.field1397.field5288 = this.field1397.field5288;
            arg5.field1397.field5286 = this.field1397.field5286;
        } else if (class264.method1782(99, this.field1378, arg4)) {
            arg5.field1397 = this.field1397;
        } else {
            arg5.field1397 = null;
        }
        if (class348.method2186(arg4, (byte) -125, this.field1378)) {
            if (arg3.field1394 == null || this.field1339 > arg3.field1394.length) {
                int var21 = this.field1339;
                arg5.field1394 = arg3.field1394 = new short[var21];
                arg5.field1372 = arg3.field1372 = new short[var21];
                arg5.field1318 = arg3.field1318 = new short[var21];
            } else {
                arg5.field1372 = arg3.field1372;
                arg5.field1394 = arg3.field1394;
                arg5.field1318 = arg3.field1318;
            }
            for (int var22 = 0; var22 < this.field1339; var22++) {
                arg5.field1394[var22] = this.field1394[var22];
                arg5.field1318[var22] = this.field1318[var22];
                arg5.field1372[var22] = this.field1372[var22];
            }
        } else {
            arg5.field1394 = this.field1394;
            arg5.field1372 = this.field1372;
            arg5.field1318 = this.field1318;
        }
        if (class199.method1392((byte) -58, arg4, this.field1378)) {
            arg5.field1319 = arg3.field1319;
            if (arg2) {
                arg5.field1301 = (byte) (arg5.field1301 | 0x10);
            }
            arg5.field1319.field106 = this.field1319.field106;
        } else if (class709.method3964(arg4, this.field1378, 108)) {
            arg5.field1319 = this.field1319;
        } else {
            arg5.field1319 = null;
        }
        if (class313.method2024(arg4, 2, this.field1378)) {
            if (arg3.field1299 == null || arg3.field1299.length < this.field1339) {
                int var23 = this.field1339;
                arg5.field1299 = arg3.field1299 = new short[var23];
            } else {
                arg5.field1299 = arg3.field1299;
            }
            for (int var24 = 0; var24 < this.field1339; var24++) {
                arg5.field1299[var24] = this.field1299[var24];
            }
        } else {
            arg5.field1299 = this.field1299;
        }
        if (!class571.method3331(arg4, this.field1378, arg0)) {
            arg5.field1390 = this.field1390;
        } else if (arg3.field1390 == null || this.field1358 > arg3.field1390.length) {
            int var26 = this.field1358;
            arg5.field1390 = arg3.field1390 = new class606[var26];
            for (int var27 = 0; var27 < this.field1358; var27++) {
                arg5.field1390[var27] = this.field1390[var27].method3506((byte) 95);
            }
        } else {
            arg5.field1390 = arg3.field1390;
            for (int var25 = 0; var25 < this.field1358; var25++) {
                arg5.field1390[var25].method3508(128, this.field1390[var25]);
            }
        }
        arg5.field1375 = this.field1375;
        arg5.field1354 = this.field1354;
        arg5.field1305 = this.field1305;
        arg5.field1311 = this.field1311;
        arg5.field1406 = this.field1406;
        arg5.field1309 = this.field1309;
        arg5.field1367 = this.field1367;
        arg5.field1360 = this.field1360;
        arg5.field1352 = this.field1352;
        arg5.field1403 = this.field1403;
        arg5.field1370 = this.field1370;
        if (this.field1328) {
            arg5.field1312 = this.field1312;
            arg5.field1308 = this.field1308;
            arg5.field1328 = true;
            arg5.field1399 = this.field1399;
            arg5.field1340 = this.field1340;
            arg5.field1343 = this.field1343;
            arg5.field1325 = this.field1325;
            arg5.field1334 = this.field1334;
            arg5.field1401 = this.field1401;
        } else {
            arg5.field1328 = false;
        }
        return arg5;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V", line = 1373)
    private final void method741(byte arg0) {
        int var2 = 101 % ((-arg0 - 69) / 42);
        if (this.field1354 != null) {
            class724 var3 = this.field1337.field8542;
            this.field1337.method3444(-25826);
            this.field1337.method539(!this.field1331);
            this.field1337.method3463(false, (byte) 3);
            this.field1337.method3409(this.field1337.field8616, null, null, this.field1337.field8598, (byte) 122);
            for (int var4 = 0; var4 < this.field1358; var4++) {
                class79 var5 = this.field1354[var4];
                class606 var6 = this.field1390[var4];
                if (!var5.field1483 || !this.field1337.method562()) {
                    float var7 = (float) (this.field1380[var5.field1488] + this.field1380[var5.field1479] + this.field1380[var5.field1486]) * 0.3333333F;
                    float var8 = (float) (this.field1306[var5.field1479] + this.field1306[var5.field1486] + this.field1306[var5.field1488]) * 0.3333333F;
                    float var9 = (float) (this.field1291[var5.field1479] - (-this.field1291[var5.field1488] - this.field1291[var5.field1486])) * 0.3333333F;
                    float var10 = class399.field5580 * var9 + class656.field9233 * var7 + class265.field3859 * var8 + class587.field8267;
                    float var11 = class439.field6127 * var9 + class314.field4435 * var7 + class250.field3524 * var8 + class78.field1466;
                    float var12 = class228.field3258 * var9 + class253.field3632 * var7 + class223.field3185 * var8 + class313.field4424;
                    float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var10 * var10 + var11 * var11))) * (float) var5.field1489;
                    var3.method4030((float) var6.field8802 + var10 - (var10 * var13), var5.field1487 * var6.field8794 >> 7, var5.field1484 * var6.field8804 >> 7, 16383, var12 * var13 - var12, var6.field8800, var11 * var13 + (float) var6.field8806 - var11);
                    this.field1337.method3411(var3, (byte) -80);
                    int var14 = var6.field8799;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field1337.method3486((byte) -31, var5.field1481);
                    this.field1337.method3454(var5.field1482, 101);
                    this.field1337.method3470(7, 8, 4, 0);
                }
            }
            this.field1337.method539(true);
            this.field1337.method3407((byte) 113);
        }
        field1293++;
    }

    @OriginalMember(owner = "client!gea", name = "ia", descriptor = "(SS)V", line = 1432)
    public final void method359(short arg0, short arg1) {
        field1320++;
        for (int var3 = 0; var3 < this.field1339; var3++) {
            if (this.field1297[var3] == arg0) {
                this.field1297[var3] = arg1;
            }
        }
        if (this.field1354 != null) {
            for (int var4 = 0; var4 < this.field1358; var4++) {
                class79 var5 = this.field1354[var4];
                class606 var6 = this.field1390[var4];
                var6.field8799 = var6.field8799 & 0xFF000000 | class412.field5695[this.field1297[var5.field1474] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1335 != null) {
            this.field1335.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lkd;IZ)V", line = 1476)
    public final void method322(class280 arg0, int arg1, boolean arg2) {
        field1369++;
        if (this.field1375 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field1350; var5++) {
            if ((this.field1375[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method151(this.field1380[var5], this.field1306[var5], this.field1291[var5], var4);
                } else {
                    arg0.method155(this.field1380[var5], this.field1306[var5], this.field1291[var5], var4);
                }
                this.field1380[var5] = var4[0];
                this.field1306[var5] = var4[1];
                this.field1291[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "FA", descriptor = "(I)V", line = 1510)
    public final void method344(int arg0) {
        field1405++;
        int var2 = class316.field4487[arg0];
        int var3 = class316.field4490[arg0];
        for (int var4 = 0; var4 < this.field1350; var4++) {
            int var5 = this.field1306[var4] * var3 - (this.field1291[var4] * var2) >> 14;
            this.field1291[var4] = this.field1306[var4] * var2 + (this.field1291[var4] * var3) >> 14;
            this.field1306[var4] = var5;
        }
        this.field1328 = false;
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lkd;Lig;II)V", line = 1540)
    public final void method343(class280 arg0, class243 arg1, int arg2, int arg3) {
        field1315++;
        if (this.field1374 == 0) {
            return;
        }
        class724 var5 = this.field1337.field8576;
        class724 var6 = (class724) arg0;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        class223.field3185 = var5.field10107 * var6.field10120 + var5.field10120 * var6.field10119 + var5.field10114 * var6.field10125;
        class313.field4424 = var5.field10107 * var6.field10135 + var5.field10120 * var6.field10128 + var5.field10114 * var6.field10133 + var5.field10135;
        float var7 = (float) this.field1312 * class223.field3185 + class313.field4424;
        float var8 = (float) this.field1308 * class223.field3185 + class313.field4424;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field1399 + var7;
            var10 = (float) (-this.field1399) + var8;
        } else {
            var9 = (float) this.field1399 + var8;
            var10 = var7 - (float) this.field1399;
        }
        if ((this.field1337.field8623 <= var10) || ((float) this.field1337.field8653 >= var9)) {
            return;
        }
        class587.field8267 = var5.field10126 * var6.field10135 + var5.field10125 * var6.field10128 + var5.field10116 * var6.field10133 + var5.field10133;
        class265.field3859 = var5.field10126 * var6.field10120 + var5.field10125 * var6.field10119 + var5.field10116 * var6.field10125;
        float var11 = (float) this.field1312 * class265.field3859 + class587.field8267;
        float var12 = (float) this.field1308 * class265.field3859 + class587.field8267;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) this.field1399 + var11) * (float) this.field1337.field8679;
            var14 = ((float) (-this.field1399) + var12) * (float) this.field1337.field8679;
        } else {
            var13 = ((float) this.field1399 + var12) * (float) this.field1337.field8679;
            var14 = (var11 - (float) this.field1399) * (float) this.field1337.field8679;
        }
        if ((var14 / (float) arg2 >= this.field1337.field8620) || (var13 / (float) arg2 <= this.field1337.field8666)) {
            return;
        }
        class78.field1466 = var5.field10137 * var6.field10135 + var5.field10131 * var6.field10133 + var5.field10119 * var6.field10128 + var5.field10128;
        class250.field3524 = var5.field10137 * var6.field10120 + var5.field10131 * var6.field10125 + var5.field10119 * var6.field10119;
        float var15 = (float) this.field1312 * class250.field3524 + class78.field1466;
        float var16 = (float) this.field1308 * class250.field3524 + class78.field1466;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field1399 + var15) * (float) this.field1337.field8605;
            var18 = (var16 - (float) this.field1399) * (float) this.field1337.field8605;
        } else {
            var18 = ((float) (-this.field1399) + var15) * (float) this.field1337.field8605;
            var17 = ((float) this.field1399 + var16) * (float) this.field1337.field8605;
        }
        if ((this.field1337.field8618 <= var18 / (float) arg2) || (this.field1337.field8597 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field1354 != null) {
            class656.field9233 = var5.field10126 * var6.field10114 + var5.field10125 * var6.field10131 + var5.field10116 * var6.field10116;
            class228.field3258 = var5.field10107 * var6.field10107 + var5.field10120 * var6.field10137 + var5.field10114 * var6.field10126;
            class314.field4435 = var5.field10137 * var6.field10114 + var5.field10131 * var6.field10116 + var5.field10119 * var6.field10131;
            class253.field3632 = var5.field10107 * var6.field10114 + var5.field10120 * var6.field10131 + var5.field10114 * var6.field10116;
            class399.field5580 = var5.field10126 * var6.field10107 + var5.field10125 * var6.field10137 + var5.field10116 * var6.field10126;
            class439.field6127 = var5.field10137 * var6.field10107 + var5.field10131 * var6.field10126 + var5.field10119 * var6.field10137;
        }
        if (arg1 != null) {
            int var19 = this.field1401 + this.field1325 >> 1;
            int var20 = this.field1343 + this.field1340 >> 1;
            int var21 = (int) ((float) var20 * class399.field5580 + (float) this.field1312 * class265.field3859 + (float) var19 * class656.field9233 + class587.field8267);
            int var22 = (int) ((float) var20 * class439.field6127 + (float) this.field1312 * class250.field3524 + (float) var19 * class314.field4435 + class78.field1466);
            int var23 = (int) ((float) var20 * class228.field3258 + (float) this.field1312 * class223.field3185 + (float) var19 * class253.field3632 + class313.field4424);
            int var24 = (int) ((float) var20 * class399.field5580 + (float) this.field1308 * class265.field3859 + (float) var19 * class656.field9233 + class587.field8267);
            int var25 = (int) ((float) var20 * class439.field6127 + (float) this.field1308 * class250.field3524 + (float) var19 * class314.field4435 + class78.field1466);
            int var26 = (int) ((float) var20 * class228.field3258 + (float) this.field1308 * class223.field3185 + (float) var19 * class253.field3632 + class313.field4424);
            arg1.field3399 = this.field1337.field8583 + (this.field1337.field8605 * var25 / arg2);
            arg1.field3400 = this.field1337.field8678 + (this.field1337.field8679 * var21 / arg2);
            arg1.field3398 = this.field1337.field8605 * var22 / arg2 + this.field1337.field8583;
            arg1.field3401 = this.field1337.field8678 + (this.field1337.field8679 * var24 / arg2);
            if (var23 >= this.field1337.field8653 || var26 >= this.field1337.field8653) {
                arg1.field3402 = this.field1337.field8678 + ((this.field1399 + var21) * this.field1337.field8679 / arg2) - arg1.field3400;
                arg1.field3397 = true;
            }
        }
        this.field1337.method3424((float) arg2, 3);
        this.field1337.method3427((byte) 19);
        this.field1337.method3445(var6, 3553);
        this.method739(true);
        this.field1337.method3407((byte) 67);
        this.method741((byte) -117);
    }

    @OriginalMember(owner = "client!gea", name = "P", descriptor = "(IIII)V", line = 1689)
    public final void method331(int arg0, int arg1, int arg2, int arg3) {
        field1292++;
        if (arg0 == 0) {
            class735.field10352 = 0;
            class515.field7331 = 0;
            int var5 = 0;
            class399.field5584 = 0;
            for (int var6 = 0; var6 < this.field1350; var6++) {
                class515.field7331 += this.field1380[var6];
                class735.field10352 += this.field1306[var6];
                class399.field5584 += this.field1291[var6];
                var5++;
            }
            if (var5 <= 0) {
                class515.field7331 = arg1;
                class399.field5584 = arg3;
                class735.field10352 = arg2;
            } else {
                class399.field5584 = class399.field5584 / var5 + arg3;
                class515.field7331 = class515.field7331 / var5 + arg1;
                class735.field10352 = class735.field10352 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1350; var7++) {
                this.field1380[var7] += arg1;
                this.field1306[var7] += arg2;
                this.field1291[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1350; var8++) {
                this.field1380[var8] -= class515.field7331;
                this.field1306[var8] -= class735.field10352;
                this.field1291[var8] -= class399.field5584;
                if (arg3 != 0) {
                    int var9 = class316.field4487[arg3];
                    int var10 = class316.field4490[arg3];
                    int var11 = this.field1380[var8] * var10 + this.field1306[var8] * var9 + 16383 >> 14;
                    this.field1306[var8] = this.field1306[var8] * var10 + 16383 - (this.field1380[var8] * var9) >> 14;
                    this.field1380[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class316.field4487[arg1];
                    int var13 = class316.field4490[arg1];
                    int var14 = this.field1306[var8] * var13 + 16383 - (this.field1291[var8] * var12) >> 14;
                    this.field1291[var8] = this.field1306[var8] * var12 + this.field1291[var8] * var13 + 16383 >> 14;
                    this.field1306[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class316.field4487[arg2];
                    int var16 = class316.field4490[arg2];
                    int var17 = this.field1291[var8] * var15 + (this.field1380[var8] * var16) + 16383 >> 14;
                    this.field1291[var8] = this.field1291[var8] * var16 + 16383 - (this.field1380[var8] * var15) >> 14;
                    this.field1380[var8] = var17;
                }
                this.field1380[var8] += class515.field7331;
                this.field1306[var8] += class735.field10352;
                this.field1291[var8] += class399.field5584;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1350; var18++) {
                this.field1380[var18] -= class515.field7331;
                this.field1306[var18] -= class735.field10352;
                this.field1291[var18] -= class399.field5584;
                this.field1380[var18] = this.field1380[var18] * arg1 / 128;
                this.field1306[var18] = this.field1306[var18] * arg2 / 128;
                this.field1291[var18] = this.field1291[var18] * arg3 / 128;
                this.field1380[var18] += class515.field7331;
                this.field1306[var18] += class735.field10352;
                this.field1291[var18] += class399.field5584;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1339; var19++) {
                int var23 = (this.field1338[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1338[var19] = (byte) var23;
            }
            if (this.field1335 != null) {
                this.field1335.field5288 = null;
            }
            if (this.field1354 != null) {
                for (int var20 = 0; var20 < this.field1358; var20++) {
                    class79 var21 = this.field1354[var20];
                    class606 var22 = this.field1390[var20];
                    var22.field8799 = 255 - (this.field1338[var21.field1474] & 0xFF) << 24 | var22.field8799 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1339; var24++) {
                int var28 = this.field1297[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3BC) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var32;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field1297[var24] = (short) class164.method1221(var34, class164.method1221(var33 << 7, var31 << 10));
            }
            if (this.field1335 != null) {
                this.field1335.field5288 = null;
            }
            if (this.field1354 != null) {
                for (int var25 = 0; var25 < this.field1358; var25++) {
                    class79 var26 = this.field1354[var25];
                    class606 var27 = this.field1390[var25];
                    var27.field8799 = var27.field8799 & 0xFF000000 | class412.field5695[this.field1297[var26.field1474] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1358; var35++) {
                class606 var36 = this.field1390[var35];
                var36.field8802 += arg1;
                var36.field8806 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1358; var37++) {
                class606 var38 = this.field1390[var37];
                var38.field8804 = var38.field8804 * arg1 >> 7;
                var38.field8794 = var38.field8794 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1358; var39++) {
                class606 var40 = this.field1390[var39];
                var40.field8800 = var40.field8800 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILss;)V", line = 1994)
    private final void method742(int arg0, class429 arg1) {
        if (this.field1337.field8691.length < this.field1374) {
            this.field1337.field8695 = new int[this.field1374];
            this.field1337.field8691 = new int[this.field1374];
        }
        if (arg0 >= -38) {
            this.method748(-45, -1L, -64, -70, -0.42012778F, -95, null, 0.81586033F, -9, 73);
        }
        field1341++;
        int[] var3 = this.field1337.field8691;
        int[] var4 = this.field1337.field8695;
        for (int var5 = 0; var5 < this.field1350; var5++) {
            int var16 = (this.field1380[var5] - (this.field1306[var5] * this.field1337.field8635 >> 8) >> this.field1337.field8545) - arg1.field6004;
            int var17 = (this.field1291[var5] - (this.field1306[var5] * this.field1337.field8591 >> 8) >> this.field1337.field8545) - arg1.field5999;
            int var18 = this.field1370[var5];
            int var19 = this.field1370[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field1406[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field1316; var6++) {
            if (this.field1338 == null || this.field1338[var6] <= 128) {
                short var7 = this.field1394[var6];
                short var8 = this.field1318[var6];
                short var9 = this.field1372[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method2608(var13, var15, var12, var14, (byte) -110, var11, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "()I", line = 2080)
    public final int method362() {
        field1363++;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        return this.field1340;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V", line = 2092)
    private final void method743(int arg0) {
        field1345++;
        if (!this.field1379) {
            return;
        }
        this.field1379 = false;
        if (this.field1403 == null && this.field1305 == null && this.field1354 == null) {
            if (this.field1380 != null && !class610.method3518(this.field1314, (byte) -108, this.field1378)) {
                if (this.field1313 != null && this.field1313.field5288 == null) {
                    this.field1379 = true;
                } else {
                    if (!this.field1328) {
                        this.method750((byte) -111);
                    }
                    this.field1380 = null;
                }
            }
            if (this.field1306 != null && !class282.method1840(this.field1378, false, this.field1314)) {
                if (this.field1313 != null && this.field1313.field5288 == null) {
                    this.field1379 = true;
                } else {
                    if (!this.field1328) {
                        this.method750((byte) -111);
                    }
                    this.field1306 = null;
                }
            }
            if (this.field1291 != null && !class548.method3230(this.field1378, this.field1314, (byte) -55)) {
                if (this.field1313 != null && this.field1313.field5288 == null) {
                    this.field1379 = true;
                } else {
                    if (!this.field1328) {
                        this.method750((byte) -111);
                    }
                    this.field1291 = null;
                }
            }
        }
        if (this.field1406 != null && this.field1380 == null && this.field1306 == null && this.field1291 == null) {
            this.field1406 = null;
            this.field1370 = null;
        }
        if (this.field1385 != null && !class196.method1373(this.field1314, (byte) 74, this.field1378)) {
            if (this.field1317 == null) {
                if (this.field1335 != null && this.field1335.field5288 == null) {
                    this.field1379 = true;
                } else {
                    this.field1385 = null;
                    this.field1348 = this.field1407 = this.field1294 = null;
                }
            } else if (this.field1317.field5288 == null) {
                this.field1379 = true;
            } else {
                this.field1348 = this.field1407 = this.field1294 = null;
                this.field1385 = null;
            }
        }
        if (this.field1297 != null && !class431.method2616(this.field1378, this.field1314, true)) {
            if (this.field1335 != null && this.field1335.field5288 == null) {
                this.field1379 = true;
            } else {
                this.field1297 = null;
            }
        }
        if (this.field1338 != null && !class42.method382((byte) 114, this.field1378, this.field1314)) {
            if (this.field1335 != null && this.field1335.field5288 == null) {
                this.field1379 = true;
            } else {
                this.field1338 = null;
            }
        }
        int var2 = 50 / ((-arg0 - 54) / 35);
        if (this.field1355 != null && !class218.method1514(-12064, this.field1314, this.field1378)) {
            if (this.field1397 != null && this.field1397.field5288 == null) {
                this.field1379 = true;
            } else {
                this.field1355 = this.field1310 = null;
            }
        }
        if (this.field1299 != null && !class199.method1399(this.field1314, this.field1378, 125)) {
            if (this.field1335 != null && this.field1335.field5288 == null) {
                this.field1379 = true;
            } else {
                this.field1299 = null;
            }
        }
        if (this.field1394 != null && !class247.method1653(-1717070207, this.field1378, this.field1314)) {
            if ((this.field1319 == null || this.field1319.field106 != null) && (this.field1335 == null || this.field1335.field5288 != null)) {
                this.field1394 = this.field1318 = this.field1372 = null;
            } else {
                this.field1379 = true;
            }
        }
        if (this.field1352 != null && !class581.method3365(-13849, this.field1378, this.field1314)) {
            this.field1352 = null;
            this.field1367 = null;
        }
        if (this.field1311 != null && !class552.method3238(this.field1378, -105, this.field1314)) {
            this.field1375 = null;
            this.field1311 = null;
        }
        if (this.field1309 != null && !class203.method1416(this.field1378, 67, this.field1314)) {
            this.field1309 = null;
        }
        if (this.field1360 != null && (this.field1314 & 0x800) == 0 && (this.field1314 & 0x40000) == 0) {
            this.field1360 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "WA", descriptor = "()I", line = 2271)
    public final int method352() {
        field1342++;
        return this.field1408;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZ)V", line = 2284)
    private final void method744(boolean arg0, boolean arg1) {
        if (this.field1316 * 6 <= this.field1337.field8688.field483.length) {
            this.field1337.field8688.field469 = 0;
        } else {
            this.field1337.field8688 = new class427(this.field1316 * 6 + 600);
        }
        field1351++;
        class427 var3 = this.field1337.field8688;
        if (this.field1337.field8682) {
            for (int var4 = 0; var4 < this.field1316; var4++) {
                var3.method223(1493807496, this.field1394[var4]);
                var3.method223(1493807496, this.field1318[var4]);
                var3.method223(1493807496, this.field1372[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1316; var5++) {
                var3.method237(arg1, this.field1394[var5]);
                var3.method237(false, this.field1318[var5]);
                var3.method237(false, this.field1372[var5]);
            }
        }
        if (var3.field469 == 0 || arg1) {
            return;
        }
        if (arg0) {
            if (this.field1404 == null) {
                this.field1404 = this.field1337.method3415(var3.field469, 4, 5123, true, var3.field483);
            } else {
                this.field1404.method53(var3.field469, -6562, 5123, var3.field483);
            }
            this.field1319.field106 = this.field1404;
        } else {
            this.field1319.field106 = this.field1337.method3415(var3.field469, 4, 5123, false, var3.field483);
        }
        if (!arg0) {
            this.field1379 = true;
        }
    }

    @OriginalMember(owner = "client!gea", name = "na", descriptor = "()I", line = 2358)
    public final int method335() {
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        field1365++;
        return this.field1399;
    }

    @OriginalMember(owner = "client!gea", name = "fa", descriptor = "()I", line = 2369)
    public final int method338() {
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        field1296++;
        return this.field1312;
    }

    @OriginalMember(owner = "client!gea", name = "V", descriptor = "()I", line = 2383)
    public final int method327() {
        field1302++;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        return this.field1401;
    }

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "(I)V", line = 2398)
    public final void method347(int arg0) {
        this.field1314 = arg0;
        field1304++;
        this.field1379 = true;
        if (this.field1381 != null && (this.field1314 & 0x10000) == 0) {
            this.field1407 = this.field1381.field5054;
            this.field1385 = this.field1381.field5049;
            this.field1348 = this.field1381.field5057;
            this.field1294 = this.field1381.field5053;
            this.field1381 = null;
        }
        this.method743(39);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIIII)Z", line = 2419)
    private final boolean method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1349++;
        if (arg4 > arg5 && arg5 < arg3 && arg5 < arg6) {
            return false;
        } else if (arg5 > arg4 && arg5 > arg3 && arg5 > arg6) {
            return false;
        } else if (arg0 < arg1 && arg2 > arg0 && arg7 > arg0) {
            return false;
        } else {
            if (arg8 != -18437) {
                this.method350();
            }
            return arg1 >= arg0 || arg0 <= arg2 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "()Z", line = 2444)
    public final boolean method328() {
        field1393++;
        return this.field1400;
    }

    @OriginalMember(owner = "client!gea", name = "RA", descriptor = "()I", line = 2456)
    public final int method356() {
        field1383++;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        return this.field1325;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 2472)
    public final void method360(int arg0) {
        field1303++;
        int var2 = class316.field4487[arg0];
        int var3 = class316.field4490[arg0];
        for (int var4 = 0; var4 < this.field1350; var4++) {
            int var5 = this.field1291[var4] * var2 + (this.field1380[var4] * var3) >> 14;
            this.field1291[var4] = this.field1291[var4] * var3 - (this.field1380[var4] * var2) >> 14;
            this.field1380[var4] = var5;
        }
        this.field1328 = false;
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lkd;Lig;I)V", line = 2501)
    public final void method329(class280 arg0, class243 arg1, int arg2) {
        field1346++;
        if (this.field1374 == 0) {
            return;
        }
        class724 var4 = this.field1337.field8576;
        class724 var5 = (class724) arg0;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        class313.field4424 = var4.field10107 * var5.field10135 + var4.field10120 * var5.field10128 + var4.field10114 * var5.field10133 + var4.field10135;
        class223.field3185 = var4.field10107 * var5.field10120 + var4.field10120 * var5.field10119 + var4.field10114 * var5.field10125;
        float var6 = (float) this.field1312 * class223.field3185 + class313.field4424;
        float var7 = (float) this.field1308 * class223.field3185 + class313.field4424;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) (-this.field1399) + var7;
            var9 = (float) this.field1399 + var6;
        } else {
            var8 = (float) (-this.field1399) + var6;
            var9 = (float) this.field1399 + var7;
        }
        if ((this.field1337.field8611 <= var8) || ((float) this.field1337.field8653 >= var9)) {
            return;
        }
        class587.field8267 = var4.field10126 * var5.field10135 + var4.field10125 * var5.field10128 + var4.field10116 * var5.field10133 + var4.field10133;
        class265.field3859 = var4.field10126 * var5.field10120 + var4.field10125 * var5.field10119 + var4.field10116 * var5.field10125;
        float var10 = (float) this.field1312 * class265.field3859 + class587.field8267;
        float var11 = (float) this.field1308 * class265.field3859 + class587.field8267;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = ((float) this.field1399 + var10) * (float) this.field1337.field8679;
            var13 = (var11 - (float) this.field1399) * (float) this.field1337.field8679;
        } else {
            var12 = ((float) this.field1399 + var11) * (float) this.field1337.field8679;
            var13 = (var10 - (float) this.field1399) * (float) this.field1337.field8679;
        }
        if ((var13 / var9 >= this.field1337.field8620) || (var12 / var9 <= this.field1337.field8666)) {
            return;
        }
        class250.field3524 = var4.field10137 * var5.field10120 + var4.field10131 * var5.field10125 + var4.field10119 * var5.field10119;
        class78.field1466 = var4.field10137 * var5.field10135 + var4.field10131 * var5.field10133 + var4.field10119 * var5.field10128 + var4.field10128;
        float var14 = (float) this.field1312 * class250.field3524 + class78.field1466;
        float var15 = (float) this.field1308 * class250.field3524 + class78.field1466;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field1399 + var14) * (float) this.field1337.field8605;
            var17 = ((float) (-this.field1399) + var15) * (float) this.field1337.field8605;
        } else {
            var17 = ((float) (-this.field1399) + var14) * (float) this.field1337.field8605;
            var16 = ((float) this.field1399 + var15) * (float) this.field1337.field8605;
        }
        if ((var17 / var9 >= this.field1337.field8618) || (this.field1337.field8597 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field1354 != null) {
            class439.field6127 = var4.field10137 * var5.field10107 + var4.field10131 * var5.field10126 + var4.field10119 * var5.field10137;
            class314.field4435 = var4.field10137 * var5.field10114 + var4.field10131 * var5.field10116 + var4.field10119 * var5.field10131;
            class399.field5580 = var4.field10126 * var5.field10107 + var4.field10125 * var5.field10137 + var4.field10116 * var5.field10126;
            class228.field3258 = var4.field10107 * var5.field10107 + var4.field10120 * var5.field10137 + var4.field10114 * var5.field10126;
            class656.field9233 = var4.field10126 * var5.field10114 + var4.field10125 * var5.field10131 + var4.field10116 * var5.field10116;
            class253.field3632 = var4.field10107 * var5.field10114 + var4.field10120 * var5.field10131 + var4.field10114 * var5.field10116;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1401 + this.field1325 >> 1;
            int var21 = this.field1343 + this.field1340 >> 1;
            int var22 = (int) ((float) var21 * class399.field5580 + (float) this.field1312 * class265.field3859 + (float) var20 * class656.field9233 + class587.field8267);
            int var23 = (int) ((float) var21 * class439.field6127 + (float) this.field1312 * class250.field3524 + (float) var20 * class314.field4435 + class78.field1466);
            int var24 = (int) ((float) var21 * class228.field3258 + (float) this.field1312 * class223.field3185 + (float) var20 * class253.field3632 + class313.field4424);
            if (this.field1337.field8653 > var24) {
                var18 = true;
            } else {
                arg1.field3400 = this.field1337.field8679 * var22 / var24 + this.field1337.field8678;
                arg1.field3398 = this.field1337.field8605 * var23 / var24 + this.field1337.field8583;
            }
            int var25 = (int) ((float) var21 * class399.field5580 + (float) this.field1308 * class265.field3859 + (float) var20 * class656.field9233 + class587.field8267);
            int var26 = (int) ((float) var21 * class439.field6127 + (float) this.field1308 * class250.field3524 + (float) var20 * class314.field4435 + class78.field1466);
            int var27 = (int) ((float) var21 * class228.field3258 + (float) this.field1308 * class223.field3185 + (float) var20 * class253.field3632 + class313.field4424);
            if (this.field1337.field8653 > var27) {
                var18 = true;
            } else {
                arg1.field3401 = this.field1337.field8679 * var25 / var27 + this.field1337.field8678;
                arg1.field3399 = this.field1337.field8605 * var26 / var27 + this.field1337.field8583;
            }
            if (var18) {
                if (this.field1337.field8653 > var24 && var27 < this.field1337.field8653) {
                    var19 = false;
                } else if (this.field1337.field8653 > var24) {
                    int var31 = (var27 - this.field1337.field8653 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field3400 = this.field1337.field8679 * var32 / this.field1337.field8653 + this.field1337.field8678;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field3398 = this.field1337.field8605 * var33 / this.field1337.field8653 + this.field1337.field8583;
                } else if (var27 < this.field1337.field8653) {
                    int var28 = (var24 - this.field1337.field8653 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field3400 = this.field1337.field8679 * var29 / this.field1337.field8653 + this.field1337.field8678;
                    arg1.field3398 = this.field1337.field8605 * var30 / this.field1337.field8653 + this.field1337.field8583;
                }
            }
            if (var19) {
                arg1.field3397 = true;
                if (var27 < var24) {
                    arg1.field3402 = (this.field1399 + var22) * this.field1337.field8679 / var24 + this.field1337.field8678 - arg1.field3400;
                } else {
                    arg1.field3402 = (var25 + this.field1399) * this.field1337.field8679 / var27 + this.field1337.field8678 - arg1.field3401;
                }
            }
        }
        this.field1337.method3404(0);
        this.field1337.method3445(var5, 3553);
        this.method739(true);
        this.field1337.method3407((byte) 101);
        this.method741((byte) -112);
    }

    @OriginalMember(owner = "client!gea", name = "wa", descriptor = "()V", line = 2697)
    public final void method350() {
        for (int var1 = 0; var1 < this.field1307; var1++) {
            this.field1380[var1] = this.field1380[var1] + 7 >> 4;
            this.field1306[var1] = this.field1306[var1] + 7 >> 4;
            this.field1291[var1] = this.field1291[var1] + 7 >> 4;
        }
        field1392++;
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
        this.field1328 = false;
    }

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "()V", line = 2723)
    public final void method351() {
        for (int var1 = 0; var1 < this.field1350; var1++) {
            this.field1291[var1] = -this.field1291[var1];
        }
        field1371++;
        for (int var2 = 0; var2 < this.field1374; var2++) {
            this.field1294[var2] = (short) (-this.field1294[var2]);
        }
        for (int var3 = 0; var3 < this.field1339; var3++) {
            short var4 = this.field1394[var3];
            this.field1394[var3] = this.field1372[var3];
            this.field1372[var3] = var4;
        }
        if (this.field1317 == null && this.field1335 != null) {
            this.field1335.field5288 = null;
        }
        if (this.field1317 != null) {
            this.field1317.field5288 = null;
        }
        if (this.field1319 != null) {
            this.field1319.field106 = null;
        }
        this.field1328 = false;
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "O", descriptor = "(III)V", line = 2775)
    public final void method315(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1350; var4++) {
            if (arg0 != 128) {
                this.field1380[var4] = this.field1380[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1306[var4] = this.field1306[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1291[var4] = this.field1291[var4] * arg2 >> 7;
            }
        }
        field1300++;
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
        this.field1328 = false;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "([BB)V", line = 2809)
    public static final void method746(byte[] arg0, byte arg1) {
        if (arg1 != -38) {
            return;
        }
        field1298++;
        class35 var2 = new class35(arg0);
        while (true) {
            int var3 = var2.method273(255);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class440.field6145 = var2.method253(-13900);
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Loea;)V", line = 5731)
    public class74(class594 arg0) {
        this.field1337 = arg0;
        this.field1313 = new class379(null, 5126, 3, 0);
        this.field1397 = new class379(null, 5126, 2, 0);
        this.field1317 = new class379(null, 5126, 3, 0);
        this.field1335 = new class379(null, 5121, 4, 0);
        this.field1319 = new class6();
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Loea;Lww;IIII)V", line = 5744)
    public class74(class594 arg0, class729 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1337 = arg0;
        this.field1314 = arg2;
        this.field1378 = arg5;
        if (class264.method1779(arg2, arg5, false)) {
            this.field1313 = new class379(null, 5126, 3, 0);
        }
        if (class264.method1782(64, arg5, arg2)) {
            this.field1397 = new class379(null, 5126, 2, 0);
        }
        if (class436.method2628(124, arg5, arg2)) {
            this.field1317 = new class379(null, 5126, 3, 0);
        }
        if (class731.method4073(2048, arg2, arg5)) {
            this.field1335 = new class379(null, 5121, 4, 0);
        }
        if (class709.method3964(arg2, arg5, 80)) {
            this.field1319 = new class6();
        }
        class149 var7 = arg0.field1084;
        int[] var8 = new int[arg1.field10172];
        this.field1370 = new int[arg1.field10180 + 1];
        for (int var9 = 0; var9 < arg1.field10172; var9++) {
            if (arg1.field10197 == null || arg1.field10197[var9] != 2) {
                if (arg1.field10171 != null && arg1.field10171[var9] != -1) {
                    class546 var173 = var7.method1154(-113, arg1.field10171[var9] & 0xFFFF);
                    if (((this.field1378 & 0x40) == 0 || !var173.field7705) && var173.field7710) {
                        continue;
                    }
                }
                var8[this.field1339++] = var9;
                this.field1370[arg1.field10208[var9]]++;
                this.field1370[arg1.field10170[var9]]++;
                this.field1370[arg1.field10218[var9]]++;
            }
        }
        this.field1316 = this.field1339;
        long[] var10 = new long[this.field1339];
        boolean var11 = (this.field1314 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field1339; var12++) {
            int var156 = var8[var12];
            class546 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field10192 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field10192.length; var163++) {
                    class640 var164 = arg1.field10192[var163];
                    if (var164.field9111 == var156) {
                        class205 var165 = class687.method3864(-9562, var164.field9110);
                        if (var165.field2934) {
                            var162 = true;
                        }
                        if (var165.field2939 != -1) {
                            class546 var166 = var7.method1154(-115, var165.field2939);
                            if (var166.field7708 == 2) {
                                this.field1331 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field1316--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field10171 != null) {
                var167 = arg1.field10171[var156];
                if (var167 != -1) {
                    var157 = var7.method1154(-119, var167 & 0xFFFF);
                    if ((this.field1378 & 0x40) != 0 && var157.field7705) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var160 = var157.field7711;
                        var161 = var157.field7694;
                        if (var157.field7714 != 0 || var157.field7712 != 0) {
                            this.field1400 = true;
                        }
                    }
                }
            }
            boolean var168 = arg1.field10198 != null && arg1.field10198[var156] != 0 || var157 != null && var157.field7708 != 0;
            if ((var11 || var168) && arg1.field10203 != null) {
                var158 += arg1.field10203[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field1400 |= var157 != null && (var157.field7714 != 0 || var157.field7712 != 0);
            this.field1331 |= var168;
        }
        class168.method1246(var8, (byte) -118, var10);
        this.field1307 = arg1.field10210;
        this.field1306 = arg1.field10221;
        this.field1380 = arg1.field10173;
        this.field1375 = arg1.field10214;
        this.field1291 = arg1.field10220;
        this.field1350 = arg1.field10180;
        class305[] var13 = new class305[this.field1350];
        this.field1403 = arg1.field10185;
        this.field1305 = arg1.field10177;
        if (arg1.field10192 != null) {
            this.field1358 = arg1.field10192.length;
            this.field1390 = new class606[this.field1358];
            this.field1354 = new class79[this.field1358];
            for (int var14 = 0; var14 < this.field1358; var14++) {
                class640 var15 = arg1.field10192[var14];
                class205 var16 = class687.method3864(-9562, var15.field9110);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1339; var18++) {
                    if (var8[var18] == var15.field9111) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class412.field5695[arg1.field10181[var15.field9111] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field10198 == null ? 0 : arg1.field10198[var15.field9111]) << 24;
                this.field1354[var14] = new class79(var17, arg1.field10208[var15.field9111], arg1.field10170[var15.field9111], arg1.field10218[var15.field9111], var16.field2937, var16.field2932, var16.field2939, var16.field2943, var16.field2940, var16.field2934, var16.field2930, var15.field9113);
                this.field1390[var14] = new class606(var20);
            }
        }
        int var21 = this.field1339 * 3;
        this.field1294 = new short[var21];
        this.field1348 = new short[var21];
        this.field1310 = new float[var21];
        this.field1299 = new short[this.field1339];
        this.field1297 = new short[this.field1339];
        if (arg1.field10183 != null) {
            this.field1367 = new short[this.field1339];
        }
        this.field1332 = (short) arg4;
        class305.field4302 = new long[var21];
        this.field1408 = (short) arg3;
        this.field1318 = new short[this.field1339];
        this.field1385 = new byte[var21];
        this.field1407 = new short[var21];
        this.field1355 = new float[var21];
        this.field1406 = new short[var21];
        this.field1338 = new byte[this.field1339];
        this.field1372 = new short[this.field1339];
        this.field1394 = new short[this.field1339];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field10180; var23++) {
            int var155 = this.field1370[var23];
            this.field1370[var23] = var22;
            var13[var23] = new class305();
            var22 += var155;
        }
        this.field1370[arg1.field10180] = var22;
        class201 var24 = class129.method995((byte) -48, var8, this.field1339, arg1);
        class432[] var25 = new class432[arg1.field10172];
        for (int var26 = 0; var26 < arg1.field10172; var26++) {
            short var134 = arg1.field10208[var26];
            short var135 = arg1.field10170[var26];
            short var136 = arg1.field10218[var26];
            int var137 = this.field1380[var135] - this.field1380[var134];
            int var138 = this.field1306[var135] - this.field1306[var134];
            int var139 = this.field1291[var135] - this.field1291[var134];
            int var140 = this.field1380[var136] - this.field1380[var134];
            int var141 = this.field1306[var136] - this.field1306[var134];
            int var142 = this.field1291[var136] - this.field1291[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - (var138 * var140); var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var143 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var144 * var144 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var143 * 256 / var146;
            byte var150 = arg1.field10197 == null ? 0 : arg1.field10197[var26];
            if (var150 == 0) {
                class305 var152 = var13[var134];
                var152.field4300 += var149;
                var152.field4301 += var147;
                var152.field4303 += var148;
                var152.field4304++;
                class305 var153 = var13[var135];
                var153.field4304++;
                var153.field4303 += var148;
                var153.field4300 += var149;
                var153.field4301 += var147;
                class305 var154 = var13[var136];
                var154.field4300 += var149;
                var154.field4304++;
                var154.field4303 += var148;
                var154.field4301 += var147;
            } else if (var150 == 1) {
                class432 var151 = var25[var26] = new class432();
                var151.field6040 = var148;
                var151.field6034 = var147;
                var151.field6039 = var149;
            }
        }
        for (int var27 = 0; var27 < this.field1339; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field10181[var43] & 0xFFFF;
            int var45;
            if (arg1.field10216 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field10216[var43];
            }
            int var46;
            if (arg1.field10198 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field10198[var43] & 0xFF;
            }
            short var47 = arg1.field10171 == null ? -1 : arg1.field10171[var43];
            if (var47 != -1 && (this.field1378 & 0x40) != 0) {
                class546 var48 = var7.method1154(-115, var47 & 0xFFFF);
                if (var48.field7705) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var55 = 1;
                    var54 = 0.0F;
                    var49 = 0.0F;
                    var51 = 1.0F;
                    var52 = 1.0F;
                    var50 = 1.0F;
                    var53 = 0.0F;
                    var56 = 2;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field10219[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field10208[var43];
                        short var88 = arg1.field10170[var43];
                        short var89 = arg1.field10218[var43];
                        short var90 = arg1.field10215[var45];
                        short var91 = arg1.field10206[var45];
                        short var92 = arg1.field10199[var45];
                        float var93 = (float) arg1.field10173[var90];
                        float var94 = (float) arg1.field10221[var90];
                        float var95 = (float) arg1.field10220[var90];
                        float var96 = (float) arg1.field10173[var91] - var93;
                        float var97 = (float) arg1.field10221[var91] - var94;
                        float var98 = (float) arg1.field10220[var91] - var95;
                        float var99 = (float) arg1.field10173[var92] - var93;
                        float var100 = (float) arg1.field10221[var92] - var94;
                        float var101 = (float) arg1.field10220[var92] - var95;
                        float var102 = (float) arg1.field10173[var87] - var93;
                        float var103 = (float) arg1.field10221[var87] - var94;
                        float var104 = (float) arg1.field10220[var87] - var95;
                        float var105 = (float) arg1.field10173[var88] - var93;
                        float var106 = (float) arg1.field10221[var88] - var94;
                        float var107 = (float) arg1.field10220[var88] - var95;
                        float var108 = (float) arg1.field10173[var89] - var93;
                        float var109 = (float) arg1.field10221[var89] - var94;
                        float var110 = (float) arg1.field10220[var89] - var95;
                        float var111 = var97 * var101 - var98 * var100;
                        float var112 = var98 * var99 - (var96 * var101);
                        float var113 = var96 * var100 - var97 * var99;
                        float var114 = var100 * var113 - var101 * var112;
                        float var115 = var101 * var111 - (var99 * var113);
                        float var116 = var99 * var112 - var100 * var111;
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        float var118 = var98 * var111 - (var96 * var113);
                        float var119 = var97 * var113 - var98 * var112;
                        float var120 = var96 * var112 - var97 * var111;
                        float var121 = 1.0F / (var101 * var120 + var99 * var119 + var100 * var118);
                        var54 = (var110 * var120 + var108 * var119 + var109 * var118) * var121;
                        var50 = (var104 * var120 + var102 * var119 + var103 * var118) * var121;
                        var52 = (var107 * var120 + var105 * var119 + var106 * var118) * var121;
                    } else {
                        short var59 = arg1.field10208[var43];
                        short var60 = arg1.field10170[var43];
                        short var61 = arg1.field10218[var43];
                        int var62 = var24.field2881[var45];
                        int var63 = var24.field2880[var45];
                        int var64 = var24.field2882[var45];
                        float[] var65 = var24.field2879[var45];
                        byte var66 = arg1.field10186[var45];
                        float var67 = (float) arg1.field10207[var45] / 256.0F;
                        if (var58 == 1) {
                            float var68 = (float) arg1.field10195[var45] / 1024.0F;
                            class160.method1207(var66, var64, var65, -167141975, var63, class399.field5587, var68, arg1.field10220[var59], var67, arg1.field10221[var59], arg1.field10173[var59], var62);
                            var49 = class399.field5587[0];
                            var50 = class399.field5587[1];
                            class160.method1207(var66, var64, var65, -167141975, var63, class399.field5587, var68, arg1.field10220[var60], var67, arg1.field10221[var60], arg1.field10173[var60], var62);
                            var51 = class399.field5587[0];
                            var52 = class399.field5587[1];
                            class160.method1207(var66, var64, var65, -167141975, var63, class399.field5587, var68, arg1.field10220[var61], var67, arg1.field10221[var61], arg1.field10173[var61], var62);
                            var53 = class399.field5587[0];
                            var54 = class399.field5587[1];
                            float var69 = var68 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var51 - var49 > var69) {
                                    var51 -= var68;
                                    var55 = 1;
                                } else if (var49 - var51 > var69) {
                                    var55 = 2;
                                    var51 += var68;
                                }
                                if ((var69 < var53 - var49)) {
                                    var56 = 1;
                                    var53 -= var68;
                                } else if (var69 < var49 - var53) {
                                    var56 = 2;
                                    var53 += var68;
                                }
                            } else {
                                if (var69 < var52 - var50) {
                                    var55 = 1;
                                    var52 -= var68;
                                } else if (var50 - var52 > var69) {
                                    var55 = 2;
                                    var52 += var68;
                                }
                                if ((var69 < var54 - var50)) {
                                    var54 -= var68;
                                    var56 = 1;
                                } else if (var69 < var50 - var54) {
                                    var54 += var68;
                                    var56 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var70 = (float) arg1.field10187[var45] / 256.0F;
                            float var71 = (float) arg1.field10204[var45] / 256.0F;
                            int var72 = arg1.field10173[var60] - arg1.field10173[var59];
                            int var73 = arg1.field10221[var60] - arg1.field10221[var59];
                            int var74 = arg1.field10220[var60] - arg1.field10220[var59];
                            int var75 = arg1.field10173[var61] - arg1.field10173[var59];
                            int var76 = arg1.field10221[var61] - arg1.field10221[var59];
                            int var77 = arg1.field10220[var61] - arg1.field10220[var59];
                            int var78 = var73 * var77 - (var74 * var76);
                            int var79 = var74 * var75 - (var72 * var77);
                            int var80 = var72 * var76 - (var73 * var75);
                            float var81 = 64.0F / (float) arg1.field10205[var45];
                            float var82 = 64.0F / (float) arg1.field10209[var45];
                            float var83 = 64.0F / (float) arg1.field10195[var45];
                            float var84 = (var65[2] * (float) var80 + var65[0] * (float) var78 + var65[1] * (float) var79) / var81;
                            float var85 = (var65[5] * (float) var80 + var65[4] * (float) var79 + var65[3] * (float) var78) / var82;
                            float var86 = (var65[8] * (float) var80 + var65[7] * (float) var79 + var65[6] * (float) var78) / var83;
                            var57 = class475.method2867(3094, var85, var84, var86);
                            class488.method2929(var64, (byte) -47, var66, var65, arg1.field10173[var59], var70, var62, var71, class399.field5587, arg1.field10221[var59], arg1.field10220[var59], var67, var63, var57);
                            var49 = class399.field5587[0];
                            var50 = class399.field5587[1];
                            class488.method2929(var64, (byte) -47, var66, var65, arg1.field10173[var60], var70, var62, var71, class399.field5587, arg1.field10221[var60], arg1.field10220[var60], var67, var63, var57);
                            var52 = class399.field5587[1];
                            var51 = class399.field5587[0];
                            class488.method2929(var64, (byte) -47, var66, var65, arg1.field10173[var61], var70, var62, var71, class399.field5587, arg1.field10221[var61], arg1.field10220[var61], var67, var63, var57);
                            var54 = class399.field5587[1];
                            var53 = class399.field5587[0];
                        } else if (var58 == 3) {
                            class280.method1834(arg1.field10221[var59], var64, arg1.field10173[var59], class399.field5587, (byte) -37, var65, var66, arg1.field10220[var59], var62, var67, var63);
                            var49 = class399.field5587[0];
                            var50 = class399.field5587[1];
                            class280.method1834(arg1.field10221[var60], var64, arg1.field10173[var60], class399.field5587, (byte) -37, var65, var66, arg1.field10220[var60], var62, var67, var63);
                            var52 = class399.field5587[1];
                            var51 = class399.field5587[0];
                            class280.method1834(arg1.field10221[var61], var64, arg1.field10173[var61], class399.field5587, (byte) -37, var65, var66, arg1.field10220[var61], var62, var67, var63);
                            var54 = class399.field5587[1];
                            var53 = class399.field5587[0];
                            if ((var66 & 0x1) == 0) {
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var53++;
                                    var56 = 2;
                                }
                                if (var51 - var49 > 0.5F) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                            } else {
                                if (var52 - var50 > 0.5F) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                                if ((var54 - var50 > 0.5F)) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field10197 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field10197[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var57 << 24) + (long) var46 + ((long) (var44 << 8)) << 32) + (long) (var45 << 2);
                short var128 = arg1.field10208[var43];
                short var129 = arg1.field10170[var43];
                short var130 = arg1.field10218[var43];
                class305 var131 = var13[var128];
                this.field1394[var27] = this.method748(var131.field4304, var126, var131.field4300, var131.field4301, var49, 3, arg1, var50, var131.field4303, var128);
                class305 var132 = var13[var129];
                this.field1318[var27] = this.method748(var132.field4304, (long) var55 + var126, var132.field4300, var132.field4301, var51, 3, arg1, var52, var132.field4303, var129);
                class305 var133 = var13[var130];
                this.field1372[var27] = this.method748(var133.field4304, (long) var56 + var126, var133.field4300, var133.field4301, var53, 3, arg1, var54, var133.field4303, var130);
            } else if (var122 == 1) {
                class432 var123 = var25[var43];
                long var124 = ((long) (var44 << 8) + (long) var46 + (long) (var57 << 24) << 32) + (long) ((var123.field6040 + 256 << 22) + (var123.field6034 + 256 << 12) + (var45 << 2) + (var123.field6039 > 0 ? 1024 : 2048));
                this.field1394[var27] = this.method748(0, var124, var123.field6039, var123.field6034, var49, 3, arg1, var50, var123.field6040, arg1.field10208[var43]);
                this.field1318[var27] = this.method748(0, (long) var55 + var124, var123.field6039, var123.field6034, var51, 3, arg1, var52, var123.field6040, arg1.field10170[var43]);
                this.field1372[var27] = this.method748(0, (long) var56 + var124, var123.field6039, var123.field6034, var53, 3, arg1, var54, var123.field6040, arg1.field10218[var43]);
            }
            if (arg1.field10198 != null) {
                this.field1338[var27] = arg1.field10198[var43];
            }
            if (arg1.field10183 != null) {
                this.field1367[var27] = arg1.field10183[var43];
            }
            this.field1297[var27] = arg1.field10181[var43];
            this.field1299[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field1316; var30++) {
            short var42 = this.field1299[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field1360 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field1316; var33++) {
            short var41 = this.field1299[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field1360[var31++] = var33;
            }
        }
        this.field1360[var31] = this.field1316;
        class305.field4302 = null;
        this.field1348 = class231.method1583(this.field1348, 25077, this.field1374);
        this.field1407 = class231.method1583(this.field1407, 25077, this.field1374);
        this.field1294 = class231.method1583(this.field1294, 25077, this.field1374);
        this.field1385 = class169.method1248(65535, this.field1374, this.field1385);
        this.field1355 = class147.method1139(this.field1374, this.field1355, 20145);
        this.field1310 = class147.method1139(this.field1374, this.field1310, 20145);
        if (arg1.field10222 != null && class552.method3238(this.field1378, -102, arg2)) {
            this.field1311 = arg1.method4055(103, false);
        }
        if (arg1.field10192 != null && class203.method1416(this.field1378, 105, arg2)) {
            this.field1309 = arg1.method4070(true);
        }
        if (arg1.field10223 != null && class581.method3365(-13849, this.field1378, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field1339; var36++) {
                int var40 = arg1.field10223[var8[var36]];
                if (var40 >= 0) {
                    if (var34 < var40) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field1352 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field1352[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field1339; var38++) {
                int var39 = arg1.field10223[var8[var38]];
                if (var39 >= 0) {
                    this.field1352[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "aa", descriptor = "(SS)V", line = 2848)
    public final void method323(short arg0, short arg1) {
        field1327++;
        class149 var3 = this.field1337.field1084;
        for (int var4 = 0; var4 < this.field1339; var4++) {
            if (this.field1299[var4] == arg0) {
                this.field1299[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class546 var7 = var3.method1154(-117, arg0 & 0xFFFF);
            var6 = var7.field7696;
            var5 = var7.field7707;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class546 var10 = var3.method1154(-122, arg1 & 0xFFFF);
            var8 = var10.field7707;
            if (var10.field7714 != 0 || var10.field7712 != 0) {
                this.field1400 = true;
            }
            var9 = var10.field7696;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field1354 != null) {
            for (int var11 = 0; var11 < this.field1358; var11++) {
                class79 var12 = this.field1354[var11];
                class606 var13 = this.field1390[var11];
                var13.field8799 = class412.field5695[this.field1297[var12.field1474] & 0xFFFF] & 0xFFFFFF | var13.field8799 & 0xFF000000;
            }
        }
        if (this.field1335 != null) {
            this.field1335.field5288 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!gea", name = "ba", descriptor = "(Lr;)Lr;", line = 2936)
    public final class181 method340(class181 arg0) {
        field1388++;
        if (this.field1374 == 0) {
            return null;
        }
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        int var2;
        int var3;
        if (this.field1337.field8635 > 0) {
            var2 = this.field1401 - (this.field1337.field8635 * this.field1308 >> 8) >> this.field1337.field8545;
            var3 = this.field1325 - (this.field1337.field8635 * this.field1312 >> 8) >> this.field1337.field8545;
        } else {
            var2 = this.field1401 - (this.field1337.field8635 * this.field1312 >> 8) >> this.field1337.field8545;
            var3 = this.field1325 - (this.field1337.field8635 * this.field1308 >> 8) >> this.field1337.field8545;
        }
        int var4;
        int var5;
        if (this.field1337.field8591 > 0) {
            var4 = this.field1343 - (this.field1337.field8591 * this.field1308 >> 8) >> this.field1337.field8545;
            var5 = this.field1340 - (this.field1337.field8591 * this.field1312 >> 8) >> this.field1337.field8545;
        } else {
            var4 = this.field1343 - (this.field1337.field8591 * this.field1312 >> 8) >> this.field1337.field8545;
            var5 = this.field1340 - (this.field1337.field8591 * this.field1308 >> 8) >> this.field1337.field8545;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class429 var8 = (class429) arg0;
        class429 var9;
        if (var8 != null && var8.method2603(924832720, var6, var7)) {
            var9 = var8;
            var8.method2604(-18492);
        } else {
            var9 = new class429(this.field1337, var6, var7);
        }
        var9.method2607(0, var4, var3, var2, var5);
        this.method742(-62, var9);
        return var9;
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "()V", line = 2999)
    public final void method326() {
        field1386++;
        if (this.field1374 <= 0 || this.field1316 <= 0) {
            return;
        }
        this.method747(false, true);
        if ((this.field1301 & 0x10) == 0 && this.field1319.field106 == null) {
            this.method744(false, false);
        }
        this.method743(18);
    }

    @OriginalMember(owner = "client!gea", name = "da", descriptor = "()I", line = 3020)
    public final int method320() {
        field1389++;
        return this.field1332;
    }

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "()[Lgi;", line = 3032)
    public final class675[] method334() {
        field1357++;
        return this.field1403;
    }

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "(I[IIIIZI[I)V", line = 3040)
    public final void method346(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1330++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class399.field5584 = 0;
            class735.field10352 = 0;
            class515.field7331 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1311.length) {
                    int[] var16 = this.field1311[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1375 == null || (arg6 & this.field1375[var18]) != 0) {
                            class515.field7331 += this.field1380[var18];
                            class735.field10352 += this.field1306[var18];
                            var13++;
                            class399.field5584 += this.field1291[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class399.field5584 = class399.field5584 / var13 + var10;
                class735.field10352 = class735.field10352 / var13 + var11;
                class515.field7331 = class515.field7331 / var13 + var12;
                class24.field312 = true;
            } else {
                class735.field10352 = var11;
                class399.field5584 = var10;
                class515.field7331 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3 + (arg7[2] * arg4)) + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + (arg7[4] * arg3) + 8192 >> 14;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field1311.length > var26) {
                    int[] var27 = this.field1311[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1375 == null || (arg6 & this.field1375[var29]) != 0) {
                            this.field1380[var29] += var22;
                            this.field1306[var29] += var23;
                            this.field1291[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field1311.length > var109) {
                        int[] var110 = this.field1311[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field1375 == null || (arg6 & this.field1375[var112]) != 0) {
                                this.field1380[var112] -= class515.field7331;
                                this.field1306[var112] -= class735.field10352;
                                this.field1291[var112] -= class399.field5584;
                                if (arg4 != 0) {
                                    int var113 = class316.field4487[arg4];
                                    int var114 = class316.field4490[arg4];
                                    int var115 = this.field1380[var112] * var114 + this.field1306[var112] * var113 + 16383 >> 14;
                                    this.field1306[var112] = this.field1306[var112] * var114 + 16383 - (this.field1380[var112] * var113) >> 14;
                                    this.field1380[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class316.field4487[arg2];
                                    int var117 = class316.field4490[arg2];
                                    int var118 = this.field1306[var112] * var117 + 16383 - this.field1291[var112] * var116 >> 14;
                                    this.field1291[var112] = this.field1306[var112] * var116 + this.field1291[var112] * var117 + 16383 >> 14;
                                    this.field1306[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class316.field4487[arg3];
                                    int var120 = class316.field4490[arg3];
                                    int var121 = this.field1291[var112] * var119 + (this.field1380[var112] * var120) + 16383 >> 14;
                                    this.field1291[var112] = this.field1291[var112] * var120 + 16383 - (this.field1380[var112] * var119) >> 14;
                                    this.field1380[var112] = var121;
                                }
                                this.field1380[var112] += class515.field7331;
                                this.field1306[var112] += class735.field10352;
                                this.field1291[var112] += class399.field5584;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field1311.length > var92) {
                            int[] var93 = this.field1311[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field1375 == null || (this.field1375[var95] & arg6) != 0) {
                                    int var96 = this.field1370[var95];
                                    int var97 = this.field1370[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field1406[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class316.field4487[arg4];
                                            int var101 = class316.field4490[arg4];
                                            int var102 = this.field1348[var99] * var101 + this.field1407[var99] * var100 + 16383 >> 14;
                                            this.field1407[var99] = (short) (this.field1407[var99] * var101 + 16383 - (this.field1348[var99] * var100) >> 14);
                                            this.field1348[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class316.field4487[arg2];
                                            int var104 = class316.field4490[arg2];
                                            int var105 = this.field1407[var99] * var104 + 16383 - (this.field1294[var99] * var103) >> 14;
                                            this.field1294[var99] = (short) (this.field1294[var99] * var104 + this.field1407[var99] * var103 + 16383 >> 14);
                                            this.field1407[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class316.field4487[arg3];
                                            int var107 = class316.field4490[arg3];
                                            int var108 = this.field1294[var99] * var106 - (-(this.field1348[var99] * var107) - 16383) >> 14;
                                            this.field1294[var99] = (short) (this.field1294[var99] * var107 + 16383 - (this.field1348[var99] * var106) >> 14);
                                            this.field1348[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1317 == null && this.field1335 != null) {
                        this.field1335.field5288 = null;
                    }
                    if (this.field1317 != null) {
                        this.field1317.field5288 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class24.field312) {
                    int var36 = arg7[6] * class399.field5584 + arg7[3] * class735.field10352 + arg7[0] * class515.field7331 + 8192 >> 14;
                    int var37 = arg7[1] * class515.field7331 - (-(arg7[7] * class399.field5584) - (arg7[4] * class735.field10352) - 8192) >> 14;
                    int var38 = arg7[8] * class399.field5584 + arg7[2] * class515.field7331 - (-(arg7[5] * class735.field10352) + -8192) >> 14;
                    int var39 = var34 + var37;
                    int var40 = var33 + var36;
                    int var41 = var35 + var38;
                    class735.field10352 = var39;
                    class515.field7331 = var40;
                    class24.field312 = false;
                    class399.field5584 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class316.field4490[arg2];
                int var44 = class316.field4487[arg2];
                int var45 = class316.field4490[arg3];
                int var46 = class316.field4487[arg3];
                int var47 = class316.field4490[arg4];
                int var48 = class316.field4487[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[7] = var46 * var48 + (var45 * var49) + 8192 >> 14;
                var42[5] = -var44;
                var42[6] = -var46 * var47 - (-(var45 * var50) - 8192) >> 14;
                int var51 = var42[2] * -class399.field5584 + var42[0] * -class515.field7331 - (-(var42[1] * -class735.field10352) - 8192) >> 14;
                int var52 = var42[4] * -class735.field10352 + var42[3] * -class515.field7331 + var42[5] * -class399.field5584 + 8192 >> 14;
                int var53 = var42[8] * -class399.field5584 + var42[7] * -class735.field10352 + var42[6] * -class515.field7331 + 8192 >> 14;
                int var54 = class515.field7331 + var51;
                int var55 = class735.field10352 + var52;
                int var56 = class399.field5584 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[2] * var35 + var42[1] * var34 + var42[0] * var33 + 8192 >> 14;
                int var60 = var42[3] * var33 + var42[5] * var35 + var42[4] * var34 + 8192 >> 14;
                int var61 = var42[6] * var33 + (var42[7] * var34) + (var42[8] * var35 - -8192) >> 14;
                int var62 = var55 + var60;
                int var63 = var54 + var59;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[0] * var63 + arg7[2] * var64 + arg7[1] * var62 + 8192 >> 14;
                int var68 = arg7[5] * var64 + (arg7[3] * var63 + (arg7[4] * var62) + 8192) >> 14;
                int var69 = var31 + var68;
                int var70 = var30 + var67;
                int var71 = arg7[6] * var63 + arg7[7] * var62 + (arg7[8] * var64) + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field1311.length > var74) {
                        int[] var75 = this.field1311[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field1375 == null || (this.field1375[var77] & arg6) != 0) {
                                int var78 = this.field1380[var77] * var65[0] + this.field1306[var77] * var65[1] + this.field1291[var77] * var65[2] + 8192 >> 14;
                                int var79 = this.field1380[var77] * var65[3] - (-(this.field1306[var77] * var65[4]) - (this.field1291[var77] * var65[5] + 8192)) >> 14;
                                int var80 = var70 + var78;
                                int var81 = this.field1380[var77] * var65[6] + this.field1291[var77] * var65[8] + (this.field1306[var77] * var65[7]) + 8192 >> 14;
                                int var82 = var69 + var79;
                                this.field1380[var77] = var80;
                                int var83 = var72 + var81;
                                this.field1306[var77] = var82;
                                this.field1291[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field1311.length > var123) {
                        int[] var124 = this.field1311[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field1375 == null || (this.field1375[var126] & arg6) != 0) {
                                this.field1380[var126] -= class515.field7331;
                                this.field1306[var126] -= class735.field10352;
                                this.field1291[var126] -= class399.field5584;
                                this.field1380[var126] = this.field1380[var126] * arg2 >> 7;
                                this.field1306[var126] = this.field1306[var126] * arg3 >> 7;
                                this.field1291[var126] = this.field1291[var126] * arg4 >> 7;
                                this.field1380[var126] += class515.field7331;
                                this.field1306[var126] += class735.field10352;
                                this.field1291[var126] += class399.field5584;
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
                if (class24.field312) {
                    int var133 = arg7[6] * class399.field5584 + arg7[3] * class735.field10352 + arg7[0] * class515.field7331 + 8192 >> 14;
                    int var134 = arg7[7] * class399.field5584 + arg7[4] * class735.field10352 + arg7[1] * class515.field7331 + 8192 >> 14;
                    int var135 = var131 + var134;
                    int var136 = arg7[8] * class399.field5584 + arg7[2] * class515.field7331 + (arg7[5] * class735.field10352) + 8192 >> 14;
                    int var137 = var130 + var133;
                    int var138 = var132 + var136;
                    class515.field7331 = var137;
                    class735.field10352 = var135;
                    class24.field312 = false;
                    class399.field5584 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class515.field7331 * var139 + 8192 >> 14;
                int var143 = -class735.field10352 * var140 + 8192 >> 14;
                int var144 = -class399.field5584 * var141 + 8192 >> 14;
                int var145 = class515.field7331 + var142;
                int var146 = class735.field10352 + var143;
                int var147 = class399.field5584 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var145 + var149;
                int var154 = var147 + var152;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var174 + (var176 * 3)];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[0] * var153 - (-(arg7[1] * var151) - 8192) >> 14;
                int var158 = arg7[3] * var153 + arg7[5] * var154 + arg7[4] * var151 + 8192 >> 14;
                int var159 = arg7[6] * var153 + arg7[8] * var154 + arg7[7] * var151 + 8192 >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field1311.length) {
                        int[] var165 = this.field1311[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field1375 == null || (this.field1375[var167] & arg6) != 0) {
                                int var168 = this.field1291[var167] * var155[2] + this.field1306[var167] * var155[1] + (this.field1380[var167] * var155[0] - -8192) >> 14;
                                int var169 = this.field1380[var167] * var155[3] + this.field1291[var167] * var155[5] + this.field1306[var167] * var155[4] + 8192 >> 14;
                                int var170 = var161 + var169;
                                int var171 = this.field1380[var167] * var155[6] + this.field1306[var167] * var155[7] + this.field1291[var167] * var155[8] + 8192 >> 14;
                                int var172 = var160 + var168;
                                this.field1380[var167] = var172;
                                int var173 = var162 + var171;
                                this.field1306[var167] = var170;
                                this.field1291[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1352 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field1352.length > var181) {
                        int[] var182 = this.field1352[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1367 == null || (arg6 & this.field1367[var184]) != 0) {
                                int var185 = (this.field1338[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1338[var184] = (byte) var185;
                                if (this.field1335 != null) {
                                    this.field1335.field5288 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1354 != null) {
                    for (int var178 = 0; var178 < this.field1358; var178++) {
                        class79 var179 = this.field1354[var178];
                        class606 var180 = this.field1390[var178];
                        var180.field8799 = var180.field8799 & 0xFFFFFF | 255 - (this.field1338[var179.field1474] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1352 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field1352.length) {
                        int[] var191 = this.field1352[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1367 == null || (this.field1367[var193] & arg6) != 0) {
                                int var194 = this.field1297[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD53) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1297[var193] = (short) class164.method1221(var200, class164.method1221(var199 << 7, var198 << 10));
                                if (this.field1335 != null) {
                                    this.field1335.field5288 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1354 != null) {
                    for (int var187 = 0; var187 < this.field1358; var187++) {
                        class79 var188 = this.field1354[var187];
                        class606 var189 = this.field1390[var187];
                        var189.field8799 = class412.field5695[this.field1297[var188.field1474] & 0xFFFF] & 0xFFFFFF | var189.field8799 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1309 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field1309.length > var202) {
                        int[] var203 = this.field1309[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class606 var205 = this.field1390[var203[var204]];
                            var205.field8806 += arg3;
                            var205.field8802 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1309 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field1309.length) {
                        int[] var208 = this.field1309[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class606 var210 = this.field1390[var208[var209]];
                            var210.field8804 = var210.field8804 * arg2 >> 7;
                            var210.field8794 = var210.field8794 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1309 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field1309.length > var212) {
                    int[] var213 = this.field1309[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class606 var215 = this.field1390[var213[var214]];
                        var215.field8800 = var215.field8800 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "VA", descriptor = "(I)V", line = 4030)
    public final void method310(int arg0) {
        field1382++;
        int var2 = class316.field4487[arg0];
        int var3 = class316.field4490[arg0];
        for (int var4 = 0; var4 < this.field1350; var4++) {
            int var5 = this.field1306[var4] * var2 + (this.field1380[var4] * var3) >> 14;
            this.field1306[var4] = this.field1306[var4] * var3 - this.field1380[var4] * var2 >> 14;
            this.field1380[var4] = var5;
        }
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
        this.field1328 = false;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILkd;ZI)Z", line = 4060)
    public final boolean method348(int arg0, int arg1, class280 arg2, boolean arg3, int arg4) {
        field1387++;
        return this.method749(arg4, arg0, arg1, -1, (byte) -55, arg3, arg2);
    }

    @OriginalMember(owner = "client!gea", name = "ua", descriptor = "()I", line = 4068)
    public final int method361() {
        field1329++;
        return this.field1314;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lkd;)V", line = 4079)
    public final void method354(class280 arg0) {
        field1377++;
        class724 var2 = (class724) arg0;
        if (this.field1403 != null) {
            for (int var3 = 0; var3 < this.field1403.length; var3++) {
                class675 var4 = this.field1403[var3];
                class675 var5 = var4;
                if (var4.field9476 != null) {
                    var5 = var4.field9476;
                }
                var5.field9484 = (int) ((float) this.field1291[var4.field9472] * var2.field10126 + (float) this.field1380[var4.field9472] * var2.field10116 + (float) this.field1306[var4.field9472] * var2.field10125 + var2.field10133);
                var5.field9488 = (int) ((float) this.field1291[var4.field9472] * var2.field10137 + (float) this.field1380[var4.field9472] * var2.field10131 + (float) this.field1306[var4.field9472] * var2.field10119 + var2.field10128);
                var5.field9483 = (int) ((float) this.field1291[var4.field9472] * var2.field10107 + (float) this.field1380[var4.field9472] * var2.field10114 + (float) this.field1306[var4.field9472] * var2.field10120 + var2.field10135);
                var5.field9473 = (int) ((float) this.field1291[var4.field9482] * var2.field10126 + (float) this.field1380[var4.field9482] * var2.field10116 + (float) this.field1306[var4.field9482] * var2.field10125 + var2.field10133);
                var5.field9490 = (int) ((float) this.field1291[var4.field9482] * var2.field10137 + (float) this.field1380[var4.field9482] * var2.field10131 + (float) this.field1306[var4.field9482] * var2.field10119 + var2.field10128);
                var5.field9489 = (int) ((float) this.field1291[var4.field9482] * var2.field10107 + (float) this.field1380[var4.field9482] * var2.field10114 + (float) this.field1306[var4.field9482] * var2.field10120 + var2.field10135);
                var5.field9494 = (int) ((float) this.field1291[var4.field9495] * var2.field10126 + (float) this.field1380[var4.field9495] * var2.field10116 + (float) this.field1306[var4.field9495] * var2.field10125 + var2.field10133);
                var5.field9479 = (int) ((float) this.field1291[var4.field9495] * var2.field10137 + (float) this.field1380[var4.field9495] * var2.field10131 + (float) this.field1306[var4.field9495] * var2.field10119 + var2.field10128);
                var5.field9481 = (int) ((float) this.field1291[var4.field9495] * var2.field10107 + (float) this.field1380[var4.field9495] * var2.field10114 + (float) this.field1306[var4.field9495] * var2.field10120 + var2.field10135);
            }
        }
        if (this.field1305 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field1305.length; var6++) {
            class206 var7 = this.field1305[var6];
            class206 var8 = var7;
            if (var7.field2953 != null) {
                var8 = var7.field2953;
            }
            if (var7.field2959 == null) {
                var7.field2959 = var2.method174();
            } else {
                var7.field2959.method160(var2);
            }
            var8.field2952 = (int) ((float) this.field1291[var7.field2955] * var2.field10126 + (float) this.field1380[var7.field2955] * var2.field10116 + (float) this.field1306[var7.field2955] * var2.field10125 + var2.field10133);
            var8.field2949 = (int) ((float) this.field1291[var7.field2955] * var2.field10137 + (float) this.field1380[var7.field2955] * var2.field10131 + (float) this.field1306[var7.field2955] * var2.field10119 + var2.field10128);
            var8.field2948 = (int) ((float) this.field1291[var7.field2955] * var2.field10107 + (float) this.field1380[var7.field2955] * var2.field10114 + (float) this.field1306[var7.field2955] * var2.field10120 + var2.field10135);
        }
    }

    @OriginalMember(owner = "client!gea", name = "ma", descriptor = "()I", line = 4147)
    public final int method324() {
        field1396++;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        return this.field1334;
    }

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "(IILs;Ls;III)V", line = 4158)
    public final void method330(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6) {
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        field1353++;
        int var8 = this.field1401 + arg4;
        int var9 = this.field1325 + arg4;
        int var10 = this.field1343 + arg6;
        int var11 = this.field1340 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3920 + var9 >> arg2.field3915 >= arg2.field3924 || var10 < 0 || arg2.field3920 + var11 >> arg2.field3915 >= arg2.field3914) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field3920 + var9 >> arg3.field3915) >= arg3.field3924 || var10 < 0 || arg3.field3914 <= (arg3.field3920 + var11 >> arg3.field3915)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3915;
            int var13 = var9 - (1 - arg2.field3920) >> arg2.field3915;
            int var14 = var10 >> arg2.field3915;
            int var15 = var11 + arg2.field3920 - 1 >> arg2.field3915;
            if (arg5 == arg2.method1825(var14, -128, var12) && arg2.method1825(var14, -128, var13) == arg5 && arg5 == arg2.method1825(var15, -128, var12) && arg5 == arg2.method1825(var15, -128, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field1350; var32++) {
                this.field1306[var32] = this.field1306[var32] + arg2.method1827(-3458, this.field1380[var32] - -arg4, this.field1291[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field1312;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field1350; var17++) {
                int var18 = (this.field1306[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field1306[var17] += (arg2.method1827(-3458, this.field1380[var17] + arg4, this.field1291[var17] + arg6) - arg5) * (arg1 - var18) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFFF3) >> 8) * 4;
            int var30 = (arg1 & 0xFFE718) >> 16 << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var28 >> 1)) < 0 || arg2.field3924 << arg2.field3915 <= (var28 >> 1) + arg4 + arg2.field3920 || arg6 - (var29 >> 1) < 0 || (var29 >> 1) + (arg6 + arg2.field3920) >= arg2.field3914 << arg2.field3915) {
                return;
            }
            this.method2850(var30, var29, arg2, var31, arg6, (byte) 111, var28, arg5, arg4);
        } else if (arg0 == 4) {
            int var19 = this.field1308 - this.field1312;
            for (int var20 = 0; var20 < this.field1350; var20++) {
                this.field1306[var20] = this.field1306[var20] + arg3.method1827(-3458, this.field1380[var20] + arg4, this.field1291[var20] + arg6) + var19 - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field1308 - this.field1312;
            for (int var22 = 0; var22 < this.field1350; var22++) {
                int var23 = this.field1380[var22] + arg4;
                int var24 = this.field1291[var22] + arg6;
                int var25 = arg2.method1827(-3458, var23, var24);
                int var26 = arg3.method1827(-3458, var23, var24);
                int var27 = var25 - arg1 - var26;
                this.field1306[var22] = ((this.field1306[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
        this.field1328 = false;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BIZ)Lka;", line = 4314)
    public final class469 method325(byte arg0, int arg1, boolean arg2) {
        field1322++;
        class74 var4;
        class74 var5;
        if (arg0 == 1) {
            var4 = this.field1337.field8689;
            var5 = this.field1337.field8609;
        } else if (arg0 == 2) {
            var5 = this.field1337.field8685;
            var4 = this.field1337.field8664;
        } else if (arg0 == 3) {
            var5 = this.field1337.field8617;
            var4 = this.field1337.field8584;
        } else if (arg0 == 4) {
            var5 = this.field1337.field8655;
            var4 = this.field1337.field8636;
        } else if (arg0 == 5) {
            var5 = this.field1337.field8662;
            var4 = this.field1337.field8670;
        } else {
            var5 = var4 = new class74(this.field1337);
        }
        return this.method740(false, arg2, arg0 != 0, var4, arg1, var5);
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(ZZ)V", line = 4379)
    private final void method747(boolean arg0, boolean arg1) {
        field1398++;
        boolean var3 = this.field1335 != null && this.field1335.field5288 == null;
        boolean var4 = this.field1317 != null && this.field1317.field5288 == null;
        boolean var5 = this.field1313 != null && this.field1313.field5288 == null;
        boolean var6 = this.field1397 != null && this.field1397.field5288 == null;
        if (arg0) {
            var6 &= (this.field1301 & 0x8) != 0;
            var5 &= (this.field1301 & 0x1) != 0;
            var4 &= (this.field1301 & 0x4) != 0;
            var3 &= (this.field1301 & 0x2) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        if (!arg1) {
            this.field1404 = null;
        }
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
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
        if (this.field1337.field8688.field483.length >= (this.field1374 * var7)) {
            this.field1337.field8688.field469 = 0;
        } else {
            this.field1337.field8688 = new class427((this.field1374 + 100) * var7);
        }
        class427 var12 = this.field1337.field8688;
        if (var5) {
            if (this.field1337.field8682) {
                for (int var13 = 0; var13 < this.field1350; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field1380[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field1306[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field1291[var13]);
                    int var17 = this.field1370[var13];
                    int var18 = this.field1370[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field1406[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field469 = var7 * var20;
                        var12.method233(var14, -23162);
                        var12.method233(var15, -23162);
                        var12.method233(var16, -23162);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1350; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field1380[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field1306[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field1291[var21]);
                    int var25 = this.field1370[var21];
                    int var26 = this.field1370[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field1406[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field469 = var7 * var28;
                        var12.method227(var22, (byte) 0);
                        var12.method227(var23, (byte) 0);
                        var12.method227(var24, (byte) 0);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1317 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field1381 == null) {
                    var31 = this.field1385;
                    var33 = this.field1407;
                    var32 = this.field1348;
                    var34 = this.field1294;
                } else {
                    var31 = this.field1381.field5049;
                    var32 = this.field1381.field5057;
                    var33 = this.field1381.field5054;
                    var34 = this.field1381.field5053;
                }
                float var35 = this.field1337.field8604[0];
                float var36 = this.field1337.field8604[1];
                float var37 = this.field1337.field8604[2];
                float var38 = this.field1337.field8628;
                float var39 = this.field1337.field8641 * 768.0F / (float) this.field1332;
                float var40 = this.field1337.field8592 * 768.0F / (float) this.field1332;
                for (int var41 = 0; var41 < this.field1339; var41++) {
                    int var42 = this.method738(-16067, this.field1338[var41], this.field1297[var41], this.field1299[var41], this.field1408);
                    float var43 = (float) ((var42 & 0xFFB998) >> 16) * this.field1337.field8663;
                    float var44 = (float) (var42 >>> 24) * this.field1337.field8637;
                    short var45 = this.field1394[var41];
                    float var46 = (float) ((var42 & 0xFF77) >> 8) * this.field1337.field8643;
                    short var47 = (short) var31[var45];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var34[var45] * var37 + (float) var32[var45] * var35 + (float) var33[var45] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var34[var45] * var37 + (float) var32[var45] * var35 + (float) var33[var45] * var36) / (float) (var47 * 256);
                    }
                    float var49 = (var48 < 0.0F ? var40 : var39) * var48 + var38;
                    int var50 = (int) (var44 * var49);
                    int var51 = (int) (var43 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var52 = (int) (var46 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.field469 = var7 * var45 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method263((byte) 113, var50);
                    var12.method263((byte) 82, var51);
                    var12.method263((byte) -76, var52);
                    var12.method263((byte) -117, 255 - (this.field1338[var41] & 0xFF));
                    short var53 = this.field1318[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var34[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var34[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + (var55 < 0.0F ? var40 : var39) * var55;
                    int var57 = (int) (var44 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var46 * var56);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.field469 = var7 * var53 + var9;
                    var12.method263((byte) -67, var57);
                    var12.method263((byte) 87, var58);
                    var12.method263((byte) -72, var59);
                    var12.method263((byte) 90, 255 - (this.field1338[var41] & 0xFF));
                    short var60 = this.field1372[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var34[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var34[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = var62 * (var62 < 0.0F ? var40 : var39) + var38;
                    int var64 = (int) (var44 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var43 * var63);
                    int var66 = (int) (var46 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field469 = var9 + (var7 * var60);
                    var12.method263((byte) 81, var64);
                    var12.method263((byte) -93, var65);
                    var12.method263((byte) -91, var66);
                    var12.method263((byte) -71, 255 - (this.field1338[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field1339; var29++) {
                    int var30 = this.method738(-16067, this.field1338[var29], this.field1297[var29], this.field1299[var29], this.field1408);
                    var12.field469 = this.field1394[var29] * var7 + var9;
                    var12.method233(var30, -23162);
                    var12.field469 = this.field1318[var29] * var7 + var9;
                    var12.method233(var30, -23162);
                    var12.field469 = this.field1372[var29] * var7 + var9;
                    var12.method233(var30, -23162);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field1381 == null) {
                var67 = this.field1294;
                var68 = this.field1407;
                var69 = this.field1385;
                var70 = this.field1348;
            } else {
                var69 = this.field1381.field5049;
                var67 = this.field1381.field5053;
                var68 = this.field1381.field5054;
                var70 = this.field1381.field5057;
            }
            float var71 = 3.0F / (float) this.field1332;
            var12.field469 = var10;
            float var72 = 3.0F / (float) (this.field1332 / 2 + this.field1332);
            if (this.field1337.field8682) {
                for (int var76 = 0; var76 < this.field1374; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2597((byte) 46, (float) var70[var76] * var72);
                        var12.method2597((byte) 46, (float) var68[var76] * var72);
                        var12.method2597((byte) 46, (float) var67[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2597((byte) 46, (float) var70[var76] * var78);
                        var12.method2597((byte) 46, (float) var68[var76] * var78);
                        var12.method2597((byte) 46, (float) var67[var76] * var78);
                    }
                    var12.field469 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field1374; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2596(110, (float) var70[var73] * var72);
                        var12.method2596(88, (float) var68[var73] * var72);
                        var12.method2596(122, (float) var67[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2596(100, (float) var70[var73] * var75);
                        var12.method2596(74, (float) var68[var73] * var75);
                        var12.method2596(102, (float) var67[var73] * var75);
                    }
                    var12.field469 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field469 = var11;
            if (this.field1337.field8682) {
                for (int var80 = 0; var80 < this.field1374; var80++) {
                    var12.method2597((byte) 46, this.field1355[var80]);
                    var12.method2597((byte) 46, this.field1310[var80]);
                    var12.field469 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field1374; var79++) {
                    var12.method2596(118, this.field1355[var79]);
                    var12.method2596(90, this.field1310[var79]);
                    var12.field469 += var7 - 8;
                }
            }
        }
        var12.field469 = this.field1374 * var7;
        class635 var81;
        if (arg0) {
            if (this.field1366 == null) {
                this.field1366 = this.field1337.method3418(true, var12.field483, -2, var7, var12.field469);
            } else {
                this.field1366.method2161(var7, var12.field469, (byte) -114, var12.field483);
            }
            this.field1301 = 0;
            var81 = this.field1366;
        } else {
            var81 = this.field1337.method3418(false, var12.field483, -2, var7, var12.field469);
            this.field1379 = true;
        }
        if (var5) {
            this.field1313.field5286 = var8;
            this.field1313.field5288 = var81;
        }
        if (var6) {
            this.field1397.field5288 = var81;
            this.field1397.field5286 = var11;
        }
        if (var3) {
            this.field1335.field5286 = var9;
            this.field1335.field5288 = var81;
        }
        if (var4) {
            this.field1317.field5288 = var81;
            this.field1317.field5286 = var10;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IJIIFILww;FII)S", line = 4899)
    private final short method748(int arg0, long arg1, int arg2, int arg3, float arg4, int arg5, class729 arg6, float arg7, int arg8, int arg9) {
        if (arg5 != 3) {
            return -80;
        }
        field1402++;
        int var12 = this.field1370[arg9];
        int var13 = this.field1370[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field1406[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class305.field4302[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field1406[var14] = (short) (this.field1374 + 1);
        class305.field4302[var14] = arg1;
        this.field1348[this.field1374] = (short) arg2;
        this.field1407[this.field1374] = (short) arg3;
        this.field1294[this.field1374] = (short) arg8;
        this.field1385[this.field1374] = (byte) arg0;
        this.field1355[this.field1374] = arg4;
        this.field1310[this.field1374] = arg7;
        return (short) (this.field1374++);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIBZLkd;)Z", line = 4945)
    private final boolean method749(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, class280 arg6) {
        field1323++;
        class724 var8 = (class724) arg6;
        class724 var9 = this.field1337.field8576;
        float var10 = var8.field10135 * var9.field10126 + var8.field10133 * var9.field10116 + var8.field10128 * var9.field10125 + var9.field10133;
        float var11 = var8.field10135 * var9.field10137 + var8.field10133 * var9.field10131 + var8.field10128 * var9.field10119 + var9.field10128;
        class228.field3258 = var8.field10107 * var9.field10107 + var8.field10137 * var9.field10120 + var8.field10126 * var9.field10114;
        class250.field3524 = var8.field10120 * var9.field10137 + var8.field10125 * var9.field10131 + var8.field10119 * var9.field10119;
        class253.field3632 = var8.field10114 * var9.field10107 + var8.field10131 * var9.field10120 + var8.field10116 * var9.field10114;
        class314.field4435 = var8.field10114 * var9.field10137 + var8.field10131 * var9.field10119 + var8.field10116 * var9.field10131;
        class439.field6127 = var8.field10107 * var9.field10137 + var8.field10137 * var9.field10119 + var8.field10126 * var9.field10131;
        class265.field3859 = var8.field10120 * var9.field10126 + var8.field10125 * var9.field10116 + var8.field10119 * var9.field10125;
        class399.field5580 = var8.field10107 * var9.field10126 + var8.field10137 * var9.field10125 + var8.field10126 * var9.field10116;
        float var12 = var8.field10135 * var9.field10107 + var8.field10133 * var9.field10114 + var8.field10128 * var9.field10120 + var9.field10135;
        class656.field9233 = var8.field10114 * var9.field10126 + var8.field10131 * var9.field10125 + var8.field10116 * var9.field10116;
        class223.field3185 = var8.field10120 * var9.field10107 + var8.field10125 * var9.field10114 + var8.field10119 * var9.field10120;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field1337.field8679;
        int var19 = this.field1337.field8605;
        if (!this.field1328) {
            this.method750((byte) -111);
        }
        int var20 = this.field1325 - this.field1401 >> 1;
        int var21 = this.field1308 - this.field1312 >> 1;
        int var22 = this.field1340 - this.field1343 >> 1;
        int var23 = this.field1401 + var20;
        int var24 = this.field1312 + var21;
        int var25 = this.field1343 + var22;
        int var26 = var23 - (var20 << arg0);
        int var27 = var24 - (var21 << arg0);
        int var28 = var25 - (var22 << arg0);
        int var29 = (var20 << arg0) + var23;
        int var30 = -26 / ((arg4 - 1) / 40);
        int var31 = (var21 << arg0) + var24;
        class687.field9693[0] = var26;
        int var32 = (var22 << arg0) + var25;
        class559.field7949[0] = var27;
        class322.field4584[0] = var28;
        class687.field9693[1] = var29;
        class559.field7949[1] = var27;
        class322.field4584[1] = var28;
        class687.field9693[2] = var26;
        class559.field7949[2] = var31;
        class687.field9693[3] = var29;
        class322.field4584[2] = var28;
        class559.field7949[3] = var31;
        class322.field4584[3] = var28;
        class687.field9693[4] = var26;
        class559.field7949[4] = var27;
        class687.field9693[5] = var29;
        class322.field4584[4] = var32;
        class559.field7949[5] = var27;
        class687.field9693[6] = var26;
        class322.field4584[5] = var32;
        class559.field7949[6] = var31;
        class322.field4584[6] = var32;
        class687.field9693[7] = var29;
        class559.field7949[7] = var31;
        class322.field4584[7] = var32;
        for (int var33 = 0; var33 < 8; var33++) {
            float var54 = (float) class322.field4584[var33];
            float var55 = (float) class687.field9693[var33];
            float var56 = (float) class559.field7949[var33];
            float var57 = class399.field5580 * var54 + class656.field9233 * var55 + class265.field3859 * var56 + var10;
            float var58 = class228.field3258 * var54 + class253.field3632 * var55 + class223.field3185 * var56 + var12;
            float var59 = class439.field6127 * var54 + class314.field4435 * var55 + class250.field3524 * var56 + var11;
            if ((float) this.field1337.field8653 <= var58) {
                if (arg3 > 0) {
                    var58 = arg3;
                }
                float var60 = (float) var18 * var57 / var58 + (float) this.field1337.field8678;
                if (var14 > var60) {
                    var14 = var60;
                }
                if (var60 > var15) {
                    var15 = var60;
                }
                float var61 = (float) var19 * var59 / var58 + (float) this.field1337.field8583;
                if (var16 > var61) {
                    var16 = var61;
                }
                if (var17 < var61) {
                    var17 = var61;
                }
                var13 = true;
            }
        }
        if (var13 && var14 < (float) arg1 && (float) arg1 < var15 && (float) arg2 > var16 && var17 > (float) arg2) {
            if (arg5) {
                return true;
            }
            if (this.field1374 > this.field1337.field8691.length) {
                this.field1337.field8691 = new int[this.field1374];
                this.field1337.field8695 = new int[this.field1374];
            }
            int[] var34 = this.field1337.field8691;
            int[] var35 = this.field1337.field8695;
            for (int var36 = 0; var36 < this.field1350; var36++) {
                float var38 = (float) this.field1306[var36];
                float var39 = (float) this.field1291[var36];
                float var40 = (float) this.field1380[var36];
                float var41 = class228.field3258 * var39 + class253.field3632 * var40 + class223.field3185 * var38 + var12;
                float var42 = class439.field6127 * var39 + class314.field4435 * var40 + class250.field3524 * var38 + var11;
                float var43 = class399.field5580 * var39 + class656.field9233 * var40 + class265.field3859 * var38 + var10;
                if ((float) this.field1337.field8653 <= var41) {
                    if (arg3 > 0) {
                        var41 = arg3;
                    }
                    int var44 = (int) ((float) var18 * var43 / var41 + (float) this.field1337.field8678);
                    int var45 = (int) ((float) var19 * var42 / var41 + (float) this.field1337.field8583);
                    int var46 = this.field1370[var36];
                    int var47 = this.field1370[var36 + 1];
                    for (int var48 = var46; var48 < var47; var48++) {
                        int var49 = this.field1406[var48] - 1;
                        if (var49 == -1) {
                            break;
                        }
                        var34[var49] = var44;
                        var35[var49] = var45;
                    }
                } else {
                    int var50 = this.field1370[var36];
                    int var51 = this.field1370[var36 + 1];
                    for (int var52 = var50; var52 < var51; var52++) {
                        int var53 = this.field1406[var52] - 1;
                        if (var53 == -1) {
                            break;
                        }
                        var34[this.field1406[var52] - 1] = -999999;
                    }
                }
            }
            for (int var37 = 0; var37 < this.field1339; var37++) {
                if (var34[this.field1394[var37]] != -999999 && var34[this.field1318[var37]] != -999999 && var34[this.field1372[var37]] != -999999 && this.method745(arg1, var34[this.field1394[var37]], var34[this.field1318[var37]], var35[this.field1318[var37]], var35[this.field1394[var37]], arg2, var35[this.field1372[var37]], var34[this.field1372[var37]], -18437)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "(I)V", line = 5187)
    public final void method319(int arg0) {
        field1373++;
        int var2 = class316.field4487[arg0];
        int var3 = class316.field4490[arg0];
        for (int var4 = 0; var4 < this.field1350; var4++) {
            int var7 = this.field1380[var4] * var3 + this.field1291[var4] * var2 >> 14;
            this.field1291[var4] = this.field1291[var4] * var3 - (this.field1380[var4] * var2) >> 14;
            this.field1380[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1374; var5++) {
            int var6 = this.field1348[var5] * var3 + this.field1294[var5] * var2 >> 14;
            this.field1294[var5] = (short) (this.field1294[var5] * var3 - (this.field1348[var5] * var2) >> 14);
            this.field1348[var5] = (short) var6;
        }
        if (this.field1317 == null && this.field1335 != null) {
            this.field1335.field5288 = null;
        }
        if (this.field1317 != null) {
            this.field1317.field5288 = null;
        }
        this.field1328 = false;
        if (this.field1313 != null) {
            this.field1313.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "()Z", line = 5241)
    public final boolean method341() {
        field1364++;
        if (this.field1299 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1299.length; var1++) {
            if (this.field1299[var1] != -1 && !this.field1337.field1084.method1152(this.field1299[var1], -103)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V", line = 5263)
    private final void method750(byte arg0) {
        field1333++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1350; var10++) {
            int var11 = this.field1380[var10];
            int var12 = this.field1306[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            int var13 = this.field1291[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + (var13 * var13) + (var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field1401 = (short) var2;
        this.field1343 = (short) var4;
        this.field1312 = (short) var3;
        this.field1325 = (short) var5;
        if (arg0 != -111) {
            this.field1338 = null;
        }
        this.field1340 = (short) var7;
        this.field1308 = (short) var6;
        this.field1399 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field1334 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field1328 = true;
    }

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "(I)V", line = 5345)
    public final void method333(int arg0) {
        this.field1408 = (short) arg0;
        field1324++;
        if (this.field1335 != null) {
            this.field1335.field5288 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lka;IIIZ)V", line = 5369)
    public final void method345(class469 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1368++;
        class74 var6 = (class74) arg0;
        if (this.field1339 == 0 || var6.field1339 == 0) {
            return;
        }
        int var7 = var6.field1350;
        int[] var8 = var6.field1380;
        int[] var9 = var6.field1306;
        int[] var10 = var6.field1291;
        short[] var11 = var6.field1348;
        short[] var12 = var6.field1407;
        short[] var13 = var6.field1294;
        byte[] var14 = var6.field1385;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field1381 == null) {
            var16 = null;
            var18 = null;
            var17 = null;
            var15 = null;
        } else {
            var15 = this.field1381.field5054;
            var16 = this.field1381.field5049;
            var17 = this.field1381.field5057;
            var18 = this.field1381.field5053;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field1381 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field1381.field5057;
            var21 = var6.field1381.field5053;
            var22 = var6.field1381.field5049;
            var19 = var6.field1381.field5054;
        }
        int[] var23 = var6.field1370;
        short[] var24 = var6.field1406;
        if (!var6.field1328) {
            var6.method750((byte) -111);
        }
        short var25 = var6.field1312;
        short var26 = var6.field1308;
        short var27 = var6.field1401;
        short var28 = var6.field1325;
        short var29 = var6.field1343;
        short var30 = var6.field1340;
        for (int var31 = 0; var31 < this.field1350; var31++) {
            int var32 = this.field1306[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1380[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field1291[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field1370[var31];
                        int var37 = this.field1370[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1406[var38] - 1;
                            if (var35 == -1 || this.field1385[var35] != 0) {
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
                                            this.field1381 = new class360();
                                            var17 = this.field1381.field5057 = class32.method216(this.field1348, false);
                                            var15 = this.field1381.field5054 = class32.method216(this.field1407, false);
                                            var18 = this.field1381.field5053 = class32.method216(this.field1294, false);
                                            var16 = this.field1381.field5049 = class241.method1621(true, this.field1385);
                                        }
                                        if (var20 == null) {
                                            class360 var44 = var6.field1381 = new class360();
                                            var20 = var44.field5057 = class32.method216(var11, false);
                                            var19 = var44.field5054 = class32.method216(var12, false);
                                            var21 = var44.field5053 = class32.method216(var13, false);
                                            var22 = var44.field5049 = class241.method1621(true, var14);
                                        }
                                        short var45 = this.field1348[var35];
                                        short var46 = this.field1407[var35];
                                        short var47 = this.field1294[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field1385[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field1370[var31];
                                        short var54 = var13[var40];
                                        byte var55 = var14[var40];
                                        short var56 = var11[var40];
                                        short var57 = var12[var40];
                                        int var58 = this.field1370[var31 + 1];
                                        for (int var59 = var53; var59 < var58; var59++) {
                                            int var60 = this.field1406[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var17[var60] += var56;
                                                var15[var60] += var57;
                                                var18[var60] += var54;
                                                var16[var60] += var55;
                                            }
                                        }
                                        if (this.field1317 == null && this.field1335 != null) {
                                            this.field1335.field5288 = null;
                                        }
                                        if (this.field1317 != null) {
                                            this.field1317.field5288 = null;
                                        }
                                        if (var6.field1317 == null && var6.field1335 != null) {
                                            var6.field1335.field5288 = null;
                                        }
                                        if (var6.field1317 != null) {
                                            var6.field1317.field5288 = null;
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

    @OriginalMember(owner = "client!gea", name = "NA", descriptor = "()Z", line = 5641)
    public final boolean method357() {
        field1326++;
        if (this.field1311 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1307; var1++) {
            this.field1380[var1] <<= 0x4;
            this.field1306[var1] <<= 0x4;
            this.field1291[var1] <<= 0x4;
        }
        class399.field5584 = 0;
        class515.field7331 = 0;
        class735.field10352 = 0;
        return true;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIII)V", line = 5669)
    public final void method321(int arg0, int arg1, int arg2, int arg3) {
        field1376++;
        for (int var5 = 0; var5 < this.field1339; var5++) {
            int var9 = this.field1297[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field1297[var5] = (short) class164.method1221(var12, class164.method1221(var10 << 10, var11 << 7));
        }
        if (this.field1354 != null) {
            for (int var6 = 0; var6 < this.field1358; var6++) {
                class79 var7 = this.field1354[var6];
                class606 var8 = this.field1390[var6];
                var8.field8799 = var8.field8799 & 0xFF000000 | class412.field5695[this.field1297[var7.field1474] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1335 != null) {
            this.field1335.field5288 = null;
        }
    }
}

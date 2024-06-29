import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class89 extends class499 {

    @OriginalMember(owner = "client!haa", name = "Nb", descriptor = "[I")
    private int[] field1308;

    @OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client!haa", name = "r", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!haa", name = "rc", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!haa", name = "Pc", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!haa", name = "Nc", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!haa", name = "X", descriptor = "[S")
    private short[] field1266;

    @OriginalMember(owner = "client!haa", name = "hb", descriptor = "[I")
    private int[] field1276;

    @OriginalMember(owner = "client!haa", name = "rb", descriptor = "[I")
    private int[] field1286;

    @OriginalMember(owner = "client!haa", name = "L", descriptor = "[I")
    private int[] field1254;

    @OriginalMember(owner = "client!haa", name = "G", descriptor = "[Loea;")
    private class624[] field1249;

    @OriginalMember(owner = "client!haa", name = "pc", descriptor = "[Lqr;")
    private class72[] field1336;

    @OriginalMember(owner = "client!haa", name = "Hc", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!haa", name = "Ec", descriptor = "[Lgja;")
    private class54[] field1351;

    @OriginalMember(owner = "client!haa", name = "kc", descriptor = "[Lfs;")
    private class582[] field1331;

    @OriginalMember(owner = "client!haa", name = "pb", descriptor = "[S")
    private short[] field1284;

    @OriginalMember(owner = "client!haa", name = "gc", descriptor = "[S")
    private short[] field1327;

    @OriginalMember(owner = "client!haa", name = "Sb", descriptor = "[S")
    private short[] field1313;

    @OriginalMember(owner = "client!haa", name = "ob", descriptor = "[S")
    private short[] field1283;

    @OriginalMember(owner = "client!haa", name = "vc", descriptor = "[F")
    private float[] field1342;

    @OriginalMember(owner = "client!haa", name = "H", descriptor = "[S")
    private short[] field1250;

    @OriginalMember(owner = "client!haa", name = "qb", descriptor = "[S")
    private short[] field1285;

    @OriginalMember(owner = "client!haa", name = "nc", descriptor = "[B")
    private byte[] field1334;

    @OriginalMember(owner = "client!haa", name = "Pb", descriptor = "[S")
    private short[] field1310;

    @OriginalMember(owner = "client!haa", name = "nb", descriptor = "[B")
    private byte[] field1282;

    @OriginalMember(owner = "client!haa", name = "mc", descriptor = "[S")
    private short[] field1333;

    @OriginalMember(owner = "client!haa", name = "tb", descriptor = "S")
    private short field1288;

    @OriginalMember(owner = "client!haa", name = "S", descriptor = "[S")
    private short[] field1261;

    @OriginalMember(owner = "client!haa", name = "Ib", descriptor = "[F")
    private float[] field1303;

    @OriginalMember(owner = "client!haa", name = "Ub", descriptor = "[S")
    private short[] field1315;

    @OriginalMember(owner = "client!haa", name = "Vb", descriptor = "[S")
    private short[] field1316;

    @OriginalMember(owner = "client!haa", name = "Fc", descriptor = "[S")
    private short[] field1352;

    @OriginalMember(owner = "client!haa", name = "wb", descriptor = "S")
    private short field1291;

    @OriginalMember(owner = "client!haa", name = "gb", descriptor = "[I")
    private int[] field1275;

    @OriginalMember(owner = "client!haa", name = "M", descriptor = "[I")
    private int[] field1255;

    @OriginalMember(owner = "client!haa", name = "bb", descriptor = "[I")
    private int[] field1270;

    @OriginalMember(owner = "client!haa", name = "db", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!haa", name = "T", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "[[I")
    private int[][] field1257;

    @OriginalMember(owner = "client!haa", name = "Q", descriptor = "[[I")
    private int[][] field1259;

    @OriginalMember(owner = "client!haa", name = "x", descriptor = "[[I")
    private int[][] field1240;

    @OriginalMember(owner = "client!haa", name = "cb", descriptor = "Z")
    private boolean field1271;

    @OriginalMember(owner = "client!haa", name = "Qb", descriptor = "Z")
    private boolean field1311;

    @OriginalMember(owner = "client!haa", name = "A", descriptor = "Z")
    private boolean field1243;

    @OriginalMember(owner = "client!haa", name = "F", descriptor = "Z")
    private boolean field1248;

    @OriginalMember(owner = "client!haa", name = "qc", descriptor = "Z")
    private boolean field1337;

    @OriginalMember(owner = "client!haa", name = "Dc", descriptor = "Lsf;")
    private class551 field1350;

    @OriginalMember(owner = "client!haa", name = "Yb", descriptor = "Ldk;")
    private class538 field1319;

    @OriginalMember(owner = "client!haa", name = "ec", descriptor = "Ldk;")
    private class538 field1325;

    @OriginalMember(owner = "client!haa", name = "y", descriptor = "Ldk;")
    private class538 field1241;

    @OriginalMember(owner = "client!haa", name = "Wb", descriptor = "Ldk;")
    private class538 field1317;

    @OriginalMember(owner = "client!haa", name = "t", descriptor = "Lvb;")
    private class209 field1236;

    @OriginalMember(owner = "client!haa", name = "sb", descriptor = "[S")
    public static short[] field1287 = new short[256];

    @OriginalMember(owner = "client!haa", name = "s", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!haa", name = "u", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!haa", name = "v", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!haa", name = "w", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!haa", name = "C", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!haa", name = "D", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!haa", name = "E", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!haa", name = "K", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!haa", name = "N", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!haa", name = "R", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!haa", name = "U", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!haa", name = "V", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!haa", name = "W", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!haa", name = "Y", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!haa", name = "Z", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!haa", name = "ab", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!haa", name = "eb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!haa", name = "fb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!haa", name = "jb", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!haa", name = "kb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!haa", name = "lb", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!haa", name = "mb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!haa", name = "ub", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!haa", name = "vb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!haa", name = "xb", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!haa", name = "yb", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!haa", name = "zb", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!haa", name = "Ab", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client!haa", name = "Bb", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!haa", name = "Cb", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!haa", name = "Db", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!haa", name = "Eb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!haa", name = "Fb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!haa", name = "Gb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!haa", name = "Hb", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!haa", name = "Jb", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!haa", name = "Kb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!haa", name = "Lb", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!haa", name = "Mb", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!haa", name = "Ob", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!haa", name = "Rb", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!haa", name = "Tb", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!haa", name = "Xb", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!haa", name = "Zb", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!haa", name = "ac", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!haa", name = "bc", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!haa", name = "cc", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!haa", name = "dc", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!haa", name = "fc", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!haa", name = "hc", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!haa", name = "ic", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!haa", name = "jc", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!haa", name = "lc", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!haa", name = "oc", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!haa", name = "sc", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!haa", name = "tc", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!haa", name = "uc", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!haa", name = "wc", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!haa", name = "xc", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client!haa", name = "yc", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!haa", name = "zc", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!haa", name = "Ac", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!haa", name = "Bc", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!haa", name = "Cc", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!haa", name = "Gc", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!haa", name = "Ic", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!haa", name = "Jc", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!haa", name = "Kc", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!haa", name = "Lc", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!haa", name = "Mc", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!haa", name = "Oc", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!haa", name = "ib", descriptor = "Llv;")
    public static class470 field1277;

    @OriginalMember(owner = "client!haa", name = "B", descriptor = "Liba;")
    private class557 field1244;

    // $FF: synthetic field
    @OriginalMember(owner = "client!haa", name = "Qc", descriptor = "Ljava/lang/Class;")
    public static Class field1363;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method281(class499 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1278++;
        class89 var6 = (class89) arg0;
        if (this.field1252 == 0 || var6.field1252 == 0) {
            return;
        }
        int var7 = var6.field1362;
        int[] var8 = var6.field1276;
        int[] var9 = var6.field1286;
        int[] var10 = var6.field1254;
        short[] var11 = var6.field1310;
        short[] var12 = var6.field1261;
        short[] var13 = var6.field1313;
        byte[] var14 = var6.field1334;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field1244 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1244.field7854;
            var18 = this.field1244.field7856;
            var16 = this.field1244.field7859;
            var17 = this.field1244.field7855;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1244 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field1244.field7859;
            var19 = var6.field1244.field7855;
            var20 = var6.field1244.field7856;
            var21 = var6.field1244.field7854;
        }
        int[] var23 = var6.field1308;
        short[] var24 = var6.field1285;
        if (!var6.field1248) {
            var6.method724(true);
        }
        int var25 = var6.field1267;
        int var26 = var6.field1344;
        int var27 = var6.field1359;
        int var28 = var6.field1357;
        int var29 = var6.field1293;
        int var30 = var6.field1295;
        for (int var31 = 0; var31 < this.field1362; var31++) {
            int var32 = this.field1286[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field1276[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field1254[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1308[var31];
                        int var37 = this.field1308[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1285[var38] - 1;
                            if (var35 == -1 || this.field1334[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var18 == null) {
                                            this.field1244 = new class557();
                                            var18 = this.field1244.field7856 = class148.method1183(-116, this.field1310);
                                            var16 = this.field1244.field7859 = class148.method1183(51, this.field1261);
                                            var15 = this.field1244.field7854 = class148.method1183(-75, this.field1313);
                                            var17 = this.field1244.field7855 = class23.method157(106, this.field1334);
                                        }
                                        if (var20 == null) {
                                            class557 var44 = var6.field1244 = new class557();
                                            var20 = var44.field7856 = class148.method1183(68, var11);
                                            var22 = var44.field7859 = class148.method1183(54, var12);
                                            var21 = var44.field7854 = class148.method1183(82, var13);
                                            var19 = var44.field7855 = class23.method157(110, var14);
                                        }
                                        short var45 = this.field1310[var35];
                                        short var46 = this.field1261[var35];
                                        short var47 = this.field1313[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field1334[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var22[var52] += var46;
                                                var21[var52] += var47;
                                                var19[var52] += var49;
                                            }
                                        }
                                        short var53 = var13[var40];
                                        byte var54 = var14[var40];
                                        int var55 = this.field1308[var31];
                                        short var56 = var11[var40];
                                        int var57 = this.field1308[var31 + 1];
                                        short var58 = var12[var40];
                                        for (int var59 = var55; var59 < var57; var59++) {
                                            int var60 = this.field1285[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var18[var60] += var56;
                                                var16[var60] += var58;
                                                var15[var60] += var53;
                                                var17[var60] += var54;
                                            }
                                        }
                                        var6.method720(-17106);
                                        this.method720(-17106);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "wa", descriptor = "()V")
    public final void method284() {
        field1265++;
        for (int var1 = 0; var1 < this.field1360; var1++) {
            this.field1276[var1] = this.field1276[var1] + 7 >> 4;
            this.field1286[var1] = this.field1286[var1] + 7 >> 4;
            this.field1254[var1] = this.field1254[var1] + 7 >> 4;
        }
        this.method717(-64);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "aa", descriptor = "(SS)V")
    public final void method307(short arg0, short arg1) {
        field1304++;
        class162 var3 = this.field1350.field970;
        for (int var4 = 0; var4 < this.field1252; var4++) {
            if (this.field1284[var4] == arg0) {
                this.field1284[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class311 var7 = var3.method1270(arg0 & 0xFFFF, true);
            var5 = var7.field4241;
            var6 = var7.field4236;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class311 var10 = var3.method1270(arg1 & 0xFFFF, true);
            if (var10.field4251 != 0 || var10.field4243 != 0) {
                this.field1311 = true;
            }
            var9 = var10.field4236;
            var8 = var10.field4241;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field1331 != null) {
            for (int var11 = 0; var11 < this.field1354; var11++) {
                class582 var12 = this.field1331[var11];
                class54 var13 = this.field1351[var11];
                var13.field778 = var13.field778 & 0xFF000000 | class424.field5802[this.field1250[var12.field8239] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method728(2);
    }

    @OriginalMember(owner = "client!haa", name = "s", descriptor = "(I)V")
    public final void method303(int arg0) {
        field1330++;
        if (this.field1319 != null) {
            this.field1319.field7314 = class614.method3479(this.field1262, -103, arg0);
        }
        if (this.field1325 != null) {
            this.field1325.field7314 = class776.method4259(arg0, this.field1262, -127);
        }
        if (this.field1241 != null) {
            this.field1241.field7314 = class104.method895(arg0, this.field1262, 0);
        }
        if (this.field1317 != null) {
            this.field1317.field7314 = class504.method2880(this.field1262, arg0, false);
        }
        this.field1338 = arg0;
        this.field1243 = true;
        if (this.field1244 != null && (this.field1338 & 0x10000) == 0) {
            this.field1261 = this.field1244.field7859;
            this.field1310 = this.field1244.field7856;
            this.field1313 = this.field1244.field7854;
            this.field1334 = this.field1244.field7855;
            this.field1244 = null;
        }
        this.method725(8192);
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V")
    private final void method711(int arg0) {
        field1260++;
        if (this.field1331 != null) {
            this.field1350.method557(!this.field1271);
            this.field1350.method3128((byte) 98, false);
            this.field1350.method3143(class633.field8767, true, 1);
            this.field1350.method3168((byte) 123, 1, class633.field8767);
            for (int var2 = 0; var2 < this.field1354; var2++) {
                class582 var3 = this.field1331[var2];
                class54 var4 = this.field1351[var2];
                if (!var3.field8228 || !this.field1350.method577()) {
                    float var5 = (float) (this.field1276[var3.field8241] - (-this.field1276[var3.field8238] - this.field1276[var3.field8231])) * 0.3333333F;
                    float var6 = (float) (this.field1286[var3.field8241] + this.field1286[var3.field8238] + this.field1286[var3.field8231]) * 0.3333333F;
                    float var7 = (float) (this.field1254[var3.field8241] + this.field1254[var3.field8238] + this.field1254[var3.field8231]) * 0.3333333F;
                    float var8 = class699.field9644 * var7 + class405.field5580 * var5 + class254.field3578 * var6 + class695.field9620;
                    float var9 = class222.field3247 * var7 + class9.field166 * var6 + class603.field8441 * var5 + class403.field5539;
                    float var10 = class536.field7287 * var7 + class611.field8530 * var5 + class369.field4992 * var6 + class68.field997;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9))) * (float) var3.field8232;
                    class421 var12 = this.field1350.method3096(false);
                    var12.method2482(var3.field8229 * var4.field775 >> 7, 25170, (float) var4.field774 + var8 - var8 * var11, var4.field777, var10 - (var10 * var11), var3.field8235 * var4.field772 >> 7, (float) var4.field780 + var9 - var9 * var11);
                    var12.method2478(this.field1350.field7671, false);
                    this.field1350.method3126(38);
                    int var13 = var4.field778;
                    this.field1350.method3131(var3.field8243, 0, false, false);
                    this.field1350.method3117(var3.field8233, true);
                    this.field1350.method3130((byte) -110, var13);
                    this.field1350.method3123(-14626);
                }
            }
            this.field1350.method3168((byte) 40, 1, class606.field8459);
            this.field1350.method3143(class606.field8459, true, 1);
            this.field1350.method557(true);
        }
        if (arg0 <= 16) {
            this.method312(null);
        }
    }

    @OriginalMember(owner = "client!haa", name = "HA", descriptor = "()I")
    public final int method283() {
        if (!this.field1248) {
            this.method724(true);
        }
        field1294++;
        return this.field1293;
    }

    @OriginalMember(owner = "client!haa", name = "na", descriptor = "()I")
    public final int method296() {
        field1358++;
        if (!this.field1248) {
            this.method724(true);
        }
        return this.field1347;
    }

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "()[Loea;")
    public final class624[] method311() {
        field1280++;
        return this.field1249;
    }

    @OriginalMember(owner = "client!haa", name = "V", descriptor = "()I")
    public final int method315() {
        field1273++;
        if (!this.field1248) {
            this.method724(true);
        }
        return this.field1359;
    }

    @OriginalMember(owner = "client!haa", name = "C", descriptor = "(I)V")
    public final void method285(int arg0) {
        this.field1291 = (short) arg0;
        field1242++;
        this.method728(2);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILsk;ZII)Z")
    public final boolean method286(int arg0, int arg1, class650 arg2, boolean arg3, int arg4, int arg5) {
        field1298++;
        return this.method726(arg3, arg0, arg4, arg5, arg1, arg2, -4);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lip;I)V")
    private final void method712(class736 arg0, int arg1) {
        field1332++;
        if (class700.field9650.length < this.field1272) {
            class700.field9650 = new int[this.field1272];
            class410.field5614 = new int[this.field1272];
        }
        int var3 = 0;
        if (arg1 != -9824) {
            return;
        }
        while (var3 < this.field1362) {
            int var14 = (this.field1276[var3] - (this.field1286[var3] * this.field1350.field7688 >> 8) >> this.field1350.field7706) - arg0.field10164;
            int var15 = (this.field1254[var3] - (this.field1286[var3] * this.field1350.field7749 >> 8) >> this.field1350.field7706) - arg0.field10162;
            int var16 = this.field1308[var3];
            int var17 = this.field1308[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field1285[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class700.field9650[var19] = var14;
                class410.field5614[var19] = var15;
            }
            var3++;
        }
        for (int var4 = 0; var4 < this.field1234; var4++) {
            if (this.field1282 == null || this.field1282[var4] <= 128) {
                short var5 = this.field1327[var4];
                short var6 = this.field1283[var4];
                short var7 = this.field1316[var4];
                int var8 = class700.field9650[var5];
                int var9 = class700.field9650[var6];
                int var10 = class700.field9650[var7];
                int var11 = class410.field5614[var5];
                int var12 = class410.field5614[var6];
                int var13 = class410.field5614[var7];
                if ((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11)) > 0) {
                    arg0.method4082(var10, (byte) 125, var8, var13, var11, var12, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "()V")
    public final void method328() {
        field1289++;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIZ)Lka;")
    public final class499 method324(byte arg0, int arg1, boolean arg2) {
        field1247++;
        class89 var4;
        class89 var5;
        if (arg0 == 1) {
            var5 = this.field1350.field7795;
            var4 = this.field1350.field7794;
        } else if (arg0 == 2) {
            var4 = this.field1350.field7778;
            var5 = this.field1350.field7790;
        } else if (arg0 == 3) {
            var4 = this.field1350.field7784;
            var5 = this.field1350.field7796;
        } else if (arg0 == 4) {
            var5 = this.field1350.field7782;
            var4 = this.field1350.field7785;
        } else if (arg0 == 5) {
            var5 = this.field1350.field7783;
            var4 = this.field1350.field7787;
        } else {
            var5 = var4 = new class89(this.field1350, 0, 0, true, false);
        }
        return this.method715((byte) 58, arg2, arg1, var4, var5, arg0 != 0);
    }

    @OriginalMember(owner = "client!haa", name = "ma", descriptor = "()I")
    public final int method298() {
        field1320++;
        if (!this.field1248) {
            this.method724(true);
        }
        return this.field1340;
    }

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "(IIII)V")
    public final void method317(int arg0, int arg1, int arg2, int arg3) {
        field1245++;
        if (arg0 == 0) {
            int var5 = 0;
            class55.field786 = 0;
            class169.field2711 = 0;
            class146.field2453 = 0;
            for (int var6 = 0; var6 < this.field1362; var6++) {
                class146.field2453 += this.field1276[var6];
                class169.field2711 += this.field1286[var6];
                class55.field786 += this.field1254[var6];
                var5++;
            }
            if (var5 <= 0) {
                class55.field786 = arg3;
                class169.field2711 = arg2;
                class146.field2453 = arg1;
            } else {
                class146.field2453 = class146.field2453 / var5 + arg1;
                class169.field2711 = class169.field2711 / var5 + arg2;
                class55.field786 = class55.field786 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1362; var7++) {
                this.field1276[var7] += arg1;
                this.field1286[var7] += arg2;
                this.field1254[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1362; var8++) {
                this.field1276[var8] -= class146.field2453;
                this.field1286[var8] -= class169.field2711;
                this.field1254[var8] -= class55.field786;
                if (arg3 != 0) {
                    int var9 = class191.field2937[arg3];
                    int var10 = class191.field2936[arg3];
                    int var11 = this.field1286[var8] * var9 + this.field1276[var8] * var10 + 16383 >> 14;
                    this.field1286[var8] = this.field1286[var8] * var10 + 16383 - (this.field1276[var8] * var9) >> 14;
                    this.field1276[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class191.field2937[arg1];
                    int var13 = class191.field2936[arg1];
                    int var14 = this.field1286[var8] * var13 + 16383 - (this.field1254[var8] * var12) >> 14;
                    this.field1254[var8] = this.field1254[var8] * var13 + this.field1286[var8] * var12 + 16383 >> 14;
                    this.field1286[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class191.field2937[arg2];
                    int var16 = class191.field2936[arg2];
                    int var17 = this.field1276[var8] * var16 + this.field1254[var8] * var15 + 16383 >> 14;
                    this.field1254[var8] = this.field1254[var8] * var16 + 16383 - (this.field1276[var8] * var15) >> 14;
                    this.field1276[var8] = var17;
                }
                this.field1276[var8] += class146.field2453;
                this.field1286[var8] += class169.field2711;
                this.field1254[var8] += class55.field786;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1362; var18++) {
                this.field1276[var18] -= class146.field2453;
                this.field1286[var18] -= class169.field2711;
                this.field1254[var18] -= class55.field786;
                this.field1276[var18] = this.field1276[var18] * arg1 / 128;
                this.field1286[var18] = this.field1286[var18] * arg2 / 128;
                this.field1254[var18] = this.field1254[var18] * arg3 / 128;
                this.field1276[var18] += class146.field2453;
                this.field1286[var18] += class169.field2711;
                this.field1254[var18] += class55.field786;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1252; var19++) {
                int var23 = (this.field1282[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1282[var19] = (byte) var23;
            }
            if (this.field1331 != null) {
                for (int var20 = 0; var20 < this.field1354; var20++) {
                    class582 var21 = this.field1331[var20];
                    class54 var22 = this.field1351[var20];
                    var22.field778 = var22.field778 & 0xFFFFFF | 255 - (this.field1282[var21.field8239] & 0xFF) << 24;
                }
            }
            this.method728(2);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1252; var24++) {
                int var28 = this.field1250[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var29 + arg1 & 0x3F;
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
                this.field1250[var24] = (short) class530.method3011(var34, class530.method3011(var31 << 10, var33 << 7));
            }
            if (this.field1331 != null) {
                for (int var25 = 0; var25 < this.field1354; var25++) {
                    class582 var26 = this.field1331[var25];
                    class54 var27 = this.field1351[var25];
                    var27.field778 = var27.field778 & 0xFF000000 | class424.field5802[this.field1250[var26.field8239] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method728(2);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1354; var35++) {
                class54 var36 = this.field1351[var35];
                var36.field780 += arg2;
                var36.field774 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1354; var37++) {
                class54 var38 = this.field1351[var37];
                var38.field772 = var38.field772 * arg1 >> 7;
                var38.field775 = var38.field775 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1354; var39++) {
                class54 var40 = this.field1351[var39];
                var40.field777 = var40.field777 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "NA", descriptor = "()Z")
    public final boolean method277() {
        field1253++;
        if (this.field1257 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1360; var1++) {
            this.field1276[var1] <<= 0x4;
            this.field1286[var1] <<= 0x4;
            this.field1254[var1] <<= 0x4;
        }
        class146.field2453 = 0;
        class169.field2711 = 0;
        class55.field786 = 0;
        return true;
    }

    @OriginalMember(owner = "client!haa", name = "WA", descriptor = "()I")
    public final int method295() {
        field1268++;
        return this.field1291;
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "()[Lqr;")
    public final class72[] method322() {
        field1296++;
        return this.field1336;
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)[Lmb;")
    public static final class277[] method713(int arg0) {
        field1326++;
        if (arg0 != 4939) {
            method721(112);
        }
        if (class133.field2281 == null) {
            class277[] var1 = class422.method2498(class630.field8751, (byte) -21);
            class277[] var2 = new class277[var1.length];
            int var3 = 0;
            int var4 = class111.field1911.field6758.method1364((byte) 118);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class277 var9 = var1[var5];
                if ((var9.field3842 <= 0 || var9.field3842 >= 24) && var9.field3832 >= 800 && var9.field3831 >= 600 && (var4 != 2 || var9.field3832 <= 800 && var9.field3831 <= 600) && (var4 != 1 || var9.field3832 <= 1024 && var9.field3831 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class277 var11 = var2[var10];
                        if (var9.field3832 == var11.field3832 && var9.field3831 == var11.field3831) {
                            if (var11.field3842 < var9.field3842) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class133.field2281 = new class277[var3];
            class275.method1769(var2, 0, class133.field2281, 0, var3);
            int[] var6 = new int[class133.field2281.length];
            for (int var7 = 0; var7 < class133.field2281.length; var7++) {
                class277 var8 = class133.field2281[var7];
                var6[var7] = var8.field3832 * var8.field3831;
            }
            class743.method4127(class133.field2281, (byte) 73, var6);
        }
        return class133.field2281;
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
    public final void method714(int arg0) {
        if (this.field1319 != null) {
            this.field1319.method3041(-1);
        }
        if (arg0 >= -4) {
            this.method293(null, -1, false);
        }
        field1307++;
        if (this.field1325 != null) {
            this.field1325.method3041(-1);
        }
        if (this.field1241 != null) {
            this.field1241.method3041(-1);
        }
        if (this.field1317 != null) {
            this.field1317.method3041(-1);
        }
        if (this.field1236 != null) {
            this.field1236.method1468((byte) -59);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BZILhaa;Lhaa;Z)Lka;")
    private final class499 method715(byte arg0, boolean arg1, int arg2, class89 arg3, class89 arg4, boolean arg5) {
        arg4.field1338 = arg2;
        int var7 = -43 % ((arg0 + 28) / 49);
        arg4.field1362 = this.field1362;
        arg4.field1272 = this.field1272;
        arg4.field1262 = this.field1262;
        field1306++;
        arg4.field1311 = this.field1311;
        arg4.field1252 = this.field1252;
        arg4.field1360 = this.field1360;
        if ((arg2 & 0x100) == 0) {
            arg4.field1271 = this.field1271;
        } else {
            arg4.field1271 = true;
        }
        arg4.field1354 = this.field1354;
        arg4.field1288 = this.field1288;
        arg4.field1291 = this.field1291;
        arg4.field1234 = this.field1234;
        boolean var8 = class520.method2959(this.field1262, 33, arg2);
        boolean var9 = class610.method3461(21906, this.field1262, arg2);
        boolean var10 = class104.method896(12992, arg2, this.field1262);
        boolean var11 = var10 | var9 | var8;
        if (var11) {
            if (!var8) {
                arg4.field1276 = this.field1276;
            } else if (arg3.field1276 == null || this.field1360 > arg3.field1276.length) {
                arg4.field1276 = arg3.field1276 = new int[this.field1360];
            } else {
                arg4.field1276 = arg3.field1276;
            }
            if (!var9) {
                arg4.field1286 = this.field1286;
            } else if (arg3.field1286 == null || this.field1360 > arg3.field1286.length) {
                arg4.field1286 = arg3.field1286 = new int[this.field1360];
            } else {
                arg4.field1286 = arg3.field1286;
            }
            if (!var10) {
                arg4.field1254 = this.field1254;
            } else if (arg3.field1254 == null || arg3.field1254.length < this.field1360) {
                arg4.field1254 = arg3.field1254 = new int[this.field1360];
            } else {
                arg4.field1254 = arg3.field1254;
            }
            for (int var12 = 0; var12 < this.field1360; var12++) {
                if (var8) {
                    arg4.field1276[var12] = this.field1276[var12];
                }
                if (var9) {
                    arg4.field1286[var12] = this.field1286[var12];
                }
                if (var10) {
                    arg4.field1254[var12] = this.field1254[var12];
                }
            }
        } else {
            arg4.field1254 = this.field1254;
            arg4.field1276 = this.field1276;
            arg4.field1286 = this.field1286;
        }
        if (class614.method3479(this.field1262, -128, arg2)) {
            arg4.field1319 = arg3.field1319;
            arg4.field1319.field7304 = this.field1319.field7304;
            arg4.field1319.field7313 = this.field1319.field7313;
            arg4.field1319.field7314 = true;
        } else if (class454.method2622(arg2, this.field1262, (byte) -53)) {
            arg4.field1319 = this.field1319;
        } else {
            arg4.field1319 = null;
        }
        if (class586.method3370(arg2, this.field1262, (byte) 122)) {
            if (arg3.field1250 == null || arg3.field1250.length < this.field1252) {
                arg4.field1250 = arg3.field1250 = new short[this.field1252];
            } else {
                arg4.field1250 = arg3.field1250;
            }
            for (int var13 = 0; var13 < this.field1252; var13++) {
                arg4.field1250[var13] = this.field1250[var13];
            }
        } else {
            arg4.field1250 = this.field1250;
        }
        if (class584.method3360(arg2, true, this.field1262)) {
            if (arg3.field1282 == null || arg3.field1282.length < this.field1252) {
                arg4.field1282 = arg3.field1282 = new byte[this.field1252];
            } else {
                arg4.field1282 = arg3.field1282;
            }
            for (int var14 = 0; var14 < this.field1252; var14++) {
                arg4.field1282[var14] = this.field1282[var14];
            }
        } else {
            arg4.field1282 = this.field1282;
        }
        if (class104.method895(arg2, this.field1262, 0)) {
            arg4.field1241 = arg3.field1241;
            arg4.field1241.field7304 = this.field1241.field7304;
            arg4.field1241.field7313 = this.field1241.field7313;
            arg4.field1241.field7314 = true;
        } else if (class620.method3491(32720, this.field1262, arg2)) {
            arg4.field1241 = this.field1241;
        } else {
            arg4.field1241 = null;
        }
        if (class303.method1937(this.field1262, (byte) 125, arg2)) {
            if (arg3.field1310 == null || arg3.field1310.length < this.field1272) {
                int var15 = this.field1272;
                arg4.field1261 = arg3.field1261 = new short[var15];
                arg4.field1313 = arg3.field1313 = new short[var15];
                arg4.field1310 = arg3.field1310 = new short[var15];
            } else {
                arg4.field1313 = arg3.field1313;
                arg4.field1261 = arg3.field1261;
                arg4.field1310 = arg3.field1310;
            }
            if (this.field1244 == null) {
                arg4.field1244 = null;
                for (int var16 = 0; var16 < this.field1272; var16++) {
                    arg4.field1310[var16] = this.field1310[var16];
                    arg4.field1261[var16] = this.field1261[var16];
                    arg4.field1313[var16] = this.field1313[var16];
                }
            } else {
                if (arg3.field1244 == null) {
                    arg3.field1244 = new class557();
                }
                class557 var17 = arg4.field1244 = arg3.field1244;
                if (var17.field7856 == null || this.field1272 > var17.field7856.length) {
                    int var18 = this.field1272;
                    var17.field7855 = new byte[var18];
                    var17.field7856 = new short[var18];
                    var17.field7859 = new short[var18];
                    var17.field7854 = new short[var18];
                }
                for (int var19 = 0; var19 < this.field1272; var19++) {
                    arg4.field1310[var19] = this.field1310[var19];
                    arg4.field1261[var19] = this.field1261[var19];
                    arg4.field1313[var19] = this.field1313[var19];
                    var17.field7856[var19] = this.field1244.field7856[var19];
                    var17.field7859[var19] = this.field1244.field7859[var19];
                    var17.field7854[var19] = this.field1244.field7854[var19];
                    var17.field7855[var19] = this.field1244.field7855[var19];
                }
            }
            arg4.field1334 = this.field1334;
        } else {
            arg4.field1313 = this.field1313;
            arg4.field1310 = this.field1310;
            arg4.field1334 = this.field1334;
            arg4.field1244 = this.field1244;
            arg4.field1261 = this.field1261;
        }
        if (class504.method2880(this.field1262, arg2, false)) {
            arg4.field1317 = arg3.field1317;
            arg4.field1317.field7313 = this.field1317.field7313;
            arg4.field1317.field7314 = true;
            arg4.field1317.field7304 = this.field1317.field7304;
        } else if (class789.method4307((byte) -98, this.field1262, arg2)) {
            arg4.field1317 = this.field1317;
        } else {
            arg4.field1317 = null;
        }
        if (class154.method1209(this.field1262, (byte) 99, arg2)) {
            if (arg3.field1303 == null || arg3.field1303.length < this.field1252) {
                int var20 = this.field1272;
                arg4.field1303 = arg3.field1303 = new float[var20];
                arg4.field1342 = arg3.field1342 = new float[var20];
            } else {
                arg4.field1303 = arg3.field1303;
                arg4.field1342 = arg3.field1342;
            }
            for (int var21 = 0; var21 < this.field1272; var21++) {
                arg4.field1303[var21] = this.field1303[var21];
                arg4.field1342[var21] = this.field1342[var21];
            }
        } else {
            arg4.field1342 = this.field1342;
            arg4.field1303 = this.field1303;
        }
        if (class776.method4259(arg2, this.field1262, 111)) {
            arg4.field1325 = arg3.field1325;
            arg4.field1325.field7304 = this.field1325.field7304;
            arg4.field1325.field7314 = true;
            arg4.field1325.field7313 = this.field1325.field7313;
        } else if (class727.method4035(1865, arg2, this.field1262)) {
            arg4.field1325 = this.field1325;
        } else {
            arg4.field1325 = null;
        }
        if (class102.method886(false, arg2, this.field1262)) {
            if (arg3.field1327 == null || arg3.field1327.length < this.field1252) {
                int var22 = this.field1252;
                arg4.field1283 = arg3.field1283 = new short[var22];
                arg4.field1327 = arg3.field1327 = new short[var22];
                arg4.field1316 = arg3.field1316 = new short[var22];
            } else {
                arg4.field1327 = arg3.field1327;
                arg4.field1316 = arg3.field1316;
                arg4.field1283 = arg3.field1283;
            }
            for (int var23 = 0; var23 < this.field1252; var23++) {
                arg4.field1327[var23] = this.field1327[var23];
                arg4.field1283[var23] = this.field1283[var23];
                arg4.field1316[var23] = this.field1316[var23];
            }
        } else {
            arg4.field1327 = this.field1327;
            arg4.field1283 = this.field1283;
            arg4.field1316 = this.field1316;
        }
        if (class252.method1657(this.field1262, 71, arg2)) {
            arg4.field1236 = arg3.field1236;
            arg4.field1236.field3130 = this.field1236.field3130;
            arg4.field1236.field3123 = this.field1236.field3123;
            arg4.field1236.field3129 = true;
        } else if (class541.method3055(this.field1262, arg2, 122)) {
            arg4.field1236 = this.field1236;
        } else {
            arg4.field1236 = null;
        }
        if (class573.method3319(this.field1262, arg2, (byte) 112)) {
            if (arg3.field1284 == null || this.field1252 > arg3.field1284.length) {
                int var24 = this.field1252;
                arg4.field1284 = arg3.field1284 = new short[var24];
            } else {
                arg4.field1284 = arg3.field1284;
            }
            for (int var25 = 0; var25 < this.field1252; var25++) {
                arg4.field1284[var25] = this.field1284[var25];
            }
        } else {
            arg4.field1284 = this.field1284;
        }
        if (!class699.method3891(0, arg2, this.field1262)) {
            arg4.field1351 = this.field1351;
        } else if (arg3.field1351 == null || this.field1354 > arg3.field1351.length) {
            int var27 = this.field1354;
            arg4.field1351 = arg3.field1351 = new class54[var27];
            for (int var28 = 0; var28 < this.field1354; var28++) {
                arg4.field1351[var28] = this.field1351[var28].method396(-2100862536);
            }
        } else {
            arg4.field1351 = arg3.field1351;
            for (int var26 = 0; var26 < this.field1354; var26++) {
                arg4.field1351[var26].method397(-2100862536, this.field1351[var26]);
            }
        }
        arg4.field1259 = this.field1259;
        arg4.field1315 = this.field1315;
        arg4.field1255 = this.field1255;
        arg4.field1352 = this.field1352;
        arg4.field1333 = this.field1333;
        arg4.field1275 = this.field1275;
        arg4.field1240 = this.field1240;
        arg4.field1249 = this.field1249;
        arg4.field1308 = this.field1308;
        arg4.field1331 = this.field1331;
        arg4.field1266 = this.field1266;
        arg4.field1257 = this.field1257;
        arg4.field1336 = this.field1336;
        if (this.field1248) {
            arg4.field1340 = this.field1340;
            arg4.field1267 = this.field1267;
            arg4.field1359 = this.field1359;
            arg4.field1347 = this.field1347;
            arg4.field1295 = this.field1295;
            arg4.field1293 = this.field1293;
            arg4.field1248 = true;
            arg4.field1357 = this.field1357;
            arg4.field1344 = this.field1344;
        } else {
            arg4.field1248 = false;
        }
        arg4.field1285 = this.field1285;
        arg4.field1270 = this.field1270;
        return arg4;
    }

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "(I)V")
    public final void method318(int arg0) {
        field1251++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field1362; var4++) {
            int var7 = this.field1276[var4] * var3 + this.field1254[var4] * var2 >> 14;
            this.field1254[var4] = this.field1254[var4] * var3 - (this.field1276[var4] * var2) >> 14;
            this.field1276[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1272; var5++) {
            int var6 = this.field1313[var5] * var2 + this.field1310[var5] * var3 >> 14;
            this.field1313[var5] = (short) (this.field1313[var5] * var3 - (this.field1310[var5] * var2) >> 14);
            this.field1310[var5] = (short) var6;
        }
        this.method717(-59);
        this.method720(-17106);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "()V")
    public final void method294() {
        field1321++;
        if (this.field1272 > 0 && this.field1234 > 0) {
            this.method718(-23600);
            this.method722((byte) -92);
            this.method725(8192);
        }
    }

    @OriginalMember(owner = "client!haa", name = "RA", descriptor = "()I")
    public final int method291() {
        field1290++;
        if (!this.field1248) {
            this.method724(true);
        }
        return this.field1357;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
    private final void method716(byte arg0) {
        field1355++;
        if (arg0 != -18) {
            this.field1276 = null;
        }
        if (this.field1234 == 0) {
            return;
        }
        if (this.method718(-23600) && this.method722((byte) -113)) {
            this.field1350.method863(0, (byte) 45, this.field1319.field7313);
            this.field1350.method863(1, (byte) 48, this.field1241.field7313);
            this.field1350.method863(2, (byte) 78, this.field1325.field7313);
            boolean var2;
            if ((this.field1262 & 0x37) == 0) {
                this.field1350.method3128((byte) -128, false);
                var2 = false;
                this.field1350.method846((byte) -120, this.field1350.field7786);
            } else {
                this.field1350.method3128((byte) 94, true);
                var2 = true;
                this.field1350.method863(3, (byte) 106, this.field1317.field7313);
                this.field1350.method846((byte) -113, this.field1350.field7776);
            }
            for (int var3 = 0; var3 < this.field1255.length; var3++) {
                int var4 = this.field1270[var3];
                int var5 = this.field1270[var3 + 1];
                int var6 = this.field1284[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field1350.method3131(var6, 0, var2, true);
                this.field1350.method830(this.field1275[var3], this.field1236.field3130, class501.field6860, (byte) 97, var5 - var4, this.field1255[var3], var4 * 3);
            }
        }
        this.method725(8192);
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "()V")
    public final void method314() {
        field1345++;
    }

    @OriginalMember(owner = "client!haa", name = "fa", descriptor = "()I")
    public final int method276() {
        field1256++;
        if (!this.field1248) {
            this.method724(true);
        }
        return this.field1267;
    }

    @OriginalMember(owner = "client!haa", name = "F", descriptor = "()Z")
    public final boolean method327() {
        field1348++;
        return this.field1271;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lsk;IZ)V")
    public final void method293(class650 arg0, int arg1, boolean arg2) {
        field1237++;
        if (this.field1266 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field1362; var5++) {
            if ((this.field1266[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method1870(this.field1276[var5], this.field1286[var5], this.field1254[var5], var4);
                } else {
                    arg0.method1878(this.field1276[var5], this.field1286[var5], this.field1254[var5], var4);
                }
                this.field1276[var5] = var4[0];
                this.field1286[var5] = var4[1];
                this.field1254[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILsk;ZI)Z")
    public final boolean method290(int arg0, int arg1, class650 arg2, boolean arg3, int arg4) {
        field1353++;
        return this.method726(arg3, arg0, arg4, -1, arg1, arg2, -4);
    }

    @OriginalMember(owner = "client!haa", name = "H", descriptor = "(III)V")
    public final void method305(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1362; var4++) {
            if (arg0 != 0) {
                this.field1276[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1286[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1254[var4] += arg2;
            }
        }
        field1235++;
        this.method717(-56);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "FA", descriptor = "(I)V")
    public final void method316(int arg0) {
        field1309++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field1362; var4++) {
            int var5 = this.field1286[var4] * var3 - (this.field1254[var4] * var2) >> 14;
            this.field1254[var4] = this.field1286[var4] * var2 + this.field1254[var4] * var3 >> 14;
            this.field1286[var4] = var5;
        }
        this.method717(-99);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIII)V")
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1252; var5++) {
            int var9 = this.field1250[var5] & 0xFFFF;
            int var10 = (var9 & 0xFFAB) >> 10;
            int var11 = (var9 & 0x38D) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field1250[var5] = (short) class530.method3011(class530.method3011(var11 << 7, var10 << 10), var12);
        }
        field1361++;
        if (this.field1331 != null) {
            for (int var6 = 0; var6 < this.field1354; var6++) {
                class582 var7 = this.field1331[var6];
                class54 var8 = this.field1351[var6];
                var8.field778 = class424.field5802[this.field1250[var7.field8239] & 0xFFFF] & 0xFFFFFF | var8.field778 & 0xFF000000;
            }
        }
        this.method728(2);
    }

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "(I)V")
    private final void method717(int arg0) {
        field1328++;
        if (arg0 >= -33) {
            this.field1303 = null;
        }
        if (this.field1319 != null) {
            this.field1319.field7304 = false;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1238++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class169.field2711 = 0;
            class146.field2453 = 0;
            class55.field786 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1257.length) {
                    int[] var15 = this.field1257[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class146.field2453 += this.field1276[var17];
                        class169.field2711 += this.field1286[var17];
                        var12++;
                        class55.field786 += this.field1254[var17];
                    }
                }
            }
            if (var12 > 0) {
                class146.field2453 = class146.field2453 / var12 + var10;
                class55.field786 = class55.field786 / var12 + var11;
                class169.field2711 = class169.field2711 / var12 + var9;
            } else {
                class169.field2711 = var9;
                class55.field786 = var11;
                class146.field2453 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field1257.length) {
                    int[] var23 = this.field1257[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1276[var25] += var18;
                        this.field1286[var25] += var19;
                        this.field1254[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field1257.length > var45) {
                    int[] var46 = this.field1257[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1276[var48] -= class146.field2453;
                            this.field1286[var48] -= class169.field2711;
                            this.field1254[var48] -= class55.field786;
                            if (arg4 != 0) {
                                int var49 = class191.field2937[arg4];
                                int var50 = class191.field2936[arg4];
                                int var51 = this.field1286[var48] * var49 + (this.field1276[var48] * var50) + 16383 >> 14;
                                this.field1286[var48] = this.field1286[var48] * var50 + 16383 - (this.field1276[var48] * var49) >> 14;
                                this.field1276[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class191.field2937[arg2];
                                int var53 = class191.field2936[arg2];
                                int var54 = this.field1286[var48] * var53 + 16383 - this.field1254[var48] * var52 >> 14;
                                this.field1254[var48] = this.field1286[var48] * var52 + this.field1254[var48] * var53 + 16383 >> 14;
                                this.field1286[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class191.field2937[arg3];
                                int var56 = class191.field2936[arg3];
                                int var57 = this.field1254[var48] * var55 + (this.field1276[var48] * var56 + 16383) >> 14;
                                this.field1254[var48] = this.field1254[var48] * var56 + 16383 - this.field1276[var48] * var55 >> 14;
                                this.field1276[var48] = var57;
                            }
                            this.field1276[var48] += class146.field2453;
                            this.field1286[var48] += class169.field2711;
                            this.field1254[var48] += class55.field786;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1276[var59] -= class146.field2453;
                            this.field1286[var59] -= class169.field2711;
                            this.field1254[var59] -= class55.field786;
                            if (arg2 != 0) {
                                int var60 = class191.field2937[arg2];
                                int var61 = class191.field2936[arg2];
                                int var62 = this.field1286[var59] * var61 + 16383 - (this.field1254[var59] * var60) >> 14;
                                this.field1254[var59] = this.field1254[var59] * var61 + this.field1286[var59] * var60 + 16383 >> 14;
                                this.field1286[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class191.field2937[arg4];
                                int var64 = class191.field2936[arg4];
                                int var65 = this.field1286[var59] * var63 + this.field1276[var59] * var64 + 16383 >> 14;
                                this.field1286[var59] = this.field1286[var59] * var64 + 16383 - (this.field1276[var59] * var63) >> 14;
                                this.field1276[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class191.field2937[arg3];
                                int var67 = class191.field2936[arg3];
                                int var68 = this.field1276[var59] * var67 + this.field1254[var59] * var66 + 16383 >> 14;
                                this.field1254[var59] = this.field1254[var59] * var67 + 16383 - (this.field1276[var59] * var66) >> 14;
                                this.field1276[var59] = var68;
                            }
                            this.field1276[var59] += class146.field2453;
                            this.field1286[var59] += class169.field2711;
                            this.field1254[var59] += class55.field786;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field1257.length) {
                        int[] var29 = this.field1257[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1308[var31];
                            int var33 = this.field1308[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1285[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class191.field2937[arg4];
                                    int var37 = class191.field2936[arg4];
                                    int var38 = this.field1261[var35] * var36 - (-(this.field1310[var35] * var37) - 16383) >> 14;
                                    this.field1261[var35] = (short) (this.field1261[var35] * var37 + 16383 - (this.field1310[var35] * var36) >> 14);
                                    this.field1310[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class191.field2937[arg2];
                                    int var40 = class191.field2936[arg2];
                                    int var41 = this.field1261[var35] * var40 + 16383 - (this.field1313[var35] * var39) >> 14;
                                    this.field1313[var35] = (short) (this.field1313[var35] * var40 + this.field1261[var35] * var39 + 16383 >> 14);
                                    this.field1261[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class191.field2937[arg3];
                                    int var43 = class191.field2936[arg3];
                                    int var44 = this.field1313[var35] * var42 + this.field1310[var35] * var43 + 16383 >> 14;
                                    this.field1313[var35] = (short) (this.field1313[var35] * var43 + 16383 - (this.field1310[var35] * var42) >> 14);
                                    this.field1310[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method720(-17106);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field1257.length > var70) {
                    int[] var71 = this.field1257[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1276[var73] -= class146.field2453;
                        this.field1286[var73] -= class169.field2711;
                        this.field1254[var73] -= class55.field786;
                        this.field1276[var73] = this.field1276[var73] * arg2 >> 7;
                        this.field1286[var73] = this.field1286[var73] * arg3 >> 7;
                        this.field1254[var73] = this.field1254[var73] * arg4 >> 7;
                        this.field1276[var73] += class146.field2453;
                        this.field1286[var73] += class169.field2711;
                        this.field1254[var73] += class55.field786;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1240 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (var79 < this.field1240.length) {
                        int[] var80 = this.field1240[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field1282[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field1282[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field1331 != null) {
                        for (int var76 = 0; var76 < this.field1354; var76++) {
                            class582 var77 = this.field1331[var76];
                            class54 var78 = this.field1351[var76];
                            var78.field778 = 255 - (this.field1282[var77.field8239] & 0xFF) << 24 | var78.field778 & 0xFFFFFF;
                        }
                    }
                    this.method728(2);
                }
            }
        } else if (arg0 == 7) {
            if (this.field1240 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field1240.length) {
                        int[] var90 = this.field1240[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field1250[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = (var93 & 0x3E5) >> 7;
                            int var96 = var93 & 0x7F;
                            int var97 = arg3 / 4 + var95;
                            int var98 = arg2 + var94 & 0x3F;
                            int var99 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 7) {
                                var97 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field1250[var92] = (short) class530.method3011(class530.method3011(var97 << 7, var98 << 10), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field1331 != null) {
                        for (int var86 = 0; var86 < this.field1354; var86++) {
                            class582 var87 = this.field1331[var86];
                            class54 var88 = this.field1351[var86];
                            var88.field778 = var88.field778 & 0xFF000000 | class424.field5802[this.field1250[var87.field8239] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method728(2);
                }
            }
        } else if (arg0 == 8) {
            if (this.field1259 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field1259.length) {
                        int[] var102 = this.field1259[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class54 var104 = this.field1351[var102[var103]];
                            var104.field780 += arg3;
                            var104.field774 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1259 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field1259.length) {
                        int[] var107 = this.field1259[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class54 var109 = this.field1351[var107[var108]];
                            var109.field775 = var109.field775 * arg3 >> 7;
                            var109.field772 = var109.field772 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1259 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field1259.length) {
                    int[] var112 = this.field1259[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class54 var114 = this.field1351[var112[var113]];
                        var114.field777 = var114.field777 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)Z")
    private final boolean method718(int arg0) {
        field1323++;
        if (arg0 != -23600) {
            return false;
        }
        boolean var2 = !this.field1241.field7304;
        boolean var3 = (this.field1262 & 0x37) != 0 && !this.field1317.field7304;
        boolean var4 = !this.field1319.field7304;
        boolean var5 = !this.field1325.field7304;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field1319.field7312 == null) {
                this.field1319.field7312 = this.field1350.method818(0, this.field1337);
            }
            class438 var7 = this.field1319.field7312;
            var7.method1736((byte) 106, this.field1272 * 12, 12);
            Buffer var8 = var7.method1739(true, 49);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field1350.field7590.copyPositions(this.field1276, this.field1286, this.field1254, this.field1333, 0, 12, this.field1272, var8.getAddress());
                if (var7.method1737((byte) -122)) {
                    this.field1319.field7313 = var7;
                    this.field1319.field7304 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field1241.field7312 == null) {
                this.field1241.field7312 = this.field1350.method818(arg0 ^ 0xFFFFA3D0, this.field1337);
            }
            class438 var9 = this.field1241.field7312;
            var9.method1736((byte) 79, this.field1272 * 4, 4);
            Buffer var10 = var9.method1739(true, 88);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field1262 & 0x37) == 0) {
                    short[] var11;
                    short[] var12;
                    byte[] var13;
                    short[] var14;
                    if (this.field1244 == null) {
                        var11 = this.field1313;
                        var12 = this.field1261;
                        var13 = this.field1334;
                        var14 = this.field1310;
                    } else {
                        var14 = this.field1244.field7856;
                        var11 = this.field1244.field7854;
                        var13 = this.field1244.field7855;
                        var12 = this.field1244.field7859;
                    }
                    this.field1350.field7590.copyLighting(this.field1250, this.field1282, this.field1284, var14, var12, var11, var13, this.field1291, this.field1288, this.field1315, 0, 4, this.field1272, var10.getAddress());
                } else {
                    this.field1350.field7590.copyColours(this.field1250, this.field1282, this.field1284, this.field1291, this.field1315, 0, 4, this.field1272, var10.getAddress());
                }
                if (var9.method1737((byte) -125)) {
                    this.field1241.field7304 = true;
                    this.field1241.field7313 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field1317.field7312 == null) {
                this.field1317.field7312 = this.field1350.method818(arg0 + 23600, this.field1337);
            }
            class438 var15 = this.field1317.field7312;
            var15.method1736((byte) 103, this.field1272 * 12, 12);
            Buffer var16 = var15.method1739(true, 107);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                short[] var18;
                byte[] var19;
                short[] var20;
                if (this.field1244 == null) {
                    var18 = this.field1261;
                    var17 = this.field1310;
                    var19 = this.field1334;
                    var20 = this.field1313;
                } else {
                    var17 = this.field1244.field7856;
                    var18 = this.field1244.field7859;
                    var19 = this.field1244.field7855;
                    var20 = this.field1244.field7854;
                }
                this.field1350.field7590.copyNormals(var17, var18, var20, var19, 3.0F / (float) this.field1288, 3.0F / (float) (this.field1288 + (this.field1288 / 2)), 0, 12, this.field1272, var16.getAddress());
                if (var15.method1737((byte) -114)) {
                    this.field1317.field7304 = true;
                    this.field1317.field7313 = var15;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field1325.field7312 == null) {
                this.field1325.field7312 = this.field1350.method818(0, this.field1337);
            }
            class438 var21 = this.field1325.field7312;
            var21.method1736((byte) 124, this.field1272 * 8, 8);
            Buffer var22 = var21.method1739(true, 119);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field1350.field7590.copyTexCoords(this.field1303, this.field1342, 0, 8, this.field1272, var22.getAddress());
                if (var21.method1737((byte) -86)) {
                    this.field1325.field7313 = var21;
                    this.field1325.field7304 = true;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!haa", name = "LA", descriptor = "(I)V")
    public final void method279(int arg0) {
        field1314++;
        this.field1288 = (short) arg0;
        this.method717(-98);
        this.method720(-17106);
    }

    @OriginalMember(owner = "client!haa", name = "ua", descriptor = "()I")
    public final int method300() {
        field1281++;
        return this.field1338;
    }

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "(I)V")
    private final void method719(int arg0) {
        if (arg0 != 0) {
            this.field1338 = 122;
        }
        if (this.field1236 != null) {
            this.field1236.field3123 = false;
        }
        field1301++;
    }

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "(I)V")
    private final void method720(int arg0) {
        field1324++;
        if ((this.field1262 & 0x37) == 0) {
            if (this.field1241 != null) {
                this.field1241.field7304 = false;
            }
        } else if (this.field1317 != null) {
            this.field1317.field7304 = false;
        }
        if (arg0 != -17106) {
            this.method290(-57, -90, null, false, 123);
        }
    }

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "(I)V")
    public static void method721(int arg0) {
        field1277 = null;
        field1287 = null;
        if (arg0 >= -88) {
            field1287 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "r", descriptor = "()Z")
    public final boolean method326() {
        field1299++;
        return this.field1311;
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "()Z")
    public final boolean method288() {
        field1305++;
        if (this.field1284 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1284.length; var1++) {
            if (this.field1284[var1] != -1 && !this.field1350.field970.method1274(this.field1284[var1], 21532)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!haa", name = "VA", descriptor = "(I)V")
    public final void method302(int arg0) {
        field1258++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field1362; var4++) {
            int var5 = this.field1286[var4] * var2 + this.field1276[var4] * var3 >> 14;
            this.field1286[var4] = this.field1286[var4] * var3 - (this.field1276[var4] * var2) >> 14;
            this.field1276[var4] = var5;
        }
        this.method717(-46);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lsk;Leea;II)V")
    public final void method310(class650 arg0, class144 arg1, int arg2, int arg3) {
        field1312++;
        if (this.field1272 == 0) {
            return;
        }
        class421 var5 = this.field1350.field7670;
        class421 var6 = (class421) arg0;
        if (!this.field1248) {
            this.method724(true);
        }
        class369.field4992 = var5.field5742 * var6.field5748 + var5.field5780 * var6.field5730 + var5.field5748 * var6.field5775;
        class68.field997 = var5.field5742 * var6.field5737 + var5.field5780 * var6.field5771 + var5.field5748 * var6.field5769 + var5.field5737;
        float var7 = (float) this.field1267 * class369.field4992 + class68.field997;
        float var8 = (float) this.field1344 * class369.field4992 + class68.field997;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) (-this.field1347) + var8;
            var10 = (float) this.field1347 + var7;
        } else {
            var9 = (float) (-this.field1347) + var7;
            var10 = (float) this.field1347 + var8;
        }
        if ((var9 >= this.field1350.field7770) || (var10 <= (float) this.field1350.field7701)) {
            return;
        }
        class695.field9620 = var5.field5750 * var6.field5737 + var5.field5734 * var6.field5771 + var5.field5730 * var6.field5769 + var5.field5771;
        class254.field3578 = var5.field5750 * var6.field5748 + var5.field5734 * var6.field5730 + var5.field5730 * var6.field5775;
        float var11 = (float) this.field1267 * class254.field3578 + class695.field9620;
        float var12 = (float) this.field1344 * class254.field3578 + class695.field9620;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) (-this.field1347) + var12) * (float) this.field1350.field7699;
            var14 = ((float) this.field1347 + var11) * (float) this.field1350.field7699;
        } else {
            var14 = ((float) this.field1347 + var12) * (float) this.field1350.field7699;
            var13 = ((float) (-this.field1347) + var11) * (float) this.field1350.field7699;
        }
        if ((this.field1350.field7758 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field1350.field7763)) {
            return;
        }
        class9.field166 = var5.field5740 * var6.field5748 + var5.field5775 * var6.field5775 + var5.field5754 * var6.field5730;
        class403.field5539 = var5.field5740 * var6.field5737 + var5.field5775 * var6.field5769 + var5.field5754 * var6.field5771 + var5.field5769;
        float var15 = (float) this.field1267 * class9.field166 + class403.field5539;
        float var16 = (float) this.field1344 * class9.field166 + class403.field5539;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = ((float) (-this.field1347) + var16) * (float) this.field1350.field7751;
            var18 = ((float) this.field1347 + var15) * (float) this.field1350.field7751;
        } else {
            var17 = ((float) (-this.field1347) + var15) * (float) this.field1350.field7751;
            var18 = ((float) this.field1347 + var16) * (float) this.field1350.field7751;
        }
        if ((var17 / (float) arg2 >= this.field1350.field7750) || (this.field1350.field7759 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field1331 != null) {
            class699.field9644 = var5.field5750 * var6.field5742 + var5.field5734 * var6.field5750 + var5.field5730 * var6.field5740;
            class611.field8530 = var5.field5742 * var6.field5780 + var5.field5780 * var6.field5734 + var5.field5748 * var6.field5754;
            class405.field5580 = var5.field5750 * var6.field5780 + var5.field5734 * var6.field5734 + var5.field5730 * var6.field5754;
            class222.field3247 = var5.field5740 * var6.field5742 + var5.field5775 * var6.field5740 + var5.field5754 * var6.field5750;
            class536.field7287 = var5.field5742 * var6.field5742 + var5.field5780 * var6.field5750 + var5.field5748 * var6.field5740;
            class603.field8441 = var5.field5740 * var6.field5780 + var5.field5775 * var6.field5754 + var5.field5754 * var6.field5734;
        }
        if (arg1 != null) {
            int var19 = this.field1359 + this.field1357 >> 1;
            int var20 = this.field1295 + this.field1293 >> 1;
            int var21 = (int) ((float) var20 * class699.field9644 + (float) this.field1267 * class254.field3578 + (float) var19 * class405.field5580 + class695.field9620);
            int var22 = (int) ((float) var20 * class222.field3247 + (float) this.field1267 * class9.field166 + (float) var19 * class603.field8441 + class403.field5539);
            int var23 = (int) ((float) var20 * class536.field7287 + (float) this.field1267 * class369.field4992 + (float) var19 * class611.field8530 + class68.field997);
            int var24 = (int) ((float) var20 * class699.field9644 + (float) this.field1344 * class254.field3578 + (float) var19 * class405.field5580 + class695.field9620);
            int var25 = (int) ((float) var20 * class222.field3247 + (float) this.field1344 * class9.field166 + (float) var19 * class603.field8441 + class403.field5539);
            arg1.field2433 = this.field1350.field7744 + (this.field1350.field7699 * var21 / arg2);
            int var26 = (int) ((float) var20 * class536.field7287 + (float) this.field1344 * class369.field4992 + (float) var19 * class611.field8530 + class68.field997);
            arg1.field2429 = this.field1350.field7744 + (this.field1350.field7699 * var24 / arg2);
            arg1.field2431 = this.field1350.field7739 + (this.field1350.field7751 * var25 / arg2);
            arg1.field2430 = this.field1350.field7751 * var22 / arg2 + this.field1350.field7739;
            if (var23 >= this.field1350.field7701 || var26 >= this.field1350.field7701) {
                arg1.field2428 = true;
                arg1.field2432 = (this.field1347 + var21) * this.field1350.field7699 / arg2 + this.field1350.field7744 - arg1.field2433;
            }
        }
        this.field1350.method3144((float) arg2, -4902);
        this.field1350.method3147(-29742);
        this.field1350.method3098(var6, 6);
        this.method716((byte) -18);
        this.method711(87);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public final void method320(int arg0) {
        field1263++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field1362; var4++) {
            int var5 = this.field1276[var4] * var3 + this.field1254[var4] * var2 >> 14;
            this.field1254[var4] = this.field1254[var4] * var3 - (this.field1276[var4] * var2) >> 14;
            this.field1276[var4] = var5;
        }
        this.method717(-43);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)Z")
    private final boolean method722(byte arg0) {
        field1279++;
        if (this.field1236.field3123) {
            return true;
        }
        if (this.field1236.field3126 == null) {
            this.field1236.field3126 = this.field1350.method812(this.field1337, 106);
        }
        class226 var2 = this.field1236.field3126;
        var2.method1546(this.field1234 * 6, -13659);
        if (arg0 > -85) {
            this.field1338 = 19;
        }
        Buffer var3 = var2.method1545(true, -4450);
        if (var3 != null) {
            Stream var4 = this.field1350.method3170((byte) 5, var3);
            if (Stream.method3910()) {
                for (int var5 = 0; var5 < this.field1234; var5++) {
                    var4.method3912(this.field1327[var5]);
                    var4.method3912(this.field1283[var5]);
                    var4.method3912(this.field1316[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field1234; var6++) {
                    var4.method3903(this.field1327[var6]);
                    var4.method3903(this.field1283[var6]);
                    var4.method3903(this.field1316[var6]);
                }
            }
            var4.method3901();
            if (var2.method1544(85)) {
                this.field1236.field3130 = var2;
                this.field1236.field3123 = true;
                this.field1243 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lsf;Ldc;IIII)V")
    public class89(class551 arg0, class5 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class162 var7 = arg0.field970;
        this.field1308 = new int[arg1.field80 + 1];
        int[] var8 = new int[arg1.field82];
        for (int var9 = 0; var9 < arg1.field82; var9++) {
            if (arg1.field65 == null || arg1.field65[var9] != 2) {
                if (arg1.field66 != null && arg1.field66[var9] != -1) {
                    class311 var178 = var7.method1270(arg1.field66[var9] & 0xFFFF, true);
                    if (((this.field1262 & 0x40) == 0 || !var178.field4244) && var178.field4233) {
                        continue;
                    }
                }
                var8[this.field1252++] = var9;
                this.field1308[arg1.field53[var9]]++;
                this.field1308[arg1.field92[var9]]++;
                this.field1308[arg1.field89[var9]]++;
            }
        }
        this.field1234 = this.field1252;
        long[] var10 = new long[this.field1252];
        boolean var11 = (this.field1338 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field1252; var12++) {
            int var161 = var8[var12];
            class311 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field95 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field95.length; var168++) {
                    class482 var169 = arg1.field95[var168];
                    if (var169.field6504 == var161) {
                        class709 var170 = class506.method2893(var169.field6507, 393216);
                        if (var170.field9742) {
                            var167 = true;
                        }
                        if (var170.field9755 != -1) {
                            class311 var171 = var7.method1270(var170.field9755, true);
                            if (var171.field4242 == 2) {
                                this.field1271 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field1234--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field66 != null) {
                var172 = arg1.field66[var161];
                if (var172 != -1) {
                    var162 = var7.method1270(var172 & 0xFFFF, true);
                    if ((this.field1262 & 0x40) != 0 && var162.field4244) {
                        var162 = null;
                        var172 = -1;
                    } else {
                        var166 = var162.field4249;
                        var165 = var162.field4250;
                    }
                }
            }
            boolean var173 = arg1.field60 != null && arg1.field60[var161] != 0 || var162 != null && var162.field4242 != 0;
            if ((var11 || var173) && arg1.field73 != null) {
                var163 += arg1.field73[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = ((var165 & 0xFF) << 8) + var163;
            int var175 = (var166 & 0xFF) + var174;
            int var176 = (var172 & 0xFFFF << 16) + var164;
            int var177 = (var12 & 0xFFFF) + var176;
            var10[var12] = ((long) var175 << 32) + (long) var177;
            this.field1311 |= var162 != null && (var162.field4251 != 0 || var162.field4243 != 0);
            this.field1271 |= var173;
        }
        class87.method693(var8, 1, var10);
        this.field1362 = arg1.field80;
        this.field1360 = arg1.field96;
        this.field1266 = arg1.field70;
        this.field1276 = arg1.field64;
        this.field1286 = arg1.field83;
        this.field1254 = arg1.field61;
        this.field1249 = arg1.field105;
        this.field1336 = arg1.field79;
        class217[] var13 = new class217[this.field1362];
        if (arg1.field95 != null) {
            this.field1354 = arg1.field95.length;
            this.field1351 = new class54[this.field1354];
            this.field1331 = new class582[this.field1354];
            for (int var14 = 0; var14 < this.field1354; var14++) {
                class482 var15 = arg1.field95[var14];
                class709 var16 = class506.method2893(var15.field6507, 393216);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1252; var18++) {
                    if (var8[var18] == var15.field6504) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class424.field5802[arg1.field90[var15.field6504] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field60 == null ? 0 : arg1.field60[var15.field6504]) << 24;
                this.field1331[var14] = new class582(var17, arg1.field53[var15.field6504], arg1.field92[var15.field6504], arg1.field89[var15.field6504], var16.field9754, var16.field9752, var16.field9755, var16.field9749, var16.field9753, var16.field9742, var16.field9748, var15.field6506);
                this.field1351[var14] = new class54(var20);
            }
        }
        int var21 = this.field1252 * 3;
        this.field1284 = new short[this.field1252];
        this.field1327 = new short[this.field1252];
        this.field1313 = new short[var21];
        this.field1283 = new short[this.field1252];
        this.field1342 = new float[var21];
        this.field1250 = new short[this.field1252];
        this.field1285 = new short[var21];
        this.field1334 = new byte[var21];
        this.field1310 = new short[var21];
        this.field1282 = new byte[this.field1252];
        this.field1333 = new short[var21];
        this.field1288 = (short) arg4;
        this.field1261 = new short[var21];
        this.field1303 = new float[var21];
        this.field1315 = new short[var21];
        class10.field178 = new long[var21];
        this.field1316 = new short[this.field1252];
        if (arg1.field63 != null) {
            this.field1352 = new short[this.field1252];
        }
        this.field1291 = (short) arg3;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field80; var23++) {
            int var160 = this.field1308[var23];
            this.field1308[var23] = var22;
            var13[var23] = new class217();
            var22 += var160;
        }
        this.field1308[arg1.field80] = var22;
        class128 var24 = class192.method1402(var8, this.field1252, (byte) 95, arg1);
        class420[] var25 = new class420[arg1.field82];
        for (int var26 = 0; var26 < arg1.field82; var26++) {
            short var139 = arg1.field53[var26];
            short var140 = arg1.field92[var26];
            short var141 = arg1.field89[var26];
            int var142 = this.field1276[var140] - this.field1276[var139];
            int var143 = this.field1286[var140] - this.field1286[var139];
            int var144 = this.field1254[var140] - this.field1254[var139];
            int var145 = this.field1276[var141] - this.field1276[var139];
            int var146 = this.field1286[var141] - this.field1286[var139];
            int var147 = this.field1254[var141] - this.field1254[var139];
            int var148 = var143 * var147 - (var144 * var146);
            int var149 = var144 * var145 - (var142 * var147);
            int var150 = var142 * var146 - (var143 * var145);
            while (var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192) {
                var150 >>= 0x1;
                var148 >>= 0x1;
                var149 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var150 * var150 + var148 * var148 + var149 * var149));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var148 * 256 / var151;
            int var153 = var150 * 256 / var151;
            int var154 = var149 * 256 / var151;
            byte var155 = arg1.field65 == null ? 0 : arg1.field65[var26];
            if (var155 == 0) {
                class217 var157 = var13[var139];
                var157.field3204++;
                var157.field3203 += var154;
                var157.field3200 += var153;
                var157.field3201 += var152;
                class217 var158 = var13[var140];
                var158.field3200 += var153;
                var158.field3204++;
                var158.field3201 += var152;
                var158.field3203 += var154;
                class217 var159 = var13[var141];
                var159.field3203 += var154;
                var159.field3200 += var153;
                var159.field3201 += var152;
                var159.field3204++;
            } else if (var155 == 1) {
                class420 var156 = var25[var26] = new class420();
                var156.field5722 = var154;
                var156.field5724 = var152;
                var156.field5729 = var153;
            }
        }
        for (int var27 = 0; var27 < this.field1252; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field90[var48] & 0xFFFF;
            int var50;
            if (arg1.field68 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field68[var48];
            }
            int var51;
            if (arg1.field60 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field60[var48] & 0xFF;
            }
            short var52 = arg1.field66 == null ? -1 : arg1.field66[var48];
            if (var52 != -1 && (this.field1262 & 0x40) != 0) {
                class311 var53 = var7.method1270(var52 & 0xFFFF, true);
                if (var53.field4244) {
                    var52 = -1;
                }
            }
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            byte var60 = 0;
            byte var61 = 0;
            int var62 = 0;
            if (var52 != -1) {
                if (var50 == -1) {
                    var61 = 2;
                    var54 = 0.0F;
                    var55 = 1.0F;
                    var58 = 0.0F;
                    var56 = 1.0F;
                    var59 = 0.0F;
                    var60 = 1;
                    var57 = 1.0F;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field86[var50];
                    if (var63 == 0) {
                        short var92 = arg1.field53[var48];
                        short var93 = arg1.field92[var48];
                        short var94 = arg1.field89[var48];
                        short var95 = arg1.field94[var50];
                        short var96 = arg1.field78[var50];
                        short var97 = arg1.field75[var50];
                        float var98 = (float) arg1.field64[var95];
                        float var99 = (float) arg1.field83[var95];
                        float var100 = (float) arg1.field61[var95];
                        float var101 = (float) arg1.field64[var96] - var98;
                        float var102 = (float) arg1.field83[var96] - var99;
                        float var103 = (float) arg1.field61[var96] - var100;
                        float var104 = (float) arg1.field64[var97] - var98;
                        float var105 = (float) arg1.field83[var97] - var99;
                        float var106 = (float) arg1.field61[var97] - var100;
                        float var107 = (float) arg1.field64[var92] - var98;
                        float var108 = (float) arg1.field83[var92] - var99;
                        float var109 = (float) arg1.field61[var92] - var100;
                        float var110 = (float) arg1.field64[var93] - var98;
                        float var111 = (float) arg1.field83[var93] - var99;
                        float var112 = (float) arg1.field61[var93] - var100;
                        float var113 = (float) arg1.field64[var94] - var98;
                        float var114 = (float) arg1.field83[var94] - var99;
                        float var115 = (float) arg1.field61[var94] - var100;
                        float var116 = var102 * var106 - var103 * var105;
                        float var117 = var103 * var104 - var101 * var106;
                        float var118 = var101 * var105 - var102 * var104;
                        float var119 = var105 * var118 - (var106 * var117);
                        float var120 = var106 * var116 - var104 * var118;
                        float var121 = var104 * var117 - (var105 * var116);
                        float var122 = 1.0F / (var103 * var121 + var101 * var119 + var102 * var120);
                        var56 = (var112 * var121 + var110 * var119 + var111 * var120) * var122;
                        var54 = (var109 * var121 + var107 * var119 + var108 * var120) * var122;
                        var58 = (var115 * var121 + var113 * var119 + var114 * var120) * var122;
                        float var123 = var103 * var116 - var101 * var118;
                        float var124 = var102 * var118 - var103 * var117;
                        float var125 = var101 * var117 - var102 * var116;
                        float var126 = 1.0F / (var106 * var125 + var104 * var124 + var105 * var123);
                        var55 = (var109 * var125 + var107 * var124 + var108 * var123) * var126;
                        var59 = (var115 * var125 + var113 * var124 + var114 * var123) * var126;
                        var57 = (var112 * var125 + var110 * var124 + var111 * var123) * var126;
                    } else {
                        short var64 = arg1.field53[var48];
                        short var65 = arg1.field92[var48];
                        short var66 = arg1.field89[var48];
                        int var67 = var24.field2248[var50];
                        int var68 = var24.field2245[var50];
                        int var69 = var24.field2246[var50];
                        float[] var70 = var24.field2243[var50];
                        byte var71 = arg1.field106[var50];
                        float var72 = (float) arg1.field59[var50] / 256.0F;
                        if (var63 == 1) {
                            float var90 = (float) arg1.field85[var50] / 1024.0F;
                            class129.method1098(var69, var68, arg1.field61[var64], arg1.field64[var64], var90, var67, arg1.field83[var64], var72, -7677, class531.field7188, var71, var70);
                            var54 = class531.field7188[0];
                            var55 = class531.field7188[1];
                            class129.method1098(var69, var68, arg1.field61[var65], arg1.field64[var65], var90, var67, arg1.field83[var65], var72, -7677, class531.field7188, var71, var70);
                            var56 = class531.field7188[0];
                            var57 = class531.field7188[1];
                            class129.method1098(var69, var68, arg1.field61[var66], arg1.field64[var66], var90, var67, arg1.field83[var66], var72, -7677, class531.field7188, var71, var70);
                            var58 = class531.field7188[0];
                            var59 = class531.field7188[1];
                            float var91 = var90 / 2.0F;
                            if ((var71 & 0x1) == 0) {
                                if ((var91 < var56 - var54)) {
                                    var60 = 1;
                                    var56 -= var90;
                                } else if (var54 - var56 > var91) {
                                    var56 += var90;
                                    var60 = 2;
                                }
                                if (var91 < var58 - var54) {
                                    var58 -= var90;
                                    var61 = 1;
                                } else if (var91 < var54 - var58) {
                                    var61 = 2;
                                    var58 += var90;
                                }
                            } else {
                                if ((var57 - var55 > var91)) {
                                    var60 = 1;
                                    var57 -= var90;
                                } else if (var55 - var57 > var91) {
                                    var60 = 2;
                                    var57 += var90;
                                }
                                if (var59 - var55 > var91) {
                                    var59 -= var90;
                                    var61 = 1;
                                } else if (var55 - var59 > var91) {
                                    var61 = 2;
                                    var59 += var90;
                                }
                            }
                        } else if (var63 == 2) {
                            float var73 = (float) arg1.field62[var50] / 256.0F;
                            float var74 = (float) arg1.field56[var50] / 256.0F;
                            int var75 = arg1.field64[var65] - arg1.field64[var64];
                            int var76 = arg1.field83[var65] - arg1.field83[var64];
                            int var77 = arg1.field61[var65] - arg1.field61[var64];
                            int var78 = arg1.field64[var66] - arg1.field64[var64];
                            int var79 = arg1.field83[var66] - arg1.field83[var64];
                            int var80 = arg1.field61[var66] - arg1.field61[var64];
                            int var81 = var76 * var80 - (var77 * var79);
                            int var82 = var77 * var78 - var75 * var80;
                            int var83 = var75 * var79 - (var76 * var78);
                            float var84 = 64.0F / (float) arg1.field57[var50];
                            float var85 = 64.0F / (float) arg1.field74[var50];
                            float var86 = 64.0F / (float) arg1.field85[var50];
                            float var87 = (var70[2] * (float) var83 + var70[0] * (float) var81 + var70[1] * (float) var82) / var84;
                            float var88 = (var70[5] * (float) var83 + var70[3] * (float) var81 + var70[4] * (float) var82) / var85;
                            float var89 = (var70[8] * (float) var83 + var70[7] * (float) var82 + var70[6] * (float) var81) / var86;
                            var62 = class223.method1523((byte) -106, var87, var89, var88);
                            class485.method2773(arg1.field61[var64], arg1.field64[var64], var69, var71, arg1.field83[var64], var74, var67, (byte) 124, var72, class531.field7188, var70, var62, var68, var73);
                            var55 = class531.field7188[1];
                            var54 = class531.field7188[0];
                            class485.method2773(arg1.field61[var65], arg1.field64[var65], var69, var71, arg1.field83[var65], var74, var67, (byte) 115, var72, class531.field7188, var70, var62, var68, var73);
                            var56 = class531.field7188[0];
                            var57 = class531.field7188[1];
                            class485.method2773(arg1.field61[var66], arg1.field64[var66], var69, var71, arg1.field83[var66], var74, var67, (byte) 120, var72, class531.field7188, var70, var62, var68, var73);
                            var58 = class531.field7188[0];
                            var59 = class531.field7188[1];
                        } else if (var63 == 3) {
                            class580.method3336(var70, var72, var69, arg1.field64[var64], var67, var71, arg1.field83[var64], arg1.field61[var64], var68, class531.field7188, -24830);
                            var55 = class531.field7188[1];
                            var54 = class531.field7188[0];
                            class580.method3336(var70, var72, var69, arg1.field64[var65], var67, var71, arg1.field83[var65], arg1.field61[var65], var68, class531.field7188, -24830);
                            var57 = class531.field7188[1];
                            var56 = class531.field7188[0];
                            class580.method3336(var70, var72, var69, arg1.field64[var66], var67, var71, arg1.field83[var66], arg1.field61[var66], var68, class531.field7188, -24830);
                            var58 = class531.field7188[0];
                            var59 = class531.field7188[1];
                            if ((var71 & 0x1) == 0) {
                                if (var58 - var54 > 0.5F) {
                                    var61 = 1;
                                    var58--;
                                } else if (var54 - var58 > 0.5F) {
                                    var61 = 2;
                                    var58++;
                                }
                                if ((var56 - var54 > 0.5F)) {
                                    var60 = 1;
                                    var56--;
                                } else if (var54 - var56 > 0.5F) {
                                    var60 = 2;
                                    var56++;
                                }
                            } else {
                                if (var57 - var55 > 0.5F) {
                                    var57--;
                                    var60 = 1;
                                } else if (var55 - var57 > 0.5F) {
                                    var57++;
                                    var60 = 2;
                                }
                                if ((var59 - var55 > 0.5F)) {
                                    var59--;
                                    var61 = 1;
                                } else if (var55 - var59 > 0.5F) {
                                    var59++;
                                    var61 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field65 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field65[var48];
            }
            if (var127 == 0) {
                long var131 = ((long) (var62 << 24) + (long) var51 + ((long) (var49 << 8)) << 32) + (long) (var50 << 2);
                short var133 = arg1.field53[var48];
                short var134 = arg1.field92[var48];
                short var135 = arg1.field89[var48];
                class217 var136 = var13[var133];
                this.field1327[var27] = this.method729(false, var136.field3200, var136.field3201, arg1, var133, var27, var131, var136.field3203, var136.field3204, var54, var55);
                class217 var137 = var13[var134];
                this.field1283[var27] = this.method729(false, var137.field3200, var137.field3201, arg1, var134, var27, (long) var60 + var131, var137.field3203, var137.field3204, var56, var57);
                class217 var138 = var13[var135];
                this.field1316[var27] = this.method729(false, var138.field3200, var138.field3201, arg1, var135, var27, (long) var61 + var131, var138.field3203, var138.field3204, var58, var59);
            } else if (var127 == 1) {
                class420 var128 = var25[var48];
                long var129 = (long) ((var128.field5729 + 256 << 22) + (var128.field5724 > 0 ? 1024 : 2048) + ((var50 << 2) - -(var128.field5722 + 256 << 12))) + ((long) (var49 << 8) + (long) (var62 << 24) + ((long) var51) << 32);
                this.field1327[var27] = this.method729(false, var128.field5729, var128.field5724, arg1, arg1.field53[var48], var27, var129, var128.field5722, 0, var54, var55);
                this.field1283[var27] = this.method729(false, var128.field5729, var128.field5724, arg1, arg1.field92[var48], var27, (long) var60 + var129, var128.field5722, 0, var56, var57);
                this.field1316[var27] = this.method729(false, var128.field5729, var128.field5724, arg1, arg1.field89[var48], var27, (long) var61 + var129, var128.field5722, 0, var58, var59);
            }
            if (arg1.field60 != null) {
                this.field1282[var27] = arg1.field60[var48];
            }
            if (arg1.field63 != null) {
                this.field1352[var27] = arg1.field63[var48];
            }
            this.field1250[var27] = arg1.field90[var48];
            this.field1284[var27] = var52;
        }
        if (this.field1234 > 0) {
            int var28 = 1;
            short var29 = this.field1284[0];
            for (int var30 = 0; var30 < this.field1234; var30++) {
                short var40 = this.field1284[var30];
                if (var29 != var40) {
                    var28++;
                    var29 = var40;
                }
            }
            this.field1275 = new int[var28];
            this.field1255 = new int[var28];
            this.field1270 = new int[var28 + 1];
            this.field1270[0] = 0;
            int var31 = this.field1272;
            short var32 = 0;
            int var33 = 0;
            short var34 = this.field1284[0];
            for (int var35 = 0; var35 < this.field1234; var35++) {
                short var36 = this.field1284[var35];
                if (var34 != var36) {
                    this.field1255[var33] = var31;
                    this.field1275[var33] = var32 - (var31 - 1);
                    var33++;
                    this.field1270[var33] = var35;
                    var34 = var36;
                    var32 = 0;
                    var31 = this.field1272;
                }
                short var37 = this.field1327[var35];
                if (var37 > var32) {
                    var32 = var37;
                }
                if (var31 > var37) {
                    var31 = var37;
                }
                short var38 = this.field1283[var35];
                if (var38 > var32) {
                    var32 = var38;
                }
                if (var31 > var38) {
                    var31 = var38;
                }
                short var39 = this.field1316[var35];
                if (var31 > var39) {
                    var31 = var39;
                }
                if (var39 > var32) {
                    var32 = var39;
                }
            }
            this.field1255[var33] = var31;
            this.field1275[var33] = var32 + 1 - var31;
            var33++;
            this.field1270[var33] = this.field1234;
        }
        class10.field178 = null;
        this.field1333 = class757.method4192(this.field1272, this.field1333, true);
        this.field1315 = class757.method4192(this.field1272, this.field1315, true);
        this.field1310 = class757.method4192(this.field1272, this.field1310, true);
        this.field1261 = class757.method4192(this.field1272, this.field1261, true);
        this.field1313 = class757.method4192(this.field1272, this.field1313, true);
        this.field1334 = class645.method3598(this.field1272, 0, this.field1334);
        this.field1303 = class500.method2863(this.field1303, this.field1272, 107);
        this.field1342 = class500.method2863(this.field1342, this.field1272, 124);
        if (arg1.field100 != null && class460.method2642(arg2, (byte) 120, this.field1262)) {
            this.field1257 = arg1.method32(false, 16502);
        }
        if (arg1.field95 != null && class403.method2408(this.field1262, (byte) 42, arg2)) {
            this.field1259 = arg1.method27((byte) 42);
        }
        if (arg1.field99 != null && class396.method2393(this.field1262, arg2, (byte) -94)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field1252; var43++) {
                int var47 = arg1.field99[var8[var43]];
                if (var47 >= 0) {
                    int var10002 = var42[var47]++;
                    if (var47 > var41) {
                        var41 = var47;
                    }
                }
            }
            this.field1240 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field1240[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field1252; var45++) {
                int var46 = arg1.field99[var8[var45]];
                if (var46 >= 0) {
                    this.field1240[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method280(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6) {
        field1339++;
        if (!this.field1248) {
            this.method724(true);
        }
        int var8 = this.field1359 + arg4;
        int var9 = this.field1357 + arg4;
        int var10 = arg6 + this.field1293;
        int var11 = this.field1295 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4037 <= arg2.field4035 + var9 >> arg2.field4036 || var10 < 0 || arg2.field4034 <= (arg2.field4035 + var11 >> arg2.field4036)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4037 <= arg3.field4035 + var9 >> arg3.field4036 || var10 < 0 || arg3.field4034 <= (arg3.field4035 + var11 >> arg3.field4036)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4036;
            int var13 = arg2.field4035 + var9 - 1 >> arg2.field4036;
            int var14 = var10 >> arg2.field4036;
            int var15 = var11 - (1 - arg2.field4035) >> arg2.field4036;
            if (arg2.method1897((byte) -34, var14, var12) == arg5 && arg5 == arg2.method1897((byte) -34, var14, var13) && arg2.method1897((byte) -34, var15, var12) == arg5 && arg5 == arg2.method1897((byte) -34, var15, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field1362; var32++) {
                this.field1286[var32] -= arg5 - arg2.method1907(this.field1276[var32] + arg4, (byte) -127, this.field1254[var32] + arg6);
            }
        } else if (arg0 == 2) {
            int var29 = this.field1267;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field1362; var30++) {
                int var31 = (this.field1286[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field1286[var30] -= -((arg1 - var31) * (arg2.method1907(this.field1276[var30] + arg4, (byte) 99, this.field1254[var30] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = (arg1 >> 8 & 0xFF) * 4;
            int var18 = (arg1 & 0xFFFED5) >> 16 << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var16 >> 1)) < 0 || (arg2.field4037 << arg2.field4036) <= ((var16 >> 1) + arg4 + arg2.field4035) || arg6 - (var17 >> 1) < 0 || ((var17 >> 1) + arg2.field4035 + arg6) >= (arg2.field4034 << arg2.field4036)) {
                return;
            }
            this.method2859(var18, 0, arg2, arg5, arg4, var17, var16, var19, arg6);
        } else if (arg0 == 4) {
            int var27 = this.field1344 - this.field1267;
            for (int var28 = 0; var28 < this.field1362; var28++) {
                this.field1286[var28] = this.field1286[var28] + arg3.method1907(this.field1276[var28] + arg4, (byte) 121, this.field1254[var28] + arg6) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field1344 - this.field1267;
            for (int var21 = 0; var21 < this.field1362; var21++) {
                int var22 = this.field1276[var21] + arg4;
                int var23 = this.field1254[var21] + arg6;
                int var24 = arg2.method1907(var22, (byte) 88, var23);
                int var25 = arg3.method1907(var22, (byte) 102, var23);
                int var26 = var24 - var25 - arg1;
                this.field1286[var21] = ((this.field1286[var21] << 8) / var20 * var26 >> 8) - (arg5 - var24);
            }
        }
        this.method717(-56);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 < 24) {
            this.field1271 = false;
        }
        field1274++;
        if (arg2 > arg6 && arg8 > arg6 && arg1 > arg6) {
            return false;
        } else if (arg6 > arg2 && arg8 < arg6 && arg6 > arg1) {
            return false;
        } else if (arg5 < arg7 && arg3 > arg5 && arg4 > arg5) {
            return false;
        } else {
            return arg7 >= arg5 || arg5 <= arg3 || arg4 >= arg5;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
    private final void method724(boolean arg0) {
        field1335++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1362; var10++) {
            int var11 = this.field1276[var10];
            int var12 = this.field1286[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            int var13 = this.field1254[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field1344 = var6;
        this.field1295 = var7;
        this.field1267 = var3;
        this.field1359 = var2;
        this.field1357 = var5;
        this.field1293 = var4;
        this.field1347 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field1340 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field1248 = arg0;
    }

    @OriginalMember(owner = "client!haa", name = "EA", descriptor = "()I")
    public final int method297() {
        field1349++;
        if (!this.field1248) {
            this.method724(true);
        }
        return this.field1344;
    }

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "(I)V")
    private final void method725(int arg0) {
        field1341++;
        if (!this.field1243) {
            return;
        }
        this.field1243 = false;
        if (this.field1249 == null && this.field1336 == null && this.field1331 == null) {
            if (this.field1276 != null && !class235.method1583(-1, this.field1262, this.field1338)) {
                if (this.field1319 == null || this.field1319.method3046(-10954)) {
                    if (!this.field1248) {
                        this.method724(true);
                    }
                    this.field1276 = null;
                } else {
                    this.field1243 = true;
                }
            }
            if (this.field1286 != null && !class196.method1421(this.field1262, this.field1338, arg0 - 8188)) {
                if (this.field1319 == null || this.field1319.method3046(arg0 ^ 0xFFFFF536)) {
                    if (!this.field1248) {
                        this.method724(true);
                    }
                    this.field1286 = null;
                } else {
                    this.field1243 = true;
                }
            }
            if (this.field1254 != null && !class470.method2707(79, this.field1338, this.field1262)) {
                if (this.field1319 == null || this.field1319.method3046(-10954)) {
                    if (!this.field1248) {
                        this.method724(true);
                    }
                    this.field1254 = null;
                } else {
                    this.field1243 = true;
                }
            }
        }
        if (arg0 != 8192) {
            this.method723(94, 85, -123, 125, -105, -54, -5, 23, -15);
        }
        if (this.field1285 != null && this.field1276 == null && this.field1286 == null && this.field1254 == null) {
            this.field1285 = null;
            this.field1308 = null;
        }
        if (this.field1334 != null && !class577.method3331(this.field1262, this.field1338, (byte) 20)) {
            label201: {
                label200: {
                    boolean var10000;
                    if ((this.field1262 & 0x37) == 0) {
                        if (this.field1241 == null || this.field1241.method3046(-10954)) {
                            break label200;
                        }
                        var10000 = false;
                    } else {
                        if (this.field1317 == null || this.field1317.method3046(-10954)) {
                            break label200;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field1243 = true;
                        break label201;
                    }
                }
                this.field1334 = null;
                this.field1310 = this.field1261 = this.field1313 = null;
            }
        }
        if (this.field1250 != null && !class315.method1988(this.field1262, this.field1338, 96)) {
            if (this.field1241 == null || this.field1241.method3046(-10954)) {
                this.field1250 = null;
            } else {
                this.field1243 = true;
            }
        }
        if (this.field1282 != null && !class469.method2695(this.field1262, this.field1338, (byte) 103)) {
            if (this.field1241 == null || this.field1241.method3046(-10954)) {
                this.field1282 = null;
            } else {
                this.field1243 = true;
            }
        }
        if (this.field1303 != null && !class177.method1338(this.field1338, this.field1262, (byte) 96)) {
            if (this.field1325 == null || this.field1325.method3046(-10954)) {
                this.field1303 = this.field1342 = null;
            } else {
                this.field1243 = true;
            }
        }
        if (this.field1284 != null && !class663.method3752(this.field1338, this.field1262, 2)) {
            if (this.field1241 == null || this.field1241.method3046(-10954)) {
                this.field1284 = null;
            } else {
                this.field1243 = true;
            }
        }
        if (this.field1327 != null && !class568.method3285(this.field1338, this.field1262, 393216)) {
            if ((this.field1236 == null || this.field1236.method1471((byte) 119)) && (this.field1241 == null || this.field1241.method3046(-10954))) {
                this.field1327 = this.field1283 = this.field1316 = null;
            } else {
                this.field1243 = true;
            }
        }
        if (this.field1333 != null) {
            if (this.field1319 == null || this.field1319.method3046(-10954)) {
                this.field1333 = null;
            } else {
                this.field1243 = true;
            }
        }
        if (this.field1315 != null) {
            if (this.field1241 == null || this.field1241.method3046(-10954)) {
                this.field1315 = null;
            } else {
                this.field1243 = true;
            }
        }
        if (this.field1240 != null && !class396.method2393(this.field1262, this.field1338, (byte) -111)) {
            this.field1352 = null;
            this.field1240 = null;
        }
        if (this.field1257 != null && !class460.method2642(this.field1338, (byte) 123, this.field1262)) {
            this.field1266 = null;
            this.field1257 = null;
        }
        if (this.field1259 != null && !class403.method2408(this.field1262, (byte) 42, this.field1338)) {
            this.field1259 = null;
        }
        if (this.field1270 != null && (this.field1338 & 0x800) == 0 && (this.field1338 & 0x40000) == 0) {
            this.field1270 = null;
            this.field1255 = null;
            this.field1275 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "ba", descriptor = "(Lr;)Lr;")
    public final class196 method325(class196 arg0) {
        field1343++;
        if (this.field1272 == 0) {
            return null;
        }
        if (!this.field1248) {
            this.method724(true);
        }
        int var2;
        int var3;
        if (this.field1350.field7688 <= 0) {
            var2 = this.field1359 - (this.field1350.field7688 * this.field1267 >> 8) >> this.field1350.field7706;
            var3 = this.field1357 - (this.field1350.field7688 * this.field1344 >> 8) >> this.field1350.field7706;
        } else {
            var2 = this.field1359 - (this.field1350.field7688 * this.field1344 >> 8) >> this.field1350.field7706;
            var3 = this.field1357 - (this.field1350.field7688 * this.field1267 >> 8) >> this.field1350.field7706;
        }
        int var4;
        int var5;
        if (this.field1350.field7749 > 0) {
            var4 = this.field1293 - (this.field1350.field7749 * this.field1344 >> 8) >> this.field1350.field7706;
            var5 = this.field1295 - (this.field1350.field7749 * this.field1267 >> 8) >> this.field1350.field7706;
        } else {
            var4 = this.field1293 - (this.field1350.field7749 * this.field1267 >> 8) >> this.field1350.field7706;
            var5 = this.field1295 - (this.field1350.field7749 * this.field1344 >> 8) >> this.field1350.field7706;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class736 var8 = (class736) arg0;
        class736 var9;
        if (var8 != null && var8.method4086(var6, var7, (byte) 23)) {
            var9 = var8;
            var8.method4084((byte) 124);
        } else {
            var9 = new class736(this.field1350, var6, var7);
        }
        var9.method4087(var3, -44, var5, var4, var2);
        this.method712(var9, -9824);
        return var9;
    }

    @OriginalMember(owner = "client!haa", name = "ia", descriptor = "(SS)V")
    public final void method308(short arg0, short arg1) {
        field1322++;
        for (int var3 = 0; var3 < this.field1252; var3++) {
            if (this.field1250[var3] == arg0) {
                this.field1250[var3] = arg1;
            }
        }
        if (this.field1331 != null) {
            for (int var4 = 0; var4 < this.field1354; var4++) {
                class582 var5 = this.field1331[var4];
                class54 var6 = this.field1351[var4];
                var6.field778 = var6.field778 & 0xFF000000 | class424.field5802[this.field1250[var5.field8239] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method728(2);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZIIIILsk;I)Z")
    private final boolean method726(boolean arg0, int arg1, int arg2, int arg3, int arg4, class650 arg5, int arg6) {
        if (arg6 != -4) {
            this.method310(null, null, 101, 114);
        }
        field1292++;
        class421 var8 = (class421) arg5;
        class421 var9 = this.field1350.field7670;
        float var10 = var8.field5737 * var9.field5750 + var8.field5771 * var9.field5734 + var8.field5769 * var9.field5730 + var9.field5771;
        float var11 = var8.field5737 * var9.field5740 + var8.field5771 * var9.field5754 + var8.field5769 * var9.field5775 + var9.field5769;
        float var12 = var8.field5737 * var9.field5742 + var8.field5771 * var9.field5780 + var8.field5769 * var9.field5748 + var9.field5737;
        class536.field7287 = var8.field5742 * var9.field5742 + var8.field5750 * var9.field5780 + var8.field5740 * var9.field5748;
        class405.field5580 = var8.field5780 * var9.field5750 + var8.field5754 * var9.field5730 + var8.field5734 * var9.field5734;
        class222.field3247 = var8.field5742 * var9.field5740 + var8.field5750 * var9.field5754 + var8.field5740 * var9.field5775;
        class9.field166 = var8.field5748 * var9.field5740 + var8.field5775 * var9.field5775 + var8.field5730 * var9.field5754;
        class603.field8441 = var8.field5780 * var9.field5740 + var8.field5754 * var9.field5775 + var8.field5734 * var9.field5754;
        class369.field4992 = var8.field5748 * var9.field5742 + var8.field5775 * var9.field5748 + var8.field5730 * var9.field5780;
        class611.field8530 = var8.field5780 * var9.field5742 + var8.field5754 * var9.field5748 + var8.field5734 * var9.field5780;
        class254.field3578 = var8.field5748 * var9.field5750 + var8.field5775 * var9.field5730 + var8.field5730 * var9.field5734;
        class699.field9644 = var8.field5742 * var9.field5750 + var8.field5750 * var9.field5734 + var8.field5740 * var9.field5730;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field1350.field7699;
        int var19 = this.field1350.field7751;
        if (!this.field1248) {
            this.method724(true);
        }
        int var20 = this.field1357 - this.field1359 >> 1;
        int var21 = this.field1344 - this.field1267 >> 1;
        int var22 = this.field1295 - this.field1293 >> 1;
        int var23 = this.field1359 + var20;
        int var24 = this.field1267 + var21;
        int var25 = this.field1293 + var22;
        int var26 = var23 - (var20 << arg2);
        int var27 = var24 - (var21 << arg2);
        int var28 = var25 - (var22 << arg2);
        int var29 = (var20 << arg2) + var23;
        int var30 = (var21 << arg2) + var24;
        class178.field2807[0] = var26;
        int var31 = (var22 << arg2) + var25;
        class598.field8376[0] = var27;
        class178.field2807[1] = var29;
        class476.field6436[0] = var28;
        class598.field8376[1] = var27;
        class476.field6436[1] = var28;
        class178.field2807[2] = var26;
        class598.field8376[2] = var30;
        class178.field2807[3] = var29;
        class476.field6436[2] = var28;
        class598.field8376[3] = var30;
        class178.field2807[4] = var26;
        class476.field6436[3] = var28;
        class598.field8376[4] = var27;
        class476.field6436[4] = var31;
        class178.field2807[5] = var29;
        class598.field8376[5] = var27;
        class178.field2807[6] = var26;
        class476.field6436[5] = var31;
        class598.field8376[6] = var30;
        class476.field6436[6] = var31;
        class178.field2807[7] = var29;
        class598.field8376[7] = var30;
        class476.field6436[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class178.field2807[var32];
            float var52 = (float) class598.field8376[var32];
            float var53 = (float) class476.field6436[var32];
            float var54 = class699.field9644 * var53 + class405.field5580 * var51 + class254.field3578 * var52 + var10;
            float var55 = class536.field7287 * var53 + class611.field8530 * var51 + class369.field4992 * var52 + var12;
            float var56 = class222.field3247 * var53 + class9.field166 * var52 + class603.field8441 * var51 + var11;
            if (var55 >= (float) this.field1350.field7701) {
                if (arg3 > 0) {
                    var55 = arg3;
                }
                float var57 = (float) var18 * var54 / var55 + (float) this.field1350.field7744;
                if (var57 < var14) {
                    var14 = var57;
                }
                if (var57 > var15) {
                    var15 = var57;
                }
                float var58 = (float) var19 * var56 / var55 + (float) this.field1350.field7739;
                if (var58 > var17) {
                    var17 = var58;
                }
                if (var16 > var58) {
                    var16 = var58;
                }
                var13 = true;
            }
        }
        if (var13 && (float) arg1 > var14 && var15 > (float) arg1 && (float) arg4 > var16 && var17 > (float) arg4) {
            if (arg0) {
                return true;
            }
            if (class700.field9650.length < this.field1272) {
                class700.field9650 = new int[this.field1272];
                class410.field5614 = new int[this.field1272];
            }
            for (int var33 = 0; var33 < this.field1362; var33++) {
                float var35 = (float) this.field1286[var33];
                float var36 = (float) this.field1276[var33];
                float var37 = (float) this.field1254[var33];
                float var38 = class536.field7287 * var37 + class611.field8530 * var36 + class369.field4992 * var35 + var12;
                float var39 = class699.field9644 * var37 + class405.field5580 * var36 + class254.field3578 * var35 + var10;
                float var40 = class222.field3247 * var37 + class9.field166 * var35 + class603.field8441 * var36 + var11;
                if ((float) this.field1350.field7701 <= var38) {
                    if (arg3 > 0) {
                        var38 = arg3;
                    }
                    int var41 = (int) ((float) var18 * var39 / var38 + (float) this.field1350.field7744);
                    int var42 = (int) ((float) var19 * var40 / var38 + (float) this.field1350.field7739);
                    int var43 = this.field1308[var33];
                    int var44 = this.field1308[var33 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field1285[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        class700.field9650[var46] = var41;
                        class410.field5614[var46] = var42;
                    }
                } else {
                    int var47 = this.field1308[var33];
                    int var48 = this.field1308[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field1285[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class700.field9650[this.field1285[var49] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field1252; var34++) {
                if (class700.field9650[this.field1327[var34]] != -999999 && class700.field9650[this.field1283[var34]] != -999999 && class700.field9650[this.field1316[var34]] != -999999 && this.method723(109, class410.field5614[this.field1316[var34]], class410.field5614[this.field1327[var34]], class700.field9650[this.field1283[var34]], class700.field9650[this.field1316[var34]], arg1, arg4, class700.field9650[this.field1327[var34]], class410.field5614[this.field1283[var34]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!haa", name = "v", descriptor = "()V")
    public final void method323() {
        for (int var1 = 0; var1 < this.field1362; var1++) {
            this.field1254[var1] = -this.field1254[var1];
        }
        field1318++;
        for (int var2 = 0; var2 < this.field1272; var2++) {
            this.field1313[var2] = (short) (-this.field1313[var2]);
        }
        for (int var3 = 0; var3 < this.field1252; var3++) {
            short var4 = this.field1327[var3];
            this.field1327[var3] = this.field1316[var3];
            this.field1316[var3] = var4;
        }
        this.method717(-38);
        this.method720(-17106);
        this.method719(0);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lsk;Leea;I)V")
    public final void method301(class650 arg0, class144 arg1, int arg2) {
        field1269++;
        if (this.field1272 == 0) {
            return;
        }
        class421 var4 = this.field1350.field7670;
        class421 var5 = (class421) arg0;
        if (!this.field1248) {
            this.method724(true);
        }
        class68.field997 = var4.field5742 * var5.field5737 + var4.field5780 * var5.field5771 + var4.field5748 * var5.field5769 + var4.field5737;
        class369.field4992 = var4.field5742 * var5.field5748 + var4.field5780 * var5.field5730 + var4.field5748 * var5.field5775;
        float var6 = (float) this.field1267 * class369.field4992 + class68.field997;
        float var7 = (float) this.field1344 * class369.field4992 + class68.field997;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) this.field1347 + var6;
            var9 = var7 - (float) this.field1347;
        } else {
            var8 = (float) this.field1347 + var7;
            var9 = (float) (-this.field1347) + var6;
        }
        if ((this.field1350.field7730 <= var9) || ((float) this.field1350.field7701 >= var8)) {
            return;
        }
        class695.field9620 = var4.field5750 * var5.field5737 + var4.field5734 * var5.field5771 + var4.field5730 * var5.field5769 + var4.field5771;
        class254.field3578 = var4.field5750 * var5.field5748 + var4.field5734 * var5.field5730 + var4.field5730 * var5.field5775;
        float var10 = (float) this.field1267 * class254.field3578 + class695.field9620;
        float var11 = (float) this.field1344 * class254.field3578 + class695.field9620;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = (var11 - (float) this.field1347) * (float) this.field1350.field7699;
            var13 = ((float) this.field1347 + var10) * (float) this.field1350.field7699;
        } else {
            var12 = ((float) (-this.field1347) + var10) * (float) this.field1350.field7699;
            var13 = ((float) this.field1347 + var11) * (float) this.field1350.field7699;
        }
        if ((this.field1350.field7758 <= var12 / var8) || (this.field1350.field7763 >= var13 / var8)) {
            return;
        }
        class9.field166 = var4.field5740 * var5.field5748 + var4.field5775 * var5.field5775 + var4.field5754 * var5.field5730;
        class403.field5539 = var4.field5740 * var5.field5737 + var4.field5775 * var5.field5769 + var4.field5754 * var5.field5771 + var4.field5769;
        float var14 = (float) this.field1267 * class9.field166 + class403.field5539;
        float var15 = (float) this.field1344 * class9.field166 + class403.field5539;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = ((float) this.field1347 + var14) * (float) this.field1350.field7751;
            var17 = (var15 - (float) this.field1347) * (float) this.field1350.field7751;
        } else {
            var16 = ((float) this.field1347 + var15) * (float) this.field1350.field7751;
            var17 = ((float) (-this.field1347) + var14) * (float) this.field1350.field7751;
        }
        if ((this.field1350.field7750 <= var17 / var8) || (this.field1350.field7759 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field1331 != null) {
            class536.field7287 = var4.field5742 * var5.field5742 + var4.field5780 * var5.field5750 + var4.field5748 * var5.field5740;
            class222.field3247 = var4.field5740 * var5.field5742 + var4.field5775 * var5.field5740 + var4.field5754 * var5.field5750;
            class699.field9644 = var4.field5750 * var5.field5742 + var4.field5734 * var5.field5750 + var4.field5730 * var5.field5740;
            class405.field5580 = var4.field5750 * var5.field5780 + var4.field5734 * var5.field5734 + var4.field5730 * var5.field5754;
            class603.field8441 = var4.field5740 * var5.field5780 + var4.field5775 * var5.field5754 + var4.field5754 * var5.field5734;
            class611.field8530 = var4.field5742 * var5.field5780 + var4.field5780 * var5.field5734 + var4.field5748 * var5.field5754;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1359 + this.field1357 >> 1;
            int var21 = this.field1295 + this.field1293 >> 1;
            int var22 = (int) ((float) var21 * class699.field9644 + (float) this.field1267 * class254.field3578 + (float) var20 * class405.field5580 + class695.field9620);
            int var23 = (int) ((float) var21 * class222.field3247 + (float) this.field1267 * class9.field166 + (float) var20 * class603.field8441 + class403.field5539);
            int var24 = (int) ((float) var21 * class536.field7287 + (float) this.field1267 * class369.field4992 + (float) var20 * class611.field8530 + class68.field997);
            if (var24 < this.field1350.field7701) {
                var18 = true;
            } else {
                arg1.field2433 = this.field1350.field7699 * var22 / var24 + this.field1350.field7744;
                arg1.field2430 = this.field1350.field7739 + (this.field1350.field7751 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class699.field9644 + (float) this.field1344 * class254.field3578 + (float) var20 * class405.field5580 + class695.field9620);
            int var26 = (int) ((float) var21 * class222.field3247 + (float) this.field1344 * class9.field166 + (float) var20 * class603.field8441 + class403.field5539);
            int var27 = (int) ((float) var21 * class536.field7287 + (float) this.field1344 * class369.field4992 + (float) var20 * class611.field8530 + class68.field997);
            if (var27 < this.field1350.field7701) {
                var18 = true;
            } else {
                arg1.field2429 = this.field1350.field7699 * var25 / var27 + this.field1350.field7744;
                arg1.field2431 = this.field1350.field7751 * var26 / var27 + this.field1350.field7739;
            }
            if (var18) {
                if (var24 < this.field1350.field7701 && var27 < this.field1350.field7701) {
                    var19 = false;
                } else if (var24 < this.field1350.field7701) {
                    int var31 = (var27 - this.field1350.field7701 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field2433 = this.field1350.field7699 * var32 / this.field1350.field7701 + this.field1350.field7744;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field2430 = this.field1350.field7751 * var33 / this.field1350.field7701 + this.field1350.field7739;
                } else if (var27 < this.field1350.field7701) {
                    int var28 = (var24 - this.field1350.field7701 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field2433 = this.field1350.field7699 * var29 / this.field1350.field7701 + this.field1350.field7744;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field2430 = this.field1350.field7751 * var30 / this.field1350.field7701 + this.field1350.field7739;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field2432 = (this.field1347 + var25) * this.field1350.field7699 / var27 + (this.field1350.field7744 - arg1.field2429);
                } else {
                    arg1.field2432 = (this.field1347 + var22) * this.field1350.field7699 / var24 + this.field1350.field7744 - arg1.field2433;
                }
                arg1.field2428 = true;
            }
        }
        this.field1350.method3134((byte) 120);
        this.field1350.method3098(var5, 6);
        this.method716((byte) -18);
        this.method711(106);
    }

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "(I)V")
    public static final void method727(int arg0) {
        if (arg0 != -1096973000) {
            field1287 = null;
        }
        if (class630.field8751.field10253) {
            class455.field6207 = 96;
        } else {
            try {
                Method var1 = (field1363 == null ? (field1363 = method730("java.lang.Runtime")) : field1363).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class455.field6207 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field1239++;
    }

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method289(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1329++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            class55.field786 = 0;
            class146.field2453 = 0;
            int var13 = 0;
            class169.field2711 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field1257.length > var15) {
                    int[] var16 = this.field1257[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1266 == null || (this.field1266[var18] & arg6) != 0) {
                            class146.field2453 += this.field1276[var18];
                            class169.field2711 += this.field1286[var18];
                            class55.field786 += this.field1254[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class146.field2453 = var10;
                class169.field2711 = var12;
                class55.field786 = var11;
            } else {
                class146.field2453 = class146.field2453 / var13 + var10;
                class55.field786 = class55.field786 / var13 + var11;
                class169.field2711 = class169.field2711 / var13 + var12;
                class433.field5892 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field1257.length > var26) {
                    int[] var27 = this.field1257[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1266 == null || (this.field1266[var29] & arg6) != 0) {
                            this.field1276[var29] += var23;
                            this.field1286[var29] += var24;
                            this.field1254[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field1257.length) {
                        int[] var110 = this.field1257[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field1266 == null || (this.field1266[var112] & arg6) != 0) {
                                this.field1276[var112] -= class146.field2453;
                                this.field1286[var112] -= class169.field2711;
                                this.field1254[var112] -= class55.field786;
                                if (arg4 != 0) {
                                    int var113 = class191.field2937[arg4];
                                    int var114 = class191.field2936[arg4];
                                    int var115 = this.field1286[var112] * var113 + (this.field1276[var112] * var114) + 16383 >> 14;
                                    this.field1286[var112] = this.field1286[var112] * var114 + 16383 - this.field1276[var112] * var113 >> 14;
                                    this.field1276[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class191.field2937[arg2];
                                    int var117 = class191.field2936[arg2];
                                    int var118 = this.field1286[var112] * var117 + 16383 - this.field1254[var112] * var116 >> 14;
                                    this.field1254[var112] = this.field1286[var112] * var116 + (this.field1254[var112] * var117) + 16383 >> 14;
                                    this.field1286[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class191.field2937[arg3];
                                    int var120 = class191.field2936[arg3];
                                    int var121 = this.field1254[var112] * var119 + this.field1276[var112] * var120 + 16383 >> 14;
                                    this.field1254[var112] = this.field1254[var112] * var120 + 16383 - (this.field1276[var112] * var119) >> 14;
                                    this.field1276[var112] = var121;
                                }
                                this.field1276[var112] += class146.field2453;
                                this.field1286[var112] += class169.field2711;
                                this.field1254[var112] += class55.field786;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field1257.length > var92) {
                            int[] var93 = this.field1257[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field1266 == null || (this.field1266[var95] & arg6) != 0) {
                                    int var96 = this.field1308[var95];
                                    int var97 = this.field1308[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field1285[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class191.field2937[arg4];
                                            int var101 = class191.field2936[arg4];
                                            int var102 = this.field1261[var99] * var100 + this.field1310[var99] * var101 + 16383 >> 14;
                                            this.field1261[var99] = (short) (this.field1261[var99] * var101 + 16383 - (this.field1310[var99] * var100) >> 14);
                                            this.field1310[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class191.field2937[arg2];
                                            int var104 = class191.field2936[arg2];
                                            int var105 = this.field1261[var99] * var104 + 16383 - (this.field1313[var99] * var103) >> 14;
                                            this.field1313[var99] = (short) (this.field1313[var99] * var104 + this.field1261[var99] * var103 + 16383 >> 14);
                                            this.field1261[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class191.field2937[arg3];
                                            int var107 = class191.field2936[arg3];
                                            int var108 = this.field1310[var99] * var107 + this.field1313[var99] * var106 + 16383 >> 14;
                                            this.field1313[var99] = (short) (this.field1313[var99] * var107 + 16383 - (this.field1310[var99] * var106) >> 14);
                                            this.field1310[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method720(-17106);
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class433.field5892) {
                    int var36 = arg7[0] * class146.field2453 + arg7[3] * class169.field2711 + arg7[6] * class55.field786 + 8192 >> 14;
                    int var37 = arg7[4] * class169.field2711 + arg7[7] * class55.field786 + arg7[1] * class146.field2453 + 8192 >> 14;
                    int var38 = var33 + var36;
                    int var39 = arg7[8] * class55.field786 + arg7[5] * class169.field2711 + arg7[2] * class146.field2453 + 8192 >> 14;
                    int var40 = var34 + var37;
                    int var41 = var35 + var39;
                    class146.field2453 = var38;
                    class169.field2711 = var40;
                    class433.field5892 = false;
                    class55.field786 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class191.field2936[arg2];
                int var44 = class191.field2937[arg2];
                int var45 = class191.field2936[arg3];
                int var46 = class191.field2937[arg3];
                int var47 = class191.field2936[arg4];
                int var48 = class191.field2937[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[1] = -var45 * var48 + (var46 * var49) + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[0] = var46 * var50 + var45 * var47 + 8192 >> 14;
                int var51 = var42[1] * -class169.field2711 + var42[0] * -class146.field2453 + var42[2] * -class55.field786 + 8192 >> 14;
                int var52 = var42[5] * -class55.field786 + var42[3] * -class146.field2453 + var42[4] * -class169.field2711 + 8192 >> 14;
                int var53 = var42[7] * -class169.field2711 + var42[8] * -class55.field786 + var42[6] * -class146.field2453 + 8192 >> 14;
                int var54 = class146.field2453 + var51;
                int var55 = class169.field2711 + var52;
                int var56 = class55.field786 + var53;
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
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 8192 >> 14;
                int var61 = var55 + var60;
                int var62 = var54 + var59;
                int var63 = var42[7] * var34 + var42[6] * var33 + (var42[8] * var35) + 8192 >> 14;
                int var64 = var56 + var63;
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
                int var67 = arg7[0] * var62 + arg7[1] * var61 + (arg7[2] * var64) + 8192 >> 14;
                int var68 = arg7[5] * var64 + (arg7[3] * var62 + arg7[4] * var61 + 8192) >> 14;
                int var69 = var30 + var67;
                int var70 = arg7[8] * var64 + (arg7[6] * var62 + (arg7[7] * var61) + 8192) >> 14;
                int var71 = var31 + var68;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field1257.length > var74) {
                        int[] var75 = this.field1257[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field1266 == null || (arg6 & this.field1266[var77]) != 0) {
                                int var78 = this.field1286[var77] * var65[1] + this.field1276[var77] * var65[0] + this.field1254[var77] * var65[2] + 8192 >> 14;
                                int var79 = this.field1276[var77] * var65[3] + this.field1254[var77] * var65[5] - (-(this.field1286[var77] * var65[4]) + -8192) >> 14;
                                int var80 = this.field1254[var77] * var65[8] + this.field1286[var77] * var65[7] + this.field1276[var77] * var65[6] + 8192 >> 14;
                                int var81 = var71 + var79;
                                int var82 = var69 + var78;
                                this.field1276[var77] = var82;
                                int var83 = var72 + var80;
                                this.field1286[var77] = var81;
                                this.field1254[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field1257.length) {
                        int[] var124 = this.field1257[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field1266 == null || (arg6 & this.field1266[var126]) != 0) {
                                this.field1276[var126] -= class146.field2453;
                                this.field1286[var126] -= class169.field2711;
                                this.field1254[var126] -= class55.field786;
                                this.field1276[var126] = this.field1276[var126] * arg2 >> 7;
                                this.field1286[var126] = this.field1286[var126] * arg3 >> 7;
                                this.field1254[var126] = this.field1254[var126] * arg4 >> 7;
                                this.field1276[var126] += class146.field2453;
                                this.field1286[var126] += class169.field2711;
                                this.field1254[var126] += class55.field786;
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
                if (class433.field5892) {
                    int var133 = arg7[6] * class55.field786 + (arg7[0] * class146.field2453 + (arg7[3] * class169.field2711)) + 8192 >> 14;
                    int var134 = arg7[1] * class146.field2453 + arg7[7] * class55.field786 + arg7[4] * class169.field2711 + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[8] * class55.field786 + (arg7[5] * class169.field2711 + arg7[2] * class146.field2453 + 8192) >> 14;
                    int var137 = var131 + var134;
                    class146.field2453 = var135;
                    class169.field2711 = var137;
                    int var138 = var132 + var136;
                    class55.field786 = var138;
                    class433.field5892 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class146.field2453 * var139 + 8192 >> 14;
                int var143 = -class169.field2711 * var140 + 8192 >> 14;
                int var144 = -class55.field786 * var141 + 8192 >> 14;
                int var145 = var142 + class146.field2453;
                int var146 = class169.field2711 + var143;
                int var147 = var144 + class55.field786;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var145 + var149;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
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
                int var157 = arg7[0] * var152 + (arg7[1] * var151) + (arg7[2] * var154) + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var152 + arg7[4] * var151 + 8192 >> 14;
                int var159 = var127 + var157;
                int var160 = arg7[6] * var152 + (arg7[7] * var151) + arg7[8] * var154 + 8192 >> 14;
                int var161 = var128 + var158;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field1257.length > var164) {
                        int[] var165 = this.field1257[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field1266 == null || (arg6 & this.field1266[var167]) != 0) {
                                int var168 = this.field1276[var167] * var155[0] + this.field1286[var167] * var155[1] + this.field1254[var167] * var155[2] + 8192 >> 14;
                                int var169 = this.field1254[var167] * var155[5] + this.field1276[var167] * var155[3] + (this.field1286[var167] * var155[4] - -8192) >> 14;
                                int var170 = var159 + var168;
                                int var171 = this.field1276[var167] * var155[6] + this.field1286[var167] * var155[7] + this.field1254[var167] * var155[8] + 8192 >> 14;
                                int var172 = var161 + var169;
                                this.field1276[var167] = var170;
                                int var173 = var162 + var171;
                                this.field1286[var167] = var172;
                                this.field1254[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1240 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (this.field1240.length > var182) {
                        int[] var183 = this.field1240[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field1352 == null || (this.field1352[var185] & arg6) != 0) {
                                int var186 = (this.field1282[var185] & 0xFF) + (arg2 * 8);
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field1282[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field1331 != null) {
                        for (int var179 = 0; var179 < this.field1354; var179++) {
                            class582 var180 = this.field1331[var179];
                            class54 var181 = this.field1351[var179];
                            var181.field778 = var181.field778 & 0xFFFFFF | 255 - (this.field1282[var180.field8239] & 0xFF) << 24;
                        }
                    }
                    this.method728(2);
                }
            }
        } else if (arg0 == 7) {
            if (this.field1240 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field1240.length > var192) {
                        int[] var193 = this.field1240[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field1352 == null || (this.field1352[var195] & arg6) != 0) {
                                int var196 = this.field1250[var195] & 0xFFFF;
                                int var197 = (var196 & 0xFEE8) >> 10;
                                int var198 = (var196 & 0x396) >> 7;
                                int var199 = var196 & 0x7F;
                                int var200 = var197 + arg2 & 0x3F;
                                int var201 = arg3 / 4 + var198;
                                if (var201 < 0) {
                                    var201 = 0;
                                } else if (var201 > 7) {
                                    var201 = 7;
                                }
                                int var202 = arg4 + var199;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field1250[var195] = (short) class530.method3011(class530.method3011(var201 << 7, var200 << 10), var202);
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field1331 != null) {
                        for (int var189 = 0; var189 < this.field1354; var189++) {
                            class582 var190 = this.field1331[var189];
                            class54 var191 = this.field1351[var189];
                            var191.field778 = class424.field5802[this.field1250[var190.field8239] & 0xFFFF] & 0xFFFFFF | var191.field778 & 0xFF000000;
                        }
                    }
                    this.method728(2);
                }
            }
        } else if (arg0 == 8) {
            if (this.field1259 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (this.field1259.length > var204) {
                        int[] var205 = this.field1259[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class54 var207 = this.field1351[var205[var206]];
                            var207.field780 += arg3;
                            var207.field774 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1259 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (this.field1259.length > var209) {
                        int[] var210 = this.field1259[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class54 var212 = this.field1351[var210[var211]];
                            var212.field772 = var212.field772 * arg2 >> 7;
                            var212.field775 = var212.field775 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1259 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field1259.length > var214) {
                    int[] var215 = this.field1259[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class54 var217 = this.field1351[var215[var216]];
                        var217.field777 = var217.field777 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "(I)V")
    private final void method728(int arg0) {
        if (this.field1241 != null) {
            this.field1241.field7304 = false;
        }
        field1264++;
        if (arg0 != 2) {
            this.method276();
        }
    }

    @OriginalMember(owner = "client!haa", name = "G", descriptor = "()I")
    public final int method304() {
        if (!this.field1248) {
            this.method724(true);
        }
        field1356++;
        return this.field1295;
    }

    @OriginalMember(owner = "client!haa", name = "da", descriptor = "()I")
    public final int method292() {
        field1346++;
        return this.field1288;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZIILdc;IIJIIFF)S")
    private final short method729(boolean arg0, int arg1, int arg2, class5 arg3, int arg4, int arg5, long arg6, int arg7, int arg8, float arg9, float arg10) {
        field1300++;
        int var13 = this.field1308[arg4];
        int var14 = this.field1308[arg4 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field1285[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class10.field178[var16] == arg6) {
                return (short) (var17 - 1);
            }
        }
        this.field1285[var15] = (short) (this.field1272 + 1);
        class10.field178[var15] = arg6;
        this.field1315[this.field1272] = (short) arg5;
        if (arg0) {
            return -92;
        }
        this.field1333[this.field1272] = (short) arg4;
        this.field1310[this.field1272] = (short) arg2;
        this.field1261[this.field1272] = (short) arg7;
        this.field1313[this.field1272] = (short) arg1;
        this.field1334[this.field1272] = (byte) arg8;
        this.field1303[this.field1272] = arg9;
        this.field1342[this.field1272] = arg10;
        return (short) (this.field1272++);
    }

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "(III)V")
    public final void method282(int arg0, int arg1, int arg2) {
        field1297++;
        for (int var4 = 0; var4 < this.field1362; var4++) {
            if (arg0 != 128) {
                this.field1276[var4] = this.field1276[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1286[var4] = this.field1286[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1254[var4] = this.field1254[var4] * arg2 >> 7;
            }
        }
        this.method717(-89);
        this.field1248 = false;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lsk;)V")
    public final void method312(class650 arg0) {
        field1302++;
        class421 var2 = (class421) arg0;
        if (this.field1249 != null) {
            for (int var3 = 0; var3 < this.field1249.length; var3++) {
                class624 var4 = this.field1249[var3];
                class624 var5 = var4;
                if (var4.field8696 != null) {
                    var5 = var4.field8696;
                }
                var5.field8689 = (int) ((float) this.field1254[var4.field8693] * var2.field5750 + (float) this.field1286[var4.field8693] * var2.field5730 + (float) this.field1276[var4.field8693] * var2.field5734 + var2.field5771);
                var5.field8702 = (int) ((float) this.field1254[var4.field8693] * var2.field5740 + (float) this.field1286[var4.field8693] * var2.field5775 + (float) this.field1276[var4.field8693] * var2.field5754 + var2.field5769);
                var5.field8704 = (int) ((float) this.field1254[var4.field8693] * var2.field5742 + (float) this.field1286[var4.field8693] * var2.field5748 + (float) this.field1276[var4.field8693] * var2.field5780 + var2.field5737);
                var5.field8688 = (int) ((float) this.field1254[var4.field8709] * var2.field5750 + (float) this.field1286[var4.field8709] * var2.field5730 + (float) this.field1276[var4.field8709] * var2.field5734 + var2.field5771);
                var5.field8695 = (int) ((float) this.field1254[var4.field8709] * var2.field5740 + (float) this.field1286[var4.field8709] * var2.field5775 + (float) this.field1276[var4.field8709] * var2.field5754 + var2.field5769);
                var5.field8703 = (int) ((float) this.field1254[var4.field8709] * var2.field5742 + (float) this.field1286[var4.field8709] * var2.field5748 + (float) this.field1276[var4.field8709] * var2.field5780 + var2.field5737);
                var5.field8701 = (int) ((float) this.field1254[var4.field8697] * var2.field5750 + (float) this.field1286[var4.field8697] * var2.field5730 + (float) this.field1276[var4.field8697] * var2.field5734 + var2.field5771);
                var5.field8699 = (int) ((float) this.field1254[var4.field8697] * var2.field5740 + (float) this.field1286[var4.field8697] * var2.field5775 + (float) this.field1276[var4.field8697] * var2.field5754 + var2.field5769);
                var5.field8710 = (int) ((float) this.field1254[var4.field8697] * var2.field5742 + (float) this.field1286[var4.field8697] * var2.field5748 + (float) this.field1276[var4.field8697] * var2.field5780 + var2.field5737);
            }
        }
        if (this.field1336 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field1336.length; var6++) {
            class72 var7 = this.field1336[var6];
            class72 var8 = var7;
            if (var7.field1058 != null) {
                var8 = var7.field1058;
            }
            if (var7.field1052 == null) {
                var7.field1052 = var2.method1867();
            } else {
                var7.field1052.method1874(var2);
            }
            var8.field1054 = (int) ((float) this.field1254[var7.field1051] * var2.field5750 + (float) this.field1286[var7.field1051] * var2.field5730 + (float) this.field1276[var7.field1051] * var2.field5734 + var2.field5771);
            var8.field1061 = (int) ((float) this.field1254[var7.field1051] * var2.field5740 + (float) this.field1286[var7.field1051] * var2.field5775 + (float) this.field1276[var7.field1051] * var2.field5754 + var2.field5769);
            var8.field1062 = (int) ((float) this.field1254[var7.field1051] * var2.field5742 + (float) this.field1286[var7.field1051] * var2.field5748 + (float) this.field1276[var7.field1051] * var2.field5780 + var2.field5737);
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lsf;IIZZ)V")
    public class89(class551 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field1234 = 0;
        this.field1243 = true;
        this.field1271 = false;
        this.field1272 = 0;
        this.field1311 = false;
        this.field1248 = false;
        this.field1337 = false;
        this.field1252 = 0;
        this.field1360 = 0;
        this.field1362 = 0;
        this.field1338 = arg1;
        this.field1350 = arg0;
        this.field1262 = arg2;
        this.field1337 = arg4;
        if (arg3 || class454.method2622(this.field1338, this.field1262, (byte) -62)) {
            this.field1319 = new class538(class614.method3479(this.field1262, -112, this.field1338));
        }
        if (arg3 || class727.method4035(1865, this.field1338, this.field1262)) {
            this.field1325 = new class538(class776.method4259(this.field1338, this.field1262, -127));
        }
        if (arg3 || class620.method3491(32720, this.field1262, this.field1338)) {
            this.field1241 = new class538(class104.method895(this.field1338, this.field1262, 0));
        }
        if (arg3 || class789.method4307((byte) -107, this.field1262, this.field1338)) {
            this.field1317 = new class538(class504.method2880(this.field1262, this.field1338, false));
        }
        if (arg3 || class541.method3055(this.field1262, this.field1338, -76)) {
            this.field1236 = new class209(class252.method1657(this.field1262, 57, this.field1338));
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method730(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

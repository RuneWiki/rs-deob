import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class108 {

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "Lr;")
    private class99 field1392 = null;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Z")
    private boolean field1406;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lag;")
    private class408 field1370;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lpm;")
    public static class349 field1381 = new class349("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "Z")
    public static boolean field1409 = false;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "[S")
    public static short[] field1410 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "[Ljava/lang/Object;")
    private Object[] field1387;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1400;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B", line = 11)
    public final byte[] method630(byte arg0, String arg1, String arg2) {
        field1380++;
        if (!this.method655((byte) 64)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1392.field1247.method1804(class100.method584((byte) 19, var4), -111);
        int var7 = -127 / ((41 - arg0) / 56);
        if (this.method646(-10566, var6)) {
            int var8 = this.field1392.field1252[var6].method1804(class100.method584((byte) 19, var5), -53);
            return this.method643(var6, var8, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([IBII)[B", line = 35)
    public final byte[] method631(int[] arg0, byte arg1, int arg2, int arg3) {
        field1411++;
        if (arg1 <= 28) {
            return null;
        } else if (this.method632(arg3, -128, arg2)) {
            if (this.field1400[arg2] == null || this.field1400[arg2][arg3] == null) {
                boolean var5 = this.method649((byte) -21, arg0, arg2, arg3);
                if (!var5) {
                    this.method653(arg2, (byte) -102);
                    boolean var6 = this.method649((byte) -21, arg0, arg2, arg3);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = class113.method682(false, true, this.field1400[arg2][arg3]);
            if (this.field1405 == 1) {
                this.field1400[arg2][arg3] = null;
                if (this.field1392.field1257[arg2] == 1) {
                    this.field1400[arg2] = null;
                }
            } else if (this.field1405 == 2) {
                this.field1400[arg2] = null;
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z", line = 83)
    private final boolean method632(int arg0, int arg1, int arg2) {
        field1377++;
        if (!this.method655((byte) 111)) {
            return false;
        } else if (arg1 >= -63) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field1392.field1257.length && this.field1392.field1257[arg2] > arg0) {
            return true;
        } else if (class289.field4209) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I", line = 108)
    public final int method633(int arg0) {
        if (arg0 != 2) {
            field1412 = 58;
        }
        field1389++;
        return this.method655((byte) 60) ? this.field1392.field1257.length : -1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I", line = 126)
    public final int[] method634(int arg0, byte arg1) {
        int var3 = -16 / ((-arg1 - 72) / 44);
        field1369++;
        if (!this.method646(-10566, arg0)) {
            return null;
        }
        int[] var4 = this.field1392.field1253[arg0];
        if (var4 == null) {
            var4 = new int[this.field1392.field1254[arg0]];
            int var5 = 0;
            while (var5 < var4.length) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 157)
    public static final void method635(byte arg0) {
        field1373++;
        if (arg0 != -14) {
            return;
        }
        for (class102 var1 = (class102) class128.field1810.method2752(arg0 ^ 0x71); var1 != null; var1 = (class102) class128.field1810.method2754(-1)) {
            if (var1.field1292 > 0) {
                var1.field1292--;
            }
            if (var1.field1292 != 0) {
                if (var1.field1291 > 0) {
                    var1.field1291--;
                }
                if (var1.field1291 == 0 && var1.field1289 >= 1 && var1.field1285 >= 1 && class80.field1034 - 2 >= var1.field1289 && class381.field5414 - 2 >= var1.field1285 && (var1.field1296 < 0 || class212.method1489((byte) 117, var1.field1286, var1.field1296))) {
                    class333.method2185(-1, var1.field1285, var1.field1286, var1.field1296, arg0 ^ 0xFFFFFFC0, var1.field1289, var1.field1284, var1.field1293, var1.field1287);
                    var1.field1291 = -1;
                    if (var1.field1298 == var1.field1296 && var1.field1298 == -1) {
                        var1.method2660((byte) 117);
                    } else if (var1.field1298 == var1.field1296 && var1.field1294 == var1.field1293 && var1.field1288 == var1.field1286) {
                        var1.method2660((byte) 113);
                    }
                }
            } else if (var1.field1298 < 0 || class212.method1489((byte) 120, var1.field1288, var1.field1298)) {
                class333.method2185(-1, var1.field1285, var1.field1288, var1.field1298, 114, var1.field1289, var1.field1284, var1.field1294, var1.field1287);
                var1.method2660((byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 212)
    public final boolean method636(String arg0, byte arg1) {
        field1401++;
        if (!this.method655((byte) 81)) {
            return false;
        }
        if (arg1 <= 77) {
            this.method659(-98);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1392.field1247.method1804(class100.method584((byte) 19, var3), -73);
        return this.method638(var4, (byte) -62);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I", line = 231)
    public final int method637(int arg0, int arg1) {
        field1382++;
        if (!this.method655((byte) 89)) {
            return -1;
        }
        int var3 = this.field1392.field1247.method1804(arg1, 88);
        if (this.method646(-10566, var3)) {
            if (arg0 <= 103) {
                this.method658(false);
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IB)Z", line = 252)
    public final boolean method638(int arg0, byte arg1) {
        field1376++;
        if (!this.method646(-10566, arg0)) {
            return false;
        } else if (this.field1387[arg0] == null) {
            this.method653(arg0, (byte) -101);
            if (this.field1387[arg0] == null) {
                if (arg1 >= -31) {
                    this.field1406 = true;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)I", line = 279)
    private final int method639(int arg0, boolean arg1) {
        if (!arg1) {
            this.method644(-70);
        }
        field1388++;
        if (this.method646(-10566, arg0)) {
            return this.field1387[arg0] == null ? this.field1370.method1268(110, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 298)
    public final int method640(String arg0, byte arg1) {
        if (arg1 != 104) {
            field1409 = true;
        }
        field1390++;
        if (this.method655((byte) 103)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1392.field1247.method1804(class100.method584((byte) 19, var3), -126);
            return this.method639(var4, true);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 320)
    public final boolean method641(int arg0, String arg1) {
        field1374++;
        if (this.method655((byte) 110)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1392.field1247.method1804(class100.method584((byte) 19, var3), -119);
            return var4 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 341)
    public final void method642(String arg0, int arg1) {
        field1403++;
        if (!this.method655((byte) 127)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < -92) {
            int var4 = this.field1392.field1247.method1804(class100.method584((byte) 19, var3), 127);
            this.method647(0, var4);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)[B", line = 362)
    public final byte[] method643(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method630((byte) 32, (String) null, (String) null);
        }
        field1393++;
        return this.method631((int[]) null, (byte) 51, arg0, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I", line = 375)
    public final int method644(int arg0) {
        field1396++;
        if (arg0 != -1) {
            this.method658(false);
        }
        if (!this.method655((byte) 87)) {
            throw new IllegalStateException("");
        }
        return this.field1392.field1250;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)[B", line = 390)
    public final byte[] method645(byte arg0, int arg1) {
        field1384++;
        if (!this.method655((byte) 72)) {
            return null;
        } else if (this.field1392.field1257.length == 1) {
            return this.method643(0, arg1, true);
        } else if (!this.method646(-10566, arg1)) {
            return null;
        } else if (this.field1392.field1257[arg1] == 1) {
            return this.method643(arg1, 0, true);
        } else if (arg0 == 80) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Z", line = 420)
    private final boolean method646(int arg0, int arg1) {
        if (arg0 != -10566) {
            return false;
        }
        field1378++;
        if (!this.method655((byte) 97)) {
            return false;
        } else if (arg1 >= 0 && this.field1392.field1257.length > arg1 && this.field1392.field1257[arg1] != 0) {
            return true;
        } else if (class289.field4209) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)V", line = 450)
    private final void method647(int arg0, int arg1) {
        field1372++;
        this.field1370.method1269(arg1, arg0 + 1);
        if (arg0 != 0) {
            this.method659(34);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BZZ)V", line = 462)
    public final void method648(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != -16) {
            return;
        }
        field1408++;
        if (!this.method655((byte) 88)) {
            return;
        }
        if (arg2) {
            this.field1392.field1249 = null;
            this.field1392.field1247 = null;
        }
        if (arg1) {
            this.field1392.field1243 = null;
            this.field1392.field1252 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[III)Z", line = 487)
    private final boolean method649(byte arg0, int[] arg1, int arg2, int arg3) {
        field1402++;
        if (!this.method646(-10566, arg2)) {
            return false;
        } else if (this.field1387[arg2] == null) {
            return false;
        } else {
            int var5 = this.field1392.field1254[arg2];
            int[] var6 = this.field1392.field1253[arg2];
            if (this.field1400[arg2] == null) {
                this.field1400[arg2] = new Object[this.field1392.field1257[arg2]];
            }
            Object[] var7 = this.field1400[arg2];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class113.method682(true, true, this.field1387[arg2]);
                class130 var12 = new class130(var11);
                var12.method828(-1, var12.field1851.length, 5, arg1);
            } else {
                var11 = class113.method682(false, true, this.field1387[arg2]);
            }
            byte[] var13;
            try {
                var13 = class316.method2106(-1, var11);
            } catch (RuntimeException var49) {
                throw class324.method2143(var49, "T3 - " + (arg1 != null) + "," + arg2 + "," + var11.length + "," + class341.method2241(0, var11.length, var11) + "," + class341.method2241(0, var11.length - 2, var11) + "," + this.field1392.field1246[arg2] + "," + this.field1392.field1250);
            }
            if (this.field1406) {
                this.field1387[arg2] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field1405 == 0) {
                    var7[var48] = class450.method2802(var13, false, arg0 + 21);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field1405 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class130 var18 = new class130(var13);
                int var19 = 0;
                var18.field1880 = var17;
                int var20 = 0;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method815(true);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg3 == var24) {
                            var20 = var24;
                            var19 += var22;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                var18.field1880 = var17;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method815(true);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg3 == var31) {
                            class271.method1853(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var33 * 4 * var5;
                class130 var35 = new class130(var13);
                int[] var36 = new int[var5];
                var35.field1880 = var34;
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method815(true);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field1880 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method815(true);
                        class271.method1853(var13, var42, var40[var45], var36[var45], var44);
                        var36[var45] += var44;
                        var42 += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field1405 == 0) {
                        var7[var47] = class450.method2802(var40[var46], false, 0);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            if (arg0 != -21) {
                this.field1392 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(BI)V", line = 771)
    public final void method650(byte arg0, int arg1) {
        field1386++;
        if (this.method646(-10566, arg1)) {
            int var3 = 93 % ((-arg0 - 22) / 44);
            if (this.field1400 != null) {
                this.field1400[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)I", line = 788)
    public final int method651(int arg0, int arg1) {
        field1397++;
        if (this.method646(-10566, arg1)) {
            if (arg0 != 0) {
                field1410 = null;
            }
            return this.field1392.field1257[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I", line = 804)
    public final int method652(int arg0) {
        field1399++;
        if (!this.method655((byte) 117)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1387.length; var4++) {
            if (this.field1392.field1254[var4] > 0) {
                var2 += 100;
                var3 += this.method639(var4, true);
            }
        }
        if (~var2 == arg0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V", line = 845)
    private final void method653(int arg0, byte arg1) {
        if (arg1 >= -88) {
            this.method643(32, -108, true);
        }
        field1395++;
        if (this.field1406) {
            this.field1387[arg0] = this.field1370.method1276(arg0, -224);
        } else {
            this.field1387[arg0] = class450.method2802(this.field1370.method1276(arg0, -224), false, 0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lag;ZI)V", line = 1069)
    public class108(class408 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1406 = arg1;
        this.field1405 = arg2;
        this.field1370 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 865)
    public final boolean method654(String arg0, byte arg1, String arg2) {
        field1379++;
        if (!this.method655((byte) 99)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1392.field1247.method1804(class100.method584((byte) 19, var4), -62);
        if (this.method646(-10566, var6)) {
            int var7 = this.field1392.field1252[var6].method1804(class100.method584((byte) 19, var5), 122);
            return arg1 <= 107 ? true : this.method661(var6, false, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Z", line = 888)
    private final boolean method655(byte arg0) {
        field1385++;
        if (this.field1392 == null) {
            this.field1392 = this.field1370.method1281(116);
            if (this.field1392 == null) {
                return false;
            }
            this.field1387 = new Object[this.field1392.field1255];
            this.field1400 = new Object[this.field1392.field1255][];
        }
        return arg0 >= 52;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)Z", line = 911)
    public final boolean method656(int arg0) {
        field1394++;
        if (!this.method655((byte) 84)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1392.field1256.length; var3++) {
            int var4 = this.field1392.field1256[var3];
            if (this.field1387[var4] == null) {
                this.method653(var4, (byte) -105);
                if (this.field1387[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 < 126) {
            this.field1370 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V", line = 948)
    public static void method657(int arg0) {
        field1410 = null;
        if (arg0 == 0) {
            field1381 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 960)
    public final void method658(boolean arg0) {
        field1407++;
        if (this.field1400 != null) {
            for (int var2 = 0; var2 < this.field1400.length; var2++) {
                this.field1400[var2] = null;
            }
        }
        if (!arg0) {
            this.method630((byte) 63, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V", line = 986)
    public final void method659(int arg0) {
        int var2 = -30 % ((arg0 - 33) / 44);
        field1391++;
        if (this.field1387 != null) {
            for (int var3 = 0; var3 < this.field1387.length; var3++) {
                this.field1387[var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(IB)Z", line = 1010)
    public final boolean method660(int arg0, byte arg1) {
        field1398++;
        if (!this.method655((byte) 127)) {
            return false;
        } else if (this.field1392.field1257.length == 1) {
            return this.method661(0, false, arg0);
        } else if (!this.method646(-10566, arg0)) {
            return false;
        } else if (this.field1392.field1257[arg0] == 1) {
            return this.method661(arg0, false, 0);
        } else {
            int var3 = -58 / ((arg1 + 14) / 55);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZI)Z", line = 1035)
    public final boolean method661(int arg0, boolean arg1, int arg2) {
        field1375++;
        if (arg1) {
            this.method630((byte) -110, (String) null, (String) null);
        }
        if (!this.method632(arg2, -119, arg0)) {
            return false;
        } else if (this.field1400[arg0] != null && this.field1400[arg0][arg2] != null) {
            return true;
        } else if (this.field1387[arg0] == null) {
            this.method653(arg0, (byte) -90);
            return this.field1387[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(ILjava/lang/String;)I", line = 1087)
    public final int method662(int arg0, String arg1) {
        if (arg0 != 5899) {
            return -66;
        }
        field1371++;
        if (this.method655((byte) 62)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1392.field1247.method1804(class100.method584((byte) 19, var3), -65);
            return this.method646(-10566, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }
}

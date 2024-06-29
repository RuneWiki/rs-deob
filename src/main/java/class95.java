import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class95 {

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lof;")
    private class283 field1349 = null;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "Z")
    private boolean field1374;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "Z")
    private boolean field1373;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lgl;")
    private class273 field1354;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lec;")
    public static class99 field1353 = new class99(5);

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "Z")
    public static boolean field1368 = false;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "[Ljava/lang/Object;")
    private Object[] field1352;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "[Z")
    public static boolean[] field1361;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1371;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z", line = 4)
    private final boolean method684(int arg0, int arg1) {
        if (arg0 > -71) {
            this.method709(39);
        }
        field1342++;
        if (!this.method714(0)) {
            return false;
        } else if (arg1 >= 0 && this.field1349.field4414.length > arg1 && this.field1349.field4414[arg1] != 0) {
            return true;
        } else if (class284.field4429) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I", line = 30)
    public final int method685(byte arg0, int arg1) {
        field1369++;
        if (arg0 == 15) {
            return this.method684(-114, arg1) ? this.field1349.field4414[arg1] : 0;
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 48)
    public final boolean method686(String arg0, byte arg1) {
        field1340++;
        if (this.method714(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1349.field4398.method1439(class335.method2340(var3, 12596), (byte) -41);
            return arg1 < 7 ? true : this.method697(var4, (byte) -8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I", line = 67)
    public final int method687(byte arg0) {
        field1351++;
        if (this.method714(0)) {
            return arg0 == 20 ? this.field1349.field4414.length : -124;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I", line = 83)
    public final int[] method688(int arg0, int arg1) {
        field1362++;
        if (arg1 != 23201) {
            field1368 = false;
        }
        if (!this.method684(arg1 ^ 0xFFFFA52C, arg0)) {
            return null;
        }
        int[] var3 = this.field1349.field4408[arg0];
        if (var3 == null) {
            var3 = new int[this.field1349.field4401[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 114)
    public static final void method689(int arg0) {
        field1364++;
        class204.field3136.method1136(-97);
        int var1 = class204.field3136.method1132(8, 123);
        if (var1 < class52.field702) {
            for (int var2 = var1; var2 < class52.field702; var2++) {
                class291.field4479[class110.field1668++] = class272.field4252[var2];
            }
        }
        if (var1 > class52.field702) {
            throw new RuntimeException("gnpov1");
        }
        class52.field702 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class272.field4252[var3];
            class76 var5 = class264.field4064[var4];
            int var6 = class204.field3136.method1132(1, 119);
            if (var6 == 0) {
                class272.field4252[class52.field702++] = var4;
                var5.field4711 = class233.field3542;
            } else {
                int var7 = class204.field3136.method1132(2, 110);
                if (var7 == 0) {
                    class272.field4252[class52.field702++] = var4;
                    var5.field4711 = class233.field3542;
                    class219.field3351[class67.field970++] = var4;
                } else if (var7 == 1) {
                    class272.field4252[class52.field702++] = var4;
                    var5.field4711 = class233.field3542;
                    int var12 = class204.field3136.method1132(3, 127);
                    var5.method2091(1, var12, false);
                    int var13 = class204.field3136.method1132(1, 113);
                    if (var13 == 1) {
                        class219.field3351[class67.field970++] = var4;
                    }
                } else if (var7 == 2) {
                    class272.field4252[class52.field702++] = var4;
                    var5.field4711 = class233.field3542;
                    if (class204.field3136.method1132(1, 115) == 1) {
                        int var9 = class204.field3136.method1132(3, 113);
                        var5.method2091(2, var9, false);
                        int var10 = class204.field3136.method1132(3, 110);
                        var5.method2091(2, var10, false);
                    } else {
                        int var8 = class204.field3136.method1132(3, 119);
                        var5.method2091(0, var8, false);
                    }
                    int var11 = class204.field3136.method1132(1, 114);
                    if (var11 == 1) {
                        class219.field3351[class67.field970++] = var4;
                    }
                } else if (var7 == 3) {
                    class291.field4479[class110.field1668++] = var4;
                }
            }
        }
        if (arg0 > -91) {
            field1353 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjava/lang/String;)I", line = 229)
    public final int method690(byte arg0, String arg1) {
        field1375++;
        if (!this.method714(0)) {
            return -1;
        }
        if (arg0 >= -107) {
            method708(-59, (class58[]) null);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1349.field4398.method1439(class335.method2340(var3, 12596), (byte) -41);
        return this.method684(-73, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)[B", line = 262)
    public final byte[] method691(int arg0, byte arg1, int arg2) {
        field1341++;
        if (!this.method698(-127, arg0, arg2)) {
            return null;
        }
        if (arg1 < 40) {
            this.method694(-20);
        }
        if (this.field1371[arg0] == null || this.field1371[arg0][arg2] == null) {
            boolean var4 = this.method703((int[]) null, 112, arg0);
            if (!var4) {
                this.method713(arg0, 31196);
                boolean var5 = this.method703((int[]) null, 126, arg0);
                if (!var5) {
                    return null;
                }
            }
        }
        return class297.method2050(this.field1371[arg0][arg2], false, 1);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)V", line = 293)
    private final void method692(int arg0, int arg1) {
        field1335++;
        this.field1354.method1906((byte) -52, arg0);
        if (arg1 < 18) {
            this.method702((String) null, (String) null, -127);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 306)
    public static final void method693(int arg0) {
        if (arg0 != 5) {
            field1353 = (class99) null;
        }
        class242.field3680.method750((byte) 126);
        field1338++;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V", line = 317)
    public final void method694(int arg0) {
        field1345++;
        if (this.field1371 != null) {
            for (int var2 = 0; var2 < this.field1371.length; var2++) {
                this.field1371[var2] = null;
            }
        }
        if (arg0 > -88) {
            this.method706((byte) 6);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[I)[B", line = 341)
    public final byte[] method695(int arg0, int arg1, int arg2, int[] arg3) {
        field1337++;
        if (!this.method698(-127, arg1, arg2)) {
            return null;
        }
        if (arg0 <= 61) {
            this.field1373 = true;
        }
        if (this.field1371[arg1] == null || this.field1371[arg1][arg2] == null) {
            boolean var5 = this.method703(arg3, 122, arg1);
            if (!var5) {
                this.method713(arg1, 31196);
                boolean var6 = this.method703(arg3, -64, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class297.method2050(this.field1371[arg1][arg2], false, 1);
        if (this.field1373) {
            this.field1371[arg1][arg2] = null;
            if (this.field1349.field4414[arg1] == 1) {
                this.field1371[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lgl;ZZ)V", line = 1065)
    public class95(class273 arg0, boolean arg1, boolean arg2) {
        this.field1374 = arg1;
        this.field1373 = arg2;
        this.field1354 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IBI)[B", line = 391)
    public final byte[] method696(int arg0, byte arg1, int arg2) {
        if (arg1 < 93) {
            return (byte[]) null;
        } else {
            field1366++;
            return this.method695(106, arg2, arg0, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)Z", line = 405)
    public final boolean method697(int arg0, byte arg1) {
        field1348++;
        if (arg1 != -8) {
            return false;
        } else if (!this.method684(-81, arg0)) {
            return false;
        } else if (this.field1352[arg0] == null) {
            this.method713(arg0, 31196);
            return this.field1352[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z", line = 428)
    private final boolean method698(int arg0, int arg1, int arg2) {
        if (arg0 >= -126) {
            this.field1373 = true;
        }
        field1356++;
        if (!this.method714(0)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && arg1 < this.field1349.field4414.length && arg2 < this.field1349.field4414[arg1]) {
            return true;
        } else if (class284.field4429) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;)V", line = 452)
    public final void method699(int arg0, String arg1) {
        field1346++;
        int var3 = -21 / ((arg0 - 26) / 44);
        if (this.method714(0)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field1349.field4398.method1439(class335.method2340(var4, 12596), (byte) -41);
            this.method692(var5, 74);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZZ)V", line = 474)
    public final void method700(byte arg0, boolean arg1, boolean arg2) {
        field1360++;
        if (!this.method714(0)) {
            return;
        }
        int var4 = -113 / ((36 - arg0) / 42);
        if (arg1) {
            this.field1349.field4398 = null;
            this.field1349.field4413 = null;
        }
        if (arg2) {
            this.field1349.field4412 = null;
            this.field1349.field4416 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V", line = 502)
    public final void method701(int arg0, int arg1) {
        field1365++;
        if (!this.method684(arg0 ^ 0x17D6, arg1)) {
            return;
        }
        if (this.field1371 != null) {
            this.field1371[arg1] = null;
        }
        if (arg0 != -6048) {
            this.method716(0, 112, -96);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 519)
    public final boolean method702(String arg0, String arg1, int arg2) {
        field1339++;
        if (!this.method714(arg2 + 10602)) {
            return false;
        }
        if (arg2 != -10602) {
            this.method691(77, (byte) -90, -46);
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field1349.field4398.method1439(class335.method2340(var4, 12596), (byte) -41);
        if (this.method684(-119, var6)) {
            int var7 = this.field1349.field4412[var6].method1439(class335.method2340(var5, 12596), (byte) -41);
            return this.method716(var7, 15177, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([III)Z", line = 543)
    private final boolean method703(int[] arg0, int arg1, int arg2) {
        field1336++;
        int var4 = 16 / ((arg1 - 58) / 43);
        if (!this.method684(-125, arg2)) {
            return false;
        } else if (this.field1352[arg2] == null) {
            return false;
        } else {
            int[] var5 = this.field1349.field4408[arg2];
            int var6 = this.field1349.field4401[arg2];
            if (this.field1371[arg2] == null) {
                this.field1371[arg2] = new Object[this.field1349.field4414[arg2]];
            }
            Object[] var7 = this.field1371[arg2];
            boolean var8 = true;
            for (int var9 = 0; var9 < var6; var9++) {
                int var10;
                if (var5 == null) {
                    var10 = var9;
                } else {
                    var10 = var5[var9];
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
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class297.method2050(this.field1352[arg2], false, 1);
            } else {
                var11 = class297.method2050(this.field1352[arg2], true, 1);
                class254 var12 = new class254(var11);
                var12.method1735(arg0, 5, (byte) -97, var12.field3840.length);
            }
            byte[] var13;
            try {
                var13 = class267.method1875(120, var11);
            } catch (RuntimeException var32) {
                throw class170.method1285(var32, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class309.method2120(var11, var11.length, 200) + "," + class309.method2120(var11, var11.length - 2, 200) + "," + this.field1349.field4421[arg2] + "," + this.field1349.field4397);
            }
            if (this.field1374) {
                this.field1352[arg2] = null;
            }
            if (var6 <= 1) {
                int var15;
                if (var5 == null) {
                    var15 = 0;
                } else {
                    var15 = var5[0];
                }
                if (this.field1373) {
                    var7[var15] = var13;
                } else {
                    var7[var15] = class325.method2253(var13, 2, false);
                }
            } else {
                int[] var16 = new int[var6];
                int var17 = var13.length;
                int var33 = var17 - 1;
                int var18 = var13[var33] & 0xFF;
                class254 var19 = new class254(var13);
                int var20 = var33 - var6 * var18 * 4;
                var19.field3866 = var20;
                for (int var21 = 0; var21 < var18; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var6; var23++) {
                        var22 += var19.method1741(-32769);
                        if (var5 != null) {
                        }
                        var16[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var6][];
                for (int var25 = 0; var25 < var6; var25++) {
                    var24[var25] = new byte[var16[var25]];
                    var16[var25] = 0;
                }
                var19.field3866 = var20;
                int var26 = 0;
                for (int var27 = 0; var27 < var18; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var6; var29++) {
                        var28 += var19.method1741(-32769);
                        class126.method947(var13, var26, var24[var29], var16[var29], var28);
                        var26 += var28;
                        var16[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var6; var30++) {
                    int var31;
                    if (var5 == null) {
                        var31 = var30;
                    } else {
                        var31 = var5[var30];
                    }
                    if (this.field1373) {
                        var7[var31] = var24[var30];
                    } else {
                        var7[var31] = class325.method2253(var24[var30], 2, false);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 738)
    public final int method704(String arg0, byte arg1) {
        if (arg1 != 98) {
            return -62;
        }
        field1367++;
        if (this.method714(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1349.field4398.method1439(class335.method2340(var3, 12596), (byte) -41);
            return this.method710(var4, arg1 - 147);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 758)
    public static void method705(byte arg0) {
        field1353 = null;
        if (arg0 != 123) {
            field1353 = (class99) null;
        }
        field1361 = null;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z", line = 770)
    public final boolean method706(byte arg0) {
        field1372++;
        if (!this.method714(0)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 <= 49) {
            method693(99);
        }
        for (int var3 = 0; var3 < this.field1349.field4405.length; var3++) {
            int var4 = this.field1349.field4405[var3];
            if (this.field1352[var4] == null) {
                this.method713(var4, 31196);
                if (this.field1352[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)Z", line = 806)
    public final boolean method707(int arg0, byte arg1) {
        field1350++;
        if (!this.method714(0)) {
            return false;
        } else if (this.field1349.field4414.length == 1) {
            return this.method716(arg0, 15177, 0);
        } else if (this.method684(-102, arg0)) {
            if (arg1 <= 12) {
                this.field1374 = false;
            }
            if (this.field1349.field4414[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method716(0, 15177, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[Lfn;)V", line = 832)
    public static final void method708(int arg0, class58[] arg1) {
        class251.field3797[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I", line = 836)
    public final int method709(int arg0) {
        field1357++;
        if (arg0 != -13106) {
            this.field1373 = false;
        }
        if (!this.method714(0)) {
            throw new IllegalStateException("");
        }
        return this.field1349.field4397;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(II)I", line = 850)
    private final int method710(int arg0, int arg1) {
        field1359++;
        if (!this.method684(-121, arg0)) {
            return 0;
        } else if (this.field1352[arg0] == null) {
            int var3 = 15 % ((74 - arg1) / 51);
            return this.field1354.method1908((byte) -66, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B", line = 866)
    public final byte[] method711(String arg0, int arg1, String arg2) {
        field1370++;
        if (!this.method714(0)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1349.field4398.method1439(class335.method2340(var4, 12596), (byte) -41);
        if (!this.method684(arg1 - 115, var6)) {
            return null;
        }
        if (arg1 != 8) {
            this.method695(-117, 72, -109, (int[]) null);
        }
        int var7 = this.field1349.field4412[var6].method1439(class335.method2340(var5, 12596), (byte) -41);
        return this.method696(var7, (byte) 107, var6);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 890)
    public final boolean method712(String arg0, int arg1) {
        field1343++;
        if (this.method714(0)) {
            int var3 = -115 % ((arg1 + 59) / 44);
            String var4 = arg0.toLowerCase();
            int var5 = this.field1349.field4398.method1439(class335.method2340(var4, 12596), (byte) -41);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(II)V", line = 910)
    private final void method713(int arg0, int arg1) {
        field1355++;
        if (arg1 != 31196) {
            return;
        }
        if (this.field1374) {
            this.field1352[arg0] = this.field1354.method1909(0, arg0);
        } else {
            this.field1352[arg0] = class325.method2253(this.field1354.method1909(0, arg0), 2, false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)Z", line = 929)
    private final boolean method714(int arg0) {
        if (arg0 != 0) {
            return false;
        }
        field1363++;
        if (this.field1349 == null) {
            this.field1349 = this.field1354.method1904(true);
            if (this.field1349 == null) {
                return false;
            }
            this.field1352 = new Object[this.field1349.field4402];
            this.field1371 = new Object[this.field1349.field4402][];
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)[B", line = 959)
    public final byte[] method715(byte arg0, int arg1) {
        field1347++;
        if (!this.method714(0)) {
            return null;
        }
        if (arg0 < 35) {
            this.field1374 = true;
        }
        if (this.field1349.field4414.length == 1) {
            return this.method696(arg1, (byte) 103, 0);
        } else if (!this.method684(-86, arg1)) {
            return null;
        } else if (this.field1349.field4414[arg1] == 1) {
            return this.method696(0, (byte) 113, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)Z", line = 986)
    public final boolean method716(int arg0, int arg1, int arg2) {
        field1344++;
        if (!this.method698(-128, arg2, arg0)) {
            return false;
        }
        if (arg1 != 15177) {
            this.field1349 = (class283) null;
        }
        if (this.field1371[arg2] != null && this.field1371[arg2][arg0] != null) {
            return true;
        } else if (this.field1352[arg2] == null) {
            this.method713(arg2, arg1 ^ 0x4295);
            return this.field1352[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I", line = 1014)
    public final int method717(boolean arg0) {
        field1358++;
        if (!this.method714(0)) {
            return 0;
        }
        if (!arg0) {
            this.field1352 = (Object[]) null;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1352.length; var4++) {
            if (this.field1349.field4401[var4] > 0) {
                var3 += 100;
                var2 += this.method710(var4, 0);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }
}

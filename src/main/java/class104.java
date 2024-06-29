import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class104 {

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "Lmc;")
    private class326 field1371 = null;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "Lwa;")
    private class420 field1377;

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
    private boolean field1349;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "Lvq;")
    public static class24 field1361 = new class24(63, -1);

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ct", name = "S", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ct", name = "V", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ct", name = "T", descriptor = "Lae;")
    public static class285 field1387;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "[Ljava/lang/Object;")
    private Object[] field1365;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1366;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)Lsf;")
    public static final class148 method700(int arg0, int arg1) {
        field1347++;
        class148 var2 = (class148) class326.field4793.method2310((byte) -126, (long) arg1);
        if (arg0 != -21855) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class437.field6380.method715(arg1, (byte) 50, 1);
            class148 var4 = new class148();
            if (var3 != null) {
                var4.method1019(arg1, new class256(var3), arg0 ^ 0xFFFFAAA1);
            }
            class326.field4793.method2299(true, var4, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static final void method701(byte arg0) {
        field1386++;
        class101 var1 = null;
        try {
            class350 var2 = class267.field3963.method2200(2);
            while (var2.field5134 == 0) {
                class418.method2587(false, 1L);
            }
            if (var2.field5134 == 1) {
                var1 = (class101) var2.field5129;
                byte[] var3 = new byte[(int) var1.method679((byte) 63)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method683(var4, 0, var3, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class209.method1441((byte) 2, new class256(var3));
            }
            if (arg0 >= -25) {
                field1361 = null;
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method681((byte) 65);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIZ)V")
    public final void method702(boolean arg0, int arg1, boolean arg2) {
        field1356++;
        if (!this.method727(false)) {
            return;
        }
        if (arg0) {
            this.field1371.field4801 = null;
            this.field1371.field4792 = null;
        }
        if (arg1 < 113) {
            this.method717(37, 66);
        }
        if (arg2) {
            this.field1371.field4790 = null;
            this.field1371.field4803 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V")
    public final void method703(byte arg0) {
        if (arg0 >= -65) {
            return;
        }
        field1368++;
        if (this.field1365 != null) {
            for (int var2 = 0; var2 < this.field1365.length; var2++) {
                this.field1365[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[II)Z")
    private final boolean method704(int arg0, int arg1, int[] arg2, int arg3) {
        field1343++;
        if (!this.method717(arg0, 115)) {
            return false;
        } else if (this.field1365[arg0] == null) {
            return false;
        } else {
            int var5 = this.field1371.field4802[arg0];
            int[] var6 = this.field1371.field4795[arg0];
            if (this.field1366[arg0] == null) {
                this.field1366[arg0] = new Object[this.field1371.field4791[arg0]];
            }
            int var7 = 61 % ((-arg1 - 31) / 61);
            Object[] var8 = this.field1366[arg0];
            boolean var9 = true;
            for (int var10 = 0; var10 < var5; var10++) {
                int var11;
                if (var6 == null) {
                    var11 = var10;
                } else {
                    var11 = var6[var10];
                }
                if (var8[var11] == null) {
                    var9 = false;
                    break;
                }
            }
            if (var9) {
                return true;
            }
            byte[] var12;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var12 = class248.method1644(this.field1365[arg0], (byte) -121, false);
            } else {
                var12 = class248.method1644(this.field1365[arg0], (byte) -124, true);
                class256 var13 = new class256(var12);
                var13.method1714(arg2, 5, var13.field3764.length, -118);
            }
            byte[] var14;
            try {
                var14 = class31.method308((byte) 79, var12);
            } catch (RuntimeException var50) {
                throw class124.method841(var50, "T3 - " + (arg2 != null) + "," + arg0 + "," + var12.length + "," + class356.method2272(var12.length, (byte) 39, var12) + "," + class356.method2272(var12.length - 2, (byte) 65, var12) + "," + this.field1371.field4797[arg0] + "," + this.field1371.field4786);
            }
            if (this.field1349) {
                this.field1365[arg0] = null;
            }
            if (var5 <= 1) {
                int var49;
                if (var6 == null) {
                    var49 = 0;
                } else {
                    var49 = var6[0];
                }
                if (this.field1369 == 0) {
                    var8[var49] = class196.method1367(var14, false, (byte) 33);
                } else {
                    var8[var49] = var14;
                }
            } else if (this.field1369 == 2) {
                int var32 = var14.length;
                int var52 = var32 - 1;
                int var33 = var14[var52] & 0xFF;
                int var34 = var52 - var5 * var33 * 4;
                class256 var35 = new class256(var14);
                int var36 = 0;
                var35.field3762 = var34;
                int var37 = 0;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method1746(20972);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg3 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field3762 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method1746(20972);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg3 == var48) {
                            class224.method1539(var14, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var8[var37] = var42;
            } else {
                int var16 = var14.length;
                int var51 = var16 - 1;
                int var17 = var14[var51] & 0xFF;
                int var18 = var51 - var17 * 4 * var5;
                class256 var19 = new class256(var14);
                var19.field3762 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method1746(20972);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field3762 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method1746(20972);
                        class224.method1539(var14, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field1369 == 0) {
                        var8[var31] = class196.method1367(var24[var30], false, (byte) 33);
                    } else {
                        var8[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIB[I)[B")
    public final byte[] method705(int arg0, int arg1, byte arg2, int[] arg3) {
        field1346++;
        if (!this.method711(arg1, 104, arg0)) {
            return null;
        }
        if (this.field1366[arg0] == null || this.field1366[arg0][arg1] == null) {
            boolean var5 = this.method704(arg0, 104, arg3, arg1);
            if (!var5) {
                this.method719(arg0, 106);
                boolean var6 = this.method704(arg0, -119, arg3, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg2 <= 96) {
            this.field1371 = null;
        }
        byte[] var7 = class248.method1644(this.field1366[arg0][arg1], (byte) -92, false);
        if (this.field1369 == 1) {
            this.field1366[arg0][arg1] = null;
            if (this.field1371.field4791[arg0] == 1) {
                this.field1366[arg0] = null;
            }
        } else if (this.field1369 == 2) {
            this.field1366[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)Z")
    public final boolean method706(int arg0, byte arg1) {
        field1367++;
        if (!this.method717(arg0, 76)) {
            return false;
        } else if (this.field1365[arg0] == null) {
            this.method719(arg0, 75);
            if (arg1 >= -94) {
                this.field1366 = null;
            }
            return this.field1365[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method707(int arg0, String arg1) {
        field1380++;
        if (!this.method727(false)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -1) {
            this.method704(97, 66, (int[]) null, 10);
        }
        int var4 = this.field1371.field4790.method1440(class29.method297(var3, (byte) -101), (byte) -114);
        return this.method717(var4, 77) ? var4 : -1;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(IB)Z")
    public final boolean method708(int arg0, byte arg1) {
        field1379++;
        if (!this.method727(false)) {
            return false;
        }
        if (arg1 >= -88) {
            this.field1365 = null;
        }
        if (this.field1371.field4791.length == 1) {
            return this.method716(-32096, arg0, 0);
        } else if (!this.method717(arg0, 93)) {
            return false;
        } else if (this.field1371.field4791[arg0] == 1) {
            return this.method716(-32096, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)Z")
    public static final boolean method709(boolean arg0, int arg1) {
        if (!arg0) {
            method728((byte) 110);
        }
        field1372++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(IB)[I")
    public final int[] method710(int arg0, byte arg1) {
        field1358++;
        if (!this.method717(arg0, 113)) {
            return null;
        } else if (arg1 >= -28) {
            return null;
        } else {
            int[] var3 = this.field1371.field4795[arg0];
            if (var3 == null) {
                var3 = new int[this.field1371.field4802[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
    private final boolean method711(int arg0, int arg1, int arg2) {
        field1354++;
        if (!this.method727(false)) {
            return false;
        }
        int var4 = 92 / ((34 - arg1) / 63);
        if (arg2 >= 0 && arg0 >= 0 && this.field1371.field4791.length > arg2 && arg0 < this.field1371.field4791[arg2]) {
            return true;
        } else if (class142.field1936) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
    public final int method712(boolean arg0) {
        if (arg0) {
            field1361 = null;
        }
        field1353++;
        return this.method727(arg0) ? this.field1371.field4791.length : -1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method713(String arg0, int arg1) {
        field1344++;
        if (this.method727(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1371.field4790.method1440(class29.method297(var3, (byte) -61), (byte) -109);
            this.method714(var4, arg1 + arg1);
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
    private final void method714(int arg0, int arg1) {
        field1384++;
        if (arg1 == 0) {
            this.field1377.method1999((byte) -127, arg0);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBI)[B")
    public final byte[] method715(int arg0, byte arg1, int arg2) {
        field1345++;
        if (arg1 <= 31) {
            this.field1377 = null;
        }
        return this.method705(arg2, arg0, (byte) 118, (int[]) null);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(III)Z")
    public final boolean method716(int arg0, int arg1, int arg2) {
        field1362++;
        if (!this.method711(arg1, -67, arg2)) {
            return false;
        }
        if (arg0 != -32096) {
            this.method732((String) null, (String) null, (byte) 4);
        }
        if (this.field1366[arg2] != null && this.field1366[arg2][arg1] != null) {
            return true;
        } else if (this.field1365[arg2] == null) {
            this.method719(arg2, arg0 + 32171);
            return this.field1365[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)Z")
    private final boolean method717(int arg0, int arg1) {
        field1348++;
        if (arg1 < 75) {
            return false;
        } else if (!this.method727(false)) {
            return false;
        } else if (arg0 >= 0 && this.field1371.field4791.length > arg0 && this.field1371.field4791[arg0] != 0) {
            return true;
        } else if (class142.field1936) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(Z)Z")
    public final boolean method718(boolean arg0) {
        field1373++;
        if (!this.method727(arg0)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1371.field4787.length; var3++) {
            int var4 = this.field1371.field4787[var3];
            if (this.field1365[var4] == null) {
                this.method719(var4, 106);
                if (this.field1365[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(II)V")
    private final void method719(int arg0, int arg1) {
        field1381++;
        if (arg1 <= 36) {
            this.method713((String) null, -123);
        }
        if (this.field1349) {
            this.field1365[arg0] = this.field1377.method2007(arg0, true);
        } else {
            this.field1365[arg0] = class196.method1367(this.field1377.method2007(arg0, true), false, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public final void method720(int arg0) {
        field1359++;
        if (this.field1366 != null) {
            for (int var2 = 0; var2 < this.field1366.length; var2++) {
                this.field1366[var2] = null;
            }
        }
        if (arg0 != 24394) {
            this.field1377 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lfp;I)V")
    public static final void method721(class9 arg0, int arg1) {
        field1342++;
        if (class212.field2993 == class187.field2619.field4960 || class178.field2530 == null) {
            return;
        }
        if (arg1 != 10785) {
            method728((byte) -127);
        }
        if (class342.method2225(arg0, class187.field2619.field4960, 102)) {
            class212.field2993 = class187.field2619.field4960;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method722(long arg0, boolean arg1) {
        if (!arg1) {
            field1387 = null;
        }
        field1370++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class247.field3644[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)I")
    public final int method723(int arg0) {
        field1363++;
        if (!this.method727(false)) {
            throw new IllegalStateException("");
        }
        if (arg0 > -56) {
            this.method718(true);
        }
        return this.field1371.field4786;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(II)I")
    public final int method724(int arg0, int arg1) {
        field1389++;
        if (!this.method727(false)) {
            return -1;
        }
        if (arg1 != 37) {
            this.method717(-59, 65);
        }
        int var3 = this.field1371.field4790.method1440(arg0, (byte) -120);
        return this.method717(var3, 119) ? var3 : -1;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V")
    public static void method725(int arg0) {
        if (arg0 >= -47) {
            method701((byte) -116);
        }
        field1361 = null;
        field1387 = null;
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)Ljr;")
    public static final class239 method726(int arg0) {
        if (arg0 == -279) {
            field1375++;
            return class66.field848;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(Z)Z")
    private final boolean method727(boolean arg0) {
        field1357++;
        if (this.field1371 == null) {
            this.field1371 = this.field1377.method2002((byte) -105);
            if (this.field1371 == null) {
                return false;
            }
            this.field1366 = new Object[this.field1371.field4794][];
            this.field1365 = new Object[this.field1371.field4794];
        }
        return !arg0;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)V")
    public static final void method728(byte arg0) {
        field1350++;
        class404.method2524(true);
        class359.method2286(23114);
        class423.method2606(false);
        class354.method2263(-13);
        class165.method1093(false);
        class157.field2119.method186((byte) 107);
        class319.method2105(false);
        class400.method2501(5219);
        class276.method1880((byte) 93);
        class339.method2191((byte) -35);
        class129.method865((byte) 127);
        class78.method542(-14274);
        class100.method660(-29665);
        class83.method557((byte) -106);
        class106.method758(84);
        class47.method386(-16032);
        class17.method222(-9916);
        class298.method1983((byte) -100);
        class403.method2515((byte) 126);
        class206.method1415((byte) 75);
        class234.method1592(100);
        class186.method1272(-85);
        class295.method1959(false);
        class327.field4877.method2307(20);
        class286.field4195.method2307(35);
        class450.field6642.method2307(-121);
        class322.field4751.method2307(62);
        class107.field1461.method2307(-92);
        if (arg0 < 78) {
            method701((byte) -115);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)Z")
    public static final boolean method729(byte arg0, int arg1) {
        field1388++;
        if (arg0 != 78) {
            return false;
        }
        class177 var2 = class288.method1929((byte) 14, arg1);
        if (var2 == null) {
            return false;
        } else if (class341.field5007 == 3) {
            String var3 = "";
            if (class373.field5452 != 0) {
                var3 = ":" + (var2.field2445 + 7000);
            }
            String var4 = "";
            if (class180.field2554 != null) {
                var4 = "/p=" + class180.field2554;
            }
            String var5 = "http://" + var2.field2448 + var3 + "/l=" + class153.field2073 + "/a=" + class22.field320 + var4 + "/j" + (class354.field5166 ? "1" : "0") + ",o" + (class37.field529 ? "1" : "0") + ",a2";
            try {
                class401.field5797.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class403.field5825 = var2.field2445;
            class304.field4445 = var2.field2448;
            if (class373.field5452 != 0) {
                class160.field2147 = class403.field5825 + 40000;
                class383.field5612 = class403.field5825 + 50000;
                class465.field6851 = class160.field2147;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)I")
    public final int method730(byte arg0) {
        field1382++;
        if (!this.method727(false)) {
            return 0;
        }
        if (arg0 >= -55) {
            this.method716(-105, -31, 39);
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1365.length; var4++) {
            if (this.field1371.field4802[var4] > 0) {
                var3 += this.method731(100, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(II)I")
    private final int method731(int arg0, int arg1) {
        if (arg0 != 100) {
            this.field1371 = null;
        }
        field1352++;
        if (this.method717(arg1, 113)) {
            return this.field1365[arg1] == null ? this.field1377.method2006(126, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method732(String arg0, String arg1, byte arg2) {
        field1378++;
        if (!this.method727(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        if (arg2 != 25) {
            return true;
        }
        int var6 = this.field1371.field4790.method1440(class29.method297(var4, (byte) -71), (byte) -106);
        if (this.method717(var6, arg2 + 60)) {
            int var7 = this.field1371.field4792[var6].method1440(class29.method297(var5, (byte) -49), (byte) -106);
            return this.method716(-32096, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "(II)[B")
    public final byte[] method733(int arg0, int arg1) {
        field1351++;
        if (!this.method727(false)) {
            return null;
        } else if (this.field1371.field4791.length == 1) {
            return this.method715(arg1, (byte) 105, 0);
        } else if (arg0 != 0) {
            return null;
        } else if (!this.method717(arg1, 106)) {
            return null;
        } else if (this.field1371.field4791[arg1] == 1) {
            return this.method715(0, (byte) 112, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "(II)I")
    public final int method734(int arg0, int arg1) {
        field1385++;
        if (this.method717(arg1, 111)) {
            if (arg0 <= 38) {
                this.method719(-14, -13);
            }
            return this.field1371.field4791[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method735(int arg0, String arg1) {
        field1383++;
        if (this.method727(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1371.field4790.method1440(class29.method297(var3, (byte) -86), (byte) -124);
            return arg0 >= ~var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method736(int arg0, String arg1) {
        field1364++;
        if (!this.method727(false)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1371.field4790.method1440(class29.method297(var3, (byte) -60), (byte) -104);
        if (arg0 != 7000) {
            this.field1349 = false;
        }
        return this.method706(var4, (byte) -117);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(BI)V")
    public final void method737(byte arg0, int arg1) {
        field1376++;
        if (!this.method717(arg1, 115)) {
            return;
        }
        if (this.field1366 != null) {
            this.field1366[arg1] = null;
        }
        if (arg0 != 104) {
            this.field1349 = true;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lwa;ZI)V")
    public class104(class420 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1377 = arg0;
        this.field1369 = arg2;
        this.field1349 = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
    public final byte[] method738(String arg0, String arg1, byte arg2) {
        field1374++;
        if (!this.method727(false)) {
            return null;
        } else if (arg2 > -27) {
            return null;
        } else {
            String var4 = arg0.toLowerCase();
            String var5 = arg1.toLowerCase();
            int var6 = this.field1371.field4790.method1440(class29.method297(var4, (byte) 117), (byte) -122);
            if (this.method717(var6, 88)) {
                int var7 = this.field1371.field4792[var6].method1440(class29.method297(var5, (byte) -105), (byte) -124);
                return this.method715(var7, (byte) 112, var6);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method739(String arg0, boolean arg1) {
        field1360++;
        if (!this.method727(false)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1371.field4790.method1440(class29.method297(var3, (byte) 96), (byte) -111);
        if (!arg1) {
            this.field1349 = false;
        }
        return this.method731(100, var4);
    }
}

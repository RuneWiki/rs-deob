import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class239 {

    @OriginalMember(owner = "client!he", name = "v", descriptor = "Lvn;")
    private class195 field3360 = null;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
    private boolean field3363;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Les;")
    private class247 field3348;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field3340 = -1;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field3351 = -1;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field3352 = 0;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3346 = new String[100];

    @OriginalMember(owner = "client!he", name = "C", descriptor = "[I")
    public static int[] field3367 = new int[14];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[Ljava/lang/Object;")
    private Object[] field3354;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3377;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[[[Lhg;")
    public static class468[][][] field3347;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Z")
    public final boolean method1442(int arg0, byte arg1) {
        field3357++;
        if (!this.method1451(86)) {
            return false;
        } else if (arg1 >= -103) {
            return true;
        } else if (this.field3360.field2763.length == 1) {
            return this.method1445(66, arg0, 0);
        } else if (!this.method1475(arg0, 0)) {
            return false;
        } else if (this.field3360.field2763[arg0] == 1) {
            return this.method1445(48, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III[I)Z")
    private final boolean method1443(int arg0, int arg1, int arg2, int[] arg3) {
        field3384++;
        if (!this.method1475(arg1, 0)) {
            return false;
        } else if (this.field3354[arg1] == null) {
            return false;
        } else {
            int var5 = this.field3360.field2751[arg1];
            int[] var6 = this.field3360.field2764[arg1];
            if (this.field3377[arg1] == null) {
                this.field3377[arg1] = new Object[this.field3360.field2763[arg1]];
            }
            Object[] var7 = this.field3377[arg1];
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
            if (arg0 != 6398) {
                this.method1448(-23);
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 != null && (arg3[0] != 0 || arg3[1] != 0 || arg3[2] != 0 || arg3[3] != 0)) {
                var11 = class475.method2780(true, -16777216, this.field3354[arg1]);
                class156 var12 = new class156(var11);
                var12.method957(false, 5, arg3, var12.field2041.length);
            } else {
                var11 = class475.method2780(false, arg0 ^ 0xFF0018FE, this.field3354[arg1]);
            }
            byte[] var13;
            try {
                var13 = class221.method1363((byte) -120, var11);
            } catch (RuntimeException var49) {
                throw class31.method252(var49, "T3 - " + (arg3 != null) + "," + arg1 + "," + var11.length + "," + class276.method1694(var11.length, (byte) 19, var11) + "," + class276.method1694(var11.length - 2, (byte) 19, var11) + "," + this.field3360.field2752[arg1] + "," + this.field3360.field2760);
            }
            if (this.field3363) {
                this.field3354[arg1] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field3355 == 0) {
                    var7[var48] = class283.method1719(arg0 - 6535, false, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field3355 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var32 * 4 * var5;
                class156 var34 = new class156(var13);
                int var35 = 0;
                var34.field2018 = var33;
                int var36 = 0;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method950(186);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg2 == var40) {
                            var35 += var38;
                            var36 = var40;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field2018 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method950(arg0 - 6212);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg2 == var47) {
                            class268.method1638(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class156 var18 = new class156(var13);
                int[] var19 = new int[var5];
                var18.field2018 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method950(186);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field2018 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method950(186);
                        class268.method1638(var13, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field3355 == 0) {
                        var7[var30] = class283.method1719(-137, false, var23[var29]);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1444(String arg0, byte arg1) {
        field3381++;
        if (!this.method1451(97)) {
            return -1;
        }
        if (arg1 <= 24) {
            field3351 = -13;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3360.field2762.method1622(class185.method1164(false, var3), 52);
        return this.method1475(var4, 0) ? var4 : -1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
    public final boolean method1445(int arg0, int arg1, int arg2) {
        field3370++;
        if (!this.method1471(arg1, (byte) 118, arg2)) {
            return false;
        } else if (this.field3377[arg2] != null && this.field3377[arg2][arg1] != null) {
            return true;
        } else if (this.field3354[arg2] == null) {
            this.method1474(-112, arg2);
            if (this.field3354[arg2] == null) {
                if (arg0 <= 45) {
                    this.field3348 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method1446(boolean arg0, String arg1) {
        field3373++;
        if (!this.method1451(91)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            this.field3354 = null;
        }
        int var4 = this.field3360.field2762.method1622(class185.method1164(arg0, var3), 97);
        return this.method1447((byte) -82, var4);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Z")
    public final boolean method1447(byte arg0, int arg1) {
        field3365++;
        if (!this.method1475(arg1, 0)) {
            return false;
        } else if (this.field3354[arg1] == null) {
            this.method1474(-56, arg1);
            if (arg0 == -82) {
                return this.field3354[arg1] != null;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
    public final boolean method1448(int arg0) {
        field3350++;
        if (!this.method1451(arg0 + 14697)) {
            return false;
        } else if (arg0 == -14605) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3360.field2755.length; var3++) {
                int var4 = this.field3360.field2755[var3];
                if (this.field3354[var4] == null) {
                    this.method1474(94, var4);
                    if (this.field3354[var4] == null) {
                        var2 = false;
                    }
                }
            }
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)I")
    private final int method1449(int arg0, byte arg1) {
        field3368++;
        if (this.method1475(arg0, 0)) {
            if (arg1 != 114) {
                this.method1459(null, null, -40);
            }
            return this.field3354[arg0] == null ? this.field3348.method1415(arg0, true) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BZZ)V")
    public final void method1450(byte arg0, boolean arg1, boolean arg2) {
        field3358++;
        if (arg0 >= -103) {
            field3352 = 126;
        }
        if (!this.method1451(111)) {
            return;
        }
        if (arg1) {
            this.field3360.field2754 = null;
            this.field3360.field2746 = null;
        }
        if (arg2) {
            this.field3360.field2762 = null;
            this.field3360.field2753 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Z")
    private final boolean method1451(int arg0) {
        field3383++;
        if (this.field3360 == null) {
            this.field3360 = this.field3348.method1419((byte) -126);
            if (this.field3360 == null) {
                return false;
            }
            this.field3377 = new Object[this.field3360.field2761][];
            this.field3354 = new Object[this.field3360.field2761];
        }
        return arg0 >= 81;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)I")
    public final int method1452(boolean arg0) {
        field3353++;
        if (!this.method1451(94)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3354.length; var4++) {
            if (this.field3360.field2751[var4] > 0) {
                var3 += this.method1449(var4, (byte) 114);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (arg0) {
            this.method1473(-36, -3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1453(String arg0, int arg1) {
        field3375++;
        if (!this.method1451(95)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 <= 63) {
            field3339 = -80;
        }
        int var4 = this.field3360.field2762.method1622(class185.method1164(false, var3), 41);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(BI)[I")
    public final int[] method1454(byte arg0, int arg1) {
        field3362++;
        if (arg0 != -91) {
            return null;
        } else if (this.method1475(arg1, 0)) {
            int[] var3 = this.field3360.field2764[arg1];
            if (var3 == null) {
                var3 = new int[this.field3360.field2751[arg1]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != 14852) {
            return;
        }
        field3371++;
        if (class473.field6839 <= arg6 && class63.field933 >= arg6 && arg3 >= class473.field6839 && arg3 <= class63.field933 && arg0 >= class473.field6839 && arg0 <= class63.field933 && arg7 >= class473.field6839 && class63.field933 >= arg7 && arg1 >= class7.field131 && arg1 <= class92.field1252 && arg9 >= class7.field131 && arg9 <= class92.field1252 && arg5 >= class7.field131 && arg5 <= class92.field1252 && arg2 >= class7.field131 && arg2 <= class92.field1252) {
            class423.method2522(arg6, arg8, arg5, arg2, arg7, arg9, arg0, -25332, arg3, arg1);
        } else {
            class323.method1940(arg6, arg3, arg1, arg0, arg9, arg7, arg2, arg5, 111, arg8);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    private final void method1456(int arg0, int arg1) {
        if (arg0 == 0) {
            field3379++;
            this.field3348.method1417(126, arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public final void method1457(int arg0) {
        if (this.field3377 != null) {
            for (int var2 = 0; var2 < this.field3377.length; var2++) {
                this.field3377[var2] = null;
            }
        }
        field3361++;
        if (arg0 != -3) {
            this.method1473(70, 125);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method1458(String arg0, int arg1) {
        if (arg1 != 27706) {
            this.field3355 = 31;
        }
        field3364++;
        if (this.method1451(93)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3360.field2762.method1622(class185.method1164(false, var3), 126);
            return this.method1449(var4, (byte) 114);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method1459(String arg0, String arg1, int arg2) {
        field3372++;
        if (!this.method1451(96)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        if (arg2 != -3) {
            return false;
        }
        int var6 = this.field3360.field2762.method1622(class185.method1164(false, var4), -115);
        if (this.method1475(var6, 0)) {
            int var7 = this.field3360.field2754[var6].method1622(class185.method1164(false, var5), -117);
            return this.method1445(arg2 ^ 0xFFFFFF83, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public final void method1460(byte arg0) {
        if (this.field3354 != null) {
            for (int var2 = 0; var2 < this.field3354.length; var2++) {
                this.field3354[var2] = null;
            }
        }
        if (arg0 != -28) {
            this.method1453(null, 22);
        }
        field3382++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[IZI)[B")
    public final byte[] method1461(int arg0, int[] arg1, boolean arg2, int arg3) {
        field3343++;
        if (!this.method1471(arg3, (byte) 108, arg0)) {
            return null;
        } else if (arg2) {
            if (this.field3377[arg0] == null || this.field3377[arg0][arg3] == null) {
                boolean var5 = this.method1443(6398, arg0, arg3, arg1);
                if (!var5) {
                    this.method1474(48, arg0);
                    boolean var6 = this.method1443(6398, arg0, arg3, arg1);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = class475.method2780(false, -16777216, this.field3377[arg0][arg3]);
            if (this.field3355 == 1) {
                this.field3377[arg0][arg3] = null;
                if (this.field3360.field2763[arg0] == 1) {
                    this.field3377[arg0] = null;
                }
            } else if (this.field3355 == 2) {
                this.field3377[arg0] = null;
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static void method1462(int arg0) {
        field3347 = null;
        field3367 = null;
        if (arg0 != -1) {
            method1462(26);
        }
        field3346 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)I")
    public final int method1463(boolean arg0, int arg1) {
        field3376++;
        if (!arg0) {
            return 91;
        } else if (this.method1451(107)) {
            int var3 = this.field3360.field2762.method1622(arg1, 120);
            return this.method1475(var3, 0) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    public final void method1464(int arg0, boolean arg1) {
        field3366++;
        if (!arg1 && this.method1475(arg0, 0) && this.field3377 != null) {
            this.field3377[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[B")
    public final byte[] method1465(int arg0, int arg1) {
        field3345++;
        if (!this.method1451(arg0 + 112)) {
            return null;
        } else if (this.field3360.field2763.length == 1) {
            return this.method1470(4, arg1, 0);
        } else if (!this.method1475(arg1, arg0)) {
            return null;
        } else if (this.field3360.field2763[arg1] == 1) {
            return this.method1470(4, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)I")
    public final int method1466(boolean arg0) {
        field3374++;
        if (arg0) {
            field3339 = -108;
        }
        return this.method1451(112) ? this.field3360.field2763.length : -1;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
    public final int method1467(int arg0) {
        field3378++;
        if (arg0 != 24320) {
            return -89;
        } else if (this.method1451(110)) {
            return this.field3360.field2760;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1468(int arg0, String arg1) {
        field3341++;
        if (arg0 < -23 && this.method1451(119)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3360.field2762.method1622(class185.method1164(false, var3), -124);
            this.method1456(0, var4);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
    public final byte[] method1469(String arg0, byte arg1, String arg2) {
        field3344++;
        if (!this.method1451(102)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        if (arg1 != 75) {
            field3347 = null;
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field3360.field2762.method1622(class185.method1164(false, var4), 69);
        if (this.method1475(var6, 0)) {
            int var7 = this.field3360.field2754[var6].method1622(class185.method1164(false, var5), arg1 - 39);
            return this.method1470(arg1 - 71, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)[B")
    public final byte[] method1470(int arg0, int arg1, int arg2) {
        if (arg0 != 4) {
            field3347 = null;
        }
        field3380++;
        return this.method1461(arg2, null, true, arg1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)Z")
    private final boolean method1471(int arg0, byte arg1, int arg2) {
        if (arg1 < 106) {
            return true;
        }
        field3349++;
        if (!this.method1451(115)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field3360.field2763.length && arg0 < this.field3360.field2763[arg2]) {
            return true;
        } else if (class368.field5532) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static final void method1472(byte arg0) {
        field3359++;
        class276.field3953 = 0;
        int var1 = 0;
        if (arg0 != -33) {
            field3339 = -20;
        }
        while (var1 < 2048) {
            class290.field4144[var1] = null;
            class69.field1019[var1] = 1;
            class135.field1726[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)I")
    public final int method1473(int arg0, int arg1) {
        if (arg0 != 4309) {
            this.method1447((byte) 7, -111);
        }
        field3342++;
        return this.method1475(arg1, 0) ? this.field3360.field2763[arg1] : 0;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(II)V")
    private final void method1474(int arg0, int arg1) {
        int var3 = -128 % ((1 - arg0) / 46);
        field3356++;
        if (this.field3363) {
            this.field3354[arg1] = this.field3348.method1410(arg1, (byte) 111);
        } else {
            this.field3354[arg1] = class283.method1719(-137, false, this.field3348.method1410(arg1, (byte) 122));
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(II)Z")
    private final boolean method1475(int arg0, int arg1) {
        field3369++;
        if (!this.method1451(115)) {
            return false;
        } else if (arg0 >= arg1 && arg0 < this.field3360.field2763.length && this.field3360.field2763[arg0] != 0) {
            return true;
        } else if (class368.field5532) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Les;ZI)V")
    public class239(class247 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3363 = arg1;
        this.field3348 = arg0;
        this.field3355 = arg2;
    }
}

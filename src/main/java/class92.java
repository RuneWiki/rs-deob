import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class92 extends class162 {

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
    private boolean field1323 = false;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Z")
    private boolean field1334 = false;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    private int field1338 = 0;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    private int field1358 = -1;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    private int field1349 = 0;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field1348 = -32768;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lsb;")
    private class131 field1341;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1329 = "white:";

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field1356 = 0;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field1362 = 0;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "Z")
    public static boolean field1359 = false;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "D")
    private double field1319;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "D")
    private double field1325;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "D")
    public double field1332;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "D")
    private double field1337;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "D")
    private double field1353;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "D")
    public double field1354;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "D")
    public double field1355;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "D")
    private double field1361;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Ldh;")
    private class145 field1326;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lpa;")
    public static class169 field1331;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()I", line = 9)
    public final int method192() {
        field1321++;
        return this.field1348;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1350++;
        if (!this.field1323) {
            class128 var6 = this.method606(4329);
            if (var6 == null) {
                return;
            }
            this.method605(var6, -29245);
        }
        if (this.field1326 != null) {
            this.field1326.method1038(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 370)
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1330 = arg6;
        this.field1328 = arg7;
        this.field1344 = arg3;
        this.field1351 = arg1;
        this.field1343 = arg5;
        this.field1340 = arg8;
        this.field1357 = arg10;
        this.field1334 = false;
        this.field1327 = arg0;
        this.field1324 = arg9;
        this.field1322 = arg4;
        this.field1339 = arg2;
        int var12 = class214.method1455((byte) -6, this.field1327).field2675;
        if (var12 == -1) {
            this.field1341 = null;
        } else {
            this.field1341 = class68.method476((byte) 114, var12);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lsm;I)V", line = 56)
    private final void method605(class128 arg0, int arg1) {
        if (class245.field3886) {
            class22 var4 = (class22) arg0;
            if ((this.field1326 == null || this.field1326.field2306) && (var4.field287 != null || var4.field282 != null)) {
                this.field1326 = new class145(class58.field875, 1, 1);
            }
            if (this.field1326 != null) {
                this.field1326.method1037(var4.field287, var4.field282, false, var4.field306, var4.field301, var4.field279);
            }
        } else {
            class67 var3 = (class67) arg0;
            if ((this.field1326 == null || this.field1326.field2306) && (var3.field975 != null || var3.field1002 != null)) {
                this.field1326 = new class145(class58.field875, 1, 1);
            }
            if (this.field1326 != null) {
                this.field1326.method1037(var3.field975, var3.field1002, false, var3.field973, var3.field969, var3.field990);
            }
        }
        this.field1323 = true;
        if (arg1 == -29245) {
            field1336++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lsm;", line = 101)
    private final class128 method606(int arg0) {
        field1363++;
        if (arg0 != 4329) {
            field1362 = 73;
        }
        class172 var2 = class214.method1455((byte) -6, this.field1327);
        class128 var3 = var2.method1186(-25079, this.field1338, this.field1349, this.field1358);
        if (var3 == null) {
            return null;
        } else {
            var3.method158(this.field1347);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIII)V", line = 123)
    public final void method607(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1334) {
            double var6 = (double) (arg4 - this.field1339);
            double var8 = (double) (arg1 - this.field1344);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1332 = (double) this.field1322;
            this.field1355 = (double) this.field1340 * var6 / var10 + (double) this.field1339;
            this.field1354 = (double) this.field1340 * var8 / var10 + (double) this.field1344;
        }
        field1360++;
        double var12 = (double) (this.field1330 + 1 - arg3);
        if (arg0 != 55) {
            this.field1355 = 0.2609190680560556D;
        }
        this.field1319 = ((double) arg1 - this.field1354) / var12;
        this.field1337 = ((double) arg4 - this.field1355) / var12;
        this.field1325 = Math.sqrt(this.field1337 * this.field1337 + this.field1319 * this.field1319);
        if (this.field1328 == -1) {
            this.field1353 = ((double) arg2 - this.field1332) / var12;
        } else {
            if (!this.field1334) {
                this.field1353 = -this.field1325 * Math.tan((double) this.field1328 * 0.02454369D);
            }
            this.field1361 = ((double) arg2 - this.field1332 - (this.field1353 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIJILdh;)V", line = 164)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class145 arg10) {
        field1345++;
        class128 var13 = this.method606(4329);
        if (var13 != null) {
            this.method605(var13, -29245);
            var13.method180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1326);
            this.field1348 = var13.method192();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V", line = 182)
    public final void method608(int arg0, boolean arg1) {
        if (this.field1328 == -1) {
            this.field1332 += (double) arg0 * this.field1353;
        } else {
            this.field1332 += this.field1361 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1353;
            this.field1353 += (double) arg0 * this.field1361;
        }
        field1320++;
        this.field1355 += (double) arg0 * this.field1337;
        this.field1334 = true;
        if (arg1) {
            this.field1354 = 0.55763551818206D;
        }
        this.field1354 += (double) arg0 * this.field1319;
        this.field1342 = (int) (Math.atan2(this.field1337, this.field1319) * 325.949D) + 1024 & 0x7FF;
        this.field1347 = (int) (Math.atan2(this.field1353, this.field1325) * 325.949D) & 0x7FF;
        if (this.field1341 == null) {
            return;
        }
        this.field1349 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1349 <= this.field1341.field2002[this.field1338]) {
                        return;
                    }
                    this.field1349 -= this.field1341.field2002[this.field1338];
                    this.field1338++;
                    if (this.field1338 >= this.field1341.field1988.length) {
                        this.field1338 -= this.field1341.field1986;
                        if (this.field1338 < 0 || this.field1338 >= this.field1341.field1988.length) {
                            this.field1338 = 0;
                        }
                    }
                    this.field1358 = this.field1338 + 1;
                } while (this.field1358 < this.field1341.field1988.length);
                this.field1358 -= this.field1341.field1986;
            } while (this.field1358 >= 0 && this.field1341.field1988.length > this.field1358);
            this.field1358 = -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 235)
    public static void method609(int arg0) {
        if (arg0 >= -92) {
            field1359 = true;
        }
        field1331 = null;
        field1329 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)Z", line = 246)
    public static final boolean method610(int arg0) {
        field1364++;
        try {
            if (class77.field1147 == 2) {
                if (class131.field1992 == null) {
                    class131.field1992 = class10.method64(class58.field885, class56.field863, class196.field3016);
                    if (class131.field1992 == null) {
                        return false;
                    }
                }
                if (class244.field3845 == null) {
                    class244.field3845 = new class72(class20.field245, class340.field5478);
                }
                if (class228.field3583.method1585(class187.field2908, 22050, class244.field3845, class131.field1992, (byte) -72)) {
                    class228.field3583.method1588(-4617);
                    class228.field3583.method1564(class4.field56, 48);
                    class228.field3583.method1592(class294.field4893, class131.field1992, 31329);
                    class58.field885 = null;
                    class77.field1147 = 0;
                    class244.field3845 = null;
                    class131.field1992 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class228.field3583.method1579(2);
            class58.field885 = null;
            class77.field1147 = 0;
            class131.field1992 = null;
            class244.field3845 = null;
        }
        if (arg0 != 449) {
            field1359 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V", line = 322)
    public static final void method611(int arg0, int arg1, int arg2, int arg3) {
        field1346++;
        class211 var4 = class17.method115(arg0, arg2, 4086);
        var4.method1433(true);
        var4.field3210 = arg3;
        var4.field3209 = arg1;
    }
}

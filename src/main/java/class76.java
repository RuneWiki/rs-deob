import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class76 extends class119 {

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    private int field1336 = -32768;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    private int field1353 = 0;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    private int field1357 = 0;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Z")
    private boolean field1342 = false;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Lje;")
    private class138 field1340;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "[I")
    public static int[] field1361 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field1355 = 0;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "[I")
    public static int[] field1358 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[I")
    public static int[] field1348 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Lsb;")
    public static class98 field1352 = class47.method368("sl_flags", 0);

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "Lsb;")
    public static class98 field1372 = class47.method368("<)4col>", 0);

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "D")
    private double field1338;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "D")
    private double field1339;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "D")
    public double field1344;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "D")
    public double field1350;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "D")
    public double field1354;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "D")
    private double field1356;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "D")
    private double field1360;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "D")
    private double field1368;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLtg;)V")
    public static final void method580(byte arg0, class75 arg1) {
        field1335++;
        if (class202.field3452) {
            return;
        }
        class128.method971();
        class189.field3271 = class15.method122(class100.field1761, false, arg1);
        int var2 = 100 % ((34 - arg0) / 60);
        class189.field3271.method617(-95, 0);
        class81.field1424 = class214.method1428(true, class117.field2099, arg1);
        class81.field1424.method259(382 - (class81.field1424.field3038 / 2), 18);
        class202.field3452 = true;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)V")
    public final void method581(int arg0, int arg1) {
        this.field1354 += (double) arg0 * this.field1339;
        this.field1344 += this.field1356 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1360;
        this.field1350 += (double) arg0 * this.field1368;
        field1341++;
        if (arg1 != -24318) {
            this.field1333 = 4;
        }
        this.field1342 = true;
        this.field1360 += (double) arg0 * this.field1356;
        this.field1371 = (int) (Math.atan2(this.field1339, this.field1368) * 325.949D) + 1024 & 0x7FF;
        this.field1345 = (int) (Math.atan2(this.field1360, this.field1338) * 325.949D) & 0x7FF;
        if (this.field1340 == null) {
            return;
        }
        this.field1353 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1340.field2439[this.field1357] >= this.field1353) {
                        return;
                    }
                    this.field1353 -= this.field1340.field2439[this.field1357];
                    this.field1357++;
                } while (this.field1357 < this.field1340.field2454.length);
                this.field1357 -= this.field1340.field2458;
            } while (this.field1357 >= 0 && this.field1357 < this.field1340.field2454.length);
            this.field1357 = 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static void method582(boolean arg0) {
        field1352 = null;
        field1372 = null;
        field1348 = null;
        field1358 = null;
        if (arg0) {
            method582(false);
        }
        field1361 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Lna;")
    private final class17 method583(int arg0) {
        class203 var2 = class49.method385(this.field1363, 0);
        if (arg0 != 2) {
            return null;
        }
        field1337++;
        class17 var3 = var2.method1376(-120, this.field1357);
        if (var3 == null) {
            return null;
        } else {
            var3.method164(this.field1345);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()I")
    public final int method90() {
        field1349++;
        return this.field1336;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method584(int arg0) {
        if (arg0 <= 18) {
            field1358 = null;
        }
        field1359++;
        class75.field1324.method1565(-1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1366++;
        class17 var11 = this.method583(2);
        if (var11 != null) {
            var11.method91(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1336 = var11.method90();
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(III)I")
    public static final int method585(int arg0, int arg1, int arg2) {
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 != 0) {
            return -5;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        field1365++;
        return arg0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIIII)V")
    public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1362++;
        if (!this.field1342) {
            double var6 = (double) (arg0 - this.field1332);
            double var8 = (double) (arg1 - this.field1364);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1350 = (double) this.field1331 * var8 / var10 + (double) this.field1364;
            this.field1344 = (double) this.field1369;
            this.field1354 = (double) this.field1331 * var6 / var10 + (double) this.field1332;
        }
        double var12 = (double) (this.field1370 - (arg3 - 1));
        this.field1368 = ((double) arg1 - this.field1350) / var12;
        this.field1339 = ((double) arg0 - this.field1354) / var12;
        int var14 = -86 % ((-arg2 - 32) / 32);
        this.field1338 = Math.sqrt(this.field1368 * this.field1368 + this.field1339 * this.field1339);
        if (!this.field1342) {
            this.field1360 = -this.field1338 * Math.tan((double) this.field1367 * 0.02454369D);
        }
        this.field1356 = ((double) arg4 - this.field1344 - (this.field1360 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1343 = arg10;
        this.field1333 = arg1;
        this.field1370 = arg6;
        this.field1363 = arg0;
        this.field1332 = arg2;
        this.field1342 = false;
        this.field1331 = arg8;
        this.field1346 = arg5;
        this.field1364 = arg3;
        this.field1351 = arg9;
        this.field1369 = arg4;
        this.field1367 = arg7;
        int var12 = class49.method385(this.field1363, 0).field3464;
        if (var12 == -1) {
            this.field1340 = null;
        } else {
            this.field1340 = class16.method144(1, var12);
        }
    }
}

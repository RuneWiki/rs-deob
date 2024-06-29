import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 extends class58 {

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
    private int field1344 = 0;

    @OriginalMember(owner = "client!kd", name = "Mb", descriptor = "I")
    private int field1361 = 0;

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "Z")
    private boolean field1341 = false;

    @OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!kd", name = "yb", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "Lf;")
    private class31 field1336;

    @OriginalMember(owner = "client!kd", name = "Hb", descriptor = "Lo;")
    public static class84 field1356 = class15.method124("To start a subscripton:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WStart a new subscription(W", 255);

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "[I")
    public static int[] field1332 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "Lo;")
    public static class84 field1339 = class15.method124(" million @whi@(X", 255);

    @OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
    public static int field1352 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!kd", name = "Lb", descriptor = "Lo;")
    public static class84 field1360 = class15.method124(")2", 255);

    @OriginalMember(owner = "client!kd", name = "Bb", descriptor = "Lo;")
    public static class84 field1350 = class15.method124("@gr1@", 255);

    @OriginalMember(owner = "client!kd", name = "Qb", descriptor = "Lo;")
    public static class84 field1365 = class15.method124("Unable to connect)3", 255);

    @OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lo;")
    public static class84 field1349 = class15.method124("Account locked as we suspect it has been stolen)3", 255);

    @OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lqc;")
    public static class97 field1363 = new class97(64);

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "D")
    public double field1330;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "D")
    private double field1337;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "D")
    private double field1345;

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "D")
    public double field1346;

    @OriginalMember(owner = "client!kd", name = "Gb", descriptor = "D")
    private double field1355;

    @OriginalMember(owner = "client!kd", name = "Ib", descriptor = "D")
    public double field1357;

    @OriginalMember(owner = "client!kd", name = "Rb", descriptor = "D")
    private double field1366;

    @OriginalMember(owner = "client!kd", name = "Sb", descriptor = "D")
    private double field1367;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!kd", name = "Nb", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!kd", name = "Tb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!kd", name = "Pb", descriptor = "[I")
    public static int[] field1364;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V", line = 14)
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1341) {
            double var6 = (double) (arg0 - this.field1353);
            double var8 = (double) (arg4 - this.field1340);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1357 = (double) this.field1335 * var6 / var10 + (double) this.field1353;
            this.field1346 = (double) this.field1335 * var8 / var10 + (double) this.field1340;
            this.field1330 = this.field1354;
        }
        field1343++;
        double var12 = (double) (this.field1347 + arg2 - arg3);
        this.field1345 = ((double) arg4 - this.field1346) / var12;
        this.field1337 = ((double) arg0 - this.field1357) / var12;
        this.field1366 = Math.sqrt(this.field1345 * this.field1345 + this.field1337 * this.field1337);
        if (!this.field1341) {
            this.field1367 = -this.field1366 * Math.tan((double) this.field1334 * 0.02454369D);
        }
        this.field1355 = ((double) arg1 - this.field1330 - this.field1367 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V", line = 54)
    public static void method498(int arg0) {
        field1363 = null;
        field1350 = null;
        field1356 = null;
        field1332 = null;
        field1364 = null;
        field1365 = null;
        field1360 = null;
        field1339 = null;
        if (arg0 == 1) {
            field1349 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lud;Lo;Lo;Z)Lfc;", line = 72)
    public static final class34 method499(class118 arg0, class84 arg1, class84 arg2, boolean arg3) {
        field1358++;
        if (!arg3) {
            method498(21);
        }
        int var4 = arg0.method921((byte) -18, arg2);
        int var5 = arg0.method913(false, arg1, var4);
        return class15.method127(var4, arg0, var5, (byte) 76);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 222)
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1359 = arg9;
        this.field1334 = arg7;
        this.field1341 = false;
        this.field1333 = arg5;
        this.field1338 = arg0;
        this.field1347 = arg6;
        this.field1328 = arg10;
        this.field1353 = arg2;
        this.field1335 = arg8;
        this.field1329 = arg1;
        this.field1354 = arg4;
        this.field1340 = arg3;
        int var12 = class6.method36((byte) 30, this.field1338).field594;
        if (var12 == -1) {
            this.field1336 = null;
        } else {
            this.field1336 = class74.method554(var12, 4867);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V", line = 154)
    public final void method500(byte arg0, int arg1) {
        if (arg0 >= -47) {
            return;
        }
        field1368++;
        this.field1341 = true;
        this.field1357 += (double) arg1 * this.field1337;
        this.field1346 += (double) arg1 * this.field1345;
        this.field1330 += this.field1355 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1367;
        this.field1367 += (double) arg1 * this.field1355;
        this.field1362 = (int) (Math.atan2(this.field1337, this.field1345) * 325.949D) + 1024 & 0x7FF;
        this.field1351 = (int) (Math.atan2(this.field1367, this.field1366) * 325.949D) & 0x7FF;
        if (this.field1336 == null) {
            return;
        }
        this.field1361 += arg1;
        while (this.field1361 > this.field1336.field628[this.field1344]) {
            this.field1361 -= this.field1336.field628[this.field1344];
            this.field1344++;
            if (this.field1344 >= this.field1336.field612.length) {
                this.field1344 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)Lne;", line = 195)
    public final class83 method471(byte arg0) {
        field1348++;
        class30 var2 = class6.method36((byte) 30, this.field1338);
        if (arg0 != 3) {
            this.method500((byte) -71, -80);
        }
        class83 var3 = var2.method264((byte) -39, this.field1344);
        if (var3 == null) {
            return null;
        } else {
            var3.method614(this.field1351);
            return var3;
        }
    }
}

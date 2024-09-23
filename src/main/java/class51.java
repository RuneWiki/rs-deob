import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TIUPWCPE")
public class class51 extends class34 {

    @OriginalMember(owner = "TIUPWCPE", name = "n", descriptor = "B")
    private byte field1337 = 3;

    @OriginalMember(owner = "TIUPWCPE", name = "r", descriptor = "I")
    private int field1341 = 3;

    @OriginalMember(owner = "TIUPWCPE", name = "v", descriptor = "Z")
    public boolean field1345 = false;

    @OriginalMember(owner = "TIUPWCPE", name = "F", descriptor = "LPMDEXOWJ;")
    private class43 field1355;

    @OriginalMember(owner = "TIUPWCPE", name = "w", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "TIUPWCPE", name = "z", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "TIUPWCPE", name = "A", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "TIUPWCPE", name = "B", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "TIUPWCPE", name = "D", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "TIUPWCPE", name = "E", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "TIUPWCPE", name = "s", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "TIUPWCPE", name = "t", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "TIUPWCPE", name = "u", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "TIUPWCPE", name = "C", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "TIUPWCPE", name = "o", descriptor = "D")
    public double field1338;

    @OriginalMember(owner = "TIUPWCPE", name = "p", descriptor = "D")
    public double field1339;

    @OriginalMember(owner = "TIUPWCPE", name = "q", descriptor = "D")
    public double field1340;

    @OriginalMember(owner = "TIUPWCPE", name = "G", descriptor = "D")
    private double field1356;

    @OriginalMember(owner = "TIUPWCPE", name = "H", descriptor = "D")
    private double field1357;

    @OriginalMember(owner = "TIUPWCPE", name = "I", descriptor = "D")
    private double field1358;

    @OriginalMember(owner = "TIUPWCPE", name = "J", descriptor = "D")
    private double field1359;

    @OriginalMember(owner = "TIUPWCPE", name = "K", descriptor = "D")
    private double field1360;

    @OriginalMember(owner = "TIUPWCPE", name = "l", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "TIUPWCPE", name = "m", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "TIUPWCPE", name = "x", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "TIUPWCPE", name = "y", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "TIUPWCPE", name = "a", descriptor = "(IIIII)V")
    public final void method425(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1345) {
            double var6 = (double) (arg1 - this.field1349);
            double var8 = (double) (arg3 - this.field1350);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1338 = (double) this.field1343 * var6 / var10 + (double) this.field1349;
            this.field1339 = (double) this.field1343 * var8 / var10 + (double) this.field1350;
            this.field1340 = this.field1351;
        }
        double var12 = (double) (this.field1354 + 1 - arg4);
        this.field1357 = ((double) arg1 - this.field1338) / var12;
        if (arg2 < 1 || arg2 > 1) {
            return;
        }
        this.field1358 = ((double) arg3 - this.field1339) / var12;
        this.field1359 = Math.sqrt(this.field1358 * this.field1358 + this.field1357 * this.field1357);
        if (!this.field1345) {
            this.field1360 = -this.field1359 * Math.tan((double) this.field1342 * 0.02454369D);
        }
        this.field1356 = ((double) arg0 - this.field1340 - this.field1360 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "TIUPWCPE", name = "a", descriptor = "(Z)LWEVRTBOZ;")
    public final class66 method225(boolean arg0) {
        class66 var2 = this.field1355.method404();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1355.field1257 != null) {
            var3 = this.field1355.field1257.field1282[this.field1347];
        }
        class66 var4 = new class66(107, var2, class15.method218(var3, true), false, true);
        if (!arg0) {
            this.field1341 = 340;
        }
        if (var3 != -1) {
            var4.method532((byte) 2);
            var4.method533(var3, 803);
            var4.field1618 = null;
            var4.field1617 = null;
        }
        if (this.field1355.field1260 != 128 || this.field1355.field1261 != 128) {
            var4.method541(this.field1355.field1260, this.field1355.field1260, this.field1355.field1261, 49106);
        }
        var4.method537((byte) 9, this.field1336);
        var4.method542(this.field1355.field1263 + 64, this.field1355.field1264 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "TIUPWCPE", name = "<init>", descriptor = "(IIIIIBIIIIII)V")
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1355 = class43.field1253[arg7];
        this.field1346 = arg4;
        if (this.field1337 != arg5) {
            throw new NullPointerException();
        }
        this.field1349 = arg3;
        this.field1350 = arg1;
        this.field1351 = arg10;
        this.field1353 = arg0;
        this.field1354 = arg11;
        this.field1342 = arg8;
        this.field1343 = arg9;
        this.field1344 = arg2;
        this.field1352 = arg6;
        this.field1345 = false;
    }

    @OriginalMember(owner = "TIUPWCPE", name = "a", descriptor = "(II)V")
    public final void method426(int arg0, int arg1) {
        this.field1345 = true;
        this.field1338 += (double) arg1 * this.field1357;
        this.field1339 += (double) arg1 * this.field1358;
        this.field1340 += this.field1356 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1360;
        this.field1360 += (double) arg1 * this.field1356;
        this.field1335 = (int) (Math.atan2(this.field1357, this.field1358) * 325.949D) + 1024 & 0x7FF;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1336 = (int) (Math.atan2(this.field1360, this.field1359) * 325.949D) & 0x7FF;
        if (this.field1355.field1257 == null) {
            return;
        }
        this.field1348 += arg1;
        while (this.field1348 > this.field1355.field1257.method414(this.field1347, this.field1341)) {
            this.field1348 -= this.field1355.field1257.method414(this.field1347, this.field1341) + 1;
            this.field1347++;
            if (this.field1347 >= this.field1355.field1257.field1281) {
                this.field1347 = 0;
            }
        }
    }
}

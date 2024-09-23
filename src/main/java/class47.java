import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OXJUGPEO")
public class class47 extends class4 {

    @OriginalMember(owner = "OXJUGPEO", name = "r", descriptor = "B")
    private byte field1315 = 9;

    @OriginalMember(owner = "OXJUGPEO", name = "s", descriptor = "Z")
    public boolean field1316 = false;

    @OriginalMember(owner = "OXJUGPEO", name = "t", descriptor = "I")
    private int field1317 = 5131;

    @OriginalMember(owner = "OXJUGPEO", name = "n", descriptor = "LVCTVXSNH;")
    private class62 field1311;

    @OriginalMember(owner = "OXJUGPEO", name = "C", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "OXJUGPEO", name = "u", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "OXJUGPEO", name = "v", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "OXJUGPEO", name = "w", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "OXJUGPEO", name = "J", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "OXJUGPEO", name = "K", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "OXJUGPEO", name = "z", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "OXJUGPEO", name = "A", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "OXJUGPEO", name = "B", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "OXJUGPEO", name = "x", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "OXJUGPEO", name = "o", descriptor = "D")
    public double field1312;

    @OriginalMember(owner = "OXJUGPEO", name = "p", descriptor = "D")
    public double field1313;

    @OriginalMember(owner = "OXJUGPEO", name = "q", descriptor = "D")
    public double field1314;

    @OriginalMember(owner = "OXJUGPEO", name = "y", descriptor = "D")
    private double field1322;

    @OriginalMember(owner = "OXJUGPEO", name = "D", descriptor = "D")
    private double field1327;

    @OriginalMember(owner = "OXJUGPEO", name = "E", descriptor = "D")
    private double field1328;

    @OriginalMember(owner = "OXJUGPEO", name = "F", descriptor = "D")
    private double field1329;

    @OriginalMember(owner = "OXJUGPEO", name = "G", descriptor = "D")
    private double field1330;

    @OriginalMember(owner = "OXJUGPEO", name = "l", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "OXJUGPEO", name = "m", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "OXJUGPEO", name = "H", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "OXJUGPEO", name = "I", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "OXJUGPEO", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1311 = class62.field1570[arg8];
        this.field1326 = arg1;
        this.field1318 = arg5;
        this.field1319 = arg2;
        this.field1320 = arg6;
        this.field1333 = arg0;
        this.field1334 = arg9;
        this.field1323 = arg7;
        this.field1324 = arg3;
        this.field1325 = arg4;
        this.field1321 = arg10;
        this.field1316 = false;
        if (arg11 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "OXJUGPEO", name = "a", descriptor = "(I)LIGXVZOHI;")
    public final class32 method25(int arg0) {
        class32 var2 = this.field1311.method555();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1311.field1574 != null) {
            var3 = this.field1311.field1574.field69[this.field1309];
        }
        class32 var4 = new class32(true, var2, false, class31.method349(var3, this.field1317), (byte) 1);
        if (var3 != -1) {
            var4.method361(6);
            var4.method362(33114, var3);
            var4.field970 = null;
            var4.field969 = null;
        }
        if (this.field1311.field1577 != 128 || this.field1311.field1578 != 128) {
            var4.method370(this.field1311.field1577, this.field1311.field1578, false, this.field1311.field1577);
        }
        var4.method366((byte) 0, this.field1332);
        if (arg0 != 47492) {
            throw new NullPointerException();
        }
        var4.method371(this.field1311.field1580 + 64, this.field1311.field1581 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "OXJUGPEO", name = "a", descriptor = "(IIIII)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1316) {
            double var6 = (double) (arg1 - this.field1318);
            double var8 = (double) (arg3 - this.field1319);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1312 = (double) this.field1324 * var6 / var10 + (double) this.field1318;
            this.field1313 = (double) this.field1324 * var8 / var10 + (double) this.field1319;
            this.field1314 = this.field1320;
        }
        double var12 = (double) (this.field1334 + 1 - arg0);
        if (arg2 != -41536) {
            return;
        }
        this.field1327 = ((double) arg1 - this.field1312) / var12;
        this.field1328 = ((double) arg3 - this.field1313) / var12;
        this.field1329 = Math.sqrt(this.field1328 * this.field1328 + this.field1327 * this.field1327);
        if (!this.field1316) {
            this.field1330 = -this.field1329 * Math.tan((double) this.field1323 * 0.02454369D);
        }
        this.field1322 = ((double) arg4 - this.field1314 - this.field1330 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "OXJUGPEO", name = "a", descriptor = "(IB)V")
    public final void method501(int arg0, byte arg1) {
        this.field1316 = true;
        this.field1312 += (double) arg0 * this.field1327;
        this.field1313 += (double) arg0 * this.field1328;
        if (this.field1315 != arg1) {
            return;
        }
        boolean var3 = false;
        this.field1314 += this.field1322 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1330;
        this.field1330 += (double) arg0 * this.field1322;
        this.field1331 = (int) (Math.atan2(this.field1327, this.field1328) * 325.949D) + 1024 & 0x7FF;
        this.field1332 = (int) (Math.atan2(this.field1330, this.field1329) * 325.949D) & 0x7FF;
        if (this.field1311.field1574 == null) {
            return;
        }
        this.field1310 += arg0;
        while (this.field1310 > this.field1311.field1574.method27(this.field1309, (byte) -127)) {
            this.field1310 -= this.field1311.field1574.method27(this.field1309, (byte) -127) + 1;
            this.field1309++;
            if (this.field1309 >= this.field1311.field1574.field68) {
                this.field1309 = 0;
            }
        }
    }
}

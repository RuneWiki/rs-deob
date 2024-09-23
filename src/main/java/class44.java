import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PXEWTQHA")
public class class44 extends class66 {

    @OriginalMember(owner = "PXEWTQHA", name = "l", descriptor = "Z")
    private boolean field1261 = true;

    @OriginalMember(owner = "PXEWTQHA", name = "t", descriptor = "I")
    private int field1269 = -456;

    @OriginalMember(owner = "PXEWTQHA", name = "H", descriptor = "I")
    private int field1283 = 9;

    @OriginalMember(owner = "PXEWTQHA", name = "I", descriptor = "Z")
    public boolean field1284 = false;

    @OriginalMember(owner = "PXEWTQHA", name = "J", descriptor = "I")
    private int field1285 = -79;

    @OriginalMember(owner = "PXEWTQHA", name = "F", descriptor = "LFXNZCBPL;")
    private class11 field1281;

    @OriginalMember(owner = "PXEWTQHA", name = "A", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "PXEWTQHA", name = "w", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "PXEWTQHA", name = "x", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "PXEWTQHA", name = "y", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "PXEWTQHA", name = "u", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "PXEWTQHA", name = "v", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "PXEWTQHA", name = "m", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "PXEWTQHA", name = "n", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "PXEWTQHA", name = "o", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "PXEWTQHA", name = "z", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "PXEWTQHA", name = "p", descriptor = "D")
    private double field1265;

    @OriginalMember(owner = "PXEWTQHA", name = "q", descriptor = "D")
    private double field1266;

    @OriginalMember(owner = "PXEWTQHA", name = "r", descriptor = "D")
    private double field1267;

    @OriginalMember(owner = "PXEWTQHA", name = "s", descriptor = "D")
    private double field1268;

    @OriginalMember(owner = "PXEWTQHA", name = "G", descriptor = "D")
    private double field1282;

    @OriginalMember(owner = "PXEWTQHA", name = "K", descriptor = "D")
    public double field1286;

    @OriginalMember(owner = "PXEWTQHA", name = "L", descriptor = "D")
    public double field1287;

    @OriginalMember(owner = "PXEWTQHA", name = "M", descriptor = "D")
    public double field1288;

    @OriginalMember(owner = "PXEWTQHA", name = "B", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "PXEWTQHA", name = "C", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "PXEWTQHA", name = "D", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "PXEWTQHA", name = "E", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "PXEWTQHA", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public final class4 method187(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        class4 var2 = this.field1281.method202();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1281.field702 != null) {
            var3 = this.field1281.field702.field1221[this.field1279];
        }
        class4 var4 = new class4(true, class25.method285(0, var3), var2, false, (byte) -45);
        if (var3 != -1) {
            var4.method167(7);
            var4.method168(false, var3);
            var4.field601 = null;
            var4.field600 = null;
        }
        if (this.field1281.field705 != 128 || this.field1281.field706 != 128) {
            var4.method176(this.field1281.field705, this.field1281.field706, this.field1281.field705, 1);
        }
        var4.method172(true, this.field1278);
        var4.method177(this.field1281.field708 + 64, this.field1281.field709 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "PXEWTQHA", name = "a", descriptor = "(IBIII)V")
    public final void method429(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (!this.field1284) {
            double var6 = (double) (arg2 - this.field1272);
            double var8 = (double) (arg3 - this.field1273);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1286 = (double) this.field1263 * var6 / var10 + (double) this.field1272;
            this.field1287 = (double) this.field1263 * var8 / var10 + (double) this.field1273;
            this.field1288 = this.field1274;
        }
        double var12 = (double) (this.field1271 + 1 - arg4);
        this.field1265 = ((double) arg2 - this.field1286) / var12;
        this.field1266 = ((double) arg3 - this.field1287) / var12;
        if (arg1 == 6) {
            boolean var14 = false;
        } else {
            this.field1285 = 206;
        }
        this.field1267 = Math.sqrt(this.field1266 * this.field1266 + this.field1265 * this.field1265);
        if (!this.field1284) {
            this.field1268 = -this.field1267 * Math.tan((double) this.field1262 * 0.02454369D);
        }
        this.field1282 = ((double) arg0 - this.field1288 - this.field1268 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "PXEWTQHA", name = "a", descriptor = "(II)V")
    public final void method430(int arg0, int arg1) {
        if (arg1 < 3 || arg1 > 3) {
            this.field1269 = -122;
        }
        this.field1284 = true;
        this.field1286 += (double) arg0 * this.field1265;
        this.field1287 += (double) arg0 * this.field1266;
        this.field1288 += this.field1282 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1268;
        this.field1268 += (double) arg0 * this.field1282;
        this.field1277 = (int) (Math.atan2(this.field1265, this.field1266) * 325.949D) + 1024 & 0x7FF;
        this.field1278 = (int) (Math.atan2(this.field1268, this.field1267) * 325.949D) & 0x7FF;
        if (this.field1281.field702 == null) {
            return;
        }
        this.field1280 += arg0;
        while (this.field1280 > this.field1281.field702.method427(this.field1279, this.field1283)) {
            this.field1280 -= this.field1281.field702.method427(this.field1279, this.field1283) + 1;
            this.field1279++;
            if (this.field1279 >= this.field1281.field702.field1220) {
                this.field1279 = 0;
            }
        }
    }

    @OriginalMember(owner = "PXEWTQHA", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1281 = class11.field698[arg8];
        if (arg6 != 0) {
            this.field1261 = !this.field1261;
        }
        this.field1276 = arg5;
        this.field1272 = arg1;
        this.field1273 = arg0;
        this.field1274 = arg7;
        this.field1270 = arg3;
        this.field1271 = arg2;
        this.field1262 = arg11;
        this.field1263 = arg9;
        this.field1264 = arg4;
        this.field1275 = arg10;
        this.field1284 = false;
    }
}

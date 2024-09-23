import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RVDLUGTG")
public class class51 extends class6 {

    @OriginalMember(owner = "RVDLUGTG", name = "y", descriptor = "I")
    private int field1381 = 2578;

    @OriginalMember(owner = "RVDLUGTG", name = "z", descriptor = "Z")
    public boolean field1382 = false;

    @OriginalMember(owner = "RVDLUGTG", name = "F", descriptor = "LIDBAHLFM;")
    private class22 field1388;

    @OriginalMember(owner = "RVDLUGTG", name = "A", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "RVDLUGTG", name = "s", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "RVDLUGTG", name = "t", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "RVDLUGTG", name = "u", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "RVDLUGTG", name = "D", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "RVDLUGTG", name = "E", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "RVDLUGTG", name = "l", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "RVDLUGTG", name = "m", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "RVDLUGTG", name = "n", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "RVDLUGTG", name = "v", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "RVDLUGTG", name = "o", descriptor = "D")
    public double field1371;

    @OriginalMember(owner = "RVDLUGTG", name = "p", descriptor = "D")
    public double field1372;

    @OriginalMember(owner = "RVDLUGTG", name = "q", descriptor = "D")
    public double field1373;

    @OriginalMember(owner = "RVDLUGTG", name = "r", descriptor = "D")
    private double field1374;

    @OriginalMember(owner = "RVDLUGTG", name = "G", descriptor = "D")
    private double field1389;

    @OriginalMember(owner = "RVDLUGTG", name = "H", descriptor = "D")
    private double field1390;

    @OriginalMember(owner = "RVDLUGTG", name = "I", descriptor = "D")
    private double field1391;

    @OriginalMember(owner = "RVDLUGTG", name = "J", descriptor = "D")
    private double field1392;

    @OriginalMember(owner = "RVDLUGTG", name = "w", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "RVDLUGTG", name = "x", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "RVDLUGTG", name = "B", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "RVDLUGTG", name = "C", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "RVDLUGTG", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1388 = class22.field913[arg6];
        this.field1383 = arg7;
        this.field1375 = arg9;
        this.field1376 = arg0;
        this.field1377 = arg1;
        this.field1386 = arg5;
        if (arg11 < 8 || arg11 > 8) {
            this.field1381 = -301;
        }
        this.field1387 = arg4;
        this.field1368 = arg10;
        this.field1369 = arg2;
        this.field1370 = arg3;
        this.field1378 = arg8;
        this.field1382 = false;
    }

    @OriginalMember(owner = "RVDLUGTG", name = "a", descriptor = "(IZIII)V")
    public final void method516(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!this.field1382) {
            double var6 = (double) (arg3 - this.field1375);
            double var8 = (double) (arg0 - this.field1376);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1371 = (double) this.field1369 * var6 / var10 + (double) this.field1375;
            this.field1372 = (double) this.field1369 * var8 / var10 + (double) this.field1376;
            this.field1373 = this.field1377;
        }
        double var12 = (double) (this.field1387 + 1 - arg2);
        this.field1389 = ((double) arg3 - this.field1371) / var12;
        if (!arg1) {
            return;
        }
        this.field1390 = ((double) arg0 - this.field1372) / var12;
        this.field1391 = Math.sqrt(this.field1390 * this.field1390 + this.field1389 * this.field1389);
        if (!this.field1382) {
            this.field1392 = -this.field1391 * Math.tan((double) this.field1368 * 0.02454369D);
        }
        this.field1374 = ((double) arg4 - this.field1373 - this.field1392 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "RVDLUGTG", name = "a", descriptor = "(ZI)V")
    public final void method517(boolean arg0, int arg1) {
        this.field1382 = true;
        this.field1371 += (double) arg1 * this.field1389;
        this.field1372 += (double) arg1 * this.field1390;
        this.field1373 += this.field1374 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1392;
        this.field1392 += (double) arg1 * this.field1374;
        this.field1384 = (int) (Math.atan2(this.field1389, this.field1390) * 325.949D) + 1024 & 0x7FF;
        this.field1385 = (int) (Math.atan2(this.field1392, this.field1391) * 325.949D) & 0x7FF;
        if (!arg0) {
            this.field1381 = 225;
        }
        if (this.field1388.field917 == null) {
            return;
        }
        this.field1380 += arg1;
        while (this.field1380 > this.field1388.field917.method241(true, this.field1379)) {
            this.field1380 -= this.field1388.field917.method241(true, this.field1379) + 1;
            this.field1379++;
            if (this.field1379 >= this.field1388.field917.field683) {
                this.field1379 = 0;
            }
        }
    }

    @OriginalMember(owner = "RVDLUGTG", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public final class17 method221(byte arg0) {
        class17 var2 = this.field1388.method323();
        if (arg0 != -43) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            int var3 = -1;
            if (this.field1388.field917 != null) {
                var3 = this.field1388.field917.field684[this.field1379];
            }
            class17 var4 = new class17((byte) -59, class48.method504(var3, 3), var2, false, true);
            if (var3 != -1) {
                var4.method292(-20376);
                var4.method293((byte) 1, var3);
                var4.field844 = null;
                var4.field843 = null;
            }
            if (this.field1388.field920 != 128 || this.field1388.field921 != 128) {
                var4.method301(this.field1388.field921, this.field1388.field920, (byte) 9, this.field1388.field920);
            }
            var4.method297(this.field1385, true);
            var4.method302(this.field1388.field923 + 64, this.field1388.field924 + 850, -30, -50, -30, true);
            return var4;
        }
    }
}

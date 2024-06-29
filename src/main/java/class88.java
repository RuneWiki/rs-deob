import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class88 extends class232 {

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    private int field1327 = 0;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    private int field1335 = -1;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Z")
    private boolean field1336 = false;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    private int field1344 = 0;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field1354 = -32768;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lv;")
    private class80 field1321;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Z")
    public static boolean field1323 = false;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "[I")
    public static int[] field1334 = new int[128];

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "D")
    private double field1328;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "D")
    private double field1337;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "D")
    private double field1340;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "D")
    public double field1341;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "D")
    public double field1343;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "D")
    private double field1346;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "D")
    public double field1348;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "D")
    private double field1352;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lll;")
    private class167 field1329;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()I", line = 10)
    public final int method152() {
        field1324++;
        return this.field1354;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBII)V", line = 19)
    public final void method637(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1355++;
        if (!this.field1336) {
            double var6 = (double) (arg4 - this.field1350);
            double var8 = (double) (arg3 - this.field1331);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1343 = (double) this.field1342 * var8 / var10 + (double) this.field1331;
            this.field1341 = (double) this.field1319;
            this.field1348 = (double) this.field1342 * var6 / var10 + (double) this.field1350;
        }
        double var12 = (double) (this.field1338 - (arg1 - 1));
        this.field1337 = ((double) arg3 - this.field1343) / var12;
        this.field1352 = ((double) arg4 - this.field1348) / var12;
        this.field1340 = Math.sqrt(this.field1352 * this.field1352 + this.field1337 * this.field1337);
        if (this.field1322 == -1) {
            this.field1328 = ((double) arg0 - this.field1341) / var12;
        } else {
            if (!this.field1336) {
                this.field1328 = -this.field1340 * Math.tan((double) this.field1322 * 0.02454369D);
            }
            this.field1346 = ((double) arg0 - this.field1341 - this.field1328 * var12) * 2.0D / (var12 * var12);
        }
        int var14 = -81 % ((19 - arg2) / 60);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V", line = 59)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1345++;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V", line = 66)
    public static void method638(byte arg0) {
        if (arg0 >= 15) {
            field1334 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIB)I", line = 81)
    public static final int method639(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 / arg1;
        int var5 = arg2 / arg1;
        int var6 = arg1 - 1 & arg0;
        field1333++;
        int var7 = class245.method1736((byte) -71, var5, var4);
        int var8 = arg2 & arg1 - 1;
        int var9 = class245.method1736((byte) -71, var5, var4 + 1);
        int var10 = class245.method1736((byte) -71, var5 + 1, var4);
        int var11 = -124 % ((arg3 - 81) / 43);
        int var12 = class245.method1736((byte) -71, var5 + 1, var4 + 1);
        int var13 = class26.method181(var9, var7, -2, arg1, var6);
        int var14 = class26.method181(var12, var10, -2, arg1, var6);
        return class26.method181(var14, var13, -2, arg1, var8);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 130)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
        field1349++;
        class134 var13 = this.method641((byte) -58);
        if (var13 != null) {
            var13.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1329);
            this.field1354 = var13.method152();
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 253)
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1350 = arg2;
        this.field1319 = arg4;
        this.field1332 = arg9;
        this.field1325 = arg0;
        this.field1338 = arg6;
        this.field1353 = arg10;
        this.field1336 = false;
        this.field1339 = arg1;
        this.field1342 = arg8;
        this.field1322 = arg7;
        this.field1330 = arg5;
        this.field1331 = arg3;
        int var12 = class264.method1881((byte) 104, this.field1325).field302;
        if (var12 == -1) {
            this.field1321 = null;
        } else {
            this.field1321 = class37.method236(var12, 20254);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V", line = 181)
    public final void method640(int arg0, int arg1) {
        this.field1336 = true;
        this.field1343 += (double) arg1 * this.field1337;
        field1356++;
        this.field1348 += (double) arg1 * this.field1352;
        if (~this.field1322 == arg0) {
            this.field1341 += (double) arg1 * this.field1328;
        } else {
            this.field1341 += this.field1346 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1328;
            this.field1328 += (double) arg1 * this.field1346;
        }
        this.field1326 = (int) (Math.atan2(this.field1352, this.field1337) * 325.949D) + 1024 & 0x7FF;
        this.field1320 = (int) (Math.atan2(this.field1328, this.field1340) * 325.949D) & 0x7FF;
        if (this.field1321 == null) {
            return;
        }
        this.field1344 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1321.field1223[this.field1327] >= this.field1344) {
                        return;
                    }
                    this.field1344 -= this.field1321.field1223[this.field1327];
                    this.field1327++;
                    if (this.field1327 >= this.field1321.field1209.length) {
                        this.field1327 -= this.field1321.field1196;
                        if (this.field1327 < 0 || this.field1327 >= this.field1321.field1209.length) {
                            this.field1327 = 0;
                        }
                    }
                    this.field1335 = this.field1327 + 1;
                } while (this.field1321.field1209.length > this.field1335);
                this.field1335 -= this.field1321.field1196;
            } while (this.field1335 >= 0 && this.field1335 < this.field1321.field1209.length);
            this.field1335 = -1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Llf;", line = 234)
    private final class134 method641(byte arg0) {
        field1351++;
        class20 var2 = class264.method1881((byte) 113, this.field1325);
        if (arg0 != -58) {
            return (class134) null;
        }
        class134 var3 = var2.method136(this.field1344, (byte) 80, this.field1335, this.field1327);
        if (var3 == null) {
            return null;
        } else {
            var3.method520(this.field1320);
            return var3;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class14 extends class12 {

    @OriginalMember(owner = "client!cb", name = "Db", descriptor = "I")
    private int field340 = 0;

    @OriginalMember(owner = "client!cb", name = "Fb", descriptor = "I")
    private int field342 = 0;

    @OriginalMember(owner = "client!cb", name = "xb", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "client!cb", name = "Rb", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!cb", name = "Wb", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!cb", name = "Mb", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!cb", name = "Hb", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!cb", name = "Ib", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!cb", name = "wb", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!cb", name = "Vb", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!cb", name = "Bb", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!cb", name = "Ub", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!cb", name = "Ob", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!cb", name = "fc", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!cb", name = "ac", descriptor = "Lj;")
    private class57 field363;

    @OriginalMember(owner = "client!cb", name = "Lb", descriptor = "Lpd;")
    public static class94 field348 = class28.method249(58, "leuchten2:");

    @OriginalMember(owner = "client!cb", name = "Sb", descriptor = "I")
    public static int field355 = 0;

    @OriginalMember(owner = "client!cb", name = "Xb", descriptor = "Lpd;")
    private static class94 field360 = class28.method249(67, "Loaded interfaces");

    @OriginalMember(owner = "client!cb", name = "zb", descriptor = "Lpd;")
    public static class94 field336 = field360;

    @OriginalMember(owner = "client!cb", name = "bc", descriptor = "Lpd;")
    public static class94 field364 = class28.method249(-68, " )2> @lre@");

    @OriginalMember(owner = "client!cb", name = "Yb", descriptor = "Lpd;")
    private static class94 field361 = class28.method249(-109, "Please contact customer support)3");

    @OriginalMember(owner = "client!cb", name = "Gb", descriptor = "Lpd;")
    public static class94 field343 = field361;

    @OriginalMember(owner = "client!cb", name = "yb", descriptor = "D")
    private double field335;

    @OriginalMember(owner = "client!cb", name = "Cb", descriptor = "D")
    private double field339;

    @OriginalMember(owner = "client!cb", name = "Eb", descriptor = "D")
    private double field341;

    @OriginalMember(owner = "client!cb", name = "Kb", descriptor = "D")
    private double field347;

    @OriginalMember(owner = "client!cb", name = "Nb", descriptor = "D")
    public double field350;

    @OriginalMember(owner = "client!cb", name = "cc", descriptor = "D")
    public double field365;

    @OriginalMember(owner = "client!cb", name = "gc", descriptor = "D")
    private double field369;

    @OriginalMember(owner = "client!cb", name = "kc", descriptor = "D")
    public double field373;

    @OriginalMember(owner = "client!cb", name = "Ab", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!cb", name = "Jb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cb", name = "Pb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cb", name = "Qb", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!cb", name = "Zb", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!cb", name = "dc", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cb", name = "ec", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!cb", name = "hc", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!cb", name = "ic", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!cb", name = "jc", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!cb", name = "Tb", descriptor = "Lla;")
    public static class66 field356;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 22)
    public final void method82(int arg0, int arg1) {
        this.field350 += this.field369 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field341;
        this.field373 += (double) arg1 * this.field347;
        this.field334 = true;
        this.field341 += (double) arg1 * this.field369;
        field371++;
        this.field365 += (double) arg1 * this.field335;
        this.field372 = arg0 + (int) (Math.atan2(this.field335, this.field347) * 325.949D) & 0x7FF;
        this.field353 = (int) (Math.atan2(this.field341, this.field339) * 325.949D) & 0x7FF;
        if (this.field363 == null) {
            return;
        }
        this.field340 += arg1;
        while (true) {
            do {
                do {
                    if (this.field363.field1420[this.field342] >= this.field340) {
                        return;
                    }
                    this.field340 -= this.field363.field1420[this.field342];
                    this.field342++;
                } while (this.field363.field1425.length > this.field342);
                this.field342 -= this.field363.field1435;
            } while (this.field342 >= 0 && this.field342 < this.field363.field1425.length);
            this.field342 = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Lia;", line = 61)
    public final class48 method77(int arg0) {
        class86 var2 = class41.method309(13, this.field358);
        class48 var3 = var2.method627(-11590, this.field342);
        field337++;
        if (var3 == null) {
            return null;
        }
        var3.method375(this.field353);
        if (arg0 != 1536) {
            field355 = 31;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 246)
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field354 = arg1;
        this.field359 = arg6;
        this.field349 = arg10;
        this.field344 = arg8;
        this.field345 = arg7;
        this.field333 = arg3;
        this.field358 = arg0;
        this.field338 = arg9;
        this.field334 = false;
        this.field357 = arg4;
        this.field351 = arg2;
        this.field368 = arg5;
        int var12 = class41.method309(13, this.field358).field2162;
        if (var12 == -1) {
            this.field363 = null;
        } else {
            this.field363 = class70.method519(5, var12);
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V", line = 98)
    public static final void method83(int arg0) {
        field366++;
        if (!class117.field2939) {
            return;
        }
        class72.field1726 = null;
        class134.field3304 = null;
        class110.field2695 = null;
        if (arg0 != 10) {
            return;
        }
        class76.field1852 = null;
        class115.field2911 = null;
        class86.field2187 = null;
        class73.field1790 = null;
        class128.field3213 = null;
        class2.field68 = null;
        class113.field2891 = null;
        class111.field2810 = null;
        class69.field1671 = null;
        class9.field241 = null;
        class1.field22 = null;
        class41.field1045 = null;
        class85.field2134 = null;
        class99.field2510 = null;
        class98.field2483 = null;
        class55.field1393 = null;
        class26.field703 = null;
        class112.field2828 = null;
        class40.field1024 = null;
        class123.method971(19405, 10);
        class30.method259(arg0 - 129, true);
        class117.field2939 = false;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 138)
    public static void method84(int arg0) {
        field361 = null;
        field336 = null;
        field348 = null;
        if (arg0 != 1024) {
            field346 = -89;
        }
        field364 = null;
        field356 = null;
        field360 = null;
        field343 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V", line = 204)
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 12575) {
            this.method85(68, 102, -52, 108, 122);
        }
        if (!this.field334) {
            double var6 = (double) (arg4 - this.field351);
            double var8 = (double) (arg3 - this.field333);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field373 = (double) this.field344 * var8 / var10 + (double) this.field333;
            this.field350 = this.field357;
            this.field365 = (double) this.field344 * var6 / var10 + (double) this.field351;
        }
        field370++;
        double var12 = (double) (this.field359 + 1 - arg2);
        this.field347 = ((double) arg3 - this.field373) / var12;
        this.field335 = ((double) arg4 - this.field365) / var12;
        this.field339 = Math.sqrt(this.field347 * this.field347 + this.field335 * this.field335);
        if (!this.field334) {
            this.field341 = -this.field339 * Math.tan((double) this.field345 * 0.02454369D);
        }
        this.field369 = ((double) arg0 - this.field350 - this.field341 * var12) * 2.0D / (var12 * var12);
    }
}

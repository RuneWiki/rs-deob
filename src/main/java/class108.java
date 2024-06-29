import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class108 extends class319 {

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lwb;")
    public class127 field1497;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    private static int field1494 = 0;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    private static int field1507 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field1519 = 0;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field1514 = 0;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    private static int field1490;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    private static int field1500;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private static int field1503;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    private static int field1520;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    private int[] field1492;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(FFFFFF)V")
    private final void method787(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1513 + this.field1501 + this.field1499;
        int var8 = this.field1516 + this.field1493 + this.field1491;
        if (this.field1501 != var7 || this.field1493 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1516 * var11;
            float var14 = (float) this.field1516 * var12;
            float var15 = (float) this.field1513 * var9;
            float var16 = (float) this.field1513 * var10;
            float var17 = (float) this.field1499 * -var9;
            float var18 = (float) this.field1499 * -var10;
            float var19 = (float) this.field1491 * -var11;
            float var20 = (float) this.field1491 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field1497.field1744) {
            var23 = (float) this.field1497.field1744;
        }
        if (var24 > (float) this.field1497.field1773) {
            var24 = (float) this.field1497.field1773;
        }
        if (var25 < (float) this.field1497.field1737) {
            var25 = (float) this.field1497.field1737;
        }
        if (var26 > (float) this.field1497.field1756) {
            var26 = (float) this.field1497.field1756;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field1506 = this.field1497.field1738;
        field1518 = (int) ((float) ((int) var25 * field1506) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1496 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1501 / var29);
        field1517 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1493 / var30);
        field1508 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1501 / var30);
        field1495 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1493 / var29);
        field1520 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1490 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1502 = (this.field1501 >> 1 << 12) + (field1508 * field1490 >> 4);
        field1515 = (this.field1493 >> 1 << 12) + (field1495 * field1490 >> 4);
        field1489 = field1520 * field1496 >> 4;
        field1504 = field1520 * field1517 >> 4;
        field1500 = (int) var23;
        field1498 = (int) var27;
        field1503 = (int) var25;
        field1488 = (int) var28;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public abstract void method788(int arg0, int arg1);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()I")
    public final int method789() {
        return this.field1516 + this.field1493 + this.field1491;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1497.method887()) {
            throw new IllegalStateException();
        }
        this.method787(arg0, arg1, arg2, arg3, arg4, arg5);
        field1509 = arg7;
        if (arg6 != 0) {
            field1510 = arg7 >>> 24;
            field1511 = 256 - field1510;
            if (arg6 == 1) {
                field1505 = (arg7 & 0xFF0000) >> 16;
                field1514 = (arg7 & 0xFF00) >> 8;
                field1519 = arg7 & 0xFF;
            } else {
                field1494 = arg7 >>> 24;
                field1507 = 256 - field1494;
                int var10 = (arg7 & 0xFF00FF) * field1507 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field1507 & 0xFF0000;
                field1512 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method788(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method788(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method788(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method788(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method788(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method788(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method788(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method788(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method788(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()I")
    public final int method791() {
        return this.field1513 + this.field1501 + this.field1499;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
    public abstract void method793(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)V")
    public final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1497.method887()) {
            throw new IllegalStateException();
        }
        if (this.field1492 == null) {
            this.field1492 = new int[4];
        }
        this.field1497.method540(this.field1492);
        this.field1497.method572(this.field1497.field1744, this.field1497.field1737, arg0 + arg2, arg1 + arg3);
        int var8 = this.method791();
        int var9 = this.method789();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method793(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1497.method500(this.field1492[0], this.field1492[1], this.field1492[2], this.field1492[3]);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILus;II)V")
    public abstract void method795(int arg0, int arg1, class401 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()I")
    public final int method796() {
        return this.field1493;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
    public final void method797(int arg0, int arg1, int arg2, int arg3) {
        this.field1513 = arg0;
        this.field1516 = arg1;
        this.field1499 = arg2;
        this.field1491 = arg3;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()I")
    public final int method798() {
        return this.field1501;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([I[III)V")
    public abstract void method799(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lwb;II)V")
    public class108(class127 arg0, int arg1, int arg2) {
        this.field1497 = arg0;
        this.field1501 = arg1;
        this.field1493 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(FFFFFFLus;II)V")
    public final void method800(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class401 arg6, int arg7, int arg8) {
        if (this.field1497.method887()) {
            throw new IllegalStateException();
        }
        this.method787(arg0, arg1, arg2, arg3, arg4, arg5);
        class473 var10 = (class473) arg6;
        this.method799(var10.field6629, var10.field6625, field1500 - arg7, -arg8 - (field1488 - field1503));
    }
}

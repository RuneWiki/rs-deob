import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class106 extends class515 {

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "Lsa;")
    public class203 field1513;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    private static int field1509 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1503 = 0;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    private static int field1514 = 0;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field1530 = 0;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    private static int field1504;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    private static int field1511;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    private static int field1521;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    private static int field1535;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "[I")
    private int[] field1531;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIIIIII)V")
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1513.method1439()) {
            throw new IllegalStateException();
        }
        if (this.field1531 == null) {
            this.field1531 = new int[4];
        }
        this.field1513.method358(this.field1531);
        this.field1513.method335(this.field1513.field3041, this.field1513.field3047, arg0 + arg2, arg1 + arg3);
        int var8 = this.method784();
        int var9 = this.method780();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method789(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1513.method297(this.field1531[0], this.field1531[1], this.field1531[2], this.field1531[3]);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I[III)V")
    public abstract void method776(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()I")
    public final int method777() {
        return this.field1517;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V")
    public abstract void method778(int arg0, int arg1);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field1513.method1439()) {
            throw new IllegalStateException();
        } else if (this.method786(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field1525 = arg7;
            if (arg6 != 1) {
                field1527 = arg7 >>> 24;
                field1530 = 256 - field1527;
                if (arg6 == 0) {
                    field1503 = (arg7 & 0xFF0000) >> 16;
                    field1505 = (arg7 & 0xFF00) >> 8;
                    field1522 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field1514 = arg7 >>> 24;
                    field1509 = 256 - field1514;
                    int var11 = (arg7 & 0xFF00FF) * field1509 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field1509 & 0xFF0000;
                    field1533 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method778(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method778(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method778(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method778(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method778(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method778(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method778(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method778(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method778(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method778(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method778(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method778(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()I")
    public final int method780() {
        return this.field1524 + this.field1508 + this.field1528;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method781(int arg0, int arg1, class569 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method782(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class569 arg7, int arg8, int arg9) {
        if (this.field1513.method1439()) {
            throw new IllegalStateException();
        } else if (this.method786(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class211 var11 = (class211) arg7;
            this.method776(var11.field3168, var11.field3165, field1535 - arg8, -arg9 - (field1510 - field1511));
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIII)V")
    public final void method783(int arg0, int arg1, int arg2, int arg3) {
        this.field1523 = arg0;
        this.field1508 = arg1;
        this.field1519 = arg2;
        this.field1528 = arg3;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()I")
    public final int method784() {
        return this.field1523 + this.field1517 + this.field1519;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method786(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1523 + this.field1517 + this.field1519;
        int var8 = this.field1524 + this.field1508 + this.field1528;
        if (this.field1517 != var7 || this.field1524 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1508 * var11;
            float var14 = (float) this.field1508 * var12;
            float var15 = (float) this.field1523 * var9;
            float var16 = (float) this.field1523 * var10;
            float var17 = (float) this.field1519 * -var9;
            float var18 = (float) this.field1519 * -var10;
            float var19 = (float) this.field1528 * -var11;
            float var20 = (float) this.field1528 * -var12;
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
        if (var23 < (float) this.field1513.field3041) {
            var23 = this.field1513.field3041;
        }
        if (var24 > (float) this.field1513.field3050) {
            var24 = this.field1513.field3050;
        }
        if (var25 < (float) this.field1513.field3047) {
            var25 = this.field1513.field3047;
        }
        if (var26 > (float) this.field1513.field3022) {
            var26 = this.field1513.field3022;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field1520 = this.field1513.field3051;
        field1507 = (int) ((float) ((int) var25 * field1520) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1506 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1517 / var29);
        field1534 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1524 / var30);
        field1526 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1517 / var30);
        field1516 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1524 / var29);
        field1504 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1521 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1512 = (this.field1517 >> 1 << 12) + (field1526 * field1521 >> 4);
        field1529 = (this.field1524 >> 1 << 12) + (field1521 * field1516 >> 4);
        field1518 = field1506 * field1504 >> 4;
        field1532 = field1534 * field1504 >> 4;
        field1535 = (int) var23;
        field1515 = (int) var27;
        field1511 = (int) var25;
        field1510 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()I")
    public final int method787() {
        return this.field1524;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V")
    public abstract void method789(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lsa;II)V")
    public class106(class203 arg0, int arg1, int arg2) {
        this.field1513 = arg0;
        this.field1517 = arg1;
        this.field1524 = arg2;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class135 extends class701 {

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lcb;")
    public class483 field1699;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    private static int field1705 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    private static int field1698 = 0;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1697 = 0;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1706 = 0;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field1718 = 0;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field1713 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    private static int field1701;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    private static int field1707;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    private static int field1712;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    private static int field1719;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
    private int[] field1695;

    @OriginalMember(owner = "client!vf", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "(IIII)V")
    public final void method894(int arg0, int arg1, int arg2, int arg3) {
        this.field1722 = arg0;
        this.field1725 = arg1;
        this.field1704 = arg2;
        this.field1717 = arg3;
    }

    @OriginalMember(owner = "client!vf", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method895(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field1699.method2827()) {
            throw new IllegalStateException();
        } else if (this.method897(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field1726 = arg7;
            if (arg6 != 1) {
                field1706 = arg7 >>> 24;
                field1718 = 256 - field1706;
                if (arg6 == 0) {
                    field1716 = (arg7 & 0xFF0000) >> 16;
                    field1713 = (arg7 & 0xFF00) >> 8;
                    field1697 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field1705 = arg7 >>> 24;
                    field1698 = 256 - field1705;
                    int var11 = (arg7 & 0xFF00FF) * field1698 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field1698 & 0xFF0000;
                    field1703 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method7(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method7(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method7(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method7(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method7(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method7(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method7(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method7(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method7(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method7(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method7(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method7(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
    public abstract void method7(int arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "()I")
    public final int method896() {
        return this.field1722 + this.field1700 + this.field1704;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method897(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1722 + this.field1700 + this.field1704;
        int var8 = this.field1725 + this.field1696 + this.field1717;
        if (this.field1700 != var7 || this.field1696 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1725 * var11;
            float var14 = (float) this.field1725 * var12;
            float var15 = (float) this.field1722 * var9;
            float var16 = (float) this.field1722 * var10;
            float var17 = (float) this.field1704 * -var9;
            float var18 = (float) this.field1704 * -var10;
            float var19 = (float) this.field1717 * -var11;
            float var20 = (float) this.field1717 * -var12;
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
        if (var23 < (float) this.field1699.field6763) {
            var23 = this.field1699.field6763;
        }
        if (var24 > (float) this.field1699.field6749) {
            var24 = this.field1699.field6749;
        }
        if (var25 < (float) this.field1699.field6761) {
            var25 = this.field1699.field6761;
        }
        if (var26 > (float) this.field1699.field6776) {
            var26 = this.field1699.field6776;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field1723 = this.field1699.field6755;
        field1714 = (int) ((float) ((int) var25 * field1723) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1710 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1700 / var29);
        field1709 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1696 / var30);
        field1711 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1700 / var30);
        field1702 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1696 / var29);
        field1712 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1701 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1694 = (this.field1700 >> 1 << 12) + (field1711 * field1701 >> 4);
        field1724 = (this.field1696 >> 1 << 12) + (field1702 * field1701 >> 4);
        field1721 = field1712 * field1710 >> 4;
        field1715 = field1712 * field1709 >> 4;
        field1719 = (int) var23;
        field1708 = (int) var27;
        field1707 = (int) var25;
        field1720 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!vf", name = "DA", descriptor = "(IIIIIII)V")
    public final void method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1699.method2827()) {
            throw new IllegalStateException();
        }
        if (this.field1695 == null) {
            this.field1695 = new int[4];
        }
        this.field1699.method251(this.field1695);
        this.field1699.method300(this.field1699.field6763, this.field1699.field6761, arg0 + arg2, arg1 + arg3);
        int var8 = this.method896();
        int var9 = this.method901();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method3(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1699.method292(this.field1695[0], this.field1695[1], this.field1695[2], this.field1695[3]);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method899(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class616 arg7, int arg8, int arg9) {
        if (this.field1699.method2827()) {
            throw new IllegalStateException();
        } else if (this.method897(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class676 var11 = (class676) arg7;
            this.method10(var11.field9691, var11.field9694, field1719 - arg8, -arg9 - (field1720 - field1707));
        }
    }

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "()I")
    public final int method900() {
        return this.field1696;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([I[III)V")
    public abstract void method10(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vf", name = "ca", descriptor = "()I")
    public final int method901() {
        return this.field1725 + this.field1696 + this.field1717;
    }

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "(IIIII)V")
    public abstract void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "()I")
    public final int method902() {
        return this.field1700;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILua;II)V")
    public abstract void method6(int arg0, int arg1, class616 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lcb;II)V")
    public class135(class483 arg0, int arg1, int arg2) {
        this.field1699 = arg0;
        this.field1700 = arg1;
        this.field1696 = arg2;
    }
}

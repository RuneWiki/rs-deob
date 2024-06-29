import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public abstract class class131 extends class116 {

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "Lfg;")
    public class164 field1749;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public static int field1725 = 0;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!qaa", name = "v", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!qaa", name = "B", descriptor = "I")
    public static int field1744 = 0;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "I")
    private static int field1736 = 0;

    @OriginalMember(owner = "client!qaa", name = "A", descriptor = "I")
    private static int field1743 = 0;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "I")
    private static int field1728;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
    private static int field1730;

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
    private static int field1732;

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!qaa", name = "u", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!qaa", name = "w", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "I")
    private static int field1740;

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!qaa", name = "D", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!qaa", name = "F", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "[I")
    private int[] field1733;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method809(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1726 + this.field1717 + this.field1721;
        int var8 = this.field1722 + this.field1719 + this.field1747;
        if (this.field1717 != var7 || this.field1719 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1722 * var11;
            float var14 = (float) this.field1722 * var12;
            float var15 = (float) this.field1726 * var9;
            float var16 = (float) this.field1726 * var10;
            float var17 = (float) this.field1721 * -var9;
            float var18 = (float) this.field1721 * -var10;
            float var19 = (float) this.field1747 * -var11;
            float var20 = (float) this.field1747 * -var12;
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
        if (var23 < (float) this.field1749.field2227) {
            var23 = this.field1749.field2227;
        }
        if (var24 > (float) this.field1749.field2215) {
            var24 = this.field1749.field2215;
        }
        if (var25 < (float) this.field1749.field2195) {
            var25 = this.field1749.field2195;
        }
        if (var26 > (float) this.field1749.field2208) {
            var26 = this.field1749.field2208;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field1724 = this.field1749.field2206;
        field1729 = (int) ((float) ((int) var25 * field1724) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1748 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1717 / var29);
        field1734 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1719 / var30);
        field1741 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1717 / var30);
        field1737 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1719 / var29);
        field1730 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1728 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1742 = (this.field1717 >> 1 << 12) + (field1741 * field1728 >> 4);
        field1720 = (this.field1719 >> 1 << 12) + (field1737 * field1728 >> 4);
        field1739 = field1748 * field1730 >> 4;
        field1735 = field1734 * field1730 >> 4;
        field1740 = (int) var23;
        field1723 = (int) var27;
        field1732 = (int) var25;
        field1746 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "([I[III)V")
    public abstract void method233(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)V")
    public abstract void method232(int arg0, int arg1);

    @OriginalMember(owner = "client!qaa", name = "ma", descriptor = "()I")
    public final int method714() {
        return this.field1722 + this.field1719 + this.field1747;
    }

    @OriginalMember(owner = "client!qaa", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qaa", name = "KA", descriptor = "(IIII)V")
    public final void method720(int arg0, int arg1, int arg2, int arg3) {
        this.field1726 = arg0;
        this.field1722 = arg1;
        this.field1721 = arg2;
        this.field1747 = arg3;
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "()I")
    public final int method718() {
        return this.field1717;
    }

    @OriginalMember(owner = "client!qaa", name = "EA", descriptor = "()I")
    public final int method722() {
        return this.field1726 + this.field1717 + this.field1721;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method236(int arg0, int arg1, class594 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "(IIIIIII)V")
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1749.method1010()) {
            throw new IllegalStateException();
        }
        if (this.field1733 == null) {
            this.field1733 = new int[4];
        }
        this.field1749.method1025(this.field1733);
        this.field1749.method993(this.field1749.field2227, this.field1749.field2195, arg0 + arg2, arg1 + arg3);
        int var8 = this.method722();
        int var9 = this.method714();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method237(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1749.method1022(this.field1733[0], this.field1733[1], this.field1733[2], this.field1733[3]);
    }

    @OriginalMember(owner = "client!qaa", name = "la", descriptor = "()I")
    public final int method721() {
        return this.field1719;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method712(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        if (this.field1749.method1010()) {
            throw new IllegalStateException();
        } else if (this.method809(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class290 var10 = (class290) arg6;
            this.method233(var10.field4258, var10.field4259, field1740 - arg7, -arg8 - (field1746 - field1732));
        }
    }

    @OriginalMember(owner = "client!qaa", name = "DA", descriptor = "(IIIII)V")
    public abstract void method237(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qaa", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method724(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1749.method1010()) {
            throw new IllegalStateException();
        } else if (this.method809(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field1718 = arg7;
            if (arg6 != 1) {
                field1725 = arg7 >>> 24;
                field1727 = 256 - field1725;
                if (arg6 == 0) {
                    field1745 = (arg7 & 0xFF0000) >> 16;
                    field1731 = (arg7 & 0xFF00) >> 8;
                    field1744 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field1743 = arg7 >>> 24;
                    field1736 = 256 - field1743;
                    int var10 = (arg7 & 0xFF00FF) * field1736 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field1736 & 0xFF0000;
                    field1738 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method232(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method232(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method232(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method232(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method232(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method232(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method232(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method232(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method232(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method232(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method232(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method232(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lfg;II)V")
    public class131(class164 arg0, int arg1, int arg2) {
        this.field1749 = arg0;
        this.field1717 = arg1;
        this.field1719 = arg2;
    }
}

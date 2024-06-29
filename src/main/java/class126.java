import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class126 extends class139 {

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "Lj;")
    public class349 field1847;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private static int field1829 = 0;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    private static int field1835 = 0;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field1851 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    private static int field1834;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    private static int field1840;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    private static int field1852;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    private static int field1854;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "[I")
    private int[] field1855;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFLkf;II)V", line = 4)
    public final void method766(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class152 arg6, int arg7, int arg8) {
        if (this.field1847.method2163()) {
            throw new IllegalStateException();
        }
        this.method778(arg0, arg1, arg2, arg3, arg4, arg5);
        class129 var10 = (class129) arg6;
        this.method767(var10.field1894, var10.field1897, field1854 - arg7, -arg8 - (field1841 - field1852));
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFIII)V", line = 31)
    public final void method769(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1847.method2163()) {
            throw new IllegalStateException();
        }
        this.method778(arg0, arg1, arg2, arg3, arg4, arg5);
        field1828 = arg7;
        if (arg6 != 0) {
            field1833 = arg7 >>> 24;
            field1851 = 256 - field1833;
            if (arg6 == 1) {
                field1831 = (arg7 & 0xFF0000) >> 16;
                field1850 = (arg7 & 0xFF00) >> 8;
                field1830 = arg7 & 0xFF;
            } else {
                field1835 = arg7 >>> 24;
                field1829 = 256 - field1835;
                int var10 = (arg7 & 0xFF00FF) * field1829 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field1829 & 0xFF0000;
                field1849 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method779(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method779(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method779(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method779(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method779(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method779(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method779(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method779(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method779(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I", line = 115)
    public final int method771() {
        return this.field1853;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)V", line = 120)
    public final void method772(int arg0, int arg1, int arg2, int arg3) {
        this.field1846 = arg0;
        this.field1824 = arg1;
        this.field1827 = arg2;
        this.field1837 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()I", line = 130)
    public final int method774() {
        return this.field1853 + this.field1824 + this.field1837;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()I", line = 140)
    public final int method775() {
        return this.field1844;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIIII)V", line = 155)
    public final void method776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1847.method2163()) {
            throw new IllegalStateException();
        }
        if (this.field1855 == null) {
            this.field1855 = new int[4];
        }
        this.field1847.method2074(this.field1855);
        this.field1847.method1969(this.field1847.field4842, this.field1847.field4825, arg0 + arg2, arg1 + arg3);
        int var8 = this.method777();
        int var9 = this.method774();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method768(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1847.method1981(this.field1855[0], this.field1855[1], this.field1855[2], this.field1855[3]);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()I", line = 195)
    public final int method777() {
        return this.field1846 + this.field1844 + this.field1827;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFF)V", line = 204)
    private final void method778(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1846 + this.field1844 + this.field1827;
        int var8 = this.field1853 + this.field1824 + this.field1837;
        if (this.field1844 != var7 || this.field1853 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1824 * var11;
            float var14 = (float) this.field1824 * var12;
            float var15 = (float) this.field1846 * var9;
            float var16 = (float) this.field1846 * var10;
            float var17 = (float) this.field1827 * -var9;
            float var18 = (float) this.field1827 * -var10;
            float var19 = (float) this.field1837 * -var11;
            float var20 = (float) this.field1837 * -var12;
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
        if (var23 < (float) this.field1847.field4842) {
            var23 = (float) this.field1847.field4842;
        }
        if (var24 > (float) this.field1847.field4820) {
            var24 = (float) this.field1847.field4820;
        }
        if (var25 < (float) this.field1847.field4825) {
            var25 = (float) this.field1847.field4825;
        }
        if (var26 > (float) this.field1847.field4828) {
            var26 = (float) this.field1847.field4828;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field1842 = this.field1847.field4833;
        field1826 = (int) ((float) ((int) var25 * field1842) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1823 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1844 / var29);
        field1836 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1853 / var30);
        field1832 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1844 / var30);
        field1838 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1853 / var29);
        field1840 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1834 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1848 = (this.field1844 >> 1 << 12) + (field1834 * field1832 >> 4);
        field1825 = (this.field1853 >> 1 << 12) + (field1838 * field1834 >> 4);
        field1843 = field1840 * field1823 >> 4;
        field1839 = field1840 * field1836 >> 4;
        field1854 = (int) var23;
        field1845 = (int) var27;
        field1852 = (int) var25;
        field1841 = (int) var28;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lj;II)V", line = 346)
    public class126(class349 arg0, int arg1, int arg2) {
        this.field1847 = arg0;
        this.field1844 = arg1;
        this.field1853 = arg2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([I[III)V")
    public abstract void method767(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public abstract void method768(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILkf;II)V")
    public abstract void method770(int arg0, int arg1, class152 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
    public abstract void method779(int arg0, int arg1);
}

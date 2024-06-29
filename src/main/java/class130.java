import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class130 {

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    private int field1839 = -1;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    private int field1835;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field1841;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lvc;")
    private class196[] field1836;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "[Lvc;")
    private class196[] field1834;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lvc;")
    private class196 field1838;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    private int field1837;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lq;")
    private class128 field1831;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lhc;")
    public static class235 field1832;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
    public static void method886() {
        field1832 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    private final void method887(int arg0) {
        if (this.field1839 == arg0) {
            return;
        }
        this.field1839 = arg0;
        int var2 = class238.method1594(arg0, 4096);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field1837 != var2) {
            this.field1837 = var2;
            this.field1831 = null;
        }
        if (this.field1836 == null) {
            return;
        }
        this.field1830 = 0;
        int[] var3 = new int[this.field1836.length];
        for (int var4 = 0; var4 < this.field1836.length; var4++) {
            class196 var5 = this.field1836[var4];
            if (var5.method1247(this.field1833, this.field1840, this.field1835, this.field1839)) {
                var3[this.field1830] = var5.field2712;
                this.field1834[this.field1830++] = var5;
            }
        }
        class20.method149(0, var3, this.field1830 - 1, -1, this.field1834);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lhc;)V")
    public static final void method888(class235 arg0) {
        field1832 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIII)V")
    public final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method887(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field1841 == -1) {
            class64.method401(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field1831 == null) {
                this.field1831 = class90.field1260.method910(false, this.field1841, class90.field1267, this.field1837, 107);
            }
            if (!class90.field1260.method909(this.field1841, (byte) 85)) {
                class64.method401(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field1831 != null) {
                int var10 = arg4 * arg5 / -512;
                int var11;
                for (var11 = arg4 * var9 / 512 + (arg3 - arg4) / 2; var11 > arg4; var11 -= arg4) {
                }
                while (var11 < 0) {
                    var11 += arg4;
                }
                while (var10 > arg4) {
                    var10 -= arg4;
                }
                while (var10 < 0) {
                    var10 += arg4;
                }
                for (int var12 = var11 - arg4; var12 < class64.field879; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class64.field874; var13 += arg4) {
                        this.field1831.method705(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field1830 - 1; var14 >= 0; var14--) {
            this.field1834[var14].method1249(arg1, arg2, arg3, arg4, arg5, var9, this.field1838);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I[Lvc;IIII)V")
    public class130(int arg0, class196[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1833 = arg3;
        this.field1840 = arg4;
        this.field1835 = arg5;
        this.field1841 = arg0;
        this.field1836 = arg1;
        if (arg1 == null) {
            this.field1834 = null;
            this.field1838 = null;
        } else {
            this.field1834 = new class196[arg1.length];
            this.field1838 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

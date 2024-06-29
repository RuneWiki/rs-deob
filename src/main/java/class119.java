import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class119 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    private int field1928 = -1;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    private int field1929;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[Ljc;")
    private class246[] field1924;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[Ljc;")
    private class246[] field1926;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ljc;")
    private class246 field1921;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    private int field1923;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    private int field1925;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lhc;")
    public static class235 field1930;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ljb;")
    private class276 field1922;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)V")
    public final void method831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method832(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field1927 == -1) {
            class211.method1424(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field1922 == null) {
                this.field1922 = class195.field3087.method498(this.field1927, false, -121, this.field1923, class195.field3090);
            }
            if (!class195.field3087.method499((byte) -114, this.field1927)) {
                class211.method1424(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field1922 != null) {
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
                for (int var12 = var11 - arg4; var12 < class211.field3279; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class211.field3273; var13 += arg4) {
                        this.field1922.method845(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field1925 - 1; var14 >= 0; var14--) {
            this.field1926[var14].method1698(arg1, arg2, arg3, arg4, arg5, var9, this.field1921);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    private final void method832(int arg0) {
        if (this.field1928 == arg0) {
            return;
        }
        this.field1928 = arg0;
        int var2 = class199.method1350(arg0, -91);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field1923 != var2) {
            this.field1923 = var2;
            this.field1922 = null;
        }
        if (this.field1924 == null) {
            return;
        }
        this.field1925 = 0;
        int[] var3 = new int[this.field1924.length];
        for (int var4 = 0; var4 < this.field1924.length; var4++) {
            class246 var5 = this.field1924[var4];
            if (var5.method1693(this.field1920, this.field1931, this.field1929, this.field1928)) {
                var3[this.field1925] = var5.field4005;
                this.field1926[this.field1925++] = var5;
            }
        }
        class161.method1097(this.field1926, var3, 109, 0, this.field1925 - 1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V")
    public static void method833() {
        field1930 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lhc;)V")
    public static final void method834(class235 arg0) {
        field1930 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[Ljc;IIII)V")
    public class119(int arg0, class246[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1920 = arg3;
        this.field1931 = arg4;
        this.field1929 = arg5;
        this.field1927 = arg0;
        this.field1924 = arg1;
        if (arg1 == null) {
            this.field1926 = null;
            this.field1921 = null;
        } else {
            this.field1926 = new class246[arg1.length];
            this.field1921 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

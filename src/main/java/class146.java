import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class146 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    private int field2156 = -1;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    private int field2163;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    private int field2157;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[Lwa;")
    private class275[] field2161;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[Lwa;")
    private class275[] field2159;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lwa;")
    private class275 field2154;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    private int field2152;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lej;")
    private class51 field2153;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lub;")
    public static class92 field2162;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    private final void method1053(int arg0) {
        if (this.field2156 == arg0) {
            return;
        }
        this.field2156 = arg0;
        int var2 = class15.method115((byte) 27, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2152 != var2) {
            this.field2152 = var2;
            this.field2153 = null;
        }
        if (this.field2161 == null) {
            return;
        }
        this.field2160 = 0;
        int[] var3 = new int[this.field2161.length];
        for (int var4 = 0; var4 < this.field2161.length; var4++) {
            class275 var5 = this.field2161[var4];
            if (var5.method1882(this.field2163, this.field2158, this.field2155, this.field2156)) {
                var3[this.field2160] = var5.field4387;
                this.field2159[this.field2160++] = var5;
            }
        }
        class193.method1375(var3, this.field2160 - 1, -17290, 0, this.field2159);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lub;)V")
    public static final void method1054(class92 arg0) {
        field2162 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public static void method1055() {
        field2162 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1053(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2157 == -1) {
            class66.method532(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2153 == null) {
                this.field2153 = class224.field3596.method733(93, false, class224.field3609, this.field2152, this.field2157);
            }
            if (!class224.field3596.method730(0, this.field2157)) {
                class66.method532(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2153 != null) {
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
                for (int var12 = var11 - arg4; var12 < class66.field1036; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class66.field1035; var13 += arg4) {
                        this.field2153.method431(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2160 - 1; var14 >= 0; var14--) {
            this.field2159[var14].method1877(arg1, arg2, arg3, arg4, arg5, var9, this.field2154);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I[Lwa;IIII)V")
    public class146(int arg0, class275[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2163 = arg3;
        this.field2158 = arg4;
        this.field2155 = arg5;
        this.field2157 = arg0;
        this.field2161 = arg1;
        if (arg1 == null) {
            this.field2159 = null;
            this.field2154 = null;
        } else {
            this.field2159 = new class275[arg1.length];
            this.field2154 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class127 {

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field2138 = -1;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[Lwg;")
    private class173[] field2131;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[Lwg;")
    private class173[] field2130;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lwg;")
    private class173 field2141;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private int field2133;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    private int field2137;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lbc;")
    private class148 field2136;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Llc;")
    public static class270 field2134;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIII)V")
    public final void method967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method970(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2140 == -1) {
            class130.method996(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2136 == null) {
                this.field2136 = class244.field3600.method529(34, this.field2133, class244.field3597, false, this.field2140);
            }
            if (!class244.field3600.method530(0, this.field2140)) {
                class130.method996(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2136 != null) {
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
                for (int var12 = var11 - arg4; var12 < arg3; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < arg4; var13 += arg4) {
                        this.field2136.method719(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2137 - 1; var14 >= 0; var14--) {
            this.field2130[var14].method1232(arg1, arg2, arg3, arg4, arg5, var9, this.field2141);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Llc;)V")
    public static final void method968(class270 arg0) {
        field2134 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    public static void method969() {
        field2134 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I[Lwg;IIII)V")
    public class127(int arg0, class173[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2132 = arg3;
        this.field2135 = arg4;
        this.field2139 = arg5;
        this.field2140 = arg0;
        this.field2131 = arg1;
        if (arg1 == null) {
            this.field2130 = null;
            this.field2141 = null;
        } else {
            this.field2130 = new class173[arg1.length];
            this.field2141 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    private final void method970(int arg0) {
        if (this.field2138 == arg0) {
            return;
        }
        this.field2138 = arg0;
        int var2 = class277.method1925(arg0, true);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2133 != var2) {
            this.field2133 = var2;
            this.field2136 = null;
        }
        if (this.field2131 == null) {
            return;
        }
        this.field2137 = 0;
        int[] var3 = new int[this.field2131.length];
        for (int var4 = 0; var4 < this.field2131.length; var4++) {
            class173 var5 = this.field2131[var4];
            if (var5.method1235(this.field2132, this.field2135, this.field2139, this.field2138)) {
                var3[this.field2137] = var5.field2645;
                this.field2130[this.field2137++] = var5;
            }
        }
        class234.method1620(var3, 0, (byte) 41, this.field2137 - 1, this.field2130);
    }
}

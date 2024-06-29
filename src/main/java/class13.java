import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class13 {

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    private int field169 = -1;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[Lql;")
    private class65[] field162;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "[Lql;")
    private class65[] field160;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lql;")
    private class65 field166;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lpg;")
    private class187 field170;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lbc;")
    public static class282 field164;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V")
    public static void method80() {
        field164 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method82(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field163 == -1) {
            class155.method1018(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field170 == null) {
                this.field170 = class297.field4685.method769(this.field163, false, this.field167, class297.field4699, 5783);
            }
            if (!class297.field4685.method774(this.field163, -91)) {
                class155.method1018(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field170 != null) {
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
                for (int var12 = var11 - arg4; var12 < class155.field2244; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class155.field2247; var13 += arg4) {
                        this.field170.method853(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field168 - 1; var14 >= 0; var14--) {
            this.field160[var14].method391(arg1, arg2, arg3, arg4, arg5, var9, this.field166);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    private final void method82(int arg0) {
        if (this.field169 == arg0) {
            return;
        }
        this.field169 = arg0;
        int var2 = class29.method178(-99, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field167 != var2) {
            this.field167 = var2;
            this.field170 = null;
        }
        if (this.field162 == null) {
            return;
        }
        this.field168 = 0;
        int[] var3 = new int[this.field162.length];
        for (int var4 = 0; var4 < this.field162.length; var4++) {
            class65 var5 = this.field162[var4];
            if (var5.method394(this.field161, this.field159, this.field165, this.field169)) {
                var3[this.field168] = var5.field772;
                this.field160[this.field168++] = var5;
            }
        }
        class175.method1134(this.field160, var3, this.field168 - 1, 0, (byte) -5);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lbc;)V")
    public static final void method83(class282 arg0) {
        field164 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I[Lql;IIII)V")
    public class13(int arg0, class65[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field161 = arg3;
        this.field159 = arg4;
        this.field165 = arg5;
        this.field163 = arg0;
        this.field162 = arg1;
        if (arg1 == null) {
            this.field160 = null;
            this.field166 = null;
        } else {
            this.field160 = new class65[arg1.length];
            this.field166 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

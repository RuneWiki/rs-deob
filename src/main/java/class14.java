import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class14 {

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    private int field296 = -1;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[Lpm;")
    private class56[] field295;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[Lpm;")
    private class56[] field289;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lpm;")
    private class56 field291;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Laj;")
    public static class151 field293;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lbj;")
    private class92 field294;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Laj;)V")
    public static final void method78(class151 arg0) {
        field293 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
    public static void method79() {
        field293 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    private final void method80(int arg0) {
        if (this.field296 == arg0) {
            return;
        }
        this.field296 = arg0;
        int var2 = class258.method1848(arg0, true);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field297 != var2) {
            this.field297 = var2;
            this.field294 = null;
        }
        if (this.field295 == null) {
            return;
        }
        this.field299 = 0;
        int[] var3 = new int[this.field295.length];
        for (int var4 = 0; var4 < this.field295.length; var4++) {
            class56 var5 = this.field295[var4];
            if (var5.method355(this.field298, this.field288, this.field292, this.field296)) {
                var3[this.field299] = var5.field990;
                this.field289[this.field299++] = var5;
            }
        }
        class205.method1428(var3, 0, -98, this.field289, this.field299 - 1);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I[Lpm;IIII)V")
    public class14(int arg0, class56[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field298 = arg3;
        this.field288 = arg4;
        this.field292 = arg5;
        this.field290 = arg0;
        this.field295 = arg1;
        if (arg1 == null) {
            this.field289 = null;
            this.field291 = null;
        } else {
            this.field289 = new class56[arg1.length];
            this.field291 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method80(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field290 == -1) {
            class211.method1483(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field294 == null) {
                this.field294 = class128.field2136.method706((byte) 7, this.field297, this.field290, class128.field2127, false);
            }
            if (!class128.field2136.method704((byte) -114, this.field290)) {
                class211.method1483(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field294 != null) {
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
                        this.field294.method661(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field299 - 1; var14 >= 0; var14--) {
            this.field289[var14].method354(arg1, arg2, arg3, arg4, arg5, var9, this.field291);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class205 {

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    private int field3299 = -1;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    private int field3297;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    private int field3296;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    private int field3301;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    private int field3298;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[Lph;")
    private class81[] field3295;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[Lph;")
    private class81[] field3300;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lph;")
    private class81 field3291;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    private int field3293;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lfa;")
    public static class273 field3294;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lea;")
    private class38 field3302;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
    public static void method1464() {
        field3294 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lfa;)V")
    public static final void method1465(class273 arg0) {
        field3294 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1467(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3298 == -1) {
            class62.method380(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3302 == null) {
                this.field3302 = class172.field2670.method1122(this.field3298, -8933, class172.field2664, false, this.field3293);
            }
            if (!class172.field2670.method1125(this.field3298, 64)) {
                class62.method380(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3302 != null) {
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
                        this.field3302.method241(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3292 - 1; var14 >= 0; var14--) {
            this.field3300[var14].method549(arg1, arg2, arg3, arg4, arg5, var9, this.field3291);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    private final void method1467(int arg0) {
        if (this.field3299 == arg0) {
            return;
        }
        this.field3299 = arg0;
        int var2 = class276.method1918(arg0, (byte) 27);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3293 != var2) {
            this.field3293 = var2;
            this.field3302 = null;
        }
        if (this.field3295 == null) {
            return;
        }
        this.field3292 = 0;
        int[] var3 = new int[this.field3295.length];
        for (int var4 = 0; var4 < this.field3295.length; var4++) {
            class81 var5 = this.field3295[var4];
            if (var5.method550(this.field3297, this.field3296, this.field3301, this.field3299)) {
                var3[this.field3292] = var5.field1283;
                this.field3300[this.field3292++] = var5;
            }
        }
        class34.method197(0, this.field3300, -1, this.field3292 - 1, var3);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I[Lph;IIII)V")
    public class205(int arg0, class81[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3297 = arg3;
        this.field3296 = arg4;
        this.field3301 = arg5;
        this.field3298 = arg0;
        this.field3295 = arg1;
        if (arg1 == null) {
            this.field3300 = null;
            this.field3291 = null;
        } else {
            this.field3300 = new class81[arg1.length];
            this.field3291 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

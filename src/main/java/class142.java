import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class142 {

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    private int field2294 = -1;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    private int field2297;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[Lij;")
    private class209[] field2295;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[Lij;")
    private class209[] field2289;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lij;")
    private class209 field2291;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    private int field2287;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lgi;")
    public static class164 field2292;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Le;")
    private class67 field2296;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIII)V")
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method979(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2297 == -1) {
            class94.method660(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2296 == null) {
                this.field2296 = class136.field2196.method1024(false, this.field2297, class136.field2201, this.field2286, -27729);
            }
            if (!class136.field2196.method1022(1, this.field2297)) {
                class94.method660(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2296 != null) {
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
                        this.field2296.method450(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2287 - 1; var14 >= 0; var14--) {
            this.field2289[var14].method1443(arg1, arg2, arg3, arg4, arg5, var9, this.field2291);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lgi;)V")
    public static final void method977(class164 arg0) {
        field2292 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()V")
    public static void method978() {
        field2292 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    private final void method979(int arg0) {
        if (this.field2294 == arg0) {
            return;
        }
        this.field2294 = arg0;
        int var2 = class41.method283(557829249, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2286 != var2) {
            this.field2286 = var2;
            this.field2296 = null;
        }
        if (this.field2295 == null) {
            return;
        }
        this.field2287 = 0;
        int[] var3 = new int[this.field2295.length];
        for (int var4 = 0; var4 < this.field2295.length; var4++) {
            class209 var5 = this.field2295[var4];
            if (var5.method1433(this.field2290, this.field2288, this.field2293, this.field2294)) {
                var3[this.field2287] = var5.field3337;
                this.field2289[this.field2287++] = var5;
            }
        }
        class286.method1943(this.field2287 - 1, var3, this.field2289, 0, 0);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I[Lij;IIII)V")
    public class142(int arg0, class209[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2290 = arg3;
        this.field2288 = arg4;
        this.field2293 = arg5;
        this.field2297 = arg0;
        this.field2295 = arg1;
        if (arg1 == null) {
            this.field2289 = null;
            this.field2291 = null;
        } else {
            this.field2289 = new class209[arg1.length];
            this.field2291 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

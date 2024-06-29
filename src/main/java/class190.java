import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class190 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    private int field3031 = -1;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    private int field3029;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    private int field3037;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[Lsg;")
    private class32[] field3040;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[Lsg;")
    private class32[] field3038;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lsg;")
    private class32 field3032;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    private int field3034;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Ljj;")
    public static class134 field3030;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lwe;")
    private class43 field3035;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    private final void method1290(int arg0) {
        if (this.field3031 == arg0) {
            return;
        }
        this.field3031 = arg0;
        int var2 = client.method1507(1083397953, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3034 != var2) {
            this.field3034 = var2;
            this.field3035 = null;
        }
        if (this.field3040 == null) {
            return;
        }
        this.field3033 = 0;
        int[] var3 = new int[this.field3040.length];
        for (int var4 = 0; var4 < this.field3040.length; var4++) {
            class32 var5 = this.field3040[var4];
            if (var5.method214(this.field3039, this.field3029, this.field3037, this.field3031)) {
                var3[this.field3033] = var5.field389;
                this.field3038[this.field3033++] = var5;
            }
        }
        class58.method443(this.field3033 - 1, -123, this.field3038, var3, 0);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
    public static void method1291() {
        field3030 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljj;)V")
    public static final void method1292(class134 arg0) {
        field3030 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1290(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3036 == -1) {
            class63.method507(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3035 == null) {
                this.field3035 = class145.field2350.method313(this.field3036, this.field3034, false, class145.field2346, 2985);
            }
            if (!class145.field2350.method312((byte) -112, this.field3036)) {
                class63.method507(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3035 != null) {
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
                for (int var12 = var11 - arg4; var12 < class63.field897; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class63.field895; var13 += arg4) {
                        this.field3035.method163(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3033 - 1; var14 >= 0; var14--) {
            this.field3038[var14].method222(arg1, arg2, arg3, arg4, arg5, var9, this.field3032);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I[Lsg;IIII)V")
    public class190(int arg0, class32[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3039 = arg3;
        this.field3029 = arg4;
        this.field3037 = arg5;
        this.field3036 = arg0;
        this.field3040 = arg1;
        if (arg1 == null) {
            this.field3038 = null;
            this.field3032 = null;
        } else {
            this.field3038 = new class32[arg1.length];
            this.field3032 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

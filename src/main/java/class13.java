import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class13 {

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    private int field184 = -1;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "[Lrg;")
    private class257[] field187;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[Lrg;")
    private class257[] field185;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lrg;")
    private class257 field188;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lvh;")
    public static class108 field186;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lda;")
    private class197 field182;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIII)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method79(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field183 == -1) {
            class283.method1855(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field182 == null) {
                this.field182 = class287.field4555.method237(false, this.field181, (byte) -75, class287.field4571, this.field183);
            }
            if (!class287.field4555.method236(62, this.field183)) {
                class283.method1855(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field182 != null) {
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
                for (int var12 = var11 - arg4; var12 < class283.field4491; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class283.field4488; var13 += arg4) {
                        this.field182.method455(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field178 - 1; var14 >= 0; var14--) {
            this.field185[var14].method1706(arg1, arg2, arg3, arg4, arg5, var9, this.field188);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V")
    public static void method78() {
        field186 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    private final void method79(int arg0) {
        if (this.field184 == arg0) {
            return;
        }
        this.field184 = arg0;
        int var2 = class116.method809((byte) 109, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field181 != var2) {
            this.field181 = var2;
            this.field182 = null;
        }
        if (this.field187 == null) {
            return;
        }
        this.field178 = 0;
        int[] var3 = new int[this.field187.length];
        for (int var4 = 0; var4 < this.field187.length; var4++) {
            class257 var5 = this.field187[var4];
            if (var5.method1704(this.field177, this.field179, this.field180, this.field184)) {
                var3[this.field178] = var5.field4200;
                this.field185[this.field178++] = var5;
            }
        }
        class261.method1732(this.field178 - 1, var3, this.field185, -21, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lvh;)V")
    public static final void method80(class108 arg0) {
        field186 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I[Lrg;IIII)V")
    public class13(int arg0, class257[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field177 = arg3;
        this.field179 = arg4;
        this.field180 = arg5;
        this.field183 = arg0;
        this.field187 = arg1;
        if (arg1 == null) {
            this.field185 = null;
            this.field188 = null;
        } else {
            this.field185 = new class257[arg1.length];
            this.field188 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class38 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    private int field512 = -1;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[Lcf;")
    private class95[] field520;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[Lcf;")
    private class95[] field516;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lcf;")
    private class95 field511;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lmc;")
    private class201 field513;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lpf;")
    public static class294 field522;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lpf;)V")
    public static final void method226(class294 arg0) {
        field522 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    private final void method227(int arg0) {
        if (this.field512 == arg0) {
            return;
        }
        this.field512 = arg0;
        int var2 = class20.method132(arg0, (byte) 74);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field519 != var2) {
            this.field519 = var2;
            this.field513 = null;
        }
        if (this.field520 == null) {
            return;
        }
        this.field521 = 0;
        int[] var3 = new int[this.field520.length];
        for (int var4 = 0; var4 < this.field520.length; var4++) {
            class95 var5 = this.field520[var4];
            if (var5.method618(this.field515, this.field518, this.field517, this.field512)) {
                var3[this.field521] = var5.field1495;
                this.field516[this.field521++] = var5;
            }
        }
        class154.method936(0, this.field516, this.field521 - 1, var3, true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static void method228() {
        field522 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method227(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field514 == -1) {
            class111.method702(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field513 == null) {
                this.field513 = class249.field3775.method1311(-112, this.field519, class249.field3771, this.field514, false);
            }
            if (!class249.field3775.method1306(65535, this.field514)) {
                class111.method702(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field513 != null) {
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
                for (int var12 = var11 - arg4; var12 < class111.field1719; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class111.field1718; var13 += arg4) {
                        this.field513.method1283(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field521 - 1; var14 >= 0; var14--) {
            this.field516[var14].method608(arg1, arg2, arg3, arg4, arg5, var9, this.field511);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I[Lcf;IIII)V")
    public class38(int arg0, class95[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field515 = arg3;
        this.field518 = arg4;
        this.field517 = arg5;
        this.field514 = arg0;
        this.field520 = arg1;
        if (arg1 == null) {
            this.field516 = null;
            this.field511 = null;
        } else {
            this.field516 = new class95[arg1.length];
            this.field511 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

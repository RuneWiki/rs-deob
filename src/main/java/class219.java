import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class219 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    private int field3504 = -1;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    private int field3507;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    private int field3508;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "[Lnc;")
    private class87[] field3509;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[Lnc;")
    private class87[] field3505;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lnc;")
    private class87 field3502;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lak;")
    private class140 field3503;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Llc;")
    public static class86 field3510;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V")
    public static void method1570() {
        field3510 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    private final void method1571(int arg0) {
        if (this.field3504 == arg0) {
            return;
        }
        this.field3504 = arg0;
        int var2 = class98.method755(-18002, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3500 != var2) {
            this.field3500 = var2;
            this.field3503 = null;
        }
        if (this.field3509 == null) {
            return;
        }
        this.field3511 = 0;
        int[] var3 = new int[this.field3509.length];
        for (int var4 = 0; var4 < this.field3509.length; var4++) {
            class87 var5 = this.field3509[var4];
            if (var5.method660(this.field3501, this.field3507, this.field3506, this.field3504)) {
                var3[this.field3511] = var5.field1289;
                this.field3505[this.field3511++] = var5;
            }
        }
        class275.method1902(this.field3511 - 1, var3, 0, 9395, this.field3505);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Llc;)V")
    public static final void method1572(class86 arg0) {
        field3510 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1571(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3508 == -1) {
            class70.method508(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3503 == null) {
                this.field3503 = class47.field689.method234(255, this.field3500, class47.field683, false, this.field3508);
            }
            if (!class47.field689.method228(this.field3508, 121)) {
                class70.method508(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3503 != null) {
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
                for (int var12 = var11 - arg4; var12 < class70.field1030; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class70.field1028; var13 += arg4) {
                        this.field3503.method74(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3511 - 1; var14 >= 0; var14--) {
            this.field3505[var14].method659(arg1, arg2, arg3, arg4, arg5, var9, this.field3502);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I[Lnc;IIII)V")
    public class219(int arg0, class87[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3501 = arg3;
        this.field3507 = arg4;
        this.field3506 = arg5;
        this.field3508 = arg0;
        this.field3509 = arg1;
        if (arg1 == null) {
            this.field3505 = null;
            this.field3502 = null;
        } else {
            this.field3505 = new class87[arg1.length];
            this.field3502 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class160 extends class646 {

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    private int field2600 = 1;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    private int field2602 = 204;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    private int field2598 = 1;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "Lvh;")
    public static class125 field2595 = new class125(56, -1);

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Lf;")
    public static class257 field2601;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)[I", line = 3)
    public final int[] method424(int arg0, byte arg1) {
        ++field2594;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (arg1 != -120) {
            method1204(38);
        }
        if (super.field9156.field5075) {
            for (int var4 = 0; ~class89.field1330 < ~var4; ++var4) {
                int var5 = class518.field7652[var4];
                int var6 = class78.field1195[arg0];
                int var7 = this.field2598 * var5 >> 12;
                int var8 = this.field2600 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2598) * this.field2598;
                int var10 = var6 % (4096 / this.field2600) * this.field2600;
                if (var10 < this.field2602) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field2602) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2602 > var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lek;IB)V", line = 92)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field2596;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field2602 = arg0.method2755((byte) -64);
                }
            } else {
                this.field2600 = arg0.method2705(-93);
            }
        } else {
            this.field2598 = arg0.method2705(-128);
        }
        if (arg2 <= 7) {
            this.method424(-29, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 137)
    public static void method1204(int arg0) {
        field2601 = null;
        if (arg0 != 4) {
            field2601 = null;
        }
        field2595 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 152)
    public class160() {
        super(0, true);
    }
}

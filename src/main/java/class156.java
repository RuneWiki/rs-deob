import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class156 extends class62 {

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    private int field2318 = 204;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    private int field2321 = 1;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    private int field2322 = 1;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "Loa;")
    public static class597 field2323;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)V", line = 4)
    public static void method1126(int arg0) {
        if (arg0 != 1) {
            field2323 = null;
        }
        field2323 = null;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 17)
    public class156() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(II)[I", line = 20)
    public final int[] method13(int arg0, int arg1) {
        ++field2320;
        int[] var3 = super.field774.method3086(arg0, arg1 ^ -656024161);
        if (super.field774.field7499) {
            for (int var4 = 0; ~class438.field5847 < ~var4; ++var4) {
                int var5 = class200.field2965[var4];
                int var6 = class309.field4265[arg0];
                int var7 = this.field2322 * var5 >> 12;
                int var8 = this.field2321 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2322) * this.field2322;
                int var10 = var6 % (4096 / this.field2321) * this.field2321;
                if (~this.field2318 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field2318) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2318 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 656024161) {
            method1127(-43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "(I)V", line = 115)
    public static final void method1127(int arg0) {
        class131.field1806.method837(126);
        if (arg0 <= 93) {
            method1127(-17);
        }
        ++field2324;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lgw;II)V", line = 131)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field2317;
        if (arg1 == -1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field2318 = arg0.method1045(true);
                    }
                } else {
                    this.field2321 = arg0.method1032((byte) -33);
                }
            } else {
                this.field2322 = arg0.method1032((byte) -33);
            }
        }
    }
}

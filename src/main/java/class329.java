import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class329 extends class667 {

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    private int field4648 = 204;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field4650 = 1;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    private int field4647 = 1;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field4645 = 1407;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[Z")
    public static boolean[] field4646 = new boolean[100];

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "[[I")
    public static int[][] field4651;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[I", line = 7)
    public final int[] method117(byte arg0, int arg1) {
        ++field4652;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            field4645 = 80;
        }
        if (super.field9355.field3728) {
            for (int var4 = 0; ~class77.field1455 < ~var4; ++var4) {
                int var5 = class20.field261[var4];
                int var6 = class385.field5384[arg1];
                int var7 = this.field4647 * var5 >> 12;
                int var8 = this.field4650 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4647) * this.field4647;
                int var10 = var6 % (4096 / this.field4650) * this.field4650;
                if (~this.field4648 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4648 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field4648) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
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
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 195)
    public class329() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lud;II)V", line = 101)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field4648 = arg0.method253(-13900);
                    }
                } else {
                    this.field4650 = arg0.method273(255);
                }
            } else {
                this.field4647 = arg0.method273(255);
            }
            ++field4653;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/awt/Canvas;ILd;I)Lha;", line = 144)
    public static final class58 method2099(int arg0, Canvas arg1, int arg2, class149 arg3, int arg4) {
        if (arg0 != -25877) {
            return null;
        } else {
            ++field4649;
            return new class381(arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(Z)V", line = 156)
    public static final void method2100(boolean arg0) {
        class510 var1 = class496.field7066;
        synchronized (class496.field7066) {
            class496.field7066.method3048(!arg0);
        }
        if (arg0) {
            ++field4644;
            class510 var2 = class313.field4417;
            synchronized (class313.field4417) {
                class313.field4417.method3048(false);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 176)
    public static void method2101(int arg0) {
        field4651 = null;
        if (arg0 == 0) {
            field4646 = null;
        }
    }
}

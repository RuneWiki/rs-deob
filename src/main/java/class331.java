import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class331 extends class362 {

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "I")
    private int field4488 = 204;

    @OriginalMember(owner = "client!hfa", name = "y", descriptor = "I")
    private int field4487 = 1;

    @OriginalMember(owner = "client!hfa", name = "B", descriptor = "I")
    private int field4490 = 1;

    @OriginalMember(owner = "client!hfa", name = "A", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!hfa", name = "C", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!hfa", name = "D", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!hfa", name = "F", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!hfa", name = "E", descriptor = "Ljava/applet/Applet;")
    public static Applet field4493;

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V", line = 191)
    public class331() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lfca;II)V", line = 10)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field4494;
        if (arg2 != -1) {
            method2089(-59, -116, 14);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4488 = arg0.method763(115);
                }
            } else {
                this.field4487 = arg0.method793((byte) 102);
            }
        } else {
            this.field4490 = arg0.method793((byte) 44);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)[I", line = 60)
    public final int[] method156(int arg0, int arg1) {
        ++field4491;
        int[] var3 = super.field4927.method808(-128, arg1);
        if (arg0 != -2026769311) {
            this.field4490 = 52;
        }
        if (super.field4927.field1471) {
            for (int var4 = 0; ~class769.field10597 < ~var4; ++var4) {
                int var5 = class172.field2750[var4];
                int var6 = class135.field2287[arg1];
                int var7 = this.field4490 * var5 >> 12;
                int var8 = this.field4487 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4490) * this.field4490;
                int var10 = var6 % (4096 / this.field4487) * this.field4487;
                if (this.field4488 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field4488) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field4488) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
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

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V", line = 143)
    public static final void method2087(boolean arg0) {
        ++field4492;
        class278.method1786();
        for (int var1 = 0; var1 < 4; ++var1) {
            class711.field9798[var1].method2189((byte) -127);
        }
        class420.method2468((byte) 8);
        if (arg0) {
            field4493 = null;
        }
        class338.method2113(-85);
        class333.method2093(49);
        System.gc();
        class95.field1472.method494();
    }

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "(B)V", line = 166)
    public static void method2088(byte arg0) {
        if (arg0 != 22) {
            method2087(false);
        }
        field4493 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "(III)Z", line = 180)
    public static final boolean method2089(int arg0, int arg1, int arg2) {
        if (arg2 >= -122) {
            method2089(-45, -62, 64);
        }
        ++field4489;
        return class629.method3534(arg0, (byte) 100, arg1) | ~(arg0 & 458752) != -1 || class35.method206(0, arg0, arg1);
    }
}

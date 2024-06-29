import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class153 extends class585 {

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    private int field2166 = 1;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "I")
    private int field2173 = 1;

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
    private int field2172 = 204;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "[I")
    public static int[] field2170 = new int[1];

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "[I")
    public static int[] field2169 = new int[64];

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "Lwia;")
    public static class791 field2167;

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V", line = 3)
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)[I", line = 10)
    public final int[] method55(int arg0, int arg1) {
        ++field2171;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 <= 123) {
            this.method54((class494) null, -5, -61);
        }
        if (super.field8255.field3677) {
            for (int var4 = 0; class293.field4278 > var4; ++var4) {
                int var5 = class581.field8200[var4];
                int var6 = class633.field8892[arg0];
                int var7 = this.field2173 * var5 >> 12;
                int var8 = this.field2166 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2173) * this.field2173;
                int var10 = var6 % (4096 / this.field2166) * this.field2166;
                if (this.field2172 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field2172 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2172) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
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

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lso;II)V", line = 95)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2172 = arg0.method2998(true);
                }
            } else {
                this.field2166 = arg0.method2964((byte) 51);
            }
        } else {
            this.field2173 = arg0.method2964((byte) 41);
        }
        if (arg1 != 1) {
            field2169 = null;
        }
        ++field2168;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V", line = 147)
    public static void method1050(int arg0) {
        field2169 = null;
        field2170 = null;
        if (arg0 != 1) {
            field2169 = null;
        }
        field2167 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class405 extends class149 {

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    private int field6115 = 204;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
    private int field6118 = 1;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    private int field6119 = 1;

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
    public static int field6121 = 0;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
    public static int field6116 = 0;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "Lwi;")
    public static class340 field6117 = new class340(10, 2, 2, 0);

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "S")
    public static short field6123 = 32767;

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 59)
    public class405() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBLtl;)V", line = 9)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field6120;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field6115 = arg2.method631(10494);
                }
            } else {
                this.field6119 = arg2.method618((byte) 100);
            }
        } else {
            this.field6118 = arg2.method618((byte) 100);
        }
        if (arg1 != 35) {
            this.method92(122, 40);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[I", line = 80)
    public final int[] method92(int arg0, int arg1) {
        ++field6122;
        if (arg0 != -10835) {
            method2477((byte) -121);
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 102);
        if (super.field2152.field7051) {
            for (int var4 = 0; ~class316.field4838 < ~var4; ++var4) {
                int var5 = class197.field2791[var4];
                int var6 = class185.field2613[arg1];
                int var7 = this.field6118 * var5 >> 12;
                int var8 = this.field6119 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6118) * this.field6118;
                int var10 = var6 % (4096 / this.field6119) * this.field6119;
                if (var10 < this.field6115) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field6115 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field6115 < ~var9) {
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

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)V", line = 169)
    public static void method2477(byte arg0) {
        field6117 = null;
        if (arg0 >= -121) {
            field6116 = -48;
        }
    }
}

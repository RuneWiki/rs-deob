import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class332 extends class354 {

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    private int field5176 = 1;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    private int field5178 = 1;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    private int field5177 = 204;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field5174 = 0;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Lef;")
    public static class342 field5172;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILps;Lqa;I)V", line = 4)
    public static final void method2146(int arg0, int arg1, class63 arg2, class165 arg3, int arg4) {
        class372.field5663.method450((byte) 73);
        ++field5171;
        if (!class88.field1272) {
            if (arg1 <= 106) {
                method2146(36, 75, (class63) null, (class165) null, -123);
            }
            for (class484 var5 = (class484) arg2.method445(33); var5 != null; var5 = (class484) arg2.method451(false)) {
                class38 var6 = class12.field210.method1851(36, var5.field7129);
                if (class23.method220(125, var6)) {
                    boolean var7 = class424.method2583(arg0, arg3, -126, var6, arg4, var5);
                    if (var7) {
                        class501.method3005(var6, arg3, var5, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(BI)[I", line = 38)
    public final int[] method270(byte arg0, int arg1) {
        ++field5175;
        if (arg0 > -74) {
            this.field5176 = 78;
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            for (int var4 = 0; ~class531.field7814 < ~var4; ++var4) {
                int var5 = class195.field2616[var4];
                int var6 = class350.field5392[arg1];
                int var7 = this.field5178 * var5 >> 12;
                int var8 = this.field5176 * var6 >> 12;
                int var9 = var5 % (4096 / this.field5178) * this.field5178;
                int var10 = var6 % (4096 / this.field5176) * this.field5176;
                if (~var10 > ~this.field5177) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field5177) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field5177) {
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

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 126)
    public class332() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lnj;II)V", line = 136)
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field5177 = arg0.method1074(-635989152);
                }
            } else {
                this.field5176 = arg0.method1087(false);
            }
        } else {
            this.field5178 = arg0.method1087(false);
        }
        ++field5173;
        if (arg2 != 1638) {
            this.method270((byte) -91, 94);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 181)
    public static void method2147(byte arg0) {
        if (arg0 >= -41) {
            field5174 = 124;
        }
        field5172 = null;
    }
}

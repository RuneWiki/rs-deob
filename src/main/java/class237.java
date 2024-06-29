import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class237 extends class615 {

    @OriginalMember(owner = "client!fga", name = "H", descriptor = "I")
    private int field3349 = 204;

    @OriginalMember(owner = "client!fga", name = "K", descriptor = "I")
    private int field3352 = 1;

    @OriginalMember(owner = "client!fga", name = "O", descriptor = "I")
    private int field3356 = 1;

    @OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
    public static int field3351 = 0;

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "Lmga;")
    public static class666 field3350 = new class666(8);

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!fga", name = "L", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!fga", name = "M", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!fga", name = "N", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!fga", name = "G", descriptor = "Lkca;")
    public static class76 field3348;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IB)[I", line = 4)
    public final int[] method8(int arg0, byte arg1) {
        ++field3355;
        int[] var3 = super.field8125.method298(arg0, arg1 + 141);
        if (super.field8125.field579) {
            for (int var4 = 0; var4 < class505.field6740; ++var4) {
                int var5 = class168.field2599[var4];
                int var6 = class402.field5353[arg0];
                int var7 = this.field3356 * var5 >> 12;
                int var8 = this.field3352 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3356) * this.field3356;
                int var10 = var6 % (4096 / this.field3352) * this.field3352;
                if (this.field3349 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field3349 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field3349 > var9) {
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
        if (arg1 != -18) {
            method1476((byte) 40, (String) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(B)V", line = 92)
    public static void method1474(byte arg0) {
        if (arg0 < 39) {
            field3348 = null;
        }
        field3348 = null;
        field3350 = null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BILeh;)V", line = 104)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 > 44) {
            ++field3353;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field3349 = arg2.method2001((byte) -83);
                    }
                } else {
                    this.field3352 = arg2.method2034(255);
                }
            } else {
                this.field3356 = arg2.method2034(255);
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V", line = 172)
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 153)
    public static final int method1475(String arg0, int arg1) {
        ++field3347;
        for (int var2 = arg1; var2 < class677.field9571.length; ++var2) {
            if (class677.field9571[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BLjava/lang/String;)I", line = 175)
    public static final int method1476(byte arg0, String arg1) {
        ++field3354;
        if (arg0 >= -67) {
            return -117;
        } else {
            int var2 = arg1.length();
            int var3 = 0;
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                char var5 = arg1.charAt(var4);
                if (var5 > 127) {
                    if (var5 > 2047) {
                        var3 += 3;
                    } else {
                        var3 += 2;
                    }
                } else {
                    ++var3;
                }
            }
            return var3;
        }
    }
}

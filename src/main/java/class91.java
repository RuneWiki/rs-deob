import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class91 extends class5 {

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    private int field1273 = 1;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    private int field1272 = 204;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    private int field1279 = 1;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field1280 = 0;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field1281 = -1;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Lla;")
    public static class413 field1275;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V", line = 7)
    public static final void method528(byte arg0) {
        ++field1282;
        class479 var1 = null;
        if (arg0 >= -50) {
            method529(69, -108);
        }
        try {
            class264 var2 = class590.field8289.method3641("2", (byte) -28, true);
            while (~var2.field3358 == -1) {
                class419.method2233(-28448, 1L);
            }
            if (~var2.field3358 == -2) {
                var1 = (class479) var2.field3356;
                byte[] var3 = new byte[(int) var1.method2604(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2607(var4, var3, var3.length + -var4, 3);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class686.method3855((byte) -126, new class630(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2603((byte) -127);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 182)
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I", line = 59)
    public final int[] method39(int arg0, int arg1) {
        ++field1276;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -122 / ((arg0 - 81) / 36);
        if (super.field126.field8392) {
            for (int var5 = 0; ~class657.field9287 < ~var5; ++var5) {
                int var6 = class269.field3405[var5];
                int var7 = class272.field3439[arg1];
                int var8 = this.field1273 * var6 >> 12;
                int var9 = this.field1279 * var7 >> 12;
                int var10 = var6 % (4096 / this.field1273) * this.field1273;
                int var11 = var7 % (4096 / this.field1279) * this.field1279;
                if (var11 < this.field1272) {
                    for (var8 -= var9; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var5] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field1272) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                if (this.field1272 > var10) {
                    int var12;
                    for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                var3[var5] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Z", line = 145)
    public static final boolean method529(int arg0, int arg1) {
        if (arg1 < 82) {
            method529(-87, -28);
        }
        ++field1277;
        return ~arg0 == -8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!k", name = "i", descriptor = "(I)V", line = 162)
    public static void method530(int arg0) {
        field1275 = null;
        int var1 = 108 / ((67 - arg0) / 46);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILes;I)V", line = 188)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 == 1) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field1272 = arg1.method3470(13111);
                    }
                } else {
                    this.field1279 = arg1.method3501(arg0 ^ -9267);
                }
            } else {
                this.field1273 = arg1.method3501(-9268);
            }
            ++field1274;
        }
    }
}

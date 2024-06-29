import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class439 extends class96 {

    @OriginalMember(owner = "client!at", name = "S", descriptor = "I")
    private int field6119 = 204;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "I")
    private int field6111 = 1;

    @OriginalMember(owner = "client!at", name = "T", descriptor = "I")
    private int field6120 = 1;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "I")
    public static int field6112 = 0;

    @OriginalMember(owner = "client!at", name = "O", descriptor = "Lpi;")
    public static class340 field6115 = new class340(87, 14);

    @OriginalMember(owner = "client!at", name = "N", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!at", name = "P", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!at", name = "R", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "Les;")
    public static class472 field6113;

    @OriginalMember(owner = "client!at", name = "Q", descriptor = "Lrf;")
    public static class83 field6117;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(III)V")
    public static final void method2595(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field7485 != null) {
                var3.field7485 = null;
            }
            if (var3.field7497 != null) {
                var3.field7497 = null;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V")
    public static void method2596(boolean arg0) {
        field6115 = null;
        field6113 = null;
        field6117 = null;
        if (arg0) {
            field6117 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(B)I")
    public static final int method2597(byte arg0) {
        ++field6116;
        class129 var1 = class512.field7538;
        boolean var2 = false;
        if (~class520.field7690 != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class129.method839((class441) null, var3, (class79) null, 0, 0, (byte) -96);
        }
        long var4 = class173.method1134(true);
        int var6 = 0;
        int var7 = 45 % ((arg0 - -88) / 36);
        while (var6 < 10000) {
            var1.method837(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
            ++var6;
        }
        int var8 = (int) (class173.method1134(true) - var4);
        var1.method866(100, -5152, 0, 100, 0, -16777216);
        if (var2) {
            var1.method878((byte) -122);
        }
        return var8;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 != -1) {
            method2596(true);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field6119 = arg2.method568((byte) 110);
                }
            } else {
                this.field6111 = arg2.method617(2);
            }
        } else {
            this.field6120 = arg2.method617(arg1 ^ -3);
        }
        ++field6118;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
    public class439() {
        super(0, true);
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field6114;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            this.method31(47, 100, (class88) null);
        }
        if (super.field1331.field863) {
            for (int var4 = 0; var4 < class269.field3403; ++var4) {
                int var5 = class510.field7476[var4];
                int var6 = class74.field933[arg0];
                int var7 = this.field6120 * var5 >> 12;
                int var8 = this.field6111 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6120) * this.field6120;
                int var10 = var6 % (4096 / this.field6111) * this.field6111;
                if (var10 < this.field6119) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field6119 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field6119) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
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
}

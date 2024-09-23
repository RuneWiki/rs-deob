import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LOFYMKZK")
public class class39 extends class63 {

    @OriginalMember(owner = "LOFYMKZK", name = "l", descriptor = "I")
    private int field1116 = 6;

    @OriginalMember(owner = "LOFYMKZK", name = "m", descriptor = "Z")
    private boolean field1117 = true;

    @OriginalMember(owner = "LOFYMKZK", name = "s", descriptor = "Z")
    private boolean field1123 = false;

    @OriginalMember(owner = "LOFYMKZK", name = "x", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "LOFYMKZK", name = "y", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "LOFYMKZK", name = "z", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "LOFYMKZK", name = "n", descriptor = "I")
    private int field1118;

    @OriginalMember(owner = "LOFYMKZK", name = "o", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "LOFYMKZK", name = "p", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "LOFYMKZK", name = "q", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "LOFYMKZK", name = "B", descriptor = "LNMXKUYSC;")
    private class42 field1132;

    @OriginalMember(owner = "LOFYMKZK", name = "r", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "LOFYMKZK", name = "w", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "LOFYMKZK", name = "u", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "LOFYMKZK", name = "v", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "LOFYMKZK", name = "A", descriptor = "[I")
    public int[] field1131;

    @OriginalMember(owner = "LOFYMKZK", name = "t", descriptor = "Lclient;")
    public static client field1124;

    @OriginalMember(owner = "LOFYMKZK", name = "<init>", descriptor = "(IIIIIIZIII)V")
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        this.field1128 = arg1;
        this.field1129 = arg2;
        this.field1130 = arg0;
        this.field1118 = arg5;
        this.field1119 = arg4;
        this.field1120 = arg9;
        this.field1121 = arg8;
        if (arg3 != -1) {
            this.field1132 = class42.field1158[arg3];
            this.field1122 = 0;
            this.field1127 = client.field487;
            if (arg6 && this.field1132.field1163 != -1) {
                this.field1122 = (int) (Math.random() * (double) this.field1132.field1159);
                this.field1127 -= (int) (Math.random() * (double) this.field1132.method415(this.field1122, (byte) 6));
            }
        }
        class53 var11 = class53.method464(this.field1128);
        this.field1125 = var11.field1430;
        if (arg7 <= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        this.field1126 = var11.field1446;
        this.field1131 = var11.field1439;
    }

    @OriginalMember(owner = "LOFYMKZK", name = "b", descriptor = "(I)LSCWSBSIM;")
    public final class53 method411(int arg0) {
        int var2 = -1;
        if (arg0 < this.field1116 || arg0 > this.field1116) {
            this.field1117 = !this.field1117;
        }
        if (this.field1125 != -1) {
            class59 var3 = class59.field1545[this.field1125];
            int var4 = var3.field1547;
            int var5 = var3.field1548;
            int var6 = var3.field1549;
            int var7 = client.field433[var6 - var5];
            var2 = field1124.field389[var4] >> var5 & var7;
        } else if (this.field1126 != -1) {
            var2 = field1124.field389[this.field1126];
        }
        return var2 < 0 || var2 >= this.field1131.length || this.field1131[var2] == -1 ? null : class53.method464(this.field1131[var2]);
    }

    @OriginalMember(owner = "LOFYMKZK", name = "a", descriptor = "(I)LKPUOCBCE;")
    public final class35 method11(int arg0) {
        int var2 = -1;
        if (this.field1132 != null) {
            int var3 = client.field487 - this.field1127;
            if (var3 > 100 && this.field1132.field1163 > 0) {
                var3 = 100;
            }
            label50: {
                do {
                    do {
                        if (var3 <= this.field1132.method415(this.field1122, (byte) 6)) {
                            break label50;
                        }
                        var3 -= this.field1132.method415(this.field1122, (byte) 6);
                        this.field1122++;
                    } while (this.field1122 < this.field1132.field1159);
                    this.field1122 -= this.field1132.field1163;
                } while (this.field1122 >= 0 && this.field1122 < this.field1132.field1159);
                this.field1132 = null;
            }
            this.field1127 = client.field487 - var3;
            if (this.field1132 != null) {
                var2 = this.field1132.field1160[this.field1122];
            }
        }
        if (arg0 != 8) {
            this.field1123 = !this.field1123;
        }
        class53 var4;
        if (this.field1131 == null) {
            var4 = class53.method464(this.field1128);
        } else {
            var4 = this.method411(6);
        }
        return var4 == null ? null : var4.method470(this.field1129, this.field1130, this.field1118, this.field1119, this.field1120, this.field1121, var2);
    }
}

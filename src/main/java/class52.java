import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QBCJVLJJ")
public class class52 extends class20 {

    @OriginalMember(owner = "QBCJVLJJ", name = "l", descriptor = "B")
    private byte field1118 = 1;

    @OriginalMember(owner = "QBCJVLJJ", name = "m", descriptor = "I")
    private int field1119 = 6;

    @OriginalMember(owner = "QBCJVLJJ", name = "t", descriptor = "I")
    private int field1126 = -374;

    @OriginalMember(owner = "QBCJVLJJ", name = "u", descriptor = "Z")
    public boolean field1127 = false;

    @OriginalMember(owner = "QBCJVLJJ", name = "v", descriptor = "Z")
    private boolean field1128 = false;

    @OriginalMember(owner = "QBCJVLJJ", name = "y", descriptor = "I")
    private int field1131 = 4;

    @OriginalMember(owner = "QBCJVLJJ", name = "n", descriptor = "LUAVNMKVJ;")
    private class64 field1120;

    @OriginalMember(owner = "QBCJVLJJ", name = "p", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "QBCJVLJJ", name = "q", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "QBCJVLJJ", name = "r", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "QBCJVLJJ", name = "s", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "QBCJVLJJ", name = "o", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "QBCJVLJJ", name = "w", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "QBCJVLJJ", name = "x", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "QBCJVLJJ", name = "a", descriptor = "(I)LRTQSBWRH;")
    public final class59 method199(int arg0) {
        class59 var2 = this.field1120.method502();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1120.field1561.field955[this.field1129];
        class59 var4 = new class59(true, -28456, class18.method229(var3, 8), var2, false);
        if (!this.field1127) {
            var4.method461(this.field1126);
            var4.method462(var3, this.field1118);
            var4.field1336 = null;
            var4.field1335 = null;
        }
        if (this.field1120.field1564 != 128 || this.field1120.field1565 != 128) {
            var4.method470(this.field1120.field1565, this.field1120.field1564, this.field1120.field1564, true);
        }
        if (this.field1120.field1566 != 0) {
            if (this.field1120.field1566 == 90) {
                var4.method465((byte) 8);
            }
            if (this.field1120.field1566 == 180) {
                var4.method465((byte) 8);
                var4.method465((byte) 8);
            }
            if (this.field1120.field1566 == 270) {
                var4.method465((byte) 8);
                var4.method465((byte) 8);
                var4.method465((byte) 8);
            }
        }
        var4.method471(this.field1120.field1567 + 64, this.field1120.field1568 + 850, -30, -50, -30, true);
        while (arg0 >= 0) {
            this.field1128 = !this.field1128;
        }
        return var4;
    }

    @OriginalMember(owner = "QBCJVLJJ", name = "a", descriptor = "(II)V")
    public final void method412(int arg0, int arg1) {
        this.field1130 += arg1;
        if (this.field1131 != arg0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field1130 <= this.field1120.field1561.method361(this.field1119, this.field1129)) {
                        return;
                    }
                    this.field1130 -= this.field1120.field1561.method361(this.field1119, this.field1129) + 1;
                    this.field1129++;
                } while (this.field1129 < this.field1120.field1561.field954);
            } while (this.field1129 >= 0 && this.field1129 < this.field1120.field1561.field954);
            this.field1129 = 0;
            this.field1127 = true;
        }
    }

    @OriginalMember(owner = "QBCJVLJJ", name = "<init>", descriptor = "(IIIIBIII)V")
    public class52(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        this.field1120 = class64.field1557[arg5];
        this.field1122 = arg7;
        this.field1123 = arg3;
        this.field1124 = arg0;
        if (arg4 != -112) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field1125 = arg2;
        this.field1121 = arg1 + arg6;
        this.field1127 = false;
    }
}

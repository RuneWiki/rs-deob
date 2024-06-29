import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QEZQDRNH")
public class class41 extends class12 {

    @OriginalMember(owner = "client!QEZQDRNH", name = "n", descriptor = "Z")
    public boolean field1144 = false;

    @OriginalMember(owner = "client!QEZQDRNH", name = "o", descriptor = "B")
    private byte field1145 = 0;

    @OriginalMember(owner = "client!QEZQDRNH", name = "q", descriptor = "Z")
    private boolean field1147 = false;

    @OriginalMember(owner = "client!QEZQDRNH", name = "p", descriptor = "LSDNQJNMP;")
    private class47 field1146;

    @OriginalMember(owner = "client!QEZQDRNH", name = "t", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!QEZQDRNH", name = "u", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!QEZQDRNH", name = "v", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!QEZQDRNH", name = "w", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!QEZQDRNH", name = "x", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!QEZQDRNH", name = "r", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!QEZQDRNH", name = "s", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!QEZQDRNH", name = "<init>", descriptor = "(IIIIIIII)V")
    public class41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 0) {
            throw new NullPointerException();
        }
        this.field1146 = class47.field1276[arg1];
        this.field1150 = arg0;
        this.field1151 = arg2;
        this.field1152 = arg4;
        this.field1153 = arg3;
        this.field1154 = arg5 + arg6;
        this.field1144 = false;
    }

    @OriginalMember(owner = "client!QEZQDRNH", name = "a", descriptor = "(I)LIEHKDFMR;")
    public final class18 method24(int arg0) {
        if (arg0 != 0) {
            this.field1147 = !this.field1147;
        }
        class18 var2 = this.field1146.method396();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1146.field1280.field1446[this.field1148];
        class18 var4 = new class18(false, (byte) 1, class33.method337(this.field1145, var3), var2, true);
        if (!this.field1144) {
            var4.method274(false);
            var4.method275((byte) 9, var3);
            var4.field798 = null;
            var4.field797 = null;
        }
        if (this.field1146.field1283 != 128 || this.field1146.field1284 != 128) {
            var4.method283(this.field1146.field1283, this.field1146.field1284, 42667, this.field1146.field1283);
        }
        if (this.field1146.field1285 != 0) {
            if (this.field1146.field1285 == 90) {
                var4.method278(297);
            }
            if (this.field1146.field1285 == 180) {
                var4.method278(297);
                var4.method278(297);
            }
            if (this.field1146.field1285 == 270) {
                var4.method278(297);
                var4.method278(297);
                var4.method278(297);
            }
        }
        var4.method284(this.field1146.field1286 + 64, this.field1146.field1287 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!QEZQDRNH", name = "a", descriptor = "(IB)V")
    public final void method367(int arg0, byte arg1) {
        if (arg1 != -7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1149 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1149 <= this.field1146.field1280.method459(this.field1148, false)) {
                        return;
                    }
                    this.field1149 -= this.field1146.field1280.method459(this.field1148, false) + 1;
                    this.field1148++;
                } while (this.field1148 < this.field1146.field1280.field1445);
            } while (this.field1148 >= 0 && this.field1148 < this.field1146.field1280.field1445);
            this.field1148 = 0;
            this.field1144 = true;
        }
    }
}

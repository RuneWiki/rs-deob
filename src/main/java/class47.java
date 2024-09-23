import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QRKWRHKJ")
public class class47 extends class28 {

    @OriginalMember(owner = "QRKWRHKJ", name = "o", descriptor = "Z")
    private boolean field1262 = false;

    @OriginalMember(owner = "QRKWRHKJ", name = "w", descriptor = "Z")
    public boolean field1270 = false;

    @OriginalMember(owner = "QRKWRHKJ", name = "x", descriptor = "I")
    private int field1271 = 101;

    @OriginalMember(owner = "QRKWRHKJ", name = "z", descriptor = "Z")
    private boolean field1273 = true;

    @OriginalMember(owner = "QRKWRHKJ", name = "y", descriptor = "LSNGXEJOJ;")
    private class55 field1272;

    @OriginalMember(owner = "QRKWRHKJ", name = "p", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "QRKWRHKJ", name = "q", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "QRKWRHKJ", name = "r", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "QRKWRHKJ", name = "s", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "QRKWRHKJ", name = "n", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "QRKWRHKJ", name = "t", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "QRKWRHKJ", name = "u", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "QRKWRHKJ", name = "v", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "QRKWRHKJ", name = "A", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "QRKWRHKJ", name = "a", descriptor = "(I)LNJPATAFL;")
    public final class35 method206(int arg0) {
        class35 var2 = this.field1272.method478();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1272.field1426.field1455[this.field1267];
        class35 var4 = new class35(class57.method491(var3, this.field1269), false, true, (byte) 45, var2);
        if (arg0 != 9) {
            this.field1262 = !this.field1262;
        }
        if (!this.field1270) {
            var4.method341(9566);
            var4.method342(true, var3);
            var4.field1025 = null;
            var4.field1024 = null;
        }
        if (this.field1272.field1429 != 128 || this.field1272.field1430 != 128) {
            var4.method350(this.field1272.field1429, true, this.field1272.field1429, this.field1272.field1430);
        }
        if (this.field1272.field1431 != 0) {
            if (this.field1272.field1431 == 90) {
                var4.method345(this.field1274);
            }
            if (this.field1272.field1431 == 180) {
                var4.method345(this.field1274);
                var4.method345(this.field1274);
            }
            if (this.field1272.field1431 == 270) {
                var4.method345(this.field1274);
                var4.method345(this.field1274);
                var4.method345(this.field1274);
            }
        }
        var4.method351(this.field1272.field1432 + 64, this.field1272.field1433 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "QRKWRHKJ", name = "a", descriptor = "(IZ)V")
    public final void method432(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1273 = !this.field1273;
        }
        this.field1268 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1268 <= this.field1272.field1426.method493(this.field1267, (byte) 2)) {
                        return;
                    }
                    this.field1268 -= this.field1272.field1426.method493(this.field1267, (byte) 2) + 1;
                    this.field1267++;
                } while (this.field1267 < this.field1272.field1426.field1454);
            } while (this.field1267 >= 0 && this.field1267 < this.field1272.field1426.field1454);
            this.field1267 = 0;
            this.field1270 = true;
        }
    }

    @OriginalMember(owner = "QRKWRHKJ", name = "<init>", descriptor = "(IIBIIIII)V")
    public class47(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 121) {
            this.field1271 = -79;
        }
        this.field1272 = class55.field1422[arg3];
        this.field1263 = arg6;
        this.field1264 = arg5;
        this.field1265 = arg7;
        this.field1266 = arg0;
        this.field1261 = arg1 + arg4;
        this.field1270 = false;
    }
}

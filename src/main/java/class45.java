import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ROWJKVEC")
public class class45 extends class22 {

    @OriginalMember(owner = "ROWJKVEC", name = "o", descriptor = "B")
    private byte field1378 = 1;

    @OriginalMember(owner = "ROWJKVEC", name = "r", descriptor = "Z")
    public boolean field1381 = false;

    @OriginalMember(owner = "ROWJKVEC", name = "w", descriptor = "I")
    private int field1386 = -13956;

    @OriginalMember(owner = "ROWJKVEC", name = "x", descriptor = "LXWNROHZR;")
    private class64 field1387;

    @OriginalMember(owner = "ROWJKVEC", name = "s", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "ROWJKVEC", name = "t", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "ROWJKVEC", name = "u", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "ROWJKVEC", name = "v", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "ROWJKVEC", name = "n", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "ROWJKVEC", name = "p", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "ROWJKVEC", name = "q", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "ROWJKVEC", name = "a", descriptor = "(II)V")
    public final void method445(int arg0, int arg1) {
        this.field1380 += arg1;
        if (this.field1386 != arg0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field1380 <= this.field1387.field1669.method562((byte) 5, this.field1379)) {
                        return;
                    }
                    this.field1380 -= this.field1387.field1669.method562((byte) 5, this.field1379) + 1;
                    this.field1379++;
                } while (this.field1379 < this.field1387.field1669.field1571);
            } while (this.field1379 >= 0 && this.field1379 < this.field1387.field1669.field1571);
            this.field1379 = 0;
            this.field1381 = true;
        }
    }

    @OriginalMember(owner = "ROWJKVEC", name = "<init>", descriptor = "(IIIIIZII)V")
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            throw new NullPointerException();
        }
        this.field1387 = class64.field1665[arg3];
        this.field1382 = arg4;
        this.field1383 = arg7;
        this.field1384 = arg1;
        this.field1385 = arg2;
        this.field1377 = arg0 + arg6;
        this.field1381 = false;
    }

    @OriginalMember(owner = "ROWJKVEC", name = "a", descriptor = "(I)LCADBNSXE;")
    public final class3 method40(int arg0) {
        class3 var2 = this.field1387.method589();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1387.field1669.field1572[this.field1379];
        class3 var4 = new class3(false, class8.method215(false, var3), var2, this.field1378, true);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        if (!this.field1381) {
            var4.method18(false);
            var4.method19(var3, (byte) -62);
            var4.field58 = null;
            var4.field57 = null;
        }
        if (this.field1387.field1672 != 128 || this.field1387.field1673 != 128) {
            var4.method27(this.field1387.field1672, 0, this.field1387.field1673, this.field1387.field1672);
        }
        if (this.field1387.field1674 != 0) {
            if (this.field1387.field1674 == 90) {
                var4.method22((byte) -62);
            }
            if (this.field1387.field1674 == 180) {
                var4.method22((byte) -62);
                var4.method22((byte) -62);
            }
            if (this.field1387.field1674 == 270) {
                var4.method22((byte) -62);
                var4.method22((byte) -62);
                var4.method22((byte) -62);
            }
        }
        var4.method28(this.field1387.field1675 + 64, this.field1387.field1676 + 850, -30, -50, -30, true);
        return var4;
    }
}

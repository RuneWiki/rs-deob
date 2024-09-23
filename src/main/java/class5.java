import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DAUNRADK")
public class class5 extends class21 {

    @OriginalMember(owner = "DAUNRADK", name = "s", descriptor = "Z")
    public boolean field537 = false;

    @OriginalMember(owner = "DAUNRADK", name = "v", descriptor = "Z")
    private boolean field540 = false;

    @OriginalMember(owner = "DAUNRADK", name = "m", descriptor = "LUIVLSYQW;")
    private class57 field531;

    @OriginalMember(owner = "DAUNRADK", name = "o", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "DAUNRADK", name = "p", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "DAUNRADK", name = "q", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "DAUNRADK", name = "r", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "DAUNRADK", name = "n", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "DAUNRADK", name = "t", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "DAUNRADK", name = "u", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "DAUNRADK", name = "w", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "DAUNRADK", name = "<init>", descriptor = "(IIIIIBII)V")
    public class5(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        this.field531 = class57.field1384[arg1];
        this.field533 = arg7;
        this.field534 = arg6;
        this.field535 = arg4;
        this.field536 = arg2;
        if (arg5 == 7) {
            boolean var9 = false;
        } else {
            this.field540 = !this.field540;
        }
        this.field532 = arg0 + arg3;
        this.field537 = false;
    }

    @OriginalMember(owner = "DAUNRADK", name = "a", descriptor = "(I)LHEQROJXW;")
    public final class27 method1(int arg0) {
        class27 var2 = this.field531.method539();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field531.field1388.field1610[this.field538];
        class27 var4 = new class27(-167, false, true, class56.method536(var3, 9643), var2);
        if (!this.field537) {
            var4.method329(true);
            var4.method330(var3, 0);
            var4.field882 = null;
            var4.field881 = null;
        }
        if (this.field531.field1391 != 128 || this.field531.field1392 != 128) {
            var4.method338(this.field531.field1392, 24701, this.field531.field1391, this.field531.field1391);
        }
        if (this.field531.field1393 != 0) {
            if (this.field531.field1393 == 90) {
                var4.method333(27080);
            }
            if (this.field531.field1393 == 180) {
                var4.method333(27080);
                var4.method333(27080);
            }
            if (this.field531.field1393 == 270) {
                var4.method333(27080);
                var4.method333(27080);
                var4.method333(27080);
            }
        }
        var4.method339(this.field531.field1394 + 64, this.field531.field1395 + 850, -30, -50, -30, true);
        if (arg0 < 8 || arg0 > 8) {
            this.field541 = 175;
        }
        return var4;
    }

    @OriginalMember(owner = "DAUNRADK", name = "a", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        int var3 = 5 / arg1;
        this.field539 += arg0;
        while (true) {
            do {
                do {
                    if (this.field539 <= this.field531.field1388.method566(this.field538, (byte) 2)) {
                        return;
                    }
                    this.field539 -= this.field531.field1388.method566(this.field538, (byte) 2) + 1;
                    this.field538++;
                } while (this.field538 < this.field531.field1388.field1609);
            } while (this.field538 >= 0 && this.field538 < this.field531.field1388.field1609);
            this.field538 = 0;
            this.field537 = true;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WHUAOHZM")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "client!WHUAOHZM", name = "q", descriptor = "Z")
    private boolean field1526 = true;

    @OriginalMember(owner = "client!WHUAOHZM", name = "r", descriptor = "Z")
    public boolean field1527 = false;

    @OriginalMember(owner = "client!WHUAOHZM", name = "u", descriptor = "LMNZYLKNY;")
    private SpotAnimType field1530;

    @OriginalMember(owner = "client!WHUAOHZM", name = "m", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!WHUAOHZM", name = "n", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!WHUAOHZM", name = "o", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!WHUAOHZM", name = "p", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!WHUAOHZM", name = "v", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!WHUAOHZM", name = "s", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!WHUAOHZM", name = "t", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!WHUAOHZM", name = "a", descriptor = "(BI)V")
    public final void method486(byte arg0, int arg1) {
        this.field1529 += arg1;
        if (arg0 != 1) {
            return;
        }
        boolean var3 = false;
        while (true) {
            do {
                do {
                    if (this.field1529 <= this.field1530.field1301.method214(0, this.field1528)) {
                        return;
                    }
                    this.field1529 -= this.field1530.field1301.method214(0, this.field1528);
                    this.field1528++;
                } while (this.field1528 < this.field1530.field1301.field776);
            } while (this.field1528 >= 0 && this.field1528 < this.field1530.field1301.field776);
            this.field1528 = 0;
            this.field1527 = true;
        }
    }

    @OriginalMember(owner = "client!WHUAOHZM", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1530 = SpotAnimType.field1297[arg4];
        this.field1522 = arg1;
        this.field1523 = arg0;
        this.field1524 = arg6;
        if (arg7 != 10709) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field1525 = arg2;
        this.field1531 = arg3 + arg5;
        this.field1527 = false;
    }

    @OriginalMember(owner = "client!WHUAOHZM", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model method239(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        Model var2 = this.field1530.method439();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1530.field1301.field777[this.field1528];
        Model var4 = new Model(false, false, true, var2, AnimFrame.method265(this.field1526, var3));
        if (!this.field1527) {
            var4.method366(7);
            var4.method367(var3, (byte) 6);
            var4.field1226 = null;
            var4.field1225 = null;
        }
        if (this.field1530.field1304 != 128 || this.field1530.field1305 != 128) {
            var4.method375(this.field1530.field1305, this.field1530.field1304, 9, this.field1530.field1304);
        }
        if (this.field1530.field1306 != 0) {
            if (this.field1530.field1306 == 90) {
                var4.method370(true);
            }
            if (this.field1530.field1306 == 180) {
                var4.method370(true);
                var4.method370(true);
            }
            if (this.field1530.field1306 == 270) {
                var4.method370(true);
                var4.method370(true);
                var4.method370(true);
            }
        }
        var4.method376(this.field1530.field1307 + 64, this.field1530.field1308 + 850, -30, -50, -30, true);
        return var4;
    }
}

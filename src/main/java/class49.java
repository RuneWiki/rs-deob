import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RUSNMPGH")
public class class49 extends class44 {

    @OriginalMember(owner = "client!RUSNMPGH", name = "o", descriptor = "Z")
    public boolean field1457 = false;

    @OriginalMember(owner = "client!RUSNMPGH", name = "p", descriptor = "I")
    private int field1458 = 914;

    @OriginalMember(owner = "client!RUSNMPGH", name = "q", descriptor = "Z")
    private boolean field1459 = false;

    @OriginalMember(owner = "client!RUSNMPGH", name = "z", descriptor = "I")
    private int field1468 = 8;

    @OriginalMember(owner = "client!RUSNMPGH", name = "r", descriptor = "LMHWTJCHJ;")
    private class37 field1460;

    @OriginalMember(owner = "client!RUSNMPGH", name = "s", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!RUSNMPGH", name = "t", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!RUSNMPGH", name = "u", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!RUSNMPGH", name = "v", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!RUSNMPGH", name = "n", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!RUSNMPGH", name = "w", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!RUSNMPGH", name = "x", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!RUSNMPGH", name = "y", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!RUSNMPGH", name = "a", descriptor = "(II)V")
    public final void method503(int arg0, int arg1) {
        this.field1467 += arg0;
        int var3 = 88 / arg1;
        while (true) {
            do {
                do {
                    if (this.field1467 <= this.field1460.field995.method342(this.field1466, this.field1468)) {
                        return;
                    }
                    this.field1467 -= this.field1460.field995.method342(this.field1466, this.field1468);
                    this.field1466++;
                } while (this.field1466 < this.field1460.field995.field888);
            } while (this.field1466 >= 0 && this.field1466 < this.field1460.field995.field888);
            this.field1466 = 0;
            this.field1457 = true;
        }
    }

    @OriginalMember(owner = "client!RUSNMPGH", name = "<init>", descriptor = "(IIIIIIII)V")
    public class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1460 = class37.field991[arg7];
        this.field1461 = arg5;
        this.field1462 = arg1;
        this.field1463 = arg3;
        this.field1464 = arg4;
        this.field1456 = arg0 + arg2;
        if (arg6 >= 0) {
            throw new NullPointerException();
        }
        this.field1457 = false;
    }

    @OriginalMember(owner = "client!RUSNMPGH", name = "a", descriptor = "(B)LRMLAXPMV;")
    public final class47 method344(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field1459 = !this.field1459;
        }
        class47 var3 = this.field1460.method367();
        if (var3 == null) {
            return null;
        }
        int var4 = this.field1460.field995.field889[this.field1466];
        class47 var5 = new class47(var3, class67.method586(true, var4), true, false, true);
        if (!this.field1457) {
            var5.method473(8);
            var5.method474(-770, var4);
            var5.field1368 = null;
            var5.field1367 = null;
        }
        if (this.field1460.field998 != 128 || this.field1460.field999 != 128) {
            var5.method482(this.field1460.field999, this.field1460.field998, this.field1460.field998, this.field1465);
        }
        if (this.field1460.field1000 != 0) {
            if (this.field1460.field1000 == 90) {
                var5.method477(861);
            }
            if (this.field1460.field1000 == 180) {
                var5.method477(861);
                var5.method477(861);
            }
            if (this.field1460.field1000 == 270) {
                var5.method477(861);
                var5.method477(861);
                var5.method477(861);
            }
        }
        var5.method483(this.field1460.field1001 + 64, this.field1460.field1002 + 850, -30, -50, -30, true);
        return var5;
    }
}

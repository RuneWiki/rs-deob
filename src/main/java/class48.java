import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PIYQORZV")
public class class48 extends class18 {

    @OriginalMember(owner = "PIYQORZV", name = "r", descriptor = "I")
    private int field1321 = 41444;

    @OriginalMember(owner = "PIYQORZV", name = "s", descriptor = "Z")
    public boolean field1322 = false;

    @OriginalMember(owner = "PIYQORZV", name = "u", descriptor = "LYTBPTACV;")
    private class70 field1324;

    @OriginalMember(owner = "PIYQORZV", name = "l", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "PIYQORZV", name = "m", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "PIYQORZV", name = "n", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "PIYQORZV", name = "o", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "PIYQORZV", name = "t", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "PIYQORZV", name = "p", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "PIYQORZV", name = "q", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "PIYQORZV", name = "a", descriptor = "(II)V")
    public final void method420(int arg0, int arg1) {
        this.field1320 += arg1;
        if (arg0 != -27482) {
            this.field1321 = 99;
        }
        while (true) {
            do {
                do {
                    if (this.field1320 <= this.field1324.field1698.method275(210, this.field1319)) {
                        return;
                    }
                    this.field1320 -= this.field1324.field1698.method275(210, this.field1319) + 1;
                    this.field1319++;
                } while (this.field1319 < this.field1324.field1698.field950);
            } while (this.field1319 >= 0 && this.field1319 < this.field1324.field1698.field950);
            this.field1319 = 0;
            this.field1322 = true;
        }
    }

    @OriginalMember(owner = "PIYQORZV", name = "a", descriptor = "(B)LDHUPIIUL;")
    public final class10 method159(byte arg0) {
        class10 var2 = this.field1324.method582();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1324.field1698.field951[this.field1319];
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        class10 var5 = new class10(var2, false, class5.method16(var3, true), 878, true);
        if (!this.field1322) {
            var5.method198(-390);
            var5.method199(var3, 0);
            var5.field649 = null;
            var5.field648 = null;
        }
        if (this.field1324.field1701 != 128 || this.field1324.field1702 != 128) {
            var5.method207(-592, this.field1324.field1701, this.field1324.field1702, this.field1324.field1701);
        }
        if (this.field1324.field1703 != 0) {
            if (this.field1324.field1703 == 90) {
                var5.method202(true);
            }
            if (this.field1324.field1703 == 180) {
                var5.method202(true);
                var5.method202(true);
            }
            if (this.field1324.field1703 == 270) {
                var5.method202(true);
                var5.method202(true);
                var5.method202(true);
            }
        }
        var5.method208(this.field1324.field1704 + 64, this.field1324.field1705 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "PIYQORZV", name = "<init>", descriptor = "(IIIIIIZI)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        this.field1324 = class70.field1694[arg0];
        this.field1315 = arg3;
        this.field1316 = arg4;
        if (!arg6) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field1317 = arg7;
        this.field1318 = arg1;
        this.field1323 = arg2 + arg5;
        this.field1322 = false;
    }
}

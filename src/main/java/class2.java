import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ADZOUCLA")
public class class2 extends class53 {

    @OriginalMember(owner = "client!ADZOUCLA", name = "k", descriptor = "I")
    private int field18 = 7;

    @OriginalMember(owner = "client!ADZOUCLA", name = "p", descriptor = "Z")
    public boolean field23 = false;

    @OriginalMember(owner = "client!ADZOUCLA", name = "q", descriptor = "LBZLQCUPI;")
    private class4 field24;

    @OriginalMember(owner = "client!ADZOUCLA", name = "l", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!ADZOUCLA", name = "m", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!ADZOUCLA", name = "n", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!ADZOUCLA", name = "o", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!ADZOUCLA", name = "t", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!ADZOUCLA", name = "r", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!ADZOUCLA", name = "s", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!ADZOUCLA", name = "a", descriptor = "(IB)V")
    public final void method1(int arg0, byte arg1) {
        if (arg1 != 102) {
            return;
        }
        this.field26 += arg0;
        while (true) {
            do {
                do {
                    if (this.field26 <= this.field24.field47.method252(this.field25, -26977)) {
                        return;
                    }
                    this.field26 -= this.field24.field47.method252(this.field25, -26977) + 1;
                    this.field25++;
                } while (this.field25 < this.field24.field47.field838);
            } while (this.field25 >= 0 && this.field25 < this.field24.field47.field838);
            this.field25 = 0;
            this.field23 = true;
        }
    }

    @OriginalMember(owner = "client!ADZOUCLA", name = "<init>", descriptor = "(IIIIIIII)V")
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field24 = class4.field43[arg6];
        this.field19 = arg4;
        this.field20 = arg1;
        if (this.field18 != arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field21 = arg3;
        this.field22 = arg5;
        this.field27 = arg2 + arg7;
        this.field23 = false;
    }

    @OriginalMember(owner = "client!ADZOUCLA", name = "a", descriptor = "(B)LCYPZUKMB;")
    public final class8 method2(byte arg0) {
        class8 var2 = this.field24.method9();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field24.field47.field839[this.field25];
        class8 var4 = new class8(class46.method469(var3, true), var2, false, false, true);
        if (!this.field23) {
            var4.method203(166);
            var4.method204(257, var3);
            var4.field651 = null;
            var4.field650 = null;
        }
        if (this.field24.field50 != 128 || this.field24.field51 != 128) {
            var4.method212(this.field24.field50, -39776, this.field24.field51, this.field24.field50);
        }
        if (this.field24.field52 != 0) {
            if (this.field24.field52 == 90) {
                var4.method207((byte) 93);
            }
            if (this.field24.field52 == 180) {
                var4.method207((byte) 93);
                var4.method207((byte) 93);
            }
            if (this.field24.field52 == 270) {
                var4.method207((byte) 93);
                var4.method207((byte) 93);
                var4.method207((byte) 93);
            }
        }
        var4.method213(this.field24.field53 + 64, this.field24.field54 + 850, -30, -50, -30, true);
        if (arg0 != -99) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var4;
    }
}

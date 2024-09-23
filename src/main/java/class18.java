import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HSFTIQUW")
public class class18 extends class34 {

    @OriginalMember(owner = "HSFTIQUW", name = "o", descriptor = "I")
    private int field735 = 3;

    @OriginalMember(owner = "HSFTIQUW", name = "t", descriptor = "I")
    private int field740 = -911;

    @OriginalMember(owner = "HSFTIQUW", name = "v", descriptor = "Z")
    private boolean field742 = false;

    @OriginalMember(owner = "HSFTIQUW", name = "w", descriptor = "Z")
    public boolean field743 = false;

    @OriginalMember(owner = "HSFTIQUW", name = "u", descriptor = "LPMDEXOWJ;")
    private class43 field741;

    @OriginalMember(owner = "HSFTIQUW", name = "p", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "HSFTIQUW", name = "q", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "HSFTIQUW", name = "r", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "HSFTIQUW", name = "s", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "HSFTIQUW", name = "l", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "HSFTIQUW", name = "m", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "HSFTIQUW", name = "n", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "HSFTIQUW", name = "a", descriptor = "(Z)LWEVRTBOZ;")
    public final class66 method225(boolean arg0) {
        class66 var2 = this.field741.method404();
        if (!arg0) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            int var3 = this.field741.field1257.field1282[this.field733];
            class66 var4 = new class66(107, var2, class15.method218(var3, true), false, true);
            if (!this.field743) {
                var4.method532((byte) 2);
                var4.method533(var3, 803);
                var4.field1618 = null;
                var4.field1617 = null;
            }
            if (this.field741.field1260 != 128 || this.field741.field1261 != 128) {
                var4.method541(this.field741.field1260, this.field741.field1260, this.field741.field1261, 49106);
            }
            if (this.field741.field1262 != 0) {
                if (this.field741.field1262 == 90) {
                    var4.method536(644);
                }
                if (this.field741.field1262 == 180) {
                    var4.method536(644);
                    var4.method536(644);
                }
                if (this.field741.field1262 == 270) {
                    var4.method536(644);
                    var4.method536(644);
                    var4.method536(644);
                }
            }
            var4.method542(this.field741.field1263 + 64, this.field741.field1264 + 850, -30, -50, -30, true);
            return var4;
        }
    }

    @OriginalMember(owner = "HSFTIQUW", name = "<init>", descriptor = "(IIIIIIII)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field741 = class43.field1253[arg7];
        this.field736 = arg3;
        this.field737 = arg1;
        if (arg0 >= 0) {
            this.field742 = !this.field742;
        }
        this.field738 = arg6;
        this.field739 = arg5;
        this.field732 = arg2 + arg4;
        this.field743 = false;
    }

    @OriginalMember(owner = "HSFTIQUW", name = "a", descriptor = "(BI)V")
    public final void method226(byte arg0, int arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field734 += arg1;
        while (true) {
            do {
                do {
                    if (this.field734 <= this.field741.field1257.method414(this.field733, this.field735)) {
                        return;
                    }
                    this.field734 -= this.field741.field1257.method414(this.field733, this.field735) + 1;
                    this.field733++;
                } while (this.field733 < this.field741.field1257.field1281);
            } while (this.field733 >= 0 && this.field733 < this.field741.field1257.field1281);
            this.field733 = 0;
            this.field743 = true;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EPOYVBCN")
public class class13 extends class4 {

    @OriginalMember(owner = "EPOYVBCN", name = "p", descriptor = "Z")
    private boolean field671 = true;

    @OriginalMember(owner = "EPOYVBCN", name = "v", descriptor = "Z")
    public boolean field677 = false;

    @OriginalMember(owner = "EPOYVBCN", name = "q", descriptor = "LCIVOPMKV;")
    private class9 field672;

    @OriginalMember(owner = "EPOYVBCN", name = "r", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "EPOYVBCN", name = "s", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "EPOYVBCN", name = "t", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "EPOYVBCN", name = "u", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "EPOYVBCN", name = "w", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "EPOYVBCN", name = "n", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "EPOYVBCN", name = "o", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "EPOYVBCN", name = "<init>", descriptor = "(IIIIIIII)V")
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field672 = class9.field136[arg7];
        this.field673 = arg4;
        this.field674 = arg0;
        this.field675 = arg2;
        this.field676 = arg5;
        this.field678 = arg3 + arg6;
        this.field677 = false;
        if (arg1 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "EPOYVBCN", name = "a", descriptor = "(ZI)V")
    public final void method209(boolean arg0, int arg1) {
        this.field670 += arg1;
        if (!arg0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field670 <= this.field672.field140.method591(0, this.field669)) {
                        return;
                    }
                    this.field670 -= this.field672.field140.method591(0, this.field669) + 1;
                    this.field669++;
                } while (this.field669 < this.field672.field140.field1706);
            } while (this.field669 >= 0 && this.field669 < this.field672.field140.field1706);
            this.field669 = 0;
            this.field677 = true;
        }
    }

    @OriginalMember(owner = "EPOYVBCN", name = "a", descriptor = "(Z)LYABPKWWG;")
    public final class67 method16(boolean arg0) {
        class67 var2 = this.field672.method32();
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 == null) {
            return null;
        }
        int var4 = this.field672.field140.field1707[this.field669];
        class67 var5 = new class67(660, var2, class22.method219(var4, true), true, false);
        if (!this.field677) {
            var5.method555((byte) 45);
            var5.method556(598, var4);
            var5.field1647 = null;
            var5.field1646 = null;
        }
        if (this.field672.field143 != 128 || this.field672.field144 != 128) {
            var5.method564(this.field672.field144, this.field672.field143, (byte) -46, this.field672.field143);
        }
        if (this.field672.field145 != 0) {
            if (this.field672.field145 == 90) {
                var5.method559(0);
            }
            if (this.field672.field145 == 180) {
                var5.method559(0);
                var5.method559(0);
            }
            if (this.field672.field145 == 270) {
                var5.method559(0);
                var5.method559(0);
                var5.method559(0);
            }
        }
        var5.method565(this.field672.field146 + 64, this.field672.field147 + 850, -30, -50, -30, true);
        return var5;
    }
}

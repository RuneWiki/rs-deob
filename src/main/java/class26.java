import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KACHDVNZ")
public class class26 extends class57 {

    @OriginalMember(owner = "KACHDVNZ", name = "v", descriptor = "Z")
    public boolean field932 = false;

    @OriginalMember(owner = "KACHDVNZ", name = "w", descriptor = "I")
    private int field933 = 40410;

    @OriginalMember(owner = "KACHDVNZ", name = "t", descriptor = "LBUIWQSXJ;")
    private class6 field930;

    @OriginalMember(owner = "KACHDVNZ", name = "o", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "KACHDVNZ", name = "p", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "KACHDVNZ", name = "q", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "KACHDVNZ", name = "r", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "KACHDVNZ", name = "u", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "KACHDVNZ", name = "m", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "KACHDVNZ", name = "n", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "KACHDVNZ", name = "a", descriptor = "(II)V")
    public final void method307(int arg0, int arg1) {
        this.field925 += arg1;
        if (arg0 != 2) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field925 <= this.field930.field53.method364(this.field933, this.field924)) {
                        return;
                    }
                    this.field925 -= this.field930.field53.method364(this.field933, this.field924) + 1;
                    this.field924++;
                } while (this.field924 < this.field930.field53.field1015);
            } while (this.field924 >= 0 && this.field924 < this.field930.field53.field1015);
            this.field924 = 0;
            this.field932 = true;
        }
    }

    @OriginalMember(owner = "KACHDVNZ", name = "<init>", descriptor = "(IIIBIIII)V")
    public class26(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field930 = class6.field49[arg0];
        this.field926 = arg5;
        this.field927 = arg2;
        if (arg3 != -9) {
            throw new NullPointerException();
        }
        this.field928 = arg6;
        this.field929 = arg4;
        this.field931 = arg1 + arg7;
        this.field932 = false;
    }

    @OriginalMember(owner = "KACHDVNZ", name = "a", descriptor = "(Z)LPOJFANDE;")
    public final class43 method54(boolean arg0) {
        class43 var2 = this.field930.method62();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field930.field53.field1016[this.field924];
        if (!arg0) {
            throw new NullPointerException();
        }
        class43 var4 = new class43(class21.method287(var3, -13619), true, false, -785, var2);
        if (!this.field932) {
            var4.method467(0);
            var4.method468(var3, 19066);
            var4.field1310 = null;
            var4.field1309 = null;
        }
        if (this.field930.field56 != 128 || this.field930.field57 != 128) {
            var4.method476(this.field930.field57, true, this.field930.field56, this.field930.field56);
        }
        if (this.field930.field58 != 0) {
            if (this.field930.field58 == 90) {
                var4.method471((byte) 3);
            }
            if (this.field930.field58 == 180) {
                var4.method471((byte) 3);
                var4.method471((byte) 3);
            }
            if (this.field930.field58 == 270) {
                var4.method471((byte) 3);
                var4.method471((byte) 3);
                var4.method471((byte) 3);
            }
        }
        var4.method477(this.field930.field59 + 64, this.field930.field60 + 850, -30, -50, -30, true);
        return var4;
    }
}

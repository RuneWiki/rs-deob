import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CANOTCRF")
public class class6 extends class12 {

    @OriginalMember(owner = "CANOTCRF", name = "t", descriptor = "Z")
    public boolean field38 = false;

    @OriginalMember(owner = "CANOTCRF", name = "u", descriptor = "LBRGDZOWQ;")
    private class4 field39;

    @OriginalMember(owner = "CANOTCRF", name = "n", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "CANOTCRF", name = "o", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "CANOTCRF", name = "p", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "CANOTCRF", name = "q", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "CANOTCRF", name = "v", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "CANOTCRF", name = "r", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "CANOTCRF", name = "s", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "CANOTCRF", name = "<init>", descriptor = "(IIIIIIII)V")
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field39 = class4.field15[arg3];
        this.field32 = arg7;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field33 = arg4;
        this.field34 = arg2;
        this.field35 = arg1;
        this.field40 = arg5 + arg6;
        this.field38 = false;
    }

    @OriginalMember(owner = "CANOTCRF", name = "a", descriptor = "(I)LLFTMDGKK;")
    public final class37 method1(int arg0) {
        class37 var2 = this.field39.method11();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field39.field19.field818[this.field36];
        class37 var4 = new class37(class7.method17(var3, false), true, var2, false, false);
        if (!this.field38) {
            var4.method348(false);
            var4.method349(var3, (byte) 89);
            var4.field999 = null;
            var4.field998 = null;
        }
        if (this.field39.field22 != 128 || this.field39.field23 != 128) {
            var4.method357(5, this.field39.field23, this.field39.field22, this.field39.field22);
        }
        if (this.field39.field24 != 0) {
            if (this.field39.field24 == 90) {
                var4.method352(-542);
            }
            if (this.field39.field24 == 180) {
                var4.method352(-542);
                var4.method352(-542);
            }
            if (this.field39.field24 == 270) {
                var4.method352(-542);
                var4.method352(-542);
                var4.method352(-542);
            }
        }
        var4.method358(this.field39.field25 + 64, this.field39.field26 + 850, -30, -50, -30, true);
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var4;
    }

    @OriginalMember(owner = "CANOTCRF", name = "a", descriptor = "(ZI)V")
    public final void method12(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        this.field37 += arg1;
        while (true) {
            do {
                do {
                    if (this.field37 <= this.field39.field19.method322((byte) 5, this.field36)) {
                        return;
                    }
                    this.field37 -= this.field39.field19.method322((byte) 5, this.field36) + 1;
                    this.field36++;
                } while (this.field36 < this.field39.field19.field817);
            } while (this.field36 >= 0 && this.field36 < this.field39.field19.field817);
            this.field36 = 0;
            this.field38 = true;
        }
    }
}

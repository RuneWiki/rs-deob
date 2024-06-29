import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PEKVALKR")
public class class43 extends class21 {

    @OriginalMember(owner = "client!PEKVALKR", name = "t", descriptor = "Z")
    public boolean field1206 = false;

    @OriginalMember(owner = "client!PEKVALKR", name = "n", descriptor = "LRTDMFIDA;")
    private class50 field1200;

    @OriginalMember(owner = "client!PEKVALKR", name = "o", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!PEKVALKR", name = "p", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!PEKVALKR", name = "q", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!PEKVALKR", name = "r", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!PEKVALKR", name = "k", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!PEKVALKR", name = "l", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!PEKVALKR", name = "m", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!PEKVALKR", name = "s", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!PEKVALKR", name = "a", descriptor = "(Z)LIYSWJGDE;")
    public final class19 method2(boolean arg0) {
        class19 var2 = this.field1200.method448();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1200.field1358.field923[this.field1198];
        if (!arg0) {
            throw new NullPointerException();
        }
        class19 var4 = new class19(class45.method406(61, var3), var2, 946, true, false);
        if (!this.field1206) {
            var4.method280(true);
            var4.method281(true, var3);
            var4.field842 = null;
            var4.field841 = null;
        }
        if (this.field1200.field1361 != 128 || this.field1200.field1362 != 128) {
            var4.method289(this.field1200.field1361, 471, this.field1200.field1361, this.field1200.field1362);
        }
        if (this.field1200.field1363 != 0) {
            if (this.field1200.field1363 == 90) {
                var4.method284(-325);
            }
            if (this.field1200.field1363 == 180) {
                var4.method284(-325);
                var4.method284(-325);
            }
            if (this.field1200.field1363 == 270) {
                var4.method284(-325);
                var4.method284(-325);
                var4.method284(-325);
            }
        }
        var4.method290(this.field1200.field1364 + 64, this.field1200.field1365 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!PEKVALKR", name = "<init>", descriptor = "(ZIIIIIII)V")
    public class43(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1200 = class50.field1354[arg3];
        this.field1201 = arg1;
        this.field1202 = arg7;
        this.field1203 = arg4;
        this.field1204 = arg6;
        this.field1197 = arg2 + arg5;
        this.field1206 = false;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!PEKVALKR", name = "a", descriptor = "(IZ)V")
    public final void method393(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1205 = 281;
        }
        this.field1199 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1199 <= this.field1200.field1358.method320(this.field1198, (byte) 0)) {
                        return;
                    }
                    this.field1199 -= this.field1200.field1358.method320(this.field1198, (byte) 0) + 1;
                    this.field1198++;
                } while (this.field1198 < this.field1200.field1358.field922);
            } while (this.field1198 >= 0 && this.field1198 < this.field1200.field1358.field922);
            this.field1198 = 0;
            this.field1206 = true;
        }
    }
}

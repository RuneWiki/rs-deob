import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CSVVQIMY")
public class class11 extends class62 {

    @OriginalMember(owner = "CSVVQIMY", name = "p", descriptor = "Z")
    public boolean field624 = false;

    @OriginalMember(owner = "CSVVQIMY", name = "t", descriptor = "I")
    private int field628 = 717;

    @OriginalMember(owner = "CSVVQIMY", name = "u", descriptor = "LHTWOTIWO;")
    private class23 field629;

    @OriginalMember(owner = "CSVVQIMY", name = "l", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "CSVVQIMY", name = "m", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "CSVVQIMY", name = "n", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "CSVVQIMY", name = "o", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "CSVVQIMY", name = "s", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "CSVVQIMY", name = "q", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "CSVVQIMY", name = "r", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "CSVVQIMY", name = "a", descriptor = "(IB)V")
    public final void method195(int arg0, byte arg1) {
        this.field626 += arg0;
        if (arg1 != -47) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field626 <= this.field629.field870.method215(this.field625, 0)) {
                        return;
                    }
                    this.field626 -= this.field629.field870.method215(this.field625, 0) + 1;
                    this.field625++;
                } while (this.field625 < this.field629.field870.field657);
            } while (this.field625 >= 0 && this.field625 < this.field629.field870.field657);
            this.field625 = 0;
            this.field624 = true;
        }
    }

    @OriginalMember(owner = "CSVVQIMY", name = "<init>", descriptor = "(IIIIIIII)V")
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field629 = class23.field866[arg1];
        this.field620 = arg7;
        this.field621 = arg6;
        this.field622 = arg2;
        this.field623 = arg4;
        this.field627 = arg0 + arg5;
        this.field624 = false;
        if (arg3 != 0) {
            this.field628 = 484;
        }
    }

    @OriginalMember(owner = "CSVVQIMY", name = "a", descriptor = "(I)LPSGMMDJS;")
    public final class45 method196(int arg0) {
        class45 var2 = this.field629.method251();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field629.field870.field658[this.field625];
        class45 var4 = new class45(var2, -42752, class3.method5((byte) 2, var3), true, false);
        if (!this.field624) {
            var4.method417(true);
            var4.method418(0, var3);
            var4.field1182 = null;
            var4.field1181 = null;
        }
        if (this.field629.field873 != 128 || this.field629.field874 != 128) {
            var4.method426(this.field629.field874, this.field629.field873, this.field629.field873, 34836);
        }
        if (this.field629.field875 != 0) {
            if (this.field629.field875 == 90) {
                var4.method421(6);
            }
            if (this.field629.field875 == 180) {
                var4.method421(6);
                var4.method421(6);
            }
            if (this.field629.field875 == 270) {
                var4.method421(6);
                var4.method421(6);
                var4.method421(6);
            }
        }
        var4.method427(this.field629.field876 + 64, this.field629.field877 + 850, -30, -50, -30, true);
        if (arg0 != 27243) {
            throw new NullPointerException();
        }
        return var4;
    }
}

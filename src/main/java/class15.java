import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GEKFXIMX")
public class class15 extends class68 {

    @OriginalMember(owner = "client!GEKFXIMX", name = "v", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!GEKFXIMX", name = "w", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!GEKFXIMX", name = "x", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!GEKFXIMX", name = "m", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!GEKFXIMX", name = "n", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!GEKFXIMX", name = "o", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "client!GEKFXIMX", name = "p", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!GEKFXIMX", name = "u", descriptor = "LPQTJDTHH;")
    private class37 field670;

    @OriginalMember(owner = "client!GEKFXIMX", name = "q", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!GEKFXIMX", name = "t", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!GEKFXIMX", name = "r", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!GEKFXIMX", name = "s", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!GEKFXIMX", name = "y", descriptor = "[I")
    public int[] field674;

    @OriginalMember(owner = "client!GEKFXIMX", name = "l", descriptor = "Lclient;")
    public static client field661;

    @OriginalMember(owner = "client!GEKFXIMX", name = "a", descriptor = "(I)LPZYCJUKA;")
    public final class39 method253(int arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field667 != -1) {
            class35 var3 = class35.field1024[this.field667];
            int var4 = var3.field1026;
            int var5 = var3.field1027;
            int var6 = var3.field1028;
            int var7 = client.field503[var6 - var5];
            var2 = field661.field544[var4] >> var5 & var7;
        } else if (this.field668 != -1) {
            var2 = field661.field544[this.field668];
        }
        return var2 < 0 || var2 >= this.field674.length || this.field674[var2] == -1 ? null : class39.method409(this.field674[var2]);
    }

    @OriginalMember(owner = "client!GEKFXIMX", name = "a", descriptor = "(B)LKUGNQTGL;")
    public final class28 method40(byte arg0) {
        int var2 = -1;
        if (this.field670 != null) {
            int var3 = client.field282 - this.field669;
            if (var3 > 100 && this.field670.field1118 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field670.method405(-251, this.field666)) {
                            break label45;
                        }
                        var3 -= this.field670.method405(-251, this.field666);
                        this.field666++;
                    } while (this.field666 < this.field670.field1114);
                    this.field666 -= this.field670.field1118;
                } while (this.field666 >= 0 && this.field666 < this.field670.field1114);
                this.field670 = null;
            }
            this.field669 = client.field282 - var3;
            if (this.field670 != null) {
                var2 = this.field670.field1115[this.field666];
            }
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        class39 var4;
        if (this.field674 == null) {
            var4 = class39.method409(this.field671);
        } else {
            var4 = this.method253(1);
        }
        return var4 == null ? null : var4.method413(this.field672, this.field673, this.field662, this.field663, this.field664, this.field665, var2);
    }

    @OriginalMember(owner = "client!GEKFXIMX", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field671 = arg0;
        this.field672 = arg3;
        this.field673 = arg7;
        this.field662 = arg2;
        this.field663 = arg1;
        this.field664 = arg6;
        this.field665 = arg5;
        if (arg4 != -1) {
            this.field670 = class37.field1113[arg4];
            this.field666 = 0;
            this.field669 = client.field282 - 1;
            if (arg9 && this.field670.field1118 != -1) {
                this.field666 = (int) (Math.random() * (double) this.field670.field1114);
                this.field669 -= (int) (Math.random() * (double) this.field670.method405(-251, this.field666));
            }
        }
        class39 var11 = class39.method409(this.field671);
        if (arg8 != 4) {
            throw new NullPointerException();
        }
        this.field667 = var11.field1135;
        this.field668 = var11.field1150;
        this.field674 = var11.field1182;
    }
}

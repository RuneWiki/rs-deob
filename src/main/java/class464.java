import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class464 {

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "B")
    public byte field6837;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "S")
    public short field6836;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lcg;")
    private class393 field6834;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "B")
    public byte field6835;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lna;")
    public class226 field6833;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final void method2859(int arg0) {
        this.field6834.method2463(this.field6833);
        if (arg0 != 18393) {
            this.method2859(-70);
        }
        this.field6833.method1372(this);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public final void method2860(int arg0) {
        this.field6834.method2463(this.field6833);
        if (arg0 == -30436) {
            this.field6833.method1369(this);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public final void method2861(int arg0) {
        this.field6834.method2463(this.field6833);
        if (arg0 != -24933) {
            this.field6837 = -110;
        }
        this.field6833.method1373(this);
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
    public final void method2862(int arg0) {
        this.field6834.method2463(this.field6833);
        int var2 = -99 % ((76 - arg0) / 38);
        this.field6833.method1370(this);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lcg;Lna;III)V")
    public class464(class393 arg0, class226 arg1, int arg2, int arg3, int arg4) {
        this.field6837 = (byte) arg3;
        this.field6836 = (short) arg2;
        this.field6834 = arg0;
        this.field6835 = (byte) arg4;
        this.field6833 = arg1;
    }
}

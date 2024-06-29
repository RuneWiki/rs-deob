import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class377 {

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "B")
    public byte field5613;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "B")
    public byte field5609;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Lec;")
    public class101 field5612;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "S")
    public short field5611;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "Lnm;")
    private class254 field5610;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public final void method2313(int arg0) {
        this.field5610.method1661(this.field5612);
        this.field5612.method113(this);
        if (arg0 != -21825) {
            this.method2314(-121);
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
    public final void method2314(int arg0) {
        this.field5610.method1661(this.field5612);
        this.field5612.method112(this);
        if (arg0 != 3530) {
            this.field5613 = 108;
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V")
    public final void method2315(int arg0) {
        this.field5610.method1661(this.field5612);
        this.field5612.method116(this);
        if (arg0 != -10573) {
            this.field5612 = (class101) null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
    public final void method2316(int arg0) {
        this.field5610.method1661(this.field5612);
        if (arg0 == 6185) {
            this.field5612.method111(this);
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lnm;Lec;III)V")
    public class377(class254 arg0, class101 arg1, int arg2, int arg3, int arg4) {
        this.field5613 = (byte) arg3;
        this.field5609 = (byte) arg4;
        this.field5612 = arg1;
        this.field5611 = (short) arg2;
        this.field5610 = arg0;
    }
}

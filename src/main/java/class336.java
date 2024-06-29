import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class336 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "B")
    public byte field4850;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lnf;")
    private class256 field4849;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "S")
    public short field4852;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lna;")
    public class50 field4848;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "B")
    public byte field4851;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public final void method2209(byte arg0) {
        if (arg0 <= 119) {
            this.field4851 = 14;
        }
        this.field4849.method1711(this.field4848);
        this.field4848.method353(this);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method2210(int arg0) {
        if (arg0 != 9281) {
            this.field4848 = (class50) null;
        }
        this.field4849.method1711(this.field4848);
        this.field4848.method352(this);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public final void method2211(int arg0) {
        if (arg0 >= 39) {
            this.field4849.method1711(this.field4848);
            this.field4848.method351(this);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lnf;Lna;III)V")
    public class336(class256 arg0, class50 arg1, int arg2, int arg3, int arg4) {
        this.field4850 = (byte) arg3;
        this.field4849 = arg0;
        this.field4852 = (short) arg2;
        this.field4848 = arg1;
        this.field4851 = (byte) arg4;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
    public final void method2212(byte arg0) {
        this.field4849.method1711(this.field4848);
        if (arg0 == 31) {
            this.field4848.method350(this);
        }
    }
}

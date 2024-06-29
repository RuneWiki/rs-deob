import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class143 {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "B")
    public byte field2009;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Lla;")
    public class220 field2006;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "S")
    public short field2007;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lqi;")
    private class458 field2008;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "B")
    public byte field2010;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 5)
    public final void method880(byte arg0) {
        if (arg0 == 49) {
            this.field2008.method2664(this.field2006);
            this.field2006.method878(this);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 18)
    public final void method881(int arg0) {
        if (arg0 != 14753) {
            this.method883(-10);
        }
        this.field2008.method2664(this.field2006);
        this.field2006.method876(this);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 30)
    public final void method882(int arg0) {
        int var2 = 125 / ((35 - arg0) / 57);
        this.field2008.method2664(this.field2006);
        this.field2006.method877(this);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 39)
    public final void method883(int arg0) {
        if (arg0 != -11350) {
            this.method881(18);
        }
        this.field2008.method2664(this.field2006);
        this.field2006.method875(this);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lqi;Lla;III)V", line = 51)
    public class143(class458 arg0, class220 arg1, int arg2, int arg3, int arg4) {
        this.field2009 = (byte) arg3;
        this.field2006 = arg1;
        this.field2007 = (short) arg2;
        this.field2008 = arg0;
        this.field2010 = (byte) arg4;
    }
}

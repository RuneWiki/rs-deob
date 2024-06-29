import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class352 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "S")
    public short field5138;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lks;")
    private class173 field5139;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "B")
    public byte field5136;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lkd;")
    public class340 field5135;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "B")
    public byte field5137;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method2254(int arg0) {
        this.field5139.method1172(this.field5135);
        if (arg0 != 10703) {
            this.method2255((byte) 15);
        }
        this.field5135.method372(this);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public final void method2255(byte arg0) {
        this.field5139.method1172(this.field5135);
        if (arg0 > -74) {
            this.field5136 = 13;
        }
        this.field5135.method371(this);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public final void method2256(byte arg0) {
        int var2 = 56 % ((arg0 - 87) / 36);
        this.field5139.method1172(this.field5135);
        this.field5135.method374(this);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    public final void method2257(byte arg0) {
        this.field5139.method1172(this.field5135);
        if (arg0 < 2) {
            this.field5136 = -108;
        }
        this.field5135.method375(this);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lks;Lkd;III)V")
    public class352(class173 arg0, class340 arg1, int arg2, int arg3, int arg4) {
        this.field5138 = (short) arg2;
        this.field5139 = arg0;
        this.field5136 = (byte) arg4;
        this.field5135 = arg1;
        this.field5137 = (byte) arg3;
    }
}

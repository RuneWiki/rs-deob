import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class212 {

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Lsg;")
    public class226 field2842;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "S")
    public short field2839;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "B")
    public byte field2838;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lhj;")
    private class338 field2841;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "B")
    public byte field2840;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public final void method1367(int arg0) {
        if (arg0 != -20221) {
            this.method1367(2);
        }
        this.field2841.method2148(this.field2842);
        this.field2842.method1432(this);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public final void method1368(int arg0) {
        if (arg0 == 10286) {
            this.field2841.method2148(this.field2842);
            this.field2842.method1430(this);
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
    public final void method1369(int arg0) {
        if (arg0 <= 123) {
            this.method1367(82);
        }
        this.field2841.method2148(this.field2842);
        this.field2842.method1434(this);
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
    public final void method1370(int arg0) {
        this.field2841.method2148(this.field2842);
        if (arg0 < -64) {
            this.field2842.method1431(this);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lhj;Lsg;III)V")
    public class212(class338 arg0, class226 arg1, int arg2, int arg3, int arg4) {
        this.field2842 = arg1;
        this.field2839 = (short) arg2;
        this.field2838 = (byte) arg4;
        this.field2841 = arg0;
        this.field2840 = (byte) arg3;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class224 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "B")
    public byte field3141;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "B")
    public byte field3140;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lum;")
    public class307 field3143;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "S")
    public short field3142;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lao;")
    private class157 field3139;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 6)
    public final void method1496(int arg0) {
        this.field3139.method980(this.field3143);
        if (arg0 == -31221) {
            this.field3143.method1545(this);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 17)
    public final void method1497(int arg0) {
        this.field3139.method980(this.field3143);
        if (arg0 != 21953) {
            this.method1498(-120);
        }
        this.field3143.method1549(this);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 28)
    public final void method1498(int arg0) {
        this.field3139.method980(this.field3143);
        if (arg0 < 51) {
            this.field3142 = -126;
        }
        this.field3143.method1544(this);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 41)
    public final void method1499(byte arg0) {
        this.field3139.method980(this.field3143);
        if (arg0 >= 83) {
            this.field3143.method1546(this);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lao;Lum;III)V", line = 52)
    public class224(class157 arg0, class307 arg1, int arg2, int arg3, int arg4) {
        this.field3141 = (byte) arg4;
        this.field3140 = (byte) arg3;
        this.field3143 = arg1;
        this.field3142 = (short) arg2;
        this.field3139 = arg0;
    }
}

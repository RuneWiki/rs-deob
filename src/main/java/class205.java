import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class205 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "B")
    public byte field2496;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "S")
    public short field2494;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lh;")
    private class327 field2495;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "B")
    public byte field2493;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lva;")
    public class415 field2497;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final void method1260(int arg0) {
        if (arg0 != 228) {
            this.method1262(5);
        }
        this.field2495.method2052(this.field2497);
        this.field2497.method48(this);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public final void method1261(byte arg0) {
        this.field2495.method2052(this.field2497);
        if (arg0 != 97) {
            this.field2496 = 80;
        }
        this.field2497.method47(this);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public final void method1262(int arg0) {
        if (arg0 == -25033) {
            this.field2495.method2052(this.field2497);
            this.field2497.method45(this);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public final void method1263(int arg0) {
        this.field2495.method2052(this.field2497);
        if (arg0 != -27802) {
            this.field2497 = (class415) null;
        }
        this.field2497.method44(this);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lh;Lva;III)V")
    public class205(class327 arg0, class415 arg1, int arg2, int arg3, int arg4) {
        this.field2496 = (byte) arg3;
        this.field2494 = (short) arg2;
        this.field2495 = arg0;
        this.field2493 = (byte) arg4;
        this.field2497 = arg1;
    }
}

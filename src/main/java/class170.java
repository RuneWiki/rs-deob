import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class170 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Lfu;")
    private class42 field2459;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "B")
    public byte field2462;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lpc;")
    public class171 field2460;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "S")
    public short field2463;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "B")
    public byte field2461;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
    public final void method1235(boolean arg0) {
        if (!arg0) {
            this.field2459.method411(this.field2460);
            this.field2460.method462(this);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public final void method1236(int arg0) {
        this.field2459.method411(this.field2460);
        this.field2460.method465(this);
        if (arg0 != 15716) {
            this.method1236(1);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public final void method1237(int arg0) {
        if (arg0 != -24672) {
            this.method1237(78);
        }
        this.field2459.method411(this.field2460);
        this.field2460.method466(this);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public final void method1238(byte arg0) {
        this.field2459.method411(this.field2460);
        int var2 = 91 / ((-arg0 - 29) / 41);
        this.field2460.method463(this);
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lfu;Lpc;III)V")
    public class170(class42 arg0, class171 arg1, int arg2, int arg3, int arg4) {
        this.field2459 = arg0;
        this.field2462 = (byte) arg4;
        this.field2460 = arg1;
        this.field2463 = (short) arg2;
        this.field2461 = (byte) arg3;
    }
}

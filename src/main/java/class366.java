import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class366 {

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Lbf;")
    private class344 field5041;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "S")
    public short field5039;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "B")
    public byte field5040;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "B")
    public byte field5042;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lfg;")
    public class74 field5038;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 4)
    public final void method2234(int arg0) {
        this.field5041.method1962(this.field5038);
        if (arg0 != -20741) {
            this.method2236(70);
        }
        this.field5038.method485(this);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 15)
    public final void method2235(int arg0) {
        if (arg0 != -9047) {
            this.field5038 = (class74) null;
        }
        this.field5041.method1962(this.field5038);
        this.field5038.method481(this);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 27)
    public final void method2236(int arg0) {
        this.field5041.method1962(this.field5038);
        if (arg0 > -97) {
            this.method2237(true);
        }
        this.field5038.method482(this);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 40)
    public final void method2237(boolean arg0) {
        if (!arg0) {
            this.method2236(-124);
        }
        this.field5041.method1962(this.field5038);
        this.field5038.method483(this);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lbf;Lfg;III)V", line = 52)
    public class366(class344 arg0, class74 arg1, int arg2, int arg3, int arg4) {
        this.field5041 = arg0;
        this.field5039 = (short) arg2;
        this.field5040 = (byte) arg4;
        this.field5042 = (byte) arg3;
        this.field5038 = arg1;
    }
}

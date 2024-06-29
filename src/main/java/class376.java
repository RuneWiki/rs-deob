import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class376 {

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "S")
    public short field5224;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lq;")
    public class205 field5221;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "B")
    public byte field5222;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lmm;")
    private class357 field5223;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "B")
    public byte field5220;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 5)
    public final void method2349(byte arg0) {
        this.field5223.method2202(this.field5221);
        this.field5221.method575(this);
        if (arg0 != -125) {
            this.method2352(-67);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 16)
    public final void method2350(boolean arg0) {
        if (!arg0) {
            this.field5222 = 33;
        }
        this.field5223.method2202(this.field5221);
        this.field5221.method572(this);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V", line = 28)
    public final void method2351(byte arg0) {
        this.field5223.method2202(this.field5221);
        if (arg0 > -43) {
            this.method2351((byte) -93);
        }
        this.field5221.method577(this);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 41)
    public final void method2352(int arg0) {
        if (arg0 == -22955) {
            this.field5223.method2202(this.field5221);
            this.field5221.method573(this);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lmm;Lq;III)V", line = 51)
    public class376(class357 arg0, class205 arg1, int arg2, int arg3, int arg4) {
        this.field5224 = (short) arg2;
        this.field5221 = arg1;
        this.field5222 = (byte) arg4;
        this.field5223 = arg0;
        this.field5220 = (byte) arg3;
    }
}

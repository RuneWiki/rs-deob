import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class126 extends class78 {

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "[B")
    public byte[] field3022;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Z")
    public boolean field3021;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lke;)Lta;")
    public final class126 method1005(class74 arg0) {
        this.field3022 = arg0.method703(-62, this.field3022);
        this.field3019 = arg0.method702(-65, this.field3019);
        if (this.field3023 == this.field3020) {
            this.field3020 = this.field3023 = arg0.method698(this.field3020, -80);
        } else {
            this.field3020 = arg0.method698(this.field3020, -65);
            this.field3023 = arg0.method698(this.field3023, -109);
            if (this.field3023 == this.field3020) {
                this.field3020--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[BII)V")
    public class126(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3019 = arg0;
        this.field3022 = arg1;
        this.field3020 = arg2;
        this.field3023 = arg3;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[BIIZ)V")
    public class126(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3019 = arg0;
        this.field3022 = arg1;
        this.field3020 = arg2;
        this.field3023 = arg3;
        this.field3021 = arg4;
    }
}

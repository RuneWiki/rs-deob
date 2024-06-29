import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class250 extends class123 {

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "[B")
    public byte[] field4361;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Z")
    public boolean field4360;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljj;)Lik;")
    public final class250 method1672(class102 arg0) {
        this.field4361 = arg0.method686(this.field4361, (byte) 81);
        this.field4357 = arg0.method689(this.field4357, -44);
        if (this.field4359 == this.field4358) {
            this.field4359 = this.field4358 = arg0.method688((byte) -99, this.field4359);
        } else {
            this.field4359 = arg0.method688((byte) -100, this.field4359);
            this.field4358 = arg0.method688((byte) -99, this.field4358);
            if (this.field4359 == this.field4358) {
                this.field4359--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I[BII)V")
    public class250(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4357 = arg0;
        this.field4361 = arg1;
        this.field4359 = arg2;
        this.field4358 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I[BIIZ)V")
    public class250(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4357 = arg0;
        this.field4361 = arg1;
        this.field4359 = arg2;
        this.field4358 = arg3;
        this.field4360 = arg4;
    }
}

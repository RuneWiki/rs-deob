import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class202 extends class56 {

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[B")
    public byte[] field3910;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
    public boolean field3909;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljc;)Lwc;")
    public final class202 method1317(class85 arg0) {
        this.field3910 = arg0.method435(this.field3910, (byte) 108);
        this.field3912 = arg0.method430(this.field3912, true);
        if (this.field3911 == this.field3908) {
            this.field3908 = this.field3911 = arg0.method429((byte) -32, this.field3908);
        } else {
            this.field3908 = arg0.method429((byte) -120, this.field3908);
            this.field3911 = arg0.method429((byte) -21, this.field3911);
            if (this.field3911 == this.field3908) {
                this.field3908--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I[BII)V")
    public class202(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3912 = arg0;
        this.field3910 = arg1;
        this.field3908 = arg2;
        this.field3911 = arg3;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class202(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3912 = arg0;
        this.field3910 = arg1;
        this.field3908 = arg2;
        this.field3911 = arg3;
        this.field3909 = arg4;
    }
}

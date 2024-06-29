import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class115 extends class107 {

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "[B")
    public byte[] field2842;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Loe;)Lta;", line = 7)
    public final class115 method919(class89 arg0) {
        this.field2842 = arg0.method682(this.field2842, (byte) 90);
        this.field2844 = arg0.method684((byte) 32, this.field2844);
        if (this.field2843 == this.field2841) {
            this.field2843 = this.field2841 = arg0.method681((byte) -90, this.field2843);
        } else {
            this.field2843 = arg0.method681((byte) -69, this.field2843);
            this.field2841 = arg0.method681((byte) -49, this.field2841);
            if (this.field2843 == this.field2841) {
                this.field2843--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class115(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2844 = arg0;
        this.field2842 = arg1;
        this.field2843 = arg2;
        this.field2841 = arg3;
    }
}

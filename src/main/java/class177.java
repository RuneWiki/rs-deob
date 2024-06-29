import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class177 extends class55 {

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[B")
    public byte[] field3109;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Z")
    public boolean field3110;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lph;)Lk;")
    public final class177 method1188(class32 arg0) {
        this.field3109 = arg0.method183((byte) -127, this.field3109);
        this.field3111 = arg0.method184(this.field3111, -100);
        if (this.field3108 == this.field3107) {
            this.field3107 = this.field3108 = arg0.method189(this.field3107, (byte) 127);
        } else {
            this.field3107 = arg0.method189(this.field3107, (byte) 127);
            this.field3108 = arg0.method189(this.field3108, (byte) 127);
            if (this.field3108 == this.field3107) {
                this.field3107--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[BII)V")
    public class177(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3111 = arg0;
        this.field3109 = arg1;
        this.field3107 = arg2;
        this.field3108 = arg3;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[BIIZ)V")
    public class177(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3111 = arg0;
        this.field3109 = arg1;
        this.field3107 = arg2;
        this.field3108 = arg3;
        this.field3110 = arg4;
    }
}

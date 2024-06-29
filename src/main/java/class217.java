import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class217 extends class54 {

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "[B")
    public byte[] field3136;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Z")
    public boolean field3137;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lwd;)Ljs;", line = 5)
    public final class217 method1483(class179 arg0) {
        this.field3136 = arg0.method1259(this.field3136, -111);
        this.field3138 = arg0.method1260(-22951, this.field3138);
        if (this.field3135 == this.field3134) {
            this.field3135 = this.field3134 = arg0.method1258(this.field3135, (byte) 83);
        } else {
            this.field3135 = arg0.method1258(this.field3135, (byte) 83);
            this.field3134 = arg0.method1258(this.field3134, (byte) 83);
            if (this.field3135 == this.field3134) {
                this.field3135--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class217(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3138 = arg0;
        this.field3136 = arg1;
        this.field3135 = arg2;
        this.field3134 = arg3;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class217(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3138 = arg0;
        this.field3136 = arg1;
        this.field3135 = arg2;
        this.field3134 = arg3;
        this.field3137 = arg4;
    }
}

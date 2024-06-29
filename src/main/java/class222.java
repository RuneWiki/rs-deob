import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class222 extends class128 {

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "[B")
    public byte[] field3974;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Z")
    public boolean field3973;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lm;)Lfi;")
    public final class222 method1512(class38 arg0) {
        this.field3974 = arg0.method314(this.field3974, false);
        this.field3976 = arg0.method315(115, this.field3976);
        if (this.field3975 == this.field3972) {
            this.field3975 = this.field3972 = arg0.method317(this.field3975, 8586);
        } else {
            this.field3975 = arg0.method317(this.field3975, 8586);
            this.field3972 = arg0.method317(this.field3972, 8586);
            if (this.field3975 == this.field3972) {
                this.field3975--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I[BII)V")
    public class222(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3976 = arg0;
        this.field3974 = arg1;
        this.field3975 = arg2;
        this.field3972 = arg3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I[BIIZ)V")
    public class222(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3976 = arg0;
        this.field3974 = arg1;
        this.field3975 = arg2;
        this.field3972 = arg3;
        this.field3973 = arg4;
    }
}
